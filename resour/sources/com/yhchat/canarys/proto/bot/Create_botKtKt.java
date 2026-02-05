package com.yhchat.canarys.proto.bot;

import com.yhchat.canarys.proto.bot.Bot;
import com.yhchat.canarys.proto.bot.create_botKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: create_botKt.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\t*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0013"}, m169d2 = {"createBot", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/bot/create_botKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializecreateBot", "copy", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData;", "Lcom/yhchat/canarys/proto/bot/create_botKt$BotDataKt$Dsl;", "statusOrNull", "Lcom/yhchat/canarys/proto/bot/Bot$Status;", "Lcom/yhchat/canarys/proto/bot/Bot$create_botOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/bot/Bot$create_botOrBuilder;)Lcom/yhchat/canarys/proto/bot/Bot$Status;", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/bot/Bot$create_botOrBuilder;)Lcom/yhchat/canarys/proto/bot/Bot$create_bot$BotData;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class Create_botKtKt {
    /* renamed from: -initializecreateBot */
    public static final Bot.create_bot m8968initializecreateBot(Function1<? super create_botKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        create_botKt.Dsl.Companion companion = create_botKt.Dsl.INSTANCE;
        Bot.create_bot.Builder builderNewBuilder = Bot.create_bot.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        create_botKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot.create_bot copy(Bot.create_bot $this$copy, Function1<? super create_botKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        create_botKt.Dsl.Companion companion = create_botKt.Dsl.INSTANCE;
        Bot.create_bot.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        create_botKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot.create_bot.BotData copy(Bot.create_bot.BotData $this$copy, Function1<? super create_botKt.BotDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        create_botKt.BotDataKt.Dsl.Companion companion = create_botKt.BotDataKt.Dsl.INSTANCE;
        Bot.create_bot.BotData.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        create_botKt.BotDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot.Status getStatusOrNull(Bot.create_botOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }

    public static final Bot.create_bot.BotData getDataOrNull(Bot.create_botOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
