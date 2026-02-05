package com.yhchat.canarys.proto.group;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.proto.group.bot_list;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: bot_listKt.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000bJ*\u0010\f\u001a\u00020\r2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt;", "", "<init>", "()V", "instructionData", "Lcom/yhchat/canarys/proto/group/bot_list$Instruction_data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/group/bot_listKt$Instruction_dataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeinstructionData", "menuData", "Lcom/yhchat/canarys/proto/group/bot_list$Menu_data;", "Lcom/yhchat/canarys/proto/group/bot_listKt$Menu_dataKt$Dsl;", "-initializemenuData", "Dsl", "Instruction_dataKt", "Menu_dataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class bot_listKt {
    public static final int $stable = 0;
    public static final bot_listKt INSTANCE = new bot_listKt();

    /* compiled from: bot_listKt.kt */
    @Metadata(m168d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0004?@ABB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J%\u0010\u001c\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0007\u00a2\u0006\u0002\b\u001dJ&\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0087\n\u00a2\u0006\u0002\b\u001fJ+\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0007\u00a2\u0006\u0002\b#J,\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0087\n\u00a2\u0006\u0002\b$J.\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0018H\u0087\u0002\u00a2\u0006\u0002\b(J\u001d\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0007\u00a2\u0006\u0002\b*J%\u0010\u001c\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u00172\u0006\u0010\b\u001a\u00020,H\u0007\u00a2\u0006\u0002\b/J&\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u00172\u0006\u0010\b\u001a\u00020,H\u0087\n\u00a2\u0006\u0002\b0J+\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020,0\"H\u0007\u00a2\u0006\u0002\b1J,\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020,0\"H\u0087\n\u00a2\u0006\u0002\b2J.\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u00172\u0006\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020,H\u0087\u0002\u00a2\u0006\u0002\b3J\u001d\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u0017H\u0007\u00a2\u0006\u0002\b4J%\u0010\u001c\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u00172\u0006\u0010\b\u001a\u000206H\u0007\u00a2\u0006\u0002\b9J&\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u00172\u0006\u0010\b\u001a\u000206H\u0087\n\u00a2\u0006\u0002\b:J+\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u0002060\"H\u0007\u00a2\u0006\u0002\b;J,\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u0002060\"H\u0087\n\u00a2\u0006\u0002\b<J.\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u00172\u0006\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u000206H\u0087\u0002\u00a2\u0006\u0002\b=J\u001d\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u0017H\u0007\u00a2\u0006\u0002\b>R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0\u00178F\u00a2\u0006\u0006\u001a\u0004\b.\u0010\u001bR\u001d\u00105\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u0002070\u00178F\u00a2\u0006\u0006\u001a\u0004\b8\u0010\u001b\u00a8\u0006C"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/bot_list$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/bot_list$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/bot_list;", "value", "Lcom/yhchat/canarys/proto/group/Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/group/Status;", "setStatus", "(Lcom/yhchat/canarys/proto/group/Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl;)Lcom/yhchat/canarys/proto/group/Status;", "bot", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/group/Bot_data;", "Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl$BotProxy;", "getBot", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addBot", "plusAssign", "plusAssignBot", "addAll", "values", "", "addAllBot", "plusAssignAllBot", "set", "index", "", "setBot", "clear", "clearBot", "instruction", "Lcom/yhchat/canarys/proto/group/bot_list$Instruction_data;", "Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl$InstructionProxy;", "getInstruction", "addInstruction", "plusAssignInstruction", "addAllInstruction", "plusAssignAllInstruction", "setInstruction", "clearInstruction", "menu", "Lcom/yhchat/canarys/proto/group/bot_list$Menu_data;", "Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl$MenuProxy;", "getMenu", "addMenu", "plusAssignMenu", "addAllMenu", "plusAssignAllMenu", "setMenu", "clearMenu", "Companion", "BotProxy", "InstructionProxy", "MenuProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final bot_list.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(bot_list.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(bot_list.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: bot_listKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/bot_list$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(bot_list.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ bot_list _build() {
            bot_list bot_listVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(bot_listVarBuild, "build(...)");
            return bot_listVarBuild;
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
            return Bot_listKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        /* compiled from: bot_listKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl$BotProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class BotProxy extends DslProxy {
            public static final int $stable = 8;

            private BotProxy() {
            }
        }

        public final /* synthetic */ DslList getBot() {
            List<Bot_data> botList = this._builder.getBotList();
            Intrinsics.checkNotNullExpressionValue(botList, "getBotList(...)");
            return new DslList(botList);
        }

        public final /* synthetic */ void addBot(DslList $this$add, Bot_data value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addBot(value);
        }

        public final /* synthetic */ void plusAssignBot(DslList<Bot_data, BotProxy> dslList, Bot_data value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addBot(dslList, value);
        }

        public final /* synthetic */ void addAllBot(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllBot(values);
        }

        public final /* synthetic */ void plusAssignAllBot(DslList<Bot_data, BotProxy> dslList, Iterable<Bot_data> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllBot(dslList, values);
        }

        public final /* synthetic */ void setBot(DslList $this$set, int index, Bot_data value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setBot(index, value);
        }

        public final /* synthetic */ void clearBot(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearBot();
        }

        /* compiled from: bot_listKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl$InstructionProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class InstructionProxy extends DslProxy {
            public static final int $stable = 8;

            private InstructionProxy() {
            }
        }

        public final /* synthetic */ DslList getInstruction() {
            List<bot_list.Instruction_data> instructionList = this._builder.getInstructionList();
            Intrinsics.checkNotNullExpressionValue(instructionList, "getInstructionList(...)");
            return new DslList(instructionList);
        }

        public final /* synthetic */ void addInstruction(DslList $this$add, bot_list.Instruction_data value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addInstruction(value);
        }

        public final /* synthetic */ void plusAssignInstruction(DslList<bot_list.Instruction_data, InstructionProxy> dslList, bot_list.Instruction_data value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addInstruction(dslList, value);
        }

        public final /* synthetic */ void addAllInstruction(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllInstruction(values);
        }

        public final /* synthetic */ void plusAssignAllInstruction(DslList<bot_list.Instruction_data, InstructionProxy> dslList, Iterable<bot_list.Instruction_data> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllInstruction(dslList, values);
        }

        public final /* synthetic */ void setInstruction(DslList $this$set, int index, bot_list.Instruction_data value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setInstruction(index, value);
        }

        public final /* synthetic */ void clearInstruction(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearInstruction();
        }

        /* compiled from: bot_listKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl$MenuProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class MenuProxy extends DslProxy {
            public static final int $stable = 8;

            private MenuProxy() {
            }
        }

        public final /* synthetic */ DslList getMenu() {
            List<bot_list.Menu_data> menuList = this._builder.getMenuList();
            Intrinsics.checkNotNullExpressionValue(menuList, "getMenuList(...)");
            return new DslList(menuList);
        }

        public final /* synthetic */ void addMenu(DslList $this$add, bot_list.Menu_data value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addMenu(value);
        }

        public final /* synthetic */ void plusAssignMenu(DslList<bot_list.Menu_data, MenuProxy> dslList, bot_list.Menu_data value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addMenu(dslList, value);
        }

        public final /* synthetic */ void addAllMenu(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllMenu(values);
        }

        public final /* synthetic */ void plusAssignAllMenu(DslList<bot_list.Menu_data, MenuProxy> dslList, Iterable<bot_list.Menu_data> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllMenu(dslList, values);
        }

        public final /* synthetic */ void setMenu(DslList $this$set, int index, bot_list.Menu_data value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMenu(index, value);
        }

        public final /* synthetic */ void clearMenu(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearMenu();
        }
    }

    private bot_listKt() {
    }

    /* renamed from: -initializeinstructionData, reason: not valid java name */
    public final bot_list.Instruction_data m9642initializeinstructionData(Function1<? super Instruction_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Instruction_dataKt.Dsl.Companion companion = Instruction_dataKt.Dsl.INSTANCE;
        bot_list.Instruction_data.Builder builderNewBuilder = bot_list.Instruction_data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        Instruction_dataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: bot_listKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Instruction_dataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Instruction_dataKt {
        public static final int $stable = 0;
        public static final Instruction_dataKt INSTANCE = new Instruction_dataKt();

        /* compiled from: bot_listKt.kt */
        @Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u001c\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001;B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0010J\u0006\u00106\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R$\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R$\u0010+\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R$\u0010/\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR$\u00103\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u0010\u0016R$\u00107\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016\u00a8\u0006<"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Instruction_dataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/bot_list$Instruction_data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/bot_list$Instruction_data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/bot_list$Instruction_data;", "value", "", Name.MARK, "getId", "()J", "setId", "(J)V", "clearId", "", "", "botId", "getBotId", "()Ljava/lang/String;", "setBotId", "(Ljava/lang/String;)V", "clearBotId", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "desc", "getDesc", "setDesc", "clearDesc", "", "type", "getType", "()I", "setType", "(I)V", "clearType", "hintText", "getHintText", "setHintText", "clearHintText", "defaultText", "getDefaultText", "setDefaultText", "clearDefaultText", "sort", "getSort", "setSort", "clearSort", "form", "getForm", "setForm", "clearForm", "botName", "getBotName", "setBotName", "clearBotName", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final bot_list.Instruction_data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(bot_list.Instruction_data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(bot_list.Instruction_data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: bot_listKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Instruction_dataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/bot_listKt$Instruction_dataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/bot_list$Instruction_data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(bot_list.Instruction_data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ bot_list.Instruction_data _build() {
                bot_list.Instruction_data instruction_dataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(instruction_dataBuild, "build(...)");
                return instruction_dataBuild;
            }

            public final long getId() {
                return this._builder.getId();
            }

            public final void setId(long value) {
                this._builder.setId(value);
            }

            public final void clearId() {
                this._builder.clearId();
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

            public final String getDesc() {
                String desc = this._builder.getDesc();
                Intrinsics.checkNotNullExpressionValue(desc, "getDesc(...)");
                return desc;
            }

            public final void setDesc(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setDesc(value);
            }

            public final void clearDesc() {
                this._builder.clearDesc();
            }

            public final int getType() {
                return this._builder.getType();
            }

            public final void setType(int value) {
                this._builder.setType(value);
            }

            public final void clearType() {
                this._builder.clearType();
            }

            public final String getHintText() {
                String hintText = this._builder.getHintText();
                Intrinsics.checkNotNullExpressionValue(hintText, "getHintText(...)");
                return hintText;
            }

            public final void setHintText(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setHintText(value);
            }

            public final void clearHintText() {
                this._builder.clearHintText();
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

            public final long getSort() {
                return this._builder.getSort();
            }

            public final void setSort(long value) {
                this._builder.setSort(value);
            }

            public final void clearSort() {
                this._builder.clearSort();
            }

            public final String getForm() {
                String form = this._builder.getForm();
                Intrinsics.checkNotNullExpressionValue(form, "getForm(...)");
                return form;
            }

            public final void setForm(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setForm(value);
            }

            public final void clearForm() {
                this._builder.clearForm();
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

        private Instruction_dataKt() {
        }
    }

    /* renamed from: -initializemenuData, reason: not valid java name */
    public final bot_list.Menu_data m9643initializemenuData(Function1<? super Menu_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Menu_dataKt.Dsl.Companion companion = Menu_dataKt.Dsl.INSTANCE;
        bot_list.Menu_data.Builder builderNewBuilder = bot_list.Menu_data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        Menu_dataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: bot_listKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Menu_dataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Menu_dataKt {
        public static final int $stable = 0;
        public static final Menu_dataKt INSTANCE = new Menu_dataKt();

        /* compiled from: bot_listKt.kt */
        @Metadata(m168d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R$\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR$\u0010+\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010#\"\u0004\b-\u0010%R$\u0010/\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u0010\u0016\u00a8\u00064"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Menu_dataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/bot_list$Menu_data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/bot_list$Menu_data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/bot_list$Menu_data;", "value", "", Name.MARK, "getId", "()J", "setId", "(J)V", "clearId", "", "", "botId", "getBotId", "()Ljava/lang/String;", "setBotId", "(Ljava/lang/String;)V", "clearBotId", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "content", "getContent", "setContent", "clearContent", "", "menuType", "getMenuType", "()I", "setMenuType", "(I)V", "clearMenuType", "createTime", "getCreateTime", "setCreateTime", "clearCreateTime", "menuAction", "getMenuAction", "setMenuAction", "clearMenuAction", "select", "getSelect", "setSelect", "clearSelect", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final bot_list.Menu_data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(bot_list.Menu_data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(bot_list.Menu_data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: bot_listKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/bot_listKt$Menu_dataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/bot_listKt$Menu_dataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/bot_list$Menu_data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(bot_list.Menu_data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ bot_list.Menu_data _build() {
                bot_list.Menu_data menu_dataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(menu_dataBuild, "build(...)");
                return menu_dataBuild;
            }

            public final long getId() {
                return this._builder.getId();
            }

            public final void setId(long value) {
                this._builder.setId(value);
            }

            public final void clearId() {
                this._builder.clearId();
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

            public final int getMenuType() {
                return this._builder.getMenuType();
            }

            public final void setMenuType(int value) {
                this._builder.setMenuType(value);
            }

            public final void clearMenuType() {
                this._builder.clearMenuType();
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

            public final int getMenuAction() {
                return this._builder.getMenuAction();
            }

            public final void setMenuAction(int value) {
                this._builder.setMenuAction(value);
            }

            public final void clearMenuAction() {
                this._builder.clearMenuAction();
            }

            public final String getSelect() {
                String select = this._builder.getSelect();
                Intrinsics.checkNotNullExpressionValue(select, "getSelect(...)");
                return select;
            }

            public final void setSelect(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setSelect(value);
            }

            public final void clearSelect() {
                this._builder.clearSelect();
            }
        }

        private Menu_dataKt() {
        }
    }
}
