package com.yhchat.canarys.data.repository;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.core.view.MotionEventCompat;
import com.yhchat.canarys.data.local.SavedAccountDao;
import com.yhchat.canarys.data.local.SecureTokenStorage;
import com.yhchat.canarys.data.model.SavedAccount;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AccountRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ8\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010\u001aJ\u0016\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u001f\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/data/repository/AccountRepository;", "", "savedAccountDao", "Lcom/yhchat/canarys/data/local/SavedAccountDao;", "context", "Landroid/content/Context;", "<init>", "(Lcom/yhchat/canarys/data/local/SavedAccountDao;Landroid/content/Context;)V", "secureStorage", "Lcom/yhchat/canarys/data/local/SecureTokenStorage;", "getSecureStorage", "()Lcom/yhchat/canarys/data/local/SecureTokenStorage;", "secureStorage$delegate", "Lkotlin/Lazy;", "getAllAccounts", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yhchat/canarys/data/model/SavedAccount;", "saveAccount", "", "userId", "", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "displayId", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAccount", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "switchToAccount", "", "getCurrentUserId", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class AccountRepository {
    public static final int $stable = 8;
    private final Context context;
    private final SavedAccountDao savedAccountDao;

    /* renamed from: secureStorage$delegate, reason: from kotlin metadata */
    private final Lazy secureStorage;

    /* compiled from: AccountRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.AccountRepository", m185f = "AccountRepository.kt", m186i = {0}, m187l = {MotionEventCompat.AXIS_GENERIC_15}, m188m = "deleteAccount", m189n = {"userId"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.AccountRepository$deleteAccount$1 */
    static final class C30251 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C30251(Continuation<? super C30251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountRepository.this.deleteAccount(null, this);
        }
    }

    /* compiled from: AccountRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.AccountRepository", m185f = "AccountRepository.kt", m186i = {0, 0, 0, 0, 0, 0}, m187l = {MotionEventCompat.AXIS_GENERIC_7}, m188m = "saveAccount", m189n = {"userId", HintConstants.AUTOFILL_HINT_NAME, "avatarUrl", "displayId", "token", "account"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.AccountRepository$saveAccount$1 */
    static final class C30261 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C30261(Continuation<? super C30261> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccountRepository.this.saveAccount(null, null, null, null, null, this);
        }
    }

    @Inject
    public AccountRepository(SavedAccountDao savedAccountDao, @ApplicationContext Context context) {
        Intrinsics.checkNotNullParameter(savedAccountDao, "savedAccountDao");
        Intrinsics.checkNotNullParameter(context, "context");
        this.savedAccountDao = savedAccountDao;
        this.context = context;
        this.secureStorage = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.repository.AccountRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountRepository.secureStorage_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final SecureTokenStorage getSecureStorage() {
        return (SecureTokenStorage) this.secureStorage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SecureTokenStorage secureStorage_delegate$lambda$0(AccountRepository this$0) {
        return new SecureTokenStorage(this$0.context);
    }

    public final Flow<List<SavedAccount>> getAllAccounts() {
        return this.savedAccountDao.getAllAccounts();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object saveAccount(java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            r19 = this;
            r0 = r19
            r1 = r25
            boolean r2 = r1 instanceof com.yhchat.canarys.data.repository.AccountRepository.C30261
            if (r2 == 0) goto L18
            r2 = r1
            com.yhchat.canarys.data.repository.AccountRepository$saveAccount$1 r2 = (com.yhchat.canarys.data.repository.AccountRepository.C30261) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.yhchat.canarys.data.repository.AccountRepository$saveAccount$1 r2 = new com.yhchat.canarys.data.repository.AccountRepository$saveAccount$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            switch(r5) {
                case 0: goto L50;
                case 1: goto L34;
                default: goto L28;
            }
        L28:
            r11 = r20
            r6 = r24
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L34:
            java.lang.Object r4 = r2.L$5
            com.yhchat.canarys.data.model.SavedAccount r4 = (com.yhchat.canarys.data.model.SavedAccount) r4
            java.lang.Object r5 = r2.L$4
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r2.L$3
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r2.L$2
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r2.L$1
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$0
            java.lang.String r9 = (java.lang.String) r9
            kotlin.ResultKt.throwOnFailure(r3)
            goto L9d
        L50:
            kotlin.ResultKt.throwOnFailure(r3)
            com.yhchat.canarys.data.model.SavedAccount r10 = new com.yhchat.canarys.data.model.SavedAccount
            r17 = 16
            r18 = 0
            r15 = 0
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r10.<init>(r11, r12, r13, r14, r15, r17, r18)
            com.yhchat.canarys.data.local.SavedAccountDao r5 = r0.savedAccountDao
            r2.L$0 = r11
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r21)
            r2.L$1 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r22)
            r2.L$2 = r6
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r23)
            r2.L$3 = r6
            r6 = r24
            r2.L$4 = r6
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r2.L$5 = r7
            r7 = 1
            r2.label = r7
            java.lang.Object r5 = r5.insertAccount(r10, r2)
            if (r5 != r4) goto L94
            return r4
        L94:
            r8 = r21
            r7 = r22
            r5 = r6
            r4 = r10
            r9 = r11
            r6 = r23
        L9d:
            com.yhchat.canarys.data.local.SecureTokenStorage r10 = r0.getSecureStorage()
            r10.saveAccountToken(r9, r5)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.AccountRepository.saveAccount(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object deleteAccount(java.lang.String r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.yhchat.canarys.data.repository.AccountRepository.C30251
            if (r0 == 0) goto L14
            r0 = r7
            com.yhchat.canarys.data.repository.AccountRepository$deleteAccount$1 r0 = (com.yhchat.canarys.data.repository.AccountRepository.C30251) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.AccountRepository$deleteAccount$1 r0 = new com.yhchat.canarys.data.repository.AccountRepository$deleteAccount$1
            r0.<init>(r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r6 = r2
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r1)
            goto L46
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.local.SavedAccountDao r3 = r5.savedAccountDao
            r0.L$0 = r6
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = r3.deleteAccountById(r6, r0)
            if (r3 != r2) goto L46
            return r2
        L46:
            com.yhchat.canarys.data.local.SecureTokenStorage r2 = r5.getSecureStorage()
            r2.removeAccountToken(r6)
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.AccountRepository.deleteAccount(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean switchToAccount(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        String token = getSecureStorage().getAccountToken(userId);
        String str = token;
        if (str == null || str.length() == 0) {
            return false;
        }
        getSecureStorage().saveUserToken(token, userId);
        return true;
    }

    public final String getCurrentUserId() {
        return getSecureStorage().getUserId();
    }
}
