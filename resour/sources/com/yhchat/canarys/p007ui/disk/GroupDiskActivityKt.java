package com.yhchat.canarys.p007ui.disk;

import android.content.Context;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.widget.Toast;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.HomeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.DiskFile;
import com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserActivity;
import com.yhchat.canarys.service.FileDownloadService;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import okhttp3.internal.p011ws.WebSocketProtocol;

/* compiled from: GroupDiskActivity.kt */
@Metadata(m168d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a2\u0006\u0002\u0010\t\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002\u001a;\u0010\u000f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003\u00a2\u0006\u0002\u0010\u0012\u001a/\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u00a2\u0006\u0002\u0010\u0017\u001aM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u00a2\u0006\u0002\u0010\u001c\u001a1\u0010\u001d\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u00a2\u0006\u0002\u0010\u001e\u001a7\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00032\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u00a2\u0006\u0002\u0010!\u001a\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0002\u00a8\u0006%\u00b2\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002\u00b2\u0006\n\u0010(\u001a\u00020)X\u008a\u008e\u0002\u00b2\u0006\n\u0010*\u001a\u00020)X\u008a\u008e\u0002\u00b2\u0006\f\u0010+\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002\u00b2\u0006\n\u0010,\u001a\u00020)X\u008a\u008e\u0002\u00b2\u0006\n\u0010-\u001a\u00020)X\u008a\u008e\u0002\u00b2\u0006\f\u0010.\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002\u00b2\u0006\n\u0010/\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u00100\u001a\u00020\u0003X\u008a\u008e\u0002"}, m169d2 = {"GroupDiskScreen", "", "groupId", "", "groupName", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "downloadFileWithService", "context", "Landroid/content/Context;", "file", "Lcom/yhchat/canarys/data/model/DiskFile;", "DiskFileCard", "onClick", "onLongClick", "(Lcom/yhchat/canarys/data/model/DiskFile;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CreateFolderDialog", "onConfirm", "Lkotlin/Function1;", "onDismiss", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FileActionDialog", "onRename", "onDelete", "onDownload", "(Lcom/yhchat/canarys/data/model/DiskFile;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DownloadConfirmDialog", "(Lcom/yhchat/canarys/data/model/DiskFile;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "RenameFileDialog", "currentName", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "formatFileSize", "bytes", "", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/disk/GroupDiskUiState;", "showCreateFolderDialog", "", "showRenameDialog", "selectedFile", "showFileMenu", "showDownloadConfirmDialog", "fileToDownload", "folderName", "newName"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class GroupDiskActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateFolderDialog$lambda$6(Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        CreateFolderDialog(function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiskFileCard$lambda$1(DiskFile diskFile, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DiskFileCard(diskFile, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadConfirmDialog$lambda$3(DiskFile diskFile, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        DownloadConfirmDialog(diskFile, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionDialog$lambda$2(DiskFile diskFile, Function0 function0, Function0 function02, Function0 function03, Function0 function04, int i, Composer composer, int i2) {
        FileActionDialog(diskFile, function0, function02, function03, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$38(String str, String str2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GroupDiskScreen(str, str2, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RenameFileDialog$lambda$6(String str, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        RenameFileDialog(str, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x070d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GroupDiskScreen(final java.lang.String r32, final java.lang.String r33, final kotlin.jvm.functions.Function0<kotlin.Unit> r34, androidx.compose.p000ui.Modifier r35, androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 1844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.GroupDiskActivityKt.GroupDiskScreen(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroupDiskUiState GroupDiskScreen$lambda$2(State<GroupDiskUiState> state) {
        return (GroupDiskUiState) state.getValue();
    }

    private static final boolean GroupDiskScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupDiskScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GroupDiskScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupDiskScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final DiskFile GroupDiskScreen$lambda$10(MutableState<DiskFile> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean GroupDiskScreen$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GroupDiskScreen$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GroupDiskScreen$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GroupDiskScreen$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final DiskFile GroupDiskScreen$lambda$19(MutableState<DiskFile> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$22$0(GroupDiskViewModel $viewModel, Function0 $onBackClick, State $uiState$delegate) {
        Breadcrumb parentBreadcrumb;
        if (GroupDiskScreen$lambda$2($uiState$delegate).getCurrentFolderId() != 0) {
            if (!GroupDiskScreen$lambda$2($uiState$delegate).getBreadcrumbs().isEmpty() && (parentBreadcrumb = (Breadcrumb) CollectionsKt.lastOrNull(CollectionsKt.dropLast(GroupDiskScreen$lambda$2($uiState$delegate).getBreadcrumbs(), 1))) != null) {
                $viewModel.navigateToFolder(parentBreadcrumb.getId());
            } else {
                $viewModel.navigateToFolder(0L);
            }
        } else {
            $onBackClick.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$23$0(GroupDiskViewModel $viewModel, Context $context, String $groupId, Uri uri) {
        if (uri != null) {
            $viewModel.uploadFile($context, uri, $groupId);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$24(final String $groupName, final Function0 $onBackClick, final Context $context, final String $groupId, final ManagedActivityResultLauncher $filePickerLauncher, final State $uiState$delegate, final MutableState $showCreateFolderDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C156@5405L56,157@5496L286,165@5810L1242,155@5370L1696:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(999353072, $changed, -1, "com.yhchat.canarys.ui.disk.GroupDiskScreen.<anonymous> (GroupDiskActivity.kt:155)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(1785527476, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.GroupDiskScreen$lambda$24$0($groupName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1982045770, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.GroupDiskScreen$lambda$24$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(476378079, true, new Function3() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupDiskActivityKt.GroupDiskScreen$lambda$24$2($context, $groupId, $groupName, $filePickerLauncher, $uiState$delegate, $showCreateFolderDialog$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$24$0(String $groupName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C156@5407L52:GroupDiskActivity.kt#kdr2ae");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1785527476, $changed, -1, "com.yhchat.canarys.ui.disk.GroupDiskScreen.<anonymous>.<anonymous> (GroupDiskActivity.kt:156)");
            }
            TextKt.m3359Text4IGK_g($groupName + " \u7684\u7f51\u76d8", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$24$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C158@5518L246:GroupDiskActivity.kt#kdr2ae");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1982045770, $changed, -1, "com.yhchat.canarys.ui.disk.GroupDiskScreen.<anonymous>.<anonymous> (GroupDiskActivity.kt:158)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11234getLambda$828970925$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$24$2(final Context $context, final String $groupId, final String $groupName, final ManagedActivityResultLauncher $filePickerLauncher, State $uiState$delegate, final MutableState $showCreateFolderDialog$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C167@5878L112,166@5832L435,178@6334L33,177@6288L365,187@6720L36,186@6674L360:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(476378079, $changed, -1, "com.yhchat.canarys.ui.disk.GroupDiskScreen.<anonymous>.<anonymous> (GroupDiskActivity.kt:166)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1762164465, "CC(remember):GroupDiskActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($groupId) | $composer.changed($groupName);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupDiskActivityKt.GroupDiskScreen$lambda$24$2$0$0($context, $groupId, $groupName);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, !GroupDiskScreen$lambda$2($uiState$delegate).isLoading(), null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11236getLambda$886338078$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            ComposerKt.sourceInformationMarkerStart($composer, -1762149952, "CC(remember):GroupDiskActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupDiskActivityKt.GroupDiskScreen$lambda$24$2$1$0($showCreateFolderDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue2, null, !GroupDiskScreen$lambda$2($uiState$delegate).isLoading(), null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.getLambda$1501298315$app_debug(), $composer, 196614, 26);
            ComposerKt.sourceInformationMarkerStart($composer, -1762137597, "CC(remember):GroupDiskActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($filePickerLauncher);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupDiskActivityKt.GroupDiskScreen$lambda$24$2$2$0($filePickerLauncher);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue3, null, !GroupDiskScreen$lambda$2($uiState$delegate).isUploading(), null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.getLambda$464287914$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$24$2$0$0(Context $context, String $groupId, String $groupName) {
        WebDAVBrowserActivity.INSTANCE.start($context, $groupId, $groupName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$24$2$1$0(MutableState $showCreateFolderDialog$delegate) {
        GroupDiskScreen$lambda$5($showCreateFolderDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$24$2$2$0(ManagedActivityResultLauncher $filePickerLauncher) {
        $filePickerLauncher.launch("*/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$25(final GroupDiskViewModel $viewModel, final String $groupId, State $uiState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-135390387, $changed, -1, "com.yhchat.canarys.ui.disk.GroupDiskScreen.<anonymous> (GroupDiskActivity.kt:199)");
            }
            if (GroupDiskScreen$lambda$2($uiState$delegate).isLoading() || GroupDiskScreen$lambda$2($uiState$delegate).isUploading()) {
                $composer.startReplaceGroup(-447781291);
            } else {
                $composer.startReplaceGroup(-440660219);
                ComposerKt.sourceInformation($composer, "201@7241L32,200@7189L176");
                ComposerKt.sourceInformationMarkerStart($composer, -1261138771, "CC(remember):GroupDiskActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($groupId);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda34
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupDiskActivityKt.GroupDiskScreen$lambda$25$0$0($viewModel, $groupId);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                FloatingActionButtonKt.m2791FloatingActionButtonXz6DiA((Function0) objRememberedValue, null, null, 0L, 0L, null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11235getLambda$858799792$app_debug(), $composer, 12582912, WebSocketProtocol.PAYLOAD_SHORT);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$25$0$0(GroupDiskViewModel $viewModel, String $groupId) {
        GroupDiskViewModel.loadFiles$default($viewModel, $groupId, 0L, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05a7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x060b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupDiskScreen$lambda$26(final androidx.compose.runtime.State r102, final com.yhchat.canarys.p007ui.disk.GroupDiskViewModel r103, final java.lang.String r104, final androidx.compose.runtime.MutableState r105, final androidx.compose.runtime.MutableState r106, final androidx.compose.runtime.MutableState r107, final androidx.compose.runtime.MutableState r108, androidx.compose.foundation.layout.PaddingValues r109, androidx.compose.runtime.Composer r110, int r111) {
        /*
            Method dump skipped, instructions count: 2776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.GroupDiskActivityKt.GroupDiskScreen$lambda$26(androidx.compose.runtime.State, com.yhchat.canarys.ui.disk.GroupDiskViewModel, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$26$0$0(final GroupDiskViewModel $viewModel, final State $uiState$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C228@8210L3180,222@7923L3467:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1095956627, $changed, -1, "com.yhchat.canarys.ui.disk.GroupDiskScreen.<anonymous>.<anonymous>.<anonymous> (GroupDiskActivity.kt:222)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, -947318087, "CC(remember):GroupDiskActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($uiState$delegate);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GroupDiskActivityKt.GroupDiskScreen$lambda$26$0$0$0$0($viewModel, $uiState$delegate, (LazyListScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyRow(modifierM1050padding3ABfNKs, null, null, false, horizontalOrVerticalM909spacedBy0680j_4, centerVertically, null, false, null, (Function1) objRememberedValue, $composer, 221190, 462);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$26$0$0$0$0(final GroupDiskViewModel $viewModel, final State $uiState$delegate, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        LazyListScope.item$default(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(-573828694, true, new Function3() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return GroupDiskActivityKt.GroupDiskScreen$lambda$26$0$0$0$0$0($viewModel, $uiState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        final List breadcrumbs = GroupDiskScreen$lambda$2($uiState$delegate).getBreadcrumbs();
        LazyRow.items(breadcrumbs.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$GroupDiskScreen$lambda$26$0$0$0$0$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                breadcrumbs.get(index);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$GroupDiskScreen$lambda$26$0$0$0$0$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:67:0x02f9  */
            /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope r61, int r62, androidx.compose.runtime.Composer r63, int r64) {
                /*
                    Method dump skipped, instructions count: 771
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.C3821x54fbd2fb.invoke(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$26$0$0$0$0$0(final GroupDiskViewModel $viewModel, State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        long j;
        FontWeight normal;
        long j2;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C233@8429L94,231@8290L1551:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-573828694, $changed, -1, "com.yhchat.canarys.ui.disk.GroupDiskScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GroupDiskActivity.kt:231)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1693555672, "CC(remember):GroupDiskActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupDiskActivityKt.GroupDiskScreen$lambda$26$0$0$0$0$0$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null);
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM516clickableoSLSa3U$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -39008694, "C237@8580L489,246@9098L39,249@9272L10,247@9166L649:GroupDiskActivity.kt#kdr2ae");
            ImageVector home = HomeKt.getHome(Icons.INSTANCE.getDefault());
            Modifier modifierM1102size3ABfNKs = SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20));
            if (GroupDiskScreen$lambda$2($uiState$delegate).getCurrentFolderId() == 0) {
                $composer.startReplaceGroup(-2079458867);
                ComposerKt.sourceInformation($composer, "242@8902L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j = primary;
            } else {
                $composer.startReplaceGroup(-2079455370);
                ComposerKt.sourceInformation($composer, "244@9011L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j = onSurfaceVariant;
            }
            IconKt.m2816Iconww6aTOc(home, "\u6839\u76ee\u5f55", modifierM1102size3ABfNKs, j, $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium();
            if (GroupDiskScreen$lambda$2($uiState$delegate).getCurrentFolderId() == 0) {
                normal = FontWeight.INSTANCE.getBold();
            } else {
                normal = FontWeight.INSTANCE.getNormal();
            }
            if (GroupDiskScreen$lambda$2($uiState$delegate).getCurrentFolderId() == 0) {
                $composer.startReplaceGroup(-2079434995);
                ComposerKt.sourceInformation($composer, "255@9648L11");
                long primary2 = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j2 = primary2;
            } else {
                $composer.startReplaceGroup(-2079431498);
                ComposerKt.sourceInformation($composer, "257@9757L11");
                long onSurfaceVariant2 = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j2 = onSurfaceVariant2;
            }
            TextKt.m3359Text4IGK_g("\u6839\u76ee\u5f55", (Modifier) null, j2, 0L, (FontStyle) null, normal, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium, $composer, 6, 0, 65498);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$26$0$0$0$0$0$0$0(GroupDiskViewModel $viewModel) {
        $viewModel.navigateToFolder(0L);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$26$0$2$0$0$0(GroupDiskViewModel $viewModel, String $groupId) {
        GroupDiskViewModel.loadFiles$default($viewModel, $groupId, 0L, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$26$0$4$0(State $uiState$delegate, final GroupDiskViewModel $viewModel, final MutableState $fileToDownload$delegate, final MutableState $showDownloadConfirmDialog$delegate, final MutableState $selectedFile$delegate, final MutableState $showFileMenu$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List files = GroupDiskScreen$lambda$2($uiState$delegate).getFiles();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$GroupDiskScreen$lambda$26$0$4$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((DiskFile) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(DiskFile diskFile) {
                return null;
            }
        };
        LazyColumn.items(files.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$GroupDiskScreen$lambda$26$0$4$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(files.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$GroupDiskScreen$lambda$26$0$4$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    int i = $dirty & 14;
                    final DiskFile diskFile = (DiskFile) files.get(it);
                    $composer.startReplaceGroup(-343861500);
                    ComposerKt.sourceInformation($composer, "CN(file)*355@14225L509,365@14782L147,353@14124L835:GroupDiskActivity.kt#kdr2ae");
                    ComposerKt.sourceInformationMarkerStart($composer, 1651478585, "CC(remember):GroupDiskActivity.kt#9igjgp");
                    boolean zChangedInstance = ((((i & 112) ^ 48) > 32 && $composer.changed(diskFile)) || (i & 48) == 32) | $composer.changedInstance($viewModel);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final GroupDiskViewModel groupDiskViewModel = $viewModel;
                        final MutableState mutableState = $fileToDownload$delegate;
                        final MutableState mutableState2 = $showDownloadConfirmDialog$delegate;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$GroupDiskScreen$6$1$5$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (diskFile.getObjectType() == 1) {
                                    groupDiskViewModel.enterFolder(diskFile.getId(), diskFile.getName());
                                } else {
                                    mutableState.setValue(diskFile);
                                    GroupDiskActivityKt.GroupDiskScreen$lambda$17(mutableState2, true);
                                }
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    Function0 function0 = (Function0) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 1651496047, "CC(remember):GroupDiskActivity.kt#9igjgp");
                    boolean z = (((i & 112) ^ 48) > 32 && $composer.changed(diskFile)) || (i & 48) == 32;
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        final MutableState mutableState3 = $selectedFile$delegate;
                        final MutableState mutableState4 = $showFileMenu$delegate;
                        Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$GroupDiskScreen$6$1$5$1$1$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                mutableState3.setValue(diskFile);
                                GroupDiskActivityKt.GroupDiskScreen$lambda$14(mutableState4, true);
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    GroupDiskActivityKt.DiskFileCard(diskFile, function0, (Function0) objRememberedValue2, null, $composer, (i >> 3) & 14, 8);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                $composer.skipToGroupEnd();
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$27$0(GroupDiskViewModel $viewModel, String $groupId, MutableState $showCreateFolderDialog$delegate, String folderName) {
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        $viewModel.createFolder($groupId, folderName);
        GroupDiskScreen$lambda$5($showCreateFolderDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$28$0(MutableState $showCreateFolderDialog$delegate) {
        GroupDiskScreen$lambda$5($showCreateFolderDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$29$0(MutableState $showFileMenu$delegate, MutableState $showRenameDialog$delegate) {
        GroupDiskScreen$lambda$14($showFileMenu$delegate, false);
        GroupDiskScreen$lambda$8($showRenameDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$30$0(GroupDiskViewModel $viewModel, MutableState $selectedFile$delegate, MutableState $showFileMenu$delegate) {
        DiskFile diskFileGroupDiskScreen$lambda$10 = GroupDiskScreen$lambda$10($selectedFile$delegate);
        Intrinsics.checkNotNull(diskFileGroupDiskScreen$lambda$10);
        long id = diskFileGroupDiskScreen$lambda$10.getId();
        DiskFile diskFileGroupDiskScreen$lambda$102 = GroupDiskScreen$lambda$10($selectedFile$delegate);
        Intrinsics.checkNotNull(diskFileGroupDiskScreen$lambda$102);
        $viewModel.deleteFile(id, diskFileGroupDiskScreen$lambda$102.getObjectType());
        GroupDiskScreen$lambda$14($showFileMenu$delegate, false);
        $selectedFile$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$31$0(Context $context, MutableState $selectedFile$delegate) {
        DiskFile diskFileGroupDiskScreen$lambda$10 = GroupDiskScreen$lambda$10($selectedFile$delegate);
        Intrinsics.checkNotNull(diskFileGroupDiskScreen$lambda$10);
        downloadFileWithService($context, diskFileGroupDiskScreen$lambda$10);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$32$0(MutableState $showFileMenu$delegate, MutableState $selectedFile$delegate) {
        GroupDiskScreen$lambda$14($showFileMenu$delegate, false);
        $selectedFile$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$33$0(GroupDiskViewModel $viewModel, MutableState $selectedFile$delegate, MutableState $showRenameDialog$delegate, String newName) {
        Intrinsics.checkNotNullParameter(newName, "newName");
        DiskFile diskFileGroupDiskScreen$lambda$10 = GroupDiskScreen$lambda$10($selectedFile$delegate);
        Intrinsics.checkNotNull(diskFileGroupDiskScreen$lambda$10);
        long id = diskFileGroupDiskScreen$lambda$10.getId();
        DiskFile diskFileGroupDiskScreen$lambda$102 = GroupDiskScreen$lambda$10($selectedFile$delegate);
        Intrinsics.checkNotNull(diskFileGroupDiskScreen$lambda$102);
        $viewModel.renameFile(id, diskFileGroupDiskScreen$lambda$102.getObjectType(), newName);
        GroupDiskScreen$lambda$8($showRenameDialog$delegate, false);
        $selectedFile$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$34$0(MutableState $showRenameDialog$delegate, MutableState $selectedFile$delegate) {
        GroupDiskScreen$lambda$8($showRenameDialog$delegate, false);
        $selectedFile$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$35$0(Context $context, MutableState $fileToDownload$delegate, MutableState $showDownloadConfirmDialog$delegate) {
        DiskFile diskFileGroupDiskScreen$lambda$19 = GroupDiskScreen$lambda$19($fileToDownload$delegate);
        Intrinsics.checkNotNull(diskFileGroupDiskScreen$lambda$19);
        downloadFileWithService($context, diskFileGroupDiskScreen$lambda$19);
        GroupDiskScreen$lambda$17($showDownloadConfirmDialog$delegate, false);
        $fileToDownload$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupDiskScreen$lambda$36$0(MutableState $showDownloadConfirmDialog$delegate, MutableState $fileToDownload$delegate) {
        GroupDiskScreen$lambda$17($showDownloadConfirmDialog$delegate, false);
        $fileToDownload$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    private static final void downloadFileWithService(Context context, DiskFile file) {
        Context context2;
        Exception e;
        if (StringsKt.isBlank(file.getQiniuKey())) {
            Toast.makeText(context, "\u6587\u4ef6\u94fe\u63a5\u65e0\u6548", 0).show();
            return;
        }
        try {
            context2 = context;
        } catch (Exception e2) {
            context2 = context;
            e = e2;
        }
        try {
            FileDownloadService.INSTANCE.startDownload(context2, file.getQiniuKey(), file.getName(), file.getFileSize(), false);
            Toast.makeText(context2, "\u5f00\u59cb\u4e0b\u8f7d: " + file.getName(), 0).show();
        } catch (Exception e3) {
            e = e3;
            Toast.makeText(context2, "\u4e0b\u8f7d\u5931\u8d25: " + e.getMessage(), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiskFileCard(final DiskFile file, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function0<Unit> function03;
        Function0<Unit> function04;
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Composer $composer3 = $composer.startRestartGroup(518520220);
        ComposerKt.sourceInformation($composer3, "C(DiskFileCard)N(file,onClick,onLongClick,modifier)503@18846L38,505@18933L1731,496@18627L2037:GroupDiskActivity.kt#kdr2ae");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(file) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            function03 = function0;
            $dirty |= $composer3.changedInstance(function03) ? 32 : 16;
        } else {
            function03 = function0;
        }
        if (($changed & 384) == 0) {
            function04 = function02;
            $dirty |= $composer3.changedInstance(function04) ? 256 : 128;
        } else {
            function04 = function02;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if ($composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(518520220, $dirty, -1, "com.yhchat.canarys.ui.disk.DiskFileCard (GroupDiskActivity.kt:495)");
            }
            Modifier modifier5 = modifier4;
            CardKt.Card(ClickableKt.m526combinedClickablehoGz1lA$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), false, null, null, null, function04, null, false, null, function03, 239, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(8)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1005392618, true, new Function3() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return GroupDiskActivityKt.DiskFileCard$lambda$0(file, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.DiskFileCard$lambda$1(file, function0, function02, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:66:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit DiskFileCard$lambda$0(com.yhchat.canarys.data.model.DiskFile r109, androidx.compose.foundation.layout.ColumnScope r110, androidx.compose.runtime.Composer r111, int r112) {
        /*
            Method dump skipped, instructions count: 1477
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.GroupDiskActivityKt.DiskFileCard$lambda$0(com.yhchat.canarys.data.model.DiskFile, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final void CreateFolderDialog(final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(1742622488);
        ComposerKt.sourceInformation($composer3, "C(CreateFolderDialog)N(onConfirm,onDismiss)557@20797L31,571@21239L224,579@21489L98,562@20939L274,559@20838L755:GroupDiskActivity.kt#kdr2ae");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (!$composer3.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1742622488, $dirty, -1, "com.yhchat.canarys.ui.disk.CreateFolderDialog (GroupDiskActivity.kt:556)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -377030953, "CC(remember):GroupDiskActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState folderName$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(-1487842464, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.CreateFolderDialog$lambda$3(function1, folderName$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-626008862, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.CreateFolderDialog$lambda$4(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.getLambda$235824740$app_debug(), ComposableLambdaKt.rememberComposableLambda(666741541, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.CreateFolderDialog$lambda$5(folderName$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.CreateFolderDialog$lambda$6(function1, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String CreateFolderDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateFolderDialog$lambda$5(final MutableState $folderName$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C565@21040L19,563@20953L250:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(666741541, $changed, -1, "com.yhchat.canarys.ui.disk.CreateFolderDialog.<anonymous> (GroupDiskActivity.kt:563)");
            }
            String strCreateFolderDialog$lambda$1 = CreateFolderDialog$lambda$1($folderName$delegate);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 788497048, "CC(remember):GroupDiskActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GroupDiskActivityKt.CreateFolderDialog$lambda$5$0$0($folderName$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strCreateFolderDialog$lambda$1, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GroupDiskActivityKt.INSTANCE.getLambda$1838756415$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1573296, 12582912, 0, 8257464);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateFolderDialog$lambda$5$0$0(MutableState $folderName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $folderName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateFolderDialog$lambda$3(final Function1 $onConfirm, MutableState $folderName$delegate, Composer $composer, int $changed) {
        final MutableState mutableState;
        ComposerKt.sourceInformation($composer, "C573@21291L54,572@21253L200:GroupDiskActivity.kt#kdr2ae");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1487842464, $changed, -1, "com.yhchat.canarys.ui.disk.CreateFolderDialog.<anonymous> (GroupDiskActivity.kt:572)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 407503382, "CC(remember):GroupDiskActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onConfirm);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = $folderName$delegate;
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupDiskActivityKt.CreateFolderDialog$lambda$3$0$0($onConfirm, mutableState);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                mutableState = $folderName$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, true ^ StringsKt.isBlank(CreateFolderDialog$lambda$1(mutableState)), null, null, null, null, null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11238getLambda$955729763$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateFolderDialog$lambda$3$0$0(Function1 $onConfirm, MutableState $folderName$delegate) {
        if (!StringsKt.isBlank(CreateFolderDialog$lambda$1($folderName$delegate))) {
            $onConfirm.invoke(CreateFolderDialog$lambda$1($folderName$delegate));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateFolderDialog$lambda$4(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C580@21503L74:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-626008862, $changed, -1, "com.yhchat.canarys.ui.disk.CreateFolderDialog.<anonymous> (GroupDiskActivity.kt:580)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11237getLambda$93896161$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void FileActionDialog(final DiskFile file, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, Composer $composer, final int $changed) {
        DiskFile diskFile;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        Function0<Unit> function07;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-670731036);
        ComposerKt.sourceInformation($composer3, "C(FileActionDialog)N(file,onRename,onDelete,onDownload,onDismiss)595@21800L7,644@23611L98,600@21917L1640,597@21817L1898:GroupDiskActivity.kt#kdr2ae");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            diskFile = file;
            $dirty |= $composer3.changed(diskFile) ? 4 : 2;
        } else {
            diskFile = file;
        }
        if (($changed & 48) == 0) {
            function05 = function0;
            $dirty |= $composer3.changedInstance(function05) ? 32 : 16;
        } else {
            function05 = function0;
        }
        if (($changed & 384) == 0) {
            function06 = function02;
            $dirty |= $composer3.changedInstance(function06) ? 256 : 128;
        } else {
            function06 = function02;
        }
        if (($changed & 3072) == 0) {
            function07 = function03;
            $dirty |= $composer3.changedInstance(function07) ? 2048 : 1024;
        } else {
            function07 = function03;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function04) ? 16384 : 8192;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-670731036, $dirty2, -1, "com.yhchat.canarys.ui.disk.FileActionDialog (GroupDiskActivity.kt:594)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final DiskFile diskFile2 = diskFile;
            final Function0<Unit> function08 = function07;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function04, ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11231getLambda$2019949668$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(1351850202, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.FileActionDialog$lambda$0(function04, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.getLambda$428682776$app_debug(), ComposableLambdaKt.rememberComposableLambda(2114582711, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.FileActionDialog$lambda$1(diskFile2, function08, function04, function05, function06, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty2 >> 12) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.FileActionDialog$lambda$2(file, function0, function02, function03, function04, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit FileActionDialog$lambda$1(com.yhchat.canarys.data.model.DiskFile r54, final kotlin.jvm.functions.Function0 r55, final kotlin.jvm.functions.Function0 r56, kotlin.jvm.functions.Function0 r57, kotlin.jvm.functions.Function0 r58, androidx.compose.runtime.Composer r59, int r60) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.GroupDiskActivityKt.FileActionDialog$lambda$1(com.yhchat.canarys.data.model.DiskFile, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionDialog$lambda$1$0$0$0(Function0 $onDownload, Function0 $onDismiss) {
        $onDownload.invoke();
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FileActionDialog$lambda$0(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C645@23625L74:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1351850202, $changed, -1, "com.yhchat.canarys.ui.disk.FileActionDialog.<anonymous> (GroupDiskActivity.kt:645)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11232getLambda$265038467$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void DownloadConfirmDialog(final DiskFile file, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(583028706);
        ComposerKt.sourceInformation($composer3, "C(DownloadConfirmDialog)N(file,onConfirm,onDismiss)711@26038L347,722@26411L98,668@24161L1851,658@23847L2668:GroupDiskActivity.kt#kdr2ae");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(file) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(583028706, $dirty, -1, "com.yhchat.canarys.ui.disk.DownloadConfirmDialog (GroupDiskActivity.kt:657)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function02, ComposableLambdaKt.rememberComposableLambda(-291035094, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.DownloadConfirmDialog$lambda$0(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(1107918508, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.DownloadConfirmDialog$lambda$1(function02, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11233getLambda$340088339$app_debug(), ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11230getLambda$1788095186$app_debug(), ComposableLambdaKt.rememberComposableLambda(1058865263, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.DownloadConfirmDialog$lambda$2(file, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 6) & 14) | 1797168, 0, 16260);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.DownloadConfirmDialog$lambda$3(file, function0, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit DownloadConfirmDialog$lambda$2(final com.yhchat.canarys.data.model.DiskFile r53, androidx.compose.runtime.Composer r54, int r55) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.GroupDiskActivityKt.DownloadConfirmDialog$lambda$2(com.yhchat.canarys.data.model.DiskFile, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadConfirmDialog$lambda$2$0$0(DiskFile $file, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C679@24588L1053:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(275300439, $changed, -1, "com.yhchat.canarys.ui.disk.DownloadConfirmDialog.<anonymous>.<anonymous>.<anonymous> (GroupDiskActivity.kt:679)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1435166859, "C687@24961L10,685@24850L218,692@25223L10,693@25295L11,690@25093L256,697@25493L10,698@25565L11,695@25374L245:GroupDiskActivity.kt#kdr2ae");
            TextKt.m3359Text4IGK_g("\u6587\u4ef6\u540d\uff1a" + $file.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            TextKt.m3359Text4IGK_g("\u5927\u5c0f\uff1a" + formatFileSize($file.getFileSize()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            TextKt.m3359Text4IGK_g("\u4e0a\u4f20\u8005\uff1a" + $file.getUploadByName(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadConfirmDialog$lambda$0(Function0 $onConfirm, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C712@26052L323:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-291035094, $changed, -1, "com.yhchat.canarys.ui.disk.DownloadConfirmDialog.<anonymous> (GroupDiskActivity.kt:712)");
            }
            ButtonKt.Button($onConfirm, null, false, null, null, null, null, null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.getLambda$1978482714$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DownloadConfirmDialog$lambda$1(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C723@26425L74:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1107918508, $changed, -1, "com.yhchat.canarys.ui.disk.DownloadConfirmDialog.<anonymous> (GroupDiskActivity.kt:723)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.getLambda$235532393$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void RenameFileDialog(final String currentName, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(541235101);
        ComposerKt.sourceInformation($composer3, "C(RenameFileDialog)N(currentName,onConfirm,onDismiss)736@26668L40,750@27109L215,758@27350L98,741@26817L266,738@26718L736:GroupDiskActivity.kt#kdr2ae");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(currentName) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(541235101, $dirty, -1, "com.yhchat.canarys.ui.disk.RenameFileDialog (GroupDiskActivity.kt:735)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 435893413, "CC(remember):GroupDiskActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentName, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState newName$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(-554762155, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.RenameFileDialog$lambda$3(function1, newName$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1139533805, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.RenameFileDialog$lambda$4(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11228getLambda$1724305455$app_debug(), ComposableLambdaKt.rememberComposableLambda(-2016691280, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.RenameFileDialog$lambda$5(newName$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 6) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupDiskActivityKt.RenameFileDialog$lambda$6(currentName, function1, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String RenameFileDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RenameFileDialog$lambda$5(final MutableState $newName$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C744@26915L16,742@26831L242:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2016691280, $changed, -1, "com.yhchat.canarys.ui.disk.RenameFileDialog.<anonymous> (GroupDiskActivity.kt:742)");
            }
            String strRenameFileDialog$lambda$1 = RenameFileDialog$lambda$1($newName$delegate);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -1010066432, "CC(remember):GroupDiskActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return GroupDiskActivityKt.RenameFileDialog$lambda$5$0$0($newName$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strRenameFileDialog$lambda$1, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GroupDiskActivityKt.INSTANCE.getLambda$1030395094$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 1573296, 12582912, 0, 8257464);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RenameFileDialog$lambda$5$0$0(MutableState $newName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $newName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RenameFileDialog$lambda$3(final Function1 $onConfirm, MutableState $newName$delegate, Composer $composer, int $changed) {
        final MutableState mutableState;
        ComposerKt.sourceInformation($composer, "C752@27161L48,751@27123L191:GroupDiskActivity.kt#kdr2ae");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-554762155, $changed, -1, "com.yhchat.canarys.ui.disk.RenameFileDialog.<anonymous> (GroupDiskActivity.kt:751)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -550484539, "CC(remember):GroupDiskActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onConfirm);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = $newName$delegate;
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.GroupDiskActivityKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupDiskActivityKt.RenameFileDialog$lambda$3$0$0($onConfirm, mutableState);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                mutableState = $newName$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, true ^ StringsKt.isBlank(RenameFileDialog$lambda$1(mutableState)), null, null, null, null, null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11227getLambda$1155114696$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RenameFileDialog$lambda$3$0$0(Function1 $onConfirm, MutableState $newName$delegate) {
        if (!StringsKt.isBlank(RenameFileDialog$lambda$1($newName$delegate))) {
            $onConfirm.invoke(RenameFileDialog$lambda$1($newName$delegate));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RenameFileDialog$lambda$4(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C759@27364L74:GroupDiskActivity.kt#kdr2ae");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1139533805, $changed, -1, "com.yhchat.canarys.ui.disk.RenameFileDialog.<anonymous> (GroupDiskActivity.kt:759)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GroupDiskActivityKt.INSTANCE.m11229getLambda$1739886346$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final String formatFileSize(long bytes) {
        if (bytes < 1024) {
            return bytes + "B";
        }
        if (bytes < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2f KB", Arrays.copyOf(new Object[]{Double.valueOf(bytes / 1024.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (bytes < 1073741824) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(bytes / 1048576.0d)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String str3 = String.format("%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(bytes / 1.073741824E9d)}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
        return str3;
    }
}
