package com.yhchat.canarys;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.NavigationItem;
import java.util.Iterator;
import java.util.List;
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

/* compiled from: MainActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.MainActivity$MainContent$7$1", m185f = "MainActivity.kt", m186i = {0}, m187l = {173}, m188m = "invokeSuspend", m189n = {"targetIndex"}, m191s = {"I$0"}, m192v = 1)
/* loaded from: classes3.dex */
final class MainActivity$MainContent$7$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $currentScreen$delegate;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ List<NavigationItem> $visibleNavItems;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$MainContent$7$1(List<NavigationItem> list, PagerState pagerState, MutableState<String> mutableState, Continuation<? super MainActivity$MainContent$7$1> continuation) {
        super(2, continuation);
        this.$visibleNavItems = list;
        this.$pagerState = pagerState;
        this.$currentScreen$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$MainContent$7$1(this.$visibleNavItems, this.$pagerState, this.$currentScreen$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$MainContent$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        int targetIndex;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                List list = this.$visibleNavItems;
                MutableState<String> mutableState = this.$currentScreen$delegate;
                int i = 0;
                Iterator<NavigationItem> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!Intrinsics.areEqual(((NavigationItem) it.next()).getId(), MainActivity.MainContent$lambda$13(mutableState))) {
                            i++;
                        }
                    } else {
                        i = -1;
                    }
                }
                int targetIndex2 = i;
                if (targetIndex2 >= 0 && targetIndex2 != this.$pagerState.getCurrentPage() && !this.$pagerState.isScrollInProgress()) {
                    this.I$0 = targetIndex2;
                    this.label = 1;
                    if (PagerState.animateScrollToPage$default(this.$pagerState, targetIndex2, 0.0f, null, this, 6, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    targetIndex = targetIndex2;
                }
                return Unit.INSTANCE;
            case 1:
                targetIndex = this.I$0;
                ResultKt.throwOnFailure($result);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
