package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupTagRepository.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupTagRepository$editGroupTag$2", m185f = "GroupTagRepository.kt", m186i = {1, 1}, m187l = {127, 141}, m188m = "invokeSuspend", m189n = {"token", "request"}, m191s = {"L$0", "L$1"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupTagRepository$editGroupTag$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String $color;
    final /* synthetic */ String $desc;
    final /* synthetic */ String $groupId;
    final /* synthetic */ long $id;
    final /* synthetic */ int $sort;
    final /* synthetic */ String $tag;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ GroupTagRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupTagRepository$editGroupTag$2(GroupTagRepository groupTagRepository, long j, String str, String str2, String str3, String str4, int i, Continuation<? super GroupTagRepository$editGroupTag$2> continuation) {
        super(2, continuation);
        this.this$0 = groupTagRepository;
        this.$id = j;
        this.$groupId = str;
        this.$tag = str2;
        this.$color = str3;
        this.$desc = str4;
        this.$sort = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupTagRepository$editGroupTag$2(this.this$0, this.$id, this.$groupId, this.$tag, this.$color, this.$desc, this.$sort, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((GroupTagRepository$editGroupTag$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:7:0x001a, B:30:0x009a, B:32:0x00a2, B:34:0x00aa, B:36:0x00b0, B:38:0x00c8, B:41:0x00d0, B:42:0x00ff, B:8:0x0020, B:16:0x003e, B:18:0x0045, B:24:0x0051, B:26:0x0069, B:13:0x002c), top: B:48:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:7:0x001a, B:30:0x009a, B:32:0x00a2, B:34:0x00aa, B:36:0x00b0, B:38:0x00c8, B:41:0x00d0, B:42:0x00ff, B:8:0x0020, B:16:0x003e, B:18:0x0045, B:24:0x0051, B:26:0x0069, B:13:0x002c), top: B:48:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:7:0x001a, B:30:0x009a, B:32:0x00a2, B:34:0x00aa, B:36:0x00b0, B:38:0x00c8, B:41:0x00d0, B:42:0x00ff, B:8:0x0020, B:16:0x003e, B:18:0x0045, B:24:0x0051, B:26:0x0069, B:13:0x002c), top: B:48:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ff A[Catch: Exception -> 0x0025, TRY_LEAVE, TryCatch #0 {Exception -> 0x0025, blocks: (B:7:0x001a, B:30:0x009a, B:32:0x00a2, B:34:0x00aa, B:36:0x00b0, B:38:0x00c8, B:41:0x00d0, B:42:0x00ff, B:8:0x0020, B:16:0x003e, B:18:0x0045, B:24:0x0051, B:26:0x0069, B:13:0x002c), top: B:48:0x0007 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupTagRepository$editGroupTag$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
