package com.yhchat.canarys.p007ui.community;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EditPostActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.EditPostActivityKt$EditPostScreen$1$1", m185f = "EditPostActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class EditPostActivityKt$EditPostScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ State<EditPostState> $editPostState$delegate;
    final /* synthetic */ Function0<Unit> $onPostUpdated;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EditPostActivityKt$EditPostScreen$1$1(Function0<Unit> function0, State<EditPostState> state, Continuation<? super EditPostActivityKt$EditPostScreen$1$1> continuation) {
        super(2, continuation);
        this.$onPostUpdated = function0;
        this.$editPostState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EditPostActivityKt$EditPostScreen$1$1(this.$onPostUpdated, this.$editPostState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EditPostActivityKt$EditPostScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (EditPostActivityKt.EditPostScreen$lambda$9(this.$editPostState$delegate).isSuccess()) {
                    this.$onPostUpdated.invoke();
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
