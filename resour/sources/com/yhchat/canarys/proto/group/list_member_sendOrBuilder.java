package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.group.list_member_send;

/* loaded from: classes3.dex */
public interface list_member_sendOrBuilder extends MessageLiteOrBuilder {
    list_member_send.Data getData();

    String getGroupId();

    ByteString getGroupIdBytes();

    String getKeywords();

    ByteString getKeywordsBytes();

    boolean hasData();
}
