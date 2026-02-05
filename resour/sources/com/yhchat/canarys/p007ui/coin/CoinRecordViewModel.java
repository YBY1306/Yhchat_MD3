package com.yhchat.canarys.p007ui.coin;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.CoinRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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

/* compiled from: CoinRecordActivity.kt */
@Metadata(m168d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007J\u0010\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0007J\u0010\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0007J\u0010\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, m169d2 = {"Lcom/yhchat/canarys/ui/coin/CoinRecordViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "coinRepository", "Lcom/yhchat/canarys/data/repository/CoinRepository;", "loadedCoin", "", "loadedPost", "loadedComment", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/coin/CoinRecordUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadForPage", "page", "", "force", "loadCoinIncreaseDecreaseRecord", "loadPostRewardRecord", "loadCommentRewardRecord", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class CoinRecordViewModel extends ViewModel {
    public static final int $stable = 8;
    private CoinRepository coinRepository;
    private boolean loadedCoin;
    private boolean loadedComment;
    private boolean loadedPost;
    private final MutableStateFlow<CoinRecordUiState> _uiState = StateFlowKt.MutableStateFlow(new CoinRecordUiState(false, null, null, null, null, null, null, 127, null));
    private final StateFlow<CoinRecordUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<CoinRecordUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.coinRepository = RepositoryFactory.INSTANCE.getCoinRepository(context);
    }

    public final void loadForPage(int page, boolean force) {
        switch (page) {
            case 0:
                loadCoinIncreaseDecreaseRecord(force);
                break;
            case 1:
                loadPostRewardRecord(force);
                break;
            case 2:
                loadCommentRewardRecord(force);
                break;
        }
    }

    public static /* synthetic */ void loadCoinIncreaseDecreaseRecord$default(CoinRecordViewModel coinRecordViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        coinRecordViewModel.loadCoinIncreaseDecreaseRecord(z);
    }

    /* compiled from: CoinRecordActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.coin.CoinRecordViewModel$loadCoinIncreaseDecreaseRecord$1", m185f = "CoinRecordActivity.kt", m186i = {}, m187l = {448}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.coin.CoinRecordViewModel$loadCoinIncreaseDecreaseRecord$1 */
    static final class C32901 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C32901(Continuation<? super C32901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoinRecordViewModel.this.new C32901(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CoinRecordViewModel.this._uiState.setValue(CoinRecordUiState.copy$default((CoinRecordUiState) CoinRecordViewModel.this._uiState.getValue(), true, null, Boxing.boxInt(0), null, null, null, null, 112, null));
                    CoinRepository coinRepository = CoinRecordViewModel.this.coinRepository;
                    if (coinRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("coinRepository");
                        coinRepository = null;
                    }
                    this.label = 1;
                    Object objM8494getCoinIncreaseDecreaseRecord0E7RQCE = coinRepository.m8494getCoinIncreaseDecreaseRecord0E7RQCE(100, 1, this);
                    if (objM8494getCoinIncreaseDecreaseRecord0E7RQCE != coroutine_suspended) {
                        value = objM8494getCoinIncreaseDecreaseRecord0E7RQCE;
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
            CoinRecordViewModel coinRecordViewModel = CoinRecordViewModel.this;
            CoinRecordViewModel coinRecordViewModel2 = CoinRecordViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                coinRecordViewModel.loadedCoin = true;
                coinRecordViewModel._uiState.setValue(CoinRecordUiState.copy$default((CoinRecordUiState) coinRecordViewModel._uiState.getValue(), false, null, null, null, (List) value, null, null, 106, null));
            } else {
                coinRecordViewModel2._uiState.setValue(CoinRecordUiState.copy$default((CoinRecordUiState) coinRecordViewModel2._uiState.getValue(), false, thM11922exceptionOrNullimpl.getMessage(), null, Boxing.boxInt(0), null, null, null, 112, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadCoinIncreaseDecreaseRecord(boolean force) {
        if (!this.loadedCoin || force) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32901(null), 3, null);
        }
    }

    public static /* synthetic */ void loadPostRewardRecord$default(CoinRecordViewModel coinRecordViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        coinRecordViewModel.loadPostRewardRecord(z);
    }

    /* compiled from: CoinRecordActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.coin.CoinRecordViewModel$loadPostRewardRecord$1", m185f = "CoinRecordActivity.kt", m186i = {}, m187l = {474}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.coin.CoinRecordViewModel$loadPostRewardRecord$1 */
    static final class C32921 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C32921(Continuation<? super C32921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoinRecordViewModel.this.new C32921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32921) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CoinRecordViewModel.this._uiState.setValue(CoinRecordUiState.copy$default((CoinRecordUiState) CoinRecordViewModel.this._uiState.getValue(), true, null, Boxing.boxInt(1), null, null, null, null, 112, null));
                    CoinRepository coinRepository = CoinRecordViewModel.this.coinRepository;
                    if (coinRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("coinRepository");
                        coinRepository = null;
                    }
                    this.label = 1;
                    Object objM8498getRewardRecordBWLJW6A = coinRepository.m8498getRewardRecordBWLJW6A("post", 100, 1, this);
                    if (objM8498getRewardRecordBWLJW6A != coroutine_suspended) {
                        value = objM8498getRewardRecordBWLJW6A;
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
            CoinRecordViewModel coinRecordViewModel = CoinRecordViewModel.this;
            CoinRecordViewModel coinRecordViewModel2 = CoinRecordViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                coinRecordViewModel.loadedPost = true;
                coinRecordViewModel._uiState.setValue(CoinRecordUiState.copy$default((CoinRecordUiState) coinRecordViewModel._uiState.getValue(), false, null, null, null, null, (List) value, null, 90, null));
            } else {
                coinRecordViewModel2._uiState.setValue(CoinRecordUiState.copy$default((CoinRecordUiState) coinRecordViewModel2._uiState.getValue(), false, thM11922exceptionOrNullimpl.getMessage(), null, Boxing.boxInt(1), null, null, null, 112, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadPostRewardRecord(boolean force) {
        if (!this.loadedPost || force) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32921(null), 3, null);
        }
    }

    public static /* synthetic */ void loadCommentRewardRecord$default(CoinRecordViewModel coinRecordViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        coinRecordViewModel.loadCommentRewardRecord(z);
    }

    /* compiled from: CoinRecordActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.coin.CoinRecordViewModel$loadCommentRewardRecord$1", m185f = "CoinRecordActivity.kt", m186i = {}, m187l = {500}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.coin.CoinRecordViewModel$loadCommentRewardRecord$1 */
    static final class C32911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C32911(Continuation<? super C32911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CoinRecordViewModel.this.new C32911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CoinRecordViewModel.this._uiState.setValue(CoinRecordUiState.copy$default((CoinRecordUiState) CoinRecordViewModel.this._uiState.getValue(), true, null, Boxing.boxInt(2), null, null, null, null, 112, null));
                    CoinRepository coinRepository = CoinRecordViewModel.this.coinRepository;
                    if (coinRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("coinRepository");
                        coinRepository = null;
                    }
                    this.label = 1;
                    Object objM8498getRewardRecordBWLJW6A = coinRepository.m8498getRewardRecordBWLJW6A("comment", 100, 1, this);
                    if (objM8498getRewardRecordBWLJW6A != coroutine_suspended) {
                        value = objM8498getRewardRecordBWLJW6A;
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
            CoinRecordViewModel coinRecordViewModel = CoinRecordViewModel.this;
            CoinRecordViewModel coinRecordViewModel2 = CoinRecordViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                coinRecordViewModel.loadedComment = true;
                coinRecordViewModel._uiState.setValue(CoinRecordUiState.copy$default((CoinRecordUiState) coinRecordViewModel._uiState.getValue(), false, null, null, null, null, null, (List) value, 58, null));
            } else {
                coinRecordViewModel2._uiState.setValue(CoinRecordUiState.copy$default((CoinRecordUiState) coinRecordViewModel2._uiState.getValue(), false, thM11922exceptionOrNullimpl.getMessage(), null, Boxing.boxInt(2), null, null, null, 112, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadCommentRewardRecord(boolean force) {
        if (!this.loadedComment || force) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32911(null), 3, null);
        }
    }
}
