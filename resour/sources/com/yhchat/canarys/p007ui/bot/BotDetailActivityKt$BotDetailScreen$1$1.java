package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.Conversation;
import com.yhchat.canarys.data.repository.CacheRepository;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotDetailActivityKt$BotDetailScreen$1$1", m185f = "BotDetailActivity.kt", m186i = {}, m187l = {159}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes11.dex */
final class BotDetailActivityKt$BotDetailScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $isNoNotify$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotDetailActivityKt$BotDetailScreen$1$1(Context context, String str, MutableState<Boolean> mutableState, Continuation<? super BotDetailActivityKt$BotDetailScreen$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$botId = str;
        this.$isNoNotify$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotDetailActivityKt$BotDetailScreen$1$1(this.$context, this.$botId, this.$isNoNotify$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotDetailActivityKt$BotDetailScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                this.label = 1;
                cachedConversationsSync = new CacheRepository(this.$context).getCachedConversationsSync(this);
                if (cachedConversationsSync == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                cachedConversationsSync = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String str = this.$botId;
        Iterator it = ((Iterable) cachedConversationsSync).iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                Conversation conversation = (Conversation) next;
                if (((Intrinsics.areEqual(conversation.getChatId(), str) && conversation.getChatType() == 3) ? 1 : null) != null) {
                }
            } else {
                next = null;
            }
        }
        Conversation cachedConversation = (Conversation) next;
        BotDetailActivityKt.BotDetailScreen$lambda$18(this.$isNoNotify$delegate, (cachedConversation == null || (doNotDisturb = cachedConversation.getDoNotDisturb()) == null || doNotDisturb.intValue() != 1) ? false : true);
        return Unit.INSTANCE;
    }
}
