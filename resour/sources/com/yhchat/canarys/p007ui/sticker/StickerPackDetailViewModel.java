package com.yhchat.canarys.p007ui.sticker;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.StickerPackDetailData;
import com.yhchat.canarys.data.repository.StickerRepository;
import javax.inject.Inject;
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

/* compiled from: StickerPackDetailViewModel.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/ui/sticker/StickerPackDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "stickerRepository", "Lcom/yhchat/canarys/data/repository/StickerRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/StickerRepository;)V", "tag", "", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/sticker/StickerPackDetailUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadStickerPackDetail", "", "stickerPackId", "addStickerPackToFavorites", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final class StickerPackDetailViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<StickerPackDetailUiState> _uiState;
    private final StickerRepository stickerRepository;
    private final String tag;
    private final StateFlow<StickerPackDetailUiState> uiState;

    @Inject
    public StickerPackDetailViewModel(StickerRepository stickerRepository) {
        Intrinsics.checkNotNullParameter(stickerRepository, "stickerRepository");
        this.stickerRepository = stickerRepository;
        this.tag = "StickerPackDetailVM";
        this._uiState = StateFlowKt.MutableStateFlow(new StickerPackDetailUiState(false, null, null, 7, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
    }

    public final StateFlow<StickerPackDetailUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: StickerPackDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.sticker.StickerPackDetailViewModel$loadStickerPackDetail$1", m185f = "StickerPackDetailViewModel.kt", m186i = {}, m187l = {40}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.sticker.StickerPackDetailViewModel$loadStickerPackDetail$1 */
    static final class C42221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $stickerPackId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42221(String str, Continuation<? super C42221> continuation) {
            super(2, continuation);
            this.$stickerPackId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StickerPackDetailViewModel.this.new C42221(this.$stickerPackId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        StickerPackDetailViewModel.this._uiState.setValue(StickerPackDetailUiState.copy$default((StickerPackDetailUiState) StickerPackDetailViewModel.this._uiState.getValue(), true, null, null, 4, null));
                        this.label = 1;
                        Object objM8627getStickerPackDetailgIAlus = StickerPackDetailViewModel.this.stickerRepository.m8627getStickerPackDetailgIAlus(Long.parseLong(this.$stickerPackId), this);
                        if (objM8627getStickerPackDetailgIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8627getStickerPackDetailgIAlus;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                StickerPackDetailViewModel stickerPackDetailViewModel = StickerPackDetailViewModel.this;
                StickerPackDetailViewModel stickerPackDetailViewModel2 = StickerPackDetailViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl == null) {
                    StickerPackDetailData stickerPackDetailData = (StickerPackDetailData) result;
                    Log.d(stickerPackDetailViewModel.tag, "Successfully loaded sticker pack: " + stickerPackDetailData.getStickerPack().getName());
                    stickerPackDetailViewModel._uiState.setValue(((StickerPackDetailUiState) stickerPackDetailViewModel._uiState.getValue()).copy(false, null, stickerPackDetailData));
                } else {
                    Log.e(stickerPackDetailViewModel2.tag, "Failed to load sticker pack", thM11922exceptionOrNullimpl);
                    MutableStateFlow mutableStateFlow = stickerPackDetailViewModel2._uiState;
                    StickerPackDetailUiState stickerPackDetailUiState = (StickerPackDetailUiState) stickerPackDetailViewModel2._uiState.getValue();
                    String message = thM11922exceptionOrNullimpl.getMessage();
                    mutableStateFlow.setValue(StickerPackDetailUiState.copy$default(stickerPackDetailUiState, false, message == null ? "\u52a0\u8f7d\u5931\u8d25" : message, null, 4, null));
                }
            } catch (Exception e) {
                Log.e(StickerPackDetailViewModel.this.tag, "Exception loading sticker pack", e);
                MutableStateFlow mutableStateFlow2 = StickerPackDetailViewModel.this._uiState;
                StickerPackDetailUiState stickerPackDetailUiState2 = (StickerPackDetailUiState) StickerPackDetailViewModel.this._uiState.getValue();
                String message2 = e.getMessage();
                mutableStateFlow2.setValue(StickerPackDetailUiState.copy$default(stickerPackDetailUiState2, false, message2 == null ? "\u52a0\u8f7d\u5931\u8d25" : message2, null, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadStickerPackDetail(String stickerPackId) {
        Intrinsics.checkNotNullParameter(stickerPackId, "stickerPackId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C42221(stickerPackId, null), 3, null);
    }

    /* compiled from: StickerPackDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.sticker.StickerPackDetailViewModel$addStickerPackToFavorites$1", m185f = "StickerPackDetailViewModel.kt", m186i = {}, m187l = {74}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.sticker.StickerPackDetailViewModel$addStickerPackToFavorites$1 */
    static final class C42211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $stickerPackId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42211(String str, Continuation<? super C42211> continuation) {
            super(2, continuation);
            this.$stickerPackId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StickerPackDetailViewModel.this.new C42211(this.$stickerPackId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        Object objM8626addStickerPackgIAlus = StickerPackDetailViewModel.this.stickerRepository.m8626addStickerPackgIAlus(Long.parseLong(this.$stickerPackId), this);
                        if (objM8626addStickerPackgIAlus == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8626addStickerPackgIAlus;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                StickerPackDetailViewModel stickerPackDetailViewModel = StickerPackDetailViewModel.this;
                String str = this.$stickerPackId;
                StickerPackDetailViewModel stickerPackDetailViewModel2 = StickerPackDetailViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl == null) {
                    ((Boolean) result).booleanValue();
                    Boxing.boxInt(Log.d(stickerPackDetailViewModel.tag, "Successfully added sticker pack: " + str));
                } else {
                    Log.e(stickerPackDetailViewModel2.tag, "Failed to add sticker pack", thM11922exceptionOrNullimpl);
                    stickerPackDetailViewModel2._uiState.setValue(StickerPackDetailUiState.copy$default((StickerPackDetailUiState) stickerPackDetailViewModel2._uiState.getValue(), false, thM11922exceptionOrNullimpl.getMessage(), null, 5, null));
                }
            } catch (Exception e) {
                Log.e(StickerPackDetailViewModel.this.tag, "Exception adding sticker pack", e);
                StickerPackDetailViewModel.this._uiState.setValue(StickerPackDetailUiState.copy$default((StickerPackDetailUiState) StickerPackDetailViewModel.this._uiState.getValue(), false, e.getMessage(), null, 5, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void addStickerPackToFavorites(String stickerPackId) {
        Intrinsics.checkNotNullParameter(stickerPackId, "stickerPackId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C42211(stickerPackId, null), 3, null);
    }
}
