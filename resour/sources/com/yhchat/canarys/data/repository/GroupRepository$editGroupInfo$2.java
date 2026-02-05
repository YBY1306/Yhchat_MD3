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
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.GroupRepository$editGroupInfo$2", m185f = "GroupRepository.kt", m186i = {}, m187l = {477}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class GroupRepository$editGroupInfo$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Boolean>>, Object> {
    final /* synthetic */ String $avatarUrl;
    final /* synthetic */ long $categoryId;
    final /* synthetic */ String $categoryName;
    final /* synthetic */ boolean $directJoin;
    final /* synthetic */ String $groupId;
    final /* synthetic */ boolean $historyMsg;
    final /* synthetic */ String $introduction;
    final /* synthetic */ boolean $isPrivate;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ GroupRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupRepository$editGroupInfo$2(GroupRepository groupRepository, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, long j, boolean z3, Continuation<? super GroupRepository$editGroupInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = groupRepository;
        this.$groupId = str;
        this.$name = str2;
        this.$introduction = str3;
        this.$avatarUrl = str4;
        this.$directJoin = z;
        this.$historyMsg = z2;
        this.$categoryName = str5;
        this.$categoryId = j;
        this.$isPrivate = z3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupRepository$editGroupInfo$2(this.this$0, this.$groupId, this.$name, this.$introduction, this.$avatarUrl, this.$directJoin, this.$historyMsg, this.$categoryName, this.$categoryId, this.$isPrivate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Boolean>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Boolean>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Boolean>> continuation) {
        return ((GroupRepository$editGroupInfo$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.data.repository.GroupRepository$editGroupInfo$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
