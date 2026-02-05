package com.yhchat.canarys.p007ui.chat;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatScreen.kt */
@Metadata(m170k = 3, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$4$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    ChatScreenKt$ChatScreen$21$1$1$7$2$1$2$4$1(Object obj) {
        super(1, obj, ChatViewModel.class, "addExpressionToFavorites", "addExpressionToFavorites(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ChatViewModel) this.receiver).addExpressionToFavorites(p0);
    }
}
