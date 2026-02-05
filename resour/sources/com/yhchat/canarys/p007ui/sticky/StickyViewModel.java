package com.yhchat.canarys.p007ui.sticky;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.model.StickyData;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.group.bot_list;
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
import org.simpleframework.xml.strategy.Name;

/* compiled from: StickyViewModel.kt */
@Metadata(m168d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u0006\u0010\u0017\u001a\u00020\u000bJ\u0016\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001cJ\u0006\u0010 \u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012\u00a8\u0006!"}, m169d2 = {"Lcom/yhchat/canarys/ui/sticky/StickyViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;)V", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "setTokenRepository", "", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/sticky/StickyUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_stickyData", "Lcom/yhchat/canarys/data/model/StickyData;", "stickyData", "getStickyData", "loadStickyList", "addSticky", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "deleteSticky", "topSticky", Name.MARK, "clearError", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class StickyViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<StickyData> _stickyData;
    private final MutableStateFlow<StickyUiState> _uiState;
    private final ApiService apiService;
    private final StateFlow<StickyData> stickyData;
    private TokenRepository tokenRepository;
    private final StateFlow<StickyUiState> uiState;
    private final UserRepository userRepository;

    @Inject
    public StickyViewModel(ApiService apiService) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.apiService = apiService;
        this.userRepository = new UserRepository(this.apiService, null);
        this._uiState = StateFlowKt.MutableStateFlow(new StickyUiState(false, null, 3, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._stickyData = StateFlowKt.MutableStateFlow(null);
        this.stickyData = FlowKt.asStateFlow(this._stickyData);
    }

    public final void setTokenRepository(TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
        if (tokenRepository != null) {
            this.userRepository.setTokenRepository(tokenRepository);
        }
    }

    public final StateFlow<StickyUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<StickyData> getStickyData() {
        return this.stickyData;
    }

    /* compiled from: StickyViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.sticky.StickyViewModel$loadStickyList$1", m185f = "StickyViewModel.kt", m186i = {}, m187l = {55}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.sticky.StickyViewModel$loadStickyList$1 */
    static final class C42311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C42311(Continuation<? super C42311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StickyViewModel.this.new C42311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    StickyViewModel.this._uiState.setValue(((StickyUiState) StickyViewModel.this._uiState.getValue()).copy(true, null));
                    this.label = 1;
                    Object objM8652getStickyListIoAF18A = StickyViewModel.this.userRepository.m8652getStickyListIoAF18A(this);
                    if (objM8652getStickyListIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8652getStickyListIoAF18A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StickyViewModel stickyViewModel = StickyViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                stickyViewModel._stickyData.setValue((StickyData) value);
                stickyViewModel._uiState.setValue(StickyUiState.copy$default((StickyUiState) stickyViewModel._uiState.getValue(), false, null, 2, null));
            }
            StickyViewModel stickyViewModel2 = StickyViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                stickyViewModel2._stickyData.setValue(null);
                stickyViewModel2._uiState.setValue(((StickyUiState) stickyViewModel2._uiState.getValue()).copy(false, "\u52a0\u8f7d\u7f6e\u9876\u4f1a\u8bdd\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage()));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadStickyList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C42311(null), 3, null);
    }

    /* compiled from: StickyViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.sticky.StickyViewModel$addSticky$1", m185f = "StickyViewModel.kt", m186i = {}, m187l = {77}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.sticky.StickyViewModel$addSticky$1 */
    static final class C42291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ int $chatType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42291(String str, int i, Continuation<? super C42291> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$chatType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StickyViewModel.this.new C42291(this.$chatId, this.$chatType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    StickyViewModel.this._uiState.setValue(((StickyUiState) StickyViewModel.this._uiState.getValue()).copy(true, null));
                    this.label = 1;
                    Object objM8637addSticky0E7RQCE = StickyViewModel.this.userRepository.m8637addSticky0E7RQCE(this.$chatId, this.$chatType, this);
                    if (objM8637addSticky0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8637addSticky0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StickyViewModel stickyViewModel = StickyViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                ((Boolean) value).booleanValue();
                stickyViewModel._uiState.setValue(StickyUiState.copy$default((StickyUiState) stickyViewModel._uiState.getValue(), false, null, 2, null));
                stickyViewModel.loadStickyList();
            }
            StickyViewModel stickyViewModel2 = StickyViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                stickyViewModel2._uiState.setValue(((StickyUiState) stickyViewModel2._uiState.getValue()).copy(false, "\u6dfb\u52a0\u7f6e\u9876\u4f1a\u8bdd\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage()));
            }
            return Unit.INSTANCE;
        }
    }

    public final void addSticky(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C42291(str, i, null), 3, null);
    }

    /* compiled from: StickyViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.sticky.StickyViewModel$deleteSticky$1", m185f = "StickyViewModel.kt", m186i = {}, m187l = {bot_list.Menu_data.SELECT_FIELD_NUMBER}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.sticky.StickyViewModel$deleteSticky$1 */
    static final class C42301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ int $chatType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42301(String str, int i, Continuation<? super C42301> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$chatType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StickyViewModel.this.new C42301(this.$chatId, this.$chatType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    StickyViewModel.this._uiState.setValue(((StickyUiState) StickyViewModel.this._uiState.getValue()).copy(true, null));
                    this.label = 1;
                    Object objM8641deleteSticky0E7RQCE = StickyViewModel.this.userRepository.m8641deleteSticky0E7RQCE(this.$chatId, this.$chatType, this);
                    if (objM8641deleteSticky0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8641deleteSticky0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StickyViewModel stickyViewModel = StickyViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                ((Boolean) value).booleanValue();
                stickyViewModel._uiState.setValue(StickyUiState.copy$default((StickyUiState) stickyViewModel._uiState.getValue(), false, null, 2, null));
                stickyViewModel.loadStickyList();
            }
            StickyViewModel stickyViewModel2 = StickyViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                stickyViewModel2._uiState.setValue(((StickyUiState) stickyViewModel2._uiState.getValue()).copy(false, "\u5220\u9664\u7f6e\u9876\u4f1a\u8bdd\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage()));
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteSticky(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C42301(str, i, null), 3, null);
    }

    /* compiled from: StickyViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.sticky.StickyViewModel$topSticky$1", m185f = "StickyViewModel.kt", m186i = {}, m187l = {121}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.sticky.StickyViewModel$topSticky$1 */
    static final class C42321 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42321(int i, Continuation<? super C42321> continuation) {
            super(2, continuation);
            this.$id = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StickyViewModel.this.new C42321(this.$id, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    StickyViewModel.this._uiState.setValue(((StickyUiState) StickyViewModel.this._uiState.getValue()).copy(true, null));
                    this.label = 1;
                    Object objM8663topStickygIAlus = StickyViewModel.this.userRepository.m8663topStickygIAlus(this.$id, this);
                    if (objM8663topStickygIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8663topStickygIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            StickyViewModel stickyViewModel = StickyViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                ((Boolean) value).booleanValue();
                stickyViewModel._uiState.setValue(StickyUiState.copy$default((StickyUiState) stickyViewModel._uiState.getValue(), false, null, 2, null));
                stickyViewModel.loadStickyList();
            }
            StickyViewModel stickyViewModel2 = StickyViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                stickyViewModel2._uiState.setValue(((StickyUiState) stickyViewModel2._uiState.getValue()).copy(false, "\u7f6e\u9876\u4f1a\u8bdd\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage()));
            }
            return Unit.INSTANCE;
        }
    }

    public final void topSticky(int i) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C42321(i, null), 3, null);
    }

    public final void clearError() {
        this._uiState.setValue(StickyUiState.copy$default(this._uiState.getValue(), false, null, 1, null));
    }
}
