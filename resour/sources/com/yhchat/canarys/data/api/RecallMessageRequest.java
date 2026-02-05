package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/data/api/RecallMessageRequest;", "", "msgId", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getMsgId", "()Ljava/lang/String;", "getChatId", "getChatType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class RecallMessageRequest {
    public static final int $stable = 0;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName("msg_id")
    private final String msgId;

    public static /* synthetic */ RecallMessageRequest copy$default(RecallMessageRequest recallMessageRequest, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recallMessageRequest.msgId;
        }
        if ((i2 & 2) != 0) {
            str2 = recallMessageRequest.chatId;
        }
        if ((i2 & 4) != 0) {
            i = recallMessageRequest.chatType;
        }
        return recallMessageRequest.copy(str, str2, i);
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

    public final RecallMessageRequest copy(String msgId, String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new RecallMessageRequest(msgId, chatId, chatType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecallMessageRequest)) {
            return false;
        }
        RecallMessageRequest recallMessageRequest = (RecallMessageRequest) other;
        return Intrinsics.areEqual(this.msgId, recallMessageRequest.msgId) && Intrinsics.areEqual(this.chatId, recallMessageRequest.chatId) && this.chatType == recallMessageRequest.chatType;
    }

    public int hashCode() {
        return (((this.msgId.hashCode() * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.chatType);
    }

    public String toString() {
        return "RecallMessageRequest(msgId=" + this.msgId + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ")";
    }

    public RecallMessageRequest(String msgId, String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.msgId = msgId;
        this.chatId = chatId;
        this.chatType = chatType;
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
}
