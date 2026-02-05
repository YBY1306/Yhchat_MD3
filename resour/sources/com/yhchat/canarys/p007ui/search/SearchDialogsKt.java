package com.yhchat.canarys.p007ui.search;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material3.CardKt;
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
import androidx.compose.p000ui.window.AndroidDialog_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.BotInfo;
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.model.UserInfo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchDialogs.kt */
@Metadata(m168d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010\n\u001aA\u0010\u000b\u001a\u00020\u00012\b\u0010\f\u001a\u0004\u0018\u00010\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010\u000e\u001aA\u0010\u000f\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010\u0012\u001a\u001d\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015H\u0003\u00a2\u0006\u0002\u0010\u0017\u001a\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aH\u0002\u00a8\u0006\u001b"}, m169d2 = {"GroupInfoDialog", "", "group", "Lcom/yhchat/canarys/data/model/GroupDetail;", "onDismiss", "Lkotlin/Function0;", "onAdd", "Lkotlin/Function1;", "isAdding", "", "(Lcom/yhchat/canarys/data/model/GroupDetail;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "UserInfoDialog", "user", "Lcom/yhchat/canarys/data/model/UserInfo;", "(Lcom/yhchat/canarys/data/model/UserInfo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "BotInfoDialog", "bot", "Lcom/yhchat/canarys/data/model/BotInfo;", "(Lcom/yhchat/canarys/data/model/BotInfo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;I)V", "InfoItem", "label", "", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "formatTimestamp", "timestamp", "", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class SearchDialogsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoDialog$lambda$0(BotInfo botInfo, Function0 function0, Function1 function1, boolean z, int i, Composer composer, int i2) {
        BotInfoDialog(botInfo, function0, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoDialog$lambda$2(BotInfo botInfo, Function0 function0, Function1 function1, boolean z, int i, Composer composer, int i2) {
        BotInfoDialog(botInfo, function0, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupInfoDialog$lambda$0(GroupDetail groupDetail, Function0 function0, Function1 function1, boolean z, int i, Composer composer, int i2) {
        GroupInfoDialog(groupDetail, function0, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupInfoDialog$lambda$2(GroupDetail groupDetail, Function0 function0, Function1 function1, boolean z, int i, Composer composer, int i2) {
        GroupInfoDialog(groupDetail, function0, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoItem$lambda$1(String str, String str2, int i, Composer composer, int i2) {
        InfoItem(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserInfoDialog$lambda$0(UserInfo userInfo, Function0 function0, Function1 function1, boolean z, int i, Composer composer, int i2) {
        UserInfoDialog(userInfo, function0, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserInfoDialog$lambda$2(UserInfo userInfo, Function0 function0, Function1 function1, boolean z, int i, Composer composer, int i2) {
        UserInfoDialog(userInfo, function0, function1, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GroupInfoDialog(final GroupDetail group, final Function0<Unit> onDismiss, final Function1<? super GroupDetail, Unit> onAdd, final boolean isAdding, Composer $composer, final int $changed) {
        final GroupDetail group2;
        final Function0 onDismiss2;
        final Function1 onAdd2;
        final boolean isAdding2;
        Composer $composer2;
        int $changed2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onAdd, "onAdd");
        Composer $composer3 = $composer.startRestartGroup(-1045980270);
        ComposerKt.sourceInformation($composer3, "C(GroupInfoDialog)N(group,onDismiss,onAdd,isAdding)35@1244L4050,35@1207L4087:SearchDialogs.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(group) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onAdd) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(isAdding) ? 2048 : 1024;
        }
        if (!$composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            group2 = group;
            onDismiss2 = onDismiss;
            onAdd2 = onAdd;
            isAdding2 = isAdding;
            $composer2 = $composer3;
            $changed2 = $changed;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1045980270, $dirty, -1, "com.yhchat.canarys.ui.search.GroupInfoDialog (SearchDialogs.kt:32)");
            }
            if (group != null) {
                group2 = group;
                onDismiss2 = onDismiss;
                onAdd2 = onAdd;
                isAdding2 = isAdding;
                $changed2 = $changed;
                $composer2 = $composer3;
                AndroidDialog_androidKt.Dialog(onDismiss2, null, ComposableLambdaKt.rememberComposableLambda(-52842647, true, new Function2() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchDialogsKt.GroupInfoDialog$lambda$1(group2, onDismiss2, isAdding2, onAdd2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer3, 54), $composer2, (($dirty >> 3) & 14) | 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SearchDialogsKt.GroupInfoDialog$lambda$0(group, onDismiss, onAdd, isAdding, $changed, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final GroupDetail group3 = group2;
            final int $changed3 = $changed2;
            final boolean isAdding3 = isAdding2;
            final Function1 onAdd3 = onAdd2;
            final Function0 onDismiss3 = onDismiss2;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchDialogsKt.GroupInfoDialog$lambda$2(group3, onDismiss3, onAdd3, isAdding3, $changed3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupInfoDialog$lambda$1(final GroupDetail $group, final Function0 $onDismiss, final boolean $isAdding, final Function1 $onAdd, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C41@1413L3875,36@1254L4034:SearchDialogs.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-52842647, $changed, -1, "com.yhchat.canarys.ui.search.GroupInfoDialog.<anonymous> (SearchDialogs.kt:36)");
            }
            CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1755212453, true, new Function3() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SearchDialogsKt.GroupInfoDialog$lambda$1$0($group, $onDismiss, $isAdding, $onAdd, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x053a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupInfoDialog$lambda$1$0(final com.yhchat.canarys.data.model.GroupDetail r75, kotlin.jvm.functions.Function0 r76, final boolean r77, final kotlin.jvm.functions.Function1 r78, androidx.compose.foundation.layout.ColumnScope r79, androidx.compose.runtime.Composer r80, int r81) {
        /*
            Method dump skipped, instructions count: 1465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.SearchDialogsKt.GroupInfoDialog$lambda$1$0(com.yhchat.canarys.data.model.GroupDetail, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupInfoDialog$lambda$1$0$0$0$0$0(Function1 $onAdd, GroupDetail $group) {
        $onAdd.invoke($group);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupInfoDialog$lambda$1$0$0$0$1(boolean $isAdding, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:SearchDialogs.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(300962597, $changed, -1, "com.yhchat.canarys.ui.search.GroupInfoDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchDialogs.kt:118)");
            }
            if ($isAdding) {
                $composer.startReplaceGroup(-1914939296);
                ComposerKt.sourceInformation($composer, "121@4753L11,119@4607L197");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0.0f, 0L, 0, $composer, 6, 28);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1914678183);
                ComposerKt.sourceInformation($composer, "124@4866L223,129@5118L39,130@5186L12");
                IconKt.m2816Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, $composer, 432, 8);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u52a0\u5165\u7fa4\u804a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void UserInfoDialog(final UserInfo user, final Function0<Unit> onDismiss, final Function1<? super UserInfo, Unit> onAdd, final boolean isAdding, Composer $composer, final int $changed) {
        final UserInfo user2;
        final Function0 onDismiss2;
        final Function1 onAdd2;
        final boolean isAdding2;
        Composer $composer2;
        int $changed2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onAdd, "onAdd");
        Composer $composer3 = $composer.startRestartGroup(2006330357);
        ComposerKt.sourceInformation($composer3, "C(UserInfoDialog)N(user,onDismiss,onAdd,isAdding)148@5510L4296,148@5473L4333:SearchDialogs.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(user) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onAdd) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(isAdding) ? 2048 : 1024;
        }
        if (!$composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            user2 = user;
            onDismiss2 = onDismiss;
            onAdd2 = onAdd;
            isAdding2 = isAdding;
            $composer2 = $composer3;
            $changed2 = $changed;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2006330357, $dirty, -1, "com.yhchat.canarys.ui.search.UserInfoDialog (SearchDialogs.kt:145)");
            }
            if (user != null) {
                user2 = user;
                onDismiss2 = onDismiss;
                onAdd2 = onAdd;
                isAdding2 = isAdding;
                $changed2 = $changed;
                $composer2 = $composer3;
                AndroidDialog_androidKt.Dialog(onDismiss2, null, ComposableLambdaKt.rememberComposableLambda(1537327948, true, new Function2() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchDialogsKt.UserInfoDialog$lambda$1(user2, onDismiss2, isAdding2, onAdd2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer3, 54), $composer2, (($dirty >> 3) & 14) | 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SearchDialogsKt.UserInfoDialog$lambda$0(user, onDismiss, onAdd, isAdding, $changed, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final UserInfo user3 = user2;
            final int $changed3 = $changed2;
            final boolean isAdding3 = isAdding2;
            final Function1 onAdd3 = onAdd2;
            final Function0 onDismiss3 = onDismiss2;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchDialogsKt.UserInfoDialog$lambda$2(user3, onDismiss3, onAdd3, isAdding3, $changed3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserInfoDialog$lambda$1(final UserInfo $user, final Function0 $onDismiss, final boolean $isAdding, final Function1 $onAdd, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C154@5679L4121,149@5520L4280:SearchDialogs.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1537327948, $changed, -1, "com.yhchat.canarys.ui.search.UserInfoDialog.<anonymous> (SearchDialogs.kt:149)");
            }
            CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1390309950, true, new Function3() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SearchDialogsKt.UserInfoDialog$lambda$1$0($user, $onDismiss, $isAdding, $onAdd, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0724  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06af A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit UserInfoDialog$lambda$1$0(final com.yhchat.canarys.data.model.UserInfo r87, kotlin.jvm.functions.Function0 r88, final boolean r89, final kotlin.jvm.functions.Function1 r90, androidx.compose.foundation.layout.ColumnScope r91, androidx.compose.runtime.Composer r92, int r93) {
        /*
            Method dump skipped, instructions count: 1838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.SearchDialogsKt.UserInfoDialog$lambda$1$0(com.yhchat.canarys.data.model.UserInfo, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserInfoDialog$lambda$1$0$0$4$0$0(Function1 $onAdd, UserInfo $user) {
        $onAdd.invoke($user);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserInfoDialog$lambda$1$0$0$4$1(boolean $isAdding, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:SearchDialogs.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1995947455, $changed, -1, "com.yhchat.canarys.ui.search.UserInfoDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchDialogs.kt:239)");
            }
            if ($isAdding) {
                $composer.startReplaceGroup(1743433606);
                ComposerKt.sourceInformation($composer, "242@9265L11,240@9119L197");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0.0f, 0L, 0, $composer, 6, 28);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1743694719);
                ComposerKt.sourceInformation($composer, "245@9378L223,250@9630L39,251@9698L12");
                IconKt.m2816Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, $composer, 432, 8);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u6dfb\u52a0\u597d\u53cb", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void BotInfoDialog(final BotInfo bot, final Function0<Unit> onDismiss, final Function1<? super BotInfo, Unit> onAdd, final boolean isAdding, Composer $composer, final int $changed) {
        final BotInfo bot2;
        final Function0 onDismiss2;
        final Function1 onAdd2;
        final boolean isAdding2;
        Composer $composer2;
        int $changed2;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onAdd, "onAdd");
        Composer $composer3 = $composer.startRestartGroup(-823201473);
        ComposerKt.sourceInformation($composer3, "C(BotInfoDialog)N(bot,onDismiss,onAdd,isAdding)269@10017L5041,269@9980L5078:SearchDialogs.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(bot) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onAdd) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(isAdding) ? 2048 : 1024;
        }
        if (!$composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            bot2 = bot;
            onDismiss2 = onDismiss;
            onAdd2 = onAdd;
            isAdding2 = isAdding;
            $composer2 = $composer3;
            $changed2 = $changed;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-823201473, $dirty, -1, "com.yhchat.canarys.ui.search.BotInfoDialog (SearchDialogs.kt:266)");
            }
            if (bot != null) {
                bot2 = bot;
                onDismiss2 = onDismiss;
                onAdd2 = onAdd;
                isAdding2 = isAdding;
                $changed2 = $changed;
                $composer2 = $composer3;
                AndroidDialog_androidKt.Dialog(onDismiss2, null, ComposableLambdaKt.rememberComposableLambda(248934998, true, new Function2() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SearchDialogsKt.BotInfoDialog$lambda$1(bot2, onDismiss2, isAdding2, onAdd2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer3, 54), $composer2, (($dirty >> 3) & 14) | 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SearchDialogsKt.BotInfoDialog$lambda$0(bot, onDismiss, onAdd, isAdding, $changed, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final BotInfo bot3 = bot2;
            final int $changed3 = $changed2;
            final boolean isAdding3 = isAdding2;
            final Function1 onAdd3 = onAdd2;
            final Function0 onDismiss3 = onDismiss2;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchDialogsKt.BotInfoDialog$lambda$2(bot3, onDismiss3, onAdd3, isAdding3, $changed3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoDialog$lambda$1(final BotInfo $bot, final Function0 $onDismiss, final boolean $isAdding, final Function1 $onAdd, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C275@10186L4866,270@10027L5025:SearchDialogs.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(248934998, $changed, -1, "com.yhchat.canarys.ui.search.BotInfoDialog.<anonymous> (SearchDialogs.kt:270)");
            }
            CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1896467000, true, new Function3() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SearchDialogsKt.BotInfoDialog$lambda$1$0($bot, $onDismiss, $isAdding, $onAdd, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0628  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0732 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x07a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotInfoDialog$lambda$1$0(final com.yhchat.canarys.data.model.BotInfo r89, kotlin.jvm.functions.Function0 r90, final boolean r91, final kotlin.jvm.functions.Function1 r92, androidx.compose.foundation.layout.ColumnScope r93, androidx.compose.runtime.Composer r94, int r95) {
        /*
            Method dump skipped, instructions count: 1969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.SearchDialogsKt.BotInfoDialog$lambda$1$0(com.yhchat.canarys.data.model.BotInfo, kotlin.jvm.functions.Function0, boolean, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoDialog$lambda$1$0$0$5$0$0(Function1 $onAdd, BotInfo $bot) {
        $onAdd.invoke($bot);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotInfoDialog$lambda$1$0$0$5$1(boolean $isAdding, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:SearchDialogs.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-465670775, $changed, -1, "com.yhchat.canarys.ui.search.BotInfoDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchDialogs.kt:377)");
            }
            if ($isAdding) {
                $composer.startReplaceGroup(-53644420);
                ComposerKt.sourceInformation($composer, "380@14516L11,378@14370L197");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0.0f, 0L, 0, $composer, 6, 28);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-53383276);
                ComposerKt.sourceInformation($composer, "383@14629L223,388@14881L39,389@14949L13");
                IconKt.m2816Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, $composer, 432, 8);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u6dfb\u52a0\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void InfoItem(final String label, String value, Composer $composer, final int $changed) {
        final String str;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-235205791);
        ComposerKt.sourceInformation($composer3, "C(InfoItem)N(label,value)403@15141L490:SearchDialogs.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(label) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(value) ? 32 : 16;
        }
        if (!$composer3.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            str = value;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-235205791, $dirty, -1, "com.yhchat.canarys.ui.search.InfoItem (SearchDialogs.kt:402)");
            }
            Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(4), 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM1052paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                $composer3.createNode(constructor);
            } else {
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 212566479, "C411@15380L10,412@15437L11,409@15314L161,416@15550L10,414@15484L141:SearchDialogs.kt#ogsx9x");
            $composer2 = $composer3;
            TextKt.m3359Text4IGK_g(label, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), $composer3, $dirty & 14, 0, 65530);
            str = value;
            TextKt.m3359Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), $composer3, (($dirty >> 3) & 14) | ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchDialogsKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchDialogsKt.InfoItem$lambda$1(label, str, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String formatTimestamp(long timestamp) {
        Date date = new Date(1000 * timestamp);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy\u5e74MM\u6708dd\u65e5", Locale.getDefault());
        String str = formatter.format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
