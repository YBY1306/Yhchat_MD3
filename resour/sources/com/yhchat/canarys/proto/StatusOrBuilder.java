package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes8.dex */
public interface StatusOrBuilder extends MessageLiteOrBuilder {
    int getCode();

    String getMsg();

    ByteString getMsgBytes();

    long getNumber();
}
