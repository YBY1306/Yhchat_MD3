package com.yhchat.canarys.p007ui.community;

import androidx.core.view.MotionEventCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.SearchResponse;
import com.yhchat.canarys.data.model.CommunityBoard;
import com.yhchat.canarys.data.model.CommunityPost;
import com.yhchat.canarys.data.repository.CommunityRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: SearchViewModel.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/ui/community/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "communityRepository", "Lcom/yhchat/canarys/data/repository/CommunityRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/CommunityRepository;)V", "_searchState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/community/SearchState;", "searchState", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchState", "()Lkotlinx/coroutines/flow/StateFlow;", "search", "", "token", "", "keyword", "clearResults", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes14.dex */
public final class SearchViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<SearchState> _searchState;
    private final CommunityRepository communityRepository;
    private final StateFlow<SearchState> searchState;

    public SearchViewModel(CommunityRepository communityRepository) {
        Intrinsics.checkNotNullParameter(communityRepository, "communityRepository");
        this.communityRepository = communityRepository;
        this._searchState = StateFlowKt.MutableStateFlow(new SearchState(null, null, false, null, null, 31, null));
        this.searchState = FlowKt.asStateFlow(this._searchState);
    }

    public final StateFlow<SearchState> getSearchState() {
        return this.searchState;
    }

    /* compiled from: SearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.community.SearchViewModel$search$1", m185f = "SearchViewModel.kt", m186i = {}, m187l = {MotionEventCompat.AXIS_GENERIC_15}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.community.SearchViewModel$search$1 */
    static final class C35631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $keyword;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C35631(String str, String str2, Continuation<? super C35631> continuation) {
            super(2, continuation);
            this.$keyword = str;
            this.$token = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchViewModel.this.new C35631(this.$keyword, this.$token, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objSearchCommunity;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        SearchViewModel.this._searchState.setValue(SearchState.copy$default((SearchState) SearchViewModel.this._searchState.getValue(), null, null, true, null, this.$keyword, 3, null));
                        this.label = 1;
                        objSearchCommunity = SearchViewModel.this.communityRepository.searchCommunity(this.$token, this.$keyword, 3, 100, 1, this);
                        if (objSearchCommunity == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objSearchCommunity = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SearchResponse response = (SearchResponse) objSearchCommunity;
                if (response.getCode() == 1) {
                    MutableStateFlow mutableStateFlow = SearchViewModel.this._searchState;
                    SearchState searchState = (SearchState) SearchViewModel.this._searchState.getValue();
                    List<CommunityBoard> boards = response.getData().getBoards();
                    if (boards == null) {
                        boards = CollectionsKt.emptyList();
                    }
                    List<CommunityBoard> list = boards;
                    List<CommunityPost> posts = response.getData().getPosts();
                    if (posts == null) {
                        posts = CollectionsKt.emptyList();
                    }
                    mutableStateFlow.setValue(SearchState.copy$default(searchState, list, posts, false, null, null, 24, null));
                } else {
                    SearchViewModel.this._searchState.setValue(SearchState.copy$default((SearchState) SearchViewModel.this._searchState.getValue(), null, null, false, response.getMsg(), null, 19, null));
                }
            } catch (Exception e) {
                SearchViewModel.this._searchState.setValue(SearchState.copy$default((SearchState) SearchViewModel.this._searchState.getValue(), null, null, false, "\u641c\u7d22\u5931\u8d25: " + e.getMessage(), null, 19, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void search(String token, String keyword) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35631(keyword, token, null), 3, null);
    }

    public final void clearResults() {
        this._searchState.setValue(new SearchState(null, null, false, null, null, 31, null));
    }
}
