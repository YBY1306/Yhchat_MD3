package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Community.kt */
@Metadata(m168d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b4\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00af\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0007H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0007H\u00c6\u0003J\t\u0010:\u001a\u00020\fH\u00c6\u0003J\t\u0010;\u001a\u00020\fH\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0011H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0014H\u00c6\u0003J\t\u0010A\u001a\u00020\u0007H\u00c6\u0003J\t\u0010B\u001a\u00020\u0007H\u00c6\u0003J\t\u0010C\u001a\u00020\u0007H\u00c6\u0003J\t\u0010D\u001a\u00020\u0007H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\u00d9\u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00072\b\b\u0002\u0010\u0016\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010K\u001a\u00020\u0003H\u00d6\u0001J\t\u0010L\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0016\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\"R\u0016\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0016\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\"R\u0016\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\"R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001eR\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001e\u00a8\u0006M"}, m169d2 = {"Lcom/yhchat/canarys/data/model/CommunityComment;", "", Name.MARK, "", "postId", "parentId", "senderId", "", "senderNicknameId", "senderAvatarId", "content", "delTime", "", "createTime", "likeNum", "repliesNum", "amountNum", "", "auditStatus", "replies", "", "senderNickname", "senderAvatar", "createTimeText", "isLiked", "isReward", "isVip", "<init>", "(IIILjava/lang/String;IILjava/lang/String;JJIIDILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getId", "()I", "getPostId", "getParentId", "getSenderId", "()Ljava/lang/String;", "getSenderNicknameId", "getSenderAvatarId", "getContent", "getDelTime", "()J", "getCreateTime", "getLikeNum", "getRepliesNum", "getAmountNum", "()D", "getAuditStatus", "getReplies", "()Ljava/util/List;", "getSenderNickname", "getSenderAvatar", "getCreateTimeText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CommunityComment {
    public static final int $stable = 8;

    @SerializedName("amountNum")
    private final double amountNum;

    @SerializedName("auditStatus")
    private final int auditStatus;

    @SerializedName("content")
    private final String content;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("createTimeText")
    private final String createTimeText;

    @SerializedName("delTime")
    private final long delTime;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("isLiked")
    private final String isLiked;

    @SerializedName("isReward")
    private final int isReward;

    @SerializedName("isVip")
    private final int isVip;

    @SerializedName("likeNum")
    private final int likeNum;

    @SerializedName("parentId")
    private final int parentId;

    @SerializedName("postId")
    private final int postId;

    @SerializedName("replies")
    private final List<CommunityComment> replies;

    @SerializedName("repliesNum")
    private final int repliesNum;

    @SerializedName("senderAvatar")
    private final String senderAvatar;

    @SerializedName("sender_avatarUd")
    private final int senderAvatarId;

    @SerializedName("senderId")
    private final String senderId;

    @SerializedName("senderNickname")
    private final String senderNickname;

    @SerializedName("sender_nicknameId")
    private final int senderNicknameId;

    public static /* synthetic */ CommunityComment copy$default(CommunityComment communityComment, int i, int i2, int i3, String str, int i4, int i5, String str2, long j, long j2, int i6, int i7, double d, int i8, List list, String str3, String str4, String str5, String str6, int i9, int i10, int i11, Object obj) {
        int i12;
        int i13;
        int i14 = (i11 & 1) != 0 ? communityComment.id : i;
        int i15 = (i11 & 2) != 0 ? communityComment.postId : i2;
        int i16 = (i11 & 4) != 0 ? communityComment.parentId : i3;
        String str7 = (i11 & 8) != 0 ? communityComment.senderId : str;
        int i17 = (i11 & 16) != 0 ? communityComment.senderNicknameId : i4;
        int i18 = (i11 & 32) != 0 ? communityComment.senderAvatarId : i5;
        String str8 = (i11 & 64) != 0 ? communityComment.content : str2;
        long j3 = (i11 & 128) != 0 ? communityComment.delTime : j;
        long j4 = (i11 & 256) != 0 ? communityComment.createTime : j2;
        int i19 = (i11 & 512) != 0 ? communityComment.likeNum : i6;
        int i20 = (i11 & 1024) != 0 ? communityComment.repliesNum : i7;
        int i21 = i14;
        int i22 = i15;
        double d2 = (i11 & 2048) != 0 ? communityComment.amountNum : d;
        int i23 = (i11 & 4096) != 0 ? communityComment.auditStatus : i8;
        double d3 = d2;
        List list2 = (i11 & 8192) != 0 ? communityComment.replies : list;
        String str9 = (i11 & 16384) != 0 ? communityComment.senderNickname : str3;
        String str10 = (i11 & 32768) != 0 ? communityComment.senderAvatar : str4;
        String str11 = (i11 & 65536) != 0 ? communityComment.createTimeText : str5;
        String str12 = (i11 & 131072) != 0 ? communityComment.isLiked : str6;
        int i24 = (i11 & 262144) != 0 ? communityComment.isReward : i9;
        if ((i11 & 524288) != 0) {
            i13 = i24;
            i12 = communityComment.isVip;
        } else {
            i12 = i10;
            i13 = i24;
        }
        return communityComment.copy(i21, i22, i16, str7, i17, i18, str8, j3, j4, i19, i20, d3, i23, list2, str9, str10, str11, str12, i13, i12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getLikeNum() {
        return this.likeNum;
    }

    /* renamed from: component11, reason: from getter */
    public final int getRepliesNum() {
        return this.repliesNum;
    }

    /* renamed from: component12, reason: from getter */
    public final double getAmountNum() {
        return this.amountNum;
    }

    /* renamed from: component13, reason: from getter */
    public final int getAuditStatus() {
        return this.auditStatus;
    }

    public final List<CommunityComment> component14() {
        return this.replies;
    }

    /* renamed from: component15, reason: from getter */
    public final String getSenderNickname() {
        return this.senderNickname;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSenderAvatar() {
        return this.senderAvatar;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCreateTimeText() {
        return this.createTimeText;
    }

    /* renamed from: component18, reason: from getter */
    public final String getIsLiked() {
        return this.isLiked;
    }

    /* renamed from: component19, reason: from getter */
    public final int getIsReward() {
        return this.isReward;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPostId() {
        return this.postId;
    }

    /* renamed from: component20, reason: from getter */
    public final int getIsVip() {
        return this.isVip;
    }

    /* renamed from: component3, reason: from getter */
    public final int getParentId() {
        return this.parentId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSenderNicknameId() {
        return this.senderNicknameId;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSenderAvatarId() {
        return this.senderAvatarId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component8, reason: from getter */
    public final long getDelTime() {
        return this.delTime;
    }

    /* renamed from: component9, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    public final CommunityComment copy(int id, int postId, int parentId, String senderId, int senderNicknameId, int senderAvatarId, String content, long delTime, long createTime, int likeNum, int repliesNum, double amountNum, int auditStatus, List<CommunityComment> replies, String senderNickname, String senderAvatar, String createTimeText, String isLiked, int isReward, int isVip) {
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(senderNickname, "senderNickname");
        Intrinsics.checkNotNullParameter(senderAvatar, "senderAvatar");
        Intrinsics.checkNotNullParameter(createTimeText, "createTimeText");
        Intrinsics.checkNotNullParameter(isLiked, "isLiked");
        return new CommunityComment(id, postId, parentId, senderId, senderNicknameId, senderAvatarId, content, delTime, createTime, likeNum, repliesNum, amountNum, auditStatus, replies, senderNickname, senderAvatar, createTimeText, isLiked, isReward, isVip);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityComment)) {
            return false;
        }
        CommunityComment communityComment = (CommunityComment) other;
        return this.id == communityComment.id && this.postId == communityComment.postId && this.parentId == communityComment.parentId && Intrinsics.areEqual(this.senderId, communityComment.senderId) && this.senderNicknameId == communityComment.senderNicknameId && this.senderAvatarId == communityComment.senderAvatarId && Intrinsics.areEqual(this.content, communityComment.content) && this.delTime == communityComment.delTime && this.createTime == communityComment.createTime && this.likeNum == communityComment.likeNum && this.repliesNum == communityComment.repliesNum && Double.compare(this.amountNum, communityComment.amountNum) == 0 && this.auditStatus == communityComment.auditStatus && Intrinsics.areEqual(this.replies, communityComment.replies) && Intrinsics.areEqual(this.senderNickname, communityComment.senderNickname) && Intrinsics.areEqual(this.senderAvatar, communityComment.senderAvatar) && Intrinsics.areEqual(this.createTimeText, communityComment.createTimeText) && Intrinsics.areEqual(this.isLiked, communityComment.isLiked) && this.isReward == communityComment.isReward && this.isVip == communityComment.isVip;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.postId)) * 31) + Integer.hashCode(this.parentId)) * 31) + this.senderId.hashCode()) * 31) + Integer.hashCode(this.senderNicknameId)) * 31) + Integer.hashCode(this.senderAvatarId)) * 31) + this.content.hashCode()) * 31) + Long.hashCode(this.delTime)) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.likeNum)) * 31) + Integer.hashCode(this.repliesNum)) * 31) + Double.hashCode(this.amountNum)) * 31) + Integer.hashCode(this.auditStatus)) * 31) + (this.replies == null ? 0 : this.replies.hashCode())) * 31) + this.senderNickname.hashCode()) * 31) + this.senderAvatar.hashCode()) * 31) + this.createTimeText.hashCode()) * 31) + this.isLiked.hashCode()) * 31) + Integer.hashCode(this.isReward)) * 31) + Integer.hashCode(this.isVip);
    }

    public String toString() {
        return "CommunityComment(id=" + this.id + ", postId=" + this.postId + ", parentId=" + this.parentId + ", senderId=" + this.senderId + ", senderNicknameId=" + this.senderNicknameId + ", senderAvatarId=" + this.senderAvatarId + ", content=" + this.content + ", delTime=" + this.delTime + ", createTime=" + this.createTime + ", likeNum=" + this.likeNum + ", repliesNum=" + this.repliesNum + ", amountNum=" + this.amountNum + ", auditStatus=" + this.auditStatus + ", replies=" + this.replies + ", senderNickname=" + this.senderNickname + ", senderAvatar=" + this.senderAvatar + ", createTimeText=" + this.createTimeText + ", isLiked=" + this.isLiked + ", isReward=" + this.isReward + ", isVip=" + this.isVip + ")";
    }

    public CommunityComment(int id, int postId, int parentId, String senderId, int senderNicknameId, int senderAvatarId, String content, long delTime, long createTime, int likeNum, int repliesNum, double amountNum, int auditStatus, List<CommunityComment> list, String senderNickname, String senderAvatar, String createTimeText, String isLiked, int isReward, int isVip) {
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(senderNickname, "senderNickname");
        Intrinsics.checkNotNullParameter(senderAvatar, "senderAvatar");
        Intrinsics.checkNotNullParameter(createTimeText, "createTimeText");
        Intrinsics.checkNotNullParameter(isLiked, "isLiked");
        this.id = id;
        this.postId = postId;
        this.parentId = parentId;
        this.senderId = senderId;
        this.senderNicknameId = senderNicknameId;
        this.senderAvatarId = senderAvatarId;
        this.content = content;
        this.delTime = delTime;
        this.createTime = createTime;
        this.likeNum = likeNum;
        this.repliesNum = repliesNum;
        this.amountNum = amountNum;
        this.auditStatus = auditStatus;
        this.replies = list;
        this.senderNickname = senderNickname;
        this.senderAvatar = senderAvatar;
        this.createTimeText = createTimeText;
        this.isLiked = isLiked;
        this.isReward = isReward;
        this.isVip = isVip;
    }

    public final int getId() {
        return this.id;
    }

    public final int getPostId() {
        return this.postId;
    }

    public final int getParentId() {
        return this.parentId;
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

    public final String getContent() {
        return this.content;
    }

    public final long getDelTime() {
        return this.delTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getLikeNum() {
        return this.likeNum;
    }

    public final int getRepliesNum() {
        return this.repliesNum;
    }

    public final double getAmountNum() {
        return this.amountNum;
    }

    public final int getAuditStatus() {
        return this.auditStatus;
    }

    public final List<CommunityComment> getReplies() {
        return this.replies;
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

    public final String isLiked() {
        return this.isLiked;
    }

    public final int isReward() {
        return this.isReward;
    }

    public final int isVip() {
        return this.isVip;
    }
}
