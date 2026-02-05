package com.yhchat.canarys.data.api;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/data/api/EditBoardRequest;", "", "baId", "", HintConstants.AUTOFILL_HINT_NAME, "", "avatar", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getBaId", "()I", "getName", "()Ljava/lang/String;", "getAvatar", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EditBoardRequest {
    public static final int $stable = 0;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("baId")
    private final int baId;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    public static /* synthetic */ EditBoardRequest copy$default(EditBoardRequest editBoardRequest, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = editBoardRequest.baId;
        }
        if ((i2 & 2) != 0) {
            str = editBoardRequest.name;
        }
        if ((i2 & 4) != 0) {
            str2 = editBoardRequest.avatar;
        }
        return editBoardRequest.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBaId() {
        return this.baId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    public final EditBoardRequest copy(int baId, String name, String avatar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new EditBoardRequest(baId, name, avatar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditBoardRequest)) {
            return false;
        }
        EditBoardRequest editBoardRequest = (EditBoardRequest) other;
        return this.baId == editBoardRequest.baId && Intrinsics.areEqual(this.name, editBoardRequest.name) && Intrinsics.areEqual(this.avatar, editBoardRequest.avatar);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.baId) * 31) + this.name.hashCode()) * 31) + this.avatar.hashCode();
    }

    public String toString() {
        return "EditBoardRequest(baId=" + this.baId + ", name=" + this.name + ", avatar=" + this.avatar + ")";
    }

    public EditBoardRequest(int baId, String name, String avatar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.baId = baId;
        this.name = name;
        this.avatar = avatar;
    }

    public final int getBaId() {
        return this.baId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatar() {
        return this.avatar;
    }
}
