package com.yhchat.canarys.p007ui.background;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.model.ChatBackground;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.ChatBackgroundRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ChatBackgroundActivity.kt */
@Metadata(m168d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0012J\u001e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001e\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, m169d2 = {"Lcom/yhchat/canarys/ui/background/ChatBackgroundViewModel;", "Landroidx/lifecycle/ViewModel;", "<init>", "()V", "backgroundRepository", "Lcom/yhchat/canarys/data/repository/ChatBackgroundRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/background/ChatBackgroundUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "init", "", "context", "Landroid/content/Context;", "loadBackgrounds", "uploadAndSetBackground", "imageUri", "Landroid/net/Uri;", ChatSearchActivity.EXTRA_CHAT_ID, "", "deleteBackground", "background", "Lcom/yhchat/canarys/data/model/ChatBackground;", "resetSetSuccess", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
public final class ChatBackgroundViewModel extends ViewModel {
    public static final int $stable = 8;
    private ApiService apiService;
    private ChatBackgroundRepository backgroundRepository;
    private TokenRepository tokenRepository;
    private final MutableStateFlow<ChatBackgroundUiState> _uiState = StateFlowKt.MutableStateFlow(new ChatBackgroundUiState(false, false, null, false, null, 31, null));
    private final StateFlow<ChatBackgroundUiState> uiState = FlowKt.asStateFlow(this._uiState);

    public final StateFlow<ChatBackgroundUiState> getUiState() {
        return this.uiState;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.backgroundRepository = RepositoryFactory.INSTANCE.getChatBackgroundRepository(context);
        this.tokenRepository = RepositoryFactory.INSTANCE.getTokenRepository(context);
        this.apiService = RepositoryFactory.INSTANCE.getApiService();
    }

    /* compiled from: ChatBackgroundActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.background.ChatBackgroundViewModel$loadBackgrounds$1", m185f = "ChatBackgroundActivity.kt", m186i = {}, m187l = {350}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.background.ChatBackgroundViewModel$loadBackgrounds$1 */
    static final class C31301 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C31301(Continuation<? super C31301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatBackgroundViewModel.this.new C31301(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ChatBackgroundViewModel.this._uiState.setValue(ChatBackgroundUiState.copy$default((ChatBackgroundUiState) ChatBackgroundViewModel.this._uiState.getValue(), true, false, null, false, null, 14, null));
                    ChatBackgroundRepository chatBackgroundRepository = ChatBackgroundViewModel.this.backgroundRepository;
                    if (chatBackgroundRepository == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("backgroundRepository");
                        chatBackgroundRepository = null;
                    }
                    this.label = 1;
                    Object objM8489getChatBackgroundListIoAF18A = chatBackgroundRepository.m8489getChatBackgroundListIoAF18A(this);
                    if (objM8489getChatBackgroundListIoAF18A != coroutine_suspended) {
                        value = objM8489getChatBackgroundListIoAF18A;
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
            ChatBackgroundViewModel chatBackgroundViewModel = ChatBackgroundViewModel.this;
            ChatBackgroundViewModel chatBackgroundViewModel2 = ChatBackgroundViewModel.this;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                chatBackgroundViewModel._uiState.setValue(ChatBackgroundUiState.copy$default((ChatBackgroundUiState) chatBackgroundViewModel._uiState.getValue(), false, false, (List) value, false, null, 26, null));
            } else {
                chatBackgroundViewModel2._uiState.setValue(ChatBackgroundUiState.copy$default((ChatBackgroundUiState) chatBackgroundViewModel2._uiState.getValue(), false, false, null, false, thM11922exceptionOrNullimpl.getMessage(), 14, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void loadBackgrounds() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31301(null), 3, null);
    }

    /* compiled from: ChatBackgroundActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.background.ChatBackgroundViewModel$uploadAndSetBackground$1", m185f = "ChatBackgroundActivity.kt", m186i = {1, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, m187l = {373, 383, 404, 407}, m188m = "invokeSuspend", m189n = {"userToken", "userToken", "tokenResponse", "qiniuData", "uploadToken", "userToken", "tokenResponse", "qiniuData", "uploadToken", "uploadResponse\\1", "$i$a$-fold-ChatBackgroundViewModel$uploadAndSetBackground$1$1\\1\\404\\0"}, m191s = {"L$0", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$5", "I$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.background.ChatBackgroundViewModel$uploadAndSetBackground$1 */
    static final class C31311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ Context $context;
        final /* synthetic */ Uri $imageUri;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31311(Context context, Uri uri, String str, Continuation<? super C31311> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$imageUri = uri;
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatBackgroundViewModel.this.new C31311(this.$context, this.$imageUri, this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00c4 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:7:0x002f, B:63:0x01dd, B:65:0x01e4, B:67:0x0214, B:10:0x004c, B:53:0x0189, B:55:0x0195, B:57:0x019e, B:59:0x01a5, B:69:0x0251, B:13:0x0063, B:40:0x010d, B:42:0x0115, B:45:0x011d, B:47:0x012c, B:49:0x0154, B:70:0x028d, B:14:0x006a, B:25:0x00b3, B:27:0x00ba, B:32:0x00c4, B:34:0x00ec, B:36:0x00f4, B:37:0x00fa, B:19:0x0099, B:21:0x00a1, B:22:0x00a7), top: B:75:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ec A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:7:0x002f, B:63:0x01dd, B:65:0x01e4, B:67:0x0214, B:10:0x004c, B:53:0x0189, B:55:0x0195, B:57:0x019e, B:59:0x01a5, B:69:0x0251, B:13:0x0063, B:40:0x010d, B:42:0x0115, B:45:0x011d, B:47:0x012c, B:49:0x0154, B:70:0x028d, B:14:0x006a, B:25:0x00b3, B:27:0x00ba, B:32:0x00c4, B:34:0x00ec, B:36:0x00f4, B:37:0x00fa, B:19:0x0099, B:21:0x00a1, B:22:0x00a7), top: B:75:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x012c A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:7:0x002f, B:63:0x01dd, B:65:0x01e4, B:67:0x0214, B:10:0x004c, B:53:0x0189, B:55:0x0195, B:57:0x019e, B:59:0x01a5, B:69:0x0251, B:13:0x0063, B:40:0x010d, B:42:0x0115, B:45:0x011d, B:47:0x012c, B:49:0x0154, B:70:0x028d, B:14:0x006a, B:25:0x00b3, B:27:0x00ba, B:32:0x00c4, B:34:0x00ec, B:36:0x00f4, B:37:0x00fa, B:19:0x0099, B:21:0x00a1, B:22:0x00a7), top: B:75:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0154 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:7:0x002f, B:63:0x01dd, B:65:0x01e4, B:67:0x0214, B:10:0x004c, B:53:0x0189, B:55:0x0195, B:57:0x019e, B:59:0x01a5, B:69:0x0251, B:13:0x0063, B:40:0x010d, B:42:0x0115, B:45:0x011d, B:47:0x012c, B:49:0x0154, B:70:0x028d, B:14:0x006a, B:25:0x00b3, B:27:0x00ba, B:32:0x00c4, B:34:0x00ec, B:36:0x00f4, B:37:0x00fa, B:19:0x0099, B:21:0x00a1, B:22:0x00a7), top: B:75:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0195 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:7:0x002f, B:63:0x01dd, B:65:0x01e4, B:67:0x0214, B:10:0x004c, B:53:0x0189, B:55:0x0195, B:57:0x019e, B:59:0x01a5, B:69:0x0251, B:13:0x0063, B:40:0x010d, B:42:0x0115, B:45:0x011d, B:47:0x012c, B:49:0x0154, B:70:0x028d, B:14:0x006a, B:25:0x00b3, B:27:0x00ba, B:32:0x00c4, B:34:0x00ec, B:36:0x00f4, B:37:0x00fa, B:19:0x0099, B:21:0x00a1, B:22:0x00a7), top: B:75:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x01e4 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:7:0x002f, B:63:0x01dd, B:65:0x01e4, B:67:0x0214, B:10:0x004c, B:53:0x0189, B:55:0x0195, B:57:0x019e, B:59:0x01a5, B:69:0x0251, B:13:0x0063, B:40:0x010d, B:42:0x0115, B:45:0x011d, B:47:0x012c, B:49:0x0154, B:70:0x028d, B:14:0x006a, B:25:0x00b3, B:27:0x00ba, B:32:0x00c4, B:34:0x00ec, B:36:0x00f4, B:37:0x00fa, B:19:0x0099, B:21:0x00a1, B:22:0x00a7), top: B:75:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0214 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:7:0x002f, B:63:0x01dd, B:65:0x01e4, B:67:0x0214, B:10:0x004c, B:53:0x0189, B:55:0x0195, B:57:0x019e, B:59:0x01a5, B:69:0x0251, B:13:0x0063, B:40:0x010d, B:42:0x0115, B:45:0x011d, B:47:0x012c, B:49:0x0154, B:70:0x028d, B:14:0x006a, B:25:0x00b3, B:27:0x00ba, B:32:0x00c4, B:34:0x00ec, B:36:0x00f4, B:37:0x00fa, B:19:0x0099, B:21:0x00a1, B:22:0x00a7), top: B:75:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0251 A[Catch: Exception -> 0x0070, TryCatch #0 {Exception -> 0x0070, blocks: (B:7:0x002f, B:63:0x01dd, B:65:0x01e4, B:67:0x0214, B:10:0x004c, B:53:0x0189, B:55:0x0195, B:57:0x019e, B:59:0x01a5, B:69:0x0251, B:13:0x0063, B:40:0x010d, B:42:0x0115, B:45:0x011d, B:47:0x012c, B:49:0x0154, B:70:0x028d, B:14:0x006a, B:25:0x00b3, B:27:0x00ba, B:32:0x00c4, B:34:0x00ec, B:36:0x00f4, B:37:0x00fa, B:19:0x0099, B:21:0x00a1, B:22:0x00a7), top: B:75:0x000a }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 790
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.background.ChatBackgroundViewModel.C31311.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void uploadAndSetBackground(Context context, Uri imageUri, String chatId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31311(context, imageUri, chatId, null), 3, null);
    }

    /* compiled from: ChatBackgroundActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.background.ChatBackgroundViewModel$deleteBackground$1", m185f = "ChatBackgroundActivity.kt", m186i = {}, m187l = {448}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.background.ChatBackgroundViewModel$deleteBackground$1 */
    static final class C31291 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31291(String str, Continuation<? super C31291> continuation) {
            super(2, continuation);
            this.$chatId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatBackgroundViewModel.this.new C31291(this.$chatId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        ChatBackgroundViewModel.this._uiState.setValue(ChatBackgroundUiState.copy$default((ChatBackgroundUiState) ChatBackgroundViewModel.this._uiState.getValue(), true, false, null, false, null, 14, null));
                        ChatBackgroundRepository chatBackgroundRepository = ChatBackgroundViewModel.this.backgroundRepository;
                        if (chatBackgroundRepository == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("backgroundRepository");
                            chatBackgroundRepository = null;
                        }
                        this.label = 1;
                        Object objM8490setChatBackground0E7RQCE = chatBackgroundRepository.m8490setChatBackground0E7RQCE(this.$chatId, "", this);
                        if (objM8490setChatBackground0E7RQCE == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        result = objM8490setChatBackground0E7RQCE;
                        break;
                    case 1:
                        ResultKt.throwOnFailure($result);
                        result = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChatBackgroundViewModel chatBackgroundViewModel = ChatBackgroundViewModel.this;
                ChatBackgroundViewModel chatBackgroundViewModel2 = ChatBackgroundViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(result);
                if (thM11922exceptionOrNullimpl != null) {
                    chatBackgroundViewModel2._uiState.setValue(ChatBackgroundUiState.copy$default((ChatBackgroundUiState) chatBackgroundViewModel2._uiState.getValue(), false, false, null, false, "\u5220\u9664\u80cc\u666f\u5931\u8d25: " + thM11922exceptionOrNullimpl.getMessage(), 14, null));
                } else {
                    ((Boolean) result).booleanValue();
                    chatBackgroundViewModel._uiState.setValue(ChatBackgroundUiState.copy$default((ChatBackgroundUiState) chatBackgroundViewModel._uiState.getValue(), false, false, null, true, null, 22, null));
                    chatBackgroundViewModel.loadBackgrounds();
                }
            } catch (Exception e) {
                ChatBackgroundViewModel.this._uiState.setValue(ChatBackgroundUiState.copy$default((ChatBackgroundUiState) ChatBackgroundViewModel.this._uiState.getValue(), false, false, null, false, "\u5220\u9664\u80cc\u666f\u5931\u8d25: " + e.getMessage(), 14, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void deleteBackground(ChatBackground background, String chatId) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C31291(chatId, null), 3, null);
    }

    public final void resetSetSuccess() {
        this._uiState.setValue(ChatBackgroundUiState.copy$default(this._uiState.getValue(), false, false, null, false, null, 23, null));
    }
}
