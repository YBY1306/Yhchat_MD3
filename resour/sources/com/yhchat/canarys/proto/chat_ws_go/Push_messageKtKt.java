package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.push_message;
import com.yhchat.canarys.proto.chat_ws_go.push_messageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: push_messageKt.kt */
@Metadata(m168d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\t*\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0018"}, m169d2 = {"pushMessage", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializepushMessage", "copy", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData;", "Lcom/yhchat/canarys/proto/chat_ws_go/push_messageKt$PushDataKt$Dsl;", "msgOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg;", "Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushDataOrBuilder;", "getMsgOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushDataOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg;", "infoOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/push_messageOrBuilder;", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/push_messageOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/push_messageOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/push_message$PushData;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class Push_messageKtKt {
    /* renamed from: -initializepushMessage */
    public static final push_message m9002initializepushMessage(Function1<? super push_messageKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        push_messageKt.Dsl.Companion companion = push_messageKt.Dsl.INSTANCE;
        push_message.Builder builderNewBuilder = push_message.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        push_messageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final push_message copy(push_message $this$copy, Function1<? super push_messageKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        push_messageKt.Dsl.Companion companion = push_messageKt.Dsl.INSTANCE;
        push_message.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        push_messageKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final push_message.PushData copy(push_message.PushData $this$copy, Function1<? super push_messageKt.PushDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        push_messageKt.PushDataKt.Dsl.Companion companion = push_messageKt.PushDataKt.Dsl.INSTANCE;
        push_message.PushData.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        push_messageKt.PushDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WsMsg getMsgOrNull(push_message.PushDataOrBuilder $this$msgOrNull) {
        Intrinsics.checkNotNullParameter($this$msgOrNull, "<this>");
        if ($this$msgOrNull.hasMsg()) {
            return $this$msgOrNull.getMsg();
        }
        return null;
    }

    public static final INFO getInfoOrNull(push_messageOrBuilder $this$infoOrNull) {
        Intrinsics.checkNotNullParameter($this$infoOrNull, "<this>");
        if ($this$infoOrNull.hasInfo()) {
            return $this$infoOrNull.getInfo();
        }
        return null;
    }

    public static final push_message.PushData getDataOrNull(push_messageOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
