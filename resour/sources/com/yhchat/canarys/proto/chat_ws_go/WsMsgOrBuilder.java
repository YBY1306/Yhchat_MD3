package com.yhchat.canarys.proto.chat_ws_go;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.chat_ws_go.WsMsg;

/* loaded from: classes10.dex */
public interface WsMsgOrBuilder extends MessageLiteOrBuilder {
    String getChatId();

    ByteString getChatIdBytes();

    int getChatType();

    WsMsg.WsCmd getCmd();

    WsMsg.WsContent getContent();

    int getContentType();

    long getDeleteTime();

    long getEditTime();

    String getMsgId();

    ByteString getMsgIdBytes();

    long getMsgSeq();

    String getQuoteMsgId();

    ByteString getQuoteMsgIdBytes();

    String getRecvId();

    ByteString getRecvIdBytes();

    WsMsg.WsSender getSender();

    long getTimestamp();

    boolean hasCmd();

    boolean hasContent();

    boolean hasSender();
}
