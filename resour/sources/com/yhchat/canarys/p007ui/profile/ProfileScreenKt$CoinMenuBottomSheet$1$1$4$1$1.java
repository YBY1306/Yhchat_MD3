package com.yhchat.canarys.p007ui.profile;

import android.content.Context;
import com.yhchat.canarys.data.p005di.RepositoryFactory;
import com.yhchat.canarys.data.repository.TokenRepository;
import com.yhchat.canarys.p007ui.webview.WebViewActivity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ProfileScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.profile.ProfileScreenKt$CoinMenuBottomSheet$1$1$4$1$1", m185f = "ProfileScreen.kt", m186i = {0}, m187l = {694}, m188m = "invokeSuspend", m189n = {"repo"}, m191s = {"L$0"}, m192v = 1)
/* loaded from: classes16.dex */
final class ProfileScreenKt$CoinMenuBottomSheet$1$1$4$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ TokenRepository $tokenRepository;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileScreenKt$CoinMenuBottomSheet$1$1$4$1$1(TokenRepository tokenRepository, Context context, Function0<Unit> function0, Continuation<? super ProfileScreenKt$CoinMenuBottomSheet$1$1$4$1$1> continuation) {
        super(2, continuation);
        this.$tokenRepository = tokenRepository;
        this.$context = context;
        this.$onDismiss = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ProfileScreenKt$CoinMenuBottomSheet$1$1$4$1$1(this.$tokenRepository, this.$context, this.$onDismiss, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ProfileScreenKt$CoinMenuBottomSheet$1$1$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object tokenSync;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                TokenRepository repo = this.$tokenRepository;
                if (repo == null) {
                    repo = RepositoryFactory.INSTANCE.getTokenRepository(this.$context);
                }
                this.L$0 = SpillingKt.nullOutSpilledVariable(repo);
                this.label = 1;
                tokenSync = repo.getTokenSync(this);
                if (tokenSync != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                tokenSync = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String token = (String) tokenSync;
        WebViewActivity.INSTANCE.start(this.$context, "https://huodong.yhchat.com/zhouzhouchou/index", "\u4e91\u6e56\u5468\u5468\u62bd", token);
        this.$onDismiss.invoke();
        return Unit.INSTANCE;
    }
}
