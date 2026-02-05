package com.yhchat.canarys.p007ui.discover;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.RecommendGroup;
import com.yhchat.canarys.data.repository.DiscoverRepository;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiscoverGroupsActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$GroupListPage$loadMoreGroups$1", m185f = "DiscoverGroupsActivity.kt", m186i = {}, m187l = {400}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes6.dex */
final class DiscoverGroupsActivityKt$GroupListPage$loadMoreGroups$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ MutableState<Integer> $currentPage$delegate;
    final /* synthetic */ DiscoverRepository $discoverRepo;
    final /* synthetic */ MutableState<List<RecommendGroup>> $groups$delegate;
    final /* synthetic */ MutableState<Boolean> $hasMoreData$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoadingMore$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverGroupsActivityKt$GroupListPage$loadMoreGroups$1(DiscoverRepository discoverRepository, String str, MutableState<Boolean> mutableState, MutableState<Integer> mutableState2, MutableState<Boolean> mutableState3, MutableState<List<RecommendGroup>> mutableState4, Continuation<? super DiscoverGroupsActivityKt$GroupListPage$loadMoreGroups$1> continuation) {
        super(2, continuation);
        this.$discoverRepo = discoverRepository;
        this.$category = str;
        this.$isLoadingMore$delegate = mutableState;
        this.$currentPage$delegate = mutableState2;
        this.$hasMoreData$delegate = mutableState3;
        this.$groups$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverGroupsActivityKt$GroupListPage$loadMoreGroups$1(this.$discoverRepo, this.$category, this.$isLoadingMore$delegate, this.$currentPage$delegate, this.$hasMoreData$delegate, this.$groups$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DiscoverGroupsActivityKt$GroupListPage$loadMoreGroups$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                DiscoverGroupsActivityKt.GroupListPage$lambda$8(this.$isLoadingMore$delegate, true);
                this.label = 1;
                Object objM8542getRecommendGroupsyxL6bBk$default = DiscoverRepository.m8542getRecommendGroupsyxL6bBk$default(this.$discoverRepo, this.$category, null, 20, DiscoverGroupsActivityKt.GroupListPage$lambda$16(this.$currentPage$delegate) + 1, this, 2, null);
                if (objM8542getRecommendGroupsyxL6bBk$default != coroutine_suspended) {
                    value = objM8542getRecommendGroupsyxL6bBk$default;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                value = ((Result) $result).getValue();
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MutableState<Boolean> mutableState = this.$hasMoreData$delegate;
        MutableState<List<RecommendGroup>> mutableState2 = this.$groups$delegate;
        MutableState<Integer> mutableState3 = this.$currentPage$delegate;
        MutableState<Boolean> mutableState4 = this.$isLoadingMore$delegate;
        MutableState<Boolean> mutableState5 = this.$isLoadingMore$delegate;
        if (Result.m11922exceptionOrNullimpl(value) == null) {
            List list = (List) value;
            if (list.isEmpty()) {
                DiscoverGroupsActivityKt.GroupListPage$lambda$20(mutableState, false);
            } else {
                mutableState2.setValue(CollectionsKt.plus((Collection) DiscoverGroupsActivityKt.GroupListPage$lambda$1(mutableState2), (Iterable) list));
                DiscoverGroupsActivityKt.GroupListPage$lambda$17(mutableState3, DiscoverGroupsActivityKt.GroupListPage$lambda$16(mutableState3) + 1);
            }
            DiscoverGroupsActivityKt.GroupListPage$lambda$8(mutableState4, false);
        } else {
            DiscoverGroupsActivityKt.GroupListPage$lambda$8(mutableState5, false);
        }
        return Unit.INSTANCE;
    }
}
