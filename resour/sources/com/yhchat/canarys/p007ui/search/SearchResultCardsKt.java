package com.yhchat.canarys.p007ui.search;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.BotInfo;
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.model.UserInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchResultCards.kt */
@Metadata(m168d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\n\u001a#\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, m169d2 = {"GroupResultCard", "", "group", "Lcom/yhchat/canarys/data/model/GroupDetail;", "onClick", "Lkotlin/Function0;", "(Lcom/yhchat/canarys/data/model/GroupDetail;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "UserResultCard", "user", "Lcom/yhchat/canarys/data/model/UserInfo;", "(Lcom/yhchat/canarys/data/model/UserInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BotResultCard", "bot", "Lcom/yhchat/canarys/data/model/BotInfo;", "(Lcom/yhchat/canarys/data/model/BotInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class SearchResultCardsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotResultCard$lambda$2(BotInfo botInfo, Function0 function0, int i, Composer composer, int i2) {
        BotResultCard(botInfo, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupResultCard$lambda$2(GroupDetail groupDetail, Function0 function0, int i, Composer composer, int i2) {
        GroupResultCard(groupDetail, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserResultCard$lambda$2(UserInfo userInfo, Function0 function0, int i, Composer composer, int i2) {
        UserResultCard(userInfo, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GroupResultCard(final GroupDetail group, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(594357861);
        ComposerKt.sourceInformation($composer3, "C(GroupResultCard)N(group,onClick)32@1109L13,34@1200L38,35@1245L2204,29@1024L2425:SearchResultCards.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(group) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(594357861, $dirty2, -1, "com.yhchat.canarys.ui.search.GroupResultCard (SearchResultCards.kt:28)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -52740750, "CC(remember):SearchResultCards.kt#9igjgp");
            boolean z = ($dirty2 & 112) == 32;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.SearchResultCardsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchResultCardsKt.GroupResultCard$lambda$0$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(654335447, true, new Function3() { // from class: com.yhchat.canarys.ui.search.SearchResultCardsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return SearchResultCardsKt.GroupResultCard$lambda$1(group, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchResultCardsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SearchResultCardsKt.GroupResultCard$lambda$2(group, onClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupResultCard$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupResultCard$lambda$1(com.yhchat.canarys.data.model.GroupDetail r76, androidx.compose.foundation.layout.ColumnScope r77, androidx.compose.runtime.Composer r78, int r79) {
        /*
            Method dump skipped, instructions count: 1216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.SearchResultCardsKt.GroupResultCard$lambda$1(com.yhchat.canarys.data.model.GroupDetail, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void UserResultCard(final UserInfo user, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(1228697466);
        ComposerKt.sourceInformation($composer3, "C(UserResultCard)N(user,onClick)108@3622L13,110@3713L38,111@3758L2786,105@3537L3007:SearchResultCards.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(user) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1228697466, $dirty2, -1, "com.yhchat.canarys.ui.search.UserResultCard (SearchResultCards.kt:104)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -337736537, "CC(remember):SearchResultCards.kt#9igjgp");
            boolean z = ($dirty2 & 112) == 32;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.SearchResultCardsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchResultCardsKt.UserResultCard$lambda$0$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1717229588, true, new Function3() { // from class: com.yhchat.canarys.ui.search.SearchResultCardsKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return SearchResultCardsKt.UserResultCard$lambda$1(user, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchResultCardsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SearchResultCardsKt.UserResultCard$lambda$2(user, onClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserResultCard$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:68:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x065f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit UserResultCard$lambda$1(com.yhchat.canarys.data.model.UserInfo r112, androidx.compose.foundation.layout.ColumnScope r113, androidx.compose.runtime.Composer r114, int r115) {
        /*
            Method dump skipped, instructions count: 1641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.SearchResultCardsKt.UserResultCard$lambda$1(com.yhchat.canarys.data.model.UserInfo, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void BotResultCard(final BotInfo bot, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(bot, "bot");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(-902309294);
        ComposerKt.sourceInformation($composer3, "C(BotResultCard)N(bot,onClick)196@6714L13,198@6805L38,199@6850L3187,193@6629L3408:SearchResultCards.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(bot) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-902309294, $dirty2, -1, "com.yhchat.canarys.ui.search.BotResultCard (SearchResultCards.kt:192)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 464167199, "CC(remember):SearchResultCards.kt#9igjgp");
            boolean z = ($dirty2 & 112) == 32;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.SearchResultCardsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchResultCardsKt.BotResultCard$lambda$0$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(167249732, true, new Function3() { // from class: com.yhchat.canarys.ui.search.SearchResultCardsKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return SearchResultCardsKt.BotResultCard$lambda$1(bot, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchResultCardsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SearchResultCardsKt.BotResultCard$lambda$2(bot, onClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotResultCard$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x05fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotResultCard$lambda$1(com.yhchat.canarys.data.model.BotInfo r111, androidx.compose.foundation.layout.ColumnScope r112, androidx.compose.runtime.Composer r113, int r114) {
        /*
            Method dump skipped, instructions count: 1542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.SearchResultCardsKt.BotResultCard$lambda$1(com.yhchat.canarys.data.model.BotInfo, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
