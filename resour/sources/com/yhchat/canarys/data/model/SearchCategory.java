package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J%\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/model/SearchCategory;", "", "title", "", "list", "", "Lcom/yhchat/canarys/data/model/SearchItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SearchCategory {
    public static final int $stable = 8;

    @SerializedName("list")
    private final List<SearchItem> list;

    @SerializedName("title")
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchCategory copy$default(SearchCategory searchCategory, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchCategory.title;
        }
        if ((i & 2) != 0) {
            list = searchCategory.list;
        }
        return searchCategory.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<SearchItem> component2() {
        return this.list;
    }

    public final SearchCategory copy(String title, List<SearchItem> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new SearchCategory(title, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchCategory)) {
            return false;
        }
        SearchCategory searchCategory = (SearchCategory) other;
        return Intrinsics.areEqual(this.title, searchCategory.title) && Intrinsics.areEqual(this.list, searchCategory.list);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + (this.list == null ? 0 : this.list.hashCode());
    }

    public String toString() {
        return "SearchCategory(title=" + this.title + ", list=" + this.list + ")";
    }

    public SearchCategory(String title, List<SearchItem> list) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.list = list;
    }

    public /* synthetic */ SearchCategory(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list);
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<SearchItem> getList() {
        return this.list;
    }
}
