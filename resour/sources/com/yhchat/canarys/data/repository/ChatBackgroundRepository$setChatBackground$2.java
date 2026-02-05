package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatBackgroundRepository.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ChatBackgroundRepository$setChatBackground$2", m185f = "ChatBackgroundRepository.kt", m186i = {1, 1, 1}, m187l = {34, 48}, m188m = "invokeSuspend", m189n = {"token", "userId", "request"}, m191s = {"L$0", "L$1", "L$2"}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatBackgroundRepository$setChatBackground$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String $backgroundUrl;
    final /* synthetic */ String $chatId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ChatBackgroundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatBackgroundRepository$setChatBackground$2(ChatBackgroundRepository chatBackgroundRepository, String str, String str2, Continuation<? super ChatBackgroundRepository$setChatBackground$2> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundRepository;
        this.$chatId = str;
        this.$backgroundUrl = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBackgroundRepository$setChatBackground$2(this.this$0, this.$chatId, this.$backgroundUrl, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((ChatBackgroundRepository$setChatBackground$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:7:0x001e, B:33:0x00ac, B:35:0x00b4, B:37:0x00bc, B:39:0x00c2, B:41:0x00ca, B:42:0x00d5, B:44:0x00db, B:47:0x00e3, B:48:0x0104, B:8:0x0024, B:16:0x0042, B:18:0x004a, B:24:0x0056, B:26:0x006e, B:29:0x007c, B:13:0x0030), top: B:53:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:7:0x001e, B:33:0x00ac, B:35:0x00b4, B:37:0x00bc, B:39:0x00c2, B:41:0x00ca, B:42:0x00d5, B:44:0x00db, B:47:0x00e3, B:48:0x0104, B:8:0x0024, B:16:0x0042, B:18:0x004a, B:24:0x0056, B:26:0x006e, B:29:0x007c, B:13:0x0030), top: B:53:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b4 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:7:0x001e, B:33:0x00ac, B:35:0x00b4, B:37:0x00bc, B:39:0x00c2, B:41:0x00ca, B:42:0x00d5, B:44:0x00db, B:47:0x00e3, B:48:0x0104, B:8:0x0024, B:16:0x0042, B:18:0x004a, B:24:0x0056, B:26:0x006e, B:29:0x007c, B:13:0x0030), top: B:53:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0104 A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #0 {Exception -> 0x0029, blocks: (B:7:0x001e, B:33:0x00ac, B:35:0x00b4, B:37:0x00bc, B:39:0x00c2, B:41:0x00ca, B:42:0x00d5, B:44:0x00db, B:47:0x00e3, B:48:0x0104, B:8:0x0024, B:16:0x0042, B:18:0x004a, B:24:0x0056, B:26:0x006e, B:29:0x007c, B:13:0x0030), top: B:53:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ChatBackgroundRepository$setChatBackground$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
