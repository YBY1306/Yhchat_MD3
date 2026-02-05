package com.yhchat.canarys.p007ui.components;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReportDialog.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J5\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/ReportUiState;", "", "isLoading", "", "submitSuccess", "imageUrl", "", "error", "<init>", "(ZZLjava/lang/String;Ljava/lang/String;)V", "()Z", "getSubmitSuccess", "getImageUrl", "()Ljava/lang/String;", "getError", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ReportUiState {
    public static final int $stable = 0;
    private final String error;
    private final String imageUrl;
    private final boolean isLoading;
    private final boolean submitSuccess;

    public ReportUiState() {
        this(false, false, null, null, 15, null);
    }

    public static /* synthetic */ ReportUiState copy$default(ReportUiState reportUiState, boolean z, boolean z2, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = reportUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = reportUiState.submitSuccess;
        }
        if ((i & 4) != 0) {
            str = reportUiState.imageUrl;
        }
        if ((i & 8) != 0) {
            str2 = reportUiState.error;
        }
        return reportUiState.copy(z, z2, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSubmitSuccess() {
        return this.submitSuccess;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ReportUiState copy(boolean isLoading, boolean submitSuccess, String imageUrl, String error) {
        return new ReportUiState(isLoading, submitSuccess, imageUrl, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReportUiState)) {
            return false;
        }
        ReportUiState reportUiState = (ReportUiState) other;
        return this.isLoading == reportUiState.isLoading && this.submitSuccess == reportUiState.submitSuccess && Intrinsics.areEqual(this.imageUrl, reportUiState.imageUrl) && Intrinsics.areEqual(this.error, reportUiState.error);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.submitSuccess)) * 31) + (this.imageUrl == null ? 0 : this.imageUrl.hashCode())) * 31) + (this.error != null ? this.error.hashCode() : 0);
    }

    public String toString() {
        return "ReportUiState(isLoading=" + this.isLoading + ", submitSuccess=" + this.submitSuccess + ", imageUrl=" + this.imageUrl + ", error=" + this.error + ")";
    }

    public ReportUiState(boolean isLoading, boolean submitSuccess, String imageUrl, String error) {
        this.isLoading = isLoading;
        this.submitSuccess = submitSuccess;
        this.imageUrl = imageUrl;
        this.error = error;
    }

    public /* synthetic */ ReportUiState(boolean z, boolean z2, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getSubmitSuccess() {
        return this.submitSuccess;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getError() {
        return this.error;
    }
}
