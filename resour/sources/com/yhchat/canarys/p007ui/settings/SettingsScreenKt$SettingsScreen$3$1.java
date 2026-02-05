package com.yhchat.canarys.p007ui.settings;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.repository.TokenRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SettingsScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.SettingsScreenKt$SettingsScreen$3$1", m185f = "SettingsScreen.kt", m186i = {0, 0, 0}, m187l = {75}, m188m = "invokeSuspend", m189n = {"tokenRepo\\1", "userRepo\\1", "$i$a$-let-SettingsScreenKt$SettingsScreen$3$1$1\\1\\72\\0"}, m191s = {"L$1", "L$2", "I$0"}, m192v = 1)
/* loaded from: classes8.dex */
final class SettingsScreenKt$SettingsScreen$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ TokenRepository $tokenRepository;
    final /* synthetic */ MutableState<String> $userEmail$delegate;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SettingsScreenKt$SettingsScreen$3$1(TokenRepository tokenRepository, Context context, MutableState<String> mutableState, Continuation<? super SettingsScreenKt$SettingsScreen$3$1> continuation) {
        super(2, continuation);
        this.$tokenRepository = tokenRepository;
        this.$context = context;
        this.$userEmail$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SettingsScreenKt$SettingsScreen$3$1(this.$tokenRepository, this.$context, this.$userEmail$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SettingsScreenKt$SettingsScreen$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            switch(r1) {
                case 0: goto L2a;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            int r0 = r7.I$0
            java.lang.Object r1 = r7.L$2
            com.yhchat.canarys.data.repository.UserRepository r1 = (com.yhchat.canarys.data.repository.UserRepository) r1
            java.lang.Object r2 = r7.L$1
            com.yhchat.canarys.data.repository.TokenRepository r2 = (com.yhchat.canarys.data.repository.TokenRepository) r2
            java.lang.Object r3 = r7.L$0
            androidx.compose.runtime.MutableState r3 = (androidx.compose.runtime.MutableState) r3
            kotlin.ResultKt.throwOnFailure(r8)
            r4 = r8
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r4 = r4.getValue()
            goto L5e
        L2a:
            kotlin.ResultKt.throwOnFailure(r8)
            com.yhchat.canarys.data.repository.TokenRepository r1 = r7.$tokenRepository
            if (r1 == 0) goto L76
            android.content.Context r2 = r7.$context
            androidx.compose.runtime.MutableState<java.lang.String> r3 = r7.$userEmail$delegate
            r4 = 0
            com.yhchat.canarys.data.di.RepositoryFactory r5 = com.yhchat.canarys.data.p005di.RepositoryFactory.INSTANCE
            com.yhchat.canarys.data.repository.UserRepository r2 = r5.getUserRepository(r2)
            r2.setTokenRepository(r1)
            r7.L$0 = r3
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r7.L$1 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r7.L$2 = r5
            r7.I$0 = r4
            r5 = 1
            r7.label = r5
            java.lang.Object r5 = r2.m8657getUserProfileIoAF18A(r7)
            if (r5 != r0) goto L59
            return r0
        L59:
            r0 = r2
            r2 = r1
            r1 = r0
            r0 = r4
            r4 = r5
        L5e:
            boolean r5 = kotlin.Result.m11926isSuccessimpl(r4)
            if (r5 == 0) goto L74
            com.yhchat.canarys.data.model.UserProfile r4 = (com.yhchat.canarys.data.model.UserProfile) r4
            r5 = 0
            java.lang.String r6 = r4.getEmail()
            if (r6 != 0) goto L6f
            java.lang.String r6 = ""
        L6f:
            com.yhchat.canarys.p007ui.settings.SettingsScreenKt.access$SettingsScreen$lambda$4(r3, r6)
        L74:
        L76:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt$SettingsScreen$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
