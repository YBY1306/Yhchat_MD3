package com.yhchat.canarys.proto.group;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: classes3.dex */
public interface tag_memberOrBuilder extends MessageLiteOrBuilder {
    Status getStatus();

    long getTotal();

    User getUser(int index);

    int getUserCount();

    List<User> getUserList();

    boolean hasStatus();
}
