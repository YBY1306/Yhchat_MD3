package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/data/model/AddFriendRequest;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "remark", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "getRemark", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AddFriendRequest {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final int chatType;

    @SerializedName("remark")
    private final String remark;

    public static /* synthetic */ AddFriendRequest copy$default(AddFriendRequest addFriendRequest, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = addFriendRequest.chatId;
        }
        if ((i2 & 2) != 0) {
            i = addFriendRequest.chatType;
        }
        if ((i2 & 4) != 0) {
            str2 = addFriendRequest.remark;
        }
        return addFriendRequest.copy(str, i, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    public final AddFriendRequest copy(String chatId, int chatType, String remark) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(remark, "remark");
        return new AddFriendRequest(chatId, chatType, remark);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddFriendRequest)) {
            return false;
        }
        AddFriendRequest addFriendRequest = (AddFriendRequest) other;
        return Intrinsics.areEqual(this.chatId, addFriendRequest.chatId) && this.chatType == addFriendRequest.chatType && Intrinsics.areEqual(this.remark, addFriendRequest.remark);
    }

    public int hashCode() {
        return (((this.chatId.hashCode() * 31) + Integer.hashCode(this.chatType)) * 31) + this.remark.hashCode();
    }

    public String toString() {
        return "AddFriendRequest(chatId=" + this.chatId + ", chatType=" + this.chatType + ", remark=" + this.remark + ")";
    }

    public AddFriendRequest(String chatId, int chatType, String remark) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.chatId = chatId;
        this.chatType = chatType;
        this.remark = remark;
    }

    public /* synthetic */ AddFriendRequest(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i2 & 4) != 0 ? "" : str2);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getRemark() {
        return this.remark;
    }
}
