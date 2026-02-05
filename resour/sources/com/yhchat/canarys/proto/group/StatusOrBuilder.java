package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes3.dex */
public interface StatusOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    String getMsg();

    ByteString getMsgBytes();

    long getRequestId();
}
