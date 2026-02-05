package com.yhchat.canary.ui.components

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.grid.LazyGridState
import androidx.compose.runtime.*
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection
import androidx.compose.ui.input.nestedscroll.NestedScrollSource

/**
 * 滚动感知导航栏控制器
 * 
 * 模仿 LibChecker 的 HideBottomViewOnScrollBehavior
 * 向上滚动时隐藏导航栏，向下滚动时显示导航栏
 */
@Composable
fun rememberScrollAwareNavigationState(): ScrollAwareNavigationState {
    return remember { ScrollAwareNavigationState() }
}

/**
 * 滚动感知导航栏状态
 */
class ScrollAwareNavigationState {
    private val _isVisible = mutableStateOf(true)
    val isVisible: Boolean by _isVisible
    
    private var lastScrollOffset = 0f
    private var accumulatedScroll = 0f
    
    // 滚动阈值（像素）
    private val scrollThreshold = 50f
    
    /**
     * 创建嵌套滚动连接
     */
    fun nestedScrollConnection() = object : NestedScrollConnection {
        override fun onPreScroll(available: Offset, source: NestedScrollSource): Offset {
            val delta = available.y
            accumulatedScroll += delta
            
            // 向上滚动（delta < 0）且累积滚动超过阈值时隐藏导航栏
            if (accumulatedScroll < -scrollThreshold && _isVisible.value) {
                _isVisible.value = false
                accumulatedScroll = 0f
            }
            // 向下滚动（delta > 0）且累积滚动超过阈值时显示导航栏
            else if (accumulatedScroll > scrollThreshold && !_isVisible.value) {
                _isVisible.value = true
                accumulatedScroll = 0f
            }
            
            return Offset.Zero
        }
    }
    
    /**
     * 显示导航栏
     */
    fun show() {
        _isVisible.value = true
        accumulatedScroll = 0f
    }
    
    /**
     * 隐藏导航栏
     */
    fun hide() {
        _isVisible.value = false
        accumulatedScroll = 0f
    }
    
    /**
     * 切换导航栏可见性
     */
    fun toggle() {
        _isVisible.value = !_isVisible.value
        accumulatedScroll = 0f
    }
}

/**
 * 监听 LazyListState 的滚动状态并自动控制导航栏
 */
@Composable
fun observeScrollForNavigation(listState: LazyListState, navigationState: ScrollAwareNavigationState) {
    var previousIndex by remember { mutableIntStateOf(listState.firstVisibleItemIndex) }
    var previousScrollOffset by remember { mutableIntStateOf(listState.firstVisibleItemScrollOffset) }
    
    LaunchedEffect(listState.firstVisibleItemIndex, listState.firstVisibleItemScrollOffset) {
        val currentIndex = listState.firstVisibleItemIndex
        val currentScrollOffset = listState.firstVisibleItemScrollOffset
        
        if (previousIndex != currentIndex || previousScrollOffset != currentScrollOffset) {
            // 判断滚动方向
            val isScrollingDown = currentIndex > previousIndex || 
                (currentIndex == previousIndex && currentScrollOffset > previousScrollOffset)
            val isScrollingUp = currentIndex < previousIndex || 
                (currentIndex == previousIndex && currentScrollOffset < previousScrollOffset)
            
            // 向下滚动时隐藏导航栏
            if (isScrollingDown && navigationState.isVisible && currentIndex > 2) {
                navigationState.hide()
            }
            // 向上滚动时显示导航栏
            else if (isScrollingUp && !navigationState.isVisible) {
                navigationState.show()
            }
            // 在列表顶部时始终显示导航栏
            else if (currentIndex <= 1 && !navigationState.isVisible) {
                navigationState.show()
            }
            
            previousIndex = currentIndex
            previousScrollOffset = currentScrollOffset
        }
    }
}

/**
 * 监听 LazyGridState 的滚动状态并自动控制导航栏
 */
@Composable
fun observeScrollForNavigation(gridState: LazyGridState, navigationState: ScrollAwareNavigationState) {
    var previousIndex by remember { mutableIntStateOf(gridState.firstVisibleItemIndex) }
    var previousScrollOffset by remember { mutableIntStateOf(gridState.firstVisibleItemScrollOffset) }
    
    LaunchedEffect(gridState.firstVisibleItemIndex, gridState.firstVisibleItemScrollOffset) {
        val currentIndex = gridState.firstVisibleItemIndex
        val currentScrollOffset = gridState.firstVisibleItemScrollOffset
        
        if (previousIndex != currentIndex || previousScrollOffset != currentScrollOffset) {
            // 判断滚动方向
            val isScrollingDown = currentIndex > previousIndex || 
                (currentIndex == previousIndex && currentScrollOffset > previousScrollOffset)
            val isScrollingUp = currentIndex < previousIndex || 
                (currentIndex == previousIndex && currentScrollOffset < previousScrollOffset)
            
            // 向下滚动时隐藏导航栏
            if (isScrollingDown && navigationState.isVisible && currentIndex > 3) {
                navigationState.hide()
            }
            // 向上滚动时显示导航栏
            else if (isScrollingUp && !navigationState.isVisible) {
                navigationState.show()
            }
            // 在列表顶部时始终显示导航栏
            else if (currentIndex <= 2 && !navigationState.isVisible) {
                navigationState.show()
            }
            
            previousIndex = currentIndex
            previousScrollOffset = currentScrollOffset
        }
    }
}

/**
 * 监听 ScrollState 的滚动状态并自动控制导航栏
 * 用于 Column + verticalScroll
 */
@Composable
fun observeScrollForNavigation(scrollState: ScrollState, navigationState: ScrollAwareNavigationState) {
    var previousScrollOffset by remember { mutableIntStateOf(scrollState.value) }
    
    LaunchedEffect(scrollState.value) {
        val currentScrollOffset = scrollState.value
        
        if (previousScrollOffset != currentScrollOffset) {
            // 判断滚动方向
            val isScrollingDown = currentScrollOffset > previousScrollOffset
            val isScrollingUp = currentScrollOffset < previousScrollOffset
            
            // 向下滚动时隐藏导航栏（超过100px）
            if (isScrollingDown && navigationState.isVisible && currentScrollOffset > 100) {
                navigationState.hide()
            }
            // 向上滚动时显示导航栏
            else if (isScrollingUp && !navigationState.isVisible) {
                navigationState.show()
            }
            // 在顶部时始终显示导航栏
            else if (currentScrollOffset <= 50 && !navigationState.isVisible) {
                navigationState.show()
            }
            
            previousScrollOffset = currentScrollOffset
        }
    }
}
