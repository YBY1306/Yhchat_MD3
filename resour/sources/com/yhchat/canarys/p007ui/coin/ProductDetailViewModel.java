package com.yhchat.canarys.p007ui.coin;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.Product;
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

/* compiled from: ProductDetailActivity.kt */
@Metadata(m168d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, m169d2 = {"Lcom/yhchat/canarys/ui/coin/ProductDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "coinRepository", "Lcom/yhchat/canarys/data/repository/CoinRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/coin/ProductDetailUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadProductDetail", "productId", "", "purchaseProduct", "price", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes6.dex */
public final class ProductDetailViewModel extends ViewModel {
    public static final int $stable = 8;
    private CoinRepository coinRepository;
    private final MutableStateFlow<ProductDetailUiState> _uiState = StateFlowKt.MutableStateFlow(new ProductDetailUiState(false, null, null, false, false, null, 63, null));
    private final StateFlow<ProductDetailUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<ProductDetailUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.coinRepository = RepositoryFactory.INSTANCE.getCoinRepository(context);
    }

    /* compiled from: ProductDetailActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.coin.ProductDetailViewModel$loadProductDetail$1", m185f = "ProductDetailActivity.kt", m186i = {}, m187l = {474}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.coin.ProductDetailViewModel$loadProductDetail$1 */
    static final class C33241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $productId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33241(int i, Continuation<? super C33241> continuation) {
            super(2, continuation);
            this.$productId = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductDetailViewModel.this.new C33241(this.$productId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ProductDetailViewModel.this._uiState.setValue(ProductDetailUiState.copy$default((ProductDetailUiState) ProductDetailViewModel.this._uiState.getValue(), true, null, null, false, false, null, 58, null));
                    CoinRepository coinRepository = ProductDetailViewModel.this.coinRepository;
                    if (coinRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("coinRepository");
                        coinRepository = null;
                    }
                    this.label = 1;
                    Object objM8496getProductDetailgIAlus = coinRepository.m8496getProductDetailgIAlus(this.$productId, this);
                    if (objM8496getProductDetailgIAlus != coroutine_suspended) {
                        value = objM8496getProductDetailgIAlus;
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
            ProductDetailViewModel productDetailViewModel = ProductDetailViewModel.this;
            ProductDetailViewModel productDetailViewModel2 = ProductDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                productDetailViewModel._uiState.setValue(ProductDetailUiState.copy$default((ProductDetailUiState) productDetailViewModel._uiState.getValue(), false, (Product) value, null, false, false, null, 60, null));
            } else {
                productDetailViewModel2._uiState.setValue(ProductDetailUiState.copy$default((ProductDetailUiState) productDetailViewModel2._uiState.getValue(), false, null, thM11922exceptionOrNullimpl.getMessage(), false, false, null, 58, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadProductDetail(int productId) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33241(productId, null), 3, null);
    }

    /* compiled from: ProductDetailActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.coin.ProductDetailViewModel$purchaseProduct$1", m185f = "ProductDetailActivity.kt", m186i = {}, m187l = {495}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.coin.ProductDetailViewModel$purchaseProduct$1 */
    static final class C33251 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $price;
        final /* synthetic */ int $productId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C33251(int i, int i2, Continuation<? super C33251> continuation) {
            super(2, continuation);
            this.$productId = i;
            this.$price = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProductDetailViewModel.this.new C33251(this.$productId, this.$price, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C33251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ProductDetailViewModel.this._uiState.setValue(ProductDetailUiState.copy$default((ProductDetailUiState) ProductDetailViewModel.this._uiState.getValue(), false, null, null, true, false, null, 23, null));
                    CoinRepository coinRepository = ProductDetailViewModel.this.coinRepository;
                    if (coinRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("coinRepository");
                        coinRepository = null;
                    }
                    this.label = 1;
                    Object objM8499purchaseProduct0E7RQCE = coinRepository.m8499purchaseProduct0E7RQCE(this.$productId, this.$price, this);
                    if (objM8499purchaseProduct0E7RQCE != coroutine_suspended) {
                        value = objM8499purchaseProduct0E7RQCE;
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
            ProductDetailViewModel productDetailViewModel = ProductDetailViewModel.this;
            ProductDetailViewModel productDetailViewModel2 = ProductDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Number) value).intValue();
                productDetailViewModel._uiState.setValue(ProductDetailUiState.copy$default((ProductDetailUiState) productDetailViewModel._uiState.getValue(), false, null, null, false, true, null, 39, null));
            } else {
                productDetailViewModel2._uiState.setValue(ProductDetailUiState.copy$default((ProductDetailUiState) productDetailViewModel2._uiState.getValue(), false, null, null, false, false, thM11922exceptionOrNullimpl.getMessage(), 23, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void purchaseProduct(int productId, int price) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C33251(productId, price, null), 3, null);
    }
}
