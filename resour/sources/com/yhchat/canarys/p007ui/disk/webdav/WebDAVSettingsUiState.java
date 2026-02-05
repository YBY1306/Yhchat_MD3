package com.yhchat.canarys.p007ui.disk.webdav;

import com.yhchat.canarys.data.model.MountSetting;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebDAVSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u00c6\u0003JE\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/webdav/WebDAVSettingsUiState;", "", "isLoading", "", "isSubmitting", "mountSettings", "", "Lcom/yhchat/canarys/data/model/MountSetting;", "error", "", "successMessage", "<init>", "(ZZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "()Z", "getMountSettings", "()Ljava/util/List;", "getError", "()Ljava/lang/String;", "getSuccessMessage", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
final /* data */ class WebDAVSettingsUiState {
    private final String error;
    private final boolean isLoading;
    private final boolean isSubmitting;
    private final List<MountSetting> mountSettings;
    private final String successMessage;

    public WebDAVSettingsUiState() {
        this(false, false, null, null, null, 31, null);
    }

    public static /* synthetic */ WebDAVSettingsUiState copy$default(WebDAVSettingsUiState webDAVSettingsUiState, boolean z, boolean z2, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = webDAVSettingsUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = webDAVSettingsUiState.isSubmitting;
        }
        if ((i & 4) != 0) {
            list = webDAVSettingsUiState.mountSettings;
        }
        if ((i & 8) != 0) {
            str = webDAVSettingsUiState.error;
        }
        if ((i & 16) != 0) {
            str2 = webDAVSettingsUiState.successMessage;
        }
        String str3 = str2;
        List list2 = list;
        return webDAVSettingsUiState.copy(z, z2, list2, str, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsSubmitting() {
        return this.isSubmitting;
    }

    public final List<MountSetting> component3() {
        return this.mountSettings;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    public final WebDAVSettingsUiState copy(boolean isLoading, boolean isSubmitting, List<MountSetting> mountSettings, String error, String successMessage) {
        Intrinsics.checkNotNullParameter(mountSettings, "mountSettings");
        return new WebDAVSettingsUiState(isLoading, isSubmitting, mountSettings, error, successMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebDAVSettingsUiState)) {
            return false;
        }
        WebDAVSettingsUiState webDAVSettingsUiState = (WebDAVSettingsUiState) other;
        return this.isLoading == webDAVSettingsUiState.isLoading && this.isSubmitting == webDAVSettingsUiState.isSubmitting && Intrinsics.areEqual(this.mountSettings, webDAVSettingsUiState.mountSettings) && Intrinsics.areEqual(this.error, webDAVSettingsUiState.error) && Intrinsics.areEqual(this.successMessage, webDAVSettingsUiState.successMessage);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isSubmitting)) * 31) + this.mountSettings.hashCode()) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + (this.successMessage != null ? this.successMessage.hashCode() : 0);
    }

    public String toString() {
        return "WebDAVSettingsUiState(isLoading=" + this.isLoading + ", isSubmitting=" + this.isSubmitting + ", mountSettings=" + this.mountSettings + ", error=" + this.error + ", successMessage=" + this.successMessage + ")";
    }

    public WebDAVSettingsUiState(boolean isLoading, boolean isSubmitting, List<MountSetting> mountSettings, String error, String successMessage) {
        Intrinsics.checkNotNullParameter(mountSettings, "mountSettings");
        this.isLoading = isLoading;
        this.isSubmitting = isSubmitting;
        this.mountSettings = mountSettings;
        this.error = error;
        this.successMessage = successMessage;
    }

    public /* synthetic */ WebDAVSettingsUiState(boolean z, boolean z2, List list, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isSubmitting() {
        return this.isSubmitting;
    }

    public final List<MountSetting> getMountSettings() {
        return this.mountSettings;
    }

    public final String getError() {
        return this.error;
    }

    public final String getSuccessMessage() {
        return this.successMessage;
    }
}
