package com.yhchat.canarys.data.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiscoverRepository.kt */
@Metadata(m168d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.DiscoverRepository$getGroupCategories$2", m185f = "DiscoverRepository.kt", m186i = {1}, m187l = {25, 31}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class DiscoverRepository$getGroupCategories$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends String>>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ DiscoverRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverRepository$getGroupCategories$2(DiscoverRepository discoverRepository, Continuation<? super DiscoverRepository$getGroupCategories$2> continuation) {
        super(2, continuation);
        this.this$0 = discoverRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverRepository$getGroupCategories$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends String>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<String>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<String>>> continuation) {
        return ((DiscoverRepository$getGroupCategories$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:7:0x001a, B:30:0x008e, B:32:0x0096, B:34:0x009e, B:38:0x00a7, B:40:0x00ad, B:43:0x00b7, B:42:0x00b3, B:45:0x00e0, B:46:0x00e4, B:48:0x0100, B:51:0x0108, B:52:0x0116, B:8:0x0020, B:16:0x003e, B:18:0x0045, B:24:0x0051, B:26:0x006e, B:13:0x002c), top: B:57:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006e A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:7:0x001a, B:30:0x008e, B:32:0x0096, B:34:0x009e, B:38:0x00a7, B:40:0x00ad, B:43:0x00b7, B:42:0x00b3, B:45:0x00e0, B:46:0x00e4, B:48:0x0100, B:51:0x0108, B:52:0x0116, B:8:0x0020, B:16:0x003e, B:18:0x0045, B:24:0x0051, B:26:0x006e, B:13:0x002c), top: B:57:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:7:0x001a, B:30:0x008e, B:32:0x0096, B:34:0x009e, B:38:0x00a7, B:40:0x00ad, B:43:0x00b7, B:42:0x00b3, B:45:0x00e0, B:46:0x00e4, B:48:0x0100, B:51:0x0108, B:52:0x0116, B:8:0x0020, B:16:0x003e, B:18:0x0045, B:24:0x0051, B:26:0x006e, B:13:0x002c), top: B:57:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116 A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:7:0x001a, B:30:0x008e, B:32:0x0096, B:34:0x009e, B:38:0x00a7, B:40:0x00ad, B:43:0x00b7, B:42:0x00b3, B:45:0x00e0, B:46:0x00e4, B:48:0x0100, B:51:0x0108, B:52:0x0116, B:8:0x0020, B:16:0x003e, B:18:0x0045, B:24:0x0051, B:26:0x006e, B:13:0x002c), top: B:57:0x000b }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiscoverRepository$getGroupCategories$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
