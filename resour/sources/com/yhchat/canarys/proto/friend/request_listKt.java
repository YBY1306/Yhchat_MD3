package com.yhchat.canarys.proto.friend;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.proto.friend.FriendProto;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: request_listKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/friend/request_listKt;", "", "<init>", "()V", "request", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list$Request;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/friend/request_listKt$RequestKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializerequest", "Dsl", "RequestKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class request_listKt {
    public static final int $stable = 0;
    public static final request_listKt INSTANCE = new request_listKt();

    /* compiled from: request_listKt.kt */
    @Metadata(m168d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 52\u00020\u0001:\u000256B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J%\u0010\u001c\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0007\u00a2\u0006\u0002\b\u001dJ&\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\b\u001a\u00020\u0018H\u0087\n\u00a2\u0006\u0002\b\u001fJ+\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0007\u00a2\u0006\u0002\b#J,\u0010\u001e\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\"H\u0087\n\u00a2\u0006\u0002\b$J.\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010&\u001a\u00020'2\u0006\u0010\b\u001a\u00020\u0018H\u0087\u0002\u00a2\u0006\u0002\b(J\u001d\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017H\u0007\u00a2\u0006\u0002\b*J\u0006\u00100\u001a\u00020\u0010J\u0006\u00104\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010+\u001a\u00020'2\u0006\u0010\b\u001a\u00020'8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R$\u00101\u001a\u00020'2\u0006\u0010\b\u001a\u00020'8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/\u00a8\u00067"}, m169d2 = {"Lcom/yhchat/canarys/proto/friend/request_listKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/friend/FriendProto$request_list$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list;", "value", "Lcom/yhchat/canarys/proto/friend/FriendProto$Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/friend/FriendProto$Status;", "setStatus", "(Lcom/yhchat/canarys/proto/friend/FriendProto$Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/friend/request_listKt$Dsl;)Lcom/yhchat/canarys/proto/friend/FriendProto$Status;", "requests", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list$Request;", "Lcom/yhchat/canarys/proto/friend/request_listKt$Dsl$RequestsProxy;", "getRequests", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addRequests", "plusAssign", "plusAssignRequests", "addAll", "values", "", "addAllRequests", "plusAssignAllRequests", "set", "index", "", "setRequests", "clear", "clearRequests", "total", "getTotal", "()I", "setTotal", "(I)V", "clearTotal", "pending", "getPending", "setPending", "clearPending", "Companion", "RequestsProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final FriendProto.request_list.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(FriendProto.request_list.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(FriendProto.request_list.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: request_listKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/friend/request_listKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/friend/request_listKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(FriendProto.request_list.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ FriendProto.request_list _build() {
            FriendProto.request_list request_listVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(request_listVarBuild, "build(...)");
            return request_listVarBuild;
        }

        public final FriendProto.Status getStatus() {
            FriendProto.Status status = this._builder.getStatus();
            Intrinsics.checkNotNullExpressionValue(status, "getStatus(...)");
            return status;
        }

        public final void setStatus(FriendProto.Status value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setStatus(value);
        }

        public final void clearStatus() {
            this._builder.clearStatus();
        }

        public final boolean hasStatus() {
            return this._builder.hasStatus();
        }

        public final FriendProto.Status getStatusOrNull(Dsl $this$statusOrNull) {
            Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
            return Request_listKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        /* compiled from: request_listKt.kt */
        @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/friend/request_listKt$Dsl$RequestsProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class RequestsProxy extends DslProxy {
            public static final int $stable = 8;

            private RequestsProxy() {
            }
        }

        public final /* synthetic */ DslList getRequests() {
            List<FriendProto.request_list.Request> requestsList = this._builder.getRequestsList();
            Intrinsics.checkNotNullExpressionValue(requestsList, "getRequestsList(...)");
            return new DslList(requestsList);
        }

        public final /* synthetic */ void addRequests(DslList $this$add, FriendProto.request_list.Request value) {
            Intrinsics.checkNotNullParameter($this$add, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.addRequests(value);
        }

        public final /* synthetic */ void plusAssignRequests(DslList<FriendProto.request_list.Request, RequestsProxy> dslList, FriendProto.request_list.Request value) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            addRequests(dslList, value);
        }

        public final /* synthetic */ void addAllRequests(DslList $this$addAll, Iterable values) {
            Intrinsics.checkNotNullParameter($this$addAll, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            this._builder.addAllRequests(values);
        }

        public final /* synthetic */ void plusAssignAllRequests(DslList<FriendProto.request_list.Request, RequestsProxy> dslList, Iterable<FriendProto.request_list.Request> values) {
            Intrinsics.checkNotNullParameter(dslList, "<this>");
            Intrinsics.checkNotNullParameter(values, "values");
            addAllRequests(dslList, values);
        }

        public final /* synthetic */ void setRequests(DslList $this$set, int index, FriendProto.request_list.Request value) {
            Intrinsics.checkNotNullParameter($this$set, "<this>");
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRequests(index, value);
        }

        public final /* synthetic */ void clearRequests(DslList $this$clear) {
            Intrinsics.checkNotNullParameter($this$clear, "<this>");
            this._builder.clearRequests();
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

        public final int getPending() {
            return this._builder.getPending();
        }

        public final void setPending(int value) {
            this._builder.setPending(value);
        }

        public final void clearPending() {
            this._builder.clearPending();
        }
    }

    private request_listKt() {
    }

    /* renamed from: -initializerequest, reason: not valid java name */
    public final FriendProto.request_list.Request m9490initializerequest(Function1<? super RequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        RequestKt.Dsl.Companion companion = RequestKt.Dsl.INSTANCE;
        FriendProto.request_list.Request.Builder builderNewBuilder = FriendProto.request_list.Request.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        RequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: request_listKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/friend/request_listKt$RequestKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class RequestKt {
        public static final int $stable = 0;
        public static final RequestKt INSTANCE = new RequestKt();

        /* compiled from: request_listKt.kt */
        @Metadata(m168d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b$\b\u0007\u0018\u0000 c2\u00020\u0001:\u0001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00103\u001a\u00020\u0010J\u0006\u00107\u001a\u00020\u0010J\u0006\u0010;\u001a\u00020\u0010J\u0006\u0010?\u001a\u00020\u0010J\u0006\u0010F\u001a\u00020\u0010J\u0006\u0010J\u001a\u00020\u0010J\u0006\u0010N\u001a\u00020\u0010J\u0006\u0010R\u001a\u00020\u0010J\u0006\u0010V\u001a\u00020\u0010J\u0006\u0010Z\u001a\u00020\u0010J\u0006\u0010^\u001a\u00020\u0010J\u0006\u0010b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR$\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR$\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR$\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR$\u0010*\u001a\u00020)2\u0006\u0010\b\u001a\u00020)8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u00100\u001a\u00020)2\u0006\u0010\b\u001a\u00020)8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.R$\u00104\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u0010\f\"\u0004\b6\u0010\u000eR$\u00108\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b9\u0010\f\"\u0004\b:\u0010\u000eR$\u0010<\u001a\u00020)2\u0006\u0010\b\u001a\u00020)8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010,\"\u0004\b>\u0010.R$\u0010A\u001a\u00020@2\u0006\u0010\b\u001a\u00020@8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u00020@2\u0006\u0010\b\u001a\u00020@8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER$\u0010K\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010\f\"\u0004\bM\u0010\u000eR$\u0010O\u001a\u00020)2\u0006\u0010\b\u001a\u00020)8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bP\u0010,\"\u0004\bQ\u0010.R$\u0010S\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bT\u0010\f\"\u0004\bU\u0010\u000eR$\u0010W\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bX\u0010\f\"\u0004\bY\u0010\u000eR$\u0010[\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\\\u0010\f\"\u0004\b]\u0010\u000eR$\u0010_\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b`\u0010\f\"\u0004\ba\u0010\u000e\u00a8\u0006d"}, m169d2 = {"Lcom/yhchat/canarys/proto/friend/request_listKt$RequestKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list$Request$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/friend/FriendProto$request_list$Request$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list$Request;", "value", "", "receiverName", "getReceiverName", "()Ljava/lang/String;", "setReceiverName", "(Ljava/lang/String;)V", "clearReceiverName", "", "receiverAvatar", "getReceiverAvatar", "setReceiverAvatar", "clearReceiverAvatar", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "avatar", "getAvatar", "setAvatar", "clearAvatar", "groupName", "getGroupName", "setGroupName", "clearGroupName", "groupAvatar", "getGroupAvatar", "setGroupAvatar", "clearGroupAvatar", "inviterId", "getInviterId", "setInviterId", "clearInviterId", "", "sourceType", "getSourceType", "()I", "setSourceType", "(I)V", "clearSourceType", "targetType", "getTargetType", "setTargetType", "clearTargetType", "targetId", "getTargetId", "setTargetId", "clearTargetId", "receiverId", "getReceiverId", "setReceiverId", "clearReceiverId", "result", "getResult", "setResult", "clearResult", "", "processedAt", "getProcessedAt", "()J", "setProcessedAt", "(J)V", "clearProcessedAt", "inviteAt", "getInviteAt", "setInviteAt", "clearInviteAt", "inviteAtStr", "getInviteAtStr", "setInviteAtStr", "clearInviteAtStr", "requestId", "getRequestId", "setRequestId", "clearRequestId", "botName", "getBotName", "setBotName", "clearBotName", "botAvatar", "getBotAvatar", "setBotAvatar", "clearBotAvatar", "processorName", "getProcessorName", "setProcessorName", "clearProcessorName", "note", "getNote", "setNote", "clearNote", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final FriendProto.request_list.Request.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(FriendProto.request_list.Request.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(FriendProto.request_list.Request.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: request_listKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/friend/request_listKt$RequestKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/friend/request_listKt$RequestKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list$Request$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(FriendProto.request_list.Request.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ FriendProto.request_list.Request _build() {
                FriendProto.request_list.Request requestBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(requestBuild, "build(...)");
                return requestBuild;
            }

            public final String getReceiverName() {
                String receiverName = this._builder.getReceiverName();
                Intrinsics.checkNotNullExpressionValue(receiverName, "getReceiverName(...)");
                return receiverName;
            }

            public final void setReceiverName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setReceiverName(value);
            }

            public final void clearReceiverName() {
                this._builder.clearReceiverName();
            }

            public final String getReceiverAvatar() {
                String receiverAvatar = this._builder.getReceiverAvatar();
                Intrinsics.checkNotNullExpressionValue(receiverAvatar, "getReceiverAvatar(...)");
                return receiverAvatar;
            }

            public final void setReceiverAvatar(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setReceiverAvatar(value);
            }

            public final void clearReceiverAvatar() {
                this._builder.clearReceiverAvatar();
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

            public final String getAvatar() {
                String avatar = this._builder.getAvatar();
                Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                return avatar;
            }

            public final void setAvatar(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAvatar(value);
            }

            public final void clearAvatar() {
                this._builder.clearAvatar();
            }

            public final String getGroupName() {
                String groupName = this._builder.getGroupName();
                Intrinsics.checkNotNullExpressionValue(groupName, "getGroupName(...)");
                return groupName;
            }

            public final void setGroupName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setGroupName(value);
            }

            public final void clearGroupName() {
                this._builder.clearGroupName();
            }

            public final String getGroupAvatar() {
                String groupAvatar = this._builder.getGroupAvatar();
                Intrinsics.checkNotNullExpressionValue(groupAvatar, "getGroupAvatar(...)");
                return groupAvatar;
            }

            public final void setGroupAvatar(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setGroupAvatar(value);
            }

            public final void clearGroupAvatar() {
                this._builder.clearGroupAvatar();
            }

            public final String getInviterId() {
                String inviterId = this._builder.getInviterId();
                Intrinsics.checkNotNullExpressionValue(inviterId, "getInviterId(...)");
                return inviterId;
            }

            public final void setInviterId(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInviterId(value);
            }

            public final void clearInviterId() {
                this._builder.clearInviterId();
            }

            public final int getSourceType() {
                return this._builder.getSourceType();
            }

            public final void setSourceType(int value) {
                this._builder.setSourceType(value);
            }

            public final void clearSourceType() {
                this._builder.clearSourceType();
            }

            public final int getTargetType() {
                return this._builder.getTargetType();
            }

            public final void setTargetType(int value) {
                this._builder.setTargetType(value);
            }

            public final void clearTargetType() {
                this._builder.clearTargetType();
            }

            public final String getTargetId() {
                String targetId = this._builder.getTargetId();
                Intrinsics.checkNotNullExpressionValue(targetId, "getTargetId(...)");
                return targetId;
            }

            public final void setTargetId(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTargetId(value);
            }

            public final void clearTargetId() {
                this._builder.clearTargetId();
            }

            public final String getReceiverId() {
                String receiverId = this._builder.getReceiverId();
                Intrinsics.checkNotNullExpressionValue(receiverId, "getReceiverId(...)");
                return receiverId;
            }

            public final void setReceiverId(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setReceiverId(value);
            }

            public final void clearReceiverId() {
                this._builder.clearReceiverId();
            }

            public final int getResult() {
                return this._builder.getResult();
            }

            public final void setResult(int value) {
                this._builder.setResult(value);
            }

            public final void clearResult() {
                this._builder.clearResult();
            }

            public final long getProcessedAt() {
                return this._builder.getProcessedAt();
            }

            public final void setProcessedAt(long value) {
                this._builder.setProcessedAt(value);
            }

            public final void clearProcessedAt() {
                this._builder.clearProcessedAt();
            }

            public final long getInviteAt() {
                return this._builder.getInviteAt();
            }

            public final void setInviteAt(long value) {
                this._builder.setInviteAt(value);
            }

            public final void clearInviteAt() {
                this._builder.clearInviteAt();
            }

            public final String getInviteAtStr() {
                String inviteAtStr = this._builder.getInviteAtStr();
                Intrinsics.checkNotNullExpressionValue(inviteAtStr, "getInviteAtStr(...)");
                return inviteAtStr;
            }

            public final void setInviteAtStr(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInviteAtStr(value);
            }

            public final void clearInviteAtStr() {
                this._builder.clearInviteAtStr();
            }

            public final int getRequestId() {
                return this._builder.getRequestId();
            }

            public final void setRequestId(int value) {
                this._builder.setRequestId(value);
            }

            public final void clearRequestId() {
                this._builder.clearRequestId();
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

            public final String getBotAvatar() {
                String botAvatar = this._builder.getBotAvatar();
                Intrinsics.checkNotNullExpressionValue(botAvatar, "getBotAvatar(...)");
                return botAvatar;
            }

            public final void setBotAvatar(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setBotAvatar(value);
            }

            public final void clearBotAvatar() {
                this._builder.clearBotAvatar();
            }

            public final String getProcessorName() {
                String processorName = this._builder.getProcessorName();
                Intrinsics.checkNotNullExpressionValue(processorName, "getProcessorName(...)");
                return processorName;
            }

            public final void setProcessorName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setProcessorName(value);
            }

            public final void clearProcessorName() {
                this._builder.clearProcessorName();
            }

            public final String getNote() {
                String note = this._builder.getNote();
                Intrinsics.checkNotNullExpressionValue(note, "getNote(...)");
                return note;
            }

            public final void setNote(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setNote(value);
            }

            public final void clearNote() {
                this._builder.clearNote();
            }
        }

        private RequestKt() {
        }
    }
}
