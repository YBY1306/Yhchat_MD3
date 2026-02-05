package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: classes8.dex */
public interface recall_msg_batch_sendOrBuilder extends MessageLiteOrBuilder {
    String getChatId();

    ByteString getChatIdBytes();

    long getChatType();

    String getMsgId(int index);

    ByteString getMsgIdBytes(int index);

    int getMsgIdCount();

    List<String> getMsgIdList();
}
