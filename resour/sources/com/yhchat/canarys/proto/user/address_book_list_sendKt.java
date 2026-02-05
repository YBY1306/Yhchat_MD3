package com.yhchat.canarys.proto.user;

import com.yhchat.canarys.proto.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: address_book_list_sendKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_list_sendKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class address_book_list_sendKt {
    public static final int $stable = 0;
    public static final address_book_list_sendKt INSTANCE = new address_book_list_sendKt();

    /* compiled from: address_book_list_sendKt.kt */
    @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_list_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$address_book_list_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$address_book_list_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$address_book_list_send;", "value", "", "number", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", "clearNumber", "", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final User.address_book_list_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(User.address_book_list_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(User.address_book_list_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: address_book_list_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/address_book_list_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/address_book_list_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$address_book_list_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(User.address_book_list_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ User.address_book_list_send _build() {
            User.address_book_list_send address_book_list_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(address_book_list_sendVarBuild, "build(...)");
            return address_book_list_sendVarBuild;
        }

        public final String getNumber() {
            String number = this._builder.getNumber();
            Intrinsics.checkNotNullExpressionValue(number, "getNumber(...)");
            return number;
        }

        public final void setNumber(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setNumber(value);
        }

        public final void clearNumber() {
            this._builder.clearNumber();
        }
    }

    private address_book_list_sendKt() {
    }
}
