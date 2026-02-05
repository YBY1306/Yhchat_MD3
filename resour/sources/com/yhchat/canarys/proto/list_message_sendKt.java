package com.yhchat.canarys.proto;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.list_message_send;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: list_message_sendKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/list_message_sendKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class list_message_sendKt {
    public static final int $stable = 0;
    public static final list_message_sendKt INSTANCE = new list_message_sendKt();

    /* compiled from: list_message_sendKt.kt */
    @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/proto/list_message_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/list_message_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/list_message_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/list_message_send;", "value", "", "msgCount", "getMsgCount", "()J", "setMsgCount", "(J)V", "clearMsgCount", "", "", "msgId", "getMsgId", "()Ljava/lang/String;", "setMsgId", "(Ljava/lang/String;)V", "clearMsgId", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "setChatType", "clearChatType", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "setChatId", "clearChatId", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final list_message_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(list_message_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(list_message_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: list_message_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/list_message_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/list_message_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/list_message_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(list_message_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ list_message_send _build() {
            list_message_send list_message_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(list_message_sendVarBuild, "build(...)");
            return list_message_sendVarBuild;
        }

        public final long getMsgCount() {
            return this._builder.getMsgCount();
        }

        public final void setMsgCount(long value) {
            this._builder.setMsgCount(value);
        }

        public final void clearMsgCount() {
            this._builder.clearMsgCount();
        }

        public final String getMsgId() {
            String msgId = this._builder.getMsgId();
            Intrinsics.checkNotNullExpressionValue(msgId, "getMsgId(...)");
            return msgId;
        }

        public final void setMsgId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMsgId(value);
        }

        public final void clearMsgId() {
            this._builder.clearMsgId();
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

    private list_message_sendKt() {
    }
}
