package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.heartbeat_ack;
import com.yhchat.canarys.proto.chat_ws_go.heartbeat_ackKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: heartbeat_ackKt.kt */
@Metadata(m168d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"heartbeatAck", "Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ack;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ackKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeheartbeatAck", "copy", "infoOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ackOrBuilder;", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/heartbeat_ackOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class Heartbeat_ackKtKt {
    /* renamed from: -initializeheartbeatAck, reason: not valid java name */
    public static final heartbeat_ack m8993initializeheartbeatAck(Function1<? super heartbeat_ackKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        heartbeat_ackKt.Dsl.Companion companion = heartbeat_ackKt.Dsl.INSTANCE;
        heartbeat_ack.Builder builderNewBuilder = heartbeat_ack.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        heartbeat_ackKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final heartbeat_ack copy(heartbeat_ack $this$copy, Function1<? super heartbeat_ackKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        heartbeat_ackKt.Dsl.Companion companion = heartbeat_ackKt.Dsl.INSTANCE;
        heartbeat_ack.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        heartbeat_ackKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final INFO getInfoOrNull(heartbeat_ackOrBuilder $this$infoOrNull) {
        Intrinsics.checkNotNullParameter($this$infoOrNull, "<this>");
        if ($this$infoOrNull.hasInfo()) {
            return $this$infoOrNull.getInfo();
        }
        return null;
    }
}
