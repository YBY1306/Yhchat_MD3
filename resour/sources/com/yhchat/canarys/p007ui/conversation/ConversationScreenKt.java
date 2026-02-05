package com.yhchat.canarys.p007ui.conversation;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.internal.CalendarModelKt;
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
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.journeyapps.barcodescanner.ScanIntentResult;
import com.journeyapps.barcodescanner.ScanOptions;
import com.yhchat.canarys.data.model.ChatType;
import com.yhchat.canarys.data.model.Conversation;
import com.yhchat.canarys.data.model.StickyData;
import com.yhchat.canarys.data.model.StickyItem;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.chat.ChatActivity;
import com.yhchat.canarys.p007ui.conversation.ConversationViewModel;
import com.yhchat.canarys.p007ui.create.CreateActivity;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.p007ui.search.ComprehensiveSearchActivity;
import com.yhchat.canarys.utils.UnifiedLinkHandler;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConversationScreen.kt */
@Metadata(m168d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u001ay\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u00a2\u0006\u0002\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a2\u0006\u0002\u0010\u0016\u001a1\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007\u00a2\u0006\u0002\u0010\u001c\u001a\u0015\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u001f\u001a=\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u00a2\u0006\u0002\u0010#\u001a=\u0010$\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u00a2\u0006\u0002\u0010#\u00a8\u0006%\u00b2\u0006\n\u0010&\u001a\u00020'X\u008a\u0084\u0002\u00b2\u0006\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190)X\u008a\u0084\u0002\u00b2\u0006\f\u0010*\u001a\u0004\u0018\u00010+X\u008a\u0084\u0002\u00b2\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002\u00b2\u0006\n\u0010.\u001a\u00020-X\u008a\u008e\u0002\u00b2\u0006\n\u0010/\u001a\u00020-X\u008a\u008e\u0002\u00b2\u0006\n\u00100\u001a\u00020-X\u008a\u008e\u0002\u00b2\u0006\f\u00101\u001a\u0004\u0018\u00010\u0019X\u008a\u008e\u0002\u00b2\u0006\n\u00102\u001a\u00020-X\u008a\u008e\u0002\u00b2\u0006\n\u00103\u001a\u00020-X\u008a\u008e\u0002\u00b2\u0006\n\u00104\u001a\u00020-X\u008a\u008e\u0002\u00b2\u0006\u0010\u00105\u001a\b\u0012\u0004\u0012\u00020\u00190)X\u008a\u0084\u0002"}, m169d2 = {"ConversationScreen", "", "token", "", "userId", "onConversationClick", "Lkotlin/Function3;", "", "onSearchClick", "Lkotlin/Function0;", "onMenuClick", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "viewModel", "Lcom/yhchat/canarys/ui/conversation/ConversationViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/ui/conversation/ConversationViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AddMenuBottomSheetContent", "onAddUserGroupBot", "onCreateGroupBot", "onScan", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ConversationItem", "conversation", "Lcom/yhchat/canarys/data/model/Conversation;", "onClick", "onLongClick", "(Lcom/yhchat/canarys/data/model/Conversation;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ChatTypeIcon", ChatSearchActivity.EXTRA_CHAT_TYPE, "(ILandroidx/compose/runtime/Composer;I)V", "StickyConversationCard", "stickyItem", "Lcom/yhchat/canarys/data/model/StickyItem;", "(Lcom/yhchat/canarys/data/model/StickyItem;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "IntegratedStickyItem", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/conversation/ConversationViewModel$ConversationUiState;", "conversations", "", "stickyData", "Lcom/yhchat/canarys/data/model/StickyData;", "stickyLoading", "", "showStickyConversations", "refreshing", "showConversationMenu", "selectedConversation", "isSelectedConversationSticky", "showAddMenuBottomSheet", "showScanMethodDialog", "pagedConversations"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class ConversationScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AddMenuBottomSheetContent$lambda$1(Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        AddMenuBottomSheetContent(function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatTypeIcon$lambda$0(int i, int i2, Composer composer, int i3) {
        ChatTypeIcon(i, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationItem$lambda$1(Conversation conversation, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ConversationItem(conversation, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$43(String str, String str2, Function3 function3, Function0 function0, Function0 function02, TokenRepository tokenRepository, ConversationViewModel conversationViewModel, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConversationScreen(str, str2, function3, function0, function02, tokenRepository, conversationViewModel, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntegratedStickyItem$lambda$2(StickyItem stickyItem, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        IntegratedStickyItem(stickyItem, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyConversationCard$lambda$3(StickyItem stickyItem, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        StickyConversationCard(stickyItem, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0725  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x08c5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0a38  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0ac3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0b51  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0b65  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ConversationScreen(final java.lang.String r75, final java.lang.String r76, final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.Integer, ? super java.lang.String, kotlin.Unit> r77, final kotlin.jvm.functions.Function0<kotlin.Unit> r78, final kotlin.jvm.functions.Function0<kotlin.Unit> r79, com.yhchat.canarys.data.repository.TokenRepository r80, com.yhchat.canarys.p007ui.conversation.ConversationViewModel r81, androidx.compose.p000ui.Modifier r82, androidx.compose.runtime.Composer r83, final int r84, final int r85) {
        /*
            Method dump skipped, instructions count: 2964
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.conversation.ConversationScreenKt.ConversationScreen(java.lang.String, java.lang.String, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.yhchat.canarys.data.repository.TokenRepository, com.yhchat.canarys.ui.conversation.ConversationViewModel, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConversationViewModel.ConversationUiState ConversationScreen$lambda$0(State<ConversationViewModel.ConversationUiState> state) {
        return (ConversationViewModel.ConversationUiState) state.getValue();
    }

    private static final List<Conversation> ConversationScreen$lambda$1(State<? extends List<Conversation>> state) {
        return (List) state.getValue();
    }

    private static final StickyData ConversationScreen$lambda$2(State<StickyData> state) {
        return (StickyData) state.getValue();
    }

    private static final boolean ConversationScreen$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ConversationScreen$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ConversationScreen$lambda$8$0(final SharedPreferences $prefs, final MutableState $showStickyConversations$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final SharedPreferences.OnSharedPreferenceChangeListener listener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda7
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                ConversationScreenKt.ConversationScreen$lambda$8$0$0($prefs, $showStickyConversations$delegate, sharedPreferences, str);
            }
        };
        $prefs.registerOnSharedPreferenceChangeListener(listener);
        return new DisposableEffectResult() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$lambda$8$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                $prefs.unregisterOnSharedPreferenceChangeListener(listener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void ConversationScreen$lambda$8$0$0(SharedPreferences $prefs, MutableState $showStickyConversations$delegate, SharedPreferences sharedPreferences, String key) {
        if (key != null) {
            switch (key.hashCode()) {
                case 482974844:
                    if (key.equals("show_sticky_conversations")) {
                        ConversationScreen$lambda$7($showStickyConversations$delegate, $prefs.getBoolean("show_sticky_conversations", true));
                        break;
                    }
                    break;
            }
        }
    }

    private static final boolean ConversationScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConversationScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ConversationScreen$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConversationScreen$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Conversation ConversationScreen$lambda$16(MutableState<Conversation> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ConversationScreen$lambda$19(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConversationScreen$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ConversationScreen$lambda$22(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ConversationScreen$lambda$23(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$24$0(Context $context, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() > 0) {
            if (UnifiedLinkHandler.INSTANCE.isHandleableLink(text)) {
                UnifiedLinkHandler.INSTANCE.handleLink($context, text);
            } else {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(text));
                    $context.startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText($context, "\u65e0\u6cd5\u8bc6\u522b\u7684\u5185\u5bb9: " + text, 0).show();
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$25$0(Function1 $handleScanResult, ScanIntentResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getContents() != null) {
            String contents = result.getContents();
            Intrinsics.checkNotNullExpressionValue(contents, "getContents(...)");
            $handleScanResult.invoke(contents);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$26$0(CoroutineScope $coroutineScope, Context $context, Function1 $handleScanResult, Uri uri) {
        if (uri != null) {
            BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new ConversationScreenKt$ConversationScreen$galleryLauncher$1$1$1($context, uri, $handleScanResult, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    private static final boolean ConversationScreen$lambda$28(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ConversationScreen$lambda$29(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$34$0(Function0 $onSearchClick, final MutableState $showAddMenuBottomSheet$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C222@8022L69,222@8001L266,230@8284L213:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(400160221, $changed, -1, "com.yhchat.canarys.ui.conversation.ConversationScreen.<anonymous>.<anonymous> (ConversationScreen.kt:222)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1993082942, "CC(remember):ConversationScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationScreenKt.ConversationScreen$lambda$34$0$0$0($showAddMenuBottomSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$ConversationScreenKt.INSTANCE.m11138getLambda$372731424$app_debug(), $composer, 196614, 30);
            IconButtonKt.IconButton($onSearchClick, null, false, null, null, ComposableSingletons$ConversationScreenKt.INSTANCE.m11135getLambda$1647130487$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$34$0$0$0(MutableState $showAddMenuBottomSheet$delegate) {
        ConversationScreen$lambda$23($showAddMenuBottomSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$34$1$0(String $error, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C252@9053L11,250@8971L184:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(102622919, $changed, -1, "com.yhchat.canarys.ui.conversation.ConversationScreen.<anonymous>.<anonymous>.<anonymous> (ConversationScreen.kt:250)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 48, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$34$2$0(ConversationViewModel $viewModel, String $token, CoroutineScope $coroutineScope, MutableState $refreshing$delegate) {
        ConversationScreen$lambda$11($refreshing$delegate, true);
        $viewModel.loadConversations($token);
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new ConversationScreenKt$ConversationScreen$5$3$1$1($refreshing$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$34$3(final ConversationViewModel $viewModel, LazyListState $listState, final State $stickyData$delegate, final Function3 $onConversationClick, final CoroutineScope $coroutineScope, final Context $context, final State $uiState$delegate, final MutableState $showStickyConversations$delegate, final MutableState $selectedConversation$delegate, final MutableState $isSelectedConversationSticky$delegate, final MutableState $showConversationMenu$delegate, Composer $composer, int $changed) {
        String str;
        State pagedConversations$delegate;
        Function0 function0;
        Composer composer;
        ComposerKt.sourceInformation($composer, "C:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1086570313, $changed, -1, "com.yhchat.canarys.ui.conversation.ConversationScreen.<anonymous>.<anonymous> (ConversationScreen.kt:274)");
            }
            if (ConversationScreen$lambda$0($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(1152359298);
                ComposerKt.sourceInformation($composer, "275@9725L201");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
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
                if (composerM4376constructorimpl.getInserting()) {
                    composer = $composer;
                } else {
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i2 = (i >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i3 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1150735278, "C279@9881L27:ConversationScreen.kt#d8f7o0");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer2, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer.endReplaceGroup();
                }
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i22 = (i >> 6) & 14;
                Composer composer22 = composer;
                ComposerKt.sourceInformationMarkerStart(composer22, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i32 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer22, -1150735278, "C279@9881L27:ConversationScreen.kt#d8f7o0");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer22, 0, 31);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1152833877);
                ComposerKt.sourceInformation($composer, "282@10019L16,288@10261L7091,284@10069L7283,414@17443L383,414@17397L429");
                final State pagedConversations$delegate2 = SnapshotStateKt.collectAsState($viewModel.getPagedConversations(), null, $composer, 0, 1);
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues paddingValuesM1045PaddingValuesYgX7TsA$default = PaddingKt.m1045PaddingValuesYgX7TsA$default(0.0f, C1834Dp.m7806constructorimpl(8), 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, -516991862, "CC(remember):ConversationScreen.kt#9igjgp");
                boolean zChanged = $composer.changed($stickyData$delegate) | $composer.changedInstance($viewModel) | $composer.changed($onConversationClick) | $composer.changedInstance($coroutineScope) | $composer.changed(pagedConversations$delegate2) | $composer.changedInstance($context) | $composer.changed($uiState$delegate);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    str = "CC(remember):ConversationScreen.kt#9igjgp";
                    objRememberedValue = new Function1() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda30
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ConversationScreenKt.ConversationScreen$lambda$34$3$2$0($showStickyConversations$delegate, $stickyData$delegate, $viewModel, $onConversationClick, $coroutineScope, $selectedConversation$delegate, $isSelectedConversationSticky$delegate, $showConversationMenu$delegate, pagedConversations$delegate2, $context, $uiState$delegate, (LazyListScope) obj);
                        }
                    };
                    pagedConversations$delegate = pagedConversations$delegate2;
                    $composer.updateRememberedValue(objRememberedValue);
                } else {
                    str = "CC(remember):ConversationScreen.kt#9igjgp";
                    pagedConversations$delegate = pagedConversations$delegate2;
                }
                Function1 function1 = (Function1) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                State pagedConversations$delegate3 = pagedConversations$delegate;
                LazyDslKt.LazyColumn(modifierFillMaxSize$default2, $listState, paddingValuesM1045PaddingValuesYgX7TsA$default, false, null, null, null, false, null, function1, $composer, 390, 504);
                List<Conversation> listConversationScreen$lambda$34$3$1 = ConversationScreen$lambda$34$3$1(pagedConversations$delegate3);
                ComposerKt.sourceInformationMarkerStart($composer, -516768746, str);
                boolean zChanged2 = $composer.changed($listState) | $composer.changed(pagedConversations$delegate3) | $composer.changed($uiState$delegate) | $composer.changedInstance($viewModel);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj = (Function2) new ConversationScreenKt$ConversationScreen$5$4$3$1($listState, $viewModel, pagedConversations$delegate3, $uiState$delegate, null);
                    $composer.updateRememberedValue(obj);
                    objRememberedValue2 = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                EffectsKt.LaunchedEffect(listConversationScreen$lambda$34$3$1, $listState, (Function2) objRememberedValue2, $composer, 0);
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
    public static final List<Conversation> ConversationScreen$lambda$34$3$1(State<? extends List<Conversation>> state) {
        return (List) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$34$3$2$0(MutableState $showStickyConversations$delegate, final State $stickyData$delegate, final ConversationViewModel $viewModel, final Function3 $onConversationClick, final CoroutineScope $coroutineScope, final MutableState $selectedConversation$delegate, final MutableState $isSelectedConversationSticky$delegate, final MutableState $showConversationMenu$delegate, State $pagedConversations$delegate, final Context $context, State $uiState$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (ConversationScreen$lambda$6($showStickyConversations$delegate)) {
            StickyData stickyDataConversationScreen$lambda$2 = ConversationScreen$lambda$2($stickyData$delegate);
            List<StickyItem> sticky = stickyDataConversationScreen$lambda$2 != null ? stickyDataConversationScreen$lambda$2.getSticky() : null;
            if (!(sticky == null || sticky.isEmpty())) {
                LazyListScope.item$default(LazyColumn, "sticky_conversations_section", null, ComposableLambdaKt.composableLambdaInstance(-1373704349, true, new Function3() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ConversationScreenKt.ConversationScreen$lambda$34$3$2$0$0($stickyData$delegate, $viewModel, $onConversationClick, $coroutineScope, $selectedConversation$delegate, $isSelectedConversationSticky$delegate, $showConversationMenu$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 2, null);
            }
        }
        final List listConversationScreen$lambda$34$3$1 = ConversationScreen$lambda$34$3$1($pagedConversations$delegate);
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$34$3$2$0$1((Conversation) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$lambda$34$3$2$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((Conversation) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(Conversation conversation) {
                return null;
            }
        };
        LazyColumn.items(listConversationScreen$lambda$34$3$1.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$lambda$34$3$2$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(listConversationScreen$lambda$34$3$1.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$lambda$34$3$2$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke(listConversationScreen$lambda$34$3$1.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$lambda$34$3$2$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Composer composer;
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
                final Conversation conversation = (Conversation) listConversationScreen$lambda$34$3$1.get(it);
                $composer.startReplaceGroup(1158199086);
                ComposerKt.sourceInformation($composer, "CN(conversation)*362@14678L921,376@15643L372,360@14565L1476:ConversationScreen.kt#d8f7o0");
                final String chatId = conversation.getChatId();
                final int chatType = conversation.getChatType();
                final String name = conversation.getName();
                ComposerKt.sourceInformationMarkerStart($composer, 314465186, "CC(remember):ConversationScreen.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | $composer.changedInstance($viewModel) | $composer.changed(chatId) | $composer.changed(chatType) | $composer.changed(name);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final ConversationViewModel conversationViewModel = $viewModel;
                    final Context context = $context;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$2$1$3$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            conversationViewModel.markConversationAsRead(chatId, chatType);
                            Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
                            intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, chatId);
                            intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, chatType);
                            intent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, name);
                            intent.setFlags(603979776);
                            context.startActivity(intent);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 314495517, "CC(remember):ConversationScreen.kt#9igjgp");
                boolean zChangedInstance2 = $composer.changedInstance($coroutineScope) | ((((i & 112) ^ 48) > 32 && $composer.changed(conversation)) || (i & 48) == 32) | $composer.changedInstance($viewModel);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final CoroutineScope coroutineScope = $coroutineScope;
                    final MutableState mutableState = $selectedConversation$delegate;
                    final ConversationViewModel conversationViewModel2 = $viewModel;
                    final MutableState mutableState2 = $isSelectedConversationSticky$delegate;
                    final MutableState mutableState3 = $showConversationMenu$delegate;
                    composer = $composer;
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$2$1$3$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* compiled from: ConversationScreen.kt */
                        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                        @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$2$1$3$2$1$1", m185f = "ConversationScreen.kt", m186i = {}, m187l = {380}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
                        /* renamed from: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$2$1$3$2$1$1 */
                        static final class C37331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Conversation $conversation;
                            final /* synthetic */ MutableState<Boolean> $isSelectedConversationSticky$delegate;
                            final /* synthetic */ MutableState<Boolean> $showConversationMenu$delegate;
                            final /* synthetic */ ConversationViewModel $viewModel;
                            Object L$0;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C37331(ConversationViewModel conversationViewModel, Conversation conversation, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super C37331> continuation) {
                                super(2, continuation);
                                this.$viewModel = conversationViewModel;
                                this.$conversation = conversation;
                                this.$isSelectedConversationSticky$delegate = mutableState;
                                this.$showConversationMenu$delegate = mutableState2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C37331(this.$viewModel, this.$conversation, this.$isSelectedConversationSticky$delegate, this.$showConversationMenu$delegate, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C37331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object $result) {
                                Object objIsConversationSticky;
                                MutableState<Boolean> mutableState;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                switch (this.label) {
                                    case 0:
                                        ResultKt.throwOnFailure($result);
                                        MutableState<Boolean> mutableState2 = this.$isSelectedConversationSticky$delegate;
                                        this.L$0 = mutableState2;
                                        this.label = 1;
                                        objIsConversationSticky = this.$viewModel.isConversationSticky(this.$conversation.getChatId(), this);
                                        if (objIsConversationSticky == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        mutableState = mutableState2;
                                        break;
                                    case 1:
                                        mutableState = (MutableState) this.L$0;
                                        ResultKt.throwOnFailure($result);
                                        objIsConversationSticky = $result;
                                        break;
                                    default:
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ConversationScreenKt.ConversationScreen$lambda$20(mutableState, ((Boolean) objIsConversationSticky).booleanValue());
                                ConversationScreenKt.ConversationScreen$lambda$14(this.$showConversationMenu$delegate, true);
                                return Unit.INSTANCE;
                            }
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState.setValue(conversation);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C37331(conversationViewModel2, conversation, mutableState2, mutableState3, null), 3, null);
                        }
                    };
                    $composer.updateRememberedValue(objRememberedValue2);
                } else {
                    composer = $composer;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                ConversationScreenKt.ConversationItem(conversation, function0, (Function0) objRememberedValue2, composer, (i >> 3) & 14);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if (ConversationScreen$lambda$34$3$1($pagedConversations$delegate).isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$ConversationScreenKt.INSTANCE.getLambda$1644240460$app_debug(), 3, null);
        }
        if (ConversationScreen$lambda$0($uiState$delegate).isLoading() && !ConversationScreen$lambda$34$3$1($pagedConversations$delegate).isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$ConversationScreenKt.INSTANCE.m11131getLambda$1416662549$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0247  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ConversationScreen$lambda$34$3$2$0$0(final androidx.compose.runtime.State r42, final com.yhchat.canarys.p007ui.conversation.ConversationViewModel r43, final kotlin.jvm.functions.Function3 r44, final kotlinx.coroutines.CoroutineScope r45, final androidx.compose.runtime.MutableState r46, final androidx.compose.runtime.MutableState r47, final androidx.compose.runtime.MutableState r48, androidx.compose.foundation.lazy.LazyItemScope r49, androidx.compose.runtime.Composer r50, int r51) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.conversation.ConversationScreenKt.ConversationScreen$lambda$34$3$2$0$0(androidx.compose.runtime.State, com.yhchat.canarys.ui.conversation.ConversationViewModel, kotlin.jvm.functions.Function3, kotlinx.coroutines.CoroutineScope, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.lazy.LazyItemScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$34$3$2$0$0$0$0$0(State $stickyData$delegate, final ConversationViewModel $viewModel, final Function3 $onConversationClick, final CoroutineScope $coroutineScope, final MutableState $selectedConversation$delegate, final MutableState $isSelectedConversationSticky$delegate, final MutableState $showConversationMenu$delegate, LazyListScope LazyRow) {
        List listEmptyList;
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        StickyData stickyDataConversationScreen$lambda$2 = ConversationScreen$lambda$2($stickyData$delegate);
        if (stickyDataConversationScreen$lambda$2 == null || (listEmptyList = stickyDataConversationScreen$lambda$2.getSticky()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ConversationScreenKt.ConversationScreen$lambda$34$3$2$0$0$0$0$0$0((StickyItem) obj);
            }
        };
        final List list = listEmptyList;
        final Function1 function12 = new Function1() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$lambda$34$3$2$0$0$0$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((StickyItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(StickyItem stickyItem) {
                return null;
            }
        };
        LazyRow.items(list.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$lambda$34$3$2$0$0$0$0$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(list.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$lambda$34$3$2$0$0$0$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke(list.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$lambda$34$3$2$0$0$0$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Composer composer;
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
                final StickyItem stickyItem = (StickyItem) list.get(it);
                $composer.startReplaceGroup(-1378442790);
                ComposerKt.sourceInformation($composer, "CN(stickyItem)*310@11570L464,317@12094L1410,308@11423L2123:ConversationScreen.kt#d8f7o0");
                ComposerKt.sourceInformationMarkerStart($composer, 1618105134, "CC(remember):ConversationScreen.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel) | ((((i & 112) ^ 48) > 32 && $composer.changed(stickyItem)) || (i & 48) == 32) | $composer.changed($onConversationClick);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final ConversationViewModel conversationViewModel = $viewModel;
                    final Function3 function3 = $onConversationClick;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$2$1$1$1$1$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            conversationViewModel.markConversationAsRead(stickyItem.getChatId(), stickyItem.getChatType());
                            function3.invoke(stickyItem.getChatId(), Integer.valueOf(stickyItem.getChatType()), stickyItem.getChatName());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 1618122848, "CC(remember):ConversationScreen.kt#9igjgp");
                boolean zChangedInstance2 = ((((i & 112) ^ 48) > 32 && $composer.changed(stickyItem)) || (i & 48) == 32) | $composer.changedInstance($coroutineScope);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final CoroutineScope coroutineScope = $coroutineScope;
                    final MutableState mutableState = $selectedConversation$delegate;
                    final MutableState mutableState2 = $isSelectedConversationSticky$delegate;
                    composer = $composer;
                    final MutableState mutableState3 = $showConversationMenu$delegate;
                    Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$2$1$1$1$1$1$2$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Conversation stickyConversation = new Conversation(stickyItem.getChatId(), stickyItem.getChatType(), stickyItem.getChatName(), "", 0L, 0, 0, null, stickyItem.getAvatarUrl(), null, 0L, null, Integer.valueOf(stickyItem.getCertificationLevel()), 2688, null);
                            mutableState.setValue(stickyConversation);
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C37321(mutableState2, mutableState3, null), 3, null);
                        }

                        /* compiled from: ConversationScreen.kt */
                        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                        @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$2$1$1$1$1$1$2$2$1$1", m185f = "ConversationScreen.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
                        /* renamed from: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$2$1$1$1$1$1$2$2$1$1 */
                        static final class C37321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                            final /* synthetic */ MutableState<Boolean> $isSelectedConversationSticky$delegate;
                            final /* synthetic */ MutableState<Boolean> $showConversationMenu$delegate;
                            int label;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            C37321(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super C37321> continuation) {
                                super(2, continuation);
                                this.$isSelectedConversationSticky$delegate = mutableState;
                                this.$showConversationMenu$delegate = mutableState2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                return new C37321(this.$isSelectedConversationSticky$delegate, this.$showConversationMenu$delegate, continuation);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                return ((C37321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object $result) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                switch (this.label) {
                                    case 0:
                                        ResultKt.throwOnFailure($result);
                                        ConversationScreenKt.ConversationScreen$lambda$20(this.$isSelectedConversationSticky$delegate, true);
                                        ConversationScreenKt.ConversationScreen$lambda$14(this.$showConversationMenu$delegate, true);
                                        return Unit.INSTANCE;
                                    default:
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                } else {
                    composer = $composer;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                Composer composer2 = composer;
                ConversationScreenKt.StickyConversationCard(stickyItem, function0, (Function0) objRememberedValue2, null, composer2, (i >> 3) & 14, 8);
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ConversationScreen$lambda$34$3$2$0$0$0$0$0$0(StickyItem stickyItem) {
        Intrinsics.checkNotNullParameter(stickyItem, "stickyItem");
        return "sticky_" + stickyItem.getChatId() + "_" + stickyItem.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ConversationScreen$lambda$34$3$2$0$1(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        return "conversation_" + conversation.getChatId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$35$0(MutableState $showConversationMenu$delegate, MutableState $selectedConversation$delegate) {
        ConversationScreen$lambda$14($showConversationMenu$delegate, false);
        $selectedConversation$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$36$0(MutableState $selectedConversation$delegate, ConversationViewModel $viewModel) {
        Conversation conversationConversationScreen$lambda$16 = ConversationScreen$lambda$16($selectedConversation$delegate);
        if (conversationConversationScreen$lambda$16 != null) {
            $viewModel.toggleStickyConversation(conversationConversationScreen$lambda$16);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$37$0(MutableState $selectedConversation$delegate, ConversationViewModel $viewModel) {
        Conversation conversationConversationScreen$lambda$16 = ConversationScreen$lambda$16($selectedConversation$delegate);
        if (conversationConversationScreen$lambda$16 != null) {
            $viewModel.deleteConversation(conversationConversationScreen$lambda$16.getChatId());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$38$0(MutableState $showScanMethodDialog$delegate) {
        ConversationScreen$lambda$29($showScanMethodDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$39(final ManagedActivityResultLauncher $scanLauncher, final MutableState $showScanMethodDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C456@18907L485,455@18865L598:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1413268390, $changed, -1, "com.yhchat.canarys.ui.conversation.ConversationScreen.<anonymous> (ConversationScreen.kt:455)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -941254849, "CC(remember):ConversationScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($scanLauncher);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda29
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationScreenKt.ConversationScreen$lambda$39$0$0($scanLauncher, $showScanMethodDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ConversationScreenKt.INSTANCE.m11127getLambda$1068618729$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$39$0$0(ManagedActivityResultLauncher $scanLauncher, MutableState $showScanMethodDialog$delegate) {
        ConversationScreen$lambda$29($showScanMethodDialog$delegate, false);
        ScanOptions options = new ScanOptions();
        options.setDesiredBarcodeFormats("QR_CODE");
        options.setPrompt("\u626b\u63cf\u4e8c\u7ef4\u7801");
        options.setBeepEnabled(false);
        options.setBarcodeImageEnabled(true);
        options.setOrientationLocked(false);
        $scanLauncher.launch(options);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$40(final ManagedActivityResultLauncher $galleryLauncher, final MutableState $showScanMethodDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C472@19567L134,471@19525L248:ConversationScreen.kt#d8f7o0");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1415102756, $changed, -1, "com.yhchat.canarys.ui.conversation.ConversationScreen.<anonymous> (ConversationScreen.kt:471)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1590886370, "CC(remember):ConversationScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($galleryLauncher);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationScreenKt.ConversationScreen$lambda$40$0$0($galleryLauncher, $showScanMethodDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ConversationScreenKt.INSTANCE.m11128getLambda$1070453095$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$40$0$0(ManagedActivityResultLauncher $galleryLauncher, MutableState $showScanMethodDialog$delegate) {
        ConversationScreen$lambda$29($showScanMethodDialog$delegate, false);
        $galleryLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$41$0(MutableState $showAddMenuBottomSheet$delegate) {
        ConversationScreen$lambda$23($showAddMenuBottomSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$42(final Context $context, final MutableState $showAddMenuBottomSheet$delegate, final MutableState $showScanMethodDialog$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C490@20154L210,495@20401L226,500@20654L118,489@20091L695:ConversationScreen.kt#d8f7o0");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(626655924, $changed, -1, "com.yhchat.canarys.ui.conversation.ConversationScreen.<anonymous> (ConversationScreen.kt:489)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 920924198, "CC(remember):ConversationScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationScreenKt.ConversationScreen$lambda$42$0$0($context, $showAddMenuBottomSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 920932118, "CC(remember):ConversationScreen.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($context);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationScreenKt.ConversationScreen$lambda$42$1$0($context, $showAddMenuBottomSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            Function0 function02 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 920940106, "CC(remember):ConversationScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationScreenKt.ConversationScreen$lambda$42$2$0($showAddMenuBottomSheet$delegate, $showScanMethodDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AddMenuBottomSheetContent(function0, function02, (Function0) objRememberedValue3, $composer, 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$42$0$0(Context $context, MutableState $showAddMenuBottomSheet$delegate) {
        ConversationScreen$lambda$23($showAddMenuBottomSheet$delegate, false);
        Intent intent = new Intent($context, (Class<?>) ComprehensiveSearchActivity.class);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$42$1$0(Context $context, MutableState $showAddMenuBottomSheet$delegate) {
        ConversationScreen$lambda$23($showAddMenuBottomSheet$delegate, false);
        Intent intent = new Intent($context, (Class<?>) CreateActivity.class);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationScreen$lambda$42$2$0(MutableState $showAddMenuBottomSheet$delegate, MutableState $showScanMethodDialog$delegate) {
        ConversationScreen$lambda$23($showAddMenuBottomSheet$delegate, false);
        ConversationScreen$lambda$29($showScanMethodDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x029b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void AddMenuBottomSheetContent(kotlin.jvm.functions.Function0<kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, kotlin.jvm.functions.Function0<kotlin.Unit> r59, androidx.compose.runtime.Composer r60, final int r61) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.conversation.ConversationScreenKt.AddMenuBottomSheetContent(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    public static final void ConversationItem(final Conversation conversation, final Function0<Unit> onClick, final Function0<Unit> onLongClick, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onLongClick, "onLongClick");
        Composer $composer3 = $composer.startRestartGroup(-966683724);
        ComposerKt.sourceInformation($composer3, "C(ConversationItem)N(conversation,onClick,onLongClick)606@24063L11,610@24195L7162,598@23787L7570:ConversationScreen.kt#d8f7o0");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(conversation) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onLongClick) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-966683724, $dirty2, -1, "com.yhchat.canarys.ui.conversation.ConversationItem (ConversationScreen.kt:588)");
            }
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
            SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd", Locale.getDefault());
            long now = System.currentTimeMillis();
            String timeText = now - conversation.getTimestampMs() < CalendarModelKt.MillisecondsIn24Hours ? timeFormat.format(new Date(conversation.getTimestampMs())) : dateFormat.format(new Date(conversation.getTimestampMs()));
            final String timeText2 = timeText;
            $composer2 = $composer3;
            SurfaceKt.m3209SurfaceT9BRK9s(ClickableKt.m526combinedClickablehoGz1lA$default(PaddingKt.m1051paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(4), C1834Dp.m7806constructorimpl(3)), false, null, null, null, onLongClick, null, false, null, onClick, 239, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(14)), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, C1834Dp.m7806constructorimpl(0), C1834Dp.m7806constructorimpl(0), null, ComposableLambdaKt.rememberComposableLambda(567811257, true, new Function2() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationScreenKt.ConversationItem$lambda$0(conversation, timeText2, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), $composer2, 12804096, 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationScreenKt.ConversationItem$lambda$1(conversation, onClick, onLongClick, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x081d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x095f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0c58  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0cc4  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0dcf  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0ddb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0de1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0e7d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0e99  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0eb4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0ecc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0f30  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0f6b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x1018  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ConversationItem$lambda$0(com.yhchat.canarys.data.model.Conversation r179, java.lang.String r180, androidx.compose.runtime.Composer r181, int r182) {
        /*
            Method dump skipped, instructions count: 4146
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.conversation.ConversationScreenKt.ConversationItem$lambda$0(com.yhchat.canarys.data.model.Conversation, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void ChatTypeIcon(final int chatType, Composer $composer, final int $changed) {
        Composer $composer2;
        String icon;
        Composer $composer3 = $composer.startRestartGroup(459815283);
        ComposerKt.sourceInformation($composer3, "C(ChatTypeIcon)N(chatType)788@31602L57:ConversationScreen.kt#d8f7o0");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(chatType) ? 4 : 2;
        }
        if ($composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(459815283, $dirty, -1, "com.yhchat.canarys.ui.conversation.ChatTypeIcon (ConversationScreen.kt:780)");
            }
            if (chatType == ChatType.USER.getValue()) {
                icon = "\u1f464";
            } else if (chatType == ChatType.GROUP.getValue()) {
                icon = "\u1f465";
            } else {
                icon = chatType == ChatType.BOT.getValue() ? "\u1f916" : "\u1f4ac";
            }
            $composer2 = $composer3;
            TextKt.m3359Text4IGK_g(icon, (Modifier) null, 0L, TextUnitKt.getSp(20), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 3072, 0, 131062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConversationScreenKt.ChatTypeIcon$lambda$0(chatType, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x02d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void StickyConversationCard(final com.yhchat.canarys.data.model.StickyItem r48, final kotlin.jvm.functions.Function0<kotlin.Unit> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, androidx.compose.p000ui.Modifier r51, androidx.compose.runtime.Composer r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 762
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.conversation.ConversationScreenKt.StickyConversationCard(com.yhchat.canarys.data.model.StickyItem, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StickyConversationCard$lambda$1$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void IntegratedStickyItem(final com.yhchat.canarys.data.model.StickyItem r109, final kotlin.jvm.functions.Function0<kotlin.Unit> r110, kotlin.jvm.functions.Function0<kotlin.Unit> r111, androidx.compose.p000ui.Modifier r112, androidx.compose.runtime.Composer r113, final int r114, final int r115) {
        /*
            Method dump skipped, instructions count: 1660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.conversation.ConversationScreenKt.IntegratedStickyItem(com.yhchat.canarys.data.model.StickyItem, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
