package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import androidx.compose.foundation.DarkThemeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import coil.ComponentRegistry;
import coil.ImageLoader;
import coil.decode.GifDecoder;
import coil.decode.ImageDecoderDecoder;
import io.noties.markwon.Markwon;
import io.noties.markwon.SoftBreakAddsNewLinePlugin;
import io.noties.markwon.ext.strikethrough.StrikethroughPlugin;
import io.noties.markwon.ext.tables.TablePlugin;
import io.noties.markwon.html.HtmlPlugin;
import io.noties.markwon.image.coil.CoilImagesPlugin;
import io.noties.markwon.linkify.LinkifyPlugin;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: MarkdownText.kt */
@Metadata(m168d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nH\u0007\u00a2\u0006\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, m169d2 = {"MarkdownText", "", "markdown", "", "modifier", "Landroidx/compose/ui/Modifier;", "textColor", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "onImageClick", "Lkotlin/Function1;", "MarkdownText-t6yy7ic", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class MarkdownTextKt {
    public static final Unit MarkdownText_t6yy7ic$lambda$3(String str, Modifier modifier, long j, long j2, Function1 function1, int i, int i2, Composer composer, int i3) {
        m11092MarkdownTextt6yy7ic(str, modifier, j, j2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: MarkdownText-t6yy7ic */
    public static final void m11092MarkdownTextt6yy7ic(final String markdown, Modifier modifier, long j, long j2, Function1<? super String, Unit> function1, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        long onSurface;
        long jM5092getTransparent0d7_KjU;
        Function1 onImageClick;
        Composer $composer2;
        final Modifier modifier3;
        final long j3;
        final long j4;
        final Function1 onImageClick2;
        Modifier modifier4;
        long j5;
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        Composer $composer3 = $composer.startRestartGroup(128664804);
        ComposerKt.sourceInformation($composer3, "C(MarkdownText)N(markdown,modifier,textColor:c#ui.graphics.Color,backgroundColor:c#ui.graphics.Color,onImageClick)48@1724L7,49@1754L21,53@1895L3788,129@5753L365,140@6137L2260,127@5693L2710:MarkdownText.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(markdown) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                onSurface = j;
                int i3 = $composer3.changed(onSurface) ? 256 : 128;
                $dirty |= i3;
            } else {
                onSurface = j;
            }
            $dirty |= i3;
        } else {
            onSurface = j;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            jM5092getTransparent0d7_KjU = j2;
        } else if (($changed & 3072) == 0) {
            jM5092getTransparent0d7_KjU = j2;
            $dirty |= $composer3.changed(jM5092getTransparent0d7_KjU) ? 2048 : 1024;
        } else {
            jM5092getTransparent0d7_KjU = j2;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty |= 24576;
            onImageClick = function1;
        } else if (($changed & 24576) == 0) {
            onImageClick = function1;
            $dirty |= $composer3.changedInstance(onImageClick) ? 16384 : 8192;
        } else {
            onImageClick = function1;
        }
        if ($composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "44@1573L11");
            if (($changed & 1) != 0 && !$composer3.getDefaultsInvalid()) {
                $composer3.skipToGroupEnd();
                if ((i & 4) != 0) {
                    $dirty &= -897;
                }
            } else {
                if (i2 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i & 4) != 0) {
                    $dirty &= -897;
                    onSurface = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurface();
                }
                if (i4 != 0) {
                    jM5092getTransparent0d7_KjU = Color.INSTANCE.m5092getTransparent0d7_KjU();
                }
                if (i5 != 0) {
                    onImageClick = null;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(128664804, $dirty, -1, "com.yhchat.canarys.ui.components.MarkdownText (MarkdownText.kt:47)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context = (Context) objConsume;
            boolean isDarkTheme = DarkThemeKt.isSystemInDarkTheme($composer3, 0);
            final int textColorInt = ColorKt.m5111toArgb8_81llA(onSurface);
            final int backgroundColorInt = ColorKt.m5111toArgb8_81llA(jM5092getTransparent0d7_KjU);
            ComposerKt.sourceInformationMarkerStart($composer3, -907157264, "CC(remember):MarkdownText.kt#9igjgp");
            int $dirty2 = $dirty;
            boolean zChanged = (($dirty & 57344) == 16384) | $composer3.changed(context) | $composer3.changed(isDarkTheme) | $composer3.changed(textColorInt);
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ImageLoader.Builder builder = new ImageLoader.Builder(context);
                ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
                modifier4 = modifier2;
                if (Build.VERSION.SDK_INT >= 28) {
                    j5 = onSurface;
                    builder2.add(new ImageDecoderDecoder.Factory(false, 1, null));
                } else {
                    j5 = onSurface;
                    builder2.add(new GifDecoder.Factory(false, 1, null));
                }
                objRememberedValue = Markwon.builder(context).usePlugin(SoftBreakAddsNewLinePlugin.create()).usePlugin(HtmlPlugin.create()).usePlugin(CoilImagesPlugin.create(context, builder.components(builder2.build()).okHttpClient(new Function0() { // from class: com.yhchat.canarys.ui.components.MarkdownTextKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MarkdownTextKt.MarkdownText_t6yy7ic$lambda$0$1();
                    }
                }).build())).usePlugin(new MarkdownTextKt$MarkdownText$markwon$1$1(onImageClick, context)).usePlugin(LinkifyPlugin.create()).usePlugin(StrikethroughPlugin.create()).usePlugin(TablePlugin.create(context)).build();
                $composer3.updateRememberedValue(objRememberedValue);
            } else {
                modifier4 = modifier2;
                j5 = onSurface;
            }
            final Markwon markwon = (Markwon) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Intrinsics.checkNotNull(markwon);
            ComposerKt.sourceInformationMarkerStart($composer3, -907037231, "CC(remember):MarkdownText.kt#9igjgp");
            boolean zChanged2 = $composer3.changed(textColorInt) | $composer3.changed(backgroundColorInt);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.components.MarkdownTextKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MarkdownTextKt.MarkdownText_t6yy7ic$lambda$1$0(textColorInt, backgroundColorInt, (Context) obj2);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            Function1 function12 = (Function1) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -907023048, "CC(remember):MarkdownText.kt#9igjgp");
            boolean zChanged3 = $composer3.changed(textColorInt) | $composer3.changed(backgroundColorInt) | $composer3.changedInstance(markwon) | (($dirty2 & 14) == 4) | (($dirty2 & 57344) == 16384);
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                final Function1 onImageClick3 = onImageClick;
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.components.MarkdownTextKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return MarkdownTextKt.MarkdownText_t6yy7ic$lambda$2$0(textColorInt, backgroundColorInt, markwon, markdown, onImageClick3, (TextView) obj3);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            AndroidView_androidKt.AndroidView(function12, modifier4, (Function1) objRememberedValue3, $composer3, $dirty2 & 112, 0);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j3 = j5;
            modifier3 = modifier4;
            j4 = jM5092getTransparent0d7_KjU;
            onImageClick2 = onImageClick;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            j3 = onSurface;
            j4 = jM5092getTransparent0d7_KjU;
            onImageClick2 = onImageClick;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.MarkdownTextKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return MarkdownTextKt.MarkdownText_t6yy7ic$lambda$3(markdown, modifier3, j3, j4, onImageClick2, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public static final OkHttpClient MarkdownText_t6yy7ic$lambda$0$1() {
        return new OkHttpClient.Builder().addInterceptor(new Interceptor() { // from class: com.yhchat.canarys.ui.components.MarkdownTextKt$MarkdownText_t6yy7ic$lambda$0$1$$inlined$-addInterceptor$1
            @Override // okhttp3.Interceptor
            public final Response intercept(Interceptor.Chain chain) {
                Intrinsics.checkNotNullParameter(chain, "chain");
                Request request = chain.request();
                if (StringsKt.contains$default((CharSequence) request.url().getUrl(), (CharSequence) ".jwznb.com/", false, 2, (Object) null)) {
                    return chain.proceed(request.newBuilder().addHeader("Referer", "https://myapp.jwznb.com").build());
                }
                return chain.proceed(request);
            }
        }).build();
    }

    public static final TextView MarkdownText_t6yy7ic$lambda$1$0(int $textColorInt, int $backgroundColorInt, Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        TextView textView = new TextView(ctx);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setTextColor($textColorInt);
        textView.setBackgroundColor($backgroundColorInt);
        textView.setTextSize(14.0f);
        textView.setPadding(0, 0, 0, 0);
        textView.setLinksClickable(true);
        return textView;
    }

    public static final Unit MarkdownText_t6yy7ic$lambda$2$0(int $textColorInt, int $backgroundColorInt, Markwon $markwon, String $markdown, final Function1 $onImageClick, TextView textView) {
        Spannable spannable;
        Spanned spanned;
        Intrinsics.checkNotNullParameter(textView, "textView");
        textView.setTextColor($textColorInt);
        textView.setBackgroundColor($backgroundColorInt);
        Spanned spanned2 = $markwon.toMarkdown($markdown);
        Intrinsics.checkNotNullExpressionValue(spanned2, "toMarkdown(...)");
        $markwon.setParsedMarkdown(textView, spanned2);
        if ($onImageClick != null) {
            CharSequence text = textView.getText();
            if (text instanceof Spanned) {
                if (text instanceof Spannable) {
                    spannable = (Spannable) text;
                } else {
                    spannable = new SpannableStringBuilder(text);
                }
                if (textView.getText() != spannable) {
                    textView.setText(spannable);
                }
                ImageSpan[] imageSpans = (ImageSpan[]) spannable.getSpans(0, spannable.length(), ImageSpan.class);
                Intrinsics.checkNotNull(imageSpans);
                int length = imageSpans.length;
                int i = 0;
                while (i < length) {
                    ImageSpan imageSpan = imageSpans[i];
                    int spanStart = spannable.getSpanStart(imageSpan);
                    int spanEnd = spannable.getSpanEnd(imageSpan);
                    final String source = imageSpan.getSource();
                    String str = source;
                    if (str == null || str.length() == 0) {
                        spanned = spanned2;
                    } else {
                        spanned = spanned2;
                        Object[] spans = spannable.getSpans(spanStart, spanEnd, ClickableSpan.class);
                        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
                        for (Object obj : spans) {
                            spannable.removeSpan((ClickableSpan) obj);
                        }
                        spannable.setSpan(new ClickableSpan() { // from class: com.yhchat.canarys.ui.components.MarkdownTextKt$MarkdownText$2$1$1$clickableSpan$1
                            @Override // android.text.style.ClickableSpan
                            public void onClick(View widget) {
                                Intrinsics.checkNotNullParameter(widget, "widget");
                                $onImageClick.invoke(source);
                            }

                            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                            public void updateDrawState(TextPaint ds) {
                                Intrinsics.checkNotNullParameter(ds, "ds");
                                super.updateDrawState(ds);
                                ds.setUnderlineText(false);
                            }
                        }, spanStart, spanEnd, 33);
                    }
                    i++;
                    spanned2 = spanned;
                }
                textView.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        return Unit.INSTANCE;
    }
}
