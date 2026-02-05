package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003JM\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001f"}, m169d2 = {"Lcom/yhchat/canarys/data/model/LoginRequest;", "", "mobile", "", "captcha", NotificationCompat.CATEGORY_EMAIL, HintConstants.AUTOFILL_HINT_PASSWORD, "deviceId", "platform", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMobile", "()Ljava/lang/String;", "getCaptcha", "getEmail", "getPassword", "getDeviceId", "getPlatform", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class LoginRequest {
    public static final int $stable = 0;

    @SerializedName("captcha")
    private final String captcha;

    @SerializedName("deviceId")
    private final String deviceId;

    @SerializedName(NotificationCompat.CATEGORY_EMAIL)
    private final String email;

    @SerializedName("mobile")
    private final String mobile;

    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    private final String password;

    @SerializedName("platform")
    private final String platform;

    public static /* synthetic */ LoginRequest copy$default(LoginRequest loginRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = loginRequest.mobile;
        }
        if ((i & 2) != 0) {
            str2 = loginRequest.captcha;
        }
        if ((i & 4) != 0) {
            str3 = loginRequest.email;
        }
        if ((i & 8) != 0) {
            str4 = loginRequest.password;
        }
        if ((i & 16) != 0) {
            str5 = loginRequest.deviceId;
        }
        if ((i & 32) != 0) {
            str6 = loginRequest.platform;
        }
        String str7 = str5;
        String str8 = str6;
        return loginRequest.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMobile() {
        return this.mobile;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCaptcha() {
        return this.captcha;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    public final LoginRequest copy(String mobile, String captcha, String email, String password, String deviceId, String platform) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        return new LoginRequest(mobile, captcha, email, password, deviceId, platform);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoginRequest)) {
            return false;
        }
        LoginRequest loginRequest = (LoginRequest) other;
        return Intrinsics.areEqual(this.mobile, loginRequest.mobile) && Intrinsics.areEqual(this.captcha, loginRequest.captcha) && Intrinsics.areEqual(this.email, loginRequest.email) && Intrinsics.areEqual(this.password, loginRequest.password) && Intrinsics.areEqual(this.deviceId, loginRequest.deviceId) && Intrinsics.areEqual(this.platform, loginRequest.platform);
    }

    public int hashCode() {
        return ((((((((((this.mobile == null ? 0 : this.mobile.hashCode()) * 31) + (this.captcha == null ? 0 : this.captcha.hashCode())) * 31) + (this.email == null ? 0 : this.email.hashCode())) * 31) + (this.password != null ? this.password.hashCode() : 0)) * 31) + this.deviceId.hashCode()) * 31) + this.platform.hashCode();
    }

    public String toString() {
        return "LoginRequest(mobile=" + this.mobile + ", captcha=" + this.captcha + ", email=" + this.email + ", password=" + this.password + ", deviceId=" + this.deviceId + ", platform=" + this.platform + ")";
    }

    public LoginRequest(String mobile, String captcha, String email, String password, String deviceId, String platform) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.mobile = mobile;
        this.captcha = captcha;
        this.email = email;
        this.password = password;
        this.deviceId = deviceId;
        this.platform = platform;
    }

    public /* synthetic */ LoginRequest(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5, (i & 32) != 0 ? "android" : str6);
    }

    public final String getMobile() {
        return this.mobile;
    }

    public final String getCaptcha() {
        return this.captcha;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getPlatform() {
        return this.platform;
    }
}
