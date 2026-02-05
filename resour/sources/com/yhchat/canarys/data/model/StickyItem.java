package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0006H\u00c6\u0003J\t\u0010!\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\t\u0010$\u001a\u00020\tH\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0006H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003Jm\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\t\u0010-\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0012\u00a8\u0006."}, m169d2 = {"Lcom/yhchat/canarys/data/model/StickyItem;", "", Name.MARK, "", ChatSearchActivity.EXTRA_CHAT_TYPE, ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_NAME, "sort", "", "avatarUrl", "createTime", "delFlag", "userId", "certificationLevel", "<init>", "(IILjava/lang/String;Ljava/lang/String;JLjava/lang/String;JILjava/lang/String;I)V", "getId", "()I", "getChatType", "getChatId", "()Ljava/lang/String;", "getChatName", "getSort", "()J", "getAvatarUrl", "getCreateTime", "getDelFlag", "getUserId", "getCertificationLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class StickyItem {
    public static final int $stable = 0;

    @SerializedName("avatarUrl")
    private final String avatarUrl;

    @SerializedName("certificationLevel")
    private final int certificationLevel;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_NAME)
    private final String chatName;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_TYPE)
    private final int chatType;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("delFlag")
    private final int delFlag;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("sort")
    private final long sort;

    @SerializedName("userId")
    private final String userId;

    public static /* synthetic */ StickyItem copy$default(StickyItem stickyItem, int i, int i2, String str, String str2, long j, String str3, long j2, int i3, String str4, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = stickyItem.id;
        }
        if ((i5 & 2) != 0) {
            i2 = stickyItem.chatType;
        }
        if ((i5 & 4) != 0) {
            str = stickyItem.chatId;
        }
        if ((i5 & 8) != 0) {
            str2 = stickyItem.chatName;
        }
        if ((i5 & 16) != 0) {
            j = stickyItem.sort;
        }
        if ((i5 & 32) != 0) {
            str3 = stickyItem.avatarUrl;
        }
        if ((i5 & 64) != 0) {
            j2 = stickyItem.createTime;
        }
        if ((i5 & 128) != 0) {
            i3 = stickyItem.delFlag;
        }
        if ((i5 & 256) != 0) {
            str4 = stickyItem.userId;
        }
        if ((i5 & 512) != 0) {
            i4 = stickyItem.certificationLevel;
        }
        int i6 = i4;
        int i7 = i3;
        String str5 = str3;
        long j3 = j;
        String str6 = str;
        String str7 = str2;
        return stickyItem.copy(i, i2, str6, str7, j3, str5, j2, i7, str4, i6);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getCertificationLevel() {
        return this.certificationLevel;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getChatName() {
        return this.chatName;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSort() {
        return this.sort;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component8, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final StickyItem copy(int id, int chatType, String chatId, String chatName, long sort, String avatarUrl, long createTime, int delFlag, String userId, int certificationLevel) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new StickyItem(id, chatType, chatId, chatName, sort, avatarUrl, createTime, delFlag, userId, certificationLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StickyItem)) {
            return false;
        }
        StickyItem stickyItem = (StickyItem) other;
        return this.id == stickyItem.id && this.chatType == stickyItem.chatType && Intrinsics.areEqual(this.chatId, stickyItem.chatId) && Intrinsics.areEqual(this.chatName, stickyItem.chatName) && this.sort == stickyItem.sort && Intrinsics.areEqual(this.avatarUrl, stickyItem.avatarUrl) && this.createTime == stickyItem.createTime && this.delFlag == stickyItem.delFlag && Intrinsics.areEqual(this.userId, stickyItem.userId) && this.certificationLevel == stickyItem.certificationLevel;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.chatType)) * 31) + this.chatId.hashCode()) * 31) + this.chatName.hashCode()) * 31) + Long.hashCode(this.sort)) * 31) + this.avatarUrl.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.delFlag)) * 31) + this.userId.hashCode()) * 31) + Integer.hashCode(this.certificationLevel);
    }

    public String toString() {
        return "StickyItem(id=" + this.id + ", chatType=" + this.chatType + ", chatId=" + this.chatId + ", chatName=" + this.chatName + ", sort=" + this.sort + ", avatarUrl=" + this.avatarUrl + ", createTime=" + this.createTime + ", delFlag=" + this.delFlag + ", userId=" + this.userId + ", certificationLevel=" + this.certificationLevel + ")";
    }

    public StickyItem(int id, int chatType, String chatId, String chatName, long sort, String avatarUrl, long createTime, int delFlag, String userId, int certificationLevel) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.id = id;
        this.chatType = chatType;
        this.chatId = chatId;
        this.chatName = chatName;
        this.sort = sort;
        this.avatarUrl = avatarUrl;
        this.createTime = createTime;
        this.delFlag = delFlag;
        this.userId = userId;
        this.certificationLevel = certificationLevel;
    }

    public final int getId() {
        return this.id;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getChatName() {
        return this.chatName;
    }

    public final long getSort() {
        return this.sort;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDelFlag() {
        return this.delFlag;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getCertificationLevel() {
        return this.certificationLevel;
    }
}
