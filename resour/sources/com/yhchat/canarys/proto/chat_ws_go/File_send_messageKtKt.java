package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.file_send_message;
import com.yhchat.canarys.proto.chat_ws_go.file_send_messageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: file_send_messageKt.kt */
@Metadata(m168d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\t*\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0019"}, m169d2 = {"fileSendMessage", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializefileSendMessage", "copy", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData;", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$Dsl;", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender;", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageKt$FileSendDataKt$FileSenderKt$Dsl;", "senderOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendDataOrBuilder;", "getSenderOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendDataOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData$FileSender;", "infoOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageOrBuilder;", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/file_send_messageOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/file_send_message$FileSendData;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class File_send_messageKtKt {
    /* renamed from: -initializefileSendMessage */
    public static final file_send_message m8992initializefileSendMessage(Function1<? super file_send_messageKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        file_send_messageKt.Dsl.Companion companion = file_send_messageKt.Dsl.INSTANCE;
        file_send_message.Builder builderNewBuilder = file_send_message.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        file_send_messageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final file_send_message copy(file_send_message $this$copy, Function1<? super file_send_messageKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        file_send_messageKt.Dsl.Companion companion = file_send_messageKt.Dsl.INSTANCE;
        file_send_message.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        file_send_messageKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final file_send_message.FileSendData copy(file_send_message.FileSendData $this$copy, Function1<? super file_send_messageKt.FileSendDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        file_send_messageKt.FileSendDataKt.Dsl.Companion companion = file_send_messageKt.FileSendDataKt.Dsl.INSTANCE;
        file_send_message.FileSendData.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        file_send_messageKt.FileSendDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final file_send_message.FileSendData.FileSender copy(file_send_message.FileSendData.FileSender $this$copy, Function1<? super file_send_messageKt.FileSendDataKt.FileSenderKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        file_send_messageKt.FileSendDataKt.FileSenderKt.Dsl.Companion companion = file_send_messageKt.FileSendDataKt.FileSenderKt.Dsl.INSTANCE;
        file_send_message.FileSendData.FileSender.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        file_send_messageKt.FileSendDataKt.FileSenderKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final file_send_message.FileSendData.FileSender getSenderOrNull(file_send_message.FileSendDataOrBuilder $this$senderOrNull) {
        Intrinsics.checkNotNullParameter($this$senderOrNull, "<this>");
        if ($this$senderOrNull.hasSender()) {
            return $this$senderOrNull.getSender();
        }
        return null;
    }

    public static final INFO getInfoOrNull(file_send_messageOrBuilder $this$infoOrNull) {
        Intrinsics.checkNotNullParameter($this$infoOrNull, "<this>");
        if ($this$infoOrNull.hasInfo()) {
            return $this$infoOrNull.getInfo();
        }
        return null;
    }

    public static final file_send_message.FileSendData getDataOrNull(file_send_messageOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
