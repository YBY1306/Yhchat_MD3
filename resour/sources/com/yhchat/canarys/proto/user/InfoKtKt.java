package com.yhchat.canarys.proto.user;

import com.yhchat.canarys.proto.user.User;
import com.yhchat.canarys.proto.user.infoKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: infoKt.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\t*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0013"}, m169d2 = {"info", "Lcom/yhchat/canarys/proto/user/User$info;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/user/infoKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeinfo", "copy", "Lcom/yhchat/canarys/proto/user/User$info$Data;", "Lcom/yhchat/canarys/proto/user/infoKt$DataKt$Dsl;", "statusOrNull", "Lcom/yhchat/canarys/proto/user/User$Status;", "Lcom/yhchat/canarys/proto/user/User$infoOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/user/User$infoOrBuilder;)Lcom/yhchat/canarys/proto/user/User$Status;", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/user/User$infoOrBuilder;)Lcom/yhchat/canarys/proto/user/User$info$Data;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class InfoKtKt {
    /* renamed from: -initializeinfo */
    public static final User.info m10127initializeinfo(Function1<? super infoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        infoKt.Dsl.Companion companion = infoKt.Dsl.INSTANCE;
        User.info.Builder builderNewBuilder = User.info.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        infoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.info copy(User.info $this$copy, Function1<? super infoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        infoKt.Dsl.Companion companion = infoKt.Dsl.INSTANCE;
        User.info.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        infoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.info.Data copy(User.info.Data $this$copy, Function1<? super infoKt.DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        infoKt.DataKt.Dsl.Companion companion = infoKt.DataKt.Dsl.INSTANCE;
        User.info.Data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        infoKt.DataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.Status getStatusOrNull(User.infoOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }

    public static final User.info.Data getDataOrNull(User.infoOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
