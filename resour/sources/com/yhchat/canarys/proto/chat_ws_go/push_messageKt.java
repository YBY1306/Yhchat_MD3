package com.yhchat.canarys.proto.chat_ws_go;

import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.proto.chat_ws_go.push_message;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: push_messageKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt;", "", "<init>", "()V", "pushData", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$PushDataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializepushData", "Dsl", "PushDataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class push_messageKt {
    public static final int $stable = 0;
    public static final push_messageKt INSTANCE = new push_messageKt();

    /* compiled from: push_messageKt.kt */
    @Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/push_message$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message;", "value", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "info", "getInfo", "()Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "setInfo", "(Lcom/yhchat/canarys/proto/chat_ws_go/INFO;)V", "clearInfo", "", "hasInfo", "", "infoOrNull", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData;", "data", "getData", "()Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData;", "setData", "(Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData;)V", "clearData", "hasData", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final push_message.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(push_message.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(push_message.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: push_messageKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(push_message.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ push_message _build() {
            push_message push_messageVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(push_messageVarBuild, "build(...)");
            return push_messageVarBuild;
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
            return Push_messageKtKt.getInfoOrNull($this$infoOrNull._builder);
        }

        public final push_message.PushData getData() {
            push_message.PushData data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(push_message.PushData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final push_message.PushData getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return Push_messageKtKt.getDataOrNull($this$dataOrNull._builder);
        }
    }

    private push_messageKt() {
    }

    /* renamed from: -initializepushData, reason: not valid java name */
    public final push_message.PushData m9270initializepushData(Function1<? super PushDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        PushDataKt.Dsl.Companion companion = PushDataKt.Dsl.INSTANCE;
        push_message.PushData.Builder builderNewBuilder = push_message.PushData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        PushDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: push_messageKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$PushDataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class PushDataKt {
        public static final int $stable = 0;
        public static final PushDataKt INSTANCE = new PushDataKt();

        /* compiled from: push_messageKt.kt */
        @Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0011*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$PushDataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData;", "value", "", "any", "getAny", "()Ljava/lang/String;", "setAny", "(Ljava/lang/String;)V", "clearAny", "", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg;", NotificationCompat.CATEGORY_MESSAGE, "getMsg", "()Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg;", "setMsg", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg;)V", "clearMsg", "hasMsg", "", "msgOrNull", "getMsgOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$PushDataKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final push_message.PushData.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(push_message.PushData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(push_message.PushData.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: push_messageKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$PushDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$PushDataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(push_message.PushData.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ push_message.PushData _build() {
                push_message.PushData pushDataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(pushDataBuild, "build(...)");
                return pushDataBuild;
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

            public final WsMsg getMsg() {
                WsMsg msg = this._builder.getMsg();
                Intrinsics.checkNotNullExpressionValue(msg, "getMsg(...)");
                return msg;
            }

            public final void setMsg(WsMsg value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setMsg(value);
            }

            public final void clearMsg() {
                this._builder.clearMsg();
            }

            public final boolean hasMsg() {
                return this._builder.hasMsg();
            }

            public final WsMsg getMsgOrNull(Dsl $this$msgOrNull) {
                Intrinsics.checkNotNullParameter($this$msgOrNull, "<this>");
                return Push_messageKtKt.getMsgOrNull($this$msgOrNull._builder);
            }
        }

        private PushDataKt() {
        }
    }
}
