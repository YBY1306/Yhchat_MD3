package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebDAV.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001f"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MountSettingCreateRequest;", "", "groupId", "", "mountName", "webdavUrl", "webdavUserName", "webdavPassword", "webdavRootPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/String;", "getMountName", "getWebdavUrl", "getWebdavUserName", "getWebdavPassword", "getWebdavRootPath", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MountSettingCreateRequest {
    public static final int $stable = 0;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName("mountName")
    private final String mountName;

    @SerializedName("webdavPassword")
    private final String webdavPassword;

    @SerializedName("webdavRootPath")
    private final String webdavRootPath;

    @SerializedName("webdavUrl")
    private final String webdavUrl;

    @SerializedName("webdavUserName")
    private final String webdavUserName;

    public static /* synthetic */ MountSettingCreateRequest copy$default(MountSettingCreateRequest mountSettingCreateRequest, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mountSettingCreateRequest.groupId;
        }
        if ((i & 2) != 0) {
            str2 = mountSettingCreateRequest.mountName;
        }
        if ((i & 4) != 0) {
            str3 = mountSettingCreateRequest.webdavUrl;
        }
        if ((i & 8) != 0) {
            str4 = mountSettingCreateRequest.webdavUserName;
        }
        if ((i & 16) != 0) {
            str5 = mountSettingCreateRequest.webdavPassword;
        }
        if ((i & 32) != 0) {
            str6 = mountSettingCreateRequest.webdavRootPath;
        }
        String str7 = str5;
        String str8 = str6;
        return mountSettingCreateRequest.copy(str, str2, str3, str4, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMountName() {
        return this.mountName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWebdavUrl() {
        return this.webdavUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWebdavUserName() {
        return this.webdavUserName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWebdavPassword() {
        return this.webdavPassword;
    }

    /* renamed from: component6, reason: from getter */
    public final String getWebdavRootPath() {
        return this.webdavRootPath;
    }

    public final MountSettingCreateRequest copy(String groupId, String mountName, String webdavUrl, String webdavUserName, String webdavPassword, String webdavRootPath) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(mountName, "mountName");
        Intrinsics.checkNotNullParameter(webdavUrl, "webdavUrl");
        Intrinsics.checkNotNullParameter(webdavUserName, "webdavUserName");
        Intrinsics.checkNotNullParameter(webdavPassword, "webdavPassword");
        Intrinsics.checkNotNullParameter(webdavRootPath, "webdavRootPath");
        return new MountSettingCreateRequest(groupId, mountName, webdavUrl, webdavUserName, webdavPassword, webdavRootPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MountSettingCreateRequest)) {
            return false;
        }
        MountSettingCreateRequest mountSettingCreateRequest = (MountSettingCreateRequest) other;
        return Intrinsics.areEqual(this.groupId, mountSettingCreateRequest.groupId) && Intrinsics.areEqual(this.mountName, mountSettingCreateRequest.mountName) && Intrinsics.areEqual(this.webdavUrl, mountSettingCreateRequest.webdavUrl) && Intrinsics.areEqual(this.webdavUserName, mountSettingCreateRequest.webdavUserName) && Intrinsics.areEqual(this.webdavPassword, mountSettingCreateRequest.webdavPassword) && Intrinsics.areEqual(this.webdavRootPath, mountSettingCreateRequest.webdavRootPath);
    }

    public int hashCode() {
        return (((((((((this.groupId.hashCode() * 31) + this.mountName.hashCode()) * 31) + this.webdavUrl.hashCode()) * 31) + this.webdavUserName.hashCode()) * 31) + this.webdavPassword.hashCode()) * 31) + this.webdavRootPath.hashCode();
    }

    public String toString() {
        return "MountSettingCreateRequest(groupId=" + this.groupId + ", mountName=" + this.mountName + ", webdavUrl=" + this.webdavUrl + ", webdavUserName=" + this.webdavUserName + ", webdavPassword=" + this.webdavPassword + ", webdavRootPath=" + this.webdavRootPath + ")";
    }

    public MountSettingCreateRequest(String groupId, String mountName, String webdavUrl, String webdavUserName, String webdavPassword, String webdavRootPath) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(mountName, "mountName");
        Intrinsics.checkNotNullParameter(webdavUrl, "webdavUrl");
        Intrinsics.checkNotNullParameter(webdavUserName, "webdavUserName");
        Intrinsics.checkNotNullParameter(webdavPassword, "webdavPassword");
        Intrinsics.checkNotNullParameter(webdavRootPath, "webdavRootPath");
        this.groupId = groupId;
        this.mountName = mountName;
        this.webdavUrl = webdavUrl;
        this.webdavUserName = webdavUserName;
        this.webdavPassword = webdavPassword;
        this.webdavRootPath = webdavRootPath;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getMountName() {
        return this.mountName;
    }

    public final String getWebdavUrl() {
        return this.webdavUrl;
    }

    public final String getWebdavUserName() {
        return this.webdavUserName;
    }

    public final String getWebdavPassword() {
        return this.webdavPassword;
    }

    public final String getWebdavRootPath() {
        return this.webdavRootPath;
    }
}
