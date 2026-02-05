package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import android.util.Log;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: FloatingVoiceWindow.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$1$1", m185f = "FloatingVoiceWindow.kt", m186i = {}, m187l = {241}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes5.dex */
final class FloatingVoiceWindowKt$FloatingVoiceWindow$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $selectedTtsEngine$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingVoiceWindowKt$FloatingVoiceWindow$1$1(Context context, MutableState<String> mutableState, Continuation<? super FloatingVoiceWindowKt$FloatingVoiceWindow$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$selectedTtsEngine$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatingVoiceWindowKt$FloatingVoiceWindow$1$1(this.$context, this.$selectedTtsEngine$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FloatingVoiceWindowKt$FloatingVoiceWindow$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: FloatingVoiceWindow.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$1$1$1", m185f = "FloatingVoiceWindow.kt", m186i = {0}, m187l = {247}, m188m = "invokeSuspend", m189n = {"defaultEngine"}, m191s = {"L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$1$1$1 */
    static final class C36331 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<String> $selectedTtsEngine$delegate;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36331(Context context, MutableState<String> mutableState, Continuation<? super C36331> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$selectedTtsEngine$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C36331(this.$context, this.$selectedTtsEngine$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C36331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            String defaultEngine;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    String defaultEngine2 = FloatingVoiceWindowKt.getDefaultTtsEngine(this.$context);
                    if (defaultEngine2 == null || StringsKt.isBlank(defaultEngine2)) {
                        Boxing.boxInt(Log.d("FloatingVoiceWindow", "\u7cfb\u7edf\u672a\u8bbe\u7f6e\u9ed8\u8ba4TTS\u5f15\u64ce\uff0c\u5c06\u4f7f\u7528\u9ed8\u8ba4\u521d\u59cb\u5316"));
                        return Unit.INSTANCE;
                    }
                    Log.d("FloatingVoiceWindow", "\u68c0\u6d4b\u5230\u7cfb\u7edf\u9ed8\u8ba4TTS\u5f15\u64ce: " + defaultEngine2 + "\uff0c\u5c06\u5c1d\u8bd5\u4f7f\u7528\u6b64\u5f15\u64ce");
                    this.L$0 = SpillingKt.nullOutSpilledVariable(defaultEngine2);
                    this.label = 1;
                    if (BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass1(defaultEngine2, this.$selectedTtsEngine$delegate, null), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    defaultEngine = defaultEngine2;
                    return Unit.INSTANCE;
                case 1:
                    defaultEngine = (String) this.L$0;
                    ResultKt.throwOnFailure($result);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: FloatingVoiceWindow.kt */
        @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
        @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$1$1$1$1", m185f = "FloatingVoiceWindow.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
        /* renamed from: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$1$1$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ String $defaultEngine;
            final /* synthetic */ MutableState<String> $selectedTtsEngine$delegate;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(String str, MutableState<String> mutableState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$defaultEngine = str;
                this.$selectedTtsEngine$delegate = mutableState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$defaultEngine, this.$selectedTtsEngine$delegate, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object $result) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0:
                        ResultKt.throwOnFailure($result);
                        this.$selectedTtsEngine$delegate.setValue(this.$defaultEngine);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
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
                if (BuildersKt.withContext(Dispatchers.getIO(), new C36331(this.$context, this.$selectedTtsEngine$delegate, null), this) == coroutine_suspended) {
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
