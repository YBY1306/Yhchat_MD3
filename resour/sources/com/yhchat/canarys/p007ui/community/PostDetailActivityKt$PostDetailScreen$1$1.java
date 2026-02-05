package com.yhchat.canarys.p007ui.community;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PostDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.PostDetailActivityKt$PostDetailScreen$1$1", m185f = "PostDetailActivity.kt", m186i = {}, m187l = {1084}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class PostDetailActivityKt$PostDetailScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $currentToken$delegate;
    final /* synthetic */ MutableState<Boolean> $isTokenLoaded$delegate;
    final /* synthetic */ int $postId;
    final /* synthetic */ PostDetailViewModel $viewModel;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostDetailActivityKt$PostDetailScreen$1$1(int i, PostDetailViewModel postDetailViewModel, MutableState<String> mutableState, MutableState<Boolean> mutableState2, Continuation<? super PostDetailActivityKt$PostDetailScreen$1$1> continuation) {
        super(2, continuation);
        this.$postId = i;
        this.$viewModel = postDetailViewModel;
        this.$currentToken$delegate = mutableState;
        this.$isTokenLoaded$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PostDetailActivityKt$PostDetailScreen$1$1(this.$postId, this.$viewModel, this.$currentToken$delegate, this.$isTokenLoaded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PostDetailActivityKt$PostDetailScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object tokenAsync;
        MutableState<String> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (this.$postId > 0) {
                    PostDetailViewModel.loadPostDetailWithToken$default(this.$viewModel, this.$postId, false, 2, null);
                    MutableState<String> mutableState2 = this.$currentToken$delegate;
                    this.L$0 = mutableState2;
                    this.label = 1;
                    tokenAsync = this.$viewModel.getTokenAsync(this);
                    if (tokenAsync == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableState = mutableState2;
                    mutableState.setValue((String) tokenAsync);
                    PostDetailActivityKt.PostDetailScreen$lambda$22(this.$isTokenLoaded$delegate, true);
                    Log.d("PostDetailActivity", "\u1f511 Token\u52a0\u8f7d\u5b8c\u6210: " + StringsKt.take(PostDetailActivityKt.PostDetailScreen$lambda$18(this.$currentToken$delegate), 10) + "...");
                }
                return Unit.INSTANCE;
            case 1:
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure($result);
                tokenAsync = $result;
                mutableState.setValue((String) tokenAsync);
                PostDetailActivityKt.PostDetailScreen$lambda$22(this.$isTokenLoaded$delegate, true);
                Log.d("PostDetailActivity", "\u1f511 Token\u52a0\u8f7d\u5b8c\u6210: " + StringsKt.take(PostDetailActivityKt.PostDetailScreen$lambda$18(this.$currentToken$delegate), 10) + "...");
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
