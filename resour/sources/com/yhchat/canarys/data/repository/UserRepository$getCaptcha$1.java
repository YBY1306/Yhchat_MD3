package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.UserRepository", m185f = "UserRepository.kt", m186i = {}, m187l = {149}, m188m = "getCaptcha-IoAF18A", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class UserRepository$getCaptcha$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserRepository$getCaptcha$1(UserRepository userRepository, Continuation<? super UserRepository$getCaptcha$1> continuation) {
        super(continuation);
        this.this$0 = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8646getCaptchaIoAF18A = this.this$0.m8646getCaptchaIoAF18A(this);
        return objM8646getCaptchaIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8646getCaptchaIoAF18A : Result.m11918boximpl(objM8646getCaptchaIoAF18A);
    }
}
