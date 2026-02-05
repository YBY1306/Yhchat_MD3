package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Sticker.kt */
@Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/data/model/StickerPackDetailData;", "", "stickerPack", "Lcom/yhchat/canarys/data/model/StickerPack;", "user", "Lcom/yhchat/canarys/data/model/StickerPackCreator;", "<init>", "(Lcom/yhchat/canarys/data/model/StickerPack;Lcom/yhchat/canarys/data/model/StickerPackCreator;)V", "getStickerPack", "()Lcom/yhchat/canarys/data/model/StickerPack;", "getUser", "()Lcom/yhchat/canarys/data/model/StickerPackCreator;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class StickerPackDetailData {
    public static final int $stable = 8;

    @SerializedName("stickerPack")
    private final StickerPack stickerPack;

    @SerializedName("user")
    private final StickerPackCreator user;

    public static /* synthetic */ StickerPackDetailData copy$default(StickerPackDetailData stickerPackDetailData, StickerPack stickerPack, StickerPackCreator stickerPackCreator, int i, Object obj) {
        if ((i & 1) != 0) {
            stickerPack = stickerPackDetailData.stickerPack;
        }
        if ((i & 2) != 0) {
            stickerPackCreator = stickerPackDetailData.user;
        }
        return stickerPackDetailData.copy(stickerPack, stickerPackCreator);
    }

    /* renamed from: component1, reason: from getter */
    public final StickerPack getStickerPack() {
        return this.stickerPack;
    }

    /* renamed from: component2, reason: from getter */
    public final StickerPackCreator getUser() {
        return this.user;
    }

    public final StickerPackDetailData copy(StickerPack stickerPack, StickerPackCreator user) {
        Intrinsics.checkNotNullParameter(stickerPack, "stickerPack");
        return new StickerPackDetailData(stickerPack, user);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickerPackDetailData)) {
            return false;
        }
        StickerPackDetailData stickerPackDetailData = (StickerPackDetailData) other;
        return Intrinsics.areEqual(this.stickerPack, stickerPackDetailData.stickerPack) && Intrinsics.areEqual(this.user, stickerPackDetailData.user);
    }

    public int hashCode() {
        return (this.stickerPack.hashCode() * 31) + (this.user == null ? 0 : this.user.hashCode());
    }

    public String toString() {
        return "StickerPackDetailData(stickerPack=" + this.stickerPack + ", user=" + this.user + ")";
    }

    public StickerPackDetailData(StickerPack stickerPack, StickerPackCreator user) {
        Intrinsics.checkNotNullParameter(stickerPack, "stickerPack");
        this.stickerPack = stickerPack;
        this.user = user;
    }

    public final StickerPack getStickerPack() {
        return this.stickerPack;
    }

    public final StickerPackCreator getUser() {
        return this.user;
    }
}
