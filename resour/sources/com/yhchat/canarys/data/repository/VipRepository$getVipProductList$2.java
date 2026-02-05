package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.model.VipProductListData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: VipRepository.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/yhchat/canarys/data/model/VipProductListData;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.VipRepository$getVipProductList$2", m185f = "VipRepository.kt", m186i = {1, 1}, m187l = {30, 37}, m188m = "invokeSuspend", m189n = {"token", "request"}, m191s = {"L$0", "L$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class VipRepository$getVipProductList$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends VipProductListData>>, Object> {
    final /* synthetic */ String $platform;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ VipRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VipRepository$getVipProductList$2(VipRepository vipRepository, String str, Continuation<? super VipRepository$getVipProductList$2> continuation) {
        super(2, continuation);
        this.this$0 = vipRepository;
        this.$platform = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipRepository$getVipProductList$2(this.this$0, this.$platform, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends VipProductListData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<VipProductListData>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<VipProductListData>> continuation) {
        return ((VipRepository$getVipProductList$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x0097, B:33:0x00a1, B:35:0x00a9, B:37:0x00af, B:39:0x00e4, B:41:0x00ea, B:42:0x0111, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x0097, B:33:0x00a1, B:35:0x00a9, B:37:0x00af, B:39:0x00e4, B:41:0x00ea, B:42:0x0111, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1 A[Catch: Exception -> 0x0027, TRY_ENTER, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x0097, B:33:0x00a1, B:35:0x00a9, B:37:0x00af, B:39:0x00e4, B:41:0x00ea, B:42:0x0111, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111 A[Catch: Exception -> 0x0027, TRY_LEAVE, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x0097, B:33:0x00a1, B:35:0x00a9, B:37:0x00af, B:39:0x00e4, B:41:0x00ea, B:42:0x0111, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.VipRepository$getVipProductList$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
