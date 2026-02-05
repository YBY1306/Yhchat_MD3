package com.yhchat.canarys;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import coil.Coil;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import coil.request.CachePolicy;
import com.yhchat.canarys.data.model.NavigationConfig;
import com.yhchat.canarys.data.model.NavigationItem;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.p007ui.chat.ChatActivity;
import com.yhchat.canarys.p007ui.chat.ChatAddActivity;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import com.yhchat.canarys.p007ui.user.UserDetailActivity;
import com.yhchat.canarys.utils.ChatAddLinkHandler;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: MainActivity.kt */
@Metadata(m168d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\r\u0010\b\u001a\u00020\u0005H\u0003\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0002\u00a8\u0006\f\u00b2\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002\u00b2\u0006\n\u0010\u000f\u001a\u00020\u000eX\u008a\u0084\u0002\u00b2\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002\u00b2\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002\u00b2\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u008a\u0084\u0002\u00b2\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0017\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0018\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0019\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001a\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001d\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u001e\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002"}, m169d2 = {"Lcom/yhchat/canarys/MainActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "MainContent", "(Landroidx/compose/runtime/Composer;I)V", "handleDeepLink", "setupImageLoader", "app_debug", "isInitialized", "", "isLoggedIn", "savedToken", "", "savedUserId", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "token", "userId", "currentScreen", "currentChatId", "currentChatType", "", "currentChatName", "pendingLoginToken", "navigationConfig", "Lcom/yhchat/canarys/data/model/NavigationConfig;"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes3.dex */
public final class MainActivity extends Hilt_MainActivity {
    public static final int $stable = 8;

    public static final Unit MainContent$lambda$41(MainActivity mainActivity, int i, Composer composer, int i2) {
        mainActivity.MainContent(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.yhchat.canarys.Hilt_MainActivity, com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        handleDeepLink();
        setupImageLoader();
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1994211681, true, new Function2() { // from class: com.yhchat.canarys.MainActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MainActivity.onCreate$lambda$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C56@2191L232,56@2173L250:MainActivity.kt#bjxtzz");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1994211681, $changed, -1, "com.yhchat.canarys.MainActivity.onCreate.<anonymous> (MainActivity.kt:56)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1203743970, true, new Function2() { // from class: com.yhchat.canarys.MainActivity$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(final MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C59@2315L11,60@2356L53,57@2209L200:MainActivity.kt#bjxtzz");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1203743970, $changed, -1, "com.yhchat.canarys.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:57)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1381407715, true, new Function2() { // from class: com.yhchat.canarys.MainActivity$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MainActivity.onCreate$lambda$0$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0(MainActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C61@2378L13:MainActivity.kt#bjxtzz");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1381407715, $changed, -1, "com.yhchat.canarys.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:61)");
            }
            this$0.MainContent($composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:397:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x08cf  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x08e1  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x0bf7  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0cbe  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0f03  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0f43  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MainContent(androidx.compose.runtime.Composer r150, final int r151) {
        /*
            Method dump skipped, instructions count: 3972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.MainActivity.MainContent(androidx.compose.runtime.Composer, int):void");
    }

    private static final boolean MainContent$lambda$0(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    private static final boolean MainContent$lambda$1(State<Boolean> state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final String MainContent$lambda$2(State<String> state) {
        return (String) state.getValue();
    }

    public static final String MainContent$lambda$3(State<String> state) {
        return (String) state.getValue();
    }

    private static final TokenRepository MainContent$lambda$4(State<TokenRepository> state) {
        return (TokenRepository) state.getValue();
    }

    public static final UserRepository MainContent$lambda$5(State<UserRepository> state) {
        return (UserRepository) state.getValue();
    }

    private static final String MainContent$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String MainContent$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final String MainContent$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String MainContent$lambda$16(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int MainContent$lambda$19(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final String MainContent$lambda$22(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final String MainContent$lambda$25(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final NavigationConfig MainContent$lambda$28(State<NavigationConfig> state) {
        return (NavigationConfig) state.getValue();
    }

    public static final Unit MainContent$lambda$34$0(MainViewModel $mainViewModel, MutableState $token$delegate, MutableState $pendingLoginToken$delegate, MutableState $userId$delegate, String loginToken, String loginUserId) {
        Intrinsics.checkNotNullParameter(loginToken, "loginToken");
        Intrinsics.checkNotNullParameter(loginUserId, "loginUserId");
        $token$delegate.setValue(loginToken);
        $pendingLoginToken$delegate.setValue(loginToken);
        $userId$delegate.setValue(loginUserId);
        $mainViewModel.onLoginSuccess(loginToken, loginUserId);
        return Unit.INSTANCE;
    }

    public static final Unit MainContent$lambda$35$0(MutableState $currentScreen$delegate) {
        $currentScreen$delegate.setValue("conversation");
        return Unit.INSTANCE;
    }

    public static final Unit MainContent$lambda$36$0(MainActivity this$0, MutableState $currentChatId$delegate, String userId, String userName, int chatType, int currentUserPermission) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        String groupId = chatType == 2 ? MainContent$lambda$16($currentChatId$delegate) : null;
        UserDetailActivity.INSTANCE.start(this$0, userId, userName, groupId);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MainContent$lambda$40$0$0(java.util.List r18, final com.yhchat.canarys.MainActivity r19, final androidx.compose.runtime.State r20, com.yhchat.canarys.p007ui.conversation.ConversationViewModel r21, com.yhchat.canarys.data.repository.NavigationRepository r22, androidx.compose.runtime.MutableState r23, androidx.compose.runtime.MutableState r24, final androidx.compose.runtime.MutableState r25, androidx.compose.runtime.State r26, androidx.compose.runtime.State r27, androidx.compose.foundation.pager.PagerScope r28, int r29, androidx.compose.runtime.Composer r30, int r31) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.MainActivity.MainContent$lambda$40$0$0(java.util.List, com.yhchat.canarys.MainActivity, androidx.compose.runtime.State, com.yhchat.canarys.ui.conversation.ConversationViewModel, com.yhchat.canarys.data.repository.NavigationRepository, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.State, androidx.compose.runtime.State, androidx.compose.foundation.pager.PagerScope, int, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit MainContent$lambda$40$0$0$0$0(MainActivity this$0, String chatId, int chatType, String chatName) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intent intent = new Intent(this$0, (Class<?>) ChatActivity.class);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, chatId);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, chatType);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, chatName);
        intent.setFlags(603979776);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    public static final Unit MainContent$lambda$40$0$0$1$0(State $isInitialized$delegate, MutableState $currentScreen$delegate) {
        if (MainContent$lambda$0($isInitialized$delegate)) {
            $currentScreen$delegate.setValue("search");
        }
        return Unit.INSTANCE;
    }

    public static final Unit MainContent$lambda$40$0$2$0(MutableState $currentScreen$delegate) {
        $currentScreen$delegate.setValue("conversation");
        return Unit.INSTANCE;
    }

    public static final Unit MainContent$lambda$40$0$3$0(MainActivity this$0, MutableState $currentChatId$delegate, String userId, String userName, int chatType, int currentUserPermission) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        String groupId = chatType == 2 ? MainContent$lambda$16($currentChatId$delegate) : null;
        UserDetailActivity.INSTANCE.start(this$0, userId, userName, groupId);
        return Unit.INSTANCE;
    }

    public static final Unit MainContent$lambda$40$0$4$0(MutableState $currentScreen$delegate) {
        $currentScreen$delegate.setValue("conversation");
        return Unit.INSTANCE;
    }

    public static final Unit MainContent$lambda$40$0$5$0(MainActivity this$0, String chatId, int chatType, String chatName) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intent intent = new Intent(this$0, (Class<?>) ChatActivity.class);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, chatId);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, chatType);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, chatName);
        intent.setFlags(603979776);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }

    public static final Unit MainContent$lambda$40$1$0(List $visibleNavItems, CoroutineScope $coroutineScope, PagerState $pagerState, MutableState $currentScreen$delegate, String screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        int targetIndex = 0;
        Iterator it = $visibleNavItems.iterator();
        while (true) {
            if (it.hasNext()) {
                if (Intrinsics.areEqual(((NavigationItem) it.next()).getId(), screen)) {
                    break;
                }
                targetIndex++;
            } else {
                targetIndex = -1;
                break;
            }
        }
        if (targetIndex >= 0) {
            BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new MainActivity$MainContent$9$2$1$1($pagerState, targetIndex, null), 3, null);
        }
        $currentScreen$delegate.setValue(screen);
        return Unit.INSTANCE;
    }

    private final void handleDeepLink() {
        Uri data;
        final String string;
        Intent intent = getIntent();
        if (intent != null && (data = intent.getData()) != null && (string = data.toString()) != null && ChatAddLinkHandler.INSTANCE.isChatAddLink(string)) {
            getWindow().getDecorView().post(new Runnable() { // from class: com.yhchat.canarys.MainActivity$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.handleDeepLink$lambda$0$0(this.f$0, string);
                }
            });
        }
    }

    public static final void handleDeepLink$lambda$0$0(MainActivity this$0, String $uriString) {
        ChatAddActivity.INSTANCE.start(this$0, $uriString);
    }

    private final void setupImageLoader() {
        ImageLoader.Builder builder = new ImageLoader.Builder(this);
        ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
        if (Build.VERSION.SDK_INT >= 28) {
            builder2.add(new ImageDecoderDecoder.Factory(false, 1, null));
        } else {
            builder2.add(new GifDecoder.Factory(false, 1, null));
        }
        ImageLoader imageLoader = builder.components(builder2.build()).okHttpClient(new Function0() { // from class: com.yhchat.canarys.MainActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MainActivity.setupImageLoader$lambda$1();
            }
        }).memoryCachePolicy(CachePolicy.ENABLED).diskCachePolicy(CachePolicy.ENABLED).build();
        Coil.setImageLoader(imageLoader);
    }

    public static final OkHttpClient setupImageLoader$lambda$1() {
        return new OkHttpClient.Builder().addInterceptor(new Interceptor() { // from class: com.yhchat.canarys.MainActivity$setupImageLoader$lambda$1$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                Request request = chain.request();
                if (StringsKt.contains$default((CharSequence) request.url().getUrl(), (CharSequence) "chat-img.jwznb.com", false, 2, (Object) null)) {
                    return chain.proceed(request.newBuilder().addHeader("Referer", "https://myapp.jwznb.com").build());
                }
                return chain.proceed(request);
            }
        }).build();
    }
}
