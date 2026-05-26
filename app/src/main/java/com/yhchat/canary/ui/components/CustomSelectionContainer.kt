package com.yhchat.canary.ui.components

import android.view.ActionMode
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.platform.LocalTextToolbar
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.platform.TextToolbar
import androidx.compose.ui.platform.TextToolbarStatus

/**
 * 自定义SelectionContainer，支持在文本选择菜单中添加额外操作
 */
@Composable
fun MessageSelectionContainer(
    onQuote: (() -> Unit)? = null,
    onEdit: (() -> Unit)? = null,
    onDelete: (() -> Unit)? = null,
    onPlusOne: (() -> Unit)? = null,
    onForward: (() -> Unit)? = null,
    onMultiSelect: (() -> Unit)? = null,
    onOpenInInternalBrowser: (() -> Unit)? = null,
    content: @Composable () -> Unit
) {
    val view = LocalView.current
    val defaultToolbar = LocalTextToolbar.current
    
    val customToolbar = remember(view, defaultToolbar, onQuote, onEdit, onDelete, onPlusOne, onForward, onMultiSelect, onOpenInInternalBrowser) {
        CustomTextToolbar(
            view = view,
            defaultToolbar = defaultToolbar,
            onQuote = onQuote,
            onEdit = onEdit,
            onDelete = onDelete,
            onPlusOne = onPlusOne,
            onForward = onForward,
            onMultiSelect = onMultiSelect,
            onOpenInInternalBrowser = onOpenInInternalBrowser
        )
    }
    
    CompositionLocalProvider(LocalTextToolbar provides customToolbar) {
        SelectionContainer {
            content()
        }
    }
}

/**
 * 自定义文本工具栏
 */
private class CustomTextToolbar(
    private val view: View,
    private val defaultToolbar: TextToolbar,
    private val onQuote: (() -> Unit)?,
    private val onEdit: (() -> Unit)?,
    private val onDelete: (() -> Unit)?,
    private val onPlusOne: (() -> Unit)?,
    private val onForward: (() -> Unit)?,
    private val onMultiSelect: (() -> Unit)?,
    private val onOpenInInternalBrowser: (() -> Unit)?
) : TextToolbar {
    
    private var actionMode: ActionMode? = null
    private var copyCallback: (() -> Unit)? = null
    private var selectAllCallback: (() -> Unit)? = null
    // 保存选区矩形，用于浮动工具栏定位
    private var selectionRect: Rect = Rect.Zero
    
    override val status: TextToolbarStatus
        get() = if (actionMode != null) TextToolbarStatus.Shown else TextToolbarStatus.Hidden
    
    override fun showMenu(
        rect: Rect,
        onCopyRequested: (() -> Unit)?,
        onPasteRequested: (() -> Unit)?,
        onCutRequested: (() -> Unit)?,
        onSelectAllRequested: (() -> Unit)?
    ) {
        // 保存系统回调和选区位置
        copyCallback = onCopyRequested
        selectAllCallback = onSelectAllRequested
        selectionRect = rect

        // 如果已有ActionMode，刷新位置即可
        actionMode?.let {
            it.invalidateContentRect()
            return
        }
        
        // 使用Callback2以支持onGetContentRect，让浮动工具栏定位在选中文本附近
        actionMode = view.startActionMode(object : ActionMode.Callback2() {
            override fun onCreateActionMode(mode: ActionMode, menu: Menu): Boolean {
                // 添加系统操作
                onCopyRequested?.let {
                    menu.add(0, android.R.id.copy, 0, "复制")
                        .setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS)
                }
                
                onSelectAllRequested?.let {
                    menu.add(0, android.R.id.selectAll, 1, "全选")
                        .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
                }
                
                // 添加自定义操作
                onQuote?.let {
                    menu.add(0, MENU_ITEM_QUOTE, 10, "引用")
                        .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
                }
                
                onPlusOne?.let {
                    menu.add(0, MENU_ITEM_PLUS_ONE, 11, "+1")
                        .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
                }
                
                onEdit?.let {
                    menu.add(0, MENU_ITEM_EDIT, 12, "编辑")
                        .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
                }
                
                onForward?.let {
                    menu.add(0, MENU_ITEM_FORWARD, 13, "转发")
                        .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
                }
                
                onMultiSelect?.let {
                    menu.add(0, MENU_ITEM_MULTI_SELECT, 14, "多选")
                        .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM)
                }

                onOpenInInternalBrowser?.let {
                    menu.add(0, MENU_ITEM_OPEN_IN_INTERNAL_BROWSER, 15, "在内置浏览器中打开")
                        .setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER)
                }
                
                onDelete?.let {
                    menu.add(0, MENU_ITEM_DELETE, 16, "撤回")
                        .setShowAsAction(MenuItem.SHOW_AS_ACTION_NEVER)
                }
                
                return true
            }
            
            override fun onPrepareActionMode(mode: ActionMode, menu: Menu): Boolean = false
            
            override fun onActionItemClicked(mode: ActionMode, item: MenuItem): Boolean {
                return when (item.itemId) {
                    android.R.id.copy -> {
                        copyCallback?.invoke()
                        mode.finish()
                        true
                    }
                    android.R.id.selectAll -> {
                        selectAllCallback?.invoke()
                        false // 不关闭菜单
                    }
                    MENU_ITEM_QUOTE -> {
                        onQuote?.invoke()
                        mode.finish()
                        true
                    }
                    MENU_ITEM_PLUS_ONE -> {
                        onPlusOne?.invoke()
                        mode.finish()
                        true
                    }
                    MENU_ITEM_EDIT -> {
                        onEdit?.invoke()
                        mode.finish()
                        true
                    }
                    MENU_ITEM_FORWARD -> {
                        onForward?.invoke()
                        mode.finish()
                        true
                    }
                    MENU_ITEM_MULTI_SELECT -> {
                        onMultiSelect?.invoke()
                        mode.finish()
                        true
                    }
                    MENU_ITEM_OPEN_IN_INTERNAL_BROWSER -> {
                        onOpenInInternalBrowser?.invoke()
                        mode.finish()
                        true
                    }
                    MENU_ITEM_DELETE -> {
                        onDelete?.invoke()
                        mode.finish()
                        true
                    }
                    else -> false
                }
            }
            
            override fun onDestroyActionMode(mode: ActionMode) {
                actionMode = null
                copyCallback = null
                selectAllCallback = null
            }

            override fun onGetContentRect(mode: ActionMode, view: View, outRect: android.graphics.Rect) {
                // 将Compose的选区矩形传给系统，让浮动工具栏定位在选中文本上方
                outRect.set(
                    selectionRect.left.toInt(),
                    selectionRect.top.toInt(),
                    selectionRect.right.toInt(),
                    selectionRect.bottom.toInt()
                )
            }
        }, ActionMode.TYPE_FLOATING)
    }
    
    override fun hide() {
        actionMode?.finish()
        actionMode = null
    }
    
    companion object {
        private const val MENU_ITEM_QUOTE = 1001
        private const val MENU_ITEM_PLUS_ONE = 1002
        private const val MENU_ITEM_EDIT = 1003
        private const val MENU_ITEM_FORWARD = 1004
        private const val MENU_ITEM_MULTI_SELECT = 1005
        private const val MENU_ITEM_DELETE = 1006
        private const val MENU_ITEM_OPEN_IN_INTERNAL_BROWSER = 1007
    }
}
