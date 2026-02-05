package com.yhchat.canarys.p007ui.group;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.FriendRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupInfoScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupInfoScreenKt$GroupInfoContent$11$1$4$1$1$2$1$1", m185f = "GroupInfoScreen.kt", m186i = {0}, m187l = {492}, m188m = "invokeSuspend", m189n = {"friendRepository"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes9.dex */
final class GroupInfoScreenKt$GroupInfoContent$11$1$4$1$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $checked;
    final /* synthetic */ Context $currentContext;
    final /* synthetic */ String $currentGroupId;
    final /* synthetic */ MutableState<Boolean> $isNoNotify$delegate;
    final /* synthetic */ MutableState<Boolean> $isSettingNoNotify$delegate;
    final /* synthetic */ Function0<Unit> $onRefresh;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupInfoScreenKt$GroupInfoContent$11$1$4$1$1$2$1$1(Context context, String str, boolean z, Function0<Unit> function0, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super GroupInfoScreenKt$GroupInfoContent$11$1$4$1$1$2$1$1> continuation) {
        super(2, continuation);
        this.$currentContext = context;
        this.$currentGroupId = str;
        this.$checked = z;
        this.$onRefresh = function0;
        this.$isNoNotify$delegate = mutableState;
        this.$isSettingNoNotify$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupInfoScreenKt$GroupInfoContent$11$1$4$1$1$2$1$1(this.$currentContext, this.$currentGroupId, this.$checked, this.$onRefresh, this.$isNoNotify$delegate, this.$isSettingNoNotify$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupInfoScreenKt$GroupInfoContent$11$1$4$1$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                FriendRepository friendRepository = RepositoryFactory.INSTANCE.getFriendRepository(this.$currentContext);
                String str = this.$currentGroupId;
                boolean z = this.$checked;
                this.L$0 = SpillingKt.nullOutSpilledVariable(friendRepository);
                this.label = 1;
                Object objM8563setNoNotify0E7RQCE = friendRepository.m8563setNoNotify0E7RQCE(str, z ? 1 : 0, this);
                if (objM8563setNoNotify0E7RQCE != coroutine_suspended) {
                    value = objM8563setNoNotify0E7RQCE;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure(obj);
                value = ((Result) obj).getValue();
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Context context = this.$currentContext;
        Function0<Unit> function0 = this.$onRefresh;
        boolean z2 = this.$checked;
        Context context2 = this.$currentContext;
        MutableState<Boolean> mutableState = this.$isNoNotify$delegate;
        Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
        if (thM11922exceptionOrNullimpl != null) {
            GroupInfoScreenKt.GroupInfoContent$lambda$11(mutableState, true ^ z2);
            Toast.makeText(context2, "\u8bbe\u7f6e\u5931\u8d25\uff1a" + thM11922exceptionOrNullimpl.getMessage(), 0).show();
        } else {
            Toast.makeText(context, "\u8bbe\u7f6e\u6210\u529f", 0).show();
            function0.invoke();
        }
        GroupInfoScreenKt.GroupInfoContent$lambda$14(this.$isSettingNoNotify$delegate, false);
        return Unit.INSTANCE;
    }
}
