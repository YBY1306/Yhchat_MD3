package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class Bot_data extends GeneratedMessageLite<Bot_data, Builder> implements Bot_dataOrBuilder {
    public static final int AVATAR_ID_FIELD_NUMBER = 5;
    public static final int AVATAR_URL_FIELD_NUMBER = 4;
    public static final int BOT_ID_FIELD_NUMBER = 1;
    public static final int CREATE_BY_FIELD_NUMBER = 7;
    public static final int CREATE_TIME_FIELD_NUMBER = 8;
    private static final Bot_data DEFAULT_INSTANCE;
    public static final int HEADCOUNT_FIELD_NUMBER = 9;
    public static final int INTRODUCTION_FIELD_NUMBER = 6;
    public static final int IS_STOP_FIELD_NUMBER = 11;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NAME_ID_FIELD_NUMBER = 3;
    private static volatile Parser<Bot_data> PARSER = null;
    public static final int PRIVATE_FIELD_NUMBER = 10;
    public static final int SETTING_FIELD_NUMBER = 12;
    private long avatarId_;
    private long createTime_;
    private long headcount_;
    private int isStop_;
    private long nameId_;
    private int private_;
    private String botId_ = "";
    private String name_ = "";
    private String avatarUrl_ = "";
    private String introduction_ = "";
    private String createBy_ = "";
    private String setting_ = "";

    private Bot_data() {
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public String getBotId() {
        return this.botId_;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public ByteString getBotIdBytes() {
        return ByteString.copyFromUtf8(this.botId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBotId(String value) {
        value.getClass();
        this.botId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBotId() {
        this.botId_ = getDefaultInstance().getBotId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBotIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.botId_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public long getNameId() {
        return this.nameId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameId(long value) {
        this.nameId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNameId() {
        this.nameId_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public String getAvatarUrl() {
        return this.avatarUrl_;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public ByteString getAvatarUrlBytes() {
        return ByteString.copyFromUtf8(this.avatarUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarUrl(String value) {
        value.getClass();
        this.avatarUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatarUrl() {
        this.avatarUrl_ = getDefaultInstance().getAvatarUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarUrlBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.avatarUrl_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public long getAvatarId() {
        return this.avatarId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarId(long value) {
        this.avatarId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatarId() {
        this.avatarId_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public String getIntroduction() {
        return this.introduction_;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public ByteString getIntroductionBytes() {
        return ByteString.copyFromUtf8(this.introduction_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroduction(String value) {
        value.getClass();
        this.introduction_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntroduction() {
        this.introduction_ = getDefaultInstance().getIntroduction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroductionBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.introduction_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public String getCreateBy() {
        return this.createBy_;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public ByteString getCreateByBytes() {
        return ByteString.copyFromUtf8(this.createBy_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateBy(String value) {
        value.getClass();
        this.createBy_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateBy() {
        this.createBy_ = getDefaultInstance().getCreateBy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateByBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.createBy_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public long getCreateTime() {
        return this.createTime_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreateTime(long value) {
        this.createTime_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreateTime() {
        this.createTime_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public long getHeadcount() {
        return this.headcount_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadcount(long value) {
        this.headcount_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeadcount() {
        this.headcount_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public int getPrivate() {
        return this.private_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivate(int value) {
        this.private_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivate() {
        this.private_ = 0;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public int getIsStop() {
        return this.isStop_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsStop(int value) {
        this.isStop_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsStop() {
        this.isStop_ = 0;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public String getSetting() {
        return this.setting_;
    }

    @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
    public ByteString getSettingBytes() {
        return ByteString.copyFromUtf8(this.setting_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSetting(String value) {
        value.getClass();
        this.setting_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSetting() {
        this.setting_ = getDefaultInstance().getSetting();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSettingBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.setting_ = value.toStringUtf8();
    }

    public static Bot_data parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Bot_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Bot_data parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Bot_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Bot_data parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Bot_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Bot_data parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Bot_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Bot_data parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Bot_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Bot_data parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Bot_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Bot_data parseFrom(InputStream input) throws IOException {
        return (Bot_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Bot_data parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Bot_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Bot_data parseDelimitedFrom(InputStream input) throws IOException {
        return (Bot_data) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Bot_data parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Bot_data) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Bot_data parseFrom(CodedInputStream input) throws IOException {
        return (Bot_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Bot_data parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Bot_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Bot_data prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Bot_data, Builder> implements Bot_dataOrBuilder {
        private Builder() {
            super(Bot_data.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public String getBotId() {
            return ((Bot_data) this.instance).getBotId();
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public ByteString getBotIdBytes() {
            return ((Bot_data) this.instance).getBotIdBytes();
        }

        public Builder setBotId(String value) {
            copyOnWrite();
            ((Bot_data) this.instance).setBotId(value);
            return this;
        }

        public Builder clearBotId() {
            copyOnWrite();
            ((Bot_data) this.instance).clearBotId();
            return this;
        }

        public Builder setBotIdBytes(ByteString value) {
            copyOnWrite();
            ((Bot_data) this.instance).setBotIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public String getName() {
            return ((Bot_data) this.instance).getName();
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public ByteString getNameBytes() {
            return ((Bot_data) this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            copyOnWrite();
            ((Bot_data) this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((Bot_data) this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            copyOnWrite();
            ((Bot_data) this.instance).setNameBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public long getNameId() {
            return ((Bot_data) this.instance).getNameId();
        }

        public Builder setNameId(long value) {
            copyOnWrite();
            ((Bot_data) this.instance).setNameId(value);
            return this;
        }

        public Builder clearNameId() {
            copyOnWrite();
            ((Bot_data) this.instance).clearNameId();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public String getAvatarUrl() {
            return ((Bot_data) this.instance).getAvatarUrl();
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public ByteString getAvatarUrlBytes() {
            return ((Bot_data) this.instance).getAvatarUrlBytes();
        }

        public Builder setAvatarUrl(String value) {
            copyOnWrite();
            ((Bot_data) this.instance).setAvatarUrl(value);
            return this;
        }

        public Builder clearAvatarUrl() {
            copyOnWrite();
            ((Bot_data) this.instance).clearAvatarUrl();
            return this;
        }

        public Builder setAvatarUrlBytes(ByteString value) {
            copyOnWrite();
            ((Bot_data) this.instance).setAvatarUrlBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public long getAvatarId() {
            return ((Bot_data) this.instance).getAvatarId();
        }

        public Builder setAvatarId(long value) {
            copyOnWrite();
            ((Bot_data) this.instance).setAvatarId(value);
            return this;
        }

        public Builder clearAvatarId() {
            copyOnWrite();
            ((Bot_data) this.instance).clearAvatarId();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public String getIntroduction() {
            return ((Bot_data) this.instance).getIntroduction();
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public ByteString getIntroductionBytes() {
            return ((Bot_data) this.instance).getIntroductionBytes();
        }

        public Builder setIntroduction(String value) {
            copyOnWrite();
            ((Bot_data) this.instance).setIntroduction(value);
            return this;
        }

        public Builder clearIntroduction() {
            copyOnWrite();
            ((Bot_data) this.instance).clearIntroduction();
            return this;
        }

        public Builder setIntroductionBytes(ByteString value) {
            copyOnWrite();
            ((Bot_data) this.instance).setIntroductionBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public String getCreateBy() {
            return ((Bot_data) this.instance).getCreateBy();
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public ByteString getCreateByBytes() {
            return ((Bot_data) this.instance).getCreateByBytes();
        }

        public Builder setCreateBy(String value) {
            copyOnWrite();
            ((Bot_data) this.instance).setCreateBy(value);
            return this;
        }

        public Builder clearCreateBy() {
            copyOnWrite();
            ((Bot_data) this.instance).clearCreateBy();
            return this;
        }

        public Builder setCreateByBytes(ByteString value) {
            copyOnWrite();
            ((Bot_data) this.instance).setCreateByBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public long getCreateTime() {
            return ((Bot_data) this.instance).getCreateTime();
        }

        public Builder setCreateTime(long value) {
            copyOnWrite();
            ((Bot_data) this.instance).setCreateTime(value);
            return this;
        }

        public Builder clearCreateTime() {
            copyOnWrite();
            ((Bot_data) this.instance).clearCreateTime();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public long getHeadcount() {
            return ((Bot_data) this.instance).getHeadcount();
        }

        public Builder setHeadcount(long value) {
            copyOnWrite();
            ((Bot_data) this.instance).setHeadcount(value);
            return this;
        }

        public Builder clearHeadcount() {
            copyOnWrite();
            ((Bot_data) this.instance).clearHeadcount();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public int getPrivate() {
            return ((Bot_data) this.instance).getPrivate();
        }

        public Builder setPrivate(int value) {
            copyOnWrite();
            ((Bot_data) this.instance).setPrivate(value);
            return this;
        }

        public Builder clearPrivate() {
            copyOnWrite();
            ((Bot_data) this.instance).clearPrivate();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public int getIsStop() {
            return ((Bot_data) this.instance).getIsStop();
        }

        public Builder setIsStop(int value) {
            copyOnWrite();
            ((Bot_data) this.instance).setIsStop(value);
            return this;
        }

        public Builder clearIsStop() {
            copyOnWrite();
            ((Bot_data) this.instance).clearIsStop();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public String getSetting() {
            return ((Bot_data) this.instance).getSetting();
        }

        @Override // com.yhchat.canarys.proto.group.Bot_dataOrBuilder
        public ByteString getSettingBytes() {
            return ((Bot_data) this.instance).getSettingBytes();
        }

        public Builder setSetting(String value) {
            copyOnWrite();
            ((Bot_data) this.instance).setSetting(value);
            return this;
        }

        public Builder clearSetting() {
            copyOnWrite();
            ((Bot_data) this.instance).clearSetting();
            return this;
        }

        public Builder setSettingBytes(ByteString value) {
            copyOnWrite();
            ((Bot_data) this.instance).setSettingBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new Bot_data();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"botId_", "name_", "nameId_", "avatarUrl_", "avatarId_", "introduction_", "createBy_", "createTime_", "headcount_", "private_", "isStop_", "setting_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0208\u0005\u0002\u0006\u0208\u0007\u0208\b\u0002\t\u0002\n\u0004\u000b\u0004\f\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Bot_data> parser = PARSER;
                if (parser == null) {
                    synchronized (Bot_data.class) {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    }
                }
                return parser;
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        Bot_data defaultInstance = new Bot_data();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(Bot_data.class, defaultInstance);
    }

    public static Bot_data getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Bot_data> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
