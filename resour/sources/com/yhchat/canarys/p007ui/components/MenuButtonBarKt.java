package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.p000ui.unit.TextUnitKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.data.model.MenuButton;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenuButtonBar.kt */
@Metadata(m168d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007\u00a2\u0006\u0002\u0010\t\u001a-\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003\u00a2\u0006\u0002\u0010\u000e\u00a8\u0006\u000f"}, m169d2 = {"MenuButtonBar", "", "menuButtons", "", "Lcom/yhchat/canarys/data/model/MenuButton;", "onButtonClick", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MenuButtonItem", "button", "onClick", "Lkotlin/Function0;", "(Lcom/yhchat/canarys/data/model/MenuButton;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class MenuButtonBarKt {
    public static final Unit MenuButtonBar$lambda$0(List list, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuButtonBar(list, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit MenuButtonBar$lambda$2(List list, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuButtonBar(list, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit MenuButtonItem$lambda$1(MenuButton menuButton, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuButtonItem(menuButton, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void MenuButtonBar(final List<MenuButton> menuButtons, final Function1<? super MenuButton, Unit> onButtonClick, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Function1<? super MenuButton, Unit> function1;
        final Modifier modifier3;
        Intrinsics.checkNotNullParameter(menuButtons, "menuButtons");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        Composer $composer2 = $composer.startRestartGroup(919050817);
        ComposerKt.sourceInformation($composer2, "C(MenuButtonBar)N(menuButtons,onButtonClick,modifier)32@1022L183,26@775L430:MenuButtonBar.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(menuButtons) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(onButtonClick) ? 32 : 16;
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
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            final Modifier.Companion modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(919050817, $dirty2, -1, "com.yhchat.canarys.ui.components.MenuButtonBar (MenuButtonBar.kt:23)");
            }
            if (menuButtons.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.MenuButtonBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MenuButtonBarKt.MenuButtonBar$lambda$0(menuButtons, onButtonClick, modifier4, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function1 = onButtonClick;
            Modifier modifier5 = modifier4;
            Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(SizeKt.fillMaxWidth$default(modifier5, 0.0f, 1, null), C1834Dp.m7806constructorimpl(8), C1834Dp.m7806constructorimpl(4));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            PaddingValues paddingValuesM1045PaddingValuesYgX7TsA$default = PaddingKt.m1045PaddingValuesYgX7TsA$default(C1834Dp.m7806constructorimpl(8), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical horizontalOrVertical = horizontalOrVerticalM909spacedBy0680j_4;
            ComposerKt.sourceInformationMarkerStart($composer2, -1555413992, "CC(remember):MenuButtonBar.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(menuButtons) | (($dirty2 & 112) == 32);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.components.MenuButtonBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MenuButtonBarKt.MenuButtonBar$lambda$1$0(menuButtons, function1, (LazyListScope) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyRow(modifierM1051paddingVpY3zN4, null, paddingValuesM1045PaddingValuesYgX7TsA$default, false, horizontalOrVertical, null, null, false, null, (Function1) objRememberedValue, $composer2, 24960, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            function1 = onButtonClick;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final Function1<? super MenuButton, Unit> function12 = function1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.MenuButtonBarKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MenuButtonBarKt.MenuButtonBar$lambda$2(menuButtons, function12, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit MenuButtonBar$lambda$1$0(final List $menuButtons, final Function1 $onButtonClick, LazyListScope LazyRow) {
        Intrinsics.checkNotNullParameter(LazyRow, "$this$LazyRow");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.components.MenuButtonBarKt$MenuButtonBar$lambda$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((MenuButton) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MenuButton menuButton) {
                return null;
            }
        };
        LazyRow.items($menuButtons.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.components.MenuButtonBarKt$MenuButtonBar$lambda$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($menuButtons.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.components.MenuButtonBarKt$MenuButtonBar$lambda$1$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                if (($changed & 6) == 0) {
                    $dirty |= $composer.changed($this$items) ? 4 : 2;
                }
                if (($changed & 48) == 0) {
                    $dirty |= $composer.changed(it) ? 32 : 16;
                }
                if (!$composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    $composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                int i = $dirty & 14;
                final MenuButton menuButton = (MenuButton) $menuButtons.get(it);
                $composer.startReplaceGroup(-1808609130);
                ComposerKt.sourceInformation($composer, "CN(button)*36@1150L25,34@1075L114:MenuButtonBar.kt#2suaub");
                ComposerKt.sourceInformationMarkerStart($composer, -1028171244, "CC(remember):MenuButtonBar.kt#9igjgp");
                boolean zChanged = $composer.changed($onButtonClick) | ((((i & 112) ^ 48) > 32 && $composer.changed(menuButton)) || (i & 48) == 32);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Function1 function12 = $onButtonClick;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.components.MenuButtonBarKt$MenuButtonBar$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function12.invoke(menuButton);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                MenuButtonBarKt.MenuButtonItem(menuButton, (Function0) objRememberedValue, null, $composer, (i >> 3) & 14, 4);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final void MenuButtonItem(final MenuButton button, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function0<Unit> function02;
        Modifier modifier2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        Composer $composer2 = $composer.startRestartGroup(655699277);
        ComposerKt.sourceInformation($composer2, "C(MenuButtonItem)N(button,onClick,modifier)58@1615L11,59@1688L11,57@1558L172,62@1814L208,51@1358L664:MenuButtonBar.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(button) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
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
        if (!$composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(655699277, $dirty, -1, "com.yhchat.canarys.ui.components.MenuButtonItem (MenuButtonBar.kt:50)");
            }
            Modifier modifier5 = modifier4;
            ButtonKt.Button(function02, SizeKt.m1109widthInVpY3zN4$default(SizeKt.m1088height3ABfNKs(modifier4, C1834Dp.m7806constructorimpl(32)), C1834Dp.m7806constructorimpl(60), 0.0f, 2, null), false, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16)), ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSecondaryContainer(), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSecondaryContainer(), 0L, 0L, $composer2, ButtonDefaults.$stable << 12, 12), null, null, PaddingKt.m1044PaddingValuesYgX7TsA(C1834Dp.m7806constructorimpl(12), C1834Dp.m7806constructorimpl(4)), null, ComposableLambdaKt.rememberComposableLambda(1947645789, true, new Function3() { // from class: com.yhchat.canarys.ui.components.MenuButtonBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return MenuButtonBarKt.MenuButtonItem$lambda$0(button, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 3) & 14) | 817889280, 356);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.MenuButtonBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MenuButtonBarKt.MenuButtonItem$lambda$1(button, function0, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit MenuButtonItem$lambda$0(MenuButton $button, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C63@1824L192:MenuButtonBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1947645789, $changed, -1, "com.yhchat.canarys.ui.components.MenuButtonItem.<anonymous> (MenuButtonBar.kt:63)");
            }
            TextKt.m3359Text4IGK_g($button.getName(), (Modifier) null, 0L, TextUnitKt.getSp(12), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 3120, 120790);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
