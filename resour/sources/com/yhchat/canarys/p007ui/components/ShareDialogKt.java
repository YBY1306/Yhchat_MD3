package com.yhchat.canarys.p007ui.components;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShareDialog.kt */
@Metadata(m168d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u00a2\u0006\u0002\u0010\t\u001a\u0018\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\u0002\u001a \u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002\u00a8\u0006\u0010\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m169d2 = {"ShareDialog", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_NAME, "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "copyToClipboard", "context", "Landroid/content/Context;", "text", "shareToSystem", "shareUrl", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/components/ShareUiState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ShareDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$6(String str, int i, String str2, Function0 function0, int i2, Composer composer, int i3) {
        ShareDialog(str, i, str2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final void ShareDialog(final String chatId, final int chatType, final String chatName, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Composer $composer2;
        ShareViewModel viewModel;
        final int i = chatType;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(-2054367426);
        ComposerKt.sourceInformation($composer3, "C(ShareDialog)N(chatId,chatType,chatName,onDismiss)38@1260L7,39@1288L29,41@1348L101,41@1327L122,46@1492L16,172@6720L98,50@1585L175,58@1777L4917,48@1518L5306:ShareDialog.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(chatId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(i) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(chatName) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2054367426, $dirty2, -1, "com.yhchat.canarys.ui.components.ShareDialog (ShareDialog.kt:37)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 1437865787, "CC(remember):ShareDialog.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object shareViewModel = new ShareViewModel();
                $composer3.updateRememberedValue(shareViewModel);
                objRememberedValue = shareViewModel;
            }
            ShareViewModel viewModel2 = (ShareViewModel) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 1437867779, "CC(remember):ShareDialog.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(viewModel2) | $composer3.changedInstance(context) | (($dirty2 & 14) == 4) | (($dirty2 & 112) == 32) | (($dirty2 & 896) == 256);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object shareDialogKt$ShareDialog$1$1 = new ShareDialogKt$ShareDialog$1$1(viewModel2, context, chatId, i, chatName, null);
                context = context;
                i = i;
                viewModel = viewModel2;
                Object obj = (Function2) shareDialogKt$ShareDialog$1$1;
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            } else {
                viewModel = viewModel2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, 6);
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer3, 0, 1);
            final int i2 = i;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(880434166, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ShareDialogKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ShareDialogKt.ShareDialog$lambda$3(onDismiss, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1520457358, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ShareDialogKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ShareDialogKt.ShareDialog$lambda$4(i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1046938415, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ShareDialogKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ShareDialogKt.ShareDialog$lambda$5(i2, chatId, chatName, context, uiState$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty2 >> 9) & 14) | 1769520, 0, 16284);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ShareDialogKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ShareDialogKt.ShareDialog$lambda$6(chatId, chatType, chatName, onDismiss, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final ShareUiState ShareDialog$lambda$2(State<ShareUiState> state) {
        return (ShareUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$4(int $chatType, Composer $composer, int $changed) {
        String str;
        ComposerKt.sourceInformation($composer, "C51@1599L151:ShareDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1520457358, $changed, -1, "com.yhchat.canarys.ui.components.ShareDialog.<anonymous> (ShareDialog.kt:51)");
            }
            switch ($chatType) {
                case 1:
                    str = "\u7528\u6237";
                    break;
                case 2:
                    str = "\u7fa4\u804a";
                    break;
                case 3:
                    str = "\u673a\u5668\u4eba";
                    break;
                default:
                    str = "\u5bf9\u8c61";
                    break;
            }
            TextKt.m3359Text4IGK_g("\u5206\u4eab" + str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0542  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ShareDialog$lambda$5(int r64, java.lang.String r65, final java.lang.String r66, final android.content.Context r67, androidx.compose.runtime.State r68, androidx.compose.runtime.Composer r69, int r70) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ShareDialogKt.ShareDialog$lambda$5(int, java.lang.String, java.lang.String, android.content.Context, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$5$0$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$5$0$1(final Context $context, final String $shareText, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C120@4477L107,120@4456L396:ShareDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-670557692, $changed, -1, "com.yhchat.canarys.ui.components.ShareDialog.<anonymous>.<anonymous>.<anonymous> (ShareDialog.kt:120)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -160845745, "CC(remember):ShareDialog.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($shareText);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.ShareDialogKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareDialogKt.ShareDialog$lambda$5$0$1$0$0($context, $shareText);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$ShareDialogKt.INSTANCE.getLambda$266641953$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$5$0$1$0$0(Context $context, String $shareText) {
        copyToClipboard($context, $shareText);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$5$0$2$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$5$0$3(final Context $context, final String $yunhuLink, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C141@5455L107,141@5434L396:ShareDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-565837779, $changed, -1, "com.yhchat.canarys.ui.components.ShareDialog.<anonymous>.<anonymous>.<anonymous> (ShareDialog.kt:141)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1690742840, "CC(remember):ShareDialog.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($yunhuLink);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.ShareDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareDialogKt.ShareDialog$lambda$5$0$3$0$0($context, $yunhuLink);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$ShareDialogKt.INSTANCE.m11040getLambda$1860111094$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$5$0$3$0$0(Context $context, String $yunhuLink) {
        copyToClipboard($context, $yunhuLink);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$5$0$4$0(Context $context, String $shareText, String $chatName) {
        shareToSystem($context, $shareText, $chatName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareDialog$lambda$3(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C173@6734L74:ShareDialog.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(880434166, $changed, -1, "com.yhchat.canarys.ui.components.ShareDialog.<anonymous> (ShareDialog.kt:173)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ShareDialogKt.INSTANCE.getLambda$196058713$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void copyToClipboard(Context context, String text) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        ClipData clip = ClipData.newPlainText("\u5206\u4eab\u94fe\u63a5", text);
        clipboardManager.setPrimaryClip(clip);
        Toast.makeText(context, "\u94fe\u63a5\u5df2\u590d\u5236", 0).show();
    }

    private static final void shareToSystem(Context context, String shareUrl, String chatName) {
        Intent sendIntent = new Intent();
        sendIntent.setAction("android.intent.action.SEND");
        sendIntent.putExtra("android.intent.extra.TEXT", "\u52a0\u5165\u6211\u7684" + chatName + "\uff1a" + shareUrl);
        sendIntent.setType("text/plain");
        Intent shareIntent = Intent.createChooser(sendIntent, "\u5206\u4eab\u5230");
        context.startActivity(shareIntent);
    }
}
