package com.yhchat.canarys.data.websocket;

import com.yhchat.canarys.data.model.Conversation;
import com.yhchat.canarys.data.repository.CacheRepository;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WebSocketService.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.websocket.WebSocketService$showMessageNotification$isMuted$1", m185f = "WebSocketService.kt", m186i = {0}, m187l = {537}, m188m = "invokeSuspend", m189n = {"cacheRepository"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes17.dex */
final class WebSocketService$showMessageNotification$isMuted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ String $targetChatId;
    final /* synthetic */ int $targetChatType;
    Object L$0;
    int label;
    final /* synthetic */ WebSocketService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WebSocketService$showMessageNotification$isMuted$1(WebSocketService webSocketService, String str, int i, Continuation<? super WebSocketService$showMessageNotification$isMuted$1> continuation) {
        super(2, continuation);
        this.this$0 = webSocketService;
        this.$targetChatId = str;
        this.$targetChatType = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebSocketService$showMessageNotification$isMuted$1(this.this$0, this.$targetChatId, this.$targetChatType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((WebSocketService$showMessageNotification$isMuted$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object cachedConversationsSync;
        Object next;
        Integer doNotDisturb;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                CacheRepository cacheRepository = new CacheRepository(this.this$0.context);
                this.L$0 = SpillingKt.nullOutSpilledVariable(cacheRepository);
                this.label = 1;
                cachedConversationsSync = cacheRepository.getCachedConversationsSync(this);
                if (cachedConversationsSync != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                cachedConversationsSync = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = this.$targetChatId;
        int i = this.$targetChatType;
        Iterator it = ((Iterable) cachedConversationsSync).iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                Conversation conversation = (Conversation) next;
                if (((Intrinsics.areEqual(conversation.getChatId(), str) && conversation.getChatType() == i) ? 1 : null) != null) {
                }
            } else {
                next = null;
            }
        }
        Conversation conversation2 = (Conversation) next;
        return Boxing.boxBoolean((conversation2 == null || (doNotDisturb = conversation2.getDoNotDisturb()) == null || doNotDisturb.intValue() != 1) ? false : true);
    }
}
