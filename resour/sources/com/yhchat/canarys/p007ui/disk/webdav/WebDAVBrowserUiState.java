package com.yhchat.canarys.p007ui.disk.webdav;

import com.yhchat.canarys.data.model.MountSetting;
import com.yhchat.canarys.data.model.WebDAVFile;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebDAVBrowserActivity.kt */
@Metadata(m168d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u0015\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0003Js\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010H\u00c6\u0001J\u0013\u0010(\u001a\u00020\u00032\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\tH\u00d6\u0001J\t\u0010+\u001a\u00020\rH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006,"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/webdav/WebDAVBrowserUiState;", "", "isLoading", "", "isLoadingFiles", "mountSettings", "", "Lcom/yhchat/canarys/data/model/MountSetting;", "selectedMountIndex", "", "files", "Lcom/yhchat/canarys/data/model/WebDAVFile;", "currentPath", "", "error", "mountStates", "", "Lcom/yhchat/canarys/ui/disk/webdav/MountState;", "<init>", "(ZZLjava/util/List;ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "()Z", "getMountSettings", "()Ljava/util/List;", "getSelectedMountIndex", "()I", "getFiles", "getCurrentPath", "()Ljava/lang/String;", "getError", "getMountStates", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class WebDAVBrowserUiState {
    public static final int $stable = 8;
    private final String currentPath;
    private final String error;
    private final List<WebDAVFile> files;
    private final boolean isLoading;
    private final boolean isLoadingFiles;
    private final List<MountSetting> mountSettings;
    private final Map<Integer, MountState> mountStates;
    private final int selectedMountIndex;

    public WebDAVBrowserUiState() {
        this(false, false, null, 0, null, null, null, null, 255, null);
    }

    public static /* synthetic */ WebDAVBrowserUiState copy$default(WebDAVBrowserUiState webDAVBrowserUiState, boolean z, boolean z2, List list, int i, List list2, String str, String str2, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = webDAVBrowserUiState.isLoading;
        }
        if ((i2 & 2) != 0) {
            z2 = webDAVBrowserUiState.isLoadingFiles;
        }
        if ((i2 & 4) != 0) {
            list = webDAVBrowserUiState.mountSettings;
        }
        if ((i2 & 8) != 0) {
            i = webDAVBrowserUiState.selectedMountIndex;
        }
        if ((i2 & 16) != 0) {
            list2 = webDAVBrowserUiState.files;
        }
        if ((i2 & 32) != 0) {
            str = webDAVBrowserUiState.currentPath;
        }
        if ((i2 & 64) != 0) {
            str2 = webDAVBrowserUiState.error;
        }
        if ((i2 & 128) != 0) {
            map = webDAVBrowserUiState.mountStates;
        }
        String str3 = str2;
        Map map2 = map;
        List list3 = list2;
        String str4 = str;
        return webDAVBrowserUiState.copy(z, z2, list, i, list3, str4, str3, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLoadingFiles() {
        return this.isLoadingFiles;
    }

    public final List<MountSetting> component3() {
        return this.mountSettings;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSelectedMountIndex() {
        return this.selectedMountIndex;
    }

    public final List<WebDAVFile> component5() {
        return this.files;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCurrentPath() {
        return this.currentPath;
    }

    /* renamed from: component7, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final Map<Integer, MountState> component8() {
        return this.mountStates;
    }

    public final WebDAVBrowserUiState copy(boolean isLoading, boolean isLoadingFiles, List<MountSetting> mountSettings, int selectedMountIndex, List<WebDAVFile> files, String currentPath, String error, Map<Integer, MountState> mountStates) {
        Intrinsics.checkNotNullParameter(mountSettings, "mountSettings");
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(currentPath, "currentPath");
        Intrinsics.checkNotNullParameter(mountStates, "mountStates");
        return new WebDAVBrowserUiState(isLoading, isLoadingFiles, mountSettings, selectedMountIndex, files, currentPath, error, mountStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebDAVBrowserUiState)) {
            return false;
        }
        WebDAVBrowserUiState webDAVBrowserUiState = (WebDAVBrowserUiState) other;
        return this.isLoading == webDAVBrowserUiState.isLoading && this.isLoadingFiles == webDAVBrowserUiState.isLoadingFiles && Intrinsics.areEqual(this.mountSettings, webDAVBrowserUiState.mountSettings) && this.selectedMountIndex == webDAVBrowserUiState.selectedMountIndex && Intrinsics.areEqual(this.files, webDAVBrowserUiState.files) && Intrinsics.areEqual(this.currentPath, webDAVBrowserUiState.currentPath) && Intrinsics.areEqual(this.error, webDAVBrowserUiState.error) && Intrinsics.areEqual(this.mountStates, webDAVBrowserUiState.mountStates);
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isLoadingFiles)) * 31) + this.mountSettings.hashCode()) * 31) + Integer.hashCode(this.selectedMountIndex)) * 31) + this.files.hashCode()) * 31) + this.currentPath.hashCode()) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + this.mountStates.hashCode();
    }

    public String toString() {
        return "WebDAVBrowserUiState(isLoading=" + this.isLoading + ", isLoadingFiles=" + this.isLoadingFiles + ", mountSettings=" + this.mountSettings + ", selectedMountIndex=" + this.selectedMountIndex + ", files=" + this.files + ", currentPath=" + this.currentPath + ", error=" + this.error + ", mountStates=" + this.mountStates + ")";
    }

    public WebDAVBrowserUiState(boolean isLoading, boolean isLoadingFiles, List<MountSetting> mountSettings, int selectedMountIndex, List<WebDAVFile> files, String currentPath, String error, Map<Integer, MountState> mountStates) {
        Intrinsics.checkNotNullParameter(mountSettings, "mountSettings");
        Intrinsics.checkNotNullParameter(files, "files");
        Intrinsics.checkNotNullParameter(currentPath, "currentPath");
        Intrinsics.checkNotNullParameter(mountStates, "mountStates");
        this.isLoading = isLoading;
        this.isLoadingFiles = isLoadingFiles;
        this.mountSettings = mountSettings;
        this.selectedMountIndex = selectedMountIndex;
        this.files = files;
        this.currentPath = currentPath;
        this.error = error;
        this.mountStates = mountStates;
    }

    public /* synthetic */ WebDAVBrowserUiState(boolean z, boolean z2, List list, int i, List list2, String str, String str2, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list, (i2 & 8) != 0 ? -1 : i, (i2 & 16) != 0 ? CollectionsKt.emptyList() : list2, (i2 & 32) != 0 ? "" : str, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? MapsKt.emptyMap() : map);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isLoadingFiles() {
        return this.isLoadingFiles;
    }

    public final List<MountSetting> getMountSettings() {
        return this.mountSettings;
    }

    public final int getSelectedMountIndex() {
        return this.selectedMountIndex;
    }

    public final List<WebDAVFile> getFiles() {
        return this.files;
    }

    public final String getCurrentPath() {
        return this.currentPath;
    }

    public final String getError() {
        return this.error;
    }

    public final Map<Integer, MountState> getMountStates() {
        return this.mountStates;
    }
}
