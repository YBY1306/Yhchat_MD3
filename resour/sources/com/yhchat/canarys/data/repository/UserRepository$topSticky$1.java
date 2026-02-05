package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.simpleframework.xml.strategy.Name;

/* compiled from: UserRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.UserRepository", m185f = "UserRepository.kt", m186i = {0, 1, 1, 1}, m187l = {358, 360}, m188m = "topSticky-gIAlu-s", m189n = {Name.MARK, "token", "request", Name.MARK}, m191s = {"I$0", "L$0", "L$1", "I$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class UserRepository$topSticky$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserRepository$topSticky$1(UserRepository userRepository, Continuation<? super UserRepository$topSticky$1> continuation) {
        super(continuation);
        this.this$0 = userRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8663topStickygIAlus = this.this$0.m8663topStickygIAlus(0, this);
        return objM8663topStickygIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8663topStickygIAlus : Result.m11918boximpl(objM8663topStickygIAlus);
    }
}
