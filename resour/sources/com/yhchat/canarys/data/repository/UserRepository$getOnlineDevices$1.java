package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.UserRepository", m185f = "UserRepository.kt", m186i = {1}, m187l = {784, 785}, m188m = "getOnlineDevices-IoAF18A", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class UserRepository$getOnlineDevices$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserRepository$getOnlineDevices$1(UserRepository userRepository, Continuation<? super UserRepository$getOnlineDevices$1> continuation) {
        super(continuation);
        this.this$0 = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8649getOnlineDevicesIoAF18A = this.this$0.m8649getOnlineDevicesIoAF18A(this);
        return objM8649getOnlineDevicesIoAF18A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8649getOnlineDevicesIoAF18A : Result.m11918boximpl(objM8649getOnlineDevicesIoAF18A);
    }
}
