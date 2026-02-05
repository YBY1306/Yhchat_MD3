package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.model.GroupMemberInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupRepository.kt */
@Metadata(m168d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lcom/yhchat/canarys/data/model/GroupMemberInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupRepository$getGroupMembers$2", m185f = "GroupRepository.kt", m186i = {}, m187l = {374}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupRepository$getGroupMembers$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends List<? extends GroupMemberInfo>>>, Object> {
    final /* synthetic */ String $groupId;
    final /* synthetic */ String $keywords;
    final /* synthetic */ int $page;
    final /* synthetic */ int $size;
    int label;
    final /* synthetic */ GroupRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupRepository$getGroupMembers$2(GroupRepository groupRepository, String str, int i, int i2, String str2, Continuation<? super GroupRepository$getGroupMembers$2> continuation) {
        super(2, continuation);
        this.this$0 = groupRepository;
        this.$groupId = str;
        this.$size = i;
        this.$page = i2;
        this.$keywords = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupRepository$getGroupMembers$2(this.this$0, this.$groupId, this.$size, this.$page, this.$keywords, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<? extends GroupMemberInfo>>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<? extends List<GroupMemberInfo>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<? extends List<GroupMemberInfo>>> continuation) {
        return ((GroupRepository$getGroupMembers$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f A[Catch: Exception -> 0x0099, IOException -> 0x009e, InvalidProtocolBufferException -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #5 {InvalidProtocolBufferException -> 0x00a3, IOException -> 0x009e, Exception -> 0x0099, blocks: (B:30:0x0093, B:40:0x010f, B:49:0x015c), top: B:87:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013c A[Catch: Exception -> 0x0262, IOException -> 0x0281, InvalidProtocolBufferException -> 0x02a0, TRY_ENTER, TryCatch #4 {InvalidProtocolBufferException -> 0x02a0, IOException -> 0x0281, Exception -> 0x0262, blocks: (B:25:0x005f, B:38:0x00a8, B:42:0x013c, B:44:0x0142, B:47:0x014e, B:51:0x017a, B:52:0x0199, B:54:0x019f), top: B:88:0x005f }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository$getGroupMembers$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
