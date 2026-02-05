package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: UserDetailModels.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MedalInfo;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "sort", "<init>", "(JLjava/lang/String;J)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getSort", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MedalInfo {
    public static final int $stable = 0;
    private final long id;
    private final String name;
    private final long sort;

    public static /* synthetic */ MedalInfo copy$default(MedalInfo medalInfo, long j, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = medalInfo.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = medalInfo.name;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = medalInfo.sort;
        }
        return medalInfo.copy(j3, str2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSort() {
        return this.sort;
    }

    public final MedalInfo copy(long id, String name, long sort) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new MedalInfo(id, name, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedalInfo)) {
            return false;
        }
        MedalInfo medalInfo = (MedalInfo) other;
        return this.id == medalInfo.id && Intrinsics.areEqual(this.name, medalInfo.name) && this.sort == medalInfo.sort;
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.sort);
    }

    public String toString() {
        return "MedalInfo(id=" + this.id + ", name=" + this.name + ", sort=" + this.sort + ")";
    }

    public MedalInfo(long id, String name, long sort) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = id;
        this.name = name;
        this.sort = sort;
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final long getSort() {
        return this.sort;
    }
}
