package com.yhchat.canarys.p007ui.conversation;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import com.yhchat.canarys.utils.QRCodeUtil;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConversationScreen.kt */
@Metadata(m168d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m169d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.ui.conversation.ConversationScreenKt$ConversationScreen$galleryLauncher$1$1$1", m185f = "ConversationScreen.kt", m186i = {}, m187l = {162}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes11.dex */
final class ConversationScreenKt$ConversationScreen$galleryLauncher$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $context;
    final /* synthetic */ Function1<String, Unit> $handleScanResult;
    final /* synthetic */ Uri $uri;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationScreenKt$ConversationScreen$galleryLauncher$1$1$1(Context context, Uri uri, Function1<? super String, Unit> function1, Continuation<? super ConversationScreenKt$ConversationScreen$galleryLauncher$1$1$1> continuation) {
        super(2, continuation);
        this.$context = context;
        this.$uri = uri;
        this.$handleScanResult = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationScreenKt$ConversationScreen$galleryLauncher$1$1$1(this.$context, this.$uri, this.$handleScanResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationScreenKt$ConversationScreen$galleryLauncher$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objDecodeFromUri;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                objDecodeFromUri = QRCodeUtil.INSTANCE.decodeFromUri(this.$context, this.$uri, this);
                if (objDecodeFromUri == coroutine_suspended) {
                    return coroutine_suspended;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                objDecodeFromUri = $result;
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        String text = (String) objDecodeFromUri;
        if (text != null) {
            this.$handleScanResult.invoke(text);
        } else {
            Toast.makeText(this.$context, "\u672a\u8bc6\u522b\u5230\u4e8c\u7ef4\u7801", 0).show();
        }
        return Unit.INSTANCE;
    }
}
