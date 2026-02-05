package com.yhchat.canarys.proto;

import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.edit_message_send;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: edit_message_sendKt.kt */
@Metadata(m168d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000b\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u000e"}, m169d2 = {"Lcom/yhchat/canarys/proto/edit_message_sendKt;", "", "<init>", "()V", "content", "Lcom/yhchat/canarys/proto/edit_message_send$Content;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/edit_message_sendKt$ContentKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializecontent", "Dsl", "ContentKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class edit_message_sendKt {
    public static final int $stable = 0;
    public static final edit_message_sendKt INSTANCE = new edit_message_sendKt();

    /* compiled from: edit_message_sendKt.kt */
    @Metadata(m168d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020$J\u0006\u0010.\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001c8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010%\u001a\u0004\u0018\u00010\u001c*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b&\u0010'R$\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010/\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000e\u00a8\u00064"}, m169d2 = {"Lcom/yhchat/canarys/proto/edit_message_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/edit_message_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/edit_message_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/edit_message_send;", "value", "", "msgId", "getMsgId", "()Ljava/lang/String;", "setMsgId", "(Ljava/lang/String;)V", "clearMsgId", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "setChatId", "clearChatId", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()I", "setChatType", "(I)V", "clearChatType", "Lcom/yhchat/canarys/proto/edit_message_send$Content;", "content", "getContent", "()Lcom/yhchat/canarys/proto/edit_message_send$Content;", "setContent", "(Lcom/yhchat/canarys/proto/edit_message_send$Content;)V", "clearContent", "hasContent", "", "contentOrNull", "getContentOrNull", "(Lcom/yhchat/canarys/proto/edit_message_sendKt$Dsl;)Lcom/yhchat/canarys/proto/edit_message_send$Content;", "", "contentType", "getContentType", "()J", "setContentType", "(J)V", "clearContentType", "quoteMsgId", "getQuoteMsgId", "setQuoteMsgId", "clearQuoteMsgId", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final edit_message_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(edit_message_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(edit_message_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: edit_message_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/edit_message_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/edit_message_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/edit_message_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(edit_message_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ edit_message_send _build() {
            edit_message_send edit_message_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(edit_message_sendVarBuild, "build(...)");
            return edit_message_sendVarBuild;
        }

        public final String getMsgId() {
            String msgId = this._builder.getMsgId();
            Intrinsics.checkNotNullExpressionValue(msgId, "getMsgId(...)");
            return msgId;
        }

        public final void setMsgId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMsgId(value);
        }

        public final void clearMsgId() {
            this._builder.clearMsgId();
        }

        public final String getChatId() {
            String chatId = this._builder.getChatId();
            Intrinsics.checkNotNullExpressionValue(chatId, "getChatId(...)");
            return chatId;
        }

        public final void setChatId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setChatId(value);
        }

        public final void clearChatId() {
            this._builder.clearChatId();
        }

        public final int getChatType() {
            return this._builder.getChatType();
        }

        public final void setChatType(int value) {
            this._builder.setChatType(value);
        }

        public final void clearChatType() {
            this._builder.clearChatType();
        }

        public final edit_message_send.Content getContent() {
            edit_message_send.Content content = this._builder.getContent();
            Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
            return content;
        }

        public final void setContent(edit_message_send.Content value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setContent(value);
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final boolean hasContent() {
            return this._builder.hasContent();
        }

        public final edit_message_send.Content getContentOrNull(Dsl $this$contentOrNull) {
            Intrinsics.checkNotNullParameter($this$contentOrNull, "<this>");
            return Edit_message_sendKtKt.getContentOrNull($this$contentOrNull._builder);
        }

        public final long getContentType() {
            return this._builder.getContentType();
        }

        public final void setContentType(long value) {
            this._builder.setContentType(value);
        }

        public final void clearContentType() {
            this._builder.clearContentType();
        }

        public final String getQuoteMsgId() {
            String quoteMsgId = this._builder.getQuoteMsgId();
            Intrinsics.checkNotNullExpressionValue(quoteMsgId, "getQuoteMsgId(...)");
            return quoteMsgId;
        }

        public final void setQuoteMsgId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setQuoteMsgId(value);
        }

        public final void clearQuoteMsgId() {
            this._builder.clearQuoteMsgId();
        }
    }

    private edit_message_sendKt() {
    }

    /* renamed from: -initializecontent, reason: not valid java name */
    public final edit_message_send.Content m9410initializecontent(Function1<? super ContentKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ContentKt.Dsl.Companion companion = ContentKt.Dsl.INSTANCE;
        edit_message_send.Content.Builder builderNewBuilder = edit_message_send.Content.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        ContentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: edit_message_sendKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/edit_message_sendKt$ContentKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class ContentKt {
        public static final int $stable = 0;
        public static final ContentKt INSTANCE = new ContentKt();

        /* compiled from: edit_message_sendKt.kt */
        @Metadata(m168d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000e\u00a8\u0006\u001a"}, m169d2 = {"Lcom/yhchat/canarys/proto/edit_message_sendKt$ContentKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/edit_message_send$Content$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/edit_message_send$Content$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/edit_message_send$Content;", "value", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "clearText", "", "buttons", "getButtons", "setButtons", "clearButtons", "quoteMsgText", "getQuoteMsgText", "setQuoteMsgText", "clearQuoteMsgText", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final edit_message_send.Content.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(edit_message_send.Content.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(edit_message_send.Content.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: edit_message_sendKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/edit_message_sendKt$ContentKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/edit_message_sendKt$ContentKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/edit_message_send$Content$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(edit_message_send.Content.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ edit_message_send.Content _build() {
                edit_message_send.Content contentBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(contentBuild, "build(...)");
                return contentBuild;
            }

            public final String getText() {
                String text = this._builder.getText();
                Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
                return text;
            }

            public final void setText(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setText(value);
            }

            public final void clearText() {
                this._builder.clearText();
            }

            public final String getButtons() {
                String buttons = this._builder.getButtons();
                Intrinsics.checkNotNullExpressionValue(buttons, "getButtons(...)");
                return buttons;
            }

            public final void setButtons(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setButtons(value);
            }

            public final void clearButtons() {
                this._builder.clearButtons();
            }

            public final String getQuoteMsgText() {
                String quoteMsgText = this._builder.getQuoteMsgText();
                Intrinsics.checkNotNullExpressionValue(quoteMsgText, "getQuoteMsgText(...)");
                return quoteMsgText;
            }

            public final void setQuoteMsgText(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setQuoteMsgText(value);
            }

            public final void clearQuoteMsgText() {
                this._builder.clearQuoteMsgText();
            }
        }

        private ContentKt() {
        }
    }
}
