package com.yhchat.canarys.proto.chat_ws_go;

import androidx.autofill.HintConstants;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.chat_ws_go.WsMsg;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.simpleframework.xml.strategy.Name;

/* compiled from: WsMsgKt.kt */
@Metadata(m168d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000bJ*\u0010\f\u001a\u00020\r2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000fJ*\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt;", "", "<init>", "()V", "wsCmd", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsCmdKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializewsCmd", "wsSender", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsSenderKt$Dsl;", "-initializewsSender", "wsContent", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsContentKt$Dsl;", "-initializewsContent", "Dsl", "WsCmdKt", "WsSenderKt", "WsContentKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes10.dex */
public final class WsMsgKt {
    public static final int $stable = 0;
    public static final WsMsgKt INSTANCE = new WsMsgKt();

    /* compiled from: WsMsgKt.kt */
    @Metadata(m168d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010+\u001a\u00020\u0010J\u0006\u00102\u001a\u00020\u0010J\u0006\u00103\u001a\u00020\u0019J\u0006\u0010:\u001a\u00020\u0010J\u0006\u0010A\u001a\u00020\u0010J\u0006\u0010H\u001a\u00020\u0010J\u0006\u0010I\u001a\u00020\u0019J\u0006\u0010P\u001a\u00020\u0010J\u0006\u0010T\u001a\u00020\u0010J\u0006\u0010X\u001a\u00020\u0010J\u0006\u0010\\\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0011*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR$\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR$\u0010&\u001a\u00020%2\u0006\u0010\b\u001a\u00020%8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020,8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0017\u00104\u001a\u0004\u0018\u00010,*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b5\u00106R$\u00107\u001a\u00020%2\u0006\u0010\b\u001a\u00020%8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b8\u0010(\"\u0004\b9\u0010*R$\u0010<\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010C\u001a\u00020B2\u0006\u0010\b\u001a\u00020B8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0017\u0010J\u001a\u0004\u0018\u00010B*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\bK\u0010LR$\u0010M\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bN\u0010>\"\u0004\bO\u0010@R$\u0010Q\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bR\u0010\f\"\u0004\bS\u0010\u000eR$\u0010U\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bV\u0010>\"\u0004\bW\u0010@R$\u0010Y\u001a\u00020;2\u0006\u0010\b\u001a\u00020;8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bZ\u0010>\"\u0004\b[\u0010@\u00a8\u0006^"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg;", "value", "", "msgId", "getMsgId", "()Ljava/lang/String;", "setMsgId", "(Ljava/lang/String;)V", "clearMsgId", "", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender;", "sender", "getSender", "()Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender;", "setSender", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender;)V", "clearSender", "hasSender", "", "senderOrNull", "getSenderOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender;", "recvId", "getRecvId", "setRecvId", "clearRecvId", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "setChatId", "clearChatId", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()I", "setChatType", "(I)V", "clearChatType", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent;", "content", "getContent", "()Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent;", "setContent", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent;)V", "clearContent", "hasContent", "contentOrNull", "getContentOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent;", "contentType", "getContentType", "setContentType", "clearContentType", "", "timestamp", "getTimestamp", "()J", "setTimestamp", "(J)V", "clearTimestamp", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd;", "cmd", "getCmd", "()Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd;", "setCmd", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd;)V", "clearCmd", "hasCmd", "cmdOrNull", "getCmdOrNull", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$Dsl;)Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd;", "deleteTime", "getDeleteTime", "setDeleteTime", "clearDeleteTime", "quoteMsgId", "getQuoteMsgId", "setQuoteMsgId", "clearQuoteMsgId", "msgSeq", "getMsgSeq", "setMsgSeq", "clearMsgSeq", "editTime", "getEditTime", "setEditTime", "clearEditTime", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final WsMsg.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(WsMsg.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(WsMsg.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: WsMsgKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(WsMsg.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ WsMsg _build() {
            WsMsg wsMsgBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(wsMsgBuild, "build(...)");
            return wsMsgBuild;
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

        public final WsMsg.WsSender getSender() {
            WsMsg.WsSender sender = this._builder.getSender();
            Intrinsics.checkNotNullExpressionValue(sender, "getSender(...)");
            return sender;
        }

        public final void setSender(WsMsg.WsSender value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSender(value);
        }

        public final void clearSender() {
            this._builder.clearSender();
        }

        public final boolean hasSender() {
            return this._builder.hasSender();
        }

        public final WsMsg.WsSender getSenderOrNull(Dsl $this$senderOrNull) {
            Intrinsics.checkNotNullParameter($this$senderOrNull, "<this>");
            return WsMsgKtKt.getSenderOrNull($this$senderOrNull._builder);
        }

        public final String getRecvId() {
            String recvId = this._builder.getRecvId();
            Intrinsics.checkNotNullExpressionValue(recvId, "getRecvId(...)");
            return recvId;
        }

        public final void setRecvId(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setRecvId(value);
        }

        public final void clearRecvId() {
            this._builder.clearRecvId();
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

        public final WsMsg.WsContent getContent() {
            WsMsg.WsContent content = this._builder.getContent();
            Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
            return content;
        }

        public final void setContent(WsMsg.WsContent value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setContent(value);
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final boolean hasContent() {
            return this._builder.hasContent();
        }

        public final WsMsg.WsContent getContentOrNull(Dsl $this$contentOrNull) {
            Intrinsics.checkNotNullParameter($this$contentOrNull, "<this>");
            return WsMsgKtKt.getContentOrNull($this$contentOrNull._builder);
        }

        public final int getContentType() {
            return this._builder.getContentType();
        }

        public final void setContentType(int value) {
            this._builder.setContentType(value);
        }

        public final void clearContentType() {
            this._builder.clearContentType();
        }

        public final long getTimestamp() {
            return this._builder.getTimestamp();
        }

        public final void setTimestamp(long value) {
            this._builder.setTimestamp(value);
        }

        public final void clearTimestamp() {
            this._builder.clearTimestamp();
        }

        public final WsMsg.WsCmd getCmd() {
            WsMsg.WsCmd cmd = this._builder.getCmd();
            Intrinsics.checkNotNullExpressionValue(cmd, "getCmd(...)");
            return cmd;
        }

        public final void setCmd(WsMsg.WsCmd value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCmd(value);
        }

        public final void clearCmd() {
            this._builder.clearCmd();
        }

        public final boolean hasCmd() {
            return this._builder.hasCmd();
        }

        public final WsMsg.WsCmd getCmdOrNull(Dsl $this$cmdOrNull) {
            Intrinsics.checkNotNullParameter($this$cmdOrNull, "<this>");
            return WsMsgKtKt.getCmdOrNull($this$cmdOrNull._builder);
        }

        public final long getDeleteTime() {
            return this._builder.getDeleteTime();
        }

        public final void setDeleteTime(long value) {
            this._builder.setDeleteTime(value);
        }

        public final void clearDeleteTime() {
            this._builder.clearDeleteTime();
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

        public final long getMsgSeq() {
            return this._builder.getMsgSeq();
        }

        public final void setMsgSeq(long value) {
            this._builder.setMsgSeq(value);
        }

        public final void clearMsgSeq() {
            this._builder.clearMsgSeq();
        }

        public final long getEditTime() {
            return this._builder.getEditTime();
        }

        public final void setEditTime(long value) {
            this._builder.setEditTime(value);
        }

        public final void clearEditTime() {
            this._builder.clearEditTime();
        }
    }

    private WsMsgKt() {
    }

    /* renamed from: -initializewsCmd, reason: not valid java name */
    public final WsMsg.WsCmd m9131initializewsCmd(Function1<? super WsCmdKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        WsCmdKt.Dsl.Companion companion = WsCmdKt.Dsl.INSTANCE;
        WsMsg.WsCmd.Builder builderNewBuilder = WsMsg.WsCmd.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        WsCmdKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WsMsgKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsCmdKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class WsCmdKt {
        public static final int $stable = 0;
        public static final WsCmdKt INSTANCE = new WsCmdKt();

        /* compiled from: WsMsgKt.kt */
        @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsCmdKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd;", "value", "", Name.MARK, "getId", "()J", "setId", "(J)V", "clearId", "", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "clearName", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final WsMsg.WsCmd.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(WsMsg.WsCmd.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(WsMsg.WsCmd.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: WsMsgKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsCmdKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsCmdKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsCmd$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(WsMsg.WsCmd.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ WsMsg.WsCmd _build() {
                WsMsg.WsCmd wsCmdBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(wsCmdBuild, "build(...)");
                return wsCmdBuild;
            }

            public final long getId() {
                return this._builder.getId();
            }

            public final void setId(long value) {
                this._builder.setId(value);
            }

            public final void clearId() {
                this._builder.clearId();
            }

            public final String getName() {
                String name = this._builder.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return name;
            }

            public final void setName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setName(value);
            }

            public final void clearName() {
                this._builder.clearName();
            }
        }

        private WsCmdKt() {
        }
    }

    /* renamed from: -initializewsSender, reason: not valid java name */
    public final WsMsg.WsSender m9133initializewsSender(Function1<? super WsSenderKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        WsSenderKt.Dsl.Companion companion = WsSenderKt.Dsl.INSTANCE;
        WsMsg.WsSender.Builder builderNewBuilder = WsMsg.WsSender.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        WsSenderKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WsMsgKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsSenderKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class WsSenderKt {
        public static final int $stable = 0;
        public static final WsSenderKt INSTANCE = new WsSenderKt();

        /* compiled from: WsMsgKt.kt */
        @Metadata(m168d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J%\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\b&J&\u0010'\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\b\u001a\u00020\tH\u0087\n\u00a2\u0006\u0002\b(J+\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0+H\u0007\u00a2\u0006\u0002\b,J,\u0010'\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0+H\u0087\n\u00a2\u0006\u0002\b-J.\u0010.\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!2\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0002\b0J\u001d\u00101\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!H\u0007\u00a2\u0006\u0002\b2J%\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!2\u0006\u0010\b\u001a\u000204H\u0007\u00a2\u0006\u0002\b7J&\u0010'\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!2\u0006\u0010\b\u001a\u000204H\u0087\n\u00a2\u0006\u0002\b8J+\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002040+H\u0007\u00a2\u0006\u0002\b9J,\u0010'\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002040+H\u0087\n\u00a2\u0006\u0002\b:J.\u0010.\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!2\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\b\u001a\u000204H\u0087\u0002\u00a2\u0006\u0002\b;J\u001d\u00101\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!H\u0007\u00a2\u0006\u0002\b<R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u001d\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!8F\u00a2\u0006\u0006\u001a\u0004\b6\u0010$\u00a8\u0006@"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsSenderKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender;", "value", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "clearChatId", "", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()I", "setChatType", "(I)V", "clearChatType", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "tagOld", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsSenderKt$Dsl$TagOldProxy;", "getTagOld", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addTagOld", "plusAssign", "plusAssignTagOld", "addAll", "values", "", "addAllTagOld", "plusAssignAllTagOld", "set", "index", "setTagOld", "clear", "clearTagOld", "tag", "Lcom/yhchat/canarys/proto/chat_ws_go/WsTag;", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsSenderKt$Dsl$TagProxy;", "getTag", "addTag", "plusAssignTag", "addAllTag", "plusAssignAllTag", "setTag", "clearTag", "Companion", "TagOldProxy", "TagProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final WsMsg.WsSender.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(WsMsg.WsSender.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(WsMsg.WsSender.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: WsMsgKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsSenderKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsSenderKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsSender$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(WsMsg.WsSender.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ WsMsg.WsSender _build() {
                WsMsg.WsSender wsSenderBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(wsSenderBuild, "build(...)");
                return wsSenderBuild;
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

            public final String getName() {
                String name = this._builder.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return name;
            }

            public final void setName(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setName(value);
            }

            public final void clearName() {
                this._builder.clearName();
            }

            public final String getAvatarUrl() {
                String avatarUrl = this._builder.getAvatarUrl();
                Intrinsics.checkNotNullExpressionValue(avatarUrl, "getAvatarUrl(...)");
                return avatarUrl;
            }

            public final void setAvatarUrl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAvatarUrl(value);
            }

            public final void clearAvatarUrl() {
                this._builder.clearAvatarUrl();
            }

            /* compiled from: WsMsgKt.kt */
            @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsSenderKt$Dsl$TagOldProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class TagOldProxy extends DslProxy {
                public static final int $stable = 8;

                private TagOldProxy() {
                }
            }

            public final DslList<String, TagOldProxy> getTagOld() {
                List<String> tagOldList = this._builder.getTagOldList();
                Intrinsics.checkNotNullExpressionValue(tagOldList, "getTagOldList(...)");
                return new DslList<>(tagOldList);
            }

            public final /* synthetic */ void addTagOld(DslList $this$add, String value) {
                Intrinsics.checkNotNullParameter($this$add, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addTagOld(value);
            }

            public final /* synthetic */ void plusAssignTagOld(DslList<String, TagOldProxy> dslList, String value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addTagOld(dslList, value);
            }

            public final /* synthetic */ void addAllTagOld(DslList $this$addAll, Iterable values) {
                Intrinsics.checkNotNullParameter($this$addAll, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllTagOld(values);
            }

            public final /* synthetic */ void plusAssignAllTagOld(DslList<String, TagOldProxy> dslList, Iterable<String> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllTagOld(dslList, values);
            }

            public final /* synthetic */ void setTagOld(DslList $this$set, int index, String value) {
                Intrinsics.checkNotNullParameter($this$set, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTagOld(index, value);
            }

            public final /* synthetic */ void clearTagOld(DslList $this$clear) {
                Intrinsics.checkNotNullParameter($this$clear, "<this>");
                this._builder.clearTagOld();
            }

            /* compiled from: WsMsgKt.kt */
            @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsSenderKt$Dsl$TagProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class TagProxy extends DslProxy {
                public static final int $stable = 8;

                private TagProxy() {
                }
            }

            public final /* synthetic */ DslList getTag() {
                List<WsTag> tagList = this._builder.getTagList();
                Intrinsics.checkNotNullExpressionValue(tagList, "getTagList(...)");
                return new DslList(tagList);
            }

            public final /* synthetic */ void addTag(DslList $this$add, WsTag value) {
                Intrinsics.checkNotNullParameter($this$add, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addTag(value);
            }

            public final /* synthetic */ void plusAssignTag(DslList<WsTag, TagProxy> dslList, WsTag value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addTag(dslList, value);
            }

            public final /* synthetic */ void addAllTag(DslList $this$addAll, Iterable values) {
                Intrinsics.checkNotNullParameter($this$addAll, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllTag(values);
            }

            public final /* synthetic */ void plusAssignAllTag(DslList<WsTag, TagProxy> dslList, Iterable<WsTag> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllTag(dslList, values);
            }

            public final /* synthetic */ void setTag(DslList $this$set, int index, WsTag value) {
                Intrinsics.checkNotNullParameter($this$set, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTag(index, value);
            }

            public final /* synthetic */ void clearTag(DslList $this$clear) {
                Intrinsics.checkNotNullParameter($this$clear, "<this>");
                this._builder.clearTag();
            }
        }

        private WsSenderKt() {
        }
    }

    /* renamed from: -initializewsContent, reason: not valid java name */
    public final WsMsg.WsContent m9132initializewsContent(Function1<? super WsContentKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        WsContentKt.Dsl.Companion companion = WsContentKt.Dsl.INSTANCE;
        WsMsg.WsContent.Builder builderNewBuilder = WsMsg.WsContent.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        WsContentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: WsMsgKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsContentKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class WsContentKt {
        public static final int $stable = 0;
        public static final WsContentKt INSTANCE = new WsContentKt();

        /* compiled from: WsMsgKt.kt */
        @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b0\n\u0002\u0010\t\n\u0002\b,\b\u0007\u0018\u0000 l2\u00020\u0001:\u0001lB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010,\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0010J\u0006\u00104\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020\u0010J\u0006\u0010G\u001a\u00020\u0010J\u0006\u0010K\u001a\u00020\u0010J\u0006\u0010O\u001a\u00020\u0010J\u0006\u0010S\u001a\u00020\u0010J\u0006\u0010W\u001a\u00020\u0010J\u0006\u0010[\u001a\u00020\u0010J\u0006\u0010_\u001a\u00020\u0010J\u0006\u0010c\u001a\u00020\u0010J\u0006\u0010g\u001a\u00020\u0010J\u0006\u0010k\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR$\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR$\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR$\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR$\u0010)\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR$\u0010-\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR$\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR$\u00105\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR$\u00109\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR$\u0010=\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR$\u0010B\u001a\u00020A2\u0006\u0010\b\u001a\u00020A8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010\f\"\u0004\bJ\u0010\u000eR$\u0010L\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bM\u0010\f\"\u0004\bN\u0010\u000eR$\u0010P\u001a\u00020A2\u0006\u0010\b\u001a\u00020A8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010D\"\u0004\bR\u0010FR$\u0010T\u001a\u00020A2\u0006\u0010\b\u001a\u00020A8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bU\u0010D\"\u0004\bV\u0010FR$\u0010X\u001a\u00020A2\u0006\u0010\b\u001a\u00020A8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bY\u0010D\"\u0004\bZ\u0010FR$\u0010\\\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b]\u0010\f\"\u0004\b^\u0010\u000eR$\u0010`\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010\f\"\u0004\bb\u0010\u000eR$\u0010d\u001a\u00020A2\u0006\u0010\b\u001a\u00020A8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\be\u0010D\"\u0004\bf\u0010FR$\u0010h\u001a\u00020A2\u0006\u0010\b\u001a\u00020A8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bi\u0010D\"\u0004\bj\u0010F\u00a8\u0006m"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsContentKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent;", "value", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "clearText", "", "buttons", "getButtons", "setButtons", "clearButtons", "imageUrl", "getImageUrl", "setImageUrl", "clearImageUrl", "fileName", "getFileName", "setFileName", "clearFileName", "fileUrl", "getFileUrl", "setFileUrl", "clearFileUrl", "form", "getForm", "setForm", "clearForm", "quoteMsgText", "getQuoteMsgText", "setQuoteMsgText", "clearQuoteMsgText", "stickerUrl", "getStickerUrl", "setStickerUrl", "clearStickerUrl", "postId", "getPostId", "setPostId", "clearPostId", "postTitle", "getPostTitle", "setPostTitle", "clearPostTitle", "postContent", "getPostContent", "setPostContent", "clearPostContent", "postContentType", "getPostContentType", "setPostContentType", "clearPostContentType", "expressionId", "getExpressionId", "setExpressionId", "clearExpressionId", "", "fileSize", "getFileSize", "()J", "setFileSize", "(J)V", "clearFileSize", "videoUrl", "getVideoUrl", "setVideoUrl", "clearVideoUrl", "audioUrl", "getAudioUrl", "setAudioUrl", "clearAudioUrl", "audioTime", "getAudioTime", "setAudioTime", "clearAudioTime", "stickerItemId", "getStickerItemId", "setStickerItemId", "clearStickerItemId", "stickerPackId", "getStickerPackId", "setStickerPackId", "clearStickerPackId", "callText", "getCallText", "setCallText", "clearCallText", "callStatusText", "getCallStatusText", "setCallStatusText", "clearCallStatusText", "width", "getWidth", "setWidth", "clearWidth", "height", "getHeight", "setHeight", "clearHeight", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final WsMsg.WsContent.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(WsMsg.WsContent.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(WsMsg.WsContent.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: WsMsgKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsContentKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsgKt$WsContentKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/chat_ws_go/WsMsg$WsContent$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(WsMsg.WsContent.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ WsMsg.WsContent _build() {
                WsMsg.WsContent wsContentBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(wsContentBuild, "build(...)");
                return wsContentBuild;
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

            public final String getImageUrl() {
                String imageUrl = this._builder.getImageUrl();
                Intrinsics.checkNotNullExpressionValue(imageUrl, "getImageUrl(...)");
                return imageUrl;
            }

            public final void setImageUrl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setImageUrl(value);
            }

            public final void clearImageUrl() {
                this._builder.clearImageUrl();
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

            public final String getFileUrl() {
                String fileUrl = this._builder.getFileUrl();
                Intrinsics.checkNotNullExpressionValue(fileUrl, "getFileUrl(...)");
                return fileUrl;
            }

            public final void setFileUrl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setFileUrl(value);
            }

            public final void clearFileUrl() {
                this._builder.clearFileUrl();
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

            public final String getStickerUrl() {
                String stickerUrl = this._builder.getStickerUrl();
                Intrinsics.checkNotNullExpressionValue(stickerUrl, "getStickerUrl(...)");
                return stickerUrl;
            }

            public final void setStickerUrl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setStickerUrl(value);
            }

            public final void clearStickerUrl() {
                this._builder.clearStickerUrl();
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

            public final String getPostContentType() {
                String postContentType = this._builder.getPostContentType();
                Intrinsics.checkNotNullExpressionValue(postContentType, "getPostContentType(...)");
                return postContentType;
            }

            public final void setPostContentType(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setPostContentType(value);
            }

            public final void clearPostContentType() {
                this._builder.clearPostContentType();
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

            public final long getFileSize() {
                return this._builder.getFileSize();
            }

            public final void setFileSize(long value) {
                this._builder.setFileSize(value);
            }

            public final void clearFileSize() {
                this._builder.clearFileSize();
            }

            public final String getVideoUrl() {
                String videoUrl = this._builder.getVideoUrl();
                Intrinsics.checkNotNullExpressionValue(videoUrl, "getVideoUrl(...)");
                return videoUrl;
            }

            public final void setVideoUrl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setVideoUrl(value);
            }

            public final void clearVideoUrl() {
                this._builder.clearVideoUrl();
            }

            public final String getAudioUrl() {
                String audioUrl = this._builder.getAudioUrl();
                Intrinsics.checkNotNullExpressionValue(audioUrl, "getAudioUrl(...)");
                return audioUrl;
            }

            public final void setAudioUrl(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setAudioUrl(value);
            }

            public final void clearAudioUrl() {
                this._builder.clearAudioUrl();
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

            public final String getCallText() {
                String callText = this._builder.getCallText();
                Intrinsics.checkNotNullExpressionValue(callText, "getCallText(...)");
                return callText;
            }

            public final void setCallText(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCallText(value);
            }

            public final void clearCallText() {
                this._builder.clearCallText();
            }

            public final String getCallStatusText() {
                String callStatusText = this._builder.getCallStatusText();
                Intrinsics.checkNotNullExpressionValue(callStatusText, "getCallStatusText(...)");
                return callStatusText;
            }

            public final void setCallStatusText(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setCallStatusText(value);
            }

            public final void clearCallStatusText() {
                this._builder.clearCallStatusText();
            }

            public final long getWidth() {
                return this._builder.getWidth();
            }

            public final void setWidth(long value) {
                this._builder.setWidth(value);
            }

            public final void clearWidth() {
                this._builder.clearWidth();
            }

            public final long getHeight() {
                return this._builder.getHeight();
            }

            public final void setHeight(long value) {
                this._builder.setHeight(value);
            }

            public final void clearHeight() {
                this._builder.clearHeight();
            }
        }

        private WsContentKt() {
        }
    }
}
