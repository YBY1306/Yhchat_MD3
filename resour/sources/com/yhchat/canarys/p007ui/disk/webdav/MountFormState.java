package com.yhchat.canarys.p007ui.disk.webdav;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebDAVSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001c"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/webdav/MountFormState;", "", "mountName", "", "webdavUrl", "webdavUserName", "webdavPassword", "webdavRootPath", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMountName", "()Ljava/lang/String;", "getWebdavUrl", "getWebdavUserName", "getWebdavPassword", "getWebdavRootPath", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
final /* data */ class MountFormState {
    private final String mountName;
    private final String webdavPassword;
    private final String webdavRootPath;
    private final String webdavUrl;
    private final String webdavUserName;

    public static /* synthetic */ MountFormState copy$default(MountFormState mountFormState, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mountFormState.mountName;
        }
        if ((i & 2) != 0) {
            str2 = mountFormState.webdavUrl;
        }
        if ((i & 4) != 0) {
            str3 = mountFormState.webdavUserName;
        }
        if ((i & 8) != 0) {
            str4 = mountFormState.webdavPassword;
        }
        if ((i & 16) != 0) {
            str5 = mountFormState.webdavRootPath;
        }
        String str6 = str5;
        String str7 = str3;
        return mountFormState.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMountName() {
        return this.mountName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWebdavUrl() {
        return this.webdavUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getWebdavUserName() {
        return this.webdavUserName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getWebdavPassword() {
        return this.webdavPassword;
    }

    /* renamed from: component5, reason: from getter */
    public final String getWebdavRootPath() {
        return this.webdavRootPath;
    }

    public final MountFormState copy(String mountName, String webdavUrl, String webdavUserName, String webdavPassword, String webdavRootPath) {
        Intrinsics.checkNotNullParameter(mountName, "mountName");
        Intrinsics.checkNotNullParameter(webdavUrl, "webdavUrl");
        Intrinsics.checkNotNullParameter(webdavUserName, "webdavUserName");
        Intrinsics.checkNotNullParameter(webdavPassword, "webdavPassword");
        Intrinsics.checkNotNullParameter(webdavRootPath, "webdavRootPath");
        return new MountFormState(mountName, webdavUrl, webdavUserName, webdavPassword, webdavRootPath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MountFormState)) {
            return false;
        }
        MountFormState mountFormState = (MountFormState) other;
        return Intrinsics.areEqual(this.mountName, mountFormState.mountName) && Intrinsics.areEqual(this.webdavUrl, mountFormState.webdavUrl) && Intrinsics.areEqual(this.webdavUserName, mountFormState.webdavUserName) && Intrinsics.areEqual(this.webdavPassword, mountFormState.webdavPassword) && Intrinsics.areEqual(this.webdavRootPath, mountFormState.webdavRootPath);
    }

    public int hashCode() {
        return (((((((this.mountName.hashCode() * 31) + this.webdavUrl.hashCode()) * 31) + this.webdavUserName.hashCode()) * 31) + this.webdavPassword.hashCode()) * 31) + this.webdavRootPath.hashCode();
    }

    public String toString() {
        return "MountFormState(mountName=" + this.mountName + ", webdavUrl=" + this.webdavUrl + ", webdavUserName=" + this.webdavUserName + ", webdavPassword=" + this.webdavPassword + ", webdavRootPath=" + this.webdavRootPath + ")";
    }

    public MountFormState(String mountName, String webdavUrl, String webdavUserName, String webdavPassword, String webdavRootPath) {
        Intrinsics.checkNotNullParameter(mountName, "mountName");
        Intrinsics.checkNotNullParameter(webdavUrl, "webdavUrl");
        Intrinsics.checkNotNullParameter(webdavUserName, "webdavUserName");
        Intrinsics.checkNotNullParameter(webdavPassword, "webdavPassword");
        Intrinsics.checkNotNullParameter(webdavRootPath, "webdavRootPath");
        this.mountName = mountName;
        this.webdavUrl = webdavUrl;
        this.webdavUserName = webdavUserName;
        this.webdavPassword = webdavPassword;
        this.webdavRootPath = webdavRootPath;
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
