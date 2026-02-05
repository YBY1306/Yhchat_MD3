package com.yhchat.canarys.proto.conversation;

import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.proto.conversation.Conversation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StatusKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/StatusKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class StatusKt {
    public static final int $stable = 0;
    public static final StatusKt INSTANCE = new StatusKt();

    /* compiled from: StatusKt.kt */
    @Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001e\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00188G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/StatusKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/conversation/Conversation$Status$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/conversation/Conversation$Status$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/conversation/Conversation$Status;", "value", "", "number", "getNumber", "()J", "setNumber", "(J)V", "clearNumber", "", "", "code", "getCode", "()I", "setCode", "(I)V", "clearCode", "", NotificationCompat.CATEGORY_MESSAGE, "getMsg", "()Ljava/lang/String;", "setMsg", "(Ljava/lang/String;)V", "clearMsg", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final Conversation.Status.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(Conversation.Status.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(Conversation.Status.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: StatusKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/StatusKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/conversation/StatusKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/conversation/Conversation$Status$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Conversation.Status.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ Conversation.Status _build() {
            Conversation.Status statusBuild = this._builder.build();
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

        public final int getCode() {
            return this._builder.getCode();
        }

        public final void setCode(int value) {
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
