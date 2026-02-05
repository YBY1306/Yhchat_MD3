package com.yhchat.canarys.proto.user;

import com.yhchat.canarys.proto.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceInfoKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/DeviceInfoKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class DeviceInfoKt {
    public static final int $stable = 0;
    public static final DeviceInfoKt INSTANCE = new DeviceInfoKt();

    /* compiled from: DeviceInfoKt.kt */
    @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/DeviceInfoKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$DeviceInfo$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$DeviceInfo$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$DeviceInfo;", "value", "", "userId", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "clearUserId", "", "platform", "getPlatform", "setPlatform", "clearPlatform", "deviceId", "getDeviceId", "setDeviceId", "clearDeviceId", "", "loginTimestamp", "getLoginTimestamp", "()J", "setLoginTimestamp", "(J)V", "clearLoginTimestamp", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final User.DeviceInfo.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(User.DeviceInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(User.DeviceInfo.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: DeviceInfoKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/DeviceInfoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/DeviceInfoKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$DeviceInfo$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(User.DeviceInfo.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ User.DeviceInfo _build() {
            User.DeviceInfo deviceInfoBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(deviceInfoBuild, "build(...)");
            return deviceInfoBuild;
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

        public final String getPlatform() {
            String platform = this._builder.getPlatform();
            Intrinsics.checkNotNullExpressionValue(platform, "getPlatform(...)");
            return platform;
        }

        public final void setPlatform(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPlatform(value);
        }

        public final void clearPlatform() {
            this._builder.clearPlatform();
        }

        public final String getDeviceId() {
            String deviceId = this._builder.getDeviceId();
            Intrinsics.checkNotNullExpressionValue(deviceId, "getDeviceId(...)");
            return deviceId;
        }

        public final void setDeviceId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDeviceId(value);
        }

        public final void clearDeviceId() {
            this._builder.clearDeviceId();
        }

        public final long getLoginTimestamp() {
            return this._builder.getLoginTimestamp();
        }

        public final void setLoginTimestamp(long value) {
            this._builder.setLoginTimestamp(value);
        }

        public final void clearLoginTimestamp() {
            this._builder.clearLoginTimestamp();
        }
    }

    private DeviceInfoKt() {
    }
}
