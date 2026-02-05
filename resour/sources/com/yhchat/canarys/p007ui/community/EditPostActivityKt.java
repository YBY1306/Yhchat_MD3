package com.yhchat.canarys.p007ui.community;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EditPostActivity.kt */
@Metadata(m168d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0018\u001a\u00020\u0015X\u008a\u008e\u0002"}, m169d2 = {"EditPostScreen", "", "postId", "", "token", "", "originalTitle", "originalContent", "originalContentType", "viewModel", "Lcom/yhchat/canarys/ui/community/EditPostViewModel;", "onBackClick", "Lkotlin/Function0;", "onPostUpdated", "modifier", "Landroidx/compose/ui/Modifier;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/yhchat/canarys/ui/community/EditPostViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "title", "content", "isMarkdownMode", "", "editPostState", "Lcom/yhchat/canarys/ui/community/EditPostState;", "showExitDialog"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class EditPostActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$16(int i, String str, String str2, String str3, int i2, EditPostViewModel editPostViewModel, Function0 function0, Function0 function02, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        EditPostScreen(i, str, str2, str3, i2, editPostViewModel, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    public static final void EditPostScreen(final int postId, final String token, final String originalTitle, final String originalContent, final int originalContentType, final EditPostViewModel viewModel, final Function0<Unit> onBackClick, final Function0<Unit> onPostUpdated, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final int i2;
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        final MutableState content$delegate;
        final MutableState title$delegate;
        final MutableState isMarkdownMode$delegate;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(originalTitle, "originalTitle");
        Intrinsics.checkNotNullParameter(originalContent, "originalContent");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onPostUpdated, "onPostUpdated");
        Composer $composer3 = $composer.startRestartGroup(-166234517);
        ComposerKt.sourceInformation($composer3, "C(EditPostScreen)N(postId,token,originalTitle,originalContent,originalContentType,viewModel,onBackClick,onPostUpdated,modifier)78@2743L42,79@2805L44,80@2876L53,82@2984L16,85@3049L34,88@3147L84,88@3107L124,95@3267L232,95@3255L244,106@3591L11,107@3620L8640,104@3509L8751:EditPostActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            i2 = postId;
            $dirty |= $composer3.changed(i2) ? 4 : 2;
        } else {
            i2 = postId;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(token) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(originalTitle) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(originalContent) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changed(originalContentType) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(viewModel) ? 131072 : 65536;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 1048576 : 524288;
        }
        if ((12582912 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(onPostUpdated) ? 8388608 : 4194304;
        }
        int i3 = i & 256;
        if (i3 != 0) {
            $dirty |= 100663296;
            modifier2 = modifier;
        } else if (($changed & 100663296) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            modifier2 = modifier;
        }
        if ($composer3.shouldExecute(($dirty & 38347923) != 38347922, $dirty & 1)) {
            if (i3 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-166234517, $dirty, -1, "com.yhchat.canarys.ui.community.EditPostScreen (EditPostActivity.kt:77)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -837571531, "CC(remember):EditPostActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(originalTitle, null, 2, null);
                $composer3.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue = mutableStateMutableStateOf$default;
            }
            MutableState title$delegate2 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -837569545, "CC(remember):EditPostActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(originalContent, null, 2, null);
                $composer3.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue2 = mutableStateMutableStateOf$default2;
            }
            MutableState content$delegate2 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -837567264, "CC(remember):EditPostActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(originalContentType == 2), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue3 = objMutableStateOf$default;
            }
            MutableState isMarkdownMode$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final State editPostState$delegate = SnapshotStateKt.collectAsState(viewModel.getEditPostState(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, -837561747, "CC(remember):EditPostActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue4 = objMutableStateOf$default2;
            }
            final MutableState showExitDialog$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Boolean boolValueOf = Boolean.valueOf(EditPostScreen$lambda$9(editPostState$delegate).isSuccess());
            ComposerKt.sourceInformationMarkerStart($composer3, -837558561, "CC(remember):EditPostActivity.kt#9igjgp");
            boolean zChanged = $composer3.changed(editPostState$delegate) | ((29360128 & $dirty) == 8388608);
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new EditPostActivityKt$EditPostScreen$1$1(onPostUpdated, editPostState$delegate, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue5 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, $composer3, 0);
            ComposerKt.sourceInformationMarkerStart($composer3, -837554573, "CC(remember):EditPostActivity.kt#9igjgp");
            boolean z = (($dirty & 896) == 256) | (($dirty & 7168) == 2048) | ((57344 & $dirty) == 16384) | ((3670016 & $dirty) == 1048576);
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (z || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                content$delegate = content$delegate2;
                title$delegate = title$delegate2;
                isMarkdownMode$delegate = isMarkdownMode$delegate2;
                objRememberedValue6 = new Function0() { // from class: com.yhchat.canarys.ui.community.EditPostActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditPostActivityKt.EditPostScreen$lambda$14$0(originalTitle, originalContent, originalContentType, onBackClick, title$delegate, content$delegate, isMarkdownMode$delegate, showExitDialog$delegate);
                    }
                };
                $composer3.updateRememberedValue(objRememberedValue6);
            } else {
                content$delegate = content$delegate2;
                title$delegate = title$delegate2;
                isMarkdownMode$delegate = isMarkdownMode$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue6, $composer3, 0, 1);
            Modifier modifier4 = modifier2;
            $composer2 = $composer3;
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-2130403088, true, new Function2() { // from class: com.yhchat.canarys.ui.community.EditPostActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return EditPostActivityKt.EditPostScreen$lambda$15(originalTitle, originalContent, originalContentType, onBackClick, title$delegate, content$delegate, isMarkdownMode$delegate, showExitDialog$delegate, viewModel, token, i2, editPostState$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.EditPostActivityKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return EditPostActivityKt.EditPostScreen$lambda$16(postId, token, originalTitle, originalContent, originalContentType, viewModel, onBackClick, onPostUpdated, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final String EditPostScreen$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String EditPostScreen$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean EditPostScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void EditPostScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EditPostState EditPostScreen$lambda$9(State<EditPostState> state) {
        return (EditPostState) state.getValue();
    }

    private static final boolean EditPostScreen$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void EditPostScreen$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit EditPostScreen$lambda$14$0(java.lang.String r2, java.lang.String r3, int r4, kotlin.jvm.functions.Function0 r5, androidx.compose.runtime.MutableState r6, androidx.compose.runtime.MutableState r7, androidx.compose.runtime.MutableState r8, androidx.compose.runtime.MutableState r9) {
        /*
            java.lang.String r0 = EditPostScreen$lambda$1(r6)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            r1 = 1
            if (r0 == 0) goto L25
            java.lang.String r0 = EditPostScreen$lambda$4(r7)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L25
            boolean r0 = EditPostScreen$lambda$7(r8)
            if (r0 == 0) goto L1d
            r0 = 2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 == r4) goto L21
            goto L25
        L21:
            r5.invoke()
            goto L28
        L25:
            EditPostScreen$lambda$12(r9, r1)
        L28:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.EditPostActivityKt.EditPostScreen$lambda$14$0(java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0493  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0850  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit EditPostScreen$lambda$15(final java.lang.String r115, final java.lang.String r116, final int r117, final kotlin.jvm.functions.Function0 r118, final androidx.compose.runtime.MutableState r119, final androidx.compose.runtime.MutableState r120, final androidx.compose.runtime.MutableState r121, final androidx.compose.runtime.MutableState r122, final com.yhchat.canarys.p007ui.community.EditPostViewModel r123, final java.lang.String r124, final int r125, final androidx.compose.runtime.State r126, androidx.compose.runtime.Composer r127, int r128) {
        /*
            Method dump skipped, instructions count: 2153
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.EditPostActivityKt.EditPostScreen$lambda$15(java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, com.yhchat.canarys.ui.community.EditPostViewModel, java.lang.String, int, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$0(final String $originalTitle, final String $originalContent, final int $originalContentType, final Function0 $onBackClick, final MutableState $title$delegate, final MutableState $content$delegate, final MutableState $isMarkdownMode$delegate, final MutableState $showExitDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C121@4073L344,121@4052L567:EditPostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1860001696, $changed, -1, "com.yhchat.canarys.ui.community.EditPostScreen.<anonymous>.<anonymous>.<anonymous> (EditPostActivity.kt:121)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -755233000, "CC(remember):EditPostActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($originalTitle) | $composer.changed($originalContent) | $composer.changed($originalContentType) | $composer.changed($onBackClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.EditPostActivityKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditPostActivityKt.EditPostScreen$lambda$15$0$0$0$0($originalTitle, $originalContent, $originalContentType, $onBackClick, $title$delegate, $content$delegate, $isMarkdownMode$delegate, $showExitDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$EditPostActivityKt.INSTANCE.getLambda$92440931$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit EditPostScreen$lambda$15$0$0$0$0(java.lang.String r2, java.lang.String r3, int r4, kotlin.jvm.functions.Function0 r5, androidx.compose.runtime.MutableState r6, androidx.compose.runtime.MutableState r7, androidx.compose.runtime.MutableState r8, androidx.compose.runtime.MutableState r9) {
        /*
            java.lang.String r0 = EditPostScreen$lambda$1(r6)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            r1 = 1
            if (r0 == 0) goto L25
            java.lang.String r0 = EditPostScreen$lambda$4(r7)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r0 == 0) goto L25
            boolean r0 = EditPostScreen$lambda$7(r8)
            if (r0 == 0) goto L1d
            r0 = 2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r0 == r4) goto L21
            goto L25
        L21:
            r5.invoke()
            goto L28
        L25:
            EditPostScreen$lambda$12(r9, r1)
        L28:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.EditPostActivityKt.EditPostScreen$lambda$15$0$0$0$0(java.lang.String, java.lang.String, int, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$1(final EditPostViewModel $viewModel, final String $token, final int $postId, final MutableState $title$delegate, final MutableState $content$delegate, final MutableState $isMarkdownMode$delegate, final State $editPostState$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C138@4761L524,150@5414L527,137@4715L1226:EditPostActivity.kt#cp0npg");
        boolean z = false;
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1885896873, $changed, -1, "com.yhchat.canarys.ui.community.EditPostScreen.<anonymous>.<anonymous>.<anonymous> (EditPostActivity.kt:137)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 129307555, "CC(remember):EditPostActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($token) | $composer.changed($postId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.EditPostActivityKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditPostActivityKt.EditPostScreen$lambda$15$0$1$0$0($viewModel, $token, $postId, $title$delegate, $content$delegate, $isMarkdownMode$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (!StringsKt.isBlank(EditPostScreen$lambda$1($title$delegate)) && !StringsKt.isBlank(EditPostScreen$lambda$4($content$delegate)) && !EditPostScreen$lambda$9($editPostState$delegate).isLoading()) {
                z = true;
            }
            IconButtonKt.IconButton(function0, null, z, null, null, ComposableLambdaKt.rememberComposableLambda(1256851892, true, new Function2() { // from class: com.yhchat.canarys.ui.community.EditPostActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return EditPostActivityKt.EditPostScreen$lambda$15$0$1$1($editPostState$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$1$0$0(EditPostViewModel $viewModel, String $token, int $postId, MutableState $title$delegate, MutableState $content$delegate, MutableState $isMarkdownMode$delegate) {
        if (!StringsKt.isBlank(EditPostScreen$lambda$1($title$delegate)) && !StringsKt.isBlank(EditPostScreen$lambda$4($content$delegate))) {
            $viewModel.editPost($token, $postId, StringsKt.trim((CharSequence) EditPostScreen$lambda$1($title$delegate)).toString(), StringsKt.trim((CharSequence) EditPostScreen$lambda$4($content$delegate)).toString(), EditPostScreen$lambda$7($isMarkdownMode$delegate) ? 2 : 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$1$1(State $editPostState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:EditPostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1256851892, $changed, -1, "com.yhchat.canarys.ui.community.EditPostScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditPostActivity.kt:151)");
            }
            if (EditPostScreen$lambda$9($editPostState$delegate).isLoading()) {
                $composer.startReplaceGroup(-650110326);
                ComposerKt.sourceInformation($composer, "152@5499L172");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-649878570);
                ComposerKt.sourceInformation($composer, "157@5733L160");
                IconKt.m2816Iconww6aTOc(CheckKt.getCheck(Icons.INSTANCE.getDefault()), "\u4fdd\u5b58", (Modifier) null, 0L, $composer, 48, 12);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$2$0(String $error, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C179@6546L10,180@6615L11,176@6396L269:EditPostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(956685622, $changed, -1, "com.yhchat.canarys.ui.community.EditPostScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditPostActivity.kt:176)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$3$0$0(MutableState $title$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $title$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$3$1$0$0(MutableState $isMarkdownMode$delegate, boolean it) {
        EditPostScreen$lambda$8($isMarkdownMode$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$3$2$0(MutableState $content$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $content$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$3$3(MutableState $isMarkdownMode$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C223@8191L55:EditPostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1267961389, $changed, -1, "com.yhchat.canarys.ui.community.EditPostScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditPostActivity.kt:223)");
            }
            TextKt.m3359Text4IGK_g(EditPostScreen$lambda$7($isMarkdownMode$delegate) ? "\u6587\u7ae0\u5185\u5bb9 (Markdown)" : "\u6587\u7ae0\u5185\u5bb9", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$3$4(MutableState $isMarkdownMode$delegate, Composer $composer, int $changed) {
        String str;
        ComposerKt.sourceInformation($composer, "C226@8332L237:EditPostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(348183436, $changed, -1, "com.yhchat.canarys.ui.community.EditPostScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditPostActivity.kt:226)");
            }
            if (EditPostScreen$lambda$7($isMarkdownMode$delegate)) {
                str = "\u652f\u6301Markdown\u8bed\u6cd5\uff0c\u5982\uff1a\n# \u6807\u9898\n**\u7c97\u4f53**\n*\u659c\u4f53*\n- \u5217\u8868\u9879";
            } else {
                str = "\u8bf7\u8f93\u5165\u6587\u7ae0\u5185\u5bb9...";
            }
            TextKt.m3359Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$3$5$0(EditPostViewModel $viewModel, String $token, int $postId, MutableState $title$delegate, MutableState $content$delegate, MutableState $isMarkdownMode$delegate) {
        if (!StringsKt.isBlank(EditPostScreen$lambda$1($title$delegate)) && !StringsKt.isBlank(EditPostScreen$lambda$4($content$delegate))) {
            $viewModel.editPost($token, $postId, StringsKt.trim((CharSequence) EditPostScreen$lambda$1($title$delegate)).toString(), StringsKt.trim((CharSequence) EditPostScreen$lambda$4($content$delegate)).toString(), EditPostScreen$lambda$7($isMarkdownMode$delegate) ? 2 : 1);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$0$3$6(State $editPostState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C290@11271L55:EditPostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2080822476, $changed, -1, "com.yhchat.canarys.ui.community.EditPostScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EditPostActivity.kt:282)");
            }
            if (EditPostScreen$lambda$9($editPostState$delegate).isLoading()) {
                $composer.startReplaceGroup(519460637);
                ComposerKt.sourceInformation($composer, "286@11117L11,283@10931L233,288@11189L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(508631190);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g(EditPostScreen$lambda$9($editPostState$delegate).isLoading() ? "\u4fdd\u5b58\u4e2d..." : "\u4fdd\u5b58\u4fee\u6539", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$1$0(MutableState $showExitDialog$delegate) {
        EditPostScreen$lambda$12($showExitDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$2(final Function0 $onBackClick, final MutableState $showExitDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C307@11782L120,306@11736L247:EditPostActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402295939, $changed, -1, "com.yhchat.canarys.ui.community.EditPostScreen.<anonymous>.<anonymous> (EditPostActivity.kt:306)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 59343035, "CC(remember):EditPostActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onBackClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.EditPostActivityKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditPostActivityKt.EditPostScreen$lambda$15$2$0$0($onBackClick, $showExitDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$EditPostActivityKt.INSTANCE.m10815getLambda$721122522$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$2$0$0(Function0 $onBackClick, MutableState $showExitDialog$delegate) {
        EditPostScreen$lambda$12($showExitDialog$delegate, false);
        $onBackClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$3(final MutableState $showExitDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C317@12103L26,316@12057L155:EditPostActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2090535487, $changed, -1, "com.yhchat.canarys.ui.community.EditPostScreen.<anonymous>.<anonymous> (EditPostActivity.kt:316)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1040093723, "CC(remember):EditPostActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.EditPostActivityKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EditPostActivityKt.EditPostScreen$lambda$15$3$0$0($showExitDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$EditPostActivityKt.INSTANCE.getLambda$1081013348$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditPostScreen$lambda$15$3$0$0(MutableState $showExitDialog$delegate) {
        EditPostScreen$lambda$12($showExitDialog$delegate, false);
        return Unit.INSTANCE;
    }
}
