package com.yhchat.canarys.p007ui.components;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.NavigationItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomNavigationBar.kt */
@Metadata(m168d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, m169d2 = {"BottomNavigationBar", "", "currentScreen", "", "visibleItems", "", "Lcom/yhchat/canarys/data/model/NavigationItem;", "onScreenChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class BottomNavigationBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationBar$lambda$1(String str, List list, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BottomNavigationBar(str, list, function1, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void BottomNavigationBar(final String currentScreen, final List<NavigationItem> visibleItems, final Function1<? super String, Unit> onScreenChange, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Modifier.Companion modifier3;
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
        Intrinsics.checkNotNullParameter(onScreenChange, "onScreenChange");
        Composer $composer2 = $composer.startRestartGroup(-1351097014);
        ComposerKt.sourceInformation($composer2, "C(BottomNavigationBar)N(currentScreen,visibleItems,onScreenChange,modifier)24@687L626,22@638L675:BottomNavigationBar.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(currentScreen) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(visibleItems) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(onScreenChange) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if (!$composer2.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1351097014, $dirty, -1, "com.yhchat.canarys.ui.components.BottomNavigationBar (BottomNavigationBar.kt:21)");
            }
            NavigationBarKt.m2939NavigationBarHsRjFd4(modifier3, 0L, 0L, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(1387860035, true, new Function3() { // from class: com.yhchat.canarys.ui.components.BottomNavigationBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return BottomNavigationBarKt.BottomNavigationBar$lambda$0(visibleItems, currentScreen, onScreenChange, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty >> 9) & 14) | ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.BottomNavigationBarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BottomNavigationBarKt.BottomNavigationBar$lambda$1(currentScreen, visibleItems, onScreenChange, modifier4, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationBar$lambda$0(List $visibleItems, String $currentScreen, final Function1 $onScreenChange, RowScope $this$NavigationBar, Composer $composer, int $changed) {
        RowScope NavigationBar = $this$NavigationBar;
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(NavigationBar, "$this$NavigationBar");
        ComposerKt.sourceInformation(composer, "C*39@1220L63,27@782L234,34@1042L56,26@740L557:BottomNavigationBar.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= composer.changed(NavigationBar) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1387860035, $dirty2, -1, "com.yhchat.canarys.ui.components.BottomNavigationBar.<anonymous> (BottomNavigationBar.kt:25)");
            }
            Iterator it = $visibleItems.iterator();
            while (it.hasNext()) {
                final NavigationItem navigationItem = (NavigationItem) it.next();
                boolean zAreEqual = Intrinsics.areEqual($currentScreen, navigationItem.getId());
                ComposerKt.sourceInformationMarkerStart(composer, -1391065796, "CC(remember):BottomNavigationBar.kt#9igjgp");
                boolean zChanged = composer.changed($onScreenChange) | composer.changed(navigationItem);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.BottomNavigationBarKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return BottomNavigationBarKt.BottomNavigationBar$lambda$0$0$0$0($onScreenChange, navigationItem);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                NavigationBarKt.NavigationBarItem(NavigationBar, zAreEqual, (Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-1327973214, true, new Function2() { // from class: com.yhchat.canarys.ui.components.BottomNavigationBarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return BottomNavigationBarKt.BottomNavigationBar$lambda$0$0$1(navigationItem, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), null, false, ComposableLambdaKt.rememberComposableLambda(-1585677889, true, new Function2() { // from class: com.yhchat.canarys.ui.components.BottomNavigationBarKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return BottomNavigationBarKt.BottomNavigationBar$lambda$0$0$2(navigationItem, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer, 54), false, null, null, composer, ($dirty2 & 14) | 14158848, 408);
                NavigationBar = $this$NavigationBar;
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationBar$lambda$0$0$1(NavigationItem $item, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C28@804L194:BottomNavigationBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1327973214, $changed, -1, "com.yhchat.canarys.ui.components.BottomNavigationBar.<anonymous>.<anonymous>.<anonymous> (BottomNavigationBar.kt:28)");
            }
            IconKt.m2816Iconww6aTOc($item.getIcon(), $item.getTitle(), SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, $composer, 384, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationBar$lambda$0$0$2(NavigationItem $item, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C35@1064L16:BottomNavigationBar.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1585677889, $changed, -1, "com.yhchat.canarys.ui.components.BottomNavigationBar.<anonymous>.<anonymous>.<anonymous> (BottomNavigationBar.kt:35)");
            }
            TextKt.m3359Text4IGK_g($item.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomNavigationBar$lambda$0$0$0$0(Function1 $onScreenChange, NavigationItem $item) {
        $onScreenChange.invoke($item.getId());
        return Unit.INSTANCE;
    }
}
