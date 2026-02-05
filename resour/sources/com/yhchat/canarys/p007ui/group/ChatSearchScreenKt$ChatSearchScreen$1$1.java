package com.yhchat.canarys.p007ui.group;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: ChatSearchScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.group.ChatSearchScreenKt$ChatSearchScreen$1$1", m185f = "ChatSearchScreen.kt", m186i = {}, m187l = {64}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes9.dex */
final class ChatSearchScreenKt$ChatSearchScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ int $chatType;
    final /* synthetic */ MutableState<String> $searchQuery$delegate;
    final /* synthetic */ ChatSearchViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatSearchScreenKt$ChatSearchScreen$1$1(ChatSearchViewModel chatSearchViewModel, String str, int i, MutableState<String> mutableState, Continuation<? super ChatSearchScreenKt$ChatSearchScreen$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = chatSearchViewModel;
        this.$chatId = str;
        this.$chatType = i;
        this.$searchQuery$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatSearchScreenKt$ChatSearchScreen$1$1(this.$viewModel, this.$chatId, this.$chatType, this.$searchQuery$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatSearchScreenKt$ChatSearchScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$viewModel.updateSearchQuery(ChatSearchScreenKt.ChatSearchScreen$lambda$2(this.$searchQuery$delegate));
                if (!StringsKt.isBlank(ChatSearchScreenKt.ChatSearchScreen$lambda$2(this.$searchQuery$delegate))) {
                    this.label = 1;
                    if (DelayKt.delay(500L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ChatSearchViewModel.searchMessages$default(this.$viewModel, this.$chatId, this.$chatType, ChatSearchScreenKt.ChatSearchScreen$lambda$2(this.$searchQuery$delegate), false, 8, null);
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure($result);
                ChatSearchViewModel.searchMessages$default(this.$viewModel, this.$chatId, this.$chatType, ChatSearchScreenKt.ChatSearchScreen$lambda$2(this.$searchQuery$delegate), false, 8, null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
