package com.yhchat.canarys.p007ui.bot;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelProvider;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotInfoActivity.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotInfoActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/yhchat/canarys/ui/bot/BotInfoViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotInfoActivity extends ComponentActivity {
    public static final String EXTRA_BOT_ID = "extra_bot_id";
    public static final String EXTRA_BOT_NAME = "extra_bot_name";
    private BotInfoViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BotInfoViewModel botInfoViewModel = null;
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String botId = getIntent().getStringExtra("extra_bot_id");
        final String botName = getIntent().getStringExtra("extra_bot_name");
        if (botName == null) {
            botName = "\u673a\u5668\u4eba";
        }
        String str = botId;
        if (str == null || str.length() == 0) {
            Toast.makeText(this, "\u673a\u5668\u4ebaID\u65e0\u6548", 0).show();
            finish();
            return;
        }
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        this.viewModel = (BotInfoViewModel) new ViewModelProvider(this, companion.getInstance(application)).get(BotInfoViewModel.class);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1746723226, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BotInfoActivity.onCreate$lambda$0(botId, botName, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
        BotInfoViewModel botInfoViewModel2 = this.viewModel;
        if (botInfoViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            botInfoViewModel = botInfoViewModel2;
        }
        botInfoViewModel.loadBotInfo(botId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final String $botId, final String $botName, final BotInfoActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C62@2486L228,62@2468L246:BotInfoActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1746723226, $changed, -1, "com.yhchat.canarys.ui.bot.BotInfoActivity.onCreate.<anonymous> (BotInfoActivity.kt:62)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(1786873801, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotInfoActivity.onCreate$lambda$0$0($botId, $botName, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(String $botId, String $botName, final BotInfoActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C67@2670L12,63@2504L196:BotInfoActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1786873801, $changed, -1, "com.yhchat.canarys.ui.bot.BotInfoActivity.onCreate.<anonymous>.<anonymous> (BotInfoActivity.kt:63)");
            }
            BotInfoViewModel botInfoViewModel = this$0.viewModel;
            if (botInfoViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                botInfoViewModel = null;
            }
            BotInfoViewModel botInfoViewModel2 = botInfoViewModel;
            ComposerKt.sourceInformationMarkerStart($composer, -801189739, "CC(remember):BotInfoActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotInfoActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotInfoActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BotInfoActivityKt.BotInfoScreen($botId, $botName, botInfoViewModel2, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0(BotInfoActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    /* compiled from: BotInfoActivity.kt */
    @Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotInfoActivity$Companion;", "", "<init>", "()V", "EXTRA_BOT_ID", "", "EXTRA_BOT_NAME", "start", "", "context", "Landroid/content/Context;", "botId", "botName", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, String botId, String botName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(botId, "botId");
            Intrinsics.checkNotNullParameter(botName, "botName");
            Intent intent = new Intent(context, (Class<?>) BotInfoActivity.class);
            intent.putExtra("extra_bot_id", botId);
            intent.putExtra("extra_bot_name", botName);
            context.startActivity(intent);
        }
    }
}
