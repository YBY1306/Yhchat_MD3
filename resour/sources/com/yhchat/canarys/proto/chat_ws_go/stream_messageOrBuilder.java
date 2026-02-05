package com.yhchat.canarys.proto.chat_ws_go;

import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.chat_ws_go.stream_message;

/* loaded from: classes10.dex */
public interface stream_messageOrBuilder extends MessageLiteOrBuilder {
    stream_message.Data getData();

    INFO getInfo();

    boolean hasData();

    boolean hasInfo();
}
