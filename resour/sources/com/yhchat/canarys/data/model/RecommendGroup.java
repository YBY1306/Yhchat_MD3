package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u000bH\u00c6\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\u0005H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/data/model/RecommendGroup;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", "banId", "", "nickname", "introduction", "avatarUrl", "headcount", "createTime", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;IJ)V", "getChatId", "()Ljava/lang/String;", "getBanId", "()I", "getNickname", "getIntroduction", "getAvatarUrl", "getHeadcount", "getCreateTime", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RecommendGroup {
    public static final int $stable = 0;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("banId")
    private final int banId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("headcount")
    private final int headcount;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("nickname")
    private final String nickname;

    public static /* synthetic */ RecommendGroup copy$default(RecommendGroup recommendGroup, String str, int i, String str2, String str3, String str4, int i2, long j, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = recommendGroup.chatId;
        }
        if ((i3 & 2) != 0) {
            i = recommendGroup.banId;
        }
        if ((i3 & 4) != 0) {
            str2 = recommendGroup.nickname;
        }
        if ((i3 & 8) != 0) {
            str3 = recommendGroup.introduction;
        }
        if ((i3 & 16) != 0) {
            str4 = recommendGroup.avatarUrl;
        }
        if ((i3 & 32) != 0) {
            i2 = recommendGroup.headcount;
        }
        if ((i3 & 64) != 0) {
            j = recommendGroup.createTime;
        }
        long j2 = j;
        String str5 = str4;
        int i4 = i2;
        return recommendGroup.copy(str, i, str2, str3, str5, i4, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBanId() {
        return this.banId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final int getHeadcount() {
        return this.headcount;
    }

    /* renamed from: component7, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final RecommendGroup copy(String chatId, int banId, String nickname, String introduction, String avatarUrl, int headcount, long createTime) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        return new RecommendGroup(chatId, banId, nickname, introduction, avatarUrl, headcount, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecommendGroup)) {
            return false;
        }
        RecommendGroup recommendGroup = (RecommendGroup) other;
        return Intrinsics.areEqual(this.chatId, recommendGroup.chatId) && this.banId == recommendGroup.banId && Intrinsics.areEqual(this.nickname, recommendGroup.nickname) && Intrinsics.areEqual(this.introduction, recommendGroup.introduction) && Intrinsics.areEqual(this.avatarUrl, recommendGroup.avatarUrl) && this.headcount == recommendGroup.headcount && this.createTime == recommendGroup.createTime;
    }

    public int hashCode() {
        return (((((((((((this.chatId.hashCode() * 31) + Integer.hashCode(this.banId)) * 31) + this.nickname.hashCode()) * 31) + (this.introduction == null ? 0 : this.introduction.hashCode())) * 31) + (this.avatarUrl != null ? this.avatarUrl.hashCode() : 0)) * 31) + Integer.hashCode(this.headcount)) * 31) + Long.hashCode(this.createTime);
    }

    public String toString() {
        return "RecommendGroup(chatId=" + this.chatId + ", banId=" + this.banId + ", nickname=" + this.nickname + ", introduction=" + this.introduction + ", avatarUrl=" + this.avatarUrl + ", headcount=" + this.headcount + ", createTime=" + this.createTime + ")";
    }

    public RecommendGroup(String chatId, int banId, String nickname, String introduction, String avatarUrl, int headcount, long createTime) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this.chatId = chatId;
        this.banId = banId;
        this.nickname = nickname;
        this.introduction = introduction;
        this.avatarUrl = avatarUrl;
        this.headcount = headcount;
        this.createTime = createTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ RecommendGroup(String str, int i, String str2, String str3, String str4, int i2, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        int i4;
        if ((i3 & 2) == 0) {
            i4 = i;
        } else {
            i4 = 0;
        }
        this(str, i4, str2, str3, str4, i2, j);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getBanId() {
        return this.banId;
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

    public final int getHeadcount() {
        return this.headcount;
    }

    public final long getCreateTime() {
        return this.createTime;
    }
}
