package com.yhchat.canarys.p007ui.community;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.CommunityGroup;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: GroupListActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.GroupListActivityKt$GroupListScreen$4$1", m185f = "GroupListActivity.kt", m186i = {}, m187l = {228}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class GroupListActivityKt$GroupListScreen$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<CommunityGroup> $selectedGroup$delegate;
    final /* synthetic */ GroupListViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupListActivityKt$GroupListScreen$4$1(GroupListViewModel groupListViewModel, MutableState<CommunityGroup> mutableState, Continuation<? super GroupListActivityKt$GroupListScreen$4$1> continuation) {
        super(2, continuation);
        this.$viewModel = groupListViewModel;
        this.$selectedGroup$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupListActivityKt$GroupListScreen$4$1(this.$viewModel, this.$selectedGroup$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupListActivityKt$GroupListScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (GroupListActivityKt.GroupListScreen$lambda$2(this.$selectedGroup$delegate) != null) {
                    this.label = 1;
                    if (this.$viewModel.getJoinRequestState().collect(new C35091(this.$viewModel, this.$selectedGroup$delegate), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    return Unit.INSTANCE;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        throw new KotlinNothingValueException();
    }

    /* compiled from: GroupListActivity.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    /* renamed from: com.yhchat.canarys.ui.community.GroupListActivityKt$GroupListScreen$4$1$1 */
    static final class C35091<T> implements FlowCollector {
        final /* synthetic */ MutableState<CommunityGroup> $selectedGroup$delegate;
        final /* synthetic */ GroupListViewModel $viewModel;

        C35091(GroupListViewModel groupListViewModel, MutableState<CommunityGroup> mutableState) {
            this.$viewModel = groupListViewModel;
            this.$selectedGroup$delegate = mutableState;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(com.yhchat.canarys.p007ui.community.JoinRequestState r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.yhchat.canarys.p007ui.community.GroupListActivityKt$GroupListScreen$4$1$1$emit$1
                if (r0 == 0) goto L14
                r0 = r9
                com.yhchat.canarys.ui.community.GroupListActivityKt$GroupListScreen$4$1$1$emit$1 r0 = (com.yhchat.canarys.p007ui.community.GroupListActivityKt$GroupListScreen$4$1$1$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r1 = r0.label
                int r1 = r1 - r2
                r0.label = r1
                goto L19
            L14:
                com.yhchat.canarys.ui.community.GroupListActivityKt$GroupListScreen$4$1$1$emit$1 r0 = new com.yhchat.canarys.ui.community.GroupListActivityKt$GroupListScreen$4$1$1$emit$1
                r0.<init>(r7, r9)
            L19:
                java.lang.Object r1 = r0.result
                java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r3 = r0.label
                r4 = 0
                switch(r3) {
                    case 0: goto L36;
                    case 1: goto L2d;
                    default: goto L25;
                }
            L25:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L2d:
                java.lang.Object r2 = r0.L$0
                r8 = r2
                com.yhchat.canarys.ui.community.JoinRequestState r8 = (com.yhchat.canarys.p007ui.community.JoinRequestState) r8
                kotlin.ResultKt.throwOnFailure(r1)
                goto L62
            L36:
                kotlin.ResultKt.throwOnFailure(r1)
                boolean r3 = r8.isInConversations()
                if (r3 == 0) goto L4a
                androidx.compose.runtime.MutableState<com.yhchat.canarys.data.model.CommunityGroup> r2 = r7.$selectedGroup$delegate
                com.yhchat.canarys.p007ui.community.GroupListActivityKt.access$GroupListScreen$lambda$3(r2, r4)
                com.yhchat.canarys.ui.community.GroupListViewModel r2 = r7.$viewModel
                r2.resetJoinRequestState()
                goto L6c
            L4a:
                boolean r3 = r8.isSuccess()
                if (r3 == 0) goto L6c
                java.lang.Object r3 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
                r0.L$0 = r3
                r3 = 1
                r0.label = r3
                r5 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r3 = kotlinx.coroutines.DelayKt.delay(r5, r0)
                if (r3 != r2) goto L62
                return r2
            L62:
                androidx.compose.runtime.MutableState<com.yhchat.canarys.data.model.CommunityGroup> r2 = r7.$selectedGroup$delegate
                com.yhchat.canarys.p007ui.community.GroupListActivityKt.access$GroupListScreen$lambda$3(r2, r4)
                com.yhchat.canarys.ui.community.GroupListViewModel r2 = r7.$viewModel
                r2.resetJoinRequestState()
            L6c:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.community.GroupListActivityKt$GroupListScreen$4$1.C35091.emit(com.yhchat.canarys.ui.community.JoinRequestState, kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
            return emit((JoinRequestState) value, (Continuation<? super Unit>) $completion);
        }
    }
}
