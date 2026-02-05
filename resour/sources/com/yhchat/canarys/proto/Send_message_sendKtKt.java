package com.yhchat.canarys.proto;

import com.yhchat.canarys.proto.send_message_send;
import com.yhchat.canarys.proto.send_message_sendKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: send_message_sendKt.kt */
@Metadata(m168d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\r\u001a\u0004\u0018\u00010\t*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0014"}, m169d2 = {"sendMessageSend", "Lcom/yhchat/canarys/proto/send_message_send;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/send_message_sendKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializesendMessageSend", "copy", "Lcom/yhchat/canarys/proto/send_message_send$Content;", "Lcom/yhchat/canarys/proto/send_message_sendKt$ContentKt$Dsl;", "Lcom/yhchat/canarys/proto/send_message_send$Media;", "Lcom/yhchat/canarys/proto/send_message_sendKt$MediaKt$Dsl;", "contentOrNull", "Lcom/yhchat/canarys/proto/send_message_sendOrBuilder;", "getContentOrNull", "(Lcom/yhchat/canarys/proto/send_message_sendOrBuilder;)Lcom/yhchat/canarys/proto/send_message_send$Content;", "mediaOrNull", "getMediaOrNull", "(Lcom/yhchat/canarys/proto/send_message_sendOrBuilder;)Lcom/yhchat/canarys/proto/send_message_send$Media;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class Send_message_sendKtKt {
    /* renamed from: -initializesendMessageSend */
    public static final send_message_send m8822initializesendMessageSend(Function1<? super send_message_sendKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        send_message_sendKt.Dsl.Companion companion = send_message_sendKt.Dsl.INSTANCE;
        send_message_send.Builder builderNewBuilder = send_message_send.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        send_message_sendKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final send_message_send copy(send_message_send $this$copy, Function1<? super send_message_sendKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        send_message_sendKt.Dsl.Companion companion = send_message_sendKt.Dsl.INSTANCE;
        send_message_send.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        send_message_sendKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final send_message_send.Content copy(send_message_send.Content $this$copy, Function1<? super send_message_sendKt.ContentKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        send_message_sendKt.ContentKt.Dsl.Companion companion = send_message_sendKt.ContentKt.Dsl.INSTANCE;
        send_message_send.Content.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        send_message_sendKt.ContentKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final send_message_send.Media copy(send_message_send.Media $this$copy, Function1<? super send_message_sendKt.MediaKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        send_message_sendKt.MediaKt.Dsl.Companion companion = send_message_sendKt.MediaKt.Dsl.INSTANCE;
        send_message_send.Media.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        send_message_sendKt.MediaKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final send_message_send.Content getContentOrNull(send_message_sendOrBuilder $this$contentOrNull) {
        Intrinsics.checkNotNullParameter($this$contentOrNull, "<this>");
        if ($this$contentOrNull.hasContent()) {
            return $this$contentOrNull.getContent();
        }
        return null;
    }

    public static final send_message_send.Media getMediaOrNull(send_message_sendOrBuilder $this$mediaOrNull) {
        Intrinsics.checkNotNullParameter($this$mediaOrNull, "<this>");
        if ($this$mediaOrNull.hasMedia()) {
            return $this$mediaOrNull.getMedia();
        }
        return null;
    }
}
