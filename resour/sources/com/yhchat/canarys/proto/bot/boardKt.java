package com.yhchat.canarys.proto.bot;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.bot.Bot;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: boardKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/boardKt;", "", "<init>", "()V", "boardData", "Lcom/yhchat/canarys/proto/bot/Bot$board$Board_data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/bot/boardKt$Board_dataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeboardData", "Dsl", "Board_dataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class boardKt {
    public static final int $stable = 0;
    public static final boardKt INSTANCE = new boardKt();

    /* compiled from: boardKt.kt */
    @Metadata(m168d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J%\u0010\u001c\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0007\u00a2\u0006\u0002\b\u001dJ&\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0087\n\u00a2\u0006\u0002\b\u001fJ+\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0007\u00a2\u0006\u0002\b#J,\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0087\n\u00a2\u0006\u0002\b$J.\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0018H\u0087\u0002\u00a2\u0006\u0002\b(J\u001d\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0007\u00a2\u0006\u0002\b*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/boardKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/bot/Bot$board$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/bot/Bot$board$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/bot/Bot$board;", "value", "Lcom/yhchat/canarys/proto/bot/Bot$Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/bot/Bot$Status;", "setStatus", "(Lcom/yhchat/canarys/proto/bot/Bot$Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/bot/boardKt$Dsl;)Lcom/yhchat/canarys/proto/bot/Bot$Status;", "board", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/bot/Bot$board$Board_data;", "Lcom/yhchat/canarys/proto/bot/boardKt$Dsl$BoardProxy;", "getBoard", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addBoard", "plusAssign", "plusAssignBoard", "addAll", "values", "", "addAllBoard", "plusAssignAllBoard", "set", "index", "", "setBoard", "clear", "clearBoard", "Companion", "BoardProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final Bot.board.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(Bot.board.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(Bot.board.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: boardKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/boardKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/bot/boardKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/bot/Bot$board$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Bot.board.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ Bot.board _build() {
            Bot.board boardVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(boardVarBuild, "build(...)");
            return boardVarBuild;
        }

        public final Bot.Status getStatus() {
            Bot.Status status = this._builder.getStatus();
            Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
            return status;
        }

        public final void setStatus(Bot.Status value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStatus(value);
        }

        public final void clearStatus() {
            this._builder.clearStatus();
        }

        public final boolean hasStatus() {
            return this._builder.hasStatus();
        }

        public final Bot.Status getStatusOrNull(Dsl $this$statusOrNull) {
            Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
            return BoardKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        /* compiled from: boardKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/boardKt$Dsl$BoardProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class BoardProxy extends DslProxy {
            public static final int $stable = 8;

            private BoardProxy() {
            }
        }

        public final /* synthetic */ DslList getBoard() {
            List<Bot.board.Board_data> boardList = this._builder.getBoardList();
            Intrinsics.checkNotNullExpressionValue(boardList, "getBoardList(...)");
            return new DslList(boardList);
        }

        public final /* synthetic */ void addBoard(DslList $this$add, Bot.board.Board_data value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addBoard(value);
        }

        public final /* synthetic */ void plusAssignBoard(DslList<Bot.board.Board_data, BoardProxy> dslList, Bot.board.Board_data value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addBoard(dslList, value);
        }

        public final /* synthetic */ void addAllBoard(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllBoard(values);
        }

        public final /* synthetic */ void plusAssignAllBoard(DslList<Bot.board.Board_data, BoardProxy> dslList, Iterable<Bot.board.Board_data> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllBoard(dslList, values);
        }

        public final /* synthetic */ void setBoard(DslList $this$set, int index, Bot.board.Board_data value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBoard(index, value);
        }

        public final /* synthetic */ void clearBoard(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearBoard();
        }
    }

    private boardKt() {
    }

    /* renamed from: -initializeboardData, reason: not valid java name */
    public final Bot.board.Board_data m8971initializeboardData(Function1<? super Board_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Board_dataKt.Dsl.Companion companion = Board_dataKt.Dsl.INSTANCE;
        Bot.board.Board_data.Builder builderNewBuilder = Bot.board.Board_data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        Board_dataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: boardKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/boardKt$Board_dataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Board_dataKt {
        public static final int $stable = 0;
        public static final Board_dataKt INSTANCE = new Board_dataKt();

        /* compiled from: boardKt.kt */
        @Metadata(m168d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010 \u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR$\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000e\u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/boardKt$Board_dataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/bot/Bot$board$Board_data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/bot/Bot$board$Board_data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/bot/Bot$board$Board_data;", "value", "", "botId", "getBotId", "()Ljava/lang/String;", "setBotId", "(Ljava/lang/String;)V", "clearBotId", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "setChatId", "clearChatId", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()I", "setChatType", "(I)V", "clearChatType", "content", "getContent", "setContent", "clearContent", "contentType", "getContentType", "setContentType", "clearContentType", "", "lastUpdateTime", "getLastUpdateTime", "()J", "setLastUpdateTime", "(J)V", "clearLastUpdateTime", "botName", "getBotName", "setBotName", "clearBotName", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final Bot.board.Board_data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(Bot.board.Board_data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(Bot.board.Board_data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: boardKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/boardKt$Board_dataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/bot/boardKt$Board_dataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/bot/Bot$board$Board_data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Bot.board.Board_data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ Bot.board.Board_data _build() {
                Bot.board.Board_data board_dataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(board_dataBuild, "build(...)");
                return board_dataBuild;
            }

            public final String getBotId() {
                String botId = this._builder.getBotId();
                Intrinsics.checkNotNullExpressionValue(botId, "getBotId(...)");
                return botId;
            }

            public final void setBotId(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBotId(value);
            }

            public final void clearBotId() {
                this._builder.clearBotId();
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

            public final int getChatType() {
                return this._builder.getChatType();
            }

            public final void setChatType(int value) {
                this._builder.setChatType(value);
            }

            public final void clearChatType() {
                this._builder.clearChatType();
            }

            public final String getContent() {
                String content = this._builder.getContent();
                Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
                return content;
            }

            public final void setContent(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setContent(value);
            }

            public final void clearContent() {
                this._builder.clearContent();
            }

            public final int getContentType() {
                return this._builder.getContentType();
            }

            public final void setContentType(int value) {
                this._builder.setContentType(value);
            }

            public final void clearContentType() {
                this._builder.clearContentType();
            }

            public final long getLastUpdateTime() {
                return this._builder.getLastUpdateTime();
            }

            public final void setLastUpdateTime(long value) {
                this._builder.setLastUpdateTime(value);
            }

            public final void clearLastUpdateTime() {
                this._builder.clearLastUpdateTime();
            }

            public final String getBotName() {
                String botName = this._builder.getBotName();
                Intrinsics.checkNotNullExpressionValue(botName, "getBotName(...)");
                return botName;
            }

            public final void setBotName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBotName(value);
            }

            public final void clearBotName() {
                this._builder.clearBotName();
            }
        }

        private Board_dataKt() {
        }
    }
}
