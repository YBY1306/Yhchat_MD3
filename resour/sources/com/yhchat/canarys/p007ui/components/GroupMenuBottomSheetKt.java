package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ExitToAppKt;
import androidx.compose.material.icons.filled.FolderKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.PersonAddKt;
import androidx.compose.material.icons.filled.ReportKt;
import androidx.compose.material.icons.filled.SettingsKt;
import androidx.compose.material.icons.filled.ShareKt;
import androidx.compose.material.icons.filled.WallpaperKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.BottomSheetScaffoldKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.yhchat.canarys.data.api.ApiClient;
import com.yhchat.canarys.data.local.AppDatabase;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.p007ui.background.ChatBackgroundActivity;
import com.yhchat.canarys.p007ui.disk.GroupDiskActivity;
import com.yhchat.canarys.p007ui.group.GroupInfoActivity;
import com.yhchat.canarys.p007ui.group.GroupSettingsActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GroupMenuBottomSheet.kt */
@Metadata(m168d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\u0007\u001a1\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0007\u00a2\u0006\u0002\u0010\n\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u00a2\u0006\u0002\u0010\u0012\u00a8\u0006\u0013\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0015\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0016\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0017\u001a\u00020\u0011X\u008a\u008e\u0002"}, m169d2 = {"GroupMenuBottomSheet", "", "groupId", "", "groupName", "onDismiss", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ExitGroupDialog", "onConfirm", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "GroupMenuItem", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "text", "onClick", "isDangerous", "", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "app_debug", "showReportDialog", "showShareDialog", "showInviteDialog", "showExitGroupDialog"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class GroupMenuBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExitGroupDialog$lambda$3(String str, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ExitGroupDialog(str, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$25(String str, String str2, Function0 function0, int i, Composer composer, int i2) {
        GroupMenuBottomSheet(str, str2, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuItem$lambda$1(ImageVector imageVector, String str, Function0 function0, boolean z, int i, int i2, Composer composer, int i3) {
        GroupMenuItem(imageVector, str, function0, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void GroupMenuBottomSheet(String groupId, String groupName, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        int $dirty;
        MutableState showShareDialog$delegate;
        final MutableState showExitGroupDialog$delegate;
        final Context context;
        boolean z;
        final MutableState showInviteDialog$delegate;
        int $dirty2;
        boolean z2;
        String str;
        final MutableState showShareDialog$delegate2;
        final String groupId2 = groupId;
        final String groupName2 = groupName;
        Intrinsics.checkNotNullParameter(groupId2, "groupId");
        Intrinsics.checkNotNullParameter(groupName2, "groupName");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer2 = $composer.startRestartGroup(6186693);
        ComposerKt.sourceInformation($composer2, "C(GroupMenuBottomSheet)N(groupId,groupName,onDismiss)44@1313L7,47@1464L8,45@1348L163,52@1587L205,52@1542L250,58@1821L34,59@1883L34,60@1946L34,61@2012L34,64@2085L1684,98@3800L131,105@3986L91,108@4102L2335,172@6531L289,104@3941L2879:GroupMenuBottomSheet.kt#2suaub");
        int $dirty3 = $changed;
        if (($changed & 6) == 0) {
            $dirty3 |= $composer2.changed(groupId2) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty3 |= $composer2.changed(groupName2) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty3 |= $composer2.changedInstance(onDismiss) ? 256 : 128;
        }
        if ($composer2.shouldExecute(($dirty3 & 147) != 146, $dirty3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(6186693, $dirty3, -1, "com.yhchat.canarys.ui.components.GroupMenuBottomSheet (GroupMenuBottomSheet.kt:43)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context2 = (Context) objConsume;
            SheetValue sheetValue = SheetValue.PartiallyExpanded;
            ComposerKt.sourceInformationMarkerStart($composer2, 1650453709, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$0$0((SheetValue) obj2));
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final SheetState bottomSheetState = BottomSheetScaffoldKt.rememberStandardBottomSheetState(sheetValue, (Function1) objRememberedValue, false, $composer2, 438, 0);
            SheetValue targetValue = bottomSheetState.getTargetValue();
            ComposerKt.sourceInformationMarkerStart($composer2, 1650457842, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
            boolean zChanged = $composer2.changed(bottomSheetState) | (($dirty3 & 896) == 256);
            GroupMenuBottomSheetKt$GroupMenuBottomSheet$1$1 groupMenuBottomSheetKt$GroupMenuBottomSheet$1$1RememberedValue = $composer2.rememberedValue();
            if (zChanged || groupMenuBottomSheetKt$GroupMenuBottomSheet$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                groupMenuBottomSheetKt$GroupMenuBottomSheet$1$1RememberedValue = new GroupMenuBottomSheetKt$GroupMenuBottomSheet$1$1(bottomSheetState, onDismiss, null);
                $composer2.updateRememberedValue(groupMenuBottomSheetKt$GroupMenuBottomSheet$1$1RememberedValue);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(targetValue, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) groupMenuBottomSheetKt$GroupMenuBottomSheet$1$1RememberedValue, $composer2, 0);
            ComposerKt.sourceInformationMarkerStart($composer2, 1650465159, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState showReportDialog$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1650467143, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            final MutableState showShareDialog$delegate3 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1650469159, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            }
            final MutableState showInviteDialog$delegate2 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1650471271, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue5 = objMutableStateOf$default4;
            }
            final MutableState showExitGroupDialog$delegate2 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1650475257, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
            Object objRememberedValue6 = $composer2.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty3;
                Object objListOf = CollectionsKt.listOf((Object[]) new MenuItemData[]{new MenuItemData(ReportKt.getReport(Icons.INSTANCE.getDefault()), "\u4e3e\u62a5\u7fa4\u804a", new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$14$0(showReportDialog$delegate);
                    }
                }), new MenuItemData(WallpaperKt.getWallpaper(Icons.INSTANCE.getDefault()), "\u8bbe\u7f6e\u804a\u5929\u80cc\u666f", new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$14$1(context2, groupId2, groupName2, onDismiss);
                    }
                }), new MenuItemData(FolderKt.getFolder(Icons.INSTANCE.getDefault()), "\u7fa4\u7f51\u76d8", new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$14$2(context2, groupId2, groupName2, onDismiss);
                    }
                }), new MenuItemData(PersonAddKt.getPersonAdd(Icons.INSTANCE.getDefault()), "\u9080\u8bf7\u597d\u53cb", new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$14$3(showInviteDialog$delegate2);
                    }
                }), new MenuItemData(ShareKt.getShare(Icons.INSTANCE.getDefault()), "\u5206\u4eab\u7fa4\u804a", new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$14$4(showShareDialog$delegate3);
                    }
                }), new MenuItemData(InfoKt.getInfo(Icons.INSTANCE.getDefault()), "\u7fa4\u804a\u8be6\u60c5", new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$14$5(onDismiss, context2, groupId2, groupName2);
                    }
                }), new MenuItemData(SettingsKt.getSettings(Icons.INSTANCE.getDefault()), "\u7fa4\u804a\u8bbe\u7f6e", new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$14$6(onDismiss, context2, groupId2, groupName2);
                    }
                })});
                $composer2.updateRememberedValue(objListOf);
                objRememberedValue6 = objListOf;
            } else {
                $dirty = $dirty3;
            }
            final List menuItems = (List) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1650528584, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
            Object objRememberedValue7 = $composer2.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                showShareDialog$delegate = showShareDialog$delegate3;
                Object objListOf2 = CollectionsKt.listOf(new MenuItemData(ExitToAppKt.getExitToApp(Icons.INSTANCE.getDefault()), "\u9000\u51fa\u7fa4\u804a", new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$15$0(showExitGroupDialog$delegate2);
                    }
                }));
                $composer2.updateRememberedValue(objListOf2);
                objRememberedValue7 = objListOf2;
            } else {
                showShareDialog$delegate = showShareDialog$delegate3;
            }
            final List dangerousItems = (List) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            BottomSheetScaffoldKt.m2461BottomSheetScaffoldsdMYb0k(ComposableLambdaKt.rememberComposableLambda(-1079257836, true, new Function3() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$16(menuItems, dangerousItems, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), BottomSheetScaffoldKt.rememberBottomSheetScaffoldState(bottomSheetState, null, $composer2, 0, 2), C1834Dp.m7806constructorimpl(200), 0.0f, null, 0L, 0L, 0.0f, 0.0f, null, false, null, null, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-181345814, true, new Function3() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$17(bottomSheetState, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 3126, 1572864, 65520);
            if (GroupMenuBottomSheet$lambda$3(showReportDialog$delegate)) {
                $composer2.startReplaceGroup(-370173402);
                ComposerKt.sourceInformation($composer2, "191@7010L28,192@7064L160,187@6875L359");
                ComposerKt.sourceInformationMarkerStart($composer2, 1650631201, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
                Object objRememberedValue8 = $composer2.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda23
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$18$0(showReportDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    objRememberedValue8 = obj2;
                }
                Function0 function0 = (Function0) objRememberedValue8;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1650633061, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
                int $dirty4 = $dirty;
                boolean zChangedInstance = $composer2.changedInstance(context2) | (($dirty4 & 896) == 256);
                Object objRememberedValue9 = $composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda24
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$19$0(onDismiss, context2, showReportDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                    objRememberedValue9 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                showInviteDialog$delegate = showInviteDialog$delegate2;
                showShareDialog$delegate2 = showShareDialog$delegate;
                z = true;
                z2 = false;
                str = "CC(remember):GroupMenuBottomSheet.kt#9igjgp";
                context = context2;
                showExitGroupDialog$delegate = showExitGroupDialog$delegate2;
                $dirty2 = $dirty4;
                ReportDialogKt.ReportDialog(groupId, 2, groupName, function0, (Function0) objRememberedValue9, $composer2, ($dirty4 & 14) | 3120 | (($dirty4 << 3) & 896), 0);
                $composer2 = $composer2;
            } else {
                showExitGroupDialog$delegate = showExitGroupDialog$delegate2;
                context = context2;
                z = true;
                showInviteDialog$delegate = showInviteDialog$delegate2;
                $dirty2 = $dirty;
                z2 = false;
                str = "CC(remember):GroupMenuBottomSheet.kt#9igjgp";
                $composer2 = $composer2;
                showShareDialog$delegate2 = showShareDialog$delegate;
                $composer2.startReplaceGroup(-376996099);
            }
            $composer2.endReplaceGroup();
            if (GroupMenuBottomSheet$lambda$6(showShareDialog$delegate2)) {
                $composer2.startReplaceGroup(-369763582);
                ComposerKt.sourceInformation($composer2, "206@7428L27,202@7294L171");
                ComposerKt.sourceInformationMarkerStart($composer2, 1650644576, str);
                Composer composer = $composer2;
                Object objRememberedValue10 = composer.rememberedValue();
                if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$20$0(showShareDialog$delegate2);
                        }
                    };
                    composer.updateRememberedValue(obj4);
                    objRememberedValue10 = obj4;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ShareDialogKt.ShareDialog(groupId, 2, groupName, (Function0) objRememberedValue10, $composer2, ($dirty2 & 14) | 3120 | (($dirty2 << 3) & 896));
            } else {
                $composer2.startReplaceGroup(-376996099);
            }
            $composer2.endReplaceGroup();
            if (GroupMenuBottomSheet$lambda$9(showInviteDialog$delegate)) {
                $composer2.startReplaceGroup(-369527269);
                ComposerKt.sourceInformation($composer2, "215@7639L28,216@7693L131,212@7528L306");
                ComposerKt.sourceInformationMarkerStart($composer2, 1650651329, str);
                Composer composer2 = $composer2;
                Object objRememberedValue11 = composer2.rememberedValue();
                if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$21$0(showInviteDialog$delegate);
                        }
                    };
                    composer2.updateRememberedValue(obj5);
                    objRememberedValue11 = obj5;
                }
                Function0 function02 = (Function0) objRememberedValue11;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1650653160, str);
                boolean zChangedInstance2 = $composer2.changedInstance(context);
                Composer composer3 = $composer2;
                Object objRememberedValue12 = composer3.rememberedValue();
                if (zChangedInstance2 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    Object obj6 = new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$22$0(context, showInviteDialog$delegate);
                        }
                    };
                    composer3.updateRememberedValue(obj6);
                    objRememberedValue12 = obj6;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                groupId2 = groupId;
                InviteToGroupDialogKt.InviteToGroupDialog(groupId2, groupName, function02, (Function0) objRememberedValue12, $composer2, ($dirty2 & 14) | 384 | ($dirty2 & 112));
                groupName2 = groupName;
            } else {
                groupId2 = groupId;
                groupName2 = groupName;
                $composer2.startReplaceGroup(-376996099);
            }
            $composer2.endReplaceGroup();
            if (GroupMenuBottomSheet$lambda$12(showExitGroupDialog$delegate)) {
                $composer2.startReplaceGroup(-369123091);
                ComposerKt.sourceInformation($composer2, "227@7978L1233,252@9237L31,225@7902L1376");
                ComposerKt.sourceInformationMarkerStart($composer2, 1650663382, str);
                boolean zChangedInstance3 = (($dirty2 & 896) == 256 ? z : z2) | $composer2.changedInstance(context);
                if (($dirty2 & 14) != 4) {
                    z = z2;
                }
                boolean z3 = zChangedInstance3 | z;
                Composer composer4 = $composer2;
                Object objRememberedValue13 = composer4.rememberedValue();
                if (z3 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    Object obj7 = new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$23$0(onDismiss, context, showExitGroupDialog$delegate, groupId2);
                        }
                    };
                    composer4.updateRememberedValue(obj7);
                    objRememberedValue13 = obj7;
                }
                Function0 function03 = (Function0) objRememberedValue13;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1650702468, str);
                Composer composer5 = $composer2;
                Object objRememberedValue14 = composer5.rememberedValue();
                if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    Object obj8 = new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$24$0(showExitGroupDialog$delegate);
                        }
                    };
                    composer5.updateRememberedValue(obj8);
                    objRememberedValue14 = obj8;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ExitGroupDialog(groupName2, function03, (Function0) objRememberedValue14, $composer2, (($dirty2 >> 3) & 14) | 384);
            } else {
                $composer2.startReplaceGroup(-376996099);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$25(groupId2, groupName2, onDismiss, $changed, (Composer) obj9, ((Integer) obj10).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GroupMenuBottomSheet$lambda$0$0(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return true;
    }

    private static final boolean GroupMenuBottomSheet$lambda$3(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupMenuBottomSheet$lambda$4(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GroupMenuBottomSheet$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupMenuBottomSheet$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final void GroupMenuBottomSheet$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean GroupMenuBottomSheet$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final boolean GroupMenuBottomSheet$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void GroupMenuBottomSheet$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$14$0(MutableState $showReportDialog$delegate) {
        GroupMenuBottomSheet$lambda$4($showReportDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$14$1(Context $context, String $groupId, String $groupName, Function0 $onDismiss) {
        ChatBackgroundActivity.INSTANCE.start($context, $groupId, $groupName);
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$14$2(Context $context, String $groupId, String $groupName, Function0 $onDismiss) {
        GroupDiskActivity.INSTANCE.start($context, $groupId, $groupName);
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$14$3(MutableState $showInviteDialog$delegate) {
        GroupMenuBottomSheet$lambda$10($showInviteDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$14$4(MutableState $showShareDialog$delegate) {
        GroupMenuBottomSheet$lambda$7($showShareDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$14$5(Function0 $onDismiss, Context $context, String $groupId, String $groupName) {
        $onDismiss.invoke();
        Intent intent = new Intent($context, (Class<?>) GroupInfoActivity.class);
        intent.putExtra("groupId", $groupId);
        intent.putExtra("groupName", $groupName);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$14$6(Function0 $onDismiss, Context $context, String $groupId, String $groupName) {
        $onDismiss.invoke();
        Intent intent = new Intent($context, (Class<?>) GroupSettingsActivity.class);
        intent.putExtra("groupId", $groupId);
        intent.putExtra("groupName", $groupName);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$15$0(MutableState $showExitGroupDialog$delegate) {
        GroupMenuBottomSheet$lambda$13($showExitGroupDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GroupMenuBottomSheet$lambda$16(final java.util.List r67, final java.util.List r68, androidx.compose.foundation.layout.ColumnScope r69, androidx.compose.runtime.Composer r70, int r71) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$16(java.util.List, java.util.List, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$16$0$1$0(final List $menuItems, final List $dangerousItems, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$GroupMenuBottomSheetKt.INSTANCE.getLambda$1389820777$app_debug(), 3, null);
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$GroupMenuBottomSheet$lambda$16$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((MenuItemData) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MenuItemData menuItemData) {
                return null;
            }
        };
        LazyColumn.items($menuItems.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$GroupMenuBottomSheet$lambda$16$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($menuItems.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$GroupMenuBottomSheet$lambda$16$0$1$0$$inlined$items$default$4
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
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    int i = $dirty & 14;
                    MenuItemData menuItemData = (MenuItemData) $menuItems.get(it);
                    $composer.startReplaceGroup(-2018281275);
                    ComposerKt.sourceInformation($composer, "CN(menuItem)*146@5595L195:GroupMenuBottomSheet.kt#2suaub");
                    GroupMenuBottomSheetKt.GroupMenuItem(menuItemData.getIcon(), menuItemData.getText(), menuItemData.getOnClick(), false, $composer, 0, 8);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                $composer.skipToGroupEnd();
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$GroupMenuBottomSheetKt.INSTANCE.getLambda$1418567762$app_debug(), 3, null);
        final Function1 function12 = new Function1() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$GroupMenuBottomSheet$lambda$16$0$1$0$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((MenuItemData) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MenuItemData menuItemData) {
                return null;
            }
        };
        LazyColumn.items($dangerousItems.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$GroupMenuBottomSheet$lambda$16$0$1$0$$inlined$items$default$7
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke($dangerousItems.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$GroupMenuBottomSheet$lambda$16$0$1$0$$inlined$items$default$8
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
                if ($composer.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(802480018, $dirty, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                    }
                    int i = $dirty & 14;
                    MenuItemData menuItemData = (MenuItemData) $dangerousItems.get(it);
                    $composer.startReplaceGroup(-319782516);
                    ComposerKt.sourceInformation($composer, "CN(menuItem)*160@6130L243:GroupMenuBottomSheet.kt#2suaub");
                    GroupMenuBottomSheetKt.GroupMenuItem(menuItemData.getIcon(), menuItemData.getText(), menuItemData.getOnClick(), true, $composer, 3072, 0);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                $composer.skipToGroupEnd();
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$17(final SheetState $bottomSheetState, PaddingValues it, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(it, "it");
        ComposerKt.sourceInformation($composer, "CN(it)177@6652L152,174@6557L257:GroupMenuBottomSheet.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-181345814, $changed, -1, "com.yhchat.canarys.ui.components.GroupMenuBottomSheet.<anonymous> (GroupMenuBottomSheet.kt:174)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1820335906, "CC(remember):GroupMenuBottomSheet.kt#9igjgp");
            boolean zChanged = $composer.changed($bottomSheetState);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return GroupMenuBottomSheetKt.GroupMenuBottomSheet$lambda$17$0$0($bottomSheetState);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            BoxKt.Box(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxSize$default, false, null, null, null, (Function0) objRememberedValue, 15, null), $composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$17$0$0(SheetState $bottomSheetState) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new GroupMenuBottomSheetKt$GroupMenuBottomSheet$3$1$1$1($bottomSheetState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$18$0(MutableState $showReportDialog$delegate) {
        GroupMenuBottomSheet$lambda$4($showReportDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$19$0(Function0 $onDismiss, Context $context, MutableState $showReportDialog$delegate) {
        GroupMenuBottomSheet$lambda$4($showReportDialog$delegate, false);
        $onDismiss.invoke();
        Toast.makeText($context, "\u4e3e\u62a5\u5df2\u63d0\u4ea4", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$20$0(MutableState $showShareDialog$delegate) {
        GroupMenuBottomSheet$lambda$7($showShareDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$21$0(MutableState $showInviteDialog$delegate) {
        GroupMenuBottomSheet$lambda$10($showInviteDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$22$0(Context $context, MutableState $showInviteDialog$delegate) {
        GroupMenuBottomSheet$lambda$10($showInviteDialog$delegate, false);
        Toast.makeText($context, "\u9080\u8bf7\u6210\u529f", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$23$0(Function0 $onDismiss, Context $context, MutableState $showExitGroupDialog$delegate, String $groupId) {
        GroupMenuBottomSheet$lambda$13($showExitGroupDialog$delegate, false);
        $onDismiss.invoke();
        AppDatabase db = AppDatabase.INSTANCE.getDatabase($context);
        TokenRepository tokenRepository = new TokenRepository(db.userTokenDao(), $context);
        UserRepository userRepository = new UserRepository(ApiClient.INSTANCE.getApiService(), tokenRepository);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new GroupMenuBottomSheetKt$GroupMenuBottomSheet$9$1$1(userRepository, $groupId, $context, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroupMenuBottomSheet$lambda$24$0(MutableState $showExitGroupDialog$delegate) {
        GroupMenuBottomSheet$lambda$13($showExitGroupDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final void ExitGroupDialog(final String groupName, final Function0<Unit> onConfirm, final Function0<Unit> onDismiss, Composer $composer, final int $changed) {
        Composer $composer2;
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Composer $composer3 = $composer.startRestartGroup(-475717533);
        ComposerKt.sourceInformation($composer3, "C(ExitGroupDialog)N(groupName,onConfirm,onDismiss)278@9770L309,288@10105L98,275@9691L53,266@9426L783:GroupMenuBottomSheet.kt#2suaub");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(groupName) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onConfirm) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-475717533, $dirty, -1, "com.yhchat.canarys.ui.components.ExitGroupDialog (GroupMenuBottomSheet.kt:265)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-1801891557, true, new Function2() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMenuBottomSheetKt.ExitGroupDialog$lambda$0(onConfirm, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1384002855, true, new Function2() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMenuBottomSheetKt.ExitGroupDialog$lambda$1(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$GroupMenuBottomSheetKt.INSTANCE.m11024getLambda$966114153$app_debug(), ComposableLambdaKt.rememberComposableLambda(1390313846, true, new Function2() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMenuBottomSheetKt.ExitGroupDialog$lambda$2(groupName, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 6) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GroupMenuBottomSheetKt.ExitGroupDialog$lambda$3(groupName, onConfirm, onDismiss, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExitGroupDialog$lambda$2(String $groupName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C276@9705L29:GroupMenuBottomSheet.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1390313846, $changed, -1, "com.yhchat.canarys.ui.components.ExitGroupDialog.<anonymous> (GroupMenuBottomSheet.kt:276)");
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u9000\u51fa\u7fa4\u804a\u300c" + $groupName + "\u300d\u5417\uff1f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExitGroupDialog$lambda$0(Function0 $onConfirm, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C282@9934L11,281@9869L100,279@9784L285:GroupMenuBottomSheet.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1801891557, $changed, -1, "com.yhchat.canarys.ui.components.ExitGroupDialog.<anonymous> (GroupMenuBottomSheet.kt:279)");
            }
            ButtonKt.Button($onConfirm, null, false, null, ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$GroupMenuBottomSheetKt.INSTANCE.m11022getLambda$166316245$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExitGroupDialog$lambda$1(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C289@10119L74:GroupMenuBottomSheet.kt#2suaub");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1384002855, $changed, -1, "com.yhchat.canarys.ui.components.ExitGroupDialog.<anonymous> (GroupMenuBottomSheet.kt:289)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$GroupMenuBottomSheetKt.INSTANCE.getLambda$1636798652$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x02f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void GroupMenuItem(final androidx.compose.p000ui.graphics.vector.ImageVector r54, final java.lang.String r55, final kotlin.jvm.functions.Function0<kotlin.Unit> r56, boolean r57, androidx.compose.runtime.Composer r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 792
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.components.GroupMenuBottomSheetKt.GroupMenuItem(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, kotlin.jvm.functions.Function0, boolean, androidx.compose.runtime.Composer, int, int):void");
    }
}
