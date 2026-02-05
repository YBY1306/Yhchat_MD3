package com.yhchat.canarys.p007ui.settings;

import androidx.compose.runtime.MutableState;
import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.data.model.ChangePasswordRequest;
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
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.ChangePasswordActivityKt$ChangePasswordScreen$changePassword$1", m185f = "ChangePasswordActivity.kt", m186i = {}, m187l = {226}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes8.dex */
final class ChangePasswordActivityKt$ChangePasswordScreen$changePassword$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $email$delegate;
    final /* synthetic */ MutableState<String> $emailVerificationCode$delegate;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ MutableState<String> $newPassword$delegate;
    final /* synthetic */ UserRepository $repository;
    final /* synthetic */ MutableState<Boolean> $success$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangePasswordActivityKt$ChangePasswordScreen$changePassword$1(UserRepository userRepository, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, MutableState<Boolean> mutableState6, Continuation<? super ChangePasswordActivityKt$ChangePasswordScreen$changePassword$1> continuation) {
        super(2, continuation);
        this.$repository = userRepository;
        this.$isLoading$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$email$delegate = mutableState3;
        this.$emailVerificationCode$delegate = mutableState4;
        this.$newPassword$delegate = mutableState5;
        this.$success$delegate = mutableState6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChangePasswordActivityKt$ChangePasswordScreen$changePassword$1(this.$repository, this.$isLoading$delegate, this.$error$delegate, this.$email$delegate, this.$emailVerificationCode$delegate, this.$newPassword$delegate, this.$success$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChangePasswordActivityKt$ChangePasswordScreen$changePassword$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                Object objM8639changePasswordgIAlus = this.$repository.m8639changePasswordgIAlus(new ChangePasswordRequest(ChangePasswordActivityKt.ChangePasswordScreen$lambda$2(this.$email$delegate), ChangePasswordActivityKt.ChangePasswordScreen$lambda$14(this.$emailVerificationCode$delegate), ChangePasswordActivityKt.ChangePasswordScreen$lambda$17(this.$newPassword$delegate)), this);
                if (objM8639changePasswordgIAlus == coroutine_suspended) {
                    return coroutine_suspended;
                }
                value = objM8639changePasswordgIAlus;
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                value = ((Result) $result).getValue();
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MutableState<Boolean> mutableState = this.$success$delegate;
        MutableState<String> mutableState2 = this.$error$delegate;
        if (Result.m11926isSuccessimpl(value)) {
            Map map = (Map) value;
            Object obj = map.get("code");
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            if (num != null && num.intValue() == 1) {
                ChangePasswordActivityKt.ChangePasswordScreen$lambda$36(mutableState, true);
            } else {
                Object obj2 = map.get(NotificationCompat.CATEGORY_MESSAGE);
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str == null) {
                    str = "\u66f4\u6539\u5bc6\u7801\u5931\u8d25";
                }
                mutableState2.setValue(str);
            }
        }
        MutableState<String> mutableState3 = this.$error$delegate;
        Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
        if (thM11922exceptionOrNullimpl != null) {
            String message = thM11922exceptionOrNullimpl.getMessage();
            mutableState3.setValue(message != null ? message : "\u66f4\u6539\u5bc6\u7801\u5931\u8d25");
        }
        ChangePasswordActivityKt.ChangePasswordScreen$lambda$30(this.$isLoading$delegate, false);
        return Unit.INSTANCE;
    }
}
