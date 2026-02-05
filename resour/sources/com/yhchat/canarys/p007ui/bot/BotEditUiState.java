package com.yhchat.canarys.p007ui.bot;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotEditViewModel.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\bH\u00c6\u0003J\t\u0010 \u001a\u00020\bH\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003Jo\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020\u00032\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010'\u001a\u00020\bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0010\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotEditUiState;", "", "isLoading", "", "isUploading", "isSaving", "saveSuccess", "error", "", "botId", "avatarUrl", "nickname", "introduction", "isPrivate", "<init>", "(ZZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "getSaveSuccess", "getError", "()Ljava/lang/String;", "getBotId", "getAvatarUrl", "getNickname", "getIntroduction", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BotEditUiState {
    public static final int $stable = 0;
    private final String avatarUrl;
    private final String botId;
    private final String error;
    private final String introduction;
    private final boolean isLoading;
    private final boolean isPrivate;
    private final boolean isSaving;
    private final boolean isUploading;
    private final String nickname;
    private final boolean saveSuccess;

    public BotEditUiState() {
        this(false, false, false, false, null, null, null, null, null, false, 1023, null);
    }

    public static /* synthetic */ BotEditUiState copy$default(BotEditUiState botEditUiState, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = botEditUiState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = botEditUiState.isUploading;
        }
        if ((i & 4) != 0) {
            z3 = botEditUiState.isSaving;
        }
        if ((i & 8) != 0) {
            z4 = botEditUiState.saveSuccess;
        }
        if ((i & 16) != 0) {
            str = botEditUiState.error;
        }
        if ((i & 32) != 0) {
            str2 = botEditUiState.botId;
        }
        if ((i & 64) != 0) {
            str3 = botEditUiState.avatarUrl;
        }
        if ((i & 128) != 0) {
            str4 = botEditUiState.nickname;
        }
        if ((i & 256) != 0) {
            str5 = botEditUiState.introduction;
        }
        if ((i & 512) != 0) {
            z5 = botEditUiState.isPrivate;
        }
        String str6 = str5;
        boolean z6 = z5;
        String str7 = str3;
        String str8 = str4;
        String str9 = str;
        String str10 = str2;
        return botEditUiState.copy(z, z2, z3, z4, str9, str10, str7, str8, str6, z6);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsUploading() {
        return this.isUploading;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSaving() {
        return this.isSaving;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getSaveSuccess() {
        return this.saveSuccess;
    }

    /* renamed from: component5, reason: from getter */
    public final String getError() {
        return this.error;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBotId() {
        return this.botId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component8, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    public final BotEditUiState copy(boolean isLoading, boolean isUploading, boolean isSaving, boolean saveSuccess, String error, String botId, String avatarUrl, String nickname, String introduction, boolean isPrivate) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        return new BotEditUiState(isLoading, isUploading, isSaving, saveSuccess, error, botId, avatarUrl, nickname, introduction, isPrivate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotEditUiState)) {
            return false;
        }
        BotEditUiState botEditUiState = (BotEditUiState) other;
        return this.isLoading == botEditUiState.isLoading && this.isUploading == botEditUiState.isUploading && this.isSaving == botEditUiState.isSaving && this.saveSuccess == botEditUiState.saveSuccess && Intrinsics.areEqual(this.error, botEditUiState.error) && Intrinsics.areEqual(this.botId, botEditUiState.botId) && Intrinsics.areEqual(this.avatarUrl, botEditUiState.avatarUrl) && Intrinsics.areEqual(this.nickname, botEditUiState.nickname) && Intrinsics.areEqual(this.introduction, botEditUiState.introduction) && this.isPrivate == botEditUiState.isPrivate;
    }

    public int hashCode() {
        return (((((((((((((((((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.isUploading)) * 31) + Boolean.hashCode(this.isSaving)) * 31) + Boolean.hashCode(this.saveSuccess)) * 31) + (this.error == null ? 0 : this.error.hashCode())) * 31) + this.botId.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.nickname.hashCode()) * 31) + this.introduction.hashCode()) * 31) + Boolean.hashCode(this.isPrivate);
    }

    public String toString() {
        return "BotEditUiState(isLoading=" + this.isLoading + ", isUploading=" + this.isUploading + ", isSaving=" + this.isSaving + ", saveSuccess=" + this.saveSuccess + ", error=" + this.error + ", botId=" + this.botId + ", avatarUrl=" + this.avatarUrl + ", nickname=" + this.nickname + ", introduction=" + this.introduction + ", isPrivate=" + this.isPrivate + ")";
    }

    public BotEditUiState(boolean isLoading, boolean isUploading, boolean isSaving, boolean saveSuccess, String error, String botId, String avatarUrl, String nickname, String introduction, boolean isPrivate) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        this.isLoading = isLoading;
        this.isUploading = isUploading;
        this.isSaving = isSaving;
        this.saveSuccess = saveSuccess;
        this.error = error;
        this.botId = botId;
        this.avatarUrl = avatarUrl;
        this.nickname = nickname;
        this.introduction = introduction;
        this.isPrivate = isPrivate;
    }

    public /* synthetic */ BotEditUiState(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, String str3, String str4, String str5, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? null : str, (i & 32) != 0 ? "" : str2, (i & 64) != 0 ? "" : str3, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? false : z5);
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean isUploading() {
        return this.isUploading;
    }

    public final boolean isSaving() {
        return this.isSaving;
    }

    public final boolean getSaveSuccess() {
        return this.saveSuccess;
    }

    public final String getError() {
        return this.error;
    }

    public final String getBotId() {
        return this.botId;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }
}
