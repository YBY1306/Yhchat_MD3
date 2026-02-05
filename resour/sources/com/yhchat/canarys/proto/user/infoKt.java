package com.yhchat.canarys.proto.user;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.proto.user.User;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: infoKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/infoKt;", "", "<init>", "()V", "data", "Lcom/yhchat/canarys/proto/user/User$info$Data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/user/infoKt$DataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedata", "Dsl", "DataKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class infoKt {
    public static final int $stable = 0;
    public static final infoKt INSTANCE = new infoKt();

    /* compiled from: infoKt.kt */
    @Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010\u001d\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u0004\u0018\u00010\t*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\b\u001a\u00020\u00168G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u0016*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010 \u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/proto/user/infoKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$info$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$info$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$info;", "value", "Lcom/yhchat/canarys/proto/user/User$Status;", NotificationCompat.CATEGORY_STATUS, "getStatus", "()Lcom/yhchat/canarys/proto/user/User$Status;", "setStatus", "(Lcom/yhchat/canarys/proto/user/User$Status;)V", "clearStatus", "", "hasStatus", "", "statusOrNull", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/user/infoKt$Dsl;)Lcom/yhchat/canarys/proto/user/User$Status;", "Lcom/yhchat/canarys/proto/user/User$info$Data;", "data", "getData", "()Lcom/yhchat/canarys/proto/user/User$info$Data;", "setData", "(Lcom/yhchat/canarys/proto/user/User$info$Data;)V", "clearData", "hasData", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/user/infoKt$Dsl;)Lcom/yhchat/canarys/proto/user/User$info$Data;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final User.info.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(User.info.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(User.info.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: infoKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/infoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/infoKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$info$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(User.info.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ User.info _build() {
            User.info infoVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(infoVarBuild, "build(...)");
            return infoVarBuild;
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
            return InfoKtKt.getStatusOrNull($this$statusOrNull._builder);
        }

        public final User.info.Data getData() {
            User.info.Data data = this._builder.getData();
            Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
            return data;
        }

        public final void setData(User.info.Data value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setData(value);
        }

        public final void clearData() {
            this._builder.clearData();
        }

        public final boolean hasData() {
            return this._builder.hasData();
        }

        public final User.info.Data getDataOrNull(Dsl $this$dataOrNull) {
            Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
            return InfoKtKt.getDataOrNull($this$dataOrNull._builder);
        }
    }

    private infoKt() {
    }

    /* renamed from: -initializedata, reason: not valid java name */
    public final User.info.Data m10353initializedata(Function1<? super DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DataKt.Dsl.Companion companion = DataKt.Dsl.INSTANCE;
        User.info.Data.Builder builderNewBuilder = User.info.Data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        DataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: infoKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/infoKt$DataKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class DataKt {
        public static final int $stable = 0;
        public static final DataKt INSTANCE = new DataKt();

        /* compiled from: infoKt.kt */
        @Metadata(m168d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0007\u0018\u0000 >2\u00020\u0001:\u0001>B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J\u0006\u00105\u001a\u00020\u0010J\u0006\u00109\u001a\u00020\u0010J\u0006\u0010=\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000eR$\u0010$\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR$\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020/8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u00106\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u0010\u001eR$\u0010:\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010\u000e\u00a8\u0006?"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/infoKt$DataKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$info$Data$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$info$Data$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$info$Data;", "value", "", Name.MARK, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "clearId", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "", "avatarId", "getAvatarId", "()J", "setAvatarId", "(J)V", "clearAvatarId", HintConstants.AUTOFILL_HINT_PHONE, "getPhone", "setPhone", "clearPhone", NotificationCompat.CATEGORY_EMAIL, "getEmail", "setEmail", "clearEmail", "", "coin", "getCoin", "()D", "setCoin", "(D)V", "clearCoin", "", "isVip", "getIsVip", "()I", "setIsVip", "(I)V", "clearIsVip", "vipExpiredTime", "getVipExpiredTime", "setVipExpiredTime", "clearVipExpiredTime", "invitationCode", "getInvitationCode", "setInvitationCode", "clearInvitationCode", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final User.info.Data.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(User.info.Data.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(User.info.Data.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: infoKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/infoKt$DataKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/infoKt$DataKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$info$Data$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(User.info.Data.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ User.info.Data _build() {
                User.info.Data dataBuild = this._builder.build();
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

            public final String getPhone() {
                String phone = this._builder.getPhone();
                Intrinsics.checkNotNullExpressionValue(phone, "getPhone(...)");
                return phone;
            }

            public final void setPhone(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPhone(value);
            }

            public final void clearPhone() {
                this._builder.clearPhone();
            }

            public final String getEmail() {
                String email = this._builder.getEmail();
                Intrinsics.checkNotNullExpressionValue(email, "getEmail(...)");
                return email;
            }

            public final void setEmail(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setEmail(value);
            }

            public final void clearEmail() {
                this._builder.clearEmail();
            }

            public final double getCoin() {
                return this._builder.getCoin();
            }

            public final void setCoin(double value) {
                this._builder.setCoin(value);
            }

            public final void clearCoin() {
                this._builder.clearCoin();
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

            public final String getInvitationCode() {
                String invitationCode = this._builder.getInvitationCode();
                Intrinsics.checkNotNullExpressionValue(invitationCode, "getInvitationCode(...)");
                return invitationCode;
            }

            public final void setInvitationCode(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setInvitationCode(value);
            }

            public final void clearInvitationCode() {
                this._builder.clearInvitationCode();
            }
        }

        private DataKt() {
        }
    }
}
