package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ChangePasswordRequest;", "", NotificationCompat.CATEGORY_EMAIL, "", "captcha", HintConstants.AUTOFILL_HINT_PASSWORD, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getCaptcha", "getPassword", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ChangePasswordRequest {
    public static final int $stable = 0;

    @SerializedName("captcha")
    private final String captcha;

    @SerializedName(NotificationCompat.CATEGORY_EMAIL)
    private final String email;

    @SerializedName(HintConstants.AUTOFILL_HINT_PASSWORD)
    private final String password;

    public static /* synthetic */ ChangePasswordRequest copy$default(ChangePasswordRequest changePasswordRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = changePasswordRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = changePasswordRequest.captcha;
        }
        if ((i & 4) != 0) {
            str3 = changePasswordRequest.password;
        }
        return changePasswordRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCaptcha() {
        return this.captcha;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    public final ChangePasswordRequest copy(String email, String captcha, String password) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(captcha, "captcha");
        Intrinsics.checkNotNullParameter(password, "password");
        return new ChangePasswordRequest(email, captcha, password);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangePasswordRequest)) {
            return false;
        }
        ChangePasswordRequest changePasswordRequest = (ChangePasswordRequest) other;
        return Intrinsics.areEqual(this.email, changePasswordRequest.email) && Intrinsics.areEqual(this.captcha, changePasswordRequest.captcha) && Intrinsics.areEqual(this.password, changePasswordRequest.password);
    }

    public int hashCode() {
        return (((this.email.hashCode() * 31) + this.captcha.hashCode()) * 31) + this.password.hashCode();
    }

    public String toString() {
        return "ChangePasswordRequest(email=" + this.email + ", captcha=" + this.captcha + ", password=" + this.password + ")";
    }

    public ChangePasswordRequest(String email, String captcha, String password) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(captcha, "captcha");
        Intrinsics.checkNotNullParameter(password, "password");
        this.email = email;
        this.captcha = captcha;
        this.password = password;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getCaptcha() {
        return this.captcha;
    }

    public final String getPassword() {
        return this.password;
    }
}
