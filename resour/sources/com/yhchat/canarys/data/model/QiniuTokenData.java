package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, m169d2 = {"Lcom/yhchat/canarys/data/model/QiniuTokenData;", "", "token", "", "<init>", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class QiniuTokenData {
    public static final int $stable = 0;

    @SerializedName("token")
    private final String token;

    public static /* synthetic */ QiniuTokenData copy$default(QiniuTokenData qiniuTokenData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = qiniuTokenData.token;
        }
        return qiniuTokenData.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    public final QiniuTokenData copy(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new QiniuTokenData(token);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof QiniuTokenData) && Intrinsics.areEqual(this.token, ((QiniuTokenData) other).token);
    }

    public int hashCode() {
        return this.token.hashCode();
    }

    public String toString() {
        return "QiniuTokenData(token=" + this.token + ")";
    }

    public QiniuTokenData(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.token = token;
    }

    public final String getToken() {
        return this.token;
    }
}
