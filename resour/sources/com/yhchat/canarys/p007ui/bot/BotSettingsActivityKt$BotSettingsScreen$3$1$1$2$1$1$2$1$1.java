package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.repository.TokenRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1", m185f = "BotSettingsActivity.kt", m186i = {0, 1, 1, 1, 1}, m187l = {320, 324}, m188m = "invokeSuspend", m189n = {"$this$launch", "$this$launch", "userToken", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-BotSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1$1\\1\\323\\0"}, m191s = {"L$0", "L$0", "L$1", "L$2", "I$0"}, m192v = 1)
/* loaded from: classes11.dex */
final class BotSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiService $api;
    final /* synthetic */ String $botId;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $isSavingWebhook$delegate;
    final /* synthetic */ TokenRepository $tokenRepo;
    final /* synthetic */ MutableState<String> $webhookUrl$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1(TokenRepository tokenRepository, MutableState<Boolean> mutableState, MutableState<String> mutableState2, ApiService apiService, String str, MutableState<String> mutableState3, Context context, Continuation<? super BotSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1> continuation) {
        super(2, continuation);
        this.$tokenRepo = tokenRepository;
        this.$isSavingWebhook$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$api = apiService;
        this.$botId = str;
        this.$webhookUrl$delegate = mutableState3;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1 botSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1 = new BotSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1(this.$tokenRepo, this.$isSavingWebhook$delegate, this.$error$delegate, this.$api, this.$botId, this.$webhookUrl$delegate, this.$context, continuation);
        botSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1.L$0 = obj;
        return botSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotSettingsActivityKt$BotSettingsScreen$3$1$1$2$1$1$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
