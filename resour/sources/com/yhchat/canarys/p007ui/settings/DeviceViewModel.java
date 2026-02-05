package com.yhchat.canarys.p007ui.settings;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import java.util.List;
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

/* compiled from: DeviceViewModel.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u0010\u0013\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0014"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/DeviceViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/UserRepository;)V", "_deviceState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/settings/DeviceState;", "deviceState", "Lkotlinx/coroutines/flow/StateFlow;", "getDeviceState", "()Lkotlinx/coroutines/flow/StateFlow;", "setTokenRepository", "", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "loadOnlineDevices", "clearError", "clearDevices", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class DeviceViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<DeviceState> _deviceState;
    private final StateFlow<DeviceState> deviceState;
    private final UserRepository userRepository;

    @Inject
    public DeviceViewModel(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.userRepository = userRepository;
        this._deviceState = StateFlowKt.MutableStateFlow(new DeviceState(false, null, null, 7, null));
        this.deviceState = FlowKt.asStateFlow(this._deviceState);
    }

    public final StateFlow<DeviceState> getDeviceState() {
        return this.deviceState;
    }

    public final void setTokenRepository(TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.userRepository.setTokenRepository(tokenRepository);
    }

    /* compiled from: DeviceViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.DeviceViewModel$loadOnlineDevices$1", m185f = "DeviceViewModel.kt", m186i = {}, m187l = {39}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.settings.DeviceViewModel$loadOnlineDevices$1 */
    static final class C41761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C41761(Continuation<? super C41761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DeviceViewModel.this.new C41761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C41761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    DeviceViewModel.this._deviceState.setValue(DeviceState.copy$default((DeviceState) DeviceViewModel.this._deviceState.getValue(), true, null, null, 2, null));
                    this.label = 1;
                    Object objM8649getOnlineDevicesIoAF18A = DeviceViewModel.this.userRepository.m8649getOnlineDevicesIoAF18A(this);
                    if (objM8649getOnlineDevicesIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8649getOnlineDevicesIoAF18A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DeviceViewModel deviceViewModel = DeviceViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                deviceViewModel._deviceState.setValue(((DeviceState) deviceViewModel._deviceState.getValue()).copy(false, (List) value, null));
            }
            DeviceViewModel deviceViewModel2 = DeviceViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                deviceViewModel2._deviceState.setValue(DeviceState.copy$default((DeviceState) deviceViewModel2._deviceState.getValue(), false, null, thM11922exceptionOrNullimpl.getMessage(), 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadOnlineDevices() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C41761(null), 3, null);
    }

    public final void clearError() {
        this._deviceState.setValue(DeviceState.copy$default(this._deviceState.getValue(), false, null, null, 3, null));
    }

    public final void clearDevices() {
        this._deviceState.setValue(new DeviceState(false, null, null, 7, null));
    }
}
