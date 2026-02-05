package com.yhchat.canarys.data.repository;

import androidx.core.location.LocationRequestCompat;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.UserRepository", m185f = "UserRepository.kt", m186i = {1}, m187l = {LocationRequestCompat.QUALITY_LOW_POWER, 105}, m188m = "getUserProfile-IoAF18A", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class UserRepository$getUserProfile$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserRepository$getUserProfile$1(UserRepository userRepository, Continuation<? super UserRepository$getUserProfile$1> continuation) {
        super(continuation);
        this.this$0 = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8657getUserProfileIoAF18A = this.this$0.m8657getUserProfileIoAF18A(this);
        return objM8657getUserProfileIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8657getUserProfileIoAF18A : Result.m11918boximpl(objM8657getUserProfileIoAF18A);
    }
}
