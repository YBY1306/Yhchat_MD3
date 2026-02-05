package com.yhchat.canarys.data.repository;

import androidx.core.view.MotionEventCompat;
import com.yhchat.canarys.data.model.ShareData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShareRepository.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/yhchat/canarys/data/model/ShareData;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ShareRepository$createShareLink$2", m185f = "ShareRepository.kt", m186i = {1, 1}, m187l = {33, MotionEventCompat.AXIS_GENERIC_16}, m188m = "invokeSuspend", m189n = {"token", "request"}, m191s = {"L$0", "L$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class ShareRepository$createShareLink$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends ShareData>>, Object> {
    final /* synthetic */ String $chatId;
    final /* synthetic */ String $chatName;
    final /* synthetic */ int $chatType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ ShareRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareRepository$createShareLink$2(ShareRepository shareRepository, String str, int i, String str2, Continuation<? super ShareRepository$createShareLink$2> continuation) {
        super(2, continuation);
        this.this$0 = shareRepository;
        this.$chatId = str;
        this.$chatType = i;
        this.$chatName = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareRepository$createShareLink$2(this.this$0, this.$chatId, this.$chatType, this.$chatName, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends ShareData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<ShareData>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<ShareData>> continuation) {
        return ((ShareRepository$createShareLink$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x00bf, B:33:0x00c9, B:35:0x00d1, B:37:0x00d7, B:39:0x0102, B:41:0x0108, B:42:0x012f, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x00bf, B:33:0x00c9, B:35:0x00d1, B:37:0x00d7, B:39:0x0102, B:41:0x0108, B:42:0x012f, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9 A[Catch: Exception -> 0x0027, TRY_ENTER, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x00bf, B:33:0x00c9, B:35:0x00d1, B:37:0x00d7, B:39:0x0102, B:41:0x0108, B:42:0x012f, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012f A[Catch: Exception -> 0x0027, TRY_LEAVE, TryCatch #0 {Exception -> 0x0027, blocks: (B:7:0x001c, B:30:0x00bf, B:33:0x00c9, B:35:0x00d1, B:37:0x00d7, B:39:0x0102, B:41:0x0108, B:42:0x012f, B:8:0x0022, B:16:0x0040, B:18:0x0047, B:24:0x0053, B:26:0x0070, B:13:0x002e), top: B:48:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.ShareRepository$createShareLink$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
