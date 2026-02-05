package com.yhchat.canarys;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.NavigationItem;
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
@DebugMetadata(m184c = "com.yhchat.canarys.MainActivity$MainContent$8$1", m185f = "MainActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes3.dex */
final class MainActivity$MainContent$8$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $currentScreen$delegate;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ List<NavigationItem> $visibleNavItems;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$MainContent$8$1(List<NavigationItem> list, PagerState pagerState, MutableState<String> mutableState, Continuation<? super MainActivity$MainContent$8$1> continuation) {
        super(2, continuation);
        this.$visibleNavItems = list;
        this.$pagerState = pagerState;
        this.$currentScreen$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$MainContent$8$1(this.$visibleNavItems, this.$pagerState, this.$currentScreen$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$MainContent$8$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (!this.$visibleNavItems.isEmpty() && this.$pagerState.getCurrentPage() < this.$visibleNavItems.size()) {
                    String newScreen = this.$visibleNavItems.get(this.$pagerState.getCurrentPage()).getId();
                    if (!Intrinsics.areEqual(newScreen, MainActivity.MainContent$lambda$13(this.$currentScreen$delegate)) && !this.$pagerState.isScrollInProgress()) {
                        this.$currentScreen$delegate.setValue(newScreen);
                    }
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
