package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/data/api/BaFollowerListRequest;", "", Name.MARK, "", "size", "page", "memberName", "", "<init>", "(IIILjava/lang/String;)V", "getId", "()I", "getSize", "getPage", "getMemberName", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BaFollowerListRequest {
    public static final int $stable = 0;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("memberName")
    private final String memberName;

    @SerializedName("page")
    private final int page;

    @SerializedName("size")
    private final int size;

    public static /* synthetic */ BaFollowerListRequest copy$default(BaFollowerListRequest baFollowerListRequest, int i, int i2, int i3, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = baFollowerListRequest.id;
        }
        if ((i4 & 2) != 0) {
            i2 = baFollowerListRequest.size;
        }
        if ((i4 & 4) != 0) {
            i3 = baFollowerListRequest.page;
        }
        if ((i4 & 8) != 0) {
            str = baFollowerListRequest.memberName;
        }
        return baFollowerListRequest.copy(i, i2, i3, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component3, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMemberName() {
        return this.memberName;
    }

    public final BaFollowerListRequest copy(int id, int size, int page, String memberName) {
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        return new BaFollowerListRequest(id, size, page, memberName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaFollowerListRequest)) {
            return false;
        }
        BaFollowerListRequest baFollowerListRequest = (BaFollowerListRequest) other;
        return this.id == baFollowerListRequest.id && this.size == baFollowerListRequest.size && this.page == baFollowerListRequest.page && Intrinsics.areEqual(this.memberName, baFollowerListRequest.memberName);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.page)) * 31) + this.memberName.hashCode();
    }

    public String toString() {
        return "BaFollowerListRequest(id=" + this.id + ", size=" + this.size + ", page=" + this.page + ", memberName=" + this.memberName + ")";
    }

    public BaFollowerListRequest(int id, int size, int page, String memberName) {
        Intrinsics.checkNotNullParameter(memberName, "memberName");
        this.id = id;
        this.size = size;
        this.page = page;
        this.memberName = memberName;
    }

    public /* synthetic */ BaFollowerListRequest(int i, int i2, int i3, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i4 & 2) != 0 ? 20 : i2, (i4 & 4) != 0 ? 1 : i3, (i4 & 8) != 0 ? "" : str);
    }

    public final int getId() {
        return this.id;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getPage() {
        return this.page;
    }

    public final String getMemberName() {
        return this.memberName;
    }
}
