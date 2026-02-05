package com.yhchat.canarys.p007ui.chat;

import android.content.Context;
import android.widget.Toast;
import kotlin.Metadata;
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
@DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatScreenKt$MessageItem$23$1$1", m185f = "ChatScreen.kt", m186i = {}, m187l = {1496}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatScreenKt$MessageItem$23$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $audioUrl;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatScreenKt$MessageItem$23$1$1(Context context, String str, Continuation<? super ChatScreenKt$MessageItem$23$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$audioUrl = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatScreenKt$MessageItem$23$1$1(this.$context, this.$audioUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatScreenKt$MessageItem$23$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objSaveVoiceToSavedAudios;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                objSaveVoiceToSavedAudios = ChatScreenKt.saveVoiceToSavedAudios(this.$context, this.$audioUrl, this);
                if (objSaveVoiceToSavedAudios == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objSaveVoiceToSavedAudios = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        boolean saved = ((Boolean) objSaveVoiceToSavedAudios).booleanValue();
        Toast.makeText(this.$context, saved ? "\u5df2\u4fdd\u5b58\u8bed\u97f3" : "\u4fdd\u5b58\u5931\u8d25", 0).show();
        return Unit.INSTANCE;
    }
}
