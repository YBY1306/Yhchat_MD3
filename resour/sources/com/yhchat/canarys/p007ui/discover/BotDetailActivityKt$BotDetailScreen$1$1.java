package com.yhchat.canarys.p007ui.discover;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.BotDetail;
import com.yhchat.canarys.data.model.BotDetailGroup;
import com.yhchat.canarys.proto.group.bot_list;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.BotDetailActivityKt$BotDetailScreen$1$1", m185f = "BotDetailActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1}, m187l = {95, bot_list.Menu_data.SELECT_FIELD_NUMBER}, m188m = "invokeSuspend", m189n = {"$this$LaunchedEffect", "api", "$this$LaunchedEffect", "api", "token", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-BotDetailActivityKt$BotDetailScreen$1$1$1\\1\\98\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "I$0"}, m192v = 1)
/* loaded from: classes6.dex */
final class BotDetailActivityKt$BotDetailScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<BotDetail> $bot$delegate;
    final /* synthetic */ String $botId;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<List<BotDetailGroup>> $groups$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotDetailActivityKt$BotDetailScreen$1$1(Context context, MutableState<Boolean> mutableState, MutableState<String> mutableState2, String str, MutableState<BotDetail> mutableState3, MutableState<List<BotDetailGroup>> mutableState4, Continuation<? super BotDetailActivityKt$BotDetailScreen$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$isLoading$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$botId = str;
        this.$bot$delegate = mutableState3;
        this.$groups$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotDetailActivityKt$BotDetailScreen$1$1 botDetailActivityKt$BotDetailScreen$1$1 = new BotDetailActivityKt$BotDetailScreen$1$1(this.$context, this.$isLoading$delegate, this.$error$delegate, this.$botId, this.$bot$delegate, this.$groups$delegate, continuation);
        botDetailActivityKt$BotDetailScreen$1$1.L$0 = obj;
        return botDetailActivityKt$BotDetailScreen$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotDetailActivityKt$BotDetailScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0144  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.BotDetailActivityKt$BotDetailScreen$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
