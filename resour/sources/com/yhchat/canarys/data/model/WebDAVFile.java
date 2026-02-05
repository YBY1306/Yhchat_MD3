package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: WebDAV.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0017\u001a\u00020\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001c\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u000bH\u00c6\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001f\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, m169d2 = {"Lcom/yhchat/canarys/data/model/WebDAVFile;", "", HintConstants.AUTOFILL_HINT_NAME, "", "path", "isDirectory", "", "size", "", "lastModified", "mountSetting", "Lcom/yhchat/canarys/data/model/MountSetting;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZJJLcom/yhchat/canarys/data/model/MountSetting;)V", "getName", "()Ljava/lang/String;", "getPath", "()Z", "getSize", "()J", "getLastModified", "getMountSetting", "()Lcom/yhchat/canarys/data/model/MountSetting;", "getFormattedSize", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WebDAVFile {
    public static final int $stable = 0;
    private final boolean isDirectory;
    private final long lastModified;
    private final MountSetting mountSetting;
    private final String name;
    private final String path;
    private final long size;

    public static /* synthetic */ WebDAVFile copy$default(WebDAVFile webDAVFile, String str, String str2, boolean z, long j, long j2, MountSetting mountSetting, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webDAVFile.name;
        }
        if ((i & 2) != 0) {
            str2 = webDAVFile.path;
        }
        if ((i & 4) != 0) {
            z = webDAVFile.isDirectory;
        }
        if ((i & 8) != 0) {
            j = webDAVFile.size;
        }
        if ((i & 16) != 0) {
            j2 = webDAVFile.lastModified;
        }
        if ((i & 32) != 0) {
            mountSetting = webDAVFile.mountSetting;
        }
        MountSetting mountSetting2 = mountSetting;
        long j3 = j2;
        boolean z2 = z;
        return webDAVFile.copy(str, str2, z2, j, j3, mountSetting2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDirectory() {
        return this.isDirectory;
    }

    /* renamed from: component4, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: component5, reason: from getter */
    public final long getLastModified() {
        return this.lastModified;
    }

    /* renamed from: component6, reason: from getter */
    public final MountSetting getMountSetting() {
        return this.mountSetting;
    }

    public final WebDAVFile copy(String name, String path, boolean isDirectory, long size, long lastModified, MountSetting mountSetting) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(mountSetting, "mountSetting");
        return new WebDAVFile(name, path, isDirectory, size, lastModified, mountSetting);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebDAVFile)) {
            return false;
        }
        WebDAVFile webDAVFile = (WebDAVFile) other;
        return Intrinsics.areEqual(this.name, webDAVFile.name) && Intrinsics.areEqual(this.path, webDAVFile.path) && this.isDirectory == webDAVFile.isDirectory && this.size == webDAVFile.size && this.lastModified == webDAVFile.lastModified && Intrinsics.areEqual(this.mountSetting, webDAVFile.mountSetting);
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.path.hashCode()) * 31) + Boolean.hashCode(this.isDirectory)) * 31) + Long.hashCode(this.size)) * 31) + Long.hashCode(this.lastModified)) * 31) + this.mountSetting.hashCode();
    }

    public String toString() {
        return "WebDAVFile(name=" + this.name + ", path=" + this.path + ", isDirectory=" + this.isDirectory + ", size=" + this.size + ", lastModified=" + this.lastModified + ", mountSetting=" + this.mountSetting + ")";
    }

    public WebDAVFile(String name, String path, boolean isDirectory, long size, long lastModified, MountSetting mountSetting) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(mountSetting, "mountSetting");
        this.name = name;
        this.path = path;
        this.isDirectory = isDirectory;
        this.size = size;
        this.lastModified = lastModified;
        this.mountSetting = mountSetting;
    }

    public /* synthetic */ WebDAVFile(String str, String str2, boolean z, long j, long j2, MountSetting mountSetting, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? 0L : j2, mountSetting);
    }

    public final String getName() {
        return this.name;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean isDirectory() {
        return this.isDirectory;
    }

    public final long getSize() {
        return this.size;
    }

    public final long getLastModified() {
        return this.lastModified;
    }

    public final MountSetting getMountSetting() {
        return this.mountSetting;
    }

    public final String getFormattedSize() {
        if (this.isDirectory) {
            return "-";
        }
        double kb = this.size / 1024.0d;
        double mb = kb / 1024.0d;
        double gb = mb / 1024.0d;
        if (gb >= 1.0d) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(gb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (mb >= 1.0d) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(mb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (kb >= 1.0d) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format("%.2f KB", Arrays.copyOf(new Object[]{Double.valueOf(kb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
        return this.size + " B";
    }
}
