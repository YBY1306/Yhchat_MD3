package com.yhchat.canarys.data.local;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CachedMessage.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u00e9\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0006H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010H\u001a\u00020\u0013H\u00c6\u0003J\u0010\u0010I\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010J\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010K\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010N\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u00107J\t\u0010O\u001a\u00020\u0013H\u00c6\u0003J\u0082\u0002\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0013H\u00c6\u0001\u00a2\u0006\u0002\u0010QJ\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010U\u001a\u00020\u0006H\u00d6\u0001J\t\u0010V\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b2\u00100R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b3\u00100R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001eR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001eR\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u00108\u001a\u0004\b6\u00107R\u0011\u0010\u001a\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010.\u00a8\u0006W"}, m169d2 = {"Lcom/yhchat/canarys/data/local/CachedMessage;", "", "msgId", "", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "senderChatId", "senderName", "senderAvatarUrl", "direction", "contentType", "contentText", "contentImageUrl", "contentFileName", "contentFileUrl", "quoteMsgText", "quoteImageUrl", "sendTime", "", "msgSeq", "editTime", "msgDeleteTime", "quoteMsgId", "cmdName", "cmdType", "localInsertTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;J)V", "getMsgId", "()Ljava/lang/String;", "getChatId", "getChatType", "()I", "getSenderChatId", "getSenderName", "getSenderAvatarUrl", "getDirection", "getContentType", "getContentText", "getContentImageUrl", "getContentFileName", "getContentFileUrl", "getQuoteMsgText", "getQuoteImageUrl", "getSendTime", "()J", "getMsgSeq", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEditTime", "getMsgDeleteTime", "getQuoteMsgId", "getCmdName", "getCmdType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLocalInsertTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;J)Lcom/yhchat/canarys/data/local/CachedMessage;", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CachedMessage {
    public static final int $stable = 0;
    private final String chatId;
    private final int chatType;
    private final String cmdName;
    private final Integer cmdType;
    private final String contentFileName;
    private final String contentFileUrl;
    private final String contentImageUrl;
    private final String contentText;
    private final int contentType;
    private final String direction;
    private final Long editTime;
    private final long localInsertTime;
    private final Long msgDeleteTime;
    private final String msgId;
    private final Long msgSeq;
    private final String quoteImageUrl;
    private final String quoteMsgId;
    private final String quoteMsgText;
    private final long sendTime;
    private final String senderAvatarUrl;
    private final String senderChatId;
    private final String senderName;

    public static /* synthetic */ CachedMessage copy$default(CachedMessage cachedMessage, String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, String str7, String str8, String str9, String str10, String str11, String str12, long j, Long l, Long l2, Long l3, String str13, String str14, Integer num, long j2, int i3, Object obj) {
        long j3;
        Integer num2;
        Long l4;
        String str15 = (i3 & 1) != 0 ? cachedMessage.msgId : str;
        String str16 = (i3 & 2) != 0 ? cachedMessage.chatId : str2;
        int i4 = (i3 & 4) != 0 ? cachedMessage.chatType : i;
        String str17 = (i3 & 8) != 0 ? cachedMessage.senderChatId : str3;
        String str18 = (i3 & 16) != 0 ? cachedMessage.senderName : str4;
        String str19 = (i3 & 32) != 0 ? cachedMessage.senderAvatarUrl : str5;
        String str20 = (i3 & 64) != 0 ? cachedMessage.direction : str6;
        int i5 = (i3 & 128) != 0 ? cachedMessage.contentType : i2;
        String str21 = (i3 & 256) != 0 ? cachedMessage.contentText : str7;
        String str22 = (i3 & 512) != 0 ? cachedMessage.contentImageUrl : str8;
        String str23 = (i3 & 1024) != 0 ? cachedMessage.contentFileName : str9;
        String str24 = (i3 & 2048) != 0 ? cachedMessage.contentFileUrl : str10;
        String str25 = (i3 & 4096) != 0 ? cachedMessage.quoteMsgText : str11;
        String str26 = (i3 & 8192) != 0 ? cachedMessage.quoteImageUrl : str12;
        String str27 = str15;
        long j4 = (i3 & 16384) != 0 ? cachedMessage.sendTime : j;
        Long l5 = (i3 & 32768) != 0 ? cachedMessage.msgSeq : l;
        Long l6 = (i3 & 65536) != 0 ? cachedMessage.editTime : l2;
        Long l7 = l5;
        Long l8 = (i3 & 131072) != 0 ? cachedMessage.msgDeleteTime : l3;
        String str28 = (i3 & 262144) != 0 ? cachedMessage.quoteMsgId : str13;
        String str29 = (i3 & 524288) != 0 ? cachedMessage.cmdName : str14;
        Integer num3 = (i3 & 1048576) != 0 ? cachedMessage.cmdType : num;
        if ((i3 & 2097152) != 0) {
            l4 = l6;
            num2 = num3;
            j3 = cachedMessage.localInsertTime;
        } else {
            j3 = j2;
            num2 = num3;
            l4 = l6;
        }
        return cachedMessage.copy(str27, str16, i4, str17, str18, str19, str20, i5, str21, str22, str23, str24, str25, str26, j4, l7, l4, l8, str28, str29, num2, j3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
    }

    /* renamed from: component10, reason: from getter */
    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    /* renamed from: component11, reason: from getter */
    public final String getContentFileName() {
        return this.contentFileName;
    }

    /* renamed from: component12, reason: from getter */
    public final String getContentFileUrl() {
        return this.contentFileUrl;
    }

    /* renamed from: component13, reason: from getter */
    public final String getQuoteMsgText() {
        return this.quoteMsgText;
    }

    /* renamed from: component14, reason: from getter */
    public final String getQuoteImageUrl() {
        return this.quoteImageUrl;
    }

    /* renamed from: component15, reason: from getter */
    public final long getSendTime() {
        return this.sendTime;
    }

    /* renamed from: component16, reason: from getter */
    public final Long getMsgSeq() {
        return this.msgSeq;
    }

    /* renamed from: component17, reason: from getter */
    public final Long getEditTime() {
        return this.editTime;
    }

    /* renamed from: component18, reason: from getter */
    public final Long getMsgDeleteTime() {
        return this.msgDeleteTime;
    }

    /* renamed from: component19, reason: from getter */
    public final String getQuoteMsgId() {
        return this.quoteMsgId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* renamed from: component20, reason: from getter */
    public final String getCmdName() {
        return this.cmdName;
    }

    /* renamed from: component21, reason: from getter */
    public final Integer getCmdType() {
        return this.cmdType;
    }

    /* renamed from: component22, reason: from getter */
    public final long getLocalInsertTime() {
        return this.localInsertTime;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChatType() {
        return this.chatType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSenderChatId() {
        return this.senderChatId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSenderName() {
        return this.senderName;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSenderAvatarUrl() {
        return this.senderAvatarUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDirection() {
        return this.direction;
    }

    /* renamed from: component8, reason: from getter */
    public final int getContentType() {
        return this.contentType;
    }

    /* renamed from: component9, reason: from getter */
    public final String getContentText() {
        return this.contentText;
    }

    public final CachedMessage copy(String msgId, String chatId, int chatType, String senderChatId, String senderName, String senderAvatarUrl, String direction, int contentType, String contentText, String contentImageUrl, String contentFileName, String contentFileUrl, String quoteMsgText, String quoteImageUrl, long sendTime, Long msgSeq, Long editTime, Long msgDeleteTime, String quoteMsgId, String cmdName, Integer cmdType, long localInsertTime) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(senderChatId, "senderChatId");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(senderAvatarUrl, "senderAvatarUrl");
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new CachedMessage(msgId, chatId, chatType, senderChatId, senderName, senderAvatarUrl, direction, contentType, contentText, contentImageUrl, contentFileName, contentFileUrl, quoteMsgText, quoteImageUrl, sendTime, msgSeq, editTime, msgDeleteTime, quoteMsgId, cmdName, cmdType, localInsertTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CachedMessage)) {
            return false;
        }
        CachedMessage cachedMessage = (CachedMessage) other;
        return Intrinsics.areEqual(this.msgId, cachedMessage.msgId) && Intrinsics.areEqual(this.chatId, cachedMessage.chatId) && this.chatType == cachedMessage.chatType && Intrinsics.areEqual(this.senderChatId, cachedMessage.senderChatId) && Intrinsics.areEqual(this.senderName, cachedMessage.senderName) && Intrinsics.areEqual(this.senderAvatarUrl, cachedMessage.senderAvatarUrl) && Intrinsics.areEqual(this.direction, cachedMessage.direction) && this.contentType == cachedMessage.contentType && Intrinsics.areEqual(this.contentText, cachedMessage.contentText) && Intrinsics.areEqual(this.contentImageUrl, cachedMessage.contentImageUrl) && Intrinsics.areEqual(this.contentFileName, cachedMessage.contentFileName) && Intrinsics.areEqual(this.contentFileUrl, cachedMessage.contentFileUrl) && Intrinsics.areEqual(this.quoteMsgText, cachedMessage.quoteMsgText) && Intrinsics.areEqual(this.quoteImageUrl, cachedMessage.quoteImageUrl) && this.sendTime == cachedMessage.sendTime && Intrinsics.areEqual(this.msgSeq, cachedMessage.msgSeq) && Intrinsics.areEqual(this.editTime, cachedMessage.editTime) && Intrinsics.areEqual(this.msgDeleteTime, cachedMessage.msgDeleteTime) && Intrinsics.areEqual(this.quoteMsgId, cachedMessage.quoteMsgId) && Intrinsics.areEqual(this.cmdName, cachedMessage.cmdName) && Intrinsics.areEqual(this.cmdType, cachedMessage.cmdType) && this.localInsertTime == cachedMessage.localInsertTime;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((this.msgId.hashCode() * 31) + this.chatId.hashCode()) * 31) + Integer.hashCode(this.chatType)) * 31) + this.senderChatId.hashCode()) * 31) + this.senderName.hashCode()) * 31) + this.senderAvatarUrl.hashCode()) * 31) + this.direction.hashCode()) * 31) + Integer.hashCode(this.contentType)) * 31) + (this.contentText == null ? 0 : this.contentText.hashCode())) * 31) + (this.contentImageUrl == null ? 0 : this.contentImageUrl.hashCode())) * 31) + (this.contentFileName == null ? 0 : this.contentFileName.hashCode())) * 31) + (this.contentFileUrl == null ? 0 : this.contentFileUrl.hashCode())) * 31) + (this.quoteMsgText == null ? 0 : this.quoteMsgText.hashCode())) * 31) + (this.quoteImageUrl == null ? 0 : this.quoteImageUrl.hashCode())) * 31) + Long.hashCode(this.sendTime)) * 31) + (this.msgSeq == null ? 0 : this.msgSeq.hashCode())) * 31) + (this.editTime == null ? 0 : this.editTime.hashCode())) * 31) + (this.msgDeleteTime == null ? 0 : this.msgDeleteTime.hashCode())) * 31) + (this.quoteMsgId == null ? 0 : this.quoteMsgId.hashCode())) * 31) + (this.cmdName == null ? 0 : this.cmdName.hashCode())) * 31) + (this.cmdType != null ? this.cmdType.hashCode() : 0)) * 31) + Long.hashCode(this.localInsertTime);
    }

    public String toString() {
        return "CachedMessage(msgId=" + this.msgId + ", chatId=" + this.chatId + ", chatType=" + this.chatType + ", senderChatId=" + this.senderChatId + ", senderName=" + this.senderName + ", senderAvatarUrl=" + this.senderAvatarUrl + ", direction=" + this.direction + ", contentType=" + this.contentType + ", contentText=" + this.contentText + ", contentImageUrl=" + this.contentImageUrl + ", contentFileName=" + this.contentFileName + ", contentFileUrl=" + this.contentFileUrl + ", quoteMsgText=" + this.quoteMsgText + ", quoteImageUrl=" + this.quoteImageUrl + ", sendTime=" + this.sendTime + ", msgSeq=" + this.msgSeq + ", editTime=" + this.editTime + ", msgDeleteTime=" + this.msgDeleteTime + ", quoteMsgId=" + this.quoteMsgId + ", cmdName=" + this.cmdName + ", cmdType=" + this.cmdType + ", localInsertTime=" + this.localInsertTime + ")";
    }

    public CachedMessage(String msgId, String chatId, int chatType, String senderChatId, String senderName, String senderAvatarUrl, String direction, int contentType, String contentText, String contentImageUrl, String contentFileName, String contentFileUrl, String quoteMsgText, String quoteImageUrl, long sendTime, Long msgSeq, Long editTime, Long msgDeleteTime, String quoteMsgId, String cmdName, Integer cmdType, long localInsertTime) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(senderChatId, "senderChatId");
        Intrinsics.checkNotNullParameter(senderName, "senderName");
        Intrinsics.checkNotNullParameter(senderAvatarUrl, "senderAvatarUrl");
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.msgId = msgId;
        this.chatId = chatId;
        this.chatType = chatType;
        this.senderChatId = senderChatId;
        this.senderName = senderName;
        this.senderAvatarUrl = senderAvatarUrl;
        this.direction = direction;
        this.contentType = contentType;
        this.contentText = contentText;
        this.contentImageUrl = contentImageUrl;
        this.contentFileName = contentFileName;
        this.contentFileUrl = contentFileUrl;
        this.quoteMsgText = quoteMsgText;
        this.quoteImageUrl = quoteImageUrl;
        this.sendTime = sendTime;
        this.msgSeq = msgSeq;
        this.editTime = editTime;
        this.msgDeleteTime = msgDeleteTime;
        this.quoteMsgId = quoteMsgId;
        this.cmdName = cmdName;
        this.cmdType = cmdType;
        this.localInsertTime = localInsertTime;
    }

    public /* synthetic */ CachedMessage(String str, String str2, int i, String str3, String str4, String str5, String str6, int i2, String str7, String str8, String str9, String str10, String str11, String str12, long j, Long l, Long l2, Long l3, String str13, String str14, Integer num, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4, str5, str6, i2, (i3 & 256) != 0 ? null : str7, (i3 & 512) != 0 ? null : str8, (i3 & 1024) != 0 ? null : str9, (i3 & 2048) != 0 ? null : str10, (i3 & 4096) != 0 ? null : str11, (i3 & 8192) != 0 ? null : str12, j, (32768 & i3) != 0 ? null : l, (65536 & i3) != 0 ? null : l2, (131072 & i3) != 0 ? null : l3, (262144 & i3) != 0 ? null : str13, (524288 & i3) != 0 ? null : str14, (1048576 & i3) != 0 ? null : num, (i3 & 2097152) != 0 ? System.currentTimeMillis() : j2);
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final int getChatType() {
        return this.chatType;
    }

    public final String getSenderChatId() {
        return this.senderChatId;
    }

    public final String getSenderName() {
        return this.senderName;
    }

    public final String getSenderAvatarUrl() {
        return this.senderAvatarUrl;
    }

    public final String getDirection() {
        return this.direction;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final String getContentText() {
        return this.contentText;
    }

    public final String getContentImageUrl() {
        return this.contentImageUrl;
    }

    public final String getContentFileName() {
        return this.contentFileName;
    }

    public final String getContentFileUrl() {
        return this.contentFileUrl;
    }

    public final String getQuoteMsgText() {
        return this.quoteMsgText;
    }

    public final String getQuoteImageUrl() {
        return this.quoteImageUrl;
    }

    public final long getSendTime() {
        return this.sendTime;
    }

    public final Long getMsgSeq() {
        return this.msgSeq;
    }

    public final Long getEditTime() {
        return this.editTime;
    }

    public final Long getMsgDeleteTime() {
        return this.msgDeleteTime;
    }

    public final String getQuoteMsgId() {
        return this.quoteMsgId;
    }

    public final String getCmdName() {
        return this.cmdName;
    }

    public final Integer getCmdType() {
        return this.cmdType;
    }

    public final long getLocalInsertTime() {
        return this.localInsertTime;
    }
}
