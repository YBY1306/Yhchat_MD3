package com.yhchat.canarys.data.api;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiService.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\bH\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/api/EditBotRequest;", "", "botId", "", "nickname", "introduction", "avatarUrl", "private", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getBotId", "()Ljava/lang/String;", "getNickname", "getIntroduction", "getAvatarUrl", "getPrivate", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class EditBotRequest {
    public static final int $stable = 0;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("botId")
    private final String botId;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("private")
    private final int private;

    public static /* synthetic */ EditBotRequest copy$default(EditBotRequest editBotRequest, String str, String str2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = editBotRequest.botId;
        }
        if ((i2 & 2) != 0) {
            str2 = editBotRequest.nickname;
        }
        if ((i2 & 4) != 0) {
            str3 = editBotRequest.introduction;
        }
        if ((i2 & 8) != 0) {
            str4 = editBotRequest.avatarUrl;
        }
        if ((i2 & 16) != 0) {
            i = editBotRequest.private;
        }
        int i3 = i;
        String str5 = str3;
        return editBotRequest.copy(str, str2, str5, str4, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBotId() {
        return this.botId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPrivate() {
        return this.private;
    }

    public final EditBotRequest copy(String botId, String nickname, String introduction, String avatarUrl, int i) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        return new EditBotRequest(botId, nickname, introduction, avatarUrl, i);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EditBotRequest)) {
            return false;
        }
        EditBotRequest editBotRequest = (EditBotRequest) other;
        return Intrinsics.areEqual(this.botId, editBotRequest.botId) && Intrinsics.areEqual(this.nickname, editBotRequest.nickname) && Intrinsics.areEqual(this.introduction, editBotRequest.introduction) && Intrinsics.areEqual(this.avatarUrl, editBotRequest.avatarUrl) && this.private == editBotRequest.private;
    }

    public int hashCode() {
        return (((((((this.botId.hashCode() * 31) + this.nickname.hashCode()) * 31) + this.introduction.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + Integer.hashCode(this.private);
    }

    public String toString() {
        return "EditBotRequest(botId=" + this.botId + ", nickname=" + this.nickname + ", introduction=" + this.introduction + ", avatarUrl=" + this.avatarUrl + ", private=" + this.private + ")";
    }

    public EditBotRequest(String botId, String nickname, String introduction, String avatarUrl, int i) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this.botId = botId;
        this.nickname = nickname;
        this.introduction = introduction;
        this.avatarUrl = avatarUrl;
        this.private = i;
    }

    public final String getBotId() {
        return this.botId;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final int getPrivate() {
        return this.private;
    }
}
