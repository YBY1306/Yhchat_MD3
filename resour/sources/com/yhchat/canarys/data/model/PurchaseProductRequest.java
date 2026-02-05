package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* compiled from: Coin.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/model/PurchaseProductRequest;", "", "productId", "", "price", "<init>", "(II)V", "getProductId", "()I", "getPrice", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class PurchaseProductRequest {
    public static final int $stable = 0;

    @SerializedName("price")
    private final int price;

    @SerializedName("productId")
    private final int productId;

    public static /* synthetic */ PurchaseProductRequest copy$default(PurchaseProductRequest purchaseProductRequest, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = purchaseProductRequest.productId;
        }
        if ((i3 & 2) != 0) {
            i2 = purchaseProductRequest.price;
        }
        return purchaseProductRequest.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    public final PurchaseProductRequest copy(int productId, int price) {
        return new PurchaseProductRequest(productId, price);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PurchaseProductRequest)) {
            return false;
        }
        PurchaseProductRequest purchaseProductRequest = (PurchaseProductRequest) other;
        return this.productId == purchaseProductRequest.productId && this.price == purchaseProductRequest.price;
    }

    public int hashCode() {
        return (Integer.hashCode(this.productId) * 31) + Integer.hashCode(this.price);
    }

    public String toString() {
        return "PurchaseProductRequest(productId=" + this.productId + ", price=" + this.price + ")";
    }

    public PurchaseProductRequest(int productId, int price) {
        this.productId = productId;
        this.price = price;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final int getPrice() {
        return this.price;
    }
}
