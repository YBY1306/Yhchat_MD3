package com.yhchat.canarys.p007ui.community;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import com.google.accompanist.swiperefresh.SwipeRefreshKt;
import com.google.accompanist.swiperefresh.SwipeRefreshState;
import com.yhchat.canarys.data.model.CommunityPost;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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

/* compiled from: MyPostsActivity.kt */
@Metadata(m168d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t\u00b2\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002\u00b2\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002\u00b2\u0006\n\u0010\u000e\u001a\u00020\u0003X\u008a\u008e\u0002"}, m169d2 = {"MyPostsScreen", "", "token", "", "viewModel", "Lcom/yhchat/canarys/ui/community/CommunityViewModel;", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/community/CommunityViewModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_debug", "myPostListState", "Lcom/yhchat/canarys/ui/community/MyPostListState;", "isSearching", "", "searchQuery"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class MyPostsActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$10(String str, CommunityViewModel communityViewModel, Function0 function0, int i, Composer composer, int i2) {
        MyPostsScreen(str, communityViewModel, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MyPostsScreen(final String token, final CommunityViewModel viewModel, final Function0<Unit> onBackClick, Composer $composer, final int $changed) {
        State myPostListState$delegate;
        int $dirty;
        Iterable posts;
        List filteredPosts;
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer2 = $composer.startRestartGroup(-1842088355);
        ComposerKt.sourceInformation($composer2, "C(MyPostsScreen)N(token,viewModel,onBackClick)76@2894L7,77@2955L16,80@3012L34,81@3070L31,84@3147L356,96@3547L95,96@3525L117,105@3753L11,106@3823L10,102@3652L3457:MyPostsActivity.kt#cp0npg");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changed(token) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changedInstance(viewModel) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer2.changedInstance(onBackClick) ? 256 : 128;
        }
        int $dirty3 = $dirty2;
        if ($composer2.shouldExecute(($dirty3 & 147) != 146, $dirty3 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1842088355, $dirty3, -1, "com.yhchat.canarys.ui.community.MyPostsScreen (MyPostsActivity.kt:75)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            State myPostListState$delegate2 = SnapshotStateKt.collectAsState(viewModel.getMyPostListState(), null, $composer2, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer2, -720375041, "CC(remember):MyPostsActivity.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState isSearching$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -720373188, "CC(remember):MyPostsActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                myPostListState$delegate = myPostListState$delegate2;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            } else {
                myPostListState$delegate = myPostListState$delegate2;
            }
            final MutableState searchQuery$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            List<CommunityPost> posts2 = MyPostsScreen$lambda$0(myPostListState$delegate).getPosts();
            String strMyPostsScreen$lambda$5 = MyPostsScreen$lambda$5(searchQuery$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -720370399, "CC(remember):MyPostsActivity.kt#9igjgp");
            boolean zChanged = $composer2.changed(posts2) | $composer2.changed(strMyPostsScreen$lambda$5);
            int i = 0;
            Object objRememberedValue3 = $composer2.rememberedValue();
            int i2 = 0;
            if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                if (StringsKt.isBlank(MyPostsScreen$lambda$5(searchQuery$delegate))) {
                    posts = MyPostsScreen$lambda$0(myPostListState$delegate).getPosts();
                    $dirty = $dirty3;
                } else {
                    Iterable posts3 = MyPostsScreen$lambda$0(myPostListState$delegate).getPosts();
                    Collection arrayList = new ArrayList();
                    for (Object obj : posts3) {
                        int i3 = i;
                        CommunityPost communityPost = (CommunityPost) obj;
                        int $dirty4 = $dirty3;
                        Object obj2 = objRememberedValue3;
                        int i4 = i2;
                        if (StringsKt.contains((CharSequence) communityPost.getTitle(), (CharSequence) MyPostsScreen$lambda$5(searchQuery$delegate), true) || StringsKt.contains((CharSequence) communityPost.getContent(), (CharSequence) MyPostsScreen$lambda$5(searchQuery$delegate), true)) {
                            arrayList.add(obj);
                        }
                        i = i3;
                        i2 = i4;
                        $dirty3 = $dirty4;
                        objRememberedValue3 = obj2;
                    }
                    $dirty = $dirty3;
                    posts = (List) arrayList;
                }
                Iterable iterable = posts;
                $composer2.updateRememberedValue(iterable);
                objRememberedValue3 = iterable;
            } else {
                $dirty = $dirty3;
            }
            List filteredPosts2 = (List) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -720357860, "CC(remember):MyPostsActivity.kt#9igjgp");
            boolean zChangedInstance = (($dirty & 14) == 4) | $composer2.changedInstance(viewModel);
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                filteredPosts = filteredPosts2;
                Object obj3 = (Function2) new MyPostsActivityKt$MyPostsScreen$1$1(token, viewModel, null);
                $composer2.updateRememberedValue(obj3);
                objRememberedValue4 = obj3;
            } else {
                filteredPosts = filteredPosts2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(token, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, $composer2, $dirty & 14);
            Modifier modifierWindowInsetsPadding = WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m475backgroundbw27NRU$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getBackground(), null, 2, null), WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, $composer2, 6));
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierWindowInsetsPadding);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i6 = (i5 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i7 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1796820391, "C110@3899L633,127@4563L246,135@4833L1242,109@3868L2217,172@6143L55,176@6293L38,177@6342L761,174@6216L887:MyPostsActivity.kt#cp0npg");
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(29217643, true, new Function2() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return MyPostsActivityKt.MyPostsScreen$lambda$9$0(isSearching$delegate, searchQuery$delegate, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(932138221, true, new Function2() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return MyPostsActivityKt.MyPostsScreen$lambda$9$1(onBackClick, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(1121215318, true, new Function3() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj4, Object obj5, Object obj6) {
                    return MyPostsActivityKt.MyPostsScreen$lambda$9$2(context, token, isSearching$delegate, searchQuery$delegate, (RowScope) obj4, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), 0.0f, null, null, null, $composer2, 3462, 242);
            SwipeRefreshState swipeRefreshStateRememberSwipeRefreshState = SwipeRefreshKt.rememberSwipeRefreshState(MyPostsScreen$lambda$0(myPostListState$delegate).isRefreshing(), $composer2, 0);
            ComposerKt.sourceInformationMarkerStart($composer2, -1997550195, "CC(remember):MyPostsActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer2.changedInstance(viewModel) | (($dirty & 14) == 4);
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyPostsActivityKt.MyPostsScreen$lambda$9$3$0(viewModel, token);
                    }
                };
                $composer2.updateRememberedValue(obj4);
                objRememberedValue5 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final State myPostListState$delegate3 = myPostListState$delegate;
            final List filteredPosts3 = filteredPosts;
            SwipeRefreshKt.m8358SwipeRefreshFsagccs(swipeRefreshStateRememberSwipeRefreshState, (Function0) objRememberedValue5, null, false, 0.0f, null, null, null, false, ComposableLambdaKt.rememberComposableLambda(-1751683920, true, new Function2() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return MyPostsActivityKt.MyPostsScreen$lambda$9$4(filteredPosts3, context, token, viewModel, myPostListState$delegate3, searchQuery$delegate, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), $composer2, 805306368, 508);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return MyPostsActivityKt.MyPostsScreen$lambda$10(token, viewModel, onBackClick, $changed, (Composer) obj5, ((Integer) obj6).intValue());
                }
            });
        }
    }

    private static final MyPostListState MyPostsScreen$lambda$0(State<MyPostListState> state) {
        return (MyPostListState) state.getValue();
    }

    private static final boolean MyPostsScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MyPostsScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MyPostsScreen$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$0(MutableState $isSearching$delegate, final MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:MyPostsActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(29217643, $changed, -1, "com.yhchat.canarys.ui.community.MyPostsScreen.<anonymous>.<anonymous> (MyPostsActivity.kt:111)");
            }
            if (MyPostsScreen$lambda$2($isSearching$delegate)) {
                $composer.startReplaceGroup(-1455492319);
                ComposerKt.sourceInformation($composer, "114@4060L20,112@3956L310");
                String strMyPostsScreen$lambda$5 = MyPostsScreen$lambda$5($searchQuery$delegate);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, -1986610977, "CC(remember):MyPostsActivity.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return MyPostsActivityKt.MyPostsScreen$lambda$9$0$0$0($searchQuery$delegate, (String) obj2);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                OutlinedTextFieldKt.OutlinedTextField(strMyPostsScreen$lambda$5, (Function1<? super String, Unit>) objRememberedValue, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$MyPostsActivityKt.INSTANCE.getLambda$1590950207$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 12583344, 12582912, 0, 8257400);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-1455142949);
                ComposerKt.sourceInformation($composer, "122@4403L10,120@4312L188");
                TextKt.m3359Text4IGK_g("\u6211\u7684\u6587\u7ae0", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 196614, 0, 65502);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$0$0$0(MutableState $searchQuery$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchQuery$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C128@4581L214:MyPostsActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(932138221, $changed, -1, "com.yhchat.canarys.ui.community.MyPostsScreen.<anonymous>.<anonymous> (MyPostsActivity.kt:128)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$MyPostsActivityKt.INSTANCE.m10831getLambda$1544061750$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$2(final Context $context, final String $token, final MutableState $isSearching$delegate, final MutableState $searchQuery$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C157@5634L247,157@5613L448:MyPostsActivity.kt#cp0npg");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1121215318, $changed, -1, "com.yhchat.canarys.ui.community.MyPostsScreen.<anonymous>.<anonymous> (MyPostsActivity.kt:137)");
            }
            if (MyPostsScreen$lambda$2($isSearching$delegate)) {
                $composer.startReplaceGroup(164947515);
                ComposerKt.sourceInformation($composer, "138@4935L108,138@4914L329");
                ComposerKt.sourceInformationMarkerStart($composer, -548867326, "CC(remember):MyPostsActivity.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MyPostsActivityKt.MyPostsScreen$lambda$9$2$0$0($isSearching$delegate, $searchQuery$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$MyPostsActivityKt.INSTANCE.m10832getLambda$958628258$app_debug(), $composer, 196614, 30);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(165316942);
                ComposerKt.sourceInformation($composer, "148@5310L22,148@5289L246");
                ComposerKt.sourceInformationMarkerStart($composer, -548855412, "CC(remember):MyPostsActivity.kt#9igjgp");
                Object objRememberedValue2 = $composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MyPostsActivityKt.MyPostsScreen$lambda$9$2$1$0($isSearching$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, ComposableSingletons$MyPostsActivityKt.INSTANCE.getLambda$1020263669$app_debug(), $composer, 196614, 30);
                $composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart($composer, -548844819, "CC(remember):MyPostsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MyPostsActivityKt.MyPostsScreen$lambda$9$2$2$0($context, $token);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue3, null, false, null, null, ComposableSingletons$MyPostsActivityKt.INSTANCE.m10830getLambda$1432896487$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$2$0$0(MutableState $isSearching$delegate, MutableState $searchQuery$delegate) {
        MyPostsScreen$lambda$3($isSearching$delegate, false);
        $searchQuery$delegate.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$2$1$0(MutableState $isSearching$delegate) {
        MyPostsScreen$lambda$3($isSearching$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$2$2$0(Context $context, String $token) {
        Intent intent = new Intent($context, (Class<?>) BlockedUsersActivity.class);
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$3$0(CommunityViewModel $viewModel, String $token) {
        $viewModel.refreshMyPostList($token);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$4(List $filteredPosts, final Context $context, final String $token, final CommunityViewModel $viewModel, State $myPostListState$delegate, MutableState $searchQuery$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C183@6589L306,190@6928L85,178@6356L737:MyPostsActivity.kt#cp0npg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1751683920, $changed, -1, "com.yhchat.canarys.ui.community.MyPostsScreen.<anonymous>.<anonymous> (MyPostsActivity.kt:178)");
            }
            boolean zIsLoading = MyPostsScreen$lambda$0($myPostListState$delegate).isLoading();
            String error = MyPostsScreen$lambda$0($myPostListState$delegate).getError();
            String strMyPostsScreen$lambda$5 = MyPostsScreen$lambda$5($searchQuery$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 258941122, "CC(remember):MyPostsActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($token);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MyPostsActivityKt.MyPostsScreen$lambda$9$4$0$0($context, $token, (CommunityPost) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 258951749, "CC(remember):MyPostsActivity.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($viewModel) | $composer.changed($token);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.community.MyPostsActivityKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return MyPostsActivityKt.MyPostsScreen$lambda$9$4$1$0($viewModel, $token, ((Integer) obj3).intValue());
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            CommunityTabScreenKt.MyPostListContent($filteredPosts, zIsLoading, error, function1, (Function1) objRememberedValue2, $context, $token, strMyPostsScreen$lambda$5, null, $composer, 0, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$4$0$0(Context $context, String $token, CommunityPost post) {
        Intrinsics.checkNotNullParameter(post, "post");
        Intent intent = new Intent($context, (Class<?>) PostDetailActivity.class);
        intent.putExtra("post_id", post.getId());
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MyPostsScreen$lambda$9$4$1$0(CommunityViewModel $viewModel, String $token, int postId) {
        $viewModel.deletePost($token, postId);
        return Unit.INSTANCE;
    }
}
