package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.model.RecommendGroup;
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
@Metadata(m168d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/model/RecommendGroup;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendGroups$2", m185f = "DiscoverRepository.kt", m186i = {1}, m187l = {66, 72}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class DiscoverRepository$getRecommendGroups$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends RecommendGroup>>>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ String $keyword;
    final /* synthetic */ int $page;
    final /* synthetic */ int $size;
    Object L$0;
    int label;
    final /* synthetic */ DiscoverRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverRepository$getRecommendGroups$2(DiscoverRepository discoverRepository, String str, String str2, int i, int i2, Continuation<? super DiscoverRepository$getRecommendGroups$2> continuation) {
        super(2, continuation);
        this.this$0 = discoverRepository;
        this.$category = str;
        this.$keyword = str2;
        this.$size = i;
        this.$page = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverRepository$getRecommendGroups$2(this.this$0, this.$category, this.$keyword, this.$size, this.$page, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends RecommendGroup>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<RecommendGroup>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<RecommendGroup>>> continuation) {
        return ((DiscoverRepository$getRecommendGroups$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0019, B:30:0x0095, B:32:0x009d, B:34:0x00a5, B:38:0x00ae, B:40:0x00b4, B:43:0x00be, B:42:0x00ba, B:45:0x00e7, B:47:0x00ed, B:49:0x0109, B:52:0x0111, B:53:0x011f, B:8:0x001f, B:16:0x003d, B:18:0x0044, B:24:0x0050, B:26:0x006d, B:13:0x002b), top: B:58:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0019, B:30:0x0095, B:32:0x009d, B:34:0x00a5, B:38:0x00ae, B:40:0x00b4, B:43:0x00be, B:42:0x00ba, B:45:0x00e7, B:47:0x00ed, B:49:0x0109, B:52:0x0111, B:53:0x011f, B:8:0x001f, B:16:0x003d, B:18:0x0044, B:24:0x0050, B:26:0x006d, B:13:0x002b), top: B:58:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0019, B:30:0x0095, B:32:0x009d, B:34:0x00a5, B:38:0x00ae, B:40:0x00b4, B:43:0x00be, B:42:0x00ba, B:45:0x00e7, B:47:0x00ed, B:49:0x0109, B:52:0x0111, B:53:0x011f, B:8:0x001f, B:16:0x003d, B:18:0x0044, B:24:0x0050, B:26:0x006d, B:13:0x002b), top: B:58:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011f A[Catch: Exception -> 0x0024, TRY_LEAVE, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0019, B:30:0x0095, B:32:0x009d, B:34:0x00a5, B:38:0x00ae, B:40:0x00b4, B:43:0x00be, B:42:0x00ba, B:45:0x00e7, B:47:0x00ed, B:49:0x0109, B:52:0x0111, B:53:0x011f, B:8:0x001f, B:16:0x003d, B:18:0x0044, B:24:0x0050, B:26:0x006d, B:13:0x002b), top: B:58:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiscoverRepository$getRecommendGroups$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
