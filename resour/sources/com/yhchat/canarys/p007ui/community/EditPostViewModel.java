package com.yhchat.canarys.p007ui.community;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.EditPostResponse;
import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: EditPostViewModel.kt */
@Metadata(m168d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0014J\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/EditPostViewModel;", "Landroidx/lifecycle/ViewModel;", "communityRepository", "Lcom/yhchat/canarys/data/repository/CommunityRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/CommunityRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "_editPostState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/community/EditPostState;", "editPostState", "Lkotlinx/coroutines/flow/StateFlow;", "getEditPostState", "()Lkotlinx/coroutines/flow/StateFlow;", "editPost", "", "token", "", "postId", "", "title", "content", "contentType", "clearError", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class EditPostViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<EditPostState> _editPostState;
    private final CommunityRepository communityRepository;
    private final StateFlow<EditPostState> editPostState;
    private final TokenRepository tokenRepository;

    public EditPostViewModel(CommunityRepository communityRepository, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(communityRepository, "communityRepository");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.communityRepository = communityRepository;
        this.tokenRepository = tokenRepository;
        this._editPostState = StateFlowKt.MutableStateFlow(new EditPostState(false, null, false, 7, null));
        this.editPostState = FlowKt.asStateFlow(this._editPostState);
    }

    public final StateFlow<EditPostState> getEditPostState() {
        return this.editPostState;
    }

    /* compiled from: EditPostViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.EditPostViewModel$editPost$1", m185f = "EditPostViewModel.kt", m186i = {}, m187l = {41}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.EditPostViewModel$editPost$1 */
    static final class C34961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $content;
        final /* synthetic */ int $contentType;
        final /* synthetic */ int $postId;
        final /* synthetic */ String $title;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C34961(String str, int i, String str2, String str3, int i2, Continuation<? super C34961> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$postId = i;
            this.$title = str2;
            this.$content = str3;
            this.$contentType = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return EditPostViewModel.this.new C34961(this.$token, this.$postId, this.$title, this.$content, this.$contentType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objEditPost;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        EditPostViewModel.this._editPostState.setValue(((EditPostState) EditPostViewModel.this._editPostState.getValue()).copy(true, null, false));
                        this.label = 1;
                        objEditPost = EditPostViewModel.this.communityRepository.editPost(this.$token, this.$postId, this.$title, this.$content, this.$contentType, this);
                        if (objEditPost == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objEditPost = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                EditPostResponse response = (EditPostResponse) objEditPost;
                if (response.getCode() != 1) {
                    MutableStateFlow mutableStateFlow = EditPostViewModel.this._editPostState;
                    EditPostState editPostState = (EditPostState) EditPostViewModel.this._editPostState.getValue();
                    String msg = response.getMsg();
                    if (msg == null) {
                        msg = "\u7f16\u8f91\u6587\u7ae0\u5931\u8d25";
                    }
                    mutableStateFlow.setValue(EditPostState.copy$default(editPostState, false, msg, false, 4, null));
                } else {
                    EditPostViewModel.this._editPostState.setValue(EditPostState.copy$default((EditPostState) EditPostViewModel.this._editPostState.getValue(), false, null, true, 2, null));
                }
            } catch (Exception e) {
                MutableStateFlow mutableStateFlow2 = EditPostViewModel.this._editPostState;
                EditPostState editPostState2 = (EditPostState) EditPostViewModel.this._editPostState.getValue();
                String message = e.getMessage();
                if (message == null) {
                    message = "\u7f51\u7edc\u9519\u8bef";
                }
                mutableStateFlow2.setValue(EditPostState.copy$default(editPostState2, false, message, false, 4, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void editPost(String token, int postId, String title, String content, int contentType) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C34961(token, postId, title, content, contentType, null), 3, null);
    }

    public final void clearError() {
        this._editPostState.setValue(EditPostState.copy$default(this._editPostState.getValue(), false, null, false, 5, null));
    }
}
