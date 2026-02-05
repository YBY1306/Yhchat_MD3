package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/data/api/CommentPostRequest;", "", "postId", "", "commentId", "content", "", "<init>", "(IILjava/lang/String;)V", "getPostId", "()I", "getCommentId", "getContent", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CommentPostRequest {
    public static final int $stable = 0;

    @SerializedName("commentId")
    private final int commentId;

    @SerializedName("content")
    private final String content;

    @SerializedName("postId")
    private final int postId;

    public static /* synthetic */ CommentPostRequest copy$default(CommentPostRequest commentPostRequest, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = commentPostRequest.postId;
        }
        if ((i3 & 2) != 0) {
            i2 = commentPostRequest.commentId;
        }
        if ((i3 & 4) != 0) {
            str = commentPostRequest.content;
        }
        return commentPostRequest.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getPostId() {
        return this.postId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCommentId() {
        return this.commentId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final CommentPostRequest copy(int postId, int commentId, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new CommentPostRequest(postId, commentId, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommentPostRequest)) {
            return false;
        }
        CommentPostRequest commentPostRequest = (CommentPostRequest) other;
        return this.postId == commentPostRequest.postId && this.commentId == commentPostRequest.commentId && Intrinsics.areEqual(this.content, commentPostRequest.content);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.postId) * 31) + Integer.hashCode(this.commentId)) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "CommentPostRequest(postId=" + this.postId + ", commentId=" + this.commentId + ", content=" + this.content + ")";
    }

    public CommentPostRequest(int postId, int commentId, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.postId = postId;
        this.commentId = commentId;
        this.content = content;
    }

    public /* synthetic */ CommentPostRequest(int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? 0 : i2, str);
    }

    public final int getPostId() {
        return this.postId;
    }

    public final int getCommentId() {
        return this.commentId;
    }

    public final String getContent() {
        return this.content;
    }
}
