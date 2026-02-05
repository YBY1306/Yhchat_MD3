package com.yhchat.canarys.proto.conversation;

import com.yhchat.canarys.proto.conversation.Conversation;
import com.yhchat.canarys.proto.conversation.ConversationListKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationListKt.kt */
@Metadata(m168d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0016"}, m169d2 = {"conversationList", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/conversation/ConversationListKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializeconversationList", "copy", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData;", "Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$Dsl;", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData;", "Lcom/yhchat/canarys/proto/conversation/ConversationListKt$ConversationDataKt$AtDataKt$Dsl;", "atDataOrNull", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationDataOrBuilder;", "getAtDataOrNull", "(Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationDataOrBuilder;)Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationList$ConversationData$AtData;", "statusOrNull", "Lcom/yhchat/canarys/proto/conversation/Conversation$Status;", "Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationListOrBuilder;", "getStatusOrNull", "(Lcom/yhchat/canarys/proto/conversation/Conversation$ConversationListOrBuilder;)Lcom/yhchat/canarys/proto/conversation/Conversation$Status;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes12.dex */
public final class ConversationListKtKt {
    /* renamed from: -initializeconversationList */
    public static final Conversation.ConversationList m9377initializeconversationList(Function1<? super ConversationListKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ConversationListKt.Dsl.Companion companion = ConversationListKt.Dsl.INSTANCE;
        Conversation.ConversationList.Builder builderNewBuilder = Conversation.ConversationList.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        ConversationListKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Conversation.ConversationList copy(Conversation.ConversationList $this$copy, Function1<? super ConversationListKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ConversationListKt.Dsl.Companion companion = ConversationListKt.Dsl.INSTANCE;
        Conversation.ConversationList.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        ConversationListKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Conversation.ConversationList.ConversationData copy(Conversation.ConversationList.ConversationData $this$copy, Function1<? super ConversationListKt.ConversationDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ConversationListKt.ConversationDataKt.Dsl.Companion companion = ConversationListKt.ConversationDataKt.Dsl.INSTANCE;
        Conversation.ConversationList.ConversationData.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        ConversationListKt.ConversationDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Conversation.ConversationList.ConversationData.AtData copy(Conversation.ConversationList.ConversationData.AtData $this$copy, Function1<? super ConversationListKt.ConversationDataKt.AtDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        ConversationListKt.ConversationDataKt.AtDataKt.Dsl.Companion companion = ConversationListKt.ConversationDataKt.AtDataKt.Dsl.INSTANCE;
        Conversation.ConversationList.ConversationData.AtData.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        ConversationListKt.ConversationDataKt.AtDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Conversation.ConversationList.ConversationData.AtData getAtDataOrNull(Conversation.ConversationList.ConversationDataOrBuilder $this$atDataOrNull) {
        Intrinsics.checkNotNullParameter($this$atDataOrNull, "<this>");
        if ($this$atDataOrNull.hasAtData()) {
            return $this$atDataOrNull.getAtData();
        }
        return null;
    }

    public static final Conversation.Status getStatusOrNull(Conversation.ConversationListOrBuilder $this$statusOrNull) {
        Intrinsics.checkNotNullParameter($this$statusOrNull, "<this>");
        if ($this$statusOrNull.hasStatus()) {
            return $this$statusOrNull.getStatus();
        }
        return null;
    }
}
