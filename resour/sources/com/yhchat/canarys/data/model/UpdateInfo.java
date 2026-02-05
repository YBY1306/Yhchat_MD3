package com.yhchat.canarys.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GitHubRelease.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/data/model/UpdateInfo;", "", "hasUpdate", "", "latestVersion", "", "updateTitle", "updateContent", "publishTime", "downloadUrl", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHasUpdate", "()Z", "getLatestVersion", "()Ljava/lang/String;", "getUpdateTitle", "getUpdateContent", "getPublishTime", "getDownloadUrl", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UpdateInfo {
    public static final int $stable = 0;
    private final String downloadUrl;
    private final boolean hasUpdate;
    private final String latestVersion;
    private final String publishTime;
    private final String updateContent;
    private final String updateTitle;

    public static /* synthetic */ UpdateInfo copy$default(UpdateInfo updateInfo, boolean z, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = updateInfo.hasUpdate;
        }
        if ((i & 2) != 0) {
            str = updateInfo.latestVersion;
        }
        if ((i & 4) != 0) {
            str2 = updateInfo.updateTitle;
        }
        if ((i & 8) != 0) {
            str3 = updateInfo.updateContent;
        }
        if ((i & 16) != 0) {
            str4 = updateInfo.publishTime;
        }
        if ((i & 32) != 0) {
            str5 = updateInfo.downloadUrl;
        }
        String str6 = str4;
        String str7 = str5;
        return updateInfo.copy(z, str, str2, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasUpdate() {
        return this.hasUpdate;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLatestVersion() {
        return this.latestVersion;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUpdateTitle() {
        return this.updateTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getUpdateContent() {
        return this.updateContent;
    }

    /* renamed from: component5, reason: from getter */
    public final String getPublishTime() {
        return this.publishTime;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final UpdateInfo copy(boolean hasUpdate, String latestVersion, String updateTitle, String updateContent, String publishTime, String downloadUrl) {
        Intrinsics.checkNotNullParameter(latestVersion, "latestVersion");
        Intrinsics.checkNotNullParameter(updateTitle, "updateTitle");
        Intrinsics.checkNotNullParameter(updateContent, "updateContent");
        Intrinsics.checkNotNullParameter(publishTime, "publishTime");
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        return new UpdateInfo(hasUpdate, latestVersion, updateTitle, updateContent, publishTime, downloadUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateInfo)) {
            return false;
        }
        UpdateInfo updateInfo = (UpdateInfo) other;
        return this.hasUpdate == updateInfo.hasUpdate && Intrinsics.areEqual(this.latestVersion, updateInfo.latestVersion) && Intrinsics.areEqual(this.updateTitle, updateInfo.updateTitle) && Intrinsics.areEqual(this.updateContent, updateInfo.updateContent) && Intrinsics.areEqual(this.publishTime, updateInfo.publishTime) && Intrinsics.areEqual(this.downloadUrl, updateInfo.downloadUrl);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.hasUpdate) * 31) + this.latestVersion.hashCode()) * 31) + this.updateTitle.hashCode()) * 31) + this.updateContent.hashCode()) * 31) + this.publishTime.hashCode()) * 31) + this.downloadUrl.hashCode();
    }

    public String toString() {
        return "UpdateInfo(hasUpdate=" + this.hasUpdate + ", latestVersion=" + this.latestVersion + ", updateTitle=" + this.updateTitle + ", updateContent=" + this.updateContent + ", publishTime=" + this.publishTime + ", downloadUrl=" + this.downloadUrl + ")";
    }

    public UpdateInfo(boolean hasUpdate, String latestVersion, String updateTitle, String updateContent, String publishTime, String downloadUrl) {
        Intrinsics.checkNotNullParameter(latestVersion, "latestVersion");
        Intrinsics.checkNotNullParameter(updateTitle, "updateTitle");
        Intrinsics.checkNotNullParameter(updateContent, "updateContent");
        Intrinsics.checkNotNullParameter(publishTime, "publishTime");
        Intrinsics.checkNotNullParameter(downloadUrl, "downloadUrl");
        this.hasUpdate = hasUpdate;
        this.latestVersion = latestVersion;
        this.updateTitle = updateTitle;
        this.updateContent = updateContent;
        this.publishTime = publishTime;
        this.downloadUrl = downloadUrl;
    }

    public final boolean getHasUpdate() {
        return this.hasUpdate;
    }

    public final String getLatestVersion() {
        return this.latestVersion;
    }

    public final String getUpdateTitle() {
        return this.updateTitle;
    }

    public final String getUpdateContent() {
        return this.updateContent;
    }

    public final String getPublishTime() {
        return this.publishTime;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }
}
