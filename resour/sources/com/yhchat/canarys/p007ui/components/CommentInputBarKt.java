package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SendKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.input.ImeAction;
import androidx.compose.p000ui.text.input.KeyboardType;
import androidx.compose.p000ui.text.input.PlatformImeOptions;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.text.intl.LocaleList;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CommentInputBar.kt */
@Metadata(m168d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u001ay\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0002\u0010\u0010\u001ay\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0012"}, m169d2 = {"CommentInputBar", "", "commentText", "", "onCommentTextChange", "Lkotlin/Function1;", "onSendComment", "modifier", "Landroidx/compose/ui/Modifier;", "placeholder", "isVisible", "", "isEnabled", "maxLines", "", "minLines", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZZIILandroidx/compose/runtime/Composer;II)V", "BottomCommentInputBar", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class CommentInputBarKt {
    public static final Unit BottomCommentInputBar$lambda$1(String str, Function1 function1, Function1 function12, Modifier modifier, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, Composer composer, int i5) {
        BottomCommentInputBar(str, function1, function12, modifier, str2, z, z2, i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    public static final Unit CommentInputBar$lambda$1(String str, Function1 function1, Function1 function12, Modifier modifier, String str2, boolean z, boolean z2, int i, int i2, int i3, int i4, Composer composer, int i5) {
        CommentInputBar(str, function1, function12, modifier, str2, z, z2, i, i2, composer, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    public static final void CommentInputBar(final String commentText, final Function1<? super String, Unit> onCommentTextChange, final Function1<? super String, Unit> onSendComment, Modifier modifier, String placeholder, boolean isVisible, boolean isEnabled, int maxLines, int minLines, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        String placeholder2;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        Composer $composer2;
        final int maxLines2;
        final Modifier modifier3;
        final String placeholder3;
        final boolean isVisible2;
        final boolean isEnabled2;
        final int minLines2;
        Modifier.Companion modifier4;
        boolean isVisible3;
        boolean isEnabled3;
        final int maxLines3;
        final int minLines3;
        Modifier modifier5;
        boolean isEnabled4;
        int maxLines4;
        int minLines4;
        String placeholder4;
        Intrinsics.checkNotNullParameter(commentText, "commentText");
        Intrinsics.checkNotNullParameter(onCommentTextChange, "onCommentTextChange");
        Intrinsics.checkNotNullParameter(onSendComment, "onSendComment");
        Composer $composer3 = $composer.startRestartGroup(661809416);
        ComposerKt.sourceInformation($composer3, "C(CommentInputBar)N(commentText,onCommentTextChange,onSendComment,modifier,placeholder,isVisible,isEnabled,maxLines,minLines):CommentInputBar.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(commentText) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onCommentTextChange) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onSendComment) ? 256 : 128;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty |= 24576;
            placeholder2 = placeholder;
        } else if (($changed & 24576) == 0) {
            placeholder2 = placeholder;
            $dirty |= $composer3.changed(placeholder2) ? 16384 : 8192;
        } else {
            placeholder2 = placeholder;
        }
        int i6 = i & 32;
        if (i6 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            z = isVisible;
        } else if ((196608 & $changed) == 0) {
            z = isVisible;
            $dirty |= $composer3.changed(z) ? 131072 : 65536;
        } else {
            z = isVisible;
        }
        int i7 = i & 64;
        if (i7 != 0) {
            $dirty |= 1572864;
            z2 = isEnabled;
        } else if ((1572864 & $changed) == 0) {
            z2 = isEnabled;
            $dirty |= $composer3.changed(z2) ? 1048576 : 524288;
        } else {
            z2 = isEnabled;
        }
        int i8 = i & 128;
        if (i8 != 0) {
            $dirty |= 12582912;
            i2 = i8;
        } else if (($changed & 12582912) == 0) {
            i2 = i8;
            $dirty |= $composer3.changed(maxLines) ? 8388608 : 4194304;
        } else {
            i2 = i8;
        }
        int i9 = i & 256;
        if (i9 != 0) {
            $dirty |= 100663296;
            i3 = i9;
        } else if (($changed & 100663296) == 0) {
            i3 = i9;
            $dirty |= $composer3.changed(minLines) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            i3 = i9;
        }
        if ($composer3.shouldExecute(($dirty & 38347923) != 38347922, $dirty & 1)) {
            if (i4 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i5 != 0) {
                placeholder2 = "\u5199\u4e0b\u4f60\u7684\u8bc4\u8bba...";
            }
            if (i6 == 0) {
                isVisible3 = z;
            } else {
                isVisible3 = true;
            }
            if (i7 == 0) {
                isEnabled3 = z2;
            } else {
                isEnabled3 = true;
            }
            if (i2 == 0) {
                maxLines3 = maxLines;
            } else {
                maxLines3 = 5;
            }
            if (i3 == 0) {
                minLines3 = minLines;
            } else {
                minLines3 = 1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(661809416, $dirty, -1, "com.yhchat.canarys.ui.components.CommentInputBar (CommentInputBar.kt:30)");
            }
            if (isVisible3) {
                $composer3.startReplaceGroup(2064832401);
                ComposerKt.sourceInformation($composer3, "34@1060L38,36@1193L11,35@1134L92,38@1237L2045,32@969L2313");
                final String placeholder5 = placeholder2;
                modifier5 = modifier4;
                final boolean isEnabled5 = isEnabled3;
                isEnabled4 = isEnabled5;
                maxLines4 = maxLines3;
                minLines4 = minLines3;
                placeholder4 = placeholder5;
                CardKt.Card(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(8), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-1924477029, true, new Function3() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return CommentInputBarKt.CommentInputBar$lambda$0(commentText, onSendComment, onCommentTextChange, isEnabled5, maxLines3, minLines3, placeholder5, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 18);
                $composer2 = $composer3;
            } else {
                modifier5 = modifier4;
                isEnabled4 = isEnabled3;
                maxLines4 = maxLines3;
                minLines4 = minLines3;
                $composer2 = $composer3;
                placeholder4 = placeholder2;
                $composer2.startReplaceGroup(2063798458);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isEnabled2 = isEnabled4;
            modifier3 = modifier5;
            maxLines2 = maxLines4;
            minLines2 = minLines4;
            placeholder3 = placeholder4;
            isVisible2 = isVisible3;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            maxLines2 = maxLines;
            modifier3 = modifier2;
            placeholder3 = placeholder2;
            isVisible2 = z;
            isEnabled2 = z2;
            minLines2 = minLines;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommentInputBarKt.CommentInputBar$lambda$1(commentText, onCommentTextChange, onSendComment, modifier3, placeholder3, isVisible2, isEnabled2, maxLines2, minLines2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit CommentInputBar$lambda$0(final String $commentText, final Function1 $onSendComment, Function1 $onCommentTextChange, final boolean $isEnabled, int $maxLines, int $minLines, final String $placeholder, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C39@1251L2021:CommentInputBar.kt#2suaub");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1924477029, $changed, -1, "com.yhchat.canarys.ui.components.CommentInputBar.<anonymous> (CommentInputBar.kt:39)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), bottom, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
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
            int i3 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1683687268, "C58@2074L255,49@1653L21,45@1450L919,67@2403L39,70@2518L235,77@2841L417,69@2476L782:CommentInputBar.kt#2suaub");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m7483getTextPjHm6EE(), ImeAction.INSTANCE.m7429getSendeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            ComposerKt.sourceInformationMarkerStart($composer, -469936074, "CC(remember):CommentInputBar.kt#9igjgp");
            boolean zChanged = $composer.changed($commentText) | $composer.changed($onSendComment);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CommentInputBarKt.CommentInputBar$lambda$0$0$0$0($commentText, $onSendComment, (KeyboardActionScope) obj);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField($commentText, (Function1<? super String, Unit>) $onCommentTextChange, modifierWeight$default, $isEnabled, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-606907234, true, new Function2() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommentInputBarKt.CommentInputBar$lambda$0$0$1($placeholder, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions, new KeyboardActions(null, null, null, null, null, (Function1) objRememberedValue, 31, null), false, $maxLines, $minLines, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 12582912, 0, 0, 7503728);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, -469921886, "CC(remember):CommentInputBar.kt#9igjgp");
            boolean zChanged2 = $composer.changed($commentText) | $composer.changed($onSendComment);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommentInputBarKt.CommentInputBar$lambda$0$0$2$0($commentText, $onSendComment);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            Function0 function0 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton(function0, null, !StringsKt.isBlank($commentText) && $isEnabled, null, null, ComposableLambdaKt.rememberComposableLambda(2055064570, true, new Function2() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return CommentInputBarKt.CommentInputBar$lambda$0$0$3($commentText, $isEnabled, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
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

    public static final Unit CommentInputBar$lambda$0$0$1(String $placeholder, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C49@1655L17:CommentInputBar.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-606907234, $changed, -1, "com.yhchat.canarys.ui.components.CommentInputBar.<anonymous>.<anonymous>.<anonymous> (CommentInputBar.kt:49)");
            }
            TextKt.m3359Text4IGK_g($placeholder, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit CommentInputBar$lambda$0$0$0$0(String $commentText, Function1 $onSendComment, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        if (!StringsKt.isBlank($commentText)) {
            String processedContent = StringsKt.trim((CharSequence) $commentText).toString();
            $onSendComment.invoke(processedContent);
        }
        return Unit.INSTANCE;
    }

    public static final Unit CommentInputBar$lambda$0$0$2$0(String $commentText, Function1 $onSendComment) {
        if (!StringsKt.isBlank($commentText)) {
            String processedContent = StringsKt.trim((CharSequence) $commentText).toString();
            $onSendComment.invoke(processedContent);
        }
        return Unit.INSTANCE;
    }

    public static final Unit CommentInputBar$lambda$0$0$3(String $commentText, boolean $isEnabled, Composer $composer, int $changed) {
        long j;
        ComposerKt.sourceInformation($composer, "C78@2863L377:CommentInputBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2055064570, $changed, -1, "com.yhchat.canarys.ui.components.CommentInputBar.<anonymous>.<anonymous>.<anonymous> (CommentInputBar.kt:78)");
            }
            ImageVector send = SendKt.getSend(Icons.INSTANCE.getDefault());
            if (!StringsKt.isBlank($commentText) && $isEnabled) {
                $composer.startReplaceGroup(-767895807);
                ComposerKt.sourceInformation($composer, "82@3097L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j = primary;
            } else {
                $composer.startReplaceGroup(-767892822);
                ComposerKt.sourceInformation($composer, "84@3190L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j = onSurfaceVariant;
            }
            IconKt.m2816Iconww6aTOc(send, "\u53d1\u9001\u8bc4\u8bba", (Modifier) null, j, $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void BottomCommentInputBar(final String commentText, final Function1<? super String, Unit> onCommentTextChange, final Function1<? super String, Unit> onSendComment, Modifier modifier, String placeholder, boolean isVisible, boolean isEnabled, int maxLines, int minLines, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        boolean z;
        boolean isEnabled2;
        int i2;
        int i3;
        Composer $composer2;
        final String placeholder2;
        final int maxLines2;
        final int minLines2;
        final Modifier modifier3;
        final boolean isVisible2;
        final boolean isEnabled3;
        Modifier.Companion modifier4;
        final String placeholder3;
        boolean isVisible3;
        final int maxLines3;
        final int minLines3;
        Modifier modifier5;
        final boolean isEnabled4;
        Intrinsics.checkNotNullParameter(commentText, "commentText");
        Intrinsics.checkNotNullParameter(onCommentTextChange, "onCommentTextChange");
        Intrinsics.checkNotNullParameter(onSendComment, "onSendComment");
        Composer $composer3 = $composer.startRestartGroup(1751370067);
        ComposerKt.sourceInformation($composer3, "C(BottomCommentInputBar)N(commentText,onCommentTextChange,onSendComment,modifier,placeholder,isVisible,isEnabled,maxLines,minLines):CommentInputBar.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(commentText) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onCommentTextChange) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onSendComment) ? 256 : 128;
        }
        int i4 = i & 8;
        if (i4 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i5 = i & 16;
        if (i5 != 0) {
            $dirty |= 24576;
        } else if (($changed & 24576) == 0) {
            $dirty |= $composer3.changed(placeholder) ? 16384 : 8192;
        }
        int i6 = i & 32;
        if (i6 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            z = isVisible;
        } else if ((196608 & $changed) == 0) {
            z = isVisible;
            $dirty |= $composer3.changed(z) ? 131072 : 65536;
        } else {
            z = isVisible;
        }
        int i7 = i & 64;
        if (i7 != 0) {
            $dirty |= 1572864;
            isEnabled2 = isEnabled;
        } else if ((1572864 & $changed) == 0) {
            isEnabled2 = isEnabled;
            $dirty |= $composer3.changed(isEnabled2) ? 1048576 : 524288;
        } else {
            isEnabled2 = isEnabled;
        }
        int i8 = i & 128;
        if (i8 != 0) {
            $dirty |= 12582912;
            i2 = i8;
        } else if (($changed & 12582912) == 0) {
            i2 = i8;
            $dirty |= $composer3.changed(maxLines) ? 8388608 : 4194304;
        } else {
            i2 = i8;
        }
        int i9 = i & 256;
        if (i9 != 0) {
            $dirty |= 100663296;
            i3 = i9;
        } else if (($changed & 100663296) == 0) {
            i3 = i9;
            $dirty |= $composer3.changed(minLines) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            i3 = i9;
        }
        if ($composer3.shouldExecute(($dirty & 38347923) != 38347922, $dirty & 1)) {
            if (i4 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (i5 == 0) {
                placeholder3 = placeholder;
            } else {
                placeholder3 = "\u5199\u4e0b\u4f60\u7684\u8bc4\u8bba...";
            }
            if (i6 == 0) {
                isVisible3 = z;
            } else {
                isVisible3 = true;
            }
            if (i7 != 0) {
                isEnabled2 = true;
            }
            if (i2 == 0) {
                maxLines3 = maxLines;
            } else {
                maxLines3 = 5;
            }
            if (i3 == 0) {
                minLines3 = minLines;
            } else {
                minLines3 = 1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1751370067, $dirty, -1, "com.yhchat.canarys.ui.components.BottomCommentInputBar (CommentInputBar.kt:108)");
            }
            if (isVisible3) {
                $composer3.startReplaceGroup(-196618598);
                ComposerKt.sourceInformation($composer3, "113@3871L14,114@3937L3,117@4048L11,118@4078L2379,110@3748L2709");
                modifier5 = modifier4;
                isEnabled4 = isEnabled2;
                SurfaceKt.m3209SurfaceT9BRK9s(WindowInsetsPaddingKt.windowInsetsPadding(WindowInsetsPaddingKt.windowInsetsPadding(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, $composer3, 6)), WindowInsets_androidKt.getIme(WindowInsets.INSTANCE, $composer3, 6)), null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, C1834Dp.m7806constructorimpl(3), C1834Dp.m7806constructorimpl(8), null, ComposableLambdaKt.rememberComposableLambda(-893001507, true, new Function2() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CommentInputBarKt.BottomCommentInputBar$lambda$0(commentText, onSendComment, onCommentTextChange, isEnabled4, maxLines3, minLines3, placeholder3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, $composer3, 54), $composer3, 12804096, 74);
                $composer2 = $composer3;
            } else {
                modifier5 = modifier4;
                $composer2 = $composer3;
                isEnabled4 = isEnabled2;
                $composer2.startReplaceGroup(-200421585);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            maxLines2 = maxLines3;
            minLines2 = minLines3;
            placeholder2 = placeholder3;
            isVisible2 = isVisible3;
            isEnabled3 = isEnabled4;
            modifier3 = modifier5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            placeholder2 = placeholder;
            maxLines2 = maxLines;
            minLines2 = minLines;
            modifier3 = modifier2;
            isVisible2 = z;
            isEnabled3 = isEnabled2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommentInputBarKt.BottomCommentInputBar$lambda$1(commentText, onCommentTextChange, onSendComment, modifier3, placeholder2, isVisible2, isEnabled3, maxLines2, minLines2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit BottomCommentInputBar$lambda$0(final String $commentText, final Function1 $onSendComment, Function1 $onCommentTextChange, boolean $isEnabled, int $maxLines, int $minLines, final String $placeholder, Composer $composer, int $changed) {
        long j;
        long j2;
        ComposerKt.sourceInformation($composer, "C119@4092L2355:CommentInputBar.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-893001507, $changed, -1, "com.yhchat.canarys.ui.components.BottomCommentInputBar.<anonymous> (CommentInputBar.kt:119)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), bottom, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
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
            int i3 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 716793924, "C133@4682L6,139@4971L255,129@4494L21,125@4291L975,148@5300L40,151@5426L235,150@5374L1059:CommentInputBar.kt#2suaub");
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            CornerBasedShape large = MaterialTheme.INSTANCE.getShapes($composer, MaterialTheme.$stable).getLarge();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, KeyboardType.INSTANCE.m7483getTextPjHm6EE(), ImeAction.INSTANCE.m7429getSendeUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            ComposerKt.sourceInformationMarkerStart($composer, -1639425728, "CC(remember):CommentInputBar.kt#9igjgp");
            boolean zChanged = $composer.changed($commentText) | $composer.changed($onSendComment);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CommentInputBarKt.BottomCommentInputBar$lambda$0$0$0$0($commentText, $onSendComment, (KeyboardActionScope) obj);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField($commentText, (Function1<? super String, Unit>) $onCommentTextChange, modifierWeight$default, $isEnabled, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(1924412090, true, new Function2() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CommentInputBarKt.BottomCommentInputBar$lambda$0$0$1($placeholder, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions, new KeyboardActions(null, null, null, null, null, (Function1) objRememberedValue, 31, null), false, $maxLines, $minLines, (MutableInteractionSource) null, (Shape) large, (TextFieldColors) null, $composer, 12582912, 0, 0, 5406576);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            ComposerKt.sourceInformationMarkerStart($composer, -1639411188, "CC(remember):CommentInputBar.kt#9igjgp");
            boolean zChanged2 = $composer.changed($commentText) | $composer.changed($onSendComment);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.CommentInputBarKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CommentInputBarKt.BottomCommentInputBar$lambda$0$0$2$0($commentText, $onSendComment);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            Function0 function0 = (Function0) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierM1102size3ABfNKs = SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48));
            if (StringsKt.isBlank($commentText) || !$isEnabled) {
                $composer.startReplaceGroup(-1639395217);
                ComposerKt.sourceInformation($composer, "161@5920L11");
                long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant();
                $composer.endReplaceGroup();
                j = surfaceVariant;
            } else {
                $composer.startReplaceGroup(-1639397944);
                ComposerKt.sourceInformation($composer, "159@5835L11");
                long primary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                $composer.endReplaceGroup();
                j = primary;
            }
            if (StringsKt.isBlank($commentText) || !$isEnabled) {
                $composer.startReplaceGroup(-1639387791);
                ComposerKt.sourceInformation($composer, "165@6152L11");
                long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                $composer.endReplaceGroup();
                j2 = onSurfaceVariant;
            } else {
                $composer.startReplaceGroup(-1639390582);
                ComposerKt.sourceInformation($composer, "163@6065L11");
                long onPrimary = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary();
                $composer.endReplaceGroup();
                j2 = onPrimary;
            }
            FloatingActionButtonKt.m2791FloatingActionButtonXz6DiA(function0, modifierM1102size3ABfNKs, null, j, j2, null, null, ComposableSingletons$CommentInputBarKt.INSTANCE.m11004getLambda$1594750909$app_debug(), $composer, 12582960, 100);
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

    public static final Unit BottomCommentInputBar$lambda$0$0$1(String $placeholder, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C129@4496L17:CommentInputBar.kt#2suaub");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1924412090, $changed, -1, "com.yhchat.canarys.ui.components.BottomCommentInputBar.<anonymous>.<anonymous>.<anonymous> (CommentInputBar.kt:129)");
            }
            TextKt.m3359Text4IGK_g($placeholder, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit BottomCommentInputBar$lambda$0$0$0$0(String $commentText, Function1 $onSendComment, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        if (!StringsKt.isBlank($commentText)) {
            String processedContent = StringsKt.trim((CharSequence) $commentText).toString();
            $onSendComment.invoke(processedContent);
        }
        return Unit.INSTANCE;
    }

    public static final Unit BottomCommentInputBar$lambda$0$0$2$0(String $commentText, Function1 $onSendComment) {
        if (!StringsKt.isBlank($commentText)) {
            String processedContent = StringsKt.trim((CharSequence) $commentText).toString();
            $onSendComment.invoke(processedContent);
        }
        return Unit.INSTANCE;
    }
}
