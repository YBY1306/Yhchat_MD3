package com.yhchat.canarys.data.model;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketMessage.kt */
@Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003JA\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/data/model/WebSocketMessage;", "", "cmd", "", "data", "", "seq", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;J)V", "getCmd", "()Ljava/lang/String;", "getData", "()Ljava/util/Map;", "getSeq", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WebSocketMessage {
    public static final int $stable = 8;
    private final String cmd;
    private final Map<String, Object> data;
    private final String seq;
    private final long timestamp;

    public static /* synthetic */ WebSocketMessage copy$default(WebSocketMessage webSocketMessage, String str, Map map, String str2, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = webSocketMessage.cmd;
        }
        if ((i & 2) != 0) {
            map = webSocketMessage.data;
        }
        if ((i & 4) != 0) {
            str2 = webSocketMessage.seq;
        }
        if ((i & 8) != 0) {
            j = webSocketMessage.timestamp;
        }
        String str3 = str2;
        return webSocketMessage.copy(str, map, str3, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCmd() {
        return this.cmd;
    }

    public final Map<String, Object> component2() {
        return this.data;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSeq() {
        return this.seq;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    public final WebSocketMessage copy(String cmd, Map<String, ? extends Object> data, String seq, long timestamp) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(seq, "seq");
        return new WebSocketMessage(cmd, data, seq, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketMessage)) {
            return false;
        }
        WebSocketMessage webSocketMessage = (WebSocketMessage) other;
        return Intrinsics.areEqual(this.cmd, webSocketMessage.cmd) && Intrinsics.areEqual(this.data, webSocketMessage.data) && Intrinsics.areEqual(this.seq, webSocketMessage.seq) && this.timestamp == webSocketMessage.timestamp;
    }

    public int hashCode() {
        return (((((this.cmd.hashCode() * 31) + (this.data == null ? 0 : this.data.hashCode())) * 31) + this.seq.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public String toString() {
        return "WebSocketMessage(cmd=" + this.cmd + ", data=" + this.data + ", seq=" + this.seq + ", timestamp=" + this.timestamp + ")";
    }

    public WebSocketMessage(String cmd, Map<String, ? extends Object> map, String seq, long timestamp) {
        Intrinsics.checkNotNullParameter(cmd, "cmd");
        Intrinsics.checkNotNullParameter(seq, "seq");
        this.cmd = cmd;
        this.data = map;
        this.seq = seq;
        this.timestamp = timestamp;
    }

    public /* synthetic */ WebSocketMessage(String str, Map map, String str2, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? System.currentTimeMillis() : j);
    }

    public final String getCmd() {
        return this.cmd;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getSeq() {
        return this.seq;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }
}
