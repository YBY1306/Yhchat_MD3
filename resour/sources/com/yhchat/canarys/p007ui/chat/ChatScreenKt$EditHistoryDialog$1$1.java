package com.yhchat.canarys.p007ui.chat;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.MessageEditRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatScreenKt$EditHistoryDialog$1$1", m185f = "ChatScreen.kt", m186i = {}, m187l = {2624}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatScreenKt$EditHistoryDialog$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<MessageEditRecord>> $editRecords$delegate;
    final /* synthetic */ MutableState<String> $errorMessage$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ String $msgId;
    final /* synthetic */ ChatViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatScreenKt$EditHistoryDialog$1$1(ChatViewModel chatViewModel, String str, MutableState<Boolean> mutableState, MutableState<List<MessageEditRecord>> mutableState2, MutableState<String> mutableState3, Continuation<? super ChatScreenKt$EditHistoryDialog$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = chatViewModel;
        this.$msgId = str;
        this.$isLoading$delegate = mutableState;
        this.$editRecords$delegate = mutableState2;
        this.$errorMessage$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatScreenKt$EditHistoryDialog$1$1(this.$viewModel, this.$msgId, this.$isLoading$delegate, this.$editRecords$delegate, this.$errorMessage$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatScreenKt$EditHistoryDialog$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ChatScreenKt.EditHistoryDialog$lambda$5(this.$isLoading$delegate, true);
                this.label = 1;
                Object objM10619getMessageEditHistorygIAlus = this.$viewModel.m10619getMessageEditHistorygIAlus(this.$msgId, this);
                if (objM10619getMessageEditHistorygIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                result = objM10619getMessageEditHistorygIAlus;
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                result = ((Result) $result).getValue();
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MutableState<List<MessageEditRecord>> mutableState = this.$editRecords$delegate;
        MutableState<Boolean> mutableState2 = this.$isLoading$delegate;
        MutableState<String> mutableState3 = this.$errorMessage$delegate;
        MutableState<Boolean> mutableState4 = this.$isLoading$delegate;
        Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
        if (thM11922exceptionOrNullimpl == null) {
            mutableState.setValue((List) result);
            ChatScreenKt.EditHistoryDialog$lambda$5(mutableState2, false);
        } else {
            mutableState3.setValue(thM11922exceptionOrNullimpl.getMessage());
            ChatScreenKt.EditHistoryDialog$lambda$5(mutableState4, false);
        }
        return Unit.INSTANCE;
    }
}
