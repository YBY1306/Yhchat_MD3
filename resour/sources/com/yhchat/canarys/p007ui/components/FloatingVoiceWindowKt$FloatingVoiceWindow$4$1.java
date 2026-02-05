package com.yhchat.canarys.p007ui.components;

import android.speech.tts.TextToSpeech;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FloatingVoiceWindow.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$4$1", m185f = "FloatingVoiceWindow.kt", m186i = {}, m187l = {504}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes5.dex */
final class FloatingVoiceWindowKt$FloatingVoiceWindow$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<TextToSpeech.EngineInfo>> $availableTtsEngines$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingVoiceWindowKt$FloatingVoiceWindow$4$1(MutableState<List<TextToSpeech.EngineInfo>> mutableState, Continuation<? super FloatingVoiceWindowKt$FloatingVoiceWindow$4$1> continuation) {
        super(2, continuation);
        this.$availableTtsEngines$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatingVoiceWindowKt$FloatingVoiceWindow$4$1(this.$availableTtsEngines$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FloatingVoiceWindowKt$FloatingVoiceWindow$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: FloatingVoiceWindow.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$4$1$1", m185f = "FloatingVoiceWindow.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$4$1$1 */
    static final class C36351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MutableState<List<TextToSpeech.EngineInfo>> $availableTtsEngines$delegate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36351(MutableState<List<TextToSpeech.EngineInfo>> mutableState, Continuation<? super C36351> continuation) {
            super(2, continuation);
            this.$availableTtsEngines$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C36351(this.$availableTtsEngines$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    try {
                        this.$availableTtsEngines$delegate.setValue(CollectionsKt.emptyList());
                        Log.d("FloatingVoiceWindow", "TTS\u5f15\u64ce\u5217\u8868\u529f\u80fd\u6682\u4e0d\u53ef\u7528\uff0c\u5c06\u4f7f\u7528\u9ed8\u8ba4\u5f15\u64ce");
                    } catch (Exception e) {
                        Log.e("FloatingVoiceWindow", "\u83b7\u53d6TTS\u5f15\u64ce\u5217\u8868\u5931\u8d25", e);
                        this.$availableTtsEngines$delegate.setValue(CollectionsKt.emptyList());
                    }
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (BuildersKt.withContext(Dispatchers.getIO(), new C36351(this.$availableTtsEngines$delegate, null), this) == coroutine_suspended) {
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
}
