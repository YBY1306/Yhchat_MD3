package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.p000ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CreateBoardDialog.kt */
@Metadata(m168d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b\u00b2\u0006\n\u0010\f\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\r\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0010\u001a\u00020\u0003X\u008a\u008e\u0002"}, m169d2 = {"CreateBoardDialog", "", "token", "", "viewModel", "Lcom/yhchat/canarys/ui/community/CommunityViewModel;", "context", "Landroid/content/Context;", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/community/CommunityViewModel;Landroid/content/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "boardName", "avatarUrl", "isLoading", "", "errorMessage"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class CreateBoardDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBoardDialog$lambda$14(String str, CommunityViewModel communityViewModel, Context context, Function0 function0, int i, Composer composer, int i2) {
        CreateBoardDialog(str, communityViewModel, context, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CreateBoardDialog(final String token, final CommunityViewModel viewModel, final Context context, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Composer $composer2;
        MutableState avatarUrl$delegate;
        MutableState isLoading$delegate;
        final MutableState errorMessage$delegate;
        final MutableState errorMessage$delegate2;
        final MutableState avatarUrl$delegate2;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(-1935495905);
        ComposerKt.sourceInformation($composer3, "C(CreateBoardDialog)N(token,viewModel,context,onDismiss)41@1445L31,42@1498L31,43@1551L34,44@1610L31,46@1672L24,51@1842L1408,49@1745L1505,85@3297L7336,85@3260L7373:CreateBoardDialog.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(token) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(context) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1935495905, $dirty2, -1, "com.yhchat.canarys.ui.community.CreateBoardDialog (CreateBoardDialog.kt:40)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -290720194, "CC(remember):CreateBoardDialog.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState boardName$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -290718498, "CC(remember):CreateBoardDialog.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            MutableState avatarUrl$delegate3 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -290716799, "CC(remember):CreateBoardDialog.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                avatarUrl$delegate = avatarUrl$delegate3;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            } else {
                avatarUrl$delegate = avatarUrl$delegate3;
            }
            MutableState isLoading$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -290714914, "CC(remember):CreateBoardDialog.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                isLoading$delegate = isLoading$delegate2;
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue4 = objMutableStateOf$default4;
            } else {
                isLoading$delegate = isLoading$delegate2;
            }
            final MutableState errorMessage$delegate3 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(objRememberedValue5);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ActivityResultContracts.GetContent getContent = new ActivityResultContracts.GetContent();
            ComposerKt.sourceInformationMarkerStart($composer3, -290706113, "CC(remember):CreateBoardDialog.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(coroutineScope) | $composer3.changedInstance(context) | (($dirty2 & 14) == 4);
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                final MutableState isLoading$delegate3 = isLoading$delegate;
                final MutableState avatarUrl$delegate4 = avatarUrl$delegate;
                objRememberedValue6 = new Function1() { // from class: com.yhchat.canarys.ui.community.CreateBoardDialogKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateBoardDialogKt.CreateBoardDialog$lambda$12$0(coroutineScope, context, token, isLoading$delegate3, avatarUrl$delegate4, errorMessage$delegate3, (Uri) obj);
                    }
                };
                errorMessage$delegate = errorMessage$delegate3;
                errorMessage$delegate2 = isLoading$delegate3;
                avatarUrl$delegate2 = avatarUrl$delegate4;
                $composer3.updateRememberedValue(objRememberedValue6);
            } else {
                errorMessage$delegate = errorMessage$delegate3;
                errorMessage$delegate2 = isLoading$delegate;
                avatarUrl$delegate2 = avatarUrl$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final ManagedActivityResultLauncher imagePickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent, (Function1) objRememberedValue6, $composer3, 0);
            AndroidDialog_androidKt.Dialog(onDismiss, null, ComposableLambdaKt.rememberComposableLambda(-1175728472, true, new Function2() { // from class: com.yhchat.canarys.ui.community.CreateBoardDialogKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateBoardDialogKt.CreateBoardDialog$lambda$13(onDismiss, imagePickerLauncher, context, avatarUrl$delegate2, boardName$delegate, errorMessage$delegate2, errorMessage$delegate, viewModel, token, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), $composer3, (($dirty2 >> 9) & 14) | 384, 2);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.CreateBoardDialogKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateBoardDialogKt.CreateBoardDialog$lambda$14(token, viewModel, context, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String CreateBoardDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String CreateBoardDialog$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean CreateBoardDialog$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CreateBoardDialog$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String CreateBoardDialog$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBoardDialog$lambda$12$0(CoroutineScope $coroutineScope, Context $context, String $token, MutableState $isLoading$delegate, MutableState $avatarUrl$delegate, MutableState $errorMessage$delegate, Uri uri) {
        if (uri != null) {
            BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new C3490x92f80ae2($context, $token, uri, $isLoading$delegate, $avatarUrl$delegate, $errorMessage$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBoardDialog$lambda$13(final Function0 $onDismiss, final ManagedActivityResultLauncher $imagePickerLauncher, final Context $context, final MutableState $avatarUrl$delegate, final MutableState $boardName$delegate, final MutableState $isLoading$delegate, final MutableState $errorMessage$delegate, final CommunityViewModel $viewModel, final String $token, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C91@3499L38,92@3548L7079,86@3307L7320:CreateBoardDialog.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1175728472, $changed, -1, "com.yhchat.canarys.ui.community.CreateBoardDialog.<anonymous> (CreateBoardDialog.kt:86)");
            }
            CardKt.Card(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(8), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1681350154, true, new Function3() { // from class: com.yhchat.canarys.ui.community.CreateBoardDialogKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return CreateBoardDialogKt.CreateBoardDialog$lambda$13$0($onDismiss, $imagePickerLauncher, $context, $avatarUrl$delegate, $boardName$delegate, $isLoading$delegate, $errorMessage$delegate, $viewModel, $token, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0af8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit CreateBoardDialog$lambda$13$0(final kotlin.jvm.functions.Function0 r115, final androidx.activity.compose.ManagedActivityResultLauncher r116, final android.content.Context r117, final androidx.compose.runtime.MutableState r118, final androidx.compose.runtime.MutableState r119, final androidx.compose.runtime.MutableState r120, final androidx.compose.runtime.MutableState r121, final com.yhchat.canarys.p007ui.community.CommunityViewModel r122, final java.lang.String r123, androidx.compose.foundation.layout.ColumnScope r124, androidx.compose.runtime.Composer r125, int r126) {
        /*
            Method dump skipped, instructions count: 2820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.CreateBoardDialogKt.CreateBoardDialog$lambda$13$0(kotlin.jvm.functions.Function0, androidx.activity.compose.ManagedActivityResultLauncher, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, com.yhchat.canarys.ui.community.CommunityViewModel, java.lang.String, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBoardDialog$lambda$13$0$0$1$0$0(ManagedActivityResultLauncher $imagePickerLauncher) {
        $imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBoardDialog$lambda$13$0$0$2$0(MutableState $boardName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $boardName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBoardDialog$lambda$13$0$0$3$0$0(CommunityViewModel $viewModel, final String $token, final MutableState $boardName$delegate, final MutableState $errorMessage$delegate, MutableState $avatarUrl$delegate, final MutableState $isLoading$delegate, final Function0 $onDismiss, final Context $context) {
        if (!StringsKt.isBlank(CreateBoardDialog$lambda$1($boardName$delegate))) {
            if (!StringsKt.isBlank(CreateBoardDialog$lambda$4($avatarUrl$delegate))) {
                CreateBoardDialog$lambda$8($isLoading$delegate, true);
                $viewModel.createBoard($token, CreateBoardDialog$lambda$1($boardName$delegate), CreateBoardDialog$lambda$4($avatarUrl$delegate), new Function1() { // from class: com.yhchat.canarys.ui.community.CreateBoardDialogKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateBoardDialogKt.CreateBoardDialog$lambda$13$0$0$3$0$0$0($onDismiss, $context, $isLoading$delegate, $token, $boardName$delegate, ((Integer) obj).intValue());
                    }
                }, new Function1() { // from class: com.yhchat.canarys.ui.community.CreateBoardDialogKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateBoardDialogKt.CreateBoardDialog$lambda$13$0$0$3$0$0$1($isLoading$delegate, $errorMessage$delegate, (String) obj);
                    }
                });
                return Unit.INSTANCE;
            }
            $errorMessage$delegate.setValue("\u8bf7\u9009\u62e9\u5206\u533a\u5934\u50cf");
            return Unit.INSTANCE;
        }
        $errorMessage$delegate.setValue("\u8bf7\u8f93\u5165\u5206\u533a\u540d\u79f0");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBoardDialog$lambda$13$0$0$3$0$0$0(Function0 $onDismiss, Context $context, MutableState $isLoading$delegate, String $token, MutableState $boardName$delegate, int boardId) {
        CreateBoardDialog$lambda$8($isLoading$delegate, false);
        $onDismiss.invoke();
        Intent intent = new Intent($context, (Class<?>) BoardDetailActivity.class);
        intent.putExtra("board_id", boardId);
        intent.putExtra("board_name", CreateBoardDialog$lambda$1($boardName$delegate));
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBoardDialog$lambda$13$0$0$3$0$0$1(MutableState $isLoading$delegate, MutableState $errorMessage$delegate, String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        CreateBoardDialog$lambda$8($isLoading$delegate, false);
        $errorMessage$delegate.setValue(error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBoardDialog$lambda$13$0$0$3$1(MutableState $isLoading$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:CreateBoardDialog.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-678319979, $changed, -1, "com.yhchat.canarys.ui.community.CreateBoardDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateBoardDialog.kt:247)");
            }
            if (CreateBoardDialog$lambda$7($isLoading$delegate)) {
                $composer.startReplaceGroup(-9318967);
                ComposerKt.sourceInformation($composer, "248@10293L172");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-9091861);
                ComposerKt.sourceInformation($composer, "253@10527L10");
                TextKt.m3359Text4IGK_g("\u521b\u5efa", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
