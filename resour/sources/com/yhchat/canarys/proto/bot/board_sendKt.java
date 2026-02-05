package com.yhchat.canarys.proto.bot;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.bot.Bot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: board_sendKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/board_sendKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class board_sendKt {
    public static final int $stable = 0;
    public static final board_sendKt INSTANCE = new board_sendKt();

    /* compiled from: board_sendKt.kt */
    @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/board_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/bot/Bot$board_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/bot/Bot$board_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/bot/Bot$board_send;", "value", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "clearChatId", "", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()J", "setChatType", "(J)V", "clearChatType", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final Bot.board_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(Bot.board_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(Bot.board_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: board_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/board_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/bot/board_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/bot/Bot$board_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Bot.board_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ Bot.board_send _build() {
            Bot.board_send board_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(board_sendVarBuild, "build(...)");
            return board_sendVarBuild;
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

    private board_sendKt() {
    }
}
