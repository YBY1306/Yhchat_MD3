package com.yhchat.canarys.proto.instruction;

import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.proto.instruction.Status;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StatusKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/StatusKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public final class StatusKt {
    public static final int $stable = 0;
    public static final StatusKt INSTANCE = new StatusKt();

    /* compiled from: StatusKt.kt */
    @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/StatusKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/instruction/Status$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/instruction/Status$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/instruction/Status;", "value", "", "number", "getNumber", "()J", "setNumber", "(J)V", "clearNumber", "", "code", "getCode", "setCode", "clearCode", "", NotificationCompat.CATEGORY_MESSAGE, "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "clearMsg", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final Status.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(Status.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(Status.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: StatusKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/StatusKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/instruction/StatusKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/instruction/Status$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Status.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ Status _build() {
            Status statusBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(statusBuild, "build(...)");
            return statusBuild;
        }

        public final long getNumber() {
            return this._builder.getNumber();
        }

        public final void setNumber(long value) {
            this._builder.setNumber(value);
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }

        public final long getCode() {
            return this._builder.getCode();
        }

        public final void setCode(long value) {
            this._builder.setCode(value);
        }

        public final void clearCode() {
            this._builder.clearCode();
        }

        public final String getMsg() {
            String msg = this._builder.getMsg();
            Intrinsics.checkNotNullExpressionValue(msg, "getMsg(...)");
            return msg;
        }

        public final void setMsg(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMsg(value);
        }

        public final void clearMsg() {
            this._builder.clearMsg();
        }
    }

    private StatusKt() {
    }
}
