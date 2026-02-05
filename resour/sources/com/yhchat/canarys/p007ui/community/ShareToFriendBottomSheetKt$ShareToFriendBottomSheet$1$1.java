package com.yhchat.canarys.p007ui.community;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.proto.user.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShareToFriendBottomSheet.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$1$1", m185f = "ShareToFriendBottomSheet.kt", m186i = {}, m187l = {51}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<User.address_book_list.Data>> $contacts$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ PostDetailViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$1$1(PostDetailViewModel postDetailViewModel, MutableState<List<User.address_book_list.Data>> mutableState, MutableState<Boolean> mutableState2, Continuation<? super ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$1$1> continuation) {
        super(2, continuation);
        this.$viewModel = postDetailViewModel;
        this.$contacts$delegate = mutableState;
        this.$isLoading$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$1$1(this.$viewModel, this.$contacts$delegate, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object value;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                Object objM10946getAddressBookListIoAF18A = this.$viewModel.m10946getAddressBookListIoAF18A(this);
                if (objM10946getAddressBookListIoAF18A != coroutine_suspended) {
                    value = objM10946getAddressBookListIoAF18A;
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
        MutableState<List<User.address_book_list.Data>> mutableState = this.$contacts$delegate;
        MutableState<Boolean> mutableState2 = this.$isLoading$delegate;
        MutableState<Boolean> mutableState3 = this.$isLoading$delegate;
        if (Result.m11922exceptionOrNullimpl(value) == null) {
            List<User.address_book_list.Data> dataList = ((User.address_book_list) value).getDataList();
            Intrinsics.checkNotNullExpressionValue(dataList, "getDataList(...)");
            mutableState.setValue(dataList);
            ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$8(mutableState2, false);
        } else {
            ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$8(mutableState3, false);
        }
        return Unit.INSTANCE;
    }
}
