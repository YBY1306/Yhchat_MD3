package com.yhchat.canarys.proto.friend;

import androidx.core.app.NotificationCompat;
import com.yhchat.canarys.proto.friend.FriendProto;
import com.yhchat.canarys.proto.friend.StatusKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StatusKt.kt */
@Metadata(m168d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\t"}, m169d2 = {NotificationCompat.CATEGORY_STATUS, "Lcom/yhchat/canarys/proto/friend/FriendProto$Status;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/friend/StatusKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializestatus", "copy", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes7.dex */
public final class StatusKtKt {
    /* renamed from: -initializestatus, reason: not valid java name */
    public static final FriendProto.Status m9489initializestatus(Function1<? super StatusKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        StatusKt.Dsl.Companion companion = StatusKt.Dsl.INSTANCE;
        FriendProto.Status.Builder builderNewBuilder = FriendProto.Status.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        StatusKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final FriendProto.Status copy(FriendProto.Status $this$copy, Function1<? super StatusKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        StatusKt.Dsl.Companion companion = StatusKt.Dsl.INSTANCE;
        FriendProto.Status.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        StatusKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }
}
