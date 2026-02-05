package com.yhchat.canarys.proto.bot;

import com.yhchat.canarys.proto.bot.Bot;
import com.yhchat.canarys.proto.bot.bot_infoKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: bot_infoKt.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\t*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0013"}, m169d2 = {"botInfo", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/bot/bot_infoKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializebotInfo", "copy", "Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data;", "Lcom/yhchat/canarys/proto/bot/bot_infoKt$Bot_dataKt$Dsl;", "statusOrNull", "Lcom/yhchat/canarys/proto/bot/Bot$Status;", "Lcom/yhchat/canarys/proto/bot/Bot$bot_infoOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/bot/Bot$bot_infoOrBuilder;)Lcom/yhchat/canarys/proto/bot/Bot$Status;", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/bot/Bot$bot_infoOrBuilder;)Lcom/yhchat/canarys/proto/bot/Bot$bot_info$Bot_data;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class Bot_infoKtKt {
    /* renamed from: -initializebotInfo */
    public static final Bot.bot_info m8965initializebotInfo(Function1<? super bot_infoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        bot_infoKt.Dsl.Companion companion = bot_infoKt.Dsl.INSTANCE;
        Bot.bot_info.Builder builderNewBuilder = Bot.bot_info.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        bot_infoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot.bot_info copy(Bot.bot_info $this$copy, Function1<? super bot_infoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        bot_infoKt.Dsl.Companion companion = bot_infoKt.Dsl.INSTANCE;
        Bot.bot_info.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        bot_infoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot.bot_info.Bot_data copy(Bot.bot_info.Bot_data $this$copy, Function1<? super bot_infoKt.Bot_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        bot_infoKt.Bot_dataKt.Dsl.Companion companion = bot_infoKt.Bot_dataKt.Dsl.INSTANCE;
        Bot.bot_info.Bot_data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        bot_infoKt.Bot_dataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot.Status getStatusOrNull(Bot.bot_infoOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }

    public static final Bot.bot_info.Bot_data getDataOrNull(Bot.bot_infoOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
