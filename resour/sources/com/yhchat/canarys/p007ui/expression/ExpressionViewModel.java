package com.yhchat.canarys.p007ui.expression;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.ExpressionRepository;
import java.util.List;
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

/* compiled from: ExpressionViewModel.kt */
@Metadata(m168d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/ui/expression/ExpressionViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "expressionRepository", "Lcom/yhchat/canarys/data/repository/ExpressionRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/expression/ExpressionUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadExpressions", "addExpression", "imageUrl", "", "deleteExpression", "expressionId", "", "topExpression", "clearError", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class ExpressionViewModel extends ViewModel {
    public static final int $stable = 8;
    private ExpressionRepository expressionRepository;
    private final MutableStateFlow<ExpressionUiState> _uiState = StateFlowKt.MutableStateFlow(new ExpressionUiState(null, false, null, 7, null));
    private final StateFlow<ExpressionUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<ExpressionUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.expressionRepository = RepositoryFactory.INSTANCE.getExpressionRepository(context);
        loadExpressions();
    }

    /* compiled from: ExpressionViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.expression.ExpressionViewModel$loadExpressions$1", m185f = "ExpressionViewModel.kt", m186i = {}, m187l = {39}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.expression.ExpressionViewModel$loadExpressions$1 */
    static final class C38731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C38731(Continuation<? super C38731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExpressionViewModel.this.new C38731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ExpressionViewModel.this._uiState.setValue(ExpressionUiState.copy$default((ExpressionUiState) ExpressionViewModel.this._uiState.getValue(), null, true, null, 5, null));
                    ExpressionRepository expressionRepository = ExpressionViewModel.this.expressionRepository;
                    if (expressionRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("expressionRepository");
                        expressionRepository = null;
                    }
                    this.label = 1;
                    Object objM8557getExpressionListIoAF18A = expressionRepository.m8557getExpressionListIoAF18A(this);
                    if (objM8557getExpressionListIoAF18A != coroutine_suspended) {
                        value = objM8557getExpressionListIoAF18A;
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
            ExpressionViewModel expressionViewModel = ExpressionViewModel.this;
            ExpressionViewModel expressionViewModel2 = ExpressionViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                expressionViewModel._uiState.setValue(((ExpressionUiState) expressionViewModel._uiState.getValue()).copy((List) value, false, null));
            } else {
                expressionViewModel2._uiState.setValue(ExpressionUiState.copy$default((ExpressionUiState) expressionViewModel2._uiState.getValue(), null, false, thM11922exceptionOrNullimpl.getMessage(), 1, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadExpressions() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38731(null), 3, null);
    }

    /* compiled from: ExpressionViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.expression.ExpressionViewModel$addExpression$1", m185f = "ExpressionViewModel.kt", m186i = {}, m187l = {62}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.expression.ExpressionViewModel$addExpression$1 */
    static final class C38711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $imageUrl;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38711(String str, Continuation<? super C38711> continuation) {
            super(2, continuation);
            this.$imageUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExpressionViewModel.this.new C38711(this.$imageUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ExpressionRepository expressionRepository = ExpressionViewModel.this.expressionRepository;
                    if (expressionRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("expressionRepository");
                        expressionRepository = null;
                    }
                    this.label = 1;
                    Object objM8555addExpressiongIAlus = expressionRepository.m8555addExpressiongIAlus(this.$imageUrl, this);
                    if (objM8555addExpressiongIAlus != coroutine_suspended) {
                        value = objM8555addExpressiongIAlus;
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
            ExpressionViewModel expressionViewModel = ExpressionViewModel.this;
            ExpressionViewModel expressionViewModel2 = ExpressionViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                expressionViewModel.loadExpressions();
            } else {
                expressionViewModel2._uiState.setValue(ExpressionUiState.copy$default((ExpressionUiState) expressionViewModel2._uiState.getValue(), null, false, thM11922exceptionOrNullimpl.getMessage(), 3, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void addExpression(String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38711(imageUrl, null), 3, null);
    }

    /* compiled from: ExpressionViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.expression.ExpressionViewModel$deleteExpression$1", m185f = "ExpressionViewModel.kt", m186i = {}, m187l = {78}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.expression.ExpressionViewModel$deleteExpression$1 */
    static final class C38721 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $expressionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38721(long j, Continuation<? super C38721> continuation) {
            super(2, continuation);
            this.$expressionId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExpressionViewModel.this.new C38721(this.$expressionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38721) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ExpressionRepository expressionRepository = ExpressionViewModel.this.expressionRepository;
                    if (expressionRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("expressionRepository");
                        expressionRepository = null;
                    }
                    this.label = 1;
                    Object objM8556deleteExpressiongIAlus = expressionRepository.m8556deleteExpressiongIAlus(this.$expressionId, this);
                    if (objM8556deleteExpressiongIAlus != coroutine_suspended) {
                        value = objM8556deleteExpressiongIAlus;
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
            ExpressionViewModel expressionViewModel = ExpressionViewModel.this;
            ExpressionViewModel expressionViewModel2 = ExpressionViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                expressionViewModel.loadExpressions();
            } else {
                expressionViewModel2._uiState.setValue(ExpressionUiState.copy$default((ExpressionUiState) expressionViewModel2._uiState.getValue(), null, false, thM11922exceptionOrNullimpl.getMessage(), 3, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteExpression(long expressionId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38721(expressionId, null), 3, null);
    }

    /* compiled from: ExpressionViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.expression.ExpressionViewModel$topExpression$1", m185f = "ExpressionViewModel.kt", m186i = {}, m187l = {94}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.expression.ExpressionViewModel$topExpression$1 */
    static final class C38741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $expressionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38741(long j, Continuation<? super C38741> continuation) {
            super(2, continuation);
            this.$expressionId = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExpressionViewModel.this.new C38741(this.$expressionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ExpressionRepository expressionRepository = ExpressionViewModel.this.expressionRepository;
                    if (expressionRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("expressionRepository");
                        expressionRepository = null;
                    }
                    this.label = 1;
                    Object objM8558topExpressiongIAlus = expressionRepository.m8558topExpressiongIAlus(this.$expressionId, this);
                    if (objM8558topExpressiongIAlus != coroutine_suspended) {
                        value = objM8558topExpressiongIAlus;
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
            ExpressionViewModel expressionViewModel = ExpressionViewModel.this;
            ExpressionViewModel expressionViewModel2 = ExpressionViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                expressionViewModel.loadExpressions();
            } else {
                expressionViewModel2._uiState.setValue(ExpressionUiState.copy$default((ExpressionUiState) expressionViewModel2._uiState.getValue(), null, false, thM11922exceptionOrNullimpl.getMessage(), 3, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void topExpression(long expressionId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38741(expressionId, null), 3, null);
    }

    public final void clearError() {
        this._uiState.setValue(ExpressionUiState.copy$default(this._uiState.getValue(), null, false, null, 3, null));
    }
}
