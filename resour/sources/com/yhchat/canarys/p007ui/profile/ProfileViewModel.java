package com.yhchat.canarys.p007ui.profile;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.SaveUserDataRequest;
import com.yhchat.canarys.data.model.UserData;
import com.yhchat.canarys.data.model.UserProfile;
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
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ProfileViewModel.kt */
@Metadata(m168d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010%\u001a\u00020&J\u0006\u0010'\u001a\u00020&J\u000e\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020&J\u0006\u0010,\u001a\u00020&J\u0006\u0010-\u001a\u00020&J\u000e\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u000200J\u0006\u00101\u001a\u00020&J\u000e\u00102\u001a\u00020&2\u0006\u00103\u001a\u000200J\u0006\u00104\u001a\u00020&J\u0016\u00105\u001a\u00020&2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209J\u0006\u0010:\u001a\u00020&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\fR\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\fR\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\f\u00a8\u0006;"}, m169d2 = {"Lcom/yhchat/canarys/ui/profile/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/UserRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/profile/ProfileUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_changeInviteCodeState", "Lcom/yhchat/canarys/ui/profile/ChangeInviteCodeState;", "changeInviteCodeState", "getChangeInviteCodeState", "_changeNicknameState", "Lcom/yhchat/canarys/ui/profile/ChangeNicknameState;", "changeNicknameState", "getChangeNicknameState", "_changeAvatarState", "Lcom/yhchat/canarys/ui/profile/ChangeAvatarState;", "changeAvatarState", "getChangeAvatarState", "_betaState", "Lcom/yhchat/canarys/ui/profile/BetaState;", "betaState", "getBetaState", "_userDataState", "Lcom/yhchat/canarys/ui/profile/UserDataState;", "userDataState", "getUserDataState", "_saveUserDataState", "Lcom/yhchat/canarys/ui/profile/SaveUserDataState;", "saveUserDataState", "getSaveUserDataState", "loadUserProfile", "", "loadUserData", "saveUserData", "request", "Lcom/yhchat/canarys/data/model/SaveUserDataRequest;", "resetSaveUserDataState", "loadBetaInfo", "clearError", "changeInviteCode", "code", "", "resetChangeInviteCodeState", "changeNickname", "nickname", "resetChangeNicknameState", "changeAvatar", "context", "Landroid/content/Context;", "imageUri", "Landroid/net/Uri;", "resetChangeAvatarState", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final class ProfileViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<BetaState> _betaState;
    private final MutableStateFlow<ChangeAvatarState> _changeAvatarState;
    private final MutableStateFlow<ChangeInviteCodeState> _changeInviteCodeState;
    private final MutableStateFlow<ChangeNicknameState> _changeNicknameState;
    private final MutableStateFlow<SaveUserDataState> _saveUserDataState;
    private final MutableStateFlow<ProfileUiState> _uiState;
    private final MutableStateFlow<UserDataState> _userDataState;
    private final StateFlow<BetaState> betaState;
    private final StateFlow<ChangeAvatarState> changeAvatarState;
    private final StateFlow<ChangeInviteCodeState> changeInviteCodeState;
    private final StateFlow<ChangeNicknameState> changeNicknameState;
    private final StateFlow<SaveUserDataState> saveUserDataState;
    private final StateFlow<ProfileUiState> uiState;
    private final StateFlow<UserDataState> userDataState;
    private final UserRepository userRepository;

    public ProfileViewModel(UserRepository userRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.userRepository = userRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new ProfileUiState(false, null, null, 7, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._changeInviteCodeState = StateFlowKt.MutableStateFlow(new ChangeInviteCodeState(false, false, null, 7, null));
        this.changeInviteCodeState = FlowKt.asStateFlow(this._changeInviteCodeState);
        this._changeNicknameState = StateFlowKt.MutableStateFlow(new ChangeNicknameState(false, false, null, 7, null));
        this.changeNicknameState = FlowKt.asStateFlow(this._changeNicknameState);
        this._changeAvatarState = StateFlowKt.MutableStateFlow(new ChangeAvatarState(false, false, null, 7, null));
        this.changeAvatarState = FlowKt.asStateFlow(this._changeAvatarState);
        this._betaState = StateFlowKt.MutableStateFlow(new BetaState(false, null, null, 7, null));
        this.betaState = FlowKt.asStateFlow(this._betaState);
        this._userDataState = StateFlowKt.MutableStateFlow(new UserDataState(false, null, null, 7, null));
        this.userDataState = FlowKt.asStateFlow(this._userDataState);
        this._saveUserDataState = StateFlowKt.MutableStateFlow(new SaveUserDataState(false, false, null, 7, null));
        this.saveUserDataState = FlowKt.asStateFlow(this._saveUserDataState);
    }

    public final StateFlow<ProfileUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<ChangeInviteCodeState> getChangeInviteCodeState() {
        return this.changeInviteCodeState;
    }

    public final StateFlow<ChangeNicknameState> getChangeNicknameState() {
        return this.changeNicknameState;
    }

    public final StateFlow<ChangeAvatarState> getChangeAvatarState() {
        return this.changeAvatarState;
    }

    public final StateFlow<BetaState> getBetaState() {
        return this.betaState;
    }

    public final StateFlow<UserDataState> getUserDataState() {
        return this.userDataState;
    }

    public final StateFlow<SaveUserDataState> getSaveUserDataState() {
        return this.saveUserDataState;
    }

    /* compiled from: ProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.ProfileViewModel$loadUserProfile$1", m185f = "ProfileViewModel.kt", m186i = {}, m187l = {56}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.ProfileViewModel$loadUserProfile$1 */
    static final class C40781 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C40781(Continuation<? super C40781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileViewModel.this.new C40781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ProfileViewModel.this._uiState.setValue(ProfileUiState.copy$default((ProfileUiState) ProfileViewModel.this._uiState.getValue(), true, null, null, 2, null));
                    this.label = 1;
                    Object objM8657getUserProfileIoAF18A = ProfileViewModel.this.userRepository.m8657getUserProfileIoAF18A(this);
                    if (objM8657getUserProfileIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8657getUserProfileIoAF18A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProfileViewModel profileViewModel = ProfileViewModel.this;
            ProfileViewModel profileViewModel2 = ProfileViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                profileViewModel._uiState.setValue(((ProfileUiState) profileViewModel._uiState.getValue()).copy(false, (UserProfile) value, null));
                profileViewModel.loadBetaInfo();
            } else {
                Log.e("ProfileViewModel", "\u52a0\u8f7d\u7528\u6237\u8d44\u6599\u5931\u8d25", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = profileViewModel2._uiState;
                ProfileUiState profileUiState = (ProfileUiState) profileViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                mutableStateFlow.setValue(ProfileUiState.copy$default(profileUiState, false, null, message == null ? "\u52a0\u8f7d\u7528\u6237\u8d44\u6599\u5931\u8d25" : message, 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadUserProfile() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40781(null), 3, null);
    }

    /* compiled from: ProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.ProfileViewModel$loadUserData$1", m185f = "ProfileViewModel.kt", m186i = {}, m187l = {80}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.ProfileViewModel$loadUserData$1 */
    static final class C40771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C40771(Continuation<? super C40771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileViewModel.this.new C40771(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ProfileViewModel.this._userDataState.setValue(UserDataState.copy$default((UserDataState) ProfileViewModel.this._userDataState.getValue(), true, null, null, 2, null));
                    this.label = 1;
                    Object objM8653getUserDataIoAF18A = ProfileViewModel.this.userRepository.m8653getUserDataIoAF18A(this);
                    if (objM8653getUserDataIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8653getUserDataIoAF18A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProfileViewModel profileViewModel = ProfileViewModel.this;
            ProfileViewModel profileViewModel2 = ProfileViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                profileViewModel._userDataState.setValue(((UserDataState) profileViewModel._userDataState.getValue()).copy(false, (UserData) value, null));
            } else {
                MutableStateFlow mutableStateFlow = profileViewModel2._userDataState;
                UserDataState userDataState = (UserDataState) profileViewModel2._userDataState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u83b7\u53d6\u4e2a\u4eba\u4fe1\u606f\u5931\u8d25";
                }
                mutableStateFlow.setValue(UserDataState.copy$default(userDataState, false, null, message, 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadUserData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40771(null), 3, null);
    }

    /* compiled from: ProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.ProfileViewModel$saveUserData$1", m185f = "ProfileViewModel.kt", m186i = {}, m187l = {101}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.ProfileViewModel$saveUserData$1 */
    static final class C40791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SaveUserDataRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40791(SaveUserDataRequest saveUserDataRequest, Continuation<? super C40791> continuation) {
            super(2, continuation);
            this.$request = saveUserDataRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileViewModel.this.new C40791(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ProfileViewModel.this._saveUserDataState.setValue(((SaveUserDataState) ProfileViewModel.this._saveUserDataState.getValue()).copy(true, false, null));
                    this.label = 1;
                    Object objM8661saveUserDatagIAlus = ProfileViewModel.this.userRepository.m8661saveUserDatagIAlus(this.$request, this);
                    if (objM8661saveUserDatagIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8661saveUserDatagIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProfileViewModel profileViewModel = ProfileViewModel.this;
            ProfileViewModel profileViewModel2 = ProfileViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                profileViewModel._saveUserDataState.setValue(((SaveUserDataState) profileViewModel._saveUserDataState.getValue()).copy(false, true, null));
                profileViewModel.loadUserData();
            } else {
                MutableStateFlow mutableStateFlow = profileViewModel2._saveUserDataState;
                SaveUserDataState saveUserDataState = (SaveUserDataState) profileViewModel2._saveUserDataState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u4fdd\u5b58\u4e2a\u4eba\u4fe1\u606f\u5931\u8d25";
                }
                mutableStateFlow.setValue(saveUserDataState.copy(false, false, message));
            }
            return Unit.INSTANCE;
        }
    }

    public final void saveUserData(SaveUserDataRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40791(request, null), 3, null);
    }

    public final void resetSaveUserDataState() {
        this._saveUserDataState.setValue(new SaveUserDataState(false, false, null, 7, null));
    }

    /* compiled from: ProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.ProfileViewModel$loadBetaInfo$1", m185f = "ProfileViewModel.kt", m186i = {1}, m187l = {129, 130}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.ProfileViewModel$loadBetaInfo$1 */
    static final class C40761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C40761(Continuation<? super C40761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileViewModel.this.new C40761(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0016, B:23:0x0078, B:25:0x0080, B:27:0x0089, B:32:0x0093, B:34:0x009c, B:36:0x00a2, B:37:0x00bf, B:39:0x00dc, B:42:0x00e4, B:8:0x001b, B:16:0x0058, B:19:0x005e, B:13:0x0046), top: B:51:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00bf A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0016, B:23:0x0078, B:25:0x0080, B:27:0x0089, B:32:0x0093, B:34:0x009c, B:36:0x00a2, B:37:0x00bf, B:39:0x00dc, B:42:0x00e4, B:8:0x001b, B:16:0x0058, B:19:0x005e, B:13:0x0046), top: B:51:0x0007 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileViewModel.C40761.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loadBetaInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40761(null), 3, null);
    }

    public final void clearError() {
        this._uiState.setValue(ProfileUiState.copy$default(this._uiState.getValue(), false, null, null, 3, null));
    }

    /* compiled from: ProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.ProfileViewModel$changeInviteCode$1", m185f = "ProfileViewModel.kt", m186i = {}, m187l = {173}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.ProfileViewModel$changeInviteCode$1 */
    static final class C40741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $code;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40741(String str, Continuation<? super C40741> continuation) {
            super(2, continuation);
            this.$code = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileViewModel.this.new C40741(this.$code, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ProfileViewModel.this._changeInviteCodeState.setValue(((ChangeInviteCodeState) ProfileViewModel.this._changeInviteCodeState.getValue()).copy(true, false, null));
                    this.label = 1;
                    Object objM8638changeInviteCodegIAlus = ProfileViewModel.this.userRepository.m8638changeInviteCodegIAlus(this.$code, this);
                    if (objM8638changeInviteCodegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8638changeInviteCodegIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProfileViewModel profileViewModel = ProfileViewModel.this;
            ProfileViewModel profileViewModel2 = ProfileViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                profileViewModel._changeInviteCodeState.setValue(((ChangeInviteCodeState) profileViewModel._changeInviteCodeState.getValue()).copy(false, true, null));
                profileViewModel.loadUserProfile();
            } else {
                Log.e("ProfileViewModel", "\u4fee\u6539\u9080\u8bf7\u7801\u5931\u8d25", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = profileViewModel2._changeInviteCodeState;
                ChangeInviteCodeState changeInviteCodeState = (ChangeInviteCodeState) profileViewModel2._changeInviteCodeState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                mutableStateFlow.setValue(ChangeInviteCodeState.copy$default(changeInviteCodeState, false, false, message == null ? "\u4fee\u6539\u9080\u8bf7\u7801\u5931\u8d25" : message, 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void changeInviteCode(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40741(code, null), 3, null);
    }

    public final void resetChangeInviteCodeState() {
        this._changeInviteCodeState.setValue(new ChangeInviteCodeState(false, false, null, 7, null));
    }

    /* compiled from: ProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.ProfileViewModel$changeNickname$1", m185f = "ProfileViewModel.kt", m186i = {}, m187l = {212}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.ProfileViewModel$changeNickname$1 */
    static final class C40751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $nickname;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40751(String str, Continuation<? super C40751> continuation) {
            super(2, continuation);
            this.$nickname = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileViewModel.this.new C40751(this.$nickname, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ProfileViewModel.this._changeNicknameState.setValue(((ChangeNicknameState) ProfileViewModel.this._changeNicknameState.getValue()).copy(true, false, null));
                    this.label = 1;
                    Object objM8643editNicknamegIAlus = ProfileViewModel.this.userRepository.m8643editNicknamegIAlus(this.$nickname, this);
                    if (objM8643editNicknamegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8643editNicknamegIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProfileViewModel profileViewModel = ProfileViewModel.this;
            ProfileViewModel profileViewModel2 = ProfileViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                profileViewModel._changeNicknameState.setValue(((ChangeNicknameState) profileViewModel._changeNicknameState.getValue()).copy(false, true, null));
                profileViewModel.loadUserProfile();
            } else {
                Log.e("ProfileViewModel", "\u4fee\u6539\u7528\u6237\u540d\u79f0\u5931\u8d25", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = profileViewModel2._changeNicknameState;
                ChangeNicknameState changeNicknameState = (ChangeNicknameState) profileViewModel2._changeNicknameState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                mutableStateFlow.setValue(ChangeNicknameState.copy$default(changeNicknameState, false, false, message == null ? "\u4fee\u6539\u7528\u6237\u540d\u79f0\u5931\u8d25" : message, 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void changeNickname(String nickname) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40751(nickname, null), 3, null);
    }

    public final void resetChangeNicknameState() {
        this._changeNicknameState.setValue(new ChangeNicknameState(false, false, null, 7, null));
    }

    /* compiled from: ProfileViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.ProfileViewModel$changeAvatar$1", m185f = "ProfileViewModel.kt", m186i = {1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3}, m187l = {249, 250, 263, 275}, m188m = "invokeSuspend", m189n = {"token", "token", "tokenResult", "uploadToken", "token", "tokenResult", "uploadToken", "uploadResult", "uploadResponse\\1", "imageUrl\\1", "$i$a$-fold-ProfileViewModel$changeAvatar$1$1\\1\\269\\0"}, m191s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.profile.ProfileViewModel$changeAvatar$1 */
    static final class C40731 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $imageUri;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40731(Context context, Uri uri, Continuation<? super C40731> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$imageUri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ProfileViewModel.this.new C40731(this.$context, this.$imageUri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bf A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:7:0x002f, B:46:0x0173, B:48:0x0179, B:49:0x01a5, B:52:0x01bf, B:10:0x0048, B:40:0x0113, B:42:0x011e, B:54:0x01d2, B:13:0x005c, B:28:0x00c0, B:30:0x00c8, B:32:0x00d0, B:36:0x00da, B:55:0x0209, B:14:0x0062, B:22:0x00a1, B:25:0x00a7, B:19:0x008e), top: B:60:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x011e A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:7:0x002f, B:46:0x0173, B:48:0x0179, B:49:0x01a5, B:52:0x01bf, B:10:0x0048, B:40:0x0113, B:42:0x011e, B:54:0x01d2, B:13:0x005c, B:28:0x00c0, B:30:0x00c8, B:32:0x00d0, B:36:0x00da, B:55:0x0209, B:14:0x0062, B:22:0x00a1, B:25:0x00a7, B:19:0x008e), top: B:60:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0179 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:7:0x002f, B:46:0x0173, B:48:0x0179, B:49:0x01a5, B:52:0x01bf, B:10:0x0048, B:40:0x0113, B:42:0x011e, B:54:0x01d2, B:13:0x005c, B:28:0x00c0, B:30:0x00c8, B:32:0x00d0, B:36:0x00da, B:55:0x0209, B:14:0x0062, B:22:0x00a1, B:25:0x00a7, B:19:0x008e), top: B:60:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01a5 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:7:0x002f, B:46:0x0173, B:48:0x0179, B:49:0x01a5, B:52:0x01bf, B:10:0x0048, B:40:0x0113, B:42:0x011e, B:54:0x01d2, B:13:0x005c, B:28:0x00c0, B:30:0x00c8, B:32:0x00d0, B:36:0x00da, B:55:0x0209, B:14:0x0062, B:22:0x00a1, B:25:0x00a7, B:19:0x008e), top: B:60:0x0008 }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x01d2 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:7:0x002f, B:46:0x0173, B:48:0x0179, B:49:0x01a5, B:52:0x01bf, B:10:0x0048, B:40:0x0113, B:42:0x011e, B:54:0x01d2, B:13:0x005c, B:28:0x00c0, B:30:0x00c8, B:32:0x00d0, B:36:0x00da, B:55:0x0209, B:14:0x0062, B:22:0x00a1, B:25:0x00a7, B:19:0x008e), top: B:60:0x0008 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 630
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.profile.ProfileViewModel.C40731.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void changeAvatar(Context context, Uri imageUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40731(context, imageUri, null), 3, null);
    }

    public final void resetChangeAvatarState() {
        this._changeAvatarState.setValue(new ChangeAvatarState(false, false, null, 7, null));
    }
}
