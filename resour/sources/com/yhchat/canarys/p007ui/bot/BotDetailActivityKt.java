package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.BlockKt;
import androidx.compose.material.icons.filled.CancelKt;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.CheckKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.ErrorKt;
import androidx.compose.material.icons.filled.GroupAddKt;
import androidx.compose.material.icons.filled.LockKt;
import androidx.compose.material.icons.filled.NotificationsKt;
import androidx.compose.material.icons.filled.NotificationsOffKt;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material.icons.filled.PublicKt;
import androidx.compose.material.icons.filled.PushPinKt;
import androidx.compose.material.icons.filled.RemoveKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ListItemDefaults;
import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.ContentScale;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.local.AppDatabase;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.p007ui.background.ChatBackgroundActivity;
import com.yhchat.canarys.p007ui.components.ImageUtils;
import com.yhchat.canarys.p007ui.components.ImageViewerKt;
import com.yhchat.canarys.p007ui.components.ReportDialogKt;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.bot.Bot;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: BotDetailActivity.kt */
@Metadata(m168d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003\u00a2\u0006\u0002\u0010\u000b\u001a\u0015\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010\u000e\u001a?\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0003\u00a2\u0006\u0002\u0010\u0016\u001aG\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010 H\u0003\u00a2\u0006\u0002\u0010!\u001a/\u0010\"\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0003\u00a2\u0006\u0002\u0010%\u001a/\u0010&\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0003\u00a2\u0006\u0002\u0010%\u001a/\u0010'\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001eH\u0003\u00a2\u0006\u0002\u0010%\u001a\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020*H\u0002\u00a8\u0006+\u00b2\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002\u00b2\u0006\n\u0010.\u001a\u00020\u0014X\u008a\u008e\u0002\u00b2\u0006\n\u0010/\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u00100\u001a\u00020\u0014X\u008a\u008e\u0002\u00b2\u0006\n\u00101\u001a\u00020\u0014X\u008a\u008e\u0002\u00b2\u0006\n\u00102\u001a\u00020\u0014X\u008a\u008e\u0002\u00b2\u0006\n\u00103\u001a\u00020\u0014X\u008a\u008e\u0002\u00b2\u0006\n\u00104\u001a\u00020\u0014X\u008a\u008e\u0002"}, m169d2 = {"BotDetailScreen", "", "botId", "", "botName", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "viewModel", "Lcom/yhchat/canarys/ui/bot/BotDetailViewModel;", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;ILcom/yhchat/canarys/ui/bot/BotDetailViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SheetSectionHeader", "title", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SheetActionItem", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "onClick", "enabled", "", "isDestructive", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "BotDetailContent", "botInfo", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info;", "boardInfo", "Lcom/yhchat/canarys/proto/bot/Bot$board;", "isBoardLoading", "modifier", "Landroidx/compose/ui/Modifier;", "onAvatarClick", "Lkotlin/Function1;", "(Lcom/yhchat/canarys/proto/bot/Bot$bot_info;Lcom/yhchat/canarys/proto/bot/Bot$board;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "StatisticItem", "label", "value", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "EnhancedStatisticItem", "DetailItem", "formatDate", "timestamp", "", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/bot/BotDetailUiState;", "showImageViewer", "currentImageUrl", "showDeleteDialog", "showMoreSheet", "showReportDialog", "isNoNotify", "isSettingNoNotify"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotDetailActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailContent$lambda$2(Bot.bot_info bot_infoVar, Bot.board boardVar, boolean z, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        BotDetailContent(bot_infoVar, boardVar, z, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$34(String str, String str2, int i, BotDetailViewModel botDetailViewModel, Function0 function0, int i2, Composer composer, int i3) {
        BotDetailScreen(str, str2, i, botDetailViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DetailItem$lambda$1(ImageVector imageVector, String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DetailItem(imageVector, str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnhancedStatisticItem$lambda$1(ImageVector imageVector, String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EnhancedStatisticItem(imageVector, str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetActionItem$lambda$3(ImageVector imageVector, String str, Function0 function0, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        SheetActionItem(imageVector, str, function0, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetSectionHeader$lambda$0(String str, int i, Composer composer, int i2) {
        SheetSectionHeader(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatisticItem$lambda$1(ImageVector imageVector, String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StatisticItem(imageVector, str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotDetailScreen(final String botId, final String botName, final int chatType, final BotDetailViewModel viewModel, final Function0<Unit> function0, Composer $composer, final int $changed) {
        BotDetailViewModel botDetailViewModel;
        final String str;
        State uiState$delegate;
        MutableState showImageViewer$delegate;
        MutableState currentImageUrl$delegate;
        int i;
        final MutableState showMoreSheet$delegate;
        MutableState showMoreSheet$delegate2;
        Context context;
        String str2;
        Composer $composer2;
        boolean z;
        int i2;
        int i3;
        String str3;
        int i4;
        final Context context2;
        MutableState isNoNotify$delegate;
        final MutableState showDeleteDialog$delegate;
        final String str4;
        MutableState showImageViewer$delegate2;
        Composer $composer3 = $composer.startRestartGroup(413162242);
        ComposerKt.sourceInformation($composer3, "C(BotDetailScreen)N(botId,botName,chatType,viewModel,onBackClick)144@5582L29,145@5639L34,146@5701L31,147@5761L34,148@5821L34,149@5884L34,151@5946L34,152@6010L34,153@6076L7,156@6131L234,156@6109L256,164@6398L788,187@7193L2219,163@6371L3041:BotDetailActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(botId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(botName) ? 32 : 16;
        }
        if (($changed & 3072) == 0) {
            botDetailViewModel = viewModel;
            $dirty |= $composer3.changedInstance(botDetailViewModel) ? 2048 : 1024;
        } else {
            botDetailViewModel = viewModel;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 16384 : 8192;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 9235) != 9234, $dirty2 & 1)) {
            str = botName;
            $composer3.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(413162242, $dirty2, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen (BotDetailActivity.kt:143)");
            }
            State uiState$delegate2 = FlowExtKt.collectAsStateWithLifecycle(botDetailViewModel.getUiState(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer3, 0, 7);
            ComposerKt.sourceInformationMarkerStart($composer3, 1911931076, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                uiState$delegate = uiState$delegate2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                uiState$delegate = uiState$delegate2;
            }
            MutableState showImageViewer$delegate3 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1911933057, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                showImageViewer$delegate = showImageViewer$delegate3;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            } else {
                showImageViewer$delegate = showImageViewer$delegate3;
            }
            MutableState currentImageUrl$delegate2 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1911934980, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            MutableState showDeleteDialog$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1911936900, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue4 = objMutableStateOf$default4;
            }
            final MutableState showMoreSheet$delegate3 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1911938916, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue5 = objMutableStateOf$default5;
            }
            final MutableState showReportDialog$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1911940900, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                currentImageUrl$delegate = currentImageUrl$delegate2;
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue6 = objMutableStateOf$default6;
            } else {
                currentImageUrl$delegate = currentImageUrl$delegate2;
            }
            final MutableState isNoNotify$delegate2 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1911942948, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default7);
                objRememberedValue7 = objMutableStateOf$default7;
            }
            final MutableState isSettingNoNotify$delegate = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context3 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 1911947020, "CC(remember):BotDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(context3) | (($dirty2 & 14) == 4);
            Object objRememberedValue8 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new BotDetailActivityKt$BotDetailScreen$1$1(context3, botId, isNoNotify$delegate2, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue8 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(botId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, $composer3, $dirty2 & 14);
            final MutableState showImageViewer$delegate4 = showImageViewer$delegate;
            final State uiState$delegate3 = uiState$delegate;
            final MutableState currentImageUrl$delegate3 = currentImageUrl$delegate;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(891359430, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BotDetailActivityKt.BotDetailScreen$lambda$23(function0, showMoreSheet$delegate3, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-2415023, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return BotDetailActivityKt.BotDetailScreen$lambda$24(uiState$delegate3, viewModel, botId, currentImageUrl$delegate3, showImageViewer$delegate4, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 805306416, 509);
            if (BotDetailScreen$lambda$2(showImageViewer$delegate4)) {
                $composer3.startReplaceGroup(-855888323);
                ComposerKt.sourceInformation($composer3, "249@9576L27,247@9499L114");
                String strBotDetailScreen$lambda$5 = BotDetailScreen$lambda$5(currentImageUrl$delegate3);
                ComposerKt.sourceInformationMarkerStart($composer3, 1912057053, "CC(remember):BotDetailActivity.kt#9igjgp");
                Object objRememberedValue9 = $composer3.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotDetailActivityKt.BotDetailScreen$lambda$25$0(showImageViewer$delegate4);
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue9 = obj2;
                }
                Function0 function02 = (Function0) objRememberedValue9;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                i = -865274720;
                ImageViewerKt.ImageViewer(strBotDetailScreen$lambda$5, function02, null, $composer3, 48, 4);
            } else {
                i = -865274720;
                $composer3.startReplaceGroup(-865274720);
            }
            $composer3.endReplaceGroup();
            if (BotDetailScreen$lambda$14(showReportDialog$delegate)) {
                $composer3.startReplaceGroup(-855678670);
                ComposerKt.sourceInformation($composer3, "259@9804L28,260@9858L91,255@9673L286");
                ComposerKt.sourceInformationMarkerStart($composer3, 1912064350, "CC(remember):BotDetailActivity.kt#9igjgp");
                Object objRememberedValue10 = $composer3.rememberedValue();
                if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotDetailActivityKt.BotDetailScreen$lambda$26$0(showReportDialog$delegate);
                        }
                    };
                    $composer3.updateRememberedValue(obj3);
                    objRememberedValue10 = obj3;
                }
                Function0 function03 = (Function0) objRememberedValue10;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerStart($composer3, 1912066141, "CC(remember):BotDetailActivity.kt#9igjgp");
                boolean zChangedInstance2 = $composer3.changedInstance(context3);
                Object objRememberedValue11 = $composer3.rememberedValue();
                if (zChangedInstance2 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    showImageViewer$delegate2 = showImageViewer$delegate4;
                    Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotDetailActivityKt.BotDetailScreen$lambda$27$0(context3);
                        }
                    };
                    $composer3.updateRememberedValue(obj4);
                    objRememberedValue11 = obj4;
                } else {
                    showImageViewer$delegate2 = showImageViewer$delegate4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                showMoreSheet$delegate = showMoreSheet$delegate3;
                str2 = "CC(remember):BotDetailActivity.kt#9igjgp";
                showMoreSheet$delegate2 = showReportDialog$delegate;
                z = true;
                i3 = -865274720;
                i2 = 54;
                context = context3;
                ReportDialogKt.ReportDialog(botId, 3, botName, function03, (Function0) objRememberedValue11, $composer3, ($dirty2 & 14) | 3120 | (($dirty2 << 3) & 896), 0);
                $composer2 = $composer3;
            } else {
                showMoreSheet$delegate = showMoreSheet$delegate3;
                showMoreSheet$delegate2 = showReportDialog$delegate;
                context = context3;
                str2 = "CC(remember):BotDetailActivity.kt#9igjgp";
                $composer2 = $composer3;
                z = true;
                i2 = 54;
                i3 = i;
                $composer2.startReplaceGroup(i3);
            }
            $composer2.endReplaceGroup();
            if (BotDetailScreen$lambda$11(showMoreSheet$delegate)) {
                $composer2.startReplaceGroup(-855196341);
                ComposerKt.sourceInformation($composer2, "269@10076L25,270@10112L4432,268@10027L4517");
                ComposerKt.sourceInformationMarkerStart($composer2, 1912073051, str2);
                Composer composer = $composer2;
                Object objRememberedValue12 = composer.rememberedValue();
                if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotDetailActivityKt.BotDetailScreen$lambda$28$0(showMoreSheet$delegate);
                        }
                    };
                    composer.updateRememberedValue(obj5);
                    objRememberedValue12 = obj5;
                }
                Function0 function04 = (Function0) objRememberedValue12;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Composer $composer4 = $composer2;
                final MutableState showReportDialog$delegate2 = showMoreSheet$delegate2;
                final MutableState showMoreSheet$delegate4 = showMoreSheet$delegate;
                final Context context4 = context;
                showDeleteDialog$delegate = showDeleteDialog$delegate2;
                Function3 function3 = new Function3() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        return BotDetailActivityKt.BotDetailScreen$lambda$29(context4, botId, botName, showMoreSheet$delegate4, showReportDialog$delegate2, isNoNotify$delegate2, isSettingNoNotify$delegate, showDeleteDialog$delegate, (ColumnScope) obj6, (Composer) obj7, ((Integer) obj8).intValue());
                    }
                };
                str4 = botId;
                str = botName;
                context2 = context4;
                isNoNotify$delegate = isNoNotify$delegate2;
                i4 = -865274720;
                str3 = str2;
                ModalBottomSheetKt.m2908ModalBottomSheetdYc4hso(function04, null, null, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(2065588594, z, function3, $composer4, i2), $composer4, 6, 384, 4094);
                $composer3 = $composer4;
            } else {
                str = botName;
                str3 = str2;
                i4 = i3;
                context2 = context;
                isNoNotify$delegate = isNoNotify$delegate2;
                showDeleteDialog$delegate = showDeleteDialog$delegate2;
                $composer3 = $composer2;
                str4 = botId;
                $composer3.startReplaceGroup(i4);
            }
            $composer3.endReplaceGroup();
            if (BotDetailScreen$lambda$8(showDeleteDialog$delegate)) {
                $composer3.startReplaceGroup(-850718546);
                ComposerKt.sourceInformation($composer3, "371@14654L28,382@15021L1722,415@16773L133,379@14931L60,370@14610L2306");
                ComposerKt.sourceInformationMarkerStart($composer3, 1912219550, str3);
                Composer composer2 = $composer3;
                Object objRememberedValue13 = composer2.rememberedValue();
                if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    Object obj6 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BotDetailActivityKt.BotDetailScreen$lambda$30$0(showDeleteDialog$delegate);
                        }
                    };
                    composer2.updateRememberedValue(obj6);
                    objRememberedValue13 = obj6;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                Composer $composer5 = $composer3;
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue13, ComposableLambdaKt.rememberComposableLambda(-1310863090, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj7, Object obj8) {
                        return BotDetailActivityKt.BotDetailScreen$lambda$31(context2, str4, showDeleteDialog$delegate, (Composer) obj7, ((Integer) obj8).intValue());
                    }
                }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(788875340, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj7, Object obj8) {
                        return BotDetailActivityKt.BotDetailScreen$lambda$32(showDeleteDialog$delegate, (Composer) obj7, ((Integer) obj8).intValue());
                    }
                }, $composer3, 54), null, ComposableSingletons$BotDetailActivityKt.INSTANCE.m10471getLambda$1406353526$app_debug(), ComposableLambdaKt.rememberComposableLambda(-356484311, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj7, Object obj8) {
                        return BotDetailActivityKt.BotDetailScreen$lambda$33(str, (Composer) obj7, ((Integer) obj8).intValue());
                    }
                }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer5, 1772598, 0, 16276);
                $composer3 = $composer5;
            } else {
                $composer3.startReplaceGroup(i4);
            }
            $composer3.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj7, Object obj8) {
                    return BotDetailActivityKt.BotDetailScreen$lambda$34(botId, str, chatType, viewModel, function0, $changed, (Composer) obj7, ((Integer) obj8).intValue());
                }
            });
        }
    }

    private static final BotDetailUiState BotDetailScreen$lambda$0(State<BotDetailUiState> state) {
        return (BotDetailUiState) state.getValue();
    }

    private static final boolean BotDetailScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BotDetailScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String BotDetailScreen$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean BotDetailScreen$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BotDetailScreen$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotDetailScreen$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BotDetailScreen$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotDetailScreen$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BotDetailScreen$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotDetailScreen$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotDetailScreen$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean BotDetailScreen$lambda$20(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BotDetailScreen$lambda$21(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$23(final Function0 $onBackClick, final MutableState $showMoreSheet$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C172@6644L286,180@6958L204,165@6412L764:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(891359430, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen.<anonymous> (BotDetailActivity.kt:165)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$BotDetailActivityKt.INSTANCE.m10470getLambda$1275658878$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-1523627072, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotDetailActivityKt.BotDetailScreen$lambda$23$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(422134839, true, new Function3() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BotDetailActivityKt.BotDetailScreen$lambda$23$1($showMoreSheet$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$23$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C173@6666L246:BotDetailActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1523627072, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen.<anonymous>.<anonymous> (BotDetailActivity.kt:173)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$BotDetailActivityKt.INSTANCE.m10475getLambda$79483837$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$23$1(final MutableState $showMoreSheet$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C181@7001L24,181@6980L164:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(422134839, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen.<anonymous>.<anonymous> (BotDetailActivity.kt:181)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1944655855, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotDetailActivityKt.BotDetailScreen$lambda$23$1$0$0($showMoreSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$BotDetailActivityKt.INSTANCE.getLambda$755386132$app_debug(), $composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$23$1$0$0(MutableState $showMoreSheet$delegate) {
        BotDetailScreen$lambda$12($showMoreSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$24(State $uiState$delegate, final BotDetailViewModel $viewModel, final String $botId, final MutableState $currentImageUrl$delegate, final MutableState $showImageViewer$delegate, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Composer composer;
        boolean zChangedInstance;
        Object objRememberedValue;
        Function0 function03;
        int i;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues):BotDetailActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2415023, $dirty2, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen.<anonymous> (BotDetailActivity.kt:188)");
            }
            if (BotDetailScreen$lambda$0($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(1068569791);
                ComposerKt.sourceInformation($composer, "190@7278L274");
                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierPadding);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i2 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function03 = constructor;
                    $composer.createNode(function03);
                } else {
                    function03 = constructor;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl.getInserting()) {
                    i = iHashCode;
                } else {
                    i = iHashCode;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i4 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1458218005, "C196@7507L27:BotDetailActivity.kt#eelfqe");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                }
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(i));
                composerM4376constructorimpl.apply(Integer.valueOf(i), setCompositeKeyHash);
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i32 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i42 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1458218005, "C196@7507L27:BotDetailActivity.kt#eelfqe");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else if (BotDetailScreen$lambda$0($uiState$delegate).getError() != null) {
                $composer.startReplaceGroup(1068941853);
                ComposerKt.sourceInformation($composer, "200@7622L1268");
                Modifier modifierPadding2 = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierPadding2);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function0 = constructor2;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i6 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                int i7 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1087078052, "C206@7851L1021:BotDetailActivity.kt#eelfqe");
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, centerHorizontally, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i8 = ((((432 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function02 = constructor3;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor3;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM4376constructorimpl3.getInserting()) {
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i9 = (i8 >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i10 = ((432 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1694527926, "C214@8291L11,210@8057L277,218@8467L10,219@8540L11,216@8359L293,223@8723L34,222@8677L173:BotDetailActivity.kt#eelfqe");
                    IconKt.m2816Iconww6aTOc(ErrorKt.getError(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getError(), composer2, 432, 0);
                    String error = BotDetailScreen$lambda$0($uiState$delegate).getError();
                    Intrinsics.checkNotNull(error);
                    TextKt.m3359Text4IGK_g(error, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 0, 0, 65018);
                    ComposerKt.sourceInformationMarkerStart(composer2, 2132892726, "CC(remember):BotDetailActivity.kt#9igjgp");
                    zChangedInstance = composer2.changedInstance($viewModel) | composer2.changed($botId);
                    objRememberedValue = composer2.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return BotDetailActivityKt.BotDetailScreen$lambda$24$1$0$0$0($viewModel, $botId);
                            }
                        };
                        composer2.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ButtonKt.Button((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$BotDetailActivityKt.INSTANCE.getLambda$580368548$app_debug(), composer2, 805306368, 510);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                } else {
                    composer = $composer;
                }
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i92 = (i8 >> 6) & 14;
                Composer composer22 = composer;
                ComposerKt.sourceInformationMarkerStart(composer22, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i102 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer22, 1694527926, "C214@8291L11,210@8057L277,218@8467L10,219@8540L11,216@8359L293,223@8723L34,222@8677L173:BotDetailActivity.kt#eelfqe");
                IconKt.m2816Iconww6aTOc(ErrorKt.getError(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme(composer22, MaterialTheme.$stable).getError(), composer22, 432, 0);
                String error2 = BotDetailScreen$lambda$0($uiState$delegate).getError();
                Intrinsics.checkNotNull(error2);
                TextKt.m3359Text4IGK_g(error2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer22, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer22, MaterialTheme.$stable).getBodyMedium(), composer22, 0, 0, 65018);
                ComposerKt.sourceInformationMarkerStart(composer22, 2132892726, "CC(remember):BotDetailActivity.kt#9igjgp");
                zChangedInstance = composer22.changedInstance($viewModel) | composer22.changed($botId);
                objRememberedValue = composer22.rememberedValue();
                if (!zChangedInstance) {
                }
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotDetailActivityKt.BotDetailScreen$lambda$24$1$0$0$0($viewModel, $botId);
                    }
                };
                composer22.updateRememberedValue(obj2);
                objRememberedValue = obj2;
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ButtonKt.Button((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$BotDetailActivityKt.INSTANCE.getLambda$580368548$app_debug(), composer22, 805306368, 510);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                if (BotDetailScreen$lambda$0($uiState$delegate).getBotInfo() != null) {
                    $composer.startReplaceGroup(1070244845);
                    ComposerKt.sourceInformation($composer, "236@9241L123,231@8962L420");
                    Bot.bot_info botInfo = BotDetailScreen$lambda$0($uiState$delegate).getBotInfo();
                    Intrinsics.checkNotNull(botInfo);
                    Bot.board boardInfo = BotDetailScreen$lambda$0($uiState$delegate).getBoardInfo();
                    boolean zIsBoardLoading = BotDetailScreen$lambda$0($uiState$delegate).isBoardLoading();
                    Modifier modifierPadding3 = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                    ComposerKt.sourceInformationMarkerStart($composer, 1974195852, "CC(remember):BotDetailActivity.kt#9igjgp");
                    Object objRememberedValue2 = $composer.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                return BotDetailActivityKt.BotDetailScreen$lambda$24$2$0($currentImageUrl$delegate, $showImageViewer$delegate, (String) obj4);
                            }
                        };
                        $composer.updateRememberedValue(obj3);
                        objRememberedValue2 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    BotDetailContent(botInfo, boardInfo, zIsBoardLoading, modifierPadding3, (Function1) objRememberedValue2, $composer, 24576, 0);
                } else {
                    $composer.startReplaceGroup(1061357393);
                }
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$24$1$0$0$0(BotDetailViewModel $viewModel, String $botId) {
        $viewModel.loadBotDetail($botId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$24$2$0(MutableState $currentImageUrl$delegate, MutableState $showImageViewer$delegate, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        $currentImageUrl$delegate.setValue(url);
        BotDetailScreen$lambda$3($showImageViewer$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$25$0(MutableState $showImageViewer$delegate) {
        BotDetailScreen$lambda$3($showImageViewer$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$26$0(MutableState $showReportDialog$delegate) {
        BotDetailScreen$lambda$15($showReportDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$27$0(Context $context) {
        Toast.makeText($context, "\u4e3e\u62a5\u5df2\u63d0\u4ea4", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$28$0(MutableState $showMoreSheet$delegate) {
        BotDetailScreen$lambda$12($showMoreSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x035a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotDetailScreen$lambda$29(final android.content.Context r56, final java.lang.String r57, final java.lang.String r58, final androidx.compose.runtime.MutableState r59, final androidx.compose.runtime.MutableState r60, final androidx.compose.runtime.MutableState r61, final androidx.compose.runtime.MutableState r62, final androidx.compose.runtime.MutableState r63, androidx.compose.foundation.layout.ColumnScope r64, androidx.compose.runtime.Composer r65, int r66) {
        /*
            Method dump skipped, instructions count: 872
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotDetailActivityKt.BotDetailScreen$lambda$29(android.content.Context, java.lang.String, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$29$0$0$0(MutableState $showMoreSheet$delegate, MutableState $showReportDialog$delegate) {
        BotDetailScreen$lambda$12($showMoreSheet$delegate, false);
        BotDetailScreen$lambda$15($showReportDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$29$0$1$0(Context $context, String $botId, String $botName, MutableState $showMoreSheet$delegate) {
        BotDetailScreen$lambda$12($showMoreSheet$delegate, false);
        ChatBackgroundActivity.INSTANCE.start($context, $botId, $botName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$29$0$2(MutableState $isNoNotify$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C303@11229L38:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(407410555, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen.<anonymous>.<anonymous>.<anonymous> (BotDetailActivity.kt:303)");
            }
            TextKt.m3359Text4IGK_g(BotDetailScreen$lambda$17($isNoNotify$delegate) ? "\u5df2\u5f00\u542f" : "\u672a\u5f00\u542f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$29$0$3(MutableState $isNoNotify$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C309@11587L11,306@11354L287:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1791721190, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen.<anonymous>.<anonymous>.<anonymous> (BotDetailActivity.kt:306)");
            }
            IconKt.m2816Iconww6aTOc(BotDetailScreen$lambda$17($isNoNotify$delegate) ? NotificationsOffKt.getNotificationsOff(Icons.INSTANCE.getDefault()) : NotificationsKt.getNotifications(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$29$0$4(final Context $context, final String $botId, final MutableState $isSettingNoNotify$delegate, final MutableState $isNoNotify$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:BotDetailActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(304114361, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen.<anonymous>.<anonymous>.<anonymous> (BotDetailActivity.kt:313)");
            }
            if (BotDetailScreen$lambda$20($isSettingNoNotify$delegate)) {
                $composer.startReplaceGroup(1784954051);
                ComposerKt.sourceInformation($composer, "314@11782L78");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1785148204);
                ComposerKt.sourceInformation($composer, "318@12034L1657,316@11922L1861");
                boolean zBotDetailScreen$lambda$17 = BotDetailScreen$lambda$17($isNoNotify$delegate);
                ComposerKt.sourceInformationMarkerStart($composer, 196137042, "CC(remember):BotDetailActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($botId);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda36
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return BotDetailActivityKt.BotDetailScreen$lambda$29$0$4$0$0($isSettingNoNotify$delegate, $isNoNotify$delegate, $context, $botId, ((Boolean) obj2).booleanValue());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                SwitchKt.Switch(zBotDetailScreen$lambda$17, (Function1) objRememberedValue, null, null, !BotDetailScreen$lambda$20($isSettingNoNotify$delegate), null, null, $composer, 0, 108);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$29$0$4$0$0(MutableState $isSettingNoNotify$delegate, MutableState $isNoNotify$delegate, Context $context, String $botId, boolean checked) {
        if (BotDetailScreen$lambda$20($isSettingNoNotify$delegate)) {
            return Unit.INSTANCE;
        }
        BotDetailScreen$lambda$18($isNoNotify$delegate, checked);
        BotDetailScreen$lambda$21($isSettingNoNotify$delegate, true);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new BotDetailActivityKt$BotDetailScreen$8$1$5$1$1$1($context, $botId, checked, $isNoNotify$delegate, $isSettingNoNotify$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$29$0$5$0(MutableState $showMoreSheet$delegate, MutableState $showDeleteDialog$delegate) {
        BotDetailScreen$lambda$12($showMoreSheet$delegate, false);
        BotDetailScreen$lambda$9($showDeleteDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$30$0(MutableState $showDeleteDialog$delegate) {
        BotDetailScreen$lambda$9($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$33(String $botName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C380@14949L28:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-356484311, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen.<anonymous> (BotDetailActivity.kt:380)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u5220\u9664\u673a\u5668\u4eba\u300c" + $botName + "\u300d\u5417\uff1f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$31(final Context $context, final String $botId, final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C384@15077L1386,409@16578L11,408@16509L108,383@15039L1690:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1310863090, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen.<anonymous> (BotDetailActivity.kt:383)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1314008584, "CC(remember):BotDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($botId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotDetailActivityKt.BotDetailScreen$lambda$31$0$0($context, $showDeleteDialog$delegate, $botId);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, false, null, ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$BotDetailActivityKt.INSTANCE.m10469getLambda$1054618850$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$31$0$0(Context $context, MutableState $showDeleteDialog$delegate, String $botId) {
        BotDetailScreen$lambda$9($showDeleteDialog$delegate, false);
        AppDatabase db = AppDatabase.INSTANCE.getDatabase($context);
        TokenRepository tokenRepository = new TokenRepository(db.userTokenDao(), $context);
        UserRepository userRepository = new UserRepository(ApiClient.INSTANCE.getApiService(), tokenRepository);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new BotDetailActivityKt$BotDetailScreen$10$1$1$1(userRepository, $botId, $context, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$32(final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C416@16812L28,416@16791L101:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(788875340, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailScreen.<anonymous> (BotDetailActivity.kt:416)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2100008376, "CC(remember):BotDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotDetailActivityKt.BotDetailScreen$lambda$32$0$0($showDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$BotDetailActivityKt.INSTANCE.m10473getLambda$1606667793$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailScreen$lambda$32$0$0(MutableState $showDeleteDialog$delegate) {
        BotDetailScreen$lambda$9($showDeleteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void SheetSectionHeader(final String title, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-1748931823);
        ComposerKt.sourceInformation($composer3, "C(SheetSectionHeader)N(title)428@17048L10,426@16990L228:BotDetailActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title) ? 4 : 2;
        }
        if ($composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1748931823, $dirty, -1, "com.yhchat.canarys.ui.bot.SheetSectionHeader (BotDetailActivity.kt:425)");
            }
            $composer2 = $composer3;
            TextKt.m3359Text4IGK_g(title, PaddingKt.m1054paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(8), 0.0f, C1834Dp.m7806constructorimpl(4), 5, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getTitleLarge(), $composer2, ($dirty & 14) | 196656, 0, 65500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotDetailActivityKt.SheetSectionHeader$lambda$0(title, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SheetActionItem(final ImageVector icon, final String title, final Function0<Unit> function0, boolean enabled, boolean isDestructive, Composer $composer, final int $changed, final int i) {
        boolean z;
        boolean z2;
        final boolean enabled2;
        final boolean isDestructive2;
        long baseTextColor;
        long onSurfaceVariant;
        Composer $composer2 = $composer.startRestartGroup(563402136);
        ComposerKt.sourceInformation($composer2, "C(SheetActionItem)N(icon,title,onClick,enabled,isDestructive)444@17473L11,465@18253L13,466@18302L61,450@17816L131,456@17974L179,449@17780L652,472@18477L11,472@18437L87:BotDetailActivity.kt#eelfqe");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(icon) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(title) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            z = enabled;
        } else if (($changed & 3072) == 0) {
            z = enabled;
            $dirty |= $composer2.changed(z) ? 2048 : 1024;
        } else {
            z = enabled;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty |= 24576;
            z2 = isDestructive;
        } else if (($changed & 24576) == 0) {
            z2 = isDestructive;
            $dirty |= $composer2.changed(z2) ? 16384 : 8192;
        } else {
            z2 = isDestructive;
        }
        if ($composer2.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            boolean enabled3 = i2 != 0 ? true : z;
            boolean isDestructive3 = i3 != 0 ? false : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(563402136, $dirty, -1, "com.yhchat.canarys.ui.bot.SheetActionItem (BotDetailActivity.kt:443)");
            }
            long containerColor = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface();
            if (isDestructive3) {
                $composer2.startReplaceGroup(263583645);
                ComposerKt.sourceInformation($composer2, "445@17550L11");
                baseTextColor = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError();
            } else {
                $composer2.startReplaceGroup(263584833);
                ComposerKt.sourceInformation($composer2, "445@17587L11");
                baseTextColor = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface();
            }
            $composer2.endReplaceGroup();
            if (isDestructive3) {
                $composer2.startReplaceGroup(263587357);
                ComposerKt.sourceInformation($composer2, "446@17666L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError();
            } else {
                $composer2.startReplaceGroup(263588552);
                ComposerKt.sourceInformation($composer2, "446@17703L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant();
            }
            $composer2.endReplaceGroup();
            final long baseIconColor = onSurfaceVariant;
            final float alpha = enabled3 ? 1.0f : 0.45f;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 263605765, "CC(remember):BotDetailActivity.kt#9igjgp");
            boolean z3 = ($dirty & 896) == 256;
            Object objRememberedValue = $composer2.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotDetailActivityKt.SheetActionItem$lambda$0$0(function0);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            boolean enabled4 = enabled3;
            final long baseTextColor2 = baseTextColor;
            boolean isDestructive4 = isDestructive3;
            ListItemKt.m2861ListItemHXNGIdc(ComposableLambdaKt.rememberComposableLambda(-824012426, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BotDetailActivityKt.SheetActionItem$lambda$1(title, baseTextColor2, alpha, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, enabled3, null, null, null, (Function0) objRememberedValue, 14, null), null, null, ComposableLambdaKt.rememberComposableLambda(-1135973510, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BotDetailActivityKt.SheetActionItem$lambda$2(icon, baseIconColor, alpha, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), null, ListItemDefaults.INSTANCE.m2859colorsJ08w3E(containerColor, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer2, ListItemDefaults.$stable << 27, 510), C1834Dp.m7806constructorimpl(0), C1834Dp.m7806constructorimpl(0), $composer2, 113270790, 44);
            $composer2 = $composer2;
            long outlineVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant();
            DividerKt.m2738HorizontalDivider9IZ8Weo(null, 0.0f, Color.m5055copywmQWz5c(outlineVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(outlineVariant) : 0.35f, (14 & 2) != 0 ? Color.m5063getRedimpl(outlineVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(outlineVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(outlineVariant) : 0.0f), $composer2, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isDestructive2 = isDestructive4;
            enabled2 = enabled4;
        } else {
            $composer2.skipToGroupEnd();
            enabled2 = z;
            isDestructive2 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BotDetailActivityKt.SheetActionItem$lambda$3(icon, title, function0, enabled2, isDestructive2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetActionItem$lambda$1(String $title, long $baseTextColor, float $alpha, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C451@17830L107:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-824012426, $changed, -1, "com.yhchat.canarys.ui.bot.SheetActionItem.<anonymous> (BotDetailActivity.kt:451)");
            }
            TextKt.m3359Text4IGK_g($title, (Modifier) null, Color.m5055copywmQWz5c($baseTextColor, (14 & 1) != 0 ? Color.m5059getAlphaimpl($baseTextColor) : $alpha, (14 & 2) != 0 ? Color.m5063getRedimpl($baseTextColor) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl($baseTextColor) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl($baseTextColor) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetActionItem$lambda$2(ImageVector $icon, long $baseIconColor, float $alpha, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C457@17988L155:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1135973510, $changed, -1, "com.yhchat.canarys.ui.bot.SheetActionItem.<anonymous> (BotDetailActivity.kt:457)");
            }
            IconKt.m2816Iconww6aTOc($icon, (String) null, (Modifier) null, Color.m5055copywmQWz5c($baseIconColor, (14 & 1) != 0 ? Color.m5059getAlphaimpl($baseIconColor) : $alpha, (14 & 2) != 0 ? Color.m5063getRedimpl($baseIconColor) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl($baseIconColor) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl($baseIconColor) : 0.0f), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetActionItem$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailContent$lambda$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void BotDetailContent(final com.yhchat.canarys.proto.bot.Bot.bot_info r47, final com.yhchat.canarys.proto.bot.Bot.board r48, final boolean r49, androidx.compose.p000ui.Modifier r50, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotDetailActivityKt.BotDetailContent(com.yhchat.canarys.proto.bot.Bot$bot_info, com.yhchat.canarys.proto.bot.Bot$board, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0501  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotDetailContent$lambda$1$0(final com.yhchat.canarys.proto.bot.Bot.bot_info r85, final kotlin.jvm.functions.Function1 r86, androidx.compose.foundation.layout.ColumnScope r87, androidx.compose.runtime.Composer r88, int r89) {
        /*
            Method dump skipped, instructions count: 1291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotDetailActivityKt.BotDetailContent$lambda$1$0(com.yhchat.canarys.proto.bot.Bot$bot_info, kotlin.jvm.functions.Function1, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailContent$lambda$1$0$0$0(final Bot.bot_info $botInfo, final Function1 $onAvatarClick, Composer $composer, int $changed) {
        ImageRequest imageRequestCreateBotImageRequest$default;
        ComposerKt.sourceInformation($composer, "C524@20390L214,512@19813L871:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(661151719, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotDetailActivity.kt:512)");
            }
            String avatarUrl = $botInfo.getData().getAvatarUrl();
            Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
            if (!StringsKt.isBlank(avatarUrl)) {
                $composer.startReplaceGroup(-349045017);
                ComposerKt.sourceInformation($composer, "515@20017L7");
                ImageUtils imageUtils = ImageUtils.INSTANCE;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = $composer.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd($composer);
                String avatarUrl2 = $botInfo.getData().getAvatarUrl();
                Intrinsics.checkNotNullExpressionValue(avatarUrl2, "getAvatarUrl(...)");
                imageRequestCreateBotImageRequest$default = ImageUtils.createBotImageRequest$default(imageUtils, (Context) objConsume, avatarUrl2, false, 4, null);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-348802721);
                $composer.endReplaceGroup();
                imageRequestCreateBotImageRequest$default = null;
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -288338467, "CC(remember):BotDetailActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($botInfo) | $composer.changed($onAvatarClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivityKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotDetailActivityKt.BotDetailContent$lambda$1$0$0$0$0$0($botInfo, $onAvatarClick);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(imageRequestCreateBotImageRequest$default, "\u673a\u5668\u4eba\u5934\u50cf", ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxSize$default, false, null, null, null, (Function0) objRememberedValue, 15, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1572912, 0, 4024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailContent$lambda$1$0$0$0$0$0(Bot.bot_info $botInfo, Function1 $onAvatarClick) {
        String avatarUrl = $botInfo.getData().getAvatarUrl();
        Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
        if (!StringsKt.isBlank(avatarUrl)) {
            String avatarUrl2 = $botInfo.getData().getAvatarUrl();
            Intrinsics.checkNotNullExpressionValue(avatarUrl2, "getAvatarUrl(...)");
            $onAvatarClick.invoke(avatarUrl2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailContent$lambda$1$0$0$1(Bot.bot_info $botInfo, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C552@21541L10,553@21610L11,550@21429L323:BotDetailActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-213319330, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BotDetailActivity.kt:550)");
            }
            TextKt.m3359Text4IGK_g("ID: " + $botInfo.getData().getBotId(), PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(8)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailContent$lambda$1$1(Bot.bot_info $botInfo, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C586@23121L629:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-37836815, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailContent.<anonymous>.<anonymous> (BotDetailActivity.kt:586)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16));
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
            ComposerKt.sourceInformationMarkerStart($composer, -1224632960, "C591@23316L10,589@23224L258,597@23613L10,598@23682L11,595@23503L229:BotDetailActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("\u673a\u5668\u4eba\u7b80\u4ecb", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196662, 0, 65500);
            String introduction = $botInfo.getData().getIntroduction();
            Intrinsics.checkNotNullExpressionValue(introduction, "getIntroduction(...)");
            TextKt.m3359Text4IGK_g(introduction, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
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
    /* JADX WARN: Removed duplicated region for block: B:58:0x0547  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotDetailContent$lambda$1$2(com.yhchat.canarys.proto.bot.Bot.bot_info r84, androidx.compose.foundation.layout.ColumnScope r85, androidx.compose.runtime.Composer r86, int r87) {
        /*
            Method dump skipped, instructions count: 1361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotDetailActivityKt.BotDetailContent$lambda$1$2(com.yhchat.canarys.proto.bot.Bot$bot_info, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BotDetailContent$lambda$1$3(Bot.bot_info $botInfo, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C668@26297L2307:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1191427890, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailContent.<anonymous>.<anonymous> (BotDetailActivity.kt:668)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
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
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -249556216, "C674@26538L10,672@26455L237,679@26726L165,685@26925L242,691@27201L251,697@27486L249,703@27769L269,709@28072L234,715@28340L250:BotDetailActivity.kt#eelfqe");
            TextKt.m3359Text4IGK_g("\u8be6\u7ec6\u4fe1\u606f", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 7, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196662, 0, 65500);
            ImageVector person = PersonKt.getPerson(Icons.INSTANCE.getDefault());
            String createBy = $botInfo.getData().getCreateBy();
            Intrinsics.checkNotNullExpressionValue(createBy, "getCreateBy(...)");
            DetailItem(person, "\u521b\u5efa\u8005ID", createBy, null, $composer, 48, 8);
            DetailItem($botInfo.getData().getPrivate() == 1 ? LockKt.getLock(Icons.INSTANCE.getDefault()) : PublicKt.getPublic(Icons.INSTANCE.getDefault()), "\u53ef\u89c1\u6027", $botInfo.getData().getPrivate() == 1 ? "\u79c1\u6709" : "\u516c\u5f00", null, $composer, 48, 8);
            DetailItem($botInfo.getData().getIsStop() == 0 ? CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()) : CancelKt.getCancel(Icons.INSTANCE.getDefault()), "\u8fd0\u884c\u72b6\u6001", $botInfo.getData().getIsStop() == 0 ? "\u6b63\u5e38\u8fd0\u884c" : "\u5df2\u505c\u7528", null, $composer, 48, 8);
            DetailItem($botInfo.getData().getAlwaysAgree() == 1 ? CheckKt.getCheck(Icons.INSTANCE.getDefault()) : CloseKt.getClose(Icons.INSTANCE.getDefault()), "\u81ea\u52a8\u52a0\u7fa4", $botInfo.getData().getAlwaysAgree() == 1 ? "\u662f" : "\u5426", null, $composer, 48, 8);
            DetailItem($botInfo.getData().getDoNotDisturb() == 1 ? NotificationsOffKt.getNotificationsOff(Icons.INSTANCE.getDefault()) : NotificationsKt.getNotifications(Icons.INSTANCE.getDefault()), "\u514d\u6253\u6270", $botInfo.getData().getDoNotDisturb() == 1 ? "\u662f" : "\u5426", null, $composer, 48, 8);
            DetailItem($botInfo.getData().getTop() == 1 ? PushPinKt.getPushPin(Icons.INSTANCE.getDefault()) : RemoveKt.getRemove(Icons.INSTANCE.getDefault()), "\u7f6e\u9876", $botInfo.getData().getTop() == 1 ? "\u662f" : "\u5426", null, $composer, 48, 8);
            DetailItem($botInfo.getData().getGroupLimit() == 1 ? BlockKt.getBlock(Icons.INSTANCE.getDefault()) : GroupAddKt.getGroupAdd(Icons.INSTANCE.getDefault()), "\u9650\u5236\u8fdb\u7fa4", $botInfo.getData().getGroupLimit() == 1 ? "\u662f" : "\u5426", null, $composer, 48, 8);
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
    /* JADX WARN: Removed duplicated region for block: B:43:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x048c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BotDetailContent$lambda$1$4(com.yhchat.canarys.proto.bot.Bot.board.Board_data r85, androidx.compose.foundation.layout.ColumnScope r86, androidx.compose.runtime.Composer r87, int r88) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotDetailActivityKt.BotDetailContent$lambda$1$4(com.yhchat.canarys.proto.bot.Bot$board$Board_data, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x02aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void StatisticItem(final androidx.compose.p000ui.graphics.vector.ImageVector r53, final java.lang.String r54, final java.lang.String r55, androidx.compose.p000ui.Modifier r56, androidx.compose.runtime.Composer r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotDetailActivityKt.StatisticItem(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x0318  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void EnhancedStatisticItem(final androidx.compose.p000ui.graphics.vector.ImageVector r54, final java.lang.String r55, final java.lang.String r56, androidx.compose.p000ui.Modifier r57, androidx.compose.runtime.Composer r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotDetailActivityKt.EnhancedStatisticItem(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EnhancedStatisticItem$lambda$0$0(ImageVector $icon, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C861@33709L11,855@33481L261:BotDetailActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-397017460, $changed, -1, "com.yhchat.canarys.ui.bot.EnhancedStatisticItem.<anonymous>.<anonymous> (BotDetailActivity.kt:855)");
            }
            IconKt.m2816Iconww6aTOc($icon, (String) null, PaddingKt.m1050padding3ABfNKs(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), C1834Dp.m7806constructorimpl(12)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void DetailItem(final androidx.compose.p000ui.graphics.vector.ImageVector r52, final java.lang.String r53, final java.lang.String r54, androidx.compose.p000ui.Modifier r55, androidx.compose.runtime.Composer r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotDetailActivityKt.DetailItem(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final String formatDate(long timestamp) {
        try {
            Date date = new Date(1000 * timestamp);
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
            String str = formatter.format(date);
            Intrinsics.checkNotNull(str);
            return str;
        } catch (Exception e) {
            return "-";
        }
    }
}
