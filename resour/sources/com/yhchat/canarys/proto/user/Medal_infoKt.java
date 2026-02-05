package com.yhchat.canarys.proto.user;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.proto.user.User;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: Medal_infoKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/Medal_infoKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class Medal_infoKt {
    public static final int $stable = 0;
    public static final Medal_infoKt INSTANCE = new Medal_infoKt();

    /* compiled from: Medal_infoKt.kt */
    @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/Medal_infoKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/user/User$Medal_info$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/user/User$Medal_info$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/user/User$Medal_info;", "value", "", Name.MARK, "getId", "()J", "setId", "(J)V", "clearId", "", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "clearName", "sort", "getSort", "setSort", "clearSort", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final User.Medal_info.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(User.Medal_info.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(User.Medal_info.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: Medal_infoKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/user/Medal_infoKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/user/Medal_infoKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/user/User$Medal_info$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(User.Medal_info.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ User.Medal_info _build() {
            User.Medal_info medal_infoBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(medal_infoBuild, "build(...)");
            return medal_infoBuild;
        }

        public final long getId() {
            return this._builder.getId();
        }

        public final void setId(long value) {
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

        public final long getSort() {
            return this._builder.getSort();
        }

        public final void setSort(long value) {
            this._builder.setSort(value);
        }

        public final void clearSort() {
            this._builder.clearSort();
        }
    }

    private Medal_infoKt() {
    }
}
