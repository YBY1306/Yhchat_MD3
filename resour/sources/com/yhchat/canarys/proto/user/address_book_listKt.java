package com.yhchat.canarys.proto.user;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.user.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: address_book_listKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt;", "", "<init>", "()V", "data", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedata", "Dsl", "DataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class address_book_listKt {
    public static final int $stable = 0;
    public static final address_book_listKt INSTANCE = new address_book_listKt();

    /* compiled from: address_book_listKt.kt */
    @Metadata(m168d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002+,B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J%\u0010\u001c\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0007\u00a2\u0006\u0002\b\u001dJ&\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0087\n\u00a2\u0006\u0002\b\u001fJ+\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0007\u00a2\u0006\u0002\b#J,\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0087\n\u00a2\u0006\u0002\b$J.\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0018H\u0087\u0002\u00a2\u0006\u0002\b(J\u001d\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0007\u00a2\u0006\u0002\b*R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006-"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$address_book_list$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$address_book_list;", "value", "Lcom/yhchat/canarys/proto/user/User$Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/user/User$Status;", "setStatus", "(Lcom/yhchat/canarys/proto/user/User$Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/user/address_book_listKt$Dsl;)Lcom/yhchat/canarys/proto/user/User$Status;", "data", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data;", "Lcom/yhchat/canarys/proto/user/address_book_listKt$Dsl$DataProxy;", "getData", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addData", "plusAssign", "plusAssignData", "addAll", "values", "", "addAllData", "plusAssignAllData", "set", "index", "", "setData", "clear", "clearData", "Companion", "DataProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final User.address_book_list.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(User.address_book_list.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(User.address_book_list.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: address_book_listKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/address_book_listKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(User.address_book_list.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ User.address_book_list _build() {
            User.address_book_list address_book_listVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(address_book_listVarBuild, "build(...)");
            return address_book_listVarBuild;
        }

        public final User.Status getStatus() {
            User.Status status = this._builder.getStatus();
            Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
            return status;
        }

        public final void setStatus(User.Status value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStatus(value);
        }

        public final void clearStatus() {
            this._builder.clearStatus();
        }

        public final boolean hasStatus() {
            return this._builder.hasStatus();
        }

        public final User.Status getStatusOrNull(Dsl $this$statusOrNull) {
            Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
            return Address_book_listKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        /* compiled from: address_book_listKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt$Dsl$DataProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class DataProxy extends DslProxy {
            public static final int $stable = 8;

            private DataProxy() {
            }
        }

        public final /* synthetic */ DslList getData() {
            List<User.address_book_list.Data> dataList = this._builder.getDataList();
            Intrinsics.checkNotNullExpressionValue(dataList, "getDataList(...)");
            return new DslList(dataList);
        }

        public final /* synthetic */ void addData(DslList $this$add, User.address_book_list.Data value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addData(value);
        }

        public final /* synthetic */ void plusAssignData(DslList<User.address_book_list.Data, DataProxy> dslList, User.address_book_list.Data value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addData(dslList, value);
        }

        public final /* synthetic */ void addAllData(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllData(values);
        }

        public final /* synthetic */ void plusAssignAllData(DslList<User.address_book_list.Data, DataProxy> dslList, Iterable<User.address_book_list.Data> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllData(dslList, values);
        }

        public final /* synthetic */ void setData(DslList $this$set, int index, User.address_book_list.Data value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(index, value);
        }

        public final /* synthetic */ void clearData(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearData();
        }
    }

    private address_book_listKt() {
    }

    /* renamed from: -initializedata, reason: not valid java name */
    public final User.address_book_list.Data m10350initializedata(Function1<? super DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DataKt.Dsl.Companion companion = DataKt.Dsl.INSTANCE;
        User.address_book_list.Data.Builder builderNewBuilder = User.address_book_list.Data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        DataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: address_book_listKt.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt;", "", "<init>", "()V", "dataList", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Data_list;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Data_listKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedataList", "Dsl", "Data_listKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class DataKt {
        public static final int $stable = 0;
        public static final DataKt INSTANCE = new DataKt();

        /* compiled from: address_book_listKt.kt */
        @Metadata(m168d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002&'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J%\u0010\u0017\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\b\u001a\u00020\u0013H\u0007\u00a2\u0006\u0002\b\u0018J&\u0010\u0019\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\b\u001a\u00020\u0013H\u0087\n\u00a2\u0006\u0002\b\u001aJ+\u0010\u001b\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0007\u00a2\u0006\u0002\b\u001eJ,\u0010\u0019\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00130\u001dH\u0087\n\u00a2\u0006\u0002\b\u001fJ.\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010!\u001a\u00020\"2\u0006\u0010\b\u001a\u00020\u0013H\u0087\u0002\u00a2\u0006\u0002\b#J\u001d\u0010$\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0007\u00a2\u0006\u0002\b%R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data;", "value", "", "listName", "getListName", "()Ljava/lang/String;", "setListName", "(Ljava/lang/String;)V", "clearListName", "", "data", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Data_list;", "Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Dsl$DataProxy;", "getData", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addData", "plusAssign", "plusAssignData", "addAll", "values", "", "addAllData", "plusAssignAllData", "set", "index", "", "setData", "clear", "clearData", "Companion", "DataProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final User.address_book_list.Data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(User.address_book_list.Data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(User.address_book_list.Data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: address_book_listKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(User.address_book_list.Data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ User.address_book_list.Data _build() {
                User.address_book_list.Data dataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
                return dataBuild;
            }

            public final String getListName() {
                String listName = this._builder.getListName();
                Intrinsics.checkNotNullExpressionValue(listName, "getListName(...)");
                return listName;
            }

            public final void setListName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setListName(value);
            }

            public final void clearListName() {
                this._builder.clearListName();
            }

            /* compiled from: address_book_listKt.kt */
            @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Dsl$DataProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class DataProxy extends DslProxy {
                public static final int $stable = 8;

                private DataProxy() {
                }
            }

            public final /* synthetic */ DslList getData() {
                List<User.address_book_list.Data.Data_list> dataList = this._builder.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList, "getDataList(...)");
                return new DslList(dataList);
            }

            public final /* synthetic */ void addData(DslList $this$add, User.address_book_list.Data.Data_list value) {
                Intrinsics.checkNotNullParameter($this$add, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addData(value);
            }

            public final /* synthetic */ void plusAssignData(DslList<User.address_book_list.Data.Data_list, DataProxy> dslList, User.address_book_list.Data.Data_list value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addData(dslList, value);
            }

            public final /* synthetic */ void addAllData(DslList $this$addAll, Iterable values) {
                Intrinsics.checkNotNullParameter($this$addAll, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllData(values);
            }

            public final /* synthetic */ void plusAssignAllData(DslList<User.address_book_list.Data.Data_list, DataProxy> dslList, Iterable<User.address_book_list.Data.Data_list> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllData(dslList, values);
            }

            public final /* synthetic */ void setData(DslList $this$set, int index, User.address_book_list.Data.Data_list value) {
                Intrinsics.checkNotNullParameter($this$set, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setData(index, value);
            }

            public final /* synthetic */ void clearData(DslList $this$clear) {
                Intrinsics.checkNotNullParameter($this$clear, "<this>");
                this._builder.clearData();
            }
        }

        private DataKt() {
        }

        /* renamed from: -initializedataList, reason: not valid java name */
        public final User.address_book_list.Data.Data_list m10351initializedataList(Function1<? super Data_listKt.Dsl, Unit> block) {
            Intrinsics.checkNotNullParameter(block, "block");
            Data_listKt.Dsl.Companion companion = Data_listKt.Dsl.INSTANCE;
            User.address_book_list.Data.Data_list.Builder builderNewBuilder = User.address_book_list.Data.Data_list.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
            Data_listKt.Dsl dsl_create = companion._create(builderNewBuilder);
            block.invoke(dsl_create);
            return dsl_create._build();
        }

        /* compiled from: address_book_listKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Data_listKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Data_listKt {
            public static final int $stable = 0;
            public static final Data_listKt INSTANCE = new Data_listKt();

            /* compiled from: address_book_listKt.kt */
            @Metadata(m168d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00020 8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Data_listKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Data_list$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Data_list$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Data_list;", "value", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "clearChatId", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "", "permissonLevel", "getPermissonLevel", "()I", "setPermissonLevel", "(I)V", "clearPermissonLevel", "", "noDisturb", "getNoDisturb", "()Z", "setNoDisturb", "(Z)V", "clearNoDisturb", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Dsl {
                private final User.address_book_list.Data.Data_list.Builder _builder;

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final int $stable = 8;

                public /* synthetic */ Dsl(User.address_book_list.Data.Data_list.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                    this(builder);
                }

                private Dsl(User.address_book_list.Data.Data_list.Builder _builder) {
                    this._builder = _builder;
                }

                /* compiled from: address_book_listKt.kt */
                @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Data_listKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Data_listKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Data_list$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
                public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    private Companion() {
                    }

                    public final /* synthetic */ Dsl _create(User.address_book_list.Data.Data_list.Builder builder) {
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        return new Dsl(builder, null);
                    }
                }

                public final /* synthetic */ User.address_book_list.Data.Data_list _build() {
                    User.address_book_list.Data.Data_list data_listBuild = this._builder.build();
                    Intrinsics.checkNotNullExpressionValue(data_listBuild, "build(...)");
                    return data_listBuild;
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

                public final int getPermissonLevel() {
                    return this._builder.getPermissonLevel();
                }

                public final void setPermissonLevel(int value) {
                    this._builder.setPermissonLevel(value);
                }

                public final void clearPermissonLevel() {
                    this._builder.clearPermissonLevel();
                }

                public final boolean getNoDisturb() {
                    return this._builder.getNoDisturb();
                }

                public final void setNoDisturb(boolean value) {
                    this._builder.setNoDisturb(value);
                }

                public final void clearNoDisturb() {
                    this._builder.clearNoDisturb();
                }
            }

            private Data_listKt() {
            }
        }
    }
}
