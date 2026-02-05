package com.yhchat.canarys.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/model/InstructionListResponse;", "", "code", "", "data", "Lcom/yhchat/canarys/data/model/InstructionListData;", NotificationCompat.CATEGORY_MESSAGE, "", "<init>", "(ILcom/yhchat/canarys/data/model/InstructionListData;Ljava/lang/String;)V", "getCode", "()I", "getData", "()Lcom/yhchat/canarys/data/model/InstructionListData;", "getMsg", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class InstructionListResponse {
    public static final int $stable = 8;

    @SerializedName("code")
    private final int code;

    @SerializedName("data")
    private final InstructionListData data;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    private final String msg;

    public static /* synthetic */ InstructionListResponse copy$default(InstructionListResponse instructionListResponse, int i, InstructionListData instructionListData, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = instructionListResponse.code;
        }
        if ((i2 & 2) != 0) {
            instructionListData = instructionListResponse.data;
        }
        if ((i2 & 4) != 0) {
            str = instructionListResponse.msg;
        }
        return instructionListResponse.copy(i, instructionListData, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final InstructionListData getData() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    public final InstructionListResponse copy(int code, InstructionListData data, String msg) {
        return new InstructionListResponse(code, data, msg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstructionListResponse)) {
            return false;
        }
        InstructionListResponse instructionListResponse = (InstructionListResponse) other;
        return this.code == instructionListResponse.code && Intrinsics.areEqual(this.data, instructionListResponse.data) && Intrinsics.areEqual(this.msg, instructionListResponse.msg);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + (this.data == null ? 0 : this.data.hashCode())) * 31) + (this.msg != null ? this.msg.hashCode() : 0);
    }

    public String toString() {
        return "InstructionListResponse(code=" + this.code + ", data=" + this.data + ", msg=" + this.msg + ")";
    }

    public InstructionListResponse(int code, InstructionListData data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    public final int getCode() {
        return this.code;
    }

    public final InstructionListData getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }
}
