package com.yhchat.canarys.p007ui.group;

import android.util.Log;
import androidx.core.view.PointerIconCompat;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.data.model.ChatSearchMessage;
import com.yhchat.canarys.data.model.MessageContent;
import com.yhchat.canarys.data.model.MessageSender;
import com.yhchat.canarys.data.repository.MessageRepository;
import com.yhchat.canarys.data.repository.TokenRepository;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ChatSearchViewModel.kt */
@Metadata(m168d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 &2\u00020\u0001:\u0001&B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J(\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u0012J\u001e\u0010 \u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0014J\u0006\u0010\"\u001a\u00020\u0012J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006'"}, m169d2 = {"Lcom/yhchat/canarys/ui/group/ChatSearchViewModel;", "Landroidx/lifecycle/ViewModel;", "apiService", "Lcom/yhchat/canarys/data/api/ApiService;", "tokenRepository", "Lcom/yhchat/canarys/data/repository/TokenRepository;", "messageRepository", "Lcom/yhchat/canarys/data/repository/MessageRepository;", "<init>", "(Lcom/yhchat/canarys/data/api/ApiService;Lcom/yhchat/canarys/data/repository/TokenRepository;Lcom/yhchat/canarys/data/repository/MessageRepository;)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/yhchat/canarys/ui/group/ChatSearchState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "updateSearchQuery", "", "query", "", "searchMessages", ChatSearchActivity.EXTRA_CHAT_ID, ChatSearchActivity.EXTRA_CHAT_TYPE, "", "isLoadMore", "", "loadMoreResults", "showMessageDetail", "message", "Lcom/yhchat/canarys/data/model/ChatMessage;", "hideMessageDetail", "getMessageDetail", "messageId", "clearError", "convertSearchMessageToChatMessage", "searchMessage", "Lcom/yhchat/canarys/data/model/ChatSearchMessage;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes9.dex */
public final class ChatSearchViewModel extends ViewModel {
    private static final String TAG = "ChatSearchViewModel";
    private final MutableStateFlow<ChatSearchState> _state;
    private final ApiService apiService;
    private final MessageRepository messageRepository;
    private final StateFlow<ChatSearchState> state;
    private final TokenRepository tokenRepository;
    public static final int $stable = 8;

    @Inject
    public ChatSearchViewModel(ApiService apiService, TokenRepository tokenRepository, MessageRepository messageRepository) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(tokenRepository, "tokenRepository");
        Intrinsics.checkNotNullParameter(messageRepository, "messageRepository");
        this.apiService = apiService;
        this.tokenRepository = tokenRepository;
        this.messageRepository = messageRepository;
        this._state = StateFlowKt.MutableStateFlow(new ChatSearchState(false, null, null, null, false, false, 0, null, false, 0L, 1023, null));
        this.state = FlowKt.asStateFlow(this._state);
    }

    public final StateFlow<ChatSearchState> getState() {
        return this.state;
    }

    public final void updateSearchQuery(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this._state.setValue(ChatSearchState.copy$default(this._state.getValue(), false, null, null, query, false, false, 0, null, false, 0L, PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW, null));
    }

    public static /* synthetic */ void searchMessages$default(ChatSearchViewModel chatSearchViewModel, String str, int i, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = false;
        }
        chatSearchViewModel.searchMessages(str, i, str2, z);
    }

    public final void searchMessages(String str, int i, String query, boolean isLoadMore) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(query, "query");
        Log.d(TAG, "searchMessages: query='" + query + "', chatId='" + str + "', chatType=" + i + ", isLoadMore=" + isLoadMore);
        if (!StringsKt.isBlank(query)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38801(isLoadMore, this, query, str, i, null), 3, null);
        } else {
            Log.d(TAG, "searchMessages: query is blank, clearing results");
            this._state.setValue(ChatSearchState.copy$default(this._state.getValue(), false, CollectionsKt.emptyList(), null, null, false, true, 0, null, false, 9999999999999L, 413, null));
        }
    }

    /* compiled from: ChatSearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.ChatSearchViewModel$searchMessages$1", m185f = "ChatSearchViewModel.kt", m186i = {1, 1, 1, 1, 1}, m187l = {83, 110}, m188m = "invokeSuspend", m189n = {"userToken", "token", "request", "pageSize", "timestamp"}, m191s = {"L$0", "L$1", "L$2", "I$0", "J$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.ChatSearchViewModel$searchMessages$1 */
    static final class C38801 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ int $chatType;
        final /* synthetic */ boolean $isLoadMore;
        final /* synthetic */ String $query;
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ ChatSearchViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38801(boolean z, ChatSearchViewModel chatSearchViewModel, String str, String str2, int i, Continuation<? super C38801> continuation) {
            super(2, continuation);
            this.$isLoadMore = z;
            this.this$0 = chatSearchViewModel;
            this.$query = str;
            this.$chatId = str2;
            this.$chatType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C38801(this.$isLoadMore, this.this$0, this.$query, this.$chatId, this.$chatType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:183:0x00f3 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:168:0x002a, B:207:0x0202, B:209:0x0232, B:211:0x023a, B:214:0x0246, B:216:0x024c, B:218:0x0270, B:224:0x027d, B:226:0x0283, B:229:0x028d, B:231:0x02b3, B:233:0x02b7, B:235:0x02fa, B:236:0x0336, B:238:0x033c, B:239:0x0358, B:241:0x0383, B:243:0x0398, B:245:0x039c, B:246:0x03b4, B:248:0x03ba, B:249:0x03d0, B:250:0x03ef, B:252:0x03f5, B:254:0x040d, B:257:0x0418, B:259:0x0455, B:261:0x0467, B:263:0x046d, B:265:0x0473, B:267:0x047b, B:269:0x0486, B:279:0x04c7, B:281:0x04cb, B:284:0x04dd, B:288:0x04f0, B:292:0x0548, B:272:0x0496, B:273:0x04a7, B:275:0x04ad, B:242:0x0394, B:228:0x0289, B:295:0x056b, B:298:0x0577, B:300:0x057d, B:302:0x05b5, B:305:0x05bd, B:306:0x05e4, B:169:0x0031, B:181:0x00ee, B:183:0x00f3, B:187:0x00fc, B:189:0x0102, B:191:0x011d, B:197:0x0129, B:199:0x0167, B:201:0x016d, B:203:0x0185, B:178:0x00d8), top: B:311:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:184:0x00f8  */
        /* JADX WARN: Removed duplicated region for block: B:187:0x00fc A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:168:0x002a, B:207:0x0202, B:209:0x0232, B:211:0x023a, B:214:0x0246, B:216:0x024c, B:218:0x0270, B:224:0x027d, B:226:0x0283, B:229:0x028d, B:231:0x02b3, B:233:0x02b7, B:235:0x02fa, B:236:0x0336, B:238:0x033c, B:239:0x0358, B:241:0x0383, B:243:0x0398, B:245:0x039c, B:246:0x03b4, B:248:0x03ba, B:249:0x03d0, B:250:0x03ef, B:252:0x03f5, B:254:0x040d, B:257:0x0418, B:259:0x0455, B:261:0x0467, B:263:0x046d, B:265:0x0473, B:267:0x047b, B:269:0x0486, B:279:0x04c7, B:281:0x04cb, B:284:0x04dd, B:288:0x04f0, B:292:0x0548, B:272:0x0496, B:273:0x04a7, B:275:0x04ad, B:242:0x0394, B:228:0x0289, B:295:0x056b, B:298:0x0577, B:300:0x057d, B:302:0x05b5, B:305:0x05bd, B:306:0x05e4, B:169:0x0031, B:181:0x00ee, B:183:0x00f3, B:187:0x00fc, B:189:0x0102, B:191:0x011d, B:197:0x0129, B:199:0x0167, B:201:0x016d, B:203:0x0185, B:178:0x00d8), top: B:311:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x0129 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:168:0x002a, B:207:0x0202, B:209:0x0232, B:211:0x023a, B:214:0x0246, B:216:0x024c, B:218:0x0270, B:224:0x027d, B:226:0x0283, B:229:0x028d, B:231:0x02b3, B:233:0x02b7, B:235:0x02fa, B:236:0x0336, B:238:0x033c, B:239:0x0358, B:241:0x0383, B:243:0x0398, B:245:0x039c, B:246:0x03b4, B:248:0x03ba, B:249:0x03d0, B:250:0x03ef, B:252:0x03f5, B:254:0x040d, B:257:0x0418, B:259:0x0455, B:261:0x0467, B:263:0x046d, B:265:0x0473, B:267:0x047b, B:269:0x0486, B:279:0x04c7, B:281:0x04cb, B:284:0x04dd, B:288:0x04f0, B:292:0x0548, B:272:0x0496, B:273:0x04a7, B:275:0x04ad, B:242:0x0394, B:228:0x0289, B:295:0x056b, B:298:0x0577, B:300:0x057d, B:302:0x05b5, B:305:0x05bd, B:306:0x05e4, B:169:0x0031, B:181:0x00ee, B:183:0x00f3, B:187:0x00fc, B:189:0x0102, B:191:0x011d, B:197:0x0129, B:199:0x0167, B:201:0x016d, B:203:0x0185, B:178:0x00d8), top: B:311:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:199:0x0167 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:168:0x002a, B:207:0x0202, B:209:0x0232, B:211:0x023a, B:214:0x0246, B:216:0x024c, B:218:0x0270, B:224:0x027d, B:226:0x0283, B:229:0x028d, B:231:0x02b3, B:233:0x02b7, B:235:0x02fa, B:236:0x0336, B:238:0x033c, B:239:0x0358, B:241:0x0383, B:243:0x0398, B:245:0x039c, B:246:0x03b4, B:248:0x03ba, B:249:0x03d0, B:250:0x03ef, B:252:0x03f5, B:254:0x040d, B:257:0x0418, B:259:0x0455, B:261:0x0467, B:263:0x046d, B:265:0x0473, B:267:0x047b, B:269:0x0486, B:279:0x04c7, B:281:0x04cb, B:284:0x04dd, B:288:0x04f0, B:292:0x0548, B:272:0x0496, B:273:0x04a7, B:275:0x04ad, B:242:0x0394, B:228:0x0289, B:295:0x056b, B:298:0x0577, B:300:0x057d, B:302:0x05b5, B:305:0x05bd, B:306:0x05e4, B:169:0x0031, B:181:0x00ee, B:183:0x00f3, B:187:0x00fc, B:189:0x0102, B:191:0x011d, B:197:0x0129, B:199:0x0167, B:201:0x016d, B:203:0x0185, B:178:0x00d8), top: B:311:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:209:0x0232 A[Catch: Exception -> 0x0038, TryCatch #0 {Exception -> 0x0038, blocks: (B:168:0x002a, B:207:0x0202, B:209:0x0232, B:211:0x023a, B:214:0x0246, B:216:0x024c, B:218:0x0270, B:224:0x027d, B:226:0x0283, B:229:0x028d, B:231:0x02b3, B:233:0x02b7, B:235:0x02fa, B:236:0x0336, B:238:0x033c, B:239:0x0358, B:241:0x0383, B:243:0x0398, B:245:0x039c, B:246:0x03b4, B:248:0x03ba, B:249:0x03d0, B:250:0x03ef, B:252:0x03f5, B:254:0x040d, B:257:0x0418, B:259:0x0455, B:261:0x0467, B:263:0x046d, B:265:0x0473, B:267:0x047b, B:269:0x0486, B:279:0x04c7, B:281:0x04cb, B:284:0x04dd, B:288:0x04f0, B:292:0x0548, B:272:0x0496, B:273:0x04a7, B:275:0x04ad, B:242:0x0394, B:228:0x0289, B:295:0x056b, B:298:0x0577, B:300:0x057d, B:302:0x05b5, B:305:0x05bd, B:306:0x05e4, B:169:0x0031, B:181:0x00ee, B:183:0x00f3, B:187:0x00fc, B:189:0x0102, B:191:0x011d, B:197:0x0129, B:199:0x0167, B:201:0x016d, B:203:0x0185, B:178:0x00d8), top: B:311:0x000f }] */
        /* JADX WARN: Removed duplicated region for block: B:306:0x05e4 A[Catch: Exception -> 0x0038, TRY_LEAVE, TryCatch #0 {Exception -> 0x0038, blocks: (B:168:0x002a, B:207:0x0202, B:209:0x0232, B:211:0x023a, B:214:0x0246, B:216:0x024c, B:218:0x0270, B:224:0x027d, B:226:0x0283, B:229:0x028d, B:231:0x02b3, B:233:0x02b7, B:235:0x02fa, B:236:0x0336, B:238:0x033c, B:239:0x0358, B:241:0x0383, B:243:0x0398, B:245:0x039c, B:246:0x03b4, B:248:0x03ba, B:249:0x03d0, B:250:0x03ef, B:252:0x03f5, B:254:0x040d, B:257:0x0418, B:259:0x0455, B:261:0x0467, B:263:0x046d, B:265:0x0473, B:267:0x047b, B:269:0x0486, B:279:0x04c7, B:281:0x04cb, B:284:0x04dd, B:288:0x04f0, B:292:0x0548, B:272:0x0496, B:273:0x04a7, B:275:0x04ad, B:242:0x0394, B:228:0x0289, B:295:0x056b, B:298:0x0577, B:300:0x057d, B:302:0x05b5, B:305:0x05bd, B:306:0x05e4, B:169:0x0031, B:181:0x00ee, B:183:0x00f3, B:187:0x00fc, B:189:0x0102, B:191:0x011d, B:197:0x0129, B:199:0x0167, B:201:0x016d, B:203:0x0185, B:178:0x00d8), top: B:311:0x000f }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r44) {
            /*
                Method dump skipped, instructions count: 1720
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.ChatSearchViewModel.C38801.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void loadMoreResults(String str, int i, String query) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(query, "query");
        Log.d(TAG, "loadMoreResults: isLoadingMore=" + this._state.getValue().isLoadingMore() + ", hasMoreResults=" + this._state.getValue().getHasMoreResults());
        if (this._state.getValue().isLoadingMore() || !this._state.getValue().getHasMoreResults()) {
            Log.d(TAG, "loadMoreResults: skipping - already loading or no more results");
            return;
        }
        String currentQuery = this._state.getValue().getSearchQuery();
        if (StringsKt.isBlank(currentQuery)) {
            currentQuery = null;
        }
        if (currentQuery == null) {
            currentQuery = query;
        }
        Log.d(TAG, "loadMoreResults: triggering search for more results with query='" + currentQuery + "', lastTimestamp=" + this._state.getValue().getLastTimestamp());
        searchMessages(str, i, currentQuery, true);
    }

    public final void showMessageDetail(ChatMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d(TAG, "showMessageDetail: showing message " + message.getMsgId());
        this._state.setValue(ChatSearchState.copy$default(this._state.getValue(), false, null, null, null, false, false, 0, message, false, 0L, 895, null));
    }

    public final void hideMessageDetail() {
        Log.d(TAG, "hideMessageDetail: hiding message detail");
        this._state.setValue(ChatSearchState.copy$default(this._state.getValue(), false, null, null, null, false, false, 0, null, false, 0L, 895, null));
    }

    /* compiled from: ChatSearchViewModel.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.group.ChatSearchViewModel$getMessageDetail$1", m185f = "ChatSearchViewModel.kt", m186i = {1, 1}, m187l = {238, 253}, m188m = "invokeSuspend", m189n = {"userToken", "token"}, m191s = {"L$0", "L$1"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.group.ChatSearchViewModel$getMessageDetail$1 */
    static final class C38791 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $chatId;
        final /* synthetic */ int $chatType;
        final /* synthetic */ String $messageId;
        Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C38791(String str, String str2, int i, Continuation<? super C38791> continuation) {
            super(2, continuation);
            this.$messageId = str;
            this.$chatId = str2;
            this.$chatType = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChatSearchViewModel.this.new C38791(this.$messageId, this.$chatId, this.$chatType, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C38791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:64:0x0075 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:53:0x001e, B:83:0x0121, B:85:0x0126, B:86:0x016d, B:54:0x0025, B:62:0x0071, B:64:0x0075, B:68:0x007e, B:70:0x0084, B:72:0x009f, B:77:0x00a9, B:79:0x00dd, B:59:0x005b), top: B:91:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:65:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x007e A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:53:0x001e, B:83:0x0121, B:85:0x0126, B:86:0x016d, B:54:0x0025, B:62:0x0071, B:64:0x0075, B:68:0x007e, B:70:0x0084, B:72:0x009f, B:77:0x00a9, B:79:0x00dd, B:59:0x005b), top: B:91:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00a9 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:53:0x001e, B:83:0x0121, B:85:0x0126, B:86:0x016d, B:54:0x0025, B:62:0x0071, B:64:0x0075, B:68:0x007e, B:70:0x0084, B:72:0x009f, B:77:0x00a9, B:79:0x00dd, B:59:0x005b), top: B:91:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x00dd A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:53:0x001e, B:83:0x0121, B:85:0x0126, B:86:0x016d, B:54:0x0025, B:62:0x0071, B:64:0x0075, B:68:0x007e, B:70:0x0084, B:72:0x009f, B:77:0x00a9, B:79:0x00dd, B:59:0x005b), top: B:91:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x0126 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:53:0x001e, B:83:0x0121, B:85:0x0126, B:86:0x016d, B:54:0x0025, B:62:0x0071, B:64:0x0075, B:68:0x007e, B:70:0x0084, B:72:0x009f, B:77:0x00a9, B:79:0x00dd, B:59:0x005b), top: B:91:0x000b }] */
        /* JADX WARN: Removed duplicated region for block: B:86:0x016d A[Catch: Exception -> 0x002b, TRY_LEAVE, TryCatch #0 {Exception -> 0x002b, blocks: (B:53:0x001e, B:83:0x0121, B:85:0x0126, B:86:0x016d, B:54:0x0025, B:62:0x0071, B:64:0x0075, B:68:0x007e, B:70:0x0084, B:72:0x009f, B:77:0x00a9, B:79:0x00dd, B:59:0x005b), top: B:91:0x000b }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r29) {
            /*
                Method dump skipped, instructions count: 510
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.group.ChatSearchViewModel.C38791.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public final void getMessageDetail(String str, int i, String messageId) {
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(messageId, "messageId");
        Log.d(TAG, "getMessageDetail: fetching detail for message " + messageId);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C38791(messageId, str, i, null), 3, null);
    }

    public final void clearError() {
        Log.d(TAG, "clearError: clearing error state");
        this._state.setValue(ChatSearchState.copy$default(this._state.getValue(), false, null, null, null, false, false, 0, null, false, 0L, PointerIconCompat.TYPE_ZOOM_OUT, null));
    }

    public final ChatMessage convertSearchMessageToChatMessage(ChatSearchMessage searchMessage) {
        String chatId = searchMessage.getChatId();
        int chatType = searchMessage.getChatType();
        String name = searchMessage.getName();
        String avatarUrl = searchMessage.getAvatarUrl();
        if (avatarUrl == null) {
            avatarUrl = "";
        }
        MessageSender sender = new MessageSender(chatId, chatType, name, avatarUrl, CollectionsKt.emptyList(), CollectionsKt.emptyList());
        String content = searchMessage.getContent();
        if (StringsKt.isBlank(content)) {
            content = null;
        }
        MessageContent content2 = new MessageContent(content, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777214, null);
        String id = searchMessage.getId();
        Integer intOrNull = StringsKt.toIntOrNull(searchMessage.getType());
        return new ChatMessage(id, sender, "left", intOrNull != null ? intOrNull.intValue() : 1, content2, searchMessage.getTime(), null, null, null, Long.valueOf(searchMessage.getSequence()), null, searchMessage.getChatId(), Integer.valueOf(searchMessage.getChatType()), null);
    }
}
