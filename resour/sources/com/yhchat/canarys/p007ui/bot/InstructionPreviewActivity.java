package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.data.model.BotInstruction;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstructionPreviewActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/InstructionPreviewActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class InstructionPreviewActivity extends ComponentActivity {
    private static final String EXTRA_INSTRUCTION = "instruction";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InstructionPreviewActivity.kt */
    @Metadata(m168d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/InstructionPreviewActivity$Companion;", "", "<init>", "()V", "EXTRA_INSTRUCTION", "", "start", "", "context", "Landroid/content/Context;", InstructionPreviewActivity.EXTRA_INSTRUCTION, "Lcom/yhchat/canarys/data/model/BotInstruction;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, BotInstruction instruction) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(instruction, "instruction");
            Intent intent = new Intent(context, (Class<?>) InstructionPreviewActivity.class);
            intent.putExtra(InstructionPreviewActivity.EXTRA_INSTRUCTION, instruction);
            context.startActivity(intent);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        Serializable serializableExtra = getIntent().getSerializableExtra(EXTRA_INSTRUCTION);
        final BotInstruction instruction = serializableExtra instanceof BotInstruction ? (BotInstruction) serializableExtra : null;
        if (instruction == null) {
            finish();
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1546631044, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionPreviewActivity.onCreate$lambda$1(instruction, this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final BotInstruction $instruction, final InstructionPreviewActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C47@1756L169,47@1738L187:InstructionPreviewActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1546631044, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionPreviewActivity.onCreate.<anonymous> (InstructionPreviewActivity.kt:47)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(-1795672673, true, new Function2() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstructionPreviewActivity.onCreate$lambda$1$0($instruction, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0(BotInstruction $instruction, final InstructionPreviewActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C50@1881L12,48@1774L137:InstructionPreviewActivity.kt#eelfqe");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1795672673, $changed, -1, "com.yhchat.canarys.ui.bot.InstructionPreviewActivity.onCreate.<anonymous>.<anonymous> (InstructionPreviewActivity.kt:48)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 935418251, "CC(remember):InstructionPreviewActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.bot.InstructionPreviewActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstructionPreviewActivity.onCreate$lambda$1$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            InstructionPreviewActivityKt.InstructionPreviewScreen($instruction, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$0$0$0(InstructionPreviewActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
