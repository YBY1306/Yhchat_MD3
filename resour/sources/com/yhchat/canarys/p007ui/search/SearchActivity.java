package com.yhchat.canarys.p007ui.search;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.chat.ChatActivity;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchActivity.kt */
@Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/search/SearchActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes11.dex */
public final class SearchActivity extends Hilt_SearchActivity {
    public static final int $stable = 8;

    @Override // com.yhchat.canarys.p007ui.search.Hilt_SearchActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final TokenRepository tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(this);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1136118547, true, new Function2() { // from class: com.yhchat.canarys.ui.search.SearchActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SearchActivity.onCreate$lambda$0(this.f$0, tokenRepository, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final SearchActivity this$0, final TokenRepository $tokenRepository, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C26@938L814,26@920L832:SearchActivity.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1136118547, $changed, -1, "com.yhchat.canarys.ui.search.SearchActivity.onCreate.<anonymous> (SearchActivity.kt:26)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(1031206890, true, new Function2() { // from class: com.yhchat.canarys.ui.search.SearchActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchActivity.onCreate$lambda$0$0(this.f$0, $tokenRepository, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(final SearchActivity this$0, final TokenRepository $tokenRepository, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C29@1062L11,30@1103L635,27@956L782:SearchActivity.kt#ogsx9x");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1031206890, $changed, -1, "com.yhchat.canarys.ui.search.SearchActivity.onCreate.<anonymous>.<anonymous> (SearchActivity.kt:27)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1422394351, true, new Function2() { // from class: com.yhchat.canarys.ui.search.SearchActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchActivity.onCreate$lambda$0$0$0(this.f$0, $tokenRepository, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 12582918, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0(final SearchActivity this$0, TokenRepository $tokenRepository, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C32@1177L12,33@1229L410,31@1125L595:SearchActivity.kt#ogsx9x");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1422394351, $changed, -1, "com.yhchat.canarys.ui.search.SearchActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SearchActivity.kt:31)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1121373563, "CC(remember):SearchActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.SearchActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchActivity.onCreate$lambda$0$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1121375625, "CC(remember):SearchActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function3() { // from class: com.yhchat.canarys.ui.search.SearchActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        return SearchActivity.onCreate$lambda$0$0$0$1$0(this.f$0, (String) obj3, ((Integer) obj4).intValue(), (String) obj5);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SearchScreenKt.SearchScreen(function0, (Function3) objRememberedValue2, $tokenRepository, null, $composer, 0, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0$0(SearchActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$1$0(SearchActivity this$0, String chatId, int chatType, String chatName) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        Intent intent = new Intent(this$0, (Class<?>) ChatActivity.class);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, chatId);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, chatType);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, chatName);
        this$0.startActivity(intent);
        return Unit.INSTANCE;
    }
}
