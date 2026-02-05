package com.yhchat.canarys.p007ui.profile;

import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.api.ApiService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.json.JSONObject;
import retrofit2.Response;

/* compiled from: EmailModificationViewModel.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lretrofit2/Response;", "Lokhttp3/ResponseBody;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.EmailModificationViewModel$changeEmail$response$1", m185f = "EmailModificationViewModel.kt", m186i = {}, m187l = {121}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes16.dex */
final class EmailModificationViewModel$changeEmail$response$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<ResponseBody>>, Object> {
    final /* synthetic */ JSONObject $requestBody;
    final /* synthetic */ String $token;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EmailModificationViewModel$changeEmail$response$1(String str, JSONObject jSONObject, Continuation<? super EmailModificationViewModel$changeEmail$response$1> continuation) {
        super(2, continuation);
        this.$token = str;
        this.$requestBody = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmailModificationViewModel$changeEmail$response$1(this.$token, this.$requestBody, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ResponseBody>> continuation) {
        return ((EmailModificationViewModel$changeEmail$response$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ApiService apiService = ApiClient.INSTANCE.getApiService();
                String str = this.$token;
                RequestBody.Companion companion = RequestBody.INSTANCE;
                String string = this.$requestBody.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                this.label = 1;
                Object objChangeEmail = apiService.changeEmail(str, companion.create(string, MediaType.INSTANCE.get("application/json")), this);
                if (objChangeEmail == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objChangeEmail;
            case 1:
                ResultKt.throwOnFailure($result);
                return $result;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
