package com.yhchat.canarys.proto.chat_ws_go;

import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.chat_ws_go.stream_message;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: stream_messageKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt;", "", "<init>", "()V", "data", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedata", "Dsl", "DataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class stream_messageKt {
    public static final int $stable = 0;
    public static final stream_messageKt INSTANCE = new stream_messageKt();

    /* compiled from: stream_messageKt.kt */
    @Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message;", "value", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "info", "getInfo", "()Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "setInfo", "(Lcom/yhchat/canarys/proto/chat_ws_go/INFO;)V", "clearInfo", "", "hasInfo", "", "infoOrNull", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data;", "data", "getData", "()Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data;", "setData", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data;)V", "clearData", "hasData", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final stream_message.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(stream_message.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(stream_message.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: stream_messageKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(stream_message.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ stream_message _build() {
            stream_message stream_messageVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(stream_messageVarBuild, "build(...)");
            return stream_messageVarBuild;
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
            return Stream_messageKtKt.getInfoOrNull($this$infoOrNull._builder);
        }

        public final stream_message.Data getData() {
            stream_message.Data data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(stream_message.Data value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final stream_message.Data getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return Stream_messageKtKt.getDataOrNull($this$dataOrNull._builder);
        }
    }

    private stream_messageKt() {
    }

    /* renamed from: -initializedata, reason: not valid java name */
    public final stream_message.Data m9298initializedata(Function1<? super DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DataKt.Dsl.Companion companion = DataKt.Dsl.INSTANCE;
        stream_message.Data.Builder builderNewBuilder = stream_message.Data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        DataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: stream_messageKt.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt;", "", "<init>", "()V", "streamMsg", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$StreamMsgKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializestreamMsg", "Dsl", "StreamMsgKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class DataKt {
        public static final int $stable = 0;
        public static final DataKt INSTANCE = new DataKt();

        /* compiled from: stream_messageKt.kt */
        @Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0011*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data;", "value", "", "any", "getAny", "()Ljava/lang/String;", "setAny", "(Ljava/lang/String;)V", "clearAny", "", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg;", NotificationCompat.CATEGORY_MESSAGE, "getMsg", "()Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg;", "setMsg", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg;)V", "clearMsg", "hasMsg", "", "msgOrNull", "getMsgOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final stream_message.Data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(stream_message.Data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(stream_message.Data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: stream_messageKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(stream_message.Data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ stream_message.Data _build() {
                stream_message.Data dataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
                return dataBuild;
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

            public final stream_message.Data.StreamMsg getMsg() {
                stream_message.Data.StreamMsg msg = this._builder.getMsg();
                Intrinsics.checkNotNullExpressionValue(msg, "getMsg(...)");
                return msg;
            }

            public final void setMsg(stream_message.Data.StreamMsg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setMsg(value);
            }

            public final void clearMsg() {
                this._builder.clearMsg();
            }

            public final boolean hasMsg() {
                return this._builder.hasMsg();
            }

            public final stream_message.Data.StreamMsg getMsgOrNull(Dsl $this$msgOrNull) {
                Intrinsics.checkNotNullParameter($this$msgOrNull, "<this>");
                return Stream_messageKtKt.getMsgOrNull($this$msgOrNull._builder);
            }
        }

        private DataKt() {
        }

        /* renamed from: -initializestreamMsg, reason: not valid java name */
        public final stream_message.Data.StreamMsg m9299initializestreamMsg(Function1<? super StreamMsgKt.Dsl, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            StreamMsgKt.Dsl.Companion companion = StreamMsgKt.Dsl.INSTANCE;
            stream_message.Data.StreamMsg.Builder builderNewBuilder = stream_message.Data.StreamMsg.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
            StreamMsgKt.Dsl dsl_create = companion._create(builderNewBuilder);
            block.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: stream_messageKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$StreamMsgKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class StreamMsgKt {
            public static final int $stable = 0;
            public static final StreamMsgKt INSTANCE = new StreamMsgKt();

            /* compiled from: stream_messageKt.kt */
            @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000e\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$StreamMsgKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg;", "value", "", "msgId", "getMsgId", "()Ljava/lang/String;", "setMsgId", "(Ljava/lang/String;)V", "clearMsgId", "", "recvId", "getRecvId", "setRecvId", "clearRecvId", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "setChatId", "clearChatId", "content", "getContent", "setContent", "clearContent", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Dsl {
                private final stream_message.Data.StreamMsg.Builder _builder;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final int $stable = 8;

                public /* synthetic */ Dsl(stream_message.Data.StreamMsg.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                    this(builder);
                }

                private Dsl(stream_message.Data.StreamMsg.Builder _builder) {
                    this._builder = _builder;
                }

                /* compiled from: stream_messageKt.kt */
                @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$StreamMsgKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$StreamMsgKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(stream_message.Data.StreamMsg.Builder builder) {
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new Dsl(builder, null);
                    }
                }

                public final /* synthetic */ stream_message.Data.StreamMsg _build() {
                    stream_message.Data.StreamMsg streamMsgBuild = this._builder.build();
                    Intrinsics.checkNotNullExpressionValue(streamMsgBuild, "build(...)");
                    return streamMsgBuild;
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

                public final String getRecvId() {
                    String recvId = this._builder.getRecvId();
                    Intrinsics.checkNotNullExpressionValue(recvId, "getRecvId(...)");
                    return recvId;
                }

                public final void setRecvId(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setRecvId(value);
                }

                public final void clearRecvId() {
                    this._builder.clearRecvId();
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
            }

            private StreamMsgKt() {
            }
        }
    }
}
