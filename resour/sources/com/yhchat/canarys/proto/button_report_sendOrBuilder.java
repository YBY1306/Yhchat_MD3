package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes8.dex */
public interface button_report_sendOrBuilder extends MessageLiteOrBuilder {
    String getButtonValue();

    ByteString getButtonValueBytes();

    String getChatId();

    ByteString getChatIdBytes();

    long getChatType();

    String getMsgId();

    ByteString getMsgIdBytes();

    String getUserId();

    ByteString getUserIdBytes();
}
