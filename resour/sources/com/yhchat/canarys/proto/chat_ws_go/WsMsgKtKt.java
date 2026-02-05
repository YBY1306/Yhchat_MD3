package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.WsMsg;
import com.yhchat.canarys.proto.chat_ws_go.WsMsgKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WsMsgKt.kt */
@Metadata(m168d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\r*\u00020\r2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000b*\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u0017\u0010\u0013\u001a\u0004\u0018\u00010\r*\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\t*\u00020\u00108F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0019"}, m169d2 = {"wsMsg", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializewsMsg", "copy", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsCmdKt$Dsl;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsSenderKt$Dsl;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsContentKt$Dsl;", "senderOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgOrBuilder;", "getSenderOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender;", "contentOrNull", "getContentOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent;", "cmdOrNull", "getCmdOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class WsMsgKtKt {
    /* renamed from: -initializewsMsg */
    public static final WsMsg m9134initializewsMsg(Function1<? super WsMsgKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        WsMsgKt.Dsl.Companion companion = WsMsgKt.Dsl.INSTANCE;
        WsMsg.Builder builderNewBuilder = WsMsg.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        WsMsgKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WsMsg copy(WsMsg $this$copy, Function1<? super WsMsgKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        WsMsgKt.Dsl.Companion companion = WsMsgKt.Dsl.INSTANCE;
        WsMsg.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        WsMsgKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WsMsg.WsCmd copy(WsMsg.WsCmd $this$copy, Function1<? super WsMsgKt.WsCmdKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        WsMsgKt.WsCmdKt.Dsl.Companion companion = WsMsgKt.WsCmdKt.Dsl.INSTANCE;
        WsMsg.WsCmd.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        WsMsgKt.WsCmdKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WsMsg.WsSender copy(WsMsg.WsSender $this$copy, Function1<? super WsMsgKt.WsSenderKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        WsMsgKt.WsSenderKt.Dsl.Companion companion = WsMsgKt.WsSenderKt.Dsl.INSTANCE;
        WsMsg.WsSender.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        WsMsgKt.WsSenderKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WsMsg.WsContent copy(WsMsg.WsContent $this$copy, Function1<? super WsMsgKt.WsContentKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        WsMsgKt.WsContentKt.Dsl.Companion companion = WsMsgKt.WsContentKt.Dsl.INSTANCE;
        WsMsg.WsContent.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        WsMsgKt.WsContentKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final WsMsg.WsSender getSenderOrNull(WsMsgOrBuilder $this$senderOrNull) {
        Intrinsics.checkNotNullParameter($this$senderOrNull, "<this>");
        if ($this$senderOrNull.hasSender()) {
            return $this$senderOrNull.getSender();
        }
        return null;
    }

    public static final WsMsg.WsContent getContentOrNull(WsMsgOrBuilder $this$contentOrNull) {
        Intrinsics.checkNotNullParameter($this$contentOrNull, "<this>");
        if ($this$contentOrNull.hasContent()) {
            return $this$contentOrNull.getContent();
        }
        return null;
    }

    public static final WsMsg.WsCmd getCmdOrNull(WsMsgOrBuilder $this$cmdOrNull) {
        Intrinsics.checkNotNullParameter($this$cmdOrNull, "<this>");
        if ($this$cmdOrNull.hasCmd()) {
            return $this$cmdOrNull.getCmd();
        }
        return null;
    }
}
