package com.yhchat.canarys.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: UserToken.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0007H\u00c6\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/local/UserToken;", "", Name.MARK, "", "token", "", "loginTime", "", "<init>", "(ILjava/lang/String;J)V", "getId", "()I", "getToken", "()Ljava/lang/String;", "getLoginTime", "()J", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UserToken {
    public static final int $stable = 0;
    private final int id;
    private final long loginTime;
    private final String token;

    public static /* synthetic */ UserToken copy$default(UserToken userToken, int i, String str, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userToken.id;
        }
        if ((i2 & 2) != 0) {
            str = userToken.token;
        }
        if ((i2 & 4) != 0) {
            j = userToken.loginTime;
        }
        return userToken.copy(i, str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLoginTime() {
        return this.loginTime;
    }

    public final UserToken copy(int id, String token, long loginTime) {
        Intrinsics.checkNotNullParameter(token, "token");
        return new UserToken(id, token, loginTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserToken)) {
            return false;
        }
        UserToken userToken = (UserToken) other;
        return this.id == userToken.id && Intrinsics.areEqual(this.token, userToken.token) && this.loginTime == userToken.loginTime;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.id) * 31) + this.token.hashCode()) * 31) + Long.hashCode(this.loginTime);
    }

    public String toString() {
        return "UserToken(id=" + this.id + ", token=" + this.token + ", loginTime=" + this.loginTime + ")";
    }

    public UserToken(int id, String token, long loginTime) {
        Intrinsics.checkNotNullParameter(token, "token");
        this.id = id;
        this.token = token;
        this.loginTime = loginTime;
    }

    public /* synthetic */ UserToken(int i, String str, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, str, (i2 & 4) != 0 ? System.currentTimeMillis() : j);
    }

    public final int getId() {
        return this.id;
    }

    public final String getToken() {
        return this.token;
    }

    public final long getLoginTime() {
        return this.loginTime;
    }
}
