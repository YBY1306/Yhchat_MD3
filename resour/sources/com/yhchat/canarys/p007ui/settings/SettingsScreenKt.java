package com.yhchat.canarys.p007ui.settings;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;
import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.automirrored.filled.ExitToAppKt;
import androidx.compose.material.icons.filled.AccountCircleKt;
import androidx.compose.material.icons.filled.AppsKt;
import androidx.compose.material.icons.filled.BlockKt;
import androidx.compose.material.icons.filled.CloudOffKt;
import androidx.compose.material.icons.filled.CodeKt;
import androidx.compose.material.icons.filled.DashboardKt;
import androidx.compose.material.icons.filled.DataSaverOnKt;
import androidx.compose.material.icons.filled.DevicesKt;
import androidx.compose.material.icons.filled.EmojiEmotionsKt;
import androidx.compose.material.icons.filled.FormatSizeKt;
import androidx.compose.material.icons.filled.GraphicEqKt;
import androidx.compose.material.icons.filled.ImageKt;
import androidx.compose.material.icons.filled.InfoKt;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.LockKt;
import androidx.compose.material.icons.filled.MenuKt;
import androidx.compose.material.icons.filled.MicKt;
import androidx.compose.material.icons.filled.PaletteKt;
import androidx.compose.material.icons.filled.PushPinKt;
import androidx.compose.material.icons.filled.SendKt;
import androidx.compose.material.icons.filled.SwapHorizKt;
import androidx.compose.material.icons.filled.TextFieldsKt;
import androidx.compose.material.icons.filled.WallpaperKt;
import androidx.compose.material.icons.filled.WebKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.material3.TopAppBarScrollBehavior;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.input.nestedscroll.NestedScrollModifierKt;
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
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import com.yhchat.canarys.data.model.SavedAccount;
import com.yhchat.canarys.data.repository.AccountRepository;
import com.yhchat.canarys.data.repository.NavigationRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.background.ChatBackgroundActivity;
import com.yhchat.canarys.p007ui.blocklist.BlacklistActivity;
import com.yhchat.canarys.p007ui.login.LoginActivity;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SettingsScreen.kt */
@Metadata(m168d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a[\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a2\u0006\u0002\u0010\r\u001ai\u0010\u000e\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u0017H\u0003\u00a2\u0006\u0002\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010 \u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010!\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010\"\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010#\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010$\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010&\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010'\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a-\u0010(\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010*\u001a#\u0010+\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a2\u0006\u0002\u0010,\u001a\u001f\u0010-\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010.\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a\u001f\u0010/\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u001a<\u00100\u001a\u00020\u00012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00102\u0017\u00102\u001a\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0002\b30\u00122\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007\u00a2\u0006\u0002\u00104\u001a=\u00105\u001a\u00020\u00012\u0006\u00106\u001a\u0002072\u0006\u00101\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00102\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010:\u001a\u00020;H\u0007\u00a2\u0006\u0002\u0010<\u001aK\u0010=\u001a\u00020\u00012\u0006\u00106\u001a\u0002072\u0006\u00101\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u00102\u0006\u0010>\u001a\u00020;2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00010\u00172\b\b\u0002\u0010@\u001a\u00020;H\u0007\u00a2\u0006\u0002\u0010A\u001a2\u0010B\u001a\u00020\u00012\u0010\b\u0002\u00109\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0011\u0010C\u001a\r\u0012\u0004\u0012\u00020\u00010\t\u00a2\u0006\u0002\b3H\u0007\u00a2\u0006\u0002\u0010D\u001a\u0015\u0010E\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001cH\u0007\u00a2\u0006\u0002\u0010F\u001a\u001f\u0010G\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0003\u00a2\u0006\u0002\u0010\u001d\u00a8\u0006H\u00b2\u0006\n\u0010I\u001a\u00020\u0010X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u008a\u0084\u0002\u00b2\u0006\n\u0010K\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010L\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010M\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010N\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010O\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010P\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010Q\u001a\u00020\u0010X\u008a\u008e\u0002\u00b2\u0006\n\u0010R\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010S\u001a\u00020TX\u008a\u008e\u0002\u00b2\u0006\n\u0010U\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010V\u001a\u00020WX\u008a\u008e\u0002\u00b2\u0006\n\u0010X\u001a\u00020WX\u008a\u008e\u0002\u00b2\u0006\n\u0010R\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010Y\u001a\u00020\u0010X\u008a\u008e\u0002\u00b2\u0006\n\u0010Z\u001a\u00020\u0010X\u008a\u008e\u0002\u00b2\u0006\n\u0010[\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010\\\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010]\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010^\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010_\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010`\u001a\u00020aX\u008a\u008e\u0002\u00b2\u0006\n\u0010b\u001a\u00020\u0010X\u008a\u008e\u0002\u00b2\u0006\n\u0010c\u001a\u00020\u0010X\u008a\u008e\u0002\u00b2\u0006\n\u0010d\u001a\u00020WX\u008a\u008e\u0002\u00b2\u0006\n\u0010e\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010f\u001a\u00020;X\u008a\u008e\u0002\u00b2\u0006\n\u0010g\u001a\u00020;X\u008a\u008e\u0002"}, m169d2 = {"SettingsScreen", "", "navigationRepository", "Lcom/yhchat/canarys/data/repository/NavigationRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "accountRepository", "Lcom/yhchat/canarys/data/repository/AccountRepository;", "onLogout", "Lkotlin/Function0;", "onBackClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/yhchat/canarys/data/repository/NavigationRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/data/repository/AccountRepository;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AccountSwitchBottomSheet", "currentUserId", "", "accounts", "", "Lcom/yhchat/canarys/data/model/SavedAccount;", "onDismiss", "onAddAccount", "onDeleteAccount", "Lkotlin/Function1;", "onSwitchAccount", "(Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DisplaySettingsGroup", "context", "Landroid/content/Context;", "(Landroid/content/Context;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ThemeSettingsGroup", "LongPressSendMarkdownSettingItem", "WebSocketSettingItem", "FontSizeSettingItem", "GlobalScaleSettingItem", "MemoryAutoCleanSettingItem", "DataSaverSettingItem", "BotBoardSettingItem", "MenuButtonsSettingItem", "PersonalizationSettingsGroup", "ThemeColorSettingItem", "onColorPickerClick", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ColorPickerDialog", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "WebPQualitySettingItem", "HtmlRawTextSettingItem", "MarkdownRawTextSettingItem", "SettingsGroup", "title", "items", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;Ljava/util/List;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SettingsItemCell", "icon", "Landroidx/compose/ui/graphics/vector/ImageVector;", "subtitle", "onClick", "isDestructive", "", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "SettingsSwitchItem", "checked", "onCheckedChange", "isError", "(Landroidx/compose/ui/graphics/vector/ImageVector;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;II)V", "SettingsCustomItem", "content", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ThemeSettingItem", "(Landroid/content/Context;Landroidx/compose/runtime/Composer;I)V", "FloatingAudioButtonSettingItem", "app_debug", "userEmail", "savedAccounts", "showAccountSwitchSheet", "showLogoutDialog", "showStickyConversations", "showInlineExpressions", "autoDismissExpressionPicker", "showThemeDialog", "themeMode", "enabled", "seconds", "", "disableWebSocket", "fontScale", "", "scale", "thresholdValueText", "unit", "unitExpanded", "dataSaver", "showBotBoard", "showMenuButtons", "showColorPickerDialog", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "colorInput", "errorMessage", "webpQuality", "showHtmlRawText", "showMarkdownRawText", "showFloatingAudioButton"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class SettingsScreenKt {
    public static final Unit AccountSwitchBottomSheet$lambda$1(String str, List list, Function0 function0, Function0 function02, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        AccountSwitchBottomSheet(str, list, function0, function02, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit BotBoardSettingItem$lambda$5(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BotBoardSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ColorPickerDialog$lambda$13(Context context, Function0 function0, int i, Composer composer, int i2) {
        ColorPickerDialog(context, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit DataSaverSettingItem$lambda$5(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DataSaverSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$25(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DisplaySettingsGroup(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit FloatingAudioButtonSettingItem$lambda$5(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FloatingAudioButtonSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit FontSizeSettingItem$lambda$5(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FontSizeSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit GlobalScaleSettingItem$lambda$5(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        GlobalScaleSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit HtmlRawTextSettingItem$lambda$5(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        HtmlRawTextSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit LongPressSendMarkdownSettingItem$lambda$8(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LongPressSendMarkdownSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit MarkdownRawTextSettingItem$lambda$5(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarkdownRawTextSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit MemoryAutoCleanSettingItem$lambda$14(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MemoryAutoCleanSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit MenuButtonsSettingItem$lambda$5(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MenuButtonsSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit PersonalizationSettingsGroup$lambda$6(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PersonalizationSettingsGroup(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsCustomItem$lambda$2(Function0 function0, Function2 function2, int i, int i2, Composer composer, int i3) {
        SettingsCustomItem(function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsGroup$lambda$0(String str, List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SettingsGroup(str, list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsGroup$lambda$2(String str, List list, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SettingsGroup(str, list, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsItemCell$lambda$1(ImageVector imageVector, String str, String str2, Function0 function0, boolean z, int i, int i2, Composer composer, int i3) {
        SettingsItemCell(imageVector, str, str2, function0, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$22(NavigationRepository navigationRepository, TokenRepository tokenRepository, AccountRepository accountRepository, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SettingsScreen(navigationRepository, tokenRepository, accountRepository, function0, function02, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsSwitchItem$lambda$2(ImageVector imageVector, String str, String str2, boolean z, Function1 function1, boolean z2, int i, int i2, Composer composer, int i3) {
        SettingsSwitchItem(imageVector, str, str2, z, function1, z2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ThemeColorSettingItem$lambda$2(Context context, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ThemeColorSettingItem(context, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit ThemeSettingItem$lambda$0(Context context, int i, Composer composer, int i2) {
        ThemeSettingItem(context, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final Unit ThemeSettingsGroup$lambda$12(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ThemeSettingsGroup(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit WebPQualitySettingItem$lambda$5(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WebPQualitySettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final Unit WebSocketSettingItem$lambda$5(Context context, Modifier modifier, int i, int i2, Composer composer, int i3) {
        WebSocketSettingItem(context, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void SettingsScreen(NavigationRepository navigationRepository, TokenRepository tokenRepository, AccountRepository accountRepository, Function0<Unit> function0, Function0<Unit> function02, Modifier modifier, Composer $composer, final int $changed, final int i) {
        NavigationRepository navigationRepository2;
        TokenRepository tokenRepository2;
        AccountRepository accountRepository2;
        Function0 function03;
        Function0 function04;
        Modifier.Companion modifier2;
        final NavigationRepository navigationRepository3;
        final TokenRepository tokenRepository3;
        final Function0 onLogout;
        final Function0 onLogout2;
        final Modifier modifier3;
        final AccountRepository accountRepository3;
        final Function0 onLogout3;
        final Function0 onBackClick;
        Flow<List<SavedAccount>> flowFlowOf;
        final TokenRepository tokenRepository4;
        final MutableState userEmail$delegate;
        int i2;
        AccountRepository accountRepository4;
        final MutableState showLogoutDialog$delegate;
        Object obj;
        Composer $composer2 = $composer.startRestartGroup(270960403);
        ComposerKt.sourceInformation($composer2, "C(SettingsScreen)N(navigationRepository,tokenRepository,accountRepository,onLogout,onBackClick,modifier)55@2268L2,56@2302L2,59@2375L7,60@2408L24,63@2469L31,66@2641L55,68@2802L34,70@2874L380,70@2842L412,80@3288L34,81@3366L34,85@3554L11,109@4508L11,86@3601L862,110@4526L6313,83@3410L7429:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        int i3 = i & 1;
        if (i3 != 0) {
            $dirty |= 6;
            navigationRepository2 = navigationRepository;
        } else if (($changed & 6) == 0) {
            navigationRepository2 = navigationRepository;
            $dirty |= $composer2.changedInstance(navigationRepository2) ? 4 : 2;
        } else {
            navigationRepository2 = navigationRepository;
        }
        int i4 = i & 2;
        if (i4 != 0) {
            $dirty |= 48;
            tokenRepository2 = tokenRepository;
        } else if (($changed & 48) == 0) {
            tokenRepository2 = tokenRepository;
            $dirty |= $composer2.changedInstance(tokenRepository2) ? 32 : 16;
        } else {
            tokenRepository2 = tokenRepository;
        }
        int i5 = i & 4;
        if (i5 != 0) {
            $dirty |= 384;
            accountRepository2 = accountRepository;
        } else if (($changed & 384) == 0) {
            accountRepository2 = accountRepository;
            $dirty |= $composer2.changedInstance(accountRepository2) ? 256 : 128;
        } else {
            accountRepository2 = accountRepository;
        }
        int i6 = i & 8;
        if (i6 != 0) {
            $dirty |= 3072;
            function03 = function0;
        } else if (($changed & 3072) == 0) {
            function03 = function0;
            $dirty |= $composer2.changedInstance(function03) ? 2048 : 1024;
        } else {
            function03 = function0;
        }
        int i7 = i & 16;
        if (i7 != 0) {
            $dirty |= 24576;
            function04 = function02;
        } else if (($changed & 24576) == 0) {
            function04 = function02;
            $dirty |= $composer2.changedInstance(function04) ? 16384 : 8192;
        } else {
            function04 = function02;
        }
        int i8 = i & 32;
        if (i8 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            modifier2 = modifier;
        } else if (($changed & ProfileVerifier.CompilationStatus.f207xf2722a21) == 0) {
            modifier2 = modifier;
            $dirty |= $composer2.changed(modifier2) ? 131072 : 65536;
        } else {
            modifier2 = modifier;
        }
        if ($composer2.shouldExecute(($dirty & 74899) != 74898, $dirty & 1)) {
            final NavigationRepository navigationRepository4 = i3 != 0 ? null : navigationRepository2;
            TokenRepository tokenRepository5 = i4 != 0 ? null : tokenRepository2;
            AccountRepository accountRepository5 = i5 != 0 ? null : accountRepository2;
            if (i6 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer2, -1600051403, "CC(remember):SettingsScreen.kt#9igjgp");
                Object objRememberedValue = $composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer2.updateRememberedValue(obj2);
                    objRememberedValue = obj2;
                }
                onLogout3 = (Function0) objRememberedValue;
                ComposerKt.sourceInformationMarkerEnd($composer2);
            } else {
                onLogout3 = function03;
            }
            if (i7 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer2, -1600050315, "CC(remember):SettingsScreen.kt#9igjgp");
                Object objRememberedValue2 = $composer2.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda47
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    $composer2.updateRememberedValue(obj3);
                    objRememberedValue2 = obj3;
                }
                onBackClick = (Function0) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer2);
            } else {
                onBackClick = function04;
            }
            if (i8 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(270960403, $dirty, -1, "com.yhchat.canarys.ui.settings.SettingsScreen (SettingsScreen.kt:58)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart($composer2, 683737348, "CC(remember):Effects.kt#9igjgp");
            int $dirty2 = $dirty;
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, $composer2);
                $composer2.updateRememberedValue(objRememberedValue3);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1600044942, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue4 = objMutableStateOf$default;
            }
            MutableState userEmail$delegate2 = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            if (accountRepository5 == null || (flowFlowOf = accountRepository5.getAllAccounts()) == null) {
                flowFlowOf = FlowKt.flowOf(CollectionsKt.emptyList());
            }
            final AccountRepository accountRepository6 = accountRepository5;
            final State savedAccounts$delegate = FlowExtKt.collectAsStateWithLifecycle(flowFlowOf, CollectionsKt.emptyList(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, $composer2, 48, 14);
            String currentUserId = accountRepository6 != null ? accountRepository6.getCurrentUserId() : null;
            ComposerKt.sourceInformationMarkerStart($composer2, -1600034283, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue5 = objMutableStateOf$default2;
            }
            final MutableState showAccountSwitchSheet$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1600031633, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(tokenRepository5) | $composer2.changedInstance(context);
            Object objRememberedValue6 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                Object obj4 = (Function2) new SettingsScreenKt$SettingsScreen$3$1(tokenRepository5, context, userEmail$delegate2, null);
                $composer2.updateRememberedValue(obj4);
                objRememberedValue6 = obj4;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            EffectsKt.LaunchedEffect(tokenRepository5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, $composer2, ($dirty2 >> 3) & 14);
            ComposerKt.sourceInformationMarkerStart($composer2, -1600018731, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue7 = $composer2.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                tokenRepository4 = tokenRepository5;
                userEmail$delegate = userEmail$delegate2;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue7 = objMutableStateOf$default3;
            } else {
                tokenRepository4 = tokenRepository5;
                userEmail$delegate = userEmail$delegate2;
            }
            final MutableState showLogoutDialog$delegate2 = (MutableState) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final TopAppBarScrollBehavior scrollBehavior = TopAppBarDefaults.INSTANCE.exitUntilCollapsedScrollBehavior(null, null, null, null, $composer2, TopAppBarDefaults.$stable << 12, 15);
            NavigationRepository navigationRepository5 = navigationRepository4;
            TokenRepository tokenRepository6 = tokenRepository4;
            Modifier modifier4 = modifier2;
            ScaffoldKt.m3074ScaffoldTvnljyQ(NestedScrollModifierKt.nestedScroll$default(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), scrollBehavior.getNestedScrollConnection(), null, 2, null), ComposableLambdaKt.rememberComposableLambda(1614072279, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda48
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj5, Object obj6) {
                    return SettingsScreenKt.SettingsScreen$lambda$13(scrollBehavior, onBackClick, (Composer) obj5, ((Integer) obj6).intValue());
                }
            }, $composer2, 54), null, null, null, 0, MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getSurfaceContainer(), 0L, WindowInsets_androidKt.getSafeDrawing(WindowInsets.INSTANCE, $composer2, 6), ComposableLambdaKt.rememberComposableLambda(-2026021086, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    return SettingsScreenKt.SettingsScreen$lambda$14(navigationRepository4, context, tokenRepository4, savedAccounts$delegate, showAccountSwitchSheet$delegate, userEmail$delegate, showLogoutDialog$delegate2, (PaddingValues) obj5, (Composer) obj6, ((Integer) obj7).intValue());
                }
            }, $composer2, 54), $composer2, 805306416, 188);
            $composer2 = $composer2;
            if (SettingsScreen$lambda$11(showLogoutDialog$delegate2)) {
                $composer2.startReplaceGroup(1946587793);
                ComposerKt.sourceInformation($composer2, "285@10938L28,296@11238L291,306@11559L171,284@10894L846");
                ComposerKt.sourceInformationMarkerStart($composer2, -1599773937, "CC(remember):SettingsScreen.kt#9igjgp");
                Object objRememberedValue8 = $composer2.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    showLogoutDialog$delegate = showLogoutDialog$delegate2;
                    obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda50
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SettingsScreenKt.SettingsScreen$lambda$15$0(showLogoutDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                } else {
                    showLogoutDialog$delegate = showLogoutDialog$delegate2;
                    obj = objRememberedValue8;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                i2 = 1935763151;
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) obj, ComposableLambdaKt.rememberComposableLambda(173031462, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda51
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        return SettingsScreenKt.SettingsScreen$lambda$16(onLogout3, showLogoutDialog$delegate, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                }, $composer2, 54), null, ComposableLambdaKt.rememberComposableLambda(99446884, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda53
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        return SettingsScreenKt.SettingsScreen$lambda$17(showLogoutDialog$delegate, (Composer) obj5, ((Integer) obj6).intValue());
                    }
                }, $composer2, 54), null, ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$25862306$app_debug(), ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$2136553665$app_debug(), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1772598, 0, 16276);
                $composer2 = $composer2;
            } else {
                i2 = 1935763151;
                $composer2.startReplaceGroup(1935763151);
            }
            $composer2.endReplaceGroup();
            if (SettingsScreen$lambda$7(showAccountSwitchSheet$delegate)) {
                $composer2.startReplaceGroup(1947488684);
                ComposerKt.sourceInformation($composer2, "320@11921L34,321@11984L107,325@12123L144,330@12299L716,317@11790L1235");
                List<SavedAccount> listSettingsScreen$lambda$5 = SettingsScreen$lambda$5(savedAccounts$delegate);
                ComposerKt.sourceInformationMarkerStart($composer2, -1599742475, "CC(remember):SettingsScreen.kt#9igjgp");
                Composer composer = $composer2;
                Object objRememberedValue9 = composer.rememberedValue();
                if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda54
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SettingsScreenKt.SettingsScreen$lambda$18$0(showAccountSwitchSheet$delegate);
                        }
                    };
                    composer.updateRememberedValue(obj5);
                    objRememberedValue9 = obj5;
                }
                Function0 function05 = (Function0) objRememberedValue9;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1599740386, "CC(remember):SettingsScreen.kt#9igjgp");
                boolean zChangedInstance2 = $composer2.changedInstance(context);
                Composer composer2 = $composer2;
                Object objRememberedValue10 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    Object obj6 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda55
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SettingsScreenKt.SettingsScreen$lambda$19$0(context, showAccountSwitchSheet$delegate);
                        }
                    };
                    composer2.updateRememberedValue(obj6);
                    objRememberedValue10 = obj6;
                }
                Function0 function06 = (Function0) objRememberedValue10;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1599735901, "CC(remember):SettingsScreen.kt#9igjgp");
                boolean zChangedInstance3 = $composer2.changedInstance(coroutineScope) | $composer2.changedInstance(accountRepository6);
                Composer composer3 = $composer2;
                Object objRememberedValue11 = composer3.rememberedValue();
                if (zChangedInstance3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    Object obj7 = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda56
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            return SettingsScreenKt.SettingsScreen$lambda$20$0(coroutineScope, accountRepository6, (String) obj8);
                        }
                    };
                    composer3.updateRememberedValue(obj7);
                    objRememberedValue11 = obj7;
                }
                Function1 function1 = (Function1) objRememberedValue11;
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ComposerKt.sourceInformationMarkerStart($composer2, -1599729697, "CC(remember):SettingsScreen.kt#9igjgp");
                boolean zChangedInstance4 = $composer2.changedInstance(accountRepository6) | $composer2.changedInstance(context);
                Composer composer4 = $composer2;
                Object objRememberedValue12 = composer4.rememberedValue();
                if (zChangedInstance4 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                    Object obj8 = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda44
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj9) {
                            return SettingsScreenKt.SettingsScreen$lambda$21$0(accountRepository6, context, showAccountSwitchSheet$delegate, (String) obj9);
                        }
                    };
                    composer4.updateRememberedValue(obj8);
                    objRememberedValue12 = obj8;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                Composer $composer3 = $composer2;
                accountRepository4 = accountRepository6;
                AccountSwitchBottomSheet(currentUserId, listSettingsScreen$lambda$5, function05, function06, function1, (Function1) objRememberedValue12, $composer3, 384);
                $composer2 = $composer3;
            } else {
                accountRepository4 = accountRepository6;
                $composer2.startReplaceGroup(i2);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            accountRepository3 = accountRepository4;
            onLogout = onLogout3;
            onLogout2 = onBackClick;
            tokenRepository3 = tokenRepository6;
            navigationRepository3 = navigationRepository5;
            modifier3 = modifier4;
        } else {
            $composer2.skipToGroupEnd();
            navigationRepository3 = navigationRepository2;
            tokenRepository3 = tokenRepository2;
            onLogout = function03;
            onLogout2 = function04;
            modifier3 = modifier2;
            accountRepository3 = accountRepository2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj9, Object obj10) {
                    return SettingsScreenKt.SettingsScreen$lambda$22(navigationRepository3, tokenRepository3, accountRepository3, onLogout, onLogout2, modifier3, $changed, i, (Composer) obj9, ((Integer) obj10).intValue());
                }
            });
        }
    }

    private static final String SettingsScreen$lambda$3(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<SavedAccount> SettingsScreen$lambda$5(State<? extends List<SavedAccount>> state) {
        return (List) state.getValue();
    }

    private static final boolean SettingsScreen$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SettingsScreen$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean SettingsScreen$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SettingsScreen$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit SettingsScreen$lambda$13(TopAppBarScrollBehavior $scrollBehavior, final Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C94@3851L286,103@4255L11,104@4344L11,102@4182L208,87@3615L838:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1614072279, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous> (SettingsScreen.kt:87)");
            }
            AppBarKt.m2436LargeTopAppBaroKE7A98(ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1084879184$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-103913390, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda83
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$13$0($onBackClick, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, 0.0f, 0.0f, null, TopAppBarDefaults.INSTANCE.m3528largeTopAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainer(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getSurfaceContainer(), 0L, 0L, 0L, $composer, TopAppBarDefaults.$stable << 15, 28), $scrollBehavior, $composer, 390, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$13$0(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C95@3873L246:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-103913390, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous> (SettingsScreen.kt:95)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1359508463$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14(final NavigationRepository $navigationRepository, final Context $context, final TokenRepository $tokenRepository, final State $savedAccounts$delegate, final MutableState $showAccountSwitchSheet$delegate, final MutableState $userEmail$delegate, final MutableState $showLogoutDialog$delegate, PaddingValues innerPadding, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(innerPadding, "innerPadding");
        ComposerKt.sourceInformation($composer, "CN(innerPadding)118@4817L6016,112@4569L6264:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(innerPadding) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2026021086, $dirty2, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous> (SettingsScreen.kt:112)");
            }
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), innerPadding);
            PaddingValues paddingValuesM1045PaddingValuesYgX7TsA$default = PaddingKt.m1045PaddingValuesYgX7TsA$default(0.0f, C1834Dp.m7806constructorimpl(16), 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(0));
            ComposerKt.sourceInformationMarkerStart($composer, -1386063230, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($navigationRepository) | $composer.changedInstance($context) | $composer.changedInstance($tokenRepository) | $composer.changed($savedAccounts$delegate);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda130
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.SettingsScreen$lambda$14$0$0($navigationRepository, $context, $tokenRepository, $savedAccounts$delegate, $showAccountSwitchSheet$delegate, $userEmail$delegate, $showLogoutDialog$delegate, (LazyListScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(modifierPadding, null, paddingValuesM1045PaddingValuesYgX7TsA$default, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24960, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0(final NavigationRepository $navigationRepository, final Context $context, final TokenRepository $tokenRepository, final State $savedAccounts$delegate, final MutableState $showAccountSwitchSheet$delegate, final MutableState $userEmail$delegate, final MutableState $showLogoutDialog$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-273054803, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda105
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsScreen$lambda$14$0$0$0($navigationRepository, $context, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-322889066, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda106
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsScreen$lambda$14$0$0$1($tokenRepository, $context, $savedAccounts$delegate, $showAccountSwitchSheet$delegate, $userEmail$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(547932533, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda108
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsScreen$lambda$14$0$0$2($context, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(1418754132, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda109
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsScreen$lambda$14$0$0$3($context, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-2005391565, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda110
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsScreen$lambda$14$0$0$4($context, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1134569966, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda111
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsScreen$lambda$14$0$0$5($context, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-263748367, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda112
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsScreen$lambda$14$0$0$6($context, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(607073232, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda113
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return SettingsScreenKt.SettingsScreen$lambda$14$0$0$7($showLogoutDialog$delegate, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1477894831$app_debug(), 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$0(final NavigationRepository $navigationRepository, final Context $context, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C124@4986L537,121@4877L686:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-273054803, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:121)");
            }
            SettingsGroup("\u754c\u9762", CollectionsKt.listOf(ComposableLambdaKt.rememberComposableLambda(-543649828, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda101
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$14$0$0$0$0($navigationRepository, $context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54)), null, $composer, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$0$0(final NavigationRepository $navigationRepository, final Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C129@5244L223,125@5016L481:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-543649828, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:125)");
            }
            ImageVector menu = MenuKt.getMenu(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, 1538533883, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($navigationRepository) | $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda64
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$14$0$0$0$0$0$0($navigationRepository, $context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(menu, "\u5e95\u90e8\u5bfc\u822a\u680f\u8bbe\u7f6e", "\u81ea\u5b9a\u4e49\u5bfc\u822a\u680f\u663e\u793a\u548c\u6392\u5e8f", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$0$0$0$0(NavigationRepository $navigationRepository, Context $context) {
        if ($navigationRepository != null) {
            NavigationSettingsActivity.INSTANCE.start($context, $navigationRepository);
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$1(final TokenRepository $tokenRepository, final Context $context, final State $savedAccounts$delegate, final MutableState $showAccountSwitchSheet$delegate, final MutableState $userEmail$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C145@5755L545,157@6326L435,167@6787L575,179@7388L445,142@5646L2227:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-322889066, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:142)");
            }
            SettingsGroup("\u8d26\u6237", CollectionsKt.listOf((Object[]) new Function2[]{ComposableLambdaKt.rememberComposableLambda(58268382, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda36
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$14$0$0$1$0($tokenRepository, $context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-1873688899, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda37
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$14$0$0$1$1($savedAccounts$delegate, $showAccountSwitchSheet$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(489321116, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$14$0$0$1$2($context, $userEmail$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-1442636165, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda39
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$14$0$0$1$3($context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54)}), null, $composer, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$1$0(final TokenRepository $tokenRepository, final Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C150@6011L233,146@5785L489:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(58268382, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:146)");
            }
            ImageVector devices = DevicesKt.getDevices(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, 161348679, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($tokenRepository) | $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$14$0$0$1$0$0$0($tokenRepository, $context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(devices, "\u5728\u7ebf\u8bbe\u5907", "\u67e5\u770b\u5f53\u524d\u767b\u5f55\u7684\u8bbe\u5907", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$1$0$0$0(TokenRepository $tokenRepository, Context $context) {
        if ($tokenRepository != null) {
            OnlineDevicesActivity.INSTANCE.start($context, $tokenRepository);
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$1$1(State $savedAccounts$delegate, final MutableState $showAccountSwitchSheet$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C162@6604L101,158@6356L379:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1873688899, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:158)");
            }
            ImageVector swapHoriz = SwapHorizKt.getSwapHoriz(Icons.INSTANCE.getDefault());
            String str = "\u5df2\u6dfb\u52a0 " + SettingsScreen$lambda$5($savedAccounts$delegate).size() + " \u4e2a\u8d26\u53f7";
            ComposerKt.sourceInformationMarkerStart($composer, -1023725918, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$14$0$0$1$1$0$0($showAccountSwitchSheet$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(swapHoriz, "\u5207\u6362\u8d26\u53f7", str, (Function0) objRememberedValue, false, $composer, 3120, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$1$1$0$0(MutableState $showAccountSwitchSheet$delegate) {
        SettingsScreen$lambda$8($showAccountSwitchSheet$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$1$2(final Context $context, final MutableState $userEmail$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C172@7039L267,168@6817L519:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(489321116, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:168)");
            }
            ImageVector lock = LockKt.getLock(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, 2086165543, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda134
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$14$0$0$1$2$0$0($context, $userEmail$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(lock, "\u4fee\u6539\u5bc6\u7801", "\u66f4\u6539\u8d26\u6237\u767b\u5f55\u5bc6\u7801", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$1$2$0$0(Context $context, MutableState $userEmail$delegate) {
        Intent intent = ChangePasswordActivity.INSTANCE.createIntent($context, SettingsScreen$lambda$3($userEmail$delegate));
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$1$3(final Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C184@7641L136,180@7418L389:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1442636165, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:180)");
            }
            ImageVector block = BlockKt.getBlock(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, 901090275, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda102
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$14$0$0$1$3$0$0($context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(block, "\u9ed1\u540d\u5355", "\u7ba1\u7406\u5c4f\u853d\u7684\u7528\u6237\u5217\u8868", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$1$3$0$0(Context $context) {
        BlacklistActivity.INSTANCE.start($context);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$2(final Context $context, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C198@8065L416,208@8507L443,195@7956L1034:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(547932533, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:195)");
            }
            SettingsGroup("\u5185\u5bb9", CollectionsKt.listOf((Object[]) new Function2[]{ComposableLambdaKt.rememberComposableLambda(929089981, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda103
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$14$0$0$2$0($context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(-1002867300, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda104
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$14$0$0$2$1($context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54)}), null, $composer, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$2$0(final Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C203@8318L107,199@8095L360:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(929089981, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:199)");
            }
            ImageVector web = WebKt.getWeb(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, -497717624, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda131
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$14$0$0$2$0$0$0($context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(web, "HTML\u8bbe\u7f6e", "\u7f51\u9875\u5185\u5bb9\u663e\u793a\u8bbe\u7f6e", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$2$0$0$0(Context $context) {
        HtmlSettingsActivity.INSTANCE.start($context);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$2$1(final Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C213@8788L106,209@8537L387:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1002867300, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:209)");
            }
            ImageVector graphicEq = GraphicEqKt.getGraphicEq(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, -1682791898, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$14$0$0$2$1$0$0($context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(graphicEq, "\u5df2\u4fdd\u5b58\u7684\u8bed\u97f3", "\u7ba1\u7406 Download/yhchat/audio/ \u4e0b\u7684\u8bed\u97f3", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$2$1$0$0(Context $context) {
        SavedAudiosActivity.INSTANCE.start($context);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$3(Context $context, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C224@9073L39:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1418754132, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:224)");
            }
            DisplaySettingsGroup($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$4(Context $context, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C229@9183L37:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2005391565, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:229)");
            }
            ThemeSettingsGroup($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$5(Context $context, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C234@9304L47:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1134569966, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:234)");
            }
            PersonalizationSettingsGroup($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$6(final Context $context, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C242@9543L414,239@9434L563:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-263748367, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:239)");
            }
            SettingsGroup("\u5173\u4e8e", CollectionsKt.listOf(ComposableLambdaKt.rememberComposableLambda(1687437664, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda69
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$14$0$0$6$0($context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54)), null, $composer, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$6$0(final Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C247@9799L102,243@9573L358:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1687437664, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:243)");
            }
            ImageVector info = InfoKt.getInfo(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, -1870034490, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$14$0$0$6$0$0$0($context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(info, "\u5e94\u7528\u8be6\u60c5", "\u67e5\u770b\u5e94\u7528\u7248\u672c\u548c\u5f00\u53d1\u8005\u4fe1\u606f", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$6$0$0$0(Context $context) {
        AppInfoActivity.INSTANCE.start($context);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$7(final MutableState $showLogoutDialog$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C261@10191L474,258@10080L625:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(607073232, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:258)");
            }
            SettingsGroup("\u8d26\u6237\u7ba1\u7406", CollectionsKt.listOf(ComposableLambdaKt.rememberComposableLambda(-1736708033, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda63
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsScreen$lambda$14$0$0$7$0($showLogoutDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54)), null, $composer, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$7$0(final MutableState $showLogoutDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C266@10460L95,262@10221L418:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1736708033, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:262)");
            }
            ImageVector exitToApp = ExitToAppKt.getExitToApp(Icons.AutoMirrored.Filled.INSTANCE);
            ComposerKt.sourceInformationMarkerStart($composer, 1765867134, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda126
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$14$0$0$7$0$0$0($showLogoutDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(exitToApp, "\u9000\u51fa\u767b\u5f55", "\u5b89\u5168\u9000\u51fa\u5f53\u524d\u8d26\u6237", (Function0) objRememberedValue, true, $composer, 28080, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$14$0$0$7$0$0$0(MutableState $showLogoutDialog$delegate) {
        SettingsScreen$lambda$12($showLogoutDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$15$0(MutableState $showLogoutDialog$delegate) {
        SettingsScreen$lambda$12($showLogoutDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$16(final Function0 $onLogout, final MutableState $showLogoutDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C298@11298L107,297@11256L259:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(173031462, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous> (SettingsScreen.kt:297)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1220487535, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChanged = $composer.changed($onLogout);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda52
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$16$0$0($onLogout, $showLogoutDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SettingsScreenKt.INSTANCE.m11726getLambda$605924279$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$16$0$0(Function0 $onLogout, MutableState $showLogoutDialog$delegate) {
        SettingsScreen$lambda$12($showLogoutDialog$delegate, false);
        $onLogout.invoke();
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$17(final MutableState $showLogoutDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C308@11619L28,307@11577L139:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(99446884, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsScreen.<anonymous> (SettingsScreen.kt:307)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1079176960, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda99
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsScreen$lambda$17$0$0($showLogoutDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SettingsScreenKt.INSTANCE.m11727getLambda$679508857$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$17$0$0(MutableState $showLogoutDialog$delegate) {
        SettingsScreen$lambda$12($showLogoutDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$18$0(MutableState $showAccountSwitchSheet$delegate) {
        SettingsScreen$lambda$8($showAccountSwitchSheet$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$19$0(Context $context, MutableState $showAccountSwitchSheet$delegate) {
        SettingsScreen$lambda$8($showAccountSwitchSheet$delegate, false);
        LoginActivity.INSTANCE.start($context);
        return Unit.INSTANCE;
    }

    public static final Unit SettingsScreen$lambda$20$0(CoroutineScope $coroutineScope, AccountRepository $accountRepository, String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new SettingsScreenKt$SettingsScreen$11$1$1($accountRepository, userId, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit SettingsScreen$lambda$21$0(com.yhchat.canarys.data.repository.AccountRepository r5, android.content.Context r6, androidx.compose.runtime.MutableState r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "userId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 0
            if (r5 == 0) goto L10
            boolean r1 = r5.switchToAccount(r8)
            r2 = 1
            if (r1 != r2) goto L10
            goto L11
        L10:
            r2 = r0
        L11:
            if (r2 == 0) goto L39
            SettingsScreen$lambda$8(r7, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.yhchat.canarys.MainActivity> r1 = com.yhchat.canarys.MainActivity.class
            r0.<init>(r6, r1)
            r1 = r0
            r3 = 0
            r4 = 268468224(0x10008000, float:2.5342157E-29)
            r1.setFlags(r4)
            r6.startActivity(r0)
            boolean r1 = r6 instanceof android.app.Activity
            if (r1 == 0) goto L32
            r1 = r6
            android.app.Activity r1 = (android.app.Activity) r1
            goto L33
        L32:
            r1 = 0
        L33:
            if (r1 == 0) goto L44
            r1.finish()
            goto L44
        L39:
            java.lang.String r1 = "\u5207\u6362\u5931\u8d25\uff1a\u672a\u627e\u5230\u8be5\u8d26\u53f7 token\uff0c\u8bf7\u91cd\u65b0\u767b\u5f55"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            android.widget.Toast r0 = android.widget.Toast.makeText(r6, r1, r0)
            r0.show()
        L44:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt.SettingsScreen$lambda$21$0(com.yhchat.canarys.data.repository.AccountRepository, android.content.Context, androidx.compose.runtime.MutableState, java.lang.String):kotlin.Unit");
    }

    private static final void AccountSwitchBottomSheet(final String currentUserId, final List<SavedAccount> list, final Function0<Unit> function0, final Function0<Unit> function02, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, Composer $composer, final int $changed) {
        final String str;
        final List<SavedAccount> list2;
        Function0<Unit> function03;
        final Function0<Unit> function04;
        final Function1<? super String, Unit> function13;
        final Function1<? super String, Unit> function14;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-915857009);
        ComposerKt.sourceInformation($composer3, "C(AccountSwitchBottomSheet)N(currentUserId,accounts,onDismiss,onAddAccount,onDeleteAccount,onSwitchAccount)361@13424L11,362@13450L4929,359@13329L5050:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            str = currentUserId;
            $dirty |= $composer3.changed(str) ? 4 : 2;
        } else {
            str = currentUserId;
        }
        if (($changed & 48) == 0) {
            list2 = list;
            $dirty |= $composer3.changedInstance(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if (($changed & 384) == 0) {
            function03 = function0;
            $dirty |= $composer3.changedInstance(function03) ? 256 : 128;
        } else {
            function03 = function0;
        }
        if (($changed & 3072) == 0) {
            function04 = function02;
            $dirty |= $composer3.changedInstance(function04) ? 2048 : 1024;
        } else {
            function04 = function02;
        }
        if (($changed & 24576) == 0) {
            function13 = function1;
            $dirty |= $composer3.changedInstance(function13) ? 16384 : 8192;
        } else {
            function13 = function1;
        }
        if ((196608 & $changed) == 0) {
            function14 = function12;
            $dirty |= $composer3.changedInstance(function14) ? 131072 : 65536;
        } else {
            function14 = function12;
        }
        if (!$composer3.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-915857009, $dirty, -1, "com.yhchat.canarys.ui.settings.AccountSwitchBottomSheet (SettingsScreen.kt:358)");
            }
            $composer2 = $composer3;
            ModalBottomSheetKt.m2908ModalBottomSheetdYc4hso(function03, null, null, 0.0f, null, MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, 0.0f, 0L, null, null, null, ComposableLambdaKt.rememberComposableLambda(-40623572, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda34
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsScreenKt.AccountSwitchBottomSheet$lambda$0(list2, str, function14, function13, function04, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer2, ($dirty >> 6) & 14, 384, 4062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda35
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.AccountSwitchBottomSheet$lambda$1(currentUserId, list, function0, function02, function1, function12, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x03f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit AccountSwitchBottomSheet$lambda$0(final java.util.List r75, final java.lang.String r76, final kotlin.jvm.functions.Function1 r77, final kotlin.jvm.functions.Function1 r78, final kotlin.jvm.functions.Function0 r79, androidx.compose.foundation.layout.ColumnScope r80, androidx.compose.runtime.Composer r81, int r82) {
        /*
            Method dump skipped, instructions count: 1021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt.AccountSwitchBottomSheet$lambda$0(java.util.List, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit AccountSwitchBottomSheet$lambda$0$0$1$0(final List $accounts, final String $currentUserId, final Function1 $onSwitchAccount, final Function1 $onDeleteAccount, final Function0 $onAddAccount, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SettingsScreenKt.AccountSwitchBottomSheet$lambda$0$0$1$0$0((SavedAccount) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$AccountSwitchBottomSheet$lambda$0$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((SavedAccount) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(SavedAccount savedAccount) {
                return null;
            }
        };
        LazyColumn.items($accounts.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$AccountSwitchBottomSheet$lambda$0$0$1$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke($accounts.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$AccountSwitchBottomSheet$lambda$0$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke($accounts.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$AccountSwitchBottomSheet$lambda$0$0$1$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                Function0 function0;
                Function0 function02;
                Function0 function03;
                ComposerKt.sourceInformation($composer, "CN(it)178@8834L22:LazyDsl.kt#428nma");
                int $dirty = $changed;
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
                    int i = $dirty & 14;
                    final SavedAccount savedAccount = (SavedAccount) $accounts.get(it);
                    $composer.startReplaceGroup(-1710043795);
                    ComposerKt.sourceInformation($composer, "CN(account)*397@14708L35,394@14576L2856:SettingsScreen.kt#acwjhs");
                    boolean zAreEqual = Intrinsics.areEqual(savedAccount.getUserId(), $currentUserId);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    ComposerKt.sourceInformationMarkerStart($composer, 1191766828, "CC(remember):SettingsScreen.kt#9igjgp");
                    boolean zChanged = $composer.changed($onSwitchAccount) | ((((i & 112) ^ 48) > 32 && $composer.changed(savedAccount)) || (i & 48) == 32);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final Function1 function13 = $onSwitchAccount;
                        Object obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$AccountSwitchBottomSheet$1$1$2$1$2$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function13.invoke(savedAccount.getUserId());
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    Modifier modifierM1051paddingVpY3zN4 = PaddingKt.m1051paddingVpY3zN4(ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null), C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(12));
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                    CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1051paddingVpY3zN4);
                    Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                    int i2 = ((((384 << 3) & 112) << 6) & 896) | 6;
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
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    int i4 = ((384 >> 6) & 112) | 6;
                    RowScope rowScope = RowScopeInstance.INSTANCE;
                    Composer composer = $composer;
                    ComposerKt.sourceInformationMarkerStart(composer, -829027729, "C419@15820L40,421@15886L1097,444@17059L35,443@17009L401:SettingsScreen.kt#acwjhs");
                    String avatarUrl = savedAccount.getAvatarUrl();
                    if (!(avatarUrl == null || StringsKt.isBlank(avatarUrl))) {
                        composer.startReplaceGroup(-829051104);
                        ComposerKt.sourceInformation(composer, "402@15009L381");
                        SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(savedAccount.getAvatarUrl(), "\u5934\u50cf", ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(44)), RoundedCornerShapeKt.getCircleShape()), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                        composer = composer;
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-828613663);
                        ComposerKt.sourceInformation(composer, "415@15710L11,411@15452L316");
                        IconKt.m2816Iconww6aTOc(AccountCircleKt.getAccountCircle(Icons.INSTANCE.getDefault()), "\u5934\u50cf", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(44)), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), composer, 432, 0);
                        composer.endReplaceGroup();
                    }
                    SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), composer, 6);
                    Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Composer composer2 = composer;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, ((0 >> 3) & 14) | ((0 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composer2, modifierWeight$default);
                    Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    int i5 = ((((0 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        function02 = constructor2;
                        composer2.createNode(function02);
                    } else {
                        function02 = constructor2;
                        composer2.useNode();
                    }
                    Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl(composer2);
                    Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyColumnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                        composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                        composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    int i6 = (i5 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    int i7 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, 497480790, "C422@15955L721,438@16823L10,439@16899L11,436@16705L252:SettingsScreen.kt#acwjhs");
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer2, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    Modifier modifier = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, ((384 >> 3) & 14) | ((384 >> 3) & 112));
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier(composer2, modifier);
                    Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    int i8 = ((((384 << 3) & 112) << 6) & 896) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        function03 = constructor3;
                        composer2.createNode(function03);
                    } else {
                        function03 = constructor3;
                        composer2.useNode();
                    }
                    Composer composerM4376constructorimpl3 = Updater.m4376constructorimpl(composer2);
                    Updater.m4383setimpl(composerM4376constructorimpl3, measurePolicyRowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m4383setimpl(composerM4376constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2 setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (composerM4376constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl3.rememberedValue(), Integer.valueOf(iHashCode3))) {
                        composerM4376constructorimpl3.updateRememberedValue(Integer.valueOf(iHashCode3));
                        composerM4376constructorimpl3.apply(Integer.valueOf(iHashCode3), setCompositeKeyHash3);
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl3, modifierMaterializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    int i9 = (i8 >> 6) & 14;
                    Composer composer3 = composer2;
                    ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    int i10 = ((384 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart(composer3, 988593119, "C425@16162L10,423@16041L243:SettingsScreen.kt#acwjhs");
                    TextKt.m3359Text4IGK_g(savedAccount.getName(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyLarge(), composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 0, 65502);
                    if (zAreEqual) {
                        composer3.startReplaceGroup(988872769);
                        ComposerKt.sourceInformation(composer3, "429@16370L39,431@16508L2,430@16446L166");
                        SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer3, 6);
                        ComposerKt.sourceInformationMarkerStart(composer3, -522284887, "CC(remember):SettingsScreen.kt#9igjgp");
                        Object objRememberedValue2 = composer3.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$AccountSwitchBottomSheet$1$1$2$1$2$2$1$1$1$1
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }
                            };
                            composer3.updateRememberedValue(obj2);
                            objRememberedValue2 = obj2;
                        }
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ChipKt.AssistChip((Function0<Unit>) objRememberedValue2, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$871935749$app_debug(), (Modifier) null, false, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Shape) null, (ChipColors) null, (ChipElevation) null, (BorderStroke) null, (MutableInteractionSource) null, composer3, 54, 0, 2044);
                        composer3 = composer3;
                    } else {
                        composer3.startReplaceGroup(972660699);
                    }
                    composer3.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    TextKt.m3359Text4IGK_g(savedAccount.getDisplayId(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerStart(composer, -2104887408, "CC(remember):SettingsScreen.kt#9igjgp");
                    boolean zChanged2 = composer.changed($onDeleteAccount) | ((((i & 112) ^ 48) > 32 && composer.changed(savedAccount)) || (i & 48) == 32);
                    Composer composer4 = composer;
                    Object objRememberedValue3 = composer4.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final Function1 function14 = $onDeleteAccount;
                        Object obj3 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$AccountSwitchBottomSheet$1$1$2$1$2$2$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function14.invoke(savedAccount.getUserId());
                            }
                        };
                        composer4.updateRememberedValue(obj3);
                        objRememberedValue3 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    IconButtonKt.IconButton((Function0) objRememberedValue3, null, false, null, null, ComposableSingletons$SettingsScreenKt.INSTANCE.m11724getLambda$1866344822$app_debug(), composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
                    ComposerKt.sourceInformationMarkerEnd(composer);
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
        if ($accounts.isEmpty()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(653923142, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda41
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SettingsScreenKt.AccountSwitchBottomSheet$lambda$0$0$1$0$2($onAddAccount, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final Object AccountSwitchBottomSheet$lambda$0$0$1$0$0(SavedAccount it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getUserId();
    }

    public static final Unit AccountSwitchBottomSheet$lambda$0$0$1$0$2(Function0 $onAddAccount, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C457@17545L764:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(653923142, $changed, -1, "com.yhchat.canarys.ui.settings.AccountSwitchBottomSheet.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:457)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(24));
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((390 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -926461903, "C465@17943L10,466@18019L11,463@17833L244,468@18106L41,469@18176L107:SettingsScreen.kt#acwjhs");
            TextKt.m3359Text4IGK_g("\u8fd8\u6ca1\u6709\u6dfb\u52a0\u8d26\u53f7", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 6, 0, 65530);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            ButtonKt.Button($onAddAccount, null, false, null, null, null, null, null, null, ComposableSingletons$SettingsScreenKt.INSTANCE.m11723getLambda$1565843808$app_debug(), $composer, 805306368, 510);
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

    private static final void DisplaySettingsGroup(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(-1508545057);
        ComposerKt.sourceInformation($composer2, "C(DisplaySettingsGroup)N(context,modifier)488@18522L97,492@18660L94,497@18809L92,502@18962L97,509@19140L485,521@19639L488,533@20141L568,545@20723L55,546@20792L42,547@20848L45,548@20907L49,549@20970L43,550@21027L43,551@21084L42,552@21140L45,553@21199L45,554@21258L45,555@21317L49,556@21380L53,506@19065L2384:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            modifier2 = (i & 2) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1508545057, $dirty2, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup (SettingsScreen.kt:487)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1987149632, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("display_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1987154045, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("show_sticky_conversations", true)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState showStickyConversations$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1987158811, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("show_inline_expressions", true)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            final MutableState showInlineExpressions$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1987163712, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("auto_dismiss_expression_picker", true)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            }
            final MutableState autoDismissExpressionPicker$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsGroup("\u663e\u793a\u8bbe\u7f6e", CollectionsKt.listOf((Object[]) new Function2[]{ComposableLambdaKt.rememberComposableLambda(-463556057, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda135
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$10(prefs, showStickyConversations$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-2120562298, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$11(prefs, showInlineExpressions$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(517398757, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$12(prefs, autoDismissExpressionPicker$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1139607484, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$13(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(1498353571, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$14(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-158652670, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$15(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1815658911, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$16(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(822302144, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$17(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-834704097, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$18(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(1803256958, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$19(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-1337470018, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda136
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$20(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(1300491037, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda137
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$21(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-356515204, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda138
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$22(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(-2013521445, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda139
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$23(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), ComposableLambdaKt.rememberComposableLambda(624439610, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$24(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54)}), null, $composer2, 54, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.DisplaySettingsGroup$lambda$25(context, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean DisplaySettingsGroup$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DisplaySettingsGroup$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DisplaySettingsGroup$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DisplaySettingsGroup$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean DisplaySettingsGroup$lambda$8(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DisplaySettingsGroup$lambda$9(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit DisplaySettingsGroup$lambda$10(final SharedPreferences $prefs, final MutableState $showStickyConversations$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C515@19407L186,510@19158L453:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-463556057, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:510)");
            }
            ImageVector pushPin = PushPinKt.getPushPin(Icons.INSTANCE.getDefault());
            boolean zDisplaySettingsGroup$lambda$2 = DisplaySettingsGroup$lambda$2($showStickyConversations$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 1199236737, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($prefs);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda96
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.DisplaySettingsGroup$lambda$10$0$0($prefs, $showStickyConversations$delegate, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsSwitchItem(pushPin, "\u663e\u793a\u7f6e\u9876\u4f1a\u8bdd", "\u5728\u4f1a\u8bdd\u5217\u8868\u4e2d\u663e\u793a\u7f6e\u9876\u7684\u4f1a\u8bdd", zDisplaySettingsGroup$lambda$2, (Function1) objRememberedValue, false, $composer, 432, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$10$0$0(SharedPreferences $prefs, MutableState $showStickyConversations$delegate, boolean checked) {
        DisplaySettingsGroup$lambda$3($showStickyConversations$delegate, checked);
        $prefs.edit().putBoolean("show_sticky_conversations", checked).apply();
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$11(final SharedPreferences $prefs, final MutableState $showInlineExpressions$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C527@19913L182,522@19657L456:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2120562298, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:522)");
            }
            ImageVector emojiEmotions = EmojiEmotionsKt.getEmojiEmotions(Icons.INSTANCE.getDefault());
            boolean zDisplaySettingsGroup$lambda$5 = DisplaySettingsGroup$lambda$5($showInlineExpressions$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -2045861124, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($prefs);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda62
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.DisplaySettingsGroup$lambda$11$0$0($prefs, $showInlineExpressions$delegate, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsSwitchItem(emojiEmotions, "\u663e\u793a\u5185\u8054\u8868\u60c5", "\u5728\u804a\u5929\u6c14\u6ce1\u4e2d\u76f4\u63a5\u6e32\u67d3 [.\u8868\u60c5]", zDisplaySettingsGroup$lambda$5, (Function1) objRememberedValue, false, $composer, 432, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$11$0$0(SharedPreferences $prefs, MutableState $showInlineExpressions$delegate, boolean checked) {
        DisplaySettingsGroup$lambda$6($showInlineExpressions$delegate, checked);
        $prefs.edit().putBoolean("show_inline_expressions", checked).apply();
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$12(final SharedPreferences $prefs, final MutableState $autoDismissExpressionPicker$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C539@20482L195,534@20159L536:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(517398757, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:534)");
            }
            ImageVector keyboardArrowDown = KeyboardArrowDownKt.getKeyboardArrowDown(Icons.INSTANCE.getDefault());
            String str = DisplaySettingsGroup$lambda$8($autoDismissExpressionPicker$delegate) ? "\u70b9\u51fb\u8868\u60c5\u540e\u4f1a\u81ea\u52a8\u5173\u95ed\u8868\u60c5\u9762\u677f" : "\u70b9\u51fb\u8868\u60c5\u540e\u4e0d\u4f1a\u81ea\u52a8\u5173\u95ed\u8868\u60c5\u9762\u677f";
            boolean zDisplaySettingsGroup$lambda$8 = DisplaySettingsGroup$lambda$8($autoDismissExpressionPicker$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -995989752, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($prefs);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda32
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.DisplaySettingsGroup$lambda$12$0$0($prefs, $autoDismissExpressionPicker$delegate, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsSwitchItem(keyboardArrowDown, "\u9009\u62e9\u8868\u60c5\u540e\u81ea\u52a8\u6536\u56de", str, zDisplaySettingsGroup$lambda$8, (Function1) objRememberedValue, false, $composer, 48, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$12$0$0(SharedPreferences $prefs, MutableState $autoDismissExpressionPicker$delegate, boolean checked) {
        DisplaySettingsGroup$lambda$9($autoDismissExpressionPicker$delegate, checked);
        $prefs.edit().putBoolean("auto_dismiss_expression_picker", checked).apply();
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$13(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C545@20725L51:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1139607484, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:545)");
            }
            LongPressSendMarkdownSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$14(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C546@20794L38:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1498353571, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:546)");
            }
            FontSizeSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$15(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C547@20850L41:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-158652670, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:547)");
            }
            GlobalScaleSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$16(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C548@20909L45:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1815658911, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:548)");
            }
            MemoryAutoCleanSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$17(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C549@20972L39:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(822302144, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:549)");
            }
            DataSaverSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$18(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C550@21029L39:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-834704097, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:550)");
            }
            WebSocketSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$19(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C551@21086L38:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1803256958, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:551)");
            }
            BotBoardSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$20(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C552@21142L41:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1337470018, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:552)");
            }
            MenuButtonsSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$21(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C553@21201L41:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1300491037, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:553)");
            }
            WebPQualitySettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$22(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C554@21260L41:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-356515204, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:554)");
            }
            HtmlRawTextSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$23(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C555@21319L45:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2013521445, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:555)");
            }
            MarkdownRawTextSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit DisplaySettingsGroup$lambda$24(Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C556@21382L49:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(624439610, $changed, -1, "com.yhchat.canarys.ui.settings.DisplaySettingsGroup.<anonymous> (SettingsScreen.kt:556)");
            }
            FloatingAudioButtonSettingItem($context, null, $composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r34v1 */
    /* JADX WARN: Type inference failed for: r34v2 */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    private static final void ThemeSettingsGroup(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Modifier modifier3;
        boolean z;
        Pair pair;
        String str;
        Composer $composer2 = $composer.startRestartGroup(486518200);
        ComposerKt.sourceInformation($composer2, "C(ThemeSettingsGroup)N(context,modifier)569@21601L34,570@21652L95,573@21769L92,587@22150L267,584@22075L358:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            if ((i & 2) != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(486518200, $dirty2, -1, "com.yhchat.canarys.ui.settings.ThemeSettingsGroup (SettingsScreen.kt:568)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -607441478, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                z = 1;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                z = 1;
            }
            final MutableState showThemeDialog$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -607439785, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("display_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue2 = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -607436044, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                String string = prefs.getString("theme_mode", "system");
                if (string == null) {
                    string = "system";
                }
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(string, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            final MutableState themeMode$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Pair[] pairArr = new Pair[3];
            String str2 = "\u8ddf\u968f\u7cfb\u7edf";
            pairArr[0] = TuplesKt.m176to("system", "\u8ddf\u968f\u7cfb\u7edf");
            pairArr[z] = TuplesKt.m176to("light", "\u6d45\u8272\u4e3b\u9898");
            pairArr[2] = TuplesKt.m176to("dark", "\u6df1\u8272\u4e3b\u9898");
            final List themeOptions = CollectionsKt.listOf((Object[]) pairArr);
            Iterator it = themeOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    pair = null;
                    break;
                }
                ?? next = it.next();
                Iterator it2 = it;
                if (Intrinsics.areEqual(((Pair) next).getFirst(), ThemeSettingsGroup$lambda$5(themeMode$delegate))) {
                    pair = next;
                    break;
                }
                it = it2;
            }
            Pair pair2 = pair;
            if (pair2 != null && (str = (String) pair2.getSecond()) != null) {
                str2 = str;
            }
            final String currentThemeLabel = str2;
            SettingsGroup("\u4e3b\u9898\u8bbe\u7f6e", CollectionsKt.listOf(ComposableLambdaKt.rememberComposableLambda(-1198289561, z, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda114
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.ThemeSettingsGroup$lambda$8(currentThemeLabel, showThemeDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54)), null, $composer2, 54, 4);
            if (ThemeSettingsGroup$lambda$1(showThemeDialog$delegate)) {
                $composer2.startReplaceGroup(-1649919337);
                ComposerKt.sourceInformation($composer2, "600@22514L27,629@23803L132,602@22602L1171,599@22470L1475");
                ComposerKt.sourceInformationMarkerStart($composer2, -607412269, "CC(remember):SettingsScreen.kt#9igjgp");
                Object objRememberedValue4 = $composer2.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda115
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SettingsScreenKt.ThemeSettingsGroup$lambda$9$0(showThemeDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue4 = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0((Function0) objRememberedValue4, ComposableLambdaKt.rememberComposableLambda(1618870021, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda116
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return SettingsScreenKt.ThemeSettingsGroup$lambda$10(showThemeDialog$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, null, null, ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$529124873$app_debug(), ComposableLambdaKt.rememberComposableLambda(256688586, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda117
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return SettingsScreenKt.ThemeSettingsGroup$lambda$11(themeOptions, prefs, themeMode$delegate, showThemeDialog$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                }, $composer2, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, 1769526, 0, 16284);
                $composer2 = $composer2;
            } else {
                $composer2.startReplaceGroup(-1672246870);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda119
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.ThemeSettingsGroup$lambda$12(context, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean ThemeSettingsGroup$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ThemeSettingsGroup$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ThemeSettingsGroup$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final Unit ThemeSettingsGroup$lambda$8(String $currentThemeLabel, final MutableState $showThemeDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C592@22359L26,588@22168L235:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1198289561, $changed, -1, "com.yhchat.canarys.ui.settings.ThemeSettingsGroup.<anonymous> (SettingsScreen.kt:588)");
            }
            ImageVector palette = PaletteKt.getPalette(Icons.INSTANCE.getDefault());
            String str = "\u5f53\u524d: " + $currentThemeLabel;
            ComposerKt.sourceInformationMarkerStart($composer, -505026079, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.ThemeSettingsGroup$lambda$8$0$0($showThemeDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(palette, "\u4e3b\u9898\u6a21\u5f0f", str, (Function0) objRememberedValue, false, $composer, 3120, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ThemeSettingsGroup$lambda$8$0$0(MutableState $showThemeDialog$delegate) {
        ThemeSettingsGroup$lambda$2($showThemeDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit ThemeSettingsGroup$lambda$9$0(MutableState $showThemeDialog$delegate) {
        ThemeSettingsGroup$lambda$2($showThemeDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ThemeSettingsGroup$lambda$11(java.util.List r84, android.content.SharedPreferences r85, final androidx.compose.runtime.MutableState r86, final androidx.compose.runtime.MutableState r87, androidx.compose.runtime.Composer r88, int r89) {
        /*
            Method dump skipped, instructions count: 1001
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt.ThemeSettingsGroup$lambda$11(java.util.List, android.content.SharedPreferences, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit ThemeSettingsGroup$lambda$11$0$0$0$0(String $value, SharedPreferences $prefs, MutableState $themeMode$delegate, MutableState $showThemeDialog$delegate) {
        $themeMode$delegate.setValue($value);
        $prefs.edit().putString("theme_mode", $value).apply();
        ThemeSettingsGroup$lambda$2($showThemeDialog$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit ThemeSettingsGroup$lambda$10(final MutableState $showThemeDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C630@23842L27,630@23821L100:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1618870021, $changed, -1, "com.yhchat.canarys.ui.settings.ThemeSettingsGroup.<anonymous> (SettingsScreen.kt:630)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 955930304, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda43
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.ThemeSettingsGroup$lambda$10$0$0($showThemeDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$760141634$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ThemeSettingsGroup$lambda$10$0$0(MutableState $showThemeDialog$delegate) {
        ThemeSettingsGroup$lambda$2($showThemeDialog$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void LongPressSendMarkdownSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier.Companion modifier2;
        Composer $composer2 = $composer.startRestartGroup(2002403754);
        ComposerKt.sourceInformation($composer2, "C(LongPressSendMarkdownSettingItem)N(context,modifier)643@24089L92,647@24202L100,651@24323L108,655@24456L2679,655@24437L2698:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        if ($composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002403754, $dirty, -1, "com.yhchat.canarys.ui.settings.LongPressSendMarkdownSettingItem (SettingsScreen.kt:642)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 164662726, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("chat_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 164666350, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("long_press_send_markdown_enabled", false)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState enabled$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 164670230, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(RangesKt.coerceIn(prefs.getInt("long_press_send_markdown_seconds", 3), 1, 10)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            }
            final MutableState seconds$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsCustomItem(null, ComposableLambdaKt.rememberComposableLambda(-888387435, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda65
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.LongPressSendMarkdownSettingItem$lambda$7(prefs, enabled$delegate, seconds$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda66
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.LongPressSendMarkdownSettingItem$lambda$8(context, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean LongPressSendMarkdownSettingItem$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void LongPressSendMarkdownSettingItem$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final int LongPressSendMarkdownSettingItem$lambda$5(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void LongPressSendMarkdownSettingItem$lambda$6(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    public static final Unit LongPressSendMarkdownSettingItem$lambda$7(final SharedPreferences $prefs, MutableState $enabled$delegate, final MutableState $seconds$delegate, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Composer composer;
        final MutableState mutableState;
        Function0 function04;
        ComposerKt.sourceInformation($composer, "C656@24466L2663:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-888387435, $changed, -1, "com.yhchat.canarys.ui.settings.LongPressSendMarkdownSettingItem.<anonymous> (SettingsScreen.kt:656)");
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
            ComposerKt.sourceInformationMarkerStart($composer, -1027636409, "C661@24594L1429,698@26037L41,702@26175L40,703@26257L112,700@26092L443,712@26549L570:SettingsScreen.kt#acwjhs");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            int i6 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 153610073, "C669@24960L11,665@24746L251,672@25015L40,674@25073L581,687@25672L39,691@25814L177,689@25729L280:SettingsScreen.kt#acwjhs");
            IconKt.m2816Iconww6aTOc(SendKt.getSend(Icons.INSTANCE.getDefault()), "\u957f\u6309\u81ea\u52a8\u53d1\u9001 Markdown", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), $composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            ComposerKt.sourceInformationMarkerStart($composer, 939726120, "C677@25237L10,678@25307L11,675@25134L216,682@25518L10,683@25586L11,680@25371L265:SettingsScreen.kt#acwjhs");
            TextKt.m3359Text4IGK_g("\u957f\u6309\u53d1\u9001\u81ea\u52a8\u53d1 Markdown", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getTitleMedium(), $composer, 6, 0, 65530);
            TextKt.m3359Text4IGK_g(LongPressSendMarkdownSettingItem$lambda$2($enabled$delegate) ? "\u5df2\u5f00\u542f\uff1a\u957f\u6309 " + LongPressSendMarkdownSettingItem$lambda$5($seconds$delegate) + "s \u540e\u81ea\u52a8\u4ee5 Markdown \u53d1\u9001" : "\u9ed8\u8ba4\u5173\u95ed", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), $composer, 6);
            boolean zLongPressSendMarkdownSettingItem$lambda$2 = LongPressSendMarkdownSettingItem$lambda$2($enabled$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -1657579732, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($prefs);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer = $composer;
                mutableState = $enabled$delegate;
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda70
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.LongPressSendMarkdownSettingItem$lambda$7$0$0$1$0($prefs, mutableState, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                composer = $composer;
                mutableState = $enabled$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd(composer);
            Composer composer2 = composer;
            SwitchKt.Switch(zLongPressSendMarkdownSettingItem$lambda$2, (Function1) objRememberedValue, null, null, false, null, null, composer2, 0, 124);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd($composer);
            $composer.endNode();
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerEnd($composer);
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            float fLongPressSendMarkdownSettingItem$lambda$5 = LongPressSendMarkdownSettingItem$lambda$5($seconds$delegate);
            ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(1.0f, 10.0f);
            boolean zLongPressSendMarkdownSettingItem$lambda$22 = LongPressSendMarkdownSettingItem$lambda$2(mutableState);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1768013863, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda71
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return SettingsScreenKt.LongPressSendMarkdownSettingItem$lambda$7$0$1$0($seconds$delegate, ((Float) obj3).floatValue());
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            Function1 function1 = (Function1) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1768016559, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($prefs);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda72
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.LongPressSendMarkdownSettingItem$lambda$7$0$2$0($prefs, $seconds$delegate);
                    }
                };
                $composer.updateRememberedValue(obj3);
                objRememberedValue3 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SliderKt.Slider(fLongPressSendMarkdownSettingItem$lambda$5, function1, modifierFillMaxWidth$default2, zLongPressSendMarkdownSettingItem$lambda$22, closedFloatingPointRangeRangeTo, 8, (Function0) objRememberedValue3, null, null, $composer, 197040, 384);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default3);
            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function04 = constructor4;
                $composer.createNode(function04);
            } else {
                function04 = constructor4;
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i12 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, 1604333965, "C718@26784L10,719@26849L11,716@26703L192,723@26994L10,724@27059L11,721@26912L193:SettingsScreen.kt#acwjhs");
            TextKt.m3359Text4IGK_g("1s", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 6, 0, 65530);
            TextKt.m3359Text4IGK_g("10s", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 6, 0, 65530);
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
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit LongPressSendMarkdownSettingItem$lambda$7$0$0$1$0(SharedPreferences $prefs, MutableState $enabled$delegate, boolean checked) {
        LongPressSendMarkdownSettingItem$lambda$3($enabled$delegate, checked);
        $prefs.edit().putBoolean("long_press_send_markdown_enabled", checked).apply();
        return Unit.INSTANCE;
    }

    public static final Unit LongPressSendMarkdownSettingItem$lambda$7$0$1$0(MutableState $seconds$delegate, float it) {
        LongPressSendMarkdownSettingItem$lambda$6($seconds$delegate, RangesKt.coerceIn((int) it, 1, 10));
        return Unit.INSTANCE;
    }

    public static final Unit LongPressSendMarkdownSettingItem$lambda$7$0$2$0(SharedPreferences $prefs, MutableState $seconds$delegate) {
        $prefs.edit().putInt("long_press_send_markdown_seconds", LongPressSendMarkdownSettingItem$lambda$5($seconds$delegate)).apply();
        return Unit.INSTANCE;
    }

    private static final void WebSocketSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(418340481);
        ComposerKt.sourceInformation($composer2, "C(WebSocketSettingItem)N(context,modifier)739@27286L97,743@27417L87,752@27745L135,747@27514L408:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(418340481, $dirty2, -1, "com.yhchat.canarys.ui.settings.WebSocketSettingItem (SettingsScreen.kt:738)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1701720222, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("display_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1701716040, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("disable_websocket", false)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState disableWebSocket$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ImageVector cloudOff = CloudOffKt.getCloudOff(Icons.INSTANCE.getDefault());
            String str = WebSocketSettingItem$lambda$2(disableWebSocket$delegate) ? "\u5df2\u7981\u7528\u5b9e\u65f6\u6d88\u606f\u63a8\u9001\uff0c\u9700\u91cd\u542f\u5e94\u7528\u751f\u6548" : "\u542f\u7528\u5b9e\u65f6\u6d88\u606f\u63a8\u9001";
            boolean zWebSocketSettingItem$lambda$2 = WebSocketSettingItem$lambda$2(disableWebSocket$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -1701705496, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(prefs);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda107
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.WebSocketSettingItem$lambda$4$0(prefs, disableWebSocket$delegate, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsSwitchItem(cloudOff, "\u7981\u7528 WebSocket", str, zWebSocketSettingItem$lambda$2, (Function1) objRememberedValue3, WebSocketSettingItem$lambda$2(disableWebSocket$delegate), $composer2, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda118
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.WebSocketSettingItem$lambda$5(context, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean WebSocketSettingItem$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void WebSocketSettingItem$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit WebSocketSettingItem$lambda$4$0(SharedPreferences $prefs, MutableState $disableWebSocket$delegate, boolean checked) {
        WebSocketSettingItem$lambda$3($disableWebSocket$delegate, checked);
        $prefs.edit().putBoolean("disable_websocket", checked).apply();
        return Unit.INSTANCE;
    }

    private static final void FontSizeSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier.Companion modifier2;
        Composer $composer2 = $composer.startRestartGroup(95130300);
        ComposerKt.sourceInformation($composer2, "C(FontSizeSettingItem)N(context,modifier)768@28066L97,772@28190L77,776@28296L2401,776@28277L2420:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(95130300, $dirty, -1, "com.yhchat.canarys.ui.settings.FontSizeSettingItem (SettingsScreen.kt:767)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1225908413, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("display_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1225912361, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(prefs.getFloat("font_scale", 100.0f)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState fontScale$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsCustomItem(null, ComposableLambdaKt.rememberComposableLambda(-1245599247, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.FontSizeSettingItem$lambda$4(prefs, fontScale$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.FontSizeSettingItem$lambda$5(context, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float FontSizeSettingItem$lambda$2(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final void FontSizeSettingItem$lambda$3(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    public static final Unit FontSizeSettingItem$lambda$4(final SharedPreferences $prefs, final MutableState $fontScale$delegate, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        ComposerKt.sourceInformation($composer, "C777@28306L2385:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1245599247, $changed, -1, "com.yhchat.canarys.ui.settings.FontSizeSettingItem.<anonymous> (SettingsScreen.kt:777)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 1815423765, "C782@28434L1044,809@29504L41,814@29665L72,817@29779L172,812@29590L466,828@30102L579:SettingsScreen.kt#acwjhs");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            int i6 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 73512170, "C790@28795L11,786@28586L246,793@28866L40,795@28940L524:SettingsScreen.kt#acwjhs");
            IconKt.m2816Iconww6aTOc(FormatSizeKt.getFormatSize(Icons.INSTANCE.getDefault()), "\u5b57\u4f53\u5927\u5c0f", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            ComposerKt.sourceInformationMarkerStart($composer, -865972795, "C798@29092L10,796@29001L189,803@29328L10,804@29396L11,801@29211L235:SettingsScreen.kt#acwjhs");
            TextKt.m3359Text4IGK_g("\u5b57\u4f53\u5927\u5c0f", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 196614, 0, 65502);
            TextKt.m3359Text4IGK_g(((int) FontSizeSettingItem$lambda$2($fontScale$delegate)) + "% (\u91cd\u542f\u5e94\u7528\u751f\u6548)", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
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
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            float fFontSizeSettingItem$lambda$2 = FontSizeSettingItem$lambda$2($fontScale$delegate);
            ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(1.0f, 100.0f);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1305525263, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda132
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.FontSizeSettingItem$lambda$4$0$1$0($fontScale$delegate, ((Float) obj2).floatValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 1305529011, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($prefs);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda133
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.FontSizeSettingItem$lambda$4$0$2$0($prefs, $fontScale$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SliderKt.Slider(fFontSizeSettingItem$lambda$2, function1, modifierFillMaxWidth$default2, false, closedFloatingPointRangeRangeTo, 0, (Function0) objRememberedValue2, null, null, $composer, 432, 424);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default3);
            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function04 = constructor4;
                $composer.createNode(function04);
            } else {
                function04 = constructor4;
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i12 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -1425730426, "C834@30341L10,835@30406L11,832@30256L196,839@30556L10,840@30621L11,837@30469L198:SettingsScreen.kt#acwjhs");
            TextKt.m3359Text4IGK_g("\u5c0f (1%)", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 6, 0, 65530);
            TextKt.m3359Text4IGK_g("\u5927 (100%)", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 6, 0, 65530);
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

    public static final Unit FontSizeSettingItem$lambda$4$0$1$0(MutableState $fontScale$delegate, float newValue) {
        FontSizeSettingItem$lambda$3($fontScale$delegate, newValue);
        return Unit.INSTANCE;
    }

    public static final Unit FontSizeSettingItem$lambda$4$0$2$0(SharedPreferences $prefs, MutableState $fontScale$delegate) {
        $prefs.edit().putFloat("font_scale", FontSizeSettingItem$lambda$2($fontScale$delegate)).apply();
        return Unit.INSTANCE;
    }

    private static final void GlobalScaleSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier.Companion modifier2;
        Composer $composer2 = $composer.startRestartGroup(-2071060607);
        ComposerKt.sourceInformation($composer2, "C(GlobalScaleSettingItem)N(context,modifier)855@30847L95,859@30961L77,863@31063L2396,863@31044L2415:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2071060607, $dirty, -1, "com.yhchat.canarys.ui.settings.GlobalScaleSettingItem (SettingsScreen.kt:854)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1719381856, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("display_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1719378226, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Float.valueOf(prefs.getFloat("global_scale", 1.0f)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState scale$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsCustomItem(null, ComposableLambdaKt.rememberComposableLambda(-549142484, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.GlobalScaleSettingItem$lambda$4(scale$delegate, prefs, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.GlobalScaleSettingItem$lambda$5(context, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float GlobalScaleSettingItem$lambda$2(MutableState<Float> mutableState) {
        return mutableState.getValue().floatValue();
    }

    private static final void GlobalScaleSettingItem$lambda$3(MutableState<Float> mutableState, float f) {
        mutableState.setValue(Float.valueOf(f));
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0680  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x074f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit GlobalScaleSettingItem$lambda$4(final androidx.compose.runtime.MutableState r112, final android.content.SharedPreferences r113, androidx.compose.runtime.Composer r114, int r115) {
        /*
            Method dump skipped, instructions count: 1881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt.GlobalScaleSettingItem$lambda$4(androidx.compose.runtime.MutableState, android.content.SharedPreferences, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit GlobalScaleSettingItem$lambda$4$0$1$0$0(SharedPreferences $prefs, MutableState $scale$delegate, float newValue) {
        float clamped = RangesKt.coerceIn(newValue, 0.5f, 1.5f);
        GlobalScaleSettingItem$lambda$3($scale$delegate, clamped);
        $prefs.edit().putFloat("global_scale", clamped).apply();
        return Unit.INSTANCE;
    }

    private static final void MemoryAutoCleanSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier.Companion modifier2;
        boolean z;
        MutableState enabled$delegate;
        MutableState thresholdValueText$delegate;
        Composer $composer2 = $composer.startRestartGroup(-1056587057);
        ComposerKt.sourceInformation($composer2, "C(MemoryAutoCleanSettingItem)N(context,modifier)939@33591L95,943@33707L93,946@33831L109,949@33957L106,952@34088L34,954@34147L3824,954@34128L3843:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        if ($composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1056587057, $dirty, -1, "com.yhchat.canarys.ui.settings.MemoryAutoCleanSettingItem (SettingsScreen.kt:938)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -1767876370, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("display_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1767872660, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                z = false;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("memory_auto_clean_enabled", false)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            } else {
                z = false;
            }
            MutableState enabled$delegate2 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1767868676, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                enabled$delegate = enabled$delegate2;
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(String.valueOf(prefs.getFloat("memory_auto_clean_threshold_value", 512.0f)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            } else {
                enabled$delegate = enabled$delegate2;
            }
            MutableState thresholdValueText$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1767864647, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue4 = $composer2.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                String string = prefs.getString("memory_auto_clean_threshold_unit", "MB");
                thresholdValueText$delegate = thresholdValueText$delegate2;
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(string != null ? string : "MB", null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            } else {
                thresholdValueText$delegate = thresholdValueText$delegate2;
            }
            final MutableState unit$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -1767860527, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue5 = $composer2.rememberedValue();
            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default4);
                objRememberedValue5 = objMutableStateOf$default4;
            }
            final MutableState unitExpanded$delegate = (MutableState) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final MutableState enabled$delegate3 = enabled$delegate;
            final MutableState thresholdValueText$delegate3 = thresholdValueText$delegate;
            SettingsCustomItem(null, ComposableLambdaKt.rememberComposableLambda(-1462364678, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda74
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.MemoryAutoCleanSettingItem$lambda$13(prefs, enabled$delegate3, thresholdValueText$delegate3, unitExpanded$delegate, unit$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda85
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.MemoryAutoCleanSettingItem$lambda$14(context, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean MemoryAutoCleanSettingItem$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MemoryAutoCleanSettingItem$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MemoryAutoCleanSettingItem$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String MemoryAutoCleanSettingItem$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean MemoryAutoCleanSettingItem$lambda$11(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MemoryAutoCleanSettingItem$lambda$12(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x07b1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0887  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x08de  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0970  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MemoryAutoCleanSettingItem$lambda$13(final android.content.SharedPreferences r112, final androidx.compose.runtime.MutableState r113, final androidx.compose.runtime.MutableState r114, final androidx.compose.runtime.MutableState r115, final androidx.compose.runtime.MutableState r116, androidx.compose.runtime.Composer r117, int r118) {
        /*
            Method dump skipped, instructions count: 2426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt.MemoryAutoCleanSettingItem$lambda$13(android.content.SharedPreferences, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit MemoryAutoCleanSettingItem$lambda$13$0$0$1$0(SharedPreferences $prefs, MutableState $enabled$delegate, boolean checked) {
        MemoryAutoCleanSettingItem$lambda$3($enabled$delegate, checked);
        $prefs.edit().putBoolean("memory_auto_clean_enabled", checked).apply();
        return Unit.INSTANCE;
    }

    public static final Unit MemoryAutoCleanSettingItem$lambda$13$0$1$0$0(SharedPreferences $prefs, MutableState $thresholdValueText$delegate, String newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        $thresholdValueText$delegate.setValue(newValue);
        Float parsed = StringsKt.toFloatOrNull(newValue);
        if (parsed != null) {
            $prefs.edit().putFloat("memory_auto_clean_threshold_value", parsed.floatValue()).apply();
        }
        return Unit.INSTANCE;
    }

    public static final Unit MemoryAutoCleanSettingItem$lambda$13$0$1$1$0$0(MutableState $unitExpanded$delegate) {
        MemoryAutoCleanSettingItem$lambda$12($unitExpanded$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit MemoryAutoCleanSettingItem$lambda$13$0$1$1$1(MutableState $unit$delegate, RowScope OutlinedButton, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
        ComposerKt.sourceInformation($composer, "C1028@36911L10:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1894652655, $changed, -1, "com.yhchat.canarys.ui.settings.MemoryAutoCleanSettingItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:1028)");
            }
            TextKt.m3359Text4IGK_g(MemoryAutoCleanSettingItem$lambda$8($unit$delegate), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit MemoryAutoCleanSettingItem$lambda$13$0$1$1$2$0(MutableState $unitExpanded$delegate) {
        MemoryAutoCleanSettingItem$lambda$12($unitExpanded$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit MemoryAutoCleanSettingItem$lambda$13$0$1$1$3(final SharedPreferences $prefs, final MutableState $unit$delegate, final MutableState $unitExpanded$delegate, ColumnScope DropdownMenu, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        ComposerKt.sourceInformation($composer, "C1037@37251L233,1035@37144L366,1045@37642L233,1043@37535L366:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(583384446, $changed, -1, "com.yhchat.canarys.ui.settings.MemoryAutoCleanSettingItem.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:1035)");
            }
            Function2<Composer, Integer, Unit> lambda$1468547406$app_debug = ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1468547406$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, -2008258681, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($prefs);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda124
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.MemoryAutoCleanSettingItem$lambda$13$0$1$1$3$0$0($prefs, $unit$delegate, $unitExpanded$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(lambda$1468547406$app_debug, (Function0) objRememberedValue, null, null, null, false, null, null, null, $composer, 6, 508);
            Function2<Composer, Integer, Unit> function2M11725getLambda$460928315$app_debug = ComposableSingletons$SettingsScreenKt.INSTANCE.m11725getLambda$460928315$app_debug();
            ComposerKt.sourceInformationMarkerStart($composer, -2008246169, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance2 = $composer.changedInstance($prefs);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda125
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.MemoryAutoCleanSettingItem$lambda$13$0$1$1$3$1$0($prefs, $unit$delegate, $unitExpanded$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AndroidMenu_androidKt.DropdownMenuItem(function2M11725getLambda$460928315$app_debug, (Function0) objRememberedValue2, null, null, null, false, null, null, null, $composer, 6, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit MemoryAutoCleanSettingItem$lambda$13$0$1$1$3$0$0(SharedPreferences $prefs, MutableState $unit$delegate, MutableState $unitExpanded$delegate) {
        $unit$delegate.setValue("MB");
        $prefs.edit().putString("memory_auto_clean_threshold_unit", MemoryAutoCleanSettingItem$lambda$8($unit$delegate)).apply();
        MemoryAutoCleanSettingItem$lambda$12($unitExpanded$delegate, false);
        return Unit.INSTANCE;
    }

    public static final Unit MemoryAutoCleanSettingItem$lambda$13$0$1$1$3$1$0(SharedPreferences $prefs, MutableState $unit$delegate, MutableState $unitExpanded$delegate) {
        $unit$delegate.setValue("GB");
        $prefs.edit().putString("memory_auto_clean_threshold_unit", MemoryAutoCleanSettingItem$lambda$8($unit$delegate)).apply();
        MemoryAutoCleanSettingItem$lambda$12($unitExpanded$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void DataSaverSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(-1725749539);
        ComposerKt.sourceInformation($composer2, "C(DataSaverSettingItem)N(context,modifier)1066@38125L95,1070@38243L78,1079@38539L121,1074@38327L368:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1725749539, $dirty2, -1, "com.yhchat.canarys.ui.settings.DataSaverSettingItem (SettingsScreen.kt:1065)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -587927364, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("display_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -587923605, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("data_saver", false)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState dataSaver$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ImageVector dataSaverOn = DataSaverOnKt.getDataSaverOn(Icons.INSTANCE.getDefault());
            String str = DataSaverSettingItem$lambda$2(dataSaver$delegate) ? "\u4e0d\u52a0\u8f7d\u5168\u5c40\u56fe\u7247\uff08\u5934\u50cf/\u6d88\u606f\u56fe\u7247/\u80cc\u666f\u7b49\uff09" : "\u9ed8\u8ba4\u5173\u95ed";
            boolean zDataSaverSettingItem$lambda$2 = DataSaverSettingItem$lambda$2(dataSaver$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -587914090, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(prefs);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda87
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.DataSaverSettingItem$lambda$4$0(prefs, dataSaver$delegate, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsSwitchItem(dataSaverOn, "\u7701\u6d41\u91cf\u6a21\u5f0f", str, zDataSaverSettingItem$lambda$2, (Function1) objRememberedValue3, DataSaverSettingItem$lambda$2(dataSaver$delegate), $composer2, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda88
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.DataSaverSettingItem$lambda$5(context, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean DataSaverSettingItem$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void DataSaverSettingItem$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit DataSaverSettingItem$lambda$4$0(SharedPreferences $prefs, MutableState $dataSaver$delegate, boolean checked) {
        DataSaverSettingItem$lambda$3($dataSaver$delegate, checked);
        $prefs.edit().putBoolean("data_saver", checked).apply();
        return Unit.INSTANCE;
    }

    private static final void BotBoardSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(-1931421459);
        ComposerKt.sourceInformation($composer2, "C(BotBoardSettingItem)N(context,modifier)1095@38842L94,1099@38966L83,1108@39283L128,1103@39059L358:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1931421459, $dirty2, -1, "com.yhchat.canarys.ui.settings.BotBoardSettingItem (SettingsScreen.kt:1094)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -670146901, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("chat_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -670142944, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("show_bot_board", true)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState showBotBoard$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ImageVector dashboard = DashboardKt.getDashboard(Icons.INSTANCE.getDefault());
            String str = BotBoardSettingItem$lambda$2(showBotBoard$delegate) ? "\u5728\u804a\u5929\u754c\u9762\u663e\u793a\u7fa4\u804a\u673a\u5668\u4eba\u770b\u677f\u548c\u5355\u673a\u5668\u4eba\u770b\u677f" : "\u9690\u85cf\u6240\u6709\u673a\u5668\u4eba\u770b\u677f";
            boolean zBotBoardSettingItem$lambda$2 = BotBoardSettingItem$lambda$2(showBotBoard$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -670132755, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(prefs);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda81
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.BotBoardSettingItem$lambda$4$0(prefs, showBotBoard$delegate, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsSwitchItem(dashboard, "\u663e\u793a\u673a\u5668\u4eba\u770b\u677f", str, zBotBoardSettingItem$lambda$2, (Function1) objRememberedValue3, false, $composer2, 48, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda82
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.BotBoardSettingItem$lambda$5(context, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean BotBoardSettingItem$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void BotBoardSettingItem$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit BotBoardSettingItem$lambda$4$0(SharedPreferences $prefs, MutableState $showBotBoard$delegate, boolean checked) {
        BotBoardSettingItem$lambda$3($showBotBoard$delegate, checked);
        $prefs.edit().putBoolean("show_bot_board", checked).apply();
        return Unit.INSTANCE;
    }

    private static final void MenuButtonsSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(-1630907162);
        ComposerKt.sourceInformation($composer2, "C(MenuButtonsSettingItem)N(context,modifier)1123@39567L94,1127@39694L86,1136@40007L134,1131@39790L357:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1630907162, $dirty2, -1, "com.yhchat.canarys.ui.settings.MenuButtonsSettingItem (SettingsScreen.kt:1122)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 361283780, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("chat_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 361287836, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("show_menu_buttons", true)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState showMenuButtons$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ImageVector apps = AppsKt.getApps(Icons.INSTANCE.getDefault());
            String str = MenuButtonsSettingItem$lambda$2(showMenuButtons$delegate) ? "\u5728\u804a\u5929\u8f93\u5165\u6846\u4e0a\u65b9\u663e\u793a\u83dc\u5355\u6309\u94ae\u680f" : "\u9690\u85cf\u83dc\u5355\u6309\u94ae\u680f";
            boolean zMenuButtonsSettingItem$lambda$2 = MenuButtonsSettingItem$lambda$2(showMenuButtons$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 361297900, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(prefs);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda84
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.MenuButtonsSettingItem$lambda$4$0(prefs, showMenuButtons$delegate, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsSwitchItem(apps, "\u663e\u793a\u83dc\u5355\u6309\u94ae\u680f", str, zMenuButtonsSettingItem$lambda$2, (Function1) objRememberedValue3, false, $composer2, 48, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda86
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.MenuButtonsSettingItem$lambda$5(context, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean MenuButtonsSettingItem$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MenuButtonsSettingItem$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit MenuButtonsSettingItem$lambda$4$0(SharedPreferences $prefs, MutableState $showMenuButtons$delegate, boolean checked) {
        MenuButtonsSettingItem$lambda$3($showMenuButtons$delegate, checked);
        $prefs.edit().putBoolean("show_menu_buttons", checked).apply();
        return Unit.INSTANCE;
    }

    private static final void PersonalizationSettingsGroup(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        char c;
        Composer $composer2 = $composer.startRestartGroup(-958741059);
        ComposerKt.sourceInformation($composer2, "C(PersonalizationSettingsGroup)N(context,modifier)1151@40316L34,1156@40434L470,1170@40918L185,1153@40360L759:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-958741059, $dirty2, -1, "com.yhchat.canarys.ui.settings.PersonalizationSettingsGroup (SettingsScreen.kt:1150)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 2067815039, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                c = 0;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                c = 0;
            }
            final MutableState showColorPickerDialog$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Function2[] function2Arr = new Function2[2];
            function2Arr[c] = ComposableLambdaKt.rememberComposableLambda(-1931525627, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda89
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.PersonalizationSettingsGroup$lambda$3(context, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54);
            function2Arr[1] = ComposableLambdaKt.rememberComposableLambda(1501137508, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda90
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.PersonalizationSettingsGroup$lambda$4(context, showColorPickerDialog$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54);
            SettingsGroup("\u4e2a\u6027\u5316", CollectionsKt.listOf((Object[]) function2Arr), null, $composer2, 54, 4);
            if (PersonalizationSettingsGroup$lambda$1(showColorPickerDialog$delegate)) {
                $composer2.startReplaceGroup(-321392000);
                ComposerKt.sourceInformation($composer2, "1183@41255L33,1181@41181L117");
                ComposerKt.sourceInformationMarkerStart($composer2, 2067845086, "CC(remember):SettingsScreen.kt#9igjgp");
                Object objRememberedValue2 = $composer2.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda91
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SettingsScreenKt.PersonalizationSettingsGroup$lambda$5$0(showColorPickerDialog$delegate);
                        }
                    };
                    $composer2.updateRememberedValue(obj);
                    objRememberedValue2 = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer2);
                ColorPickerDialog(context, (Function0) objRememberedValue2, $composer2, ($dirty2 & 14) | 48);
            } else {
                $composer2.startReplaceGroup(-362238747);
            }
            $composer2.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda92
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.PersonalizationSettingsGroup$lambda$6(context, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean PersonalizationSettingsGroup$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void PersonalizationSettingsGroup$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit PersonalizationSettingsGroup$lambda$3(final Context $context, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1161@40631L241,1157@40452L438:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1931525627, $changed, -1, "com.yhchat.canarys.ui.settings.PersonalizationSettingsGroup.<anonymous> (SettingsScreen.kt:1157)");
            }
            ImageVector wallpaper = WallpaperKt.getWallpaper(Icons.INSTANCE.getDefault());
            ComposerKt.sourceInformationMarkerStart($composer, -770249130, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda59
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.PersonalizationSettingsGroup$lambda$3$0$0($context);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SettingsItemCell(wallpaper, "\u804a\u5929\u80cc\u666f", "\u8bbe\u7f6e\u5168\u5c40\u804a\u5929\u80cc\u666f", (Function0) objRememberedValue, false, $composer, 432, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit PersonalizationSettingsGroup$lambda$3$0$0(Context $context) {
        ChatBackgroundActivity.INSTANCE.start($context, "all", "\u5168\u5c40");
        return Unit.INSTANCE;
    }

    public static final Unit PersonalizationSettingsGroup$lambda$4(Context $context, final MutableState $showColorPickerDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1173@41039L32,1171@40936L153:SettingsScreen.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1501137508, $changed, -1, "com.yhchat.canarys.ui.settings.PersonalizationSettingsGroup.<anonymous> (SettingsScreen.kt:1171)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -515862364, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda100
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.PersonalizationSettingsGroup$lambda$4$0$0($showColorPickerDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ThemeColorSettingItem($context, (Function0) objRememberedValue, null, $composer, 48, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit PersonalizationSettingsGroup$lambda$4$0$0(MutableState $showColorPickerDialog$delegate) {
        PersonalizationSettingsGroup$lambda$2($showColorPickerDialog$delegate, true);
        return Unit.INSTANCE;
    }

    public static final Unit PersonalizationSettingsGroup$lambda$5$0(MutableState $showColorPickerDialog$delegate) {
        PersonalizationSettingsGroup$lambda$2($showColorPickerDialog$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void ThemeColorSettingItem(final Context context, final Function0<Unit> function0, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Modifier.Companion modifier3;
        Composer $composer2 = $composer.startRestartGroup(1782681566);
        ComposerKt.sourceInformation($composer2, "C(ThemeColorSettingItem)N(context,onColorPickerClick,modifier)1197@41486L95,1205@41836L1872,1205@41787L1921:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changedInstance(function0) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 4) != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1782681566, $dirty2, -1, "com.yhchat.canarys.ui.settings.ThemeColorSettingItem (SettingsScreen.kt:1196)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -534961635, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("theme_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            int currentColorInt = prefs.getInt("custom_primary_color", -10354450);
            final long currentColor = ColorKt.Color(currentColorInt);
            final boolean isCustomColor = currentColorInt != -10354450;
            SettingsCustomItem(function0, ComposableLambdaKt.rememberComposableLambda(-804421741, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda78
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.ThemeColorSettingItem$lambda$1(currentColor, isCustomColor, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 3) & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda79
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.ThemeColorSettingItem$lambda$2(context, function0, modifier2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0442  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ThemeColorSettingItem$lambda$1(long r75, boolean r77, androidx.compose.runtime.Composer r78, int r79) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt.ThemeColorSettingItem$lambda$1(long, boolean, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    private static final void ColorPickerDialog(final Context context, final Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        char c;
        char c2;
        ?? r18;
        final Function0<Unit> function02 = function0;
        Composer $composer3 = $composer.startRestartGroup(1556893973);
        ComposerKt.sourceInformation($composer3, "C(ColorPickerDialog)N(context,onDismiss)1272@43882L95,1277@44091L51,1278@44165L95,1281@44285L31,1458@51496L856,1480@52378L98,1316@45318L6152,1307@45051L7431:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(context) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1556893973, $dirty2, -1, "com.yhchat.canarys.ui.settings.ColorPickerDialog (SettingsScreen.kt:1271)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1526492052, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                c = 4;
                Object sharedPreferences = context.getSharedPreferences("theme_settings", 0);
                $composer3.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            } else {
                c = 4;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            int currentColorInt = prefs.getInt("custom_primary_color", -10354450);
            ComposerKt.sourceInformationMarkerStart($composer3, 1526498696, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                c2 = 0;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Color.m5047boximpl(ColorKt.Color(currentColorInt)), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            } else {
                c2 = 0;
            }
            final MutableState selectedColor$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1526501108, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                r18 = 1;
                String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(currentColorInt & ViewCompat.MEASURED_SIZE_MASK)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue3 = objMutableStateOf$default2;
            } else {
                r18 = 1;
            }
            final MutableState colorInput$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1526504884, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue4 = objMutableStateOf$default3;
            }
            final MutableState errorMessage$delegate = (MutableState) objRememberedValue4;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Color[] colorArr = new Color[20];
            colorArr[c2] = Color.m5047boximpl(ColorKt.Color(4284612846L));
            colorArr[r18] = Color.m5047boximpl(ColorKt.Color(4294924066L));
            colorArr[2] = Color.m5047boximpl(ColorKt.Color(4294198070L));
            colorArr[3] = Color.m5047boximpl(ColorKt.Color(4293467747L));
            colorArr[c] = Color.m5047boximpl(ColorKt.Color(4288423856L));
            colorArr[5] = Color.m5047boximpl(ColorKt.Color(4284955319L));
            colorArr[6] = Color.m5047boximpl(ColorKt.Color(4282339765L));
            colorArr[7] = Color.m5047boximpl(ColorKt.Color(4280391411L));
            colorArr[8] = Color.m5047boximpl(ColorKt.Color(4278430196L));
            colorArr[9] = Color.m5047boximpl(ColorKt.Color(4278238420L));
            colorArr[10] = Color.m5047boximpl(ColorKt.Color(4278228616L));
            colorArr[11] = Color.m5047boximpl(ColorKt.Color(4283215696L));
            colorArr[12] = Color.m5047boximpl(ColorKt.Color(4287349578L));
            colorArr[13] = Color.m5047boximpl(ColorKt.Color(4291681337L));
            colorArr[14] = Color.m5047boximpl(ColorKt.Color(4294961979L));
            colorArr[15] = Color.m5047boximpl(ColorKt.Color(4294951175L));
            colorArr[16] = Color.m5047boximpl(ColorKt.Color(4294940672L));
            colorArr[17] = Color.m5047boximpl(ColorKt.Color(4286141768L));
            colorArr[18] = Color.m5047boximpl(ColorKt.Color(4284513675L));
            colorArr[19] = Color.m5047boximpl(ColorKt.Color(4278190080L));
            final List presetColors = CollectionsKt.listOf((Object[]) colorArr);
            function02 = function0;
            boolean z = r18;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function02, ComposableLambdaKt.rememberComposableLambda(-1673279651, z, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda73
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.ColorPickerDialog$lambda$10(prefs, context, function0, colorInput$delegate, errorMessage$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(-1185232545, z, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda75
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.ColorPickerDialog$lambda$11(function02, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$SettingsScreenKt.INSTANCE.m11728getLambda$697185439$app_debug(), ComposableLambdaKt.rememberComposableLambda(1694321762, z, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda76
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.ColorPickerDialog$lambda$12(selectedColor$delegate, colorInput$delegate, errorMessage$delegate, presetColors, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (14 & ($dirty2 >> 3)) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda77
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.ColorPickerDialog$lambda$13(context, function02, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long ColorPickerDialog$lambda$2(MutableState<Color> mutableState) {
        return mutableState.getValue().m5067unboximpl();
    }

    private static final void ColorPickerDialog$lambda$3(MutableState<Color> mutableState, long j) {
        mutableState.setValue(Color.m5047boximpl(j));
    }

    private static final String ColorPickerDialog$lambda$5(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final String ColorPickerDialog$lambda$8(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:231:0x083f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ColorPickerDialog$lambda$12(final androidx.compose.runtime.MutableState r113, final androidx.compose.runtime.MutableState r114, androidx.compose.runtime.MutableState r115, java.util.List r116, androidx.compose.runtime.Composer r117, int r118) {
        /*
            Method dump skipped, instructions count: 2626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt.ColorPickerDialog$lambda$12(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final Unit ColorPickerDialog$lambda$12$0$1$0(MutableState $colorInput$delegate, MutableState $errorMessage$delegate, MutableState $selectedColor$delegate, String input) {
        Intrinsics.checkNotNullParameter(input, "input");
        String upperCase = input.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        $colorInput$delegate.setValue(upperCase);
        $errorMessage$delegate.setValue("");
        if (new Regex("^#[0-9A-Fa-f]{6}$").matches(input)) {
            try {
                int colorInt = android.graphics.Color.parseColor(input);
                ColorPickerDialog$lambda$3($selectedColor$delegate, ColorKt.Color(colorInt));
            } catch (Exception e) {
                $errorMessage$delegate.setValue("\u65e0\u6548\u7684\u989c\u8272\u503c");
            }
        } else {
            if (!(input.length() > 0) || StringsKt.startsWith$default(input, "#", false, 2, (Object) null)) {
                if (input.length() > 7) {
                    $errorMessage$delegate.setValue("\u989c\u8272\u503c\u683c\u5f0f: #RRGGBB (6\u4f4d\u5341\u516d\u8fdb\u5236)");
                }
            } else {
                $errorMessage$delegate.setValue("\u989c\u8272\u503c\u5fc5\u987b\u4ee5 # \u5f00\u5934");
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ColorPickerDialog$lambda$12$0$2(MutableState $errorMessage$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1130348607, $changed, -1, "com.yhchat.canarys.ui.settings.ColorPickerDialog.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:1377)");
            }
            if (ColorPickerDialog$lambda$8($errorMessage$delegate).length() > 0) {
                $composer.startReplaceGroup(1671813739);
                ComposerKt.sourceInformation($composer, "1380@48139L11,1378@48026L160");
                TextKt.m3359Text4IGK_g(ColorPickerDialog$lambda$8($errorMessage$delegate), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131066);
                $composer.endReplaceGroup();
            } else {
                $composer.startReplaceGroup(1672029995);
                ComposerKt.sourceInformation($composer, "1383@48248L32");
                TextKt.m3359Text4IGK_g("\u683c\u5f0f: #RRGGBB (\u4f8b\u5982 #6200EE)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 6, 0, 131070);
                $composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ColorPickerDialog$lambda$12$0$3$0$0$0$0$0(long $color, MutableState $selectedColor$delegate, MutableState $colorInput$delegate, MutableState $errorMessage$delegate) {
        ColorPickerDialog$lambda$3($selectedColor$delegate, $color);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(ColorKt.m5111toArgb8_81llA($color) & ViewCompat.MEASURED_SIZE_MASK)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        $colorInput$delegate.setValue(str);
        $errorMessage$delegate.setValue("");
        return Unit.INSTANCE;
    }

    public static final Unit ColorPickerDialog$lambda$12$0$4$0(MutableState $selectedColor$delegate, MutableState $colorInput$delegate, MutableState $errorMessage$delegate) {
        ColorPickerDialog$lambda$3($selectedColor$delegate, ColorKt.Color(4284612846L));
        $colorInput$delegate.setValue("#6200EE");
        $errorMessage$delegate.setValue("");
        return Unit.INSTANCE;
    }

    public static final Unit ColorPickerDialog$lambda$10(final SharedPreferences $prefs, final Context $context, final Function0 $onDismiss, final MutableState $colorInput$delegate, final MutableState $errorMessage$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1460@51548L663,1459@51510L832:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1673279651, $changed, -1, "com.yhchat.canarys.ui.settings.ColorPickerDialog.<anonymous> (SettingsScreen.kt:1459)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1703973580, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($prefs) | $composer.changedInstance($context) | $composer.changed($onDismiss);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda42
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.ColorPickerDialog$lambda$10$0$0($prefs, $context, $onDismiss, $colorInput$delegate, $errorMessage$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, new Regex("^#[0-9A-Fa-f]{6}$").matches(ColorPickerDialog$lambda$5($colorInput$delegate)), null, null, null, null, null, null, ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1276991450$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit ColorPickerDialog$lambda$10$0$0(SharedPreferences $prefs, Context $context, Function0 $onDismiss, MutableState $colorInput$delegate, MutableState $errorMessage$delegate) {
        if (new Regex("^#[0-9A-Fa-f]{6}$").matches(ColorPickerDialog$lambda$5($colorInput$delegate))) {
            int colorInt = android.graphics.Color.parseColor(ColorPickerDialog$lambda$5($colorInput$delegate));
            $prefs.edit().putInt("custom_primary_color", colorInt).apply();
            Toast.makeText($context, "\u4e3b\u9898\u989c\u8272\u5df2\u4fdd\u5b58\uff0c\u91cd\u542f\u5e94\u7528\u540e\u751f\u6548", 1).show();
            $onDismiss.invoke();
        } else {
            $errorMessage$delegate.setValue("\u8bf7\u8f93\u5165\u6709\u6548\u7684\u989c\u8272\u503c");
        }
        return Unit.INSTANCE;
    }

    public static final Unit ColorPickerDialog$lambda$11(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1481@52392L74:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1185232545, $changed, -1, "com.yhchat.canarys.ui.settings.ColorPickerDialog.<anonymous> (SettingsScreen.kt:1481)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$SettingsScreenKt.INSTANCE.getLambda$1765038556$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void WebPQualitySettingItem(final Context context, final Modifier modifier, Composer $composer, final int $changed, final int i) {
        Composer $composer2 = $composer.startRestartGroup(-1722769531);
        ComposerKt.sourceInformation($composer2, "C(WebPQualitySettingItem)N(context,modifier)1496@52633L95,1500@52757L90,1504@52876L2492,1504@52857L2511:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if ((i & 2) != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1722769531, $dirty, -1, "com.yhchat.canarys.ui.settings.WebPQualitySettingItem (SettingsScreen.kt:1495)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -2019106908, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("image_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -2019102945, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableFloatStateOf = PrimitiveSnapshotStateKt.mutableFloatStateOf(prefs.getInt("webp_quality", 95));
                $composer2.updateRememberedValue(objMutableFloatStateOf);
                objRememberedValue2 = objMutableFloatStateOf;
            }
            final MutableFloatState webpQuality$delegate = (MutableFloatState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsCustomItem(null, ComposableLambdaKt.rememberComposableLambda(-200851408, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.WebPQualitySettingItem$lambda$4(prefs, webpQuality$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda61
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.WebPQualitySettingItem$lambda$5(context, modifier, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float WebPQualitySettingItem$lambda$2(MutableFloatState $webpQuality$delegate) {
        return $webpQuality$delegate.getFloatValue();
    }

    public static final Unit WebPQualitySettingItem$lambda$4(final SharedPreferences $prefs, final MutableFloatState $webpQuality$delegate, Composer $composer, int $changed) {
        Function0 function0;
        Function0 function02;
        Function0 function03;
        Function0 function04;
        ComposerKt.sourceInformation($composer, "C1505@52886L2476:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-200851408, $changed, -1, "com.yhchat.canarys.ui.settings.WebPQualitySettingItem.<anonymous> (SettingsScreen.kt:1505)");
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
            ComposerKt.sourceInformationMarkerStart($composer, 399566503, "C1510@53014L1056,1537@54096L41,1542@54259L74,1545@54375L182,1540@54182L540,1557@54768L584:SettingsScreen.kt#acwjhs");
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap2 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default);
            Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            int i4 = ((((390 << 3) & 112) << 6) & 896) | 6;
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
            int i6 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, 52158771, "C1518@53370L11,1514@53166L241,1521@53441L40,1523@53515L541:SettingsScreen.kt#acwjhs");
            IconKt.m2816Iconww6aTOc(ImageKt.getImage(Icons.INSTANCE.getDefault()), "\u56fe\u7247\u538b\u7f29", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), $composer, 432, 0);
            SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            Modifier modifierWeight$default = RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), $composer, ((0 >> 3) & 14) | ((0 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap3 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifierKt.materializeModifier($composer, modifierWeight$default);
            Function0 constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            int i7 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
            ComposerKt.sourceInformationMarkerStart($composer, -1855868203, "C1526@53671L10,1524@53576L193,1531@53920L10,1532@53988L11,1529@53790L248:SettingsScreen.kt#acwjhs");
            TextKt.m3359Text4IGK_g("WebP\u538b\u7f29\u8d28\u91cf", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyLarge(), $composer, 196614, 0, 65502);
            TextKt.m3359Text4IGK_g("\u5f53\u524d: " + ((int) WebPQualitySettingItem$lambda$2($webpQuality$delegate)) + "% (\u6570\u503c\u8d8a\u9ad8\u8d28\u91cf\u8d8a\u597d\uff0c\u6587\u4ef6\u8d8a\u5927)", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 0, 65530);
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
            SpacerKt.Spacer(SizeKt.m1088height3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12)), $composer, 6);
            float fWebPQualitySettingItem$lambda$2 = WebPQualitySettingItem$lambda$2($webpQuality$delegate);
            ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = RangesKt.rangeTo(10.0f, 100.0f);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer, -2065283164, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda67
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.WebPQualitySettingItem$lambda$4$0$1$0($webpQuality$delegate, ((Float) obj2).floatValue());
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -2065279344, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($prefs);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda68
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.WebPQualitySettingItem$lambda$4$0$2$0($prefs, $webpQuality$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            SliderKt.Slider(fWebPQualitySettingItem$lambda$2, function1, modifierFillMaxWidth$default2, false, closedFloatingPointRangeRangeTo, 17, (Function0) objRememberedValue2, null, null, $composer, 197040, 392);
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap4 = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifierKt.materializeModifier($composer, modifierFillMaxWidth$default3);
            Function0 constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            int i10 = ((((54 << 3) & 112) << 6) & 896) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!($composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            $composer.startReusableNode();
            if ($composer.getInserting()) {
                function04 = constructor4;
                $composer.createNode(function04);
            } else {
                function04 = constructor4;
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
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            int i12 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -87837948, "C1563@55010L10,1564@55075L11,1561@54922L199,1568@55227L10,1569@55292L11,1566@55138L200:SettingsScreen.kt#acwjhs");
            TextKt.m3359Text4IGK_g("\u4f4e\u8d28\u91cf (10%)", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 6, 0, 65530);
            TextKt.m3359Text4IGK_g("\u9ad8\u8d28\u91cf (100%)", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 6, 0, 65530);
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

    public static final Unit WebPQualitySettingItem$lambda$4$0$1$0(MutableFloatState $webpQuality$delegate, float newValue) {
        $webpQuality$delegate.setFloatValue(newValue);
        return Unit.INSTANCE;
    }

    public static final Unit WebPQualitySettingItem$lambda$4$0$2$0(SharedPreferences $prefs, MutableFloatState $webpQuality$delegate) {
        $prefs.edit().putInt("webp_quality", (int) WebPQualitySettingItem$lambda$2($webpQuality$delegate)).apply();
        return Unit.INSTANCE;
    }

    private static final void HtmlRawTextSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(1262255550);
        ComposerKt.sourceInformation($composer2, "C(HtmlRawTextSettingItem)N(context,modifier)1584@55521L97,1588@55651L88,1597@55975L135,1592@55749L392:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1262255550, $dirty2, -1, "com.yhchat.canarys.ui.settings.HtmlRawTextSettingItem (SettingsScreen.kt:1583)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1846809503, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("message_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, 1846813654, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("show_html_raw_text", false)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState showHtmlRawText$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ImageVector code = CodeKt.getCode(Icons.INSTANCE.getDefault());
            String str = HtmlRawTextSettingItem$lambda$2(showHtmlRawText$delegate) ? "\u663e\u793aHTML\u6e90\u4ee3\u7801\u800c\u4e0d\u662f\u6e32\u67d3\u540e\u7684\u7f51\u9875" : "\u6b63\u5e38\u6e32\u67d3HTML\u6d88\u606f";
            boolean zHtmlRawTextSettingItem$lambda$2 = HtmlRawTextSettingItem$lambda$2(showHtmlRawText$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, 1846824069, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(prefs);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda93
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.HtmlRawTextSettingItem$lambda$4$0(prefs, showHtmlRawText$delegate, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsSwitchItem(code, "HTML\u6d88\u606f\u663e\u793a\u539f\u6587", str, zHtmlRawTextSettingItem$lambda$2, (Function1) objRememberedValue3, false, $composer2, 196656, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda94
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.HtmlRawTextSettingItem$lambda$5(context, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean HtmlRawTextSettingItem$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void HtmlRawTextSettingItem$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit HtmlRawTextSettingItem$lambda$4$0(SharedPreferences $prefs, MutableState $showHtmlRawText$delegate, boolean checked) {
        HtmlRawTextSettingItem$lambda$3($showHtmlRawText$delegate, checked);
        $prefs.edit().putBoolean("show_html_raw_text", checked).apply();
        return Unit.INSTANCE;
    }

    private static final void MarkdownRawTextSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(2082159362);
        ComposerKt.sourceInformation($composer2, "C(MarkdownRawTextSettingItem)N(context,modifier)1613@56302L97,1617@56436L92,1626@56790L143,1621@56538L426:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2082159362, $dirty2, -1, "com.yhchat.canarys.ui.settings.MarkdownRawTextSettingItem (SettingsScreen.kt:1612)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -499609501, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("message_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -499605218, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("show_markdown_raw_text", false)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState showMarkdownRawText$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ImageVector textFields = TextFieldsKt.getTextFields(Icons.INSTANCE.getDefault());
            String str = MarkdownRawTextSettingItem$lambda$2(showMarkdownRawText$delegate) ? "\u663e\u793aMarkdown\u6e90\u4ee3\u7801\u800c\u4e0d\u662f\u6e32\u67d3\u540e\u7684\u683c\u5f0f" : "\u6b63\u5e38\u6e32\u67d3Markdown\u6d88\u606f";
            boolean zMarkdownRawTextSettingItem$lambda$2 = MarkdownRawTextSettingItem$lambda$2(showMarkdownRawText$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -499593839, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(prefs);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda127
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.MarkdownRawTextSettingItem$lambda$4$0(prefs, showMarkdownRawText$delegate, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsSwitchItem(textFields, "Markdown\u6d88\u606f\u663e\u793a\u539f\u6587", str, zMarkdownRawTextSettingItem$lambda$2, (Function1) objRememberedValue3, false, $composer2, 196656, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda128
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.MarkdownRawTextSettingItem$lambda$5(context, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean MarkdownRawTextSettingItem$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MarkdownRawTextSettingItem$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit MarkdownRawTextSettingItem$lambda$4$0(SharedPreferences $prefs, MutableState $showMarkdownRawText$delegate, boolean checked) {
        MarkdownRawTextSettingItem$lambda$3($showMarkdownRawText$delegate, checked);
        $prefs.edit().putBoolean("show_markdown_raw_text", checked).apply();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SettingsGroup(java.lang.String r78, final java.util.List<? extends kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>> r79, androidx.compose.p000ui.Modifier r80, androidx.compose.runtime.Composer r81, final int r82, final int r83) {
        /*
            Method dump skipped, instructions count: 1236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt.SettingsGroup(java.lang.String, java.util.List, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final Unit SettingsGroup$lambda$1$0$0$0(Function2 $item, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1675@58564L6:SettingsScreen.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271423876, $changed, -1, "com.yhchat.canarys.ui.settings.SettingsGroup.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SettingsScreen.kt:1675)");
            }
            $item.invoke($composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void SettingsItemCell(final ImageVector icon, final String title, final String subtitle, final Function0<Unit> onClick, boolean isDestructive, Composer $composer, final int $changed, final int i) {
        final boolean isDestructive2;
        final boolean isDestructive3;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer $composer2 = $composer.startRestartGroup(-1368196657);
        ComposerKt.sourceInformation($composer2, "C(SettingsItemCell)N(icon,title,subtitle,onClick,isDestructive)1693@58844L1382,1693@58806L1420:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(icon) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(title) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(subtitle) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changedInstance(onClick) ? 2048 : 1024;
        }
        int i2 = i & 16;
        if (i2 != 0) {
            $dirty |= 24576;
            isDestructive2 = isDestructive;
        } else if (($changed & 24576) == 0) {
            isDestructive2 = isDestructive;
            $dirty |= $composer2.changed(isDestructive2) ? 16384 : 8192;
        } else {
            isDestructive2 = isDestructive;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 9363) != 9362, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                isDestructive3 = false;
            } else {
                isDestructive3 = isDestructive2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1368196657, $dirty2, -1, "com.yhchat.canarys.ui.settings.SettingsItemCell (SettingsScreen.kt:1692)");
            }
            SettingsCustomItem(onClick, ComposableLambdaKt.rememberComposableLambda(-1317797372, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda122
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsItemCell$lambda$0(icon, title, isDestructive3, subtitle, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer2, 54), $composer2, (($dirty2 >> 9) & 14) | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isDestructive2 = isDestructive3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda123
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsItemCell$lambda$1(icon, title, subtitle, onClick, isDestructive2, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit SettingsItemCell$lambda$0(androidx.compose.p000ui.graphics.vector.ImageVector r73, java.lang.String r74, boolean r75, java.lang.String r76, androidx.compose.runtime.Composer r77, int r78) {
        /*
            Method dump skipped, instructions count: 1027
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt.SettingsItemCell$lambda$0(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, boolean, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void SettingsSwitchItem(final ImageVector icon, final String title, final String subtitle, final boolean checked, final Function1<? super Boolean, Unit> onCheckedChange, boolean isError, Composer $composer, final int $changed, final int i) {
        boolean isError2;
        final boolean isError3;
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Composer $composer2 = $composer.startRestartGroup(-136806016);
        ComposerKt.sourceInformation($composer2, "C(SettingsSwitchItem)N(icon,title,subtitle,checked,onCheckedChange,isError)1744@60483L29,1744@60514L1241,1744@60454L1301:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(icon) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(title) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer2.changed(subtitle) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(checked) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changedInstance(onCheckedChange) ? 16384 : 8192;
        }
        int i2 = i & 32;
        if (i2 != 0) {
            $dirty |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            isError2 = isError;
        } else if ((196608 & $changed) == 0) {
            isError2 = isError;
            $dirty |= $composer2.changed(isError2) ? 131072 : 65536;
        } else {
            isError2 = isError;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute((74899 & $dirty2) != 74898, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (i2 != 0) {
                isError3 = false;
            } else {
                isError3 = isError2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-136806016, $dirty2, -1, "com.yhchat.canarys.ui.settings.SettingsSwitchItem (SettingsScreen.kt:1743)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, 1673411741, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean z = ((57344 & $dirty2) == 16384) | (($dirty2 & 7168) == 2048);
            Object objRememberedValue = $composer2.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SettingsScreenKt.SettingsSwitchItem$lambda$0$0(onCheckedChange, checked);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsCustomItem((Function0) objRememberedValue, ComposableLambdaKt.rememberComposableLambda(-427259019, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.SettingsSwitchItem$lambda$1(icon, title, isError3, checked, subtitle, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            isError2 = isError3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean isError4 = isError2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.SettingsSwitchItem$lambda$2(icon, title, subtitle, checked, onCheckedChange, isError4, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    public static final Unit SettingsSwitchItem$lambda$0$0(Function1 $onCheckedChange, boolean $checked) {
        $onCheckedChange.invoke(Boolean.valueOf(!$checked));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit SettingsSwitchItem$lambda$1(androidx.compose.p000ui.graphics.vector.ImageVector r74, java.lang.String r75, boolean r76, boolean r77, java.lang.String r78, androidx.compose.runtime.Composer r79, int r80) {
        /*
            Method dump skipped, instructions count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SettingsScreenKt.SettingsSwitchItem$lambda$1(androidx.compose.ui.graphics.vector.ImageVector, java.lang.String, boolean, boolean, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    public static final void SettingsCustomItem(Function0<Unit> function0, final Function2<? super Composer, ? super Integer, Unit> content, Composer $composer, final int $changed, final int i) {
        final Function0 onClick;
        Composer $composer2;
        Function0 onClick2;
        Function0 function02;
        Function0 function03;
        int i2;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer $composer3 = $composer.startRestartGroup(-33055441);
        ComposerKt.sourceInformation($composer3, "C(SettingsCustomItem)N(onClick,content):SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        int i3 = i & 1;
        if (i3 != 0) {
            $dirty |= 6;
            onClick = function0;
        } else if (($changed & 6) == 0) {
            onClick = function0;
            $dirty |= $composer3.changedInstance(onClick) ? 4 : 2;
        } else {
            onClick = function0;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(content) ? 32 : 16;
        }
        if (!$composer3.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (i3 != 0) {
                onClick2 = null;
            } else {
                onClick2 = onClick;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-33055441, $dirty, -1, "com.yhchat.canarys.ui.settings.SettingsCustomItem (SettingsScreen.kt:1790)");
            }
            if (onClick2 != null) {
                $composer3.startReplaceGroup(-1207003643);
                ComposerKt.sourceInformation($composer3, "1792@61926L158");
                Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, onClick2, 15, null);
                ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer3.getCurrentCompositionLocalMap();
                int $dirty2 = $dirty;
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer3, modifierM516clickableoSLSa3U$default);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i4 = ((((0 << 3) & 112) << 6) & 896) | 6;
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
                Updater.m4383setimpl(composerM4376constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl.getInserting()) {
                    i2 = iHashCode;
                } else {
                    i2 = iHashCode;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(i2))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i5 = (i4 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i6 = ((0 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer3, -2049520886, "C1797@62065L9:SettingsScreen.kt#acwjhs");
                    content.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    ComposerKt.sourceInformationMarkerEnd($composer3);
                    $composer3.endReplaceGroup();
                    $composer2 = $composer3;
                }
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(i2));
                composerM4376constructorimpl.apply(Integer.valueOf(i2), setCompositeKeyHash);
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i52 = (i4 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i62 = ((0 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -2049520886, "C1797@62065L9:SettingsScreen.kt#acwjhs");
                content.invoke($composer3, Integer.valueOf(($dirty2 >> 3) & 14));
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endReplaceGroup();
                $composer2 = $composer3;
            } else {
                int $dirty3 = $dirty;
                $composer3.startReplaceGroup(-1206827718);
                ComposerKt.sourceInformation($composer3, "1800@62106L73");
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                ComposerKt.sourceInformationMarkerStart($composer3, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                ComposerKt.sourceInformationMarkerStart($composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer3, 0));
                CompositionLocalMap currentCompositionLocalMap2 = $composer3.getCurrentCompositionLocalMap();
                $composer2 = $composer3;
                Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier($composer3, modifierFillMaxWidth$default);
                Function0 constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                int i7 = ((((6 << 3) & 112) << 6) & 896) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!($composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                $composer3.startReusableNode();
                if ($composer3.getInserting()) {
                    function02 = constructor2;
                    $composer3.createNode(function02);
                } else {
                    function02 = constructor2;
                    $composer3.useNode();
                }
                Composer composerM4376constructorimpl2 = Updater.m4376constructorimpl($composer3);
                Updater.m4383setimpl(composerM4376constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m4383setimpl(composerM4376constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2 setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (composerM4376constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM4376constructorimpl2.rememberedValue(), Integer.valueOf(iHashCode2))) {
                    composerM4376constructorimpl2.updateRememberedValue(Integer.valueOf(iHashCode2));
                    composerM4376constructorimpl2.apply(Integer.valueOf(iHashCode2), setCompositeKeyHash2);
                }
                Updater.m4383setimpl(composerM4376constructorimpl2, modifierMaterializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                int i8 = (i7 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer3, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                int i9 = ((6 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer3, -386218399, "C1801@62160L9:SettingsScreen.kt#acwjhs");
                content.invoke($composer3, Integer.valueOf(($dirty3 >> 3) & 14));
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                ComposerKt.sourceInformationMarkerEnd($composer3);
                $composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onClick = onClick2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.SettingsCustomItem$lambda$2(onClick, content, $changed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ThemeSettingItem(final Context context, Composer $composer, final int $changed) {
        Intrinsics.checkNotNullParameter(context, "context");
        Composer $composer2 = $composer.startRestartGroup(1948723428);
        ComposerKt.sourceInformation($composer2, "C(ThemeSettingItem)N(context)1811@62263L37:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        if (!$composer2.shouldExecute(($dirty & 3) != 2, $dirty & 1)) {
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1948723428, $dirty, -1, "com.yhchat.canarys.ui.settings.ThemeSettingItem (SettingsScreen.kt:1810)");
            }
            ThemeSettingsGroup(context, null, $composer2, $dirty & 14, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SettingsScreenKt.ThemeSettingItem$lambda$0(context, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void FloatingAudioButtonSettingItem(final Context context, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final Modifier modifier2;
        Composer $composer2 = $composer.startRestartGroup(772642118);
        ComposerKt.sourceInformation($composer2, "C(FloatingAudioButtonSettingItem)N(context,modifier)1822@62459L94,1826@62594L95,1835@62934L151,1830@62699L392:SettingsScreen.kt#acwjhs");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changedInstance(context) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer2.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2.skipToGroupEnd();
            modifier2 = modifier;
        } else {
            if ((i & 2) != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(772642118, $dirty2, -1, "com.yhchat.canarys.ui.settings.FloatingAudioButtonSettingItem (SettingsScreen.kt:1821)");
            }
            ComposerKt.sourceInformationMarkerStart($composer2, -520263132, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object sharedPreferences = context.getSharedPreferences("chat_settings", 0);
                $composer2.updateRememberedValue(sharedPreferences);
                objRememberedValue = sharedPreferences;
            }
            final SharedPreferences prefs = (SharedPreferences) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ComposerKt.sourceInformationMarkerStart($composer2, -520258811, "CC(remember):SettingsScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(prefs.getBoolean("show_floating_audio_button", true)), null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue2 = objMutableStateOf$default;
            }
            final MutableState showFloatingAudioButton$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            ImageVector mic = MicKt.getMic(Icons.INSTANCE.getDefault());
            String str = FloatingAudioButtonSettingItem$lambda$2(showFloatingAudioButton$delegate) ? "\u5728\u7fa4\u804a\u754c\u9762\u53f3\u4e0b\u89d2\u663e\u793a\u60ac\u6d6e\u97f3\u9891\u6309\u94ae" : "\u9690\u85cf\u60ac\u6d6e\u97f3\u9891\u6309\u94ae";
            boolean zFloatingAudioButtonSettingItem$lambda$2 = FloatingAudioButtonSettingItem$lambda$2(showFloatingAudioButton$delegate);
            ComposerKt.sourceInformationMarkerStart($composer2, -520247875, "CC(remember):SettingsScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(prefs);
            Object objRememberedValue3 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda57
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SettingsScreenKt.FloatingAudioButtonSettingItem$lambda$4$0(prefs, showFloatingAudioButton$delegate, ((Boolean) obj2).booleanValue());
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue3 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            SettingsSwitchItem(mic, "\u663e\u793a\u60ac\u6d6e\u97f3\u9891\u6309\u94ae", str, zFloatingAudioButtonSettingItem$lambda$2, (Function1) objRememberedValue3, false, $composer2, 48, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SettingsScreenKt$$ExternalSyntheticLambda58
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SettingsScreenKt.FloatingAudioButtonSettingItem$lambda$5(context, modifier2, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final boolean FloatingAudioButtonSettingItem$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void FloatingAudioButtonSettingItem$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    public static final Unit FloatingAudioButtonSettingItem$lambda$4$0(SharedPreferences $prefs, MutableState $showFloatingAudioButton$delegate, boolean checked) {
        FloatingAudioButtonSettingItem$lambda$3($showFloatingAudioButton$delegate, checked);
        $prefs.edit().putBoolean("show_floating_audio_button", checked).apply();
        return Unit.INSTANCE;
    }
}
