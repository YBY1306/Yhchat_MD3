package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotManagementActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1", m185f = "BotManagementActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1, 1}, m187l = {405, 415}, m188m = "invokeSuspend", m189n = {"$this$launch", "tokenRepo", "$this$launch", "tokenRepo", "userToken", "request", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1$1\\1\\414\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, m192v = 1)
/* loaded from: classes11.dex */
final class BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $isDeletingBot$delegate;
    final /* synthetic */ Function0<Unit> $onBackClick;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1(Context context, String str, MutableState<Boolean> mutableState, MutableState<String> mutableState2, Function0<Unit> function0, Continuation<? super BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$botId = str;
        this.$isDeletingBot$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$onBackClick = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1 botManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1 = new BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1(this.$context, this.$botId, this.$isDeletingBot$delegate, this.$error$delegate, this.$onBackClick, continuation);
        botManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1.L$0 = obj;
        return botManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotManagementActivityKt$BotManagementScreen$3$1$4$1$1$3$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
