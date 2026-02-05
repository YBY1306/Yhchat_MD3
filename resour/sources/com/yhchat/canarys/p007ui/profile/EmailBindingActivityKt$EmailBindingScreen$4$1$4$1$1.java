package com.yhchat.canarys.p007ui.profile;

import android.content.Context;
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

/* compiled from: EmailBindingActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.EmailBindingActivityKt$EmailBindingScreen$4$1$4$1$1", m185f = "EmailBindingActivity.kt", m186i = {}, m187l = {312}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes16.dex */
final class EmailBindingActivityKt$EmailBindingScreen$4$1$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $email$delegate;
    final /* synthetic */ MutableState<String> $emailVerificationCode$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ EmailBindingViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailBindingActivityKt$EmailBindingScreen$4$1$4$1$1(EmailBindingViewModel emailBindingViewModel, MutableState<String> mutableState, MutableState<String> mutableState2, Context context, MutableState<Boolean> mutableState3, Continuation<? super EmailBindingActivityKt$EmailBindingScreen$4$1$4$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = emailBindingViewModel;
        this.$email$delegate = mutableState;
        this.$emailVerificationCode$delegate = mutableState2;
        this.$context = context;
        this.$isLoading$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmailBindingActivityKt$EmailBindingScreen$4$1$4$1$1(this.$viewModel, this.$email$delegate, this.$emailVerificationCode$delegate, this.$context, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmailBindingActivityKt$EmailBindingScreen$4$1$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                EmailBindingViewModel emailBindingViewModel = this.$viewModel;
                String strEmailBindingScreen$lambda$1 = EmailBindingActivityKt.EmailBindingScreen$lambda$1(this.$email$delegate);
                String strEmailBindingScreen$lambda$4 = EmailBindingActivityKt.EmailBindingScreen$lambda$4(this.$emailVerificationCode$delegate);
                final Context context = this.$context;
                final MutableState<Boolean> mutableState = this.$isLoading$delegate;
                Function0<Unit> function0 = new Function0() { // from class: com.yhchat.canarys.ui.profile.EmailBindingActivityKt$EmailBindingScreen$4$1$4$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EmailBindingActivityKt$EmailBindingScreen$4$1$4$1$1.invokeSuspend$lambda$0(context, mutableState);
                    }
                };
                final Context context2 = this.$context;
                final MutableState<Boolean> mutableState2 = this.$isLoading$delegate;
                this.label = 1;
                if (emailBindingViewModel.bindEmail(strEmailBindingScreen$lambda$1, strEmailBindingScreen$lambda$4, function0, new Function1() { // from class: com.yhchat.canarys.ui.profile.EmailBindingActivityKt$EmailBindingScreen$4$1$4$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return EmailBindingActivityKt$EmailBindingScreen$4$1$4$1$1.invokeSuspend$lambda$1(context2, mutableState2, (String) obj);
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
    public static final Unit invokeSuspend$lambda$0(Context $context, MutableState $isLoading$delegate) {
        EmailBindingActivityKt.EmailBindingScreen$lambda$11($isLoading$delegate, false);
        Toast.makeText($context, "\u90ae\u7bb1\u7ed1\u5b9a\u6210\u529f", 0).show();
        EmailBindingActivity emailBindingActivity = $context instanceof EmailBindingActivity ? (EmailBindingActivity) $context : null;
        if (emailBindingActivity != null) {
            emailBindingActivity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$1(Context $context, MutableState $isLoading$delegate, String error) {
        EmailBindingActivityKt.EmailBindingScreen$lambda$11($isLoading$delegate, false);
        Toast.makeText($context, error, 0).show();
        return Unit.INSTANCE;
    }
}
