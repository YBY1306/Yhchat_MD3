package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import coil.compose.SingletonAsyncImageKt;
import coil.decode.SvgDecoder;
import coil.request.ImageRequest;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ExpressionText.kt */
@Metadata(m168d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002\u00a8\u0006\u000e"}, m169d2 = {"ExpressionText", "", "text", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "linkColor", "Landroidx/compose/ui/graphics/Color;", "ExpressionText-ww6aTOc", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;JLandroidx/compose/runtime/Composer;II)V", "normalizeExpressionAssetFileName", "fileName", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ExpressionTextKt {
    public static final Unit ExpressionText_ww6aTOc$lambda$6(String str, Modifier modifier, TextStyle textStyle, long j, int i, int i2, Composer composer, int i3) {
        m11055ExpressionTextww6aTOc(str, modifier, textStyle, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:288:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:355:? A[RETURN, SYNTHETIC] */
    /* renamed from: ExpressionText-ww6aTOc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m11055ExpressionTextww6aTOc(final java.lang.String r52, androidx.compose.p000ui.Modifier r53, androidx.compose.p000ui.text.TextStyle r54, long r55, androidx.compose.runtime.Composer r57, final int r58, final int r59) {
        /*
            Method dump skipped, instructions count: 1157
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ExpressionTextKt.m11055ExpressionTextww6aTOc(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit ExpressionText_ww6aTOc$lambda$3$0$0(String $match, Map $assetFileNameMap, String $name, String it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "CN(it)79@3512L7,78@3430L591:ExpressionText.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-239558277, $changed, -1, "com.yhchat.canarys.ui.components.ExpressionText.<anonymous>.<anonymous>.<anonymous> (ExpressionText.kt:76)");
            }
            String desiredFileName = $match + ".svg";
            String str = (String) $assetFileNameMap.get(normalizeExpressionAssetFileName(desiredFileName));
            if (str == null) {
                str = desiredFileName;
            }
            String mapped = str;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(new ImageRequest.Builder((Context) objConsume).data("file:///android_asset/fengtwemoji/" + Uri.encode(mapped)).decoderFactory(new SvgDecoder.Factory(false, 1, null)).crossfade(true).build(), $name, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getFit(), 0.0f, null, 0, false, null, $composer, 1573248, 0, 4024);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ExpressionText_ww6aTOc$lambda$5$0(MutableState $layoutResult, TextLayoutResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $layoutResult.setValue(it);
        return Unit.INSTANCE;
    }

    private static final String normalizeExpressionAssetFileName(String fileName) {
        return StringsKt.trim((CharSequence) new Regex("[\\u200B-\\u200D\\uFEFF\\uFE0E\\uFE0F]").replace(fileName, "")).toString();
    }
}
