package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Friend.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, m169d2 = {"Lcom/yhchat/canarys/data/model/AgreeApplyRequest;", "", Name.MARK, "", "agree", "", "<init>", "(JI)V", "getId", "()J", "getAgree", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class AgreeApplyRequest {
    public static final int $stable = 0;

    @SerializedName("agree")
    private final int agree;

    @SerializedName(Name.MARK)
    private final long id;

    public static /* synthetic */ AgreeApplyRequest copy$default(AgreeApplyRequest agreeApplyRequest, long j, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = agreeApplyRequest.id;
        }
        if ((i2 & 2) != 0) {
            i = agreeApplyRequest.agree;
        }
        return agreeApplyRequest.copy(j, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAgree() {
        return this.agree;
    }

    public final AgreeApplyRequest copy(long id, int agree) {
        return new AgreeApplyRequest(id, agree);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AgreeApplyRequest)) {
            return false;
        }
        AgreeApplyRequest agreeApplyRequest = (AgreeApplyRequest) other;
        return this.id == agreeApplyRequest.id && this.agree == agreeApplyRequest.agree;
    }

    public int hashCode() {
        return (Long.hashCode(this.id) * 31) + Integer.hashCode(this.agree);
    }

    public String toString() {
        return "AgreeApplyRequest(id=" + this.id + ", agree=" + this.agree + ")";
    }

    public AgreeApplyRequest(long id, int agree) {
        this.id = id;
        this.agree = agree;
    }

    public final long getId() {
        return this.id;
    }

    public final int getAgree() {
        return this.agree;
    }
}
