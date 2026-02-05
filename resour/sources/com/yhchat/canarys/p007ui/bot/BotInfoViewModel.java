package com.yhchat.canarys.p007ui.bot;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.BotInfo;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.data.repository.FriendRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
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

/* compiled from: BotInfoViewModel.kt */
@Metadata(m168d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotInfoViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "botRepository", "Lcom/yhchat/canarys/data/repository/BotRepository;", "friendRepository", "Lcom/yhchat/canarys/data/repository/FriendRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/bot/BotInfoUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadBotInfo", "", "botId", "", "addBot", "clearAddResult", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotInfoViewModel extends AndroidViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<BotInfoUiState> _uiState;
    private final BotRepository botRepository;
    private final FriendRepository friendRepository;
    private final TokenRepository tokenRepository;
    private final StateFlow<BotInfoUiState> uiState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotInfoViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.botRepository = RepositoryFactory.INSTANCE.getBotRepository(application);
        this.friendRepository = RepositoryFactory.INSTANCE.getFriendRepository(application);
        this.tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(application);
        this._uiState = StateFlowKt.MutableStateFlow(new BotInfoUiState(false, null, null, false, null, 31, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
    }

    public final StateFlow<BotInfoUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: BotInfoViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotInfoViewModel$loadBotInfo$1", m185f = "BotInfoViewModel.kt", m186i = {}, m187l = {26}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.bot.BotInfoViewModel$loadBotInfo$1 */
    static final class C31701 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31701(String str, Continuation<? super C31701> continuation) {
            super(2, continuation);
            this.$botId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BotInfoViewModel.this.new C31701(this.$botId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    BotInfoViewModel.this._uiState.setValue(BotInfoUiState.copy$default((BotInfoUiState) BotInfoViewModel.this._uiState.getValue(), true, null, null, false, null, 26, null));
                    this.label = 1;
                    Object objM8485getBotInfoSimplegIAlus = BotInfoViewModel.this.botRepository.m8485getBotInfoSimplegIAlus(this.$botId, this);
                    if (objM8485getBotInfoSimplegIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result = objM8485getBotInfoSimplegIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    result = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BotInfoViewModel botInfoViewModel = BotInfoViewModel.this;
            BotInfoViewModel botInfoViewModel2 = BotInfoViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
            if (thM11922exceptionOrNullimpl == null) {
                botInfoViewModel._uiState.setValue(BotInfoUiState.copy$default((BotInfoUiState) botInfoViewModel._uiState.getValue(), false, (BotInfo) result, null, false, null, 24, null));
            } else {
                MutableStateFlow mutableStateFlow = botInfoViewModel2._uiState;
                BotInfoUiState botInfoUiState = (BotInfoUiState) botInfoViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u83b7\u53d6\u673a\u5668\u4eba\u4fe1\u606f\u5931\u8d25";
                }
                mutableStateFlow.setValue(BotInfoUiState.copy$default(botInfoUiState, false, null, message, false, null, 26, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBotInfo(String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31701(botId, null), 3, null);
    }

    /* compiled from: BotInfoViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotInfoViewModel$addBot$1", m185f = "BotInfoViewModel.kt", m186i = {1}, m187l = {51, 52}, m188m = "invokeSuspend", m189n = {"token"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.bot.BotInfoViewModel$addBot$1 */
    static final class C31691 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31691(String str, Continuation<? super C31691> continuation) {
            super(2, continuation);
            this.$botId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BotInfoViewModel.this.new C31691(this.$botId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0089 A[Catch: Exception -> 0x0020, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0016, B:23:0x0081, B:25:0x0089, B:26:0x00b7, B:8:0x001b, B:16:0x005b, B:19:0x0061, B:13:0x0049), top: B:31:0x0007 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00b7 A[Catch: Exception -> 0x0020, TRY_LEAVE, TryCatch #0 {Exception -> 0x0020, blocks: (B:7:0x0016, B:23:0x0081, B:25:0x0089, B:26:0x00b7, B:8:0x001b, B:16:0x005b, B:19:0x0061, B:13:0x0049), top: B:31:0x0007 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 306
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotInfoViewModel.C31691.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void addBot(String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31691(botId, null), 3, null);
    }

    public final void clearAddResult() {
        this._uiState.setValue(BotInfoUiState.copy$default(this._uiState.getValue(), false, null, null, false, null, 15, null));
    }
}
