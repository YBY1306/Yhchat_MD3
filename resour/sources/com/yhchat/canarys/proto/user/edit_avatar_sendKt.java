package com.yhchat.canarys.proto.user;

import com.yhchat.canarys.proto.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: edit_avatar_sendKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/edit_avatar_sendKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class edit_avatar_sendKt {
    public static final int $stable = 0;
    public static final edit_avatar_sendKt INSTANCE = new edit_avatar_sendKt();

    /* compiled from: edit_avatar_sendKt.kt */
    @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/edit_avatar_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$edit_avatar_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$edit_avatar_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$edit_avatar_send;", "value", "", "url", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "clearUrl", "", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final User.edit_avatar_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(User.edit_avatar_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(User.edit_avatar_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: edit_avatar_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/edit_avatar_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/edit_avatar_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$edit_avatar_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(User.edit_avatar_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ User.edit_avatar_send _build() {
            User.edit_avatar_send edit_avatar_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(edit_avatar_sendVarBuild, "build(...)");
            return edit_avatar_sendVarBuild;
        }

        public final String getUrl() {
            String url = this._builder.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
            return url;
        }

        public final void setUrl(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setUrl(value);
        }

        public final void clearUrl() {
            this._builder.clearUrl();
        }
    }

    private edit_avatar_sendKt() {
    }
}
