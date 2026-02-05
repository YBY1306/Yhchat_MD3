package com.yhchat.canarys.data.websocket;

import com.yhchat.canarys.data.model.Conversation;
import com.yhchat.canarys.data.repository.CacheRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WebSocketService.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "", "Lcom/yhchat/canarys/data/model/Conversation;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketService$getConversationTitle$cachedConversations$1", m185f = "WebSocketService.kt", m186i = {}, m187l = {614}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes17.dex */
final class WebSocketService$getConversationTitle$cachedConversations$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Conversation>>, Object> {
    final /* synthetic */ CacheRepository $cacheRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketService$getConversationTitle$cachedConversations$1(CacheRepository cacheRepository, Continuation<? super WebSocketService$getConversationTitle$cachedConversations$1> continuation) {
        super(2, continuation);
        this.$cacheRepository = cacheRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebSocketService$getConversationTitle$cachedConversations$1(this.$cacheRepository, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Conversation>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<Conversation>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<Conversation>> continuation) {
        return ((WebSocketService$getConversationTitle$cachedConversations$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                Object cachedConversationsSync = this.$cacheRepository.getCachedConversationsSync(this);
                if (cachedConversationsSync == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return cachedConversationsSync;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
