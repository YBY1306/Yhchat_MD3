package com.yhchat.canarys.p007ui.conversation;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.yhchat.canarys.data.model.Conversation;
import com.yhchat.canarys.p007ui.conversation.ConversationViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: ConversationScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$3$1", m185f = "ConversationScreen.kt", m186i = {}, m187l = {417}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes11.dex */
final class ConversationScreenKt$ConversationScreen$5$4$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ State<List<Conversation>> $pagedConversations$delegate;
    final /* synthetic */ State<ConversationViewModel.ConversationUiState> $uiState$delegate;
    final /* synthetic */ ConversationViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationScreenKt$ConversationScreen$5$4$3$1(LazyListState lazyListState, ConversationViewModel conversationViewModel, State<? extends List<Conversation>> state, State<ConversationViewModel.ConversationUiState> state2, Continuation<? super ConversationScreenKt$ConversationScreen$5$4$3$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$viewModel = conversationViewModel;
        this.$pagedConversations$delegate = state;
        this.$uiState$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationScreenKt$ConversationScreen$5$4$3$1(this.$listState, this.$viewModel, this.$pagedConversations$delegate, this.$uiState$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationScreenKt$ConversationScreen$5$4$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final LazyListState lazyListState = this.$listState;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$3$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConversationScreenKt$ConversationScreen$5$4$3$1.invokeSuspend$lambda$0(lazyListState);
                    }
                });
                final ConversationViewModel conversationViewModel = this.$viewModel;
                final State<List<Conversation>> state = this.$pagedConversations$delegate;
                final State<ConversationViewModel.ConversationUiState> state2 = this.$uiState$delegate;
                this.label = 1;
                if (flowSnapshotFlow.collect(new FlowCollector() { // from class: com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$5$4$3$1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object value, Continuation $completion) {
                        return emit((Integer) value, (Continuation<? super Unit>) $completion);
                    }

                    public final Object emit(Integer lastIndex, Continuation<? super Unit> continuation) {
                        int lastIndex2 = CollectionsKt.getLastIndex(ConversationScreenKt.ConversationScreen$lambda$34$3$1(state));
                        if (lastIndex != null && lastIndex.intValue() == lastIndex2 && !ConversationScreenKt.ConversationScreen$lambda$0(state2).isLoading()) {
                            conversationViewModel.loadMoreConversations();
                        }
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer invokeSuspend$lambda$0(LazyListState $listState) {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) $listState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo != null) {
            return Integer.valueOf(lazyListItemInfo.getIndex());
        }
        return null;
    }
}
