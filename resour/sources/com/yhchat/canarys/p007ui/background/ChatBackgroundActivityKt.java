package com.yhchat.canarys.p007ui.background;

import android.content.Context;
import android.net.Uri;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.yhchat.canarys.data.model.ChatBackground;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatBackgroundActivity.kt */
@Metadata(m168d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a2\u0006\u0002\u0010\t\u001a3\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m169d2 = {"ChatBackgroundScreen", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_NAME, "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BackgroundCard", "background", "Lcom/yhchat/canarys/data/model/ChatBackground;", "onDelete", "Lkotlin/Function1;", "(Lcom/yhchat/canarys/data/model/ChatBackground;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/background/ChatBackgroundUiState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ChatBackgroundActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackgroundCard$lambda$1(ChatBackground chatBackground, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BackgroundCard(chatBackground, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$7(String str, String str2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ChatBackgroundScreen(str, str2, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ChatBackgroundScreen(final String chatId, final String chatName, final Function0<Unit> onBackClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Composer $composer2;
        final Modifier modifier2;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(980604495);
        ComposerKt.sourceInformation($composer3, "C(ChatBackgroundScreen)N(chatId,chatName,onBackClick,modifier)88@3144L7,89@3172L38,91@3241L75,91@3220L96,96@3359L16,101@3521L115,99@3424L212,108@3673L881,132@4561L5454,107@3646L6369,263@10076L164,263@10041L199:ChatBackgroundActivity.kt#btwww5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(chatId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(chatName) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 8) != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(980604495, $dirty, -1, "com.yhchat.canarys.ui.background.ChatBackgroundScreen (ChatBackgroundActivity.kt:87)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 1763088117, "CC(remember):ChatBackgroundActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object chatBackgroundViewModel = new ChatBackgroundViewModel();
                $composer3.updateRememberedValue(chatBackgroundViewModel);
                objRememberedValue = chatBackgroundViewModel;
            }
            final ChatBackgroundViewModel viewModel = (ChatBackgroundViewModel) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, 1763090362, "CC(remember):ChatBackgroundActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(viewModel) | $composer3.changedInstance(context);
            Object objRememberedValue2 = $composer3.rememberedValue();
            int $dirty2 = $dirty;
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new ChatBackgroundActivityKt$ChatBackgroundScreen$1$1(viewModel, context, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, 6);
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getUiState(), null, $composer3, 0, 1);
            ActivityResultContracts.GetContent getContent = new ActivityResultContracts.GetContent();
            ComposerKt.sourceInformationMarkerStart($composer3, 1763099362, "CC(remember):ChatBackgroundActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer3.changedInstance(viewModel) | $composer3.changedInstance(context) | (($dirty2 & 14) == 4);
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$3$0(viewModel, context, chatId, (Uri) obj3);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final ManagedActivityResultLauncher imagePickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent, (Function1) objRememberedValue3, $composer3, 0);
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(546511371, true, new Function2() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$4(chatName, onBackClick, imagePickerLauncher, uiState$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-1385950048, true, new Function3() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$5(uiState$delegate, chatId, viewModel, (PaddingValues) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer3, 54), $composer3, 805306416, 509);
            $composer2 = $composer3;
            Boolean boolValueOf = Boolean.valueOf(ChatBackgroundScreen$lambda$2(uiState$delegate).getSetSuccess());
            ComposerKt.sourceInformationMarkerStart($composer2, 1763309171, "CC(remember):ChatBackgroundActivity.kt#9igjgp");
            boolean zChanged = $composer2.changed(uiState$delegate) | $composer2.changedInstance(context) | $composer2.changedInstance(viewModel);
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = (Function2) new ChatBackgroundActivityKt$ChatBackgroundScreen$4$1(context, viewModel, uiState$delegate, null);
                $composer2.updateRememberedValue(obj3);
                objRememberedValue4 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, $composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$7(chatId, chatName, onBackClick, modifier2, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatBackgroundUiState ChatBackgroundScreen$lambda$2(State<ChatBackgroundUiState> state) {
        return (ChatBackgroundUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$3$0(ChatBackgroundViewModel $viewModel, Context $context, String $chatId, Uri uri) {
        if (uri != null) {
            $viewModel.uploadAndSetBackground($context, uri, $chatId);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$4(final String $chatName, final Function0 $onBackClick, final ManagedActivityResultLauncher $imagePickerLauncher, final State $uiState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C110@3722L57,111@3814L286,119@4128L402,109@3687L857:ChatBackgroundActivity.kt#btwww5");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(546511371, $changed, -1, "com.yhchat.canarys.ui.background.ChatBackgroundScreen.<anonymous> (ChatBackgroundActivity.kt:109)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(557523919, true, new Function2() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$4$0($chatName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(680805585, true, new Function2() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$4$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(1995269370, true, new Function3() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$4$2($imagePickerLauncher, $uiState$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$4$0(String $chatName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C110@3724L53:ChatBackgroundActivity.kt#btwww5");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(557523919, $changed, -1, "com.yhchat.canarys.ui.background.ChatBackgroundScreen.<anonymous>.<anonymous> (ChatBackgroundActivity.kt:110)");
            }
            TextKt.m3359Text4IGK_g($chatName + " \u7684\u804a\u5929\u80cc\u666f", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$4$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C112@3836L246:ChatBackgroundActivity.kt#btwww5");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(680805585, $changed, -1, "com.yhchat.canarys.ui.background.ChatBackgroundScreen.<anonymous>.<anonymous> (ChatBackgroundActivity.kt:112)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$ChatBackgroundActivityKt.INSTANCE.getLambda$464515438$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$4$2(final ManagedActivityResultLauncher $imagePickerLauncher, State $uiState$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C121@4196L41,120@4150L362:ChatBackgroundActivity.kt#btwww5");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1995269370, $changed, -1, "com.yhchat.canarys.ui.background.ChatBackgroundScreen.<anonymous>.<anonymous> (ChatBackgroundActivity.kt:120)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1898452771, "CC(remember):ChatBackgroundActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($imagePickerLauncher);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$4$2$0$0($imagePickerLauncher);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, true ^ ChatBackgroundScreen$lambda$2($uiState$delegate).isUploading(), null, null, ComposableSingletons$ChatBackgroundActivityKt.INSTANCE.m10374getLambda$79849219$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$4$2$0$0(ManagedActivityResultLauncher $imagePickerLauncher) {
        $imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0607  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChatBackgroundScreen$lambda$5(final androidx.compose.runtime.State r102, final java.lang.String r103, final com.yhchat.canarys.p007ui.background.ChatBackgroundViewModel r104, androidx.compose.foundation.layout.PaddingValues r105, androidx.compose.runtime.Composer r106, int r107) {
        /*
            Method dump skipped, instructions count: 1886
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.background.ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$5(androidx.compose.runtime.State, java.lang.String, com.yhchat.canarys.ui.background.ChatBackgroundViewModel, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$5$0$1$0$0$0(ChatBackgroundViewModel $viewModel) {
        $viewModel.loadBackgrounds();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$5$0$2$0(State $uiState$delegate, final String $chatId, final ChatBackgroundViewModel $viewModel, LazyListScope LazyColumn) {
        Object next;
        Object next2;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        Iterator<T> it = ChatBackgroundScreen$lambda$2($uiState$delegate).getBackgrounds().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((ChatBackground) next).getChatId(), $chatId)) {
                break;
            }
        }
        final ChatBackground currentBg = (ChatBackground) next;
        if (currentBg != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$ChatBackgroundActivityKt.INSTANCE.m10372getLambda$2146479673$app_debug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-413267842, true, new Function3() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$5$0$2$0$1(currentBg, $viewModel, $chatId, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        Iterator<T> it2 = ChatBackgroundScreen$lambda$2($uiState$delegate).getBackgrounds().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (Intrinsics.areEqual(((ChatBackground) next2).getChatId(), "all")) {
                break;
            }
        }
        final ChatBackground globalBg = (ChatBackground) next2;
        if (globalBg != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$ChatBackgroundActivityKt.INSTANCE.m10371getLambda$1746012546$app_debug(), 3, null);
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1718213493, true, new Function3() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$5$0$2$0$3(globalBg, $viewModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        Iterable backgrounds = ChatBackgroundScreen$lambda$2($uiState$delegate).getBackgrounds();
        Collection arrayList = new ArrayList();
        for (Object obj : backgrounds) {
            ChatBackground chatBackground = (ChatBackground) obj;
            if ((Intrinsics.areEqual(chatBackground.getChatId(), $chatId) || Intrinsics.areEqual(chatBackground.getChatId(), "all")) ? false : true) {
                arrayList.add(obj);
            }
        }
        final List otherBgs = (List) arrayList;
        if (!otherBgs.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$ChatBackgroundActivityKt.INSTANCE.getLambda$79623231$app_debug(), 3, null);
            final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$ChatBackgroundScreen$lambda$5$0$2$0$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((ChatBackground) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(ChatBackground chatBackground2) {
                    return null;
                }
            };
            LazyColumn.items(otherBgs.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$ChatBackgroundScreen$lambda$5$0$2$0$$inlined$items$default$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function1.invoke(otherBgs.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$ChatBackgroundScreen$lambda$5$0$2$0$$inlined$items$default$4
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                    invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope $this$items, int it3, Composer $composer, int $changed) {
                    ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                    int $dirty = $changed;
                    if (($changed & 6) == 0) {
                        $dirty |= $composer.changed($this$items) ? 4 : 2;
                    }
                    if (($changed & 48) == 0) {
                        $dirty |= $composer.changed(it3) ? 32 : 16;
                    }
                    if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                        $composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    int i = $dirty & 14;
                    final ChatBackground chatBackground2 = (ChatBackground) otherBgs.get(it3);
                    $composer.startReplaceGroup(-1548466631);
                    ComposerKt.sourceInformation($composer, "CN(background)*245@9600L53,243@9476L211:ChatBackgroundActivity.kt#btwww5");
                    ComposerKt.sourceInformationMarkerStart($composer, -1573967380, "CC(remember):ChatBackgroundActivity.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(chatBackground2)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final ChatBackgroundViewModel chatBackgroundViewModel = $viewModel;
                        Object obj2 = (Function1) new Function1<ChatBackground, Unit>() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$ChatBackgroundScreen$3$1$3$1$3$1$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(ChatBackground chatBackground3) {
                                invoke2(chatBackground3);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ChatBackground it4) {
                                Intrinsics.checkNotNullParameter(it4, "it");
                                chatBackgroundViewModel.deleteBackground(it4, chatBackground2.getChatId());
                            }
                        };
                        $composer.updateRememberedValue(obj2);
                        objRememberedValue = obj2;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ChatBackgroundActivityKt.BackgroundCard(chatBackground2, (Function1) objRememberedValue, null, $composer, (i >> 3) & 14, 4);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$5$0$2$0$1(ChatBackground $currentBg, final ChatBackgroundViewModel $viewModel, final String $chatId, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C205@7604L42,203@7481L199:ChatBackgroundActivity.kt#btwww5");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-413267842, $changed, -1, "com.yhchat.canarys.ui.background.ChatBackgroundScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatBackgroundActivity.kt:203)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2013399864, "CC(remember):ChatBackgroundActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($chatId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$5$0$2$0$1$0$0($viewModel, $chatId, (ChatBackground) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BackgroundCard($currentBg, (Function1) objRememberedValue, null, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$5$0$2$0$1$0$0(ChatBackgroundViewModel $viewModel, String $chatId, ChatBackground it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.deleteBackground(it, $chatId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$5$0$2$0$3(ChatBackground $globalBg, final ChatBackgroundViewModel $viewModel, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C224@8546L41,222@8424L197:ChatBackgroundActivity.kt#btwww5");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1718213493, $changed, -1, "com.yhchat.canarys.ui.background.ChatBackgroundScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatBackgroundActivity.kt:222)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1935730142, "CC(remember):ChatBackgroundActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ChatBackgroundActivityKt.ChatBackgroundScreen$lambda$5$0$2$0$3$0$0($viewModel, (ChatBackground) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BackgroundCard($globalBg, (Function1) objRememberedValue, null, $composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatBackgroundScreen$lambda$5$0$2$0$3$0$0(ChatBackgroundViewModel $viewModel, ChatBackground it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $viewModel.deleteBackground(it, "all");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BackgroundCard(final ChatBackground background, final Function1<? super ChatBackground, Unit> function1, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier.Companion modifier3;
        Composer $composer3 = $composer.startRestartGroup(1963363758);
        ComposerKt.sourceInformation($composer3, "C(BackgroundCard)N(background,onDelete,modifier)279@10481L38,281@10569L1751,277@10398L1922:ChatBackgroundActivity.kt#btwww5");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(background) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1963363758, $dirty2, -1, "com.yhchat.canarys.ui.background.BackgroundCard (ChatBackgroundActivity.kt:276)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1572237280, true, new Function3() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatBackgroundActivityKt.BackgroundCard$lambda$0(background, function1, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatBackgroundActivityKt.BackgroundCard$lambda$1(background, function1, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BackgroundCard$lambda$0(final ChatBackground $background, final Function1 $onDelete, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C282@10579L1735:ChatBackgroundActivity.kt#btwww5");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1572237280, $changed, -1, "com.yhchat.canarys.ui.background.BackgroundCard.<anonymous> (ChatBackgroundActivity.kt:282)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
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
            ComposerKt.sourceInformationMarkerStart($composer, -1835541549, "C286@10678L271,296@10995L1309:ChatBackgroundActivity.kt#btwww5");
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8($background.getImgUrl(), "\u804a\u5929\u80cc\u666f", SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(150)), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1573296, 0, 4024);
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            int i6 = ((438 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -777040243, "C303@11270L698,316@12023L24,316@12002L288:ChatBackgroundActivity.kt#btwww5");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function03 = constructor3;
                $composer.createNode(function03);
            } else {
                function03 = constructor3;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            int i9 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2007048776, "C306@11488L10,304@11331L256,311@11832L10,312@11900L11,309@11608L342:ChatBackgroundActivity.kt#btwww5");
            TextKt.m3359Text4IGK_g(Intrinsics.areEqual($background.getChatId(), "all") ? "\u5168\u5c40\u80cc\u666f" : "\u804a\u5929ID: " + $background.getChatId(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            TextKt.m3359Text4IGK_g("\u8bbe\u7f6e\u4e8e " + new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()).format(new Date(1000 * $background.getCreateTime())), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 390599282, "CC(remember):ChatBackgroundActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onDelete) | $composer.changed($background);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.background.ChatBackgroundActivityKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatBackgroundActivityKt.BackgroundCard$lambda$0$0$0$1$0($onDelete, $background);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$ChatBackgroundActivityKt.INSTANCE.m10370getLambda$1341446441$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
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
    public static final Unit BackgroundCard$lambda$0$0$0$1$0(Function1 $onDelete, ChatBackground $background) {
        $onDelete.invoke($background);
        return Unit.INSTANCE;
    }
}
