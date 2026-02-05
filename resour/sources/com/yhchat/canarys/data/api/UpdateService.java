package com.yhchat.canarys.data.api;

import com.yhchat.canarys.data.model.GitHubRelease;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;

/* compiled from: UpdateService.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J8\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b\u00c0\u0006\u0003"}, m169d2 = {"Lcom/yhchat/canarys/data/api/UpdateService;", "", "getReleases", "Lretrofit2/Response;", "", "Lcom/yhchat/canarys/data/model/GitHubRelease;", "host", "", "userAgent", "contentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public interface UpdateService {
    @GET("repos/Kauid323/Yhchat_MD3/releases")
    Object getReleases(@Header("Host") String str, @Header("User-Agent") String str2, @Header("Content-Type") String str3, Continuation<? super Response<List<GitHubRelease>>> continuation);

    /* compiled from: UpdateService.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getReleases$default(UpdateService updateService, String str, String str2, String str3, Continuation continuation, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReleases");
        }
        if ((i & 1) != 0) {
            str = "api.github.com";
        }
        if ((i & 2) != 0) {
            str2 = "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.101 Mobile Safari/537.36";
        }
        if ((i & 4) != 0) {
            str3 = "application/json; charset=utf-8";
        }
        return updateService.getReleases(str, str2, str3, continuation);
    }
}
