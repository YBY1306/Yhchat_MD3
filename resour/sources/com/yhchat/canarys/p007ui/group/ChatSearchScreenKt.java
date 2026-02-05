package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AttachFileKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.ContentScale;
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
import androidx.compose.p000ui.window.AndroidDialog_androidKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.location.LocationRequestCompat;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.yhchat.canarys.data.model.ChatMessage;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
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
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatSearchScreen.kt */
@Metadata(m168d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u001a+\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u0011\u001a\u001d\u0010\u0012\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010\u0017\u001a\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u000e\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003\u001a#\u0010\u001d\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007\u00a2\u0006\u0002\u0010\u001f\u001a\u0015\u0010 \u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0003\u00a2\u0006\u0002\u0010!\u001a\u0015\u0010\"\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0003\u00a2\u0006\u0002\u0010!\u001a\u0010\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u001aH\u0002\u00a8\u0006%\u00b2\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u000f\u001a\u00020\u0003X\u008a\u008e\u0002"}, m169d2 = {"ChatSearchScreen", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_NAME, "viewModel", "Lcom/yhchat/canarys/ui/group/ChatSearchViewModel;", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;ILjava/lang/String;Lcom/yhchat/canarys/ui/group/ChatSearchViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SearchMessageItem", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "searchQuery", "onClick", "(Lcom/yhchat/canarys/data/model/ChatMessage;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MessageContent", "(Lcom/yhchat/canarys/data/model/ChatMessage;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "highlightSearchQuery", "text", "query", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "formatTime", "timestamp", "", "getMessageTypeName", "type", "MessageDetailDialog", "onDismiss", "(Lcom/yhchat/canarys/data/model/ChatMessage;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MessageDetailContent", "(Lcom/yhchat/canarys/data/model/ChatMessage;Landroidx/compose/runtime/Composer;I)V", "MessageDetailContentView", "formatFileSize", "bytes", "app_debug", "state", "Lcom/yhchat/canarys/ui/group/ChatSearchState;"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class ChatSearchScreenKt {
    public static final Unit ChatSearchScreen$lambda$7(String str, int i, String str2, ChatSearchViewModel chatSearchViewModel, Function0 function0, int i2, Composer composer, int i3) {
        ChatSearchScreen(str, i, str2, chatSearchViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit MessageContent$lambda$11(ChatMessage chatMessage, String str, int i, Composer composer, int i2) {
        MessageContent(chatMessage, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit MessageDetailContent$lambda$1(ChatMessage chatMessage, int i, Composer composer, int i2) {
        MessageDetailContent(chatMessage, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit MessageDetailContentView$lambda$6(ChatMessage chatMessage, int i, Composer composer, int i2) {
        MessageDetailContentView(chatMessage, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit MessageDetailDialog$lambda$1(ChatMessage chatMessage, Function0 function0, int i, Composer composer, int i2) {
        MessageDetailDialog(chatMessage, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit SearchMessageItem$lambda$2(ChatMessage chatMessage, String str, Function0 function0, int i, Composer composer, int i2) {
        SearchMessageItem(chatMessage, str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:441:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0a6b  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x0a7e  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0a8a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ChatSearchScreen(final java.lang.String r132, final int r133, final java.lang.String r134, com.yhchat.canarys.p007ui.group.ChatSearchViewModel r135, final kotlin.jvm.functions.Function0<kotlin.Unit> r136, androidx.compose.runtime.Composer r137, final int r138) {
        /*
            Method dump skipped, instructions count: 4704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.ChatSearchScreenKt.ChatSearchScreen(java.lang.String, int, java.lang.String, com.yhchat.canarys.ui.group.ChatSearchViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final ChatSearchState ChatSearchScreen$lambda$0(State<ChatSearchState> state) {
        return (ChatSearchState) state.getValue();
    }

    public static final String ChatSearchScreen$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit ChatSearchScreen$lambda$5$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C82@3036L226:ChatSearchScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(273601289, $changed, -1, "com.yhchat.canarys.ui.group.ChatSearchScreen.<anonymous>.<anonymous> (ChatSearchScreen.kt:82)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$ChatSearchScreenKt.INSTANCE.getLambda$369434470$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ChatSearchScreen$lambda$5$1(final MutableState $searchQuery$delegate, final String $chatName, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C103@3750L57,109@3947L32,116@4221L492,132@4864L11,133@4942L11,131@4801L178,101@3662L1331:ChatSearchScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1019776623, $changed, -1, "com.yhchat.canarys.ui.group.ChatSearchScreen.<anonymous>.<anonymous> (ChatSearchScreen.kt:101)");
            }
            String strChatSearchScreen$lambda$2 = ChatSearchScreen$lambda$2($searchQuery$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -752787894, "CC(remember):ChatSearchScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ChatSearchScreenKt.ChatSearchScreen$lambda$5$1$0$0($searchQuery$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strChatSearchScreen$lambda$2, (Function1<? super String, Unit>) objRememberedValue, PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(8)), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-55705544, true, new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatSearchScreenKt.ChatSearchScreen$lambda$5$1$1($chatName, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ChatSearchScreenKt.INSTANCE.m11313getLambda$450109383$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-844513222, true, new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatSearchScreenKt.ChatSearchScreen$lambda$5$1$2($searchQuery$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, OutlinedTextFieldDefaults.INSTANCE.m3009colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 0, 0, 0, 0, 3072, 2147477503, 4095), $composer, 918553008, 12582912, 0, 4062328);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ChatSearchScreen$lambda$5$1$0$0(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit ChatSearchScreen$lambda$5$1$1(String $chatName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C109@3949L28:ChatSearchScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-55705544, $changed, -1, "com.yhchat.canarys.ui.group.ChatSearchScreen.<anonymous>.<anonymous>.<anonymous> (ChatSearchScreen.kt:109)");
            }
            TextKt.m3359Text4IGK_g("\u641c\u7d22 " + $chatName + " \u4e2d\u7684\u6d88\u606f...", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ChatSearchScreen$lambda$5$1$2(final MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        Composer $composer2;
        ComposerKt.sourceInformation($composer, "C:ChatSearchScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-844513222, $changed, -1, "com.yhchat.canarys.ui.group.ChatSearchScreen.<anonymous>.<anonymous>.<anonymous> (ChatSearchScreen.kt:117)");
            }
            if (ChatSearchScreen$lambda$2($searchQuery$delegate).length() > 0) {
                $composer.startReplaceGroup(1025088034);
                ComposerKt.sourceInformation($composer, "119@4349L81,118@4299L374");
                ComposerKt.sourceInformationMarkerStart($composer, 171616779, "CC(remember):ChatSearchScreen.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChatSearchScreenKt.ChatSearchScreen$lambda$5$1$2$0$0($searchQuery$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer2 = $composer;
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$ChatSearchScreenKt.INSTANCE.getLambda$2119893554$app_debug(), $composer2, 196614, 30);
            } else {
                $composer2 = $composer;
                $composer2.startReplaceGroup(1020835144);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ChatSearchScreen$lambda$5$1$2$0$0(MutableState $searchQuery$delegate) {
        $searchQuery$delegate.setValue("");
        return Unit.INSTANCE;
    }

    public static final Unit ChatSearchScreen$lambda$5$2$1$0$0$0(ChatSearchViewModel $viewModel, String $chatId, int $chatType, MutableState $searchQuery$delegate) {
        $viewModel.clearError();
        if (!StringsKt.isBlank(ChatSearchScreen$lambda$2($searchQuery$delegate))) {
            ChatSearchViewModel.searchMessages$default($viewModel, $chatId, $chatType, ChatSearchScreen$lambda$2($searchQuery$delegate), false, 8, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit ChatSearchScreen$lambda$5$2$4$0(final State $state$delegate, final ChatSearchViewModel $viewModel, final MutableState $searchQuery$delegate, final String $chatId, final int $chatType, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List searchResults = ChatSearchScreen$lambda$0($state$delegate).getSearchResults();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$ChatSearchScreen$lambda$5$2$4$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((ChatMessage) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(ChatMessage chatMessage) {
                return null;
            }
        };
        LazyColumn.items(searchResults.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$ChatSearchScreen$lambda$5$2$4$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(searchResults.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$ChatSearchScreen$lambda$5$2$4$0$$inlined$items$default$4
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
                final ChatMessage chatMessage = (ChatMessage) searchResults.get(it);
                $composer.startReplaceGroup(-1885205840);
                ComposerKt.sourceInformation($composer, "CN(message)*254@10267L108,251@10096L309:ChatSearchScreen.kt#7hikuq");
                String strChatSearchScreen$lambda$2 = ChatSearchScreenKt.ChatSearchScreen$lambda$2($searchQuery$delegate);
                ComposerKt.sourceInformationMarkerStart($composer, -1446281142, "CC(remember):ChatSearchScreen.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changedInstance(chatMessage);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final ChatSearchViewModel chatSearchViewModel = $viewModel;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$ChatSearchScreen$2$3$5$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            chatSearchViewModel.showMessageDetail(chatMessage);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ChatSearchScreenKt.SearchMessageItem(chatMessage, strChatSearchScreen$lambda$2, (Function0) objRememberedValue, $composer, (i >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (ChatSearchScreen$lambda$0($state$delegate).getHasMoreResults() && !ChatSearchScreen$lambda$0($state$delegate).getSearchResults().isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-841881172, true, new Function3() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatSearchScreenKt.ChatSearchScreen$lambda$5$2$4$0$1($viewModel, $chatId, $chatType, $state$delegate, $searchQuery$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit ChatSearchScreen$lambda$5$2$4$0$1(ChatSearchViewModel $viewModel, String $chatId, int $chatType, State $state$delegate, MutableState $searchQuery$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C:ChatSearchScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-841881172, $changed, -1, "com.yhchat.canarys.ui.group.ChatSearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatSearchScreen.kt:263)");
            }
            if (ChatSearchScreen$lambda$0($state$delegate).isLoadingMore()) {
                $composer.startReplaceGroup(2127087928);
                ComposerKt.sourceInformation($composer, "264@10710L438");
                Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
                Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                    composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                    composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
                }
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i2 = (i >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i3 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 799728382, "C270@11052L58:ChatSearchScreen.kt#7hikuq");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, 0.0f, 0L, 0, $composer, 6, 30);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(2127595832);
                ComposerKt.sourceInformation($composer, "275@11400L136,275@11364L172");
                Long lValueOf = Long.valueOf(ChatSearchScreen$lambda$0($state$delegate).getLastTimestamp());
                ComposerKt.sourceInformationMarkerStart($composer, -1593929324, "CC(remember):ChatSearchScreen.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($chatId) | $composer.changed($chatType);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = (Function2) new ChatSearchScreenKt$ChatSearchScreen$2$3$5$1$2$2$1($viewModel, $chatId, $chatType, $searchQuery$delegate, null);
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                EffectsKt.LaunchedEffect(lValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer, 0);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ChatSearchScreen$lambda$6$0$0(ChatSearchViewModel $viewModel) {
        $viewModel.hideMessageDetail();
        return Unit.INSTANCE;
    }

    public static final void SearchMessageItem(final ChatMessage message, final String searchQuery, final Function0<Unit> onClick, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(1939532152);
        ComposerKt.sourceInformation($composer3, "C(SearchMessageItem)N(message,searchQuery,onClick)305@12100L13,306@12148L38,307@12193L2208,302@12015L2386:ChatSearchScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(message) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(searchQuery) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1939532152, $dirty2, -1, "com.yhchat.canarys.ui.group.SearchMessageItem (ChatSearchScreen.kt:301)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -125402267, "CC(remember):ChatSearchScreen.kt#9igjgp");
            boolean z = ($dirty2 & 896) == 256;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatSearchScreenKt.SearchMessageItem$lambda$0$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1848300998, true, new Function3() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ChatSearchScreenKt.SearchMessageItem$lambda$1(message, searchQuery, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatSearchScreenKt.SearchMessageItem$lambda$2(message, searchQuery, onClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit SearchMessageItem$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit SearchMessageItem$lambda$1(com.yhchat.canarys.data.model.ChatMessage r99, java.lang.String r100, androidx.compose.foundation.layout.ColumnScope r101, androidx.compose.runtime.Composer r102, int r103) {
        /*
            Method dump skipped, instructions count: 1401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.ChatSearchScreenKt.SearchMessageItem$lambda$1(com.yhchat.canarys.data.model.ChatMessage, java.lang.String, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:338:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x142b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void MessageContent(final com.yhchat.canarys.data.model.ChatMessage r59, final java.lang.String r60, androidx.compose.runtime.Composer r61, final int r62) {
        /*
            Method dump skipped, instructions count: 5334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.ChatSearchScreenKt.MessageContent(com.yhchat.canarys.data.model.ChatMessage, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    public static final String highlightSearchQuery(String text, String query, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(query, "query");
        ComposerKt.sourceInformationMarkerStart($composer, 1458607403, "C(highlightSearchQuery)N(text,query):ChatSearchScreen.kt#7hikuq");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1458607403, $changed, -1, "com.yhchat.canarys.ui.group.highlightSearchQuery (ChatSearchScreen.kt:604)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        return text;
    }

    public static final String formatTime(long timestamp) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault());
        String str = sdf.format(new Date(timestamp));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0096 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String getMessageTypeName(java.lang.String r1) {
        /*
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 49: goto L89;
                case 50: goto L7d;
                case 51: goto L71;
                case 52: goto L65;
                case 53: goto L59;
                case 54: goto L4d;
                case 55: goto L41;
                case 56: goto L35;
                case 57: goto L28;
                case 1567: goto L1b;
                case 1568: goto Le;
                default: goto Lc;
            }
        Lc:
            goto L96
        Le:
            java.lang.String r0 = "11"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L17
            goto Lc
        L17:
            java.lang.String r0 = "\u8bed\u97f3"
            goto L98
        L1b:
            java.lang.String r0 = "10"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L24
            goto Lc
        L24:
            java.lang.String r0 = "\u89c6\u9891"
            goto L98
        L28:
            java.lang.String r0 = "9"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L31
            goto Lc
        L31:
            java.lang.String r0 = "\u7cfb\u7edf\u63d0\u793a"
            goto L98
        L35:
            java.lang.String r0 = "8"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L3e
            goto Lc
        L3e:
            java.lang.String r0 = "HTML"
            goto L98
        L41:
            java.lang.String r0 = "7"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4a
            goto Lc
        L4a:
            java.lang.String r0 = "\u8868\u60c5\u5305"
            goto L98
        L4d:
            java.lang.String r0 = "6"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L56
            goto Lc
        L56:
            java.lang.String r0 = "\u6587\u7ae0"
            goto L98
        L59:
            java.lang.String r0 = "5"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L62
            goto Lc
        L62:
            java.lang.String r0 = "\u8868\u5355"
            goto L98
        L65:
            java.lang.String r0 = "4"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L6e
            goto Lc
        L6e:
            java.lang.String r0 = "\u6587\u4ef6"
            goto L98
        L71:
            java.lang.String r0 = "3"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7a
            goto Lc
        L7a:
            java.lang.String r0 = "Markdown"
            goto L98
        L7d:
            java.lang.String r0 = "2"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L86
            goto Lc
        L86:
            java.lang.String r0 = "\u56fe\u7247"
            goto L98
        L89:
            java.lang.String r0 = "1"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L93
            goto Lc
        L93:
            java.lang.String r0 = "\u6587\u672c"
            goto L98
        L96:
            java.lang.String r0 = "\u6d88\u606f"
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.ChatSearchScreenKt.getMessageTypeName(java.lang.String):java.lang.String");
    }

    public static final void MessageDetailDialog(final ChatMessage message, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        final Function0 onDismiss2;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(1020965439);
        ComposerKt.sourceInformation($composer2, "C(MessageDetailDialog)N(message,onDismiss)636@23873L1350,636@23836L1387:ChatSearchScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(message) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 32 : 16;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            onDismiss2 = onDismiss;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020965439, $dirty, -1, "com.yhchat.canarys.ui.group.MessageDetailDialog (ChatSearchScreen.kt:635)");
            }
            onDismiss2 = onDismiss;
            AndroidDialog_androidKt.Dialog(onDismiss2, null, ComposableLambdaKt.rememberComposableLambda(-597520234, true, new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatSearchScreenKt.MessageDetailDialog$lambda$0(message, onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 3) & 14) | 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatSearchScreenKt.MessageDetailDialog$lambda$1(message, onDismiss2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit MessageDetailDialog$lambda$0(final ChatMessage $message, final Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C642@24075L38,643@24124L1093,637@23883L1334:ChatSearchScreen.kt#7hikuq");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-597520234, $changed, -1, "com.yhchat.canarys.ui.group.MessageDetailDialog.<anonymous> (ChatSearchScreen.kt:637)");
            }
            CardKt.Card(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(8), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-760327800, true, new Function3() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatSearchScreenKt.MessageDetailDialog$lambda$0$0($message, $onDismiss, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 20);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit MessageDetailDialog$lambda$0$0(ChatMessage $message, Function0 $onDismiss, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C644@24138L1069:ChatSearchScreen.kt#7hikuq");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-760327800, $changed, -1, "com.yhchat.canarys.ui.group.MessageDetailDialog.<anonymous>.<anonymous> (ChatSearchScreen.kt:644)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -451309775, "C650@24309L694,668@25037L41,671@25154L39:ChatSearchScreen.kt#7hikuq");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 906382507, "C657@24638L10,655@24547L189,660@24757L228:ChatSearchScreen.kt#7hikuq");
            TextKt.m3359Text4IGK_g("\u6d88\u606f\u8be6\u60c5", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196614, 0, 65502);
            IconButtonKt.IconButton($onDismiss, null, false, null, null, ComposableSingletons$ChatSearchScreenKt.INSTANCE.m11311getLambda$1024461569$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            MessageDetailContent($message, $composer, 0);
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

    private static final void MessageDetailContent(final ChatMessage message, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Composer $composer3 = $composer.startRestartGroup(1170234960);
        ComposerKt.sourceInformation($composer3, "C(MessageDetailContent)N(message)679@25327L7,681@25344L2202:ChatSearchScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(message) ? 4 : 2;
        }
        if (!$composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1170234960, $dirty, -1, "com.yhchat.canarys.ui.group.MessageDetailContent (ChatSearchScreen.kt:678)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context = (Context) objConsume;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, Alignment.INSTANCE.getTop(), $composer3, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            $composer2 = $composer3;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function0 = constructor;
                $composer3.createNode(function0);
            } else {
                function0 = constructor;
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
            int i3 = ((54 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -1730336412, "C686@25473L424,699@25915L40,701@25973L1567:ChatSearchScreen.kt#7hikuq");
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(new ImageRequest.Builder(context).data(message.getSender().getAvatarUrl()).addHeader("Referer", "https://myapp.jwznb.com").crossfade(true).build(), "\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer3, 1572912, 0, 4024);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer3, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierWeight$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function02 = constructor2;
                $composer3.createNode(function02);
            } else {
                function02 = constructor2;
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -337005416, "C705@26069L734,724@26829L40,735@27233L11,737@27306L224,727@26915L615:ChatSearchScreen.kt#7hikuq");
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer3, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default2);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function03 = constructor3;
                $composer3.createNode(function03);
            } else {
                function03 = constructor3;
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i9 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -584132613, "C712@26383L10,714@26500L11,710@26287L252,719@26678L10,720@26743L11,717@26573L216:ChatSearchScreen.kt#7hikuq");
            TextKt.m3359Text4IGK_g(message.getSender().getName(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getTitleSmall(), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65498);
            TextKt.m3359Text4IGK_g(formatTime(message.getSendTime()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getLabelSmall(), $composer3, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer3, 6);
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), RoundedCornerShapeKt.m1415RoundedCornerShapea9UjIt4(C1834Dp.m7806constructorimpl(4), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, C1834Dp.m7806constructorimpl(2), 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1895359429, true, new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatSearchScreenKt.MessageDetailContent$lambda$0$0$1(message, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), $composer3, 12607494, LocationRequestCompat.QUALITY_LOW_POWER);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatSearchScreenKt.MessageDetailContent$lambda$1(message, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MessageDetailContent$lambda$0$0$1(com.yhchat.canarys.data.model.ChatMessage r26, androidx.compose.runtime.Composer r27, int r28) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.ChatSearchScreenKt.MessageDetailContent$lambda$0$0$1(com.yhchat.canarys.data.model.ChatMessage, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final void MessageDetailContentView(final ChatMessage message, Composer $composer, final int $changed) {
        String str;
        int i;
        long textColor;
        Function0 function0;
        Function0 function02;
        Composer $composer2 = $composer.startRestartGroup(629298005);
        ComposerKt.sourceInformation($composer2, "C(MessageDetailContentView)N(message)751@27657L11:ChatSearchScreen.kt#7hikuq");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(message) ? 4 : 2;
        }
        if ($composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(629298005, $dirty, -1, "com.yhchat.canarys.ui.group.MessageDetailContentView (ChatSearchScreen.kt:750)");
            }
            long textColor2 = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface();
            Unit unit = null;
            switch (message.getContentType()) {
                case 1:
                    $composer2.startReplaceGroup(-115159518);
                    ComposerKt.sourceInformation($composer2, "");
                    String text = message.getContent().getText();
                    if (text == null) {
                        $composer2.startReplaceGroup(-115159519);
                        $composer2.endReplaceGroup();
                    } else {
                        $composer2.startReplaceGroup(-115159518);
                        ComposerKt.sourceInformation($composer2, "*760@27936L10,757@27816L159");
                        TextKt.m3359Text4IGK_g(text, (Modifier) null, textColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, 0, 0, 65530);
                        $composer2 = $composer2;
                        Unit unit2 = Unit.INSTANCE;
                        $composer2.endReplaceGroup();
                        Unit unit3 = Unit.INSTANCE;
                    }
                    $composer2.endReplaceGroup();
                    break;
                case 2:
                    $composer2.startReplaceGroup(-114908976);
                    ComposerKt.sourceInformation($composer2, "");
                    String imageUrl = message.getContent().getImageUrl();
                    if (imageUrl == null) {
                        $composer2.startReplaceGroup(-114863345);
                        $composer2.endReplaceGroup();
                        str = "";
                        i = 6;
                    } else {
                        $composer2.startReplaceGroup(-114863344);
                        ComposerKt.sourceInformation($composer2, "*768@28181L7,767@28107L525");
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object objConsume = $composer2.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        str = "";
                        i = 6;
                        SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(new ImageRequest.Builder((Context) objConsume).data(imageUrl).addHeader("Referer", "https://myapp.jwznb.com").crossfade(true).build(), "\u56fe\u7247", ClipKt.clip(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(8))), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer2, 1572912, 0, 4024);
                        Unit unit4 = Unit.INSTANCE;
                        $composer2.endReplaceGroup();
                        Unit unit5 = Unit.INSTANCE;
                    }
                    String text2 = message.getContent().getText();
                    if (text2 == null) {
                        $composer2.startReplaceGroup(-114267339);
                        $composer2.endReplaceGroup();
                        textColor = textColor2;
                    } else {
                        $composer2.startReplaceGroup(-114267338);
                        ComposerKt.sourceInformation($composer2, str);
                        if (StringsKt.isBlank(text2)) {
                            textColor = textColor2;
                            $composer2.startReplaceGroup(-1203256409);
                        } else {
                            $composer2.startReplaceGroup(-1174742733);
                            ComposerKt.sourceInformation($composer2, "782@28756L40,786@28949L10,783@28817L175");
                            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer2, i);
                            textColor = textColor2;
                            TextKt.m3359Text4IGK_g(text2, (Modifier) null, textColor, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, 0, 0, 65530);
                            $composer2 = $composer2;
                        }
                        $composer2.endReplaceGroup();
                        Unit unit6 = Unit.INSTANCE;
                        $composer2.endReplaceGroup();
                        Unit unit7 = Unit.INSTANCE;
                    }
                    $composer2.endReplaceGroup();
                    break;
                case 3:
                case 5:
                case 6:
                default:
                    $composer2.startReplaceGroup(-111944911);
                    ComposerKt.sourceInformation($composer2, "");
                    String text3 = message.getContent().getText();
                    if (text3 == null) {
                        $composer2.startReplaceGroup(-111930559);
                        $composer2.endReplaceGroup();
                    } else {
                        $composer2.startReplaceGroup(-111930558);
                        ComposerKt.sourceInformation($composer2, "*845@31191L10,842@31071L159");
                        TextKt.m3359Text4IGK_g(text3, (Modifier) null, textColor2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, 0, 0, 65530);
                        $composer2 = $composer2;
                        Unit unit8 = Unit.INSTANCE;
                        $composer2.endReplaceGroup();
                        unit = Unit.INSTANCE;
                    }
                    if (unit == null) {
                        $composer2.startReplaceGroup(-834888020);
                        ComposerKt.sourceInformation($composer2, "850@31428L10,847@31248L215");
                        Composer $composer3 = $composer2;
                        TextKt.m3359Text4IGK_g("[" + getMessageTypeName(String.valueOf(message.getContentType())) + "]", (Modifier) null, Color.m5055copywmQWz5c(textColor2, (14 & 1) != 0 ? Color.m5059getAlphaimpl(textColor2) : 0.7f, (14 & 2) != 0 ? Color.m5063getRedimpl(textColor2) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(textColor2) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(textColor2) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer3, 0, 0, 65530);
                        $composer2 = $composer3;
                        $composer2.endReplaceGroup();
                    } else {
                        $composer2.startReplaceGroup(-834895119);
                        $composer2.endReplaceGroup();
                    }
                    $composer2.endReplaceGroup();
                    Unit unit9 = Unit.INSTANCE;
                    break;
                case 4:
                    $composer2.startReplaceGroup(-113817373);
                    ComposerKt.sourceInformation($composer2, "");
                    String fileName = message.getContent().getFileName();
                    if (fileName == null) {
                        $composer2.startReplaceGroup(-113817374);
                        $composer2.endReplaceGroup();
                    } else {
                        $composer2.startReplaceGroup(-113817373);
                        ComposerKt.sourceInformation($composer2, "*794@29142L1146");
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                        Modifier modifier = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifier);
                        Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                        int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                        Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                            composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                            composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
                        }
                        Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        int i3 = (i2 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i4 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -2104562892, "C800@29420L11,797@29254L264,803@29539L39,804@29599L671:ChatSearchScreen.kt#7hikuq");
                        IconKt.m2816Iconww6aTOc(AttachFileKt.getAttachFile(Icons.INSTANCE.getDefault()), "\u6587\u4ef6", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary(), $composer2, 432, 0);
                        SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer2, 6);
                        ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        Modifier modifier2 = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                        ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
                        CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifier2);
                        Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                        int i6 = (i5 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        int i7 = ((0 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer2, -818688114, "C808@29780L10,805@29632L255:ChatSearchScreen.kt#7hikuq");
                        TextKt.m3359Text4IGK_g(fileName, (Modifier) null, textColor2, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65498);
                        Long fileSize = message.getContent().getFileSize();
                        if (fileSize == null) {
                            $composer2.startReplaceGroup(-818394050);
                            $composer2.endReplaceGroup();
                            textColor2 = textColor2;
                        } else {
                            $composer2.startReplaceGroup(-818394049);
                            ComposerKt.sourceInformation($composer2, "*815@30171L10,812@29980L242");
                            String fileSize2 = formatFileSize(fileSize.longValue());
                            long jM5055copywmQWz5c = Color.m5055copywmQWz5c(textColor2, (14 & 1) != 0 ? Color.m5059getAlphaimpl(textColor2) : 0.7f, (14 & 2) != 0 ? Color.m5063getRedimpl(textColor2) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(textColor2) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(textColor2) : 0.0f);
                            textColor2 = textColor2;
                            TextKt.m3359Text4IGK_g(fileSize2, (Modifier) null, jM5055copywmQWz5c, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getLabelSmall(), $composer2, 0, 0, 65530);
                            Unit unit10 = Unit.INSTANCE;
                            $composer2.endReplaceGroup();
                            Unit unit11 = Unit.INSTANCE;
                        }
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
                        Unit unit12 = Unit.INSTANCE;
                        $composer2.endReplaceGroup();
                        Unit unit13 = Unit.INSTANCE;
                    }
                    $composer2.endReplaceGroup();
                    break;
                case 7:
                    $composer2.startReplaceGroup(-112568941);
                    ComposerKt.sourceInformation($composer2, "");
                    String imageUrl2 = message.getContent().getImageUrl();
                    if (imageUrl2 == null) {
                        $composer2.startReplaceGroup(-112568942);
                        $composer2.endReplaceGroup();
                    } else {
                        $composer2.startReplaceGroup(-112568941);
                        ComposerKt.sourceInformation($composer2, "*826@30494L7,825@30420L522");
                        ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object objConsume2 = $composer2.consume(localContext2);
                        ComposerKt.sourceInformationMarkerEnd($composer2);
                        SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(new ImageRequest.Builder((Context) objConsume2).data(imageUrl2).addHeader("Referer", "https://myapp.jwznb.com").crossfade(true).build(), "\u8868\u60c5", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(120)), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(8))), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, null, $composer2, 1572912, 0, 4024);
                        Unit unit14 = Unit.INSTANCE;
                        $composer2.endReplaceGroup();
                        Unit unit15 = Unit.INSTANCE;
                    }
                    $composer2.endReplaceGroup();
                    break;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.group.ChatSearchScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatSearchScreenKt.MessageDetailContentView$lambda$6(message, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String formatFileSize(long bytes) {
        double kb = bytes / 1024.0d;
        double mb = kb / 1024.0d;
        double gb = mb / 1024.0d;
        if (gb >= 1.0d) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.1f GB", Arrays.copyOf(new Object[]{Double.valueOf(gb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (mb >= 1.0d) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(mb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (kb >= 1.0d) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format("%.1f KB", Arrays.copyOf(new Object[]{Double.valueOf(kb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
        return bytes + " B";
    }
}
