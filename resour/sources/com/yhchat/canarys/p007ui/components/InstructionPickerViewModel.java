package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.GroupRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: InstructionPicker.kt */
@Metadata(m168d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/InstructionPickerViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "groupRepository", "Lcom/yhchat/canarys/data/repository/GroupRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/components/InstructionPickerUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadGroupInstructions", "groupId", "", "loadBotInstructions", "botId", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class InstructionPickerViewModel extends ViewModel {
    private static final String TAG = "InstructionPicker";
    private GroupRepository groupRepository;
    public static final int $stable = 8;
    private final MutableStateFlow<InstructionPickerUiState> _uiState = StateFlowKt.MutableStateFlow(new InstructionPickerUiState(false, null, null, 7, null));
    private final StateFlow<InstructionPickerUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<InstructionPickerUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.groupRepository = RepositoryFactory.INSTANCE.getGroupRepository(context);
    }

    /* compiled from: InstructionPicker.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.InstructionPickerViewModel$loadGroupInstructions$1", m185f = "InstructionPicker.kt", m186i = {1}, m187l = {231, 233}, m188m = "invokeSuspend", m189n = {"protobufResult"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.InstructionPickerViewModel$loadGroupInstructions$1 */
    static final class C36611 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        Object L$0;
        int label;
        final /* synthetic */ InstructionPickerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36611(String str, InstructionPickerViewModel instructionPickerViewModel, Continuation<? super C36611> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.this$0 = instructionPickerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C36611(this.$groupId, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00cb  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x012b A[LOOP:0: B:36:0x0121->B:38:0x012b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x01a3  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0296 A[LOOP:2: B:48:0x0290->B:50:0x0296, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0308  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0337  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r37) {
            /*
                Method dump skipped, instructions count: 922
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.InstructionPickerViewModel.C36611.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loadGroupInstructions(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36611(groupId, this, null), 3, null);
    }

    /* compiled from: InstructionPicker.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.InstructionPickerViewModel$loadBotInstructions$1", m185f = "InstructionPicker.kt", m186i = {}, m187l = {292}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.InstructionPickerViewModel$loadBotInstructions$1 */
    static final class C36601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        int label;
        final /* synthetic */ InstructionPickerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36601(String str, InstructionPickerViewModel instructionPickerViewModel, Continuation<? super C36601> continuation) {
            super(2, continuation);
            this.$botId = str;
            this.this$0 = instructionPickerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C36601(this.$botId, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            String message;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(InstructionPickerViewModel.TAG, "\u1f916 \u5f00\u59cb\u52a0\u8f7d\u673a\u5668\u4eba\u79c1\u804a\u6307\u4ee4\uff0cbotId: " + this.$botId);
                    this.this$0._uiState.setValue(InstructionPickerUiState.copy$default((InstructionPickerUiState) this.this$0._uiState.getValue(), true, null, null, 2, null));
                    GroupRepository groupRepository = this.this$0.groupRepository;
                    if (groupRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("groupRepository");
                        groupRepository = null;
                    }
                    this.label = 1;
                    Object objM8574getBotInstructionListgIAlus = groupRepository.m8574getBotInstructionListgIAlus(this.$botId, this);
                    if (objM8574getBotInstructionListgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result = objM8574getBotInstructionListgIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    result = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List listEmptyList = (List) (Result.m11925isFailureimpl(result) ? null : result);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List instructions = listEmptyList;
            if (!instructions.isEmpty()) {
                this.this$0._uiState.setValue(InstructionPickerUiState.copy$default((InstructionPickerUiState) this.this$0._uiState.getValue(), false, instructions, null, 4, null));
            } else {
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl == null || (message = thM11922exceptionOrNullimpl.getMessage()) == null) {
                    message = "\u83b7\u53d6\u6307\u4ee4\u5931\u8d25";
                }
                String error = message;
                Log.e(InstructionPickerViewModel.TAG, "\u274c \u673a\u5668\u4eba\u6307\u4ee4\u52a0\u8f7d\u5931\u8d25: " + error);
                this.this$0._uiState.setValue(InstructionPickerUiState.copy$default((InstructionPickerUiState) this.this$0._uiState.getValue(), false, null, error, 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBotInstructions(String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36601(botId, this, null), 3, null);
    }
}
