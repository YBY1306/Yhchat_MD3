package com.yhchat.canarys.proto;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.proto.list_message;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: list_messageKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/list_messageKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class list_messageKt {
    public static final int $stable = 0;
    public static final list_messageKt INSTANCE = new list_messageKt();

    /* compiled from: list_messageKt.kt */
    @Metadata(m168d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J%\u0010\u001c\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0007\u00a2\u0006\u0002\b\u001dJ&\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0087\n\u00a2\u0006\u0002\b\u001fJ+\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0007\u00a2\u0006\u0002\b#J,\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0087\n\u00a2\u0006\u0002\b$J.\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0018H\u0087\u0002\u00a2\u0006\u0002\b(J\u001d\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0007\u00a2\u0006\u0002\b*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/proto/list_messageKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/list_message$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/list_message$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/list_message;", "value", "Lcom/yhchat/canarys/proto/Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/Status;", "setStatus", "(Lcom/yhchat/canarys/proto/Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/list_messageKt$Dsl;)Lcom/yhchat/canarys/proto/Status;", NotificationCompat.CATEGORY_MESSAGE, "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/Msg;", "Lcom/yhchat/canarys/proto/list_messageKt$Dsl$MsgProxy;", "getMsg", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addMsg", "plusAssign", "plusAssignMsg", "addAll", "values", "", "addAllMsg", "plusAssignAllMsg", "set", "index", "", "setMsg", "clear", "clearMsg", "Companion", "MsgProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final list_message.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(list_message.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(list_message.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: list_messageKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/list_messageKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/list_messageKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/list_message$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(list_message.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ list_message _build() {
            list_message list_messageVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(list_messageVarBuild, "build(...)");
            return list_messageVarBuild;
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
            return List_messageKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        /* compiled from: list_messageKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/list_messageKt$Dsl$MsgProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class MsgProxy extends DslProxy {
            public static final int $stable = 8;

            private MsgProxy() {
            }
        }

        public final /* synthetic */ DslList getMsg() {
            List<Msg> msgList = this._builder.getMsgList();
            Intrinsics.checkNotNullExpressionValue(msgList, "getMsgList(...)");
            return new DslList(msgList);
        }

        public final /* synthetic */ void addMsg(DslList $this$add, Msg value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addMsg(value);
        }

        public final /* synthetic */ void plusAssignMsg(DslList<Msg, MsgProxy> dslList, Msg value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addMsg(dslList, value);
        }

        public final /* synthetic */ void addAllMsg(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllMsg(values);
        }

        public final /* synthetic */ void plusAssignAllMsg(DslList<Msg, MsgProxy> dslList, Iterable<Msg> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllMsg(dslList, values);
        }

        public final /* synthetic */ void setMsg(DslList $this$set, int index, Msg value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMsg(index, value);
        }

        public final /* synthetic */ void clearMsg(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearMsg();
        }
    }

    private list_messageKt() {
    }
}
