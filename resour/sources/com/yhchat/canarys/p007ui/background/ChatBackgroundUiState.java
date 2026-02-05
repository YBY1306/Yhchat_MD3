package com.yhchat.canarys.p007ui.background;

import com.yhchat.canarys.data.model.ChatBackground;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatBackgroundActivity.kt */
@Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nH\u00c6\u0003JC\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\nH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/ui/background/ChatBackgroundUiState;", "", "isLoading", "", "isUploading", "backgrounds", "", "Lcom/yhchat/canarys/data/model/ChatBackground;", "setSuccess", "error", "", "<init>", "(ZZLjava/util/List;ZLjava/lang/String;)V", "()Z", "getBackgrounds", "()Ljava/util/List;", "getSetSuccess", "getError", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ChatBackgroundUiState {
    public static final int $stable = 8;
    private final List<ChatBackground> backgrounds;
    private final String error;
    private final boolean isLoading;
    private final boolean isUploading;
    private final boolean setSuccess;

    public ChatBackgroundUiState() {
        this(false, false, null, false, null, 31, null);
    }

    public static /* synthetic */ ChatBackgroundUiState copy$default(ChatBackgroundUiState chatBackgroundUiState, boolean z, boolean z2, List list, boolean z3, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = chatBackgroundUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = chatBackgroundUiState.isUploading;
        }
        if ((i & 4) != 0) {
            list = chatBackgroundUiState.backgrounds;
        }
        if ((i & 8) != 0) {
            z3 = chatBackgroundUiState.setSuccess;
        }
        if ((i & 16) != 0) {
            str = chatBackgroundUiState.error;
        }
        String str2 = str;
        List list2 = list;
        return chatBackgroundUiState.copy(z, z2, list2, z3, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsUploading() {
        return this.isUploading;
    }

    public final List<ChatBackground> component3() {
        return this.backgrounds;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSetSuccess() {
        return this.setSuccess;
    }

    /* renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final ChatBackgroundUiState copy(boolean isLoading, boolean isUploading, List<ChatBackground> backgrounds, boolean setSuccess, String error) {
        Intrinsics.checkNotNullParameter(backgrounds, "backgrounds");
        return new ChatBackgroundUiState(isLoading, isUploading, backgrounds, setSuccess, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatBackgroundUiState)) {
            return false;
        }
        ChatBackgroundUiState chatBackgroundUiState = (ChatBackgroundUiState) other;
        return this.isLoading == chatBackgroundUiState.isLoading && this.isUploading == chatBackgroundUiState.isUploading && Intrinsics.areEqual(this.backgrounds, chatBackgroundUiState.backgrounds) && this.setSuccess == chatBackgroundUiState.setSuccess && Intrinsics.areEqual(this.error, chatBackgroundUiState.error);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isUploading)) * 31) + this.backgrounds.hashCode()) * 31) + Boolean.hashCode(this.setSuccess)) * 31) + (this.error == null ? 0 : this.error.hashCode());
    }

    public String toString() {
        return "ChatBackgroundUiState(isLoading=" + this.isLoading + ", isUploading=" + this.isUploading + ", backgrounds=" + this.backgrounds + ", setSuccess=" + this.setSuccess + ", error=" + this.error + ")";
    }

    public ChatBackgroundUiState(boolean isLoading, boolean isUploading, List<ChatBackground> backgrounds, boolean setSuccess, String error) {
        Intrinsics.checkNotNullParameter(backgrounds, "backgrounds");
        this.isLoading = isLoading;
        this.isUploading = isUploading;
        this.backgrounds = backgrounds;
        this.setSuccess = setSuccess;
        this.error = error;
    }

    public /* synthetic */ ChatBackgroundUiState(boolean z, boolean z2, List list, boolean z3, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : str);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isUploading() {
        return this.isUploading;
    }

    public final List<ChatBackground> getBackgrounds() {
        return this.backgrounds;
    }

    public final boolean getSetSuccess() {
        return this.setSuccess;
    }

    public final String getError() {
        return this.error;
    }
}
