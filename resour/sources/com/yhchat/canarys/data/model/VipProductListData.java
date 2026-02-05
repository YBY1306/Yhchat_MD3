package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Vip.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0006H\u00d6\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/model/VipProductListData;", "", "list", "", "Lcom/yhchat/canarys/data/model/VipProduct;", "qrCodeUrl", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getList", "()Ljava/util/List;", "getQrCodeUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VipProductListData {
    public static final int $stable = 8;

    @SerializedName("list")
    private final List<VipProduct> list;

    @SerializedName("qrCodeUrl")
    private final String qrCodeUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VipProductListData copy$default(VipProductListData vipProductListData, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = vipProductListData.list;
        }
        if ((i & 2) != 0) {
            str = vipProductListData.qrCodeUrl;
        }
        return vipProductListData.copy(list, str);
    }

    public final List<VipProduct> component1() {
        return this.list;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public final VipProductListData copy(List<VipProduct> list, String qrCodeUrl) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(qrCodeUrl, "qrCodeUrl");
        return new VipProductListData(list, qrCodeUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipProductListData)) {
            return false;
        }
        VipProductListData vipProductListData = (VipProductListData) other;
        return Intrinsics.areEqual(this.list, vipProductListData.list) && Intrinsics.areEqual(this.qrCodeUrl, vipProductListData.qrCodeUrl);
    }

    public int hashCode() {
        return (this.list.hashCode() * 31) + this.qrCodeUrl.hashCode();
    }

    public String toString() {
        return "VipProductListData(list=" + this.list + ", qrCodeUrl=" + this.qrCodeUrl + ")";
    }

    public VipProductListData(List<VipProduct> list, String qrCodeUrl) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(qrCodeUrl, "qrCodeUrl");
        this.list = list;
        this.qrCodeUrl = qrCodeUrl;
    }

    public final List<VipProduct> getList() {
        return this.list;
    }

    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }
}
