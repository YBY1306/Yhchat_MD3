package com.yhchat.canarys.data.websocket;

import com.yhchat.canarys.data.model.ChatMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketService.kt */
@Metadata(m168d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ConversationUpdate;", "", "<init>", "()V", "NewMessage", "MessageEdited", "Lcom/yhchat/canarys/data/websocket/ConversationUpdate$MessageEdited;", "Lcom/yhchat/canarys/data/websocket/ConversationUpdate$NewMessage;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public abstract class ConversationUpdate {
    public static final int $stable = 0;

    public /* synthetic */ ConversationUpdate(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ConversationUpdate$NewMessage;", "Lcom/yhchat/canarys/data/websocket/ConversationUpdate;", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "<init>", "(Lcom/yhchat/canarys/data/model/ChatMessage;)V", "getMessage", "()Lcom/yhchat/canarys/data/model/ChatMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class NewMessage extends ConversationUpdate {
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

    private ConversationUpdate() {
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ConversationUpdate$MessageEdited;", "Lcom/yhchat/canarys/data/websocket/ConversationUpdate;", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "<init>", "(Lcom/yhchat/canarys/data/model/ChatMessage;)V", "getMessage", "()Lcom/yhchat/canarys/data/model/ChatMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class MessageEdited extends ConversationUpdate {
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
}
