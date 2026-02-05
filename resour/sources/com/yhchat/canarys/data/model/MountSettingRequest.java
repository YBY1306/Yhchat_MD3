package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebDAV.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MountSettingRequest;", "", "groupId", "", "encryptKey", "encryptIv", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getEncryptKey", "getEncryptIv", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MountSettingRequest {
    public static final int $stable = 0;

    @SerializedName("encryptIv")
    private final String encryptIv;

    @SerializedName("encryptKey")
    private final String encryptKey;

    @SerializedName("groupId")
    private final String groupId;

    public static /* synthetic */ MountSettingRequest copy$default(MountSettingRequest mountSettingRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mountSettingRequest.groupId;
        }
        if ((i & 2) != 0) {
            str2 = mountSettingRequest.encryptKey;
        }
        if ((i & 4) != 0) {
            str3 = mountSettingRequest.encryptIv;
        }
        return mountSettingRequest.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEncryptKey() {
        return this.encryptKey;
    }

    /* renamed from: component3, reason: from getter */
    public final String getEncryptIv() {
        return this.encryptIv;
    }

    public final MountSettingRequest copy(String groupId, String encryptKey, String encryptIv) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(encryptKey, "encryptKey");
        Intrinsics.checkNotNullParameter(encryptIv, "encryptIv");
        return new MountSettingRequest(groupId, encryptKey, encryptIv);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MountSettingRequest)) {
            return false;
        }
        MountSettingRequest mountSettingRequest = (MountSettingRequest) other;
        return Intrinsics.areEqual(this.groupId, mountSettingRequest.groupId) && Intrinsics.areEqual(this.encryptKey, mountSettingRequest.encryptKey) && Intrinsics.areEqual(this.encryptIv, mountSettingRequest.encryptIv);
    }

    public int hashCode() {
        return (((this.groupId.hashCode() * 31) + this.encryptKey.hashCode()) * 31) + this.encryptIv.hashCode();
    }

    public String toString() {
        return "MountSettingRequest(groupId=" + this.groupId + ", encryptKey=" + this.encryptKey + ", encryptIv=" + this.encryptIv + ")";
    }

    public MountSettingRequest(String groupId, String encryptKey, String encryptIv) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(encryptKey, "encryptKey");
        Intrinsics.checkNotNullParameter(encryptIv, "encryptIv");
        this.groupId = groupId;
        this.encryptKey = encryptKey;
        this.encryptIv = encryptIv;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getEncryptKey() {
        return this.encryptKey;
    }

    public final String getEncryptIv() {
        return this.encryptIv;
    }
}
