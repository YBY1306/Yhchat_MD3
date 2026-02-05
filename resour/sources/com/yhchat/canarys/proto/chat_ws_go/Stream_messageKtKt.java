package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.stream_message;
import com.yhchat.canarys.proto.chat_ws_go.stream_messageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: stream_messageKt.kt */
@Metadata(m168d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\t*\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0019"}, m169d2 = {"streamMessage", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializestreamMessage", "copy", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data;", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$Dsl;", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg;", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageKt$DataKt$StreamMsgKt$Dsl;", "msgOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$DataOrBuilder;", "getMsgOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$DataOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data$StreamMsg;", "infoOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageOrBuilder;", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/stream_messageOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/stream_message$Data;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class Stream_messageKtKt {
    /* renamed from: -initializestreamMessage */
    public static final stream_message m9003initializestreamMessage(Function1<? super stream_messageKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        stream_messageKt.Dsl.Companion companion = stream_messageKt.Dsl.INSTANCE;
        stream_message.Builder builderNewBuilder = stream_message.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        stream_messageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final stream_message copy(stream_message $this$copy, Function1<? super stream_messageKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        stream_messageKt.Dsl.Companion companion = stream_messageKt.Dsl.INSTANCE;
        stream_message.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        stream_messageKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final stream_message.Data copy(stream_message.Data $this$copy, Function1<? super stream_messageKt.DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        stream_messageKt.DataKt.Dsl.Companion companion = stream_messageKt.DataKt.Dsl.INSTANCE;
        stream_message.Data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        stream_messageKt.DataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final stream_message.Data.StreamMsg copy(stream_message.Data.StreamMsg $this$copy, Function1<? super stream_messageKt.DataKt.StreamMsgKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        stream_messageKt.DataKt.StreamMsgKt.Dsl.Companion companion = stream_messageKt.DataKt.StreamMsgKt.Dsl.INSTANCE;
        stream_message.Data.StreamMsg.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        stream_messageKt.DataKt.StreamMsgKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final stream_message.Data.StreamMsg getMsgOrNull(stream_message.DataOrBuilder $this$msgOrNull) {
        Intrinsics.checkNotNullParameter($this$msgOrNull, "<this>");
        if ($this$msgOrNull.hasMsg()) {
            return $this$msgOrNull.getMsg();
        }
        return null;
    }

    public static final INFO getInfoOrNull(stream_messageOrBuilder $this$infoOrNull) {
        Intrinsics.checkNotNullParameter($this$infoOrNull, "<this>");
        if ($this$infoOrNull.hasInfo()) {
            return $this$infoOrNull.getInfo();
        }
        return null;
    }

    public static final stream_message.Data getDataOrNull(stream_messageOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
