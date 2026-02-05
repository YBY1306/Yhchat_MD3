package com.yhchat.canarys.p007ui.bot;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BotSettingsActivity.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotSettingsActivityKt", m185f = "BotSettingsActivity.kt", m186i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, m187l = {108, 120}, m188m = "BotSettingsScreen$submitEventEdit", m189n = {"tokenRepo", "$botId", "api", "typ", "enabled", "tokenRepo", "$botId", "api", "typ", "userToken", "req", "enabled", "value", "$i$a$-runCatching-BotSettingsActivityKt$BotSettingsScreen$submitEventEdit$2\\1\\120\\0"}, m191s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0", "I$1"}, m192v = 1)
/* loaded from: classes11.dex */
final class BotSettingsActivityKt$BotSettingsScreen$submitEventEdit$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    BotSettingsActivityKt$BotSettingsScreen$submitEventEdit$1(Continuation<? super BotSettingsActivityKt$BotSettingsScreen$submitEventEdit$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return BotSettingsActivityKt.BotSettingsScreen$submitEventEdit(null, null, null, null, false, this);
    }
}
