package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.Msg;

/* loaded from: classes8.dex */
public interface MsgOrBuilder extends MessageLiteOrBuilder {
    Msg.Cmd getCmd();

    Msg.Content getContent();

    int getContentType();

    String getDirection();

    ByteString getDirectionBytes();

    long getEditTime();

    long getMsgDeleteTime();

    String getMsgId();

    ByteString getMsgIdBytes();

    long getMsgSeq();

    String getQuoteMsgId();

    ByteString getQuoteMsgIdBytes();

    long getSendTime();

    Msg.Sender getSender();

    boolean hasCmd();

    boolean hasContent();

    boolean hasSender();
}
