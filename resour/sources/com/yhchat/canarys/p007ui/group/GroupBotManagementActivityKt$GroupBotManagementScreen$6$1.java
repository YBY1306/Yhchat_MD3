package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupBotManagementActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupBotManagementActivityKt$GroupBotManagementScreen$6$1", m185f = "GroupBotManagementActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes9.dex */
final class GroupBotManagementActivityKt$GroupBotManagementScreen$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ State<GroupBotManagementUiState> $uiState$delegate;
    final /* synthetic */ GroupBotManagementViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupBotManagementActivityKt$GroupBotManagementScreen$6$1(State<GroupBotManagementUiState> state, Context context, GroupBotManagementViewModel groupBotManagementViewModel, Continuation<? super GroupBotManagementActivityKt$GroupBotManagementScreen$6$1> continuation) {
        super(2, continuation);
        this.$uiState$delegate = state;
        this.$context = context;
        this.$viewModel = groupBotManagementViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupBotManagementActivityKt$GroupBotManagementScreen$6$1(this.$uiState$delegate, this.$context, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupBotManagementActivityKt$GroupBotManagementScreen$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                String operationError = GroupBotManagementActivityKt.GroupBotManagementScreen$lambda$2(this.$uiState$delegate).getOperationError();
                if (operationError != null) {
                    Context context = this.$context;
                    GroupBotManagementViewModel groupBotManagementViewModel = this.$viewModel;
                    Toast.makeText(context, operationError, 0).show();
                    groupBotManagementViewModel.resetOperationState();
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
