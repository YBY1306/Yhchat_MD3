package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0016\u0010\u0017J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\bH\u00c6\u0003J\t\u00104\u001a\u00020\nH\u00c6\u0003J\t\u00105\u001a\u00020\fH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u0010:\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010-J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00aa\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\bH\u00d6\u0001J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010'\u001a\u0004\b)\u0010&R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010'\u001a\u0004\b*\u0010&R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010.\u001a\u0004\b,\u0010-R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u0019\u00a8\u0006E"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ChatMessage;", "", "msgId", "", "sender", "Lcom/yhchat/canarys/data/model/MessageSender;", "direction", "contentType", "", "content", "Lcom/yhchat/canarys/data/model/MessageContent;", "sendTime", "", "cmd", "Lcom/yhchat/canarys/data/model/MessageCmd;", "msgDeleteTime", "quoteMsgId", "msgSeq", "editTime", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "recvId", "<init>", "(Ljava/lang/String;Lcom/yhchat/canarys/data/model/MessageSender;Ljava/lang/String;ILcom/yhchat/canarys/data/model/MessageContent;JLcom/yhchat/canarys/data/model/MessageCmd;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getMsgId", "()Ljava/lang/String;", "getSender", "()Lcom/yhchat/canarys/data/model/MessageSender;", "getDirection", "getContentType", "()I", "getContent", "()Lcom/yhchat/canarys/data/model/MessageContent;", "getSendTime", "()J", "getCmd", "()Lcom/yhchat/canarys/data/model/MessageCmd;", "getMsgDeleteTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getQuoteMsgId", "getMsgSeq", "getEditTime", "getChatId", "getChatType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecvId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Lcom/yhchat/canarys/data/model/MessageSender;Ljava/lang/String;ILcom/yhchat/canarys/data/model/MessageContent;JLcom/yhchat/canarys/data/model/MessageCmd;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/yhchat/canarys/data/model/ChatMessage;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ChatMessage {
    public static final int $stable = 8;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final Integer chatType;

    @SerializedName("cmd")
    private final MessageCmd cmd;

    @SerializedName("content")
    private final MessageContent content;

    @SerializedName("content_type")
    private final int contentType;

    @SerializedName("direction")
    private final String direction;

    @SerializedName("edit_time")
    private final Long editTime;

    @SerializedName("msg_delete_time")
    private final Long msgDeleteTime;

    @SerializedName("msg_id")
    private final String msgId;

    @SerializedName("msg_seq")
    private final Long msgSeq;

    @SerializedName("quote_msg_id")
    private final String quoteMsgId;

    @SerializedName("recv_id")
    private final String recvId;

    @SerializedName("send_time")
    private final long sendTime;

    @SerializedName("sender")
    private final MessageSender sender;

    /* renamed from: component1, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getMsgSeq() {
        return this.msgSeq;
    }

    /* renamed from: component11, reason: from getter */
    public final Long getEditTime() {
        return this.editTime;
    }

    /* renamed from: component12, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getChatType() {
        return this.chatType;
    }

    /* renamed from: component14, reason: from getter */
    public final String getRecvId() {
        return this.recvId;
    }

    /* renamed from: component2, reason: from getter */
    public final MessageSender getSender() {
        return this.sender;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    /* renamed from: component4, reason: from getter */
    public final int getContentType() {
        return this.contentType;
    }

    /* renamed from: component5, reason: from getter */
    public final MessageContent getContent() {
        return this.content;
    }

    /* renamed from: component6, reason: from getter */
    public final long getSendTime() {
        return this.sendTime;
    }

    /* renamed from: component7, reason: from getter */
    public final MessageCmd getCmd() {
        return this.cmd;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getMsgDeleteTime() {
        return this.msgDeleteTime;
    }

    /* renamed from: component9, reason: from getter */
    public final String getQuoteMsgId() {
        return this.quoteMsgId;
    }

    public final ChatMessage copy(String msgId, MessageSender sender, String direction, int contentType, MessageContent content, long sendTime, MessageCmd cmd, Long msgDeleteTime, String quoteMsgId, Long msgSeq, Long editTime, String str, Integer num, String recvId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(content, "content");
        return new ChatMessage(msgId, sender, direction, contentType, content, sendTime, cmd, msgDeleteTime, quoteMsgId, msgSeq, editTime, str, num, recvId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) other;
        return Intrinsics.areEqual(this.msgId, chatMessage.msgId) && Intrinsics.areEqual(this.sender, chatMessage.sender) && Intrinsics.areEqual(this.direction, chatMessage.direction) && this.contentType == chatMessage.contentType && Intrinsics.areEqual(this.content, chatMessage.content) && this.sendTime == chatMessage.sendTime && Intrinsics.areEqual(this.cmd, chatMessage.cmd) && Intrinsics.areEqual(this.msgDeleteTime, chatMessage.msgDeleteTime) && Intrinsics.areEqual(this.quoteMsgId, chatMessage.quoteMsgId) && Intrinsics.areEqual(this.msgSeq, chatMessage.msgSeq) && Intrinsics.areEqual(this.editTime, chatMessage.editTime) && Intrinsics.areEqual(this.chatId, chatMessage.chatId) && Intrinsics.areEqual(this.chatType, chatMessage.chatType) && Intrinsics.areEqual(this.recvId, chatMessage.recvId);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((this.msgId.hashCode() * 31) + this.sender.hashCode()) * 31) + this.direction.hashCode()) * 31) + Integer.hashCode(this.contentType)) * 31) + this.content.hashCode()) * 31) + Long.hashCode(this.sendTime)) * 31) + (this.cmd == null ? 0 : this.cmd.hashCode())) * 31) + (this.msgDeleteTime == null ? 0 : this.msgDeleteTime.hashCode())) * 31) + (this.quoteMsgId == null ? 0 : this.quoteMsgId.hashCode())) * 31) + (this.msgSeq == null ? 0 : this.msgSeq.hashCode())) * 31) + (this.editTime == null ? 0 : this.editTime.hashCode())) * 31) + (this.chatId == null ? 0 : this.chatId.hashCode())) * 31) + (this.chatType == null ? 0 : this.chatType.hashCode())) * 31) + (this.recvId != null ? this.recvId.hashCode() : 0);
    }

    public String toString() {
        return "ChatMessage(msgId=" + this.msgId + ", sender=" + this.sender + ", direction=" + this.direction + ", contentType=" + this.contentType + ", content=" + this.content + ", sendTime=" + this.sendTime + ", cmd=" + this.cmd + ", msgDeleteTime=" + this.msgDeleteTime + ", quoteMsgId=" + this.quoteMsgId + ", msgSeq=" + this.msgSeq + ", editTime=" + this.editTime + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ", recvId=" + this.recvId + ")";
    }

    public ChatMessage(String msgId, MessageSender sender, String direction, int contentType, MessageContent content, long sendTime, MessageCmd cmd, Long msgDeleteTime, String quoteMsgId, Long msgSeq, Long editTime, String chatId, Integer chatType, String recvId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(sender, "sender");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(content, "content");
        this.msgId = msgId;
        this.sender = sender;
        this.direction = direction;
        this.contentType = contentType;
        this.content = content;
        this.sendTime = sendTime;
        this.cmd = cmd;
        this.msgDeleteTime = msgDeleteTime;
        this.quoteMsgId = quoteMsgId;
        this.msgSeq = msgSeq;
        this.editTime = editTime;
        this.chatId = chatId;
        this.chatType = chatType;
        this.recvId = recvId;
    }

    public /* synthetic */ ChatMessage(String str, MessageSender messageSender, String str2, int i, MessageContent messageContent, long j, MessageCmd messageCmd, Long l, String str3, Long l2, Long l3, String str4, Integer num, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, messageSender, str2, i, messageContent, j, (i2 & 64) != 0 ? null : messageCmd, (i2 & 128) != 0 ? null : l, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? null : l2, (i2 & 1024) != 0 ? null : l3, (i2 & 2048) != 0 ? null : str4, (i2 & 4096) != 0 ? null : num, (i2 & 8192) != 0 ? null : str5);
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final MessageSender getSender() {
        return this.sender;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final MessageContent getContent() {
        return this.content;
    }

    public final long getSendTime() {
        return this.sendTime;
    }

    public final MessageCmd getCmd() {
        return this.cmd;
    }

    public final Long getMsgDeleteTime() {
        return this.msgDeleteTime;
    }

    public final String getQuoteMsgId() {
        return this.quoteMsgId;
    }

    public final Long getMsgSeq() {
        return this.msgSeq;
    }

    public final Long getEditTime() {
        return this.editTime;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final Integer getChatType() {
        return this.chatType;
    }

    public final String getRecvId() {
        return this.recvId;
    }
}
