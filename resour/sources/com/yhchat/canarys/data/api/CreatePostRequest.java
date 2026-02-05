package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/api/CreatePostRequest;", "", "baId", "", "groupId", "", "title", "content", "contentType", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBaId", "()I", "getGroupId", "()Ljava/lang/String;", "getTitle", "getContent", "getContentType", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CreatePostRequest {
    public static final int $stable = 0;

    @SerializedName("baId")
    private final int baId;

    @SerializedName("content")
    private final String content;

    @SerializedName("contentType")
    private final int contentType;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName("title")
    private final String title;

    public static /* synthetic */ CreatePostRequest copy$default(CreatePostRequest createPostRequest, int i, String str, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = createPostRequest.baId;
        }
        if ((i3 & 2) != 0) {
            str = createPostRequest.groupId;
        }
        if ((i3 & 4) != 0) {
            str2 = createPostRequest.title;
        }
        if ((i3 & 8) != 0) {
            str3 = createPostRequest.content;
        }
        if ((i3 & 16) != 0) {
            i2 = createPostRequest.contentType;
        }
        int i4 = i2;
        String str4 = str2;
        return createPostRequest.copy(i, str, str4, str3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBaId() {
        return this.baId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component5, reason: from getter */
    public final int getContentType() {
        return this.contentType;
    }

    public final CreatePostRequest copy(int baId, String groupId, String title, String content, int contentType) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        return new CreatePostRequest(baId, groupId, title, content, contentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatePostRequest)) {
            return false;
        }
        CreatePostRequest createPostRequest = (CreatePostRequest) other;
        return this.baId == createPostRequest.baId && Intrinsics.areEqual(this.groupId, createPostRequest.groupId) && Intrinsics.areEqual(this.title, createPostRequest.title) && Intrinsics.areEqual(this.content, createPostRequest.content) && this.contentType == createPostRequest.contentType;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.baId) * 31) + this.groupId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.content.hashCode()) * 31) + Integer.hashCode(this.contentType);
    }

    public String toString() {
        return "CreatePostRequest(baId=" + this.baId + ", groupId=" + this.groupId + ", title=" + this.title + ", content=" + this.content + ", contentType=" + this.contentType + ")";
    }

    public CreatePostRequest(int baId, String groupId, String title, String content, int contentType) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        this.baId = baId;
        this.groupId = groupId;
        this.title = title;
        this.content = content;
        this.contentType = contentType;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CreatePostRequest(int i, String str, String str2, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        if ((i3 & 2) == 0) {
            str4 = str;
        } else {
            str4 = "";
        }
        this(i, str4, str2, str3, i2);
    }

    public final int getBaId() {
        return this.baId;
    }

    public final String getGroupId() {
        return this.groupId;
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
