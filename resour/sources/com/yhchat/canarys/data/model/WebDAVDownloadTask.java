package com.yhchat.canarys.data.model;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.simpleframework.xml.strategy.Name;

/* compiled from: WebDAVDownloadTask.kt */
@Metadata(m168d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\bH\u00c6\u0003J\t\u0010'\u001a\u00020\nH\u00c6\u0003J\t\u0010(\u001a\u00020\nH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\nH\u00c6\u0003Jq\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\nH\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u000201H\u00d6\u0001J\t\u00102\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u001f8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!\u00a8\u00063"}, m169d2 = {"Lcom/yhchat/canarys/data/model/WebDAVDownloadTask;", "", Name.MARK, "", "fileName", "filePath", "mountName", NotificationCompat.CATEGORY_STATUS, "Lcom/yhchat/canarys/data/model/DownloadStatus;", "downloadedBytes", "", "totalBytes", "localPath", "errorMessage", "startedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/data/model/DownloadStatus;JJLjava/lang/String;Ljava/lang/String;J)V", "getId", "()Ljava/lang/String;", "getFileName", "getFilePath", "getMountName", "getStatus", "()Lcom/yhchat/canarys/data/model/DownloadStatus;", "getDownloadedBytes", "()J", "getTotalBytes", "getLocalPath", "getErrorMessage", "getStartedAt", NotificationCompat.CATEGORY_PROGRESS, "", "getProgress", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WebDAVDownloadTask {
    public static final int $stable = 0;
    private final long downloadedBytes;
    private final String errorMessage;
    private final String fileName;
    private final String filePath;
    private final String id;
    private final String localPath;
    private final String mountName;
    private final long startedAt;
    private final DownloadStatus status;
    private final long totalBytes;

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getStartedAt() {
        return this.startedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMountName() {
        return this.mountName;
    }

    /* renamed from: component5, reason: from getter */
    public final DownloadStatus getStatus() {
        return this.status;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    /* renamed from: component7, reason: from getter */
    public final long getTotalBytes() {
        return this.totalBytes;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLocalPath() {
        return this.localPath;
    }

    /* renamed from: component9, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final WebDAVDownloadTask copy(String id, String fileName, String filePath, String mountName, DownloadStatus status, long downloadedBytes, long totalBytes, String localPath, String errorMessage, long startedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(mountName, "mountName");
        Intrinsics.checkNotNullParameter(status, "status");
        return new WebDAVDownloadTask(id, fileName, filePath, mountName, status, downloadedBytes, totalBytes, localPath, errorMessage, startedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebDAVDownloadTask)) {
            return false;
        }
        WebDAVDownloadTask webDAVDownloadTask = (WebDAVDownloadTask) other;
        return Intrinsics.areEqual(this.id, webDAVDownloadTask.id) && Intrinsics.areEqual(this.fileName, webDAVDownloadTask.fileName) && Intrinsics.areEqual(this.filePath, webDAVDownloadTask.filePath) && Intrinsics.areEqual(this.mountName, webDAVDownloadTask.mountName) && this.status == webDAVDownloadTask.status && this.downloadedBytes == webDAVDownloadTask.downloadedBytes && this.totalBytes == webDAVDownloadTask.totalBytes && Intrinsics.areEqual(this.localPath, webDAVDownloadTask.localPath) && Intrinsics.areEqual(this.errorMessage, webDAVDownloadTask.errorMessage) && this.startedAt == webDAVDownloadTask.startedAt;
    }

    public int hashCode() {
        return (((((((((((((((((this.id.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.filePath.hashCode()) * 31) + this.mountName.hashCode()) * 31) + this.status.hashCode()) * 31) + Long.hashCode(this.downloadedBytes)) * 31) + Long.hashCode(this.totalBytes)) * 31) + (this.localPath == null ? 0 : this.localPath.hashCode())) * 31) + (this.errorMessage != null ? this.errorMessage.hashCode() : 0)) * 31) + Long.hashCode(this.startedAt);
    }

    public String toString() {
        return "WebDAVDownloadTask(id=" + this.id + ", fileName=" + this.fileName + ", filePath=" + this.filePath + ", mountName=" + this.mountName + ", status=" + this.status + ", downloadedBytes=" + this.downloadedBytes + ", totalBytes=" + this.totalBytes + ", localPath=" + this.localPath + ", errorMessage=" + this.errorMessage + ", startedAt=" + this.startedAt + ")";
    }

    public WebDAVDownloadTask(String id, String fileName, String filePath, String mountName, DownloadStatus status, long downloadedBytes, long totalBytes, String localPath, String errorMessage, long startedAt) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        Intrinsics.checkNotNullParameter(mountName, "mountName");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.fileName = fileName;
        this.filePath = filePath;
        this.mountName = mountName;
        this.status = status;
        this.downloadedBytes = downloadedBytes;
        this.totalBytes = totalBytes;
        this.localPath = localPath;
        this.errorMessage = errorMessage;
        this.startedAt = startedAt;
    }

    public /* synthetic */ WebDAVDownloadTask(String str, String str2, String str3, String str4, DownloadStatus downloadStatus, long j, long j2, String str5, String str6, long j3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? DownloadStatus.QUEUED : downloadStatus, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? 0L : j2, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? System.currentTimeMillis() : j3);
    }

    public final String getId() {
        return this.id;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getMountName() {
        return this.mountName;
    }

    public final DownloadStatus getStatus() {
        return this.status;
    }

    public final long getDownloadedBytes() {
        return this.downloadedBytes;
    }

    public final long getTotalBytes() {
        return this.totalBytes;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final long getStartedAt() {
        return this.startedAt;
    }

    public final float getProgress() {
        if (this.totalBytes > 0) {
            return RangesKt.coerceIn(RangesKt.coerceAtLeast(this.downloadedBytes, 0L) / this.totalBytes, 0.0f, 1.0f);
        }
        return 0.0f;
    }
}
