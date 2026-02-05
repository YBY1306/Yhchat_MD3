package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.group.User;

/* loaded from: classes3.dex */
public interface UserOrBuilder extends MessageLiteOrBuilder {
    long getGagTime();

    String getGroupId();

    ByteString getGroupIdBytes();

    int getIsGag();

    int getPermissionLevel();

    User.User_info getUserInfo();

    boolean hasUserInfo();
}
