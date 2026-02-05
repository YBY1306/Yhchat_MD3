package com.yhchat.canarys.p007ui.search;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.model.SearchData;
import com.yhchat.canarys.data.repository.ConversationRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: SearchViewModel.kt */
@Metadata(m168d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u000fJ\u0006\u0010#\u001a\u00020\u000fJ\u0016\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!J\u0006\u0010'\u001a\u00020\u000fJ\u001e\u0010(\u001a\u00020)2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!H\u0086@\u00a2\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020!2\u0006\u0010&\u001a\u00020!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016\u00a8\u0006,"}, m169d2 = {"Lcom/yhchat/canarys/ui/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "friendRepository", "Lcom/yhchat/canarys/data/repository/FriendRepository;", "conversationRepository", "Lcom/yhchat/canarys/data/repository/ConversationRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/data/repository/FriendRepository;Lcom/yhchat/canarys/data/repository/ConversationRepository;)V", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "setTokenRepository", "", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/search/SearchUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_searchResult", "Lcom/yhchat/canarys/data/model/SearchData;", "searchResult", "getSearchResult", "_joinRequestState", "Lcom/yhchat/canarys/ui/search/JoinRequestState;", "joinRequestState", "getJoinRequestState", "search", "word", "", "clearSearch", "clearError", "applyToJoinGroup", "token", "groupId", "resetJoinRequestState", "checkGroupInConversations", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "handleGroupJoin", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class SearchViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<JoinRequestState> _joinRequestState;
    private final MutableStateFlow<SearchData> _searchResult;
    private final MutableStateFlow<SearchUiState> _uiState;
    private final ApiService apiService;
    private final ConversationRepository conversationRepository;
    private final FriendRepository friendRepository;
    private final StateFlow<JoinRequestState> joinRequestState;
    private final StateFlow<SearchData> searchResult;
    private final TokenRepository tokenRepository;
    private final StateFlow<SearchUiState> uiState;
    private final UserRepository userRepository;

    /* compiled from: SearchViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.search.SearchViewModel", m185f = "SearchViewModel.kt", m186i = {0, 0}, m187l = {159}, m188m = "checkGroupInConversations", m189n = {"token", "groupId"}, m191s = {"L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.search.SearchViewModel$checkGroupInConversations$1 */
    static final class C41091 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C41091(Continuation<? super C41091> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SearchViewModel.this.checkGroupInConversations(null, null, this);
        }
    }

    public SearchViewModel(ApiService apiService, TokenRepository tokenRepository, FriendRepository friendRepository, ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
        this.friendRepository = friendRepository;
        this.conversationRepository = conversationRepository;
        this.userRepository = new UserRepository(this.apiService, null);
        this.userRepository.setTokenRepository(this.tokenRepository);
        this._uiState = StateFlowKt.MutableStateFlow(new SearchUiState(false, null, 3, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._searchResult = StateFlowKt.MutableStateFlow(null);
        this.searchResult = FlowKt.asStateFlow(this._searchResult);
        this._joinRequestState = StateFlowKt.MutableStateFlow(new JoinRequestState(false, false, null, false, false, 31, null));
        this.joinRequestState = FlowKt.asStateFlow(this._joinRequestState);
    }

    public /* synthetic */ SearchViewModel(ApiService apiService, TokenRepository tokenRepository, FriendRepository friendRepository, ConversationRepository conversationRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiService, tokenRepository, (i & 4) != 0 ? null : friendRepository, (i & 8) != 0 ? null : conversationRepository);
    }

    public final void setTokenRepository(TokenRepository tokenRepository) {
        if (tokenRepository != null) {
            this.userRepository.setTokenRepository(tokenRepository);
        }
    }

    public final StateFlow<SearchUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<SearchData> getSearchResult() {
        return this.searchResult;
    }

    public final StateFlow<JoinRequestState> getJoinRequestState() {
        return this.joinRequestState;
    }

    public final void search(String word) {
        Intrinsics.checkNotNullParameter(word, "word");
        if (!StringsKt.isBlank(word)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C41111(word, null), 3, null);
        } else {
            this._searchResult.setValue(null);
            this._uiState.setValue(SearchUiState.copy$default(this._uiState.getValue(), false, "\u8bf7\u8f93\u5165\u641c\u7d22\u5173\u952e\u8bcd", 1, null));
        }
    }

    /* compiled from: SearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.search.SearchViewModel$search$1", m185f = "SearchViewModel.kt", m186i = {}, m187l = {78}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.search.SearchViewModel$search$1 */
    static final class C41111 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $word;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41111(String str, Continuation<? super C41111> continuation) {
            super(2, continuation);
            this.$word = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchViewModel.this.new C41111(this.$word, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C41111) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    SearchViewModel.this._uiState.setValue(((SearchUiState) SearchViewModel.this._uiState.getValue()).copy(true, null));
                    this.label = 1;
                    Object objM8658homeSearchgIAlus = SearchViewModel.this.userRepository.m8658homeSearchgIAlus(this.$word, this);
                    if (objM8658homeSearchgIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8658homeSearchgIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SearchViewModel searchViewModel = SearchViewModel.this;
            if (Result.m11926isSuccessimpl(value)) {
                searchViewModel._searchResult.setValue((SearchData) value);
                searchViewModel._uiState.setValue(SearchUiState.copy$default((SearchUiState) searchViewModel._uiState.getValue(), false, null, 2, null));
            }
            SearchViewModel searchViewModel2 = SearchViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl != null) {
                searchViewModel2._searchResult.setValue(null);
                searchViewModel2._uiState.setValue(((SearchUiState) searchViewModel2._uiState.getValue()).copy(false, "\u641c\u7d22\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage()));
            }
            return Unit.INSTANCE;
        }
    }

    public final void clearSearch() {
        this._searchResult.setValue(null);
        this._uiState.setValue(SearchUiState.copy$default(this._uiState.getValue(), false, null, 1, null));
    }

    public final void clearError() {
        this._uiState.setValue(SearchUiState.copy$default(this._uiState.getValue(), false, null, 1, null));
    }

    /* compiled from: SearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.search.SearchViewModel$applyToJoinGroup$1", m185f = "SearchViewModel.kt", m186i = {}, m187l = {120}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.search.SearchViewModel$applyToJoinGroup$1 */
    static final class C41081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41081(String str, String str2, Continuation<? super C41081> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$groupId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchViewModel.this.new C41081(this.$token, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C41081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:6:0x0012, B:16:0x005f, B:20:0x0066, B:25:0x0070, B:26:0x0095, B:28:0x00aa, B:31:0x00b2, B:11:0x001e, B:13:0x004b), top: B:36:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0070 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:6:0x0012, B:16:0x005f, B:20:0x0066, B:25:0x0070, B:26:0x0095, B:28:0x00aa, B:31:0x00b2, B:11:0x001e, B:13:0x004b), top: B:36:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0095 A[Catch: Exception -> 0x0017, TryCatch #0 {Exception -> 0x0017, blocks: (B:6:0x0012, B:16:0x005f, B:20:0x0066, B:25:0x0070, B:26:0x0095, B:28:0x00aa, B:31:0x00b2, B:11:0x001e, B:13:0x004b), top: B:36:0x0007 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.SearchViewModel.C41081.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void applyToJoinGroup(String token, String groupId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C41081(token, groupId, null), 3, null);
    }

    public final void resetJoinRequestState() {
        this._joinRequestState.setValue(new JoinRequestState(false, false, null, false, false, 31, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007c A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:13:0x003f, B:26:0x006c, B:31:0x007c, B:36:0x008b, B:40:0x0097, B:42:0x009b, B:43:0x009f, B:45:0x00a7, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00ce), top: B:70:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b A[Catch: Exception -> 0x004a, TryCatch #0 {Exception -> 0x004a, blocks: (B:13:0x003f, B:26:0x006c, B:31:0x007c, B:36:0x008b, B:40:0x0097, B:42:0x009b, B:43:0x009f, B:45:0x00a7, B:48:0x00b2, B:49:0x00b6, B:51:0x00bc, B:53:0x00ce), top: B:70:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object checkGroupInConversations(java.lang.String r17, java.lang.String r18, kotlin.coroutines.Continuation<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.SearchViewModel.checkGroupInConversations(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: SearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.search.SearchViewModel$handleGroupJoin$1", m185f = "SearchViewModel.kt", m186i = {}, m187l = {184}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.search.SearchViewModel$handleGroupJoin$1 */
    static final class C41101 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $token;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41101(String str, String str2, Continuation<? super C41101> continuation) {
            super(2, continuation);
            this.$token = str;
            this.$groupId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchViewModel.this.new C41101(this.$token, this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C41101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object objCheckGroupInConversations;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        SearchViewModel.this._joinRequestState.setValue(JoinRequestState.copy$default((JoinRequestState) SearchViewModel.this._joinRequestState.getValue(), false, false, null, true, false, 19, null));
                        this.label = 1;
                        objCheckGroupInConversations = SearchViewModel.this.checkGroupInConversations(this.$token, this.$groupId, this);
                        if (objCheckGroupInConversations == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objCheckGroupInConversations = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean isInConversations = ((Boolean) objCheckGroupInConversations).booleanValue();
                if (isInConversations) {
                    SearchViewModel.this._joinRequestState.setValue(JoinRequestState.copy$default((JoinRequestState) SearchViewModel.this._joinRequestState.getValue(), false, false, null, false, true, 7, null));
                } else {
                    SearchViewModel.this.applyToJoinGroup(this.$token, this.$groupId);
                }
            } catch (Exception e) {
                SearchViewModel.this._joinRequestState.setValue(JoinRequestState.copy$default((JoinRequestState) SearchViewModel.this._joinRequestState.getValue(), false, false, "\u68c0\u67e5\u5931\u8d25: " + e.getMessage(), false, false, 19, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void handleGroupJoin(String token, String groupId) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C41101(token, groupId, null), 3, null);
    }
}
