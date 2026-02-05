package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/data/api/ListMessageRequest;", "", "msgCount", "", "msgId", "", ChatSearchActivity.EXTRA_CHAT_TYPE, ChatSearchActivity.EXTRA_CHAT_ID, "<init>", "(ILjava/lang/String;ILjava/lang/String;)V", "getMsgCount", "()I", "getMsgId", "()Ljava/lang/String;", "getChatType", "getChatId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ListMessageRequest {
    public static final int $stable = 0;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName("msg_count")
    private final int msgCount;

    @SerializedName("msg_id")
    private final String msgId;

    public static /* synthetic */ ListMessageRequest copy$default(ListMessageRequest listMessageRequest, int i, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = listMessageRequest.msgCount;
        }
        if ((i3 & 2) != 0) {
            str = listMessageRequest.msgId;
        }
        if ((i3 & 4) != 0) {
            i2 = listMessageRequest.chatType;
        }
        if ((i3 & 8) != 0) {
            str2 = listMessageRequest.chatId;
        }
        return listMessageRequest.copy(i, str, i2, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMsgCount() {
        return this.msgCount;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    public final ListMessageRequest copy(int msgCount, String msgId, int chatType, String chatId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new ListMessageRequest(msgCount, msgId, chatType, chatId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListMessageRequest)) {
            return false;
        }
        ListMessageRequest listMessageRequest = (ListMessageRequest) other;
        return this.msgCount == listMessageRequest.msgCount && Intrinsics.areEqual(this.msgId, listMessageRequest.msgId) && this.chatType == listMessageRequest.chatType && Intrinsics.areEqual(this.chatId, listMessageRequest.chatId);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.msgCount) * 31) + this.msgId.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + this.chatId.hashCode();
    }

    public String toString() {
        return "ListMessageRequest(msgCount=" + this.msgCount + ", msgId=" + this.msgId + ", chatType=" + this.chatType + ", chatId=" + this.chatId + ")";
    }

    public ListMessageRequest(int msgCount, String msgId, int chatType, String chatId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.msgCount = msgCount;
        this.msgId = msgId;
        this.chatType = chatType;
        this.chatId = chatId;
    }

    public /* synthetic */ ListMessageRequest(int i, String str, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? "" : str, i2, str2);
    }

    public final int getMsgCount() {
        return this.msgCount;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getChatId() {
        return this.chatId;
    }
}
