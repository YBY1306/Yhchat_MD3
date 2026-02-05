package com.yhchat.canarys.data.repository;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupRepository.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupRepository$setDenyMembersUploadToGroupDisk$2", m185f = "GroupRepository.kt", m186i = {0}, m187l = {113}, m188m = "invokeSuspend", m189n = {"$this$withContext"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupRepository$setDenyMembersUploadToGroupDisk$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ boolean $deny;
    final /* synthetic */ String $groupId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ GroupRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupRepository$setDenyMembersUploadToGroupDisk$2(GroupRepository groupRepository, String str, boolean z, Continuation<? super GroupRepository$setDenyMembersUploadToGroupDisk$2> continuation) {
        super(2, continuation);
        this.this$0 = groupRepository;
        this.$groupId = str;
        this.$deny = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GroupRepository$setDenyMembersUploadToGroupDisk$2 groupRepository$setDenyMembersUploadToGroupDisk$2 = new GroupRepository$setDenyMembersUploadToGroupDisk$2(this.this$0, this.$groupId, this.$deny, continuation);
        groupRepository$setDenyMembersUploadToGroupDisk$2.L$0 = obj;
        return groupRepository$setDenyMembersUploadToGroupDisk$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((GroupRepository$setDenyMembersUploadToGroupDisk$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository$setDenyMembersUploadToGroupDisk$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
