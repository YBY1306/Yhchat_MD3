package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Disk.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001J\t\u0010'\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/data/model/UploadFileRequest;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "fileSize", "", "fileName", "fileMd5", "fileEtag", "qiniuKey", "folderId", "<init>", "(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "getFileSize", "()J", "getFileName", "getFileMd5", "getFileEtag", "getQiniuKey", "getFolderId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UploadFileRequest {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final int chatType;

    @SerializedName("fileEtag")
    private final String fileEtag;

    @SerializedName("fileMd5")
    private final String fileMd5;

    @SerializedName("fileName")
    private final String fileName;

    @SerializedName("fileSize")
    private final long fileSize;

    @SerializedName("folderId")
    private final long folderId;

    @SerializedName("qiniuKey")
    private final String qiniuKey;

    public static /* synthetic */ UploadFileRequest copy$default(UploadFileRequest uploadFileRequest, String str, int i, long j, String str2, String str3, String str4, String str5, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = uploadFileRequest.chatId;
        }
        if ((i2 & 2) != 0) {
            i = uploadFileRequest.chatType;
        }
        if ((i2 & 4) != 0) {
            j = uploadFileRequest.fileSize;
        }
        if ((i2 & 8) != 0) {
            str2 = uploadFileRequest.fileName;
        }
        if ((i2 & 16) != 0) {
            str3 = uploadFileRequest.fileMd5;
        }
        if ((i2 & 32) != 0) {
            str4 = uploadFileRequest.fileEtag;
        }
        if ((i2 & 64) != 0) {
            str5 = uploadFileRequest.qiniuKey;
        }
        if ((i2 & 128) != 0) {
            j2 = uploadFileRequest.folderId;
        }
        long j3 = j2;
        long j4 = j;
        return uploadFileRequest.copy(str, i, j4, str2, str3, str4, str5, j3);
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
    public final long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFileMd5() {
        return this.fileMd5;
    }

    /* renamed from: component6, reason: from getter */
    public final String getFileEtag() {
        return this.fileEtag;
    }

    /* renamed from: component7, reason: from getter */
    public final String getQiniuKey() {
        return this.qiniuKey;
    }

    /* renamed from: component8, reason: from getter */
    public final long getFolderId() {
        return this.folderId;
    }

    public final UploadFileRequest copy(String chatId, int chatType, long fileSize, String fileName, String fileMd5, String fileEtag, String qiniuKey, long folderId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        Intrinsics.checkNotNullParameter(fileEtag, "fileEtag");
        Intrinsics.checkNotNullParameter(qiniuKey, "qiniuKey");
        return new UploadFileRequest(chatId, chatType, fileSize, fileName, fileMd5, fileEtag, qiniuKey, folderId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UploadFileRequest)) {
            return false;
        }
        UploadFileRequest uploadFileRequest = (UploadFileRequest) other;
        return Intrinsics.areEqual(this.chatId, uploadFileRequest.chatId) && this.chatType == uploadFileRequest.chatType && this.fileSize == uploadFileRequest.fileSize && Intrinsics.areEqual(this.fileName, uploadFileRequest.fileName) && Intrinsics.areEqual(this.fileMd5, uploadFileRequest.fileMd5) && Intrinsics.areEqual(this.fileEtag, uploadFileRequest.fileEtag) && Intrinsics.areEqual(this.qiniuKey, uploadFileRequest.qiniuKey) && this.folderId == uploadFileRequest.folderId;
    }

    public int hashCode() {
        return (((((((((((((this.chatId.hashCode() * 31) + Integer.hashCode(this.chatType)) * 31) + Long.hashCode(this.fileSize)) * 31) + this.fileName.hashCode()) * 31) + this.fileMd5.hashCode()) * 31) + this.fileEtag.hashCode()) * 31) + this.qiniuKey.hashCode()) * 31) + Long.hashCode(this.folderId);
    }

    public String toString() {
        return "UploadFileRequest(chatId=" + this.chatId + ", chatType=" + this.chatType + ", fileSize=" + this.fileSize + ", fileName=" + this.fileName + ", fileMd5=" + this.fileMd5 + ", fileEtag=" + this.fileEtag + ", qiniuKey=" + this.qiniuKey + ", folderId=" + this.folderId + ")";
    }

    public UploadFileRequest(String chatId, int chatType, long fileSize, String fileName, String fileMd5, String fileEtag, String qiniuKey, long folderId) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(fileMd5, "fileMd5");
        Intrinsics.checkNotNullParameter(fileEtag, "fileEtag");
        Intrinsics.checkNotNullParameter(qiniuKey, "qiniuKey");
        this.chatId = chatId;
        this.chatType = chatType;
        this.fileSize = fileSize;
        this.fileName = fileName;
        this.fileMd5 = fileMd5;
        this.fileEtag = fileEtag;
        this.qiniuKey = qiniuKey;
        this.folderId = folderId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ UploadFileRequest(String str, int i, long j, String str2, String str3, String str4, String str5, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        long j3;
        if ((i2 & 128) == 0) {
            j3 = j2;
        } else {
            j3 = 0;
        }
        this(str, i, j, str2, str3, str4, str5, j3);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileMd5() {
        return this.fileMd5;
    }

    public final String getFileEtag() {
        return this.fileEtag;
    }

    public final String getQiniuKey() {
        return this.qiniuKey;
    }

    public final long getFolderId() {
        return this.folderId;
    }
}
