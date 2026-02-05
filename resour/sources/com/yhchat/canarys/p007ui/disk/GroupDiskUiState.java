package com.yhchat.canarys.p007ui.disk;

import com.yhchat.canarys.data.model.DiskFile;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GroupDiskActivity.kt */
@Metadata(m168d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J]\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020%H\u00d6\u0001J\t\u0010&\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006'"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/GroupDiskUiState;", "", "isLoading", "", "isUploading", "files", "", "Lcom/yhchat/canarys/data/model/DiskFile;", "currentFolderId", "", "breadcrumbs", "Lcom/yhchat/canarys/ui/disk/Breadcrumb;", "operationSuccess", "error", "", "<init>", "(ZZLjava/util/List;JLjava/util/List;ZLjava/lang/String;)V", "()Z", "getFiles", "()Ljava/util/List;", "getCurrentFolderId", "()J", "getBreadcrumbs", "getOperationSuccess", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class GroupDiskUiState {
    public static final int $stable = 8;
    private final List<Breadcrumb> breadcrumbs;
    private final long currentFolderId;
    private final String error;
    private final List<DiskFile> files;
    private final boolean isLoading;
    private final boolean isUploading;
    private final boolean operationSuccess;

    public GroupDiskUiState() {
        this(false, false, null, 0L, null, false, null, 127, null);
    }

    public static /* synthetic */ GroupDiskUiState copy$default(GroupDiskUiState groupDiskUiState, boolean z, boolean z2, List list, long j, List list2, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = groupDiskUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = groupDiskUiState.isUploading;
        }
        if ((i & 4) != 0) {
            list = groupDiskUiState.files;
        }
        if ((i & 8) != 0) {
            j = groupDiskUiState.currentFolderId;
        }
        if ((i & 16) != 0) {
            list2 = groupDiskUiState.breadcrumbs;
        }
        if ((i & 32) != 0) {
            z3 = groupDiskUiState.operationSuccess;
        }
        if ((i & 64) != 0) {
            str = groupDiskUiState.error;
        }
        String str2 = str;
        List list3 = list2;
        long j2 = j;
        List list4 = list;
        return groupDiskUiState.copy(z, z2, list4, j2, list3, z3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsUploading() {
        return this.isUploading;
    }

    public final List<DiskFile> component3() {
        return this.files;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCurrentFolderId() {
        return this.currentFolderId;
    }

    public final List<Breadcrumb> component5() {
        return this.breadcrumbs;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getOperationSuccess() {
        return this.operationSuccess;
    }

    /* renamed from: component7, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final GroupDiskUiState copy(boolean isLoading, boolean isUploading, List<DiskFile> files, long currentFolderId, List<Breadcrumb> breadcrumbs, boolean operationSuccess, String error) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(breadcrumbs, "breadcrumbs");
        return new GroupDiskUiState(isLoading, isUploading, files, currentFolderId, breadcrumbs, operationSuccess, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupDiskUiState)) {
            return false;
        }
        GroupDiskUiState groupDiskUiState = (GroupDiskUiState) other;
        return this.isLoading == groupDiskUiState.isLoading && this.isUploading == groupDiskUiState.isUploading && Intrinsics.areEqual(this.files, groupDiskUiState.files) && this.currentFolderId == groupDiskUiState.currentFolderId && Intrinsics.areEqual(this.breadcrumbs, groupDiskUiState.breadcrumbs) && this.operationSuccess == groupDiskUiState.operationSuccess && Intrinsics.areEqual(this.error, groupDiskUiState.error);
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isUploading)) * 31) + this.files.hashCode()) * 31) + Long.hashCode(this.currentFolderId)) * 31) + this.breadcrumbs.hashCode()) * 31) + Boolean.hashCode(this.operationSuccess)) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "GroupDiskUiState(isLoading=" + this.isLoading + ", isUploading=" + this.isUploading + ", files=" + this.files + ", currentFolderId=" + this.currentFolderId + ", breadcrumbs=" + this.breadcrumbs + ", operationSuccess=" + this.operationSuccess + ", error=" + this.error + ")";
    }

    public GroupDiskUiState(boolean isLoading, boolean isUploading, List<DiskFile> files, long currentFolderId, List<Breadcrumb> breadcrumbs, boolean operationSuccess, String error) {
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(breadcrumbs, "breadcrumbs");
        this.isLoading = isLoading;
        this.isUploading = isUploading;
        this.files = files;
        this.currentFolderId = currentFolderId;
        this.breadcrumbs = breadcrumbs;
        this.operationSuccess = operationSuccess;
        this.error = error;
    }

    public /* synthetic */ GroupDiskUiState(boolean z, boolean z2, List list, long j, List list2, boolean z3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? 0L : j, (i & 16) != 0 ? CollectionsKt.emptyList() : list2, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isUploading() {
        return this.isUploading;
    }

    public final List<DiskFile> getFiles() {
        return this.files;
    }

    public final long getCurrentFolderId() {
        return this.currentFolderId;
    }

    public final List<Breadcrumb> getBreadcrumbs() {
        return this.breadcrumbs;
    }

    public final boolean getOperationSuccess() {
        return this.operationSuccess;
    }

    public final String getError() {
        return this.error;
    }
}
