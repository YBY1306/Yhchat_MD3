package com.yhchat.canarys.p007ui.community;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
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
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckBoxKt;
import androidx.compose.material.icons.filled.CheckBoxOutlineBlankKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TabKt;
import androidx.compose.material3.TabRowKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.layout.ContentScale;
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
import androidx.compose.p000ui.text.style.TextOverflow;
import androidx.compose.p000ui.unit.C1834Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import coil.compose.SingletonAsyncImageKt;
import com.yhchat.canarys.data.model.CommunityPost;
import com.yhchat.canarys.proto.user.User;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShareToFriendBottomSheet.kt */
@Metadata(m168d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t\u00b2\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0010X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, m169d2 = {"ShareToFriendBottomSheet", "", "post", "Lcom/yhchat/canarys/data/model/CommunityPost;", "viewModel", "Lcom/yhchat/canarys/ui/community/PostDetailViewModel;", "onDismiss", "Lkotlin/Function0;", "(Lcom/yhchat/canarys/data/model/CommunityPost;Lcom/yhchat/canarys/ui/community/PostDetailViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "searchQuery", "", "contacts", "", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data;", "isLoading", "", "selectedContacts", "", "Lcom/yhchat/canarys/ui/community/SelectedContact;", "isSending", "selectedTab", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class ShareToFriendBottomSheetKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareToFriendBottomSheet$lambda$23(CommunityPost communityPost, PostDetailViewModel postDetailViewModel, Function0 function0, int i, Composer composer, int i2) {
        ShareToFriendBottomSheet(communityPost, postDetailViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ShareToFriendBottomSheet(final com.yhchat.canarys.data.model.CommunityPost r30, final com.yhchat.canarys.p007ui.community.PostDetailViewModel r31, final kotlin.jvm.functions.Function0<kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34) {
        /*
            Method dump skipped, instructions count: 987
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.ShareToFriendBottomSheetKt.ShareToFriendBottomSheet(com.yhchat.canarys.data.model.CommunityPost, com.yhchat.canarys.ui.community.PostDetailViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int):void");
    }

    private static final String ShareToFriendBottomSheet$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<User.address_book_list.Data> ShareToFriendBottomSheet$lambda$4(MutableState<List<User.address_book_list.Data>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ShareToFriendBottomSheet$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShareToFriendBottomSheet$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<SelectedContact> ShareToFriendBottomSheet$lambda$10(MutableState<Set<SelectedContact>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ShareToFriendBottomSheet$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ShareToFriendBottomSheet$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ShareToFriendBottomSheet$lambda$16$0() {
        return 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ShareToFriendBottomSheet$lambda$18(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ShareToFriendBottomSheet$lambda$19(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareToFriendBottomSheet$lambda$22(PagerState $pagerState, final CoroutineScope $scope, final PostDetailViewModel $viewModel, final CommunityPost $post, final Function0 $onDismiss, MutableState $selectedContacts$delegate, final MutableState $isSending$delegate, final MutableState $selectedTab$delegate, final MutableState $searchQuery$delegate, MutableState $isLoading$delegate, final MutableState $contacts$delegate, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0 function0;
        Object obj;
        Composer composer;
        String str;
        Composer composer2;
        Composer composer3;
        final MutableState mutableState;
        String str2;
        Function0 function02;
        Composer composer4;
        Function0 function03;
        int i;
        Composer composer5;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C95@3694L11,91@3542L8181:ShareToFriendBottomSheet.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-872519487, $changed, -1, "com.yhchat.canarys.ui.community.ShareToFriendBottomSheet.<anonymous> (ShareToFriendBottomSheet.kt:91)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(BackgroundKt.m475backgroundbw27NRU$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.95f), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), null, 2, null), C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            int i4 = ((0 >> 6) & 112) | 6;
            ColumnScope columnScope = ColumnScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -740171012, "C99@3793L1694,140@5521L1340,170@6875L40,184@7526L11,183@7461L121,175@7046L20,173@6958L638,188@7610L41:ShareToFriendBottomSheet.kt#cp0npg");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((438 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i6 = (i5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i7 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 2016215634, "C106@4093L10,104@4011L171,111@4258L870,130@5222L251,110@4216L1257:ShareToFriendBottomSheet.kt#cp0npg");
            TextKt.m3359Text4IGK_g("\u5206\u4eab\u81f3", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 196614, 0, 65502);
            ComposerKt.sourceInformationMarkerStart($composer, -904784799, "CC(remember):ShareToFriendBottomSheet.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changedInstance($viewModel) | $composer.changed($post) | $composer.changed($onDismiss);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer = $composer;
                str = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
                composer2 = $composer;
                composer3 = $composer;
                mutableState = $selectedContacts$delegate;
                str2 = "CC(remember):ShareToFriendBottomSheet.kt#9igjgp";
                obj = new Function0() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$22$0$0$0$0($scope, mutableState, $isSending$delegate, $onDismiss, $viewModel, $post);
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                mutableState = $selectedContacts$delegate;
                composer = $composer;
                str = "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh";
                obj = objRememberedValue;
                composer2 = $composer;
                composer3 = $composer;
                str2 = "CC(remember):ShareToFriendBottomSheet.kt#9igjgp";
            }
            Function0 function04 = (Function0) obj;
            ComposerKt.sourceInformationMarkerEnd(composer);
            ButtonKt.TextButton(function04, null, (ShareToFriendBottomSheet$lambda$10(mutableState).isEmpty() || ShareToFriendBottomSheet$lambda$13($isSending$delegate)) ? false : true, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(677230360, true, new Function3() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$22$0$0$1($isSending$delegate, mutableState, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, composer, 54), composer, 805306368, 506);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, str);
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default2);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i8 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor3;
                $composer.createNode(function02);
            } else {
                function02 = constructor3;
                $composer.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i9 = (i8 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i10 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 770472933, "C148@5919L11,151@6031L816,144@5662L1185:ShareToFriendBottomSheet.kt#cp0npg");
            TabRowKt.m3259ScrollableTabRowsKfQg0A(ShareToFriendBottomSheet$lambda$18($selectedTab$delegate), SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null), Color.INSTANCE.m5092getTransparent0d7_KjU(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), C1834Dp.m7806constructorimpl(0), null, ComposableSingletons$ShareToFriendBottomSheetKt.INSTANCE.getLambda$498313308$app_debug(), ComposableLambdaKt.rememberComposableLambda(2131211037, true, new Function2() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$22$0$1$0($selectedTab$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 14180784, 32);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            String strShareToFriendBottomSheet$lambda$1 = ShareToFriendBottomSheet$lambda$1($searchQuery$delegate);
            Modifier modifierM1088height3ABfNKs = SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(50));
            RoundedCornerShape roundedCornerShapeM1414RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(25));
            OutlinedTextFieldDefaults outlinedTextFieldDefaults = OutlinedTextFieldDefaults.INSTANCE;
            long outline = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOutline();
            TextFieldColors textFieldColorsM3009colors0hiis_0 = outlinedTextFieldDefaults.m3009colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, Color.m5055copywmQWz5c(outline, (14 & 1) != 0 ? Color.m5059getAlphaimpl(outline) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(outline) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(outline) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(outline) : 0.0f), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 0, 0, 0, 0, 3072, 2147479551, 4095);
            ComposerKt.sourceInformationMarkerStart($composer, -716516949, str2);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$22$0$2$0($searchQuery$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue2);
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strShareToFriendBottomSheet$lambda$1, (Function1<? super String, Unit>) objRememberedValue2, modifierM1088height3ABfNKs, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ShareToFriendBottomSheetKt.INSTANCE.m10861getLambda$1771925776$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ShareToFriendBottomSheetKt.INSTANCE.m10862getLambda$1847764337$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) roundedCornerShapeM1414RoundedCornerShape0680j_4, textFieldColorsM3009colors0hiis_0, $composer, 113246640, 12582912, 0, 1965688);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            if (ShareToFriendBottomSheet$lambda$7($isLoading$delegate)) {
                $composer.startReplaceGroup(-736526436);
                ComposerKt.sourceInformation($composer, "192@7727L143");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, str);
                int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
                Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                int i11 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function03 = constructor4;
                    $composer.createNode(function03);
                } else {
                    function03 = constructor4;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl4 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM4376constructorimpl4.getInserting()) {
                    i = 54;
                    composer5 = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i12 = (i11 >> 6) & 14;
                    Composer composer6 = composer5;
                    ComposerKt.sourceInformationMarkerStart(composer6, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    int i13 = ((i >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer6, -540523920, "C193@7825L27:ShareToFriendBottomSheet.kt#cp0npg");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer6, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    ComposerKt.sourceInformationMarkerEnd(composer6);
                    composer5.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    ComposerKt.sourceInformationMarkerEnd(composer5);
                    $composer.endReplaceGroup();
                    composer4 = $composer;
                } else {
                    i = 54;
                    composer5 = $composer;
                }
                composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                int i122 = (i11 >> 6) & 14;
                Composer composer62 = composer5;
                ComposerKt.sourceInformationMarkerStart(composer62, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
                int i132 = ((i >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer62, -540523920, "C193@7825L27:ShareToFriendBottomSheet.kt#cp0npg");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, composer62, 0, 31);
                ComposerKt.sourceInformationMarkerEnd(composer62);
                ComposerKt.sourceInformationMarkerEnd(composer62);
                composer5.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                ComposerKt.sourceInformationMarkerEnd(composer5);
                $composer.endReplaceGroup();
                composer4 = $composer;
            } else {
                $composer.startReplaceGroup(-736233796);
                ComposerKt.sourceInformation($composer, "199@8034L3665,196@7908L3791");
                PagerKt.m1353HorizontalPager8jOkeI($pagerState, ColumnScope.weight$default(columnScope, Modifier.INSTANCE, 1.0f, false, 2, null), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-729673508, true, new Function4() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        return ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$22$0$4($contacts$delegate, $searchQuery$delegate, mutableState, (PagerScope) obj2, ((Integer) obj3).intValue(), (Composer) obj4, ((Integer) obj5).intValue());
                    }
                }, $composer, 54), $composer, 0, 24576, 16380);
                composer4 = $composer;
                composer4.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareToFriendBottomSheet$lambda$22$0$0$0$0(CoroutineScope $scope, MutableState $selectedContacts$delegate, MutableState $isSending$delegate, Function0 $onDismiss, PostDetailViewModel $viewModel, CommunityPost $post) {
        if (!ShareToFriendBottomSheet$lambda$10($selectedContacts$delegate).isEmpty() && !ShareToFriendBottomSheet$lambda$13($isSending$delegate)) {
            ShareToFriendBottomSheet$lambda$14($isSending$delegate, true);
            BuildersKt__Builders_commonKt.launch$default($scope, null, null, new ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1($onDismiss, $selectedContacts$delegate, $viewModel, $post, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareToFriendBottomSheet$lambda$22$0$0$1(MutableState $isSending$delegate, MutableState $selectedContacts$delegate, RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C:ShareToFriendBottomSheet.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(677230360, $changed, -1, "com.yhchat.canarys.ui.community.ShareToFriendBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShareToFriendBottomSheet.kt:131)");
            }
            if (ShareToFriendBottomSheet$lambda$13($isSending$delegate)) {
                $composer.startReplaceGroup(1908305440);
                ComposerKt.sourceInformation($composer, "132@5285L58");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, 0.0f, 0L, 0, $composer, 6, 30);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1908415862);
                ComposerKt.sourceInformation($composer, "134@5397L36");
                TextKt.m3359Text4IGK_g("\u53d1\u9001(" + ShareToFriendBottomSheet$lambda$10($selectedContacts$delegate).size() + ")", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareToFriendBottomSheet$lambda$22$0$1$0(final MutableState $selectedTab$delegate, Composer $composer, int $changed) {
        Composer composer = $composer;
        ComposerKt.sourceInformation(composer, "C*155@6252L23,156@6312L469,153@6148L659:ShareToFriendBottomSheet.kt#cp0npg");
        boolean z = true;
        if (!composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2131211037, $changed, -1, "com.yhchat.canarys.ui.community.ShareToFriendBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShareToFriendBottomSheet.kt:152)");
            }
            final int i = 0;
            for (Object obj : CollectionsKt.listOf((Object[]) new String[]{"  \u597d\u53cb  ", "  \u7fa4\u804a  ", "  \u673a\u5668\u4eba  "})) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String str = (String) obj;
                boolean z2 = ShareToFriendBottomSheet$lambda$18($selectedTab$delegate) == i ? z : false;
                ComposerKt.sourceInformationMarkerStart(composer, -529649382, "CC(remember):ShareToFriendBottomSheet.kt#9igjgp");
                boolean zChanged = composer.changed(i);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$22$0$1$0$0$0$0(i, $selectedTab$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                TabKt.m3245TabwqdebIU(z2, (Function0) objRememberedValue, null, false, ComposableLambdaKt.rememberComposableLambda(-1233211799, z, new Function2() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$22$0$1$0$0$1(i, str, $selectedTab$delegate, (Composer) obj3, ((Integer) obj4).intValue());
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
    public static final Unit ShareToFriendBottomSheet$lambda$22$0$1$0$0$0$0(int $index, MutableState $selectedTab$delegate) {
        ShareToFriendBottomSheet$lambda$19($selectedTab$delegate, $index);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareToFriendBottomSheet$lambda$22$0$1$0$0$1(int $index, String $title, MutableState $selectedTab$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C159@6460L10,157@6346L405:ShareToFriendBottomSheet.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1233211799, $changed, -1, "com.yhchat.canarys.ui.community.ShareToFriendBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ShareToFriendBottomSheet.kt:157)");
            }
            TextKt.m3359Text4IGK_g($title, (Modifier) null, 0L, 0L, (FontStyle) null, ShareToFriendBottomSheet$lambda$18($selectedTab$delegate) == $index ? FontWeight.INSTANCE.getBold() : FontWeight.INSTANCE.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 0, 3120, 55262);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareToFriendBottomSheet$lambda$22$0$2$0(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ShareToFriendBottomSheet$lambda$22$0$4(androidx.compose.runtime.MutableState r28, androidx.compose.runtime.MutableState r29, final androidx.compose.runtime.MutableState r30, androidx.compose.foundation.pager.PagerScope r31, final int r32, androidx.compose.runtime.Composer r33, int r34) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$22$0$4(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.pager.PagerScope, int, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ShareToFriendBottomSheet$lambda$22$0$4$1$0(final List $pageList, final int $page, final MutableState $selectedContacts$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$lambda$22$0$4$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((User.address_book_list.Data.Data_list) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(User.address_book_list.Data.Data_list data_list) {
                return null;
            }
        };
        LazyColumn.items($pageList.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$lambda$22$0$4$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($pageList.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$lambda$22$0$4$1$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Function0 function0;
                long onSurfaceVariant;
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
                int i = 2;
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
                    int i2 = $dirty & 14;
                    User.address_book_list.Data.Data_list data_list = (User.address_book_list.Data.Data_list) $pageList.get(it);
                    $composer.startReplaceGroup(2042905039);
                    ComposerKt.sourceInformation($composer, "CN(item)*233@9610L502,230@9454L2179:ShareToFriendBottomSheet.kt#cp0npg");
                    switch ($page) {
                        case 0:
                            i = 1;
                            break;
                        case 1:
                            break;
                        case 2:
                            i = 3;
                            break;
                        default:
                            i = 1;
                            break;
                    }
                    String chatId = data_list.getChatId();
                    Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
                    final SelectedContact selectedContact = new SelectedContact(chatId, i);
                    final boolean zContains = ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$10($selectedContacts$delegate).contains(selectedContact);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer, 1728485940, "CC(remember):ShareToFriendBottomSheet.kt#9igjgp");
                    boolean zChanged = $composer.changed(zContains) | $composer.changed(selectedContact);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final MutableState mutableState = $selectedContacts$delegate;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$5$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (!zContains) {
                                    if (ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$10(mutableState).size() >= 10) {
                                        return;
                                    }
                                    mutableState.setValue(SetsKt.plus((Set<? extends SelectedContact>) ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$10(mutableState), selectedContact));
                                    return;
                                }
                                mutableState.setValue(SetsKt.minus((Set<? extends SelectedContact>) ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$10(mutableState), selectedContact));
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), C1834Dp.m7806constructorimpl(8));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
                    Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                    int i3 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                    Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                        composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                        composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i4 = (i3 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i5 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1318937042, "C245@10308L373,251@10747L40,253@10853L406,262@11325L40,266@11549L10,264@11431L172:ShareToFriendBottomSheet.kt#cp0npg");
                    Icons.Filled filled = Icons.INSTANCE.getDefault();
                    ImageVector checkBox = zContains ? CheckBoxKt.getCheckBox(filled) : CheckBoxOutlineBlankKt.getCheckBoxOutlineBlank(filled);
                    if (zContains) {
                        $composer.startReplaceGroup(1012385481);
                        ComposerKt.sourceInformation($composer, "248@10580L11");
                        onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary();
                    } else {
                        $composer.startReplaceGroup(1012386738);
                        ComposerKt.sourceInformation($composer, "248@10619L11");
                        onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
                    }
                    $composer.endReplaceGroup();
                    IconKt.m2816Iconww6aTOc(checkBox, (String) null, (Modifier) null, onSurfaceVariant, $composer, 48, 4);
                    SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
                    SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(data_list.getAvatarUrl(), null, ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(40)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1572912, 0, 4024);
                    SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
                    String name = data_list.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    TextKt.m3359Text4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65534);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
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
}
