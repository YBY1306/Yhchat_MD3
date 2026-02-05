package com.yhchat.canarys.p007ui.settings;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.provider.MediaStore;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.PauseKt;
import androidx.compose.material.icons.filled.PlayArrowKt;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextFieldKt;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p000ui.Modifier;
import androidx.compose.p000ui.graphics.Shape;
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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.documentfile.provider.DocumentFile;
import androidx.profileinstaller.ProfileVerifier;
import com.yhchat.canarys.p007ui.components.VoiceMessageViewModel;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.service.AudioPlayerService;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p008io.ByteStreamsKt;
import kotlin.p008io.CloseableKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SavedAudiosActivity.kt */
@Metadata(m168d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0003\u00a2\u0006\u0002\u0010\n\u001a\u00a7\u0001\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\u001bH\u0003\u00a2\u0006\u0002\u0010\u001c\u001a\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002\u001a.\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%H\u0082@\u00a2\u0006\u0002\u0010&\u001a \u0010'\u001a\b\u0012\u0004\u0012\u00020\r0\u001e2\u0006\u0010$\u001a\u00020%2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002\u001a\u0018\u0010(\u001a\u00020\u00012\u0006\u0010$\u001a\u00020%2\u0006\u0010)\u001a\u00020#H\u0002\u001a\u001a\u0010*\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010+\u001a\u00020#H\u0002\u001a \u0010,\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010+\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0005H\u0002\u001a\u001e\u0010.\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020 2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u001eH\u0002\u001a\b\u00101\u001a\u00020#H\u0002\u001a\b\u00102\u001a\u00020\u0005H\u0002\u001a\u0010\u00103\u001a\u00020\u00052\u0006\u00104\u001a\u000200H\u0002\u001a\u0010\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u000200H\u0002\u00a8\u00067\u00b2\u0006\n\u00108\u001a\u00020\tX\u008a\u008e\u0002\u00b2\u0006\u0010\u00109\u001a\b\u0012\u0004\u0012\u00020\r0\u001eX\u008a\u008e\u0002\u00b2\u0006\f\u0010:\u001a\u0004\u0018\u00010#X\u008a\u008e\u0002\u00b2\u0006\n\u0010;\u001a\u00020\tX\u008a\u008e\u0002\u00b2\u0006\n\u0010<\u001a\u00020\tX\u008a\u008e\u0002\u00b2\u0006\f\u0010=\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002\u00b2\u0006\n\u0010>\u001a\u00020\u0005X\u008a\u008e\u0002\u00b2\u0006\u0010\u0010?\u001a\b\u0012\u0004\u0012\u0002000\u001eX\u008a\u008e\u0002\u00b2\u0006\f\u0010@\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002\u00b2\u0006\n\u0010A\u001a\u00020\tX\u008a\u008e\u0002\u00b2\u0006\n\u0010B\u001a\u000200X\u008a\u008e\u0002\u00b2\u0006\n\u0010C\u001a\u000200X\u008a\u008e\u0002\u00b2\u0006\f\u0010D\u001a\u0004\u0018\u00010EX\u008a\u008e\u0002\u00b2\u0006\f\u0010F\u001a\u0004\u0018\u00010#X\u008a\u008e\u0002"}, m169d2 = {"SavedAudiosScreen", "", "onBack", "Lkotlin/Function0;", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", "selectionMode", "", "(Lkotlin/jvm/functions/Function0;Ljava/lang/String;IZLandroidx/compose/runtime/Composer;II)V", "SavedAudioCard", "item", "Lcom/yhchat/canarys/ui/settings/SavedAudioUiItem;", "isExpanded", "selected", "isActive", "isPlaying", "onClick", "onLongClick", "onPlay", "onRename", "onDelete", "sliderPosMs", "", "sliderMaxMs", "onSeek", "Lkotlin/Function1;", "(Lcom/yhchat/canarys/ui/settings/SavedAudioUiItem;ZZZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;FFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "querySavedAudios", "", "resolver", "Landroid/content/ContentResolver;", "reloadAll", "treeUri", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryAudiosFromTree", "importAudioToSavedDir", "sourceUri", "queryDisplayName", "uri", "renameAudio", "newDisplayName", "deleteAudiosByIds", "ids", "", "savedAudiosCollectionUri", "legacySavedAudiosDirPrefix", "formatDateTime", "dateAddedSeconds", "formatDurationMs", "ms", "app_debug", "hasReadPermission", "items", "expandedUri", "isRefreshing", "multiSelectionMode", "renameTarget", "renameText", "confirmDeleteIds", "currentPlayingUri", "isPlayerPlaying", "currentProgressMs", "currentDurationMs", "mediaController", "Landroid/support/v4/media/session/MediaControllerCompat;", "grantedTreeUri"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class SavedAudiosActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudioCard$lambda$2(SavedAudioUiItem savedAudioUiItem, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, float f, float f2, Function1 function1, int i, int i2, Composer composer, int i3) {
        SavedAudioCard(savedAudioUiItem, z, z2, z3, z4, z5, function0, function02, function03, function04, function05, f, f2, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$64(Function0 function0, String str, int i, boolean z, int i2, int i3, Composer composer, int i4) {
        SavedAudiosScreen(function0, str, i, z, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0718 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x088c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0968  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0a2e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0a3c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SavedAudiosScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> r57, java.lang.String r58, int r59, boolean r60, androidx.compose.runtime.Composer r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 2660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.SavedAudiosScreen(kotlin.jvm.functions.Function0, java.lang.String, int, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SavedAudiosScreen$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void SavedAudiosScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final List<SavedAudioUiItem> SavedAudiosScreen$lambda$8(MutableState<List<SavedAudioUiItem>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri SavedAudiosScreen$lambda$11(MutableState<Uri> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean SavedAudiosScreen$lambda$14(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SavedAudiosScreen$lambda$15(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SavedAudiosScreen$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SavedAudiosScreen$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final SavedAudioUiItem SavedAudiosScreen$lambda$21(MutableState<SavedAudioUiItem> mutableState) {
        return mutableState.getValue();
    }

    private static final String SavedAudiosScreen$lambda$24(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    private static final List<Long> SavedAudiosScreen$lambda$27(MutableState<List<Long>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String SavedAudiosScreen$lambda$30(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SavedAudiosScreen$lambda$33(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SavedAudiosScreen$lambda$34(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SavedAudiosScreen$lambda$36(MutableLongState $currentProgressMs$delegate) {
        return $currentProgressMs$delegate.getLongValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long SavedAudiosScreen$lambda$39(MutableLongState $currentDurationMs$delegate) {
        return $currentDurationMs$delegate.getLongValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaControllerCompat SavedAudiosScreen$lambda$42(MutableState<MediaControllerCompat> mutableState) {
        return mutableState.getValue();
    }

    private static final Uri SavedAudiosScreen$lambda$45(MutableState<Uri> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$1$1$connection$1] */
    public static final DisposableEffectResult SavedAudiosScreen$lambda$47$0(final Context $context, final MutableState $mediaController$delegate, final MutableState $currentPlayingUri$delegate, final MutableLongState $currentDurationMs$delegate, final MutableState $isPlayerPlaying$delegate, final MutableLongState $currentProgressMs$delegate, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final ?? r1 = new ServiceConnection() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$1$1$connection$1
            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName name, IBinder service) {
                AudioPlayerService this$0;
                AudioPlayerService.AudioPlayerBinder binder = service instanceof AudioPlayerService.AudioPlayerBinder ? (AudioPlayerService.AudioPlayerBinder) service : null;
                if (binder != null && (this$0 = binder.getThis$0()) != null) {
                    Context context = $context;
                    MutableState<MediaControllerCompat> mutableState = $mediaController$delegate;
                    final MutableState<String> mutableState2 = $currentPlayingUri$delegate;
                    final MutableLongState mutableLongState = $currentDurationMs$delegate;
                    final MutableState<Boolean> mutableState3 = $isPlayerPlaying$delegate;
                    final MutableLongState mutableLongState2 = $currentProgressMs$delegate;
                    MediaControllerCompat mediaControllerCompat = new MediaControllerCompat(context, this$0.getSessionToken());
                    mutableState.setValue(mediaControllerCompat);
                    MediaMetadataCompat metadata = mediaControllerCompat.getMetadata();
                    PlaybackStateCompat playbackState = mediaControllerCompat.getPlaybackState();
                    mutableState2.setValue(metadata != null ? metadata.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI) : null);
                    mutableLongState.setLongValue(metadata != null ? metadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION) : 0L);
                    boolean z = false;
                    if (playbackState != null && playbackState.getState() == 3) {
                        z = true;
                    }
                    SavedAudiosActivityKt.SavedAudiosScreen$lambda$34(mutableState3, z);
                    mutableLongState2.setLongValue(playbackState != null ? playbackState.getPosition() : 0L);
                    mediaControllerCompat.registerCallback(new MediaControllerCompat.Callback() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$1$1$connection$1$onServiceConnected$1$1
                        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
                        public void onPlaybackStateChanged(PlaybackStateCompat state) {
                            MutableState<Boolean> mutableState4 = mutableState3;
                            boolean z2 = false;
                            if (state != null && state.getState() == 3) {
                                z2 = true;
                            }
                            SavedAudiosActivityKt.SavedAudiosScreen$lambda$34(mutableState4, z2);
                            mutableLongState2.setLongValue(state != null ? state.getPosition() : 0L);
                        }

                        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
                        public void onMetadataChanged(MediaMetadataCompat metadata2) {
                            mutableState2.setValue(metadata2 != null ? metadata2.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI) : null);
                            mutableLongState.setLongValue(metadata2 != null ? metadata2.getLong(MediaMetadataCompat.METADATA_KEY_DURATION) : 0L);
                        }
                    });
                }
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName name) {
                $mediaController$delegate.setValue(null);
            }
        };
        Intent intent = new Intent($context, (Class<?>) AudioPlayerService.class);
        $context.bindService(intent, (ServiceConnection) r1, 1);
        return new DisposableEffectResult() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$lambda$47$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                $context.unbindService(r1);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object SavedAudiosScreen$reload(android.content.ContentResolver r5, android.content.Context r6, androidx.compose.runtime.snapshots.SnapshotStateList<java.lang.Long> r7, androidx.compose.runtime.MutableState<android.net.Uri> r8, androidx.compose.runtime.MutableState<java.util.List<com.yhchat.canarys.p007ui.settings.SavedAudioUiItem>> r9, androidx.compose.runtime.MutableState<java.lang.Boolean> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
        /*
            boolean r0 = r11 instanceof com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$reload$1
            if (r0 == 0) goto L14
            r0 = r11
            com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$reload$1 r0 = (com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$reload$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$reload$1 r0 = new com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$reload$1
            r0.<init>(r11)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L57;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$6
            androidx.compose.runtime.MutableState r2 = (androidx.compose.runtime.MutableState) r2
            java.lang.Object r3 = r0.L$5
            r10 = r3
            androidx.compose.runtime.MutableState r10 = (androidx.compose.runtime.MutableState) r10
            java.lang.Object r3 = r0.L$4
            r9 = r3
            androidx.compose.runtime.MutableState r9 = (androidx.compose.runtime.MutableState) r9
            java.lang.Object r3 = r0.L$3
            r8 = r3
            androidx.compose.runtime.MutableState r8 = (androidx.compose.runtime.MutableState) r8
            java.lang.Object r3 = r0.L$2
            r7 = r3
            androidx.compose.runtime.snapshots.SnapshotStateList r7 = (androidx.compose.runtime.snapshots.SnapshotStateList) r7
            java.lang.Object r3 = r0.L$1
            r6 = r3
            android.content.Context r6 = (android.content.Context) r6
            java.lang.Object r3 = r0.L$0
            r5 = r3
            android.content.ContentResolver r5 = (android.content.ContentResolver) r5
            kotlin.ResultKt.throwOnFailure(r1)
            r3 = r10
            r10 = r9
            r9 = r2
            r2 = r3
            r3 = r1
            goto L87
        L57:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            android.net.Uri r3 = SavedAudiosScreen$lambda$45(r8)
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r5)
            r0.L$0 = r4
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r6)
            r0.L$1 = r4
            r0.L$2 = r7
            java.lang.Object r4 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r0.L$3 = r4
            r0.L$4 = r9
            r0.L$5 = r10
            r0.L$6 = r9
            r4 = 1
            r0.label = r4
            java.lang.Object r3 = reloadAll(r5, r3, r6, r0)
            if (r3 != r2) goto L85
            return r2
        L85:
            r2 = r10
            r10 = r9
        L87:
            java.util.List r3 = (java.util.List) r3
            SavedAudiosScreen$lambda$9(r9, r3)
            r9 = r7
            java.util.List r9 = (java.util.List) r9
            com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda29 r3 = new com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda29
            r3.<init>()
            kotlin.collections.CollectionsKt.removeAll(r9, r3)
            boolean r9 = r7.isEmpty()
            if (r9 == 0) goto La1
            r9 = 0
            SavedAudiosScreen$lambda$18(r2, r9)
        La1:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.SavedAudiosScreen$reload(android.content.ContentResolver, android.content.Context, androidx.compose.runtime.snapshots.SnapshotStateList, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SavedAudiosScreen$reload$lambda$49(MutableState $items$delegate, long id) {
        Iterable iterableSavedAudiosScreen$lambda$8 = SavedAudiosScreen$lambda$8($items$delegate);
        if ((iterableSavedAudiosScreen$lambda$8 instanceof Collection) && ((Collection) iterableSavedAudiosScreen$lambda$8).isEmpty()) {
            return true;
        }
        Iterator it = iterableSavedAudiosScreen$lambda$8.iterator();
        while (it.hasNext()) {
            if ((((SavedAudioUiItem) it.next()).getId() == id ? 1 : null) != null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$50$0(CoroutineScope $scope, MutableState $isRefreshing$delegate, Context $context, ContentResolver $resolver, SnapshotStateList $selectedIds, MutableState $grantedTreeUri$delegate, MutableState $items$delegate, MutableState $multiSelectionMode$delegate, List uris) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        if (uris.isEmpty()) {
            return Unit.INSTANCE;
        }
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new C4199x15a0e39c($isRefreshing$delegate, uris, $context, $resolver, $selectedIds, $grantedTreeUri$delegate, $items$delegate, $multiSelectionMode$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$51$0(SharedPreferences $prefs, String $treeUriPrefKey, CoroutineScope $scope, Context $context, MutableState $grantedTreeUri$delegate, MutableState $isRefreshing$delegate, ContentResolver $resolver, SnapshotStateList $selectedIds, MutableState $items$delegate, MutableState $multiSelectionMode$delegate, Uri treeUri) {
        if (treeUri == null) {
            return Unit.INSTANCE;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            $context.getContentResolver().takePersistableUriPermission(treeUri, 3);
            Result.m11919constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m11919constructorimpl(ResultKt.createFailure(th));
        }
        $prefs.edit().putString($treeUriPrefKey, treeUri.toString()).apply();
        $grantedTreeUri$delegate.setValue(treeUri);
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new SavedAudiosActivityKt$SavedAudiosScreen$openTreeLauncher$1$1$2($isRefreshing$delegate, $resolver, $context, $selectedIds, $grantedTreeUri$delegate, $items$delegate, $multiSelectionMode$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$52$0(MutableState $hasReadPermission$delegate, boolean granted) {
        SavedAudiosScreen$lambda$6($hasReadPermission$delegate, granted);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$53$0(CoroutineScope $scope, ContentResolver $resolver, Context $context, SnapshotStateList $selectedIds, MutableState $grantedTreeUri$delegate, MutableState $items$delegate, MutableState $multiSelectionMode$delegate, ActivityResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new C4200x4e7f3fd4($resolver, $context, $selectedIds, $grantedTreeUri$delegate, $items$delegate, $multiSelectionMode$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$55(final String $topBarTitle, final Function0 $onBack, final SnapshotStateList $selectedIds, final MutableState $multiSelectionMode$delegate, final boolean $selectionMode, final ManagedActivityResultLauncher $importAudioLauncher, final ManagedActivityResultLauncher $openTreeLauncher, final MutableState $confirmDeleteIds$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C352@13505L69,353@13609L416,365@14054L1491,402@15658L11,401@15590L108,351@13470L2242:SavedAudiosActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1218269055, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosScreen.<anonymous> (SavedAudiosActivity.kt:351)");
            }
            AppBarKt.m2439TopAppBarGHTll3U(ComposableLambdaKt.rememberComposableLambda(-1546461373, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda25
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedAudiosActivityKt.SavedAudiosScreen$lambda$55$0($topBarTitle, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), null, ComposableLambdaKt.rememberComposableLambda(52687685, true, new Function2() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedAudiosActivityKt.SavedAudiosScreen$lambda$55$1($onBack, $selectedIds, $multiSelectionMode$delegate, (Composer) obj, ((Integer) obj2).intValue());
                }
            }, $composer, 54), ComposableLambdaKt.rememberComposableLambda(492128494, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SavedAudiosActivityKt.SavedAudiosScreen$lambda$55$2($selectedIds, $selectionMode, $importAudioLauncher, $openTreeLauncher, $multiSelectionMode$delegate, $confirmDeleteIds$delegate, (RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer, 54), 0.0f, null, TopAppBarDefaults.INSTANCE.m3530topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme($composer, MaterialTheme.$stable).getBackground(), 0L, 0L, 0L, 0L, $composer, TopAppBarDefaults.$stable << 15, 30), null, $composer, 3462, 178);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$55$0(String $topBarTitle, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C352@13507L65:SavedAudiosActivity.kt#acwjhs");
        if ($composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1546461373, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosScreen.<anonymous>.<anonymous> (SavedAudiosActivity.kt:352)");
            }
            TextKt.m3359Text4IGK_g($topBarTitle, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, TextOverflow.INSTANCE.m7714getEllipsisgIe3tQ8(), false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, $composer, 0, 3120, 120830);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$55$1(final Function0 $onBack, final SnapshotStateList $selectedIds, final MutableState $multiSelectionMode$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C354@13652L249,354@13631L376:SavedAudiosActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(52687685, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosScreen.<anonymous>.<anonymous> (SavedAudiosActivity.kt:354)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -906740642, "CC(remember):SavedAudiosActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($onBack);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SavedAudiosActivityKt.SavedAudiosScreen$lambda$55$1$0$0($selectedIds, $onBack, $multiSelectionMode$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            IconButtonKt.IconButton((Function0) objRememberedValue, null, false, null, null, ComposableSingletons$SavedAudiosActivityKt.INSTANCE.m11702getLambda$1009786014$app_debug(), $composer, ProfileVerifier.CompilationStatus.f207xf2722a21, 30);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$55$1$0$0(SnapshotStateList $selectedIds, Function0 $onBack, MutableState $multiSelectionMode$delegate) {
        if (SavedAudiosScreen$lambda$17($multiSelectionMode$delegate)) {
            SavedAudiosScreen$lambda$18($multiSelectionMode$delegate, false);
            $selectedIds.clear();
        } else {
            $onBack.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$55$2(final SnapshotStateList $selectedIds, boolean $selectionMode, final ManagedActivityResultLauncher $importAudioLauncher, final ManagedActivityResultLauncher $openTreeLauncher, final MutableState $multiSelectionMode$delegate, final MutableState $confirmDeleteIds$delegate, RowScope TopAppBar, Composer $composer, int $changed) {
        Composer composer = $composer;
        Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
        ComposerKt.sourceInformation(composer, "C:SavedAudiosActivity.kt#acwjhs");
        if (!composer.shouldExecute(($changed & 17) != 16, $changed & 1)) {
            composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(492128494, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosScreen.<anonymous>.<anonymous> (SavedAudiosActivity.kt:366)");
            }
            if (SavedAudiosScreen$lambda$17($multiSelectionMode$delegate)) {
                composer.startReplaceGroup(-2018314844);
                ComposerKt.sourceInformation(composer, "368@14176L103,367@14126L353,376@14554L142,375@14504L326");
                ComposerKt.sourceInformationMarkerStart(composer, 489084181, "CC(remember):SavedAudiosActivity.kt#9igjgp");
                Object objRememberedValue = $composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda22
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SavedAudiosActivityKt.SavedAudiosScreen$lambda$55$2$0$0($selectedIds, $confirmDeleteIds$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj);
                    objRememberedValue = obj;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                IconButtonKt.IconButton((Function0) objRememberedValue, null, true ^ $selectedIds.isEmpty(), null, null, ComposableSingletons$SavedAudiosActivityKt.INSTANCE.getLambda$1437208054$app_debug(), composer, 196614, 26);
                ComposerKt.sourceInformationMarkerStart(composer, 489096316, "CC(remember):SavedAudiosActivity.kt#9igjgp");
                Object objRememberedValue2 = $composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    Object obj2 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SavedAudiosActivityKt.SavedAudiosScreen$lambda$55$2$1$0($selectedIds, $multiSelectionMode$delegate);
                        }
                    };
                    $composer.updateRememberedValue(obj2);
                    objRememberedValue2 = obj2;
                }
                ComposerKt.sourceInformationMarkerEnd(composer);
                IconButtonKt.IconButton((Function0) objRememberedValue2, null, false, null, null, ComposableSingletons$SavedAudiosActivityKt.INSTANCE.m11708getLambda$397434145$app_debug(), composer, 196614, 30);
                composer.endReplaceGroup();
            } else {
                if ($selectionMode) {
                    composer.startReplaceGroup(-2032326348);
                } else {
                    composer.startReplaceGroup(-2017547253);
                    ComposerKt.sourceInformation(composer, "386@15004L110,385@14954L255,393@15284L93,392@15234L239");
                    ComposerKt.sourceInformationMarkerStart(composer, 489110684, "CC(remember):SavedAudiosActivity.kt#9igjgp");
                    boolean zChangedInstance = composer.changedInstance($importAudioLauncher);
                    Object objRememberedValue3 = $composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        Object obj3 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda33
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SavedAudiosActivityKt.SavedAudiosScreen$lambda$55$2$2$0($importAudioLauncher);
                            }
                        };
                        $composer.updateRememberedValue(obj3);
                        objRememberedValue3 = obj3;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ButtonKt.TextButton((Function0) objRememberedValue3, null, false, null, null, null, null, null, null, ComposableSingletons$SavedAudiosActivityKt.INSTANCE.m11704getLambda$1799190131$app_debug(), $composer, 805306368, 510);
                    ComposerKt.sourceInformationMarkerStart($composer, 489119627, "CC(remember):SavedAudiosActivity.kt#9igjgp");
                    boolean zChangedInstance2 = $composer.changedInstance($openTreeLauncher);
                    Object objRememberedValue4 = $composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        Object obj4 = new Function0() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda34
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SavedAudiosActivityKt.SavedAudiosScreen$lambda$55$2$3$0($openTreeLauncher);
                            }
                        };
                        $composer.updateRememberedValue(obj4);
                        objRememberedValue4 = obj4;
                    }
                    ComposerKt.sourceInformationMarkerEnd($composer);
                    ButtonKt.TextButton((Function0) objRememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$SavedAudiosActivityKt.INSTANCE.getLambda$661348406$app_debug(), $composer, 805306368, 510);
                    composer = $composer;
                }
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$55$2$0$0(SnapshotStateList $selectedIds, MutableState $confirmDeleteIds$delegate) {
        $confirmDeleteIds$delegate.setValue($selectedIds.toList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$55$2$1$0(SnapshotStateList $selectedIds, MutableState $multiSelectionMode$delegate) {
        SavedAudiosScreen$lambda$18($multiSelectionMode$delegate, false);
        $selectedIds.clear();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$55$2$2$0(ManagedActivityResultLauncher $importAudioLauncher) {
        $importAudioLauncher.launch(new String[]{"audio/*"});
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$55$2$3$0(ManagedActivityResultLauncher $openTreeLauncher) {
        $openTreeLauncher.launch(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:45:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit SavedAudiosScreen$lambda$56(final kotlinx.coroutines.CoroutineScope r56, final android.content.ContentResolver r57, final android.content.Context r58, androidx.compose.runtime.MutableState r59, final androidx.activity.compose.ManagedActivityResultLauncher r60, final java.lang.String r61, final androidx.compose.runtime.MutableState r62, final androidx.compose.runtime.snapshots.SnapshotStateList r63, final androidx.compose.runtime.MutableState r64, final androidx.compose.runtime.MutableState r65, final androidx.compose.runtime.MutableState r66, final boolean r67, final java.lang.String r68, final int r69, final com.yhchat.canarys.p007ui.components.VoiceMessageViewModel r70, final kotlin.jvm.functions.Function0 r71, final androidx.compose.runtime.MutableState r72, final androidx.compose.runtime.MutableState r73, final androidx.compose.runtime.MutableLongState r74, final androidx.compose.runtime.MutableLongState r75, final androidx.compose.runtime.MutableState r76, final androidx.compose.runtime.MutableState r77, final androidx.compose.runtime.MutableState r78, final androidx.compose.runtime.MutableState r79, final androidx.compose.runtime.MutableState r80, androidx.compose.foundation.layout.PaddingValues r81, androidx.compose.runtime.Composer r82, int r83) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.SavedAudiosScreen$lambda$56(kotlinx.coroutines.CoroutineScope, android.content.ContentResolver, android.content.Context, androidx.compose.runtime.MutableState, androidx.activity.compose.ManagedActivityResultLauncher, java.lang.String, androidx.compose.runtime.MutableState, androidx.compose.runtime.snapshots.SnapshotStateList, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, boolean, java.lang.String, int, com.yhchat.canarys.ui.components.VoiceMessageViewModel, kotlin.jvm.functions.Function0, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableLongState, androidx.compose.runtime.MutableLongState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, androidx.compose.foundation.layout.PaddingValues, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$56$0$0$0(ManagedActivityResultLauncher $requestReadPermissionLauncher, String $readPermission) {
        $requestReadPermissionLauncher.launch($readPermission);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$56$1$0(CoroutineScope $scope, MutableState $isRefreshing$delegate, ContentResolver $resolver, Context $context, SnapshotStateList $selectedIds, MutableState $grantedTreeUri$delegate, MutableState $items$delegate, MutableState $multiSelectionMode$delegate) {
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new SavedAudiosActivityKt$SavedAudiosScreen$5$2$1$1($isRefreshing$delegate, $resolver, $context, $selectedIds, $grantedTreeUri$delegate, $items$delegate, $multiSelectionMode$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$56$2(final boolean $selectionMode, final String $chatId, final int $chatType, final VoiceMessageViewModel $voiceMessageViewModel, final Context $context, final Function0 $onBack, final MutableState $items$delegate, final SnapshotStateList $selectedIds, final MutableState $expandedUri$delegate, final MutableState $currentPlayingUri$delegate, final MutableLongState $currentProgressMs$delegate, final MutableLongState $currentDurationMs$delegate, final MutableState $isPlayerPlaying$delegate, final MutableState $multiSelectionMode$delegate, final MutableState $mediaController$delegate, final MutableState $renameTarget$delegate, final MutableState $renameText$delegate, final MutableState $confirmDeleteIds$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C443@17008L4203,438@16808L4403:SavedAudiosActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1755966229, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosScreen.<anonymous>.<anonymous> (SavedAudiosActivity.kt:438)");
            }
            Modifier modifierM1050padding3ABfNKs = PaddingKt.m1050padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), C1834Dp.m7806constructorimpl(16));
            Arrangement.HorizontalOrVertical horizontalOrVerticalM909spacedBy0680j_4 = Arrangement.INSTANCE.m909spacedBy0680j_4(C1834Dp.m7806constructorimpl(10));
            ComposerKt.sourceInformationMarkerStart($composer, 438612310, "CC(remember):SavedAudiosActivity.kt#9igjgp");
            boolean zChanged = $composer.changed($selectionMode) | $composer.changed($chatId) | $composer.changed($chatType) | $composer.changedInstance($voiceMessageViewModel) | $composer.changedInstance($context) | $composer.changed($onBack);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SavedAudiosActivityKt.SavedAudiosScreen$lambda$56$2$0$0($items$delegate, $selectedIds, $selectionMode, $chatId, $chatType, $voiceMessageViewModel, $context, $onBack, $expandedUri$delegate, $currentPlayingUri$delegate, $currentProgressMs$delegate, $currentDurationMs$delegate, $isPlayerPlaying$delegate, $multiSelectionMode$delegate, $mediaController$delegate, $renameTarget$delegate, $renameText$delegate, $confirmDeleteIds$delegate, (LazyListScope) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            LazyDslKt.LazyColumn(modifierM1050padding3ABfNKs, null, null, false, horizontalOrVerticalM909spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, $composer, 24582, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$56$2$0$0(MutableState $items$delegate, final SnapshotStateList $selectedIds, final boolean $selectionMode, final String $chatId, final int $chatType, final VoiceMessageViewModel $voiceMessageViewModel, final Context $context, final Function0 $onBack, final MutableState $expandedUri$delegate, final MutableState $currentPlayingUri$delegate, final MutableLongState $currentProgressMs$delegate, final MutableLongState $currentDurationMs$delegate, final MutableState $isPlayerPlaying$delegate, final MutableState $multiSelectionMode$delegate, final MutableState $mediaController$delegate, final MutableState $renameTarget$delegate, final MutableState $renameText$delegate, final MutableState $confirmDeleteIds$delegate, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final List listSavedAudiosScreen$lambda$8 = SavedAudiosScreen$lambda$8($items$delegate);
        final Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedAudiosActivityKt.SavedAudiosScreen$lambda$56$2$0$0$0((SavedAudioUiItem) obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$lambda$56$2$0$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                return invoke((SavedAudioUiItem) p1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(SavedAudioUiItem savedAudioUiItem) {
                return null;
            }
        };
        LazyColumn.items(listSavedAudiosScreen$lambda$8.size(), new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$lambda$56$2$0$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function1.invoke(listSavedAudiosScreen$lambda$8.get(index));
            }
        }, new Function1<Integer, Object>() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$lambda$56$2$0$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int index) {
                return function12.invoke(listSavedAudiosScreen$lambda$8.get(index));
            }
        }, ComposableLambdaKt.composableLambdaInstance(802480018, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$lambda$56$2$0$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope $this$items, int it, Composer $composer, int $changed) {
                float fSavedAudiosScreen$lambda$36;
                final boolean z;
                final boolean z2;
                final SavedAudioUiItem savedAudioUiItem;
                boolean z3;
                Composer composer;
                final boolean z4;
                Object obj;
                Function0 function0;
                int i;
                float f;
                float f2;
                boolean z5;
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
                    int i2 = $dirty & 14;
                    SavedAudioUiItem savedAudioUiItem2 = (SavedAudioUiItem) listSavedAudiosScreen$lambda$8.get(it);
                    $composer.startReplaceGroup(-2053546032);
                    ComposerKt.sourceInformation($composer, "CN(item)*460@17955L1442,485@19437L295,492@19767L566,504@20370L133,508@20540L90,513@20775L280,453@17604L3473:SavedAudiosActivity.kt#acwjhs");
                    boolean zAreEqual = Intrinsics.areEqual(SavedAudiosActivityKt.SavedAudiosScreen$lambda$11($expandedUri$delegate), savedAudioUiItem2.getUri());
                    boolean zContains = $selectedIds.contains(Long.valueOf(savedAudioUiItem2.getId()));
                    boolean zAreEqual2 = Intrinsics.areEqual(savedAudioUiItem2.getUri().toString(), SavedAudiosActivityKt.SavedAudiosScreen$lambda$30($currentPlayingUri$delegate));
                    float fSavedAudiosScreen$lambda$39 = 0.0f;
                    if (zAreEqual2) {
                        fSavedAudiosScreen$lambda$36 = SavedAudiosActivityKt.SavedAudiosScreen$lambda$36($currentProgressMs$delegate);
                    } else {
                        fSavedAudiosScreen$lambda$36 = 0.0f;
                    }
                    float f3 = fSavedAudiosScreen$lambda$36;
                    if (zAreEqual2) {
                        fSavedAudiosScreen$lambda$39 = SavedAudiosActivityKt.SavedAudiosScreen$lambda$39($currentDurationMs$delegate);
                    }
                    float f4 = fSavedAudiosScreen$lambda$39;
                    boolean z6 = zAreEqual2 && SavedAudiosActivityKt.SavedAudiosScreen$lambda$33($isPlayerPlaying$delegate);
                    boolean zSavedAudiosScreen$lambda$17 = SavedAudiosActivityKt.SavedAudiosScreen$lambda$17($multiSelectionMode$delegate);
                    ComposerKt.sourceInformationMarkerStart($composer, -620407862, "CC(remember):SavedAudiosActivity.kt#9igjgp");
                    boolean zChanged = $composer.changed($chatId) | $composer.changed($selectionMode) | $composer.changed($chatType) | $composer.changedInstance($voiceMessageViewModel) | $composer.changedInstance($context) | $composer.changedInstance(savedAudioUiItem2) | $composer.changed($onBack) | $composer.changed(zContains) | $composer.changed(zAreEqual);
                    Object objRememberedValue = $composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        z = zAreEqual;
                        final boolean z7 = $selectionMode;
                        z2 = zContains;
                        final String str = $chatId;
                        savedAudioUiItem = savedAudioUiItem2;
                        final int i3 = $chatType;
                        final VoiceMessageViewModel voiceMessageViewModel = $voiceMessageViewModel;
                        boolean z8 = z6;
                        final Context context = $context;
                        final Function0 function02 = $onBack;
                        final SnapshotStateList snapshotStateList = $selectedIds;
                        final MutableState mutableState = $multiSelectionMode$delegate;
                        final MutableState mutableState2 = $expandedUri$delegate;
                        z3 = z8;
                        composer = $composer;
                        z4 = zAreEqual2;
                        obj = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$5$3$1$1$2$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (!z7 || str == null || i3 <= 0) {
                                    if (SavedAudiosActivityKt.SavedAudiosScreen$lambda$17(mutableState)) {
                                        if (z2) {
                                            snapshotStateList.remove(Long.valueOf(savedAudioUiItem.getId()));
                                        } else {
                                            snapshotStateList.add(Long.valueOf(savedAudioUiItem.getId()));
                                        }
                                        if (snapshotStateList.isEmpty()) {
                                            SavedAudiosActivityKt.SavedAudiosScreen$lambda$18(mutableState, false);
                                            return;
                                        }
                                        return;
                                    }
                                    mutableState2.setValue(z ? null : savedAudioUiItem.getUri());
                                    return;
                                }
                                VoiceMessageViewModel voiceMessageViewModel2 = voiceMessageViewModel;
                                Context context2 = context;
                                Uri uri = savedAudioUiItem.getUri();
                                String str2 = str;
                                long j = i3;
                                final String str3 = str;
                                final int i4 = i3;
                                voiceMessageViewModel2.selectAudioFromStorage(context2, uri, str2, j, new Function4<String, String, Long, Long, Unit>() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$5$3$1$1$2$1$1.1
                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(String str4, String str5, Long l, Long l2) {
                                        invoke(str4, str5, l.longValue(), l2.longValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(String fileKey, String fileHash, long fileSize, long duration) {
                                        Intrinsics.checkNotNullParameter(fileKey, "fileKey");
                                        Intrinsics.checkNotNullParameter(fileHash, "fileHash");
                                        Log.d("SavedAudios", "\u1f3a4 \u4ece\u8bed\u97f3\u5e93\u53d1\u9001\u8bed\u97f3: chatId=" + str3 + " chatType=" + i4 + " key=" + fileKey);
                                    }
                                });
                                function02.invoke();
                            }
                        };
                        $composer.updateRememberedValue(obj);
                    } else {
                        obj = objRememberedValue;
                        composer = $composer;
                        z = zAreEqual;
                        z2 = zContains;
                        z4 = zAreEqual2;
                        z3 = z6;
                        savedAudioUiItem = savedAudioUiItem2;
                    }
                    Function0 function03 = (Function0) obj;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, -620361585, "CC(remember):SavedAudiosActivity.kt#9igjgp");
                    boolean zChanged2 = composer.changed($selectionMode) | composer.changedInstance(savedAudioUiItem);
                    Composer composer2 = composer;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        function0 = function03;
                        i = i2;
                        final boolean z9 = $selectionMode;
                        f = f3;
                        final SnapshotStateList snapshotStateList2 = $selectedIds;
                        f2 = f4;
                        final MutableState mutableState3 = $multiSelectionMode$delegate;
                        Object obj2 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$5$3$1$1$2$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (!z9 && !SavedAudiosActivityKt.SavedAudiosScreen$lambda$17(mutableState3)) {
                                    SavedAudiosActivityKt.SavedAudiosScreen$lambda$18(mutableState3, true);
                                    snapshotStateList2.add(Long.valueOf(savedAudioUiItem.getId()));
                                }
                            }
                        };
                        composer2.updateRememberedValue(obj2);
                        objRememberedValue2 = obj2;
                    } else {
                        function0 = function03;
                        i = i2;
                        f = f3;
                        f2 = f4;
                    }
                    Function0 function04 = (Function0) objRememberedValue2;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, -620350754, "CC(remember):SavedAudiosActivity.kt#9igjgp");
                    boolean zChanged3 = composer.changed(z3) | composer.changedInstance($context) | composer.changedInstance(savedAudioUiItem);
                    Composer composer3 = composer;
                    Object objRememberedValue3 = composer3.rememberedValue();
                    if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        final Context context2 = $context;
                        final MutableState mutableState4 = $mediaController$delegate;
                        final MutableState mutableState5 = $expandedUri$delegate;
                        final boolean z10 = z3;
                        final SavedAudioUiItem savedAudioUiItem3 = savedAudioUiItem;
                        Object obj3 = new Function0<Unit>() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$5$3$1$1$2$3$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                MediaControllerCompat.TransportControls transportControls;
                                if (z10) {
                                    MediaControllerCompat mediaControllerCompatSavedAudiosScreen$lambda$42 = SavedAudiosActivityKt.SavedAudiosScreen$lambda$42(mutableState4);
                                    if (mediaControllerCompatSavedAudiosScreen$lambda$42 == null || (transportControls = mediaControllerCompatSavedAudiosScreen$lambda$42.getTransportControls()) == null) {
                                        return;
                                    }
                                    transportControls.pause();
                                    return;
                                }
                                AudioPlayerService.Companion companion = AudioPlayerService.INSTANCE;
                                Context context3 = context2;
                                String string = savedAudioUiItem3.getUri().toString();
                                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                                companion.startPlaySavedAudio(context3, string, savedAudioUiItem3.getDisplayName());
                                mutableState5.setValue(savedAudioUiItem3.getUri());
                            }
                        };
                        z5 = z10;
                        objRememberedValue3 = (Function0) obj3;
                        composer3.updateRememberedValue(objRememberedValue3);
                    } else {
                        z5 = z3;
                    }
                    Function0 function05 = (Function0) objRememberedValue3;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, -620331891, "CC(remember):SavedAudiosActivity.kt#9igjgp");
                    boolean zChangedInstance = composer.changedInstance(savedAudioUiItem);
                    Composer composer4 = composer;
                    Object objRememberedValue4 = composer4.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        final MutableState mutableState6 = $renameTarget$delegate;
                        final MutableState mutableState7 = $renameText$delegate;
                        Object obj4 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$5$3$1$1$2$4$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                mutableState6.setValue(savedAudioUiItem);
                                mutableState7.setValue(savedAudioUiItem.getDisplayName());
                            }
                        };
                        composer4.updateRememberedValue(obj4);
                        objRememberedValue4 = obj4;
                    }
                    Function0 function06 = (Function0) objRememberedValue4;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, -620326494, "CC(remember):SavedAudiosActivity.kt#9igjgp");
                    boolean zChangedInstance2 = composer.changedInstance(savedAudioUiItem);
                    Composer composer5 = composer;
                    Object objRememberedValue5 = composer5.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        final MutableState mutableState8 = $confirmDeleteIds$delegate;
                        Object obj5 = (Function0) new Function0<Unit>() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$5$3$1$1$2$5$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                mutableState8.setValue(CollectionsKt.listOf(Long.valueOf(savedAudioUiItem.getId())));
                            }
                        };
                        composer5.updateRememberedValue(obj5);
                        objRememberedValue5 = obj5;
                    }
                    Function0 function07 = (Function0) objRememberedValue5;
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    ComposerKt.sourceInformationMarkerStart(composer, -620318784, "CC(remember):SavedAudiosActivity.kt#9igjgp");
                    boolean zChanged4 = composer.changed(z4);
                    Composer composer6 = composer;
                    Object objRememberedValue6 = composer6.rememberedValue();
                    if (zChanged4 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        final MutableState mutableState9 = $mediaController$delegate;
                        final MutableLongState mutableLongState = $currentProgressMs$delegate;
                        Object obj6 = (Function1) new Function1<Float, Unit>() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$SavedAudiosScreen$5$3$1$1$2$6$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Float f5) {
                                invoke(f5.floatValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(float posMs) {
                                MediaControllerCompat.TransportControls transportControls;
                                if (z4) {
                                    MediaControllerCompat mediaControllerCompatSavedAudiosScreen$lambda$42 = SavedAudiosActivityKt.SavedAudiosScreen$lambda$42(mutableState9);
                                    if (mediaControllerCompatSavedAudiosScreen$lambda$42 != null && (transportControls = mediaControllerCompatSavedAudiosScreen$lambda$42.getTransportControls()) != null) {
                                        transportControls.seekTo((long) posMs);
                                    }
                                    mutableLongState.setLongValue((long) posMs);
                                }
                            }
                        };
                        composer6.updateRememberedValue(obj6);
                        objRememberedValue6 = obj6;
                    }
                    ComposerKt.sourceInformationMarkerEnd(composer);
                    Composer composer7 = composer;
                    SavedAudioUiItem savedAudioUiItem4 = savedAudioUiItem;
                    SavedAudiosActivityKt.SavedAudioCard(savedAudioUiItem4, z, zSavedAudiosScreen$lambda$17, z2, z4, z5, function0, function04, function05, function06, function07, f, f2, (Function1) objRememberedValue6, composer7, (i >> 3) & 14, 0);
                    composer7.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                $composer.skipToGroupEnd();
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$SavedAudiosActivityKt.INSTANCE.m11707getLambda$36850944$app_debug(), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object SavedAudiosScreen$lambda$56$2$0$0$0(SavedAudioUiItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = it.getUri().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$57$0(MutableState $renameTarget$delegate) {
        $renameTarget$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$60(final MutableState $renameText$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C536@21543L19,534@21448L171:SavedAudiosActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1253638613, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosScreen.<anonymous> (SavedAudiosActivity.kt:534)");
            }
            String strSavedAudiosScreen$lambda$24 = SavedAudiosScreen$lambda$24($renameText$delegate);
            ComposerKt.sourceInformationMarkerStart($composer, -2139099448, "CC(remember):SavedAudiosActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function1() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda23
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SavedAudiosActivityKt.SavedAudiosScreen$lambda$60$0$0($renameText$delegate, (String) obj2);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            OutlinedTextFieldKt.OutlinedTextField(strSavedAudiosScreen$lambda$24, (Function1<? super String, Unit>) objRememberedValue, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, $composer, 48, 12582912, 0, 8257532);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$60$0$0(MutableState $renameText$delegate, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        $renameText$delegate.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$58(final SavedAudioUiItem $target, final CoroutineScope $scope, final ContentResolver $resolver, final ManagedActivityResultLauncher $intentSenderLauncher, final Context $context, final MutableState $renameText$delegate, final MutableState $renameTarget$delegate, final SnapshotStateList $selectedIds, final MutableState $grantedTreeUri$delegate, final MutableState $items$delegate, final MutableState $multiSelectionMode$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C542@21723L1468,541@21681L1579:SavedAudiosActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(720791824, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosScreen.<anonymous> (SavedAudiosActivity.kt:541)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1191211596, "CC(remember):SavedAudiosActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($target) | $composer.changedInstance($scope) | $composer.changedInstance($resolver) | $composer.changedInstance($intentSenderLauncher) | $composer.changedInstance($context);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SavedAudiosActivityKt.SavedAudiosScreen$lambda$58$0$0($target, $scope, $renameText$delegate, $resolver, $intentSenderLauncher, $renameTarget$delegate, $context, $selectedIds, $grantedTreeUri$delegate, $items$delegate, $multiSelectionMode$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SavedAudiosActivityKt.INSTANCE.m11710getLambda$477026483$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$58$0$0(SavedAudioUiItem $target, CoroutineScope $scope, MutableState $renameText$delegate, ContentResolver $resolver, ManagedActivityResultLauncher $intentSenderLauncher, MutableState $renameTarget$delegate, Context $context, SnapshotStateList $selectedIds, MutableState $grantedTreeUri$delegate, MutableState $items$delegate, MutableState $multiSelectionMode$delegate) {
        String str;
        String newName = StringsKt.trim((CharSequence) SavedAudiosScreen$lambda$24($renameText$delegate)).toString();
        if (newName.length() == 0) {
            return Unit.INSTANCE;
        }
        String ext = StringsKt.substringAfterLast($target.getDisplayName(), '.', "");
        if (!StringsKt.isBlank(ext) && !StringsKt.endsWith(newName, "." + ext, true)) {
            str = newName + "." + ext;
        } else {
            str = newName;
        }
        String finalName = str;
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new SavedAudiosActivityKt$SavedAudiosScreen$7$1$1$1($resolver, $target, $intentSenderLauncher, finalName, $renameTarget$delegate, $context, $selectedIds, $grantedTreeUri$delegate, $items$delegate, $multiSelectionMode$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$59(final MutableState $renameTarget$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C578@23343L23,578@23322L60:SavedAudiosActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1643049838, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosScreen.<anonymous> (SavedAudiosActivity.kt:578)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 1577071881, "CC(remember):SavedAudiosActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SavedAudiosActivityKt.SavedAudiosScreen$lambda$59$0$0($renameTarget$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SavedAudiosActivityKt.INSTANCE.getLambda$1454099151$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$59$0$0(MutableState $renameTarget$delegate) {
        $renameTarget$delegate.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$61$0(MutableState $confirmDeleteIds$delegate) {
        $confirmDeleteIds$delegate.setValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$62(final CoroutineScope $scope, final ContentResolver $resolver, final Context $context, final ManagedActivityResultLauncher $intentSenderLauncher, final MutableState $confirmDeleteIds$delegate, final SnapshotStateList $selectedIds, final MutableState $grantedTreeUri$delegate, final MutableState $items$delegate, final MutableState $multiSelectionMode$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C590@23711L1533,589@23669L1685:SavedAudiosActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1723983993, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosScreen.<anonymous> (SavedAudiosActivity.kt:589)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, -1108755530, "CC(remember):SavedAudiosActivity.kt#9igjgp");
            boolean zChangedInstance = $composer.changedInstance($scope) | $composer.changedInstance($resolver) | $composer.changedInstance($context) | $composer.changedInstance($intentSenderLauncher);
            Object objRememberedValue = $composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SavedAudiosActivityKt.SavedAudiosScreen$lambda$62$0$0($scope, $confirmDeleteIds$delegate, $resolver, $intentSenderLauncher, $context, $selectedIds, $grantedTreeUri$delegate, $items$delegate, $multiSelectionMode$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SavedAudiosActivityKt.INSTANCE.getLambda$1671826294$app_debug(), $composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$62$0$0(CoroutineScope $scope, MutableState $confirmDeleteIds$delegate, ContentResolver $resolver, ManagedActivityResultLauncher $intentSenderLauncher, Context $context, SnapshotStateList $selectedIds, MutableState $grantedTreeUri$delegate, MutableState $items$delegate, MutableState $multiSelectionMode$delegate) {
        List ids = SavedAudiosScreen$lambda$27($confirmDeleteIds$delegate);
        $confirmDeleteIds$delegate.setValue(CollectionsKt.emptyList());
        BuildersKt__Builders_commonKt.launch$default($scope, null, null, new SavedAudiosActivityKt$SavedAudiosScreen$11$1$1$1(ids, $resolver, $intentSenderLauncher, $context, $selectedIds, $grantedTreeUri$delegate, $items$delegate, $multiSelectionMode$delegate, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$63(final MutableState $confirmDeleteIds$delegate, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C625@25437L34,625@25416L71:SavedAudiosActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2109846395, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudiosScreen.<anonymous> (SavedAudiosActivity.kt:625)");
            }
            ComposerKt.sourceInformationMarkerStart($composer, 337823165, "CC(remember):SavedAudiosActivity.kt#9igjgp");
            Object objRememberedValue = $composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object obj = new Function0() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SavedAudiosActivityKt.SavedAudiosScreen$lambda$63$0$0($confirmDeleteIds$delegate);
                    }
                };
                $composer.updateRememberedValue(obj);
                objRememberedValue = obj;
            }
            ComposerKt.sourceInformationMarkerEnd($composer);
            ButtonKt.TextButton((Function0) objRememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SavedAudiosActivityKt.INSTANCE.getLambda$2057688696$app_debug(), $composer, 805306374, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudiosScreen$lambda$63$0$0(MutableState $confirmDeleteIds$delegate) {
        $confirmDeleteIds$delegate.setValue(CollectionsKt.emptyList());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SavedAudioCard(final SavedAudioUiItem item, final boolean isExpanded, final boolean selectionMode, final boolean selected, final boolean isActive, final boolean isPlaying, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, final Function0<Unit> function04, final Function0<Unit> function05, final float sliderPosMs, final float sliderMaxMs, final Function1<? super Float, Unit> function1, Composer $composer, final int $changed, final int $changed1) {
        SavedAudioUiItem savedAudioUiItem;
        Function0<Unit> function06;
        Composer $composer2;
        Composer $composer3 = $composer.startRestartGroup(-1455782785);
        ComposerKt.sourceInformation($composer3, "C(SavedAudioCard)N(item,isExpanded,selectionMode,selected,isActive,isPlaying,onClick,onLongClick,onPlay,onRename,onDelete,sliderPosMs,sliderMaxMs,onSeek)649@25982L85,662@26387L11,661@26332L84,664@26423L2534,653@26073L2884:SavedAudiosActivity.kt#acwjhs");
        int $dirty = $changed;
        int $dirty1 = $changed1;
        if (($changed & 6) == 0) {
            savedAudioUiItem = item;
            $dirty |= $composer3.changedInstance(savedAudioUiItem) ? 4 : 2;
        } else {
            savedAudioUiItem = item;
        }
        if (($changed & 48) == 0) {
            $dirty |= $composer3.changed(isExpanded) ? 32 : 16;
        }
        if (($changed & 384) == 0) {
            $dirty |= $composer3.changed(selectionMode) ? 256 : 128;
        }
        if (($changed & 3072) == 0) {
            $dirty |= $composer3.changed(selected) ? 2048 : 1024;
        }
        if (($changed & 24576) == 0) {
            $dirty |= $composer3.changed(isActive) ? 16384 : 8192;
        }
        if (($changed & ProfileVerifier.CompilationStatus.f207xf2722a21) == 0) {
            $dirty |= $composer3.changed(isPlaying) ? 131072 : 65536;
        }
        if (($changed & 1572864) == 0) {
            $dirty |= $composer3.changedInstance(function0) ? 1048576 : 524288;
        }
        if (($changed & 12582912) == 0) {
            function06 = function02;
            $dirty |= $composer3.changedInstance(function06) ? 8388608 : 4194304;
        } else {
            function06 = function02;
        }
        if (($changed & 100663296) == 0) {
            $dirty |= $composer3.changedInstance(function03) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (($changed & 805306368) == 0) {
            $dirty |= $composer3.changedInstance(function04) ? 536870912 : 268435456;
        }
        if (($changed1 & 6) == 0) {
            $dirty1 |= $composer3.changedInstance(function05) ? 4 : 2;
        }
        if (($changed1 & 48) == 0) {
            $dirty1 |= $composer3.changed(sliderPosMs) ? 32 : 16;
        }
        if (($changed1 & 384) == 0) {
            $dirty1 |= $composer3.changed(sliderMaxMs) ? 256 : 128;
        }
        if (($changed1 & 3072) == 0) {
            $dirty1 |= $composer3.changedInstance(function1) ? 2048 : 1024;
        }
        if ($composer3.shouldExecute(((306783379 & $dirty) == 306783378 && ($dirty1 & 1171) == 1170) ? false : true, $dirty & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1455782785, $dirty, $dirty1, "com.yhchat.canarys.ui.settings.SavedAudioCard (SavedAudiosActivity.kt:648)");
            }
            long dateAddedSeconds = savedAudioUiItem.getDateAddedSeconds();
            ComposerKt.sourceInformationMarkerStart($composer3, 1152094996, "CC(remember):SavedAudiosActivity.kt#9igjgp");
            boolean zChanged = $composer3.changed(dateAddedSeconds);
            Object objRememberedValue = $composer3.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Object dateTime = formatDateTime(savedAudioUiItem.getDateAddedSeconds());
                $composer3.updateRememberedValue(dateTime);
                objRememberedValue = dateTime;
            }
            final String timeText = (String) objRememberedValue;
            ComposerKt.sourceInformationMarkerEnd($composer3);
            final SavedAudioUiItem savedAudioUiItem2 = savedAudioUiItem;
            CardKt.Card(ClickableKt.m526combinedClickablehoGz1lA$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, function06, null, false, null, function0, 239, null), RoundedCornerShapeKt.m1414RoundedCornerShape0680j_4(C1834Dp.m7806constructorimpl(16)), CardDefaults.INSTANCE.m2495cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme($composer3, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, $composer3, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(-188748687, true, new Function3() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return SavedAudiosActivityKt.SavedAudioCard$lambda$1(isExpanded, isActive, selectionMode, sliderMaxMs, sliderPosMs, function1, selected, function0, function03, function04, function05, savedAudioUiItem2, timeText, isPlaying, (ColumnScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
                }
            }, $composer3, 54), $composer3, ProfileVerifier.CompilationStatus.f207xf2722a21, 24);
            $composer2 = $composer3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            $composer2 = $composer3;
            $composer2.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = $composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SavedAudiosActivityKt.SavedAudioCard$lambda$2(item, isExpanded, selectionMode, selected, isActive, isPlaying, function0, function02, function03, function04, function05, sliderPosMs, sliderMaxMs, function1, $changed, $changed1, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0582  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0646  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x068a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.Unit SavedAudioCard$lambda$1(boolean r115, boolean r116, boolean r117, float r118, float r119, kotlin.jvm.functions.Function1 r120, boolean r121, final kotlin.jvm.functions.Function0 r122, kotlin.jvm.functions.Function0 r123, kotlin.jvm.functions.Function0 r124, kotlin.jvm.functions.Function0 r125, com.yhchat.canarys.p007ui.settings.SavedAudioUiItem r126, java.lang.String r127, final boolean r128, androidx.compose.foundation.layout.ColumnScope r129, androidx.compose.runtime.Composer r130, int r131) {
        /*
            Method dump skipped, instructions count: 1919
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.SavedAudioCard$lambda$1(boolean, boolean, boolean, float, float, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, com.yhchat.canarys.ui.settings.SavedAudioUiItem, java.lang.String, boolean, androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):kotlin.Unit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudioCard$lambda$1$0$0$0$0(Function0 $onClick, boolean it) {
        $onClick.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SavedAudioCard$lambda$1$0$0$2(boolean $isPlaying, Composer $composer, int $changed) {
        ComposerKt.sourceInformation($composer, "C689@27494L217:SavedAudiosActivity.kt#acwjhs");
        if (!$composer.shouldExecute(($changed & 3) != 2, $changed & 1)) {
            $composer.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1383998150, $changed, -1, "com.yhchat.canarys.ui.settings.SavedAudioCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SavedAudiosActivity.kt:689)");
            }
            Icons.Filled filled = Icons.INSTANCE.getDefault();
            IconKt.m2816Iconww6aTOc($isPlaying ? PauseKt.getPause(filled) : PlayArrowKt.getPlayArrow(filled), $isPlaying ? "\u6682\u505c" : "\u64ad\u653e", (Modifier) null, 0L, $composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SavedAudioUiItem> querySavedAudios(ContentResolver resolver) {
        String selection;
        String[] selectionArgs;
        String legacyDirPrefix = legacySavedAudiosDirPrefix();
        String[] projection = Build.VERSION.SDK_INT >= 29 ? new String[]{"_id", "_display_name", "date_added", "_size"} : new String[]{"_id", "_display_name", "date_added", "_size", "_data"};
        if (Build.VERSION.SDK_INT >= 29) {
            selection = "relative_path=?";
            selectionArgs = new String[]{"Download/yhchat/audio/"};
        } else {
            selection = "_data LIKE ?";
            selectionArgs = new String[]{legacyDirPrefix + "%"};
        }
        List results = new ArrayList();
        Cursor cursorQuery = resolver.query(savedAudiosCollectionUri(), projection, selection, selectionArgs, "date_added DESC");
        if (cursorQuery != null) {
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("_display_name");
                int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("date_added");
                int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("_size");
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(columnIndexOrThrow);
                    String string = cursor2.getString(columnIndexOrThrow2);
                    if (string == null) {
                        string = "\u8bed\u97f3";
                    }
                    String str = string;
                    long j2 = cursor2.getLong(columnIndexOrThrow3);
                    long j3 = cursor2.getLong(columnIndexOrThrow4);
                    Uri uriWithAppendedId = ContentUris.withAppendedId(savedAudiosCollectionUri(), j);
                    Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                    results.add(new SavedAudioUiItem(j, uriWithAppendedId, str, j2, j3));
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
            } finally {
            }
        }
        return results;
    }

    /* compiled from: SavedAudiosActivity.kt */
    @Metadata(m168d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\r\u0012\t\u0012\u00070\u0002\u00a2\u0006\u0002\b\u00030\u0001*\u00020\u0004H\n"}, m169d2 = {"<anonymous>", "", "Lcom/yhchat/canarys/ui/settings/SavedAudioUiItem;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$reloadAll$2", m185f = "SavedAudiosActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$reloadAll$2 */
    static final class C42012 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SavedAudioUiItem>>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ ContentResolver $resolver;
        final /* synthetic */ Uri $treeUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C42012(ContentResolver contentResolver, Context context, Uri uri, Continuation<? super C42012> continuation) {
            super(2, continuation);
            this.$resolver = contentResolver;
            this.$context = context;
            this.$treeUri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C42012(this.$resolver, this.$context, this.$treeUri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SavedAudioUiItem>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SavedAudioUiItem>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SavedAudioUiItem>> continuation) {
            return ((C42012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Iterable<SavedAudioUiItem> ms = SavedAudiosActivityKt.querySavedAudios(this.$resolver);
                    Iterable<SavedAudioUiItem> saf = SavedAudiosActivityKt.queryAudiosFromTree(this.$context, this.$treeUri);
                    LinkedHashMap merged = new LinkedHashMap();
                    for (SavedAudioUiItem savedAudioUiItem : ms) {
                        merged.put(savedAudioUiItem.getUri().toString(), savedAudioUiItem);
                    }
                    for (SavedAudioUiItem savedAudioUiItem2 : saf) {
                        merged.put(savedAudioUiItem2.getUri().toString(), savedAudioUiItem2);
                    }
                    Iterable iterableValues = merged.values();
                    Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
                    return CollectionsKt.toList(iterableValues);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object reloadAll(ContentResolver resolver, Uri treeUri, Context context, Continuation<? super List<SavedAudioUiItem>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C42012(resolver, context, treeUri, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<SavedAudioUiItem> queryAudiosFromTree(Context context, Uri treeUri) {
        Object objM11919constructorimpl;
        int i;
        Object objM11919constructorimpl2;
        if (treeUri == null) {
            return CollectionsKt.emptyList();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM11919constructorimpl = Result.m11919constructorimpl(DocumentFile.fromTreeUri(context, treeUri));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11919constructorimpl = Result.m11919constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11925isFailureimpl(objM11919constructorimpl)) {
            objM11919constructorimpl = null;
        }
        DocumentFile docTree = (DocumentFile) objM11919constructorimpl;
        if (docTree != null && docTree.isDirectory()) {
            List results = new ArrayList();
            long nowSec = System.currentTimeMillis() / 1000;
            Object[] objArrListFiles = docTree.listFiles();
            Intrinsics.checkNotNullExpressionValue(objArrListFiles, "listFiles(...)");
            Object[] objArr = objArrListFiles;
            int i2 = 0;
            int length = objArr.length;
            boolean z = false;
            int i3 = 0;
            while (i3 < length) {
                int i4 = i2 + 1;
                DocumentFile documentFile = (DocumentFile) objArr[i3];
                int i5 = i2;
                if (!documentFile.isFile()) {
                    i = i3;
                } else {
                    String type = documentFile.getType();
                    if (type == null) {
                        i = i3;
                    } else if (StringsKt.startsWith$default(type, "audio/", z, 2, (Object) null)) {
                        Uri uri = documentFile.getUri();
                        Intrinsics.checkNotNullExpressionValue(uri, "getUri(...)");
                        String name = documentFile.getName();
                        if (name == null) {
                            name = "\u97f3\u9891";
                        }
                        String str = name;
                        try {
                            Result.Companion companion3 = Result.INSTANCE;
                            objM11919constructorimpl2 = Result.m11919constructorimpl(Long.valueOf(documentFile.length()));
                        } catch (Throwable th2) {
                            Result.Companion companion4 = Result.INSTANCE;
                            objM11919constructorimpl2 = Result.m11919constructorimpl(ResultKt.createFailure(th2));
                        }
                        if (Result.m11925isFailureimpl(objM11919constructorimpl2)) {
                            objM11919constructorimpl2 = 0L;
                        }
                        i = i3;
                        results.add(new SavedAudioUiItem((-1) - i5, uri, str, nowSec, ((Number) objM11919constructorimpl2).longValue()));
                    } else {
                        i = i3;
                    }
                }
                i3 = i + 1;
                i2 = i4;
                z = false;
            }
            return results;
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void importAudioToSavedDir(Context context, Uri sourceUri) throws Exception {
        Uri outUri;
        ContentResolver resolver = context.getContentResolver();
        Intrinsics.checkNotNull(resolver);
        String name = queryDisplayName(resolver, sourceUri);
        if (name == null) {
            name = "audio_" + System.currentTimeMillis() + ".m4a";
        }
        ContentValues values = new ContentValues();
        values.put("_display_name", name);
        String type = resolver.getType(sourceUri);
        if (type == null) {
            type = "audio/*";
        }
        values.put("mime_type", type);
        if (Build.VERSION.SDK_INT >= 29) {
            values.put("relative_path", "Download/yhchat/audio/");
        } else {
            File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), "yhchat/audio");
            if (!file.exists()) {
                file.mkdirs();
            }
            values.put("_data", new File(file, name).getAbsolutePath());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            outUri = resolver.insert(savedAudiosCollectionUri(), values);
        } else {
            outUri = resolver.insert(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, values);
        }
        if (outUri == null) {
            throw new IOException("insert MediaStore failed");
        }
        try {
            OutputStream outputStreamOpenInputStream = resolver.openInputStream(sourceUri);
            try {
                InputStream inputStream = outputStreamOpenInputStream;
                if (inputStream == null) {
                    throw new IOException("openInputStream null");
                }
                outputStreamOpenInputStream = resolver.openOutputStream(outUri, "w");
                try {
                    OutputStream outputStream = outputStreamOpenInputStream;
                    if (outputStream != null) {
                        ByteStreamsKt.copyTo$default(inputStream, outputStream, 0, 2, null);
                        CloseableKt.closeFinally(outputStreamOpenInputStream, null);
                        CloseableKt.closeFinally(outputStreamOpenInputStream, null);
                        return;
                    }
                    throw new IOException("openOutputStream null");
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            try {
                Result.Companion companion = Result.INSTANCE;
                Result.m11919constructorimpl(Integer.valueOf(resolver.delete(outUri, null, null)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m11919constructorimpl(ResultKt.createFailure(th));
            }
            throw e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.lang.String queryDisplayName(android.content.ContentResolver r10, android.net.Uri r11) {
        /*
            java.lang.String r0 = "_display_name"
            r1 = 0
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L46
            r2 = 0
            r3 = 1
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch: java.lang.Throwable -> L46
            r3 = 0
            r6[r3] = r0     // Catch: java.lang.Throwable -> L46
            r8 = 0
            r9 = 0
            r7 = 0
            r4 = r10
            r5 = r11
            android.database.Cursor r10 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L43
            if (r10 == 0) goto L3c
            java.io.Closeable r10 = (java.io.Closeable) r10     // Catch: java.lang.Throwable -> L43
            r11 = r10
            android.database.Cursor r11 = (android.database.Cursor) r11     // Catch: java.lang.Throwable -> L34
            r3 = 0
            int r0 = r11.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L34
            if (r0 < 0) goto L2f
            boolean r6 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L2f
            java.lang.String r6 = r11.getString(r0)     // Catch: java.lang.Throwable -> L34
            goto L30
        L2f:
            r6 = r1
        L30:
            kotlin.p008io.CloseableKt.closeFinally(r10, r1)     // Catch: java.lang.Throwable -> L43
            goto L3d
        L34:
            r0 = move-exception
            r11 = r0
            throw r11     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            kotlin.p008io.CloseableKt.closeFinally(r10, r11)     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L43
        L3c:
            r6 = r1
        L3d:
            java.lang.Object r10 = kotlin.Result.m11919constructorimpl(r6)     // Catch: java.lang.Throwable -> L43
            goto L54
        L43:
            r0 = move-exception
            r10 = r0
            goto L4a
        L46:
            r0 = move-exception
            r4 = r10
            r5 = r11
            r10 = r0
        L4a:
            kotlin.Result$Companion r11 = kotlin.Result.INSTANCE
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            java.lang.Object r10 = kotlin.Result.m11919constructorimpl(r10)
        L54:
            boolean r11 = kotlin.Result.m11925isFailureimpl(r10)
            if (r11 == 0) goto L5b
            goto L5c
        L5b:
            r1 = r10
        L5c:
            java.lang.String r1 = (java.lang.String) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.settings.SavedAudiosActivityKt.queryDisplayName(android.content.ContentResolver, android.net.Uri):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void renameAudio(ContentResolver resolver, Uri uri, String newDisplayName) {
        ContentValues values = new ContentValues();
        values.put("_display_name", newDisplayName);
        resolver.update(uri, values, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void deleteAudiosByIds(ContentResolver resolver, List<Long> list) {
        if (list.isEmpty()) {
            return;
        }
        String placeholders = CollectionsKt.joinToString$default(list, ",", null, null, 0, null, new Function1() { // from class: com.yhchat.canarys.ui.settings.SavedAudiosActivityKt$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SavedAudiosActivityKt.deleteAudiosByIds$lambda$0(((Long) obj).longValue());
            }
        }, 30, null);
        String selection = "_id IN (" + placeholders + ")";
        List<Long> list2 = list;
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        String[] selectionArgs = (String[]) ((List) arrayList).toArray(new String[0]);
        resolver.delete(savedAudiosCollectionUri(), selection, selectionArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence deleteAudiosByIds$lambda$0(long it) {
        return "?";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri savedAudiosCollectionUri() {
        if (Build.VERSION.SDK_INT >= 29) {
            Uri uri = Uri.parse("content://media/external/downloads");
            Intrinsics.checkNotNull(uri);
            return uri;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        Intrinsics.checkNotNull(contentUri);
        return contentUri;
    }

    private static final String legacySavedAudiosDirPrefix() {
        File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File dir = new File(downloadsDir, "yhchat/audio");
        String path = dir.getAbsolutePath();
        Intrinsics.checkNotNull(path);
        return StringsKt.endsWith$default(path, "/", false, 2, (Object) null) ? path : path + "/";
    }

    private static final String formatDateTime(long dateAddedSeconds) {
        long millis = 1000 * dateAddedSeconds;
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        String str = fmt.format(new Date(millis));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final String formatDurationMs(long ms) {
        long totalSeconds = RangesKt.coerceAtLeast(ms / 1000, 0L);
        long j = 60;
        long m = totalSeconds / j;
        long s = totalSeconds % j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(m), Long.valueOf(s)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
