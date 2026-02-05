package com.yhchat.canarys.data.repository;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.yhchat.canarys.data.local.AppDatabase;
import com.yhchat.canarys.data.local.BlockedUser;
import com.yhchat.canarys.data.local.BlockedUserDao;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: BlocklistRepository.kt */
@Metadata(m168d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000eJ\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013J\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\u001aJ\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0019\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\u001aJ>\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d2\u0006\u0010\u0019\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001f\u001a\u00020\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0007H\u0086@\u00a2\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d2\u0006\u0010$\u001a\u00020\u0015H\u0086@\u00a2\u0006\u0004\b%\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u001d2\u0006\u0010\u0019\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0004\b(\u0010\u001aJ\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100\u001dH\u0086@\u00a2\u0006\u0004\b*\u0010\u0017J\u000e\u0010+\u001a\u00020,H\u0086@\u00a2\u0006\u0002\u0010\u0017J\u000e\u0010-\u001a\u00020\u0007H\u0086@\u00a2\u0006\u0002\u0010\u0017J(\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u001d2\u0006\u0010/\u001a\u00020\u00072\b\b\u0002\u00100\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\b1\u00102R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00063"}, m169d2 = {"Lcom/yhchat/canarys/data/repository/BlocklistRepository;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "tag", "", "blockedUserDao", "Lcom/yhchat/canarys/data/local/BlockedUserDao;", "prefs", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "isBlocklistEnabled", "", "setBlocklistEnabled", "", "enabled", "getAllBlockedUsers", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/yhchat/canarys/data/local/BlockedUser;", "getAllBlockedUsersSync", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isUserBlocked", "userId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBlockedUser", "blockUser", "Lkotlin/Result;", "userName", "reason", "avatarUrl", "blockUser-yxL6bBk", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateBlockedUser", "user", "updateBlockedUser-gIAlu-s", "(Lcom/yhchat/canarys/data/local/BlockedUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unblockUser", "unblockUser-gIAlu-s", "clearBlocklist", "clearBlocklist-IoAF18A", "getBlockedUsersCount", "", "exportToJson", "importFromJson", "jsonString", "mergeMode", "importFromJson-0E7RQCE", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class BlocklistRepository {
    public static final int $stable = 8;
    private final BlockedUserDao blockedUserDao;
    private final SharedPreferences prefs;
    private final String tag;

    /* compiled from: BlocklistRepository.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.data.repository.BlocklistRepository", m185f = "BlocklistRepository.kt", m186i = {}, m187l = {143}, m188m = "exportToJson", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.data.repository.BlocklistRepository$exportToJson$1 */
    static final class C30271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C30271(Continuation<? super C30271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BlocklistRepository.this.exportToJson(this);
        }
    }

    public BlocklistRepository(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.tag = "BlocklistRepository";
        this.blockedUserDao = AppDatabase.INSTANCE.getDatabase(context).blockedUserDao();
        this.prefs = context.getSharedPreferences("blocklist_settings", 0);
    }

    public final boolean isBlocklistEnabled() {
        return this.prefs.getBoolean("blocklist_enabled", false);
    }

    public final void setBlocklistEnabled(boolean enabled) {
        this.prefs.edit().putBoolean("blocklist_enabled", enabled).apply();
        Log.d(this.tag, "Blocklist enabled: " + enabled);
    }

    public final Flow<List<BlockedUser>> getAllBlockedUsers() {
        return this.blockedUserDao.getAllBlockedUsers();
    }

    public final Object getAllBlockedUsersSync(Continuation<? super List<BlockedUser>> continuation) {
        return this.blockedUserDao.getAllBlockedUsersSync(continuation);
    }

    public final Object isUserBlocked(String userId, Continuation<? super Boolean> continuation) {
        return !isBlocklistEnabled() ? Boxing.boxBoolean(false) : this.blockedUserDao.isUserBlocked(userId, continuation);
    }

    public final Object getBlockedUser(String userId, Continuation<? super BlockedUser> continuation) {
        return this.blockedUserDao.getBlockedUser(userId, continuation);
    }

    /* renamed from: blockUser-yxL6bBk$default */
    public static /* synthetic */ Object m8474blockUseryxL6bBk$default(BlocklistRepository blocklistRepository, String str, String str2, String str3, String str4, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        return blocklistRepository.m8476blockUseryxL6bBk(str, str2, str3, str4, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0014  */
    /* renamed from: blockUser-yxL6bBk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8476blockUseryxL6bBk(java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r15) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BlocklistRepository.m8476blockUseryxL6bBk(java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0014  */
    /* renamed from: updateBlockedUser-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8480updateBlockedUsergIAlus(com.yhchat.canarys.data.local.BlockedUser r7, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.yhchat.canarys.data.repository.BlocklistRepository$updateBlockedUser$1
            if (r0 == 0) goto L14
            r0 = r8
            com.yhchat.canarys.data.repository.BlocklistRepository$updateBlockedUser$1 r0 = (com.yhchat.canarys.data.repository.BlocklistRepository$updateBlockedUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.BlocklistRepository$updateBlockedUser$1 r0 = new com.yhchat.canarys.data.repository.BlocklistRepository$updateBlockedUser$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r7 = r2
            com.yhchat.canarys.data.local.BlockedUser r7 = (com.yhchat.canarys.data.local.BlockedUser) r7
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L6c
            goto L47
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.local.BlockedUserDao r3 = r6.blockedUserDao     // Catch: java.lang.Exception -> L6c
            r0.L$0 = r7     // Catch: java.lang.Exception -> L6c
            r4 = 1
            r0.label = r4     // Catch: java.lang.Exception -> L6c
            java.lang.Object r3 = r3.updateBlockedUser(r7, r0)     // Catch: java.lang.Exception -> L6c
            if (r3 != r2) goto L47
            return r2
        L47:
            java.lang.String r2 = r6.tag     // Catch: java.lang.Exception -> L6c
            java.lang.String r3 = r7.getUserId()     // Catch: java.lang.Exception -> L6c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L6c
            r4.<init>()     // Catch: java.lang.Exception -> L6c
            java.lang.String r5 = "Updated blocked user: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Exception -> L6c
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Exception -> L6c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L6c
            android.util.Log.d(r2, r3)     // Catch: java.lang.Exception -> L6c
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L6c
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L6c
            java.lang.Object r2 = kotlin.Result.m11919constructorimpl(r2)     // Catch: java.lang.Exception -> L6c
            goto L85
        L6c:
            r2 = move-exception
            java.lang.String r3 = r6.tag
            java.lang.String r4 = "Error updating blocked user"
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m11919constructorimpl(r3)
            r2 = r3
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BlocklistRepository.m8480updateBlockedUsergIAlus(com.yhchat.canarys.data.local.BlockedUser, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0014  */
    /* renamed from: unblockUser-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8479unblockUsergIAlus(java.lang.String r7, kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.yhchat.canarys.data.repository.BlocklistRepository$unblockUser$1
            if (r0 == 0) goto L14
            r0 = r8
            com.yhchat.canarys.data.repository.BlocklistRepository$unblockUser$1 r0 = (com.yhchat.canarys.data.repository.BlocklistRepository$unblockUser$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.BlocklistRepository$unblockUser$1 r0 = new com.yhchat.canarys.data.repository.BlocklistRepository$unblockUser$1
            r0.<init>(r6, r8)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L35;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            java.lang.Object r2 = r0.L$0
            r7 = r2
            java.lang.String r7 = (java.lang.String) r7
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L68
            goto L47
        L35:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.local.BlockedUserDao r3 = r6.blockedUserDao     // Catch: java.lang.Exception -> L68
            r0.L$0 = r7     // Catch: java.lang.Exception -> L68
            r4 = 1
            r0.label = r4     // Catch: java.lang.Exception -> L68
            java.lang.Object r3 = r3.deleteBlockedUserById(r7, r0)     // Catch: java.lang.Exception -> L68
            if (r3 != r2) goto L47
            return r2
        L47:
            java.lang.String r2 = r6.tag     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r3.<init>()     // Catch: java.lang.Exception -> L68
            java.lang.String r4 = "Unblocked user: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Exception -> L68
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L68
            android.util.Log.d(r2, r3)     // Catch: java.lang.Exception -> L68
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L68
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L68
            java.lang.Object r2 = kotlin.Result.m11919constructorimpl(r2)     // Catch: java.lang.Exception -> L68
            goto L81
        L68:
            r2 = move-exception
            java.lang.String r3 = r6.tag
            java.lang.String r4 = "Error unblocking user"
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m11919constructorimpl(r3)
            r2 = r3
        L81:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BlocklistRepository.m8479unblockUsergIAlus(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0014  */
    /* renamed from: clearBlocklist-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8477clearBlocklistIoAF18A(kotlin.coroutines.Continuation<? super kotlin.Result<kotlin.Unit>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.yhchat.canarys.data.repository.BlocklistRepository$clearBlocklist$1
            if (r0 == 0) goto L14
            r0 = r7
            com.yhchat.canarys.data.repository.BlocklistRepository$clearBlocklist$1 r0 = (com.yhchat.canarys.data.repository.BlocklistRepository$clearBlocklist$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r1 = r0.label
            int r1 = r1 - r2
            r0.label = r1
            goto L19
        L14:
            com.yhchat.canarys.data.repository.BlocklistRepository$clearBlocklist$1 r0 = new com.yhchat.canarys.data.repository.BlocklistRepository$clearBlocklist$1
            r0.<init>(r6, r7)
        L19:
            java.lang.Object r1 = r0.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.label
            switch(r3) {
                case 0: goto L32;
                case 1: goto L2c;
                default: goto L24;
            }
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlin.ResultKt.throwOnFailure(r1)     // Catch: java.lang.Exception -> L30
            goto L42
        L30:
            r2 = move-exception
            goto L52
        L32:
            kotlin.ResultKt.throwOnFailure(r1)
            com.yhchat.canarys.data.local.BlockedUserDao r3 = r6.blockedUserDao     // Catch: java.lang.Exception -> L30
            r4 = 1
            r0.label = r4     // Catch: java.lang.Exception -> L30
            java.lang.Object r3 = r3.clearAllBlockedUsers(r0)     // Catch: java.lang.Exception -> L30
            if (r3 != r2) goto L42
            return r2
        L42:
            java.lang.String r2 = r6.tag     // Catch: java.lang.Exception -> L30
            java.lang.String r3 = "Cleared all blocked users"
            android.util.Log.d(r2, r3)     // Catch: java.lang.Exception -> L30
            kotlin.Result$Companion r2 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L30
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L30
            java.lang.Object r2 = kotlin.Result.m11919constructorimpl(r2)     // Catch: java.lang.Exception -> L30
            goto L6a
        L52:
            java.lang.String r3 = r6.tag
            java.lang.String r4 = "Error clearing blocklist"
            r5 = r2
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            android.util.Log.e(r3, r4, r5)
            kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
            r3 = r2
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
            java.lang.Object r3 = kotlin.Result.m11919constructorimpl(r3)
            r2 = r3
        L6a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BlocklistRepository.m8477clearBlocklistIoAF18A(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object getBlockedUsersCount(Continuation<? super Integer> continuation) {
        return this.blockedUserDao.getBlockedUsersCount(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object exportToJson(kotlin.coroutines.Continuation<? super java.lang.String> r18) throws org.json.JSONException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            boolean r2 = r1 instanceof com.yhchat.canarys.data.repository.BlocklistRepository.C30271
            if (r2 == 0) goto L18
            r2 = r1
            com.yhchat.canarys.data.repository.BlocklistRepository$exportToJson$1 r2 = (com.yhchat.canarys.data.repository.BlocklistRepository.C30271) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 & r4
            if (r3 == 0) goto L18
            int r3 = r2.label
            int r3 = r3 - r4
            r2.label = r3
            goto L1d
        L18:
            com.yhchat.canarys.data.repository.BlocklistRepository$exportToJson$1 r2 = new com.yhchat.canarys.data.repository.BlocklistRepository$exportToJson$1
            r2.<init>(r1)
        L1d:
            java.lang.Object r3 = r2.result
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r5 = r2.label
            r6 = 1
            switch(r5) {
                case 0: goto L36;
                case 1: goto L31;
                default: goto L29;
            }
        L29:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L31:
            kotlin.ResultKt.throwOnFailure(r3)
            r5 = r3
            goto L42
        L36:
            kotlin.ResultKt.throwOnFailure(r3)
            r2.label = r6
            java.lang.Object r5 = r0.getAllBlockedUsersSync(r2)
            if (r5 != r4) goto L42
            return r4
        L42:
            r4 = r5
            java.util.List r4 = (java.util.List) r4
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            r7 = r4
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            r8 = 0
            java.util.Iterator r9 = r7.iterator()
        L52:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto La0
            java.lang.Object r10 = r9.next()
            r11 = r10
            com.yhchat.canarys.data.local.BlockedUser r11 = (com.yhchat.canarys.data.local.BlockedUser) r11
            r12 = 0
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            java.lang.String r14 = "userId"
            java.lang.String r15 = r11.getUserId()
            r13.put(r14, r15)
            java.lang.String r14 = "userName"
            java.lang.String r15 = r11.getUserName()
            r13.put(r14, r15)
            java.lang.String r14 = "reason"
            java.lang.String r15 = r11.getReason()
            r13.put(r14, r15)
            java.lang.String r14 = "blockedTime"
            r16 = r7
            long r6 = r11.getBlockedTime()
            r13.put(r14, r6)
            java.lang.String r6 = r11.getAvatarUrl()
            if (r6 != 0) goto L93
            java.lang.String r6 = ""
        L93:
            java.lang.String r7 = "avatarUrl"
            r13.put(r7, r6)
            r5.put(r13)
            r7 = r16
            r6 = 1
            goto L52
        La0:
            r16 = r7
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r7 = "version"
            r15 = 1
            r6.put(r7, r15)
            java.lang.String r7 = "exportTime"
            long r8 = java.lang.System.currentTimeMillis()
            r6.put(r7, r8)
            java.lang.String r7 = "blockedUsers"
            r6.put(r7, r5)
            r7 = 2
            java.lang.String r7 = r6.toString(r7)
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BlocklistRepository.exportToJson(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: importFromJson-0E7RQCE$default */
    public static /* synthetic */ Object m8475importFromJson0E7RQCE$default(BlocklistRepository blocklistRepository, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return blocklistRepository.m8478importFromJson0E7RQCE(str, z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0097 A[Catch: Exception -> 0x0060, LOOP:0: B:82:0x0095->B:83:0x0097, LOOP_END, TryCatch #0 {Exception -> 0x0060, blocks: (B:64:0x004b, B:88:0x010d, B:92:0x0118, B:67:0x0056, B:81:0x007e, B:83:0x0097, B:84:0x00e8), top: B:96:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* renamed from: importFromJson-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m8478importFromJson0E7RQCE(java.lang.String r26, boolean r27, kotlin.coroutines.Continuation<? super kotlin.Result<java.lang.Integer>> r28) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.BlocklistRepository.m8478importFromJson0E7RQCE(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
