package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes8.dex */
public interface recall_msg_sendOrBuilder extends MessageLiteOrBuilder {
    String getChatId();

    ByteString getChatIdBytes();

    long getChatType();

    String getMsgId();

    ByteString getMsgIdBytes();
}
