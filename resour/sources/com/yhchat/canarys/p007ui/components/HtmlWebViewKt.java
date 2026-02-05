package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.view.ViewCompat;
import com.yhchat.canarys.utils.UnifiedLinkHandler;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: HtmlWebView.kt */
@Metadata(m168d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, m169d2 = {"HtmlWebView", "", "htmlContent", "", "modifier", "Landroidx/compose/ui/Modifier;", "onImageClick", "Lkotlin/Function1;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class HtmlWebViewKt {
    public static final Unit HtmlWebView$lambda$4(String str, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        HtmlWebView(str, modifier, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void HtmlWebView(final String htmlContent, Modifier modifier, Function1<? super String, Unit> function1, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Function1 function12;
        final Modifier modifier3;
        final Function1 onImageClick;
        Modifier.Companion modifier4;
        Function1 onImageClick2;
        int iM5111toArgb8_81llA;
        Function1 onImageClick3;
        int $dirty;
        int backgroundColor;
        Composer $composer2;
        String str;
        Modifier modifier5;
        final Function1 onImageClick4;
        Intrinsics.checkNotNullParameter(htmlContent, "htmlContent");
        Composer $composer3 = $composer.startRestartGroup(1494103400);
        ComposerKt.sourceInformation($composer3, "C(HtmlWebView)N(htmlContent,modifier,onImageClick)32@1083L7,33@1113L21,34@1175L11,35@1238L11,36@1303L11,43@1542L3446,131@5105L4035,217@9159L957,129@5030L5092,245@10201L79,245@10171L109:HtmlWebView.kt#2suaub");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(htmlContent) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty2 |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        int i3 = i & 4;
        if (i3 != 0) {
            $dirty2 |= 384;
            function12 = function1;
        } else if (($changed & 384) == 0) {
            function12 = function1;
            $dirty2 |= $composer3.changedInstance(function12) ? 256 : 128;
        } else {
            function12 = function1;
        }
        int $dirty3 = $dirty2;
        if (!$composer3.shouldExecute(($dirty3 & 147) != 146, $dirty3 & 1)) {
            $composer3.skipToGroupEnd();
            modifier3 = modifier2;
            onImageClick = function12;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i3 == 0) {
                onImageClick2 = function12;
            } else {
                onImageClick2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1494103400, $dirty3, -1, "com.yhchat.canarys.ui.components.HtmlWebView (HtmlWebView.kt:31)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            boolean isDarkTheme = DarkThemeKt.isSystemInDarkTheme($composer3, 0);
            int backgroundColor2 = ColorKt.m5111toArgb8_81llA(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface());
            int textColor = ColorKt.m5111toArgb8_81llA(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurface());
            int linkColor = ColorKt.m5111toArgb8_81llA(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary());
            if (isDarkTheme) {
                $composer3.startReplaceGroup(2088752345);
                ComposerKt.sourceInformation($composer3, "38@1403L11");
                iM5111toArgb8_81llA = ColorKt.m5111toArgb8_81llA(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceVariant());
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(2088822777);
                ComposerKt.sourceInformation($composer3, "40@1474L11");
                iM5111toArgb8_81llA = ColorKt.m5111toArgb8_81llA(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceVariant());
                $composer3.endReplaceGroup();
            }
            int codeBackgroundColor = iM5111toArgb8_81llA;
            ComposerKt.sourceInformationMarkerStart($composer3, 1314313694, "CC(remember):HtmlWebView.kt#9igjgp");
            boolean zChanged = (($dirty3 & 14) == 4) | $composer3.changed(backgroundColor2) | $composer3.changed(textColor) | $composer3.changed(linkColor) | $composer3.changed(codeBackgroundColor) | $composer3.changed(isDarkTheme);
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String str2 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(backgroundColor2 & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str3 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(textColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String str4 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(textColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
                String str5 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(textColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                StringCompanionObject stringCompanionObject5 = StringCompanionObject.INSTANCE;
                String str6 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(linkColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                StringCompanionObject stringCompanionObject6 = StringCompanionObject.INSTANCE;
                onImageClick3 = onImageClick2;
                String str7 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(codeBackgroundColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str7, "format(...)");
                StringCompanionObject stringCompanionObject7 = StringCompanionObject.INSTANCE;
                $dirty = $dirty3;
                String str8 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(textColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
                StringCompanionObject stringCompanionObject8 = StringCompanionObject.INSTANCE;
                backgroundColor = backgroundColor2;
                String str9 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(linkColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str9, "format(...)");
                StringCompanionObject stringCompanionObject9 = StringCompanionObject.INSTANCE;
                $composer2 = $composer3;
                String str10 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(textColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str10, "format(...)");
                StringCompanionObject stringCompanionObject10 = StringCompanionObject.INSTANCE;
                str = "CC(remember):HtmlWebView.kt#9igjgp";
                String str11 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(codeBackgroundColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str11, "format(...)");
                StringCompanionObject stringCompanionObject11 = StringCompanionObject.INSTANCE;
                modifier5 = modifier4;
                String str12 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(textColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str12, "format(...)");
                StringCompanionObject stringCompanionObject12 = StringCompanionObject.INSTANCE;
                String str13 = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(textColor & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str13, "format(...)");
                Object objTrimIndent = StringsKt.trimIndent("\n        <!DOCTYPE html>\n        <html>\n        <head>\n            <meta charset=\"UTF-8\">\n            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n            <style>\n                body {\n                    margin: 0;\n                    padding: 8px;\n                    background-color: " + str2 + ";\n                    color: " + str3 + " !important;\n                    font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, sans-serif;\n                    font-size: 14px;\n                    line-height: 1.4;\n                }\n                * {\n                    color: " + str4 + " !important;\n                }\n                p, div, span, h1, h2, h3, h4, h5, h6 {\n                    color: " + str5 + " !important;\n                }\n                img {\n                    max-width: 100%;\n                    height: auto;\n                    cursor: pointer;\n                }\n                a {\n                    color: " + str6 + " !important;\n                    text-decoration: none;\n                }\n                a:hover {\n                    text-decoration: underline;\n                }\n                pre, code {\n                    background-color: " + str7 + " !important;\n                    color: " + str8 + " !important;\n                    padding: 4px 8px;\n                    border-radius: 4px;\n                    font-family: 'Courier New', monospace;\n                }\n                blockquote {\n                    border-left: 4px solid " + str9 + ";\n                    margin: 8px 0;\n                    padding-left: 12px;\n                    color: " + str10 + " !important;\n                }\n                table {\n                    border-collapse: collapse;\n                    width: 100%;\n                }\n                th, td {\n                    border: 1px solid rgba(128, 128, 128, 0.3);\n                    padding: 8px;\n                    text-align: left;\n                }\n                th {\n                    background-color: " + str11 + " !important;\n                    color: " + str12 + " !important;\n                }\n                td {\n                    color: " + str13 + " !important;\n                }\n            </style>\n            <script>\n                // \u56fe\u7247\u70b9\u51fb\u5904\u7406\n                document.addEventListener('click', function(e) {\n                    if (e.target.tagName === 'IMG') {\n                        e.preventDefault();\n                        var imgSrc = e.target.src;\n                        if (window.ImageClickHandler) {\n                            window.ImageClickHandler.onImageClick(imgSrc);\n                        }\n                    }\n                }, true);\n            </script>\n        </head>\n        <body>\n            " + htmlContent + "\n        </body>\n        </html>\n        ");
                $composer3.updateRememberedValue(objTrimIndent);
                objRememberedValue = objTrimIndent;
            } else {
                modifier5 = modifier4;
                onImageClick3 = onImageClick2;
                $composer2 = $composer3;
                str = "CC(remember):HtmlWebView.kt#9igjgp";
                $dirty = $dirty3;
                backgroundColor = backgroundColor2;
            }
            final String styledHtml = (String) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifier6 = modifier5;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier6, 0.0f, 1, null);
            $composer3 = $composer2;
            String str14 = str;
            ComposerKt.sourceInformationMarkerStart($composer3, 1314428299, str14);
            final int backgroundColor3 = backgroundColor;
            int $dirty4 = $dirty;
            boolean zChanged2 = $composer3.changed(backgroundColor3) | (($dirty4 & 896) == 256);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                onImageClick4 = onImageClick3;
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.components.HtmlWebViewKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return HtmlWebViewKt.HtmlWebView$lambda$1$0(backgroundColor3, onImageClick4, (Context) obj2);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            } else {
                onImageClick4 = onImageClick3;
            }
            Function1 function13 = (Function1) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1314554949, str14);
            boolean zChanged3 = $composer3.changed(styledHtml);
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.components.HtmlWebViewKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return HtmlWebViewKt.HtmlWebView$lambda$2$0(styledHtml, (WebView) obj3);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            AndroidView_androidKt.AndroidView(function13, modifierFillMaxWidth$default, (Function1) objRememberedValue3, $composer3, 0, 0);
            ComposerKt.sourceInformationMarkerStart($composer3, 1314587415, str14);
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.components.HtmlWebViewKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return HtmlWebViewKt.HtmlWebView$lambda$3$0((DisposableEffectScope) obj4);
                    }
                };
                $composer3.updateRememberedValue(obj3);
                objRememberedValue4 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.DisposableEffect(htmlContent, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, $composer3, ($dirty4 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
            onImageClick = onImageClick4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.HtmlWebViewKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return HtmlWebViewKt.HtmlWebView$lambda$4(htmlContent, modifier3, onImageClick, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    public static final WebView HtmlWebView$lambda$1$0(int $backgroundColor, final Function1 $onImageClick, final Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        WebView webView = new WebView(ctx);
        webView.setLayerType(1, null);
        webView.setWebViewClient(new WebViewClient() { // from class: com.yhchat.canarys.ui.components.HtmlWebViewKt$HtmlWebView$1$1$1$1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url != null) {
                    Context context = ctx;
                    if (UnifiedLinkHandler.INSTANCE.isHandleableLink(url)) {
                        UnifiedLinkHandler.INSTANCE.handleLink(context, url);
                        return true;
                    }
                    return false;
                }
                return false;
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) throws IOException {
                Uri url;
                String url2;
                if (request == null || (url = request.getUrl()) == null || (url2 = url.toString()) == null) {
                    return super.shouldInterceptRequest(view, request);
                }
                if (StringsKt.startsWith$default(url2, "https://chat-img.jwznb.com", false, 2, (Object) null)) {
                    try {
                        URLConnection uRLConnectionOpenConnection = new URL(url2).openConnection();
                        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                        HttpURLConnection connection = (HttpURLConnection) uRLConnectionOpenConnection;
                        connection.setRequestProperty("Referer", "https://myapp.jwznb.com");
                        connection.connect();
                        String contentType = connection.getContentType();
                        String encoding = connection.getContentEncoding();
                        if (encoding == null) {
                            encoding = "UTF-8";
                        }
                        InputStream inputStream = connection.getInputStream();
                        return new WebResourceResponse(contentType, encoding, inputStream);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return super.shouldInterceptRequest(view, request);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        });
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setCacheMode(2);
        settings.setLoadsImagesAutomatically(true);
        settings.setBlockNetworkImage(false);
        settings.setMixedContentMode(1);
        settings.setOffscreenPreRaster(false);
        webView.setBackgroundColor($backgroundColor);
        if ($onImageClick != null) {
            webView.addJavascriptInterface(new Object() { // from class: com.yhchat.canarys.ui.components.HtmlWebViewKt$HtmlWebView$1$1$1$3
                @JavascriptInterface
                public final void onImageClick(String imageUrl) {
                    Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
                    $onImageClick.invoke(imageUrl);
                }
            }, "ImageClickHandler");
        }
        return webView;
    }

    public static final Unit HtmlWebView$lambda$2$0(String $styledHtml, final WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.loadDataWithBaseURL(null, $styledHtml, "text/html", "UTF-8", null);
        webView.post(new Runnable() { // from class: com.yhchat.canarys.ui.components.HtmlWebViewKt$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                webView.evaluateJavascript("(function() {\n    var body = document.body,\n        html = document.documentElement;\n    var height = Math.max(body.scrollHeight, body.offsetHeight,\n        html.clientHeight, html.scrollHeight, html.offsetHeight);\n    window.AndroidInterface && window.AndroidInterface.setHeight && window.AndroidInterface.setHeight(height);\n    return height;\n})();", null);
            }
        });
        return Unit.INSTANCE;
    }

    public static final DisposableEffectResult HtmlWebView$lambda$3$0(DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.yhchat.canarys.ui.components.HtmlWebViewKt$HtmlWebView$lambda$3$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
            }
        };
    }
}
