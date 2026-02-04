package com.yhchat.canary.data.repository

import android.util.Log
import com.yhchat.canary.data.api.ApiService
import com.yhchat.canary.data.model.Expression
import com.yhchat.canary.data.model.ExpressionActionRequest
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

/**
 * 表情包仓库
 */
@Singleton
class ExpressionRepository @Inject constructor(
    private val apiService: ApiService,
    private val tokenRepository: TokenRepository
) {
    companion object {
        private const val TAG = "ExpressionRepository"
    }

    private suspend inline fun <T> withToken(crossinline action: suspend (String) -> Result<T>): Result<T> =
        withContext(Dispatchers.IO) {
            tokenRepository.getTokenSync()?.let { action(it) } 
                ?: Result.failure(Exception("未登录"))
        }

    suspend fun getExpressionList(): Result<List<Expression>> = withToken { token ->
        runCatching {
            val response = apiService.getExpressionList(token)
            if (response.isSuccessful && response.body()?.code == 1) {
                response.body()!!.data.expression
            } else throw Exception("获取表情列表失败: ${response.code()}")
        }.onFailure { Log.e(TAG, "❌ 获取表情列表异常", it) }
    }

    suspend fun addExpression(imageUrl: String): Result<Boolean> = withToken { token ->
        runCatching {
            val response = apiService.addExpression(token, ExpressionActionRequest(url = imageUrl))
            if (response.isSuccessful && response.body()?.code in listOf(1, 200)) true
            else throw Exception("添加表情失败: ${response.code()}")
        }.onFailure { Log.e(TAG, "❌ 添加表情异常", it) }
    }

    suspend fun deleteExpression(expressionId: Long): Result<Boolean> = withToken { token ->
        runCatching {
            val response = apiService.deleteExpression(token, ExpressionActionRequest(id = expressionId))
            if (response.isSuccessful && response.body()?.code in listOf(1, 200)) true
            else throw Exception("删除表情失败: ${response.code()}")
        }.onFailure { Log.e(TAG, "❌ 删除表情异常", it) }
    }

    suspend fun topExpression(expressionId: Long): Result<Boolean> = withToken { token ->
        runCatching {
            val response = apiService.topExpression(token, ExpressionActionRequest(id = expressionId))
            if (response.isSuccessful && response.body()?.code in listOf(1, 200)) true
            else throw Exception("置顶表情失败: ${response.code()}")
        }.onFailure { Log.e(TAG, "❌ 置顶表情异常", it) }
    }

    suspend fun addExistingExpression(expressionId: Long): Result<Boolean> = withToken { token ->
        runCatching {
            val response = apiService.addExistingExpression(token, ExpressionActionRequest(id = expressionId))
            if (response.isSuccessful && response.body()?.code in listOf(1, 200)) true
            else throw Exception("添加已有表情失败: ${response.code()}")
        }.onFailure { Log.e(TAG, "❌ 添加已有表情异常", it) }
    }
}

