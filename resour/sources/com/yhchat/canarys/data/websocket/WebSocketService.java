package com.yhchat.canarys.data.websocket;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.yhchat.canarys.AppForegroundTracker;
import com.yhchat.canarys.C3011R;
import com.yhchat.canarys.MainActivity;
import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.data.model.Conversation;
import com.yhchat.canarys.data.model.MessageCmd;
import com.yhchat.canarys.data.model.MessageContent;
import com.yhchat.canarys.data.model.MessageSender;
import com.yhchat.canarys.data.model.MessageTag;
import com.yhchat.canarys.data.repository.CacheRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.websocket.MessageEvent;
import com.yhchat.canarys.p007ui.chat.ChatActivity;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.chat_ws_go.WsMsg;
import com.yhchat.canarys.proto.chat_ws_go.WsTag;
import com.yhchat.canarys.proto.chat_ws_go.bot_board_message;
import com.yhchat.canarys.proto.chat_ws_go.draft_input;
import com.yhchat.canarys.proto.chat_ws_go.edit_message;
import com.yhchat.canarys.proto.chat_ws_go.heartbeat_ack;
import com.yhchat.canarys.proto.chat_ws_go.push_message;
import com.yhchat.canarys.proto.chat_ws_go.stream_message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.ByteString;

/* compiled from: WebSocketService.kt */
@Singleton
@Metadata(m168d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 B2\u00020\u0001:\u0001BB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J \u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\t2\b\b\u0002\u0010+\u001a\u00020\tH\u0086@\u00a2\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\tJ\u0006\u00100\u001a\u00020)J\u0010\u00101\u001a\u00020)2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u00102\u001a\u00020)2\u0006\u00103\u001a\u000204H\u0002J\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020)2\u0006\u0010:\u001a\u000206H\u0002J \u0010;\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\tH\u0002J\b\u0010?\u001a\u00020)H\u0002J\b\u0010@\u001a\u00020)H\u0002J\u0006\u0010A\u001a\u00020)R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001b\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u000e\u0010&\u001a\u00020'X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/WebSocketService;", "", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "context", "Landroid/content/Context;", "<init>", "(Lcom/yhchat/canarys/data/repository/TokenRepository;Landroid/content/Context;)V", "tag", "", "gson", "Lcom/google/gson/Gson;", "webSocket", "Lokhttp3/WebSocket;", "heartbeatJob", "Lkotlinx/coroutines/Job;", "isConnected", "", "shouldReconnect", "currentUserId", "currentDeviceId", "scope", "Lkotlinx/coroutines/CoroutineScope;", "_messageEvents", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/yhchat/canarys/data/websocket/MessageEvent;", "messageEvents", "Lkotlinx/coroutines/flow/SharedFlow;", "getMessageEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "_connectionState", "Lcom/yhchat/canarys/data/websocket/ConnectionState;", "connectionState", "getConnectionState", "_conversationUpdates", "Lcom/yhchat/canarys/data/websocket/ConversationUpdate;", "conversationUpdates", "getConversationUpdates", "okHttpClient", "Lokhttp3/OkHttpClient;", "connect", "", "userId", "platform", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendDraftInput", ChatSearchActivity.EXTRA_CHAT_ID, "input", "disconnect", "startHeartbeat", "handleBinaryMessage", "bytes", "", "convertWsMsgToMessage", "Lcom/yhchat/canarys/data/model/ChatMessage;", "protoMsg", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg;", "showMessageNotification", "message", "getConversationTitle", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "senderName", "createNotificationChannel", "cleanup", "destroy", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public final class WebSocketService {
    private static final String NOTIFICATION_CHANNEL_ID = "chat_messages";
    private static final int NOTIFICATION_ID_BASE = 1000;
    private final MutableSharedFlow<ConnectionState> _connectionState;
    private final MutableSharedFlow<ConversationUpdate> _conversationUpdates;
    private final MutableSharedFlow<MessageEvent> _messageEvents;
    private final SharedFlow<ConnectionState> connectionState;
    private final Context context;
    private final SharedFlow<ConversationUpdate> conversationUpdates;
    private String currentDeviceId;
    private String currentUserId;
    private final Gson gson;
    private Job heartbeatJob;
    private boolean isConnected;
    private final SharedFlow<MessageEvent> messageEvents;
    private final OkHttpClient okHttpClient;
    private final CoroutineScope scope;
    private boolean shouldReconnect;
    private final String tag;
    private final TokenRepository tokenRepository;
    private WebSocket webSocket;
    public static final int $stable = 8;

    /* compiled from: WebSocketService.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketService", m185f = "WebSocketService.kt", m186i = {0, 0, 0, 0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4}, m187l = {116, 119, 122, 130, 227}, m188m = "connect", m189n = {"userId", "platform", "oldSocket\\1", "$i$a$-let-WebSocketService$connect$2\\1\\110\\0", "userId", "platform", "userId", "platform", "token", "userId", "platform", "token", "userId", "platform", "token", "e"}, m191s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketService$connect$1 */
    static final class C30581 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C30581(Continuation<? super C30581> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebSocketService.this.connect(null, null, this);
        }
    }

    @Inject
    public WebSocketService(TokenRepository tokenRepository, Context context) {
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.tokenRepository = tokenRepository;
        this.context = context;
        this.tag = "WebSocketService";
        this.gson = new Gson();
        this.shouldReconnect = true;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.currentDeviceId = StringsKt.replace$default(string, "-", "", false, 4, (Object) null);
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        this._messageEvents = SharedFlowKt.MutableSharedFlow$default(0, 100, null, 4, null);
        this.messageEvents = FlowKt.asSharedFlow(this._messageEvents);
        this._connectionState = SharedFlowKt.MutableSharedFlow$default(1, 10, null, 4, null);
        this.connectionState = FlowKt.asSharedFlow(this._connectionState);
        this._conversationUpdates = SharedFlowKt.MutableSharedFlow$default(0, 50, null, 4, null);
        this.conversationUpdates = FlowKt.asSharedFlow(this._conversationUpdates);
        this.okHttpClient = new OkHttpClient.Builder().connectTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).pingInterval(30L, TimeUnit.SECONDS).retryOnConnectionFailure(true).build();
        createNotificationChannel();
    }

    public final SharedFlow<MessageEvent> getMessageEvents() {
        return this.messageEvents;
    }

    public final SharedFlow<ConnectionState> getConnectionState() {
        return this.connectionState;
    }

    public final SharedFlow<ConversationUpdate> getConversationUpdates() {
        return this.conversationUpdates;
    }

    public static /* synthetic */ Object connect$default(WebSocketService webSocketService, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "windows";
        }
        return webSocketService.connect(str, str2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00e9 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object connect(java.lang.String r9, java.lang.String r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketService.connect(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J \u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\"\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016\u00a8\u0006\u0015"}, m169d2 = {"com/yhchat/canarys/data/websocket/WebSocketService$connect$3", "Lokhttp3/WebSocketListener;", "onOpen", "", "webSocket", "Lokhttp3/WebSocket;", "response", "Lokhttp3/Response;", "onMessage", "bytes", "Lokio/ByteString;", "text", "", "onClosing", "code", "", "reason", "onClosed", "onFailure", "t", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketService$connect$3 */
    public static final class C30593 extends WebSocketListener {
        final /* synthetic */ String $platform;
        final /* synthetic */ String $token;
        final /* synthetic */ String $userId;

        C30593(String $userId, String $token, String $platform) {
            $userId = $userId;
            $token = $token;
            $platform = $platform;
        }

        @Override // okhttp3.WebSocketListener
        public void onOpen(WebSocket webSocket, Response response) throws JsonIOException {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(response, "response");
            Log.d(WebSocketService.this.tag, "WebSocket opened");
            WebSocketService.this.isConnected = true;
            JsonObject jsonObject = new JsonObject();
            String str = $userId;
            String str2 = $token;
            String str3 = $platform;
            WebSocketService webSocketService = WebSocketService.this;
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            jsonObject.addProperty("seq", StringsKt.replace$default(string, "-", "", false, 4, (Object) null));
            jsonObject.addProperty("cmd", "login");
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("userId", str);
            jsonObject2.addProperty("token", str2);
            jsonObject2.addProperty("platform", str3);
            jsonObject2.addProperty("deviceId", webSocketService.currentDeviceId);
            Unit unit = Unit.INSTANCE;
            jsonObject.add("data", jsonObject2);
            String loginJson = WebSocketService.this.gson.toJson((JsonElement) jsonObject);
            Log.d(WebSocketService.this.tag, "Sending login: " + loginJson);
            Intrinsics.checkNotNull(loginJson);
            webSocket.send(loginJson);
            BuildersKt__Builders_commonKt.launch$default(WebSocketService.this.scope, null, null, new WebSocketService$connect$3$onOpen$1(WebSocketService.this, null), 3, null);
            WebSocketService.this.startHeartbeat(webSocket);
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, ByteString bytes) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            try {
                Log.d(WebSocketService.this.tag, "\u1f4e9 Received binary message (" + bytes.size() + " bytes)");
                WebSocketService.this.handleBinaryMessage(bytes.toByteArray());
            } catch (Exception e) {
                Log.e(WebSocketService.this.tag, "\u274c Error handling binary message", e);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onMessage(WebSocket webSocket, String text) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(text, "text");
            try {
                Log.d(WebSocketService.this.tag, "Received text message (unexpected): " + text);
            } catch (Exception e) {
                Log.e(WebSocketService.this.tag, "Error handling text message", e);
            }
        }

        @Override // okhttp3.WebSocketListener
        public void onClosing(WebSocket webSocket, int code, String reason) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Log.d(WebSocketService.this.tag, "WebSocket closing: " + code + " " + reason);
            WebSocketService.this.cleanup();
        }

        @Override // okhttp3.WebSocketListener
        public void onClosed(WebSocket webSocket, int code, String reason) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Log.d(WebSocketService.this.tag, "WebSocket closed: " + code + " " + reason);
            WebSocketService.this.cleanup();
            BuildersKt__Builders_commonKt.launch$default(WebSocketService.this.scope, null, null, new WebSocketService$connect$3$onClosed$1(WebSocketService.this, $userId, $platform, null), 3, null);
        }

        @Override // okhttp3.WebSocketListener
        public void onFailure(WebSocket webSocket, Throwable t, Response response) {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(t, "t");
            Log.e(WebSocketService.this.tag, "\u274c WebSocket failure: " + t.getClass().getSimpleName() + " - " + t.getMessage(), t);
            if (response != null) {
                Log.e(WebSocketService.this.tag, "Response code: " + response.code() + ", message: " + response.message());
            }
            WebSocketService.this.cleanup();
            BuildersKt__Builders_commonKt.launch$default(WebSocketService.this.scope, null, null, new WebSocketService$connect$3$onFailure$1(WebSocketService.this, t, $userId, $platform, null), 3, null);
        }
    }

    public final void sendDraftInput(String str, String input) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(input, "input");
        if (!this.isConnected || this.webSocket == null) {
            Log.w(this.tag, "WebSocket not connected, cannot send draft");
            return;
        }
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty(ChatSearchActivity.EXTRA_CHAT_ID, str);
            jsonObject.addProperty("input", input);
            jsonObject.addProperty("deviceId", this.currentDeviceId);
            JsonObject jsonObject2 = new JsonObject();
            String string = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            jsonObject2.addProperty("seq", StringsKt.replace$default(string, "-", "", false, 4, (Object) null));
            jsonObject2.addProperty("cmd", "inputInfo");
            jsonObject2.add("data", jsonObject);
            String draftJson = this.gson.toJson((JsonElement) jsonObject2);
            Log.d(this.tag, "Sending draft input: " + draftJson);
            WebSocket webSocket = this.webSocket;
            if (webSocket != null) {
                Intrinsics.checkNotNull(draftJson);
                webSocket.send(draftJson);
            }
        } catch (Exception e) {
            Log.e(this.tag, "Error sending draft input", e);
        }
    }

    public final void disconnect() {
        Log.d(this.tag, "Disconnecting WebSocket");
        this.shouldReconnect = false;
        cleanup();
        WebSocket webSocket = this.webSocket;
        if (webSocket != null) {
            webSocket.close(1000, "User disconnect");
        }
        this.webSocket = null;
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketService$startHeartbeat$1", m185f = "WebSocketService.kt", m186i = {}, m187l = {280}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketService$startHeartbeat$1 */
    static final class C30651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ WebSocket $webSocket;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30651(WebSocket webSocket, Continuation<? super C30651> continuation) {
            super(2, continuation);
            this.$webSocket = webSocket;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebSocketService.this.new C30651(this.$webSocket, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0040 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0041 -> B:39:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.label
                switch(r1) {
                    case 0: goto L1a;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L11:
                kotlin.ResultKt.throwOnFailure(r14)     // Catch: java.lang.Exception -> L16
                r1 = r13
                goto L41
            L16:
                r0 = move-exception
                r1 = r13
                goto L9c
            L1a:
                kotlin.ResultKt.throwOnFailure(r14)
                r1 = r13
            L1e:
                com.yhchat.canarys.data.websocket.WebSocketService r2 = com.yhchat.canarys.data.websocket.WebSocketService.this
                boolean r2 = com.yhchat.canarys.data.websocket.WebSocketService.access$isConnected$p(r2)
                if (r2 == 0) goto Lab
                r2 = 0
                kotlin.coroutines.CoroutineContext r3 = r1.getContext()
                boolean r2 = kotlinx.coroutines.JobKt.isActive(r3)
                if (r2 == 0) goto Lab
            L32:
                r2 = r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2     // Catch: java.lang.Exception -> L9b
                r3 = 1
                r1.label = r3     // Catch: java.lang.Exception -> L9b
                r3 = 30000(0x7530, double:1.4822E-319)
                java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r3, r2)     // Catch: java.lang.Exception -> L9b
                if (r2 != r0) goto L41
                return r0
            L41:
                com.google.gson.JsonObject r2 = new com.google.gson.JsonObject     // Catch: java.lang.Exception -> L9b
                r2.<init>()     // Catch: java.lang.Exception -> L9b
                r3 = r2
                r4 = 0
                java.lang.String r5 = "seq"
                java.util.UUID r6 = java.util.UUID.randomUUID()     // Catch: java.lang.Exception -> L9b
                java.lang.String r7 = r6.toString()     // Catch: java.lang.Exception -> L9b
                java.lang.String r6 = "toString(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)     // Catch: java.lang.Exception -> L9b
                java.lang.String r8 = "-"
                java.lang.String r9 = ""
                r11 = 4
                r12 = 0
                r10 = 0
                java.lang.String r6 = kotlin.text.StringsKt.replace$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L9b
                r3.addProperty(r5, r6)     // Catch: java.lang.Exception -> L9b
                java.lang.String r5 = "cmd"
                java.lang.String r6 = "heartbeat"
                r3.addProperty(r5, r6)     // Catch: java.lang.Exception -> L9b
                java.lang.String r5 = "data"
                com.google.gson.JsonObject r6 = new com.google.gson.JsonObject     // Catch: java.lang.Exception -> L9b
                r6.<init>()     // Catch: java.lang.Exception -> L9b
                com.google.gson.JsonElement r6 = (com.google.gson.JsonElement) r6     // Catch: java.lang.Exception -> L9b
                r3.add(r5, r6)     // Catch: java.lang.Exception -> L9b
                com.yhchat.canarys.data.websocket.WebSocketService r3 = com.yhchat.canarys.data.websocket.WebSocketService.this     // Catch: java.lang.Exception -> L9b
                com.google.gson.Gson r3 = com.yhchat.canarys.data.websocket.WebSocketService.access$getGson$p(r3)     // Catch: java.lang.Exception -> L9b
                r4 = r2
                com.google.gson.JsonElement r4 = (com.google.gson.JsonElement) r4     // Catch: java.lang.Exception -> L9b
                java.lang.String r3 = r3.toJson(r4)     // Catch: java.lang.Exception -> L9b
                com.yhchat.canarys.data.websocket.WebSocketService r4 = com.yhchat.canarys.data.websocket.WebSocketService.this     // Catch: java.lang.Exception -> L9b
                java.lang.String r4 = com.yhchat.canarys.data.websocket.WebSocketService.access$getTag$p(r4)     // Catch: java.lang.Exception -> L9b
                java.lang.String r5 = "Sending heartbeat"
                android.util.Log.d(r4, r5)     // Catch: java.lang.Exception -> L9b
                okhttp3.WebSocket r4 = r1.$webSocket     // Catch: java.lang.Exception -> L9b
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)     // Catch: java.lang.Exception -> L9b
                r4.send(r3)     // Catch: java.lang.Exception -> L9b
                goto L1e
            L9b:
                r0 = move-exception
            L9c:
                com.yhchat.canarys.data.websocket.WebSocketService r2 = com.yhchat.canarys.data.websocket.WebSocketService.this
                java.lang.String r2 = com.yhchat.canarys.data.websocket.WebSocketService.access$getTag$p(r2)
                java.lang.String r3 = "Error sending heartbeat"
                r4 = r0
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                android.util.Log.e(r2, r3, r4)
            Lab:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketService.C30651.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void startHeartbeat(WebSocket webSocket) {
        this.heartbeatJob = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C30651(webSocket, null), 3, null);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void handleBinaryMessage(byte[] bytes) {
        String strTake;
        try {
            heartbeat_ack tempMsg = heartbeat_ack.parseFrom(bytes);
            String cmd = tempMsg.getInfo().getCmd();
            String seq = tempMsg.getInfo().getSeq();
            Log.d(this.tag, "Message command: " + cmd + ", seq: " + seq);
            if (cmd != null) {
                switch (cmd.hashCode()) {
                    case -1718961485:
                        if (!cmd.equals("login_ack")) {
                            break;
                        } else {
                            Log.d(this.tag, "\u2705 Received login_ack (binary protobuf)");
                            return;
                        }
                    case -1613940026:
                        if (!cmd.equals("heartbeat_ack")) {
                            break;
                        } else {
                            Log.d(this.tag, "\u2705 Received heartbeat_ack");
                            return;
                        }
                    case -1077840074:
                        if (!cmd.equals("bot_board_message")) {
                            break;
                        } else {
                            bot_board_message botBoardMessage = bot_board_message.parseFrom(bytes);
                            if (botBoardMessage.hasData() && botBoardMessage.getData().hasBoard()) {
                                bot_board_message.BoardData.BoardContent board = botBoardMessage.getData().getBoard();
                                Log.d(this.tag, "Received bot board message from " + board.getBotId() + ": " + board.getContent());
                                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C30634(board, null), 3, null);
                                return;
                            }
                            return;
                        }
                    case 605730732:
                        if (!cmd.equals("draft_input")) {
                            break;
                        } else {
                            draft_input draftInput = draft_input.parseFrom(bytes);
                            if (draftInput.hasData() && draftInput.getData().hasDraft()) {
                                draft_input.DraftData.Draft draft = draftInput.getData().getDraft();
                                Log.d(this.tag, "Received draft input for chat " + draft.getChatId() + ": " + draft.getInput());
                                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C30623(draft, null), 3, null);
                                return;
                            }
                            return;
                        }
                        break;
                    case 679713762:
                        if (!cmd.equals("push_message")) {
                            break;
                        } else {
                            push_message pushMessage = push_message.parseFrom(bytes);
                            if (pushMessage.hasData() && pushMessage.getData().hasMsg()) {
                                WsMsg protoMsg = pushMessage.getData().getMsg();
                                Intrinsics.checkNotNull(protoMsg);
                                ChatMessage chatMessage = convertWsMsgToMessage(protoMsg);
                                Log.d(this.tag, "Push message details:");
                                Log.d(this.tag, "  - Message ID: " + chatMessage.getMsgId());
                                Log.d(this.tag, "  - Sender: " + chatMessage.getSender().getChatId() + " (type: " + chatMessage.getSender().getChatType() + ")");
                                Log.d(this.tag, "  - Target Chat: " + chatMessage.getChatId() + " (type: " + chatMessage.getChatType() + ")");
                                Log.d(this.tag, "  - Receiver: " + chatMessage.getRecvId());
                                String str = this.tag;
                                String text = chatMessage.getContent().getText();
                                if (text == null || (strTake = StringsKt.take(text, 50)) == null) {
                                    strTake = "[\u975e\u6587\u672c\u6d88\u606f]";
                                }
                                Log.d(str, "  - Content: " + strTake);
                                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C30601(chatMessage, null), 3, null);
                                Log.d(this.tag, "Received new message: " + chatMessage.getMsgId());
                                return;
                            }
                            return;
                        }
                    case 734557768:
                        if (!cmd.equals("stream_message")) {
                            break;
                        } else {
                            stream_message streamMsg = stream_message.parseFrom(bytes);
                            if (streamMsg.hasData() && streamMsg.getData().hasMsg()) {
                                stream_message.Data.StreamMsg msg = streamMsg.getData().getMsg();
                                Log.d(this.tag, "Received stream message for chat " + msg.getChatId() + ", msgId: " + msg.getMsgId() + ", content: " + msg.getContent());
                                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C30645(msg, null), 3, null);
                                return;
                            }
                            return;
                        }
                    case 1493723858:
                        if (!cmd.equals("edit_message")) {
                            break;
                        } else {
                            edit_message editMessage = edit_message.parseFrom(bytes);
                            if (editMessage.hasData() && editMessage.getData().hasMsg()) {
                                WsMsg protoMsg2 = editMessage.getData().getMsg();
                                Intrinsics.checkNotNull(protoMsg2);
                                ChatMessage chatMessage2 = convertWsMsgToMessage(protoMsg2);
                                BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new C30612(chatMessage2, null), 3, null);
                                Log.d(this.tag, "Received edited message: " + chatMessage2.getMsgId());
                                return;
                            }
                            return;
                        }
                }
            }
            Log.d(this.tag, "Unhandled message command: " + cmd);
        } catch (Exception e) {
            Log.e(this.tag, "Error parsing binary message", e);
        }
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketService$handleBinaryMessage$1", m185f = "WebSocketService.kt", m186i = {}, m187l = {340, 343}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketService$handleBinaryMessage$1 */
    static final class C30601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatMessage $chatMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30601(ChatMessage chatMessage, Continuation<? super C30601> continuation) {
            super(2, continuation);
            this.$chatMessage = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebSocketService.this.new C30601(this.$chatMessage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                switch(r1) {
                    case 0: goto L19;
                    case 1: goto L15;
                    case 2: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L11:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L50
            L15:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L36
            L19:
                kotlin.ResultKt.throwOnFailure(r6)
                com.yhchat.canarys.data.websocket.WebSocketService r1 = com.yhchat.canarys.data.websocket.WebSocketService.this
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.yhchat.canarys.data.websocket.WebSocketService.access$get_messageEvents$p(r1)
                com.yhchat.canarys.data.websocket.MessageEvent$NewMessage r2 = new com.yhchat.canarys.data.websocket.MessageEvent$NewMessage
                com.yhchat.canarys.data.model.ChatMessage r3 = r5.$chatMessage
                r2.<init>(r3)
                r3 = r5
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4 = 1
                r5.label = r4
                java.lang.Object r1 = r1.emit(r2, r3)
                if (r1 != r0) goto L36
                return r0
            L36:
                com.yhchat.canarys.data.websocket.WebSocketService r1 = com.yhchat.canarys.data.websocket.WebSocketService.this
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.yhchat.canarys.data.websocket.WebSocketService.access$get_conversationUpdates$p(r1)
                com.yhchat.canarys.data.websocket.ConversationUpdate$NewMessage r2 = new com.yhchat.canarys.data.websocket.ConversationUpdate$NewMessage
                com.yhchat.canarys.data.model.ChatMessage r3 = r5.$chatMessage
                r2.<init>(r3)
                r3 = r5
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4 = 2
                r5.label = r4
                java.lang.Object r1 = r1.emit(r2, r3)
                if (r1 != r0) goto L50
                return r0
            L50:
                com.yhchat.canarys.data.websocket.WebSocketService r0 = com.yhchat.canarys.data.websocket.WebSocketService.this
                com.yhchat.canarys.data.model.ChatMessage r1 = r5.$chatMessage
                com.yhchat.canarys.data.websocket.WebSocketService.access$showMessageNotification(r0, r1)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketService.C30601.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketService$handleBinaryMessage$2", m185f = "WebSocketService.kt", m186i = {}, m187l = {361, 362}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketService$handleBinaryMessage$2 */
    static final class C30612 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatMessage $chatMessage;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30612(ChatMessage chatMessage, Continuation<? super C30612> continuation) {
            super(2, continuation);
            this.$chatMessage = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebSocketService.this.new C30612(this.$chatMessage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30612) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x004f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                switch(r1) {
                    case 0: goto L19;
                    case 1: goto L15;
                    case 2: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L11:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L50
            L15:
                kotlin.ResultKt.throwOnFailure(r6)
                goto L36
            L19:
                kotlin.ResultKt.throwOnFailure(r6)
                com.yhchat.canarys.data.websocket.WebSocketService r1 = com.yhchat.canarys.data.websocket.WebSocketService.this
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.yhchat.canarys.data.websocket.WebSocketService.access$get_messageEvents$p(r1)
                com.yhchat.canarys.data.websocket.MessageEvent$MessageEdited r2 = new com.yhchat.canarys.data.websocket.MessageEvent$MessageEdited
                com.yhchat.canarys.data.model.ChatMessage r3 = r5.$chatMessage
                r2.<init>(r3)
                r3 = r5
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4 = 1
                r5.label = r4
                java.lang.Object r1 = r1.emit(r2, r3)
                if (r1 != r0) goto L36
                return r0
            L36:
                com.yhchat.canarys.data.websocket.WebSocketService r1 = com.yhchat.canarys.data.websocket.WebSocketService.this
                kotlinx.coroutines.flow.MutableSharedFlow r1 = com.yhchat.canarys.data.websocket.WebSocketService.access$get_conversationUpdates$p(r1)
                com.yhchat.canarys.data.websocket.ConversationUpdate$MessageEdited r2 = new com.yhchat.canarys.data.websocket.ConversationUpdate$MessageEdited
                com.yhchat.canarys.data.model.ChatMessage r3 = r5.$chatMessage
                r2.<init>(r3)
                r3 = r5
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4 = 2
                r5.label = r4
                java.lang.Object r1 = r1.emit(r2, r3)
                if (r1 != r0) goto L50
                return r0
            L50:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.websocket.WebSocketService.C30612.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketService$handleBinaryMessage$3", m185f = "WebSocketService.kt", m186i = {}, m187l = {377}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketService$handleBinaryMessage$3 */
    static final class C30623 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ draft_input.DraftData.Draft $draft;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30623(draft_input.DraftData.Draft draft, Continuation<? super C30623> continuation) {
            super(2, continuation);
            this.$draft = draft;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebSocketService.this.new C30623(this.$draft, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30623) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    MutableSharedFlow mutableSharedFlow = WebSocketService.this._messageEvents;
                    String chatId = this.$draft.getChatId();
                    Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
                    String input = this.$draft.getInput();
                    Intrinsics.checkNotNullExpressionValue(input, "getInput(...)");
                    this.label = 1;
                    if (mutableSharedFlow.emit(new MessageEvent.DraftUpdated(chatId, input), this) == coroutine_suspended) {
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

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketService$handleBinaryMessage$4", m185f = "WebSocketService.kt", m186i = {}, m187l = {390}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketService$handleBinaryMessage$4 */
    static final class C30634 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ bot_board_message.BoardData.BoardContent $board;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30634(bot_board_message.BoardData.BoardContent boardContent, Continuation<? super C30634> continuation) {
            super(2, continuation);
            this.$board = boardContent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebSocketService.this.new C30634(this.$board, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30634) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    MutableSharedFlow mutableSharedFlow = WebSocketService.this._messageEvents;
                    String botId = this.$board.getBotId();
                    Intrinsics.checkNotNullExpressionValue(botId, "getBotId(...)");
                    String chatId = this.$board.getChatId();
                    Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
                    String content = this.$board.getContent();
                    Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
                    this.label = 1;
                    if (mutableSharedFlow.emit(new MessageEvent.BotBoardMessage(botId, chatId, content), this) == coroutine_suspended) {
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

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketService$handleBinaryMessage$5", m185f = "WebSocketService.kt", m186i = {}, m187l = {407}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.websocket.WebSocketService$handleBinaryMessage$5 */
    static final class C30645 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ stream_message.Data.StreamMsg $msg;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C30645(stream_message.Data.StreamMsg streamMsg, Continuation<? super C30645> continuation) {
            super(2, continuation);
            this.$msg = streamMsg;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WebSocketService.this.new C30645(this.$msg, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30645) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    MutableSharedFlow mutableSharedFlow = WebSocketService.this._messageEvents;
                    String msgId = this.$msg.getMsgId();
                    Intrinsics.checkNotNullExpressionValue(msgId, "getMsgId(...)");
                    String recvId = this.$msg.getRecvId();
                    Intrinsics.checkNotNullExpressionValue(recvId, "getRecvId(...)");
                    String chatId = this.$msg.getChatId();
                    Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
                    String content = this.$msg.getContent();
                    Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
                    this.label = 1;
                    if (mutableSharedFlow.emit(new MessageEvent.StreamMessage(msgId, recvId, chatId, content), this) == coroutine_suspended) {
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

    private final ChatMessage convertWsMsgToMessage(WsMsg protoMsg) {
        MessageCmd cmd;
        String direction;
        String chatId = protoMsg.getSender().getChatId();
        Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
        int chatType = protoMsg.getSender().getChatType();
        String name = protoMsg.getSender().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        String avatarUrl = protoMsg.getSender().getAvatarUrl();
        Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
        List<String> tagOldList = protoMsg.getSender().getTagOldList();
        Iterable tagList = protoMsg.getSender().getTagList();
        Intrinsics.checkNotNullExpressionValue(tagList, "getTagList(...)");
        Iterable<WsTag> iterable = tagList;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
        for (WsTag wsTag : iterable) {
            String str = chatId;
            long id = wsTag.getId();
            String str2 = name;
            String text = wsTag.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            String color = wsTag.getColor();
            Intrinsics.checkNotNullExpressionValue(color, "getColor(...)");
            arrayList.add(new MessageTag(id, text, color));
            iterable = iterable;
            chatId = str;
            chatType = chatType;
            name = str2;
            avatarUrl = avatarUrl;
        }
        MessageSender sender = new MessageSender(chatId, chatType, name, avatarUrl, tagOldList, (List) arrayList);
        String text2 = protoMsg.getContent().getText();
        Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
        String text3 = text2.length() > 0 ? protoMsg.getContent().getText() : null;
        String buttons = protoMsg.getContent().getButtons();
        Intrinsics.checkNotNullExpressionValue(buttons, "getButtons(...)");
        String buttons2 = buttons.length() > 0 ? protoMsg.getContent().getButtons() : null;
        String imageUrl = protoMsg.getContent().getImageUrl();
        Intrinsics.checkNotNullExpressionValue(imageUrl, "getImageUrl(...)");
        String imageUrl2 = imageUrl.length() > 0 ? protoMsg.getContent().getImageUrl() : null;
        String fileName = protoMsg.getContent().getFileName();
        Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
        String fileName2 = fileName.length() > 0 ? protoMsg.getContent().getFileName() : null;
        String fileUrl = protoMsg.getContent().getFileUrl();
        Intrinsics.checkNotNullExpressionValue(fileUrl, "getFileUrl(...)");
        String fileUrl2 = fileUrl.length() > 0 ? protoMsg.getContent().getFileUrl() : null;
        String form = protoMsg.getContent().getForm();
        Intrinsics.checkNotNullExpressionValue(form, "getForm(...)");
        String form2 = form.length() > 0 ? protoMsg.getContent().getForm() : null;
        String quoteMsgText = protoMsg.getContent().getQuoteMsgText();
        Intrinsics.checkNotNullExpressionValue(quoteMsgText, "getQuoteMsgText(...)");
        String quoteMsgText2 = quoteMsgText.length() > 0 ? protoMsg.getContent().getQuoteMsgText() : null;
        String stickerUrl = protoMsg.getContent().getStickerUrl();
        Intrinsics.checkNotNullExpressionValue(stickerUrl, "getStickerUrl(...)");
        String stickerUrl2 = stickerUrl.length() > 0 ? protoMsg.getContent().getStickerUrl() : null;
        String postId = protoMsg.getContent().getPostId();
        Intrinsics.checkNotNullExpressionValue(postId, "getPostId(...)");
        String postId2 = postId.length() > 0 ? protoMsg.getContent().getPostId() : null;
        String postTitle = protoMsg.getContent().getPostTitle();
        Intrinsics.checkNotNullExpressionValue(postTitle, "getPostTitle(...)");
        String postTitle2 = postTitle.length() > 0 ? protoMsg.getContent().getPostTitle() : null;
        String postContent = protoMsg.getContent().getPostContent();
        Intrinsics.checkNotNullExpressionValue(postContent, "getPostContent(...)");
        String postContent2 = postContent.length() > 0 ? protoMsg.getContent().getPostContent() : null;
        String postContentType = protoMsg.getContent().getPostContentType();
        Intrinsics.checkNotNullExpressionValue(postContentType, "getPostContentType(...)");
        String postContentType2 = postContentType.length() > 0 ? protoMsg.getContent().getPostContentType() : null;
        String expressionId = protoMsg.getContent().getExpressionId();
        Intrinsics.checkNotNullExpressionValue(expressionId, "getExpressionId(...)");
        String expressionId2 = expressionId.length() > 0 ? protoMsg.getContent().getExpressionId() : null;
        Long lValueOf = protoMsg.getContent().getFileSize() > 0 ? Long.valueOf(protoMsg.getContent().getFileSize()) : null;
        String videoUrl = protoMsg.getContent().getVideoUrl();
        Intrinsics.checkNotNullExpressionValue(videoUrl, "getVideoUrl(...)");
        String videoUrl2 = videoUrl.length() > 0 ? protoMsg.getContent().getVideoUrl() : null;
        String audioUrl = protoMsg.getContent().getAudioUrl();
        Intrinsics.checkNotNullExpressionValue(audioUrl, "getAudioUrl(...)");
        String audioUrl2 = audioUrl.length() > 0 ? protoMsg.getContent().getAudioUrl() : null;
        Long lValueOf2 = protoMsg.getContent().getAudioTime() > 0 ? Long.valueOf(protoMsg.getContent().getAudioTime()) : null;
        Long lValueOf3 = protoMsg.getContent().getStickerItemId() > 0 ? Long.valueOf(protoMsg.getContent().getStickerItemId()) : null;
        Long lValueOf4 = protoMsg.getContent().getStickerPackId() > 0 ? Long.valueOf(protoMsg.getContent().getStickerPackId()) : null;
        String callText = protoMsg.getContent().getCallText();
        Intrinsics.checkNotNullExpressionValue(callText, "getCallText(...)");
        String callText2 = callText.length() > 0 ? protoMsg.getContent().getCallText() : null;
        String callStatusText = protoMsg.getContent().getCallStatusText();
        Intrinsics.checkNotNullExpressionValue(callStatusText, "getCallStatusText(...)");
        MessageContent content = new MessageContent(text3, buttons2, imageUrl2, fileName2, fileUrl2, form2, quoteMsgText2, null, stickerUrl2, postId2, postTitle2, postContent2, postContentType2, expressionId2, lValueOf, videoUrl2, audioUrl2, lValueOf2, lValueOf3, lValueOf4, callText2, callStatusText.length() > 0 ? protoMsg.getContent().getCallStatusText() : null, protoMsg.getContent().getWidth() > 0 ? Long.valueOf(protoMsg.getContent().getWidth()) : null, protoMsg.getContent().getHeight() > 0 ? Long.valueOf(protoMsg.getContent().getHeight()) : null, 128, null);
        if (protoMsg.hasCmd()) {
            String name2 = protoMsg.getCmd().getName();
            Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
            cmd = new MessageCmd(name2, (int) protoMsg.getCmd().getId());
        } else {
            cmd = null;
        }
        if (Intrinsics.areEqual(protoMsg.getSender().getChatId(), protoMsg.getRecvId())) {
            direction = "right";
        } else {
            direction = "left";
        }
        String msgId = protoMsg.getMsgId();
        Intrinsics.checkNotNullExpressionValue(msgId, "getMsgId(...)");
        int contentType = protoMsg.getContentType();
        long timestamp = protoMsg.getTimestamp();
        Long lValueOf5 = protoMsg.getDeleteTime() > 0 ? Long.valueOf(protoMsg.getDeleteTime()) : null;
        String quoteMsgId = protoMsg.getQuoteMsgId();
        Intrinsics.checkNotNullExpressionValue(quoteMsgId, "getQuoteMsgId(...)");
        return new ChatMessage(msgId, sender, direction, contentType, content, timestamp, cmd, lValueOf5, quoteMsgId.length() > 0 ? protoMsg.getQuoteMsgId() : null, Long.valueOf(protoMsg.getMsgSeq()), protoMsg.getEditTime() > 0 ? Long.valueOf(protoMsg.getEditTime()) : null, protoMsg.getChatId(), Integer.valueOf(protoMsg.getChatType()), protoMsg.getRecvId());
    }

    public final void showMessageNotification(ChatMessage message) {
        String targetChatId;
        Integer chatType;
        String messageContent;
        try {
            if (Intrinsics.areEqual(message.getSender().getChatId(), this.currentUserId) || AppForegroundTracker.INSTANCE.isInForeground()) {
                return;
            }
            boolean isPrivateChat = Intrinsics.areEqual(message.getChatId(), message.getRecvId());
            if (isPrivateChat || (targetChatId = message.getChatId()) == null) {
                targetChatId = message.getSender().getChatId();
            }
            int targetChatType = (isPrivateChat || (chatType = message.getChatType()) == null) ? message.getSender().getChatType() : chatType.intValue();
            boolean isMuted = ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new WebSocketService$showMessageNotification$isMuted$1(this, targetChatId, targetChatType, null), 1, null)).booleanValue();
            if (isMuted) {
                Log.d(this.tag, "Conversation is muted (doNotDisturb==1), skip notification: chatId=" + targetChatId);
                return;
            }
            Object systemService = this.context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            String name = message.getSender().getName();
            if (name.length() == 0) {
                name = "\u672a\u77e5\u7528\u6237";
            }
            String senderName = name;
            switch (message.getContentType()) {
                case 3:
                    messageContent = "Markdown\u6d88\u606f";
                    break;
                case 8:
                    messageContent = "HTML\u6d88\u606f";
                    break;
                default:
                    String text = message.getContent().getText();
                    if (!(text == null || text.length() == 0)) {
                        messageContent = message.getContent().getText();
                        break;
                    } else {
                        String imageUrl = message.getContent().getImageUrl();
                        if (!(imageUrl == null || imageUrl.length() == 0)) {
                            messageContent = "[\u56fe\u7247]";
                            break;
                        } else {
                            String fileUrl = message.getContent().getFileUrl();
                            if (!(fileUrl == null || fileUrl.length() == 0)) {
                                messageContent = "[\u6587\u4ef6]";
                                break;
                            } else {
                                String audioUrl = message.getContent().getAudioUrl();
                                if (!(audioUrl == null || audioUrl.length() == 0)) {
                                    messageContent = "[\u8bed\u97f3]";
                                    break;
                                } else {
                                    String videoUrl = message.getContent().getVideoUrl();
                                    if (!(videoUrl == null || videoUrl.length() == 0)) {
                                        messageContent = "[\u89c6\u9891]";
                                        break;
                                    } else {
                                        String stickerUrl = message.getContent().getStickerUrl();
                                        if (!(stickerUrl == null || stickerUrl.length() == 0)) {
                                            messageContent = "[\u8868\u60c5]";
                                            break;
                                        } else {
                                            messageContent = "[\u6d88\u606f]";
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
            }
            String conversationTitle = getConversationTitle(targetChatId, targetChatType, senderName);
            Intent chatIntent = new Intent(this.context, (Class<?>) ChatActivity.class);
            chatIntent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, targetChatId);
            chatIntent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, targetChatType);
            chatIntent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, conversationTitle);
            chatIntent.setFlags(603979776);
            TaskStackBuilder taskStackBuilderCreate = TaskStackBuilder.create(this.context);
            taskStackBuilderCreate.addNextIntent(new Intent(this.context, (Class<?>) MainActivity.class));
            taskStackBuilderCreate.addNextIntent(chatIntent);
            PendingIntent pendingIntent = taskStackBuilderCreate.getPendingIntent(targetChatId.hashCode(), 201326592);
            Notification notification = new NotificationCompat.Builder(this.context, NOTIFICATION_CHANNEL_ID).setSmallIcon(C3011R.drawable.ic_launcher_foreground).setContentTitle(conversationTitle).setContentText(senderName + "\uff1a" + messageContent).setContentIntent(pendingIntent).setAutoCancel(true).setPriority(0).build();
            Intrinsics.checkNotNullExpressionValue(notification, "build(...)");
            notificationManager.notify(targetChatId.hashCode() + 1000, notification);
            Log.d(this.tag, "Shown notification for message from " + senderName);
        } catch (Exception e) {
            Log.e(this.tag, "Error showing notification", e);
        }
    }

    private final String getConversationTitle(String str, int i, String senderName) {
        try {
            CacheRepository cacheRepository = new CacheRepository(this.context);
            Object obj = null;
            boolean z = true;
            List cachedConversations = (List) BuildersKt__BuildersKt.runBlocking$default(null, new WebSocketService$getConversationTitle$cachedConversations$1(cacheRepository, null), 1, null);
            Iterator it = cachedConversations.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((Conversation) next).getChatId(), str)) {
                    obj = next;
                    break;
                }
            }
            Conversation cachedConversation = (Conversation) obj;
            if (cachedConversation != null) {
                if (cachedConversation.getName().length() <= 0) {
                    z = false;
                }
                if (z) {
                    return cachedConversation.getName();
                }
            }
            switch (i) {
                case 1:
                case 3:
                    return senderName;
                case 2:
                    return "\u7fa4\u804a";
                default:
                    return "\u4f1a\u8bdd";
            }
        } catch (Exception e) {
            Log.w(this.tag, "Failed to get conversation title from cache", e);
            switch (i) {
                case 1:
                case 3:
                    return senderName;
                case 2:
                    return "\u7fa4\u804a";
                default:
                    return "\u4f1a\u8bdd";
            }
        }
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "\u804a\u5929\u6d88\u606f", 3);
            channel.setDescription("\u63a5\u6536\u65b0\u7684\u804a\u5929\u6d88\u606f\u901a\u77e5");
            Object systemService = this.context.getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            notificationManager.createNotificationChannel(channel);
        }
    }

    public final void cleanup() {
        this.isConnected = false;
        Job job = this.heartbeatJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.heartbeatJob = null;
    }

    public final void destroy() {
        this.shouldReconnect = false;
        disconnect();
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
    }
}
