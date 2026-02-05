package com.yhchat.canarys.proto.group;

import com.yhchat.canarys.proto.group.list_member_send;
import com.yhchat.canarys.proto.group.list_member_sendKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: list_member_sendKt.kt */
@Metadata(m168d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\t*\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000f"}, m169d2 = {"listMemberSend", "Lcom/yhchat/canarys/proto/group/list_member_send;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/group/list_member_sendKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializelistMemberSend", "copy", "Lcom/yhchat/canarys/proto/group/list_member_send$Data;", "Lcom/yhchat/canarys/proto/group/list_member_sendKt$DataKt$Dsl;", "dataOrNull", "Lcom/yhchat/canarys/proto/group/list_member_sendOrBuilder;", "getDataOrNull", "(Lcom/yhchat/canarys/proto/group/list_member_sendOrBuilder;)Lcom/yhchat/canarys/proto/group/list_member_send$Data;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class List_member_sendKtKt {
    /* renamed from: -initializelistMemberSend */
    public static final list_member_send m9532initializelistMemberSend(Function1<? super list_member_sendKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        list_member_sendKt.Dsl.Companion companion = list_member_sendKt.Dsl.INSTANCE;
        list_member_send.Builder builderNewBuilder = list_member_send.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        list_member_sendKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final list_member_send copy(list_member_send $this$copy, Function1<? super list_member_sendKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        list_member_sendKt.Dsl.Companion companion = list_member_sendKt.Dsl.INSTANCE;
        list_member_send.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        list_member_sendKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final list_member_send.Data copy(list_member_send.Data $this$copy, Function1<? super list_member_sendKt.DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        list_member_sendKt.DataKt.Dsl.Companion companion = list_member_sendKt.DataKt.Dsl.INSTANCE;
        list_member_send.Data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        list_member_sendKt.DataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final list_member_send.Data getDataOrNull(list_member_sendOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
