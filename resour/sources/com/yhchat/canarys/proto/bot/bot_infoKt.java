package com.yhchat.canarys.proto.bot;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.proto.bot.Bot;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: bot_infoKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/bot_infoKt;", "", "<init>", "()V", "botData", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/bot/bot_infoKt$Bot_dataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializebotData", "Dsl", "Bot_dataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class bot_infoKt {
    public static final int $stable = 0;
    public static final bot_infoKt INSTANCE = new bot_infoKt();

    /* compiled from: bot_infoKt.kt */
    @Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/bot_infoKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info;", "value", "Lcom/yhchat/canarys/proto/bot/Bot$Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/bot/Bot$Status;", "setStatus", "(Lcom/yhchat/canarys/proto/bot/Bot$Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/bot/bot_infoKt$Dsl;)Lcom/yhchat/canarys/proto/bot/Bot$Status;", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data;", "data", "getData", "()Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data;", "setData", "(Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data;)V", "clearData", "hasData", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/bot/bot_infoKt$Dsl;)Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final Bot.bot_info.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(Bot.bot_info.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(Bot.bot_info.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: bot_infoKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/bot_infoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/bot/bot_infoKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Bot.bot_info.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ Bot.bot_info _build() {
            Bot.bot_info bot_infoVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(bot_infoVarBuild, "build(...)");
            return bot_infoVarBuild;
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
            return Bot_infoKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        public final Bot.bot_info.Bot_data getData() {
            Bot.bot_info.Bot_data data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(Bot.bot_info.Bot_data value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final Bot.bot_info.Bot_data getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return Bot_infoKtKt.getDataOrNull($this$dataOrNull._builder);
        }
    }

    private bot_infoKt() {
    }

    /* renamed from: -initializebotData, reason: not valid java name */
    public final Bot.bot_info.Bot_data m8972initializebotData(Function1<? super Bot_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Bot_dataKt.Dsl.Companion companion = Bot_dataKt.Dsl.INSTANCE;
        Bot.bot_info.Bot_data.Builder builderNewBuilder = Bot.bot_info.Bot_data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        Bot_dataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: bot_infoKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/bot_infoKt$Bot_dataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Bot_dataKt {
        public static final int $stable = 0;
        public static final Bot_dataKt INSTANCE = new Bot_dataKt();

        /* compiled from: bot_infoKt.kt */
        @Metadata(m168d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0010\b\n\u0002\b \b\u0007\u0018\u0000 S2\u00020\u0001:\u0001SB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00103\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0010J\u0006\u0010>\u001a\u00020\u0010J\u0006\u0010B\u001a\u00020\u0010J\u0006\u0010F\u001a\u00020\u0010J\u0006\u0010J\u001a\u00020\u0010J\u0006\u0010N\u001a\u00020\u0010J\u0006\u0010R\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010 \u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR$\u0010$\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR$\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR$\u0010,\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR$\u00100\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR$\u00105\u001a\u0002042\u0006\u0010\b\u001a\u0002048G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010;\u001a\u0002042\u0006\u0010\b\u001a\u0002048G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b<\u00107\"\u0004\b=\u00109R$\u0010?\u001a\u0002042\u0006\u0010\b\u001a\u0002048G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b@\u00107\"\u0004\bA\u00109R$\u0010C\u001a\u0002042\u0006\u0010\b\u001a\u0002048G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bD\u00107\"\u0004\bE\u00109R$\u0010G\u001a\u0002042\u0006\u0010\b\u001a\u0002048G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bH\u00107\"\u0004\bI\u00109R$\u0010K\u001a\u0002042\u0006\u0010\b\u001a\u0002048G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u00107\"\u0004\bM\u00109R$\u0010O\u001a\u0002042\u0006\u0010\b\u001a\u0002048G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bP\u00107\"\u0004\bQ\u00109\u00a8\u0006T"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/bot_infoKt$Bot_dataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data;", "value", "", "botId", "getBotId", "()Ljava/lang/String;", "setBotId", "(Ljava/lang/String;)V", "clearBotId", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "", "nameId", "getNameId", "()J", "setNameId", "(J)V", "clearNameId", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "avatarId", "getAvatarId", "setAvatarId", "clearAvatarId", "introduction", "getIntroduction", "setIntroduction", "clearIntroduction", "createBy", "getCreateBy", "setCreateBy", "clearCreateBy", "createTime", "getCreateTime", "setCreateTime", "clearCreateTime", "headcount", "getHeadcount", "setHeadcount", "clearHeadcount", "", "private", "getPrivate", "()I", "setPrivate", "(I)V", "clearPrivate", "isStop", "getIsStop", "setIsStop", "clearIsStop", "alwaysAgree", "getAlwaysAgree", "setAlwaysAgree", "clearAlwaysAgree", "noDetele", "getNoDetele", "setNoDetele", "clearNoDetele", "doNotDisturb", "getDoNotDisturb", "setDoNotDisturb", "clearDoNotDisturb", "top", "getTop", "setTop", "clearTop", "groupLimit", "getGroupLimit", "setGroupLimit", "clearGroupLimit", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final Bot.bot_info.Bot_data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(Bot.bot_info.Bot_data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(Bot.bot_info.Bot_data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: bot_infoKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/bot_infoKt$Bot_dataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/bot/bot_infoKt$Bot_dataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Bot.bot_info.Bot_data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ Bot.bot_info.Bot_data _build() {
                Bot.bot_info.Bot_data bot_dataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(bot_dataBuild, "build(...)");
                return bot_dataBuild;
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

            public final String getName() {
                String name = this._builder.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return name;
            }

            public final void setName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setName(value);
            }

            public final void clearName() {
                this._builder.clearName();
            }

            public final long getNameId() {
                return this._builder.getNameId();
            }

            public final void setNameId(long value) {
                this._builder.setNameId(value);
            }

            public final void clearNameId() {
                this._builder.clearNameId();
            }

            public final String getAvatarUrl() {
                String avatarUrl = this._builder.getAvatarUrl();
                Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
                return avatarUrl;
            }

            public final void setAvatarUrl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAvatarUrl(value);
            }

            public final void clearAvatarUrl() {
                this._builder.clearAvatarUrl();
            }

            public final long getAvatarId() {
                return this._builder.getAvatarId();
            }

            public final void setAvatarId(long value) {
                this._builder.setAvatarId(value);
            }

            public final void clearAvatarId() {
                this._builder.clearAvatarId();
            }

            public final String getIntroduction() {
                String introduction = this._builder.getIntroduction();
                Intrinsics.checkNotNullExpressionValue(introduction, "getIntroduction(...)");
                return introduction;
            }

            public final void setIntroduction(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setIntroduction(value);
            }

            public final void clearIntroduction() {
                this._builder.clearIntroduction();
            }

            public final String getCreateBy() {
                String createBy = this._builder.getCreateBy();
                Intrinsics.checkNotNullExpressionValue(createBy, "getCreateBy(...)");
                return createBy;
            }

            public final void setCreateBy(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCreateBy(value);
            }

            public final void clearCreateBy() {
                this._builder.clearCreateBy();
            }

            public final long getCreateTime() {
                return this._builder.getCreateTime();
            }

            public final void setCreateTime(long value) {
                this._builder.setCreateTime(value);
            }

            public final void clearCreateTime() {
                this._builder.clearCreateTime();
            }

            public final long getHeadcount() {
                return this._builder.getHeadcount();
            }

            public final void setHeadcount(long value) {
                this._builder.setHeadcount(value);
            }

            public final void clearHeadcount() {
                this._builder.clearHeadcount();
            }

            public final int getPrivate() {
                return this._builder.getPrivate();
            }

            public final void setPrivate(int value) {
                this._builder.setPrivate(value);
            }

            public final void clearPrivate() {
                this._builder.clearPrivate();
            }

            public final int getIsStop() {
                return this._builder.getIsStop();
            }

            public final void setIsStop(int value) {
                this._builder.setIsStop(value);
            }

            public final void clearIsStop() {
                this._builder.clearIsStop();
            }

            public final int getAlwaysAgree() {
                return this._builder.getAlwaysAgree();
            }

            public final void setAlwaysAgree(int value) {
                this._builder.setAlwaysAgree(value);
            }

            public final void clearAlwaysAgree() {
                this._builder.clearAlwaysAgree();
            }

            public final int getNoDetele() {
                return this._builder.getNoDetele();
            }

            public final void setNoDetele(int value) {
                this._builder.setNoDetele(value);
            }

            public final void clearNoDetele() {
                this._builder.clearNoDetele();
            }

            public final int getDoNotDisturb() {
                return this._builder.getDoNotDisturb();
            }

            public final void setDoNotDisturb(int value) {
                this._builder.setDoNotDisturb(value);
            }

            public final void clearDoNotDisturb() {
                this._builder.clearDoNotDisturb();
            }

            public final int getTop() {
                return this._builder.getTop();
            }

            public final void setTop(int value) {
                this._builder.setTop(value);
            }

            public final void clearTop() {
                this._builder.clearTop();
            }

            public final int getGroupLimit() {
                return this._builder.getGroupLimit();
            }

            public final void setGroupLimit(int value) {
                this._builder.setGroupLimit(value);
            }

            public final void clearGroupLimit() {
                this._builder.clearGroupLimit();
            }
        }

        private Bot_dataKt() {
        }
    }
}
