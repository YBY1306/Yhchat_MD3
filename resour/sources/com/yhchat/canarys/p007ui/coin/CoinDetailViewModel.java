package com.yhchat.canarys.p007ui.coin;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.MyTaskInfo;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.CoinRepository;
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

/* compiled from: CoinDetailActivity.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, m169d2 = {"Lcom/yhchat/canarys/ui/coin/CoinDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "coinRepository", "Lcom/yhchat/canarys/data/repository/CoinRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/coin/CoinDetailUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadTaskInfo", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class CoinDetailViewModel extends ViewModel {
    public static final int $stable = 8;
    private CoinRepository coinRepository;
    private final MutableStateFlow<CoinDetailUiState> _uiState = StateFlowKt.MutableStateFlow(new CoinDetailUiState(false, null, null, 7, null));
    private final StateFlow<CoinDetailUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<CoinDetailUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.coinRepository = RepositoryFactory.INSTANCE.getCoinRepository(context);
    }

    /* compiled from: CoinDetailActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.coin.CoinDetailViewModel$loadTaskInfo$1", m185f = "CoinDetailActivity.kt", m186i = {}, m187l = {289}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.coin.CoinDetailViewModel$loadTaskInfo$1 */
    static final class C32771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C32771(Continuation<? super C32771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoinDetailViewModel.this.new C32771(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CoinDetailViewModel.this._uiState.setValue(CoinDetailUiState.copy$default((CoinDetailUiState) CoinDetailViewModel.this._uiState.getValue(), true, null, null, 2, null));
                    CoinRepository coinRepository = CoinDetailViewModel.this.coinRepository;
                    if (coinRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("coinRepository");
                        coinRepository = null;
                    }
                    this.label = 1;
                    Object objM8495getMyTaskInfoIoAF18A = coinRepository.m8495getMyTaskInfoIoAF18A(this);
                    if (objM8495getMyTaskInfoIoAF18A != coroutine_suspended) {
                        value = objM8495getMyTaskInfoIoAF18A;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CoinDetailViewModel coinDetailViewModel = CoinDetailViewModel.this;
            CoinDetailViewModel coinDetailViewModel2 = CoinDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                coinDetailViewModel._uiState.setValue(CoinDetailUiState.copy$default((CoinDetailUiState) coinDetailViewModel._uiState.getValue(), false, (MyTaskInfo) value, null, 4, null));
            } else {
                coinDetailViewModel2._uiState.setValue(CoinDetailUiState.copy$default((CoinDetailUiState) coinDetailViewModel2._uiState.getValue(), false, null, thM11922exceptionOrNullimpl.getMessage(), 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadTaskInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32771(null), 3, null);
    }
}
