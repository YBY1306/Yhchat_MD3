package com.yhchat.canarys.p007ui.profile;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
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
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.thegrizzlylabs.sardineandroid.util.SardineUtil;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmailModificationActivity.kt */
@Metadata(m168d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0007\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005\u00b2\u0006\n\u0010\u0006\u001a\u00020\u0007X\u008a\u008e\u0002\u00b2\u0006\n\u0010\b\u001a\u00020\u0007X\u008a\u008e\u0002\u00b2\u0006\n\u0010\t\u001a\u00020\u0007X\u008a\u008e\u0002\u00b2\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002\u00b2\u0006\n\u0010\f\u001a\u00020\u0007X\u008a\u008e\u0002\u00b2\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000f\u001a\u00020\u000bX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, m169d2 = {"EmailModificationScreen", "", "onBackClick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", NotificationCompat.CATEGORY_EMAIL, "", "emailVerificationCode", "captchaCode", "isLoading", "", "captchaId", "captchaBitmap", "Landroid/graphics/Bitmap;", "isGettingEmailCode", "emailCodeCountdown", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final class EmailModificationActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$28(Function0 function0, int i, Composer composer, int i2) {
        EmailModificationScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r16v6 */
    public static final void EmailModificationScreen(final Function0<Unit> onBackClick, Composer $composer, final int $changed) {
        int i;
        Context context;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer2 = $composer.startRestartGroup(-166901723);
        ComposerKt.sourceInformation($composer2, "C(EmailModificationScreen)N(onBackClick)68@2281L7,69@2337L278,77@2641L24,78@2688L21,80@2732L31,81@2797L31,82@2852L31,83@2905L34,84@2961L31,85@3018L59,88@3128L34,89@3193L30,92@3267L124,92@3246L145,100@3449L131,100@3414L166,108@3617L541,126@4165L9715,107@3590L10290:EmailModificationActivity.kt#ahnxbw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(onBackClick) ? 4 : 2;
        }
        if ($composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-166901723, $dirty, -1, "com.yhchat.canarys.ui.profile.EmailModificationScreen (EmailModificationActivity.kt:67)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context2 = (Context) objConsume;
            ViewModelProvider.Factory factory = new ViewModelProvider.Factory() { // from class: com.yhchat.canarys.ui.profile.EmailModificationActivityKt$EmailModificationScreen$viewModel$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public /* bridge */ <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
                    return (T) super.create(cls, creationExtras);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public /* bridge */ <T extends ViewModel> T create(KClass<T> kClass, CreationExtras creationExtras) {
                    return (T) super.create(kClass, creationExtras);
                }

                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new EmailModificationViewModel(context2);
                }
            };
            ComposerKt.sourceInformationMarkerStart($composer2, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer2, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EmailModificationViewModel.class), current, (String) null, factory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, $composer2, ((0 << 3) & 112) | ((0 << 3) & 896) | ((0 << 3) & 7168) | (57344 & (0 << 3)), 0);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final EmailModificationViewModel viewModel2 = (EmailModificationViewModel) viewModel;
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
                $composer2.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue = objCreateCompositionCoroutineScope;
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ScrollState scrollState = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -1478748412, "CC(remember):EmailModificationActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                i = 0;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            } else {
                i = 0;
            }
            final MutableState email$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1478746332, "CC(remember):EmailModificationActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            final MutableState emailVerificationCode$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1478744572, "CC(remember):EmailModificationActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            }
            final MutableState captchaCode$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1478742873, "CC(remember):EmailModificationActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                context = context2;
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf((boolean) i), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue5 = objMutableStateOf$default4;
            } else {
                context = context2;
            }
            final MutableState isLoading$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1478741084, "CC(remember):EmailModificationActivity.kt#9igjgp");
            Object objRememberedValue6 = $composer2.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue6 = objMutableStateOf$default5;
            }
            final MutableState captchaId$delegate = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1478739232, "CC(remember):EmailModificationActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer2.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue7 = objMutableStateOf$default6;
            }
            final MutableState captchaBitmap$delegate = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1478735737, "CC(remember):EmailModificationActivity.kt#9igjgp");
            Object objRememberedValue8 = $composer2.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf((boolean) i), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default7);
                objRememberedValue8 = objMutableStateOf$default7;
            }
            final MutableState isGettingEmailCode$delegate = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1478733661, "CC(remember):EmailModificationActivity.kt#9igjgp");
            Object objRememberedValue9 = $composer2.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(i), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default8);
                objRememberedValue9 = objMutableStateOf$default8;
            }
            final MutableState emailCodeCountdown$delegate = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -1478731199, "CC(remember):EmailModificationActivity.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(viewModel2);
            Object objRememberedValue10 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new EmailModificationActivityKt$EmailModificationScreen$1$1(viewModel2, captchaId$delegate, captchaBitmap$delegate, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue10 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, $composer2, 6);
            Integer numValueOf = Integer.valueOf(EmailModificationScreen$lambda$22(emailCodeCountdown$delegate));
            ComposerKt.sourceInformationMarkerStart($composer2, -1478725368, "CC(remember):EmailModificationActivity.kt#9igjgp");
            Object objRememberedValue11 = $composer2.rememberedValue();
            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new EmailModificationActivityKt$EmailModificationScreen$2$1(emailCodeCountdown$delegate, null);
                $composer2.updateRememberedValue(obj2);
                objRememberedValue11 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(numValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, $composer2, i);
            final Context context3 = context;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(1154466273, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.EmailModificationActivityKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return EmailModificationActivityKt.EmailModificationScreen$lambda$26(onBackClick, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(346429686, true, new Function3() { // from class: com.yhchat.canarys.ui.profile.EmailModificationActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return EmailModificationActivityKt.EmailModificationScreen$lambda$27(scrollState, coroutineScope, viewModel2, context3, captchaId$delegate, captchaBitmap$delegate, captchaCode$delegate, email$delegate, emailVerificationCode$delegate, isGettingEmailCode$delegate, emailCodeCountdown$delegate, isLoading$delegate, (PaddingValues) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.EmailModificationActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return EmailModificationActivityKt.EmailModificationScreen$lambda$28(onBackClick, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EmailModificationScreen$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EmailModificationScreen$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EmailModificationScreen$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean EmailModificationScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EmailModificationScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String EmailModificationScreen$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final Bitmap EmailModificationScreen$lambda$16(MutableState<Bitmap> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean EmailModificationScreen$lambda$19(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EmailModificationScreen$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int EmailModificationScreen$lambda$22(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EmailModificationScreen$lambda$23(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$26(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C116@3860L274,109@3631L517:EmailModificationActivity.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154466273, $changed, -1, "com.yhchat.canarys.ui.profile.EmailModificationScreen.<anonymous> (EmailModificationActivity.kt:109)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$EmailModificationActivityKt.INSTANCE.m11507getLambda$1830595163$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-1740534873, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.EmailModificationActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmailModificationActivityKt.EmailModificationScreen$lambda$26$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$26$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C117@3882L234:EmailModificationActivity.kt#ahnxbw");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1740534873, $changed, -1, "com.yhchat.canarys.ui.profile.EmailModificationScreen.<anonymous>.<anonymous> (EmailModificationActivity.kt:117)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$EmailModificationActivityKt.INSTANCE.m11512getLambda$925243196$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0687  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit EmailModificationScreen$lambda$27(androidx.compose.foundation.ScrollState r98, final kotlinx.coroutines.CoroutineScope r99, com.yhchat.canarys.p007ui.profile.EmailModificationViewModel r100, final android.content.Context r101, final androidx.compose.runtime.MutableState r102, final androidx.compose.runtime.MutableState r103, final androidx.compose.runtime.MutableState r104, final androidx.compose.runtime.MutableState r105, final androidx.compose.runtime.MutableState r106, final androidx.compose.runtime.MutableState r107, final androidx.compose.runtime.MutableState r108, final androidx.compose.runtime.MutableState r109, androidx.compose.foundation.layout.PaddingValues r110, androidx.compose.runtime.Composer r111, int r112) {
        /*
            Method dump skipped, instructions count: 1689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.EmailModificationActivityKt.EmailModificationScreen$lambda$27(androidx.compose.foundation.ScrollState, kotlinx.coroutines.CoroutineScope, com.yhchat.canarys.ui.profile.EmailModificationViewModel, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x048b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit EmailModificationScreen$lambda$27$0$0(final com.yhchat.canarys.p007ui.profile.EmailModificationViewModel r88, final androidx.compose.runtime.MutableState r89, androidx.compose.runtime.MutableState r90, final androidx.compose.runtime.MutableState r91, androidx.compose.foundation.layout.ColumnScope r92, androidx.compose.runtime.Composer r93, int r94) {
        /*
            Method dump skipped, instructions count: 1179
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.EmailModificationActivityKt.EmailModificationScreen$lambda$27$0$0(com.yhchat.canarys.ui.profile.EmailModificationViewModel, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$27$0$0$0$0$0$0(EmailModificationViewModel $viewModel, final MutableState $captchaId$delegate, final MutableState $captchaBitmap$delegate) {
        $viewModel.getCaptcha(new Function2() { // from class: com.yhchat.canarys.ui.profile.EmailModificationActivityKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EmailModificationActivityKt.EmailModificationScreen$lambda$27$0$0$0$0$0$0$0($captchaId$delegate, $captchaBitmap$delegate, (String) obj, (Bitmap) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$27$0$0$0$0$0$0$0(MutableState $captchaId$delegate, MutableState $captchaBitmap$delegate, String id, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(id, "id");
        $captchaId$delegate.setValue(id);
        $captchaBitmap$delegate.setValue(bitmap);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$27$0$0$0$2$0(MutableState $captchaCode$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $captchaCode$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$27$0$1$0(MutableState $email$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $email$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$27$0$2$0$0(MutableState $emailVerificationCode$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $emailVerificationCode$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$27$0$2$1$0(CoroutineScope $coroutineScope, Context $context, MutableState $email$delegate, MutableState $captchaCode$delegate, MutableState $captchaId$delegate, MutableState $isGettingEmailCode$delegate, EmailModificationViewModel $viewModel, MutableState $emailCodeCountdown$delegate, MutableState $captchaBitmap$delegate) {
        if (!StringsKt.isBlank(EmailModificationScreen$lambda$1($email$delegate)) && !StringsKt.isBlank(EmailModificationScreen$lambda$7($captchaCode$delegate)) && !StringsKt.isBlank(EmailModificationScreen$lambda$13($captchaId$delegate))) {
            EmailModificationScreen$lambda$20($isGettingEmailCode$delegate, true);
            BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1($viewModel, $email$delegate, $captchaCode$delegate, $captchaId$delegate, $context, $isGettingEmailCode$delegate, $emailCodeCountdown$delegate, $captchaBitmap$delegate, null), 3, null);
        } else {
            Toast.makeText($context, "\u8bf7\u5148\u586b\u5199\u90ae\u7bb1\u548c\u9a8c\u8bc1\u7801", 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$27$0$2$2(MutableState $isGettingEmailCode$delegate, MutableState $emailCodeCountdown$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:EmailModificationActivity.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1026645440, $changed, -1, "com.yhchat.canarys.ui.profile.EmailModificationScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (EmailModificationActivity.kt:290)");
            }
            if (EmailModificationScreen$lambda$19($isGettingEmailCode$delegate)) {
                $composer.startReplaceGroup(332240306);
                ComposerKt.sourceInformation($composer, "291@11320L160");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else if (EmailModificationScreen$lambda$22($emailCodeCountdown$delegate) > 0) {
                $composer.startReplaceGroup(332476340);
                ComposerKt.sourceInformation($composer, "296@11562L30");
                TextKt.m3359Text4IGK_g(EmailModificationScreen$lambda$22($emailCodeCountdown$delegate) + SardineUtil.CUSTOM_NAMESPACE_PREFIX, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(332559141);
                ComposerKt.sourceInformation($composer, "298@11646L13");
                TextKt.m3359Text4IGK_g("\u83b7\u53d6\u9a8c\u8bc1\u7801", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$27$0$3$0(CoroutineScope $coroutineScope, Context $context, MutableState $email$delegate, MutableState $emailVerificationCode$delegate, MutableState $isLoading$delegate, EmailModificationViewModel $viewModel) {
        if (StringsKt.isBlank(EmailModificationScreen$lambda$1($email$delegate)) || StringsKt.isBlank(EmailModificationScreen$lambda$4($emailVerificationCode$delegate))) {
            Toast.makeText($context, "\u8bf7\u586b\u5199\u5b8c\u6574\u4fe1\u606f", 0).show();
        } else {
            EmailModificationScreen$lambda$11($isLoading$delegate, true);
            BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new EmailModificationActivityKt$EmailModificationScreen$4$1$4$1$1($viewModel, $email$delegate, $emailVerificationCode$delegate, $context, $isLoading$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailModificationScreen$lambda$27$0$4(MutableState $isLoading$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:EmailModificationActivity.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-573441700, $changed, -1, "com.yhchat.canarys.ui.profile.EmailModificationScreen.<anonymous>.<anonymous>.<anonymous> (EmailModificationActivity.kt:335)");
            }
            if (EmailModificationScreen$lambda$10($isLoading$delegate)) {
                $composer.startReplaceGroup(1978280077);
                ComposerKt.sourceInformation($composer, "339@13554L11,336@13380L217");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1978540105);
                ComposerKt.sourceInformation($composer, "344@13734L10,342@13643L189");
                TextKt.m3359Text4IGK_g("\u786e\u5b9a\u4fee\u6539", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
