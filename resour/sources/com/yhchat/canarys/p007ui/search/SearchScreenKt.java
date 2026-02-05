package com.yhchat.canarys.p007ui.search;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
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
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.SearchKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardElevation;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.layout.MeasurePolicy;
import androidx.compose.p000ui.node.ComposeUiNode;
import androidx.compose.p000ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p000ui.text.TextLayoutResult;
import androidx.compose.p000ui.text.TextStyle;
import androidx.compose.p000ui.text.font.FontFamily;
import androidx.compose.p000ui.text.font.FontStyle;
import androidx.compose.p000ui.text.font.FontWeight;
import androidx.compose.p000ui.text.input.ImeAction;
import androidx.compose.p000ui.text.input.PlatformImeOptions;
import androidx.compose.p000ui.text.input.VisualTransformation;
import androidx.compose.p000ui.text.intl.LocaleList;
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
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.model.SearchCategory;
import com.yhchat.canarys.data.model.SearchData;
import com.yhchat.canarys.data.model.SearchItem;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.ConversationRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* compiled from: SearchScreen.kt */
@Metadata(m168d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a|\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032K\u0010\u0004\u001aG\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012\u00b2\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002\u00b2\u0006\f\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0017\u001a\u00020\u0006X\u008a\u008e\u0002"}, m169d2 = {"SearchScreen", "", "onBackClick", "Lkotlin/Function0;", "onItemClick", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, ChatSearchActivity.EXTRA_CHAT_NAME, "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lcom/yhchat/canarys/data/repository/TokenRepository;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/search/SearchUiState;", "searchResult", "Lcom/yhchat/canarys/data/model/SearchData;", "searchText"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class SearchScreenKt {
    public static final Unit SearchScreen$lambda$8(Function0 function0, Function3 function3, TokenRepository tokenRepository, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SearchScreen(function0, function3, tokenRepository, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.lifecycle.viewmodel.CreationExtras] */
    public static final void SearchScreen(final Function0<Unit> onBackClick, final Function3<? super String, ? super Integer, ? super String, Unit> onItemClick, final TokenRepository tokenRepository, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        SearchViewModel viewModel;
        State uiState$delegate;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onItemClick, "onItemClick");
        Composer $composer3 = $composer.startRestartGroup(-1371534562);
        ComposerKt.sourceInformation($composer3, "C(SearchScreen)N(onBackClick,onItemClick,tokenRepository,modifier)43@1645L7,44@1700L389,44@1690L399,53@2128L16,54@2192L16,55@2231L31,58@2300L29,58@2288L41,66@2423L11,67@2452L11982,64@2341L12093:SearchScreen.kt#ogsx9x");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onItemClick) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(tokenRepository) ? 256 : 128;
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
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            Modifier modifier4 = i2 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1371534562, $dirty2, -1, "com.yhchat.canarys.ui.search.SearchScreen (SearchScreen.kt:42)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 510255331, "CC(remember):SearchScreen.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(tokenRepository) | $composer3.changedInstance(context);
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SearchScreenKt.SearchScreen$lambda$0$0(tokenRepository, context, (CreationExtras) obj2);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 419377738, "CC(viewModel)P(2,1)127@5933L7,133@6121L328:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer3, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SearchViewModel.class);
            InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
            initializerViewModelFactoryBuilder.addInitializer(Reflection.getOrCreateKotlinClass(SearchViewModel.class), function1);
            ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) orCreateKotlinClass, current, (String) null, initializerViewModelFactoryBuilder.build(), current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, $composer3, ((0 << 3) & 112) | ((0 << 3) & 896), 0);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            SearchViewModel viewModel3 = (SearchViewModel) viewModel2;
            State uiState$delegate2 = SnapshotStateKt.collectAsState(viewModel3.getUiState(), null, $composer3, 0, 1);
            final State searchResult$delegate = SnapshotStateKt.collectAsState(viewModel3.getSearchResult(), null, $composer3, 0, 1);
            ComposerKt.sourceInformationMarkerStart($composer3, 510271965, "CC(remember):SearchScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                viewModel = viewModel3;
                uiState$delegate = uiState$delegate2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            } else {
                viewModel = viewModel3;
                uiState$delegate = uiState$delegate2;
            }
            final MutableState searchText$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 510274171, "CC(remember):SearchScreen.kt#9igjgp");
            boolean z = ($dirty2 & 14) == 4;
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchScreenKt.SearchScreen$lambda$6$0(onBackClick);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            BackHandlerKt.BackHandler(false, (Function0) objRememberedValue3, $composer3, 0, 1);
            final SearchViewModel viewModel4 = viewModel;
            final State uiState$delegate3 = uiState$delegate;
            Modifier modifier5 = modifier4;
            $composer2 = $composer3;
            SurfaceKt.m3209SurfaceT9BRK9s(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getBackground(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1887052125, true, new Function2() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return SearchScreenKt.SearchScreen$lambda$7(viewModel4, searchText$delegate, onBackClick, uiState$delegate3, searchResult$delegate, onItemClick, context, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer2, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return SearchScreenKt.SearchScreen$lambda$8(onBackClick, onItemClick, tokenRepository, modifier3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    public static final SearchViewModel SearchScreen$lambda$0$0(TokenRepository $tokenRepository, Context $context, CreationExtras viewModel) {
        FriendRepository friendRepository;
        Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
        ApiService apiService = RepositoryFactory.INSTANCE.getApiService();
        ConversationRepository conversationRepository = null;
        try {
            friendRepository = RepositoryFactory.INSTANCE.getFriendRepository($context);
        } catch (Exception e) {
            friendRepository = null;
        }
        try {
            conversationRepository = RepositoryFactory.INSTANCE.getConversationRepository($context);
        } catch (Exception e2) {
        }
        return new SearchViewModel(apiService, $tokenRepository, friendRepository, conversationRepository);
    }

    private static final SearchUiState SearchScreen$lambda$1(State<SearchUiState> state) {
        return (SearchUiState) state.getValue();
    }

    private static final SearchData SearchScreen$lambda$2(State<SearchData> state) {
        return (SearchData) state.getValue();
    }

    private static final String SearchScreen$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit SearchScreen$lambda$6$0(Function0 $onBackClick) {
        $onBackClick.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7(final SearchViewModel $viewModel, final MutableState $searchText$delegate, final Function0 $onBackClick, State $uiState$delegate, State $searchResult$delegate, final Function3 $onItemClick, final Context $context, Composer $composer, int $changed) {
        Function0 function0;
        Unit unit;
        Function0 function02;
        Function0 function03;
        Composer composer;
        Function0 function04;
        int i;
        ComposerKt.sourceInformation($composer, "C68@2462L11966:SearchScreen.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1887052125, $changed, -1, "com.yhchat.canarys.ui.search.SearchScreen.<anonymous> (SearchScreen.kt:68)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((6 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i4 = ((6 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -998293327, "C73@2584L1445,106@4060L246,114@4330L264,72@2553L2051:SearchScreen.kt#ogsx9x");
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-465460011, true, new Function2() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchScreenKt.SearchScreen$lambda$7$0$0($viewModel, $searchText$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(1336675859, true, new Function2() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SearchScreenKt.SearchScreen$lambda$7$0$1($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(256667658, true, new Function3() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SearchScreenKt.SearchScreen$lambda$7$0$2($viewModel, $searchText$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3462, 242);
            final String error = SearchScreen$lambda$1($uiState$delegate).getError();
            if (error == null) {
                $composer.startReplaceGroup(-996570690);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-996570689);
                ComposerKt.sourceInformation($composer, "*130@4867L11,130@4825L69,131@4909L216,126@4672L453");
                CardKt.Card(PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16)), null, CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getErrorContainer(), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-1036166935, true, new Function3() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SearchScreenKt.SearchScreen$lambda$7$0$3$0(error, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer, 54), $composer, 196614, 26);
                Unit unit2 = Unit.INSTANCE;
                $composer.endReplaceGroup();
                Unit unit3 = Unit.INSTANCE;
            }
            if (SearchScreen$lambda$1($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(-996044836);
                ComposerKt.sourceInformation($composer, "142@5198L181");
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default2);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function04 = constructor2;
                    $composer.createNode(function04);
                } else {
                    function04 = constructor2;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting()) {
                    i = iHashCode2;
                } else {
                    i = iHashCode2;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(i))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = (i5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i7 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1791127502, "C146@5338L27:SearchScreen.kt#ogsx9x");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endReplaceGroup();
                }
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(i));
                composerM4376constructorimpl2.apply(Integer.valueOf(i), setCompositeKeyHash2);
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i62 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i72 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1791127502, "C146@5338L27:SearchScreen.kt#ogsx9x");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(null, 0L, 0.0f, 0L, 0, $composer, 0, 31);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(-995549022);
                ComposerKt.sourceInformation($composer, "");
                final SearchData searchDataSearchScreen$lambda$2 = SearchScreen$lambda$2($searchResult$delegate);
                if (searchDataSearchScreen$lambda$2 == null) {
                    $composer.startReplaceGroup(-995566879);
                    $composer.endReplaceGroup();
                    unit = null;
                } else {
                    $composer.startReplaceGroup(-995566878);
                    ComposerKt.sourceInformation($composer, "*153@5608L7776,150@5455L7929");
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    PaddingValues paddingValuesM1045PaddingValuesYgX7TsA$default = PaddingKt.m1045PaddingValuesYgX7TsA$default(0.0f, C1834Dp.m7806constructorimpl(8), 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer, 874229284, "CC(remember):SearchScreen.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance(searchDataSearchScreen$lambda$2) | $composer.changed($onItemClick) | $composer.changedInstance($context);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function1() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SearchScreenKt.SearchScreen$lambda$7$0$5$0$0(searchDataSearchScreen$lambda$2, $onItemClick, $context, (LazyListScope) obj2);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    LazyDslKt.LazyColumn(modifierFillMaxSize$default3, null, paddingValuesM1045PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue, $composer, 390, 506);
                    Unit unit4 = Unit.INSTANCE;
                    $composer.endReplaceGroup();
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    $composer.startReplaceGroup(-987867749);
                    ComposerKt.sourceInformation($composer, "*272@13448L946");
                    Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxSize$default4);
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
                    Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                        composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                        composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i9 = (i8 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    int i10 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1504221312, "C276@13604L772:SearchScreen.kt#ogsx9x");
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
                    ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, centerHorizontally, $composer, ((432 >> 3) & 14) | ((432 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifier);
                    Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                    int i11 = ((((432 << 3) & 112) << 6) & 896) | 6;
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
                    Updater.m4383setimpl(composerM4376constructorimpl4, measurePolicyColumnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!composerM4376constructorimpl4.getInserting()) {
                        composer = $composer;
                        if (!Intrinsics.areEqual(composerM4376constructorimpl4.rememberedValue(), Integer.valueOf(iHashCode4))) {
                        }
                        Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                        int i12 = (i11 >> 6) & 14;
                        Composer composer2 = composer;
                        ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                        int i13 = ((432 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart(composer2, -730760102, "C284@14045L11,280@13810L289,288@14228L10,289@14300L11,286@14124L230:SearchScreen.kt#ogsx9x");
                        IconKt.m2816Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(64)), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), composer2, 432, 0);
                        TextKt.m3359Text4IGK_g("\u8f93\u5165\u5173\u952e\u8bcd\u5f00\u59cb\u641c\u7d22", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyLarge(), composer2, 6, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        ComposerKt.sourceInformationMarkerEnd(composer2);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        Unit unit5 = Unit.INSTANCE;
                        $composer.endReplaceGroup();
                    } else {
                        composer = $composer;
                    }
                    composerM4376constructorimpl4.updateRememberedValue(Integer.valueOf(iHashCode4));
                    composerM4376constructorimpl4.apply(Integer.valueOf(iHashCode4), setCompositeKeyHash4);
                    Updater.m4383setimpl(composerM4376constructorimpl4, modifierMaterializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                    int i122 = (i11 >> 6) & 14;
                    Composer composer22 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer22, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    int i132 = ((432 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer22, -730760102, "C284@14045L11,280@13810L289,288@14228L10,289@14300L11,286@14124L230:SearchScreen.kt#ogsx9x");
                    IconKt.m2816Iconww6aTOc(SearchKt.getSearch(Icons.INSTANCE.getDefault()), (String) null, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(64)), MaterialTheme.INSTANCE.getColorScheme(composer22, MaterialTheme.$stable).getOnSurfaceVariant(), composer22, 432, 0);
                    TextKt.m3359Text4IGK_g("\u8f93\u5165\u5173\u952e\u8bcd\u5f00\u59cb\u641c\u7d22", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer22, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer22, MaterialTheme.$stable).getBodyLarge(), composer22, 6, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer22);
                    ComposerKt.sourceInformationMarkerEnd(composer22);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Unit unit52 = Unit.INSTANCE;
                    $composer.endReplaceGroup();
                } else {
                    $composer.startReplaceGroup(660622176);
                    $composer.endReplaceGroup();
                }
                $composer.endReplaceGroup();
            }
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

    public static final Unit SearchScreen$lambda$7$0$0(final SearchViewModel $viewModel, final MutableState $searchText$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C82@3047L84,99@3774L223,76@2697L19,86@3190L527,74@2602L1413:SearchScreen.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-465460011, $changed, -1, "com.yhchat.canarys.ui.search.SearchScreen.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:74)");
            }
            String strSearchScreen$lambda$4 = SearchScreen$lambda$4($searchText$delegate);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, ImeAction.INSTANCE.m7428getSearcheUduSuo(), (PlatformImeOptions) null, (Boolean) null, (LocaleList) null, 119, (DefaultConstructorMarker) null);
            ComposerKt.sourceInformationMarkerStart($composer, -630456887, "CC(remember):SearchScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SearchScreenKt.SearchScreen$lambda$7$0$0$0$0($viewModel, $searchText$delegate, (KeyboardActionScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            KeyboardActions keyboardActions = new KeyboardActions(null, null, null, null, (Function1) objRememberedValue, null, 47, null);
            TextFieldColors textFieldColorsM3009colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m3009colors0hiis_0(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, null, Color.INSTANCE.m5092getTransparent0d7_KjU(), Color.INSTANCE.m5092getTransparent0d7_KjU(), Color.INSTANCE.m5092getTransparent0d7_KjU(), 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer, 0, 3504, 0, 0, 3072, 2147469311, 4095);
            ComposerKt.sourceInformationMarkerStart($composer, -630468152, "CC(remember):SearchScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return SearchScreenKt.SearchScreen$lambda$7$0$0$1$0($searchText$delegate, (String) obj3);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strSearchScreen$lambda$4, (Function1<? super String, Unit>) objRememberedValue2, modifierFillMaxWidth$default, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SearchScreenKt.INSTANCE.m11588getLambda$1578078596$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(873252990, true, new Function2() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return SearchScreenKt.SearchScreen$lambda$7$0$0$2($viewModel, $searchText$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, keyboardOptions, keyboardActions, true, 0, 0, (MutableInteractionSource) null, (Shape) null, textFieldColorsM3009colors0hiis_0, $composer, 817889712, 12779520, 0, 3964280);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7$0$0$1$0(MutableState $searchText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $searchText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7$0$0$0$0(SearchViewModel $viewModel, MutableState $searchText$delegate, KeyboardActionScope KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        $viewModel.search(SearchScreen$lambda$4($searchText$delegate));
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7$0$0$2(final SearchViewModel $viewModel, final MutableState $searchText$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:SearchScreen.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(873252990, $changed, -1, "com.yhchat.canarys.ui.search.SearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:87)");
            }
            if (SearchScreen$lambda$4($searchText$delegate).length() > 0) {
                $composer.startReplaceGroup(462981730);
                ComposerKt.sourceInformation($composer, "88@3296L135,88@3275L394");
                ComposerKt.sourceInformationMarkerStart($composer, 1677504197, "CC(remember):SearchScreen.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SearchScreenKt.SearchScreen$lambda$7$0$0$2$0$0($viewModel, $searchText$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.getLambda$1947574902$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            } else {
                $composer.startReplaceGroup(459747748);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7$0$0$2$0$0(SearchViewModel $viewModel, MutableState $searchText$delegate) {
        $searchText$delegate.setValue("");
        $viewModel.clearSearch();
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7$0$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C107@4078L214:SearchScreen.kt#ogsx9x");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1336675859, $changed, -1, "com.yhchat.canarys.ui.search.SearchScreen.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:107)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.m11589getLambda$541886954$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7$0$2(final SearchViewModel $viewModel, final MutableState $searchText$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C115@4369L32,115@4348L232:SearchScreen.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(256667658, $changed, -1, "com.yhchat.canarys.ui.search.SearchScreen.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:115)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1844484746, "CC(remember):SearchScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SearchScreenKt.SearchScreen$lambda$7$0$2$0$0($viewModel, $searchText$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SearchScreenKt.INSTANCE.getLambda$1240882023$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7$0$2$0$0(SearchViewModel $viewModel, MutableState $searchText$delegate) {
        $viewModel.search(SearchScreen$lambda$4($searchText$delegate));
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7$0$3$0(String $error, ColumnScope Card, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C134@5009L11,132@4927L184:SearchScreen.kt#ogsx9x");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1036166935, $changed, -1, "com.yhchat.canarys.ui.search.SearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:132)");
            }
            TextKt.m3359Text4IGK_g($error, PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnErrorContainer(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 48, 0, 131064);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7$0$5$0$0(SearchData $result, final Function3 $onItemClick, final Context $context, LazyListScope $this$LazyColumn) {
        Iterable iterable;
        LazyListScope LazyColumn = $this$LazyColumn;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        Iterable<SearchCategory> list = $result.getList();
        for (final SearchCategory searchCategory : list) {
            final List list2 = searchCategory.getList();
            if (list2 == null) {
                iterable = list;
            } else if (list2.isEmpty()) {
                iterable = list;
            } else {
                LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-434682518, true, new Function3() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return SearchScreenKt.SearchScreen$lambda$7$0$5$0$0$0$0$0(searchCategory, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }), 3, null);
                final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$SearchScreen$lambda$7$0$5$0$0$0$0$$inlined$items$default$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                        return invoke((SearchItem) p1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(SearchItem searchItem) {
                        return null;
                    }
                };
                iterable = list;
                $this$LazyColumn.items(list2.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$SearchScreen$lambda$7$0$5$0$0$0$0$$inlined$items$default$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(num.intValue());
                    }

                    public final Object invoke(int index) {
                        return function1.invoke(list2.get(index));
                    }
                }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$SearchScreen$lambda$7$0$5$0$0$0$0$$inlined$items$default$4
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
                        final SearchItem searchItem = (SearchItem) list2.get(it);
                        $composer.startReplaceGroup(1820461707);
                        ComposerKt.sourceInformation($composer, "CN(searchItem)*172@6708L442,180@7217L38,181@7294L5960,168@6437L6817:SearchScreen.kt#ogsx9x");
                        Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(4));
                        ComposerKt.sourceInformationMarkerStart($composer, 1028558193, "CC(remember):SearchScreen.kt#9igjgp");
                        boolean zChanged = $composer.changed($onItemClick) | ((((i & 112) ^ 48) > 32 && $composer.changed(searchItem)) || (i & 48) == 32);
                        Object objRememberedValue = $composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            final Function3 function3 = $onItemClick;
                            Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$SearchScreen$2$1$6$1$1$1$1$2$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function3.invoke(searchItem.getFriendId(), Integer.valueOf(searchItem.getFriendType()), searchItem.getNickname());
                                }
                            };
                            $composer.updateRememberedValue(obj);
                            objRememberedValue = obj;
                        }
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(modifierM1051paddingVpY3zN4, false, null, null, null, (Function0) objRememberedValue, 15, null);
                        CardElevation cardElevationM2496cardElevationaqJV_2Y = CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(1), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer, (CardDefaults.$stable << 18) | 6, 62);
                        final Context context = $context;
                        CardKt.Card(modifierM516clickableoSLSa3U$default, null, null, cardElevationM2496cardElevationaqJV_2Y, null, ComposableLambdaKt.rememberComposableLambda(-105853339, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.search.SearchScreenKt$SearchScreen$2$1$6$1$1$1$1$2$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
                                invoke(columnScope, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:56:0x03e9  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final void invoke(androidx.compose.foundation.layout.ColumnScope r78, androidx.compose.runtime.Composer r79, int r80) {
                                /*
                                    Method dump skipped, instructions count: 1356
                                    To view this dump change 'Code comments level' option to 'DEBUG'
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.SearchScreenKt$SearchScreen$2$1$6$1$1$1$1$2$2.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
                            }
                        }, $composer, 54), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 22);
                        $composer.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            LazyColumn = $this$LazyColumn;
            list = iterable;
        }
        return Unit.INSTANCE;
    }

    public static final Unit SearchScreen$lambda$7$0$5$0$0$0$0$0(SearchCategory $category, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C161@6032L10,159@5901L367:SearchScreen.kt#ogsx9x");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-434682518, $changed, -1, "com.yhchat.canarys.ui.search.SearchScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SearchScreen.kt:159)");
            }
            TextKt.m3359Text4IGK_g($category.getTitle(), PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(8)), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 196656, 0, 65500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }
}
