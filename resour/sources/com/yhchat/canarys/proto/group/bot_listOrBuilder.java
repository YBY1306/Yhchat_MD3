package com.yhchat.canarys.proto.group;

import com.google.protobuf.MessageLiteOrBuilder;
import com.yhchat.canarys.proto.group.bot_list;
import java.util.List;

/* loaded from: classes3.dex */
public interface bot_listOrBuilder extends MessageLiteOrBuilder {
    Bot_data getBot(int index);

    int getBotCount();

    List<Bot_data> getBotList();

    bot_list.Instruction_data getInstruction(int index);

    int getInstructionCount();

    List<bot_list.Instruction_data> getInstructionList();

    bot_list.Menu_data getMenu(int index);

    int getMenuCount();

    List<bot_list.Menu_data> getMenuList();

    Status getStatus();

    boolean hasStatus();
}
