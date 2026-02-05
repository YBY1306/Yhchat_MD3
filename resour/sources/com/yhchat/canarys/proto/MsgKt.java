package com.yhchat.canarys.proto;

import androidx.autofill.HintConstants;
import com.google.protobuf.kotlin.DslList;
import com.google.protobuf.kotlin.DslProxy;
import com.yhchat.canarys.p007ui.group.ChatSearchActivity;
import com.yhchat.canarys.proto.Msg;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MsgKt.kt */
@Metadata(m168d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0004\u0014\u0015\u0016\u0017B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000bJ*\u0010\f\u001a\u00020\r2\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u000fJ*\u0010\u0010\u001a\u00020\u00112\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0002\b\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0002\b\u0013\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0018"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt;", "", "<init>", "()V", "cmd", "Lcom/yhchat/canarys/proto/Msg$Cmd;", "block", "Lkotlin/Function1;", "Lcom/yhchat/canarys/proto/MsgKt$CmdKt$Dsl;", "", "Lkotlin/ExtensionFunctionType;", "-initializecmd", "content", "Lcom/yhchat/canarys/proto/Msg$Content;", "Lcom/yhchat/canarys/proto/MsgKt$ContentKt$Dsl;", "-initializecontent", "sender", "Lcom/yhchat/canarys/proto/Msg$Sender;", "Lcom/yhchat/canarys/proto/MsgKt$SenderKt$Dsl;", "-initializesender", "Dsl", "CmdKt", "ContentKt", "SenderKt", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes8.dex */
public final class MsgKt {
    public static final int $stable = 0;
    public static final MsgKt INSTANCE = new MsgKt();

    /* compiled from: MsgKt.kt */
    @Metadata(m168d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001UB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010.\u001a\u00020\u0010J\u0006\u0010/\u001a\u00020\u0019J\u0006\u00109\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020\u0010J\u0006\u0010A\u001a\u00020\u0019J\u0006\u0010H\u001a\u00020\u0010J\u0006\u0010L\u001a\u00020\u0010J\u0006\u0010P\u001a\u00020\u0010J\u0006\u0010T\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001a\u001a\u0004\u0018\u00010\u0011*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR$\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR$\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020!8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010)\u001a\u00020(2\u0006\u0010\b\u001a\u00020(8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0017\u00100\u001a\u0004\u0018\u00010(*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\b1\u00102R$\u00104\u001a\u0002032\u0006\u0010\b\u001a\u0002038G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010;\u001a\u00020:2\u0006\u0010\b\u001a\u00020:8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0017\u0010B\u001a\u0004\u0018\u00010:*\u00020\u00008F\u00a2\u0006\u0006\u001a\u0004\bC\u0010DR$\u0010E\u001a\u0002032\u0006\u0010\b\u001a\u0002038G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bF\u00106\"\u0004\bG\u00108R$\u0010I\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010\f\"\u0004\bK\u0010\u000eR$\u0010M\u001a\u0002032\u0006\u0010\b\u001a\u0002038G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bN\u00106\"\u0004\bO\u00108R$\u0010Q\u001a\u0002032\u0006\u0010\b\u001a\u0002038G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bR\u00106\"\u0004\bS\u00108\u00a8\u0006V"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/Msg$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/Msg$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/Msg;", "value", "", "msgId", "getMsgId", "()Ljava/lang/String;", "setMsgId", "(Ljava/lang/String;)V", "clearMsgId", "", "Lcom/yhchat/canarys/proto/Msg$Sender;", "sender", "getSender", "()Lcom/yhchat/canarys/proto/Msg$Sender;", "setSender", "(Lcom/yhchat/canarys/proto/Msg$Sender;)V", "clearSender", "hasSender", "", "senderOrNull", "getSenderOrNull", "(Lcom/yhchat/canarys/proto/MsgKt$Dsl;)Lcom/yhchat/canarys/proto/Msg$Sender;", "direction", "getDirection", "setDirection", "clearDirection", "", "contentType", "getContentType", "()I", "setContentType", "(I)V", "clearContentType", "Lcom/yhchat/canarys/proto/Msg$Content;", "content", "getContent", "()Lcom/yhchat/canarys/proto/Msg$Content;", "setContent", "(Lcom/yhchat/canarys/proto/Msg$Content;)V", "clearContent", "hasContent", "contentOrNull", "getContentOrNull", "(Lcom/yhchat/canarys/proto/MsgKt$Dsl;)Lcom/yhchat/canarys/proto/Msg$Content;", "", "sendTime", "getSendTime", "()J", "setSendTime", "(J)V", "clearSendTime", "Lcom/yhchat/canarys/proto/Msg$Cmd;", "cmd", "getCmd", "()Lcom/yhchat/canarys/proto/Msg$Cmd;", "setCmd", "(Lcom/yhchat/canarys/proto/Msg$Cmd;)V", "clearCmd", "hasCmd", "cmdOrNull", "getCmdOrNull", "(Lcom/yhchat/canarys/proto/MsgKt$Dsl;)Lcom/yhchat/canarys/proto/Msg$Cmd;", "msgDeleteTime", "getMsgDeleteTime", "setMsgDeleteTime", "clearMsgDeleteTime", "quoteMsgId", "getQuoteMsgId", "setQuoteMsgId", "clearQuoteMsgId", "msgSeq", "getMsgSeq", "setMsgSeq", "clearMsgSeq", "editTime", "getEditTime", "setEditTime", "clearEditTime", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class Dsl {
        private final Msg.Builder _builder;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public /* synthetic */ Dsl(Msg.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
            this(builder);
        }

        private Dsl(Msg.Builder _builder) {
            this._builder = _builder;
        }

        /* compiled from: MsgKt.kt */
        @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/MsgKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/Msg$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Msg.Builder builder) {
                Intrinsics.checkNotNullParameter(builder, "builder");
                return new Dsl(builder, null);
            }
        }

        public final /* synthetic */ Msg _build() {
            Msg msgBuild = this._builder.build();
            Intrinsics.checkNotNullExpressionValue(msgBuild, "build(...)");
            return msgBuild;
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

        public final Msg.Sender getSender() {
            Msg.Sender sender = this._builder.getSender();
            Intrinsics.checkNotNullExpressionValue(sender, "getSender(...)");
            return sender;
        }

        public final void setSender(Msg.Sender value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setSender(value);
        }

        public final void clearSender() {
            this._builder.clearSender();
        }

        public final boolean hasSender() {
            return this._builder.hasSender();
        }

        public final Msg.Sender getSenderOrNull(Dsl $this$senderOrNull) {
            Intrinsics.checkNotNullParameter($this$senderOrNull, "<this>");
            return MsgKtKt.getSenderOrNull($this$senderOrNull._builder);
        }

        public final String getDirection() {
            String direction = this._builder.getDirection();
            Intrinsics.checkNotNullExpressionValue(direction, "getDirection(...)");
            return direction;
        }

        public final void setDirection(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setDirection(value);
        }

        public final void clearDirection() {
            this._builder.clearDirection();
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

        public final Msg.Content getContent() {
            Msg.Content content = this._builder.getContent();
            Intrinsics.checkNotNullExpressionValue(content, "getContent(...)");
            return content;
        }

        public final void setContent(Msg.Content value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setContent(value);
        }

        public final void clearContent() {
            this._builder.clearContent();
        }

        public final boolean hasContent() {
            return this._builder.hasContent();
        }

        public final Msg.Content getContentOrNull(Dsl $this$contentOrNull) {
            Intrinsics.checkNotNullParameter($this$contentOrNull, "<this>");
            return MsgKtKt.getContentOrNull($this$contentOrNull._builder);
        }

        public final long getSendTime() {
            return this._builder.getSendTime();
        }

        public final void setSendTime(long value) {
            this._builder.setSendTime(value);
        }

        public final void clearSendTime() {
            this._builder.clearSendTime();
        }

        public final Msg.Cmd getCmd() {
            Msg.Cmd cmd = this._builder.getCmd();
            Intrinsics.checkNotNullExpressionValue(cmd, "getCmd(...)");
            return cmd;
        }

        public final void setCmd(Msg.Cmd value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this._builder.setCmd(value);
        }

        public final void clearCmd() {
            this._builder.clearCmd();
        }

        public final boolean hasCmd() {
            return this._builder.hasCmd();
        }

        public final Msg.Cmd getCmdOrNull(Dsl $this$cmdOrNull) {
            Intrinsics.checkNotNullParameter($this$cmdOrNull, "<this>");
            return MsgKtKt.getCmdOrNull($this$cmdOrNull._builder);
        }

        public final long getMsgDeleteTime() {
            return this._builder.getMsgDeleteTime();
        }

        public final void setMsgDeleteTime(long value) {
            this._builder.setMsgDeleteTime(value);
        }

        public final void clearMsgDeleteTime() {
            this._builder.clearMsgDeleteTime();
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

    private MsgKt() {
    }

    /* renamed from: -initializecmd, reason: not valid java name */
    public final Msg.Cmd m8813initializecmd(Function1<? super CmdKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        CmdKt.Dsl.Companion companion = CmdKt.Dsl.INSTANCE;
        Msg.Cmd.Builder builderNewBuilder = Msg.Cmd.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        CmdKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: MsgKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$CmdKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class CmdKt {
        public static final int $stable = 0;
        public static final CmdKt INSTANCE = new CmdKt();

        /* compiled from: MsgKt.kt */
        @Metadata(m168d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0019"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$CmdKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/Msg$Cmd$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/Msg$Cmd$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/Msg$Cmd;", "value", "", HintConstants.AUTOFILL_HINT_NAME, "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "clearName", "", "", "type", "getType", "()I", "setType", "(I)V", "clearType", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final Msg.Cmd.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(Msg.Cmd.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(Msg.Cmd.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: MsgKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$CmdKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/MsgKt$CmdKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/Msg$Cmd$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Msg.Cmd.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ Msg.Cmd _build() {
                Msg.Cmd cmdBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(cmdBuild, "build(...)");
                return cmdBuild;
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

            public final int getType() {
                return this._builder.getType();
            }

            public final void setType(int value) {
                this._builder.setType(value);
            }

            public final void clearType() {
                this._builder.clearType();
            }
        }

        private CmdKt() {
        }
    }

    /* renamed from: -initializecontent, reason: not valid java name */
    public final Msg.Content m8814initializecontent(Function1<? super ContentKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ContentKt.Dsl.Companion companion = ContentKt.Dsl.INSTANCE;
        Msg.Content.Builder builderNewBuilder = Msg.Content.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        ContentKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: MsgKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$ContentKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class ContentKt {
        public static final int $stable = 0;
        public static final ContentKt INSTANCE = new ContentKt();

        /* compiled from: MsgKt.kt */
        @Metadata(m168d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b8\n\u0002\u0010\t\n\u0002\b8\b\u0007\u0018\u0000 \u0080\u00012\u00020\u0001:\u0002\u0080\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0018\u001a\u00020\u0010J\u0006\u0010\u001c\u001a\u00020\u0010J\u0006\u0010 \u001a\u00020\u0010J\u0006\u0010$\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010,\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0010J\u0006\u00104\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0010J\u0006\u0010@\u001a\u00020\u0010J\u0006\u0010D\u001a\u00020\u0010J\u0006\u0010H\u001a\u00020\u0010J\u0006\u0010O\u001a\u00020\u0010J\u0006\u0010S\u001a\u00020\u0010J\u0006\u0010W\u001a\u00020\u0010J\u0006\u0010[\u001a\u00020\u0010J\u0006\u0010_\u001a\u00020\u0010J\u0006\u0010c\u001a\u00020\u0010J\u0006\u0010g\u001a\u00020\u0010J\u0006\u0010k\u001a\u00020\u0010J\u0006\u0010o\u001a\u00020\u0010J\u0006\u0010s\u001a\u00020\u0010J\u0006\u0010w\u001a\u00020\u0010J\u0006\u0010{\u001a\u00020\u0010J\u0006\u0010\u007f\u001a\u00020\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0011\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR$\u0010\u0015\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR$\u0010\u0019\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u000eR$\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR$\u0010!\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR$\u0010%\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u000eR$\u0010)\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u000eR$\u0010-\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR$\u00101\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010\f\"\u0004\b3\u0010\u000eR$\u00105\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR$\u00109\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010\f\"\u0004\b;\u0010\u000eR$\u0010=\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010\f\"\u0004\b?\u0010\u000eR$\u0010A\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bB\u0010\f\"\u0004\bC\u0010\u000eR$\u0010E\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010\u000eR$\u0010J\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010P\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010\f\"\u0004\bR\u0010\u000eR$\u0010T\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bU\u0010\f\"\u0004\bV\u0010\u000eR$\u0010X\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bY\u0010L\"\u0004\bZ\u0010NR$\u0010\\\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b]\u0010\f\"\u0004\b^\u0010\u000eR$\u0010`\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010L\"\u0004\bb\u0010NR$\u0010d\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\be\u0010L\"\u0004\bf\u0010NR$\u0010h\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bi\u0010L\"\u0004\bj\u0010NR$\u0010l\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bm\u0010\f\"\u0004\bn\u0010\u000eR$\u0010p\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bq\u0010\f\"\u0004\br\u0010\u000eR$\u0010t\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bu\u0010L\"\u0004\bv\u0010NR$\u0010x\u001a\u00020I2\u0006\u0010\b\u001a\u00020I8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\by\u0010L\"\u0004\bz\u0010NR$\u0010|\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b}\u0010\f\"\u0004\b~\u0010\u000e\u00a8\u0006\u0081\u0001"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$ContentKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/Msg$Content$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/Msg$Content$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/Msg$Content;", "value", "", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "clearText", "", "buttons", "getButtons", "setButtons", "clearButtons", "imageUrl", "getImageUrl", "setImageUrl", "clearImageUrl", "fileName", "getFileName", "setFileName", "clearFileName", "fileUrl", "getFileUrl", "setFileUrl", "clearFileUrl", "form", "getForm", "setForm", "clearForm", "quoteMsgText", "getQuoteMsgText", "setQuoteMsgText", "clearQuoteMsgText", "stickerUrl", "getStickerUrl", "setStickerUrl", "clearStickerUrl", "postId", "getPostId", "setPostId", "clearPostId", "postTitle", "getPostTitle", "setPostTitle", "clearPostTitle", "postContent", "getPostContent", "setPostContent", "clearPostContent", "postContentType", "getPostContentType", "setPostContentType", "clearPostContentType", "expressionId", "getExpressionId", "setExpressionId", "clearExpressionId", "quoteImageUrl", "getQuoteImageUrl", "setQuoteImageUrl", "clearQuoteImageUrl", "quoteImageName", "getQuoteImageName", "setQuoteImageName", "clearQuoteImageName", "", "fileSize", "getFileSize", "()J", "setFileSize", "(J)V", "clearFileSize", "videoUrl", "getVideoUrl", "setVideoUrl", "clearVideoUrl", "audioUrl", "getAudioUrl", "setAudioUrl", "clearAudioUrl", "audioTime", "getAudioTime", "setAudioTime", "clearAudioTime", "quoteVideoUrl", "getQuoteVideoUrl", "setQuoteVideoUrl", "clearQuoteVideoUrl", "quoteVideoTime", "getQuoteVideoTime", "setQuoteVideoTime", "clearQuoteVideoTime", "stickerItemId", "getStickerItemId", "setStickerItemId", "clearStickerItemId", "stickerPackId", "getStickerPackId", "setStickerPackId", "clearStickerPackId", "callText", "getCallText", "setCallText", "clearCallText", "callStatusText", "getCallStatusText", "setCallStatusText", "clearCallStatusText", "width", "getWidth", "setWidth", "clearWidth", "height", "getHeight", "setHeight", "clearHeight", "tip", "getTip", "setTip", "clearTip", "Companion", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final Msg.Content.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(Msg.Content.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(Msg.Content.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: MsgKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$ContentKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/MsgKt$ContentKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/Msg$Content$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Msg.Content.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ Msg.Content _build() {
                Msg.Content contentBuild = this._builder.build();
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

            public final String getTip() {
                String tip = this._builder.getTip();
                Intrinsics.checkNotNullExpressionValue(tip, "getTip(...)");
                return tip;
            }

            public final void setTip(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTip(value);
            }

            public final void clearTip() {
                this._builder.clearTip();
            }
        }

        private ContentKt() {
        }
    }

    /* renamed from: -initializesender, reason: not valid java name */
    public final Msg.Sender m8815initializesender(Function1<? super SenderKt.Dsl, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        SenderKt.Dsl.Companion companion = SenderKt.Dsl.INSTANCE;
        Msg.Sender.Builder builderNewBuilder = Msg.Sender.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder(...)");
        SenderKt.Dsl dsl_create = companion._create(builderNewBuilder);
        block.invoke(dsl_create);
        return dsl_create._build();
    }

    /* compiled from: MsgKt.kt */
    @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0005"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$SenderKt;", "", "<init>", "()V", "Dsl", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
    public static final class SenderKt {
        public static final int $stable = 0;
        public static final SenderKt INSTANCE = new SenderKt();

        /* compiled from: MsgKt.kt */
        @Metadata(m168d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u001c\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 =2\u00020\u0001:\u0003=>?B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0010J\u0006\u0010\u001b\u001a\u00020\u0010J\u0006\u0010\u001f\u001a\u00020\u0010J%\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\b\u001a\u00020\tH\u0007\u00a2\u0006\u0002\b&J&\u0010'\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\b\u001a\u00020\tH\u0087\n\u00a2\u0006\u0002\b(J+\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0+H\u0007\u00a2\u0006\u0002\b,J,\u0010'\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0+H\u0087\n\u00a2\u0006\u0002\b-J.\u0010.\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!2\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0087\u0002\u00a2\u0006\u0002\b0J\u001d\u00101\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!H\u0007\u00a2\u0006\u0002\b2J%\u0010%\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!2\u0006\u0010\b\u001a\u000204H\u0007\u00a2\u0006\u0002\b7J&\u0010'\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!2\u0006\u0010\b\u001a\u000204H\u0087\n\u00a2\u0006\u0002\b8J+\u0010)\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002040+H\u0007\u00a2\u0006\u0002\b9J,\u0010'\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!2\f\u0010*\u001a\b\u0012\u0004\u0012\u0002040+H\u0087\n\u00a2\u0006\u0002\b:J.\u0010.\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!2\u0006\u0010/\u001a\u00020\u00112\u0006\u0010\b\u001a\u000204H\u0087\u0002\u00a2\u0006\u0002\b;J\u001d\u00101\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!H\u0007\u00a2\u0006\u0002\b<R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00118G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000eR$\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t8G@GX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001d\u0010\f\"\u0004\b\u001e\u0010\u000eR\u001d\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\"0!8F\u00a2\u0006\u0006\u001a\u0004\b#\u0010$R\u001d\u00103\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002050!8F\u00a2\u0006\u0006\u001a\u0004\b6\u0010$\u00a8\u0006@"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$SenderKt$Dsl;", "", "_builder", "Lcom/yhchat/canarys/proto/Msg$Sender$Builder;", "<init>", "(Lcom/yhchat/canarys/proto/Msg$Sender$Builder;)V", "_build", "Lcom/yhchat/canarys/proto/Msg$Sender;", "value", "", ChatSearchActivity.EXTRA_CHAT_ID, "getChatId", "()Ljava/lang/String;", "setChatId", "(Ljava/lang/String;)V", "clearChatId", "", "", ChatSearchActivity.EXTRA_CHAT_TYPE, "getChatType", "()I", "setChatType", "(I)V", "clearChatType", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "clearName", "avatarUrl", "getAvatarUrl", "setAvatarUrl", "clearAvatarUrl", "tagOld", "Lcom/google/protobuf/kotlin/DslList;", "Lcom/yhchat/canarys/proto/MsgKt$SenderKt$Dsl$TagOldProxy;", "getTagOld", "()Lcom/google/protobuf/kotlin/DslList;", "add", "addTagOld", "plusAssign", "plusAssignTagOld", "addAll", "values", "", "addAllTagOld", "plusAssignAllTagOld", "set", "index", "setTagOld", "clear", "clearTagOld", "tag", "Lcom/yhchat/canarys/proto/Tag;", "Lcom/yhchat/canarys/proto/MsgKt$SenderKt$Dsl$TagProxy;", "getTag", "addTag", "plusAssignTag", "addAllTag", "plusAssignAllTag", "setTag", "clearTag", "Companion", "TagOldProxy", "TagProxy", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
        public static final class Dsl {
            private final Msg.Sender.Builder _builder;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            public static final int $stable = 8;

            public /* synthetic */ Dsl(Msg.Sender.Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
                this(builder);
            }

            private Dsl(Msg.Sender.Builder _builder) {
                this._builder = _builder;
            }

            /* compiled from: MsgKt.kt */
            @Metadata(m168d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u00a8\u0006\b"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$SenderKt$Dsl$Companion;", "", "<init>", "()V", "_create", "Lcom/yhchat/canarys/proto/MsgKt$SenderKt$Dsl;", "builder", "Lcom/yhchat/canarys/proto/Msg$Sender$Builder;", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final /* synthetic */ Dsl _create(Msg.Sender.Builder builder) {
                    Intrinsics.checkNotNullParameter(builder, "builder");
                    return new Dsl(builder, null);
                }
            }

            public final /* synthetic */ Msg.Sender _build() {
                Msg.Sender senderBuild = this._builder.build();
                Intrinsics.checkNotNullExpressionValue(senderBuild, "build(...)");
                return senderBuild;
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

            /* compiled from: MsgKt.kt */
            @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$SenderKt$Dsl$TagOldProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
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

            /* compiled from: MsgKt.kt */
            @Metadata(m168d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0004"}, m169d2 = {"Lcom/yhchat/canarys/proto/MsgKt$SenderKt$Dsl$TagProxy;", "Lcom/google/protobuf/kotlin/DslProxy;", "<init>", "()V", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
            public static final class TagProxy extends DslProxy {
                public static final int $stable = 8;

                private TagProxy() {
                }
            }

            public final /* synthetic */ DslList getTag() {
                List<Tag> tagList = this._builder.getTagList();
                Intrinsics.checkNotNullExpressionValue(tagList, "getTagList(...)");
                return new DslList(tagList);
            }

            public final /* synthetic */ void addTag(DslList $this$add, Tag value) {
                Intrinsics.checkNotNullParameter($this$add, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.addTag(value);
            }

            public final /* synthetic */ void plusAssignTag(DslList<Tag, TagProxy> dslList, Tag value) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                addTag(dslList, value);
            }

            public final /* synthetic */ void addAllTag(DslList $this$addAll, Iterable values) {
                Intrinsics.checkNotNullParameter($this$addAll, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                this._builder.addAllTag(values);
            }

            public final /* synthetic */ void plusAssignAllTag(DslList<Tag, TagProxy> dslList, Iterable<Tag> values) {
                Intrinsics.checkNotNullParameter(dslList, "<this>");
                Intrinsics.checkNotNullParameter(values, "values");
                addAllTag(dslList, values);
            }

            public final /* synthetic */ void setTag(DslList $this$set, int index, Tag value) {
                Intrinsics.checkNotNullParameter($this$set, "<this>");
                Intrinsics.checkNotNullParameter(value, "value");
                this._builder.setTag(index, value);
            }

            public final /* synthetic */ void clearTag(DslList $this$clear) {
                Intrinsics.checkNotNullParameter($this$clear, "<this>");
                this._builder.clearTag();
            }
        }

        private SenderKt() {
        }
    }
}
