package com.yhchat.canarys.proto;

import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.proto.recall_msg;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: recall_msgKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/recall_msgKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class recall_msgKt {
    public static final int $stable = 0;
    public static final recall_msgKt INSTANCE = new recall_msgKt();

    /* compiled from: recall_msgKt.kt */
    @Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/proto/recall_msgKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/recall_msg$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/recall_msg$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/recall_msg;", "value", "Lcom/yhchat/canarys/proto/Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/Status;", "setStatus", "(Lcom/yhchat/canarys/proto/Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/recall_msgKt$Dsl;)Lcom/yhchat/canarys/proto/Status;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final recall_msg.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(recall_msg.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(recall_msg.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: recall_msgKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/recall_msgKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/recall_msgKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/recall_msg$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(recall_msg.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ recall_msg _build() {
            recall_msg recall_msgVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(recall_msgVarBuild, "build(...)");
            return recall_msgVarBuild;
        }

        public final Status getStatus() {
            Status status = this._builder.getStatus();
            Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
            return status;
        }

        public final void setStatus(Status value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStatus(value);
        }

        public final void clearStatus() {
            this._builder.clearStatus();
        }

        public final boolean hasStatus() {
            return this._builder.hasStatus();
        }

        public final Status getStatusOrNull(Dsl $this$statusOrNull) {
            Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
            return Recall_msgKtKt.getStatusOrNull($this$statusOrNull._builder);
        }
    }

    private recall_msgKt() {
    }
}
