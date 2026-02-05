package com.yhchat.canarys.proto.friend;

import com.yhchat.canarys.proto.friend.FriendProto;
import com.yhchat.canarys.proto.friend.request_listKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: request_listKt.kt */
@Metadata(m168d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0010"}, m169d2 = {"requestList", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/friend/request_listKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializerequestList", "copy", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_list$Request;", "Lcom/yhchat/canarys/proto/friend/request_listKt$RequestKt$Dsl;", "statusOrNull", "Lcom/yhchat/canarys/proto/friend/FriendProto$Status;", "Lcom/yhchat/canarys/proto/friend/FriendProto$request_listOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/friend/FriendProto$request_listOrBuilder;)Lcom/yhchat/canarys/proto/friend/FriendProto$Status;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class Request_listKtKt {
    /* renamed from: -initializerequestList */
    public static final FriendProto.request_list m9488initializerequestList(Function1<? super request_listKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        request_listKt.Dsl.Companion companion = request_listKt.Dsl.INSTANCE;
        FriendProto.request_list.Builder builderNewBuilder = FriendProto.request_list.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        request_listKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FriendProto.request_list copy(FriendProto.request_list $this$copy, Function1<? super request_listKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        request_listKt.Dsl.Companion companion = request_listKt.Dsl.INSTANCE;
        FriendProto.request_list.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        request_listKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FriendProto.request_list.Request copy(FriendProto.request_list.Request $this$copy, Function1<? super request_listKt.RequestKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        request_listKt.RequestKt.Dsl.Companion companion = request_listKt.RequestKt.Dsl.INSTANCE;
        FriendProto.request_list.Request.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        request_listKt.RequestKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FriendProto.Status getStatusOrNull(FriendProto.request_listOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }
}
