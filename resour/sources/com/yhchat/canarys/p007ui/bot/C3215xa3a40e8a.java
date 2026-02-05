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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstructionEditActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.InstructionEditActivityKt$InstructionEditScreen$saveInstruction$1", m185f = "InstructionEditActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m187l = {157, 163, 177}, m188m = "invokeSuspend", m189n = {"$this$launch", "api", "$this$launch", "api", "token", "customJson", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-InstructionEditActivityKt$InstructionEditScreen$saveInstruction$1$1\\1\\161\\0", "$this$launch", "api", "token", "customJson", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-InstructionEditActivityKt$InstructionEditScreen$saveInstruction$1$1\\1\\161\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, m192v = 1)
/* renamed from: com.yhchat.canarys.ui.bot.InstructionEditActivityKt$InstructionEditScreen$saveInstruction$1 */
/* loaded from: classes11.dex */
final class C3215xa3a40e8a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<List<InstructionFormField>> $customFields$delegate;
    final /* synthetic */ MutableState<String> $defaultText$delegate;
    final /* synthetic */ MutableState<String> $desc$delegate;
    final /* synthetic */ MutableState<String> $hintText$delegate;
    final /* synthetic */ MutableState<BotInstruction> $instruction$delegate;
    final /* synthetic */ MutableState<Integer> $instructionType$delegate;
    final /* synthetic */ boolean $isEdit;
    final /* synthetic */ MutableState<Boolean> $isSaving$delegate;
    final /* synthetic */ MutableState<String> $name$delegate;
    final /* synthetic */ Function0<Unit> $onSaveSuccess;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3215xa3a40e8a(Context context, MutableState<Boolean> mutableState, MutableState<Integer> mutableState2, MutableState<List<InstructionFormField>> mutableState3, boolean z, String str, MutableState<BotInstruction> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, MutableState<String> mutableState7, MutableState<String> mutableState8, Function0<Unit> function0, Continuation<? super C3215xa3a40e8a> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$isSaving$delegate = mutableState;
        this.$instructionType$delegate = mutableState2;
        this.$customFields$delegate = mutableState3;
        this.$isEdit = z;
        this.$botId = str;
        this.$instruction$delegate = mutableState4;
        this.$name$delegate = mutableState5;
        this.$desc$delegate = mutableState6;
        this.$hintText$delegate = mutableState7;
        this.$defaultText$delegate = mutableState8;
        this.$onSaveSuccess = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C3215xa3a40e8a c3215xa3a40e8a = new C3215xa3a40e8a(this.$context, this.$isSaving$delegate, this.$instructionType$delegate, this.$customFields$delegate, this.$isEdit, this.$botId, this.$instruction$delegate, this.$name$delegate, this.$desc$delegate, this.$hintText$delegate, this.$defaultText$delegate, this.$onSaveSuccess, continuation);
        c3215xa3a40e8a.L$0 = obj;
        return c3215xa3a40e8a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C3215xa3a40e8a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException
        */
    /* JADX WARN: Failed to apply debug info
    java.lang.NullPointerException
     */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x01d7: MOVE (r6 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY] A[D('customJson' java.lang.String)]), block:B:69:0x01d7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.C3215xa3a40e8a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
