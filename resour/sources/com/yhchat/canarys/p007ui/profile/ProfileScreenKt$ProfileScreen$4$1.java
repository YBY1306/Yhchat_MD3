package com.yhchat.canarys.p007ui.profile;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProfileScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.ProfileScreenKt$ProfileScreen$4$1", m185f = "ProfileScreen.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes16.dex */
final class ProfileScreenKt$ProfileScreen$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ State<SaveUserDataState> $saveUserDataState$delegate;
    final /* synthetic */ MutableState<Boolean> $showUserDataDialog$delegate;
    final /* synthetic */ ProfileViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileScreenKt$ProfileScreen$4$1(Context context, ProfileViewModel profileViewModel, State<SaveUserDataState> state, MutableState<Boolean> mutableState, Continuation<? super ProfileScreenKt$ProfileScreen$4$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$viewModel = profileViewModel;
        this.$saveUserDataState$delegate = state;
        this.$showUserDataDialog$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileScreenKt$ProfileScreen$4$1(this.$context, this.$viewModel, this.$saveUserDataState$delegate, this.$showUserDataDialog$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileScreenKt$ProfileScreen$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (ProfileScreenKt.ProfileScreen$lambda$7(this.$saveUserDataState$delegate).isSuccess()) {
                    Toast.makeText(this.$context, "\u4fdd\u5b58\u6210\u529f", 0).show();
                    ProfileScreenKt.ProfileScreen$lambda$19(this.$showUserDataDialog$delegate, false);
                    this.$viewModel.resetSaveUserDataState();
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
