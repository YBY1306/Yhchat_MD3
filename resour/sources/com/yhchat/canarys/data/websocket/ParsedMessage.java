package com.yhchat.canarys.data.websocket;

import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketMessageParser.kt */
@Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u00a8\u0006\u0014"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ParsedMessage;", "", "<init>", "()V", "HeartbeatAck", "NewMessage", "EditedMessage", "DraftInput", "FileSendMessage", "BotBoardMessage", "StreamMessage", "Unknown", "Lcom/yhchat/canarys/data/websocket/ParsedMessage$BotBoardMessage;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage$DraftInput;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage$EditedMessage;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage$FileSendMessage;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage$HeartbeatAck;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage$NewMessage;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage$StreamMessage;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage$Unknown;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public abstract class ParsedMessage {
    public static final int $stable = 0;

    public /* synthetic */ ParsedMessage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: WebSocketMessageParser.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ParsedMessage$HeartbeatAck;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage;", "seq", "", "<init>", "(Ljava/lang/String;)V", "getSeq", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class HeartbeatAck extends ParsedMessage {
        public static final int $stable = 0;
        private final String seq;

        public static /* synthetic */ HeartbeatAck copy$default(HeartbeatAck heartbeatAck, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = heartbeatAck.seq;
            }
            return heartbeatAck.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSeq() {
            return this.seq;
        }

        public final HeartbeatAck copy(String seq) {
            Intrinsics.checkNotNullParameter(seq, "seq");
            return new HeartbeatAck(seq);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof HeartbeatAck) && Intrinsics.areEqual(this.seq, ((HeartbeatAck) other).seq);
        }

        public int hashCode() {
            return this.seq.hashCode();
        }

        public String toString() {
            return "HeartbeatAck(seq=" + this.seq + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeartbeatAck(String seq) {
            super(null);
            Intrinsics.checkNotNullParameter(seq, "seq");
            this.seq = seq;
        }

        public final String getSeq() {
            return this.seq;
        }
    }

    private ParsedMessage() {
    }

    /* compiled from: WebSocketMessageParser.kt */
    @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ParsedMessage$NewMessage;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage;", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "seq", "", "<init>", "(Lcom/yhchat/canarys/data/model/ChatMessage;Ljava/lang/String;)V", "getMessage", "()Lcom/yhchat/canarys/data/model/ChatMessage;", "getSeq", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class NewMessage extends ParsedMessage {
        public static final int $stable = 8;
        private final ChatMessage message;
        private final String seq;

        public static /* synthetic */ NewMessage copy$default(NewMessage newMessage, ChatMessage chatMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                chatMessage = newMessage.message;
            }
            if ((i & 2) != 0) {
                str = newMessage.seq;
            }
            return newMessage.copy(chatMessage, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ChatMessage getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSeq() {
            return this.seq;
        }

        public final NewMessage copy(ChatMessage message, String seq) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(seq, "seq");
            return new NewMessage(message, seq);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NewMessage)) {
                return false;
            }
            NewMessage newMessage = (NewMessage) other;
            return Intrinsics.areEqual(this.message, newMessage.message) && Intrinsics.areEqual(this.seq, newMessage.seq);
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.seq.hashCode();
        }

        public String toString() {
            return "NewMessage(message=" + this.message + ", seq=" + this.seq + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NewMessage(ChatMessage message, String seq) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(seq, "seq");
            this.message = message;
            this.seq = seq;
        }

        public final ChatMessage getMessage() {
            return this.message;
        }

        public final String getSeq() {
            return this.seq;
        }
    }

    /* compiled from: WebSocketMessageParser.kt */
    @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ParsedMessage$EditedMessage;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage;", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "seq", "", "<init>", "(Lcom/yhchat/canarys/data/model/ChatMessage;Ljava/lang/String;)V", "getMessage", "()Lcom/yhchat/canarys/data/model/ChatMessage;", "getSeq", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class EditedMessage extends ParsedMessage {
        public static final int $stable = 8;
        private final ChatMessage message;
        private final String seq;

        public static /* synthetic */ EditedMessage copy$default(EditedMessage editedMessage, ChatMessage chatMessage, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                chatMessage = editedMessage.message;
            }
            if ((i & 2) != 0) {
                str = editedMessage.seq;
            }
            return editedMessage.copy(chatMessage, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ChatMessage getMessage() {
            return this.message;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSeq() {
            return this.seq;
        }

        public final EditedMessage copy(ChatMessage message, String seq) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(seq, "seq");
            return new EditedMessage(message, seq);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditedMessage)) {
                return false;
            }
            EditedMessage editedMessage = (EditedMessage) other;
            return Intrinsics.areEqual(this.message, editedMessage.message) && Intrinsics.areEqual(this.seq, editedMessage.seq);
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.seq.hashCode();
        }

        public String toString() {
            return "EditedMessage(message=" + this.message + ", seq=" + this.seq + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditedMessage(ChatMessage message, String seq) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(seq, "seq");
            this.message = message;
            this.seq = seq;
        }

        public final ChatMessage getMessage() {
            return this.message;
        }

        public final String getSeq() {
            return this.seq;
        }
    }

    /* compiled from: WebSocketMessageParser.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ParsedMessage$DraftInput;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage;", ChatSearchActivity.EXTRA_CHAT_ID, "", "input", "seq", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getInput", "getSeq", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class DraftInput extends ParsedMessage {
        public static final int $stable = 0;
        private final String chatId;
        private final String input;
        private final String seq;

        public static /* synthetic */ DraftInput copy$default(DraftInput draftInput, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = draftInput.chatId;
            }
            if ((i & 2) != 0) {
                str2 = draftInput.input;
            }
            if ((i & 4) != 0) {
                str3 = draftInput.seq;
            }
            return draftInput.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getInput() {
            return this.input;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSeq() {
            return this.seq;
        }

        public final DraftInput copy(String chatId, String input, String seq) {
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(seq, "seq");
            return new DraftInput(chatId, input, seq);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DraftInput)) {
                return false;
            }
            DraftInput draftInput = (DraftInput) other;
            return Intrinsics.areEqual(this.chatId, draftInput.chatId) && Intrinsics.areEqual(this.input, draftInput.input) && Intrinsics.areEqual(this.seq, draftInput.seq);
        }

        public int hashCode() {
            return (((this.chatId.hashCode() * 31) + this.input.hashCode()) * 31) + this.seq.hashCode();
        }

        public String toString() {
            return "DraftInput(chatId=" + this.chatId + ", input=" + this.input + ", seq=" + this.seq + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DraftInput(String chatId, String input, String seq) {
            super(null);
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(input, "input");
            Intrinsics.checkNotNullParameter(seq, "seq");
            this.chatId = chatId;
            this.input = input;
            this.seq = seq;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getInput() {
            return this.input;
        }

        public final String getSeq() {
            return this.seq;
        }
    }

    /* compiled from: WebSocketMessageParser.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ParsedMessage$FileSendMessage;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage;", "sendUserId", "", "userId", "sendType", "data", "sendDeviceId", "seq", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSendUserId", "()Ljava/lang/String;", "getUserId", "getSendType", "getData", "getSendDeviceId", "getSeq", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class FileSendMessage extends ParsedMessage {
        public static final int $stable = 0;
        private final String data;
        private final String sendDeviceId;
        private final String sendType;
        private final String sendUserId;
        private final String seq;
        private final String userId;

        public static /* synthetic */ FileSendMessage copy$default(FileSendMessage fileSendMessage, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fileSendMessage.sendUserId;
            }
            if ((i & 2) != 0) {
                str2 = fileSendMessage.userId;
            }
            if ((i & 4) != 0) {
                str3 = fileSendMessage.sendType;
            }
            if ((i & 8) != 0) {
                str4 = fileSendMessage.data;
            }
            if ((i & 16) != 0) {
                str5 = fileSendMessage.sendDeviceId;
            }
            if ((i & 32) != 0) {
                str6 = fileSendMessage.seq;
            }
            String str7 = str5;
            String str8 = str6;
            return fileSendMessage.copy(str, str2, str3, str4, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSendUserId() {
            return this.sendUserId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSendType() {
            return this.sendType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getData() {
            return this.data;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSendDeviceId() {
            return this.sendDeviceId;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSeq() {
            return this.seq;
        }

        public final FileSendMessage copy(String sendUserId, String userId, String sendType, String data, String sendDeviceId, String seq) {
            Intrinsics.checkNotNullParameter(sendUserId, "sendUserId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(sendType, "sendType");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(sendDeviceId, "sendDeviceId");
            Intrinsics.checkNotNullParameter(seq, "seq");
            return new FileSendMessage(sendUserId, userId, sendType, data, sendDeviceId, seq);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileSendMessage)) {
                return false;
            }
            FileSendMessage fileSendMessage = (FileSendMessage) other;
            return Intrinsics.areEqual(this.sendUserId, fileSendMessage.sendUserId) && Intrinsics.areEqual(this.userId, fileSendMessage.userId) && Intrinsics.areEqual(this.sendType, fileSendMessage.sendType) && Intrinsics.areEqual(this.data, fileSendMessage.data) && Intrinsics.areEqual(this.sendDeviceId, fileSendMessage.sendDeviceId) && Intrinsics.areEqual(this.seq, fileSendMessage.seq);
        }

        public int hashCode() {
            return (((((((((this.sendUserId.hashCode() * 31) + this.userId.hashCode()) * 31) + this.sendType.hashCode()) * 31) + this.data.hashCode()) * 31) + this.sendDeviceId.hashCode()) * 31) + this.seq.hashCode();
        }

        public String toString() {
            return "FileSendMessage(sendUserId=" + this.sendUserId + ", userId=" + this.userId + ", sendType=" + this.sendType + ", data=" + this.data + ", sendDeviceId=" + this.sendDeviceId + ", seq=" + this.seq + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileSendMessage(String sendUserId, String userId, String sendType, String data, String sendDeviceId, String seq) {
            super(null);
            Intrinsics.checkNotNullParameter(sendUserId, "sendUserId");
            Intrinsics.checkNotNullParameter(userId, "userId");
            Intrinsics.checkNotNullParameter(sendType, "sendType");
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(sendDeviceId, "sendDeviceId");
            Intrinsics.checkNotNullParameter(seq, "seq");
            this.sendUserId = sendUserId;
            this.userId = userId;
            this.sendType = sendType;
            this.data = data;
            this.sendDeviceId = sendDeviceId;
            this.seq = seq;
        }

        public final String getSendUserId() {
            return this.sendUserId;
        }

        public final String getUserId() {
            return this.userId;
        }

        public final String getSendType() {
            return this.sendType;
        }

        public final String getData() {
            return this.data;
        }

        public final String getSendDeviceId() {
            return this.sendDeviceId;
        }

        public final String getSeq() {
            return this.seq;
        }
    }

    /* compiled from: WebSocketMessageParser.kt */
    @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u00d6\u0003J\t\u0010'\u001a\u00020\u0006H\u00d6\u0001J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010\u00a8\u0006)"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ParsedMessage$BotBoardMessage;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage;", "botId", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "content", "contentType", "lastUpdateTime", "", "botName", "seq", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;)V", "getBotId", "()Ljava/lang/String;", "getChatId", "getChatType", "()I", "getContent", "getContentType", "getLastUpdateTime", "()J", "getBotName", "getSeq", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class BotBoardMessage extends ParsedMessage {
        public static final int $stable = 0;
        private final String botId;
        private final String botName;
        private final String chatId;
        private final int chatType;
        private final String content;
        private final int contentType;
        private final long lastUpdateTime;
        private final String seq;

        public static /* synthetic */ BotBoardMessage copy$default(BotBoardMessage botBoardMessage, String str, String str2, int i, String str3, int i2, long j, String str4, String str5, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = botBoardMessage.botId;
            }
            if ((i3 & 2) != 0) {
                str2 = botBoardMessage.chatId;
            }
            if ((i3 & 4) != 0) {
                i = botBoardMessage.chatType;
            }
            if ((i3 & 8) != 0) {
                str3 = botBoardMessage.content;
            }
            if ((i3 & 16) != 0) {
                i2 = botBoardMessage.contentType;
            }
            if ((i3 & 32) != 0) {
                j = botBoardMessage.lastUpdateTime;
            }
            if ((i3 & 64) != 0) {
                str4 = botBoardMessage.botName;
            }
            if ((i3 & 128) != 0) {
                str5 = botBoardMessage.seq;
            }
            long j2 = j;
            String str6 = str3;
            int i4 = i2;
            int i5 = i;
            return botBoardMessage.copy(str, str2, i5, str6, i4, j2, str4, str5);
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
        public final int getChatType() {
            return this.chatType;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* renamed from: component5, reason: from getter */
        public final int getContentType() {
            return this.contentType;
        }

        /* renamed from: component6, reason: from getter */
        public final long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        /* renamed from: component7, reason: from getter */
        public final String getBotName() {
            return this.botName;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSeq() {
            return this.seq;
        }

        public final BotBoardMessage copy(String botId, String chatId, int chatType, String content, int contentType, long lastUpdateTime, String botName, String seq) {
            Intrinsics.checkNotNullParameter(botId, "botId");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(botName, "botName");
            Intrinsics.checkNotNullParameter(seq, "seq");
            return new BotBoardMessage(botId, chatId, chatType, content, contentType, lastUpdateTime, botName, seq);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BotBoardMessage)) {
                return false;
            }
            BotBoardMessage botBoardMessage = (BotBoardMessage) other;
            return Intrinsics.areEqual(this.botId, botBoardMessage.botId) && Intrinsics.areEqual(this.chatId, botBoardMessage.chatId) && this.chatType == botBoardMessage.chatType && Intrinsics.areEqual(this.content, botBoardMessage.content) && this.contentType == botBoardMessage.contentType && this.lastUpdateTime == botBoardMessage.lastUpdateTime && Intrinsics.areEqual(this.botName, botBoardMessage.botName) && Intrinsics.areEqual(this.seq, botBoardMessage.seq);
        }

        public int hashCode() {
            return (((((((((((((this.botId.hashCode() * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.contentType)) * 31) + Long.hashCode(this.lastUpdateTime)) * 31) + this.botName.hashCode()) * 31) + this.seq.hashCode();
        }

        public String toString() {
            return "BotBoardMessage(botId=" + this.botId + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ", content=" + this.content + ", contentType=" + this.contentType + ", lastUpdateTime=" + this.lastUpdateTime + ", botName=" + this.botName + ", seq=" + this.seq + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BotBoardMessage(String botId, String chatId, int chatType, String content, int contentType, long lastUpdateTime, String botName, String seq) {
            super(null);
            Intrinsics.checkNotNullParameter(botId, "botId");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(botName, "botName");
            Intrinsics.checkNotNullParameter(seq, "seq");
            this.botId = botId;
            this.chatId = chatId;
            this.chatType = chatType;
            this.content = content;
            this.contentType = contentType;
            this.lastUpdateTime = lastUpdateTime;
            this.botName = botName;
            this.seq = seq;
        }

        public final String getBotId() {
            return this.botId;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final int getChatType() {
            return this.chatType;
        }

        public final String getContent() {
            return this.content;
        }

        public final int getContentType() {
            return this.contentType;
        }

        public final long getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public final String getBotName() {
            return this.botName;
        }

        public final String getSeq() {
            return this.seq;
        }
    }

    /* compiled from: WebSocketMessageParser.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ParsedMessage$StreamMessage;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage;", "msgId", "", "recvId", ChatSearchActivity.EXTRA_CHAT_ID, "content", "seq", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMsgId", "()Ljava/lang/String;", "getRecvId", "getChatId", "getContent", "getSeq", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class StreamMessage extends ParsedMessage {
        public static final int $stable = 0;
        private final String chatId;
        private final String content;
        private final String msgId;
        private final String recvId;
        private final String seq;

        public static /* synthetic */ StreamMessage copy$default(StreamMessage streamMessage, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
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
            if ((i & 16) != 0) {
                str5 = streamMessage.seq;
            }
            String str6 = str5;
            String str7 = str3;
            return streamMessage.copy(str, str2, str7, str4, str6);
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

        /* renamed from: component5, reason: from getter */
        public final String getSeq() {
            return this.seq;
        }

        public final StreamMessage copy(String msgId, String recvId, String chatId, String content, String seq) {
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            Intrinsics.checkNotNullParameter(recvId, "recvId");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(seq, "seq");
            return new StreamMessage(msgId, recvId, chatId, content, seq);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StreamMessage)) {
                return false;
            }
            StreamMessage streamMessage = (StreamMessage) other;
            return Intrinsics.areEqual(this.msgId, streamMessage.msgId) && Intrinsics.areEqual(this.recvId, streamMessage.recvId) && Intrinsics.areEqual(this.chatId, streamMessage.chatId) && Intrinsics.areEqual(this.content, streamMessage.content) && Intrinsics.areEqual(this.seq, streamMessage.seq);
        }

        public int hashCode() {
            return (((((((this.msgId.hashCode() * 31) + this.recvId.hashCode()) * 31) + this.chatId.hashCode()) * 31) + this.content.hashCode()) * 31) + this.seq.hashCode();
        }

        public String toString() {
            return "StreamMessage(msgId=" + this.msgId + ", recvId=" + this.recvId + ", chatId=" + this.chatId + ", content=" + this.content + ", seq=" + this.seq + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StreamMessage(String msgId, String recvId, String chatId, String content, String seq) {
            super(null);
            Intrinsics.checkNotNullParameter(msgId, "msgId");
            Intrinsics.checkNotNullParameter(recvId, "recvId");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(seq, "seq");
            this.msgId = msgId;
            this.recvId = recvId;
            this.chatId = chatId;
            this.content = content;
            this.seq = seq;
        }

        public final String getMsgId() {
            return this.msgId;
        }

        public final String getRecvId() {
            return this.recvId;
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getContent() {
            return this.content;
        }

        public final String getSeq() {
            return this.seq;
        }
    }

    /* compiled from: WebSocketMessageParser.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ParsedMessage$Unknown;", "Lcom/yhchat/canarys/data/websocket/ParsedMessage;", "cmd", "", "seq", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCmd", "()Ljava/lang/String;", "getSeq", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class Unknown extends ParsedMessage {
        public static final int $stable = 0;
        private final String cmd;
        private final String seq;

        public static /* synthetic */ Unknown copy$default(Unknown unknown, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknown.cmd;
            }
            if ((i & 2) != 0) {
                str2 = unknown.seq;
            }
            return unknown.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCmd() {
            return this.cmd;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSeq() {
            return this.seq;
        }

        public final Unknown copy(String cmd, String seq) {
            Intrinsics.checkNotNullParameter(cmd, "cmd");
            Intrinsics.checkNotNullParameter(seq, "seq");
            return new Unknown(cmd, seq);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Unknown)) {
                return false;
            }
            Unknown unknown = (Unknown) other;
            return Intrinsics.areEqual(this.cmd, unknown.cmd) && Intrinsics.areEqual(this.seq, unknown.seq);
        }

        public int hashCode() {
            return (this.cmd.hashCode() * 31) + this.seq.hashCode();
        }

        public String toString() {
            return "Unknown(cmd=" + this.cmd + ", seq=" + this.seq + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unknown(String cmd, String seq) {
            super(null);
            Intrinsics.checkNotNullParameter(cmd, "cmd");
            Intrinsics.checkNotNullParameter(seq, "seq");
            this.cmd = cmd;
            this.seq = seq;
        }

        public final String getCmd() {
            return this.cmd;
        }

        public final String getSeq() {
            return this.seq;
        }
    }
}
