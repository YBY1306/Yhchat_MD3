package com.yhchat.canarys.service;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.p008io.CloseableKt;
import kotlin.p008io.FilesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* compiled from: FileDownloadService.kt */
@Metadata(m168d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 52\u00020\u0001:\u000256B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\"\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0002J(\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J.\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u001cH\u0082@\u00a2\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020!H\u0002J\"\u0010&\u001a\u0004\u0018\u00010!2\u0006\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019H\u0002J\u0010\u0010*\u001a\u00020\u00112\u0006\u0010%\u001a\u00020!H\u0002J(\u0010+\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u0013H\u0002J2\u00100\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u00132\b\b\u0002\u00101\u001a\u00020\u001eH\u0002J\u0010\u00102\u001a\u00020\u00192\u0006\u00103\u001a\u00020\u001cH\u0002J\b\u00104\u001a\u00020\u0011H\u0016R\u0012\u0010\u0004\u001a\u00060\u0005R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00067"}, m169d2 = {"Lcom/yhchat/canarys/service/FileDownloadService;", "Landroid/app/Service;", "<init>", "()V", "binder", "Lcom/yhchat/canarys/service/FileDownloadService$FileDownloadBinder;", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "notificationManager", "Landroid/app/NotificationManager;", "okHttpClient", "Lokhttp3/OkHttpClient;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onStartCommand", "", "flags", "startId", "createNotificationChannel", "startDownloadFile", "fileUrl", "", "fileName", "fileSize", "", "autoOpen", "", "downloadFileWithProgress", "targetFile", "Ljava/io/File;", "expectedSize", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "calculateSHA256", "file", "findFileWithSameHash", "directory", "targetHash", "excludeFileName", "openFile", "createNotification", "Landroid/app/Notification;", "progressText", NotificationCompat.CATEGORY_PROGRESS, "maxProgress", "updateNotification", "isCompleted", "formatFileSize", "bytes", "onDestroy", "Companion", "FileDownloadBinder", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final class FileDownloadService extends Service {
    public static final String ACTION_DOWNLOAD = "action_download";
    public static final String EXTRA_AUTO_OPEN = "extra_auto_open";
    public static final String EXTRA_FILE_NAME = "extra_file_name";
    public static final String EXTRA_FILE_SIZE = "extra_file_size";
    public static final String EXTRA_FILE_URL = "extra_file_url";
    private static final String NOTIFICATION_CHANNEL_ID = "file_download_channel";
    private static final int NOTIFICATION_ID = 2001;
    private static final String TAG = "FileDownloadService";
    private NotificationManager notificationManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final FileDownloadBinder binder = new FileDownloadBinder();
    private final CoroutineScope serviceScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
    private final OkHttpClient okHttpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() { // from class: com.yhchat.canarys.service.FileDownloadService$special$$inlined$-addInterceptor$1
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            Intrinsics.checkNotNullParameter(chain, "chain");
            return chain.proceed(chain.request().newBuilder().addHeader("Referer", "https://myapp.jwznb.com").addHeader("User-Agent", "Mozilla/5.0 (Linux; Android 10; Mobile) AppleWebKit/537.36").build());
        }
    }).build();

    /* compiled from: FileDownloadService.kt */
    @Metadata(m168d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/service/FileDownloadService$Companion;", "", "<init>", "()V", "TAG", "", "NOTIFICATION_CHANNEL_ID", "NOTIFICATION_ID", "", "ACTION_DOWNLOAD", "EXTRA_FILE_URL", "EXTRA_FILE_NAME", "EXTRA_FILE_SIZE", "EXTRA_AUTO_OPEN", "startDownload", "", "context", "Landroid/content/Context;", "fileUrl", "fileName", "fileSize", "", "autoOpen", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void startDownload$default(Companion companion, Context context, String str, String str2, long j, boolean z, int i, Object obj) {
            boolean z2;
            if ((i & 16) == 0) {
                z2 = z;
            } else {
                z2 = false;
            }
            companion.startDownload(context, str, str2, j, z2);
        }

        public final void startDownload(Context context, String fileUrl, String fileName, long fileSize, boolean autoOpen) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intent intent = new Intent(context, (Class<?>) FileDownloadService.class);
            intent.setAction(FileDownloadService.ACTION_DOWNLOAD);
            intent.putExtra(FileDownloadService.EXTRA_FILE_URL, fileUrl);
            intent.putExtra(FileDownloadService.EXTRA_FILE_NAME, fileName);
            intent.putExtra(FileDownloadService.EXTRA_FILE_SIZE, fileSize);
            intent.putExtra(FileDownloadService.EXTRA_AUTO_OPEN, autoOpen);
            ContextCompat.startForegroundService(context, intent);
        }
    }

    /* compiled from: FileDownloadService.kt */
    @Metadata(m168d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005\u00a8\u0006\u0006"}, m169d2 = {"Lcom/yhchat/canarys/service/FileDownloadService$FileDownloadBinder;", "Landroid/os/Binder;", "<init>", "(Lcom/yhchat/canarys/service/FileDownloadService;)V", "getService", "Lcom/yhchat/canarys/service/FileDownloadService;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public final class FileDownloadBinder extends Binder {
        public FileDownloadBinder() {
        }

        /* renamed from: getService, reason: from getter */
        public final FileDownloadService getThis$0() {
            return FileDownloadService.this;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        this.notificationManager = (NotificationManager) systemService;
        createNotificationChannel();
        Log.d(TAG, "FileDownloadService created");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        String action = intent != null ? intent.getAction() : null;
        if (action != null) {
            switch (action.hashCode()) {
                case -2124670863:
                    if (action.equals(ACTION_DOWNLOAD)) {
                        String fileUrl = intent.getStringExtra(EXTRA_FILE_URL);
                        String fileName = intent.getStringExtra(EXTRA_FILE_NAME);
                        long fileSize = intent.getLongExtra(EXTRA_FILE_SIZE, 0L);
                        boolean autoOpen = intent.getBooleanExtra(EXTRA_AUTO_OPEN, false);
                        String str = fileUrl;
                        if (!(str == null || str.length() == 0)) {
                            String str2 = fileName;
                            if (!(str2 == null || str2.length() == 0)) {
                                startDownloadFile(fileUrl, fileName, fileSize, autoOpen);
                                break;
                            }
                        }
                        Log.e(TAG, "Invalid download parameters");
                        stopSelf();
                        break;
                    }
                    break;
            }
            return 2;
        }
        return 2;
    }

    private final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel channel = new NotificationChannel(NOTIFICATION_CHANNEL_ID, "\u6587\u4ef6\u4e0b\u8f7d", 2);
            channel.setDescription("\u663e\u793a\u6587\u4ef6\u4e0b\u8f7d\u8fdb\u5ea6");
            channel.setSound(null, null);
            NotificationManager notificationManager = this.notificationManager;
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(channel);
            }
        }
    }

    private final void startDownloadFile(String fileUrl, String fileName, long fileSize, boolean autoOpen) {
        File downloadDir;
        Log.d(TAG, "Starting download: " + fileName + " from " + fileUrl + " (autoOpen=" + autoOpen + ")");
        if (Build.VERSION.SDK_INT >= 29) {
            downloadDir = new File(getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS), "yhchat");
        } else {
            downloadDir = new File("/storage/emulated/0/Download/yhchat/");
        }
        if (!downloadDir.exists()) {
            downloadDir.mkdirs();
        }
        if (!downloadDir.exists() || !downloadDir.isDirectory()) {
            Log.e(TAG, "\u274c Failed to create download directory: " + downloadDir.getAbsolutePath());
            updateNotification(fileName, "\u4e0b\u8f7d\u5931\u8d25: \u65e0\u6cd5\u521b\u5efa\u4e0b\u8f7d\u76ee\u5f55", 0, 0, true);
            stopSelf();
            return;
        }
        startForeground(NOTIFICATION_ID, createNotification(fileName, "\u51c6\u5907\u4e0b\u8f7d...", 0, 0));
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getIO(), null, new C31241(downloadDir, fileName, this, fileUrl, fileSize, autoOpen, null), 2, null);
    }

    /* compiled from: FileDownloadService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.service.FileDownloadService$startDownloadFile$1", m185f = "FileDownloadService.kt", m186i = {0, 0}, m187l = {159}, m188m = "invokeSuspend", m189n = {"$this$launch", "tempFile"}, m191s = {"L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.service.FileDownloadService$startDownloadFile$1 */
    static final class C31241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $autoOpen;
        final /* synthetic */ File $downloadDir;
        final /* synthetic */ String $fileName;
        final /* synthetic */ long $fileSize;
        final /* synthetic */ String $fileUrl;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ FileDownloadService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31241(File file, String str, FileDownloadService fileDownloadService, String str2, long j, boolean z, Continuation<? super C31241> continuation) {
            super(2, continuation);
            this.$downloadDir = file;
            this.$fileName = str;
            this.this$0 = fileDownloadService;
            this.$fileUrl = str2;
            this.$fileSize = j;
            this.$autoOpen = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C31241 c31241 = new C31241(this.$downloadDir, this.$fileName, this.this$0, this.$fileUrl, this.$fileSize, this.$autoOpen, continuation);
            c31241.L$0 = obj;
            return c31241;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            File tempFile;
            File targetFile;
            String newFileName;
            CoroutineScope $this$launch = (CoroutineScope) this.L$0;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        File tempFile2 = new File(this.$downloadDir, String.valueOf(this.$fileName));
                        this.L$0 = $this$launch;
                        this.L$1 = tempFile2;
                        this.label = 1;
                        if (this.this$0.downloadFileWithProgress(this.$fileUrl, tempFile2, this.$fileName, this.$fileSize, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        tempFile = tempFile2;
                        break;
                    case 1:
                        tempFile = (File) this.L$1;
                        ResultKt.throwOnFailure($result);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String downloadedHash = this.this$0.calculateSHA256(tempFile);
                Log.d(FileDownloadService.TAG, "Downloaded file SHA256: " + downloadedHash);
                File existingFile = this.this$0.findFileWithSameHash(this.$downloadDir, downloadedHash, this.$fileName);
                if (existingFile != null) {
                    tempFile.delete();
                    Log.d(FileDownloadService.TAG, "Found existing file with same content: " + existingFile.getName());
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.serviceScope, Dispatchers.getMain(), null, new FileDownloadService$startDownloadFile$1$finalFile$1(this.this$0, this.$fileName, existingFile, null), 2, null);
                    targetFile = existingFile;
                } else {
                    File originalFile = new File(this.$downloadDir, this.$fileName);
                    if (originalFile.exists()) {
                        String nameWithoutExt = StringsKt.substringBeforeLast$default(this.$fileName, ".", (String) null, 2, (Object) null);
                        String extension = StringsKt.substringAfterLast(this.$fileName, ".", "");
                        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
                        if (extension.length() > 0) {
                            newFileName = nameWithoutExt + "_" + timestamp + "." + extension;
                        } else {
                            newFileName = nameWithoutExt + "_" + timestamp;
                        }
                        targetFile = new File(this.$downloadDir, newFileName);
                    } else {
                        targetFile = originalFile;
                    }
                    tempFile.renameTo(targetFile);
                    Log.d(FileDownloadService.TAG, "Download completed: " + targetFile.getAbsolutePath());
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.serviceScope, Dispatchers.getMain(), null, new FileDownloadService$startDownloadFile$1$finalFile$2(this.this$0, this.$fileName, targetFile, null), 2, null);
                }
                if (this.$autoOpen) {
                    BuildersKt__Builders_commonKt.launch$default(this.this$0.serviceScope, Dispatchers.getMain(), null, new AnonymousClass1(this.this$0, targetFile, null), 2, null);
                }
                BuildersKt__Builders_commonKt.launch$default(this.this$0.serviceScope, Dispatchers.getMain(), null, new AnonymousClass2(this.this$0, null), 2, null);
            } catch (Exception e) {
                Log.e(FileDownloadService.TAG, "Download failed", e);
                BuildersKt__Builders_commonKt.launch$default($this$launch, Dispatchers.getMain(), null, new AnonymousClass3(this.this$0, this.$fileName, e, null), 2, null);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: FileDownloadService.kt */
        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        @DebugMetadata(m184c = "com.yhchat.canarys.service.FileDownloadService$startDownloadFile$1$1", m185f = "FileDownloadService.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
        /* renamed from: com.yhchat.canarys.service.FileDownloadService$startDownloadFile$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ File $finalFile;
            int label;
            final /* synthetic */ FileDownloadService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(FileDownloadService fileDownloadService, File file, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = fileDownloadService;
                this.$finalFile = file;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, this.$finalFile, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.this$0.openFile(this.$finalFile);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: FileDownloadService.kt */
        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        @DebugMetadata(m184c = "com.yhchat.canarys.service.FileDownloadService$startDownloadFile$1$2", m185f = "FileDownloadService.kt", m186i = {}, m187l = {229}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
        /* renamed from: com.yhchat.canarys.service.FileDownloadService$startDownloadFile$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ FileDownloadService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(FileDownloadService fileDownloadService, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = fileDownloadService;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        if (DelayKt.delay(3000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.this$0.stopSelf();
                return Unit.INSTANCE;
            }
        }

        /* compiled from: FileDownloadService.kt */
        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        @DebugMetadata(m184c = "com.yhchat.canarys.service.FileDownloadService$startDownloadFile$1$3", m185f = "FileDownloadService.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
        /* renamed from: com.yhchat.canarys.service.FileDownloadService$startDownloadFile$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: $e */
            final /* synthetic */ Exception f696$e;
            final /* synthetic */ String $fileName;
            int label;
            final /* synthetic */ FileDownloadService this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(FileDownloadService fileDownloadService, String str, Exception exc, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = fileDownloadService;
                this.$fileName = str;
                this.f696$e = exc;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, this.$fileName, this.f696$e, continuation);
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
                        this.this$0.updateNotification(this.$fileName, "\u4e0b\u8f7d\u5931\u8d25: " + this.f696$e.getMessage(), 0, 0, true);
                        Toast.makeText(this.this$0, "\u4e0b\u8f7d\u5931\u8d25: " + this.f696$e.getMessage(), 1).show();
                        this.this$0.stopSelf();
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Closeable] */
    public final Object downloadFileWithProgress(String str, File file, String str2, long j, Continuation<? super Unit> continuation) throws IOException {
        Throwable th;
        Response response;
        long jLongValue;
        String str3;
        Throwable th2;
        ?? r10;
        InputStream inputStream;
        String str4;
        FileOutputStream fileOutputStream;
        Throwable th3;
        byte[] bArr;
        Ref.LongRef longRef;
        long j2;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        InputStream inputStream2;
        ?? r102;
        InputStream inputStream3;
        byte[] bArr2;
        FileOutputStream fileOutputStream4;
        Response response2;
        Request request;
        FileDownloadService fileDownloadService = this;
        String str5 = str;
        Request requestBuild = new Request.Builder().url(str5).build();
        Response responseExecute = fileDownloadService.okHttpClient.newCall(requestBuild).execute();
        try {
            response = responseExecute;
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            if (!response.isSuccessful()) {
                throw new Exception("HTTP " + response.code());
            }
            ResponseBody responseBodyBody = response.body();
            if (responseBodyBody == null) {
                throw new Exception("Empty response body");
            }
            Long lBoxLong = Boxing.boxLong(responseBodyBody.getContentLength());
            if (!(lBoxLong.longValue() > 0)) {
                lBoxLong = null;
            }
            if (lBoxLong != null) {
                try {
                    jLongValue = lBoxLong.longValue();
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        CloseableKt.closeFinally(responseExecute, th);
                        throw th6;
                    }
                }
            } else {
                jLongValue = j;
            }
            Log.d(TAG, "Downloading " + file.getName() + ", total size: " + jLongValue + " bytes");
            InputStream inputStreamByteStream = responseBodyBody.byteStream();
            try {
                inputStream = inputStreamByteStream;
                str4 = inputStreamByteStream;
            } catch (Throwable th7) {
                th = th7;
                str3 = inputStreamByteStream;
            }
            try {
                try {
                    FileOutputStream fileOutputStream5 = new FileOutputStream(file);
                    try {
                        FileOutputStream fileOutputStream6 = fileOutputStream5;
                        bArr = new byte[8192];
                        longRef = new Ref.LongRef();
                        j2 = 0;
                        fileOutputStream2 = fileOutputStream5;
                        fileOutputStream3 = fileOutputStream6;
                        inputStream2 = inputStream;
                        try {
                            BuildersKt__Builders_commonKt.launch$default(fileDownloadService.serviceScope, Dispatchers.getMain(), null, new FileDownloadService$downloadFileWithProgress$2$1$1$1(fileDownloadService, str2, jLongValue, null), 2, null);
                        } catch (Throwable th8) {
                            str5 = str4;
                            fileOutputStream = fileOutputStream2;
                            th3 = th8;
                        }
                    } catch (Throwable th9) {
                        str5 = str4;
                        fileOutputStream = fileOutputStream5;
                        th3 = th9;
                    }
                    while (true) {
                        int i = inputStream2.read(bArr);
                        if (i == -1) {
                            r102 = str4;
                            fileOutputStream = fileOutputStream2;
                            Unit unit = Unit.INSTANCE;
                            CloseableKt.closeFinally(fileOutputStream, null);
                            Unit unit2 = Unit.INSTANCE;
                            CloseableKt.closeFinally(r102, null);
                            Log.d(TAG, "Download to temp file completed: " + file.getAbsolutePath());
                            CloseableKt.closeFinally(responseExecute, null);
                            return Unit.INSTANCE;
                        }
                        fileOutputStream3.write(bArr, 0, i);
                        Ref.LongRef longRef2 = longRef;
                        long j3 = jLongValue;
                        try {
                            longRef2.element += i;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                try {
                                    if (jCurrentTimeMillis - j2 <= 200) {
                                        try {
                                            if (longRef2.element != j3) {
                                                jLongValue = j3;
                                                longRef = longRef2;
                                            }
                                        } catch (Throwable th10) {
                                            th3 = th10;
                                            str5 = str4;
                                            fileOutputStream = fileOutputStream2;
                                        }
                                    }
                                    BuildersKt__Builders_commonKt.launch$default(fileDownloadService.serviceScope, Dispatchers.getMain(), null, new FileDownloadService$downloadFileWithProgress$2$1$1$2((int) j3, longRef2, jLongValue, fileDownloadService, str2, (int) longRef2.element, null), 2, null);
                                    fileDownloadService = this;
                                    fileOutputStream2 = fileOutputStream;
                                    requestBuild = request;
                                    bArr = bArr2;
                                    inputStream2 = inputStream3;
                                    response = response2;
                                    longRef = longRef2;
                                    str4 = r102;
                                    fileOutputStream3 = fileOutputStream4;
                                } catch (Throwable th11) {
                                    th3 = th11;
                                    str5 = r102;
                                }
                                bArr2 = bArr;
                                fileOutputStream4 = fileOutputStream3;
                                response2 = response;
                                r102 = str4;
                                jLongValue = j3;
                                request = requestBuild;
                                fileOutputStream = fileOutputStream2;
                            } catch (Throwable th12) {
                                str5 = str4;
                                fileOutputStream = fileOutputStream2;
                                th3 = th12;
                            }
                            j2 = jCurrentTimeMillis;
                            inputStream3 = inputStream2;
                        } catch (Throwable th13) {
                            str5 = str4;
                            fileOutputStream = fileOutputStream2;
                            th3 = th13;
                        }
                        th3 = th11;
                        str5 = r102;
                        try {
                            throw th3;
                        } catch (Throwable th14) {
                            CloseableKt.closeFinally(fileOutputStream, th3);
                            throw th14;
                        }
                    }
                } catch (Throwable th15) {
                    th = th15;
                    str3 = str4;
                    th2 = th;
                    r10 = str3;
                    try {
                        throw th2;
                    } catch (Throwable th16) {
                        CloseableKt.closeFinally(r10, th2);
                        throw th16;
                    }
                }
            } catch (Throwable th17) {
                th2 = th17;
                r10 = str5;
                throw th2;
            }
        } catch (Throwable th18) {
            th = th18;
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calculateSHA256(File file) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            FileInputStream fileInputStream2 = fileInputStream;
            byte[] bArr = new byte[8192];
            while (true) {
                int i = fileInputStream2.read(bArr);
                if (i == -1) {
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileInputStream, null);
                    byte[] bArrDigest = digest.digest();
                    Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
                    return ArraysKt.joinToString$default(bArrDigest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.yhchat.canarys.service.FileDownloadService$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return FileDownloadService.calculateSHA256$lambda$1(((Byte) obj).byteValue());
                        }
                    }, 30, (Object) null);
                }
                digest.update(bArr, 0, i);
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence calculateSHA256$lambda$1(byte it) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File findFileWithSameHash(File directory, String targetHash, final String excludeFileName) {
        String fileHash;
        File[] files = directory.listFiles(new FileFilter() { // from class: com.yhchat.canarys.service.FileDownloadService$$ExternalSyntheticLambda0
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return FileDownloadService.findFileWithSameHash$lambda$0(excludeFileName, file);
            }
        });
        if (files == null) {
            return null;
        }
        for (File file : files) {
            try {
                Intrinsics.checkNotNull(file);
                fileHash = calculateSHA256(file);
            } catch (Exception e) {
                Log.e(TAG, "Failed to calculate hash for " + file.getName(), e);
            }
            if (Intrinsics.areEqual(fileHash, targetHash)) {
                return file;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findFileWithSameHash$lambda$0(String $excludeFileName, File file) {
        if (!file.isFile()) {
            return false;
        }
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (StringsKt.endsWith$default(name, String.valueOf(file.getName()), false, 2, (Object) null)) {
            return false;
        }
        String name2 = file.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        return !StringsKt.startsWith$default(name2, $excludeFileName, false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void openFile(File file) {
        String mimeType;
        try {
            Uri uri = FileProvider.getUriForFile(this, getPackageName() + ".fileprovider", file);
            Intrinsics.checkNotNull(uri);
            String lowerCase = FilesKt.getExtension(file).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case 1827:
                    if (!lowerCase.equals("7z")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "application/zip";
                    break;
                case 96323:
                    if (!lowerCase.equals("aac")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "audio/*";
                    break;
                case 96980:
                    if (!lowerCase.equals("avi")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "video/*";
                    break;
                case 97669:
                    if (!lowerCase.equals("bmp")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "image/*";
                    break;
                case 101488:
                    if (!lowerCase.equals("flv")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "video/*";
                    break;
                case 102340:
                    if (!lowerCase.equals("gif")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "image/*";
                    break;
                case 105441:
                    if (!lowerCase.equals("jpg")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "image/*";
                    break;
                case 108184:
                    if (!lowerCase.equals("mkv")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "video/*";
                    break;
                case 108272:
                    if (!lowerCase.equals("mp3")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "audio/*";
                    break;
                case 108273:
                    if (!lowerCase.equals("mp4")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "video/*";
                    break;
                case 108308:
                    if (!lowerCase.equals("mov")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "video/*";
                    break;
                case 109967:
                    if (!lowerCase.equals("ogg")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "audio/*";
                    break;
                case 110834:
                    if (!lowerCase.equals("pdf")) {
                        mimeType = "*/*";
                        break;
                    } else {
                        mimeType = "application/pdf";
                        break;
                    }
                case 111145:
                    if (!lowerCase.equals("png")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "image/*";
                    break;
                case 112675:
                    if (!lowerCase.equals("rar")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "application/zip";
                    break;
                case 115312:
                    if (!lowerCase.equals("txt")) {
                        mimeType = "*/*";
                        break;
                    } else {
                        mimeType = "text/plain";
                        break;
                    }
                case 117484:
                    if (!lowerCase.equals("wav")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "audio/*";
                    break;
                case 117856:
                    if (!lowerCase.equals("wmv")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "video/*";
                    break;
                case 120609:
                    if (!lowerCase.equals("zip")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "application/zip";
                    break;
                case 3145576:
                    if (!lowerCase.equals("flac")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "audio/*";
                    break;
                case 3268712:
                    if (!lowerCase.equals("jpeg")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "image/*";
                    break;
                case 3645337:
                    if (!lowerCase.equals("webm")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "video/*";
                    break;
                case 3645340:
                    if (!lowerCase.equals("webp")) {
                        mimeType = "*/*";
                        break;
                    }
                    mimeType = "image/*";
                    break;
                default:
                    mimeType = "*/*";
                    break;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, mimeType);
            intent.addFlags(268435456);
            intent.addFlags(1);
            PackageManager packageManager = getPackageManager();
            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent);
                Log.d(TAG, "Opened file with external app: " + file.getName());
            } else {
                Intent chooserIntent = Intent.createChooser(intent, "\u9009\u62e9\u5e94\u7528\u6253\u5f00");
                chooserIntent.addFlags(268435456);
                startActivity(chooserIntent);
                Log.d(TAG, "Opened file chooser for: " + file.getName());
            }
        } catch (Exception e) {
            Log.e(TAG, "Failed to open file: " + file.getName(), e);
            BuildersKt__Builders_commonKt.launch$default(this.serviceScope, Dispatchers.getMain(), null, new C31231(e, null), 2, null);
        }
    }

    /* compiled from: FileDownloadService.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.service.FileDownloadService$openFile$1", m185f = "FileDownloadService.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.service.FileDownloadService$openFile$1 */
    static final class C31231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f695$e;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31231(Exception exc, Continuation<? super C31231> continuation) {
            super(2, continuation);
            this.f695$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FileDownloadService.this.new C31231(this.f695$e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Toast.makeText(FileDownloadService.this, "\u65e0\u6cd5\u6253\u5f00\u6587\u4ef6: " + this.f695$e.getMessage(), 1).show();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final Notification createNotification(String fileName, String progressText, int progress, int maxProgress) {
        Notification notificationBuild = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID).setContentTitle(fileName).setContentText(progressText).setSmallIcon(R.drawable.stat_sys_download).setProgress(maxProgress, progress, maxProgress == 0).setOngoing(true).setAutoCancel(false).build();
        Intrinsics.checkNotNullExpressionValue(notificationBuild, "build(...)");
        return notificationBuild;
    }

    static /* synthetic */ void updateNotification$default(FileDownloadService fileDownloadService, String str, String str2, int i, int i2, boolean z, int i3, Object obj) {
        boolean z2;
        if ((i3 & 16) == 0) {
            z2 = z;
        } else {
            z2 = false;
        }
        fileDownloadService.updateNotification(str, str2, i, i2, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateNotification(String fileName, String progressText, int progress, int maxProgress, boolean isCompleted) {
        Notification notification = new NotificationCompat.Builder(this, NOTIFICATION_CHANNEL_ID).setContentTitle(fileName).setContentText(progressText).setSmallIcon(isCompleted ? R.drawable.stat_sys_download_done : R.drawable.stat_sys_download).setProgress(maxProgress, progress, maxProgress == 0 && !isCompleted).setOngoing(!isCompleted).setAutoCancel(isCompleted).build();
        Intrinsics.checkNotNullExpressionValue(notification, "build(...)");
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.notify(NOTIFICATION_ID, notification);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatFileSize(long bytes) {
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

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "FileDownloadService destroyed");
    }
}
