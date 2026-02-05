package com.yhchat.canarys.proto;

import com.yhchat.canarys.proto.edit_message;
import com.yhchat.canarys.proto.edit_messageKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: edit_messageKt.kt */
@Metadata(m168d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"editMessage", "Lcom/yhchat/canarys/proto/edit_message;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/edit_messageKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeeditMessage", "copy", "statusOrNull", "Lcom/yhchat/canarys/proto/Status;", "Lcom/yhchat/canarys/proto/edit_messageOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/edit_messageOrBuilder;)Lcom/yhchat/canarys/proto/Status;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class Edit_messageKtKt {
    /* renamed from: -initializeeditMessage, reason: not valid java name */
    public static final edit_message m8669initializeeditMessage(Function1<? super edit_messageKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        edit_messageKt.Dsl.Companion companion = edit_messageKt.Dsl.INSTANCE;
        edit_message.Builder builderNewBuilder = edit_message.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        edit_messageKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final edit_message copy(edit_message $this$copy, Function1<? super edit_messageKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        edit_messageKt.Dsl.Companion companion = edit_messageKt.Dsl.INSTANCE;
        edit_message.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        edit_messageKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Status getStatusOrNull(edit_messageOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }
}
