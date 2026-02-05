package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.WsTag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: WsTagKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsTagKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class WsTagKt {
    public static final int $stable = 0;
    public static final WsTagKt INSTANCE = new WsTagKt();

    /* compiled from: WsTagKt.kt */
    @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016\u00a8\u0006\u001d"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsTagKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/WsTag$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsTag$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/WsTag;", "value", "", Name.MARK, "getId", "()J", "setId", "(J)V", "clearId", "", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "clearText", "color", "getColor", "setColor", "clearColor", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final WsTag.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(WsTag.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(WsTag.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: WsTagKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsTagKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/WsTagKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/WsTag$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(WsTag.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ WsTag _build() {
            WsTag wsTagBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(wsTagBuild, "build(...)");
            return wsTagBuild;
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

        public final String getText() {
            String text = this._builder.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            return text;
        }

        public final void setText(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setText(value);
        }

        public final void clearText() {
            this._builder.clearText();
        }

        public final String getColor() {
            String color = this._builder.getColor();
            Intrinsics.checkNotNullExpressionValue(color, "getColor(...)");
            return color;
        }

        public final void setColor(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setColor(value);
        }

        public final void clearColor() {
            this._builder.clearColor();
        }
    }

    private WsTagKt() {
    }
}
