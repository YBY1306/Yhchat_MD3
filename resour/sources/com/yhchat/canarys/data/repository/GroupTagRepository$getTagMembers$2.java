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
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/yhchat/canarys/data/repository/TagMembersData;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupTagRepository$getTagMembers$2", m185f = "GroupTagRepository.kt", m186i = {1, 1, 1}, m187l = {282, 302}, m188m = "invokeSuspend", m189n = {"token", "request", "requestBody"}, m191s = {"L$0", "L$1", "L$2"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupTagRepository$getTagMembers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends TagMembersData>>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ int $page;
    final /* synthetic */ int $size;
    final /* synthetic */ long $tagId;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GroupTagRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupTagRepository$getTagMembers$2(GroupTagRepository groupTagRepository, int i, int i2, String str, long j, Continuation<? super GroupTagRepository$getTagMembers$2> continuation) {
        super(2, continuation);
        this.this$0 = groupTagRepository;
        this.$size = i;
        this.$page = i2;
        this.$groupId = str;
        this.$tagId = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupTagRepository$getTagMembers$2(this.this$0, this.$size, this.$page, this.$groupId, this.$tagId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends TagMembersData>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<TagMembersData>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<TagMembersData>> continuation) {
        return ((GroupTagRepository$getTagMembers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x0020, B:30:0x00e5, B:32:0x00ed, B:34:0x00f5, B:36:0x0107, B:37:0x0126, B:39:0x012c, B:43:0x0175, B:47:0x0189, B:48:0x019c, B:49:0x01e5, B:50:0x021f, B:51:0x0240, B:8:0x0027, B:16:0x0046, B:18:0x004e, B:24:0x005a, B:26:0x0072, B:13:0x0034), top: B:56:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x0020, B:30:0x00e5, B:32:0x00ed, B:34:0x00f5, B:36:0x0107, B:37:0x0126, B:39:0x012c, B:43:0x0175, B:47:0x0189, B:48:0x019c, B:49:0x01e5, B:50:0x021f, B:51:0x0240, B:8:0x0027, B:16:0x0046, B:18:0x004e, B:24:0x005a, B:26:0x0072, B:13:0x0034), top: B:56:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ed A[Catch: Exception -> 0x002d, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x0020, B:30:0x00e5, B:32:0x00ed, B:34:0x00f5, B:36:0x0107, B:37:0x0126, B:39:0x012c, B:43:0x0175, B:47:0x0189, B:48:0x019c, B:49:0x01e5, B:50:0x021f, B:51:0x0240, B:8:0x0027, B:16:0x0046, B:18:0x004e, B:24:0x005a, B:26:0x0072, B:13:0x0034), top: B:56:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0240 A[Catch: Exception -> 0x002d, TRY_LEAVE, TryCatch #0 {Exception -> 0x002d, blocks: (B:7:0x0020, B:30:0x00e5, B:32:0x00ed, B:34:0x00f5, B:36:0x0107, B:37:0x0126, B:39:0x012c, B:43:0x0175, B:47:0x0189, B:48:0x019c, B:49:0x01e5, B:50:0x021f, B:51:0x0240, B:8:0x0027, B:16:0x0046, B:18:0x004e, B:24:0x005a, B:26:0x0072, B:13:0x0034), top: B:56:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupTagRepository$getTagMembers$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
