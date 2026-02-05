package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.input.VisualTransformation;
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
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.api.WebApiService;
import com.yhchat.canarys.data.model.BotInstruction;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.TokenRepository;
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

/* compiled from: BotSettingsActivity.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u00a2\u0006\u0002\u0010\b\u001a1\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000eH\u0003\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0015\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001a\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001b\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001c\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001d\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001e\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001f\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010 \u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010!\u001a\u00020\fX\u008a\u008e\u0002"}, m169d2 = {"BotSettingsScreen", "", "botId", "", "botName", "initialBotToken", "onBack", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SubscriptionSwitch", "title", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_debug", "token", "webhookUrl", "isLoading", "isResettingLink", "isSavingWebhook", "error", "instructions", "", "Lcom/yhchat/canarys/data/model/BotInstruction;", "isLoadingInstructions", "messageReceiveNormal", "messageReceiveInstruction", "botFollowed", "botUnfollowed", "groupJoin", "groupLeave", "botSetting"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotSettingsActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$52(String str, String str2, String str3, Function0 function0, int i, Composer composer, int i2) {
        BotSettingsScreen(str, str2, str3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubscriptionSwitch$lambda$1(String str, boolean z, Function1 function1, int i, Composer composer, int i2) {
        SubscriptionSwitch(str, z, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen(final String botId, final String botName, final String initialBotToken, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        MutableState token$delegate;
        MutableState webhookUrl$delegate;
        MutableState isLoading$delegate;
        MutableState error$delegate;
        MutableState instructions$delegate;
        MutableState isLoadingInstructions$delegate;
        Composer $composer3;
        MutableState webhookUrl$delegate2;
        MutableState isLoading$delegate2;
        int $dirty;
        Context context;
        TokenRepository tokenRepo;
        String str;
        final ApiService api;
        BotSettingsActivityKt$BotSettingsScreen$1$1 botSettingsActivityKt$BotSettingsScreen$1$1;
        Composer $composer4 = $composer.startRestartGroup(-769254118);
        ComposerKt.sourceInformation($composer4, "C(BotSettingsScreen)N(botId,botName,initialBotToken,onBack)81@3105L7,82@3129L24,83@3168L33,84@3219L36,85@3276L58,87@3353L44,88@3420L31,89@3473L34,90@3535L34,91@3597L34,92@3649L42,93@3716L62,94@3812L33,97@3893L34,98@3965L34,99@4023L34,100@4083L34,101@4139L34,102@4196L34,103@4253L34,122@5331L2414,122@5309L2436,187@7778L367,197@8152L19366,186@7751L19767:BotSettingsActivity.kt#eelfqe");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer4.changed(botId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer4.changed(botName) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer4.changed(initialBotToken) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer4.changedInstance(function0) ? 2048 : 1024;
        }
        if ($composer4.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-769254118, $dirty2, -1, "com.yhchat.canarys.ui.bot.BotSettingsScreen (BotSettingsActivity.kt:80)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer4, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer4.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            Context context2 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer4, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            boolean z = false;
            ComposerKt.sourceInformationMarkerStart($composer4, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = $composer4.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer4);
                $composer4.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue = objCreateCompositionCoroutineScope;
            }
            final CoroutineScope scope = (CoroutineScope) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518825637, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer4.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object apiService = ApiClient.INSTANCE.getApiService();
                $composer4.updateRememberedValue(apiService);
                objRememberedValue2 = apiService;
            }
            ApiService api2 = (ApiService) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518824002, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer4.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object webApiService = ApiClient.INSTANCE.getWebApiService();
                $composer4.updateRememberedValue(webApiService);
                objRememberedValue3 = webApiService;
            }
            final WebApiService webApi = (WebApiService) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518822156, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer4.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(context2);
                $composer4.updateRememberedValue(tokenRepository);
                objRememberedValue4 = tokenRepository;
            }
            TokenRepository tokenRepo2 = (TokenRepository) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518819706, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer4.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(initialBotToken, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue5 = objMutableStateOf$default;
            }
            MutableState token$delegate2 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518817575, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue6 = $composer4.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                token$delegate = token$delegate2;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue6 = objMutableStateOf$default2;
            } else {
                token$delegate = token$delegate2;
            }
            MutableState webhookUrl$delegate3 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518815876, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer4.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                webhookUrl$delegate = webhookUrl$delegate3;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue7 = objMutableStateOf$default3;
            } else {
                webhookUrl$delegate = webhookUrl$delegate3;
            }
            MutableState isLoading$delegate3 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518813892, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue8 = $composer4.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                isLoading$delegate = isLoading$delegate3;
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue8 = objMutableStateOf$default4;
            } else {
                isLoading$delegate = isLoading$delegate3;
            }
            final MutableState isResettingLink$delegate = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518811908, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue9 = $composer4.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue9 = objMutableStateOf$default5;
            }
            final MutableState isSavingWebhook$delegate = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518810236, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue10 = $composer4.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue10 = objMutableStateOf$default6;
            }
            MutableState error$delegate2 = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518808072, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue11 = $composer4.rememberedValue();
            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                error$delegate = error$delegate2;
                Object objMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default7);
                objRememberedValue11 = objMutableStateOf$default7;
            } else {
                error$delegate = error$delegate2;
            }
            MutableState instructions$delegate2 = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518805029, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue12 = $composer4.rememberedValue();
            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                instructions$delegate = instructions$delegate2;
                Object objMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default8);
                objRememberedValue12 = objMutableStateOf$default8;
            } else {
                instructions$delegate = instructions$delegate2;
            }
            MutableState isLoadingInstructions$delegate2 = (MutableState) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518802436, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue13 = $composer4.rememberedValue();
            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                isLoadingInstructions$delegate = isLoadingInstructions$delegate2;
                Object objMutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default9);
                objRememberedValue13 = objMutableStateOf$default9;
            } else {
                isLoadingInstructions$delegate = isLoadingInstructions$delegate2;
            }
            final MutableState messageReceiveNormal$delegate = (MutableState) objRememberedValue13;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518800132, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue14 = $composer4.rememberedValue();
            if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default10);
                objRememberedValue14 = objMutableStateOf$default10;
            }
            final MutableState messageReceiveInstruction$delegate = (MutableState) objRememberedValue14;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518798276, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue15 = $composer4.rememberedValue();
            if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default11);
                objRememberedValue15 = objMutableStateOf$default11;
            }
            final MutableState botFollowed$delegate = (MutableState) objRememberedValue15;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518796356, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue16 = $composer4.rememberedValue();
            if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default12);
                objRememberedValue16 = objMutableStateOf$default12;
            }
            final MutableState botUnfollowed$delegate = (MutableState) objRememberedValue16;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518794564, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue17 = $composer4.rememberedValue();
            if (objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default13);
                objRememberedValue17 = objMutableStateOf$default13;
            }
            final MutableState groupJoin$delegate = (MutableState) objRememberedValue17;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518792740, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue18 = $composer4.rememberedValue();
            if (objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default14);
                objRememberedValue18 = objMutableStateOf$default14;
            }
            final MutableState groupLeave$delegate = (MutableState) objRememberedValue18;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518790916, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue19 = $composer4.rememberedValue();
            if (objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer4.updateRememberedValue(objMutableStateOf$default15);
                objRememberedValue19 = objMutableStateOf$default15;
            }
            final MutableState botSetting$delegate = (MutableState) objRememberedValue19;
            ComposerKt.sourceInformationMarkerEnd($composer4);
            ComposerKt.sourceInformationMarkerStart($composer4, -518754040, "CC(remember):BotSettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer4.changedInstance(tokenRepo2) | $composer4.changedInstance(context2);
            if (($dirty2 & 14) == 4) {
                z = true;
            }
            boolean zChangedInstance2 = zChangedInstance | z | $composer4.changedInstance(api2);
            Object objRememberedValue20 = $composer4.rememberedValue();
            if (zChangedInstance2 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                $composer3 = $composer4;
                MutableState token$delegate3 = token$delegate;
                webhookUrl$delegate2 = webhookUrl$delegate;
                isLoading$delegate2 = isLoading$delegate;
                $dirty = $dirty2;
                context = context2;
                BotSettingsActivityKt$BotSettingsScreen$1$1 botSettingsActivityKt$BotSettingsScreen$1$12 = new BotSettingsActivityKt$BotSettingsScreen$1$1(tokenRepo2, context, token$delegate3, botId, webhookUrl$delegate2, isLoading$delegate2, error$delegate, api2, messageReceiveNormal$delegate, messageReceiveInstruction$delegate, botFollowed$delegate, botUnfollowed$delegate, groupJoin$delegate, groupLeave$delegate, botSetting$delegate, instructions$delegate, isLoadingInstructions$delegate, null);
                token$delegate = token$delegate3;
                messageReceiveNormal$delegate = messageReceiveNormal$delegate;
                tokenRepo = tokenRepo2;
                str = botId;
                api = api2;
                botSettingsActivityKt$BotSettingsScreen$1$1 = botSettingsActivityKt$BotSettingsScreen$1$12;
                $composer4.updateRememberedValue(botSettingsActivityKt$BotSettingsScreen$1$1);
            } else {
                api = api2;
                botSettingsActivityKt$BotSettingsScreen$1$1 = objRememberedValue20;
                $composer3 = $composer4;
                context = context2;
                tokenRepo = tokenRepo2;
                webhookUrl$delegate2 = webhookUrl$delegate;
                isLoading$delegate2 = isLoading$delegate;
                $dirty = $dirty2;
                str = botId;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Composer $composer5 = $composer3;
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) botSettingsActivityKt$BotSettingsScreen$1$1, $composer5, $dirty & 14);
            final Context context3 = context;
            final TokenRepository tokenRepo3 = tokenRepo;
            final MutableState webhookUrl$delegate4 = webhookUrl$delegate2;
            final MutableState error$delegate3 = error$delegate;
            final MutableState instructions$delegate3 = instructions$delegate;
            final MutableState isLoadingInstructions$delegate3 = isLoadingInstructions$delegate;
            final MutableState isLoading$delegate4 = isLoading$delegate2;
            final MutableState isLoading$delegate5 = token$delegate;
            $composer2 = $composer5;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(668358878, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotSettingsActivityKt.BotSettingsScreen$lambda$50(botName, function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer5, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1731471081, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BotSettingsActivityKt.BotSettingsScreen$lambda$51(error$delegate3, scope, tokenRepo3, api, botId, isLoading$delegate5, isLoading$delegate4, context3, webhookUrl$delegate4, isSavingWebhook$delegate, webApi, isResettingLink$delegate, messageReceiveNormal$delegate, messageReceiveInstruction$delegate, botFollowed$delegate, botUnfollowed$delegate, groupJoin$delegate, groupLeave$delegate, botSetting$delegate, botName, isLoadingInstructions$delegate3, instructions$delegate3, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer5, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer4;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotSettingsActivityKt.BotSettingsScreen$lambda$52(botId, botName, initialBotToken, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BotSettingsScreen$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BotSettingsScreen$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean BotSettingsScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotSettingsScreen$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotSettingsScreen$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BotSettingsScreen$lambda$19(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<BotInstruction> BotSettingsScreen$lambda$22(MutableState<List<BotInstruction>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean BotSettingsScreen$lambda$25(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotSettingsScreen$lambda$28(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$29(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotSettingsScreen$lambda$31(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$32(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotSettingsScreen$lambda$34(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$35(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotSettingsScreen$lambda$37(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$38(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotSettingsScreen$lambda$40(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$41(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotSettingsScreen$lambda$43(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$44(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotSettingsScreen$lambda$46(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotSettingsScreen$lambda$47(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object BotSettingsScreen$submitEventEdit(com.yhchat.canarys.data.repository.TokenRepository r22, java.lang.String r23, com.yhchat.canarys.data.api.ApiService r24, java.lang.String r25, boolean r26, kotlin.coroutines.Continuation<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotSettingsActivityKt.BotSettingsScreen$submitEventEdit(com.yhchat.canarys.data.repository.TokenRepository, java.lang.String, com.yhchat.canarys.data.api.ApiService, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$50(final String $botName, final Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C189@7827L60,190@7922L199,188@7792L343:BotSettingsActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(668358878, $changed, -1, "com.yhchat.canarys.ui.bot.BotSettingsScreen.<anonymous> (BotSettingsActivity.kt:188)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-730038374, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotSettingsActivityKt.BotSettingsScreen$lambda$50$0($botName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1560692008, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotSettingsActivityKt.BotSettingsScreen$lambda$50$1($onBack, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$50$0(String $botName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C189@7829L56:BotSettingsActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-730038374, $changed, -1, "com.yhchat.canarys.ui.bot.BotSettingsScreen.<anonymous>.<anonymous> (BotSettingsActivity.kt:189)");
            }
            TextKt.m3359Text4IGK_g($botName + " \u8bbe\u7f6e", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$50$1(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C191@7944L159:BotSettingsActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1560692008, $changed, -1, "com.yhchat.canarys.ui.bot.BotSettingsScreen.<anonymous>.<anonymous> (BotSettingsActivity.kt:191)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$BotSettingsActivityKt.INSTANCE.m10490getLambda$175110181$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0529  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotSettingsScreen$lambda$51(final androidx.compose.runtime.MutableState r76, final kotlinx.coroutines.CoroutineScope r77, final com.yhchat.canarys.data.repository.TokenRepository r78, final com.yhchat.canarys.data.api.ApiService r79, final java.lang.String r80, final androidx.compose.runtime.MutableState r81, final androidx.compose.runtime.MutableState r82, final android.content.Context r83, final androidx.compose.runtime.MutableState r84, final androidx.compose.runtime.MutableState r85, final com.yhchat.canarys.data.api.WebApiService r86, final androidx.compose.runtime.MutableState r87, final androidx.compose.runtime.MutableState r88, final androidx.compose.runtime.MutableState r89, final androidx.compose.runtime.MutableState r90, final androidx.compose.runtime.MutableState r91, final androidx.compose.runtime.MutableState r92, final androidx.compose.runtime.MutableState r93, final androidx.compose.runtime.MutableState r94, final java.lang.String r95, final androidx.compose.runtime.MutableState r96, final androidx.compose.runtime.MutableState r97, androidx.compose.foundation.layout.PaddingValues r98, androidx.compose.runtime.Composer r99, int r100) {
        /*
            Method dump skipped, instructions count: 1333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotSettingsActivityKt.BotSettingsScreen$lambda$51(androidx.compose.runtime.MutableState, kotlinx.coroutines.CoroutineScope, com.yhchat.canarys.data.repository.TokenRepository, com.yhchat.canarys.data.api.ApiService, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, android.content.Context, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, com.yhchat.canarys.data.api.WebApiService, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x044d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotSettingsScreen$lambda$51$0$0$0(final kotlinx.coroutines.CoroutineScope r87, final com.yhchat.canarys.data.repository.TokenRepository r88, final com.yhchat.canarys.data.api.ApiService r89, final java.lang.String r90, final androidx.compose.runtime.MutableState r91, final androidx.compose.runtime.MutableState r92, final androidx.compose.runtime.MutableState r93, androidx.compose.foundation.layout.ColumnScope r94, androidx.compose.runtime.Composer r95, int r96) {
        /*
            Method dump skipped, instructions count: 1111
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotSettingsActivityKt.BotSettingsScreen$lambda$51$0$0$0(kotlinx.coroutines.CoroutineScope, com.yhchat.canarys.data.repository.TokenRepository, com.yhchat.canarys.data.api.ApiService, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$0$0$0$0$0(MutableState $token$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $token$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$0$0$0$1$0(CoroutineScope $scope, TokenRepository $tokenRepo, MutableState $isLoading$delegate, MutableState $error$delegate, ApiService $api, String $botId, MutableState $token$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotSettingsActivityKt$BotSettingsScreen$3$1$1$1$1$1$2$1$1($tokenRepo, $isLoading$delegate, $error$delegate, $api, $botId, $token$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$1(final CoroutineScope $scope, final TokenRepository $tokenRepo, final ApiService $api, final String $botId, final Context $context, final MutableState $webhookUrl$delegate, final MutableState $isSavingWebhook$delegate, MutableState $isLoading$delegate, final MutableState $error$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C282@12136L4131:BotSettingsActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(609673252, $changed, -1, "com.yhchat.canarys.ui.bot.BotSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotSettingsActivity.kt:282)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1276443932, "C289@12431L10,287@12324L288,296@12771L10,297@12843L11,294@12662L308,301@13020L3225:BotSettingsActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("Webhook \u8ba2\u9605\u5730\u5740", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 196662, 0, 65500);
            TextKt.m3359Text4IGK_g("\u673a\u5668\u4eba\u63a5\u6536\u6d88\u606f\u4e8b\u4ef6\u7684\u56de\u8c03\u5730\u5740", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(12), 7, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 54, 0, 65528);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((390 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i6 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1375757346, "C307@13339L19,305@13220L436,314@13714L39,317@13861L1600,344@15566L653,316@13811L2408:BotSettingsActivity.kt#eelfqe");
            String strBotSettingsScreen$lambda$7 = BotSettingsScreen$lambda$7($webhookUrl$delegate);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            boolean z = (BotSettingsScreen$lambda$16($isSavingWebhook$delegate) || BotSettingsScreen$lambda$10($isLoading$delegate)) ? false : true;
            ComposerKt.sourceInformationMarkerStart($composer, -94167235, "CC(remember):BotSettingsActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BotSettingsActivityKt.BotSettingsScreen$lambda$51$0$0$1$0$0$0$0($webhookUrl$delegate, (String) obj);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strBotSettingsScreen$lambda$7, (Function1<? super String, Unit>) objRememberedValue, modifierWeight$default, z, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$BotSettingsActivityKt.INSTANCE.getLambda$1416419057$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 12582960, 12582912, 0, 8257392);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, -94148950, "CC(remember):BotSettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changedInstance($tokenRepo) | $composer.changedInstance($api) | $composer.changed($botId) | $composer.changedInstance($context);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotSettingsActivityKt.BotSettingsScreen$lambda$51$0$0$1$0$0$1$0($scope, $tokenRepo, $isSavingWebhook$delegate, $error$delegate, $api, $botId, $webhookUrl$delegate, $context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            Function0 function03 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button(function03, null, (BotSettingsScreen$lambda$16($isSavingWebhook$delegate) || BotSettingsScreen$lambda$10($isLoading$delegate)) ? false : true, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1265922790, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BotSettingsActivityKt.BotSettingsScreen$lambda$51$0$0$1$0$0$2($isSavingWebhook$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306368, 506);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$1$0$0$0$0(MutableState $webhookUrl$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $webhookUrl$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$1$0$0$1$0(CoroutineScope $scope, TokenRepository $tokenRepo, MutableState $isSavingWebhook$delegate, MutableState $error$delegate, ApiService $api, String $botId, MutableState $webhookUrl$delegate, Context $context) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1($tokenRepo, $isSavingWebhook$delegate, $error$delegate, $api, $botId, $webhookUrl$delegate, $context, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$1$0$0$2(MutableState $isSavingWebhook$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:BotSettingsActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1265922790, $changed, -1, "com.yhchat.canarys.ui.bot.BotSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotSettingsActivity.kt:345)");
            }
            if (BotSettingsScreen$lambda$16($isSavingWebhook$delegate)) {
                $composer.startReplaceGroup(1002058728);
                ComposerKt.sourceInformation($composer, "349@15881L11,346@15659L281,351@15977L39,352@16053L14");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u4fdd\u5b58\u4e2d...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1002528502);
                ComposerKt.sourceInformation($composer, "354@16145L10");
                TextKt.m3359Text4IGK_g("\u4fdd\u5b58", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$2(final CoroutineScope $scope, final TokenRepository $tokenRepo, final WebApiService $webApi, final String $botId, final Context $context, final MutableState $isResettingLink$delegate, final MutableState $error$delegate, MutableState $isLoading$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Object obj;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C366@16533L3304:BotSettingsActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1589458493, $changed, -1, "com.yhchat.canarys.ui.bot.BotSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotSettingsActivity.kt:366)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -179151680, "C373@16822L10,371@16721L282,380@17169L10,381@17241L11,378@17053L315,386@17464L1581,414@19206L609,385@17418L2397:BotSettingsActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("\u8ba2\u9605\u94fe\u63a5\u7ba1\u7406", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 196662, 0, 65500);
            TextKt.m3359Text4IGK_g("\u5982\u679c\u673a\u5668\u4eba\u8ba2\u9605\u94fe\u63a5\u5931\u6548\uff0c\u53ef\u4ee5\u4f7f\u7528\u6b64\u529f\u80fd\u6062\u590d", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(12), 7, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 54, 0, 65528);
            ComposerKt.sourceInformationMarkerStart($composer, 1656811162, "CC(remember):BotSettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changedInstance($tokenRepo) | $composer.changedInstance($webApi) | $composer.changed($botId) | $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotSettingsActivityKt.BotSettingsScreen$lambda$51$0$0$2$0$0$0($scope, $tokenRepo, $isResettingLink$delegate, $error$delegate, $webApi, $botId, $context);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue;
            }
            Function0 function02 = (Function0) obj;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button(function02, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), (BotSettingsScreen$lambda$13($isResettingLink$delegate) || BotSettingsScreen$lambda$10($isLoading$delegate)) ? false : true, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1604073885, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BotSettingsActivityKt.BotSettingsScreen$lambda$51$0$0$2$0$1($isResettingLink$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306416, 504);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$2$0$0$0(CoroutineScope $scope, TokenRepository $tokenRepo, MutableState $isResettingLink$delegate, MutableState $error$delegate, WebApiService $webApi, String $botId, Context $context) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotSettingsActivityKt$BotSettingsScreen$3$1$1$3$1$1$1$1($tokenRepo, $isResettingLink$delegate, $error$delegate, $webApi, $botId, $context, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$2$0$1(MutableState $isResettingLink$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:BotSettingsActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1604073885, $changed, -1, "com.yhchat.canarys.ui.bot.BotSettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotSettingsActivity.kt:415)");
            }
            if (BotSettingsScreen$lambda$13($isResettingLink$delegate)) {
                $composer.startReplaceGroup(1159037221);
                ComposerKt.sourceInformation($composer, "419@19501L11,416@19291L265,421@19589L39,422@19661L14");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                TextKt.m3359Text4IGK_g("\u6062\u590d\u4e2d...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1159476119);
                ComposerKt.sourceInformation($composer, "424@19745L14");
                TextKt.m3359Text4IGK_g("\u6062\u590d\u8ba2\u9605\u94fe\u63a5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0412  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotSettingsScreen$lambda$51$0$0$3(final kotlinx.coroutines.CoroutineScope r55, final com.yhchat.canarys.data.repository.TokenRepository r56, final java.lang.String r57, final com.yhchat.canarys.data.api.ApiService r58, final androidx.compose.runtime.MutableState r59, final androidx.compose.runtime.MutableState r60, final androidx.compose.runtime.MutableState r61, final androidx.compose.runtime.MutableState r62, final androidx.compose.runtime.MutableState r63, final androidx.compose.runtime.MutableState r64, final androidx.compose.runtime.MutableState r65, androidx.compose.foundation.layout.ColumnScope r66, androidx.compose.runtime.Composer r67, int r68) {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotSettingsActivityKt.BotSettingsScreen$lambda$51$0$0$3(kotlinx.coroutines.CoroutineScope, com.yhchat.canarys.data.repository.TokenRepository, java.lang.String, com.yhchat.canarys.data.api.ApiService, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$3$0$0$0(CoroutineScope $scope, MutableState $messageReceiveNormal$delegate, TokenRepository $tokenRepo, String $botId, ApiService $api, boolean checked) {
        BotSettingsScreen$lambda$29($messageReceiveNormal$delegate, checked);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$1$1$1(checked, $tokenRepo, $botId, $api, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$3$0$1$0(CoroutineScope $scope, MutableState $messageReceiveInstruction$delegate, TokenRepository $tokenRepo, String $botId, ApiService $api, boolean checked) {
        BotSettingsScreen$lambda$32($messageReceiveInstruction$delegate, checked);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$2$1$1(checked, $tokenRepo, $botId, $api, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$3$0$2$0(CoroutineScope $scope, MutableState $botFollowed$delegate, TokenRepository $tokenRepo, String $botId, ApiService $api, boolean checked) {
        BotSettingsScreen$lambda$35($botFollowed$delegate, checked);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$3$1$1(checked, $tokenRepo, $botId, $api, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$3$0$3$0(CoroutineScope $scope, MutableState $botUnfollowed$delegate, TokenRepository $tokenRepo, String $botId, ApiService $api, boolean checked) {
        BotSettingsScreen$lambda$38($botUnfollowed$delegate, checked);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$4$1$1(checked, $tokenRepo, $botId, $api, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$3$0$4$0(CoroutineScope $scope, MutableState $groupJoin$delegate, TokenRepository $tokenRepo, String $botId, ApiService $api, boolean checked) {
        BotSettingsScreen$lambda$41($groupJoin$delegate, checked);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$5$1$1(checked, $tokenRepo, $botId, $api, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$3$0$5$0(CoroutineScope $scope, MutableState $groupLeave$delegate, TokenRepository $tokenRepo, String $botId, ApiService $api, boolean checked) {
        BotSettingsScreen$lambda$44($groupLeave$delegate, checked);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$6$1$1(checked, $tokenRepo, $botId, $api, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$3$0$6$0(CoroutineScope $scope, MutableState $botSetting$delegate, TokenRepository $tokenRepo, String $botId, ApiService $api, boolean checked) {
        BotSettingsScreen$lambda$47($botSetting$delegate, checked);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$7$1$1(checked, $tokenRepo, $botId, $api, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x04cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotSettingsScreen$lambda$51$0$0$4(final android.content.Context r150, final java.lang.String r151, final java.lang.String r152, androidx.compose.runtime.MutableState r153, androidx.compose.runtime.MutableState r154, androidx.compose.foundation.layout.ColumnScope r155, androidx.compose.runtime.Composer r156, int r157) {
        /*
            Method dump skipped, instructions count: 2954
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotSettingsActivityKt.BotSettingsScreen$lambda$51$0$0$4(android.content.Context, java.lang.String, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotSettingsScreen$lambda$51$0$0$4$0$0$0$0(Context $context, String $botId, String $botName) {
        InstructionManagementActivity.INSTANCE.start($context, $botId, $botName);
        return Unit.INSTANCE;
    }

    private static final void SubscriptionSwitch(String title, boolean checked, Function1<? super Boolean, Unit> function1, Composer $composer, final int $changed) {
        final String str;
        final boolean z;
        final Function1<? super Boolean, Unit> function12;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-2085720972);
        ComposerKt.sourceInformation($composer3, "C(SubscriptionSwitch)N(title,checked,onCheckedChange)574@27640L316:BotSettingsActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(checked) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            str = title;
            z = checked;
            function12 = function1;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2085720972, $dirty, -1, "com.yhchat.canarys.ui.bot.SubscriptionSwitch (BotSettingsActivity.kt:573)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -1652612561, "C579@27859L10,579@27818L63,580@27890L60:BotSettingsActivity.kt#eelfqe");
            int $dirty2 = $dirty;
            $composer2 = $composer3;
            TextKt.m3359Text4IGK_g(title, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyMedium(), $composer3, $dirty & 14, 0, 65534);
            str = title;
            z = checked;
            function12 = function1;
            SwitchKt.Switch(z, function12, null, null, false, null, null, $composer3, (($dirty2 >> 3) & 14) | (($dirty2 >> 3) & 112), 124);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotSettingsActivityKt.SubscriptionSwitch$lambda$1(str, z, function12, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
