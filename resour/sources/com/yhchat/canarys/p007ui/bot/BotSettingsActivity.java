package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.p007ui.base.BaseActivity;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BotSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotSettingsActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotSettingsActivity extends BaseActivity {
    private static final String EXTRA_BOT_ID = "extra_bot_id";
    private static final String EXTRA_BOT_NAME = "extra_bot_name";
    private static final String EXTRA_BOT_TOKEN = "extra_bot_token";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BotSettingsActivity.kt */
    @Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J(\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotSettingsActivity$Companion;", "", "<init>", "()V", "EXTRA_BOT_ID", "", "EXTRA_BOT_NAME", "EXTRA_BOT_TOKEN", "start", "", "context", "Landroid/content/Context;", "botId", "botName", BotManagementActivity.EXTRA_BOT_TOKEN, "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = "";
            }
            companion.start(context, str, str2, str3);
        }

        public final void start(Context context, String botId, String botName, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(botId, "botId");
            Intrinsics.checkNotNullParameter(botName, "botName");
            Intrinsics.checkNotNullParameter(str, "botToken");
            Intent intent = new Intent(context, (Class<?>) BotSettingsActivity.class);
            intent.putExtra("extra_bot_id", botId);
            intent.putExtra("extra_bot_name", botName);
            intent.putExtra(BotSettingsActivity.EXTRA_BOT_TOKEN, str);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String botId = getIntent().getStringExtra("extra_bot_id");
        if (botId == null) {
            botId = "";
        }
        final String botName = getIntent().getStringExtra("extra_bot_name");
        if (botName == null) {
            botName = "\u673a\u5668\u4eba";
        }
        String stringExtra = getIntent().getStringExtra(EXTRA_BOT_TOKEN);
        final String initialBotToken = stringExtra != null ? stringExtra : "";
        if (botId.length() == 0) {
            finish();
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1026500858, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotSettingsActivity.onCreate$lambda$0(botId, botName, initialBotToken, this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }), 1, null);
        }
    }

    public static final Unit onCreate$lambda$0(final String $botId, final String $botName, final String $initialBotToken, final BotSettingsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C61@2636L239,61@2618L257:BotSettingsActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1026500858, $changed, -1, "com.yhchat.canarys.ui.bot.BotSettingsActivity.onCreate.<anonymous> (BotSettingsActivity.kt:61)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(2137861481, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BotSettingsActivity.onCreate$lambda$0$0($botId, $botName, $initialBotToken, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(String $botId, String $botName, String $initialBotToken, final BotSettingsActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C66@2831L12,62@2654L207:BotSettingsActivity.kt#eelfqe");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2137861481, $changed, -1, "com.yhchat.canarys.ui.bot.BotSettingsActivity.onCreate.<anonymous>.<anonymous> (BotSettingsActivity.kt:62)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1490522005, "CC(remember):BotSettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.BotSettingsActivity$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BotSettingsActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BotSettingsActivityKt.BotSettingsScreen($botId, $botName, $initialBotToken, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0(BotSettingsActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
