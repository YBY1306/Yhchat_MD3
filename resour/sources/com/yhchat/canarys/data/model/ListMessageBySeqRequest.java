package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ListMessageBySeqRequest;", "", "msgSeq", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_ID, "", "<init>", "(JILjava/lang/String;)V", "getMsgSeq", "()J", "getChatType", "()I", "getChatId", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ListMessageBySeqRequest {
    public static final int $stable = 0;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName("msg_seq")
    private final long msgSeq;

    public static /* synthetic */ ListMessageBySeqRequest copy$default(ListMessageBySeqRequest listMessageBySeqRequest, long j, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = listMessageBySeqRequest.msgSeq;
        }
        if ((i2 & 2) != 0) {
            i = listMessageBySeqRequest.chatType;
        }
        if ((i2 & 4) != 0) {
            str = listMessageBySeqRequest.chatId;
        }
        return listMessageBySeqRequest.copy(j, i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMsgSeq() {
        return this.msgSeq;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    public final ListMessageBySeqRequest copy(long msgSeq, int chatType, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new ListMessageBySeqRequest(msgSeq, chatType, chatId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ListMessageBySeqRequest)) {
            return false;
        }
        ListMessageBySeqRequest listMessageBySeqRequest = (ListMessageBySeqRequest) other;
        return this.msgSeq == listMessageBySeqRequest.msgSeq && this.chatType == listMessageBySeqRequest.chatType && Intrinsics.areEqual(this.chatId, listMessageBySeqRequest.chatId);
    }

    public int hashCode() {
        return (((Long.hashCode(this.msgSeq) * 31) + Integer.hashCode(this.chatType)) * 31) + this.chatId.hashCode();
    }

    public String toString() {
        return "ListMessageBySeqRequest(msgSeq=" + this.msgSeq + ", chatType=" + this.chatType + ", chatId=" + this.chatId + ")";
    }

    public ListMessageBySeqRequest(long msgSeq, int chatType, String chatId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.msgSeq = msgSeq;
        this.chatType = chatType;
        this.chatId = chatId;
    }

    public final long getMsgSeq() {
        return this.msgSeq;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getChatId() {
        return this.chatId;
    }
}
