package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.widget.Toast;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material3.IconButtonDefaults;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorFilter;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.platform.CompositionLocalsKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.p000ui.unit.Density;
import androidx.compose.p000ui.window.AndroidDialog_androidKt;
import androidx.compose.p000ui.window.DialogProperties;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.content.FileProvider;
import androidx.core.location.LocationRequestCompat;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainterKt;
import coil.request.ImageRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p008io.ByteStreamsKt;
import kotlin.p008io.CloseableKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: ImageViewer.kt */
@Metadata(m168d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001a-\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001a-\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001a\u0018\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002\u00a8\u0006\u000f\u00b2\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, m169d2 = {"ImageViewer", "", "imageUrl", "", "onDismiss", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SimpleImageViewer", "AdvancedImageViewer", "downloadImageToGallery", "context", "Landroid/content/Context;", "shareImage", "app_debug", "scale", "", "offsetX", "offsetY", "rotation", "showControls", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ImageViewerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedImageViewer$lambda$16(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdvancedImageViewer(str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageViewer$lambda$13(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ImageViewer(str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleImageViewer$lambda$1(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SimpleImageViewer(str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void ImageViewer(final String imageUrl, final Function0<Unit> onDismiss, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Modifier modifier3;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(-617578001);
        ComposerKt.sourceInformation($composer2, "C(ImageViewer)N(imageUrl,onDismiss,modifier)57@1973L7,60@2027L36,61@2083L36,62@2139L36,63@2196L36,72@2488L6043,65@2242L6289:ImageViewer.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(imageUrl) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-617578001, $dirty2, -1, "com.yhchat.canarys.ui.components.ImageViewer (ImageViewer.kt:56)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, -786966029, "CC(remember):ImageViewer.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
                $composer2.updateRememberedValue(objMutableFloatStateOf);
                objRememberedValue = objMutableFloatStateOf;
            }
            final MutableFloatState scale$delegate = (MutableFloatState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -786964237, "CC(remember):ImageViewer.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer2.updateRememberedValue(objMutableFloatStateOf2);
                objRememberedValue2 = objMutableFloatStateOf2;
            }
            final MutableFloatState offsetX$delegate = (MutableFloatState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -786962445, "CC(remember):ImageViewer.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer2.updateRememberedValue(objMutableFloatStateOf3);
                objRememberedValue3 = objMutableFloatStateOf3;
            }
            final MutableFloatState offsetY$delegate = (MutableFloatState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -786960621, "CC(remember):ImageViewer.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer2.updateRememberedValue(objMutableFloatStateOf4);
                objRememberedValue4 = objMutableFloatStateOf4;
            }
            final MutableFloatState rotation$delegate = (MutableFloatState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifier5 = modifier4;
            AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-1759829050, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImageViewerKt.ImageViewer$lambda$12(modifier4, context, imageUrl, onDismiss, scale$delegate, offsetX$delegate, offsetY$delegate, rotation$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImageViewerKt.ImageViewer$lambda$13(imageUrl, onDismiss, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ImageViewer$lambda$1(MutableFloatState $scale$delegate) {
        return $scale$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ImageViewer$lambda$4(MutableFloatState $offsetX$delegate) {
        return $offsetX$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ImageViewer$lambda$7(MutableFloatState $offsetY$delegate) {
        return $offsetY$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ImageViewer$lambda$10(MutableFloatState $rotation$delegate) {
        return $rotation$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0527 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x059a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x062a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x06d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ImageViewer$lambda$12(androidx.compose.p000ui.Modifier r96, final android.content.Context r97, final java.lang.String r98, kotlin.jvm.functions.Function0 r99, final androidx.compose.runtime.MutableFloatState r100, androidx.compose.runtime.MutableFloatState r101, androidx.compose.runtime.MutableFloatState r102, androidx.compose.runtime.MutableFloatState r103, androidx.compose.runtime.Composer r104, int r105) {
        /*
            Method dump skipped, instructions count: 1945
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ImageViewerKt.ImageViewer$lambda$12(androidx.compose.ui.Modifier, android.content.Context, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageViewer$lambda$12$0$3$0$0$0(Context $context, String $imageUrl) {
        downloadImageToGallery($context, $imageUrl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageViewer$lambda$12$0$3$0$1$0(Context $context, String $imageUrl) {
        shareImage($context, $imageUrl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ImageViewer$lambda$12$0$4(MutableFloatState $scale$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C212@8372L10,213@8440L11,209@8159L324:ImageViewer.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-307144830, $changed, -1, "com.yhchat.canarys.ui.components.ImageViewer.<anonymous>.<anonymous>.<anonymous> (ImageViewer.kt:209)");
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(ImageViewer$lambda$1($scale$delegate))}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            TextKt.m3359Text4IGK_g("\u7f29\u653e: " + str + "x", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12), C1834Dp.m7806constructorimpl(6)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 48, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final void SimpleImageViewer(final String imageUrl, final Function0<Unit> onDismiss, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        final Modifier.Companion modifier3;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(797164893);
        ComposerKt.sourceInformation($composer2, "C(SimpleImageViewer)N(imageUrl,onDismiss,modifier)232@8744L7,241@8987L3629,234@8761L3855:ImageViewer.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(imageUrl) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
        } else if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(modifier) ? 256 : 128;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(797164893, $dirty2, -1, "com.yhchat.canarys.ui.components.SimpleImageViewer (ImageViewer.kt:231)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(true, true, false), ComposableLambdaKt.rememberComposableLambda(210594292, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImageViewerKt.SimpleImageViewer$lambda$0(modifier3, onDismiss, context, imageUrl, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImageViewerKt.SimpleImageViewer$lambda$1(imageUrl, onDismiss, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleImageViewer$lambda$0(Modifier $modifier, final Function0 $onDismiss, Context $context, String $imageUrl, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Composer composer;
        Function0 function04;
        ComposerKt.sourceInformation($composer, "C245@9107L11,246@9153L15,242@8997L3613:ImageViewer.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(210594292, $changed, -1, "com.yhchat.canarys.ui.components.SimpleImageViewer.<anonymous> (ImageViewer.kt:242)");
            }
            Modifier modifierM475backgroundbw27NRU$default = BackgroundKt.m475backgroundbw27NRU$default(SizeKt.fillMaxSize$default($modifier, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getScrim(), null, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 517657027, "CC(remember):ImageViewer.kt#9igjgp");
            boolean zChanged = $composer.changed($onDismiss);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ImageViewerKt.SimpleImageViewer$lambda$0$0$0($onDismiss);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(modifierM475backgroundbw27NRU$default, false, null, null, null, (Function0) objRememberedValue, 15, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM516clickableoSLSa3U$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function0 = constructor;
                $composer.createNode(function0);
            } else {
                function0 = constructor;
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
            int i3 = ((0 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 1804292101, "C249@9250L582,320@12301L11,321@12390L11,319@12226L203,314@12009L591:ImageViewer.kt#2suaub");
            ImageRequest.Builder builderData = new ImageRequest.Builder($context).data($imageUrl);
            if (StringsKt.contains$default((CharSequence) $imageUrl, (CharSequence) ".jwznb.com", false, 2, (Object) null)) {
                builderData.setHeader("Referer", "https://myapp.jwznb.com");
                builderData.setHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36");
            }
            AsyncImagePainter asyncImagePainterM8307rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainterKt.m8307rememberAsyncImagePainterEHKIwbg(builderData.crossfade(true).build(), null, null, null, 0, null, $composer, 0, 62);
            AsyncImagePainter.State state = asyncImagePainterM8307rememberAsyncImagePainterEHKIwbg.getState();
            if (state instanceof AsyncImagePainter.State.Loading) {
                $composer.startReplaceGroup(1804894988);
                ComposerKt.sourceInformation($composer, "266@9984L377");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function04 = constructor2;
                    $composer.createNode(function04);
                } else {
                    function04 = constructor2;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i6 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -611675148, "C271@10233L11,270@10156L183:ImageViewer.kt#2suaub");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0.0f, 0L, 0, $composer, 6, 28);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else if (state instanceof AsyncImagePainter.State.Error) {
                $composer.startReplaceGroup(1805407511);
                ComposerKt.sourceInformation($composer, "278@10482L1005");
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default2);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function02 = constructor3;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor3;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                    composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                    composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                }
                Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i8 = (i7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i9 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 662732215, "C282@10654L811:ImageViewer.kt#2suaub");
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, centerHorizontally, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int i10 = ((((432 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function03 = constructor4;
                    $composer.createNode(function03);
                } else {
                    function03 = constructor4;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM4376constructorimpl4.getInserting()) {
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i11 = (i10 >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i12 = ((432 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -230104424, "C289@11062L11,286@10875L299,294@11312L11,295@11389L10,292@11203L236:ImageViewer.kt#2suaub");
                    IconKt.m2816Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "\u52a0\u8f7d\u5931\u8d25", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getError(), composer2, 432, 0);
                    TextKt.m3359Text4IGK_g("\u56fe\u7247\u52a0\u8f7d\u5931\u8d25", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyLarge(), composer2, 6, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                } else {
                    composer = $composer;
                }
                composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i112 = (i10 >> 6) & 14;
                Composer composer22 = composer;
                ComposerKt.sourceInformationMarkerStart(composer22, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i122 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer22, -230104424, "C289@11062L11,286@10875L299,294@11312L11,295@11389L10,292@11203L236:ImageViewer.kt#2suaub");
                IconKt.m2816Iconww6aTOc(CloseKt.getClose(Icons.INSTANCE.getDefault()), "\u52a0\u8f7d\u5931\u8d25", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), MaterialTheme.INSTANCE.getColorScheme(composer22, MaterialTheme.$stable).getError(), composer22, 432, 0);
                TextKt.m3359Text4IGK_g("\u56fe\u7247\u52a0\u8f7d\u5931\u8d25", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer22, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer22, MaterialTheme.$stable).getBodyLarge(), composer22, 6, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1806476453);
                ComposerKt.sourceInformation($composer, "307@11837L15,302@11608L323");
                AsyncImagePainter asyncImagePainter = asyncImagePainterM8307rememberAsyncImagePainterEHKIwbg;
                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, -911548471, "CC(remember):ImageViewer.kt#9igjgp");
                boolean zChanged2 = $composer.changed($onDismiss);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ImageViewerKt.SimpleImageViewer$lambda$0$1$3$0($onDismiss);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ImageKt.Image(asyncImagePainter, "\u9884\u89c8\u56fe\u7247", ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxSize$default3, false, null, null, null, (Function0) objRememberedValue2, 15, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, $composer, 24624, LocationRequestCompat.QUALITY_LOW_POWER);
                $composer.endReplaceGroup();
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getTopEnd()), C1834Dp.m7806constructorimpl(16));
            IconButtonDefaults iconButtonDefaults = IconButtonDefaults.INSTANCE;
            long surface = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface();
            IconButtonKt.FilledIconButton($onDismiss, modifierM1050padding3ABfNKs, false, null, iconButtonDefaults.m2806filledIconButtonColorsro_MJ88(Color.m5055copywmQWz5c(surface, (14 & 1) != 0 ? Color.m5059getAlphaimpl(surface) : 0.9f, (14 & 2) != 0 ? Color.m5063getRedimpl(surface) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(surface) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(surface) : 0.0f), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), 0L, 0L, $composer, IconButtonDefaults.$stable << 12, 12), null, ComposableSingletons$ImageViewerKt.INSTANCE.getLambda$162453786$app_debug(), $composer, 1572864, 44);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleImageViewer$lambda$0$0$0(Function0 $onDismiss) {
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleImageViewer$lambda$0$1$3$0(Function0 $onDismiss) {
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    public static final void AdvancedImageViewer(final String imageUrl, final Function0<Unit> onDismiss, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Modifier modifier3;
        Modifier modifier4;
        Modifier modifier5;
        Context context;
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(71826541);
        ComposerKt.sourceInformation($composer2, "C(AdvancedImageViewer)N(imageUrl,onDismiss,modifier)343@12811L7,344@12850L7,347@12892L36,348@12948L36,349@13004L36,350@13061L36,353@13139L33,362@13409L7147,355@13182L7374:ImageViewer.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(imageUrl) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onDismiss) ? 32 : 16;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(71826541, $dirty2, -1, "com.yhchat.canarys.ui.components.AdvancedImageViewer (ImageViewer.kt:342)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Context context2 = (Context) objConsume;
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume2 = $composer2.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 305836369, "CC(remember):ImageViewer.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);
                $composer2.updateRememberedValue(objMutableFloatStateOf);
                objRememberedValue = objMutableFloatStateOf;
            }
            final MutableFloatState scale$delegate = (MutableFloatState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 305838161, "CC(remember):ImageViewer.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer2.updateRememberedValue(objMutableFloatStateOf2);
                objRememberedValue2 = objMutableFloatStateOf2;
            }
            final MutableFloatState offsetX$delegate = (MutableFloatState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 305839953, "CC(remember):ImageViewer.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer2.updateRememberedValue(objMutableFloatStateOf3);
                objRememberedValue3 = objMutableFloatStateOf3;
            }
            final MutableFloatState offsetY$delegate = (MutableFloatState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 305841777, "CC(remember):ImageViewer.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                $composer2.updateRememberedValue(objMutableFloatStateOf4);
                objRememberedValue4 = objMutableFloatStateOf4;
            }
            final MutableFloatState rotation$delegate = (MutableFloatState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 305844270, "CC(remember):ImageViewer.kt#9igjgp");
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                modifier5 = modifier4;
                context = context2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue5 = objMutableStateOf$default;
            } else {
                modifier5 = modifier4;
                context = context2;
            }
            final MutableState showControls$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Modifier modifier6 = modifier5;
            final Context context3 = context;
            AndroidDialog_androidKt.Dialog(onDismiss, new DialogProperties(true, false, false), ComposableLambdaKt.rememberComposableLambda(-981805244, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImageViewerKt.AdvancedImageViewer$lambda$15(modifier6, context3, imageUrl, scale$delegate, offsetX$delegate, offsetY$delegate, rotation$delegate, showControls$delegate, onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier6;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ImageViewerKt.AdvancedImageViewer$lambda$16(imageUrl, onDismiss, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AdvancedImageViewer$lambda$1(MutableFloatState $scale$delegate) {
        return $scale$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AdvancedImageViewer$lambda$4(MutableFloatState $offsetX$delegate) {
        return $offsetX$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AdvancedImageViewer$lambda$7(MutableFloatState $offsetY$delegate) {
        return $offsetY$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float AdvancedImageViewer$lambda$10(MutableFloatState $rotation$delegate) {
        return $rotation$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AdvancedImageViewer$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvancedImageViewer$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0355  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit AdvancedImageViewer$lambda$15(androidx.compose.p000ui.Modifier r73, android.content.Context r74, java.lang.String r75, final androidx.compose.runtime.MutableFloatState r76, final androidx.compose.runtime.MutableFloatState r77, final androidx.compose.runtime.MutableFloatState r78, final androidx.compose.runtime.MutableFloatState r79, androidx.compose.runtime.MutableState r80, final kotlin.jvm.functions.Function0 r81, androidx.compose.runtime.Composer r82, int r83) {
        /*
            Method dump skipped, instructions count: 863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ImageViewerKt.AdvancedImageViewer$lambda$15(androidx.compose.ui.Modifier, android.content.Context, java.lang.String, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableState, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedImageViewer$lambda$15$0$3(final Function0 $onDismiss, final MutableFloatState $scale$delegate, final MutableFloatState $offsetX$delegate, final MutableFloatState $offsetY$delegate, final MutableFloatState $rotation$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C444@17011L11,445@17094L6,446@17126L2411,440@16839L2698:ImageViewer.kt#2suaub");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665525410, $changed, -1, "com.yhchat.canarys.ui.components.AdvancedImageViewer.<anonymous>.<anonymous>.<anonymous> (ImageViewer.kt:440)");
        }
        Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
        long surface = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface();
        SurfaceKt.m3209SurfaceT9BRK9s(modifierM1050padding3ABfNKs, MaterialTheme.INSTANCE.getShapes($composer, MaterialTheme.$stable).getMedium(), Color.m5055copywmQWz5c(surface, (14 & 1) != 0 ? Color.m5059getAlphaimpl(surface) : 0.95f, (14 & 2) != 0 ? Color.m5063getRedimpl(surface) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(surface) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(surface) : 0.0f), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(208597693, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ImageViewerKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ImageViewerKt.AdvancedImageViewer$lambda$15$0$3$0($onDismiss, $scale$delegate, $offsetX$delegate, $offsetY$delegate, $rotation$delegate, (Composer) obj, ((Integer) obj2).intValue());
            }
        }, $composer, 54), $composer, 12582918, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit AdvancedImageViewer$lambda$15$0$3$0(kotlin.jvm.functions.Function0 r60, final androidx.compose.runtime.MutableFloatState r61, final androidx.compose.runtime.MutableFloatState r62, final androidx.compose.runtime.MutableFloatState r63, final androidx.compose.runtime.MutableFloatState r64, androidx.compose.runtime.Composer r65, int r66) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ImageViewerKt.AdvancedImageViewer$lambda$15$0$3$0(kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedImageViewer$lambda$15$0$3$0$0$0$0$0(MutableFloatState $scale$delegate, MutableFloatState $offsetX$delegate, MutableFloatState $offsetY$delegate, MutableFloatState $rotation$delegate) {
        $scale$delegate.setFloatValue(1.0f);
        $offsetX$delegate.setFloatValue(0.0f);
        $offsetY$delegate.setFloatValue(0.0f);
        $rotation$delegate.setFloatValue(0.0f);
        return Unit.INSTANCE;
    }

    /* compiled from: ImageViewer.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ImageViewerKt$downloadImageToGallery$1", m185f = "ImageViewer.kt", m186i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1}, m187l = {585, 590}, m188m = "invokeSuspend", m189n = {"picturesDir", "fileName", "targetFile", "baseName", "extension", "url", "connection", "mediaScanIntent", "counter", "e"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.ImageViewerKt$downloadImageToGallery$1 */
    static final class C36531 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $imageUrl;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36531(String str, Context context, Continuation<? super C36531> continuation) {
            super(2, continuation);
            this.$imageUrl = str;
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C36531(this.$imageUrl, this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v38, types: [T, java.io.File] */
        /* JADX WARN: Type inference failed for: r0v4, types: [T, java.io.File] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            String fileName;
            Throwable th;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
            } catch (Exception e) {
                e.printStackTrace();
                this.L$0 = SpillingKt.nullOutSpilledVariable(e);
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.label = 2;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(this.$context, e, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    File picturesDir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "\u4e91\u6e56");
                    if (!picturesDir.exists()) {
                        picturesDir.mkdirs();
                    }
                    String fileName2 = StringsKt.substringBefore$default(StringsKt.substringAfterLast(this.$imageUrl, "/", "image_" + System.currentTimeMillis() + ".jpg"), "?", (String) null, 2, (Object) null);
                    if (StringsKt.contains$default((CharSequence) fileName2, (CharSequence) ".", false, 2, (Object) null)) {
                        fileName = fileName2;
                    } else {
                        fileName = fileName2 + ".jpg";
                    }
                    Ref.ObjectRef targetFile = new Ref.ObjectRef();
                    targetFile.element = new File(picturesDir, fileName);
                    String baseName = StringsKt.substringBeforeLast$default(fileName, ".", (String) null, 2, (Object) null);
                    String extension = StringsKt.substringAfterLast(fileName, ".", "jpg");
                    int counter = 1;
                    while (((File) targetFile.element).exists()) {
                        targetFile.element = new File(picturesDir, baseName + "_" + counter + "." + extension);
                        counter++;
                    }
                    URL url = new URL(this.$imageUrl);
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection connection = (HttpURLConnection) uRLConnectionOpenConnection;
                    if (StringsKt.contains$default((CharSequence) this.$imageUrl, (CharSequence) ".jwznb.com", false, 2, (Object) null)) {
                        connection.setRequestProperty("Referer", "https://myapp.jwznb.com");
                        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36");
                    }
                    connection.connect();
                    FileOutputStream inputStream = connection.getInputStream();
                    try {
                        try {
                            InputStream inputStream2 = inputStream;
                            inputStream = new FileOutputStream((File) targetFile.element);
                            try {
                                Intrinsics.checkNotNull(inputStream2);
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                            try {
                                ByteStreamsKt.copyTo$default(inputStream2, inputStream, 0, 2, null);
                                CloseableKt.closeFinally(inputStream, null);
                                CloseableKt.closeFinally(inputStream, null);
                                Intent mediaScanIntent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                                mediaScanIntent.setData(Uri.fromFile((File) targetFile.element));
                                this.$context.sendBroadcast(mediaScanIntent);
                                this.L$0 = SpillingKt.nullOutSpilledVariable(picturesDir);
                                this.L$1 = SpillingKt.nullOutSpilledVariable(fileName);
                                this.L$2 = SpillingKt.nullOutSpilledVariable(targetFile);
                                this.L$3 = SpillingKt.nullOutSpilledVariable(baseName);
                                this.L$4 = SpillingKt.nullOutSpilledVariable(extension);
                                this.L$5 = SpillingKt.nullOutSpilledVariable(url);
                                this.L$6 = SpillingKt.nullOutSpilledVariable(connection);
                                this.L$7 = SpillingKt.nullOutSpilledVariable(mediaScanIntent);
                                this.I$0 = counter;
                                this.label = 1;
                                return BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$context, null), this) == coroutine_suspended ? coroutine_suspended : Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        throw th;
                    }
                case 1:
                    int i = this.I$0;
                    ResultKt.throwOnFailure($result);
                case 2:
                    ResultKt.throwOnFailure($result);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: ImageViewer.kt */
        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ImageViewerKt$downloadImageToGallery$1$2", m185f = "ImageViewer.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
        /* renamed from: com.yhchat.canarys.ui.components.ImageViewerKt$downloadImageToGallery$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Context context, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$context, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Toast.makeText(this.$context, "\u56fe\u7247\u5df2\u4fdd\u5b58\u5230\u76f8\u518c", 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ImageViewer.kt */
        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ImageViewerKt$downloadImageToGallery$1$3", m185f = "ImageViewer.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
        /* renamed from: com.yhchat.canarys.ui.components.ImageViewerKt$downloadImageToGallery$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $context;

            /* renamed from: $e */
            final /* synthetic */ Exception f699$e;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Context context, Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$context = context;
                this.f699$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$context, this.f699$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Toast.makeText(this.$context, "\u4fdd\u5b58\u5931\u8d25: " + this.f699$e.getMessage(), 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    private static final void downloadImageToGallery(Context context, String imageUrl) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C36531(imageUrl, context, null), 3, null);
    }

    /* compiled from: ImageViewer.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ImageViewerKt$shareImage$1", m185f = "ImageViewer.kt", m186i = {0, 0, 0, 0, 0, 0, 1}, m187l = {630, 644}, m188m = "invokeSuspend", m189n = {"cacheDir", "fileName", "tempFile", "url", "connection", "contentUri", "e"}, m191s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.ImageViewerKt$shareImage$1 */
    static final class C36541 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ String $imageUrl;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36541(Context context, String str, Continuation<? super C36541> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$imageUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C36541(this.$context, this.$imageUrl, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IOException {
            Throwable th;
            Throwable th2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
            } catch (Exception e) {
                e.printStackTrace();
                this.L$0 = SpillingKt.nullOutSpilledVariable(e);
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
                if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(this.$context, e, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    File cacheDir = this.$context.getCacheDir();
                    String fileName = "share_" + System.currentTimeMillis() + ".jpg";
                    File tempFile = new File(cacheDir, fileName);
                    URL url = new URL(this.$imageUrl);
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                    HttpURLConnection connection = (HttpURLConnection) uRLConnectionOpenConnection;
                    if (StringsKt.contains$default((CharSequence) this.$imageUrl, (CharSequence) ".jwznb.com", false, 2, (Object) null)) {
                        connection.setRequestProperty("Referer", "https://myapp.jwznb.com");
                        connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36");
                    }
                    connection.connect();
                    FileOutputStream inputStream = connection.getInputStream();
                    try {
                        try {
                            InputStream inputStream2 = inputStream;
                            inputStream = new FileOutputStream(tempFile);
                            try {
                                Intrinsics.checkNotNull(inputStream2);
                            } catch (Throwable th3) {
                                th2 = th3;
                            }
                            try {
                                ByteStreamsKt.copyTo$default(inputStream2, inputStream, 0, 2, null);
                                CloseableKt.closeFinally(inputStream, null);
                                CloseableKt.closeFinally(inputStream, null);
                                Uri contentUri = FileProvider.getUriForFile(this.$context, this.$context.getPackageName() + ".fileprovider", tempFile);
                                this.L$0 = SpillingKt.nullOutSpilledVariable(cacheDir);
                                this.L$1 = SpillingKt.nullOutSpilledVariable(fileName);
                                this.L$2 = SpillingKt.nullOutSpilledVariable(tempFile);
                                this.L$3 = SpillingKt.nullOutSpilledVariable(url);
                                this.L$4 = SpillingKt.nullOutSpilledVariable(connection);
                                this.L$5 = SpillingKt.nullOutSpilledVariable(contentUri);
                                this.label = 1;
                                return BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(this.$context, contentUri, null), this) == coroutine_suspended ? coroutine_suspended : Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        throw th;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                case 2:
                    ResultKt.throwOnFailure($result);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: ImageViewer.kt */
        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ImageViewerKt$shareImage$1$2", m185f = "ImageViewer.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
        /* renamed from: com.yhchat.canarys.ui.components.ImageViewerKt$shareImage$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Uri $contentUri;
            final /* synthetic */ Context $context;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Context context, Uri uri, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$context = context;
                this.$contentUri = uri;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$context, this.$contentUri, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Intent shareIntent = new Intent();
                        Uri uri = this.$contentUri;
                        shareIntent.setAction("android.intent.action.SEND");
                        shareIntent.putExtra("android.intent.extra.STREAM", uri);
                        shareIntent.setType("image/*");
                        shareIntent.addFlags(1);
                        Intent chooserIntent = Intent.createChooser(shareIntent, "\u5206\u4eab\u56fe\u7247");
                        this.$context.startActivity(chooserIntent);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: ImageViewer.kt */
        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ImageViewerKt$shareImage$1$3", m185f = "ImageViewer.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
        /* renamed from: com.yhchat.canarys.ui.components.ImageViewerKt$shareImage$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Context $context;

            /* renamed from: $e */
            final /* synthetic */ Exception f700$e;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Context context, Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$context = context;
                this.f700$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$context, this.f700$e, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Toast.makeText(this.$context, "\u5206\u4eab\u5931\u8d25: " + this.f700$e.getMessage(), 0).show();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    private static final void shareImage(Context context, String imageUrl) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new C36541(context, imageUrl, null), 3, null);
    }
}
