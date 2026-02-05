package com.yhchat.canarys.p007ui.sticker;

import com.yhchat.canarys.data.model.StickerPackDetailData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StickerPackDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J+\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/ui/sticker/StickerPackDetailUiState;", "", "isLoading", "", "error", "", "stickerPack", "Lcom/yhchat/canarys/data/model/StickerPackDetailData;", "<init>", "(ZLjava/lang/String;Lcom/yhchat/canarys/data/model/StickerPackDetailData;)V", "()Z", "getError", "()Ljava/lang/String;", "getStickerPack", "()Lcom/yhchat/canarys/data/model/StickerPackDetailData;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class StickerPackDetailUiState {
    public static final int $stable = 8;
    private final String error;
    private final boolean isLoading;
    private final StickerPackDetailData stickerPack;

    public StickerPackDetailUiState() {
        this(false, null, null, 7, null);
    }

    public static /* synthetic */ StickerPackDetailUiState copy$default(StickerPackDetailUiState stickerPackDetailUiState, boolean z, String str, StickerPackDetailData stickerPackDetailData, int i, Object obj) {
        if ((i & 1) != 0) {
            z = stickerPackDetailUiState.isLoading;
        }
        if ((i & 2) != 0) {
            str = stickerPackDetailUiState.error;
        }
        if ((i & 4) != 0) {
            stickerPackDetailData = stickerPackDetailUiState.stickerPack;
        }
        return stickerPackDetailUiState.copy(z, str, stickerPackDetailData);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final StickerPackDetailData getStickerPack() {
        return this.stickerPack;
    }

    public final StickerPackDetailUiState copy(boolean isLoading, String error, StickerPackDetailData stickerPack) {
        return new StickerPackDetailUiState(isLoading, error, stickerPack);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerPackDetailUiState)) {
            return false;
        }
        StickerPackDetailUiState stickerPackDetailUiState = (StickerPackDetailUiState) other;
        return this.isLoading == stickerPackDetailUiState.isLoading && Intrinsics.areEqual(this.error, stickerPackDetailUiState.error) && Intrinsics.areEqual(this.stickerPack, stickerPackDetailUiState.stickerPack);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + (this.stickerPack != null ? this.stickerPack.hashCode() : 0);
    }

    public String toString() {
        return "StickerPackDetailUiState(isLoading=" + this.isLoading + ", error=" + this.error + ", stickerPack=" + this.stickerPack + ")";
    }

    public StickerPackDetailUiState(boolean isLoading, String error, StickerPackDetailData stickerPack) {
        this.isLoading = isLoading;
        this.error = error;
        this.stickerPack = stickerPack;
    }

    public /* synthetic */ StickerPackDetailUiState(boolean z, String str, StickerPackDetailData stickerPackDetailData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : stickerPackDetailData);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final String getError() {
        return this.error;
    }

    public final StickerPackDetailData getStickerPack() {
        return this.stickerPack;
    }
}
