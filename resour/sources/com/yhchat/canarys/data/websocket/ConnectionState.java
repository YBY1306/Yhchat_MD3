package com.yhchat.canarys.data.websocket;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebSocketService.kt */
@Metadata(m168d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004\u00a2\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b\u00a8\u0006\f"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ConnectionState;", "", "<init>", "()V", "Disconnected", "Connecting", "Connected", "Error", "Lcom/yhchat/canarys/data/websocket/ConnectionState$Connected;", "Lcom/yhchat/canarys/data/websocket/ConnectionState$Connecting;", "Lcom/yhchat/canarys/data/websocket/ConnectionState$Disconnected;", "Lcom/yhchat/canarys/data/websocket/ConnectionState$Error;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public abstract class ConnectionState {
    public static final int $stable = 0;

    public /* synthetic */ ConnectionState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ConnectionState$Disconnected;", "Lcom/yhchat/canarys/data/websocket/ConnectionState;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Disconnected extends ConnectionState {
        public static final int $stable = 0;
        public static final Disconnected INSTANCE = new Disconnected();

        private Disconnected() {
            super(null);
        }
    }

    private ConnectionState() {
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ConnectionState$Connecting;", "Lcom/yhchat/canarys/data/websocket/ConnectionState;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Connecting extends ConnectionState {
        public static final int $stable = 0;
        public static final Connecting INSTANCE = new Connecting();

        private Connecting() {
            super(null);
        }
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ConnectionState$Connected;", "Lcom/yhchat/canarys/data/websocket/ConnectionState;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Connected extends ConnectionState {
        public static final int $stable = 0;
        public static final Connected INSTANCE = new Connected();

        private Connected() {
            super(null);
        }
    }

    /* compiled from: WebSocketService.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, m169d2 = {"Lcom/yhchat/canarys/data/websocket/ConnectionState$Error;", "Lcom/yhchat/canarys/data/websocket/ConnectionState;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* data */ class Error extends ConnectionState {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = error.message;
            }
            return error.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final Error copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new Error(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "Error(message=" + this.message + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(String message) {
            super(null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }
}
