package com.yhchat.canarys.p007ui.profile;

import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.model.EmailVerificationRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

/* compiled from: EmailBindingViewModel.kt */
@Metadata(m168d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0005H\n"}, m169d2 = {"<anonymous>", "Lretrofit2/Response;", "", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.EmailBindingViewModel$getEmailVerificationCode$response$1", m185f = "EmailBindingViewModel.kt", m186i = {}, m187l = {71}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes16.dex */
final class EmailBindingViewModel$getEmailVerificationCode$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Map<String, ? extends Object>>>, Object> {
    final /* synthetic */ String $captchaCode;
    final /* synthetic */ String $captchaId;
    final /* synthetic */ String $email;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailBindingViewModel$getEmailVerificationCode$response$1(String str, String str2, String str3, Continuation<? super EmailBindingViewModel$getEmailVerificationCode$response$1> continuation) {
        super(2, continuation);
        this.$email = str;
        this.$captchaCode = str2;
        this.$captchaId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmailBindingViewModel$getEmailVerificationCode$response$1(this.$email, this.$captchaCode, this.$captchaId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<Map<String, ? extends Object>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Response<Map<String, Object>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Response<Map<String, Object>>> continuation) {
        return ((EmailBindingViewModel$getEmailVerificationCode$response$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                Object emailVerificationCode = ApiClient.INSTANCE.getApiService().getEmailVerificationCode(new EmailVerificationRequest(this.$email, this.$captchaCode, this.$captchaId), this);
                if (emailVerificationCode == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return emailVerificationCode;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
