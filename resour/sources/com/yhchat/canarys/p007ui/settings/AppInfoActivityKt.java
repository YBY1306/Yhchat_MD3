package com.yhchat.canarys.p007ui.settings;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CodeKt;
import androidx.compose.material.icons.filled.DescriptionKt;
import androidx.compose.material.icons.filled.PersonKt;
import androidx.compose.material.icons.filled.SystemUpdateKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.ContentScale;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.yhchat.canarys.C3011R;
import com.yhchat.canarys.data.model.UpdateInfo;
import com.yhchat.canarys.p007ui.chat.ChatActivity;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppInfoActivity.kt */
@Metadata(m168d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a2\u0006\u0002\u0010\r\u001a5\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0003\u00a2\u0006\u0002\u0010\u0013\u001aZ\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0015\b\u0002\u0010\u0018\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007\u00a2\u0006\u0002\b\u00192\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u0005H\u0003\u00a2\u0006\u0002\u0010\u001d\u001a9\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u00a2\u0006\u0002\u0010#\u001a;\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u00a2\u0006\u0002\u0010)\u001a7\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a2\u0006\u0002\u0010,\u00a8\u0006-\u00b2\u0006\n\u0010.\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u0010/\u001a\u00020\nX\u008a\u008e\u0002\u00b2\u0006\n\u00100\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u00101\u001a\u000202X\u008a\u0084\u0002\u00b2\u0006\n\u00103\u001a\u00020\nX\u008a\u008e\u0002\u00b2\u0006\n\u00104\u001a\u00020\nX\u008a\u008e\u0002\u00b2\u0006\n\u00105\u001a\u00020\nX\u008a\u008e\u0002\u00b2\u0006\n\u00106\u001a\u00020\nX\u008a\u008e\u0002\u00b2\u0006\n\u00105\u001a\u00020\nX\u008a\u008e\u0002"}, m169d2 = {"AppInfoScreen", "", "updateViewModel", "Lcom/yhchat/canarys/ui/settings/UpdateViewModel;", "isLatestBuildPreview", "", "onBack", "Lkotlin/Function0;", "onDeveloperClick", "Lkotlin/Function1;", "", "onGithubClick", "onDownloadUpdate", "(Lcom/yhchat/canarys/ui/settings/UpdateViewModel;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ChatDebugDialog", "onDismiss", "onConfirm", "Lkotlin/Function2;", "", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AppInfoItem", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "title", "content", "Landroidx/compose/runtime/Composable;", "onClick", "showArrow", "isLoading", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "DeveloperText", "developer1", "developer2", "onDeveloper1Click", "onDeveloper2Click", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "UpdateDialog", "updateInfo", "Lcom/yhchat/canarys/data/model/UpdateInfo;", "isPreviewMode", "onUpdate", "(Lcom/yhchat/canarys/data/model/UpdateInfo;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "VersionSettingDialog", "currentVersion", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_debug", "showImageViewer", "currentImageUrl", "showChatDebugDialog", "updateState", "Lcom/yhchat/canarys/ui/settings/UpdateState;", ChatSearchActivity.EXTRA_CHAT_ID, "chatTypeText", "errorMessage", "version"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class AppInfoActivityKt {
    public static final Unit AppInfoItem$lambda$1(ImageVector imageVector, String str, Function2 function2, Function0 function0, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        AppInfoItem(imageVector, str, function2, function0, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$11(UpdateViewModel updateViewModel, boolean z, Function0 function0, Function1 function1, Function0 function02, Function1 function12, int i, Composer composer, int i2) {
        AppInfoScreen(updateViewModel, z, function0, function1, function02, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit ChatDebugDialog$lambda$12(Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        ChatDebugDialog(function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit DeveloperText$lambda$1(String str, String str2, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        DeveloperText(str, str2, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit UpdateDialog$lambda$4(UpdateInfo updateInfo, boolean z, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        UpdateDialog(updateInfo, z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit VersionSettingDialog$lambda$9(String str, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        VersionSettingDialog(str, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AppInfoScreen(final UpdateViewModel updateViewModel, final boolean isLatestBuildPreview, final Function0<Unit> function0, final Function1<? super String, Unit> function1, final Function0<Unit> function02, final Function1<? super String, Unit> function12, Composer $composer, final int $changed) {
        boolean z;
        final Function1<? super String, Unit> function13;
        String str;
        String str2;
        Composer composer;
        final UpdateViewModel updateViewModel2 = updateViewModel;
        Composer $composer2 = $composer.startRestartGroup(-931675940);
        ComposerKt.sourceInformation($composer2, "C(AppInfoScreen)N(updateViewModel,isLatestBuildPreview,onBack,onDeveloperClick,onGithubClick,onDownloadUpdate)131@4385L34,132@4447L31,133@4510L34,134@4576L7,136@4640L16,138@4666L7180:AppInfoActivity.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(updateViewModel2) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            z = isLatestBuildPreview;
            $dirty |= $composer2.changed(z) ? 32 : 16;
        } else {
            z = isLatestBuildPreview;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            function13 = function1;
            $dirty |= $composer2.changedInstance(function13) ? 2048 : 1024;
        } else {
            function13 = function1;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer2.changedInstance(function12) ? 131072 : 65536;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-931675940, $dirty2, -1, "com.yhchat.canarys.ui.settings.AppInfoScreen (AppInfoActivity.kt:130)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1987372514, "CC(remember):AppInfoActivity.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1987370533, "CC(remember):AppInfoActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1987368514, "CC(remember):AppInfoActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                str = "CC(remember):AppInfoActivity.kt#9igjgp";
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            } else {
                str = "CC(remember):AppInfoActivity.kt#9igjgp";
            }
            final MutableState showChatDebugDialog$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            final State updateState$delegate = SnapshotStateKt.collectAsState(updateViewModel.getUpdateState(), null, $composer2, 0, 1);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                $composer2.createNode(constructor);
            } else {
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 1092476776, "C140@4738L620,159@5365L4470,139@4711L5124:AppInfoActivity.kt#acwjhs");
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(363071910, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.AppInfoScreen$lambda$10$0(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54);
            String str3 = str;
            final boolean z2 = z;
            Composer composer2 = $composer2;
            Function3 function3 = new Function3() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AppInfoActivityKt.AppInfoScreen$lambda$10$1(z2, context, updateViewModel, function02, function13, updateState$delegate, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            };
            updateViewModel2 = updateViewModel;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-64207055, true, function3, composer2, 54), composer2, 805306416, 509);
            if (AppInfoScreen$lambda$7(showChatDebugDialog$delegate)) {
                composer2.startReplaceGroup(1097387268);
                ComposerKt.sourceInformation(composer2, "285@9921L31,286@9978L320,284@9880L428");
                str2 = str3;
                ComposerKt.sourceInformationMarkerStart(composer2, 866684801, str2);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppInfoActivityKt.AppInfoScreen$lambda$10$2$0(showChatDebugDialog$delegate);
                        }
                    };
                    composer2.updateRememberedValue(obj);
                    objRememberedValue4 = obj;
                }
                Function0 function03 = (Function0) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerStart(composer2, 866686914, str2);
                boolean zChangedInstance = composer2.changedInstance(context);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            return AppInfoActivityKt.AppInfoScreen$lambda$10$3$0(context, showChatDebugDialog$delegate, (String) obj3, ((Integer) obj4).intValue());
                        }
                    };
                    composer2.updateRememberedValue(obj2);
                    objRememberedValue5 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ChatDebugDialog(function03, (Function2) objRememberedValue5, composer2, 6);
            } else {
                str2 = str3;
                composer2.startReplaceGroup(1087581472);
            }
            composer2.endReplaceGroup();
            final UpdateInfo updateInfo = AppInfoScreen$lambda$9(updateState$delegate).getUpdateInfo();
            if (updateInfo == null) {
                composer2.startReplaceGroup(1097897372);
                composer2.endReplaceGroup();
                composer = $composer2;
            } else {
                composer2.startReplaceGroup(1097897373);
                ComposerKt.sourceInformation(composer2, "");
                if (updateInfo.getHasUpdate()) {
                    composer2.startReplaceGroup(1737277661);
                    ComposerKt.sourceInformation(composer2, "304@10571L73,307@10673L134,301@10434L387");
                    ComposerKt.sourceInformationMarkerStart(composer2, -1883616941, str2);
                    boolean zChangedInstance2 = $composer2.changedInstance(updateViewModel2);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppInfoActivityKt.AppInfoScreen$lambda$10$4$0$0(updateViewModel2);
                            }
                        };
                        composer2.updateRememberedValue(obj3);
                        objRememberedValue6 = obj3;
                    }
                    Function0 function04 = (Function0) objRememberedValue6;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1883613616, str2);
                    boolean zChanged = ((458752 & $dirty2) == 131072) | $composer2.changed(updateInfo) | $composer2.changedInstance(updateViewModel2);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda12
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppInfoActivityKt.AppInfoScreen$lambda$10$4$1$0(function12, updateInfo, updateViewModel2);
                            }
                        };
                        composer2.updateRememberedValue(obj4);
                        objRememberedValue7 = obj4;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    UpdateDialog(updateInfo, isLatestBuildPreview, function04, (Function0) objRememberedValue7, composer2, $dirty2 & 112, 0);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                    composer = $composer2;
                } else {
                    composer2.startReplaceGroup(1737695634);
                    ComposerKt.sourceInformation(composer2, "313@10878L15,313@10851L42,317@10967L73,322@11161L202,316@10919L458");
                    ComposerKt.sourceInformationMarkerStart(composer2, -1883607175, str2);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        composer = $composer2;
                        Object obj5 = (Function2) new AppInfoActivityKt$AppInfoScreen$1$5$3$1(null);
                        composer2.updateRememberedValue(obj5);
                        objRememberedValue8 = obj5;
                    } else {
                        composer = $composer2;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    EffectsKt.LaunchedEffect(updateInfo, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1883604269, str2);
                    boolean zChangedInstance3 = $composer2.changedInstance(updateViewModel2);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        Object obj6 = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda13
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return AppInfoActivityKt.AppInfoScreen$lambda$10$4$3$0(updateViewModel2);
                            }
                        };
                        composer2.updateRememberedValue(obj6);
                        objRememberedValue9 = obj6;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue9, ComposableLambdaKt.rememberComposableLambda(137996174, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj7, Object obj8) {
                            return AppInfoActivityKt.AppInfoScreen$lambda$10$4$4(updateViewModel2, (Composer) obj7, ((Integer) obj8).intValue());
                        }
                    }, composer2, 54), null, null, null, ComposableSingletons$AppInfoActivityKt.INSTANCE.getLambda$570076818$app_debug(), ComposableSingletons$AppInfoActivityKt.INSTANCE.m11652getLambda$1469386669$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1769520, 0, 16284);
                    composer2.endReplaceGroup();
                }
                Unit unit = Unit.INSTANCE;
                composer2.endReplaceGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            final String error = AppInfoScreen$lambda$9(updateState$delegate).getError();
            if (error == null) {
                composer2.startReplaceGroup(1098922201);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(1098922202);
                ComposerKt.sourceInformation(composer2, "*335@11485L60,340@11651L173,339@11606L15,334@11441L393");
                ComposerKt.sourceInformationMarkerStart(composer2, -351089225, str2);
                boolean zChangedInstance4 = $composer2.changedInstance(updateViewModel2);
                Composer composer3 = composer2;
                Object objRememberedValue10 = composer3.rememberedValue();
                if (zChangedInstance4 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    Object obj7 = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AppInfoActivityKt.AppInfoScreen$lambda$10$5$0$0(updateViewModel2);
                        }
                    };
                    composer3.updateRememberedValue(obj7);
                    objRememberedValue10 = obj7;
                }
                ComposerKt.sourceInformationMarkerEnd(composer2);
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue10, ComposableLambdaKt.rememberComposableLambda(1469240995, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj8, Object obj9) {
                        return AppInfoActivityKt.AppInfoScreen$lambda$10$5$1(updateViewModel2, (Composer) obj8, ((Integer) obj9).intValue());
                    }
                }, composer2, 54), null, null, null, ComposableSingletons$AppInfoActivityKt.INSTANCE.m11653getLambda$1692659033$app_debug(), ComposableLambdaKt.rememberComposableLambda(738091432, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj8, Object obj9) {
                        return AppInfoActivityKt.AppInfoScreen$lambda$10$5$2(error, (Composer) obj8, ((Integer) obj9).intValue());
                    }
                }, composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, 1769520, 0, 16284);
                Unit unit3 = Unit.INSTANCE;
                composer2.endReplaceGroup();
                Unit unit4 = Unit.INSTANCE;
            }
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj8, Object obj9) {
                    return AppInfoActivityKt.AppInfoScreen$lambda$11(updateViewModel2, isLatestBuildPreview, function0, function1, function02, function12, $changed, (Composer) obj8, ((Integer) obj9).intValue());
                }
            });
        }
    }

    private static final boolean AppInfoScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void AppInfoScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final UpdateState AppInfoScreen$lambda$9(State<UpdateState> state) {
        return (UpdateState) state.getValue();
    }

    public static final Unit AppInfoScreen$lambda$10$0(final Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C149@5053L281,141@4752L596:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(363071910, $changed, -1, "com.yhchat.canarys.ui.settings.AppInfoScreen.<anonymous>.<anonymous> (AppInfoActivity.kt:141)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$AppInfoActivityKt.INSTANCE.getLambda$129373794$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(1675457696, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.AppInfoScreen$lambda$10$0$0($onBack, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$0$0(Function0 $onBack, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C150@5075L241:AppInfoActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1675457696, $changed, -1, "com.yhchat.canarys.ui.settings.AppInfoScreen.<anonymous>.<anonymous>.<anonymous> (AppInfoActivity.kt:150)");
            }
            IconButtonKt.IconButton($onBack, null, false, null, null, ComposableSingletons$AppInfoActivityKt.INSTANCE.m11659getLambda$202654429$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$1(final boolean $isLatestBuildPreview, final Context $context, final UpdateViewModel $updateViewModel, Function0 $onGithubClick, final Function1 $onDeveloperClick, State $updateState$delegate, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues)164@5535L21,160@5392L4437:AppInfoActivity.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-64207055, $dirty, -1, "com.yhchat.canarys.ui.settings.AppInfoScreen.<anonymous>.<anonymous> (AppInfoActivity.kt:160)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(ScrollKt.verticalScroll$default(PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues), ScrollKt.rememberScrollState(0, $composer, 0, 1), false, null, false, 14, null), C1834Dp.m7806constructorimpl(24));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((384 << 3) & 112) << 6) & 896) | 6;
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1386191963, "C169@5761L7,180@6183L27,178@6116L27,168@5678L618,186@6322L41,191@6502L10,189@6409L178,195@6613L40,200@6802L10,201@6862L11,198@6698L206,204@6930L41,206@6997L19,208@7042L41,213@7224L415,210@7109L544,223@7679L41,238@8300L313,226@7766L946,249@8738L41,251@8805L181,258@9012L41,260@9067L387,272@9480L41,276@9652L10,277@9712L11,274@9535L284:AppInfoActivity.kt#acwjhs");
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ImageRequest imageRequestBuild = new ImageRequest.Builder((Context) objConsume).data(Integer.valueOf(C3011R.mipmap.ic_launcher)).crossfade(true).build();
            Modifier modifierClip = ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(120)), RoundedCornerShapeKt.getCircleShape());
            ComposerKt.sourceInformationMarkerStart($composer, -1756387402, "CC(remember):AppInfoActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function02 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -1756389546, "CC(remember):AppInfoActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(imageRequestBuild, "AppIcon", ClickableKt.m526combinedClickablehoGz1lA$default(modifierClip, false, null, null, null, function02, null, false, null, (Function0) objRememberedValue2, 239, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1572912, 0, 4024);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            TextKt.m3359Text4IGK_g(AppInfoActivity.APP_NAME, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineMedium(), $composer, 196614, 0, 65502);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u7248\u672c 20.9 260131", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), $composer, 6);
            DividerKt.m2738HorizontalDivider9IZ8Weo(null, 0.0f, 0L, $composer, 0, 7);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), $composer, 6);
            AppInfoItem(PersonKt.getPerson(Icons.INSTANCE.getDefault()), "\u5f00\u53d1\u8005", ComposableLambdaKt.rememberComposableLambda(-997383898, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return AppInfoActivityKt.AppInfoScreen$lambda$10$1$0$2($onDeveloperClick, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), null, false, false, $composer, 432, 56);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            ImageVector systemUpdate = SystemUpdateKt.getSystemUpdate(Icons.INSTANCE.getDefault());
            String str = $isLatestBuildPreview ? "\u68c0\u67e5\u66f4\u65b0 " : "\u68c0\u67e5\u66f4\u65b0";
            Function2<Composer, Integer, Unit> lambda$134321130$app_debug = $isLatestBuildPreview ? ComposableSingletons$AppInfoActivityKt.INSTANCE.getLambda$134321130$app_debug() : null;
            ComposerKt.sourceInformationMarkerStart($composer, -1756319372, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($isLatestBuildPreview) | $composer.changedInstance($context) | $composer.changedInstance($updateViewModel);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppInfoActivityKt.AppInfoScreen$lambda$10$1$0$3$0($isLatestBuildPreview, $context, $updateViewModel);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AppInfoItem(systemUpdate, str, lambda$134321130$app_debug, (Function0) objRememberedValue3, true, AppInfoScreen$lambda$9($updateState$delegate).isLoading(), $composer, 24576, 0);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            AppInfoItem(CodeKt.getCode(Icons.INSTANCE.getDefault()), "GitHub \u6e90\u4ee3\u7801", null, $onGithubClick, true, false, $composer, 24624, 36);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            AppInfoItem(DescriptionKt.getDescription(Icons.INSTANCE.getDefault()), "\u8bb8\u53ef\u8bc1", ComposableSingletons$AppInfoActivityKt.INSTANCE.m11650getLambda$1221349043$app_debug(), null, false, false, $composer, 432, 56);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u5168\u7403\u9996\u6b3e\u7eaf\u51c0\u81ea\u7531\u7684\u4e91\u6e56\u7b2c\u4e09\u65b9\u5ba2\u6237\u7aef\uff0c\u7531\u575a\u5982\u78d0\u77f3\u7684AGPL\u534f\u8bae\u4e0e\u4e16\u754c\u9876\u7ea7\u4eba\u5de5\u667a\u80fd\u6280\u672f\u5f3a\u529b\u9a71\u52a8\u3002", PaddingKt.m1052paddingVpY3zN4$default(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16), 0.0f, 2, null), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 54, 0, 65528);
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

    public static final Unit AppInfoScreen$lambda$10$1$0$2(final Function1 $onDeveloperClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C217@7447L53,218@7546L53,214@7246L375:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-997383898, $changed, -1, "com.yhchat.canarys.ui.settings.AppInfoScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppInfoActivity.kt:214)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -708211781, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onDeveloperClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda40
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppInfoActivityKt.AppInfoScreen$lambda$10$1$0$2$0$0($onDeveloperClick);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -708208613, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChanged2 = $composer.changed($onDeveloperClick);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppInfoActivityKt.AppInfoScreen$lambda$10$1$0$2$1$0($onDeveloperClick);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            DeveloperText(AppInfoActivity.DEVELOPER_NAME_1, AppInfoActivity.DEVELOPER_NAME_2, function0, (Function0) objRememberedValue2, $composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$1$0$2$0$0(Function1 $onDeveloperClick) {
        $onDeveloperClick.invoke(AppInfoActivity.DEVELOPER_URL_1);
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$1$0$2$1$0(Function1 $onDeveloperClick) {
        $onDeveloperClick.invoke(AppInfoActivity.DEVELOPER_URL_2);
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$1$0$3$0(boolean $isLatestBuildPreview, Context $context, UpdateViewModel $updateViewModel) {
        if ($isLatestBuildPreview) {
            Toast.makeText($context, "\u4f60\u73b0\u5728\u662f\u6700\u65b0\u7248\u672c\u4e86", 0).show();
        } else {
            $updateViewModel.checkForUpdate($isLatestBuildPreview);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$2$0(MutableState $showChatDebugDialog$delegate) {
        AppInfoScreen$lambda$8($showChatDebugDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$3$0(Context $context, MutableState $showChatDebugDialog$delegate, String chatId, int chatType) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intent intent = new Intent($context, (Class<?>) ChatActivity.class);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, chatId);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, chatType);
        $context.startActivity(intent);
        AppInfoScreen$lambda$8($showChatDebugDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$4$0$0(UpdateViewModel $updateViewModel) {
        $updateViewModel.clearUpdateInfo();
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$4$1$0(Function1 $onDownloadUpdate, UpdateInfo $updateInfo, UpdateViewModel $updateViewModel) {
        $onDownloadUpdate.invoke($updateInfo.getDownloadUrl());
        $updateViewModel.clearUpdateInfo();
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$4$3$0(UpdateViewModel $updateViewModel) {
        $updateViewModel.clearUpdateInfo();
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$4$4(final UpdateViewModel $updateViewModel, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C323@11204L81,323@11183L162:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(137996174, $changed, -1, "com.yhchat.canarys.ui.settings.AppInfoScreen.<anonymous>.<anonymous>.<anonymous> (AppInfoActivity.kt:323)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -529661505, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($updateViewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda39
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppInfoActivityKt.AppInfoScreen$lambda$10$4$4$0$0($updateViewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppInfoActivityKt.INSTANCE.getLambda$460559819$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$4$4$0$0(UpdateViewModel $updateViewModel) {
        $updateViewModel.clearUpdateInfo();
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$5$0$0(UpdateViewModel $updateViewModel) {
        $updateViewModel.clearError();
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$5$2(String $error, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C339@11608L11:AppInfoActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(738091432, $changed, -1, "com.yhchat.canarys.ui.settings.AppInfoScreen.<anonymous>.<anonymous>.<anonymous> (AppInfoActivity.kt:339)");
            }
            TextKt.m3359Text4IGK_g($error, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$5$1(final UpdateViewModel $updateViewModel, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C341@11690L68,341@11669L141:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1469240995, $changed, -1, "com.yhchat.canarys.ui.settings.AppInfoScreen.<anonymous>.<anonymous>.<anonymous> (AppInfoActivity.kt:341)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1103642873, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($updateViewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppInfoActivityKt.AppInfoScreen$lambda$10$5$1$0$0($updateViewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppInfoActivityKt.INSTANCE.getLambda$874052896$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit AppInfoScreen$lambda$10$5$1$0$0(UpdateViewModel $updateViewModel) {
        $updateViewModel.clearError();
        return Unit.INSTANCE;
    }

    private static final void ChatDebugDialog(final Function0<Unit> function0, final Function2<? super String, ? super Integer, Unit> function2, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(437175873);
        ComposerKt.sourceInformation($composer3, "C(ChatDebugDialog)N(onDismiss,onConfirm)359@12018L31,360@12074L31,361@12130L31,417@14165L688,437@14879L98,372@12435L1704,363@12171L2812:AppInfoActivity.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function2) ? 32 : 16;
        }
        if (!$composer3.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(437175873, $dirty, -1, "com.yhchat.canarys.ui.settings.ChatDebugDialog (AppInfoActivity.kt:358)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -780777600, "CC(remember):AppInfoActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState chatId$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -780775808, "CC(remember):AppInfoActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState chatTypeText$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -780774016, "CC(remember):AppInfoActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            final MutableState errorMessage$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(-913958663, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda31
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.ChatDebugDialog$lambda$9(function2, chatId$delegate, errorMessage$delegate, chatTypeText$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(1330599735, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda32
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.ChatDebugDialog$lambda$10(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$AppInfoActivityKt.INSTANCE.m11663getLambda$719809163$app_debug(), ComposableLambdaKt.rememberComposableLambda(402470036, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.ChatDebugDialog$lambda$11(chatId$delegate, errorMessage$delegate, chatTypeText$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, ($dirty & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.ChatDebugDialog$lambda$12(function0, function2, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String ChatDebugDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ChatDebugDialog$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ChatDebugDialog$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChatDebugDialog$lambda$11(final androidx.compose.runtime.MutableState r60, final androidx.compose.runtime.MutableState r61, final androidx.compose.runtime.MutableState r62, androidx.compose.runtime.Composer r63, int r64) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.AppInfoActivityKt.ChatDebugDialog$lambda$11(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit ChatDebugDialog$lambda$11$0$0$0(MutableState $chatId$delegate, MutableState $errorMessage$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $chatId$delegate.setValue(it);
        $errorMessage$delegate.setValue("");
        return Unit.INSTANCE;
    }

    public static final Unit ChatDebugDialog$lambda$11$0$1$0(MutableState $chatTypeText$delegate, MutableState $errorMessage$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $chatTypeText$delegate.setValue(it);
        $errorMessage$delegate.setValue("");
        return Unit.INSTANCE;
    }

    public static final Unit ChatDebugDialog$lambda$9(final Function2 $onConfirm, MutableState $chatId$delegate, final MutableState $errorMessage$delegate, MutableState $chatTypeText$delegate, Composer $composer, int $changed) {
        final MutableState mutableState;
        final MutableState mutableState2;
        ComposerKt.sourceInformation($composer, "C419@14217L493,418@14179L664:AppInfoActivity.kt#acwjhs");
        boolean z = false;
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-913958663, $changed, -1, "com.yhchat.canarys.ui.settings.ChatDebugDialog.<anonymous> (AppInfoActivity.kt:418)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2140944602, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onConfirm);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = $chatId$delegate;
                mutableState2 = $chatTypeText$delegate;
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppInfoActivityKt.ChatDebugDialog$lambda$9$0$0($onConfirm, mutableState, $errorMessage$delegate, mutableState2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                mutableState = $chatId$delegate;
                mutableState2 = $chatTypeText$delegate;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (!StringsKt.isBlank(ChatDebugDialog$lambda$1(mutableState)) && !StringsKt.isBlank(ChatDebugDialog$lambda$4(mutableState2))) {
                z = true;
            }
            ButtonKt.TextButton(function0, null, z, null, null, null, null, null, null, ComposableSingletons$AppInfoActivityKt.INSTANCE.getLambda$350132252$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit ChatDebugDialog$lambda$9$0$0(Function2 $onConfirm, MutableState $chatId$delegate, MutableState $errorMessage$delegate, MutableState $chatTypeText$delegate) {
        if (!StringsKt.isBlank(ChatDebugDialog$lambda$1($chatId$delegate))) {
            Integer chatType = StringsKt.toIntOrNull(ChatDebugDialog$lambda$4($chatTypeText$delegate));
            if (chatType != null) {
                int iIntValue = chatType.intValue();
                boolean z = false;
                if (1 <= iIntValue && iIntValue < 4) {
                    z = true;
                }
                if (z) {
                    $onConfirm.invoke(ChatDebugDialog$lambda$1($chatId$delegate), chatType);
                    return Unit.INSTANCE;
                }
            }
            $errorMessage$delegate.setValue("must be 1,2 or 3");
            return Unit.INSTANCE;
        }
        $errorMessage$delegate.setValue(ChatSearchActivity.EXTRA_CHAT_ID);
        return Unit.INSTANCE;
    }

    public static final Unit ChatDebugDialog$lambda$10(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C438@14893L74:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1330599735, $changed, -1, "com.yhchat.canarys.ui.settings.ChatDebugDialog.<anonymous> (AppInfoActivity.kt:438)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$AppInfoActivityKt.INSTANCE.m11654getLambda$1700276646$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:243:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x048a  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0517  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void AppInfoItem(final androidx.compose.p000ui.graphics.vector.ImageVector r73, final java.lang.String r74, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r75, kotlin.jvm.functions.Function0<kotlin.Unit> r76, boolean r77, boolean r78, androidx.compose.runtime.Composer r79, final int r80, final int r81) {
        /*
            Method dump skipped, instructions count: 1349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.AppInfoActivityKt.AppInfoItem(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, boolean, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x02b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void DeveloperText(final java.lang.String r77, final java.lang.String r78, final kotlin.jvm.functions.Function0<kotlin.Unit> r79, final kotlin.jvm.functions.Function0<kotlin.Unit> r80, androidx.compose.runtime.Composer r81, final int r82) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.AppInfoActivityKt.DeveloperText(java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final void UpdateDialog(final UpdateInfo updateInfo, boolean isPreviewMode, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed, final int i) {
        boolean z;
        Composer $composer2;
        final boolean isPreviewMode2;
        final boolean isPreviewMode3;
        Composer $composer3 = $composer.startRestartGroup(243329762);
        ComposerKt.sourceInformation($composer3, "C(UpdateDialog)N(updateInfo,isPreviewMode,onDismiss,onUpdate)605@19744L127,610@19897L129,558@17994L537,574@18548L1170,556@17927L2105:AppInfoActivity.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(updateInfo) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            z = isPreviewMode;
        } else if (($changed & 48) == 0) {
            z = isPreviewMode;
            $dirty |= $composer3.changed(z) ? 32 : 16;
        } else {
            z = isPreviewMode;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 2048 : 1024;
        }
        if (!$composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            isPreviewMode2 = z;
        } else {
            if (i2 != 0) {
                isPreviewMode3 = false;
            } else {
                isPreviewMode3 = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(243329762, $dirty, -1, "com.yhchat.canarys.ui.settings.UpdateDialog (AppInfoActivity.kt:555)");
            }
            $composer2 = $composer3;
            boolean isPreviewMode4 = isPreviewMode3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(1395379610, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.UpdateDialog$lambda$0(function02, isPreviewMode3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-740503592, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.UpdateDialog$lambda$1(function0, isPreviewMode3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(1418580502, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.UpdateDialog$lambda$2(updateInfo, isPreviewMode3, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(-1796844747, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.UpdateDialog$lambda$3(isPreviewMode3, updateInfo, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 6) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isPreviewMode2 = isPreviewMode4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.UpdateDialog$lambda$4(updateInfo, isPreviewMode2, function0, function02, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit UpdateDialog$lambda$2(com.yhchat.canarys.data.model.UpdateInfo r50, boolean r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.AppInfoActivityKt.UpdateDialog$lambda$2(com.yhchat.canarys.data.model.UpdateInfo, boolean, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit UpdateDialog$lambda$3(boolean $isPreviewMode, UpdateInfo $updateInfo, Composer $composer, int $changed) {
        String latestVersion;
        StringBuilder sb;
        String str;
        ComposerKt.sourceInformation($composer, "C575@18562L1146:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1796844747, $changed, -1, "com.yhchat.canarys.ui.settings.UpdateDialog.<anonymous> (AppInfoActivity.kt:575)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((54 << 3) & 112) << 6) & 896) | 6;
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
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 155693941, "C581@18892L10,579@18719L264,587@19127L10,588@19191L11,585@19017L220,591@19271L40,595@19429L10,593@19345L175,601@19655L10,599@19554L140:AppInfoActivity.kt#acwjhs");
            if ($isPreviewMode) {
                latestVersion = $updateInfo.getLatestVersion();
                sb = new StringBuilder();
                str = "\u6700\u65b0\u7248\u672c: ";
            } else {
                latestVersion = $updateInfo.getLatestVersion();
                sb = new StringBuilder();
                str = "\u53d1\u73b0\u65b0\u7248\u672c: ";
            }
            TextKt.m3359Text4IGK_g(sb.append(str).append(latestVersion).toString(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            TextKt.m3359Text4IGK_g("\u53d1\u5e03\u65f6\u95f4: " + $updateInfo.getPublishTime(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g("\u66f4\u65b0\u5185\u5bb9:", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 196614, 0, 65502);
            TextKt.m3359Text4IGK_g($updateInfo.getUpdateContent(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65534);
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

    public static final Unit UpdateDialog$lambda$0(Function0 $onUpdate, final boolean $isPreviewMode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C606@19785L76,606@19758L103:AppInfoActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1395379610, $changed, -1, "com.yhchat.canarys.ui.settings.UpdateDialog.<anonymous> (AppInfoActivity.kt:606)");
            }
            ButtonKt.Button($onUpdate, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1225224106, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AppInfoActivityKt.UpdateDialog$lambda$0$0($isPreviewMode, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit UpdateDialog$lambda$0$0(boolean $isPreviewMode, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C607@19803L44:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1225224106, $changed, -1, "com.yhchat.canarys.ui.settings.UpdateDialog.<anonymous>.<anonymous> (AppInfoActivity.kt:607)");
            }
            TextKt.m3359Text4IGK_g($isPreviewMode ? "\u4e0b\u8f7d\u6700\u65b0\u7248" : "\u7acb\u5373\u66f4\u65b0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit UpdateDialog$lambda$1(Function0 $onDismiss, final boolean $isPreviewMode, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C611@19943L73,611@19911L105:AppInfoActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740503592, $changed, -1, "com.yhchat.canarys.ui.settings.UpdateDialog.<anonymous> (AppInfoActivity.kt:611)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1148147461, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AppInfoActivityKt.UpdateDialog$lambda$1$0($isPreviewMode, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit UpdateDialog$lambda$1$0(boolean $isPreviewMode, RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C612@19961L41:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1148147461, $changed, -1, "com.yhchat.canarys.ui.settings.UpdateDialog.<anonymous>.<anonymous> (AppInfoActivity.kt:612)");
            }
            TextKt.m3359Text4IGK_g($isPreviewMode ? "\u5173\u95ed" : "\u7a0d\u540e\u63d0\u9192", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void VersionSettingDialog(final String currentVersion, final Function0<Unit> function0, final Function1<? super String, Unit> function1, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-1289893038);
        ComposerKt.sourceInformation($composer3, "C(VersionSettingDialog)N(currentVersion,onDismiss,onConfirm)628@20251L43,629@20319L31,678@22068L383,692@22477L98,640@20626L1416,631@20360L2221:AppInfoActivity.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(currentVersion) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1289893038, $dirty, -1, "com.yhchat.canarys.ui.settings.VersionSettingDialog (AppInfoActivity.kt:627)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1658343421, "CC(remember):AppInfoActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentVersion, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState version$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1658345585, "CC(remember):AppInfoActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState errorMessage$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(1314310666, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.VersionSettingDialog$lambda$6(function1, version$delegate, errorMessage$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-303129784, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.VersionSettingDialog$lambda$7(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$AppInfoActivityKt.INSTANCE.m11657getLambda$1920570234$app_debug(), ComposableLambdaKt.rememberComposableLambda(-581806811, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.VersionSettingDialog$lambda$8(version$delegate, errorMessage$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AppInfoActivityKt.VersionSettingDialog$lambda$9(currentVersion, function0, function1, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String VersionSettingDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String VersionSettingDialog$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit VersionSettingDialog$lambda$8(final androidx.compose.runtime.MutableState r56, androidx.compose.runtime.MutableState r57, androidx.compose.runtime.Composer r58, int r59) {
        /*
            Method dump skipped, instructions count: 705
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.AppInfoActivityKt.VersionSettingDialog$lambda$8(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit VersionSettingDialog$lambda$8$0$0$0(MutableState $version$delegate, MutableState $errorMessage$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $version$delegate.setValue(it);
        $errorMessage$delegate.setValue("");
        return Unit.INSTANCE;
    }

    public static final Unit VersionSettingDialog$lambda$6(final Function1 $onConfirm, MutableState $version$delegate, final MutableState $errorMessage$delegate, Composer $composer, int $changed) {
        final MutableState mutableState;
        ComposerKt.sourceInformation($composer, "C680@22120L216,679@22082L359:AppInfoActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1314310666, $changed, -1, "com.yhchat.canarys.ui.settings.VersionSettingDialog.<anonymous> (AppInfoActivity.kt:679)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 332166882, "CC(remember):AppInfoActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onConfirm);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = $version$delegate;
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.AppInfoActivityKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AppInfoActivityKt.VersionSettingDialog$lambda$6$0$0($onConfirm, mutableState, $errorMessage$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                mutableState = $version$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, true ^ StringsKt.isBlank(VersionSettingDialog$lambda$1(mutableState)), null, null, null, null, null, null, ComposableSingletons$AppInfoActivityKt.INSTANCE.m11660getLambda$237851475$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit VersionSettingDialog$lambda$6$0$0(Function1 $onConfirm, MutableState $version$delegate, MutableState $errorMessage$delegate) {
        if (!StringsKt.isBlank(VersionSettingDialog$lambda$1($version$delegate))) {
            $onConfirm.invoke(VersionSettingDialog$lambda$1($version$delegate));
            return Unit.INSTANCE;
        }
        $errorMessage$delegate.setValue("\u7248\u672c\u53f7\u4e0d\u80fd\u4e3a\u7a7a");
        return Unit.INSTANCE;
    }

    public static final Unit VersionSettingDialog$lambda$7(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C693@22491L74:AppInfoActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-303129784, $changed, -1, "com.yhchat.canarys.ui.settings.VersionSettingDialog.<anonymous> (AppInfoActivity.kt:693)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$AppInfoActivityKt.INSTANCE.m11656getLambda$1855291925$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
