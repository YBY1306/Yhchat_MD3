package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MyBotListData;", "", "botsTotal", "", "list", "Lcom/yhchat/canarys/data/model/MyBotList;", "<init>", "(ILcom/yhchat/canarys/data/model/MyBotList;)V", "getBotsTotal", "()I", "getList", "()Lcom/yhchat/canarys/data/model/MyBotList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MyBotListData {
    public static final int $stable = 8;

    @SerializedName("botsTotal")
    private final int botsTotal;

    @SerializedName("list")
    private final MyBotList list;

    public static /* synthetic */ MyBotListData copy$default(MyBotListData myBotListData, int i, MyBotList myBotList, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = myBotListData.botsTotal;
        }
        if ((i2 & 2) != 0) {
            myBotList = myBotListData.list;
        }
        return myBotListData.copy(i, myBotList);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBotsTotal() {
        return this.botsTotal;
    }

    /* renamed from: component2, reason: from getter */
    public final MyBotList getList() {
        return this.list;
    }

    public final MyBotListData copy(int botsTotal, MyBotList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        return new MyBotListData(botsTotal, list);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyBotListData)) {
            return false;
        }
        MyBotListData myBotListData = (MyBotListData) other;
        return this.botsTotal == myBotListData.botsTotal && Intrinsics.areEqual(this.list, myBotListData.list);
    }

    public int hashCode() {
        return (Integer.hashCode(this.botsTotal) * 31) + this.list.hashCode();
    }

    public String toString() {
        return "MyBotListData(botsTotal=" + this.botsTotal + ", list=" + this.list + ")";
    }

    public MyBotListData(int botsTotal, MyBotList list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.botsTotal = botsTotal;
        this.list = list;
    }

    public final int getBotsTotal() {
        return this.botsTotal;
    }

    public final MyBotList getList() {
        return this.list;
    }
}
