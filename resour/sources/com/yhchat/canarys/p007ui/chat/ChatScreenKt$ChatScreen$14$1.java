package com.yhchat.canarys.p007ui.chat;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatScreenKt$ChatScreen$14$1", m185f = "ChatScreen.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatScreenKt$ChatScreen$14$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Uri $fileUriToSend;
    final /* synthetic */ Function0<Unit> $onFileSent;
    final /* synthetic */ MutableState<String> $quotedMessageId$delegate;
    final /* synthetic */ MutableState<String> $quotedMessageText$delegate;
    final /* synthetic */ ChatViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatScreenKt$ChatScreen$14$1(Uri uri, ChatViewModel chatViewModel, Context context, Function0<Unit> function0, MutableState<String> mutableState, MutableState<String> mutableState2, Continuation<? super ChatScreenKt$ChatScreen$14$1> continuation) {
        super(2, continuation);
        this.$fileUriToSend = uri;
        this.$viewModel = chatViewModel;
        this.$context = context;
        this.$onFileSent = function0;
        this.$quotedMessageId$delegate = mutableState;
        this.$quotedMessageText$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatScreenKt$ChatScreen$14$1(this.$fileUriToSend, this.$viewModel, this.$context, this.$onFileSent, this.$quotedMessageId$delegate, this.$quotedMessageText$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatScreenKt$ChatScreen$14$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Uri uri = this.$fileUriToSend;
                if (uri != null) {
                    ChatViewModel chatViewModel = this.$viewModel;
                    Context context = this.$context;
                    Function0<Unit> function0 = this.$onFileSent;
                    MutableState<String> mutableState = this.$quotedMessageId$delegate;
                    MutableState<String> mutableState2 = this.$quotedMessageText$delegate;
                    Log.d("ChatScreen", "\u1f4c1 \u6536\u5230\u5f85\u53d1\u9001\u7684\u6587\u4ef6URI: " + uri);
                    chatViewModel.uploadAndSendFile(context, uri, ChatScreenKt.ChatScreen$lambda$45(mutableState), ChatScreenKt.ChatScreen$lambda$48(mutableState2));
                    mutableState.setValue(null);
                    mutableState2.setValue(null);
                    function0.invoke();
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
