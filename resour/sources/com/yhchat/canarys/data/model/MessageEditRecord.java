package com.yhchat.canarys.data.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020\u0007H\u00d6\u0001J\t\u0010!\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e\u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/data/model/MessageEditRecord;", "", Name.MARK, "", "msgId", "", "contentType", "", "contentOld", "createTime", "msgTime", "<init>", "(JLjava/lang/String;ILjava/lang/String;JJ)V", "getId", "()J", "getMsgId", "()Ljava/lang/String;", "getContentType", "()I", "getContentOld", "getCreateTime", "getMsgTime", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MessageEditRecord {
    public static final int $stable = 0;
    private final String contentOld;
    private final int contentType;
    private final long createTime;
    private final long id;
    private final String msgId;
    private final long msgTime;

    public static /* synthetic */ MessageEditRecord copy$default(MessageEditRecord messageEditRecord, long j, String str, int i, String str2, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = messageEditRecord.id;
        }
        long j4 = j;
        if ((i2 & 2) != 0) {
            str = messageEditRecord.msgId;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            i = messageEditRecord.contentType;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = messageEditRecord.contentOld;
        }
        return messageEditRecord.copy(j4, str3, i3, str2, (i2 & 16) != 0 ? messageEditRecord.createTime : j2, (i2 & 32) != 0 ? messageEditRecord.msgTime : j3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getContentType() {
        return this.contentType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getContentOld() {
        return this.contentOld;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* renamed from: component6, reason: from getter */
    public final long getMsgTime() {
        return this.msgTime;
    }

    public final MessageEditRecord copy(long id, String msgId, int contentType, String contentOld, long createTime, long msgTime) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(contentOld, "contentOld");
        return new MessageEditRecord(id, msgId, contentType, contentOld, createTime, msgTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageEditRecord)) {
            return false;
        }
        MessageEditRecord messageEditRecord = (MessageEditRecord) other;
        return this.id == messageEditRecord.id && Intrinsics.areEqual(this.msgId, messageEditRecord.msgId) && this.contentType == messageEditRecord.contentType && Intrinsics.areEqual(this.contentOld, messageEditRecord.contentOld) && this.createTime == messageEditRecord.createTime && this.msgTime == messageEditRecord.msgTime;
    }

    public int hashCode() {
        return (((((((((Long.hashCode(this.id) * 31) + this.msgId.hashCode()) * 31) + Integer.hashCode(this.contentType)) * 31) + this.contentOld.hashCode()) * 31) + Long.hashCode(this.createTime)) * 31) + Long.hashCode(this.msgTime);
    }

    public String toString() {
        return "MessageEditRecord(id=" + this.id + ", msgId=" + this.msgId + ", contentType=" + this.contentType + ", contentOld=" + this.contentOld + ", createTime=" + this.createTime + ", msgTime=" + this.msgTime + ")";
    }

    public MessageEditRecord(long id, String msgId, int contentType, String contentOld, long createTime, long msgTime) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(contentOld, "contentOld");
        this.id = id;
        this.msgId = msgId;
        this.contentType = contentType;
        this.contentOld = contentOld;
        this.createTime = createTime;
        this.msgTime = msgTime;
    }

    public final long getId() {
        return this.id;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final String getContentOld() {
        return this.contentOld;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final long getMsgTime() {
        return this.msgTime;
    }
}
