package com.yhchat.canarys.p007ui.bot;

import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.repository.TokenRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$1$1$1", m185f = "BotSettingsActivity.kt", m186i = {}, m187l = {441}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes11.dex */
final class BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiService $api;
    final /* synthetic */ String $botId;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ TokenRepository $tokenRepo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$1$1$1(boolean z, TokenRepository tokenRepository, String str, ApiService apiService, Continuation<? super BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$1$1$1> continuation) {
        super(2, continuation);
        this.$checked = z;
        this.$tokenRepo = tokenRepository;
        this.$botId = str;
        this.$api = apiService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$1$1$1(this.$checked, this.$tokenRepo, this.$botId, this.$api, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotSettingsActivityKt$BotSettingsScreen$3$1$1$4$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (BotSettingsActivityKt.BotSettingsScreen$submitEventEdit(this.$tokenRepo, this.$botId, this.$api, "messageReceiveNormal", this.$checked, this) == coroutine_suspended) {
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
