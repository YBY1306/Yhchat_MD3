package com.yhchat.canarys.p007ui.profile;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EmailModificationActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1", m185f = "EmailModificationActivity.kt", m186i = {}, m187l = {264}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes16.dex */
final class EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Bitmap> $captchaBitmap$delegate;
    final /* synthetic */ MutableState<String> $captchaCode$delegate;
    final /* synthetic */ MutableState<String> $captchaId$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $email$delegate;
    final /* synthetic */ MutableState<Integer> $emailCodeCountdown$delegate;
    final /* synthetic */ MutableState<Boolean> $isGettingEmailCode$delegate;
    final /* synthetic */ EmailModificationViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1(EmailModificationViewModel emailModificationViewModel, MutableState<String> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, Context context, MutableState<Boolean> mutableState4, MutableState<Integer> mutableState5, MutableState<Bitmap> mutableState6, Continuation<? super EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = emailModificationViewModel;
        this.$email$delegate = mutableState;
        this.$captchaCode$delegate = mutableState2;
        this.$captchaId$delegate = mutableState3;
        this.$context = context;
        this.$isGettingEmailCode$delegate = mutableState4;
        this.$emailCodeCountdown$delegate = mutableState5;
        this.$captchaBitmap$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1(this.$viewModel, this.$email$delegate, this.$captchaCode$delegate, this.$captchaId$delegate, this.$context, this.$isGettingEmailCode$delegate, this.$emailCodeCountdown$delegate, this.$captchaBitmap$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                EmailModificationViewModel emailModificationViewModel = this.$viewModel;
                String strEmailModificationScreen$lambda$1 = EmailModificationActivityKt.EmailModificationScreen$lambda$1(this.$email$delegate);
                String strEmailModificationScreen$lambda$7 = EmailModificationActivityKt.EmailModificationScreen$lambda$7(this.$captchaCode$delegate);
                String strEmailModificationScreen$lambda$13 = EmailModificationActivityKt.EmailModificationScreen$lambda$13(this.$captchaId$delegate);
                final Context context = this.$context;
                final MutableState<Boolean> mutableState = this.$isGettingEmailCode$delegate;
                final MutableState<Integer> mutableState2 = this.$emailCodeCountdown$delegate;
                Function0<Unit> function0 = new Function0() { // from class: com.yhchat.canarys.ui.profile.EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1.invokeSuspend$lambda$0(context, mutableState, mutableState2);
                    }
                };
                final Context context2 = this.$context;
                final EmailModificationViewModel emailModificationViewModel2 = this.$viewModel;
                final MutableState<Boolean> mutableState3 = this.$isGettingEmailCode$delegate;
                final MutableState<String> mutableState4 = this.$captchaId$delegate;
                final MutableState<Bitmap> mutableState5 = this.$captchaBitmap$delegate;
                this.label = 1;
                if (emailModificationViewModel.getEmailVerificationCode(strEmailModificationScreen$lambda$1, strEmailModificationScreen$lambda$7, strEmailModificationScreen$lambda$13, function0, new Function1() { // from class: com.yhchat.canarys.ui.profile.EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1.invokeSuspend$lambda$1(context2, emailModificationViewModel2, mutableState3, mutableState4, mutableState5, (String) obj);
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(Context $context, MutableState $isGettingEmailCode$delegate, MutableState $emailCodeCountdown$delegate) {
        EmailModificationActivityKt.EmailModificationScreen$lambda$20($isGettingEmailCode$delegate, false);
        EmailModificationActivityKt.EmailModificationScreen$lambda$23($emailCodeCountdown$delegate, 60);
        Toast.makeText($context, "\u9a8c\u8bc1\u7801\u5df2\u53d1\u9001", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Context $context, EmailModificationViewModel $viewModel, MutableState $isGettingEmailCode$delegate, final MutableState $captchaId$delegate, final MutableState $captchaBitmap$delegate, String error) {
        EmailModificationActivityKt.EmailModificationScreen$lambda$20($isGettingEmailCode$delegate, false);
        Toast.makeText($context, error, 0).show();
        $viewModel.getCaptcha(new Function2() { // from class: com.yhchat.canarys.ui.profile.EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return EmailModificationActivityKt$EmailModificationScreen$4$1$3$2$1$1.invokeSuspend$lambda$1$0($captchaId$delegate, $captchaBitmap$delegate, (String) obj, (Bitmap) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1$0(MutableState $captchaId$delegate, MutableState $captchaBitmap$delegate, String id, Bitmap bitmap) {
        $captchaId$delegate.setValue(id);
        $captchaBitmap$delegate.setValue(bitmap);
        return Unit.INSTANCE;
    }
}
