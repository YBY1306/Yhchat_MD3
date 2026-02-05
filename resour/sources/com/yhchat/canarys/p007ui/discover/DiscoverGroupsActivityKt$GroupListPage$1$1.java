package com.yhchat.canarys.p007ui.discover;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.RecommendGroup;
import com.yhchat.canarys.data.repository.DiscoverRepository;
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
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$GroupListPage$1$1", m185f = "DiscoverGroupsActivity.kt", m186i = {}, m187l = {429}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes6.dex */
final class DiscoverGroupsActivityKt$GroupListPage$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $category;
    final /* synthetic */ MutableState<Integer> $currentPage$delegate;
    final /* synthetic */ DiscoverRepository $discoverRepo;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<List<RecommendGroup>> $groups$delegate;
    final /* synthetic */ MutableState<Boolean> $hasMoreData$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverGroupsActivityKt$GroupListPage$1$1(DiscoverRepository discoverRepository, String str, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<Integer> mutableState3, MutableState<Boolean> mutableState4, MutableState<List<RecommendGroup>> mutableState5, Continuation<? super DiscoverGroupsActivityKt$GroupListPage$1$1> continuation) {
        super(2, continuation);
        this.$discoverRepo = discoverRepository;
        this.$category = str;
        this.$isLoading$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$currentPage$delegate = mutableState3;
        this.$hasMoreData$delegate = mutableState4;
        this.$groups$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverGroupsActivityKt$GroupListPage$1$1(this.$discoverRepo, this.$category, this.$isLoading$delegate, this.$error$delegate, this.$currentPage$delegate, this.$hasMoreData$delegate, this.$groups$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DiscoverGroupsActivityKt$GroupListPage$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                DiscoverGroupsActivityKt.GroupListPage$lambda$5(this.$isLoading$delegate, true);
                this.$error$delegate.setValue(null);
                DiscoverGroupsActivityKt.GroupListPage$lambda$17(this.$currentPage$delegate, 1);
                DiscoverGroupsActivityKt.GroupListPage$lambda$20(this.$hasMoreData$delegate, true);
                this.$groups$delegate.setValue(CollectionsKt.emptyList());
                this.label = 1;
                Object objM8542getRecommendGroupsyxL6bBk$default = DiscoverRepository.m8542getRecommendGroupsyxL6bBk$default(this.$discoverRepo, this.$category, null, 20, 1, this, 2, null);
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
        MutableState<List<RecommendGroup>> mutableState = this.$groups$delegate;
        MutableState<Boolean> mutableState2 = this.$isLoading$delegate;
        MutableState<Boolean> mutableState3 = this.$hasMoreData$delegate;
        MutableState<String> mutableState4 = this.$error$delegate;
        MutableState<Boolean> mutableState5 = this.$isLoading$delegate;
        Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
        if (thM11922exceptionOrNullimpl == null) {
            List list = (List) value;
            mutableState.setValue(list);
            DiscoverGroupsActivityKt.GroupListPage$lambda$5(mutableState2, false);
            DiscoverGroupsActivityKt.GroupListPage$lambda$20(mutableState3, list.size() >= 20);
        } else {
            mutableState4.setValue(thM11922exceptionOrNullimpl.getMessage());
            DiscoverGroupsActivityKt.GroupListPage$lambda$5(mutableState5, false);
        }
        return Unit.INSTANCE;
    }
}
