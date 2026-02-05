package com.yhchat.canarys.p007ui.components;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;
import com.yhchat.canarys.data.repository.UserRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GroupMenuBottomSheet.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.components.GroupMenuBottomSheetKt$GroupMenuBottomSheet$9$1$1", m185f = "GroupMenuBottomSheet.kt", m186i = {}, m187l = {239}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes5.dex */
final class GroupMenuBottomSheetKt$GroupMenuBottomSheet$9$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ String $groupId;
    final /* synthetic */ UserRepository $userRepository;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GroupMenuBottomSheetKt$GroupMenuBottomSheet$9$1$1(UserRepository userRepository, String str, Context context, Continuation<? super GroupMenuBottomSheetKt$GroupMenuBottomSheet$9$1$1> continuation) {
        super(2, continuation);
        this.$userRepository = userRepository;
        this.$groupId = str;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GroupMenuBottomSheetKt$GroupMenuBottomSheet$9$1$1(this.$userRepository, this.$groupId, this.$context, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GroupMenuBottomSheetKt$GroupMenuBottomSheet$9$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                Object objM8640deleteFriend0E7RQCE = this.$userRepository.m8640deleteFriend0E7RQCE(this.$groupId, 2, this);
                if (objM8640deleteFriend0E7RQCE != coroutine_suspended) {
                    value = objM8640deleteFriend0E7RQCE;
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                value = ((Result) $result).getValue();
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Context context = this.$context;
        Context context2 = this.$context;
        Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
        if (thM11922exceptionOrNullimpl == null) {
            ((Boolean) value).booleanValue();
            Toast.makeText(context, "\u5df2\u9000\u51fa\u7fa4\u804a", 0).show();
            if (context instanceof Activity) {
                ((Activity) context).finish();
            }
        } else {
            Toast.makeText(context2, "\u9000\u51fa\u7fa4\u804a\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), 0).show();
        }
        return Unit.INSTANCE;
    }
}
