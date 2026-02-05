package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/api/BlackListRequest;", "", "size", "", "page", "<init>", "(II)V", "getSize", "()I", "getPage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class BlackListRequest {
    public static final int $stable = 0;

    @SerializedName("page")
    private final int page;

    @SerializedName("size")
    private final int size;

    /* JADX WARN: Illegal instructions before constructor call */
    public BlackListRequest() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ BlackListRequest copy$default(BlackListRequest blackListRequest, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = blackListRequest.size;
        }
        if ((i3 & 2) != 0) {
            i2 = blackListRequest.page;
        }
        return blackListRequest.copy(i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    public final BlackListRequest copy(int size, int page) {
        return new BlackListRequest(size, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlackListRequest)) {
            return false;
        }
        BlackListRequest blackListRequest = (BlackListRequest) other;
        return this.size == blackListRequest.size && this.page == blackListRequest.page;
    }

    public int hashCode() {
        return (Integer.hashCode(this.size) * 31) + Integer.hashCode(this.page);
    }

    public String toString() {
        return "BlackListRequest(size=" + this.size + ", page=" + this.page + ")";
    }

    public BlackListRequest(int size, int page) {
        this.size = size;
        this.page = page;
    }

    public /* synthetic */ BlackListRequest(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 20 : i, (i3 & 2) != 0 ? 1 : i2);
    }

    public final int getSize() {
        return this.size;
    }

    public final int getPage() {
        return this.page;
    }
}
