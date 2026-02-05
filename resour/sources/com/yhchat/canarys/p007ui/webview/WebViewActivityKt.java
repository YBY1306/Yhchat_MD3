package com.yhchat.canarys.p007ui.webview;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewActivity.kt */
@Metadata(m168d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\u0010\n\u00a8\u0006\u000b\u00b2\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000e\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000f\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u008e\u0002"}, m169d2 = {"WebViewScreen", "", "url", "", "initialTitle", "token", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "webView", "Landroid/webkit/WebView;", "currentTitle", "currentUrl", "isLoading", "", "showMenu"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class WebViewActivityKt {
    public static final Unit WebViewScreen$lambda$18(String str, String str2, String str3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WebViewScreen(str, str2, str3, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:300:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x061c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void WebViewScreen(final java.lang.String r74, final java.lang.String r75, java.lang.String r76, final kotlin.jvm.functions.Function0<kotlin.Unit> r77, androidx.compose.p000ui.Modifier r78, androidx.compose.runtime.Composer r79, final int r80, final int r81) {
        /*
            Method dump skipped, instructions count: 1599
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.webview.WebViewActivityKt.WebViewScreen(java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final WebView WebViewScreen$lambda$1(MutableState<WebView> mutableState) {
        return mutableState.getValue();
    }

    private static final String WebViewScreen$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String WebViewScreen$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final boolean WebViewScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void WebViewScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean WebViewScreen$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void WebViewScreen$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit WebViewScreen$lambda$17$0(MutableState $currentTitle$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C118@3662L151:WebViewActivity.kt#z68e9g");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(198594195, $changed, -1, "com.yhchat.canarys.ui.webview.WebViewScreen.<anonymous>.<anonymous> (WebViewActivity.kt:118)");
            }
            TextKt.m3359Text4IGK_g(WebViewScreen$lambda$4($currentTitle$delegate), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 3120, 120830);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit WebViewScreen$lambda$17$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C125@3876L214:WebViewActivity.kt#z68e9g");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(321875861, $changed, -1, "com.yhchat.canarys.ui.webview.WebViewScreen.<anonymous>.<anonymous> (WebViewActivity.kt:125)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$WebViewActivityKt.INSTANCE.getLambda$105585714$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit WebViewScreen$lambda$17$2(final MutableState $showMenu$delegate, final Context $context, final MutableState $webView$delegate, final MutableState $isLoading$delegate, final MutableState $currentUrl$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C133@4146L2810:WebViewActivity.kt#z68e9g");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1636339646, $changed, -1, "com.yhchat.canarys.ui.webview.WebViewScreen.<anonymous>.<anonymous> (WebViewActivity.kt:133)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                $composer.createNode(constructor);
            } else {
                $composer.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1837817539, "C134@4193L19,134@4172L241,144@4585L20,145@4628L2310,142@4483L2455:WebViewActivity.kt#z68e9g");
            ComposerKt.sourceInformationMarkerStart($composer, -1306212501, "CC(remember):WebViewActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.webview.WebViewActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebViewActivityKt.WebViewScreen$lambda$17$2$0$0$0($showMenu$delegate);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$WebViewActivityKt.INSTANCE.getLambda$1583384251$app_debug(), $composer, 196614, 30);
            boolean zWebViewScreen$lambda$13 = WebViewScreen$lambda$13($showMenu$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1306199956, "CC(remember):WebViewActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.yhchat.canarys.ui.webview.WebViewActivityKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebViewActivityKt.WebViewScreen$lambda$17$2$0$1$0($showMenu$delegate);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.m2430DropdownMenuIlH_yew(zWebViewScreen$lambda$13, (Function0) objRememberedValue2, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(226168307, true, new Function3() { // from class: com.yhchat.canarys.ui.webview.WebViewActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return WebViewActivityKt.WebViewScreen$lambda$17$2$0$2($context, $showMenu$delegate, $webView$delegate, $isLoading$delegate, $currentUrl$delegate, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 48, 48, 2044);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit WebViewScreen$lambda$17$2$0$0$0(MutableState $showMenu$delegate) {
        WebViewScreen$lambda$14($showMenu$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit WebViewScreen$lambda$17$2$0$1$0(MutableState $showMenu$delegate) {
        WebViewScreen$lambda$14($showMenu$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit WebViewScreen$lambda$17$2$0$2(final Context $context, final MutableState $showMenu$delegate, final MutableState $webView$delegate, final MutableState $isLoading$delegate, final MutableState $currentUrl$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C149@4791L191,147@4684L606,165@5483L185,163@5374L602,181@6173L424,179@6061L855:WebViewActivity.kt#z68e9g");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(226168307, $changed, -1, "com.yhchat.canarys.ui.webview.WebViewScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WebViewActivity.kt:147)");
            }
            Function2<Composer, Integer, Unit> function2M11881getLambda$871109181$app_debug = ComposableSingletons$WebViewActivityKt.INSTANCE.m11881getLambda$871109181$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, -1695583662, "CC(remember):WebViewActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.webview.WebViewActivityKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebViewActivityKt.WebViewScreen$lambda$17$2$0$2$0$0($showMenu$delegate, $webView$delegate, $isLoading$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(function2M11881getLambda$871109181$app_debug, (Function0) objRememberedValue, null, ComposableSingletons$WebViewActivityKt.INSTANCE.getLambda$691218886$app_debug(), null, false, null, null, null, $composer, 3126, 500);
            Function2<Composer, Integer, Unit> lambda$967391354$app_debug = ComposableSingletons$WebViewActivityKt.INSTANCE.getLambda$967391354$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, -1695561524, "CC(remember):WebViewActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.webview.WebViewActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebViewActivityKt.WebViewScreen$lambda$17$2$0$2$1$0($showMenu$delegate, $webView$delegate, $isLoading$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(lambda$967391354$app_debug, (Function0) objRememberedValue2, null, ComposableSingletons$WebViewActivityKt.INSTANCE.m11882getLambda$873889859$app_debug(), null, false, null, null, null, $composer, 3126, 500);
            Function2<Composer, Integer, Unit> function2M11880getLambda$1694678213$app_debug = ComposableSingletons$WebViewActivityKt.INSTANCE.m11880getLambda$1694678213$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, -1695539205, "CC(remember):WebViewActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.webview.WebViewActivityKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebViewActivityKt.WebViewScreen$lambda$17$2$0$2$2$0($context, $showMenu$delegate, $currentUrl$delegate);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(function2M11880getLambda$1694678213$app_debug, (Function0) objRememberedValue3, null, ComposableSingletons$WebViewActivityKt.INSTANCE.getLambda$759007870$app_debug(), null, false, null, null, null, $composer, 3078, 500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit WebViewScreen$lambda$17$2$0$2$0$0(MutableState $showMenu$delegate, MutableState $webView$delegate, MutableState $isLoading$delegate) {
        WebViewScreen$lambda$14($showMenu$delegate, false);
        WebView webViewWebViewScreen$lambda$1 = WebViewScreen$lambda$1($webView$delegate);
        if (webViewWebViewScreen$lambda$1 != null) {
            webViewWebViewScreen$lambda$1.reload();
        }
        WebViewScreen$lambda$11($isLoading$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit WebViewScreen$lambda$17$2$0$2$1$0(MutableState $showMenu$delegate, MutableState $webView$delegate, MutableState $isLoading$delegate) {
        WebViewScreen$lambda$14($showMenu$delegate, false);
        WebView webViewWebViewScreen$lambda$1 = WebViewScreen$lambda$1($webView$delegate);
        if (webViewWebViewScreen$lambda$1 != null) {
            webViewWebViewScreen$lambda$1.stopLoading();
        }
        WebViewScreen$lambda$11($isLoading$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit WebViewScreen$lambda$17$2$0$2$2$0(Context $context, MutableState $showMenu$delegate, MutableState $currentUrl$delegate) {
        WebViewScreen$lambda$14($showMenu$delegate, false);
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(WebViewScreen$lambda$7($currentUrl$delegate)));
            $context.startActivity(intent);
        } catch (Exception e) {
        }
        return Unit.INSTANCE;
    }

    public static final WebView WebViewScreen$lambda$17$4$0(final MutableState $isLoading$delegate, final MutableState $currentUrl$delegate, final Map $requestHeaders, final MutableState $currentTitle$delegate, MutableState $webView$delegate, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        WebView webView = new WebView(context);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.getSettings().setMixedContentMode(0);
        webView.setWebViewClient(new WebViewClient() { // from class: com.yhchat.canarys.ui.webview.WebViewActivityKt$WebViewScreen$2$5$1$1$1
            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                WebViewActivityKt.WebViewScreen$lambda$11($isLoading$delegate, true);
                if (url == null) {
                    return;
                }
                $currentUrl$delegate.setValue(url);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                WebViewActivityKt.WebViewScreen$lambda$11($isLoading$delegate, false);
                if (url == null) {
                    return;
                }
                $currentUrl$delegate.setValue(url);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                Uri url;
                String nextUrl;
                if (request == null || (url = request.getUrl()) == null || (nextUrl = url.toString()) == null || $requestHeaders.isEmpty()) {
                    return false;
                }
                if (view != null) {
                    view.loadUrl(nextUrl, $requestHeaders);
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                WebViewActivityKt.WebViewScreen$lambda$11($isLoading$delegate, false);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
                super.onReceivedHttpError(view, request, errorResponse);
                WebViewActivityKt.WebViewScreen$lambda$11($isLoading$delegate, false);
            }
        });
        webView.setWebChromeClient(new WebChromeClient() { // from class: com.yhchat.canarys.ui.webview.WebViewActivityKt$WebViewScreen$2$5$1$1$2
            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                if (title == null) {
                    return;
                }
                $currentTitle$delegate.setValue(title);
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                WebViewActivityKt.WebViewScreen$lambda$11($isLoading$delegate, newProgress < 100);
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(PermissionRequest request) {
                if (request != null) {
                    request.grant(request.getResources());
                }
            }

            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                return true;
            }
        });
        $webView$delegate.setValue(webView);
        return webView;
    }

    public static final Unit WebViewScreen$lambda$17$5$0(Map $requestHeaders, String $url, MutableState $webView$delegate, WebView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        String url = view.getUrl();
        if (url == null || url.length() == 0) {
            if (!$requestHeaders.isEmpty()) {
                view.loadUrl($url, $requestHeaders);
            } else {
                view.loadUrl($url);
            }
        }
        $webView$delegate.setValue(view);
        return Unit.INSTANCE;
    }
}
