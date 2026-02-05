package com.yhchat.canarys.p007ui.community;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PostDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailActivityKt$PostDetailScreen$2$1", m185f = "PostDetailActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class PostDetailActivityKt$PostDetailScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<CommentListState> $commentListState$delegate;
    final /* synthetic */ State<PostDetailState> $postDetailState$delegate;
    final /* synthetic */ PostDetailViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostDetailActivityKt$PostDetailScreen$2$1(State<PostDetailState> state, PostDetailViewModel postDetailViewModel, State<CommentListState> state2, Continuation<? super PostDetailActivityKt$PostDetailScreen$2$1> continuation) {
        super(2, continuation);
        this.$postDetailState$delegate = state;
        this.$viewModel = postDetailViewModel;
        this.$commentListState$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PostDetailActivityKt$PostDetailScreen$2$1(this.$postDetailState$delegate, this.$viewModel, this.$commentListState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PostDetailActivityKt$PostDetailScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (PostDetailActivityKt.PostDetailScreen$lambda$0(this.$postDetailState$delegate).getError() != null) {
                    this.$viewModel.clearError();
                }
                if (PostDetailActivityKt.PostDetailScreen$lambda$1(this.$commentListState$delegate).getError() != null) {
                    this.$viewModel.clearError();
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
