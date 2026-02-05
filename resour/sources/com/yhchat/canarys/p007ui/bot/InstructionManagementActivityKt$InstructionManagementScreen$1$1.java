package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.BotInstruction;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstructionManagementActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$1$1", m185f = "InstructionManagementActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes11.dex */
final class InstructionManagementActivityKt$InstructionManagementScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<List<BotInstruction>> $instructions$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ CoroutineScope $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstructionManagementActivityKt$InstructionManagementScreen$1$1(CoroutineScope coroutineScope, Context context, MutableState<Boolean> mutableState, MutableState<String> mutableState2, String str, MutableState<List<BotInstruction>> mutableState3, Continuation<? super InstructionManagementActivityKt$InstructionManagementScreen$1$1> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
        this.$context = context;
        this.$isLoading$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$botId = str;
        this.$instructions$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InstructionManagementActivityKt$InstructionManagementScreen$1$1(this.$scope, this.$context, this.$isLoading$delegate, this.$error$delegate, this.$botId, this.$instructions$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InstructionManagementActivityKt$InstructionManagementScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                InstructionManagementActivityKt.InstructionManagementScreen$loadInstructions(this.$scope, this.$context, this.$isLoading$delegate, this.$error$delegate, this.$botId, this.$instructions$delegate);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
