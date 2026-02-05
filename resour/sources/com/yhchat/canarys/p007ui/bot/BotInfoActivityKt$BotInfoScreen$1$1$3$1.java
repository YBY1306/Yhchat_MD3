package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotInfoActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotInfoActivityKt$BotInfoScreen$1$1$3$1", m185f = "BotInfoActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes11.dex */
final class BotInfoActivityKt$BotInfoScreen$1$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ State<BotInfoUiState> $uiState$delegate;
    final /* synthetic */ BotInfoViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotInfoActivityKt$BotInfoScreen$1$1$3$1(State<BotInfoUiState> state, Context context, BotInfoViewModel botInfoViewModel, Continuation<? super BotInfoActivityKt$BotInfoScreen$1$1$3$1> continuation) {
        super(2, continuation);
        this.$uiState$delegate = state;
        this.$context = context;
        this.$viewModel = botInfoViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotInfoActivityKt$BotInfoScreen$1$1$3$1(this.$uiState$delegate, this.$context, this.$viewModel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotInfoActivityKt$BotInfoScreen$1$1$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                Result<Unit> resultM10444getAddResultxLWZpok = BotInfoActivityKt.BotInfoScreen$lambda$0(this.$uiState$delegate).m10444getAddResultxLWZpok();
                if (resultM10444getAddResultxLWZpok != null) {
                    Context context = this.$context;
                    BotInfoViewModel botInfoViewModel = this.$viewModel;
                    Object value = resultM10444getAddResultxLWZpok.getValue();
                    if (Result.m11926isSuccessimpl(value)) {
                        Toast.makeText(context, "\u6dfb\u52a0\u673a\u5668\u4eba\u6210\u529f", 0).show();
                    } else {
                        Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
                        Toast.makeText(context, "\u6dfb\u52a0\u673a\u5668\u4eba\u5931\u8d25: " + (thM11922exceptionOrNullimpl != null ? thM11922exceptionOrNullimpl.getMessage() : null), 0).show();
                    }
                    botInfoViewModel.clearAddResult();
                }
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
