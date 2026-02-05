package com.yhchat.canarys.proto.user;

import com.yhchat.canarys.proto.user.Medal_infoKt;
import com.yhchat.canarys.proto.user.User;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Medal_infoKt.kt */
@Metadata(m168d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\t"}, m169d2 = {"medalInfo", "Lcom/yhchat/canarys/proto/user/User$Medal_info;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/user/Medal_infoKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializemedalInfo", "copy", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class Medal_infoKtKt {
    /* renamed from: -initializemedalInfo, reason: not valid java name */
    public static final User.Medal_info m10129initializemedalInfo(Function1<? super Medal_infoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Medal_infoKt.Dsl.Companion companion = Medal_infoKt.Dsl.INSTANCE;
        User.Medal_info.Builder builderNewBuilder = User.Medal_info.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        Medal_infoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.Medal_info copy(User.Medal_info $this$copy, Function1<? super Medal_infoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Medal_infoKt.Dsl.Companion companion = Medal_infoKt.Dsl.INSTANCE;
        User.Medal_info.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        Medal_infoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
