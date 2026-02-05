package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Coin.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0013\u0010\u0014J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0&J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003J\t\u0010*\u001a\u00020\bH\u00c6\u0003J\t\u0010+\u001a\u00020\bH\u00c6\u0003J\t\u0010,\u001a\u00020\bH\u00c6\u0003J\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\bH\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u0095\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u0003H\u00c6\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00109\u001a\u00020\u0005H\u00d6\u0001J\t\u0010:\u001a\u00020\bH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0016R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0016\u00a8\u0006;"}, m169d2 = {"Lcom/yhchat/canarys/data/model/Product;", "", Name.MARK, "", "type", "", "cycle", "info", "", HintConstants.AUTOFILL_HINT_NAME, "imageUrls", "price", "priceVip", "stock", "sale", "description", "delTime", "createTime", "lastUpdate", "<init>", "(JIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIILjava/lang/String;JJJ)V", "getId", "()J", "getType", "()I", "getCycle", "getInfo", "()Ljava/lang/String;", "getName", "getImageUrls", "getPrice", "getPriceVip", "getStock", "getSale", "getDescription", "getDelTime", "getCreateTime", "getLastUpdate", "", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Product {
    public static final int $stable = 0;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("cycle")
    private final int cycle;

    @SerializedName("delTime")
    private final long delTime;

    @SerializedName("description")
    private final String description;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("imageUrls")
    private final String imageUrls;

    @SerializedName("info")
    private final String info;

    @SerializedName("lastUpdate")
    private final long lastUpdate;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("price")
    private final int price;

    @SerializedName("priceVip")
    private final int priceVip;

    @SerializedName("sale")
    private final int sale;

    @SerializedName("stock")
    private final int stock;

    @SerializedName("type")
    private final int type;

    public static /* synthetic */ Product copy$default(Product product, long j, int i, int i2, String str, String str2, String str3, int i3, int i4, int i5, int i6, String str4, long j2, long j3, long j4, int i7, Object obj) {
        long j5;
        long j6;
        long j7 = (i7 & 1) != 0 ? product.id : j;
        int i8 = (i7 & 2) != 0 ? product.type : i;
        int i9 = (i7 & 4) != 0 ? product.cycle : i2;
        String str5 = (i7 & 8) != 0 ? product.info : str;
        String str6 = (i7 & 16) != 0 ? product.name : str2;
        String str7 = (i7 & 32) != 0 ? product.imageUrls : str3;
        int i10 = (i7 & 64) != 0 ? product.price : i3;
        int i11 = (i7 & 128) != 0 ? product.priceVip : i4;
        int i12 = (i7 & 256) != 0 ? product.stock : i5;
        int i13 = (i7 & 512) != 0 ? product.sale : i6;
        String str8 = (i7 & 1024) != 0 ? product.description : str4;
        long j8 = (i7 & 2048) != 0 ? product.delTime : j2;
        long j9 = j7;
        long j10 = (i7 & 4096) != 0 ? product.createTime : j3;
        if ((i7 & 8192) != 0) {
            j6 = j10;
            j5 = product.lastUpdate;
        } else {
            j5 = j4;
            j6 = j10;
        }
        return product.copy(j9, i8, i9, str5, str6, str7, i10, i11, i12, i13, str8, j8, j6, j5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSale() {
        return this.sale;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component12, reason: from getter */
    public final long getDelTime() {
        return this.delTime;
    }

    /* renamed from: component13, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component14, reason: from getter */
    public final long getLastUpdate() {
        return this.lastUpdate;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final int getCycle() {
        return this.cycle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* renamed from: component5, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component6, reason: from getter */
    public final String getImageUrls() {
        return this.imageUrls;
    }

    /* renamed from: component7, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPriceVip() {
        return this.priceVip;
    }

    /* renamed from: component9, reason: from getter */
    public final int getStock() {
        return this.stock;
    }

    public final Product copy(long j, int type, int cycle, String info, String str, String imageUrls, int price, int priceVip, int stock, int sale, String description, long delTime, long createTime, long lastUpdate) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(description, "description");
        return new Product(j, type, cycle, info, str, imageUrls, price, priceVip, stock, sale, description, delTime, createTime, lastUpdate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Product)) {
            return false;
        }
        Product product = (Product) other;
        return this.id == product.id && this.type == product.type && this.cycle == product.cycle && Intrinsics.areEqual(this.info, product.info) && Intrinsics.areEqual(this.name, product.name) && Intrinsics.areEqual(this.imageUrls, product.imageUrls) && this.price == product.price && this.priceVip == product.priceVip && this.stock == product.stock && this.sale == product.sale && Intrinsics.areEqual(this.description, product.description) && this.delTime == product.delTime && this.createTime == product.createTime && this.lastUpdate == product.lastUpdate;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((Long.hashCode(this.id) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.cycle)) * 31) + this.info.hashCode()) * 31) + this.name.hashCode()) * 31) + this.imageUrls.hashCode()) * 31) + Integer.hashCode(this.price)) * 31) + Integer.hashCode(this.priceVip)) * 31) + Integer.hashCode(this.stock)) * 31) + Integer.hashCode(this.sale)) * 31) + this.description.hashCode()) * 31) + Long.hashCode(this.delTime)) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.lastUpdate);
    }

    public String toString() {
        return "Product(id=" + this.id + ", type=" + this.type + ", cycle=" + this.cycle + ", info=" + this.info + ", name=" + this.name + ", imageUrls=" + this.imageUrls + ", price=" + this.price + ", priceVip=" + this.priceVip + ", stock=" + this.stock + ", sale=" + this.sale + ", description=" + this.description + ", delTime=" + this.delTime + ", createTime=" + this.createTime + ", lastUpdate=" + this.lastUpdate + ")";
    }

    public Product(long id, int type, int cycle, String info, String name, String imageUrls, int price, int priceVip, int stock, int sale, String description, long delTime, long createTime, long lastUpdate) {
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(imageUrls, "imageUrls");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = id;
        this.type = type;
        this.cycle = cycle;
        this.info = info;
        this.name = name;
        this.imageUrls = imageUrls;
        this.price = price;
        this.priceVip = priceVip;
        this.stock = stock;
        this.sale = sale;
        this.description = description;
        this.delTime = delTime;
        this.createTime = createTime;
        this.lastUpdate = lastUpdate;
    }

    public /* synthetic */ Product(long j, int i, int i2, String str, String str2, String str3, int i3, int i4, int i5, int i6, String str4, long j2, long j3, long j4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, str, str2, str3, i3, i4, i5, i6, str4, (i7 & 2048) != 0 ? 0L : j2, (i7 & 4096) != 0 ? 0L : j3, (i7 & 8192) != 0 ? 0L : j4);
    }

    public final long getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    public final int getCycle() {
        return this.cycle;
    }

    public final String getInfo() {
        return this.info;
    }

    public final String getName() {
        return this.name;
    }

    public final String getImageUrls() {
        return this.imageUrls;
    }

    public final int getPrice() {
        return this.price;
    }

    public final int getPriceVip() {
        return this.priceVip;
    }

    public final int getStock() {
        return this.stock;
    }

    public final int getSale() {
        return this.sale;
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getDelTime() {
        return this.delTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getLastUpdate() {
        return this.lastUpdate;
    }

    /* renamed from: getImageUrls */
    public final List<String> m8471getImageUrls() {
        try {
            JSONArray jsonArray = new JSONArray(this.imageUrls);
            int length = jsonArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(jsonArray.getString(i));
            }
            return arrayList;
        } catch (Exception e) {
            return CollectionsKt.emptyList();
        }
    }
}
