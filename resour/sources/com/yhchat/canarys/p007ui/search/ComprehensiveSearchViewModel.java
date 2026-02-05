package com.yhchat.canarys.p007ui.search;

import android.app.Application;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.WebApiService;
import com.yhchat.canarys.data.model.BotInfo;
import com.yhchat.canarys.data.model.BotInfoResponse;
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.model.GroupInfoResponse;
import com.yhchat.canarys.data.model.UserInfo;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
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
import retrofit2.Response;

/* compiled from: ComprehensiveSearchViewModel.kt */
@Metadata(m168d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0016J\u000e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\u0014J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020\u0014J\u000e\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020(J\u0006\u0010)\u001a\u00020\u0014J\u0006\u0010*\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006+"}, m169d2 = {"Lcom/yhchat/canarys/ui/search/ComprehensiveSearchViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "webApiService", "Lcom/yhchat/canarys/data/api/WebApiService;", "friendRepository", "Lcom/yhchat/canarys/data/repository/FriendRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/search/ComprehensiveSearchUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "searchGroup", "", "groupId", "", "searchUser", "userId", "searchBot", "botId", "addGroup", "addUser", "addBot", "showGroupDialog", "group", "Lcom/yhchat/canarys/data/model/GroupDetail;", "hideGroupDialog", "showUserDialog", "user", "Lcom/yhchat/canarys/data/model/UserInfo;", "hideUserDialog", "showBotDialog", "bot", "Lcom/yhchat/canarys/data/model/BotInfo;", "hideBotDialog", "clearResults", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class ComprehensiveSearchViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<ComprehensiveSearchUiState> _uiState;
    private final FriendRepository friendRepository;
    private final TokenRepository tokenRepository;
    private final StateFlow<ComprehensiveSearchUiState> uiState;
    private final WebApiService webApiService;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComprehensiveSearchViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.webApiService = RepositoryFactory.INSTANCE.getWebApiService();
        this.friendRepository = RepositoryFactory.INSTANCE.getFriendRepository(application);
        this.tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(application);
        this._uiState = StateFlowKt.MutableStateFlow(new ComprehensiveSearchUiState(false, false, null, null, null, null, false, false, false, 511, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
    }

    public final StateFlow<ComprehensiveSearchUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: ComprehensiveSearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$searchGroup$1", m185f = "ComprehensiveSearchViewModel.kt", m186i = {}, m187l = {28}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$searchGroup$1 */
    static final class C41011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41011(String str, Continuation<? super C41011> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComprehensiveSearchViewModel.this.new C41011(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C41011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object groupInfo;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        ComprehensiveSearchViewModel.this._uiState.setValue(ComprehensiveSearchUiState.copy$default((ComprehensiveSearchUiState) ComprehensiveSearchViewModel.this._uiState.getValue(), true, false, null, null, null, null, false, false, false, 506, null));
                        this.label = 1;
                        groupInfo = ComprehensiveSearchViewModel.this.webApiService.getGroupInfo(MapsKt.mapOf(TuplesKt.m176to("groupId", this.$groupId)), this);
                        if (groupInfo == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        groupInfo = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Response response = (Response) groupInfo;
                GroupInfoResponse responseBody = (GroupInfoResponse) response.body();
                if (responseBody != null) {
                    MutableStateFlow mutableStateFlow = ComprehensiveSearchViewModel.this._uiState;
                    ComprehensiveSearchUiState comprehensiveSearchUiState = (ComprehensiveSearchUiState) ComprehensiveSearchViewModel.this._uiState.getValue();
                    String groupId = responseBody.getData().getGroup().getGroupId();
                    String name = responseBody.getData().getGroup().getName();
                    String avatarUrl = responseBody.getData().getGroup().getAvatarUrl();
                    String introduction = responseBody.getData().getGroup().getIntroduction();
                    int headcount = responseBody.getData().getGroup().getHeadcount();
                    String createBy = responseBody.getData().getGroup().getCreateBy();
                    boolean z2 = false;
                    if (responseBody.getData().getGroup().getReadHistory() == 1) {
                        z = false;
                        z2 = true;
                    } else {
                        z = false;
                    }
                    mutableStateFlow.setValue(ComprehensiveSearchUiState.copy$default(comprehensiveSearchUiState, false, false, null, new GroupDetail(groupId, name, avatarUrl, introduction, headcount, createBy, z2, 0, responseBody.getData().getGroup().getReadHistory() == 1 ? true : z, "", 0L, false, false, false, false, 0L, "", false, CollectionsKt.emptyList(), responseBody.getData().getGroup().getCreateBy(), "", Boxing.boxLong(responseBody.getData().getGroup().getAvatarId()), null, null, null, 0L, 58720256, null), null, null, false, false, false, 498, null));
                } else {
                    ComprehensiveSearchViewModel.this._uiState.setValue(ComprehensiveSearchUiState.copy$default((ComprehensiveSearchUiState) ComprehensiveSearchViewModel.this._uiState.getValue(), false, false, "\u54cd\u5e94\u6570\u636e\u4e3a\u7a7a", null, null, null, false, false, false, 506, null));
                }
            } catch (Exception e) {
                MutableStateFlow mutableStateFlow2 = ComprehensiveSearchViewModel.this._uiState;
                ComprehensiveSearchUiState comprehensiveSearchUiState2 = (ComprehensiveSearchUiState) ComprehensiveSearchViewModel.this._uiState.getValue();
                String message = e.getMessage();
                if (message == null) {
                    message = "\u7f51\u7edc\u9519\u8bef";
                }
                mutableStateFlow2.setValue(ComprehensiveSearchUiState.copy$default(comprehensiveSearchUiState2, false, false, message, null, null, null, false, false, false, 506, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void searchGroup(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C41011(groupId, null), 3, null);
    }

    /* compiled from: ComprehensiveSearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$searchUser$1", m185f = "ComprehensiveSearchViewModel.kt", m186i = {}, m187l = {80}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$searchUser$1 */
    static final class C41021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41021(String str, Continuation<? super C41021> continuation) {
            super(2, continuation);
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComprehensiveSearchViewModel.this.new C41021(this.$userId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C41021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00e8 A[Catch: Exception -> 0x001a, TryCatch #0 {Exception -> 0x001a, blocks: (B:6:0x0014, B:14:0x005c, B:16:0x0064, B:18:0x006d, B:23:0x0077, B:24:0x00e8, B:26:0x0105, B:29:0x010d, B:11:0x0048), top: B:37:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 348
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.ComprehensiveSearchViewModel.C41021.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void searchUser(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C41021(userId, null), 3, null);
    }

    /* compiled from: ComprehensiveSearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$searchBot$1", m185f = "ComprehensiveSearchViewModel.kt", m186i = {}, m187l = {120}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$searchBot$1 */
    static final class C41001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C41001(String str, Continuation<? super C41001> continuation) {
            super(2, continuation);
            this.$botId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComprehensiveSearchViewModel.this.new C41001(this.$botId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C41001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object botInfo;
            String msg;
            String msg2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean z = true;
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        ComprehensiveSearchViewModel.this._uiState.setValue(ComprehensiveSearchUiState.copy$default((ComprehensiveSearchUiState) ComprehensiveSearchViewModel.this._uiState.getValue(), true, false, null, null, null, null, false, false, false, 506, null));
                        this.label = 1;
                        botInfo = ComprehensiveSearchViewModel.this.webApiService.getBotInfo(MapsKt.mapOf(TuplesKt.m176to("botId", this.$botId)), this);
                        if (botInfo == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        botInfo = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Response response = (Response) botInfo;
                if (response.isSuccessful()) {
                    BotInfoResponse responseBody = (BotInfoResponse) response.body();
                    if (responseBody == null || responseBody.getCode() != 1) {
                        z = false;
                    }
                    if (z) {
                        BotInfo botData = responseBody.getData().getBot();
                        BotInfo botInfo2 = new BotInfo(botData.getId(), botData.getBotId(), botData.getNickname(), botData.getNicknameId(), botData.getAvatarId(), botData.getAvatarUrl(), botData.getIntroduction(), botData.getCreateBy(), botData.getCreateTime(), botData.getHeadcount(), botData.isPrivate());
                        ComprehensiveSearchViewModel.this._uiState.setValue(ComprehensiveSearchUiState.copy$default((ComprehensiveSearchUiState) ComprehensiveSearchViewModel.this._uiState.getValue(), false, false, null, null, null, botInfo2, false, false, false, 474, null));
                    } else {
                        ComprehensiveSearchViewModel.this._uiState.setValue(ComprehensiveSearchUiState.copy$default((ComprehensiveSearchUiState) ComprehensiveSearchViewModel.this._uiState.getValue(), false, false, (responseBody == null || (msg2 = responseBody.getMsg()) == null) ? "\u83b7\u53d6\u673a\u5668\u4eba\u4fe1\u606f\u5931\u8d25" : msg2, null, null, null, false, false, false, 506, null));
                    }
                } else {
                    MutableStateFlow mutableStateFlow = ComprehensiveSearchViewModel.this._uiState;
                    ComprehensiveSearchUiState comprehensiveSearchUiState = (ComprehensiveSearchUiState) ComprehensiveSearchViewModel.this._uiState.getValue();
                    BotInfoResponse botInfoResponse = (BotInfoResponse) response.body();
                    mutableStateFlow.setValue(ComprehensiveSearchUiState.copy$default(comprehensiveSearchUiState, false, false, (botInfoResponse == null || (msg = botInfoResponse.getMsg()) == null) ? "\u83b7\u53d6\u673a\u5668\u4eba\u4fe1\u606f\u5931\u8d25" : msg, null, null, null, false, false, false, 506, null));
                }
            } catch (Exception e) {
                MutableStateFlow mutableStateFlow2 = ComprehensiveSearchViewModel.this._uiState;
                ComprehensiveSearchUiState comprehensiveSearchUiState2 = (ComprehensiveSearchUiState) ComprehensiveSearchViewModel.this._uiState.getValue();
                String message = e.getMessage();
                if (message == null) {
                    message = "\u7f51\u7edc\u9519\u8bef";
                }
                mutableStateFlow2.setValue(ComprehensiveSearchUiState.copy$default(comprehensiveSearchUiState2, false, false, message, null, null, null, false, false, false, 506, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void searchBot(String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C41001(botId, null), 3, null);
    }

    /* compiled from: ComprehensiveSearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$addGroup$1", m185f = "ComprehensiveSearchViewModel.kt", m186i = {1}, m187l = {171, 172}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$addGroup$1 */
    static final class C40981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40981(String str, Continuation<? super C40981> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComprehensiveSearchViewModel.this.new C40981(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0092 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0018, B:23:0x008a, B:25:0x0092, B:26:0x00be, B:8:0x001e, B:16:0x0064, B:19:0x006a, B:13:0x0052), top: B:34:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be A[Catch: Exception -> 0x0024, TRY_LEAVE, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0018, B:23:0x008a, B:25:0x0092, B:26:0x00be, B:8:0x001e, B:16:0x0064, B:19:0x006a, B:13:0x0052), top: B:34:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.ComprehensiveSearchViewModel.C40981.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void addGroup(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40981(groupId, null), 3, null);
    }

    /* compiled from: ComprehensiveSearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$addUser$1", m185f = "ComprehensiveSearchViewModel.kt", m186i = {1}, m187l = {ComposerKt.providerKey, ComposerKt.compositionLocalMapKey}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$addUser$1 */
    static final class C40991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40991(String str, Continuation<? super C40991> continuation) {
            super(2, continuation);
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComprehensiveSearchViewModel.this.new C40991(this.$userId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0092 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0018, B:23:0x008a, B:25:0x0092, B:26:0x00be, B:8:0x001e, B:16:0x0064, B:19:0x006a, B:13:0x0052), top: B:34:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be A[Catch: Exception -> 0x0024, TRY_LEAVE, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0018, B:23:0x008a, B:25:0x0092, B:26:0x00be, B:8:0x001e, B:16:0x0064, B:19:0x006a, B:13:0x0052), top: B:34:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.ComprehensiveSearchViewModel.C40991.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void addUser(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40991(userId, null), 3, null);
    }

    /* compiled from: ComprehensiveSearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$addBot$1", m185f = "ComprehensiveSearchViewModel.kt", m186i = {1}, m187l = {231, 232}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.search.ComprehensiveSearchViewModel$addBot$1 */
    static final class C40971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40971(String str, Continuation<? super C40971> continuation) {
            super(2, continuation);
            this.$botId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ComprehensiveSearchViewModel.this.new C40971(this.$botId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0088 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0092 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0018, B:23:0x008a, B:25:0x0092, B:26:0x00be, B:8:0x001e, B:16:0x0064, B:19:0x006a, B:13:0x0052), top: B:34:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00be A[Catch: Exception -> 0x0024, TRY_LEAVE, TryCatch #0 {Exception -> 0x0024, blocks: (B:7:0x0018, B:23:0x008a, B:25:0x0092, B:26:0x00be, B:8:0x001e, B:16:0x0064, B:19:0x006a, B:13:0x0052), top: B:34:0x0009 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.search.ComprehensiveSearchViewModel.C40971.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void addBot(String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40971(botId, null), 3, null);
    }

    public final void showGroupDialog(GroupDetail group) {
        Intrinsics.checkNotNullParameter(group, "group");
        this._uiState.setValue(ComprehensiveSearchUiState.copy$default(this._uiState.getValue(), false, false, null, null, null, null, true, false, false, 447, null));
    }

    public final void hideGroupDialog() {
        this._uiState.setValue(ComprehensiveSearchUiState.copy$default(this._uiState.getValue(), false, false, null, null, null, null, false, false, false, 447, null));
    }

    public final void showUserDialog(UserInfo user) {
        Intrinsics.checkNotNullParameter(user, "user");
        this._uiState.setValue(ComprehensiveSearchUiState.copy$default(this._uiState.getValue(), false, false, null, null, null, null, false, true, false, 383, null));
    }

    public final void hideUserDialog() {
        this._uiState.setValue(ComprehensiveSearchUiState.copy$default(this._uiState.getValue(), false, false, null, null, null, null, false, false, false, 383, null));
    }

    public final void showBotDialog(BotInfo bot) {
        Intrinsics.checkNotNullParameter(bot, "bot");
        this._uiState.setValue(ComprehensiveSearchUiState.copy$default(this._uiState.getValue(), false, false, null, null, null, null, false, false, true, 255, null));
    }

    public final void hideBotDialog() {
        this._uiState.setValue(ComprehensiveSearchUiState.copy$default(this._uiState.getValue(), false, false, null, null, null, null, false, false, false, 255, null));
    }

    public final void clearResults() {
        this._uiState.setValue(ComprehensiveSearchUiState.copy$default(this._uiState.getValue(), false, false, null, null, null, null, false, false, false, 451, null));
    }
}
