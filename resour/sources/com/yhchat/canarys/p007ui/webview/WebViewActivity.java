package com.yhchat.canarys.p007ui.webview;

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

/* compiled from: WebViewActivity.kt */
@Metadata(m168d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014\u00a8\u0006\t"}, m169d2 = {"Lcom/yhchat/canarys/ui/webview/WebViewActivity;", "Lcom/yhchat/canarys/ui/base/BaseActivity;", "<init>", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class WebViewActivity extends BaseActivity {
    private static final String EXTRA_TITLE = "extra_title";
    private static final String EXTRA_TOKEN = "extra_token";
    private static final String EXTRA_URL = "extra_url";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: WebViewActivity.kt */
    @Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, m169d2 = {"Lcom/yhchat/canarys/ui/webview/WebViewActivity$Companion;", "", "<init>", "()V", "EXTRA_URL", "", "EXTRA_TITLE", "EXTRA_TOKEN", "start", "", "context", "Landroid/content/Context;", "url", "title", "token", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void start$default(Companion companion, Context context, String str, String str2, String str3, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            companion.start(context, str, str2, str3);
        }

        public final void start(Context context, String url, String title, String token) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
            intent.putExtra(WebViewActivity.EXTRA_URL, url);
            intent.putExtra(WebViewActivity.EXTRA_TITLE, title);
            intent.putExtra(WebViewActivity.EXTRA_TOKEN, token);
            context.startActivity(intent);
        }
    }

    @Override // com.yhchat.canarys.p007ui.base.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable$default(this, null, null, 3, null);
        final String url = getIntent().getStringExtra(EXTRA_URL);
        if (url == null) {
            url = "";
        }
        final String initialTitle = getIntent().getStringExtra(EXTRA_TITLE);
        if (initialTitle == null) {
            initialTitle = "\u7f51\u9875";
        }
        final String token = getIntent().getStringExtra(EXTRA_TOKEN);
        if (url.length() == 0) {
            finish();
        } else {
            ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(1462031896, true, new Function2() { // from class: com.yhchat.canarys.ui.webview.WebViewActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebViewActivity.onCreate$lambda$0(url, initialTitle, token, this, (Composer) obj, ((Integer) obj2).intValue());
                }
            }), 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(final String $url, final String $initialTitle, final String $token, final WebViewActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C67@2353L226,67@2335L244:WebViewActivity.kt#z68e9g");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1462031896, $changed, -1, "com.yhchat.canarys.ui.webview.WebViewActivity.onCreate.<anonymous> (WebViewActivity.kt:67)");
            }
            ThemeKt.YhchatCanaryTheme(false, false, ComposableLambdaKt.rememberComposableLambda(2010764795, true, new Function2() { // from class: com.yhchat.canarys.ui.webview.WebViewActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebViewActivity.onCreate$lambda$0$0($url, $initialTitle, $token, this$0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), $composer, 384, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0(String $url, String $initialTitle, String $token, final WebViewActivity this$0, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C72@2535L12,68@2371L194:WebViewActivity.kt#z68e9g");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2010764795, $changed, -1, "com.yhchat.canarys.ui.webview.WebViewActivity.onCreate.<anonymous>.<anonymous> (WebViewActivity.kt:68)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -390309369, "CC(remember):WebViewActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance(this$0);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.webview.WebViewActivity$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebViewActivity.onCreate$lambda$0$0$0$0(this.f$0);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            WebViewActivityKt.WebViewScreen($url, $initialTitle, $token, (Function0) objRememberedValue, null, $composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0$0$0$0(WebViewActivity this$0) {
        this$0.finish();
        return Unit.INSTANCE;
    }
}
