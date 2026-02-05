package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.PointerIconCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.CreatedBot;
import com.yhchat.canarys.p007ui.chat.ChatActivity;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotManagementActivity.kt */
@Metadata(m168d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u00a2\u0006\u0002\u0010\b\u001aI\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0015\u00b2\u0006\u0010\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001b\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001c\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001d\u001a\u00020\u001aX\u008a\u008e\u0002\u00b2\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002"}, m169d2 = {"BotManagementScreen", "", "botId", "", "botName", BotManagementActivity.EXTRA_BOT_TOKEN, "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ManagementOption", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "title", "subtitle", "onClick", "iconTint", "Landroidx/compose/ui/graphics/Color;", "modifier", "Landroidx/compose/ui/Modifier;", "ManagementOption-FHprtrg", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "botList", "", "Lcom/yhchat/canarys/data/model/CreatedBot;", "isLoading", "", "isStoppingBot", "isDeletingBot", "botIsStop", "error"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotManagementActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$22(String str, String str2, String str3, Function0 function0, int i, Composer composer, int i2) {
        BotManagementScreen(str, str2, str3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagementOption_FHprtrg$lambda$1(ImageVector imageVector, String str, String str2, Function0 function0, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m10453ManagementOptionFHprtrg(imageVector, str, str2, function0, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotManagementScreen(final String botId, final String botName, final String botToken, final Function0<Unit> function0, Composer $composer, final int $changed) {
        String str;
        Composer $composer2;
        MutableState botList$delegate;
        Object objMutableStateOf$default;
        Object next;
        String token;
        Unit unit;
        MutableState isLoading$delegate;
        MutableState botIsStop$delegate;
        Composer $composer3 = $composer.startRestartGroup(640423322);
        ComposerKt.sourceInformation($composer3, "C(BotManagementScreen)N(botId,botName,botToken,onBackClick)94@3229L7,95@3253L24,98@3319L58,99@3399L33,100@3458L34,101@3518L34,102@3574L34,103@3626L42,106@3721L288,114@4060L1262,114@4039L1283,151@5359L554,169@5920L13934,150@5332L14522:BotManagementActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(botId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(botName) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            str = botToken;
            $dirty |= $composer3.changed(str) ? 256 : 128;
        } else {
            str = botToken;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(640423322, $dirty2, -1, "com.yhchat.canarys.ui.bot.BotManagementScreen (BotManagementActivity.kt:93)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue = objCreateCompositionCoroutineScope;
            }
            final CoroutineScope scope = (CoroutineScope) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1266496852, "CC(remember):BotManagementActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            MutableState botList$delegate2 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1266499387, "CC(remember):BotManagementActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                botList$delegate = botList$delegate2;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            } else {
                botList$delegate = botList$delegate2;
            }
            MutableState isLoading$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1266501276, "CC(remember):BotManagementActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue4 = objMutableStateOf$default4;
            }
            final MutableState isStoppingBot$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1266503196, "CC(remember):BotManagementActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue5 = objMutableStateOf$default5;
            }
            final MutableState isDeletingBot$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1266504988, "CC(remember):BotManagementActivity.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue6 = objMutableStateOf$default6;
            }
            MutableState botIsStop$delegate2 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1266506660, "CC(remember):BotManagementActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
            } else {
                objMutableStateOf$default = objRememberedValue7;
            }
            final MutableState error$delegate = (MutableState) objMutableStateOf$default;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Object objBotManagementScreen$lambda$1 = BotManagementScreen$lambda$1(botList$delegate);
            ComposerKt.sourceInformationMarkerStart($composer3, 1266509946, "CC(remember):BotManagementActivity.kt#9igjgp");
            boolean zChanged = $composer3.changed(objBotManagementScreen$lambda$1) | (($dirty2 & 14) == 4);
            Object objRememberedValue8 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Iterator<T> it = BotManagementScreen$lambda$1(botList$delegate).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Object obj = objRememberedValue8;
                    if (Intrinsics.areEqual(((CreatedBot) next).getBotId(), botId)) {
                        break;
                    } else {
                        objRememberedValue8 = obj;
                    }
                }
                CreatedBot createdBot = (CreatedBot) next;
                if (createdBot == null || (token = createdBot.getToken()) == null) {
                    token = str;
                }
                String str2 = token;
                Log.d("BotManagement", "Current bot: " + botId + ", found token: " + (createdBot != null ? createdBot.getToken() : null) + ", final token: " + str2);
                $composer3.updateRememberedValue(str2);
                objRememberedValue8 = str2;
            }
            final String currentBotToken = (String) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit2 = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 1266521768, "CC(remember):BotManagementActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(scope) | $composer3.changedInstance(context) | (($dirty2 & 14) == 4);
            Object objRememberedValue9 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                unit = unit2;
                isLoading$delegate = isLoading$delegate2;
                botIsStop$delegate = botIsStop$delegate2;
                objRememberedValue9 = new BotManagementActivityKt$BotManagementScreen$1$1(scope, context, botId, botList$delegate, botIsStop$delegate, isLoading$delegate, null);
                $composer3.updateRememberedValue(objRememberedValue9);
            } else {
                isLoading$delegate = isLoading$delegate2;
                botIsStop$delegate = botIsStop$delegate2;
                unit = unit2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue9, $composer3, 6);
            final MutableState botIsStop$delegate3 = botIsStop$delegate;
            final MutableState isLoading$delegate3 = isLoading$delegate;
            $composer2 = $composer3;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(1846595422, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotManagementActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BotManagementActivityKt.BotManagementScreen$lambda$20(function0, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(242393065, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotManagementActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BotManagementActivityKt.BotManagementScreen$lambda$21(error$delegate, botName, botId, context, currentBotToken, scope, function0, isStoppingBot$delegate, botIsStop$delegate3, isLoading$delegate3, isDeletingBot$delegate, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotManagementActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BotManagementActivityKt.BotManagementScreen$lambda$22(botId, botName, botToken, function0, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<CreatedBot> BotManagementScreen$lambda$1(MutableState<List<CreatedBot>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean BotManagementScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotManagementScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotManagementScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotManagementScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotManagementScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotManagementScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BotManagementScreen$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotManagementScreen$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BotManagementScreen$lambda$16(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$20(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C159@5603L286,152@5373L530:BotManagementActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1846595422, $changed, -1, "com.yhchat.canarys.ui.bot.BotManagementScreen.<anonymous> (BotManagementActivity.kt:152)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$BotManagementActivityKt.INSTANCE.getLambda$2039298074$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(73311320, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotManagementActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotManagementActivityKt.BotManagementScreen$lambda$20$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$20$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C160@5625L246:BotManagementActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(73311320, $changed, -1, "com.yhchat.canarys.ui.bot.BotManagementScreen.<anonymous>.<anonymous> (BotManagementActivity.kt:160)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$BotManagementActivityKt.INSTANCE.getLambda$1496365019$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x035e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotManagementScreen$lambda$21(final androidx.compose.runtime.MutableState r48, final java.lang.String r49, final java.lang.String r50, final android.content.Context r51, final java.lang.String r52, final kotlinx.coroutines.CoroutineScope r53, final kotlin.jvm.functions.Function0 r54, final androidx.compose.runtime.MutableState r55, final androidx.compose.runtime.MutableState r56, final androidx.compose.runtime.MutableState r57, final androidx.compose.runtime.MutableState r58, androidx.compose.foundation.layout.PaddingValues r59, androidx.compose.runtime.Composer r60, int r61) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotManagementActivityKt.BotManagementScreen$lambda$21(androidx.compose.runtime.MutableState, java.lang.String, java.lang.String, android.content.Context, java.lang.String, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$21$0$0(MutableState $error$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C188@6645L11,186@6549L206:BotManagementActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-461054202, $changed, -1, "com.yhchat.canarys.ui.bot.BotManagementScreen.<anonymous>.<anonymous>.<anonymous> (BotManagementActivity.kt:186)");
            }
            String strBotManagementScreen$lambda$16 = BotManagementScreen$lambda$16($error$delegate);
            if (strBotManagementScreen$lambda$16 == null) {
                strBotManagementScreen$lambda$16 = "";
            }
            TextKt.m3359Text4IGK_g(strBotManagementScreen$lambda$16, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 48, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$21$0$1(String $botName, String $botId, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C200@7059L745:BotManagementActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(427030785, $changed, -1, "com.yhchat.canarys.ui.bot.BotManagementScreen.<anonymous>.<anonymous>.<anonymous> (BotManagementActivity.kt:200)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 915655313, "C208@7391L10,206@7299L189,211@7509L40,214@7667L10,215@7736L11,212@7570L216:BotManagementActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g($botName, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g("ID: " + $botId, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotManagementScreen$lambda$21$0$2(final android.content.Context r56, final java.lang.String r57, final java.lang.String r58, final java.lang.String r59, androidx.compose.foundation.layout.ColumnScope r60, androidx.compose.runtime.Composer r61, int r62) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotManagementActivityKt.BotManagementScreen$lambda$21$0$2(android.content.Context, java.lang.String, java.lang.String, java.lang.String, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$21$0$2$0$0$0(Context $context, String $botId, String $botName) {
        BotDetailActivity.INSTANCE.start($context, $botId, $botName, 3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$21$0$2$0$1$0(Context $context, String $botId, String $botName) {
        Intent intent = new Intent($context, (Class<?>) ChatActivity.class);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, $botId);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, 3);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, $botName);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$21$0$2$0$2$0(Context $context, String $botId, String $botName) {
        BotEditActivity.INSTANCE.start($context, $botId, $botName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$21$0$2$0$3$0(Context $context, String $botId, String $botName, String $currentBotToken) {
        BotSettingsActivity.INSTANCE.start($context, $botId, $botName, $currentBotToken);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x050b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotManagementScreen$lambda$21$0$3(final kotlinx.coroutines.CoroutineScope r75, final android.content.Context r76, final java.lang.String r77, final kotlin.jvm.functions.Function0 r78, final androidx.compose.runtime.MutableState r79, final androidx.compose.runtime.MutableState r80, final androidx.compose.runtime.MutableState r81, androidx.compose.runtime.MutableState r82, final androidx.compose.runtime.MutableState r83, androidx.compose.foundation.layout.ColumnScope r84, androidx.compose.runtime.Composer r85, int r86) {
        /*
            Method dump skipped, instructions count: 1305
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotManagementActivityKt.BotManagementScreen$lambda$21$0$3(kotlinx.coroutines.CoroutineScope, android.content.Context, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$21$0$3$0$0$0$0(CoroutineScope $scope, Context $context, String $botId, MutableState $isStoppingBot$delegate, MutableState $error$delegate, MutableState $botIsStop$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1($context, $botId, $isStoppingBot$delegate, $error$delegate, $botIsStop$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$21$0$3$0$0$1(MutableState $isStoppingBot$delegate, MutableState $botIsStop$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:BotManagementActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(677456767, $changed, -1, "com.yhchat.canarys.ui.bot.BotManagementScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotManagementActivity.kt:386)");
            }
            if (BotManagementScreen$lambda$7($isStoppingBot$delegate)) {
                $composer.startReplaceGroup(63284291);
                ComposerKt.sourceInformation($composer, "390@16663L11,387@16453L265,392@16751L39,393@16823L14");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u5904\u7406\u4e2d...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(63724026);
                ComposerKt.sourceInformation($composer, "395@16907L41");
                TextKt.m3359Text4IGK_g(BotManagementScreen$lambda$13($botIsStop$delegate) ? "\u542f\u7528\u673a\u5668\u4eba" : "\u505c\u7528\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$21$0$3$0$0$2$0(CoroutineScope $scope, Context $context, String $botId, MutableState $isDeletingBot$delegate, MutableState $error$delegate, Function0 $onBackClick) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1($context, $botId, $isDeletingBot$delegate, $error$delegate, $onBackClick, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotManagementScreen$lambda$21$0$3$0$0$3(MutableState $isDeletingBot$delegate, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C:BotManagementActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-77534275, $changed, -1, "com.yhchat.canarys.ui.bot.BotManagementScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotManagementActivity.kt:436)");
            }
            if (BotManagementScreen$lambda$10($isDeletingBot$delegate)) {
                $composer.startReplaceGroup(868881097);
                ComposerKt.sourceInformation($composer, "440@19475L11,437@19265L261,442@19559L39,443@19631L14");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u5220\u9664\u4e2d...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(869316120);
                ComposerKt.sourceInformation($composer, "445@19715L13");
                TextKt.m3359Text4IGK_g("\u5220\u9664\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* renamed from: ManagementOption-FHprtrg, reason: not valid java name */
    private static final void m10453ManagementOptionFHprtrg(final ImageVector icon, final String title, final String subtitle, final Function0<Unit> function0, long j, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final ImageVector imageVector;
        final String str;
        final String str2;
        Function0<Unit> function02;
        final long primary;
        final Modifier modifier2;
        Composer $composer2;
        final long j2;
        Composer $composer3 = $composer.startRestartGroup(-270680141);
        ComposerKt.sourceInformation($composer3, "C(ManagementOption)N(icon,title,subtitle,onClick,iconTint:c#ui.graphics.Color,modifier)468@20302L1239,464@20153L1388:BotManagementActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            imageVector = icon;
            $dirty |= $composer3.changed(imageVector) ? 4 : 2;
        } else {
            imageVector = icon;
        }
        if (($changed & 48) == 0) {
            str = title;
            $dirty |= $composer3.changed(str) ? 32 : 16;
        } else {
            str = title;
        }
        if (($changed & 384) == 0) {
            str2 = subtitle;
            $dirty |= $composer3.changed(str2) ? 256 : 128;
        } else {
            str2 = subtitle;
        }
        if (($changed & 3072) == 0) {
            function02 = function0;
            $dirty |= $composer3.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        if (($changed & 24576) == 0) {
            if ((i & 16) == 0) {
                primary = j;
                int i2 = $composer3.changed(primary) ? 16384 : 8192;
                $dirty |= i2;
            } else {
                primary = j;
            }
            $dirty |= i2;
        } else {
            primary = j;
        }
        int i3 = i & 32;
        if (i3 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        if (!$composer3.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "461@20090L11");
            if (($changed & 1) != 0 && !$composer3.getDefaultsInvalid()) {
                $composer3.skipToGroupEnd();
                if ((i & 16) != 0) {
                    $dirty &= -57345;
                }
                j2 = primary;
            } else {
                if ((i & 16) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary();
                    $dirty &= -57345;
                }
                if (i3 == 0) {
                    j2 = primary;
                } else {
                    modifier2 = Modifier.INSTANCE;
                    j2 = primary;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-270680141, $dirty, -1, "com.yhchat.canarys.ui.bot.ManagementOption (BotManagementActivity.kt:463)");
            }
            long j3 = j2;
            $composer2 = $composer3;
            SurfaceKt.m3212Surfaceo_FOJdg(function02, SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null), false, null, Color.INSTANCE.m5092getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, null, ComposableLambdaKt.rememberComposableLambda(-5124728, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotManagementActivityKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotManagementActivityKt.ManagementOption_FHprtrg$lambda$0(imageVector, j2, str, str2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty >> 9) & 14) | 24576, 6, PointerIconCompat.TYPE_WAIT);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            primary = j3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotManagementActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotManagementActivityKt.ManagementOption_FHprtrg$lambda$1(icon, title, subtitle, function0, primary, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0399  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ManagementOption_FHprtrg$lambda$0(androidx.compose.p000ui.graphics.vector.ImageVector r73, long r74, java.lang.String r76, java.lang.String r77, androidx.compose.runtime.Composer r78, int r79) {
        /*
            Method dump skipped, instructions count: 931
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotManagementActivityKt.ManagementOption_FHprtrg$lambda$0(androidx.compose.ui.graphics.vector.ImageVector, long, java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
