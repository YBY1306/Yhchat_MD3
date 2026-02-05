package com.yhchat.canarys.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J)\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/data/model/SendMessageResponse;", "", "code", "", NotificationCompat.CATEGORY_MESSAGE, "", "data", "<init>", "(ILjava/lang/String;Ljava/lang/Object;)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "getData", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SendMessageResponse {
    public static final int $stable = 8;

    @SerializedName("code")
    private final int code;

    @SerializedName("data")
    private final Object data;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    private final String msg;

    public static /* synthetic */ SendMessageResponse copy$default(SendMessageResponse sendMessageResponse, int i, String str, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = sendMessageResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = sendMessageResponse.msg;
        }
        if ((i2 & 4) != 0) {
            obj = sendMessageResponse.data;
        }
        return sendMessageResponse.copy(i, str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    public final SendMessageResponse copy(int code, String msg, Object data) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new SendMessageResponse(code, msg, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMessageResponse)) {
            return false;
        }
        SendMessageResponse sendMessageResponse = (SendMessageResponse) other;
        return this.code == sendMessageResponse.code && Intrinsics.areEqual(this.msg, sendMessageResponse.msg) && Intrinsics.areEqual(this.data, sendMessageResponse.data);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.msg.hashCode()) * 31) + (this.data == null ? 0 : this.data.hashCode());
    }

    public String toString() {
        return "SendMessageResponse(code=" + this.code + ", msg=" + this.msg + ", data=" + this.data + ")";
    }

    public SendMessageResponse(int code, String msg, Object data) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Object getData() {
        return this.data;
    }
}
