package com.yhchat.canarys.p007ui.components;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
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
@DebugMetadata(m184c = "com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$5$3$1$3$1$1", m185f = "FloatingVoiceWindow.kt", m186i = {}, m187l = {576}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes5.dex */
final class FloatingVoiceWindowKt$FloatingVoiceWindow$5$3$1$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $isLoadingAudios$delegate;
    final /* synthetic */ MutableState<List<SavedAudioItem>> $savedAudios$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FloatingVoiceWindowKt$FloatingVoiceWindow$5$3$1$3$1$1(MutableState<Boolean> mutableState, Context context, MutableState<List<SavedAudioItem>> mutableState2, Continuation<? super FloatingVoiceWindowKt$FloatingVoiceWindow$5$3$1$3$1$1> continuation) {
        super(2, continuation);
        this.$isLoadingAudios$delegate = mutableState;
        this.$context = context;
        this.$savedAudios$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FloatingVoiceWindowKt$FloatingVoiceWindow$5$3$1$3$1$1(this.$isLoadingAudios$delegate, this.$context, this.$savedAudios$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FloatingVoiceWindowKt$FloatingVoiceWindow$5$3$1$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objWithContext;
        MutableState<List<SavedAudioItem>> mutableState;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$18(this.$isLoadingAudios$delegate, true);
                MutableState<List<SavedAudioItem>> mutableState2 = this.$savedAudios$delegate;
                this.L$0 = mutableState2;
                this.label = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C36361(this.$context, null), this);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableState = mutableState2;
                break;
            case 1:
                mutableState = (MutableState) this.L$0;
                ResultKt.throwOnFailure($result);
                objWithContext = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        mutableState.setValue((List) objWithContext);
        FloatingVoiceWindowKt.FloatingVoiceWindow$lambda$18(this.$isLoadingAudios$delegate, false);
        return Unit.INSTANCE;
    }

    /* compiled from: FloatingVoiceWindow.kt */
    @Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "", "Lcom/yhchat/canarys/ui/components/SavedAudioItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$5$3$1$3$1$1$1", m185f = "FloatingVoiceWindow.kt", m186i = {}, m187l = {577}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.components.FloatingVoiceWindowKt$FloatingVoiceWindow$5$3$1$3$1$1$1 */
    static final class C36361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SavedAudioItem>>, Object> {
        final /* synthetic */ Context $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C36361(Context context, Continuation<? super C36361> continuation) {
            super(2, continuation);
            this.$context = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C36361(this.$context, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SavedAudioItem>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SavedAudioItem>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<SavedAudioItem>> continuation) {
            return ((C36361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object $result) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objLoadSavedAudios = FloatingVoiceWindowKt.loadSavedAudios(this.$context, this);
                    if (objLoadSavedAudios == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objLoadSavedAudios;
                case 1:
                    ResultKt.throwOnFailure($result);
                    return $result;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
