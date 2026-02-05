package com.yhchat.canarys.p007ui.community;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: FollowersListActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.FollowersListActivityKt$FollowersListContent$1$1", m185f = "FollowersListActivity.kt", m186i = {}, m187l = {256}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class FollowersListActivityKt$FollowersListContent$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Function0<Unit> $onLoadMore;
    final /* synthetic */ FollowersListState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FollowersListActivityKt$FollowersListContent$1$1(LazyListState lazyListState, FollowersListState followersListState, Function0<Unit> function0, Continuation<? super FollowersListActivityKt$FollowersListContent$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$state = followersListState;
        this.$onLoadMore = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FollowersListActivityKt$FollowersListContent$1$1(this.$listState, this.$state, this.$onLoadMore, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FollowersListActivityKt$FollowersListContent$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final LazyListState lazyListState = this.$listState;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$FollowersListContent$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(FollowersListActivityKt$FollowersListContent$1$1.invokeSuspend$lambda$0(lazyListState));
                    }
                });
                final FollowersListState followersListState = this.$state;
                final Function0<Unit> function0 = this.$onLoadMore;
                this.label = 1;
                if (flowSnapshotFlow.collect(new FlowCollector() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$FollowersListContent$1$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                        return emit(((Boolean) value).booleanValue(), (Continuation<? super Unit>) $completion);
                    }

                    public final Object emit(boolean atBottom, Continuation<? super Unit> continuation) {
                        if (atBottom && !followersListState.isLoading() && !followersListState.isLoadingMore() && followersListState.getHasMore()) {
                            function0.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(LazyListState $listState) {
        LazyListLayoutInfo layoutInfo = $listState.getLayoutInfo();
        LazyListItemInfo last = (LazyListItemInfo) CollectionsKt.lastOrNull((List) layoutInfo.getVisibleItemsInfo());
        return last != null && last.getIndex() == layoutInfo.getTotalItemsCount() - 1;
    }
}
