package com.yhchat.canarys.proto.chat_ws_go;

import com.yhchat.canarys.proto.chat_ws_go.draft_input;
import com.yhchat.canarys.proto.chat_ws_go.draft_inputKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: draft_inputKt.kt */
@Metadata(m168d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0007\u001a)\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\t*\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\u001a)\u0010\b\u001a\u00020\u000b*\u00020\u000b2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0003\u00a2\u0006\u0002\b\u0006H\u0086\b\u00f8\u0001\u0000\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000b*\u00020\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u0017\u0010\u0016\u001a\u0004\u0018\u00010\t*\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0019"}, m169d2 = {"draftInput", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializedraftInput", "copy", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData;", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$Dsl;", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft;", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputKt$DraftDataKt$DraftKt$Dsl;", "draftOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftDataOrBuilder;", "getDraftOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftDataOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData$Draft;", "infoOrNull", "Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputOrBuilder;", "getInfoOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/INFO;", "dataOrNull", "getDataOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/draft_inputOrBuilder;)Lcom/yhchat/canarys/proto/chat_ws_go/draft_input$DraftData;", "app_debug"}, m170k = 2, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class Draft_inputKtKt {
    /* renamed from: -initializedraftInput */
    public static final draft_input m8990initializedraftInput(Function1<? super draft_inputKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        draft_inputKt.Dsl.Companion companion = draft_inputKt.Dsl.INSTANCE;
        draft_input.Builder builderNewBuilder = draft_input.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        draft_inputKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final draft_input copy(draft_input $this$copy, Function1<? super draft_inputKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        draft_inputKt.Dsl.Companion companion = draft_inputKt.Dsl.INSTANCE;
        draft_input.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        draft_inputKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final draft_input.DraftData copy(draft_input.DraftData $this$copy, Function1<? super draft_inputKt.DraftDataKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        draft_inputKt.DraftDataKt.Dsl.Companion companion = draft_inputKt.DraftDataKt.Dsl.INSTANCE;
        draft_input.DraftData.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        draft_inputKt.DraftDataKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final draft_input.DraftData.Draft copy(draft_input.DraftData.Draft $this$copy, Function1<? super draft_inputKt.DraftDataKt.DraftKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter($this$copy, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        draft_inputKt.DraftDataKt.DraftKt.Dsl.Companion companion = draft_inputKt.DraftDataKt.DraftKt.Dsl.INSTANCE;
        draft_input.DraftData.Draft.Builder builder = $this$copy.toBuilder();
        Intrinsics.checkNotNullExpressionValue(builder, "toBuilder(...)");
        draft_inputKt.DraftDataKt.DraftKt.Dsl dsl_create = companion._create(builder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final draft_input.DraftData.Draft getDraftOrNull(draft_input.DraftDataOrBuilder $this$draftOrNull) {
        Intrinsics.checkNotNullParameter($this$draftOrNull, "<this>");
        if ($this$draftOrNull.hasDraft()) {
            return $this$draftOrNull.getDraft();
        }
        return null;
    }

    public static final INFO getInfoOrNull(draft_inputOrBuilder $this$infoOrNull) {
        Intrinsics.checkNotNullParameter($this$infoOrNull, "<this>");
        if ($this$infoOrNull.hasInfo()) {
            return $this$infoOrNull.getInfo();
        }
        return null;
    }

    public static final draft_input.DraftData getDataOrNull(draft_inputOrBuilder $this$dataOrNull) {
        Intrinsics.checkNotNullParameter($this$dataOrNull, "<this>");
        if ($this$dataOrNull.hasData()) {
            return $this$dataOrNull.getData();
        }
        return null;
    }
}
