package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;

/* loaded from: classes3.dex */
public interface Bot_dataOrBuilder extends MessageLiteOrBuilder {
    long getAvatarId();

    String getAvatarUrl();

    ByteString getAvatarUrlBytes();

    String getBotId();

    ByteString getBotIdBytes();

    String getCreateBy();

    ByteString getCreateByBytes();

    long getCreateTime();

    long getHeadcount();

    String getIntroduction();

    ByteString getIntroductionBytes();

    int getIsStop();

    String getName();

    ByteString getNameBytes();

    long getNameId();

    int getPrivate();

    String getSetting();

    ByteString getSettingBytes();
}
