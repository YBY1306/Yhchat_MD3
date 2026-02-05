package com.yhchat.canarys.p007ui.discover;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.google.zxing.pdf417.PDF417Common;
import com.yhchat.canarys.data.model.BotBanner;
import com.yhchat.canarys.data.model.BotNewItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotListActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.discover.BotListActivityKt$BotListScreen$1$1", m185f = "BotListActivity.kt", m186i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, m187l = {84, 89, PDF417Common.MAX_ROWS_IN_BARCODE}, m188m = "invokeSuspend", m189n = {"$this$LaunchedEffect", "api", "$this$LaunchedEffect", "api", "token", "$this$invokeSuspend_u24lambda_u240\\1", "$i$a$-runCatching-BotListActivityKt$BotListScreen$1$1$1\\1\\88\\0", "$this$LaunchedEffect", "api", "token", "$this$invokeSuspend_u24lambda_u240\\1", "bannerResponse\\1", "$i$a$-runCatching-BotListActivityKt$BotListScreen$1$1$1\\1\\88\\0"}, m191s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$7", "I$0", "L$0", "L$1", "L$2", "L$7", "L$8", "I$0"}, m192v = 1)
/* loaded from: classes6.dex */
final class BotListActivityKt$BotListScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<List<BotBanner>> $banners$delegate;
    final /* synthetic */ MutableState<List<BotNewItem>> $bots$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<String> $error$delegate;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotListActivityKt$BotListScreen$1$1(Context context, MutableState<Boolean> mutableState, MutableState<String> mutableState2, MutableState<List<BotBanner>> mutableState3, MutableState<List<BotNewItem>> mutableState4, Continuation<? super BotListActivityKt$BotListScreen$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$isLoading$delegate = mutableState;
        this.$error$delegate = mutableState2;
        this.$banners$delegate = mutableState3;
        this.$bots$delegate = mutableState4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BotListActivityKt$BotListScreen$1$1 botListActivityKt$BotListScreen$1$1 = new BotListActivityKt$BotListScreen$1$1(this.$context, this.$isLoading$delegate, this.$error$delegate, this.$banners$delegate, this.$bots$delegate, continuation);
        botListActivityKt$BotListScreen$1$1.L$0 = obj;
        return botListActivityKt$BotListScreen$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotListActivityKt$BotListScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0121 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:7:0x003c, B:30:0x0119, B:32:0x0121, B:34:0x0129, B:39:0x0134, B:41:0x013a, B:44:0x0144, B:43:0x0140, B:45:0x0147, B:47:0x014d, B:49:0x0155, B:54:0x015f, B:56:0x0165, B:59:0x016f, B:66:0x019b, B:58:0x016b, B:61:0x0175, B:64:0x017d, B:65:0x0181, B:10:0x0061, B:26:0x00e7, B:22:0x00b0), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:7:0x003c, B:30:0x0119, B:32:0x0121, B:34:0x0129, B:39:0x0134, B:41:0x013a, B:44:0x0144, B:43:0x0140, B:45:0x0147, B:47:0x014d, B:49:0x0155, B:54:0x015f, B:56:0x0165, B:59:0x016f, B:66:0x019b, B:58:0x016b, B:61:0x0175, B:64:0x017d, B:65:0x0181, B:10:0x0061, B:26:0x00e7, B:22:0x00b0), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:7:0x003c, B:30:0x0119, B:32:0x0121, B:34:0x0129, B:39:0x0134, B:41:0x013a, B:44:0x0144, B:43:0x0140, B:45:0x0147, B:47:0x014d, B:49:0x0155, B:54:0x015f, B:56:0x0165, B:59:0x016f, B:66:0x019b, B:58:0x016b, B:61:0x0175, B:64:0x017d, B:65:0x0181, B:10:0x0061, B:26:0x00e7, B:22:0x00b0), top: B:79:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01cf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.discover.BotListActivityKt$BotListScreen$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
