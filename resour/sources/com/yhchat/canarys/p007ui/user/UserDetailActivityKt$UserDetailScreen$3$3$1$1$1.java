package com.yhchat.canarys.p007ui.user;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UserDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.user.UserDetailActivityKt$UserDetailScreen$3$3$1$1$1", m185f = "UserDetailActivity.kt", m186i = {0, 0, 1, 1, 1}, m187l = {347, 348}, m188m = "invokeSuspend", m189n = {"friendRepository", "tokenRepository", "friendRepository", "tokenRepository", "localToken"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2"}, m192v = 1)
/* loaded from: classes13.dex */
final class UserDetailActivityKt$UserDetailScreen$3$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $addFriendRemark$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $isAddingFriend$delegate;
    final /* synthetic */ MutableState<Boolean> $showAddFriendDialog$delegate;
    final /* synthetic */ String $userId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserDetailActivityKt$UserDetailScreen$3$3$1$1$1(Context context, String str, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super UserDetailActivityKt$UserDetailScreen$3$3$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$userId = str;
        this.$addFriendRemark$delegate = mutableState;
        this.$isAddingFriend$delegate = mutableState2;
        this.$showAddFriendDialog$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserDetailActivityKt$UserDetailScreen$3$3$1$1$1(this.$context, this.$userId, this.$addFriendRemark$delegate, this.$isAddingFriend$delegate, this.$showAddFriendDialog$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserDetailActivityKt$UserDetailScreen$3$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            switch(r1) {
                case 0: goto L2e;
                case 1: goto L21;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.Object r0 = r8.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r8.L$1
            com.yhchat.canarys.data.repository.TokenRepository r1 = (com.yhchat.canarys.data.repository.TokenRepository) r1
            java.lang.Object r2 = r8.L$0
            com.yhchat.canarys.data.repository.FriendRepository r2 = (com.yhchat.canarys.data.repository.FriendRepository) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L88
        L21:
            java.lang.Object r1 = r8.L$1
            com.yhchat.canarys.data.repository.TokenRepository r1 = (com.yhchat.canarys.data.repository.TokenRepository) r1
            java.lang.Object r2 = r8.L$0
            com.yhchat.canarys.data.repository.FriendRepository r2 = (com.yhchat.canarys.data.repository.FriendRepository) r2
            kotlin.ResultKt.throwOnFailure(r9)
            r3 = r9
            goto L56
        L2e:
            kotlin.ResultKt.throwOnFailure(r9)
            com.yhchat.canarys.data.di.RepositoryFactory r1 = com.yhchat.canarys.data.p005di.RepositoryFactory.INSTANCE
            android.content.Context r2 = r8.$context
            com.yhchat.canarys.data.repository.FriendRepository r2 = r1.getFriendRepository(r2)
            com.yhchat.canarys.data.di.RepositoryFactory r1 = com.yhchat.canarys.data.p005di.RepositoryFactory.INSTANCE
            android.content.Context r3 = r8.$context
            com.yhchat.canarys.data.repository.TokenRepository r1 = r1.getTokenRepository(r3)
            r3 = r8
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r8.L$0 = r2
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r8.L$1 = r4
            r4 = 1
            r8.label = r4
            java.lang.Object r3 = r1.getTokenSync(r3)
            if (r3 != r0) goto L56
            return r0
        L56:
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L5c
            java.lang.String r3 = ""
        L5c:
            java.lang.String r4 = r8.$userId
            androidx.compose.runtime.MutableState<java.lang.String> r5 = r8.$addFriendRemark$delegate
            java.lang.String r6 = com.yhchat.canarys.p007ui.user.UserDetailActivityKt.access$UserDetailScreen$lambda$7(r5)
            r7 = r8
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r8.L$0 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r8.L$1 = r5
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
            r8.L$2 = r5
            r5 = 2
            r8.label = r5
            r5 = 1
            java.lang.Object r4 = r2.applyFriend(r3, r4, r5, r6, r7)
            if (r4 != r0) goto L87
            return r0
        L87:
            r0 = r3
        L88:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r3 = r8.$isAddingFriend$delegate
            r4 = 0
            com.yhchat.canarys.p007ui.user.UserDetailActivityKt.access$UserDetailScreen$lambda$11(r3, r4)
            androidx.compose.runtime.MutableState<java.lang.Boolean> r3 = r8.$showAddFriendDialog$delegate
            com.yhchat.canarys.p007ui.user.UserDetailActivityKt.access$UserDetailScreen$lambda$5(r3, r4)
            android.content.Context r3 = r8.$context
            java.lang.String r5 = "\u597d\u53cb\u7533\u8bf7\u5df2\u53d1\u9001"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r5, r4)
            r3.show()
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.user.UserDetailActivityKt$UserDetailScreen$3$3$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
