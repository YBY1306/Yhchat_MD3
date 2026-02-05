package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* compiled from: Coin.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MyTaskInfo;", "", "adsWatchNumber", "", "avatarEditNumber", "nicknameEditNumber", "raffleTimes", "<init>", "(IIII)V", "getAdsWatchNumber", "()I", "getAvatarEditNumber", "getNicknameEditNumber", "getRaffleTimes", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MyTaskInfo {
    public static final int $stable = 0;

    @SerializedName("adsWatchNumber")
    private final int adsWatchNumber;

    @SerializedName("avatarEditNumber")
    private final int avatarEditNumber;

    @SerializedName("nicknameEditNumber")
    private final int nicknameEditNumber;

    @SerializedName("raffleTimes")
    private final int raffleTimes;

    public static /* synthetic */ MyTaskInfo copy$default(MyTaskInfo myTaskInfo, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = myTaskInfo.adsWatchNumber;
        }
        if ((i5 & 2) != 0) {
            i2 = myTaskInfo.avatarEditNumber;
        }
        if ((i5 & 4) != 0) {
            i3 = myTaskInfo.nicknameEditNumber;
        }
        if ((i5 & 8) != 0) {
            i4 = myTaskInfo.raffleTimes;
        }
        return myTaskInfo.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAdsWatchNumber() {
        return this.adsWatchNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAvatarEditNumber() {
        return this.avatarEditNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final int getNicknameEditNumber() {
        return this.nicknameEditNumber;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRaffleTimes() {
        return this.raffleTimes;
    }

    public final MyTaskInfo copy(int adsWatchNumber, int avatarEditNumber, int nicknameEditNumber, int raffleTimes) {
        return new MyTaskInfo(adsWatchNumber, avatarEditNumber, nicknameEditNumber, raffleTimes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MyTaskInfo)) {
            return false;
        }
        MyTaskInfo myTaskInfo = (MyTaskInfo) other;
        return this.adsWatchNumber == myTaskInfo.adsWatchNumber && this.avatarEditNumber == myTaskInfo.avatarEditNumber && this.nicknameEditNumber == myTaskInfo.nicknameEditNumber && this.raffleTimes == myTaskInfo.raffleTimes;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.adsWatchNumber) * 31) + Integer.hashCode(this.avatarEditNumber)) * 31) + Integer.hashCode(this.nicknameEditNumber)) * 31) + Integer.hashCode(this.raffleTimes);
    }

    public String toString() {
        return "MyTaskInfo(adsWatchNumber=" + this.adsWatchNumber + ", avatarEditNumber=" + this.avatarEditNumber + ", nicknameEditNumber=" + this.nicknameEditNumber + ", raffleTimes=" + this.raffleTimes + ")";
    }

    public MyTaskInfo(int adsWatchNumber, int avatarEditNumber, int nicknameEditNumber, int raffleTimes) {
        this.adsWatchNumber = adsWatchNumber;
        this.avatarEditNumber = avatarEditNumber;
        this.nicknameEditNumber = nicknameEditNumber;
        this.raffleTimes = raffleTimes;
    }

    public final int getAdsWatchNumber() {
        return this.adsWatchNumber;
    }

    public final int getAvatarEditNumber() {
        return this.avatarEditNumber;
    }

    public final int getNicknameEditNumber() {
        return this.nicknameEditNumber;
    }

    public final int getRaffleTimes() {
        return this.raffleTimes;
    }
}
