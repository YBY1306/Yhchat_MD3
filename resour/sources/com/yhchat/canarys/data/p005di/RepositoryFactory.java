package com.yhchat.canarys.data.p005di;

import android.content.Context;
import androidx.room.Room;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.api.WebApiService;
import com.yhchat.canarys.data.local.AppDatabase;
import com.yhchat.canarys.data.local.SavedAccountDao;
import com.yhchat.canarys.data.repository.AccountRepository;
import com.yhchat.canarys.data.repository.BlocklistRepository;
import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.data.repository.CacheRepository;
import com.yhchat.canarys.data.repository.ChatBackgroundRepository;
import com.yhchat.canarys.data.repository.CoinRepository;
import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.ConversationRepository;
import com.yhchat.canarys.data.repository.DiscoverRepository;
import com.yhchat.canarys.data.repository.DiskRepository;
import com.yhchat.canarys.data.repository.DraftRepository;
import com.yhchat.canarys.data.repository.ExpressionRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.NavigationRepository;
import com.yhchat.canarys.data.repository.ReportRepository;
import com.yhchat.canarys.data.repository.ShareRepository;
import com.yhchat.canarys.data.repository.StickerRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UpdateRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.data.repository.VipRepository;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* compiled from: RepositoryFactory.kt */
@Metadata(m168d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010#\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010%\u001a\u00020&2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010)\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010+\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010-\u001a\u00020.2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010/\u001a\u0002002\u0006\u0010\u001f\u001a\u00020 J\u000e\u00101\u001a\u0002022\u0006\u0010\u001f\u001a\u00020 J\u000e\u00103\u001a\u0002042\u0006\u0010\u001f\u001a\u00020 J\u000e\u00105\u001a\u0002062\u0006\u0010\u001f\u001a\u00020 J\u000e\u00107\u001a\u0002082\u0006\u0010\u001f\u001a\u00020 J\u000e\u00109\u001a\u00020:2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010;\u001a\u00020<2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010=\u001a\u00020>2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010?\u001a\u00020@2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010A\u001a\u00020B2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010C\u001a\u00020D2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010E\u001a\u00020F2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010G\u001a\u00020H2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010I\u001a\u00020J2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u000e\u0010\nR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0019\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001e\u0010\f\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006K"}, m169d2 = {"Lcom/yhchat/canarys/data/di/RepositoryFactory;", "", "<init>", "()V", "BASE_URL", "", "WEB_BASE_URL", "retrofit", "Lretrofit2/Retrofit;", "getRetrofit", "()Lretrofit2/Retrofit;", "retrofit$delegate", "Lkotlin/Lazy;", "webRetrofit", "getWebRetrofit", "webRetrofit$delegate", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "getApiService", "()Lcom/yhchat/canarys/data/api/ApiService;", "apiService$delegate", "webApiService", "Lcom/yhchat/canarys/data/api/WebApiService;", "getWebApiService", "()Lcom/yhchat/canarys/data/api/WebApiService;", "webApiService$delegate", "communityRepository", "Lcom/yhchat/canarys/data/repository/CommunityRepository;", "getCommunityRepository", "()Lcom/yhchat/canarys/data/repository/CommunityRepository;", "communityRepository$delegate", "context", "Landroid/content/Context;", "getFriendRepository", "Lcom/yhchat/canarys/data/repository/FriendRepository;", "getTokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "getConversationRepository", "Lcom/yhchat/canarys/data/repository/ConversationRepository;", "getMessageRepository", "Lcom/yhchat/canarys/data/repository/MessageRepository;", "getNavigationRepository", "Lcom/yhchat/canarys/data/repository/NavigationRepository;", "getUserRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "getGroupRepository", "Lcom/yhchat/canarys/data/repository/GroupRepository;", "getDraftRepository", "Lcom/yhchat/canarys/data/repository/DraftRepository;", "getBotRepository", "Lcom/yhchat/canarys/data/repository/BotRepository;", "getDiscoverRepository", "Lcom/yhchat/canarys/data/repository/DiscoverRepository;", "getExpressionRepository", "Lcom/yhchat/canarys/data/repository/ExpressionRepository;", "getReportRepository", "Lcom/yhchat/canarys/data/repository/ReportRepository;", "getShareRepository", "Lcom/yhchat/canarys/data/repository/ShareRepository;", "getChatBackgroundRepository", "Lcom/yhchat/canarys/data/repository/ChatBackgroundRepository;", "getStickerRepository", "Lcom/yhchat/canarys/data/repository/StickerRepository;", "getDiskRepository", "Lcom/yhchat/canarys/data/repository/DiskRepository;", "getCoinRepository", "Lcom/yhchat/canarys/data/repository/CoinRepository;", "getVipRepository", "Lcom/yhchat/canarys/data/repository/VipRepository;", "getUpdateRepository", "Lcom/yhchat/canarys/data/repository/UpdateRepository;", "getBlocklistRepository", "Lcom/yhchat/canarys/data/repository/BlocklistRepository;", "getAccountRepository", "Lcom/yhchat/canarys/data/repository/AccountRepository;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class RepositoryFactory {
    private static final String BASE_URL = "https://chat-go.jwzhd.com/";
    private static final String WEB_BASE_URL = "https://chat-web-go.jwzhd.com/";
    public static final RepositoryFactory INSTANCE = new RepositoryFactory();

    /* renamed from: retrofit$delegate, reason: from kotlin metadata */
    private static final Lazy retrofit = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.di.RepositoryFactory$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryFactory.retrofit_delegate$lambda$0();
        }
    });

    /* renamed from: webRetrofit$delegate, reason: from kotlin metadata */
    private static final Lazy webRetrofit = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.di.RepositoryFactory$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryFactory.webRetrofit_delegate$lambda$0();
        }
    });

    /* renamed from: apiService$delegate, reason: from kotlin metadata */
    private static final Lazy apiService = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.di.RepositoryFactory$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryFactory.apiService_delegate$lambda$0();
        }
    });

    /* renamed from: webApiService$delegate, reason: from kotlin metadata */
    private static final Lazy webApiService = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.di.RepositoryFactory$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryFactory.webApiService_delegate$lambda$0();
        }
    });

    /* renamed from: communityRepository$delegate, reason: from kotlin metadata */
    private static final Lazy communityRepository = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.data.di.RepositoryFactory$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RepositoryFactory.communityRepository_delegate$lambda$0();
        }
    });
    public static final int $stable = 8;

    private RepositoryFactory() {
    }

    private final Retrofit getRetrofit() {
        Object value = retrofit.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Retrofit) value;
    }

    public static final Retrofit retrofit_delegate$lambda$0() {
        return new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
    }

    private final Retrofit getWebRetrofit() {
        Object value = webRetrofit.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (Retrofit) value;
    }

    public static final Retrofit webRetrofit_delegate$lambda$0() {
        return new Retrofit.Builder().baseUrl(WEB_BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
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

    public final CommunityRepository getCommunityRepository() {
        return (CommunityRepository) communityRepository.getValue();
    }

    public static final CommunityRepository communityRepository_delegate$lambda$0() {
        return new CommunityRepository(INSTANCE.getApiService());
    }

    public final CommunityRepository getCommunityRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getCommunityRepository();
    }

    public final FriendRepository getFriendRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new FriendRepository(getApiService(), getTokenRepository(context));
    }

    public final TokenRepository getTokenRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        AppDatabase database = (AppDatabase) Room.databaseBuilder(applicationContext, AppDatabase.class, "app_database").build();
        return new TokenRepository(database.userTokenDao(), context);
    }

    public final ConversationRepository getConversationRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        CacheRepository cacheRepository = new CacheRepository(applicationContext);
        return new ConversationRepository(getApiService(), cacheRepository);
    }

    public final MessageRepository getMessageRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        CacheRepository cacheRepository = new CacheRepository(applicationContext);
        return new MessageRepository(getApiService(), getTokenRepository(context), cacheRepository);
    }

    public final NavigationRepository getNavigationRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new NavigationRepository(context);
    }

    public final UserRepository getUserRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new UserRepository(getApiService(), getTokenRepository(context));
    }

    public final GroupRepository getGroupRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        GroupRepository repository = new GroupRepository(getApiService());
        repository.setTokenRepository(getTokenRepository(context));
        return repository;
    }

    public final DraftRepository getDraftRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DraftRepository(context);
    }

    public final BotRepository getBotRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new BotRepository(getApiService(), getWebApiService(), getTokenRepository(context));
    }

    public final DiscoverRepository getDiscoverRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DiscoverRepository(getApiService(), getTokenRepository(context));
    }

    public final ExpressionRepository getExpressionRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ExpressionRepository(getApiService(), getTokenRepository(context));
    }

    public final ReportRepository getReportRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ReportRepository(getApiService(), getTokenRepository(context));
    }

    public final ShareRepository getShareRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ShareRepository(getApiService(), getTokenRepository(context));
    }

    public final ChatBackgroundRepository getChatBackgroundRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new ChatBackgroundRepository(getApiService(), getTokenRepository(context));
    }

    public final StickerRepository getStickerRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new StickerRepository(getApiService(), getTokenRepository(context));
    }

    public final DiskRepository getDiskRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DiskRepository(getApiService(), getTokenRepository(context));
    }

    public final CoinRepository getCoinRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new CoinRepository(getApiService(), getTokenRepository(context));
    }

    public final VipRepository getVipRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new VipRepository(getApiService(), getTokenRepository(context));
    }

    public final UpdateRepository getUpdateRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new UpdateRepository(context);
    }

    public final BlocklistRepository getBlocklistRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new BlocklistRepository(context);
    }

    public final AccountRepository getAccountRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AppDatabase database = AppDatabase.INSTANCE.getDatabase(context);
        SavedAccountDao savedAccountDao = database.savedAccountDao();
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return new AccountRepository(savedAccountDao, applicationContext);
    }
}
