package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.data.model.MessageContent;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0006H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e\u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/data/api/EditMessageRequest;", "", "msgId", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "contentType", "content", "Lcom/yhchat/canarys/data/model/MessageContent;", "quoteMsgId", "<init>", "(Ljava/lang/String;Ljava/lang/String;IILcom/yhchat/canarys/data/model/MessageContent;Ljava/lang/String;)V", "getMsgId", "()Ljava/lang/String;", "getChatId", "getChatType", "()I", "getContentType", "getContent", "()Lcom/yhchat/canarys/data/model/MessageContent;", "getQuoteMsgId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EditMessageRequest {
    public static final int $stable = 0;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName("content")
    private final MessageContent content;

    @SerializedName("content_type")
    private final int contentType;

    @SerializedName("msg_id")
    private final String msgId;

    @SerializedName("quote_msg_id")
    private final String quoteMsgId;

    public static /* synthetic */ EditMessageRequest copy$default(EditMessageRequest editMessageRequest, String str, String str2, int i, int i2, MessageContent messageContent, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = editMessageRequest.msgId;
        }
        if ((i3 & 2) != 0) {
            str2 = editMessageRequest.chatId;
        }
        if ((i3 & 4) != 0) {
            i = editMessageRequest.chatType;
        }
        if ((i3 & 8) != 0) {
            i2 = editMessageRequest.contentType;
        }
        if ((i3 & 16) != 0) {
            messageContent = editMessageRequest.content;
        }
        if ((i3 & 32) != 0) {
            str3 = editMessageRequest.quoteMsgId;
        }
        MessageContent messageContent2 = messageContent;
        String str4 = str3;
        return editMessageRequest.copy(str, str2, i, i2, messageContent2, str4);
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
    public final int getContentType() {
        return this.contentType;
    }

    /* renamed from: component5, reason: from getter */
    public final MessageContent getContent() {
        return this.content;
    }

    /* renamed from: component6, reason: from getter */
    public final String getQuoteMsgId() {
        return this.quoteMsgId;
    }

    public final EditMessageRequest copy(String msgId, String chatId, int chatType, int contentType, MessageContent content, String quoteMsgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(content, "content");
        return new EditMessageRequest(msgId, chatId, chatType, contentType, content, quoteMsgId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditMessageRequest)) {
            return false;
        }
        EditMessageRequest editMessageRequest = (EditMessageRequest) other;
        return Intrinsics.areEqual(this.msgId, editMessageRequest.msgId) && Intrinsics.areEqual(this.chatId, editMessageRequest.chatId) && this.chatType == editMessageRequest.chatType && this.contentType == editMessageRequest.contentType && Intrinsics.areEqual(this.content, editMessageRequest.content) && Intrinsics.areEqual(this.quoteMsgId, editMessageRequest.quoteMsgId);
    }

    public int hashCode() {
        return (((((((((this.msgId.hashCode() * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + Integer.hashCode(this.contentType)) * 31) + this.content.hashCode()) * 31) + (this.quoteMsgId == null ? 0 : this.quoteMsgId.hashCode());
    }

    public String toString() {
        return "EditMessageRequest(msgId=" + this.msgId + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ", contentType=" + this.contentType + ", content=" + this.content + ", quoteMsgId=" + this.quoteMsgId + ")";
    }

    public EditMessageRequest(String msgId, String chatId, int chatType, int contentType, MessageContent content, String quoteMsgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.msgId = msgId;
        this.chatId = chatId;
        this.chatType = chatType;
        this.contentType = contentType;
        this.content = content;
        this.quoteMsgId = quoteMsgId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ EditMessageRequest(String str, String str2, int i, int i2, MessageContent messageContent, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        if ((i3 & 32) == 0) {
            str4 = str3;
        } else {
            str4 = null;
        }
        this(str, str2, i, i2, messageContent, str4);
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

    public final int getContentType() {
        return this.contentType;
    }

    public final MessageContent getContent() {
        return this.content;
    }

    public final String getQuoteMsgId() {
        return this.quoteMsgId;
    }
}
