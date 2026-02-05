package com.yhchat.canarys.p007ui.coin;

import com.yhchat.canarys.data.model.Product;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CoinShopActivity.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u00c6\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/ui/coin/CoinShopUiState;", "", "isLoading", "", "products", "", "Lcom/yhchat/canarys/data/model/Product;", "error", "", "<init>", "(ZLjava/util/List;Ljava/lang/String;)V", "()Z", "getProducts", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CoinShopUiState {
    public static final int $stable = 8;
    private final String error;
    private final boolean isLoading;
    private final List<Product> products;

    public CoinShopUiState() {
        this(false, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CoinShopUiState copy$default(CoinShopUiState coinShopUiState, boolean z, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = coinShopUiState.isLoading;
        }
        if ((i & 2) != 0) {
            list = coinShopUiState.products;
        }
        if ((i & 4) != 0) {
            str = coinShopUiState.error;
        }
        return coinShopUiState.copy(z, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<Product> component2() {
        return this.products;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final CoinShopUiState copy(boolean isLoading, List<Product> products, String error) {
        Intrinsics.checkNotNullParameter(products, "products");
        return new CoinShopUiState(isLoading, products, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CoinShopUiState)) {
            return false;
        }
        CoinShopUiState coinShopUiState = (CoinShopUiState) other;
        return this.isLoading == coinShopUiState.isLoading && Intrinsics.areEqual(this.products, coinShopUiState.products) && Intrinsics.areEqual(this.error, coinShopUiState.error);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + this.products.hashCode()) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "CoinShopUiState(isLoading=" + this.isLoading + ", products=" + this.products + ", error=" + this.error + ")";
    }

    public CoinShopUiState(boolean isLoading, List<Product> products, String error) {
        Intrinsics.checkNotNullParameter(products, "products");
        this.isLoading = isLoading;
        this.products = products;
        this.error = error;
    }

    public /* synthetic */ CoinShopUiState(boolean z, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final List<Product> getProducts() {
        return this.products;
    }

    public final String getError() {
        return this.error;
    }
}
