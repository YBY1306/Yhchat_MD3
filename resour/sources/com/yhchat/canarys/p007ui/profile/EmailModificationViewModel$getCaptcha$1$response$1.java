package com.yhchat.canarys.p007ui.profile;

import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.model.CaptchaResponse;
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

/* compiled from: EmailModificationViewModel.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/yhchat/canarys/data/model/CaptchaResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.EmailModificationViewModel$getCaptcha$1$response$1", m185f = "EmailModificationViewModel.kt", m186i = {}, m187l = {31}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes16.dex */
final class EmailModificationViewModel$getCaptcha$1$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<CaptchaResponse>>, Object> {
    int label;

    EmailModificationViewModel$getCaptcha$1$response$1(Continuation<? super EmailModificationViewModel$getCaptcha$1$response$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmailModificationViewModel$getCaptcha$1$response$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<CaptchaResponse>> continuation) {
        return ((EmailModificationViewModel$getCaptcha$1$response$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                Object captcha = ApiClient.INSTANCE.getApiService().getCaptcha(this);
                if (captcha == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return captcha;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
