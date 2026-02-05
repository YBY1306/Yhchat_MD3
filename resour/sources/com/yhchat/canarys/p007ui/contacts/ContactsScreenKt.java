package com.yhchat.canarys.p007ui.contacts;

import android.content.Context;
import android.content.Intent;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
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
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.CheckCircleKt;
import androidx.compose.material.icons.filled.ErrorKt;
import androidx.compose.material.icons.filled.ExpandMoreKt;
import androidx.compose.material.icons.filled.HourglassEmptyKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.RotateKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.vector.ImageVector;
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
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.hilt.navigation.compose.HiltViewModelKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.p007ui.bot.BotManagementActivity;
import com.yhchat.canarys.p007ui.chat.ChatActivity;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.p007ui.search.SearchActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactsScreen.kt */
@Metadata(m168d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007\u00a2\u0006\u0002\u0010\u0006\u001a=\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010\u0010\u001a-\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010\u0015\u001a-\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010\u0019\u001aG\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0003\u00a2\u0006\u0002\u0010\u001f\u001a\u001d\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\tH\u0003\u00a2\u0006\u0002\u0010#\u00a8\u0006$\u00b2\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002\u00b2\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, m169d2 = {"ContactsScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/yhchat/canarys/ui/contacts/ContactsViewModel;", "(Landroidx/compose/ui/Modifier;Lcom/yhchat/canarys/ui/contacts/ContactsViewModel;Landroidx/compose/runtime/Composer;II)V", "ContactGroupHeader", "title", "", "count", "", "isExpanded", "", "onToggle", "Lkotlin/Function0;", "(Ljava/lang/String;IZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ContactItem", "contact", "Lcom/yhchat/canarys/ui/contacts/Contact;", "onClick", "(Lcom/yhchat/canarys/ui/contacts/Contact;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FriendRequestRow", "item", "Lcom/yhchat/canarys/ui/contacts/FriendRequestItem;", "(Lcom/yhchat/canarys/ui/contacts/FriendRequestItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FriendRequestDetailBottomSheet", "processing", "onDismiss", "onAgree", "onReject", "(Lcom/yhchat/canarys/ui/contacts/FriendRequestItem;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InfoLine", "label", "value", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/contacts/ContactsUiState;", "rotation", ""}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class ContactsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactGroupHeader$lambda$2(String str, int i, boolean z, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        ContactGroupHeader(str, i, z, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactItem$lambda$1(Contact contact, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ContactItem(contact, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$6(Modifier modifier, ContactsViewModel contactsViewModel, int i, int i2, Composer composer, int i3) {
        ContactsScreen(modifier, contactsViewModel, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FriendRequestDetailBottomSheet$lambda$1(FriendRequestItem friendRequestItem, boolean z, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        FriendRequestDetailBottomSheet(friendRequestItem, z, function0, function02, function03, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FriendRequestRow$lambda$1(FriendRequestItem friendRequestItem, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FriendRequestRow(friendRequestItem, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoLine$lambda$1(String str, String str2, int i, Composer composer, int i2) {
        InfoLine(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ContactsScreen(Modifier modifier, ContactsViewModel viewModel, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        ContactsViewModel contactsViewModel;
        final ContactsViewModel viewModel2;
        Modifier.Companion modifier3;
        final Modifier modifier4;
        final ContactsViewModel viewModel3;
        CreationExtras defaultViewModelCreationExtras;
        Composer $composer2 = $composer.startRestartGroup(1127660668);
        ComposerKt.sourceInformation($composer2, "C(ContactsScreen)N(modifier,viewModel)49@2063L7,50@2108L16,51@2145L23,55@2206L562,72@2775L10308,54@2179L10904:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty |= 6;
            modifier2 = modifier;
        } else if (($changed & 6) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 4 : 2;
        } else {
            modifier2 = modifier;
        }
        if (($changed & 48) == 0) {
            if ((i & 2) == 0) {
                contactsViewModel = viewModel;
                int i3 = $composer2.changedInstance(contactsViewModel) ? 32 : 16;
                $dirty |= i3;
            } else {
                contactsViewModel = viewModel;
            }
            $dirty |= i3;
        } else {
            contactsViewModel = viewModel;
        }
        if (!$composer2.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            viewModel2 = contactsViewModel;
        } else {
            $composer2.startDefaults();
            ComposerKt.sourceInformation($composer2, "47@2012L15");
            if (($changed & 1) != 0 && !$composer2.getDefaultsInvalid()) {
                $composer2.skipToGroupEnd();
                if ((i & 2) != 0) {
                    $dirty &= -113;
                }
                modifier4 = modifier2;
                viewModel3 = contactsViewModel;
            } else {
                if (i2 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i & 2) == 0) {
                    modifier4 = modifier3;
                    viewModel3 = contactsViewModel;
                } else {
                    $composer2.startReplaceableGroup(1890788296);
                    ComposerKt.sourceInformation($composer2, "CC(hiltViewModel)P(1)*45@1969L7,50@2112L47,51@2171L54:HiltViewModel.kt#9mcars");
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer2, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    ViewModelProvider.Factory factoryCreateHiltViewModelFactory = HiltViewModelKt.createHiltViewModelFactory(current, $composer2, 0 & 14);
                    int i4 = (0 & 14) | (0 & 112);
                    $composer2.startReplaceableGroup(1729797275);
                    ComposerKt.sourceInformation($composer2, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
                    if (current instanceof HasDefaultViewModelProviderFactory) {
                        defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                    }
                    ViewModel viewModel4 = ViewModelKt.viewModel((Class<ViewModel>) ContactsViewModel.class, current, (String) null, factoryCreateHiltViewModelFactory, defaultViewModelCreationExtras, $composer2, ((i4 << 3) & 896) | 36936, 0);
                    $composer2.endReplaceableGroup();
                    $composer2.endReplaceableGroup();
                    $dirty &= -113;
                    modifier4 = modifier3;
                    viewModel3 = (ContactsViewModel) viewModel4;
                }
            }
            $composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1127660668, $dirty, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen (ContactsScreen.kt:48)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            final State uiState$delegate = SnapshotStateKt.collectAsState(viewModel3.getUiState(), null, $composer2, 0, 1);
            final LazyListState listState = LazyListStateKt.rememberLazyListState(0, 0, $composer2, 0, 3);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(780432696, true, new Function2() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactsScreenKt.ContactsScreen$lambda$1(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(-1598059123, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ContactsScreenKt.ContactsScreen$lambda$2(modifier4, listState, uiState$delegate, viewModel3, context, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54);
            viewModel2 = viewModel3;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, composableLambdaRememberComposableLambda2, $composer2, 805306416, 509);
            FriendRequestItem selectedFriendRequest = ContactsScreen$lambda$0(uiState$delegate).getSelectedFriendRequest();
            if (selectedFriendRequest != null) {
                $composer2.startReplaceGroup(-1084044029);
                ComposerKt.sourceInformation($composer2, "289@13352L39,290@13415L42,291@13482L43,286@13196L339");
                boolean friendRequestProcessing = ContactsScreen$lambda$0(uiState$delegate).getFriendRequestProcessing();
                ComposerKt.sourceInformationMarkerStart($composer2, 1350509155, "CC(remember):ContactsScreen.kt#9igjgp");
                boolean zChangedInstance = $composer2.changedInstance(viewModel2);
                Object objRememberedValue = $composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContactsScreenKt.ContactsScreen$lambda$3$0(viewModel2);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                Function0 function0 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1350511174, "CC(remember):ContactsScreen.kt#9igjgp");
                boolean zChangedInstance2 = $composer2.changedInstance(viewModel2);
                Object objRememberedValue2 = $composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContactsScreenKt.ContactsScreen$lambda$4$0(viewModel2);
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                Function0 function02 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, 1350513319, "CC(remember):ContactsScreen.kt#9igjgp");
                boolean zChangedInstance3 = $composer2.changedInstance(viewModel2);
                Object objRememberedValue3 = $composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContactsScreenKt.ContactsScreen$lambda$5$0(viewModel2);
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                FriendRequestDetailBottomSheet(selectedFriendRequest, friendRequestProcessing, function0, function02, (Function0) objRememberedValue3, $composer2, 0);
            } else {
                $composer2.startReplaceGroup(-1097136538);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    return ContactsScreenKt.ContactsScreen$lambda$6(modifier2, viewModel2, $changed, i, (Composer) obj4, ((Integer) obj5).intValue());
                }
            });
        }
    }

    private static final ContactsUiState ContactsScreen$lambda$0(State<ContactsUiState> state) {
        return (ContactsUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$1(final Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C58@2298L446,56@2220L538:ContactsScreen.kt#mr31gg");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(780432696, $changed, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen.<anonymous> (ContactsScreen.kt:56)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$ContactsScreenKt.INSTANCE.getLambda$1899112956$app_debug(), null, null, ComposableLambdaKt.rememberComposableLambda(-1651401369, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ContactsScreenKt.ContactsScreen$lambda$1$0($context, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, null, null, $composer, 3078, 246);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$1$0(final Context $context, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C60@2369L158,60@2348L378:ContactsScreen.kt#mr31gg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651401369, $changed, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen.<anonymous>.<anonymous> (ContactsScreen.kt:60)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 2141186341, "CC(remember):ContactsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda31
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactsScreenKt.ContactsScreen$lambda$1$0$0$0($context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$ContactsScreenKt.INSTANCE.m11104getLambda$1547127382$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$1$0$0$0(Context $context) {
        Intent intent = new Intent($context, (Class<?>) SearchActivity.class);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2(Modifier $modifier, LazyListState $listState, final State $uiState$delegate, final ContactsViewModel $viewModel, final Context $context, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues)73@2802L10275:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1598059123, $dirty, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen.<anonymous> (ContactsScreen.kt:73)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default($modifier, 0.0f, 1, null), paddingValues);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierPadding);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((0 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 344127959, "C:ContactsScreen.kt#mr31gg");
            if (ContactsScreen$lambda$0($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(343863032);
                ComposerKt.sourceInformation($composer, "81@3023L116");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0L, 0.0f, 0L, 0, $composer, 0, 30);
                $composer.endReplaceGroup();
            } else if (ContactsScreen$lambda$0($uiState$delegate).getError() != null) {
                $composer.startReplaceGroup(344151549);
                ComposerKt.sourceInformation($composer, "87@3249L690");
                Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.Vertical center = Arrangement.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(center, centerHorizontally, $composer, ((438 >> 3) & 14) | ((438 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function02 = constructor2;
                    $composer.createNode(function02);
                } else {
                    function02 = constructor2;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i6 = ((438 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1643182150, "C96@3598L11,97@3667L10,94@3482L231,99@3738L41,100@3821L28,100@3804L113:ContactsScreen.kt#mr31gg");
                String error = ContactsScreen$lambda$0($uiState$delegate).getError();
                if (error == null) {
                    error = "\u52a0\u8f7d\u5931\u8d25";
                }
                TextKt.m3359Text4IGK_g(error, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 0, 0, 65530);
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, 1438489638, "CC(remember):ContactsScreen.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($viewModel);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ContactsScreenKt.ContactsScreen$lambda$2$0$0$0$0($viewModel);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ButtonKt.Button((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ContactsScreenKt.INSTANCE.m11106getLambda$262586662$app_debug(), $composer, 805306368, 510);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(345188871);
                ComposerKt.sourceInformation($composer, "111@4243L8792,107@4035L9000");
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                PaddingValues paddingValuesM1045PaddingValuesYgX7TsA$default = PaddingKt.m1045PaddingValuesYgX7TsA$default(0.0f, C1834Dp.m7806constructorimpl(8), 1, null);
                ComposerKt.sourceInformationMarkerStart($composer, -1928521077, "CC(remember):ContactsScreen.kt#9igjgp");
                boolean zChanged = $composer.changed($uiState$delegate) | $composer.changedInstance($viewModel) | $composer.changedInstance($context);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0($viewModel, $uiState$delegate, $context, (LazyListScope) obj3);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                LazyDslKt.LazyColumn(modifierFillMaxSize$default, $listState, paddingValuesM1045PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue2, $composer, 390, 504);
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
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$0$0$0(ContactsViewModel $viewModel) {
        $viewModel.loadContacts();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0(final ContactsViewModel $viewModel, final State $uiState$delegate, final Context $context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, "header_requests", null, ComposableLambdaKt.composableLambdaInstance(-925619415, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$0($viewModel, $uiState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, "requests_content", null, ComposableLambdaKt.composableLambdaInstance(-1065774304, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$1($uiState$delegate, $viewModel, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        LazyListScope.item$default(LazyColumn, "header_friends", null, ComposableLambdaKt.composableLambdaInstance(763432033, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$2($viewModel, $uiState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        if (ContactsScreen$lambda$0($uiState$delegate).getFriendsExpanded()) {
            final List friends = ContactsScreen$lambda$0($uiState$delegate).getFriends();
            final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$3((Contact) obj);
                }
            };
            final Function1 function12 = new Function1() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((Contact) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Contact contact) {
                    return null;
                }
            };
            LazyColumn.items(friends.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function1.invoke(friends.get(index));
                }
            }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function12.invoke(friends.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$4
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
                    final Contact contact = (Contact) friends.get(it);
                    $composer.startReplaceGroup(-1642587312);
                    ComposerKt.sourceInformation($composer, "CN(contact)*170@7369L538,168@7255L757:ContactsScreen.kt#mr31gg");
                    ComposerKt.sourceInformationMarkerStart($composer, -1577003912, "CC(remember):ContactsScreen.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(contact)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Context context = $context;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$2$1$2$1$5$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
                                Contact contact2 = contact;
                                intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, contact2.getChatId());
                                intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, 1);
                                intent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, contact2.getName());
                                context.startActivity(intent);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ContactsScreenKt.ContactItem(contact, (Function0) objRememberedValue, LazyItemScope.animateItem$default($this$items, Modifier.INSTANCE, null, null, null, 7, null), $composer, (i >> 3) & 14, 0);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        LazyListScope.item$default(LazyColumn, "header_groups", null, ComposableLambdaKt.composableLambdaInstance(-1702328926, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$5($viewModel, $uiState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        if (ContactsScreen$lambda$0($uiState$delegate).getGroupsExpanded()) {
            final List groups = ContactsScreen$lambda$0($uiState$delegate).getGroups();
            final Function1 function13 = new Function1() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$6((Contact) obj);
                }
            };
            final Function1 function14 = new Function1() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((Contact) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Contact contact) {
                    return null;
                }
            };
            LazyColumn.items(groups.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$6
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function13.invoke(groups.get(index));
                }
            }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$7
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function14.invoke(groups.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$8
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
                    final Contact contact = (Contact) groups.get(it);
                    $composer.startReplaceGroup(-1235516103);
                    ComposerKt.sourceInformation($composer, "CN(contact)*202@9033L538,200@8919L757:ContactsScreen.kt#mr31gg");
                    ComposerKt.sourceInformationMarkerStart($composer, 237242735, "CC(remember):ContactsScreen.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(contact)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Context context = $context;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$2$1$2$1$8$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
                                Contact contact2 = contact;
                                intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, contact2.getChatId());
                                intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, 2);
                                intent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, contact2.getName());
                                context.startActivity(intent);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ContactsScreenKt.ContactItem(contact, (Function0) objRememberedValue, LazyItemScope.animateItem$default($this$items, Modifier.INSTANCE, null, null, null, 7, null), $composer, (i >> 3) & 14, 0);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        LazyListScope.item$default(LazyColumn, "header_bots", null, ComposableLambdaKt.composableLambdaInstance(126877411, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$8($viewModel, $uiState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        if (ContactsScreen$lambda$0($uiState$delegate).getBotsExpanded()) {
            final List bots = ContactsScreen$lambda$0($uiState$delegate).getBots();
            final Function1 function15 = new Function1() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$9((Contact) obj);
                }
            };
            final Function1 function16 = new Function1() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$9
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((Contact) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Contact contact) {
                    return null;
                }
            };
            LazyColumn.items(bots.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$10
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function15.invoke(bots.get(index));
                }
            }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$11
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function16.invoke(bots.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$12
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
                    final Contact contact = (Contact) bots.get(it);
                    $composer.startReplaceGroup(-1894582153);
                    ComposerKt.sourceInformation($composer, "CN(contact)*234@10681L539,232@10567L758:ContactsScreen.kt#mr31gg");
                    ComposerKt.sourceInformationMarkerStart($composer, 1462908529, "CC(remember):ContactsScreen.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(contact)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Context context = $context;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$2$1$2$1$11$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
                                Contact contact2 = contact;
                                intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, contact2.getChatId());
                                intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, 3);
                                intent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, contact2.getName());
                                context.startActivity(intent);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ContactsScreenKt.ContactItem(contact, (Function0) objRememberedValue, LazyItemScope.animateItem$default($this$items, Modifier.INSTANCE, null, null, null, 7, null), $composer, (i >> 3) & 14, 0);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        LazyListScope.item$default(LazyColumn, "header_my_bots", null, ComposableLambdaKt.composableLambdaInstance(1956083748, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$11($viewModel, $uiState$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 2, null);
        if (ContactsScreen$lambda$0($uiState$delegate).getMyBotsExpanded()) {
            final List myBots = ContactsScreen$lambda$0($uiState$delegate).getMyBots();
            final Function1 function17 = new Function1() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$12((Contact) obj);
                }
            };
            final Function1 function18 = new Function1() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$13
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                    return invoke((Contact) p1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Contact contact) {
                    return null;
                }
            };
            LazyColumn.items(myBots.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$14
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function17.invoke(myBots.get(index));
                }
            }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$15
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(num.intValue());
                }

                public final Object invoke(int index) {
                    return function18.invoke(myBots.get(index));
                }
            }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$lambda$2$0$1$0$$inlined$items$default$16
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
                    final Contact contact = (Contact) myBots.get(it);
                    $composer.startReplaceGroup(1741317791);
                    ComposerKt.sourceInformation($composer, "CN(contact)*266@12354L498,264@12240L717:ContactsScreen.kt#mr31gg");
                    ComposerKt.sourceInformationMarkerStart($composer, -1606393015, "CC(remember):ContactsScreen.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance($context) | ((((i & 112) ^ 48) > 32 && $composer.changed(contact)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Context context = $context;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$ContactsScreen$2$1$2$1$14$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                Intent intent = new Intent(context, (Class<?>) BotManagementActivity.class);
                                Contact contact2 = contact;
                                intent.putExtra("botId", contact2.getChatId());
                                intent.putExtra("botName", contact2.getName());
                                context.startActivity(intent);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ContactsScreenKt.ContactItem(contact, (Function0) objRememberedValue, LazyItemScope.animateItem$default($this$items, Modifier.INSTANCE, null, null, null, 7, null), $composer, (i >> 3) & 14, 0);
                    $composer.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$0(final ContactsViewModel $viewModel, State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C118@4625L44,114@4366L400:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(item) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-925619415, $dirty2, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsScreen.kt:114)");
            }
            int friendRequestTotal = ContactsScreen$lambda$0($uiState$delegate).getFriendRequestTotal();
            boolean friendRequestsExpanded = ContactsScreen$lambda$0($uiState$delegate).getFriendRequestsExpanded();
            ComposerKt.sourceInformationMarkerStart($composer, -462018251, "CC(remember):ContactsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$0$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ContactGroupHeader("\u7533\u8bf7/\u9080\u8bf7\u5217\u8868", friendRequestTotal, friendRequestsExpanded, (Function0) objRememberedValue, LazyItemScope.animateItem$default(item, Modifier.INSTANCE, null, null, null, 7, null), $composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$0$0$0(ContactsViewModel $viewModel) {
        $viewModel.toggleFriendRequestsExpanded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$1(final State $uiState$delegate, final ContactsViewModel $viewModel, final LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C128@5121L1278,124@4879L1520:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(item) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1065774304, $dirty2, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsScreen.kt:124)");
            }
            AnimatedVisibilityKt.AnimatedVisibility(ContactsScreen$lambda$0($uiState$delegate).getFriendRequestsExpanded(), (Modifier) null, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1251456520, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda29
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$1$0($uiState$delegate, $viewModel, item, (AnimatedVisibilityScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 200064, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$1$0(State $uiState$delegate, final ContactsViewModel $viewModel, LazyItemScope $this_item, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        Iterator it;
        Function0 function02;
        Composer composer2;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C129@5155L1214:ContactsScreen.kt#mr31gg");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1251456520, $changed, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsScreen.kt:129)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
        ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
        CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
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
        Composer composer3 = $composer;
        ComposerKt.sourceInformationMarkerStart(composer3, -210763606, "C:ContactsScreen.kt#mr31gg");
        if (ContactsScreen$lambda$0($uiState$delegate).getFriendRequestsLoading()) {
            composer3.startReplaceGroup(-210746030);
            ComposerKt.sourceInformation(composer3, "131@5313L466");
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer3, modifierM1050padding3ABfNKs);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer3.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                function02 = constructor2;
                composer3.createNode(function02);
            } else {
                function02 = constructor2;
                composer3.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl(composer3);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!composerM4376constructorimpl2.getInserting()) {
                composer2 = composer3;
                if (!Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i5 = (i4 >> 6) & 14;
                Composer composer4 = composer2;
                ComposerKt.sourceInformationMarkerStart(composer4, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                int i6 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart(composer4, 878456794, "C137@5679L58:ContactsScreen.kt#mr31gg");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, 0.0f, 0L, 0, composer4, 6, 30);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                ComposerKt.sourceInformationMarkerEnd(composer4);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer3.endReplaceGroup();
                composer = composer3;
            } else {
                composer2 = composer3;
            }
            composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
            composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i52 = (i4 >> 6) & 14;
            Composer composer42 = composer2;
            ComposerKt.sourceInformationMarkerStart(composer42, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            int i62 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart(composer42, 878456794, "C137@5679L58:ContactsScreen.kt#mr31gg");
            ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, 0.0f, 0L, 0, composer42, 6, 30);
            ComposerKt.sourceInformationMarkerEnd(composer42);
            ComposerKt.sourceInformationMarkerEnd(composer42);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer3.endReplaceGroup();
            composer = composer3;
        } else {
            composer3.startReplaceGroup(-210199500);
            ComposerKt.sourceInformation(composer3, "*143@6087L39,141@5950L305");
            Iterable friendRequests = ContactsScreen$lambda$0($uiState$delegate).getFriendRequests();
            int i7 = 0;
            Iterator it2 = friendRequests.iterator();
            while (it2.hasNext()) {
                final FriendRequestItem friendRequestItem = (FriendRequestItem) it2.next();
                Iterable iterable = friendRequests;
                int i8 = i7;
                ComposerKt.sourceInformationMarkerStart(composer3, -1262245754, "CC(remember):ContactsScreen.kt#9igjgp");
                boolean zChangedInstance = composer3.changedInstance($viewModel) | composer3.changed(friendRequestItem);
                Composer composer5 = composer3;
                Object objRememberedValue = composer5.rememberedValue();
                if (!zChangedInstance) {
                    it = it2;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    Composer composer6 = composer3;
                    FriendRequestRow(friendRequestItem, (Function0) objRememberedValue, LazyItemScope.animateItem$default($this_item, Modifier.INSTANCE, null, null, null, 7, null), composer6, 0, 0);
                    friendRequests = iterable;
                    i7 = i8;
                    it2 = it;
                    composer3 = composer6;
                } else {
                    it = it2;
                }
                objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$1$0$0$1$0$0($viewModel, friendRequestItem);
                    }
                };
                composer5.updateRememberedValue(objRememberedValue);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                Composer composer62 = composer3;
                FriendRequestRow(friendRequestItem, (Function0) objRememberedValue, LazyItemScope.animateItem$default($this_item, Modifier.INSTANCE, null, null, null, 7, null), composer62, 0, 0);
                friendRequests = iterable;
                i7 = i8;
                it2 = it;
                composer3 = composer62;
            }
            composer = composer3;
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
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$1$0$0$1$0$0(ContactsViewModel $viewModel, FriendRequestItem $item) {
        $viewModel.selectFriendRequest($item);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$2(final ContactsViewModel $viewModel, State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C158@6783L37,154@6542L375:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(item) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(763432033, $dirty2, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsScreen.kt:154)");
            }
            int size = ContactsScreen$lambda$0($uiState$delegate).getFriends().size();
            boolean friendsExpanded = ContactsScreen$lambda$0($uiState$delegate).getFriendsExpanded();
            ComposerKt.sourceInformationMarkerStart($composer, -781215194, "CC(remember):ContactsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$2$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ContactGroupHeader("\u597d\u53cb", size, friendsExpanded, (Function0) objRememberedValue, LazyItemScope.animateItem$default(item, Modifier.INSTANCE, null, null, null, 7, null), $composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$2$0$0(ContactsViewModel $viewModel) {
        $viewModel.toggleFriendsExpanded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ContactsScreen$lambda$2$0$1$0$3(Contact it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "friend_" + it.getChatId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$5(final ContactsViewModel $viewModel, State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C190@8451L36,186@8208L376:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(item) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1702328926, $dirty2, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsScreen.kt:186)");
            }
            int size = ContactsScreen$lambda$0($uiState$delegate).getGroups().size();
            boolean groupsExpanded = ContactsScreen$lambda$0($uiState$delegate).getGroupsExpanded();
            ComposerKt.sourceInformationMarkerStart($composer, 444450662, "CC(remember):ContactsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$5$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ContactGroupHeader("\u6211\u52a0\u5165\u7684\u7fa4\u804a", size, groupsExpanded, (Function0) objRememberedValue, LazyItemScope.animateItem$default(item, Modifier.INSTANCE, null, null, null, 7, null), $composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$5$0$0(ContactsViewModel $viewModel) {
        $viewModel.toggleGroupsExpanded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ContactsScreen$lambda$2$0$1$0$6(Contact it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "group_" + it.getChatId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$8(final ContactsViewModel $viewModel, State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C222@10107L34,218@9871L367:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(item) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(126877411, $dirty2, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsScreen.kt:218)");
            }
            int size = ContactsScreen$lambda$0($uiState$delegate).getBots().size();
            boolean botsExpanded = ContactsScreen$lambda$0($uiState$delegate).getBotsExpanded();
            ComposerKt.sourceInformationMarkerStart($composer, 1670116229, "CC(remember):ContactsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$8$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ContactGroupHeader("\u673a\u5668\u4eba", size, botsExpanded, (Function0) objRememberedValue, LazyItemScope.animateItem$default(item, Modifier.INSTANCE, null, null, null, 7, null), $composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$8$0$0(ContactsViewModel $viewModel) {
        $viewModel.toggleBotsExpanded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ContactsScreen$lambda$2$0$1$0$9(Contact it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "bot_" + it.getChatId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$11(final ContactsViewModel $viewModel, State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C254@11771L36,250@11527L377:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(item) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1956083748, $dirty2, -1, "com.yhchat.canarys.ui.contacts.ContactsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsScreen.kt:250)");
            }
            int size = ContactsScreen$lambda$0($uiState$delegate).getMyBots().size();
            boolean myBotsExpanded = ContactsScreen$lambda$0($uiState$delegate).getMyBotsExpanded();
            ComposerKt.sourceInformationMarkerStart($composer, -1399185016, "CC(remember):ContactsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda26
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ContactsScreenKt.ContactsScreen$lambda$2$0$1$0$11$0$0($viewModel);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ContactGroupHeader("\u6211\u521b\u5efa\u7684\u673a\u5668\u4eba", size, myBotsExpanded, (Function0) objRememberedValue, LazyItemScope.animateItem$default(item, Modifier.INSTANCE, null, null, null, 7, null), $composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$2$0$1$0$11$0$0(ContactsViewModel $viewModel) {
        $viewModel.toggleMyBotsExpanded();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ContactsScreen$lambda$2$0$1$0$12(Contact it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "my_bot_" + it.getChatId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$3$0(ContactsViewModel $viewModel) {
        $viewModel.selectFriendRequest(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$4$0(ContactsViewModel $viewModel) {
        $viewModel.agreeSelectedFriendRequest();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactsScreen$lambda$5$0(ContactsViewModel $viewModel) {
        $viewModel.rejectSelectedFriendRequest();
        return Unit.INSTANCE;
    }

    private static final void ContactGroupHeader(final String title, final int count, final boolean isExpanded, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function0<Unit> function02;
        Modifier modifier2;
        int $dirty;
        final Modifier modifier3;
        Composer $composer2 = $composer.startRestartGroup(1665664058);
        ComposerKt.sourceInformation($composer2, "C(ContactGroupHeader)N(title,count,isExpanded,onToggle,modifier)304@13733L105,313@13983L11,314@14035L1115,309@13844L1306:ContactsScreen.kt#mr31gg");
        int $dirty2 = $changed;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer2.changed(title) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer2.changed(count) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty2 |= $composer2.changed(isExpanded) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            function02 = function0;
            $dirty2 |= $composer2.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty2 |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer2.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if (!$composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $dirty = $dirty2;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1665664058, $dirty2, -1, "com.yhchat.canarys.ui.contacts.ContactGroupHeader (ContactsScreen.kt:303)");
            }
            Modifier modifier4 = modifier2;
            $dirty = $dirty2;
            final State rotation$delegate = AnimateAsStateKt.animateFloatAsState(isExpanded ? 180.0f : 0.0f, null, 0.0f, "rotation", null, $composer2, 3072, 22);
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), false, null, null, null, function02, 15, null);
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceVariant();
            SurfaceKt.m3209SurfaceT9BRK9s(modifierM516clickableoSLSa3U$default, null, Color.m5055copywmQWz5c(surfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(surfaceVariant) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(surfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(surfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(surfaceVariant) : 0.0f), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1609972075, true, new Function2() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactsScreenKt.ContactGroupHeader$lambda$1(isExpanded, title, count, rotation$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 12582912, 122);
            $composer2 = $composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactsScreenKt.ContactGroupHeader$lambda$2(title, count, isExpanded, function0, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float ContactGroupHeader$lambda$0(State<Float> state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContactGroupHeader$lambda$1(boolean $isExpanded, String $title, int $count, State $rotation$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C315@14045L1099:ContactsScreen.kt#mr31gg");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1609972075, $changed, -1, "com.yhchat.canarys.ui.contacts.ContactGroupHeader.<anonymous> (ContactsScreen.kt:315)");
            }
            Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(12));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1051paddingVpY3zN4);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i2 = (i >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1367261527, "C324@14429L11,321@14261L264,328@14551L39,332@14690L10,334@14800L11,330@14616L226,337@14868L39,341@15012L10,342@15073L11,339@14933L201:ContactsScreen.kt#mr31gg");
            IconKt.m2816Iconww6aTOc(ExpandMoreKt.getExpandMore(Icons.INSTANCE.getDefault()), $isExpanded ? "\u6536\u8d77" : "\u5c55\u5f00", RotateKt.rotate(Modifier.INSTANCE, ContactGroupHeader$lambda$0($rotation$delegate)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 0, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextKt.m3359Text4IGK_g($title, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65498);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            TextStyle bodyMedium = MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium();
            long onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant();
            TextKt.m3359Text4IGK_g("(" + $count + ")", (Modifier) null, Color.m5055copywmQWz5c(onSurfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(onSurfaceVariant) : 0.6f, (14 & 2) != 0 ? Color.m5063getRedimpl(onSurfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(onSurfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(onSurfaceVariant) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, bodyMedium, $composer, 0, 0, 65530);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ContactItem(final Contact contact, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function0<Unit> function02;
        Modifier modifier2;
        final Modifier.Companion modifier3;
        Composer $composer2 = $composer.startRestartGroup(-2088197383);
        ComposerKt.sourceInformation($composer2, "C(ContactItem)N(contact,onClick,modifier)357@15323L7,363@15478L11,364@15504L2478,359@15340L2642,434@18093L11,432@17992L152:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(contact) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (!$composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2088197383, $dirty, -1, "com.yhchat.canarys.ui.contacts.ContactItem (ContactsScreen.kt:356)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            SurfaceKt.m3209SurfaceT9BRK9s(ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), false, null, null, null, function02, 15, null), null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(299423252, true, new Function2() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactsScreenKt.ContactItem$lambda$0(context, contact, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 12582912, 122);
            Modifier modifierM1054paddingqDBjuR0$default = PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(76), 0.0f, 0.0f, 0.0f, 14, null);
            long outlineVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant();
            DividerKt.m2738HorizontalDivider9IZ8Weo(modifierM1054paddingqDBjuR0$default, 0.0f, Color.m5055copywmQWz5c(outlineVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(outlineVariant) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(outlineVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(outlineVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(outlineVariant) : 0.0f), $composer2, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactsScreenKt.ContactItem$lambda$1(contact, function0, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x044e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ContactItem$lambda$0(android.content.Context r75, com.yhchat.canarys.p007ui.contacts.Contact r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 1112
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.contacts.ContactsScreenKt.ContactItem$lambda$0(android.content.Context, com.yhchat.canarys.ui.contacts.Contact, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final void FriendRequestRow(final FriendRequestItem item, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final FriendRequestItem friendRequestItem;
        Function0<Unit> function02;
        final Modifier modifier2;
        Modifier.Companion modifier3;
        String resultText;
        Pair pairM176to;
        Composer $composer2 = $composer.startRestartGroup(-154690001);
        ComposerKt.sourceInformation($composer2, "C(FriendRequestRow)N(item,onClick,modifier)464@18950L11,465@18976L2000,460@18812L2164,524@21083L11,522@20982L152:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            friendRequestItem = item;
            $dirty |= $composer2.changed(friendRequestItem) ? 4 : 2;
        } else {
            friendRequestItem = item;
        }
        if (($changed & 48) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 32 : 16;
        } else {
            function02 = function0;
        }
        int i2 = i & 4;
        if (i2 != 0) {
            $dirty |= 384;
            modifier2 = modifier;
        } else if (($changed & 384) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if (!$composer2.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-154690001, $dirty, -1, "com.yhchat.canarys.ui.contacts.FriendRequestRow (ContactsScreen.kt:443)");
            }
            switch (friendRequestItem.getResult()) {
                case 0:
                    resultText = "\u5f85\u5904\u7406";
                    break;
                case 1:
                    resultText = "\u5df2\u901a\u8fc7";
                    break;
                case 2:
                    resultText = "\u5df2\u62d2\u7edd";
                    break;
                case 3:
                    resultText = "\u5df2\u8fc7\u671f";
                    break;
                case 4:
                    resultText = "\u5df2\u89e3\u6563";
                    break;
                default:
                    resultText = "\u672a\u77e5";
                    break;
            }
            switch (friendRequestItem.getResult()) {
                case 0:
                    $composer2.startReplaceGroup(1666775344);
                    ComposerKt.sourceInformation($composer2, "454@18554L11");
                    pairM176to = TuplesKt.m176to(HourglassEmptyKt.getHourglassEmpty(Icons.INSTANCE.getDefault()), Color.m5047boximpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary()));
                    $composer2.endReplaceGroup();
                    break;
                case 1:
                    $composer2.startReplaceGroup(1666777870);
                    ComposerKt.sourceInformation($composer2, "455@18630L11");
                    pairM176to = TuplesKt.m176to(CheckCircleKt.getCheckCircle(Icons.INSTANCE.getDefault()), Color.m5047boximpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getTertiary()));
                    $composer2.endReplaceGroup();
                    break;
                case 2:
                    $composer2.startReplaceGroup(1666780325);
                    ComposerKt.sourceInformation($composer2, "456@18701L11");
                    pairM176to = TuplesKt.m176to(ErrorKt.getError(Icons.INSTANCE.getDefault()), Color.m5047boximpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError()));
                    $composer2.endReplaceGroup();
                    break;
                default:
                    $composer2.startReplaceGroup(1666782608);
                    ComposerKt.sourceInformation($composer2, "457@18772L11");
                    pairM176to = TuplesKt.m176to(ErrorKt.getError(Icons.INSTANCE.getDefault()), Color.m5047boximpl(MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant()));
                    $composer2.endReplaceGroup();
                    break;
            }
            final ImageVector icon = (ImageVector) pairM176to.component1();
            final long iconTint = ((Color) pairM176to.component2()).m5067unboximpl();
            final String resultText2 = resultText;
            SurfaceKt.m3209SurfaceT9BRK9s(ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), false, null, null, null, function02, 15, null), null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-670207564, true, new Function2() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactsScreenKt.FriendRequestRow$lambda$0(friendRequestItem, icon, resultText2, iconTint, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 12582912, 122);
            Modifier modifierM1054paddingqDBjuR0$default = PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(76), 0.0f, 0.0f, 0.0f, 14, null);
            long outlineVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant();
            DividerKt.m2738HorizontalDivider9IZ8Weo(modifierM1054paddingqDBjuR0$default, 0.0f, Color.m5055copywmQWz5c(outlineVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(outlineVariant) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(outlineVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(outlineVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(outlineVariant) : 0.0f), $composer2, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactsScreenKt.FriendRequestRow$lambda$1(item, function0, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit FriendRequestRow$lambda$0(com.yhchat.canarys.p007ui.contacts.FriendRequestItem r82, androidx.compose.p000ui.graphics.vector.ImageVector r83, java.lang.String r84, long r85, androidx.compose.runtime.Composer r87, int r88) {
        /*
            Method dump skipped, instructions count: 1485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.contacts.ContactsScreenKt.FriendRequestRow$lambda$0(com.yhchat.canarys.ui.contacts.FriendRequestItem, androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, long, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final void FriendRequestDetailBottomSheet(final FriendRequestItem item, final boolean processing, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer $composer, final int $changed) {
        final FriendRequestItem friendRequestItem;
        final boolean z;
        final Function0<Unit> function04;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-1956919689);
        ComposerKt.sourceInformation($composer3, "C(FriendRequestDetailBottomSheet)N(item,processing,onDismiss,onAgree,onReject)539@21450L59,541@21543L5278,537@21373L5448:ContactsScreen.kt#mr31gg");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            friendRequestItem = item;
            $dirty |= $composer3.changed(friendRequestItem) ? 4 : 2;
        } else {
            friendRequestItem = item;
        }
        if (($changed & 48) == 0) {
            z = processing;
            $dirty |= $composer3.changed(z) ? 32 : 16;
        } else {
            z = processing;
        }
        if (($changed & 384) == 0) {
            function04 = function0;
            $dirty |= $composer3.changedInstance(function04) ? 256 : 128;
        } else {
            function04 = function0;
        }
        if (($changed & 3072) == 0) {
            function05 = function02;
            $dirty |= $composer3.changedInstance(function05) ? 2048 : 1024;
        } else {
            function05 = function02;
        }
        if (($changed & 24576) == 0) {
            function06 = function03;
            $dirty |= $composer3.changedInstance(function06) ? 16384 : 8192;
        } else {
            function06 = function03;
        }
        if (!$composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1956919689, $dirty, -1, "com.yhchat.canarys.ui.contacts.FriendRequestDetailBottomSheet (ContactsScreen.kt:536)");
            }
            $composer2 = $composer3;
            ModalBottomSheetKt.m2908ModalBottomSheetdYc4hso(function0, null, ModalBottomSheetKt.rememberModalBottomSheetState(true, null, $composer3, 6, 2), 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(369649364, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ContactsScreenKt.FriendRequestDetailBottomSheet$lambda$0(friendRequestItem, function04, function06, z, function05, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty >> 6) & 14) | 805306368, 384, 3578);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ContactsScreenKt.FriendRequestDetailBottomSheet$lambda$1(item, processing, function0, function02, function03, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FriendRequestDetailBottomSheet$lambda$0(final FriendRequestItem $item, Function0 $onDismiss, Function0 $onReject, final boolean $processing, Function0 $onAgree, ColumnScope ModalBottomSheet, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Composer composer;
        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
        ComposerKt.sourceInformation($composer, "C546@21705L11,542@21553L5262:ContactsScreen.kt#mr31gg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(369649364, $changed, -1, "com.yhchat.canarys.ui.contacts.FriendRequestDetailBottomSheet.<anonymous> (ContactsScreen.kt:542)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(BackgroundKt.m475backgroundbw27NRU$default(SizeKt.fillMaxHeight(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.95f), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurface(), null, 2, null), C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1135899430, "C549@21782L470,562@22266L41,567@22510L11,567@22468L89,568@22572L2389,564@22321L2640,616@24975L41:ContactsScreen.kt#mr31gg");
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
            int i4 = ((((438 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function02 = constructor2;
                $composer.createNode(function02);
            } else {
                function02 = constructor2;
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
            int i6 = ((438 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1332565147, "C556@22086L10,554@22000L175,559@22192L46:ContactsScreen.kt#mr31gg");
            TextKt.m3359Text4IGK_g("\u7533\u8bf7/\u9080\u8bf7\u8be6\u60c5", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleLarge(), $composer, 196614, 0, 65502);
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ContactsScreenKt.INSTANCE.m11108getLambda$906258275$app_debug(), $composer, 805306368, 510);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            RoundedCornerShape roundedCornerShapeM1414RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16));
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceVariant();
            CardKt.Card(modifierFillMaxWidth$default2, roundedCornerShapeM1414RoundedCornerShape0680j_4, cardDefaults.m2495cardColorsro_MJ88(Color.m5055copywmQWz5c(surfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(surfaceVariant) : 0.35f, (14 & 2) != 0 ? Color.m5063getRedimpl(surfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(surfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(surfaceVariant) : 0.0f), 0L, 0L, 0L, $composer, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(225239532, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ContactsScreenKt.FriendRequestDetailBottomSheet$lambda$0$0$1($item, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 24);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            if ($item.getResult() == 0) {
                $composer.startReplaceGroup(1139033126);
                ComposerKt.sourceInformation($composer, "619@25070L1438");
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.Horizontal horizontalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(12));
                ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(horizontalM909spacedBy0680j_4, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default3);
                Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = ((((54 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer.startReusableNode();
                if ($composer.getInserting()) {
                    function03 = constructor3;
                    $composer.createNode(function03);
                } else {
                    function03 = constructor3;
                    $composer.useNode();
                }
                Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer);
                Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!composerM4376constructorimpl3.getInserting()) {
                    composer = $composer;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i8 = (i7 >> 6) & 14;
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    int i9 = ((54 >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    ComposerKt.sourceInformationMarkerStart(composer2, -1488038427, "C629@25576L11,629@25526L68,630@25617L302,623@25243L676,644@26188L302,638@25941L549:ContactsScreen.kt#mr31gg");
                    ButtonKt.OutlinedButton($onReject, SizeKt.m1088height3ABfNKs(RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), C1834Dp.m7806constructorimpl(48)), !$processing, null, ButtonDefaults.INSTANCE.m2485outlinedButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getError(), 0L, 0L, composer2, ButtonDefaults.$stable << 12, 13), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1830913869, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return ContactsScreenKt.FriendRequestDetailBottomSheet$lambda$0$0$2$0($processing, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer2, 54), composer2, 805306368, 488);
                    ButtonKt.Button($onAgree, SizeKt.m1088height3ABfNKs(RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), C1834Dp.m7806constructorimpl(48)), !$processing, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1758282767, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            return ContactsScreenKt.FriendRequestDetailBottomSheet$lambda$0$0$2$1($processing, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    }, composer2, 54), composer2, 805306368, 504);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    $composer.endReplaceGroup();
                } else {
                    composer = $composer;
                }
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                int i82 = (i7 >> 6) & 14;
                Composer composer22 = composer;
                ComposerKt.sourceInformationMarkerStart(composer22, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                int i92 = ((54 >> 6) & 112) | 6;
                RowScope rowScope2 = RowScopeInstance.INSTANCE;
                ComposerKt.sourceInformationMarkerStart(composer22, -1488038427, "C629@25576L11,629@25526L68,630@25617L302,623@25243L676,644@26188L302,638@25941L549:ContactsScreen.kt#mr31gg");
                ButtonKt.OutlinedButton($onReject, SizeKt.m1088height3ABfNKs(RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), C1834Dp.m7806constructorimpl(48)), !$processing, null, ButtonDefaults.INSTANCE.m2485outlinedButtonColorsro_MJ88(0L, MaterialTheme.INSTANCE.getColorScheme(composer22, MaterialTheme.$stable).getError(), 0L, 0L, composer22, ButtonDefaults.$stable << 12, 13), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1830913869, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ContactsScreenKt.FriendRequestDetailBottomSheet$lambda$0$0$2$0($processing, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer22, 54), composer22, 805306368, 488);
                ButtonKt.Button($onAgree, SizeKt.m1088height3ABfNKs(RowScope.weight$default(rowScope2, Modifier.INSTANCE, 1.0f, false, 2, null), C1834Dp.m7806constructorimpl(48)), !$processing, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1758282767, true, new Function3() { // from class: com.yhchat.canarys.ui.contacts.ContactsScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ContactsScreenKt.FriendRequestDetailBottomSheet$lambda$0$0$2$1($processing, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, composer22, 54), composer22, 805306368, 504);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                ComposerKt.sourceInformationMarkerEnd(composer22);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1140460335);
                ComposerKt.sourceInformation($composer, "653@26546L245");
                ButtonKt.OutlinedButton($onDismiss, SizeKt.m1088height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(48)), false, null, null, null, null, null, null, ComposableSingletons$ContactsScreenKt.INSTANCE.m11107getLambda$561691960$app_debug(), $composer, 805306416, 508);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit FriendRequestDetailBottomSheet$lambda$0$0$1(com.yhchat.canarys.p007ui.contacts.FriendRequestItem r100, androidx.compose.foundation.layout.ColumnScope r101, androidx.compose.runtime.Composer r102, int r103) {
        /*
            Method dump skipped, instructions count: 1522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.contacts.ContactsScreenKt.FriendRequestDetailBottomSheet$lambda$0$0$1(com.yhchat.canarys.ui.contacts.FriendRequestItem, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FriendRequestDetailBottomSheet$lambda$0$0$2$0(boolean $processing, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C635@25887L10:ContactsScreen.kt#mr31gg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1830913869, $changed, -1, "com.yhchat.canarys.ui.contacts.FriendRequestDetailBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsScreen.kt:631)");
            }
            if ($processing) {
                $composer.startReplaceGroup(-1329539862);
                ComposerKt.sourceInformation($composer, "632@25689L78,633@25796L40");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(18)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(10)), $composer, 6);
            } else {
                $composer.startReplaceGroup(-1355000875);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g("\u62d2\u7edd", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FriendRequestDetailBottomSheet$lambda$0$0$2$1(boolean $processing, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C649@26458L10:ContactsScreen.kt#mr31gg");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1758282767, $changed, -1, "com.yhchat.canarys.ui.contacts.FriendRequestDetailBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsScreen.kt:645)");
            }
            if ($processing) {
                $composer.startReplaceGroup(-419182360);
                ComposerKt.sourceInformation($composer, "646@26260L78,647@26367L40");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(18)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(10)), $composer, 6);
            } else {
                $composer.startReplaceGroup(-445209805);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g("\u901a\u8fc7", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void InfoLine(java.lang.String r76, java.lang.String r77, androidx.compose.runtime.Composer r78, final int r79) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.contacts.ContactsScreenKt.InfoLine(java.lang.String, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }
}
