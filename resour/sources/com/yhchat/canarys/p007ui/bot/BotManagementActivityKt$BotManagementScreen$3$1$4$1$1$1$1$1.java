package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotManagementActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1", m185f = "BotManagementActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, m187l = {319, 334, 346}, m188m = "invokeSuspend", m189n = {"$this$launch", "tokenRepo", "$this$launch", "tokenRepo", "userToken", "request", "requestBody", "$this$invokeSuspend_u24lambda_u240\\1", "operation", "$i$a$-runCatching-BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1$1\\1\\333\\0", "$this$launch", "tokenRepo", "userToken", "request", "requestBody", "resp\\2", "status\\2", "responseBody\\2", "action\\2", "botRepo\\2", "operation", "$i$a$-onSuccess-BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1$2\\2\\335\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "I$1"}, m192v = 1)
/* loaded from: classes11.dex */
final class BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ MutableState<Boolean> $botIsStop$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $isStoppingBot$delegate;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1(Context context, String str, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$botId = str;
        this.$isStoppingBot$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$botIsStop$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1 botManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1 = new BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1(this.$context, this.$botId, this.$isStoppingBot$delegate, this.$error$delegate, this.$botIsStop$delegate, continuation);
        botManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1.L$0 = obj;
        return botManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws com.google.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 708
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
