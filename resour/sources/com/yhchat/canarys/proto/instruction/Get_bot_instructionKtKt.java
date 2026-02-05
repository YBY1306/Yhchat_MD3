package com.yhchat.canarys.proto.instruction;

import com.yhchat.canarys.proto.instruction.get_bot_instruction;
import com.yhchat.canarys.proto.instruction.get_bot_instructionKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: get_bot_instructionKt.kt */
@Metadata(m168d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\t"}, m169d2 = {"getBotInstruction", "Lcom/yhchat/canarys/proto/instruction/get_bot_instruction;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/instruction/get_bot_instructionKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializegetBotInstruction", "copy", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public final class Get_bot_instructionKtKt {
    /* renamed from: -initializegetBotInstruction, reason: not valid java name */
    public static final get_bot_instruction m9859initializegetBotInstruction(Function1<? super get_bot_instructionKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        get_bot_instructionKt.Dsl.Companion companion = get_bot_instructionKt.Dsl.INSTANCE;
        get_bot_instruction.Builder builderNewBuilder = get_bot_instruction.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        get_bot_instructionKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final get_bot_instruction copy(get_bot_instruction $this$copy, Function1<? super get_bot_instructionKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        get_bot_instructionKt.Dsl.Companion companion = get_bot_instructionKt.Dsl.INSTANCE;
        get_bot_instruction.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        get_bot_instructionKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
