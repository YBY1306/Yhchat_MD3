package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\bK\b\u0087\b\u0018\u00002\u00020\u0001B\u00ef\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0010\u00a2\u0006\u0004\b!\u0010\"J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\bH\u00c6\u0003J\t\u0010I\u001a\u00020\u0003H\u00c6\u0003J\t\u0010J\u001a\u00020\u000bH\u00c6\u0003J\t\u0010K\u001a\u00020\bH\u00c6\u0003J\t\u0010L\u001a\u00020\u000bH\u00c6\u0003J\t\u0010M\u001a\u00020\u0003H\u00c6\u0003J\t\u0010N\u001a\u00020\u0010H\u00c6\u0003J\t\u0010O\u001a\u00020\u000bH\u00c6\u0003J\t\u0010P\u001a\u00020\u000bH\u00c6\u0003J\t\u0010Q\u001a\u00020\u000bH\u00c6\u0003J\t\u0010R\u001a\u00020\u000bH\u00c6\u0003J\t\u0010S\u001a\u00020\u0010H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019H\u00c6\u0003J\t\u0010W\u001a\u00020\u0003H\u00c6\u0003J\t\u0010X\u001a\u00020\u0003H\u00c6\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0002\u0010<J\u0010\u0010Z\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010?J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u0010H\u00c6\u0003J\u00a0\u0002\u0010^\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010 \u001a\u00020\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010_J\u0013\u0010`\u001a\u00020\u000b2\b\u0010a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010b\u001a\u00020\bH\u00d6\u0001J\t\u0010c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010$R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010$R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\f\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010)R\u0011\u0010\r\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0011\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010,R\u0011\u0010\u0012\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010,R\u0011\u0010\u0013\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010,R\u0011\u0010\u0014\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010,R\u0011\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00101R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010$R\u0011\u0010\u0017\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010,R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0011\u0010\u001a\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010$R\u0011\u0010\u001b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010$R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\n\n\u0002\u0010=\u001a\u0004\b;\u0010<R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010@\u001a\u0004\b>\u0010?R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010$R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010$R\u0011\u0010 \u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00101\u00a8\u0006d"}, m169d2 = {"Lcom/yhchat/canarys/data/model/GroupDetail;", "", "groupId", "", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "introduction", "memberCount", "", "createBy", "directJoin", "", "permissionLevel", "historyMsgEnabled", "categoryName", "categoryId", "", "isPrivate", "doNotDisturb", "hideGroupMembers", "denyMembersUploadToGroupDisk", "communityId", "communityName", "isTop", "adminIds", "", "ownerId", "limitedMsgType", "avatarId", NotificationCompat.CATEGORY_RECOMMENDATION, "myGroupNickname", "groupCode", "autoDeleteMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIZLjava/lang/String;JZZZZJLjava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;J)V", "getGroupId", "()Ljava/lang/String;", "getName", "getAvatarUrl", "getIntroduction", "getMemberCount", "()I", "getCreateBy", "getDirectJoin", "()Z", "getPermissionLevel", "getHistoryMsgEnabled", "getCategoryName", "getCategoryId", "()J", "getDoNotDisturb", "getHideGroupMembers", "getDenyMembersUploadToGroupDisk", "getCommunityId", "getCommunityName", "getAdminIds", "()Ljava/util/List;", "getOwnerId", "getLimitedMsgType", "getAvatarId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRecommendation", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMyGroupNickname", "getGroupCode", "getAutoDeleteMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ZIZLjava/lang/String;JZZZZJLjava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;J)Lcom/yhchat/canarys/data/model/GroupDetail;", "equals", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class GroupDetail {
    public static final int $stable = 8;
    private final List<String> adminIds;
    private final long autoDeleteMessage;
    private final Long avatarId;
    private final String avatarUrl;
    private final long categoryId;
    private final String categoryName;
    private final long communityId;
    private final String communityName;
    private final String createBy;
    private final boolean denyMembersUploadToGroupDisk;
    private final boolean directJoin;
    private final boolean doNotDisturb;
    private final String groupCode;
    private final String groupId;
    private final boolean hideGroupMembers;
    private final boolean historyMsgEnabled;
    private final String introduction;
    private final boolean isPrivate;
    private final boolean isTop;
    private final String limitedMsgType;
    private final int memberCount;
    private final String myGroupNickname;
    private final String name;
    private final String ownerId;
    private final int permissionLevel;
    private final Integer recommendation;

    public static /* synthetic */ GroupDetail copy$default(GroupDetail groupDetail, String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, boolean z2, String str6, long j, boolean z3, boolean z4, boolean z5, boolean z6, long j2, String str7, boolean z7, List list, String str8, String str9, Long l, Integer num, String str10, String str11, long j3, int i3, Object obj) {
        long j4;
        String str12;
        boolean z8;
        String str13 = (i3 & 1) != 0 ? groupDetail.groupId : str;
        String str14 = (i3 & 2) != 0 ? groupDetail.name : str2;
        String str15 = (i3 & 4) != 0 ? groupDetail.avatarUrl : str3;
        String str16 = (i3 & 8) != 0 ? groupDetail.introduction : str4;
        int i4 = (i3 & 16) != 0 ? groupDetail.memberCount : i;
        String str17 = (i3 & 32) != 0 ? groupDetail.createBy : str5;
        boolean z9 = (i3 & 64) != 0 ? groupDetail.directJoin : z;
        int i5 = (i3 & 128) != 0 ? groupDetail.permissionLevel : i2;
        boolean z10 = (i3 & 256) != 0 ? groupDetail.historyMsgEnabled : z2;
        String str18 = (i3 & 512) != 0 ? groupDetail.categoryName : str6;
        long j5 = (i3 & 1024) != 0 ? groupDetail.categoryId : j;
        boolean z11 = (i3 & 2048) != 0 ? groupDetail.isPrivate : z3;
        boolean z12 = (i3 & 4096) != 0 ? groupDetail.doNotDisturb : z4;
        String str19 = str13;
        boolean z13 = (i3 & 8192) != 0 ? groupDetail.hideGroupMembers : z5;
        boolean z14 = (i3 & 16384) != 0 ? groupDetail.denyMembersUploadToGroupDisk : z6;
        long j6 = (i3 & 32768) != 0 ? groupDetail.communityId : j2;
        String str20 = (i3 & 65536) != 0 ? groupDetail.communityName : str7;
        boolean z15 = (i3 & 131072) != 0 ? groupDetail.isTop : z7;
        String str21 = str20;
        List list2 = (i3 & 262144) != 0 ? groupDetail.adminIds : list;
        String str22 = (i3 & 524288) != 0 ? groupDetail.ownerId : str8;
        String str23 = (i3 & 1048576) != 0 ? groupDetail.limitedMsgType : str9;
        Long l2 = (i3 & 2097152) != 0 ? groupDetail.avatarId : l;
        Integer num2 = (i3 & 4194304) != 0 ? groupDetail.recommendation : num;
        String str24 = (i3 & 8388608) != 0 ? groupDetail.myGroupNickname : str10;
        String str25 = (i3 & 16777216) != 0 ? groupDetail.groupCode : str11;
        if ((i3 & 33554432) != 0) {
            z8 = z15;
            str12 = str25;
            j4 = groupDetail.autoDeleteMessage;
        } else {
            j4 = j3;
            str12 = str25;
            z8 = z15;
        }
        return groupDetail.copy(str19, str14, str15, str16, i4, str17, z9, i5, z10, str18, j5, z11, z12, z13, z14, j6, str21, z8, list2, str22, str23, l2, num2, str24, str12, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* renamed from: component11, reason: from getter */
    public final long getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getDoNotDisturb() {
        return this.doNotDisturb;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getHideGroupMembers() {
        return this.hideGroupMembers;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getDenyMembersUploadToGroupDisk() {
        return this.denyMembersUploadToGroupDisk;
    }

    /* renamed from: component16, reason: from getter */
    public final long getCommunityId() {
        return this.communityId;
    }

    /* renamed from: component17, reason: from getter */
    public final String getCommunityName() {
        return this.communityName;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsTop() {
        return this.isTop;
    }

    public final List<String> component19() {
        return this.adminIds;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component20, reason: from getter */
    public final String getOwnerId() {
        return this.ownerId;
    }

    /* renamed from: component21, reason: from getter */
    public final String getLimitedMsgType() {
        return this.limitedMsgType;
    }

    /* renamed from: component22, reason: from getter */
    public final Long getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component23, reason: from getter */
    public final Integer getRecommendation() {
        return this.recommendation;
    }

    /* renamed from: component24, reason: from getter */
    public final String getMyGroupNickname() {
        return this.myGroupNickname;
    }

    /* renamed from: component25, reason: from getter */
    public final String getGroupCode() {
        return this.groupCode;
    }

    /* renamed from: component26, reason: from getter */
    public final long getAutoDeleteMessage() {
        return this.autoDeleteMessage;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getIntroduction() {
        return this.introduction;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMemberCount() {
        return this.memberCount;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCreateBy() {
        return this.createBy;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getDirectJoin() {
        return this.directJoin;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPermissionLevel() {
        return this.permissionLevel;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHistoryMsgEnabled() {
        return this.historyMsgEnabled;
    }

    public final GroupDetail copy(String groupId, String name, String avatarUrl, String introduction, int memberCount, String createBy, boolean directJoin, int permissionLevel, boolean historyMsgEnabled, String categoryName, long categoryId, boolean isPrivate, boolean doNotDisturb, boolean hideGroupMembers, boolean denyMembersUploadToGroupDisk, long communityId, String communityName, boolean isTop, List<String> adminIds, String ownerId, String limitedMsgType, Long avatarId, Integer recommendation, String myGroupNickname, String groupCode, long autoDeleteMessage) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(communityName, "communityName");
        Intrinsics.checkNotNullParameter(adminIds, "adminIds");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(limitedMsgType, "limitedMsgType");
        return new GroupDetail(groupId, name, avatarUrl, introduction, memberCount, createBy, directJoin, permissionLevel, historyMsgEnabled, categoryName, categoryId, isPrivate, doNotDisturb, hideGroupMembers, denyMembersUploadToGroupDisk, communityId, communityName, isTop, adminIds, ownerId, limitedMsgType, avatarId, recommendation, myGroupNickname, groupCode, autoDeleteMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupDetail)) {
            return false;
        }
        GroupDetail groupDetail = (GroupDetail) other;
        return Intrinsics.areEqual(this.groupId, groupDetail.groupId) && Intrinsics.areEqual(this.name, groupDetail.name) && Intrinsics.areEqual(this.avatarUrl, groupDetail.avatarUrl) && Intrinsics.areEqual(this.introduction, groupDetail.introduction) && this.memberCount == groupDetail.memberCount && Intrinsics.areEqual(this.createBy, groupDetail.createBy) && this.directJoin == groupDetail.directJoin && this.permissionLevel == groupDetail.permissionLevel && this.historyMsgEnabled == groupDetail.historyMsgEnabled && Intrinsics.areEqual(this.categoryName, groupDetail.categoryName) && this.categoryId == groupDetail.categoryId && this.isPrivate == groupDetail.isPrivate && this.doNotDisturb == groupDetail.doNotDisturb && this.hideGroupMembers == groupDetail.hideGroupMembers && this.denyMembersUploadToGroupDisk == groupDetail.denyMembersUploadToGroupDisk && this.communityId == groupDetail.communityId && Intrinsics.areEqual(this.communityName, groupDetail.communityName) && this.isTop == groupDetail.isTop && Intrinsics.areEqual(this.adminIds, groupDetail.adminIds) && Intrinsics.areEqual(this.ownerId, groupDetail.ownerId) && Intrinsics.areEqual(this.limitedMsgType, groupDetail.limitedMsgType) && Intrinsics.areEqual(this.avatarId, groupDetail.avatarId) && Intrinsics.areEqual(this.recommendation, groupDetail.recommendation) && Intrinsics.areEqual(this.myGroupNickname, groupDetail.myGroupNickname) && Intrinsics.areEqual(this.groupCode, groupDetail.groupCode) && this.autoDeleteMessage == groupDetail.autoDeleteMessage;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.groupId.hashCode() * 31) + this.name.hashCode()) * 31) + this.avatarUrl.hashCode()) * 31) + this.introduction.hashCode()) * 31) + Integer.hashCode(this.memberCount)) * 31) + this.createBy.hashCode()) * 31) + Boolean.hashCode(this.directJoin)) * 31) + Integer.hashCode(this.permissionLevel)) * 31) + Boolean.hashCode(this.historyMsgEnabled)) * 31) + this.categoryName.hashCode()) * 31) + Long.hashCode(this.categoryId)) * 31) + Boolean.hashCode(this.isPrivate)) * 31) + Boolean.hashCode(this.doNotDisturb)) * 31) + Boolean.hashCode(this.hideGroupMembers)) * 31) + Boolean.hashCode(this.denyMembersUploadToGroupDisk)) * 31) + Long.hashCode(this.communityId)) * 31) + this.communityName.hashCode()) * 31) + Boolean.hashCode(this.isTop)) * 31) + this.adminIds.hashCode()) * 31) + this.ownerId.hashCode()) * 31) + this.limitedMsgType.hashCode()) * 31) + (this.avatarId == null ? 0 : this.avatarId.hashCode())) * 31) + (this.recommendation == null ? 0 : this.recommendation.hashCode())) * 31) + (this.myGroupNickname == null ? 0 : this.myGroupNickname.hashCode())) * 31) + (this.groupCode != null ? this.groupCode.hashCode() : 0)) * 31) + Long.hashCode(this.autoDeleteMessage);
    }

    public String toString() {
        return "GroupDetail(groupId=" + this.groupId + ", name=" + this.name + ", avatarUrl=" + this.avatarUrl + ", introduction=" + this.introduction + ", memberCount=" + this.memberCount + ", createBy=" + this.createBy + ", directJoin=" + this.directJoin + ", permissionLevel=" + this.permissionLevel + ", historyMsgEnabled=" + this.historyMsgEnabled + ", categoryName=" + this.categoryName + ", categoryId=" + this.categoryId + ", isPrivate=" + this.isPrivate + ", doNotDisturb=" + this.doNotDisturb + ", hideGroupMembers=" + this.hideGroupMembers + ", denyMembersUploadToGroupDisk=" + this.denyMembersUploadToGroupDisk + ", communityId=" + this.communityId + ", communityName=" + this.communityName + ", isTop=" + this.isTop + ", adminIds=" + this.adminIds + ", ownerId=" + this.ownerId + ", limitedMsgType=" + this.limitedMsgType + ", avatarId=" + this.avatarId + ", recommendation=" + this.recommendation + ", myGroupNickname=" + this.myGroupNickname + ", groupCode=" + this.groupCode + ", autoDeleteMessage=" + this.autoDeleteMessage + ")";
    }

    public GroupDetail(String groupId, String name, String avatarUrl, String introduction, int memberCount, String createBy, boolean directJoin, int permissionLevel, boolean historyMsgEnabled, String categoryName, long categoryId, boolean isPrivate, boolean doNotDisturb, boolean hideGroupMembers, boolean denyMembersUploadToGroupDisk, long communityId, String communityName, boolean isTop, List<String> adminIds, String ownerId, String limitedMsgType, Long avatarId, Integer recommendation, String myGroupNickname, String groupCode, long autoDeleteMessage) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        Intrinsics.checkNotNullParameter(communityName, "communityName");
        Intrinsics.checkNotNullParameter(adminIds, "adminIds");
        Intrinsics.checkNotNullParameter(ownerId, "ownerId");
        Intrinsics.checkNotNullParameter(limitedMsgType, "limitedMsgType");
        this.groupId = groupId;
        this.name = name;
        this.avatarUrl = avatarUrl;
        this.introduction = introduction;
        this.memberCount = memberCount;
        this.createBy = createBy;
        this.directJoin = directJoin;
        this.permissionLevel = permissionLevel;
        this.historyMsgEnabled = historyMsgEnabled;
        this.categoryName = categoryName;
        this.categoryId = categoryId;
        this.isPrivate = isPrivate;
        this.doNotDisturb = doNotDisturb;
        this.hideGroupMembers = hideGroupMembers;
        this.denyMembersUploadToGroupDisk = denyMembersUploadToGroupDisk;
        this.communityId = communityId;
        this.communityName = communityName;
        this.isTop = isTop;
        this.adminIds = adminIds;
        this.ownerId = ownerId;
        this.limitedMsgType = limitedMsgType;
        this.avatarId = avatarId;
        this.recommendation = recommendation;
        this.myGroupNickname = myGroupNickname;
        this.groupCode = groupCode;
        this.autoDeleteMessage = autoDeleteMessage;
    }

    public /* synthetic */ GroupDetail(String str, String str2, String str3, String str4, int i, String str5, boolean z, int i2, boolean z2, String str6, long j, boolean z3, boolean z4, boolean z5, boolean z6, long j2, String str7, boolean z7, List list, String str8, String str9, Long l, Integer num, String str10, String str11, long j3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, i, str5, z, i2, z2, str6, j, z3, z4, z5, z6, j2, str7, z7, list, str8, str9, (i3 & 2097152) != 0 ? null : l, (i3 & 4194304) != 0 ? null : num, (i3 & 8388608) != 0 ? null : str10, (i3 & 16777216) != 0 ? null : str11, (i3 & 33554432) != 0 ? 0L : j3);
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getIntroduction() {
        return this.introduction;
    }

    public final int getMemberCount() {
        return this.memberCount;
    }

    public final String getCreateBy() {
        return this.createBy;
    }

    public final boolean getDirectJoin() {
        return this.directJoin;
    }

    public final int getPermissionLevel() {
        return this.permissionLevel;
    }

    public final boolean getHistoryMsgEnabled() {
        return this.historyMsgEnabled;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final long getCategoryId() {
        return this.categoryId;
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public final boolean getDoNotDisturb() {
        return this.doNotDisturb;
    }

    public final boolean getHideGroupMembers() {
        return this.hideGroupMembers;
    }

    public final boolean getDenyMembersUploadToGroupDisk() {
        return this.denyMembersUploadToGroupDisk;
    }

    public final long getCommunityId() {
        return this.communityId;
    }

    public final String getCommunityName() {
        return this.communityName;
    }

    public final boolean isTop() {
        return this.isTop;
    }

    public final List<String> getAdminIds() {
        return this.adminIds;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getLimitedMsgType() {
        return this.limitedMsgType;
    }

    public final Long getAvatarId() {
        return this.avatarId;
    }

    public final Integer getRecommendation() {
        return this.recommendation;
    }

    public final String getMyGroupNickname() {
        return this.myGroupNickname;
    }

    public final String getGroupCode() {
        return this.groupCode;
    }

    public final long getAutoDeleteMessage() {
        return this.autoDeleteMessage;
    }
}
