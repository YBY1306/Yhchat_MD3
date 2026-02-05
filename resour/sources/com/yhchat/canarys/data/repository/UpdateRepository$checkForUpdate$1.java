package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UpdateRepository.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.UpdateRepository", m185f = "UpdateRepository.kt", m186i = {0}, m187l = {62}, m188m = "checkForUpdate-gIAlu-s", m189n = {"isLatestBuildPreview"}, m191s = {"Z$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class UpdateRepository$checkForUpdate$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UpdateRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateRepository$checkForUpdate$1(UpdateRepository updateRepository, Continuation<? super UpdateRepository$checkForUpdate$1> continuation) {
        super(continuation);
        this.this$0 = updateRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM8633checkForUpdategIAlus = this.this$0.m8633checkForUpdategIAlus(false, this);
        return objM8633checkForUpdategIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM8633checkForUpdategIAlus : Result.m11918boximpl(objM8633checkForUpdategIAlus);
    }
}
