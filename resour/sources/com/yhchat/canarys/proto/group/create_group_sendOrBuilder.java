package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes3.dex */
public interface create_group_sendOrBuilder extends MessageLiteOrBuilder {
    String getAvatarUrl();

    ByteString getAvatarUrlBytes();

    String getCategory();

    ByteString getCategoryBytes();

    int getCategoryId();

    String getIntroduction();

    ByteString getIntroductionBytes();

    String getName();

    ByteString getNameBytes();
}
