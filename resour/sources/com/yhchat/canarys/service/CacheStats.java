package com.yhchat.canarys.service;

import android.support.v4.media.session.PlaybackStateCompat;
import kotlin.Metadata;

/* compiled from: AudioCacheManager.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J1\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00158F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017\u00a8\u0006&"}, m169d2 = {"Lcom/yhchat/canarys/service/CacheStats;", "", "fileCount", "", "totalSize", "", "maxSize", "maxFiles", "<init>", "(IJJI)V", "getFileCount", "()I", "getTotalSize", "()J", "getMaxSize", "getMaxFiles", "usagePercent", "", "getUsagePercent", "()F", "formattedSize", "", "getFormattedSize", "()Ljava/lang/String;", "formattedMaxSize", "getFormattedMaxSize", "formatFileSize", "bytes", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class CacheStats {
    public static final int $stable = 0;
    private final int fileCount;
    private final int maxFiles;
    private final long maxSize;
    private final long totalSize;

    public static /* synthetic */ CacheStats copy$default(CacheStats cacheStats, int i, long j, long j2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = cacheStats.fileCount;
        }
        if ((i3 & 2) != 0) {
            j = cacheStats.totalSize;
        }
        if ((i3 & 4) != 0) {
            j2 = cacheStats.maxSize;
        }
        if ((i3 & 8) != 0) {
            i2 = cacheStats.maxFiles;
        }
        int i4 = i2;
        return cacheStats.copy(i, j, j2, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFileCount() {
        return this.fileCount;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTotalSize() {
        return this.totalSize;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMaxSize() {
        return this.maxSize;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaxFiles() {
        return this.maxFiles;
    }

    public final CacheStats copy(int fileCount, long totalSize, long maxSize, int maxFiles) {
        return new CacheStats(fileCount, totalSize, maxSize, maxFiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheStats)) {
            return false;
        }
        CacheStats cacheStats = (CacheStats) other;
        return this.fileCount == cacheStats.fileCount && this.totalSize == cacheStats.totalSize && this.maxSize == cacheStats.maxSize && this.maxFiles == cacheStats.maxFiles;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.fileCount) * 31) + Long.hashCode(this.totalSize)) * 31) + Long.hashCode(this.maxSize)) * 31) + Integer.hashCode(this.maxFiles);
    }

    public String toString() {
        return "CacheStats(fileCount=" + this.fileCount + ", totalSize=" + this.totalSize + ", maxSize=" + this.maxSize + ", maxFiles=" + this.maxFiles + ")";
    }

    public CacheStats(int fileCount, long totalSize, long maxSize, int maxFiles) {
        this.fileCount = fileCount;
        this.totalSize = totalSize;
        this.maxSize = maxSize;
        this.maxFiles = maxFiles;
    }

    public final int getFileCount() {
        return this.fileCount;
    }

    public final long getTotalSize() {
        return this.totalSize;
    }

    public final long getMaxSize() {
        return this.maxSize;
    }

    public final int getMaxFiles() {
        return this.maxFiles;
    }

    public final float getUsagePercent() {
        return (this.totalSize / this.maxSize) * 100.0f;
    }

    public final String getFormattedSize() {
        return formatFileSize(this.totalSize);
    }

    public final String getFormattedMaxSize() {
        return formatFileSize(this.maxSize);
    }

    private final String formatFileSize(long bytes) {
        if (bytes < 1024) {
            return bytes + "B";
        }
        if (bytes < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return (bytes / 1024) + "KB";
        }
        if (bytes < 1073741824) {
            return (bytes / 1048576) + "MB";
        }
        return (bytes / 1073741824) + "GB";
    }
}
