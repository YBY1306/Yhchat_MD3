package com.yhchat.canarys.proto.user;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.proto.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RemarkInfoKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/RemarkInfoKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class RemarkInfoKt {
    public static final int $stable = 0;
    public static final RemarkInfoKt INSTANCE = new RemarkInfoKt();

    /* compiled from: RemarkInfoKt.kt */
    @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/RemarkInfoKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$RemarkInfo$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$RemarkInfo$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$RemarkInfo;", "value", "", "remarkName", "getRemarkName", "()Ljava/lang/String;", "setRemarkName", "(Ljava/lang/String;)V", "clearRemarkName", "", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "setPhoneNumber", "clearPhoneNumber", "extraRemark", "getExtraRemark", "setExtraRemark", "clearExtraRemark", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final User.RemarkInfo.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(User.RemarkInfo.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(User.RemarkInfo.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: RemarkInfoKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/RemarkInfoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/RemarkInfoKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$RemarkInfo$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(User.RemarkInfo.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ User.RemarkInfo _build() {
            User.RemarkInfo remarkInfoBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(remarkInfoBuild, "build(...)");
            return remarkInfoBuild;
        }

        public final String getRemarkName() {
            String remarkName = this._builder.getRemarkName();
            Intrinsics.checkNotNullExpressionValue(remarkName, "getRemarkName(...)");
            return remarkName;
        }

        public final void setRemarkName(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRemarkName(value);
        }

        public final void clearRemarkName() {
            this._builder.clearRemarkName();
        }

        public final String getPhoneNumber() {
            String phoneNumber = this._builder.getPhoneNumber();
            Intrinsics.checkNotNullExpressionValue(phoneNumber, "getPhoneNumber(...)");
            return phoneNumber;
        }

        public final void setPhoneNumber(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setPhoneNumber(value);
        }

        public final void clearPhoneNumber() {
            this._builder.clearPhoneNumber();
        }

        public final String getExtraRemark() {
            String extraRemark = this._builder.getExtraRemark();
            Intrinsics.checkNotNullExpressionValue(extraRemark, "getExtraRemark(...)");
            return extraRemark;
        }

        public final void setExtraRemark(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setExtraRemark(value);
        }

        public final void clearExtraRemark() {
            this._builder.clearExtraRemark();
        }
    }

    private RemarkInfoKt() {
    }
}
