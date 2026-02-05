package com.yhchat.canarys.proto;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.list_message_by_seq_send;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: list_message_by_seq_sendKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/list_message_by_seq_sendKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class list_message_by_seq_sendKt {
    public static final int $stable = 0;
    public static final list_message_by_seq_sendKt INSTANCE = new list_message_by_seq_sendKt();

    /* compiled from: list_message_by_seq_sendKt.kt */
    @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/proto/list_message_by_seq_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/list_message_by_seq_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/list_message_by_seq_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/list_message_by_seq_send;", "value", "", "msgSeq", "getMsgSeq", "()J", "setMsgSeq", "(J)V", "clearMsgSeq", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "setChatType", "clearChatType", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "clearChatId", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final list_message_by_seq_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(list_message_by_seq_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(list_message_by_seq_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: list_message_by_seq_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/list_message_by_seq_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/list_message_by_seq_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/list_message_by_seq_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(list_message_by_seq_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ list_message_by_seq_send _build() {
            list_message_by_seq_send list_message_by_seq_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(list_message_by_seq_sendVarBuild, "build(...)");
            return list_message_by_seq_sendVarBuild;
        }

        public final long getMsgSeq() {
            return this._builder.getMsgSeq();
        }

        public final void setMsgSeq(long value) {
            this._builder.setMsgSeq(value);
        }

        public final void clearMsgSeq() {
            this._builder.clearMsgSeq();
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
    }

    private list_message_by_seq_sendKt() {
    }
}
