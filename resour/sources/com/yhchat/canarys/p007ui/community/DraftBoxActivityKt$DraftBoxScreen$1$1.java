package com.yhchat.canarys.p007ui.community;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.Draft;
import com.yhchat.canarys.data.repository.DraftRepository;
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

/* compiled from: DraftBoxActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.DraftBoxActivityKt$DraftBoxScreen$1$1", m185f = "DraftBoxActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class DraftBoxActivityKt$DraftBoxScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DraftRepository $draftRepository;
    final /* synthetic */ MutableState<List<Draft>> $drafts$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DraftBoxActivityKt$DraftBoxScreen$1$1(DraftRepository draftRepository, MutableState<List<Draft>> mutableState, MutableState<Boolean> mutableState2, Continuation<? super DraftBoxActivityKt$DraftBoxScreen$1$1> continuation) {
        super(2, continuation);
        this.$draftRepository = draftRepository;
        this.$drafts$delegate = mutableState;
        this.$isLoading$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DraftBoxActivityKt$DraftBoxScreen$1$1(this.$draftRepository, this.$drafts$delegate, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DraftBoxActivityKt$DraftBoxScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.$drafts$delegate.setValue(this.$draftRepository.getDrafts());
                DraftBoxActivityKt.DraftBoxScreen$lambda$6(this.$isLoading$delegate, false);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
