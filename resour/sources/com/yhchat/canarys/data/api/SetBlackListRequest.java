package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/api/SetBlackListRequest;", "", "isAdd", "", "authorId", "", "<init>", "(ILjava/lang/String;)V", "()I", "getAuthorId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SetBlackListRequest {
    public static final int $stable = 0;

    @SerializedName("authorId")
    private final String authorId;

    @SerializedName("isAdd")
    private final int isAdd;

    public static /* synthetic */ SetBlackListRequest copy$default(SetBlackListRequest setBlackListRequest, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = setBlackListRequest.isAdd;
        }
        if ((i2 & 2) != 0) {
            str = setBlackListRequest.authorId;
        }
        return setBlackListRequest.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIsAdd() {
        return this.isAdd;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    public final SetBlackListRequest copy(int isAdd, String authorId) {
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        return new SetBlackListRequest(isAdd, authorId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetBlackListRequest)) {
            return false;
        }
        SetBlackListRequest setBlackListRequest = (SetBlackListRequest) other;
        return this.isAdd == setBlackListRequest.isAdd && Intrinsics.areEqual(this.authorId, setBlackListRequest.authorId);
    }

    public int hashCode() {
        return (Integer.hashCode(this.isAdd) * 31) + this.authorId.hashCode();
    }

    public String toString() {
        return "SetBlackListRequest(isAdd=" + this.isAdd + ", authorId=" + this.authorId + ")";
    }

    public SetBlackListRequest(int isAdd, String authorId) {
        Intrinsics.checkNotNullParameter(authorId, "authorId");
        this.isAdd = isAdd;
        this.authorId = authorId;
    }

    public final int isAdd() {
        return this.isAdd;
    }

    public final String getAuthorId() {
        return this.authorId;
    }
}
