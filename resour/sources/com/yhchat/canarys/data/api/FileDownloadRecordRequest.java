package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/api/FileDownloadRecordRequest;", "", "msgId", "", "downloadPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getMsgId", "()Ljava/lang/String;", "getDownloadPath", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FileDownloadRecordRequest {
    public static final int $stable = 0;

    @SerializedName("downloadPath")
    private final String downloadPath;

    @SerializedName("msgId")
    private final String msgId;

    public static /* synthetic */ FileDownloadRecordRequest copy$default(FileDownloadRecordRequest fileDownloadRecordRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileDownloadRecordRequest.msgId;
        }
        if ((i & 2) != 0) {
            str2 = fileDownloadRecordRequest.downloadPath;
        }
        return fileDownloadRecordRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDownloadPath() {
        return this.downloadPath;
    }

    public final FileDownloadRecordRequest copy(String msgId, String downloadPath) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(downloadPath, "downloadPath");
        return new FileDownloadRecordRequest(msgId, downloadPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileDownloadRecordRequest)) {
            return false;
        }
        FileDownloadRecordRequest fileDownloadRecordRequest = (FileDownloadRecordRequest) other;
        return Intrinsics.areEqual(this.msgId, fileDownloadRecordRequest.msgId) && Intrinsics.areEqual(this.downloadPath, fileDownloadRecordRequest.downloadPath);
    }

    public int hashCode() {
        return (this.msgId.hashCode() * 31) + this.downloadPath.hashCode();
    }

    public String toString() {
        return "FileDownloadRecordRequest(msgId=" + this.msgId + ", downloadPath=" + this.downloadPath + ")";
    }

    public FileDownloadRecordRequest(String msgId, String downloadPath) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(downloadPath, "downloadPath");
        this.msgId = msgId;
        this.downloadPath = downloadPath;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final String getDownloadPath() {
        return this.downloadPath;
    }
}
