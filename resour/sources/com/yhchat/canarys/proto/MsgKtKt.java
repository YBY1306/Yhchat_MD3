package com.yhchat.canarys.proto;

import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.proto.Msg;
import com.yhchat.canarys.proto.MsgKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MsgKt.kt */
@Metadata(m168d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\r*\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\r*\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000b*\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\t*\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0019"}, m169d2 = {NotificationCompat.CATEGORY_MESSAGE, "Lcom/yhchat/canarys/proto/Msg;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/MsgKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializemsg", "copy", "Lcom/yhchat/canarys/proto/Msg$Cmd;", "Lcom/yhchat/canarys/proto/MsgKt$CmdKt$Dsl;", "Lcom/yhchat/canarys/proto/Msg$Content;", "Lcom/yhchat/canarys/proto/MsgKt$ContentKt$Dsl;", "Lcom/yhchat/canarys/proto/Msg$Sender;", "Lcom/yhchat/canarys/proto/MsgKt$SenderKt$Dsl;", "senderOrNull", "Lcom/yhchat/canarys/proto/MsgOrBuilder;", "getSenderOrNull", "(Lcom/yhchat/canarys/proto/MsgOrBuilder;)Lcom/yhchat/canarys/proto/Msg$Sender;", "contentOrNull", "getContentOrNull", "(Lcom/yhchat/canarys/proto/MsgOrBuilder;)Lcom/yhchat/canarys/proto/Msg$Content;", "cmdOrNull", "getCmdOrNull", "(Lcom/yhchat/canarys/proto/MsgOrBuilder;)Lcom/yhchat/canarys/proto/Msg$Cmd;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class MsgKtKt {
    /* renamed from: -initializemsg */
    public static final Msg m8816initializemsg(Function1<? super MsgKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MsgKt.Dsl.Companion companion = MsgKt.Dsl.INSTANCE;
        Msg.Builder builderNewBuilder = Msg.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        MsgKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Msg copy(Msg $this$copy, Function1<? super MsgKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MsgKt.Dsl.Companion companion = MsgKt.Dsl.INSTANCE;
        Msg.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        MsgKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Msg.Cmd copy(Msg.Cmd $this$copy, Function1<? super MsgKt.CmdKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MsgKt.CmdKt.Dsl.Companion companion = MsgKt.CmdKt.Dsl.INSTANCE;
        Msg.Cmd.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        MsgKt.CmdKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Msg.Content copy(Msg.Content $this$copy, Function1<? super MsgKt.ContentKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MsgKt.ContentKt.Dsl.Companion companion = MsgKt.ContentKt.Dsl.INSTANCE;
        Msg.Content.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        MsgKt.ContentKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Msg.Sender copy(Msg.Sender $this$copy, Function1<? super MsgKt.SenderKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        MsgKt.SenderKt.Dsl.Companion companion = MsgKt.SenderKt.Dsl.INSTANCE;
        Msg.Sender.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        MsgKt.SenderKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Msg.Sender getSenderOrNull(MsgOrBuilder $this$senderOrNull) {
        Intrinsics.checkNotNullParameter($this$senderOrNull, "<this>");
        if ($this$senderOrNull.hasSender()) {
            return $this$senderOrNull.getSender();
        }
        return null;
    }

    public static final Msg.Content getContentOrNull(MsgOrBuilder $this$contentOrNull) {
        Intrinsics.checkNotNullParameter($this$contentOrNull, "<this>");
        if ($this$contentOrNull.hasContent()) {
            return $this$contentOrNull.getContent();
        }
        return null;
    }

    public static final Msg.Cmd getCmdOrNull(MsgOrBuilder $this$cmdOrNull) {
        Intrinsics.checkNotNullParameter($this$cmdOrNull, "<this>");
        if ($this$cmdOrNull.hasCmd()) {
            return $this$cmdOrNull.getCmd();
        }
        return null;
    }
}
