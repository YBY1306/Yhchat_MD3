package com.yhchat.canarys.proto.group;

import com.yhchat.canarys.proto.group.bot_list;
import com.yhchat.canarys.proto.group.bot_listKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: bot_listKt.kt */
@Metadata(m168d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0012"}, m169d2 = {"botList", "Lcom/yhchat/canarys/proto/group/bot_list;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/group/bot_listKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializebotList", "copy", "Lcom/yhchat/canarys/proto/group/bot_list$Instruction_data;", "Lcom/yhchat/canarys/proto/group/bot_listKt$Instruction_dataKt$Dsl;", "Lcom/yhchat/canarys/proto/group/bot_list$Menu_data;", "Lcom/yhchat/canarys/proto/group/bot_listKt$Menu_dataKt$Dsl;", "statusOrNull", "Lcom/yhchat/canarys/proto/group/Status;", "Lcom/yhchat/canarys/proto/group/bot_listOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/group/bot_listOrBuilder;)Lcom/yhchat/canarys/proto/group/Status;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class Bot_listKtKt {
    /* renamed from: -initializebotList */
    public static final bot_list m9523initializebotList(Function1<? super bot_listKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        bot_listKt.Dsl.Companion companion = bot_listKt.Dsl.INSTANCE;
        bot_list.Builder builderNewBuilder = bot_list.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        bot_listKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final bot_list copy(bot_list $this$copy, Function1<? super bot_listKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        bot_listKt.Dsl.Companion companion = bot_listKt.Dsl.INSTANCE;
        bot_list.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        bot_listKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final bot_list.Instruction_data copy(bot_list.Instruction_data $this$copy, Function1<? super bot_listKt.Instruction_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        bot_listKt.Instruction_dataKt.Dsl.Companion companion = bot_listKt.Instruction_dataKt.Dsl.INSTANCE;
        bot_list.Instruction_data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        bot_listKt.Instruction_dataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final bot_list.Menu_data copy(bot_list.Menu_data $this$copy, Function1<? super bot_listKt.Menu_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        bot_listKt.Menu_dataKt.Dsl.Companion companion = bot_listKt.Menu_dataKt.Dsl.INSTANCE;
        bot_list.Menu_data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        bot_listKt.Menu_dataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Status getStatusOrNull(bot_listOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }
}
