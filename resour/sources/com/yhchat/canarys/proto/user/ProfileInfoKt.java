package com.yhchat.canarys.proto.user;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.proto.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileInfoKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/ProfileInfoKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class ProfileInfoKt {
    public static final int $stable = 0;
    public static final ProfileInfoKt INSTANCE = new ProfileInfoKt();

    /* compiled from: ProfileInfoKt.kt */
    @Metadata(m168d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0014\b\u0007\u0018\u0000 /2\u00020\u0001:\u0001/B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010&\u001a\u00020\u0010J\u0006\u0010*\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001c8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\f\"\u0004\b%\u0010\u000eR$\u0010'\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR$\u0010+\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b,\u0010\f\"\u0004\b-\u0010\u000e\u00a8\u00060"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/ProfileInfoKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$ProfileInfo$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$ProfileInfo$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$ProfileInfo;", "value", "", "lastActiveTime", "getLastActiveTime", "()Ljava/lang/String;", "setLastActiveTime", "(Ljava/lang/String;)V", "clearLastActiveTime", "", "introduction", "getIntroduction", "setIntroduction", "clearIntroduction", "", HintConstants.AUTOFILL_HINT_GENDER, "getGender", "()I", "setGender", "(I)V", "clearGender", "", "birthday", "getBirthday", "()J", "setBirthday", "(J)V", "clearBirthday", "city", "getCity", "setCity", "clearCity", "district", "getDistrict", "setDistrict", "clearDistrict", "address", "getAddress", "setAddress", "clearAddress", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final User.ProfileInfo.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(User.ProfileInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(User.ProfileInfo.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: ProfileInfoKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/ProfileInfoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/ProfileInfoKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$ProfileInfo$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(User.ProfileInfo.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ User.ProfileInfo _build() {
            User.ProfileInfo profileInfoBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(profileInfoBuild, "build(...)");
            return profileInfoBuild;
        }

        public final String getLastActiveTime() {
            String lastActiveTime = this._builder.getLastActiveTime();
            Intrinsics.checkNotNullExpressionValue(lastActiveTime, "getLastActiveTime(...)");
            return lastActiveTime;
        }

        public final void setLastActiveTime(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setLastActiveTime(value);
        }

        public final void clearLastActiveTime() {
            this._builder.clearLastActiveTime();
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

        public final int getGender() {
            return this._builder.getGender();
        }

        public final void setGender(int value) {
            this._builder.setGender(value);
        }

        public final void clearGender() {
            this._builder.clearGender();
        }

        public final long getBirthday() {
            return this._builder.getBirthday();
        }

        public final void setBirthday(long value) {
            this._builder.setBirthday(value);
        }

        public final void clearBirthday() {
            this._builder.clearBirthday();
        }

        public final String getCity() {
            String city = this._builder.getCity();
            Intrinsics.checkNotNullExpressionValue(city, "getCity(...)");
            return city;
        }

        public final void setCity(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCity(value);
        }

        public final void clearCity() {
            this._builder.clearCity();
        }

        public final String getDistrict() {
            String district = this._builder.getDistrict();
            Intrinsics.checkNotNullExpressionValue(district, "getDistrict(...)");
            return district;
        }

        public final void setDistrict(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDistrict(value);
        }

        public final void clearDistrict() {
            this._builder.clearDistrict();
        }

        public final String getAddress() {
            String address = this._builder.getAddress();
            Intrinsics.checkNotNullExpressionValue(address, "getAddress(...)");
            return address;
        }

        public final void setAddress(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setAddress(value);
        }

        public final void clearAddress() {
            this._builder.clearAddress();
        }
    }

    private ProfileInfoKt() {
    }
}
