package com.yhchat.canarys.proto.instruction;

import androidx.core.app.NotificationCompat;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.proto.instruction.instruction_list;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: instruction_listKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/instruction_listKt;", "", "<init>", "()V", "data", "Lcom/yhchat/canarys/proto/instruction/instruction_list$Data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/instruction/instruction_listKt$DataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedata", "Dsl", "DataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public final class instruction_listKt {
    public static final int $stable = 0;
    public static final instruction_listKt INSTANCE = new instruction_listKt();

    /* compiled from: instruction_listKt.kt */
    @Metadata(m168d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J%\u0010\u001c\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0007\u00a2\u0006\u0002\b\u001dJ&\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0087\n\u00a2\u0006\u0002\b\u001fJ+\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0007\u00a2\u0006\u0002\b#J,\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0087\n\u00a2\u0006\u0002\b$J.\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0018H\u0087\u0002\u00a2\u0006\u0002\b(J\u001d\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0007\u00a2\u0006\u0002\b*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/instruction_listKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/instruction/instruction_list$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/instruction/instruction_list$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/instruction/instruction_list;", "value", "Lcom/yhchat/canarys/proto/instruction/Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/instruction/Status;", "setStatus", "(Lcom/yhchat/canarys/proto/instruction/Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/instruction/instruction_listKt$Dsl;)Lcom/yhchat/canarys/proto/instruction/Status;", "data", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/instruction/instruction_list$Data;", "Lcom/yhchat/canarys/proto/instruction/instruction_listKt$Dsl$DataProxy;", "getData", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addData", "plusAssign", "plusAssignData", "addAll", "values", "", "addAllData", "plusAssignAllData", "set", "index", "", "setData", "clear", "clearData", "Companion", "DataProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final instruction_list.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(instruction_list.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(instruction_list.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: instruction_listKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/instruction_listKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/instruction/instruction_listKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/instruction/instruction_list$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(instruction_list.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ instruction_list _build() {
            instruction_list instruction_listVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(instruction_listVarBuild, "build(...)");
            return instruction_listVarBuild;
        }

        public final Status getStatus() {
            Status status = this._builder.getStatus();
            Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
            return status;
        }

        public final void setStatus(Status value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStatus(value);
        }

        public final void clearStatus() {
            this._builder.clearStatus();
        }

        public final boolean hasStatus() {
            return this._builder.hasStatus();
        }

        public final Status getStatusOrNull(Dsl $this$statusOrNull) {
            Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
            return Instruction_listKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        /* compiled from: instruction_listKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/instruction_listKt$Dsl$DataProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class DataProxy extends DslProxy {
            public static final int $stable = 8;

            private DataProxy() {
            }
        }

        public final /* synthetic */ DslList getData() {
            List<instruction_list.Data> dataList = this._builder.getDataList();
            Intrinsics.checkNotNullExpressionValue(dataList, "getDataList(...)");
            return new DslList(dataList);
        }

        public final /* synthetic */ void addData(DslList $this$add, instruction_list.Data value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addData(value);
        }

        public final /* synthetic */ void plusAssignData(DslList<instruction_list.Data, DataProxy> dslList, instruction_list.Data value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addData(dslList, value);
        }

        public final /* synthetic */ void addAllData(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllData(values);
        }

        public final /* synthetic */ void plusAssignAllData(DslList<instruction_list.Data, DataProxy> dslList, Iterable<instruction_list.Data> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllData(dslList, values);
        }

        public final /* synthetic */ void setData(DslList $this$set, int index, instruction_list.Data value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(index, value);
        }

        public final /* synthetic */ void clearData(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearData();
        }
    }

    private instruction_listKt() {
    }

    /* renamed from: -initializedata, reason: not valid java name */
    public final instruction_list.Data m9901initializedata(Function1<? super DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DataKt.Dsl.Companion companion = DataKt.Dsl.INSTANCE;
        instruction_list.Data.Builder builderNewBuilder = instruction_list.Data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        DataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: instruction_listKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/instruction_listKt$DataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class DataKt {
        public static final int $stable = 0;
        public static final DataKt INSTANCE = new DataKt();

        /* compiled from: instruction_listKt.kt */
        @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010 \u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R$\u0010$\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016\u00a8\u0006)"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/instruction_listKt$DataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/instruction/instruction_list$Data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/instruction/instruction_list$Data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/instruction/instruction_list$Data;", "value", "", "commandId", "getCommandId", "()J", "setCommandId", "(J)V", "clearCommandId", "", "", "botId", "getBotId", "()Ljava/lang/String;", "setBotId", "(Ljava/lang/String;)V", "clearBotId", "commandName", "getCommandName", "setCommandName", "clearCommandName", "instructionType", "getInstructionType", "setInstructionType", "clearInstructionType", "defaultText", "getDefaultText", "setDefaultText", "clearDefaultText", "botSettingsJson", "getBotSettingsJson", "setBotSettingsJson", "clearBotSettingsJson", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final instruction_list.Data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(instruction_list.Data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(instruction_list.Data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: instruction_listKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/instruction_listKt$DataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/instruction/instruction_listKt$DataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/instruction/instruction_list$Data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(instruction_list.Data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ instruction_list.Data _build() {
                instruction_list.Data dataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
                return dataBuild;
            }

            public final long getCommandId() {
                return this._builder.getCommandId();
            }

            public final void setCommandId(long value) {
                this._builder.setCommandId(value);
            }

            public final void clearCommandId() {
                this._builder.clearCommandId();
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

            public final String getCommandName() {
                String commandName = this._builder.getCommandName();
                Intrinsics.checkNotNullExpressionValue(commandName, "getCommandName(...)");
                return commandName;
            }

            public final void setCommandName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCommandName(value);
            }

            public final void clearCommandName() {
                this._builder.clearCommandName();
            }

            public final long getInstructionType() {
                return this._builder.getInstructionType();
            }

            public final void setInstructionType(long value) {
                this._builder.setInstructionType(value);
            }

            public final void clearInstructionType() {
                this._builder.clearInstructionType();
            }

            public final String getDefaultText() {
                String defaultText = this._builder.getDefaultText();
                Intrinsics.checkNotNullExpressionValue(defaultText, "getDefaultText(...)");
                return defaultText;
            }

            public final void setDefaultText(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDefaultText(value);
            }

            public final void clearDefaultText() {
                this._builder.clearDefaultText();
            }

            public final String getBotSettingsJson() {
                String botSettingsJson = this._builder.getBotSettingsJson();
                Intrinsics.checkNotNullExpressionValue(botSettingsJson, "getBotSettingsJson(...)");
                return botSettingsJson;
            }

            public final void setBotSettingsJson(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBotSettingsJson(value);
            }

            public final void clearBotSettingsJson() {
                this._builder.clearBotSettingsJson();
            }
        }

        private DataKt() {
        }
    }
}
