package com.yhchat.canarys.proto.user;

import com.yhchat.canarys.proto.user.User;
import com.yhchat.canarys.proto.user.edit_avatarKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: edit_avatarKt.kt */
@Metadata(m168d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"editAvatar", "Lcom/yhchat/canarys/proto/user/User$edit_avatar;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/user/edit_avatarKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeeditAvatar", "copy", "statusOrNull", "Lcom/yhchat/canarys/proto/user/User$Status;", "Lcom/yhchat/canarys/proto/user/User$edit_avatarOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/user/User$edit_avatarOrBuilder;)Lcom/yhchat/canarys/proto/user/User$Status;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class Edit_avatarKtKt {
    /* renamed from: -initializeeditAvatar, reason: not valid java name */
    public static final User.edit_avatar m10121initializeeditAvatar(Function1<? super edit_avatarKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        edit_avatarKt.Dsl.Companion companion = edit_avatarKt.Dsl.INSTANCE;
        User.edit_avatar.Builder builderNewBuilder = User.edit_avatar.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        edit_avatarKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.edit_avatar copy(User.edit_avatar $this$copy, Function1<? super edit_avatarKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        edit_avatarKt.Dsl.Companion companion = edit_avatarKt.Dsl.INSTANCE;
        User.edit_avatar.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        edit_avatarKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.Status getStatusOrNull(User.edit_avatarOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }
}
