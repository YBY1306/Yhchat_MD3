package com.yhchat.canarys.data.repository;

import com.yhchat.canarys.data.model.ChatBackground;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChatBackgroundRepository.kt */
@Metadata(m168d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, m169d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
@DebugMetadata(m184c = "com.yhchat.canarys.data.repository.ChatBackgroundRepository$getBackgroundForChat$2", m185f = "ChatBackgroundRepository.kt", m186i = {}, m187l = {97}, m188m = "invokeSuspend", m189n = {}, m191s = {}, m192v = 1)
/* loaded from: classes12.dex */
final class ChatBackgroundRepository$getBackgroundForChat$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends String>>, Object> {
    final /* synthetic */ String $chatId;
    int label;
    final /* synthetic */ ChatBackgroundRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChatBackgroundRepository$getBackgroundForChat$2(ChatBackgroundRepository chatBackgroundRepository, String str, Continuation<? super ChatBackgroundRepository$getBackgroundForChat$2> continuation) {
        super(2, continuation);
        this.this$0 = chatBackgroundRepository;
        this.$chatId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatBackgroundRepository$getBackgroundForChat$2(this.this$0, this.$chatId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends String>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<String>>) continuation);
    }

    /* renamed from: invoke */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<String>> continuation) {
        return ((ChatBackgroundRepository$getBackgroundForChat$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object $result) {
        Object objM11919constructorimpl;
        Object value;
        Object next;
        Object next2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    this.label = 1;
                    Object objM8489getChatBackgroundListIoAF18A = this.this$0.m8489getChatBackgroundListIoAF18A(this);
                    if (objM8489getChatBackgroundListIoAF18A != coroutine_suspended) {
                        value = objM8489getChatBackgroundListIoAF18A;
                        break;
                    } else {
                        return coroutine_suspended;
                    }
                case 1:
                    ResultKt.throwOnFailure($result);
                    value = ((Result) $result).getValue();
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = this.$chatId;
            Throwable thM11922exceptionOrNullimpl = Result.m11922exceptionOrNullimpl(value);
            if (thM11922exceptionOrNullimpl == null) {
                List list = (List) value;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (Intrinsics.areEqual(((ChatBackground) next).getChatId(), str)) {
                        }
                    } else {
                        next = null;
                    }
                }
                ChatBackground chatBackground = (ChatBackground) next;
                if (chatBackground != null) {
                    Result.Companion companion = Result.INSTANCE;
                    objM11919constructorimpl = Result.m11919constructorimpl(chatBackground.getImgUrl());
                } else {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next2 = it2.next();
                            if (Intrinsics.areEqual(((ChatBackground) next2).getChatId(), "all")) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    ChatBackground chatBackground2 = (ChatBackground) next2;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM11919constructorimpl = Result.m11919constructorimpl(chatBackground2 != null ? chatBackground2.getImgUrl() : null);
                }
            } else {
                Result.Companion companion3 = Result.INSTANCE;
                objM11919constructorimpl = Result.m11919constructorimpl(ResultKt.createFailure(thM11922exceptionOrNullimpl));
            }
        } catch (Exception e) {
            Result.Companion companion4 = Result.INSTANCE;
            objM11919constructorimpl = Result.m11919constructorimpl(ResultKt.createFailure(e));
        }
        return Result.m11918boximpl(objM11919constructorimpl);
    }
}
