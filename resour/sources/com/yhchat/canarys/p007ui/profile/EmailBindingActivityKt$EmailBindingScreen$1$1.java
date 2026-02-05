package com.yhchat.canarys.p007ui.profile;

import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmailBindingActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.EmailBindingActivityKt$EmailBindingScreen$1$1", m185f = "EmailBindingActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes16.dex */
final class EmailBindingActivityKt$EmailBindingScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Bitmap> $captchaBitmap$delegate;
    final /* synthetic */ MutableState<String> $captchaId$delegate;
    final /* synthetic */ EmailBindingViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailBindingActivityKt$EmailBindingScreen$1$1(EmailBindingViewModel emailBindingViewModel, MutableState<String> mutableState, MutableState<Bitmap> mutableState2, Continuation<? super EmailBindingActivityKt$EmailBindingScreen$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = emailBindingViewModel;
        this.$captchaId$delegate = mutableState;
        this.$captchaBitmap$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmailBindingActivityKt$EmailBindingScreen$1$1(this.$viewModel, this.$captchaId$delegate, this.$captchaBitmap$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmailBindingActivityKt$EmailBindingScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                EmailBindingViewModel emailBindingViewModel = this.$viewModel;
                final MutableState<String> mutableState = this.$captchaId$delegate;
                final MutableState<Bitmap> mutableState2 = this.$captchaBitmap$delegate;
                emailBindingViewModel.getCaptcha(new Function2() { // from class: com.yhchat.canarys.ui.profile.EmailBindingActivityKt$EmailBindingScreen$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EmailBindingActivityKt$EmailBindingScreen$1$1.invokeSuspend$lambda$0(mutableState, mutableState2, (String) obj, (Bitmap) obj2);
                    }
                });
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(MutableState $captchaId$delegate, MutableState $captchaBitmap$delegate, String id, Bitmap bitmap) {
        $captchaId$delegate.setValue(id);
        $captchaBitmap$delegate.setValue(bitmap);
        return Unit.INSTANCE;
    }
}
