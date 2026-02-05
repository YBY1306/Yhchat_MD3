package com.yhchat.canarys.p007ui.settings;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.repository.UserRepository;
import kotlin.Metadata;
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
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.ChangePasswordActivityKt$ChangePasswordScreen$1$1", m185f = "ChangePasswordActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes8.dex */
final class ChangePasswordActivityKt$ChangePasswordScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $captchaId$delegate;
    final /* synthetic */ MutableState<String> $captchaImage$delegate;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ UserRepository $repository;
    final /* synthetic */ CoroutineScope $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangePasswordActivityKt$ChangePasswordScreen$1$1(CoroutineScope coroutineScope, UserRepository userRepository, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, Continuation<? super ChangePasswordActivityKt$ChangePasswordScreen$1$1> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
        this.$repository = userRepository;
        this.$isLoading$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$captchaImage$delegate = mutableState3;
        this.$captchaId$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChangePasswordActivityKt$ChangePasswordScreen$1$1(this.$scope, this.$repository, this.$isLoading$delegate, this.$error$delegate, this.$captchaImage$delegate, this.$captchaId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChangePasswordActivityKt$ChangePasswordScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                ChangePasswordActivityKt.ChangePasswordScreen$getCaptcha(this.$scope, this.$repository, this.$isLoading$delegate, this.$error$delegate, this.$captchaImage$delegate, this.$captchaId$delegate);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
