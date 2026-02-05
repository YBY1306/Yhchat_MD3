package com.yhchat.canarys.p007ui.components;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.provider.Settings;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.util.Log;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.SendKt;
import androidx.compose.material.icons.filled.PauseKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SegmentedButtonColors;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.SingleChoiceSegmentedButtonRowScope;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.draw.ShadowKt;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
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
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.unit.DpOffset;
import androidx.compose.p000ui.unit.IntOffset;
import androidx.compose.p000ui.window.AndroidPopup_androidKt;
import androidx.compose.p000ui.window.PopupProperties;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.NotificationCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p008io.CloseableKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FloatingVoiceWindow.kt */
@Metadata(m168d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aN\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\tH\u0007\u00a2\u0006\u0002\u0010\u000e\u001a5\u0010\u000f\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0011H\u0003\u00a2\u0006\u0002\u0010\u0012\u001a)\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a2\u0006\u0002\u0010\u0016\u001aE\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a2\u0006\u0002\u0010\u001f\u001a#\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u00a2\u0006\u0002\u0010#\u001a\u00cb\u0001\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00032\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010'\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u00032\u0006\u0010+\u001a\u00020\u001c2\b\u0010,\u001a\u0004\u0018\u00010\u00032\f\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00192\b\u0010/\u001a\u0004\u0018\u00010\u00032\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u00104\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u00105\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u00a2\u0006\u0002\u00106\u001a\u001c\u00107\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u00108\u001a\u000209H\u0082@\u00a2\u0006\u0002\u0010:\u001a\b\u0010;\u001a\u00020\nH\u0002\u001a\b\u0010<\u001a\u00020\u0003H\u0002\u001a\u0010\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020?H\u0002\u001a&\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00030A2\u0006\u00108\u001a\u0002092\b\u0010B\u001a\u0004\u0018\u00010\u0003H\u0002\u001a\u0012\u0010C\u001a\u0004\u0018\u00010\u00032\u0006\u00108\u001a\u000209H\u0002\u001a\"\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030A0\u00192\u0006\u00108\u001a\u000209H\u0002\u001a8\u0010E\u001a\u00020\u00012\u0006\u00108\u001a\u0002092\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010%\u001a\u00020\u00032\u0014\u0010H\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\tH\u0002\u001a\u001a\u0010I\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010G2\u0006\u0010%\u001a\u00020\u0003H\u0002\u001a\u0012\u0010J\u001a\u00020\u00012\b\u0010F\u001a\u0004\u0018\u00010GH\u0002\u00a8\u0006K\u00b2\u0006\n\u0010L\u001a\u00020MX\u008a\u008e\u0002\u00b2\u0006\n\u0010N\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u0010O\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u008a\u008e\u0002\u00b2\u0006\n\u0010Q\u001a\u00020\u001cX\u008a\u008e\u0002\u00b2\u0006\n\u0010R\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010S\u001a\u00020\u001cX\u008a\u008e\u0002\u00b2\u0006\n\u0010T\u001a\u00020)X\u008a\u008e\u0002\u00b2\u0006\f\u0010U\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010V\u001a\u00020\u001cX\u008a\u008e\u0002\u00b2\u0006\f\u0010W\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010X\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010Y\u001a\b\u0012\u0004\u0012\u00020.0\u0019X\u008a\u008e\u0002\u00b2\u0006\f\u0010Z\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\f\u0010[\u001a\u0004\u0018\u00010GX\u008a\u008e\u0002"}, m169d2 = {"FloatingVoiceWindow", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "onClose", "Lkotlin/Function0;", "onSendAudio", "Lkotlin/Function1;", "Landroid/net/Uri;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "uri", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "WindowTitleBar", "onResize", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabSelector", "selectedTab", "onTabSelected", "(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "SavedAudiosTab", "audios", "", "Lcom/yhchat/canarys/ui/components/SavedAudioItem;", "isLoading", "", "onRefresh", "onAudioSelected", "(Ljava/util/List;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "AudioItemCard", "audio", "onClick", "(Lcom/yhchat/canarys/ui/components/SavedAudioItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TTSTab", "text", "onTextChange", "isPlaying", NotificationCompat.CATEGORY_PROGRESS, "", "error", "isSynthesizing", "synthesisError", "availableEngines", "Landroid/speech/tts/TextToSpeech$EngineInfo;", "selectedEngine", "onEngineSelected", "onSynthesize", "onPlayPreview", "onStopPreview", "onOpenTtsSettings", "onRetryInitialization", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZFLjava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "loadSavedAudios", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savedAudiosCollectionUri", "legacySavedAudiosDirPrefix", "formatDateTime", "dateAddedSeconds", "", "checkTtsEngineAvailability", "Lkotlin/Pair;", "engineName", "getDefaultTtsEngine", "getInstalledTtsEngines", "synthesizeTTS", "tts", "Landroid/speech/tts/TextToSpeech;", "onComplete", "playTTS", "stopTTS", "app_debug", "windowOffset", "Landroidx/compose/ui/unit/DpOffset;", "windowWidth", "windowHeight", "savedAudios", "isLoadingAudios", "ttsText", "isTtsPlaying", "ttsProgress", "ttsError", "isTtsSynthesizing", "ttsSynthesisError", "ttsRetryCount", "availableTtsEngines", "selectedTtsEngine", "ttsEngine"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class FloatingVoiceWindowKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioItemCard$lambda$1(SavedAudioItem savedAudioItem, Function0 function0, int i, Composer composer, int i2) {
        AudioItemCard(savedAudioItem, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$56(String str, int i, Function0 function0, Function1 function1, int i2, Composer composer, int i3) {
        FloatingVoiceWindow(str, i, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosTab$lambda$1(List list, boolean z, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        SavedAudiosTab(list, z, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$3(String str, Function1 function1, boolean z, float f, String str2, boolean z2, String str3, List list, String str4, Function1 function12, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i, int i2, int i3, Composer composer, int i4) {
        TTSTab(str, function1, z, f, str2, z2, str3, list, str4, function12, function0, function02, function03, function04, function05, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabSelector$lambda$1(int i, Function1 function1, int i2, Composer composer, int i3) {
        TabSelector(i, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WindowTitleBar$lambda$1(Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        WindowTitleBar(function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void FloatingVoiceWindow(final String chatId, final int chatType, final Function0<Unit> onClose, final Function1<? super Uri, Unit> onSendAudio, Composer $composer, final int $changed) {
        Composer $composer2;
        MutableIntState windowWidth$delegate;
        MutableIntState windowHeight$delegate;
        MutableState ttsText$delegate;
        MutableFloatState ttsProgress$delegate;
        int $dirty;
        MutableState isTtsSynthesizing$delegate;
        MutableIntState ttsRetryCount$delegate;
        Function0 openTtsSettings;
        CoroutineScope scope;
        Context context;
        MutableIntState selectedTab$delegate;
        Continuation continuation;
        final MutableState ttsError$delegate;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Intrinsics.checkNotNullParameter(onSendAudio, "onSendAudio");
        Composer $composer3 = $composer.startRestartGroup(-1031321558);
        ComposerKt.sourceInformation($composer3, "C(FloatingVoiceWindow)N(chatId,chatType,onClose,onSendAudio)107@4522L7,108@4546L24,111@4617L5277,204@9941L49,205@10014L35,206@10074L35,209@10151L33,212@10248L62,213@10338L34,216@10410L31,217@10466L34,218@10524L36,219@10581L42,220@10653L34,221@10717L42,222@10785L33,225@10875L274,234@11201L90,235@11321L42,236@11385L48,239@11491L589,239@11470L610,256@12139L180,264@12417L13375,264@12366L13426,491@25845L256,491@25817L284,502@26151L789,502@26130L810,527@27068L4489,524@26964L4593:FloatingVoiceWindow.kt#2suaub");
        int $dirty2 = $changed;
        if (($changed & 384) == 0) {
            $dirty2 |= $composer3.changedInstance(onClose) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty2 |= $composer3.changedInstance(onSendAudio) ? 2048 : 1024;
        }
        if ($composer3.shouldExecute(($dirty2 & 1153) != 1152, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1031321558, $dirty2, -1, "com.yhchat.canarys.ui.components.FloatingVoiceWindow (FloatingVoiceWindow.kt:106)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context2 = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue = objCreateCompositionCoroutineScope;
            }
            CoroutineScope scope2 = (CoroutineScope) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037441959, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(context2);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$0$0(context2);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            Function0 openTtsSettings2 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037607099, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DpOffset.m7861boximpl(DpOffset.m7862constructorimpl((Float.floatToRawIntBits(C1834Dp.m7806constructorimpl(0)) << 32) | (Float.floatToRawIntBits(C1834Dp.m7806constructorimpl(0)) & 4294967295L))), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue3 = objMutableStateOf$default;
            }
            final MutableState windowOffset$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037609421, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf = SnapshotIntStateKt.mutableIntStateOf(400);
                $composer3.updateRememberedValue(objMutableIntStateOf);
                objRememberedValue4 = objMutableIntStateOf;
            }
            MutableIntState windowWidth$delegate2 = (MutableIntState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037611341, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf2 = SnapshotIntStateKt.mutableIntStateOf(600);
                $composer3.updateRememberedValue(objMutableIntStateOf2);
                objRememberedValue5 = objMutableIntStateOf2;
            }
            MutableIntState windowHeight$delegate2 = (MutableIntState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037613803, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf3 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer3.updateRememberedValue(objMutableIntStateOf3);
                objRememberedValue6 = objMutableIntStateOf3;
            }
            MutableIntState selectedTab$delegate2 = (MutableIntState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037616936, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                windowWidth$delegate = windowWidth$delegate2;
                windowHeight$delegate = windowHeight$delegate2;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue7 = objMutableStateOf$default2;
            } else {
                windowWidth$delegate = windowWidth$delegate2;
                windowHeight$delegate = windowHeight$delegate2;
            }
            final MutableState savedAudios$delegate = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037619788, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue8 = $composer3.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue8 = objMutableStateOf$default3;
            }
            final MutableState isLoadingAudios$delegate = (MutableState) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037622089, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue9 = $composer3.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue9 = objMutableStateOf$default4;
            }
            MutableState ttsText$delegate2 = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037623884, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue10 = $composer3.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                ttsText$delegate = ttsText$delegate2;
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue10 = objMutableStateOf$default5;
            } else {
                ttsText$delegate = ttsText$delegate2;
            }
            final MutableState isTtsPlaying$delegate = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037625742, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue11 = $composer3.rememberedValue();
            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer3.updateRememberedValue(objMutableFloatStateOf);
                objRememberedValue11 = objMutableFloatStateOf;
            }
            MutableFloatState ttsProgress$delegate2 = (MutableFloatState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037627572, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue12 = $composer3.rememberedValue();
            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                ttsProgress$delegate = ttsProgress$delegate2;
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue12 = objMutableStateOf$default6;
            } else {
                ttsProgress$delegate = ttsProgress$delegate2;
            }
            final MutableState ttsError$delegate2 = (MutableState) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037629868, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue13 = $composer3.rememberedValue();
            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                Object objMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default7);
                objRememberedValue13 = objMutableStateOf$default7;
            } else {
                $dirty = $dirty2;
            }
            MutableState isTtsSynthesizing$delegate2 = (MutableState) objRememberedValue13;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037631924, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue14 = $composer3.rememberedValue();
            if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                isTtsSynthesizing$delegate = isTtsSynthesizing$delegate2;
                Object objMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default8);
                objRememberedValue14 = objMutableStateOf$default8;
            } else {
                isTtsSynthesizing$delegate = isTtsSynthesizing$delegate2;
            }
            final MutableState ttsSynthesisError$delegate = (MutableState) objRememberedValue14;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037634091, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue15 = $composer3.rememberedValue();
            if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                Object objMutableIntStateOf4 = SnapshotIntStateKt.mutableIntStateOf(0);
                $composer3.updateRememberedValue(objMutableIntStateOf4);
                objRememberedValue15 = objMutableIntStateOf4;
            }
            final MutableIntState ttsRetryCount$delegate2 = (MutableIntState) objRememberedValue15;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037637212, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue16 = $composer3.rememberedValue();
            if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$40$0(ttsRetryCount$delegate2, ttsError$delegate2);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue16 = obj2;
            }
            final Function0 retryTtsInitialization = (Function0) objRememberedValue16;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037647460, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue17 = $composer3.rememberedValue();
            if (objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                ttsRetryCount$delegate = ttsRetryCount$delegate2;
                Object objMutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default9);
                objRememberedValue17 = objMutableStateOf$default9;
            } else {
                ttsRetryCount$delegate = ttsRetryCount$delegate2;
            }
            final MutableState availableTtsEngines$delegate = (MutableState) objRememberedValue17;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037651252, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue18 = $composer3.rememberedValue();
            if (objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default10);
                objRememberedValue18 = objMutableStateOf$default10;
            }
            final MutableState selectedTtsEngine$delegate = (MutableState) objRememberedValue18;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037653306, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue19 = $composer3.rememberedValue();
            if (objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                openTtsSettings = openTtsSettings2;
                Object objMutableStateOf$default11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default11);
                objRememberedValue19 = objMutableStateOf$default11;
            } else {
                openTtsSettings = openTtsSettings2;
            }
            final MutableState ttsEngine$delegate = (MutableState) objRememberedValue19;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 1037657239, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            boolean zChangedInstance2 = $composer3.changedInstance(context2);
            Object objRememberedValue20 = $composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue20 == Composer.INSTANCE.getEmpty()) {
                scope = scope2;
                Object obj3 = (Function2) new FloatingVoiceWindowKt$FloatingVoiceWindow$1$1(context2, selectedTtsEngine$delegate, null);
                $composer3.updateRememberedValue(obj3);
                objRememberedValue20 = obj3;
            } else {
                scope = scope2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue20, $composer3, 6);
            ComposerKt.sourceInformationMarkerStart($composer3, 1037677566, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue21 = $composer3.rememberedValue();
            if (objRememberedValue21 == Composer.INSTANCE.getEmpty()) {
                Object voiceMessageViewModel = new VoiceMessageViewModel(ApiClient.INSTANCE.getApiService(), RepositoryFactory.INSTANCE.getTokenRepository(context2));
                $composer3.updateRememberedValue(voiceMessageViewModel);
                objRememberedValue21 = voiceMessageViewModel;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            String strFloatingVoiceWindow$lambda$45 = FloatingVoiceWindow$lambda$45(selectedTtsEngine$delegate);
            Integer numValueOf = Integer.valueOf(FloatingVoiceWindow$lambda$38(ttsRetryCount$delegate));
            ComposerKt.sourceInformationMarkerStart($composer3, 1037699657, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            boolean zChangedInstance3 = $composer3.changedInstance(context2);
            Object objRememberedValue22 = $composer3.rememberedValue();
            if (zChangedInstance3 || objRememberedValue22 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function1() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$52$0(context2, selectedTtsEngine$delegate, ttsError$delegate2, ttsEngine$delegate, (DisposableEffectScope) obj5);
                    }
                };
                $composer3.updateRememberedValue(obj4);
                objRememberedValue22 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.DisposableEffect(strFloatingVoiceWindow$lambda$45, numValueOf, (Function1) objRememberedValue22, $composer3, 0);
            Integer numValueOf2 = Integer.valueOf(FloatingVoiceWindow$lambda$11(selectedTab$delegate2));
            ComposerKt.sourceInformationMarkerStart($composer3, 1038116234, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            boolean zChangedInstance4 = $composer3.changedInstance(context2);
            FloatingVoiceWindowKt$FloatingVoiceWindow$3$1 floatingVoiceWindowKt$FloatingVoiceWindow$3$1RememberedValue = $composer3.rememberedValue();
            if (zChangedInstance4 || floatingVoiceWindowKt$FloatingVoiceWindow$3$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                context = context2;
                selectedTab$delegate = selectedTab$delegate2;
                continuation = null;
                floatingVoiceWindowKt$FloatingVoiceWindow$3$1RememberedValue = new FloatingVoiceWindowKt$FloatingVoiceWindow$3$1(selectedTab$delegate, savedAudios$delegate, isLoadingAudios$delegate, context, null);
                $composer3.updateRememberedValue(floatingVoiceWindowKt$FloatingVoiceWindow$3$1RememberedValue);
            } else {
                context = context2;
                selectedTab$delegate = selectedTab$delegate2;
                continuation = null;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(numValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) floatingVoiceWindowKt$FloatingVoiceWindow$3$1RememberedValue, $composer3, 0);
            Unit unit2 = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 1038126559, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue23 = $composer3.rememberedValue();
            if (objRememberedValue23 == Composer.INSTANCE.getEmpty()) {
                ttsError$delegate = ttsError$delegate2;
                Object obj5 = (Function2) new FloatingVoiceWindowKt$FloatingVoiceWindow$4$1(availableTtsEngines$delegate, continuation);
                $composer3.updateRememberedValue(obj5);
                objRememberedValue23 = obj5;
            } else {
                ttsError$delegate = ttsError$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue23, $composer3, 6);
            PopupProperties popupProperties = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);
            final MutableIntState selectedTab$delegate3 = selectedTab$delegate;
            final Context context3 = context;
            final MutableIntState windowWidth$delegate3 = windowWidth$delegate;
            final MutableState ttsText$delegate3 = ttsText$delegate;
            final MutableFloatState ttsProgress$delegate3 = ttsProgress$delegate;
            final MutableState isTtsSynthesizing$delegate3 = isTtsSynthesizing$delegate;
            final Function0 openTtsSettings3 = openTtsSettings;
            final CoroutineScope scope3 = scope;
            final MutableIntState windowHeight$delegate3 = windowHeight$delegate;
            Function2 function2 = new Function2() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55(windowOffset$delegate, windowWidth$delegate3, windowHeight$delegate3, onClose, scope3, context3, onSendAudio, openTtsSettings3, retryTtsInitialization, selectedTab$delegate3, savedAudios$delegate, isLoadingAudios$delegate, ttsText$delegate3, isTtsPlaying$delegate, ttsProgress$delegate3, ttsError$delegate, isTtsSynthesizing$delegate3, ttsSynthesisError$delegate, availableTtsEngines$delegate, selectedTtsEngine$delegate, ttsEngine$delegate, (Composer) obj6, ((Integer) obj7).intValue());
                }
            };
            $composer2 = $composer3;
            AndroidPopup_androidKt.m8058PopupK5zGePQ(null, 0L, onClose, popupProperties, ComposableLambdaKt.rememberComposableLambda(-564390579, true, function2, $composer2, 54), $composer2, ($dirty & 896) | 27648, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$56(chatId, chatType, onClose, onSendAudio, $changed, (Composer) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$0$0(Context $context) {
        Log.d("FloatingVoiceWindow", "\u5c1d\u8bd5\u6253\u5f00TTS\u8bbe\u7f6e\u9875\u9762...");
        try {
            Intent ttsSettingsIntent = new Intent("android.speech.tts.action.TTS_SETTINGS");
            ttsSettingsIntent.setFlags(268435456);
            Log.d("FloatingVoiceWindow", "\u5c1d\u8bd5\u6253\u5f00\u6807\u51c6TTS\u8bbe\u7f6e: android.speech.tts.action.TTS_SETTINGS");
            $context.startActivity(ttsSettingsIntent);
        } catch (Exception e) {
            Log.e("FloatingVoiceWindow", "\u65e0\u6cd5\u6253\u5f00\u6807\u51c6TTS\u8bbe\u7f6e\u9875\u9762", e);
            try {
                Intent legacyTtsIntent = new Intent("android.speech.tts.engine.TTS_SETTINGS");
                legacyTtsIntent.setFlags(268435456);
                Log.d("FloatingVoiceWindow", "\u5c1d\u8bd5\u6253\u5f00\u65e7\u7248TTS\u8bbe\u7f6e: android.speech.tts.engine.TTS_SETTINGS");
                $context.startActivity(legacyTtsIntent);
            } catch (Exception e1) {
                Log.e("FloatingVoiceWindow", "\u65e0\u6cd5\u6253\u5f00\u65e7\u7248TTS\u8bbe\u7f6e\u9875\u9762", e1);
                try {
                    Intent accessibilityIntent = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                    accessibilityIntent.setFlags(268435456);
                    Log.d("FloatingVoiceWindow", "\u5c1d\u8bd5\u6253\u5f00\u8f85\u52a9\u529f\u80fd\u8bbe\u7f6e");
                    $context.startActivity(accessibilityIntent);
                } catch (Exception e2) {
                    Log.e("FloatingVoiceWindow", "\u65e0\u6cd5\u6253\u5f00\u8f85\u52a9\u529f\u80fd\u8bbe\u7f6e", e2);
                    try {
                        Intent languageIntent = new Intent("android.settings.LOCALE_SETTINGS");
                        languageIntent.setFlags(268435456);
                        Log.d("FloatingVoiceWindow", "\u5c1d\u8bd5\u6253\u5f00\u8bed\u8a00\u8bbe\u7f6e");
                        $context.startActivity(languageIntent);
                    } catch (Exception e3) {
                        Log.e("FloatingVoiceWindow", "\u65e0\u6cd5\u6253\u5f00\u8bed\u8a00\u8bbe\u7f6e", e3);
                        try {
                            boolean isXiaomi = StringsKt.equals(Build.BRAND, "xiaomi", true) || StringsKt.equals(Build.BRAND, "redmi", true) || StringsKt.equals(Build.MANUFACTURER, "xiaomi", true);
                            if (isXiaomi) {
                                Log.d("FloatingVoiceWindow", "\u68c0\u6d4b\u5230\u5c0f\u7c73/\u7ea2\u7c73\u8bbe\u5907\uff0c\u5c1d\u8bd5\u7279\u5b9aIntent");
                                try {
                                    Intent xiaomiTtsIntent = new Intent("com.android.settings.TTS_SETTINGS");
                                    xiaomiTtsIntent.setFlags(268435456);
                                    Log.d("FloatingVoiceWindow", "\u5c1d\u8bd5\u5c0f\u7c73TTS\u8bbe\u7f6e: com.android.settings.TTS_SETTINGS");
                                    $context.startActivity(xiaomiTtsIntent);
                                } catch (Exception e4) {
                                    Log.e("FloatingVoiceWindow", "\u65e0\u6cd5\u6253\u5f00\u5c0f\u7c73TTS\u8bbe\u7f6e", e4);
                                }
                                try {
                                    Intent xiaomiMainIntent = new Intent("com.miui.securitycenter.action.MAIN");
                                    xiaomiMainIntent.setFlags(268435456);
                                    Log.d("FloatingVoiceWindow", "\u5c1d\u8bd5\u6253\u5f00\u5c0f\u7c73\u5b89\u5168\u4e2d\u5fc3");
                                    $context.startActivity(xiaomiMainIntent);
                                } catch (Exception e5) {
                                    Log.e("FloatingVoiceWindow", "\u65e0\u6cd5\u6253\u5f00\u5c0f\u7c73\u5b89\u5168\u4e2d\u5fc3", e5);
                                }
                            }
                            try {
                                Intent settingsIntent = new Intent("android.settings.SETTINGS");
                                settingsIntent.setFlags(268435456);
                                Log.d("FloatingVoiceWindow", "\u5c1d\u8bd5\u6253\u5f00\u7cfb\u7edf\u8bbe\u7f6e\u4e3b\u9875");
                                $context.startActivity(settingsIntent);
                            } catch (Exception e6) {
                                Log.e("FloatingVoiceWindow", "\u65e0\u6cd5\u6253\u5f00\u7cfb\u7edf\u8bbe\u7f6e\u4e3b\u9875", e6);
                                Toast.makeText($context, "\u8bf7\u624b\u52a8\u5230\u7cfb\u7edf\u8bbe\u7f6e \u2192 \u8f85\u52a9\u529f\u80fd \u2192 \u6587\u5b57\u8f6c\u8bed\u97f3\u4e2d\u914d\u7f6eTTS\n\n\u8def\u5f84\uff1a\u8bbe\u7f6e > \u66f4\u591a\u8bbe\u7f6e > \u8bed\u8a00\u548c\u8f93\u5165\u6cd5 > \u6587\u5b57\u8f6c\u8bed\u97f3", 1).show();
                            }
                        } catch (Exception finalE) {
                            Log.e("FloatingVoiceWindow", "\u6240\u6709TTS\u8bbe\u7f6e\u6253\u5f00\u5c1d\u8bd5\u90fd\u5931\u8d25", finalE);
                            Toast.makeText($context, "\u65e0\u6cd5\u6253\u5f00TTS\u8bbe\u7f6e\uff0c\u8bf7\u624b\u52a8\u5230\u7cfb\u7edf\u8bbe\u7f6e\u4e2d\u914d\u7f6e\u6587\u5b57\u8f6c\u8bed\u97f3", 1).show();
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long FloatingVoiceWindow$lambda$2(MutableState<DpOffset> mutableState) {
        return mutableState.getValue().m7875unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FloatingVoiceWindow$lambda$3(MutableState<DpOffset> mutableState, long j) {
        mutableState.setValue(DpOffset.m7861boximpl(j));
    }

    private static final int FloatingVoiceWindow$lambda$5(MutableIntState $windowWidth$delegate) {
        return $windowWidth$delegate.getIntValue();
    }

    private static final int FloatingVoiceWindow$lambda$8(MutableIntState $windowHeight$delegate) {
        return $windowHeight$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int FloatingVoiceWindow$lambda$11(MutableIntState $selectedTab$delegate) {
        return $selectedTab$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SavedAudioItem> FloatingVoiceWindow$lambda$14(MutableState<List<SavedAudioItem>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean FloatingVoiceWindow$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FloatingVoiceWindow$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String FloatingVoiceWindow$lambda$20(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean FloatingVoiceWindow$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final float FloatingVoiceWindow$lambda$26(MutableFloatState $ttsProgress$delegate) {
        return $ttsProgress$delegate.getFloatValue();
    }

    private static final String FloatingVoiceWindow$lambda$29(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean FloatingVoiceWindow$lambda$32(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FloatingVoiceWindow$lambda$33(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String FloatingVoiceWindow$lambda$35(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int FloatingVoiceWindow$lambda$38(MutableIntState $ttsRetryCount$delegate) {
        return $ttsRetryCount$delegate.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$40$0(MutableIntState $ttsRetryCount$delegate, MutableState $ttsError$delegate) {
        Log.d("FloatingVoiceWindow", "\u624b\u52a8\u91cd\u8bd5TTS\u521d\u59cb\u5316\uff0c\u5f53\u524d\u91cd\u8bd5\u8ba1\u6570: " + FloatingVoiceWindow$lambda$38($ttsRetryCount$delegate));
        $ttsRetryCount$delegate.setIntValue(FloatingVoiceWindow$lambda$38($ttsRetryCount$delegate) + 1);
        $ttsError$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    private static final List<TextToSpeech.EngineInfo> FloatingVoiceWindow$lambda$42(MutableState<List<TextToSpeech.EngineInfo>> mutableState) {
        return mutableState.getValue();
    }

    private static final String FloatingVoiceWindow$lambda$45(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final TextToSpeech FloatingVoiceWindow$lambda$48(MutableState<TextToSpeech> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final DisposableEffectResult FloatingVoiceWindow$lambda$52$0(Context context, MutableState mutableState, final MutableState mutableState2, final MutableState mutableState3, DisposableEffectScope DisposableEffect) throws PackageManager.NameNotFoundException {
        final String str;
        final String str2;
        T textToSpeech;
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Locale locale = Locale.getDefault();
        final String strFloatingVoiceWindow$lambda$45 = FloatingVoiceWindow$lambda$45(mutableState);
        Log.d("FloatingVoiceWindow", "\u8bbe\u5907\u9ed8\u8ba4\u533a\u57df: " + locale + ", \u8bed\u8a00: " + locale.getLanguage() + ", \u56fd\u5bb6: " + locale.getCountry());
        Log.d("FloatingVoiceWindow", "\u4f7f\u7528TTS\u5f15\u64ce\u521d\u59cb\u5316: " + (strFloatingVoiceWindow$lambda$45 == null ? "\u9ed8\u8ba4\u5f15\u64ce" : strFloatingVoiceWindow$lambda$45));
        Log.d("FloatingVoiceWindow", "\u8bbe\u5907\u4fe1\u606f: SDK=" + Build.VERSION.SDK_INT + ", \u578b\u53f7=" + Build.MODEL + ", \u54c1\u724c=" + Build.BRAND);
        final String defaultTtsEngine = getDefaultTtsEngine(context);
        Log.d("FloatingVoiceWindow", "\u7cfb\u7edf\u9ed8\u8ba4TTS\u5f15\u64ce: " + (defaultTtsEngine == null ? "\u672a\u8bbe\u7f6e" : defaultTtsEngine));
        if (strFloatingVoiceWindow$lambda$45 != null && !StringsKt.isBlank(strFloatingVoiceWindow$lambda$45)) {
            str = strFloatingVoiceWindow$lambda$45;
        } else {
            str = defaultTtsEngine;
        }
        Log.d("FloatingVoiceWindow", "\u5b9e\u9645\u4f7f\u7528\u7684TTS\u5f15\u64ce: " + (str == null ? "\u5c06\u4f7f\u7528\u7cfb\u7edf\u9ed8\u8ba4\uff08\u65e0\u6307\u5b9a\u5305\u540d\uff09" : str));
        Pair<Boolean, String> pairCheckTtsEngineAvailability = checkTtsEngineAvailability(context, str);
        boolean zBooleanValue = pairCheckTtsEngineAvailability.component1().booleanValue();
        final String strComponent2 = pairCheckTtsEngineAvailability.component2();
        Log.d("FloatingVoiceWindow", "TTS\u5f15\u64ce\u53ef\u7528\u6027\u68c0\u67e5: " + strComponent2);
        String str3 = zBooleanValue ? str : null;
        if (!zBooleanValue) {
            Log.w("FloatingVoiceWindow", "TTS\u5f15\u64ce\u4e0d\u53ef\u7528\uff0c\u5c06\u56de\u9000\u5230\u9ed8\u8ba4\u5f15\u64ce: " + strComponent2);
            mutableState2.setValue("\u26a0\ufe0f \u8b66\u544a: " + strComponent2 + "\n\u5df2\u81ea\u52a8\u5207\u6362\u5230\u9ed8\u8ba4TTS\u5f15\u64ce");
        }
        mutableState2.setValue(null);
        Log.d("FloatingVoiceWindow", "\u5f00\u59cb\u521d\u59cb\u5316TTS\u5f15\u64ce...");
        if (str3 == null || StringsKt.isBlank(str3)) {
            TextToSpeech.OnInitListener onInitListener = new TextToSpeech.OnInitListener() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda31
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i) {
                    FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$52$0$1(str, strFloatingVoiceWindow$lambda$45, objectRef, locale, defaultTtsEngine, mutableState2, i);
                }
            };
            str2 = strFloatingVoiceWindow$lambda$45;
            objectRef = objectRef;
            textToSpeech = new TextToSpeech(context, onInitListener);
        } else {
            str2 = strFloatingVoiceWindow$lambda$45;
            final String str4 = str;
            final String str5 = str3;
            TextToSpeech.OnInitListener onInitListener2 = new TextToSpeech.OnInitListener() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda30
                @Override // android.speech.tts.TextToSpeech.OnInitListener
                public final void onInit(int i) {
                    FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$52$0$0(str5, objectRef, locale, str4, defaultTtsEngine, str2, strComponent2, mutableState2, i);
                }
            };
            str = str4;
            textToSpeech = new TextToSpeech(context, onInitListener2, str5);
        }
        objectRef.element = textToSpeech;
        mutableState3.setValue((TextToSpeech) objectRef.element);
        Log.d("FloatingVoiceWindow", "TTS\u5f15\u64ce\u5b9e\u4f8b\u521b\u5efa: " + objectRef.element + " (\u5f15\u64ce: " + (str == null ? "\u9ed8\u8ba4" : str) + ", \u7528\u6237\u9009\u62e9: " + (str2 == null ? "\u672a\u6307\u5b9a" : str2) + ")");
        return new DisposableEffectResult() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$lambda$52$0$$inlined$onDispose$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                Log.d("FloatingVoiceWindow", "TTS\u5f15\u64ce\u9500\u6bc1: " + (str != null ? str : "\u9ed8\u8ba4") + " (\u7528\u6237\u9009\u62e9: " + (str2 != null ? str2 : "\u672a\u6307\u5b9a") + ")");
                TextToSpeech textToSpeech2 = (TextToSpeech) objectRef.element;
                if (textToSpeech2 != null) {
                    textToSpeech2.shutdown();
                }
                mutableState3.setValue(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void FloatingVoiceWindow$lambda$52$0$0(String $finalEngineName, Ref.ObjectRef $ttsInstance, Locale $defaultLocale, String $actualEngineName, String $systemDefaultEngine, String $engineName, String $availabilityMessage, MutableState $ttsError$delegate, int status) {
        String string;
        Log.d("FloatingVoiceWindow", "TTS\u521d\u59cb\u5316\u56de\u8c03: status=" + status + ", \u5f15\u64ce=" + $finalEngineName);
        if (status == 0) {
            Log.d("FloatingVoiceWindow", "TTS\u521d\u59cb\u5316\u6210\u529f\uff0c\u5f00\u59cb\u8bbe\u7f6e\u8bed\u8a00");
            TextToSpeech instance = (TextToSpeech) $ttsInstance.element;
            if (instance == null) {
                Log.e("FloatingVoiceWindow", "TTS\u5b9e\u4f8b\u4e3anull\uff0c\u65e0\u6cd5\u8bbe\u7f6e\u8bed\u8a00");
                $ttsError$delegate.setValue("TTS\u5f15\u64ce\u5b9e\u4f8b\u521b\u5efa\u5931\u8d25\uff0c\u8bf7\u91cd\u542f\u5e94\u7528");
                return;
            }
            int result = instance.setLanguage($defaultLocale);
            Log.d("FloatingVoiceWindow", "TTS\u8bed\u8a00\u8bbe\u7f6e\u7ed3\u679c: " + result + " (\u533a\u57df: " + $defaultLocale + ", \u5f15\u64ce=" + $finalEngineName + ")");
            switch (result) {
                case -2:
                    $ttsError$delegate.setValue("\u5f53\u524d\u8bed\u8a00\u4e0d\u652f\u6301\uff0c\u8bf7\u68c0\u67e5\u7cfb\u7edf\u8bed\u8a00\u8bbe\u7f6e\u6216\u5b89\u88c5\u76f8\u5e94\u8bed\u8a00\u5305");
                    Log.e("FloatingVoiceWindow", "TTS\u8bed\u8a00\u4e0d\u652f\u6301 (\u533a\u57df: " + $defaultLocale + ", \u5f15\u64ce=" + $finalEngineName + ")");
                    break;
                case -1:
                    $ttsError$delegate.setValue("\u7f3a\u5c11\u8bed\u8a00\u5305\u6570\u636e\uff0c\u8bf7\u70b9\u51fb\u4e0b\u65b9\u94fe\u63a5\u5b89\u88c5\u8bed\u97f3\u5305");
                    Log.e("FloatingVoiceWindow", "TTS\u8bed\u8a00\u5305\u7f3a\u5931 (\u533a\u57df: " + $defaultLocale + ", \u5f15\u64ce=" + $finalEngineName + ")");
                    break;
                case 0:
                default:
                    $ttsError$delegate.setValue(null);
                    Log.d("FloatingVoiceWindow", "TTS\u521d\u59cb\u5316\u6210\u529f\uff0c\u8bed\u8a00\u8bbe\u7f6e\u7ed3\u679c: " + result + " (\u533a\u57df: " + $defaultLocale + ", \u5f15\u64ce=" + $finalEngineName + ")");
                    break;
                case 1:
                case 2:
                    $ttsError$delegate.setValue(null);
                    Log.d("FloatingVoiceWindow", "TTS\u8bed\u8a00\u8bbe\u7f6e\u6210\u529f (\u533a\u57df: " + $defaultLocale + ", \u5f15\u64ce=" + $finalEngineName + ")");
                    break;
            }
            return;
        }
        if (status == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("TTS\u5f15\u64ce\u521d\u59cb\u5316\u5931\u8d25 (ERROR=-1)\n");
            sb.append("\u5f15\u64ce: " + $finalEngineName + "\n");
            sb.append("\u7cfb\u7edf\u9ed8\u8ba4\u5f15\u64ce: " + ($systemDefaultEngine == null ? "\u672a\u8bbe\u7f6e" : $systemDefaultEngine) + "\n");
            sb.append("\u7528\u6237\u9009\u62e9\u5f15\u64ce: " + ($engineName == null ? "\u672a\u6307\u5b9a" : $engineName) + "\n");
            sb.append("\n\u53ef\u80fd\u539f\u56e0:\n");
            sb.append("\u2022 TTS\u670d\u52a1\u7ed1\u5b9a\u5931\u8d25 (not bound to TTS engine)\n");
            sb.append("\u2022 \u5f15\u64ce\u5305\u5b58\u5728\u4f46\u670d\u52a1\u672a\u542f\u52a8\n");
            sb.append("\u2022 Android 13+\u6743\u9650\u9650\u5236\n");
            sb.append("\u2022 \u5f15\u64ce\u5df2\u5b89\u88c5\u4f46\u672a\u542f\u7528\n");
            sb.append("\n\u89e3\u51b3\u65b9\u6848:\n");
            if ($finalEngineName != null && !StringsKt.isBlank($finalEngineName)) {
                sb.append("1. \u68c0\u67e5 '" + $finalEngineName + "' \u662f\u5426\u5df2\u542f\u7528\n");
                sb.append("2. \u5230\u7cfb\u7edf\u8bbe\u7f6e\u4e2d\u67e5\u770bTTS\u5f15\u64ce\u72b6\u6001\n");
                sb.append("3. \u5c1d\u8bd5\u4f7f\u7528\u9ed8\u8ba4\u5f15\u64ce\uff08\u7559\u7a7a\u5f15\u64ce\u5305\u540d\uff09\n");
                sb.append("4. \u91cd\u542f\u8bbe\u5907\u540e\u91cd\u8bd5\n");
            } else {
                sb.append("1. \u6253\u5f00\u7cfb\u7edf\u8bbe\u7f6e \u2192 \u8f85\u52a9\u529f\u80fd \u2192 \u6587\u5b57\u8f6c\u8bed\u97f3\n");
                sb.append("2. \u786e\u4fdd'\u9996\u9009\u5f15\u64ce'\u5df2\u9009\u62e9\n");
                sb.append("3. \u70b9\u51fb'\u64ad\u653e'\u6d4b\u8bd5TTS\u662f\u5426\u6b63\u5e38\u5de5\u4f5c\n");
                sb.append("4. \u91cd\u542f\u5e94\u7528\u540e\u91cd\u8bd5\n");
            }
            if (Build.VERSION.SDK_INT >= 33) {
                sb.append("\nAndroid 13+ \u989d\u5916\u6b65\u9aa4:\n");
                sb.append("\u2022 \u68c0\u67e5\u5e94\u7528\u6743\u9650\u8bbe\u7f6e\n");
                sb.append("\u2022 \u786e\u4fddTTS\u670d\u52a1\u672a\u88ab\u7cfb\u7edf\u9650\u5236\n");
            }
            string = sb.toString();
        } else {
            string = "TTS\u521d\u59cb\u5316\u5931\u8d25 (\u72b6\u6001\u7801: " + status + ")\uff0c\u5f15\u64ce: " + $actualEngineName + "\uff0c\u8bf7\u68c0\u67e5\u7cfb\u7edfTTS\u8bbe\u7f6e";
        }
        $ttsError$delegate.setValue(string);
        Log.e("FloatingVoiceWindow", "TTS\u521d\u59cb\u5316\u5931\u8d25: status=" + status + ", \u5f15\u64ce=" + $actualEngineName);
        Log.e("FloatingVoiceWindow", "\u8bbe\u5907\u4fe1\u606f: SDK=" + Build.VERSION.SDK_INT + ", \u578b\u53f7=" + Build.MODEL + ", \u54c1\u724c=" + Build.BRAND);
        Log.e("FloatingVoiceWindow", "\u7cfb\u7edf\u9ed8\u8ba4\u5f15\u64ce: " + ($systemDefaultEngine != null ? $systemDefaultEngine : "\u672a\u8bbe\u7f6e"));
        Log.e("FloatingVoiceWindow", "\u7528\u6237\u9009\u62e9\u5f15\u64ce: " + ($engineName != null ? $engineName : "\u672a\u6307\u5b9a"));
        Log.e("FloatingVoiceWindow", "\u5b9e\u9645\u4f7f\u7528\u5f15\u64ce: " + ($actualEngineName == null ? "\u9ed8\u8ba4" : $actualEngineName));
        Log.e("FloatingVoiceWindow", "\u5f15\u64ce\u53ef\u7528\u6027\u68c0\u67e5\u7ed3\u679c: " + $availabilityMessage);
        if (Build.VERSION.SDK_INT >= 33) {
            Log.e("FloatingVoiceWindow", "Android 13+ \u9700\u8981\u68c0\u67e5\uff1a1. TTS\u8fd0\u884c\u65f6\u6743\u9650 2. \u8f85\u52a9\u529f\u80fd\u8bbe\u7f6e 3. \u540e\u53f0\u670d\u52a1\u9650\u5236");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void FloatingVoiceWindow$lambda$52$0$1(String $actualEngineName, String $engineName, Ref.ObjectRef $ttsInstance, Locale $defaultLocale, String $systemDefaultEngine, MutableState $ttsError$delegate, int status) {
        String string;
        Log.d("FloatingVoiceWindow", "TTS\u521d\u59cb\u5316\u56de\u8c03: status=" + status + ", \u5f15\u64ce=\u9ed8\u8ba4 (\u5b9e\u9645\u5f15\u64ce: " + ($actualEngineName == null ? "\u65e0" : $actualEngineName) + ", \u7528\u6237\u9009\u62e9: " + ($engineName != null ? $engineName : "\u65e0") + ")");
        if (status == 0) {
            Log.d("FloatingVoiceWindow", "TTS\u521d\u59cb\u5316\u6210\u529f\uff0c\u5f00\u59cb\u8bbe\u7f6e\u8bed\u8a00");
            TextToSpeech instance = (TextToSpeech) $ttsInstance.element;
            if (instance == null) {
                Log.e("FloatingVoiceWindow", "TTS\u5b9e\u4f8b\u4e3anull\uff0c\u65e0\u6cd5\u8bbe\u7f6e\u8bed\u8a00");
                $ttsError$delegate.setValue("TTS\u5f15\u64ce\u5b9e\u4f8b\u521b\u5efa\u5931\u8d25\uff0c\u8bf7\u91cd\u542f\u5e94\u7528");
                return;
            }
            int result = instance.setLanguage($defaultLocale);
            Log.d("FloatingVoiceWindow", "TTS\u8bed\u8a00\u8bbe\u7f6e\u7ed3\u679c: " + result + " (\u533a\u57df: " + $defaultLocale + ", \u5f15\u64ce=\u9ed8\u8ba4)");
            switch (result) {
                case -2:
                    $ttsError$delegate.setValue("\u5f53\u524d\u8bed\u8a00\u4e0d\u652f\u6301\uff0c\u8bf7\u68c0\u67e5\u7cfb\u7edf\u8bed\u8a00\u8bbe\u7f6e\u6216\u5b89\u88c5\u76f8\u5e94\u8bed\u8a00\u5305");
                    Log.e("FloatingVoiceWindow", "TTS\u8bed\u8a00\u4e0d\u652f\u6301 (\u533a\u57df: " + $defaultLocale + ", \u5f15\u64ce=\u9ed8\u8ba4)");
                    break;
                case -1:
                    $ttsError$delegate.setValue("\u7f3a\u5c11\u8bed\u8a00\u5305\u6570\u636e\uff0c\u8bf7\u70b9\u51fb\u4e0b\u65b9\u94fe\u63a5\u5b89\u88c5\u8bed\u97f3\u5305");
                    Log.e("FloatingVoiceWindow", "TTS\u8bed\u8a00\u5305\u7f3a\u5931 (\u533a\u57df: " + $defaultLocale + ", \u5f15\u64ce=\u9ed8\u8ba4)");
                    break;
                case 0:
                default:
                    $ttsError$delegate.setValue(null);
                    Log.d("FloatingVoiceWindow", "TTS\u521d\u59cb\u5316\u6210\u529f\uff0c\u8bed\u8a00\u8bbe\u7f6e\u7ed3\u679c: " + result + " (\u533a\u57df: " + $defaultLocale + ", \u5f15\u64ce=\u9ed8\u8ba4)");
                    break;
                case 1:
                case 2:
                    $ttsError$delegate.setValue(null);
                    Log.d("FloatingVoiceWindow", "TTS\u8bed\u8a00\u8bbe\u7f6e\u6210\u529f (\u533a\u57df: " + $defaultLocale + ", \u5f15\u64ce=\u9ed8\u8ba4)");
                    break;
            }
        }
        if (status == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("\u9ed8\u8ba4TTS\u5f15\u64ce\u521d\u59cb\u5316\u5931\u8d25 (ERROR=-1)\n");
            sb.append("\u7cfb\u7edf\u9ed8\u8ba4\u5f15\u64ce: " + ($systemDefaultEngine == null ? "\u672a\u8bbe\u7f6e" : $systemDefaultEngine) + "\n");
            sb.append("\u7528\u6237\u9009\u62e9\u5f15\u64ce: " + ($engineName == null ? "\u672a\u6307\u5b9a" : $engineName) + "\n");
            sb.append("\u5b9e\u9645\u5f15\u64ce\u540d\u79f0: " + ($actualEngineName == null ? "\u9ed8\u8ba4\uff08\u65e0\u6307\u5b9a\u5305\u540d\uff09" : $actualEngineName) + "\n");
            sb.append("\n\u8be6\u7ec6\u8bca\u65ad:\n");
            sb.append("\u2022 \u9519\u8bef\u72b6\u6001: " + status + " (ERROR)\n");
            sb.append("\u2022 \u5e38\u89c1\u539f\u56e0: 'not bound to TTS engine'\n");
            sb.append("\u2022 \u53ef\u80fd\u95ee\u9898: \u7cfb\u7edfTTS\u670d\u52a1\u672a\u6b63\u786e\u7ed1\u5b9a\n");
            sb.append("\n\u4fee\u590d\u6b65\u9aa4:\n");
            sb.append("1. \u6253\u5f00\u7cfb\u7edf\u8bbe\u7f6e \u2192 \u8f85\u52a9\u529f\u80fd \u2192 \u6587\u5b57\u8f6c\u8bed\u97f3\n");
            sb.append("2. \u70b9\u51fb'\u9996\u9009\u5f15\u64ce'\u67e5\u770b\u5f53\u524d\u9009\u62e9\u7684\u5f15\u64ce\n");
            sb.append("3. \u5982\u679c\u6ca1\u6709\u5f15\u64ce\uff0c\u70b9\u51fb'\u5b89\u88c5\u8bed\u97f3\u6570\u636e'\n");
            sb.append("4. \u5b89\u88c5Google TTS\u6216\u5382\u5546TTS\n");
            sb.append("5. \u4e0b\u8f7d\u4e2d\u6587\u8bed\u97f3\u5305\n");
            sb.append("6. \u8fd4\u56de\u8bbe\u7f6e\u9875\u9762\uff0c\u9009\u62e9\u521a\u5b89\u88c5\u7684\u5f15\u64ce\n");
            sb.append("7. \u70b9\u51fb'\u64ad\u653e'\u6d4b\u8bd5TTS\u662f\u5426\u5de5\u4f5c\n");
            sb.append("8. \u91cd\u542f\u672c\u5e94\u7528\n");
            if (Build.VERSION.SDK_INT >= 33) {
                sb.append("\nAndroid 13+ \u989d\u5916\u6b65\u9aa4:\n");
                sb.append("\u2022 \u68c0\u67e5\u5e94\u7528\u6743\u9650\n");
                sb.append("\u2022 \u786e\u4fddTTS\u670d\u52a1\u672a\u88ab\u7535\u6c60\u4f18\u5316\u9650\u5236\n");
            }
            sb.append("\n\u63a8\u8350\u5b89\u88c5:\n");
            sb.append("\u2022 Google\u6587\u5b57\u8f6c\u8bed\u97f3 (com.google.android.tts)\n");
            sb.append("\u2022 \u5c0f\u7c73TTS (com.xiaomi.mibrain.speech)\n");
            sb.append("\u2022 \u534e\u4e3aTTS (com.huawei.tts)\n");
            sb.append("\u2022 Multi TTS (org.nobody.multitts)\n");
            sb.append("\u2022 Sherpa-onnx TTS (\u9700\u8981\u624b\u52a8\u67e5\u627e\u5305\u540d)\n");
            sb.append("\n\u5982\u679c\u5df2\u5b89\u88c5TTS\u5f15\u64ce\u4f46\u65e0\u6cd5\u8bc6\u522b:\n");
            sb.append("1. \u5728\u5e94\u7528\u8bbe\u7f6e\u4e2d\u5c1d\u8bd5\u624b\u52a8\u8f93\u5165\u5f15\u64ce\u5305\u540d\n");
            sb.append("2. \u4f7f\u7528ADB\u547d\u4ee4\u67e5\u627e\u5df2\u5b89\u88c5TTS\u5f15\u64ce:\n");
            sb.append("   adb shell pm list packages | grep tts\n");
            sb.append("3. \u5e38\u89c1\u7b2c\u4e09\u65b9TTS\u5305\u540d:\n");
            sb.append("   \u2022 sherpa-onnx: \u901a\u5e38\u662f 'cn.sherpa.onnx' \u6216 'com.example.sherpaonnx'\n");
            sb.append("   \u2022 \u5176\u4ed6TTS\u5f15\u64ce: \u67e5\u770b\u5e94\u7528\u5305\u540d\n");
            sb.append("\nAndroid 11+ \u7279\u522b\u6ce8\u610f:\n");
            sb.append("\u2022 \u672c\u5e94\u7528\u5df2\u58f0\u660eTTS\u670d\u52a1\u67e5\u8be2\u6743\u9650\n");
            sb.append("\u2022 \u786e\u4fddTTS\u5f15\u64ce\u5df2\u6b63\u786e\u5b89\u88c5\u5e76\u542f\u7528\n");
            string = sb.toString();
        } else {
            string = "TTS\u521d\u59cb\u5316\u5931\u8d25 (\u72b6\u6001\u7801: " + status + ")\uff0c\u8bf7\u68c0\u67e5\u7cfb\u7edfTTS\u8bbe\u7f6e";
        }
        $ttsError$delegate.setValue(string);
        Log.e("FloatingVoiceWindow", "TTS\u521d\u59cb\u5316\u5931\u8d25: status=" + status + ", \u5f15\u64ce=\u9ed8\u8ba4");
        Log.e("FloatingVoiceWindow", "\u7cfb\u7edf\u9ed8\u8ba4\u5f15\u64ce: " + ($systemDefaultEngine != null ? $systemDefaultEngine : "\u672a\u8bbe\u7f6e"));
        Log.e("FloatingVoiceWindow", "\u7528\u6237\u9009\u62e9\u5f15\u64ce: " + ($engineName != null ? $engineName : "\u672a\u6307\u5b9a"));
        Log.e("FloatingVoiceWindow", "\u5b9e\u9645\u5f15\u64ce\u540d\u79f0: " + ($actualEngineName != null ? $actualEngineName : "\u9ed8\u8ba4\uff08\u65e0\u6307\u5b9a\u5305\u540d\uff09"));
        Log.e("FloatingVoiceWindow", "\u8bbe\u5907\u4fe1\u606f: SDK=" + Build.VERSION.SDK_INT + ", \u578b\u53f7=" + Build.MODEL + ", \u54c1\u724c=" + Build.BRAND);
        if (Build.VERSION.SDK_INT >= 33) {
            Log.e("FloatingVoiceWindow", "Android 13+ \u63d0\u793a\uff1a\u53ef\u80fd\u9700\u8981\u68c0\u67e5\u8fd0\u884c\u65f6\u6743\u9650\u548cTTS\u670d\u52a1\u8bbe\u7f6e");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55(final MutableState $windowOffset$delegate, final MutableIntState $windowWidth$delegate, final MutableIntState $windowHeight$delegate, final Function0 $onClose, final CoroutineScope $scope, final Context $context, final Function1 $onSendAudio, final Function0 $openTtsSettings, final Function0 $retryTtsInitialization, final MutableIntState $selectedTab$delegate, final MutableState $savedAudios$delegate, final MutableState $isLoadingAudios$delegate, final MutableState $ttsText$delegate, final MutableState $isTtsPlaying$delegate, final MutableFloatState $ttsProgress$delegate, final MutableState $ttsError$delegate, final MutableState $isTtsSynthesizing$delegate, final MutableState $ttsSynthesisError$delegate, final MutableState $availableTtsEngines$delegate, final MutableState $selectedTtsEngine$delegate, final MutableState $ttsEngine$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C530@27143L69,533@27329L343,544@27814L11,546@27879L3672,528@27078L4473:FloatingVoiceWindow.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-564390579, $changed, -1, "com.yhchat.canarys.ui.components.FloatingVoiceWindow.<anonymous> (FloatingVoiceWindow.kt:528)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1213464654, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$0$0($windowOffset$delegate, (Density) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.m1107width3ABfNKs(OffsetKt.offset(companion, (Function1) objRememberedValue), C1834Dp.m7806constructorimpl(FloatingVoiceWindow$lambda$5($windowWidth$delegate))), C1834Dp.m7806constructorimpl(FloatingVoiceWindow$lambda$8($windowHeight$delegate)));
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1213458428, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = (PointerInputEventHandler) new FloatingVoiceWindowKt$FloatingVoiceWindow$5$2$1($windowOffset$delegate);
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SurfaceKt.m3209SurfaceT9BRK9s(ClipKt.clip(ShadowKt.m4660shadows4CzXII$default(SuspendingPointerInputFilterKt.pointerInput(modifierM1088height3ABfNKs, unit, (PointerInputEventHandler) objRememberedValue2), C1834Dp.m7806constructorimpl(8), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16)), false, 0L, 0L, 28, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16))), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), 0L, C1834Dp.m7806constructorimpl(8), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-475848536, true, new Function2() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2($onClose, $scope, $context, $onSendAudio, $openTtsSettings, $retryTtsInitialization, $windowWidth$delegate, $windowHeight$delegate, $selectedTab$delegate, $savedAudios$delegate, $isLoadingAudios$delegate, $ttsText$delegate, $isTtsPlaying$delegate, $ttsProgress$delegate, $ttsError$delegate, $isTtsSynthesizing$delegate, $ttsSynthesisError$delegate, $availableTtsEngines$delegate, $selectedTtsEngine$delegate, $ttsEngine$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 12607488, 106);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset FloatingVoiceWindow$lambda$55$0$0(MutableState $windowOffset$delegate, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m7925boximpl(IntOffset.m7928constructorimpl((offset.mo631roundToPx0680j_4(DpOffset.m7867getXD9Ej5fM(FloatingVoiceWindow$lambda$2($windowOffset$delegate))) << 32) | (offset.mo631roundToPx0680j_4(DpOffset.m7869getYD9Ej5fM(FloatingVoiceWindow$lambda$2($windowOffset$delegate))) & 4294967295L)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2(final Function0 $onClose, final CoroutineScope $scope, final Context $context, final Function1 $onSendAudio, Function0 $openTtsSettings, Function0 $retryTtsInitialization, final MutableIntState $windowWidth$delegate, final MutableIntState $windowHeight$delegate, final MutableIntState $selectedTab$delegate, final MutableState $savedAudios$delegate, final MutableState $isLoadingAudios$delegate, final MutableState $ttsText$delegate, MutableState $isTtsPlaying$delegate, MutableFloatState $ttsProgress$delegate, MutableState $ttsError$delegate, final MutableState $isTtsSynthesizing$delegate, final MutableState $ttsSynthesisError$delegate, MutableState $availableTtsEngines$delegate, final MutableState $selectedTtsEngine$delegate, final MutableState $ttsEngine$delegate, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Composer composer2;
        Composer composer3;
        String str;
        final MutableState mutableState;
        Composer composer4;
        Object obj;
        final MutableState mutableState2;
        ComposerKt.sourceInformation($composer, "C550@28018L11,547@27893L3648:FloatingVoiceWindow.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475848536, $changed, -1, "com.yhchat.canarys.ui.components.FloatingVoiceWindow.<anonymous>.<anonymous> (FloatingVoiceWindow.kt:547)");
            }
            Modifier modifierM475backgroundbw27NRU$default = BackgroundKt.m475backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM475backgroundbw27NRU$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1855919766, "C555@28182L130,553@28096L234,564@28486L20,562@28390L134:FloatingVoiceWindow.kt#2suaub");
            ComposerKt.sourceInformationMarkerStart($composer, 632867732, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda44
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2$0$0$0($windowWidth$delegate, $windowHeight$delegate, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            WindowTitleBar($onClose, (Function2) objRememberedValue, $composer, 48);
            int iFloatingVoiceWindow$lambda$11 = FloatingVoiceWindow$lambda$11($selectedTab$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 632877350, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2$0$1$0($selectedTab$delegate, ((Integer) obj2).intValue());
                    }
                };
                $composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TabSelector(iFloatingVoiceWindow$lambda$11, (Function1) objRememberedValue2, $composer, 48);
            switch (FloatingVoiceWindow$lambda$11($selectedTab$delegate)) {
                case 0:
                    composer = $composer;
                    composer2 = $composer;
                    composer.startReplaceGroup(632882677);
                    ComposerKt.sourceInformation(composer, "572@28780L382,581@29206L172,569@28629L771");
                    List<SavedAudioItem> listFloatingVoiceWindow$lambda$14 = FloatingVoiceWindow$lambda$14($savedAudios$delegate);
                    boolean zFloatingVoiceWindow$lambda$17 = FloatingVoiceWindow$lambda$17($isLoadingAudios$delegate);
                    ComposerKt.sourceInformationMarkerStart(composer, 632887120, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
                    boolean zChangedInstance = composer.changedInstance($scope) | composer.changedInstance($context);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        composer3 = $composer;
                        objRememberedValue3 = new Function0() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda46
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2$0$2$0($scope, $isLoadingAudios$delegate, $context, $savedAudios$delegate);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    } else {
                        composer3 = $composer;
                    }
                    Function0 function02 = (Function0) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, 632900542, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
                    boolean zChanged = composer.changed($onSendAudio) | composer.changed($onClose);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda47
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2$0$3$0($onSendAudio, $onClose, (SavedAudioItem) obj3);
                            }
                        };
                        composer.updateRememberedValue(obj2);
                        objRememberedValue4 = obj2;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    SavedAudiosTab(listFloatingVoiceWindow$lambda$14, zFloatingVoiceWindow$lambda$17, function02, (Function1) objRememberedValue4, composer, 0);
                    composer.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                    break;
                case 1:
                    $composer.startReplaceGroup(632909524);
                    ComposerKt.sourceInformation($composer, "589@29514L16,597@29959L247,602@30247L776,618@31065L173,623@31280L74,587@29427L2082");
                    String strFloatingVoiceWindow$lambda$20 = FloatingVoiceWindow$lambda$20($ttsText$delegate);
                    ComposerKt.sourceInformationMarkerStart($composer, 632910242, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
                    Object objRememberedValue5 = $composer.rememberedValue();
                    if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda48
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2$0$4$0($ttsText$delegate, (String) obj3);
                            }
                        };
                        $composer.updateRememberedValue(objRememberedValue5);
                    }
                    Function1 function1 = (Function1) objRememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    boolean zFloatingVoiceWindow$lambda$23 = FloatingVoiceWindow$lambda$23($isTtsPlaying$delegate);
                    float fFloatingVoiceWindow$lambda$26 = FloatingVoiceWindow$lambda$26($ttsProgress$delegate);
                    String strFloatingVoiceWindow$lambda$29 = FloatingVoiceWindow$lambda$29($ttsError$delegate);
                    boolean zFloatingVoiceWindow$lambda$32 = FloatingVoiceWindow$lambda$32($isTtsSynthesizing$delegate);
                    String strFloatingVoiceWindow$lambda$35 = FloatingVoiceWindow$lambda$35($ttsSynthesisError$delegate);
                    List<TextToSpeech.EngineInfo> listFloatingVoiceWindow$lambda$42 = FloatingVoiceWindow$lambda$42($availableTtsEngines$delegate);
                    String strFloatingVoiceWindow$lambda$45 = FloatingVoiceWindow$lambda$45($selectedTtsEngine$delegate);
                    ComposerKt.sourceInformationMarkerStart($composer, 632924713, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
                    Object objRememberedValue6 = $composer.rememberedValue();
                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function1() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda49
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2$0$5$0($selectedTtsEngine$delegate, (String) obj3);
                            }
                        };
                        $composer.updateRememberedValue(objRememberedValue6);
                    }
                    Function1 function12 = (Function1) objRememberedValue6;
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerStart($composer, 632934458, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
                    boolean zChangedInstance2 = $composer.changedInstance($context) | $composer.changed($onSendAudio) | $composer.changed($onClose);
                    Object objRememberedValue7 = $composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        str = "CC(remember):FloatingVoiceWindow.kt#9igjgp";
                        composer2 = $composer;
                        mutableState = $ttsText$delegate;
                        composer4 = $composer;
                        obj = new Function0() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2$0$6$0($context, mutableState, $isTtsSynthesizing$delegate, $ttsSynthesisError$delegate, $ttsEngine$delegate, $onSendAudio, $onClose);
                            }
                        };
                        mutableState2 = $ttsEngine$delegate;
                        $composer.updateRememberedValue(obj);
                    } else {
                        obj = objRememberedValue7;
                        str = "CC(remember):FloatingVoiceWindow.kt#9igjgp";
                        composer2 = $composer;
                        mutableState = $ttsText$delegate;
                        composer4 = $composer;
                        mutableState2 = $ttsEngine$delegate;
                    }
                    Function0 function03 = (Function0) obj;
                    ComposerKt.sourceInformationMarkerEnd(composer4);
                    composer = composer4;
                    ComposerKt.sourceInformationMarkerStart(composer, 632960031, str);
                    Object objRememberedValue8 = composer.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2$0$7$0(mutableState, mutableState2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue8);
                    }
                    Function0 function04 = (Function0) objRememberedValue8;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, 632966812, str);
                    Object objRememberedValue9 = composer.rememberedValue();
                    if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2$0$8$0(mutableState2);
                            }
                        };
                        composer.updateRememberedValue(obj3);
                        objRememberedValue9 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    TTSTab(strFloatingVoiceWindow$lambda$20, function1, zFloatingVoiceWindow$lambda$23, fFloatingVoiceWindow$lambda$26, strFloatingVoiceWindow$lambda$29, zFloatingVoiceWindow$lambda$32, strFloatingVoiceWindow$lambda$35, listFloatingVoiceWindow$lambda$42, strFloatingVoiceWindow$lambda$45, function12, function03, function04, (Function0) objRememberedValue9, $openTtsSettings, $retryTtsInitialization, composer, 805306416, 25008, 0);
                    composer.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                    composer3 = $composer;
                    break;
                default:
                    composer = $composer;
                    composer3 = $composer;
                    composer2 = $composer;
                    composer.startReplaceGroup(-1883898352);
                    composer.endReplaceGroup();
                    Unit unit3 = Unit.INSTANCE;
                    break;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2$0$0$0(MutableIntState $windowWidth$delegate, MutableIntState $windowHeight$delegate, int width, int height) {
        $windowWidth$delegate.setIntValue(width);
        $windowHeight$delegate.setIntValue(height);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2$0$1$0(MutableIntState $selectedTab$delegate, int it) {
        $selectedTab$delegate.setIntValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2$0$2$0(CoroutineScope $scope, MutableState $isLoadingAudios$delegate, Context $context, MutableState $savedAudios$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new FloatingVoiceWindowKt$FloatingVoiceWindow$5$3$1$3$1$1($isLoadingAudios$delegate, $context, $savedAudios$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2$0$3$0(Function1 $onSendAudio, Function0 $onClose, SavedAudioItem audioItem) {
        Intrinsics.checkNotNullParameter(audioItem, "audioItem");
        $onSendAudio.invoke(audioItem.getUri());
        $onClose.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2$0$4$0(MutableState $ttsText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $ttsText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2$0$5$0(MutableState $selectedTtsEngine$delegate, String engineName) {
        Intrinsics.checkNotNullParameter(engineName, "engineName");
        $selectedTtsEngine$delegate.setValue(engineName);
        Log.d("FloatingVoiceWindow", "\u7528\u6237\u9009\u62e9TTS\u5f15\u64ce: " + engineName);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2$0$6$0(Context $context, MutableState $ttsText$delegate, final MutableState $isTtsSynthesizing$delegate, final MutableState $ttsSynthesisError$delegate, MutableState $ttsEngine$delegate, final Function1 $onSendAudio, final Function0 $onClose) {
        if (!StringsKt.isBlank(FloatingVoiceWindow$lambda$20($ttsText$delegate))) {
            FloatingVoiceWindow$lambda$33($isTtsSynthesizing$delegate, true);
            $ttsSynthesisError$delegate.setValue(null);
            synthesizeTTS($context, FloatingVoiceWindow$lambda$48($ttsEngine$delegate), FloatingVoiceWindow$lambda$20($ttsText$delegate), new Function1() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$55$2$0$6$0$0($onSendAudio, $onClose, $isTtsSynthesizing$delegate, $ttsSynthesisError$delegate, (Uri) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2$0$6$0$0(Function1 $onSendAudio, Function0 $onClose, MutableState $isTtsSynthesizing$delegate, MutableState $ttsSynthesisError$delegate, Uri uri) {
        FloatingVoiceWindow$lambda$33($isTtsSynthesizing$delegate, false);
        if (uri != null) {
            $onSendAudio.invoke(uri);
            $onClose.invoke();
        } else {
            $ttsSynthesisError$delegate.setValue("TTS\u5408\u6210\u5931\u8d25\uff0c\u8bf7\u91cd\u8bd5");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2$0$7$0(MutableState $ttsText$delegate, MutableState $ttsEngine$delegate) {
        if (!StringsKt.isBlank(FloatingVoiceWindow$lambda$20($ttsText$delegate))) {
            playTTS(FloatingVoiceWindow$lambda$48($ttsEngine$delegate), FloatingVoiceWindow$lambda$20($ttsText$delegate));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FloatingVoiceWindow$lambda$55$2$0$8$0(MutableState $ttsEngine$delegate) {
        stopTTS(FloatingVoiceWindow$lambda$48($ttsEngine$delegate));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void WindowTitleBar(kotlin.jvm.functions.Function0<kotlin.Unit> r76, final kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r77, androidx.compose.runtime.Composer r78, final int r79) {
        /*
            Method dump skipped, instructions count: 1270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.FloatingVoiceWindowKt.WindowTitleBar(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WindowTitleBar$lambda$0$0$0$0(Function2 $onResize) {
        $onResize.invoke(280, 400);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WindowTitleBar$lambda$0$0$1$0(Function2 $onResize) {
        $onResize.invoke(320, 480);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WindowTitleBar$lambda$0$0$2$0(Function2 $onResize) {
        $onResize.invoke(400, 600);
        return Unit.INSTANCE;
    }

    private static final void TabSelector(final int selectedTab, final Function1<? super Integer, Unit> function1, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(1394055965);
        ComposerKt.sourceInformation($composer2, "C(TabSelector)N(selectedTab,onTabSelected)704@33683L737,700@33531L889:FloatingVoiceWindow.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(selectedTab) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1394055965, $dirty, -1, "com.yhchat.canarys.ui.components.TabSelector (FloatingVoiceWindow.kt:699)");
            }
            SegmentedButtonKt.m3122SingleChoiceSegmentedButtonRowuFdPcIQ(PaddingKt.m1051paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12), C1834Dp.m7806constructorimpl(8)), 0.0f, ComposableLambdaKt.rememberComposableLambda(-1712681934, true, new Function3() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda42
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FloatingVoiceWindowKt.TabSelector$lambda$0(selectedTab, function1, (SingleChoiceSegmentedButtonRowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda43
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingVoiceWindowKt.TabSelector$lambda$1(selectedTab, function1, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabSelector$lambda$0(int $selectedTab, final Function1 $onTabSelected, SingleChoiceSegmentedButtonRowScope SingleChoiceSegmentedButtonRow, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(SingleChoiceSegmentedButtonRow, "$this$SingleChoiceSegmentedButtonRow");
        ComposerKt.sourceInformation($composer, "C707@33773L20,708@33839L31,705@33693L348,716@34139L20,717@34205L31,714@34059L355:FloatingVoiceWindow.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(SingleChoiceSegmentedButtonRow) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1712681934, $dirty2, -1, "com.yhchat.canarys.ui.components.TabSelector.<anonymous> (FloatingVoiceWindow.kt:705)");
            }
            boolean z = $selectedTab == 0;
            ComposerKt.sourceInformationMarkerStart($composer, -914861306, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            boolean zChanged = $composer.changed($onTabSelected);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FloatingVoiceWindowKt.TabSelector$lambda$0$0$0($onTabSelected);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SegmentedButtonKt.SegmentedButton(SingleChoiceSegmentedButtonRow, z, (Function0<Unit>) objRememberedValue, SegmentedButtonDefaults.INSTANCE.itemShape(0, 2, null, $composer, 3126, 4), (Modifier) null, false, (SegmentedButtonColors) null, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FloatingVoiceWindowKt.INSTANCE.m11014getLambda$178525725$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FloatingVoiceWindowKt.INSTANCE.getLambda$1115893122$app_debug(), $composer, ($dirty2 & 14) | 805306368, 6, 248);
            boolean z2 = $selectedTab == 1;
            ComposerKt.sourceInformationMarkerStart($composer, -914849594, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            boolean zChanged2 = $composer.changed($onTabSelected);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FloatingVoiceWindowKt.TabSelector$lambda$0$1$0($onTabSelected);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SegmentedButtonKt.SegmentedButton(SingleChoiceSegmentedButtonRow, z2, (Function0<Unit>) objRememberedValue2, SegmentedButtonDefaults.INSTANCE.itemShape(1, 2, null, $composer, 3126, 4), (Modifier) null, false, (SegmentedButtonColors) null, (BorderStroke) null, (MutableInteractionSource) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FloatingVoiceWindowKt.INSTANCE.getLambda$840299034$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FloatingVoiceWindowKt.INSTANCE.m11019getLambda$763704839$app_debug(), $composer, ($dirty2 & 14) | 805306368, 6, 248);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabSelector$lambda$0$0$0(Function1 $onTabSelected) {
        $onTabSelected.invoke(0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TabSelector$lambda$0$1$0(Function1 $onTabSelected) {
        $onTabSelected.invoke(1);
        return Unit.INSTANCE;
    }

    private static final void SavedAudiosTab(final List<SavedAudioItem> list, final boolean isLoading, final Function0<Unit> function0, final Function1<? super SavedAudioItem, Unit> function1, Composer $composer, final int $changed) {
        Function0 function02;
        Composer composer;
        Function0 function03;
        Function0 function04;
        Composer composer2;
        Function0 function05;
        Composer $composer2 = $composer.startRestartGroup(229112415);
        ComposerKt.sourceInformation($composer2, "C(SavedAudiosTab)N(audios,isLoading,onRefresh,onAudioSelected)732@34603L1695:FloatingVoiceWindow.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(list) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(isLoading) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(function1) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(229112415, $dirty2, -1, "com.yhchat.canarys.ui.components.SavedAudiosTab (FloatingVoiceWindow.kt:731)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor);
            } else {
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1022629264, "C738@34726L310,750@35054L63:FloatingVoiceWindow.kt#2suaub");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(end, Alignment.INSTANCE.getTop(), $composer2, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxWidth$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1296238049, "C745@34955L71,742@34855L171:FloatingVoiceWindow.kt#2suaub");
            ButtonKt.TextButton(function0, null, !isLoading, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-245606986, true, new Function3() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FloatingVoiceWindowKt.SavedAudiosTab$lambda$0$0$0(isLoading, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 6) & 14) | 805306368, 506);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            DividerKt.m2738HorizontalDivider9IZ8Weo(PaddingKt.m1052paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, C1834Dp.m7806constructorimpl(8), 1, null), 0.0f, 0L, $composer2, 6, 6);
            if (!isLoading) {
                if (list.isEmpty()) {
                    $composer2.startReplaceGroup(-1022008025);
                    ComposerKt.sourceInformation($composer2, "761@35400L462");
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default);
                    Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
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
                    Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                        composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                        composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i8 = (i7 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i9 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer2, 1328634960, "C765@35540L308:FloatingVoiceWindow.kt#2suaub");
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
                    ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, centerHorizontally, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = $composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer2, modifier);
                    Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    int i10 = ((((432 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!($composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    $composer2.startReusableNode();
                    if ($composer2.getInserting()) {
                        function04 = constructor4;
                        $composer2.createNode(function04);
                    } else {
                        function04 = constructor4;
                        $composer2.useNode();
                    }
                    Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl($composer2);
                    Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM4376constructorimpl4.getInserting()) {
                        composer2 = $composer2;
                        if (!Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                        }
                        Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        int i11 = (i10 >> 6) & 14;
                        Composer composer3 = composer2;
                        ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        int i12 = ((432 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer3, 1413907465, "C769@35729L15,770@35809L10,770@35765L65:FloatingVoiceWindow.kt#2suaub");
                        TextKt.m3359Text4IGK_g("\u6682\u65e0\u4fdd\u5b58\u7684\u8bed\u97f3", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 6, 0, 131070);
                        TextKt.m3359Text4IGK_g("\u957f\u6309\u60ac\u6d6e\u6309\u94ae\u53ef\u5bfc\u5165\u97f3\u9891\u6587\u4ef6", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 6, 0, 65534);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        $composer2.endReplaceGroup();
                        composer = $composer2;
                    } else {
                        composer2 = $composer2;
                    }
                    composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                    composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                    Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i112 = (i10 >> 6) & 14;
                    Composer composer32 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer32, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    int i122 = ((432 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer32, 1413907465, "C769@35729L15,770@35809L10,770@35765L65:FloatingVoiceWindow.kt#2suaub");
                    TextKt.m3359Text4IGK_g("\u6682\u65e0\u4fdd\u5b58\u7684\u8bed\u97f3", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer32, 6, 0, 131070);
                    TextKt.m3359Text4IGK_g("\u957f\u6309\u60ac\u6d6e\u6309\u94ae\u53ef\u5bfc\u5165\u97f3\u9891\u6587\u4ef6", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer32, MaterialTheme.$stable).getBodySmall(), composer32, 6, 0, 65534);
                    ComposerKt.sourceInformationMarkerEnd(composer32);
                    ComposerKt.sourceInformationMarkerEnd(composer32);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    $composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    $composer2.endReplaceGroup();
                    composer = $composer2;
                } else {
                    $composer2.startReplaceGroup(-1021522193);
                    ComposerKt.sourceInformation($composer2, "777@36034L248,774@35892L390");
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
                    ComposerKt.sourceInformationMarkerStart($composer2, -171494835, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
                    boolean zChangedInstance = $composer2.changedInstance(list) | (($dirty2 & 7168) == 2048);
                    Object objRememberedValue = $composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function1() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return FloatingVoiceWindowKt.SavedAudiosTab$lambda$0$3$0(list, function1, (LazyListScope) obj2);
                            }
                        };
                        $composer2.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer2);
                    composer = $composer2;
                    LazyDslKt.LazyColumn(modifierFillMaxSize$default2, null, null, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 24582, 494);
                    composer.endReplaceGroup();
                }
            } else {
                $composer2.startReplaceGroup(-1022235379);
                ComposerKt.sourceInformation($composer2, "754@35180L168");
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                CompositionLocalMap currentCompositionLocalMap5 = $composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default3);
                Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
                int i13 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer2.startReusableNode();
                if ($composer2.getInserting()) {
                    function05 = constructor5;
                    $composer2.createNode(function05);
                } else {
                    function05 = constructor5;
                    $composer2.useNode();
                }
                Composer composerM4376constructorimpl5 = Updater.m4376constructorimpl($composer2);
                Updater.m4383setimpl(composerM4376constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl5.rememberedValue(), Integer.valueOf(iHashCode5))) {
                    composerM4376constructorimpl5.updateRememberedValue(Integer.valueOf(iHashCode5));
                    composerM4376constructorimpl5.apply(Integer.valueOf(iHashCode5), setCompositeKeyHash5);
                }
                Updater.m4383setimpl(composerM4376constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
                int i14 = (i13 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i15 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer2, -1045649921, "C758@35320L14:FloatingVoiceWindow.kt#2suaub");
                TextKt.m3359Text4IGK_g("\u52a0\u8f7d\u4e2d...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 6, 0, 131070);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerEnd($composer2);
                $composer2.endReplaceGroup();
                composer = $composer2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return FloatingVoiceWindowKt.SavedAudiosTab$lambda$1(list, isLoading, function0, function1, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosTab$lambda$0$0$0(boolean $isLoading, RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C746@34973L39:FloatingVoiceWindow.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-245606986, $changed, -1, "com.yhchat.canarys.ui.components.SavedAudiosTab.<anonymous>.<anonymous>.<anonymous> (FloatingVoiceWindow.kt:746)");
            }
            TextKt.m3359Text4IGK_g($isLoading ? "\u52a0\u8f7d\u4e2d..." : "\u5237\u65b0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosTab$lambda$0$3$0(final List $audios, final Function1 $onAudioSelected, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FloatingVoiceWindowKt.SavedAudiosTab$lambda$0$3$0$0((SavedAudioItem) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$SavedAudiosTab$lambda$0$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((SavedAudioItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(SavedAudioItem savedAudioItem) {
                return null;
            }
        };
        LazyColumn.items($audios.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$SavedAudiosTab$lambda$0$3$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($audios.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$SavedAudiosTab$lambda$0$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke($audios.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$SavedAudiosTab$lambda$0$3$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                int i = $dirty & 14;
                final SavedAudioItem savedAudioItem = (SavedAudioItem) $audios.get(it);
                $composer.startReplaceGroup(1412755897);
                ComposerKt.sourceInformation($composer, "CN(audio)*781@36202L26,779@36114L136:FloatingVoiceWindow.kt#2suaub");
                ComposerKt.sourceInformationMarkerStart($composer, -785708516, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
                boolean zChanged = $composer.changed($onAudioSelected) | $composer.changedInstance(savedAudioItem);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function13 = $onAudioSelected;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$SavedAudiosTab$1$4$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function13.invoke(savedAudioItem);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                FloatingVoiceWindowKt.AudioItemCard(savedAudioItem, (Function0) objRememberedValue, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object SavedAudiosTab$lambda$0$3$0$0(SavedAudioItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioItemCard(final SavedAudioItem audio, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(1623113326);
        ComposerKt.sourceInformation($composer3, "C(AudioItemCard)N(audio,onClick)798@36538L38,800@36663L11,799@36608L91,802@36706L1310,794@36400L1616:FloatingVoiceWindow.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(audio) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1623113326, $dirty2, -1, "com.yhchat.canarys.ui.components.AudioItemCard (FloatingVoiceWindow.kt:793)");
            }
            $composer2 = $composer3;
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, function0, 15, null), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceVariant(), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1531882172, true, new Function3() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FloatingVoiceWindowKt.AudioItemCard$lambda$0(audio, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FloatingVoiceWindowKt.AudioItemCard$lambda$1(audio, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit AudioItemCard$lambda$0(com.yhchat.canarys.p007ui.components.SavedAudioItem r73, androidx.compose.foundation.layout.ColumnScope r74, androidx.compose.runtime.Composer r75, int r76) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.FloatingVoiceWindowKt.AudioItemCard$lambda$0(com.yhchat.canarys.ui.components.SavedAudioItem, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0f69  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x10d8  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x10e4  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x10ea  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x111d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x1133  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x1188  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x118b  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x1197  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x119e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x12a8  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x12b4  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x12ba  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x12eb  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x1301 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x1395  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x13ed  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x1448 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:356:0x144d  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x1524  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void TTSTab(final java.lang.String r140, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r141, final boolean r142, final float r143, final java.lang.String r144, boolean r145, final java.lang.String r146, final java.util.List<? extends android.speech.tts.TextToSpeech.EngineInfo> r147, final java.lang.String r148, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r149, final kotlin.jvm.functions.Function0<kotlin.Unit> r150, final kotlin.jvm.functions.Function0<kotlin.Unit> r151, final kotlin.jvm.functions.Function0<kotlin.Unit> r152, kotlin.jvm.functions.Function0<kotlin.Unit> r153, kotlin.jvm.functions.Function0<kotlin.Unit> r154, androidx.compose.runtime.Composer r155, final int r156, final int r157, final int r158) {
        /*
            Method dump skipped, instructions count: 5486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.FloatingVoiceWindowKt.TTSTab(java.lang.String, kotlin.jvm.functions.Function1, boolean, float, java.lang.String, boolean, java.lang.String, java.util.List, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$0$0$0(String $it, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C882@39313L765:FloatingVoiceWindow.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(990455701, $changed, -1, "com.yhchat.canarys.ui.components.TTSTab.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingVoiceWindow.kt:882)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(6));
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
            ComposerKt.sourceInformationMarkerStart($composer, -1937081277, "C890@39683L11,891@39763L10,888@39575L235,895@39930L11,896@40010L10,893@39835L221:FloatingVoiceWindow.kt#2suaub");
            TextKt.m3359Text4IGK_g("\u26a0\ufe0f TTS\u5f15\u64ce\u521d\u59cb\u5316\u5931\u8d25", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleSmall(), $composer, 6, 0, 65530);
            TextKt.m3359Text4IGK_g($it, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
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
    /* JADX WARN: Removed duplicated region for block: B:92:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x09db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit TTSTab$lambda$2$0$0$1(final kotlin.jvm.functions.Function0 r87, kotlin.jvm.functions.Function0 r88, androidx.compose.foundation.layout.ColumnScope r89, androidx.compose.runtime.Composer r90, int r91) {
        /*
            Method dump skipped, instructions count: 2533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.FloatingVoiceWindowKt.TTSTab$lambda$2$0$0$1(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$0$0$1$0$4$0(Function0 $onRetryInitialization) {
        $onRetryInitialization.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$2$2$0$0(MutableState $showEngineSelection) {
        $showEngineSelection.setValue(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$2$2$1$0(MutableState $showEngineSelection) {
        $showEngineSelection.setValue(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$2$2$2(final Function1 $onEngineSelected, List $availableEngines, final MutableState $showEngineSelection, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C1074@48459L162,1072@48342L357,1080@48755L19,*1083@48960L22,1084@49030L183,1082@48899L400:FloatingVoiceWindow.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1343908462, $changed, -1, "com.yhchat.canarys.ui.components.TTSTab.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingVoiceWindow.kt:1072)");
            }
            Function2<Composer, Integer, Unit> function2M11012getLambda$1654308926$app_debug = ComposableSingletons$FloatingVoiceWindowKt.INSTANCE.m11012getLambda$1654308926$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, 1289131060, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
            boolean zChanged = $composer.changed($onEngineSelected);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FloatingVoiceWindowKt.TTSTab$lambda$2$2$2$2$0$0($onEngineSelected, $showEngineSelection);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(function2M11012getLambda$1654308926$app_debug, (Function0) objRememberedValue, null, null, null, true, null, null, null, $composer, 196614, 476);
            DividerKt.m2738HorizontalDivider9IZ8Weo(null, 0.0f, 0L, $composer, 0, 7);
            Composer composer = $composer;
            Iterator it = $availableEngines.iterator();
            while (it.hasNext()) {
                final TextToSpeech.EngineInfo engineInfo = (TextToSpeech.EngineInfo) it.next();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1274223923, true, new Function2() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return FloatingVoiceWindowKt.TTSTab$lambda$2$2$2$2$1$0(engineInfo, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -259890534, "CC(remember):FloatingVoiceWindow.kt#9igjgp");
                boolean zChanged2 = composer.changed($onEngineSelected) | composer.changedInstance(engineInfo);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda35
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FloatingVoiceWindowKt.TTSTab$lambda$2$2$2$2$1$1$0($onEngineSelected, engineInfo, $showEngineSelection);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue2, null, null, null, true, null, null, null, composer, 196614, 476);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$2$2$2$0$0(Function1 $onEngineSelected, MutableState $showEngineSelection) {
        $onEngineSelected.invoke("");
        $showEngineSelection.setValue(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$2$2$2$1$0(TextToSpeech.EngineInfo $engine, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1083@48962L18:FloatingVoiceWindow.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1274223923, $changed, -1, "com.yhchat.canarys.ui.components.TTSTab.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FloatingVoiceWindow.kt:1083)");
            }
            String label = $engine.label;
            Intrinsics.checkNotNullExpressionValue(label, "label");
            TextKt.m3359Text4IGK_g(label, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$2$2$2$1$1$0(Function1 $onEngineSelected, TextToSpeech.EngineInfo $engine, MutableState $showEngineSelection) {
        String name = $engine.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        $onEngineSelected.invoke(name);
        $showEngineSelection.setValue(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$3$1$0$0(MutableState $manualEngineName, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $manualEngineName.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$3$1$1$0(MutableState $manualEngineName, Function1 $onEngineSelected) {
        if (!StringsKt.isBlank((CharSequence) $manualEngineName.getValue())) {
            $onEngineSelected.invoke($manualEngineName.getValue());
        } else {
            $onEngineSelected.invoke("");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$4$0(boolean $isPlaying, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1175@52857L11,1172@52653L241:FloatingVoiceWindow.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-33217668, $changed, -1, "com.yhchat.canarys.ui.components.TTSTab.<anonymous>.<anonymous>.<anonymous> (FloatingVoiceWindow.kt:1172)");
            }
            Icons.Filled filled = Icons.INSTANCE.getDefault();
            IconKt.m2816Iconww6aTOc($isPlaying ? PauseKt.getPause(filled) : PlayArrowKt.getPlayArrow(filled), $isPlaying ? "\u505c\u6b62" : "\u64ad\u653e", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TTSTab$lambda$2$5(boolean $isSynthesizing, RowScope TextButton, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C1224@54479L873:FloatingVoiceWindow.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2090408136, $changed, -1, "com.yhchat.canarys.ui.components.TTSTab.<anonymous>.<anonymous> (FloatingVoiceWindow.kt:1224)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal horizontalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalM909spacedBy0680j_4, centerVertically, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((432 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -2120884324, "C1243@55299L11,1241@55188L150:FloatingVoiceWindow.kt#2suaub");
            if ($isSynthesizing) {
                $composer.startReplaceGroup(-2120877939);
                ComposerKt.sourceInformation($composer, "1231@54819L11,1229@54689L217");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 24);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-2120617539);
                ComposerKt.sourceInformation($composer, "1238@55110L11,1235@54952L201");
                IconKt.m2816Iconww6aTOc(SendKt.getSend(Icons.AutoMirrored.Filled.INSTANCE), "\u53d1\u9001", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), $composer, 48, 4);
                $composer.endReplaceGroup();
            }
            TextKt.m3359Text4IGK_g($isSynthesizing ? "\u5408\u6210\u4e2d..." : "\u5408\u6210\u5e76\u53d1\u9001", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131066);
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

    /* compiled from: FloatingVoiceWindow.kt */
    @Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "", "Lcom/yhchat/canarys/ui/components/SavedAudioItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$loadSavedAudios$2", m185f = "FloatingVoiceWindow.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$loadSavedAudios$2 */
    static final class C36372 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SavedAudioItem>>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36372(Context context, Continuation<? super C36372> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C36372(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SavedAudioItem>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SavedAudioItem>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SavedAudioItem>> continuation) {
            return ((C36372) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            String selection;
            String[] selectionArgs;
            Throwable th;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        ContentResolver resolver = this.$context.getContentResolver();
                        String legacyDirPrefix = FloatingVoiceWindowKt.legacySavedAudiosDirPrefix();
                        String[] projection = Build.VERSION.SDK_INT >= 29 ? new String[]{"_id", "_display_name", "date_added", "_size"} : new String[]{"_id", "_display_name", "date_added", "_size", "_data"};
                        if (Build.VERSION.SDK_INT >= 29) {
                            selection = "relative_path=?";
                            selectionArgs = new String[]{"Download/yhchat/audio/"};
                        } else {
                            selection = "_data LIKE ?";
                            selectionArgs = new String[]{legacyDirPrefix + "%"};
                        }
                        List results = new ArrayList();
                        Cursor cursorQuery = resolver.query(FloatingVoiceWindowKt.savedAudiosCollectionUri(), projection, selection, selectionArgs, "date_added DESC");
                        if (cursorQuery == null) {
                            return results;
                        }
                        Cursor cursor = cursorQuery;
                        try {
                            Cursor cursor2 = cursor;
                            int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                            int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("_display_name");
                            int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("date_added");
                            int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("_size");
                            while (cursor2.moveToNext()) {
                                long j = cursor2.getLong(columnIndexOrThrow);
                                String string = cursor2.getString(columnIndexOrThrow2);
                                if (string == null) {
                                    string = "\u8bed\u97f3";
                                }
                                String str = string;
                                long j2 = cursor2.getLong(columnIndexOrThrow3);
                                cursor2.getLong(columnIndexOrThrow4);
                                Cursor cursor3 = cursor2;
                                ContentResolver resolver2 = resolver;
                                try {
                                    Uri uriWithAppendedId = ContentUris.withAppendedId(FloatingVoiceWindowKt.savedAudiosCollectionUri(), j);
                                    Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                                    results.add(new SavedAudioItem(String.valueOf(j), uriWithAppendedId, str, j2, FloatingVoiceWindowKt.formatDateTime(j2)));
                                    cursor2 = cursor3;
                                    resolver = resolver2;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        CloseableKt.closeFinally(cursor, th);
                                        throw th3;
                                    }
                                }
                            }
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(cursor, null);
                            return results;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e) {
                        Log.e("FloatingVoiceWindow", "\u52a0\u8f7d\u97f3\u9891\u5931\u8d25", e);
                        return CollectionsKt.emptyList();
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadSavedAudios(Context context, Continuation<? super List<SavedAudioItem>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C36372(context, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri savedAudiosCollectionUri() {
        if (Build.VERSION.SDK_INT >= 29) {
            Uri uri = Uri.parse("content://media/external/downloads");
            Intrinsics.checkNotNull(uri);
            return uri;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        Intrinsics.checkNotNull(contentUri);
        return contentUri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String legacySavedAudiosDirPrefix() {
        File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File dir = new File(downloadsDir, "yhchat/audio");
        String path = dir.getAbsolutePath();
        Intrinsics.checkNotNull(path);
        return StringsKt.endsWith$default(path, "/", false, 2, (Object) null) ? path : path + "/";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String formatDateTime(long dateAddedSeconds) {
        long millis = 1000 * dateAddedSeconds;
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        String str = fmt.format(new Date(millis));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final Pair<Boolean, String> checkTtsEngineAvailability(Context context, String engineName) throws PackageManager.NameNotFoundException {
        Log.d("FloatingVoiceWindow", "\u68c0\u67e5TTS\u5f15\u64ce\u53ef\u7528\u6027: " + engineName);
        if (engineName == null || StringsKt.isBlank(engineName)) {
            try {
                TextToSpeech testTts = new TextToSpeech(context, new TextToSpeech.OnInitListener() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$$ExternalSyntheticLambda33
                    @Override // android.speech.tts.TextToSpeech.OnInitListener
                    public final void onInit(int i) {
                        FloatingVoiceWindowKt.checkTtsEngineAvailability$lambda$0(i);
                    }
                });
                testTts.shutdown();
                return new Pair<>(true, "\u9ed8\u8ba4TTS\u5f15\u64ce\u53ef\u7528");
            } catch (Exception e) {
                Log.e("FloatingVoiceWindow", "\u9ed8\u8ba4TTS\u5f15\u64ce\u6d4b\u8bd5\u5931\u8d25", e);
                return new Pair<>(false, "\u9ed8\u8ba4TTS\u5f15\u64ce\u4e0d\u53ef\u7528: " + e.getMessage());
            }
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            try {
                packageManager.getPackageInfo(engineName, 0);
                Log.d("FloatingVoiceWindow", "TTS\u5f15\u64ce\u5305\u5b58\u5728: " + engineName);
                Intent serviceIntent = new Intent("android.speech.tts.engine.CHECK_TTS_DATA");
                serviceIntent.setPackage(engineName);
                ResolveInfo resolveInfo = packageManager.resolveService(serviceIntent, 0);
                if (resolveInfo != null) {
                    Log.d("FloatingVoiceWindow", "TTS\u5f15\u64ce\u670d\u52a1\u53ef\u7528: " + engineName);
                    return new Pair<>(true, "TTS\u5f15\u64ce '" + engineName + "' \u53ef\u7528");
                }
                Log.w("FloatingVoiceWindow", "TTS\u5f15\u64ce\u670d\u52a1\u4e0d\u53ef\u7528: " + engineName + "\uff0c\u4f46\u5c06\u7ee7\u7eed\u5c1d\u8bd5\u521d\u59cb\u5316");
                return new Pair<>(true, "TTS\u5f15\u64ce '" + engineName + "' \u5305\u5b58\u5728\u4f46\u670d\u52a1\u53ef\u80fd\u672a\u542f\u7528\uff0c\u5c06\u5c1d\u8bd5\u521d\u59cb\u5316");
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("FloatingVoiceWindow", "TTS\u5f15\u64ce\u5305\u4e0d\u5b58\u5728: " + engineName + "\uff0c\u5c06\u56de\u9000\u5230\u9ed8\u8ba4\u5f15\u64ce", e2);
                return new Pair<>(false, "TTS\u5f15\u64ce\u5305 '" + engineName + "' \u672a\u5b89\u88c5\uff0c\u5c06\u4f7f\u7528\u9ed8\u8ba4TTS\u5f15\u64ce");
            }
        } catch (Exception e3) {
            Log.w("FloatingVoiceWindow", "\u68c0\u67e5TTS\u5f15\u64ce\u53ef\u7528\u6027\u65f6\u51fa\u9519\uff0c\u5c06\u56de\u9000\u5230\u9ed8\u8ba4\u5f15\u64ce", e3);
            return new Pair<>(false, "\u68c0\u67e5TTS\u5f15\u64ce\u65f6\u51fa\u9519: " + e3.getMessage() + "\uff0c\u5c06\u4f7f\u7528\u9ed8\u8ba4TTS\u5f15\u64ce");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void checkTtsEngineAvailability$lambda$0(int status) {
        Log.d("FloatingVoiceWindow", "\u6d4b\u8bd5\u9ed8\u8ba4TTS\u5f15\u64ce\u72b6\u6001: " + status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getDefaultTtsEngine(Context context) {
        String defaultEngine = Settings.Secure.getString(context.getContentResolver(), "tts_default_synth");
        Log.d("FloatingVoiceWindow", "\u7cfb\u7edf\u9ed8\u8ba4TTS\u5f15\u64ce: " + defaultEngine);
        return defaultEngine;
    }

    private static final List<Pair<String, String>> getInstalledTtsEngines(Context context) throws PackageManager.NameNotFoundException {
        List engines = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent ttsServiceIntent = new Intent("android.intent.action.TTS_SERVICE");
            List resolveInfoList = packageManager.queryIntentServices(ttsServiceIntent, 0);
            Intrinsics.checkNotNullExpressionValue(resolveInfoList, "queryIntentServices(...)");
            Log.d("FloatingVoiceWindow", "\u627e\u5230 " + resolveInfoList.size() + " \u4e2aTTS\u5f15\u64ce");
            for (ResolveInfo resolveInfo : resolveInfoList) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                String packageName = serviceInfo.packageName;
                ApplicationInfo appInfo = packageManager.getApplicationInfo(packageName, 0);
                Intrinsics.checkNotNullExpressionValue(appInfo, "getApplicationInfo(...)");
                String appName = packageManager.getApplicationLabel(appInfo).toString();
                Log.d("FloatingVoiceWindow", "TTS\u5f15\u64ce: " + appName + " (" + packageName + ")");
                engines.add(new Pair(packageName, appName));
            }
            if (engines.isEmpty()) {
                List<Pair> knownEngines = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m176to("com.google.android.tts", "Google\u6587\u5b57\u8f6c\u8bed\u97f3"), TuplesKt.m176to("com.xiaomi.mibrain.speech", "\u5c0f\u7c73TTS"), TuplesKt.m176to("com.huawei.tts", "\u534e\u4e3aTTS"), TuplesKt.m176to("com.samsung.SMT", "\u4e09\u661fTTS"), TuplesKt.m176to("com.iflytek.tts", "\u79d1\u5927\u8baf\u98deTTS"), TuplesKt.m176to("com.microsoft.speechservices", "\u5fae\u8f6f\u8bed\u97f3"), TuplesKt.m176to("org.nobody.multitts", "Multi TTS")});
                for (Pair pair : knownEngines) {
                    String packageName2 = (String) pair.component1();
                    String engineName = (String) pair.component2();
                    try {
                        packageManager.getPackageInfo(packageName2, 0);
                        engines.add(new Pair(packageName2, engineName));
                        Log.d("FloatingVoiceWindow", "\u5df2\u77e5TTS\u5f15\u64ce\u5df2\u5b89\u88c5: " + engineName + " (" + packageName2 + ")");
                    } catch (PackageManager.NameNotFoundException e) {
                    }
                }
            }
        } catch (Exception e2) {
            Log.e("FloatingVoiceWindow", "\u83b7\u53d6TTS\u5f15\u64ce\u5217\u8868\u5931\u8d25", e2);
        }
        return engines;
    }

    private static final void synthesizeTTS(Context context, TextToSpeech tts, String text, final Function1<? super Uri, Unit> function1) {
        Log.d("FloatingVoiceWindow", "\u5f00\u59cbTTS\u5408\u6210\uff0c\u6587\u672c\u957f\u5ea6: " + text.length() + ", tts\u5b9e\u4f8b: " + tts);
        if (tts == null) {
            Log.e("FloatingVoiceWindow", "TTS\u5f15\u64ce\u5b9e\u4f8b\u4e3anull\uff0c\u65e0\u6cd5\u5408\u6210");
            function1.invoke(null);
        }
        Locale defaultLocale = Locale.getDefault();
        Log.d("FloatingVoiceWindow", "\u68c0\u67e5TTS\u8bed\u8a00\u652f\u6301\uff0c\u533a\u57df: " + defaultLocale);
        int status = tts.setLanguage(defaultLocale);
        Log.d("FloatingVoiceWindow", "TTS\u8bed\u8a00\u8bbe\u7f6e\u7ed3\u679c: " + status);
        switch (status) {
            case -2:
            case -1:
                Log.e("FloatingVoiceWindow", "TTS\u8bed\u8a00\u4e0d\u652f\u6301\uff0c\u72b6\u6001: " + status + " (\u533a\u57df: " + defaultLocale + ")");
                function1.invoke(null);
                break;
            default:
                File tempDir = context.getCacheDir();
                String fileName = "tts_" + System.currentTimeMillis() + ".wav";
                final File tempFile = new File(tempDir, fileName);
                String utteranceId = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(utteranceId, "toString(...)");
                Log.d("FloatingVoiceWindow", "TTS\u4e34\u65f6\u6587\u4ef6: " + tempFile.getAbsolutePath() + ", utteranceId: " + utteranceId);
                try {
                    tts.setOnUtteranceProgressListener(new UtteranceProgressListener() { // from class: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$synthesizeTTS$listener$1
                        @Override // android.speech.tts.UtteranceProgressListener
                        public void onStart(String utteranceId2) {
                            Log.d("FloatingVoiceWindow", "TTS\u5408\u6210\u5f00\u59cb: " + utteranceId2);
                        }

                        @Override // android.speech.tts.UtteranceProgressListener
                        public void onDone(String utteranceId2) {
                            Log.d("FloatingVoiceWindow", "TTS\u5408\u6210\u5b8c\u6210: " + utteranceId2);
                            boolean fileExists = tempFile.exists();
                            long fileSize = fileExists ? tempFile.length() : 0L;
                            Log.d("FloatingVoiceWindow", "TTS\u5408\u6210\u6587\u4ef6\u5b58\u5728: " + fileExists + ", \u5927\u5c0f: " + fileSize + " \u5b57\u8282");
                            if (fileExists && fileSize > 0) {
                                Uri uri = Uri.fromFile(tempFile);
                                Log.d("FloatingVoiceWindow", "TTS\u5408\u6210\u6210\u529f\uff0c\u6587\u4ef6URI: " + uri);
                                function1.invoke(uri);
                            } else {
                                Log.e("FloatingVoiceWindow", "TTS\u5408\u6210\u6587\u4ef6\u4e0d\u5b58\u5728\u6216\u4e3a\u7a7a");
                                function1.invoke(null);
                            }
                        }

                        @Override // android.speech.tts.UtteranceProgressListener
                        public void onError(String utteranceId2) {
                            Log.e("FloatingVoiceWindow", "TTS\u5408\u6210\u9519\u8bef: " + utteranceId2);
                            function1.invoke(null);
                        }

                        @Override // android.speech.tts.UtteranceProgressListener
                        @Deprecated(message = "Deprecated in Android")
                        public void onError(String utteranceId2, int errorCode) {
                            Log.e("FloatingVoiceWindow", "TTS\u5408\u6210\u9519\u8bef: " + utteranceId2 + ", errorCode=" + errorCode);
                            function1.invoke(null);
                        }
                    });
                    HashMap params = new HashMap();
                    params.put("utteranceId", utteranceId);
                    Log.d("FloatingVoiceWindow", "\u8c03\u7528synthesizeToFile...");
                    try {
                        int result = tts.synthesizeToFile(text, params, tempFile.getAbsolutePath());
                        Log.d("FloatingVoiceWindow", "synthesizeToFile\u8fd4\u56de\u7ed3\u679c: " + result);
                        if (result == -1) {
                            Log.e("FloatingVoiceWindow", "TTS\u5408\u6210\u5931\u8d25\uff0c\u8fd4\u56de\u9519\u8bef");
                            function1.invoke(null);
                        } else {
                            Log.d("FloatingVoiceWindow", "TTS\u5408\u6210\u5df2\u542f\u52a8\uff0c\u7b49\u5f85\u56de\u8c03");
                        }
                        break;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FloatingVoiceWindow", "TTS\u5408\u6210\u5f02\u5e38", e);
                        function1.invoke(null);
                        return;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
        }
    }

    private static final void playTTS(TextToSpeech tts, String text) {
        if (tts != null) {
            tts.speak(text, 0, null, UUID.randomUUID().toString());
        }
    }

    private static final void stopTTS(TextToSpeech tts) {
        if (tts != null) {
            tts.stop();
        }
    }
}
