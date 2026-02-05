package com.yhchat.canarys.p007ui.disk.webdav;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.MountSetting;
import com.yhchat.canarys.data.model.WebDAVFile;
import com.yhchat.canarys.utils.WebDAVDownloadManager;
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
import kotlin.jvm.internal.Ref;

/* compiled from: WebDAVBrowserActivity.kt */
@Metadata(m168d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a2\u0006\u0002\u0010\t\u001aI\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016H\u0003\u00a2\u0006\u0002\u0010\u0018\u001a;\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a)\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016H\u0003\u00a2\u0006\u0002\u0010!\u00a8\u0006\"\u00b2\u0006\n\u0010#\u001a\u00020\u0014X\u008a\u008e\u0002\u00b2\u0006\f\u0010$\u001a\u0004\u0018\u00010\u0017X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, m169d2 = {"WebDAVBrowserScreen", "", "groupId", "", "groupName", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WebDAVFileListPage", "uiState", "Lcom/yhchat/canarys/ui/disk/webdav/WebDAVBrowserUiState;", "viewModel", "Lcom/yhchat/canarys/ui/disk/webdav/WebDAVBrowserViewModel;", "context", "Landroid/content/Context;", "pageIndex", "", "isCurrentPage", "", "onFileClick", "Lkotlin/Function1;", "Lcom/yhchat/canarys/data/model/WebDAVFile;", "(Lcom/yhchat/canarys/ui/disk/webdav/WebDAVBrowserUiState;Lcom/yhchat/canarys/ui/disk/webdav/WebDAVBrowserViewModel;Landroid/content/Context;IZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "WebDAVFileCard", "file", "onClick", "onLongClick", "(Lcom/yhchat/canarys/data/model/WebDAVFile;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WebDAVBreadcrumbBar", "currentPath", "onNavigate", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_debug", "showDownloadDialog", "fileToDownload"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class WebDAVBrowserActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBreadcrumbBar$lambda$2(String str, Function1 function1, int i, Composer composer, int i2) {
        WebDAVBreadcrumbBar(str, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$17(String str, String str2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WebDAVBrowserScreen(str, str2, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVFileCard$lambda$1(WebDAVFile webDAVFile, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WebDAVFileCard(webDAVFile, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVFileListPage$lambda$5(WebDAVBrowserUiState webDAVBrowserUiState, WebDAVBrowserViewModel webDAVBrowserViewModel, Context context, int i, boolean z, Function1 function1, int i2, Composer composer, int i3) {
        WebDAVFileListPage(webDAVBrowserUiState, webDAVBrowserViewModel, context, i, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void WebDAVBrowserScreen(final java.lang.String r35, final java.lang.String r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.p000ui.Modifier r38, androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 980
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserActivityKt.WebDAVBrowserScreen(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final boolean WebDAVBrowserScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void WebDAVBrowserScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final WebDAVFile WebDAVBrowserScreen$lambda$5(MutableState<WebDAVFile> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$7$0(WebDAVBrowserViewModel $viewModel, String $groupId, ActivityResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.loadMountSettings($groupId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebDAVBrowserUiState WebDAVBrowserScreen$lambda$9(State<WebDAVBrowserUiState> state) {
        return (WebDAVBrowserUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$10$0(WebDAVBrowserViewModel $viewModel, Function0 $onBackClick) {
        boolean handled = $viewModel.navigateUp();
        if (!handled) {
            $onBackClick.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$11(final String $groupName, final Function0 $onBackClick, final Context $context, final String $groupId, final ManagedActivityResultLauncher $settingsLauncher, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C144@5163L61,145@5259L286,153@5573L570,143@5128L1029:WebDAVBrowserActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(726968127, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserScreen.<anonymous> (WebDAVBrowserActivity.kt:143)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(1281512699, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$11$0($groupName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-792720455, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$11$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(773702256, true, new Function3() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$11$2($context, $groupId, $groupName, $settingsLauncher, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$11$0(String $groupName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C144@5165L57:WebDAVBrowserActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1281512699, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserScreen.<anonymous>.<anonymous> (WebDAVBrowserActivity.kt:144)");
            }
            TextKt.m3359Text4IGK_g($groupName + " \u7684 WebDAV", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$11$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C146@5281L246:WebDAVBrowserActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-792720455, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserScreen.<anonymous>.<anonymous> (WebDAVBrowserActivity.kt:146)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$WebDAVBrowserActivityKt.INSTANCE.m11262getLambda$245508228$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$11$2(final Context $context, final String $groupId, final String $groupName, final ManagedActivityResultLauncher $settingsLauncher, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C154@5616L45,154@5595L187,157@5824L175,157@5803L322:WebDAVBrowserActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(773702256, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserScreen.<anonymous>.<anonymous> (WebDAVBrowserActivity.kt:154)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 498527229, "CC(remember):WebDAVBrowserActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$11$2$0$0($context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$WebDAVBrowserActivityKt.INSTANCE.m11259getLambda$1094352371$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            ComposerKt.sourceInformationMarkerStart($composer, 498534015, "CC(remember):WebDAVBrowserActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($context) | $composer.changed($groupId) | $composer.changed($groupName) | $composer.changedInstance($settingsLauncher);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$11$2$1$0($context, $groupId, $groupName, $settingsLauncher);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, ComposableSingletons$WebDAVBrowserActivityKt.INSTANCE.m11261getLambda$2133685692$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$11$2$0$0(Context $context) {
        WebDAVDownloadListActivity.INSTANCE.start($context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$11$2$1$0(Context $context, String $groupId, String $groupName, ManagedActivityResultLauncher $settingsLauncher) {
        Intent intent = WebDAVSettingsActivity.INSTANCE.intent($context, $groupId, $groupName);
        $settingsLauncher.launch(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0813  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit WebDAVBrowserScreen$lambda$12(androidx.compose.p000ui.Modifier r102, final androidx.compose.runtime.State r103, final com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserViewModel r104, java.lang.String r105, final java.lang.String r106, final android.content.Context r107, final androidx.compose.runtime.MutableState r108, final androidx.compose.runtime.MutableState r109, androidx.compose.foundation.layout.PaddingValues r110, androidx.compose.runtime.Composer r111, int r112) {
        /*
            Method dump skipped, instructions count: 2916
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$12(androidx.compose.ui.Modifier, androidx.compose.runtime.State, com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserViewModel, java.lang.String, java.lang.String, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$12$0$1$0$0$0(WebDAVBrowserViewModel $viewModel, String $groupId) {
        $viewModel.loadMountSettings($groupId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int WebDAVBrowserScreen$lambda$12$0$3$0(State $uiState$delegate) {
        return WebDAVBrowserScreen$lambda$9($uiState$delegate).getMountSettings().size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$12$0$6(final State $uiState$delegate, final WebDAVBrowserViewModel $viewModel, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C267@10867L541,261@10532L876:WebDAVBrowserActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1790763775, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserScreen.<anonymous>.<anonymous>.<anonymous> (WebDAVBrowserActivity.kt:261)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 1357910014, "CC(remember):WebDAVBrowserActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($uiState$delegate) | $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$12$0$6$0$0($uiState$delegate, $viewModel, (LazyListScope) obj2);
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
    public static final Unit WebDAVBrowserScreen$lambda$12$0$6$0$0(final State $uiState$delegate, final WebDAVBrowserViewModel $viewModel, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final List mountSettings = WebDAVBrowserScreen$lambda$9($uiState$delegate).getMountSettings();
        LazyRow.items(mountSettings.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$WebDAVBrowserScreen$lambda$12$0$6$0$0$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                mountSettings.get(index);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$WebDAVBrowserScreen$lambda$12$0$6$0$0$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, final int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)214@10668L26:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2039820996, $dirty, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                int i = ($dirty & 14) | ($dirty & 112);
                final MountSetting mountSetting = (MountSetting) mountSettings.get(it);
                $composer.startReplaceGroup(-2008303478);
                ComposerKt.sourceInformation($composer, "CN(index,mountSetting)*271@11132L108,274@11286L32,269@10990L362:WebDAVBrowserActivity.kt#avqsuh");
                boolean z = WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$9($uiState$delegate).getSelectedMountIndex() == it;
                ComposerKt.sourceInformationMarkerStart($composer, 212314971, "CC(remember):WebDAVBrowserActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(it)) || (i & 48) == 32);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final WebDAVBrowserViewModel webDAVBrowserViewModel = $viewModel;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$WebDAVBrowserScreen$4$1$6$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            webDAVBrowserViewModel.selectMount(it);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ChipKt.FilterChip(z, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(804434370, true, new Function2<Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$WebDAVBrowserScreen$4$1$6$1$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer $composer2, int $changed2) {
                        ComposerKt.sourceInformation($composer2, "C274@11288L28:WebDAVBrowserActivity.kt#avqsuh");
                        if (!$composer2.shouldExecute(($changed2 & 3) != 2, $changed2 & 1)) {
                            $composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(804434370, $changed2, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WebDAVBrowserActivity.kt:274)");
                        }
                        TextKt.m3359Text4IGK_g(mountSetting.getMountName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, $composer, 54), null, false, null, null, null, null, null, null, null, $composer, 384, 0, 4088);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$12$0$7$0(WebDAVBrowserViewModel $viewModel, String targetPath) {
        Intrinsics.checkNotNullParameter(targetPath, "targetPath");
        $viewModel.navigateToPath(targetPath);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$12$0$8(WebDAVBrowserViewModel $viewModel, Context $context, State $uiState$delegate, final MutableState $fileToDownload$delegate, final MutableState $showDownloadDialog$delegate, PagerScope HorizontalPager, int pageIndex, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        ComposerKt.sourceInformation($composer, "CN(pageIndex)300@12398L196,294@12055L565:WebDAVBrowserActivity.kt#avqsuh");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-179145646, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserScreen.<anonymous>.<anonymous>.<anonymous> (WebDAVBrowserActivity.kt:294)");
        }
        WebDAVBrowserUiState webDAVBrowserUiStateWebDAVBrowserScreen$lambda$9 = WebDAVBrowserScreen$lambda$9($uiState$delegate);
        boolean z = pageIndex == WebDAVBrowserScreen$lambda$9($uiState$delegate).getSelectedMountIndex();
        ComposerKt.sourceInformationMarkerStart($composer, -360260138, "CC(remember):WebDAVBrowserActivity.kt#9igjgp");
        Object objRememberedValue = $composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function1() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$12$0$8$0$0($fileToDownload$delegate, $showDownloadDialog$delegate, (WebDAVFile) obj2);
                }
            };
            $composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        WebDAVFileListPage(webDAVBrowserUiStateWebDAVBrowserScreen$lambda$9, $viewModel, $context, pageIndex, z, (Function1) objRememberedValue, $composer, (($changed << 6) & 7168) | ProfileVerifier.CompilationStatus.f207xf2722a21);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$12$0$8$0$0(MutableState $fileToDownload$delegate, MutableState $showDownloadDialog$delegate, WebDAVFile file) {
        Intrinsics.checkNotNullParameter(file, "file");
        $fileToDownload$delegate.setValue(file);
        WebDAVBrowserScreen$lambda$3($showDownloadDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$13$0(MutableState $showDownloadDialog$delegate, MutableState $fileToDownload$delegate) {
        WebDAVBrowserScreen$lambda$3($showDownloadDialog$delegate, false);
        $fileToDownload$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0220  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit WebDAVBrowserScreen$lambda$16(androidx.compose.runtime.MutableState r52, androidx.compose.runtime.Composer r53, int r54) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$16(androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$14(final Context $context, final MutableState $fileToDownload$delegate, final MutableState $showDownloadDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C338@13789L369,337@13747L482:WebDAVBrowserActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1008769294, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserScreen.<anonymous> (WebDAVBrowserActivity.kt:337)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1235315073, "CC(remember):WebDAVBrowserActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$14$0$0($fileToDownload$delegate, $context, $showDownloadDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$WebDAVBrowserActivityKt.INSTANCE.m11260getLambda$1386773839$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$14$0$0(MutableState $fileToDownload$delegate, Context $context, MutableState $showDownloadDialog$delegate) {
        WebDAVFile webDAVFileWebDAVBrowserScreen$lambda$5 = WebDAVBrowserScreen$lambda$5($fileToDownload$delegate);
        if (webDAVFileWebDAVBrowserScreen$lambda$5 != null) {
            WebDAVDownloadManager.INSTANCE.startDownload($context, webDAVFileWebDAVBrowserScreen$lambda$5);
            Toast.makeText($context, "\u5df2\u52a0\u5165\u4e0b\u8f7d\u5217\u8868", 0).show();
        }
        WebDAVBrowserScreen$lambda$3($showDownloadDialog$delegate, false);
        $fileToDownload$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$15(final MutableState $showDownloadDialog$delegate, final MutableState $fileToDownload$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C352@14333L120,351@14291L231:WebDAVBrowserActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1186459572, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserScreen.<anonymous> (WebDAVBrowserActivity.kt:351)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2021313212, "CC(remember):WebDAVBrowserActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVBrowserActivityKt.WebDAVBrowserScreen$lambda$15$0$0($showDownloadDialog$delegate, $fileToDownload$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$WebDAVBrowserActivityKt.INSTANCE.getLambda$712964591$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBrowserScreen$lambda$15$0$0(MutableState $showDownloadDialog$delegate, MutableState $fileToDownload$delegate) {
        WebDAVBrowserScreen$lambda$3($showDownloadDialog$delegate, false);
        $fileToDownload$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0753  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void WebDAVFileListPage(final com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserUiState r96, final com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserViewModel r97, final android.content.Context r98, final int r99, final boolean r100, final kotlin.jvm.functions.Function1<? super com.yhchat.canarys.data.model.WebDAVFile, kotlin.Unit> r101, androidx.compose.runtime.Composer r102, final int r103) {
        /*
            Method dump skipped, instructions count: 3113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserActivityKt.WebDAVFileListPage(com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserUiState, com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserViewModel, android.content.Context, int, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVFileListPage$lambda$1$0$0$0(WebDAVBrowserUiState $uiState, int $pageIndex, WebDAVBrowserViewModel $viewModel, MountState $mountState) {
        MountSetting selectedMount = (MountSetting) CollectionsKt.getOrNull($uiState.getMountSettings(), $pageIndex);
        if (selectedMount != null) {
            $viewModel.loadFiles(selectedMount, $mountState.getCurrentPath());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVFileListPage$lambda$3$0(MountState $mountState, final WebDAVBrowserViewModel $viewModel, final Function1 $onFileClick, final Context $context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List files = $mountState.getFiles();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$WebDAVFileListPage$lambda$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((WebDAVFile) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(WebDAVFile webDAVFile) {
                return null;
            }
        };
        LazyColumn.items(files.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$WebDAVFileListPage$lambda$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(files.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$WebDAVFileListPage$lambda$3$0$$inlined$items$default$4
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
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                int i = $dirty & 14;
                final WebDAVFile webDAVFile = (WebDAVFile) files.get(it);
                $composer.startReplaceGroup(-1485180461);
                ComposerKt.sourceInformation($composer, "CN(file)*444@17472L305,452@17817L172,442@17385L626:WebDAVBrowserActivity.kt#avqsuh");
                ComposerKt.sourceInformationMarkerStart($composer, -879190577, "CC(remember):WebDAVBrowserActivity.kt#9igjgp");
                boolean zChangedInstance = ((((i & 112) ^ 48) > 32 && $composer.changed(webDAVFile)) || (i & 48) == 32) | $composer.changedInstance($viewModel) | $composer.changed($onFileClick);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final WebDAVBrowserViewModel webDAVBrowserViewModel = $viewModel;
                    final Function1 function12 = $onFileClick;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$WebDAVFileListPage$4$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            if (webDAVFile.isDirectory()) {
                                webDAVBrowserViewModel.enterFolder(webDAVFile.getPath());
                            } else {
                                function12.invoke(webDAVFile);
                            }
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -879179670, "CC(remember):WebDAVBrowserActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(webDAVFile)) || (i & 48) == 32);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Context context = $context;
                    Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$WebDAVFileListPage$4$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Toast.makeText(context, "\u957f\u6309: " + webDAVFile.getName(), 0).show();
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                WebDAVBrowserActivityKt.WebDAVFileCard(webDAVFile, function0, (Function0) objRememberedValue2, null, $composer, (i >> 3) & 14, 8);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WebDAVFileCard(final WebDAVFile file, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function0<Unit> function03;
        Function0<Unit> function04;
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Composer $composer3 = $composer.startRestartGroup(-748745396);
        ComposerKt.sourceInformation($composer3, "C(WebDAVFileCard)N(file,onClick,onLongClick,modifier)503@19450L38,505@19537L1233,496@19231L1539:WebDAVBrowserActivity.kt#avqsuh");
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
                ComposerKt.traceEventStart(-748745396, $dirty, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVFileCard (WebDAVBrowserActivity.kt:495)");
            }
            Modifier modifier5 = modifier4;
            CardKt.Card(ClickableKt.m526combinedClickablehoGz1lA$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), false, null, null, null, function04, null, false, null, function03, 239, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(8)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(492761662, true, new Function3() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return WebDAVBrowserActivityKt.WebDAVFileCard$lambda$0(file, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVBrowserActivityKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVBrowserActivityKt.WebDAVFileCard$lambda$1(file, function0, function02, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit WebDAVFileCard$lambda$0(com.yhchat.canarys.data.model.WebDAVFile r75, androidx.compose.foundation.layout.ColumnScope r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserActivityKt.WebDAVFileCard$lambda$0(com.yhchat.canarys.data.model.WebDAVFile, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0439  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void WebDAVBreadcrumbBar(final java.lang.String r70, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r71, androidx.compose.runtime.Composer r72, final int r73) {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVBrowserActivityKt.WebDAVBreadcrumbBar(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBreadcrumbBar$lambda$1$0$0(Function1 $onNavigate) {
        $onNavigate.invoke("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVBreadcrumbBar$lambda$1$1$0(Function1 $onNavigate, Ref.ObjectRef $cumulativePath) {
        $onNavigate.invoke($cumulativePath.element);
        return Unit.INSTANCE;
    }
}
