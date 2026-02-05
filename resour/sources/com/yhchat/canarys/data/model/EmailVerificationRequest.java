package com.yhchat.canarys.data.model;

import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/model/EmailVerificationRequest;", "", NotificationCompat.CATEGORY_EMAIL, "", "code", Name.MARK, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEmail", "()Ljava/lang/String;", "getCode", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class EmailVerificationRequest {
    public static final int $stable = 0;

    @SerializedName("code")
    private final String code;

    @SerializedName(NotificationCompat.CATEGORY_EMAIL)
    private final String email;

    @SerializedName(Name.MARK)
    private final String id;

    public static /* synthetic */ EmailVerificationRequest copy$default(EmailVerificationRequest emailVerificationRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailVerificationRequest.email;
        }
        if ((i & 2) != 0) {
            str2 = emailVerificationRequest.code;
        }
        if ((i & 4) != 0) {
            str3 = emailVerificationRequest.id;
        }
        return emailVerificationRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final EmailVerificationRequest copy(String email, String code, String id) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(id, "id");
        return new EmailVerificationRequest(email, code, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmailVerificationRequest)) {
            return false;
        }
        EmailVerificationRequest emailVerificationRequest = (EmailVerificationRequest) other;
        return Intrinsics.areEqual(this.email, emailVerificationRequest.email) && Intrinsics.areEqual(this.code, emailVerificationRequest.code) && Intrinsics.areEqual(this.id, emailVerificationRequest.id);
    }

    public int hashCode() {
        return (((this.email.hashCode() * 31) + this.code.hashCode()) * 31) + this.id.hashCode();
    }

    public String toString() {
        return "EmailVerificationRequest(email=" + this.email + ", code=" + this.code + ", id=" + this.id + ")";
    }

    public EmailVerificationRequest(String email, String code, String id) {
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(id, "id");
        this.email = email;
        this.code = code;
        this.id = id;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getId() {
        return this.id;
    }
}
