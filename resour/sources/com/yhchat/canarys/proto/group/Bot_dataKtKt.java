package com.yhchat.canarys.proto.group;

import com.yhchat.canarys.proto.group.Bot_data;
import com.yhchat.canarys.proto.group.Bot_dataKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Bot_dataKt.kt */
@Metadata(m168d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\t"}, m169d2 = {"botData", "Lcom/yhchat/canarys/proto/group/Bot_data;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/group/Bot_dataKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializebotData", "copy", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class Bot_dataKtKt {
    /* renamed from: -initializebotData, reason: not valid java name */
    public static final Bot_data m9522initializebotData(Function1<? super Bot_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Bot_dataKt.Dsl.Companion companion = Bot_dataKt.Dsl.INSTANCE;
        Bot_data.Builder builderNewBuilder = Bot_data.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        Bot_dataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Bot_data copy(Bot_data $this$copy, Function1<? super Bot_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Bot_dataKt.Dsl.Companion companion = Bot_dataKt.Dsl.INSTANCE;
        Bot_data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        Bot_dataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
