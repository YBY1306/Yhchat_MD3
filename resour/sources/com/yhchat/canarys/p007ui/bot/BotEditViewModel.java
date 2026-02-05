package com.yhchat.canarys.p007ui.bot;

import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.BotRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.proto.bot.Bot;
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

/* compiled from: BotEditViewModel.kt */
@Metadata(m168d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0012J\u000e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0014J\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0014J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006%"}, m169d2 = {"Lcom/yhchat/canarys/ui/bot/BotEditViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "botRepository", "Lcom/yhchat/canarys/data/repository/BotRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/bot/BotEditUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadBotInfo", "", "botId", "", "uploadAvatar", "context", "Landroid/content/Context;", "imageUri", "Landroid/net/Uri;", "saveBotInfo", "updateAvatarUrl", "url", "updateNickname", "nickname", "updateIntroduction", "introduction", "updatePrivate", "isPrivate", "", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes11.dex */
public final class BotEditViewModel extends AndroidViewModel {
    private static final String TAG = "BotEditViewModel";
    private final MutableStateFlow<BotEditUiState> _uiState;
    private final BotRepository botRepository;
    private final TokenRepository tokenRepository;
    private final StateFlow<BotEditUiState> uiState;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BotEditViewModel(Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
        this.botRepository = RepositoryFactory.INSTANCE.getBotRepository(application);
        this.tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(application);
        this._uiState = StateFlowKt.MutableStateFlow(new BotEditUiState(false, false, false, false, null, null, null, null, null, false, 1023, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
    }

    public final StateFlow<BotEditUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: BotEditViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotEditViewModel$loadBotInfo$1", m185f = "BotEditViewModel.kt", m186i = {}, m187l = {41}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.bot.BotEditViewModel$loadBotInfo$1 */
    static final class C31661 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31661(String str, Continuation<? super C31661> continuation) {
            super(2, continuation);
            this.$botId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BotEditViewModel.this.new C31661(this.$botId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    BotEditViewModel.this._uiState.setValue(BotEditUiState.copy$default((BotEditUiState) BotEditViewModel.this._uiState.getValue(), true, false, false, false, null, this.$botId, null, null, null, false, 974, null));
                    this.label = 1;
                    Object objM8484getBotInfogIAlus = BotEditViewModel.this.botRepository.m8484getBotInfogIAlus(this.$botId, this);
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
            BotEditViewModel botEditViewModel = BotEditViewModel.this;
            BotEditViewModel botEditViewModel2 = BotEditViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
            if (thM11922exceptionOrNullimpl == null) {
                Bot.bot_info bot_infoVar = (Bot.bot_info) result;
                MutableStateFlow mutableStateFlow = botEditViewModel._uiState;
                BotEditUiState botEditUiState = (BotEditUiState) botEditViewModel._uiState.getValue();
                String avatarUrl = bot_infoVar.getData().getAvatarUrl();
                Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
                String name = bot_infoVar.getData().getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                String introduction = bot_infoVar.getData().getIntroduction();
                Intrinsics.checkNotNullExpressionValue(introduction, "getIntroduction(...)");
                mutableStateFlow.setValue(BotEditUiState.copy$default(botEditUiState, false, false, false, false, null, null, avatarUrl, name, introduction, bot_infoVar.getData().getPrivate() == 1, 62, null));
                Log.d(BotEditViewModel.TAG, "\u2705 \u673a\u5668\u4eba\u4fe1\u606f\u52a0\u8f7d\u6210\u529f");
            } else {
                MutableStateFlow mutableStateFlow2 = botEditViewModel2._uiState;
                BotEditUiState botEditUiState2 = (BotEditUiState) botEditViewModel2._uiState.getValue();
                String message = thM11922exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u5931\u8d25";
                }
                mutableStateFlow2.setValue(BotEditUiState.copy$default(botEditUiState2, false, false, false, false, message, null, null, null, null, false, PointerIconCompat.TYPE_CELL, null));
                Log.e(BotEditViewModel.TAG, "\u274c \u52a0\u8f7d\u673a\u5668\u4eba\u4fe1\u606f\u5931\u8d25", thM11922exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBotInfo(String botId) {
        Intrinsics.checkNotNullParameter(botId, "botId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31661(botId, null), 3, null);
    }

    /* compiled from: BotEditViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotEditViewModel$uploadAvatar$1", m185f = "BotEditViewModel.kt", m186i = {1, 1, 1, 2, 2, 2, 2, 2}, m187l = {77, 94, 117}, m188m = "invokeSuspend", m189n = {"userToken", "retrofit", "apiService", "userToken", "retrofit", "apiService", "tokenResponse", "qiniuToken"}, m191s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.bot.BotEditViewModel$uploadAvatar$1 */
    static final class C31681 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $imageUri;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31681(Context context, Uri uri, Continuation<? super C31681> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$imageUri = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BotEditViewModel.this.new C31681(this.$context, this.$imageUri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x00dd A[Catch: Exception -> 0x0053, TryCatch #0 {Exception -> 0x0053, blocks: (B:79:0x002d, B:133:0x01d7, B:135:0x01e2, B:136:0x0244, B:82:0x0046, B:105:0x0128, B:107:0x0130, B:109:0x0138, B:115:0x0145, B:117:0x014d, B:119:0x0153, B:123:0x015b, B:127:0x0167, B:129:0x019a, B:138:0x028e, B:83:0x004d, B:91:0x009a, B:94:0x009f, B:99:0x00ad, B:101:0x00dd, B:88:0x0088), top: B:143:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0130 A[Catch: Exception -> 0x0053, TryCatch #0 {Exception -> 0x0053, blocks: (B:79:0x002d, B:133:0x01d7, B:135:0x01e2, B:136:0x0244, B:82:0x0046, B:105:0x0128, B:107:0x0130, B:109:0x0138, B:115:0x0145, B:117:0x014d, B:119:0x0153, B:123:0x015b, B:127:0x0167, B:129:0x019a, B:138:0x028e, B:83:0x004d, B:91:0x009a, B:94:0x009f, B:99:0x00ad, B:101:0x00dd, B:88:0x0088), top: B:143:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:135:0x01e2 A[Catch: Exception -> 0x0053, TryCatch #0 {Exception -> 0x0053, blocks: (B:79:0x002d, B:133:0x01d7, B:135:0x01e2, B:136:0x0244, B:82:0x0046, B:105:0x0128, B:107:0x0130, B:109:0x0138, B:115:0x0145, B:117:0x014d, B:119:0x0153, B:123:0x015b, B:127:0x0167, B:129:0x019a, B:138:0x028e, B:83:0x004d, B:91:0x009a, B:94:0x009f, B:99:0x00ad, B:101:0x00dd, B:88:0x0088), top: B:143:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x0244 A[Catch: Exception -> 0x0053, TryCatch #0 {Exception -> 0x0053, blocks: (B:79:0x002d, B:133:0x01d7, B:135:0x01e2, B:136:0x0244, B:82:0x0046, B:105:0x0128, B:107:0x0130, B:109:0x0138, B:115:0x0145, B:117:0x014d, B:119:0x0153, B:123:0x015b, B:127:0x0167, B:129:0x019a, B:138:0x028e, B:83:0x004d, B:91:0x009a, B:94:0x009f, B:99:0x00ad, B:101:0x00dd, B:88:0x0088), top: B:143:0x000e }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x00ad A[Catch: Exception -> 0x0053, TryCatch #0 {Exception -> 0x0053, blocks: (B:79:0x002d, B:133:0x01d7, B:135:0x01e2, B:136:0x0244, B:82:0x0046, B:105:0x0128, B:107:0x0130, B:109:0x0138, B:115:0x0145, B:117:0x014d, B:119:0x0153, B:123:0x015b, B:127:0x0167, B:129:0x019a, B:138:0x028e, B:83:0x004d, B:91:0x009a, B:94:0x009f, B:99:0x00ad, B:101:0x00dd, B:88:0x0088), top: B:143:0x000e }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 820
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotEditViewModel.C31681.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void uploadAvatar(Context context, Uri imageUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31681(context, imageUri, null), 3, null);
    }

    /* compiled from: BotEditViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotEditViewModel$saveBotInfo$1", m185f = "BotEditViewModel.kt", m186i = {}, m187l = {164}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.bot.BotEditViewModel$saveBotInfo$1 */
    static final class C31671 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C31671(Continuation<? super C31671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BotEditViewModel.this.new C31671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        BotEditViewModel.this._uiState.setValue(BotEditUiState.copy$default((BotEditUiState) BotEditViewModel.this._uiState.getValue(), false, false, true, false, null, null, null, null, null, false, PointerIconCompat.TYPE_HELP, null));
                        this.label = 1;
                        Object objM8482editBothUnOzRk = BotEditViewModel.this.botRepository.m8482editBothUnOzRk(((BotEditUiState) BotEditViewModel.this._uiState.getValue()).getBotId(), ((BotEditUiState) BotEditViewModel.this._uiState.getValue()).getNickname(), ((BotEditUiState) BotEditViewModel.this._uiState.getValue()).getIntroduction(), ((BotEditUiState) BotEditViewModel.this._uiState.getValue()).getAvatarUrl(), ((BotEditUiState) BotEditViewModel.this._uiState.getValue()).isPrivate(), this);
                        if (objM8482editBothUnOzRk == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8482editBothUnOzRk;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                BotEditViewModel botEditViewModel = BotEditViewModel.this;
                BotEditViewModel botEditViewModel2 = BotEditViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl != null) {
                    MutableStateFlow mutableStateFlow = botEditViewModel2._uiState;
                    BotEditUiState botEditUiState = (BotEditUiState) botEditViewModel2._uiState.getValue();
                    String message = thM11922exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "\u4fdd\u5b58\u5931\u8d25";
                    }
                    mutableStateFlow.setValue(BotEditUiState.copy$default(botEditUiState, false, false, false, false, message, null, null, null, null, false, PointerIconCompat.TYPE_HELP, null));
                    Log.e(BotEditViewModel.TAG, "\u274c \u4fdd\u5b58\u673a\u5668\u4eba\u4fe1\u606f\u5931\u8d25", thM11922exceptionOrNullimpl);
                } else {
                    botEditViewModel._uiState.setValue(BotEditUiState.copy$default((BotEditUiState) botEditViewModel._uiState.getValue(), false, false, false, true, null, null, null, null, null, false, PointerIconCompat.TYPE_COPY, null));
                    Log.d(BotEditViewModel.TAG, "\u2705 \u673a\u5668\u4eba\u4fe1\u606f\u4fdd\u5b58\u6210\u529f");
                }
            } catch (Exception e) {
                BotEditViewModel.this._uiState.setValue(BotEditUiState.copy$default((BotEditUiState) BotEditViewModel.this._uiState.getValue(), false, false, false, false, "\u4fdd\u5b58\u5f02\u5e38: " + e.getMessage(), null, null, null, null, false, PointerIconCompat.TYPE_HELP, null));
                Log.e(BotEditViewModel.TAG, "\u274c \u4fdd\u5b58\u5f02\u5e38", e);
            }
            return Unit.INSTANCE;
        }
    }

    public final void saveBotInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31671(null), 3, null);
    }

    public final void updateAvatarUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this._uiState.setValue(BotEditUiState.copy$default(this._uiState.getValue(), false, false, false, false, null, null, url, null, null, false, 959, null));
    }

    public final void updateNickname(String nickname) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        this._uiState.setValue(BotEditUiState.copy$default(this._uiState.getValue(), false, false, false, false, null, null, null, nickname, null, false, 895, null));
    }

    public final void updateIntroduction(String introduction) {
        Intrinsics.checkNotNullParameter(introduction, "introduction");
        this._uiState.setValue(BotEditUiState.copy$default(this._uiState.getValue(), false, false, false, false, null, null, null, null, introduction, false, 767, null));
    }

    public final void updatePrivate(boolean isPrivate) {
        this._uiState.setValue(BotEditUiState.copy$default(this._uiState.getValue(), false, false, false, false, null, null, null, null, null, isPrivate, 511, null));
    }
}
