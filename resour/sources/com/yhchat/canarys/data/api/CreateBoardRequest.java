package com.yhchat.canarys.data.api;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/data/api/CreateBoardRequest;", "", HintConstants.AUTOFILL_HINT_NAME, "", "avatar", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getAvatar", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CreateBoardRequest {
    public static final int $stable = 0;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    public static /* synthetic */ CreateBoardRequest copy$default(CreateBoardRequest createBoardRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createBoardRequest.name;
        }
        if ((i & 2) != 0) {
            str2 = createBoardRequest.avatar;
        }
        return createBoardRequest.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    public final CreateBoardRequest copy(String name, String avatar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        return new CreateBoardRequest(name, avatar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateBoardRequest)) {
            return false;
        }
        CreateBoardRequest createBoardRequest = (CreateBoardRequest) other;
        return Intrinsics.areEqual(this.name, createBoardRequest.name) && Intrinsics.areEqual(this.avatar, createBoardRequest.avatar);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.avatar.hashCode();
    }

    public String toString() {
        return "CreateBoardRequest(name=" + this.name + ", avatar=" + this.avatar + ")";
    }

    public CreateBoardRequest(String name, String avatar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        this.name = name;
        this.avatar = avatar;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatar() {
        return this.avatar;
    }
}
