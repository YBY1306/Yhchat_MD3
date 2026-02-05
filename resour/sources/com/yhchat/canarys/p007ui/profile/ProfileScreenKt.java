package com.yhchat.canarys.p007ui.profile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import androidx.autofill.HintConstants;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowForwardKt;
import androidx.compose.material.icons.filled.EditKt;
import androidx.compose.material.icons.filled.VisibilityKt;
import androidx.compose.material.icons.filled.VisibilityOffKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
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
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.data.model.BetaInfo;
import com.yhchat.canarys.data.model.SaveUserDataRequest;
import com.yhchat.canarys.data.model.UserData;
import com.yhchat.canarys.data.model.UserProfile;
import com.yhchat.canarys.data.repository.NavigationRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import com.yhchat.canarys.p007ui.coin.CoinDetailActivity;
import com.yhchat.canarys.p007ui.coin.CoinRecordActivity;
import com.yhchat.canarys.p007ui.coin.CoinShopActivity;
import com.yhchat.canarys.p007ui.settings.SettingsActivity;
import com.yhchat.canarys.p007ui.stats.UserStatsActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProfileScreen.kt */
@Metadata(m168d1 = {"\u0000\u0092\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a;\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0002\u0010\n\u001a\u00cd\u0001\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001a2\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010'\u001a'\u0010(\u001a\u00020\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0003\u00a2\u0006\u0002\u0010*\u001a5\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020 2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u00100\u001a?\u00101\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001aH\u0003\u00a2\u0006\u0002\u00103\u001a=\u00104\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020 2\u0006\u00105\u001a\u00020 2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u00106\u001a/\u00107\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020 2\u0006\u00105\u001a\u00020 2\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u00108\u001a=\u00109\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010:\u001a\u00020 2\u0006\u0010;\u001a\u00020 2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u00106\u001aE\u0010<\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020 2\u0006\u00105\u001a\u00020 2\u0006\u0010=\u001a\u00020 2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010?\u001a?\u0010@\u001a\u00020\u00012\u0006\u0010A\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0003\u00a2\u0006\u0002\u0010C\u001a?\u0010D\u001a\u00020\u00012\u0006\u0010E\u001a\u00020 2\u0006\u0010F\u001a\u00020G2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00010\u001a2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0003\u00a2\u0006\u0002\u0010H\u001a#\u0010I\u001a\u00020\u00012\u0006\u0010J\u001a\u00020K2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0003\u00a2\u0006\u0002\u0010L\u001a\u0010\u0010M\u001a\u00020 2\u0006\u0010N\u001a\u00020 H\u0002\u001aE\u0010O\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020 2\u0006\u00105\u001a\u00020 2\u0006\u0010P\u001a\u00020\u00152\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u0010R\u001aC\u0010S\u001a\u00020\u00012\u0006\u0010A\u001a\u00020 2\u0006\u0010%\u001a\u00020&2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00010\u0017H\u0003\u00a2\u0006\u0002\u0010T\u001a5\u0010U\u001a\u00020\u00012\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020 2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003\u00a2\u0006\u0002\u00100\u00a8\u0006V\u00b2\u0006\n\u0010W\u001a\u00020XX\u008a\u0084\u0002\u00b2\u0006\n\u0010%\u001a\u00020&X\u008a\u0084\u0002\u00b2\u0006\n\u0010F\u001a\u00020GX\u008a\u0084\u0002\u00b2\u0006\n\u0010!\u001a\u00020\"X\u008a\u0084\u0002\u00b2\u0006\n\u0010#\u001a\u00020$X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002\u00b2\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002\u00b2\u0006\n\u0010Y\u001a\u00020\u0015X\u008a\u008e\u0002\u00b2\u0006\n\u0010Z\u001a\u00020\u0015X\u008a\u008e\u0002\u00b2\u0006\n\u0010[\u001a\u00020\u0015X\u008a\u008e\u0002\u00b2\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u008e\u0002\u00b2\u0006\n\u0010\\\u001a\u00020\u0015X\u008a\u008e\u0002\u00b2\u0006\n\u0010]\u001a\u00020\u0015X\u008a\u008e\u0002\u00b2\u0006\n\u0010^\u001a\u00020\u0015X\u008a\u008e\u0002\u00b2\u0006\n\u0010_\u001a\u00020\u0015X\u008a\u008e\u0002\u00b2\u0006\n\u0010`\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\n\u0010a\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\n\u0010b\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\n\u0010c\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\n\u0010d\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\n\u0010e\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\n\u0010f\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\n\u0010g\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\n\u0010h\u001a\u00020 X\u008a\u008e\u0002"}, m169d2 = {"ProfileScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "navigationRepository", "Lcom/yhchat/canarys/data/repository/NavigationRepository;", "(Landroidx/compose/ui/Modifier;Lcom/yhchat/canarys/data/repository/UserRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/data/repository/NavigationRepository;Landroidx/compose/runtime/Composer;II)V", "UserProfileContent", "userProfile", "Lcom/yhchat/canarys/data/model/UserProfile;", "viewModel", "Lcom/yhchat/canarys/ui/profile/ProfileViewModel;", "userDataState", "Lcom/yhchat/canarys/ui/profile/UserDataState;", "saveUserDataState", "Lcom/yhchat/canarys/ui/profile/SaveUserDataState;", "showUserDataDialog", "", "onShowUserDataDialog", "Lkotlin/Function0;", "onDismissUserDataDialog", "onSaveUserData", "Lkotlin/Function1;", "Lcom/yhchat/canarys/data/model/SaveUserDataRequest;", "onShowChangeInviteCodeDialog", "onShowChangeNicknameDialog", "imagePickerLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "changeAvatarState", "Lcom/yhchat/canarys/ui/profile/ChangeAvatarState;", "betaState", "Lcom/yhchat/canarys/ui/profile/BetaState;", "changeInviteCodeState", "Lcom/yhchat/canarys/ui/profile/ChangeInviteCodeState;", "(Lcom/yhchat/canarys/data/model/UserProfile;Lcom/yhchat/canarys/data/repository/NavigationRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/ui/profile/ProfileViewModel;Lcom/yhchat/canarys/ui/profile/UserDataState;Lcom/yhchat/canarys/ui/profile/SaveUserDataState;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/activity/result/ActivityResultLauncher;Lcom/yhchat/canarys/ui/profile/ChangeAvatarState;Lcom/yhchat/canarys/ui/profile/BetaState;Lcom/yhchat/canarys/ui/profile/ChangeInviteCodeState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "CoinMenuBottomSheet", "onDismiss", "(Lcom/yhchat/canarys/data/repository/TokenRepository;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CoinMenuItem", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "label", "onClick", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "UserDataEditDialog", "onSave", "(Lcom/yhchat/canarys/ui/profile/UserDataState;Lcom/yhchat/canarys/ui/profile/SaveUserDataState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ProfileInfoItemClickable", "value", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProfileInfoItem", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ProfileSettingItem", "title", "subtitle", "ProfileInfoItemWithButton", "buttonText", "onButtonClick", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ChangeInviteCodeDialog", "currentInviteCode", "onConfirm", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/profile/ChangeInviteCodeState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ChangeNicknameDialog", "currentNickname", "changeNicknameState", "Lcom/yhchat/canarys/ui/profile/ChangeNicknameState;", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/profile/ChangeNicknameState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BetaInfoDialog", "betaInfo", "Lcom/yhchat/canarys/data/model/BetaInfo;", "(Lcom/yhchat/canarys/data/model/BetaInfo;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "formatPhoneNumber", HintConstants.AUTOFILL_HINT_PHONE, "ProfileInfoItemWithToggle", "isVisible", "onToggleVisibility", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "InviteCodeMenuBottomSheet", "(Ljava/lang/String;Lcom/yhchat/canarys/ui/profile/ChangeInviteCodeState;Lcom/yhchat/canarys/ui/profile/ProfileViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "InviteCodeMenuItem", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/profile/ProfileUiState;", "showChangeInviteCodeDialog", "showChangeNicknameDialog", "showImagePicker", "showBetaInfo", "showFullPhone", "showCoinMenu", "showInviteCodeMenu", "introduction", HintConstants.AUTOFILL_HINT_GENDER, "birthday", "province", "city", "district", "locationCode", "newInviteCode", "newNickname"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final class ProfileScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetaInfoDialog$lambda$2(BetaInfo betaInfo, Function0 function0, int i, Composer composer, int i2) {
        BetaInfoDialog(betaInfo, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeInviteCodeDialog$lambda$8(String str, ChangeInviteCodeState changeInviteCodeState, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        ChangeInviteCodeDialog(str, changeInviteCodeState, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeNicknameDialog$lambda$8(String str, ChangeNicknameState changeNicknameState, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        ChangeNicknameDialog(str, changeNicknameState, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinMenuBottomSheet$lambda$1(TokenRepository tokenRepository, Function0 function0, int i, int i2, Composer composer, int i3) {
        CoinMenuBottomSheet(tokenRepository, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinMenuItem$lambda$1(ImageVector imageVector, String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CoinMenuItem(imageVector, str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteCodeMenuBottomSheet$lambda$1(String str, ChangeInviteCodeState changeInviteCodeState, ProfileViewModel profileViewModel, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        InviteCodeMenuBottomSheet(str, changeInviteCodeState, profileViewModel, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteCodeMenuItem$lambda$1(ImageVector imageVector, String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InviteCodeMenuItem(imageVector, str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileInfoItem$lambda$1(ImageVector imageVector, String str, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProfileInfoItem(imageVector, str, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileInfoItemClickable$lambda$1(ImageVector imageVector, String str, String str2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProfileInfoItemClickable(imageVector, str, str2, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileInfoItemWithButton$lambda$1(ImageVector imageVector, String str, String str2, String str3, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProfileInfoItemWithButton(imageVector, str, str2, str3, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileInfoItemWithToggle$lambda$1(ImageVector imageVector, String str, String str2, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProfileInfoItemWithToggle(imageVector, str, str2, z, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$31(Modifier modifier, UserRepository userRepository, TokenRepository tokenRepository, NavigationRepository navigationRepository, int i, int i2, Composer composer, int i3) {
        ProfileScreen(modifier, userRepository, tokenRepository, navigationRepository, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileSettingItem$lambda$1(ImageVector imageVector, String str, String str2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ProfileSettingItem(imageVector, str, str2, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$26(UserDataState userDataState, SaveUserDataState saveUserDataState, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        UserDataEditDialog(userDataState, saveUserDataState, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$3(UserProfile userProfile, NavigationRepository navigationRepository, TokenRepository tokenRepository, ProfileViewModel profileViewModel, UserDataState userDataState, SaveUserDataState saveUserDataState, boolean z, Function0 function0, Function0 function02, Function1 function1, Function0 function03, Function0 function04, ActivityResultLauncher activityResultLauncher, ChangeAvatarState changeAvatarState, BetaState betaState, ChangeInviteCodeState changeInviteCodeState, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        UserProfileContent(userProfile, navigationRepository, tokenRepository, profileViewModel, userDataState, saveUserDataState, z, function0, function02, function1, function03, function04, activityResultLauncher, changeAvatarState, betaState, changeInviteCodeState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x051e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0534 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x06b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0da8  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0dbc  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0e3e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0e4d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ProfileScreen(androidx.compose.p000ui.Modifier r120, com.yhchat.canarys.data.repository.UserRepository r121, com.yhchat.canarys.data.repository.TokenRepository r122, com.yhchat.canarys.data.repository.NavigationRepository r123, androidx.compose.runtime.Composer r124, final int r125, final int r126) {
        /*
            Method dump skipped, instructions count: 3699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.ProfileScreen(androidx.compose.ui.Modifier, com.yhchat.canarys.data.repository.UserRepository, com.yhchat.canarys.data.repository.TokenRepository, com.yhchat.canarys.data.repository.NavigationRepository, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final ProfileUiState ProfileScreen$lambda$1(State<ProfileUiState> state) {
        return (ProfileUiState) state.getValue();
    }

    private static final ChangeInviteCodeState ProfileScreen$lambda$2(State<ChangeInviteCodeState> state) {
        return (ChangeInviteCodeState) state.getValue();
    }

    private static final ChangeNicknameState ProfileScreen$lambda$3(State<ChangeNicknameState> state) {
        return (ChangeNicknameState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChangeAvatarState ProfileScreen$lambda$4(State<ChangeAvatarState> state) {
        return (ChangeAvatarState) state.getValue();
    }

    private static final BetaState ProfileScreen$lambda$5(State<BetaState> state) {
        return (BetaState) state.getValue();
    }

    private static final UserDataState ProfileScreen$lambda$6(State<UserDataState> state) {
        return (UserDataState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SaveUserDataState ProfileScreen$lambda$7(State<SaveUserDataState> state) {
        return (SaveUserDataState) state.getValue();
    }

    private static final void ProfileScreen$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ProfileScreen$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final boolean ProfileScreen$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ProfileScreen$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ProfileScreen$lambda$18(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ProfileScreen$lambda$19(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$20$0(ProfileViewModel $viewModel, Context $context, Uri uri) {
        if (uri != null) {
            $viewModel.changeAvatar($context, uri);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$26$0(final Context $context, final NavigationRepository $navigationRepository, final TokenRepository $tokenRepository, RowScope TopAppBar, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C137@5423L118,136@5381L358:ProfileScreen.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1929573626, $changed, -1, "com.yhchat.canarys.ui.profile.ProfileScreen.<anonymous>.<anonymous> (ProfileScreen.kt:136)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1105615248, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changedInstance($navigationRepository) | $composer.changedInstance($tokenRepository);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ProfileScreen$lambda$26$0$0$0($context, $navigationRepository, $tokenRepository);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$52675607$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$26$0$0$0(Context $context, NavigationRepository $navigationRepository, TokenRepository $tokenRepository) {
        SettingsActivity.INSTANCE.start($context, $navigationRepository, $tokenRepository);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$26$1$1$0$0(ProfileViewModel $viewModel) {
        $viewModel.loadUserProfile();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$26$1$2$0$0(ProfileViewModel $viewModel, MutableState $showUserDataDialog$delegate) {
        ProfileScreen$lambda$19($showUserDataDialog$delegate, true);
        $viewModel.loadUserData();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$26$1$2$1$0(ProfileViewModel $viewModel, State $saveUserDataState$delegate, MutableState $showUserDataDialog$delegate) {
        if (!ProfileScreen$lambda$7($saveUserDataState$delegate).isLoading()) {
            ProfileScreen$lambda$19($showUserDataDialog$delegate, false);
            $viewModel.resetSaveUserDataState();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$26$1$2$2$0(ProfileViewModel $viewModel, SaveUserDataRequest req) {
        Intrinsics.checkNotNullParameter(req, "req");
        $viewModel.saveUserData(req);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$26$1$2$3$0(MutableState $showChangeInviteCodeDialog$delegate) {
        ProfileScreen$lambda$10($showChangeInviteCodeDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$26$1$2$4$0(MutableState $showChangeNicknameDialog$delegate) {
        ProfileScreen$lambda$13($showChangeNicknameDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$27$0(ProfileViewModel $viewModel, String newCode) {
        Intrinsics.checkNotNullParameter(newCode, "newCode");
        $viewModel.changeInviteCode(newCode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$28$0(ProfileViewModel $viewModel, MutableState $showChangeInviteCodeDialog$delegate) {
        ProfileScreen$lambda$10($showChangeInviteCodeDialog$delegate, false);
        $viewModel.resetChangeInviteCodeState();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$29$0(ProfileViewModel $viewModel, String newNickname) {
        Intrinsics.checkNotNullParameter(newNickname, "newNickname");
        $viewModel.changeNickname(newNickname);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileScreen$lambda$30$0(ProfileViewModel $viewModel, MutableState $showChangeNicknameDialog$delegate) {
        ProfileScreen$lambda$13($showChangeNicknameDialog$delegate, false);
        $viewModel.resetChangeNicknameState();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:194:0x04b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void UserProfileContent(final com.yhchat.canarys.data.model.UserProfile r51, com.yhchat.canarys.data.repository.NavigationRepository r52, com.yhchat.canarys.data.repository.TokenRepository r53, final com.yhchat.canarys.p007ui.profile.ProfileViewModel r54, final com.yhchat.canarys.p007ui.profile.UserDataState r55, final com.yhchat.canarys.p007ui.profile.SaveUserDataState r56, final boolean r57, final kotlin.jvm.functions.Function0<kotlin.Unit> r58, final kotlin.jvm.functions.Function0<kotlin.Unit> r59, final kotlin.jvm.functions.Function1<? super com.yhchat.canarys.data.model.SaveUserDataRequest, kotlin.Unit> r60, kotlin.jvm.functions.Function0<kotlin.Unit> r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, final androidx.activity.result.ActivityResultLauncher<java.lang.String> r63, final com.yhchat.canarys.p007ui.profile.ChangeAvatarState r64, final com.yhchat.canarys.p007ui.profile.BetaState r65, final com.yhchat.canarys.p007ui.profile.ChangeInviteCodeState r66, androidx.compose.p000ui.Modifier r67, androidx.compose.runtime.Composer r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.UserProfileContent(com.yhchat.canarys.data.model.UserProfile, com.yhchat.canarys.data.repository.NavigationRepository, com.yhchat.canarys.data.repository.TokenRepository, com.yhchat.canarys.ui.profile.ProfileViewModel, com.yhchat.canarys.ui.profile.UserDataState, com.yhchat.canarys.ui.profile.SaveUserDataState, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.activity.result.ActivityResultLauncher, com.yhchat.canarys.ui.profile.ChangeAvatarState, com.yhchat.canarys.ui.profile.BetaState, com.yhchat.canarys.ui.profile.ChangeInviteCodeState, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:117:0x09fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit UserProfileContent$lambda$2$0(final androidx.activity.result.ActivityResultLauncher r117, com.yhchat.canarys.data.model.UserProfile r118, com.yhchat.canarys.p007ui.profile.ChangeAvatarState r119, kotlin.jvm.functions.Function0 r120, com.yhchat.canarys.p007ui.profile.BetaState r121, androidx.compose.foundation.layout.ColumnScope r122, androidx.compose.runtime.Composer r123, int r124) {
        /*
            Method dump skipped, instructions count: 3358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.UserProfileContent$lambda$2$0(androidx.activity.result.ActivityResultLauncher, com.yhchat.canarys.data.model.UserProfile, com.yhchat.canarys.ui.profile.ChangeAvatarState, kotlin.jvm.functions.Function0, com.yhchat.canarys.ui.profile.BetaState, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$0$0$0$0(ActivityResultLauncher $imagePickerLauncher) {
        $imagePickerLauncher.launch("image/*");
        return Unit.INSTANCE;
    }

    private static final boolean UserProfileContent$lambda$2$0$0$3$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void UserProfileContent$lambda$2$0$0$3$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$0$0$3$4$0(MutableState $showBetaInfo$delegate) {
        UserProfileContent$lambda$2$0$0$3$3($showBetaInfo$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$0$0$3$6$0(MutableState $showBetaInfo$delegate) {
        UserProfileContent$lambda$2$0$0$3$3($showBetaInfo$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$1$0$1$0(Function0 $onShowUserDataDialog) {
        $onShowUserDataDialog.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$1$0$2$0(Function0 $onDismissUserDataDialog) {
        $onDismissUserDataDialog.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$1$0$3$0(Function1 $onSaveUserData, SaveUserDataRequest req) {
        Intrinsics.checkNotNullParameter(req, "req");
        $onSaveUserData.invoke(req);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0573  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0406  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit UserProfileContent$lambda$2$1(com.yhchat.canarys.p007ui.profile.UserDataState r58, final kotlin.jvm.functions.Function0 r59, boolean r60, com.yhchat.canarys.p007ui.profile.SaveUserDataState r61, final kotlin.jvm.functions.Function0 r62, final kotlin.jvm.functions.Function1 r63, com.yhchat.canarys.data.model.UserProfile r64, final android.content.Context r65, com.yhchat.canarys.data.repository.TokenRepository r66, com.yhchat.canarys.p007ui.profile.ChangeInviteCodeState r67, com.yhchat.canarys.p007ui.profile.ProfileViewModel r68, kotlin.jvm.functions.Function0 r69, androidx.compose.foundation.layout.ColumnScope r70, androidx.compose.runtime.Composer r71, int r72) {
        /*
            Method dump skipped, instructions count: 1812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.UserProfileContent$lambda$2$1(com.yhchat.canarys.ui.profile.UserDataState, kotlin.jvm.functions.Function0, boolean, com.yhchat.canarys.ui.profile.SaveUserDataState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, com.yhchat.canarys.data.model.UserProfile, android.content.Context, com.yhchat.canarys.data.repository.TokenRepository, com.yhchat.canarys.ui.profile.ChangeInviteCodeState, com.yhchat.canarys.ui.profile.ProfileViewModel, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final boolean UserProfileContent$lambda$2$1$0$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void UserProfileContent$lambda$2$1$0$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$1$0$7$0(MutableState $showFullPhone$delegate) {
        UserProfileContent$lambda$2$1$0$6($showFullPhone$delegate, !UserProfileContent$lambda$2$1$0$5($showFullPhone$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$1$0$8$0(Context $context) {
        Intent intent = new Intent($context, (Class<?>) EmailModificationActivity.class);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$1$0$9$0(Context $context) {
        Intent intent = new Intent($context, (Class<?>) EmailBindingActivity.class);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    private static final boolean UserProfileContent$lambda$2$1$0$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void UserProfileContent$lambda$2$1$0$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$1$0$13$0(MutableState $showCoinMenu$delegate) {
        UserProfileContent$lambda$2$1$0$12($showCoinMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$1$0$14$0(MutableState $showCoinMenu$delegate) {
        UserProfileContent$lambda$2$1$0$12($showCoinMenu$delegate, false);
        return Unit.INSTANCE;
    }

    private static final boolean UserProfileContent$lambda$2$1$0$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void UserProfileContent$lambda$2$1$0$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$1$0$18$0(MutableState $showInviteCodeMenu$delegate) {
        UserProfileContent$lambda$2$1$0$17($showInviteCodeMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserProfileContent$lambda$2$1$0$19$0(MutableState $showInviteCodeMenu$delegate) {
        UserProfileContent$lambda$2$1$0$17($showInviteCodeMenu$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void CoinMenuBottomSheet(TokenRepository tokenRepository, final Function0<Unit> function0, Composer $composer, final int $changed, final int i) {
        final TokenRepository tokenRepository2;
        Composer $composer2;
        int $dirty;
        Composer $composer3 = $composer.startRestartGroup(-1264342944);
        ComposerKt.sourceInformation($composer3, "C(CoinMenuBottomSheet)N(tokenRepository,onDismiss)633@25548L7,634@25577L31,635@25634L24,640@25758L2417,637@25664L2511:ProfileScreen.kt#ahnxbw");
        int $dirty2 = $changed;
        int i2 = i & 1;
        if (i2 != 0) {
            $dirty2 |= 6;
            tokenRepository2 = tokenRepository;
        } else if (($changed & 6) == 0) {
            tokenRepository2 = tokenRepository;
            $dirty2 |= $composer3.changedInstance(tokenRepository2) ? 4 : 2;
        } else {
            tokenRepository2 = tokenRepository;
        }
        if (($changed & 48) == 0) {
            $dirty2 |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            final TokenRepository tokenRepository3 = i2 != 0 ? null : tokenRepository2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1264342944, $dirty2, -1, "com.yhchat.canarys.ui.profile.CoinMenuBottomSheet (ProfileScreen.kt:632)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, $composer3, 0, 3);
            ComposerKt.sourceInformationMarkerStart($composer3, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer3, 683737348, "CC(remember):Effects.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                $dirty = $dirty2;
                Object objCreateCompositionCoroutineScope = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer3);
                $composer3.updateRememberedValue(objCreateCompositionCoroutineScope);
                objRememberedValue = objCreateCompositionCoroutineScope;
            } else {
                $dirty = $dirty2;
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            TokenRepository tokenRepository4 = tokenRepository3;
            $composer2 = $composer3;
            ModalBottomSheetKt.m2908ModalBottomSheetdYc4hso(function0, null, sheetState, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(124742691, true, new Function3() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda74
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.CoinMenuBottomSheet$lambda$0(context, function0, coroutineScope, tokenRepository3, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, ($dirty >> 3) & 14, 384, 4090);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            tokenRepository2 = tokenRepository4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda75
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.CoinMenuBottomSheet$lambda$1(tokenRepository2, function0, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0363  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit CoinMenuBottomSheet$lambda$0(final android.content.Context r56, final kotlin.jvm.functions.Function0 r57, final kotlinx.coroutines.CoroutineScope r58, final com.yhchat.canarys.data.repository.TokenRepository r59, androidx.compose.foundation.layout.ColumnScope r60, androidx.compose.runtime.Composer r61, int r62) {
        /*
            Method dump skipped, instructions count: 877
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.CoinMenuBottomSheet$lambda$0(android.content.Context, kotlin.jvm.functions.Function0, kotlinx.coroutines.CoroutineScope, com.yhchat.canarys.data.repository.TokenRepository, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinMenuBottomSheet$lambda$0$0$0$0(Context $context, Function0 $onDismiss) {
        Intent intent = new Intent($context, (Class<?>) CoinShopActivity.class);
        $context.startActivity(intent);
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinMenuBottomSheet$lambda$0$0$1$0(Context $context, Function0 $onDismiss) {
        Intent intent = new Intent($context, (Class<?>) CoinDetailActivity.class);
        $context.startActivity(intent);
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinMenuBottomSheet$lambda$0$0$2$0(Context $context, Function0 $onDismiss) {
        Intent intent = new Intent($context, (Class<?>) CoinRecordActivity.class);
        $context.startActivity(intent);
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinMenuBottomSheet$lambda$0$0$3$0(CoroutineScope $coroutineScope, TokenRepository $tokenRepository, Context $context, Function0 $onDismiss) {
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new ProfileScreenKt$CoinMenuBottomSheet$1$1$4$1$1($tokenRepository, $context, $onDismiss, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void CoinMenuItem(final androidx.compose.p000ui.graphics.vector.ImageVector r50, final java.lang.String r51, final kotlin.jvm.functions.Function0<kotlin.Unit> r52, androidx.compose.p000ui.Modifier r53, androidx.compose.runtime.Composer r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.CoinMenuItem(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void UserDataEditDialog(final UserDataState userDataState, final SaveUserDataState saveUserDataState, final Function0<Unit> function0, final Function1<? super SaveUserDataRequest, Unit> function1, Composer $composer, final int $changed) {
        UserDataState userDataState2;
        Composer $composer2;
        MutableState gender$delegate;
        MutableState birthday$delegate;
        MutableState province$delegate;
        MutableState gender$delegate2;
        MutableState city$delegate;
        int i;
        MutableState gender$delegate3;
        int i2;
        Composer $composer3 = $composer.startRestartGroup(1847137736);
        ComposerKt.sourceInformation($composer3, "C(UserDataEditDialog)N(userDataState,saveUserDataState,onDismiss,onSave)747@29222L31,748@29272L32,749@29325L32,750@29378L31,751@29426L31,752@29478L31,753@29534L31,755@29610L417,755@29571L456,769@30073L49,854@33298L935,877@34259L145,777@30340L2932,768@30033L4377:ProfileScreen.kt#ahnxbw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            userDataState2 = userDataState;
            $dirty |= $composer3.changed(userDataState2) ? 4 : 2;
        } else {
            userDataState2 = userDataState;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(saveUserDataState) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 2048 : 1024;
        }
        if ($composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1847137736, $dirty, -1, "com.yhchat.canarys.ui.profile.UserDataEditDialog (ProfileScreen.kt:746)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1277877383, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState introduction$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1277878984, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExifInterface.GPS_MEASUREMENT_3D, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            MutableState gender$delegate4 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1277880680, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                gender$delegate = gender$delegate4;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("0", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            } else {
                gender$delegate = gender$delegate4;
            }
            MutableState birthday$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1277882375, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue4 = objMutableStateOf$default4;
            }
            MutableState province$delegate2 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1277883911, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue5 = $composer3.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateMutableStateOf$default);
                objRememberedValue5 = mutableStateMutableStateOf$default;
            }
            MutableState city$delegate2 = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1277885575, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue6 = $composer3.rememberedValue();
            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(mutableStateMutableStateOf$default2);
                objRememberedValue6 = mutableStateMutableStateOf$default2;
            }
            final MutableState district$delegate = (MutableState) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1277887367, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue7 = $composer3.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default5);
                objRememberedValue7 = objMutableStateOf$default5;
            }
            MutableState locationCode$delegate = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            UserData userData = userDataState2.getUserData();
            ComposerKt.sourceInformationMarkerStart($composer3, 1277890185, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean z = ($dirty & 14) == 4;
            ProfileScreenKt$UserDataEditDialog$1$1 profileScreenKt$UserDataEditDialog$1$1RememberedValue = $composer3.rememberedValue();
            if (z || profileScreenKt$UserDataEditDialog$1$1RememberedValue == Composer.INSTANCE.getEmpty()) {
                birthday$delegate = birthday$delegate2;
                province$delegate = province$delegate2;
                gender$delegate2 = gender$delegate;
                city$delegate = city$delegate2;
                i = 0;
                gender$delegate3 = locationCode$delegate;
                i2 = 1;
                profileScreenKt$UserDataEditDialog$1$1RememberedValue = new ProfileScreenKt$UserDataEditDialog$1$1(userDataState2, introduction$delegate, gender$delegate2, birthday$delegate, province$delegate, city$delegate, district$delegate, gender$delegate3, null);
                $composer3.updateRememberedValue(profileScreenKt$UserDataEditDialog$1$1RememberedValue);
            } else {
                birthday$delegate = birthday$delegate2;
                province$delegate = province$delegate2;
                gender$delegate2 = gender$delegate;
                city$delegate = city$delegate2;
                i = 0;
                gender$delegate3 = locationCode$delegate;
                i2 = 1;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(userData, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) profileScreenKt$UserDataEditDialog$1$1RememberedValue, $composer3, i);
            ComposerKt.sourceInformationMarkerStart($composer3, 1277904633, "CC(remember):ProfileScreen.kt#9igjgp");
            int i3 = ($dirty & 112) == 32 ? i2 : i;
            if (($dirty & 896) == 256) {
                i = i2;
            }
            int i4 = i3 | i;
            Object objRememberedValue8 = $composer3.rememberedValue();
            if (i4 != 0 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.UserDataEditDialog$lambda$22$0(saveUserDataState, function0);
                    }
                };
                $composer3.updateRememberedValue(obj);
                objRememberedValue8 = obj;
            }
            Function0 function02 = (Function0) objRememberedValue8;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            boolean z2 = i2;
            final MutableState gender$delegate5 = gender$delegate2;
            final MutableState birthday$delegate3 = birthday$delegate;
            final MutableState province$delegate3 = province$delegate;
            final MutableState city$delegate3 = city$delegate;
            final MutableState locationCode$delegate2 = gender$delegate3;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function02, ComposableLambdaKt.rememberComposableLambda(249006208, z2, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ProfileScreenKt.UserDataEditDialog$lambda$23(function1, saveUserDataState, introduction$delegate, gender$delegate5, birthday$delegate3, province$delegate3, city$delegate3, district$delegate, locationCode$delegate2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-362262850, z2, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ProfileScreenKt.UserDataEditDialog$lambda$24(function0, saveUserDataState, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$ProfileScreenKt.INSTANCE.m11535getLambda$973531908$app_debug(), ComposableLambdaKt.rememberComposableLambda(-1279166437, z2, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ProfileScreenKt.UserDataEditDialog$lambda$25(userDataState, saveUserDataState, introduction$delegate, gender$delegate5, birthday$delegate3, province$delegate3, city$delegate3, district$delegate, locationCode$delegate2, (Composer) obj2, ((Integer) obj3).intValue());
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ProfileScreenKt.UserDataEditDialog$lambda$26(userDataState, saveUserDataState, function0, function1, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final String UserDataEditDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String UserDataEditDialog$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String UserDataEditDialog$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String UserDataEditDialog$lambda$10(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String UserDataEditDialog$lambda$13(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String UserDataEditDialog$lambda$16(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String UserDataEditDialog$lambda$19(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$22$0(SaveUserDataState $saveUserDataState, Function0 $onDismiss) {
        if (!$saveUserDataState.isLoading()) {
            $onDismiss.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit UserDataEditDialog$lambda$25(com.yhchat.canarys.p007ui.profile.UserDataState r57, com.yhchat.canarys.p007ui.profile.SaveUserDataState r58, final androidx.compose.runtime.MutableState r59, final androidx.compose.runtime.MutableState r60, final androidx.compose.runtime.MutableState r61, final androidx.compose.runtime.MutableState r62, final androidx.compose.runtime.MutableState r63, final androidx.compose.runtime.MutableState r64, final androidx.compose.runtime.MutableState r65, androidx.compose.runtime.Composer r66, int r67) {
        /*
            Method dump skipped, instructions count: 1494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.UserDataEditDialog$lambda$25(com.yhchat.canarys.ui.profile.UserDataState, com.yhchat.canarys.ui.profile.SaveUserDataState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$25$0$1$0(MutableState $introduction$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $introduction$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$25$0$2$0(MutableState $gender$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $gender$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$25$0$3$0(MutableState $birthday$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $birthday$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$25$0$4$0(MutableState $province$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $province$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$25$0$5$0(MutableState $city$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $city$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$25$0$6$0(MutableState $district$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $district$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$25$0$7$0(MutableState $locationCode$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $locationCode$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$23(final Function1 $onSave, final SaveUserDataState $saveUserDataState, final MutableState $introduction$delegate, final MutableState $gender$delegate, final MutableState $birthday$delegate, final MutableState $province$delegate, final MutableState $city$delegate, final MutableState $district$delegate, final MutableState $locationCode$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C856@33346L482,869@33899L324,855@33312L911:ProfileScreen.kt#ahnxbw");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(249006208, $changed, -1, "com.yhchat.canarys.ui.profile.UserDataEditDialog.<anonymous> (ProfileScreen.kt:855)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1223200670, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = $composer.changed($onSave);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.UserDataEditDialog$lambda$23$0$0($onSave, $introduction$delegate, $gender$delegate, $birthday$delegate, $province$delegate, $city$delegate, $district$delegate, $locationCode$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.Button((Function0) objRememberedValue, null, !$saveUserDataState.isLoading(), null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(2009926288, true, new Function3() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda51
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ProfileScreenKt.UserDataEditDialog$lambda$23$1($saveUserDataState, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
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
    public static final Unit UserDataEditDialog$lambda$23$0$0(Function1 $onSave, MutableState $introduction$delegate, MutableState $gender$delegate, MutableState $birthday$delegate, MutableState $province$delegate, MutableState $city$delegate, MutableState $district$delegate, MutableState $locationCode$delegate) {
        String strUserDataEditDialog$lambda$1 = UserDataEditDialog$lambda$1($introduction$delegate);
        Integer intOrNull = StringsKt.toIntOrNull(UserDataEditDialog$lambda$4($gender$delegate));
        int iIntValue = intOrNull != null ? intOrNull.intValue() : 3;
        Long longOrNull = StringsKt.toLongOrNull(UserDataEditDialog$lambda$7($birthday$delegate));
        SaveUserDataRequest req = new SaveUserDataRequest(strUserDataEditDialog$lambda$1, iIntValue, longOrNull != null ? longOrNull.longValue() : 0L, UserDataEditDialog$lambda$10($province$delegate), UserDataEditDialog$lambda$13($city$delegate), UserDataEditDialog$lambda$16($district$delegate), UserDataEditDialog$lambda$19($locationCode$delegate));
        $onSave.invoke(req);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$23$1(SaveUserDataState $saveUserDataState, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C874@34145L64:ProfileScreen.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2009926288, $changed, -1, "com.yhchat.canarys.ui.profile.UserDataEditDialog.<anonymous>.<anonymous> (ProfileScreen.kt:870)");
            }
            if ($saveUserDataState.isLoading()) {
                $composer.startReplaceGroup(1575028384);
                ComposerKt.sourceInformation($composer, "871@33972L78,872@34071L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(1541343474);
            }
            $composer.endReplaceGroup();
            TextKt.m3359Text4IGK_g($saveUserDataState.isLoading() ? "\u4fdd\u5b58\u4e2d..." : "\u4fdd\u5b58", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UserDataEditDialog$lambda$24(Function0 $onDismiss, SaveUserDataState $saveUserDataState, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C878@34273L121:ProfileScreen.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-362262850, $changed, -1, "com.yhchat.canarys.ui.profile.UserDataEditDialog.<anonymous> (ProfileScreen.kt:878)");
            }
            ButtonKt.TextButton($onDismiss, null, true ^ $saveUserDataState.isLoading(), null, null, null, null, null, null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$277053921$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void ProfileInfoItemClickable(final ImageVector icon, final String label, final String value, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        ImageVector imageVector;
        String str;
        Function0<Unit> function02;
        final Modifier modifier2;
        Modifier.Companion modifier3;
        Function0 function03;
        Function0 function04;
        Function0 function05;
        Composer $composer2 = $composer.startRestartGroup(-273844446);
        ComposerKt.sourceInformation($composer2, "C(ProfileInfoItemClickable)N(icon,label,value,onClick,modifier)896@34617L1390,939@36113L11,937@36012L152:ProfileScreen.kt#ahnxbw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            imageVector = icon;
            $dirty |= $composer2.changed(imageVector) ? 4 : 2;
        } else {
            imageVector = icon;
        }
        if (($changed & 48) == 0) {
            str = label;
            $dirty |= $composer2.changed(str) ? 32 : 16;
        } else {
            str = label;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(value) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            function02 = function0;
            $dirty |= $composer2.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if ($composer2.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-273844446, $dirty, -1, "com.yhchat.canarys.ui.profile.ProfileInfoItemClickable (ProfileScreen.kt:895)");
            }
            Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), false, null, null, null, function02, 15, null), 0.0f, C1834Dp.m7806constructorimpl(12), 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, $composer2, ((432 >> 3) & 14) | ((432 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            int $dirty2 = $dirty;
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifier4 = modifier3;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM1052paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((432 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function03 = constructor;
                $composer2.createNode(function03);
            } else {
                function03 = constructor;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i5 = ((432 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 1296399213, "C904@34889L546,920@35444L557:ProfileScreen.kt#ahnxbw");
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier5 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifier5);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function04 = constructor2;
                $composer2.createNode(function04);
            } else {
                function04 = constructor2;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i6 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            int i8 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 278027241, "C911@35149L11,907@34977L205,913@35195L40,916@35322L10,917@35383L11,914@35248L177:ProfileScreen.kt#ahnxbw");
            IconKt.m2816Iconww6aTOc(imageVector, str, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary(), $composer2, ($dirty2 & 14) | 384 | ($dirty2 & 112), 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer2, 6);
            TextKt.m3359Text4IGK_g(label, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, ($dirty2 >> 3) & 14, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            Modifier modifier6 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy3 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically3, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer2, modifier6);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i9 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function05 = constructor3;
                $composer2.createNode(function05);
            } else {
                function05 = constructor3;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyRowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
            }
            Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            int i10 = (i9 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            int i11 = ((384 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, 1798312629, "C925@35606L10,923@35532L157,928@35702L39,933@35949L11,929@35754L237:ProfileScreen.kt#ahnxbw");
            TextKt.m3359Text4IGK_g(value, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, (($dirty2 >> 6) & 14) | ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer2, 6);
            IconKt.m2816Iconww6aTOc(ArrowForwardKt.getArrowForward(Icons.INSTANCE.getDefault()), "\u67e5\u770b\u8be6\u60c5", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), $composer2, 432, 0);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierM1054paddingqDBjuR0$default = PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32), 0.0f, 0.0f, 0.0f, 14, null);
            long outlineVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant();
            DividerKt.m2738HorizontalDivider9IZ8Weo(modifierM1054paddingqDBjuR0$default, 0.0f, Color.m5055copywmQWz5c(outlineVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(outlineVariant) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(outlineVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(outlineVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(outlineVariant) : 0.0f), $composer2, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda56
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileInfoItemClickable$lambda$1(icon, label, value, function0, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x03f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void ProfileInfoItem(final androidx.compose.p000ui.graphics.vector.ImageVector r76, final java.lang.String r77, final java.lang.String r78, androidx.compose.p000ui.Modifier r79, androidx.compose.runtime.Composer r80, final int r81, final int r82) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.ProfileInfoItem(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void ProfileSettingItem(final ImageVector icon, final String title, final String subtitle, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Function0<Unit> function02;
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        Composer $composer3 = $composer.startRestartGroup(-893003036);
        ComposerKt.sourceInformation($composer3, "C(ProfileSettingItem)N(icon,title,subtitle,onClick,modifier)994@37532L11,993@37477L110,996@37622L38,997@37667L1268,988@37319L1616:ProfileScreen.kt#ahnxbw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(icon) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(title) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(subtitle) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            function02 = function0;
            $dirty |= $composer3.changedInstance(function02) ? 2048 : 1024;
        } else {
            function02 = function0;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty |= 24576;
            modifier2 = modifier;
        } else if (($changed & 24576) == 0) {
            modifier2 = modifier;
            $dirty |= $composer3.changed(modifier2) ? 16384 : 8192;
        } else {
            modifier2 = modifier;
        }
        if (!$composer3.shouldExecute(($dirty & 9363) != 9362, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        } else {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-893003036, $dirty, -1, "com.yhchat.canarys.ui.profile.ProfileSettingItem (ProfileScreen.kt:987)");
            }
            Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(4), 1, null);
            Modifier modifier5 = modifier4;
            CardDefaults cardDefaults = CardDefaults.INSTANCE;
            long surfaceVariant = MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurfaceVariant();
            $composer2 = $composer3;
            CardKt.Card(function02, modifierM1052paddingVpY3zN4$default, false, null, cardDefaults.m2495cardColorsro_MJ88(Color.m5055copywmQWz5c(surfaceVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(surfaceVariant) : 0.3f, (14 & 2) != 0 ? Color.m5063getRedimpl(surfaceVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(surfaceVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(surfaceVariant) : 0.0f), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, null, ComposableLambdaKt.rememberComposableLambda(-1737127089, true, new Function3() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.ProfileSettingItem$lambda$0(icon, title, subtitle, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, (($dirty >> 9) & 14) | 100663296, ComposerKt.providerMapsKey);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileSettingItem$lambda$1(icon, title, subtitle, function0, modifier3, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ProfileSettingItem$lambda$0(androidx.compose.p000ui.graphics.vector.ImageVector r73, java.lang.String r74, java.lang.String r75, androidx.compose.foundation.layout.ColumnScope r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.ProfileSettingItem$lambda$0(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, java.lang.String, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final void ProfileInfoItemWithButton(final ImageVector icon, final String label, final String value, final String buttonText, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        ImageVector imageVector;
        String str;
        final Modifier modifier2;
        Modifier.Companion modifier3;
        Function0 function02;
        Composer $composer2 = $composer.startRestartGroup(-1741142375);
        ComposerKt.sourceInformation($composer2, "C(ProfileInfoItemWithButton)N(icon,label,value,buttonText,onButtonClick,modifier)1047@39148L1387:ProfileScreen.kt#ahnxbw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            imageVector = icon;
            $dirty |= $composer2.changed(imageVector) ? 4 : 2;
        } else {
            imageVector = icon;
        }
        if (($changed & 48) == 0) {
            str = label;
            $dirty |= $composer2.changed(str) ? 32 : 16;
        } else {
            str = label;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(value) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(buttonText) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        if ($composer2.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1741142375, $dirty, -1, "com.yhchat.canarys.ui.profile.ProfileInfoItemWithButton (ProfileScreen.kt:1046)");
            }
            Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(8), 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            int $dirty2 = $dirty;
            Modifier modifier4 = modifier3;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM1052paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i5 = ((384 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, -195703692, "C1057@39475L11,1053@39319L185,1060@39522L40,1062@39580L444,1080@40159L370,1077@40042L487:ProfileScreen.kt#ahnxbw");
            IconKt.m2816Iconww6aTOc(imageVector, str, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary(), $composer2, ($dirty2 & 14) | 384 | ($dirty2 & 112), 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer2, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierWeight$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i6 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i8 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1673296419, "C1067@39729L10,1068@39789L11,1065@39655L176,1072@39918L10,1073@39979L11,1070@39844L170:ProfileScreen.kt#ahnxbw");
            TextKt.m3359Text4IGK_g(label, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, ($dirty2 >> 3) & 14, 0, 65530);
            TextKt.m3359Text4IGK_g(value, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, ($dirty2 >> 6) & 14, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ButtonKt.OutlinedButton(function0, PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1357867011, true, new Function3() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.ProfileInfoItemWithButton$lambda$0$1(buttonText, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 12) & 14) | 805306416, 508);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileInfoItemWithButton$lambda$1(icon, label, value, buttonText, function0, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileInfoItemWithButton$lambda$0$1(String $buttonText, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C1081@40173L166,1086@40352L39,1089@40483L10,1087@40404L115:ProfileScreen.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1357867011, $changed, -1, "com.yhchat.canarys.ui.profile.ProfileInfoItemWithButton.<anonymous>.<anonymous> (ProfileScreen.kt:1081)");
            }
            IconKt.m2816Iconww6aTOc(EditKt.getEdit(Icons.INSTANCE.getDefault()), $buttonText, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, $composer, 384, 8);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(4)), $composer, 6);
            TextKt.m3359Text4IGK_g($buttonText, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelMedium(), $composer, 0, 0, 65534);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void ChangeInviteCodeDialog(final String currentInviteCode, final ChangeInviteCodeState changeInviteCodeState, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-1200758040);
        ComposerKt.sourceInformation($composer3, "C(ChangeInviteCodeDialog)N(currentInviteCode,changeInviteCodeState,onConfirm,onDismiss)1106@40815L46,1109@40936L145,1109@40888L193,1117@41131L53,1164@42921L810,1185@43757L188,1125@41403L1492,1116@41091L2860:ProfileScreen.kt#ahnxbw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(currentInviteCode) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(changeInviteCodeState) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        if (!$composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1200758040, $dirty, -1, "com.yhchat.canarys.ui.profile.ChangeInviteCodeDialog (ProfileScreen.kt:1105)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1417732534, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentInviteCode, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState newInviteCode$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Boolean boolValueOf = Boolean.valueOf(changeInviteCodeState.isSuccess());
            ComposerKt.sourceInformationMarkerStart($composer3, 1417736505, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean z = (($dirty & 112) == 32) | (($dirty & 7168) == 2048);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new ProfileScreenKt$ChangeInviteCodeDialog$1$1(changeInviteCodeState, function0, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, 0);
            ComposerKt.sourceInformationMarkerStart($composer3, 1417742653, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean z2 = (($dirty & 112) == 32) | (($dirty & 7168) == 2048);
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ChangeInviteCodeDialog$lambda$4$0(changeInviteCodeState, function0);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(796772144, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda45
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ProfileScreenKt.ChangeInviteCodeDialog$lambda$5(function1, changeInviteCodeState, newInviteCode$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-972699470, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ProfileScreenKt.ChangeInviteCodeDialog$lambda$6(function0, changeInviteCodeState, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$1552796212$app_debug(), ComposableLambdaKt.rememberComposableLambda(668060405, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ProfileScreenKt.ChangeInviteCodeDialog$lambda$7(changeInviteCodeState, newInviteCode$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ProfileScreenKt.ChangeInviteCodeDialog$lambda$8(currentInviteCode, changeInviteCodeState, function1, function0, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final String ChangeInviteCodeDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeInviteCodeDialog$lambda$4$0(ChangeInviteCodeState $changeInviteCodeState, Function0 $onDismiss) {
        if (!$changeInviteCodeState.isLoading()) {
            $onDismiss.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0334  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChangeInviteCodeDialog$lambda$7(com.yhchat.canarys.p007ui.profile.ChangeInviteCodeState r58, final androidx.compose.runtime.MutableState r59, androidx.compose.runtime.Composer r60, int r61) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.ChangeInviteCodeDialog$lambda$7(com.yhchat.canarys.ui.profile.ChangeInviteCodeState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeInviteCodeDialog$lambda$7$0$0$0(MutableState $newInviteCode$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $newInviteCode$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeInviteCodeDialog$lambda$5(final Function1 $onConfirm, final ChangeInviteCodeState $changeInviteCodeState, MutableState $newInviteCode$delegate, Composer $composer, int $changed) {
        final MutableState mutableState;
        ComposerKt.sourceInformation($composer, "C1166@42969L28,1168@43138L583,1165@42935L786:ProfileScreen.kt#ahnxbw");
        boolean z = false;
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(796772144, $changed, -1, "com.yhchat.canarys.ui.profile.ChangeInviteCodeDialog.<anonymous> (ProfileScreen.kt:1165)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1193853260, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = $composer.changed($onConfirm);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = $newInviteCode$delegate;
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ChangeInviteCodeDialog$lambda$5$0$0($onConfirm, mutableState);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                mutableState = $newInviteCode$delegate;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (!$changeInviteCodeState.isLoading() && !StringsKt.isBlank(ChangeInviteCodeDialog$lambda$1(mutableState)) && !$changeInviteCodeState.isSuccess()) {
                z = true;
            }
            ButtonKt.Button(function0, null, z, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-449280224, true, new Function3() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ProfileScreenKt.ChangeInviteCodeDialog$lambda$5$1($changeInviteCodeState, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
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
    public static final Unit ChangeInviteCodeDialog$lambda$5$0$0(Function1 $onConfirm, MutableState $newInviteCode$delegate) {
        $onConfirm.invoke(ChangeInviteCodeDialog$lambda$1($newInviteCode$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeInviteCodeDialog$lambda$5$1(ChangeInviteCodeState $changeInviteCodeState, RowScope Button, Composer $composer, int $changed) {
        String str;
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C1176@43458L249:ProfileScreen.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-449280224, $changed, -1, "com.yhchat.canarys.ui.profile.ChangeInviteCodeDialog.<anonymous>.<anonymous> (ProfileScreen.kt:1169)");
            }
            if ($changeInviteCodeState.isLoading()) {
                $composer.startReplaceGroup(-1388996598);
                ComposerKt.sourceInformation($composer, "1170@43215L148,1174@43384L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(-1431852734);
            }
            $composer.endReplaceGroup();
            if ($changeInviteCodeState.isLoading()) {
                str = "\u4fee\u6539\u4e2d...";
            } else {
                str = $changeInviteCodeState.isSuccess() ? "\u5df2\u4fee\u6539" : "\u786e\u5b9a";
            }
            TextKt.m3359Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeInviteCodeDialog$lambda$6(Function0 $onDismiss, ChangeInviteCodeState $changeInviteCodeState, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1186@43771L164:ProfileScreen.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-972699470, $changed, -1, "com.yhchat.canarys.ui.profile.ChangeInviteCodeDialog.<anonymous> (ProfileScreen.kt:1186)");
            }
            ButtonKt.TextButton($onDismiss, null, true ^ $changeInviteCodeState.isLoading(), null, null, null, null, null, null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$1666251247$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void ChangeNicknameDialog(final String currentNickname, final ChangeNicknameState changeNicknameState, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-719473192);
        ComposerKt.sourceInformation($composer3, "C(ChangeNicknameDialog)N(currentNickname,changeNicknameState,onConfirm,onDismiss)1207@44222L44,1210@44339L143,1210@44293L189,1218@44532L51,1265@46308L796,1286@47130L186,1226@44802L1480,1217@44492L2830:ProfileScreen.kt#ahnxbw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(currentNickname) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(changeNicknameState) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function1) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        if (!$composer3.shouldExecute(($dirty & 1171) != 1170, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-719473192, $dirty, -1, "com.yhchat.canarys.ui.profile.ChangeNicknameDialog (ProfileScreen.kt:1206)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 76003172, "CC(remember):ProfileScreen.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(currentNickname, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState newNickname$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Boolean boolValueOf = Boolean.valueOf(changeNicknameState.isSuccess());
            ComposerKt.sourceInformationMarkerStart($composer3, 76007015, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean z = (($dirty & 112) == 32) | (($dirty & 7168) == 2048);
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (z || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new ProfileScreenKt$ChangeNicknameDialog$1$1(changeNicknameState, function0, null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, 0);
            ComposerKt.sourceInformationMarkerStart($composer3, 76013099, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean z2 = (($dirty & 112) == 32) | (($dirty & 7168) == 2048);
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (z2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ChangeNicknameDialog$lambda$4$0(changeNicknameState, function0);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue3, ComposableLambdaKt.rememberComposableLambda(404422176, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ProfileScreenKt.ChangeNicknameDialog$lambda$5(function1, changeNicknameState, newNickname$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(1851003042, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ProfileScreenKt.ChangeNicknameDialog$lambda$6(function0, changeNicknameState, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$ProfileScreenKt.INSTANCE.m11536getLambda$997383388$app_debug(), ComposableLambdaKt.rememberComposableLambda(-274092955, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ProfileScreenKt.ChangeNicknameDialog$lambda$7(changeNicknameState, newNickname$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ProfileScreenKt.ChangeNicknameDialog$lambda$8(currentNickname, changeNicknameState, function1, function0, $changed, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final String ChangeNicknameDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeNicknameDialog$lambda$4$0(ChangeNicknameState $changeNicknameState, Function0 $onDismiss) {
        if (!$changeNicknameState.isLoading()) {
            $onDismiss.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0334  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChangeNicknameDialog$lambda$7(com.yhchat.canarys.p007ui.profile.ChangeNicknameState r58, final androidx.compose.runtime.MutableState r59, androidx.compose.runtime.Composer r60, int r61) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.ChangeNicknameDialog$lambda$7(com.yhchat.canarys.ui.profile.ChangeNicknameState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeNicknameDialog$lambda$7$0$0$0(MutableState $newNickname$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $newNickname$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeNicknameDialog$lambda$5(final Function1 $onConfirm, final ChangeNicknameState $changeNicknameState, MutableState $newNickname$delegate, Composer $composer, int $changed) {
        final MutableState mutableState;
        ComposerKt.sourceInformation($composer, "C1267@46356L26,1269@46517L577,1266@46322L772:ProfileScreen.kt#ahnxbw");
        boolean z = false;
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(404422176, $changed, -1, "com.yhchat.canarys.ui.profile.ChangeNicknameDialog.<anonymous> (ProfileScreen.kt:1266)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 2102656058, "CC(remember):ProfileScreen.kt#9igjgp");
            boolean zChanged = $composer.changed($onConfirm);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = $newNickname$delegate;
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda76
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileScreenKt.ChangeNicknameDialog$lambda$5$0$0($onConfirm, mutableState);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                mutableState = $newNickname$delegate;
            }
            Function0 function0 = (Function0) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            if (!$changeNicknameState.isLoading() && !StringsKt.isBlank(ChangeNicknameDialog$lambda$1(mutableState)) && !$changeNicknameState.isSuccess()) {
                z = true;
            }
            ButtonKt.Button(function0, null, z, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(898840080, true, new Function3() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda78
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ProfileScreenKt.ChangeNicknameDialog$lambda$5$1($changeNicknameState, (RowScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
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
    public static final Unit ChangeNicknameDialog$lambda$5$0$0(Function1 $onConfirm, MutableState $newNickname$delegate) {
        $onConfirm.invoke(ChangeNicknameDialog$lambda$1($newNickname$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeNicknameDialog$lambda$5$1(ChangeNicknameState $changeNicknameState, RowScope Button, Composer $composer, int $changed) {
        String str;
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C1277@46835L245:ProfileScreen.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(898840080, $changed, -1, "com.yhchat.canarys.ui.profile.ChangeNicknameDialog.<anonymous>.<anonymous> (ProfileScreen.kt:1270)");
            }
            if ($changeNicknameState.isLoading()) {
                $composer.startReplaceGroup(-1776207014);
                ComposerKt.sourceInformation($composer, "1271@46592L148,1275@46761L39");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), 0L, C1834Dp.m7806constructorimpl(2), 0L, 0, $composer, 390, 26);
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            } else {
                $composer.startReplaceGroup(-1822413134);
            }
            $composer.endReplaceGroup();
            if ($changeNicknameState.isLoading()) {
                str = "\u4fee\u6539\u4e2d...";
            } else {
                str = $changeNicknameState.isSuccess() ? "\u5df2\u4fee\u6539" : "\u786e\u5b9a";
            }
            TextKt.m3359Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChangeNicknameDialog$lambda$6(Function0 $onDismiss, ChangeNicknameState $changeNicknameState, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1287@47144L162:ProfileScreen.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1851003042, $changed, -1, "com.yhchat.canarys.ui.profile.ChangeNicknameDialog.<anonymous> (ProfileScreen.kt:1287)");
            }
            ButtonKt.TextButton($onDismiss, null, true ^ $changeNicknameState.isLoading(), null, null, null, null, null, null, ComposableSingletons$ProfileScreenKt.INSTANCE.m11525getLambda$1027905441$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void BetaInfoDialog(final BetaInfo betaInfo, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(1734288191);
        ComposerKt.sourceInformation($composer3, "C(BetaInfoDialog)N(betaInfo,onDismiss)1344@48940L126,1326@48220L694,1306@47512L1560:ProfileScreen.kt#ahnxbw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(betaInfo) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 32 : 16;
        }
        if (!$composer3.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1734288191, $dirty, -1, "com.yhchat.canarys.ui.profile.BetaInfoDialog (ProfileScreen.kt:1305)");
            }
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(-379781753, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.BetaInfoDialog$lambda$0(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, null, null, ComposableSingletons$ProfileScreenKt.INSTANCE.getLambda$471180171$app_debug(), ComposableLambdaKt.rememberComposableLambda(1757662476, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.BetaInfoDialog$lambda$1(betaInfo, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 3) & 14) | 1769520, 0, 16284);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.BetaInfoDialog$lambda$2(betaInfo, function0, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit BetaInfoDialog$lambda$1(com.yhchat.canarys.data.model.BetaInfo r51, androidx.compose.runtime.Composer r52, int r53) {
        /*
            Method dump skipped, instructions count: 547
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.BetaInfoDialog$lambda$1(com.yhchat.canarys.data.model.BetaInfo, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BetaInfoDialog$lambda$0(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1345@48954L102:ProfileScreen.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-379781753, $changed, -1, "com.yhchat.canarys.ui.profile.BetaInfoDialog.<anonymous> (ProfileScreen.kt:1345)");
            }
            ButtonKt.Button($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ProfileScreenKt.INSTANCE.m11526getLambda$1045548681$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final String formatPhoneNumber(String phone) {
        if (phone.length() == 11) {
            String strSubstring = phone.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = phone.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            return strSubstring + "****" + strSubstring2;
        }
        if (phone.length() > 7) {
            String start = phone.substring(0, 3);
            Intrinsics.checkNotNullExpressionValue(start, "substring(...)");
            String end = phone.substring(phone.length() - 4);
            Intrinsics.checkNotNullExpressionValue(end, "substring(...)");
            return start + "****" + end;
        }
        return phone;
    }

    private static final void ProfileInfoItemWithToggle(final ImageVector icon, final String label, final String value, final boolean isVisible, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        ImageVector imageVector;
        String str;
        final Modifier modifier2;
        Modifier.Companion modifier3;
        Function0 function02;
        Function0 function03;
        Composer $composer2 = $composer.startRestartGroup(-366723442);
        ComposerKt.sourceInformation($composer2, "C(ProfileInfoItemWithToggle)N(icon,label,value,isVisible,onToggleVisibility,modifier)1384@49766L1380,1428@51252L11,1426@51151L152:ProfileScreen.kt#ahnxbw");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            imageVector = icon;
            $dirty |= $composer2.changed(imageVector) ? 4 : 2;
        } else {
            imageVector = icon;
        }
        if (($changed & 48) == 0) {
            str = label;
            $dirty |= $composer2.changed(str) ? 32 : 16;
        } else {
            str = label;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(value) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(isVisible) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            modifier2 = modifier;
        } else if ((196608 & $changed) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        if ($composer2.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            if (i2 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-366723442, $dirty, -1, "com.yhchat.canarys.ui.profile.ProfileInfoItemWithToggle (ProfileScreen.kt:1383)");
            }
            Modifier modifierM1052paddingVpY3zN4$default = PaddingKt.m1052paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(8), 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            int $dirty2 = $dirty;
            CompositionLocalMap currentCompositionLocalMap = $composer2.getCurrentCompositionLocalMap();
            Modifier modifier4 = modifier3;
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer2, modifierM1052paddingVpY3zN4$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i3 = ((((384 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function02 = constructor;
                $composer2.createNode(function02);
            } else {
                function02 = constructor;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyRowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(iHashCode))) {
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(iHashCode));
                composerM4376constructorimpl.apply(Integer.valueOf(iHashCode), setCompositeKeyHash);
            }
            Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            int i4 = (i3 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            int i5 = ((384 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer2, 1191724862, "C1394@50093L11,1390@49937L185,1397@50140L40,1399@50198L489,1417@50813L327,1414@50705L435:ProfileScreen.kt#ahnxbw");
            IconKt.m2816Iconww6aTOc(imageVector, str, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getPrimary(), $composer2, ($dirty2 & 14) | 384 | ($dirty2 & 112), 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer2, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer2, modifierWeight$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i6 = ((((0 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer2.startReusableNode();
            if ($composer2.getInserting()) {
                function03 = constructor2;
                $composer2.createNode(function03);
            } else {
                function03 = constructor2;
                $composer2.useNode();
            }
            Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer2);
            Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
            }
            Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            int i7 = (i6 >> 6) & 14;
            ComposerKt.sourceInformationMarkerStart($composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i8 = ((0 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer2, -1663302713, "C1404@50347L10,1405@50407L11,1402@50273L176,1409@50581L10,1410@50642L11,1407@50462L215:ProfileScreen.kt#ahnxbw");
            TextKt.m3359Text4IGK_g(label, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodySmall(), $composer2, ($dirty2 >> 3) & 14, 0, 65530);
            TextKt.m3359Text4IGK_g(isVisible ? value : formatPhoneNumber(value), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            IconButtonKt.IconButton(function0, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(40)), false, null, null, ComposableLambdaKt.rememberComposableLambda(-1768863025, true, new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileInfoItemWithToggle$lambda$0$1(isVisible, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 12) & 14) | 196656, 28);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            $composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierM1054paddingqDBjuR0$default = PaddingKt.m1054paddingqDBjuR0$default(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32), 0.0f, 0.0f, 0.0f, 14, null);
            long outlineVariant = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutlineVariant();
            DividerKt.m2738HorizontalDivider9IZ8Weo(modifierM1054paddingqDBjuR0$default, 0.0f, Color.m5055copywmQWz5c(outlineVariant, (14 & 1) != 0 ? Color.m5059getAlphaimpl(outlineVariant) : 0.5f, (14 & 2) != 0 ? Color.m5063getRedimpl(outlineVariant) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(outlineVariant) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(outlineVariant) : 0.0f), $composer2, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.ProfileInfoItemWithToggle$lambda$1(icon, label, value, isVisible, function0, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileInfoItemWithToggle$lambda$0$1(boolean $isVisible, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1422@51097L11,1418@50827L303:ProfileScreen.kt#ahnxbw");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1768863025, $changed, -1, "com.yhchat.canarys.ui.profile.ProfileInfoItemWithToggle.<anonymous>.<anonymous> (ProfileScreen.kt:1418)");
            }
            Icons.Filled filled = Icons.INSTANCE.getDefault();
            IconKt.m2816Iconww6aTOc($isVisible ? VisibilityOffKt.getVisibilityOff(filled) : VisibilityKt.getVisibility(filled), $isVisible ? "\u9690\u85cf\u624b\u673a\u53f7" : "\u663e\u793a\u624b\u673a\u53f7", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(20)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void InviteCodeMenuBottomSheet(final String currentInviteCode, final ChangeInviteCodeState changeInviteCodeState, final ProfileViewModel viewModel, final Function0<Unit> function0, final Function0<Unit> function02, Composer $composer, final int $changed) {
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(1971914149);
        ComposerKt.sourceInformation($composer3, "C(InviteCodeMenuBottomSheet)N(currentInviteCode,changeInviteCodeState,viewModel,onDismiss,onShowChangeInviteCodeDialog)1444@51641L7,1445@51670L31,1450@51801L1170,1447@51707L1264:ProfileScreen.kt#ahnxbw");
        int $dirty = $changed;
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 16384 : 8192;
        }
        if (!$composer3.shouldExecute(($dirty & 9217) != 9216, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1971914149, $dirty, -1, "com.yhchat.canarys.ui.profile.InviteCodeMenuBottomSheet (ProfileScreen.kt:1443)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            SheetState sheetState = ModalBottomSheetKt.rememberModalBottomSheetState(false, null, $composer3, 0, 3);
            $composer2 = $composer3;
            ModalBottomSheetKt.m2908ModalBottomSheetdYc4hso(function0, null, sheetState, 0.0f, null, 0L, 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(608349224, true, new Function3() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda79
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ProfileScreenKt.InviteCodeMenuBottomSheet$lambda$0(function02, function0, context, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, ($dirty >> 9) & 14, 384, 4090);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.profile.ProfileScreenKt$$ExternalSyntheticLambda80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileScreenKt.InviteCodeMenuBottomSheet$lambda$1(currentInviteCode, changeInviteCodeState, viewModel, function0, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit InviteCodeMenuBottomSheet$lambda$0(final kotlin.jvm.functions.Function0 r55, final kotlin.jvm.functions.Function0 r56, final android.content.Context r57, androidx.compose.foundation.layout.ColumnScope r58, androidx.compose.runtime.Composer r59, int r60) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.InviteCodeMenuBottomSheet$lambda$0(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, android.content.Context, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteCodeMenuBottomSheet$lambda$0$0$0$0(Function0 $onShowChangeInviteCodeDialog, Function0 $onDismiss) {
        $onShowChangeInviteCodeDialog.invoke();
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InviteCodeMenuBottomSheet$lambda$0$0$1$0(Context $context, Function0 $onDismiss) {
        Intent intent = new Intent($context, (Class<?>) UserStatsActivity.class);
        $context.startActivity(intent);
        $onDismiss.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0288  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void InviteCodeMenuItem(final androidx.compose.p000ui.graphics.vector.ImageVector r50, final java.lang.String r51, final kotlin.jvm.functions.Function0<kotlin.Unit> r52, androidx.compose.p000ui.Modifier r53, androidx.compose.runtime.Composer r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 681
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileScreenKt.InviteCodeMenuItem(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }
}
