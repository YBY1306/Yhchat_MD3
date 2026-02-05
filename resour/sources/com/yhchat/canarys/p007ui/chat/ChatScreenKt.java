package com.yhchat.canarys.p007ui.chat;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.widget.Toast;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifierKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.KeyboardArrowDownKt;
import androidx.compose.material.icons.filled.KeyboardArrowUpKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ExposedDropdownMenuBoxScope;
import androidx.compose.material3.ExposedDropdownMenuDefaults;
import androidx.compose.material3.FloatingActionButtonKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p000ui.Alignment;
import androidx.compose.p000ui.ComposedModifierKt;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.draw.ClipKt;
import androidx.compose.p000ui.focus.FocusRequester;
import androidx.compose.p000ui.graphics.Color;
import androidx.compose.p000ui.graphics.ColorKt;
import androidx.compose.p000ui.graphics.Shape;
import androidx.compose.p000ui.graphics.vector.ImageVector;
import androidx.compose.p000ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.p000ui.input.pointer.SuspendingPointerInputFilterKt;
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
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
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
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.profileinstaller.ProfileVerifier;
import coil.compose.SingletonAsyncImageKt;
import coil.request.ImageRequest;
import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.data.model.Expression;
import com.yhchat.canarys.data.model.GroupMemberInfo;
import com.yhchat.canarys.data.model.Instruction;
import com.yhchat.canarys.data.model.MenuButton;
import com.yhchat.canarys.data.model.MessageContent;
import com.yhchat.canarys.data.model.MessageEditRecord;
import com.yhchat.canarys.data.model.MessageTag;
import com.yhchat.canarys.data.model.StickerItem;
import com.yhchat.canarys.p007ui.bot.BotDetailActivity;
import com.yhchat.canarys.p007ui.bot.BotInfoActivity;
import com.yhchat.canarys.p007ui.community.PostDetailActivity;
import com.yhchat.canarys.p007ui.components.ImageUtils;
import com.yhchat.canarys.p007ui.components.VoiceMessageViewModel;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.p007ui.group.GroupInfoActivity;
import com.yhchat.canarys.p007ui.sticker.StickerPackDetailActivity;
import com.yhchat.canarys.p007ui.user.UserDetailActivity;
import com.yhchat.canarys.proto.bot.Bot;
import com.yhchat.canarys.service.AudioPlayerService;
import com.yhchat.canarys.service.FileDownloadService;
import com.yhchat.canarys.utils.PermissionUtils;
import com.yhchat.canarys.utils.UnifiedLinkHandler;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChatScreen.kt */
@Metadata(m168d1 = {"\u0000\u00a6\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u008b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2&\b\u0002\u0010\u000e\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007\u00a2\u0006\u0002\u0010\u001b\u001a\u0091\u0002\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010#2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010$2\u001a\b\u0002\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010#2\u001a\b\u0002\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010&2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010#2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010#2\"\b\u0002\u0010+\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010$2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005H\u0003\u00a2\u0006\u0002\u0010-\u001a\u00ab\u0001\u0010.\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020 2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0010\b\u0002\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tH\u0003\u00a2\u0006\u0002\u00104\u001a\u001e\u00105\u001a\u00020 2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0002\u00109\u001a?\u0010:\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010;\u001a\u00020 2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005H\u0003\u00a2\u0006\u0002\u0010=\u001a\u001a\u0010>\u001a\u00020\u000b*\u00020\u000b2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0002\u001a\u001f\u0010@\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003\u00a2\u0006\u0002\u0010A\u001a\u001f\u0010B\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003\u00a2\u0006\u0002\u0010A\u001a]\u0010C\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010#2\u000e\b\u0002\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a2\u0006\u0002\u0010G\u001aG\u0010H\u001a\u00020\u00012\b\u0010I\u001a\u0004\u0018\u00010\u00032\b\u0010J\u001a\u0004\u0018\u00010\u00032\b\u0010K\u001a\u0004\u0018\u00010\u00032\b\u0010L\u001a\u0004\u0018\u00010\u00032\u0006\u0010M\u001a\u00020N2\u0006\u0010\u001f\u001a\u00020 H\u0003\u00a2\u0006\u0004\bO\u0010P\u001a#\u0010Q\u001a\u00020\u00012\u0006\u0010R\u001a\u00020\u00032\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003\u00a2\u0006\u0002\u0010S\u001a\u0015\u0010T\u001a\u00020\u00012\u0006\u0010U\u001a\u00020VH\u0003\u00a2\u0006\u0002\u0010W\u001a\u0010\u0010X\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020ZH\u0002\u001a\u0010\u0010[\u001a\u00020\u00032\u0006\u0010Y\u001a\u00020ZH\u0002\u001a\u0010\u0010\\\u001a\u00020\u00032\u0006\u0010]\u001a\u00020ZH\u0002\u001a\u0010\u0010^\u001a\u00020\u00032\u0006\u0010_\u001a\u00020ZH\u0002\u001a(\u0010`\u001a\u00020\u00012\u0006\u00106\u001a\u0002072\u0006\u0010a\u001a\u00020\u00032\u0006\u0010b\u001a\u00020\u00032\u0006\u0010c\u001a\u00020ZH\u0002\u001a)\u0010d\u001a\u00020\u00012\u0006\u0010e\u001a\u00020\u00032\u0006\u0010M\u001a\u00020N2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\bf\u0010g\u001a9\u0010h\u001a\u00020\u00012\u0006\u00108\u001a\u00020\u00032\u0006\u0010i\u001a\u00020Z2\u0006\u0010M\u001a\u00020N2\u0006\u0010j\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\bk\u0010l\u001a1\u0010m\u001a\u00020\u00012\u0006\u0010n\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010M\u001a\u00020N2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\bo\u0010p\u001a@\u0010q\u001a\u00020\u00012\u0006\u00106\u001a\u0002072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010r\u001a\u00020\u00052\u0006\u0010s\u001a\u00020\u00032\u0006\u0010t\u001a\u00020\u00032\u0006\u0010u\u001a\u00020\u0003H\u0002\u001a\u0015\u0010v\u001a\u00020N2\u0006\u0010w\u001a\u00020\u0003H\u0002\u00a2\u0006\u0002\u0010x\u001a=\u0010y\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010z\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010&H\u0007\u00a2\u0006\u0002\u0010{\u001a\u0091\u0002\u0010|\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0014\b\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010#2 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010$2\u001a\b\u0002\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010#2\u001a\b\u0002\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010&2\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010#2\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010#2\"\b\u0002\u0010+\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010$2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0005H\u0003\u00a2\u0006\u0002\u0010-\u00a8\u0006}\u00b2\u0006\n\u0010~\u001a\u00020\u007fX\u008a\u0084\u0002\u00b2\u0006\u000b\u0010\u0080\u0001\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0081\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0082\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0083\u0001\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0084\u0001\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001X\u008a\u008e\u0002\u00b2\u0006\u0018\u0010\u0087\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0088\u0001X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0089\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\r\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u008b\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\r\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\r\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u008e\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\r\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u001eX\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0090\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0091\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0092\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0093\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0094\u0001\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\n\u0010;\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0095\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\u0012\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020V0\u0097\u0001X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u0098\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\r\u0010\u0099\u0001\u001a\u0004\u0018\u00010\u0003X\u008a\u008e\u0002\u00b2\u0006\f\u0010\u009a\u0001\u001a\u00030\u009b\u0001X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u009c\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u009d\u0001\u001a\u00020\u0003X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u009e\u0001\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u009f\u0001\u001a\u00020 X\u008a\u008e\u0002\u00b2\u0006\u000b\u0010\u00a0\u0001\u001a\u00020 X\u008a\u008e\u0002"}, m169d2 = {"ChatScreen", "", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_NAME, "userId", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/yhchat/canarys/ui/chat/ChatViewModel;", "onAvatarClick", "Lkotlin/Function4;", "onImagePickerClick", "onCameraClick", "onFilePickerClick", "onVideoPickerClick", "imageUriToSend", "Landroid/net/Uri;", "fileUriToSend", "videoUriToSend", "onImageSent", "onFileSent", "onVideoSent", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/yhchat/canarys/ui/chat/ChatViewModel;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "MessageItem", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "isMyMessage", "", "conversationChatType", "onImageClick", "Lkotlin/Function1;", "Lkotlin/Function3;", "onAvatarLongClick", "Lkotlin/Function2;", "onAddExpression", "onQuote", "onRecall", "onEdit", "onBlockUser", "memberPermission", "(Lcom/yhchat/canarys/data/model/ChatMessage;ZILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;III)V", "MessageContextMenu", "showRecall", "onDismiss", "onCopyAll", "onFreeCopy", "onSaveAudio", "(Lcom/yhchat/canarys/data/model/ChatMessage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "saveVoiceToSavedAudios", "context", "Landroid/content/Context;", "audioUrl", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "SenderNameAndTags", "tagsExpanded", "onToggleExpand", "(Lcom/yhchat/canarys/data/model/ChatMessage;ZZLkotlin/jvm/functions/Function0;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V", "passThroughLongPress", "onLongClick", "RecallMessageItem", "(Lcom/yhchat/canarys/data/model/ChatMessage;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TipMessageItem", "MessageContentView", "content", "Lcom/yhchat/canarys/data/model/MessageContent;", "contentType", "(Lcom/yhchat/canarys/data/model/ChatMessage;Lcom/yhchat/canarys/data/model/MessageContent;IZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PostMessageView", "postId", "postTitle", "postContent", "postContentType", "textColor", "Landroidx/compose/ui/graphics/Color;", "PostMessageView-yrwZFoE", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLandroidx/compose/runtime/Composer;I)V", "EditHistoryDialog", "msgId", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "EditRecordItem", "record", "Lcom/yhchat/canarys/data/model/MessageEditRecord;", "(Lcom/yhchat/canarys/data/model/MessageEditRecord;Landroidx/compose/runtime/Composer;I)V", "formatTimestamp", "timestamp", "", "formatRecallTime", "formatFileSize", "bytes", "formatAudioDuration", "seconds", "handleFileDownload", "fileUrl", "fileName", "fileSize", "VideoMessageView", "videoUrl", "VideoMessageView-3IgeMak", "(Ljava/lang/String;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AudioMessageView", "duration", "senderName", "AudioMessageView-T042LqI", "(Ljava/lang/String;JJLjava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MessageButtons", "buttonsJson", "MessageButtons-cf5BqRc", "(Ljava/lang/String;Lcom/yhchat/canarys/data/model/ChatMessage;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "handleButtonClick", "actionType", "url", "value", "buttonText", "parseTagColor", "colorString", "(Ljava/lang/String;)J", "MessageEditDialog", "onConfirm", "(Lcom/yhchat/canarys/data/model/ChatMessage;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "AnimatedMessageItem", "app_debug", "uiState", "Lcom/yhchat/canarys/ui/chat/ChatUiState;", "inputText", "showFloatingAudioButton", "showFloatingVoiceWindow", "defaultSendMessageType", "selectedMessageType", "selectedInstruction", "Lcom/yhchat/canarys/data/model/Instruction;", "mentionedUsers", "", "showImageViewer", "currentImageUrl", "showScrollToBottomButton", "quotedMessageId", "quotedMessageText", "showEditDialog", "messageToEdit", "shouldShowKeyboard", "showBotBoard", "showContextMenu", "showFreeCopyDialog", "freeCopyText", "showEditHistory", "editRecords", "", "isLoading", "errorMessage", "downloadState", "Lcom/yhchat/canarys/ui/chat/DownloadState;", "isCurrentlyPlaying", "editedContent", "selectedContentType", "expanded", "isVisible"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ChatScreenKt {

    /* compiled from: ChatScreen.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadState.values().length];
            try {
                iArr[DownloadState.NotStarted.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[DownloadState.Downloading.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[DownloadState.Completed.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedMessageItem$lambda$15(ChatMessage chatMessage, boolean z, int i, Modifier modifier, Function1 function1, Function3 function3, Function2 function2, Function1 function12, Function2 function22, Function1 function13, Function1 function14, Function3 function32, Integer num, int i2, int i3, int i4, Composer composer, int i5) {
        AnimatedMessageItem(chatMessage, z, i, modifier, function1, function3, function2, function12, function22, function13, function14, function32, num, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioMessageView_T042LqI$lambda$6(String str, long j, long j2, String str2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m10615AudioMessageViewT042LqI(str, j, j2, str2, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$81(String str, int i, String str2, String str3, Function0 function0, Modifier modifier, ChatViewModel chatViewModel, Function4 function4, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Uri uri, Uri uri2, Uri uri3, Function0 function06, Function0 function07, Function0 function08, int i2, int i3, int i4, Composer composer, int i5) {
        ChatScreen(str, i, str2, str3, function0, modifier, chatViewModel, function4, function02, function03, function04, function05, uri, uri2, uri3, function06, function07, function08, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditHistoryDialog$lambda$12(String str, Function0 function0, int i, Composer composer, int i2) {
        EditHistoryDialog(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditRecordItem$lambda$2(MessageEditRecord messageEditRecord, int i, Composer composer, int i2) {
        EditRecordItem(messageEditRecord, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageButtons_cf5BqRc$lambda$2(String str, ChatMessage chatMessage, long j, Modifier modifier, int i, int i2, Composer composer, int i3) throws JSONException {
        m10616MessageButtonscf5BqRc(str, chatMessage, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContentView$lambda$6(ChatMessage chatMessage, MessageContent messageContent, int i, boolean z, Modifier modifier, Function1 function1, Function0 function0, int i2, int i3, Composer composer, int i4) throws JSONException {
        MessageContentView(chatMessage, messageContent, i, z, modifier, function1, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContextMenu$lambda$2(ChatMessage chatMessage, boolean z, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, int i, int i2, int i3, Composer composer, int i4) {
        MessageContextMenu(chatMessage, z, function0, function02, function03, function04, function05, function06, function07, function08, function09, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$12(ChatMessage chatMessage, Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        MessageEditDialog(chatMessage, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$17(ChatMessage chatMessage, boolean z, int i, Modifier modifier, Function1 function1, Function3 function3, Function2 function2, Function1 function12, Function2 function22, Function1 function13, Function1 function14, Function3 function32, Integer num, int i2, int i3, int i4, Composer composer, int i5) {
        MessageItem(chatMessage, z, i, modifier, function1, function3, function2, function12, function22, function13, function14, function32, num, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$18(ChatMessage chatMessage, boolean z, int i, Modifier modifier, Function1 function1, Function3 function3, Function2 function2, Function1 function12, Function2 function22, Function1 function13, Function1 function14, Function3 function32, Integer num, int i2, int i3, int i4, Composer composer, int i5) {
        MessageItem(chatMessage, z, i, modifier, function1, function3, function2, function12, function22, function13, function14, function32, num, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$39(ChatMessage chatMessage, boolean z, int i, Modifier modifier, Function1 function1, Function3 function3, Function2 function2, Function1 function12, Function2 function22, Function1 function13, Function1 function14, Function3 function32, Integer num, int i2, int i3, int i4, Composer composer, int i5) {
        MessageItem(chatMessage, z, i, modifier, function1, function3, function2, function12, function22, function13, function14, function32, num, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostMessageView_yrwZFoE$lambda$0(String str, String str2, String str3, String str4, long j, boolean z, int i, Composer composer, int i2) {
        m10617PostMessageViewyrwZFoE(str, str2, str3, str4, j, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostMessageView_yrwZFoE$lambda$3(String str, String str2, String str3, String str4, long j, boolean z, int i, Composer composer, int i2) {
        m10617PostMessageViewyrwZFoE(str, str2, str3, str4, j, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecallMessageItem$lambda$1(ChatMessage chatMessage, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RecallMessageItem(chatMessage, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SenderNameAndTags$lambda$1(ChatMessage chatMessage, boolean z, boolean z2, Function0 function0, Integer num, int i, int i2, Composer composer, int i3) {
        SenderNameAndTags(chatMessage, z, z2, function0, num, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TipMessageItem$lambda$1(ChatMessage chatMessage, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TipMessageItem(chatMessage, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoMessageView_3IgeMak$lambda$5(String str, long j, Modifier modifier, int i, int i2, Composer composer, int i3) {
        m10618VideoMessageView3IgeMak(str, j, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ String access$ChatScreen$lambda$45(MutableState $quotedMessageId$delegate) {
        return ChatScreen$lambda$45($quotedMessageId$delegate);
    }

    public static final /* synthetic */ void access$ChatScreen$lambda$46(MutableState $quotedMessageId$delegate, String str) {
        $quotedMessageId$delegate.setValue(str);
    }

    public static final /* synthetic */ String access$ChatScreen$lambda$48(MutableState $quotedMessageText$delegate) {
        return ChatScreen$lambda$48($quotedMessageText$delegate);
    }

    public static final /* synthetic */ void access$ChatScreen$lambda$49(MutableState $quotedMessageText$delegate, String str) {
        $quotedMessageText$delegate.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$0$0(String str, String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:427:0x0ba4  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x0bb3  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0c03  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0c5a  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0c5c  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0c7e  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x0cdb  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0cf6  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x0d47  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0d52  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0d64  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0db3  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0dc3  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0df3  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0df5  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0dfd  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0dff  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x0e0b  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0e1b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0e71  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0e7d  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0ec5  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0ec7  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0eda  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0ee8  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0f26  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0f28  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0f32  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x0f40  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0f75  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0f81  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0fc8  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0fca  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0fd2  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0fd4  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0fe1  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0fed  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x1079  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x1085  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x108b  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x10bc  */
    /* JADX WARN: Removed duplicated region for block: B:580:0x10d0  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x1122  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x116e  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x1191  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x11bf  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x12b6  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x1311  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x1326  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x1394  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x144a  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x145f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void ChatScreen(final java.lang.String r90, final int r91, final java.lang.String r92, final java.lang.String r93, final kotlin.jvm.functions.Function0<kotlin.Unit> r94, androidx.compose.p000ui.Modifier r95, com.yhchat.canarys.p007ui.chat.ChatViewModel r96, kotlin.jvm.functions.Function4<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r97, kotlin.jvm.functions.Function0<kotlin.Unit> r98, kotlin.jvm.functions.Function0<kotlin.Unit> r99, kotlin.jvm.functions.Function0<kotlin.Unit> r100, kotlin.jvm.functions.Function0<kotlin.Unit> r101, android.net.Uri r102, android.net.Uri r103, android.net.Uri r104, kotlin.jvm.functions.Function0<kotlin.Unit> r105, kotlin.jvm.functions.Function0<kotlin.Unit> r106, kotlin.jvm.functions.Function0<kotlin.Unit> r107, androidx.compose.runtime.Composer r108, final int r109, final int r110, final int r111) {
        /*
            Method dump skipped, instructions count: 5330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.ChatScreen(java.lang.String, int, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, com.yhchat.canarys.ui.chat.ChatViewModel, kotlin.jvm.functions.Function4, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, android.net.Uri, android.net.Uri, android.net.Uri, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChatUiState ChatScreen$lambda$9(State<ChatUiState> state) {
        return (ChatUiState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChatScreen$lambda$12(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ChatScreen$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChatScreen$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatScreen$lambda$19(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChatScreen$lambda$20(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$21$0(VoiceMessageViewModel $voiceMessageViewModel, Context $context, final String $chatId, final int $chatType, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        $voiceMessageViewModel.selectAudioFromStorage($context, uri, $chatId, $chatType, new Function4() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda82
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ChatScreenKt.ChatScreen$lambda$21$0$0($chatId, $chatType, (String) obj, (String) obj2, ((Long) obj3).longValue(), ((Long) obj4).longValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$21$0$0(String $chatId, int $chatType, String fileKey, String fileHash, long fileSize, long duration) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        Intrinsics.checkNotNullParameter(fileHash, "fileHash");
        Log.d("ChatScreen", "\u1f3a4 \u4ece\u60ac\u6d6e\u7a97\u53e3\u53d1\u9001\u8bed\u97f3: chatId=" + $chatId + " chatType=" + $chatType + " key=" + fileKey);
        return Unit.INSTANCE;
    }

    private static final int ChatScreen$lambda$23(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void ChatScreen$lambda$24(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ChatScreen$lambda$25$0(final SharedPreferences $chatPrefs, final MutableState $defaultSendMessageType$delegate, final MutableState $showFloatingAudioButton$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final SharedPreferences.OnSharedPreferenceChangeListener listener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda7
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                ChatScreenKt.ChatScreen$lambda$25$0$0($chatPrefs, $defaultSendMessageType$delegate, $showFloatingAudioButton$delegate, sharedPreferences, str);
            }
        };
        $chatPrefs.registerOnSharedPreferenceChangeListener(listener);
        return new DisposableEffectResult() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$ChatScreen$lambda$25$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                $chatPrefs.unregisterOnSharedPreferenceChangeListener(listener);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final void ChatScreen$lambda$25$0$0(SharedPreferences $chatPrefs, MutableState $defaultSendMessageType$delegate, MutableState $showFloatingAudioButton$delegate, SharedPreferences sharedPreferences, String key) {
        if (key != null) {
            int i = 1;
            switch (key.hashCode()) {
                case 964024210:
                    if (key.equals("show_floating_audio_button")) {
                        ChatScreen$lambda$17($showFloatingAudioButton$delegate, $chatPrefs.getBoolean("show_floating_audio_button", true));
                        break;
                    }
                    break;
                case 2100125003:
                    if (key.equals("default_send_message_type")) {
                        int i2 = $chatPrefs.getInt("default_send_message_type", 1);
                        switch (i2) {
                            case 1:
                            case 3:
                            case 8:
                                i = i2;
                                break;
                        }
                        ChatScreen$lambda$24($defaultSendMessageType$delegate, i);
                        break;
                    }
                    break;
            }
        }
    }

    private static final int ChatScreen$lambda$27(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void ChatScreen$lambda$28(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final Instruction ChatScreen$lambda$30(MutableState<Instruction> mutableState) {
        return mutableState.getValue();
    }

    private static final Map<String, String> ChatScreen$lambda$33(MutableState<Map<String, String>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ChatScreen$lambda$36(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChatScreen$lambda$37(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String ChatScreen$lambda$39(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ChatScreen$lambda$42(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatScreen$lambda$43(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChatScreen$lambda$45(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ChatScreen$lambda$48(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ChatScreen$lambda$51(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChatScreen$lambda$52(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final ChatMessage ChatScreen$lambda$54(MutableState<ChatMessage> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean ChatScreen$lambda$58(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ChatScreen$lambda$59(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean ChatScreen$lambda$61(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void ChatScreen$lambda$62(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult ChatScreen$lambda$69$0(final ChatViewModel $viewModel, final MutableState $inputText$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$ChatScreen$lambda$69$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                $viewModel.saveCurrentReadPosition();
                if (ChatScreenKt.ChatScreen$lambda$12($inputText$delegate).length() > 0) {
                    $viewModel.saveDraft(ChatScreenKt.ChatScreen$lambda$12($inputText$delegate));
                } else {
                    $viewModel.clearDraft();
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$73$0(Function0 $onBackClick) {
        $onBackClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$74$0(ChatViewModel $viewModel) {
        $viewModel.refreshLatestMessages();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$75$0(VoiceMessageViewModel $voiceMessageViewModel, Context $context, final String $chatId, final int $chatType, Uri uri) {
        if (uri != null) {
            Log.d("ChatScreen", "\u60ac\u6d6e\u7403\u97f3\u9891\u9009\u62e9\u7ed3\u679c: " + uri);
            $voiceMessageViewModel.selectAudioFromStorage($context, uri, $chatId, $chatType, new Function4() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return ChatScreenKt.ChatScreen$lambda$75$0$0$0($chatId, $chatType, (String) obj, (String) obj2, ((Long) obj3).longValue(), ((Long) obj4).longValue());
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$75$0$0$0(String $chatId, int $chatType, String fileKey, String fileHash, long fileSize, long duration) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        Intrinsics.checkNotNullParameter(fileHash, "fileHash");
        Log.w("ChatScreen", "\u1f3a4 \u60ac\u6d6e\u7403\u8bed\u97f3\u6d88\u606f\u53d1\u9001: chatId=" + $chatId + " chatType=" + $chatType + " key=" + fileKey + " hash=" + fileHash + " size=" + fileSize + " duration=" + duration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x09b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x09f1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0a61  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0bfb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0cce  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0da1  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0dd8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0e64  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0e7c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0ef0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0f10  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0f13  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0f18  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0f1b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0f72  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0f80  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0fbf  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x100d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x10eb  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x111a  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x112c  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x1152  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x11fc  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x1235  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x1247  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x1270  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x127c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x12f2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x14d3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x14e5  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x1521  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x1536  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChatScreen$lambda$76$0(final int r151, androidx.compose.foundation.layout.BoxScope r152, androidx.compose.material.pullrefresh.PullRefreshState r153, final android.content.Context r154, final com.yhchat.canarys.p007ui.chat.ChatViewModel r155, final java.lang.String r156, final kotlinx.coroutines.CoroutineScope r157, androidx.compose.foundation.lazy.LazyListState r158, final kotlin.jvm.functions.Function0 r159, final kotlin.jvm.functions.Function0 r160, final kotlin.jvm.functions.Function0 r161, final kotlin.jvm.functions.Function0 r162, final androidx.compose.p000ui.focus.FocusRequester r163, com.yhchat.canarys.p007ui.components.VoiceMessageViewModel r164, final java.lang.String r165, final androidx.compose.runtime.State r166, final kotlin.jvm.functions.Function0 r167, final androidx.compose.runtime.MutableState r168, final androidx.compose.runtime.MutableState r169, final androidx.compose.runtime.MutableState r170, final java.util.List r171, final kotlin.jvm.functions.Function4 r172, final int r173, final androidx.compose.runtime.MutableState r174, final androidx.compose.runtime.MutableState r175, final androidx.compose.runtime.MutableState r176, final androidx.compose.runtime.MutableState r177, final androidx.compose.runtime.MutableState r178, final androidx.compose.runtime.MutableState r179, final androidx.compose.runtime.MutableState r180, androidx.compose.runtime.MutableState r181, final androidx.compose.runtime.MutableState r182, final androidx.compose.runtime.MutableState r183, final androidx.compose.runtime.MutableState r184, androidx.compose.runtime.MutableState r185, final androidx.activity.compose.ManagedActivityResultLauncher r186, final androidx.compose.runtime.MutableState r187, androidx.compose.runtime.Composer r188, int r189) {
        /*
            Method dump skipped, instructions count: 5444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.ChatScreen$lambda$76$0(int, androidx.compose.foundation.layout.BoxScope, androidx.compose.material.pullrefresh.PullRefreshState, android.content.Context, com.yhchat.canarys.ui.chat.ChatViewModel, java.lang.String, kotlinx.coroutines.CoroutineScope, androidx.compose.foundation.lazy.LazyListState, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, androidx.compose.ui.focus.FocusRequester, com.yhchat.canarys.ui.components.VoiceMessageViewModel, java.lang.String, androidx.compose.runtime.State, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, kotlin.jvm.functions.Function4, int, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.activity.compose.ManagedActivityResultLauncher, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChatScreen$lambda$76$0$0$0(java.lang.String r52, int r53, androidx.compose.runtime.State r54, androidx.compose.runtime.Composer r55, int r56) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.ChatScreen$lambda$76$0$0$0(java.lang.String, int, androidx.compose.runtime.State, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$1(Function0 $onBackClick, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C487@18496L226:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1572689943, $changed, -1, "com.yhchat.canarys.ui.chat.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:487)");
            }
            IconButtonKt.IconButton($onBackClick, null, false, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$489363014$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$2(final int $chatType, final String $chatId, final String $chatName, final Context $context, RowScope TopAppBar, Composer $composer, int $changed) {
        int i;
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation($composer, "C:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-163970350, $changed, -1, "com.yhchat.canarys.ui.chat.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:496)");
            }
            if ($chatType == 1) {
                $composer.startReplaceGroup(-1462789846);
                ComposerKt.sourceInformation($composer, "497@18875L382,497@18854L606");
                ComposerKt.sourceInformationMarkerStart($composer, 1338287664, "CC(remember):ChatScreen.kt#9igjgp");
                boolean zChanged = $composer.changed($chatId) | $composer.changed($chatName) | $composer.changedInstance($context);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda75
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$76$0$0$2$0$0($chatId, $chatName, $context);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                i = -1481492208;
                IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1323573722$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            } else {
                i = -1481492208;
                $composer.startReplaceGroup(-1481492208);
            }
            $composer.endReplaceGroup();
            if ($chatType == 2) {
                $composer.startReplaceGroup(-1462074056);
                ComposerKt.sourceInformation($composer, "513@19592L528,513@19571L752");
                ComposerKt.sourceInformationMarkerStart($composer, 1338310754, "CC(remember):ChatScreen.kt#9igjgp");
                boolean zChanged2 = $composer.changed($chatId) | $composer.changed($chatName) | $composer.changedInstance($context);
                Object objRememberedValue2 = $composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda76
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$76$0$0$2$1$0($chatId, $chatName, $context);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1883840003$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            } else {
                $composer.startReplaceGroup(i);
            }
            $composer.endReplaceGroup();
            if ($chatType == 3) {
                $composer.startReplaceGroup(-1461217123);
                ComposerKt.sourceInformation($composer, "528@20459L426,528@20438L651");
                ComposerKt.sourceInformationMarkerStart($composer, 1338338396, "CC(remember):ChatScreen.kt#9igjgp");
                boolean zChanged3 = $composer.changed($chatId) | $composer.changed($chatName) | $composer.changedInstance($context) | $composer.changed($chatType);
                Object objRememberedValue3 = $composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda78
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChatScreenKt.ChatScreen$lambda$76$0$0$2$2$0($chatId, $chatName, $context, $chatType);
                        }
                    };
                    $composer.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                ComposerKt.sourceInformationMarkerEnd($composer);
                IconButtonKt.IconButton((Function0) objRememberedValue3, null, false, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$593188194$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            } else {
                $composer.startReplaceGroup(i);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$2$0$0(String $chatId, String $chatName, Context $context) {
        Log.d("ChatScreen", "Opening user detail: chatId=" + $chatId + ", chatName=" + $chatName);
        UserDetailActivity.Companion.start$default(UserDetailActivity.INSTANCE, $context, $chatId, $chatName, null, 8, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$2$1$0(String $chatId, String $chatName, Context $context) {
        Log.d("ChatScreen", "Opening group info: chatId=" + $chatId + ", chatName=" + $chatName);
        Intent intent = new Intent($context, (Class<?>) GroupInfoActivity.class);
        intent.putExtra("groupId", $chatId);
        intent.putExtra("groupName", $chatName);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$2$2$0(String $chatId, String $chatName, Context $context, int $chatType) {
        Log.d("ChatScreen", "Opening bot detail: chatId=" + $chatId + ", chatName=" + $chatName);
        BotDetailActivity.INSTANCE.start($context, $chatId, $chatName, $chatType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$4$0$0(MutableState $showBotBoard$delegate) {
        ChatScreen$lambda$62($showBotBoard$delegate, !ChatScreen$lambda$61($showBotBoard$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$4$2(State $uiState$delegate, final MutableState $currentImageUrl$delegate, final MutableState $showImageViewer$delegate, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C:ChatScreen.kt#kdrqfv");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1635821084, $changed, -1, "com.yhchat.canarys.ui.chat.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:604)");
        }
        Bot.board botBoard = ChatScreen$lambda$9($uiState$delegate).getBotBoard();
        if (botBoard == null) {
            $composer.startReplaceGroup(-2046913631);
            $composer.endReplaceGroup();
        } else {
            $composer.startReplaceGroup(-2046913630);
            ComposerKt.sourceInformation($composer, "");
            if (botBoard.getBoardCount() > 0) {
                $composer.startReplaceGroup(2033205594);
                ComposerKt.sourceInformation($composer, "");
                List<Bot.board.Board_data> boardList = botBoard.getBoardList();
                Intrinsics.checkNotNullExpressionValue(boardList, "getBoardList(...)");
                Bot.board.Board_data board_data = (Bot.board.Board_data) CollectionsKt.firstOrNull((List) boardList);
                if (board_data == null) {
                    $composer.startReplaceGroup(2033320107);
                    $composer.endReplaceGroup();
                } else {
                    $composer.startReplaceGroup(2033320108);
                    ComposerKt.sourceInformation($composer, "*610@24291L171,608@24169L327");
                    ComposerKt.sourceInformationMarkerStart($composer, 791590463, "CC(remember):ChatScreen.kt#9igjgp");
                    Object objRememberedValue = $composer.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        Object obj = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda95
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return ChatScreenKt.ChatScreen$lambda$76$0$0$4$2$0$0$0$0($currentImageUrl$delegate, $showImageViewer$delegate, (String) obj2);
                            }
                        };
                        $composer.updateRememberedValue(obj);
                        objRememberedValue = obj;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    GroupBotBoardsUIKt.BotBoardContent(board_data, (Function1) objRememberedValue, null, $composer, 48, 4);
                    $composer.endReplaceGroup();
                }
            } else {
                $composer.startReplaceGroup(2009376607);
            }
            $composer.endReplaceGroup();
            $composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$4$2$0$0$0$0(MutableState $currentImageUrl$delegate, MutableState $showImageViewer$delegate, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        $currentImageUrl$delegate.setValue(url);
        ChatScreen$lambda$37($showImageViewer$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$5$0(MutableState $currentImageUrl$delegate, MutableState $showImageViewer$delegate, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        $currentImageUrl$delegate.setValue(url);
        ChatScreen$lambda$37($showImageViewer$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x021c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit ChatScreen$lambda$76$0$0$6$0(java.lang.String r51, final com.yhchat.canarys.p007ui.chat.ChatViewModel r52, androidx.compose.foundation.layout.ColumnScope r53, androidx.compose.runtime.Composer r54, int r55) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.ChatScreen$lambda$76$0$0$6$0(java.lang.String, com.yhchat.canarys.ui.chat.ChatViewModel, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$6$0$0$0$0(ChatViewModel $viewModel) {
        $viewModel.clearError();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$1$0(List $messages, final ChatViewModel $viewModel, final int $chatType, final Context $context, final String $chatId, final Function4 $onAvatarClick, final int $currentUserPermission, final CoroutineScope $coroutineScope, final State $uiState$delegate, final MutableState $currentImageUrl$delegate, final MutableState $showImageViewer$delegate, final MutableState $mentionedUsers$delegate, final MutableState $inputText$delegate, final FocusRequester $inputFocusRequester, final MutableState $shouldShowKeyboard$delegate, final MutableState $quotedMessageId$delegate, final MutableState $quotedMessageText$delegate, final MutableState $messageToEdit$delegate, final MutableState $showEditDialog$delegate, LazyListScope LazyColumn) {
        final State state;
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List reversedMessages = CollectionsKt.reversed($messages);
        LazyListScope.items$default(LazyColumn, reversedMessages.size(), new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda99
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatScreenKt.ChatScreen$lambda$76$0$0$7$1$0$0(reversedMessages, ((Integer) obj).intValue());
            }
        }, null, ComposableLambdaKt.composableLambdaInstance(-730750373, true, new Function4() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda101
            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return ChatScreenKt.ChatScreen$lambda$76$0$0$7$1$0$1(reversedMessages, $viewModel, $chatType, $context, $chatId, $onAvatarClick, $currentUserPermission, $coroutineScope, $uiState$delegate, $currentImageUrl$delegate, $showImageViewer$delegate, $mentionedUsers$delegate, $inputText$delegate, $inputFocusRequester, $shouldShowKeyboard$delegate, $quotedMessageId$delegate, $quotedMessageText$delegate, $messageToEdit$delegate, $showEditDialog$delegate, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            }
        }), 4, null);
        if ($messages.isEmpty()) {
            state = $uiState$delegate;
        } else {
            state = $uiState$delegate;
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-1234993911, true, new Function3() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda102
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return ChatScreenKt.ChatScreen$lambda$76$0$0$7$1$0$2($viewModel, state, (LazyItemScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }), 3, null);
        }
        if ($messages.isEmpty() && !ChatScreen$lambda$9(state).isLoading()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$983940786$app_debug(), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object ChatScreen$lambda$76$0$0$7$1$0$0(List $reversedMessages, int index) {
        ChatMessage message = (ChatMessage) $reversedMessages.get(index);
        if (!StringsKt.isBlank(message.getMsgId())) {
            return message.getMsgId();
        }
        return message.getSendTime() + "_" + message.getSender().getChatId() + "_" + index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$1$0$1(List $reversedMessages, final ChatViewModel $viewModel, final int $chatType, final Context $context, final String $chatId, final Function4 $onAvatarClick, final int $currentUserPermission, CoroutineScope $coroutineScope, State $uiState$delegate, final MutableState $currentImageUrl$delegate, final MutableState $showImageViewer$delegate, final MutableState $mentionedUsers$delegate, final MutableState $inputText$delegate, final FocusRequester $inputFocusRequester, final MutableState $shouldShowKeyboard$delegate, final MutableState $quotedMessageId$delegate, final MutableState $quotedMessageText$delegate, final MutableState $messageToEdit$delegate, final MutableState $showEditDialog$delegate, LazyItemScope items, int index, Composer $composer, int $changed) {
        Modifier modifierAnimateContentSize$default;
        Object obj;
        String str;
        final CoroutineScope coroutineScope;
        final ChatMessage message;
        final Context context;
        Function2 function2;
        ChatMessage message2;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        ComposerKt.sourceInformation($composer, "CN(index)739@29606L157,743@29809L1191,762@31050L1183,785@32281L35,786@32356L953,804@33350L143,808@33532L192,813@33768L285,734@29307L4837:ChatScreen.kt#kdrqfv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer.changed(items) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer.changed(index) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if ($composer.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-730750373, $dirty2, -1, "com.yhchat.canarys.ui.chat.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:703)");
            }
            ChatMessage message3 = (ChatMessage) $reversedMessages.get(index);
            GroupMemberInfo groupMemberInfo = ChatScreen$lambda$9($uiState$delegate).getGroupMembers().get(message3.getSender().getChatId());
            Integer memberPermission = groupMemberInfo != null ? Integer.valueOf(groupMemberInfo.getPermissionLevel()) : null;
            boolean isStreaming = $viewModel.isMessageStreaming(message3.getMsgId());
            if (isStreaming) {
                modifierAnimateContentSize$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            } else {
                modifierAnimateContentSize$default = AnimationModifierKt.animateContentSize$default(items.animateItem(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), AnimationSpecKt.tween$default(150, 0, EasingKt.getFastOutSlowInEasing(), 2, null), AnimationSpecKt.tween$default(200, 0, EasingKt.getFastOutSlowInEasing(), 2, null), AnimationSpecKt.tween$default(150, 0, EasingKt.getFastOutSlowInEasing(), 2, null)), AnimationSpecKt.tween$default(200, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, 2, null);
            }
            Modifier itemModifier = modifierAnimateContentSize$default;
            boolean zIsMyMessage = $viewModel.isMyMessage(message3);
            ComposerKt.sourceInformationMarkerStart($composer, 2123591992, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda163
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return ChatScreenKt.ChatScreen$lambda$76$0$0$7$1$0$1$0$0($currentImageUrl$delegate, $showImageViewer$delegate, (String) obj3);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue = obj2;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 2123599522, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($context) | $composer.changed($chatType) | $composer.changed($chatId) | $composer.changed($onAvatarClick) | $composer.changed($currentUserPermission);
            Object objRememberedValue2 = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                str = "CC(remember):ChatScreen.kt#9igjgp";
                obj = new Function3() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda164
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj3, Object obj4, Object obj5) {
                        return ChatScreenKt.ChatScreen$lambda$76$0$0$7$1$0$1$1$0($context, $chatType, $chatId, $onAvatarClick, $currentUserPermission, (String) obj3, (String) obj4, ((Integer) obj5).intValue());
                    }
                };
                $composer.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue2;
                str = "CC(remember):ChatScreen.kt#9igjgp";
            }
            Function3 function3 = (Function3) obj;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 2123639226, str);
            boolean zChangedInstance2 = $composer.changedInstance($coroutineScope);
            Object objRememberedValue3 = $composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                coroutineScope = $coroutineScope;
                objRememberedValue3 = new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda165
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return ChatScreenKt.ChatScreen$lambda$76$0$0$7$1$0$1$2$0(coroutineScope, $mentionedUsers$delegate, $inputText$delegate, $inputFocusRequester, $shouldShowKeyboard$delegate, (String) obj3, (String) obj4);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue3);
            } else {
                coroutineScope = $coroutineScope;
            }
            Function2 function22 = (Function2) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 2123677470, str);
            boolean zChangedInstance3 = $composer.changedInstance($viewModel);
            Object objRememberedValue4 = $composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object obj3 = (KFunction) new ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$4$1($viewModel);
                $composer.updateRememberedValue(obj3);
                objRememberedValue4 = obj3;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            Function1 function12 = (Function1) ((KFunction) objRememberedValue4);
            ComposerKt.sourceInformationMarkerStart($composer, 2123680788, str);
            boolean zChangedInstance4 = $composer.changedInstance(message3) | $composer.changedInstance(coroutineScope);
            Object objRememberedValue5 = $composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                final CoroutineScope coroutineScope2 = coroutineScope;
                message = message3;
                context = $context;
                objRememberedValue5 = new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda167
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj4, Object obj5) {
                        return ChatScreenKt.ChatScreen$lambda$76$0$0$7$1$0$1$4$0(message, coroutineScope2, $quotedMessageId$delegate, $quotedMessageText$delegate, $inputFocusRequester, $shouldShowKeyboard$delegate, (String) obj4, (String) obj5);
                    }
                };
                $composer.updateRememberedValue(objRememberedValue5);
            } else {
                message = message3;
                context = $context;
            }
            Function2 function23 = (Function2) objRememberedValue5;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 2123711786, str);
            boolean zChangedInstance5 = $composer.changedInstance($viewModel);
            Object objRememberedValue6 = $composer.rememberedValue();
            if (zChangedInstance5 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                function2 = function23;
                Object obj4 = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda168
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        return ChatScreenKt.ChatScreen$lambda$76$0$0$7$1$0$1$5$0($viewModel, (String) obj5);
                    }
                };
                $composer.updateRememberedValue(obj4);
                objRememberedValue6 = obj4;
            } else {
                function2 = function23;
            }
            Function1 function13 = (Function1) objRememberedValue6;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 2123717659, str);
            Object objRememberedValue7 = $composer.rememberedValue();
            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                message2 = message;
                Object obj5 = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda169
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj6) {
                        return ChatScreenKt.ChatScreen$lambda$76$0$0$7$1$0$1$6$0($messageToEdit$delegate, $showEditDialog$delegate, (ChatMessage) obj6);
                    }
                };
                $composer.updateRememberedValue(obj5);
                objRememberedValue7 = obj5;
            } else {
                message2 = message;
            }
            Function1 function14 = (Function1) objRememberedValue7;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, 2123725304, str);
            boolean zChangedInstance6 = $composer.changedInstance($viewModel) | $composer.changedInstance(context);
            Object objRememberedValue8 = $composer.rememberedValue();
            if (zChangedInstance6 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                Object obj6 = new Function3() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda170
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                        return ChatScreenKt.ChatScreen$lambda$76$0$0$7$1$0$1$7$0($viewModel, context, (String) obj7, (String) obj8, (String) obj9);
                    }
                };
                $composer.updateRememberedValue(obj6);
                objRememberedValue8 = obj6;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            AnimatedMessageItem(message2, zIsMyMessage, $chatType, itemModifier, function1, function3, function22, function12, function2, function13, function14, (Function3) objRememberedValue8, memberPermission, $composer, 24576, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$1$0$1$0$0(MutableState $currentImageUrl$delegate, MutableState $showImageViewer$delegate, String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        $currentImageUrl$delegate.setValue(imageUrl);
        ChatScreen$lambda$37($showImageViewer$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$1$0$1$1$0(Context $context, int $chatType, String $chatId, Function4 $onAvatarClick, int $currentUserPermission, String senderId, String name, int senderChatType) {
        Intrinsics.checkNotNullParameter(senderId, "senderId");
        Intrinsics.checkNotNullParameter(name, "name");
        switch (senderChatType) {
            case 1:
                UserDetailActivity.INSTANCE.start($context, senderId, name, $chatType == 2 ? $chatId : null);
                break;
            case 2:
            default:
                $onAvatarClick.invoke(senderId, name, Integer.valueOf(senderChatType), Integer.valueOf($currentUserPermission));
                break;
            case 3:
                Intent intent = new Intent($context, (Class<?>) BotInfoActivity.class);
                intent.putExtra("extra_bot_id", senderId);
                intent.putExtra("extra_bot_name", name);
                $context.startActivity(intent);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$1$0$1$2$0(CoroutineScope $coroutineScope, MutableState $mentionedUsers$delegate, MutableState $inputText$delegate, FocusRequester $inputFocusRequester, MutableState $shouldShowKeyboard$delegate, String userId, String userName) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Log.d("ChatScreen", "\u957f\u6309\u5934\u50cf@\u7528\u6237: userId=" + userId + ", userName=" + userName);
        $mentionedUsers$delegate.setValue(MapsKt.plus(ChatScreen$lambda$33($mentionedUsers$delegate), TuplesKt.m176to(userId, userName)));
        String mentionText = "@" + userName + " ";
        $inputText$delegate.setValue(ChatScreen$lambda$12($inputText$delegate).length() == 0 ? mentionText : ChatScreen$lambda$12($inputText$delegate) + mentionText);
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$3$1$1($inputFocusRequester, $shouldShowKeyboard$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$1$0$1$4$0(ChatMessage $message, CoroutineScope $coroutineScope, MutableState $quotedMessageId$delegate, MutableState $quotedMessageText$delegate, FocusRequester $inputFocusRequester, MutableState $shouldShowKeyboard$delegate, String msgId, String msgText) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        Intrinsics.checkNotNullParameter(msgText, "msgText");
        String senderName = $message.getSender().getName();
        String content = $message.getContent().getText();
        if (content == null) {
            content = "";
        }
        String quotedText = senderName + " : " + content;
        $quotedMessageId$delegate.setValue(msgId);
        $quotedMessageText$delegate.setValue(quotedText);
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$5$1$1($inputFocusRequester, $shouldShowKeyboard$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$1$0$1$5$0(ChatViewModel $viewModel, String msgId) {
        Intrinsics.checkNotNullParameter(msgId, "msgId");
        $viewModel.recallMessage(msgId);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$1$0$1$6$0(MutableState $messageToEdit$delegate, MutableState $showEditDialog$delegate, ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        $messageToEdit$delegate.setValue(message);
        ChatScreen$lambda$52($showEditDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$1$0$1$7$0(ChatViewModel $viewModel, Context $context, String userId, String userName, String avatarUrl) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        $viewModel.blockUser(userId, userName, avatarUrl);
        Toast.makeText($context, "\u5df2\u5c4f\u853d\u7528\u6237\uff1a" + userName, 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$1$0$2(ChatViewModel $viewModel, State $uiState$delegate, LazyItemScope item, Composer $composer, int $changed) {
        Function0 function0;
        int i;
        Intrinsics.checkNotNullParameter(item, "$this$item");
        ComposerKt.sourceInformation($composer, "C825@34328L92,825@34307L113:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1234993911, $changed, -1, "com.yhchat.canarys.ui.chat.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:825)");
            }
            Unit unit = Unit.INSTANCE;
            ComposerKt.sourceInformationMarkerStart($composer, -1418173051, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($viewModel);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new ChatScreenKt$ChatScreen$21$1$1$7$2$1$3$1$1($viewModel, null);
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, $composer, 6);
            if (ChatScreen$lambda$9($uiState$delegate).isLoading()) {
                $composer.startReplaceGroup(-1013533519);
                ComposerKt.sourceInformation($composer, "830@34507L488");
                Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart($composer, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
                CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierM1050padding3ABfNKs);
                Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
                int i2 = ((((54 << 3) & 112) << 6) & 896) | 6;
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
                if (composerM4376constructorimpl.getInserting()) {
                    i = iHashCode;
                } else {
                    i = iHashCode;
                    if (!Intrinsics.areEqual(composerM4376constructorimpl.rememberedValue(), Integer.valueOf(i))) {
                    }
                    Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    int i3 = (i2 >> 6) & 14;
                    ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    int i4 = ((54 >> 6) & 112) | 6;
                    ComposerKt.sourceInformationMarkerStart($composer, 1478794931, "C836@34825L136:ChatScreen.kt#kdrqfv");
                    ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, 0.0f, 0L, 0, $composer, 6, 30);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    $composer.endNode();
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ComposerKt.sourceInformationMarkerEnd($composer);
                }
                composerM4376constructorimpl.updateRememberedValue(Integer.valueOf(i));
                composerM4376constructorimpl.apply(Integer.valueOf(i), setCompositeKeyHash);
                Updater.m4383setimpl(composerM4376constructorimpl, modifierMaterializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                int i32 = (i2 >> 6) & 14;
                ComposerKt.sourceInformationMarkerStart($composer, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                int i42 = ((54 >> 6) & 112) | 6;
                ComposerKt.sourceInformationMarkerStart($composer, 1478794931, "C836@34825L136:ChatScreen.kt#kdrqfv");
                ProgressIndicatorKt.m3033CircularProgressIndicatorLxG7B9w(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(24)), 0L, 0.0f, 0L, 0, $composer, 6, 30);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                $composer.endNode();
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
                ComposerKt.sourceInformationMarkerEnd($composer);
            } else {
                $composer.startReplaceGroup(-1047748839);
            }
            $composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChatScreen$lambda$76$0$0$7$2$0(int it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ChatScreen$lambda$76$0$0$7$3$0(int it) {
        return it;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$4(final CoroutineScope $coroutineScope, final LazyListState $listState, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C882@36671L220,889@36997L11,890@37067L11,881@36619L680:ChatScreen.kt#kdrqfv");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-87795323, $changed, -1, "com.yhchat.canarys.ui.chat.ChatScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:881)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 1528042977, "CC(remember):ChatScreen.kt#9igjgp");
        boolean zChangedInstance = $composer.changedInstance($coroutineScope) | $composer.changed($listState);
        Object objRememberedValue = $composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda103
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatScreenKt.ChatScreen$lambda$76$0$0$7$4$0$0($coroutineScope, $listState);
                }
            };
            $composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        FloatingActionButtonKt.m2791FloatingActionButtonXz6DiA((Function0) objRememberedValue, SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(48)), null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnPrimary(), null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$2017507011$app_debug(), $composer, 12582960, 100);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$7$4$0$0(CoroutineScope $coroutineScope, LazyListState $listState) {
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new ChatScreenKt$ChatScreen$21$1$1$7$5$1$1$1($listState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$9$0(Context $context, ChatViewModel $viewModel, MenuButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        String buttonValue = button.getContent();
        if (UnifiedLinkHandler.INSTANCE.isHandleableLink(buttonValue)) {
            UnifiedLinkHandler.INSTANCE.handleLink($context, buttonValue);
        } else {
            Intrinsics.checkNotNull(buttonValue, "null cannot be cast to non-null type kotlin.String");
            if (StringsKt.startsWith$default(buttonValue, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(buttonValue, "https://", false, 2, (Object) null)) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(buttonValue));
                    $context.startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText($context, "\u65e0\u6cd5\u6253\u5f00\u94fe\u63a5", 0).show();
                }
            } else {
                $viewModel.clickMenuButton(button);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$10$0(MutableState $inputText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $inputText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$11$0(final ChatViewModel $viewModel, final MutableState $inputText$delegate, final MutableState $mentionedUsers$delegate, final MutableState $selectedInstruction$delegate, final MutableState $selectedMessageType$delegate, final MutableState $quotedMessageId$delegate, final MutableState $quotedMessageText$delegate, final CoroutineScope $coroutineScope, final MutableState $defaultSendMessageType$delegate, final LazyListState $listState) {
        Object next;
        if (!StringsKt.isBlank(ChatScreen$lambda$12($inputText$delegate))) {
            String messageText = StringsKt.trim((CharSequence) ChatScreen$lambda$12($inputText$delegate)).toString();
            List mentionedIdsList = new ArrayList();
            Regex mentionRegex = new Regex("@([^\\s@]+)");
            Iterator it = Regex.findAll$default(mentionRegex, messageText, 0, 2, null).iterator();
            while (it.hasNext()) {
                String str = ((MatchResult) it.next()).getGroupValues().get(1);
                Iterator<T> it2 = ChatScreen$lambda$33($mentionedUsers$delegate).entrySet().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (Intrinsics.areEqual(((Map.Entry) next).getValue(), str)) {
                        break;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry != null) {
                    mentionedIdsList.add(entry.getKey());
                }
            }
            if (ChatScreen$lambda$30($selectedInstruction$delegate) != null) {
                Instruction instructionChatScreen$lambda$30 = ChatScreen$lambda$30($selectedInstruction$delegate);
                String name = instructionChatScreen$lambda$30 != null ? instructionChatScreen$lambda$30.getName() : null;
                Instruction instructionChatScreen$lambda$302 = ChatScreen$lambda$30($selectedInstruction$delegate);
                Log.d("ChatScreen", "\u1f4e4 \u53d1\u9001\u6307\u4ee4\u6d88\u606f: /" + name + ", commandId=" + (instructionChatScreen$lambda$302 != null ? Long.valueOf(instructionChatScreen$lambda$302.getId()) : null) + ", text=" + messageText);
            } else {
                Log.d("ChatScreen", "\u1f4e4 \u53d1\u9001\u666e\u901a\u6d88\u606f: " + messageText + (!mentionedIdsList.isEmpty() ? ", @" + mentionedIdsList.size() + "\u4eba: " + mentionedIdsList : ""));
            }
            int iChatScreen$lambda$27 = ChatScreen$lambda$27($selectedMessageType$delegate);
            String strChatScreen$lambda$45 = ChatScreen$lambda$45($quotedMessageId$delegate);
            String strChatScreen$lambda$48 = ChatScreen$lambda$48($quotedMessageText$delegate);
            Instruction instructionChatScreen$lambda$303 = ChatScreen$lambda$30($selectedInstruction$delegate);
            $viewModel.sendMessage(messageText, iChatScreen$lambda$27, strChatScreen$lambda$45, strChatScreen$lambda$48, instructionChatScreen$lambda$303 != null ? Long.valueOf(instructionChatScreen$lambda$303.getId()) : null, !mentionedIdsList.isEmpty() ? mentionedIdsList : null, new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda171
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ChatScreenKt.ChatScreen$lambda$76$0$0$11$0$1($coroutineScope, $viewModel, $inputText$delegate, $mentionedUsers$delegate, $defaultSendMessageType$delegate, $selectedMessageType$delegate, $quotedMessageId$delegate, $quotedMessageText$delegate, $selectedInstruction$delegate, $listState);
                }
            }, new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda172
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ChatScreenKt.ChatScreen$lambda$76$0$0$11$0$2((String) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$11$0$1(CoroutineScope $coroutineScope, ChatViewModel $viewModel, MutableState $inputText$delegate, MutableState $mentionedUsers$delegate, MutableState $defaultSendMessageType$delegate, MutableState $selectedMessageType$delegate, MutableState $quotedMessageId$delegate, MutableState $quotedMessageText$delegate, MutableState $selectedInstruction$delegate, LazyListState $listState) {
        $inputText$delegate.setValue("");
        $mentionedUsers$delegate.setValue(MapsKt.emptyMap());
        ChatScreen$lambda$28($selectedMessageType$delegate, ChatScreen$lambda$23($defaultSendMessageType$delegate));
        $quotedMessageId$delegate.setValue(null);
        $quotedMessageText$delegate.setValue(null);
        $selectedInstruction$delegate.setValue(null);
        BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new ChatScreenKt$ChatScreen$21$1$1$10$1$2$1($listState, null), 3, null);
        $viewModel.clearDraft();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$11$0$2(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Log.e("ChatScreen", "\u53d1\u9001\u6d88\u606f\u5931\u8d25: " + error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$12$0(Function0 $onImagePickerClick) {
        $onImagePickerClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$13$0(Function0 $onFilePickerClick) {
        $onFilePickerClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$15$0(Function0 $onVideoPickerClick) {
        $onVideoPickerClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$23$0(String $chatId, int $chatType, String fileKey, String fileHash, long fileSize, long audioDuration) {
        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
        Intrinsics.checkNotNullParameter(fileHash, "fileHash");
        Log.w("ChatScreen", "\u1f3a4 voice message sent: chatId=" + $chatId + " chatType=" + $chatType + " key=" + fileKey + " hash=" + fileHash + " size=" + fileSize + " duration=" + audioDuration);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$16$0(ChatViewModel $viewModel, String draftText) {
        Intrinsics.checkNotNullParameter(draftText, "draftText");
        $viewModel.sendDraftInput(draftText);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$14$0(Function0 $onCameraClick) {
        $onCameraClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$17$0(MutableState $selectedMessageType$delegate, int newType) {
        ChatScreen$lambda$28($selectedMessageType$delegate, ChatScreen$lambda$27($selectedMessageType$delegate) == newType ? 1 : newType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$18$0(MutableState $quotedMessageId$delegate, MutableState $quotedMessageText$delegate) {
        $quotedMessageId$delegate.setValue(null);
        $quotedMessageText$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$19$0(ChatViewModel $viewModel, MutableState $quotedMessageId$delegate, MutableState $quotedMessageText$delegate, Expression expression) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        $viewModel.sendExpressionMessage(expression, ChatScreen$lambda$45($quotedMessageId$delegate), ChatScreen$lambda$48($quotedMessageText$delegate));
        $quotedMessageId$delegate.setValue(null);
        $quotedMessageText$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$20$0(ChatViewModel $viewModel, MutableState $quotedMessageId$delegate, MutableState $quotedMessageText$delegate, StickerItem stickerItem) {
        Intrinsics.checkNotNullParameter(stickerItem, "stickerItem");
        $viewModel.sendStickerMessage(stickerItem, ChatScreen$lambda$45($quotedMessageId$delegate), ChatScreen$lambda$48($quotedMessageText$delegate));
        $quotedMessageId$delegate.setValue(null);
        $quotedMessageText$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$21$0(ChatViewModel $viewModel, MutableState $selectedInstruction$delegate, MutableState $inputText$delegate, MutableState $selectedMessageType$delegate, MutableState $quotedMessageId$delegate, MutableState $quotedMessageText$delegate, Instruction instruction) {
        Intrinsics.checkNotNullParameter(instruction, "instruction");
        Log.d("ChatScreen", "\u1f3af \u7528\u6237\u70b9\u51fb\u6307\u4ee4: /" + instruction.getName() + " (id=" + instruction.getId() + ", type=" + instruction.getType() + ")");
        $selectedInstruction$delegate.setValue(instruction);
        switch (instruction.getType()) {
            case 1:
                Log.d("ChatScreen", "\u1f4dd \u666e\u901a\u6307\u4ee4\uff0c\u5e94\u7528\u9ed8\u8ba4\u6587\u672c: " + instruction.getDefaultText());
                if (instruction.getDefaultText().length() > 0) {
                    $inputText$delegate.setValue(instruction.getDefaultText());
                    break;
                }
                break;
            case 2:
                Log.d("ChatScreen", "\u26a1 \u76f4\u53d1\u6307\u4ee4\uff0c\u7acb\u5373\u53d1\u9001\u6d88\u606f");
                String textToSend = "/" + instruction.getName();
                Log.d("ChatScreen", "\u1f4e4 \u76f4\u53d1\u6307\u4ee4\u53d1\u9001\u6587\u672c: '" + textToSend + "'");
                ChatViewModel.sendMessage$default($viewModel, textToSend, ChatScreen$lambda$27($selectedMessageType$delegate), ChatScreen$lambda$45($quotedMessageId$delegate), ChatScreen$lambda$48($quotedMessageText$delegate), Long.valueOf(instruction.getId()), null, null, null, 224, null);
                $inputText$delegate.setValue("");
                $selectedInstruction$delegate.setValue(null);
                $quotedMessageId$delegate.setValue(null);
                $quotedMessageText$delegate.setValue(null);
                break;
            default:
                Log.w("ChatScreen", "\u26a0\ufe0f \u672a\u77e5\u6307\u4ee4\u7c7b\u578b: " + instruction.getType());
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$0$22$0(MutableState $selectedInstruction$delegate, MutableState $inputText$delegate) {
        $selectedInstruction$delegate.setValue(null);
        $inputText$delegate.setValue("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$76$0$1$1$0(MutableState $showFloatingVoiceWindow$delegate) {
        ChatScreen$lambda$20($showFloatingVoiceWindow$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$77$0(MutableState $showFloatingVoiceWindow$delegate) {
        ChatScreen$lambda$20($showFloatingVoiceWindow$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$78$0(MutableState $showImageViewer$delegate, MutableState $currentImageUrl$delegate) {
        ChatScreen$lambda$37($showImageViewer$delegate, false);
        $currentImageUrl$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$79$0(MutableState $showEditDialog$delegate, MutableState $messageToEdit$delegate) {
        ChatScreen$lambda$52($showEditDialog$delegate, false);
        $messageToEdit$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatScreen$lambda$80$0(ChatViewModel $viewModel, String $chatId, int $chatType, MutableState $messageToEdit$delegate, MutableState $showEditDialog$delegate, String content, int contentType) {
        Intrinsics.checkNotNullParameter(content, "content");
        ChatMessage chatMessageChatScreen$lambda$54 = ChatScreen$lambda$54($messageToEdit$delegate);
        Intrinsics.checkNotNull(chatMessageChatScreen$lambda$54);
        $viewModel.editMessage($chatId, $chatType, chatMessageChatScreen$lambda$54.getMsgId(), content, contentType);
        ChatScreen$lambda$52($showEditDialog$delegate, false);
        $messageToEdit$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$1$0(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$2$0(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$3$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$4$0(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$5$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$6$0(ChatMessage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$7$0(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:266:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06f8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0a1a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0b25  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0bd6  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0bf4  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0bfd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0c08  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0c12  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0c46  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x0c8c  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x0d51  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0d63  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x1103  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x1144  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x1265  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x128f  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x13d1  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x13d3  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x13e6  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x13f4  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x143c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:514:0x1497  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x14ae  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x1515  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x1526  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x1580  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x1598  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x1608  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x1648  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x166f  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x1705  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x171f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void MessageItem(final com.yhchat.canarys.data.model.ChatMessage r145, final boolean r146, final int r147, androidx.compose.p000ui.Modifier r148, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r149, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.Integer, kotlin.Unit> r150, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r151, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r152, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r153, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r154, kotlin.jvm.functions.Function1<? super com.yhchat.canarys.data.model.ChatMessage, kotlin.Unit> r155, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> r156, java.lang.Integer r157, androidx.compose.runtime.Composer r158, final int r159, final int r160, final int r161) {
        /*
            Method dump skipped, instructions count: 6005
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.MessageItem(com.yhchat.canarys.data.model.ChatMessage, boolean, int, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, java.lang.Integer, androidx.compose.runtime.Composer, int, int, int):void");
    }

    private static final void MessageItem$lambda$10(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean MessageItem$lambda$9(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final boolean MessageItem$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MessageItem$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String MessageItem$lambda$15(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean MessageItem$lambda$20(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MessageItem$lambda$21(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$23$0(ChatMessage $message, ClipboardManager $clipboardManager, Context $context) {
        String textToCopy = $message.getContent().getText();
        if (textToCopy == null) {
            textToCopy = "";
        }
        if (textToCopy.length() > 0) {
            ClipData clip = ClipData.newPlainText("message", textToCopy);
            $clipboardManager.setPrimaryClip(clip);
            Toast.makeText($context, "\u5df2\u590d\u5236", 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$22$0(MutableState $showContextMenu$delegate) {
        MessageItem$lambda$10($showContextMenu$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$25$1$0(Function3 $onAvatarClick, ChatMessage $message) {
        $onAvatarClick.invoke($message.getSender().getChatId(), $message.getSender().getName(), Integer.valueOf($message.getSender().getChatType()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$25$0$0(Function2 $onAvatarLongClick, ChatMessage $message) {
        $onAvatarLongClick.invoke($message.getSender().getChatId(), $message.getSender().getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$25$2$0$0(MutableState $tagsExpanded$delegate) {
        MessageItem$lambda$21($tagsExpanded$delegate, !MessageItem$lambda$20($tagsExpanded$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$25$2$1(ChatMessage $message, boolean $isMyMessage, final Function1 $onImageClick, final MutableState $showContextMenu$delegate, Composer $composer, int $changed) throws JSONException {
        ComposerKt.sourceInformation($composer, "C1352@56567L82,1355@56685L26,1346@56268L461:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1729364156, $changed, -1, "com.yhchat.canarys.ui.chat.MessageItem.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1346)");
            }
            MessageContent content = $message.getContent();
            int contentType = $message.getContentType();
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(12));
            ComposerKt.sourceInformationMarkerStart($composer, -233379410, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChanged = $composer.changed($onImageClick);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda105
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ChatScreenKt.MessageItem$lambda$25$2$1$0$0($onImageClick, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            Function1 function1 = (Function1) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer);
            ComposerKt.sourceInformationMarkerStart($composer, -233375690, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda106
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatScreenKt.MessageItem$lambda$25$2$1$1$0($showContextMenu$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            MessageContentView($message, content, contentType, $isMyMessage, modifierM1050padding3ABfNKs, function1, (Function0) objRememberedValue2, $composer, 1597440, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$25$2$1$0$0(Function1 $onImageClick, String imageUrl) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        $onImageClick.invoke(imageUrl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$25$2$1$1$0(MutableState $showContextMenu$delegate) {
        MessageItem$lambda$10($showContextMenu$delegate, true);
        return Unit.INSTANCE;
    }

    private static final boolean MessageItem$lambda$25$2$2$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MessageItem$lambda$25$2$2$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$25$2$2$3$0(MutableState $showEditHistory$delegate) {
        MessageItem$lambda$25$2$2$2($showEditHistory$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$25$2$2$5$0(MutableState $showEditHistory$delegate) {
        MessageItem$lambda$25$2$2$2($showEditHistory$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$25$4$0(Function3 $onAvatarClick, ChatMessage $message) {
        $onAvatarClick.invoke($message.getSender().getChatId(), $message.getSender().getName(), Integer.valueOf($message.getSender().getChatType()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$25$3$0(Function2 $onAvatarLongClick, ChatMessage $message) {
        $onAvatarLongClick.invoke($message.getSender().getChatId(), $message.getSender().getName());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$26$0(MutableState $showContextMenu$delegate) {
        MessageItem$lambda$10($showContextMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$27$0(ChatMessage $message, ClipboardManager $clipboardManager, Context $context, MutableState $showContextMenu$delegate) {
        String textToCopy = $message.getContent().getText();
        if (textToCopy == null) {
            textToCopy = "";
        }
        if (textToCopy.length() > 0) {
            ClipData clip = ClipData.newPlainText("message", textToCopy);
            $clipboardManager.setPrimaryClip(clip);
            Toast.makeText($context, "\u5df2\u590d\u5236\u5168\u90e8", 0).show();
        }
        MessageItem$lambda$10($showContextMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$28$0(ChatMessage $message, MutableState $freeCopyText$delegate, MutableState $showContextMenu$delegate, MutableState $showFreeCopyDialog$delegate) {
        String text = $message.getContent().getText();
        if (text == null) {
            text = "";
        }
        $freeCopyText$delegate.setValue(text);
        MessageItem$lambda$10($showContextMenu$delegate, false);
        MessageItem$lambda$13($showFreeCopyDialog$delegate, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$29$0(ChatMessage $message, Function2 $onQuote, MutableState $showContextMenu$delegate) {
        String senderName = $message.getSender().getName();
        String content = $message.getContent().getText();
        if (content == null) {
            content = "";
        }
        String quotedText = senderName + " : " + content;
        $onQuote.invoke($message.getMsgId(), quotedText);
        MessageItem$lambda$10($showContextMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$30$0(Function1 $onRecall, ChatMessage $message, MutableState $showContextMenu$delegate) {
        $onRecall.invoke($message.getMsgId());
        MessageItem$lambda$10($showContextMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$31$0(Function1 $onEdit, ChatMessage $message, MutableState $showContextMenu$delegate) {
        $onEdit.invoke($message);
        MessageItem$lambda$10($showContextMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$32$0(ChatMessage $message, Function1 $onAddExpression, Context $context, MutableState $showContextMenu$delegate) {
        String expressionId = $message.getContent().getExpressionId();
        String str = expressionId;
        if (!(str == null || str.length() == 0)) {
            $onAddExpression.invoke(expressionId);
            Toast.makeText($context, "\u5df2\u6dfb\u52a0\u8868\u60c5", 0).show();
        } else {
            Toast.makeText($context, "\u65e0\u6cd5\u83b7\u53d6\u8868\u60c5ID", 0).show();
        }
        MessageItem$lambda$10($showContextMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$33$0(Function3 $onBlockUser, ChatMessage $message, MutableState $showContextMenu$delegate) {
        $onBlockUser.invoke($message.getSender().getChatId(), $message.getSender().getName(), $message.getSender().getAvatarUrl());
        MessageItem$lambda$10($showContextMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$34$0(ChatMessage $message, CoroutineScope $coroutineScope, Context $context, MutableState $showContextMenu$delegate) {
        String audioUrl = $message.getContent().getAudioUrl();
        String str = audioUrl;
        if (!(str == null || StringsKt.isBlank(str))) {
            BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new ChatScreenKt$MessageItem$23$1$1($context, audioUrl, null), 3, null);
        }
        MessageItem$lambda$10($showContextMenu$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$35$0(MutableState $showFreeCopyDialog$delegate) {
        MessageItem$lambda$13($showFreeCopyDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$38(final MutableState $freeCopyText$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1516@63129L21,1514@63040L224:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2010549230, $changed, -1, "com.yhchat.canarys.ui.chat.MessageItem.<anonymous> (ChatScreen.kt:1514)");
            }
            String strMessageItem$lambda$15 = MessageItem$lambda$15($freeCopyText$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -597469725, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda162
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ChatScreenKt.MessageItem$lambda$38$0$0($freeCopyText$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            TextFieldKt.TextField(strMessageItem$lambda$15, (Function1<? super String, Unit>) objRememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 432, 12582912, 0, 8257528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$38$0$0(MutableState $freeCopyText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $freeCopyText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$36(final ClipboardManager $clipboardManager, final Context $context, final MutableState $freeCopyText$delegate, final MutableState $showFreeCopyDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1523@63368L316,1522@63326L427:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-956894125, $changed, -1, "com.yhchat.canarys.ui.chat.MessageItem.<anonymous> (ChatScreen.kt:1522)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -452250545, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($clipboardManager) | $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda174
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatScreenKt.MessageItem$lambda$36$0$0($clipboardManager, $context, $freeCopyText$delegate, $showFreeCopyDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1529319286$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$36$0$0(ClipboardManager $clipboardManager, Context $context, MutableState $freeCopyText$delegate, MutableState $showFreeCopyDialog$delegate) {
        ClipData clip = ClipData.newPlainText("message", MessageItem$lambda$15($freeCopyText$delegate));
        $clipboardManager.setPrimaryClip(clip);
        Toast.makeText($context, "\u5df2\u590d\u5236", 0).show();
        MessageItem$lambda$13($showFreeCopyDialog$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$37(final MutableState $showFreeCopyDialog$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1534@63836L30,1534@63815L103:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(230083217, $changed, -1, "com.yhchat.canarys.ui.chat.MessageItem.<anonymous> (ChatScreen.kt:1534)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 2066640719, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda173
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatScreenKt.MessageItem$lambda$37$0$0($showFreeCopyDialog$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.m10639getLambda$1578670668$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageItem$lambda$37$0$0(MutableState $showFreeCopyDialog$delegate) {
        MessageItem$lambda$13($showFreeCopyDialog$delegate, false);
        return Unit.INSTANCE;
    }

    private static final void MessageContextMenu(final ChatMessage message, final boolean showRecall, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, Composer $composer, final int $changed, final int $changed1, final int i) {
        final ChatMessage chatMessage;
        boolean z;
        final Function0<Unit> function010;
        final Function0<Unit> function011;
        final Function0<Unit> function012;
        final Function0 onEdit;
        final Function0 onAddExpression;
        int i2;
        int i3;
        Composer $composer2;
        final Function0 onBlockUser;
        final Function0 onSaveAudio;
        final Function0 onEdit2;
        final Function0 onAddExpression2;
        int i4;
        final Function0 onBlockUser2;
        final Function0 onSaveAudio2;
        Composer $composer3 = $composer.startRestartGroup(-258564219);
        ComposerKt.sourceInformation($composer3, "C(MessageContextMenu)N(message,showRecall,onDismiss,onCopyAll,onFreeCopy,onQuote,onRecall,onEdit,onAddExpression,onBlockUser,onSaveAudio)1758@72813L98,1567@64580L8179,1559@64361L8556:ChatScreen.kt#kdrqfv");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) {
            chatMessage = message;
            $dirty |= $composer3.changedInstance(chatMessage) ? 4 : 2;
        } else {
            chatMessage = message;
        }
        if (($changed & 48) == 0) {
            z = showRecall;
            $dirty |= $composer3.changed(z) ? 32 : 16;
        } else {
            z = showRecall;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            function010 = function02;
            $dirty |= $composer3.changedInstance(function010) ? 2048 : 1024;
        } else {
            function010 = function02;
        }
        if (($changed & 24576) == 0) {
            function011 = function03;
            $dirty |= $composer3.changedInstance(function011) ? 16384 : 8192;
        } else {
            function011 = function03;
        }
        if ((196608 & $changed) == 0) {
            function012 = function04;
            $dirty |= $composer3.changedInstance(function012) ? 131072 : 65536;
        } else {
            function012 = function04;
        }
        if ((1572864 & $changed) == 0) {
            $dirty |= $composer3.changedInstance(function05) ? 1048576 : 524288;
        }
        int i5 = i & 128;
        if (i5 != 0) {
            $dirty |= 12582912;
            onEdit = function06;
        } else if (($changed & 12582912) == 0) {
            onEdit = function06;
            $dirty |= $composer3.changedInstance(onEdit) ? 8388608 : 4194304;
        } else {
            onEdit = function06;
        }
        int i6 = i & 256;
        if (i6 != 0) {
            $dirty |= 100663296;
            onAddExpression = function07;
        } else if (($changed & 100663296) == 0) {
            onAddExpression = function07;
            $dirty |= $composer3.changedInstance(onAddExpression) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            onAddExpression = function07;
        }
        int i7 = i & 512;
        if (i7 != 0) {
            $dirty |= 805306368;
            i2 = i7;
        } else if (($changed & 805306368) == 0) {
            i2 = i7;
            $dirty |= $composer3.changedInstance(function08) ? 536870912 : 268435456;
        } else {
            i2 = i7;
        }
        int i8 = i & 1024;
        if (i8 != 0) {
            $dirty1 |= 6;
            i3 = i8;
        } else if (($changed1 & 6) == 0) {
            i3 = i8;
            $dirty1 |= $composer3.changedInstance(function09) ? 4 : 2;
        } else {
            i3 = i8;
        }
        if (!$composer3.shouldExecute((($dirty & 306783379) == 306783378 && ($dirty1 & 3) == 2) ? false : true, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onBlockUser = function08;
            onSaveAudio = function09;
        } else {
            if (i5 != 0) {
                onEdit2 = null;
            } else {
                onEdit2 = onEdit;
            }
            if (i6 == 0) {
                onAddExpression2 = onAddExpression;
                i4 = -258564219;
            } else {
                onAddExpression2 = null;
                i4 = -258564219;
            }
            if (i2 == 0) {
                onBlockUser2 = function08;
            } else {
                onBlockUser2 = null;
            }
            if (i3 == 0) {
                onSaveAudio2 = function09;
            } else {
                onSaveAudio2 = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i4, $dirty, $dirty1, "com.yhchat.canarys.ui.chat.MessageContextMenu (ChatScreen.kt:1558)");
            }
            final boolean z2 = z;
            Function0 onEdit3 = onEdit2;
            Function0 onAddExpression3 = onAddExpression2;
            Function0 onSaveAudio3 = onSaveAudio2;
            Function0 onBlockUser3 = onBlockUser2;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableSingletons$ChatScreenKt.INSTANCE.m10645getLambda$208689603$app_debug(), null, ComposableLambdaKt.rememberComposableLambda(-1063229061, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda96
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.MessageContextMenu$lambda$0(function0, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$ChatScreenKt.INSTANCE.m10644getLambda$1917768519$app_debug(), ComposableLambdaKt.rememberComposableLambda(1949929048, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda97
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.MessageContextMenu$lambda$1(function010, chatMessage, function011, function012, onEdit2, onAddExpression2, onSaveAudio2, onBlockUser2, z2, function05, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 6) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onEdit = onEdit3;
            onAddExpression = onAddExpression3;
            onBlockUser = onBlockUser3;
            onSaveAudio = onSaveAudio3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda98
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.MessageContextMenu$lambda$2(message, showRecall, function0, function02, function03, function04, function05, onEdit, onAddExpression, onBlockUser, onSaveAudio, $changed, $changed1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContextMenu$lambda$1(Function0 $onCopyAll, ChatMessage $message, Function0 $onFreeCopy, Function0 $onQuote, Function0 $onEdit, Function0 $onAddExpression, Function0 $onSaveAudio, Function0 $onBlockUser, boolean $showRecall, Function0 $onRecall, Composer $composer, int $changed) {
        Function0 function0;
        ComposerKt.sourceInformation($composer, "C1568@64612L21,1569@64646L8103:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949929048, $changed, -1, "com.yhchat.canarys.ui.chat.MessageContextMenu.<anonymous> (ChatScreen.kt:1568)");
            }
            ScrollState scrollState = ScrollKt.rememberScrollState(0, $composer, 0, 1);
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.m1090heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, C1834Dp.m7806constructorimpl(420), 1, null), scrollState, false, null, false, 14, null);
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(4));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((48 >> 3) & 14) | ((48 >> 3) & 112));
            ComposerKt.sourceInformationMarkerStart($composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int iHashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode($composer, 0));
            CompositionLocalMap currentCompositionLocalMap = $composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier($composer, modifierVerticalScroll$default);
            Function0 constructor = ComposeUiNode.INSTANCE.getConstructor();
            int i = ((((48 << 3) & 112) << 6) & 896) | 6;
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
            int i3 = ((48 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -747569873, "C1577@64941L758,1619@66733L752:ChatScreen.kt#kdrqfv");
            ButtonKt.TextButton($onCopyAll, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1455294021$app_debug(), $composer, 805306416, 508);
            Composer composer = $composer;
            if (CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 8}).contains(Integer.valueOf($message.getContentType()))) {
                composer.startReplaceGroup(-746923524);
                ComposerKt.sourceInformation(composer, "1598@65831L828");
                ButtonKt.TextButton($onFreeCopy, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1897014730$app_debug(), composer, 805306416, 508);
                composer = composer;
            } else {
                composer.startReplaceGroup(-812233952);
            }
            composer.endReplaceGroup();
            Composer composer2 = composer;
            ButtonKt.TextButton($onQuote, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.m10638getLambda$1455894162$app_debug(), composer2, 805306416, 508);
            if ($onEdit == null || !CollectionsKt.listOf((Object[]) new Integer[]{1, 3, 8}).contains(Integer.valueOf($message.getContentType()))) {
                composer2.startReplaceGroup(-812233952);
            } else {
                composer2.startReplaceGroup(-745118580);
                ComposerKt.sourceInformation(composer2, "1640@67651L812");
                ButtonKt.TextButton($onEdit, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$2130912179$app_debug(), composer2, 805306416, 508);
            }
            composer2.endReplaceGroup();
            if ($onAddExpression == null || $message.getContentType() != 7) {
                composer2.startReplaceGroup(-812233952);
            } else {
                composer2.startReplaceGroup(-744147846);
                ComposerKt.sourceInformation(composer2, "1662@68629L830");
                ButtonKt.TextButton($onAddExpression, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$2055073618$app_debug(), composer2, 805306416, 508);
            }
            composer2.endReplaceGroup();
            if ($onSaveAudio == null || $message.getContentType() != 11) {
                composer2.startReplaceGroup(-812233952);
            } else {
                composer2.startReplaceGroup(-743179809);
                ComposerKt.sourceInformation(composer2, "1684@69605L825");
                ButtonKt.TextButton($onSaveAudio, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1979235057$app_debug(), composer2, 805306416, 508);
            }
            composer2.endReplaceGroup();
            if ($onBlockUser != null) {
                composer2.startReplaceGroup(-742233069);
                ComposerKt.sourceInformation(composer2, "1706@70553L1029");
                ButtonKt.TextButton($onBlockUser, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1903396496$app_debug(), composer2, 805306416, 508);
            } else {
                composer2.startReplaceGroup(-812233952);
            }
            composer2.endReplaceGroup();
            if ($showRecall) {
                composer2.startReplaceGroup(-741101383);
                ComposerKt.sourceInformation(composer2, "1732@71694L1023");
                ButtonKt.TextButton($onRecall, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1827557935$app_debug(), composer2, 805306416, 508);
            } else {
                composer2.startReplaceGroup(-812233952);
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
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
    public static final Unit MessageContextMenu$lambda$0(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1759@72827L74:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1063229061, $changed, -1, "com.yhchat.canarys.ui.chat.MessageContextMenu.<anonymous> (ChatScreen.kt:1759)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.m10640getLambda$1617010402$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ChatScreen.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatScreenKt$saveVoiceToSavedAudios$2", m185f = "ChatScreen.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatScreenKt$saveVoiceToSavedAudios$2 */
    static final class C32372 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ String $audioUrl;
        final /* synthetic */ Context $context;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32372(Context context, String str, Continuation<? super C32372> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$audioUrl = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C32372 c32372 = new C32372(this.$context, this.$audioUrl, continuation);
            c32372.L$0 = obj;
            return c32372;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C32372) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
        /* JADX WARN: Type inference failed for: r17v10 */
        /* JADX WARN: Type inference failed for: r17v8 */
        /* JADX WARN: Type inference failed for: r17v9, types: [boolean, int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.io.FileNotFoundException {
            /*
                Method dump skipped, instructions count: 530
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.C32372.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object saveVoiceToSavedAudios(Context context, String audioUrl, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C32372(context, audioUrl, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x04be A[LOOP:0: B:118:0x04b6->B:120:0x04be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x051a A[EDGE_INSN: B:144:0x051a->B:121:0x051a BREAK  A[LOOP:0: B:118:0x04b6->B:120:0x04be], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0306  */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r1v72, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v81 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void SenderNameAndTags(final com.yhchat.canarys.data.model.ChatMessage r84, final boolean r85, final boolean r86, final kotlin.jvm.functions.Function0<kotlin.Unit> r87, java.lang.Integer r88, androidx.compose.runtime.Composer r89, final int r90, final int r91) {
        /*
            Method dump skipped, instructions count: 1683
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.SenderNameAndTags(com.yhchat.canarys.data.model.ChatMessage, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.Integer, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SenderNameAndTags$lambda$0$0$0$0(MessageTag $tag, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1936@79671L10,1934@79578L270:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1679366008, $changed, -1, "com.yhchat.canarys.ui.chat.SenderNameAndTags.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1934)");
            }
            TextKt.m3359Text4IGK_g($tag.getText(), PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2)), Color.INSTANCE.m5094getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 432, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SenderNameAndTags$lambda$0$0$1(boolean $tagsExpanded, Composer $composer, int $changed) {
        ImageVector keyboardArrowDown;
        ComposerKt.sourceInformation($composer, "C1955@80469L11,1949@80128L448:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(332748336, $changed, -1, "com.yhchat.canarys.ui.chat.SenderNameAndTags.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1949)");
            }
            if ($tagsExpanded) {
                keyboardArrowDown = KeyboardArrowUpKt.getKeyboardArrowUp(Icons.INSTANCE.getDefault());
            } else {
                keyboardArrowDown = KeyboardArrowDownKt.getKeyboardArrowDown(Icons.INSTANCE.getDefault());
            }
            IconKt.m2816Iconww6aTOc(keyboardArrowDown, $tagsExpanded ? "\u6536\u8d77\u6807\u7b7e" : "\u5c55\u5f00\u6807\u7b7e", SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), $composer, 384, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SenderNameAndTags$lambda$0$1(List $tags, FlowRowScope FlowRow, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        ComposerKt.sourceInformation(composer, "C*1977@81328L338,1974@81182L484:ChatScreen.kt#kdrqfv");
        if (!composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-840802269, $changed, -1, "com.yhchat.canarys.ui.chat.SenderNameAndTags.<anonymous>.<anonymous> (ChatScreen.kt:1973)");
            }
            for (final MessageTag messageTag : CollectionsKt.drop($tags, 1)) {
                SurfaceKt.m3209SurfaceT9BRK9s(null, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(4)), parseTagColor(messageTag.getColor()), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-1318601300, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda63
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.SenderNameAndTags$lambda$0$1$0$0(messageTag, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54), composer, 12582912, 121);
                composer = $composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SenderNameAndTags$lambda$0$1$0$0(MessageTag $tag, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C1980@81455L10,1978@81354L290:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1318601300, $changed, -1, "com.yhchat.canarys.ui.chat.SenderNameAndTags.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:1978)");
            }
            TextKt.m3359Text4IGK_g($tag.getText(), PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(6), C1834Dp.m7806constructorimpl(2)), Color.INSTANCE.m5094getWhite0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 432, 0, 65528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private static final Modifier passThroughLongPress(Modifier $this$passThroughLongPress, final Function0<Unit> function0) {
        return ComposedModifierKt.composed$default($this$passThroughLongPress, null, new Function3() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda74
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return ChatScreenKt.passThroughLongPress$lambda$0(function0, (Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier passThroughLongPress$lambda$0(final Function0 $onLongClick, Modifier composed, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        $composer.startReplaceGroup(-1088634664);
        ComposerKt.sourceInformation($composer, "C1992@81838L333:ChatScreen.kt#kdrqfv");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1088634664, $changed, -1, "com.yhchat.canarys.ui.chat.passThroughLongPress.<anonymous> (ChatScreen.kt:1992)");
        }
        ComposerKt.sourceInformationMarkerStart($composer, 1794109477, "CC(remember):ChatScreen.kt#9igjgp");
        boolean zChanged = $composer.changed($onLongClick);
        Object objRememberedValue = $composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = (PointerInputEventHandler) new PointerInputEventHandler() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$passThroughLongPress$1$1$1

                /* compiled from: ChatScreen.kt */
                @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
                @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatScreenKt$passThroughLongPress$1$1$1$1", m185f = "ChatScreen.kt", m186i = {0, 1, 1, 2, 2, 2}, m187l = {1995, 1996, 2000}, m188m = "invokeSuspend", m189n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "$this$awaitEachGesture", "down", "longPress"}, m191s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$2"}, m192v = 1)
                /* renamed from: com.yhchat.canarys.ui.chat.ChatScreenKt$passThroughLongPress$1$1$1$1 */
                static final class C32361 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ Function0<Unit> $onLongClick;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C32361(Function0<Unit> function0, Continuation<? super C32361> continuation) {
                        super(2, continuation);
                        this.$onLongClick = function0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C32361 c32361 = new C32361(this.$onLongClick, continuation);
                        c32361.L$0 = obj;
                        return c32361;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                        return ((C32361) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        /*
                            r8 = this;
                            java.lang.Object r0 = r8.L$0
                            r1 = r0
                            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.p000ui.input.pointer.AwaitPointerEventScope) r1
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r8.label
                            r7 = 1
                            switch(r2) {
                                case 0: goto L31;
                                case 1: goto L2c;
                                case 2: goto L23;
                                case 3: goto L17;
                                default: goto Lf;
                            }
                        Lf:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                            r0.<init>(r2)
                            throw r0
                        L17:
                            java.lang.Object r0 = r8.L$2
                            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.p000ui.input.pointer.PointerInputChange) r0
                            java.lang.Object r2 = r8.L$1
                            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p000ui.input.pointer.PointerInputChange) r2
                            kotlin.ResultKt.throwOnFailure(r9)
                            goto L8b
                        L23:
                            java.lang.Object r2 = r8.L$1
                            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p000ui.input.pointer.PointerInputChange) r2
                            kotlin.ResultKt.throwOnFailure(r9)
                            r3 = r9
                            goto L61
                        L2c:
                            kotlin.ResultKt.throwOnFailure(r9)
                            r2 = r9
                            goto L46
                        L31:
                            kotlin.ResultKt.throwOnFailure(r9)
                            r4 = r8
                            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                            r8.L$0 = r1
                            r8.label = r7
                            r2 = 0
                            r3 = 0
                            r5 = 2
                            r6 = 0
                            java.lang.Object r2 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r1, r2, r3, r4, r5, r6)
                            if (r2 != r0) goto L46
                            return r0
                        L46:
                            androidx.compose.ui.input.pointer.PointerInputChange r2 = (androidx.compose.p000ui.input.pointer.PointerInputChange) r2
                            long r3 = r2.getId()
                            r5 = r8
                            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                            r8.L$0 = r1
                            java.lang.Object r6 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
                            r8.L$1 = r6
                            r6 = 2
                            r8.label = r6
                            java.lang.Object r3 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m695awaitLongPressOrCancellationrnUCldI(r1, r3, r5)
                            if (r3 != r0) goto L61
                            return r0
                        L61:
                            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.p000ui.input.pointer.PointerInputChange) r3
                            if (r3 == 0) goto L8c
                            kotlin.jvm.functions.Function0<kotlin.Unit> r4 = r8.$onLongClick
                            r4.invoke()
                            r4 = r8
                            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
                            r8.L$0 = r5
                            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
                            r8.L$1 = r5
                            java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
                            r8.L$2 = r5
                            r5 = 3
                            r8.label = r5
                            r5 = 0
                            java.lang.Object r4 = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(r1, r5, r4, r7, r5)
                            if (r4 != r0) goto L8a
                            return r0
                        L8a:
                            r0 = r3
                        L8b:
                            r3 = r0
                        L8c:
                            kotlin.Unit r0 = kotlin.Unit.INSTANCE
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt$passThroughLongPress$1$1$1.C32361.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
                public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
                    Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture($this$pointerInput, new C32361($onLongClick, null), continuation);
                    return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
                }
            };
            $composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        ComposerKt.sourceInformationMarkerEnd($composer);
        Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(composed, $onLongClick, (PointerInputEventHandler) objRememberedValue);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        $composer.endReplaceGroup();
        return modifierPointerInput;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void RecallMessageItem(final com.yhchat.canarys.data.model.ChatMessage r45, androidx.compose.p000ui.Modifier r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.RecallMessageItem(com.yhchat.canarys.data.model.ChatMessage, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecallMessageItem$lambda$0$0(ChatMessage $message, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C2026@82836L10,2027@82896L11,2024@82688L378:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(234796519, $changed, -1, "com.yhchat.canarys.ui.chat.RecallMessageItem.<anonymous>.<anonymous> (ChatScreen.kt:2024)");
            }
            String name = $message.getSender().getName();
            Long msgDeleteTime = $message.getMsgDeleteTime();
            Intrinsics.checkNotNull(msgDeleteTime);
            TextKt.m3359Text4IGK_g(name + " \u5728 " + formatRecallTime(msgDeleteTime.longValue()) + " \u64a4\u56de\u4e86\u4e00\u6761\u6d88\u606f", PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(8)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 48, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0219  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void TipMessageItem(final com.yhchat.canarys.data.model.ChatMessage r45, androidx.compose.p000ui.Modifier r46, androidx.compose.runtime.Composer r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.TipMessageItem(com.yhchat.canarys.data.model.ChatMessage, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TipMessageItem$lambda$0$0(ChatMessage $message, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C2056@83701L10,2057@83761L11,2054@83602L329:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(652301339, $changed, -1, "com.yhchat.canarys.ui.chat.TipMessageItem.<anonymous>.<anonymous> (ChatScreen.kt:2054)");
            }
            String text = $message.getContent().getText();
            if (text == null) {
                text = "\u7cfb\u7edf\u63d0\u793a";
            }
            TextKt.m3359Text4IGK_g(text, PaddingKt.m1051paddingVpY3zN4(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(16), C1834Dp.m7806constructorimpl(8)), MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m7655boximpl(TextAlign.INSTANCE.m7662getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 48, 0, 65016);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContentView$lambda$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0aab  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0c79  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0f6c  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0f87  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x1008  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x14d1  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x14e5  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x157c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x1586  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x15f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void MessageContentView(final com.yhchat.canarys.data.model.ChatMessage r89, final com.yhchat.canarys.data.model.MessageContent r90, final int r91, final boolean r92, androidx.compose.p000ui.Modifier r93, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r94, kotlin.jvm.functions.Function0<kotlin.Unit> r95, androidx.compose.runtime.Composer r96, final int r97, final int r98) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 5692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.MessageContentView(com.yhchat.canarys.data.model.ChatMessage, com.yhchat.canarys.data.model.MessageContent, int, boolean, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContentView$lambda$5$1$0$0(Function1 $onImageClick, String $imageUrl) {
        $onImageClick.invoke($imageUrl);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContentView$lambda$5$3$0$0(MessageContent $content, Context $context, String $fileName) {
        String fileUrl = $content.getFileUrl();
        if (fileUrl != null) {
            Long fileSize = $content.getFileSize();
            handleFileDownload($context, fileUrl, $fileName, fileSize != null ? fileSize.longValue() : 0L);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:43:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MessageContentView$lambda$5$3$1(long r76, java.lang.String r78, com.yhchat.canarys.data.model.MessageContent r79, androidx.compose.runtime.Composer r80, int r81) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.MessageContentView$lambda$5$3$1(long, java.lang.String, com.yhchat.canarys.data.model.MessageContent, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContentView$lambda$5$6$0$0(boolean $isPersonalExpression, Function1 $onImageClick, String $imageUrl, boolean $isStickerPack, Context $context, Long $stickerPackId) {
        if (!$isPersonalExpression && $isStickerPack) {
            StickerPackDetailActivity.Companion companion = StickerPackDetailActivity.INSTANCE;
            String strValueOf = String.valueOf($stickerPackId.longValue());
            if (strValueOf == null) {
                strValueOf = "";
            }
            companion.start($context, strValueOf);
        } else {
            $onImageClick.invoke($imageUrl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContentView$lambda$5$7$0$0$0(boolean $isPersonalExpression, Function1 $onImageClick, String $fullUrl, boolean $isStickerPack, Context $context, Long $stickerPackId) {
        if (!$isPersonalExpression && $isStickerPack) {
            StickerPackDetailActivity.Companion companion = StickerPackDetailActivity.INSTANCE;
            String strValueOf = String.valueOf($stickerPackId.longValue());
            if (strValueOf == null) {
                strValueOf = "";
            }
            companion.start($context, strValueOf);
        } else {
            $onImageClick.invoke($fullUrl);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContentView$lambda$5$11$0(MessageContent $content, long $textColor, String $quoteText, final Function1 $onImageClick, Composer $composer, int $changed) {
        Function0 function0;
        Composer composer;
        ComposerKt.sourceInformation($composer, "C2447@100709L1375:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1572587854, $changed, -1, "com.yhchat.canarys.ui.chat.MessageContentView.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:2447)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart($composer, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, $composer, ((390 >> 3) & 14) | ((390 >> 3) & 112));
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
            int i3 = ((390 >> 6) & 112) | 6;
            RowScope rowScope = RowScopeInstance.INSTANCE;
            Composer composer2 = $composer;
            ComposerKt.sourceInformationMarkerStart(composer2, -1183489109, "C2471@101870L10,2468@101714L352:ChatScreen.kt#kdrqfv");
            final String quoteImageUrl = $content.getQuoteImageUrl();
            if (quoteImageUrl == null) {
                composer2.startReplaceGroup(-1183479501);
                composer2.endReplaceGroup();
            } else {
                composer2.startReplaceGroup(-1183479500);
                ComposerKt.sourceInformation(composer2, "*2455@101119L7,2462@101463L26,2453@100985L592,2465@101602L39");
                ImageUtils imageUtils = ImageUtils.INSTANCE;
                ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object objConsume = composer2.consume(localContext);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ImageRequest imageRequestCreateImageRequest$default = ImageUtils.createImageRequest$default(imageUtils, (Context) objConsume, quoteImageUrl, false, 4, null);
                Modifier modifierClip = ClipKt.clip(SizeKt.m1102size3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(32)), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(4)));
                ComposerKt.sourceInformationMarkerStart(composer2, -1779503822, "CC(remember):ChatScreen.kt#9igjgp");
                boolean zChanged = composer2.changed($onImageClick) | composer2.changed(quoteImageUrl);
                Object objRememberedValue = composer2.rememberedValue();
                if (!zChanged) {
                    composer = composer2;
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(imageRequestCreateImageRequest$default, "\u5f15\u7528\u56fe\u7247", ClickableKt.m516clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue, 15, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                    composer2 = composer;
                    SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer2, 6);
                    composer2.endReplaceGroup();
                } else {
                    composer = composer2;
                }
                objRememberedValue = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda60
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatScreenKt.MessageContentView$lambda$5$11$0$0$0$0$0($onImageClick, quoteImageUrl);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
                ComposerKt.sourceInformationMarkerEnd(composer);
                SingletonAsyncImageKt.m8304AsyncImagegl8XCv8(imageRequestCreateImageRequest$default, "\u5f15\u7528\u56fe\u7247", ClickableKt.m516clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue, 15, null), null, null, null, ContentScale.INSTANCE.getCrop(), 0.0f, null, 0, false, null, composer, 1572912, 0, 4024);
                composer2 = composer;
                SpacerKt.Spacer(SizeKt.m1107width3ABfNKs(Modifier.INSTANCE, C1834Dp.m7806constructorimpl(8)), composer2, 6);
                composer2.endReplaceGroup();
            }
            TextKt.m3359Text4IGK_g($quoteText, RowScope.weight$default(rowScope, Modifier.INSTANCE, 1.0f, false, 2, null), Color.m5055copywmQWz5c($textColor, (14 & 1) != 0 ? Color.m5059getAlphaimpl($textColor) : 0.8f, (14 & 2) != 0 ? Color.m5063getRedimpl($textColor) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl($textColor) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl($textColor) : 0.0f), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 2, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getLabelMedium(), composer2, 0, 3120, 55288);
            ComposerKt.sourceInformationMarkerEnd(composer2);
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
    public static final Unit MessageContentView$lambda$5$11$0$0$0$0$0(Function1 $onImageClick, String $imageUrl) {
        $onImageClick.invoke($imageUrl);
        return Unit.INSTANCE;
    }

    /* renamed from: PostMessageView-yrwZFoE, reason: not valid java name */
    private static final void m10617PostMessageViewyrwZFoE(final String postId, final String postTitle, final String postContent, final String postContentType, final long j, final boolean isMyMessage, Composer $composer, final int $changed) {
        String str;
        long jM5055copywmQWz5c;
        Composer $composer2 = $composer.startRestartGroup(-223846924);
        ComposerKt.sourceInformation($composer2, "C(PostMessageView)N(postId,postTitle,postContent,postContentType,textColor:c#ui.graphics.Color,isMyMessage)2506@102765L7,2521@103080L324,2539@103795L2547,2518@102992L3350:ChatScreen.kt#kdrqfv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(postId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(postTitle) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            str = postContent;
            $dirty |= $composer2.changed(str) ? 256 : 128;
        } else {
            str = postContent;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer2.changed(postContentType) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer2.changed(j) ? 16384 : 8192;
        }
        if ((196608 & $changed) == 0) {
            $dirty |= $composer2.changed(isMyMessage) ? 131072 : 65536;
        }
        if ($composer2.shouldExecute((74899 & $dirty) != 74898, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-223846924, $dirty, -1, "com.yhchat.canarys.ui.chat.PostMessageView (ChatScreen.kt:2505)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            String str2 = postId;
            if (str2 == null || str2.length() == 0) {
                $composer2.startReplaceGroup(1460749774);
                ComposerKt.sourceInformation($composer2, "2512@102918L10,2509@102820L129");
                TextKt.m3359Text4IGK_g("\u6587\u7ae0\u6d88\u606f", (Modifier) null, j, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer2, MaterialTheme.$stable).getBodyMedium(), $composer2, (($dirty >> 6) & 896) | 6, 0, 65530);
                $composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final String str3 = str;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda154
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChatScreenKt.PostMessageView_yrwZFoE$lambda$0(postId, postTitle, str3, postContentType, j, isMyMessage, $changed, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            int $dirty2 = $dirty;
            $composer2.startReplaceGroup(1358756302);
            $composer2.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            ComposerKt.sourceInformationMarkerStart($composer2, -368512232, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChangedInstance = $composer2.changedInstance(context) | (($dirty2 & 14) == 4) | (($dirty2 & 112) == 32);
            Object objRememberedValue = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda156
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatScreenKt.PostMessageView_yrwZFoE$lambda$1$0(context, postId, postTitle);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierM516clickableoSLSa3U$default = ClickableKt.m516clickableoSLSa3U$default(modifierFillMaxWidth$default, false, null, null, null, (Function0) objRememberedValue, 15, null);
            float fM7806constructorimpl = C1834Dp.m7806constructorimpl(1);
            if (isMyMessage) {
                $composer2.startReplaceGroup(1461429232);
                ComposerKt.sourceInformation($composer2, "2532@103533L11");
                long onPrimary = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOnPrimary();
                jM5055copywmQWz5c = Color.m5055copywmQWz5c(onPrimary, (14 & 1) != 0 ? Color.m5059getAlphaimpl(onPrimary) : 0.3f, (14 & 2) != 0 ? Color.m5063getRedimpl(onPrimary) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(onPrimary) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(onPrimary) : 0.0f);
                $composer2.endReplaceGroup();
            } else {
                $composer2.startReplaceGroup(1461528370);
                ComposerKt.sourceInformation($composer2, "2534@103633L11");
                long outline = MaterialTheme.INSTANCE.getColorScheme($composer2, MaterialTheme.$stable).getOutline();
                jM5055copywmQWz5c = Color.m5055copywmQWz5c(outline, (14 & 1) != 0 ? Color.m5059getAlphaimpl(outline) : 0.3f, (14 & 2) != 0 ? Color.m5063getRedimpl(outline) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(outline) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(outline) : 0.0f);
                $composer2.endReplaceGroup();
            }
            SurfaceKt.m3209SurfaceT9BRK9s(BorderKt.m487borderxT4_qwU(modifierM516clickableoSLSa3U$default, fM7806constructorimpl, jM5055copywmQWz5c, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(8))), null, Color.INSTANCE.m5092getTransparent0d7_KjU(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-2046379015, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda157
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatScreenKt.PostMessageView_yrwZFoE$lambda$2(postContent, postContentType, j, isMyMessage, postTitle, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 12583296, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda158
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatScreenKt.PostMessageView_yrwZFoE$lambda$3(postId, postTitle, postContent, postContentType, j, isMyMessage, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PostMessageView_yrwZFoE$lambda$1$0(Context $context, String $postId, String $postTitle) {
        Intent intent = new Intent($context, (Class<?>) PostDetailActivity.class);
        Integer intOrNull = StringsKt.toIntOrNull($postId);
        intent.putExtra("post_id", intOrNull != null ? intOrNull.intValue() : 0);
        intent.putExtra("post_title", $postTitle == null ? "\u6587\u7ae0\u8be6\u60c5" : $postTitle);
        $context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0550  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit PostMessageView_yrwZFoE$lambda$2(java.lang.String r85, java.lang.String r86, long r87, boolean r89, java.lang.String r90, androidx.compose.runtime.Composer r91, int r92) {
        /*
            Method dump skipped, instructions count: 1372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.PostMessageView_yrwZFoE$lambda$2(java.lang.String, java.lang.String, long, boolean, java.lang.String, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    private static final void EditHistoryDialog(final String msgId, Function0<Unit> function0, Composer $composer, final int $changed) {
        Composer $composer2;
        CreationExtras defaultViewModelCreationExtras;
        final MutableState editRecords$delegate;
        String str;
        final MutableState isLoading$delegate;
        final MutableState errorMessage$delegate;
        final Function0<Unit> function02 = function0;
        Composer $composer3 = $composer.startRestartGroup(522681672);
        ComposerKt.sourceInformation($composer3, "C(EditHistoryDialog)N(msgId,onDismiss)2616@106491L11,2617@106526L95,2618@106643L33,2619@106701L42,2621@106775L375,2621@106753L397,2687@109044L98,2645@107424L1594,2636@107160L1988:ChatScreen.kt#kdrqfv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(msgId) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(function02) ? 32 : 16;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 19) != 18, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(522681672, $dirty2, -1, "com.yhchat.canarys.ui.chat.EditHistoryDialog (ChatScreen.kt:2615)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 1729797275, "CC(viewModel)P(3,2,1)56@2573L7,67@2980L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent($composer3, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ChatViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, defaultViewModelCreationExtras, $composer3, ((0 << 3) & 112) | ((0 << 3) & 896) | ((0 << 3) & 7168) | ((0 << 3) & 57344), 0);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ChatViewModel viewModel2 = (ChatViewModel) viewModel;
            ComposerKt.sourceInformationMarkerStart($composer3, -214082201, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            MutableState editRecords$delegate2 = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -214078519, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            MutableState isLoading$delegate2 = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -214076654, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            MutableState errorMessage$delegate2 = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -214073953, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(viewModel2) | (($dirty2 & 14) == 4);
            Object objRememberedValue4 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                Object chatScreenKt$EditHistoryDialog$1$1 = new ChatScreenKt$EditHistoryDialog$1$1(viewModel2, msgId, isLoading$delegate2, editRecords$delegate2, errorMessage$delegate2, null);
                editRecords$delegate = editRecords$delegate2;
                str = msgId;
                isLoading$delegate = isLoading$delegate2;
                errorMessage$delegate = errorMessage$delegate2;
                Object obj = (Function2) chatScreenKt$EditHistoryDialog$1$1;
                $composer3.updateRememberedValue(obj);
                objRememberedValue4 = obj;
            } else {
                errorMessage$delegate = errorMessage$delegate2;
                editRecords$delegate = editRecords$delegate2;
                str = msgId;
                isLoading$delegate = isLoading$delegate2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(str, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, $composer3, $dirty2 & 14);
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(function0, ComposableLambdaKt.rememberComposableLambda(-1737730560, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatScreenKt.EditHistoryDialog$lambda$10(function02, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.m10646getLambda$795017860$app_debug(), ComposableLambdaKt.rememberComposableLambda(-559339685, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatScreenKt.EditHistoryDialog$lambda$11(isLoading$delegate, errorMessage$delegate, editRecords$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty2 >> 3) & 14) | 1769520, 0, 16284);
            function02 = function0;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatScreenKt.EditHistoryDialog$lambda$12(msgId, function02, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final List<MessageEditRecord> EditHistoryDialog$lambda$1(MutableState<List<MessageEditRecord>> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean EditHistoryDialog$lambda$4(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EditHistoryDialog$lambda$5(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final String EditHistoryDialog$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit EditHistoryDialog$lambda$11(androidx.compose.runtime.MutableState r64, androidx.compose.runtime.MutableState r65, final androidx.compose.runtime.MutableState r66, androidx.compose.runtime.Composer r67, int r68) {
        /*
            Method dump skipped, instructions count: 1030
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.EditHistoryDialog$lambda$11(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditHistoryDialog$lambda$11$0$1$0(MutableState $editRecords$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List listEditHistoryDialog$lambda$1 = EditHistoryDialog$lambda$1($editRecords$delegate);
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$EditHistoryDialog$lambda$11$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((MessageEditRecord) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(MessageEditRecord messageEditRecord) {
                return null;
            }
        };
        LazyColumn.items(listEditHistoryDialog$lambda$1.size(), null, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$EditHistoryDialog$lambda$11$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(listEditHistoryDialog$lambda$1.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$EditHistoryDialog$lambda$11$0$1$0$$inlined$items$default$4
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
                MessageEditRecord messageEditRecord = (MessageEditRecord) listEditHistoryDialog$lambda$1.get(it);
                $composer.startReplaceGroup(-730926582);
                ComposerKt.sourceInformation($composer, "CN(record)*2680@108876L22:ChatScreen.kt#kdrqfv");
                ChatScreenKt.EditRecordItem(messageEditRecord, $composer, (($dirty & 14) >> 3) & 14);
                $composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditHistoryDialog$lambda$10(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C2688@109058L74:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1737730560, $changed, -1, "com.yhchat.canarys.ui.chat.EditHistoryDialog.<anonymous> (ChatScreen.kt:2688)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1488966883$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EditRecordItem(final MessageEditRecord record, Composer $composer, final int $changed) {
        Composer $composer2;
        Object objM11919constructorimpl;
        Composer $composer3 = $composer.startRestartGroup(1229229747);
        ComposerKt.sourceInformation($composer3, "C(EditRecordItem)N(record)2700@109288L192,2709@109569L38,2710@109614L800,2707@109486L928:ChatScreen.kt#kdrqfv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(record) ? 4 : 2;
        }
        int $dirty2 = $dirty;
        if (!$composer3.shouldExecute(($dirty2 & 3) != 2, $dirty2 & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1229229747, $dirty2, -1, "com.yhchat.canarys.ui.chat.EditRecordItem (ChatScreen.kt:2699)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, 173783827, "CC(remember):ChatScreen.kt#9igjgp");
            boolean z = ($dirty2 & 14) == 4;
            Object objRememberedValue = $composer3.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    String strOptString = new JSONObject(record.getContentOld()).optString("text");
                    Intrinsics.checkNotNull(strOptString);
                    if (!(strOptString.length() > 0)) {
                        strOptString = null;
                    }
                    objM11919constructorimpl = Result.m11919constructorimpl(strOptString);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM11919constructorimpl = Result.m11919constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m11925isFailureimpl(objM11919constructorimpl)) {
                    objM11919constructorimpl = null;
                }
                Object obj = (String) objM11919constructorimpl;
                $composer3.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            final String parsedText = (String) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, CardDefaults.INSTANCE.m2496cardElevationaqJV_2Y(C1834Dp.m7806constructorimpl(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, $composer3, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(1248972197, true, new Function3() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda160
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return ChatScreenKt.EditRecordItem$lambda$1(record, parsedText, (ColumnScope) obj2, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer3, 196614, 22);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda161
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatScreenKt.EditRecordItem$lambda$2(record, $changed, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EditRecordItem$lambda$1(MessageEditRecord $record, String $parsedText, ColumnScope Card, Composer $composer, int $changed) {
        Function0 function0;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        ComposerKt.sourceInformation($composer, "C2711@109624L784:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1248972197, $changed, -1, "com.yhchat.canarys.ui.chat.EditRecordItem.<anonymous> (ChatScreen.kt:2711)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(12));
            Arrangement.Vertical verticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(8));
            ComposerKt.sourceInformationMarkerStart($composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(verticalM909spacedBy0680j_4, Alignment.INSTANCE.getStart(), $composer, ((54 >> 3) & 14) | ((54 >> 3) & 112));
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
            int i3 = ((54 >> 6) & 112) | 6;
            ComposerKt.sourceInformationMarkerStart($composer, -2059311596, "C2720@109943L10,2721@110004L11,2718@109834L203:ChatScreen.kt#kdrqfv");
            TextKt.m3359Text4IGK_g("\u7f16\u8f91\u4e8e " + formatTimestamp($record.getMsgTime()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getLabelSmall(), $composer, 0, 0, 65530);
            String contentOld = $parsedText == null ? $record.getContentOld() : $parsedText;
            if (contentOld.length() > 0) {
                $composer.startReplaceGroup(-2058967993);
                ComposerKt.sourceInformation($composer, "2729@110280L10,2730@110345L11,2727@110192L192");
                TextKt.m3359Text4IGK_g(contentOld, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getOnSurface(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodyMedium(), $composer, 0, 0, 65530);
            } else {
                $composer.startReplaceGroup(2126681895);
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

    private static final String formatTimestamp(long timestamp) {
        Date date = new Date(timestamp);
        Date now = new Date();
        Calendar.getInstance();
        Calendar todayCalendar = Calendar.getInstance();
        todayCalendar.setTime(now);
        todayCalendar.set(11, 0);
        todayCalendar.set(12, 0);
        todayCalendar.set(13, 0);
        todayCalendar.set(14, 0);
        if (date.after(todayCalendar.getTime())) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
            Intrinsics.checkNotNull(str);
            return str;
        }
        if (date.after(new Date(todayCalendar.getTimeInMillis() - 86400000))) {
            return "\u6628\u5929 " + new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
        }
        String str2 = new SimpleDateFormat("MM-dd HH:mm", Locale.getDefault()).format(date);
        Intrinsics.checkNotNull(str2);
        return str2;
    }

    private static final String formatRecallTime(long timestamp) {
        Date date = new Date(timestamp);
        String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(date);
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final String formatFileSize(long bytes) {
        if (bytes < 1024) {
            return bytes + "B";
        }
        if (bytes < PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
            return (bytes / 1024) + "KB";
        }
        if (bytes < 1073741824) {
            return (bytes / 1048576) + "MB";
        }
        return (bytes / 1073741824) + "GB";
    }

    private static final String formatAudioDuration(long seconds) {
        long j = 60;
        long minutes = seconds / j;
        long remainingSeconds = seconds % j;
        return minutes + ":" + StringsKt.padStart(String.valueOf(remainingSeconds), 2, '0');
    }

    private static final void handleFileDownload(Context context, String fileUrl, String fileName, long fileSize) {
        if (!PermissionUtils.INSTANCE.hasAllDownloadPermissions(context)) {
            if (context instanceof Activity) {
                PermissionUtils.INSTANCE.requestAllDownloadPermissions((Activity) context);
                Toast.makeText(context, "\u8bf7\u5148\u6388\u4e88\u4e0b\u8f7d\u6240\u9700\u6743\u9650", 0).show();
                return;
            } else {
                Toast.makeText(context, "\u5f53\u524d\u4e0a\u4e0b\u6587\u65e0\u6cd5\u7533\u8bf7\u6743\u9650", 0).show();
                return;
            }
        }
        Toast.makeText(context, "\u5f00\u59cb\u4e0b\u8f7d\uff1a" + fileName, 0).show();
        FileDownloadService.Companion.startDownload$default(FileDownloadService.INSTANCE, context, fileUrl, fileName, fileSize, false, 16, null);
    }

    /* renamed from: VideoMessageView-3IgeMak, reason: not valid java name */
    private static final void m10618VideoMessageView3IgeMak(final String videoUrl, final long j, Modifier modifier, Composer $composer, final int $changed, final int i) {
        Modifier modifier2;
        final Modifier modifier3;
        Modifier modifier4;
        Composer $composer2 = $composer.startRestartGroup(-827229705);
        ComposerKt.sourceInformation($composer2, "C(VideoMessageView)N(videoUrl,textColor:c#ui.graphics.Color,modifier)2832@112906L7,2833@112939L68,2838@113122L770,2857@113945L2313,2835@113017L3241:ChatScreen.kt#kdrqfv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer2.changed(videoUrl) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer2.changed(j) ? 32 : 16;
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
        int $dirty2 = $dirty;
        if ($composer2.shouldExecute(($dirty2 & 147) != 146, $dirty2 & 1)) {
            if (i2 != 0) {
                modifier4 = Modifier.INSTANCE;
            } else {
                modifier4 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-827229705, $dirty2, -1, "com.yhchat.canarys.ui.chat.VideoMessageView (ChatScreen.kt:2831)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer2.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer2);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer2, -398791301, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = $composer2.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(DownloadState.NotStarted, null, 2, null);
                $composer2.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState downloadState$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer2);
            Modifier modifierClip = ClipKt.clip(modifier4, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(12)));
            ComposerKt.sourceInformationMarkerStart($composer2, -398784743, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChangedInstance = (($dirty2 & 14) == 4) | $composer2.changedInstance(context);
            Object objRememberedValue2 = $composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda79
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatScreenKt.VideoMessageView_3IgeMak$lambda$3$0(videoUrl, context, downloadState$delegate);
                    }
                };
                $composer2.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer2);
            modifier3 = modifier4;
            SurfaceKt.m3209SurfaceT9BRK9s(ClickableKt.m516clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue2, 15, null), null, Color.m5055copywmQWz5c(j, (14 & 1) != 0 ? Color.m5059getAlphaimpl(j) : 0.1f, (14 & 2) != 0 ? Color.m5063getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(j) : 0.0f), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-517474286, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda80
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatScreenKt.VideoMessageView_3IgeMak$lambda$4(j, downloadState$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer2, 54), $composer2, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda81
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatScreenKt.VideoMessageView_3IgeMak$lambda$5(videoUrl, j, modifier3, $changed, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final DownloadState VideoMessageView_3IgeMak$lambda$1(MutableState<DownloadState> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VideoMessageView_3IgeMak$lambda$3$0(String $videoUrl, Context $context, MutableState $downloadState$delegate) {
        if (VideoMessageView_3IgeMak$lambda$1($downloadState$delegate) == DownloadState.NotStarted) {
            $downloadState$delegate.setValue(DownloadState.Downloading);
            String strSubstringAfterLast$default = StringsKt.substringAfterLast$default($videoUrl, "/", (String) null, 2, (Object) null);
            if (strSubstringAfterLast$default.length() == 0) {
                strSubstringAfterLast$default = "video_" + System.currentTimeMillis() + ".mp4";
            }
            String fileName = strSubstringAfterLast$default;
            FileDownloadService.INSTANCE.startDownload($context, $videoUrl, fileName, 0L, true);
            Toast.makeText($context, "\u5f00\u59cb\u4e0b\u8f7d\u89c6\u9891\uff1a" + fileName, 0).show();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0565  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit VideoMessageView_3IgeMak$lambda$4(long r75, androidx.compose.runtime.MutableState r77, androidx.compose.runtime.Composer r78, int r79) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.VideoMessageView_3IgeMak$lambda$4(long, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* renamed from: AudioMessageView-T042LqI, reason: not valid java name */
    private static final void m10615AudioMessageViewT042LqI(final String audioUrl, final long duration, final long j, final String senderName, Modifier modifier, Composer $composer, final int $changed, final int i) {
        final long j2;
        Modifier modifier2;
        Composer $composer2;
        final Modifier modifier3;
        Modifier.Companion modifier4;
        Composer $composer3 = $composer.startRestartGroup(1811134297);
        ComposerKt.sourceInformation($composer3, "C(AudioMessageView)N(audioUrl,duration,textColor:c#ui.graphics.Color,senderName,modifier)2941@116580L7,2942@116618L34,2945@116709L54,2945@116684L79,2953@116878L293,2963@117224L1691,2950@116773L2142:ChatScreen.kt#kdrqfv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changed(audioUrl) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            j2 = duration;
            $dirty |= $composer3.changed(j2) ? 32 : 16;
        } else {
            j2 = duration;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(j) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(senderName) ? 2048 : 1024;
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
                ComposerKt.traceEventStart(1811134297, $dirty, -1, "com.yhchat.canarys.ui.chat.AudioMessageView (ChatScreen.kt:2940)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart($composer3, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object objConsume = $composer3.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Context context = (Context) objConsume;
            ComposerKt.sourceInformationMarkerStart($composer3, 1038311515, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            }
            final MutableState isCurrentlyPlaying$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, 1038314447, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj = (Function2) new ChatScreenKt$AudioMessageView$1$1(null);
                $composer3.updateRememberedValue(obj);
                objRememberedValue2 = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(audioUrl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, $composer3, $dirty & 14);
            Modifier modifierClip = ClipKt.clip(modifier4, RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(20)));
            ComposerKt.sourceInformationMarkerStart($composer3, 1038320094, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChangedInstance = $composer3.changedInstance(context) | (($dirty & 14) == 4) | (($dirty & 7168) == 2048);
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda175
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatScreenKt.AudioMessageView_T042LqI$lambda$4$0(context, audioUrl, senderName, isCurrentlyPlaying$delegate);
                    }
                };
                $composer3.updateRememberedValue(obj2);
                objRememberedValue3 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            $composer2 = $composer3;
            SurfaceKt.m3209SurfaceT9BRK9s(ClickableKt.m516clickableoSLSa3U$default(modifierClip, false, null, null, null, (Function0) objRememberedValue3, 15, null), null, Color.m5055copywmQWz5c(j, (14 & 1) != 0 ? Color.m5059getAlphaimpl(j) : 0.1f, (14 & 2) != 0 ? Color.m5063getRedimpl(j) : 0.0f, (14 & 4) != 0 ? Color.m5062getGreenimpl(j) : 0.0f, (14 & 8) != 0 ? Color.m5060getBlueimpl(j) : 0.0f), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(577692916, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda176
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ChatScreenKt.AudioMessageView_T042LqI$lambda$5(j, j2, isCurrentlyPlaying$delegate, (Composer) obj3, ((Integer) obj4).intValue());
                }
            }, $composer3, 54), $composer2, 12582912, 122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return ChatScreenKt.AudioMessageView_T042LqI$lambda$6(audioUrl, duration, j, senderName, modifier3, $changed, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final boolean AudioMessageView_T042LqI$lambda$1(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void AudioMessageView_T042LqI$lambda$2(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AudioMessageView_T042LqI$lambda$4$0(Context $context, String $audioUrl, String $senderName, MutableState $isCurrentlyPlaying$delegate) {
        AudioPlayerService.INSTANCE.startPlayAudio($context, $audioUrl, $senderName + " \u7684\u8bed\u97f3");
        AudioMessageView_T042LqI$lambda$2($isCurrentlyPlaying$delegate, !AudioMessageView_T042LqI$lambda$1($isCurrentlyPlaying$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit AudioMessageView_T042LqI$lambda$5(long r63, long r65, androidx.compose.runtime.MutableState r67, androidx.compose.runtime.Composer r68, int r69) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.AudioMessageView_T042LqI$lambda$5(long, long, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0221  */
    /* renamed from: MessageButtons-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void m10616MessageButtonscf5BqRc(final java.lang.String r95, final com.yhchat.canarys.data.model.ChatMessage r96, final long r97, androidx.compose.p000ui.Modifier r99, androidx.compose.runtime.Composer r100, final int r101, final int r102) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 1750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.m10616MessageButtonscf5BqRc(java.lang.String, com.yhchat.canarys.data.model.ChatMessage, long, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageButtons_cf5BqRc$lambda$1$0$0$0$0$0(Context $context, ChatViewModel $viewModel, ChatMessage $message, ButtonData $btnData) {
        handleButtonClick($context, $viewModel, $message, $btnData.getActionType(), $btnData.getUrl(), $btnData.getValue(), $btnData.getText());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageButtons_cf5BqRc$lambda$1$0$0$0$1(ButtonData $btnData, RowScope Button, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(Button, "$this$Button");
        ComposerKt.sourceInformation($composer, "C3093@121981L10,3091@121868L275:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-788642928, $changed, -1, "com.yhchat.canarys.ui.chat.MessageButtons.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:3091)");
            }
            TextKt.m3359Text4IGK_g($btnData.getText(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography($composer, MaterialTheme.$stable).getBodySmall(), $composer, 0, 3120, 55294);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    private static final void handleButtonClick(Context context, ChatViewModel viewModel, ChatMessage message, int actionType, String url, String value, String buttonText) {
        String chatTypeText;
        switch (actionType) {
            case 1:
                if (!StringsKt.isBlank(url)) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(url));
                        context.startActivity(intent);
                        break;
                    } catch (Exception e) {
                        Toast.makeText(context, "\u65e0\u6cd5\u6253\u5f00\u94fe\u63a5", 0).show();
                    }
                }
                break;
            case 2:
                if (!StringsKt.isBlank(value)) {
                    Object systemService = context.getSystemService("clipboard");
                    Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ClipboardManager clipboard = (ClipboardManager) systemService;
                    ClipData clip = ClipData.newPlainText("button_value", value);
                    clipboard.setPrimaryClip(clip);
                    Toast.makeText(context, "\u5df2\u590d\u5236", 0).show();
                    break;
                }
                break;
            case 3:
                String chatId = message.getChatId();
                if (chatId == null) {
                    chatId = "";
                }
                Integer chatType = message.getChatType();
                int chatType2 = chatType != null ? chatType.intValue() : 1;
                viewModel.reportButtonClick(chatId, chatType2, message.getMsgId(), value);
                switch (chatType2) {
                    case 1:
                        chatTypeText = "\u79c1\u804a";
                        break;
                    case 2:
                        chatTypeText = "\u7fa4\u804a";
                        break;
                    case 3:
                        chatTypeText = "\u673a\u5668\u4eba";
                        break;
                    default:
                        chatTypeText = "\u672a\u77e5";
                        break;
                }
                Log.d("ButtonClick", "\u70b9\u51fb\u6309\u94ae: \u7c7b\u578b=" + chatTypeText + ", chatId=" + chatId + ", \u6309\u94ae\u503c=" + value);
                Toast.makeText(context, "\u5df2\u70b9\u51fb\uff1a" + buttonText, 0).show();
                break;
            default:
                Toast.makeText(context, "\u672a\u77e5\u6309\u94ae\u7c7b\u578b", 0).show();
                break;
        }
    }

    private static final long parseTagColor(String colorString) throws NumberFormatException {
        long jM5087getGray0d7_KjU;
        try {
            String cleanColor = StringsKt.trim((CharSequence) colorString).toString();
            if (StringsKt.startsWith$default(cleanColor, "#", false, 2, (Object) null)) {
                String hex = cleanColor.substring(1);
                Intrinsics.checkNotNullExpressionValue(hex, "substring(...)");
                switch (hex.length()) {
                    case 6:
                        long rgb = Long.parseLong(hex, CharsKt.checkRadix(16));
                        jM5087getGray0d7_KjU = ColorKt.Color$default(((rgb >> 16) & 255) / 255.0f, ((rgb >> 8) & 255) / 255.0f, (rgb & 255) / 255.0f, 0.0f, null, 24, null);
                        break;
                    case 7:
                    default:
                        jM5087getGray0d7_KjU = Color.INSTANCE.m5087getGray0d7_KjU();
                        break;
                    case 8:
                        long argb = Long.parseLong(hex, CharsKt.checkRadix(16));
                        jM5087getGray0d7_KjU = ColorKt.Color$default(((argb >> 16) & 255) / 255.0f, ((argb >> 8) & 255) / 255.0f, (argb & 255) / 255.0f, ((argb >> 24) & 255) / 255.0f, null, 16, null);
                        break;
                }
            } else {
                jM5087getGray0d7_KjU = Color.INSTANCE.m5087getGray0d7_KjU();
            }
            return jM5087getGray0d7_KjU;
        } catch (Exception e) {
            return Color.INSTANCE.m5087getGray0d7_KjU();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void MessageEditDialog(final ChatMessage message, final Function0<Unit> onDismiss, final Function2<? super String, ? super Integer, Unit> onConfirm, Composer $composer, final int $changed) {
        Composer $composer2;
        int i;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onConfirm, "onConfirm");
        Composer $composer3 = $composer.startRestartGroup(168255901);
        ComposerKt.sourceInformation($composer3, "C(MessageEditDialog)N(message,onDismiss,onConfirm)3224@125738L55,3225@125825L48,3226@125894L34,3294@128356L345,3306@128727L98,3242@126270L2060,3234@126051L2780:ChatScreen.kt#kdrqfv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= $composer3.changedInstance(message) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changedInstance(onDismiss) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changedInstance(onConfirm) ? 256 : 128;
        }
        if (!$composer3.shouldExecute(($dirty & 147) != 146, $dirty & 1)) {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(168255901, $dirty, -1, "com.yhchat.canarys.ui.chat.MessageEditDialog (ChatScreen.kt:3223)");
            }
            ComposerKt.sourceInformationMarkerStart($composer3, -1514830988, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = $composer3.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                String text = message.getContent().getText();
                if (text == null) {
                    text = "";
                }
                i = 1;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(text, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue = objMutableStateOf$default;
            } else {
                i = 1;
            }
            final MutableState editedContent$delegate = (MutableState) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1514828211, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer3.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Integer.valueOf(message.getContentType()), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default2);
                objRememberedValue2 = objMutableStateOf$default2;
            }
            final MutableState selectedContentType$delegate = (MutableState) objRememberedValue2;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            ComposerKt.sourceInformationMarkerStart($composer3, -1514826017, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue3 = $composer3.rememberedValue();
            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Object objMutableStateOf$default3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default3);
                objRememberedValue3 = objMutableStateOf$default3;
            }
            final MutableState expanded$delegate = (MutableState) objRememberedValue3;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = TuplesKt.m176to(Integer.valueOf(i), "\u6587\u672c");
            pairArr[i] = TuplesKt.m176to(3, "Markdown");
            pairArr[2] = TuplesKt.m176to(8, "HTML");
            final List contentTypeOptions = CollectionsKt.listOf((Object[]) pairArr);
            boolean z = i;
            $composer2 = $composer3;
            AndroidAlertDialog_androidKt.m2427AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-1806761499, z, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda68
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.MessageEditDialog$lambda$9(onConfirm, editedContent$delegate, selectedContentType$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableLambdaKt.rememberComposableLambda(2053700199, z, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda69
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.MessageEditDialog$lambda$10(onDismiss, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$1619194601$app_debug(), ComposableLambdaKt.rememberComposableLambda(-745541846, z, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda70
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.MessageEditDialog$lambda$11(expanded$delegate, contentTypeOptions, selectedContentType$delegate, editedContent$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer3, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, $composer2, (($dirty >> 3) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda71
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ChatScreenKt.MessageEditDialog$lambda$12(message, onDismiss, onConfirm, $changed, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String MessageEditDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final int MessageEditDialog$lambda$4(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    private static final void MessageEditDialog$lambda$5(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    private static final boolean MessageEditDialog$lambda$7(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void MessageEditDialog$lambda$8(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit MessageEditDialog$lambda$11(final androidx.compose.runtime.MutableState r59, final java.util.List r60, final androidx.compose.runtime.MutableState r61, final androidx.compose.runtime.MutableState r62, androidx.compose.runtime.Composer r63, int r64) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatScreenKt.MessageEditDialog$lambda$11(androidx.compose.runtime.MutableState, java.util.List, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$11$0$0$0(MutableState $expanded$delegate, boolean it) {
        MessageEditDialog$lambda$8($expanded$delegate, !MessageEditDialog$lambda$7($expanded$delegate));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$11$0$1(final List $contentTypeOptions, final MutableState $selectedContentType$delegate, final MutableState $expanded$delegate, ExposedDropdownMenuBoxScope ExposedDropdownMenuBox, Composer $composer, int $changed) {
        Object next;
        String str;
        Intrinsics.checkNotNullParameter(ExposedDropdownMenuBox, "$this$ExposedDropdownMenuBox");
        ComposerKt.sourceInformation($composer, "C3254@126806L3,3257@126941L117,3252@126638L573,3267@127362L20,3268@127405L443,3265@127253L595:ChatScreen.kt#kdrqfv");
        int $dirty = $changed;
        if (($changed & 6) == 0) {
            $dirty |= ($changed & 8) == 0 ? $composer.changed(ExposedDropdownMenuBox) : $composer.changedInstance(ExposedDropdownMenuBox) ? 4 : 2;
        }
        if ($composer.shouldExecute(($dirty & 19) != 18, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1463463094, $dirty, -1, "com.yhchat.canarys.ui.chat.MessageEditDialog.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:3252)");
            }
            Iterator it = $contentTypeOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if ((((Number) ((Pair) next).getFirst()).intValue() == MessageEditDialog$lambda$4($selectedContentType$delegate) ? 1 : null) != null) {
                    break;
                }
            }
            Pair pair = (Pair) next;
            if (pair == null || (str = (String) pair.getSecond()) == null) {
                str = "\u6587\u672c";
            }
            Modifier modifierMenuAnchor = ExposedDropdownMenuBox.menuAnchor(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null));
            ComposerKt.sourceInformationMarkerStart($composer, 1933733625, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda89
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ChatScreenKt.MessageEditDialog$lambda$11$0$1$1$0((String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            int $dirty2 = $dirty;
            OutlinedTextFieldKt.OutlinedTextField(str, (Function1<? super String, Unit>) objRememberedValue, modifierMenuAnchor, false, true, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$ChatScreenKt.INSTANCE.m10643getLambda$189350704$app_debug(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambdaKt.rememberComposableLambda(513303085, true, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda100
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ChatScreenKt.MessageEditDialog$lambda$11$0$1$2($expanded$delegate, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 806903856, 0, 0, 8388008);
            boolean zMessageEditDialog$lambda$7 = MessageEditDialog$lambda$7($expanded$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, 1933751434, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue2 = $composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda111
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatScreenKt.MessageEditDialog$lambda$11$0$1$3$0($expanded$delegate);
                    }
                };
                $composer.updateRememberedValue(obj2);
                objRememberedValue2 = obj2;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ExposedDropdownMenuBox.m2747ExposedDropdownMenuvNxi1II(zMessageEditDialog$lambda$7, (Function0) objRememberedValue2, null, null, false, null, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-53201548, true, new Function3() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda122
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    return ChatScreenKt.MessageEditDialog$lambda$11$0$1$4($contentTypeOptions, $selectedContentType$delegate, $expanded$delegate, (ColumnScope) obj3, (Composer) obj4, ((Integer) obj5).intValue());
                }
            }, $composer, 54), $composer, 48, (ExposedDropdownMenuBoxScope.$stable << 3) | 6 | (($dirty2 << 3) & 112), PointerIconCompat.TYPE_GRAB);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$11$0$1$1$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$11$0$1$2(MutableState $expanded$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3258@126999L33:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(513303085, $changed, -1, "com.yhchat.canarys.ui.chat.MessageEditDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:3258)");
            }
            ExposedDropdownMenuDefaults.INSTANCE.TrailingIcon(MessageEditDialog$lambda$7($expanded$delegate), null, $composer, ExposedDropdownMenuDefaults.$stable << 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$11$0$1$3$0(MutableState $expanded$delegate) {
        MessageEditDialog$lambda$8($expanded$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$11$0$1$4(List $contentTypeOptions, final MutableState $selectedContentType$delegate, final MutableState $expanded$delegate, ColumnScope ExposedDropdownMenu, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(ExposedDropdownMenu, "$this$ExposedDropdownMenu");
        ComposerKt.sourceInformation(composer, "C*3271@127561L14,3272@127619L151,3270@127504L296:ChatScreen.kt#kdrqfv");
        boolean z = true;
        if (composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-53201548, $changed, -1, "com.yhchat.canarys.ui.chat.MessageEditDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:3269)");
            }
            Iterator it = $contentTypeOptions.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                final int iIntValue = ((Number) pair.component1()).intValue();
                final String str = (String) pair.component2();
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1128901117, z, new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda72
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ChatScreenKt.MessageEditDialog$lambda$11$0$1$4$0$0(str, (Composer) obj, ((Integer) obj2).intValue());
                    }
                }, composer, 54);
                ComposerKt.sourceInformationMarkerStart(composer, -967653052, "CC(remember):ChatScreen.kt#9igjgp");
                boolean zChanged = composer.changed(iIntValue);
                Object objRememberedValue = $composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda73
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ChatScreenKt.MessageEditDialog$lambda$11$0$1$4$0$1$0(iIntValue, $selectedContentType$delegate, $expanded$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                AndroidMenu_androidKt.DropdownMenuItem(composableLambdaRememberComposableLambda, (Function0) objRememberedValue, null, null, null, false, null, null, null, composer, 6, 508);
                composer = $composer;
                z = true;
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
    public static final Unit MessageEditDialog$lambda$11$0$1$4$0$0(String $name, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3271@127563L10:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1128901117, $changed, -1, "com.yhchat.canarys.ui.chat.MessageEditDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ChatScreen.kt:3271)");
            }
            TextKt.m3359Text4IGK_g($name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$11$0$1$4$0$1$0(int $type, MutableState $selectedContentType$delegate, MutableState $expanded$delegate) {
        MessageEditDialog$lambda$5($selectedContentType$delegate, $type);
        MessageEditDialog$lambda$8($expanded$delegate, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$11$0$2$0(MutableState $editedContent$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $editedContent$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$9(final Function2 $onConfirm, MutableState $editedContent$delegate, final MutableState $selectedContentType$delegate, Composer $composer, int $changed) {
        final MutableState mutableState;
        ComposerKt.sourceInformation($composer, "C3296@128408L172,3295@128370L321:ChatScreen.kt#kdrqfv");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1806761499, $changed, -1, "com.yhchat.canarys.ui.chat.MessageEditDialog.<anonymous> (ChatScreen.kt:3295)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1131011119, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChanged = $composer.changed($onConfirm);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                mutableState = $editedContent$delegate;
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ChatScreenKt.MessageEditDialog$lambda$9$0$0($onConfirm, mutableState, $selectedContentType$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            } else {
                mutableState = $editedContent$delegate;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, true ^ StringsKt.isBlank(MessageEditDialog$lambda$1(mutableState)), null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.m10642getLambda$1826127710$app_debug(), $composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$9$0$0(Function2 $onConfirm, MutableState $editedContent$delegate, MutableState $selectedContentType$delegate) {
        if (!StringsKt.isBlank(MessageEditDialog$lambda$1($editedContent$delegate))) {
            $onConfirm.invoke(StringsKt.trim((CharSequence) MessageEditDialog$lambda$1($editedContent$delegate)).toString(), Integer.valueOf(MessageEditDialog$lambda$4($selectedContentType$delegate)));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageEditDialog$lambda$10(Function0 $onDismiss, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C3307@128741L74:ChatScreen.kt#kdrqfv");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2053700199, $changed, -1, "com.yhchat.canarys.ui.chat.MessageEditDialog.<anonymous> (ChatScreen.kt:3307)");
            }
            ButtonKt.TextButton($onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ChatScreenKt.INSTANCE.getLambda$2034333988$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedMessageItem$lambda$0$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedMessageItem$lambda$1$0(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedMessageItem$lambda$2$0(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedMessageItem$lambda$3$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedMessageItem$lambda$4$0(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedMessageItem$lambda$5$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedMessageItem$lambda$6$0(ChatMessage it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedMessageItem$lambda$7$0(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        Intrinsics.checkNotNullParameter(str2, "<unused var>");
        return Unit.INSTANCE;
    }

    private static final void AnimatedMessageItem(final ChatMessage message, final boolean isMyMessage, final int conversationChatType, Modifier modifier, Function1<? super String, Unit> function1, Function3<? super String, ? super String, ? super Integer, Unit> function3, Function2<? super String, ? super String, Unit> function2, Function1<? super String, Unit> function12, Function2<? super String, ? super String, Unit> function22, Function1<? super String, Unit> function13, Function1<? super ChatMessage, Unit> function14, Function3<? super String, ? super String, ? super String, Unit> function32, Integer memberPermission, Composer $composer, final int $changed, final int $changed1, final int i) {
        boolean z;
        int i2;
        Modifier modifier2;
        Function1 function15;
        Function3 function33;
        Function2 function23;
        Function1 function16;
        int i3;
        int i4;
        int i5;
        int i6;
        Composer $composer2;
        final Function1 onEdit;
        final Integer memberPermission2;
        final Modifier modifier3;
        final Function1 onAddExpression;
        final Function1 onImageClick;
        final Function3 onAvatarClick;
        final Function2 onAvatarLongClick;
        final Function2 onQuote;
        final Function1 onRecall;
        final Function3 onBlockUser;
        Modifier modifier4;
        final Function1 onImageClick2;
        int i7;
        final Function3 onAvatarClick2;
        final Function2 onAvatarLongClick2;
        final Function1 onAddExpression2;
        Function2 onQuote2;
        final Function1 onRecall2;
        int i8;
        final Function1 onEdit2;
        final Function3 onBlockUser2;
        Function2 onQuote3;
        int $dirty;
        Object obj;
        Composer $composer3 = $composer.startRestartGroup(768756004);
        ComposerKt.sourceInformation($composer3, "C(AnimatedMessageItem)N(message,isMyMessage,conversationChatType,modifier,onImageClick,onAvatarClick,onAvatarLongClick,onAddExpression,onQuote,onRecall,onEdit,onBlockUser,memberPermission)3324@129081L2,3325@129136L14,3326@129202L11,3327@129255L2,3328@129299L11,3329@129345L2,3330@129385L2,3331@129442L14,3335@129558L184,3342@129781L57,3345@129890L74,3345@129860L104,3354@130087L32,3361@130311L575,3351@129974L912:ChatScreen.kt#kdrqfv");
        int $dirty2 = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) {
            $dirty2 |= $composer3.changedInstance(message) ? 4 : 2;
        }
        if (($changed & 48) == 0) {
            z = isMyMessage;
            $dirty2 |= $composer3.changed(z) ? 32 : 16;
        } else {
            z = isMyMessage;
        }
        if (($changed & 384) == 0) {
            i2 = conversationChatType;
            $dirty2 |= $composer3.changed(i2) ? 256 : 128;
        } else {
            i2 = conversationChatType;
        }
        int i9 = i & 8;
        if (i9 != 0) {
            $dirty2 |= 3072;
            modifier2 = modifier;
        } else if (($changed & 3072) == 0) {
            modifier2 = modifier;
            $dirty2 |= $composer3.changed(modifier2) ? 2048 : 1024;
        } else {
            modifier2 = modifier;
        }
        int i10 = i & 16;
        if (i10 != 0) {
            $dirty2 |= 24576;
            function15 = function1;
        } else if (($changed & 24576) == 0) {
            function15 = function1;
            $dirty2 |= $composer3.changedInstance(function15) ? 16384 : 8192;
        } else {
            function15 = function1;
        }
        int i11 = i & 32;
        if (i11 != 0) {
            $dirty2 |= ProfileVerifier.CompilationStatus.f207xf2722a21;
            function33 = function3;
        } else if (($changed & ProfileVerifier.CompilationStatus.f207xf2722a21) == 0) {
            function33 = function3;
            $dirty2 |= $composer3.changedInstance(function33) ? 131072 : 65536;
        } else {
            function33 = function3;
        }
        int i12 = i & 64;
        if (i12 != 0) {
            $dirty2 |= 1572864;
            function23 = function2;
        } else if (($changed & 1572864) == 0) {
            function23 = function2;
            $dirty2 |= $composer3.changedInstance(function23) ? 1048576 : 524288;
        } else {
            function23 = function2;
        }
        int i13 = i & 128;
        if (i13 != 0) {
            $dirty2 |= 12582912;
            function16 = function12;
        } else if (($changed & 12582912) == 0) {
            function16 = function12;
            $dirty2 |= $composer3.changedInstance(function16) ? 8388608 : 4194304;
        } else {
            function16 = function12;
        }
        int i14 = i & 256;
        if (i14 != 0) {
            $dirty2 |= 100663296;
            i3 = i14;
        } else if (($changed & 100663296) == 0) {
            i3 = i14;
            $dirty2 |= $composer3.changedInstance(function22) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        } else {
            i3 = i14;
        }
        int i15 = i & 512;
        if (i15 != 0) {
            $dirty2 |= 805306368;
            i4 = i15;
        } else if (($changed & 805306368) == 0) {
            i4 = i15;
            $dirty2 |= $composer3.changedInstance(function13) ? 536870912 : 268435456;
        } else {
            i4 = i15;
        }
        int i16 = i & 1024;
        if (i16 != 0) {
            $dirty1 |= 6;
            i5 = i16;
        } else if (($changed1 & 6) == 0) {
            i5 = i16;
            $dirty1 |= $composer3.changedInstance(function14) ? 4 : 2;
        } else {
            i5 = i16;
        }
        int i17 = i & 2048;
        if (i17 != 0) {
            $dirty1 |= 48;
            i6 = i17;
        } else if (($changed1 & 48) == 0) {
            i6 = i17;
            $dirty1 |= $composer3.changedInstance(function32) ? 32 : 16;
        } else {
            i6 = i17;
        }
        int i18 = i & 4096;
        if (i18 != 0) {
            $dirty1 |= 384;
        } else if (($changed1 & 384) == 0) {
            $dirty1 |= $composer3.changed(memberPermission) ? 256 : 128;
        }
        if ($composer3.shouldExecute((($dirty2 & 306783379) == 306783378 && ($dirty1 & 147) == 146) ? false : true, $dirty2 & 1)) {
            Modifier.Companion modifier5 = i9 != 0 ? Modifier.INSTANCE : modifier2;
            if (i10 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 40150694, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue = $composer3.rememberedValue();
                modifier4 = modifier5;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    obj = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ChatScreenKt.AnimatedMessageItem$lambda$0$0((String) obj2);
                        }
                    };
                    $composer3.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue;
                }
                Function1 onImageClick3 = (Function1) obj;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onImageClick2 = onImageClick3;
            } else {
                modifier4 = modifier5;
                onImageClick2 = function15;
            }
            if (i11 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 40152466, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue2 = $composer3.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function3() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            return ChatScreenKt.AnimatedMessageItem$lambda$1$0((String) obj3, (String) obj4, ((Integer) obj5).intValue());
                        }
                    };
                    $composer3.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                Function3 onAvatarClick3 = (Function3) objRememberedValue2;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onAvatarClick2 = onAvatarClick3;
                i7 = i12;
            } else {
                i7 = i12;
                onAvatarClick2 = function33;
            }
            if (i7 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 40154575, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue3 = $composer3.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    Object obj3 = new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            return ChatScreenKt.AnimatedMessageItem$lambda$2$0((String) obj4, (String) obj5);
                        }
                    };
                    $composer3.updateRememberedValue(obj3);
                    objRememberedValue3 = obj3;
                }
                Function2 onAvatarLongClick3 = (Function2) objRememberedValue3;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onAvatarLongClick2 = onAvatarLongClick3;
            } else {
                onAvatarLongClick2 = function23;
            }
            if (i13 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 40156262, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue4 = $composer3.rememberedValue();
                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    Object obj4 = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj5) {
                            return ChatScreenKt.AnimatedMessageItem$lambda$3$0((String) obj5);
                        }
                    };
                    $composer3.updateRememberedValue(obj4);
                    objRememberedValue4 = obj4;
                }
                Function1 onAddExpression3 = (Function1) objRememberedValue4;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onAddExpression2 = onAddExpression3;
            } else {
                onAddExpression2 = function16;
            }
            if (i3 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 40157679, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue5 = $composer3.rememberedValue();
                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    Object obj5 = new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            return ChatScreenKt.AnimatedMessageItem$lambda$4$0((String) obj6, (String) obj7);
                        }
                    };
                    $composer3.updateRememberedValue(obj5);
                    objRememberedValue5 = obj5;
                }
                onQuote2 = (Function2) objRememberedValue5;
                ComposerKt.sourceInformationMarkerEnd($composer3);
            } else {
                onQuote2 = function22;
            }
            if (i4 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 40159142, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue6 = $composer3.rememberedValue();
                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    Object obj6 = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj7) {
                            return ChatScreenKt.AnimatedMessageItem$lambda$5$0((String) obj7);
                        }
                    };
                    $composer3.updateRememberedValue(obj6);
                    objRememberedValue6 = obj6;
                }
                Function1 onRecall3 = (Function1) objRememberedValue6;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onRecall2 = onRecall3;
                i8 = 768756004;
            } else {
                onRecall2 = function13;
                i8 = 768756004;
            }
            if (i5 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 40160422, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue7 = $composer3.rememberedValue();
                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    Object obj7 = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj8) {
                            return ChatScreenKt.AnimatedMessageItem$lambda$6$0((ChatMessage) obj8);
                        }
                    };
                    $composer3.updateRememberedValue(obj7);
                    objRememberedValue7 = obj7;
                }
                Function1 onEdit3 = (Function1) objRememberedValue7;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onEdit2 = onEdit3;
            } else {
                onEdit2 = function14;
            }
            if (i6 != 0) {
                ComposerKt.sourceInformationMarkerStart($composer3, 40162258, "CC(remember):ChatScreen.kt#9igjgp");
                Object objRememberedValue8 = $composer3.rememberedValue();
                if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    Object obj8 = new Function3() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda17
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj9, Object obj10, Object obj11) {
                            return ChatScreenKt.AnimatedMessageItem$lambda$7$0((String) obj9, (String) obj10, (String) obj11);
                        }
                    };
                    $composer3.updateRememberedValue(obj8);
                    objRememberedValue8 = obj8;
                }
                Function3 onBlockUser3 = (Function3) objRememberedValue8;
                ComposerKt.sourceInformationMarkerEnd($composer3);
                onBlockUser2 = onBlockUser3;
            } else {
                onBlockUser2 = function32;
            }
            final Integer memberPermission3 = i18 != 0 ? null : memberPermission;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(i8, $dirty2, $dirty1, "com.yhchat.canarys.ui.chat.AnimatedMessageItem (ChatScreen.kt:3333)");
            }
            Object msgId = message.getMsgId();
            ComposerKt.sourceInformationMarkerStart($composer3, 40166140, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChanged = $composer3.changed(msgId);
            Object objRememberedValue9 = $composer3.rememberedValue();
            if (zChanged || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                Object objValueOf = Boolean.valueOf(System.currentTimeMillis() - message.getSendTime() < 2000);
                $composer3.updateRememberedValue(objValueOf);
                objRememberedValue9 = objValueOf;
            }
            boolean isNewMessage = ((Boolean) objRememberedValue9).booleanValue();
            ComposerKt.sourceInformationMarkerEnd($composer3);
            Object msgId2 = message.getMsgId();
            ComposerKt.sourceInformationMarkerStart($composer3, 40173149, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChanged2 = $composer3.changed(msgId2);
            Object objRememberedValue10 = $composer3.rememberedValue();
            if (zChanged2 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                onQuote3 = onQuote2;
                $dirty = $dirty2;
                Object objMutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!isNewMessage), null, 2, null);
                $composer3.updateRememberedValue(objMutableStateOf$default);
                objRememberedValue10 = objMutableStateOf$default;
            } else {
                onQuote3 = onQuote2;
                $dirty = $dirty2;
            }
            MutableState isVisible$delegate = (MutableState) objRememberedValue10;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            String msgId3 = message.getMsgId();
            ComposerKt.sourceInformationMarkerStart($composer3, 40176654, "CC(remember):ChatScreen.kt#9igjgp");
            boolean zChanged3 = $composer3.changed(isNewMessage) | $composer3.changed(isVisible$delegate);
            Object objRememberedValue11 = $composer3.rememberedValue();
            if (zChanged3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                Object obj9 = (Function2) new ChatScreenKt$AnimatedMessageItem$9$1(isNewMessage, isVisible$delegate, null);
                $composer3.updateRememberedValue(obj9);
                objRememberedValue11 = obj9;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            EffectsKt.LaunchedEffect(msgId3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue11, $composer3, 0);
            boolean zAnimatedMessageItem$lambda$10 = AnimatedMessageItem$lambda$10(isVisible$delegate);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);
            ComposerKt.sourceInformationMarkerStart($composer3, 40182916, "CC(remember):ChatScreen.kt#9igjgp");
            Object objRememberedValue12 = $composer3.rememberedValue();
            if (objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                Object obj10 = new Function1() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj11) {
                        return Integer.valueOf(ChatScreenKt.AnimatedMessageItem$lambda$13$0(((Integer) obj11).intValue()));
                    }
                };
                $composer3.updateRememberedValue(obj10);
                objRememberedValue12 = obj10;
            }
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final Function2 onQuote4 = onQuote3;
            final boolean z2 = z;
            final int i19 = i2;
            AnimatedVisibilityKt.AnimatedVisibility(zAnimatedMessageItem$lambda$10, modifier4, EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue12), (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(129423356, true, new Function3() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj11, Object obj12, Object obj13) {
                    return ChatScreenKt.AnimatedMessageItem$lambda$14(message, z2, i19, onImageClick2, onAvatarClick2, onAvatarLongClick2, onAddExpression2, onQuote4, onRecall2, onEdit2, onBlockUser2, memberPermission3, (AnimatedVisibilityScope) obj11, (Composer) obj12, ((Integer) obj13).intValue());
                }
            }, $composer3, 54), $composer3, (($dirty >> 6) & 112) | ProfileVerifier.CompilationStatus.f207xf2722a21, 24);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            onImageClick = onImageClick2;
            onAvatarClick = onAvatarClick2;
            onAvatarLongClick = onAvatarLongClick2;
            onAddExpression = onAddExpression2;
            onQuote = onQuote4;
            onRecall = onRecall2;
            onEdit = onEdit2;
            onBlockUser = onBlockUser2;
            memberPermission2 = memberPermission3;
            modifier3 = modifier4;
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
            onEdit = function14;
            memberPermission2 = memberPermission;
            modifier3 = modifier2;
            onAddExpression = function16;
            onImageClick = function15;
            onAvatarClick = function33;
            onAvatarLongClick = function23;
            onQuote = function22;
            onRecall = function13;
            onBlockUser = function32;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.chat.ChatScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj11, Object obj12) {
                    return ChatScreenKt.AnimatedMessageItem$lambda$15(message, isMyMessage, conversationChatType, modifier3, onImageClick, onAvatarClick, onAvatarLongClick, onAddExpression, onQuote, onRecall, onEdit, onBlockUser, memberPermission2, $changed, $changed1, i, (Composer) obj11, ((Integer) obj12).intValue());
                }
            });
        }
    }

    private static final boolean AnimatedMessageItem$lambda$10(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnimatedMessageItem$lambda$11(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AnimatedMessageItem$lambda$13$0(int fullHeight) {
        return fullHeight / 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnimatedMessageItem$lambda$14(ChatMessage $message, boolean $isMyMessage, int $conversationChatType, Function1 $onImageClick, Function3 $onAvatarClick, Function2 $onAvatarLongClick, Function1 $onAddExpression, Function2 $onQuote, Function1 $onRecall, Function1 $onEdit, Function3 $onBlockUser, Integer $memberPermission, AnimatedVisibilityScope AnimatedVisibility, Composer $composer, int $changed) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        ComposerKt.sourceInformation($composer, "C3362@130321L559:ChatScreen.kt#kdrqfv");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(129423356, $changed, -1, "com.yhchat.canarys.ui.chat.AnimatedMessageItem.<anonymous> (ChatScreen.kt:3362)");
        }
        MessageItem($message, $isMyMessage, $conversationChatType, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), $onImageClick, $onAvatarClick, $onAvatarLongClick, $onAddExpression, $onQuote, $onRecall, $onEdit, $onBlockUser, $memberPermission, $composer, 3072, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}
