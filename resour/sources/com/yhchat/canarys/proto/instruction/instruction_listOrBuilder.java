package com.yhchat.canarys.proto.instruction;

import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.instruction.instruction_list;
import java.util.List;

/* loaded from: classes17.dex */
public interface instruction_listOrBuilder extends MessageLiteOrBuilder {
    instruction_list.Data getData(int index);

    int getDataCount();

    List<instruction_list.Data> getDataList();

    Status getStatus();

    boolean hasStatus();
}
