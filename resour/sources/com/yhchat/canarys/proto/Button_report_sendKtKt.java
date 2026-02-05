package com.yhchat.canarys.proto;

import com.yhchat.canarys.proto.button_report_send;
import com.yhchat.canarys.proto.button_report_sendKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: button_report_sendKt.kt */
@Metadata(m168d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\t"}, m169d2 = {"buttonReportSend", "Lcom/yhchat/canarys/proto/button_report_send;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/button_report_sendKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializebuttonReportSend", "copy", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class Button_report_sendKtKt {
    /* renamed from: -initializebuttonReportSend, reason: not valid java name */
    public static final button_report_send m8668initializebuttonReportSend(Function1<? super button_report_sendKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        button_report_sendKt.Dsl.Companion companion = button_report_sendKt.Dsl.INSTANCE;
        button_report_send.Builder builderNewBuilder = button_report_send.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        button_report_sendKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final button_report_send copy(button_report_send $this$copy, Function1<? super button_report_sendKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        button_report_sendKt.Dsl.Companion companion = button_report_sendKt.Dsl.INSTANCE;
        button_report_send.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        button_report_sendKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
