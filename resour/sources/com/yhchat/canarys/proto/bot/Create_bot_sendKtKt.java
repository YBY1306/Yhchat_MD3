package com.yhchat.canarys.proto.bot;

import com.yhchat.canarys.proto.bot.Bot;
import com.yhchat.canarys.proto.bot.create_bot_sendKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: create_bot_sendKt.kt */
@Metadata(m168d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\t"}, m169d2 = {"createBotSend", "Lcom/yhchat/canarys/proto/bot/Bot$create_bot_send;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/bot/create_bot_sendKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializecreateBotSend", "copy", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class Create_bot_sendKtKt {
    /* renamed from: -initializecreateBotSend, reason: not valid java name */
    public static final Bot.create_bot_send m8969initializecreateBotSend(Function1<? super create_bot_sendKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        create_bot_sendKt.Dsl.Companion companion = create_bot_sendKt.Dsl.INSTANCE;
        Bot.create_bot_send.Builder builderNewBuilder = Bot.create_bot_send.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        create_bot_sendKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot.create_bot_send copy(Bot.create_bot_send $this$copy, Function1<? super create_bot_sendKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        create_bot_sendKt.Dsl.Companion companion = create_bot_sendKt.Dsl.INSTANCE;
        Bot.create_bot_send.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        create_bot_sendKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
