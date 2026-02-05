package com.yhchat.canarys.proto.group;

import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.group.info;
import java.util.List;

/* loaded from: classes3.dex */
public interface infoOrBuilder extends MessageLiteOrBuilder {
    info.Group_data getData();

    Bot_data getHistoryBot(int index);

    int getHistoryBotCount();

    List<Bot_data> getHistoryBotList();

    Status getStatus();

    boolean hasData();

    boolean hasStatus();
}
