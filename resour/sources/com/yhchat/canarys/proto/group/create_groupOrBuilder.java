package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes3.dex */
public interface create_groupOrBuilder extends MessageLiteOrBuilder {
    String getGroupId();

    ByteString getGroupIdBytes();

    Status getStatus();

    boolean hasStatus();
}
