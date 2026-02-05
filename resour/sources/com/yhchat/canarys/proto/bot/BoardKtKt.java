package com.yhchat.canarys.proto.bot;

import com.yhchat.canarys.proto.bot.Bot;
import com.yhchat.canarys.proto.bot.boardKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: boardKt.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0010"}, m169d2 = {"board", "Lcom/yhchat/canarys/proto/bot/Bot$board;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/bot/boardKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeboard", "copy", "Lcom/yhchat/canarys/proto/bot/Bot$board$Board_data;", "Lcom/yhchat/canarys/proto/bot/boardKt$Board_dataKt$Dsl;", "statusOrNull", "Lcom/yhchat/canarys/proto/bot/Bot$Status;", "Lcom/yhchat/canarys/proto/bot/Bot$boardOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/bot/Bot$boardOrBuilder;)Lcom/yhchat/canarys/proto/bot/Bot$Status;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class BoardKtKt {
    /* renamed from: -initializeboard */
    public static final Bot.board m8842initializeboard(Function1<? super boardKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boardKt.Dsl.Companion companion = boardKt.Dsl.INSTANCE;
        Bot.board.Builder builderNewBuilder = Bot.board.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        boardKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot.board copy(Bot.board $this$copy, Function1<? super boardKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boardKt.Dsl.Companion companion = boardKt.Dsl.INSTANCE;
        Bot.board.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        boardKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot.board.Board_data copy(Bot.board.Board_data $this$copy, Function1<? super boardKt.Board_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boardKt.Board_dataKt.Dsl.Companion companion = boardKt.Board_dataKt.Dsl.INSTANCE;
        Bot.board.Board_data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        boardKt.Board_dataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot.Status getStatusOrNull(Bot.boardOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }
}
