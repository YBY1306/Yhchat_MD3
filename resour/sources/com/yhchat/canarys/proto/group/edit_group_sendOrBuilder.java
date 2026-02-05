package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes3.dex */
public interface edit_group_sendOrBuilder extends MessageLiteOrBuilder {
    String getAvatarUrl();

    ByteString getAvatarUrlBytes();

    long getCategoryId();

    String getCategoryName();

    ByteString getCategoryNameBytes();

    int getDirectJoin();

    String getGroupId();

    ByteString getGroupIdBytes();

    long getHideGroupMembers();

    int getHistoryMsg();

    String getIntroduction();

    ByteString getIntroductionBytes();

    String getName();

    ByteString getNameBytes();

    int getPrivate();
}
