package com.yhchat.canarys.p007ui.settings;

import androidx.compose.runtime.MutableState;
import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.data.repository.UserRepository;
import java.util.Map;
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

/* compiled from: ChangePasswordActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.ChangePasswordActivityKt$ChangePasswordScreen$sendEmailVerificationCode$1", m185f = "ChangePasswordActivity.kt", m186i = {}, m187l = {192}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* renamed from: com.yhchat.canarys.ui.settings.ChangePasswordActivityKt$ChangePasswordScreen$sendEmailVerificationCode$1 */
/* loaded from: classes8.dex */
final class C4112xd6bd91bd extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $captchaCode$delegate;
    final /* synthetic */ MutableState<String> $captchaId$delegate;
    final /* synthetic */ MutableState<String> $email$delegate;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ UserRepository $repository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C4112xd6bd91bd(UserRepository userRepository, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, Continuation<? super C4112xd6bd91bd> continuation) {
        super(2, continuation);
        this.$repository = userRepository;
        this.$isLoading$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$email$delegate = mutableState3;
        this.$captchaCode$delegate = mutableState4;
        this.$captchaId$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C4112xd6bd91bd(this.$repository, this.$isLoading$delegate, this.$error$delegate, this.$email$delegate, this.$captchaCode$delegate, this.$captchaId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C4112xd6bd91bd) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ChangePasswordActivityKt.ChangePasswordScreen$lambda$30(this.$isLoading$delegate, true);
                this.$error$delegate.setValue(null);
                this.label = 1;
                Object objM8647getEmailVerificationCodeBWLJW6A = this.$repository.m8647getEmailVerificationCodeBWLJW6A(ChangePasswordActivityKt.ChangePasswordScreen$lambda$2(this.$email$delegate), ChangePasswordActivityKt.ChangePasswordScreen$lambda$5(this.$captchaCode$delegate), ChangePasswordActivityKt.ChangePasswordScreen$lambda$8(this.$captchaId$delegate), this);
                if (objM8647getEmailVerificationCodeBWLJW6A == coroutine_suspended) {
                    return coroutine_suspended;
                }
                value = objM8647getEmailVerificationCodeBWLJW6A;
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                value = ((Result) $result).getValue();
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MutableState<String> mutableState = this.$error$delegate;
        if (Result.m11926isSuccessimpl(value)) {
            Map map = (Map) value;
            Object obj = map.get("code");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (num == null || num.intValue() != 1) {
                Object obj2 = map.get(NotificationCompat.CATEGORY_MESSAGE);
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str == null) {
                    str = "\u53d1\u9001\u9a8c\u8bc1\u7801\u5931\u8d25";
                }
                mutableState.setValue(str);
            } else {
                mutableState.setValue("\u9a8c\u8bc1\u7801\u5df2\u53d1\u9001\u5230\u90ae\u7bb1\uff0c\u8bf7\u67e5\u6536");
            }
        }
        MutableState<String> mutableState2 = this.$error$delegate;
        Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
        if (thM11922exceptionOrNullimpl != null) {
            String message = thM11922exceptionOrNullimpl.getMessage();
            mutableState2.setValue(message != null ? message : "\u53d1\u9001\u9a8c\u8bc1\u7801\u5931\u8d25");
        }
        ChangePasswordActivityKt.ChangePasswordScreen$lambda$30(this.$isLoading$delegate, false);
        return Unit.INSTANCE;
    }
}
