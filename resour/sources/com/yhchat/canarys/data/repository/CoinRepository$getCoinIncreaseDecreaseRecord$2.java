package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.model.GoldCoinRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CoinRepository.kt */
@Metadata(m168d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/model/GoldCoinRecord;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.CoinRepository$getCoinIncreaseDecreaseRecord$2", m185f = "CoinRepository.kt", m186i = {1, 1}, m187l = {173, 180}, m188m = "invokeSuspend", m189n = {"token", "request"}, m191s = {"L$0", "L$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class CoinRepository$getCoinIncreaseDecreaseRecord$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends GoldCoinRecord>>>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ int $size;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ CoinRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoinRepository$getCoinIncreaseDecreaseRecord$2(CoinRepository coinRepository, int i, int i2, Continuation<? super CoinRepository$getCoinIncreaseDecreaseRecord$2> continuation) {
        super(2, continuation);
        this.this$0 = coinRepository;
        this.$size = i;
        this.$page = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CoinRepository$getCoinIncreaseDecreaseRecord$2(this.this$0, this.$size, this.$page, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends GoldCoinRecord>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<GoldCoinRecord>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<GoldCoinRecord>>> continuation) {
        return ((CoinRepository$getCoinIncreaseDecreaseRecord$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x0099, B:33:0x00a3, B:35:0x00ab, B:37:0x00b1, B:39:0x00ea, B:41:0x00f0, B:42:0x0117, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x0099, B:33:0x00a3, B:35:0x00ab, B:37:0x00b1, B:39:0x00ea, B:41:0x00f0, B:42:0x0117, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: Exception -> 0x0027, TRY_ENTER, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x0099, B:33:0x00a3, B:35:0x00ab, B:37:0x00b1, B:39:0x00ea, B:41:0x00f0, B:42:0x0117, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0117 A[Catch: Exception -> 0x0027, TRY_LEAVE, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x0099, B:33:0x00a3, B:35:0x00ab, B:37:0x00b1, B:39:0x00ea, B:41:0x00f0, B:42:0x0117, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.CoinRepository$getCoinIncreaseDecreaseRecord$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
