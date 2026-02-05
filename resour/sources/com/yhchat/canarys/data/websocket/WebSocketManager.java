package com.yhchat.canarys.data.websocket;

import android.util.Log;
import androidx.compose.runtime.ComposerKt;
import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.data.repository.ConversationRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.group.bot_list;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* compiled from: WebSocketManager.kt */
@Singleton
@Metadata(m168d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000bH\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u000fJ\u0016\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000bJ\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0018J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018J\u0016\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001bH\u0082@\u00a2\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001dH\u0082@\u00a2\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&H\u0082@\u00a2\u0006\u0002\u0010'J\u0016\u0010(\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&H\u0082@\u00a2\u0006\u0002\u0010'J\u0016\u0010)\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0002\u0010+J\u0016\u0010,\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&H\u0082@\u00a2\u0006\u0002\u0010'J\u0016\u0010-\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020&H\u0082@\u00a2\u0006\u0002\u0010'J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020&H\u0002J\u0006\u0010/\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/WebSocketManager;", "", "webSocketService", "Lcom/yhchat/canarys/data/websocket/WebSocketService;", "messageRepository", "Lcom/yhchat/canarys/data/repository/MessageRepository;", "conversationRepository", "Lcom/yhchat/canarys/data/repository/ConversationRepository;", "<init>", "(Lcom/yhchat/canarys/data/websocket/WebSocketService;Lcom/yhchat/canarys/data/repository/MessageRepository;Lcom/yhchat/canarys/data/repository/ConversationRepository;)V", "tag", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "connect", "", "userId", "platform", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "sendDraftInput", ChatSearchActivity.EXTRA_CHAT_ID, "input", "getConnectionState", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/yhchat/canarys/data/websocket/ConnectionState;", "getMessageEvents", "Lcom/yhchat/canarys/data/websocket/MessageEvent;", "getConversationUpdates", "Lcom/yhchat/canarys/data/websocket/ConversationUpdate;", "handleMessageEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/yhchat/canarys/data/websocket/MessageEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleConversationUpdate", "update", "(Lcom/yhchat/canarys/data/websocket/ConversationUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertMessageToLocal", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "(Lcom/yhchat/canarys/data/model/ChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateLocalMessage", "deleteLocalMessage", "msgId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateConversationLastMessage", "updateConversationIfLastMessage", "getMessagePreview", "destroy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public final class WebSocketManager {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;
    private final MessageRepository messageRepository;
    private final CoroutineScope scope;
    private final String tag;
    private final WebSocketService webSocketService;

    /* compiled from: WebSocketManager.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketManager", m185f = "WebSocketManager.kt", m186i = {0}, m187l = {ComposerKt.providerMapsKey}, m188m = "deleteLocalMessage", m189n = {"msgId"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$deleteLocalMessage$1 */
    static final class C30511 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30511(Continuation<? super C30511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketManager.this.deleteLocalMessage(null, this);
        }
    }

    /* compiled from: WebSocketManager.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketManager", m185f = "WebSocketManager.kt", m186i = {0, 1}, m187l = {150, 157}, m188m = "handleConversationUpdate", m189n = {"update", "update"}, m191s = {"L$0", "L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$handleConversationUpdate$1 */
    static final class C30521 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30521(Continuation<? super C30521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketManager.this.handleConversationUpdate(null, this);
        }
    }

    /* compiled from: WebSocketManager.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketManager", m185f = "WebSocketManager.kt", m186i = {0, 1, 2}, m187l = {bot_list.Menu_data.SELECT_FIELD_NUMBER, 106, 113}, m188m = "handleMessageEvent", m189n = {NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT}, m191s = {"L$0", "L$0", "L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$handleMessageEvent$1 */
    static final class C30531 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30531(Continuation<? super C30531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketManager.this.handleMessageEvent(null, this);
        }
    }

    /* compiled from: WebSocketManager.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketManager", m185f = "WebSocketManager.kt", m186i = {0, 1, 1}, m187l = {171, 178}, m188m = "insertMessageToLocal", m189n = {"message", "message", "existingMessage"}, m191s = {"L$0", "L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$insertMessageToLocal$1 */
    static final class C30541 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C30541(Continuation<? super C30541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketManager.this.insertMessageToLocal(null, this);
        }
    }

    /* compiled from: WebSocketManager.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketManager", m185f = "WebSocketManager.kt", m186i = {0, 0, 0, 1, 1, 1, 1}, m187l = {275, 282}, m188m = "updateConversationIfLastMessage", m189n = {"message", "targetChatId", "targetChatType", "message", "targetChatId", "lastMessage", "targetChatType"}, m191s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$updateConversationIfLastMessage$1 */
    static final class C30551 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C30551(Continuation<? super C30551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketManager.this.updateConversationIfLastMessage(null, this);
        }
    }

    /* compiled from: WebSocketManager.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketManager", m185f = "WebSocketManager.kt", m186i = {0, 0, 0, 0, 1, 1, 1, 1}, m187l = {229, 249}, m188m = "updateConversationLastMessage", m189n = {"message", "targetChatId", "isPrivateChat", "targetChatType", "message", "targetChatId", "isPrivateChat", "targetChatType"}, m191s = {"L$0", "L$1", "Z$0", "I$0", "L$0", "L$1", "Z$0", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$updateConversationLastMessage$1 */
    static final class C30561 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C30561(Continuation<? super C30561> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketManager.this.updateConversationLastMessage(null, this);
        }
    }

    /* compiled from: WebSocketManager.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketManager", m185f = "WebSocketManager.kt", m186i = {0}, m187l = {192}, m188m = "updateLocalMessage", m189n = {"message"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$updateLocalMessage$1 */
    static final class C30571 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30571(Continuation<? super C30571> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketManager.this.updateLocalMessage(null, this);
        }
    }

    @Inject
    public WebSocketManager(WebSocketService webSocketService, MessageRepository messageRepository, ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(webSocketService, "webSocketService");
        Intrinsics.checkNotNullParameter(messageRepository, "messageRepository");
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        this.webSocketService = webSocketService;
        this.messageRepository = messageRepository;
        this.conversationRepository = conversationRepository;
        this.tag = "WebSocketManager";
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C30491(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C30502(null), 3, null);
        Log.d(this.tag, "WebSocketManager initialized with persistent listeners");
    }

    /* compiled from: WebSocketManager.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketManager$1", m185f = "WebSocketManager.kt", m186i = {}, m187l = {29}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$1 */
    static final class C30491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C30491(Continuation<? super C30491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebSocketManager.this.new C30491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WebSocketManager.kt */
        @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$1$1 */
        static final class AnonymousClass1<T> implements FlowCollector {
            AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                return emit((MessageEvent) value, (Continuation<? super Unit>) $completion);
            }

            public final Object emit(MessageEvent event, Continuation<? super Unit> continuation) {
                Log.d(webSocketManager.tag, "Received message event: " + Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName());
                Object objHandleMessageEvent = webSocketManager.handleMessageEvent(event, continuation);
                return objHandleMessageEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleMessageEvent : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (WebSocketManager.this.webSocketService.getMessageEvents().collect(new FlowCollector() { // from class: com.yhchat.canarys.data.websocket.WebSocketManager.1.1
                        AnonymousClass1() {
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((MessageEvent) value, (Continuation<? super Unit>) $completion);
                        }

                        public final Object emit(MessageEvent event, Continuation<? super Unit> continuation) {
                            Log.d(webSocketManager.tag, "Received message event: " + Reflection.getOrCreateKotlinClass(event.getClass()).getSimpleName());
                            Object objHandleMessageEvent = webSocketManager.handleMessageEvent(event, continuation);
                            return objHandleMessageEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleMessageEvent : Unit.INSTANCE;
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

    /* compiled from: WebSocketManager.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketManager$2", m185f = "WebSocketManager.kt", m186i = {}, m187l = {37}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$2 */
    static final class C30502 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C30502(Continuation<? super C30502> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebSocketManager.this.new C30502(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30502) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: WebSocketManager.kt */
        @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        /* renamed from: com.yhchat.canarys.data.websocket.WebSocketManager$2$1 */
        static final class AnonymousClass1<T> implements FlowCollector {
            AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                return emit((ConversationUpdate) value, (Continuation<? super Unit>) $completion);
            }

            public final Object emit(ConversationUpdate update, Continuation<? super Unit> continuation) {
                Log.d(webSocketManager.tag, "Received conversation update: " + Reflection.getOrCreateKotlinClass(update.getClass()).getSimpleName());
                Object objHandleConversationUpdate = webSocketManager.handleConversationUpdate(update, continuation);
                return objHandleConversationUpdate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleConversationUpdate : Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    if (WebSocketManager.this.webSocketService.getConversationUpdates().collect(new FlowCollector() { // from class: com.yhchat.canarys.data.websocket.WebSocketManager.2.1
                        AnonymousClass1() {
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((ConversationUpdate) value, (Continuation<? super Unit>) $completion);
                        }

                        public final Object emit(ConversationUpdate update, Continuation<? super Unit> continuation) {
                            Log.d(webSocketManager.tag, "Received conversation update: " + Reflection.getOrCreateKotlinClass(update.getClass()).getSimpleName());
                            Object objHandleConversationUpdate = webSocketManager.handleConversationUpdate(update, continuation);
                            return objHandleConversationUpdate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleConversationUpdate : Unit.INSTANCE;
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

    public static /* synthetic */ Object connect$default(WebSocketManager webSocketManager, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "android";
        }
        return webSocketManager.connect(str, str2, continuation);
    }

    public final Object connect(String userId, String platform, Continuation<? super Unit> continuation) {
        Log.d(this.tag, "Connecting WebSocket for user: " + userId);
        Object objConnect = this.webSocketService.connect(userId, platform, continuation);
        return objConnect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objConnect : Unit.INSTANCE;
    }

    public final void disconnect() {
        this.webSocketService.disconnect();
    }

    public final void sendDraftInput(String str, String input) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(input, "input");
        this.webSocketService.sendDraftInput(str, input);
    }

    public final SharedFlow<ConnectionState> getConnectionState() {
        return this.webSocketService.getConnectionState();
    }

    public final SharedFlow<MessageEvent> getMessageEvents() {
        return this.webSocketService.getMessageEvents();
    }

    public final SharedFlow<ConversationUpdate> getConversationUpdates() {
        return this.webSocketService.getConversationUpdates();
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleMessageEvent(com.yhchat.canarys.data.websocket.MessageEvent r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketManager.handleMessageEvent(com.yhchat.canarys.data.websocket.MessageEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleConversationUpdate(com.yhchat.canarys.data.websocket.ConversationUpdate r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.websocket.WebSocketManager.C30521
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.websocket.WebSocketManager$handleConversationUpdate$1 r0 = (com.yhchat.canarys.data.websocket.WebSocketManager.C30521) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.websocket.WebSocketManager$handleConversationUpdate$1 r0 = new com.yhchat.canarys.data.websocket.WebSocketManager$handleConversationUpdate$1
            r0.<init>(r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L3f;
                case 1: goto L36;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r8 = r2
            com.yhchat.canarys.data.websocket.ConversationUpdate r8 = (com.yhchat.canarys.data.websocket.ConversationUpdate) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Lcc
            goto Lc5
        L36:
            java.lang.Object r2 = r0.L$0
            r8 = r2
            com.yhchat.canarys.data.websocket.ConversationUpdate r8 = (com.yhchat.canarys.data.websocket.ConversationUpdate) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Lcc
            goto L86
        L3f:
            kotlin.ResultKt.throwOnFailure(r1)
            boolean r3 = r8 instanceof com.yhchat.canarys.data.websocket.ConversationUpdate.NewMessage     // Catch: java.lang.Exception -> Lcc
            if (r3 == 0) goto L87
            java.lang.String r3 = r7.tag     // Catch: java.lang.Exception -> Lcc
            r4 = r8
            com.yhchat.canarys.data.websocket.ConversationUpdate$NewMessage r4 = (com.yhchat.canarys.data.websocket.ConversationUpdate.NewMessage) r4     // Catch: java.lang.Exception -> Lcc
            com.yhchat.canarys.data.model.ChatMessage r4 = r4.getMessage()     // Catch: java.lang.Exception -> Lcc
            com.yhchat.canarys.data.model.MessageSender r4 = r4.getSender()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r4 = r4.getChatId()     // Catch: java.lang.Exception -> Lcc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcc
            r5.<init>()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r6 = "Updating conversation for new message from: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Exception -> Lcc
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch: java.lang.Exception -> Lcc
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lcc
            android.util.Log.d(r3, r4)     // Catch: java.lang.Exception -> Lcc
            r3 = r8
            com.yhchat.canarys.data.websocket.ConversationUpdate$NewMessage r3 = (com.yhchat.canarys.data.websocket.ConversationUpdate.NewMessage) r3     // Catch: java.lang.Exception -> Lcc
            com.yhchat.canarys.data.model.ChatMessage r3 = r3.getMessage()     // Catch: java.lang.Exception -> Lcc
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Exception -> Lcc
            r0.L$0 = r4     // Catch: java.lang.Exception -> Lcc
            r4 = 1
            r0.label = r4     // Catch: java.lang.Exception -> Lcc
            java.lang.Object r3 = r7.updateConversationLastMessage(r3, r0)     // Catch: java.lang.Exception -> Lcc
            if (r3 != r2) goto L86
            return r2
        L86:
            goto Ld7
        L87:
            boolean r3 = r8 instanceof com.yhchat.canarys.data.websocket.ConversationUpdate.MessageEdited     // Catch: java.lang.Exception -> Lcc
            if (r3 == 0) goto Lc6
            java.lang.String r3 = r7.tag     // Catch: java.lang.Exception -> Lcc
            r4 = r8
            com.yhchat.canarys.data.websocket.ConversationUpdate$MessageEdited r4 = (com.yhchat.canarys.data.websocket.ConversationUpdate.MessageEdited) r4     // Catch: java.lang.Exception -> Lcc
            com.yhchat.canarys.data.model.ChatMessage r4 = r4.getMessage()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r4 = r4.getMsgId()     // Catch: java.lang.Exception -> Lcc
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lcc
            r5.<init>()     // Catch: java.lang.Exception -> Lcc
            java.lang.String r6 = "Updating conversation for edited message: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Exception -> Lcc
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch: java.lang.Exception -> Lcc
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lcc
            android.util.Log.d(r3, r4)     // Catch: java.lang.Exception -> Lcc
            r3 = r8
            com.yhchat.canarys.data.websocket.ConversationUpdate$MessageEdited r3 = (com.yhchat.canarys.data.websocket.ConversationUpdate.MessageEdited) r3     // Catch: java.lang.Exception -> Lcc
            com.yhchat.canarys.data.model.ChatMessage r3 = r3.getMessage()     // Catch: java.lang.Exception -> Lcc
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Exception -> Lcc
            r0.L$0 = r4     // Catch: java.lang.Exception -> Lcc
            r4 = 2
            r0.label = r4     // Catch: java.lang.Exception -> Lcc
            java.lang.Object r3 = r7.updateConversationIfLastMessage(r3, r0)     // Catch: java.lang.Exception -> Lcc
            if (r3 != r2) goto Lc5
            return r2
        Lc5:
            goto Ld7
        Lc6:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Exception -> Lcc
            r2.<init>()     // Catch: java.lang.Exception -> Lcc
            throw r2     // Catch: java.lang.Exception -> Lcc
        Lcc:
            r2 = move-exception
            java.lang.String r3 = r7.tag
            java.lang.String r4 = "Error handling conversation update"
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
        Ld7:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketManager.handleConversationUpdate(com.yhchat.canarys.data.websocket.ConversationUpdate, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005d A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:50:0x0035, B:67:0x0097, B:53:0x003e, B:59:0x0059, B:61:0x005d, B:63:0x0082, B:56:0x0047), top: B:73:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0082 A[Catch: Exception -> 0x00b4, TryCatch #0 {Exception -> 0x00b4, blocks: (B:50:0x0035, B:67:0x0097, B:53:0x003e, B:59:0x0059, B:61:0x005d, B:63:0x0082, B:56:0x0047), top: B:73:0x0021 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object insertMessageToLocal(com.yhchat.canarys.data.model.ChatMessage r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.yhchat.canarys.data.websocket.WebSocketManager.C30541
            if (r0 == 0) goto L14
            r0 = r9
            com.yhchat.canarys.data.websocket.WebSocketManager$insertMessageToLocal$1 r0 = (com.yhchat.canarys.data.websocket.WebSocketManager.C30541) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.websocket.WebSocketManager$insertMessageToLocal$1 r0 = new com.yhchat.canarys.data.websocket.WebSocketManager$insertMessageToLocal$1
            r0.<init>(r9)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L43;
                case 1: goto L39;
                case 2: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$1
            com.yhchat.canarys.data.model.ChatMessage r2 = (com.yhchat.canarys.data.model.ChatMessage) r2
            java.lang.Object r3 = r0.L$0
            r8 = r3
            com.yhchat.canarys.data.model.ChatMessage r8 = (com.yhchat.canarys.data.model.ChatMessage) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Lb4
            goto L97
        L39:
            java.lang.Object r3 = r0.L$0
            r8 = r3
            com.yhchat.canarys.data.model.ChatMessage r8 = (com.yhchat.canarys.data.model.ChatMessage) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Lb4
            r3 = r1
            goto L59
        L43:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.MessageRepository r3 = r7.messageRepository     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = r8.getMsgId()     // Catch: java.lang.Exception -> Lb4
            r0.L$0 = r8     // Catch: java.lang.Exception -> Lb4
            r5 = 1
            r0.label = r5     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r3 = r3.getMessageById(r4, r0)     // Catch: java.lang.Exception -> Lb4
            if (r3 != r2) goto L59
            return r2
        L59:
            com.yhchat.canarys.data.model.ChatMessage r3 = (com.yhchat.canarys.data.model.ChatMessage) r3     // Catch: java.lang.Exception -> Lb4
            if (r3 == 0) goto L82
            java.lang.String r2 = r7.tag     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = r8.getMsgId()     // Catch: java.lang.Exception -> Lb4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb4
            r5.<init>()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r6 = "Message "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Exception -> Lb4
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r5 = " already exists, skipping insert"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lb4
            android.util.Log.d(r2, r4)     // Catch: java.lang.Exception -> Lb4
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> Lb4
            return r2
        L82:
            com.yhchat.canarys.data.repository.MessageRepository r4 = r7.messageRepository     // Catch: java.lang.Exception -> Lb4
            r0.L$0 = r8     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)     // Catch: java.lang.Exception -> Lb4
            r0.L$1 = r5     // Catch: java.lang.Exception -> Lb4
            r5 = 2
            r0.label = r5     // Catch: java.lang.Exception -> Lb4
            java.lang.Object r4 = r4.insertMessage(r8, r0)     // Catch: java.lang.Exception -> Lb4
            if (r4 != r2) goto L96
            return r2
        L96:
            r2 = r3
        L97:
            java.lang.String r3 = r7.tag     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = r8.getMsgId()     // Catch: java.lang.Exception -> Lb4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb4
            r5.<init>()     // Catch: java.lang.Exception -> Lb4
            java.lang.String r6 = "Inserted new message: "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Exception -> Lb4
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch: java.lang.Exception -> Lb4
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lb4
            android.util.Log.d(r3, r4)     // Catch: java.lang.Exception -> Lb4
            goto Lbf
        Lb4:
            r2 = move-exception
            java.lang.String r3 = r7.tag
            java.lang.String r4 = "Error inserting message to local storage"
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
        Lbf:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketManager.insertMessageToLocal(com.yhchat.canarys.data.model.ChatMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateLocalMessage(com.yhchat.canarys.data.model.ChatMessage r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.yhchat.canarys.data.websocket.WebSocketManager.C30571
            if (r0 == 0) goto L14
            r0 = r8
            com.yhchat.canarys.data.websocket.WebSocketManager$updateLocalMessage$1 r0 = (com.yhchat.canarys.data.websocket.WebSocketManager.C30571) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.websocket.WebSocketManager$updateLocalMessage$1 r0 = new com.yhchat.canarys.data.websocket.WebSocketManager$updateLocalMessage$1
            r0.<init>(r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r7 = r2
            com.yhchat.canarys.data.model.ChatMessage r7 = (com.yhchat.canarys.data.model.ChatMessage) r7
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L64
            goto L47
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.MessageRepository r3 = r6.messageRepository     // Catch: java.lang.Exception -> L64
            r0.L$0 = r7     // Catch: java.lang.Exception -> L64
            r4 = 1
            r0.label = r4     // Catch: java.lang.Exception -> L64
            java.lang.Object r3 = r3.updateMessage(r7, r0)     // Catch: java.lang.Exception -> L64
            if (r3 != r2) goto L47
            return r2
        L47:
            java.lang.String r2 = r6.tag     // Catch: java.lang.Exception -> L64
            java.lang.String r3 = r7.getMsgId()     // Catch: java.lang.Exception -> L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L64
            r4.<init>()     // Catch: java.lang.Exception -> L64
            java.lang.String r5 = "Updated local message: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Exception -> L64
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Exception -> L64
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L64
            android.util.Log.d(r2, r3)     // Catch: java.lang.Exception -> L64
            goto L6f
        L64:
            r2 = move-exception
            java.lang.String r3 = r6.tag
            java.lang.String r4 = "Error updating local message"
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
        L6f:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketManager.updateLocalMessage(com.yhchat.canarys.data.model.ChatMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deleteLocalMessage(java.lang.String r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.yhchat.canarys.data.websocket.WebSocketManager.C30511
            if (r0 == 0) goto L14
            r0 = r8
            com.yhchat.canarys.data.websocket.WebSocketManager$deleteLocalMessage$1 r0 = (com.yhchat.canarys.data.websocket.WebSocketManager.C30511) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.websocket.WebSocketManager$deleteLocalMessage$1 r0 = new com.yhchat.canarys.data.websocket.WebSocketManager$deleteLocalMessage$1
            r0.<init>(r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L60
            goto L47
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.repository.MessageRepository r3 = r6.messageRepository     // Catch: java.lang.Exception -> L60
            r0.L$0 = r7     // Catch: java.lang.Exception -> L60
            r4 = 1
            r0.label = r4     // Catch: java.lang.Exception -> L60
            java.lang.Object r3 = r3.deleteMessage(r7, r0)     // Catch: java.lang.Exception -> L60
            if (r3 != r2) goto L47
            return r2
        L47:
            java.lang.String r2 = r6.tag     // Catch: java.lang.Exception -> L60
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L60
            r3.<init>()     // Catch: java.lang.Exception -> L60
            java.lang.String r4 = "Deleted local message: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L60
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Exception -> L60
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L60
            android.util.Log.d(r2, r3)     // Catch: java.lang.Exception -> L60
            goto L6b
        L60:
            r2 = move-exception
            java.lang.String r3 = r6.tag
            java.lang.String r4 = "Error deleting local message"
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
        L6b:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketManager.deleteLocalMessage(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateConversationLastMessage(com.yhchat.canarys.data.model.ChatMessage r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketManager.updateConversationLastMessage(com.yhchat.canarys.data.model.ChatMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0094 A[Catch: Exception -> 0x00eb, TryCatch #0 {Exception -> 0x00eb, blocks: (B:61:0x003c, B:88:0x00ce, B:64:0x004c, B:78:0x008f, B:80:0x0094, B:82:0x009a, B:84:0x00a4, B:67:0x0056, B:69:0x005c, B:70:0x0064, B:72:0x006b, B:74:0x0078, B:73:0x0070), top: B:94:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00a4 A[Catch: Exception -> 0x00eb, TryCatch #0 {Exception -> 0x00eb, blocks: (B:61:0x003c, B:88:0x00ce, B:64:0x004c, B:78:0x008f, B:80:0x0094, B:82:0x009a, B:84:0x00a4, B:67:0x0056, B:69:0x005c, B:70:0x0064, B:72:0x006b, B:74:0x0078, B:73:0x0070), top: B:94:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object updateConversationIfLastMessage(com.yhchat.canarys.data.model.ChatMessage r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketManager.updateConversationIfLastMessage(com.yhchat.canarys.data.model.ChatMessage, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String getMessagePreview(ChatMessage message) {
        String contentPreview;
        String text = message.getContent().getText();
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
                                contentPreview = !(postTitle == null || postTitle.length() == 0) ? "[\u6587\u7ae0]" + message.getContent().getPostTitle() : "[\u6d88\u606f]";
                            } else {
                                contentPreview = "[\u8868\u60c5]";
                            }
                        } else {
                            contentPreview = "[\u89c6\u9891]";
                        }
                    } else {
                        contentPreview = "[\u8bed\u97f3]";
                    }
                }
            } else {
                contentPreview = "[\u56fe\u7247]";
            }
        } else {
            contentPreview = message.getContent().getText();
        }
        Integer chatType = message.getChatType();
        int targetChatType = chatType != null ? chatType.intValue() : message.getSender().getChatType();
        switch (targetChatType) {
            case 2:
            case 3:
                return message.getSender().getName() + "\uff1a" + contentPreview;
            default:
                return contentPreview;
        }
    }

    public final void destroy() {
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        this.webSocketService.destroy();
    }
}
