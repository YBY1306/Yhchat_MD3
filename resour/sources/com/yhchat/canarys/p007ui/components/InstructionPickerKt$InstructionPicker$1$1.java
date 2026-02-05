package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstructionPicker.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.components.InstructionPickerKt$InstructionPicker$1$1", m185f = "InstructionPicker.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes5.dex */
final class InstructionPickerKt$InstructionPicker$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $groupId;
    final /* synthetic */ InstructionPickerViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstructionPickerKt$InstructionPicker$1$1(InstructionPickerViewModel instructionPickerViewModel, Context context, String str, String str2, Continuation<? super InstructionPickerKt$InstructionPicker$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = instructionPickerViewModel;
        this.$context = context;
        this.$groupId = str;
        this.$botId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InstructionPickerKt$InstructionPicker$1$1(this.$viewModel, this.$context, this.$groupId, this.$botId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InstructionPickerKt$InstructionPicker$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$viewModel.init(this.$context);
                if (this.$groupId != null) {
                    this.$viewModel.loadGroupInstructions(this.$groupId);
                } else if (this.$botId != null) {
                    this.$viewModel.loadBotInstructions(this.$botId);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
