package com.yhchat.canarys.p007ui.chat;

import androidx.compose.p000ui.focus.FocusRequester;
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

/* compiled from: ChatScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$5$1$1", m185f = "ChatScreen.kt", m186i = {}, m187l = {801}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$5$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FocusRequester $inputFocusRequester;
    final /* synthetic */ MutableState<Boolean> $shouldShowKeyboard$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$5$1$1(FocusRequester focusRequester, MutableState<Boolean> mutableState, Continuation<? super ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$5$1$1> continuation) {
        super(2, continuation);
        this.$inputFocusRequester = focusRequester;
        this.$shouldShowKeyboard$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$5$1$1(this.$inputFocusRequester, this.$shouldShowKeyboard$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$5$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                FocusRequester.m4720requestFocus3ESFkO8$default(this.$inputFocusRequester, 0, 1, null);
                ChatScreenKt.ChatScreen$lambda$59(this.$shouldShowKeyboard$delegate, true);
                this.label = 1;
                if (DelayKt.delay(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ChatScreenKt.ChatScreen$lambda$59(this.$shouldShowKeyboard$delegate, false);
        return Unit.INSTANCE;
    }
}
