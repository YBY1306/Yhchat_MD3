package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0017\u0010\u0018J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u000eH\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00c3\u0001\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001J\t\u0010D\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001aR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001aR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001c\u00a8\u0006E"}, m169d2 = {"Lcom/yhchat/canarys/data/model/BotDetail;", "", Name.MARK, "", "botId", "", "nickname", "nicknameId", "avatarId", "avatarUrl", "type", "introduction", "createBy", "createTime", "", "headcount", "private", "isStop", "settingJson", "delFlag", "alwaysAgree", "banId", "uri", "<init>", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;JIIILjava/lang/String;IIILjava/lang/String;)V", "getId", "()I", "getBotId", "()Ljava/lang/String;", "getNickname", "getNicknameId", "getAvatarId", "getAvatarUrl", "getType", "getIntroduction", "getCreateBy", "getCreateTime", "()J", "getHeadcount", "getPrivate", "getSettingJson", "getDelFlag", "getAlwaysAgree", "getBanId", "getUri", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class BotDetail {
    public static final int $stable = 0;

    @SerializedName("alwaysAgree")
    private final int alwaysAgree;

    @SerializedName("avatarId")
    private final int avatarId;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("banId")
    private final int banId;

    @SerializedName("botId")
    private final String botId;

    @SerializedName("createBy")
    private final String createBy;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("del_flag")
    private final int delFlag;

    @SerializedName("headcount")
    private final int headcount;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("isStop")
    private final int isStop;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("nicknameId")
    private final int nicknameId;

    @SerializedName("private")
    private final int private;

    @SerializedName("settingJson")
    private final String settingJson;

    @SerializedName("type")
    private final int type;

    @SerializedName("uri")
    private final String uri;

    public static /* synthetic */ BotDetail copy$default(BotDetail botDetail, int i, String str, String str2, int i2, int i3, String str3, int i4, String str4, String str5, long j, int i5, int i6, int i7, String str6, int i8, int i9, int i10, String str7, int i11, Object obj) {
        String str8;
        int i12;
        int i13 = (i11 & 1) != 0 ? botDetail.id : i;
        String str9 = (i11 & 2) != 0 ? botDetail.botId : str;
        String str10 = (i11 & 4) != 0 ? botDetail.nickname : str2;
        int i14 = (i11 & 8) != 0 ? botDetail.nicknameId : i2;
        int i15 = (i11 & 16) != 0 ? botDetail.avatarId : i3;
        String str11 = (i11 & 32) != 0 ? botDetail.avatarUrl : str3;
        int i16 = (i11 & 64) != 0 ? botDetail.type : i4;
        String str12 = (i11 & 128) != 0 ? botDetail.introduction : str4;
        String str13 = (i11 & 256) != 0 ? botDetail.createBy : str5;
        long j2 = (i11 & 512) != 0 ? botDetail.createTime : j;
        int i17 = (i11 & 1024) != 0 ? botDetail.headcount : i5;
        int i18 = (i11 & 2048) != 0 ? botDetail.private : i6;
        int i19 = (i11 & 4096) != 0 ? botDetail.isStop : i7;
        int i20 = i13;
        String str14 = (i11 & 8192) != 0 ? botDetail.settingJson : str6;
        int i21 = (i11 & 16384) != 0 ? botDetail.delFlag : i8;
        int i22 = (i11 & 32768) != 0 ? botDetail.alwaysAgree : i9;
        int i23 = (i11 & 65536) != 0 ? botDetail.banId : i10;
        if ((i11 & 131072) != 0) {
            i12 = i23;
            str8 = botDetail.uri;
        } else {
            str8 = str7;
            i12 = i23;
        }
        return botDetail.copy(i20, str9, str10, i14, i15, str11, i16, str12, str13, j2, i17, i18, i19, str14, i21, i22, i12, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component11, reason: from getter */
    public final int getHeadcount() {
        return this.headcount;
    }

    /* renamed from: component12, reason: from getter */
    public final int getPrivate() {
        return this.private;
    }

    /* renamed from: component13, reason: from getter */
    public final int getIsStop() {
        return this.isStop;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSettingJson() {
        return this.settingJson;
    }

    /* renamed from: component15, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    /* renamed from: component16, reason: from getter */
    public final int getAlwaysAgree() {
        return this.alwaysAgree;
    }

    /* renamed from: component17, reason: from getter */
    public final int getBanId() {
        return this.banId;
    }

    /* renamed from: component18, reason: from getter */
    public final String getUri() {
        return this.uri;
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
    public final int getType() {
        return this.type;
    }

    /* renamed from: component8, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCreateBy() {
        return this.createBy;
    }

    public final BotDetail copy(int id, String botId, String nickname, int nicknameId, int avatarId, String avatarUrl, int type, String introduction, String createBy, long createTime, int headcount, int i, int isStop, String settingJson, int delFlag, int alwaysAgree, int banId, String uri) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        return new BotDetail(id, botId, nickname, nicknameId, avatarId, avatarUrl, type, introduction, createBy, createTime, headcount, i, isStop, settingJson, delFlag, alwaysAgree, banId, uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotDetail)) {
            return false;
        }
        BotDetail botDetail = (BotDetail) other;
        return this.id == botDetail.id && Intrinsics.areEqual(this.botId, botDetail.botId) && Intrinsics.areEqual(this.nickname, botDetail.nickname) && this.nicknameId == botDetail.nicknameId && this.avatarId == botDetail.avatarId && Intrinsics.areEqual(this.avatarUrl, botDetail.avatarUrl) && this.type == botDetail.type && Intrinsics.areEqual(this.introduction, botDetail.introduction) && Intrinsics.areEqual(this.createBy, botDetail.createBy) && this.createTime == botDetail.createTime && this.headcount == botDetail.headcount && this.private == botDetail.private && this.isStop == botDetail.isStop && Intrinsics.areEqual(this.settingJson, botDetail.settingJson) && this.delFlag == botDetail.delFlag && this.alwaysAgree == botDetail.alwaysAgree && this.banId == botDetail.banId && Intrinsics.areEqual(this.uri, botDetail.uri);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.botId.hashCode()) * 31) + this.nickname.hashCode()) * 31) + Integer.hashCode(this.nicknameId)) * 31) + Integer.hashCode(this.avatarId)) * 31) + this.avatarUrl.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + (this.introduction == null ? 0 : this.introduction.hashCode())) * 31) + this.createBy.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.headcount)) * 31) + Integer.hashCode(this.private)) * 31) + Integer.hashCode(this.isStop)) * 31) + (this.settingJson == null ? 0 : this.settingJson.hashCode())) * 31) + Integer.hashCode(this.delFlag)) * 31) + Integer.hashCode(this.alwaysAgree)) * 31) + Integer.hashCode(this.banId)) * 31) + (this.uri != null ? this.uri.hashCode() : 0);
    }

    public String toString() {
        return "BotDetail(id=" + this.id + ", botId=" + this.botId + ", nickname=" + this.nickname + ", nicknameId=" + this.nicknameId + ", avatarId=" + this.avatarId + ", avatarUrl=" + this.avatarUrl + ", type=" + this.type + ", introduction=" + this.introduction + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", headcount=" + this.headcount + ", private=" + this.private + ", isStop=" + this.isStop + ", settingJson=" + this.settingJson + ", delFlag=" + this.delFlag + ", alwaysAgree=" + this.alwaysAgree + ", banId=" + this.banId + ", uri=" + this.uri + ")";
    }

    public BotDetail(int id, String botId, String nickname, int nicknameId, int avatarId, String avatarUrl, int type, String introduction, String createBy, long createTime, int headcount, int i, int isStop, String settingJson, int delFlag, int alwaysAgree, int banId, String uri) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        this.id = id;
        this.botId = botId;
        this.nickname = nickname;
        this.nicknameId = nicknameId;
        this.avatarId = avatarId;
        this.avatarUrl = avatarUrl;
        this.type = type;
        this.introduction = introduction;
        this.createBy = createBy;
        this.createTime = createTime;
        this.headcount = headcount;
        this.private = i;
        this.isStop = isStop;
        this.settingJson = settingJson;
        this.delFlag = delFlag;
        this.alwaysAgree = alwaysAgree;
        this.banId = banId;
        this.uri = uri;
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

    public final int getType() {
        return this.type;
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

    public final int getPrivate() {
        return this.private;
    }

    public final int isStop() {
        return this.isStop;
    }

    public final String getSettingJson() {
        return this.settingJson;
    }

    public final int getDelFlag() {
        return this.delFlag;
    }

    public final int getAlwaysAgree() {
        return this.alwaysAgree;
    }

    public final int getBanId() {
        return this.banId;
    }

    public final String getUri() {
        return this.uri;
    }
}
