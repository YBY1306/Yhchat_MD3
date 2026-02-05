package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.group.tag_member_send;

/* loaded from: classes3.dex */
public interface tag_member_sendOrBuilder extends MessageLiteOrBuilder {
    tag_member_send.Data getData();

    String getGroupId();

    ByteString getGroupIdBytes();

    long getTagId();

    boolean hasData();
}
