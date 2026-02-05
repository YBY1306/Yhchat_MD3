package com.yhchat.canarys.p007ui.chat;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.model.ChatAddInfo;
import com.yhchat.canarys.data.model.ChatAddType;
import com.yhchat.canarys.data.model.Medal;
import com.yhchat.canarys.data.model.UserHomepageInfo;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.data.repository.UserRepository;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ChatAddViewModel.kt */
@Metadata(m168d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010\u0018J\u0016\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@\u00a2\u0006\u0002\u0010\u0018J\u0006\u0010\u001b\u001a\u00020\u0010J\u0010\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001f"}, m169d2 = {"Lcom/yhchat/canarys/ui/chat/ChatAddViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/yhchat/canarys/data/repository/UserRepository;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "<init>", "(Lcom/yhchat/canarys/data/repository/UserRepository;Lcom/yhchat/canarys/data/repository/TokenRepository;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/chat/ChatAddUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "loadShareInfo", "", "key", "", "ts", "loadChatInfo", "chatAddInfo", "Lcom/yhchat/canarys/data/model/ChatAddInfo;", "loadUserInfo", "(Lcom/yhchat/canarys/data/model/ChatAddInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadGroupInfo", "loadBotInfo", "addChat", "buildUserDescription", "userInfo", "Lcom/yhchat/canarys/data/model/UserHomepageInfo;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ChatAddViewModel extends ViewModel {
    public static final int $stable = 8;
    private final MutableStateFlow<ChatAddUiState> _uiState;
    private final TokenRepository tokenRepository;
    private final StateFlow<ChatAddUiState> uiState;
    private final UserRepository userRepository;

    /* compiled from: ChatAddViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatAddViewModel", m185f = "ChatAddViewModel.kt", m186i = {0}, m187l = {179}, m188m = "loadBotInfo", m189n = {"chatAddInfo"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatAddViewModel$loadBotInfo$1 */
    static final class C32251 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C32251(Continuation<? super C32251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatAddViewModel.this.loadBotInfo(null, this);
        }
    }

    /* compiled from: ChatAddViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatAddViewModel", m185f = "ChatAddViewModel.kt", m186i = {0}, m187l = {151}, m188m = "loadGroupInfo", m189n = {"chatAddInfo"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatAddViewModel$loadGroupInfo$1 */
    static final class C32271 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C32271(Continuation<? super C32271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatAddViewModel.this.loadGroupInfo(null, this);
        }
    }

    /* compiled from: ChatAddViewModel.kt */
    @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatAddViewModel", m185f = "ChatAddViewModel.kt", m186i = {0}, m187l = {123}, m188m = "loadUserInfo", m189n = {"chatAddInfo"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatAddViewModel$loadUserInfo$1 */
    static final class C32291 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C32291(Continuation<? super C32291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ChatAddViewModel.this.loadUserInfo(null, this);
        }
    }

    @Inject
    public ChatAddViewModel(UserRepository userRepository, TokenRepository tokenRepository) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        this.userRepository = userRepository;
        this.tokenRepository = tokenRepository;
        this._uiState = StateFlowKt.MutableStateFlow(new ChatAddUiState(false, null, null, false, false, null, 63, null));
        this.uiState = FlowKt.asStateFlow(this._uiState);
    }

    public final StateFlow<ChatAddUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: ChatAddViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatAddViewModel$loadShareInfo$1", m185f = "ChatAddViewModel.kt", m186i = {}, m187l = {41}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatAddViewModel$loadShareInfo$1 */
    static final class C32281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $ts;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32281(String str, String str2, Continuation<? super C32281> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$ts = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatAddViewModel.this.new C32281(this.$key, this.$ts, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00c6 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:61:0x0018, B:70:0x008c, B:72:0x0096, B:73:0x009d, B:74:0x00a0, B:96:0x0104, B:75:0x00a6, B:78:0x00ae, B:82:0x00bf, B:84:0x00c6, B:89:0x00d4, B:95:0x00f6, B:90:0x00da, B:94:0x00e2, B:76:0x00a9, B:77:0x00ac, B:97:0x0123, B:101:0x0141, B:66:0x002b), top: B:109:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x00d1  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00d4 A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:61:0x0018, B:70:0x008c, B:72:0x0096, B:73:0x009d, B:74:0x00a0, B:96:0x0104, B:75:0x00a6, B:78:0x00ae, B:82:0x00bf, B:84:0x00c6, B:89:0x00d4, B:95:0x00f6, B:90:0x00da, B:94:0x00e2, B:76:0x00a9, B:77:0x00ac, B:97:0x0123, B:101:0x0141, B:66:0x002b), top: B:109:0x000d }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x00da A[Catch: Exception -> 0x0024, TryCatch #0 {Exception -> 0x0024, blocks: (B:61:0x0018, B:70:0x008c, B:72:0x0096, B:73:0x009d, B:74:0x00a0, B:96:0x0104, B:75:0x00a6, B:78:0x00ae, B:82:0x00bf, B:84:0x00c6, B:89:0x00d4, B:95:0x00f6, B:90:0x00da, B:94:0x00e2, B:76:0x00a9, B:77:0x00ac, B:97:0x0123, B:101:0x0141, B:66:0x002b), top: B:109:0x000d }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 414
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatAddViewModel.C32281.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loadShareInfo(String key, String ts) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(ts, "ts");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32281(key, ts, null), 3, null);
    }

    /* compiled from: ChatAddViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatAddViewModel$loadChatInfo$1", m185f = "ChatAddViewModel.kt", m186i = {}, m187l = {105, 106, 107}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatAddViewModel$loadChatInfo$1 */
    static final class C32261 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ChatAddInfo $chatAddInfo;
        int label;

        /* compiled from: ChatAddViewModel.kt */
        @Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        /* renamed from: com.yhchat.canarys.ui.chat.ChatAddViewModel$loadChatInfo$1$WhenMappings */
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ChatAddType.values().length];
                try {
                    iArr[ChatAddType.USER.ordinal()] = 1;
                } catch (NoSuchFieldError e) {
                }
                try {
                    iArr[ChatAddType.GROUP.ordinal()] = 2;
                } catch (NoSuchFieldError e2) {
                }
                try {
                    iArr[ChatAddType.BOT.ordinal()] = 3;
                } catch (NoSuchFieldError e3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32261(ChatAddInfo chatAddInfo, Continuation<? super C32261> continuation) {
            super(2, continuation);
            this.$chatAddInfo = chatAddInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatAddViewModel.this.new C32261(this.$chatAddInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
            } catch (Exception e) {
                Log.e("ChatAddViewModel", "\u52a0\u8f7d\u804a\u5929\u4fe1\u606f\u5f02\u5e38", e);
                MutableStateFlow mutableStateFlow = ChatAddViewModel.this._uiState;
                ChatAddUiState chatAddUiState = (ChatAddUiState) ChatAddViewModel.this._uiState.getValue();
                String message = e.getMessage();
                if (message == null) {
                    message = "\u52a0\u8f7d\u5931\u8d25";
                }
                mutableStateFlow.setValue(ChatAddUiState.copy$default(chatAddUiState, false, null, message, false, false, null, 58, null));
            }
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    ChatAddViewModel.this._uiState.setValue(ChatAddUiState.copy$default((ChatAddUiState) ChatAddViewModel.this._uiState.getValue(), true, this.$chatAddInfo, null, false, false, null, 56, null));
                    Log.d("ChatAddViewModel", "\u5f00\u59cb\u52a0\u8f7d\u804a\u5929\u4fe1\u606f: type=" + this.$chatAddInfo.getType() + ", id=" + this.$chatAddInfo.getId());
                    switch (WhenMappings.$EnumSwitchMapping$0[this.$chatAddInfo.getType().ordinal()]) {
                        case 1:
                            this.label = 1;
                            if (ChatAddViewModel.this.loadUserInfo(this.$chatAddInfo, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        case 2:
                            this.label = 2;
                            if (ChatAddViewModel.this.loadGroupInfo(this.$chatAddInfo, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        case 3:
                            this.label = 3;
                            if (ChatAddViewModel.this.loadBotInfo(this.$chatAddInfo, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return Unit.INSTANCE;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                case 2:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final void loadChatInfo(ChatAddInfo chatAddInfo) {
        Intrinsics.checkNotNullParameter(chatAddInfo, "chatAddInfo");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32261(chatAddInfo, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadUserInfo(com.yhchat.canarys.data.model.ChatAddInfo r26, kotlin.coroutines.Continuation<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatAddViewModel.loadUserInfo(com.yhchat.canarys.data.model.ChatAddInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadGroupInfo(com.yhchat.canarys.data.model.ChatAddInfo r25, kotlin.coroutines.Continuation<? super kotlin.Unit> r26) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatAddViewModel.loadGroupInfo(com.yhchat.canarys.data.model.ChatAddInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object loadBotInfo(com.yhchat.canarys.data.model.ChatAddInfo r26, kotlin.coroutines.Continuation<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.chat.ChatAddViewModel.loadBotInfo(com.yhchat.canarys.data.model.ChatAddInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: ChatAddViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatAddViewModel$addChat$1", m185f = "ChatAddViewModel.kt", m186i = {0}, m187l = {219}, m188m = "invokeSuspend", m189n = {"chatInfo"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.chat.ChatAddViewModel$addChat$1 */
    static final class C32241 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C32241(Continuation<? super C32241> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatAddViewModel.this.new C32241(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C32241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object value;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        ChatAddInfo chatInfo = ((ChatAddUiState) ChatAddViewModel.this._uiState.getValue()).getChatInfo();
                        if (chatInfo != null) {
                            Log.d("ChatAddViewModel", "\u5f00\u59cb\u6dfb\u52a0\u804a\u5929\u5bf9\u8c61: type=" + chatInfo.getType() + ", id=" + chatInfo.getId());
                            ChatAddViewModel.this._uiState.setValue(ChatAddUiState.copy$default((ChatAddUiState) ChatAddViewModel.this._uiState.getValue(), false, null, null, true, false, null, 23, null));
                            this.L$0 = SpillingKt.nullOutSpilledVariable(chatInfo);
                            this.label = 1;
                            Object objM8636addFriendBWLJW6A = ChatAddViewModel.this.userRepository.m8636addFriendBWLJW6A(chatInfo.getId(), chatInfo.getType().getChatType(), "\u901a\u8fc7\u5206\u4eab\u94fe\u63a5\u6dfb\u52a0", this);
                            if (objM8636addFriendBWLJW6A != coroutine_suspended) {
                                value = objM8636addFriendBWLJW6A;
                                break;
                            } else {
                                return coroutine_suspended;
                            }
                        } else {
                            return Unit.INSTANCE;
                        }
                    case 1:
                        ResultKt.throwOnFailure($result);
                        value = ((Result) $result).getValue();
                        break;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChatAddViewModel chatAddViewModel = ChatAddViewModel.this;
                ChatAddViewModel chatAddViewModel2 = ChatAddViewModel.this;
                Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
                if (thM11922exceptionOrNullimpl == null) {
                    ((Boolean) value).booleanValue();
                    Log.d("ChatAddViewModel", "\u6dfb\u52a0\u6210\u529f");
                    chatAddViewModel._uiState.setValue(ChatAddUiState.copy$default((ChatAddUiState) chatAddViewModel._uiState.getValue(), false, null, null, false, true, null, 7, null));
                } else {
                    Log.e("ChatAddViewModel", "\u6dfb\u52a0\u804a\u5929\u5bf9\u8c61\u5931\u8d25", thM11922exceptionOrNullimpl);
                    MutableStateFlow mutableStateFlow = chatAddViewModel2._uiState;
                    ChatAddUiState chatAddUiState = (ChatAddUiState) chatAddViewModel2._uiState.getValue();
                    String message = thM11922exceptionOrNullimpl.getMessage();
                    mutableStateFlow.setValue(ChatAddUiState.copy$default(chatAddUiState, false, null, null, false, false, message == null ? "\u6dfb\u52a0\u5931\u8d25" : message, 23, null));
                }
            } catch (Exception e) {
                Log.e("ChatAddViewModel", "\u6dfb\u52a0\u804a\u5929\u5bf9\u8c61\u5f02\u5e38", e);
                MutableStateFlow mutableStateFlow2 = ChatAddViewModel.this._uiState;
                ChatAddUiState chatAddUiState2 = (ChatAddUiState) ChatAddViewModel.this._uiState.getValue();
                String message2 = e.getMessage();
                mutableStateFlow2.setValue(ChatAddUiState.copy$default(chatAddUiState2, false, null, null, false, false, message2 == null ? "\u6dfb\u52a0\u5931\u8d25" : message2, 23, null));
            }
            return Unit.INSTANCE;
        }
    }

    public final void addChat() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C32241(null), 3, null);
    }

    private final String buildUserDescription(UserHomepageInfo userInfo) {
        List parts = new ArrayList();
        if (userInfo.getRegisterTimeText().length() > 0) {
            parts.add("\u6ce8\u518c\u65f6\u95f4: " + userInfo.getRegisterTimeText());
        }
        if (userInfo.getOnLineDay() > 0) {
            parts.add("\u5728\u7ebf\u5929\u6570: " + userInfo.getOnLineDay() + " \u5929");
        }
        if (userInfo.getContinuousOnLineDay() > 0) {
            parts.add("\u8fde\u7eed\u5728\u7ebf: " + userInfo.getContinuousOnLineDay() + " \u5929");
        }
        if (!userInfo.getMedals().isEmpty()) {
            Iterable iterableTake = CollectionsKt.take(userInfo.getMedals(), 3);
            Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterableTake, 10));
            Iterator it = iterableTake.iterator();
            while (it.hasNext()) {
                arrayList.add(((Medal) it.next()).getName());
            }
            List medalNames = (List) arrayList;
            parts.add("\u52cb\u7ae0: " + CollectionsKt.joinToString$default(medalNames, ", ", null, null, 0, null, null, 62, null));
        }
        return CollectionsKt.joinToString$default(parts, "\n", null, null, 0, null, null, 62, null);
    }
}
