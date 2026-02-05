package com.yhchat.canarys.data.local;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CachedConversation.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u00a2\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010 J\t\u0010/\u001a\u00020\tH\u00c6\u0003J\u008c\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u00020\u0005H\u00d6\u0001J\t\u00106\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u0011\u0010\u0010\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001a\u00a8\u00067"}, m169d2 = {"Lcom/yhchat/canarys/data/local/CachedConversation;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", HintConstants.AUTOFILL_HINT_NAME, "chatContent", "timestampMs", "", "timestamp", "unreadMessage", "at", "avatarUrl", "doNotDisturb", "certificationLevel", "lastUpdateTime", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JJIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;J)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "getName", "getChatContent", "getTimestampMs", "()J", "getTimestamp", "getUnreadMessage", "getAt", "getAvatarUrl", "getDoNotDisturb", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCertificationLevel", "getLastUpdateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JJIILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;J)Lcom/yhchat/canarys/data/local/CachedConversation;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CachedConversation {
    public static final int $stable = 0;
    private final int at;
    private final String avatarUrl;
    private final Integer certificationLevel;
    private final String chatContent;
    private final String chatId;
    private final int chatType;
    private final Integer doNotDisturb;
    private final long lastUpdateTime;
    private final String name;
    private final long timestamp;
    private final long timestampMs;
    private final int unreadMessage;

    public static /* synthetic */ CachedConversation copy$default(CachedConversation cachedConversation, String str, int i, String str2, String str3, long j, long j2, int i2, int i3, String str4, Integer num, Integer num2, long j3, int i4, Object obj) {
        long j4;
        String str5;
        CachedConversation cachedConversation2;
        int i5;
        String str6;
        String str7;
        long j5;
        long j6;
        int i6;
        int i7;
        String str8;
        Integer num3;
        Integer num4;
        String str9 = (i4 & 1) != 0 ? cachedConversation.chatId : str;
        int i8 = (i4 & 2) != 0 ? cachedConversation.chatType : i;
        String str10 = (i4 & 4) != 0 ? cachedConversation.name : str2;
        String str11 = (i4 & 8) != 0 ? cachedConversation.chatContent : str3;
        long j7 = (i4 & 16) != 0 ? cachedConversation.timestampMs : j;
        long j8 = (i4 & 32) != 0 ? cachedConversation.timestamp : j2;
        int i9 = (i4 & 64) != 0 ? cachedConversation.unreadMessage : i2;
        int i10 = (i4 & 128) != 0 ? cachedConversation.at : i3;
        String str12 = (i4 & 256) != 0 ? cachedConversation.avatarUrl : str4;
        Integer num5 = (i4 & 512) != 0 ? cachedConversation.doNotDisturb : num;
        Integer num6 = (i4 & 1024) != 0 ? cachedConversation.certificationLevel : num2;
        if ((i4 & 2048) != 0) {
            str5 = str9;
            j4 = cachedConversation.lastUpdateTime;
            i5 = i8;
            str6 = str10;
            str7 = str11;
            j5 = j7;
            j6 = j8;
            i6 = i9;
            i7 = i10;
            str8 = str12;
            num3 = num5;
            num4 = num6;
            cachedConversation2 = cachedConversation;
        } else {
            j4 = j3;
            str5 = str9;
            cachedConversation2 = cachedConversation;
            i5 = i8;
            str6 = str10;
            str7 = str11;
            j5 = j7;
            j6 = j8;
            i6 = i9;
            i7 = i10;
            str8 = str12;
            num3 = num5;
            num4 = num6;
        }
        return cachedConversation2.copy(str5, i5, str6, str7, j5, j6, i6, i7, str8, num3, num4, j4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getDoNotDisturb() {
        return this.doNotDisturb;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getCertificationLevel() {
        return this.certificationLevel;
    }

    /* renamed from: component12, reason: from getter */
    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /* renamed from: component2, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getChatContent() {
        return this.chatContent;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTimestampMs() {
        return this.timestampMs;
    }

    /* renamed from: component6, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component7, reason: from getter */
    public final int getUnreadMessage() {
        return this.unreadMessage;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAt() {
        return this.at;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final CachedConversation copy(String chatId, int chatType, String name, String chatContent, long timestampMs, long timestamp, int unreadMessage, int at, String avatarUrl, Integer doNotDisturb, Integer certificationLevel, long lastUpdateTime) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatContent, "chatContent");
        return new CachedConversation(chatId, chatType, name, chatContent, timestampMs, timestamp, unreadMessage, at, avatarUrl, doNotDisturb, certificationLevel, lastUpdateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedConversation)) {
            return false;
        }
        CachedConversation cachedConversation = (CachedConversation) other;
        return Intrinsics.areEqual(this.chatId, cachedConversation.chatId) && this.chatType == cachedConversation.chatType && Intrinsics.areEqual(this.name, cachedConversation.name) && Intrinsics.areEqual(this.chatContent, cachedConversation.chatContent) && this.timestampMs == cachedConversation.timestampMs && this.timestamp == cachedConversation.timestamp && this.unreadMessage == cachedConversation.unreadMessage && this.at == cachedConversation.at && Intrinsics.areEqual(this.avatarUrl, cachedConversation.avatarUrl) && Intrinsics.areEqual(this.doNotDisturb, cachedConversation.doNotDisturb) && Intrinsics.areEqual(this.certificationLevel, cachedConversation.certificationLevel) && this.lastUpdateTime == cachedConversation.lastUpdateTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.chatId.hashCode() * 31) + Integer.hashCode(this.chatType)) * 31) + this.name.hashCode()) * 31) + this.chatContent.hashCode()) * 31) + Long.hashCode(this.timestampMs)) * 31) + Long.hashCode(this.timestamp)) * 31) + Integer.hashCode(this.unreadMessage)) * 31) + Integer.hashCode(this.at)) * 31) + (this.avatarUrl == null ? 0 : this.avatarUrl.hashCode())) * 31) + (this.doNotDisturb == null ? 0 : this.doNotDisturb.hashCode())) * 31) + (this.certificationLevel != null ? this.certificationLevel.hashCode() : 0)) * 31) + Long.hashCode(this.lastUpdateTime);
    }

    public String toString() {
        return "CachedConversation(chatId=" + this.chatId + ", chatType=" + this.chatType + ", name=" + this.name + ", chatContent=" + this.chatContent + ", timestampMs=" + this.timestampMs + ", timestamp=" + this.timestamp + ", unreadMessage=" + this.unreadMessage + ", at=" + this.at + ", avatarUrl=" + this.avatarUrl + ", doNotDisturb=" + this.doNotDisturb + ", certificationLevel=" + this.certificationLevel + ", lastUpdateTime=" + this.lastUpdateTime + ")";
    }

    public CachedConversation(String chatId, int chatType, String name, String chatContent, long timestampMs, long timestamp, int unreadMessage, int at, String avatarUrl, Integer doNotDisturb, Integer certificationLevel, long lastUpdateTime) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatContent, "chatContent");
        this.chatId = chatId;
        this.chatType = chatType;
        this.name = name;
        this.chatContent = chatContent;
        this.timestampMs = timestampMs;
        this.timestamp = timestamp;
        this.unreadMessage = unreadMessage;
        this.at = at;
        this.avatarUrl = avatarUrl;
        this.doNotDisturb = doNotDisturb;
        this.certificationLevel = certificationLevel;
        this.lastUpdateTime = lastUpdateTime;
    }

    public /* synthetic */ CachedConversation(String str, int i, String str2, String str3, long j, long j2, int i2, int i3, String str4, Integer num, Integer num2, long j3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, j, j2, i2, i3, (i4 & 256) != 0 ? null : str4, (i4 & 512) != 0 ? null : num, (i4 & 1024) != 0 ? null : num2, (i4 & 2048) != 0 ? System.currentTimeMillis() : j3);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getChatContent() {
        return this.chatContent;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final int getUnreadMessage() {
        return this.unreadMessage;
    }

    public final int getAt() {
        return this.at;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Integer getDoNotDisturb() {
        return this.doNotDisturb;
    }

    public final Integer getCertificationLevel() {
        return this.certificationLevel;
    }

    public final long getLastUpdateTime() {
        return this.lastUpdateTime;
    }
}
