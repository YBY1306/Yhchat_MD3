package com.yhchat.canarys.p007ui.profile;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.CaptchaData;
import com.yhchat.canarys.data.model.CaptchaResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import retrofit2.Response;

/* compiled from: EmailBindingViewModel.kt */
@Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u0006\u001a\u00020\u00072\u001a\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00070\tJH\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0014J@\u0010\u0015\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\u0013H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0019\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/ui/profile/EmailBindingViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getCaptcha", "", "onResult", "Lkotlin/Function2;", "", "Landroid/graphics/Bitmap;", "getEmailVerificationCode", NotificationCompat.CATEGORY_EMAIL, "captchaCode", "captchaId", "onSuccess", "Lkotlin/Function0;", "onError", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bindEmail", "captcha", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decodeBase64ToBitmap", "base64String", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final class EmailBindingViewModel extends ViewModel {
    public static final int $stable = 8;
    private final Context context;

    /* compiled from: EmailBindingViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.EmailBindingViewModel", m185f = "EmailBindingViewModel.kt", m186i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, m187l = {108, 120}, m188m = "bindEmail", m189n = {NotificationCompat.CATEGORY_EMAIL, "captcha", "onSuccess", "onError", "tokenRepository", NotificationCompat.CATEGORY_EMAIL, "captcha", "onSuccess", "onError", "tokenRepository", "token", "requestBody"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.EmailBindingViewModel$bindEmail$1 */
    static final class C40611 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        C40611(Continuation<? super C40611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailBindingViewModel.this.bindEmail(null, null, null, null, this);
        }
    }

    /* compiled from: EmailBindingViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.EmailBindingViewModel", m185f = "EmailBindingViewModel.kt", m186i = {0, 0, 0, 0, 0}, m187l = {70}, m188m = "getEmailVerificationCode", m189n = {NotificationCompat.CATEGORY_EMAIL, "captchaCode", "captchaId", "onSuccess", "onError"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.EmailBindingViewModel$getEmailVerificationCode$1 */
    static final class C40631 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C40631(Continuation<? super C40631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EmailBindingViewModel.this.getEmailVerificationCode(null, null, null, null, null, this);
        }
    }

    public EmailBindingViewModel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* compiled from: EmailBindingViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.EmailBindingViewModel$getCaptcha$1", m185f = "EmailBindingViewModel.kt", m186i = {}, m187l = {30}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.EmailBindingViewModel$getCaptcha$1 */
    static final class C40621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<String, Bitmap, Unit> $onResult;
        int label;
        final /* synthetic */ EmailBindingViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C40621(Function2<? super String, ? super Bitmap, Unit> function2, EmailBindingViewModel emailBindingViewModel, Continuation<? super C40621> continuation) {
            super(2, continuation);
            this.$onResult = function2;
            this.this$0 = emailBindingViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C40621(this.$onResult, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objWithContext;
            String id;
            String b64s;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new EmailBindingViewModel$getCaptcha$1$response$1(null), this);
                        if (objWithContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objWithContext = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Response response = (Response) objWithContext;
                if (response.isSuccessful()) {
                    CaptchaResponse captchaResponse = (CaptchaResponse) response.body();
                    if (captchaResponse != null) {
                        EmailBindingViewModel emailBindingViewModel = this.this$0;
                        Function2<String, Bitmap, Unit> function2 = this.$onResult;
                        if (captchaResponse.getCode() == 1) {
                            CaptchaData data = captchaResponse.getData();
                            if (data == null || (id = data.getId()) == null) {
                                id = "";
                            }
                            if (data == null || (b64s = data.getB64s()) == null) {
                                b64s = "";
                            }
                            function2.invoke(id, emailBindingViewModel.decodeBase64ToBitmap(b64s));
                        } else {
                            function2.invoke("", null);
                        }
                    }
                } else {
                    this.$onResult.invoke("", null);
                }
            } catch (Exception e) {
                e.printStackTrace();
                this.$onResult.invoke("", null);
            }
            return Unit.INSTANCE;
        }
    }

    public final void getCaptcha(Function2<? super String, ? super Bitmap, Unit> onResult) {
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40621(onResult, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getEmailVerificationCode(java.lang.String r8, java.lang.String r9, java.lang.String r10, kotlin.jvm.functions.Function0<kotlin.Unit> r11, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof com.yhchat.canarys.p007ui.profile.EmailBindingViewModel.C40631
            if (r0 == 0) goto L14
            r0 = r13
            com.yhchat.canarys.ui.profile.EmailBindingViewModel$getEmailVerificationCode$1 r0 = (com.yhchat.canarys.p007ui.profile.EmailBindingViewModel.C40631) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.ui.profile.EmailBindingViewModel$getEmailVerificationCode$1 r0 = new com.yhchat.canarys.ui.profile.EmailBindingViewModel$getEmailVerificationCode$1
            r0.<init>(r13)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            r4 = 1
            switch(r3) {
                case 0: goto L4b;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2d:
            java.lang.Object r2 = r0.L$4
            r12 = r2
            kotlin.jvm.functions.Function1 r12 = (kotlin.jvm.functions.Function1) r12
            java.lang.Object r2 = r0.L$3
            r11 = r2
            kotlin.jvm.functions.Function0 r11 = (kotlin.jvm.functions.Function0) r11
            java.lang.Object r2 = r0.L$2
            r10 = r2
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r2 = r0.L$1
            r9 = r2
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r2 = r0.L$0
            r8 = r2
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> Lbe
            r3 = r1
            goto L7c
        L4b:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlinx.coroutines.CoroutineDispatcher r3 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> Lbe
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3     // Catch: java.lang.Exception -> Lbe
            com.yhchat.canarys.ui.profile.EmailBindingViewModel$getEmailVerificationCode$response$1 r5 = new com.yhchat.canarys.ui.profile.EmailBindingViewModel$getEmailVerificationCode$response$1     // Catch: java.lang.Exception -> Lbe
            r6 = 0
            r5.<init>(r8, r9, r10, r6)     // Catch: java.lang.Exception -> Lbe
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5     // Catch: java.lang.Exception -> Lbe
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)     // Catch: java.lang.Exception -> Lbe
            r0.L$0 = r6     // Catch: java.lang.Exception -> Lbe
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r9)     // Catch: java.lang.Exception -> Lbe
            r0.L$1 = r6     // Catch: java.lang.Exception -> Lbe
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)     // Catch: java.lang.Exception -> Lbe
            r0.L$2 = r6     // Catch: java.lang.Exception -> Lbe
            r0.L$3 = r11     // Catch: java.lang.Exception -> Lbe
            r0.L$4 = r12     // Catch: java.lang.Exception -> Lbe
            r0.label = r4     // Catch: java.lang.Exception -> Lbe
            java.lang.Object r3 = kotlinx.coroutines.BuildersKt.withContext(r3, r5, r0)     // Catch: java.lang.Exception -> Lbe
            if (r3 != r2) goto L7c
            return r2
        L7c:
            retrofit2.Response r3 = (retrofit2.Response) r3     // Catch: java.lang.Exception -> Lbe
            boolean r2 = r3.isSuccessful()     // Catch: java.lang.Exception -> Lbe
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r3.body()     // Catch: java.lang.Exception -> Lbe
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Exception -> Lbe
            if (r2 == 0) goto L9b
            java.lang.String r5 = "code"
            java.lang.Object r5 = r2.get(r5)     // Catch: java.lang.Exception -> Lbe
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)     // Catch: java.lang.Exception -> Lbe
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r4)     // Catch: java.lang.Exception -> Lbe
            goto L9c
        L9b:
            r4 = 0
        L9c:
            if (r4 == 0) goto La2
            r11.invoke()     // Catch: java.lang.Exception -> Lbe
            goto Ldc
        La2:
            if (r2 == 0) goto Lb2
            java.lang.String r4 = "msg"
            java.lang.Object r4 = r2.get(r4)     // Catch: java.lang.Exception -> Lbe
            if (r4 == 0) goto Lb2
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> Lbe
            if (r4 != 0) goto Lb4
        Lb2:
            java.lang.String r4 = "\u83b7\u53d6\u9a8c\u8bc1\u7801\u5931\u8d25"
        Lb4:
            r12.invoke(r4)     // Catch: java.lang.Exception -> Lbe
            goto Ldc
        Lb8:
            java.lang.String r2 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25"
            r12.invoke(r2)     // Catch: java.lang.Exception -> Lbe
            goto Ldc
        Lbe:
            r2 = move-exception
            r2.printStackTrace()
            java.lang.String r3 = r2.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "\u83b7\u53d6\u9a8c\u8bc1\u7801\u5931\u8d25: "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            r12.invoke(r3)
        Ldc:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.EmailBindingViewModel.getEmailVerificationCode(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00ce A[Catch: Exception -> 0x0083, TryCatch #4 {Exception -> 0x0083, blocks: (B:142:0x0126, B:144:0x012e, B:146:0x0136, B:148:0x013c, B:150:0x014e, B:151:0x0152, B:154:0x0167, B:111:0x007e, B:128:0x00bb, B:130:0x00c2, B:136:0x00ce, B:138:0x00d6), top: B:181:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00d6 A[Catch: Exception -> 0x0083, TryCatch #4 {Exception -> 0x0083, blocks: (B:142:0x0126, B:144:0x012e, B:146:0x0136, B:148:0x013c, B:150:0x014e, B:151:0x0152, B:154:0x0167, B:111:0x007e, B:128:0x00bb, B:130:0x00c2, B:136:0x00ce, B:138:0x00d6), top: B:181:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x012e A[Catch: Exception -> 0x0083, TryCatch #4 {Exception -> 0x0083, blocks: (B:142:0x0126, B:144:0x012e, B:146:0x0136, B:148:0x013c, B:150:0x014e, B:151:0x0152, B:154:0x0167, B:111:0x007e, B:128:0x00bb, B:130:0x00c2, B:136:0x00ce, B:138:0x00d6), top: B:181:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0167 A[Catch: Exception -> 0x0083, TRY_LEAVE, TryCatch #4 {Exception -> 0x0083, blocks: (B:142:0x0126, B:144:0x012e, B:146:0x0136, B:148:0x013c, B:150:0x014e, B:151:0x0152, B:154:0x0167, B:111:0x007e, B:128:0x00bb, B:130:0x00c2, B:136:0x00ce, B:138:0x00d6), top: B:181:0x007e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object bindEmail(java.lang.String r18, java.lang.String r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r21, kotlin.coroutines.Continuation<? super kotlin.Unit> r22) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.EmailBindingViewModel.bindEmail(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Bitmap decodeBase64ToBitmap(String base64String) {
        String base64Data;
        try {
            if (StringsKt.startsWith$default(base64String, "data:image", false, 2, (Object) null)) {
                base64Data = base64String.substring(StringsKt.indexOf$default((CharSequence) base64String, ",", 0, false, 6, (Object) null) + 1);
                Intrinsics.checkNotNullExpressionValue(base64Data, "substring(...)");
            } else {
                base64Data = base64String;
            }
            byte[] decodedBytes = Base64.decode(base64Data, 0);
            return BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.length);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
