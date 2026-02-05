package com.yhchat.canarys.p007ui.profile;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: EmailBindingActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.EmailBindingActivityKt$EmailBindingScreen$2$1", m185f = "EmailBindingActivity.kt", m186i = {}, m187l = {103}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes16.dex */
final class EmailBindingActivityKt$EmailBindingScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Integer> $emailCodeCountdown$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailBindingActivityKt$EmailBindingScreen$2$1(MutableState<Integer> mutableState, Continuation<? super EmailBindingActivityKt$EmailBindingScreen$2$1> continuation) {
        super(2, continuation);
        this.$emailCodeCountdown$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmailBindingActivityKt$EmailBindingScreen$2$1(this.$emailCodeCountdown$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmailBindingActivityKt$EmailBindingScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (EmailBindingActivityKt.EmailBindingScreen$lambda$22(this.$emailCodeCountdown$delegate) > 0) {
                    this.label = 1;
                    if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    EmailBindingActivityKt.EmailBindingScreen$lambda$23(this.$emailCodeCountdown$delegate, EmailBindingActivityKt.EmailBindingScreen$lambda$22(this.$emailCodeCountdown$delegate) - 1);
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure($result);
                EmailBindingActivityKt.EmailBindingScreen$lambda$23(this.$emailCodeCountdown$delegate, EmailBindingActivityKt.EmailBindingScreen$lambda$22(this.$emailCodeCountdown$delegate) - 1);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
