package com.yhchat.canarys.data.repository;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StickerRepository.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.StickerRepository$sortStickerPacks$2", m185f = "StickerRepository.kt", m186i = {1, 1, 1, 1}, m187l = {173, 190}, m188m = "invokeSuspend", m189n = {"token", "jsonArray", "sortString", "request"}, m191s = {"L$0", "L$1", "L$2", "L$3"}, m192v = 1)
/* loaded from: classes12.dex */
final class StickerRepository$sortStickerPacks$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ List<Pair<Long, Integer>> $sortList;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ StickerRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StickerRepository$sortStickerPacks$2(StickerRepository stickerRepository, List<Pair<Long, Integer>> list, Continuation<? super StickerRepository$sortStickerPacks$2> continuation) {
        super(2, continuation);
        this.this$0 = stickerRepository;
        this.$sortList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StickerRepository$sortStickerPacks$2(this.this$0, this.$sortList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((StickerRepository$sortStickerPacks$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x0026, B:34:0x0106, B:37:0x0110, B:39:0x0118, B:41:0x011f, B:43:0x0133, B:46:0x014e, B:45:0x0139, B:47:0x0163, B:8:0x002d, B:16:0x004c, B:18:0x0054, B:24:0x0060, B:26:0x007d, B:27:0x008c, B:29:0x0092, B:30:0x00cb, B:13:0x003a), top: B:52:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x0026, B:34:0x0106, B:37:0x0110, B:39:0x0118, B:41:0x011f, B:43:0x0133, B:46:0x014e, B:45:0x0139, B:47:0x0163, B:8:0x002d, B:16:0x004c, B:18:0x0054, B:24:0x0060, B:26:0x007d, B:27:0x008c, B:29:0x0092, B:30:0x00cb, B:13:0x003a), top: B:52:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0110 A[Catch: Exception -> 0x0033, TRY_ENTER, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x0026, B:34:0x0106, B:37:0x0110, B:39:0x0118, B:41:0x011f, B:43:0x0133, B:46:0x014e, B:45:0x0139, B:47:0x0163, B:8:0x002d, B:16:0x004c, B:18:0x0054, B:24:0x0060, B:26:0x007d, B:27:0x008c, B:29:0x0092, B:30:0x00cb, B:13:0x003a), top: B:52:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0163 A[Catch: Exception -> 0x0033, TRY_LEAVE, TryCatch #0 {Exception -> 0x0033, blocks: (B:7:0x0026, B:34:0x0106, B:37:0x0110, B:39:0x0118, B:41:0x011f, B:43:0x0133, B:46:0x014e, B:45:0x0139, B:47:0x0163, B:8:0x002d, B:16:0x004c, B:18:0x0054, B:24:0x0060, B:26:0x007d, B:27:0x008c, B:29:0x0092, B:30:0x00cb, B:13:0x003a), top: B:52:0x000b }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.StickerRepository$sortStickerPacks$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
