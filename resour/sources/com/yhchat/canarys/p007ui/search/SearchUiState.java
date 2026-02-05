package com.yhchat.canarys.p007ui.search;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchViewModel.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/ui/search/SearchUiState;", "", "isLoading", "", "error", "", "<init>", "(ZLjava/lang/String;)V", "()Z", "getError", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SearchUiState {
    public static final int $stable = 0;
    private final String error;
    private final boolean isLoading;

    public SearchUiState() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SearchUiState copy$default(SearchUiState searchUiState, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchUiState.isLoading;
        }
        if ((i & 2) != 0) {
            str = searchUiState.error;
        }
        return searchUiState.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final SearchUiState copy(boolean isLoading, String error) {
        return new SearchUiState(isLoading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchUiState)) {
            return false;
        }
        SearchUiState searchUiState = (SearchUiState) other;
        return this.isLoading == searchUiState.isLoading && Intrinsics.areEqual(this.error, searchUiState.error);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "SearchUiState(isLoading=" + this.isLoading + ", error=" + this.error + ")";
    }

    public SearchUiState(boolean isLoading, String error) {
        this.isLoading = isLoading;
        this.error = error;
    }

    public /* synthetic */ SearchUiState(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }
}
