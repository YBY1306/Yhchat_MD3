package com.yhchat.canarys.proto.instruction;

import com.yhchat.canarys.proto.instruction.instruction_list;
import com.yhchat.canarys.proto.instruction.instruction_listKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: instruction_listKt.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0010"}, m169d2 = {"instructionList", "Lcom/yhchat/canarys/proto/instruction/instruction_list;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/instruction/instruction_listKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeinstructionList", "copy", "Lcom/yhchat/canarys/proto/instruction/instruction_list$Data;", "Lcom/yhchat/canarys/proto/instruction/instruction_listKt$DataKt$Dsl;", "statusOrNull", "Lcom/yhchat/canarys/proto/instruction/Status;", "Lcom/yhchat/canarys/proto/instruction/instruction_listOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/instruction/instruction_listOrBuilder;)Lcom/yhchat/canarys/proto/instruction/Status;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes17.dex */
public final class Instruction_listKtKt {
    /* renamed from: -initializeinstructionList */
    public static final instruction_list m9860initializeinstructionList(Function1<? super instruction_listKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        instruction_listKt.Dsl.Companion companion = instruction_listKt.Dsl.INSTANCE;
        instruction_list.Builder builderNewBuilder = instruction_list.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        instruction_listKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final instruction_list copy(instruction_list $this$copy, Function1<? super instruction_listKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        instruction_listKt.Dsl.Companion companion = instruction_listKt.Dsl.INSTANCE;
        instruction_list.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        instruction_listKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final instruction_list.Data copy(instruction_list.Data $this$copy, Function1<? super instruction_listKt.DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        instruction_listKt.DataKt.Dsl.Companion companion = instruction_listKt.DataKt.Dsl.INSTANCE;
        instruction_list.Data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        instruction_listKt.DataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Status getStatusOrNull(instruction_listOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }
}
