package com.yhchat.canarys.util;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: YunhuLinkHandler.kt */
@Metadata(m168d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a2\u0006\u0004\b\b\u0010\t\u00a8\u0006\n"}, m169d2 = {"ClickableLinkText", "", "text", "", "linkColor", "Landroidx/compose/ui/graphics/Color;", "onLinkClick", "Lkotlin/Function1;", "ClickableLinkText-3IgeMak", "(Ljava/lang/String;JLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes4.dex */
public final class YunhuLinkHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableLinkText_3IgeMak$lambda$3(String str, long j, Function1 function1, int i, int i2, Composer composer, int i3) {
        m11893ClickableLinkText3IgeMak(str, j, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableLinkText_3IgeMak$lambda$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: ClickableLinkText-3IgeMak, reason: not valid java name */
    public static final void m11893ClickableLinkText3IgeMak(final String text, long j, Function1<? super String, Unit> function1, Composer $composer, final int $changed, final int i) {
        long primary;
        Composer $composer2;
        final Function1 onLinkClick;
        final long j2;
        Function1 onLinkClick2;
        final long j3;
        int $dirty;
        long j4;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer $composer3 = $composer.startRestartGroup(-406044294);
        ComposerKt.sourceInformation($composer3, "C(ClickableLinkText)N(text,linkColor:c#ui.graphics.Color,onLinkClick)268@8566L7:YunhuLinkHandler.kt#j31hch");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changed(text) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            if ((i & 2) == 0) {
                primary = j;
                int i2 = $composer3.changed(primary) ? 32 : 16;
                $dirty2 |= i2;
            } else {
                primary = j;
            }
            $dirty2 |= i2;
        } else {
            primary = j;
        }
        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer3.startDefaults();
            ComposerKt.sourceInformation($composer3, "265@8471L11,266@8528L2");
            if (($changed & 1) != 0 && !$composer3.getDefaultsInvalid()) {
                $composer3.skipToGroupEnd();
                if ((i & 2) != 0) {
                    $dirty2 &= -113;
                }
                onLinkClick2 = function1;
                j3 = primary;
                $dirty = $dirty2;
            } else {
                if ((i & 2) != 0) {
                    primary = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary();
                    $dirty2 &= -113;
                }
                if ((i & 4) == 0) {
                    onLinkClick2 = function1;
                    j3 = primary;
                    $dirty = $dirty2;
                } else {
                    ComposerKt.sourceInformationMarkerStart($composer3, 633461724, "CC(remember):YunhuLinkHandler.kt#9igjgp");
                    Object objRememberedValue = $composer3.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function1() { // from class: com.yhchat.canarys.util.YunhuLinkHandlerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return YunhuLinkHandlerKt.ClickableLinkText_3IgeMak$lambda$0$0((String) obj2);
                            }
                        };
                        $composer3.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    Function1 onLinkClick3 = (Function1) objRememberedValue;
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    onLinkClick2 = onLinkClick3;
                    j3 = primary;
                    $dirty = $dirty2;
                }
            }
            $composer3.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-406044294, $dirty, -1, "com.yhchat.canarys.util.ClickableLinkText (YunhuLinkHandler.kt:267)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (YunhuLinkHandler.INSTANCE.containsYunhuLink(text)) {
                $composer3.startReplaceGroup(-1837382821);
                ComposerKt.sourceInformation($composer3, "274@8767L270,283@9060L195,273@8732L533");
                ComposerKt.sourceInformationMarkerStart($composer3, 633469640, "CC(remember):YunhuLinkHandler.kt#9igjgp");
                boolean z = (($dirty & 14) == 4) | (((($dirty & 112) ^ 48) > 32 && $composer3.changed(j3)) || ($dirty & 48) == 32);
                Object objRememberedValue2 = $composer3.rememberedValue();
                if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.yhchat.canarys.util.YunhuLinkHandlerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return YunhuLinkHandlerKt.ClickableLinkText_3IgeMak$lambda$1$0(text, j3, (Context) obj3);
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                Function1 function12 = (Function1) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerStart($composer3, 633478941, "CC(remember):YunhuLinkHandler.kt#9igjgp");
                boolean z2 = (($dirty & 14) == 4) | (((($dirty & 112) ^ 48) > 32 && $composer3.changed(j3)) || ($dirty & 48) == 32);
                Object objRememberedValue3 = $composer3.rememberedValue();
                if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function1() { // from class: com.yhchat.canarys.util.YunhuLinkHandlerKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            return YunhuLinkHandlerKt.ClickableLinkText_3IgeMak$lambda$2$0(text, j3, (TextView) obj4);
                        }
                    };
                    $composer3.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer3);
                AndroidView_androidKt.AndroidView(function12, null, (Function1) objRememberedValue3, $composer3, 0, 2);
                $composer3.endReplaceGroup();
                $composer2 = $composer3;
                j4 = j3;
            } else {
                $composer3.startReplaceGroup(-1836777732);
                ComposerKt.sourceInformation($composer3, "293@9330L17");
                $composer2 = $composer3;
                j4 = j3;
                TextKt.m3359Text4IGK_g(text, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, $dirty & 14, 0, 131070);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onLinkClick = onLinkClick2;
            j2 = j4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onLinkClick = function1;
            j2 = primary;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.util.YunhuLinkHandlerKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return YunhuLinkHandlerKt.ClickableLinkText_3IgeMak$lambda$3(text, j2, onLinkClick, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView ClickableLinkText_3IgeMak$lambda$1$0(String $text, long j, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        TextView textView = new TextView(context);
        YunhuLinkHandler.INSTANCE.makeLinksClickable(textView, $text, ColorKt.m5111toArgb8_81llA(j));
        return textView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ClickableLinkText_3IgeMak$lambda$2$0(String $text, long j, TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        YunhuLinkHandler.INSTANCE.makeLinksClickable(textView, $text, ColorKt.m5111toArgb8_81llA(j));
        return Unit.INSTANCE;
    }
}
