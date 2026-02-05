package com.yhchat.canarys.data.repository;

import android.content.Context;
import android.content.SharedPreferences;
import com.yhchat.canarys.data.api.UpdateService;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: UpdateRepository.kt */
@Singleton
@Metadata(m168d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fJ \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0086@\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006 "}, m169d2 = {"Lcom/yhchat/canarys/data/repository/UpdateRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "prefs", "Landroid/content/SharedPreferences;", "updateService", "Lcom/yhchat/canarys/data/api/UpdateService;", "getUpdateService", "()Lcom/yhchat/canarys/data/api/UpdateService;", "updateService$delegate", "Lkotlin/Lazy;", "normalizeTag", "", "tag", "getCurrentVersion", "defaultVersion", "setCurrentVersion", "", "version", "checkForUpdate", "Lkotlin/Result;", "Lcom/yhchat/canarys/data/model/UpdateInfo;", "isLatestBuildPreview", "", "checkForUpdate-gIAlu-s", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatPublishTime", "publishedAt", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class UpdateRepository {
    private static final String GITHUB_API_BASE_URL = "https://api.github.com/";
    private static final String KEY_CURRENT_VERSION = "current_version";
    private static final String PREFS_NAME = "update_prefs";
    private final Context context;
    private final SharedPreferences prefs;

    /* renamed from: updateService$delegate, reason: from kotlin metadata */
    private final Lazy updateService;
    public static final int $stable = 8;

    @Inject
    public UpdateRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        SharedPreferences sharedPreferences = this.context.getSharedPreferences(PREFS_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.prefs = sharedPreferences;
        this.updateService = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.repository.UpdateRepository$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpdateRepository.updateService_delegate$lambda$0();
            }
        });
    }

    private final UpdateService getUpdateService() {
        Object value = this.updateService.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UpdateService) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateService updateService_delegate$lambda$0() {
        return (UpdateService) new Retrofit.Builder().baseUrl(GITHUB_API_BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(UpdateService.class);
    }

    private final String normalizeTag(String tag) {
        StringBuilder sbAppend;
        String t = StringsKt.removePrefix(StringsKt.trim((CharSequence) tag).toString(), (CharSequence) "refs/tags/");
        if (StringsKt.startsWith(t, "v", true)) {
            if (!(t.length() > 0)) {
                return t;
            }
            char lowerCase = Character.toLowerCase(t.charAt(0));
            String strSubstring = t.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            sbAppend = new StringBuilder().append(lowerCase).append(strSubstring);
        } else {
            sbAppend = new StringBuilder().append("v").append(t);
        }
        return sbAppend.toString();
    }

    public final String getCurrentVersion(String defaultVersion) {
        Intrinsics.checkNotNullParameter(defaultVersion, "defaultVersion");
        String string = this.prefs.getString(KEY_CURRENT_VERSION, defaultVersion);
        return string == null ? defaultVersion : string;
    }

    public final void setCurrentVersion(String version) {
        Intrinsics.checkNotNullParameter(version, "version");
        this.prefs.edit().putString(KEY_CURRENT_VERSION, version).apply();
    }

    /* renamed from: checkForUpdate-gIAlu-s$default, reason: not valid java name */
    public static /* synthetic */ Object m8632checkForUpdategIAlus$default(UpdateRepository updateRepository, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return updateRepository.m8633checkForUpdategIAlus(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062 A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:13:0x0036, B:24:0x005a, B:26:0x0062, B:28:0x006d, B:34:0x0079, B:36:0x008d, B:43:0x00b3, B:44:0x00bf, B:46:0x00c6, B:48:0x00e0, B:56:0x00fc, B:58:0x0101, B:60:0x0115, B:64:0x0124, B:39:0x00aa, B:65:0x013c), top: B:74:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013c A[Catch: Exception -> 0x003b, TRY_LEAVE, TryCatch #0 {Exception -> 0x003b, blocks: (B:13:0x0036, B:24:0x005a, B:26:0x0062, B:28:0x006d, B:34:0x0079, B:36:0x008d, B:43:0x00b3, B:44:0x00bf, B:46:0x00c6, B:48:0x00e0, B:56:0x00fc, B:58:0x0101, B:60:0x0115, B:64:0x0124, B:39:0x00aa, B:65:0x013c), top: B:74:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: checkForUpdate-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8633checkForUpdategIAlus(boolean r22, kotlin.coroutines.Continuation<? super kotlin.Result<com.yhchat.canarys.data.model.UpdateInfo>> r23) {
        /*
            Method dump skipped, instructions count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.UpdateRepository.m8633checkForUpdategIAlus(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String formatPublishTime(String publishedAt) {
        try {
            SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
            inputFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
            Date date = inputFormat.parse(publishedAt);
            if (date != null) {
                String str = outputFormat.format(date);
                if (str != null) {
                    return str;
                }
            }
            return publishedAt;
        } catch (Exception e) {
            return publishedAt;
        }
    }
}
