package com.yhchat.canarys.data.model;

import com.caverock.androidsvg.SVGParser;
import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010%\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003Jd\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u0006H\u00d6\u0001J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006."}, m169d2 = {"Lcom/yhchat/canarys/data/model/SendMessageRequest;", "", "msgId", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "content", "Lcom/yhchat/canarys/data/model/SendMessageContent;", "contentType", "commandId", "", "quoteMsgId", SVGParser.XML_STYLESHEET_ATTR_MEDIA, "Lcom/yhchat/canarys/data/model/MessageMedia;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILcom/yhchat/canarys/data/model/SendMessageContent;ILjava/lang/Long;Ljava/lang/String;Lcom/yhchat/canarys/data/model/MessageMedia;)V", "getMsgId", "()Ljava/lang/String;", "getChatId", "getChatType", "()I", "getContent", "()Lcom/yhchat/canarys/data/model/SendMessageContent;", "getContentType", "getCommandId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getQuoteMsgId", "getMedia", "()Lcom/yhchat/canarys/data/model/MessageMedia;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;ILcom/yhchat/canarys/data/model/SendMessageContent;ILjava/lang/Long;Ljava/lang/String;Lcom/yhchat/canarys/data/model/MessageMedia;)Lcom/yhchat/canarys/data/model/SendMessageRequest;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SendMessageRequest {
    public static final int $stable = 8;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName("command_id")
    private final Long commandId;

    @SerializedName("content")
    private final SendMessageContent content;

    @SerializedName("content_type")
    private final int contentType;

    @SerializedName(SVGParser.XML_STYLESHEET_ATTR_MEDIA)
    private final MessageMedia media;

    @SerializedName("msg_id")
    private final String msgId;

    @SerializedName("quote_msg_id")
    private final String quoteMsgId;

    public static /* synthetic */ SendMessageRequest copy$default(SendMessageRequest sendMessageRequest, String str, String str2, int i, SendMessageContent sendMessageContent, int i2, Long l, String str3, MessageMedia messageMedia, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sendMessageRequest.msgId;
        }
        if ((i3 & 2) != 0) {
            str2 = sendMessageRequest.chatId;
        }
        if ((i3 & 4) != 0) {
            i = sendMessageRequest.chatType;
        }
        if ((i3 & 8) != 0) {
            sendMessageContent = sendMessageRequest.content;
        }
        if ((i3 & 16) != 0) {
            i2 = sendMessageRequest.contentType;
        }
        if ((i3 & 32) != 0) {
            l = sendMessageRequest.commandId;
        }
        if ((i3 & 64) != 0) {
            str3 = sendMessageRequest.quoteMsgId;
        }
        if ((i3 & 128) != 0) {
            messageMedia = sendMessageRequest.media;
        }
        String str4 = str3;
        MessageMedia messageMedia2 = messageMedia;
        int i4 = i2;
        Long l2 = l;
        return sendMessageRequest.copy(str, str2, i, sendMessageContent, i4, l2, str4, messageMedia2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
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
    public final SendMessageContent getContent() {
        return this.content;
    }

    /* renamed from: component5, reason: from getter */
    public final int getContentType() {
        return this.contentType;
    }

    /* renamed from: component6, reason: from getter */
    public final Long getCommandId() {
        return this.commandId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getQuoteMsgId() {
        return this.quoteMsgId;
    }

    /* renamed from: component8, reason: from getter */
    public final MessageMedia getMedia() {
        return this.media;
    }

    public final SendMessageRequest copy(String msgId, String chatId, int chatType, SendMessageContent content, int contentType, Long commandId, String quoteMsgId, MessageMedia media) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(content, "content");
        return new SendMessageRequest(msgId, chatId, chatType, content, contentType, commandId, quoteMsgId, media);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMessageRequest)) {
            return false;
        }
        SendMessageRequest sendMessageRequest = (SendMessageRequest) other;
        return Intrinsics.areEqual(this.msgId, sendMessageRequest.msgId) && Intrinsics.areEqual(this.chatId, sendMessageRequest.chatId) && this.chatType == sendMessageRequest.chatType && Intrinsics.areEqual(this.content, sendMessageRequest.content) && this.contentType == sendMessageRequest.contentType && Intrinsics.areEqual(this.commandId, sendMessageRequest.commandId) && Intrinsics.areEqual(this.quoteMsgId, sendMessageRequest.quoteMsgId) && Intrinsics.areEqual(this.media, sendMessageRequest.media);
    }

    public int hashCode() {
        return (((((((((((((this.msgId.hashCode() * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.contentType)) * 31) + (this.commandId == null ? 0 : this.commandId.hashCode())) * 31) + (this.quoteMsgId == null ? 0 : this.quoteMsgId.hashCode())) * 31) + (this.media != null ? this.media.hashCode() : 0);
    }

    public String toString() {
        return "SendMessageRequest(msgId=" + this.msgId + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ", content=" + this.content + ", contentType=" + this.contentType + ", commandId=" + this.commandId + ", quoteMsgId=" + this.quoteMsgId + ", media=" + this.media + ")";
    }

    public SendMessageRequest(String msgId, String chatId, int chatType, SendMessageContent content, int contentType, Long commandId, String quoteMsgId, MessageMedia media) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.msgId = msgId;
        this.chatId = chatId;
        this.chatType = chatType;
        this.content = content;
        this.contentType = contentType;
        this.commandId = commandId;
        this.quoteMsgId = quoteMsgId;
        this.media = media;
    }

    public /* synthetic */ SendMessageRequest(String str, String str2, int i, SendMessageContent sendMessageContent, int i2, Long l, String str3, MessageMedia messageMedia, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, sendMessageContent, i2, (i3 & 32) != 0 ? null : l, (i3 & 64) != 0 ? null : str3, (i3 & 128) != 0 ? null : messageMedia);
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final SendMessageContent getContent() {
        return this.content;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final Long getCommandId() {
        return this.commandId;
    }

    public final String getQuoteMsgId() {
        return this.quoteMsgId;
    }

    public final MessageMedia getMedia() {
        return this.media;
    }
}
