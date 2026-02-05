package com.yhchat.canarys.data.model;

import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: ChatBackground.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020\nH\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/data/model/ChatBackground;", "", Name.MARK, "", "userId", "", ChatSearchActivity.EXTRA_CHAT_ID, "imgUrl", "createTime", "delFlag", "", "updateTime", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JIJ)V", "getId", "()J", "getUserId", "()Ljava/lang/String;", "getChatId", "getImgUrl", "getCreateTime", "getDelFlag", "()I", "getUpdateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class ChatBackground {
    public static final int $stable = 0;

    @SerializedName(ChatSearchActivity.EXTRA_CHAT_ID)
    private final String chatId;

    @SerializedName("createTime")
    private final long createTime;

    @SerializedName("delFlag")
    private final int delFlag;

    @SerializedName(Name.MARK)
    private final long id;

    @SerializedName("imgUrl")
    private final String imgUrl;

    @SerializedName("updateTime")
    private final long updateTime;

    @SerializedName("userId")
    private final String userId;

    public static /* synthetic */ ChatBackground copy$default(ChatBackground chatBackground, long j, String str, String str2, String str3, long j2, int i, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = chatBackground.id;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            str = chatBackground.userId;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = chatBackground.chatId;
        }
        return chatBackground.copy(j4, str4, str2, (i2 & 8) != 0 ? chatBackground.imgUrl : str3, (i2 & 16) != 0 ? chatBackground.createTime : j2, (i2 & 32) != 0 ? chatBackground.delFlag : i, (i2 & 64) != 0 ? chatBackground.updateTime : j3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getImgUrl() {
        return this.imgUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDelFlag() {
        return this.delFlag;
    }

    /* renamed from: component7, reason: from getter */
    public final long getUpdateTime() {
        return this.updateTime;
    }

    public final ChatBackground copy(long id, String userId, String chatId, String imgUrl, long createTime, int delFlag, long updateTime) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        return new ChatBackground(id, userId, chatId, imgUrl, createTime, delFlag, updateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatBackground)) {
            return false;
        }
        ChatBackground chatBackground = (ChatBackground) other;
        return this.id == chatBackground.id && Intrinsics.areEqual(this.userId, chatBackground.userId) && Intrinsics.areEqual(this.chatId, chatBackground.chatId) && Intrinsics.areEqual(this.imgUrl, chatBackground.imgUrl) && this.createTime == chatBackground.createTime && this.delFlag == chatBackground.delFlag && this.updateTime == chatBackground.updateTime;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + this.userId.hashCode()) * 31) + this.chatId.hashCode()) * 31) + this.imgUrl.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Integer.hashCode(this.delFlag)) * 31) + Long.hashCode(this.updateTime);
    }

    public String toString() {
        return "ChatBackground(id=" + this.id + ", userId=" + this.userId + ", chatId=" + this.chatId + ", imgUrl=" + this.imgUrl + ", createTime=" + this.createTime + ", delFlag=" + this.delFlag + ", updateTime=" + this.updateTime + ")";
    }

    public ChatBackground(long id, String userId, String chatId, String imgUrl, long createTime, int delFlag, long updateTime) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(imgUrl, "imgUrl");
        this.id = id;
        this.userId = userId;
        this.chatId = chatId;
        this.imgUrl = imgUrl;
        this.createTime = createTime;
        this.delFlag = delFlag;
        this.updateTime = updateTime;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChatBackground(long j, String str, String str2, String str3, long j2, int i, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        int i3;
        if ((i2 & 32) == 0) {
            i3 = i;
        } else {
            i3 = 0;
        }
        this(j, str, str2, str3, j2, i3, j3);
    }

    public final long getId() {
        return this.id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final int getDelFlag() {
        return this.delFlag;
    }

    public final long getUpdateTime() {
        return this.updateTime;
    }
}
