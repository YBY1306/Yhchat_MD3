package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Friend.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, m169d2 = {"Lcom/yhchat/canarys/data/model/DeleteFriendRequest;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "<init>", "(Ljava/lang/String;I)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class DeleteFriendRequest {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final int chatType;

    public static /* synthetic */ DeleteFriendRequest copy$default(DeleteFriendRequest deleteFriendRequest, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deleteFriendRequest.chatId;
        }
        if ((i2 & 2) != 0) {
            i = deleteFriendRequest.chatType;
        }
        return deleteFriendRequest.copy(str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    public final DeleteFriendRequest copy(String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        return new DeleteFriendRequest(chatId, chatType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeleteFriendRequest)) {
            return false;
        }
        DeleteFriendRequest deleteFriendRequest = (DeleteFriendRequest) other;
        return Intrinsics.areEqual(this.chatId, deleteFriendRequest.chatId) && this.chatType == deleteFriendRequest.chatType;
    }

    public int hashCode() {
        return (this.chatId.hashCode() * 31) + Integer.hashCode(this.chatType);
    }

    public String toString() {
        return "DeleteFriendRequest(chatId=" + this.chatId + ", chatType=" + this.chatType + ")";
    }

    public DeleteFriendRequest(String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        this.chatId = chatId;
        this.chatType = chatType;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }
}
