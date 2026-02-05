package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/data/model/RecommendGroupListRequest;", "", "category", "", "keyword", "size", "", "page", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "getCategory", "()Ljava/lang/String;", "getKeyword", "getSize", "()I", "getPage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RecommendGroupListRequest {
    public static final int $stable = 0;

    @SerializedName("category")
    private final String category;

    @SerializedName("keyword")
    private final String keyword;

    @SerializedName("page")
    private final int page;

    @SerializedName("size")
    private final int size;

    public RecommendGroupListRequest() {
        this(null, null, 0, 0, 15, null);
    }

    public static /* synthetic */ RecommendGroupListRequest copy$default(RecommendGroupListRequest recommendGroupListRequest, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = recommendGroupListRequest.category;
        }
        if ((i3 & 2) != 0) {
            str2 = recommendGroupListRequest.keyword;
        }
        if ((i3 & 4) != 0) {
            i = recommendGroupListRequest.size;
        }
        if ((i3 & 8) != 0) {
            i2 = recommendGroupListRequest.page;
        }
        return recommendGroupListRequest.copy(str, str2, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component4, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    public final RecommendGroupListRequest copy(String category, String keyword, int size, int page) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        return new RecommendGroupListRequest(category, keyword, size, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendGroupListRequest)) {
            return false;
        }
        RecommendGroupListRequest recommendGroupListRequest = (RecommendGroupListRequest) other;
        return Intrinsics.areEqual(this.category, recommendGroupListRequest.category) && Intrinsics.areEqual(this.keyword, recommendGroupListRequest.keyword) && this.size == recommendGroupListRequest.size && this.page == recommendGroupListRequest.page;
    }

    public int hashCode() {
        return (((((this.category.hashCode() * 31) + this.keyword.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.page);
    }

    public String toString() {
        return "RecommendGroupListRequest(category=" + this.category + ", keyword=" + this.keyword + ", size=" + this.size + ", page=" + this.page + ")";
    }

    public RecommendGroupListRequest(String category, String keyword, int size, int page) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        this.category = category;
        this.keyword = keyword;
        this.size = size;
        this.page = page;
    }

    public /* synthetic */ RecommendGroupListRequest(String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 30 : i, (i3 & 8) != 0 ? 1 : i2);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getPage() {
        return this.page;
    }
}
