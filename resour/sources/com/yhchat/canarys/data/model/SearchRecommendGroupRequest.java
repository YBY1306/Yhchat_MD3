package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/model/SearchRecommendGroupRequest;", "", "keyword", "", "categoryId", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "getKeyword", "()Ljava/lang/String;", "getCategoryId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/yhchat/canarys/data/model/SearchRecommendGroupRequest;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SearchRecommendGroupRequest {
    public static final int $stable = 0;

    @SerializedName("categoryId")
    private final Integer categoryId;

    @SerializedName("keyword")
    private final String keyword;

    public static /* synthetic */ SearchRecommendGroupRequest copy$default(SearchRecommendGroupRequest searchRecommendGroupRequest, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchRecommendGroupRequest.keyword;
        }
        if ((i & 2) != 0) {
            num = searchRecommendGroupRequest.categoryId;
        }
        return searchRecommendGroupRequest.copy(str, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKeyword() {
        return this.keyword;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final SearchRecommendGroupRequest copy(String keyword, Integer categoryId) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        return new SearchRecommendGroupRequest(keyword, categoryId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRecommendGroupRequest)) {
            return false;
        }
        SearchRecommendGroupRequest searchRecommendGroupRequest = (SearchRecommendGroupRequest) other;
        return Intrinsics.areEqual(this.keyword, searchRecommendGroupRequest.keyword) && Intrinsics.areEqual(this.categoryId, searchRecommendGroupRequest.categoryId);
    }

    public int hashCode() {
        return (this.keyword.hashCode() * 31) + (this.categoryId == null ? 0 : this.categoryId.hashCode());
    }

    public String toString() {
        return "SearchRecommendGroupRequest(keyword=" + this.keyword + ", categoryId=" + this.categoryId + ")";
    }

    public SearchRecommendGroupRequest(String keyword, Integer categoryId) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        this.keyword = keyword;
        this.categoryId = categoryId;
    }

    public /* synthetic */ SearchRecommendGroupRequest(String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : num);
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }
}
