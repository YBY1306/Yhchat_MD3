package com.yhchat.canarys.p007ui.discover;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.BotDetailActivityKt$BotDetailScreen$addGroup$1", m185f = "BotDetailActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1}, m187l = {166, 170}, m188m = "invokeSuspend", m189n = {"$this$launch", "api", "$this$launch", "api", "token", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-BotDetailActivityKt$BotDetailScreen$addGroup$1$1\\1\\169\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
/* loaded from: classes6.dex */
final class BotDetailActivityKt$BotDetailScreen$addGroup$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<String> $addingGroupId$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $groupId;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotDetailActivityKt$BotDetailScreen$addGroup$1(String str, Context context, MutableState<String> mutableState, Continuation<? super BotDetailActivityKt$BotDetailScreen$addGroup$1> continuation) {
        super(2, continuation);
        this.$groupId = str;
        this.$context = context;
        this.$addingGroupId$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotDetailActivityKt$BotDetailScreen$addGroup$1 botDetailActivityKt$BotDetailScreen$addGroup$1 = new BotDetailActivityKt$BotDetailScreen$addGroup$1(this.$groupId, this.$context, this.$addingGroupId$delegate, continuation);
        botDetailActivityKt$BotDetailScreen$addGroup$1.L$0 = obj;
        return botDetailActivityKt$BotDetailScreen$addGroup$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotDetailActivityKt$BotDetailScreen$addGroup$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.BotDetailActivityKt$BotDetailScreen$addGroup$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
