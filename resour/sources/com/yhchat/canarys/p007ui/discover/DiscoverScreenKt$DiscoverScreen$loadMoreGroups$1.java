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

/* compiled from: DiscoverScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$loadMoreGroups$1", m185f = "DiscoverScreen.kt", m186i = {0}, m187l = {83}, m188m = "invokeSuspend", m189n = {"nextPage"}, m191s = {"I$0"}, m192v = 1)
/* loaded from: classes6.dex */
final class DiscoverScreenKt$DiscoverScreen$loadMoreGroups$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Integer> $currentGroupPage$delegate;
    final /* synthetic */ DiscoverRepository $discoverRepo;
    final /* synthetic */ MutableState<List<RecommendGroup>> $groups$delegate;
    final /* synthetic */ MutableState<Boolean> $hasMoreGroups$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoadingMoreGroups$delegate;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverScreenKt$DiscoverScreen$loadMoreGroups$1(DiscoverRepository discoverRepository, MutableState<Boolean> mutableState, MutableState<Integer> mutableState2, MutableState<List<RecommendGroup>> mutableState3, MutableState<Boolean> mutableState4, Continuation<? super DiscoverScreenKt$DiscoverScreen$loadMoreGroups$1> continuation) {
        super(2, continuation);
        this.$discoverRepo = discoverRepository;
        this.$isLoadingMoreGroups$delegate = mutableState;
        this.$currentGroupPage$delegate = mutableState2;
        this.$groups$delegate = mutableState3;
        this.$hasMoreGroups$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverScreenKt$DiscoverScreen$loadMoreGroups$1(this.$discoverRepo, this.$isLoadingMoreGroups$delegate, this.$currentGroupPage$delegate, this.$groups$delegate, this.$hasMoreGroups$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DiscoverScreenKt$DiscoverScreen$loadMoreGroups$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM8542getRecommendGroupsyxL6bBk$default;
        int nextPage;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                DiscoverScreenKt.DiscoverScreen$lambda$15(this.$isLoadingMoreGroups$delegate, true);
                int nextPage2 = DiscoverScreenKt.DiscoverScreen$lambda$17(this.$currentGroupPage$delegate) + 1;
                this.I$0 = nextPage2;
                this.label = 1;
                objM8542getRecommendGroupsyxL6bBk$default = DiscoverRepository.m8542getRecommendGroupsyxL6bBk$default(this.$discoverRepo, "", null, 20, nextPage2, this, 2, null);
                if (objM8542getRecommendGroupsyxL6bBk$default != coroutine_suspended) {
                    nextPage = nextPage2;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                nextPage = this.I$0;
                ResultKt.throwOnFailure($result);
                objM8542getRecommendGroupsyxL6bBk$default = ((Result) $result).getValue();
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MutableState<List<RecommendGroup>> mutableState = this.$groups$delegate;
        MutableState<Integer> mutableState2 = this.$currentGroupPage$delegate;
        MutableState<Boolean> mutableState3 = this.$hasMoreGroups$delegate;
        MutableState<Boolean> mutableState4 = this.$isLoadingMoreGroups$delegate;
        MutableState<Boolean> mutableState5 = this.$isLoadingMoreGroups$delegate;
        if (Result.m11922exceptionOrNullimpl(objM8542getRecommendGroupsyxL6bBk$default) == null) {
            List list = (List) objM8542getRecommendGroupsyxL6bBk$default;
            if (list.isEmpty()) {
                DiscoverScreenKt.DiscoverScreen$lambda$21(mutableState3, false);
            } else {
                mutableState.setValue(CollectionsKt.plus((Collection) DiscoverScreenKt.DiscoverScreen$lambda$2(mutableState), (Iterable) list));
                DiscoverScreenKt.DiscoverScreen$lambda$18(mutableState2, nextPage);
                DiscoverScreenKt.DiscoverScreen$lambda$21(mutableState3, list.size() >= 20);
            }
            DiscoverScreenKt.DiscoverScreen$lambda$15(mutableState4, false);
        } else {
            DiscoverScreenKt.DiscoverScreen$lambda$15(mutableState5, false);
        }
        return Unit.INSTANCE;
    }
}
