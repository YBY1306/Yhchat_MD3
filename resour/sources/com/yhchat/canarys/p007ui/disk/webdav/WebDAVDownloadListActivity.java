package com.yhchat.canarys.p007ui.disk.webdav;

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

/* compiled from: WebDAVDownloadListActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/webdav/WebDAVDownloadListActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class WebDAVDownloadListActivity extends BaseActivity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WebDAVDownloadListActivity.kt */
    @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/ui/disk/webdav/WebDAVDownloadListActivity$Companion;", "", "<init>", "()V", "start", "", "context", "Landroid/content/Context;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void start(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) WebDAVDownloadListActivity.class));
        }
    }

    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(-1188407605, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WebDAVDownloadListActivity.onCreate$lambda$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
            }
        }), 1, null);
    }

    public static final Unit onCreate$lambda$0(final WebDAVDownloadListActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C53@2270L78,53@2252L96:WebDAVDownloadListActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1188407605, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivity.onCreate.<anonymous> (WebDAVDownloadListActivity.kt:53)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(863006958, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVDownloadListActivity.onCreate$lambda$0$0(this.f$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0(final WebDAVDownloadListActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C54@2321L12,54@2288L46:WebDAVDownloadListActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(863006958, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivity.onCreate.<anonymous>.<anonymous> (WebDAVDownloadListActivity.kt:54)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 421000154, "CC(remember):WebDAVDownloadListActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivity$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVDownloadListActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            WebDAVDownloadListActivityKt.DownloadTaskScreen((Function0) objRememberedValue, $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit onCreate$lambda$0$0$0$0(WebDAVDownloadListActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
