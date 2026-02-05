package com.yhchat.canarys.p007ui.contacts;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.CreatedBot;
import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.proto.friend.FriendProto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: ContactsViewModel.kt */
@Metadata(m168d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0016\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u0006\u0010\u001b\u001a\u00020\u0014J\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\u0014J\u0006\u0010\u001e\u001a\u00020\u0014J\u0006\u0010\u001f\u001a\u00020\u0014J\b\u0010 \u001a\u00020\u0014H\u0002J\u0006\u0010!\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\""}, m169d2 = {"Lcom/yhchat/canarys/ui/contacts/ContactsViewModel;", "Landroidx/lifecycle/ViewModel;", "friendRepository", "Lcom/yhchat/canarys/data/repository/FriendRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "botRepository", "Lcom/yhchat/canarys/data/repository/BotRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/FriendRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/data/repository/BotRepository;)V", "tag", "", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/contacts/ContactsUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadContacts", "", "toggleFriendsExpanded", "toggleFriendRequestsExpanded", "loadFriendRequestList", "selectFriendRequest", "item", "Lcom/yhchat/canarys/ui/contacts/FriendRequestItem;", "agreeSelectedFriendRequest", "rejectSelectedFriendRequest", "toggleGroupsExpanded", "toggleBotsExpanded", "toggleMyBotsExpanded", "loadMyBots", "clearError", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class ContactsViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<ContactsUiState> _uiState;
    private final BotRepository botRepository;
    private final FriendRepository friendRepository;
    private final String tag;
    private final TokenRepository tokenRepository;
    private final StateFlow<ContactsUiState> uiState;

    @Inject
    public ContactsViewModel(FriendRepository friendRepository, TokenRepository tokenRepository, BotRepository botRepository) {
        Intrinsics.checkNotNullParameter(friendRepository, "friendRepository");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        this.friendRepository = friendRepository;
        this.tokenRepository = tokenRepository;
        this.botRepository = botRepository;
        this.tag = "ContactsViewModel";
        this._uiState = StateFlowKt.MutableStateFlow(new ContactsUiState(false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, false, false, false, 131071, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        loadContacts();
    }

    public final StateFlow<ContactsUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: ContactsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.contacts.ContactsViewModel$loadContacts$1", m185f = "ContactsViewModel.kt", m186i = {}, m187l = {108}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.contacts.ContactsViewModel$loadContacts$1 */
    static final class C37001 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C37001(Continuation<? super C37001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactsViewModel.this.new C37001(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:138:0x0250, code lost:
        
            if (r8.equals("\u7528\u6237") == false) goto L139;
         */
        /* JADX WARN: Removed duplicated region for block: B:148:0x02b8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r38) {
            /*
                Method dump skipped, instructions count: 1028
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.contacts.ContactsViewModel.C37001.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loadContacts() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37001(null), 3, null);
    }

    public final void toggleFriendsExpanded() {
        this._uiState.setValue(ContactsUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, false, !this._uiState.getValue().getFriendsExpanded(), false, false, false, 122879, null));
    }

    public final void toggleFriendRequestsExpanded() {
        boolean newExpanded = !this._uiState.getValue().getFriendRequestsExpanded();
        this._uiState.setValue(ContactsUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, newExpanded, null, false, false, false, false, false, 130047, null));
        if (newExpanded && !this._uiState.getValue().getFriendRequestsLoading() && this._uiState.getValue().getFriendRequests().isEmpty()) {
            loadFriendRequestList();
        }
    }

    /* compiled from: ContactsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.contacts.ContactsViewModel$loadFriendRequestList$1", m185f = "ContactsViewModel.kt", m186i = {}, m187l = {218}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.contacts.ContactsViewModel$loadFriendRequestList$1 */
    static final class C37011 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C37011(Continuation<? super C37011> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactsViewModel.this.new C37011(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37011) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ContactsViewModel.this._uiState.setValue(ContactsUiState.copy$default((ContactsUiState) ContactsViewModel.this._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, true, false, null, false, false, false, false, false, 130559, null));
                    this.label = 1;
                    Object objM8562getFriendRequestListIoAF18A = ContactsViewModel.this.friendRepository.m8562getFriendRequestListIoAF18A(this);
                    if (objM8562getFriendRequestListIoAF18A == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    value = objM8562getFriendRequestListIoAF18A;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ContactsViewModel contactsViewModel = ContactsViewModel.this;
            ContactsViewModel contactsViewModel2 = ContactsViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                FriendProto.request_list request_listVar = (FriendProto.request_list) value;
                Iterable requestsList = request_listVar.getRequestsList();
                Intrinsics.checkNotNullExpressionValue(requestsList, "getRequestsList(...)");
                Iterable<FriendProto.request_list.Request> iterable = requestsList;
                Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                for (FriendProto.request_list.Request request : iterable) {
                    long requestId = request.getRequestId();
                    String receiverName = request.getReceiverName();
                    FriendProto.request_list request_listVar2 = request_listVar;
                    Intrinsics.checkNotNullExpressionValue(receiverName, "getReceiverName(...)");
                    String receiverAvatar = request.getReceiverAvatar();
                    Intrinsics.checkNotNullExpressionValue(receiverAvatar, "getReceiverAvatar(...)");
                    String name = request.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    String avatar = request.getAvatar();
                    Intrinsics.checkNotNullExpressionValue(avatar, "getAvatar(...)");
                    String groupName = request.getGroupName();
                    Intrinsics.checkNotNullExpressionValue(groupName, "getGroupName(...)");
                    String groupAvatar = request.getGroupAvatar();
                    Intrinsics.checkNotNullExpressionValue(groupAvatar, "getGroupAvatar(...)");
                    String inviterId = request.getInviterId();
                    Intrinsics.checkNotNullExpressionValue(inviterId, "getInviterId(...)");
                    int sourceType = request.getSourceType();
                    int targetType = request.getTargetType();
                    String targetId = request.getTargetId();
                    Intrinsics.checkNotNullExpressionValue(targetId, "getTargetId(...)");
                    String receiverId = request.getReceiverId();
                    Intrinsics.checkNotNullExpressionValue(receiverId, "getReceiverId(...)");
                    int result = request.getResult();
                    long processedAt = request.getProcessedAt();
                    long inviteAt = request.getInviteAt();
                    String inviteAtStr = request.getInviteAtStr();
                    Intrinsics.checkNotNullExpressionValue(inviteAtStr, "getInviteAtStr(...)");
                    String botName = request.getBotName();
                    Intrinsics.checkNotNullExpressionValue(botName, "getBotName(...)");
                    String botAvatar = request.getBotAvatar();
                    Intrinsics.checkNotNullExpressionValue(botAvatar, "getBotAvatar(...)");
                    String processorName = request.getProcessorName();
                    Intrinsics.checkNotNullExpressionValue(processorName, "getProcessorName(...)");
                    String note = request.getNote();
                    Intrinsics.checkNotNullExpressionValue(note, "getNote(...)");
                    arrayList.add(new FriendRequestItem(requestId, receiverName, receiverAvatar, name, avatar, groupName, groupAvatar, inviterId, sourceType, targetType, targetId, receiverId, result, processedAt, inviteAt, inviteAtStr, botName, botAvatar, processorName, note));
                    request_listVar = request_listVar2;
                }
                FriendProto.request_list request_listVar3 = request_listVar;
                contactsViewModel._uiState.setValue(ContactsUiState.copy$default((ContactsUiState) contactsViewModel._uiState.getValue(), false, null, null, null, null, null, (List) arrayList, request_listVar3.getTotal(), request_listVar3.getPending(), false, false, null, false, false, false, false, false, 130111, null));
            } else {
                Log.e(contactsViewModel2.tag, "\u274c \u8bf7\u6c42/\u9080\u8bf7\u5217\u8868\u52a0\u8f7d\u5931\u8d25", thM11922exceptionOrNullimpl);
                contactsViewModel2._uiState.setValue(ContactsUiState.copy$default((ContactsUiState) contactsViewModel2._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, false, false, false, 130559, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadFriendRequestList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37011(null), 3, null);
    }

    public final void selectFriendRequest(FriendRequestItem item) {
        this._uiState.setValue(ContactsUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, item, false, false, false, false, false, 129023, null));
    }

    public final void agreeSelectedFriendRequest() {
        FriendRequestItem item = this._uiState.getValue().getSelectedFriendRequest();
        if (item == null || this._uiState.getValue().getFriendRequestProcessing()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36991(item, null), 3, null);
    }

    /* compiled from: ContactsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.contacts.ContactsViewModel$agreeSelectedFriendRequest$1", m185f = "ContactsViewModel.kt", m186i = {}, m187l = {269}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.contacts.ContactsViewModel$agreeSelectedFriendRequest$1 */
    static final class C36991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FriendRequestItem $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36991(FriendRequestItem friendRequestItem, Continuation<? super C36991> continuation) {
            super(2, continuation);
            this.$item = friendRequestItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactsViewModel.this.new C36991(this.$item, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ContactsViewModel.this._uiState.setValue(ContactsUiState.copy$default((ContactsUiState) ContactsViewModel.this._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, true, false, false, false, false, 126975, null));
                    this.label = 1;
                    Object objM8560agreeApply0E7RQCE = ContactsViewModel.this.friendRepository.m8560agreeApply0E7RQCE(this.$item.getRequestId(), 1, this);
                    if (objM8560agreeApply0E7RQCE != coroutine_suspended) {
                        value = objM8560agreeApply0E7RQCE;
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
            ContactsViewModel contactsViewModel = ContactsViewModel.this;
            ContactsViewModel contactsViewModel2 = ContactsViewModel.this;
            if (Result.m11922exceptionOrNullimpl(value) == null) {
                contactsViewModel._uiState.setValue(ContactsUiState.copy$default((ContactsUiState) contactsViewModel._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, false, false, false, 126975, null));
                contactsViewModel.loadFriendRequestList();
            } else {
                contactsViewModel2._uiState.setValue(ContactsUiState.copy$default((ContactsUiState) contactsViewModel2._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, false, false, false, 126975, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void rejectSelectedFriendRequest() {
        FriendRequestItem item = this._uiState.getValue().getSelectedFriendRequest();
        if (item == null || this._uiState.getValue().getFriendRequestProcessing()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37031(item, null), 3, null);
    }

    /* compiled from: ContactsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.contacts.ContactsViewModel$rejectSelectedFriendRequest$1", m185f = "ContactsViewModel.kt", m186i = {}, m187l = {287}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.contacts.ContactsViewModel$rejectSelectedFriendRequest$1 */
    static final class C37031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FriendRequestItem $item;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C37031(FriendRequestItem friendRequestItem, Continuation<? super C37031> continuation) {
            super(2, continuation);
            this.$item = friendRequestItem;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactsViewModel.this.new C37031(this.$item, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ContactsViewModel.this._uiState.setValue(ContactsUiState.copy$default((ContactsUiState) ContactsViewModel.this._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, true, false, false, false, false, 126975, null));
                    this.label = 1;
                    Object objM8560agreeApply0E7RQCE = ContactsViewModel.this.friendRepository.m8560agreeApply0E7RQCE(this.$item.getRequestId(), 2, this);
                    if (objM8560agreeApply0E7RQCE != coroutine_suspended) {
                        value = objM8560agreeApply0E7RQCE;
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
            ContactsViewModel contactsViewModel = ContactsViewModel.this;
            ContactsViewModel contactsViewModel2 = ContactsViewModel.this;
            if (Result.m11922exceptionOrNullimpl(value) == null) {
                contactsViewModel._uiState.setValue(ContactsUiState.copy$default((ContactsUiState) contactsViewModel._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, false, false, false, 126975, null));
                contactsViewModel.loadFriendRequestList();
            } else {
                contactsViewModel2._uiState.setValue(ContactsUiState.copy$default((ContactsUiState) contactsViewModel2._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, false, false, false, 126975, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void toggleGroupsExpanded() {
        this._uiState.setValue(ContactsUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, !this._uiState.getValue().getGroupsExpanded(), false, false, 114687, null));
    }

    public final void toggleBotsExpanded() {
        this._uiState.setValue(ContactsUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, false, !this._uiState.getValue().getBotsExpanded(), false, 98303, null));
    }

    public final void toggleMyBotsExpanded() {
        boolean newExpanded = !this._uiState.getValue().getMyBotsExpanded();
        this._uiState.setValue(ContactsUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, false, false, newExpanded, 65535, null));
        if (newExpanded && this._uiState.getValue().getMyBots().isEmpty()) {
            loadMyBots();
        }
    }

    /* compiled from: ContactsViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.contacts.ContactsViewModel$loadMyBots$1", m185f = "ContactsViewModel.kt", m186i = {}, m187l = {340}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.contacts.ContactsViewModel$loadMyBots$1 */
    static final class C37021 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C37021(Continuation<? super C37021> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ContactsViewModel.this.new C37021(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C37021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        Log.d(ContactsViewModel.this.tag, "\u5f00\u59cb\u52a0\u8f7d\u6211\u521b\u5efa\u7684\u673a\u5668\u4eba\u5217\u8868...");
                        this.label = 1;
                        Object objM8486getMyBotListIoAF18A = ContactsViewModel.this.botRepository.m8486getMyBotListIoAF18A(this);
                        if (objM8486getMyBotListIoAF18A == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8486getMyBotListIoAF18A;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ContactsViewModel contactsViewModel = ContactsViewModel.this;
                ContactsViewModel contactsViewModel2 = ContactsViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl == null) {
                    List list = (List) result;
                    Log.d(contactsViewModel.tag, "\u2705 \u6211\u521b\u5efa\u7684\u673a\u5668\u4eba\u5217\u8868\u52a0\u8f7d\u6210\u529f\uff0c\u5171 " + list.size() + " \u4e2a");
                    List<CreatedBot> list2 = list;
                    Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (CreatedBot createdBot : list2) {
                        arrayList.add(new Contact(createdBot.getBotId(), createdBot.getNickname(), createdBot.getAvatarUrl(), 0, false, 3, 24, null));
                    }
                    contactsViewModel._uiState.setValue(ContactsUiState.copy$default((ContactsUiState) contactsViewModel._uiState.getValue(), false, null, null, null, null, (List) arrayList, null, 0, 0, false, false, null, false, false, false, false, false, 131039, null));
                } else {
                    Boxing.boxInt(Log.e(contactsViewModel2.tag, "\u274c \u52a0\u8f7d\u6211\u521b\u5efa\u7684\u673a\u5668\u4eba\u5217\u8868\u5931\u8d25", thM11922exceptionOrNullimpl));
                }
            } catch (Exception e) {
                Boxing.boxInt(Log.e(ContactsViewModel.this.tag, "\u52a0\u8f7d\u6211\u521b\u5efa\u7684\u673a\u5668\u4eba\u5217\u8868\u5f02\u5e38", e));
            }
            return Unit.INSTANCE;
        }
    }

    private final void loadMyBots() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C37021(null), 3, null);
    }

    public final void clearError() {
        this._uiState.setValue(ContactsUiState.copy$default(this._uiState.getValue(), false, null, null, null, null, null, null, 0, 0, false, false, null, false, false, false, false, false, 131069, null));
    }
}
