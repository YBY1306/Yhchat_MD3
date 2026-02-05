package com.yhchat.canarys.data.repository;

import androidx.core.location.LocationRequestCompat;
import com.yhchat.canarys.data.model.RecommendBot;
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
@Metadata(m168d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/model/RecommendBot;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendBots$2", m185f = "DiscoverRepository.kt", m186i = {1}, m187l = {LocationRequestCompat.QUALITY_BALANCED_POWER_ACCURACY, 108}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class DiscoverRepository$getRecommendBots$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends RecommendBot>>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ DiscoverRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverRepository$getRecommendBots$2(DiscoverRepository discoverRepository, Continuation<? super DiscoverRepository$getRecommendBots$2> continuation) {
        super(2, continuation);
        this.this$0 = discoverRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverRepository$getRecommendBots$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends RecommendBot>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<RecommendBot>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<RecommendBot>>> continuation) {
        return ((DiscoverRepository$getRecommendBots$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x0019, B:30:0x0086, B:32:0x008e, B:34:0x0096, B:38:0x009f, B:40:0x00a5, B:43:0x00af, B:42:0x00ab, B:45:0x00d8, B:47:0x00de, B:49:0x00fa, B:52:0x0102, B:53:0x0110, B:8:0x001e, B:16:0x003c, B:18:0x0043, B:24:0x004f, B:26:0x006c, B:13:0x002a), top: B:58:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x0019, B:30:0x0086, B:32:0x008e, B:34:0x0096, B:38:0x009f, B:40:0x00a5, B:43:0x00af, B:42:0x00ab, B:45:0x00d8, B:47:0x00de, B:49:0x00fa, B:52:0x0102, B:53:0x0110, B:8:0x001e, B:16:0x003c, B:18:0x0043, B:24:0x004f, B:26:0x006c, B:13:0x002a), top: B:58:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e A[Catch: Exception -> 0x0023, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x0019, B:30:0x0086, B:32:0x008e, B:34:0x0096, B:38:0x009f, B:40:0x00a5, B:43:0x00af, B:42:0x00ab, B:45:0x00d8, B:47:0x00de, B:49:0x00fa, B:52:0x0102, B:53:0x0110, B:8:0x001e, B:16:0x003c, B:18:0x0043, B:24:0x004f, B:26:0x006c, B:13:0x002a), top: B:58:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0110 A[Catch: Exception -> 0x0023, TRY_LEAVE, TryCatch #0 {Exception -> 0x0023, blocks: (B:7:0x0019, B:30:0x0086, B:32:0x008e, B:34:0x0096, B:38:0x009f, B:40:0x00a5, B:43:0x00af, B:42:0x00ab, B:45:0x00d8, B:47:0x00de, B:49:0x00fa, B:52:0x0102, B:53:0x0110, B:8:0x001e, B:16:0x003c, B:18:0x0043, B:24:0x004f, B:26:0x006c, B:13:0x002a), top: B:58:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendBots$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
