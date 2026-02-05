package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/model/CaptchaData;", "", "b64s", "", Name.MARK, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getB64s", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CaptchaData {
    public static final int $stable = 0;

    @SerializedName("b64s")
    private final String b64s;

    @SerializedName(Name.MARK)
    private final String id;

    public static /* synthetic */ CaptchaData copy$default(CaptchaData captchaData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = captchaData.b64s;
        }
        if ((i & 2) != 0) {
            str2 = captchaData.id;
        }
        return captchaData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getB64s() {
        return this.b64s;
    }

    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final CaptchaData copy(String b64s, String id) {
        Intrinsics.checkNotNullParameter(b64s, "b64s");
        Intrinsics.checkNotNullParameter(id, "id");
        return new CaptchaData(b64s, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaptchaData)) {
            return false;
        }
        CaptchaData captchaData = (CaptchaData) other;
        return Intrinsics.areEqual(this.b64s, captchaData.b64s) && Intrinsics.areEqual(this.id, captchaData.id);
    }

    public int hashCode() {
        return (this.b64s.hashCode() * 31) + this.id.hashCode();
    }

    public String toString() {
        return "CaptchaData(b64s=" + this.b64s + ", id=" + this.id + ")";
    }

    public CaptchaData(String b64s, String id) {
        Intrinsics.checkNotNullParameter(b64s, "b64s");
        Intrinsics.checkNotNullParameter(id, "id");
        this.b64s = b64s;
        this.id = id;
    }

    public final String getB64s() {
        return this.b64s;
    }

    public final String getId() {
        return this.id;
    }
}
