package com.yhchat.canarys.p007ui.group;

import android.util.Log;
import androidx.autofill.HintConstants;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.GroupDetail;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: GroupSettingsViewModel.kt */
@Metadata(m168d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001aJ\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\tJ\u0006\u0010\u001e\u001a\u00020\u0012J\u0006\u0010\u001f\u001a\u00020\u0012J\u0006\u0010 \u001a\u00020\u0012J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\tJ\u000e\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\tJ\u000e\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\tJ\u000e\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u001aJ\u000e\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u001aJ\u000e\u0010+\u001a\u00020\u00122\u0006\u0010,\u001a\u00020\u001aJ\u000e\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020\tJ\u0006\u0010/\u001a\u00020\u0012J\u0006\u00100\u001a\u00020\u0012J\u0006\u00101\u001a\u00020\u001aJ\u0006\u00102\u001a\u00020\u0012J\u0006\u00103\u001a\u00020\u0012J\u000e\u00104\u001a\u00020\u00122\u0006\u00105\u001a\u00020\u0017J\u0006\u00106\u001a\u00020\u0012J\u0006\u00107\u001a\u00020\tJ*\u00108\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00120;R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006<"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/GroupSettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "groupRepository", "Lcom/yhchat/canarys/data/repository/GroupRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/GroupRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "tag", "", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/group/GroupSettingsUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "showAutoDeleteMessageDialog", "", "dismissAutoDeleteMessageDialog", "setAutoDeleteMessage", "groupId", "autoDeleteMessage", "", "setHideGroupMembers", "hide", "", "setDenyMembersUploadToGroupDisk", "deny", "loadGroupInfo", "startEditing", "cancelEditing", "saveEditing", "updateEditedName", HintConstants.AUTOFILL_HINT_NAME, "updateEditedIntroduction", "introduction", "updateEditedAvatarUrl", "avatarUrl", "updateEditedDirectJoin", "directJoin", "updateEditedHistoryMsg", "historyMsg", "updateEditedPrivate", "isPrivate", "updateEditedCategoryName", "categoryName", "clearError", "clearSaveError", "isAdminOrOwner", "showMessageTypeLimitDialog", "dismissMessageTypeLimitDialog", "toggleMessageType", "type", "confirmMessageTypeLimit", "getCurrentUserId", "editGroupKeyword", "keyword", "onResult", "Lkotlin/Function1;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class GroupSettingsViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<GroupSettingsUiState> _uiState;
    private final GroupRepository groupRepository;
    private final String tag;
    private final TokenRepository tokenRepository;
    private final StateFlow<GroupSettingsUiState> uiState;

    @Inject
    public GroupSettingsViewModel(GroupRepository groupRepository, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(groupRepository, "groupRepository");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.groupRepository = groupRepository;
        this.tokenRepository = tokenRepository;
        this.tag = "GroupSettingsViewModel";
        this._uiState = StateFlowKt.MutableStateFlow(new GroupSettingsUiState(false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194303, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this.groupRepository.setTokenRepository(this.tokenRepository);
    }

    public final StateFlow<GroupSettingsUiState> getUiState() {
        return this.uiState;
    }

    public final void showAutoDeleteMessageDialog() {
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, true, false, false, false, 3932159, null));
    }

    public final void dismissAutoDeleteMessageDialog() {
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 3932159, null));
    }

    /* compiled from: GroupSettingsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupSettingsViewModel$setAutoDeleteMessage$1", m185f = "GroupSettingsViewModel.kt", m186i = {}, m187l = {72}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupSettingsViewModel$setAutoDeleteMessage$1 */
    static final class C39981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $autoDeleteMessage;
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39981(String str, int i, Continuation<? super C39981> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$autoDeleteMessage = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupSettingsViewModel.this.new C39981(this.$groupId, this.$autoDeleteMessage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupSettingsViewModel.this._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) GroupSettingsViewModel.this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, true, false, false, 3670015, null));
                    this.label = 1;
                    Object objM8569editAutoDeleteMessage0E7RQCE = GroupSettingsViewModel.this.groupRepository.m8569editAutoDeleteMessage0E7RQCE(this.$groupId, this.$autoDeleteMessage, this);
                    if (objM8569editAutoDeleteMessage0E7RQCE != coroutine_suspended) {
                        value = objM8569editAutoDeleteMessage0E7RQCE;
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
            GroupSettingsViewModel groupSettingsViewModel = GroupSettingsViewModel.this;
            String str = this.$groupId;
            GroupSettingsViewModel groupSettingsViewModel2 = GroupSettingsViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupSettingsViewModel._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) groupSettingsViewModel._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 3407871, null));
                groupSettingsViewModel.loadGroupInfo(str);
            } else {
                MutableStateFlow mutableStateFlow = groupSettingsViewModel2._uiState;
                GroupSettingsUiState groupSettingsUiState = (GroupSettingsUiState) groupSettingsViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u8bbe\u7f6e\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupSettingsUiState.copy$default(groupSettingsUiState, false, message, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 3670013, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void setAutoDeleteMessage(String groupId, int autoDeleteMessage) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39981(groupId, autoDeleteMessage, null), 3, null);
    }

    /* compiled from: GroupSettingsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupSettingsViewModel$setHideGroupMembers$1", m185f = "GroupSettingsViewModel.kt", m186i = {}, m187l = {95}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupSettingsViewModel$setHideGroupMembers$1 */
    static final class C40001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GroupDetail $groupInfo;
        final /* synthetic */ boolean $hide;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C40001(GroupDetail groupDetail, boolean z, Continuation<? super C40001> continuation) {
            super(2, continuation);
            this.$groupInfo = groupDetail;
            this.$hide = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupSettingsViewModel.this.new C40001(this.$groupInfo, this.$hide, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C40001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupSettingsViewModel.this._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) GroupSettingsViewModel.this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, true, false, 3145727, null));
                    this.label = 1;
                    Object objM8585setHideGroupMembers0E7RQCE = GroupSettingsViewModel.this.groupRepository.m8585setHideGroupMembers0E7RQCE(this.$groupInfo, this.$hide, this);
                    if (objM8585setHideGroupMembers0E7RQCE != coroutine_suspended) {
                        value = objM8585setHideGroupMembers0E7RQCE;
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
            GroupSettingsViewModel groupSettingsViewModel = GroupSettingsViewModel.this;
            GroupDetail groupDetail = this.$groupInfo;
            GroupSettingsViewModel groupSettingsViewModel2 = GroupSettingsViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupSettingsViewModel._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) groupSettingsViewModel._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 3145727, null));
                groupSettingsViewModel.loadGroupInfo(groupDetail.getGroupId());
            } else {
                MutableStateFlow mutableStateFlow = groupSettingsViewModel2._uiState;
                GroupSettingsUiState groupSettingsUiState = (GroupSettingsUiState) groupSettingsViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u8bbe\u7f6e\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupSettingsUiState.copy$default(groupSettingsUiState, false, null, null, false, false, message, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 3145695, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void setHideGroupMembers(boolean hide) {
        GroupDetail groupInfo = this._uiState.getValue().getGroupInfo();
        if (groupInfo == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C40001(groupInfo, hide, null), 3, null);
    }

    /* compiled from: GroupSettingsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupSettingsViewModel$setDenyMembersUploadToGroupDisk$1", m185f = "GroupSettingsViewModel.kt", m186i = {}, m187l = {115}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupSettingsViewModel$setDenyMembersUploadToGroupDisk$1 */
    static final class C39991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $deny;
        final /* synthetic */ GroupDetail $groupInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39991(GroupDetail groupDetail, boolean z, Continuation<? super C39991> continuation) {
            super(2, continuation);
            this.$groupInfo = groupDetail;
            this.$deny = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupSettingsViewModel.this.new C39991(this.$groupInfo, this.$deny, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupSettingsViewModel.this._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) GroupSettingsViewModel.this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, true, 2097151, null));
                    this.label = 1;
                    Object objM8584setDenyMembersUploadToGroupDisk0E7RQCE = GroupSettingsViewModel.this.groupRepository.m8584setDenyMembersUploadToGroupDisk0E7RQCE(this.$groupInfo.getGroupId(), this.$deny, this);
                    if (objM8584setDenyMembersUploadToGroupDisk0E7RQCE != coroutine_suspended) {
                        value = objM8584setDenyMembersUploadToGroupDisk0E7RQCE;
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
            GroupSettingsViewModel groupSettingsViewModel = GroupSettingsViewModel.this;
            GroupDetail groupDetail = this.$groupInfo;
            GroupSettingsViewModel groupSettingsViewModel2 = GroupSettingsViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                groupSettingsViewModel._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) groupSettingsViewModel._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 2097151, null));
                groupSettingsViewModel.loadGroupInfo(groupDetail.getGroupId());
            } else {
                MutableStateFlow mutableStateFlow = groupSettingsViewModel2._uiState;
                GroupSettingsUiState groupSettingsUiState = (GroupSettingsUiState) groupSettingsViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u8bbe\u7f6e\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupSettingsUiState.copy$default(groupSettingsUiState, false, null, null, false, false, message, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 2097119, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void setDenyMembersUploadToGroupDisk(boolean deny) {
        GroupDetail groupInfo = this._uiState.getValue().getGroupInfo();
        if (groupInfo == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39991(groupInfo, deny, null), 3, null);
    }

    /* compiled from: GroupSettingsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupSettingsViewModel$loadGroupInfo$1", m185f = "GroupSettingsViewModel.kt", m186i = {}, m187l = {138}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupSettingsViewModel$loadGroupInfo$1 */
    static final class C39961 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39961(String str, Continuation<? super C39961> continuation) {
            super(2, continuation);
            this.$groupId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupSettingsViewModel.this.new C39961(this.$groupId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(GroupSettingsViewModel.this.tag, "Loading group info for: " + this.$groupId);
                    GroupSettingsViewModel.this._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) GroupSettingsViewModel.this._uiState.getValue(), true, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194300, null));
                    this.label = 1;
                    Object objM8577getGroupInfogIAlus = GroupSettingsViewModel.this.groupRepository.m8577getGroupInfogIAlus(this.$groupId, this);
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
            GroupSettingsViewModel groupSettingsViewModel = GroupSettingsViewModel.this;
            GroupSettingsViewModel groupSettingsViewModel2 = GroupSettingsViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                GroupDetail groupDetail = (GroupDetail) value;
                Log.d(groupSettingsViewModel.tag, "\u2705 Group info loaded: " + groupDetail.getName());
                groupSettingsViewModel._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) groupSettingsViewModel._uiState.getValue(), false, null, groupDetail, false, false, null, false, groupDetail.getName(), groupDetail.getIntroduction(), groupDetail.getAvatarUrl(), groupDetail.getDirectJoin(), groupDetail.getHistoryMsgEnabled(), groupDetail.isPrivate(), groupDetail.getCategoryName(), groupDetail.getCategoryId(), false, null, false, false, false, false, false, 4161658, null));
            } else {
                Log.e(groupSettingsViewModel2.tag, "\u274c Failed to load group info", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = groupSettingsViewModel2._uiState;
                GroupSettingsUiState groupSettingsUiState = (GroupSettingsUiState) groupSettingsViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u7fa4\u804a\u4fe1\u606f\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupSettingsUiState.copy$default(groupSettingsUiState, false, message, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194300, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadGroupInfo(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39961(groupId, null), 3, null);
    }

    public final void startEditing() {
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, true, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194295, null));
    }

    public final void cancelEditing() {
        GroupDetail groupInfo = this._uiState.getValue().getGroupInfo();
        if (groupInfo != null) {
            this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, groupInfo.getName(), groupInfo.getIntroduction(), groupInfo.getAvatarUrl(), groupInfo.getDirectJoin(), groupInfo.getHistoryMsgEnabled(), groupInfo.isPrivate(), groupInfo.getCategoryName(), groupInfo.getCategoryId(), false, null, false, false, false, false, false, 4161655, null));
        }
    }

    public final void saveEditing() {
        GroupSettingsUiState currentState = this._uiState.getValue();
        GroupDetail groupInfo = currentState.getGroupInfo();
        if (groupInfo == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39971(groupInfo, currentState, null), 3, null);
    }

    /* compiled from: GroupSettingsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupSettingsViewModel$saveEditing$1", m185f = "GroupSettingsViewModel.kt", m186i = {}, m187l = {205}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupSettingsViewModel$saveEditing$1 */
    static final class C39971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GroupSettingsUiState $currentState;
        final /* synthetic */ GroupDetail $groupInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39971(GroupDetail groupDetail, GroupSettingsUiState groupSettingsUiState, Continuation<? super C39971> continuation) {
            super(2, continuation);
            this.$groupInfo = groupDetail;
            this.$currentState = groupSettingsUiState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupSettingsViewModel.this.new C39971(this.$groupInfo, this.$currentState, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Log.d(GroupSettingsViewModel.this.tag, "Saving group settings for: " + this.$groupInfo.getGroupId());
                    GroupSettingsViewModel.this._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) GroupSettingsViewModel.this._uiState.getValue(), false, null, null, false, true, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194255, null));
                    this.label = 1;
                    Object objM8570editGroupInfoLiYkppA = GroupSettingsViewModel.this.groupRepository.m8570editGroupInfoLiYkppA(this.$groupInfo.getGroupId(), this.$currentState.getEditedName(), this.$currentState.getEditedIntroduction(), this.$currentState.getEditedAvatarUrl(), this.$currentState.getEditedDirectJoin(), this.$currentState.getEditedHistoryMsg(), this.$currentState.getEditedCategoryName(), this.$currentState.getEditedCategoryId(), this.$currentState.getEditedPrivate(), this);
                    if (objM8570editGroupInfoLiYkppA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8570editGroupInfoLiYkppA;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupSettingsViewModel groupSettingsViewModel = GroupSettingsViewModel.this;
            GroupDetail groupDetail = this.$groupInfo;
            GroupSettingsViewModel groupSettingsViewModel2 = GroupSettingsViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                Log.d(groupSettingsViewModel.tag, "\u2705 Group settings saved successfully");
                groupSettingsViewModel._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) groupSettingsViewModel._uiState.getValue(), false, null, null, false, false, null, true, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194215, null));
                groupSettingsViewModel.loadGroupInfo(groupDetail.getGroupId());
            } else {
                Log.e(groupSettingsViewModel2.tag, "\u274c Failed to save group settings", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = groupSettingsViewModel2._uiState;
                GroupSettingsUiState groupSettingsUiState = (GroupSettingsUiState) groupSettingsViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u4fdd\u5b58\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupSettingsUiState.copy$default(groupSettingsUiState, false, null, null, false, false, message, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194255, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateEditedName(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, str, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194175, null));
    }

    public final void updateEditedIntroduction(String introduction) {
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, introduction, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194047, null));
    }

    public final void updateEditedAvatarUrl(String avatarUrl) {
        Intrinsics.checkNotNullParameter(avatarUrl, "avatarUrl");
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, avatarUrl, false, false, false, null, 0L, false, null, false, false, false, false, false, 4193791, null));
    }

    public final void updateEditedDirectJoin(boolean directJoin) {
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, directJoin, false, false, null, 0L, false, null, false, false, false, false, false, 4193279, null));
    }

    public final void updateEditedHistoryMsg(boolean historyMsg) {
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, historyMsg, false, null, 0L, false, null, false, false, false, false, false, 4192255, null));
    }

    public final void updateEditedPrivate(boolean isPrivate) {
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, isPrivate, null, 0L, false, null, false, false, false, false, false, 4190207, null));
    }

    public final void updateEditedCategoryName(String categoryName) {
        Intrinsics.checkNotNullParameter(categoryName, "categoryName");
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, categoryName, 0L, false, null, false, false, false, false, false, 4186111, null));
    }

    public final void clearError() {
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194301, null));
    }

    public final void clearSaveError() {
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194271, null));
    }

    public final boolean isAdminOrOwner() {
        GroupDetail groupInfo = this._uiState.getValue().getGroupInfo();
        if (groupInfo == null) {
            return false;
        }
        return groupInfo.getPermissionLevel() == 100 || groupInfo.getPermissionLevel() == 2;
    }

    public final void showMessageTypeLimitDialog() {
        Set setEmptySet;
        GroupDetail groupInfo = this._uiState.getValue().getGroupInfo();
        if (groupInfo == null) {
            return;
        }
        if (groupInfo.getLimitedMsgType().length() > 0) {
            Iterable iterableSplit$default = StringsKt.split$default((CharSequence) groupInfo.getLimitedMsgType(), new String[]{","}, false, 0, 6, (Object) null);
            Collection arrayList = new ArrayList();
            Iterator it = iterableSplit$default.iterator();
            while (it.hasNext()) {
                Integer intOrNull = StringsKt.toIntOrNull((String) it.next());
                if (intOrNull != null) {
                    arrayList.add(intOrNull);
                }
            }
            setEmptySet = CollectionsKt.toSet((List) arrayList);
        } else {
            setEmptySet = SetsKt.emptySet();
        }
        Set currentTypes = setEmptySet;
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, true, currentTypes, false, false, false, false, false, 4095999, null));
    }

    public final void dismissMessageTypeLimitDialog() {
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, SetsKt.emptySet(), false, false, false, false, false, 4095999, null));
    }

    public final void toggleMessageType(int type) {
        Set setPlus;
        Set current = this._uiState.getValue().getSelectedMessageTypes();
        if (current.contains(Integer.valueOf(type))) {
            setPlus = SetsKt.minus((Set<? extends Integer>) current, Integer.valueOf(type));
        } else {
            setPlus = SetsKt.plus((Set<? extends Integer>) current, Integer.valueOf(type));
        }
        Set updated = setPlus;
        this._uiState.setValue(GroupSettingsUiState.copy$default(this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, updated, false, false, false, false, false, 4128767, null));
    }

    public final void confirmMessageTypeLimit() {
        GroupDetail groupInfo = this._uiState.getValue().getGroupInfo();
        if (groupInfo == null) {
            return;
        }
        Set selectedTypes = this._uiState.getValue().getSelectedMessageTypes();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39941(selectedTypes, groupInfo, null), 3, null);
    }

    /* compiled from: GroupSettingsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupSettingsViewModel$confirmMessageTypeLimit$1", m185f = "GroupSettingsViewModel.kt", m186i = {0}, m187l = {342}, m188m = "invokeSuspend", m189n = {"typeString"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupSettingsViewModel$confirmMessageTypeLimit$1 */
    static final class C39941 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GroupDetail $groupInfo;
        final /* synthetic */ Set<Integer> $selectedTypes;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C39941(Set<Integer> set, GroupDetail groupDetail, Continuation<? super C39941> continuation) {
            super(2, continuation);
            this.$selectedTypes = set;
            this.$groupInfo = groupDetail;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupSettingsViewModel.this.new C39941(this.$selectedTypes, this.$groupInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39941) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    GroupSettingsViewModel.this._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) GroupSettingsViewModel.this._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, true, false, false, false, false, 4063231, null));
                    String typeString = CollectionsKt.joinToString$default(CollectionsKt.sorted(this.$selectedTypes), ",", null, null, 0, null, null, 62, null);
                    Log.d(GroupSettingsViewModel.this.tag, "Setting message type limit: " + typeString);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(typeString);
                    this.label = 1;
                    Object objM8587setMessageTypeLimit0E7RQCE = GroupSettingsViewModel.this.groupRepository.m8587setMessageTypeLimit0E7RQCE(this.$groupInfo.getGroupId(), typeString, this);
                    if (objM8587setMessageTypeLimit0E7RQCE != coroutine_suspended) {
                        value = objM8587setMessageTypeLimit0E7RQCE;
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
            GroupSettingsViewModel groupSettingsViewModel = GroupSettingsViewModel.this;
            GroupDetail groupDetail = this.$groupInfo;
            GroupSettingsViewModel groupSettingsViewModel2 = GroupSettingsViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                Log.d(groupSettingsViewModel.tag, "\u2705 Message type limit set successfully");
                groupSettingsViewModel._uiState.setValue(GroupSettingsUiState.copy$default((GroupSettingsUiState) groupSettingsViewModel._uiState.getValue(), false, null, null, false, false, null, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4030463, null));
                groupSettingsViewModel.loadGroupInfo(groupDetail.getGroupId());
            } else {
                Log.e(groupSettingsViewModel2.tag, "\u274c Failed to set message type limit", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = groupSettingsViewModel2._uiState;
                GroupSettingsUiState groupSettingsUiState = (GroupSettingsUiState) groupSettingsViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u8bbe\u7f6e\u6d88\u606f\u7c7b\u578b\u9650\u5236\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupSettingsUiState.copy$default(groupSettingsUiState, false, null, null, false, false, message, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4063199, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final String getCurrentUserId() {
        String userIdSync = this.tokenRepository.getUserIdSync();
        return userIdSync == null ? "" : userIdSync;
    }

    /* compiled from: GroupSettingsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.GroupSettingsViewModel$editGroupKeyword$1", m185f = "GroupSettingsViewModel.kt", m186i = {}, m187l = {375}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.GroupSettingsViewModel$editGroupKeyword$1 */
    static final class C39951 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $groupId;
        final /* synthetic */ String $keyword;
        final /* synthetic */ Function1<Boolean, Unit> $onResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C39951(String str, String str2, Function1<? super Boolean, Unit> function1, Continuation<? super C39951> continuation) {
            super(2, continuation);
            this.$groupId = str;
            this.$keyword = str2;
            this.$onResult = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GroupSettingsViewModel.this.new C39951(this.$groupId, this.$keyword, this.$onResult, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C39951) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8571editGroupKeyword0E7RQCE = GroupSettingsViewModel.this.groupRepository.m8571editGroupKeyword0E7RQCE(this.$groupId, this.$keyword, this);
                    if (objM8571editGroupKeyword0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8571editGroupKeyword0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            GroupSettingsViewModel groupSettingsViewModel = GroupSettingsViewModel.this;
            Function1<Boolean, Unit> function1 = this.$onResult;
            GroupSettingsViewModel groupSettingsViewModel2 = GroupSettingsViewModel.this;
            Function1<Boolean, Unit> function12 = this.$onResult;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                Log.d(groupSettingsViewModel.tag, "\u2705 \u7fa4\u53e3\u4ee4\u4fee\u6539\u6210\u529f");
                function1.invoke(Boxing.boxBoolean(true));
            } else {
                Log.e(groupSettingsViewModel2.tag, "\u274c \u7fa4\u53e3\u4ee4\u4fee\u6539\u5931\u8d25", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = groupSettingsViewModel2._uiState;
                GroupSettingsUiState groupSettingsUiState = (GroupSettingsUiState) groupSettingsViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u4fee\u6539\u7fa4\u53e3\u4ee4\u5931\u8d25";
                }
                mutableStateFlow.setValue(GroupSettingsUiState.copy$default(groupSettingsUiState, false, null, null, false, false, message, false, null, null, null, false, false, false, null, 0L, false, null, false, false, false, false, false, 4194271, null));
                function12.invoke(Boxing.boxBoolean(false));
            }
            return Unit.INSTANCE;
        }
    }

    public final void editGroupKeyword(String groupId, String keyword, Function1<? super Boolean, Unit> onResult) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(keyword, "keyword");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C39951(groupId, keyword, onResult, null), 3, null);
    }
}
