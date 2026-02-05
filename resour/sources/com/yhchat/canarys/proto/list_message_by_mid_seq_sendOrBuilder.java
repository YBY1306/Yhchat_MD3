package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes8.dex */
public interface list_message_by_mid_seq_sendOrBuilder extends MessageLiteOrBuilder {
    String getChatId();

    ByteString getChatIdBytes();

    long getChatType();

    long getMsgCount();

    String getMsgId();

    ByteString getMsgIdBytes();

    long getMsgSeq();

    long getUnknown();
}
