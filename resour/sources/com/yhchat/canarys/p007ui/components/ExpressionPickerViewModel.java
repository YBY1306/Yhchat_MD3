package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.ExpressionRepository;
import com.yhchat.canarys.data.repository.StickerRepository;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ExpressionPicker.kt */
@Metadata(m168d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/ExpressionPickerViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "expressionRepository", "Lcom/yhchat/canarys/data/repository/ExpressionRepository;", "stickerRepository", "Lcom/yhchat/canarys/data/repository/StickerRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/components/ExpressionPickerUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadExpressions", "loadStickerPacks", "loadDefaultExpressions", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ExpressionPickerViewModel extends ViewModel {
    public static final int $stable = 8;
    private ExpressionRepository expressionRepository;
    private StickerRepository stickerRepository;
    private final MutableStateFlow<ExpressionPickerUiState> _uiState = StateFlowKt.MutableStateFlow(new ExpressionPickerUiState(false, null, null, null, null, 31, null));
    private final StateFlow<ExpressionPickerUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<ExpressionPickerUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.expressionRepository = RepositoryFactory.INSTANCE.getExpressionRepository(context);
        this.stickerRepository = RepositoryFactory.INSTANCE.getStickerRepository(context);
    }

    /* compiled from: ExpressionPicker.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ExpressionPickerViewModel$loadExpressions$1", m185f = "ExpressionPicker.kt", m186i = {}, m187l = {350}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.ExpressionPickerViewModel$loadExpressions$1 */
    static final class C36251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C36251(Continuation<? super C36251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExpressionPickerViewModel.this.new C36251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ExpressionPickerViewModel.this._uiState.setValue(ExpressionPickerUiState.copy$default((ExpressionPickerUiState) ExpressionPickerViewModel.this._uiState.getValue(), true, null, null, null, null, 14, null));
                    ExpressionRepository expressionRepository = ExpressionPickerViewModel.this.expressionRepository;
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
            ExpressionPickerViewModel expressionPickerViewModel = ExpressionPickerViewModel.this;
            ExpressionPickerViewModel expressionPickerViewModel2 = ExpressionPickerViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                expressionPickerViewModel._uiState.setValue(ExpressionPickerUiState.copy$default((ExpressionPickerUiState) expressionPickerViewModel._uiState.getValue(), false, (List) value, null, null, null, 28, null));
            } else {
                expressionPickerViewModel2._uiState.setValue(ExpressionPickerUiState.copy$default((ExpressionPickerUiState) expressionPickerViewModel2._uiState.getValue(), false, null, null, null, thM11922exceptionOrNullimpl.getMessage(), 14, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadExpressions() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36251(null), 3, null);
    }

    /* compiled from: ExpressionPicker.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ExpressionPickerViewModel$loadStickerPacks$1", m185f = "ExpressionPicker.kt", m186i = {}, m187l = {369}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.ExpressionPickerViewModel$loadStickerPacks$1 */
    static final class C36261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C36261(Continuation<? super C36261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ExpressionPickerViewModel.this.new C36261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    StickerRepository stickerRepository = ExpressionPickerViewModel.this.stickerRepository;
                    if (stickerRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("stickerRepository");
                        stickerRepository = null;
                    }
                    this.label = 1;
                    Object objM8628getStickerPackListIoAF18A = stickerRepository.m8628getStickerPackListIoAF18A(this);
                    if (objM8628getStickerPackListIoAF18A != coroutine_suspended) {
                        value = objM8628getStickerPackListIoAF18A;
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
            ExpressionPickerViewModel expressionPickerViewModel = ExpressionPickerViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                expressionPickerViewModel._uiState.setValue(ExpressionPickerUiState.copy$default((ExpressionPickerUiState) expressionPickerViewModel._uiState.getValue(), false, null, (List) value, null, null, 27, null));
            } else {
                Log.e("ExpressionPicker", "\u52a0\u8f7d\u8868\u60c5\u5305\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage());
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadStickerPacks() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36261(null), 3, null);
    }

    /* compiled from: ExpressionPicker.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ExpressionPickerViewModel$loadDefaultExpressions$1", m185f = "ExpressionPicker.kt", m186i = {0, 0}, m187l = {389}, m188m = "invokeSuspend", m189n = {"assets", "sortedAssets"}, m191s = {"L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.ExpressionPickerViewModel$loadDefaultExpressions$1 */
    static final class C36241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ ExpressionPickerViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36241(Context context, ExpressionPickerViewModel expressionPickerViewModel, Continuation<? super C36241> continuation) {
            super(2, continuation);
            this.$context = context;
            this.this$0 = expressionPickerViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C36241(this.$context, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        String[] assets = this.$context.getAssets().list("fengtwemoji");
                        if (assets == null) {
                            break;
                        } else {
                            Collection arrayList = new ArrayList();
                            int length = assets.length;
                            int i = 0;
                            while (i < length) {
                                String str = assets[i];
                                Intrinsics.checkNotNull(str);
                                String[] assets2 = assets;
                                if (StringsKt.endsWith$default(str, ".svg", false, 2, (Object) null)) {
                                    arrayList.add(str);
                                }
                                i++;
                                assets = assets2;
                            }
                            String[] assets3 = assets;
                            List sortedAssets = CollectionsKt.sorted((List) arrayList);
                            this.L$0 = SpillingKt.nullOutSpilledVariable(assets3);
                            this.L$1 = SpillingKt.nullOutSpilledVariable(sortedAssets);
                            this.label = 1;
                            if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(this.this$0, sortedAssets, null), this) != coroutine_suspended) {
                                break;
                            } else {
                                return coroutine_suspended;
                            }
                        }
                    case 1:
                        ResultKt.throwOnFailure($result);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                Log.e("ExpressionPicker", "\u52a0\u8f7d\u9ed8\u8ba4\u8868\u60c5\u5931\u8d25", e);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: ExpressionPicker.kt */
        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ExpressionPickerViewModel$loadDefaultExpressions$1$1", m185f = "ExpressionPicker.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
        /* renamed from: com.yhchat.canarys.ui.components.ExpressionPickerViewModel$loadDefaultExpressions$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<String> $sortedAssets;
            int label;
            final /* synthetic */ ExpressionPickerViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ExpressionPickerViewModel expressionPickerViewModel, List<String> list, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = expressionPickerViewModel;
                this.$sortedAssets = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$sortedAssets, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.this$0._uiState.setValue(ExpressionPickerUiState.copy$default((ExpressionPickerUiState) this.this$0._uiState.getValue(), false, null, null, this.$sortedAssets, null, 23, null));
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    public final void loadDefaultExpressions(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C36241(context, this, null), 2, null);
    }
}
