package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b<\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00e5\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\u000fH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u00ef\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010N\u001a\u00020\u0003H\u00d6\u0001J\t\u0010O\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001eR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010 \u00a8\u0006P"}, m169d2 = {"Lcom/yhchat/canarys/data/model/CreatedBot;", "", Name.MARK, "", "botId", "", "nickname", "nicknameId", "avatarId", "avatarUrl", "token", "link", "introduction", "createBy", "createTime", "", "headcount", "private", "isStop", "settingJson", "delFlag", "alwaysAgree", "groupLimit", "banId", "linkStop", "isBigModel", "uri", "<init>", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIIILjava/lang/String;IIIIIILjava/lang/String;)V", "getId", "()I", "getBotId", "()Ljava/lang/String;", "getNickname", "getNicknameId", "getAvatarId", "getAvatarUrl", "getToken", "getLink", "getIntroduction", "getCreateBy", "getCreateTime", "()J", "getHeadcount", "getPrivate", "getSettingJson", "getDelFlag", "getAlwaysAgree", "getGroupLimit", "getBanId", "getLinkStop", "getUri", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CreatedBot {
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

    @SerializedName("groupLimit")
    private final int groupLimit;

    @SerializedName("headcount")
    private final int headcount;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("introduction")
    private final String introduction;

    @SerializedName("isBigModel")
    private final int isBigModel;

    @SerializedName("isStop")
    private final int isStop;

    @SerializedName("link")
    private final String link;

    @SerializedName("linkStop")
    private final int linkStop;

    @SerializedName("nickname")
    private final String nickname;

    @SerializedName("nicknameId")
    private final int nicknameId;

    @SerializedName("private")
    private final int private;

    @SerializedName("settingJson")
    private final String settingJson;

    @SerializedName("token")
    private final String token;

    @SerializedName("uri")
    private final String uri;

    public static /* synthetic */ CreatedBot copy$default(CreatedBot createdBot, int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6, String str7, long j, int i4, int i5, int i6, String str8, int i7, int i8, int i9, int i10, int i11, int i12, String str9, int i13, Object obj) {
        String str10;
        int i14;
        int i15 = (i13 & 1) != 0 ? createdBot.id : i;
        String str11 = (i13 & 2) != 0 ? createdBot.botId : str;
        String str12 = (i13 & 4) != 0 ? createdBot.nickname : str2;
        int i16 = (i13 & 8) != 0 ? createdBot.nicknameId : i2;
        int i17 = (i13 & 16) != 0 ? createdBot.avatarId : i3;
        String str13 = (i13 & 32) != 0 ? createdBot.avatarUrl : str3;
        String str14 = (i13 & 64) != 0 ? createdBot.token : str4;
        String str15 = (i13 & 128) != 0 ? createdBot.link : str5;
        String str16 = (i13 & 256) != 0 ? createdBot.introduction : str6;
        String str17 = (i13 & 512) != 0 ? createdBot.createBy : str7;
        long j2 = (i13 & 1024) != 0 ? createdBot.createTime : j;
        int i18 = (i13 & 2048) != 0 ? createdBot.headcount : i4;
        int i19 = (i13 & 4096) != 0 ? createdBot.private : i5;
        int i20 = i15;
        int i21 = (i13 & 8192) != 0 ? createdBot.isStop : i6;
        String str18 = (i13 & 16384) != 0 ? createdBot.settingJson : str8;
        int i22 = (i13 & 32768) != 0 ? createdBot.delFlag : i7;
        int i23 = (i13 & 65536) != 0 ? createdBot.alwaysAgree : i8;
        int i24 = (i13 & 131072) != 0 ? createdBot.groupLimit : i9;
        int i25 = (i13 & 262144) != 0 ? createdBot.banId : i10;
        int i26 = (i13 & 524288) != 0 ? createdBot.linkStop : i11;
        int i27 = (i13 & 1048576) != 0 ? createdBot.isBigModel : i12;
        if ((i13 & 2097152) != 0) {
            i14 = i27;
            str10 = createdBot.uri;
        } else {
            str10 = str9;
            i14 = i27;
        }
        return createdBot.copy(i20, str11, str12, i16, i17, str13, str14, str15, str16, str17, j2, i18, i19, i21, str18, i22, i23, i24, i25, i26, i14, str10);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCreateBy() {
        return this.createBy;
    }

    /* renamed from: component11, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component12, reason: from getter */
    public final int getHeadcount() {
        return this.headcount;
    }

    /* renamed from: component13, reason: from getter */
    public final int getPrivate() {
        return this.private;
    }

    /* renamed from: component14, reason: from getter */
    public final int getIsStop() {
        return this.isStop;
    }

    /* renamed from: component15, reason: from getter */
    public final String getSettingJson() {
        return this.settingJson;
    }

    /* renamed from: component16, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    /* renamed from: component17, reason: from getter */
    public final int getAlwaysAgree() {
        return this.alwaysAgree;
    }

    /* renamed from: component18, reason: from getter */
    public final int getGroupLimit() {
        return this.groupLimit;
    }

    /* renamed from: component19, reason: from getter */
    public final int getBanId() {
        return this.banId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBotId() {
        return this.botId;
    }

    /* renamed from: component20, reason: from getter */
    public final int getLinkStop() {
        return this.linkStop;
    }

    /* renamed from: component21, reason: from getter */
    public final int getIsBigModel() {
        return this.isBigModel;
    }

    /* renamed from: component22, reason: from getter */
    public final String getUri() {
        return this.uri;
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
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component8, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    public final CreatedBot copy(int id, String botId, String nickname, int nicknameId, int avatarId, String avatarUrl, String token, String link, String introduction, String createBy, long createTime, int headcount, int i, int isStop, String settingJson, int delFlag, int alwaysAgree, int groupLimit, int banId, int linkStop, int isBigModel, String uri) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        return new CreatedBot(id, botId, nickname, nicknameId, avatarId, avatarUrl, token, link, introduction, createBy, createTime, headcount, i, isStop, settingJson, delFlag, alwaysAgree, groupLimit, banId, linkStop, isBigModel, uri);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreatedBot)) {
            return false;
        }
        CreatedBot createdBot = (CreatedBot) other;
        return this.id == createdBot.id && Intrinsics.areEqual(this.botId, createdBot.botId) && Intrinsics.areEqual(this.nickname, createdBot.nickname) && this.nicknameId == createdBot.nicknameId && this.avatarId == createdBot.avatarId && Intrinsics.areEqual(this.avatarUrl, createdBot.avatarUrl) && Intrinsics.areEqual(this.token, createdBot.token) && Intrinsics.areEqual(this.link, createdBot.link) && Intrinsics.areEqual(this.introduction, createdBot.introduction) && Intrinsics.areEqual(this.createBy, createdBot.createBy) && this.createTime == createdBot.createTime && this.headcount == createdBot.headcount && this.private == createdBot.private && this.isStop == createdBot.isStop && Intrinsics.areEqual(this.settingJson, createdBot.settingJson) && this.delFlag == createdBot.delFlag && this.alwaysAgree == createdBot.alwaysAgree && this.groupLimit == createdBot.groupLimit && this.banId == createdBot.banId && this.linkStop == createdBot.linkStop && this.isBigModel == createdBot.isBigModel && Intrinsics.areEqual(this.uri, createdBot.uri);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + this.botId.hashCode()) * 31) + this.nickname.hashCode()) * 31) + Integer.hashCode(this.nicknameId)) * 31) + Integer.hashCode(this.avatarId)) * 31) + this.avatarUrl.hashCode()) * 31) + (this.token == null ? 0 : this.token.hashCode())) * 31) + (this.link == null ? 0 : this.link.hashCode())) * 31) + this.introduction.hashCode()) * 31) + (this.createBy == null ? 0 : this.createBy.hashCode())) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.headcount)) * 31) + Integer.hashCode(this.private)) * 31) + Integer.hashCode(this.isStop)) * 31) + (this.settingJson == null ? 0 : this.settingJson.hashCode())) * 31) + Integer.hashCode(this.delFlag)) * 31) + Integer.hashCode(this.alwaysAgree)) * 31) + Integer.hashCode(this.groupLimit)) * 31) + Integer.hashCode(this.banId)) * 31) + Integer.hashCode(this.linkStop)) * 31) + Integer.hashCode(this.isBigModel)) * 31) + (this.uri != null ? this.uri.hashCode() : 0);
    }

    public String toString() {
        return "CreatedBot(id=" + this.id + ", botId=" + this.botId + ", nickname=" + this.nickname + ", nicknameId=" + this.nicknameId + ", avatarId=" + this.avatarId + ", avatarUrl=" + this.avatarUrl + ", token=" + this.token + ", link=" + this.link + ", introduction=" + this.introduction + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", headcount=" + this.headcount + ", private=" + this.private + ", isStop=" + this.isStop + ", settingJson=" + this.settingJson + ", delFlag=" + this.delFlag + ", alwaysAgree=" + this.alwaysAgree + ", groupLimit=" + this.groupLimit + ", banId=" + this.banId + ", linkStop=" + this.linkStop + ", isBigModel=" + this.isBigModel + ", uri=" + this.uri + ")";
    }

    public CreatedBot(int id, String botId, String nickname, int nicknameId, int avatarId, String avatarUrl, String token, String link, String introduction, String createBy, long createTime, int headcount, int i, int isStop, String settingJson, int delFlag, int alwaysAgree, int groupLimit, int banId, int linkStop, int isBigModel, String uri) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        this.id = id;
        this.botId = botId;
        this.nickname = nickname;
        this.nicknameId = nicknameId;
        this.avatarId = avatarId;
        this.avatarUrl = avatarUrl;
        this.token = token;
        this.link = link;
        this.introduction = introduction;
        this.createBy = createBy;
        this.createTime = createTime;
        this.headcount = headcount;
        this.private = i;
        this.isStop = isStop;
        this.settingJson = settingJson;
        this.delFlag = delFlag;
        this.alwaysAgree = alwaysAgree;
        this.groupLimit = groupLimit;
        this.banId = banId;
        this.linkStop = linkStop;
        this.isBigModel = isBigModel;
        this.uri = uri;
    }

    public /* synthetic */ CreatedBot(int i, String str, String str2, int i2, int i3, String str3, String str4, String str5, String str6, String str7, long j, int i4, int i5, int i6, String str8, int i7, int i8, int i9, int i10, int i11, int i12, String str9, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i, str, str2, (i13 & 8) != 0 ? 0 : i2, (i13 & 16) != 0 ? 0 : i3, str3, (i13 & 64) != 0 ? null : str4, (i13 & 128) != 0 ? null : str5, str6, (i13 & 512) != 0 ? null : str7, (i13 & 1024) != 0 ? 0L : j, (i13 & 2048) != 0 ? 0 : i4, (i13 & 4096) != 0 ? 0 : i5, (i13 & 8192) != 0 ? 0 : i6, (i13 & 16384) != 0 ? null : str8, (32768 & i13) != 0 ? 0 : i7, (65536 & i13) != 0 ? 0 : i8, (131072 & i13) != 0 ? 0 : i9, (262144 & i13) != 0 ? 0 : i10, (524288 & i13) != 0 ? 0 : i11, (1048576 & i13) != 0 ? 0 : i12, (i13 & 2097152) != 0 ? null : str9);
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

    public final String getToken() {
        return this.token;
    }

    public final String getLink() {
        return this.link;
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

    public final int getGroupLimit() {
        return this.groupLimit;
    }

    public final int getBanId() {
        return this.banId;
    }

    public final int getLinkStop() {
        return this.linkStop;
    }

    public final int isBigModel() {
        return this.isBigModel;
    }

    public final String getUri() {
        return this.uri;
    }
}
