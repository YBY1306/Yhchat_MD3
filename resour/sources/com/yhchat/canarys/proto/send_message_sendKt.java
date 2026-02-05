package com.yhchat.canarys.proto;

import com.caverock.androidsvg.SVGParser;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.send_message_send;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: send_message_sendKt.kt */
@Metadata(m168d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000bJ*\u0010\f\u001a\u00020\r2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0013"}, m169d2 = {"Lcom/yhchat/canarys/proto/send_message_sendKt;", "", "<init>", "()V", "content", "Lcom/yhchat/canarys/proto/send_message_send$Content;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/send_message_sendKt$ContentKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializecontent", SVGParser.XML_STYLESHEET_ATTR_MEDIA, "Lcom/yhchat/canarys/proto/send_message_send$Media;", "Lcom/yhchat/canarys/proto/send_message_sendKt$MediaKt$Dsl;", "-initializemedia", "Dsl", "ContentKt", "MediaKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class send_message_sendKt {
    public static final int $stable = 0;
    public static final send_message_sendKt INSTANCE = new send_message_sendKt();

    /* compiled from: send_message_sendKt.kt */
    @Metadata(m168d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001?B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\"\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020$J\u0006\u0010+\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00103\u001a\u00020\u0010J\u0006\u0010:\u001a\u00020\u0010J\u0006\u0010;\u001a\u00020$R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u001c8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010%\u001a\u0004\u0018\u00010\u001c*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b&\u0010'R$\u0010(\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR$\u0010,\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00158G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR$\u00100\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR$\u00105\u001a\u0002042\u0006\u0010\b\u001a\u0002048G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0017\u0010<\u001a\u0004\u0018\u000104*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b=\u0010>\u00a8\u0006@"}, m169d2 = {"Lcom/yhchat/canarys/proto/send_message_sendKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/send_message_send$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/send_message_send$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/send_message_send;", "value", "", "msgId", "getMsgId", "()Ljava/lang/String;", "setMsgId", "(Ljava/lang/String;)V", "clearMsgId", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "setChatId", "clearChatId", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()J", "setChatType", "(J)V", "clearChatType", "Lcom/yhchat/canarys/proto/send_message_send$Content;", "content", "getContent", "()Lcom/yhchat/canarys/proto/send_message_send$Content;", "setContent", "(Lcom/yhchat/canarys/proto/send_message_send$Content;)V", "clearContent", "hasContent", "", "contentOrNull", "getContentOrNull", "(Lcom/yhchat/canarys/proto/send_message_sendKt$Dsl;)Lcom/yhchat/canarys/proto/send_message_send$Content;", "contentType", "getContentType", "setContentType", "clearContentType", "commandId", "getCommandId", "setCommandId", "clearCommandId", "quoteMsgId", "getQuoteMsgId", "setQuoteMsgId", "clearQuoteMsgId", "Lcom/yhchat/canarys/proto/send_message_send$Media;", SVGParser.XML_STYLESHEET_ATTR_MEDIA, "getMedia", "()Lcom/yhchat/canarys/proto/send_message_send$Media;", "setMedia", "(Lcom/yhchat/canarys/proto/send_message_send$Media;)V", "clearMedia", "hasMedia", "mediaOrNull", "getMediaOrNull", "(Lcom/yhchat/canarys/proto/send_message_sendKt$Dsl;)Lcom/yhchat/canarys/proto/send_message_send$Media;", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final send_message_send.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(send_message_send.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(send_message_send.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: send_message_sendKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/send_message_sendKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/send_message_sendKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/send_message_send$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(send_message_send.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ send_message_send _build() {
            send_message_send send_message_sendVarBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(send_message_sendVarBuild, "build(...)");
            return send_message_sendVarBuild;
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

        public final long getChatType() {
            return this._builder.getChatType();
        }

        public final void setChatType(long value) {
            this._builder.setChatType(value);
        }

        public final void clearChatType() {
            this._builder.clearChatType();
        }

        public final send_message_send.Content getContent() {
            send_message_send.Content content = this._builder.getContent();
            Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
            return content;
        }

        public final void setContent(send_message_send.Content value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setContent(value);
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final boolean hasContent() {
            return this._builder.hasContent();
        }

        public final send_message_send.Content getContentOrNull(Dsl $this$contentOrNull) {
            Intrinsics.checkNotNullParameter($this$contentOrNull, "<this>");
            return Send_message_sendKtKt.getContentOrNull($this$contentOrNull._builder);
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

        public final long getCommandId() {
            return this._builder.getCommandId();
        }

        public final void setCommandId(long value) {
            this._builder.setCommandId(value);
        }

        public final void clearCommandId() {
            this._builder.clearCommandId();
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

        public final send_message_send.Media getMedia() {
            send_message_send.Media media = this._builder.getMedia();
            Intrinsics.checkNotNullExpressionValue(media, "getMedia(...)");
            return media;
        }

        public final void setMedia(send_message_send.Media value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setMedia(value);
        }

        public final void clearMedia() {
            this._builder.clearMedia();
        }

        public final boolean hasMedia() {
            return this._builder.hasMedia();
        }

        public final send_message_send.Media getMediaOrNull(Dsl $this$mediaOrNull) {
            Intrinsics.checkNotNullParameter($this$mediaOrNull, "<this>");
            return Send_message_sendKtKt.getMediaOrNull($this$mediaOrNull._builder);
        }
    }

    private send_message_sendKt() {
    }

    /* renamed from: -initializecontent, reason: not valid java name */
    public final send_message_send.Content m10116initializecontent(Function1<? super ContentKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ContentKt.Dsl.Companion companion = ContentKt.Dsl.INSTANCE;
        send_message_send.Content.Builder builderNewBuilder = send_message_send.Content.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        ContentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: send_message_sendKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/send_message_sendKt$ContentKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class ContentKt {
        public static final int $stable = 0;
        public static final ContentKt INSTANCE = new ContentKt();

        /* compiled from: send_message_sendKt.kt */
        @Metadata(m168d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0010\t\n\u0002\b)\b\u0007\u0018\u0000 \u0080\u00012\u00020\u0001:\u0004\u0080\u0001\u0081\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J%\u0010\"\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\b#J&\u0010$\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010\b\u001a\u00020\tH\u0087\n\u00a2\u0006\u0002\b%J+\u0010&\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0(H\u0007\u00a2\u0006\u0002\b)J,\u0010$\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0(H\u0087\n\u00a2\u0006\u0002\b*J.\u0010+\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010,\u001a\u00020-2\u0006\u0010\b\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0002\b.J\u001d\u0010/\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001eH\u0007\u00a2\u0006\u0002\b0J\u0006\u00104\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020\u0010J\u0006\u0010D\u001a\u00020\u0010J\u0006\u0010H\u001a\u00020\u0010J\u0006\u0010L\u001a\u00020\u0010J\u0006\u0010P\u001a\u00020\u0010J\u0006\u0010T\u001a\u00020\u0010J\u0006\u0010X\u001a\u00020\u0010J\u0006\u0010_\u001a\u00020\u0010J\u0006\u0010c\u001a\u00020\u0010J\u0006\u0010g\u001a\u00020\u0010J\u0006\u0010k\u001a\u00020\u0010J\u0006\u0010o\u001a\u00020\u0010J\u0006\u0010s\u001a\u00020\u0010J\u0006\u0010w\u001a\u00020\u0010J\u0006\u0010{\u001a\u00020\u0010J\u0006\u0010\u007f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR\u001d\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001f0\u001e8F\u00a2\u0006\u0006\u001a\u0004\b \u0010!R$\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR$\u00105\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR$\u00109\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR$\u0010=\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR$\u0010A\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR$\u0010E\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR$\u0010I\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010\f\"\u0004\bK\u0010\u000eR$\u0010M\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bN\u0010\f\"\u0004\bO\u0010\u000eR$\u0010Q\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000eR$\u0010U\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bV\u0010\f\"\u0004\bW\u0010\u000eR$\u0010Z\u001a\u00020Y2\u0006\u0010\b\u001a\u00020Y8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010`\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010\f\"\u0004\bb\u0010\u000eR$\u0010d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\be\u0010\f\"\u0004\bf\u0010\u000eR$\u0010h\u001a\u00020Y2\u0006\u0010\b\u001a\u00020Y8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bi\u0010\\\"\u0004\bj\u0010^R$\u0010l\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bm\u0010\f\"\u0004\bn\u0010\u000eR$\u0010p\u001a\u00020Y2\u0006\u0010\b\u001a\u00020Y8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bq\u0010\\\"\u0004\br\u0010^R$\u0010t\u001a\u00020Y2\u0006\u0010\b\u001a\u00020Y8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bu\u0010\\\"\u0004\bv\u0010^R$\u0010x\u001a\u00020Y2\u0006\u0010\b\u001a\u00020Y8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\by\u0010\\\"\u0004\bz\u0010^R$\u0010|\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b}\u0010\f\"\u0004\b~\u0010\u000e\u00a8\u0006\u0082\u0001"}, m169d2 = {"Lcom/yhchat/canarys/proto/send_message_sendKt$ContentKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/send_message_send$Content$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/send_message_send$Content$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/send_message_send$Content;", "value", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "clearText", "", "buttons", "getButtons", "setButtons", "clearButtons", "fileName", "getFileName", "setFileName", "clearFileName", "file", "getFile", "setFile", "clearFile", "mentionedId", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/send_message_sendKt$ContentKt$Dsl$MentionedIdProxy;", "getMentionedId", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addMentionedId", "plusAssign", "plusAssignMentionedId", "addAll", "values", "", "addAllMentionedId", "plusAssignAllMentionedId", "set", "index", "", "setMentionedId", "clear", "clearMentionedId", "form", "getForm", "setForm", "clearForm", "quoteMsgText", "getQuoteMsgText", "setQuoteMsgText", "clearQuoteMsgText", "image", "getImage", "setImage", "clearImage", "postId", "getPostId", "setPostId", "clearPostId", "postTitle", "getPostTitle", "setPostTitle", "clearPostTitle", "postContent", "getPostContent", "setPostContent", "clearPostContent", "postType", "getPostType", "setPostType", "clearPostType", "expressionId", "getExpressionId", "setExpressionId", "clearExpressionId", "quoteImageUrl", "getQuoteImageUrl", "setQuoteImageUrl", "clearQuoteImageUrl", "quoteImageName", "getQuoteImageName", "setQuoteImageName", "clearQuoteImageName", "", "fileSize", "getFileSize", "()J", "setFileSize", "(J)V", "clearFileSize", "video", "getVideo", "setVideo", "clearVideo", "audio", "getAudio", "setAudio", "clearAudio", "audioTime", "getAudioTime", "setAudioTime", "clearAudioTime", "quoteVideoUrl", "getQuoteVideoUrl", "setQuoteVideoUrl", "clearQuoteVideoUrl", "quoteVideoTime", "getQuoteVideoTime", "setQuoteVideoTime", "clearQuoteVideoTime", "stickerItemId", "getStickerItemId", "setStickerItemId", "clearStickerItemId", "stickerPackId", "getStickerPackId", "setStickerPackId", "clearStickerPackId", "roomName", "getRoomName", "setRoomName", "clearRoomName", "Companion", "MentionedIdProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final send_message_send.Content.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(send_message_send.Content.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(send_message_send.Content.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: send_message_sendKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/send_message_sendKt$ContentKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/send_message_sendKt$ContentKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/send_message_send$Content$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(send_message_send.Content.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ send_message_send.Content _build() {
                send_message_send.Content contentBuild = this._builder.build();
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

            public final String getFileName() {
                String fileName = this._builder.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "getFileName(...)");
                return fileName;
            }

            public final void setFileName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setFileName(value);
            }

            public final void clearFileName() {
                this._builder.clearFileName();
            }

            public final String getFile() {
                String file = this._builder.getFile();
                Intrinsics.checkNotNullExpressionValue(file, "getFile(...)");
                return file;
            }

            public final void setFile(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setFile(value);
            }

            public final void clearFile() {
                this._builder.clearFile();
            }

            /* compiled from: send_message_sendKt.kt */
            @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/send_message_sendKt$ContentKt$Dsl$MentionedIdProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class MentionedIdProxy extends DslProxy {
                public static final int $stable = 8;

                private MentionedIdProxy() {
                }
            }

            public final DslList<String, MentionedIdProxy> getMentionedId() {
                List<String> mentionedIdList = this._builder.getMentionedIdList();
                Intrinsics.checkNotNullExpressionValue(mentionedIdList, "getMentionedIdList(...)");
                return new DslList<>(mentionedIdList);
            }

            public final /* synthetic */ void addMentionedId(DslList $this$add, String value) {
                Intrinsics.checkNotNullParameter($this$add, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addMentionedId(value);
            }

            public final /* synthetic */ void plusAssignMentionedId(DslList<String, MentionedIdProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addMentionedId(dslList, value);
            }

            public final /* synthetic */ void addAllMentionedId(DslList $this$addAll, Iterable values) {
                Intrinsics.checkNotNullParameter($this$addAll, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllMentionedId(values);
            }

            public final /* synthetic */ void plusAssignAllMentionedId(DslList<String, MentionedIdProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllMentionedId(dslList, values);
            }

            public final /* synthetic */ void setMentionedId(DslList $this$set, int index, String value) {
                Intrinsics.checkNotNullParameter($this$set, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setMentionedId(index, value);
            }

            public final /* synthetic */ void clearMentionedId(DslList $this$clear) {
                Intrinsics.checkNotNullParameter($this$clear, "<this>");
                this._builder.clearMentionedId();
            }

            public final String getForm() {
                String form = this._builder.getForm();
                Intrinsics.checkNotNullExpressionValue(form, "getForm(...)");
                return form;
            }

            public final void setForm(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setForm(value);
            }

            public final void clearForm() {
                this._builder.clearForm();
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

            public final String getImage() {
                String image = this._builder.getImage();
                Intrinsics.checkNotNullExpressionValue(image, "getImage(...)");
                return image;
            }

            public final void setImage(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setImage(value);
            }

            public final void clearImage() {
                this._builder.clearImage();
            }

            public final String getPostId() {
                String postId = this._builder.getPostId();
                Intrinsics.checkNotNullExpressionValue(postId, "getPostId(...)");
                return postId;
            }

            public final void setPostId(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPostId(value);
            }

            public final void clearPostId() {
                this._builder.clearPostId();
            }

            public final String getPostTitle() {
                String postTitle = this._builder.getPostTitle();
                Intrinsics.checkNotNullExpressionValue(postTitle, "getPostTitle(...)");
                return postTitle;
            }

            public final void setPostTitle(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPostTitle(value);
            }

            public final void clearPostTitle() {
                this._builder.clearPostTitle();
            }

            public final String getPostContent() {
                String postContent = this._builder.getPostContent();
                Intrinsics.checkNotNullExpressionValue(postContent, "getPostContent(...)");
                return postContent;
            }

            public final void setPostContent(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPostContent(value);
            }

            public final void clearPostContent() {
                this._builder.clearPostContent();
            }

            public final String getPostType() {
                String postType = this._builder.getPostType();
                Intrinsics.checkNotNullExpressionValue(postType, "getPostType(...)");
                return postType;
            }

            public final void setPostType(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPostType(value);
            }

            public final void clearPostType() {
                this._builder.clearPostType();
            }

            public final String getExpressionId() {
                String expressionId = this._builder.getExpressionId();
                Intrinsics.checkNotNullExpressionValue(expressionId, "getExpressionId(...)");
                return expressionId;
            }

            public final void setExpressionId(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setExpressionId(value);
            }

            public final void clearExpressionId() {
                this._builder.clearExpressionId();
            }

            public final String getQuoteImageUrl() {
                String quoteImageUrl = this._builder.getQuoteImageUrl();
                Intrinsics.checkNotNullExpressionValue(quoteImageUrl, "getQuoteImageUrl(...)");
                return quoteImageUrl;
            }

            public final void setQuoteImageUrl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setQuoteImageUrl(value);
            }

            public final void clearQuoteImageUrl() {
                this._builder.clearQuoteImageUrl();
            }

            public final String getQuoteImageName() {
                String quoteImageName = this._builder.getQuoteImageName();
                Intrinsics.checkNotNullExpressionValue(quoteImageName, "getQuoteImageName(...)");
                return quoteImageName;
            }

            public final void setQuoteImageName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setQuoteImageName(value);
            }

            public final void clearQuoteImageName() {
                this._builder.clearQuoteImageName();
            }

            public final long getFileSize() {
                return this._builder.getFileSize();
            }

            public final void setFileSize(long value) {
                this._builder.setFileSize(value);
            }

            public final void clearFileSize() {
                this._builder.clearFileSize();
            }

            public final String getVideo() {
                String video = this._builder.getVideo();
                Intrinsics.checkNotNullExpressionValue(video, "getVideo(...)");
                return video;
            }

            public final void setVideo(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setVideo(value);
            }

            public final void clearVideo() {
                this._builder.clearVideo();
            }

            public final String getAudio() {
                String audio = this._builder.getAudio();
                Intrinsics.checkNotNullExpressionValue(audio, "getAudio(...)");
                return audio;
            }

            public final void setAudio(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAudio(value);
            }

            public final void clearAudio() {
                this._builder.clearAudio();
            }

            public final long getAudioTime() {
                return this._builder.getAudioTime();
            }

            public final void setAudioTime(long value) {
                this._builder.setAudioTime(value);
            }

            public final void clearAudioTime() {
                this._builder.clearAudioTime();
            }

            public final String getQuoteVideoUrl() {
                String quoteVideoUrl = this._builder.getQuoteVideoUrl();
                Intrinsics.checkNotNullExpressionValue(quoteVideoUrl, "getQuoteVideoUrl(...)");
                return quoteVideoUrl;
            }

            public final void setQuoteVideoUrl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setQuoteVideoUrl(value);
            }

            public final void clearQuoteVideoUrl() {
                this._builder.clearQuoteVideoUrl();
            }

            public final long getQuoteVideoTime() {
                return this._builder.getQuoteVideoTime();
            }

            public final void setQuoteVideoTime(long value) {
                this._builder.setQuoteVideoTime(value);
            }

            public final void clearQuoteVideoTime() {
                this._builder.clearQuoteVideoTime();
            }

            public final long getStickerItemId() {
                return this._builder.getStickerItemId();
            }

            public final void setStickerItemId(long value) {
                this._builder.setStickerItemId(value);
            }

            public final void clearStickerItemId() {
                this._builder.clearStickerItemId();
            }

            public final long getStickerPackId() {
                return this._builder.getStickerPackId();
            }

            public final void setStickerPackId(long value) {
                this._builder.setStickerPackId(value);
            }

            public final void clearStickerPackId() {
                this._builder.clearStickerPackId();
            }

            public final String getRoomName() {
                String roomName = this._builder.getRoomName();
                Intrinsics.checkNotNullExpressionValue(roomName, "getRoomName(...)");
                return roomName;
            }

            public final void setRoomName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setRoomName(value);
            }

            public final void clearRoomName() {
                this._builder.clearRoomName();
            }
        }

        private ContentKt() {
        }
    }

    /* renamed from: -initializemedia, reason: not valid java name */
    public final send_message_send.Media m10117initializemedia(Function1<? super MediaKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        MediaKt.Dsl.Companion companion = MediaKt.Dsl.INSTANCE;
        send_message_send.Media.Builder builderNewBuilder = send_message_send.Media.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        MediaKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: send_message_sendKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/send_message_sendKt$MediaKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class MediaKt {
        public static final int $stable = 0;
        public static final MediaKt INSTANCE = new MediaKt();

        /* compiled from: send_message_sendKt.kt */
        @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0018\b\u0007\u0018\u0000 02\u00020\u0001:\u00010B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J\u0006\u0010#\u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR$\u0010 \u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR$\u0010$\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u00198G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b%\u0010\u001c\"\u0004\b&\u0010\u001eR$\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR$\u0010,\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010\f\"\u0004\b.\u0010\u000e\u00a8\u00061"}, m169d2 = {"Lcom/yhchat/canarys/proto/send_message_sendKt$MediaKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/send_message_send$Media$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/send_message_send$Media$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/send_message_send$Media;", "value", "", "fileKey", "getFileKey", "()Ljava/lang/String;", "setFileKey", "(Ljava/lang/String;)V", "clearFileKey", "", "fileHash", "getFileHash", "setFileHash", "clearFileHash", "fileType", "getFileType", "setFileType", "clearFileType", "", "imageHeight", "getImageHeight", "()J", "setImageHeight", "(J)V", "clearImageHeight", "imageWidth", "getImageWidth", "setImageWidth", "clearImageWidth", "fileSize", "getFileSize", "setFileSize", "clearFileSize", "fileKey2", "getFileKey2", "setFileKey2", "clearFileKey2", "fileSuffix", "getFileSuffix", "setFileSuffix", "clearFileSuffix", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final send_message_send.Media.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(send_message_send.Media.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(send_message_send.Media.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: send_message_sendKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/send_message_sendKt$MediaKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/send_message_sendKt$MediaKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/send_message_send$Media$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(send_message_send.Media.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ send_message_send.Media _build() {
                send_message_send.Media mediaBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(mediaBuild, "build(...)");
                return mediaBuild;
            }

            public final String getFileKey() {
                String fileKey = this._builder.getFileKey();
                Intrinsics.checkNotNullExpressionValue(fileKey, "getFileKey(...)");
                return fileKey;
            }

            public final void setFileKey(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setFileKey(value);
            }

            public final void clearFileKey() {
                this._builder.clearFileKey();
            }

            public final String getFileHash() {
                String fileHash = this._builder.getFileHash();
                Intrinsics.checkNotNullExpressionValue(fileHash, "getFileHash(...)");
                return fileHash;
            }

            public final void setFileHash(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setFileHash(value);
            }

            public final void clearFileHash() {
                this._builder.clearFileHash();
            }

            public final String getFileType() {
                String fileType = this._builder.getFileType();
                Intrinsics.checkNotNullExpressionValue(fileType, "getFileType(...)");
                return fileType;
            }

            public final void setFileType(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setFileType(value);
            }

            public final void clearFileType() {
                this._builder.clearFileType();
            }

            public final long getImageHeight() {
                return this._builder.getImageHeight();
            }

            public final void setImageHeight(long value) {
                this._builder.setImageHeight(value);
            }

            public final void clearImageHeight() {
                this._builder.clearImageHeight();
            }

            public final long getImageWidth() {
                return this._builder.getImageWidth();
            }

            public final void setImageWidth(long value) {
                this._builder.setImageWidth(value);
            }

            public final void clearImageWidth() {
                this._builder.clearImageWidth();
            }

            public final long getFileSize() {
                return this._builder.getFileSize();
            }

            public final void setFileSize(long value) {
                this._builder.setFileSize(value);
            }

            public final void clearFileSize() {
                this._builder.clearFileSize();
            }

            public final String getFileKey2() {
                String fileKey2 = this._builder.getFileKey2();
                Intrinsics.checkNotNullExpressionValue(fileKey2, "getFileKey2(...)");
                return fileKey2;
            }

            public final void setFileKey2(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setFileKey2(value);
            }

            public final void clearFileKey2() {
                this._builder.clearFileKey2();
            }

            public final String getFileSuffix() {
                String fileSuffix = this._builder.getFileSuffix();
                Intrinsics.checkNotNullExpressionValue(fileSuffix, "getFileSuffix(...)");
                return fileSuffix;
            }

            public final void setFileSuffix(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setFileSuffix(value);
            }

            public final void clearFileSuffix() {
                this._builder.clearFileSuffix();
            }
        }

        private MediaKt() {
        }
    }
}
