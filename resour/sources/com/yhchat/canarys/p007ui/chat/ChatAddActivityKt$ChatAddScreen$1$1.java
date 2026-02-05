package com.yhchat.canarys.p007ui.chat;

import com.yhchat.canarys.data.model.ChatAddInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatAddActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatAddActivityKt$ChatAddScreen$1$1", m185f = "ChatAddActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatAddActivityKt$ChatAddScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ChatAddInfo $chatAddInfo;
    final /* synthetic */ String $shareKey;
    final /* synthetic */ String $shareTs;
    final /* synthetic */ ChatAddViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatAddActivityKt$ChatAddScreen$1$1(ChatAddInfo chatAddInfo, ChatAddViewModel chatAddViewModel, String str, String str2, Continuation<? super ChatAddActivityKt$ChatAddScreen$1$1> continuation) {
        super(2, continuation);
        this.$chatAddInfo = chatAddInfo;
        this.$viewModel = chatAddViewModel;
        this.$shareKey = str;
        this.$shareTs = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatAddActivityKt$ChatAddScreen$1$1(this.$chatAddInfo, this.$viewModel, this.$shareKey, this.$shareTs, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatAddActivityKt$ChatAddScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$chatAddInfo != null) {
                    this.$viewModel.loadChatInfo(this.$chatAddInfo);
                } else if (this.$shareKey != null && this.$shareTs != null) {
                    this.$viewModel.loadShareInfo(this.$shareKey, this.$shareTs);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
