package com.yhchat.canarys.proto.conversation;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.conversation.Conversation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationListKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/ConversationListKt;", "", "<init>", "()V", "conversationData", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeconversationData", "Dsl", "ConversationDataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ConversationListKt {
    public static final int $stable = 0;
    public static final ConversationListKt INSTANCE = new ConversationListKt();

    /* compiled from: ConversationListKt.kt */
    @Metadata(m168d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u0000 82\u00020\u0001:\u000289B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J%\u0010\u001c\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0007\u00a2\u0006\u0002\b\u001dJ&\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0087\n\u00a2\u0006\u0002\b\u001fJ+\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0007\u00a2\u0006\u0002\b#J,\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0087\n\u00a2\u0006\u0002\b$J.\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0018H\u0087\u0002\u00a2\u0006\u0002\b(J\u001d\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0007\u00a2\u0006\u0002\b*J\u0006\u00100\u001a\u00020\u0010J\u0006\u00107\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010+\u001a\u00020'2\u0006\u0010\b\u001a\u00020'8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00102\u001a\u0002012\u0006\u0010\b\u001a\u0002018G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u00a8\u0006:"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/ConversationListKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList;", "value", "Lcom/yhchat/canarys/proto/conversation/Conversation$Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/conversation/Conversation$Status;", "setStatus", "(Lcom/yhchat/canarys/proto/conversation/Conversation$Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/conversation/ConversationListKt$Dsl;)Lcom/yhchat/canarys/proto/conversation/Conversation$Status;", "data", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData;", "Lcom/yhchat/canarys/proto/conversation/ConversationListKt$Dsl$DataProxy;", "getData", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addData", "plusAssign", "plusAssignData", "addAll", "values", "", "addAllData", "plusAssignAllData", "set", "index", "", "setData", "clear", "clearData", "total", "getTotal", "()I", "setTotal", "(I)V", "clearTotal", "", "requestId", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "clearRequestId", "Companion", "DataProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final Conversation.ConversationList.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(Conversation.ConversationList.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(Conversation.ConversationList.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: ConversationListKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/ConversationListKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/conversation/ConversationListKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Conversation.ConversationList.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ Conversation.ConversationList _build() {
            Conversation.ConversationList conversationListBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(conversationListBuild, "build(...)");
            return conversationListBuild;
        }

        public final Conversation.Status getStatus() {
            Conversation.Status status = this._builder.getStatus();
            Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
            return status;
        }

        public final void setStatus(Conversation.Status value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStatus(value);
        }

        public final void clearStatus() {
            this._builder.clearStatus();
        }

        public final boolean hasStatus() {
            return this._builder.hasStatus();
        }

        public final Conversation.Status getStatusOrNull(Dsl $this$statusOrNull) {
            Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
            return ConversationListKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        /* compiled from: ConversationListKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/ConversationListKt$Dsl$DataProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class DataProxy extends DslProxy {
            public static final int $stable = 8;

            private DataProxy() {
            }
        }

        public final /* synthetic */ DslList getData() {
            List<Conversation.ConversationList.ConversationData> dataList = this._builder.getDataList();
            Intrinsics.checkNotNullExpressionValue(dataList, "getDataList(...)");
            return new DslList(dataList);
        }

        public final /* synthetic */ void addData(DslList $this$add, Conversation.ConversationList.ConversationData value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addData(value);
        }

        public final /* synthetic */ void plusAssignData(DslList<Conversation.ConversationList.ConversationData, DataProxy> dslList, Conversation.ConversationList.ConversationData value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addData(dslList, value);
        }

        public final /* synthetic */ void addAllData(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllData(values);
        }

        public final /* synthetic */ void plusAssignAllData(DslList<Conversation.ConversationList.ConversationData, DataProxy> dslList, Iterable<Conversation.ConversationList.ConversationData> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllData(dslList, values);
        }

        public final /* synthetic */ void setData(DslList $this$set, int index, Conversation.ConversationList.ConversationData value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(index, value);
        }

        public final /* synthetic */ void clearData(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearData();
        }

        public final int getTotal() {
            return this._builder.getTotal();
        }

        public final void setTotal(int value) {
            this._builder.setTotal(value);
        }

        public final void clearTotal() {
            this._builder.clearTotal();
        }

        public final String getRequestId() {
            String requestId = this._builder.getRequestId();
            Intrinsics.checkNotNullExpressionValue(requestId, "getRequestId(...)");
            return requestId;
        }

        public final void setRequestId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRequestId(value);
        }

        public final void clearRequestId() {
            this._builder.clearRequestId();
        }
    }

    private ConversationListKt() {
    }

    /* renamed from: -initializeconversationData, reason: not valid java name */
    public final Conversation.ConversationList.ConversationData m9375initializeconversationData(Function1<? super ConversationDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ConversationDataKt.Dsl.Companion companion = ConversationDataKt.Dsl.INSTANCE;
        Conversation.ConversationList.ConversationData.Builder builderNewBuilder = Conversation.ConversationList.ConversationData.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        ConversationDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: ConversationListKt.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt;", "", "<init>", "()V", "atData", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$AtDataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeatData", "Dsl", "AtDataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class ConversationDataKt {
        public static final int $stable = 0;
        public static final ConversationDataKt INSTANCE = new ConversationDataKt();

        /* compiled from: ConversationListKt.kt */
        @Metadata(m168d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 O2\u00020\u0001:\u0001OB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0010J\u0006\u00106\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0010J\u0006\u0010>\u001a\u00020\u0010J\u0006\u0010E\u001a\u00020\u0010J\u0006\u0010F\u001a\u00020GJ\u0006\u0010N\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010'\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0016R$\u0010+\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\u0014\"\u0004\b-\u0010\u0016R$\u0010/\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010#\"\u0004\b1\u0010%R$\u00103\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR$\u00107\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b8\u0010\u0014\"\u0004\b9\u0010\u0016R$\u0010;\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b<\u0010#\"\u0004\b=\u0010%R$\u0010@\u001a\u00020?2\u0006\u0010\b\u001a\u00020?8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0017\u0010H\u001a\u0004\u0018\u00010?*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\bI\u0010JR$\u0010K\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010\u0014\"\u0004\bM\u0010\u0016\u00a8\u0006P"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData;", "value", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "clearChatId", "", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()I", "setChatType", "(I)V", "clearChatType", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "chatContent", "getChatContent", "setChatContent", "clearChatContent", "", "timestampMs", "getTimestampMs", "()J", "setTimestampMs", "(J)V", "clearTimestampMs", "unreadMessage", "getUnreadMessage", "setUnreadMessage", "clearUnreadMessage", "at", "getAt", "setAt", "clearAt", "avatarId", "getAvatarId", "setAvatarId", "clearAvatarId", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "doNotDisturb", "getDoNotDisturb", "setDoNotDisturb", "clearDoNotDisturb", "timestamp", "getTimestamp", "setTimestamp", "clearTimestamp", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData;", "atData", "getAtData", "()Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData;", "setAtData", "(Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData;)V", "clearAtData", "hasAtData", "", "atDataOrNull", "getAtDataOrNull", "(Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$Dsl;)Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData;", "certificationLevel", "getCertificationLevel", "setCertificationLevel", "clearCertificationLevel", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final Conversation.ConversationList.ConversationData.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(Conversation.ConversationList.ConversationData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(Conversation.ConversationList.ConversationData.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: ConversationListKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Conversation.ConversationList.ConversationData.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ Conversation.ConversationList.ConversationData _build() {
                Conversation.ConversationList.ConversationData conversationDataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(conversationDataBuild, "build(...)");
                return conversationDataBuild;
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

            public final String getChatContent() {
                String chatContent = this._builder.getChatContent();
                Intrinsics.checkNotNullExpressionValue(chatContent, "getChatContent(...)");
                return chatContent;
            }

            public final void setChatContent(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setChatContent(value);
            }

            public final void clearChatContent() {
                this._builder.clearChatContent();
            }

            public final long getTimestampMs() {
                return this._builder.getTimestampMs();
            }

            public final void setTimestampMs(long value) {
                this._builder.setTimestampMs(value);
            }

            public final void clearTimestampMs() {
                this._builder.clearTimestampMs();
            }

            public final int getUnreadMessage() {
                return this._builder.getUnreadMessage();
            }

            public final void setUnreadMessage(int value) {
                this._builder.setUnreadMessage(value);
            }

            public final void clearUnreadMessage() {
                this._builder.clearUnreadMessage();
            }

            public final int getAt() {
                return this._builder.getAt();
            }

            public final void setAt(int value) {
                this._builder.setAt(value);
            }

            public final void clearAt() {
                this._builder.clearAt();
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

            public final int getDoNotDisturb() {
                return this._builder.getDoNotDisturb();
            }

            public final void setDoNotDisturb(int value) {
                this._builder.setDoNotDisturb(value);
            }

            public final void clearDoNotDisturb() {
                this._builder.clearDoNotDisturb();
            }

            public final long getTimestamp() {
                return this._builder.getTimestamp();
            }

            public final void setTimestamp(long value) {
                this._builder.setTimestamp(value);
            }

            public final void clearTimestamp() {
                this._builder.clearTimestamp();
            }

            public final Conversation.ConversationList.ConversationData.AtData getAtData() {
                Conversation.ConversationList.ConversationData.AtData atData = this._builder.getAtData();
                Intrinsics.checkNotNullExpressionValue(atData, "getAtData(...)");
                return atData;
            }

            public final void setAtData(Conversation.ConversationList.ConversationData.AtData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAtData(value);
            }

            public final void clearAtData() {
                this._builder.clearAtData();
            }

            public final boolean hasAtData() {
                return this._builder.hasAtData();
            }

            public final Conversation.ConversationList.ConversationData.AtData getAtDataOrNull(Dsl $this$atDataOrNull) {
                Intrinsics.checkNotNullParameter($this$atDataOrNull, "<this>");
                return ConversationListKtKt.getAtDataOrNull($this$atDataOrNull._builder);
            }

            public final int getCertificationLevel() {
                return this._builder.getCertificationLevel();
            }

            public final void setCertificationLevel(int value) {
                this._builder.setCertificationLevel(value);
            }

            public final void clearCertificationLevel() {
                this._builder.clearCertificationLevel();
            }
        }

        private ConversationDataKt() {
        }

        /* renamed from: -initializeatData, reason: not valid java name */
        public final Conversation.ConversationList.ConversationData.AtData m9376initializeatData(Function1<? super AtDataKt.Dsl, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            AtDataKt.Dsl.Companion companion = AtDataKt.Dsl.INSTANCE;
            Conversation.ConversationList.ConversationData.AtData.Builder builderNewBuilder = Conversation.ConversationList.ConversationData.AtData.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
            AtDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
            block.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: ConversationListKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$AtDataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class AtDataKt {
            public static final int $stable = 0;
            public static final AtDataKt INSTANCE = new AtDataKt();

            /* compiled from: ConversationListKt.kt */
            @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R$\u0010\u001c\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R$\u0010 \u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R$\u0010$\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\u0014\"\u0004\b&\u0010\u0016R$\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000e\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$AtDataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData;", "value", "", EnvironmentCompat.MEDIA_UNKNOWN, "getUnknown", "()J", "setUnknown", "(J)V", "clearUnknown", "", "", "mentionedId", "getMentionedId", "()Ljava/lang/String;", "setMentionedId", "(Ljava/lang/String;)V", "clearMentionedId", "mentionedName", "getMentionedName", "setMentionedName", "clearMentionedName", "mentionedIn", "getMentionedIn", "setMentionedIn", "clearMentionedIn", "mentionerId", "getMentionerId", "setMentionerId", "clearMentionerId", "mentionerName", "getMentionerName", "setMentionerName", "clearMentionerName", "msgSeq", "getMsgSeq", "setMsgSeq", "clearMsgSeq", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Dsl {
                private final Conversation.ConversationList.ConversationData.AtData.Builder _builder;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final int $stable = 8;

                public /* synthetic */ Dsl(Conversation.ConversationList.ConversationData.AtData.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                    this(builder);
                }

                private Dsl(Conversation.ConversationList.ConversationData.AtData.Builder _builder) {
                    this._builder = _builder;
                }

                /* compiled from: ConversationListKt.kt */
                @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$AtDataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$AtDataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(Conversation.ConversationList.ConversationData.AtData.Builder builder) {
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new Dsl(builder, null);
                    }
                }

                public final /* synthetic */ Conversation.ConversationList.ConversationData.AtData _build() {
                    Conversation.ConversationList.ConversationData.AtData atDataBuild = this._builder.build();
                    Intrinsics.checkNotNullExpressionValue(atDataBuild, "build(...)");
                    return atDataBuild;
                }

                public final long getUnknown() {
                    return this._builder.getUnknown();
                }

                public final void setUnknown(long value) {
                    this._builder.setUnknown(value);
                }

                public final void clearUnknown() {
                    this._builder.clearUnknown();
                }

                public final String getMentionedId() {
                    String mentionedId = this._builder.getMentionedId();
                    Intrinsics.checkNotNullExpressionValue(mentionedId, "getMentionedId(...)");
                    return mentionedId;
                }

                public final void setMentionedId(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setMentionedId(value);
                }

                public final void clearMentionedId() {
                    this._builder.clearMentionedId();
                }

                public final String getMentionedName() {
                    String mentionedName = this._builder.getMentionedName();
                    Intrinsics.checkNotNullExpressionValue(mentionedName, "getMentionedName(...)");
                    return mentionedName;
                }

                public final void setMentionedName(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setMentionedName(value);
                }

                public final void clearMentionedName() {
                    this._builder.clearMentionedName();
                }

                public final String getMentionedIn() {
                    String mentionedIn = this._builder.getMentionedIn();
                    Intrinsics.checkNotNullExpressionValue(mentionedIn, "getMentionedIn(...)");
                    return mentionedIn;
                }

                public final void setMentionedIn(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setMentionedIn(value);
                }

                public final void clearMentionedIn() {
                    this._builder.clearMentionedIn();
                }

                public final String getMentionerId() {
                    String mentionerId = this._builder.getMentionerId();
                    Intrinsics.checkNotNullExpressionValue(mentionerId, "getMentionerId(...)");
                    return mentionerId;
                }

                public final void setMentionerId(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setMentionerId(value);
                }

                public final void clearMentionerId() {
                    this._builder.clearMentionerId();
                }

                public final String getMentionerName() {
                    String mentionerName = this._builder.getMentionerName();
                    Intrinsics.checkNotNullExpressionValue(mentionerName, "getMentionerName(...)");
                    return mentionerName;
                }

                public final void setMentionerName(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this._builder.setMentionerName(value);
                }

                public final void clearMentionerName() {
                    this._builder.clearMentionerName();
                }

                public final long getMsgSeq() {
                    return this._builder.getMsgSeq();
                }

                public final void setMsgSeq(long value) {
                    this._builder.setMsgSeq(value);
                }

                public final void clearMsgSeq() {
                    this._builder.clearMsgSeq();
                }
            }

            private AtDataKt() {
            }
        }
    }
}
