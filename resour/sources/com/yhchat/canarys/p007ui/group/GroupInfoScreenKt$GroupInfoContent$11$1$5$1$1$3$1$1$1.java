package com.yhchat.canarys.p007ui.group;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupInfoScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1", m185f = "GroupInfoScreen.kt", m186i = {0, 1, 1, 2}, m187l = {568, 570, 588}, m188m = "invokeSuspend", m189n = {"groupRepository", "groupRepository", "result", "e"}, m191s = {"L$0", "L$0", "L$1", "L$0"}, m192v = 1)
/* loaded from: classes9.dex */
final class GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $currentContext;
    final /* synthetic */ String $currentGroupId;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ MutableState<String> $nicknameInput$delegate;
    final /* synthetic */ MutableState<Boolean> $showNicknameDialog$delegate;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1(Context context, String str, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1> continuation) {
        super(2, continuation);
        this.$currentContext = context;
        this.$currentGroupId = str;
        this.$nicknameInput$delegate = mutableState;
        this.$isLoading$delegate = mutableState2;
        this.$showNicknameDialog$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1(this.$currentContext, this.$currentGroupId, this.$nicknameInput$delegate, this.$isLoading$delegate, this.$showNicknameDialog$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r9.label
            switch(r0) {
                case 0: goto L34;
                case 1: goto L25;
                case 2: goto L1a;
                case 3: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L11:
            java.lang.Object r0 = r9.L$0
            java.lang.Exception r0 = (java.lang.Exception) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto Lb4
        L1a:
            java.lang.Object r0 = r9.L$1
            java.lang.Object r2 = r9.L$0
            com.yhchat.canarys.data.repository.GroupRepository r2 = (com.yhchat.canarys.data.repository.GroupRepository) r2
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L8c
            r2 = r10
            goto L89
        L25:
            java.lang.Object r0 = r9.L$0
            com.yhchat.canarys.data.repository.GroupRepository r0 = (com.yhchat.canarys.data.repository.GroupRepository) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Exception -> L8c
            r2 = r10
            kotlin.Result r2 = (kotlin.Result) r2     // Catch: java.lang.Exception -> L8c
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Exception -> L8c
            goto L5b
        L34:
            kotlin.ResultKt.throwOnFailure(r10)
            com.yhchat.canarys.data.di.RepositoryFactory r0 = com.yhchat.canarys.data.p005di.RepositoryFactory.INSTANCE     // Catch: java.lang.Exception -> L8c
            android.content.Context r2 = r9.$currentContext     // Catch: java.lang.Exception -> L8c
            com.yhchat.canarys.data.repository.GroupRepository r0 = r0.getGroupRepository(r2)     // Catch: java.lang.Exception -> L8c
            java.lang.String r2 = r9.$currentGroupId     // Catch: java.lang.Exception -> L8c
            androidx.compose.runtime.MutableState<java.lang.String> r3 = r9.$nicknameInput$delegate     // Catch: java.lang.Exception -> L8c
            java.lang.String r3 = com.yhchat.canarys.p007ui.group.GroupInfoScreenKt.access$GroupInfoContent$lambda$16$0$4$0$0$5(r3)     // Catch: java.lang.Exception -> L8c
            r4 = r9
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Exception -> L8c
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Exception -> L8c
            r9.L$0 = r5     // Catch: java.lang.Exception -> L8c
            r5 = 1
            r9.label = r5     // Catch: java.lang.Exception -> L8c
            java.lang.Object r2 = r0.m8572editMyGroupNickname0E7RQCE(r2, r3, r4)     // Catch: java.lang.Exception -> L8c
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r4 = r2
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Exception -> L8c
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2     // Catch: java.lang.Exception -> L8c
            com.yhchat.canarys.ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1$1 r3 = new com.yhchat.canarys.ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1$1     // Catch: java.lang.Exception -> L8c
            android.content.Context r5 = r9.$currentContext     // Catch: java.lang.Exception -> L8c
            androidx.compose.runtime.MutableState<java.lang.Boolean> r6 = r9.$isLoading$delegate     // Catch: java.lang.Exception -> L8c
            androidx.compose.runtime.MutableState<java.lang.Boolean> r7 = r9.$showNicknameDialog$delegate     // Catch: java.lang.Exception -> L8c
            r8 = 0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L8c
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3     // Catch: java.lang.Exception -> L8c
            r5 = r9
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5     // Catch: java.lang.Exception -> L8c
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Exception -> L8c
            r9.L$0 = r6     // Catch: java.lang.Exception -> L8c
            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r4)     // Catch: java.lang.Exception -> L8c
            r9.L$1 = r6     // Catch: java.lang.Exception -> L8c
            r6 = 2
            r9.label = r6     // Catch: java.lang.Exception -> L8c
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.withContext(r2, r3, r5)     // Catch: java.lang.Exception -> L8c
            if (r2 != r1) goto L89
            return r1
        L89:
            kotlin.Unit r2 = (kotlin.Unit) r2     // Catch: java.lang.Exception -> L8c
            goto Lb5
        L8c:
            r0 = move-exception
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            com.yhchat.canarys.ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1$2 r3 = new com.yhchat.canarys.ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1$2
            android.content.Context r4 = r9.$currentContext
            androidx.compose.runtime.MutableState<java.lang.Boolean> r5 = r9.$isLoading$delegate
            r6 = 0
            r3.<init>(r4, r0, r5, r6)
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r4 = r9
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
            r9.L$0 = r5
            r9.L$1 = r6
            r5 = 3
            r9.label = r5
            java.lang.Object r2 = kotlinx.coroutines.BuildersKt.withContext(r2, r3, r4)
            if (r2 != r1) goto Lb4
            return r1
        Lb4:
        Lb5:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* compiled from: GroupInfoScreen.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1$1", m185f = "GroupInfoScreen.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1$1 */
    static final class C39781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $currentContext;
        final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
        final /* synthetic */ Object $result;
        final /* synthetic */ MutableState<Boolean> $showNicknameDialog$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39781(Object obj, Context context, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super C39781> continuation) {
            super(2, continuation);
            this.$result = obj;
            this.$currentContext = context;
            this.$isLoading$delegate = mutableState;
            this.$showNicknameDialog$delegate = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C39781(this.$result, this.$currentContext, this.$isLoading$delegate, this.$showNicknameDialog$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Object obj = this.$result;
                    Context context = this.$currentContext;
                    MutableState<Boolean> mutableState = this.$isLoading$delegate;
                    MutableState<Boolean> mutableState2 = this.$showNicknameDialog$delegate;
                    Context context2 = this.$currentContext;
                    MutableState<Boolean> mutableState3 = this.$isLoading$delegate;
                    Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(obj);
                    if (thM11922exceptionOrNullimpl != null) {
                        Toast.makeText(context2, "\u4fee\u6539\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), 0).show();
                        GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$9(mutableState3, false);
                        return Unit.INSTANCE;
                    }
                    ((Boolean) obj).booleanValue();
                    Toast.makeText(context, "\u7fa4\u6635\u79f0\u4fee\u6539\u6210\u529f", 0).show();
                    GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$9(mutableState, false);
                    GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$2(mutableState2, false);
                    boolean z = context instanceof Activity;
                    Activity activity = z ? (Activity) context : null;
                    context.startActivity(activity != null ? activity.getIntent() : null);
                    Activity activity2 = z ? (Activity) context : null;
                    if (activity2 == null) {
                        return null;
                    }
                    activity2.finish();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: GroupInfoScreen.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1$2", m185f = "GroupInfoScreen.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$5$1$1$3$1$1$1$2 */
    static final class C39792 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $currentContext;

        /* renamed from: $e */
        final /* synthetic */ Exception f703$e;
        final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39792(Context context, Exception exc, MutableState<Boolean> mutableState, Continuation<? super C39792> continuation) {
            super(2, continuation);
            this.$currentContext = context;
            this.f703$e = exc;
            this.$isLoading$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C39792(this.$currentContext, this.f703$e, this.$isLoading$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39792) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Toast.makeText(this.$currentContext, "\u4fee\u6539\u5931\u8d25: " + this.f703$e.getMessage(), 0).show();
                    GroupInfoScreenKt.GroupInfoContent$lambda$16$0$4$0$0$9(this.$isLoading$delegate, false);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
