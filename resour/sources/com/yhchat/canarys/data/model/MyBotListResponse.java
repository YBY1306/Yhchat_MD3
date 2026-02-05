package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MyBotListResponse;", "", "code", "", "data", "Lcom/yhchat/canarys/data/model/MyBotListData;", "message", "", "<init>", "(ILcom/yhchat/canarys/data/model/MyBotListData;Ljava/lang/String;)V", "getCode", "()I", "getData", "()Lcom/yhchat/canarys/data/model/MyBotListData;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MyBotListResponse {
    public static final int $stable = 8;

    @SerializedName("code")
    private final int code;

    @SerializedName("data")
    private final MyBotListData data;

    @SerializedName("message")
    private final String message;

    public static /* synthetic */ MyBotListResponse copy$default(MyBotListResponse myBotListResponse, int i, MyBotListData myBotListData, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = myBotListResponse.code;
        }
        if ((i2 & 2) != 0) {
            myBotListData = myBotListResponse.data;
        }
        if ((i2 & 4) != 0) {
            str = myBotListResponse.message;
        }
        return myBotListResponse.copy(i, myBotListData, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final MyBotListData getData() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final MyBotListResponse copy(int code, MyBotListData data, String message) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new MyBotListResponse(code, data, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyBotListResponse)) {
            return false;
        }
        MyBotListResponse myBotListResponse = (MyBotListResponse) other;
        return this.code == myBotListResponse.code && Intrinsics.areEqual(this.data, myBotListResponse.data) && Intrinsics.areEqual(this.message, myBotListResponse.message);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.data.hashCode()) * 31) + (this.message == null ? 0 : this.message.hashCode());
    }

    public String toString() {
        return "MyBotListResponse(code=" + this.code + ", data=" + this.data + ", message=" + this.message + ")";
    }

    public MyBotListResponse(int code, MyBotListData data, String message) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.code = code;
        this.data = data;
        this.message = message;
    }

    public final int getCode() {
        return this.code;
    }

    public final MyBotListData getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }
}
