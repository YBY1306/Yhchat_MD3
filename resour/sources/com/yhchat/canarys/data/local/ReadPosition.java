package com.yhchat.canarys.data.local;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReadPositionStore.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, m169d2 = {"Lcom/yhchat/canarys/data/local/ReadPosition;", "", "msgId", "", "msgSeq", "", "<init>", "(Ljava/lang/String;J)V", "getMsgId", "()Ljava/lang/String;", "getMsgSeq", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReadPosition {
    public static final int $stable = 0;
    private final String msgId;
    private final long msgSeq;

    public static /* synthetic */ ReadPosition copy$default(ReadPosition readPosition, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = readPosition.msgId;
        }
        if ((i & 2) != 0) {
            j = readPosition.msgSeq;
        }
        return readPosition.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMsgId() {
        return this.msgId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMsgSeq() {
        return this.msgSeq;
    }

    public final ReadPosition copy(String msgId, long msgSeq) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        return new ReadPosition(msgId, msgSeq);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadPosition)) {
            return false;
        }
        ReadPosition readPosition = (ReadPosition) other;
        return Intrinsics.areEqual(this.msgId, readPosition.msgId) && this.msgSeq == readPosition.msgSeq;
    }

    public int hashCode() {
        return (this.msgId.hashCode() * 31) + Long.hashCode(this.msgSeq);
    }

    public String toString() {
        return "ReadPosition(msgId=" + this.msgId + ", msgSeq=" + this.msgSeq + ")";
    }

    public ReadPosition(String msgId, long msgSeq) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        this.msgId = msgId;
        this.msgSeq = msgSeq;
    }

    public final String getMsgId() {
        return this.msgId;
    }

    public final long getMsgSeq() {
        return this.msgSeq;
    }
}
