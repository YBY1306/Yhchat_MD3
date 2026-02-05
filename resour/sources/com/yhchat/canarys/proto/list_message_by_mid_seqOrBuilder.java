package com.yhchat.canarys.proto;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* loaded from: classes8.dex */
public interface list_message_by_mid_seqOrBuilder extends MessageLiteOrBuilder {
    Msg getMsg(int index);

    int getMsgCount();

    List<Msg> getMsgList();

    Status getStatus();

    int getTotal();

    boolean hasStatus();
}
