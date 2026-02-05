package com.yhchat.canarys.service;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p008io.CloseableKt;
import kotlin.p008io.FilesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* compiled from: AudioCacheManager.kt */
@Metadata(m168d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010\u000f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\u0010\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u0010\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0011H\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u00a8\u0006\u001e"}, m169d2 = {"Lcom/yhchat/canarys/service/AudioCacheManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cacheDir", "Ljava/io/File;", "getCacheDir", "()Ljava/io/File;", "cacheDir$delegate", "Lkotlin/Lazy;", "getCachedAudioFile", "audioUrl", "", "cacheAudioFile", "audioData", "", "verifyCachedFile", "", "findDuplicateAudioFile", "cleanupCacheIfNeeded", "", "calculateSHA256", "input", "calculateMD5", "getCacheStats", "Lcom/yhchat/canarys/service/CacheStats;", "clearAllCache", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes13.dex */
public final class AudioCacheManager {
    private static final String CACHE_DIR_NAME = "audio_cache";
    private static final int MAX_CACHE_FILES = 200;
    private static final int MAX_CACHE_SIZE = 104857600;
    private static final String TAG = "AudioCacheManager";

    /* renamed from: cacheDir$delegate, reason: from kotlin metadata */
    private final Lazy cacheDir;
    private final Context context;
    public static final int $stable = 8;

    public AudioCacheManager(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.cacheDir = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.service.AudioCacheManager$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AudioCacheManager.cacheDir_delegate$lambda$0(this.f$0);
            }
        });
    }

    private final File getCacheDir() {
        return (File) this.cacheDir.getValue();
    }

    public static final File cacheDir_delegate$lambda$0(AudioCacheManager this$0) {
        File file = new File(this$0.context.getCacheDir(), CACHE_DIR_NAME);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final File getCachedAudioFile(String audioUrl) {
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        String urlHash = calculateSHA256(audioUrl);
        File cacheFile = new File(getCacheDir(), urlHash + ".m4a");
        if (cacheFile.exists() && cacheFile.length() > 0) {
            Log.d(TAG, "\u627e\u5230\u7f13\u5b58\u97f3\u9891\u6587\u4ef6: " + cacheFile.getAbsolutePath());
            cacheFile.setLastModified(System.currentTimeMillis());
            return cacheFile;
        }
        return null;
    }

    public final File cacheAudioFile(String audioUrl, byte[] audioData) throws Exception {
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        Intrinsics.checkNotNullParameter(audioData, "audioData");
        cleanupCacheIfNeeded();
        String urlHash = calculateSHA256(audioUrl);
        File cacheFile = new File(getCacheDir(), urlHash + ".m4a");
        String dataHash = calculateSHA256(audioData);
        File hashFile = new File(getCacheDir(), urlHash + ".hash");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(cacheFile);
            try {
                fileOutputStream.write(audioData);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(fileOutputStream, null);
                fileOutputStream = new FileOutputStream(hashFile);
                try {
                    byte[] bytes = dataHash.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    fileOutputStream.write(bytes);
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(fileOutputStream, null);
                    Log.d(TAG, "\u97f3\u9891\u6587\u4ef6\u5df2\u7f13\u5b58: " + cacheFile.getAbsolutePath());
                    return cacheFile;
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Exception e) {
            Log.e(TAG, "\u7f13\u5b58\u97f3\u9891\u6587\u4ef6\u5931\u8d25", e);
            cacheFile.delete();
            hashFile.delete();
            throw e;
        }
    }

    public final boolean verifyCachedFile(String audioUrl) {
        Intrinsics.checkNotNullParameter(audioUrl, "audioUrl");
        String urlHash = calculateSHA256(audioUrl);
        File cacheFile = new File(getCacheDir(), urlHash + ".m4a");
        File hashFile = new File(getCacheDir(), urlHash + ".hash");
        if (!cacheFile.exists() || !hashFile.exists()) {
            return false;
        }
        try {
            String savedHash = FilesKt.readText$default(hashFile, null, 1, null);
            String currentHash = calculateSHA256(FilesKt.readBytes(cacheFile));
            boolean isValid = Intrinsics.areEqual(savedHash, currentHash);
            if (!isValid) {
                Log.w(TAG, "\u7f13\u5b58\u6587\u4ef6\u54c8\u5e0c\u503c\u4e0d\u5339\u914d\uff0c\u5220\u9664\u635f\u574f\u7684\u6587\u4ef6: " + cacheFile.getName());
                cacheFile.delete();
                hashFile.delete();
            }
            return isValid;
        } catch (Exception e) {
            Log.e(TAG, "\u9a8c\u8bc1\u7f13\u5b58\u6587\u4ef6\u5931\u8d25", e);
            return false;
        }
    }

    public final File findDuplicateAudioFile(byte[] audioData) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(audioData, "audioData");
        String dataHash = calculateSHA256(audioData);
        File[] fileArrListFiles = getCacheDir().listFiles(new FileFilter() { // from class: com.yhchat.canarys.service.AudioCacheManager$$ExternalSyntheticLambda5
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return AudioCacheManager.findDuplicateAudioFile$lambda$0(file);
            }
        });
        if (fileArrListFiles == null) {
            return null;
        }
        for (File file : fileArrListFiles) {
            try {
                Intrinsics.checkNotNull(file);
            } catch (Exception e) {
                Log.w(TAG, "\u68c0\u67e5\u6587\u4ef6\u65f6\u51fa\u9519: " + file.getName(), e);
            }
            if (Intrinsics.areEqual(calculateSHA256(FilesKt.readBytes(file)), dataHash)) {
                Log.d(TAG, "\u627e\u5230\u5185\u5bb9\u76f8\u540c\u7684\u7f13\u5b58\u6587\u4ef6: " + file.getName());
                file.setLastModified(System.currentTimeMillis());
                return file;
            }
            continue;
        }
        return null;
    }

    public static final boolean findDuplicateAudioFile$lambda$0(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.endsWith$default(name, ".m4a", false, 2, (Object) null);
    }

    private final void cleanupCacheIfNeeded() {
        List list;
        ArrayList arrayListTake;
        File[] fileArrListFiles = getCacheDir().listFiles(new FileFilter() { // from class: com.yhchat.canarys.service.AudioCacheManager$$ExternalSyntheticLambda1
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return AudioCacheManager.cleanupCacheIfNeeded$lambda$0(file);
            }
        });
        if (fileArrListFiles == null || (list = ArraysKt.toList(fileArrListFiles)) == null) {
            return;
        }
        List cacheFiles = list;
        Iterator it = cacheFiles.iterator();
        long totalSize = 0;
        while (it.hasNext()) {
            totalSize += ((File) it.next()).length();
        }
        if (totalSize <= 104857600 && cacheFiles.size() <= 200) {
            return;
        }
        Iterable iterableSortedWith = CollectionsKt.sortedWith(cacheFiles, new Comparator() { // from class: com.yhchat.canarys.service.AudioCacheManager$cleanupCacheIfNeeded$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((File) t).lastModified()), Long.valueOf(((File) t2).lastModified()));
            }
        });
        if (totalSize <= 104857600) {
            arrayListTake = CollectionsKt.take(iterableSortedWith, (cacheFiles.size() - 200) + 20);
        } else {
            long currentSize = totalSize;
            ArrayList arrayList = new ArrayList();
            for (Object obj : iterableSortedWith) {
                File file = (File) obj;
                List cacheFiles2 = cacheFiles;
                long totalSize2 = totalSize;
                boolean z = ((double) currentSize) > 8.388608E7d;
                if (z) {
                    currentSize -= file.length();
                }
                if (!z) {
                    break;
                }
                arrayList.add(obj);
                cacheFiles = cacheFiles2;
                totalSize = totalSize2;
            }
            arrayListTake = arrayList;
        }
        Iterable<File> filesToDelete = arrayListTake;
        for (File file2 : filesToDelete) {
            try {
                File cacheDir = getCacheDir();
                Intrinsics.checkNotNull(file2);
                File file3 = new File(cacheDir, FilesKt.getNameWithoutExtension(file2) + ".hash");
                file2.delete();
                file3.delete();
                Log.d(TAG, "\u6e05\u7406\u7f13\u5b58\u6587\u4ef6: " + file2.getName());
            } catch (Exception e) {
                Log.w(TAG, "\u5220\u9664\u7f13\u5b58\u6587\u4ef6\u5931\u8d25: " + file2.getName(), e);
            }
        }
    }

    public static final boolean cleanupCacheIfNeeded$lambda$0(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.endsWith$default(name, ".m4a", false, 2, (Object) null);
    }

    private final String calculateSHA256(String input) {
        byte[] bytes = input.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return calculateSHA256(bytes);
    }

    private final String calculateSHA256(byte[] input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(input);
        Intrinsics.checkNotNull(hashBytes);
        return ArraysKt.joinToString$default(hashBytes, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.yhchat.canarys.service.AudioCacheManager$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AudioCacheManager.calculateSHA256$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, (Object) null);
    }

    public static final CharSequence calculateSHA256$lambda$0(byte it) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private final String calculateMD5(byte[] input) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte[] hashBytes = digest.digest(input);
        Intrinsics.checkNotNull(hashBytes);
        return ArraysKt.joinToString$default(hashBytes, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new Function1() { // from class: com.yhchat.canarys.service.AudioCacheManager$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AudioCacheManager.calculateMD5$lambda$0(((Byte) obj).byteValue());
            }
        }, 30, (Object) null);
    }

    public static final CharSequence calculateMD5$lambda$0(byte it) {
        String str = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(it)}, 1));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public final CacheStats getCacheStats() {
        List cacheFiles;
        File[] fileArrListFiles = getCacheDir().listFiles(new FileFilter() { // from class: com.yhchat.canarys.service.AudioCacheManager$$ExternalSyntheticLambda4
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return AudioCacheManager.getCacheStats$lambda$0(file);
            }
        });
        if (fileArrListFiles == null || (cacheFiles = ArraysKt.toList(fileArrListFiles)) == null) {
            cacheFiles = CollectionsKt.emptyList();
        }
        Iterator it = cacheFiles.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += ((File) it.next()).length();
        }
        long totalSize = length;
        int fileCount = cacheFiles.size();
        return new CacheStats(fileCount, totalSize, 104857600L, 200);
    }

    public static final boolean getCacheStats$lambda$0(File file) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return StringsKt.endsWith$default(name, ".m4a", false, 2, (Object) null);
    }

    public final void clearAllCache() {
        try {
            File[] fileArrListFiles = getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            Log.d(TAG, "\u5df2\u6e05\u7a7a\u6240\u6709\u97f3\u9891\u7f13\u5b58");
        } catch (Exception e) {
            Log.e(TAG, "\u6e05\u7a7a\u7f13\u5b58\u5931\u8d25", e);
        }
    }
}
