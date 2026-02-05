package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Disk.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, m169d2 = {"Lcom/yhchat/canarys/data/model/CreateFolderRequest;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "folderName", "parentFolderId", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;J)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "getFolderName", "getParentFolderId", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CreateFolderRequest {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final int chatType;

    @SerializedName("folderName")
    private final String folderName;

    @SerializedName("parentFolderId")
    private final long parentFolderId;

    public static /* synthetic */ CreateFolderRequest copy$default(CreateFolderRequest createFolderRequest, String str, int i, String str2, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createFolderRequest.chatId;
        }
        if ((i2 & 2) != 0) {
            i = createFolderRequest.chatType;
        }
        if ((i2 & 4) != 0) {
            str2 = createFolderRequest.folderName;
        }
        if ((i2 & 8) != 0) {
            j = createFolderRequest.parentFolderId;
        }
        String str3 = str2;
        return createFolderRequest.copy(str, i, str3, j);
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
    public final String getFolderName() {
        return this.folderName;
    }

    /* renamed from: component4, reason: from getter */
    public final long getParentFolderId() {
        return this.parentFolderId;
    }

    public final CreateFolderRequest copy(String chatId, int chatType, String folderName, long parentFolderId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        return new CreateFolderRequest(chatId, chatType, folderName, parentFolderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateFolderRequest)) {
            return false;
        }
        CreateFolderRequest createFolderRequest = (CreateFolderRequest) other;
        return Intrinsics.areEqual(this.chatId, createFolderRequest.chatId) && this.chatType == createFolderRequest.chatType && Intrinsics.areEqual(this.folderName, createFolderRequest.folderName) && this.parentFolderId == createFolderRequest.parentFolderId;
    }

    public int hashCode() {
        return (((((this.chatId.hashCode() * 31) + Integer.hashCode(this.chatType)) * 31) + this.folderName.hashCode()) * 31) + Long.hashCode(this.parentFolderId);
    }

    public String toString() {
        return "CreateFolderRequest(chatId=" + this.chatId + ", chatType=" + this.chatType + ", folderName=" + this.folderName + ", parentFolderId=" + this.parentFolderId + ")";
    }

    public CreateFolderRequest(String chatId, int chatType, String folderName, long parentFolderId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(folderName, "folderName");
        this.chatId = chatId;
        this.chatType = chatType;
        this.folderName = folderName;
        this.parentFolderId = parentFolderId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreateFolderRequest(String str, int i, String str2, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long j2;
        if ((i2 & 8) == 0) {
            j2 = j;
        } else {
            j2 = 0;
        }
        this(str, i, str2, j2);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getFolderName() {
        return this.folderName;
    }

    public final long getParentFolderId() {
        return this.parentFolderId;
    }
}
