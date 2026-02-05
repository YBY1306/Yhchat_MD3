package com.yhchat.canarys.proto.user;

import com.yhchat.canarys.proto.user.User;
import com.yhchat.canarys.proto.user.get_userKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: get_userKt.kt */
@Metadata(m168d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u00020\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0015*\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\"\u0017\u0010\u0019\u001a\u0004\u0018\u00010\t*\u00020\u00168F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001c"}, m169d2 = {"getUser", "Lcom/yhchat/canarys/proto/user/User$get_user;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/user/get_userKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializegetUser", "copy", "Lcom/yhchat/canarys/proto/user/User$get_user$Data;", "Lcom/yhchat/canarys/proto/user/get_userKt$DataKt$Dsl;", "remarkInfoOrNull", "Lcom/yhchat/canarys/proto/user/User$RemarkInfo;", "Lcom/yhchat/canarys/proto/user/User$get_user$DataOrBuilder;", "getRemarkInfoOrNull", "(Lcom/yhchat/canarys/proto/user/User$get_user$DataOrBuilder;)Lcom/yhchat/canarys/proto/user/User$RemarkInfo;", "profileInfoOrNull", "Lcom/yhchat/canarys/proto/user/User$ProfileInfo;", "getProfileInfoOrNull", "(Lcom/yhchat/canarys/proto/user/User$get_user$DataOrBuilder;)Lcom/yhchat/canarys/proto/user/User$ProfileInfo;", "statusOrNull", "Lcom/yhchat/canarys/proto/user/User$Status;", "Lcom/yhchat/canarys/proto/user/User$get_userOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/user/User$get_userOrBuilder;)Lcom/yhchat/canarys/proto/user/User$Status;", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/user/User$get_userOrBuilder;)Lcom/yhchat/canarys/proto/user/User$get_user$Data;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class Get_userKtKt {
    /* renamed from: -initializegetUser */
    public static final User.get_user m10125initializegetUser(Function1<? super get_userKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        get_userKt.Dsl.Companion companion = get_userKt.Dsl.INSTANCE;
        User.get_user.Builder builderNewBuilder = User.get_user.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        get_userKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.get_user copy(User.get_user $this$copy, Function1<? super get_userKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        get_userKt.Dsl.Companion companion = get_userKt.Dsl.INSTANCE;
        User.get_user.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        get_userKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.get_user.Data copy(User.get_user.Data $this$copy, Function1<? super get_userKt.DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        get_userKt.DataKt.Dsl.Companion companion = get_userKt.DataKt.Dsl.INSTANCE;
        User.get_user.Data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        get_userKt.DataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.RemarkInfo getRemarkInfoOrNull(User.get_user.DataOrBuilder $this$remarkInfoOrNull) {
        Intrinsics.checkNotNullParameter($this$remarkInfoOrNull, "<this>");
        if ($this$remarkInfoOrNull.hasRemarkInfo()) {
            return $this$remarkInfoOrNull.getRemarkInfo();
        }
        return null;
    }

    public static final User.ProfileInfo getProfileInfoOrNull(User.get_user.DataOrBuilder $this$profileInfoOrNull) {
        Intrinsics.checkNotNullParameter($this$profileInfoOrNull, "<this>");
        if ($this$profileInfoOrNull.hasProfileInfo()) {
            return $this$profileInfoOrNull.getProfileInfo();
        }
        return null;
    }

    public static final User.Status getStatusOrNull(User.get_userOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }

    public static final User.get_user.Data getDataOrNull(User.get_userOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
