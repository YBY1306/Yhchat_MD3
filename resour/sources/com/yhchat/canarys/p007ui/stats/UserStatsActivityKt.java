package com.yhchat.canarys.p007ui.stats;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.UserStatsData;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

/* compiled from: UserStatsActivity.kt */
@Metadata(m168d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001a\u001f\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003\u00a2\u0006\u0002\u0010\f\u001aI\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u000f2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001a\u00b2\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002"}, m169d2 = {"UserStatsScreen", "", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/yhchat/canarys/ui/stats/UserStatsViewModel;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/yhchat/canarys/ui/stats/UserStatsViewModel;Landroidx/compose/runtime/Composer;II)V", "UserStatsContent", "userStats", "Lcom/yhchat/canarys/data/model/UserStatsData;", "(Lcom/yhchat/canarys/data/model/UserStatsData;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "StatsCard", "title", "", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "iconColor", "Landroidx/compose/ui/graphics/Color;", "current", "", "target", "description", "StatsCard-TgFrcIs", "(Ljava/lang/String;Landroidx/compose/ui/graphics/vector/ImageVector;JIILjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/stats/UserStatsUiState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class UserStatsActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatsCard_TgFrcIs$lambda$1(String str, ImageVector imageVector, long j, int i, int i2, String str2, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        m11826StatsCardTgFrcIs(str, imageVector, j, i, i2, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserStatsContent$lambda$1(UserStatsData userStatsData, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UserStatsContent(userStatsData, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserStatsScreen$lambda$3(Function0 function0, Modifier modifier, UserStatsViewModel userStatsViewModel, int i, int i2, Composer composer, int i3) {
        UserStatsScreen(function0, modifier, userStatsViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x0911  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0986  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0992  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void UserStatsScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> r125, androidx.compose.p000ui.Modifier r126, com.yhchat.canarys.p007ui.stats.UserStatsViewModel r127, androidx.compose.runtime.Composer r128, final int r129, final int r130) {
        /*
            Method dump skipped, instructions count: 3058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.stats.UserStatsActivityKt.UserStatsScreen(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, com.yhchat.canarys.ui.stats.UserStatsViewModel, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final UserStatsUiState UserStatsScreen$lambda$0(State<UserStatsUiState> state) {
        return (UserStatsUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserStatsScreen$lambda$2$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C84@2676L226:UserStatsActivity.kt#7o53jm");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(213521018, $changed, -1, "com.yhchat.canarys.ui.stats.UserStatsScreen.<anonymous>.<anonymous> (UserStatsActivity.kt:84)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$UserStatsActivityKt.INSTANCE.m11822getLambda$2769129$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserStatsScreen$lambda$2$1$1$0$0(UserStatsViewModel $viewModel) {
        $viewModel.loadUserStats();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0200  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void UserStatsContent(final com.yhchat.canarys.data.model.UserStatsData r40, androidx.compose.p000ui.Modifier r41, androidx.compose.runtime.Composer r42, final int r43, final int r44) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.stats.UserStatsActivityKt.UserStatsContent(com.yhchat.canarys.data.model.UserStatsData, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: StatsCard-TgFrcIs, reason: not valid java name */
    private static final void m11826StatsCardTgFrcIs(final String title, final ImageVector icon, final long j, final int current, final int target, final String description, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final String str;
        ImageVector imageVector;
        long j2;
        String str2;
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        float f;
        Composer $composer3 = $composer.startRestartGroup(-157941576);
        ComposerKt.sourceInformation($composer3, "C(StatsCard)N(title,icon,iconColor:c#ui.graphics.Color,current,target,description,modifier)225@7635L38,227@7723L3541,223@7552L3712:UserStatsActivity.kt#7o53jm");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            str = title;
            $dirty |= $composer3.changed(str) ? 4 : 2;
        } else {
            str = title;
        }
        if (($changed & 48) == 0) {
            imageVector = icon;
            $dirty |= $composer3.changed(imageVector) ? 32 : 16;
        } else {
            imageVector = icon;
        }
        if (($changed & 384) == 0) {
            j2 = j;
            $dirty |= $composer3.changed(j2) ? 256 : 128;
        } else {
            j2 = j;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(current) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changed(target) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            str2 = description;
            $dirty |= $composer3.changed(str2) ? 131072 : 65536;
        } else {
            str2 = description;
        }
        int i2 = i & 64;
        if (i2 != 0) {
            $dirty |= 1572864;
            modifier2 = modifier;
        } else if ((1572864 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 1048576 : 524288;
        } else {
            modifier2 = modifier;
        }
        if ($composer3.shouldExecute((599187 & $dirty) != 599186, $dirty & 1)) {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-157941576, $dirty, -1, "com.yhchat.canarys.ui.stats.StatsCard (UserStatsActivity.kt:218)");
            }
            if (target > 0) {
                f = current / target;
            } else {
                f = 0.0f;
            }
            final float progress = f;
            final int percentage = (int) (100 * progress);
            final NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.getDefault());
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            CardElevation cardElevationM2496cardElevationaqJV_2Y = CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62);
            $composer2 = $composer3;
            Modifier modifier5 = modifier4;
            final ImageVector imageVector2 = imageVector;
            final long j3 = j2;
            final String str3 = str2;
            CardKt.Card(modifierFillMaxWidth$default, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, cardElevationM2496cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(601424682, true, new Function3() { // from class: com.yhchat.canarys.ui.stats.UserStatsActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return UserStatsActivityKt.StatsCard_TgFrcIs$lambda$0(imageVector2, str, j3, numberFormat, current, target, progress, str3, percentage, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.stats.UserStatsActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserStatsActivityKt.StatsCard_TgFrcIs$lambda$1(title, icon, j, current, target, description, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0acc  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0b51  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit StatsCard_TgFrcIs$lambda$0(androidx.compose.p000ui.graphics.vector.ImageVector r120, java.lang.String r121, long r122, java.text.NumberFormat r124, int r125, int r126, final float r127, java.lang.String r128, int r129, androidx.compose.foundation.layout.ColumnScope r130, androidx.compose.runtime.Composer r131, int r132) {
        /*
            Method dump skipped, instructions count: 2907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.stats.UserStatsActivityKt.StatsCard_TgFrcIs$lambda$0(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, long, java.text.NumberFormat, int, int, float, java.lang.String, int, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float StatsCard_TgFrcIs$lambda$0$0$2$1$0(float $progress) {
        return RangesKt.coerceIn($progress, 0.0f, 1.0f);
    }
}
