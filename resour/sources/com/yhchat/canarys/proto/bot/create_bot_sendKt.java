package com.yhchat.canarys.proto.bot;

import androidx.autofill.HintConstants;
import com.yhchat.canarys.proto.bot.Bot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: create_bot_sendKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/create_bot_sendKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class create_bot_sendKt {
    public static final int $stable = 0;
    public static final create_bot_sendKt INSTANCE = new create_bot_sendKt();

    /* compiled from: create_bot_sendKt.kt */
    @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/create_bot_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/bot/Bot$create_bot_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot_send;", "value", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "clearName", "", "introduction", "getIntroduction", "setIntroduction", "clearIntroduction", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "", "private", "getPrivate", "()I", "setPrivate", "(I)V", "clearPrivate", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final Bot.create_bot_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(Bot.create_bot_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(Bot.create_bot_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: create_bot_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/bot/create_bot_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/bot/create_bot_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Bot.create_bot_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ Bot.create_bot_send _build() {
            Bot.create_bot_send create_bot_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(create_bot_sendVarBuild, "build(...)");
            return create_bot_sendVarBuild;
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

        public final int getPrivate() {
            return this._builder.getPrivate();
        }

        public final void setPrivate(int value) {
            this._builder.setPrivate(value);
        }

        public final void clearPrivate() {
            this._builder.clearPrivate();
        }
    }

    private create_bot_sendKt() {
    }
}
