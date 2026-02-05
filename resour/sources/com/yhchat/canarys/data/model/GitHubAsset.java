package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GitHubRelease.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, m169d2 = {"Lcom/yhchat/canarys/data/model/GitHubAsset;", "", HintConstants.AUTOFILL_HINT_NAME, "", "browserDownloadUrl", "contentType", "size", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "getName", "()Ljava/lang/String;", "getBrowserDownloadUrl", "getContentType", "getSize", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GitHubAsset {
    public static final int $stable = 0;

    @SerializedName("browser_download_url")
    private final String browserDownloadUrl;

    @SerializedName("content_type")
    private final String contentType;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("size")
    private final long size;

    public static /* synthetic */ GitHubAsset copy$default(GitHubAsset gitHubAsset, String str, String str2, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gitHubAsset.name;
        }
        if ((i & 2) != 0) {
            str2 = gitHubAsset.browserDownloadUrl;
        }
        if ((i & 4) != 0) {
            str3 = gitHubAsset.contentType;
        }
        if ((i & 8) != 0) {
            j = gitHubAsset.size;
        }
        String str4 = str3;
        return gitHubAsset.copy(str, str2, str4, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBrowserDownloadUrl() {
        return this.browserDownloadUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public final GitHubAsset copy(String name, String browserDownloadUrl, String contentType, long size) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(browserDownloadUrl, "browserDownloadUrl");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        return new GitHubAsset(name, browserDownloadUrl, contentType, size);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GitHubAsset)) {
            return false;
        }
        GitHubAsset gitHubAsset = (GitHubAsset) other;
        return Intrinsics.areEqual(this.name, gitHubAsset.name) && Intrinsics.areEqual(this.browserDownloadUrl, gitHubAsset.browserDownloadUrl) && Intrinsics.areEqual(this.contentType, gitHubAsset.contentType) && this.size == gitHubAsset.size;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.browserDownloadUrl.hashCode()) * 31) + this.contentType.hashCode()) * 31) + Long.hashCode(this.size);
    }

    public String toString() {
        return "GitHubAsset(name=" + this.name + ", browserDownloadUrl=" + this.browserDownloadUrl + ", contentType=" + this.contentType + ", size=" + this.size + ")";
    }

    public GitHubAsset(String name, String browserDownloadUrl, String contentType, long size) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(browserDownloadUrl, "browserDownloadUrl");
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        this.name = name;
        this.browserDownloadUrl = browserDownloadUrl;
        this.contentType = contentType;
        this.size = size;
    }

    public final String getName() {
        return this.name;
    }

    public final String getBrowserDownloadUrl() {
        return this.browserDownloadUrl;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final long getSize() {
        return this.size;
    }
}
