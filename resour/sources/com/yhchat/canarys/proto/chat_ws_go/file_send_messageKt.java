package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.file_send_message;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: file_send_messageKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt;", "", "<init>", "()V", "fileSendData", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializefileSendData", "Dsl", "FileSendDataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class file_send_messageKt {
    public static final int $stable = 0;
    public static final file_send_messageKt INSTANCE = new file_send_messageKt();

    /* compiled from: file_send_messageKt.kt */
    @Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message;", "value", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "info", "getInfo", "()Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "setInfo", "(Lcom/yhchat/canarys/proto/chat_ws_go/INFO;)V", "clearInfo", "", "hasInfo", "", "infoOrNull", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData;", "data", "getData", "()Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData;", "setData", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData;)V", "clearData", "hasData", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final file_send_message.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(file_send_message.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(file_send_message.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: file_send_messageKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(file_send_message.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ file_send_message _build() {
            file_send_message file_send_messageVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(file_send_messageVarBuild, "build(...)");
            return file_send_messageVarBuild;
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
            return File_send_messageKtKt.getInfoOrNull($this$infoOrNull._builder);
        }

        public final file_send_message.FileSendData getData() {
            file_send_message.FileSendData data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(file_send_message.FileSendData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final file_send_message.FileSendData getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return File_send_messageKtKt.getDataOrNull($this$dataOrNull._builder);
        }
    }

    private file_send_messageKt() {
    }

    /* renamed from: -initializefileSendData, reason: not valid java name */
    public final file_send_message.FileSendData m9250initializefileSendData(Function1<? super FileSendDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        FileSendDataKt.Dsl.Companion companion = FileSendDataKt.Dsl.INSTANCE;
        file_send_message.FileSendData.Builder builderNewBuilder = file_send_message.FileSendData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        FileSendDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: file_send_messageKt.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt;", "", "<init>", "()V", "fileSender", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$FileSenderKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializefileSender", "Dsl", "FileSenderKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class FileSendDataKt {
        public static final int $stable = 0;
        public static final FileSendDataKt INSTANCE = new FileSendDataKt();

        /* compiled from: file_send_messageKt.kt */
        @Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0011*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData;", "value", "", "any", "getAny", "()Ljava/lang/String;", "setAny", "(Ljava/lang/String;)V", "clearAny", "", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender;", "sender", "getSender", "()Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender;", "setSender", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender;)V", "clearSender", "hasSender", "", "senderOrNull", "getSenderOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final file_send_message.FileSendData.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(file_send_message.FileSendData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(file_send_message.FileSendData.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: file_send_messageKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(file_send_message.FileSendData.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ file_send_message.FileSendData _build() {
                file_send_message.FileSendData fileSendDataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(fileSendDataBuild, "build(...)");
                return fileSendDataBuild;
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

            public final file_send_message.FileSendData.FileSender getSender() {
                file_send_message.FileSendData.FileSender sender = this._builder.getSender();
                Intrinsics.checkNotNullExpressionValue(sender, "getSender(...)");
                return sender;
            }

            public final void setSender(file_send_message.FileSendData.FileSender value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSender(value);
            }

            public final void clearSender() {
                this._builder.clearSender();
            }

            public final boolean hasSender() {
                return this._builder.hasSender();
            }

            public final file_send_message.FileSendData.FileSender getSenderOrNull(Dsl $this$senderOrNull) {
                Intrinsics.checkNotNullParameter($this$senderOrNull, "<this>");
                return File_send_messageKtKt.getSenderOrNull($this$senderOrNull._builder);
            }
        }

        private FileSendDataKt() {
        }

        /* renamed from: -initializefileSender, reason: not valid java name */
        public final file_send_message.FileSendData.FileSender m9251initializefileSender(Function1<? super FileSenderKt.Dsl, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            FileSenderKt.Dsl.Companion companion = FileSenderKt.Dsl.INSTANCE;
            file_send_message.FileSendData.FileSender.Builder builderNewBuilder = file_send_message.FileSendData.FileSender.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
            FileSenderKt.Dsl dsl_create = companion._create(builderNewBuilder);
            block.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: file_send_messageKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$FileSenderKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class FileSenderKt {
            public static final int $stable = 0;
            public static final FileSenderKt INSTANCE = new FileSenderKt();

            /* compiled from: file_send_messageKt.kt */
            @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR$\u0010$\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000e\u00a8\u0006)"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$FileSenderKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender;", "value", "", "sendUserId", "getSendUserId", "()Ljava/lang/String;", "setSendUserId", "(Ljava/lang/String;)V", "clearSendUserId", "", "userId", "getUserId", "setUserId", "clearUserId", "", "tempCode", "getTempCode", "()J", "setTempCode", "(J)V", "clearTempCode", "sendType", "getSendType", "setSendType", "clearSendType", "data", "getData", "setData", "clearData", "sendDeviceId", "getSendDeviceId", "setSendDeviceId", "clearSendDeviceId", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Dsl {
                private final file_send_message.FileSendData.FileSender.Builder _builder;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final int $stable = 8;

                public /* synthetic */ Dsl(file_send_message.FileSendData.FileSender.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                    this(builder);
                }

                private Dsl(file_send_message.FileSendData.FileSender.Builder _builder) {
                    this._builder = _builder;
                }

                /* compiled from: file_send_messageKt.kt */
                @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$FileSenderKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$FileSenderKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(file_send_message.FileSendData.FileSender.Builder builder) {
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new Dsl(builder, null);
                    }
                }

                public final /* synthetic */ file_send_message.FileSendData.FileSender _build() {
                    file_send_message.FileSendData.FileSender fileSenderBuild = this._builder.build();
                    Intrinsics.checkNotNullExpressionValue(fileSenderBuild, "build(...)");
                    return fileSenderBuild;
                }

                public final String getSendUserId() {
                    String sendUserId = this._builder.getSendUserId();
                    Intrinsics.checkNotNullExpressionValue(sendUserId, "getSendUserId(...)");
                    return sendUserId;
                }

                public final void setSendUserId(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setSendUserId(value);
                }

                public final void clearSendUserId() {
                    this._builder.clearSendUserId();
                }

                public final String getUserId() {
                    String userId = this._builder.getUserId();
                    Intrinsics.checkNotNullExpressionValue(userId, "getUserId(...)");
                    return userId;
                }

                public final void setUserId(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setUserId(value);
                }

                public final void clearUserId() {
                    this._builder.clearUserId();
                }

                public final long getTempCode() {
                    return this._builder.getTempCode();
                }

                public final void setTempCode(long value) {
                    this._builder.setTempCode(value);
                }

                public final void clearTempCode() {
                    this._builder.clearTempCode();
                }

                public final String getSendType() {
                    String sendType = this._builder.getSendType();
                    Intrinsics.checkNotNullExpressionValue(sendType, "getSendType(...)");
                    return sendType;
                }

                public final void setSendType(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setSendType(value);
                }

                public final void clearSendType() {
                    this._builder.clearSendType();
                }

                public final String getData() {
                    String data = this._builder.getData();
                    Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                    return data;
                }

                public final void setData(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setData(value);
                }

                public final void clearData() {
                    this._builder.clearData();
                }

                public final String getSendDeviceId() {
                    String sendDeviceId = this._builder.getSendDeviceId();
                    Intrinsics.checkNotNullExpressionValue(sendDeviceId, "getSendDeviceId(...)");
                    return sendDeviceId;
                }

                public final void setSendDeviceId(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setSendDeviceId(value);
                }

                public final void clearSendDeviceId() {
                    this._builder.clearSendDeviceId();
                }
            }

            private FileSenderKt() {
            }
        }
    }
}
