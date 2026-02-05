package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.core.location.LocationRequestCompat;
import com.yhchat.canarys.data.model.BotInstruction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InstructionManagementActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$loadInstructions$1", m185f = "InstructionManagementActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1}, m187l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 106}, m188m = "invokeSuspend", m189n = {"$this$launch", "api", "$this$launch", "api", "token", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-InstructionManagementActivityKt$InstructionManagementScreen$loadInstructions$1$1\\1\\105\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
/* renamed from: com.yhchat.canarys.ui.bot.InstructionManagementActivityKt$InstructionManagementScreen$loadInstructions$1 */
/* loaded from: classes11.dex */
final class C3223xcab7b5a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<List<BotInstruction>> $instructions$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3223xcab7b5a(Context context, MutableState<Boolean> mutableState, MutableState<String> mutableState2, String str, MutableState<List<BotInstruction>> mutableState3, Continuation<? super C3223xcab7b5a> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$isLoading$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$botId = str;
        this.$instructions$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C3223xcab7b5a c3223xcab7b5a = new C3223xcab7b5a(this.$context, this.$isLoading$delegate, this.$error$delegate, this.$botId, this.$instructions$delegate, continuation);
        c3223xcab7b5a.L$0 = obj;
        return c3223xcab7b5a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C3223xcab7b5a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0120  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.C3223xcab7b5a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
