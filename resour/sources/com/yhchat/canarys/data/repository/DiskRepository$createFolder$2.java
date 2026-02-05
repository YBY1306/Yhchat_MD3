package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiskRepository.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.DiskRepository$createFolder$2", m185f = "DiskRepository.kt", m186i = {1, 1}, m187l = {33, 48}, m188m = "invokeSuspend", m189n = {"token", "request"}, m191s = {"L$0", "L$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class DiskRepository$createFolder$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ int $chatType;
    final /* synthetic */ String $folderName;
    final /* synthetic */ long $parentFolderId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DiskRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DiskRepository$createFolder$2(DiskRepository diskRepository, String str, int i, String str2, long j, Continuation<? super DiskRepository$createFolder$2> continuation) {
        super(2, continuation);
        this.this$0 = diskRepository;
        this.$chatId = str;
        this.$chatType = i;
        this.$folderName = str2;
        this.$parentFolderId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DiskRepository$createFolder$2(this.this$0, this.$chatId, this.$chatType, this.$folderName, this.$parentFolderId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((DiskRepository$createFolder$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x00b5, B:33:0x00bf, B:35:0x00c7, B:37:0x00cd, B:39:0x00df, B:42:0x00e7, B:43:0x010e, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:49:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x00b5, B:33:0x00bf, B:35:0x00c7, B:37:0x00cd, B:39:0x00df, B:42:0x00e7, B:43:0x010e, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:49:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf A[Catch: Exception -> 0x0027, TRY_ENTER, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x00b5, B:33:0x00bf, B:35:0x00c7, B:37:0x00cd, B:39:0x00df, B:42:0x00e7, B:43:0x010e, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:49:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e A[Catch: Exception -> 0x0027, TRY_LEAVE, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x00b5, B:33:0x00bf, B:35:0x00c7, B:37:0x00cd, B:39:0x00df, B:42:0x00e7, B:43:0x010e, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:49:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.DiskRepository$createFolder$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
