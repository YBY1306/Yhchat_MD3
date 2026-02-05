package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.model.ChatBackground;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatBackgroundRepository.kt */
@Metadata(m168d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/model/ChatBackground;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ChatBackgroundRepository$getChatBackgroundList$2", m185f = "ChatBackgroundRepository.kt", m186i = {1}, m187l = {70, 75}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatBackgroundRepository$getChatBackgroundList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends ChatBackground>>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ ChatBackgroundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatBackgroundRepository$getChatBackgroundList$2(ChatBackgroundRepository chatBackgroundRepository, Continuation<? super ChatBackgroundRepository$getChatBackgroundList$2> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBackgroundRepository$getChatBackgroundList$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends ChatBackground>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<ChatBackground>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<ChatBackground>>> continuation) {
        return ((ChatBackgroundRepository$getChatBackgroundList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0016, B:30:0x007e, B:32:0x0086, B:34:0x008e, B:36:0x0094, B:38:0x009c, B:39:0x00ab, B:41:0x00b1, B:44:0x00b9, B:45:0x00da, B:8:0x001b, B:16:0x0039, B:18:0x0040, B:24:0x004c, B:26:0x0064, B:13:0x0027), top: B:50:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0016, B:30:0x007e, B:32:0x0086, B:34:0x008e, B:36:0x0094, B:38:0x009c, B:39:0x00ab, B:41:0x00b1, B:44:0x00b9, B:45:0x00da, B:8:0x001b, B:16:0x0039, B:18:0x0040, B:24:0x004c, B:26:0x0064, B:13:0x0027), top: B:50:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0086 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0016, B:30:0x007e, B:32:0x0086, B:34:0x008e, B:36:0x0094, B:38:0x009c, B:39:0x00ab, B:41:0x00b1, B:44:0x00b9, B:45:0x00da, B:8:0x001b, B:16:0x0039, B:18:0x0040, B:24:0x004c, B:26:0x0064, B:13:0x0027), top: B:50:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[Catch: Exception -> 0x0020, TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0016, B:30:0x007e, B:32:0x0086, B:34:0x008e, B:36:0x0094, B:38:0x009c, B:39:0x00ab, B:41:0x00b1, B:44:0x00b9, B:45:0x00da, B:8:0x001b, B:16:0x0039, B:18:0x0040, B:24:0x004c, B:26:0x0064, B:13:0x0027), top: B:50:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ChatBackgroundRepository$getChatBackgroundList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
