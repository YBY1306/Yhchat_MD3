package com.yhchat.canarys.p007ui.discover;

import androidx.compose.runtime.MutableState;
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
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverGroupsActivityKt$DiscoverGroupsScreen$1$1", m185f = "DiscoverGroupsActivity.kt", m186i = {}, m187l = {84}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes6.dex */
final class DiscoverGroupsActivityKt$DiscoverGroupsScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<String>> $categories$delegate;
    final /* synthetic */ DiscoverRepository $discoverRepo;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoadingCategories$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverGroupsActivityKt$DiscoverGroupsScreen$1$1(DiscoverRepository discoverRepository, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<List<String>> mutableState3, Continuation<? super DiscoverGroupsActivityKt$DiscoverGroupsScreen$1$1> continuation) {
        super(2, continuation);
        this.$discoverRepo = discoverRepository;
        this.$isLoadingCategories$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$categories$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverGroupsActivityKt$DiscoverGroupsScreen$1$1(this.$discoverRepo, this.$isLoadingCategories$delegate, this.$error$delegate, this.$categories$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DiscoverGroupsActivityKt$DiscoverGroupsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$6(this.$isLoadingCategories$delegate, true);
                this.$error$delegate.setValue(null);
                this.label = 1;
                Object objM8543getGroupCategoriesIoAF18A = this.$discoverRepo.m8543getGroupCategoriesIoAF18A(this);
                if (objM8543getGroupCategoriesIoAF18A != coroutine_suspended) {
                    value = objM8543getGroupCategoriesIoAF18A;
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
        MutableState<List<String>> mutableState = this.$categories$delegate;
        MutableState<Boolean> mutableState2 = this.$isLoadingCategories$delegate;
        MutableState<String> mutableState3 = this.$error$delegate;
        MutableState<Boolean> mutableState4 = this.$isLoadingCategories$delegate;
        MutableState<List<String>> mutableState5 = this.$categories$delegate;
        Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
        if (thM11922exceptionOrNullimpl == null) {
            mutableState.setValue(CollectionsKt.plus((Collection) CollectionsKt.listOf("\u6700\u65b0"), (Iterable) value));
            DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$6(mutableState2, false);
        } else {
            mutableState3.setValue(thM11922exceptionOrNullimpl.getMessage());
            DiscoverGroupsActivityKt.DiscoverGroupsScreen$lambda$6(mutableState4, false);
            mutableState5.setValue(CollectionsKt.listOf("\u6700\u65b0"));
        }
        return Unit.INSTANCE;
    }
}
