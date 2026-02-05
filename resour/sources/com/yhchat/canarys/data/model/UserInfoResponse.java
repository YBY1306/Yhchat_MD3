package com.yhchat.canarys.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\rJ\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0003J:\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0007H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/data/model/UserInfoResponse;", "", "number", "", "code", "", "message", "", "data", "Lcom/yhchat/canarys/data/model/UserProfile;", "<init>", "(Ljava/lang/Long;ILjava/lang/String;Lcom/yhchat/canarys/data/model/UserProfile;)V", "getNumber", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCode", "()I", "getMessage", "()Ljava/lang/String;", "getData", "()Lcom/yhchat/canarys/data/model/UserProfile;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Long;ILjava/lang/String;Lcom/yhchat/canarys/data/model/UserProfile;)Lcom/yhchat/canarys/data/model/UserInfoResponse;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserInfoResponse {
    public static final int $stable = 8;

    @SerializedName("code")
    private final int code;

    @SerializedName("data")
    private final UserProfile data;

    @SerializedName(NotificationCompat.CATEGORY_MESSAGE)
    private final String message;

    @SerializedName("number")
    private final Long number;

    public static /* synthetic */ UserInfoResponse copy$default(UserInfoResponse userInfoResponse, Long l, int i, String str, UserProfile userProfile, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            l = userInfoResponse.number;
        }
        if ((i2 & 2) != 0) {
            i = userInfoResponse.code;
        }
        if ((i2 & 4) != 0) {
            str = userInfoResponse.message;
        }
        if ((i2 & 8) != 0) {
            userProfile = userInfoResponse.data;
        }
        return userInfoResponse.copy(l, i, str, userProfile);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getNumber() {
        return this.number;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component4, reason: from getter */
    public final UserProfile getData() {
        return this.data;
    }

    public final UserInfoResponse copy(Long number, int code, String message, UserProfile data) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new UserInfoResponse(number, code, message, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserInfoResponse)) {
            return false;
        }
        UserInfoResponse userInfoResponse = (UserInfoResponse) other;
        return Intrinsics.areEqual(this.number, userInfoResponse.number) && this.code == userInfoResponse.code && Intrinsics.areEqual(this.message, userInfoResponse.message) && Intrinsics.areEqual(this.data, userInfoResponse.data);
    }

    public int hashCode() {
        return ((((((this.number == null ? 0 : this.number.hashCode()) * 31) + Integer.hashCode(this.code)) * 31) + this.message.hashCode()) * 31) + (this.data != null ? this.data.hashCode() : 0);
    }

    public String toString() {
        return "UserInfoResponse(number=" + this.number + ", code=" + this.code + ", message=" + this.message + ", data=" + this.data + ")";
    }

    public UserInfoResponse(Long number, int code, String message, UserProfile data) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.number = number;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public /* synthetic */ UserInfoResponse(Long l, int i, String str, UserProfile userProfile, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : l, i, str, (i2 & 8) != 0 ? null : userProfile);
    }

    public final Long getNumber() {
        return this.number;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final UserProfile getData() {
        return this.data;
    }
}
