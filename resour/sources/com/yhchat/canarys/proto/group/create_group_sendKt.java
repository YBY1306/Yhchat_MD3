package com.yhchat.canarys.proto.group;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.proto.group.create_group_send;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: create_group_sendKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/create_group_sendKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class create_group_sendKt {
    public static final int $stable = 0;
    public static final create_group_sendKt INSTANCE = new create_group_sendKt();

    /* compiled from: create_group_sendKt.kt */
    @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR$\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u001d8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/create_group_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/group/create_group_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/group/create_group_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/group/create_group_send;", "value", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "clearName", "", "introduction", "getIntroduction", "setIntroduction", "clearIntroduction", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "category", "getCategory", "setCategory", "clearCategory", "", "categoryId", "getCategoryId", "()I", "setCategoryId", "(I)V", "clearCategoryId", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final create_group_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(create_group_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(create_group_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: create_group_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/group/create_group_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/group/create_group_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/group/create_group_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(create_group_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ create_group_send _build() {
            create_group_send create_group_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(create_group_sendVarBuild, "build(...)");
            return create_group_sendVarBuild;
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

        public final String getCategory() {
            String category = this._builder.getCategory();
            Intrinsics.checkNotNullExpressionValue(category, "getCategory(...)");
            return category;
        }

        public final void setCategory(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCategory(value);
        }

        public final void clearCategory() {
            this._builder.clearCategory();
        }

        public final int getCategoryId() {
            return this._builder.getCategoryId();
        }

        public final void setCategoryId(int value) {
            this._builder.setCategoryId(value);
        }

        public final void clearCategoryId() {
            this._builder.clearCategoryId();
        }
    }

    private create_group_sendKt() {
    }
}
