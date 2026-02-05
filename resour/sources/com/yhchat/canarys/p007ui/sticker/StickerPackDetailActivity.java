package com.yhchat.canarys.p007ui.sticker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.p007ui.theme.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StickerPackDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/sticker/StickerPackDetailActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@AndroidEntryPoint
/* loaded from: classes13.dex */
public final class StickerPackDetailActivity extends Hilt_StickerPackDetailActivity {
    private static final String EXTRA_STICKER_PACK_ID = "sticker_pack_id";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: StickerPackDetailActivity.kt */
    @Metadata(m168d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, m169d2 = {"Lcom/yhchat/canarys/ui/sticker/StickerPackDetailActivity$Companion;", "", "<init>", "()V", "EXTRA_STICKER_PACK_ID", "", "start", "", "context", "Landroid/content/Context;", "stickerPackId", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context, String stickerPackId) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(stickerPackId, "stickerPackId");
            Intent intent = new Intent(context, (Class<?>) StickerPackDetailActivity.class);
            intent.putExtra(StickerPackDetailActivity.EXTRA_STICKER_PACK_ID, stickerPackId);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.sticker.Hilt_StickerPackDetailActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String stickerPackId = getIntent().getStringExtra(EXTRA_STICKER_PACK_ID);
        if (stickerPackId == null) {
            stickerPackId = "";
        }
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-320323172, true, new Function2() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StickerPackDetailActivity.onCreate$lambda$0(stickerPackId, this, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final String $stickerPackId, final StickerPackDetailActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C57@2242L172,57@2224L190:StickerPackDetailActivity.kt#fniods");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-320323172, $changed, -1, "com.yhchat.canarys.ui.sticker.StickerPackDetailActivity.onCreate.<anonymous> (StickerPackDetailActivity.kt:57)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(868839935, true, new Function2() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StickerPackDetailActivity.onCreate$lambda$0$0($stickerPackId, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(String $stickerPackId, final StickerPackDetailActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C60@2370L12,58@2260L140:StickerPackDetailActivity.kt#fniods");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(868839935, $changed, -1, "com.yhchat.canarys.ui.sticker.StickerPackDetailActivity.onCreate.<anonymous>.<anonymous> (StickerPackDetailActivity.kt:58)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1731526219, "CC(remember):StickerPackDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StickerPackDetailActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            StickerPackDetailActivityKt.StickerPackDetailScreen($stickerPackId, (Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0(StickerPackDetailActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
