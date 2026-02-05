package com.yhchat.canarys.p007ui.community;

import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.CommunityPost;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShareToFriendBottomSheet.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1", m185f = "ShareToFriendBottomSheet.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes14.dex */
final class ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ CommunityPost $post;
    final /* synthetic */ MutableState<Set<SelectedContact>> $selectedContacts$delegate;
    final /* synthetic */ PostDetailViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1(Function0<Unit> function0, MutableState<Set<SelectedContact>> mutableState, PostDetailViewModel postDetailViewModel, CommunityPost communityPost, Continuation<? super ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$onDismiss = function0;
        this.$selectedContacts$delegate = mutableState;
        this.$viewModel = postDetailViewModel;
        this.$post = communityPost;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1(this.$onDismiss, this.$selectedContacts$delegate, this.$viewModel, this.$post, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final Ref.IntRef successCount = new Ref.IntRef();
                Iterable<SelectedContact> iterableShareToFriendBottomSheet$lambda$10 = ShareToFriendBottomSheetKt.ShareToFriendBottomSheet$lambda$10(this.$selectedContacts$delegate);
                PostDetailViewModel postDetailViewModel = this.$viewModel;
                CommunityPost communityPost = this.$post;
                for (SelectedContact selectedContact : iterableShareToFriendBottomSheet$lambda$10) {
                    postDetailViewModel.sharePostToFriend(selectedContact.getId(), selectedContact.getType(), communityPost, new Function0() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1.invokeSuspend$lambda$0$0(successCount);
                        }
                    }, new Function1() { // from class: com.yhchat.canarys.ui.community.ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ShareToFriendBottomSheetKt$ShareToFriendBottomSheet$4$1$1$1$1$1.invokeSuspend$lambda$0$1((String) obj);
                        }
                    });
                }
                this.$onDismiss.invoke();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0(Ref.IntRef $successCount) {
        $successCount.element++;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$1(String it) {
        return Unit.INSTANCE;
    }
}
