package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.edit_message_send;

/* loaded from: classes8.dex */
public interface edit_message_sendOrBuilder extends MessageLiteOrBuilder {
    String getChatId();

    ByteString getChatIdBytes();

    int getChatType();

    edit_message_send.Content getContent();

    long getContentType();

    String getMsgId();

    ByteString getMsgIdBytes();

    String getQuoteMsgId();

    ByteString getQuoteMsgIdBytes();

    boolean hasContent();
}
