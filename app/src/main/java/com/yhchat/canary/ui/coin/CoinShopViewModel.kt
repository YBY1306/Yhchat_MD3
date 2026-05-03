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

class CoinShopViewModel : ViewModel() {
    private lateinit var coinRepository: CoinRepository

    private val _uiState = MutableStateFlow(CoinShopUiState())
    val uiState: StateFlow<CoinShopUiState> = _uiState.asStateFlow()

    fun init(context: Context) {
        coinRepository = RepositoryFactory.getCoinRepository(context)
    }

    fun loadProducts() {
        viewModelScope.launch {
            _uiState.value = _uiState.value.copy(isLoading = true, error = null)

            coinRepository.getProductList().fold(
                onSuccess = { productData ->
                    _uiState.value = _uiState.value.copy(
                        isLoading = false,
                        products = productData.list
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
}

data class CoinShopUiState(
    val isLoading: Boolean = false,
    val products: List<Product> = emptyList(),
    val error: String? = null
)
