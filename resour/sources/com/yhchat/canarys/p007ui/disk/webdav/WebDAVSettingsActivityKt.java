package com.yhchat.canarys.p007ui.disk.webdav;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.text.style.TextAlign;
import androidx.compose.p000ui.text.style.TextDecoration;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.MountSetting;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: WebDAVSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0003\u00a2\u0006\u0002\u0010\u0007\u001a;\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003\u00a2\u0006\u0002\u0010\u000f\u001aI\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0016H\u0003\u00a2\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0016H\u0003\u00a2\u0006\u0002\u0010\u001d\u00a8\u0006\u001e\u00b2\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u0084\u0002\u00b2\u0006\n\u0010!\u001a\u00020\u0013X\u008a\u008e\u0002\u00b2\u0006\f\u0010\"\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002\u00b2\u0006\f\u0010#\u001a\u0004\u0018\u00010\nX\u008a\u008e\u0002\u00b2\u0006\n\u0010$\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010%\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010&\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010'\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010(\u001a\u00020\u0003X\u008a\u008e\u0002"}, m169d2 = {"WebDAVSettingsScreen", "", "groupId", "", "groupName", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "MountSettingCard", "mount", "Lcom/yhchat/canarys/data/model/MountSetting;", "onEdit", "onDelete", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/yhchat/canarys/data/model/MountSetting;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MountSettingInputDialog", "title", "isSubmitting", "", "onDismiss", "onConfirm", "Lkotlin/Function1;", "Lcom/yhchat/canarys/ui/disk/webdav/MountFormState;", "(Ljava/lang/String;Lcom/yhchat/canarys/data/model/MountSetting;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MountTextField", "valueState", "label", "onValueChange", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/disk/webdav/WebDAVSettingsUiState;", "showInputDialog", "editingMount", "showDeleteDialog", "mountName", "webdavUrl", "webdavUserName", "webdavPassword", "webdavRootPath"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class WebDAVSettingsActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingCard$lambda$1(MountSetting mountSetting, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MountSettingCard(mountSetting, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$20(String str, MountSetting mountSetting, boolean z, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        MountSettingInputDialog(str, mountSetting, z, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountTextField$lambda$1(String str, String str2, Function1 function1, int i, Composer composer, int i2) {
        MountTextField(str, str2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$19(String str, String str2, Function0 function0, int i, Composer composer, int i2) {
        WebDAVSettingsScreen(str, str2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x034a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void WebDAVSettingsScreen(java.lang.String r35, final java.lang.String r36, final kotlin.jvm.functions.Function0<kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVSettingsActivityKt.WebDAVSettingsScreen(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WebDAVSettingsUiState WebDAVSettingsScreen$lambda$1(State<WebDAVSettingsUiState> state) {
        return (WebDAVSettingsUiState) state.getValue();
    }

    private static final boolean WebDAVSettingsScreen$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WebDAVSettingsScreen$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final MountSetting WebDAVSettingsScreen$lambda$6(MutableState<MountSetting> mutableState) {
        return mutableState.getValue();
    }

    private static final MountSetting WebDAVSettingsScreen$lambda$9(MutableState<MountSetting> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$14(final String $groupName, final Function0 $onBackClick, final MutableState $editingMount$delegate, final MutableState $showInputDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C145@5405L71,146@5511L286,154@5825L292,144@5370L761:WebDAVSettingsActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1336110310, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsScreen.<anonymous> (WebDAVSettingsActivity.kt:144)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-230458710, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVSettingsActivityKt.WebDAVSettingsScreen$lambda$14$0($groupName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(1527168428, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVSettingsActivityKt.WebDAVSettingsScreen$lambda$14$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-1412229419, true, new Function3() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return WebDAVSettingsActivityKt.WebDAVSettingsScreen$lambda$14$2($editingMount$delegate, $showInputDialog$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$14$0(String $groupName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C145@5407L67:WebDAVSettingsActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-230458710, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsScreen.<anonymous>.<anonymous> (WebDAVSettingsActivity.kt:145)");
            }
            TextKt.m3359Text4IGK_g($groupName + " \u7684 WebDAV \u8bbe\u7f6e", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 131038);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$14$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C147@5533L246:WebDAVSettingsActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1527168428, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsScreen.<anonymous>.<anonymous> (WebDAVSettingsActivity.kt:147)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$WebDAVSettingsActivityKt.INSTANCE.getLambda$97736521$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$14$2(final MutableState $editingMount$delegate, final MutableState $showInputDialog$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C155@5868L114,155@5847L252:WebDAVSettingsActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1412229419, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsScreen.<anonymous>.<anonymous> (WebDAVSettingsActivity.kt:155)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 57195367, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVSettingsActivityKt.WebDAVSettingsScreen$lambda$14$2$0$0($editingMount$delegate, $showInputDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$WebDAVSettingsActivityKt.INSTANCE.getLambda$472710616$app_debug(), $composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$14$2$0$0(MutableState $editingMount$delegate, MutableState $showInputDialog$delegate) {
        $editingMount$delegate.setValue(null);
        WebDAVSettingsScreen$lambda$4($showInputDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$15(final State $uiState$delegate, final MutableState $editingMount$delegate, final MutableState $showInputDialog$delegate, final MutableState $showDeleteDialog$delegate, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Function0 function02;
        int i;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues):WebDAVSettingsActivity.kt#avqsuh");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(644795515, $dirty2, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsScreen.<anonymous> (WebDAVSettingsActivity.kt:165)");
            }
            if (WebDAVSettingsScreen$lambda$1($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(2009515605);
                ComposerKt.sourceInformation($composer, "167@6233L274");
                Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierPadding);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i2 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function02 = constructor;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl.getInserting()) {
                    i = iHashCode;
                } else {
                    i = iHashCode;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i4 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -682532881, "C173@6462L27:WebDAVSettingsActivity.kt#avqsuh");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                }
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(i));
                composerM4376constructorimpl.apply(Integer.valueOf(i), setCompositeKeyHash);
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i32 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i42 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -682532881, "C173@6462L27:WebDAVSettingsActivity.kt#avqsuh");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else if (WebDAVSettingsScreen$lambda$1($uiState$delegate).getMountSettings().isEmpty()) {
                $composer.startReplaceGroup(2009868912);
                ComposerKt.sourceInformation($composer, "178@6588L311");
                Modifier modifierPadding2 = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierPadding2);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((48 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function0 = constructor2;
                    $composer.createNode(function0);
                } else {
                    function0 = constructor2;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting()) {
                    composer = $composer;
                } else {
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = (i5 >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    int i7 = ((48 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1345638881, "C184@6860L10,184@6817L64:WebDAVSettingsActivity.kt#avqsuh");
                    TextKt.m3359Text4IGK_g("\u6682\u65e0\u6302\u8f7d\u70b9", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyLarge(), composer2, 6, 0, 65534);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer.endReplaceGroup();
                }
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i62 = (i5 >> 6) & 14;
                Composer composer22 = composer;
                ComposerKt.sourceInformationMarkerStart(composer22, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance32 = BoxScopeInstance.INSTANCE;
                int i72 = ((48 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer22, 1345638881, "C184@6860L10,184@6817L64:WebDAVSettingsActivity.kt#avqsuh");
                TextKt.m3359Text4IGK_g("\u6682\u65e0\u6302\u8f7d\u70b9", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer22, MaterialTheme.$stable).getBodyLarge(), composer22, 6, 0, 65534);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(2010246833);
                ComposerKt.sourceInformation($composer, "195@7240L535,189@6953L822");
                Modifier modifierPadding3 = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
                PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
                Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, 1173234770, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
                boolean zChanged = $composer.changed($uiState$delegate);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda20
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return WebDAVSettingsActivityKt.WebDAVSettingsScreen$lambda$15$2$0($uiState$delegate, $editingMount$delegate, $showInputDialog$delegate, $showDeleteDialog$delegate, (LazyListScope) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                LazyDslKt.LazyColumn(modifierPadding3, null, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24960, 490);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$15$2$0(State $uiState$delegate, final MutableState $editingMount$delegate, final MutableState $showInputDialog$delegate, final MutableState $showDeleteDialog$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List mountSettings = WebDAVSettingsScreen$lambda$1($uiState$delegate).getMountSettings();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebDAVSettingsActivityKt.WebDAVSettingsScreen$lambda$15$2$0$0((MountSetting) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$WebDAVSettingsScreen$lambda$15$2$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((MountSetting) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MountSetting mountSetting) {
                return null;
            }
        };
        LazyColumn.items(mountSettings.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$WebDAVSettingsScreen$lambda$15$2$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(mountSettings.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$WebDAVSettingsScreen$lambda$15$2$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke(mountSettings.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$WebDAVSettingsScreen$lambda$15$2$0$$inlined$items$default$4
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
                final MountSetting mountSetting = (MountSetting) mountSettings.get(it);
                $composer.startReplaceGroup(230565825);
                ComposerKt.sourceInformation($composer, "CN(mount)*199@7441L139,203@7621L88,197@7343L392:WebDAVSettingsActivity.kt#avqsuh");
                ComposerKt.sourceInformationMarkerStart($composer, -1239485499, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
                boolean z = (((i & 112) ^ 48) > 32 && $composer.changed(mountSetting)) || (i & 48) == 32;
                Object objRememberedValue = $composer.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState = $editingMount$delegate;
                    final MutableState mutableState2 = $showInputDialog$delegate;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$WebDAVSettingsScreen$5$3$1$2$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState.setValue(mountSetting);
                            WebDAVSettingsActivityKt.WebDAVSettingsScreen$lambda$4(mutableState2, true);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, -1239479790, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
                boolean z2 = (((i & 112) ^ 48) > 32 && $composer.changed(mountSetting)) || (i & 48) == 32;
                Object objRememberedValue2 = $composer.rememberedValue();
                if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final MutableState mutableState3 = $showDeleteDialog$delegate;
                    Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$WebDAVSettingsScreen$5$3$1$2$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            mutableState3.setValue(mountSetting);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                WebDAVSettingsActivityKt.MountSettingCard(mountSetting, function0, (Function0) objRememberedValue2, null, $composer, (i >> 3) & 14, 8);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object WebDAVSettingsScreen$lambda$15$2$0$0(MountSetting it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Long.valueOf(it.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$16$0(MutableState $showInputDialog$delegate, MutableState $editingMount$delegate) {
        WebDAVSettingsScreen$lambda$4($showInputDialog$delegate, false);
        $editingMount$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$17$0(WebDAVSettingsViewModel $viewModel, String $groupId, MountSetting $mount, MutableState $showInputDialog$delegate, MutableState $editingMount$delegate, MountFormState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        $viewModel.saveMountSetting($groupId, formState, $mount != null ? Long.valueOf($mount.getId()) : null);
        WebDAVSettingsScreen$lambda$4($showInputDialog$delegate, false);
        $editingMount$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$18$0$0(MutableState $showDeleteDialog$delegate) {
        $showDeleteDialog$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$18$3(MountSetting $mount, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C235@8552L41:WebDAVSettingsActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1642265963, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsScreen.<anonymous>.<anonymous> (WebDAVSettingsActivity.kt:235)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u5220\u9664\u6302\u8f7d\u70b9 \"" + $mount.getMountName() + "\" \u5417\uff1f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$18$1(final WebDAVSettingsViewModel $viewModel, final String $groupId, final MountSetting $mount, final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C237@8664L131,237@8643L245:WebDAVSettingsActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-28825030, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsScreen.<anonymous>.<anonymous> (WebDAVSettingsActivity.kt:237)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1931048675, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($groupId) | $composer.changed($mount);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVSettingsActivityKt.WebDAVSettingsScreen$lambda$18$1$0$0($viewModel, $groupId, $mount, $showDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$WebDAVSettingsActivityKt.INSTANCE.getLambda$309680157$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$18$1$0$0(WebDAVSettingsViewModel $viewModel, String $groupId, MountSetting $mount, MutableState $showDeleteDialog$delegate) {
        $viewModel.deleteMountSetting($groupId, $mount.getId());
        $showDeleteDialog$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$18$2(final MutableState $showDeleteDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C245@8971L27,245@8950L100:WebDAVSettingsActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(184792056, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsScreen.<anonymous>.<anonymous> (WebDAVSettingsActivity.kt:245)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1491507955, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVSettingsActivityKt.WebDAVSettingsScreen$lambda$18$2$0$0($showDeleteDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$WebDAVSettingsActivityKt.INSTANCE.getLambda$523297243$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WebDAVSettingsScreen$lambda$18$2$0$0(MutableState $showDeleteDialog$delegate) {
        $showDeleteDialog$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MountSettingCard(final MountSetting mount, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        Modifier modifier3;
        Modifier.Companion modifier4;
        Composer $composer3 = $composer.startRestartGroup(-879086311);
        ComposerKt.sourceInformation($composer3, "C(MountSettingCard)N(mount,onEdit,onDelete,modifier)262@9365L11,262@9323L62,263@9392L1058,260@9243L1207:WebDAVSettingsActivity.kt#avqsuh");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(mount) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        if (!$composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
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
                ComposerKt.traceEventStart(-879086311, $dirty, -1, "com.yhchat.canarys.ui.disk.webdav.MountSettingCard (WebDAVSettingsActivity.kt:259)");
            }
            $composer2 = $composer3;
            modifier3 = modifier4;
            CardKt.Card(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, $composer2, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1763862681, true, new Function3() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return WebDAVSettingsActivityKt.MountSettingCard$lambda$0(mount, function0, function02, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVSettingsActivityKt.MountSettingCard$lambda$1(mount, function0, function02, modifier5, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MountSettingCard$lambda$0(com.yhchat.canarys.data.model.MountSetting r65, kotlin.jvm.functions.Function0 r66, kotlin.jvm.functions.Function0 r67, androidx.compose.foundation.layout.ColumnScope r68, androidx.compose.runtime.Composer r69, int r70) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVSettingsActivityKt.MountSettingCard$lambda$0(com.yhchat.canarys.data.model.MountSetting, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final void MountSettingInputDialog(final String title, final MountSetting mount, final boolean isSubmitting, final Function0<Unit> function0, final Function1<? super MountFormState, Unit> function1, Composer $composer, final int $changed) {
        Composer $composer2;
        String webdavRootPath;
        String webdavPassword;
        String webdavUserName;
        String webdavUrl;
        String mountName;
        final boolean z = isSubmitting;
        Composer $composer3 = $composer.startRestartGroup(635676644);
        ComposerKt.sourceInformation($composer3, "C(MountSettingInputDialog)N(title,mount,isSubmitting,onDismiss,onConfirm)289@10667L51,290@10740L51,291@10818L56,292@10901L56,293@10984L56,296@11086L34,307@11775L649,325@12450L123,297@11138L15,298@11170L579,295@11046L1533:WebDAVSettingsActivity.kt#avqsuh");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(mount) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(z) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 16384 : 8192;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(635676644, $dirty2, -1, "com.yhchat.canarys.ui.disk.webdav.MountSettingInputDialog (WebDAVSettingsActivity.kt:288)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 999905079, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((mount == null || (mountName = mount.getMountName()) == null) ? "" : mountName, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState mountName$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 999907415, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((mount == null || (webdavUrl = mount.getWebdavUrl()) == null) ? "" : webdavUrl, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState webdavUrl$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 999909916, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default((mount == null || (webdavUserName = mount.getWebdavUserName()) == null) ? "" : webdavUserName, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            final MutableState webdavUserName$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 999912572, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                if (mount == null || (webdavPassword = mount.getWebdavPassword()) == null) {
                    webdavPassword = "";
                }
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(webdavPassword, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue4 = objMutableStateOf$default4;
            }
            final MutableState webdavPassword$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 999915228, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                if (mount == null || (webdavRootPath = mount.getWebdavRootPath()) == null) {
                    webdavRootPath = "";
                }
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(webdavRootPath, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue5 = objMutableStateOf$default5;
            }
            final MutableState webdavRootPath$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 999918470, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
            boolean z2 = (($dirty2 & 896) == 256) | (($dirty2 & 7168) == 2048);
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (z2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVSettingsActivityKt.MountSettingInputDialog$lambda$15$0(z, function0);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue6 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            z = isSubmitting;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue6, ComposableLambdaKt.rememberComposableLambda(-316213092, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return WebDAVSettingsActivityKt.MountSettingInputDialog$lambda$16(function1, isSubmitting, mountName$delegate, webdavUrl$delegate, webdavUserName$delegate, webdavPassword$delegate, webdavRootPath$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1006044582, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return WebDAVSettingsActivityKt.MountSettingInputDialog$lambda$17(function0, z, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1695876072, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return WebDAVSettingsActivityKt.MountSettingInputDialog$lambda$18(title, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(-2040791817, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return WebDAVSettingsActivityKt.MountSettingInputDialog$lambda$19(mountName$delegate, webdavUrl$delegate, webdavUserName$delegate, webdavPassword$delegate, webdavRootPath$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return WebDAVSettingsActivityKt.MountSettingInputDialog$lambda$20(title, mount, z, function0, function1, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final String MountSettingInputDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String MountSettingInputDialog$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String MountSettingInputDialog$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String MountSettingInputDialog$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String MountSettingInputDialog$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$15$0(boolean $isSubmitting, Function0 $onDismiss) {
        if (!$isSubmitting) {
            $onDismiss.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$18(String $title, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C297@11140L11:WebDAVSettingsActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1695876072, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.MountSettingInputDialog.<anonymous> (WebDAVSettingsActivity.kt:297)");
            }
            TextKt.m3359Text4IGK_g($title, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MountSettingInputDialog$lambda$19(final androidx.compose.runtime.MutableState r34, final androidx.compose.runtime.MutableState r35, final androidx.compose.runtime.MutableState r36, final androidx.compose.runtime.MutableState r37, final androidx.compose.runtime.MutableState r38, androidx.compose.runtime.Composer r39, int r40) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.disk.webdav.WebDAVSettingsActivityKt.MountSettingInputDialog$lambda$19(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$19$0$0$0(MutableState $mountName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $mountName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$19$0$1$0(MutableState $webdavUrl$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $webdavUrl$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$19$0$2$0(MutableState $webdavUserName$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $webdavUserName$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$19$0$3$0(MutableState $webdavPassword$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $webdavPassword$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$19$0$4$0(MutableState $webdavRootPath$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $webdavRootPath$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$16(final Function1 $onConfirm, final boolean $isSubmitting, final MutableState $mountName$delegate, final MutableState $webdavUrl$delegate, final MutableState $webdavUserName$delegate, final MutableState $webdavPassword$delegate, final MutableState $webdavRootPath$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C309@11827L457,321@12340L74,308@11789L625:WebDAVSettingsActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-316213092, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.MountSettingInputDialog.<anonymous> (WebDAVSettingsActivity.kt:308)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1061898725, "CC(remember):WebDAVSettingsActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onConfirm);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WebDAVSettingsActivityKt.MountSettingInputDialog$lambda$16$0$0($onConfirm, $mountName$delegate, $webdavUrl$delegate, $webdavUserName$delegate, $webdavPassword$delegate, $webdavRootPath$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, !$isSubmitting, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-953388417, true, new Function3() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return WebDAVSettingsActivityKt.MountSettingInputDialog$lambda$16$1($isSubmitting, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$16$0$0(Function1 $onConfirm, MutableState $mountName$delegate, MutableState $webdavUrl$delegate, MutableState $webdavUserName$delegate, MutableState $webdavPassword$delegate, MutableState $webdavRootPath$delegate) {
        $onConfirm.invoke(new MountFormState(StringsKt.trim((CharSequence) MountSettingInputDialog$lambda$1($mountName$delegate)).toString(), StringsKt.trim((CharSequence) MountSettingInputDialog$lambda$4($webdavUrl$delegate)).toString(), StringsKt.trim((CharSequence) MountSettingInputDialog$lambda$7($webdavUserName$delegate)).toString(), StringsKt.trim((CharSequence) MountSettingInputDialog$lambda$10($webdavPassword$delegate)).toString(), StringsKt.trim((CharSequence) MountSettingInputDialog$lambda$13($webdavRootPath$delegate)).toString()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$16$1(boolean $isSubmitting, RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C322@12358L42:WebDAVSettingsActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-953388417, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.MountSettingInputDialog.<anonymous>.<anonymous> (WebDAVSettingsActivity.kt:322)");
            }
            TextKt.m3359Text4IGK_g($isSubmitting ? "\u63d0\u4ea4\u4e2d..." : "\u4fdd\u5b58", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountSettingInputDialog$lambda$17(Function0 $onDismiss, boolean $isSubmitting, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C326@12464L99:WebDAVSettingsActivity.kt#avqsuh");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1006044582, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.MountSettingInputDialog.<anonymous> (WebDAVSettingsActivity.kt:326)");
            }
            ButtonKt.TextButton($onDismiss, null, !$isSubmitting, null, null, null, null, null, null, ComposableSingletons$WebDAVSettingsActivityKt.INSTANCE.m11272getLambda$1643219907$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void MountTextField(final String valueState, final String label, Function1<? super String, Unit> function1, Composer $composer, final int $changed) {
        final Function1<? super String, Unit> function12;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(23952555);
        ComposerKt.sourceInformation($composer3, "C(MountTextField)N(valueState,label,onValueChange)342@12812L15,339@12710L167:WebDAVSettingsActivity.kt#avqsuh");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(valueState) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(label) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            function12 = function1;
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(23952555, $dirty, -1, "com.yhchat.canarys.ui.disk.webdav.MountTextField (WebDAVSettingsActivity.kt:338)");
            }
            $composer2 = $composer3;
            function12 = function1;
            OutlinedTextFieldKt.OutlinedTextField(valueState, function12, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(-783826351, true, new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVSettingsActivityKt.MountTextField$lambda$0(label, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer2, ($dirty & 14) | 1573248 | (($dirty >> 3) & 112), 0, 0, 8388536);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.disk.webdav.WebDAVSettingsActivityKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return WebDAVSettingsActivityKt.MountTextField$lambda$1(valueState, label, function12, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MountTextField$lambda$0(String $label, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C342@12814L11:WebDAVSettingsActivity.kt#avqsuh");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-783826351, $changed, -1, "com.yhchat.canarys.ui.disk.webdav.MountTextField.<anonymous> (WebDAVSettingsActivity.kt:342)");
            }
            TextKt.m3359Text4IGK_g($label, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
