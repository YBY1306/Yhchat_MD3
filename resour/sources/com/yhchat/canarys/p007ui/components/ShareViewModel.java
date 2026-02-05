package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.ShareData;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.ShareRepository;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
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

/* compiled from: ShareDialog.kt */
@Metadata(m168d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, m169d2 = {"Lcom/yhchat/canarys/ui/components/ShareViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "shareRepository", "Lcom/yhchat/canarys/data/repository/ShareRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/components/ShareUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "createShareLink", ChatSearchActivity.EXTRA_CHAT_ID, "", ChatSearchActivity.EXTRA_CHAT_TYPE, "", ChatSearchActivity.EXTRA_CHAT_NAME, "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ShareViewModel extends ViewModel {
    public static final int $stable = 8;
    private ShareRepository shareRepository;
    private final MutableStateFlow<ShareUiState> _uiState = StateFlowKt.MutableStateFlow(new ShareUiState(false, null, null, 7, null));
    private final StateFlow<ShareUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<ShareUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.shareRepository = RepositoryFactory.INSTANCE.getShareRepository(context);
    }

    /* compiled from: ShareDialog.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.ShareViewModel$createShareLink$1", m185f = "ShareDialog.kt", m186i = {}, m187l = {221}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.ShareViewModel$createShareLink$1 */
    static final class C36761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ String $chatName;
        final /* synthetic */ int $chatType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36761(String str, int i, String str2, Continuation<? super C36761> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$chatType = i;
            this.$chatName = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShareViewModel.this.new C36761(this.$chatId, this.$chatType, this.$chatName, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ShareViewModel.this._uiState.setValue(ShareUiState.copy$default((ShareUiState) ShareViewModel.this._uiState.getValue(), true, null, null, 2, null));
                    ShareRepository shareRepository = ShareViewModel.this.shareRepository;
                    if (shareRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shareRepository");
                        shareRepository = null;
                    }
                    this.label = 1;
                    Object objM8625createShareLinkBWLJW6A = shareRepository.m8625createShareLinkBWLJW6A(this.$chatId, this.$chatType, this.$chatName, this);
                    if (objM8625createShareLinkBWLJW6A != coroutine_suspended) {
                        value = objM8625createShareLinkBWLJW6A;
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
            ShareViewModel shareViewModel = ShareViewModel.this;
            ShareViewModel shareViewModel2 = ShareViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                shareViewModel._uiState.setValue(ShareUiState.copy$default((ShareUiState) shareViewModel._uiState.getValue(), false, (ShareData) value, null, 4, null));
            } else {
                shareViewModel2._uiState.setValue(ShareUiState.copy$default((ShareUiState) shareViewModel2._uiState.getValue(), false, null, thM11922exceptionOrNullimpl.getMessage(), 2, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void createShareLink(String chatId, int chatType, String chatName) {
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(chatName, "chatName");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C36761(chatId, chatType, chatName, null), 3, null);
    }
}
