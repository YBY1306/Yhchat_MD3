package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Vip.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u000bH\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020\u000bH\u00d6\u0001J\t\u0010&\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012\u00a8\u0006'"}, m169d2 = {"Lcom/yhchat/canarys/data/model/VipProduct;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "description", "price", "", "priceOriginal", "day", "", "productId", "<init>", "(JLjava/lang/String;Ljava/lang/String;DDILjava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getDescription", "getPrice", "()D", "getPriceOriginal", "getDay", "()I", "getProductId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VipProduct {
    public static final int $stable = 0;

    @SerializedName("day")
    private final int day;

    @SerializedName("description")
    private final String description;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("price")
    private final double price;

    @SerializedName("priceOriginal")
    private final double priceOriginal;

    @SerializedName("productId")
    private final String productId;

    public static /* synthetic */ VipProduct copy$default(VipProduct vipProduct, long j, String str, String str2, double d, double d2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = vipProduct.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = vipProduct.name;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = vipProduct.description;
        }
        return vipProduct.copy(j2, str4, str2, (i2 & 8) != 0 ? vipProduct.price : d, (i2 & 16) != 0 ? vipProduct.priceOriginal : d2, (i2 & 32) != 0 ? vipProduct.day : i, (i2 & 64) != 0 ? vipProduct.productId : str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final double getPrice() {
        return this.price;
    }

    /* renamed from: component5, reason: from getter */
    public final double getPriceOriginal() {
        return this.priceOriginal;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDay() {
        return this.day;
    }

    /* renamed from: component7, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    public final VipProduct copy(long id, String name, String description, double price, double priceOriginal, int day, String productId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(productId, "productId");
        return new VipProduct(id, name, description, price, priceOriginal, day, productId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipProduct)) {
            return false;
        }
        VipProduct vipProduct = (VipProduct) other;
        return this.id == vipProduct.id && Intrinsics.areEqual(this.name, vipProduct.name) && Intrinsics.areEqual(this.description, vipProduct.description) && Double.compare(this.price, vipProduct.price) == 0 && Double.compare(this.priceOriginal, vipProduct.priceOriginal) == 0 && this.day == vipProduct.day && Intrinsics.areEqual(this.productId, vipProduct.productId);
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + Double.hashCode(this.price)) * 31) + Double.hashCode(this.priceOriginal)) * 31) + Integer.hashCode(this.day)) * 31) + this.productId.hashCode();
    }

    public String toString() {
        return "VipProduct(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", price=" + this.price + ", priceOriginal=" + this.priceOriginal + ", day=" + this.day + ", productId=" + this.productId + ")";
    }

    public VipProduct(long id, String name, String description, double price, double priceOriginal, int day, String productId) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(productId, "productId");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.priceOriginal = priceOriginal;
        this.day = day;
        this.productId = productId;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VipProduct(long j, String str, String str2, double d, double d2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        if ((i2 & 64) == 0) {
            str4 = str3;
        } else {
            str4 = "";
        }
        this(j, str, str2, d, d2, i, str4);
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDescription() {
        return this.description;
    }

    public final double getPrice() {
        return this.price;
    }

    public final double getPriceOriginal() {
        return this.priceOriginal;
    }

    public final int getDay() {
        return this.day;
    }

    public final String getProductId() {
        return this.productId;
    }
}
