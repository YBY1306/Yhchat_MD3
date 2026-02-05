package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ArrowBackKt;
import androidx.compose.material.icons.filled.CloseKt;
import androidx.compose.material.icons.filled.MoreVertKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.ContentScale;
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
import androidx.compose.p000ui.text.style.TextOverflow;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.yhchat.canarys.data.model.BaFollowerItem;
import com.yhchat.canarys.p007ui.user.UserDetailActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FollowersListActivity.kt */
@Metadata(m168d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003\u00a2\u0006\u0002\u0010\u000b\u001as\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\n26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0003\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016\u00a2\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u00010\u0012H\u0003\u00a2\u0006\u0002\u0010\u0018\u001a9\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003\u00a2\u0006\u0002\u0010\u001e\u00a8\u0006\u001f\u00b2\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002\u00b2\u0006\n\u0010 \u001a\u00020\u0016X\u008a\u008e\u0002\u00b2\u0006\n\u0010!\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010\"\u001a\u00020\u0016X\u008a\u008e\u0002"}, m169d2 = {"FollowersListScreen", "", "token", "", "baId", "", "baName", "viewModel", "Lcom/yhchat/canarys/ui/community/FollowersListViewModel;", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;ILjava/lang/String;Lcom/yhchat/canarys/ui/community/FollowersListViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "FollowersListContent", "memberName", "state", "Lcom/yhchat/canarys/ui/community/FollowersListState;", "onLoadMore", "onToggleAdmin", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "userId", "", "isAdmin", "(Ljava/lang/String;ILjava/lang/String;Lcom/yhchat/canarys/ui/community/FollowersListState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "FollowerItem", "follower", "Lcom/yhchat/canarys/data/model/BaFollowerItem;", "isUpdating", "onClick", "(Lcom/yhchat/canarys/data/model/BaFollowerItem;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "isSearching", "searchKeyword", "showMenu"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class FollowersListActivityKt {
    public static final Unit FollowerItem$lambda$5(BaFollowerItem baFollowerItem, boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        FollowerItem(baFollowerItem, z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListContent$lambda$2(String str, int i, String str2, FollowersListState followersListState, Function0 function0, Function2 function2, int i2, Composer composer, int i3) {
        FollowersListContent(str, i, str2, followersListState, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$11(String str, int i, String str2, FollowersListViewModel followersListViewModel, Function0 function0, int i2, Composer composer, int i3) {
        FollowersListScreen(str, i, str2, followersListViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0221  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FollowersListScreen(final java.lang.String r25, final int r26, final java.lang.String r27, final com.yhchat.canarys.p007ui.community.FollowersListViewModel r28, final kotlin.jvm.functions.Function0<kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.FollowersListActivityKt.FollowersListScreen(java.lang.String, int, java.lang.String, com.yhchat.canarys.ui.community.FollowersListViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final FollowersListState FollowersListScreen$lambda$0(State<FollowersListState> state) {
        return (FollowersListState) state.getValue();
    }

    public static final boolean FollowersListScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FollowersListScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final String FollowersListScreen$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit FollowersListScreen$lambda$9(final MutableState $isSearching$delegate, final String $baName, final MutableState $searchKeyword$delegate, final FollowersListViewModel $viewModel, final String $token, final int $baId, final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C107@3706L1582,138@5323L793,156@6144L274,164@6531L11,163@6463L114,106@3671L2920:FollowersListActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1351029059, $changed, -1, "com.yhchat.canarys.ui.community.FollowersListScreen.<anonymous> (FollowersListActivity.kt:106)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(508273785, true, new Function2() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FollowersListActivityKt.FollowersListScreen$lambda$9$0($isSearching$delegate, $baName, $searchKeyword$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-359653577, true, new Function2() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FollowersListActivityKt.FollowersListScreen$lambda$9$1($viewModel, $token, $baId, $onBackClick, $isSearching$delegate, $searchKeyword$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(1529841646, true, new Function3() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FollowersListActivityKt.FollowersListScreen$lambda$9$2($isSearching$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, TopAppBarDefaults.INSTANCE.m3530topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, 0L, $composer, TopAppBarDefaults.$stable << 15, 30), null, $composer, 3462, 178);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$9$0(MutableState $isSearching$delegate, String $baName, final MutableState $searchKeyword$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:FollowersListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(508273785, $changed, -1, "com.yhchat.canarys.ui.community.FollowersListScreen.<anonymous>.<anonymous> (FollowersListActivity.kt:108)");
            }
            if (!FollowersListScreen$lambda$2($isSearching$delegate)) {
                $composer.startReplaceGroup(-2070297363);
                ComposerKt.sourceInformation($composer, "109@3772L588");
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                int i3 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -1545890930, "C110@3809L143,116@4088L10,117@4164L11,114@3981L353:FollowersListActivity.kt#cp0npg");
                TextKt.m3359Text4IGK_g("\u5173\u6ce8\u5217\u8868", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 196614, 0, 131038);
                TextKt.m3359Text4IGK_g($baName, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 3120, 55290);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-2069628569);
                ComposerKt.sourceInformation($composer, "130@4852L11,131@4954L11,129@4774L448,125@4520L22,123@4414L834");
                String strFollowersListScreen$lambda$5 = FollowersListScreen$lambda$5($searchKeyword$delegate);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                TextFieldColors textFieldColorsM3340colors0hiis_0 = TextFieldDefaults.INSTANCE.m3340colors0hiis_0(0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, 0L, null, Color.INSTANCE.m5092getTransparent0d7_KjU(), Color.INSTANCE.m5092getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 0, 432, 0, 0, 3072, 2147477455, 4095);
                ComposerKt.sourceInformationMarkerStart($composer, -1175138289, "CC(remember):FollowersListActivity.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return FollowersListActivityKt.FollowersListScreen$lambda$9$0$1$0($searchKeyword$delegate, (String) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                TextFieldKt.TextField(strFollowersListScreen$lambda$5, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$FollowersListActivityKt.INSTANCE.m10820getLambda$1654809030$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM3340colors0hiis_0, $composer, 12583344, 12582912, 0, 4063096);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$9$0$1$0(MutableState $searchKeyword$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchKeyword$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$9$1(final FollowersListViewModel $viewModel, final String $token, final int $baId, final Function0 $onBackClick, final MutableState $isSearching$delegate, final MutableState $searchKeyword$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C140@5391L401,149@5815L283,139@5345L753:FollowersListActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-359653577, $changed, -1, "com.yhchat.canarys.ui.community.FollowersListScreen.<anonymous>.<anonymous> (FollowersListActivity.kt:139)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -2029701240, "CC(remember):FollowersListActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($token) | $composer.changed($baId) | $composer.changed($onBackClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FollowersListActivityKt.FollowersListScreen$lambda$9$1$0$0($viewModel, $token, $baId, $onBackClick, $isSearching$delegate, $searchKeyword$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableLambdaKt.rememberComposableLambda(1436288250, true, new Function2() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return FollowersListActivityKt.FollowersListScreen$lambda$9$1$1($isSearching$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$9$1$0$0(FollowersListViewModel $viewModel, String $token, int $baId, Function0 $onBackClick, MutableState $isSearching$delegate, MutableState $searchKeyword$delegate) {
        if (FollowersListScreen$lambda$2($isSearching$delegate)) {
            FollowersListScreen$lambda$3($isSearching$delegate, false);
            $searchKeyword$delegate.setValue("");
            FollowersListViewModel.loadFollowers$default($viewModel, $token, $baId, "", 1, 0, 16, null);
        } else {
            $onBackClick.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$9$1$1(MutableState $isSearching$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C150@5841L235:FollowersListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1436288250, $changed, -1, "com.yhchat.canarys.ui.community.FollowersListScreen.<anonymous>.<anonymous>.<anonymous> (FollowersListActivity.kt:150)");
            }
            IconKt.m2816Iconww6aTOc(FollowersListScreen$lambda$2($isSearching$delegate) ? CloseKt.getClose(Icons.INSTANCE.getDefault()) : ArrowBackKt.getArrowBack(Icons.AutoMirrored.Filled.INSTANCE), FollowersListScreen$lambda$2($isSearching$delegate) ? "\u53d6\u6d88\u641c\u7d22" : "\u8fd4\u56de", (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$9$2(final MutableState $isSearching$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C:FollowersListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1529841646, $changed, -1, "com.yhchat.canarys.ui.community.FollowersListScreen.<anonymous>.<anonymous> (FollowersListActivity.kt:157)");
            }
            if (FollowersListScreen$lambda$2($isSearching$delegate)) {
                $composer.startReplaceGroup(1608402292);
            } else {
                $composer.startReplaceGroup(1614544508);
                ComposerKt.sourceInformation($composer, "158@6231L22,158@6210L168");
                ComposerKt.sourceInformationMarkerStart($composer, 1299009380, "CC(remember):FollowersListActivity.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FollowersListActivityKt.FollowersListScreen$lambda$9$2$0$0($isSearching$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$FollowersListActivityKt.INSTANCE.m10821getLambda$275784218$app_debug(), $composer, 196614, 30);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$9$2$0$0(MutableState $isSearching$delegate) {
        FollowersListScreen$lambda$3($isSearching$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit FollowersListScreen$lambda$10(final java.lang.String r81, final int r82, final com.yhchat.canarys.p007ui.community.FollowersListViewModel r83, final androidx.compose.runtime.State r84, final androidx.compose.runtime.MutableState r85, final androidx.compose.runtime.MutableState r86, androidx.compose.foundation.layout.PaddingValues r87, androidx.compose.runtime.Composer r88, int r89) {
        /*
            Method dump skipped, instructions count: 1455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.FollowersListActivityKt.FollowersListScreen$lambda$10(java.lang.String, int, com.yhchat.canarys.ui.community.FollowersListViewModel, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit FollowersListScreen$lambda$10$0$0$0$0(FollowersListViewModel $viewModel, String $token, int $baId, MutableState $searchKeyword$delegate) {
        FollowersListViewModel.loadFollowers$default($viewModel, $token, $baId, FollowersListScreen$lambda$5($searchKeyword$delegate), 1, 0, 16, null);
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$10$0$1$0(FollowersListViewModel $viewModel, String $token, int $baId, MutableState $isSearching$delegate, MutableState $searchKeyword$delegate) {
        $viewModel.loadMore($token, $baId, FollowersListScreen$lambda$2($isSearching$delegate) ? FollowersListScreen$lambda$5($searchKeyword$delegate) : "");
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$10$0$2$0(FollowersListViewModel $viewModel, String $token, int $baId, MutableState $isSearching$delegate, MutableState $searchKeyword$delegate, String userId, boolean isAdmin) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        $viewModel.setAdmin($token, $baId, userId, isAdmin ? 0 : 2, FollowersListScreen$lambda$2($isSearching$delegate) ? FollowersListScreen$lambda$5($searchKeyword$delegate) : "");
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListScreen$lambda$10$0$3(State $state$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C227@9059L23:FollowersListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(58370892, $changed, -1, "com.yhchat.canarys.ui.community.FollowersListScreen.<anonymous>.<anonymous>.<anonymous> (FollowersListActivity.kt:227)");
            }
            String error = FollowersListScreen$lambda$0($state$delegate).getError();
            if (error == null) {
                error = "";
            }
            TextKt.m3359Text4IGK_g(error, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void FollowersListContent(final String token, final int baId, final String memberName, final FollowersListState state, final Function0<Unit> function0, final Function2<? super String, ? super Boolean, Unit> function2, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-900700959);
        ComposerKt.sourceInformation($composer3, "C(FollowersListContent)N(token,baId,memberName,state,onLoadMore,onToggleAdmin)247@9502L7,248@9530L23,250@9638L391,250@9559L470,266@10179L2234,262@10035L2378:FollowersListActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(memberName) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(state) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(function2) ? 131072 : 65536;
        }
        if (!$composer3.shouldExecute((74881 & $dirty) != 74880, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-900700959, $dirty, -1, "com.yhchat.canarys.ui.community.FollowersListContent (FollowersListActivity.kt:246)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            LazyListState listState = LazyListStateKt.rememberLazyListState(0, 0, $composer3, 0, 3);
            Object[] objArr = {listState, Boolean.valueOf(state.isLoading()), Boolean.valueOf(state.isLoadingMore()), Boolean.valueOf(state.getHasMore())};
            ComposerKt.sourceInformationMarkerStart($composer3, 2009784616, "CC(remember):FollowersListActivity.kt#9igjgp");
            boolean zChanged = ((57344 & $dirty) == 16384) | $composer3.changed(listState) | $composer3.changedInstance(state);
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new FollowersListActivityKt$FollowersListContent$1$1(listState, state, function0, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(objArr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer3, 0);
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesM1045PaddingValuesYgX7TsA$default = PaddingKt.m1045PaddingValuesYgX7TsA$default(0.0f, C1834Dp.m7806constructorimpl(8), 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 2009803771, "CC(remember):FollowersListActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(state) | $composer3.changedInstance(context) | ((458752 & $dirty) == 131072) | (($dirty & 896) == 256);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                $composer2 = $composer3;
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return FollowersListActivityKt.FollowersListContent$lambda$1$0(state, context, function2, memberName, (LazyListScope) obj3);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            } else {
                $composer2 = $composer3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, listState, paddingValuesM1045PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue2, $composer2, 390, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return FollowersListActivityKt.FollowersListContent$lambda$2(token, baId, memberName, state, function0, function2, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public static final Unit FollowersListContent$lambda$1$0(final FollowersListState $state, final Context $context, final Function2 $onToggleAdmin, final String $memberName, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List followers = $state.getFollowers();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$FollowersListContent$lambda$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((BaFollowerItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BaFollowerItem baFollowerItem) {
                return null;
            }
        };
        LazyColumn.items(followers.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$FollowersListContent$lambda$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(followers.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$FollowersListContent$lambda$1$0$$inlined$items$default$4
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
                final BaFollowerItem baFollowerItem = (BaFollowerItem) followers.get(it);
                $composer.startReplaceGroup(-515037234);
                ComposerKt.sourceInformation($composer, "CN(follower)*271@10385L233,278@10652L95,268@10238L523,282@10774L19:FollowersListActivity.kt#cp0npg");
                boolean zAreEqual = Intrinsics.areEqual($state.getUpdatingUserId(), baFollowerItem.getUserId());
                ComposerKt.sourceInformationMarkerStart($composer, 1507410931, "CC(remember):FollowersListActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(baFollowerItem)) || (i & 48) == 32);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Context context = $context;
                    Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$FollowersListContent$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            UserDetailActivity.Companion.start$default(UserDetailActivity.INSTANCE, context, baFollowerItem.getUserId(), baFollowerItem.getNickname(), null, 8, null);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerStart($composer, 1507419337, "CC(remember):FollowersListActivity.kt#9igjgp");
                boolean zChanged = $composer.changed($onToggleAdmin) | ((((i & 112) ^ 48) > 32 && $composer.changed(baFollowerItem)) || (i & 48) == 32);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    final Function2 function2 = $onToggleAdmin;
                    Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$FollowersListContent$2$1$1$2$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function2.invoke(baFollowerItem.getUserId(), Boolean.valueOf(baFollowerItem.getUserLevel() == 2));
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                FollowersListActivityKt.FollowerItem(baFollowerItem, zAreEqual, function0, (Function0) objRememberedValue2, $composer, (i >> 3) & 14);
                DividerKt.m2738HorizontalDivider9IZ8Weo(null, 0.0f, 0L, $composer, 0, 7);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        if ($state.isLoadingMore()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$FollowersListActivityKt.INSTANCE.getLambda$1512289713$app_debug(), 3, null);
        }
        if (!$state.getHasMore() && !$state.getFollowers().isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$FollowersListActivityKt.INSTANCE.getLambda$1336562650$app_debug(), 3, null);
        }
        if ($state.getFollowers().isEmpty() && !$state.isLoading()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1201979961, true, new Function3() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return FollowersListActivityKt.FollowersListContent$lambda$1$0$1($memberName, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowersListContent$lambda$1$0$1(String $memberName, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C317@11888L495:FollowersListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1201979961, $changed, -1, "com.yhchat.canarys.ui.community.FollowersListContent.<anonymous>.<anonymous>.<anonymous> (FollowersListActivity.kt:317)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(32));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
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
            ComposerKt.sourceInformationMarkerStart($composer, 2015279953, "C325@12247L10,326@12315L11,323@12110L255:FollowersListActivity.kt#cp0npg");
            TextKt.m3359Text4IGK_g(!StringsKt.isBlank($memberName) ? "\u6ca1\u6709\u5339\u914d\u7684\u5173\u6ce8\u8005" : "\u6682\u65e0\u5173\u6ce8\u8005", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
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

    public static final void FollowerItem(final BaFollowerItem follower, final boolean isUpdating, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Composer $composer3 = $composer.startRestartGroup(-1208273117);
        ComposerKt.sourceInformation($composer3, "C(FollowerItem)N(follower,isUpdating,onClick,onToggleAdmin)341@12619L34,342@12714L7,347@12811L13,344@12727L3035:FollowersListActivity.kt#cp0npg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(follower) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(isUpdating) ? 32 : 16;
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
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1208273117, $dirty, -1, "com.yhchat.canarys.ui.community.FollowerItem (FollowersListActivity.kt:340)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -1509289659, "CC(remember):FollowersListActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState showMenu$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Context context = (Context) objConsume;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer3, -1509283536, "CC(remember):FollowersListActivity.kt#9igjgp");
            boolean z = ($dirty & 896) == 256;
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FollowersListActivityKt.FollowerItem$lambda$3$0(function0);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue2, 15, null), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            $composer2 = $composer3;
            int $dirty2 = $dirty;
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM1051paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function03 = constructor;
                $composer3.createNode(function03);
            } else {
                function03 = constructor;
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i3 = ((384 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer3, -395260364, "C351@12956L803,375@13769L40,377@13819L656,404@14772L984:FollowersListActivity.kt#cp0npg");
            Modifier modifierClip = ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(44)), RoundedCornerShapeKt.getCircleShape());
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierClip);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function04 = constructor2;
                $composer3.createNode(function04);
            } else {
                function04 = constructor2;
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i5 = (i4 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i6 = ((0 >> 6) & 112) | 6;
            Composer composer = $composer3;
            ComposerKt.sourceInformationMarkerStart(composer, -619492082, "C:FollowersListActivity.kt#cp0npg");
            if (!StringsKt.isBlank(follower.getAvatarUrl())) {
                composer.startReplaceGroup(-619463718);
                ComposerKt.sourceInformation(composer, "357@13136L367");
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(new ImageRequest.Builder(context).data(follower.getAvatarUrl()).crossfade(true).build(), null, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1573296, 0, 4024);
                composer = composer;
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-619050457);
                ComposerKt.sourceInformation(composer, "369@13647L11,367@13541L194");
                SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.getCircleShape(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSurfaceVariant(), 0L, 0.0f, 0.0f, null, ComposableSingletons$FollowersListActivityKt.INSTANCE.m10819getLambda$1401169382$app_debug(), composer, 12582918, 120);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer3, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer3, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer3, modifierWeight$default);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function05 = constructor3;
                $composer3.createNode(function05);
            } else {
                function05 = constructor3;
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i8 = (i7 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i9 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 1676092521, "C378@13872L304,388@14283L10,389@14343L11,386@14189L276:FollowersListActivity.kt#cp0npg");
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer3, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap4 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer3, modifier);
            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function06 = constructor4;
                $composer3.createNode(function06);
            } else {
                function06 = constructor4;
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
            }
            Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i11 = (i10 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i12 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 130961442, "C381@14036L10,379@13942L220:FollowersListActivity.kt#cp0npg");
            TextKt.m3359Text4IGK_g(follower.getNickname(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodyLarge(), $composer3, 0, 3120, 55294);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            TextKt.m3359Text4IGK_g("ID : " + follower.getUserId(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodySmall(), $composer3, 0, 3120, 55290);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (follower.getUserLevel() == 2) {
                $composer3.startReplaceGroup(-393780797);
                ComposerKt.sourceInformation($composer3, "398@14602L10,399@14662L11,396@14528L224");
                TextKt.m3359Text4IGK_g("\u7ba1\u7406\u5458", PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, C1834Dp.m7806constructorimpl(8), 0.0f, 11, null), MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getBodySmall(), $composer3, 54, 0, 65528);
            } else {
                $composer3.startReplaceGroup(-408200509);
            }
            $composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier modifier2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
            CompositionLocalMap currentCompositionLocalMap5 = $composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer3, modifier2);
            Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            int i13 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer3.startReusableNode();
            if ($composer3.getInserting()) {
                function07 = constructor5;
                $composer3.createNode(function07);
            } else {
                function07 = constructor5;
                $composer3.useNode();
            }
            Composer composerM4376constructorimpl5 = Updater.m4376constructorimpl($composer3);
            Updater.m4383setimpl(composerM4376constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl5.rememberedValue(), Integer.valueOf(iHashCode5))) {
                composerM4376constructorimpl5.updateRememberedValue(Integer.valueOf(iHashCode5));
                composerM4376constructorimpl5.apply(Integer.valueOf(iHashCode5), setCompositeKeyHash5);
            }
            Updater.m4383setimpl(composerM4376constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            int i14 = (i13 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i15 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer3, 576026725, "C406@14828L120,412@15002L281,405@14790L493,422@15383L20,423@15418L328,420@15297L449:FollowersListActivity.kt#cp0npg");
            ComposerKt.sourceInformationMarkerStart($composer3, -1228344102, "CC(remember):FollowersListActivity.kt#9igjgp");
            boolean z2 = ($dirty2 & 112) == 32;
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FollowersListActivityKt.FollowerItem$lambda$4$2$0$0(isUpdating, showMenu$delegate);
                    }
                };
                $composer3.updateRememberedValue(objRememberedValue3);
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            IconButtonKt.IconButton((Function0) objRememberedValue3, null, !isUpdating, null, null, ComposableLambdaKt.rememberComposableLambda(-1562430875, true, new Function2() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return FollowersListActivityKt.FollowerItem$lambda$4$2$1(isUpdating, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 26);
            boolean zFollowerItem$lambda$1 = FollowerItem$lambda$1(showMenu$delegate);
            ComposerKt.sourceInformationMarkerStart($composer3, -1228326442, "CC(remember):FollowersListActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FollowersListActivityKt.FollowerItem$lambda$4$2$2$0(showMenu$delegate);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue4 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            AndroidMenu_androidKt.m2430DropdownMenuIlH_yew(zFollowerItem$lambda$1, (Function0) objRememberedValue4, null, 0L, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(405871517, true, new Function3() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return FollowersListActivityKt.FollowerItem$lambda$4$2$3(follower, function02, showMenu$delegate, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer3, 54), $composer3, 48, 48, 2044);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return FollowersListActivityKt.FollowerItem$lambda$5(follower, isUpdating, function0, function02, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final boolean FollowerItem$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FollowerItem$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit FollowerItem$lambda$3$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit FollowerItem$lambda$4$2$0$0(boolean $isUpdating, MutableState $showMenu$delegate) {
        if (!$isUpdating) {
            FollowerItem$lambda$2($showMenu$delegate, true);
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowerItem$lambda$4$2$1(boolean $isUpdating, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:FollowersListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1562430875, $changed, -1, "com.yhchat.canarys.ui.community.FollowerItem.<anonymous>.<anonymous>.<anonymous> (FollowersListActivity.kt:413)");
            }
            if ($isUpdating) {
                $composer.startReplaceGroup(-1817572985);
                ComposerKt.sourceInformation($composer, "414@15058L78");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(18)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1817450256);
                ComposerKt.sourceInformation($composer, "416@15182L69");
                IconKt.m2816Iconww6aTOc(MoreVertKt.getMoreVert(Icons.INSTANCE.getDefault()), "\u66f4\u591a", (Modifier) null, 0L, $composer, 48, 12);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowerItem$lambda$4$2$2$0(MutableState $showMenu$delegate) {
        FollowerItem$lambda$2($showMenu$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit FollowerItem$lambda$4$2$3(BaFollowerItem $follower, final Function0 $onToggleAdmin, final MutableState $showMenu$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C426@15535L43,427@15610L104,425@15490L242:FollowersListActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(405871517, $changed, -1, "com.yhchat.canarys.ui.community.FollowerItem.<anonymous>.<anonymous>.<anonymous> (FollowersListActivity.kt:424)");
            }
            final boolean isAdmin = $follower.getUserLevel() == 2;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-1465505939, true, new Function2() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FollowersListActivityKt.FollowerItem$lambda$4$2$3$0(isAdmin, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54);
            ComposerKt.sourceInformationMarkerStart($composer, -799489851, "CC(remember):FollowersListActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onToggleAdmin);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.FollowersListActivityKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FollowersListActivityKt.FollowerItem$lambda$4$2$3$1$0($onToggleAdmin, $showMenu$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue, null, null, null, false, null, null, null, $composer, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowerItem$lambda$4$2$3$0(boolean $isAdmin, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C426@15537L39:FollowersListActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1465505939, $changed, -1, "com.yhchat.canarys.ui.community.FollowerItem.<anonymous>.<anonymous>.<anonymous>.<anonymous> (FollowersListActivity.kt:426)");
            }
            TextKt.m3359Text4IGK_g($isAdmin ? "\u53d6\u6d88\u7ba1\u7406\u5458" : "\u8bbe\u7f6e\u7ba1\u7406\u5458", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit FollowerItem$lambda$4$2$3$1$0(Function0 $onToggleAdmin, MutableState $showMenu$delegate) {
        FollowerItem$lambda$2($showMenu$delegate, false);
        $onToggleAdmin.invoke();
        return Unit.INSTANCE;
    }
}
