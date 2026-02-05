package com.yhchat.canarys.p007ui.disk.webdav;

import com.yhchat.canarys.data.model.WebDAVFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebDAVBrowserActivity.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J9\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0006H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001c"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/webdav/MountState;", "", "files", "", "Lcom/yhchat/canarys/data/model/WebDAVFile;", "currentPath", "", "isLoading", "", "error", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;)V", "getFiles", "()Ljava/util/List;", "getCurrentPath", "()Ljava/lang/String;", "()Z", "getError", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class MountState {
    public static final int $stable = 8;
    private final String currentPath;
    private final String error;
    private final List<WebDAVFile> files;
    private final boolean isLoading;

    public MountState() {
        this(null, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MountState copy$default(MountState mountState, List list, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mountState.files;
        }
        if ((i & 2) != 0) {
            str = mountState.currentPath;
        }
        if ((i & 4) != 0) {
            z = mountState.isLoading;
        }
        if ((i & 8) != 0) {
            str2 = mountState.error;
        }
        return mountState.copy(list, str, z, str2);
    }

    public final List<WebDAVFile> component1() {
        return this.files;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCurrentPath() {
        return this.currentPath;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final MountState copy(List<WebDAVFile> files, String currentPath, boolean isLoading, String error) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(currentPath, "currentPath");
        return new MountState(files, currentPath, isLoading, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MountState)) {
            return false;
        }
        MountState mountState = (MountState) other;
        return Intrinsics.areEqual(this.files, mountState.files) && Intrinsics.areEqual(this.currentPath, mountState.currentPath) && this.isLoading == mountState.isLoading && Intrinsics.areEqual(this.error, mountState.error);
    }

    public int hashCode() {
        return (((((this.files.hashCode() * 31) + this.currentPath.hashCode()) * 31) + Boolean.hashCode(this.isLoading)) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "MountState(files=" + this.files + ", currentPath=" + this.currentPath + ", isLoading=" + this.isLoading + ", error=" + this.error + ")";
    }

    public MountState(List<WebDAVFile> files, String currentPath, boolean isLoading, String error) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(currentPath, "currentPath");
        this.files = files;
        this.currentPath = currentPath;
        this.isLoading = isLoading;
        this.error = error;
    }

    public /* synthetic */ MountState(List list, String str, boolean z, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2);
    }

    public final List<WebDAVFile> getFiles() {
        return this.files;
    }

    public final String getCurrentPath() {
        return this.currentPath;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }
}
