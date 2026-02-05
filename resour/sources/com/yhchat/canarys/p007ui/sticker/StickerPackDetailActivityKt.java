package com.yhchat.canarys.p007ui.sticker;

import android.content.Context;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.text.TextLayoutResult;
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
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.yhchat.canarys.data.model.StickerItem;
import com.yhchat.canarys.data.model.StickerPack;
import com.yhchat.canarys.data.model.StickerPackCreator;
import com.yhchat.canarys.data.model.StickerPackDetailData;
import com.yhchat.canarys.p007ui.user.UserDetailActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: StickerPackDetailActivity.kt */
@Metadata(m168d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001aA\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bH\u0007\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0017\u001a\u00020\u0003X\u008a\u008e\u0002"}, m169d2 = {"StickerPackDetailScreen", "", "stickerPackId", "", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "StickerPackDetailContent", "stickerPackData", "Lcom/yhchat/canarys/data/model/StickerPackDetailData;", "onImageClick", "Lkotlin/Function1;", "onCreatorClick", "(Lcom/yhchat/canarys/data/model/StickerPackDetailData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "StickerItemView", "sticker", "Lcom/yhchat/canarys/data/model/StickerItem;", "(Lcom/yhchat/canarys/data/model/StickerItem;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/sticker/StickerPackDetailUiState;", "showImageViewer", "", "currentImageUrl"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final class StickerPackDetailActivityKt {
    public static final Unit StickerItemView$lambda$3(StickerItem stickerItem, Function1 function1, int i, int i2, Composer composer, int i3) {
        StickerItemView(stickerItem, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit StickerPackDetailContent$lambda$3(StickerPackDetailData stickerPackDetailData, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        StickerPackDetailContent(stickerPackDetailData, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit StickerPackDetailScreen$lambda$11(String str, Function0 function0, int i, Composer composer, int i2) {
        StickerPackDetailScreen(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void StickerPackDetailScreen(final java.lang.String r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.sticker.StickerPackDetailActivityKt.StickerPackDetailScreen(java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final StickerPackDetailUiState StickerPackDetailScreen$lambda$0(State<StickerPackDetailUiState> state) {
        return (StickerPackDetailUiState) state.getValue();
    }

    private static final boolean StickerPackDetailScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void StickerPackDetailScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String StickerPackDetailScreen$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit StickerPackDetailScreen$lambda$8(final Function0 $onBackClick, final StickerPackDetailViewModel $viewModel, final String $stickerPackId, final State $uiState$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C89@3106L274,97@3408L469,87@3019L872:StickerPackDetailActivity.kt#fniods");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1940089172, $changed, -1, "com.yhchat.canarys.ui.sticker.StickerPackDetailScreen.<anonymous> (StickerPackDetailActivity.kt:87)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$StickerPackDetailActivityKt.INSTANCE.m11829getLambda$1889873648$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-1284098866, true, new Function2() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return StickerPackDetailActivityKt.StickerPackDetailScreen$lambda$8$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-161544699, true, new Function3() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return StickerPackDetailActivityKt.StickerPackDetailScreen$lambda$8$1($viewModel, $stickerPackId, $uiState$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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

    public static final Unit StickerPackDetailScreen$lambda$8$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C90@3128L234:StickerPackDetailActivity.kt#fniods");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1284098866, $changed, -1, "com.yhchat.canarys.ui.sticker.StickerPackDetailScreen.<anonymous>.<anonymous> (StickerPackDetailActivity.kt:90)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$StickerPackDetailActivityKt.INSTANCE.m11827getLambda$1179824879$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit StickerPackDetailScreen$lambda$8$1(final StickerPackDetailViewModel $viewModel, final String $stickerPackId, State $uiState$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C:StickerPackDetailActivity.kt#fniods");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-161544699, $changed, -1, "com.yhchat.canarys.ui.sticker.StickerPackDetailScreen.<anonymous>.<anonymous> (StickerPackDetailActivity.kt:98)");
            }
            if (StickerPackDetailScreen$lambda$0($uiState$delegate).getStickerPack() != null) {
                $composer.startReplaceGroup(2080277745);
                ComposerKt.sourceInformation($composer, "100@3539L54,99@3489L348");
                ComposerKt.sourceInformationMarkerStart($composer, -625628837, "CC(remember):StickerPackDetailActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel) | $composer.changed($stickerPackId);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StickerPackDetailActivityKt.StickerPackDetailScreen$lambda$8$1$0$0($viewModel, $stickerPackId);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$StickerPackDetailActivityKt.INSTANCE.m11828getLambda$1655078915$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            } else {
                $composer.startReplaceGroup(2076829181);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit StickerPackDetailScreen$lambda$8$1$0$0(StickerPackDetailViewModel $viewModel, String $stickerPackId) {
        $viewModel.addStickerPackToFavorites($stickerPackId);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit StickerPackDetailScreen$lambda$9(final android.content.Context r52, androidx.compose.runtime.State r53, final androidx.compose.runtime.MutableState r54, final androidx.compose.runtime.MutableState r55, androidx.compose.foundation.layout.PaddingValues r56, androidx.compose.runtime.Composer r57, int r58) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.sticker.StickerPackDetailActivityKt.StickerPackDetailScreen$lambda$9(android.content.Context, androidx.compose.runtime.State, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit StickerPackDetailScreen$lambda$9$0$0$0(MutableState $currentImageUrl$delegate, MutableState $showImageViewer$delegate, String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        $currentImageUrl$delegate.setValue(imageUrl);
        StickerPackDetailScreen$lambda$3($showImageViewer$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit StickerPackDetailScreen$lambda$9$0$1$0(Context $context, String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        UserDetailActivity.Companion.start$default(UserDetailActivity.INSTANCE, $context, userId, null, null, 12, null);
        return Unit.INSTANCE;
    }

    public static final Unit StickerPackDetailScreen$lambda$10$0(MutableState $showImageViewer$delegate, MutableState $currentImageUrl$delegate) {
        StickerPackDetailScreen$lambda$3($showImageViewer$delegate, false);
        $currentImageUrl$delegate.setValue("");
        return Unit.INSTANCE;
    }

    public static final Unit StickerPackDetailContent$lambda$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit StickerPackDetailContent$lambda$1$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x038f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void StickerPackDetailContent(final com.yhchat.canarys.data.model.StickerPackDetailData r61, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r62, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r63, androidx.compose.runtime.Composer r64, final int r65, final int r66) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.sticker.StickerPackDetailActivityKt.StickerPackDetailContent(com.yhchat.canarys.data.model.StickerPackDetailData, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit StickerPackDetailContent$lambda$2$0(StickerPack $stickerPack, final StickerPackCreator $creator, final Function1 $onCreatorClick, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        Function0 function06;
        Function0 function07;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C177@6096L3819:StickerPackDetailActivity.kt#fniods");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-208982571, $changed, -1, "com.yhchat.canarys.ui.sticker.StickerPackDetailContent.<anonymous>.<anonymous> (StickerPackDetailActivity.kt:177)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1719971439, "C184@6337L10,182@6244L185,188@6463L40,219@7854L40,222@7952L1949:StickerPackDetailActivity.kt#fniods");
            TextKt.m3359Text4IGK_g($stickerPack.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getHeadlineSmall(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            if ($creator != null) {
                $composer.startReplaceGroup(1720253290);
                ComposerKt.sourceInformation($composer, "194@6736L34,192@6605L1197");
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Modifier.Companion companion = Modifier.INSTANCE;
                ComposerKt.sourceInformationMarkerStart($composer, -1607072915, "CC(remember):StickerPackDetailActivity.kt#9igjgp");
                boolean zChanged = $composer.changed($onCreatorClick) | $composer.changed($creator);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return StickerPackDetailActivityKt.StickerPackDetailContent$lambda$2$0$0$0$0($onCreatorClick, $creator);
                        }
                    };
                    $composer.updateRememberedValue(objRememberedValue);
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(companion, false, null, null, null, (Function0) objRememberedValue, 15, null);
                ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM516clickableoSLSa3U$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((384 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function06 = constructor2;
                    $composer.createNode(function06);
                } else {
                    function06 = constructor2;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i6 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -425562536, "C196@6819L308,203@7152L39,204@7216L564:StickerPackDetailActivity.kt#fniods");
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8($creator.getAvatarUrl(), "\u521b\u5efa\u8005\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16))), null, null, null, null, 0.0f, null, 0, false, null, $composer, 48, 0, 4088);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier modifier = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifier);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function07 = constructor3;
                    $composer.createNode(function07);
                } else {
                    function07 = constructor3;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                    composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                    composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                }
                Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i8 = (i7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                int i9 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1212815086, "C207@7370L10,205@7253L232,212@7620L10,213@7696L11,210@7514L240:StickerPackDetailActivity.kt#fniods");
                TextKt.m3359Text4IGK_g($creator.getNickname(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
                TextKt.m3359Text4IGK_g("\u521b\u5efa\u8005", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
            } else {
                $composer.startReplaceGroup(1713663031);
            }
            $composer.endReplaceGroup();
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor4;
                $composer.createNode(function02);
            } else {
                function02 = constructor4;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
            }
            Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            int i11 = (i10 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i12 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 103804275, "C226@8122L538,238@8681L530,250@9232L651:StickerPackDetailActivity.kt#fniods");
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode5 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap5 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier5 = ComposedModifierKt.materializeModifier($composer, modifier2);
            Function0 constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            int i13 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function03 = constructor5;
                $composer.createNode(function03);
            } else {
                function03 = constructor5;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl5 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl5, measurePolicyColumnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl5.rememberedValue(), Integer.valueOf(iHashCode5))) {
                composerM4376constructorimpl5.updateRememberedValue(Integer.valueOf(iHashCode5));
                composerM4376constructorimpl5.apply(Integer.valueOf(iHashCode5), setCompositeKeyHash5);
            }
            Updater.m4383setimpl(composerM4376constructorimpl5, modifierMaterializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            int i14 = (i13 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            int i15 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1833580677, "C229@8282L10,227@8155L233,234@8512L10,235@8584L11,232@8413L225:StickerPackDetailActivity.kt#fniods");
            TextKt.m3359Text4IGK_g(String.valueOf($stickerPack.getStickerItems().size()), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            TextKt.m3359Text4IGK_g("\u8868\u60c5\u6570\u91cf", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode6 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap6 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifierKt.materializeModifier($composer, modifier3);
            Function0 constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            int i16 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function04 = constructor6;
                $composer.createNode(function04);
            } else {
                function04 = constructor6;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl6 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl6, measurePolicyColumnMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl6.rememberedValue(), Integer.valueOf(iHashCode6))) {
                composerM4376constructorimpl6.updateRememberedValue(Integer.valueOf(iHashCode6));
                composerM4376constructorimpl6.apply(Integer.valueOf(iHashCode6), setCompositeKeyHash6);
            }
            Updater.m4383setimpl(composerM4376constructorimpl6, modifierMaterializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            int i17 = (i16 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance4 = ColumnScopeInstance.INSTANCE;
            int i18 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 547881516, "C241@8833L10,239@8714L225,246@9063L10,247@9135L11,244@8964L225:StickerPackDetailActivity.kt#fniods");
            TextKt.m3359Text4IGK_g(String.valueOf($stickerPack.getUserCount()), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            TextKt.m3359Text4IGK_g("\u4f7f\u7528\u4eba\u6570", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier modifier4 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode7 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap7 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier7 = ComposedModifierKt.materializeModifier($composer, modifier4);
            Function0 constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            int i19 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function05 = constructor7;
                $composer.createNode(function05);
            } else {
                function05 = constructor7;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl7 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl7, measurePolicyColumnMeasurePolicy5, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl7.rememberedValue(), Integer.valueOf(iHashCode7))) {
                composerM4376constructorimpl7.updateRememberedValue(Integer.valueOf(iHashCode7));
                composerM4376constructorimpl7.apply(Integer.valueOf(iHashCode7), setCompositeKeyHash7);
            }
            Updater.m4383setimpl(composerM4376constructorimpl7, modifierMaterializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            int i20 = (i19 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance5 = ColumnScopeInstance.INSTANCE;
            int i21 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -156975054, "C254@9505L10,252@9358L253,259@9735L10,260@9807L11,257@9636L225:StickerPackDetailActivity.kt#fniods");
            String str = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(1000 * $stickerPack.getCreateTime()));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            TextKt.m3359Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            TextKt.m3359Text4IGK_g("\u521b\u5efa\u65f6\u95f4", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
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

    public static final Unit StickerPackDetailContent$lambda$2$0$0$0$0(Function1 $onCreatorClick, StickerPackCreator $creator) {
        $onCreatorClick.invoke($creator.getUserId());
        return Unit.INSTANCE;
    }

    public static final Unit StickerPackDetailContent$lambda$2$1$0(StickerPack $stickerPack, final Function1 $onImageClick, LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        final List stickerItems = $stickerPack.getStickerItems();
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$StickerPackDetailContent$lambda$2$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((StickerItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(StickerItem stickerItem) {
                return null;
            }
        };
        LazyVerticalGrid.items(stickerItems.size(), null, null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$StickerPackDetailContent$lambda$2$1$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(stickerItems.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-1117249557, true, new Function4<LazyGridItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$StickerPackDetailContent$lambda$2$1$0$$inlined$items$default$5
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyGridItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyGridItemScope $this$items, int it, Composer $composer, int $changed) {
                ComposerKt.sourceInformation($composer, "CN(it)539@23988L22:LazyGridDsl.kt#7791vq");
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
                    ComposerKt.traceEventStart(-1117249557, $dirty, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:539)");
                }
                StickerItem stickerItem = (StickerItem) stickerItems.get(it);
                $composer.startReplaceGroup(1622110243);
                ComposerKt.sourceInformation($composer, "CN(sticker)*286@10573L121:StickerPackDetailActivity.kt#fniods");
                StickerPackDetailActivityKt.StickerItemView(stickerItem, $onImageClick, $composer, (($dirty & 14) >> 3) & 14, 0);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    public static final Unit StickerItemView$lambda$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void StickerItemView(final StickerItem sticker, Function1<? super String, Unit> function1, Composer $composer, final int $changed, final int i) {
        Function1 function12;
        final Function1 onImageClick;
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        Composer $composer2 = $composer.startRestartGroup(1995432532);
        ComposerKt.sourceInformation($composer2, "C(StickerItemView)N(sticker,onImageClick)298@10854L2,309@11149L83,313@11267L38,314@11312L959,306@11018L1253:StickerPackDetailActivity.kt#fniods");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(sticker) ? 4 : 2;
        }
        int i2 = i & 2;
        if (i2 != 0) {
            $dirty |= 48;
            function12 = function1;
        } else if (($changed & 48) == 0) {
            function12 = function1;
            $dirty |= $composer2.changedInstance(function12) ? 32 : 16;
        } else {
            function12 = function1;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            onImageClick = function12;
        } else {
            if (i2 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer2, 2055252886, "CC(remember):StickerPackDetailActivity.kt#9igjgp");
                Object objRememberedValue = $composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return StickerPackDetailActivityKt.StickerItemView$lambda$0$0((String) obj2);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function1 onImageClick2 = (Function1) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                onImageClick = onImageClick2;
            } else {
                onImageClick = function12;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1995432532, $dirty2, -1, "com.yhchat.canarys.ui.sticker.StickerItemView (StickerPackDetailActivity.kt:299)");
            }
            final String imageUrl = StringsKt.startsWith$default(sticker.getUrl(), "http", false, 2, (Object) null) ? sticker.getUrl() : "https://chat-img.jwznb.com/" + sticker.getUrl();
            Modifier modifierAspectRatio$default = AspectRatioKt.aspectRatio$default(Modifier.INSTANCE, 0.8f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 2055262407, "CC(remember):StickerPackDetailActivity.kt#9igjgp");
            boolean zChanged = $composer2.changed(imageUrl) | (($dirty2 & 112) == 32);
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return StickerPackDetailActivityKt.StickerItemView$lambda$1$0(onImageClick, imageUrl);
                    }
                };
                $composer2.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            CardKt.Card(ClickableKt.m516clickableoSLSa3U$default(modifierAspectRatio$default, false, null, null, null, (Function0) objRememberedValue2, 15, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer2, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(221639458, true, new Function3() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return StickerPackDetailActivityKt.StickerItemView$lambda$2(sticker, imageUrl, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), $composer2, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.sticker.StickerPackDetailActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return StickerPackDetailActivityKt.StickerItemView$lambda$3(sticker, onImageClick, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public static final Unit StickerItemView$lambda$1$0(Function1 $onImageClick, String $imageUrl) {
        $onImageClick.invoke($imageUrl);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x0347  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit StickerItemView$lambda$2(com.yhchat.canarys.data.model.StickerItem r73, java.lang.String r74, androidx.compose.foundation.layout.ColumnScope r75, androidx.compose.runtime.Composer r76, int r77) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.sticker.StickerPackDetailActivityKt.StickerItemView$lambda$2(com.yhchat.canarys.data.model.StickerItem, java.lang.String, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }
}
