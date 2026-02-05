package com.yhchat.canarys.p007ui.community;

import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: CommunityScreen.kt */
@Metadata(m168d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, m169d2 = {"CommunityScreen", "", "token", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/yhchat/canarys/ui/community/CommunityViewModel;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/yhchat/canarys/ui/community/CommunityViewModel;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class CommunityScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CommunityScreen$lambda$0(String str, Modifier modifier, CommunityViewModel communityViewModel, int i, int i2, Composer composer, int i3) {
        CommunityScreen(str, modifier, communityViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CommunityScreen(final String token, Modifier modifier, CommunityViewModel viewModel, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        CommunityViewModel communityViewModel;
        Composer $composer2;
        final CommunityViewModel viewModel2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        int $dirty;
        CommunityViewModel viewModel3;
        CreationExtras defaultViewModelCreationExtras;
        Intrinsics.checkNotNullParameter(token, "token");
        Composer $composer3 = $composer.startRestartGroup(-203139289);
        ComposerKt.sourceInformation($composer3, "C(CommunityScreen)N(token,modifier,viewModel)15@341L107:CommunityScreen.kt#cp0npg");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(token) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty2 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                communityViewModel = viewModel;
                int i3 = $composer3.changedInstance(communityViewModel) ? 256 : 128;
                $dirty2 |= i3;
            } else {
                communityViewModel = viewModel;
            }
            $dirty2 |= i3;
        } else {
            communityViewModel = viewModel;
        }
        if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "12@304L11");
            if (($changed & 1) != 0 && !$composer3.getDefaultsInvalid()) {
                $composer3.skipToGroupEnd();
                if ((i & 4) != 0) {
                    $dirty2 &= -897;
                }
                CommunityViewModel communityViewModel2 = communityViewModel;
                $dirty = $dirty2;
                viewModel3 = communityViewModel2;
                modifier4 = modifier2;
            } else {
                if (i2 != 0) {
                    modifier4 = Modifier.INSTANCE;
                } else {
                    modifier4 = modifier2;
                }
                if ((i & 4) == 0) {
                    CommunityViewModel communityViewModel3 = communityViewModel;
                    $dirty = $dirty2;
                    viewModel3 = communityViewModel3;
                } else {
                    ComposerKt.sourceInformationMarkerStart($composer3, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer3, 6);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel4 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CommunityViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, $composer3, ((0 << 3) & 112) | ((0 << 3) & 896) | ((0 << 3) & 7168) | ((0 << 3) & 57344), 0);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $dirty = $dirty2 & (-897);
                    viewModel3 = (CommunityViewModel) viewModel4;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-203139289, $dirty, -1, "com.yhchat.canarys.ui.community.CommunityScreen (CommunityScreen.kt:13)");
            }
            Modifier modifier5 = modifier4;
            CommunityTabScreenKt.CommunityTabScreen(token, modifier5, viewModel3, $composer3, ($dirty & 14) | ($dirty & 112) | ($dirty & 896), 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            viewModel2 = viewModel3;
            modifier3 = modifier5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            viewModel2 = communityViewModel;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.CommunityScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommunityScreenKt.CommunityScreen$lambda$0(token, modifier3, viewModel2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
