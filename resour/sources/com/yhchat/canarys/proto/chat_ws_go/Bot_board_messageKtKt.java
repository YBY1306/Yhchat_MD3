package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.bot_board_message;
import com.yhchat.canarys.proto.chat_ws_go.bot_board_messageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: bot_board_messageKt.kt */
@Metadata(m168d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\t*\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0019"}, m169d2 = {"botBoardMessage", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializebotBoardMessage", "copy", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData;", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$Dsl;", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent;", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageKt$BoardDataKt$BoardContentKt$Dsl;", "boardOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardDataOrBuilder;", "getBoardOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardDataOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData$BoardContent;", "infoOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageOrBuilder;", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_messageOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/bot_board_message$BoardData;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class Bot_board_messageKtKt {
    /* renamed from: -initializebotBoardMessage */
    public static final bot_board_message m8989initializebotBoardMessage(Function1<? super bot_board_messageKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        bot_board_messageKt.Dsl.Companion companion = bot_board_messageKt.Dsl.INSTANCE;
        bot_board_message.Builder builderNewBuilder = bot_board_message.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        bot_board_messageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final bot_board_message copy(bot_board_message $this$copy, Function1<? super bot_board_messageKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        bot_board_messageKt.Dsl.Companion companion = bot_board_messageKt.Dsl.INSTANCE;
        bot_board_message.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        bot_board_messageKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final bot_board_message.BoardData copy(bot_board_message.BoardData $this$copy, Function1<? super bot_board_messageKt.BoardDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        bot_board_messageKt.BoardDataKt.Dsl.Companion companion = bot_board_messageKt.BoardDataKt.Dsl.INSTANCE;
        bot_board_message.BoardData.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        bot_board_messageKt.BoardDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final bot_board_message.BoardData.BoardContent copy(bot_board_message.BoardData.BoardContent $this$copy, Function1<? super bot_board_messageKt.BoardDataKt.BoardContentKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        bot_board_messageKt.BoardDataKt.BoardContentKt.Dsl.Companion companion = bot_board_messageKt.BoardDataKt.BoardContentKt.Dsl.INSTANCE;
        bot_board_message.BoardData.BoardContent.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        bot_board_messageKt.BoardDataKt.BoardContentKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final bot_board_message.BoardData.BoardContent getBoardOrNull(bot_board_message.BoardDataOrBuilder $this$boardOrNull) {
        Intrinsics.checkNotNullParameter($this$boardOrNull, "<this>");
        if ($this$boardOrNull.hasBoard()) {
            return $this$boardOrNull.getBoard();
        }
        return null;
    }

    public static final INFO getInfoOrNull(bot_board_messageOrBuilder $this$infoOrNull) {
        Intrinsics.checkNotNullParameter($this$infoOrNull, "<this>");
        if ($this$infoOrNull.hasInfo()) {
            return $this$infoOrNull.getInfo();
        }
        return null;
    }

    public static final bot_board_message.BoardData getDataOrNull(bot_board_messageOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
