package com.yhchat.canary.ui.coin

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.yhchat.canary.data.di.RepositoryFactory
import com.yhchat.canary.data.model.Product
import com.yhchat.canary.data.repository.CoinRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class ProductDetailViewModel : ViewModel() {
    private lateinit var coinRepository: CoinRepository

    private val _uiState = MutableStateFlow(ProductDetailUiState())
    val uiState: StateFlow<ProductDetailUiState> = _uiState.asStateFlow()

    fun init(context: Context) {
        coinRepository = RepositoryFactory.getCoinRepository(context)
    }

    fun loadProductDetail(productId: Int) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)

            coinRepository.getProductDetail(productId.toLong()).fold(
                onSuccess = { product ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        product = product
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        error = error.message
                    )
                }
            )
        }
    }

    fun purchaseProduct(productId: Int, price: Int) {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isPurchasing = true, purchaseError = null)

            coinRepository.purchaseProduct(productId, price).fold(
                onSuccess = {
                    _uiState.value = _uiState.value.copy(
                        isPurchasing = false,
                        purchaseSuccess = true
                    )
                },
                onFailure = { error ->
                    _uiState.value = _uiState.value.copy(
                        isPurchasing = false,
                        purchaseError = error.message
                    )
                }
            )
        }
    }
}

data class ProductDetailUiState(
    val isLoading: Boolean = false,
    val product: Product? = null,
    val error: String? = null,
    val isPurchasing: Boolean = false,
    val purchaseSuccess: Boolean = false,
    val purchaseError: String? = null
)
