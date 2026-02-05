package com.yhchat.canarys.data.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: ApiClient.kt */
@Metadata(m168d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0018\u0010\u0015R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b#\u0010\f\u001a\u0004\b!\u0010\"\u00a8\u0006$"}, m169d2 = {"Lcom/yhchat/canarys/data/api/ApiClient;", "", "<init>", "()V", "BASE_URL", "", "WEB_BASE_URL", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "okHttpClient", "Lokhttp3/OkHttpClient;", "getOkHttpClient", "()Lokhttp3/OkHttpClient;", "okHttpClient$delegate", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit$delegate", "webRetrofit", "getWebRetrofit", "webRetrofit$delegate", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "getApiService", "()Lcom/yhchat/canarys/data/api/ApiService;", "apiService$delegate", "webApiService", "Lcom/yhchat/canarys/data/api/WebApiService;", "getWebApiService", "()Lcom/yhchat/canarys/data/api/WebApiService;", "webApiService$delegate", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class ApiClient {
    private static final String BASE_URL = "https://chat-go.jwzhd.com/";
    private static final String WEB_BASE_URL = "https://chat-web-go.jwzhd.com/";
    public static final ApiClient INSTANCE = new ApiClient();

    /* renamed from: gson$delegate, reason: from kotlin metadata */
    private static final Lazy gson = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.api.ApiClient$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ApiClient.gson_delegate$lambda$0();
        }
    });

    /* renamed from: okHttpClient$delegate, reason: from kotlin metadata */
    private static final Lazy okHttpClient = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.api.ApiClient$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ApiClient.okHttpClient_delegate$lambda$0();
        }
    });

    /* renamed from: retrofit$delegate, reason: from kotlin metadata */
    private static final Lazy retrofit = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.api.ApiClient$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ApiClient.retrofit_delegate$lambda$0();
        }
    });

    /* renamed from: webRetrofit$delegate, reason: from kotlin metadata */
    private static final Lazy webRetrofit = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.api.ApiClient$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ApiClient.webRetrofit_delegate$lambda$0();
        }
    });

    /* renamed from: apiService$delegate, reason: from kotlin metadata */
    private static final Lazy apiService = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.api.ApiClient$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ApiClient.apiService_delegate$lambda$0();
        }
    });

    /* renamed from: webApiService$delegate, reason: from kotlin metadata */
    private static final Lazy webApiService = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.api.ApiClient$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ApiClient.webApiService_delegate$lambda$0();
        }
    });
    public static final int $stable = 8;

    private ApiClient() {
    }

    private final Gson getGson() {
        Object value = gson.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Gson) value;
    }

    public static final Gson gson_delegate$lambda$0() {
        return new GsonBuilder().setLenient().create();
    }

    private final OkHttpClient getOkHttpClient() {
        return (OkHttpClient) okHttpClient.getValue();
    }

    public static final OkHttpClient okHttpClient_delegate$lambda$0() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder().connectTimeout(30L, TimeUnit.SECONDS).readTimeout(30L, TimeUnit.SECONDS).writeTimeout(30L, TimeUnit.SECONDS);
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(null, 1, null);
        httpLoggingInterceptor.level(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(httpLoggingInterceptor);
        return builder.build();
    }

    private final Retrofit getRetrofit() {
        Object value = retrofit.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Retrofit) value;
    }

    public static final Retrofit retrofit_delegate$lambda$0() {
        return new Retrofit.Builder().baseUrl(BASE_URL).client(INSTANCE.getOkHttpClient()).addConverterFactory(GsonConverterFactory.create(INSTANCE.getGson())).build();
    }

    private final Retrofit getWebRetrofit() {
        Object value = webRetrofit.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Retrofit) value;
    }

    public static final Retrofit webRetrofit_delegate$lambda$0() {
        return new Retrofit.Builder().baseUrl(WEB_BASE_URL).client(INSTANCE.getOkHttpClient()).addConverterFactory(GsonConverterFactory.create(INSTANCE.getGson())).build();
    }

    public final ApiService getApiService() {
        Object value = apiService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ApiService) value;
    }

    public static final ApiService apiService_delegate$lambda$0() {
        return (ApiService) INSTANCE.getRetrofit().create(ApiService.class);
    }

    public final WebApiService getWebApiService() {
        Object value = webApiService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (WebApiService) value;
    }

    public static final WebApiService webApiService_delegate$lambda$0() {
        return (WebApiService) INSTANCE.getWebRetrofit().create(WebApiService.class);
    }
}
