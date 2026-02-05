package com.yhchat.canarys.data.repository;

import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.UserRepository", m185f = "UserRepository.kt", m186i = {0, 0, 0, 0}, m187l = {596}, m188m = "emailLogin-BWLJW6A", m189n = {NotificationCompat.CATEGORY_EMAIL, HintConstants.AUTOFILL_HINT_PASSWORD, "deviceId", "request"}, m191s = {"L$0", "L$1", "L$2", "L$3"}, m192v = 1)
/* loaded from: classes12.dex */
final class UserRepository$emailLogin$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserRepository$emailLogin$1(UserRepository userRepository, Continuation<? super UserRepository$emailLogin$1> continuation) {
        super(continuation);
        this.this$0 = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8644emailLoginBWLJW6A = this.this$0.m8644emailLoginBWLJW6A(null, null, null, this);
        return objM8644emailLoginBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8644emailLoginBWLJW6A : Result.m11918boximpl(objM8644emailLoginBWLJW6A);
    }
}
