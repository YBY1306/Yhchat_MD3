package com.yhchat.canarys.p007ui.settings;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.VisibilityKt;
import androidx.compose.material.icons.filled.VisibilityOffKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.repository.UserRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChangePasswordActivity.kt */
@Metadata(m168d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\n\u00b2\u0006\n\u0010\u000b\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\f\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\r\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000e\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000f\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0010\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0012X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0012X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0016\u001a\u00020\u0012X\u008a\u008e\u0002"}, m169d2 = {"CaptchaImage", "", "captchaImage", "", "onRefresh", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ChangePasswordScreen", "userEmail", "onBackClick", "app_debug", NotificationCompat.CATEGORY_EMAIL, "captchaCode", "captchaId", "emailVerificationCode", HintConstants.AUTOFILL_HINT_NEW_PASSWORD, "confirmPassword", "showPassword", "", "showConfirmPassword", "isLoading", "error", "success"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class ChangePasswordActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CaptchaImage$lambda$6(String str, Function0 function0, int i, Composer composer, int i2) {
        CaptchaImage(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$41(String str, Function0 function0, int i, Composer composer, int i2) {
        ChangePasswordScreen(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0117 A[Catch: Exception -> 0x0134, TryCatch #0 {Exception -> 0x0134, blocks: (B:45:0x00ad, B:47:0x00b5, B:49:0x00d3, B:59:0x010b, B:61:0x0117, B:62:0x0120, B:51:0x00db, B:53:0x00e3, B:55:0x0101), top: B:148:0x00ad }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0120 A[Catch: Exception -> 0x0134, TRY_LEAVE, TryCatch #0 {Exception -> 0x0134, blocks: (B:45:0x00ad, B:47:0x00b5, B:49:0x00d3, B:59:0x010b, B:61:0x0117, B:62:0x0120, B:51:0x00db, B:53:0x00e3, B:55:0x0101), top: B:148:0x00ad }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CaptchaImage(final java.lang.String r55, final kotlin.jvm.functions.Function0<kotlin.Unit> r56, androidx.compose.runtime.Composer r57, final int r58) {
        /*
            Method dump skipped, instructions count: 1387
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.ChangePasswordActivityKt.CaptchaImage(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CaptchaImage$lambda$1$0(Function0 $onRefresh) {
        $onRefresh.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CaptchaImage$lambda$2$0(Function0 $onRefresh) {
        $onRefresh.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CaptchaImage$lambda$4$0(Function0 $onRefresh) {
        $onRefresh.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05ef  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x06b7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0a4a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0aa9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0b40  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b58  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0474  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ChangePasswordScreen(final java.lang.String r109, final kotlin.jvm.functions.Function0<kotlin.Unit> r110, androidx.compose.runtime.Composer r111, final int r112) {
        /*
            Method dump skipped, instructions count: 2938
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.ChangePasswordActivityKt.ChangePasswordScreen(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChangePasswordScreen$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChangePasswordScreen$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChangePasswordScreen$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ChangePasswordScreen$lambda$11(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChangePasswordScreen$lambda$14(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChangePasswordScreen$lambda$17(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ChangePasswordScreen$lambda$20(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ChangePasswordScreen$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChangePasswordScreen$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChangePasswordScreen$lambda$26(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChangePasswordScreen$lambda$27(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChangePasswordScreen$lambda$29(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChangePasswordScreen$lambda$30(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ChangePasswordScreen$lambda$32(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ChangePasswordScreen$lambda$35(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChangePasswordScreen$lambda$36(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChangePasswordScreen$getCaptcha(CoroutineScope scope, UserRepository repository, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4) {
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new ChangePasswordActivityKt$ChangePasswordScreen$getCaptcha$1(repository, mutableState, mutableState2, mutableState3, mutableState4, null), 3, null);
    }

    private static final void ChangePasswordScreen$sendEmailVerificationCode(CoroutineScope scope, MutableState<String> mutableState, MutableState<String> mutableState2, UserRepository repository, MutableState<Boolean> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5) {
        if (!(ChangePasswordScreen$lambda$5(mutableState).length() == 0)) {
            BuildersKt__Builders_commonKt.launch$default(scope, null, null, new C4112xd6bd91bd(repository, mutableState3, mutableState2, mutableState4, mutableState, mutableState5, null), 3, null);
        } else {
            mutableState2.setValue("\u8bf7\u8f93\u5165\u56fe\u7247\u9a8c\u8bc1\u7801");
        }
    }

    private static final void ChangePasswordScreen$changePassword(CoroutineScope scope, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, UserRepository repository, MutableState<Boolean> mutableState5, MutableState<String> mutableState6, MutableState<Boolean> mutableState7) {
        if (!(ChangePasswordScreen$lambda$14(mutableState).length() == 0)) {
            if (!(ChangePasswordScreen$lambda$17(mutableState3).length() == 0)) {
                if (Intrinsics.areEqual(ChangePasswordScreen$lambda$17(mutableState3), ChangePasswordScreen$lambda$20(mutableState4))) {
                    BuildersKt__Builders_commonKt.launch$default(scope, null, null, new ChangePasswordActivityKt$ChangePasswordScreen$changePassword$1(repository, mutableState5, mutableState2, mutableState6, mutableState, mutableState3, mutableState7, null), 3, null);
                    return;
                } else {
                    mutableState2.setValue("\u4e24\u6b21\u8f93\u5165\u7684\u5bc6\u7801\u4e0d\u4e00\u81f4");
                    return;
                }
            }
            mutableState2.setValue("\u8bf7\u8f93\u5165\u65b0\u5bc6\u7801");
            return;
        }
        mutableState2.setValue("\u8bf7\u8f93\u5165\u90ae\u7bb1\u9a8c\u8bc1\u7801");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C255@8814L130:ChangePasswordActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(395440504, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordScreen.<anonymous>.<anonymous> (ChangePasswordActivity.kt:255)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$ChangePasswordActivityKt.INSTANCE.m11670getLambda$1033991403$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$0$0(MutableState $email$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $email$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:67:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0549  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChangePasswordScreen$lambda$38$1$1(final kotlinx.coroutines.CoroutineScope r86, final com.yhchat.canarys.data.repository.UserRepository r87, final androidx.compose.runtime.MutableState r88, final androidx.compose.runtime.MutableState r89, final androidx.compose.runtime.MutableState r90, final androidx.compose.runtime.MutableState r91, final androidx.compose.runtime.MutableState r92, final androidx.compose.runtime.MutableState r93, androidx.compose.foundation.layout.ColumnScope r94, androidx.compose.runtime.Composer r95, int r96) {
        /*
            Method dump skipped, instructions count: 1363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.ChangePasswordActivityKt.ChangePasswordScreen$lambda$38$1$1(kotlinx.coroutines.CoroutineScope, com.yhchat.canarys.data.repository.UserRepository, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$1$0$0(final CoroutineScope $scope, final UserRepository $repository, final MutableState $isLoading$delegate, final MutableState $captchaImage$delegate, final MutableState $error$delegate, final MutableState $captchaId$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Composer composer;
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C:ChangePasswordActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(217742562, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChangePasswordActivity.kt:301)");
            }
            if (ChangePasswordScreen$lambda$29($isLoading$delegate)) {
                $composer.startReplaceGroup(1368103663);
                ComposerKt.sourceInformation($composer, "302@10506L441");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
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
                Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                    composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                    composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
                }
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i3 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1467536941, "C308@10864L11,306@10710L207:ChangePasswordActivity.kt#acwjhs");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0.0f, 0L, 0, $composer, 6, 28);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else if (ChangePasswordScreen$lambda$11($captchaImage$delegate) != null) {
                $composer.startReplaceGroup(1368619875);
                ComposerKt.sourceInformation($composer, "314@11154L16,312@11035L165");
                String strChangePasswordScreen$lambda$11 = ChangePasswordScreen$lambda$11($captchaImage$delegate);
                ComposerKt.sourceInformationMarkerStart($composer, -1202772398, "CC(remember):ChangePasswordActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changedInstance($repository);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.ChangePasswordActivityKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChangePasswordActivityKt.ChangePasswordScreen$lambda$38$1$1$0$0$1$0($scope, $repository, $isLoading$delegate, $error$delegate, $captchaImage$delegate, $captchaId$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                CaptchaImage(strChangePasswordScreen$lambda$11, (Function0) objRememberedValue, $composer, 0);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1368847570);
                ComposerKt.sourceInformation($composer, "317@11262L246");
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default2);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    $composer.createNode(constructor2);
                } else {
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM4376constructorimpl2.getInserting()) {
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i6 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1996583361, "C321@11466L12:ChangePasswordActivity.kt#acwjhs");
                    TextKt.m3359Text4IGK_g("\u70b9\u51fb\u5237\u65b0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 6, 0, 131070);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer.endReplaceGroup();
                } else {
                    composer = $composer;
                }
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                Composer composer22 = composer;
                ComposerKt.sourceInformationMarkerStart(composer22, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                int i62 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer22, -1996583361, "C321@11466L12:ChangePasswordActivity.kt#acwjhs");
                TextKt.m3359Text4IGK_g("\u70b9\u51fb\u5237\u65b0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer22, 6, 0, 131070);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$1$0$0$1$0(CoroutineScope $scope, UserRepository $repository, MutableState $isLoading$delegate, MutableState $error$delegate, MutableState $captchaImage$delegate, MutableState $captchaId$delegate) {
        ChangePasswordScreen$getCaptcha($scope, $repository, $isLoading$delegate, $error$delegate, $captchaImage$delegate, $captchaId$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$1$0$1$0$0(MutableState $captchaCode$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $captchaCode$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$1$0$1$1$0(CoroutineScope $scope, UserRepository $repository, MutableState $isLoading$delegate, MutableState $error$delegate, MutableState $captchaImage$delegate, MutableState $captchaId$delegate) {
        ChangePasswordScreen$getCaptcha($scope, $repository, $isLoading$delegate, $error$delegate, $captchaImage$delegate, $captchaId$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$1$0$2$0(CoroutineScope $scope, MutableState $captchaCode$delegate, MutableState $error$delegate, UserRepository $repository, MutableState $isLoading$delegate, MutableState $email$delegate, MutableState $captchaId$delegate) {
        ChangePasswordScreen$sendEmailVerificationCode($scope, $captchaCode$delegate, $error$delegate, $repository, $isLoading$delegate, $email$delegate, $captchaId$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$2$0(MutableState $emailVerificationCode$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $emailVerificationCode$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$3$0(MutableState $newPassword$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $newPassword$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$4(final MutableState $showPassword$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C375@13598L32,375@13632L284,375@13577L339:ChangePasswordActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-830147731, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordScreen.<anonymous>.<anonymous>.<anonymous> (ChangePasswordActivity.kt:375)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1091948973, "CC(remember):ChangePasswordActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.ChangePasswordActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChangePasswordActivityKt.ChangePasswordScreen$lambda$38$1$4$0$0($showPassword$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-2124421046, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.ChangePasswordActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChangePasswordActivityKt.ChangePasswordScreen$lambda$38$1$4$1($showPassword$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$4$0$0(MutableState $showPassword$delegate) {
        ChangePasswordScreen$lambda$24($showPassword$delegate, !ChangePasswordScreen$lambda$23($showPassword$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$4$1(MutableState $showPassword$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C376@13658L236:ChangePasswordActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2124421046, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChangePasswordActivity.kt:376)");
            }
            IconKt.m2816Iconww6aTOc(ChangePasswordScreen$lambda$23($showPassword$delegate) ? VisibilityKt.getVisibility(Icons.INSTANCE.getDefault()) : VisibilityOffKt.getVisibilityOff(Icons.INSTANCE.getDefault()), ChangePasswordScreen$lambda$23($showPassword$delegate) ? "\u9690\u85cf\u5bc6\u7801" : "\u663e\u793a\u5bc6\u7801", (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$5$0(MutableState $confirmPassword$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $confirmPassword$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$6(final MutableState $showConfirmPassword$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C392@14409L46,392@14457L298,392@14388L367:ChangePasswordActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-236659060, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordScreen.<anonymous>.<anonymous>.<anonymous> (ChangePasswordActivity.kt:392)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 203911450, "CC(remember):ChangePasswordActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.ChangePasswordActivityKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChangePasswordActivityKt.ChangePasswordScreen$lambda$38$1$6$0$0($showConfirmPassword$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-1530932375, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.ChangePasswordActivityKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChangePasswordActivityKt.ChangePasswordScreen$lambda$38$1$6$1($showConfirmPassword$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$6$0$0(MutableState $showConfirmPassword$delegate) {
        ChangePasswordScreen$lambda$27($showConfirmPassword$delegate, !ChangePasswordScreen$lambda$26($showConfirmPassword$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$6$1(MutableState $showConfirmPassword$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C393@14483L250:ChangePasswordActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1530932375, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChangePasswordActivity.kt:393)");
            }
            IconKt.m2816Iconww6aTOc(ChangePasswordScreen$lambda$26($showConfirmPassword$delegate) ? VisibilityKt.getVisibility(Icons.INSTANCE.getDefault()) : VisibilityOffKt.getVisibilityOff(Icons.INSTANCE.getDefault()), ChangePasswordScreen$lambda$26($showConfirmPassword$delegate) ? "\u9690\u85cf\u5bc6\u7801" : "\u663e\u793a\u5bc6\u7801", (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$7(MutableState $error$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C410@15236L11,407@15084L202:ChangePasswordActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2041753615, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordScreen.<anonymous>.<anonymous>.<anonymous> (ChangePasswordActivity.kt:407)");
            }
            String strChangePasswordScreen$lambda$32 = ChangePasswordScreen$lambda$32($error$delegate);
            Intrinsics.checkNotNull(strChangePasswordScreen$lambda$32);
            TextKt.m3359Text4IGK_g(strChangePasswordScreen$lambda$32, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 48, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$8$0(CoroutineScope $scope, MutableState $emailVerificationCode$delegate, MutableState $error$delegate, MutableState $newPassword$delegate, MutableState $confirmPassword$delegate, UserRepository $repository, MutableState $isLoading$delegate, MutableState $email$delegate, MutableState $success$delegate) {
        ChangePasswordScreen$changePassword($scope, $emailVerificationCode$delegate, $error$delegate, $newPassword$delegate, $confirmPassword$delegate, $repository, $isLoading$delegate, $email$delegate, $success$delegate);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$38$1$9(MutableState $isLoading$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C428@15946L12:ChangePasswordActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(728898444, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordScreen.<anonymous>.<anonymous>.<anonymous> (ChangePasswordActivity.kt:421)");
            }
            if (ChangePasswordScreen$lambda$29($isLoading$delegate)) {
                $composer.startReplaceGroup(-741062171);
                ComposerKt.sourceInformation($composer, "424@15808L11,422@15678L173,426@15872L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0.0f, 0L, 0, $composer, 6, 28);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(-756602378);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g("\u66f4\u6539\u5bc6\u7801", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$40(final Function0 $onBackClick, final MutableState $success$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C441@16259L101,440@16217L212:ChangePasswordActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1927627765, $changed, -1, "com.yhchat.canarys.ui.settings.ChangePasswordScreen.<anonymous> (ChangePasswordActivity.kt:440)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1319379610, "CC(remember):ChangePasswordActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onBackClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.ChangePasswordActivityKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChangePasswordActivityKt.ChangePasswordScreen$lambda$40$0$0($onBackClick, $success$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ChangePasswordActivityKt.INSTANCE.m11674getLambda$318327822$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangePasswordScreen$lambda$40$0$0(Function0 $onBackClick, MutableState $success$delegate) {
        ChangePasswordScreen$lambda$36($success$delegate, false);
        $onBackClick.invoke();
        return Unit.INSTANCE;
    }
}
