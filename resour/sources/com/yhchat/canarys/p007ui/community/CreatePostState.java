package com.yhchat.canarys.p007ui.community;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreatePostViewModel.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J:\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001b"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/CreatePostState;", "", "isLoading", "", "isSuccess", "postId", "", "error", "", "<init>", "(ZZLjava/lang/Integer;Ljava/lang/String;)V", "()Z", "getPostId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(ZZLjava/lang/Integer;Ljava/lang/String;)Lcom/yhchat/canarys/ui/community/CreatePostState;", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CreatePostState {
    public static final int $stable = 0;
    private final String error;
    private final boolean isLoading;
    private final boolean isSuccess;
    private final Integer postId;

    public CreatePostState() {
        this(false, false, null, null, 15, null);
    }

    public static /* synthetic */ CreatePostState copy$default(CreatePostState createPostState, boolean z, boolean z2, Integer num, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = createPostState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = createPostState.isSuccess;
        }
        if ((i & 4) != 0) {
            num = createPostState.postId;
        }
        if ((i & 8) != 0) {
            str = createPostState.error;
        }
        return createPostState.copy(z, z2, num, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getPostId() {
        return this.postId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final CreatePostState copy(boolean isLoading, boolean isSuccess, Integer postId, String error) {
        return new CreatePostState(isLoading, isSuccess, postId, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePostState)) {
            return false;
        }
        CreatePostState createPostState = (CreatePostState) other;
        return this.isLoading == createPostState.isLoading && this.isSuccess == createPostState.isSuccess && Intrinsics.areEqual(this.postId, createPostState.postId) && Intrinsics.areEqual(this.error, createPostState.error);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isSuccess)) * 31) + (this.postId == null ? 0 : this.postId.hashCode())) * 31) + (this.error != null ? this.error.hashCode() : 0);
    }

    public String toString() {
        return "CreatePostState(isLoading=" + this.isLoading + ", isSuccess=" + this.isSuccess + ", postId=" + this.postId + ", error=" + this.error + ")";
    }

    public CreatePostState(boolean isLoading, boolean isSuccess, Integer postId, String error) {
        this.isLoading = isLoading;
        this.isSuccess = isSuccess;
        this.postId = postId;
        this.error = error;
    }

    public /* synthetic */ CreatePostState(boolean z, boolean z2, Integer num, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    public final Integer getPostId() {
        return this.postId;
    }

    public final String getError() {
        return this.error;
    }
}
