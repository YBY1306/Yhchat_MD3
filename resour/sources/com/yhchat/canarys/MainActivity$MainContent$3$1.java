package com.yhchat.canarys;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import com.yhchat.canarys.data.repository.UserRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MainActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.MainActivity$MainContent$3$1", m185f = "MainActivity.kt", m186i = {0, 0}, m187l = {107}, m188m = "invokeSuspend", m189n = {"loginToken\\1", "$i$a$-let-MainActivity$MainContent$3$1$1\\1\\106\\0"}, m191s = {"L$3", "I$0"}, m192v = 1)
/* loaded from: classes3.dex */
final class MainActivity$MainContent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MainViewModel $mainViewModel;
    final /* synthetic */ MutableState<String> $pendingLoginToken$delegate;
    final /* synthetic */ MutableState<String> $userId$delegate;
    final /* synthetic */ State<UserRepository> $userRepository$delegate;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$MainContent$3$1(MutableState<String> mutableState, State<UserRepository> state, MainViewModel mainViewModel, MutableState<String> mutableState2, Continuation<? super MainActivity$MainContent$3$1> continuation) {
        super(2, continuation);
        this.$pendingLoginToken$delegate = mutableState;
        this.$userRepository$delegate = state;
        this.$mainViewModel = mainViewModel;
        this.$userId$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainActivity$MainContent$3$1(this.$pendingLoginToken$delegate, this.$userRepository$delegate, this.$mainViewModel, this.$userId$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MainActivity$MainContent$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            switch(r1) {
                case 0: goto L2e;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            int r0 = r9.I$0
            java.lang.Object r1 = r9.L$3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r9.L$2
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            java.lang.Object r3 = r9.L$1
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            java.lang.Object r4 = r9.L$0
            com.yhchat.canarys.MainViewModel r4 = (com.yhchat.canarys.MainViewModel) r4
            kotlin.ResultKt.throwOnFailure(r10)
            r5 = r10
            kotlin.Result r5 = (kotlin.Result) r5
            java.lang.Object r5 = r5.getValue()
            goto L62
        L2e:
            kotlin.ResultKt.throwOnFailure(r10)
            androidx.compose.runtime.MutableState<java.lang.String> r1 = r9.$pendingLoginToken$delegate
            java.lang.String r1 = com.yhchat.canarys.MainActivity.access$MainContent$lambda$25(r1)
            if (r1 == 0) goto Lae
            androidx.compose.runtime.State<com.yhchat.canarys.data.repository.UserRepository> r2 = r9.$userRepository$delegate
            com.yhchat.canarys.MainViewModel r4 = r9.$mainViewModel
            androidx.compose.runtime.MutableState<java.lang.String> r3 = r9.$userId$delegate
            androidx.compose.runtime.MutableState<java.lang.String> r5 = r9.$pendingLoginToken$delegate
            r6 = 0
            com.yhchat.canarys.data.repository.UserRepository r2 = com.yhchat.canarys.MainActivity.access$MainContent$lambda$5(r2)
            if (r2 == 0) goto La8
            r9.L$0 = r4
            r9.L$1 = r3
            r9.L$2 = r5
            r9.L$3 = r1
            r9.I$0 = r6
            r7 = 1
            r9.label = r7
            java.lang.Object r2 = r2.m8656getUserInfoIoAF18A(r9)
            if (r2 != r0) goto L5e
            return r0
        L5e:
            r0 = r5
            r5 = r2
            r2 = r0
            r0 = r6
        L62:
            boolean r6 = kotlin.Result.m11926isSuccessimpl(r5)
            if (r6 == 0) goto L7b
            r6 = r5
            com.yhchat.canarys.data.model.User r6 = (com.yhchat.canarys.data.model.User) r6
            r7 = 0
            java.lang.String r8 = r6.getId()
            com.yhchat.canarys.MainActivity.access$MainContent$lambda$11(r3, r8)
            java.lang.String r3 = r6.getId()
            r4.onLoginSuccess(r1, r3)
        L7b:
            java.lang.Throwable r3 = kotlin.Result.m11922exceptionOrNullimpl(r5)
            if (r3 == 0) goto La3
            r4 = 0
            java.lang.String r6 = r3.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "\u83b7\u53d6\u7528\u6237\u4fe1\u606f\u5931\u8d25: "
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            java.io.PrintStream r7 = java.lang.System.out
            r7.println(r6)
        La3:
            kotlin.Result.m11918boximpl(r5)
            r6 = r0
            r5 = r2
        La8:
            r0 = 0
            com.yhchat.canarys.MainActivity.access$MainContent$lambda$26(r5, r0)
        Lae:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.MainActivity$MainContent$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
