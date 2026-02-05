package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.GroupRepository;
import com.yhchat.canarys.p007ui.contacts.Contact;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.user.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import okhttp3.internal.http.StatusLine;

/* compiled from: InviteToGroupDialog.kt */
@Metadata(m168d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0010J$\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/InviteDialogViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "friendRepository", "Lcom/yhchat/canarys/data/repository/FriendRepository;", "groupRepository", "Lcom/yhchat/canarys/data/repository/GroupRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/components/InviteDialogUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadFriends", "inviteFriend", ChatSearchActivity.EXTRA_CHAT_ID, "", "groupId", "onSuccess", "Lkotlin/Function0;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class InviteDialogViewModel extends ViewModel {
    public static final int $stable = 8;
    private FriendRepository friendRepository;
    private GroupRepository groupRepository;
    private final MutableStateFlow<InviteDialogUiState> _uiState = StateFlowKt.MutableStateFlow(new InviteDialogUiState(false, null, null, null, 15, null));
    private final StateFlow<InviteDialogUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<InviteDialogUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.friendRepository = RepositoryFactory.INSTANCE.getFriendRepository(context);
        this.groupRepository = RepositoryFactory.INSTANCE.getGroupRepository(context);
    }

    /* compiled from: InviteToGroupDialog.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.InviteDialogViewModel$loadFriends$1", m185f = "InviteToGroupDialog.kt", m186i = {}, m187l = {270}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.InviteDialogViewModel$loadFriends$1 */
    static final class C36631 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C36631(Continuation<? super C36631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InviteDialogViewModel.this.new C36631(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    InviteDialogViewModel.this._uiState.setValue(InviteDialogUiState.copy$default((InviteDialogUiState) InviteDialogViewModel.this._uiState.getValue(), true, null, null, null, 6, null));
                    FriendRepository friendRepository = InviteDialogViewModel.this.friendRepository;
                    if (friendRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("friendRepository");
                        friendRepository = null;
                    }
                    this.label = 1;
                    Object objM8561getAddressBookListIoAF18A = friendRepository.m8561getAddressBookListIoAF18A(this);
                    if (objM8561getAddressBookListIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8561getAddressBookListIoAF18A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InviteDialogViewModel inviteDialogViewModel = InviteDialogViewModel.this;
            InviteDialogViewModel inviteDialogViewModel2 = InviteDialogViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                User.address_book_list address_book_listVar = (User.address_book_list) value;
                List arrayList = new ArrayList();
                Iterable<User.address_book_list.Data> dataList = address_book_listVar.getDataList();
                Intrinsics.checkNotNullExpressionValue(dataList, "getDataList(...)");
                for (User.address_book_list.Data data : dataList) {
                    if (Intrinsics.areEqual(data.getListName(), "\u597d\u53cb") || Intrinsics.areEqual(data.getListName(), "\u7528\u6237")) {
                        Iterable<User.address_book_list.Data.Data_list> dataList2 = data.getDataList();
                        Intrinsics.checkNotNullExpressionValue(dataList2, "getDataList(...)");
                        for (User.address_book_list.Data.Data_list data_list : dataList2) {
                            String chatId = data_list.getChatId();
                            User.address_book_list address_book_listVar2 = address_book_listVar;
                            Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
                            String name = data_list.getName();
                            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                            String avatarUrl = data_list.getAvatarUrl();
                            Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
                            arrayList.add(new Contact(chatId, name, avatarUrl, 0, false, 1, 24, null));
                            address_book_listVar = address_book_listVar2;
                        }
                    }
                    address_book_listVar = address_book_listVar;
                }
                inviteDialogViewModel._uiState.setValue(InviteDialogUiState.copy$default((InviteDialogUiState) inviteDialogViewModel._uiState.getValue(), false, arrayList, null, null, 12, null));
            } else {
                inviteDialogViewModel2._uiState.setValue(InviteDialogUiState.copy$default((InviteDialogUiState) inviteDialogViewModel2._uiState.getValue(), false, null, null, thM11922exceptionOrNullimpl.getMessage(), 6, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadFriends() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36631(null), 3, null);
    }

    /* compiled from: InviteToGroupDialog.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.InviteDialogViewModel$inviteFriend$1", m185f = "InviteToGroupDialog.kt", m186i = {}, m187l = {StatusLine.HTTP_PERM_REDIRECT}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.InviteDialogViewModel$inviteFriend$1 */
    static final class C36621 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ String $groupId;
        final /* synthetic */ Function0<Unit> $onSuccess;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36621(String str, String str2, Function0<Unit> function0, Continuation<? super C36621> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$groupId = str2;
            this.$onSuccess = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InviteDialogViewModel.this.new C36621(this.$chatId, this.$groupId, this.$onSuccess, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    InviteDialogViewModel.this._uiState.setValue(InviteDialogUiState.copy$default((InviteDialogUiState) InviteDialogViewModel.this._uiState.getValue(), false, null, this.$chatId, null, 11, null));
                    GroupRepository groupRepository = InviteDialogViewModel.this.groupRepository;
                    if (groupRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("groupRepository");
                        groupRepository = null;
                    }
                    this.label = 1;
                    Object objM8581inviteToGroupBWLJW6A = groupRepository.m8581inviteToGroupBWLJW6A(this.$chatId, 1, this.$groupId, this);
                    if (objM8581inviteToGroupBWLJW6A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8581inviteToGroupBWLJW6A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InviteDialogViewModel inviteDialogViewModel = InviteDialogViewModel.this;
            Function0<Unit> function0 = this.$onSuccess;
            InviteDialogViewModel inviteDialogViewModel2 = InviteDialogViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                ((Boolean) value).booleanValue();
                inviteDialogViewModel._uiState.setValue(InviteDialogUiState.copy$default((InviteDialogUiState) inviteDialogViewModel._uiState.getValue(), false, null, null, null, 11, null));
                function0.invoke();
            } else {
                inviteDialogViewModel2._uiState.setValue(InviteDialogUiState.copy$default((InviteDialogUiState) inviteDialogViewModel2._uiState.getValue(), false, null, null, thM11922exceptionOrNullimpl.getMessage(), 3, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void inviteFriend(String chatId, String groupId, Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36621(chatId, groupId, onSuccess, null), 3, null);
    }
}
