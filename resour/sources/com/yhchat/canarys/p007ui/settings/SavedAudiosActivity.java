package com.yhchat.canarys.p007ui.settings;

import android.content.Context;
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
import com.yhchat.canarys.p007ui.base.BaseActivity;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SavedAudiosActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/SavedAudiosActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class SavedAudiosActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SavedAudiosActivity.kt */
    @Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u001e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u00a8\u0006\r"}, m169d2 = {"Lcom/yhchat/canarys/ui/settings/SavedAudiosActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "startForSelection", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) SavedAudiosActivity.class));
        }

        public final void startForSelection(Context context, String chatId, int chatType) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            Intent intent = new Intent(context, (Class<?>) SavedAudiosActivity.class);
            intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, chatId);
            intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, chatType);
            intent.putExtra("selectionMode", true);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String chatId = getIntent().getStringExtra(ChatSearchActivity.EXTRA_CHAT_ID);
        final int chatType = getIntent().getIntExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, 0);
        final boolean selectionMode = getIntent().getBooleanExtra("selectionMode", false);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1074311376, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SavedAudiosActivity.onCreate$lambda$0(this.f$0, chatId, chatType, selectionMode, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final SavedAudiosActivity this$0, final String $chatId, final int $chatType, final boolean $selectionMode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C120@5096L388,120@5078L406:SavedAudiosActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1074311376, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosActivity.onCreate.<anonymous> (SavedAudiosActivity.kt:120)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(1856102477, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivity$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedAudiosActivity.onCreate$lambda$0$0(this.f$0, $chatId, $chatType, $selectionMode, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(final SavedAudiosActivity this$0, final String $chatId, final int $chatType, final boolean $selectionMode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C121@5179L11,121@5203L267,121@5114L356:SavedAudiosActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1856102477, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosActivity.onCreate.<anonymous>.<anonymous> (SavedAudiosActivity.kt:121)");
            }
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-514847534, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedAudiosActivity.onCreate$lambda$0$0$0(this.f$0, $chatId, $chatType, $selectionMode, (Composer) obj, ((Integer) obj2).intValue());
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
    public static final Unit onCreate$lambda$0$0$0(final SavedAudiosActivity this$0, String $chatId, int $chatType, boolean $selectionMode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C123@5277L12,122@5225L227:SavedAudiosActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-514847534, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (SavedAudiosActivity.kt:122)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -847238754, "CC(remember):SavedAudiosActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SavedAudiosActivity.onCreate$lambda$0$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SavedAudiosActivityKt.SavedAudiosScreen((Function0) objRememberedValue, $chatId, $chatType, $selectionMode, $composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0$0(SavedAudiosActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
