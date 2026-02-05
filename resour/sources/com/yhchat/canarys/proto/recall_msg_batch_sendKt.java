package com.yhchat.canarys.proto;

import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.recall_msg_batch_send;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: recall_msg_batch_sendKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/recall_msg_batch_sendKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class recall_msg_batch_sendKt {
    public static final int $stable = 0;
    public static final recall_msg_batch_sendKt INSTANCE = new recall_msg_batch_sendKt();

    /* compiled from: recall_msg_batch_sendKt.kt */
    @Metadata(m168d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J%\u0010\u000e\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0010\u001a\u00020\nH\u0007\u00a2\u0006\u0002\b\u0011J&\u0010\u0012\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u0010\u001a\u00020\nH\u0087\n\u00a2\u0006\u0002\b\u0013J+\u0010\u0014\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0007\u00a2\u0006\u0002\b\u0017J,\u0010\u0012\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0016H\u0087\n\u00a2\u0006\u0002\b\u0018J.\u0010\u0019\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\nH\u0087\u0002\u00a2\u0006\u0002\b\u001cJ\u001d\u0010\u001d\u001a\u00020\u000f*\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0007\u00a2\u0006\u0002\b\u001eJ\u0006\u0010$\u001a\u00020\u000fJ\u0006\u0010+\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR$\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010&\u001a\u00020%2\u0006\u0010\u0010\u001a\u00020%8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*\u00a8\u0006."}, m169d2 = {"Lcom/yhchat/canarys/proto/recall_msg_batch_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/recall_msg_batch_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/recall_msg_batch_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/recall_msg_batch_send;", "msgId", "Lcom/google/protobuf/kotlin/DslList;", "", "Lcom/yhchat/canarys/proto/recall_msg_batch_sendKt$Dsl$MsgIdProxy;", "getMsgId", "()Lcom/google/protobuf/kotlin/DslList;", "add", "", "value", "addMsgId", "plusAssign", "plusAssignMsgId", "addAll", "values", "", "addAllMsgId", "plusAssignAllMsgId", "set", "index", "", "setMsgId", "clear", "clearMsgId", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "clearChatId", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()J", "setChatType", "(J)V", "clearChatType", "Companion", "MsgIdProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final recall_msg_batch_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(recall_msg_batch_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(recall_msg_batch_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: recall_msg_batch_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/recall_msg_batch_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/recall_msg_batch_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/recall_msg_batch_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(recall_msg_batch_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ recall_msg_batch_send _build() {
            recall_msg_batch_send recall_msg_batch_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(recall_msg_batch_sendVarBuild, "build(...)");
            return recall_msg_batch_sendVarBuild;
        }

        /* compiled from: recall_msg_batch_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/recall_msg_batch_sendKt$Dsl$MsgIdProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class MsgIdProxy extends DslProxy {
            public static final int $stable = 8;

            private MsgIdProxy() {
            }
        }

        public final DslList<String, MsgIdProxy> getMsgId() {
            List<String> msgIdList = this._builder.getMsgIdList();
            Intrinsics.checkNotNullExpressionValue(msgIdList, "getMsgIdList(...)");
            return new DslList<>(msgIdList);
        }

        public final /* synthetic */ void addMsgId(DslList $this$add, String value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addMsgId(value);
        }

        public final /* synthetic */ void plusAssignMsgId(DslList<String, MsgIdProxy> dslList, String value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addMsgId(dslList, value);
        }

        public final /* synthetic */ void addAllMsgId(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllMsgId(values);
        }

        public final /* synthetic */ void plusAssignAllMsgId(DslList<String, MsgIdProxy> dslList, Iterable<String> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllMsgId(dslList, values);
        }

        public final /* synthetic */ void setMsgId(DslList $this$set, int index, String value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMsgId(index, value);
        }

        public final /* synthetic */ void clearMsgId(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearMsgId();
        }

        public final String getChatId() {
            String chatId = this._builder.getChatId();
            Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
            return chatId;
        }

        public final void setChatId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setChatId(value);
        }

        public final void clearChatId() {
            this._builder.clearChatId();
        }

        public final long getChatType() {
            return this._builder.getChatType();
        }

        public final void setChatType(long value) {
            this._builder.setChatType(value);
        }

        public final void clearChatType() {
            this._builder.clearChatType();
        }
    }

    private recall_msg_batch_sendKt() {
    }
}
