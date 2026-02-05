package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Community.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0005H\u00c6\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010.\u001a\u00020\u0003H\u00d6\u0001J\t\u0010/\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0016\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0016\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0016\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0015\u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/data/model/CommunityBoard;", "", Name.MARK, "", HintConstants.AUTOFILL_HINT_NAME, "", "avatar", "delTime", "", "createTime", "lastActive", "memberNum", "postNum", "groupNum", "createTimeText", "isFollowed", "<init>", "(ILjava/lang/String;Ljava/lang/String;JJJIIILjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getAvatar", "getDelTime", "()J", "getCreateTime", "getLastActive", "getMemberNum", "getPostNum", "getGroupNum", "getCreateTimeText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CommunityBoard {
    public static final int $stable = 0;

    @SerializedName("avatar")
    private final String avatar;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("createTimeText")
    private final String createTimeText;

    @SerializedName("delTime")
    private final long delTime;

    @SerializedName("groupNum")
    private final int groupNum;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("isFollowed")
    private final String isFollowed;

    @SerializedName("lastActive")
    private final long lastActive;

    @SerializedName("memberNum")
    private final int memberNum;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("postNum")
    private final int postNum;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCreateTimeText() {
        return this.createTimeText;
    }

    /* renamed from: component11, reason: from getter */
    public final String getIsFollowed() {
        return this.isFollowed;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDelTime() {
        return this.delTime;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component6, reason: from getter */
    public final long getLastActive() {
        return this.lastActive;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMemberNum() {
        return this.memberNum;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPostNum() {
        return this.postNum;
    }

    /* renamed from: component9, reason: from getter */
    public final int getGroupNum() {
        return this.groupNum;
    }

    public final CommunityBoard copy(int id, String name, String avatar, long delTime, long createTime, long lastActive, int memberNum, int postNum, int groupNum, String createTimeText, String isFollowed) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(createTimeText, "createTimeText");
        Intrinsics.checkNotNullParameter(isFollowed, "isFollowed");
        return new CommunityBoard(id, name, avatar, delTime, createTime, lastActive, memberNum, postNum, groupNum, createTimeText, isFollowed);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommunityBoard)) {
            return false;
        }
        CommunityBoard communityBoard = (CommunityBoard) other;
        return this.id == communityBoard.id && Intrinsics.areEqual(this.name, communityBoard.name) && Intrinsics.areEqual(this.avatar, communityBoard.avatar) && this.delTime == communityBoard.delTime && this.createTime == communityBoard.createTime && this.lastActive == communityBoard.lastActive && this.memberNum == communityBoard.memberNum && this.postNum == communityBoard.postNum && this.groupNum == communityBoard.groupNum && Intrinsics.areEqual(this.createTimeText, communityBoard.createTimeText) && Intrinsics.areEqual(this.isFollowed, communityBoard.isFollowed);
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.avatar.hashCode()) * 31) + Long.hashCode(this.delTime)) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.lastActive)) * 31) + Integer.hashCode(this.memberNum)) * 31) + Integer.hashCode(this.postNum)) * 31) + Integer.hashCode(this.groupNum)) * 31) + this.createTimeText.hashCode()) * 31) + this.isFollowed.hashCode();
    }

    public String toString() {
        return "CommunityBoard(id=" + this.id + ", name=" + this.name + ", avatar=" + this.avatar + ", delTime=" + this.delTime + ", createTime=" + this.createTime + ", lastActive=" + this.lastActive + ", memberNum=" + this.memberNum + ", postNum=" + this.postNum + ", groupNum=" + this.groupNum + ", createTimeText=" + this.createTimeText + ", isFollowed=" + this.isFollowed + ")";
    }

    public CommunityBoard(int id, String name, String avatar, long delTime, long createTime, long lastActive, int memberNum, int postNum, int groupNum, String createTimeText, String isFollowed) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(createTimeText, "createTimeText");
        Intrinsics.checkNotNullParameter(isFollowed, "isFollowed");
        this.id = id;
        this.name = name;
        this.avatar = avatar;
        this.delTime = delTime;
        this.createTime = createTime;
        this.lastActive = lastActive;
        this.memberNum = memberNum;
        this.postNum = postNum;
        this.groupNum = groupNum;
        this.createTimeText = createTimeText;
        this.isFollowed = isFollowed;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final long getDelTime() {
        return this.delTime;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getLastActive() {
        return this.lastActive;
    }

    public final int getMemberNum() {
        return this.memberNum;
    }

    public final int getPostNum() {
        return this.postNum;
    }

    public final int getGroupNum() {
        return this.groupNum;
    }

    public final String getCreateTimeText() {
        return this.createTimeText;
    }

    public final String isFollowed() {
        return this.isFollowed;
    }
}
