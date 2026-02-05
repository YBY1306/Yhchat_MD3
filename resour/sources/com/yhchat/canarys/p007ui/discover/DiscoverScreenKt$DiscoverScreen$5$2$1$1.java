package com.yhchat.canarys.p007ui.discover;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.RecommendGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiscoverScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$5$2$1$1", m185f = "DiscoverScreen.kt", m186i = {0, 0, 1, 1, 1, 1, 1}, m187l = {279, 282}, m188m = "invokeSuspend", m189n = {"$this$launch", "api", "$this$launch", "api", "token", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-DiscoverScreenKt$DiscoverScreen$5$2$1$1$1\\1\\281\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
/* loaded from: classes6.dex */
final class DiscoverScreenKt$DiscoverScreen$5$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ RecommendGroup $group;
    final /* synthetic */ MutableState<RecommendGroup> $selectedGroup$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverScreenKt$DiscoverScreen$5$2$1$1(Context context, RecommendGroup recommendGroup, MutableState<RecommendGroup> mutableState, Continuation<? super DiscoverScreenKt$DiscoverScreen$5$2$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$group = recommendGroup;
        this.$selectedGroup$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DiscoverScreenKt$DiscoverScreen$5$2$1$1 discoverScreenKt$DiscoverScreen$5$2$1$1 = new DiscoverScreenKt$DiscoverScreen$5$2$1$1(this.$context, this.$group, this.$selectedGroup$delegate, continuation);
        discoverScreenKt$DiscoverScreen$5$2$1$1.L$0 = obj;
        return discoverScreenKt$DiscoverScreen$5$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DiscoverScreenKt$DiscoverScreen$5$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.DiscoverScreenKt$DiscoverScreen$5$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
