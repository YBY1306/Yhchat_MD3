package com.yhchat.canarys.p007ui.disk.webdav;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
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
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.DownloadStatus;
import com.yhchat.canarys.data.model.WebDAVDownloadTask;
import com.yhchat.canarys.utils.WebDAVDownloadManager;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: WebDAVDownloadListActivity.kt */
@Metadata(m168d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003\u00a2\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0003\u00a2\u0006\u0002\u0010\b\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002\u00a8\u0006\r\u00b2\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fX\u008a\u0084\u0002"}, m169d2 = {"DownloadTaskScreen", "", "onBackClick", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DownloadTaskCard", "task", "Lcom/yhchat/canarys/data/model/WebDAVDownloadTask;", "(Lcom/yhchat/canarys/data/model/WebDAVDownloadTask;Landroidx/compose/runtime/Composer;I)V", "formatSize", "", "bytes", "", "app_debug", "tasks", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class WebDAVDownloadListActivityKt {

    /* compiled from: WebDAVDownloadListActivity.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadStatus.values().length];
            try {
                iArr[DownloadStatus.QUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[DownloadStatus.DOWNLOADING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[DownloadStatus.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[DownloadStatus.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[DownloadStatus.CANCELED.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Unit DownloadTaskCard$lambda$1(WebDAVDownloadTask webDAVDownloadTask, int i, Composer composer, int i2) {
        DownloadTaskCard(webDAVDownloadTask, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit DownloadTaskScreen$lambda$3(Function0 function0, int i, Composer composer, int i2) {
        DownloadTaskScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DownloadTaskScreen(final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2 = $composer.startRestartGroup(542411468);
        ComposerKt.sourceInformation($composer2, "C(DownloadTaskScreen)N(onBackClick)63@2523L16,66@2572L440,79@3019L845,65@2545L1319:WebDAVDownloadListActivity.kt#avqsuh");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 4 : 2;
        }
        if ($composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(542411468, $dirty, -1, "com.yhchat.canarys.ui.disk.webdav.DownloadTaskScreen (WebDAVDownloadListActivity.kt:62)");
            }
            final State tasks$delegate = SnapshotStateKt.collectAsState(WebDAVDownloadManager.INSTANCE.getTasks(), null, $composer2, 0, 1);
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(1863779464, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVDownloadListActivityKt.DownloadTaskScreen$lambda$1(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(1055742877, true, new Function3() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return WebDAVDownloadListActivityKt.DownloadTaskScreen$lambda$2(tasks$delegate, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 509);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVDownloadListActivityKt.DownloadTaskScreen$lambda$3(function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final List<WebDAVDownloadTask> DownloadTaskScreen$lambda$0(State<? extends List<WebDAVDownloadTask>> state) {
        return (List) state.getValue();
    }

    public static final Unit DownloadTaskScreen$lambda$1(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C69@2702L286,67@2586L416:WebDAVDownloadListActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1863779464, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.DownloadTaskScreen.<anonymous> (WebDAVDownloadListActivity.kt:67)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$WebDAVDownloadListActivityKt.INSTANCE.m11265getLambda$1121281972$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-1031221682, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVDownloadListActivityKt.DownloadTaskScreen$lambda$1$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DownloadTaskScreen$lambda$1$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C70@2724L246:WebDAVDownloadListActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1031221682, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.DownloadTaskScreen.<anonymous>.<anonymous> (WebDAVDownloadListActivity.kt:70)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$WebDAVDownloadListActivityKt.INSTANCE.m11267getLambda$215930005$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DownloadTaskScreen$lambda$2(final State $tasks$delegate, PaddingValues padding, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Intrinsics.checkNotNullParameter(padding, "padding");
        ComposerKt.sourceInformation($composer, "CN(padding):WebDAVDownloadListActivity.kt#avqsuh");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(padding) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055742877, $dirty2, -1, "com.yhchat.canarys.ui.disk.webdav.DownloadTaskScreen.<anonymous> (WebDAVDownloadListActivity.kt:80)");
            }
            if (DownloadTaskScreen$lambda$0($tasks$delegate).isEmpty()) {
                $composer.startReplaceGroup(-409406734);
                ComposerKt.sourceInformation($composer, "81@3075L347");
                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), padding);
                Arrangement.Vertical center = Arrangement.INSTANCE.getCenter();
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierPadding);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i = ((((432 << 3) & 112) << 6) & 896) | 6;
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
                Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl.getInserting()) {
                    composer = $composer;
                } else {
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i2 = (i >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i3 = ((432 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1282259173, "C88@3387L10,88@3350L58:WebDAVDownloadListActivity.kt#avqsuh");
                    TextKt.m3359Text4IGK_g("\u6682\u65e0\u4e0b\u8f7d\u4efb\u52a1", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyLarge(), composer2, 6, 0, 65534);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer.endReplaceGroup();
                }
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i22 = (i >> 6) & 14;
                Composer composer22 = composer;
                ComposerKt.sourceInformationMarkerStart(composer22, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i32 = ((432 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer22, -1282259173, "C88@3387L10,88@3350L58:WebDAVDownloadListActivity.kt#avqsuh");
                TextKt.m3359Text4IGK_g("\u6682\u65e0\u4e0b\u8f7d\u4efb\u52a1", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer22, MaterialTheme.$stable).getBodyLarge(), composer22, 6, 0, 65534);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-409031231);
                ComposerKt.sourceInformation($composer, "97@3709L139,91@3452L396");
                Modifier modifierPadding2 = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), padding);
                PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, 956645160, "CC(remember):WebDAVDownloadListActivity.kt#9igjgp");
                boolean zChanged = $composer.changed($tasks$delegate);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return WebDAVDownloadListActivityKt.DownloadTaskScreen$lambda$2$1$0($tasks$delegate, (LazyListScope) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                LazyDslKt.LazyColumn(modifierPadding2, null, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24960, 490);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DownloadTaskScreen$lambda$2$1$0(State $tasks$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List listDownloadTaskScreen$lambda$0 = DownloadTaskScreen$lambda$0($tasks$delegate);
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebDAVDownloadListActivityKt.DownloadTaskScreen$lambda$2$1$0$0((WebDAVDownloadTask) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$DownloadTaskScreen$lambda$2$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((WebDAVDownloadTask) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(WebDAVDownloadTask webDAVDownloadTask) {
                return null;
            }
        };
        LazyColumn.items(listDownloadTaskScreen$lambda$0.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$DownloadTaskScreen$lambda$2$1$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(listDownloadTaskScreen$lambda$0.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$DownloadTaskScreen$lambda$2$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke(listDownloadTaskScreen$lambda$0.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$DownloadTaskScreen$lambda$2$1$0$$inlined$items$default$4
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
                WebDAVDownloadTask webDAVDownloadTask = (WebDAVDownloadTask) listDownloadTaskScreen$lambda$0.get(it);
                $composer.startReplaceGroup(185757164);
                ComposerKt.sourceInformation($composer, "CN(task)*99@3787L29:WebDAVDownloadListActivity.kt#avqsuh");
                WebDAVDownloadListActivityKt.DownloadTaskCard(webDAVDownloadTask, $composer, (($dirty & 14) >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final Object DownloadTaskScreen$lambda$2$1$0$0(WebDAVDownloadTask it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getId();
    }

    public static final void DownloadTaskCard(final WebDAVDownloadTask task, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-2055716188);
        ComposerKt.sourceInformation($composer3, "C(DownloadTaskCard)N(task)111@4111L11,111@4069L62,112@4138L2091,109@3981L2248:WebDAVDownloadListActivity.kt#avqsuh");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(task) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2055716188, $dirty2, -1, "com.yhchat.canarys.ui.disk.webdav.DownloadTaskCard (WebDAVDownloadListActivity.kt:108)");
            }
            $composer2 = $composer3;
            CardKt.ElevatedCard(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14), null, ComposableLambdaKt.rememberComposableLambda(1043894879, true, new Function3() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return WebDAVDownloadListActivityKt.DownloadTaskCard$lambda$0(task, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 24582, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVDownloadListActivityKt.DownloadTaskCard$lambda$1(task, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Unit DownloadTaskCard$lambda$0(final WebDAVDownloadTask $task, ColumnScope ElevatedCard, Composer $composer, int $changed) {
        Function0 function0;
        String str;
        long j;
        Composer composer;
        Intrinsics.checkNotNullParameter(ElevatedCard, "$this$ElevatedCard");
        ComposerKt.sourceInformation($composer, "C113@4148L2075:WebDAVDownloadListActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1043894879, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.DownloadTaskCard.<anonymous> (WebDAVDownloadListActivity.kt:113)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i3 = ((54 >> 6) & 112) | 6;
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            Composer composer2 = $composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -1118955544, "C114@4297L10,114@4255L99,115@4419L10,115@4463L11,115@4367L125,124@4947L10,116@4505L682:WebDAVDownloadListActivity.kt#avqsuh");
            TextKt.m3359Text4IGK_g($task.getFileName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            TextKt.m3359Text4IGK_g("\u6765\u6e90: " + $task.getMountName(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            switch (WhenMappings.$EnumSwitchMapping$0[$task.getStatus().ordinal()]) {
                case 1:
                    str = "\u961f\u5217\u4e2d";
                    break;
                case 2:
                    str = "\u4e0b\u8f7d\u4e2d " + ((int) ($task.getProgress() * 100)) + "%";
                    break;
                case 3:
                    str = "\u4e0b\u8f7d\u5b8c\u6210";
                    break;
                case 4:
                    String errorMessage = $task.getErrorMessage();
                    if (errorMessage == null) {
                        errorMessage = "\u672a\u77e5\u9519\u8bef";
                    }
                    str = "\u4e0b\u8f7d\u5931\u8d25: " + errorMessage;
                    break;
                case 5:
                    str = "\u5df2\u53d6\u6d88";
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium();
            if (WhenMappings.$EnumSwitchMapping$0[$task.getStatus().ordinal()] == 4) {
                composer2.startReplaceGroup(-867354694);
                ComposerKt.sourceInformation(composer2, "126@5074L11");
                long error = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getError();
                composer2.endReplaceGroup();
                j = error;
            } else {
                composer2.startReplaceGroup(-867352770);
                ComposerKt.sourceInformation(composer2, "127@5134L11");
                long onSurface = MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurface();
                composer2.endReplaceGroup();
                j = onSurface;
            }
            TextKt.m3359Text4IGK_g(str, (Modifier) null, j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium, composer2, 0, 0, 65530);
            if ($task.getStatus() == DownloadStatus.DOWNLOADING || $task.getStatus() == DownloadStatus.QUEUED) {
                composer2.startReplaceGroup(-1117977495);
                ComposerKt.sourceInformation(composer2, "131@5305L143,137@5647L10,138@5711L11,135@5465L292");
                ProgressIndicatorKt.m3039LinearProgressIndicator_5eSRE($task.getProgress(), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, 0, composer2, 48, 28);
                composer2 = composer2;
                TextKt.m3359Text4IGK_g(formatSize($task.getDownloadedBytes()) + " / " + ($task.getTotalBytes() > 0 ? formatSize($task.getTotalBytes()) : "\u672a\u77e5"), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
            } else {
                composer2.startReplaceGroup(-1123238195);
            }
            composer2.endReplaceGroup();
            if ($task.getStatus() == DownloadStatus.DOWNLOADING || $task.getStatus() == DownloadStatus.QUEUED) {
                composer2.startReplaceGroup(-1117402569);
                ComposerKt.sourceInformation(composer2, "143@5931L49,142@5889L310");
                ComposerKt.sourceInformationMarkerStart(composer2, -867327610, "CC(remember):WebDAVDownloadListActivity.kt#9igjgp");
                boolean zChanged = composer2.changed($task);
                Composer composer3 = composer2;
                Object objRememberedValue = composer3.rememberedValue();
                if (!zChanged) {
                    composer = composer2;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ButtonKt.TextButton((Function0) objRememberedValue, columnScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), false, null, null, null, null, null, null, ComposableSingletons$WebDAVDownloadListActivityKt.INSTANCE.m11266getLambda$1928529756$app_debug(), composer, 805306368, 508);
                    composer.endReplaceGroup();
                } else {
                    composer = composer2;
                }
                objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVDownloadListActivityKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVDownloadListActivityKt.DownloadTaskCard$lambda$0$0$0$0($task);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ButtonKt.TextButton((Function0) objRememberedValue, columnScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getEnd()), false, null, null, null, null, null, null, ComposableSingletons$WebDAVDownloadListActivityKt.INSTANCE.m11266getLambda$1928529756$app_debug(), composer, 805306368, 508);
                composer.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1123238195);
                composer2.endReplaceGroup();
                composer = composer2;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
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

    public static final Unit DownloadTaskCard$lambda$0$0$0$0(WebDAVDownloadTask $task) {
        WebDAVDownloadManager.INSTANCE.cancelDownload($task.getId());
        return Unit.INSTANCE;
    }

    private static final String formatSize(long bytes) {
        if (bytes <= 0) {
            return "0 B";
        }
        double kb = bytes / 1024.0d;
        double mb = kb / 1024.0d;
        double gb = mb / 1024.0d;
        if (gb >= 1.0d) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(gb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
        if (mb >= 1.0d) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str2 = String.format("%.2f MB", Arrays.copyOf(new Object[]{Double.valueOf(mb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }
        if (kb >= 1.0d) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str3 = String.format("%.2f KB", Arrays.copyOf(new Object[]{Double.valueOf(kb)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }
        return bytes + " B";
    }
}
