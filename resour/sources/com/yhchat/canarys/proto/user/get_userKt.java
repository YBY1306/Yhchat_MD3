package com.yhchat.canarys.proto.user;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.proto.user.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: get_userKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/get_userKt;", "", "<init>", "()V", "data", "Lcom/yhchat/canarys/proto/user/User$get_user$Data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/user/get_userKt$DataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedata", "Dsl", "DataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class get_userKt {
    public static final int $stable = 0;
    public static final get_userKt INSTANCE = new get_userKt();

    /* compiled from: get_userKt.kt */
    @Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/proto/user/get_userKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$get_user$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$get_user$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$get_user;", "value", "Lcom/yhchat/canarys/proto/user/User$Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/user/User$Status;", "setStatus", "(Lcom/yhchat/canarys/proto/user/User$Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/user/get_userKt$Dsl;)Lcom/yhchat/canarys/proto/user/User$Status;", "Lcom/yhchat/canarys/proto/user/User$get_user$Data;", "data", "getData", "()Lcom/yhchat/canarys/proto/user/User$get_user$Data;", "setData", "(Lcom/yhchat/canarys/proto/user/User$get_user$Data;)V", "clearData", "hasData", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/user/get_userKt$Dsl;)Lcom/yhchat/canarys/proto/user/User$get_user$Data;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final User.get_user.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(User.get_user.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(User.get_user.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: get_userKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/get_userKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/get_userKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$get_user$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(User.get_user.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ User.get_user _build() {
            User.get_user get_userVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(get_userVarBuild, "build(...)");
            return get_userVarBuild;
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
            return Get_userKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        public final User.get_user.Data getData() {
            User.get_user.Data data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(User.get_user.Data value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final User.get_user.Data getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return Get_userKtKt.getDataOrNull($this$dataOrNull._builder);
        }
    }

    private get_userKt() {
    }

    /* renamed from: -initializedata, reason: not valid java name */
    public final User.get_user.Data m10352initializedata(Function1<? super DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DataKt.Dsl.Companion companion = DataKt.Dsl.INSTANCE;
        User.get_user.Data.Builder builderNewBuilder = User.get_user.Data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        DataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: get_userKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/get_userKt$DataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class DataKt {
        public static final int $stable = 0;
        public static final DataKt INSTANCE = new DataKt();

        /* compiled from: get_userKt.kt */
        @Metadata(m168d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 j2\u00020\u0001:\u0002jkB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J%\u0010*\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010\b\u001a\u00020&H\u0007\u00a2\u0006\u0002\b+J&\u0010,\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u0010\b\u001a\u00020&H\u0087\n\u00a2\u0006\u0002\b-J+\u0010.\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020&00H\u0007\u00a2\u0006\u0002\b1J,\u0010,\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020&00H\u0087\n\u00a2\u0006\u0002\b2J.\u00103\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%2\u0006\u00104\u001a\u0002052\u0006\u0010\b\u001a\u00020&H\u0087\u0002\u00a2\u0006\u0002\b6J\u001d\u00107\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%H\u0007\u00a2\u0006\u0002\b8J\u0006\u0010<\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020\u0010J\u0006\u0010F\u001a\u00020\u0010J\u0006\u0010J\u001a\u00020\u0010J\u0006\u0010N\u001a\u00020\u0010J\u0006\u0010R\u001a\u00020\u0010J\u0006\u0010Y\u001a\u00020\u0010J\u0006\u0010Z\u001a\u00020[J\u0006\u0010e\u001a\u00020\u0010J\u0006\u0010f\u001a\u00020[R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR$\u0010 \u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001d\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%8F\u00a2\u0006\u0006\u001a\u0004\b(\u0010)R$\u00109\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR$\u0010=\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010\u0018\"\u0004\b?\u0010\u001aR$\u0010A\u001a\u0002052\u0006\u0010\b\u001a\u0002058G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010G\u001a\u0002052\u0006\u0010\b\u001a\u0002058G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bH\u0010C\"\u0004\bI\u0010ER$\u0010K\u001a\u0002052\u0006\u0010\b\u001a\u0002058G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bL\u0010C\"\u0004\bM\u0010ER$\u0010O\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bP\u0010\u0018\"\u0004\bQ\u0010\u001aR$\u0010T\u001a\u00020S2\u0006\u0010\b\u001a\u00020S8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0017\u0010\\\u001a\u0004\u0018\u00010S*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b]\u0010^R$\u0010`\u001a\u00020_2\u0006\u0010\b\u001a\u00020_8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\u0017\u0010g\u001a\u0004\u0018\u00010_*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\bh\u0010i\u00a8\u0006l"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/get_userKt$DataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$get_user$Data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$get_user$Data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$get_user$Data;", "value", "", Name.MARK, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "clearId", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "", "nameId", "getNameId", "()J", "setNameId", "(J)V", "clearNameId", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "avatarId", "getAvatarId", "setAvatarId", "clearAvatarId", "medal", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/user/User$Medal_info;", "Lcom/yhchat/canarys/proto/user/get_userKt$DataKt$Dsl$MedalProxy;", "getMedal", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addMedal", "plusAssign", "plusAssignMedal", "addAll", "values", "", "addAllMedal", "plusAssignAllMedal", "set", "index", "", "setMedal", "clear", "clearMedal", "registerTime", "getRegisterTime", "setRegisterTime", "clearRegisterTime", "banTime", "getBanTime", "setBanTime", "clearBanTime", "onlineDay", "getOnlineDay", "()I", "setOnlineDay", "(I)V", "clearOnlineDay", "continuousOnlineDay", "getContinuousOnlineDay", "setContinuousOnlineDay", "clearContinuousOnlineDay", "isVip", "getIsVip", "setIsVip", "clearIsVip", "vipExpiredTime", "getVipExpiredTime", "setVipExpiredTime", "clearVipExpiredTime", "Lcom/yhchat/canarys/proto/user/User$RemarkInfo;", "remarkInfo", "getRemarkInfo", "()Lcom/yhchat/canarys/proto/user/User$RemarkInfo;", "setRemarkInfo", "(Lcom/yhchat/canarys/proto/user/User$RemarkInfo;)V", "clearRemarkInfo", "hasRemarkInfo", "", "remarkInfoOrNull", "getRemarkInfoOrNull", "(Lcom/yhchat/canarys/proto/user/get_userKt$DataKt$Dsl;)Lcom/yhchat/canarys/proto/user/User$RemarkInfo;", "Lcom/yhchat/canarys/proto/user/User$ProfileInfo;", "profileInfo", "getProfileInfo", "()Lcom/yhchat/canarys/proto/user/User$ProfileInfo;", "setProfileInfo", "(Lcom/yhchat/canarys/proto/user/User$ProfileInfo;)V", "clearProfileInfo", "hasProfileInfo", "profileInfoOrNull", "getProfileInfoOrNull", "(Lcom/yhchat/canarys/proto/user/get_userKt$DataKt$Dsl;)Lcom/yhchat/canarys/proto/user/User$ProfileInfo;", "Companion", "MedalProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final User.get_user.Data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(User.get_user.Data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(User.get_user.Data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: get_userKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/get_userKt$DataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/get_userKt$DataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$get_user$Data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(User.get_user.Data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ User.get_user.Data _build() {
                User.get_user.Data dataBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(dataBuild, "build(...)");
                return dataBuild;
            }

            public final String getId() {
                String id = this._builder.getId();
                Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
                return id;
            }

            public final void setId(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setId(value);
            }

            public final void clearId() {
                this._builder.clearId();
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

            /* compiled from: get_userKt.kt */
            @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/get_userKt$DataKt$Dsl$MedalProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class MedalProxy extends DslProxy {
                public static final int $stable = 8;

                private MedalProxy() {
                }
            }

            public final /* synthetic */ DslList getMedal() {
                List<User.Medal_info> medalList = this._builder.getMedalList();
                Intrinsics.checkNotNullExpressionValue(medalList, "getMedalList(...)");
                return new DslList(medalList);
            }

            public final /* synthetic */ void addMedal(DslList $this$add, User.Medal_info value) {
                Intrinsics.checkNotNullParameter($this$add, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addMedal(value);
            }

            public final /* synthetic */ void plusAssignMedal(DslList<User.Medal_info, MedalProxy> dslList, User.Medal_info value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addMedal(dslList, value);
            }

            public final /* synthetic */ void addAllMedal(DslList $this$addAll, Iterable values) {
                Intrinsics.checkNotNullParameter($this$addAll, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllMedal(values);
            }

            public final /* synthetic */ void plusAssignAllMedal(DslList<User.Medal_info, MedalProxy> dslList, Iterable<User.Medal_info> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllMedal(dslList, values);
            }

            public final /* synthetic */ void setMedal(DslList $this$set, int index, User.Medal_info value) {
                Intrinsics.checkNotNullParameter($this$set, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setMedal(index, value);
            }

            public final /* synthetic */ void clearMedal(DslList $this$clear) {
                Intrinsics.checkNotNullParameter($this$clear, "<this>");
                this._builder.clearMedal();
            }

            public final String getRegisterTime() {
                String registerTime = this._builder.getRegisterTime();
                Intrinsics.checkNotNullExpressionValue(registerTime, "getRegisterTime(...)");
                return registerTime;
            }

            public final void setRegisterTime(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setRegisterTime(value);
            }

            public final void clearRegisterTime() {
                this._builder.clearRegisterTime();
            }

            public final long getBanTime() {
                return this._builder.getBanTime();
            }

            public final void setBanTime(long value) {
                this._builder.setBanTime(value);
            }

            public final void clearBanTime() {
                this._builder.clearBanTime();
            }

            public final int getOnlineDay() {
                return this._builder.getOnlineDay();
            }

            public final void setOnlineDay(int value) {
                this._builder.setOnlineDay(value);
            }

            public final void clearOnlineDay() {
                this._builder.clearOnlineDay();
            }

            public final int getContinuousOnlineDay() {
                return this._builder.getContinuousOnlineDay();
            }

            public final void setContinuousOnlineDay(int value) {
                this._builder.setContinuousOnlineDay(value);
            }

            public final void clearContinuousOnlineDay() {
                this._builder.clearContinuousOnlineDay();
            }

            public final int getIsVip() {
                return this._builder.getIsVip();
            }

            public final void setIsVip(int value) {
                this._builder.setIsVip(value);
            }

            public final void clearIsVip() {
                this._builder.clearIsVip();
            }

            public final long getVipExpiredTime() {
                return this._builder.getVipExpiredTime();
            }

            public final void setVipExpiredTime(long value) {
                this._builder.setVipExpiredTime(value);
            }

            public final void clearVipExpiredTime() {
                this._builder.clearVipExpiredTime();
            }

            public final User.RemarkInfo getRemarkInfo() {
                User.RemarkInfo remarkInfo = this._builder.getRemarkInfo();
                Intrinsics.checkNotNullExpressionValue(remarkInfo, "getRemarkInfo(...)");
                return remarkInfo;
            }

            public final void setRemarkInfo(User.RemarkInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setRemarkInfo(value);
            }

            public final void clearRemarkInfo() {
                this._builder.clearRemarkInfo();
            }

            public final boolean hasRemarkInfo() {
                return this._builder.hasRemarkInfo();
            }

            public final User.RemarkInfo getRemarkInfoOrNull(Dsl $this$remarkInfoOrNull) {
                Intrinsics.checkNotNullParameter($this$remarkInfoOrNull, "<this>");
                return Get_userKtKt.getRemarkInfoOrNull($this$remarkInfoOrNull._builder);
            }

            public final User.ProfileInfo getProfileInfo() {
                User.ProfileInfo profileInfo = this._builder.getProfileInfo();
                Intrinsics.checkNotNullExpressionValue(profileInfo, "getProfileInfo(...)");
                return profileInfo;
            }

            public final void setProfileInfo(User.ProfileInfo value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setProfileInfo(value);
            }

            public final void clearProfileInfo() {
                this._builder.clearProfileInfo();
            }

            public final boolean hasProfileInfo() {
                return this._builder.hasProfileInfo();
            }

            public final User.ProfileInfo getProfileInfoOrNull(Dsl $this$profileInfoOrNull) {
                Intrinsics.checkNotNullParameter($this$profileInfoOrNull, "<this>");
                return Get_userKtKt.getProfileInfoOrNull($this$profileInfoOrNull._builder);
            }
        }

        private DataKt() {
        }
    }
}
