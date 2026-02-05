package com.yhchat.canarys.p007ui.coin;

import com.yhchat.canarys.data.model.Product;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductDetailActivity.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003JK\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/ui/coin/ProductDetailUiState;", "", "isLoading", "", "product", "Lcom/yhchat/canarys/data/model/Product;", "error", "", "isPurchasing", "purchaseSuccess", "purchaseError", "<init>", "(ZLcom/yhchat/canarys/data/model/Product;Ljava/lang/String;ZZLjava/lang/String;)V", "()Z", "getProduct", "()Lcom/yhchat/canarys/data/model/Product;", "getError", "()Ljava/lang/String;", "getPurchaseSuccess", "getPurchaseError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ProductDetailUiState {
    public static final int $stable = 0;
    private final String error;
    private final boolean isLoading;
    private final boolean isPurchasing;
    private final Product product;
    private final String purchaseError;
    private final boolean purchaseSuccess;

    public ProductDetailUiState() {
        this(false, null, null, false, false, null, 63, null);
    }

    public static /* synthetic */ ProductDetailUiState copy$default(ProductDetailUiState productDetailUiState, boolean z, Product product, String str, boolean z2, boolean z3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = productDetailUiState.isLoading;
        }
        if ((i & 2) != 0) {
            product = productDetailUiState.product;
        }
        if ((i & 4) != 0) {
            str = productDetailUiState.error;
        }
        if ((i & 8) != 0) {
            z2 = productDetailUiState.isPurchasing;
        }
        if ((i & 16) != 0) {
            z3 = productDetailUiState.purchaseSuccess;
        }
        if ((i & 32) != 0) {
            str2 = productDetailUiState.purchaseError;
        }
        boolean z4 = z3;
        String str3 = str2;
        return productDetailUiState.copy(z, product, str, z2, z4, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final Product getProduct() {
        return this.product;
    }

    /* renamed from: component3, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsPurchasing() {
        return this.isPurchasing;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPurchaseSuccess() {
        return this.purchaseSuccess;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPurchaseError() {
        return this.purchaseError;
    }

    public final ProductDetailUiState copy(boolean isLoading, Product product, String error, boolean isPurchasing, boolean purchaseSuccess, String purchaseError) {
        return new ProductDetailUiState(isLoading, product, error, isPurchasing, purchaseSuccess, purchaseError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductDetailUiState)) {
            return false;
        }
        ProductDetailUiState productDetailUiState = (ProductDetailUiState) other;
        return this.isLoading == productDetailUiState.isLoading && Intrinsics.areEqual(this.product, productDetailUiState.product) && Intrinsics.areEqual(this.error, productDetailUiState.error) && this.isPurchasing == productDetailUiState.isPurchasing && this.purchaseSuccess == productDetailUiState.purchaseSuccess && Intrinsics.areEqual(this.purchaseError, productDetailUiState.purchaseError);
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.isLoading) * 31) + (this.product == null ? 0 : this.product.hashCode())) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + Boolean.hashCode(this.isPurchasing)) * 31) + Boolean.hashCode(this.purchaseSuccess)) * 31) + (this.purchaseError != null ? this.purchaseError.hashCode() : 0);
    }

    public String toString() {
        return "ProductDetailUiState(isLoading=" + this.isLoading + ", product=" + this.product + ", error=" + this.error + ", isPurchasing=" + this.isPurchasing + ", purchaseSuccess=" + this.purchaseSuccess + ", purchaseError=" + this.purchaseError + ")";
    }

    public ProductDetailUiState(boolean isLoading, Product product, String error, boolean isPurchasing, boolean purchaseSuccess, String purchaseError) {
        this.isLoading = isLoading;
        this.product = product;
        this.error = error;
        this.isPurchasing = isPurchasing;
        this.purchaseSuccess = purchaseSuccess;
        this.purchaseError = purchaseError;
    }

    public /* synthetic */ ProductDetailUiState(boolean z, Product product, String str, boolean z2, boolean z3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : product, (i & 4) != 0 ? null : str, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final Product getProduct() {
        return this.product;
    }

    public final String getError() {
        return this.error;
    }

    public final boolean isPurchasing() {
        return this.isPurchasing;
    }

    public final boolean getPurchaseSuccess() {
        return this.purchaseSuccess;
    }

    public final String getPurchaseError() {
        return this.purchaseError;
    }
}
