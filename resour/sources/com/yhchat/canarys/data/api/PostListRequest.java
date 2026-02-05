package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/api/PostListRequest;", "", "typ", "", "baId", "size", "page", "<init>", "(IIII)V", "getTyp", "()I", "getBaId", "getSize", "getPage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class PostListRequest {
    public static final int $stable = 0;

    @SerializedName("baId")
    private final int baId;

    @SerializedName("page")
    private final int page;

    @SerializedName("size")
    private final int size;

    @SerializedName("typ")
    private final int typ;

    public static /* synthetic */ PostListRequest copy$default(PostListRequest postListRequest, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = postListRequest.typ;
        }
        if ((i5 & 2) != 0) {
            i2 = postListRequest.baId;
        }
        if ((i5 & 4) != 0) {
            i3 = postListRequest.size;
        }
        if ((i5 & 8) != 0) {
            i4 = postListRequest.page;
        }
        return postListRequest.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTyp() {
        return this.typ;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBaId() {
        return this.baId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    public final PostListRequest copy(int typ, int baId, int size, int page) {
        return new PostListRequest(typ, baId, size, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostListRequest)) {
            return false;
        }
        PostListRequest postListRequest = (PostListRequest) other;
        return this.typ == postListRequest.typ && this.baId == postListRequest.baId && this.size == postListRequest.size && this.page == postListRequest.page;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.typ) * 31) + Integer.hashCode(this.baId)) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.page);
    }

    public String toString() {
        return "PostListRequest(typ=" + this.typ + ", baId=" + this.baId + ", size=" + this.size + ", page=" + this.page + ")";
    }

    public PostListRequest(int typ, int baId, int size, int page) {
        this.typ = typ;
        this.baId = baId;
        this.size = size;
        this.page = page;
    }

    public /* synthetic */ PostListRequest(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 1 : i, i2, (i5 & 4) != 0 ? 20 : i3, (i5 & 8) != 0 ? 1 : i4);
    }

    public final int getTyp() {
        return this.typ;
    }

    public final int getBaId() {
        return this.baId;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getPage() {
        return this.page;
    }
}
