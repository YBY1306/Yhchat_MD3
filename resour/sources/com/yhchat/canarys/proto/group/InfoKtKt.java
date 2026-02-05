package com.yhchat.canarys.proto.group;

import com.yhchat.canarys.proto.group.info;
import com.yhchat.canarys.proto.group.infoKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: infoKt.kt */
@Metadata(m168d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0017\u0010\u0012\u001a\u0004\u0018\u00010\t*\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0015"}, m169d2 = {"info", "Lcom/yhchat/canarys/proto/group/info;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/group/infoKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeinfo", "copy", "Lcom/yhchat/canarys/proto/group/info$Group_data;", "Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$Dsl;", "Lcom/yhchat/canarys/proto/group/info$Group_data$Tag;", "Lcom/yhchat/canarys/proto/group/infoKt$Group_dataKt$TagKt$Dsl;", "statusOrNull", "Lcom/yhchat/canarys/proto/group/Status;", "Lcom/yhchat/canarys/proto/group/infoOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/group/infoOrBuilder;)Lcom/yhchat/canarys/proto/group/Status;", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/group/infoOrBuilder;)Lcom/yhchat/canarys/proto/group/info$Group_data;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class InfoKtKt {
    /* renamed from: -initializeinfo */
    public static final info m9529initializeinfo(Function1<? super infoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        infoKt.Dsl.Companion companion = infoKt.Dsl.INSTANCE;
        info.Builder builderNewBuilder = info.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        infoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final info copy(info $this$copy, Function1<? super infoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        infoKt.Dsl.Companion companion = infoKt.Dsl.INSTANCE;
        info.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        infoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final info.Group_data copy(info.Group_data $this$copy, Function1<? super infoKt.Group_dataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        infoKt.Group_dataKt.Dsl.Companion companion = infoKt.Group_dataKt.Dsl.INSTANCE;
        info.Group_data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        infoKt.Group_dataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final info.Group_data.Tag copy(info.Group_data.Tag $this$copy, Function1<? super infoKt.Group_dataKt.TagKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        infoKt.Group_dataKt.TagKt.Dsl.Companion companion = infoKt.Group_dataKt.TagKt.Dsl.INSTANCE;
        info.Group_data.Tag.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        infoKt.Group_dataKt.TagKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Status getStatusOrNull(infoOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }

    public static final info.Group_data getDataOrNull(infoOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
