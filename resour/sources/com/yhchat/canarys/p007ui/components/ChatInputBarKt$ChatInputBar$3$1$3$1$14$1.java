package com.yhchat.canarys.p007ui.components;

import android.util.Log;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.p000ui.geometry.Offset;
import androidx.compose.p000ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p000ui.input.pointer.PointerInputScope;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatInputBar.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes5.dex */
final class ChatInputBarKt$ChatInputBar$3$1$3$1$14$1 implements PointerInputEventHandler {
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ State<Boolean> $currentLongPressSendMarkdownEnabled$delegate;
    final /* synthetic */ State<Function1<Integer, Unit>> $currentMtc$delegate;
    final /* synthetic */ State<Function0<Unit>> $currentOnSendMessage$delegate;
    final /* synthetic */ State<Integer> $currentSelectedMessageType$delegate;
    final /* synthetic */ State<String> $currentText$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    ChatInputBarKt$ChatInputBar$3$1$3$1$14$1(CoroutineScope coroutineScope, State<? extends Function1<? super Integer, Unit>> state, State<String> state2, State<Boolean> state3, State<Integer> state4, State<? extends Function0<Unit>> state5) {
        this.$coroutineScope = coroutineScope;
        this.$currentMtc$delegate = state;
        this.$currentText$delegate = state2;
        this.$currentLongPressSendMarkdownEnabled$delegate = state3;
        this.$currentSelectedMessageType$delegate = state4;
        this.$currentOnSendMessage$delegate = state5;
    }

    @Override // androidx.compose.p000ui.input.pointer.PointerInputEventHandler
    public final Object invoke(PointerInputScope $this$pointerInput, Continuation<? super Unit> continuation) {
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final State<Function1<Integer, Unit>> state = this.$currentMtc$delegate;
        final State<String> state2 = this.$currentText$delegate;
        final State<Boolean> state3 = this.$currentLongPressSendMarkdownEnabled$delegate;
        final State<Integer> state4 = this.$currentSelectedMessageType$delegate;
        final State<Function0<Unit>> state5 = this.$currentOnSendMessage$delegate;
        Function1 function1 = new Function1() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$ChatInputBar$3$1$3$1$14$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatInputBarKt$ChatInputBar$3$1$3$1$14$1.invoke$lambda$0(coroutineScope, state, state2, state3, state4, state5, (Offset) obj);
            }
        };
        final State<String> state6 = this.$currentText$delegate;
        final State<Function0<Unit>> state7 = this.$currentOnSendMessage$delegate;
        Object objDetectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default($this$pointerInput, null, function1, null, new Function1() { // from class: com.yhchat.canarys.ui.components.ChatInputBarKt$ChatInputBar$3$1$3$1$14$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChatInputBarKt$ChatInputBar$3$1$3$1$14$1.invoke$lambda$1(state6, state7, (Offset) obj);
            }
        }, continuation, 5, null);
        return objDetectTapGestures$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectTapGestures$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(State $currentText$delegate, State $currentOnSendMessage$delegate, Offset it) {
        if (!StringsKt.isBlank(ChatInputBarKt.ChatInputBar$lambda$26($currentText$delegate))) {
            Log.d("ChatInputBar", "Send button tapped");
            ChatInputBarKt.ChatInputBar$lambda$27($currentOnSendMessage$delegate).invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(CoroutineScope $coroutineScope, State $currentMtc$delegate, State $currentText$delegate, State $currentLongPressSendMarkdownEnabled$delegate, State $currentSelectedMessageType$delegate, State $currentOnSendMessage$delegate, Offset it) {
        Function1 mtc = ChatInputBarKt.ChatInputBar$lambda$28($currentMtc$delegate);
        if (StringsKt.isBlank(ChatInputBarKt.ChatInputBar$lambda$26($currentText$delegate)) || !ChatInputBarKt.ChatInputBar$lambda$30($currentLongPressSendMarkdownEnabled$delegate) || mtc == null) {
            if (!StringsKt.isBlank(ChatInputBarKt.ChatInputBar$lambda$26($currentText$delegate))) {
                Log.d("ChatInputBar", "Send button long pressed (normal send)");
                ChatInputBarKt.ChatInputBar$lambda$27($currentOnSendMessage$delegate).invoke();
            }
        } else {
            Log.d("ChatInputBar", "Send button long pressed -> Markdown");
            int previousType = ChatInputBarKt.ChatInputBar$lambda$29($currentSelectedMessageType$delegate);
            BuildersKt__Builders_commonKt.launch$default($coroutineScope, null, null, new ChatInputBarKt$ChatInputBar$3$1$3$1$14$1$1$1(previousType, mtc, $currentOnSendMessage$delegate, null), 3, null);
        }
        return Unit.INSTANCE;
    }
}
