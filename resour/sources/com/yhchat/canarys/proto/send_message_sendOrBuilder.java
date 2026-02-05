package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.send_message_send;

/* loaded from: classes8.dex */
public interface send_message_sendOrBuilder extends MessageLiteOrBuilder {
    String getChatId();

    ByteString getChatIdBytes();

    long getChatType();

    long getCommandId();

    send_message_send.Content getContent();

    long getContentType();

    send_message_send.Media getMedia();

    String getMsgId();

    ByteString getMsgIdBytes();

    String getQuoteMsgId();

    ByteString getQuoteMsgIdBytes();

    boolean hasContent();

    boolean hasMedia();
}
