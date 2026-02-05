package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.api.ApiService;
import com.yhchat.canarys.data.model.BotInstruction;
import com.yhchat.canarys.data.repository.TokenRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotSettingsActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotSettingsActivityKt$BotSettingsScreen$1$1", m185f = "BotSettingsActivity.kt", m186i = {0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4}, m187l = {124, 128, 139, 151, 176}, m188m = "invokeSuspend", m189n = {"$this$LaunchedEffect", "$this$LaunchedEffect", "userToken", "botRepo", "$this$LaunchedEffect", "userToken", "botRepo", "$this$LaunchedEffect", "userToken", "$this$invokeSuspend_u24lambda_u244\\9", "$i$a$-runCatching-BotSettingsActivityKt$BotSettingsScreen$1$1$5\\9\\150\\0", "$this$LaunchedEffect", "userToken", "$this$invokeSuspend_u24lambda_u247\\14", "$i$a$-runCatching-BotSettingsActivityKt$BotSettingsScreen$1$1$8\\14\\175\\0"}, m191s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"}, m192v = 1)
/* loaded from: classes11.dex */
final class BotSettingsActivityKt$BotSettingsScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ApiService $api;
    final /* synthetic */ MutableState<Boolean> $botFollowed$delegate;
    final /* synthetic */ String $botId;
    final /* synthetic */ MutableState<Boolean> $botSetting$delegate;
    final /* synthetic */ MutableState<Boolean> $botUnfollowed$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $groupJoin$delegate;
    final /* synthetic */ MutableState<Boolean> $groupLeave$delegate;
    final /* synthetic */ MutableState<List<BotInstruction>> $instructions$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoadingInstructions$delegate;
    final /* synthetic */ MutableState<Boolean> $messageReceiveInstruction$delegate;
    final /* synthetic */ MutableState<Boolean> $messageReceiveNormal$delegate;
    final /* synthetic */ MutableState<String> $token$delegate;
    final /* synthetic */ TokenRepository $tokenRepo;
    final /* synthetic */ MutableState<String> $webhookUrl$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotSettingsActivityKt$BotSettingsScreen$1$1(TokenRepository tokenRepository, Context context, MutableState<String> mutableState, String str, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, MutableState<String> mutableState4, ApiService apiService, MutableState<Boolean> mutableState5, MutableState<Boolean> mutableState6, MutableState<Boolean> mutableState7, MutableState<Boolean> mutableState8, MutableState<Boolean> mutableState9, MutableState<Boolean> mutableState10, MutableState<Boolean> mutableState11, MutableState<List<BotInstruction>> mutableState12, MutableState<Boolean> mutableState13, Continuation<? super BotSettingsActivityKt$BotSettingsScreen$1$1> continuation) {
        super(2, continuation);
        this.$tokenRepo = tokenRepository;
        this.$context = context;
        this.$token$delegate = mutableState;
        this.$botId = str;
        this.$webhookUrl$delegate = mutableState2;
        this.$isLoading$delegate = mutableState3;
        this.$error$delegate = mutableState4;
        this.$api = apiService;
        this.$messageReceiveNormal$delegate = mutableState5;
        this.$messageReceiveInstruction$delegate = mutableState6;
        this.$botFollowed$delegate = mutableState7;
        this.$botUnfollowed$delegate = mutableState8;
        this.$groupJoin$delegate = mutableState9;
        this.$groupLeave$delegate = mutableState10;
        this.$botSetting$delegate = mutableState11;
        this.$instructions$delegate = mutableState12;
        this.$isLoadingInstructions$delegate = mutableState13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotSettingsActivityKt$BotSettingsScreen$1$1 botSettingsActivityKt$BotSettingsScreen$1$1 = new BotSettingsActivityKt$BotSettingsScreen$1$1(this.$tokenRepo, this.$context, this.$token$delegate, this.$botId, this.$webhookUrl$delegate, this.$isLoading$delegate, this.$error$delegate, this.$api, this.$messageReceiveNormal$delegate, this.$messageReceiveInstruction$delegate, this.$botFollowed$delegate, this.$botUnfollowed$delegate, this.$groupJoin$delegate, this.$groupLeave$delegate, this.$botSetting$delegate, this.$instructions$delegate, this.$isLoadingInstructions$delegate, continuation);
        botSettingsActivityKt$BotSettingsScreen$1$1.L$0 = obj;
        return botSettingsActivityKt$BotSettingsScreen$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotSettingsActivityKt$BotSettingsScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d8  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotSettingsActivityKt$BotSettingsScreen$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
