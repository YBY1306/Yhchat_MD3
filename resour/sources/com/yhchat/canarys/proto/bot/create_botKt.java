package com.yhchat.canarys.proto.bot;

import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.proto.bot.Bot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: create_botKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/create_botKt;", "", "<init>", "()V", "botData", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/bot/create_botKt$BotDataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializebotData", "Dsl", "BotDataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class create_botKt {
    public static final int $stable = 0;
    public static final create_botKt INSTANCE = new create_botKt();

    /* compiled from: create_botKt.kt */
    @Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/create_botKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/bot/Bot$create_bot$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot;", "value", "Lcom/yhchat/canarys/proto/bot/Bot$Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/bot/Bot$Status;", "setStatus", "(Lcom/yhchat/canarys/proto/bot/Bot$Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/bot/create_botKt$Dsl;)Lcom/yhchat/canarys/proto/bot/Bot$Status;", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData;", "data", "getData", "()Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData;", "setData", "(Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData;)V", "clearData", "hasData", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/bot/create_botKt$Dsl;)Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final Bot.create_bot.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(Bot.create_bot.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(Bot.create_bot.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: create_botKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/create_botKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/bot/create_botKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Bot.create_bot.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ Bot.create_bot _build() {
            Bot.create_bot create_botVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(create_botVarBuild, "build(...)");
            return create_botVarBuild;
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
            return Create_botKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        public final Bot.create_bot.BotData getData() {
            Bot.create_bot.BotData data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(Bot.create_bot.BotData value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final Bot.create_bot.BotData getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return Create_botKtKt.getDataOrNull($this$dataOrNull._builder);
        }
    }

    private create_botKt() {
    }

    /* renamed from: -initializebotData, reason: not valid java name */
    public final Bot.create_bot.BotData m8973initializebotData(Function1<? super BotDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        BotDataKt.Dsl.Companion companion = BotDataKt.Dsl.INSTANCE;
        Bot.create_bot.BotData.Builder builderNewBuilder = Bot.create_bot.BotData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        BotDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: create_botKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/create_botKt$BotDataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class BotDataKt {
        public static final int $stable = 0;
        public static final BotDataKt INSTANCE = new BotDataKt();

        /* compiled from: create_botKt.kt */
        @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/create_botKt$BotDataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData;", "value", "", "botId", "getBotId", "()Ljava/lang/String;", "setBotId", "(Ljava/lang/String;)V", "clearBotId", "", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final Bot.create_bot.BotData.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(Bot.create_bot.BotData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(Bot.create_bot.BotData.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: create_botKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/create_botKt$BotDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/bot/create_botKt$BotDataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Bot.create_bot.BotData.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ Bot.create_bot.BotData _build() {
                Bot.create_bot.BotData botDataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(botDataBuild, "build(...)");
                return botDataBuild;
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
        }

        private BotDataKt() {
        }
    }
}
