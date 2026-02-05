package com.yhchat.canarys;

import android.app.ActivityManager;
import android.os.Debug;
import android.os.Process;
import dagger.hilt.android.HiltAndroidApp;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p008io.FilesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: CanaryApplication.kt */
@Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/CanaryApplication;", "Landroid/app/Application;", "<init>", "()V", "appScope", "Lkotlinx/coroutines/CoroutineScope;", "onCreate", "", "startMemoryAutoCleanLoop", "getCurrentProcessPssBytes", "", "clearAppCacheDir", "dir", "Ljava/io/File;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
@HiltAndroidApp
/* loaded from: classes3.dex */
public final class CanaryApplication extends Hilt_CanaryApplication {
    public static final int $stable = 8;
    private final CoroutineScope appScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getDefault()));

    @Override // com.yhchat.canarys.Hilt_CanaryApplication, android.app.Application
    public void onCreate() {
        super.onCreate();
        AppForegroundTracker.INSTANCE.init();
        startMemoryAutoCleanLoop();
    }

    /* compiled from: CanaryApplication.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.CanaryApplication$startMemoryAutoCleanLoop$1", m185f = "CanaryApplication.kt", m186i = {0}, m187l = {52}, m188m = "invokeSuspend", m189n = {"$this$launch"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.CanaryApplication$startMemoryAutoCleanLoop$1 */
    static final class C30061 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C30061(Continuation<? super C30061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C30061 c30061 = CanaryApplication.this.new C30061(continuation);
            c30061.L$0 = obj;
            return c30061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C30061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(4:24|25|44|26) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        
            r1 = kotlin.Result.INSTANCE;
            kotlin.Result.m11919constructorimpl(kotlin.ResultKt.createFailure(r0));
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c4 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00c2 -> B:41:0x00c5). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                r18 = this;
                r1 = r18
                java.lang.String r2 = "MB"
                java.lang.Object r0 = r1.L$0
                kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r4 = r1.label
                switch(r4) {
                    case 0: goto L25;
                    case 1: goto L19;
                    default: goto L11;
                }
            L11:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L19:
                kotlin.ResultKt.throwOnFailure(r19)
                r4 = r0
                r6 = r1
                r17 = r2
                r5 = r3
                r3 = r19
                goto Lc5
            L25:
                kotlin.ResultKt.throwOnFailure(r19)
                r4 = r0
                r6 = r1
                r5 = r3
                r3 = r19
            L2d:
                boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r4)
                if (r0 == 0) goto Lcb
                com.yhchat.canarys.CanaryApplication r0 = com.yhchat.canarys.CanaryApplication.this
                kotlin.Result$Companion r7 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> La7
                r7 = r4
                r8 = 0
                java.lang.String r9 = "display_settings"
                r10 = 0
                android.content.SharedPreferences r9 = r0.getSharedPreferences(r9, r10)     // Catch: java.lang.Throwable -> La7
                java.lang.String r11 = "memory_auto_clean_enabled"
                boolean r10 = r9.getBoolean(r11, r10)     // Catch: java.lang.Throwable -> La7
                if (r10 == 0) goto L9d
                java.lang.String r11 = "memory_auto_clean_threshold_value"
                r12 = 1140850688(0x44000000, float:512.0)
                float r11 = r9.getFloat(r11, r12)     // Catch: java.lang.Throwable -> La7
                java.lang.String r12 = "memory_auto_clean_threshold_unit"
                java.lang.String r12 = r9.getString(r12, r2)     // Catch: java.lang.Throwable -> La7
                if (r12 != 0) goto L59
                r12 = r2
            L59:
                java.util.Locale r13 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> La7
                java.lang.String r13 = r12.toUpperCase(r13)     // Catch: java.lang.Throwable -> La7
                java.lang.String r14 = "toUpperCase(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r14)     // Catch: java.lang.Throwable -> La7
                java.lang.String r14 = "GB"
                boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual(r13, r14)     // Catch: java.lang.Throwable -> La7
                r14 = 1149239296(0x44800000, float:1024.0)
                if (r13 == 0) goto L74
                float r13 = r11 * r14
                float r13 = r13 * r14
                float r13 = r13 * r14
                long r13 = (long) r13     // Catch: java.lang.Throwable -> La7
                goto L78
            L74:
                float r13 = r11 * r14
                float r13 = r13 * r14
                long r13 = (long) r13     // Catch: java.lang.Throwable -> La7
            L78:
                r15 = 0
                int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r15 <= 0) goto L9a
                long r15 = com.yhchat.canarys.CanaryApplication.access$getCurrentProcessPssBytes(r0)     // Catch: java.lang.Throwable -> La7
                int r17 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r17 <= 0) goto L97
            L88:
                java.io.File r1 = r0.getCacheDir()     // Catch: java.lang.Throwable -> La7
                r17 = r2
                java.lang.String r2 = "getCacheDir(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch: java.lang.Throwable -> La5
                com.yhchat.canarys.CanaryApplication.access$clearAppCacheDir(r0, r1)     // Catch: java.lang.Throwable -> La5
                goto L99
            L97:
                r17 = r2
            L99:
                goto L9f
            L9a:
                r17 = r2
                goto L9f
            L9d:
                r17 = r2
            L9f:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La5
                kotlin.Result.m11919constructorimpl(r0)     // Catch: java.lang.Throwable -> La5
                goto Lb3
            La5:
                r0 = move-exception
                goto Laa
            La7:
                r0 = move-exception
                r17 = r2
            Laa:
                kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
                java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
                kotlin.Result.m11919constructorimpl(r0)
            Lb3:
                r0 = r6
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                r6.L$0 = r4
                r1 = 1
                r6.label = r1
                r1 = 60000(0xea60, double:2.9644E-319)
                java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r1, r0)
                if (r0 != r5) goto Lc5
                return r5
            Lc5:
                r1 = r18
                r2 = r17
                goto L2d
            Lcb:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.CanaryApplication.C30061.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private final void startMemoryAutoCleanLoop() {
        BuildersKt__Builders_commonKt.launch$default(this.appScope, null, null, new C30061(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getCurrentProcessPssBytes() {
        Object systemService = getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager am = (ActivityManager) systemService;
        int pid = Process.myPid();
        Debug.MemoryInfo[] memInfo = am.getProcessMemoryInfo(new int[]{pid});
        Intrinsics.checkNotNull(memInfo);
        long pssKb = ((Debug.MemoryInfo) ArraysKt.firstOrNull(memInfo)) != null ? r3.getTotalPss() : 0L;
        return 1024 * pssKb;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearAppCacheDir(File dir) {
        File[] fileArrListFiles = dir.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            try {
                Result.Companion companion = Result.INSTANCE;
                CanaryApplication canaryApplication = this;
                Intrinsics.checkNotNull(file);
                Result.m11919constructorimpl(Boolean.valueOf(FilesKt.deleteRecursively(file)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m11919constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
