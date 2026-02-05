package com.yhchat.canarys.p007ui.bot;

import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.yhchat.canarys.data.model.CreatedBot;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BotManagementActivity.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotManagementActivityKt$BotManagementScreen$1$1", m185f = "BotManagementActivity.kt", m186i = {}, m187l = {}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes11.dex */
final class BotManagementActivityKt$BotManagementScreen$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $botId;
    final /* synthetic */ MutableState<Boolean> $botIsStop$delegate;
    final /* synthetic */ MutableState<List<CreatedBot>> $botList$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
    final /* synthetic */ CoroutineScope $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotManagementActivityKt$BotManagementScreen$1$1(CoroutineScope coroutineScope, Context context, String str, MutableState<List<CreatedBot>> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super BotManagementActivityKt$BotManagementScreen$1$1> continuation) {
        super(2, continuation);
        this.$scope = coroutineScope;
        this.$context = context;
        this.$botId = str;
        this.$botList$delegate = mutableState;
        this.$botIsStop$delegate = mutableState2;
        this.$isLoading$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BotManagementActivityKt$BotManagementScreen$1$1(this.$scope, this.$context, this.$botId, this.$botList$delegate, this.$botIsStop$delegate, this.$isLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BotManagementActivityKt$BotManagementScreen$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: BotManagementActivity.kt */
    @Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
    @DebugMetadata(m184c = "com.yhchat.canarys.ui.bot.BotManagementActivityKt$BotManagementScreen$1$1$1", m185f = "BotManagementActivity.kt", m186i = {0, 1}, m187l = {121, 136}, m188m = "invokeSuspend", m189n = {"botRepo", "botRepo"}, m191s = {"L$0", "L$0"}, m192v = 1)
    /* renamed from: com.yhchat.canarys.ui.bot.BotManagementActivityKt$BotManagementScreen$1$1$1 */
    static final class C31711 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $botId;
        final /* synthetic */ MutableState<Boolean> $botIsStop$delegate;
        final /* synthetic */ MutableState<List<CreatedBot>> $botList$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C31711(Context context, String str, MutableState<List<CreatedBot>> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, Continuation<? super C31711> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$botId = str;
            this.$botList$delegate = mutableState;
            this.$botIsStop$delegate = mutableState2;
            this.$isLoading$delegate = mutableState3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C31711(this.$context, this.$botId, this.$botList$delegate, this.$botIsStop$delegate, this.$isLoading$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C31711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0059 A[Catch: all -> 0x0122, Exception -> 0x012a, TRY_ENTER, TryCatch #2 {Exception -> 0x012a, all -> 0x0122, blocks: (B:7:0x0018, B:29:0x00fb, B:31:0x0103, B:35:0x0113, B:10:0x0029, B:16:0x004f, B:19:0x0059, B:20:0x0087, B:22:0x008d, B:25:0x00e3, B:24:0x00c3, B:13:0x0039), top: B:46:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00c3 A[Catch: all -> 0x0122, Exception -> 0x012a, TryCatch #2 {Exception -> 0x012a, all -> 0x0122, blocks: (B:7:0x0018, B:29:0x00fb, B:31:0x0103, B:35:0x0113, B:10:0x0029, B:16:0x004f, B:19:0x0059, B:20:0x0087, B:22:0x008d, B:25:0x00e3, B:24:0x00c3, B:13:0x0039), top: B:46:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0103 A[Catch: all -> 0x0122, Exception -> 0x012a, TryCatch #2 {Exception -> 0x012a, all -> 0x0122, blocks: (B:7:0x0018, B:29:0x00fb, B:31:0x0103, B:35:0x0113, B:10:0x0029, B:16:0x004f, B:19:0x0059, B:20:0x0087, B:22:0x008d, B:25:0x00e3, B:24:0x00c3, B:13:0x0039), top: B:46:0x0009 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0118  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 320
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yhchat.canarys.p007ui.bot.BotManagementActivityKt$BotManagementScreen$1$1.C31711.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C31711(this.$context, this.$botId, this.$botList$delegate, this.$botIsStop$delegate, this.$isLoading$delegate, null), 3, null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
