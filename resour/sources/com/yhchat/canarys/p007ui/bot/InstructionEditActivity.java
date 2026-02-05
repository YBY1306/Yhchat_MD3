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

/* compiled from: InstructionEditActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/InstructionEditActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class InstructionEditActivity extends ComponentActivity {
    private static final String EXTRA_BOT_ID = "bot_id";
    private static final String EXTRA_BOT_NAME = "bot_name";
    private static final String EXTRA_INSTRUCTION_ID = "instruction_id";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InstructionEditActivity.kt */
    @Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/InstructionEditActivity$Companion;", "", "<init>", "()V", "EXTRA_BOT_ID", "", "EXTRA_BOT_NAME", "EXTRA_INSTRUCTION_ID", "start", "", "context", "Landroid/content/Context;", "botId", "botName", "instructionId", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, String botId, String botName, Integer instructionId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(botId, "botId");
            Intrinsics.checkNotNullParameter(botName, "botName");
            Intent intent = new Intent(context, (Class<?>) InstructionEditActivity.class);
            intent.putExtra(InstructionEditActivity.EXTRA_BOT_ID, botId);
            intent.putExtra(InstructionEditActivity.EXTRA_BOT_NAME, botName);
            if (instructionId != null) {
                intent.putExtra(InstructionEditActivity.EXTRA_INSTRUCTION_ID, instructionId.intValue());
            }
            context.startActivity(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        final Integer instructionId;
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String botId = getIntent().getStringExtra(EXTRA_BOT_ID);
        if (botId == null) {
            InstructionEditActivity instructionEditActivity = this;
            Toast.makeText(instructionEditActivity, "\u53c2\u6570\u9519\u8bef", 0).show();
            instructionEditActivity.finish();
            return;
        }
        final String botName = getIntent().getStringExtra(EXTRA_BOT_NAME);
        if (botName == null) {
            botName = "\u673a\u5668\u4eba";
        }
        if (getIntent().hasExtra(EXTRA_INSTRUCTION_ID)) {
            instructionId = Integer.valueOf(getIntent().getIntExtra(EXTRA_INSTRUCTION_ID, -1));
            if (!(instructionId.intValue() != -1)) {
                instructionId = null;
            }
        } else {
            instructionId = null;
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(468997702, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InstructionEditActivity.onCreate$lambda$2(botId, botName, instructionId, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$2(final String $botId, final String $botName, final Integer $instructionId, final InstructionEditActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C62@2516L294,62@2498L312:InstructionEditActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(468997702, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionEditActivity.onCreate.<anonymous> (InstructionEditActivity.kt:62)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-799958615, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionEditActivity.onCreate$lambda$2$0($botId, $botName, $instructionId, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$2$0(String $botId, String $botName, Integer $instructionId, final InstructionEditActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C67@2716L12,68@2766L12,63@2534L262:InstructionEditActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-799958615, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionEditActivity.onCreate.<anonymous>.<anonymous> (InstructionEditActivity.kt:63)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 38923381, "CC(remember):InstructionEditActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstructionEditActivity.onCreate$lambda$2$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 38924981, "CC(remember):InstructionEditActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance(this$0);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionEditActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstructionEditActivity.onCreate$lambda$2$0$1$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            InstructionEditActivityKt.InstructionEditScreen($botId, $botName, $instructionId, function0, (Function0) objRememberedValue2, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$2$0$0$0(InstructionEditActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$2$0$1$0(InstructionEditActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
