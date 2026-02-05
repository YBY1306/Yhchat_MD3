package com.yhchat.canarys.p007ui.settings;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.UpdateInfo;
import com.yhchat.canarys.data.repository.UpdateRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
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

/* compiled from: UpdateViewModel.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/UpdateViewModel;", "Landroidx/lifecycle/ViewModel;", "updateRepository", "Lcom/yhchat/canarys/data/repository/UpdateRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/UpdateRepository;)V", "_updateState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/settings/UpdateState;", "updateState", "Lkotlinx/coroutines/flow/StateFlow;", "getUpdateState", "()Lkotlinx/coroutines/flow/StateFlow;", "checkForUpdate", "", "isLatestBuildPreview", "", "clearError", "clearUpdateInfo", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class UpdateViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<UpdateState> _updateState;
    private final UpdateRepository updateRepository;
    private final StateFlow<UpdateState> updateState;

    @Inject
    public UpdateViewModel(UpdateRepository updateRepository) {
        Intrinsics.checkNotNullParameter(updateRepository, "updateRepository");
        this.updateRepository = updateRepository;
        this._updateState = StateFlowKt.MutableStateFlow(new UpdateState(false, null, null, 7, null));
        this.updateState = FlowKt.asStateFlow(this._updateState);
    }

    public final StateFlow<UpdateState> getUpdateState() {
        return this.updateState;
    }

    /* compiled from: UpdateViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.UpdateViewModel$checkForUpdate$1", m185f = "UpdateViewModel.kt", m186i = {}, m187l = {32}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.settings.UpdateViewModel$checkForUpdate$1 */
    static final class C42071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isLatestBuildPreview;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42071(boolean z, Continuation<? super C42071> continuation) {
            super(2, continuation);
            this.$isLatestBuildPreview = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UpdateViewModel.this.new C42071(this.$isLatestBuildPreview, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    UpdateViewModel.this._updateState.setValue(UpdateState.copy$default((UpdateState) UpdateViewModel.this._updateState.getValue(), true, null, null, 2, null));
                    this.label = 1;
                    Object objM8633checkForUpdategIAlus = UpdateViewModel.this.updateRepository.m8633checkForUpdategIAlus(this.$isLatestBuildPreview, this);
                    if (objM8633checkForUpdategIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8633checkForUpdategIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UpdateViewModel updateViewModel = UpdateViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                updateViewModel._updateState.setValue(((UpdateState) updateViewModel._updateState.getValue()).copy(false, (UpdateInfo) value, null));
            }
            UpdateViewModel updateViewModel2 = UpdateViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                updateViewModel2._updateState.setValue(UpdateState.copy$default((UpdateState) updateViewModel2._updateState.getValue(), false, null, thM11922exceptionOrNullimpl.getMessage(), 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void checkForUpdate$default(UpdateViewModel updateViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        updateViewModel.checkForUpdate(z);
    }

    public final void checkForUpdate(boolean isLatestBuildPreview) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C42071(isLatestBuildPreview, null), 3, null);
    }

    public final void clearError() {
        this._updateState.setValue(UpdateState.copy$default(this._updateState.getValue(), false, null, null, 3, null));
    }

    public final void clearUpdateInfo() {
        this._updateState.setValue(UpdateState.copy$default(this._updateState.getValue(), false, null, null, 5, null));
    }
}
