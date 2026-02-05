package com.yhchat.canarys.p007ui.bot;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelProvider;
import com.yhchat.canarys.p007ui.base.BaseActivity;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotDetailActivity.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotDetailActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "viewModel", "Lcom/yhchat/canarys/ui/bot/BotDetailViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotDetailActivity extends BaseActivity {
    public static final String EXTRA_BOT_ID = "extra_bot_id";
    public static final String EXTRA_BOT_NAME = "extra_bot_name";
    public static final String EXTRA_CHAT_TYPE = "extra_chat_type";
    private BotDetailViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BotDetailActivity.kt */
    @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotDetailActivity$Companion;", "", "<init>", "()V", "EXTRA_BOT_ID", "", "EXTRA_BOT_NAME", "EXTRA_CHAT_TYPE", "start", "", "context", "Landroid/content/Context;", "botId", "botName", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                str2 = "\u673a\u5668\u4eba";
            }
            if ((i2 & 8) != 0) {
                i = 3;
            }
            companion.start(context, str, str2, i);
        }

        public final void start(Context context, String botId, String botName, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(botId, "botId");
            Intrinsics.checkNotNullParameter(botName, "botName");
            Intent intent = new Intent(context, (Class<?>) BotDetailActivity.class);
            intent.putExtra("extra_bot_id", botId);
            intent.putExtra("extra_bot_name", botName);
            intent.putExtra(BotDetailActivity.EXTRA_CHAT_TYPE, i);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BotDetailViewModel botDetailViewModel = null;
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String botId = getIntent().getStringExtra("extra_bot_id");
        final String botName = getIntent().getStringExtra("extra_bot_name");
        if (botName == null) {
            botName = "\u673a\u5668\u4eba";
        }
        final int chatType = getIntent().getIntExtra(EXTRA_CHAT_TYPE, 3);
        String str = botId;
        if (str == null || str.length() == 0) {
            finish();
            return;
        }
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        this.viewModel = (BotDetailViewModel) new ViewModelProvider(this, companion.getInstance(application)).get(BotDetailViewModel.class);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1429242618, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BotDetailActivity.onCreate$lambda$0(botId, botName, chatType, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
        BotDetailViewModel botDetailViewModel2 = this.viewModel;
        if (botDetailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            botDetailViewModel2 = null;
        }
        botDetailViewModel2.loadBotDetail(botId);
        BotDetailViewModel botDetailViewModel3 = this.viewModel;
        if (botDetailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            botDetailViewModel = botDetailViewModel3;
        }
        botDetailViewModel.loadBoardInfo(botId, chatType);
    }

    public static final Unit onCreate$lambda$0(final String $botId, final String $botName, final int $chatType, final BotDetailActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C118@4934L271,118@4916L289:BotDetailActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1429242618, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailActivity.onCreate.<anonymous> (BotDetailActivity.kt:118)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-880509719, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotDetailActivity.onCreate$lambda$0$0($botId, $botName, $chatType, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(String $botId, String $botName, int $chatType, final BotDetailActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C124@5161L12,119@4952L239:BotDetailActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-880509719, $changed, -1, "com.yhchat.canarys.ui.bot.BotDetailActivity.onCreate.<anonymous>.<anonymous> (BotDetailActivity.kt:119)");
            }
            BotDetailViewModel botDetailViewModel = this$0.viewModel;
            if (botDetailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                botDetailViewModel = null;
            }
            BotDetailViewModel botDetailViewModel2 = botDetailViewModel;
            ComposerKt.sourceInformationMarkerStart($composer, -61275371, "CC(remember):BotDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotDetailActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BotDetailActivityKt.BotDetailScreen($botId, $botName, $chatType, botDetailViewModel2, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0(BotDetailActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
