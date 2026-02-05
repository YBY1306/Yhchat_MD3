package com.yhchat.canarys.p007ui.login;

import androidx.autofill.HintConstants;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.VisibilityKt;
import androidx.compose.material.icons.filled.VisibilityOffKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabPosition;
import androidx.compose.material3.TabRowDefaults;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Brush;
import androidx.compose.p000ui.graphics.Color;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yhchat.canarys.data.model.CaptchaData;
import com.yhchat.canarys.data.repository.TokenRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoginScreen.kt */
@Metadata(m168d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\u001a=\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a2\u0006\u0002\u0010\t\u001aE\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002\u00b2\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0019\u001a\u00020\u0004X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001a\u001a\u00020\u0004X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001b\u001a\u00020\u0004X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001c\u001a\u00020\u0004X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001d\u001a\u00020\u0004X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002\u00b2\u0006\n\u0010 \u001a\u00020\u001fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000b\u001a\u00020\u0004X\u008a\u008e\u0002"}, m169d2 = {"LoginScreen", "", "onLoginSuccess", "Lkotlin/Function2;", "", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "viewModel", "Lcom/yhchat/canarys/ui/login/LoginViewModel;", "(Lkotlin/jvm/functions/Function2;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/ui/login/LoginViewModel;Landroidx/compose/runtime/Composer;II)V", "TokenLoginDialog", "tokenInput", "onTokenChange", "Lkotlin/Function1;", "onConfirm", "Lkotlin/Function0;", "onDismiss", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/login/LoginUiState;", "captchaData", "Lcom/yhchat/canarys/data/model/CaptchaData;", "selectedTab", "", "mobile", "imageCaptcha", "smsCaptcha", NotificationCompat.CATEGORY_EMAIL, HintConstants.AUTOFILL_HINT_PASSWORD, "passwordVisible", "", "showTokenDialog"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class LoginScreenKt {
    public static final Unit LoginScreen$lambda$36(Function2 function2, TokenRepository tokenRepository, LoginViewModel loginViewModel, int i, int i2, Composer composer, int i3) {
        LoginScreen(function2, tokenRepository, loginViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit TokenLoginDialog$lambda$3(String str, Function1 function1, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        TokenLoginDialog(str, function1, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r17v8 */
    public static final void LoginScreen(final Function2<? super String, ? super String, Unit> onLoginSuccess, TokenRepository tokenRepository, LoginViewModel viewModel, Composer $composer, final int $changed, final int i) {
        TokenRepository tokenRepository2;
        LoginViewModel viewModel2;
        final TokenRepository tokenRepository3;
        final LoginViewModel viewModel3;
        TokenRepository tokenRepository4;
        int i2;
        int $dirty;
        TokenRepository tokenRepository5;
        final State uiState$delegate;
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Intrinsics.checkNotNullParameter(onLoginSuccess, "onLoginSuccess");
        Composer $composer2 = $composer.startRestartGroup(-350518042);
        ComposerKt.sourceInformation($composer2, "C(LoginScreen)N(onLoginSuccess,tokenRepository,viewModel)54@2296L16,55@2358L16,58@2441L61,58@2409L93,62@2531L33,63@2583L31,64@2639L31,65@2693L31,66@2742L31,67@2794L31,68@2853L34,69@2915L34,70@2972L31,73@3064L258,73@3027L295,84@3368L38,84@3347L59,88@3434L21,96@3673L11,97@3751L11,98@3813L11,90@3465L13562:LoginScreen.kt#7k7gn0");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(onLoginSuccess) ? 4 : 2;
        }
        int i3 = i & 2;
        if (i3 != 0) {
            $dirty2 |= 48;
            tokenRepository2 = tokenRepository;
        } else if (($changed & 48) == 0) {
            tokenRepository2 = tokenRepository;
            $dirty2 |= $composer2.changedInstance(tokenRepository2) ? 32 : 16;
        } else {
            tokenRepository2 = tokenRepository;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                viewModel2 = viewModel;
                int i4 = $composer2.changedInstance(viewModel2) ? 256 : 128;
                $dirty2 |= i4;
            } else {
                viewModel2 = viewModel;
            }
            $dirty2 |= i4;
        } else {
            viewModel2 = viewModel;
        }
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "52@2243L11");
            if (($changed & 1) == 0 || $composer2.getDefaultsInvalid()) {
                tokenRepository4 = i3 != 0 ? null : tokenRepository2;
                if ((i & 4) != 0) {
                    ComposerKt.sourceInformationMarkerStart($composer2, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer2, 6);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModel viewModel4 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LoginViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, $composer2, ((0 << 3) & 7168) | ((0 << 3) & 112) | ((0 << 3) & 896) | ((0 << 3) & 57344), 0);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    $dirty2 &= -897;
                    viewModel2 = (LoginViewModel) viewModel4;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 4) != 0) {
                    $dirty2 &= -897;
                }
                tokenRepository4 = tokenRepository2;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-350518042, $dirty2, -1, "com.yhchat.canarys.ui.login.LoginScreen (LoginScreen.kt:53)");
            }
            State uiState$delegate2 = SnapshotStateKt.collectAsState(viewModel2.getUiState(), null, $composer2, 0, 1);
            final State captchaData$delegate = SnapshotStateKt.collectAsState(viewModel2.getCaptchaData(), null, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -1840377821, "CC(remember):LoginScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(viewModel2) | $composer2.changedInstance(tokenRepository4);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                i2 = 0;
                Object obj = (Function2) new LoginScreenKt$LoginScreen$1$1(viewModel2, tokenRepository4, null);
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                i2 = 0;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(tokenRepository4, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer2, ($dirty2 >> 3) & 14);
            ComposerKt.sourceInformationMarkerStart($composer2, -1840374969, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(i2);
                $composer2.updateRememberedValue(objMutableIntStateOf);
                objRememberedValue2 = objMutableIntStateOf;
            }
            final MutableIntState selectedTab$delegate = (MutableIntState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1840373307, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                tokenRepository5 = tokenRepository4;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue3 = objMutableStateOf$default;
            } else {
                $dirty = $dirty2;
                tokenRepository5 = tokenRepository4;
            }
            final MutableState mobile$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1840371515, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue4 = objMutableStateOf$default2;
            }
            final MutableState imageCaptcha$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1840369787, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue5 = objMutableStateOf$default3;
            }
            final MutableState smsCaptcha$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1840368219, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue6 = $composer2.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue6 = objMutableStateOf$default4;
            }
            final MutableState email$delegate = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1840366555, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue7 = $composer2.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue7 = objMutableStateOf$default5;
            }
            final MutableState password$delegate = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1840364664, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue8 = $composer2.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf((boolean) i2), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue8 = objMutableStateOf$default6;
            }
            final MutableState passwordVisible$delegate = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1840362680, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue9 = $composer2.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf((boolean) i2), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default7);
                objRememberedValue9 = objMutableStateOf$default7;
            }
            final MutableState showTokenDialog$delegate = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1840360859, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue10 = $composer2.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default8);
                objRememberedValue10 = objMutableStateOf$default8;
            }
            final MutableState tokenInput$delegate = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Boolean boolValueOf = Boolean.valueOf(LoginScreen$lambda$0(uiState$delegate2).getLoginSuccess());
            ComposerKt.sourceInformationMarkerStart($composer2, -1840357688, "CC(remember):LoginScreen.kt#9igjgp");
            boolean zChanged = $composer2.changed(uiState$delegate2) | (($dirty & 14) == 4 ? true : i2);
            Object objRememberedValue11 = $composer2.rememberedValue();
            if (zChanged || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (Function2) new LoginScreenKt$LoginScreen$2$1(onLoginSuccess, uiState$delegate2, null);
                $composer2.updateRememberedValue(obj2);
                objRememberedValue11 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, $composer2, i2);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -1840348180, "CC(remember):LoginScreen.kt#9igjgp");
            boolean zChangedInstance2 = $composer2.changedInstance(viewModel2);
            Object objRememberedValue12 = $composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                uiState$delegate = uiState$delegate2;
                Object obj3 = (Function2) new LoginScreenKt$LoginScreen$3$1(viewModel2, null);
                $composer2.updateRememberedValue(obj3);
                objRememberedValue12 = obj3;
            } else {
                uiState$delegate = uiState$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, $composer2, 6);
            ScrollState scrollState = ScrollKt.rememberScrollState(0, $composer2, 0, 1);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Brush.Companion companion = Brush.INSTANCE;
            long primary = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary();
            Modifier modifierBackground$default = BackgroundKt.background$default(modifierFillMaxSize$default, Brush.Companion.m5013verticalGradient8A3gB4$default(companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m5047boximpl(Color.m5055copywmQWz5c(primary, (14 & 1) != 0 ? Color.m5059getAlphaimpl(primary) : 0.1f, (14 & 2) != 0 ? Color.m5063getRedimpl(primary) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(primary) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(primary) : 0.0f)), Color.m5047boximpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getBackground()), Color.m5047boximpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface())}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierBackground$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
            final LoginViewModel viewModel5 = viewModel2;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i6 = (i5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i7 = ((0 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 265738548, "C104@3930L613,122@4561L12460:LoginScreen.kt#7k7gn0");
            Modifier modifierM1053paddingqDBjuR0 = PaddingKt.m1053paddingqDBjuR0(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopStart()), C1834Dp.m7806constructorimpl(24), C1834Dp.m7806constructorimpl(60), C1834Dp.m7806constructorimpl(24), C1834Dp.m7806constructorimpl(24));
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierM1053paddingqDBjuR0);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i8 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function02 = constructor2;
                $composer2.createNode(function02);
            } else {
                function02 = constructor2;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = (i8 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i10 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -790107069, "C111@4194L10,113@4303L11,109@4119L217,117@4429L10,118@4491L11,115@4349L184:LoginScreen.kt#7k7gn0");
            TextKt.m3359Text4IGK_g("\u4e91\u6e56\u804a\u5929", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getDisplaySmall(), $composer2, 196614, 0, 65498);
            TextKt.m3359Text4IGK_g("\u8fde\u63a5\u4f60\u6211\uff0c\u7545\u4eab\u6c9f\u901a", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getTitleMedium(), $composer2, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierM1054paddingqDBjuR0$default = PaddingKt.m1054paddingqDBjuR0$default(PaddingKt.m1050padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), scrollState, false, null, false, 14, null), C1834Dp.m7806constructorimpl(24)), 0.0f, C1834Dp.m7806constructorimpl(120), 0.0f, 0.0f, 13, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, centerHorizontally, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer2, modifierM1054paddingqDBjuR0$default);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i11 = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function03 = constructor3;
                $composer2.createNode(function03);
            } else {
                function03 = constructor3;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i12 = (i11 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i13 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 1444913060, "C136@5151L11,135@5088L126,138@5229L1313,132@4941L1601,174@6560L41,180@6773L38,182@6906L11,181@6847L92,184@6950L9049,177@6635L9364,370@16025L41,374@16159L26,373@16117L448,387@16591L41,392@16765L10,393@16825L11,390@16678L235,398@16970L41:LoginScreen.kt#7k7gn0");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM1414RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16));
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceVariant();
            CardKt.Card(modifierFillMaxWidth$default, roundedCornerShapeM1414RoundedCornerShape0680j_4, cardDefaults.m2495cardColorsro_MJ88(Color.m5055copywmQWz5c(surfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(surfaceVariant) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(surfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(surfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(surfaceVariant) : 0.0f), 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-208256181, true, new Function3() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return LoginScreenKt.LoginScreen$lambda$32$1$0(selectedTab$delegate, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 196614, 24);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer2, 6);
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(20)), CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(8), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1241383682, true, new Function3() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return LoginScreenKt.LoginScreen$lambda$32$1$1(viewModel5, selectedTab$delegate, captchaData$delegate, uiState$delegate, mobile$delegate, imageCaptcha$delegate, smsCaptcha$delegate, email$delegate, password$delegate, passwordVisible$delegate, (ColumnScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 196614, 16);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer2, 6);
            boolean z = !LoginScreen$lambda$0(uiState$delegate).isLoading();
            Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(48));
            RoundedCornerShape roundedCornerShapeM1414RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer2, 462599027, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue13 = $composer2.rememberedValue();
            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue13 = new Function0() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoginScreenKt.LoginScreen$lambda$32$1$2$0(showTokenDialog$delegate);
                    }
                };
                $composer2.updateRememberedValue(objRememberedValue13);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ButtonKt.OutlinedButton((Function0) objRememberedValue13, modifierM1088height3ABfNKs, z, roundedCornerShapeM1414RoundedCornerShape0680j_42, null, null, null, null, null, ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$4949835$app_debug(), $composer2, 805306422, 496);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer2, 6);
            TextKt.m3359Text4IGK_g("\u767b\u5f55\u5373\u8868\u793a\u540c\u610f\u7528\u6237\u534f\u8bae\u548c\u9690\u79c1\u653f\u7b56", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, 6, 0, 65018);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), $composer2, 6);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (LoginScreen$lambda$25(showTokenDialog$delegate)) {
                $composer2.startReplaceGroup(-1202606568);
                ComposerKt.sourceInformation($composer2, "406@17169L19,407@17214L217,414@17457L87,404@17086L468");
                String strLoginScreen$lambda$28 = LoginScreen$lambda$28(tokenInput$delegate);
                ComposerKt.sourceInformationMarkerStart($composer2, -1839906567, "CC(remember):LoginScreen.kt#9igjgp");
                Object objRememberedValue14 = $composer2.rememberedValue();
                if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function1() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return LoginScreenKt.LoginScreen$lambda$33$0(tokenInput$delegate, (String) obj5);
                        }
                    };
                    $composer2.updateRememberedValue(obj4);
                    objRememberedValue14 = obj4;
                }
                Function1 function1 = (Function1) objRememberedValue14;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1839904929, "CC(remember):LoginScreen.kt#9igjgp");
                boolean zChangedInstance3 = $composer2.changedInstance(viewModel5);
                Object objRememberedValue15 = $composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoginScreenKt.LoginScreen$lambda$34$0(viewModel5, tokenInput$delegate, showTokenDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj5);
                    objRememberedValue15 = obj5;
                }
                Function0 function04 = (Function0) objRememberedValue15;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1839897283, "CC(remember):LoginScreen.kt#9igjgp");
                Object objRememberedValue16 = $composer2.rememberedValue();
                if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                    Object obj6 = new Function0() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoginScreenKt.LoginScreen$lambda$35$0(showTokenDialog$delegate, tokenInput$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj6);
                    objRememberedValue16 = obj6;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                TokenLoginDialog(strLoginScreen$lambda$28, function1, function04, (Function0) objRememberedValue16, $composer2, 3120);
            } else {
                $composer2.startReplaceGroup(-1219561956);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            viewModel3 = viewModel5;
            tokenRepository3 = tokenRepository5;
        } else {
            $composer2.skipToGroupEnd();
            tokenRepository3 = tokenRepository2;
            viewModel3 = viewModel2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    return LoginScreenKt.LoginScreen$lambda$36(onLoginSuccess, tokenRepository3, viewModel3, $changed, i, (Composer) obj7, ((Integer) obj8).intValue());
                }
            });
        }
    }

    public static final LoginUiState LoginScreen$lambda$0(State<LoginUiState> state) {
        return (LoginUiState) state.getValue();
    }

    private static final CaptchaData LoginScreen$lambda$1(State<CaptchaData> state) {
        return (CaptchaData) state.getValue();
    }

    private static final int LoginScreen$lambda$4(MutableIntState $selectedTab$delegate) {
        return $selectedTab$delegate.getIntValue();
    }

    private static final String LoginScreen$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String LoginScreen$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String LoginScreen$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String LoginScreen$lambda$16(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String LoginScreen$lambda$19(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean LoginScreen$lambda$22(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void LoginScreen$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean LoginScreen$lambda$25(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void LoginScreen$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String LoginScreen$lambda$28(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit LoginScreen$lambda$32$1$0(final MutableIntState $selectedTab$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C143@5431L299,150@5745L787,139@5243L1289:LoginScreen.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208256181, $changed, -1, "com.yhchat.canarys.ui.login.LoginScreen.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:139)");
            }
            TabRowKt.m3264TabRowpAZo6Ak(LoginScreen$lambda$4($selectedTab$delegate), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Color.INSTANCE.m5092getTransparent0d7_KjU(), 0L, ComposableLambdaKt.rememberComposableLambda(1391538403, true, new Function3() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return LoginScreenKt.LoginScreen$lambda$32$1$0$0($selectedTab$delegate, (List) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1247550749, true, new Function2() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoginScreenKt.LoginScreen$lambda$32$1$0$1($selectedTab$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 1597872, 40);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$0$0(MutableIntState $selectedTab$delegate, List tabPositions, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(tabPositions, "tabPositions");
        ComposerKt.sourceInformation($composer, "CN(tabPositions)146@5632L11,144@5484L228:LoginScreen.kt#7k7gn0");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1391538403, $changed, -1, "com.yhchat.canarys.ui.login.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:144)");
        }
        TabRowDefaults.INSTANCE.m3252Indicator9IZ8Weo(TabRowDefaults.INSTANCE.tabIndicatorOffset(Modifier.INSTANCE, (TabPosition) tabPositions.get(LoginScreen$lambda$4($selectedTab$delegate))), C1834Dp.m7806constructorimpl(3), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, (TabRowDefaults.$stable << 9) | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$0$1(final MutableIntState $selectedTab$delegate, Composer $composer, int $changed) {
        final MutableIntState mutableIntState;
        ComposerKt.sourceInformation($composer, "C153@5847L19,154@5895L219,151@5763L369,163@6233L19,164@6281L219,161@6149L369:LoginScreen.kt#7k7gn0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1247550749, $changed, -1, "com.yhchat.canarys.ui.login.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:151)");
            }
            boolean z = LoginScreen$lambda$4($selectedTab$delegate) == 0;
            ComposerKt.sourceInformationMarkerStart($composer, -600390922, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoginScreenKt.LoginScreen$lambda$32$1$0$1$0$0($selectedTab$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m3245TabwqdebIU(z, (Function0) objRememberedValue, null, false, ComposableLambdaKt.rememberComposableLambda(-209489463, true, new Function2() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LoginScreenKt.LoginScreen$lambda$32$1$0$1$1($selectedTab$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), null, 0L, 0L, null, $composer, 24624, 492);
            boolean z2 = LoginScreen$lambda$4($selectedTab$delegate) == 1;
            ComposerKt.sourceInformationMarkerStart($composer, -600378570, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                mutableIntState = $selectedTab$delegate;
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoginScreenKt.LoginScreen$lambda$32$1$0$1$2$0(mutableIntState);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            } else {
                mutableIntState = $selectedTab$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabKt.m3245TabwqdebIU(z2, (Function0) objRememberedValue2, null, false, ComposableLambdaKt.rememberComposableLambda(1066583488, true, new Function2() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return LoginScreenKt.LoginScreen$lambda$32$1$0$1$3(mutableIntState, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), null, 0L, 0L, null, $composer, 24624, 492);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$0$1$0$0(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(0);
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$0$1$1(MutableIntState $selectedTab$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C155@5922L169:LoginScreen.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-209489463, $changed, -1, "com.yhchat.canarys.ui.login.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:155)");
            }
            TextKt.m3359Text4IGK_g("\u624b\u673a\u767b\u5f55", (Modifier) null, 0L, 0L, (FontStyle) null, LoginScreen$lambda$4($selectedTab$delegate) == 0 ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$0$1$2$0(MutableIntState $selectedTab$delegate) {
        $selectedTab$delegate.setIntValue(1);
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$0$1$3(MutableIntState $selectedTab$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C165@6308L169:LoginScreen.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1066583488, $changed, -1, "com.yhchat.canarys.ui.login.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:165)");
            }
            TextKt.m3359Text4IGK_g("\u90ae\u7bb1\u767b\u5f55", (Modifier) null, 0L, 0L, (FontStyle) null, LoginScreen$lambda$4($selectedTab$delegate) == 1 ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:264:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit LoginScreen$lambda$32$1$1(final com.yhchat.canarys.p007ui.login.LoginViewModel r113, final androidx.compose.runtime.MutableIntState r114, androidx.compose.runtime.State r115, final androidx.compose.runtime.State r116, final androidx.compose.runtime.MutableState r117, final androidx.compose.runtime.MutableState r118, final androidx.compose.runtime.MutableState r119, final androidx.compose.runtime.MutableState r120, final androidx.compose.runtime.MutableState r121, final androidx.compose.runtime.MutableState r122, androidx.compose.foundation.layout.ColumnScope r123, androidx.compose.runtime.Composer r124, int r125) {
        /*
            Method dump skipped, instructions count: 2986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.login.LoginScreenKt.LoginScreen$lambda$32$1$1(com.yhchat.canarys.ui.login.LoginViewModel, androidx.compose.runtime.MutableIntState, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$0$0$1$0(LoginViewModel $viewModel) {
        $viewModel.getCaptcha();
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$1$0(MutableState $mobile$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $mobile$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$2$0(MutableState $imageCaptcha$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $imageCaptcha$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$3$0$0(MutableState $smsCaptcha$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $smsCaptcha$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$3$1$0(LoginViewModel $viewModel, MutableState $mobile$delegate, MutableState $imageCaptcha$delegate) {
        $viewModel.getSmsCaptcha(LoginScreen$lambda$7($mobile$delegate), LoginScreen$lambda$10($imageCaptcha$delegate));
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$4$0(MutableState $email$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $email$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$5$0(MutableState $password$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $password$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$6(final MutableState $passwordVisible$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C309@13356L38,309@13396L348,309@13335L409:LoginScreen.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1860722119, $changed, -1, "com.yhchat.canarys.ui.login.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:309)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1447563021, "CC(remember):LoginScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LoginScreenKt.LoginScreen$lambda$32$1$1$0$6$0$0($passwordVisible$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(-877881910, true, new Function2() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LoginScreenKt.LoginScreen$lambda$32$1$1$0$6$1($passwordVisible$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$6$0$0(MutableState $passwordVisible$delegate) {
        LoginScreen$lambda$23($passwordVisible$delegate, !LoginScreen$lambda$22($passwordVisible$delegate));
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$6$1(MutableState $passwordVisible$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C310@13434L276:LoginScreen.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-877881910, $changed, -1, "com.yhchat.canarys.ui.login.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:310)");
            }
            IconKt.m2816Iconww6aTOc(LoginScreen$lambda$22($passwordVisible$delegate) ? VisibilityOffKt.getVisibilityOff(Icons.Filled.INSTANCE) : VisibilityKt.getVisibility(Icons.Filled.INSTANCE), LoginScreen$lambda$22($passwordVisible$delegate) ? "\u9690\u85cf\u5bc6\u7801" : "\u663e\u793a\u5bc6\u7801", (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$8$0(LoginViewModel $viewModel, MutableIntState $selectedTab$delegate, MutableState $mobile$delegate, MutableState $smsCaptcha$delegate, MutableState $email$delegate, MutableState $password$delegate) {
        switch (LoginScreen$lambda$4($selectedTab$delegate)) {
            case 0:
                $viewModel.loginWithCaptcha(LoginScreen$lambda$7($mobile$delegate), LoginScreen$lambda$13($smsCaptcha$delegate));
                break;
            case 1:
                $viewModel.loginWithEmail(LoginScreen$lambda$16($email$delegate), LoginScreen$lambda$19($password$delegate));
                break;
        }
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$1$0$9(State $uiState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:LoginScreen.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1640368024, $changed, -1, "com.yhchat.canarys.ui.login.LoginScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (LoginScreen.kt:354)");
            }
            if (LoginScreen$lambda$0($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(-65857231);
                ComposerKt.sourceInformation($composer, "357@15631L11,355@15493L185");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0.0f, 0L, 0, $composer, 6, 28);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-65595281);
                ComposerKt.sourceInformation($composer, "362@15829L10,360@15732L203");
                TextKt.m3359Text4IGK_g("\u767b\u5f55", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$32$1$2$0(MutableState $showTokenDialog$delegate) {
        LoginScreen$lambda$26($showTokenDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$33$0(MutableState $tokenInput$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $tokenInput$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$34$0(LoginViewModel $viewModel, MutableState $tokenInput$delegate, MutableState $showTokenDialog$delegate) {
        if (!StringsKt.isBlank(LoginScreen$lambda$28($tokenInput$delegate))) {
            $viewModel.loginWithToken(LoginScreen$lambda$28($tokenInput$delegate));
            LoginScreen$lambda$26($showTokenDialog$delegate, false);
            $tokenInput$delegate.setValue("");
        }
        return Unit.INSTANCE;
    }

    public static final Unit LoginScreen$lambda$35$0(MutableState $showTokenDialog$delegate, MutableState $tokenInput$delegate) {
        LoginScreen$lambda$26($showTokenDialog$delegate, false);
        $tokenInput$delegate.setValue("");
        return Unit.INSTANCE;
    }

    private static final void TokenLoginDialog(final String tokenInput, final Function1<? super String, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(1449708165);
        ComposerKt.sourceInformation($composer3, "C(TokenLoginDialog)N(tokenInput,onTokenChange,onConfirm,onDismiss)454@18585L175,462@18786L98,435@17853L706,432@17750L1140:LoginScreen.kt#7k7gn0");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(tokenInput) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 2048 : 1024;
        }
        if (!$composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1449708165, $dirty, -1, "com.yhchat.canarys.ui.login.TokenLoginDialog (LoginScreen.kt:431)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function02, ComposableLambdaKt.rememberComposableLambda(-1791421235, true, new Function2() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoginScreenKt.TokenLoginDialog$lambda$0(function0, tokenInput, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1427954737, true, new Function2() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoginScreenKt.TokenLoginDialog$lambda$1(function02, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$LoginScreenKt.INSTANCE.m11481getLambda$1064488239$app_debug(), ComposableLambdaKt.rememberComposableLambda(-882754990, true, new Function2() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoginScreenKt.TokenLoginDialog$lambda$2(tokenInput, function1, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 9) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.login.LoginScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LoginScreenKt.TokenLoginDialog$lambda$3(tokenInput, function1, function0, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0201  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit TokenLoginDialog$lambda$2(java.lang.String r55, kotlin.jvm.functions.Function1 r56, androidx.compose.runtime.Composer r57, int r58) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.login.LoginScreenKt.TokenLoginDialog$lambda$2(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit TokenLoginDialog$lambda$0(Function0 $onConfirm, String $tokenInput, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C455@18599L151:LoginScreen.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1791421235, $changed, -1, "com.yhchat.canarys.ui.login.TokenLoginDialog.<anonymous> (LoginScreen.kt:455)");
            }
            ButtonKt.Button($onConfirm, null, true ^ StringsKt.isBlank($tokenInput), null, null, null, null, null, null, ComposableSingletons$LoginScreenKt.INSTANCE.getLambda$570714301$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit TokenLoginDialog$lambda$1(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C463@18800L74:LoginScreen.kt#7k7gn0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1427954737, $changed, -1, "com.yhchat.canarys.ui.login.TokenLoginDialog.<anonymous> (LoginScreen.kt:463)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$LoginScreenKt.INSTANCE.m11484getLambda$2032213812$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
