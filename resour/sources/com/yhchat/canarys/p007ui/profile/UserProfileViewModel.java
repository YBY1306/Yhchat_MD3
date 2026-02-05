package com.yhchat.canarys.p007ui.profile;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.api.WebApiService;
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.model.GroupMemberInfo;
import com.yhchat.canarys.data.model.UserHomepageInfo;
import com.yhchat.canarys.data.model.UserHomepageResponse;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import java.util.LinkedHashMap;
import java.util.Map;
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
import retrofit2.Response;

/* compiled from: UserProfileViewModel.kt */
@Metadata(m168d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019J\u0016\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u0019J\u0006\u0010#\u001a\u00020\u001fJ\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u0019J\u0006\u0010&\u001a\u00020\u001fJ\u0006\u0010'\u001a\u00020\u001fJ\u0006\u0010(\u001a\u00020\u001fJ\u0016\u0010)\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0019J\u001e\u0010+\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010,\u001a\u00020-J\u001e\u0010.\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00192\u0006\u0010/\u001a\u00020-J\u0016\u00100\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u0019J \u00102\u001a\u00020\u001f2\u0006\u0010*\u001a\u00020\u00192\u0006\u00101\u001a\u00020\u00192\u0006\u00103\u001a\u000204H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0019\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001d0\u001c0\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, m169d2 = {"Lcom/yhchat/canarys/ui/profile/UserProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "webApiService", "Lcom/yhchat/canarys/data/api/WebApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "groupRepository", "Lcom/yhchat/canarys/data/repository/GroupRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/api/WebApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/data/repository/GroupRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/profile/UserProfileUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_userProfile", "Lcom/yhchat/canarys/data/model/UserHomepageInfo;", "userProfile", "getUserProfile", "groupInfoCache", "", "", "Lcom/yhchat/canarys/data/model/GroupDetail;", "groupMembersCache", "", "Lcom/yhchat/canarys/data/model/GroupMemberInfo;", "loadUserProfile", "", "userId", "showAddFriendDialog", "userName", "dismissAddFriendDialog", "updateFriendRemark", "remark", "confirmAddFriend", "clearError", "clearAddFriendSuccess", "removeMemberFromGroup", "groupId", "gagMemberInGroup", "gagTime", "", "setMemberRole", "userLevel", "loadGroupInfoAndMemberInfo", "targetUserId", "loadGroupMembersAndUpdatePermission", "isOwner", "", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final class UserProfileViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<UserProfileUiState> _uiState;
    private final MutableStateFlow<UserHomepageInfo> _userProfile;
    private final ApiService apiService;
    private final Map<String, GroupDetail> groupInfoCache;
    private final Map<String, Map<String, GroupMemberInfo>> groupMembersCache;
    private final GroupRepository groupRepository;
    private final TokenRepository tokenRepository;
    private final StateFlow<UserProfileUiState> uiState;
    private final StateFlow<UserHomepageInfo> userProfile;
    private final WebApiService webApiService;

    @Inject
    public UserProfileViewModel(ApiService apiService, WebApiService webApiService, TokenRepository tokenRepository, GroupRepository groupRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(webApiService, "webApiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(groupRepository, "groupRepository");
        this.apiService = apiService;
        this.webApiService = webApiService;
        this.tokenRepository = tokenRepository;
        this.groupRepository = groupRepository;
        this.groupRepository.setTokenRepository(this.tokenRepository);
        this._uiState = StateFlowKt.MutableStateFlow(new UserProfileUiState(false, null, null, false, false, false, null, 0, false, 511, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._userProfile = StateFlowKt.MutableStateFlow(null);
        this.userProfile = FlowKt.asStateFlow(this._userProfile);
        this.groupInfoCache = new LinkedHashMap();
        this.groupMembersCache = new LinkedHashMap();
    }

    public final StateFlow<UserProfileUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<UserHomepageInfo> getUserProfile() {
        return this.userProfile;
    }

    /* compiled from: UserProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.UserProfileViewModel$loadUserProfile$1", m185f = "UserProfileViewModel.kt", m186i = {}, m187l = {56}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.UserProfileViewModel$loadUserProfile$1 */
    static final class C40841 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40841(String str, Continuation<? super C40841> continuation) {
            super(2, continuation);
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserProfileViewModel.this.new C40841(this.$userId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40841) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object userHomepage;
            String msg;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            boolean z = true;
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        UserProfileViewModel.this._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) UserProfileViewModel.this._uiState.getValue(), true, null, null, false, false, false, null, 0, false, 508, null));
                        System.out.println((Object) ("UserProfileViewModel: \u5f00\u59cb\u52a0\u8f7d\u7528\u6237\u8d44\u6599, userId = " + this.$userId));
                        this.label = 1;
                        userHomepage = UserProfileViewModel.this.webApiService.getUserHomepage(this.$userId, this);
                        if (userHomepage == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        userHomepage = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Response response = (Response) userHomepage;
                System.out.println((Object) ("UserProfileViewModel: API\u54cd\u5e94 - isSuccessful: " + response.isSuccessful() + ", code: " + response.code()));
                if (response.isSuccessful()) {
                    UserHomepageResponse homepageResponse = (UserHomepageResponse) response.body();
                    System.out.println((Object) ("UserProfileViewModel: \u54cd\u5e94\u4f53 - code: " + (homepageResponse != null ? Boxing.boxInt(homepageResponse.getCode()) : null) + ", msg: " + (homepageResponse != null ? homepageResponse.getMsg() : null)));
                    if (homepageResponse == null || homepageResponse.getCode() != 1) {
                        z = false;
                    }
                    if (z) {
                        UserProfileViewModel.this._userProfile.setValue(homepageResponse.getData().getUser());
                        UserProfileViewModel.this._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) UserProfileViewModel.this._uiState.getValue(), false, null, null, false, false, false, null, 0, false, 510, null));
                        System.out.println((Object) ("UserProfileViewModel: \u7528\u6237\u8d44\u6599\u52a0\u8f7d\u6210\u529f - " + homepageResponse.getData().getUser().getNickname()));
                    } else {
                        if (homepageResponse == null || (msg = homepageResponse.getMsg()) == null) {
                            msg = "\u83b7\u53d6\u7528\u6237\u8d44\u6599\u5931\u8d25";
                        }
                        String errorMsg = msg;
                        System.out.println((Object) ("UserProfileViewModel: API\u8fd4\u56de\u9519\u8bef - " + errorMsg));
                        UserProfileViewModel.this._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) UserProfileViewModel.this._uiState.getValue(), false, errorMsg, null, false, false, false, null, 0, false, 508, null));
                    }
                } else {
                    String errorMsg2 = "\u7f51\u7edc\u8bf7\u6c42\u5931\u8d25: " + response.code();
                    System.out.println((Object) ("UserProfileViewModel: \u7f51\u7edc\u8bf7\u6c42\u5931\u8d25 - " + errorMsg2));
                    UserProfileViewModel.this._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) UserProfileViewModel.this._uiState.getValue(), false, errorMsg2, null, false, false, false, null, 0, false, 508, null));
                }
            } catch (Exception e) {
                String message = e.getMessage();
                if (message == null) {
                    message = "\u672a\u77e5\u9519\u8bef";
                }
                String errorMsg3 = message;
                System.out.println((Object) ("UserProfileViewModel: \u5f02\u5e38 - " + errorMsg3));
                e.printStackTrace();
                UserProfileViewModel.this._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) UserProfileViewModel.this._uiState.getValue(), false, errorMsg3, null, false, false, false, null, 0, false, 508, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadUserProfile(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40841(userId, null), 3, null);
    }

    public final void showAddFriendDialog(String userId, String userName) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this._uiState.setValue(UserProfileUiState.copy$default(this._uiState.getValue(), false, null, new AddFriendDialogData(userId, userName, ""), false, false, false, null, 0, false, 507, null));
    }

    public final void dismissAddFriendDialog() {
        this._uiState.setValue(UserProfileUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, false, null, 0, false, 507, null));
    }

    public final void updateFriendRemark(String remark) {
        Intrinsics.checkNotNullParameter(remark, "remark");
        AddFriendDialogData showAddFriendDialog = this._uiState.getValue().getShowAddFriendDialog();
        if (showAddFriendDialog != null) {
            this._uiState.setValue(UserProfileUiState.copy$default(this._uiState.getValue(), false, null, AddFriendDialogData.copy$default(showAddFriendDialog, null, null, remark, 3, null), false, false, false, null, 0, false, 507, null));
        }
    }

    public final void confirmAddFriend() {
        AddFriendDialogData dialogData = this._uiState.getValue().getShowAddFriendDialog();
        if (dialogData == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40801(dialogData, null), 3, null);
    }

    /* compiled from: UserProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.UserProfileViewModel$confirmAddFriend$1", m185f = "UserProfileViewModel.kt", m186i = {1, 1}, m187l = {138, 154}, m188m = "invokeSuspend", m189n = {"token", "request"}, m191s = {"L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.UserProfileViewModel$confirmAddFriend$1 */
    static final class C40801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AddFriendDialogData $dialogData;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40801(AddFriendDialogData addFriendDialogData, Continuation<? super C40801> continuation) {
            super(2, continuation);
            this.$dialogData = addFriendDialogData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserProfileViewModel.this.new C40801(this.$dialogData, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:111:0x016b A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:67:0x001d, B:96:0x00ed, B:98:0x00f5, B:100:0x00fd, B:104:0x0106, B:105:0x0134, B:107:0x0149, B:110:0x0151, B:111:0x016b, B:68:0x0024, B:76:0x006a, B:78:0x0071, B:84:0x007d, B:86:0x00a9, B:92:0x00c8, B:73:0x0058), top: B:119:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x007d A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:67:0x001d, B:96:0x00ed, B:98:0x00f5, B:100:0x00fd, B:104:0x0106, B:105:0x0134, B:107:0x0149, B:110:0x0151, B:111:0x016b, B:68:0x0024, B:76:0x006a, B:78:0x0071, B:84:0x007d, B:86:0x00a9, B:92:0x00c8, B:73:0x0058), top: B:119:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x00a9 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:67:0x001d, B:96:0x00ed, B:98:0x00f5, B:100:0x00fd, B:104:0x0106, B:105:0x0134, B:107:0x0149, B:110:0x0151, B:111:0x016b, B:68:0x0024, B:76:0x006a, B:78:0x0071, B:84:0x007d, B:86:0x00a9, B:92:0x00c8, B:73:0x0058), top: B:119:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x00f5 A[Catch: Exception -> 0x002a, TryCatch #0 {Exception -> 0x002a, blocks: (B:67:0x001d, B:96:0x00ed, B:98:0x00f5, B:100:0x00fd, B:104:0x0106, B:105:0x0134, B:107:0x0149, B:110:0x0151, B:111:0x016b, B:68:0x0024, B:76:0x006a, B:78:0x0071, B:84:0x007d, B:86:0x00a9, B:92:0x00c8, B:73:0x0058), top: B:119:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 492
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.UserProfileViewModel.C40801.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void clearError() {
        this._uiState.setValue(UserProfileUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, false, null, 0, false, 509, null));
    }

    public final void clearAddFriendSuccess() {
        this._uiState.setValue(UserProfileUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, false, null, 0, false, 495, null));
    }

    /* compiled from: UserProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.UserProfileViewModel$removeMemberFromGroup$1", m185f = "UserProfileViewModel.kt", m186i = {}, m187l = {208}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.UserProfileViewModel$removeMemberFromGroup$1 */
    static final class C40851 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40851(String str, String str2, Continuation<? super C40851> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$userId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserProfileViewModel.this.new C40851(this.$groupId, this.$userId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    UserProfileViewModel.this._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) UserProfileViewModel.this._uiState.getValue(), false, null, null, false, false, true, null, 0, false, 477, null));
                    this.label = 1;
                    Object objM8582removeMember0E7RQCE = UserProfileViewModel.this.groupRepository.m8582removeMember0E7RQCE(this.$groupId, this.$userId, this);
                    if (objM8582removeMember0E7RQCE != coroutine_suspended) {
                        value = objM8582removeMember0E7RQCE;
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
            UserProfileViewModel userProfileViewModel = UserProfileViewModel.this;
            UserProfileViewModel userProfileViewModel2 = UserProfileViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                userProfileViewModel._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) userProfileViewModel._uiState.getValue(), false, null, null, false, false, false, "\u5df2\u8e22\u51fa\u8be5\u6210\u5458", 0, false, 415, null));
            } else {
                MutableStateFlow mutableStateFlow = userProfileViewModel2._uiState;
                UserProfileUiState userProfileUiState = (UserProfileUiState) userProfileViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u8e22\u51fa\u6210\u5458\u5931\u8d25";
                }
                mutableStateFlow.setValue(UserProfileUiState.copy$default(userProfileUiState, false, message, null, false, false, false, null, 0, false, 477, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void removeMemberFromGroup(String groupId, String userId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40851(groupId, userId, null), 3, null);
    }

    /* compiled from: UserProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.UserProfileViewModel$gagMemberInGroup$1", m185f = "UserProfileViewModel.kt", m186i = {}, m187l = {232}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.UserProfileViewModel$gagMemberInGroup$1 */
    static final class C40811 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $gagTime;
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40811(String str, String str2, int i, Continuation<? super C40811> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$userId = str2;
            this.$gagTime = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserProfileViewModel.this.new C40811(this.$groupId, this.$userId, this.$gagTime, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    UserProfileViewModel.this._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) UserProfileViewModel.this._uiState.getValue(), false, null, null, false, false, true, null, 0, false, 477, null));
                    this.label = 1;
                    Object objM8573gagMemberBWLJW6A = UserProfileViewModel.this.groupRepository.m8573gagMemberBWLJW6A(this.$groupId, this.$userId, this.$gagTime, this);
                    if (objM8573gagMemberBWLJW6A != coroutine_suspended) {
                        value = objM8573gagMemberBWLJW6A;
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
            int i = this.$gagTime;
            UserProfileViewModel userProfileViewModel = UserProfileViewModel.this;
            UserProfileViewModel userProfileViewModel2 = UserProfileViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                switch (i) {
                    case 0:
                        str = "\u5df2\u53d6\u6d88\u7981\u8a00";
                        break;
                    case 1:
                        str = "\u5df2\u6c38\u4e45\u7981\u8a00";
                        break;
                    case 600:
                        str = "\u5df2\u7981\u8a0010\u5206\u949f";
                        break;
                    case 3600:
                        str = "\u5df2\u7981\u8a001\u5c0f\u65f6";
                        break;
                    case 21600:
                        str = "\u5df2\u7981\u8a006\u5c0f\u65f6";
                        break;
                    case 43200:
                        str = "\u5df2\u7981\u8a0012\u5c0f\u65f6";
                        break;
                    default:
                        str = "\u7981\u8a00\u8bbe\u7f6e\u6210\u529f";
                        break;
                }
                userProfileViewModel._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) userProfileViewModel._uiState.getValue(), false, null, null, false, false, false, str, 0, false, 415, null));
            } else {
                MutableStateFlow mutableStateFlow = userProfileViewModel2._uiState;
                UserProfileUiState userProfileUiState = (UserProfileUiState) userProfileViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u7981\u8a00\u64cd\u4f5c\u5931\u8d25";
                }
                mutableStateFlow.setValue(UserProfileUiState.copy$default(userProfileUiState, false, message, null, false, false, false, null, 0, false, 477, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void gagMemberInGroup(String groupId, String userId, int gagTime) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40811(groupId, userId, gagTime, null), 3, null);
    }

    /* compiled from: UserProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.UserProfileViewModel$setMemberRole$1", m185f = "UserProfileViewModel.kt", m186i = {}, m187l = {265}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.UserProfileViewModel$setMemberRole$1 */
    static final class C40861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $userId;
        final /* synthetic */ int $userLevel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40861(String str, String str2, int i, Continuation<? super C40861> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$userId = str2;
            this.$userLevel = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserProfileViewModel.this.new C40861(this.$groupId, this.$userId, this.$userLevel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            String str;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    UserProfileViewModel.this._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) UserProfileViewModel.this._uiState.getValue(), false, null, null, false, false, true, null, 0, false, 477, null));
                    this.label = 1;
                    Object objM8586setMemberRoleBWLJW6A = UserProfileViewModel.this.groupRepository.m8586setMemberRoleBWLJW6A(this.$groupId, this.$userId, this.$userLevel, this);
                    if (objM8586setMemberRoleBWLJW6A != coroutine_suspended) {
                        value = objM8586setMemberRoleBWLJW6A;
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
            int i = this.$userLevel;
            UserProfileViewModel userProfileViewModel = UserProfileViewModel.this;
            UserProfileViewModel userProfileViewModel2 = UserProfileViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                switch (i) {
                    case 0:
                        str = "\u5df2\u5378\u4efb\u7ba1\u7406\u5458";
                        break;
                    case 1:
                    default:
                        str = "\u89d2\u8272\u8bbe\u7f6e\u6210\u529f";
                        break;
                    case 2:
                        str = "\u5df2\u8bbe\u4e3a\u7ba1\u7406\u5458";
                        break;
                }
                userProfileViewModel._uiState.setValue(UserProfileUiState.copy$default((UserProfileUiState) userProfileViewModel._uiState.getValue(), false, null, null, false, false, false, str, 0, false, 415, null));
            } else {
                MutableStateFlow mutableStateFlow = userProfileViewModel2._uiState;
                UserProfileUiState userProfileUiState = (UserProfileUiState) userProfileViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u8bbe\u7f6e\u89d2\u8272\u5931\u8d25";
                }
                mutableStateFlow.setValue(UserProfileUiState.copy$default(userProfileUiState, false, message, null, false, false, false, null, 0, false, 477, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void setMemberRole(String groupId, String userId, int userLevel) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40861(groupId, userId, userLevel, null), 3, null);
    }

    /* compiled from: UserProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.UserProfileViewModel$loadGroupInfoAndMemberInfo$1", m185f = "UserProfileViewModel.kt", m186i = {}, m187l = {295}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.UserProfileViewModel$loadGroupInfoAndMemberInfo$1 */
    static final class C40821 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $targetUserId;
        int label;
        final /* synthetic */ UserProfileViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40821(String str, UserProfileViewModel userProfileViewModel, String str2, Continuation<? super C40821> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.this$0 = userProfileViewModel;
            this.$targetUserId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C40821(this.$groupId, this.this$0, this.$targetUserId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d("UserProfileViewModel", "Loading group info for: " + this.$groupId);
                    this.label = 1;
                    Object objM8577getGroupInfogIAlus = this.this$0.groupRepository.m8577getGroupInfogIAlus(this.$groupId, this);
                    if (objM8577getGroupInfogIAlus != coroutine_suspended) {
                        value = objM8577getGroupInfogIAlus;
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
            UserProfileViewModel userProfileViewModel = this.this$0;
            String str = this.$groupId;
            String str2 = this.$targetUserId;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                GroupDetail groupDetail = (GroupDetail) value;
                userProfileViewModel.groupInfoCache.put(str, groupDetail);
                String userIdSync = userProfileViewModel.tokenRepository.getUserIdSync();
                boolean z = Intrinsics.areEqual(groupDetail.getOwnerId(), userIdSync) || groupDetail.getPermissionLevel() == 100;
                Log.d("UserProfileViewModel", "Group info loaded. CurrentUser: " + userIdSync + ", Owner: " + groupDetail.getOwnerId() + ", Permission: " + groupDetail.getPermissionLevel() + ", IsOwner: " + (z));
                userProfileViewModel.loadGroupMembersAndUpdatePermission(str, str2, z);
            } else {
                Log.e("UserProfileViewModel", "Failed to load group info", thM11922exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadGroupInfoAndMemberInfo(String groupId, String targetUserId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40821(groupId, this, targetUserId, null), 3, null);
    }

    /* compiled from: UserProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.UserProfileViewModel$loadGroupMembersAndUpdatePermission$1", m185f = "UserProfileViewModel.kt", m186i = {0, 0, 0}, m187l = {323}, m188m = "invokeSuspend", m189n = {"allMembers", "page", "hasMore"}, m191s = {"L$0", "L$1", "L$2"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.UserProfileViewModel$loadGroupMembersAndUpdatePermission$1 */
    static final class C40831 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ boolean $isOwner;
        final /* synthetic */ String $targetUserId;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40831(String str, boolean z, String str2, Continuation<? super C40831> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$isOwner = z;
            this.$targetUserId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserProfileViewModel.this.new C40831(this.$groupId, this.$isOwner, this.$targetUserId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40831) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:54:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00ab  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0077 -> B:58:0x007d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 382
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.UserProfileViewModel.C40831.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loadGroupMembersAndUpdatePermission(String groupId, String targetUserId, boolean isOwner) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40831(groupId, isOwner, targetUserId, null), 3, null);
    }
}
