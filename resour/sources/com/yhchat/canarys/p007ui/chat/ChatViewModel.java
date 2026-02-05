package com.yhchat.canarys.p007ui.chat;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.local.DraftStore;
import com.yhchat.canarys.data.local.ReadPositionStore;
import com.yhchat.canarys.data.model.ChatBackground;
import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.data.model.Expression;
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.model.GroupMemberInfo;
import com.yhchat.canarys.data.model.MenuButton;
import com.yhchat.canarys.data.model.MessageContent;
import com.yhchat.canarys.data.model.MessageSender;
import com.yhchat.canarys.data.model.StickerItem;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.BlocklistRepository;
import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.data.repository.ChatBackgroundRepository;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.websocket.MessageEvent;
import com.yhchat.canarys.data.websocket.WebSocketManager;
import com.yhchat.canarys.p007ui.chat.ChatViewModel;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.bot.Bot;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ChatViewModel.kt */
@Metadata(m168d1 = {"\u0000\u00d8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u00002\u00020\u0001BS\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u001e\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u0019J\u0010\u00108\u001a\u0002042\u0006\u00109\u001a\u00020\u0019H\u0002J\u0010\u0010:\u001a\u0002042\u0006\u00109\u001a\u00020\u0019H\u0002J\u0010\u0010;\u001a\u0002042\u0006\u00105\u001a\u00020\u0019H\u0002J\u0010\u0010<\u001a\u0002042\u0006\u00105\u001a\u00020\u0019H\u0002J\u000e\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020\u0019J\u0010\u0010?\u001a\u0002042\u0006\u00109\u001a\u00020\u0019H\u0002J\u000e\u0010@\u001a\u0002042\u0006\u0010A\u001a\u00020BJ\b\u0010C\u001a\u000204H\u0002J\u0010\u0010D\u001a\u0002042\u0006\u0010E\u001a\u00020,H\u0002J\u0006\u0010F\u001a\u000204J$\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020I0.0H2\u0006\u0010J\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0004\bK\u0010LJ\u000e\u0010M\u001a\u0002042\u0006\u0010N\u001a\u00020\u0019J.\u0010O\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010P\u001a\u00020Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0019J.\u0010T\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010U\u001a\u00020Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0019J.\u0010V\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010W\u001a\u00020Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0019J\u001a\u0010X\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020QH\u0002J\u0010\u0010Z\u001a\u0002042\u0006\u0010E\u001a\u00020,H\u0002J\u0010\u0010[\u001a\u0002042\u0006\u0010\\\u001a\u00020\u0019H\u0002J\u0010\u0010]\u001a\u0002042\u0006\u0010^\u001a\u00020_H\u0002J\u0010\u0010`\u001a\u0002042\u0006\u0010J\u001a\u00020\u0019H\u0002J\u0010\u0010a\u001a\u0002042\b\b\u0002\u0010b\u001a\u00020\u001eJ\u000e\u0010c\u001a\u0002042\u0006\u0010d\u001a\u00020\u0019J\u0018\u0010e\u001a\u0004\u0018\u00010\u00192\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u001bJ\u0006\u0010f\u001a\u000204J\u0006\u0010g\u001a\u000204J\u001a\u0010h\u001a\u0002042\u0006\u0010i\u001a\u00020\u00192\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u0019Jy\u0010j\u001a\u0002042\u0006\u0010i\u001a\u00020\u00192\b\b\u0002\u0010k\u001a\u00020\u001b2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010l\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010m\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010.2\u000e\b\u0002\u0010n\u001a\b\u0012\u0004\u0012\u0002040o2\u0014\b\u0002\u0010p\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u0002040q\u00a2\u0006\u0002\u0010rJ&\u0010s\u001a\u0002042\u0006\u0010t\u001a\u00020u2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0019J&\u0010v\u001a\u0002042\u0006\u0010w\u001a\u00020x2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010S\u001a\u0004\u0018\u00010\u0019J\u000e\u0010y\u001a\u0002042\u0006\u0010z\u001a\u00020\u0019J\u000e\u0010{\u001a\u0002042\u0006\u0010E\u001a\u00020,J\u000e\u0010|\u001a\u0002042\u0006\u0010E\u001a\u00020,J\u000e\u0010}\u001a\u0002042\u0006\u0010J\u001a\u00020\u0019J\u000e\u0010~\u001a\u0002042\u0006\u0010J\u001a\u00020\u0019J.\u0010\u007f\u001a\u0002042\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020\u00192\u0006\u0010d\u001a\u00020\u00192\u0006\u0010k\u001a\u00020\u001bJ\u0007\u0010\u0080\u0001\u001a\u000204J\u000f\u0010\u0081\u0001\u001a\u0002042\u0006\u0010>\u001a\u00020\u0019J\u0017\u0010\u0082\u0001\u001a\u0002042\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u001bJ\u0017\u0010\u0083\u0001\u001a\u0002042\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0019J\u0007\u0010\u0084\u0001\u001a\u000204J\u000f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0003\u0010\u0086\u0001J\u0007\u0010\u0087\u0001\u001a\u000204J\u0007\u0010\u0088\u0001\u001a\u000204J\u0007\u0010\u0089\u0001\u001a\u00020\u0019J\u000f\u0010\u008a\u0001\u001a\u00020\u001e2\u0006\u0010E\u001a\u00020,J\u0007\u0010\u008b\u0001\u001a\u00020\u001bJ\u000f\u0010\u008c\u0001\u001a\u00020\u001e2\u0006\u0010J\u001a\u00020\u0019J\u000f\u0010\u008d\u0001\u001a\u0002042\u0006\u0010J\u001a\u00020\u0019J(\u0010\u008e\u0001\u001a\u0002042\u0006\u00105\u001a\u00020\u00192\u0006\u00106\u001a\u00020\u001b2\u0006\u0010J\u001a\u00020\u00192\u0007\u0010\u008f\u0001\u001a\u00020\u0019J#\u0010\u0090\u0001\u001a\u0002042\u0006\u00107\u001a\u00020\u00192\u0007\u0010\u0091\u0001\u001a\u00020\u00192\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0019J\t\u0010\u0093\u0001\u001a\u000204H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0019X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010&\u001a\b\u0012\u0004\u0012\u00020%0'\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020,0.\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001a\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001902X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0094\u0001"}, m169d2 = {"Lcom/yhchat/canarys/ui/chat/ChatViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "messageRepository", "Lcom/yhchat/canarys/data/repository/MessageRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "webSocketManager", "Lcom/yhchat/canarys/data/websocket/WebSocketManager;", "groupRepository", "Lcom/yhchat/canarys/data/repository/GroupRepository;", "readPositionStore", "Lcom/yhchat/canarys/data/local/ReadPositionStore;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "botRepository", "Lcom/yhchat/canarys/data/repository/BotRepository;", "draftStore", "Lcom/yhchat/canarys/data/local/DraftStore;", "<init>", "(Landroid/content/Context;Lcom/yhchat/canarys/data/repository/MessageRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/data/websocket/WebSocketManager;Lcom/yhchat/canarys/data/repository/GroupRepository;Lcom/yhchat/canarys/data/local/ReadPositionStore;Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/BotRepository;Lcom/yhchat/canarys/data/local/DraftStore;)V", "blocklistRepository", "Lcom/yhchat/canarys/data/repository/BlocklistRepository;", "currentChatId", "", "currentChatType", "", "currentUserId", "hasMoreMessages", "", "oldestMsgSeq", "", "oldestMsgId", "tag", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/chat/ChatUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_messages", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/yhchat/canarys/data/model/ChatMessage;", "messages", "", "getMessages", "()Ljava/util/List;", "streamingMessages", "", "initChat", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "userId", "loadGroupInfo", "groupId", "loadGroupMembers", "loadGroupBotsAndBoards", "loadGroupBotBoards", "refreshBotBoard", "botId", "loadGroupMenuButtons", "clickMenuButton", "button", "Lcom/yhchat/canarys/data/model/MenuButton;", "startListeningToWebSocketMessages", "handleNewMessage", "message", "resetNewMessageFlag", "getMessageEditHistory", "Lkotlin/Result;", "Lcom/yhchat/canarys/data/model/MessageEditRecord;", "msgId", "getMessageEditHistory-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addExpressionToFavorites", "expressionId", "uploadAndSendImage", "imageUri", "Landroid/net/Uri;", "quoteMsgId", "quoteMsgText", "uploadAndSendVideo", "videoUri", "uploadAndSendFile", "fileUri", "getFileNameFromUri", "uri", "handleEditedMessage", "handleDeletedMessage", "messageId", "handleStreamMessage", NotificationCompat.CATEGORY_EVENT, "Lcom/yhchat/canarys/data/websocket/MessageEvent$StreamMessage;", "loadMessagesFromPosition", "loadMessages", "refresh", "saveDraft", "content", "getDraft", "clearDraft", "loadMoreMessages", "sendTextMessage", "text", "sendMessage", "contentType", "commandId", "mentionedIds", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "sendExpressionMessage", "expression", "Lcom/yhchat/canarys/data/model/Expression;", "sendStickerMessage", "stickerItem", "Lcom/yhchat/canarys/data/model/StickerItem;", "sendDraftInput", "inputText", "addNewMessage", "updateMessage", "removeMessage", "recallMessage", "editMessage", "clearError", "loadBotInfo", "loadBotBoard", "loadChatBackground", "saveCurrentReadPosition", "getUnreadCount", "()Ljava/lang/Integer;", "refreshMessages", "refreshLatestMessages", "getCurrentUserId", "isMyMessage", "getCurrentUserPermission", "isMessageStreaming", "clearStreamingMessage", "reportButtonClick", "buttonValue", "blockUser", "userName", "avatarUrl", "onCleared", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ChatViewModel extends ViewModel {
    public static final int $stable = 8;
    private final SnapshotStateList<ChatMessage> _messages;
    private final MutableStateFlow<ChatUiState> _uiState;
    private final ApiService apiService;
    private final BlocklistRepository blocklistRepository;
    private final BotRepository botRepository;
    private final Context context;
    private String currentChatId;
    private int currentChatType;
    private String currentUserId;
    private final DraftStore draftStore;
    private final GroupRepository groupRepository;
    private boolean hasMoreMessages;
    private final MessageRepository messageRepository;
    private final List<ChatMessage> messages;
    private String oldestMsgId;
    private long oldestMsgSeq;
    private final ReadPositionStore readPositionStore;
    private final Map<String, String> streamingMessages;
    private final String tag;
    private final TokenRepository tokenRepository;
    private final StateFlow<ChatUiState> uiState;
    private final WebSocketManager webSocketManager;

    @Inject
    public ChatViewModel(@ApplicationContext Context context, MessageRepository messageRepository, TokenRepository tokenRepository, WebSocketManager webSocketManager, GroupRepository groupRepository, ReadPositionStore readPositionStore, ApiService apiService, BotRepository botRepository, DraftStore draftStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(messageRepository, "messageRepository");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(webSocketManager, "webSocketManager");
        Intrinsics.checkNotNullParameter(groupRepository, "groupRepository");
        Intrinsics.checkNotNullParameter(readPositionStore, "readPositionStore");
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(draftStore, "draftStore");
        this.context = context;
        this.messageRepository = messageRepository;
        this.tokenRepository = tokenRepository;
        this.webSocketManager = webSocketManager;
        this.groupRepository = groupRepository;
        this.readPositionStore = readPositionStore;
        this.apiService = apiService;
        this.botRepository = botRepository;
        this.draftStore = draftStore;
        this.blocklistRepository = new BlocklistRepository(this.context);
        this.currentChatId = "";
        this.currentChatType = 1;
        this.currentUserId = "";
        this.hasMoreMessages = true;
        this.tag = "ChatViewModel";
        this._uiState = StateFlowKt.MutableStateFlow(new ChatUiState(false, null, false, false, false, null, null, 0, null, null, null, null, null, null, 16383, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._messages = SnapshotStateKt.mutableStateListOf();
        this.messages = this._messages;
        this.streamingMessages = new LinkedHashMap();
    }

    public final StateFlow<ChatUiState> getUiState() {
        return this.uiState;
    }

    public final List<ChatMessage> getMessages() {
        return this.messages;
    }

    public final void initChat(String str, int i, String userId) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.currentChatId = str;
        this.currentChatType = i;
        this.currentUserId = userId;
        Log.d(this.tag, "Initializing chat: chatId=" + str + ", chatType=" + i + ", userId=" + userId);
        this._messages.clear();
        this.hasMoreMessages = true;
        this.oldestMsgSeq = 0L;
        this.oldestMsgId = null;
        switch (i) {
            case 2:
                loadGroupInfo(str);
                loadGroupMembers(str);
                loadGroupBotsAndBoards(str);
                loadGroupMenuButtons(str);
                break;
            case 3:
                loadBotInfo(str);
                loadBotBoard(str, 3);
                break;
        }
        startListeningToWebSocketMessages();
        Log.d(this.tag, "Loading latest messages");
        loadMessages$default(this, false, 1, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$loadGroupInfo$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {122}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$loadGroupInfo$1 */
    static final class C32531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32531(String str, Continuation<? super C32531> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32531(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(ChatViewModel.this.tag, "Loading group info for: " + this.$groupId);
                    ChatViewModel.this.groupRepository.setTokenRepository(ChatViewModel.this.tokenRepository);
                    this.label = 1;
                    Object objM8577getGroupInfogIAlus = ChatViewModel.this.groupRepository.m8577getGroupInfogIAlus(this.$groupId, this);
                    if (objM8577getGroupInfogIAlus != coroutine_suspended) {
                        value = objM8577getGroupInfogIAlus;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChatViewModel chatViewModel = ChatViewModel.this;
            ChatViewModel chatViewModel2 = ChatViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                Log.d(chatViewModel.tag, "\u2705 Group info loaded successfully");
                MutableStateFlow mutableStateFlow = chatViewModel._uiState;
                ChatUiState chatUiState = (ChatUiState) chatViewModel._uiState.getValue();
                mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : null, (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : (GroupDetail) value, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
            } else {
                Log.e(chatViewModel2.tag, "\u274c Failed to load group info", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow2 = chatViewModel2._uiState;
                ChatUiState chatUiState2 = (ChatUiState) chatViewModel2._uiState.getValue();
                mutableStateFlow2.setValue(chatUiState2.copy((16381 & 1) != 0 ? chatUiState2.isLoading : false, (16381 & 2) != 0 ? chatUiState2.error : "\u52a0\u8f7d\u7fa4\u4fe1\u606f\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), (16381 & 4) != 0 ? chatUiState2.isConnected : false, (16381 & 8) != 0 ? chatUiState2.isRefreshing : false, (16381 & 16) != 0 ? chatUiState2.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState2.groupInfo : null, (16381 & 64) != 0 ? chatUiState2.groupMembers : null, (16381 & 128) != 0 ? chatUiState2.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState2.botInfo : null, (16381 & 512) != 0 ? chatUiState2.botBoard : null, (16381 & 1024) != 0 ? chatUiState2.groupBots : null, (16381 & 2048) != 0 ? chatUiState2.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState2.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState2.menuButtons : null));
            }
            return Unit.INSTANCE;
        }
    }

    private final void loadGroupInfo(String groupId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32531(groupId, null), 3, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$loadGroupMembers$1", m185f = "ChatViewModel.kt", m186i = {1, 1, 1, 1, 1, 1}, m187l = {144, 154}, m188m = "invokeSuspend", m189n = {"groupInfo\\1", "allMembers\\1", "$i$a$-fold-ChatViewModel$loadGroupMembers$1$1\\1\\144\\0", "membersToLoad\\1", "pages\\1", "page\\1"}, m191s = {"L$2", "L$3", "I$0", "I$1", "I$2", "I$3"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$loadGroupMembers$1 */
    static final class C32541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32541(String str, Continuation<? super C32541> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32541(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x010f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x015c  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0188  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01bd A[LOOP:0: B:68:0x01b7->B:70:0x01bd, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0238  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0110 -> B:58:0x0113). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                Method dump skipped, instructions count: 596
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatViewModel.C32541.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void loadGroupMembers(String groupId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32541(groupId, null), 3, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$loadGroupBotsAndBoards$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {186}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$loadGroupBotsAndBoards$1 */
    static final class C32521 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32521(String str, Continuation<? super C32521> continuation) {
            super(2, continuation);
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32521(this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8576getGroupBotsgIAlus = ChatViewModel.this.groupRepository.m8576getGroupBotsgIAlus(this.$chatId, this);
                    if (objM8576getGroupBotsgIAlus != coroutine_suspended) {
                        value = objM8576getGroupBotsgIAlus;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChatViewModel chatViewModel = ChatViewModel.this;
            String str = this.$chatId;
            ChatViewModel chatViewModel2 = ChatViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                List list = (List) value;
                MutableStateFlow mutableStateFlow = chatViewModel._uiState;
                ChatUiState chatUiState = (ChatUiState) chatViewModel._uiState.getValue();
                mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : null, (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : list, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                if (!list.isEmpty()) {
                    chatViewModel.loadGroupBotBoards(str);
                }
            } else {
                Log.e(chatViewModel2.tag, "\u52a0\u8f7d\u7fa4\u804a\u673a\u5668\u4eba\u5217\u8868\u5931\u8d25", thM11922exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    private final void loadGroupBotsAndBoards(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32521(str, null), 3, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$loadGroupBotBoards$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {209}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$loadGroupBotBoards$1 */
    static final class C32511 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32511(String str, Continuation<? super C32511> continuation) {
            super(2, continuation);
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32511(this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(ChatViewModel.this.tag, "\u5f00\u59cb\u52a0\u8f7d\u7fa4\u804a\u673a\u5668\u4eba\u770b\u677f: groupId=" + this.$chatId);
                    this.label = 1;
                    Object objM8483getBotBoard0E7RQCE = ChatViewModel.this.botRepository.m8483getBotBoard0E7RQCE(this.$chatId, 2, this);
                    if (objM8483getBotBoard0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8483getBotBoard0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChatViewModel chatViewModel = ChatViewModel.this;
            String str = this.$chatId;
            ChatViewModel chatViewModel2 = ChatViewModel.this;
            String str2 = this.$chatId;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                List boardList = ((Bot.board) value).getBoardList();
                Log.d(chatViewModel.tag, "\u2705 \u52a0\u8f7d\u7fa4\u804a\u770b\u677f\u6210\u529f: groupId=" + str + ", \u6570\u91cf=" + boardList.size());
                Intrinsics.checkNotNull(boardList);
                if (!boardList.isEmpty()) {
                    List list = boardList;
                    Map linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                    for (Object obj : list) {
                        linkedHashMap.put(((Bot.board.Board_data) obj).getBotId(), obj);
                    }
                    MutableStateFlow mutableStateFlow = chatViewModel._uiState;
                    ChatUiState chatUiState = (ChatUiState) chatViewModel._uiState.getValue();
                    mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : null, (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : linkedHashMap, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                }
            } else {
                Log.e(chatViewModel2.tag, "\u274c \u52a0\u8f7d\u7fa4\u804a\u673a\u5668\u4eba\u770b\u677f\u5931\u8d25: groupId=" + str2, thM11922exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadGroupBotBoards(String str) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32511(str, null), 3, null);
    }

    public final void refreshBotBoard(String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        if (this.currentChatType == 2) {
            loadGroupBotBoards(this.currentChatId);
        } else if (this.currentChatType == 3 && Intrinsics.areEqual(this.currentChatId, botId)) {
            loadBotBoard(botId, 3);
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$loadGroupMenuButtons$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {245}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$loadGroupMenuButtons$1 */
    static final class C32551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32551(String str, Continuation<? super C32551> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32551(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(ChatViewModel.this.tag, "Loading group menu buttons for: " + this.$groupId);
                    ChatViewModel.this.groupRepository.setTokenRepository(ChatViewModel.this.tokenRepository);
                    this.label = 1;
                    Object objM8579getGroupMenuButtonsgIAlus = ChatViewModel.this.groupRepository.m8579getGroupMenuButtonsgIAlus(this.$groupId, this);
                    if (objM8579getGroupMenuButtonsgIAlus != coroutine_suspended) {
                        value = objM8579getGroupMenuButtonsgIAlus;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChatViewModel chatViewModel = ChatViewModel.this;
            ChatViewModel chatViewModel2 = ChatViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                List list = (List) value;
                Log.d(chatViewModel.tag, "\u2705 \u52a0\u8f7d\u5230 " + list.size() + " \u4e2a\u83dc\u5355\u6309\u94ae");
                MutableStateFlow mutableStateFlow = chatViewModel._uiState;
                ChatUiState chatUiState = (ChatUiState) chatViewModel._uiState.getValue();
                mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : null, (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : list));
            } else {
                Log.e(chatViewModel2.tag, "\u274c \u52a0\u8f7d\u83dc\u5355\u6309\u94ae\u5931\u8d25", thM11922exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    private final void loadGroupMenuButtons(String groupId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32551(groupId, null), 3, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$clickMenuButton$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {264}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$clickMenuButton$1 */
    static final class C32461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MenuButton $button;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32461(MenuButton menuButton, Continuation<? super C32461> continuation) {
            super(2, continuation);
            this.$button = menuButton;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32461(this.$button, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(ChatViewModel.this.tag, "\u70b9\u51fb\u83dc\u5355\u6309\u94ae: " + this.$button.getName() + " (ID: " + this.$button.getId() + ")");
                    this.label = 1;
                    Object objM8567clickMenuButtonyxL6bBk = ChatViewModel.this.groupRepository.m8567clickMenuButtonyxL6bBk(this.$button.getId(), ChatViewModel.this.currentChatId, ChatViewModel.this.currentChatType, this.$button.getSelect(), this);
                    if (objM8567clickMenuButtonyxL6bBk == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8567clickMenuButtonyxL6bBk;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChatViewModel chatViewModel = ChatViewModel.this;
            ChatViewModel chatViewModel2 = ChatViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                Log.d(chatViewModel.tag, "\u2705 \u83dc\u5355\u6309\u94ae\u70b9\u51fb\u6210\u529f");
            } else {
                Log.e(chatViewModel2.tag, "\u274c \u83dc\u5355\u6309\u94ae\u70b9\u51fb\u5931\u8d25", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = chatViewModel2._uiState;
                ChatUiState chatUiState = (ChatUiState) chatViewModel2._uiState.getValue();
                mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : thM11922exceptionOrNullimpl.getMessage(), (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void clickMenuButton(MenuButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32461(button, null), 3, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$startListeningToWebSocketMessages$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {286}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$startListeningToWebSocketMessages$1 */
    static final class C32651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C32651(Continuation<? super C32651> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32651(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ChatViewModel.kt */
        @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$startListeningToWebSocketMessages$1$1 */
        static final class AnonymousClass1<T> implements FlowCollector {
            AnonymousClass1() {
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                return emit((MessageEvent) value, (Continuation<? super Unit>) $completion);
            }

            public final Object emit(MessageEvent event, Continuation<? super Unit> continuation) {
                if (event instanceof MessageEvent.NewMessage) {
                    chatViewModel.handleNewMessage(((MessageEvent.NewMessage) event).getMessage());
                } else if (event instanceof MessageEvent.MessageEdited) {
                    chatViewModel.handleEditedMessage(((MessageEvent.MessageEdited) event).getMessage());
                } else if (event instanceof MessageEvent.MessageDeleted) {
                    chatViewModel.handleDeletedMessage(((MessageEvent.MessageDeleted) event).getMsgId());
                } else if (event instanceof MessageEvent.StreamMessage) {
                    chatViewModel.handleStreamMessage((MessageEvent.StreamMessage) event);
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
                    if (ChatViewModel.this.webSocketManager.getMessageEvents().collect(new FlowCollector() { // from class: com.yhchat.canarys.ui.chat.ChatViewModel.startListeningToWebSocketMessages.1.1
                        AnonymousClass1() {
                        }

                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((MessageEvent) value, (Continuation<? super Unit>) $completion);
                        }

                        public final Object emit(MessageEvent event, Continuation<? super Unit> continuation) {
                            if (event instanceof MessageEvent.NewMessage) {
                                chatViewModel.handleNewMessage(((MessageEvent.NewMessage) event).getMessage());
                            } else if (event instanceof MessageEvent.MessageEdited) {
                                chatViewModel.handleEditedMessage(((MessageEvent.MessageEdited) event).getMessage());
                            } else if (event instanceof MessageEvent.MessageDeleted) {
                                chatViewModel.handleDeletedMessage(((MessageEvent.MessageDeleted) event).getMsgId());
                            } else if (event instanceof MessageEvent.StreamMessage) {
                                chatViewModel.handleStreamMessage((MessageEvent.StreamMessage) event);
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

    private final void startListeningToWebSocketMessages() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32651(null), 3, null);
    }

    public final void handleNewMessage(ChatMessage message) {
        int iNextIndex;
        boolean isPrivateChat = Intrinsics.areEqual(message.getChatId(), message.getRecvId());
        String targetChatId = isPrivateChat ? message.getSender().getChatId() : message.getChatId();
        if (!Intrinsics.areEqual(targetChatId, this.currentChatId)) {
            return;
        }
        int existingIndex = 0;
        Iterator<ChatMessage> it = this._messages.iterator();
        while (true) {
            iNextIndex = -1;
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((ChatMessage) it.next()).getMsgId(), message.getMsgId())) {
                    break;
                } else {
                    existingIndex++;
                }
            } else {
                existingIndex = -1;
                break;
            }
        }
        if (existingIndex == -1) {
            List list = this._messages;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (listIterator.previous().getSendTime() <= message.getSendTime()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            int insertIndex = iNextIndex + 1;
            this._messages.add(insertIndex, message);
            Log.d(this.tag, "Inserted new real-time message at index " + insertIndex + ": " + message.getMsgId());
            MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
            ChatUiState value = this._uiState.getValue();
            mutableStateFlow.setValue(value.copy((16381 & 1) != 0 ? value.isLoading : false, (16381 & 2) != 0 ? value.error : null, (16381 & 4) != 0 ? value.isConnected : false, (16381 & 8) != 0 ? value.isRefreshing : false, (16381 & 16) != 0 ? value.newMessageReceived : true, (16381 & 32) != 0 ? value.groupInfo : null, (16381 & 64) != 0 ? value.groupMembers : null, (16381 & 128) != 0 ? value.groupMemberCount : 0, (16381 & 256) != 0 ? value.botInfo : null, (16381 & 512) != 0 ? value.botBoard : null, (16381 & 1024) != 0 ? value.groupBots : null, (16381 & 2048) != 0 ? value.groupBotBoards : null, (16381 & 4096) != 0 ? value.chatBackgroundUrl : null, (16381 & 8192) != 0 ? value.menuButtons : null));
            if (message.getSender().getChatType() == 3) {
                Map<String, String> map = this.streamingMessages;
                String msgId = message.getMsgId();
                String text = message.getContent().getText();
                if (text == null) {
                    text = "";
                }
                map.put(msgId, text);
                Log.d(this.tag, "Initialized streaming cache for bot message: " + message.getMsgId());
            }
        }
    }

    public final void resetNewMessageFlag() {
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        ChatUiState value = this._uiState.getValue();
        mutableStateFlow.setValue(value.copy((16381 & 1) != 0 ? value.isLoading : false, (16381 & 2) != 0 ? value.error : null, (16381 & 4) != 0 ? value.isConnected : false, (16381 & 8) != 0 ? value.isRefreshing : false, (16381 & 16) != 0 ? value.newMessageReceived : false, (16381 & 32) != 0 ? value.groupInfo : null, (16381 & 64) != 0 ? value.groupMembers : null, (16381 & 128) != 0 ? value.groupMemberCount : 0, (16381 & 256) != 0 ? value.botInfo : null, (16381 & 512) != 0 ? value.botBoard : null, (16381 & 1024) != 0 ? value.groupBots : null, (16381 & 2048) != 0 ? value.groupBotBoards : null, (16381 & 4096) != 0 ? value.chatBackgroundUrl : null, (16381 & 8192) != 0 ? value.menuButtons : null));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0014  */
    /* renamed from: getMessageEditHistory-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m10619getMessageEditHistorygIAlus(java.lang.String r10, kotlin.coroutines.Continuation<? super kotlin.Result<? extends java.util.List<com.yhchat.canarys.data.model.MessageEditRecord>>> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.yhchat.canarys.p007ui.chat.ChatViewModel$getMessageEditHistory$1
            if (r0 == 0) goto L14
            r0 = r11
            com.yhchat.canarys.ui.chat.ChatViewModel$getMessageEditHistory$1 r0 = (com.yhchat.canarys.p007ui.chat.ChatViewModel$getMessageEditHistory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.ui.chat.ChatViewModel$getMessageEditHistory$1 r0 = new com.yhchat.canarys.ui.chat.ChatViewModel$getMessageEditHistory$1
            r0.<init>(r9, r11)
        L19:
            r5 = r0
            java.lang.Object r0 = r5.result
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            switch(r1) {
                case 0: goto L3e;
                case 1: goto L2e;
                default: goto L25;
            }
        L25:
            r2 = r10
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2e:
            java.lang.Object r1 = r5.L$0
            r10 = r1
            java.lang.String r10 = (java.lang.String) r10
            kotlin.ResultKt.throwOnFailure(r0)
            r1 = r0
            kotlin.Result r1 = (kotlin.Result) r1
            java.lang.Object r1 = r1.getValue()
            goto L59
        L3e:
            kotlin.ResultKt.throwOnFailure(r0)
            com.yhchat.canarys.data.repository.MessageRepository r1 = r9.messageRepository
            java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r5.L$0 = r2
            r2 = 1
            r5.label = r2
            r3 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r2 = r10
            java.lang.Object r1 = com.yhchat.canarys.data.repository.MessageRepository.m8599getMessageEditHistoryBWLJW6A$default(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != r8) goto L58
            return r8
        L58:
            r10 = r2
        L59:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatViewModel.m10619getMessageEditHistorygIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$addExpressionToFavorites$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {357}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$addExpressionToFavorites$1 */
    static final class C32431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $expressionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32431(String str, Continuation<? super C32431> continuation) {
            super(2, continuation);
            this.$expressionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32431(this.$expressionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                        Object objM8609addExpressionToFavoritesgIAlus = ChatViewModel.this.messageRepository.m8609addExpressionToFavoritesgIAlus(this.$expressionId, this);
                        if (objM8609addExpressionToFavoritesgIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8609addExpressionToFavoritesgIAlus;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChatViewModel chatViewModel = ChatViewModel.this;
                String str = this.$expressionId;
                ChatViewModel chatViewModel2 = ChatViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl == null) {
                    Boxing.boxInt(Log.d(chatViewModel.tag, "\u6dfb\u52a0\u8868\u60c5\u6210\u529f: " + str));
                } else {
                    Log.e(chatViewModel2.tag, "\u6dfb\u52a0\u8868\u60c5\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage());
                    MutableStateFlow mutableStateFlow = chatViewModel2._uiState;
                    ChatUiState chatUiState = (ChatUiState) chatViewModel2._uiState.getValue();
                    mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : "\u6dfb\u52a0\u8868\u60c5\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                }
            } catch (Exception e) {
                Log.e(ChatViewModel.this.tag, "\u6dfb\u52a0\u8868\u60c5\u5f02\u5e38", e);
                MutableStateFlow mutableStateFlow2 = ChatViewModel.this._uiState;
                ChatUiState chatUiState2 = (ChatUiState) ChatViewModel.this._uiState.getValue();
                mutableStateFlow2.setValue(chatUiState2.copy((16381 & 1) != 0 ? chatUiState2.isLoading : false, (16381 & 2) != 0 ? chatUiState2.error : "\u6dfb\u52a0\u8868\u60c5\u5f02\u5e38: " + e.getMessage(), (16381 & 4) != 0 ? chatUiState2.isConnected : false, (16381 & 8) != 0 ? chatUiState2.isRefreshing : false, (16381 & 16) != 0 ? chatUiState2.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState2.groupInfo : null, (16381 & 64) != 0 ? chatUiState2.groupMembers : null, (16381 & 128) != 0 ? chatUiState2.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState2.botInfo : null, (16381 & 512) != 0 ? chatUiState2.botBoard : null, (16381 & 1024) != 0 ? chatUiState2.groupBots : null, (16381 & 2048) != 0 ? chatUiState2.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState2.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState2.menuButtons : null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void addExpressionToFavorites(String expressionId) {
        Intrinsics.checkNotNullParameter(expressionId, "expressionId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32431(expressionId, null), 3, null);
    }

    public static /* synthetic */ void uploadAndSendImage$default(ChatViewModel chatViewModel, Context context, Uri uri, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        chatViewModel.uploadAndSendImage(context, uri, str, str2);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$uploadAndSendImage$1", m185f = "ChatViewModel.kt", m186i = {0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m187l = {388, 396, 414, 433}, m188m = "invokeSuspend", m189n = {"$this$launch", "$this$launch", "token", "$this$launch", "token", "tokenResponse", "uploadToken", "$this$launch", "token", "tokenResponse", "uploadToken", "uploadResult", "uploadResponse\\2", "$i$a$-fold-ChatViewModel$uploadAndSendImage$1$1\\2\\420\\0", "width\\2", "height\\2"}, m191s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "I$0", "I$1", "I$2"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$uploadAndSendImage$1 */
    static final class C32671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $imageUri;
        final /* synthetic */ String $quoteMsgId;
        final /* synthetic */ String $quoteMsgText;
        int I$0;
        int I$1;
        int I$2;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32671(Uri uri, Context context, String str, String str2, Continuation<? super C32671> continuation) {
            super(2, continuation);
            this.$imageUri = uri;
            this.$context = context;
            this.$quoteMsgId = str;
            this.$quoteMsgText = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C32671 c32671 = ChatViewModel.this.new C32671(this.$imageUri, this.$context, this.$quoteMsgId, this.$quoteMsgText, continuation);
            c32671.L$0 = obj;
            return c32671;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:127:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x00c0 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:106:0x0038, B:183:0x0325, B:185:0x032c, B:187:0x0345, B:109:0x0051, B:154:0x01c2, B:156:0x01d2, B:158:0x0247, B:160:0x024d, B:162:0x0257, B:164:0x025d, B:166:0x0263, B:167:0x026b, B:169:0x0291, B:171:0x0297, B:173:0x029e, B:175:0x02a5, B:177:0x02ab, B:179:0x02b2, B:189:0x03a0, B:112:0x0067, B:134:0x012d, B:136:0x0135, B:138:0x013d, B:143:0x0148, B:145:0x0150, B:147:0x0156, B:150:0x015e, B:190:0x03fa, B:192:0x043f, B:113:0x006e, B:121:0x00ad, B:123:0x00b4, B:129:0x00c0, B:131:0x0107, B:118:0x007b), top: B:197:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:131:0x0107 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:106:0x0038, B:183:0x0325, B:185:0x032c, B:187:0x0345, B:109:0x0051, B:154:0x01c2, B:156:0x01d2, B:158:0x0247, B:160:0x024d, B:162:0x0257, B:164:0x025d, B:166:0x0263, B:167:0x026b, B:169:0x0291, B:171:0x0297, B:173:0x029e, B:175:0x02a5, B:177:0x02ab, B:179:0x02b2, B:189:0x03a0, B:112:0x0067, B:134:0x012d, B:136:0x0135, B:138:0x013d, B:143:0x0148, B:145:0x0150, B:147:0x0156, B:150:0x015e, B:190:0x03fa, B:192:0x043f, B:113:0x006e, B:121:0x00ad, B:123:0x00b4, B:129:0x00c0, B:131:0x0107, B:118:0x007b), top: B:197:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0135 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:106:0x0038, B:183:0x0325, B:185:0x032c, B:187:0x0345, B:109:0x0051, B:154:0x01c2, B:156:0x01d2, B:158:0x0247, B:160:0x024d, B:162:0x0257, B:164:0x025d, B:166:0x0263, B:167:0x026b, B:169:0x0291, B:171:0x0297, B:173:0x029e, B:175:0x02a5, B:177:0x02ab, B:179:0x02b2, B:189:0x03a0, B:112:0x0067, B:134:0x012d, B:136:0x0135, B:138:0x013d, B:143:0x0148, B:145:0x0150, B:147:0x0156, B:150:0x015e, B:190:0x03fa, B:192:0x043f, B:113:0x006e, B:121:0x00ad, B:123:0x00b4, B:129:0x00c0, B:131:0x0107, B:118:0x007b), top: B:197:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:156:0x01d2 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:106:0x0038, B:183:0x0325, B:185:0x032c, B:187:0x0345, B:109:0x0051, B:154:0x01c2, B:156:0x01d2, B:158:0x0247, B:160:0x024d, B:162:0x0257, B:164:0x025d, B:166:0x0263, B:167:0x026b, B:169:0x0291, B:171:0x0297, B:173:0x029e, B:175:0x02a5, B:177:0x02ab, B:179:0x02b2, B:189:0x03a0, B:112:0x0067, B:134:0x012d, B:136:0x0135, B:138:0x013d, B:143:0x0148, B:145:0x0150, B:147:0x0156, B:150:0x015e, B:190:0x03fa, B:192:0x043f, B:113:0x006e, B:121:0x00ad, B:123:0x00b4, B:129:0x00c0, B:131:0x0107, B:118:0x007b), top: B:197:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:185:0x032c A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:106:0x0038, B:183:0x0325, B:185:0x032c, B:187:0x0345, B:109:0x0051, B:154:0x01c2, B:156:0x01d2, B:158:0x0247, B:160:0x024d, B:162:0x0257, B:164:0x025d, B:166:0x0263, B:167:0x026b, B:169:0x0291, B:171:0x0297, B:173:0x029e, B:175:0x02a5, B:177:0x02ab, B:179:0x02b2, B:189:0x03a0, B:112:0x0067, B:134:0x012d, B:136:0x0135, B:138:0x013d, B:143:0x0148, B:145:0x0150, B:147:0x0156, B:150:0x015e, B:190:0x03fa, B:192:0x043f, B:113:0x006e, B:121:0x00ad, B:123:0x00b4, B:129:0x00c0, B:131:0x0107, B:118:0x007b), top: B:197:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:187:0x0345 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:106:0x0038, B:183:0x0325, B:185:0x032c, B:187:0x0345, B:109:0x0051, B:154:0x01c2, B:156:0x01d2, B:158:0x0247, B:160:0x024d, B:162:0x0257, B:164:0x025d, B:166:0x0263, B:167:0x026b, B:169:0x0291, B:171:0x0297, B:173:0x029e, B:175:0x02a5, B:177:0x02ab, B:179:0x02b2, B:189:0x03a0, B:112:0x0067, B:134:0x012d, B:136:0x0135, B:138:0x013d, B:143:0x0148, B:145:0x0150, B:147:0x0156, B:150:0x015e, B:190:0x03fa, B:192:0x043f, B:113:0x006e, B:121:0x00ad, B:123:0x00b4, B:129:0x00c0, B:131:0x0107, B:118:0x007b), top: B:197:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:189:0x03a0 A[Catch: Exception -> 0x0074, TryCatch #0 {Exception -> 0x0074, blocks: (B:106:0x0038, B:183:0x0325, B:185:0x032c, B:187:0x0345, B:109:0x0051, B:154:0x01c2, B:156:0x01d2, B:158:0x0247, B:160:0x024d, B:162:0x0257, B:164:0x025d, B:166:0x0263, B:167:0x026b, B:169:0x0291, B:171:0x0297, B:173:0x029e, B:175:0x02a5, B:177:0x02ab, B:179:0x02b2, B:189:0x03a0, B:112:0x0067, B:134:0x012d, B:136:0x0135, B:138:0x013d, B:143:0x0148, B:145:0x0150, B:147:0x0156, B:150:0x015e, B:190:0x03fa, B:192:0x043f, B:113:0x006e, B:121:0x00ad, B:123:0x00b4, B:129:0x00c0, B:131:0x0107, B:118:0x007b), top: B:197:0x0011 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                Method dump skipped, instructions count: 1286
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatViewModel.C32671.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void uploadAndSendImage(Context context, Uri imageUri, String quoteMsgId, String quoteMsgText) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32671(imageUri, context, quoteMsgId, quoteMsgText, null), 3, null);
    }

    public static /* synthetic */ void uploadAndSendVideo$default(ChatViewModel chatViewModel, Context context, Uri uri, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        chatViewModel.uploadAndSendVideo(context, uri, str, str2);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$uploadAndSendVideo$1", m185f = "ChatViewModel.kt", m186i = {0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, m187l = {483, 491, 509, 525}, m188m = "invokeSuspend", m189n = {"$this$launch", "$this$launch", "token", "$this$launch", "token", "tokenResponse", "uploadToken", "$this$launch", "token", "tokenResponse", "uploadToken", "uploadResult", "uploadResponse\\2", "$i$a$-fold-ChatViewModel$uploadAndSendVideo$1$1\\2\\515\\0"}, m191s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$uploadAndSendVideo$1 */
    static final class C32681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $quoteMsgId;
        final /* synthetic */ String $quoteMsgText;
        final /* synthetic */ Uri $videoUri;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32681(Uri uri, Context context, String str, String str2, Continuation<? super C32681> continuation) {
            super(2, continuation);
            this.$videoUri = uri;
            this.$context = context;
            this.$quoteMsgId = str;
            this.$quoteMsgText = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C32681 c32681 = ChatViewModel.this.new C32681(this.$videoUri, this.$context, this.$quoteMsgId, this.$quoteMsgText, continuation);
            c32681.L$0 = obj;
            return c32681;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:115:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x00bb A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:94:0x0034, B:159:0x02f3, B:161:0x02fa, B:163:0x0311, B:97:0x004d, B:142:0x01bc, B:144:0x01cc, B:146:0x0241, B:148:0x0247, B:150:0x0251, B:152:0x0257, B:154:0x025d, B:155:0x0265, B:165:0x0368, B:100:0x0062, B:122:0x0128, B:124:0x0130, B:126:0x0138, B:131:0x0143, B:133:0x014b, B:135:0x0151, B:138:0x0159, B:166:0x03c2, B:168:0x0407, B:101:0x0069, B:109:0x00a8, B:111:0x00af, B:117:0x00bb, B:119:0x0102, B:106:0x0076), top: B:173:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:119:0x0102 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:94:0x0034, B:159:0x02f3, B:161:0x02fa, B:163:0x0311, B:97:0x004d, B:142:0x01bc, B:144:0x01cc, B:146:0x0241, B:148:0x0247, B:150:0x0251, B:152:0x0257, B:154:0x025d, B:155:0x0265, B:165:0x0368, B:100:0x0062, B:122:0x0128, B:124:0x0130, B:126:0x0138, B:131:0x0143, B:133:0x014b, B:135:0x0151, B:138:0x0159, B:166:0x03c2, B:168:0x0407, B:101:0x0069, B:109:0x00a8, B:111:0x00af, B:117:0x00bb, B:119:0x0102, B:106:0x0076), top: B:173:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0130 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:94:0x0034, B:159:0x02f3, B:161:0x02fa, B:163:0x0311, B:97:0x004d, B:142:0x01bc, B:144:0x01cc, B:146:0x0241, B:148:0x0247, B:150:0x0251, B:152:0x0257, B:154:0x025d, B:155:0x0265, B:165:0x0368, B:100:0x0062, B:122:0x0128, B:124:0x0130, B:126:0x0138, B:131:0x0143, B:133:0x014b, B:135:0x0151, B:138:0x0159, B:166:0x03c2, B:168:0x0407, B:101:0x0069, B:109:0x00a8, B:111:0x00af, B:117:0x00bb, B:119:0x0102, B:106:0x0076), top: B:173:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:144:0x01cc A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:94:0x0034, B:159:0x02f3, B:161:0x02fa, B:163:0x0311, B:97:0x004d, B:142:0x01bc, B:144:0x01cc, B:146:0x0241, B:148:0x0247, B:150:0x0251, B:152:0x0257, B:154:0x025d, B:155:0x0265, B:165:0x0368, B:100:0x0062, B:122:0x0128, B:124:0x0130, B:126:0x0138, B:131:0x0143, B:133:0x014b, B:135:0x0151, B:138:0x0159, B:166:0x03c2, B:168:0x0407, B:101:0x0069, B:109:0x00a8, B:111:0x00af, B:117:0x00bb, B:119:0x0102, B:106:0x0076), top: B:173:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:161:0x02fa A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:94:0x0034, B:159:0x02f3, B:161:0x02fa, B:163:0x0311, B:97:0x004d, B:142:0x01bc, B:144:0x01cc, B:146:0x0241, B:148:0x0247, B:150:0x0251, B:152:0x0257, B:154:0x025d, B:155:0x0265, B:165:0x0368, B:100:0x0062, B:122:0x0128, B:124:0x0130, B:126:0x0138, B:131:0x0143, B:133:0x014b, B:135:0x0151, B:138:0x0159, B:166:0x03c2, B:168:0x0407, B:101:0x0069, B:109:0x00a8, B:111:0x00af, B:117:0x00bb, B:119:0x0102, B:106:0x0076), top: B:173:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0311 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:94:0x0034, B:159:0x02f3, B:161:0x02fa, B:163:0x0311, B:97:0x004d, B:142:0x01bc, B:144:0x01cc, B:146:0x0241, B:148:0x0247, B:150:0x0251, B:152:0x0257, B:154:0x025d, B:155:0x0265, B:165:0x0368, B:100:0x0062, B:122:0x0128, B:124:0x0130, B:126:0x0138, B:131:0x0143, B:133:0x014b, B:135:0x0151, B:138:0x0159, B:166:0x03c2, B:168:0x0407, B:101:0x0069, B:109:0x00a8, B:111:0x00af, B:117:0x00bb, B:119:0x0102, B:106:0x0076), top: B:173:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:165:0x0368 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:94:0x0034, B:159:0x02f3, B:161:0x02fa, B:163:0x0311, B:97:0x004d, B:142:0x01bc, B:144:0x01cc, B:146:0x0241, B:148:0x0247, B:150:0x0251, B:152:0x0257, B:154:0x025d, B:155:0x0265, B:165:0x0368, B:100:0x0062, B:122:0x0128, B:124:0x0130, B:126:0x0138, B:131:0x0143, B:133:0x014b, B:135:0x0151, B:138:0x0159, B:166:0x03c2, B:168:0x0407, B:101:0x0069, B:109:0x00a8, B:111:0x00af, B:117:0x00bb, B:119:0x0102, B:106:0x0076), top: B:173:0x0011 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instructions count: 1230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatViewModel.C32681.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void uploadAndSendVideo(Context context, Uri videoUri, String quoteMsgId, String quoteMsgText) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32681(videoUri, context, quoteMsgId, quoteMsgText, null), 3, null);
    }

    public static /* synthetic */ void uploadAndSendFile$default(ChatViewModel chatViewModel, Context context, Uri uri, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        chatViewModel.uploadAndSendFile(context, uri, str, str2);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$uploadAndSendFile$1", m185f = "ChatViewModel.kt", m186i = {0, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3}, m187l = {576, 586, 604, 636}, m188m = "invokeSuspend", m189n = {"$this$launch", "$this$launch", "token", "$this$launch", "token", "tokenResponse", "uploadToken", "$this$launch", "token", "tokenResponse", "uploadToken", "uploadResult", "uploadResponse\\2", "fileMd5\\2", "fileName\\2", "fileKey\\2", "$i$a$-fold-ChatViewModel$uploadAndSendFile$1$1\\2\\610\\0"}, m191s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "L$7", "L$8", "L$9", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$uploadAndSendFile$1 */
    static final class C32661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $fileUri;
        final /* synthetic */ String $quoteMsgId;
        final /* synthetic */ String $quoteMsgText;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32661(Uri uri, Context context, String str, String str2, Continuation<? super C32661> continuation) {
            super(2, continuation);
            this.$fileUri = uri;
            this.$context = context;
            this.$quoteMsgId = str;
            this.$quoteMsgText = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C32661 c32661 = ChatViewModel.this.new C32661(this.$fileUri, this.$context, this.$quoteMsgId, this.$quoteMsgText, continuation);
            c32661.L$0 = obj;
            return c32661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x0105 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:86:0x0041, B:143:0x03c0, B:145:0x03c7, B:147:0x03eb, B:89:0x005a, B:134:0x0210, B:136:0x0224, B:139:0x029e, B:149:0x0448, B:92:0x006f, B:114:0x017c, B:116:0x0184, B:118:0x018c, B:123:0x0197, B:125:0x019f, B:127:0x01a5, B:130:0x01ad, B:150:0x04a2, B:152:0x04e7, B:93:0x0076, B:101:0x00f2, B:103:0x00f9, B:109:0x0105, B:111:0x014c, B:98:0x0083), top: B:157:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:111:0x014c A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:86:0x0041, B:143:0x03c0, B:145:0x03c7, B:147:0x03eb, B:89:0x005a, B:134:0x0210, B:136:0x0224, B:139:0x029e, B:149:0x0448, B:92:0x006f, B:114:0x017c, B:116:0x0184, B:118:0x018c, B:123:0x0197, B:125:0x019f, B:127:0x01a5, B:130:0x01ad, B:150:0x04a2, B:152:0x04e7, B:93:0x0076, B:101:0x00f2, B:103:0x00f9, B:109:0x0105, B:111:0x014c, B:98:0x0083), top: B:157:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x0184 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:86:0x0041, B:143:0x03c0, B:145:0x03c7, B:147:0x03eb, B:89:0x005a, B:134:0x0210, B:136:0x0224, B:139:0x029e, B:149:0x0448, B:92:0x006f, B:114:0x017c, B:116:0x0184, B:118:0x018c, B:123:0x0197, B:125:0x019f, B:127:0x01a5, B:130:0x01ad, B:150:0x04a2, B:152:0x04e7, B:93:0x0076, B:101:0x00f2, B:103:0x00f9, B:109:0x0105, B:111:0x014c, B:98:0x0083), top: B:157:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0224 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:86:0x0041, B:143:0x03c0, B:145:0x03c7, B:147:0x03eb, B:89:0x005a, B:134:0x0210, B:136:0x0224, B:139:0x029e, B:149:0x0448, B:92:0x006f, B:114:0x017c, B:116:0x0184, B:118:0x018c, B:123:0x0197, B:125:0x019f, B:127:0x01a5, B:130:0x01ad, B:150:0x04a2, B:152:0x04e7, B:93:0x0076, B:101:0x00f2, B:103:0x00f9, B:109:0x0105, B:111:0x014c, B:98:0x0083), top: B:157:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:145:0x03c7 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:86:0x0041, B:143:0x03c0, B:145:0x03c7, B:147:0x03eb, B:89:0x005a, B:134:0x0210, B:136:0x0224, B:139:0x029e, B:149:0x0448, B:92:0x006f, B:114:0x017c, B:116:0x0184, B:118:0x018c, B:123:0x0197, B:125:0x019f, B:127:0x01a5, B:130:0x01ad, B:150:0x04a2, B:152:0x04e7, B:93:0x0076, B:101:0x00f2, B:103:0x00f9, B:109:0x0105, B:111:0x014c, B:98:0x0083), top: B:157:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:147:0x03eb A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:86:0x0041, B:143:0x03c0, B:145:0x03c7, B:147:0x03eb, B:89:0x005a, B:134:0x0210, B:136:0x0224, B:139:0x029e, B:149:0x0448, B:92:0x006f, B:114:0x017c, B:116:0x0184, B:118:0x018c, B:123:0x0197, B:125:0x019f, B:127:0x01a5, B:130:0x01ad, B:150:0x04a2, B:152:0x04e7, B:93:0x0076, B:101:0x00f2, B:103:0x00f9, B:109:0x0105, B:111:0x014c, B:98:0x0083), top: B:157:0x0012 }] */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0448 A[Catch: Exception -> 0x007c, TryCatch #0 {Exception -> 0x007c, blocks: (B:86:0x0041, B:143:0x03c0, B:145:0x03c7, B:147:0x03eb, B:89:0x005a, B:134:0x0210, B:136:0x0224, B:139:0x029e, B:149:0x0448, B:92:0x006f, B:114:0x017c, B:116:0x0184, B:118:0x018c, B:123:0x0197, B:125:0x019f, B:127:0x01a5, B:130:0x01ad, B:150:0x04a2, B:152:0x04e7, B:93:0x0076, B:101:0x00f2, B:103:0x00f9, B:109:0x0105, B:111:0x014c, B:98:0x0083), top: B:157:0x0012 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r36) {
            /*
                Method dump skipped, instructions count: 1458
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatViewModel.C32661.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void uploadAndSendFile(Context context, Uri fileUri, String quoteMsgId, String quoteMsgText) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32661(fileUri, context, quoteMsgId, quoteMsgText, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getFileNameFromUri(android.content.Context r10, android.net.Uri r11) {
        /*
            r9 = this;
            r1 = 0
            r2 = 0
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Exception -> L42
            r7 = 0
            r8 = 0
            r5 = 0
            r6 = 0
            r4 = r11
            android.database.Cursor r11 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L3f
            if (r11 == 0) goto L4f
            java.io.Closeable r11 = (java.io.Closeable) r11     // Catch: java.lang.Exception -> L3f
            r0 = r11
            android.database.Cursor r0 = (android.database.Cursor) r0     // Catch: java.lang.Throwable -> L32
            r3 = 0
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L32
            if (r5 == 0) goto L2b
            java.lang.String r5 = "_display_name"
            int r5 = r0.getColumnIndex(r5)     // Catch: java.lang.Throwable -> L32
            if (r5 < 0) goto L2b
            java.lang.String r6 = r0.getString(r5)     // Catch: java.lang.Throwable -> L32
            r1 = r6
        L2b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L32
            kotlin.p008io.CloseableKt.closeFinally(r11, r2)     // Catch: java.lang.Exception -> L3f
            goto L4f
        L32:
            r0 = move-exception
            r3 = r1
            r1 = r0
            throw r1     // Catch: java.lang.Throwable -> L36
        L36:
            r0 = move-exception
            kotlin.p008io.CloseableKt.closeFinally(r11, r1)     // Catch: java.lang.Exception -> L3b
            throw r0     // Catch: java.lang.Exception -> L3b
        L3b:
            r0 = move-exception
            r11 = r0
            r1 = r3
            goto L45
        L3f:
            r0 = move-exception
            r11 = r0
            goto L45
        L42:
            r0 = move-exception
            r4 = r11
            r11 = r0
        L45:
            java.lang.String r0 = "\u26a0\ufe0f \u65e0\u6cd5\u4eceContentResolver\u83b7\u53d6\u6587\u4ef6\u540d"
            r3 = r11
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r5 = "ChatViewModel"
            android.util.Log.w(r5, r0, r3)
        L4f:
            r11 = 0
            if (r1 != 0) goto L7e
            java.lang.String r0 = r4.getLastPathSegment()
            if (r0 == 0) goto L7e
            r3 = 0
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = 47
            r7 = 2
            boolean r5 = kotlin.text.StringsKt.contains$default(r5, r6, r11, r7, r2)
            if (r5 == 0) goto L6a
            java.lang.String r2 = kotlin.text.StringsKt.substringAfterLast$default(r0, r6, r2, r7, r2)
            goto L7b
        L6a:
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r6 = 58
            boolean r5 = kotlin.text.StringsKt.contains$default(r5, r6, r11, r7, r2)
            if (r5 == 0) goto L7a
            java.lang.String r2 = kotlin.text.StringsKt.substringAfterLast$default(r0, r6, r2, r7, r2)
            goto L7b
        L7a:
            r2 = r0
        L7b:
            r1 = r2
        L7e:
            r0 = r1
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L89
            boolean r0 = kotlin.text.StringsKt.isBlank(r0)
            if (r0 == 0) goto L8a
        L89:
            r11 = 1
        L8a:
            if (r11 == 0) goto La3
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "file_"
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r11 = r11.append(r2)
            java.lang.String r1 = r11.toString()
        La3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatViewModel.getFileNameFromUri(android.content.Context, android.net.Uri):java.lang.String");
    }

    public final void handleEditedMessage(ChatMessage message) {
        boolean isPrivateChat = Intrinsics.areEqual(message.getChatId(), message.getRecvId());
        String targetChatId = isPrivateChat ? message.getSender().getChatId() : message.getChatId();
        if (!Intrinsics.areEqual(targetChatId, this.currentChatId)) {
            return;
        }
        int existingIndex = 0;
        Iterator<ChatMessage> it = this._messages.iterator();
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((ChatMessage) it.next()).getMsgId(), message.getMsgId())) {
                    break;
                } else {
                    existingIndex++;
                }
            } else {
                existingIndex = -1;
                break;
            }
        }
        if (existingIndex != -1) {
            this._messages.set(existingIndex, message);
            Log.d(this.tag, "Updated edited message: " + message.getMsgId());
        }
    }

    public final void handleDeletedMessage(String messageId) {
        int existingIndex = 0;
        Iterator<ChatMessage> it = this._messages.iterator();
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((ChatMessage) it.next()).getMsgId(), messageId)) {
                    break;
                } else {
                    existingIndex++;
                }
            } else {
                existingIndex = -1;
                break;
            }
        }
        if (existingIndex != -1) {
            this._messages.remove(existingIndex);
            Log.d(this.tag, "Removed deleted message: " + messageId);
        }
    }

    public final void handleStreamMessage(MessageEvent.StreamMessage streamMessage) {
        int iNextIndex;
        if (!Intrinsics.areEqual(streamMessage.getChatId(), this.currentChatId)) {
            return;
        }
        Log.d(this.tag, "Handling stream message: msgId=" + streamMessage.getMsgId() + ", content=" + streamMessage.getContent());
        int existingIndex = 0;
        Iterator<ChatMessage> it = this._messages.iterator();
        while (true) {
            iNextIndex = -1;
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((ChatMessage) it.next()).getMsgId(), streamMessage.getMsgId())) {
                    break;
                } else {
                    existingIndex++;
                }
            } else {
                existingIndex = -1;
                break;
            }
        }
        if (existingIndex == -1) {
            ChatMessage baseMessage = new ChatMessage(streamMessage.getMsgId(), new MessageSender(streamMessage.getChatId(), 3, "\u673a\u5668\u4eba", "", CollectionsKt.emptyList(), CollectionsKt.emptyList()), "left", 1, new MessageContent(streamMessage.getContent(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null), System.currentTimeMillis(), null, null, null, null, null, streamMessage.getChatId(), 3, streamMessage.getRecvId());
            List list = this._messages;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    break;
                }
                if (listIterator.previous().getSendTime() <= baseMessage.getSendTime()) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            int insertIndex = iNextIndex + 1;
            this._messages.add(insertIndex, baseMessage);
            this.streamingMessages.put(streamMessage.getMsgId(), streamMessage.getContent());
            Log.d(this.tag, "Created base message for stream at index " + insertIndex);
            return;
        }
        String accumulatedContent = ((Object) this.streamingMessages.getOrDefault(streamMessage.getMsgId(), "")) + streamMessage.getContent();
        this.streamingMessages.put(streamMessage.getMsgId(), accumulatedContent);
        ChatMessage existingMessage = this._messages.get(existingIndex);
        ChatMessage updatedMessage = existingMessage.copy((15335 & 1) != 0 ? existingMessage.msgId : null, (15335 & 2) != 0 ? existingMessage.sender : null, (15335 & 4) != 0 ? existingMessage.direction : null, (15335 & 8) != 0 ? existingMessage.contentType : 0, (15335 & 16) != 0 ? existingMessage.content : MessageContent.copy$default(existingMessage.getContent(), accumulatedContent, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null), (15335 & 32) != 0 ? existingMessage.sendTime : 0L, (15335 & 64) != 0 ? existingMessage.cmd : null, (15335 & 128) != 0 ? existingMessage.msgDeleteTime : null, (15335 & 256) != 0 ? existingMessage.quoteMsgId : null, (15335 & 512) != 0 ? existingMessage.msgSeq : null, (15335 & 1024) != 0 ? existingMessage.editTime : null, (15335 & 2048) != 0 ? existingMessage.chatId : null, (15335 & 4096) != 0 ? existingMessage.chatType : null, (15335 & 8192) != 0 ? existingMessage.recvId : null);
        this._messages.set(existingIndex, updatedMessage);
        Log.d(this.tag, "Updated stream message at index " + existingIndex);
    }

    private final void loadMessagesFromPosition(String msgId) {
        if (!(this.currentChatId.length() == 0)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32571(msgId, null), 3, null);
        } else {
            Log.w(this.tag, "Chat not initialized");
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$loadMessagesFromPosition$1", m185f = "ChatViewModel.kt", m186i = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m187l = {817, 831}, m188m = "invokeSuspend", m189n = {"result", "newMessages\\1", "$this$filter\\2", "$this$filterTo\\3", "destination\\3", "element\\3", "message\\4", "$i$a$-fold-ChatViewModel$loadMessagesFromPosition$1$1\\1\\824\\0", "$i$f$filter\\2\\829", "$i$f$filterTo\\3\\1646", "$i$a$-filter-ChatViewModel$loadMessagesFromPosition$1$1$filteredMessages$1\\4\\1647\\1", "$i$a$-runCatching-ChatViewModel$loadMessagesFromPosition$1$1$filteredMessages$1$isBlocked$1\\5\\830\\4"}, m191s = {"L$0", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$loadMessagesFromPosition$1 */
    static final class C32571 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $msgId;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32571(String str, Continuation<? super C32571> continuation) {
            super(2, continuation);
            this.$msgId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32571(this.$msgId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:182|183|299|184|185|297|186|187|292|188|189|290|190|(1:192)(15:193|301|194|195|286|208|(1:211)|210|212|(1:214)(1:215)|(1:217)|218|282|180|(12:223|288|224|(1:226)|227|(8:229|(1:231)(5:232|(1:234)(1:235)|236|(6:239|(1:241)(1:242)|243|(3:307|245|311)(1:310)|309|237)|308)|246|(1:248)|249|(1:251)(2:252|(1:254)(2:255|(3:256|(1:258)|259)))|261|(1:263))|264|(1:266)(1:267)|268|269|280|281)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:198:0x01b6, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:199:0x01b7, code lost:
        
            r2 = r3;
            r3 = r5;
            r5 = r6;
            r14 = r13;
            r4 = r19;
            r6 = 0;
            r13 = r12;
            r1 = r38;
            r12 = r0;
            r11 = r10;
            r10 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:200:0x01c6, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:201:0x01c7, code lost:
        
            r18 = r14;
            r2 = r3;
            r3 = r5;
            r5 = r6;
            r14 = r13;
            r4 = r19;
            r6 = 0;
            r13 = r12;
            r1 = r38;
            r12 = r0;
            r11 = r10;
            r10 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:202:0x01d8, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:203:0x01d9, code lost:
        
            r18 = r14;
            r2 = r3;
            r3 = r5;
            r5 = r6;
            r14 = r13;
            r6 = 0;
            r13 = r12;
            r1 = r38;
            r12 = r0;
            r11 = r10;
            r10 = r17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:204:0x01ea, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:205:0x01eb, code lost:
        
            r38 = r2;
            r18 = r14;
            r2 = r3;
            r3 = r5;
            r5 = r6;
            r14 = r13;
            r6 = 0;
            r13 = r12;
            r1 = r38;
            r12 = r0;
            r11 = r10;
            r10 = r17;
         */
        /* JADX WARN: Removed duplicated region for block: B:178:0x00e7 A[Catch: Exception -> 0x0408, TRY_LEAVE, TryCatch #7 {Exception -> 0x0408, blocks: (B:176:0x00da, B:178:0x00e7, B:275:0x03a5, B:173:0x007b), top: B:296:0x007b }] */
        /* JADX WARN: Removed duplicated region for block: B:182:0x0137 A[Catch: Exception -> 0x03a0, TRY_LEAVE, TryCatch #0 {Exception -> 0x03a0, blocks: (B:180:0x0131, B:182:0x0137), top: B:282:0x0131 }] */
        /* JADX WARN: Removed duplicated region for block: B:211:0x0218 A[Catch: Exception -> 0x023d, TryCatch #2 {Exception -> 0x023d, blocks: (B:208:0x0211, B:212:0x021f, B:217:0x022e, B:211:0x0218), top: B:286:0x0211 }] */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0228  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x022a  */
        /* JADX WARN: Removed duplicated region for block: B:217:0x022e A[Catch: Exception -> 0x023d, TRY_LEAVE, TryCatch #2 {Exception -> 0x023d, blocks: (B:208:0x0211, B:212:0x021f, B:217:0x022e, B:211:0x0218), top: B:286:0x0211 }] */
        /* JADX WARN: Removed duplicated region for block: B:223:0x0246  */
        /* JADX WARN: Removed duplicated region for block: B:274:0x03a4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:193:0x018d -> B:301:0x0199). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:207:0x0207 -> B:286:0x0211). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r38) {
            /*
                Method dump skipped, instructions count: 1154
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatViewModel.C32571.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static /* synthetic */ void loadMessages$default(ChatViewModel chatViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        chatViewModel.loadMessages(z);
    }

    public final void loadMessages(boolean refresh) {
        if (!(this.currentChatId.length() == 0)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32561(refresh, null), 3, null);
        } else {
            Log.w(this.tag, "Chat not initialized");
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$loadMessages$1", m185f = "ChatViewModel.kt", m186i = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m187l = {897, 905, 918}, m188m = "invokeSuspend", m189n = {"result", "newMessages\\1", "$this$filter\\2", "$this$filterTo\\3", "destination\\3", "element\\3", "message\\4", "$i$a$-fold-ChatViewModel$loadMessages$1$1\\1\\911\\0", "$i$f$filter\\2\\916", "$i$f$filterTo\\3\\1646", "$i$a$-filter-ChatViewModel$loadMessages$1$1$filteredMessages$1\\4\\1647\\1", "$i$a$-runCatching-ChatViewModel$loadMessages$1$1$filteredMessages$1$isBlocked$1\\5\\917\\4"}, m191s = {"L$0", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "I$0", "I$1", "I$2", "I$3", "I$4"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$loadMessages$1 */
    static final class C32561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $refresh;
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        int I$4;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32561(boolean z, Continuation<? super C32561> continuation) {
            super(2, continuation);
            this.$refresh = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32561(this.$refresh, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(20:240|241|366|242|243|368|244|245|373|246|247|377|248|249|360|250|251|370|252|(1:254)(15:255|362|256|257|357|274|(1:277)|276|278|(1:280)(1:281)|(1:283)|284|379|238|(11:289|290|(1:292)|(1:294)(1:295)|296|(8:298|(1:300)(5:301|(1:303)(1:304)|305|(6:308|(1:310)(1:311)|312|(3:384|314|387)(1:386)|385|306)|383)|315|(1:317)(1:318)|319|(1:321)(2:322|(1:324)(2:325|(3:326|(1:328)|329)))|331|(1:333))|334|(1:336)|337|355|356)(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:260:0x0232, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:261:0x0233, code lost:
        
            r1 = r6;
            r2 = r12;
            r12 = r0;
            r7 = r2;
            r17 = r11;
            r2 = r3;
            r5 = r20;
            r3 = r21;
            r4 = r22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:262:0x0247, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:263:0x0248, code lost:
        
            r22 = r5;
            r1 = r6;
            r2 = r12;
            r12 = r0;
            r7 = r2;
            r17 = r11;
            r2 = r3;
            r5 = r20;
            r3 = r21;
            r4 = r22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:264:0x025e, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:265:0x025f, code lost:
        
            r22 = r5;
            r1 = r6;
            r2 = r12;
            r12 = r0;
            r7 = r2;
            r17 = r11;
            r2 = r3;
            r5 = r20;
            r3 = r21;
            r4 = r22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:266:0x0277, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:267:0x0278, code lost:
        
            r22 = r5;
            r20 = r7;
            r1 = r6;
            r2 = r12;
            r12 = r0;
            r7 = r2;
            r17 = r11;
            r2 = r3;
            r5 = r20;
            r3 = r21;
            r4 = r22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:268:0x0291, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:269:0x0292, code lost:
        
            r22 = r5;
            r20 = r7;
            r1 = r6;
            r2 = r12;
            r12 = r0;
            r7 = r2;
            r17 = r11;
            r2 = r3;
            r5 = r20;
            r3 = r4;
            r4 = r22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:270:0x02ad, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:271:0x02ae, code lost:
        
            r18 = r2;
            r22 = r5;
            r20 = r7;
            r1 = r6;
            r2 = r12;
            r12 = r0;
            r7 = r2;
            r17 = r11;
            r2 = r3;
            r5 = r20;
            r3 = r4;
            r4 = r22;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:236:0x015c A[Catch: Exception -> 0x051b, TRY_LEAVE, TryCatch #8 {Exception -> 0x051b, blocks: (B:234:0x014e, B:236:0x015c, B:342:0x04c7, B:346:0x04eb, B:212:0x009a, B:216:0x00b8, B:231:0x0126), top: B:372:0x009a }] */
        /* JADX WARN: Removed duplicated region for block: B:240:0x01a4 A[Catch: Exception -> 0x04c2, TRY_LEAVE, TryCatch #12 {Exception -> 0x04c2, blocks: (B:238:0x019e, B:240:0x01a4), top: B:379:0x019e }] */
        /* JADX WARN: Removed duplicated region for block: B:277:0x02e9 A[Catch: Exception -> 0x030e, TryCatch #0 {Exception -> 0x030e, blocks: (B:274:0x02e2, B:278:0x02f0, B:283:0x02ff, B:277:0x02e9), top: B:357:0x02e2 }] */
        /* JADX WARN: Removed duplicated region for block: B:280:0x02f9  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x02fb  */
        /* JADX WARN: Removed duplicated region for block: B:283:0x02ff A[Catch: Exception -> 0x030e, TRY_LEAVE, TryCatch #0 {Exception -> 0x030e, blocks: (B:274:0x02e2, B:278:0x02f0, B:283:0x02ff, B:277:0x02e9), top: B:357:0x02e2 }] */
        /* JADX WARN: Removed duplicated region for block: B:289:0x0316  */
        /* JADX WARN: Removed duplicated region for block: B:341:0x04c6  */
        /* JADX WARN: Removed duplicated region for block: B:352:0x0548  */
        /* JADX WARN: Removed duplicated region for block: B:353:0x054b  */
        /* JADX WARN: Type inference failed for: r5v30, types: [java.lang.Iterable] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:255:0x0202 -> B:362:0x0211). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:273:0x02d4 -> B:357:0x02e2). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r42) {
            /*
                Method dump skipped, instructions count: 1414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatViewModel.C32561.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void saveDraft(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.currentChatId.length() > 0) {
            this.draftStore.saveDraft(this.currentChatId, this.currentChatType, content);
        }
    }

    public final String getDraft(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        return this.draftStore.getDraft(str, i);
    }

    public final void clearDraft() {
        if (this.currentChatId.length() > 0) {
            this.draftStore.clearDraft(this.currentChatId, this.currentChatType);
        }
    }

    public final void loadMoreMessages() {
        if (!this.hasMoreMessages || this._uiState.getValue().isLoading()) {
            Log.d(this.tag, "No more messages to load or already loading");
            return;
        }
        Log.d(this.tag, "Loading more messages from msgId: " + this.oldestMsgId + ", seq: " + this.oldestMsgSeq);
        loadMessages(false);
    }

    public static /* synthetic */ void sendTextMessage$default(ChatViewModel chatViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        chatViewModel.sendTextMessage(str, str2);
    }

    public final void sendTextMessage(String text, String quoteMsgId) {
        Intrinsics.checkNotNullParameter(text, "text");
        sendMessage$default(this, text, 1, quoteMsgId, null, null, null, null, null, 248, null);
    }

    public static /* synthetic */ void sendMessage$default(ChatViewModel chatViewModel, String str, int i, String str2, String str3, Long l, List list, Function0 function0, Function1 function1, int i2, Object obj) {
        chatViewModel.sendMessage(str, (i2 & 2) != 0 ? 1 : i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : l, (i2 & 32) == 0 ? list : null, (i2 & 64) != 0 ? new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        } : function0, (i2 & 128) != 0 ? new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return ChatViewModel.sendMessage$lambda$1((String) obj2);
            }
        } : function1);
    }

    public static final Unit sendMessage$lambda$1(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final void sendMessage(String text, int contentType, String quoteMsgId, String quoteMsgText, Long commandId, List<String> mentionedIds, Function0<Unit> onSuccess, Function1<? super String, Unit> onError) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onError, "onError");
        if (this.currentChatId.length() == 0) {
            Log.w(this.tag, "Chat not initialized");
            onError.invoke("Chat not initialized");
        } else if (!StringsKt.isBlank(text) || commandId != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32633(contentType, mentionedIds, this, text, quoteMsgId, quoteMsgText, commandId, onSuccess, onError, null), 3, null);
        } else {
            Log.w(this.tag, "Cannot send empty message without command");
            onError.invoke("Cannot send empty message");
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$sendMessage$3", m185f = "ChatViewModel.kt", m186i = {0, 0}, m187l = {1063}, m188m = "invokeSuspend", m189n = {"typeText", "mentionInfo"}, m191s = {"L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$sendMessage$3 */
    static final class C32633 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Long $commandId;
        final /* synthetic */ int $contentType;
        final /* synthetic */ List<String> $mentionedIds;
        final /* synthetic */ Function1<String, Unit> $onError;
        final /* synthetic */ Function0<Unit> $onSuccess;
        final /* synthetic */ String $quoteMsgId;
        final /* synthetic */ String $quoteMsgText;
        final /* synthetic */ String $text;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ChatViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C32633(int i, List<String> list, ChatViewModel chatViewModel, String str, String str2, String str3, Long l, Function0<Unit> function0, Function1<? super String, Unit> function1, Continuation<? super C32633> continuation) {
            super(2, continuation);
            this.$contentType = i;
            this.$mentionedIds = list;
            this.this$0 = chatViewModel;
            this.$text = str;
            this.$quoteMsgId = str2;
            this.$quoteMsgText = str3;
            this.$commandId = l;
            this.$onSuccess = function0;
            this.$onError = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32633(this.$contentType, this.$mentionedIds, this.this$0, this.$text, this.$quoteMsgId, this.$quoteMsgText, this.$commandId, this.$onSuccess, this.$onError, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32633) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            String typeText;
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        switch (this.$contentType) {
                            case 3:
                                typeText = "Markdown";
                                break;
                            case 8:
                                typeText = "HTML";
                                break;
                            default:
                                typeText = "\u6587\u672c";
                                break;
                        }
                        List<String> list = this.$mentionedIds;
                        String mentionInfo = !(list == null || list.isEmpty()) ? " (@" + this.$mentionedIds.size() + "\u4eba)" : "";
                        String str = this.this$0.tag;
                        String str2 = this.$text;
                        String str3 = this.$quoteMsgId;
                        Log.d(str, "Sending " + typeText + " message: " + str2 + (str3 == null || str3.length() == 0 ? "" : " (\u5f15\u7528\u6d88\u606f)") + mentionInfo);
                        this.L$0 = typeText;
                        this.L$1 = SpillingKt.nullOutSpilledVariable(mentionInfo);
                        this.label = 1;
                        Object objM8619sendMessagetZkwj4A = this.this$0.messageRepository.m8619sendMessagetZkwj4A(this.this$0.currentChatId, this.this$0.currentChatType, this.$text, this.$contentType, this.$quoteMsgId, this.$quoteMsgText, this.$commandId, this.$mentionedIds, this);
                        if (objM8619sendMessagetZkwj4A != coroutine_suspended) {
                            result = objM8619sendMessagetZkwj4A;
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        typeText = (String) this.L$0;
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChatViewModel chatViewModel = this.this$0;
                Function0<Unit> function0 = this.$onSuccess;
                Function1<String, Unit> function1 = this.$onError;
                ChatViewModel chatViewModel2 = this.this$0;
                Function1<String, Unit> function12 = this.$onError;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                String str4 = "\u53d1\u9001\u5931\u8d25";
                if (thM11922exceptionOrNullimpl != null) {
                    Log.e(chatViewModel2.tag, "Error sending " + typeText + " message", thM11922exceptionOrNullimpl);
                    MutableStateFlow mutableStateFlow = chatViewModel2._uiState;
                    ChatUiState chatUiState = (ChatUiState) chatViewModel2._uiState.getValue();
                    mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : "\u53d1\u9001\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                    String message = thM11922exceptionOrNullimpl.getMessage();
                    if (message != null) {
                        str4 = message;
                    }
                    function12.invoke(str4);
                } else if (((Boolean) result).booleanValue()) {
                    Log.d(chatViewModel.tag, typeText + " message sent successfully");
                    chatViewModel.loadMessages(true);
                    function0.invoke();
                } else {
                    Log.e(chatViewModel.tag, "Failed to send " + typeText + " message");
                    MutableStateFlow mutableStateFlow2 = chatViewModel._uiState;
                    ChatUiState chatUiState2 = (ChatUiState) chatViewModel._uiState.getValue();
                    mutableStateFlow2.setValue(chatUiState2.copy((16381 & 1) != 0 ? chatUiState2.isLoading : false, (16381 & 2) != 0 ? chatUiState2.error : "\u53d1\u9001\u5931\u8d25", (16381 & 4) != 0 ? chatUiState2.isConnected : false, (16381 & 8) != 0 ? chatUiState2.isRefreshing : false, (16381 & 16) != 0 ? chatUiState2.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState2.groupInfo : null, (16381 & 64) != 0 ? chatUiState2.groupMembers : null, (16381 & 128) != 0 ? chatUiState2.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState2.botInfo : null, (16381 & 512) != 0 ? chatUiState2.botBoard : null, (16381 & 1024) != 0 ? chatUiState2.groupBots : null, (16381 & 2048) != 0 ? chatUiState2.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState2.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState2.menuButtons : null));
                    function1.invoke("\u53d1\u9001\u5931\u8d25");
                }
            } catch (Exception e) {
                Log.e(this.this$0.tag, "Error sending message", e);
                MutableStateFlow mutableStateFlow3 = this.this$0._uiState;
                ChatUiState chatUiState3 = (ChatUiState) this.this$0._uiState.getValue();
                String message2 = e.getMessage();
                if (message2 == null) {
                    message2 = "\u53d1\u9001\u6d88\u606f\u5931\u8d25";
                }
                mutableStateFlow3.setValue(chatUiState3.copy((16381 & 1) != 0 ? chatUiState3.isLoading : false, (16381 & 2) != 0 ? chatUiState3.error : message2, (16381 & 4) != 0 ? chatUiState3.isConnected : false, (16381 & 8) != 0 ? chatUiState3.isRefreshing : false, (16381 & 16) != 0 ? chatUiState3.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState3.groupInfo : null, (16381 & 64) != 0 ? chatUiState3.groupMembers : null, (16381 & 128) != 0 ? chatUiState3.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState3.botInfo : null, (16381 & 512) != 0 ? chatUiState3.botBoard : null, (16381 & 1024) != 0 ? chatUiState3.groupBots : null, (16381 & 2048) != 0 ? chatUiState3.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState3.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState3.menuButtons : null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void sendExpressionMessage$default(ChatViewModel chatViewModel, Expression expression, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        chatViewModel.sendExpressionMessage(expression, str, str2);
    }

    public final void sendExpressionMessage(Expression expression, String quoteMsgId, String quoteMsgText) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        if (!(this.currentChatId.length() == 0)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32621(expression, quoteMsgId, quoteMsgText, null), 3, null);
        } else {
            Log.w(this.tag, "Chat not initialized");
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$sendExpressionMessage$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {1121}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$sendExpressionMessage$1 */
    static final class C32621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Expression $expression;
        final /* synthetic */ String $quoteMsgId;
        final /* synthetic */ String $quoteMsgText;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32621(Expression expression, String str, String str2, Continuation<? super C32621> continuation) {
            super(2, continuation);
            this.$expression = expression;
            this.$quoteMsgId = str;
            this.$quoteMsgText = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32621(this.$expression, this.$quoteMsgId, this.$quoteMsgText, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Log.d(ChatViewModel.this.tag, "Sending expression message: id=" + this.$expression.getId() + ", url=" + this.$expression.getUrl());
                        this.label = 1;
                        Object objM8616sendExpressionMessagehUnOzRk = ChatViewModel.this.messageRepository.m8616sendExpressionMessagehUnOzRk(ChatViewModel.this.currentChatId, ChatViewModel.this.currentChatType, this.$expression, this.$quoteMsgId, this.$quoteMsgText, this);
                        if (objM8616sendExpressionMessagehUnOzRk == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8616sendExpressionMessagehUnOzRk;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChatViewModel chatViewModel = ChatViewModel.this;
                ChatViewModel chatViewModel2 = ChatViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl != null) {
                    Log.e(chatViewModel2.tag, "Failed to send expression message", thM11922exceptionOrNullimpl);
                    MutableStateFlow mutableStateFlow = chatViewModel2._uiState;
                    ChatUiState chatUiState = (ChatUiState) chatViewModel2._uiState.getValue();
                    String message = thM11922exceptionOrNullimpl.getMessage();
                    mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : message == null ? "\u53d1\u9001\u8868\u60c5\u5931\u8d25" : message, (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                } else if (((Boolean) result).booleanValue()) {
                    Log.d(chatViewModel.tag, "Expression message sent successfully");
                    chatViewModel.loadMessages(true);
                }
            } catch (Exception e) {
                Log.e(ChatViewModel.this.tag, "Error sending expression message", e);
                MutableStateFlow mutableStateFlow2 = ChatViewModel.this._uiState;
                ChatUiState chatUiState2 = (ChatUiState) ChatViewModel.this._uiState.getValue();
                String message2 = e.getMessage();
                mutableStateFlow2.setValue(chatUiState2.copy((16381 & 1) != 0 ? chatUiState2.isLoading : false, (16381 & 2) != 0 ? chatUiState2.error : message2 == null ? "\u53d1\u9001\u8868\u60c5\u5931\u8d25" : message2, (16381 & 4) != 0 ? chatUiState2.isConnected : false, (16381 & 8) != 0 ? chatUiState2.isRefreshing : false, (16381 & 16) != 0 ? chatUiState2.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState2.groupInfo : null, (16381 & 64) != 0 ? chatUiState2.groupMembers : null, (16381 & 128) != 0 ? chatUiState2.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState2.botInfo : null, (16381 & 512) != 0 ? chatUiState2.botBoard : null, (16381 & 1024) != 0 ? chatUiState2.groupBots : null, (16381 & 2048) != 0 ? chatUiState2.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState2.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState2.menuButtons : null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void sendStickerMessage$default(ChatViewModel chatViewModel, StickerItem stickerItem, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        chatViewModel.sendStickerMessage(stickerItem, str, str2);
    }

    public final void sendStickerMessage(StickerItem stickerItem, String quoteMsgId, String quoteMsgText) {
        Intrinsics.checkNotNullParameter(stickerItem, "stickerItem");
        if (!(this.currentChatId.length() == 0)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32641(stickerItem, quoteMsgId, quoteMsgText, null), 3, null);
        } else {
            Log.w(this.tag, "Chat not initialized");
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$sendStickerMessage$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {1170}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$sendStickerMessage$1 */
    static final class C32641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $quoteMsgId;
        final /* synthetic */ String $quoteMsgText;
        final /* synthetic */ StickerItem $stickerItem;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32641(StickerItem stickerItem, String str, String str2, Continuation<? super C32641> continuation) {
            super(2, continuation);
            this.$stickerItem = stickerItem;
            this.$quoteMsgId = str;
            this.$quoteMsgText = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32641(this.$stickerItem, this.$quoteMsgId, this.$quoteMsgText, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Log.d(ChatViewModel.this.tag, "Sending sticker message: id=" + this.$stickerItem.getId() + ", url=" + this.$stickerItem.getUrl());
                        this.label = 1;
                        Object objM8621sendStickerMessagehUnOzRk = ChatViewModel.this.messageRepository.m8621sendStickerMessagehUnOzRk(ChatViewModel.this.currentChatId, ChatViewModel.this.currentChatType, this.$stickerItem, this.$quoteMsgId, this.$quoteMsgText, this);
                        if (objM8621sendStickerMessagehUnOzRk == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8621sendStickerMessagehUnOzRk;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChatViewModel chatViewModel = ChatViewModel.this;
                ChatViewModel chatViewModel2 = ChatViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl != null) {
                    Log.e(chatViewModel2.tag, "Failed to send sticker message", thM11922exceptionOrNullimpl);
                    MutableStateFlow mutableStateFlow = chatViewModel2._uiState;
                    ChatUiState chatUiState = (ChatUiState) chatViewModel2._uiState.getValue();
                    String message = thM11922exceptionOrNullimpl.getMessage();
                    mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : message == null ? "\u53d1\u9001\u8868\u60c5\u5305\u5931\u8d25" : message, (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                } else if (((Boolean) result).booleanValue()) {
                    Log.d(chatViewModel.tag, "Sticker message sent successfully");
                    chatViewModel.loadMessages(true);
                }
            } catch (Exception e) {
                Log.e(ChatViewModel.this.tag, "Error sending sticker message", e);
                MutableStateFlow mutableStateFlow2 = ChatViewModel.this._uiState;
                ChatUiState chatUiState2 = (ChatUiState) ChatViewModel.this._uiState.getValue();
                String message2 = e.getMessage();
                mutableStateFlow2.setValue(chatUiState2.copy((16381 & 1) != 0 ? chatUiState2.isLoading : false, (16381 & 2) != 0 ? chatUiState2.error : message2 == null ? "\u53d1\u9001\u8868\u60c5\u5305\u5931\u8d25" : message2, (16381 & 4) != 0 ? chatUiState2.isConnected : false, (16381 & 8) != 0 ? chatUiState2.isRefreshing : false, (16381 & 16) != 0 ? chatUiState2.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState2.groupInfo : null, (16381 & 64) != 0 ? chatUiState2.groupMembers : null, (16381 & 128) != 0 ? chatUiState2.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState2.botInfo : null, (16381 & 512) != 0 ? chatUiState2.botBoard : null, (16381 & 1024) != 0 ? chatUiState2.groupBots : null, (16381 & 2048) != 0 ? chatUiState2.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState2.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState2.menuButtons : null));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$sendDraftInput$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$sendDraftInput$1 */
    static final class C32611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $inputText;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32611(String str, Continuation<? super C32611> continuation) {
            super(2, continuation);
            this.$inputText = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32611(this.$inputText, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        ChatViewModel.this.webSocketManager.sendDraftInput(ChatViewModel.this.currentChatId, this.$inputText);
                        Log.d(ChatViewModel.this.tag, "Sent draft input for chat: " + ChatViewModel.this.currentChatId);
                    } catch (Exception e) {
                        Log.e(ChatViewModel.this.tag, "Failed to send draft input", e);
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void sendDraftInput(String inputText) {
        Intrinsics.checkNotNullParameter(inputText, "inputText");
        if (this.currentChatId.length() > 0) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32611(inputText, null), 3, null);
        }
    }

    public final void addNewMessage(ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(this.tag, "Adding new message: " + message.getMsgId());
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32441(message, null), 3, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$addNewMessage$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {1225}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$addNewMessage$1 */
    static final class C32441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatMessage $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32441(ChatMessage chatMessage, Continuation<? super C32441> continuation) {
            super(2, continuation);
            this.$message = chatMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32441(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objIsUserBlocked;
            int iNextIndex;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    objIsUserBlocked = ChatViewModel.this.blocklistRepository.isUserBlocked(this.$message.getSender().getChatId(), this);
                    if (objIsUserBlocked == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    objIsUserBlocked = $result;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean isBlocked = ((Boolean) objIsUserBlocked).booleanValue();
            if (isBlocked) {
                Log.d(ChatViewModel.this.tag, "Message from blocked user " + this.$message.getSender().getChatId() + ", ignored");
                return Unit.INSTANCE;
            }
            List list = ChatViewModel.this._messages;
            ChatMessage chatMessage = this.$message;
            int existingIndex = 0;
            Iterator it = list.iterator();
            while (true) {
                iNextIndex = -1;
                if (it.hasNext()) {
                    if (!Intrinsics.areEqual(((ChatMessage) it.next()).getMsgId(), chatMessage.getMsgId())) {
                        existingIndex++;
                    }
                } else {
                    existingIndex = -1;
                }
            }
            if (existingIndex != -1) {
                ChatViewModel.this._messages.set(existingIndex, this.$message);
                Log.d(ChatViewModel.this.tag, "Updated existing message: " + this.$message.getMsgId());
            } else {
                List list2 = ChatViewModel.this._messages;
                ChatMessage chatMessage2 = this.$message;
                ListIterator listIterator = list2.listIterator(list2.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((ChatMessage) listIterator.previous()).getSendTime() <= chatMessage2.getSendTime()) {
                            iNextIndex = listIterator.nextIndex();
                        }
                    }
                }
                int insertIndex = iNextIndex + 1;
                ChatViewModel.this._messages.add(insertIndex, this.$message);
                Log.d(ChatViewModel.this.tag, "Inserted new message at index: " + insertIndex);
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateMessage(ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        int index = 0;
        Iterator<ChatMessage> it = this._messages.iterator();
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((ChatMessage) it.next()).getMsgId(), message.getMsgId())) {
                    break;
                } else {
                    index++;
                }
            } else {
                index = -1;
                break;
            }
        }
        if (index != -1) {
            this._messages.set(index, message);
            Log.d(this.tag, "Updated message: " + message.getMsgId());
        }
    }

    public final void removeMessage(String msgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        int index = 0;
        Iterator<ChatMessage> it = this._messages.iterator();
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((ChatMessage) it.next()).getMsgId(), msgId)) {
                    break;
                } else {
                    index++;
                }
            } else {
                index = -1;
                break;
            }
        }
        if (index != -1) {
            this._messages.remove(index);
            Log.d(this.tag, "Removed message: " + msgId);
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$recallMessage$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {1276}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$recallMessage$1 */
    static final class C32581 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $msgId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32581(String str, Continuation<? super C32581> continuation) {
            super(2, continuation);
            this.$msgId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32581(this.$msgId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Log.d(ChatViewModel.this.tag, "\u5f00\u59cb\u64a4\u56de\u6d88\u606f: " + this.$msgId);
                        this.label = 1;
                        Object objM8614recallMessageBWLJW6A = ChatViewModel.this.messageRepository.m8614recallMessageBWLJW6A(ChatViewModel.this.currentChatId, ChatViewModel.this.currentChatType, this.$msgId, this);
                        if (objM8614recallMessageBWLJW6A == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8614recallMessageBWLJW6A;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChatViewModel chatViewModel = ChatViewModel.this;
                String str = this.$msgId;
                ChatViewModel chatViewModel2 = ChatViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl == null) {
                    ((Boolean) result).booleanValue();
                    Log.d(chatViewModel.tag, "\u6d88\u606f\u64a4\u56de\u6210\u529f: " + str);
                    int i = 0;
                    Iterator it = chatViewModel._messages.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!Intrinsics.areEqual(((ChatMessage) it.next()).getMsgId(), str)) {
                                i++;
                            }
                        } else {
                            i = -1;
                        }
                    }
                    if (i != -1) {
                        ChatMessage chatMessage = (ChatMessage) chatViewModel._messages.get(i);
                        chatViewModel._messages.set(i, chatMessage.copy((15335 & 1) != 0 ? chatMessage.msgId : null, (15335 & 2) != 0 ? chatMessage.sender : null, (15335 & 4) != 0 ? chatMessage.direction : null, (15335 & 8) != 0 ? chatMessage.contentType : 0, (15335 & 16) != 0 ? chatMessage.content : null, (15335 & 32) != 0 ? chatMessage.sendTime : 0L, (15335 & 64) != 0 ? chatMessage.cmd : null, (15335 & 128) != 0 ? chatMessage.msgDeleteTime : Boxing.boxLong(System.currentTimeMillis()), (15335 & 256) != 0 ? chatMessage.quoteMsgId : null, (15335 & 512) != 0 ? chatMessage.msgSeq : null, (15335 & 1024) != 0 ? chatMessage.editTime : null, (15335 & 2048) != 0 ? chatMessage.chatId : null, (15335 & 4096) != 0 ? chatMessage.chatType : null, (15335 & 8192) != 0 ? chatMessage.recvId : null));
                        Log.d(chatViewModel.tag, "\u66f4\u65b0\u6d88\u606f\u4e3a\u64a4\u56de\u72b6\u6001");
                    }
                } else {
                    Log.e(chatViewModel2.tag, "\u6d88\u606f\u64a4\u56de\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), thM11922exceptionOrNullimpl);
                    MutableStateFlow mutableStateFlow = chatViewModel2._uiState;
                    ChatUiState chatUiState = (ChatUiState) chatViewModel2._uiState.getValue();
                    mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : thM11922exceptionOrNullimpl.getMessage(), (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                }
            } catch (Exception e) {
                Log.e(ChatViewModel.this.tag, "\u64a4\u56de\u6d88\u606f\u5f02\u5e38", e);
                MutableStateFlow mutableStateFlow2 = ChatViewModel.this._uiState;
                ChatUiState chatUiState2 = (ChatUiState) ChatViewModel.this._uiState.getValue();
                mutableStateFlow2.setValue(chatUiState2.copy((16381 & 1) != 0 ? chatUiState2.isLoading : false, (16381 & 2) != 0 ? chatUiState2.error : e.getMessage(), (16381 & 4) != 0 ? chatUiState2.isConnected : false, (16381 & 8) != 0 ? chatUiState2.isRefreshing : false, (16381 & 16) != 0 ? chatUiState2.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState2.groupInfo : null, (16381 & 64) != 0 ? chatUiState2.groupMembers : null, (16381 & 128) != 0 ? chatUiState2.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState2.botInfo : null, (16381 & 512) != 0 ? chatUiState2.botBoard : null, (16381 & 1024) != 0 ? chatUiState2.groupBots : null, (16381 & 2048) != 0 ? chatUiState2.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState2.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState2.menuButtons : null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void recallMessage(String msgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32581(msgId, null), 3, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$editMessage$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {1321}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$editMessage$1 */
    static final class C32471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ int $chatType;
        final /* synthetic */ String $content;
        final /* synthetic */ int $contentType;
        final /* synthetic */ String $msgId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32471(String str, String str2, int i, String str3, int i2, Continuation<? super C32471> continuation) {
            super(2, continuation);
            this.$msgId = str;
            this.$chatId = str2;
            this.$chatType = i;
            this.$content = str3;
            this.$contentType = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32471(this.$msgId, this.$chatId, this.$chatType, this.$content, this.$contentType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Log.d(ChatViewModel.this.tag, "\u5f00\u59cb\u7f16\u8f91\u6d88\u606f: " + this.$msgId);
                        this.label = 1;
                        Object objM8610editMessagehUnOzRk = ChatViewModel.this.messageRepository.m8610editMessagehUnOzRk(this.$chatId, this.$chatType, this.$msgId, this.$content, this.$contentType, this);
                        if (objM8610editMessagehUnOzRk != coroutine_suspended) {
                            result = objM8610editMessagehUnOzRk;
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChatViewModel chatViewModel = ChatViewModel.this;
                String str = this.$msgId;
                String str2 = this.$content;
                int i = this.$contentType;
                ChatViewModel chatViewModel2 = ChatViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl == null) {
                    ((Boolean) result).booleanValue();
                    Log.d(chatViewModel.tag, "\u6d88\u606f\u7f16\u8f91\u6210\u529f: " + str);
                    int i2 = 0;
                    Iterator it = chatViewModel._messages.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                        } else if (!Intrinsics.areEqual(((ChatMessage) it.next()).getMsgId(), str)) {
                            i2++;
                        }
                    }
                    int i3 = i2;
                    if (i3 != -1) {
                        ChatMessage chatMessage = (ChatMessage) chatViewModel._messages.get(i3);
                        chatViewModel._messages.set(i3, chatMessage.copy((15335 & 1) != 0 ? chatMessage.msgId : null, (15335 & 2) != 0 ? chatMessage.sender : null, (15335 & 4) != 0 ? chatMessage.direction : null, (15335 & 8) != 0 ? chatMessage.contentType : i, (15335 & 16) != 0 ? chatMessage.content : MessageContent.copy$default(chatMessage.getContent(), str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null), (15335 & 32) != 0 ? chatMessage.sendTime : 0L, (15335 & 64) != 0 ? chatMessage.cmd : null, (15335 & 128) != 0 ? chatMessage.msgDeleteTime : null, (15335 & 256) != 0 ? chatMessage.quoteMsgId : null, (15335 & 512) != 0 ? chatMessage.msgSeq : null, (15335 & 1024) != 0 ? chatMessage.editTime : Boxing.boxLong(System.currentTimeMillis()), (15335 & 2048) != 0 ? chatMessage.chatId : null, (15335 & 4096) != 0 ? chatMessage.chatType : null, (15335 & 8192) != 0 ? chatMessage.recvId : null));
                        Log.d(chatViewModel.tag, "\u66f4\u65b0\u6d88\u606f\u5185\u5bb9");
                    }
                } else {
                    Log.e(chatViewModel2.tag, "\u6d88\u606f\u7f16\u8f91\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), thM11922exceptionOrNullimpl);
                    MutableStateFlow mutableStateFlow = chatViewModel2._uiState;
                    ChatUiState chatUiState = (ChatUiState) chatViewModel2._uiState.getValue();
                    mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : thM11922exceptionOrNullimpl.getMessage(), (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                }
            } catch (Exception e) {
                Log.e(ChatViewModel.this.tag, "\u7f16\u8f91\u6d88\u606f\u5f02\u5e38", e);
                MutableStateFlow mutableStateFlow2 = ChatViewModel.this._uiState;
                ChatUiState chatUiState2 = (ChatUiState) ChatViewModel.this._uiState.getValue();
                mutableStateFlow2.setValue(chatUiState2.copy((16381 & 1) != 0 ? chatUiState2.isLoading : false, (16381 & 2) != 0 ? chatUiState2.error : e.getMessage(), (16381 & 4) != 0 ? chatUiState2.isConnected : false, (16381 & 8) != 0 ? chatUiState2.isRefreshing : false, (16381 & 16) != 0 ? chatUiState2.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState2.groupInfo : null, (16381 & 64) != 0 ? chatUiState2.groupMembers : null, (16381 & 128) != 0 ? chatUiState2.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState2.botInfo : null, (16381 & 512) != 0 ? chatUiState2.botBoard : null, (16381 & 1024) != 0 ? chatUiState2.groupBots : null, (16381 & 2048) != 0 ? chatUiState2.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState2.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState2.menuButtons : null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void editMessage(String str, int i, String msgId, String content, int contentType) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(content, "content");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32471(msgId, str, i, content, contentType, null), 3, null);
    }

    public final void clearError() {
        MutableStateFlow<ChatUiState> mutableStateFlow = this._uiState;
        ChatUiState value = this._uiState.getValue();
        mutableStateFlow.setValue(value.copy((16381 & 1) != 0 ? value.isLoading : false, (16381 & 2) != 0 ? value.error : null, (16381 & 4) != 0 ? value.isConnected : false, (16381 & 8) != 0 ? value.isRefreshing : false, (16381 & 16) != 0 ? value.newMessageReceived : false, (16381 & 32) != 0 ? value.groupInfo : null, (16381 & 64) != 0 ? value.groupMembers : null, (16381 & 128) != 0 ? value.groupMemberCount : 0, (16381 & 256) != 0 ? value.botInfo : null, (16381 & 512) != 0 ? value.botBoard : null, (16381 & 1024) != 0 ? value.groupBots : null, (16381 & 2048) != 0 ? value.groupBotBoards : null, (16381 & 4096) != 0 ? value.chatBackgroundUrl : null, (16381 & 8192) != 0 ? value.menuButtons : null));
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$loadBotInfo$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {1368}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$loadBotInfo$1 */
    static final class C32491 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32491(String str, Continuation<? super C32491> continuation) {
            super(2, continuation);
            this.$botId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32491(this.$botId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8484getBotInfogIAlus = ChatViewModel.this.botRepository.m8484getBotInfogIAlus(this.$botId, this);
                    if (objM8484getBotInfogIAlus != coroutine_suspended) {
                        value = objM8484getBotInfogIAlus;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChatViewModel chatViewModel = ChatViewModel.this;
            ChatViewModel chatViewModel2 = ChatViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                Bot.bot_info bot_infoVar = (Bot.bot_info) value;
                MutableStateFlow mutableStateFlow = chatViewModel._uiState;
                ChatUiState chatUiState = (ChatUiState) chatViewModel._uiState.getValue();
                mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : null, (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : bot_infoVar, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                Log.d(chatViewModel.tag, "\u673a\u5668\u4eba\u4fe1\u606f\u52a0\u8f7d\u6210\u529f: " + bot_infoVar.getData().getName());
            } else {
                Log.e(chatViewModel2.tag, "\u52a0\u8f7d\u673a\u5668\u4eba\u4fe1\u606f\u5931\u8d25", thM11922exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBotInfo(String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32491(botId, null), 3, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$loadBotBoard$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {1385}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$loadBotBoard$1 */
    static final class C32481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ int $chatType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32481(String str, int i, Continuation<? super C32481> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$chatType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32481(this.$chatId, this.$chatType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8483getBotBoard0E7RQCE = ChatViewModel.this.botRepository.m8483getBotBoard0E7RQCE(this.$chatId, this.$chatType, this);
                    if (objM8483getBotBoard0E7RQCE != coroutine_suspended) {
                        value = objM8483getBotBoard0E7RQCE;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ChatViewModel chatViewModel = ChatViewModel.this;
            ChatViewModel chatViewModel2 = ChatViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                Bot.board boardVar = (Bot.board) value;
                if (boardVar.getBoardCount() > 0) {
                    MutableStateFlow mutableStateFlow = chatViewModel._uiState;
                    ChatUiState chatUiState = (ChatUiState) chatViewModel._uiState.getValue();
                    mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : null, (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : boardVar, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                }
            } else {
                MutableStateFlow mutableStateFlow2 = chatViewModel2._uiState;
                ChatUiState chatUiState2 = (ChatUiState) chatViewModel2._uiState.getValue();
                mutableStateFlow2.setValue(chatUiState2.copy((16381 & 1) != 0 ? chatUiState2.isLoading : false, (16381 & 2) != 0 ? chatUiState2.error : "\u52a0\u8f7d\u673a\u5668\u4eba\u770b\u677f\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), (16381 & 4) != 0 ? chatUiState2.isConnected : false, (16381 & 8) != 0 ? chatUiState2.isRefreshing : false, (16381 & 16) != 0 ? chatUiState2.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState2.groupInfo : null, (16381 & 64) != 0 ? chatUiState2.groupMembers : null, (16381 & 128) != 0 ? chatUiState2.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState2.botInfo : null, (16381 & 512) != 0 ? chatUiState2.botBoard : null, (16381 & 1024) != 0 ? chatUiState2.groupBots : null, (16381 & 2048) != 0 ? chatUiState2.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState2.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState2.menuButtons : null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBotBoard(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32481(str, i, null), 3, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$loadChatBackground$1", m185f = "ChatViewModel.kt", m186i = {0}, m187l = {1408}, m188m = "invokeSuspend", m189n = {"chatBackgroundRepository"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$loadChatBackground$1 */
    static final class C32501 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ Context $context;
        Object L$0;
        int label;
        final /* synthetic */ ChatViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32501(Context context, ChatViewModel chatViewModel, String str, Continuation<? super C32501> continuation) {
            super(2, continuation);
            this.$context = context;
            this.this$0 = chatViewModel;
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C32501(this.$context, this.this$0, this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            String imgUrl;
            Object next;
            Object next2;
            String imgUrl2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        ChatBackgroundRepository chatBackgroundRepository = RepositoryFactory.INSTANCE.getChatBackgroundRepository(this.$context);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(chatBackgroundRepository);
                        this.label = 1;
                        Object objM8489getChatBackgroundListIoAF18A = chatBackgroundRepository.m8489getChatBackgroundListIoAF18A(this);
                        if (objM8489getChatBackgroundListIoAF18A != coroutine_suspended) {
                            value = objM8489getChatBackgroundListIoAF18A;
                            break;
                        } else {
                            return coroutine_suspended;
                        }
                    case 1:
                        ResultKt.throwOnFailure($result);
                        value = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChatViewModel chatViewModel = this.this$0;
                String str = this.$chatId;
                ChatViewModel chatViewModel2 = this.this$0;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
                if (thM11922exceptionOrNullimpl == null) {
                    List list = (List) value;
                    Iterator it = list.iterator();
                    while (true) {
                        imgUrl = null;
                        if (it.hasNext()) {
                            next = it.next();
                            if (Intrinsics.areEqual(((ChatBackground) next).getChatId(), str)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    ChatBackground chatBackground = (ChatBackground) next;
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (Intrinsics.areEqual(((ChatBackground) next2).getChatId(), "all")) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    ChatBackground chatBackground2 = (ChatBackground) next2;
                    if (chatBackground != null && (imgUrl2 = chatBackground.getImgUrl()) != null) {
                        imgUrl = imgUrl2;
                    } else if (chatBackground2 != null) {
                        imgUrl = chatBackground2.getImgUrl();
                    }
                    String str2 = imgUrl;
                    MutableStateFlow mutableStateFlow = chatViewModel._uiState;
                    ChatUiState chatUiState = (ChatUiState) chatViewModel._uiState.getValue();
                    mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : null, (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : str2, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                    Log.d(chatViewModel.tag, "\u804a\u5929\u80cc\u666f\u52a0\u8f7d\u6210\u529f: " + str2);
                } else {
                    Log.e(chatViewModel2.tag, "\u52a0\u8f7d\u804a\u5929\u80cc\u666f\u5931\u8d25", thM11922exceptionOrNullimpl);
                }
            } catch (Exception e) {
                Log.e(this.this$0.tag, "\u52a0\u8f7d\u804a\u5929\u80cc\u666f\u5f02\u5e38", e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadChatBackground(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32501(context, this, str, null), 3, null);
    }

    public final void saveCurrentReadPosition() {
        Object next;
        if ((this.currentChatId.length() == 0) || this._messages.isEmpty()) {
            return;
        }
        Iterator it = this._messages.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long sendTime = ((ChatMessage) next).getSendTime();
                do {
                    Object next2 = it.next();
                    long sendTime2 = ((ChatMessage) next2).getSendTime();
                    if (sendTime < sendTime2) {
                        next = next2;
                        sendTime = sendTime2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        ChatMessage latestMessage = (ChatMessage) next;
        if (latestMessage == null || latestMessage.getMsgSeq() == null) {
            return;
        }
        ReadPositionStore readPositionStore = this.readPositionStore;
        String str = this.currentChatId;
        int i = this.currentChatType;
        String msgId = latestMessage.getMsgId();
        Long msgSeq = latestMessage.getMsgSeq();
        Intrinsics.checkNotNull(msgSeq);
        readPositionStore.saveReadPosition(str, i, msgId, msgSeq.longValue());
        Log.d(this.tag, "Saved read position: msgId=" + latestMessage.getMsgId() + ", msgSeq=" + latestMessage.getMsgSeq());
    }

    public final Integer getUnreadCount() {
        Pair readPosition;
        Long lValueOf;
        if ((this.currentChatId.length() == 0) || (readPosition = this.readPositionStore.getReadPosition(this.currentChatId, this.currentChatType)) == null || this._messages.isEmpty()) {
            return null;
        }
        Iterator<ChatMessage> it = this._messages.iterator();
        if (it.hasNext()) {
            Long msgSeq = it.next().getMsgSeq();
            lValueOf = Long.valueOf(msgSeq != null ? msgSeq.longValue() : 0L);
            while (it.hasNext()) {
                Long msgSeq2 = it.next().getMsgSeq();
                Long lValueOf2 = Long.valueOf(msgSeq2 != null ? msgSeq2.longValue() : 0L);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
        } else {
            lValueOf = null;
        }
        Long l = lValueOf;
        if (l == null) {
            return null;
        }
        long latestMsgSeq = l.longValue();
        long lastReadMsgSeq = readPosition.getSecond().longValue();
        int unreadCount = (int) (latestMsgSeq - lastReadMsgSeq);
        if (unreadCount > 0) {
            return Integer.valueOf(unreadCount);
        }
        return 0;
    }

    public final void refreshMessages() {
        Log.d(this.tag, "Refreshing messages");
        this.oldestMsgSeq = 0L;
        this.oldestMsgId = null;
        this.hasMoreMessages = true;
        loadMessages(true);
    }

    public final void refreshLatestMessages() {
        if (!(this.currentChatId.length() == 0)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32591(null), 3, null);
        } else {
            Log.w(this.tag, "Chat not initialized");
        }
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$refreshLatestMessages$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {1498}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$refreshLatestMessages$1 */
    static final class C32591 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C32591(Continuation<? super C32591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32591(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32591) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        MutableStateFlow mutableStateFlow = ChatViewModel.this._uiState;
                        ChatUiState chatUiState = (ChatUiState) ChatViewModel.this._uiState.getValue();
                        mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : null, (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : true, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
                        this.label = 1;
                        Object objM8600getMessagesyxL6bBk$default = MessageRepository.m8600getMessagesyxL6bBk$default(ChatViewModel.this.messageRepository, ChatViewModel.this.currentChatId, ChatViewModel.this.currentChatType, 20, null, this, 8, null);
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
                ChatViewModel chatViewModel = ChatViewModel.this;
                ChatViewModel chatViewModel2 = ChatViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl == null) {
                    List list = (List) result;
                    Log.d(chatViewModel.tag, "Refreshed " + list.size() + " latest messages");
                    if (!list.isEmpty()) {
                        Iterable iterable = chatViewModel._messages;
                        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                        Iterator it = iterable.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((ChatMessage) it.next()).getMsgId());
                        }
                        Set set = CollectionsKt.toSet((List) arrayList);
                        Collection arrayList2 = new ArrayList();
                        for (Object obj : list) {
                            if (!set.contains(((ChatMessage) obj).getMsgId())) {
                                arrayList2.add(obj);
                            }
                        }
                        List list2 = (List) arrayList2;
                        if (!list2.isEmpty()) {
                            chatViewModel._messages.addAll(CollectionsKt.sortedWith(list2, new Comparator() { // from class: com.yhchat.canarys.ui.chat.ChatViewModel$refreshLatestMessages$1$invokeSuspend$lambda$0$$inlined$sortedBy$1
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // java.util.Comparator
                                public final int compare(T t, T t2) {
                                    return ComparisonsKt.compareValues(Long.valueOf(((ChatMessage) t).getSendTime()), Long.valueOf(((ChatMessage) t2).getSendTime()));
                                }
                            }));
                            Log.d(chatViewModel.tag, "Added " + list2.size() + " new messages");
                        }
                        List listSortedWith = CollectionsKt.sortedWith(chatViewModel._messages, new Comparator() { // from class: com.yhchat.canarys.ui.chat.ChatViewModel$refreshLatestMessages$1$invokeSuspend$lambda$0$$inlined$sortedBy$2
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t, T t2) {
                                return ComparisonsKt.compareValues(Long.valueOf(((ChatMessage) t).getSendTime()), Long.valueOf(((ChatMessage) t2).getSendTime()));
                            }
                        });
                        chatViewModel._messages.clear();
                        chatViewModel._messages.addAll(listSortedWith);
                    }
                    MutableStateFlow mutableStateFlow2 = chatViewModel._uiState;
                    ChatUiState chatUiState2 = (ChatUiState) chatViewModel._uiState.getValue();
                    mutableStateFlow2.setValue(chatUiState2.copy((16381 & 1) != 0 ? chatUiState2.isLoading : false, (16381 & 2) != 0 ? chatUiState2.error : null, (16381 & 4) != 0 ? chatUiState2.isConnected : false, (16381 & 8) != 0 ? chatUiState2.isRefreshing : false, (16381 & 16) != 0 ? chatUiState2.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState2.groupInfo : null, (16381 & 64) != 0 ? chatUiState2.groupMembers : null, (16381 & 128) != 0 ? chatUiState2.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState2.botInfo : null, (16381 & 512) != 0 ? chatUiState2.botBoard : null, (16381 & 1024) != 0 ? chatUiState2.groupBots : null, (16381 & 2048) != 0 ? chatUiState2.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState2.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState2.menuButtons : null));
                } else {
                    Log.e(chatViewModel2.tag, "Failed to refresh latest messages", thM11922exceptionOrNullimpl);
                    MutableStateFlow mutableStateFlow3 = chatViewModel2._uiState;
                    ChatUiState chatUiState3 = (ChatUiState) chatViewModel2._uiState.getValue();
                    mutableStateFlow3.setValue(chatUiState3.copy((16381 & 1) != 0 ? chatUiState3.isLoading : false, (16381 & 2) != 0 ? chatUiState3.error : "\u5237\u65b0\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), (16381 & 4) != 0 ? chatUiState3.isConnected : false, (16381 & 8) != 0 ? chatUiState3.isRefreshing : false, (16381 & 16) != 0 ? chatUiState3.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState3.groupInfo : null, (16381 & 64) != 0 ? chatUiState3.groupMembers : null, (16381 & 128) != 0 ? chatUiState3.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState3.botInfo : null, (16381 & 512) != 0 ? chatUiState3.botBoard : null, (16381 & 1024) != 0 ? chatUiState3.groupBots : null, (16381 & 2048) != 0 ? chatUiState3.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState3.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState3.menuButtons : null));
                }
            } catch (Exception e) {
                Log.e(ChatViewModel.this.tag, "Exception refreshing latest messages", e);
                MutableStateFlow mutableStateFlow4 = ChatViewModel.this._uiState;
                ChatUiState chatUiState4 = (ChatUiState) ChatViewModel.this._uiState.getValue();
                mutableStateFlow4.setValue(chatUiState4.copy((16381 & 1) != 0 ? chatUiState4.isLoading : false, (16381 & 2) != 0 ? chatUiState4.error : "\u5237\u65b0\u5f02\u5e38: " + e.getMessage(), (16381 & 4) != 0 ? chatUiState4.isConnected : false, (16381 & 8) != 0 ? chatUiState4.isRefreshing : false, (16381 & 16) != 0 ? chatUiState4.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState4.groupInfo : null, (16381 & 64) != 0 ? chatUiState4.groupMembers : null, (16381 & 128) != 0 ? chatUiState4.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState4.botInfo : null, (16381 & 512) != 0 ? chatUiState4.botBoard : null, (16381 & 1024) != 0 ? chatUiState4.groupBots : null, (16381 & 2048) != 0 ? chatUiState4.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState4.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState4.menuButtons : null));
            }
            return Unit.INSTANCE;
        }
    }

    public final String getCurrentUserId() {
        return this.currentUserId;
    }

    public final boolean isMyMessage(ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return Intrinsics.areEqual(message.getDirection(), "right");
    }

    public final int getCurrentUserPermission() {
        GroupMemberInfo currentUser = this._uiState.getValue().getGroupMembers().get(this.currentUserId);
        if (currentUser != null) {
            return currentUser.getPermissionLevel();
        }
        return 0;
    }

    public final boolean isMessageStreaming(String msgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        return this.streamingMessages.containsKey(msgId);
    }

    public final void clearStreamingMessage(String msgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        this.streamingMessages.remove(msgId);
        Log.d(this.tag, "Cleared streaming message: " + msgId);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$reportButtonClick$1", m185f = "ChatViewModel.kt", m186i = {1}, m187l = {1592, 1593}, m188m = "invokeSuspend", m189n = {"userId"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$reportButtonClick$1 */
    static final class C32601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $buttonValue;
        final /* synthetic */ String $chatId;
        final /* synthetic */ int $chatType;
        final /* synthetic */ String $msgId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32601(String str, int i, String str2, String str3, Continuation<? super C32601> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$chatType = i;
            this.$msgId = str2;
            this.$buttonValue = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32601(this.$chatId, this.$chatType, this.$msgId, this.$buttonValue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:48:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0065 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0066  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                switch(r1) {
                    case 0: goto L26;
                    case 1: goto L1f;
                    case 2: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L11:
                java.lang.Object r0 = r9.L$0
                java.lang.String r0 = (java.lang.String) r0
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L24
                r1 = r10
                kotlin.Result r1 = (kotlin.Result) r1     // Catch: java.lang.Exception -> L24
                r1.getValue()     // Catch: java.lang.Exception -> L24
                goto L67
            L1f:
                kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L24
                r1 = r10
                goto L3d
            L24:
                r0 = move-exception
                goto L93
            L26:
                kotlin.ResultKt.throwOnFailure(r10)
                com.yhchat.canarys.ui.chat.ChatViewModel r1 = com.yhchat.canarys.p007ui.chat.ChatViewModel.this     // Catch: java.lang.Exception -> L24
                com.yhchat.canarys.data.repository.TokenRepository r1 = com.yhchat.canarys.p007ui.chat.ChatViewModel.access$getTokenRepository$p(r1)     // Catch: java.lang.Exception -> L24
                r2 = r9
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2     // Catch: java.lang.Exception -> L24
                r3 = 1
                r9.label = r3     // Catch: java.lang.Exception -> L24
                java.lang.Object r1 = r1.getUserId(r2)     // Catch: java.lang.Exception -> L24
                if (r1 != r0) goto L3d
                return r0
            L3d:
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L24
                if (r1 != 0) goto L43
                java.lang.String r1 = ""
            L43:
                r6 = r1
                com.yhchat.canarys.ui.chat.ChatViewModel r1 = com.yhchat.canarys.p007ui.chat.ChatViewModel.this     // Catch: java.lang.Exception -> L24
                com.yhchat.canarys.data.repository.MessageRepository r2 = com.yhchat.canarys.p007ui.chat.ChatViewModel.access$getMessageRepository$p(r1)     // Catch: java.lang.Exception -> L24
                java.lang.String r3 = r9.$chatId     // Catch: java.lang.Exception -> L24
                int r4 = r9.$chatType     // Catch: java.lang.Exception -> L24
                java.lang.String r5 = r9.$msgId     // Catch: java.lang.Exception -> L24
                java.lang.String r7 = r9.$buttonValue     // Catch: java.lang.Exception -> L24
                r8 = r9
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8     // Catch: java.lang.Exception -> L24
                java.lang.Object r1 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)     // Catch: java.lang.Exception -> L24
                r9.L$0 = r1     // Catch: java.lang.Exception -> L24
                r1 = 2
                r9.label = r1     // Catch: java.lang.Exception -> L24
                java.lang.Object r1 = r2.m8615reportButtonClickhUnOzRk(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L24
                if (r1 != r0) goto L66
                return r0
            L66:
                r0 = r6
            L67:
                com.yhchat.canarys.ui.chat.ChatViewModel r1 = com.yhchat.canarys.p007ui.chat.ChatViewModel.this     // Catch: java.lang.Exception -> L24
                java.lang.String r1 = com.yhchat.canarys.p007ui.chat.ChatViewModel.access$getTag$p(r1)     // Catch: java.lang.Exception -> L24
                java.lang.String r2 = r9.$msgId     // Catch: java.lang.Exception -> L24
                java.lang.String r3 = r9.$buttonValue     // Catch: java.lang.Exception -> L24
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L24
                r4.<init>()     // Catch: java.lang.Exception -> L24
                java.lang.String r5 = "Button click reported successfully: msgId="
                java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Exception -> L24
                java.lang.StringBuilder r2 = r4.append(r2)     // Catch: java.lang.Exception -> L24
                java.lang.String r4 = ", value="
                java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Exception -> L24
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Exception -> L24
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L24
                android.util.Log.d(r1, r2)     // Catch: java.lang.Exception -> L24
                goto La1
            L93:
                com.yhchat.canarys.ui.chat.ChatViewModel r1 = com.yhchat.canarys.p007ui.chat.ChatViewModel.this
                java.lang.String r1 = com.yhchat.canarys.p007ui.chat.ChatViewModel.access$getTag$p(r1)
                java.lang.String r2 = "Failed to report button click"
                r3 = r0
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                android.util.Log.e(r1, r2, r3)
            La1:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatViewModel.C32601.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void reportButtonClick(String str, int i, String msgId, String buttonValue) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(buttonValue, "buttonValue");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32601(str, i, msgId, buttonValue, null), 3, null);
    }

    /* compiled from: ChatViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatViewModel$blockUser$1", m185f = "ChatViewModel.kt", m186i = {}, m187l = {1615}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatViewModel$blockUser$1 */
    static final class C32451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $avatarUrl;
        final /* synthetic */ String $userId;
        final /* synthetic */ String $userName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32451(String str, String str2, String str3, Continuation<? super C32451> continuation) {
            super(2, continuation);
            this.$userId = str;
            this.$userName = str2;
            this.$avatarUrl = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatViewModel.this.new C32451(this.$userId, this.$userName, this.$avatarUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        ChatViewModel.this.blocklistRepository.setBlocklistEnabled(true);
                        this.label = 1;
                        if (BlocklistRepository.m8474blockUseryxL6bBk$default(ChatViewModel.this.blocklistRepository, this.$userId, this.$userName, null, this.$avatarUrl, this, 4, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Log.d(ChatViewModel.this.tag, "Blocked user: " + this.$userId + " (" + this.$userName + ")");
                int beforeSize = ChatViewModel.this._messages.size();
                SnapshotStateList snapshotStateList = ChatViewModel.this._messages;
                final String str = this.$userId;
                CollectionsKt.removeAll((List) snapshotStateList, new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatViewModel$blockUser$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ChatViewModel.C32451.invokeSuspend$lambda$0(str, (ChatMessage) obj));
                    }
                });
                int removedCount = beforeSize - ChatViewModel.this._messages.size();
                if (removedCount > 0) {
                    Log.d(ChatViewModel.this.tag, "Removed " + removedCount + " messages from blocked user: " + this.$userId);
                }
            } catch (Exception e) {
                Log.e(ChatViewModel.this.tag, "Failed to block user", e);
                MutableStateFlow mutableStateFlow = ChatViewModel.this._uiState;
                ChatUiState chatUiState = (ChatUiState) ChatViewModel.this._uiState.getValue();
                mutableStateFlow.setValue(chatUiState.copy((16381 & 1) != 0 ? chatUiState.isLoading : false, (16381 & 2) != 0 ? chatUiState.error : "\u5c4f\u853d\u7528\u6237\u5931\u8d25: " + e.getMessage(), (16381 & 4) != 0 ? chatUiState.isConnected : false, (16381 & 8) != 0 ? chatUiState.isRefreshing : false, (16381 & 16) != 0 ? chatUiState.newMessageReceived : false, (16381 & 32) != 0 ? chatUiState.groupInfo : null, (16381 & 64) != 0 ? chatUiState.groupMembers : null, (16381 & 128) != 0 ? chatUiState.groupMemberCount : 0, (16381 & 256) != 0 ? chatUiState.botInfo : null, (16381 & 512) != 0 ? chatUiState.botBoard : null, (16381 & 1024) != 0 ? chatUiState.groupBots : null, (16381 & 2048) != 0 ? chatUiState.groupBotBoards : null, (16381 & 4096) != 0 ? chatUiState.chatBackgroundUrl : null, (16381 & 8192) != 0 ? chatUiState.menuButtons : null));
            }
            return Unit.INSTANCE;
        }

        public static final boolean invokeSuspend$lambda$0(String $userId, ChatMessage it) {
            return Intrinsics.areEqual(it.getSender().getChatId(), $userId);
        }
    }

    public final void blockUser(String userId, String userName, String avatarUrl) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32451(userId, userName, avatarUrl, null), 3, null);
    }

    @Override // androidx.lifecycle.ViewModel
    protected void onCleared() {
        super.onCleared();
        saveCurrentReadPosition();
        Log.d(this.tag, "ChatViewModel cleared, read position saved");
    }
}
