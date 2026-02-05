package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/data/api/EditPostRequest;", "", "postId", "", "title", "", "content", "contentType", "<init>", "(ILjava/lang/String;Ljava/lang/String;I)V", "getPostId", "()I", "getTitle", "()Ljava/lang/String;", "getContent", "getContentType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EditPostRequest {
    public static final int $stable = 0;

    @SerializedName("content")
    private final String content;

    @SerializedName("contentType")
    private final int contentType;

    @SerializedName("postId")
    private final int postId;

    @SerializedName("title")
    private final String title;

    public static /* synthetic */ EditPostRequest copy$default(EditPostRequest editPostRequest, int i, String str, String str2, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = editPostRequest.postId;
        }
        if ((i3 & 2) != 0) {
            str = editPostRequest.title;
        }
        if ((i3 & 4) != 0) {
            str2 = editPostRequest.content;
        }
        if ((i3 & 8) != 0) {
            i2 = editPostRequest.contentType;
        }
        return editPostRequest.copy(i, str, str2, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPostId() {
        return this.postId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final int getContentType() {
        return this.contentType;
    }

    public final EditPostRequest copy(int postId, String title, String content, int contentType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        return new EditPostRequest(postId, title, content, contentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditPostRequest)) {
            return false;
        }
        EditPostRequest editPostRequest = (EditPostRequest) other;
        return this.postId == editPostRequest.postId && Intrinsics.areEqual(this.title, editPostRequest.title) && Intrinsics.areEqual(this.content, editPostRequest.content) && this.contentType == editPostRequest.contentType;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.postId) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.contentType);
    }

    public String toString() {
        return "EditPostRequest(postId=" + this.postId + ", title=" + this.title + ", content=" + this.content + ", contentType=" + this.contentType + ")";
    }

    public EditPostRequest(int postId, String title, String content, int contentType) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.postId = postId;
        this.title = title;
        this.content = content;
        this.contentType = contentType;
    }

    public final int getPostId() {
        return this.postId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getContent() {
        return this.content;
    }

    public final int getContentType() {
        return this.contentType;
    }
}
