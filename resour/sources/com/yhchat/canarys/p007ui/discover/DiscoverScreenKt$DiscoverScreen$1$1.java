package com.yhchat.canarys.p007ui.discover;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.RecommendGroup;
import com.yhchat.canarys.data.repository.DiscoverRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiscoverScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$1$1", m185f = "DiscoverScreen.kt", m186i = {}, m187l = {64}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes6.dex */
final class DiscoverScreenKt$DiscoverScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Integer> $currentGroupPage$delegate;
    final /* synthetic */ DiscoverRepository $discoverRepo;
    final /* synthetic */ MutableState<List<RecommendGroup>> $groups$delegate;
    final /* synthetic */ MutableState<Boolean> $hasMoreGroups$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoadingGroups$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverScreenKt$DiscoverScreen$1$1(DiscoverRepository discoverRepository, MutableState<Boolean> mutableState, MutableState<Integer> mutableState2, MutableState<List<RecommendGroup>> mutableState3, MutableState<Boolean> mutableState4, Continuation<? super DiscoverScreenKt$DiscoverScreen$1$1> continuation) {
        super(2, continuation);
        this.$discoverRepo = discoverRepository;
        this.$isLoadingGroups$delegate = mutableState;
        this.$currentGroupPage$delegate = mutableState2;
        this.$groups$delegate = mutableState3;
        this.$hasMoreGroups$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverScreenKt$DiscoverScreen$1$1(this.$discoverRepo, this.$isLoadingGroups$delegate, this.$currentGroupPage$delegate, this.$groups$delegate, this.$hasMoreGroups$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DiscoverScreenKt$DiscoverScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                DiscoverScreenKt.DiscoverScreen$lambda$9(this.$isLoadingGroups$delegate, true);
                DiscoverScreenKt.DiscoverScreen$lambda$18(this.$currentGroupPage$delegate, 1);
                this.label = 1;
                Object objM8542getRecommendGroupsyxL6bBk$default = DiscoverRepository.m8542getRecommendGroupsyxL6bBk$default(this.$discoverRepo, "", null, 20, 1, this, 2, null);
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
        MutableState<Boolean> mutableState2 = this.$hasMoreGroups$delegate;
        MutableState<Boolean> mutableState3 = this.$isLoadingGroups$delegate;
        MutableState<Boolean> mutableState4 = this.$isLoadingGroups$delegate;
        if (Result.m11922exceptionOrNullimpl(value) == null) {
            List list = (List) value;
            mutableState.setValue(list);
            DiscoverScreenKt.DiscoverScreen$lambda$21(mutableState2, list.size() >= 20);
            DiscoverScreenKt.DiscoverScreen$lambda$9(mutableState3, false);
        } else {
            DiscoverScreenKt.DiscoverScreen$lambda$9(mutableState4, false);
        }
        return Unit.INSTANCE;
    }
}
