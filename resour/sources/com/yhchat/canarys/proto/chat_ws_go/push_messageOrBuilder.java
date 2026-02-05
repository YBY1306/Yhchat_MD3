package com.yhchat.canarys.proto.chat_ws_go;

import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.chat_ws_go.push_message;

/* loaded from: classes10.dex */
public interface push_messageOrBuilder extends MessageLiteOrBuilder {
    push_message.PushData getData();

    INFO getInfo();

    boolean hasData();

    boolean hasInfo();
}
