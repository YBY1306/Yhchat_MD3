package com.yhchat.canarys.p007ui.bot;

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
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstructionManagementActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/InstructionManagementActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class InstructionManagementActivity extends ComponentActivity {
    private static final String EXTRA_BOT_ID = "bot_id";
    private static final String EXTRA_BOT_NAME = "bot_name";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InstructionManagementActivity.kt */
    @Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/InstructionManagementActivity$Companion;", "", "<init>", "()V", "EXTRA_BOT_ID", "", "EXTRA_BOT_NAME", "start", "", "context", "Landroid/content/Context;", "botId", "botName", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
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
            Intent intent = new Intent(context, (Class<?>) InstructionManagementActivity.class);
            intent.putExtra(InstructionManagementActivity.EXTRA_BOT_ID, botId);
            intent.putExtra(InstructionManagementActivity.EXTRA_BOT_NAME, botName);
            context.startActivity(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String botId = getIntent().getStringExtra(EXTRA_BOT_ID);
        if (botId == null) {
            InstructionManagementActivity instructionManagementActivity = this;
            Toast.makeText(instructionManagementActivity, "\u53c2\u6570\u9519\u8bef", 0).show();
            instructionManagementActivity.finish();
        } else {
            final String botName = getIntent().getStringExtra(EXTRA_BOT_NAME);
            if (botName == null) {
                botName = "\u673a\u5668\u4eba";
            }
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-211262362, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionManagementActivity.onCreate$lambda$1(botId, botName, this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }), 1, null);
        }
    }

    public static final Unit onCreate$lambda$1(final String $botId, final String $botName, final InstructionManagementActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C69@2733L199,69@2715L217:InstructionManagementActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-211262362, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionManagementActivity.onCreate.<anonymous> (InstructionManagementActivity.kt:69)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1952142519, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionManagementActivity.onCreate$lambda$1$0($botId, $botName, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$1$0(String $botId, String $botName, final InstructionManagementActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C73@2888L12,70@2751L167:InstructionManagementActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1952142519, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionManagementActivity.onCreate.<anonymous>.<anonymous> (InstructionManagementActivity.kt:70)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 891752565, "CC(remember):InstructionManagementActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionManagementActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstructionManagementActivity.onCreate$lambda$1$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            InstructionManagementActivityKt.InstructionManagementScreen($botId, $botName, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$1$0$0$0(InstructionManagementActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
