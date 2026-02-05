package com.yhchat.canarys.p007ui.user;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
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
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.NotificationsKt;
import androidx.compose.material.icons.filled.NotificationsOffKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ListItemDefaults;
import androidx.compose.material3.ListItemKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
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
import androidx.compose.p000ui.unit.TextUnitKt;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.yhchat.canarys.data.model.BoardsByCreateItem;
import com.yhchat.canarys.data.model.MedalInfo;
import com.yhchat.canarys.data.model.ProfileInfo;
import com.yhchat.canarys.data.model.RemarkInfo;
import com.yhchat.canarys.data.model.UserDetail;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.p007ui.background.ChatBackgroundActivity;
import com.yhchat.canarys.p007ui.chat.ChatActivity;
import com.yhchat.canarys.p007ui.community.BoardDetailActivity;
import com.yhchat.canarys.p007ui.components.ReportDialogKt;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: UserDetailActivity.kt */
@Metadata(m168d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u00a2\u0006\u0002\u0010\b\u001a\u0015\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010\u000b\u001a?\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0003\u00a2\u0006\u0002\u0010\u0013\u001a?\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003\u00a2\u0006\u0002\u0010\u001a\u001a3\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0003H\u0007\u00a2\u0006\u0002\u0010#\u001a)\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00032\b\b\u0002\u0010'\u001a\u00020(H\u0007\u00a2\u0006\u0004\b)\u0010*\u00a8\u0006+\u00b2\u0006\n\u0010,\u001a\u00020-X\u008a\u008e\u0002\u00b2\u0006\n\u0010.\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010/\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u00100\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u00101\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u00102\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010\"\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u00103\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u00104\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u00105\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u00106\u001a\u00020\u0018X\u008a\u008e\u0002\u00b2\u0006\n\u00107\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u00108\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u00109\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010:\u001a\u00020\u0011X\u008a\u008e\u0002\u00b2\u0006\n\u0010;\u001a\u00020\u0011X\u008a\u008e\u0002"}, m169d2 = {"UserDetailScreen", "", "userId", "", "userName", "groupId", "onBackClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SheetSectionHeader", "title", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SheetActionItem", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "onClick", "enabled", "", "isDestructive", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "GagMemberDialog", "isLoading", "onConfirm", "Lkotlin/Function1;", "", "onDismiss", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "UserDetailContent", "userDetail", "Lcom/yhchat/canarys/data/model/UserDetail;", "createdBoards", "", "Lcom/yhchat/canarys/data/model/BoardsByCreateItem;", "isLoadingBoards", "token", "(Lcom/yhchat/canarys/data/model/UserDetail;Ljava/util/List;ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "InfoRow", "label", "value", "valueColor", "Landroidx/compose/ui/graphics/Color;", "InfoRow-FNF3uiM", "(Ljava/lang/String;Ljava/lang/String;JLandroidx/compose/runtime/Composer;II)V", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/user/UserDetailUiState;", "showAddFriendDialog", "addFriendRemark", "isAddingFriend", "isInAddressBook", "isCheckingAddressBook", "showMemberMenu", "showGagMenu", "isProcessingMemberAction", "targetUserPermission", "showMoreSheet", "showReportDialog", "showDeleteFriendDialog", "isNoNotify", "isSettingNoNotify"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final class UserDetailActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GagMemberDialog$lambda$4(String str, boolean z, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        GagMemberDialog(str, z, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoRow_FNF3uiM$lambda$1(String str, String str2, long j, int i, int i2, Composer composer, int i3) {
        m11875InfoRowFNF3uiM(str, str2, j, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetActionItem$lambda$3(ImageVector imageVector, String str, Function0 function0, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        SheetActionItem(imageVector, str, function0, z, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetSectionHeader$lambda$0(String str, int i, Composer composer, int i2) {
        SheetSectionHeader(str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailContent$lambda$1(UserDetail userDetail, List list, boolean z, String str, int i, Composer composer, int i2) {
        UserDetailContent(userDetail, list, z, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$51(String str, String str2, String str3, Function0 function0, int i, Composer composer, int i2) {
        UserDetailScreen(str, str2, str3, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UserDetailScreen(final String userId, final String userName, final String groupId, final Function0<Unit> onBackClick, Composer $composer, final int $changed) {
        Composer $composer2;
        MutableState uiState$delegate;
        MutableState isCheckingAddressBook$delegate;
        boolean z;
        MutableState uiState$delegate2;
        String str;
        MutableState token$delegate;
        final MutableState token$delegate2;
        final MutableState targetUserPermission$delegate;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer $composer3 = $composer.startRestartGroup(906326848);
        ComposerKt.sourceInformation($composer3, "C(UserDetailScreen)N(userId,userName,groupId,onBackClick)122@4655L7,123@4682L48,124@4762L34,125@4824L31,126@4882L34,127@4944L34,128@5012L33,129@5063L31,131@5122L34,132@5180L34,133@5251L34,134@5318L30,136@5375L34,137@5438L34,138@5507L34,140@5565L34,141@5629L34,144@5710L3840,144@5687L3863,243@9587L1577,279@11171L16232,242@9560L17843:UserDetailActivity.kt#kdg0fc");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(userId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(userName) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(groupId) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(onBackClick) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(906326848, $dirty2, -1, "com.yhchat.canarys.ui.user.UserDetailScreen (UserDetailActivity.kt:121)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, -898254480, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new UserDetailUiState(false, null, null, null, false, 31, null), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            MutableState uiState$delegate3 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898251934, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                uiState$delegate = uiState$delegate3;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            } else {
                uiState$delegate = uiState$delegate3;
            }
            final MutableState showAddFriendDialog$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898249953, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            final MutableState addFriendRemark$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898248094, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue4 = objMutableStateOf$default4;
            }
            final MutableState isAddingFriend$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898246110, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue5 = objMutableStateOf$default5;
            }
            final MutableState isInAddressBook$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898243935, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default6 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default6);
                objRememberedValue6 = objMutableStateOf$default6;
            }
            MutableState isCheckingAddressBook$delegate2 = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898242305, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                isCheckingAddressBook$delegate = isCheckingAddressBook$delegate2;
                Object objMutableStateOf$default7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default7);
                objRememberedValue7 = objMutableStateOf$default7;
            } else {
                isCheckingAddressBook$delegate = isCheckingAddressBook$delegate2;
            }
            MutableState token$delegate3 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898240414, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue8 = $composer3.rememberedValue();
            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default8 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default8);
                objRememberedValue8 = objMutableStateOf$default8;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898238558, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue9 = $composer3.rememberedValue();
            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default9);
                objRememberedValue9 = objMutableStateOf$default9;
            }
            final MutableState showGagMenu$delegate = (MutableState) objRememberedValue9;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898236286, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue10 = $composer3.rememberedValue();
            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default10 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default10);
                objRememberedValue10 = objMutableStateOf$default10;
            }
            final MutableState isProcessingMemberAction$delegate = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898234146, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue11 = $composer3.rememberedValue();
            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default11 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default11);
                objRememberedValue11 = objMutableStateOf$default11;
            }
            MutableState targetUserPermission$delegate2 = (MutableState) objRememberedValue11;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898232318, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue12 = $composer3.rememberedValue();
            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default12 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default12);
                objRememberedValue12 = objMutableStateOf$default12;
            }
            final MutableState showMoreSheet$delegate = (MutableState) objRememberedValue12;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898230302, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue13 = $composer3.rememberedValue();
            if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default13 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default13);
                objRememberedValue13 = objMutableStateOf$default13;
            }
            final MutableState showReportDialog$delegate = (MutableState) objRememberedValue13;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898228094, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue14 = $composer3.rememberedValue();
            if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default14 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default14);
                objRememberedValue14 = objMutableStateOf$default14;
            }
            final MutableState showDeleteFriendDialog$delegate = (MutableState) objRememberedValue14;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898226238, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue15 = $composer3.rememberedValue();
            if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default15 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default15);
                objRememberedValue15 = objMutableStateOf$default15;
            }
            final MutableState isNoNotify$delegate = (MutableState) objRememberedValue15;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898224190, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue16 = $composer3.rememberedValue();
            if (objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default16 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default16);
                objRememberedValue16 = objMutableStateOf$default16;
            }
            final MutableState isSettingNoNotify$delegate = (MutableState) objRememberedValue16;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -898217792, "CC(remember):UserDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(context) | (($dirty2 & 14) == 4) | (($dirty2 & 896) == 256);
            Object objRememberedValue17 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                z = true;
                uiState$delegate2 = uiState$delegate;
                MutableState isCheckingAddressBook$delegate3 = isCheckingAddressBook$delegate;
                Object userDetailActivityKt$UserDetailScreen$1$1 = new UserDetailActivityKt$UserDetailScreen$1$1(context, userId, groupId, uiState$delegate2, token$delegate3, isNoNotify$delegate, isCheckingAddressBook$delegate3, isInAddressBook$delegate, targetUserPermission$delegate2, null);
                context = context;
                str = userId;
                token$delegate = token$delegate3;
                token$delegate2 = isCheckingAddressBook$delegate3;
                isInAddressBook$delegate = isInAddressBook$delegate;
                targetUserPermission$delegate = targetUserPermission$delegate2;
                Object obj = (Function2) userDetailActivityKt$UserDetailScreen$1$1;
                $composer3.updateRememberedValue(obj);
                objRememberedValue17 = obj;
            } else {
                z = true;
                token$delegate = token$delegate3;
                targetUserPermission$delegate = targetUserPermission$delegate2;
                uiState$delegate2 = uiState$delegate;
                token$delegate2 = isCheckingAddressBook$delegate;
                str = userId;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue17, $composer3, $dirty2 & 14);
            final String str2 = str;
            final MutableState uiState$delegate4 = uiState$delegate2;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(121417468, z, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailScreen$lambda$49(onBackClick, context, str2, userName, token$delegate2, isInAddressBook$delegate, uiState$delegate4, showAddFriendDialog$delegate, showMoreSheet$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54);
            final Context context2 = context;
            final MutableState isCheckingAddressBook$delegate4 = token$delegate2;
            final MutableState isInAddressBook$delegate2 = isInAddressBook$delegate;
            final MutableState isInAddressBook$delegate3 = token$delegate;
            ScaffoldKt.m3074ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(-952667247, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return UserDetailActivityKt.UserDetailScreen$lambda$50(groupId, userName, context2, userId, uiState$delegate4, isInAddressBook$delegate3, showAddFriendDialog$delegate, isAddingFriend$delegate, addFriendRemark$delegate, showGagMenu$delegate, isProcessingMemberAction$delegate, showMoreSheet$delegate, showReportDialog$delegate, isNoNotify$delegate, isSettingNoNotify$delegate, isCheckingAddressBook$delegate4, isInAddressBook$delegate2, showDeleteFriendDialog$delegate, targetUserPermission$delegate, onBackClick, (PaddingValues) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 805306416, 509);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailScreen$lambda$51(userId, userName, groupId, onBackClick, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserDetailUiState UserDetailScreen$lambda$1(MutableState<UserDetailUiState> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean UserDetailScreen$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserDetailScreen$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UserDetailScreen$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean UserDetailScreen$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserDetailScreen$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean UserDetailScreen$lambda$13(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserDetailScreen$lambda$14(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean UserDetailScreen$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserDetailScreen$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String UserDetailScreen$lambda$19(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean UserDetailScreen$lambda$25(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserDetailScreen$lambda$26(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean UserDetailScreen$lambda$28(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserDetailScreen$lambda$29(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int UserDetailScreen$lambda$31(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserDetailScreen$lambda$32(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final boolean UserDetailScreen$lambda$34(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void UserDetailScreen$lambda$35(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean UserDetailScreen$lambda$37(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void UserDetailScreen$lambda$38(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean UserDetailScreen$lambda$40(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void UserDetailScreen$lambda$41(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean UserDetailScreen$lambda$43(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserDetailScreen$lambda$44(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean UserDetailScreen$lambda$46(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UserDetailScreen$lambda$47(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$49(final Function0 $onBackClick, final Context $context, final String $userId, final String $userName, final MutableState $isCheckingAddressBook$delegate, final MutableState $isInAddressBook$delegate, final MutableState $uiState$delegate, final MutableState $showAddFriendDialog$delegate, final MutableState $showMoreSheet$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C246@9687L169,251@9884L1256,244@9601L1553:UserDetailActivity.kt#kdg0fc");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(121417468, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous> (UserDetailActivity.kt:244)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableSingletons$UserDetailActivityKt.INSTANCE.getLambda$907591872$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(1434985922, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserDetailActivityKt.UserDetailScreen$lambda$49$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-401557525, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailScreen$lambda$49$1($context, $userId, $userName, $isCheckingAddressBook$delegate, $isInAddressBook$delegate, $uiState$delegate, $showAddFriendDialog$delegate, $showMoreSheet$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
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
    public static final Unit UserDetailScreen$lambda$49$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C247@9709L129:UserDetailActivity.kt#kdg0fc");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1434985922, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous> (UserDetailActivity.kt:247)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$UserDetailActivityKt.INSTANCE.m11848getLambda$1706906529$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$49$1(final Context $context, final String $userId, final String $userName, MutableState $isCheckingAddressBook$delegate, MutableState $isInAddressBook$delegate, final MutableState $uiState$delegate, final MutableState $showAddFriendDialog$delegate, final MutableState $showMoreSheet$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation(composer, "C273@10979L24,273@10958L164:UserDetailActivity.kt#kdg0fc");
        if (composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-401557525, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous> (UserDetailActivity.kt:252)");
            }
            if (UserDetailScreen$lambda$16($isCheckingAddressBook$delegate)) {
                composer.startReplaceGroup(-1316255399);
                ComposerKt.sourceInformation(composer, "253@9959L78");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                composer = $composer;
                composer.endReplaceGroup();
            } else if (UserDetailScreen$lambda$13($isInAddressBook$delegate)) {
                composer.startReplaceGroup(-1316087317);
                ComposerKt.sourceInformation(composer, "256@10162L440,255@10112L604");
                ComposerKt.sourceInformationMarkerStart(composer, 650284451, "CC(remember):UserDetailActivity.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance($context) | composer.changed($userId) | composer.changed($userName);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda35
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserDetailActivityKt.UserDetailScreen$lambda$49$1$0$0($context, $userId, $userName, $uiState$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$UserDetailActivityKt.INSTANCE.getLambda$467908970$app_debug(), composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1315448841);
                ComposerKt.sourceInformation(composer, "268@10791L30,268@10770L144");
                ComposerKt.sourceInformationMarkerStart(composer, 650304169, "CC(remember):UserDetailActivity.kt#9igjgp");
                Object objRememberedValue2 = $composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda36
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserDetailActivityKt.UserDetailScreen$lambda$49$1$1$0($showAddFriendDialog$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, ComposableSingletons$UserDetailActivityKt.INSTANCE.getLambda$1535771594$app_debug(), composer, 196614, 30);
                composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerStart(composer, 650310179, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue3 = $composer.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserDetailActivityKt.UserDetailScreen$lambda$49$1$2$0($showMoreSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            IconButtonKt.IconButton((Function0) objRememberedValue3, null, false, null, null, ComposableSingletons$UserDetailActivityKt.INSTANCE.m11849getLambda$1764273682$app_debug(), composer, 196614, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$49$1$0$0(Context $context, String $userId, String $userName, MutableState $uiState$delegate) {
        String name;
        Intent intent = new Intent($context, (Class<?>) ChatActivity.class);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_ID, $userId);
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_TYPE, 1);
        UserDetail userDetail = UserDetailScreen$lambda$1($uiState$delegate).getUserDetail();
        if (userDetail == null || (name = userDetail.getName()) == null) {
            name = $userName;
        }
        intent.putExtra(ChatSearchActivity.EXTRA_CHAT_NAME, name);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$49$1$1$0(MutableState $showAddFriendDialog$delegate) {
        UserDetailScreen$lambda$5($showAddFriendDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$49$1$2$0(MutableState $showMoreSheet$delegate) {
        UserDetailScreen$lambda$35($showMoreSheet$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50(final String $groupId, final String $userName, final Context $context, final String $userId, final MutableState $uiState$delegate, MutableState $token$delegate, final MutableState $showAddFriendDialog$delegate, final MutableState $isAddingFriend$delegate, final MutableState $addFriendRemark$delegate, final MutableState $showGagMenu$delegate, final MutableState $isProcessingMemberAction$delegate, MutableState $showMoreSheet$delegate, final MutableState $showReportDialog$delegate, final MutableState $isNoNotify$delegate, final MutableState $isSettingNoNotify$delegate, final MutableState $isCheckingAddressBook$delegate, final MutableState $isInAddressBook$delegate, final MutableState $showDeleteFriendDialog$delegate, final MutableState $targetUserPermission$delegate, final Function0 $onBackClick, PaddingValues paddingValues, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Context context;
        final String str;
        Composer composer;
        final MutableState mutableState;
        String str2;
        Composer composer2;
        Composer composer3;
        String str3;
        String str4;
        int i;
        String name;
        final MutableState mutableState2;
        final MutableState mutableState3;
        String name2;
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        ComposerKt.sourceInformation($composer, "CN(paddingValues)280@11198L1474:UserDetailActivity.kt#kdg0fc");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(paddingValues) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-952667247, $dirty, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous> (UserDetailActivity.kt:280)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
            ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierPadding);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i2 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = (i2 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            int i4 = ((0 >> 6) & 112) | 6;
            BoxScope boxScope = BoxScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 65341336, "C:UserDetailActivity.kt#kdg0fc");
            if (UserDetailScreen$lambda$1($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(65348527);
                ComposerKt.sourceInformation($composer, "287@11396L116");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), 0L, 0.0f, 0L, 0, $composer, 0, 30);
                $composer.endReplaceGroup();
            } else if (UserDetailScreen$lambda$1($uiState$delegate).getError() != null) {
                $composer.startReplaceGroup(65562489);
                ComposerKt.sourceInformation($composer, "292@11594L682");
                Modifier modifierAlign = boxScope.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierAlign);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i5 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                int i6 = (i5 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                int i7 = ((384 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, -91162999, "C298@11910L11,296@11794L159,300@11978L41,301@12061L125,301@12044L210:UserDetailActivity.kt#kdg0fc");
                String error = UserDetailScreen$lambda$1($uiState$delegate).getError();
                if (error == null) {
                    error = "\u52a0\u8f7d\u5931\u8d25";
                }
                TextKt.m3359Text4IGK_g(error, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131066);
                SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
                ComposerKt.sourceInformationMarkerStart($composer, -2932533, "CC(remember):UserDetailActivity.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda41
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                ButtonKt.Button((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$UserDetailActivityKt.INSTANCE.getLambda$1481127710$app_debug(), $composer, 805306374, 510);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endReplaceGroup();
            } else {
                if (UserDetailScreen$lambda$1($uiState$delegate).getUserDetail() != null) {
                    $composer.startReplaceGroup(66312472);
                    ComposerKt.sourceInformation($composer, "310@12363L267");
                    UserDetail userDetail = UserDetailScreen$lambda$1($uiState$delegate).getUserDetail();
                    Intrinsics.checkNotNull(userDetail);
                    UserDetailContent(userDetail, UserDetailScreen$lambda$1($uiState$delegate).getCreatedBoards(), UserDetailScreen$lambda$1($uiState$delegate).isLoadingBoards(), UserDetailScreen$lambda$19($token$delegate), $composer, 0);
                } else {
                    $composer.startReplaceGroup(54059691);
                }
                $composer.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (UserDetailScreen$lambda$4($showAddFriendDialog$delegate)) {
                $composer.startReplaceGroup(235547849);
                ComposerKt.sourceInformation($composer, "322@12777L52,338@13564L1482,367@15080L179,324@12896L634,321@12729L2544");
                ComposerKt.sourceInformationMarkerStart($composer, -685138875, "CC(remember):UserDetailActivity.kt#9igjgp");
                Object objRememberedValue2 = $composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda48
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserDetailActivityKt.UserDetailScreen$lambda$50$1$0($isAddingFriend$delegate, $showAddFriendDialog$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                Function0 function03 = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer);
                str = $userId;
                context = $context;
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function03, ComposableLambdaKt.rememberComposableLambda(-1259836636, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda49
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$2($context, str, $isAddingFriend$delegate, $addFriendRemark$delegate, $showAddFriendDialog$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(1104628834, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$3($showAddFriendDialog$delegate, $isAddingFriend$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer, 54), null, ComposableSingletons$UserDetailActivityKt.INSTANCE.m11853getLambda$825872992$app_debug(), ComposableLambdaKt.rememberComposableLambda(356359743, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$4($userName, $uiState$delegate, $addFriendRemark$delegate, $isAddingFriend$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                }, $composer, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer, 1772598, 0, 16276);
                composer = $composer;
                composer.endReplaceGroup();
            } else {
                context = $context;
                str = $userId;
                composer = $composer;
                composer.startReplaceGroup(222853969);
                composer.endReplaceGroup();
            }
            if (!UserDetailScreen$lambda$25($showGagMenu$delegate) || $groupId == null) {
                mutableState = $isProcessingMemberAction$delegate;
                str2 = "CC(remember):UserDetailActivity.kt#9igjgp";
                composer2 = composer;
                composer2.startReplaceGroup(222853969);
                composer2.endReplaceGroup();
            } else {
                composer.startReplaceGroup(238086873);
                ComposerKt.sourceInformation(composer, "379@15507L538,390@16075L54,376@15343L800");
                UserDetail userDetail2 = UserDetailScreen$lambda$1($uiState$delegate).getUserDetail();
                String str5 = (userDetail2 == null || (name2 = userDetail2.getName()) == null) ? $userName : name2;
                boolean zUserDetailScreen$lambda$28 = UserDetailScreen$lambda$28($isProcessingMemberAction$delegate);
                ComposerKt.sourceInformationMarkerStart(composer, -685051029, "CC(remember):UserDetailActivity.kt#9igjgp");
                boolean zChangedInstance = composer.changedInstance(context) | composer.changed($groupId) | composer.changed(str);
                Object objRememberedValue3 = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    final String str6 = str;
                    final Context context2 = context;
                    str2 = "CC(remember):UserDetailActivity.kt#9igjgp";
                    objRememberedValue3 = new Function1() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda52
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return UserDetailActivityKt.UserDetailScreen$lambda$50$5$0($isProcessingMemberAction$delegate, context2, $groupId, str6, $showGagMenu$delegate, ((Integer) obj3).intValue());
                        }
                    };
                    $composer.updateRememberedValue(objRememberedValue3);
                } else {
                    str2 = "CC(remember):UserDetailActivity.kt#9igjgp";
                }
                Function1 function1 = (Function1) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerStart(composer, -685033337, str2);
                Object objRememberedValue4 = $composer.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    mutableState = $isProcessingMemberAction$delegate;
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda53
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserDetailActivityKt.UserDetailScreen$lambda$50$6$0(mutableState, $showGagMenu$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    objRememberedValue4 = obj3;
                } else {
                    mutableState = $isProcessingMemberAction$delegate;
                }
                Function0 function04 = (Function0) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd(composer);
                Composer composer4 = composer;
                GagMemberDialog(str5, zUserDetailScreen$lambda$28, function1, function04, composer4, 3072);
                composer2 = composer4;
                composer2.endReplaceGroup();
            }
            if (UserDetailScreen$lambda$34($showMoreSheet$delegate)) {
                composer2.startReplaceGroup(239180863);
                ComposerKt.sourceInformation(composer2, "396@16249L25,397@16289L8701,395@16196L8794");
                ComposerKt.sourceInformationMarkerStart(composer2, -685027798, str2);
                Object objRememberedValue5 = $composer.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    mutableState3 = $showMoreSheet$delegate;
                    Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda54
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserDetailActivityKt.UserDetailScreen$lambda$50$7$0(mutableState3);
                        }
                    };
                    $composer.updateRememberedValue(obj4);
                    objRememberedValue5 = obj4;
                } else {
                    mutableState3 = $showMoreSheet$delegate;
                }
                Function0 function05 = (Function0) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd(composer2);
                str3 = str2;
                final MutableState mutableState4 = mutableState3;
                ModalBottomSheetKt.m2908ModalBottomSheetdYc4hso(function05, null, null, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(24014337, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda56
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$8($context, $userId, $userName, $groupId, mutableState4, $showReportDialog$delegate, $uiState$delegate, $isNoNotify$delegate, $isSettingNoNotify$delegate, $isCheckingAddressBook$delegate, $isInAddressBook$delegate, $showDeleteFriendDialog$delegate, $targetUserPermission$delegate, mutableState, $showGagMenu$delegate, (ColumnScope) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                    }
                }, $composer, 54), $composer, 6, 384, 4094);
                composer3 = $composer;
                composer3.endReplaceGroup();
            } else {
                composer3 = composer2;
                str3 = str2;
                composer3.startReplaceGroup(222853969);
                composer3.endReplaceGroup();
            }
            if (UserDetailScreen$lambda$40($showDeleteFriendDialog$delegate)) {
                composer3.startReplaceGroup(247753479);
                ComposerKt.sourceInformation(composer3, "569@25100L34,580@25546L1241,604@26821L155,577@25414L98,568@25052L1938");
                String str7 = str3;
                ComposerKt.sourceInformationMarkerStart(composer3, -684744557, str7);
                Object objRememberedValue6 = $composer.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    mutableState2 = $showDeleteFriendDialog$delegate;
                    Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda57
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserDetailActivityKt.UserDetailScreen$lambda$50$9$0(mutableState2);
                        }
                    };
                    $composer.updateRememberedValue(obj5);
                    objRememberedValue6 = obj5;
                } else {
                    mutableState2 = $showDeleteFriendDialog$delegate;
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                str4 = str7;
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue6, ComposableLambdaKt.rememberComposableLambda(1817352861, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$10($context, $userId, $onBackClick, mutableState2, (Composer) obj6, ((Integer) obj7).intValue());
                    }
                }, composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(2030969947, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$11(mutableState2, (Composer) obj6, ((Integer) obj7).intValue());
                    }
                }, composer3, 54), null, ComposableSingletons$UserDetailActivityKt.INSTANCE.m11851getLambda$2050380263$app_debug(), ComposableLambdaKt.rememberComposableLambda(203911928, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda45
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj6, Object obj7) {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$12($userName, $uiState$delegate, (Composer) obj6, ((Integer) obj7).intValue());
                    }
                }, composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer, 1772598, 0, 16276);
                composer3 = $composer;
                composer3.endReplaceGroup();
                i = 222853969;
            } else {
                str4 = str3;
                i = 222853969;
                composer3.startReplaceGroup(222853969);
                composer3.endReplaceGroup();
            }
            if (UserDetailScreen$lambda$37($showReportDialog$delegate)) {
                composer3.startReplaceGroup(249682020);
                ComposerKt.sourceInformation(composer3, "617@27216L28,618@27274L99,613@27046L341");
                UserDetail userDetail3 = UserDetailScreen$lambda$1($uiState$delegate).getUserDetail();
                String str8 = (userDetail3 == null || (name = userDetail3.getName()) == null) ? $userName : name;
                String str9 = str4;
                ComposerKt.sourceInformationMarkerStart(composer3, -684676851, str9);
                Object objRememberedValue7 = $composer.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    Object obj6 = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda46
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserDetailActivityKt.UserDetailScreen$lambda$50$13$0($showReportDialog$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj6);
                    objRememberedValue7 = obj6;
                }
                Function0 function06 = (Function0) objRememberedValue7;
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerStart(composer3, -684674924, str9);
                boolean zChangedInstance2 = composer3.changedInstance($context);
                Object objRememberedValue8 = $composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    Object obj7 = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda47
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UserDetailActivityKt.UserDetailScreen$lambda$50$14$0($context);
                        }
                    };
                    $composer.updateRememberedValue(obj7);
                    objRememberedValue8 = obj7;
                }
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ReportDialogKt.ReportDialog($userId, 1, str8, function06, (Function0) objRememberedValue8, $composer, 3120, 0);
                composer3 = $composer;
            } else {
                composer3.startReplaceGroup(i);
            }
            composer3.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$1$0(MutableState $isAddingFriend$delegate, MutableState $showAddFriendDialog$delegate) {
        if (!UserDetailScreen$lambda$10($isAddingFriend$delegate)) {
            UserDetailScreen$lambda$5($showAddFriendDialog$delegate, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit UserDetailScreen$lambda$50$4(java.lang.String r56, androidx.compose.runtime.MutableState r57, final androidx.compose.runtime.MutableState r58, androidx.compose.runtime.MutableState r59, androidx.compose.runtime.Composer r60, int r61) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.user.UserDetailActivityKt.UserDetailScreen$lambda$50$4(java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$4$0$0$0(MutableState $addFriendRemark$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $addFriendRemark$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$2(final Context $context, final String $userId, final MutableState $isAddingFriend$delegate, final MutableState $addFriendRemark$delegate, final MutableState $showAddFriendDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C340@13628L1052,359@14754L274,339@13586L1442:UserDetailActivity.kt#kdg0fc");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1259836636, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous> (UserDetailActivity.kt:339)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 477773376, "CC(remember):UserDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($userId);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda61
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$2$0$0($isAddingFriend$delegate, $context, $userId, $addFriendRemark$delegate, $showAddFriendDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, !UserDetailScreen$lambda$10($isAddingFriend$delegate), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1892739788, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda62
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return UserDetailActivityKt.UserDetailScreen$lambda$50$2$1($isAddingFriend$delegate, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer, 54), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$2$0$0(MutableState $isAddingFriend$delegate, Context $context, String $userId, MutableState $addFriendRemark$delegate, MutableState $showAddFriendDialog$delegate) {
        if (UserDetailScreen$lambda$10($isAddingFriend$delegate)) {
            return Unit.INSTANCE;
        }
        UserDetailScreen$lambda$11($isAddingFriend$delegate, true);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new UserDetailActivityKt$UserDetailScreen$3$3$1$1$1($context, $userId, $addFriendRemark$delegate, $isAddingFriend$delegate, $showAddFriendDialog$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$2$1(MutableState $isAddingFriend$delegate, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1892739788, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:360)");
            }
            if (UserDetailScreen$lambda$10($isAddingFriend$delegate)) {
                $composer.startReplaceGroup(2014654664);
                ComposerKt.sourceInformation($composer, "361@14830L78");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(2014791436);
                ComposerKt.sourceInformation($composer, "363@14970L10");
                TextKt.m3359Text4IGK_g("\u6dfb\u52a0", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$3(final MutableState $showAddFriendDialog$delegate, MutableState $isAddingFriend$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C368@15123L31,368@15102L139:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1104628834, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous> (UserDetailActivity.kt:368)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 691388769, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$3$0$0($showAddFriendDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, true ^ UserDetailScreen$lambda$10($isAddingFriend$delegate), null, null, null, null, null, null, ComposableSingletons$UserDetailActivityKt.INSTANCE.getLambda$372020997$app_debug(), $composer, 805306374, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$3$0$0(MutableState $showAddFriendDialog$delegate) {
        UserDetailScreen$lambda$5($showAddFriendDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$5$0(MutableState $isProcessingMemberAction$delegate, Context $context, String $groupId, String $userId, MutableState $showGagMenu$delegate, int gagTime) {
        if (!UserDetailScreen$lambda$28($isProcessingMemberAction$delegate)) {
            UserDetailScreen$lambda$29($isProcessingMemberAction$delegate, true);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new UserDetailActivityKt$UserDetailScreen$3$6$1$1($context, $groupId, $userId, gagTime, $isProcessingMemberAction$delegate, $showGagMenu$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$6$0(MutableState $isProcessingMemberAction$delegate, MutableState $showGagMenu$delegate) {
        if (!UserDetailScreen$lambda$28($isProcessingMemberAction$delegate)) {
            UserDetailScreen$lambda$26($showGagMenu$delegate, false);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$7$0(MutableState $showMoreSheet$delegate) {
        UserDetailScreen$lambda$35($showMoreSheet$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x059f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit UserDetailScreen$lambda$50$8(android.content.Context r60, java.lang.String r61, final java.lang.String r62, java.lang.String r63, final androidx.compose.runtime.MutableState r64, final androidx.compose.runtime.MutableState r65, final androidx.compose.runtime.MutableState r66, final androidx.compose.runtime.MutableState r67, final androidx.compose.runtime.MutableState r68, androidx.compose.runtime.MutableState r69, androidx.compose.runtime.MutableState r70, final androidx.compose.runtime.MutableState r71, androidx.compose.runtime.MutableState r72, final androidx.compose.runtime.MutableState r73, final androidx.compose.runtime.MutableState r74, androidx.compose.foundation.layout.ColumnScope r75, androidx.compose.runtime.Composer r76, int r77) {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.user.UserDetailActivityKt.UserDetailScreen$lambda$50$8(android.content.Context, java.lang.String, java.lang.String, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$0$0(MutableState $showMoreSheet$delegate, MutableState $showReportDialog$delegate) {
        UserDetailScreen$lambda$35($showMoreSheet$delegate, false);
        UserDetailScreen$lambda$38($showReportDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$1$0(Context $context, String $userId, String $userName, MutableState $showMoreSheet$delegate, MutableState $uiState$delegate) {
        String name;
        UserDetailScreen$lambda$35($showMoreSheet$delegate, false);
        ChatBackgroundActivity.Companion companion = ChatBackgroundActivity.INSTANCE;
        UserDetail userDetail = UserDetailScreen$lambda$1($uiState$delegate).getUserDetail();
        if (userDetail == null || (name = userDetail.getName()) == null) {
            name = $userName;
        }
        companion.start($context, $userId, name);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$2(MutableState $isNoNotify$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C430@17556L38:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1723992266, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:430)");
            }
            TextKt.m3359Text4IGK_g(UserDetailScreen$lambda$43($isNoNotify$delegate) ? "\u5df2\u5f00\u542f" : "\u672a\u5f00\u542f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$3(MutableState $isNoNotify$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C436@17938L11,433@17693L303:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2136898473, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:433)");
            }
            IconKt.m2816Iconww6aTOc(UserDetailScreen$lambda$43($isNoNotify$delegate) ? NotificationsOffKt.getNotificationsOff(Icons.INSTANCE.getDefault()) : NotificationsKt.getNotifications(Icons.INSTANCE.getDefault()), (String) null, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$4(final Context $context, final String $userId, final MutableState $isSettingNoNotify$delegate, final MutableState $isNoNotify$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:UserDetailActivity.kt#kdg0fc");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1745162616, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:440)");
            }
            if (UserDetailScreen$lambda$46($isSettingNoNotify$delegate)) {
                $composer.startReplaceGroup(439681804);
                ComposerKt.sourceInformation($composer, "441@18153L78");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(439887427);
                ComposerKt.sourceInformation($composer, "445@18421L1755,443@18301L1975");
                boolean zUserDetailScreen$lambda$43 = UserDetailScreen$lambda$43($isNoNotify$delegate);
                ComposerKt.sourceInformationMarkerStart($composer, -2064015421, "CC(remember):UserDetailActivity.kt#9igjgp");
                boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($userId);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function1() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda40
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return UserDetailActivityKt.UserDetailScreen$lambda$50$8$0$4$0$0($isSettingNoNotify$delegate, $isNoNotify$delegate, $context, $userId, ((Boolean) obj2).booleanValue());
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                SwitchKt.Switch(zUserDetailScreen$lambda$43, (Function1) objRememberedValue, null, null, !UserDetailScreen$lambda$46($isSettingNoNotify$delegate), null, null, $composer, 0, 108);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$4$0$0(MutableState $isSettingNoNotify$delegate, MutableState $isNoNotify$delegate, Context $context, String $userId, boolean checked) {
        if (UserDetailScreen$lambda$46($isSettingNoNotify$delegate)) {
            return Unit.INSTANCE;
        }
        UserDetailScreen$lambda$44($isNoNotify$delegate, checked);
        UserDetailScreen$lambda$47($isSettingNoNotify$delegate, true);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new UserDetailActivityKt$UserDetailScreen$3$9$1$5$1$1$1($context, $userId, checked, $isNoNotify$delegate, $isSettingNoNotify$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$5$0(MutableState $showMoreSheet$delegate, MutableState $showDeleteFriendDialog$delegate) {
        UserDetailScreen$lambda$35($showMoreSheet$delegate, false);
        UserDetailScreen$lambda$41($showDeleteFriendDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$6$0(MutableState $showMoreSheet$delegate, MutableState $isProcessingMemberAction$delegate, Context $context, String $groupId, String $userId) {
        UserDetailScreen$lambda$35($showMoreSheet$delegate, false);
        if (!UserDetailScreen$lambda$28($isProcessingMemberAction$delegate)) {
            UserDetailScreen$lambda$29($isProcessingMemberAction$delegate, true);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new UserDetailActivityKt$UserDetailScreen$3$9$1$7$1$1($context, $groupId, $userId, $isProcessingMemberAction$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$7$0(MutableState $showMoreSheet$delegate, MutableState $isProcessingMemberAction$delegate, Context $context, String $groupId, String $userId) {
        UserDetailScreen$lambda$35($showMoreSheet$delegate, false);
        if (!UserDetailScreen$lambda$28($isProcessingMemberAction$delegate)) {
            UserDetailScreen$lambda$29($isProcessingMemberAction$delegate, true);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new UserDetailActivityKt$UserDetailScreen$3$9$1$8$1$1($context, $groupId, $userId, $isProcessingMemberAction$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$8$0(MutableState $showMoreSheet$delegate, MutableState $isProcessingMemberAction$delegate, Context $context, String $groupId, String $userId) {
        UserDetailScreen$lambda$35($showMoreSheet$delegate, false);
        if (!UserDetailScreen$lambda$28($isProcessingMemberAction$delegate)) {
            UserDetailScreen$lambda$29($isProcessingMemberAction$delegate, true);
            BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new UserDetailActivityKt$UserDetailScreen$3$9$1$9$1$1($context, $groupId, $userId, $isProcessingMemberAction$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$8$0$9$0(MutableState $showMoreSheet$delegate, MutableState $showGagMenu$delegate) {
        UserDetailScreen$lambda$35($showMoreSheet$delegate, false);
        UserDetailScreen$lambda$26($showGagMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$9$0(MutableState $showDeleteFriendDialog$delegate) {
        UserDetailScreen$lambda$41($showDeleteFriendDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$12(String $userName, MutableState $uiState$delegate, Composer $composer, int $changed) {
        String name;
        ComposerKt.sourceInformation($composer, "C578@25436L58:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(203911928, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous> (UserDetailActivity.kt:578)");
            }
            UserDetail userDetail = UserDetailScreen$lambda$1($uiState$delegate).getUserDetail();
            if (userDetail == null || (name = userDetail.getName()) == null) {
                name = $userName;
            }
            TextKt.m3359Text4IGK_g("\u786e\u5b9a\u8981\u5220\u9664\u597d\u53cb\u300c" + name + "\u300d\u5417\uff1f", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$10(final Context $context, final String $userId, final Function0 $onBackClick, final MutableState $showDeleteFriendDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C582@25610L869,598@26602L11,597@26529L116,581@25568L1201:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1817352861, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous> (UserDetailActivity.kt:581)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1575587134, "CC(remember):UserDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($userId) | $composer.changed($onBackClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$10$0$0($context, $showDeleteFriendDialog$delegate, $userId, $onBackClick);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, false, null, ButtonDefaults.INSTANCE.m2475buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, 0L, 0L, $composer, ButtonDefaults.$stable << 12, 14), null, null, null, null, ComposableSingletons$UserDetailActivityKt.INSTANCE.m11852getLambda$812187475$app_debug(), $composer, 805306368, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$10$0$0(Context $context, MutableState $showDeleteFriendDialog$delegate, String $userId, Function0 $onBackClick) {
        UserDetailScreen$lambda$41($showDeleteFriendDialog$delegate, false);
        UserRepository userRepository = RepositoryFactory.INSTANCE.getUserRepository($context);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new UserDetailActivityKt$UserDetailScreen$3$11$1$1$1(userRepository, $userId, $context, $onBackClick, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$11(final MutableState $showDeleteFriendDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C605@26864L34,605@26843L115:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2030969947, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailScreen.<anonymous>.<anonymous> (UserDetailActivity.kt:605)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1846968093, "CC(remember):UserDetailActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserDetailActivityKt.UserDetailScreen$lambda$50$11$0$0($showDeleteFriendDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$UserDetailActivityKt.INSTANCE.m11850getLambda$1925492162$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$11$0$0(MutableState $showDeleteFriendDialog$delegate) {
        UserDetailScreen$lambda$41($showDeleteFriendDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$13$0(MutableState $showReportDialog$delegate) {
        UserDetailScreen$lambda$38($showReportDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailScreen$lambda$50$14$0(Context $context) {
        Toast.makeText($context, "\u4e3e\u62a5\u5df2\u63d0\u4ea4", 0).show();
        return Unit.INSTANCE;
    }

    private static final void SheetSectionHeader(final String title, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(960832791);
        ComposerKt.sourceInformation($composer3, "C(SheetSectionHeader)N(title)630@27529L10,628@27471L228:UserDetailActivity.kt#kdg0fc");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(title) ? 4 : 2;
        }
        if ($composer3.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(960832791, $dirty, -1, "com.yhchat.canarys.ui.user.SheetSectionHeader (UserDetailActivity.kt:627)");
            }
            $composer2 = $composer3;
            TextKt.m3359Text4IGK_g(title, PaddingKt.m1054paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(8), 0.0f, C1834Dp.m7806constructorimpl(4), 5, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer3, MaterialTheme.$stable).getTitleLarge(), $composer2, ($dirty & 14) | 196656, 0, 65500);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UserDetailActivityKt.SheetSectionHeader$lambda$0(title, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SheetActionItem(final ImageVector icon, final String title, final Function0<Unit> function0, boolean enabled, boolean isDestructive, Composer $composer, final int $changed, final int i) {
        boolean z;
        boolean z2;
        final boolean enabled2;
        final boolean isDestructive2;
        long baseTextColor;
        long onSurfaceVariant;
        Composer $composer2 = $composer.startRestartGroup(-1679291938);
        ComposerKt.sourceInformation($composer2, "C(SheetActionItem)N(icon,title,onClick,enabled,isDestructive)646@27954L11,667@28734L13,668@28783L61,652@28297L131,658@28455L179,651@28261L652,674@28958L11,674@28918L87:UserDetailActivity.kt#kdg0fc");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(icon) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(title) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 256 : 128;
        }
        int i2 = i & 8;
        if (i2 != 0) {
            $dirty |= 3072;
            z = enabled;
        } else if (($changed & 3072) == 0) {
            z = enabled;
            $dirty |= $composer2.changed(z) ? 2048 : 1024;
        } else {
            z = enabled;
        }
        int i3 = i & 16;
        if (i3 != 0) {
            $dirty |= 24576;
            z2 = isDestructive;
        } else if (($changed & 24576) == 0) {
            z2 = isDestructive;
            $dirty |= $composer2.changed(z2) ? 16384 : 8192;
        } else {
            z2 = isDestructive;
        }
        if ($composer2.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            boolean enabled3 = i2 != 0 ? true : z;
            boolean isDestructive3 = i3 != 0 ? false : z2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1679291938, $dirty, -1, "com.yhchat.canarys.ui.user.SheetActionItem (UserDetailActivity.kt:645)");
            }
            long containerColor = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurface();
            if (isDestructive3) {
                $composer2.startReplaceGroup(1108161123);
                ComposerKt.sourceInformation($composer2, "647@28031L11");
                baseTextColor = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError();
            } else {
                $composer2.startReplaceGroup(1108162311);
                ComposerKt.sourceInformation($composer2, "647@28068L11");
                baseTextColor = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface();
            }
            $composer2.endReplaceGroup();
            if (isDestructive3) {
                $composer2.startReplaceGroup(1108164835);
                ComposerKt.sourceInformation($composer2, "648@28147L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getError();
            } else {
                $composer2.startReplaceGroup(1108166030);
                ComposerKt.sourceInformation($composer2, "648@28184L11");
                onSurfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant();
            }
            $composer2.endReplaceGroup();
            final long baseIconColor = onSurfaceVariant;
            final float alpha = enabled3 ? 1.0f : 0.45f;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 1108183243, "CC(remember):UserDetailActivity.kt#9igjgp");
            boolean z3 = ($dirty & 896) == 256;
            Object objRememberedValue = $composer2.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda63
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UserDetailActivityKt.SheetActionItem$lambda$0$0(function0);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            boolean enabled4 = enabled3;
            final long baseTextColor2 = baseTextColor;
            boolean isDestructive4 = isDestructive3;
            ListItemKt.m2861ListItemHXNGIdc(ComposableLambdaKt.rememberComposableLambda(750143036, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda64
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UserDetailActivityKt.SheetActionItem$lambda$1(title, baseTextColor2, alpha, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, enabled3, null, null, null, (Function0) objRememberedValue, 14, null), null, null, ComposableLambdaKt.rememberComposableLambda(1603252032, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda65
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UserDetailActivityKt.SheetActionItem$lambda$2(icon, baseIconColor, alpha, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), null, ListItemDefaults.INSTANCE.m2859colorsJ08w3E(containerColor, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, $composer2, ListItemDefaults.$stable << 27, 510), C1834Dp.m7806constructorimpl(0), C1834Dp.m7806constructorimpl(0), $composer2, 113270790, 44);
            $composer2 = $composer2;
            long outlineVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant();
            DividerKt.m2738HorizontalDivider9IZ8Weo(null, 0.0f, Color.m5055copywmQWz5c(outlineVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(outlineVariant) : 0.35f, (14 & 2) != 0 ? Color.m5063getRedimpl(outlineVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(outlineVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(outlineVariant) : 0.0f), $composer2, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isDestructive2 = isDestructive4;
            enabled2 = enabled4;
        } else {
            $composer2.skipToGroupEnd();
            enabled2 = z;
            isDestructive2 = z2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda66
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UserDetailActivityKt.SheetActionItem$lambda$3(icon, title, function0, enabled2, isDestructive2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetActionItem$lambda$1(String $title, long $baseTextColor, float $alpha, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C653@28311L107:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(750143036, $changed, -1, "com.yhchat.canarys.ui.user.SheetActionItem.<anonymous> (UserDetailActivity.kt:653)");
            }
            TextKt.m3359Text4IGK_g($title, (Modifier) null, Color.m5055copywmQWz5c($baseTextColor, (14 & 1) != 0 ? Color.m5059getAlphaimpl($baseTextColor) : $alpha, (14 & 2) != 0 ? Color.m5063getRedimpl($baseTextColor) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl($baseTextColor) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl($baseTextColor) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131066);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetActionItem$lambda$2(ImageVector $icon, long $baseIconColor, float $alpha, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C659@28469L155:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1603252032, $changed, -1, "com.yhchat.canarys.ui.user.SheetActionItem.<anonymous> (UserDetailActivity.kt:659)");
            }
            IconKt.m2816Iconww6aTOc($icon, (String) null, (Modifier) null, Color.m5055copywmQWz5c($baseIconColor, (14 & 1) != 0 ? Color.m5059getAlphaimpl($baseIconColor) : $alpha, (14 & 2) != 0 ? Color.m5063getRedimpl($baseIconColor) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl($baseIconColor) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl($baseIconColor) : 0.0f), $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SheetActionItem$lambda$0$0(Function0 $onClick) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    private static final void GagMemberDialog(final String userName, final boolean isLoading, final Function1<? super Integer, Unit> function1, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Function0<Unit> function02;
        Composer $composer3 = $composer.startRestartGroup(21443298);
        ComposerKt.sourceInformation($composer3, "C(GagMemberDialog)N(userName,isLoading,onConfirm,onDismiss)711@30021L120,695@29435L24,696@29476L491,693@29340L807:UserDetailActivity.kt#kdg0fc");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(userName) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(isLoading) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        if ($composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(21443298, $dirty, -1, "com.yhchat.canarys.ui.user.GagMemberDialog (UserDetailActivity.kt:683)");
            }
            final List gagOptions = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.m176to(0, "\u53d6\u6d88\u7981\u8a00"), TuplesKt.m176to(600, "\u7981\u8a0010\u5206\u949f"), TuplesKt.m176to(3600, "\u7981\u8a001\u5c0f\u65f6"), TuplesKt.m176to(21600, "\u7981\u8a006\u5c0f\u65f6"), TuplesKt.m176to(43200, "\u7981\u8a0012\u5c0f\u65f6"), TuplesKt.m176to(1, "\u6c38\u4e45\u7981\u8a00")});
            if (isLoading) {
                $composer3.startReplaceGroup(-1132457254);
                ComposerKt.sourceInformation($composer3, "694@29413L2");
                ComposerKt.sourceInformationMarkerStart($composer3, -867814812, "CC(remember):UserDetailActivity.kt#9igjgp");
                Object objRememberedValue = $composer3.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                function02 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
            } else {
                $composer3.startReplaceGroup(-867815349);
                $composer3.endReplaceGroup();
                function02 = function0;
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function02, ComposableSingletons$UserDetailActivityKt.INSTANCE.m11846getLambda$1304730726$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-886842024, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UserDetailActivityKt.GagMemberDialog$lambda$1(function0, isLoading, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-468953322, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UserDetailActivityKt.GagMemberDialog$lambda$2(userName, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), ComposableLambdaKt.rememberComposableLambda(1887474677, true, new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda44
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UserDetailActivityKt.GagMemberDialog$lambda$3(gagOptions, isLoading, function1, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda55
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UserDetailActivityKt.GagMemberDialog$lambda$4(userName, isLoading, function1, function0, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GagMemberDialog$lambda$2(String $userName, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C695@29437L20:UserDetailActivity.kt#kdg0fc");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-468953322, $changed, -1, "com.yhchat.canarys.ui.user.GagMemberDialog.<anonymous> (UserDetailActivity.kt:695)");
            }
            TextKt.m3359Text4IGK_g("\u7981\u8a00 " + $userName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GagMemberDialog$lambda$3(java.util.List r48, boolean r49, final kotlin.jvm.functions.Function1 r50, androidx.compose.runtime.Composer r51, int r52) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.user.UserDetailActivityKt.GagMemberDialog$lambda$3(java.util.List, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GagMemberDialog$lambda$3$0$0$0$0(Function1 $onConfirm, int $gagTime) {
        $onConfirm.invoke(Integer.valueOf($gagTime));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GagMemberDialog$lambda$3$0$0$1(String $label, RowScope TextButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
        ComposerKt.sourceInformation($composer, "C705@29856L47:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1483264317, $changed, -1, "com.yhchat.canarys.ui.user.GagMemberDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:705)");
            }
            TextKt.m3359Text4IGK_g($label, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 48, 0, 131068);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GagMemberDialog$lambda$1(Function0 $onDismiss, boolean $isLoading, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C712@30035L96:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-886842024, $changed, -1, "com.yhchat.canarys.ui.user.GagMemberDialog.<anonymous> (UserDetailActivity.kt:712)");
            }
            ButtonKt.TextButton($onDismiss, null, !$isLoading, null, null, null, null, null, null, ComposableSingletons$UserDetailActivityKt.INSTANCE.getLambda$2133959483$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void UserDetailContent(final UserDetail userDetail, final List<BoardsByCreateItem> createdBoards, final boolean isLoadingBoards, final String token, Composer $composer, final int $changed) {
        boolean z;
        Composer $composer2;
        Intrinsics.checkNotNullParameter(userDetail, "userDetail");
        Intrinsics.checkNotNullParameter(createdBoards, "createdBoards");
        Intrinsics.checkNotNullParameter(token, "token");
        Composer $composer3 = $composer.startRestartGroup(-1144445917);
        ComposerKt.sourceInformation($composer3, "C(UserDetailContent)N(userDetail,createdBoards,isLoadingBoards,token)726@30372L7,731@30550L13232,727@30384L13398:UserDetailActivity.kt#kdg0fc");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(userDetail) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(createdBoards) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            z = isLoadingBoards;
            $dirty |= $composer3.changed(z) ? 256 : 128;
        } else {
            z = isLoadingBoards;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(token) ? 2048 : 1024;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 1171) != 1170, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1144445917, $dirty2, -1, "com.yhchat.canarys.ui.user.UserDetailContent (UserDetailActivity.kt:725)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            PaddingValues paddingValuesM1043PaddingValues0680j_4 = PaddingKt.m1043PaddingValues0680j_4(C1834Dp.m7806constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer3, -300872845, "CC(remember):UserDetailActivity.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(userDetail) | (($dirty2 & 896) == 256) | $composer3.changedInstance(createdBoards) | $composer3.changedInstance(context) | (($dirty2 & 7168) == 2048);
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                final boolean z2 = z;
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return UserDetailActivityKt.UserDetailContent$lambda$0$0(userDetail, z2, createdBoards, context, token, (LazyListScope) obj2);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            LazyDslKt.LazyColumn(modifierFillMaxSize$default, null, paddingValuesM1043PaddingValues0680j_4, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer2, 24966, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailContent$lambda$1(userDetail, createdBoards, isLoadingBoards, token, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailContent$lambda$0$0(final UserDetail $userDetail, final boolean $isLoadingBoards, final List $createdBoards, final Context $context, final String $token, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1996266696, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return UserDetailActivityKt.UserDetailContent$lambda$0$0$0($userDetail, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        final RemarkInfo remarkInfo = $userDetail.getRemarkInfo();
        if (remarkInfo != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2032205355, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailContent$lambda$0$0$1$0(remarkInfo, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        final ProfileInfo profileInfo = $userDetail.getProfileInfo();
        if (profileInfo != null) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-354762175, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailContent$lambda$0$0$2$0(profileInfo, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(304383535, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return UserDetailActivityKt.UserDetailContent$lambda$0$0$3($userDetail, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(314154096, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return UserDetailActivityKt.UserDetailContent$lambda$0$0$4($isLoadingBoards, $createdBoards, $context, $token, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailContent$lambda$0$0$0(final UserDetail $userDetail, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C737@30721L4816,734@30599L4938:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1996266696, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailContent.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:734)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1234893654, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailContent$lambda$0$0$0$0($userDetail, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:110:0x09f0 A[LOOP:0: B:108:0x09ea->B:110:0x09f0, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit UserDetailContent$lambda$0$0$0$0(com.yhchat.canarys.data.model.UserDetail r155, androidx.compose.foundation.layout.ColumnScope r156, androidx.compose.runtime.Composer r157, int r158) {
        /*
            Method dump skipped, instructions count: 2725
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.user.UserDetailActivityKt.UserDetailContent$lambda$0$0$0$0(com.yhchat.canarys.data.model.UserDetail, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailContent$lambda$0$0$0$0$0$1$0$0(MedalInfo $medal, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C835@35325L11,831@35035L358:UserDetailActivity.kt#kdg0fc");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1539886488, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:831)");
            }
            TextKt.m3359Text4IGK_g($medal.getName(), PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimaryContainer(), TextUnitKt.getSp(12), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3120, 0, 131056);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailContent$lambda$0$0$1$0(final RemarkInfo $remark, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C851@35789L972,848@35655L1106:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2032205355, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:848)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, null, null, ComposableLambdaKt.rememberComposableLambda(-1715680093, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailContent$lambda$0$0$1$0$0($remark, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailContent$lambda$0$0$1$0$0(RemarkInfo $remark, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C852@35811L932:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1715680093, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:852)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -1508995676, "C857@35999L177,862@36201L40:UserDetailActivity.kt#kdg0fc");
            TextKt.m3359Text4IGK_g("\u5907\u6ce8\u4fe1\u606f", (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            if ($remark.getRemarkName().length() > 0) {
                $composer.startReplaceGroup(-1508689924);
                ComposerKt.sourceInformation($composer, "865@36357L33");
                m11875InfoRowFNF3uiM("\u5907\u6ce8\u540d", $remark.getRemarkName(), 0L, $composer, 6, 4);
            } else {
                $composer.startReplaceGroup(-1544730059);
            }
            $composer.endReplaceGroup();
            if ($remark.getPhoneNumber().length() > 0) {
                $composer.startReplaceGroup(-1508540101);
                ComposerKt.sourceInformation($composer, "868@36508L34");
                m11875InfoRowFNF3uiM("\u624b\u673a\u53f7", $remark.getPhoneNumber(), 0L, $composer, 6, 4);
            } else {
                $composer.startReplaceGroup(-1544730059);
            }
            $composer.endReplaceGroup();
            if ($remark.getExtraRemark().length() > 0) {
                $composer.startReplaceGroup(-1508389286);
                ComposerKt.sourceInformation($composer, "871@36660L35");
                m11875InfoRowFNF3uiM("\u5176\u4ed6\u5907\u6ce8", $remark.getExtraRemark(), 0L, $composer, 6, 4);
            } else {
                $composer.startReplaceGroup(-1544730059);
            }
            $composer.endReplaceGroup();
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
    public static final Unit UserDetailContent$lambda$0$0$2$0(final ProfileInfo $profile, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C884@37029L1834,881@36895L1968:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-354762175, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:881)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1796103347, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailContent$lambda$0$0$2$0$0($profile, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailContent$lambda$0$0$2$0$0(ProfileInfo $profile, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        String str;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C885@37051L1794:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1796103347, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:885)");
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
            Composer composer = $composer;
            ComposerKt.sourceInformationMarkerStart(composer, -1680607670, "C890@37239L177,895@37441L40,910@38103L25:UserDetailActivity.kt#kdg0fc");
            TextKt.m3359Text4IGK_g("\u4e2a\u4eba\u8d44\u6599", (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer, 6);
            if ($profile.getLastActiveTime().length() > 0) {
                composer.startReplaceGroup(-1680323494);
                ComposerKt.sourceInformation(composer, "898@37602L39");
                m11875InfoRowFNF3uiM("\u4e0a\u6b21\u6d3b\u8dc3", $profile.getLastActiveTime(), 0L, composer, 6, 4);
            } else {
                composer.startReplaceGroup(-1717598855);
            }
            composer.endReplaceGroup();
            if ($profile.getIntroduction().length() > 0) {
                composer.startReplaceGroup(-1680141090);
                ComposerKt.sourceInformation(composer, "902@37786L35");
                m11875InfoRowFNF3uiM("\u7b80\u4ecb", $profile.getIntroduction(), 0L, composer, 6, 4);
            } else {
                composer.startReplaceGroup(-1717598855);
            }
            composer.endReplaceGroup();
            switch ($profile.getGender()) {
                case 1:
                    str = "\u7537";
                    break;
                case 2:
                    str = "\u5973";
                    break;
                default:
                    str = "\u5176\u4ed6";
                    break;
            }
            m11875InfoRowFNF3uiM("\u6027\u522b", str, 0L, composer, 6, 4);
            if ($profile.getBirthday() > 0) {
                composer.startReplaceGroup(-1679690722);
                ComposerKt.sourceInformation(composer, "915@38434L27");
                String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(new Date(1000 * $profile.getBirthday()));
                Intrinsics.checkNotNull(str2);
                m11875InfoRowFNF3uiM("\u751f\u65e5", str2, 0L, composer, 6, 4);
                composer = composer;
            } else {
                composer.startReplaceGroup(-1717598855);
            }
            composer.endReplaceGroup();
            if ($profile.getCity().length() > 0) {
                composer.startReplaceGroup(-1679335834);
                ComposerKt.sourceInformation(composer, "919@38598L27");
                m11875InfoRowFNF3uiM("\u57ce\u5e02", $profile.getCity(), 0L, composer, 6, 4);
            } else {
                composer.startReplaceGroup(-1717598855);
            }
            composer.endReplaceGroup();
            if ($profile.getDistrict().length() > 0) {
                composer.startReplaceGroup(-1679169054);
                ComposerKt.sourceInformation(composer, "923@38766L31");
                m11875InfoRowFNF3uiM("\u5730\u533a", $profile.getDistrict(), 0L, composer, 6, 4);
            } else {
                composer.startReplaceGroup(-1717598855);
            }
            composer.endReplaceGroup();
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
    public static final Unit UserDetailContent$lambda$0$0$3(final UserDetail $userDetail, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C935@39062L1447,932@38940L1569:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(304383535, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailContent.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:932)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1839436577, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailContent$lambda$0$0$3$0($userDetail, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailContent$lambda$0$0$3$0(UserDetail $userDetail, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C936@39080L1415:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1839436577, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:936)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -1923746017, "C941@39248L161,947@39451L41,949@39534L40,950@39595L44,951@39660L54:UserDetailActivity.kt#kdg0fc");
            TextKt.m3359Text4IGK_g("\u8d26\u53f7\u4fe1\u606f", (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            m11875InfoRowFNF3uiM("\u6ce8\u518c\u65f6\u95f4", $userDetail.getRegisterTime(), 0L, $composer, 6, 4);
            m11875InfoRowFNF3uiM("\u5728\u7ebf\u5929\u6570", $userDetail.getOnlineDay() + " \u5929", 0L, $composer, 6, 4);
            m11875InfoRowFNF3uiM("\u8fde\u7eed\u5728\u7ebf", $userDetail.getContinuousOnlineDay() + " \u5929", 0L, $composer, 6, 4);
            Composer composer = $composer;
            if ($userDetail.isVip() != 1 || $userDetail.getVipExpiredTime() <= 0) {
                composer.startReplaceGroup(-1962719125);
            } else {
                composer.startReplaceGroup(-1923211795);
                ComposerKt.sourceInformation(composer, "956@40050L30");
                String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(1000 * $userDetail.getVipExpiredTime()));
                Intrinsics.checkNotNull(str);
                m11875InfoRowFNF3uiM("VIP\u5230\u671f\u65f6\u95f4", str, 0L, composer, 6, 4);
                composer = composer;
            }
            composer.endReplaceGroup();
            if ($userDetail.getBanTime() > 0) {
                composer.startReplaceGroup(-1922858054);
                ComposerKt.sourceInformation(composer, "962@40437L11,962@40396L59");
                String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(1000 * $userDetail.getBanTime()));
                Intrinsics.checkNotNull(str2);
                m11875InfoRowFNF3uiM("\u5c01\u7981\u7ed3\u675f\u65f6\u95f4", str2, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getError(), composer, 6, 0);
            } else {
                composer.startReplaceGroup(-1962719125);
            }
            composer.endReplaceGroup();
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
    public static final Unit UserDetailContent$lambda$0$0$4(final boolean $isLoadingBoards, final List $createdBoards, final Context $context, final String $token, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C972@40670L3096,969@40548L3218:UserDetailActivity.kt#kdg0fc");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(314154096, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailContent.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:969)");
            }
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)), null, null, null, ComposableLambdaKt.rememberComposableLambda(1849207138, true, new Function3() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda59
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return UserDetailActivityKt.UserDetailContent$lambda$0$0$4$0($isLoadingBoards, $createdBoards, $context, $token, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), $composer, 196614, 28);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailContent$lambda$0$0$4$0(boolean $isLoadingBoards, List $createdBoards, Context $context, String $token, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        String str;
        final Context context = $context;
        final String str2 = $token;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C973@40688L3064:UserDetailActivity.kt#kdg0fc");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1849207138, $changed, -1, "com.yhchat.canarys.ui.user.UserDetailContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (UserDetailActivity.kt:973)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, Alignment.INSTANCE.getStart(), $composer, ((6 >> 3) & 14) | ((6 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((6 << 3) & 112) << 6) & 896) | 6;
            String str3 = "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp";
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
            ComposerKt.sourceInformationMarkerStart($composer, 1388279021, "C978@40856L162,983@41039L40:UserDetailActivity.kt#kdg0fc");
            TextKt.m3359Text4IGK_g("\u521b\u5efa\u7684\u5206\u533a", (Modifier) null, 0L, TextUnitKt.getSp(16), (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199686, 0, 131030);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            if ($isLoadingBoards) {
                $composer.startReplaceGroup(1388486596);
                ComposerKt.sourceInformation($composer, "987@41181L78");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                $composer.endReplaceGroup();
            } else if ($createdBoards.isEmpty()) {
                $composer.startReplaceGroup(1388703317);
                ComposerKt.sourceInformation($composer, "993@41522L11,990@41367L213");
                TextKt.m3359Text4IGK_g("\u6682\u65e0", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 3078, 0, 131058);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1389030801);
                ComposerKt.sourceInformation($composer, "*1001@41902L512,998@41734L1922");
                List list = $createdBoards;
                int i4 = 0;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Iterable iterable = list;
                    final BoardsByCreateItem boardsByCreateItem = (BoardsByCreateItem) it.next();
                    int i5 = i4;
                    Iterator it2 = it;
                    MeasurePolicy measurePolicy = measurePolicyColumnMeasurePolicy;
                    Arrangement.Vertical vertical = top;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer, 1079533579, "CC(remember):UserDetailActivity.kt#9igjgp");
                    boolean zChangedInstance = $composer.changedInstance(context) | $composer.changed(boardsByCreateItem) | $composer.changed(str2);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function0() { // from class: com.yhchat.canarys.ui.user.UserDetailActivityKt$$ExternalSyntheticLambda14
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UserDetailActivityKt.UserDetailContent$lambda$0$0$4$0$0$0$0$0(context, boardsByCreateItem, str2);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), 0.0f, C1834Dp.m7806constructorimpl(8), 1, null);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierM1052paddingVpY3zN4$default);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i6 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -553112988, str3);
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
                    if (composerM4376constructorimpl2.getInserting()) {
                        str = str3;
                    } else {
                        str = str3;
                        if (!Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                        }
                        Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        int i7 = (i6 >> 6) & 14;
                        ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        int i8 = ((384 >> 6) & 112) | 6;
                        ComposerKt.sourceInformationMarkerStart($composer, -908965725, "C1013@42731L7,1012@42637L640,1023@43314L40,1024@43391L231:UserDetailActivity.kt#kdg0fc");
                        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                        ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                        Object objConsume = $composer.consume(localContext);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(new ImageRequest.Builder((Context) objConsume).data(boardsByCreateItem.getAvatar()).crossfade(true).build(), null, ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(36)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1572912, 0, 4024);
                        SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
                        TextKt.m3359Text4IGK_g(boardsByCreateItem.getName(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        $composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        ComposerKt.sourceInformationMarkerEnd($composer);
                        context = $context;
                        str2 = $token;
                        list = iterable;
                        it = it2;
                        i4 = i5;
                        measurePolicyColumnMeasurePolicy = measurePolicy;
                        top = vertical;
                        str3 = str;
                    }
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i72 = (i6 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    int i82 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, -908965725, "C1013@42731L7,1012@42637L640,1023@43314L40,1024@43391L231:UserDetailActivity.kt#kdg0fc");
                    ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object objConsume2 = $composer.consume(localContext2);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(new ImageRequest.Builder((Context) objConsume2).data(boardsByCreateItem.getAvatar()).crossfade(true).build(), null, ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(36)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, $composer, 1572912, 0, 4024);
                    SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
                    TextKt.m3359Text4IGK_g(boardsByCreateItem.getName(), (Modifier) null, 0L, TextUnitKt.getSp(14), (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 199680, 0, 131030);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    context = $context;
                    str2 = $token;
                    list = iterable;
                    it = it2;
                    i4 = i5;
                    measurePolicyColumnMeasurePolicy = measurePolicy;
                    top = vertical;
                    str3 = str;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDetailContent$lambda$0$0$4$0$0$0$0$0(Context $context, BoardsByCreateItem $board, String $token) {
        Intent intent = new Intent($context, (Class<?>) BoardDetailActivity.class);
        intent.putExtra("board_id", $board.getId());
        intent.putExtra("board_name", $board.getName());
        intent.putExtra("token", $token);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0269  */
    /* renamed from: InfoRow-FNF3uiM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m11875InfoRowFNF3uiM(final java.lang.String r54, final java.lang.String r55, long r56, androidx.compose.runtime.Composer r58, final int r59, final int r60) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.user.UserDetailActivityKt.m11875InfoRowFNF3uiM(java.lang.String, java.lang.String, long, androidx.compose.runtime.Composer, int, int):void");
    }
}
