package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0004H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/model/RecallMessageBatchRequest;", "", "msgIds", "", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "<init>", "(Ljava/util/List;Ljava/lang/String;I)V", "getMsgIds", "()Ljava/util/List;", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RecallMessageBatchRequest {
    public static final int $stable = 8;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName("msg_id")
    private final List<String> msgIds;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecallMessageBatchRequest copy$default(RecallMessageBatchRequest recallMessageBatchRequest, List list, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = recallMessageBatchRequest.msgIds;
        }
        if ((i2 & 2) != 0) {
            str = recallMessageBatchRequest.chatId;
        }
        if ((i2 & 4) != 0) {
            i = recallMessageBatchRequest.chatType;
        }
        return recallMessageBatchRequest.copy(list, str, i);
    }

    public final List<String> component1() {
        return this.msgIds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    public final RecallMessageBatchRequest copy(List<String> msgIds, String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(msgIds, "msgIds");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new RecallMessageBatchRequest(msgIds, chatId, chatType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecallMessageBatchRequest)) {
            return false;
        }
        RecallMessageBatchRequest recallMessageBatchRequest = (RecallMessageBatchRequest) other;
        return Intrinsics.areEqual(this.msgIds, recallMessageBatchRequest.msgIds) && Intrinsics.areEqual(this.chatId, recallMessageBatchRequest.chatId) && this.chatType == recallMessageBatchRequest.chatType;
    }

    public int hashCode() {
        return (((this.msgIds.hashCode() * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.chatType);
    }

    public String toString() {
        return "RecallMessageBatchRequest(msgIds=" + this.msgIds + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ")";
    }

    public RecallMessageBatchRequest(List<String> msgIds, String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(msgIds, "msgIds");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.msgIds = msgIds;
        this.chatId = chatId;
        this.chatType = chatType;
    }

    public final List<String> getMsgIds() {
        return this.msgIds;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }
}
