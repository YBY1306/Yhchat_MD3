package com.yhchat.canarys.data.api;

import androidx.core.os.EnvironmentCompat;
import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003JL\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013\u00a8\u0006$"}, m169d2 = {"Lcom/yhchat/canarys/data/api/ListMessageByMidSeqRequest;", "", "requestId", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_ID, "", EnvironmentCompat.MEDIA_UNKNOWN, "msgCount", "msgId", "<init>", "(Ljava/lang/Long;ILjava/lang/String;IILjava/lang/String;)V", "getRequestId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getChatType", "()I", "getChatId", "()Ljava/lang/String;", "getUnknown", "getMsgCount", "getMsgId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Long;ILjava/lang/String;IILjava/lang/String;)Lcom/yhchat/canarys/data/api/ListMessageByMidSeqRequest;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class ListMessageByMidSeqRequest {
    public static final int $stable = 0;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName("msg_count")
    private final int msgCount;

    @SerializedName("msg_id")
    private final String msgId;

    @SerializedName("request_id")
    private final Long requestId;

    @SerializedName(EnvironmentCompat.MEDIA_UNKNOWN)
    private final int unknown;

    public static /* synthetic */ ListMessageByMidSeqRequest copy$default(ListMessageByMidSeqRequest listMessageByMidSeqRequest, Long l, int i, String str, int i2, int i3, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l = listMessageByMidSeqRequest.requestId;
        }
        if ((i4 & 2) != 0) {
            i = listMessageByMidSeqRequest.chatType;
        }
        if ((i4 & 4) != 0) {
            str = listMessageByMidSeqRequest.chatId;
        }
        if ((i4 & 8) != 0) {
            i2 = listMessageByMidSeqRequest.unknown;
        }
        if ((i4 & 16) != 0) {
            i3 = listMessageByMidSeqRequest.msgCount;
        }
        if ((i4 & 32) != 0) {
            str2 = listMessageByMidSeqRequest.msgId;
        }
        int i5 = i3;
        String str3 = str2;
        return listMessageByMidSeqRequest.copy(l, i, str, i2, i5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getRequestId() {
        return this.requestId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getUnknown() {
        return this.unknown;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMsgCount() {
        return this.msgCount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
    }

    public final ListMessageByMidSeqRequest copy(Long requestId, int chatType, String chatId, int unknown, int msgCount, String msgId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        return new ListMessageByMidSeqRequest(requestId, chatType, chatId, unknown, msgCount, msgId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListMessageByMidSeqRequest)) {
            return false;
        }
        ListMessageByMidSeqRequest listMessageByMidSeqRequest = (ListMessageByMidSeqRequest) other;
        return Intrinsics.areEqual(this.requestId, listMessageByMidSeqRequest.requestId) && this.chatType == listMessageByMidSeqRequest.chatType && Intrinsics.areEqual(this.chatId, listMessageByMidSeqRequest.chatId) && this.unknown == listMessageByMidSeqRequest.unknown && this.msgCount == listMessageByMidSeqRequest.msgCount && Intrinsics.areEqual(this.msgId, listMessageByMidSeqRequest.msgId);
    }

    public int hashCode() {
        return ((((((((((this.requestId == null ? 0 : this.requestId.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.unknown)) * 31) + Integer.hashCode(this.msgCount)) * 31) + this.msgId.hashCode();
    }

    public String toString() {
        return "ListMessageByMidSeqRequest(requestId=" + this.requestId + ", chatType=" + this.chatType + ", chatId=" + this.chatId + ", unknown=" + this.unknown + ", msgCount=" + this.msgCount + ", msgId=" + this.msgId + ")";
    }

    public ListMessageByMidSeqRequest(Long requestId, int chatType, String chatId, int unknown, int msgCount, String msgId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        this.requestId = requestId;
        this.chatType = chatType;
        this.chatId = chatId;
        this.unknown = unknown;
        this.msgCount = msgCount;
        this.msgId = msgId;
    }

    public /* synthetic */ ListMessageByMidSeqRequest(Long l, int i, String str, int i2, int i3, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : l, i, str, (i4 & 8) != 0 ? 0 : i2, i3, str2);
    }

    public final Long getRequestId() {
        return this.requestId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getUnknown() {
        return this.unknown;
    }

    public final int getMsgCount() {
        return this.msgCount;
    }

    public final String getMsgId() {
        return this.msgId;
    }
}
