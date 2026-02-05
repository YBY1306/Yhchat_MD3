package com.yhchat.canarys.data.api;

import com.yhchat.canarys.data.model.BaseResponse;
import com.yhchat.canarys.data.model.BotInfoResponse;
import com.yhchat.canarys.data.model.GroupInfoResponse;
import com.yhchat.canarys.data.model.MyBotListResponse;
import com.yhchat.canarys.data.model.UserHomepageResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* compiled from: WebApiService.kt */
@Metadata(m168d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u0006H\u00a7@\u00a2\u0006\u0002\u0010\u0007J4\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0001\u0010\u0011\u001a\u00020\u00062\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0014\u00a8\u0006\u0015\u00c0\u0006\u0003"}, m169d2 = {"Lcom/yhchat/canarys/data/api/WebApiService;", "", "getUserHomepage", "Lretrofit2/Response;", "Lcom/yhchat/canarys/data/model/UserHomepageResponse;", "userId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGroupInfo", "Lcom/yhchat/canarys/data/model/GroupInfoResponse;", "request", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBotInfo", "Lcom/yhchat/canarys/data/model/BotInfoResponse;", "getMyBotList", "Lcom/yhchat/canarys/data/model/MyBotListResponse;", "token", "resetBotLink", "Lcom/yhchat/canarys/data/model/BaseResponse;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public interface WebApiService {
    @POST("v1/bot/bot-info")
    Object getBotInfo(@Body Map<String, String> map, Continuation<? super Response<BotInfoResponse>> continuation);

    @POST("v1/group/group-info")
    Object getGroupInfo(@Body Map<String, String> map, Continuation<? super Response<GroupInfoResponse>> continuation);

    @POST("v1/bot/bot-group-list")
    Object getMyBotList(@Header("token") String str, Continuation<? super Response<MyBotListResponse>> continuation);

    @GET("v1/user/homepage")
    Object getUserHomepage(@Query("userId") String str, Continuation<? super Response<UserHomepageResponse>> continuation);

    @POST("v1/bot/bot-link-reset")
    Object resetBotLink(@Header("token") String str, @Body Map<String, String> map, Continuation<? super Response<BaseResponse>> continuation);
}
