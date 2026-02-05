package com.yhchat.canarys.p007ui.group;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupMembersScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupMembersScreenKt$GroupMembersScreen$2$1", m185f = "GroupMembersScreen.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes9.dex */
final class GroupMembersScreenKt$GroupMembersScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ MutableState<Boolean> $isSearching$delegate;
    final /* synthetic */ MutableState<String> $searchKeyword$delegate;
    final /* synthetic */ GroupInfoViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupMembersScreenKt$GroupMembersScreen$2$1(GroupInfoViewModel groupInfoViewModel, String str, MutableState<Boolean> mutableState, MutableState<String> mutableState2, Continuation<? super GroupMembersScreenKt$GroupMembersScreen$2$1> continuation) {
        super(2, continuation);
        this.$viewModel = groupInfoViewModel;
        this.$groupId = str;
        this.$isSearching$delegate = mutableState;
        this.$searchKeyword$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupMembersScreenKt$GroupMembersScreen$2$1(this.$viewModel, this.$groupId, this.$isSearching$delegate, this.$searchKeyword$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupMembersScreenKt$GroupMembersScreen$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (GroupMembersScreenKt.GroupMembersScreen$lambda$2(this.$isSearching$delegate)) {
                    this.$viewModel.searchMembers(this.$groupId, GroupMembersScreenKt.GroupMembersScreen$lambda$5(this.$searchKeyword$delegate));
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
