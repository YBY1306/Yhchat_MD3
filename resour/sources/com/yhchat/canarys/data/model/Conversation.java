package com.yhchat.canarys.data.model;

import androidx.autofill.HintConstants;
import com.google.gson.annotations.SerializedName;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Conversation.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\u0013\u0010\u0014J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0005H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010 J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00103\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\t\u00104\u001a\u00020\tH\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u009a\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u00108J\u0013\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010<\u001a\u00020\u0005H\u00d6\u0001J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u0016\u0010\u000f\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b)\u0010$\u00a8\u0006>"}, m169d2 = {"Lcom/yhchat/canarys/data/model/Conversation;", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", HintConstants.AUTOFILL_HINT_NAME, "chatContent", "timestampMs", "", "unreadMessage", "at", "avatarId", "avatarUrl", "doNotDisturb", "timestamp", "atData", "Lcom/yhchat/canarys/data/model/AtData;", "certificationLevel", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIILjava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;JLcom/yhchat/canarys/data/model/AtData;Ljava/lang/Integer;)V", "getChatId", "()Ljava/lang/String;", "getChatType", "()I", "getName", "getChatContent", "getTimestampMs", "()J", "getUnreadMessage", "getAt", "getAvatarId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAvatarUrl", "getDoNotDisturb", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimestamp", "getAtData", "()Lcom/yhchat/canarys/data/model/AtData;", "getCertificationLevel", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;JIILjava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;JLcom/yhchat/canarys/data/model/AtData;Ljava/lang/Integer;)Lcom/yhchat/canarys/data/model/Conversation;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class Conversation {
    public static final int $stable = 0;

    @SerializedName("at")
    private final int at;

    @SerializedName("at_data")
    private final AtData atData;

    @SerializedName("avatar_id")
    private final Long avatarId;

    @SerializedName("avatar_url")
    private final String avatarUrl;

    @SerializedName("certification_level")
    private final Integer certificationLevel;

    @SerializedName("chat_content")
    private final String chatContent;

    @SerializedName("chat_id")
    private final String chatId;

    @SerializedName("chat_type")
    private final int chatType;

    @SerializedName("do_not_disturb")
    private final Integer doNotDisturb;

    @SerializedName(HintConstants.AUTOFILL_HINT_NAME)
    private final String name;

    @SerializedName("timestamp")
    private final long timestamp;

    @SerializedName("timestamp_ms")
    private final long timestampMs;

    @SerializedName("unread_message")
    private final int unreadMessage;

    /* renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getDoNotDisturb() {
        return this.doNotDisturb;
    }

    /* renamed from: component11, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component12, reason: from getter */
    public final AtData getAtData() {
        return this.atData;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getCertificationLevel() {
        return this.certificationLevel;
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
    public final int getUnreadMessage() {
        return this.unreadMessage;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAt() {
        return this.at;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getAvatarId() {
        return this.avatarId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Conversation copy(String str, int i, String str2, String chatContent, long timestampMs, int unreadMessage, int at, Long avatarId, String avatarUrl, Integer doNotDisturb, long timestamp, AtData atData, Integer certificationLevel) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(chatContent, "chatContent");
        return new Conversation(str, i, str2, chatContent, timestampMs, unreadMessage, at, avatarId, avatarUrl, doNotDisturb, timestamp, atData, certificationLevel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Conversation)) {
            return false;
        }
        Conversation conversation = (Conversation) other;
        return Intrinsics.areEqual(this.chatId, conversation.chatId) && this.chatType == conversation.chatType && Intrinsics.areEqual(this.name, conversation.name) && Intrinsics.areEqual(this.chatContent, conversation.chatContent) && this.timestampMs == conversation.timestampMs && this.unreadMessage == conversation.unreadMessage && this.at == conversation.at && Intrinsics.areEqual(this.avatarId, conversation.avatarId) && Intrinsics.areEqual(this.avatarUrl, conversation.avatarUrl) && Intrinsics.areEqual(this.doNotDisturb, conversation.doNotDisturb) && this.timestamp == conversation.timestamp && Intrinsics.areEqual(this.atData, conversation.atData) && Intrinsics.areEqual(this.certificationLevel, conversation.certificationLevel);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.chatId.hashCode() * 31) + Integer.hashCode(this.chatType)) * 31) + this.name.hashCode()) * 31) + this.chatContent.hashCode()) * 31) + Long.hashCode(this.timestampMs)) * 31) + Integer.hashCode(this.unreadMessage)) * 31) + Integer.hashCode(this.at)) * 31) + (this.avatarId == null ? 0 : this.avatarId.hashCode())) * 31) + (this.avatarUrl == null ? 0 : this.avatarUrl.hashCode())) * 31) + (this.doNotDisturb == null ? 0 : this.doNotDisturb.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31) + (this.atData == null ? 0 : this.atData.hashCode())) * 31) + (this.certificationLevel != null ? this.certificationLevel.hashCode() : 0);
    }

    public String toString() {
        return "Conversation(chatId=" + this.chatId + ", chatType=" + this.chatType + ", name=" + this.name + ", chatContent=" + this.chatContent + ", timestampMs=" + this.timestampMs + ", unreadMessage=" + this.unreadMessage + ", at=" + this.at + ", avatarId=" + this.avatarId + ", avatarUrl=" + this.avatarUrl + ", doNotDisturb=" + this.doNotDisturb + ", timestamp=" + this.timestamp + ", atData=" + this.atData + ", certificationLevel=" + this.certificationLevel + ")";
    }

    public Conversation(String chatId, int chatType, String name, String chatContent, long timestampMs, int unreadMessage, int at, Long avatarId, String avatarUrl, Integer doNotDisturb, long timestamp, AtData atData, Integer certificationLevel) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(chatContent, "chatContent");
        this.chatId = chatId;
        this.chatType = chatType;
        this.name = name;
        this.chatContent = chatContent;
        this.timestampMs = timestampMs;
        this.unreadMessage = unreadMessage;
        this.at = at;
        this.avatarId = avatarId;
        this.avatarUrl = avatarUrl;
        this.doNotDisturb = doNotDisturb;
        this.timestamp = timestamp;
        this.atData = atData;
        this.certificationLevel = certificationLevel;
    }

    public /* synthetic */ Conversation(String str, int i, String str2, String str3, long j, int i2, int i3, Long l, String str4, Integer num, long j2, AtData atData, Integer num2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3, j, i2, i3, (i4 & 128) != 0 ? null : l, (i4 & 256) != 0 ? null : str4, (i4 & 512) != 0 ? null : num, j2, (i4 & 2048) != 0 ? null : atData, (i4 & 4096) != 0 ? null : num2);
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

    public final int getUnreadMessage() {
        return this.unreadMessage;
    }

    public final int getAt() {
        return this.at;
    }

    public final Long getAvatarId() {
        return this.avatarId;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final Integer getDoNotDisturb() {
        return this.doNotDisturb;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final AtData getAtData() {
        return this.atData;
    }

    public final Integer getCertificationLevel() {
        return this.certificationLevel;
    }
}
