package com.yhchat.canarys.proto.instruction;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes17.dex */
public interface StatusOrBuilder extends MessageLiteOrBuilder {
    long getCode();

    String getMsg();

    ByteString getMsgBytes();

    long getNumber();
}
