package com.yhchat.canarys.proto.group;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.proto.group.info;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: infoKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt;", "", "<init>", "()V", "groupData", "Lcom/yhchat/canarys/proto/group/info$Group_data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializegroupData", "Dsl", "Group_dataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class infoKt {
    public static final int $stable = 0;
    public static final infoKt INSTANCE = new infoKt();

    /* compiled from: infoKt.kt */
    @Metadata(m168d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 62\u00020\u0001:\u000267B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0012J%\u0010'\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0006\u0010\b\u001a\u00020#H\u0007\u00a2\u0006\u0002\b(J&\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0006\u0010\b\u001a\u00020#H\u0087\n\u00a2\u0006\u0002\b*J+\u0010+\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020#0-H\u0007\u00a2\u0006\u0002\b.J,\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020#0-H\u0087\n\u00a2\u0006\u0002\b/J.\u00100\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"2\u0006\u00101\u001a\u0002022\u0006\u0010\b\u001a\u00020#H\u0087\u0002\u00a2\u0006\u0002\b3J\u001d\u00104\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"H\u0007\u00a2\u0006\u0002\b5R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001d\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010&\u00a8\u00068"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/info$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/info$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/info;", "value", "Lcom/yhchat/canarys/proto/group/Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/group/Status;", "setStatus", "(Lcom/yhchat/canarys/proto/group/Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/group/infoKt$Dsl;)Lcom/yhchat/canarys/proto/group/Status;", "Lcom/yhchat/canarys/proto/group/info$Group_data;", "data", "getData", "()Lcom/yhchat/canarys/proto/group/info$Group_data;", "setData", "(Lcom/yhchat/canarys/proto/group/info$Group_data;)V", "clearData", "hasData", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/group/infoKt$Dsl;)Lcom/yhchat/canarys/proto/group/info$Group_data;", "historyBot", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/group/Bot_data;", "Lcom/yhchat/canarys/proto/group/infoKt$Dsl$HistoryBotProxy;", "getHistoryBot", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addHistoryBot", "plusAssign", "plusAssignHistoryBot", "addAll", "values", "", "addAllHistoryBot", "plusAssignAllHistoryBot", "set", "index", "", "setHistoryBot", "clear", "clearHistoryBot", "Companion", "HistoryBotProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final info.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(info.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(info.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: infoKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/infoKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/info$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(info.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ info _build() {
            info infoVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(infoVarBuild, "build(...)");
            return infoVarBuild;
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
            return InfoKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        public final info.Group_data getData() {
            info.Group_data data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(info.Group_data value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final info.Group_data getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return InfoKtKt.getDataOrNull($this$dataOrNull._builder);
        }

        /* compiled from: infoKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Dsl$HistoryBotProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class HistoryBotProxy extends DslProxy {
            public static final int $stable = 8;

            private HistoryBotProxy() {
            }
        }

        public final /* synthetic */ DslList getHistoryBot() {
            List<Bot_data> historyBotList = this._builder.getHistoryBotList();
            Intrinsics.checkNotNullExpressionValue(historyBotList, "getHistoryBotList(...)");
            return new DslList(historyBotList);
        }

        public final /* synthetic */ void addHistoryBot(DslList $this$add, Bot_data value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addHistoryBot(value);
        }

        public final /* synthetic */ void plusAssignHistoryBot(DslList<Bot_data, HistoryBotProxy> dslList, Bot_data value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addHistoryBot(dslList, value);
        }

        public final /* synthetic */ void addAllHistoryBot(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllHistoryBot(values);
        }

        public final /* synthetic */ void plusAssignAllHistoryBot(DslList<Bot_data, HistoryBotProxy> dslList, Iterable<Bot_data> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllHistoryBot(dslList, values);
        }

        public final /* synthetic */ void setHistoryBot(DslList $this$set, int index, Bot_data value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setHistoryBot(index, value);
        }

        public final /* synthetic */ void clearHistoryBot(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearHistoryBot();
        }
    }

    private infoKt() {
    }

    /* renamed from: -initializegroupData, reason: not valid java name */
    public final info.Group_data m9800initializegroupData(Function1<? super Group_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Group_dataKt.Dsl.Companion companion = Group_dataKt.Dsl.INSTANCE;
        info.Group_data.Builder builderNewBuilder = info.Group_data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        Group_dataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: infoKt.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt;", "", "<init>", "()V", "tag", "Lcom/yhchat/canarys/proto/group/info$Group_data$Tag;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$TagKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializetag", "Dsl", "TagKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Group_dataKt {
        public static final int $stable = 0;
        public static final Group_dataKt INSTANCE = new Group_dataKt();

        /* compiled from: infoKt.kt */
        @Metadata(m168d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0007\u0018\u0000 \u009d\u00012\u00020\u0001:\b\u009d\u0001\u009e\u0001\u009f\u0001\u00a0\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0010J\u0006\u00106\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0010J\u0006\u0010>\u001a\u00020\u0010J\u0006\u0010B\u001a\u00020\u0010J\u0006\u0010F\u001a\u00020\u0010J\u0006\u0010J\u001a\u00020\u0010J\u0006\u0010N\u001a\u00020\u0010J\u0006\u0010R\u001a\u00020\u0010J\u0006\u0010V\u001a\u00020\u0010J%\u0010\\\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020Y0X2\u0006\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\b]J&\u0010^\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020Y0X2\u0006\u0010\b\u001a\u00020\tH\u0087\n\u00a2\u0006\u0002\b_J+\u0010`\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020Y0X2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\t0bH\u0007\u00a2\u0006\u0002\bcJ,\u0010^\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020Y0X2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\t0bH\u0087\n\u00a2\u0006\u0002\bdJ.\u0010e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020Y0X2\u0006\u0010f\u001a\u00020,2\u0006\u0010\b\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0002\bgJ\u001d\u0010h\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020Y0XH\u0007\u00a2\u0006\u0002\biJ\u0006\u0010m\u001a\u00020\u0010J\u0006\u0010q\u001a\u00020\u0010J\u0006\u0010u\u001a\u00020\u0010J%\u0010\\\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w0X2\u0006\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\byJ&\u0010^\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w0X2\u0006\u0010\b\u001a\u00020\tH\u0087\n\u00a2\u0006\u0002\bzJ+\u0010`\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w0X2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\t0bH\u0007\u00a2\u0006\u0002\b{J,\u0010^\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w0X2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\t0bH\u0087\n\u00a2\u0006\u0002\b|J.\u0010e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w0X2\u0006\u0010f\u001a\u00020,2\u0006\u0010\b\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0002\b}J\u001d\u0010h\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w0XH\u0007\u00a2\u0006\u0002\b~J)\u0010\\\u001a\u00020\u0010*\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010X2\u0007\u0010\b\u001a\u00030\u0080\u0001H\u0007\u00a2\u0006\u0003\b\u0083\u0001J*\u0010^\u001a\u00020\u0010*\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010X2\u0007\u0010\b\u001a\u00030\u0080\u0001H\u0087\n\u00a2\u0006\u0003\b\u0084\u0001J/\u0010`\u001a\u00020\u0010*\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010X2\r\u0010a\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010bH\u0007\u00a2\u0006\u0003\b\u0085\u0001J0\u0010^\u001a\u00020\u0010*\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010X2\r\u0010a\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010bH\u0087\n\u00a2\u0006\u0003\b\u0086\u0001J2\u0010e\u001a\u00020\u0010*\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010X2\u0006\u0010f\u001a\u00020,2\u0007\u0010\b\u001a\u00030\u0080\u0001H\u0087\u0002\u00a2\u0006\u0003\b\u0087\u0001J \u0010h\u001a\u00020\u0010*\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010XH\u0007\u00a2\u0006\u0003\b\u0088\u0001J\u0007\u0010\u008c\u0001\u001a\u00020\u0010J\u0007\u0010\u0090\u0001\u001a\u00020\u0010J\u0007\u0010\u0094\u0001\u001a\u00020\u0010J\u0007\u0010\u0098\u0001\u001a\u00020\u0010J\u0007\u0010\u009c\u0001\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR$\u0010$\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR$\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR$\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R$\u00107\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b8\u0010/\"\u0004\b9\u00101R$\u0010;\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b<\u0010\f\"\u0004\b=\u0010\u000eR$\u0010?\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b@\u0010\u001c\"\u0004\bA\u0010\u001eR$\u0010C\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bD\u0010/\"\u0004\bE\u00101R$\u0010G\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bH\u0010/\"\u0004\bI\u00101R$\u0010K\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010\u001c\"\u0004\bM\u0010\u001eR$\u0010O\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bP\u0010\f\"\u0004\bQ\u0010\u000eR$\u0010S\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bT\u0010/\"\u0004\bU\u00101R\u001d\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020Y0X8F\u00a2\u0006\u0006\u001a\u0004\bZ\u0010[R$\u0010j\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bk\u0010\f\"\u0004\bl\u0010\u000eR$\u0010n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bo\u0010\f\"\u0004\bp\u0010\u000eR$\u0010r\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bs\u0010/\"\u0004\bt\u00101R\u001d\u0010v\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020w0X8F\u00a2\u0006\u0006\u001a\u0004\bx\u0010[R \u0010\u007f\u001a\u0010\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0005\u0012\u00030\u0081\u00010X8F\u00a2\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010[R'\u0010\u0089\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008a\u0001\u0010\f\"\u0005\b\u008b\u0001\u0010\u000eR'\u0010\u008d\u0001\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010\f\"\u0005\b\u008f\u0001\u0010\u000eR'\u0010\u0091\u0001\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0092\u0001\u0010\u001c\"\u0005\b\u0093\u0001\u0010\u001eR'\u0010\u0095\u0001\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0096\u0001\u0010\u001c\"\u0005\b\u0097\u0001\u0010\u001eR'\u0010\u0099\u0001\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009a\u0001\u0010\u001c\"\u0005\b\u009b\u0001\u0010\u001e\u00a8\u0006\u00a1\u0001"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/info$Group_data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/info$Group_data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/info$Group_data;", "value", "", "groupId", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "clearGroupId", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "", "avatarId", "getAvatarId", "()J", "setAvatarId", "(J)V", "clearAvatarId", "introduction", "getIntroduction", "setIntroduction", "clearIntroduction", "member", "getMember", "setMember", "clearMember", "createBy", "getCreateBy", "setCreateBy", "clearCreateBy", "", "directJoin", "getDirectJoin", "()I", "setDirectJoin", "(I)V", "clearDirectJoin", "permissonLevel", "getPermissonLevel", "setPermissonLevel", "clearPermissonLevel", "historyMsg", "getHistoryMsg", "setHistoryMsg", "clearHistoryMsg", "categoryName", "getCategoryName", "setCategoryName", "clearCategoryName", "categoryId", "getCategoryId", "setCategoryId", "clearCategoryId", "private", "getPrivate", "setPrivate", "clearPrivate", "doNotDisturb", "getDoNotDisturb", "setDoNotDisturb", "clearDoNotDisturb", "communityId", "getCommunityId", "setCommunityId", "clearCommunityId", "communityName", "getCommunityName", "setCommunityName", "clearCommunityName", "top", "getTop", "setTop", "clearTop", "admin", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl$AdminProxy;", "getAdmin", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addAdmin", "plusAssign", "plusAssignAdmin", "addAll", "values", "", "addAllAdmin", "plusAssignAllAdmin", "set", "index", "setAdmin", "clear", "clearAdmin", "limitedMsgType", "getLimitedMsgType", "setLimitedMsgType", "clearLimitedMsgType", "owner", "getOwner", "setOwner", "clearOwner", "recommandation", "getRecommandation", "setRecommandation", "clearRecommandation", "tagOld", "Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl$TagOldProxy;", "getTagOld", "addTagOld", "plusAssignTagOld", "addAllTagOld", "plusAssignAllTagOld", "setTagOld", "clearTagOld", "tag", "Lcom/yhchat/canarys/proto/group/info$Group_data$Tag;", "Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl$TagProxy;", "getTag", "addTag", "plusAssignTag", "addAllTag", "plusAssignAllTag", "setTag", "clearTag", "myGroupNickname", "getMyGroupNickname", "setMyGroupNickname", "clearMyGroupNickname", "groupCode", "getGroupCode", "setGroupCode", "clearGroupCode", "hideGroupMembers", "getHideGroupMembers", "setHideGroupMembers", "clearHideGroupMembers", "autoDeleteMessage", "getAutoDeleteMessage", "setAutoDeleteMessage", "clearAutoDeleteMessage", "denyMembersUploadToGroupDisk", "getDenyMembersUploadToGroupDisk", "setDenyMembersUploadToGroupDisk", "clearDenyMembersUploadToGroupDisk", "Companion", "AdminProxy", "TagOldProxy", "TagProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final info.Group_data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(info.Group_data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(info.Group_data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: infoKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/info$Group_data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(info.Group_data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ info.Group_data _build() {
                info.Group_data group_dataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(group_dataBuild, "build(...)");
                return group_dataBuild;
            }

            public final String getGroupId() {
                String groupId = this._builder.getGroupId();
                Intrinsics.checkNotNullExpressionValue(groupId, "getGroupId(...)");
                return groupId;
            }

            public final void setGroupId(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setGroupId(value);
            }

            public final void clearGroupId() {
                this._builder.clearGroupId();
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

            public final long getMember() {
                return this._builder.getMember();
            }

            public final void setMember(long value) {
                this._builder.setMember(value);
            }

            public final void clearMember() {
                this._builder.clearMember();
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

            public final int getDirectJoin() {
                return this._builder.getDirectJoin();
            }

            public final void setDirectJoin(int value) {
                this._builder.setDirectJoin(value);
            }

            public final void clearDirectJoin() {
                this._builder.clearDirectJoin();
            }

            public final int getPermissonLevel() {
                return this._builder.getPermissonLevel();
            }

            public final void setPermissonLevel(int value) {
                this._builder.setPermissonLevel(value);
            }

            public final void clearPermissonLevel() {
                this._builder.clearPermissonLevel();
            }

            public final int getHistoryMsg() {
                return this._builder.getHistoryMsg();
            }

            public final void setHistoryMsg(int value) {
                this._builder.setHistoryMsg(value);
            }

            public final void clearHistoryMsg() {
                this._builder.clearHistoryMsg();
            }

            public final String getCategoryName() {
                String categoryName = this._builder.getCategoryName();
                Intrinsics.checkNotNullExpressionValue(categoryName, "getCategoryName(...)");
                return categoryName;
            }

            public final void setCategoryName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCategoryName(value);
            }

            public final void clearCategoryName() {
                this._builder.clearCategoryName();
            }

            public final long getCategoryId() {
                return this._builder.getCategoryId();
            }

            public final void setCategoryId(long value) {
                this._builder.setCategoryId(value);
            }

            public final void clearCategoryId() {
                this._builder.clearCategoryId();
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

            public final int getDoNotDisturb() {
                return this._builder.getDoNotDisturb();
            }

            public final void setDoNotDisturb(int value) {
                this._builder.setDoNotDisturb(value);
            }

            public final void clearDoNotDisturb() {
                this._builder.clearDoNotDisturb();
            }

            public final long getCommunityId() {
                return this._builder.getCommunityId();
            }

            public final void setCommunityId(long value) {
                this._builder.setCommunityId(value);
            }

            public final void clearCommunityId() {
                this._builder.clearCommunityId();
            }

            public final String getCommunityName() {
                String communityName = this._builder.getCommunityName();
                Intrinsics.checkNotNullExpressionValue(communityName, "getCommunityName(...)");
                return communityName;
            }

            public final void setCommunityName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCommunityName(value);
            }

            public final void clearCommunityName() {
                this._builder.clearCommunityName();
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

            /* compiled from: infoKt.kt */
            @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl$AdminProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class AdminProxy extends DslProxy {
                public static final int $stable = 8;

                private AdminProxy() {
                }
            }

            public final DslList<String, AdminProxy> getAdmin() {
                List<String> adminList = this._builder.getAdminList();
                Intrinsics.checkNotNullExpressionValue(adminList, "getAdminList(...)");
                return new DslList<>(adminList);
            }

            public final /* synthetic */ void addAdmin(DslList $this$add, String value) {
                Intrinsics.checkNotNullParameter($this$add, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addAdmin(value);
            }

            public final /* synthetic */ void plusAssignAdmin(DslList<String, AdminProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addAdmin(dslList, value);
            }

            public final /* synthetic */ void addAllAdmin(DslList $this$addAll, Iterable values) {
                Intrinsics.checkNotNullParameter($this$addAll, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllAdmin(values);
            }

            public final /* synthetic */ void plusAssignAllAdmin(DslList<String, AdminProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllAdmin(dslList, values);
            }

            public final /* synthetic */ void setAdmin(DslList $this$set, int index, String value) {
                Intrinsics.checkNotNullParameter($this$set, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAdmin(index, value);
            }

            public final /* synthetic */ void clearAdmin(DslList $this$clear) {
                Intrinsics.checkNotNullParameter($this$clear, "<this>");
                this._builder.clearAdmin();
            }

            public final String getLimitedMsgType() {
                String limitedMsgType = this._builder.getLimitedMsgType();
                Intrinsics.checkNotNullExpressionValue(limitedMsgType, "getLimitedMsgType(...)");
                return limitedMsgType;
            }

            public final void setLimitedMsgType(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setLimitedMsgType(value);
            }

            public final void clearLimitedMsgType() {
                this._builder.clearLimitedMsgType();
            }

            public final String getOwner() {
                String owner = this._builder.getOwner();
                Intrinsics.checkNotNullExpressionValue(owner, "getOwner(...)");
                return owner;
            }

            public final void setOwner(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setOwner(value);
            }

            public final void clearOwner() {
                this._builder.clearOwner();
            }

            public final int getRecommandation() {
                return this._builder.getRecommandation();
            }

            public final void setRecommandation(int value) {
                this._builder.setRecommandation(value);
            }

            public final void clearRecommandation() {
                this._builder.clearRecommandation();
            }

            /* compiled from: infoKt.kt */
            @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl$TagOldProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class TagOldProxy extends DslProxy {
                public static final int $stable = 8;

                private TagOldProxy() {
                }
            }

            public final DslList<String, TagOldProxy> getTagOld() {
                List<String> tagOldList = this._builder.getTagOldList();
                Intrinsics.checkNotNullExpressionValue(tagOldList, "getTagOldList(...)");
                return new DslList<>(tagOldList);
            }

            public final /* synthetic */ void addTagOld(DslList $this$add, String value) {
                Intrinsics.checkNotNullParameter($this$add, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addTagOld(value);
            }

            public final /* synthetic */ void plusAssignTagOld(DslList<String, TagOldProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addTagOld(dslList, value);
            }

            public final /* synthetic */ void addAllTagOld(DslList $this$addAll, Iterable values) {
                Intrinsics.checkNotNullParameter($this$addAll, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllTagOld(values);
            }

            public final /* synthetic */ void plusAssignAllTagOld(DslList<String, TagOldProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllTagOld(dslList, values);
            }

            public final /* synthetic */ void setTagOld(DslList $this$set, int index, String value) {
                Intrinsics.checkNotNullParameter($this$set, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTagOld(index, value);
            }

            public final /* synthetic */ void clearTagOld(DslList $this$clear) {
                Intrinsics.checkNotNullParameter($this$clear, "<this>");
                this._builder.clearTagOld();
            }

            /* compiled from: infoKt.kt */
            @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl$TagProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class TagProxy extends DslProxy {
                public static final int $stable = 8;

                private TagProxy() {
                }
            }

            public final /* synthetic */ DslList getTag() {
                List<info.Group_data.Tag> tagList = this._builder.getTagList();
                Intrinsics.checkNotNullExpressionValue(tagList, "getTagList(...)");
                return new DslList(tagList);
            }

            public final /* synthetic */ void addTag(DslList $this$add, info.Group_data.Tag value) {
                Intrinsics.checkNotNullParameter($this$add, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addTag(value);
            }

            public final /* synthetic */ void plusAssignTag(DslList<info.Group_data.Tag, TagProxy> dslList, info.Group_data.Tag value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addTag(dslList, value);
            }

            public final /* synthetic */ void addAllTag(DslList $this$addAll, Iterable values) {
                Intrinsics.checkNotNullParameter($this$addAll, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllTag(values);
            }

            public final /* synthetic */ void plusAssignAllTag(DslList<info.Group_data.Tag, TagProxy> dslList, Iterable<info.Group_data.Tag> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllTag(dslList, values);
            }

            public final /* synthetic */ void setTag(DslList $this$set, int index, info.Group_data.Tag value) {
                Intrinsics.checkNotNullParameter($this$set, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTag(index, value);
            }

            public final /* synthetic */ void clearTag(DslList $this$clear) {
                Intrinsics.checkNotNullParameter($this$clear, "<this>");
                this._builder.clearTag();
            }

            public final String getMyGroupNickname() {
                String myGroupNickname = this._builder.getMyGroupNickname();
                Intrinsics.checkNotNullExpressionValue(myGroupNickname, "getMyGroupNickname(...)");
                return myGroupNickname;
            }

            public final void setMyGroupNickname(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setMyGroupNickname(value);
            }

            public final void clearMyGroupNickname() {
                this._builder.clearMyGroupNickname();
            }

            public final String getGroupCode() {
                String groupCode = this._builder.getGroupCode();
                Intrinsics.checkNotNullExpressionValue(groupCode, "getGroupCode(...)");
                return groupCode;
            }

            public final void setGroupCode(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setGroupCode(value);
            }

            public final void clearGroupCode() {
                this._builder.clearGroupCode();
            }

            public final long getHideGroupMembers() {
                return this._builder.getHideGroupMembers();
            }

            public final void setHideGroupMembers(long value) {
                this._builder.setHideGroupMembers(value);
            }

            public final void clearHideGroupMembers() {
                this._builder.clearHideGroupMembers();
            }

            public final long getAutoDeleteMessage() {
                return this._builder.getAutoDeleteMessage();
            }

            public final void setAutoDeleteMessage(long value) {
                this._builder.setAutoDeleteMessage(value);
            }

            public final void clearAutoDeleteMessage() {
                this._builder.clearAutoDeleteMessage();
            }

            public final long getDenyMembersUploadToGroupDisk() {
                return this._builder.getDenyMembersUploadToGroupDisk();
            }

            public final void setDenyMembersUploadToGroupDisk(long value) {
                this._builder.setDenyMembersUploadToGroupDisk(value);
            }

            public final void clearDenyMembersUploadToGroupDisk() {
                this._builder.clearDenyMembersUploadToGroupDisk();
            }
        }

        private Group_dataKt() {
        }

        /* renamed from: -initializetag, reason: not valid java name */
        public final info.Group_data.Tag m9801initializetag(Function1<? super TagKt.Dsl, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            TagKt.Dsl.Companion companion = TagKt.Dsl.INSTANCE;
            info.Group_data.Tag.Builder builderNewBuilder = info.Group_data.Tag.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
            TagKt.Dsl dsl_create = companion._create(builderNewBuilder);
            block.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: infoKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$TagKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class TagKt {
            public static final int $stable = 0;
            public static final TagKt INSTANCE = new TagKt();

            /* compiled from: infoKt.kt */
            @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$TagKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/info$Group_data$Tag$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/info$Group_data$Tag$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/info$Group_data$Tag;", "value", "", Name.MARK, "getId", "()J", "setId", "(J)V", "clearId", "", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "clearText", "color", "getColor", "setColor", "clearColor", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Dsl {
                private final info.Group_data.Tag.Builder _builder;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final int $stable = 8;

                public /* synthetic */ Dsl(info.Group_data.Tag.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                    this(builder);
                }

                private Dsl(info.Group_data.Tag.Builder _builder) {
                    this._builder = _builder;
                }

                /* compiled from: infoKt.kt */
                @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$TagKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$TagKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/info$Group_data$Tag$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(info.Group_data.Tag.Builder builder) {
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new Dsl(builder, null);
                    }
                }

                public final /* synthetic */ info.Group_data.Tag _build() {
                    info.Group_data.Tag tagBuild = this._builder.build();
                    Intrinsics.checkNotNullExpressionValue(tagBuild, "build(...)");
                    return tagBuild;
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

                public final String getText() {
                    String text = this._builder.getText();
                    Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                    return text;
                }

                public final void setText(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setText(value);
                }

                public final void clearText() {
                    this._builder.clearText();
                }

                public final String getColor() {
                    String color = this._builder.getColor();
                    Intrinsics.checkNotNullExpressionValue(color, "getColor(...)");
                    return color;
                }

                public final void setColor(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setColor(value);
                }

                public final void clearColor() {
                    this._builder.clearColor();
                }
            }

            private TagKt() {
            }
        }
    }
}
