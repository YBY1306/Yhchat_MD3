package com.yhchat.canarys.p007ui.bot;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
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

/* compiled from: BotEditActivity.kt */
@Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotEditActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "viewModel", "Lcom/yhchat/canarys/ui/bot/BotEditViewModel;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotEditActivity extends ComponentActivity {
    public static final String EXTRA_BOT_ID = "botId";
    public static final String EXTRA_BOT_NAME = "botName";
    private BotEditViewModel viewModel;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BotEditActivity.kt */
    @Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotEditActivity$Companion;", "", "<init>", "()V", "EXTRA_BOT_ID", "", "EXTRA_BOT_NAME", "start", "", "context", "Landroid/content/Context;", "botId", "botName", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
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
            Intent intent = new Intent(context, (Class<?>) BotEditActivity.class);
            intent.putExtra("botId", botId);
            intent.putExtra("botName", botName);
            context.startActivity(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        BotEditViewModel botEditViewModel = null;
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String botId = getIntent().getStringExtra("botId");
        if (botId == null) {
            botId = "";
        }
        final String botName = getIntent().getStringExtra("botName");
        if (botName == null) {
            botName = "\u673a\u5668\u4eba";
        }
        if (botId.length() == 0) {
            finish();
            return;
        }
        ViewModelProvider.AndroidViewModelFactory.Companion companion = ViewModelProvider.AndroidViewModelFactory.INSTANCE;
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        this.viewModel = (BotEditViewModel) new ViewModelProvider(this, companion.getInstance(application)).get(BotEditViewModel.class);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-628837402, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotEditActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return BotEditActivity.onCreate$lambda$0(botId, botName, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
        BotEditViewModel botEditViewModel2 = this.viewModel;
        if (botEditViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            botEditViewModel = botEditViewModel2;
        }
        botEditViewModel.loadBotInfo(botId);
    }

    public static final Unit onCreate$lambda$0(final String $botId, final String $botName, final BotEditActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C70@2698L278,70@2680L296:BotEditActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-628837402, $changed, -1, "com.yhchat.canarys.ui.bot.BotEditActivity.onCreate.<anonymous> (BotEditActivity.kt:70)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1390207671, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotEditActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotEditActivity.onCreate$lambda$0$0($botId, $botName, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(String $botId, String $botName, final BotEditActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C75@2882L12,76@2932L12,71@2716L246:BotEditActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1390207671, $changed, -1, "com.yhchat.canarys.ui.bot.BotEditActivity.onCreate.<anonymous>.<anonymous> (BotEditActivity.kt:71)");
            }
            BotEditViewModel botEditViewModel = this$0.viewModel;
            if (botEditViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                botEditViewModel = null;
            }
            BotEditViewModel botEditViewModel2 = botEditViewModel;
            ComposerKt.sourceInformationMarkerStart($composer, -254736875, "CC(remember):BotEditActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotEditActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotEditActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -254735275, "CC(remember):BotEditActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotEditActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotEditActivity.onCreate$lambda$0$0$1$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BotEditActivityKt.BotEditScreen($botId, $botName, botEditViewModel2, function0, (Function0) objRememberedValue2, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0(BotEditActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$1$0(BotEditActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
