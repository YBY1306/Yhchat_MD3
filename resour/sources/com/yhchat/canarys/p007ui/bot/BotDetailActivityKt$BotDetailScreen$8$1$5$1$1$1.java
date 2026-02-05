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

/* compiled from: BotDetailActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotDetailActivityKt$BotDetailScreen$8$1$5$1$1$1", m185f = "BotDetailActivity.kt", m186i = {0, 1, 1, 1}, m187l = {325, 330}, m188m = "invokeSuspend", m189n = {"friendRepository", "friendRepository", "it\\1", "$i$a$-fold-BotDetailActivityKt$BotDetailScreen$8$1$5$1$1$1$1\\1\\328\\0"}, m191s = {"L$0", "L$0", "L$2", "I$0"}, m192v = 1)
/* loaded from: classes11.dex */
final class BotDetailActivityKt$BotDetailScreen$8$1$5$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ boolean $checked;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $isNoNotify$delegate;
    final /* synthetic */ MutableState<Boolean> $isSettingNoNotify$delegate;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotDetailActivityKt$BotDetailScreen$8$1$5$1$1$1(Context context, String str, boolean z, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Continuation<? super BotDetailActivityKt$BotDetailScreen$8$1$5$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$botId = str;
        this.$checked = z;
        this.$isNoNotify$delegate = mutableState;
        this.$isSettingNoNotify$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotDetailActivityKt$BotDetailScreen$8$1$5$1$1$1(this.$context, this.$botId, this.$checked, this.$isNoNotify$delegate, this.$isSettingNoNotify$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotDetailActivityKt$BotDetailScreen$8$1$5$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 1
            r3 = 0
            switch(r1) {
                case 0: goto L34;
                case 1: goto L25;
                case 2: goto L13;
                default: goto Lb;
            }
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L13:
            int r0 = r12.I$0
            java.lang.Object r1 = r12.L$2
            com.yhchat.canarys.data.model.ApiStatus r1 = (com.yhchat.canarys.data.model.ApiStatus) r1
            java.lang.Object r2 = r12.L$1
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r4 = r12.L$0
            com.yhchat.canarys.data.repository.FriendRepository r4 = (com.yhchat.canarys.data.repository.FriendRepository) r4
            kotlin.ResultKt.throwOnFailure(r13)
            goto L92
        L25:
            java.lang.Object r1 = r12.L$0
            com.yhchat.canarys.data.repository.FriendRepository r1 = (com.yhchat.canarys.data.repository.FriendRepository) r1
            kotlin.ResultKt.throwOnFailure(r13)
            r4 = r13
            kotlin.Result r4 = (kotlin.Result) r4
            java.lang.Object r4 = r4.getValue()
            goto L56
        L34:
            kotlin.ResultKt.throwOnFailure(r13)
            com.yhchat.canarys.data.di.RepositoryFactory r1 = com.yhchat.canarys.data.p005di.RepositoryFactory.INSTANCE
            android.content.Context r4 = r12.$context
            com.yhchat.canarys.data.repository.FriendRepository r1 = r1.getFriendRepository(r4)
            java.lang.String r4 = r12.$botId
            boolean r5 = r12.$checked
            r6 = r12
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r12.L$0 = r7
            r12.label = r2
            java.lang.Object r4 = r1.m8563setNoNotify0E7RQCE(r4, r5, r6)
            if (r4 != r0) goto L56
            return r0
        L56:
            android.content.Context r5 = r12.$context
            java.lang.String r6 = r12.$botId
            boolean r7 = r12.$checked
            boolean r8 = r12.$checked
            android.content.Context r9 = r12.$context
            androidx.compose.runtime.MutableState<java.lang.Boolean> r10 = r12.$isNoNotify$delegate
            java.lang.Throwable r11 = kotlin.Result.m11922exceptionOrNullimpl(r4)
            if (r11 != 0) goto La0
            r2 = r4
            com.yhchat.canarys.data.model.ApiStatus r2 = (com.yhchat.canarys.data.model.ApiStatus) r2
            r4 = 0
            com.yhchat.canarys.data.repository.CacheRepository r8 = new com.yhchat.canarys.data.repository.CacheRepository
            r8.<init>(r5)
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r1)
            r12.L$0 = r9
            r12.L$1 = r5
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r2)
            r12.L$2 = r9
            r12.I$0 = r4
            r9 = 2
            r12.label = r9
            java.lang.Object r6 = r8.updateConversationDoNotDisturb(r6, r7, r12)
            if (r6 != r0) goto L8e
            return r0
        L8e:
            r0 = r4
            r4 = r1
            r1 = r2
            r2 = r5
        L92:
            java.lang.String r5 = "\u8bbe\u7f6e\u6210\u529f"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r5, r3)
            r2.show()
            r1 = r4
            goto Lc7
        La0:
            r0 = 0
            r2 = r2 ^ r8
            com.yhchat.canarys.p007ui.bot.BotDetailActivityKt.access$BotDetailScreen$lambda$18(r10, r2)
            java.lang.String r2 = r11.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "\u8bbe\u7f6e\u5931\u8d25\uff1a"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            android.widget.Toast r2 = android.widget.Toast.makeText(r9, r2, r3)
            r2.show()
        Lc7:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r12.$isSettingNoNotify$delegate
            com.yhchat.canarys.p007ui.bot.BotDetailActivityKt.access$BotDetailScreen$lambda$21(r0, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotDetailActivityKt$BotDetailScreen$8$1$5$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
