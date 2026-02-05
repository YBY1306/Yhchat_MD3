package com.yhchat.canarys.p007ui.community;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.CreatePostResponse;
import com.yhchat.canarys.data.repository.CommunityRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
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

/* compiled from: CreatePostViewModel.kt */
@Metadata(m168d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J8\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0012J\u0006\u0010\u0019\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/CreatePostViewModel;", "Landroidx/lifecycle/ViewModel;", "communityRepository", "Lcom/yhchat/canarys/data/repository/CommunityRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/CommunityRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "_createPostState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/community/CreatePostState;", "createPostState", "Lkotlinx/coroutines/flow/StateFlow;", "getCreatePostState", "()Lkotlinx/coroutines/flow/StateFlow;", "createPost", "", "token", "", "boardId", "", "title", "content", "contentType", "groupId", "clearError", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class CreatePostViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<CreatePostState> _createPostState;
    private final CommunityRepository communityRepository;
    private final StateFlow<CreatePostState> createPostState;
    private final TokenRepository tokenRepository;

    @Inject
    public CreatePostViewModel(CommunityRepository communityRepository, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(communityRepository, "communityRepository");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.communityRepository = communityRepository;
        this.tokenRepository = tokenRepository;
        this._createPostState = StateFlowKt.MutableStateFlow(new CreatePostState(false, false, null, null, 15, null));
        this.createPostState = FlowKt.asStateFlow(this._createPostState);
    }

    public final StateFlow<CreatePostState> getCreatePostState() {
        return this.createPostState;
    }

    public static /* synthetic */ void createPost$default(CreatePostViewModel createPostViewModel, String str, int i, String str2, String str3, int i2, String str4, int i3, Object obj) {
        String str5;
        if ((i3 & 32) == 0) {
            str5 = str4;
        } else {
            str5 = "";
        }
        createPostViewModel.createPost(str, i, str2, str3, i2, str5);
    }

    /* compiled from: CreatePostViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.CreatePostViewModel$createPost$1", m185f = "CreatePostViewModel.kt", m186i = {}, m187l = {44}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.CreatePostViewModel$createPost$1 */
    static final class C34911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $boardId;
        final /* synthetic */ String $content;
        final /* synthetic */ int $contentType;
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $title;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C34911(String str, int i, String str2, String str3, int i2, String str4, Continuation<? super C34911> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$boardId = i;
            this.$title = str2;
            this.$content = str3;
            this.$contentType = i2;
            this.$groupId = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreatePostViewModel.this.new C34911(this.$token, this.$boardId, this.$title, this.$content, this.$contentType, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C34911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    CreatePostViewModel.this._createPostState.setValue(CreatePostState.copy$default((CreatePostState) CreatePostViewModel.this._createPostState.getValue(), true, false, null, null, 4, null));
                    this.label = 1;
                    Object objM8515createPostbMdYcbs = CreatePostViewModel.this.communityRepository.m8515createPostbMdYcbs(this.$token, this.$boardId, this.$title, this.$content, this.$contentType, this.$groupId, this);
                    if (objM8515createPostbMdYcbs == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8515createPostbMdYcbs;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            CreatePostViewModel createPostViewModel = CreatePostViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                createPostViewModel._createPostState.setValue(new CreatePostState(false, true, Boxing.boxInt(((CreatePostResponse) value).getData().getPostId()), null));
            }
            CreatePostViewModel createPostViewModel2 = CreatePostViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                MutableStateFlow mutableStateFlow = createPostViewModel2._createPostState;
                CreatePostState createPostState = (CreatePostState) createPostViewModel2._createPostState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u53d1\u5e03\u5931\u8d25";
                }
                mutableStateFlow.setValue(CreatePostState.copy$default(createPostState, false, false, null, message, 6, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void createPost(String token, int boardId, String title, String content, int contentType, String groupId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C34911(token, boardId, title, content, contentType, groupId, null), 3, null);
    }

    public final void clearError() {
        this._createPostState.setValue(CreatePostState.copy$default(this._createPostState.getValue(), false, false, null, null, 7, null));
    }
}
