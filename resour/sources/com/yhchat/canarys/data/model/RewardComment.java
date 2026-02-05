package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Coin.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0006H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/data/model/RewardComment;", "", Name.MARK, "", "postId", "content", "", "senderNickname", "createTimeText", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getPostId", "getContent", "()Ljava/lang/String;", "getSenderNickname", "getCreateTimeText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RewardComment {
    public static final int $stable = 0;

    @SerializedName("content")
    private final String content;

    @SerializedName("createTimeText")
    private final String createTimeText;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("postId")
    private final long postId;

    @SerializedName("senderNickname")
    private final String senderNickname;

    public static /* synthetic */ RewardComment copy$default(RewardComment rewardComment, long j, long j2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = rewardComment.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            j2 = rewardComment.postId;
        }
        long j4 = j2;
        if ((i & 4) != 0) {
            str = rewardComment.content;
        }
        String str4 = str;
        if ((i & 8) != 0) {
            str2 = rewardComment.senderNickname;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = rewardComment.createTimeText;
        }
        return rewardComment.copy(j3, j4, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getPostId() {
        return this.postId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSenderNickname() {
        return this.senderNickname;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCreateTimeText() {
        return this.createTimeText;
    }

    public final RewardComment copy(long id, long postId, String content, String senderNickname, String createTimeText) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(senderNickname, "senderNickname");
        Intrinsics.checkNotNullParameter(createTimeText, "createTimeText");
        return new RewardComment(id, postId, content, senderNickname, createTimeText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardComment)) {
            return false;
        }
        RewardComment rewardComment = (RewardComment) other;
        return this.id == rewardComment.id && this.postId == rewardComment.postId && Intrinsics.areEqual(this.content, rewardComment.content) && Intrinsics.areEqual(this.senderNickname, rewardComment.senderNickname) && Intrinsics.areEqual(this.createTimeText, rewardComment.createTimeText);
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.postId)) * 31) + this.content.hashCode()) * 31) + this.senderNickname.hashCode()) * 31) + this.createTimeText.hashCode();
    }

    public String toString() {
        return "RewardComment(id=" + this.id + ", postId=" + this.postId + ", content=" + this.content + ", senderNickname=" + this.senderNickname + ", createTimeText=" + this.createTimeText + ")";
    }

    public RewardComment(long id, long postId, String content, String senderNickname, String createTimeText) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(senderNickname, "senderNickname");
        Intrinsics.checkNotNullParameter(createTimeText, "createTimeText");
        this.id = id;
        this.postId = postId;
        this.content = content;
        this.senderNickname = senderNickname;
        this.createTimeText = createTimeText;
    }

    public final long getId() {
        return this.id;
    }

    public final long getPostId() {
        return this.postId;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getSenderNickname() {
        return this.senderNickname;
    }

    public final String getCreateTimeText() {
        return this.createTimeText;
    }
}
