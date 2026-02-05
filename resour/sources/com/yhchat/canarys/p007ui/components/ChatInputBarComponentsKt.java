package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatInputBarComponents.kt */
@Metadata(m168d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001a\u00bb\u0001\u0010\t\u001a\u00020\u00012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u0016\u001a5\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010\u001c\u001a=\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007\u00a2\u0006\u0002\u0010 \u00a8\u0006!"}, m169d2 = {"QuotedMessageBar", "", "quotedText", "", "onClearQuote", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AttachmentMenu", "onImageClick", "onFileClick", "onCameraClick", "onVideoClick", "onTextClick", "onHtmlClick", "onMarkdownClick", "defaultMessageType", "", "onDefaultMessageTypeChange", "Lkotlin/Function1;", "selectedMessageType", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function1;ILandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "AttachmentMenuItem", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "label", "onClick", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MessageTypeMenuItem", "isSelected", "", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ChatInputBarComponentsKt {
    public static final Unit AttachmentMenu$lambda$1(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, int i, Function1 function1, int i2, Modifier modifier, int i3, int i4, int i5, Composer composer, int i6) {
        AttachmentMenu(function0, function02, function03, function04, function05, function06, function07, i, function1, i2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
        return Unit.INSTANCE;
    }

    public static final Unit AttachmentMenuItem$lambda$2(ImageVector imageVector, String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AttachmentMenuItem(imageVector, str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit MessageTypeMenuItem$lambda$2(ImageVector imageVector, String str, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MessageTypeMenuItem(imageVector, str, z, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit QuotedMessageBar$lambda$1(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuotedMessageBar(str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void QuotedMessageBar(final String quotedText, final Function0<Unit> onClearQuote, Modifier modifier, Composer $composer, final int $changed, final int $dirty) {
        Modifier modifier2;
        Modifier modifier3;
        Intrinsics.checkNotNullParameter(quotedText, "quotedText");
        Intrinsics.checkNotNullParameter(onClearQuote, "onClearQuote");
        Composer $composer2 = $composer.startRestartGroup(1443153464);
        ComposerKt.sourceInformation($composer2, "C(QuotedMessageBar)N(quotedText,onClearQuote,modifier)30@999L11,32@1102L1746,28@916L1932:ChatInputBarComponents.kt#2suaub");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changed(quotedText) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changedInstance(onClearQuote) ? 32 : 16;
        }
        int i = $dirty & 4;
        if (i != 0) {
            $dirty2 |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            Modifier.Companion modifier4 = i != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1443153464, $dirty2, -1, "com.yhchat.canarys.ui.components.QuotedMessageBar (ChatInputBarComponents.kt:27)");
            }
            modifier3 = modifier4;
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), RoundedCornerShapeKt.m1416RoundedCornerShapea9UjIt4$default(C1834Dp.m7806constructorimpl(20), C1834Dp.m7806constructorimpl(20), 0.0f, 0.0f, 12, null), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceVariant(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-928780781, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ChatInputBarComponentsKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatInputBarComponentsKt.QuotedMessageBar$lambda$0(onClearQuote, quotedText, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 12582912, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ChatInputBarComponentsKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatInputBarComponentsKt.QuotedMessageBar$lambda$1(quotedText, onClearQuote, modifier5, $changed, $dirty, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit QuotedMessageBar$lambda$0(kotlin.jvm.functions.Function0 r75, java.lang.String r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ChatInputBarComponentsKt.QuotedMessageBar$lambda$0(kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void AttachmentMenu(final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, int defaultMessageType, Function1<? super Integer, Unit> function1, int selectedMessageType, Modifier modifier, Composer $composer, final int $changed, final int $changed1, final int i) {
        Function0<Unit> function08;
        Function0<Unit> function09;
        Function0 function010;
        Function0 function011;
        int i2;
        int i3;
        int i4;
        Composer $composer2;
        final Function0 onMarkdownClick;
        final int defaultMessageType2;
        final int selectedMessageType2;
        final Modifier modifier2;
        final Function0 onVideoClick;
        final Function0 onTextClick;
        final Function0 onHtmlClick;
        final Function1 onDefaultMessageTypeChange;
        final Function0 onVideoClick2;
        int i5;
        final Function0 onTextClick2;
        final Function0 onHtmlClick2;
        int i6;
        final Function0 onMarkdownClick2;
        final int defaultMessageType3;
        final Function1 onDefaultMessageTypeChange2;
        final int selectedMessageType3;
        Modifier.Companion modifier3;
        Composer $composer3 = $composer.startRestartGroup(1668538832);
        ComposerKt.sourceInformation($composer3, "C(AttachmentMenu)N(onImageClick,onFileClick,onCameraClick,onVideoClick,onTextClick,onHtmlClick,onMarkdownClick,defaultMessageType,onDefaultMessageTypeChange,selectedMessageType,modifier)105@3394L38,107@3482L3689,103@3326L3845:ChatInputBarComponents.kt#2suaub");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) {
            function08 = function0;
            $dirty |= $composer3.changedInstance(function08) ? 4 : 2;
        } else {
            function08 = function0;
        }
        if (($changed & 48) == 0) {
            function09 = function02;
            $dirty |= $composer3.changedInstance(function09) ? 32 : 16;
        } else {
            function09 = function02;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function03) ? 256 : 128;
        }
        int i7 = i & 8;
        if (i7 != 0) {
            $dirty |= 3072;
            function010 = function04;
        } else if (($changed & 3072) == 0) {
            function010 = function04;
            $dirty |= $composer3.changedInstance(function010) ? 2048 : 1024;
        } else {
            function010 = function04;
        }
        int i8 = i & 16;
        if (i8 != 0) {
            $dirty |= 24576;
            function011 = function05;
        } else if (($changed & 24576) == 0) {
            function011 = function05;
            $dirty |= $composer3.changedInstance(function011) ? 16384 : 8192;
        } else {
            function011 = function05;
        }
        int i9 = i & 32;
        if (i9 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
        } else if (($changed & ProfileVerifier.CompilationStatus.f207xf2722a21) == 0) {
            $dirty |= $composer3.changedInstance(function06) ? 131072 : 65536;
        }
        int i10 = i & 64;
        if (i10 != 0) {
            $dirty |= 1572864;
        } else if (($changed & 1572864) == 0) {
            $dirty |= $composer3.changedInstance(function07) ? 1048576 : 524288;
        }
        int i11 = i & 128;
        if (i11 != 0) {
            $dirty |= 12582912;
        } else if (($changed & 12582912) == 0) {
            $dirty |= $composer3.changed(defaultMessageType) ? 8388608 : 4194304;
        }
        int i12 = i & 256;
        if (i12 != 0) {
            $dirty |= 100663296;
            i2 = i12;
        } else if (($changed & 100663296) == 0) {
            i2 = i12;
            $dirty |= $composer3.changedInstance(function1) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            i2 = i12;
        }
        int i13 = i & 512;
        if (i13 != 0) {
            $dirty |= 805306368;
            i3 = i13;
        } else if (($changed & 805306368) == 0) {
            i3 = i13;
            $dirty |= $composer3.changed(selectedMessageType) ? 536870912 : 268435456;
        } else {
            i3 = i13;
        }
        int i14 = i & 1024;
        if (i14 != 0) {
            $dirty1 |= 6;
            i4 = i14;
        } else if (($changed1 & 6) == 0) {
            i4 = i14;
            $dirty1 |= $composer3.changed(modifier) ? 4 : 2;
        } else {
            i4 = i14;
        }
        if ($composer3.shouldExecute((($dirty & 306783379) == 306783378 && ($dirty1 & 3) == 2) ? false : true, $dirty & 1)) {
            if (i7 != 0) {
                onVideoClick2 = null;
            } else {
                onVideoClick2 = function010;
            }
            if (i8 == 0) {
                i5 = i10;
                onTextClick2 = function011;
            } else {
                onTextClick2 = null;
                i5 = i10;
            }
            if (i9 == 0) {
                onHtmlClick2 = function06;
                i6 = 1668538832;
            } else {
                onHtmlClick2 = null;
                i6 = 1668538832;
            }
            if (i5 == 0) {
                onMarkdownClick2 = function07;
            } else {
                onMarkdownClick2 = null;
            }
            if (i11 == 0) {
                defaultMessageType3 = defaultMessageType;
            } else {
                defaultMessageType3 = 1;
            }
            if (i2 == 0) {
                onDefaultMessageTypeChange2 = function1;
            } else {
                onDefaultMessageTypeChange2 = null;
            }
            if (i3 == 0) {
                selectedMessageType3 = selectedMessageType;
            } else {
                selectedMessageType3 = 1;
            }
            if (i4 == 0) {
                modifier3 = modifier;
            } else {
                modifier3 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i6, $dirty, $dirty1, "com.yhchat.canarys.ui.components.AttachmentMenu (ChatInputBarComponents.kt:102)");
            }
            Modifier modifier4 = modifier3;
            final Function0<Unit> function012 = function08;
            final Function0<Unit> function013 = function09;
            CardKt.Card(modifier4, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(4), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1559471842, true, new Function3() { // from class: com.yhchat.canarys.ui.components.ChatInputBarComponentsKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatInputBarComponentsKt.AttachmentMenu$lambda$0(onTextClick2, onHtmlClick2, onMarkdownClick2, onDefaultMessageTypeChange2, function012, function03, onVideoClick2, function013, selectedMessageType3, defaultMessageType3, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, ($dirty1 & 14) | ProfileVerifier.CompilationStatus.f207xf2722a21, 20);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            onTextClick = onTextClick2;
            onHtmlClick = onHtmlClick2;
            onMarkdownClick = onMarkdownClick2;
            onDefaultMessageTypeChange = onDefaultMessageTypeChange2;
            onVideoClick = onVideoClick2;
            selectedMessageType2 = selectedMessageType3;
            defaultMessageType2 = defaultMessageType3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onMarkdownClick = function07;
            defaultMessageType2 = defaultMessageType;
            selectedMessageType2 = selectedMessageType;
            modifier2 = modifier;
            onVideoClick = function010;
            onTextClick = function011;
            onHtmlClick = function06;
            onDefaultMessageTypeChange = function1;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ChatInputBarComponentsKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatInputBarComponentsKt.AttachmentMenu$lambda$1(function0, function02, function03, onVideoClick, onTextClick, onHtmlClick, onMarkdownClick, defaultMessageType2, onDefaultMessageTypeChange, selectedMessageType2, modifier2, $changed, $changed1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0688  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0695  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0828  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x082b  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0853  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x088d  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x0914  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit AttachmentMenu$lambda$0(final kotlin.jvm.functions.Function0 r81, final kotlin.jvm.functions.Function0 r82, final kotlin.jvm.functions.Function0 r83, final kotlin.jvm.functions.Function1 r84, final kotlin.jvm.functions.Function0 r85, final kotlin.jvm.functions.Function0 r86, final kotlin.jvm.functions.Function0 r87, final kotlin.jvm.functions.Function0 r88, int r89, int r90, androidx.compose.foundation.layout.ColumnScope r91, androidx.compose.runtime.Composer r92, int r93) {
        /*
            Method dump skipped, instructions count: 2336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ChatInputBarComponentsKt.AttachmentMenu$lambda$0(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, int, int, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit AttachmentMenu$lambda$0$0$0$0$0(Function0 $onImageClick) {
        if ($onImageClick != null) {
            $onImageClick.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AttachmentMenu$lambda$0$0$0$1$0(Function0 $onCameraClick) {
        if ($onCameraClick != null) {
            $onCameraClick.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AttachmentMenu$lambda$0$0$0$2$0(Function0 $onVideoClick) {
        if ($onVideoClick != null) {
            $onVideoClick.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AttachmentMenu$lambda$0$0$0$3$0(Function0 $onFileClick) {
        if ($onFileClick != null) {
            $onFileClick.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AttachmentMenu$lambda$0$0$1$0$0(Function0 $onTextClick) {
        $onTextClick.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AttachmentMenu$lambda$0$0$1$1$0(Function0 $onHtmlClick) {
        $onHtmlClick.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AttachmentMenu$lambda$0$0$1$2$0(Function0 $onMarkdownClick) {
        $onMarkdownClick.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit AttachmentMenu$lambda$0$0$2$0$0(Function1 $onDefaultMessageTypeChange) {
        $onDefaultMessageTypeChange.invoke(1);
        return Unit.INSTANCE;
    }

    public static final Unit AttachmentMenu$lambda$0$0$2$1$0(Function1 $onDefaultMessageTypeChange) {
        $onDefaultMessageTypeChange.invoke(3);
        return Unit.INSTANCE;
    }

    public static final Unit AttachmentMenu$lambda$0$0$2$2$0(Function1 $onDefaultMessageTypeChange) {
        $onDefaultMessageTypeChange.invoke(8);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x041e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void AttachmentMenuItem(final androidx.compose.p000ui.graphics.vector.ImageVector r57, final java.lang.String r58, final kotlin.jvm.functions.Function0<kotlin.Unit> r59, androidx.compose.p000ui.Modifier r60, androidx.compose.runtime.Composer r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.ChatInputBarComponentsKt.AttachmentMenuItem(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit AttachmentMenuItem$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    public static final void MessageTypeMenuItem(final ImageVector icon, final String label, final boolean isSelected, final Function0<Unit> onClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Modifier modifier4;
        long jM5092getTransparent0d7_KjU;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer3 = $composer.startRestartGroup(-1791237793);
        ComposerKt.sourceInformation($composer3, "C(MessageTypeMenuItem)N(icon,label,isSelected,onClick,modifier)259@8460L13,266@8683L899,257@8400L1182:ChatInputBarComponents.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(icon) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(label) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(isSelected) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onClick) ? 2048 : 1024;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if (!$composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1791237793, $dirty, -1, "com.yhchat.canarys.ui.components.MessageTypeMenuItem (ChatInputBarComponents.kt:256)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 902373644, "CC(remember):ChatInputBarComponents.kt#9igjgp");
            boolean z = ($dirty & 7168) == 2048;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.ChatInputBarComponentsKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatInputBarComponentsKt.MessageTypeMenuItem$lambda$0$0(onClick);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifier5 = modifier4;
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(ClickableKt.m516clickableoSLSa3U$default(modifier4, false, null, null, null, (Function0) objRememberedValue, 15, null), C1834Dp.m7806constructorimpl(4));
            if (isSelected) {
                $composer3.startReplaceGroup(902377263);
                ComposerKt.sourceInformation($composer3, "262@8561L11");
                long primaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimaryContainer();
                $composer3.endReplaceGroup();
                jM5092getTransparent0d7_KjU = primaryContainer;
            } else {
                $composer3.startReplaceGroup(902378858);
                $composer3.endReplaceGroup();
                jM5092getTransparent0d7_KjU = Color.INSTANCE.m5092getTransparent0d7_KjU();
            }
            $composer2 = $composer3;
            SurfaceKt.m3209SurfaceT9BRK9s(modifierM1050padding3ABfNKs, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(8)), jM5092getTransparent0d7_KjU, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1909855012, true, new Function2() { // from class: com.yhchat.canarys.ui.components.ChatInputBarComponentsKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatInputBarComponentsKt.MessageTypeMenuItem$lambda$1(isSelected, icon, label, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, 12582912, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.ChatInputBarComponentsKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatInputBarComponentsKt.MessageTypeMenuItem$lambda$2(icon, label, isSelected, onClick, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit MessageTypeMenuItem$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit MessageTypeMenuItem$lambda$1(boolean $isSelected, ImageVector $icon, String $label, Composer $composer, int $changed) {
        long j;
        long j2;
        ComposerKt.sourceInformation($composer, "C267@8693L883:ChatInputBarComponents.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1909855012, $changed, -1, "com.yhchat.canarys.ui.components.MessageTypeMenuItem.<anonymous> (ChatInputBarComponents.kt:267)");
            }
            Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12), C1834Dp.m7806constructorimpl(8));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1051paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1411470760, "C271@8859L339,280@9211L39,283@9337L10,281@9263L303:ChatInputBarComponents.kt#2suaub");
            if ($isSelected) {
                $composer.startReplaceGroup(2032683482);
                ComposerKt.sourceInformation($composer, "275@9019L11");
                long onPrimaryContainer = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer();
                $composer.endReplaceGroup();
                j = onPrimaryContainer;
            } else {
                $composer.startReplaceGroup(2032686296);
                ComposerKt.sourceInformation($composer, "277@9107L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j = onSurfaceVariant;
            }
            IconKt.m2816Iconww6aTOc($icon, $label, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), j, $composer, 384, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium();
            if ($isSelected) {
                $composer.startReplaceGroup(2032696826);
                ComposerKt.sourceInformation($composer, "285@9436L11");
                long onPrimaryContainer2 = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer();
                $composer.endReplaceGroup();
                j2 = onPrimaryContainer2;
            } else {
                $composer.startReplaceGroup(2032699640);
                ComposerKt.sourceInformation($composer, "287@9524L11");
                long onSurfaceVariant2 = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j2 = onSurfaceVariant2;
            }
            TextKt.m3359Text4IGK_g($label, (Modifier) null, j2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelMedium, $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
