package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.chat_ws_go.draft_input;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: draft_inputKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt;", "", "<init>", "()V", "draftData", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedraftData", "Dsl", "DraftDataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class draft_inputKt {
    public static final int $stable = 0;
    public static final draft_inputKt INSTANCE = new draft_inputKt();

    /* compiled from: draft_inputKt.kt */
    @Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input;", "value", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "info", "getInfo", "()Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "setInfo", "(Lcom/yhchat/canarys/proto/chat_ws_go/INFO;)V", "clearInfo", "", "hasInfo", "", "infoOrNull", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData;", "data", "getData", "()Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData;", "setData", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData;)V", "clearData", "hasData", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final draft_input.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(draft_input.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(draft_input.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: draft_inputKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(draft_input.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ draft_input _build() {
            draft_input draft_inputVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(draft_inputVarBuild, "build(...)");
            return draft_inputVarBuild;
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
            return Draft_inputKtKt.getInfoOrNull($this$infoOrNull._builder);
        }

        public final draft_input.DraftData getData() {
            draft_input.DraftData data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(draft_input.DraftData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final draft_input.DraftData getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return Draft_inputKtKt.getDataOrNull($this$dataOrNull._builder);
        }
    }

    private draft_inputKt() {
    }

    /* renamed from: -initializedraftData, reason: not valid java name */
    public final draft_input.DraftData m9201initializedraftData(Function1<? super DraftDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DraftDataKt.Dsl.Companion companion = DraftDataKt.Dsl.INSTANCE;
        draft_input.DraftData.Builder builderNewBuilder = draft_input.DraftData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        DraftDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: draft_inputKt.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt;", "", "<init>", "()V", "draft", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$DraftKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedraft", "Dsl", "DraftKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class DraftDataKt {
        public static final int $stable = 0;
        public static final DraftDataKt INSTANCE = new DraftDataKt();

        /* compiled from: draft_inputKt.kt */
        @Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0011*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData;", "value", "", "any", "getAny", "()Ljava/lang/String;", "setAny", "(Ljava/lang/String;)V", "clearAny", "", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft;", "draft", "getDraft", "()Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft;", "setDraft", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft;)V", "clearDraft", "hasDraft", "", "draftOrNull", "getDraftOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final draft_input.DraftData.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(draft_input.DraftData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(draft_input.DraftData.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: draft_inputKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(draft_input.DraftData.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ draft_input.DraftData _build() {
                draft_input.DraftData draftDataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(draftDataBuild, "build(...)");
                return draftDataBuild;
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

            public final draft_input.DraftData.Draft getDraft() {
                draft_input.DraftData.Draft draft = this._builder.getDraft();
                Intrinsics.checkNotNullExpressionValue(draft, "getDraft(...)");
                return draft;
            }

            public final void setDraft(draft_input.DraftData.Draft value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDraft(value);
            }

            public final void clearDraft() {
                this._builder.clearDraft();
            }

            public final boolean hasDraft() {
                return this._builder.hasDraft();
            }

            public final draft_input.DraftData.Draft getDraftOrNull(Dsl $this$draftOrNull) {
                Intrinsics.checkNotNullParameter($this$draftOrNull, "<this>");
                return Draft_inputKtKt.getDraftOrNull($this$draftOrNull._builder);
            }
        }

        private DraftDataKt() {
        }

        /* renamed from: -initializedraft, reason: not valid java name */
        public final draft_input.DraftData.Draft m9202initializedraft(Function1<? super DraftKt.Dsl, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            DraftKt.Dsl.Companion companion = DraftKt.Dsl.INSTANCE;
            draft_input.DraftData.Draft.Builder builderNewBuilder = draft_input.DraftData.Draft.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
            DraftKt.Dsl dsl_create = companion._create(builderNewBuilder);
            block.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: draft_inputKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$DraftKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class DraftKt {
            public static final int $stable = 0;
            public static final DraftKt INSTANCE = new DraftKt();

            /* compiled from: draft_inputKt.kt */
            @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000e\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$DraftKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft;", "value", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "clearChatId", "", "input", "getInput", "setInput", "clearInput", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Dsl {
                private final draft_input.DraftData.Draft.Builder _builder;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final int $stable = 8;

                public /* synthetic */ Dsl(draft_input.DraftData.Draft.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                    this(builder);
                }

                private Dsl(draft_input.DraftData.Draft.Builder _builder) {
                    this._builder = _builder;
                }

                /* compiled from: draft_inputKt.kt */
                @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$DraftKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$DraftKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(draft_input.DraftData.Draft.Builder builder) {
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new Dsl(builder, null);
                    }
                }

                public final /* synthetic */ draft_input.DraftData.Draft _build() {
                    draft_input.DraftData.Draft draftBuild = this._builder.build();
                    Intrinsics.checkNotNullExpressionValue(draftBuild, "build(...)");
                    return draftBuild;
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

                public final String getInput() {
                    String input = this._builder.getInput();
                    Intrinsics.checkNotNullExpressionValue(input, "getInput(...)");
                    return input;
                }

                public final void setInput(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setInput(value);
                }

                public final void clearInput() {
                    this._builder.clearInput();
                }
            }

            private DraftKt() {
            }
        }
    }
}
