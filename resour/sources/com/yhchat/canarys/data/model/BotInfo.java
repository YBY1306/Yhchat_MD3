package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\u0003H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010'\u001a\u00020\rH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0013\u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BotInfo;", "", Name.MARK, "", "botId", "", "nickname", "nicknameId", "avatarId", "avatarUrl", "introduction", "createBy", "createTime", "", "headcount", "isPrivate", "<init>", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JII)V", "getId", "()I", "getBotId", "()Ljava/lang/String;", "getNickname", "getNicknameId", "getAvatarId", "getAvatarUrl", "getIntroduction", "getCreateBy", "getCreateTime", "()J", "getHeadcount", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BotInfo {
    public static final int $stable = 0;

    @SerializedName("avatarId")
    private final int avatarId;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("botId")
    private final String botId;

    @SerializedName("createBy")
    private final String createBy;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("headcount")
    private final int headcount;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("private")
    private final int isPrivate;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("nicknameId")
    private final int nicknameId;

    public static /* synthetic */ BotInfo copy$default(BotInfo botInfo, int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, long j, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = botInfo.id;
        }
        if ((i6 & 2) != 0) {
            str = botInfo.botId;
        }
        if ((i6 & 4) != 0) {
            str2 = botInfo.nickname;
        }
        if ((i6 & 8) != 0) {
            i2 = botInfo.nicknameId;
        }
        if ((i6 & 16) != 0) {
            i3 = botInfo.avatarId;
        }
        if ((i6 & 32) != 0) {
            str3 = botInfo.avatarUrl;
        }
        if ((i6 & 64) != 0) {
            str4 = botInfo.introduction;
        }
        if ((i6 & 128) != 0) {
            str5 = botInfo.createBy;
        }
        if ((i6 & 256) != 0) {
            j = botInfo.createTime;
        }
        if ((i6 & 512) != 0) {
            i4 = botInfo.headcount;
        }
        if ((i6 & 1024) != 0) {
            i5 = botInfo.isPrivate;
        }
        long j2 = j;
        String str6 = str4;
        String str7 = str5;
        int i7 = i3;
        String str8 = str3;
        String str9 = str2;
        int i8 = i2;
        return botInfo.copy(i, str, str9, i8, i7, str8, str6, str7, j2, i4, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getHeadcount() {
        return this.headcount;
    }

    /* renamed from: component11, reason: from getter */
    public final int getIsPrivate() {
        return this.isPrivate;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBotId() {
        return this.botId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component4, reason: from getter */
    public final int getNicknameId() {
        return this.nicknameId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCreateBy() {
        return this.createBy;
    }

    /* renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final BotInfo copy(int id, String botId, String nickname, int nicknameId, int avatarId, String avatarUrl, String introduction, String createBy, long createTime, int headcount, int isPrivate) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        return new BotInfo(id, botId, nickname, nicknameId, avatarId, avatarUrl, introduction, createBy, createTime, headcount, isPrivate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotInfo)) {
            return false;
        }
        BotInfo botInfo = (BotInfo) other;
        return this.id == botInfo.id && Intrinsics.areEqual(this.botId, botInfo.botId) && Intrinsics.areEqual(this.nickname, botInfo.nickname) && this.nicknameId == botInfo.nicknameId && this.avatarId == botInfo.avatarId && Intrinsics.areEqual(this.avatarUrl, botInfo.avatarUrl) && Intrinsics.areEqual(this.introduction, botInfo.introduction) && Intrinsics.areEqual(this.createBy, botInfo.createBy) && this.createTime == botInfo.createTime && this.headcount == botInfo.headcount && this.isPrivate == botInfo.isPrivate;
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.id) * 31) + this.botId.hashCode()) * 31) + this.nickname.hashCode()) * 31) + Integer.hashCode(this.nicknameId)) * 31) + Integer.hashCode(this.avatarId)) * 31) + this.avatarUrl.hashCode()) * 31) + this.introduction.hashCode()) * 31) + this.createBy.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.headcount)) * 31) + Integer.hashCode(this.isPrivate);
    }

    public String toString() {
        return "BotInfo(id=" + this.id + ", botId=" + this.botId + ", nickname=" + this.nickname + ", nicknameId=" + this.nicknameId + ", avatarId=" + this.avatarId + ", avatarUrl=" + this.avatarUrl + ", introduction=" + this.introduction + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", headcount=" + this.headcount + ", isPrivate=" + this.isPrivate + ")";
    }

    public BotInfo(int id, String botId, String nickname, int nicknameId, int avatarId, String avatarUrl, String introduction, String createBy, long createTime, int headcount, int isPrivate) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        this.id = id;
        this.botId = botId;
        this.nickname = nickname;
        this.nicknameId = nicknameId;
        this.avatarId = avatarId;
        this.avatarUrl = avatarUrl;
        this.introduction = introduction;
        this.createBy = createBy;
        this.createTime = createTime;
        this.headcount = headcount;
        this.isPrivate = isPrivate;
    }

    public final int getId() {
        return this.id;
    }

    public final String getBotId() {
        return this.botId;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final int getNicknameId() {
        return this.nicknameId;
    }

    public final int getAvatarId() {
        return this.avatarId;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final String getCreateBy() {
        return this.createBy;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getHeadcount() {
        return this.headcount;
    }

    public final int isPrivate() {
        return this.isPrivate;
    }
}
