package com.yhchat.canarys.p007ui.chat;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.State;
import com.yhchat.canarys.data.model.ChatMessage;
import com.yhchat.canarys.data.model.MessageSender;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.chat.ChatScreenKt$ChatScreen$19$1", m185f = "ChatScreen.kt", m186i = {0, 0, 0, 0, 0, 0, 0}, m187l = {390}, m188m = "invokeSuspend", m189n = {"reversedMessages", "latestMessage", "isNearBottom", "isMyMessage", "currentTime", "isRecentMessage", "shouldAutoScroll"}, m191s = {"L$0", "L$1", "I$0", "Z$0", "J$0", "I$1", "I$2"}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatScreenKt$ChatScreen$19$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ List<ChatMessage> $messages;
    final /* synthetic */ State<ChatUiState> $uiState$delegate;
    final /* synthetic */ String $userId;
    final /* synthetic */ ChatViewModel $viewModel;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatScreenKt$ChatScreen$19$1(List<ChatMessage> list, LazyListState lazyListState, String str, ChatViewModel chatViewModel, State<ChatUiState> state, Continuation<? super ChatScreenKt$ChatScreen$19$1> continuation) {
        super(2, continuation);
        this.$messages = list;
        this.$listState = lazyListState;
        this.$userId = str;
        this.$viewModel = chatViewModel;
        this.$uiState$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatScreenKt$ChatScreen$19$1(this.$messages, this.$listState, this.$userId, this.$viewModel, this.$uiState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChatScreenKt$ChatScreen$19$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        int i;
        boolean shouldAutoScroll;
        int i2;
        long currentTime;
        MessageSender sender;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                if (ChatScreenKt.ChatScreen$lambda$9(this.$uiState$delegate).getNewMessageReceived()) {
                    List reversedMessages = CollectionsKt.reversed(this.$messages);
                    ChatMessage latestMessage = (ChatMessage) CollectionsKt.firstOrNull(reversedMessages);
                    int i3 = 0;
                    int i4 = (this.$listState.getFirstVisibleItemIndex() > 4 || this.$listState.isScrollInProgress()) ? 0 : 1;
                    boolean isMyMessage = Intrinsics.areEqual((latestMessage == null || (sender = latestMessage.getSender()) == null) ? null : sender.getChatId(), this.$userId);
                    long currentTime2 = System.currentTimeMillis();
                    int i5 = (latestMessage == null || currentTime2 - latestMessage.getSendTime() > 500000) ? 0 : 1;
                    if (isMyMessage || (i4 != 0 && i5 != 0)) {
                        i3 = 1;
                    }
                    if (i3 != 0) {
                        this.L$0 = SpillingKt.nullOutSpilledVariable(reversedMessages);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(latestMessage);
                        this.I$0 = i4;
                        this.Z$0 = isMyMessage;
                        this.J$0 = currentTime2;
                        this.I$1 = i5;
                        this.I$2 = i3;
                        this.label = 1;
                        if (LazyListState.animateScrollToItem$default(this.$listState, 0, 0, this, 2, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i = i3;
                        shouldAutoScroll = isMyMessage;
                        i2 = i5;
                        currentTime = currentTime2;
                    }
                    this.$viewModel.resetNewMessageFlag();
                }
                return Unit.INSTANCE;
            case 1:
                i = this.I$2;
                i2 = this.I$1;
                currentTime = this.J$0;
                shouldAutoScroll = this.Z$0;
                int i6 = this.I$0;
                ResultKt.throwOnFailure($result);
                this.$viewModel.resetNewMessageFlag();
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
