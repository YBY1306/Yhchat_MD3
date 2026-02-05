package com.yhchat.canarys.data.model;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Community.kt */
@Metadata(m168d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00e5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010!\u001a\u00020\u0003\u00a2\u0006\u0004\b\"\u0010#J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0006H\u00c6\u0003J\t\u0010H\u001a\u00020\u0006H\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u0006H\u00c6\u0003J\t\u0010K\u001a\u00020\u000eH\u00c6\u0003J\t\u0010L\u001a\u00020\u000eH\u00c6\u0003J\t\u0010M\u001a\u00020\u000eH\u00c6\u0003J\t\u0010N\u001a\u00020\u000eH\u00c6\u0003J\t\u0010O\u001a\u00020\u000eH\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\u0003H\u00c6\u0003J\t\u0010S\u001a\u00020\u0017H\u00c6\u0003J\t\u0010T\u001a\u00020\u0006H\u00c6\u0003J\t\u0010U\u001a\u00020\u0006H\u00c6\u0003J\t\u0010V\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001cH\u00c6\u0003J\t\u0010X\u001a\u00020\u0006H\u00c6\u0003J\t\u0010Y\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Z\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003\u00a2\u0006\u0002\u0010@J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\u00a0\u0002\u0010]\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u00062\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010!\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010^J\u0013\u0010_\u001a\u00020`2\b\u0010a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010c\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010%R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010%R\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010%R\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0016\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0016\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0016\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00100R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010%R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0016\u0010\u0018\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010(R\u0016\u0010\u0019\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010(R\u0016\u0010\u001a\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010(R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\u001d\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010(R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010%R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010%R\u001a\u0010 \u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0016\u0010!\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010%\u00a8\u0006d"}, m169d2 = {"Lcom/yhchat/canarys/data/model/CommunityPost;", "", Name.MARK, "", "baId", "senderId", "", "senderNicknameId", "senderAvatarId", "groupId", "title", "contentType", "content", "delTime", "", "createTime", "updateTime", "editTime", "lastActive", "likeNum", "commentNum", "collectNum", "amountNum", "", "senderNickname", "senderAvatar", "createTimeText", "group", "Lcom/yhchat/canarys/data/model/CommunityGroup;", "isLiked", "isCollected", "isReward", "score", "isVip", "<init>", "(IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;JJJJJIIIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/data/model/CommunityGroup;Ljava/lang/String;IILjava/lang/Double;I)V", "getId", "()I", "getBaId", "getSenderId", "()Ljava/lang/String;", "getSenderNicknameId", "getSenderAvatarId", "getGroupId", "getTitle", "getContentType", "getContent", "getDelTime", "()J", "getCreateTime", "getUpdateTime", "getEditTime", "getLastActive", "getLikeNum", "getCommentNum", "getCollectNum", "getAmountNum", "()D", "getSenderNickname", "getSenderAvatar", "getCreateTimeText", "getGroup", "()Lcom/yhchat/canarys/data/model/CommunityGroup;", "getScore", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "(IILjava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/String;JJJJJIIIDLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/data/model/CommunityGroup;Ljava/lang/String;IILjava/lang/Double;I)Lcom/yhchat/canarys/data/model/CommunityPost;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CommunityPost {
    public static final int $stable = 0;

    @SerializedName("amountNum")
    private final double amountNum;

    @SerializedName("baId")
    private final int baId;

    @SerializedName("collectNum")
    private final int collectNum;

    @SerializedName("commentNum")
    private final int commentNum;

    @SerializedName("content")
    private final String content;

    @SerializedName("contentType")
    private final int contentType;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("createTimeText")
    private final String createTimeText;

    @SerializedName("delTime")
    private final long delTime;

    @SerializedName("editTime")
    private final long editTime;

    @SerializedName("group")
    private final CommunityGroup group;

    @SerializedName("groupId")
    private final String groupId;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("isCollected")
    private final int isCollected;

    @SerializedName("isLiked")
    private final String isLiked;

    @SerializedName("isReward")
    private final int isReward;

    @SerializedName("isVip")
    private final int isVip;

    @SerializedName("lastActive")
    private final long lastActive;

    @SerializedName("likeNum")
    private final int likeNum;

    @SerializedName("score")
    private final Double score;

    @SerializedName("senderAvatar")
    private final String senderAvatar;

    @SerializedName("senderAvatarId")
    private final int senderAvatarId;

    @SerializedName("senderId")
    private final String senderId;

    @SerializedName("senderNickname")
    private final String senderNickname;

    @SerializedName("senderNicknameId")
    private final int senderNicknameId;

    @SerializedName("title")
    private final String title;

    @SerializedName("updateTime")
    private final long updateTime;

    public static /* synthetic */ CommunityPost copy$default(CommunityPost communityPost, int i, int i2, String str, int i3, int i4, String str2, String str3, int i5, String str4, long j, long j2, long j3, long j4, long j5, int i6, int i7, int i8, double d, String str5, String str6, String str7, CommunityGroup communityGroup, String str8, int i9, int i10, Double d2, int i11, int i12, Object obj) {
        int i13;
        Double d3;
        int i14 = (i12 & 1) != 0 ? communityPost.id : i;
        int i15 = (i12 & 2) != 0 ? communityPost.baId : i2;
        String str9 = (i12 & 4) != 0 ? communityPost.senderId : str;
        int i16 = (i12 & 8) != 0 ? communityPost.senderNicknameId : i3;
        int i17 = (i12 & 16) != 0 ? communityPost.senderAvatarId : i4;
        String str10 = (i12 & 32) != 0 ? communityPost.groupId : str2;
        String str11 = (i12 & 64) != 0 ? communityPost.title : str3;
        int i18 = (i12 & 128) != 0 ? communityPost.contentType : i5;
        String str12 = (i12 & 256) != 0 ? communityPost.content : str4;
        long j6 = (i12 & 512) != 0 ? communityPost.delTime : j;
        long j7 = (i12 & 1024) != 0 ? communityPost.createTime : j2;
        int i19 = i14;
        int i20 = i15;
        long j8 = (i12 & 2048) != 0 ? communityPost.updateTime : j3;
        long j9 = (i12 & 4096) != 0 ? communityPost.editTime : j4;
        long j10 = (i12 & 8192) != 0 ? communityPost.lastActive : j5;
        int i21 = (i12 & 16384) != 0 ? communityPost.likeNum : i6;
        int i22 = (i12 & 32768) != 0 ? communityPost.commentNum : i7;
        int i23 = (i12 & 65536) != 0 ? communityPost.collectNum : i8;
        long j11 = j10;
        double d4 = (i12 & 131072) != 0 ? communityPost.amountNum : d;
        String str13 = (i12 & 262144) != 0 ? communityPost.senderNickname : str5;
        double d5 = d4;
        String str14 = (i12 & 524288) != 0 ? communityPost.senderAvatar : str6;
        String str15 = (i12 & 1048576) != 0 ? communityPost.createTimeText : str7;
        String str16 = str14;
        CommunityGroup communityGroup2 = (i12 & 2097152) != 0 ? communityPost.group : communityGroup;
        String str17 = (i12 & 4194304) != 0 ? communityPost.isLiked : str8;
        int i24 = (i12 & 8388608) != 0 ? communityPost.isCollected : i9;
        int i25 = (i12 & 16777216) != 0 ? communityPost.isReward : i10;
        Double d6 = (i12 & 33554432) != 0 ? communityPost.score : d2;
        if ((i12 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0) {
            d3 = d6;
            i13 = communityPost.isVip;
        } else {
            i13 = i11;
            d3 = d6;
        }
        return communityPost.copy(i19, i20, str9, i16, i17, str10, str11, i18, str12, j6, j7, j8, j9, j11, i21, i22, i23, d5, str13, str16, str15, communityGroup2, str17, i24, i25, d3, i13);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final long getDelTime() {
        return this.delTime;
    }

    /* renamed from: component11, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component12, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    /* renamed from: component13, reason: from getter */
    public final long getEditTime() {
        return this.editTime;
    }

    /* renamed from: component14, reason: from getter */
    public final long getLastActive() {
        return this.lastActive;
    }

    /* renamed from: component15, reason: from getter */
    public final int getLikeNum() {
        return this.likeNum;
    }

    /* renamed from: component16, reason: from getter */
    public final int getCommentNum() {
        return this.commentNum;
    }

    /* renamed from: component17, reason: from getter */
    public final int getCollectNum() {
        return this.collectNum;
    }

    /* renamed from: component18, reason: from getter */
    public final double getAmountNum() {
        return this.amountNum;
    }

    /* renamed from: component19, reason: from getter */
    public final String getSenderNickname() {
        return this.senderNickname;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBaId() {
        return this.baId;
    }

    /* renamed from: component20, reason: from getter */
    public final String getSenderAvatar() {
        return this.senderAvatar;
    }

    /* renamed from: component21, reason: from getter */
    public final String getCreateTimeText() {
        return this.createTimeText;
    }

    /* renamed from: component22, reason: from getter */
    public final CommunityGroup getGroup() {
        return this.group;
    }

    /* renamed from: component23, reason: from getter */
    public final String getIsLiked() {
        return this.isLiked;
    }

    /* renamed from: component24, reason: from getter */
    public final int getIsCollected() {
        return this.isCollected;
    }

    /* renamed from: component25, reason: from getter */
    public final int getIsReward() {
        return this.isReward;
    }

    /* renamed from: component26, reason: from getter */
    public final Double getScore() {
        return this.score;
    }

    /* renamed from: component27, reason: from getter */
    public final int getIsVip() {
        return this.isVip;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSenderNicknameId() {
        return this.senderNicknameId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSenderAvatarId() {
        return this.senderAvatarId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component8, reason: from getter */
    public final int getContentType() {
        return this.contentType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final CommunityPost copy(int i, int baId, String senderId, int senderNicknameId, int senderAvatarId, String groupId, String title, int contentType, String content, long delTime, long createTime, long updateTime, long editTime, long lastActive, int likeNum, int commentNum, int collectNum, double amountNum, String senderNickname, String senderAvatar, String createTimeText, CommunityGroup group, String isLiked, int isCollected, int isReward, Double score, int isVip) {
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(senderNickname, "senderNickname");
        Intrinsics.checkNotNullParameter(senderAvatar, "senderAvatar");
        Intrinsics.checkNotNullParameter(createTimeText, "createTimeText");
        Intrinsics.checkNotNullParameter(isLiked, "isLiked");
        return new CommunityPost(i, baId, senderId, senderNicknameId, senderAvatarId, groupId, title, contentType, content, delTime, createTime, updateTime, editTime, lastActive, likeNum, commentNum, collectNum, amountNum, senderNickname, senderAvatar, createTimeText, group, isLiked, isCollected, isReward, score, isVip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityPost)) {
            return false;
        }
        CommunityPost communityPost = (CommunityPost) other;
        return this.id == communityPost.id && this.baId == communityPost.baId && Intrinsics.areEqual(this.senderId, communityPost.senderId) && this.senderNicknameId == communityPost.senderNicknameId && this.senderAvatarId == communityPost.senderAvatarId && Intrinsics.areEqual(this.groupId, communityPost.groupId) && Intrinsics.areEqual(this.title, communityPost.title) && this.contentType == communityPost.contentType && Intrinsics.areEqual(this.content, communityPost.content) && this.delTime == communityPost.delTime && this.createTime == communityPost.createTime && this.updateTime == communityPost.updateTime && this.editTime == communityPost.editTime && this.lastActive == communityPost.lastActive && this.likeNum == communityPost.likeNum && this.commentNum == communityPost.commentNum && this.collectNum == communityPost.collectNum && Double.compare(this.amountNum, communityPost.amountNum) == 0 && Intrinsics.areEqual(this.senderNickname, communityPost.senderNickname) && Intrinsics.areEqual(this.senderAvatar, communityPost.senderAvatar) && Intrinsics.areEqual(this.createTimeText, communityPost.createTimeText) && Intrinsics.areEqual(this.group, communityPost.group) && Intrinsics.areEqual(this.isLiked, communityPost.isLiked) && this.isCollected == communityPost.isCollected && this.isReward == communityPost.isReward && Intrinsics.areEqual((Object) this.score, (Object) communityPost.score) && this.isVip == communityPost.isVip;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.baId)) * 31) + this.senderId.hashCode()) * 31) + Integer.hashCode(this.senderNicknameId)) * 31) + Integer.hashCode(this.senderAvatarId)) * 31) + this.groupId.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.contentType)) * 31) + this.content.hashCode()) * 31) + Long.hashCode(this.delTime)) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.updateTime)) * 31) + Long.hashCode(this.editTime)) * 31) + Long.hashCode(this.lastActive)) * 31) + Integer.hashCode(this.likeNum)) * 31) + Integer.hashCode(this.commentNum)) * 31) + Integer.hashCode(this.collectNum)) * 31) + Double.hashCode(this.amountNum)) * 31) + this.senderNickname.hashCode()) * 31) + this.senderAvatar.hashCode()) * 31) + this.createTimeText.hashCode()) * 31) + (this.group == null ? 0 : this.group.hashCode())) * 31) + this.isLiked.hashCode()) * 31) + Integer.hashCode(this.isCollected)) * 31) + Integer.hashCode(this.isReward)) * 31) + (this.score != null ? this.score.hashCode() : 0)) * 31) + Integer.hashCode(this.isVip);
    }

    public String toString() {
        return "CommunityPost(id=" + this.id + ", baId=" + this.baId + ", senderId=" + this.senderId + ", senderNicknameId=" + this.senderNicknameId + ", senderAvatarId=" + this.senderAvatarId + ", groupId=" + this.groupId + ", title=" + this.title + ", contentType=" + this.contentType + ", content=" + this.content + ", delTime=" + this.delTime + ", createTime=" + this.createTime + ", updateTime=" + this.updateTime + ", editTime=" + this.editTime + ", lastActive=" + this.lastActive + ", likeNum=" + this.likeNum + ", commentNum=" + this.commentNum + ", collectNum=" + this.collectNum + ", amountNum=" + this.amountNum + ", senderNickname=" + this.senderNickname + ", senderAvatar=" + this.senderAvatar + ", createTimeText=" + this.createTimeText + ", group=" + this.group + ", isLiked=" + this.isLiked + ", isCollected=" + this.isCollected + ", isReward=" + this.isReward + ", score=" + this.score + ", isVip=" + this.isVip + ")";
    }

    public CommunityPost(int id, int baId, String senderId, int senderNicknameId, int senderAvatarId, String groupId, String title, int contentType, String content, long delTime, long createTime, long updateTime, long editTime, long lastActive, int likeNum, int commentNum, int collectNum, double amountNum, String senderNickname, String senderAvatar, String createTimeText, CommunityGroup group, String isLiked, int isCollected, int isReward, Double score, int isVip) {
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(senderNickname, "senderNickname");
        Intrinsics.checkNotNullParameter(senderAvatar, "senderAvatar");
        Intrinsics.checkNotNullParameter(createTimeText, "createTimeText");
        Intrinsics.checkNotNullParameter(isLiked, "isLiked");
        this.id = id;
        this.baId = baId;
        this.senderId = senderId;
        this.senderNicknameId = senderNicknameId;
        this.senderAvatarId = senderAvatarId;
        this.groupId = groupId;
        this.title = title;
        this.contentType = contentType;
        this.content = content;
        this.delTime = delTime;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.editTime = editTime;
        this.lastActive = lastActive;
        this.likeNum = likeNum;
        this.commentNum = commentNum;
        this.collectNum = collectNum;
        this.amountNum = amountNum;
        this.senderNickname = senderNickname;
        this.senderAvatar = senderAvatar;
        this.createTimeText = createTimeText;
        this.group = group;
        this.isLiked = isLiked;
        this.isCollected = isCollected;
        this.isReward = isReward;
        this.score = score;
        this.isVip = isVip;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CommunityPost(int i, int i2, String str, int i3, int i4, String str2, String str3, int i5, String str4, long j, long j2, long j3, long j4, long j5, int i6, int i7, int i8, double d, String str5, String str6, String str7, CommunityGroup communityGroup, String str8, int i9, int i10, Double d2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        Double d3;
        if ((i12 & 33554432) == 0) {
            d3 = d2;
        } else {
            d3 = null;
        }
        this(i, i2, str, i3, i4, str2, str3, i5, str4, j, j2, j3, j4, j5, i6, i7, i8, d, str5, str6, str7, communityGroup, str8, i9, i10, d3, i11);
    }

    public final int getId() {
        return this.id;
    }

    public final int getBaId() {
        return this.baId;
    }

    public final String getSenderId() {
        return this.senderId;
    }

    public final int getSenderNicknameId() {
        return this.senderNicknameId;
    }

    public final int getSenderAvatarId() {
        return this.senderAvatarId;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final String getContent() {
        return this.content;
    }

    public final long getDelTime() {
        return this.delTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final long getEditTime() {
        return this.editTime;
    }

    public final long getLastActive() {
        return this.lastActive;
    }

    public final int getLikeNum() {
        return this.likeNum;
    }

    public final int getCommentNum() {
        return this.commentNum;
    }

    public final int getCollectNum() {
        return this.collectNum;
    }

    public final double getAmountNum() {
        return this.amountNum;
    }

    public final String getSenderNickname() {
        return this.senderNickname;
    }

    public final String getSenderAvatar() {
        return this.senderAvatar;
    }

    public final String getCreateTimeText() {
        return this.createTimeText;
    }

    public final CommunityGroup getGroup() {
        return this.group;
    }

    public final String isLiked() {
        return this.isLiked;
    }

    public final int isCollected() {
        return this.isCollected;
    }

    public final int isReward() {
        return this.isReward;
    }

    public final Double getScore() {
        return this.score;
    }

    public final int isVip() {
        return this.isVip;
    }
}
