package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Coin.kt */
@Metadata(m168d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\u0004\b\u0015\u0010\u0016J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0005H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\nH\u00c6\u0003J\t\u00100\u001a\u00020\nH\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\u0091\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00c6\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020<H\u00d6\u0001J\t\u0010=\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0016\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)\u00a8\u0006>"}, m169d2 = {"Lcom/yhchat/canarys/data/model/RewardRecord;", "", Name.MARK, "", "senderId", "", "recvId", "postId", "commentId", "amount", "", "recvAmount", "createTime", "reason", "remark", "post", "Lcom/yhchat/canarys/data/model/RewardPost;", "sender", "Lcom/yhchat/canarys/data/model/RewardUser;", "comment", "Lcom/yhchat/canarys/data/model/RewardComment;", "<init>", "(JLjava/lang/String;Ljava/lang/String;JJDDJLjava/lang/String;Ljava/lang/String;Lcom/yhchat/canarys/data/model/RewardPost;Lcom/yhchat/canarys/data/model/RewardUser;Lcom/yhchat/canarys/data/model/RewardComment;)V", "getId", "()J", "getSenderId", "()Ljava/lang/String;", "getRecvId", "getPostId", "getCommentId", "getAmount", "()D", "getRecvAmount", "getCreateTime", "getReason", "getRemark", "getPost", "()Lcom/yhchat/canarys/data/model/RewardPost;", "getSender", "()Lcom/yhchat/canarys/data/model/RewardUser;", "getComment", "()Lcom/yhchat/canarys/data/model/RewardComment;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RewardRecord {
    public static final int $stable = 0;

    @SerializedName("amount")
    private final double amount;

    @SerializedName("comment")
    private final RewardComment comment;

    @SerializedName("commentId")
    private final long commentId;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("post")
    private final RewardPost post;

    @SerializedName("postId")
    private final long postId;

    @SerializedName("reason")
    private final String reason;

    @SerializedName("recvAmount")
    private final double recvAmount;

    @SerializedName("recvId")
    private final String recvId;

    @SerializedName("remark")
    private final String remark;

    @SerializedName("sender")
    private final RewardUser sender;

    @SerializedName("senderId")
    private final String senderId;

    public static /* synthetic */ RewardRecord copy$default(RewardRecord rewardRecord, long j, String str, String str2, long j2, long j3, double d, double d2, long j4, String str3, String str4, RewardPost rewardPost, RewardUser rewardUser, RewardComment rewardComment, int i, Object obj) {
        long j5 = (i & 1) != 0 ? rewardRecord.id : j;
        String str5 = (i & 2) != 0 ? rewardRecord.senderId : str;
        String str6 = (i & 4) != 0 ? rewardRecord.recvId : str2;
        long j6 = (i & 8) != 0 ? rewardRecord.postId : j2;
        long j7 = (i & 16) != 0 ? rewardRecord.commentId : j3;
        double d3 = (i & 32) != 0 ? rewardRecord.amount : d;
        double d4 = (i & 64) != 0 ? rewardRecord.recvAmount : d2;
        long j8 = (i & 128) != 0 ? rewardRecord.createTime : j4;
        long j9 = j5;
        String str7 = (i & 256) != 0 ? rewardRecord.reason : str3;
        return rewardRecord.copy(j9, str5, str6, j6, j7, d3, d4, j8, str7, (i & 512) != 0 ? rewardRecord.remark : str4, (i & 1024) != 0 ? rewardRecord.post : rewardPost, (i & 2048) != 0 ? rewardRecord.sender : rewardUser, (i & 4096) != 0 ? rewardRecord.comment : rewardComment);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getRemark() {
        return this.remark;
    }

    /* renamed from: component11, reason: from getter */
    public final RewardPost getPost() {
        return this.post;
    }

    /* renamed from: component12, reason: from getter */
    public final RewardUser getSender() {
        return this.sender;
    }

    /* renamed from: component13, reason: from getter */
    public final RewardComment getComment() {
        return this.comment;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRecvId() {
        return this.recvId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getPostId() {
        return this.postId;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCommentId() {
        return this.commentId;
    }

    /* renamed from: component6, reason: from getter */
    public final double getAmount() {
        return this.amount;
    }

    /* renamed from: component7, reason: from getter */
    public final double getRecvAmount() {
        return this.recvAmount;
    }

    /* renamed from: component8, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component9, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final RewardRecord copy(long j, String senderId, String recvId, long postId, long commentId, double amount, double recvAmount, long createTime, String reason, String remark, RewardPost post, RewardUser sender, RewardComment comment) {
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(recvId, "recvId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(remark, "remark");
        return new RewardRecord(j, senderId, recvId, postId, commentId, amount, recvAmount, createTime, reason, remark, post, sender, comment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardRecord)) {
            return false;
        }
        RewardRecord rewardRecord = (RewardRecord) other;
        return this.id == rewardRecord.id && Intrinsics.areEqual(this.senderId, rewardRecord.senderId) && Intrinsics.areEqual(this.recvId, rewardRecord.recvId) && this.postId == rewardRecord.postId && this.commentId == rewardRecord.commentId && Double.compare(this.amount, rewardRecord.amount) == 0 && Double.compare(this.recvAmount, rewardRecord.recvAmount) == 0 && this.createTime == rewardRecord.createTime && Intrinsics.areEqual(this.reason, rewardRecord.reason) && Intrinsics.areEqual(this.remark, rewardRecord.remark) && Intrinsics.areEqual(this.post, rewardRecord.post) && Intrinsics.areEqual(this.sender, rewardRecord.sender) && Intrinsics.areEqual(this.comment, rewardRecord.comment);
    }

    public int hashCode() {
        return (((((((((((((((((((((((Long.hashCode(this.id) * 31) + this.senderId.hashCode()) * 31) + this.recvId.hashCode()) * 31) + Long.hashCode(this.postId)) * 31) + Long.hashCode(this.commentId)) * 31) + Double.hashCode(this.amount)) * 31) + Double.hashCode(this.recvAmount)) * 31) + Long.hashCode(this.createTime)) * 31) + this.reason.hashCode()) * 31) + this.remark.hashCode()) * 31) + (this.post == null ? 0 : this.post.hashCode())) * 31) + (this.sender == null ? 0 : this.sender.hashCode())) * 31) + (this.comment != null ? this.comment.hashCode() : 0);
    }

    public String toString() {
        return "RewardRecord(id=" + this.id + ", senderId=" + this.senderId + ", recvId=" + this.recvId + ", postId=" + this.postId + ", commentId=" + this.commentId + ", amount=" + this.amount + ", recvAmount=" + this.recvAmount + ", createTime=" + this.createTime + ", reason=" + this.reason + ", remark=" + this.remark + ", post=" + this.post + ", sender=" + this.sender + ", comment=" + this.comment + ")";
    }

    public RewardRecord(long id, String senderId, String recvId, long postId, long commentId, double amount, double recvAmount, long createTime, String reason, String remark, RewardPost post, RewardUser sender, RewardComment comment) {
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(recvId, "recvId");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(remark, "remark");
        this.id = id;
        this.senderId = senderId;
        this.recvId = recvId;
        this.postId = postId;
        this.commentId = commentId;
        this.amount = amount;
        this.recvAmount = recvAmount;
        this.createTime = createTime;
        this.reason = reason;
        this.remark = remark;
        this.post = post;
        this.sender = sender;
        this.comment = comment;
    }

    public /* synthetic */ RewardRecord(long j, String str, String str2, long j2, long j3, double d, double d2, long j4, String str3, String str4, RewardPost rewardPost, RewardUser rewardUser, RewardComment rewardComment, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, str2, j2, j3, d, d2, j4, str3, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? null : rewardPost, (i & 2048) != 0 ? null : rewardUser, (i & 4096) != 0 ? null : rewardComment);
    }

    public final long getId() {
        return this.id;
    }

    public final String getSenderId() {
        return this.senderId;
    }

    public final String getRecvId() {
        return this.recvId;
    }

    public final long getPostId() {
        return this.postId;
    }

    public final long getCommentId() {
        return this.commentId;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final double getRecvAmount() {
        return this.recvAmount;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getRemark() {
        return this.remark;
    }

    public final RewardPost getPost() {
        return this.post;
    }

    public final RewardUser getSender() {
        return this.sender;
    }

    public final RewardComment getComment() {
        return this.comment;
    }
}
