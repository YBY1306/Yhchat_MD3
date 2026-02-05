package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.chat_ws_go.bot_board_message;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: bot_board_messageKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt;", "", "<init>", "()V", "boardData", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeboardData", "Dsl", "BoardDataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class bot_board_messageKt {
    public static final int $stable = 0;
    public static final bot_board_messageKt INSTANCE = new bot_board_messageKt();

    /* compiled from: bot_board_messageKt.kt */
    @Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message;", "value", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "info", "getInfo", "()Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "setInfo", "(Lcom/yhchat/canarys/proto/chat_ws_go/INFO;)V", "clearInfo", "", "hasInfo", "", "infoOrNull", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData;", "data", "getData", "()Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData;", "setData", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData;)V", "clearData", "hasData", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final bot_board_message.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(bot_board_message.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(bot_board_message.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: bot_board_messageKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(bot_board_message.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ bot_board_message _build() {
            bot_board_message bot_board_messageVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(bot_board_messageVarBuild, "build(...)");
            return bot_board_messageVarBuild;
        }

        public final INFO getInfo() {
            INFO info = this._builder.getInfo();
            Intrinsics.checkNotNullExpressionValue(info, "getInfo(...)");
            return info;
        }

        public final void setInfo(INFO value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInfo(value);
        }

        public final void clearInfo() {
            this._builder.clearInfo();
        }

        public final boolean hasInfo() {
            return this._builder.hasInfo();
        }

        public final INFO getInfoOrNull(Dsl $this$infoOrNull) {
            Intrinsics.checkNotNullParameter($this$infoOrNull, "<this>");
            return Bot_board_messageKtKt.getInfoOrNull($this$infoOrNull._builder);
        }

        public final bot_board_message.BoardData getData() {
            bot_board_message.BoardData data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(bot_board_message.BoardData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final bot_board_message.BoardData getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return Bot_board_messageKtKt.getDataOrNull($this$dataOrNull._builder);
        }
    }

    private bot_board_messageKt() {
    }

    /* renamed from: -initializeboardData, reason: not valid java name */
    public final bot_board_message.BoardData m9178initializeboardData(Function1<? super BoardDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        BoardDataKt.Dsl.Companion companion = BoardDataKt.Dsl.INSTANCE;
        bot_board_message.BoardData.Builder builderNewBuilder = bot_board_message.BoardData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        BoardDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: bot_board_messageKt.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt;", "", "<init>", "()V", "boardContent", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$BoardContentKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeboardContent", "Dsl", "BoardContentKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class BoardDataKt {
        public static final int $stable = 0;
        public static final BoardDataKt INSTANCE = new BoardDataKt();

        /* compiled from: bot_board_messageKt.kt */
        @Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0011*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData;", "value", "", "any", "getAny", "()Ljava/lang/String;", "setAny", "(Ljava/lang/String;)V", "clearAny", "", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent;", "board", "getBoard", "()Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent;", "setBoard", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent;)V", "clearBoard", "hasBoard", "", "boardOrNull", "getBoardOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final bot_board_message.BoardData.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(bot_board_message.BoardData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(bot_board_message.BoardData.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: bot_board_messageKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(bot_board_message.BoardData.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ bot_board_message.BoardData _build() {
                bot_board_message.BoardData boardDataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(boardDataBuild, "build(...)");
                return boardDataBuild;
            }

            public final String getAny() {
                String any = this._builder.getAny();
                Intrinsics.checkNotNullExpressionValue(any, "getAny(...)");
                return any;
            }

            public final void setAny(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAny(value);
            }

            public final void clearAny() {
                this._builder.clearAny();
            }

            public final bot_board_message.BoardData.BoardContent getBoard() {
                bot_board_message.BoardData.BoardContent board = this._builder.getBoard();
                Intrinsics.checkNotNullExpressionValue(board, "getBoard(...)");
                return board;
            }

            public final void setBoard(bot_board_message.BoardData.BoardContent value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBoard(value);
            }

            public final void clearBoard() {
                this._builder.clearBoard();
            }

            public final boolean hasBoard() {
                return this._builder.hasBoard();
            }

            public final bot_board_message.BoardData.BoardContent getBoardOrNull(Dsl $this$boardOrNull) {
                Intrinsics.checkNotNullParameter($this$boardOrNull, "<this>");
                return Bot_board_messageKtKt.getBoardOrNull($this$boardOrNull._builder);
            }
        }

        private BoardDataKt() {
        }

        /* renamed from: -initializeboardContent, reason: not valid java name */
        public final bot_board_message.BoardData.BoardContent m9179initializeboardContent(Function1<? super BoardContentKt.Dsl, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            BoardContentKt.Dsl.Companion companion = BoardContentKt.Dsl.INSTANCE;
            bot_board_message.BoardData.BoardContent.Builder builderNewBuilder = bot_board_message.BoardData.BoardContent.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
            BoardContentKt.Dsl dsl_create = companion._create(builderNewBuilder);
            block.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: bot_board_messageKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$BoardContentKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class BoardContentKt {
            public static final int $stable = 0;
            public static final BoardContentKt INSTANCE = new BoardContentKt();

            /* compiled from: bot_board_messageKt.kt */
            @Metadata(m168d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010 \u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR$\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000e\u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$BoardContentKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent;", "value", "", "botId", "getBotId", "()Ljava/lang/String;", "setBotId", "(Ljava/lang/String;)V", "clearBotId", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "setChatId", "clearChatId", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()I", "setChatType", "(I)V", "clearChatType", "content", "getContent", "setContent", "clearContent", "contentType", "getContentType", "setContentType", "clearContentType", "", "lastUpdateTime", "getLastUpdateTime", "()J", "setLastUpdateTime", "(J)V", "clearLastUpdateTime", "botName", "getBotName", "setBotName", "clearBotName", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Dsl {
                private final bot_board_message.BoardData.BoardContent.Builder _builder;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final int $stable = 8;

                public /* synthetic */ Dsl(bot_board_message.BoardData.BoardContent.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                    this(builder);
                }

                private Dsl(bot_board_message.BoardData.BoardContent.Builder _builder) {
                    this._builder = _builder;
                }

                /* compiled from: bot_board_messageKt.kt */
                @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$BoardContentKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$BoardContentKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(bot_board_message.BoardData.BoardContent.Builder builder) {
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new Dsl(builder, null);
                    }
                }

                public final /* synthetic */ bot_board_message.BoardData.BoardContent _build() {
                    bot_board_message.BoardData.BoardContent boardContentBuild = this._builder.build();
                    Intrinsics.checkNotNullExpressionValue(boardContentBuild, "build(...)");
                    return boardContentBuild;
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

            private BoardContentKt() {
            }
        }
    }
}
