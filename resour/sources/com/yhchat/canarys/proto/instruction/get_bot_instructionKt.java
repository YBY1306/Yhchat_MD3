package com.yhchat.canarys.proto.instruction;

import com.yhchat.canarys.proto.instruction.get_bot_instruction;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: get_bot_instructionKt.kt */
@Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/get_bot_instructionKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public final class get_bot_instructionKt {
    public static final int $stable = 0;
    public static final get_bot_instructionKt INSTANCE = new get_bot_instructionKt();

    /* compiled from: get_bot_instructionKt.kt */
    @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/get_bot_instructionKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/instruction/get_bot_instruction$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/instruction/get_bot_instruction$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/instruction/get_bot_instruction;", "value", "", Name.MARK, "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "clearId", "", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final get_bot_instruction.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(get_bot_instruction.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(get_bot_instruction.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: get_bot_instructionKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/instruction/get_bot_instructionKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/instruction/get_bot_instructionKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/instruction/get_bot_instruction$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(get_bot_instruction.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ get_bot_instruction _build() {
            get_bot_instruction get_bot_instructionVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(get_bot_instructionVarBuild, "build(...)");
            return get_bot_instructionVarBuild;
        }

        public final String getId() {
            String id = this._builder.getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            return id;
        }

        public final void setId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setId(value);
        }

        public final void clearId() {
            this._builder.clearId();
        }
    }

    private get_bot_instructionKt() {
    }
}
