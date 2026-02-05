package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: WebDAV.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\rH\u00c6\u0003J\t\u0010'\u001a\u00020\u0005H\u00c6\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\rH\u00d6\u0001J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014\u00a8\u0006."}, m169d2 = {"Lcom/yhchat/canarys/data/model/MountSetting;", "", Name.MARK, "", "groupId", "", "mountName", "webdavUrl", "webdavUserName", "webdavPassword", "webdavRootPath", "createTime", "delFlag", "", "userId", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JILjava/lang/String;)V", "getId", "()J", "getGroupId", "()Ljava/lang/String;", "getMountName", "getWebdavUrl", "getWebdavUserName", "getWebdavPassword", "getWebdavRootPath", "getCreateTime", "getDelFlag", "()I", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MountSetting {
    public static final int $stable = 0;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("delFlag")
    private final int delFlag;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("mountName")
    private final String mountName;

    @SerializedName("userId")
    private final String userId;

    @SerializedName("webdavPassword")
    private final String webdavPassword;

    @SerializedName("webdavRootPath")
    private final String webdavRootPath;

    @SerializedName("webdavUrl")
    private final String webdavUrl;

    @SerializedName("webdavUserName")
    private final String webdavUserName;

    public static /* synthetic */ MountSetting copy$default(MountSetting mountSetting, long j, String str, String str2, String str3, String str4, String str5, String str6, long j2, int i, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = mountSetting.id;
        }
        return mountSetting.copy(j, (i2 & 2) != 0 ? mountSetting.groupId : str, (i2 & 4) != 0 ? mountSetting.mountName : str2, (i2 & 8) != 0 ? mountSetting.webdavUrl : str3, (i2 & 16) != 0 ? mountSetting.webdavUserName : str4, (i2 & 32) != 0 ? mountSetting.webdavPassword : str5, (i2 & 64) != 0 ? mountSetting.webdavRootPath : str6, (i2 & 128) != 0 ? mountSetting.createTime : j2, (i2 & 256) != 0 ? mountSetting.delFlag : i, (i2 & 512) != 0 ? mountSetting.userId : str7);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMountName() {
        return this.mountName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWebdavUrl() {
        return this.webdavUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWebdavUserName() {
        return this.webdavUserName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getWebdavPassword() {
        return this.webdavPassword;
    }

    /* renamed from: component7, reason: from getter */
    public final String getWebdavRootPath() {
        return this.webdavRootPath;
    }

    /* renamed from: component8, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component9, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    public final MountSetting copy(long id, String groupId, String mountName, String webdavUrl, String webdavUserName, String webdavPassword, String webdavRootPath, long createTime, int delFlag, String userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(mountName, "mountName");
        Intrinsics.checkNotNullParameter(webdavUrl, "webdavUrl");
        Intrinsics.checkNotNullParameter(webdavUserName, "webdavUserName");
        Intrinsics.checkNotNullParameter(webdavPassword, "webdavPassword");
        Intrinsics.checkNotNullParameter(webdavRootPath, "webdavRootPath");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new MountSetting(id, groupId, mountName, webdavUrl, webdavUserName, webdavPassword, webdavRootPath, createTime, delFlag, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MountSetting)) {
            return false;
        }
        MountSetting mountSetting = (MountSetting) other;
        return this.id == mountSetting.id && Intrinsics.areEqual(this.groupId, mountSetting.groupId) && Intrinsics.areEqual(this.mountName, mountSetting.mountName) && Intrinsics.areEqual(this.webdavUrl, mountSetting.webdavUrl) && Intrinsics.areEqual(this.webdavUserName, mountSetting.webdavUserName) && Intrinsics.areEqual(this.webdavPassword, mountSetting.webdavPassword) && Intrinsics.areEqual(this.webdavRootPath, mountSetting.webdavRootPath) && this.createTime == mountSetting.createTime && this.delFlag == mountSetting.delFlag && Intrinsics.areEqual(this.userId, mountSetting.userId);
    }

    public int hashCode() {
        return (((((((((((((((((Long.hashCode(this.id) * 31) + this.groupId.hashCode()) * 31) + this.mountName.hashCode()) * 31) + this.webdavUrl.hashCode()) * 31) + this.webdavUserName.hashCode()) * 31) + this.webdavPassword.hashCode()) * 31) + this.webdavRootPath.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.delFlag)) * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "MountSetting(id=" + this.id + ", groupId=" + this.groupId + ", mountName=" + this.mountName + ", webdavUrl=" + this.webdavUrl + ", webdavUserName=" + this.webdavUserName + ", webdavPassword=" + this.webdavPassword + ", webdavRootPath=" + this.webdavRootPath + ", createTime=" + this.createTime + ", delFlag=" + this.delFlag + ", userId=" + this.userId + ")";
    }

    public MountSetting(long id, String groupId, String mountName, String webdavUrl, String webdavUserName, String webdavPassword, String webdavRootPath, long createTime, int delFlag, String userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(mountName, "mountName");
        Intrinsics.checkNotNullParameter(webdavUrl, "webdavUrl");
        Intrinsics.checkNotNullParameter(webdavUserName, "webdavUserName");
        Intrinsics.checkNotNullParameter(webdavPassword, "webdavPassword");
        Intrinsics.checkNotNullParameter(webdavRootPath, "webdavRootPath");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.id = id;
        this.groupId = groupId;
        this.mountName = mountName;
        this.webdavUrl = webdavUrl;
        this.webdavUserName = webdavUserName;
        this.webdavPassword = webdavPassword;
        this.webdavRootPath = webdavRootPath;
        this.createTime = createTime;
        this.delFlag = delFlag;
        this.userId = userId;
    }

    public final long getId() {
        return this.id;
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

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDelFlag() {
        return this.delFlag;
    }

    public final String getUserId() {
        return this.userId;
    }
}
