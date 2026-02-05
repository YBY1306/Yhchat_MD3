package com.yhchat.canarys.service;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.provider.MediaStore;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import androidx.documentfile.provider.DocumentFile;
import androidx.media.app.NotificationCompat;
import com.yhchat.canarys.C3011R;
import com.yhchat.canarys.MainActivity;
import com.yhchat.canarys.service.AudioPlayerService;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.p008io.CloseableKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: AudioPlayerService.kt */
@Metadata(m168d1 = {"\u0000\u00ae\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 m2\u00020\u0001:\u0003mnoB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010+\u001a\u00020,J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00101\u001a\u000202H\u0016J\b\u00103\u001a\u000202H\u0002J\"\u00104\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u0001002\u0006\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020)H\u0016J\u0012\u00107\u001a\u0002022\b\u00108\u001a\u0004\u0018\u00010\rH\u0002J\u000e\u00109\u001a\b\u0012\u0004\u0012\u00020'0:H\u0002J\b\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020\rH\u0002J\u000e\u0010>\u001a\b\u0012\u0004\u0012\u00020'0:H\u0002J\b\u0010?\u001a\u000202H\u0002J\b\u0010@\u001a\u000202H\u0002J\u0018\u0010A\u001a\u0002022\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\rH\u0002J \u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010B\u001a\u00020\r2\u0006\u0010C\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010FJ\u0018\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010B\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010E2\u0006\u0010K\u001a\u00020HH\u0002J\u0018\u0010L\u001a\u0002022\u0006\u0010M\u001a\u00020\r2\u0006\u0010C\u001a\u00020\rH\u0002J\u0018\u0010N\u001a\u0002022\u0006\u0010O\u001a\u00020\r2\u0006\u0010C\u001a\u00020\rH\u0002J\u001e\u0010P\u001a\u0002022\u0006\u0010Q\u001a\u00020E2\u0006\u0010C\u001a\u00020\rH\u0082@\u00a2\u0006\u0002\u0010RJ\b\u0010S\u001a\u000202H\u0002J\b\u0010T\u001a\u000202H\u0002J\b\u0010U\u001a\u000202H\u0002J\b\u0010V\u001a\u000202H\u0002J\b\u0010W\u001a\u000202H\u0002J\u0010\u0010X\u001a\u0002022\u0006\u0010Y\u001a\u00020\u000fH\u0002J\u0018\u0010Z\u001a\u0002022\u0006\u0010C\u001a\u00020\r2\u0006\u0010[\u001a\u00020\"H\u0002J\b\u0010\\\u001a\u00020\"H\u0002J\u0010\u0010]\u001a\u0002022\u0006\u0010^\u001a\u00020\"H\u0002J\u0010\u0010_\u001a\u00020\r2\u0006\u0010B\u001a\u00020\rH\u0002J\u0010\u0010`\u001a\u00020\r2\u0006\u0010M\u001a\u00020\rH\u0002J\u0010\u0010a\u001a\u00020\r2\u0006\u0010O\u001a\u00020\rH\u0002J\u0010\u0010b\u001a\u0002022\u0006\u0010^\u001a\u00020\"H\u0002J\b\u0010c\u001a\u00020\"H\u0002J\b\u0010d\u001a\u000202H\u0002J\b\u0010e\u001a\u000202H\u0002J\u0018\u0010f\u001a\u00020g2\u0006\u0010C\u001a\u00020\r2\u0006\u0010h\u001a\u00020\rH\u0002J\b\u0010i\u001a\u00020\u000fH\u0002J\u0018\u0010j\u001a\u00020g2\u0006\u0010C\u001a\u00020\r2\u0006\u0010h\u001a\u00020\rH\u0002J\u0018\u0010k\u001a\u0002022\u0006\u0010C\u001a\u00020\r2\u0006\u0010h\u001a\u00020\rH\u0002J\u0006\u0010\u000e\u001a\u00020\u000fJ\b\u0010l\u001a\u0004\u0018\u00010\rR\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R#\u0010\u0018\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006p"}, m169d2 = {"Lcom/yhchat/canarys/service/AudioPlayerService;", "Landroid/app/Service;", "<init>", "()V", "binder", "Lcom/yhchat/canarys/service/AudioPlayerService$AudioPlayerBinder;", "mediaPlayer", "Landroid/media/MediaPlayer;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "okHttpClient", "Lokhttp3/OkHttpClient;", "currentAudioUrl", "", "isPlaying", "", "audioCacheManager", "Lcom/yhchat/canarys/service/AudioCacheManager;", "currentTitle", "audioManager", "Landroid/media/AudioManager;", "audioFocusGranted", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "progressPrefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getProgressPrefs", "()Landroid/content/SharedPreferences;", "progressPrefs$delegate", "Lkotlin/Lazy;", "progressJob", "Lkotlinx/coroutines/Job;", "currentDurationMs", "", "currentLocalPath", "currentContentUri", "savedAudioQueue", "", "Lcom/yhchat/canarys/service/AudioPlayerService$SavedAudioItem;", "savedQueueIndex", "", "currentIsSavedAudio", "getSessionToken", "Landroid/support/v4/media/session/MediaSessionCompat$Token;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "createNotificationChannel", "onStartCommand", "flags", "startId", "refreshSavedAudioQueue", "selectedContentUri", "querySavedAudiosFromMediaStore", "", "savedAudiosCollectionUri", "Landroid/net/Uri;", "legacySavedAudiosDirPrefix", "querySavedAudiosFromAuthorizedFolder", "skipToNext", "skipToPrevious", "playAudio", "audioUrl", "title", "getOrDownloadAudio", "Ljava/io/File;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downloadAudioData", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTempAudioFile", "audioData", "playLocalAudio", "localPath", "playSavedAudioUri", "contentUri", "playAudioFile", "audioFile", "(Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pauseAudio", "resumeAudio", "stopAudio", "releaseMediaPlayer", "requestAudioFocus", "updatePlaybackState", "playing", "updateMetadata", "durationMs", "getCurrentPositionMs", "seekTo", "positionMs", "progressKeyFor", "progressKeyForLocalPath", "progressKeyForContentUri", "saveProgressForCurrentAudio", "restoreProgressForCurrentAudio", "startProgressUpdates", "stopProgressUpdates", "createNotification", "Landroid/app/Notification;", "content", "isFlyme", "createFlymeLiveNotification", "updateNotification", "getCurrentAudioUrl", "Companion", "SavedAudioItem", "AudioPlayerBinder", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final class AudioPlayerService extends Service {
    private static final String ACTION_NEXT = "action_next";
    private static final String ACTION_PAUSE = "action_pause";
    private static final String ACTION_PLAY = "action_play";
    private static final String ACTION_PREV = "action_prev";
    private static final String ACTION_SEEK = "action_seek";
    private static final String ACTION_STOP = "action_stop";
    private static final String CHANNEL_ID = "audio_player_channel";
    private static final String EXTRA_AUDIO_CONTENT_URI = "extra_audio_content_uri";
    public static final String EXTRA_AUDIO_TITLE = "extra_audio_title";
    public static final String EXTRA_AUDIO_URL = "extra_audio_url";
    private static final String EXTRA_IS_SAVED_AUDIO = "extra_is_saved_audio";
    private static final String EXTRA_LOCAL_AUDIO_PATH = "extra_local_audio_path";
    private static final String EXTRA_SEEK_POSITION_MS = "extra_seek_position_ms";
    private static final int NOTIFICATION_ID = 1001;
    private static final String SAVED_AUDIO_DIR = "/storage/emulated/0/Download/yhchat/audio/";
    private static final String TAG = "AudioPlayerService";
    private AudioCacheManager audioCacheManager;
    private boolean audioFocusGranted;
    private AudioManager audioManager;
    private String currentAudioUrl;
    private String currentContentUri;
    private long currentDurationMs;
    private boolean currentIsSavedAudio;
    private String currentLocalPath;
    private boolean isPlaying;
    private MediaPlayer mediaPlayer;
    private MediaSessionCompat mediaSession;
    private Job progressJob;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final AudioPlayerBinder binder = new AudioPlayerBinder();
    private final CoroutineScope serviceScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    private final OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() { // from class: com.yhchat.canarys.service.AudioPlayerService$special$$inlined$-addInterceptor$1
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return chain.proceed(chain.request().newBuilder().addHeader("Referer", "https://myapp.jwznb.com").addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36").build());
        }
    }).build();
    private String currentTitle = "\u8bed\u97f3\u6d88\u606f";

    /* renamed from: progressPrefs$delegate, reason: from kotlin metadata */
    private final Lazy progressPrefs = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.service.AudioPlayerService$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AudioPlayerService.progressPrefs_delegate$lambda$0(this.f$0);
        }
    });
    private final List<SavedAudioItem> savedAudioQueue = new ArrayList();
    private int savedQueueIndex = -1;

    /* compiled from: AudioPlayerService.kt */
    @Metadata(m168d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0005J \u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0005J \u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00052\b\b\u0002\u0010\u001b\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010!\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, m169d2 = {"Lcom/yhchat/canarys/service/AudioPlayerService$Companion;", "", "<init>", "()V", "TAG", "", "NOTIFICATION_ID", "", "CHANNEL_ID", "ACTION_PLAY", "ACTION_PAUSE", "ACTION_STOP", "ACTION_NEXT", "ACTION_PREV", "ACTION_SEEK", "EXTRA_AUDIO_URL", "EXTRA_AUDIO_TITLE", "EXTRA_LOCAL_AUDIO_PATH", "EXTRA_IS_SAVED_AUDIO", "EXTRA_AUDIO_CONTENT_URI", "EXTRA_SEEK_POSITION_MS", "SAVED_AUDIO_DIR", "startPlayAudio", "", "context", "Landroid/content/Context;", "audioUrl", "title", "startPlayLocalAudio", "localPath", "startPlaySavedAudio", "contentUri", "stopPlayAudio", "seekTo", "positionMs", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void startPlayAudio$default(Companion companion, Context context, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = "\u8bed\u97f3\u6d88\u606f";
            }
            companion.startPlayAudio(context, str, str2);
        }

        public final void startPlayAudio(Context context, String audioUrl, String title) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
            Intrinsics.checkNotNullParameter(title, "title");
            Intent intent = new Intent(context, (Class<?>) AudioPlayerService.class);
            intent.setAction(AudioPlayerService.ACTION_PLAY);
            intent.putExtra(AudioPlayerService.EXTRA_AUDIO_URL, audioUrl);
            intent.putExtra(AudioPlayerService.EXTRA_AUDIO_TITLE, title);
            context.startForegroundService(intent);
        }

        public static /* synthetic */ void startPlayLocalAudio$default(Companion companion, Context context, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = "\u8bed\u97f3";
            }
            companion.startPlayLocalAudio(context, str, str2);
        }

        public final void startPlayLocalAudio(Context context, String localPath, String title) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(localPath, "localPath");
            Intrinsics.checkNotNullParameter(title, "title");
            Intent intent = new Intent(context, (Class<?>) AudioPlayerService.class);
            intent.setAction(AudioPlayerService.ACTION_PLAY);
            intent.putExtra(AudioPlayerService.EXTRA_LOCAL_AUDIO_PATH, localPath);
            intent.putExtra(AudioPlayerService.EXTRA_AUDIO_TITLE, title);
            intent.putExtra(AudioPlayerService.EXTRA_IS_SAVED_AUDIO, true);
            context.startForegroundService(intent);
        }

        public static /* synthetic */ void startPlaySavedAudio$default(Companion companion, Context context, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = "\u8bed\u97f3";
            }
            companion.startPlaySavedAudio(context, str, str2);
        }

        public final void startPlaySavedAudio(Context context, String contentUri, String title) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            Intrinsics.checkNotNullParameter(title, "title");
            Intent intent = new Intent(context, (Class<?>) AudioPlayerService.class);
            intent.setAction(AudioPlayerService.ACTION_PLAY);
            intent.putExtra(AudioPlayerService.EXTRA_AUDIO_CONTENT_URI, contentUri);
            intent.putExtra(AudioPlayerService.EXTRA_AUDIO_TITLE, title);
            intent.putExtra(AudioPlayerService.EXTRA_IS_SAVED_AUDIO, true);
            context.startForegroundService(intent);
        }

        public final void stopPlayAudio(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) AudioPlayerService.class);
            intent.setAction(AudioPlayerService.ACTION_STOP);
            context.startService(intent);
        }

        public final void seekTo(Context context, long positionMs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) AudioPlayerService.class);
            intent.setAction(AudioPlayerService.ACTION_SEEK);
            intent.putExtra(AudioPlayerService.EXTRA_SEEK_POSITION_MS, positionMs);
            context.startService(intent);
        }
    }

    private final SharedPreferences getProgressPrefs() {
        return (SharedPreferences) this.progressPrefs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences progressPrefs_delegate$lambda$0(AudioPlayerService this$0) {
        return this$0.getSharedPreferences("audio_player_progress", 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AudioPlayerService.kt */
    @Metadata(m168d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/service/AudioPlayerService$SavedAudioItem;", "", "contentUri", "", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getContentUri", "()Ljava/lang/String;", "getTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    static final /* data */ class SavedAudioItem {
        private final String contentUri;
        private final String title;

        public static /* synthetic */ SavedAudioItem copy$default(SavedAudioItem savedAudioItem, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = savedAudioItem.contentUri;
            }
            if ((i & 2) != 0) {
                str2 = savedAudioItem.title;
            }
            return savedAudioItem.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getContentUri() {
            return this.contentUri;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final SavedAudioItem copy(String contentUri, String title) {
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            Intrinsics.checkNotNullParameter(title, "title");
            return new SavedAudioItem(contentUri, title);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SavedAudioItem)) {
                return false;
            }
            SavedAudioItem savedAudioItem = (SavedAudioItem) other;
            return Intrinsics.areEqual(this.contentUri, savedAudioItem.contentUri) && Intrinsics.areEqual(this.title, savedAudioItem.title);
        }

        public int hashCode() {
            return (this.contentUri.hashCode() * 31) + this.title.hashCode();
        }

        public String toString() {
            return "SavedAudioItem(contentUri=" + this.contentUri + ", title=" + this.title + ")";
        }

        public SavedAudioItem(String contentUri, String title) {
            Intrinsics.checkNotNullParameter(contentUri, "contentUri");
            Intrinsics.checkNotNullParameter(title, "title");
            this.contentUri = contentUri;
            this.title = title;
        }

        public final String getContentUri() {
            return this.contentUri;
        }

        public final String getTitle() {
            return this.title;
        }
    }

    /* compiled from: AudioPlayerService.kt */
    @Metadata(m168d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"}, m169d2 = {"Lcom/yhchat/canarys/service/AudioPlayerService$AudioPlayerBinder;", "Landroid/os/Binder;", "<init>", "(Lcom/yhchat/canarys/service/AudioPlayerService;)V", "getService", "Lcom/yhchat/canarys/service/AudioPlayerService;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public final class AudioPlayerBinder extends Binder {
        public AudioPlayerBinder() {
        }

        /* renamed from: getService, reason: from getter */
        public final AudioPlayerService getThis$0() {
            return AudioPlayerService.this;
        }
    }

    public final MediaSessionCompat.Token getSessionToken() {
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaSession");
            mediaSessionCompat = null;
        }
        MediaSessionCompat.Token sessionToken = mediaSessionCompat.getSessionToken();
        Intrinsics.checkNotNullExpressionValue(sessionToken, "getSessionToken(...)");
        return sessionToken;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        createNotificationChannel();
        this.audioCacheManager = new AudioCacheManager(this);
        Object systemService = getSystemService("audio");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
        MediaSessionCompat mediaSessionCompat = new MediaSessionCompat(this, TAG);
        mediaSessionCompat.setFlags(3);
        mediaSessionCompat.setCallback(new MediaSessionCompat.Callback() { // from class: com.yhchat.canarys.service.AudioPlayerService$onCreate$1$1
            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public void onPlay() throws IllegalStateException {
                String str = this.this$0.currentLocalPath;
                if (str != null) {
                    AudioPlayerService audioPlayerService = this.this$0;
                    audioPlayerService.playLocalAudio(str, audioPlayerService.currentTitle);
                    return;
                }
                AudioPlayerService audioPlayerService2 = this.this$0;
                String str2 = audioPlayerService2.currentAudioUrl;
                if (str2 != null) {
                    audioPlayerService2.playAudio(str2, audioPlayerService2.currentTitle);
                    return;
                }
                String str3 = audioPlayerService2.currentContentUri;
                if (str3 != null) {
                    audioPlayerService2.playSavedAudioUri(str3, audioPlayerService2.currentTitle);
                }
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public void onPause() throws IllegalStateException {
                this.this$0.pauseAudio();
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public void onStop() throws IllegalStateException {
                this.this$0.stopAudio();
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public void onSkipToNext() throws IllegalStateException {
                this.this$0.skipToNext();
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public void onSkipToPrevious() throws IllegalStateException {
                this.this$0.skipToPrevious();
            }

            @Override // android.support.v4.media.session.MediaSessionCompat.Callback
            public void onSeekTo(long pos) {
                this.this$0.seekTo(pos);
            }
        });
        mediaSessionCompat.setActive(true);
        this.mediaSession = mediaSessionCompat;
        Log.d(TAG, "AudioPlayerService created");
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, "\u8bed\u97f3\u64ad\u653e", 2);
            channel.setDescription("\u8bed\u97f3\u6d88\u606f\u64ad\u653e\u901a\u77e5");
            channel.setSound(null, null);
            Object systemService = getSystemService("notification");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            notificationManager.createNotificationChannel(channel);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) throws IllegalStateException {
        String action = intent != null ? intent.getAction() : null;
        if (action == null) {
            return 2;
        }
        switch (action.hashCode()) {
            case 1583560540:
                if (action.equals(ACTION_NEXT)) {
                    skipToNext();
                    break;
                }
                break;
            case 1583626141:
                if (action.equals(ACTION_PLAY)) {
                    String title = intent.getStringExtra(EXTRA_AUDIO_TITLE);
                    if (title == null) {
                        title = "\u8bed\u97f3\u6d88\u606f";
                    }
                    String localPath = intent.getStringExtra(EXTRA_LOCAL_AUDIO_PATH);
                    String contentUri = intent.getStringExtra(EXTRA_AUDIO_CONTENT_URI);
                    boolean z = false;
                    boolean isSaved = intent.getBooleanExtra(EXTRA_IS_SAVED_AUDIO, false);
                    String audioUrl = intent.getStringExtra(EXTRA_AUDIO_URL);
                    String str = contentUri;
                    boolean z2 = true;
                    if (!(str == null || StringsKt.isBlank(str))) {
                        this.currentIsSavedAudio = true;
                        this.currentContentUri = contentUri;
                        this.currentLocalPath = null;
                        refreshSavedAudioQueue(contentUri);
                        int size = this.savedAudioQueue.size();
                        int i = this.savedQueueIndex;
                        if (i >= 0 && i < size) {
                            z = true;
                        }
                        this.currentIsSavedAudio = z;
                        playSavedAudioUri(contentUri, title);
                        break;
                    } else {
                        String str2 = localPath;
                        if (!(str2 == null || StringsKt.isBlank(str2))) {
                            this.currentIsSavedAudio = isSaved;
                            this.currentLocalPath = localPath;
                            this.currentContentUri = null;
                            playLocalAudio(localPath, title);
                            break;
                        } else {
                            String str3 = audioUrl;
                            if (str3 != null && !StringsKt.isBlank(str3)) {
                                z2 = false;
                            }
                            if (!z2) {
                                this.currentIsSavedAudio = false;
                                this.currentLocalPath = null;
                                this.currentContentUri = null;
                                this.currentAudioUrl = audioUrl;
                                playAudio(audioUrl, title);
                                break;
                            } else {
                                resumeAudio();
                                break;
                            }
                        }
                    }
                }
                break;
            case 1583632028:
                if (action.equals(ACTION_PREV)) {
                    skipToPrevious();
                    break;
                }
                break;
            case 1583708897:
                if (action.equals(ACTION_SEEK)) {
                    long pos = intent.getLongExtra(EXTRA_SEEK_POSITION_MS, -1L);
                    if (pos >= 0) {
                        seekTo(pos);
                        break;
                    }
                }
                break;
            case 1583723627:
                if (action.equals(ACTION_STOP)) {
                    stopAudio();
                    break;
                }
                break;
            case 1847461549:
                if (action.equals(ACTION_PAUSE)) {
                    pauseAudio();
                    break;
                }
                break;
        }
        return 2;
    }

    private final void refreshSavedAudioQueue(String selectedContentUri) {
        LinkedHashMap merged = new LinkedHashMap();
        for (SavedAudioItem savedAudioItem : querySavedAudiosFromMediaStore()) {
            merged.put(savedAudioItem.getContentUri(), savedAudioItem);
        }
        for (SavedAudioItem savedAudioItem2 : querySavedAudiosFromAuthorizedFolder()) {
            merged.put(savedAudioItem2.getContentUri(), savedAudioItem2);
        }
        Iterable iterableValues = merged.values();
        Intrinsics.checkNotNullExpressionValue(iterableValues, "<get-values>(...)");
        final Comparator<String> case_insensitive_order = StringsKt.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE);
        List results = CollectionsKt.sortedWith(iterableValues, new Comparator() { // from class: com.yhchat.canarys.service.AudioPlayerService$refreshSavedAudioQueue$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return case_insensitive_order.compare(((AudioPlayerService.SavedAudioItem) t).getTitle(), ((AudioPlayerService.SavedAudioItem) t2).getTitle());
            }
        });
        this.savedAudioQueue.clear();
        this.savedAudioQueue.addAll(results);
        String str = selectedContentUri;
        int i = -1;
        if (!(str == null || StringsKt.isBlank(str))) {
            int i2 = 0;
            Iterator<SavedAudioItem> it = this.savedAudioQueue.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (Intrinsics.areEqual(((SavedAudioItem) it.next()).getContentUri(), selectedContentUri)) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        this.savedQueueIndex = i;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    private final List<SavedAudioItem> querySavedAudiosFromMediaStore() {
        String selection;
        String[] selectionArgs;
        Throwable th;
        String string;
        String[] projection;
        ContentResolver resolver = getContentResolver();
        String legacyDirPrefix = legacySavedAudiosDirPrefix();
        String[] projection2 = Build.VERSION.SDK_INT >= 29 ? new String[]{"_id", "_display_name"} : new String[]{"_id", "_display_name", "_data"};
        if (Build.VERSION.SDK_INT >= 29) {
            selection = "relative_path=?";
            selectionArgs = new String[]{"Download/yhchat/audio/"};
        } else {
            selection = "_data LIKE ?";
            selectionArgs = new String[]{legacyDirPrefix + "%"};
        }
        List results = new ArrayList();
        String[] projection3 = projection2;
        Cursor cursorQuery = resolver.query(savedAudiosCollectionUri(), projection3, selection, selectionArgs, "_display_name COLLATE NOCASE ASC");
        if (cursorQuery != null) {
            Cursor cursor = cursorQuery;
            try {
                Cursor cursor2 = cursor;
                int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("_id");
                int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("_display_name");
                while (cursor2.moveToNext()) {
                    long j = cursor2.getLong(columnIndexOrThrow);
                    String string2 = cursor2.getString(columnIndexOrThrow2);
                    if (string2 == null) {
                        string2 = "\u8bed\u97f3";
                    }
                    Cursor cursor3 = cursor2;
                    Uri uriWithAppendedId = ContentUris.withAppendedId(savedAudiosCollectionUri(), j);
                    ContentResolver resolver2 = resolver;
                    try {
                        Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(...)");
                        string = uriWithAppendedId.toString();
                        projection = projection3;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            throw th;
                        } catch (Throwable th3) {
                            CloseableKt.closeFinally(cursor, th);
                            throw th3;
                        }
                    }
                    try {
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        results.add(new SavedAudioItem(string, StringsKt.substringBeforeLast(string2, '.', string2)));
                        cursor2 = cursor3;
                        resolver = resolver2;
                        projection3 = projection;
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                }
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursor, null);
            } catch (Throwable th5) {
                th = th5;
            }
        }
        return results;
    }

    private final Uri savedAudiosCollectionUri() {
        if (Build.VERSION.SDK_INT >= 29) {
            Uri uri = Uri.parse("content://media/external/downloads");
            Intrinsics.checkNotNull(uri);
            return uri;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        Intrinsics.checkNotNull(contentUri);
        return contentUri;
    }

    private final String legacySavedAudiosDirPrefix() {
        File downloadsDir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        File dir = new File(downloadsDir, "yhchat/audio");
        String path = dir.getAbsolutePath();
        Intrinsics.checkNotNull(path);
        return StringsKt.endsWith$default(path, "/", false, 2, (Object) null) ? path : path + "/";
    }

    private final List<SavedAudioItem> querySavedAudiosFromAuthorizedFolder() {
        Object objM11919constructorimpl;
        Object objM11919constructorimpl2;
        DocumentFile tree;
        boolean z = false;
        SharedPreferences prefs = getSharedPreferences("saved_audios", 0);
        Object obj = null;
        String treeUriStr = prefs.getString("saved_audios_tree_uri", null);
        if (treeUriStr == null) {
            return CollectionsKt.emptyList();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            AudioPlayerService audioPlayerService = this;
            objM11919constructorimpl = Result.m11919constructorimpl(Uri.parse(treeUriStr));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11919constructorimpl = Result.m11919constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11925isFailureimpl(objM11919constructorimpl)) {
            objM11919constructorimpl = null;
        }
        Uri treeUri = (Uri) objM11919constructorimpl;
        if (treeUri == null) {
            return CollectionsKt.emptyList();
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            objM11919constructorimpl2 = Result.m11919constructorimpl(DocumentFile.fromTreeUri(this, treeUri));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            objM11919constructorimpl2 = Result.m11919constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m11925isFailureimpl(objM11919constructorimpl2)) {
            objM11919constructorimpl2 = null;
        }
        DocumentFile tree2 = (DocumentFile) objM11919constructorimpl2;
        if (tree2 != null && tree2.isDirectory()) {
            List results = new ArrayList();
            Object[] objArrListFiles = tree2.listFiles();
            Intrinsics.checkNotNullExpressionValue(objArrListFiles, "listFiles(...)");
            Object[] objArr = objArrListFiles;
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                DocumentFile documentFile = (DocumentFile) objArr[i];
                if (!documentFile.isFile()) {
                    tree = tree2;
                } else {
                    String type = documentFile.getType();
                    if (type != null) {
                        tree = tree2;
                        if (StringsKt.startsWith$default(type, "audio/", z, 2, obj)) {
                            String name = documentFile.getName();
                            if (name == null) {
                                name = "\u97f3\u9891";
                            }
                            String string = documentFile.getUri().toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            results.add(new SavedAudioItem(string, StringsKt.substringBeforeLast(name, '.', name)));
                        }
                    } else {
                        tree = tree2;
                    }
                }
                i++;
                z = false;
                obj = null;
                tree2 = tree;
            }
            return results;
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skipToNext() throws IllegalStateException {
        if (this.currentIsSavedAudio) {
            String str = this.currentContentUri;
            boolean z = false;
            if (str == null || StringsKt.isBlank(str)) {
                return;
            }
            if (this.savedAudioQueue.isEmpty()) {
                refreshSavedAudioQueue(this.currentContentUri);
            }
            int nextIndex = this.savedQueueIndex + 1;
            if (nextIndex >= 0 && nextIndex < this.savedAudioQueue.size()) {
                z = true;
            }
            if (z) {
                this.savedQueueIndex = nextIndex;
                SavedAudioItem item = this.savedAudioQueue.get(this.savedQueueIndex);
                this.currentContentUri = item.getContentUri();
                playSavedAudioUri(item.getContentUri(), item.getTitle());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void skipToPrevious() throws IllegalStateException {
        if (this.currentIsSavedAudio) {
            String str = this.currentContentUri;
            boolean z = false;
            if (str == null || StringsKt.isBlank(str)) {
                return;
            }
            if (this.savedAudioQueue.isEmpty()) {
                refreshSavedAudioQueue(this.currentContentUri);
            }
            int prevIndex = this.savedQueueIndex - 1;
            if (prevIndex >= 0 && prevIndex < this.savedAudioQueue.size()) {
                z = true;
            }
            if (z) {
                this.savedQueueIndex = prevIndex;
                SavedAudioItem item = this.savedAudioQueue.get(this.savedQueueIndex);
                this.currentContentUri = item.getContentUri();
                playSavedAudioUri(item.getContentUri(), item.getTitle());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playAudio(String audioUrl, String title) throws IllegalStateException {
        if (Intrinsics.areEqual(this.currentAudioUrl, audioUrl) && this.isPlaying) {
            stopAudio();
            return;
        }
        releaseMediaPlayer();
        stopProgressUpdates();
        this.currentAudioUrl = audioUrl;
        this.currentLocalPath = null;
        this.currentContentUri = null;
        this.currentTitle = title;
        this.currentDurationMs = 0L;
        requestAudioFocus();
        startForeground(1001, createNotification(title, "\u6b63\u5728\u4e0b\u8f7d..."));
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, null, null, new C31181(audioUrl, title, null), 3, null);
    }

    /* compiled from: AudioPlayerService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.service.AudioPlayerService$playAudio$1", m185f = "AudioPlayerService.kt", m186i = {1}, m187l = {443, 445}, m188m = "invokeSuspend", m189n = {"audioFile"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.service.AudioPlayerService$playAudio$1 */
    static final class C31181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $audioUrl;
        final /* synthetic */ String $title;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31181(String str, String str2, Continuation<? super C31181> continuation) {
            super(2, continuation);
            this.$audioUrl = str;
            this.$title = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AudioPlayerService.this.new C31181(this.$audioUrl, this.$title, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0015, B:8:0x0019, B:16:0x0037, B:18:0x003b, B:23:0x0054, B:13:0x0024), top: B:28:0x0006 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[Catch: Exception -> 0x001e, TRY_LEAVE, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0015, B:8:0x0019, B:16:0x0037, B:18:0x003b, B:23:0x0054, B:13:0x0024), top: B:28:0x0006 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.label
                switch(r1) {
                    case 0: goto L20;
                    case 1: goto L19;
                    case 2: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L11:
                java.lang.Object r0 = r6.L$0
                java.io.File r0 = (java.io.File) r0
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L1e
                goto L53
            L19:
                kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Exception -> L1e
                r1 = r7
                goto L37
            L1e:
                r0 = move-exception
                goto L63
            L20:
                kotlin.ResultKt.throwOnFailure(r7)
                com.yhchat.canarys.service.AudioPlayerService r1 = com.yhchat.canarys.service.AudioPlayerService.this     // Catch: java.lang.Exception -> L1e
                java.lang.String r2 = r6.$audioUrl     // Catch: java.lang.Exception -> L1e
                java.lang.String r3 = r6.$title     // Catch: java.lang.Exception -> L1e
                r4 = r6
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Exception -> L1e
                r5 = 1
                r6.label = r5     // Catch: java.lang.Exception -> L1e
                java.lang.Object r1 = com.yhchat.canarys.service.AudioPlayerService.access$getOrDownloadAudio(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L1e
                if (r1 != r0) goto L37
                return r0
            L37:
                java.io.File r1 = (java.io.File) r1     // Catch: java.lang.Exception -> L1e
                if (r1 == 0) goto L54
                com.yhchat.canarys.service.AudioPlayerService r2 = com.yhchat.canarys.service.AudioPlayerService.this     // Catch: java.lang.Exception -> L1e
                java.lang.String r3 = r6.$title     // Catch: java.lang.Exception -> L1e
                r4 = r6
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Exception -> L1e
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)     // Catch: java.lang.Exception -> L1e
                r6.L$0 = r5     // Catch: java.lang.Exception -> L1e
                r5 = 2
                r6.label = r5     // Catch: java.lang.Exception -> L1e
                java.lang.Object r2 = com.yhchat.canarys.service.AudioPlayerService.access$playAudioFile(r2, r1, r3, r4)     // Catch: java.lang.Exception -> L1e
                if (r2 != r0) goto L52
                return r0
            L52:
                r0 = r1
            L53:
                goto L7b
            L54:
                com.yhchat.canarys.service.AudioPlayerService r0 = com.yhchat.canarys.service.AudioPlayerService.this     // Catch: java.lang.Exception -> L1e
                java.lang.String r2 = r6.$title     // Catch: java.lang.Exception -> L1e
                java.lang.String r3 = "\u83b7\u53d6\u97f3\u9891\u5931\u8d25"
                com.yhchat.canarys.service.AudioPlayerService.access$updateNotification(r0, r2, r3)     // Catch: java.lang.Exception -> L1e
                com.yhchat.canarys.service.AudioPlayerService r0 = com.yhchat.canarys.service.AudioPlayerService.this     // Catch: java.lang.Exception -> L1e
                r0.stopSelf()     // Catch: java.lang.Exception -> L1e
                goto L7b
            L63:
                java.lang.String r1 = "\u64ad\u653e\u97f3\u9891\u5931\u8d25"
                r2 = r0
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                java.lang.String r3 = "AudioPlayerService"
                android.util.Log.e(r3, r1, r2)
                com.yhchat.canarys.service.AudioPlayerService r1 = com.yhchat.canarys.service.AudioPlayerService.this
                java.lang.String r2 = r6.$title
                java.lang.String r3 = "\u64ad\u653e\u5931\u8d25"
                com.yhchat.canarys.service.AudioPlayerService.access$updateNotification(r1, r2, r3)
                com.yhchat.canarys.service.AudioPlayerService r1 = com.yhchat.canarys.service.AudioPlayerService.this
                r1.stopSelf()
            L7b:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.service.AudioPlayerService.C31181.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: AudioPlayerService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.service.AudioPlayerService$getOrDownloadAudio$2", m185f = "AudioPlayerService.kt", m186i = {0, 0, 2, 2, 2, 3, 3}, m187l = {462, 470, 477, 486}, m188m = "invokeSuspend", m189n = {"cachedFile\\1", "$i$a$-let-AudioPlayerService$getOrDownloadAudio$2$1\\1\\460\\0", "audioData", "duplicateFile\\2", "$i$a$-let-AudioPlayerService$getOrDownloadAudio$2$2\\2\\476\\0", "audioData", "cached"}, m191s = {"L$0", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.service.AudioPlayerService$getOrDownloadAudio$2 */
    static final class C31172 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super File>, Object> {
        final /* synthetic */ String $audioUrl;
        final /* synthetic */ String $title;
        int I$0;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31172(String str, String str2, Continuation<? super C31172> continuation) {
            super(2, continuation);
            this.$audioUrl = str;
            this.$title = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AudioPlayerService.this.new C31172(this.$audioUrl, this.$title, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super File> continuation) {
            return ((C31172) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [byte[], int] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws NoSuchAlgorithmException {
            Object objDownloadAudioData;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ?? r1 = this.label;
            try {
                switch (r1) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        AudioCacheManager audioCacheManager = AudioPlayerService.this.audioCacheManager;
                        if (audioCacheManager == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("audioCacheManager");
                            audioCacheManager = null;
                        }
                        File cachedAudioFile = audioCacheManager.getCachedAudioFile(this.$audioUrl);
                        if (cachedAudioFile != null) {
                            AudioPlayerService audioPlayerService = AudioPlayerService.this;
                            String str = this.$audioUrl;
                            String str2 = this.$title;
                            AudioCacheManager audioCacheManager2 = audioPlayerService.audioCacheManager;
                            if (audioCacheManager2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("audioCacheManager");
                                audioCacheManager2 = null;
                            }
                            if (audioCacheManager2.verifyCachedFile(str)) {
                                MainCoroutineDispatcher main = Dispatchers.getMain();
                                AudioPlayerService$getOrDownloadAudio$2$1$1 audioPlayerService$getOrDownloadAudio$2$1$1 = new AudioPlayerService$getOrDownloadAudio$2$1$1(audioPlayerService, str2, null);
                                this.L$0 = cachedAudioFile;
                                this.I$0 = 0;
                                this.label = 1;
                                return BuildersKt.withContext(main, audioPlayerService$getOrDownloadAudio$2$1$1, this) == coroutine_suspended ? coroutine_suspended : cachedAudioFile;
                            }
                        }
                        this.label = 2;
                        objDownloadAudioData = AudioPlayerService.this.downloadAudioData(this.$audioUrl, this);
                        if (objDownloadAudioData == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        int i = this.I$0;
                        File file = (File) this.L$0;
                        ResultKt.throwOnFailure($result);
                        return file;
                    case 2:
                        ResultKt.throwOnFailure($result);
                        objDownloadAudioData = $result;
                        break;
                    case 3:
                        int i2 = this.I$0;
                        File file2 = (File) this.L$1;
                        ResultKt.throwOnFailure($result);
                        return file2;
                    case 4:
                        File file3 = (File) this.L$1;
                        ResultKt.throwOnFailure($result);
                        return file3;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                byte[] audioData = (byte[]) objDownloadAudioData;
                if (audioData == null) {
                    return null;
                }
                AudioCacheManager audioCacheManager3 = AudioPlayerService.this.audioCacheManager;
                if (audioCacheManager3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("audioCacheManager");
                    audioCacheManager3 = null;
                }
                File fileFindDuplicateAudioFile = audioCacheManager3.findDuplicateAudioFile(audioData);
                if (fileFindDuplicateAudioFile != null) {
                    AudioPlayerService audioPlayerService2 = AudioPlayerService.this;
                    String str3 = this.$title;
                    MainCoroutineDispatcher main2 = Dispatchers.getMain();
                    AudioPlayerService$getOrDownloadAudio$2$2$1 audioPlayerService$getOrDownloadAudio$2$2$1 = new AudioPlayerService$getOrDownloadAudio$2$2$1(audioPlayerService2, str3, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(audioData);
                    this.L$1 = fileFindDuplicateAudioFile;
                    this.I$0 = 0;
                    this.label = 3;
                    return BuildersKt.withContext(main2, audioPlayerService$getOrDownloadAudio$2$2$1, this) == coroutine_suspended ? coroutine_suspended : fileFindDuplicateAudioFile;
                }
                AudioCacheManager audioCacheManager4 = AudioPlayerService.this.audioCacheManager;
                if (audioCacheManager4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("audioCacheManager");
                    audioCacheManager4 = null;
                }
                File cached = audioCacheManager4.cacheAudioFile(this.$audioUrl, audioData);
                this.L$0 = audioData;
                this.L$1 = cached;
                this.label = 4;
                return BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass3(AudioPlayerService.this, this.$title, null), this) == coroutine_suspended ? coroutine_suspended : cached;
            } catch (Exception e) {
                Log.e(AudioPlayerService.TAG, "\u7f13\u5b58\u97f3\u9891\u5931\u8d25\uff0c\u4f7f\u7528\u4e34\u65f6\u6587\u4ef6", e);
                return AudioPlayerService.this.createTempAudioFile(r1);
            }
        }

        /* compiled from: AudioPlayerService.kt */
        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        @DebugMetadata(m184c = "com.yhchat.canarys.service.AudioPlayerService$getOrDownloadAudio$2$3", m185f = "AudioPlayerService.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
        /* renamed from: com.yhchat.canarys.service.AudioPlayerService$getOrDownloadAudio$2$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $title;
            int label;
            final /* synthetic */ AudioPlayerService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AudioPlayerService audioPlayerService, String str, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = audioPlayerService;
                this.$title = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$title, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.this$0.updateNotification(this.$title, "\u7f13\u5b58\u5b8c\u6210");
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object getOrDownloadAudio(String audioUrl, String title, Continuation<? super File> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C31172(audioUrl, title, null), continuation);
    }

    /* compiled from: AudioPlayerService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.service.AudioPlayerService$downloadAudioData$2", m185f = "AudioPlayerService.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.service.AudioPlayerService$downloadAudioData$2 */
    static final class C31162 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        final /* synthetic */ String $audioUrl;
        int label;
        final /* synthetic */ AudioPlayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31162(String str, AudioPlayerService audioPlayerService, Continuation<? super C31162> continuation) {
            super(2, continuation);
            this.$audioUrl = str;
            this.this$0 = audioPlayerService;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31162(this.$audioUrl, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super byte[]> continuation) {
            return ((C31162) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        Request request = new Request.Builder().url(this.$audioUrl).build();
                        Response responseExecute = this.this$0.okHttpClient.newCall(request).execute();
                        try {
                            Response response = responseExecute;
                            if (!response.isSuccessful()) {
                                CloseableKt.closeFinally(responseExecute, null);
                                return null;
                            }
                            ResponseBody responseBodyBody = response.body();
                            byte[] bArrBytes = responseBodyBody != null ? responseBodyBody.bytes() : null;
                            CloseableKt.closeFinally(responseExecute, null);
                            return bArrBytes;
                        } finally {
                        }
                    } catch (Exception e) {
                        Log.e(AudioPlayerService.TAG, "\u4e0b\u8f7d\u97f3\u9891\u5931\u8d25", e);
                        return null;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object downloadAudioData(String audioUrl, Continuation<? super byte[]> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new C31162(audioUrl, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File createTempAudioFile(byte[] audioData) {
        try {
            String fileName = "temp_audio_" + System.currentTimeMillis() + ".m4a";
            File tempFile = new File(getCacheDir(), fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            try {
                fileOutputStream.write(audioData);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                return tempFile;
            } finally {
            }
        } catch (Exception e) {
            Log.e(TAG, "\u521b\u5efa\u4e34\u65f6\u97f3\u9891\u6587\u4ef6\u5931\u8d25", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void playLocalAudio(String localPath, String title) throws IllegalStateException {
        releaseMediaPlayer();
        stopProgressUpdates();
        this.currentAudioUrl = null;
        this.currentLocalPath = localPath;
        this.currentContentUri = null;
        this.currentTitle = title;
        this.currentDurationMs = 0L;
        this.currentIsSavedAudio = false;
        this.savedAudioQueue.clear();
        this.savedQueueIndex = -1;
        requestAudioFocus();
        startForeground(1001, createNotification(title, "\u6b63\u5728\u4e0b\u8f7d..."));
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, null, null, new C31201(localPath, this, title, null), 3, null);
    }

    /* compiled from: AudioPlayerService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.service.AudioPlayerService$playLocalAudio$1", m185f = "AudioPlayerService.kt", m186i = {0}, m187l = {547}, m188m = "invokeSuspend", m189n = {"audioFile"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.service.AudioPlayerService$playLocalAudio$1 */
    static final class C31201 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $localPath;
        final /* synthetic */ String $title;
        Object L$0;
        int label;
        final /* synthetic */ AudioPlayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31201(String str, AudioPlayerService audioPlayerService, String str2, Continuation<? super C31201> continuation) {
            super(2, continuation);
            this.$localPath = str;
            this.this$0 = audioPlayerService;
            this.$title = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31201(this.$localPath, this.this$0, this.$title, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
            } catch (Exception e) {
                Log.e(AudioPlayerService.TAG, "\u64ad\u653e\u97f3\u9891\u5931\u8d25", e);
                this.this$0.updateNotification(this.$title, "\u64ad\u653e\u5931\u8d25");
                this.this$0.stopSelf();
            }
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    File audioFile = new File(this.$localPath);
                    if (audioFile.exists()) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(audioFile);
                        this.label = 1;
                        if (this.this$0.playAudioFile(audioFile, this.$title, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    this.this$0.updateNotification(this.$title, "\u83b7\u53d6\u97f3\u9891\u5931\u8d25");
                    this.this$0.stopSelf();
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void playSavedAudioUri(java.lang.String r10, java.lang.String r11) throws java.lang.IllegalStateException {
        /*
            r9 = this;
            r9.releaseMediaPlayer()
            r9.stopProgressUpdates()
            r0 = 0
            r9.currentAudioUrl = r0
            r9.currentLocalPath = r0
            r9.currentContentUri = r10
            r9.currentTitle = r11
            r1 = 0
            r9.currentDurationMs = r1
            r1 = 1
            r9.currentIsSavedAudio = r1
            java.util.List<com.yhchat.canarys.service.AudioPlayerService$SavedAudioItem> r2 = r9.savedAudioQueue
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L31
            java.util.List<com.yhchat.canarys.service.AudioPlayerService$SavedAudioItem> r2 = r9.savedAudioQueue
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            int r3 = r9.savedQueueIndex
            r4 = 0
            if (r3 < 0) goto L2e
            if (r3 >= r2) goto L2e
            goto L2f
        L2e:
            r1 = r4
        L2f:
            if (r1 != 0) goto L34
        L31:
            r9.refreshSavedAudioQueue(r10)
        L34:
            r9.requestAudioFocus()
            java.lang.String r1 = "\u6b63\u5728\u64ad\u653e..."
            android.app.Notification r1 = r9.createNotification(r11, r1)
            r2 = 1001(0x3e9, float:1.403E-42)
            r9.startForeground(r2, r1)
            kotlinx.coroutines.CoroutineScope r3 = r9.serviceScope
            kotlinx.coroutines.MainCoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getMain()
            r4 = r1
            kotlin.coroutines.CoroutineContext r4 = (kotlin.coroutines.CoroutineContext) r4
            com.yhchat.canarys.service.AudioPlayerService$playSavedAudioUri$1 r1 = new com.yhchat.canarys.service.AudioPlayerService$playSavedAudioUri$1
            r1.<init>(r10, r9, r11, r0)
            r6 = r1
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            r7 = 2
            r8 = 0
            r5 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.service.AudioPlayerService.playSavedAudioUri(java.lang.String, java.lang.String):void");
    }

    /* compiled from: AudioPlayerService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.service.AudioPlayerService$playSavedAudioUri$1", m185f = "AudioPlayerService.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.service.AudioPlayerService$playSavedAudioUri$1 */
    static final class C31211 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $contentUri;
        final /* synthetic */ String $title;
        int label;
        final /* synthetic */ AudioPlayerService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31211(String str, AudioPlayerService audioPlayerService, String str2, Continuation<? super C31211> continuation) {
            super(2, continuation);
            this.$contentUri = str;
            this.this$0 = audioPlayerService;
            this.$title = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31211(this.$contentUri, this.this$0, this.$title, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        Uri uri = Uri.parse(this.$contentUri);
                        AudioPlayerService audioPlayerService = this.this$0;
                        final MediaPlayer mediaPlayer = new MediaPlayer();
                        final AudioPlayerService audioPlayerService2 = this.this$0;
                        final String str = this.$title;
                        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
                        mediaPlayer.setDataSource(audioPlayerService2, uri);
                        mediaPlayer.prepareAsync();
                        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.yhchat.canarys.service.AudioPlayerService$playSavedAudioUri$1$$ExternalSyntheticLambda0
                            @Override // android.media.MediaPlayer.OnPreparedListener
                            public final void onPrepared(MediaPlayer mediaPlayer2) throws IllegalStateException {
                                AudioPlayerService.C31211.invokeSuspend$lambda$0$0(mediaPlayer, audioPlayerService2, str, mediaPlayer2);
                            }
                        });
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.yhchat.canarys.service.AudioPlayerService$playSavedAudioUri$1$$ExternalSyntheticLambda1
                            @Override // android.media.MediaPlayer.OnCompletionListener
                            public final void onCompletion(MediaPlayer mediaPlayer2) {
                                AudioPlayerService.C31211.invokeSuspend$lambda$0$1(audioPlayerService2, mediaPlayer2);
                            }
                        });
                        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.yhchat.canarys.service.AudioPlayerService$playSavedAudioUri$1$$ExternalSyntheticLambda2
                            @Override // android.media.MediaPlayer.OnErrorListener
                            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                                return AudioPlayerService.C31211.invokeSuspend$lambda$0$2(audioPlayerService2, str, mediaPlayer2, i, i2);
                            }
                        });
                        audioPlayerService.mediaPlayer = mediaPlayer;
                    } catch (Exception e) {
                        Log.e(AudioPlayerService.TAG, "\u64ad\u653e\u5df2\u4fdd\u5b58\u8bed\u97f3\u5931\u8d25", e);
                        this.this$0.updateNotification(this.$title, "\u64ad\u653e\u5931\u8d25");
                        this.this$0.stopSelf();
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0$0(MediaPlayer $this_apply, AudioPlayerService this$0, String $title, MediaPlayer it) throws IllegalStateException {
            $this_apply.start();
            this$0.isPlaying = true;
            this$0.currentDurationMs = RangesKt.coerceAtLeast($this_apply.getDuration(), 0L);
            this$0.updateMetadata($title, this$0.currentDurationMs);
            long restored = this$0.restoreProgressForCurrentAudio();
            if (restored > 0 && restored < this$0.currentDurationMs) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    this$0.seekTo(restored);
                    Result.m11919constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m11919constructorimpl(ResultKt.createFailure(th));
                }
            }
            this$0.updatePlaybackState(true);
            this$0.updateNotification($title, "\u6b63\u5728\u64ad\u653e");
            this$0.startProgressUpdates();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0$1(AudioPlayerService this$0, MediaPlayer it) {
            this$0.isPlaying = false;
            this$0.saveProgressForCurrentAudio(0L);
            this$0.stopProgressUpdates();
            this$0.updatePlaybackState(false);
            this$0.stopSelf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0$2(AudioPlayerService this$0, String $title, MediaPlayer mediaPlayer, int i, int i2) {
            this$0.isPlaying = false;
            this$0.saveProgressForCurrentAudio(this$0.getCurrentPositionMs());
            this$0.stopProgressUpdates();
            this$0.updatePlaybackState(false);
            this$0.updateNotification($title, "\u64ad\u653e\u51fa\u9519");
            this$0.stopSelf();
            return true;
        }
    }

    /* compiled from: AudioPlayerService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.service.AudioPlayerService$playAudioFile$2", m185f = "AudioPlayerService.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.service.AudioPlayerService$playAudioFile$2 */
    static final class C31192 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ File $audioFile;
        final /* synthetic */ String $title;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31192(File file, String str, Continuation<? super C31192> continuation) {
            super(2, continuation);
            this.$audioFile = file;
            this.$title = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AudioPlayerService.this.new C31192(this.$audioFile, this.$title, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31192) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        AudioPlayerService audioPlayerService = AudioPlayerService.this;
                        final MediaPlayer mediaPlayer = new MediaPlayer();
                        final File file = this.$audioFile;
                        final AudioPlayerService audioPlayerService2 = AudioPlayerService.this;
                        final String str = this.$title;
                        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build());
                        mediaPlayer.setDataSource(file.getAbsolutePath());
                        mediaPlayer.prepareAsync();
                        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.yhchat.canarys.service.AudioPlayerService$playAudioFile$2$$ExternalSyntheticLambda0
                            @Override // android.media.MediaPlayer.OnPreparedListener
                            public final void onPrepared(MediaPlayer mediaPlayer2) throws IllegalStateException {
                                AudioPlayerService.C31192.invokeSuspend$lambda$0$0(mediaPlayer, audioPlayerService2, str, mediaPlayer2);
                            }
                        });
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.yhchat.canarys.service.AudioPlayerService$playAudioFile$2$$ExternalSyntheticLambda1
                            @Override // android.media.MediaPlayer.OnCompletionListener
                            public final void onCompletion(MediaPlayer mediaPlayer2) {
                                AudioPlayerService.C31192.invokeSuspend$lambda$0$1(audioPlayerService2, file, mediaPlayer2);
                            }
                        });
                        mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.yhchat.canarys.service.AudioPlayerService$playAudioFile$2$$ExternalSyntheticLambda2
                            @Override // android.media.MediaPlayer.OnErrorListener
                            public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                                return AudioPlayerService.C31192.invokeSuspend$lambda$0$2(audioPlayerService2, file, str, mediaPlayer2, i, i2);
                            }
                        });
                        audioPlayerService.mediaPlayer = mediaPlayer;
                    } catch (Exception e) {
                        Log.e(AudioPlayerService.TAG, "\u64ad\u653e\u97f3\u9891\u6587\u4ef6\u5931\u8d25", e);
                        AudioPlayerService.this.saveProgressForCurrentAudio(AudioPlayerService.this.getCurrentPositionMs());
                        AudioPlayerService.this.stopProgressUpdates();
                        String name = this.$audioFile.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                        if (StringsKt.startsWith$default(name, "temp_audio_", false, 2, (Object) null)) {
                            this.$audioFile.delete();
                            Log.d(AudioPlayerService.TAG, "\u6e05\u7406\u4e34\u65f6\u97f3\u9891\u6587\u4ef6");
                        }
                        AudioPlayerService.this.updateNotification(this.$title, "\u64ad\u653e\u5931\u8d25");
                        AudioPlayerService.this.stopSelf();
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0$0(MediaPlayer $this_apply, AudioPlayerService this$0, String $title, MediaPlayer it) throws IllegalStateException {
            $this_apply.start();
            this$0.isPlaying = true;
            this$0.currentDurationMs = RangesKt.coerceAtLeast($this_apply.getDuration(), 0L);
            this$0.updateMetadata($title, this$0.currentDurationMs);
            long restored = this$0.restoreProgressForCurrentAudio();
            if (restored > 0 && restored < this$0.currentDurationMs) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    this$0.seekTo(restored);
                    Result.m11919constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m11919constructorimpl(ResultKt.createFailure(th));
                }
            }
            this$0.updatePlaybackState(true);
            this$0.updateNotification($title, "\u6b63\u5728\u64ad\u653e");
            this$0.startProgressUpdates();
            Log.d(AudioPlayerService.TAG, "\u5f00\u59cb\u64ad\u653e\u97f3\u9891");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0$1(AudioPlayerService this$0, File $audioFile, MediaPlayer it) {
            Log.d(AudioPlayerService.TAG, "\u97f3\u9891\u64ad\u653e\u5b8c\u6210");
            this$0.isPlaying = false;
            this$0.saveProgressForCurrentAudio(0L);
            this$0.stopProgressUpdates();
            this$0.updatePlaybackState(false);
            String name = $audioFile.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.startsWith$default(name, "temp_audio_", false, 2, (Object) null)) {
                $audioFile.delete();
                Log.d(AudioPlayerService.TAG, "\u6e05\u7406\u4e34\u65f6\u97f3\u9891\u6587\u4ef6");
            }
            this$0.stopSelf();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invokeSuspend$lambda$0$2(AudioPlayerService this$0, File $audioFile, String $title, MediaPlayer mediaPlayer, int what, int extra) {
            Log.e(AudioPlayerService.TAG, "MediaPlayer\u9519\u8bef: what=" + what + ", extra=" + extra);
            this$0.isPlaying = false;
            this$0.saveProgressForCurrentAudio(this$0.getCurrentPositionMs());
            this$0.stopProgressUpdates();
            this$0.updatePlaybackState(false);
            String name = $audioFile.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (StringsKt.startsWith$default(name, "temp_audio_", false, 2, (Object) null)) {
                $audioFile.delete();
                Log.d(AudioPlayerService.TAG, "\u6e05\u7406\u4e34\u65f6\u97f3\u9891\u6587\u4ef6");
            }
            this$0.updateNotification($title, "\u64ad\u653e\u51fa\u9519");
            this$0.stopSelf();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object playAudioFile(File audioFile, String title, Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C31192(audioFile, title, null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pauseAudio() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            this.isPlaying = false;
            saveProgressForCurrentAudio(getCurrentPositionMs());
            stopProgressUpdates();
            updatePlaybackState(false);
            updateNotification(this.currentTitle, "\u5df2\u6682\u505c");
        }
    }

    private final void resumeAudio() {
        MediaPlayer player = this.mediaPlayer;
        if (player == null || this.isPlaying) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            AudioPlayerService audioPlayerService = this;
            player.start();
            audioPlayerService.isPlaying = true;
            audioPlayerService.updatePlaybackState(true);
            audioPlayerService.updateNotification(audioPlayerService.currentTitle, "\u6b63\u5728\u64ad\u653e");
            audioPlayerService.startProgressUpdates();
            Result.m11919constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m11919constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopAudio() throws IllegalStateException {
        saveProgressForCurrentAudio(getCurrentPositionMs());
        stopProgressUpdates();
        releaseMediaPlayer();
        this.isPlaying = false;
        this.currentAudioUrl = null;
        this.currentLocalPath = null;
        this.currentContentUri = null;
        updatePlaybackState(false);
        stopForeground(true);
        stopSelf();
    }

    private final void releaseMediaPlayer() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            if (this.isPlaying) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
        }
        this.mediaPlayer = null;
    }

    private final void requestAudioFocus() {
        int result;
        if (this.audioFocusGranted) {
            return;
        }
        AudioManager audioManager = null;
        if (Build.VERSION.SDK_INT >= 26) {
            AudioFocusRequest focusRequest = new AudioFocusRequest.Builder(2).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(1).build()).setOnAudioFocusChangeListener(new AudioManager.OnAudioFocusChangeListener() { // from class: com.yhchat.canarys.service.AudioPlayerService$$ExternalSyntheticLambda0
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) throws IllegalStateException {
                    AudioPlayerService.requestAudioFocus$lambda$0(this.f$0, i);
                }
            }).build();
            AudioManager audioManager2 = this.audioManager;
            if (audioManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioManager");
            } else {
                audioManager = audioManager2;
            }
            result = audioManager.requestAudioFocus(focusRequest);
        } else {
            AudioManager audioManager3 = this.audioManager;
            if (audioManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audioManager");
            } else {
                audioManager = audioManager3;
            }
            result = audioManager.requestAudioFocus(new AudioManager.OnAudioFocusChangeListener() { // from class: com.yhchat.canarys.service.AudioPlayerService$$ExternalSyntheticLambda1
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i) throws IllegalStateException {
                    AudioPlayerService.requestAudioFocus$lambda$1(this.f$0, i);
                }
            }, 3, 2);
        }
        this.audioFocusGranted = result == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestAudioFocus$lambda$0(AudioPlayerService this$0, int focusChange) throws IllegalStateException {
        switch (focusChange) {
            case -2:
            case -1:
                this$0.pauseAudio();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requestAudioFocus$lambda$1(AudioPlayerService this$0, int focusChange) throws IllegalStateException {
        switch (focusChange) {
            case -2:
            case -1:
                this$0.pauseAudio();
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePlaybackState(boolean playing) {
        int state;
        if (playing) {
            state = 3;
        } else {
            state = 2;
        }
        long position = getCurrentPositionMs();
        float speed = playing ? 1.0f : 0.0f;
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaSession");
            mediaSessionCompat = null;
        }
        mediaSessionCompat.setPlaybackState(new PlaybackStateCompat.Builder().setState(state, position, speed).setActions(311L).build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMetadata(String title, long durationMs) {
        MediaMetadataCompat.Builder builder = new MediaMetadataCompat.Builder().putString(MediaMetadataCompat.METADATA_KEY_TITLE, title).putLong(MediaMetadataCompat.METADATA_KEY_DURATION, durationMs);
        String str = this.currentContentUri;
        if (str != null) {
            builder.putString(MediaMetadataCompat.METADATA_KEY_MEDIA_URI, str);
        }
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaSession");
            mediaSessionCompat = null;
        }
        mediaSessionCompat.setMetadata(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getCurrentPositionMs() {
        Object objM11919constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM11919constructorimpl = Result.m11919constructorimpl(Long.valueOf(this.mediaPlayer != null ? r4.getCurrentPosition() : 0L));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM11919constructorimpl = Result.m11919constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m11925isFailureimpl(objM11919constructorimpl)) {
            objM11919constructorimpl = 0L;
        }
        long pos = ((Number) objM11919constructorimpl).longValue();
        return RangesKt.coerceAtLeast(pos, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void seekTo(long positionMs) {
        MediaPlayer player = this.mediaPlayer;
        if (player == null) {
            return;
        }
        long jCoerceAtLeast = RangesKt.coerceAtLeast(positionMs, 0L);
        Long lValueOf = Long.valueOf(this.currentDurationMs);
        if (!(lValueOf.longValue() > 0)) {
            lValueOf = null;
        }
        long safePos = RangesKt.coerceAtMost(jCoerceAtLeast, lValueOf != null ? lValueOf.longValue() : Long.MAX_VALUE);
        try {
            Result.Companion companion = Result.INSTANCE;
            AudioPlayerService audioPlayerService = this;
            player.seekTo((int) safePos);
            Result.m11919constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m11919constructorimpl(ResultKt.createFailure(th));
        }
        saveProgressForCurrentAudio(safePos);
        updatePlaybackState(this.isPlaying);
        updateNotification(this.currentTitle, this.isPlaying ? "\u6b63\u5728\u64ad\u653e" : "\u5df2\u6682\u505c");
    }

    private final String progressKeyFor(String audioUrl) {
        return "progress_" + audioUrl;
    }

    private final String progressKeyForLocalPath(String localPath) {
        return "progress_local_" + localPath;
    }

    private final String progressKeyForContentUri(String contentUri) {
        return "progress_uri_" + contentUri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveProgressForCurrentAudio(long positionMs) {
        long safePos = RangesKt.coerceAtLeast(positionMs, 0L);
        String url = this.currentAudioUrl;
        String localPath = this.currentLocalPath;
        String uri = this.currentContentUri;
        String str = url;
        if (str == null || StringsKt.isBlank(str)) {
            String str2 = localPath;
            if (str2 == null || StringsKt.isBlank(str2)) {
                String str3 = uri;
                if (!(str3 == null || StringsKt.isBlank(str3))) {
                    getProgressPrefs().edit().putLong(progressKeyForContentUri(uri), safePos).apply();
                    return;
                }
                return;
            }
            getProgressPrefs().edit().putLong(progressKeyForLocalPath(localPath), safePos).apply();
            return;
        }
        getProgressPrefs().edit().putLong(progressKeyFor(url), safePos).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long restoreProgressForCurrentAudio() {
        long value;
        String url = this.currentAudioUrl;
        String localPath = this.currentLocalPath;
        String uri = this.currentContentUri;
        String str = url;
        if (str == null || StringsKt.isBlank(str)) {
            String str2 = localPath;
            if (str2 == null || StringsKt.isBlank(str2)) {
                String str3 = uri;
                value = !(str3 == null || StringsKt.isBlank(str3)) ? getProgressPrefs().getLong(progressKeyForContentUri(uri), 0L) : 0L;
            } else {
                value = getProgressPrefs().getLong(progressKeyForLocalPath(localPath), 0L);
            }
        } else {
            value = getProgressPrefs().getLong(progressKeyFor(url), 0L);
        }
        return RangesKt.coerceAtLeast(value, 0L);
    }

    /* compiled from: AudioPlayerService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.service.AudioPlayerService$startProgressUpdates$1", m185f = "AudioPlayerService.kt", m186i = {0, 0}, m187l = {874}, m188m = "invokeSuspend", m189n = {"$this$launch", "content"}, m191s = {"L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.service.AudioPlayerService$startProgressUpdates$1 */
    static final class C31221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C31221(Continuation<? super C31221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C31221 c31221 = AudioPlayerService.this.new C31221(continuation);
            c31221.L$0 = obj;
            return c31221;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:21:0x0078). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.L$0
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r8.label
                switch(r2) {
                    case 0: goto L1e;
                    case 1: goto L15;
                    default: goto Ld;
                }
            Ld:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L15:
                java.lang.Object r2 = r8.L$1
                java.lang.String r2 = (java.lang.String) r2
                kotlin.ResultKt.throwOnFailure(r9)
                r3 = r8
                goto L78
            L1e:
                kotlin.ResultKt.throwOnFailure(r9)
                r2 = r8
            L22:
                boolean r3 = kotlinx.coroutines.CoroutineScopeKt.isActive(r0)
                if (r3 == 0) goto L7a
                com.yhchat.canarys.service.AudioPlayerService r3 = com.yhchat.canarys.service.AudioPlayerService.this
                boolean r3 = com.yhchat.canarys.service.AudioPlayerService.access$isPlaying$p(r3)
                if (r3 == 0) goto L3b
                com.yhchat.canarys.service.AudioPlayerService r3 = com.yhchat.canarys.service.AudioPlayerService.this
                long r3 = com.yhchat.canarys.service.AudioPlayerService.access$getCurrentPositionMs(r3)
                com.yhchat.canarys.service.AudioPlayerService r5 = com.yhchat.canarys.service.AudioPlayerService.this
                com.yhchat.canarys.service.AudioPlayerService.access$saveProgressForCurrentAudio(r5, r3)
            L3b:
                com.yhchat.canarys.service.AudioPlayerService r3 = com.yhchat.canarys.service.AudioPlayerService.this
                com.yhchat.canarys.service.AudioPlayerService r4 = com.yhchat.canarys.service.AudioPlayerService.this
                boolean r4 = com.yhchat.canarys.service.AudioPlayerService.access$isPlaying$p(r4)
                com.yhchat.canarys.service.AudioPlayerService.access$updatePlaybackState(r3, r4)
                com.yhchat.canarys.service.AudioPlayerService r3 = com.yhchat.canarys.service.AudioPlayerService.this
                boolean r3 = com.yhchat.canarys.service.AudioPlayerService.access$isPlaying$p(r3)
                if (r3 == 0) goto L51
                java.lang.String r3 = "\u6b63\u5728\u64ad\u653e"
                goto L53
            L51:
                java.lang.String r3 = "\u5df2\u6682\u505c"
            L53:
                com.yhchat.canarys.service.AudioPlayerService r4 = com.yhchat.canarys.service.AudioPlayerService.this
                com.yhchat.canarys.service.AudioPlayerService r5 = com.yhchat.canarys.service.AudioPlayerService.this
                java.lang.String r5 = com.yhchat.canarys.service.AudioPlayerService.access$getCurrentTitle$p(r5)
                com.yhchat.canarys.service.AudioPlayerService.access$updateNotification(r4, r5, r3)
                r4 = r2
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r2.L$0 = r0
                java.lang.Object r5 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r3)
                r2.L$1 = r5
                r5 = 1
                r2.label = r5
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r4 = kotlinx.coroutines.DelayKt.delay(r5, r4)
                if (r4 != r1) goto L75
                return r1
            L75:
                r7 = r3
                r3 = r2
                r2 = r7
            L78:
                r2 = r3
                goto L22
            L7a:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.service.AudioPlayerService.C31221.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startProgressUpdates() {
        stopProgressUpdates();
        this.progressJob = BuildersKt__Builders_commonKt.launch$default(this.serviceScope, null, null, new C31221(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopProgressUpdates() {
        Job job = this.progressJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.progressJob = null;
    }

    private final Notification createNotification(String title, String content) {
        NotificationCompat.Action playPauseAction;
        if (isFlyme()) {
            return createFlymeLiveNotification(title, content);
        }
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 201326592);
        NotificationCompat.Action prevAction = new NotificationCompat.Action(R.drawable.ic_media_previous, "\u4e0a\u4e00\u6761", createNotification$servicePendingIntent(this, ACTION_PREV));
        if (this.isPlaying) {
            playPauseAction = new NotificationCompat.Action(R.drawable.ic_media_pause, "\u6682\u505c", createNotification$servicePendingIntent(this, ACTION_PAUSE));
        } else {
            playPauseAction = new NotificationCompat.Action(R.drawable.ic_media_play, "\u64ad\u653e", createNotification$servicePendingIntent(this, ACTION_PLAY));
        }
        NotificationCompat.Action stopAction = new NotificationCompat.Action(R.drawable.ic_menu_close_clear_cancel, "\u505c\u6b62", createNotification$servicePendingIntent(this, ACTION_STOP));
        NotificationCompat.Action nextAction = new NotificationCompat.Action(R.drawable.ic_media_next, "\u4e0b\u4e00\u6761", createNotification$servicePendingIntent(this, ACTION_NEXT));
        NotificationCompat.Builder builderAddAction = new NotificationCompat.Builder(this, CHANNEL_ID).setContentTitle(title).setContentText(content).setSmallIcon(R.drawable.ic_media_play).setContentIntent(pendingIntent).setOnlyAlertOnce(true).addAction(prevAction).addAction(playPauseAction).addAction(stopAction).addAction(nextAction);
        NotificationCompat.MediaStyle mediaStyle = new NotificationCompat.MediaStyle();
        MediaSessionCompat mediaSessionCompat = this.mediaSession;
        if (mediaSessionCompat == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaSession");
            mediaSessionCompat = null;
        }
        NotificationCompat.Builder builder = builderAddAction.setStyle(mediaStyle.setMediaSession(mediaSessionCompat.getSessionToken()).setShowActionsInCompactView(0, 1, 3)).setOngoing(true);
        Intrinsics.checkNotNullExpressionValue(builder, "setOngoing(...)");
        long duration = this.currentDurationMs;
        long position = getCurrentPositionMs();
        if (duration > 0) {
            builder.setProgress((int) duration, (int) RangesKt.coerceAtMost(position, duration), false);
        }
        Notification notificationBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        return notificationBuild;
    }

    private static final PendingIntent createNotification$servicePendingIntent(AudioPlayerService this$0, String action) {
        Intent i = new Intent(this$0, (Class<?>) AudioPlayerService.class);
        i.setAction(action);
        PendingIntent service = PendingIntent.getService(this$0, action.hashCode(), i, 201326592);
        Intrinsics.checkNotNullExpressionValue(service, "getService(...)");
        return service;
    }

    private final boolean isFlyme() {
        String manufacturer = Build.MANUFACTURER;
        if (manufacturer == null) {
            manufacturer = "";
        }
        String str = Build.DISPLAY;
        String display = str != null ? str : "";
        return StringsKt.contains((CharSequence) manufacturer, (CharSequence) "meizu", true) || StringsKt.contains((CharSequence) display, (CharSequence) "flyme", true);
    }

    private final Notification createFlymeLiveNotification(String title, String content) {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(268468224);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent, 201326592);
        RemoteViews remoteViews = new RemoteViews(getPackageName(), C3011R.layout.layout_live_audio_capsule);
        remoteViews.setTextViewText(C3011R.id.tv_capsule_title, title + " - " + content);
        int i = C3011R.id.iv_capsule_icon;
        boolean z = this.isPlaying;
        int i2 = R.drawable.ic_media_pause;
        remoteViews.setImageViewResource(i, z ? 17301540 : 17301539);
        RemoteViews expandedView = new RemoteViews(getPackageName(), C3011R.layout.layout_live_audio_expanded);
        expandedView.setTextViewText(C3011R.id.tv_title, title);
        expandedView.setTextViewText(C3011R.id.tv_artist, content);
        expandedView.setOnClickPendingIntent(C3011R.id.btn_prev, createFlymeLiveNotification$servicePendingIntent(this, ACTION_PREV));
        expandedView.setOnClickPendingIntent(C3011R.id.btn_next, createFlymeLiveNotification$servicePendingIntent(this, ACTION_NEXT));
        expandedView.setOnClickPendingIntent(C3011R.id.btn_play_pause, createFlymeLiveNotification$servicePendingIntent(this, this.isPlaying ? ACTION_PAUSE : ACTION_PLAY));
        int i3 = C3011R.id.btn_play_pause;
        if (!this.isPlaying) {
            i2 = 17301540;
        }
        expandedView.setImageViewResource(i3, i2);
        Bundle capsuleBundle = new Bundle();
        capsuleBundle.putInt("notification.live.capsuleStatus", 1);
        capsuleBundle.putInt("notification.live.capsuleType", 5);
        capsuleBundle.putString("notification.live.capsuleContent", content);
        capsuleBundle.putParcelable("notification.live.capsule.content.remote.view", remoteViews);
        Bundle liveBundle = new Bundle();
        liveBundle.putBoolean("is_live", true);
        liveBundle.putInt("notification.live.operation", 0);
        liveBundle.putInt("notification.live.type", 2);
        liveBundle.putBundle("notification.live.capsule", capsuleBundle);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, CHANNEL_ID).setSmallIcon(R.drawable.ic_media_play).setContentTitle(title).setContentText(content).setContentIntent(pendingIntent).setCustomContentView(expandedView).setCustomBigContentView(expandedView).setOnlyAlertOnce(true).setOngoing(true).addExtras(liveBundle).setVisibility(1);
        Intrinsics.checkNotNullExpressionValue(builder, "setVisibility(...)");
        Notification notificationBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        return notificationBuild;
    }

    private static final PendingIntent createFlymeLiveNotification$servicePendingIntent(AudioPlayerService this$0, String action) {
        Intent i = new Intent(this$0, (Class<?>) AudioPlayerService.class);
        i.setAction(action);
        PendingIntent service = PendingIntent.getService(this$0, action.hashCode(), i, 201326592);
        Intrinsics.checkNotNullExpressionValue(service, "getService(...)");
        return service;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNotification(String title, String content) {
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationManager.notify(1001, createNotification(title, content));
    }

    /* renamed from: isPlaying, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    public final String getCurrentAudioUrl() {
        return this.currentAudioUrl;
    }
}
