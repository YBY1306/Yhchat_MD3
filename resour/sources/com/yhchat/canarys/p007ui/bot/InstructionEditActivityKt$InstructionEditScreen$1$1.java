package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.BotInstruction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstructionEditActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.InstructionEditActivityKt$InstructionEditScreen$1$1", m185f = "InstructionEditActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1}, m187l = {109, 113}, m188m = "invokeSuspend", m189n = {"$this$LaunchedEffect", "api", "$this$LaunchedEffect", "api", "token", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-InstructionEditActivityKt$InstructionEditScreen$1$1$1\\1\\112\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
/* loaded from: classes11.dex */
final class InstructionEditActivityKt$InstructionEditScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<List<InstructionFormField>> $customFields$delegate;
    final /* synthetic */ MutableState<String> $defaultText$delegate;
    final /* synthetic */ MutableState<String> $desc$delegate;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<String> $hintText$delegate;
    final /* synthetic */ MutableState<BotInstruction> $instruction$delegate;
    final /* synthetic */ Integer $instructionId;
    final /* synthetic */ MutableState<Integer> $instructionType$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ MutableState<String> $name$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstructionEditActivityKt$InstructionEditScreen$1$1(Integer num, Context context, MutableState<Boolean> mutableState, MutableState<String> mutableState2, String str, MutableState<BotInstruction> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<Integer> mutableState6, MutableState<String> mutableState7, MutableState<String> mutableState8, MutableState<List<InstructionFormField>> mutableState9, Continuation<? super InstructionEditActivityKt$InstructionEditScreen$1$1> continuation) {
        super(2, continuation);
        this.$instructionId = num;
        this.$context = context;
        this.$isLoading$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$botId = str;
        this.$instruction$delegate = mutableState3;
        this.$name$delegate = mutableState4;
        this.$desc$delegate = mutableState5;
        this.$instructionType$delegate = mutableState6;
        this.$hintText$delegate = mutableState7;
        this.$defaultText$delegate = mutableState8;
        this.$customFields$delegate = mutableState9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InstructionEditActivityKt$InstructionEditScreen$1$1 instructionEditActivityKt$InstructionEditScreen$1$1 = new InstructionEditActivityKt$InstructionEditScreen$1$1(this.$instructionId, this.$context, this.$isLoading$delegate, this.$error$delegate, this.$botId, this.$instruction$delegate, this.$name$delegate, this.$desc$delegate, this.$instructionType$delegate, this.$hintText$delegate, this.$defaultText$delegate, this.$customFields$delegate, continuation);
        instructionEditActivityKt$InstructionEditScreen$1$1.L$0 = obj;
        return instructionEditActivityKt$InstructionEditScreen$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InstructionEditActivityKt$InstructionEditScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bd  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.InstructionEditActivityKt$InstructionEditScreen$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
