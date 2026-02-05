package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/data/api/SearchRequest;", "", "typ", "", "keyword", "", "size", "page", "<init>", "(ILjava/lang/String;II)V", "getTyp", "()I", "getKeyword", "()Ljava/lang/String;", "getSize", "getPage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SearchRequest {
    public static final int $stable = 0;

    @SerializedName("keyword")
    private final String keyword;

    @SerializedName("page")
    private final int page;

    @SerializedName("size")
    private final int size;

    @SerializedName("typ")
    private final int typ;

    public static /* synthetic */ SearchRequest copy$default(SearchRequest searchRequest, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = searchRequest.typ;
        }
        if ((i4 & 2) != 0) {
            str = searchRequest.keyword;
        }
        if ((i4 & 4) != 0) {
            i2 = searchRequest.size;
        }
        if ((i4 & 8) != 0) {
            i3 = searchRequest.page;
        }
        return searchRequest.copy(i, str, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTyp() {
        return this.typ;
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

    public final SearchRequest copy(int typ, String keyword, int size, int page) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        return new SearchRequest(typ, keyword, size, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchRequest)) {
            return false;
        }
        SearchRequest searchRequest = (SearchRequest) other;
        return this.typ == searchRequest.typ && Intrinsics.areEqual(this.keyword, searchRequest.keyword) && this.size == searchRequest.size && this.page == searchRequest.page;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.typ) * 31) + this.keyword.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.page);
    }

    public String toString() {
        return "SearchRequest(typ=" + this.typ + ", keyword=" + this.keyword + ", size=" + this.size + ", page=" + this.page + ")";
    }

    public SearchRequest(int typ, String keyword, int size, int page) {
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        this.typ = typ;
        this.keyword = keyword;
        this.size = size;
        this.page = page;
    }

    public /* synthetic */ SearchRequest(int i, String str, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 3 : i, str, (i4 & 4) != 0 ? 50 : i2, (i4 & 8) != 0 ? 1 : i3);
    }

    public final int getTyp() {
        return this.typ;
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
