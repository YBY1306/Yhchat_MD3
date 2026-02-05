package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0005H\u00c6\u0003J\t\u0010$\u001a\u00020\u0005H\u00c6\u0003J\t\u0010%\u001a\u00020\fH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jq\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001J\t\u0010-\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014\u00a8\u0006."}, m169d2 = {"Lcom/yhchat/canarys/data/model/ShareInfo;", "", Name.MARK, "", "userId", "", ChatSearchActivity.EXTRA_CHAT_NAME, ChatSearchActivity.EXTRA_CHAT_TYPE, ChatSearchActivity.EXTRA_CHAT_ID, "key", "createBy", "createTime", "", "imageUrl", "imageName", "<init>", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "getId", "()I", "getUserId", "()Ljava/lang/String;", "getChatName", "getChatType", "getChatId", "getKey", "getCreateBy", "getCreateTime", "()J", "getImageUrl", "getImageName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ShareInfo {
    public static final int $stable = 0;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_name")
    private final String chatName;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName("create_by")
    private final String createBy;

    @SerializedName("create_time")
    private final long createTime;

    @SerializedName(Name.MARK)
    private final int id;

    @SerializedName("imageName")
    private final String imageName;

    @SerializedName("imageUrl")
    private final String imageUrl;

    @SerializedName("key")
    private final String key;

    @SerializedName("user_id")
    private final String userId;

    public static /* synthetic */ ShareInfo copy$default(ShareInfo shareInfo, int i, String str, String str2, int i2, String str3, String str4, String str5, long j, String str6, String str7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = shareInfo.id;
        }
        if ((i3 & 2) != 0) {
            str = shareInfo.userId;
        }
        if ((i3 & 4) != 0) {
            str2 = shareInfo.chatName;
        }
        if ((i3 & 8) != 0) {
            i2 = shareInfo.chatType;
        }
        if ((i3 & 16) != 0) {
            str3 = shareInfo.chatId;
        }
        if ((i3 & 32) != 0) {
            str4 = shareInfo.key;
        }
        if ((i3 & 64) != 0) {
            str5 = shareInfo.createBy;
        }
        if ((i3 & 128) != 0) {
            j = shareInfo.createTime;
        }
        if ((i3 & 256) != 0) {
            str6 = shareInfo.imageUrl;
        }
        if ((i3 & 512) != 0) {
            str7 = shareInfo.imageName;
        }
        long j2 = j;
        String str8 = str4;
        String str9 = str5;
        int i4 = i2;
        String str10 = str3;
        String str11 = str2;
        return shareInfo.copy(i, str, str11, i4, str10, str8, str9, j2, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChatName() {
        return this.chatName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCreateBy() {
        return this.createBy;
    }

    /* renamed from: component8, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component9, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final ShareInfo copy(int id, String userId, String chatName, int chatType, String chatId, String key, String createBy, long createTime, String imageUrl, String imageName) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        return new ShareInfo(id, userId, chatName, chatType, chatId, key, createBy, createTime, imageUrl, imageName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareInfo)) {
            return false;
        }
        ShareInfo shareInfo = (ShareInfo) other;
        return this.id == shareInfo.id && Intrinsics.areEqual(this.userId, shareInfo.userId) && Intrinsics.areEqual(this.chatName, shareInfo.chatName) && this.chatType == shareInfo.chatType && Intrinsics.areEqual(this.chatId, shareInfo.chatId) && Intrinsics.areEqual(this.key, shareInfo.key) && Intrinsics.areEqual(this.createBy, shareInfo.createBy) && this.createTime == shareInfo.createTime && Intrinsics.areEqual(this.imageUrl, shareInfo.imageUrl) && Intrinsics.areEqual(this.imageName, shareInfo.imageName);
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.id) * 31) + this.userId.hashCode()) * 31) + this.chatName.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + this.chatId.hashCode()) * 31) + this.key.hashCode()) * 31) + this.createBy.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + (this.imageUrl == null ? 0 : this.imageUrl.hashCode())) * 31) + (this.imageName != null ? this.imageName.hashCode() : 0);
    }

    public String toString() {
        return "ShareInfo(id=" + this.id + ", userId=" + this.userId + ", chatName=" + this.chatName + ", chatType=" + this.chatType + ", chatId=" + this.chatId + ", key=" + this.key + ", createBy=" + this.createBy + ", createTime=" + this.createTime + ", imageUrl=" + this.imageUrl + ", imageName=" + this.imageName + ")";
    }

    public ShareInfo(int id, String userId, String chatName, int chatType, String chatId, String key, String createBy, long createTime, String imageUrl, String imageName) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(createBy, "createBy");
        this.id = id;
        this.userId = userId;
        this.chatName = chatName;
        this.chatType = chatType;
        this.chatId = chatId;
        this.key = key;
        this.createBy = createBy;
        this.createTime = createTime;
        this.imageUrl = imageUrl;
        this.imageName = imageName;
    }

    public final int getId() {
        return this.id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getChatName() {
        return this.chatName;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getCreateBy() {
        return this.createBy;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getImageName() {
        return this.imageName;
    }
}
