package com.yhchat.canarys.p007ui.discover;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.RecommendGroup;
import com.yhchat.canarys.data.repository.DiscoverRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiscoverGroupsActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1", m185f = "DiscoverGroupsActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes6.dex */
final class DiscoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ MutableState<Integer> $currentPage$delegate;
    final /* synthetic */ DiscoverRepository $discoverRepo;
    final /* synthetic */ MutableState<List<RecommendGroup>> $groups$delegate;
    final /* synthetic */ MutableState<Boolean> $hasMoreData$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoadingMore$delegate;
    final /* synthetic */ CoroutineScope $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1(CoroutineScope coroutineScope, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, DiscoverRepository discoverRepository, String str, MutableState<Integer> mutableState3, MutableState<List<RecommendGroup>> mutableState4, Continuation<? super DiscoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
        this.$isLoadingMore$delegate = mutableState;
        this.$hasMoreData$delegate = mutableState2;
        this.$discoverRepo = discoverRepository;
        this.$category = str;
        this.$currentPage$delegate = mutableState3;
        this.$groups$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1(this.$scope, this.$isLoadingMore$delegate, this.$hasMoreData$delegate, this.$discoverRepo, this.$category, this.$currentPage$delegate, this.$groups$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DiscoverGroupsActivityKt$GroupListPage$2$4$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                DiscoverGroupsActivityKt.GroupListPage$loadMoreGroups(this.$scope, this.$isLoadingMore$delegate, this.$hasMoreData$delegate, this.$discoverRepo, this.$category, this.$currentPage$delegate, this.$groups$delegate);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
