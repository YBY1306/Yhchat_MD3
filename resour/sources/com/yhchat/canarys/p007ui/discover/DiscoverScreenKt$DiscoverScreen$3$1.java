package com.yhchat.canarys.p007ui.discover;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.RecommendBot;
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

/* compiled from: DiscoverScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.DiscoverScreenKt$DiscoverScreen$3$1", m185f = "DiscoverScreen.kt", m186i = {}, m187l = {121}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes6.dex */
final class DiscoverScreenKt$DiscoverScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<RecommendBot>> $bots$delegate;
    final /* synthetic */ DiscoverRepository $discoverRepo;
    final /* synthetic */ MutableState<Boolean> $isLoadingBots$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiscoverScreenKt$DiscoverScreen$3$1(DiscoverRepository discoverRepository, MutableState<Boolean> mutableState, MutableState<List<RecommendBot>> mutableState2, Continuation<? super DiscoverScreenKt$DiscoverScreen$3$1> continuation) {
        super(2, continuation);
        this.$discoverRepo = discoverRepository;
        this.$isLoadingBots$delegate = mutableState;
        this.$bots$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiscoverScreenKt$DiscoverScreen$3$1(this.$discoverRepo, this.$isLoadingBots$delegate, this.$bots$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DiscoverScreenKt$DiscoverScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                DiscoverScreenKt.DiscoverScreen$lambda$12(this.$isLoadingBots$delegate, true);
                this.label = 1;
                Object objM8544getRecommendBotsIoAF18A = this.$discoverRepo.m8544getRecommendBotsIoAF18A(this);
                if (objM8544getRecommendBotsIoAF18A != coroutine_suspended) {
                    value = objM8544getRecommendBotsIoAF18A;
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
        MutableState<List<RecommendBot>> mutableState = this.$bots$delegate;
        MutableState<Boolean> mutableState2 = this.$isLoadingBots$delegate;
        MutableState<Boolean> mutableState3 = this.$isLoadingBots$delegate;
        if (Result.m11922exceptionOrNullimpl(value) == null) {
            mutableState.setValue(CollectionsKt.take((List) value, 23));
            DiscoverScreenKt.DiscoverScreen$lambda$12(mutableState2, false);
        } else {
            DiscoverScreenKt.DiscoverScreen$lambda$12(mutableState3, false);
        }
        return Unit.INSTANCE;
    }
}
