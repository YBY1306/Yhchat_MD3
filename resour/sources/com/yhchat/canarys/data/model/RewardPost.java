package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Coin.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/data/model/RewardPost;", "", Name.MARK, "", "title", "", "senderId", "senderNickname", "senderAvatar", "createTimeText", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getTitle", "()Ljava/lang/String;", "getSenderId", "getSenderNickname", "getSenderAvatar", "getCreateTimeText", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class RewardPost {
    public static final int $stable = 0;

    @SerializedName("createTimeText")
    private final String createTimeText;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("senderAvatar")
    private final String senderAvatar;

    @SerializedName("senderId")
    private final String senderId;

    @SerializedName("senderNickname")
    private final String senderNickname;

    @SerializedName("title")
    private final String title;

    public static /* synthetic */ RewardPost copy$default(RewardPost rewardPost, long j, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            j = rewardPost.id;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = rewardPost.title;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = rewardPost.senderId;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = rewardPost.senderNickname;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = rewardPost.senderAvatar;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = rewardPost.createTimeText;
        }
        return rewardPost.copy(j2, str6, str7, str8, str9, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSenderId() {
        return this.senderId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSenderNickname() {
        return this.senderNickname;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSenderAvatar() {
        return this.senderAvatar;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreateTimeText() {
        return this.createTimeText;
    }

    public final RewardPost copy(long id, String title, String senderId, String senderNickname, String senderAvatar, String createTimeText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(senderNickname, "senderNickname");
        Intrinsics.checkNotNullParameter(senderAvatar, "senderAvatar");
        Intrinsics.checkNotNullParameter(createTimeText, "createTimeText");
        return new RewardPost(id, title, senderId, senderNickname, senderAvatar, createTimeText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardPost)) {
            return false;
        }
        RewardPost rewardPost = (RewardPost) other;
        return this.id == rewardPost.id && Intrinsics.areEqual(this.title, rewardPost.title) && Intrinsics.areEqual(this.senderId, rewardPost.senderId) && Intrinsics.areEqual(this.senderNickname, rewardPost.senderNickname) && Intrinsics.areEqual(this.senderAvatar, rewardPost.senderAvatar) && Intrinsics.areEqual(this.createTimeText, rewardPost.createTimeText);
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.senderId.hashCode()) * 31) + this.senderNickname.hashCode()) * 31) + this.senderAvatar.hashCode()) * 31) + this.createTimeText.hashCode();
    }

    public String toString() {
        return "RewardPost(id=" + this.id + ", title=" + this.title + ", senderId=" + this.senderId + ", senderNickname=" + this.senderNickname + ", senderAvatar=" + this.senderAvatar + ", createTimeText=" + this.createTimeText + ")";
    }

    public RewardPost(long id, String title, String senderId, String senderNickname, String senderAvatar, String createTimeText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(senderNickname, "senderNickname");
        Intrinsics.checkNotNullParameter(senderAvatar, "senderAvatar");
        Intrinsics.checkNotNullParameter(createTimeText, "createTimeText");
        this.id = id;
        this.title = title;
        this.senderId = senderId;
        this.senderNickname = senderNickname;
        this.senderAvatar = senderAvatar;
        this.createTimeText = createTimeText;
    }

    public final long getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSenderId() {
        return this.senderId;
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
}
