package com.yhchat.canarys.p007ui.bot;

import android.app.Application;
import android.util.Log;
import androidx.core.view.MotionEventCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.bot.Bot;
import kotlin.Lazy;
import kotlin.LazyKt;
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

/* compiled from: BotDetailViewModel.kt */
@Metadata(m168d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001aR\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001c"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotDetailViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "botRepository", "Lcom/yhchat/canarys/data/repository/BotRepository;", "getBotRepository", "()Lcom/yhchat/canarys/data/repository/BotRepository;", "botRepository$delegate", "Lkotlin/Lazy;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/bot/BotDetailUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadBotDetail", "", "botId", "", "loadBoardInfo", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotDetailViewModel extends AndroidViewModel {
    private static final String TAG = "BotDetailViewModel";
    private final MutableStateFlow<BotDetailUiState> _uiState;

    /* renamed from: botRepository$delegate, reason: from kotlin metadata */
    private final Lazy botRepository;
    private final StateFlow<BotDetailUiState> uiState;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotDetailViewModel(final Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.botRepository = LazyKt.lazy(new Function0() { // from class: com.yhchat.canarys.ui.bot.BotDetailViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BotDetailViewModel.botRepository_delegate$lambda$0(application);
            }
        });
        this._uiState = StateFlowKt.MutableStateFlow(new BotDetailUiState(false, null, null, false, null, null, 63, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
    }

    public final BotRepository getBotRepository() {
        return (BotRepository) this.botRepository.getValue();
    }

    public static final BotRepository botRepository_delegate$lambda$0(Application $application) {
        return RepositoryFactory.INSTANCE.getBotRepository($application);
    }

    public final StateFlow<BotDetailUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: BotDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotDetailViewModel$loadBotDetail$1", m185f = "BotDetailViewModel.kt", m186i = {}, m187l = {MotionEventCompat.AXIS_GENERIC_12}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.bot.BotDetailViewModel$loadBotDetail$1 */
    static final class C31651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31651(String str, Continuation<? super C31651> continuation) {
            super(2, continuation);
            this.$botId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BotDetailViewModel.this.new C31651(this.$botId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    BotDetailViewModel.this._uiState.setValue(BotDetailUiState.copy$default((BotDetailUiState) BotDetailViewModel.this._uiState.getValue(), true, null, null, false, null, null, 58, null));
                    Log.d(BotDetailViewModel.TAG, "\u5f00\u59cb\u52a0\u8f7d\u673a\u5668\u4eba\u8be6\u7ec6\u4fe1\u606f: " + this.$botId);
                    this.label = 1;
                    Object objM8484getBotInfogIAlus = BotDetailViewModel.this.getBotRepository().m8484getBotInfogIAlus(this.$botId, this);
                    if (objM8484getBotInfogIAlus == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result = objM8484getBotInfogIAlus;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    result = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BotDetailViewModel botDetailViewModel = BotDetailViewModel.this;
            BotDetailViewModel botDetailViewModel2 = BotDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
            if (thM11922exceptionOrNullimpl == null) {
                Log.d(BotDetailViewModel.TAG, "\u2705 \u673a\u5668\u4eba\u4fe1\u606f\u52a0\u8f7d\u6210\u529f");
                botDetailViewModel._uiState.setValue(BotDetailUiState.copy$default((BotDetailUiState) botDetailViewModel._uiState.getValue(), false, (Bot.bot_info) result, null, false, null, null, 56, null));
            } else {
                Log.e(BotDetailViewModel.TAG, "\u274c \u673a\u5668\u4eba\u4fe1\u606f\u52a0\u8f7d\u5931\u8d25", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = botDetailViewModel2._uiState;
                BotDetailUiState botDetailUiState = (BotDetailUiState) botDetailViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u5931\u8d25";
                }
                mutableStateFlow.setValue(BotDetailUiState.copy$default(botDetailUiState, false, null, message, false, null, null, 58, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBotDetail(String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31651(botId, null), 3, null);
    }

    /* compiled from: BotDetailViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotDetailViewModel$loadBoardInfo$1", m185f = "BotDetailViewModel.kt", m186i = {}, m187l = {77}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.bot.BotDetailViewModel$loadBoardInfo$1 */
    static final class C31641 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ int $chatType;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31641(String str, int i, Continuation<? super C31641> continuation) {
            super(2, continuation);
            this.$chatId = str;
            this.$chatType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BotDetailViewModel.this.new C31641(this.$chatId, this.$chatType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    BotDetailViewModel.this._uiState.setValue(BotDetailUiState.copy$default((BotDetailUiState) BotDetailViewModel.this._uiState.getValue(), false, null, null, true, null, null, 23, null));
                    Log.d(BotDetailViewModel.TAG, "\u5f00\u59cb\u52a0\u8f7d\u770b\u677f\u4fe1\u606f: chatId=" + this.$chatId + ", chatType=" + this.$chatType);
                    this.label = 1;
                    Object objM8483getBotBoard0E7RQCE = BotDetailViewModel.this.getBotRepository().m8483getBotBoard0E7RQCE(this.$chatId, this.$chatType, this);
                    if (objM8483getBotBoard0E7RQCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    result = objM8483getBotBoard0E7RQCE;
                    break;
                case 1:
                    ResultKt.throwOnFailure($result);
                    result = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BotDetailViewModel botDetailViewModel = BotDetailViewModel.this;
            BotDetailViewModel botDetailViewModel2 = BotDetailViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
            if (thM11922exceptionOrNullimpl == null) {
                Log.d(BotDetailViewModel.TAG, "\u2705 \u770b\u677f\u4fe1\u606f\u52a0\u8f7d\u6210\u529f");
                botDetailViewModel._uiState.setValue(BotDetailUiState.copy$default((BotDetailUiState) botDetailViewModel._uiState.getValue(), false, null, null, false, (Bot.board) result, null, 7, null));
            } else {
                Log.e(BotDetailViewModel.TAG, "\u274c \u770b\u677f\u4fe1\u606f\u52a0\u8f7d\u5931\u8d25", thM11922exceptionOrNullimpl);
                MutableStateFlow mutableStateFlow = botDetailViewModel2._uiState;
                BotDetailUiState botDetailUiState = (BotDetailUiState) botDetailViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u5931\u8d25";
                }
                mutableStateFlow.setValue(BotDetailUiState.copy$default(botDetailUiState, false, null, null, false, null, message, 23, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBoardInfo(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31641(str, i, null), 3, null);
    }
}
