package com.yhchat.canarys.p007ui.conversation;

import android.util.Log;
import androidx.core.location.LocationRequestCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.local.ReadPositionStore;
import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.data.model.Conversation;
import com.yhchat.canarys.data.model.StickyData;
import com.yhchat.canarys.data.repository.CacheRepository;
import com.yhchat.canarys.data.repository.ConversationRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.data.websocket.ConversationUpdate;
import com.yhchat.canarys.data.websocket.MessageEvent;
import com.yhchat.canarys.data.websocket.WebSocketManager;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ConversationViewModel.kt */
@Metadata(m168d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001OB9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\b\u00100\u001a\u00020\u001fH\u0002J\u000e\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u000203J\u0006\u00104\u001a\u00020\u001fJ\u0016\u00105\u001a\u00020\u001f2\u0006\u00102\u001a\u0002032\u0006\u00106\u001a\u000203J\b\u00107\u001a\u00020\u001fH\u0002J\u0010\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010;\u001a\u00020\u001f2\u0006\u00109\u001a\u00020:H\u0002J\u0010\u0010<\u001a\u0002032\u0006\u00109\u001a\u00020:H\u0002J\u000e\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u000203J\u0006\u0010?\u001a\u00020\u001fJ\u0006\u0010@\u001a\u00020\u001fJ\u0006\u0010A\u001a\u00020\u001fJ\u000e\u0010B\u001a\u00020\u001f2\u0006\u00106\u001a\u000203J\u000e\u0010C\u001a\u00020\u001f2\u0006\u0010D\u001a\u00020\u0018J\u0016\u0010E\u001a\u00020\u00142\u0006\u00106\u001a\u000203H\u0086@\u00a2\u0006\u0002\u0010FJ\u0016\u0010G\u001a\u00020\u001f2\u0006\u00106\u001a\u0002032\u0006\u0010H\u001a\u00020\u0011J\u0018\u0010I\u001a\u00020\u001f2\u0006\u00106\u001a\u0002032\u0006\u0010J\u001a\u00020\u0011H\u0002J'\u0010K\u001a\u00020\u00112\u0006\u00106\u001a\u0002032\u0006\u0010H\u001a\u00020\u00112\b\u0010L\u001a\u0004\u0018\u00010MH\u0002\u00a2\u0006\u0002\u0010NR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u001a\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001c\u00a8\u0006P"}, m169d2 = {"Lcom/yhchat/canarys/ui/conversation/ConversationViewModel;", "Landroidx/lifecycle/ViewModel;", "conversationRepository", "Lcom/yhchat/canarys/data/repository/ConversationRepository;", "cacheRepository", "Lcom/yhchat/canarys/data/repository/CacheRepository;", "webSocketManager", "Lcom/yhchat/canarys/data/websocket/WebSocketManager;", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "messageRepository", "Lcom/yhchat/canarys/data/repository/MessageRepository;", "readPositionStore", "Lcom/yhchat/canarys/data/local/ReadPositionStore;", "<init>", "(Lcom/yhchat/canarys/data/repository/ConversationRepository;Lcom/yhchat/canarys/data/repository/CacheRepository;Lcom/yhchat/canarys/data/websocket/WebSocketManager;Lcom/yhchat/canarys/data/repository/UserRepository;Lcom/yhchat/canarys/data/repository/MessageRepository;Lcom/yhchat/canarys/data/local/ReadPositionStore;)V", "pageSize", "", "currentPage", "hasMore", "", "_pagedConversations", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/yhchat/canarys/data/model/Conversation;", "pagedConversations", "Lkotlinx/coroutines/flow/StateFlow;", "getPagedConversations", "()Lkotlinx/coroutines/flow/StateFlow;", "allLoadedConversations", "setTokenRepository", "", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "_uiState", "Lcom/yhchat/canarys/ui/conversation/ConversationViewModel$ConversationUiState;", "uiState", "getUiState", "_conversations", "conversations", "getConversations", "_stickyData", "Lcom/yhchat/canarys/data/model/StickyData;", "stickyData", "getStickyData", "_stickyLoading", "stickyLoading", "getStickyLoading", "loadCachedConversations", "loadConversations", "token", "", "loadMoreConversations", "markAsRead", ChatSearchActivity.EXTRA_CHAT_ID, "observeWebSocketMessages", "updateConversationWithNewMessage", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "updateConversationWithEditedMessage", "getMessagePreview", "startWebSocket", "userId", "stopWebSocket", "clearError", "loadStickyConversations", "deleteConversation", "toggleStickyConversation", "conversation", "isConversationSticky", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "markConversationAsRead", ChatSearchActivity.EXTRA_CHAT_TYPE, "updateLocalUnreadCount", "count", "calculateUnreadCount", "latestMsgSeq", "", "(Ljava/lang/String;ILjava/lang/Long;)I", "ConversationUiState", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class ConversationViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<List<Conversation>> _conversations;
    private final MutableStateFlow<List<Conversation>> _pagedConversations;
    private final MutableStateFlow<StickyData> _stickyData;
    private final MutableStateFlow<Boolean> _stickyLoading;
    private final MutableStateFlow<ConversationUiState> _uiState;
    private List<Conversation> allLoadedConversations;
    private final CacheRepository cacheRepository;
    private final ConversationRepository conversationRepository;
    private final StateFlow<List<Conversation>> conversations;
    private int currentPage;
    private boolean hasMore;
    private final MessageRepository messageRepository;
    private final int pageSize;
    private final StateFlow<List<Conversation>> pagedConversations;
    private final ReadPositionStore readPositionStore;
    private final StateFlow<StickyData> stickyData;
    private final StateFlow<Boolean> stickyLoading;
    private final StateFlow<ConversationUiState> uiState;
    private final UserRepository userRepository;
    private final WebSocketManager webSocketManager;

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel", m185f = "ConversationViewModel.kt", m186i = {0}, m187l = {443}, m188m = "isConversationSticky", m189n = {ChatSearchActivity.EXTRA_CHAT_ID}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$isConversationSticky$1 */
    static final class C37371 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C37371(Continuation<? super C37371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationViewModel.this.isConversationSticky(null, this);
        }
    }

    @Inject
    public ConversationViewModel(ConversationRepository conversationRepository, CacheRepository cacheRepository, WebSocketManager webSocketManager, UserRepository userRepository, MessageRepository messageRepository, ReadPositionStore readPositionStore) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(webSocketManager, "webSocketManager");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(messageRepository, "messageRepository");
        Intrinsics.checkNotNullParameter(readPositionStore, "readPositionStore");
        this.conversationRepository = conversationRepository;
        this.cacheRepository = cacheRepository;
        this.webSocketManager = webSocketManager;
        this.userRepository = userRepository;
        this.messageRepository = messageRepository;
        this.readPositionStore = readPositionStore;
        this.pageSize = 20;
        this.currentPage = 1;
        this.hasMore = true;
        this._pagedConversations = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.pagedConversations = FlowKt.asStateFlow(this._pagedConversations);
        this.allLoadedConversations = CollectionsKt.emptyList();
        observeWebSocketMessages();
        loadCachedConversations();
        this._uiState = StateFlowKt.MutableStateFlow(new ConversationUiState(false, null, 3, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._conversations = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
        this.conversations = FlowKt.asStateFlow(this._conversations);
        this._stickyData = StateFlowKt.MutableStateFlow(null);
        this.stickyData = FlowKt.asStateFlow(this._stickyData);
        this._stickyLoading = StateFlowKt.MutableStateFlow(false);
        this.stickyLoading = FlowKt.asStateFlow(this._stickyLoading);
    }

    public final StateFlow<List<Conversation>> getPagedConversations() {
        return this.pagedConversations;
    }

    public final void setTokenRepository(TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.conversationRepository.setTokenRepository(tokenRepository);
        this.userRepository.setTokenRepository(tokenRepository);
    }

    public final StateFlow<ConversationUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<List<Conversation>> getConversations() {
        return this.conversations;
    }

    public final StateFlow<StickyData> getStickyData() {
        return this.stickyData;
    }

    public final StateFlow<Boolean> getStickyLoading() {
        return this.stickyLoading;
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$loadCachedConversations$1", m185f = "ConversationViewModel.kt", m186i = {}, m187l = {76}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$loadCachedConversations$1 */
    static final class C37381 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C37381(Continuation<? super C37381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ConversationViewModel.kt */
        @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$loadCachedConversations$1$1 */
        static final class AnonymousClass1<T> implements FlowCollector {
            AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                return emit((List<Conversation>) value, (Continuation<? super Unit>) $completion);
            }

            public final Object emit(List<Conversation> list, Continuation<? super Unit> continuation) {
                if (!list.isEmpty()) {
                    conversationViewModel._conversations.setValue(list);
                    conversationViewModel._uiState.setValue(ConversationUiState.copy$default((ConversationUiState) conversationViewModel._uiState.getValue(), false, null, 2, null));
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (ConversationViewModel.this.cacheRepository.getCachedConversations().collect(new FlowCollector() { // from class: com.yhchat.canarys.ui.conversation.ConversationViewModel.loadCachedConversations.1.1
                        AnonymousClass1() {
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((List<Conversation>) value, (Continuation<? super Unit>) $completion);
                        }

                        public final Object emit(List<Conversation> list, Continuation<? super Unit> continuation) {
                            if (!list.isEmpty()) {
                                conversationViewModel._conversations.setValue(list);
                                conversationViewModel._uiState.setValue(ConversationUiState.copy$default((ConversationUiState) conversationViewModel._uiState.getValue(), false, null, 2, null));
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    private final void loadCachedConversations() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37381(null), 3, null);
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$loadConversations$1", m185f = "ConversationViewModel.kt", m186i = {1, 1, 2, 2}, m187l = {93, 101, LocationRequestCompat.QUALITY_LOW_POWER}, m188m = "invokeSuspend", m189n = {"conversationList\\1", "$i$a$-onSuccess-ConversationViewModel$loadConversations$1$1\\1\\94\\0", "error\\3", "$i$a$-onFailure-ConversationViewModel$loadConversations$1$2\\3\\103\\0"}, m191s = {"L$1", "I$0", "L$2", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$loadConversations$1 */
    static final class C37391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        C37391(Continuation<? super C37391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37391(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x010a  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x014b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 374
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.conversation.ConversationViewModel.C37391.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loadConversations(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37391(null), 3, null);
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$loadMoreConversations$1", m185f = "ConversationViewModel.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$loadMoreConversations$1 */
    static final class C37401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C37401(Continuation<? super C37401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ConversationViewModel.this._uiState.setValue(ConversationUiState.copy$default((ConversationUiState) ConversationViewModel.this._uiState.getValue(), true, null, 2, null));
                    int nextPage = ConversationViewModel.this.currentPage + 1;
                    int from = (nextPage - 1) * ConversationViewModel.this.pageSize;
                    int to = RangesKt.coerceAtMost(ConversationViewModel.this.pageSize * nextPage, ConversationViewModel.this.allLoadedConversations.size());
                    if (from >= to) {
                        ConversationViewModel.this.hasMore = false;
                    } else {
                        List more = ConversationViewModel.this.allLoadedConversations.subList(0, to);
                        ConversationViewModel.this._pagedConversations.setValue(more);
                        ConversationViewModel.this.currentPage = nextPage;
                        ConversationViewModel.this.hasMore = to < ConversationViewModel.this.allLoadedConversations.size();
                    }
                    ConversationViewModel.this._uiState.setValue(ConversationUiState.copy$default((ConversationUiState) ConversationViewModel.this._uiState.getValue(), false, null, 2, null));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void loadMoreConversations() {
        if (this.hasMore && !this._uiState.getValue().isLoading()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37401(null), 3, null);
        }
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$markAsRead$1", m185f = "ConversationViewModel.kt", m186i = {}, m187l = {145}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$markAsRead$1 */
    static final class C37421 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37421(String str, Continuation<? super C37421> continuation) {
            super(2, continuation);
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37421(this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Conversation conversationCopy;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8539dismissNotificationgIAlus = ConversationViewModel.this.conversationRepository.m8539dismissNotificationgIAlus(this.$chatId, this);
                    if (objM8539dismissNotificationgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8539dismissNotificationgIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ConversationViewModel conversationViewModel = ConversationViewModel.this;
            String str = this.$chatId;
            if (Result.m11926isSuccessimpl(value)) {
                ((Boolean) value).booleanValue();
                MutableStateFlow mutableStateFlow = conversationViewModel._conversations;
                Iterable<Conversation> iterable = (Iterable) conversationViewModel._conversations.getValue();
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (Conversation conversation : iterable) {
                    if (Intrinsics.areEqual(conversation.getChatId(), str)) {
                        conversationCopy = conversation.copy((8095 & 1) != 0 ? conversation.chatId : null, (8095 & 2) != 0 ? conversation.chatType : 0, (8095 & 4) != 0 ? conversation.name : null, (8095 & 8) != 0 ? conversation.chatContent : null, (8095 & 16) != 0 ? conversation.timestampMs : 0L, (8095 & 32) != 0 ? conversation.unreadMessage : 0, (8095 & 64) != 0 ? conversation.at : 0, (8095 & 128) != 0 ? conversation.avatarId : null, (8095 & 256) != 0 ? conversation.avatarUrl : null, (8095 & 512) != 0 ? conversation.doNotDisturb : null, (8095 & 1024) != 0 ? conversation.timestamp : 0L, (8095 & 2048) != 0 ? conversation.atData : null, (8095 & 4096) != 0 ? conversation.certificationLevel : null);
                    } else {
                        conversationCopy = conversation;
                    }
                    arrayList.add(conversationCopy);
                }
                mutableStateFlow.setValue((List) arrayList);
            }
            ConversationViewModel conversationViewModel2 = ConversationViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                conversationViewModel2._uiState.setValue(ConversationUiState.copy$default((ConversationUiState) conversationViewModel2._uiState.getValue(), false, thM11922exceptionOrNullimpl.getMessage(), 1, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void markAsRead(String token, String str) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(str, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37421(str, null), 3, null);
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$observeWebSocketMessages$1", m185f = "ConversationViewModel.kt", m186i = {}, m187l = {168}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$observeWebSocketMessages$1 */
    static final class C37441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C37441(Continuation<? super C37441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ConversationViewModel.kt */
        @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$observeWebSocketMessages$1$1 */
        static final class AnonymousClass1<T> implements FlowCollector {
            AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                return emit((MessageEvent) value, (Continuation<? super Unit>) $completion);
            }

            public final Object emit(MessageEvent event, Continuation<? super Unit> continuation) {
                Log.d("ConversationViewModel", "Received MessageEvent: " + Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName());
                if (event instanceof MessageEvent.NewMessage) {
                    conversationViewModel.updateConversationWithNewMessage(((MessageEvent.NewMessage) event).getMessage());
                } else if (event instanceof MessageEvent.MessageEdited) {
                    conversationViewModel.updateConversationWithEditedMessage(((MessageEvent.MessageEdited) event).getMessage());
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (ConversationViewModel.this.webSocketManager.getMessageEvents().collect(new FlowCollector() { // from class: com.yhchat.canarys.ui.conversation.ConversationViewModel.observeWebSocketMessages.1.1
                        AnonymousClass1() {
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((MessageEvent) value, (Continuation<? super Unit>) $completion);
                        }

                        public final Object emit(MessageEvent event, Continuation<? super Unit> continuation) {
                            Log.d("ConversationViewModel", "Received MessageEvent: " + Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName());
                            if (event instanceof MessageEvent.NewMessage) {
                                conversationViewModel.updateConversationWithNewMessage(((MessageEvent.NewMessage) event).getMessage());
                            } else if (event instanceof MessageEvent.MessageEdited) {
                                conversationViewModel.updateConversationWithEditedMessage(((MessageEvent.MessageEdited) event).getMessage());
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw new KotlinNothingValueException();
        }
    }

    private final void observeWebSocketMessages() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37441(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37452(null), 3, null);
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$observeWebSocketMessages$2", m185f = "ConversationViewModel.kt", m186i = {}, m187l = {186}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$observeWebSocketMessages$2 */
    static final class C37452 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C37452(Continuation<? super C37452> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37452(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37452) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ConversationViewModel.kt */
        @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$observeWebSocketMessages$2$1 */
        static final class AnonymousClass1<T> implements FlowCollector {
            AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                return emit((ConversationUpdate) value, (Continuation<? super Unit>) $completion);
            }

            public final Object emit(ConversationUpdate update, Continuation<? super Unit> continuation) {
                Log.d("ConversationViewModel", "Received ConversationUpdate: " + Reflection.getOrCreateKotlinClass(update.getClass()).getSimpleName());
                if (update instanceof ConversationUpdate.NewMessage) {
                    conversationViewModel.updateConversationWithNewMessage(((ConversationUpdate.NewMessage) update).getMessage());
                } else if (update instanceof ConversationUpdate.MessageEdited) {
                    conversationViewModel.updateConversationWithEditedMessage(((ConversationUpdate.MessageEdited) update).getMessage());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (ConversationViewModel.this.webSocketManager.getConversationUpdates().collect(new FlowCollector() { // from class: com.yhchat.canarys.ui.conversation.ConversationViewModel.observeWebSocketMessages.2.1
                        AnonymousClass1() {
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((ConversationUpdate) value, (Continuation<? super Unit>) $completion);
                        }

                        public final Object emit(ConversationUpdate update, Continuation<? super Unit> continuation) {
                            Log.d("ConversationViewModel", "Received ConversationUpdate: " + Reflection.getOrCreateKotlinClass(update.getClass()).getSimpleName());
                            if (update instanceof ConversationUpdate.NewMessage) {
                                conversationViewModel.updateConversationWithNewMessage(((ConversationUpdate.NewMessage) update).getMessage());
                            } else if (update instanceof ConversationUpdate.MessageEdited) {
                                conversationViewModel.updateConversationWithEditedMessage(((ConversationUpdate.MessageEdited) update).getMessage());
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$updateConversationWithNewMessage$1", m185f = "ConversationViewModel.kt", m186i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m187l = {234, 256}, m188m = "invokeSuspend", m189n = {"currentConversations", "targetChatId", "conversation", "updatedConversation", "isPrivateChat", "targetChatType", "conversationIndex", "unreadCount", "currentConversations", "targetChatId", "newConversation", "isPrivateChat", "targetChatType", "conversationIndex"}, m191s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "Z$0", "I$0", "I$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$updateConversationWithNewMessage$1 */
    static final class C37481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatMessage $message;
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37481(ChatMessage chatMessage, Continuation<? super C37481> continuation) {
            super(2, continuation);
            this.$message = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37481(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:133:0x0242  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                Method dump skipped, instructions count: 698
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.conversation.ConversationViewModel.C37481.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void updateConversationWithNewMessage(ChatMessage message) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37481(message, null), 3, null);
    }

    public final void updateConversationWithEditedMessage(ChatMessage message) {
        List currentConversations = CollectionsKt.toMutableList((Collection) this._conversations.getValue());
        int conversationIndex = 0;
        Iterator<Conversation> it = currentConversations.iterator();
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((Conversation) it.next()).getChatId(), message.getSender().getChatId())) {
                    break;
                } else {
                    conversationIndex++;
                }
            } else {
                conversationIndex = -1;
                break;
            }
        }
        if (conversationIndex >= 0) {
            Conversation conversation = currentConversations.get(conversationIndex);
            Conversation updatedConversation = conversation.copy((8095 & 1) != 0 ? conversation.chatId : null, (8095 & 2) != 0 ? conversation.chatType : 0, (8095 & 4) != 0 ? conversation.name : null, (8095 & 8) != 0 ? conversation.chatContent : getMessagePreview(message), (8095 & 16) != 0 ? conversation.timestampMs : message.getSendTime(), (8095 & 32) != 0 ? conversation.unreadMessage : 0, (8095 & 64) != 0 ? conversation.at : 0, (8095 & 128) != 0 ? conversation.avatarId : null, (8095 & 256) != 0 ? conversation.avatarUrl : null, (8095 & 512) != 0 ? conversation.doNotDisturb : null, (8095 & 1024) != 0 ? conversation.timestamp : 0L, (8095 & 2048) != 0 ? conversation.atData : null, (8095 & 4096) != 0 ? conversation.certificationLevel : null);
            currentConversations.set(conversationIndex, updatedConversation);
            this._conversations.setValue(currentConversations);
            this.allLoadedConversations = currentConversations;
            this._pagedConversations.setValue(CollectionsKt.take(currentConversations, this.currentPage * this.pageSize));
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:170:0x016d. Please report as an issue. */
    public final String getMessagePreview(ChatMessage message) {
        String contentPreview;
        String text = message.getContent().getText();
        int targetChatType = 1;
        if (text == null || text.length() == 0) {
            String imageUrl = message.getContent().getImageUrl();
            if (imageUrl == null || imageUrl.length() == 0) {
                String fileUrl = message.getContent().getFileUrl();
                if (!(fileUrl == null || fileUrl.length() == 0)) {
                    String fileName = message.getContent().getFileName();
                    boolean z = fileName == null || fileName.length() == 0;
                    contentPreview = "[\u6587\u4ef6]";
                    if (!z) {
                        contentPreview = "[\u6587\u4ef6]" + message.getContent().getFileName();
                    }
                } else {
                    String audioUrl = message.getContent().getAudioUrl();
                    if (audioUrl == null || audioUrl.length() == 0) {
                        String videoUrl = message.getContent().getVideoUrl();
                        if (videoUrl == null || videoUrl.length() == 0) {
                            String stickerUrl = message.getContent().getStickerUrl();
                            if (stickerUrl == null || stickerUrl.length() == 0) {
                                String postTitle = message.getContent().getPostTitle();
                                contentPreview = !(postTitle == null || postTitle.length() == 0) ? "\u6587\u7ae0\u6d88\u606f" + message.getContent().getPostTitle() : "[\u6d88\u606f]";
                            } else {
                                contentPreview = "\u8868\u60c5\u6d88\u606f";
                            }
                        } else {
                            contentPreview = "\u89c6\u9891\u6d88\u606f";
                        }
                    } else {
                        contentPreview = "\u8bed\u97f3\u6d88\u606f";
                    }
                }
            } else {
                contentPreview = "[\u56fe\u7247]";
            }
        } else {
            contentPreview = message.getContent().getText();
        }
        boolean isPrivateChat = Intrinsics.areEqual(message.getChatId(), message.getRecvId());
        if (isPrivateChat) {
            targetChatType = message.getSender().getChatType();
        } else {
            Integer chatType = message.getChatType();
            if (chatType != null) {
                targetChatType = chatType.intValue();
            }
        }
        String nonNullContentPreview = contentPreview != null ? contentPreview : "[\u6d88\u606f]";
        Log.d("ConversationViewModel", "Message preview - chatType: " + targetChatType + ", sender: " + message.getSender().getName() + ", content: " + nonNullContentPreview);
        switch (targetChatType) {
        }
        return nonNullContentPreview;
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$startWebSocket$1", m185f = "ConversationViewModel.kt", m186i = {}, m187l = {347}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$startWebSocket$1 */
    static final class C37461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37461(String str, Continuation<? super C37461> continuation) {
            super(2, continuation);
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37461(this.$userId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (WebSocketManager.connect$default(ConversationViewModel.this.webSocketManager, this.$userId, null, this, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public final void startWebSocket(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37461(userId, null), 3, null);
    }

    public final void stopWebSocket() {
        this.webSocketManager.disconnect();
    }

    public final void clearError() {
        this._uiState.setValue(ConversationUiState.copy$default(this._uiState.getValue(), false, null, 1, null));
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$loadStickyConversations$1", m185f = "ConversationViewModel.kt", m186i = {}, m187l = {373}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$loadStickyConversations$1 */
    static final class C37411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C37411(Continuation<? super C37411> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37411(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        ConversationViewModel.this._stickyLoading.setValue(Boxing.boxBoolean(true));
                        this.label = 1;
                        Object objM8652getStickyListIoAF18A = ConversationViewModel.this.userRepository.m8652getStickyListIoAF18A(this);
                        if (objM8652getStickyListIoAF18A == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        value = objM8652getStickyListIoAF18A;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        value = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ConversationViewModel conversationViewModel = ConversationViewModel.this;
                if (Result.m11926isSuccessimpl(value)) {
                    conversationViewModel._stickyData.setValue((StickyData) value);
                    conversationViewModel._stickyLoading.setValue(Boxing.boxBoolean(false));
                }
                ConversationViewModel conversationViewModel2 = ConversationViewModel.this;
                if (Result.m11922exceptionOrNullimpl(value) != null) {
                    conversationViewModel2._stickyData.setValue(null);
                    conversationViewModel2._stickyLoading.setValue(Boxing.boxBoolean(false));
                }
            } catch (Exception e) {
                ConversationViewModel.this._stickyData.setValue(null);
                ConversationViewModel.this._stickyLoading.setValue(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadStickyConversations() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37411(null), 3, null);
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$deleteConversation$1", m185f = "ConversationViewModel.kt", m186i = {}, m187l = {396}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$deleteConversation$1 */
    static final class C37361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37361(String str, Continuation<? super C37361> continuation) {
            super(2, continuation);
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37361(this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8541removeConversationgIAlus = ConversationViewModel.this.conversationRepository.m8541removeConversationgIAlus(this.$chatId, this);
                    if (objM8541removeConversationgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8541removeConversationgIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ConversationViewModel conversationViewModel = ConversationViewModel.this;
            String str = this.$chatId;
            if (Result.m11926isSuccessimpl(value)) {
                ((Boolean) value).booleanValue();
                MutableStateFlow mutableStateFlow = conversationViewModel._conversations;
                Iterable iterable = (Iterable) conversationViewModel._conversations.getValue();
                Collection arrayList = new ArrayList();
                for (Object obj : iterable) {
                    if (!Intrinsics.areEqual(((Conversation) obj).getChatId(), str)) {
                        arrayList.add(obj);
                    }
                }
                mutableStateFlow.setValue((List) arrayList);
            }
            ConversationViewModel conversationViewModel2 = ConversationViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                conversationViewModel2._uiState.setValue(ConversationUiState.copy$default((ConversationUiState) conversationViewModel2._uiState.getValue(), false, thM11922exceptionOrNullimpl.getMessage(), 1, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteConversation(String str) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37361(str, null), 3, null);
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$toggleStickyConversation$1", m185f = "ConversationViewModel.kt", m186i = {1, 1, 1, 2, 2, 2}, m187l = {413, 418, 425}, m188m = "invokeSuspend", m189n = {"stickyData\\1", "$i$a$-onSuccess-ConversationViewModel$toggleStickyConversation$1$1\\1\\414\\0", "isSticky\\1", "stickyData\\1", "$i$a$-onSuccess-ConversationViewModel$toggleStickyConversation$1$1\\1\\414\\0", "isSticky\\1"}, m191s = {"L$2", "I$0", "I$1", "L$2", "I$0", "I$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$toggleStickyConversation$1 */
    static final class C37471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Conversation $conversation;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37471(Conversation conversation, Continuation<? super C37471> continuation) {
            super(2, continuation);
            this.$conversation = conversation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37471(this.$conversation, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x013e  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x00ed  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 364
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.conversation.ConversationViewModel.C37471.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void toggleStickyConversation(Conversation conversation) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37471(conversation, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object isConversationSticky(java.lang.String r12, kotlin.coroutines.Continuation<? super java.lang.Boolean> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.yhchat.canarys.p007ui.conversation.ConversationViewModel.C37371
            if (r0 == 0) goto L14
            r0 = r13
            com.yhchat.canarys.ui.conversation.ConversationViewModel$isConversationSticky$1 r0 = (com.yhchat.canarys.p007ui.conversation.ConversationViewModel.C37371) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.ui.conversation.ConversationViewModel$isConversationSticky$1 r0 = new com.yhchat.canarys.ui.conversation.ConversationViewModel$isConversationSticky$1
            r0.<init>(r13)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            r5 = 0
            switch(r3) {
                case 0: goto L3e;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2e:
            java.lang.Object r2 = r0.L$0
            r12 = r2
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L9e
            r2 = r1
            kotlin.Result r2 = (kotlin.Result) r2     // Catch: java.lang.Exception -> L9e
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L9e
            goto L51
        L3e:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.UserRepository r3 = r11.userRepository     // Catch: java.lang.Exception -> L9e
            r0.L$0 = r12     // Catch: java.lang.Exception -> L9e
            r0.label = r4     // Catch: java.lang.Exception -> L9e
            java.lang.Object r3 = r3.m8652getStickyListIoAF18A(r0)     // Catch: java.lang.Exception -> L9e
            if (r3 != r2) goto L50
            return r2
        L50:
            r2 = r3
        L51:
            boolean r3 = kotlin.Result.m11925isFailureimpl(r2)     // Catch: java.lang.Exception -> L9e
            if (r3 == 0) goto L59
            r2 = 0
        L59:
            com.yhchat.canarys.data.model.StickyData r2 = (com.yhchat.canarys.data.model.StickyData) r2     // Catch: java.lang.Exception -> L9e
            if (r2 == 0) goto L9a
        L5e:
            java.util.List r2 = r2.getSticky()     // Catch: java.lang.Exception -> L9e
            if (r2 == 0) goto L9a
            java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Exception -> L9e
            r3 = 0
            boolean r6 = r2 instanceof java.util.Collection     // Catch: java.lang.Exception -> L9e
            if (r6 == 0) goto L77
            r6 = r2
            java.util.Collection r6 = (java.util.Collection) r6     // Catch: java.lang.Exception -> L9e
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Exception -> L9e
            if (r6 == 0) goto L77
            r2 = r5
            goto L96
        L77:
            java.util.Iterator r6 = r2.iterator()     // Catch: java.lang.Exception -> L9e
        L7b:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Exception -> L9e
            if (r7 == 0) goto L95
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Exception -> L9e
            r8 = r7
            com.yhchat.canarys.data.model.StickyItem r8 = (com.yhchat.canarys.data.model.StickyItem) r8     // Catch: java.lang.Exception -> L9e
            r9 = 0
            java.lang.String r10 = r8.getChatId()     // Catch: java.lang.Exception -> L9e
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r10, r12)     // Catch: java.lang.Exception -> L9e
            if (r10 == 0) goto L7b
            r2 = r4
            goto L96
        L95:
            r2 = r5
        L96:
            if (r2 != r4) goto L9b
            goto L9c
        L9a:
        L9b:
            r4 = r5
        L9c:
            r5 = r4
            goto La0
        L9e:
            r2 = move-exception
        La0:
            java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.conversation.ConversationViewModel.isConversationSticky(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationViewModel$markConversationAsRead$1", m185f = "ConversationViewModel.kt", m186i = {}, m187l = {457}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.conversation.ConversationViewModel$markConversationAsRead$1 */
    static final class C37431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ int $chatType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37431(String str, int i, Continuation<? super C37431> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$chatType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ConversationViewModel.this.new C37431(this.$chatId, this.$chatType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        Object objM8600getMessagesyxL6bBk$default = MessageRepository.m8600getMessagesyxL6bBk$default(ConversationViewModel.this.messageRepository, this.$chatId, this.$chatType, 1, null, this, 8, null);
                        if (objM8600getMessagesyxL6bBk$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8600getMessagesyxL6bBk$default;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ConversationViewModel conversationViewModel = ConversationViewModel.this;
                String str = this.$chatId;
                int i = this.$chatType;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl == null) {
                    List list = (List) result;
                    if (!list.isEmpty()) {
                        ChatMessage chatMessage = (ChatMessage) CollectionsKt.first(list);
                        if (chatMessage.getMsgSeq() != null) {
                            ReadPositionStore readPositionStore = conversationViewModel.readPositionStore;
                            String msgId = chatMessage.getMsgId();
                            Long msgSeq = chatMessage.getMsgSeq();
                            Intrinsics.checkNotNull(msgSeq);
                            readPositionStore.saveReadPosition(str, i, msgId, msgSeq.longValue());
                            Log.d("ConversationViewModel", "Marked as read: chatId=" + str + ", msgSeq=" + chatMessage.getMsgSeq());
                            conversationViewModel.updateLocalUnreadCount(str, 0);
                        }
                    }
                } else {
                    Boxing.boxInt(Log.e("ConversationViewModel", "Failed to mark as read: " + thM11922exceptionOrNullimpl.getMessage()));
                }
            } catch (Exception e) {
                Boxing.boxInt(Log.e("ConversationViewModel", "Exception marking as read", e));
            }
            return Unit.INSTANCE;
        }
    }

    public final void markConversationAsRead(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37431(str, i, null), 3, null);
    }

    public final void updateLocalUnreadCount(String str, int count) {
        int pagedIndex;
        List currentConversations = CollectionsKt.toMutableList((Collection) this._conversations.getValue());
        int index = 0;
        Iterator<Conversation> it = currentConversations.iterator();
        while (true) {
            pagedIndex = -1;
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((Conversation) it.next()).getChatId(), str)) {
                    break;
                } else {
                    index++;
                }
            } else {
                index = -1;
                break;
            }
        }
        if (index >= 0) {
            Conversation conversation = currentConversations.get(index);
            Conversation updatedConversation = conversation.copy((8095 & 1) != 0 ? conversation.chatId : null, (8095 & 2) != 0 ? conversation.chatType : 0, (8095 & 4) != 0 ? conversation.name : null, (8095 & 8) != 0 ? conversation.chatContent : null, (8095 & 16) != 0 ? conversation.timestampMs : 0L, (8095 & 32) != 0 ? conversation.unreadMessage : count, (8095 & 64) != 0 ? conversation.at : 0, (8095 & 128) != 0 ? conversation.avatarId : null, (8095 & 256) != 0 ? conversation.avatarUrl : null, (8095 & 512) != 0 ? conversation.doNotDisturb : null, (8095 & 1024) != 0 ? conversation.timestamp : 0L, (8095 & 2048) != 0 ? conversation.atData : null, (8095 & 4096) != 0 ? conversation.certificationLevel : null);
            currentConversations.set(index, updatedConversation);
            this._conversations.setValue(currentConversations);
            List pagedList = CollectionsKt.toMutableList((Collection) this._pagedConversations.getValue());
            int i = 0;
            Iterator<Conversation> it2 = pagedList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(((Conversation) it2.next()).getChatId(), str)) {
                    pagedIndex = i;
                    break;
                }
                i++;
            }
            if (pagedIndex >= 0) {
                pagedList.set(pagedIndex, updatedConversation);
                this._pagedConversations.setValue(pagedList);
            }
        }
    }

    public final int calculateUnreadCount(String str, int i, Long latestMsgSeq) {
        Pair readPosition;
        if (latestMsgSeq == null || (readPosition = this.readPositionStore.getReadPosition(str, i)) == null) {
            return 1;
        }
        long lastReadMsgSeq = readPosition.getSecond().longValue();
        int unreadCount = (int) (latestMsgSeq.longValue() - lastReadMsgSeq);
        if (unreadCount > 0) {
            return unreadCount;
        }
        return 0;
    }

    /* compiled from: ConversationViewModel.kt */
    @Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/ui/conversation/ConversationViewModel$ConversationUiState;", "", "isLoading", "", "error", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class ConversationUiState {
        public static final int $stable = 0;
        private final String error;
        private final boolean isLoading;

        public ConversationUiState() {
            this(false, null, 3, null);
        }

        public static /* synthetic */ ConversationUiState copy$default(ConversationUiState conversationUiState, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = conversationUiState.isLoading;
            }
            if ((i & 2) != 0) {
                str = conversationUiState.error;
            }
            return conversationUiState.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        /* renamed from: component2, reason: from getter */
        public final String getError() {
            return this.error;
        }

        public final ConversationUiState copy(boolean isLoading, String error) {
            return new ConversationUiState(isLoading, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConversationUiState)) {
                return false;
            }
            ConversationUiState conversationUiState = (ConversationUiState) other;
            return this.isLoading == conversationUiState.isLoading && Intrinsics.areEqual(this.error, conversationUiState.error);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode());
        }

        public String toString() {
            return "ConversationUiState(isLoading=" + this.isLoading + ", error=" + this.error + ")";
        }

        public ConversationUiState(boolean isLoading, String error) {
            this.isLoading = isLoading;
            this.error = error;
        }

        public /* synthetic */ ConversationUiState(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        public final String getError() {
            return this.error;
        }
    }
}
