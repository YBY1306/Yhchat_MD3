package com.yhchat.canarys.data.websocket;

import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketService.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f\u00a8\u0006\u0010"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/MessageEvent;", "", "<init>", "()V", "NewMessage", "MessageEdited", "MessageDeleted", "DraftUpdated", "BotBoardMessage", "StreamMessage", "Lcom/yhchat/canarys/data/websocket/MessageEvent$BotBoardMessage;", "Lcom/yhchat/canarys/data/websocket/MessageEvent$DraftUpdated;", "Lcom/yhchat/canarys/data/websocket/MessageEvent$MessageDeleted;", "Lcom/yhchat/canarys/data/websocket/MessageEvent$MessageEdited;", "Lcom/yhchat/canarys/data/websocket/MessageEvent$NewMessage;", "Lcom/yhchat/canarys/data/websocket/MessageEvent$StreamMessage;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public abstract class MessageEvent {
    public static final int $stable = 0;

    public /* synthetic */ MessageEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/MessageEvent$NewMessage;", "Lcom/yhchat/canarys/data/websocket/MessageEvent;", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "<init>", "(Lcom/yhchat/canarys/data/model/ChatMessage;)V", "getMessage", "()Lcom/yhchat/canarys/data/model/ChatMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class NewMessage extends MessageEvent {
        public static final int $stable = 8;
        private final ChatMessage message;

        public static /* synthetic */ NewMessage copy$default(NewMessage newMessage, ChatMessage chatMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                chatMessage = newMessage.message;
            }
            return newMessage.copy(chatMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final ChatMessage getMessage() {
            return this.message;
        }

        public final NewMessage copy(ChatMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new NewMessage(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewMessage) && Intrinsics.areEqual(this.message, ((NewMessage) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "NewMessage(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewMessage(ChatMessage message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final ChatMessage getMessage() {
            return this.message;
        }
    }

    private MessageEvent() {
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/MessageEvent$MessageEdited;", "Lcom/yhchat/canarys/data/websocket/MessageEvent;", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "<init>", "(Lcom/yhchat/canarys/data/model/ChatMessage;)V", "getMessage", "()Lcom/yhchat/canarys/data/model/ChatMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class MessageEdited extends MessageEvent {
        public static final int $stable = 8;
        private final ChatMessage message;

        public static /* synthetic */ MessageEdited copy$default(MessageEdited messageEdited, ChatMessage chatMessage, int i, Object obj) {
            if ((i & 1) != 0) {
                chatMessage = messageEdited.message;
            }
            return messageEdited.copy(chatMessage);
        }

        /* renamed from: component1, reason: from getter */
        public final ChatMessage getMessage() {
            return this.message;
        }

        public final MessageEdited copy(ChatMessage message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new MessageEdited(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MessageEdited) && Intrinsics.areEqual(this.message, ((MessageEdited) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "MessageEdited(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageEdited(ChatMessage message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final ChatMessage getMessage() {
            return this.message;
        }
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/MessageEvent$MessageDeleted;", "Lcom/yhchat/canarys/data/websocket/MessageEvent;", "msgId", "", "<init>", "(Ljava/lang/String;)V", "getMsgId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class MessageDeleted extends MessageEvent {
        public static final int $stable = 0;
        private final String msgId;

        public static /* synthetic */ MessageDeleted copy$default(MessageDeleted messageDeleted, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = messageDeleted.msgId;
            }
            return messageDeleted.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMsgId() {
            return this.msgId;
        }

        public final MessageDeleted copy(String msgId) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            return new MessageDeleted(msgId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MessageDeleted) && Intrinsics.areEqual(this.msgId, ((MessageDeleted) other).msgId);
        }

        public int hashCode() {
            return this.msgId.hashCode();
        }

        public String toString() {
            return "MessageDeleted(msgId=" + this.msgId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MessageDeleted(String msgId) {
            super(null);
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            this.msgId = msgId;
        }

        public final String getMsgId() {
            return this.msgId;
        }
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/MessageEvent$DraftUpdated;", "Lcom/yhchat/canarys/data/websocket/MessageEvent;", ChatSearchActivity.EXTRA_CHAT_ID, "", "input", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getInput", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class DraftUpdated extends MessageEvent {
        public static final int $stable = 0;
        private final String chatId;
        private final String input;

        public static /* synthetic */ DraftUpdated copy$default(DraftUpdated draftUpdated, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = draftUpdated.chatId;
            }
            if ((i & 2) != 0) {
                str2 = draftUpdated.input;
            }
            return draftUpdated.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInput() {
            return this.input;
        }

        public final DraftUpdated copy(String chatId, String input) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(input, "input");
            return new DraftUpdated(chatId, input);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DraftUpdated)) {
                return false;
            }
            DraftUpdated draftUpdated = (DraftUpdated) other;
            return Intrinsics.areEqual(this.chatId, draftUpdated.chatId) && Intrinsics.areEqual(this.input, draftUpdated.input);
        }

        public int hashCode() {
            return (this.chatId.hashCode() * 31) + this.input.hashCode();
        }

        public String toString() {
            return "DraftUpdated(chatId=" + this.chatId + ", input=" + this.input + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DraftUpdated(String chatId, String input) {
            super(null);
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(input, "input");
            this.chatId = chatId;
            this.input = input;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getInput() {
            return this.input;
        }
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/MessageEvent$BotBoardMessage;", "Lcom/yhchat/canarys/data/websocket/MessageEvent;", "botId", "", ChatSearchActivity.EXTRA_CHAT_ID, "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBotId", "()Ljava/lang/String;", "getChatId", "getContent", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class BotBoardMessage extends MessageEvent {
        public static final int $stable = 0;
        private final String botId;
        private final String chatId;
        private final String content;

        public static /* synthetic */ BotBoardMessage copy$default(BotBoardMessage botBoardMessage, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = botBoardMessage.botId;
            }
            if ((i & 2) != 0) {
                str2 = botBoardMessage.chatId;
            }
            if ((i & 4) != 0) {
                str3 = botBoardMessage.content;
            }
            return botBoardMessage.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBotId() {
            return this.botId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public final BotBoardMessage copy(String botId, String chatId, String content) {
            Intrinsics.checkNotNullParameter(botId, "botId");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(content, "content");
            return new BotBoardMessage(botId, chatId, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BotBoardMessage)) {
                return false;
            }
            BotBoardMessage botBoardMessage = (BotBoardMessage) other;
            return Intrinsics.areEqual(this.botId, botBoardMessage.botId) && Intrinsics.areEqual(this.chatId, botBoardMessage.chatId) && Intrinsics.areEqual(this.content, botBoardMessage.content);
        }

        public int hashCode() {
            return (((this.botId.hashCode() * 31) + this.chatId.hashCode()) * 31) + this.content.hashCode();
        }

        public String toString() {
            return "BotBoardMessage(botId=" + this.botId + ", chatId=" + this.chatId + ", content=" + this.content + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BotBoardMessage(String botId, String chatId, String content) {
            super(null);
            Intrinsics.checkNotNullParameter(botId, "botId");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(content, "content");
            this.botId = botId;
            this.chatId = chatId;
            this.content = content;
        }

        public final String getBotId() {
            return this.botId;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getContent() {
            return this.content;
        }
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/MessageEvent$StreamMessage;", "Lcom/yhchat/canarys/data/websocket/MessageEvent;", "msgId", "", "recvId", ChatSearchActivity.EXTRA_CHAT_ID, "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsgId", "()Ljava/lang/String;", "getRecvId", "getChatId", "getContent", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class StreamMessage extends MessageEvent {
        public static final int $stable = 0;
        private final String chatId;
        private final String content;
        private final String msgId;
        private final String recvId;

        public static /* synthetic */ StreamMessage copy$default(StreamMessage streamMessage, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = streamMessage.msgId;
            }
            if ((i & 2) != 0) {
                str2 = streamMessage.recvId;
            }
            if ((i & 4) != 0) {
                str3 = streamMessage.chatId;
            }
            if ((i & 8) != 0) {
                str4 = streamMessage.content;
            }
            return streamMessage.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMsgId() {
            return this.msgId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRecvId() {
            return this.recvId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        public final StreamMessage copy(String msgId, String recvId, String chatId, String content) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            Intrinsics.checkNotNullParameter(recvId, "recvId");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(content, "content");
            return new StreamMessage(msgId, recvId, chatId, content);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StreamMessage)) {
                return false;
            }
            StreamMessage streamMessage = (StreamMessage) other;
            return Intrinsics.areEqual(this.msgId, streamMessage.msgId) && Intrinsics.areEqual(this.recvId, streamMessage.recvId) && Intrinsics.areEqual(this.chatId, streamMessage.chatId) && Intrinsics.areEqual(this.content, streamMessage.content);
        }

        public int hashCode() {
            return (((((this.msgId.hashCode() * 31) + this.recvId.hashCode()) * 31) + this.chatId.hashCode()) * 31) + this.content.hashCode();
        }

        public String toString() {
            return "StreamMessage(msgId=" + this.msgId + ", recvId=" + this.recvId + ", chatId=" + this.chatId + ", content=" + this.content + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StreamMessage(String msgId, String recvId, String chatId, String content) {
            super(null);
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            Intrinsics.checkNotNullParameter(recvId, "recvId");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(content, "content");
            this.msgId = msgId;
            this.recvId = recvId;
            this.chatId = chatId;
            this.content = content;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getContent() {
            return this.content;
        }

        public final String getMsgId() {
            return this.msgId;
        }

        public final String getRecvId() {
            return this.recvId;
        }
    }
}
