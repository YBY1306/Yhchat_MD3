package com.yhchat.canarys.p007ui.chat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.yhchat.canarys.data.model.ChatAddInfo;
import com.yhchat.canarys.data.model.ChatAddType;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import com.yhchat.canarys.utils.UnifiedLinkHandler;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatAddActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/chat/ChatAddActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes12.dex */
public final class ChatAddActivity extends Hilt_ChatAddActivity {
    public static final String EXTRA_LINK = "extra_link";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ChatAddActivity.kt */
    @Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, m169d2 = {"Lcom/yhchat/canarys/ui/chat/ChatAddActivity$Companion;", "", "<init>", "()V", "EXTRA_LINK", "", "start", "", "context", "Landroid/content/Context;", "link", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, String link) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(link, "link");
            Intent intent = new Intent(context, (Class<?>) ChatAddActivity.class);
            intent.putExtra(ChatAddActivity.EXTRA_LINK, link);
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.chat.Hilt_ChatAddActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String uriString;
        ChatAddType chatAddType;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        try {
            final String shareKey = getIntent().getStringExtra("share_key");
            final String shareTs = getIntent().getStringExtra("share_ts");
            if (shareKey != null && shareTs != null) {
                ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(246421314, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatAddActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatAddActivity.onCreate$lambda$0(shareKey, shareTs, this, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }), 1, null);
                return;
            }
            String chatId = getIntent().getStringExtra("chat_id");
            int chatType = getIntent().getIntExtra("chat_type", 0);
            if (chatId != null && chatType > 0) {
                switch (chatType) {
                    case 1:
                        chatAddType = ChatAddType.USER;
                        break;
                    case 2:
                        chatAddType = ChatAddType.GROUP;
                        break;
                    case 3:
                        chatAddType = ChatAddType.BOT;
                        break;
                    default:
                        chatAddType = null;
                        break;
                }
                if (chatAddType != null) {
                    final ChatAddInfo chatAddInfo = new ChatAddInfo(chatId, chatAddType, "", "", "", null, 32, null);
                    ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1193598996, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatAddActivity$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChatAddActivity.onCreate$lambda$1(chatAddInfo, this, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    }), 1, null);
                    return;
                }
            }
            if (getIntent().getData() != null && (uriString = getIntent().getDataString()) != null) {
                UnifiedLinkHandler.INSTANCE.handleLink(this, uriString);
                finish();
            } else {
                Log.w("ChatAddActivity", "\u65e0\u6548\u7684\u53c2\u6570");
                finish();
            }
        } catch (Exception e) {
            Log.e("ChatAddActivity", "\u521d\u59cb\u5316\u5931\u8d25", e);
            finish();
        }
    }

    public static final Unit onCreate$lambda$0(final String $shareKey, final String $shareTs, final ChatAddActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C67@2463L642,67@2445L660:ChatAddActivity.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(246421314, $changed, -1, "com.yhchat.canarys.ui.chat.ChatAddActivity.onCreate.<anonymous> (ChatAddActivity.kt:67)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-71607425, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatAddActivity$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatAddActivity.onCreate$lambda$0$0($shareKey, $shareTs, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(final String $shareKey, final String $shareTs, final ChatAddActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C70@2611L11,71@2660L423,68@2489L594:ChatAddActivity.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-71607425, $changed, -1, "com.yhchat.canarys.ui.chat.ChatAddActivity.onCreate.<anonymous>.<anonymous> (ChatAddActivity.kt:68)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(2073066180, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatAddActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatAddActivity.onCreate$lambda$0$0$0($shareKey, $shareTs, this$0, (Composer) obj, ((Integer) obj2).intValue());
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

    public static final Unit onCreate$lambda$0$0$0(String $shareKey, String $shareTs, final ChatAddActivity this$0, Composer $composer, int $changed) {
        CreationExtras defaultViewModelCreationExtras;
        ComposerKt.sourceInformation($composer, "C72@2724L15,78@3015L12,74@2797L260:ChatAddActivity.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2073066180, $changed, -1, "com.yhchat.canarys.ui.chat.ChatAddActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ChatAddActivity.kt:72)");
            }
            $composer.startReplaceableGroup(1890788296);
            ComposerKt.sourceInformation($composer, "CC(hiltViewModel)P(1)*45@1969L7,50@2112L47,51@2171L54:HiltViewModel.kt#9mcars");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer, LocalViewModelStoreOwner.$stable);
            if (current != null) {
                ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, $composer, 0 & 14);
                int i = (0 & 14) | (0 & 112);
                $composer.startReplaceableGroup(1729797275);
                ComposerKt.sourceInformation($composer, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                if (current instanceof HasDefaultViewModelProviderFactory) {
                    defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                }
                ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) ChatAddViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, $composer, ((i << 3) & 896) | 36936, 0);
                $composer.endReplaceableGroup();
                $composer.endReplaceableGroup();
                ChatAddViewModel viewModel2 = (ChatAddViewModel) viewModel;
                ComposerKt.sourceInformationMarkerStart($composer, -648214992, "CC(remember):ChatAddActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance(this$0);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatAddActivity$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChatAddActivity.onCreate$lambda$0$0$0$0$0(this.f$0);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ChatAddActivityKt.ChatAddScreen(null, $shareKey, $shareTs, viewModel2, (Function0) objRememberedValue, null, $composer, 0, 33);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0$0(ChatAddActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$1(final ChatAddInfo $chatAddInfo, final ChatAddActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C108@4057L649,108@4039L667:ChatAddActivity.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1193598996, $changed, -1, "com.yhchat.canarys.ui.chat.ChatAddActivity.onCreate.<anonymous> (ChatAddActivity.kt:108)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1633505071, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatAddActivity$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatAddActivity.onCreate$lambda$1$0($chatAddInfo, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$1$0(final ChatAddInfo $chatAddInfo, final ChatAddActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C111@4217L11,112@4270L410,109@4087L593:ChatAddActivity.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1633505071, $changed, -1, "com.yhchat.canarys.ui.chat.ChatAddActivity.onCreate.<anonymous>.<anonymous> (ChatAddActivity.kt:109)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(772935830, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatAddActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatAddActivity.onCreate$lambda$1$0$0($chatAddInfo, this$0, (Composer) obj, ((Integer) obj2).intValue());
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

    public static final Unit onCreate$lambda$1$0$0(ChatAddInfo $chatAddInfo, final ChatAddActivity this$0, Composer $composer, int $changed) {
        CreationExtras defaultViewModelCreationExtras;
        ComposerKt.sourceInformation($composer, "C113@4338L15,118@4604L12,115@4419L231:ChatAddActivity.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(772935830, $changed, -1, "com.yhchat.canarys.ui.chat.ChatAddActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (ChatAddActivity.kt:113)");
            }
            $composer.startReplaceableGroup(1890788296);
            ComposerKt.sourceInformation($composer, "CC(hiltViewModel)P(1)*45@1969L7,50@2112L47,51@2171L54:HiltViewModel.kt#9mcars");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, $composer, 0 & 14);
            int i = (0 & 14) | (0 & 112);
            $composer.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation($composer, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((Class<ViewModel>) ChatAddViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, $composer, ((i << 3) & 896) | 36936, 0);
            $composer.endReplaceableGroup();
            $composer.endReplaceableGroup();
            ChatAddViewModel viewModel2 = (ChatAddViewModel) viewModel;
            ComposerKt.sourceInformationMarkerStart($composer, -237998878, "CC(remember):ChatAddActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatAddActivity$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatAddActivity.onCreate$lambda$1$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ChatAddActivityKt.ChatAddScreen($chatAddInfo, null, null, viewModel2, (Function0) objRememberedValue, null, $composer, 0, 38);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$1$0$0$0$0(ChatAddActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
