package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.INFO;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: INFOKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/INFOKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class INFOKt {
    public static final int $stable = 0;
    public static final INFOKt INSTANCE = new INFOKt();

    /* compiled from: INFOKt.kt */
    @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/INFOKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/INFO$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "value", "", "seq", "getSeq", "()Ljava/lang/String;", "setSeq", "(Ljava/lang/String;)V", "clearSeq", "", "cmd", "getCmd", "setCmd", "clearCmd", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final INFO.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(INFO.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(INFO.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: INFOKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/INFOKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/INFOKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(INFO.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ INFO _build() {
            INFO infoBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(infoBuild, "build(...)");
            return infoBuild;
        }

        public final String getSeq() {
            String seq = this._builder.getSeq();
            Intrinsics.checkNotNullExpressionValue(seq, "getSeq(...)");
            return seq;
        }

        public final void setSeq(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSeq(value);
        }

        public final void clearSeq() {
            this._builder.clearSeq();
        }

        public final String getCmd() {
            String cmd = this._builder.getCmd();
            Intrinsics.checkNotNullExpressionValue(cmd, "getCmd(...)");
            return cmd;
        }

        public final void setCmd(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCmd(value);
        }

        public final void clearCmd() {
            this._builder.clearCmd();
        }
    }

    private INFOKt() {
    }
}
