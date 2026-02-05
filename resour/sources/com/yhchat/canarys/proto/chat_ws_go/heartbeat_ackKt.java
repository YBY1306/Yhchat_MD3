package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.heartbeat_ack;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: heartbeat_ackKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ackKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class heartbeat_ackKt {
    public static final int $stable = 0;
    public static final heartbeat_ackKt INSTANCE = new heartbeat_ackKt();

    /* compiled from: heartbeat_ackKt.kt */
    @Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ackKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ack$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ack$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ack;", "value", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "info", "getInfo", "()Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "setInfo", "(Lcom/yhchat/canarys/proto/chat_ws_go/INFO;)V", "clearInfo", "", "hasInfo", "", "infoOrNull", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ackKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final heartbeat_ack.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(heartbeat_ack.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(heartbeat_ack.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: heartbeat_ackKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ackKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ackKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ack$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(heartbeat_ack.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ heartbeat_ack _build() {
            heartbeat_ack heartbeat_ackVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(heartbeat_ackVarBuild, "build(...)");
            return heartbeat_ackVarBuild;
        }

        public final INFO getInfo() {
            INFO info = this._builder.getInfo();
            Intrinsics.checkNotNullExpressionValue(info, "getInfo(...)");
            return info;
        }

        public final void setInfo(INFO value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInfo(value);
        }

        public final void clearInfo() {
            this._builder.clearInfo();
        }

        public final boolean hasInfo() {
            return this._builder.hasInfo();
        }

        public final INFO getInfoOrNull(Dsl $this$infoOrNull) {
            Intrinsics.checkNotNullParameter($this$infoOrNull, "<this>");
            return Heartbeat_ackKtKt.getInfoOrNull($this$infoOrNull._builder);
        }
    }

    private heartbeat_ackKt() {
    }
}
