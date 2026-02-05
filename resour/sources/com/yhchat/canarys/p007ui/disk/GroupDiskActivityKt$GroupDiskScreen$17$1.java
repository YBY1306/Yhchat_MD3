package com.yhchat.canarys.p007ui.disk;

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

/* compiled from: GroupDiskActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.disk.GroupDiskActivityKt$GroupDiskScreen$17$1", m185f = "GroupDiskActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes8.dex */
final class GroupDiskActivityKt$GroupDiskScreen$17$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $groupId;
    final /* synthetic */ State<GroupDiskUiState> $uiState$delegate;
    final /* synthetic */ GroupDiskViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupDiskActivityKt$GroupDiskScreen$17$1(Context context, GroupDiskViewModel groupDiskViewModel, String str, State<GroupDiskUiState> state, Continuation<? super GroupDiskActivityKt$GroupDiskScreen$17$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$viewModel = groupDiskViewModel;
        this.$groupId = str;
        this.$uiState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupDiskActivityKt$GroupDiskScreen$17$1(this.$context, this.$viewModel, this.$groupId, this.$uiState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupDiskActivityKt$GroupDiskScreen$17$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (GroupDiskActivityKt.GroupDiskScreen$lambda$2(this.$uiState$delegate).getOperationSuccess()) {
                    Toast.makeText(this.$context, "\u64cd\u4f5c\u6210\u529f", 0).show();
                    this.$viewModel.resetOperationSuccess();
                    GroupDiskViewModel.loadFiles$default(this.$viewModel, this.$groupId, 0L, 2, null);
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
