package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GitHubRelease.kt */
@Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001f"}, m169d2 = {"Lcom/yhchat/canarys/data/model/GitHubRelease;", "", "tagName", "", HintConstants.AUTOFILL_HINT_NAME, "body", "publishedAt", "assets", "", "Lcom/yhchat/canarys/data/model/GitHubAsset;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTagName", "()Ljava/lang/String;", "getName", "getBody", "getPublishedAt", "getAssets", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GitHubRelease {
    public static final int $stable = 8;

    @SerializedName("assets")
    private final List<GitHubAsset> assets;

    @SerializedName("body")
    private final String body;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("published_at")
    private final String publishedAt;

    @SerializedName("tag_name")
    private final String tagName;

    public static /* synthetic */ GitHubRelease copy$default(GitHubRelease gitHubRelease, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gitHubRelease.tagName;
        }
        if ((i & 2) != 0) {
            str2 = gitHubRelease.name;
        }
        if ((i & 4) != 0) {
            str3 = gitHubRelease.body;
        }
        if ((i & 8) != 0) {
            str4 = gitHubRelease.publishedAt;
        }
        if ((i & 16) != 0) {
            list = gitHubRelease.assets;
        }
        List list2 = list;
        String str5 = str3;
        return gitHubRelease.copy(str, str2, str5, str4, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTagName() {
        return this.tagName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBody() {
        return this.body;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPublishedAt() {
        return this.publishedAt;
    }

    public final List<GitHubAsset> component5() {
        return this.assets;
    }

    public final GitHubRelease copy(String tagName, String name, String body, String publishedAt, List<GitHubAsset> assets) {
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
        Intrinsics.checkNotNullParameter(assets, "assets");
        return new GitHubRelease(tagName, name, body, publishedAt, assets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GitHubRelease)) {
            return false;
        }
        GitHubRelease gitHubRelease = (GitHubRelease) other;
        return Intrinsics.areEqual(this.tagName, gitHubRelease.tagName) && Intrinsics.areEqual(this.name, gitHubRelease.name) && Intrinsics.areEqual(this.body, gitHubRelease.body) && Intrinsics.areEqual(this.publishedAt, gitHubRelease.publishedAt) && Intrinsics.areEqual(this.assets, gitHubRelease.assets);
    }

    public int hashCode() {
        return (((((((this.tagName.hashCode() * 31) + this.name.hashCode()) * 31) + this.body.hashCode()) * 31) + this.publishedAt.hashCode()) * 31) + this.assets.hashCode();
    }

    public String toString() {
        return "GitHubRelease(tagName=" + this.tagName + ", name=" + this.name + ", body=" + this.body + ", publishedAt=" + this.publishedAt + ", assets=" + this.assets + ")";
    }

    public GitHubRelease(String tagName, String name, String body, String publishedAt, List<GitHubAsset> assets) {
        Intrinsics.checkNotNullParameter(tagName, "tagName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(publishedAt, "publishedAt");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.tagName = tagName;
        this.name = name;
        this.body = body;
        this.publishedAt = publishedAt;
        this.assets = assets;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getPublishedAt() {
        return this.publishedAt;
    }

    public final List<GitHubAsset> getAssets() {
        return this.assets;
    }
}
