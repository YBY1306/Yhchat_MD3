package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import androidx.compose.foundation.text.ClickableTextKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shadow;
import androidx.compose.p000ui.graphics.drawscope.DrawStyle;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.AnnotatedString;
import androidx.compose.p000ui.text.PlatformSpanStyle;
import androidx.compose.p000ui.text.SpanStyle;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontSynthesis;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.intl.LocaleList;
import androidx.compose.p000ui.text.style.BaselineShift;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import com.yhchat.canarys.p007ui.webview.WebViewActivity;
import com.yhchat.canarys.utils.UnifiedLinkHandler;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinkText.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, m169d2 = {"LinkText", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "linkColor", "Landroidx/compose/ui/graphics/Color;", "LinkText-ww6aTOc", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/runtime/Composer;II)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class LinkTextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkText_ww6aTOc$lambda$2(String str, Modifier modifier, TextStyle textStyle, long j, int i, int i2, Composer composer, int i3) {
        m11091LinkTextww6aTOc(str, modifier, textStyle, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: LinkText-ww6aTOc, reason: not valid java name */
    public static final void m11091LinkTextww6aTOc(final String text, Modifier modifier, TextStyle style, long j, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        TextStyle textStyle;
        long j2;
        final Modifier modifier3;
        final long j3;
        final TextStyle style2;
        TextStyle style3;
        long primary;
        Modifier modifier4;
        TextStyle style4;
        AnnotatedString.Builder builder;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer2 = $composer.startRestartGroup(1594508730);
        ComposerKt.sourceInformation($composer2, "C(LinkText)N(text,modifier,style,linkColor:c#ui.graphics.Color)27@949L7,75@2318L647,71@2201L770:LinkText.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(text) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            modifier2 = modifier;
        } else if (($changed & 48) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 384) == 0) {
            if ((i & 4) == 0) {
                textStyle = style;
                int i3 = $composer2.changed(textStyle) ? 256 : 128;
                $dirty |= i3;
            } else {
                textStyle = style;
            }
            $dirty |= i3;
        } else {
            textStyle = style;
        }
        if (($changed & 3072) == 0) {
            if ((i & 8) == 0) {
                j2 = j;
                int i4 = $composer2.changed(j2) ? 2048 : 1024;
                $dirty |= i4;
            } else {
                j2 = j;
            }
            $dirty |= i4;
        } else {
            j2 = j;
        }
        int i5 = 0;
        int i6 = 1;
        if ($composer2.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "24@834L10,25@894L11");
            if (($changed & 1) == 0 || $composer2.getDefaultsInvalid()) {
                Modifier.Companion modifier5 = i2 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i & 4) != 0) {
                    style3 = MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium();
                    $dirty &= -897;
                } else {
                    style3 = textStyle;
                }
                if ((i & 8) != 0) {
                    $dirty &= -7169;
                    style4 = style3;
                    primary = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary();
                    modifier4 = modifier5;
                } else {
                    primary = j2;
                    modifier4 = modifier5;
                    style4 = style3;
                }
            } else {
                $composer2.skipToGroupEnd();
                if ((i & 4) != 0) {
                    $dirty &= -897;
                }
                if ((i & 8) != 0) {
                    $dirty &= -7169;
                }
                primary = j2;
                modifier4 = modifier2;
                style4 = textStyle;
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1594508730, $dirty, -1, "com.yhchat.canarys.ui.components.LinkText (LinkText.kt:26)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            Pattern urlPattern = Pattern.compile("(https?://[^\\s\\u4e00-\\u9fff]+|yunhu://[^\\s\\u4e00-\\u9fff]*)", 2);
            int i7 = 0;
            AnnotatedString.Builder builder2 = new AnnotatedString.Builder(i5, i6, null);
            Matcher matcher = urlPattern.matcher(text);
            int i8 = 0;
            while (matcher.find()) {
                int iStart = matcher.start();
                int iEnd = matcher.end();
                Pattern urlPattern2 = urlPattern;
                String strGroup = matcher.group();
                if (iStart > i8) {
                    builder = builder2;
                    String strSubstring = text.substring(i8, iStart);
                    Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                    builder2.append(strSubstring);
                } else {
                    builder = builder2;
                }
                Intrinsics.checkNotNull(strGroup);
                builder2.pushStringAnnotation("URL", strGroup);
                long j4 = primary;
                int i9 = i7;
                int iPushStyle = builder2.pushStyle(new SpanStyle(primary, 0L, FontWeight.INSTANCE.getMedium(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61434, (DefaultConstructorMarker) null));
                try {
                    builder2.append(strGroup);
                    Unit unit = Unit.INSTANCE;
                    builder2.pop(iPushStyle);
                    builder2.pop();
                    i8 = iEnd;
                    urlPattern = urlPattern2;
                    builder2 = builder;
                    i7 = i9;
                    primary = j4;
                } catch (Throwable th) {
                    builder2.pop(iPushStyle);
                    throw th;
                }
            }
            AnnotatedString.Builder builder3 = builder2;
            long j5 = primary;
            if (i8 < text.length()) {
                String strSubstring2 = text.substring(i8);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                builder2.append(strSubstring2);
            }
            final AnnotatedString annotatedString = builder3.toAnnotatedString();
            ComposerKt.sourceInformationMarkerStart($composer2, -980383679, "CC(remember):LinkText.kt#9igjgp");
            boolean zChanged = $composer2.changed(annotatedString) | $composer2.changedInstance(context);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.components.LinkTextKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return LinkTextKt.LinkText_ww6aTOc$lambda$1$0(annotatedString, context, ((Integer) obj2).intValue());
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ClickableTextKt.m1458ClickableText4YKlhWE(annotatedString, modifier4, style4, false, 0, 0, null, (Function1) objRememberedValue, $composer2, ($dirty & 112) | ($dirty & 896), 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            style2 = style4;
            j3 = j5;
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
            j3 = j2;
            style2 = textStyle;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.LinkTextKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return LinkTextKt.LinkText_ww6aTOc$lambda$2(text, modifier3, style2, j3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkText_ww6aTOc$lambda$1$0(AnnotatedString $annotatedString, Context $context, int offset) {
        AnnotatedString.Range range = (AnnotatedString.Range) CollectionsKt.firstOrNull((List) $annotatedString.getStringAnnotations("URL", offset, offset));
        if (range != null) {
            String str = (String) range.getItem();
            if (UnifiedLinkHandler.INSTANCE.isHandleableLink(str)) {
                UnifiedLinkHandler.INSTANCE.handleLink($context, str);
            } else {
                WebViewActivity.Companion.start$default(WebViewActivity.INSTANCE, $context, str, null, null, 12, null);
            }
        }
        return Unit.INSTANCE;
    }
}
