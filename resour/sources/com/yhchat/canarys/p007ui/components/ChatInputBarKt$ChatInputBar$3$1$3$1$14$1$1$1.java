package com.yhchat.canarys.p007ui.components;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatInputBar.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ChatInputBarKt$ChatInputBar$3$1$3$1$14$1$1$1", m185f = "ChatInputBar.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes5.dex */
final class ChatInputBarKt$ChatInputBar$3$1$3$1$14$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<Function0<Unit>> $currentOnSendMessage$delegate;
    final /* synthetic */ Function1<Integer, Unit> $mtc;
    final /* synthetic */ int $previousType;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChatInputBarKt$ChatInputBar$3$1$3$1$14$1$1$1(int i, Function1<? super Integer, Unit> function1, State<? extends Function0<Unit>> state, Continuation<? super ChatInputBarKt$ChatInputBar$3$1$3$1$14$1$1$1> continuation) {
        super(2, continuation);
        this.$previousType = i;
        this.$mtc = function1;
        this.$currentOnSendMessage$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatInputBarKt$ChatInputBar$3$1$3$1$14$1$1$1(this.$previousType, this.$mtc, this.$currentOnSendMessage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatInputBarKt$ChatInputBar$3$1$3$1$14$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$previousType != 3) {
                    this.$mtc.invoke(Boxing.boxInt(3));
                }
                ChatInputBarKt.ChatInputBar$lambda$27(this.$currentOnSendMessage$delegate).invoke();
                if (this.$previousType != 3) {
                    this.$mtc.invoke(Boxing.boxInt(this.$previousType));
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
