package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Disk.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001c"}, m169d2 = {"Lcom/yhchat/canarys/data/model/GetFileListRequest;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "folderId", "", "sort", "<init>", "(Ljava/lang/String;IJLjava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "getFolderId", "()J", "getSort", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GetFileListRequest {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final int chatType;

    @SerializedName("folderId")
    private final long folderId;

    @SerializedName("sort")
    private final String sort;

    public static /* synthetic */ GetFileListRequest copy$default(GetFileListRequest getFileListRequest, String str, int i, long j, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = getFileListRequest.chatId;
        }
        if ((i2 & 2) != 0) {
            i = getFileListRequest.chatType;
        }
        if ((i2 & 4) != 0) {
            j = getFileListRequest.folderId;
        }
        if ((i2 & 8) != 0) {
            str2 = getFileListRequest.sort;
        }
        String str3 = str2;
        return getFileListRequest.copy(str, i, j, str3);
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
    public final long getFolderId() {
        return this.folderId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSort() {
        return this.sort;
    }

    public final GetFileListRequest copy(String chatId, int chatType, long folderId, String sort) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(sort, "sort");
        return new GetFileListRequest(chatId, chatType, folderId, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetFileListRequest)) {
            return false;
        }
        GetFileListRequest getFileListRequest = (GetFileListRequest) other;
        return Intrinsics.areEqual(this.chatId, getFileListRequest.chatId) && this.chatType == getFileListRequest.chatType && this.folderId == getFileListRequest.folderId && Intrinsics.areEqual(this.sort, getFileListRequest.sort);
    }

    public int hashCode() {
        return (((((this.chatId.hashCode() * 31) + Integer.hashCode(this.chatType)) * 31) + Long.hashCode(this.folderId)) * 31) + this.sort.hashCode();
    }

    public String toString() {
        return "GetFileListRequest(chatId=" + this.chatId + ", chatType=" + this.chatType + ", folderId=" + this.folderId + ", sort=" + this.sort + ")";
    }

    public GetFileListRequest(String chatId, int chatType, long folderId, String sort) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(sort, "sort");
        this.chatId = chatId;
        this.chatType = chatType;
        this.folderId = folderId;
        this.sort = sort;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ GetFileListRequest(String str, int i, long j, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        String str3;
        if ((i2 & 4) == 0) {
            j2 = j;
        } else {
            j2 = 0;
        }
        if ((i2 & 8) == 0) {
            str3 = str2;
        } else {
            str3 = "name_asc";
        }
        this(str, i, j2, str3);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final long getFolderId() {
        return this.folderId;
    }

    public final String getSort() {
        return this.sort;
    }
}
