package com.yhchat.canarys.p007ui.create;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.AddKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: CreateActivity.kt */
@Metadata(m168d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a)\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\r\u001a)\u0010\u000e\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000f\u00b2\u0006\n\u0010\u0010\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0015\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0016\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0017\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0013\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0015\u001a\u00020\fX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u008e\u0002"}, m169d2 = {"CreateScreen", "", "initialTab", "", "onBackClick", "Lkotlin/Function0;", "(ILkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CreateGroupContent", "viewModel", "Lcom/yhchat/canarys/ui/create/CreateViewModel;", "onSuccess", "Lkotlin/Function1;", "", "(Lcom/yhchat/canarys/ui/create/CreateViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CreateBotContent", "app_debug", "selectedTab", "uiState", "Lcom/yhchat/canarys/ui/create/CreateUiState;", HintConstants.AUTOFILL_HINT_NAME, "introduction", "avatarUrl", "category", "categoryId", "isPrivate", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final class CreateActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBotContent$lambda$15(CreateViewModel createViewModel, Function1 function1, int i, Composer composer, int i2) {
        CreateBotContent(createViewModel, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$18(CreateViewModel createViewModel, Function1 function1, int i, Composer composer, int i2) {
        CreateGroupContent(createViewModel, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreen$lambda$7(int i, Function0 function0, int i2, int i3, Composer composer, int i4) {
        CreateScreen(i, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0176  */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CreateScreen(int r24, final kotlin.jvm.functions.Function0<kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.create.CreateActivityKt.CreateScreen(int, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final int CreateScreen$lambda$3(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void CreateScreen$lambda$4(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreen$lambda$5(final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C95@3167L190,93@3053L318:CreateActivity.kt#h3aifd");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(154170329, $changed, -1, "com.yhchat.canarys.ui.create.CreateScreen.<anonymous> (CreateActivity.kt:93)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$CreateActivityKt.INSTANCE.m11150getLambda$1257501035$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(2114298835, true, new Function2() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CreateActivityKt.CreateScreen$lambda$5$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, null, null, null, $composer, 390, 250);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreen$lambda$5$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C96@3189L150:CreateActivity.kt#h3aifd");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2114298835, $changed, -1, "com.yhchat.canarys.ui.create.CreateScreen.<anonymous>.<anonymous> (CreateActivity.kt:96)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$CreateActivityKt.INSTANCE.m11152getLambda$631436842$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit CreateScreen$lambda$6(com.yhchat.canarys.p007ui.create.CreateViewModel r44, final android.content.Context r45, final kotlin.jvm.functions.Function0 r46, final androidx.compose.runtime.MutableState r47, final java.util.List r48, androidx.compose.foundation.layout.PaddingValues r49, androidx.compose.runtime.Composer r50, int r51) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.create.CreateActivityKt.CreateScreen$lambda$6(com.yhchat.canarys.ui.create.CreateViewModel, android.content.Context, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreen$lambda$6$0$0(List $tabs, final MutableState $selectedTab$delegate, Composer $composer, int $changed) {
        Composer composer = $composer;
        ComposerKt.sourceInformation(composer, "C*113@3768L23,114@3824L15,111@3672L189:CreateActivity.kt#h3aifd");
        boolean z = true;
        if (!composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(691437462, $changed, -1, "com.yhchat.canarys.ui.create.CreateScreen.<anonymous>.<anonymous>.<anonymous> (CreateActivity.kt:110)");
            }
            final int i = 0;
            for (Object obj : $tabs) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String str = (String) obj;
                boolean z2 = CreateScreen$lambda$3($selectedTab$delegate) == i ? z : false;
                ComposerKt.sourceInformationMarkerStart(composer, -1705556281, "CC(remember):CreateActivity.kt#9igjgp");
                boolean zChanged = composer.changed(i);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda25
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CreateActivityKt.CreateScreen$lambda$6$0$0$0$0$0(i, $selectedTab$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TabKt.m3245TabwqdebIU(z2, (Function0) objRememberedValue, null, false, ComposableLambdaKt.rememberComposableLambda(2031008202, z, new Function2() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return CreateActivityKt.CreateScreen$lambda$6$0$0$0$1(str, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, composer, 54), null, 0L, 0L, null, composer, 24576, 492);
                composer = $composer;
                i = i2;
                z = z;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreen$lambda$6$0$0$0$0$0(int $index, MutableState $selectedTab$delegate) {
        CreateScreen$lambda$4($selectedTab$delegate, $index);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreen$lambda$6$0$0$0$1(String $title, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C114@3826L11:CreateActivity.kt#h3aifd");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2031008202, $changed, -1, "com.yhchat.canarys.ui.create.CreateScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CreateActivity.kt:114)");
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
    public static final Unit CreateScreen$lambda$6$0$1$0(Context $context, Function0 $onBackClick, String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Toast.makeText($context, "\u7fa4\u804a\u521b\u5efa\u6210\u529f\uff01", 0).show();
        $onBackClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateScreen$lambda$6$0$2$0(Context $context, Function0 $onBackClick, String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        Toast.makeText($context, "\u673a\u5668\u4eba\u521b\u5efa\u6210\u529f\uff01", 0).show();
        $onBackClick.invoke();
        return Unit.INSTANCE;
    }

    public static final void CreateGroupContent(final CreateViewModel viewModel, Function1<? super String, Unit> function1, Composer $composer, final int $changed) {
        int $dirty;
        Function0 function0;
        final Function1<? super String, Unit> onSuccess = function1;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Composer $composer2 = $composer.startRestartGroup(480121805);
        ComposerKt.sourceInformation($composer2, "C(CreateGroupContent)N(viewModel,onSuccess)149@4883L7,150@4933L16,152@4971L31,153@5027L31,154@5080L31,155@5132L31,156@5186L30,160@5349L157,158@5252L254,171@5607L21,168@5516L3742:CreateActivity.kt#h3aifd");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changedInstance(onSuccess) ? 32 : 16;
        }
        int $dirty3 = $dirty2;
        if ($composer2.shouldExecute(($dirty3 & 19) != 18, $dirty3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(480121805, $dirty3, -1, "com.yhchat.canarys.ui.create.CreateGroupContent (CreateActivity.kt:148)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getGroupUiState(), null, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, 1835560716, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState name$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1835562508, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState introduction$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1835564204, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            final MutableState avatarUrl$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1835565868, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty3;
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue4 = objMutableStateOf$default4;
            } else {
                $dirty = $dirty3;
            }
            final MutableState category$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1835567595, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue5 = objMutableStateOf$default5;
            }
            final MutableState categoryId$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ActivityResultContracts.GetContent getContent = new ActivityResultContracts.GetContent();
            ComposerKt.sourceInformationMarkerStart($composer2, 1835572938, "CC(remember):CreateActivity.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(viewModel) | $composer2.changedInstance(context);
            Object objRememberedValue6 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CreateActivityKt.CreateGroupContent$lambda$16$0(viewModel, context, avatarUrl$delegate, (Uri) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue6 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher imagePickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent, (Function1) objRememberedValue6, $composer2, 0);
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, $composer2, 0, 1), false, null, false, 14, null), C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i3 = ((48 >> 6) & 112) | 6;
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 2084862929, "C180@5893L41,181@5945L672,176@5749L868,204@6708L10,205@6764L11,202@6635L236,212@6978L13,210@6905L215,221@7235L21,219@7154L250,231@7515L17,229@7438L221,240@7812L38,238@7693L284,246@7995L41,250@8100L497,266@8698L290,249@8070L918:CreateActivity.kt#h3aifd");
            Modifier modifierAlign = columnScope.align(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(100)), Alignment.INSTANCE.getCenterHorizontally());
            ComposerKt.sourceInformationMarkerStart($composer2, -764029204, "CC(remember):CreateActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer2.changedInstance(imagePickerLauncher);
            Object objRememberedValue7 = $composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue7 = new Function0() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateActivityKt.CreateGroupContent$lambda$17$0$0(imagePickerLauncher);
                    }
                };
                $composer2.updateRememberedValue(objRememberedValue7);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            CardKt.Card((Function0) objRememberedValue7, modifierAlign, false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1673818312, true, new Function3() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return CreateActivityKt.CreateGroupContent$lambda$17$1(avatarUrl$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 100663296, 252);
            TextKt.m3359Text4IGK_g("\u70b9\u51fb\u4e0a\u65b9\u6dfb\u52a0\u7fa4\u804a\u5934\u50cf", columnScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, 6, 0, 65528);
            String strCreateGroupContent$lambda$2 = CreateGroupContent$lambda$2(name$delegate);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -763994512, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue8 = $composer2.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CreateActivityKt.CreateGroupContent$lambda$17$2$0(name$delegate, (String) obj3);
                    }
                };
                $composer2.updateRememberedValue(obj2);
                objRememberedValue8 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OutlinedTextFieldKt.OutlinedTextField(strCreateGroupContent$lambda$2, (Function1<? super String, Unit>) objRememberedValue8, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CreateActivityKt.INSTANCE.m11153getLambda$66718115$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer2, 1573296, 12582912, 0, 8257464);
            String strCreateGroupContent$lambda$5 = CreateGroupContent$lambda$5(introduction$delegate);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -763986280, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue9 = $composer2.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return CreateActivityKt.CreateGroupContent$lambda$17$3$0(introduction$delegate, (String) obj4);
                    }
                };
                $composer2.updateRememberedValue(obj3);
                objRememberedValue9 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OutlinedTextFieldKt.OutlinedTextField(strCreateGroupContent$lambda$5, (Function1<? super String, Unit>) objRememberedValue9, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CreateActivityKt.INSTANCE.getLambda$1448151444$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 5, 3, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer2, 1573296, 905969664, 0, 7602104);
            String strCreateGroupContent$lambda$11 = CreateGroupContent$lambda$11(category$delegate);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -763977324, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue10 = $composer2.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        return CreateActivityKt.CreateGroupContent$lambda$17$4$0(category$delegate, (String) obj5);
                    }
                };
                $composer2.updateRememberedValue(obj4);
                objRememberedValue10 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OutlinedTextFieldKt.OutlinedTextField(strCreateGroupContent$lambda$11, (Function1<? super String, Unit>) objRememberedValue10, modifierFillMaxWidth$default3, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CreateActivityKt.INSTANCE.getLambda$1697429845$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer2, 1573296, 12582912, 0, 8257464);
            String strValueOf = CreateGroupContent$lambda$14(categoryId$delegate) == 0 ? "" : String.valueOf(CreateGroupContent$lambda$14(categoryId$delegate));
            Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -763967799, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue11 = $composer2.rememberedValue();
            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                Object obj5 = new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        return CreateActivityKt.CreateGroupContent$lambda$17$5$0(categoryId$delegate, (String) obj6);
                    }
                };
                $composer2.updateRememberedValue(obj5);
                objRememberedValue11 = obj5;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OutlinedTextFieldKt.OutlinedTextField(strValueOf, (Function1<? super String, Unit>) objRememberedValue11, modifierFillMaxWidth$default4, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CreateActivityKt.INSTANCE.getLambda$1946708246$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer2, 1573296, 12582912, 0, 8257464);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer2, 6);
            ComposerKt.sourceInformationMarkerStart($composer2, -763958124, "CC(remember):CreateActivity.kt#9igjgp");
            boolean zChangedInstance3 = $composer2.changedInstance(context) | $composer2.changedInstance(viewModel) | (($dirty & 112) == 32);
            Object objRememberedValue12 = $composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                onSuccess = function1;
                objRememberedValue12 = new Function0() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateActivityKt.CreateGroupContent$lambda$17$6$0(context, viewModel, onSuccess, name$delegate, introduction$delegate, avatarUrl$delegate, category$delegate, categoryId$delegate);
                    }
                };
                $composer2.updateRememberedValue(objRememberedValue12);
            } else {
                onSuccess = function1;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ButtonKt.Button((Function0) objRememberedValue12, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !CreateGroupContent$lambda$0(uiState$delegate).isLoading(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-600547789, true, new Function3() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj6, Object obj7, Object obj8) {
                    return CreateActivityKt.CreateGroupContent$lambda$17$7(uiState$delegate, (RowScope) obj6, (Composer) obj7, ((Integer) obj8).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 504);
            if (CreateGroupContent$lambda$0(uiState$delegate).getError() != null) {
                $composer2.startReplaceGroup(2088034228);
                ComposerKt.sourceInformation($composer2, "281@9151L11,282@9208L10,279@9063L179");
                String error = CreateGroupContent$lambda$0(uiState$delegate).getError();
                TextKt.m3359Text4IGK_g(error == null ? "" : error, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, 0, 0, 65530);
            } else {
                $composer2.startReplaceGroup(2079050335);
            }
            $composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    return CreateActivityKt.CreateGroupContent$lambda$18(viewModel, onSuccess, $changed, (Composer) obj6, ((Integer) obj7).intValue());
                }
            });
        }
    }

    private static final CreateUiState CreateGroupContent$lambda$0(State<CreateUiState> state) {
        return (CreateUiState) state.getValue();
    }

    private static final String CreateGroupContent$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String CreateGroupContent$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String CreateGroupContent$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String CreateGroupContent$lambda$11(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int CreateGroupContent$lambda$14(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void CreateGroupContent$lambda$15(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$16$0(CreateViewModel $viewModel, Context $context, final MutableState $avatarUrl$delegate, Uri uri) {
        if (uri != null) {
            $viewModel.uploadGroupAvatar($context, uri, new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateActivityKt.CreateGroupContent$lambda$16$0$0$0($avatarUrl$delegate, (String) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$16$0$0$0(MutableState $avatarUrl$delegate, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        $avatarUrl$delegate.setValue(url);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$17$0$0(ManagedActivityResultLauncher $imagePickerLauncher) {
        $imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$17$1(MutableState $avatarUrl$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C182@5959L648:CreateActivity.kt#h3aifd");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673818312, $changed, -1, "com.yhchat.canarys.ui.create.CreateGroupContent.<anonymous>.<anonymous> (CreateActivity.kt:182)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1786148887, "C:CreateActivity.kt#h3aifd");
            if (CreateGroupContent$lambda$8($avatarUrl$delegate).length() > 0) {
                $composer.startReplaceGroup(1786168385);
                ComposerKt.sourceInformation($composer, "187@6149L187");
                composer = $composer;
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(CreateGroupContent$lambda$8($avatarUrl$delegate), "\u7fa4\u804a\u5934\u50cf", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, 0.0f, null, 0, false, null, composer, 432, 0, 4088);
                composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1786399707);
                ComposerKt.sourceInformation($composer, "193@6382L193");
                composer = $composer;
                IconKt.m2816Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), "\u6dfb\u52a0\u5934\u50cf", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), 0L, composer, 432, 8);
                composer.endReplaceGroup();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$17$2$0(MutableState $name$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $name$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$17$3$0(MutableState $introduction$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $introduction$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$17$4$0(MutableState $category$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $category$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$17$5$0(MutableState $categoryId$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Integer intOrNull = StringsKt.toIntOrNull(it);
        CreateGroupContent$lambda$15($categoryId$delegate, intOrNull != null ? intOrNull.intValue() : 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$17$6$0(Context $context, CreateViewModel $viewModel, Function1 $onSuccess, MutableState $name$delegate, MutableState $introduction$delegate, MutableState $avatarUrl$delegate, MutableState $category$delegate, MutableState $categoryId$delegate) {
        if (StringsKt.isBlank(CreateGroupContent$lambda$2($name$delegate))) {
            Toast.makeText($context, "\u8bf7\u8f93\u5165\u7fa4\u804a\u540d\u79f0", 0).show();
            return Unit.INSTANCE;
        }
        $viewModel.createGroup(CreateGroupContent$lambda$2($name$delegate), CreateGroupContent$lambda$5($introduction$delegate), CreateGroupContent$lambda$8($avatarUrl$delegate), CreateGroupContent$lambda$11($category$delegate), CreateGroupContent$lambda$14($categoryId$delegate), $onSuccess);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateGroupContent$lambda$17$7(State $uiState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:CreateActivity.kt#h3aifd");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-600547789, $changed, -1, "com.yhchat.canarys.ui.create.CreateGroupContent.<anonymous>.<anonymous> (CreateActivity.kt:267)");
            }
            if (CreateGroupContent$lambda$0($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(1914615726);
                ComposerKt.sourceInformation($composer, "270@8875L11,268@8753L161");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0.0f, 0L, 0, $composer, 6, 28);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1914808515);
                ComposerKt.sourceInformation($composer, "273@8952L12");
                TextKt.m3359Text4IGK_g("\u521b\u5efa\u7fa4\u804a", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void CreateBotContent(final CreateViewModel viewModel, Function1<? super String, Unit> function1, Composer $composer, final int $changed) {
        int $dirty;
        String str;
        Function0 function0;
        Function0 function02;
        final Function1<? super String, Unit> onSuccess = function1;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Composer $composer2 = $composer.startRestartGroup(184980117);
        ComposerKt.sourceInformation($composer2, "C(CreateBotContent)N(viewModel,onSuccess)293@9395L7,294@9443L16,296@9481L31,297@9537L31,298@9590L31,299@9643L34,303@9810L155,301@9713L252,314@10066L21,311@9975L3699:CreateActivity.kt#h3aifd");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changedInstance(onSuccess) ? 32 : 16;
        }
        int $dirty3 = $dirty2;
        if ($composer2.shouldExecute(($dirty3 & 19) != 18, $dirty3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(184980117, $dirty3, -1, "com.yhchat.canarys.ui.create.CreateBotContent (CreateActivity.kt:292)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel.getBotUiState(), null, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, 1672239956, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState name$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1672241748, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState introduction$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1672243444, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty3;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            } else {
                $dirty = $dirty3;
            }
            final MutableState avatarUrl$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1672245143, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                str = "";
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue4 = objMutableStateOf$default4;
            } else {
                str = "";
            }
            final MutableState isPrivate$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ActivityResultContracts.GetContent getContent = new ActivityResultContracts.GetContent();
            ComposerKt.sourceInformationMarkerStart($composer2, 1672250608, "CC(remember):CreateActivity.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(viewModel) | $composer2.changedInstance(context);
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda27
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CreateActivityKt.CreateBotContent$lambda$13$0(viewModel, context, avatarUrl$delegate, (Uri) obj2);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue5 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final ManagedActivityResultLauncher imagePickerLauncher = ActivityResultRegistryKt.rememberLauncherForActivityResult(getContent, (Function1) objRememberedValue5, $composer2, 0);
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, $composer2, 0, 1), false, null, false, 14, null), C1834Dp.m7806constructorimpl(16));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer2, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((48 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function0 = constructor;
                $composer2.createNode(function0);
            } else {
                function0 = constructor;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i3 = ((48 >> 6) & 112) | 6;
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -476835563, "C323@10353L41,324@10405L673,319@10209L869,347@11170L10,348@11226L11,345@11096L237,355@11441L13,353@11368L216,364@11700L21,362@11619L251,372@11904L345,386@12342L10,387@12398L11,384@12267L169,390@12454L41,394@12559L453,409@13113L291,393@12529L875:CreateActivity.kt#h3aifd");
            Modifier modifierAlign = columnScope.align(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(100)), Alignment.INSTANCE.getCenterHorizontally());
            ComposerKt.sourceInformationMarkerStart($composer2, -1677948588, "CC(remember):CreateActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer2.changedInstance(imagePickerLauncher);
            Object objRememberedValue6 = $composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue6 = new Function0() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateActivityKt.CreateBotContent$lambda$14$0$0(imagePickerLauncher);
                    }
                };
                $composer2.updateRememberedValue(objRememberedValue6);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            CardKt.Card((Function0) objRememberedValue6, modifierAlign, false, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1609438016, true, new Function3() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return CreateActivityKt.CreateBotContent$lambda$14$1(avatarUrl$delegate, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer2, 54), $composer2, 100663296, 252);
            TextKt.m3359Text4IGK_g("\u70b9\u51fb\u4e0a\u65b9\u6dfb\u52a0\u673a\u5668\u4eba\u5934\u50cf", columnScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, 6, 0, 65528);
            String strCreateBotContent$lambda$2 = CreateBotContent$lambda$2(name$delegate);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -1677913800, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer2.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CreateActivityKt.CreateBotContent$lambda$14$2$0(name$delegate, (String) obj3);
                    }
                };
                $composer2.updateRememberedValue(obj2);
                objRememberedValue7 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OutlinedTextFieldKt.OutlinedTextField(strCreateBotContent$lambda$2, (Function1<? super String, Unit>) objRememberedValue7, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CreateActivityKt.INSTANCE.m11151getLambda$182068955$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer2, 1573296, 12582912, 0, 8257464);
            String strCreateBotContent$lambda$5 = CreateBotContent$lambda$5(introduction$delegate);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -1677905504, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue8 = $composer2.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return CreateActivityKt.CreateBotContent$lambda$14$3$0(introduction$delegate, (String) obj4);
                    }
                };
                $composer2.updateRememberedValue(obj3);
                objRememberedValue8 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            OutlinedTextFieldKt.OutlinedTextField(strCreateBotContent$lambda$5, (Function1<? super String, Unit>) objRememberedValue8, modifierFillMaxWidth$default2, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$CreateActivityKt.INSTANCE.getLambda$1656376860$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 5, 3, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer2, 1573296, 905969664, 0, 7602104);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer2, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierFillMaxWidth$default3);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function02 = constructor2;
                $composer2.createNode(function02);
            } else {
                function02 = constructor2;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i6 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1251830645, "C377@12102L13,380@12207L18,378@12128L111:CreateActivity.kt#h3aifd");
            TextKt.m3359Text4IGK_g("\u79c1\u6709\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer2, 6, 0, 131070);
            boolean zCreateBotContent$lambda$11 = CreateBotContent$lambda$11(isPrivate$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1899284257, "CC(remember):CreateActivity.kt#9igjgp");
            Object objRememberedValue9 = $composer2.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue9 = new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        return CreateActivityKt.CreateBotContent$lambda$14$4$0$0(isPrivate$delegate, ((Boolean) obj4).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(objRememberedValue9);
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SwitchKt.Switch(zCreateBotContent$lambda$11, (Function1) objRememberedValue9, null, null, false, null, null, $composer2, 48, 124);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            TextKt.m3359Text4IGK_g("\u79c1\u6709\u673a\u5668\u4eba\u53ea\u6709\u4f60\u53ef\u4ee5\u4f7f\u7528", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, 6, 0, 65530);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer2, 6);
            ComposerKt.sourceInformationMarkerStart($composer2, -1677877584, "CC(remember):CreateActivity.kt#9igjgp");
            boolean zChangedInstance3 = $composer2.changedInstance(context) | $composer2.changedInstance(viewModel) | (($dirty & 112) == 32);
            Object objRememberedValue10 = $composer2.rememberedValue();
            if (zChangedInstance3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                onSuccess = function1;
                Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CreateActivityKt.CreateBotContent$lambda$14$5$0(context, viewModel, onSuccess, name$delegate, introduction$delegate, avatarUrl$delegate, isPrivate$delegate);
                    }
                };
                $composer2.updateRememberedValue(obj4);
                objRememberedValue10 = obj4;
            } else {
                onSuccess = function1;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ButtonKt.Button((Function0) objRememberedValue10, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !CreateBotContent$lambda$0(uiState$delegate).isLoading(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-665305477, true, new Function3() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    return CreateActivityKt.CreateBotContent$lambda$14$6(uiState$delegate, (RowScope) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 504);
            if (CreateBotContent$lambda$0(uiState$delegate).getError() != null) {
                $composer2.startReplaceGroup(-473706548);
                ComposerKt.sourceInformation($composer2, "424@13567L11,425@13624L10,422@13479L179");
                String error = CreateBotContent$lambda$0(uiState$delegate).getError();
                TextKt.m3359Text4IGK_g(error == null ? str : error, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, 0, 0, 65530);
            } else {
                $composer2.startReplaceGroup(-487071113);
            }
            $composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return CreateActivityKt.CreateBotContent$lambda$15(viewModel, onSuccess, $changed, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    private static final CreateUiState CreateBotContent$lambda$0(State<CreateUiState> state) {
        return (CreateUiState) state.getValue();
    }

    private static final String CreateBotContent$lambda$2(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String CreateBotContent$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String CreateBotContent$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean CreateBotContent$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void CreateBotContent$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBotContent$lambda$13$0(CreateViewModel $viewModel, Context $context, final MutableState $avatarUrl$delegate, Uri uri) {
        if (uri != null) {
            $viewModel.uploadBotAvatar($context, uri, new Function1() { // from class: com.yhchat.canarys.ui.create.CreateActivityKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateActivityKt.CreateBotContent$lambda$13$0$0$0($avatarUrl$delegate, (String) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBotContent$lambda$13$0$0$0(MutableState $avatarUrl$delegate, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        $avatarUrl$delegate.setValue(url);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBotContent$lambda$14$0$0(ManagedActivityResultLauncher $imagePickerLauncher) {
        $imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBotContent$lambda$14$1(MutableState $avatarUrl$delegate, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C325@10419L649:CreateActivity.kt#h3aifd");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1609438016, $changed, -1, "com.yhchat.canarys.ui.create.CreateBotContent.<anonymous>.<anonymous> (CreateActivity.kt:325)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1210207186, "C:CreateActivity.kt#h3aifd");
            if (CreateBotContent$lambda$8($avatarUrl$delegate).length() > 0) {
                $composer.startReplaceGroup(-1210187688);
                ComposerKt.sourceInformation($composer, "330@10609L188");
                composer = $composer;
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(CreateBotContent$lambda$8($avatarUrl$delegate), "\u673a\u5668\u4eba\u5934\u50cf", SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, 0.0f, null, 0, false, null, composer, 432, 0, 4088);
                composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1209955405);
                ComposerKt.sourceInformation($composer, "336@10843L193");
                composer = $composer;
                IconKt.m2816Iconww6aTOc(AddKt.getAdd(Icons.INSTANCE.getDefault()), "\u6dfb\u52a0\u5934\u50cf", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), 0L, composer, 432, 8);
                composer.endReplaceGroup();
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBotContent$lambda$14$2$0(MutableState $name$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $name$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBotContent$lambda$14$3$0(MutableState $introduction$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $introduction$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBotContent$lambda$14$4$0$0(MutableState $isPrivate$delegate, boolean it) {
        CreateBotContent$lambda$12($isPrivate$delegate, it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBotContent$lambda$14$5$0(Context $context, CreateViewModel $viewModel, Function1 $onSuccess, MutableState $name$delegate, MutableState $introduction$delegate, MutableState $avatarUrl$delegate, MutableState $isPrivate$delegate) {
        if (StringsKt.isBlank(CreateBotContent$lambda$2($name$delegate))) {
            Toast.makeText($context, "\u8bf7\u8f93\u5165\u673a\u5668\u4eba\u540d\u79f0", 0).show();
            return Unit.INSTANCE;
        }
        $viewModel.createBot(CreateBotContent$lambda$2($name$delegate), CreateBotContent$lambda$5($introduction$delegate), CreateBotContent$lambda$8($avatarUrl$delegate), CreateBotContent$lambda$11($isPrivate$delegate), $onSuccess);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateBotContent$lambda$14$6(State $uiState$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:CreateActivity.kt#h3aifd");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-665305477, $changed, -1, "com.yhchat.canarys.ui.create.CreateBotContent.<anonymous>.<anonymous> (CreateActivity.kt:410)");
            }
            if (CreateBotContent$lambda$0($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(1158648422);
                ComposerKt.sourceInformation($composer, "413@13290L11,411@13168L161");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), 0.0f, 0L, 0, $composer, 6, 28);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1158841242);
                ComposerKt.sourceInformation($composer, "416@13367L13");
                TextKt.m3359Text4IGK_g("\u521b\u5efa\u673a\u5668\u4eba", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }
}
