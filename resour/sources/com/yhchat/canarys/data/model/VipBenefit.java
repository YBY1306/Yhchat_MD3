package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Vip.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001f"}, m169d2 = {"Lcom/yhchat/canarys/data/model/VipBenefit;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "description", "target", "sort", "", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getDescription", "getTarget", "getSort", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VipBenefit {
    public static final int $stable = 0;

    @SerializedName("description")
    private final String description;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("sort")
    private final int sort;

    @SerializedName("target")
    private final String target;

    public static /* synthetic */ VipBenefit copy$default(VipBenefit vipBenefit, long j, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = vipBenefit.id;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = vipBenefit.name;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = vipBenefit.description;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = vipBenefit.target;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            i = vipBenefit.sort;
        }
        return vipBenefit.copy(j2, str4, str5, str6, i);
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
    public final String getTarget() {
        return this.target;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    public final VipBenefit copy(long id, String name, String description, String target, int sort) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(target, "target");
        return new VipBenefit(id, name, description, target, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipBenefit)) {
            return false;
        }
        VipBenefit vipBenefit = (VipBenefit) other;
        return this.id == vipBenefit.id && Intrinsics.areEqual(this.name, vipBenefit.name) && Intrinsics.areEqual(this.description, vipBenefit.description) && Intrinsics.areEqual(this.target, vipBenefit.target) && this.sort == vipBenefit.sort;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.description.hashCode()) * 31) + this.target.hashCode()) * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "VipBenefit(id=" + this.id + ", name=" + this.name + ", description=" + this.description + ", target=" + this.target + ", sort=" + this.sort + ")";
    }

    public VipBenefit(long id, String name, String description, String target, int sort) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(target, "target");
        this.id = id;
        this.name = name;
        this.description = description;
        this.target = target;
        this.sort = sort;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ VipBenefit(long j, String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        String str4;
        int i3;
        if ((i2 & 8) == 0) {
            str4 = str3;
        } else {
            str4 = "";
        }
        if ((i2 & 16) == 0) {
            i3 = i;
        } else {
            i3 = 0;
        }
        this(j, str, str2, str4, i3);
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

    public final String getTarget() {
        return this.target;
    }

    public final int getSort() {
        return this.sort;
    }
}
