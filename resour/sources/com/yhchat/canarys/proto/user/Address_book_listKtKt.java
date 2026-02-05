package com.yhchat.canarys.proto.user;

import com.yhchat.canarys.proto.user.User;
import com.yhchat.canarys.proto.user.address_book_listKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: address_book_listKt.kt */
@Metadata(m168d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0012"}, m169d2 = {"addressBookList", "Lcom/yhchat/canarys/proto/user/User$address_book_list;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/user/address_book_listKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeaddressBookList", "copy", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data;", "Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Dsl;", "Lcom/yhchat/canarys/proto/user/User$address_book_list$Data$Data_list;", "Lcom/yhchat/canarys/proto/user/address_book_listKt$DataKt$Data_listKt$Dsl;", "statusOrNull", "Lcom/yhchat/canarys/proto/user/User$Status;", "Lcom/yhchat/canarys/proto/user/User$address_book_listOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/user/User$address_book_listOrBuilder;)Lcom/yhchat/canarys/proto/user/User$Status;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes15.dex */
public final class Address_book_listKtKt {
    /* renamed from: -initializeaddressBookList */
    public static final User.address_book_list m10118initializeaddressBookList(Function1<? super address_book_listKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        address_book_listKt.Dsl.Companion companion = address_book_listKt.Dsl.INSTANCE;
        User.address_book_list.Builder builderNewBuilder = User.address_book_list.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        address_book_listKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.address_book_list copy(User.address_book_list $this$copy, Function1<? super address_book_listKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        address_book_listKt.Dsl.Companion companion = address_book_listKt.Dsl.INSTANCE;
        User.address_book_list.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        address_book_listKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.address_book_list.Data copy(User.address_book_list.Data $this$copy, Function1<? super address_book_listKt.DataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        address_book_listKt.DataKt.Dsl.Companion companion = address_book_listKt.DataKt.Dsl.INSTANCE;
        User.address_book_list.Data.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        address_book_listKt.DataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.address_book_list.Data.Data_list copy(User.address_book_list.Data.Data_list $this$copy, Function1<? super address_book_listKt.DataKt.Data_listKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        address_book_listKt.DataKt.Data_listKt.Dsl.Companion companion = address_book_listKt.DataKt.Data_listKt.Dsl.INSTANCE;
        User.address_book_list.Data.Data_list.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        address_book_listKt.DataKt.Data_listKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final User.Status getStatusOrNull(User.address_book_listOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }
}
