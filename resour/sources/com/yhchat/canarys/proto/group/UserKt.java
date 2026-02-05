package com.yhchat.canarys.proto.group;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.proto.group.User;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/UserKt;", "", "<init>", "()V", "userInfo", "Lcom/yhchat/canarys/proto/group/User$User_info;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/group/UserKt$User_infoKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeuserInfo", "Dsl", "User_infoKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class UserKt {
    public static final int $stable = 0;
    public static final UserKt INSTANCE = new UserKt();

    /* compiled from: UserKt.kt */
    @Metadata(m168d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0011*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010%\u001a\u00020$2\u0006\u0010\b\u001a\u00020$8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010 \"\u0004\b-\u0010\"\u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/UserKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/User$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/User$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/User;", "value", "", "groupId", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "clearGroupId", "", "Lcom/yhchat/canarys/proto/group/User$User_info;", "userInfo", "getUserInfo", "()Lcom/yhchat/canarys/proto/group/User$User_info;", "setUserInfo", "(Lcom/yhchat/canarys/proto/group/User$User_info;)V", "clearUserInfo", "hasUserInfo", "", "userInfoOrNull", "getUserInfoOrNull", "(Lcom/yhchat/canarys/proto/group/UserKt$Dsl;)Lcom/yhchat/canarys/proto/group/User$User_info;", "", "permissionLevel", "getPermissionLevel", "()I", "setPermissionLevel", "(I)V", "clearPermissionLevel", "", "gagTime", "getGagTime", "()J", "setGagTime", "(J)V", "clearGagTime", "isGag", "getIsGag", "setIsGag", "clearIsGag", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final User.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(User.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(User.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: UserKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/UserKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/UserKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/User$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(User.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ User _build() {
            User userBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(userBuild, "build(...)");
            return userBuild;
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

        public final User.User_info getUserInfo() {
            User.User_info userInfo = this._builder.getUserInfo();
            Intrinsics.checkNotNullExpressionValue(userInfo, "getUserInfo(...)");
            return userInfo;
        }

        public final void setUserInfo(User.User_info value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUserInfo(value);
        }

        public final void clearUserInfo() {
            this._builder.clearUserInfo();
        }

        public final boolean hasUserInfo() {
            return this._builder.hasUserInfo();
        }

        public final User.User_info getUserInfoOrNull(Dsl $this$userInfoOrNull) {
            Intrinsics.checkNotNullParameter($this$userInfoOrNull, "<this>");
            return UserKtKt.getUserInfoOrNull($this$userInfoOrNull._builder);
        }

        public final int getPermissionLevel() {
            return this._builder.getPermissionLevel();
        }

        public final void setPermissionLevel(int value) {
            this._builder.setPermissionLevel(value);
        }

        public final void clearPermissionLevel() {
            this._builder.clearPermissionLevel();
        }

        public final long getGagTime() {
            return this._builder.getGagTime();
        }

        public final void setGagTime(long value) {
            this._builder.setGagTime(value);
        }

        public final void clearGagTime() {
            this._builder.clearGagTime();
        }

        public final int getIsGag() {
            return this._builder.getIsGag();
        }

        public final void setIsGag(int value) {
            this._builder.setIsGag(value);
        }

        public final void clearIsGag() {
            this._builder.clearIsGag();
        }
    }

    private UserKt() {
    }

    /* renamed from: -initializeuserInfo */
    public final User.User_info m9569initializeuserInfo(Function1<? super User_infoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        User_infoKt.Dsl.Companion companion = User_infoKt.Dsl.INSTANCE;
        User.User_info.Builder builderNewBuilder = User.User_info.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        User_infoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: UserKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/UserKt$User_infoKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class User_infoKt {
        public static final int $stable = 0;
        public static final User_infoKt INSTANCE = new User_infoKt();

        /* compiled from: UserKt.kt */
        @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/UserKt$User_infoKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/User$User_info$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/User$User_info$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/User$User_info;", "value", "", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "clearUserId", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "", "isVip", "getIsVip", "()I", "setIsVip", "(I)V", "clearIsVip", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final User.User_info.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(User.User_info.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(User.User_info.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: UserKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/UserKt$User_infoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/UserKt$User_infoKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/User$User_info$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(User.User_info.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ User.User_info _build() {
                User.User_info user_infoBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(user_infoBuild, "build(...)");
                return user_infoBuild;
            }

            public final String getUserId() {
                String userId = this._builder.getUserId();
                Intrinsics.checkNotNullExpressionValue(userId, "getUserId(...)");
                return userId;
            }

            public final void setUserId(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setUserId(value);
            }

            public final void clearUserId() {
                this._builder.clearUserId();
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

            public final int getIsVip() {
                return this._builder.getIsVip();
            }

            public final void setIsVip(int value) {
                this._builder.setIsVip(value);
            }

            public final void clearIsVip() {
                this._builder.clearIsVip();
            }
        }

        private User_infoKt() {
        }
    }
}
