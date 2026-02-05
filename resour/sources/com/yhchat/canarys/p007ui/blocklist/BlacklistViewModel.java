package com.yhchat.canarys.p007ui.blocklist;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.local.BlockedUser;
import com.yhchat.canarys.data.repository.BlocklistRepository;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.List;
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
import kotlin.p008io.CloseableKt;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: BlacklistActivity.kt */
@Metadata(m168d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0014J\u0006\u0010 \u001a\u00020\u0014J\u0016\u0010!\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#J\u0006\u0010%\u001a\u00020\u0014J\u001e\u0010&\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020#2\u0006\u0010'\u001a\u00020\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e\u00a8\u0006("}, m169d2 = {"Lcom/yhchat/canarys/ui/blocklist/BlacklistViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "repository", "Lcom/yhchat/canarys/data/repository/BlocklistRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/blocklist/BlacklistUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "_importDialogState", "Lcom/yhchat/canarys/ui/blocklist/ImportDialogState;", "importDialogState", "getImportDialogState", "loadSettings", "", "setBlocklistEnabled", "enabled", "", "loadBlockedUsers", "unblockUser", "userId", "", "updateBlockedUser", "user", "Lcom/yhchat/canarys/data/local/BlockedUser;", "clearError", "clearMessage", "exportBlocklist", "uri", "Landroid/net/Uri;", "showImportModeDialog", "dismissImportDialog", "importBlocklist", "mergeMode", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class BlacklistViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<ImportDialogState> _importDialogState;
    private final MutableStateFlow<BlacklistUiState> _uiState;
    private final StateFlow<ImportDialogState> importDialogState;
    private final BlocklistRepository repository;
    private final StateFlow<BlacklistUiState> uiState;

    public BlacklistViewModel(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.repository = new BlocklistRepository(context);
        this._uiState = StateFlowKt.MutableStateFlow(new BlacklistUiState(null, false, false, null, null, 31, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
        this._importDialogState = StateFlowKt.MutableStateFlow(null);
        this.importDialogState = FlowKt.asStateFlow(this._importDialogState);
        loadBlockedUsers();
        loadSettings();
    }

    public final StateFlow<BlacklistUiState> getUiState() {
        return this.uiState;
    }

    public final StateFlow<ImportDialogState> getImportDialogState() {
        return this.importDialogState;
    }

    private final void loadSettings() {
        this._uiState.setValue(BlacklistUiState.copy$default(this._uiState.getValue(), null, this.repository.isBlocklistEnabled(), false, null, null, 29, null));
    }

    public final void setBlocklistEnabled(boolean enabled) {
        this.repository.setBlocklistEnabled(enabled);
        this._uiState.setValue(BlacklistUiState.copy$default(this._uiState.getValue(), null, enabled, false, null, enabled ? "\u9ed1\u540d\u5355\u5df2\u542f\u7528" : "\u9ed1\u540d\u5355\u5df2\u5173\u95ed", 13, null));
    }

    /* compiled from: BlacklistActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.blocklist.BlacklistViewModel$loadBlockedUsers$1", m185f = "BlacklistActivity.kt", m186i = {}, m187l = {136}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.blocklist.BlacklistViewModel$loadBlockedUsers$1 */
    static final class C31461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C31461(Continuation<? super C31461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlacklistViewModel.this.new C31461(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    Flow<List<BlockedUser>> allBlockedUsers = BlacklistViewModel.this.repository.getAllBlockedUsers();
                    final BlacklistViewModel blacklistViewModel = BlacklistViewModel.this;
                    this.label = 1;
                    if (allBlockedUsers.collect(new FlowCollector() { // from class: com.yhchat.canarys.ui.blocklist.BlacklistViewModel.loadBlockedUsers.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                            return emit((List<BlockedUser>) value, (Continuation<? super Unit>) $completion);
                        }

                        public final Object emit(List<BlockedUser> list, Continuation<? super Unit> continuation) {
                            blacklistViewModel._uiState.setValue(BlacklistUiState.copy$default((BlacklistUiState) blacklistViewModel._uiState.getValue(), list, false, false, null, null, 26, null));
                            return Unit.INSTANCE;
                        }
                    }, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBlockedUsers() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31461(null), 3, null);
    }

    /* compiled from: BlacklistActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.blocklist.BlacklistViewModel$unblockUser$1", m185f = "BlacklistActivity.kt", m186i = {}, m187l = {147}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.blocklist.BlacklistViewModel$unblockUser$1 */
    static final class C31471 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $userId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31471(String str, Continuation<? super C31471> continuation) {
            super(2, continuation);
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlacklistViewModel.this.new C31471(this.$userId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8479unblockUsergIAlus = BlacklistViewModel.this.repository.m8479unblockUsergIAlus(this.$userId, this);
                    if (objM8479unblockUsergIAlus != coroutine_suspended) {
                        value = objM8479unblockUsergIAlus;
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
            BlacklistViewModel blacklistViewModel = BlacklistViewModel.this;
            BlacklistViewModel blacklistViewModel2 = BlacklistViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                blacklistViewModel._uiState.setValue(BlacklistUiState.copy$default((BlacklistUiState) blacklistViewModel._uiState.getValue(), null, false, false, null, "\u5df2\u79fb\u9664\u5c4f\u853d", 15, null));
            } else {
                blacklistViewModel2._uiState.setValue(BlacklistUiState.copy$default((BlacklistUiState) blacklistViewModel2._uiState.getValue(), null, false, false, thM11922exceptionOrNullimpl.getMessage(), null, 23, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void unblockUser(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31471(userId, null), 3, null);
    }

    /* compiled from: BlacklistActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.blocklist.BlacklistViewModel$updateBlockedUser$1", m185f = "BlacklistActivity.kt", m186i = {}, m187l = {164}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.blocklist.BlacklistViewModel$updateBlockedUser$1 */
    static final class C31481 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BlockedUser $user;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31481(BlockedUser blockedUser, Continuation<? super C31481> continuation) {
            super(2, continuation);
            this.$user = blockedUser;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlacklistViewModel.this.new C31481(this.$user, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8480updateBlockedUsergIAlus = BlacklistViewModel.this.repository.m8480updateBlockedUsergIAlus(this.$user, this);
                    if (objM8480updateBlockedUsergIAlus != coroutine_suspended) {
                        value = objM8480updateBlockedUsergIAlus;
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
            BlacklistViewModel blacklistViewModel = BlacklistViewModel.this;
            BlacklistViewModel blacklistViewModel2 = BlacklistViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                blacklistViewModel._uiState.setValue(BlacklistUiState.copy$default((BlacklistUiState) blacklistViewModel._uiState.getValue(), null, false, false, null, "\u5df2\u66f4\u65b0", 15, null));
            } else {
                blacklistViewModel2._uiState.setValue(BlacklistUiState.copy$default((BlacklistUiState) blacklistViewModel2._uiState.getValue(), null, false, false, thM11922exceptionOrNullimpl.getMessage(), null, 23, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void updateBlockedUser(BlockedUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31481(user, null), 3, null);
    }

    public final void clearError() {
        this._uiState.setValue(BlacklistUiState.copy$default(this._uiState.getValue(), null, false, false, null, null, 23, null));
    }

    public final void clearMessage() {
        this._uiState.setValue(BlacklistUiState.copy$default(this._uiState.getValue(), null, false, false, null, null, 15, null));
    }

    /* compiled from: BlacklistActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.blocklist.BlacklistViewModel$exportBlocklist$1", m185f = "BlacklistActivity.kt", m186i = {}, m187l = {190}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.blocklist.BlacklistViewModel$exportBlocklist$1 */
    static final class C31441 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31441(Context context, Uri uri, Continuation<? super C31441> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$uri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BlacklistViewModel.this.new C31441(this.$context, this.$uri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) throws FileNotFoundException {
            Object objExportToJson;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.label = 1;
                        objExportToJson = BlacklistViewModel.this.repository.exportToJson(this);
                        if (objExportToJson == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        objExportToJson = $result;
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String json = (String) objExportToJson;
                OutputStream outputStreamOpenOutputStream = this.$context.getContentResolver().openOutputStream(this.$uri);
                if (outputStreamOpenOutputStream != null) {
                    OutputStream outputStream = outputStreamOpenOutputStream;
                    try {
                        byte[] bytes = json.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                        outputStream.write(bytes);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(outputStream, null);
                    } finally {
                    }
                }
                BlacklistViewModel.this._uiState.setValue(BlacklistUiState.copy$default((BlacklistUiState) BlacklistViewModel.this._uiState.getValue(), null, false, false, null, "\u5bfc\u51fa\u6210\u529f", 15, null));
            } catch (Exception e) {
                BlacklistViewModel.this._uiState.setValue(BlacklistUiState.copy$default((BlacklistUiState) BlacklistViewModel.this._uiState.getValue(), null, false, false, "\u5bfc\u51fa\u5931\u8d25: " + e.getMessage(), null, 23, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void exportBlocklist(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31441(context, uri, null), 3, null);
    }

    public final void showImportModeDialog(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this._importDialogState.setValue(new ImportDialogState(uri));
    }

    public final void dismissImportDialog() {
        this._importDialogState.setValue(null);
    }

    /* compiled from: BlacklistActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.blocklist.BlacklistViewModel$importBlocklist$1", m185f = "BlacklistActivity.kt", m186i = {0}, m187l = {221}, m188m = "invokeSuspend", m189n = {"json"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.blocklist.BlacklistViewModel$importBlocklist$1 */
    static final class C31451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $mergeMode;
        final /* synthetic */ Uri $uri;
        Object L$0;
        int label;
        final /* synthetic */ BlacklistViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31451(Context context, Uri uri, BlacklistViewModel blacklistViewModel, boolean z, Continuation<? super C31451> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$uri = uri;
            this.this$0 = blacklistViewModel;
            this.$mergeMode = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31451(this.$context, this.$uri, this.this$0, this.$mergeMode, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: Exception -> 0x00f6, TryCatch #1 {Exception -> 0x00f6, blocks: (B:7:0x0015, B:27:0x006f, B:29:0x0079, B:30:0x00bb, B:10:0x0024, B:12:0x0033, B:14:0x0044, B:20:0x004d, B:21:0x0050, B:23:0x0053, B:13:0x0035, B:18:0x004b), top: B:38:0x0006, inners: #0, #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00bb A[Catch: Exception -> 0x00f6, TRY_LEAVE, TryCatch #1 {Exception -> 0x00f6, blocks: (B:7:0x0015, B:27:0x006f, B:29:0x0079, B:30:0x00bb, B:10:0x0024, B:12:0x0033, B:14:0x0044, B:20:0x004d, B:21:0x0050, B:23:0x0053, B:13:0x0035, B:18:0x004b), top: B:38:0x0006, inners: #0, #2 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.io.FileNotFoundException {
            /*
                Method dump skipped, instructions count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.blocklist.BlacklistViewModel.C31451.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void importBlocklist(Context context, Uri uri, boolean mergeMode) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31451(context, uri, this, mergeMode, null), 3, null);
    }
}
