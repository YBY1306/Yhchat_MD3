package com.yhchat.canarys.p007ui.contacts;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsViewModel.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b:\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00a7\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0005H\u00c6\u0003J\t\u00104\u001a\u00020\u0005H\u00c6\u0003J\t\u00105\u001a\u00020\u0005H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\rH\u00c6\u0003J\t\u0010;\u001a\u00020\rH\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003J\t\u0010>\u001a\u00020\rH\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0005H\u00c6\u0003J\t\u0010B\u001a\u00020\u0005H\u00c6\u0003J\t\u0010C\u001a\u00020\u0005H\u00c6\u0003J\t\u0010D\u001a\u00020\u0005H\u00c6\u0003J\t\u0010E\u001a\u00020\u0005H\u00c6\u0003J\u00d1\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010J\u001a\u00020\rH\u00d6\u0001J\t\u0010K\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0011\u0010\u0011\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0011\u0010\u0012\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0011\u0010\u0014\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u0011\u0010\u0015\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0011\u0010\u0016\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0011\u0010\u0017\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u0010\u0018\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001e\u00a8\u0006L"}, m169d2 = {"Lcom/yhchat/canarys/ui/contacts/FriendRequestItem;", "", "requestId", "", "receiverName", "", "receiverAvatar", HintConstants.AUTOFILL_HINT_NAME, "avatar", "groupName", "groupAvatar", "inviterId", "sourceType", "", "targetType", "targetId", "receiverId", "result", "processedAt", "inviteAt", "inviteAtStr", "botName", "botAvatar", "processorName", "note", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;IJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()J", "getReceiverName", "()Ljava/lang/String;", "getReceiverAvatar", "getName", "getAvatar", "getGroupName", "getGroupAvatar", "getInviterId", "getSourceType", "()I", "getTargetType", "getTargetId", "getReceiverId", "getResult", "getProcessedAt", "getInviteAt", "getInviteAtStr", "getBotName", "getBotAvatar", "getProcessorName", "getNote", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FriendRequestItem {
    public static final int $stable = 0;
    private final String avatar;
    private final String botAvatar;
    private final String botName;
    private final String groupAvatar;
    private final String groupName;
    private final long inviteAt;
    private final String inviteAtStr;
    private final String inviterId;
    private final String name;
    private final String note;
    private final long processedAt;
    private final String processorName;
    private final String receiverAvatar;
    private final String receiverId;
    private final String receiverName;
    private final long requestId;
    private final int result;
    private final int sourceType;
    private final String targetId;
    private final int targetType;

    public static /* synthetic */ FriendRequestItem copy$default(FriendRequestItem friendRequestItem, long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, String str8, String str9, int i3, long j2, long j3, String str10, String str11, String str12, String str13, String str14, int i4, Object obj) {
        String str15;
        String str16;
        long j4 = (i4 & 1) != 0 ? friendRequestItem.requestId : j;
        String str17 = (i4 & 2) != 0 ? friendRequestItem.receiverName : str;
        String str18 = (i4 & 4) != 0 ? friendRequestItem.receiverAvatar : str2;
        String str19 = (i4 & 8) != 0 ? friendRequestItem.name : str3;
        String str20 = (i4 & 16) != 0 ? friendRequestItem.avatar : str4;
        String str21 = (i4 & 32) != 0 ? friendRequestItem.groupName : str5;
        String str22 = (i4 & 64) != 0 ? friendRequestItem.groupAvatar : str6;
        String str23 = (i4 & 128) != 0 ? friendRequestItem.inviterId : str7;
        int i5 = (i4 & 256) != 0 ? friendRequestItem.sourceType : i;
        int i6 = (i4 & 512) != 0 ? friendRequestItem.targetType : i2;
        String str24 = (i4 & 1024) != 0 ? friendRequestItem.targetId : str8;
        String str25 = (i4 & 2048) != 0 ? friendRequestItem.receiverId : str9;
        int i7 = (i4 & 4096) != 0 ? friendRequestItem.result : i3;
        long j5 = j4;
        long j6 = (i4 & 8192) != 0 ? friendRequestItem.processedAt : j2;
        long j7 = (i4 & 16384) != 0 ? friendRequestItem.inviteAt : j3;
        String str26 = (i4 & 32768) != 0 ? friendRequestItem.inviteAtStr : str10;
        String str27 = (i4 & 65536) != 0 ? friendRequestItem.botName : str11;
        String str28 = (i4 & 131072) != 0 ? friendRequestItem.botAvatar : str12;
        String str29 = (i4 & 262144) != 0 ? friendRequestItem.processorName : str13;
        if ((i4 & 524288) != 0) {
            str16 = str29;
            str15 = friendRequestItem.note;
        } else {
            str15 = str14;
            str16 = str29;
        }
        return friendRequestItem.copy(j5, str17, str18, str19, str20, str21, str22, str23, i5, i6, str24, str25, i7, j6, j7, str26, str27, str28, str16, str15);
    }

    /* renamed from: component1, reason: from getter */
    public final long getRequestId() {
        return this.requestId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getTargetType() {
        return this.targetType;
    }

    /* renamed from: component11, reason: from getter */
    public final String getTargetId() {
        return this.targetId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getReceiverId() {
        return this.receiverId;
    }

    /* renamed from: component13, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    /* renamed from: component14, reason: from getter */
    public final long getProcessedAt() {
        return this.processedAt;
    }

    /* renamed from: component15, reason: from getter */
    public final long getInviteAt() {
        return this.inviteAt;
    }

    /* renamed from: component16, reason: from getter */
    public final String getInviteAtStr() {
        return this.inviteAtStr;
    }

    /* renamed from: component17, reason: from getter */
    public final String getBotName() {
        return this.botName;
    }

    /* renamed from: component18, reason: from getter */
    public final String getBotAvatar() {
        return this.botAvatar;
    }

    /* renamed from: component19, reason: from getter */
    public final String getProcessorName() {
        return this.processorName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getReceiverName() {
        return this.receiverName;
    }

    /* renamed from: component20, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReceiverAvatar() {
        return this.receiverAvatar;
    }

    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component6, reason: from getter */
    public final String getGroupName() {
        return this.groupName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    /* renamed from: component8, reason: from getter */
    public final String getInviterId() {
        return this.inviterId;
    }

    /* renamed from: component9, reason: from getter */
    public final int getSourceType() {
        return this.sourceType;
    }

    public final FriendRequestItem copy(long requestId, String receiverName, String receiverAvatar, String name, String avatar, String groupName, String groupAvatar, String inviterId, int sourceType, int targetType, String targetId, String receiverId, int result, long processedAt, long inviteAt, String inviteAtStr, String botName, String botAvatar, String processorName, String note) {
        Intrinsics.checkNotNullParameter(receiverName, "receiverName");
        Intrinsics.checkNotNullParameter(receiverAvatar, "receiverAvatar");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(groupAvatar, "groupAvatar");
        Intrinsics.checkNotNullParameter(inviterId, "inviterId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(receiverId, "receiverId");
        Intrinsics.checkNotNullParameter(inviteAtStr, "inviteAtStr");
        Intrinsics.checkNotNullParameter(botName, "botName");
        Intrinsics.checkNotNullParameter(botAvatar, "botAvatar");
        Intrinsics.checkNotNullParameter(processorName, "processorName");
        Intrinsics.checkNotNullParameter(note, "note");
        return new FriendRequestItem(requestId, receiverName, receiverAvatar, name, avatar, groupName, groupAvatar, inviterId, sourceType, targetType, targetId, receiverId, result, processedAt, inviteAt, inviteAtStr, botName, botAvatar, processorName, note);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FriendRequestItem)) {
            return false;
        }
        FriendRequestItem friendRequestItem = (FriendRequestItem) other;
        return this.requestId == friendRequestItem.requestId && Intrinsics.areEqual(this.receiverName, friendRequestItem.receiverName) && Intrinsics.areEqual(this.receiverAvatar, friendRequestItem.receiverAvatar) && Intrinsics.areEqual(this.name, friendRequestItem.name) && Intrinsics.areEqual(this.avatar, friendRequestItem.avatar) && Intrinsics.areEqual(this.groupName, friendRequestItem.groupName) && Intrinsics.areEqual(this.groupAvatar, friendRequestItem.groupAvatar) && Intrinsics.areEqual(this.inviterId, friendRequestItem.inviterId) && this.sourceType == friendRequestItem.sourceType && this.targetType == friendRequestItem.targetType && Intrinsics.areEqual(this.targetId, friendRequestItem.targetId) && Intrinsics.areEqual(this.receiverId, friendRequestItem.receiverId) && this.result == friendRequestItem.result && this.processedAt == friendRequestItem.processedAt && this.inviteAt == friendRequestItem.inviteAt && Intrinsics.areEqual(this.inviteAtStr, friendRequestItem.inviteAtStr) && Intrinsics.areEqual(this.botName, friendRequestItem.botName) && Intrinsics.areEqual(this.botAvatar, friendRequestItem.botAvatar) && Intrinsics.areEqual(this.processorName, friendRequestItem.processorName) && Intrinsics.areEqual(this.note, friendRequestItem.note);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((Long.hashCode(this.requestId) * 31) + this.receiverName.hashCode()) * 31) + this.receiverAvatar.hashCode()) * 31) + this.name.hashCode()) * 31) + this.avatar.hashCode()) * 31) + this.groupName.hashCode()) * 31) + this.groupAvatar.hashCode()) * 31) + this.inviterId.hashCode()) * 31) + Integer.hashCode(this.sourceType)) * 31) + Integer.hashCode(this.targetType)) * 31) + this.targetId.hashCode()) * 31) + this.receiverId.hashCode()) * 31) + Integer.hashCode(this.result)) * 31) + Long.hashCode(this.processedAt)) * 31) + Long.hashCode(this.inviteAt)) * 31) + this.inviteAtStr.hashCode()) * 31) + this.botName.hashCode()) * 31) + this.botAvatar.hashCode()) * 31) + this.processorName.hashCode()) * 31) + this.note.hashCode();
    }

    public String toString() {
        return "FriendRequestItem(requestId=" + this.requestId + ", receiverName=" + this.receiverName + ", receiverAvatar=" + this.receiverAvatar + ", name=" + this.name + ", avatar=" + this.avatar + ", groupName=" + this.groupName + ", groupAvatar=" + this.groupAvatar + ", inviterId=" + this.inviterId + ", sourceType=" + this.sourceType + ", targetType=" + this.targetType + ", targetId=" + this.targetId + ", receiverId=" + this.receiverId + ", result=" + this.result + ", processedAt=" + this.processedAt + ", inviteAt=" + this.inviteAt + ", inviteAtStr=" + this.inviteAtStr + ", botName=" + this.botName + ", botAvatar=" + this.botAvatar + ", processorName=" + this.processorName + ", note=" + this.note + ")";
    }

    public FriendRequestItem(long requestId, String receiverName, String receiverAvatar, String name, String avatar, String groupName, String groupAvatar, String inviterId, int sourceType, int targetType, String targetId, String receiverId, int result, long processedAt, long inviteAt, String inviteAtStr, String botName, String botAvatar, String processorName, String note) {
        Intrinsics.checkNotNullParameter(receiverName, "receiverName");
        Intrinsics.checkNotNullParameter(receiverAvatar, "receiverAvatar");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(avatar, "avatar");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(groupAvatar, "groupAvatar");
        Intrinsics.checkNotNullParameter(inviterId, "inviterId");
        Intrinsics.checkNotNullParameter(targetId, "targetId");
        Intrinsics.checkNotNullParameter(receiverId, "receiverId");
        Intrinsics.checkNotNullParameter(inviteAtStr, "inviteAtStr");
        Intrinsics.checkNotNullParameter(botName, "botName");
        Intrinsics.checkNotNullParameter(botAvatar, "botAvatar");
        Intrinsics.checkNotNullParameter(processorName, "processorName");
        Intrinsics.checkNotNullParameter(note, "note");
        this.requestId = requestId;
        this.receiverName = receiverName;
        this.receiverAvatar = receiverAvatar;
        this.name = name;
        this.avatar = avatar;
        this.groupName = groupName;
        this.groupAvatar = groupAvatar;
        this.inviterId = inviterId;
        this.sourceType = sourceType;
        this.targetType = targetType;
        this.targetId = targetId;
        this.receiverId = receiverId;
        this.result = result;
        this.processedAt = processedAt;
        this.inviteAt = inviteAt;
        this.inviteAtStr = inviteAtStr;
        this.botName = botName;
        this.botAvatar = botAvatar;
        this.processorName = processorName;
        this.note = note;
    }

    public final long getRequestId() {
        return this.requestId;
    }

    public final String getReceiverName() {
        return this.receiverName;
    }

    public final String getReceiverAvatar() {
        return this.receiverAvatar;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getGroupName() {
        return this.groupName;
    }

    public final String getGroupAvatar() {
        return this.groupAvatar;
    }

    public final String getInviterId() {
        return this.inviterId;
    }

    public final int getSourceType() {
        return this.sourceType;
    }

    public final int getTargetType() {
        return this.targetType;
    }

    public final String getTargetId() {
        return this.targetId;
    }

    public final String getReceiverId() {
        return this.receiverId;
    }

    public final int getResult() {
        return this.result;
    }

    public final long getProcessedAt() {
        return this.processedAt;
    }

    public final long getInviteAt() {
        return this.inviteAt;
    }

    public final String getInviteAtStr() {
        return this.inviteAtStr;
    }

    public final String getBotName() {
        return this.botName;
    }

    public final String getBotAvatar() {
        return this.botAvatar;
    }

    public final String getProcessorName() {
        return this.processorName;
    }

    public final String getNote() {
        return this.note;
    }
}
