package com.yhchat.canarys.p007ui.user;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.GroupRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UserDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.user.UserDetailActivityKt$UserDetailScreen$3$9$1$8$1$1", m185f = "UserDetailActivity.kt", m186i = {0}, m187l = {527}, m188m = "invokeSuspend", m189n = {"groupRepository"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes13.dex */
final class UserDetailActivityKt$UserDetailScreen$3$9$1$8$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $groupId;
    final /* synthetic */ MutableState<Boolean> $isProcessingMemberAction$delegate;
    final /* synthetic */ String $userId;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserDetailActivityKt$UserDetailScreen$3$9$1$8$1$1(Context context, String str, String str2, MutableState<Boolean> mutableState, Continuation<? super UserDetailActivityKt$UserDetailScreen$3$9$1$8$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$groupId = str;
        this.$userId = str2;
        this.$isProcessingMemberAction$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserDetailActivityKt$UserDetailScreen$3$9$1$8$1$1(this.$context, this.$groupId, this.$userId, this.$isProcessingMemberAction$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UserDetailActivityKt$UserDetailScreen$3$9$1$8$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                GroupRepository groupRepository = RepositoryFactory.INSTANCE.getGroupRepository(this.$context);
                this.L$0 = SpillingKt.nullOutSpilledVariable(groupRepository);
                this.label = 1;
                if (groupRepository.m8586setMemberRoleBWLJW6A(this.$groupId, this.$userId, 2, this) != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                ((Result) $result).getValue();
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        UserDetailActivityKt.UserDetailScreen$lambda$29(this.$isProcessingMemberAction$delegate, false);
        return Unit.INSTANCE;
    }
}
