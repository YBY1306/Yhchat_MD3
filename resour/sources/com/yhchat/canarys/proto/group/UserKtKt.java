package com.yhchat.canarys.proto.group;

import com.yhchat.canarys.proto.group.User;
import com.yhchat.canarys.proto.group.UserKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserKt.kt */
@Metadata(m168d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\t*\u00020\f8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000f"}, m169d2 = {"user", "Lcom/yhchat/canarys/proto/group/User;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/group/UserKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeuser", "copy", "Lcom/yhchat/canarys/proto/group/User$User_info;", "Lcom/yhchat/canarys/proto/group/UserKt$User_infoKt$Dsl;", "userInfoOrNull", "Lcom/yhchat/canarys/proto/group/UserOrBuilder;", "getUserInfoOrNull", "(Lcom/yhchat/canarys/proto/group/UserOrBuilder;)Lcom/yhchat/canarys/proto/group/User$User_info;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes3.dex */
public final class UserKtKt {
    /* renamed from: -initializeuser, reason: not valid java name */
    public static final User m9570initializeuser(Function1<? super UserKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        UserKt.Dsl.Companion companion = UserKt.Dsl.INSTANCE;
        User.Builder builderNewBuilder = User.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        UserKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User copy(User $this$copy, Function1<? super UserKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UserKt.Dsl.Companion companion = UserKt.Dsl.INSTANCE;
        User.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        UserKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.User_info copy(User.User_info $this$copy, Function1<? super UserKt.User_infoKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        UserKt.User_infoKt.Dsl.Companion companion = UserKt.User_infoKt.Dsl.INSTANCE;
        User.User_info.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        UserKt.User_infoKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.User_info getUserInfoOrNull(UserOrBuilder $this$userInfoOrNull) {
        Intrinsics.checkNotNullParameter($this$userInfoOrNull, "<this>");
        if ($this$userInfoOrNull.hasUserInfo()) {
            return $this$userInfoOrNull.getUserInfo();
        }
        return null;
    }
}
