package com.yhchat.canarys.proto.bot;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class Bot {

    public interface StatusOrBuilder extends MessageLiteOrBuilder {
        int getCode();

        String getMsg();

        ByteString getMsgBytes();

        long getRequestId();
    }

    public interface boardOrBuilder extends MessageLiteOrBuilder {
        board.Board_data getBoard(int index);

        int getBoardCount();

        List<board.Board_data> getBoardList();

        Status getStatus();

        boolean hasStatus();
    }

    public interface board_sendOrBuilder extends MessageLiteOrBuilder {
        String getChatId();

        ByteString getChatIdBytes();

        long getChatType();
    }

    public interface bot_infoOrBuilder extends MessageLiteOrBuilder {
        bot_info.Bot_data getData();

        Status getStatus();

        boolean hasData();

        boolean hasStatus();
    }

    public interface bot_info_sendOrBuilder extends MessageLiteOrBuilder {
        String getId();

        ByteString getIdBytes();
    }

    public interface bot_stop_sendOrBuilder extends MessageLiteOrBuilder {
        String getBotId();

        ByteString getBotIdBytes();

        int getOperation();
    }

    public interface create_botOrBuilder extends MessageLiteOrBuilder {
        create_bot.BotData getData();

        Status getStatus();

        boolean hasData();

        boolean hasStatus();
    }

    public interface create_bot_sendOrBuilder extends MessageLiteOrBuilder {
        String getAvatarUrl();

        ByteString getAvatarUrlBytes();

        String getIntroduction();

        ByteString getIntroductionBytes();

        String getName();

        ByteString getNameBytes();

        int getPrivate();
    }

    private Bot() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class Status extends GeneratedMessageLite<Status, Builder> implements StatusOrBuilder {
        public static final int CODE_FIELD_NUMBER = 2;
        private static final Status DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 3;
        private static volatile Parser<Status> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 1;
        private int code_;
        private String msg_ = "";
        private long requestId_;

        private Status() {
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.StatusOrBuilder
        public long getRequestId() {
            return this.requestId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestId(long value) {
            this.requestId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestId() {
            this.requestId_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.StatusOrBuilder
        public int getCode() {
            return this.code_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int value) {
            this.code_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.StatusOrBuilder
        public String getMsg() {
            return this.msg_;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.StatusOrBuilder
        public ByteString getMsgBytes() {
            return ByteString.copyFromUtf8(this.msg_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(String value) {
            value.getClass();
            this.msg_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = getDefaultInstance().getMsg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.msg_ = value.toStringUtf8();
        }

        public static Status parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Status parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Status parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Status parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Status parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Status parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Status parseFrom(InputStream input) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Status parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Status parseDelimitedFrom(InputStream input) throws IOException {
            return (Status) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Status parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Status) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Status parseFrom(CodedInputStream input) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Status parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Status prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Status, Builder> implements StatusOrBuilder {
            private Builder() {
                super(Status.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.StatusOrBuilder
            public long getRequestId() {
                return ((Status) this.instance).getRequestId();
            }

            public Builder setRequestId(long value) {
                copyOnWrite();
                ((Status) this.instance).setRequestId(value);
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((Status) this.instance).clearRequestId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.StatusOrBuilder
            public int getCode() {
                return ((Status) this.instance).getCode();
            }

            public Builder setCode(int value) {
                copyOnWrite();
                ((Status) this.instance).setCode(value);
                return this;
            }

            public Builder clearCode() {
                copyOnWrite();
                ((Status) this.instance).clearCode();
                return this;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.StatusOrBuilder
            public String getMsg() {
                return ((Status) this.instance).getMsg();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.StatusOrBuilder
            public ByteString getMsgBytes() {
                return ((Status) this.instance).getMsgBytes();
            }

            public Builder setMsg(String value) {
                copyOnWrite();
                ((Status) this.instance).setMsg(value);
                return this;
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((Status) this.instance).clearMsg();
                return this;
            }

            public Builder setMsgBytes(ByteString value) {
                copyOnWrite();
                ((Status) this.instance).setMsgBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Status();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"requestId_", "code_", "msg_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Status> parser = PARSER;
                    if (parser == null) {
                        synchronized (Status.class) {
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
            Status defaultInstance = new Status();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Status.class, defaultInstance);
        }

        public static Status getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Status> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class bot_info_send extends GeneratedMessageLite<bot_info_send, Builder> implements bot_info_sendOrBuilder {
        private static final bot_info_send DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 2;
        private static volatile Parser<bot_info_send> PARSER;
        private String id_ = "";

        private bot_info_send() {
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.bot_info_sendOrBuilder
        public String getId() {
            return this.id_;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.bot_info_sendOrBuilder
        public ByteString getIdBytes() {
            return ByteString.copyFromUtf8(this.id_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setId(String value) {
            value.getClass();
            this.id_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearId() {
            this.id_ = getDefaultInstance().getId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.id_ = value.toStringUtf8();
        }

        public static bot_info_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (bot_info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static bot_info_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (bot_info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static bot_info_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (bot_info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static bot_info_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (bot_info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static bot_info_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (bot_info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static bot_info_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (bot_info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static bot_info_send parseFrom(InputStream input) throws IOException {
            return (bot_info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static bot_info_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (bot_info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static bot_info_send parseDelimitedFrom(InputStream input) throws IOException {
            return (bot_info_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static bot_info_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (bot_info_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static bot_info_send parseFrom(CodedInputStream input) throws IOException {
            return (bot_info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static bot_info_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (bot_info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(bot_info_send prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<bot_info_send, Builder> implements bot_info_sendOrBuilder {
            private Builder() {
                super(bot_info_send.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info_sendOrBuilder
            public String getId() {
                return ((bot_info_send) this.instance).getId();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info_sendOrBuilder
            public ByteString getIdBytes() {
                return ((bot_info_send) this.instance).getIdBytes();
            }

            public Builder setId(String value) {
                copyOnWrite();
                ((bot_info_send) this.instance).setId(value);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((bot_info_send) this.instance).clearId();
                return this;
            }

            public Builder setIdBytes(ByteString value) {
                copyOnWrite();
                ((bot_info_send) this.instance).setIdBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new bot_info_send();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"id_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<bot_info_send> parser = PARSER;
                    if (parser == null) {
                        synchronized (bot_info_send.class) {
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
            bot_info_send defaultInstance = new bot_info_send();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(bot_info_send.class, defaultInstance);
        }

        public static bot_info_send getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<bot_info_send> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class bot_info extends GeneratedMessageLite<bot_info, Builder> implements bot_infoOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final bot_info DEFAULT_INSTANCE;
        private static volatile Parser<bot_info> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private Bot_data data_;
        private Status status_;

        public interface Bot_dataOrBuilder extends MessageLiteOrBuilder {
            int getAlwaysAgree();

            long getAvatarId();

            String getAvatarUrl();

            ByteString getAvatarUrlBytes();

            String getBotId();

            ByteString getBotIdBytes();

            String getCreateBy();

            ByteString getCreateByBytes();

            long getCreateTime();

            int getDoNotDisturb();

            int getGroupLimit();

            long getHeadcount();

            String getIntroduction();

            ByteString getIntroductionBytes();

            int getIsStop();

            String getName();

            ByteString getNameBytes();

            long getNameId();

            int getNoDetele();

            int getPrivate();

            int getTop();
        }

        private bot_info() {
        }

        public static final class Bot_data extends GeneratedMessageLite<Bot_data, Builder> implements Bot_dataOrBuilder {
            public static final int ALWAYS_AGREE_FIELD_NUMBER = 13;
            public static final int AVATAR_ID_FIELD_NUMBER = 5;
            public static final int AVATAR_URL_FIELD_NUMBER = 4;
            public static final int BOT_ID_FIELD_NUMBER = 1;
            public static final int CREATE_BY_FIELD_NUMBER = 7;
            public static final int CREATE_TIME_FIELD_NUMBER = 8;
            private static final Bot_data DEFAULT_INSTANCE;
            public static final int DO_NOT_DISTURB_FIELD_NUMBER = 15;
            public static final int GROUP_LIMIT_FIELD_NUMBER = 20;
            public static final int HEADCOUNT_FIELD_NUMBER = 9;
            public static final int INTRODUCTION_FIELD_NUMBER = 6;
            public static final int IS_STOP_FIELD_NUMBER = 11;
            public static final int NAME_FIELD_NUMBER = 2;
            public static final int NAME_ID_FIELD_NUMBER = 3;
            public static final int NO_DETELE_FIELD_NUMBER = 14;
            private static volatile Parser<Bot_data> PARSER = null;
            public static final int PRIVATE_FIELD_NUMBER = 10;
            public static final int TOP_FIELD_NUMBER = 18;
            private int alwaysAgree_;
            private long avatarId_;
            private long createTime_;
            private int doNotDisturb_;
            private int groupLimit_;
            private long headcount_;
            private int isStop_;
            private long nameId_;
            private int noDetele_;
            private int private_;
            private int top_;
            private String botId_ = "";
            private String name_ = "";
            private String avatarUrl_ = "";
            private String introduction_ = "";
            private String createBy_ = "";

            private Bot_data() {
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
            public String getBotId() {
                return this.botId_;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
            public String getName() {
                return this.name_;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
            public String getAvatarUrl() {
                return this.avatarUrl_;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
            public String getIntroduction() {
                return this.introduction_;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
            public String getCreateBy() {
                return this.createBy_;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
            public int getAlwaysAgree() {
                return this.alwaysAgree_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAlwaysAgree(int value) {
                this.alwaysAgree_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAlwaysAgree() {
                this.alwaysAgree_ = 0;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
            public int getNoDetele() {
                return this.noDetele_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNoDetele(int value) {
                this.noDetele_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearNoDetele() {
                this.noDetele_ = 0;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
            public int getDoNotDisturb() {
                return this.doNotDisturb_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDoNotDisturb(int value) {
                this.doNotDisturb_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDoNotDisturb() {
                this.doNotDisturb_ = 0;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
            public int getTop() {
                return this.top_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTop(int value) {
                this.top_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTop() {
                this.top_ = 0;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
            public int getGroupLimit() {
                return this.groupLimit_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setGroupLimit(int value) {
                this.groupLimit_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearGroupLimit() {
                this.groupLimit_ = 0;
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
                public String getBotId() {
                    return ((Bot_data) this.instance).getBotId();
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
                public String getName() {
                    return ((Bot_data) this.instance).getName();
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
                public String getAvatarUrl() {
                    return ((Bot_data) this.instance).getAvatarUrl();
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
                public String getIntroduction() {
                    return ((Bot_data) this.instance).getIntroduction();
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
                public String getCreateBy() {
                    return ((Bot_data) this.instance).getCreateBy();
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
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

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
                public int getAlwaysAgree() {
                    return ((Bot_data) this.instance).getAlwaysAgree();
                }

                public Builder setAlwaysAgree(int value) {
                    copyOnWrite();
                    ((Bot_data) this.instance).setAlwaysAgree(value);
                    return this;
                }

                public Builder clearAlwaysAgree() {
                    copyOnWrite();
                    ((Bot_data) this.instance).clearAlwaysAgree();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
                public int getNoDetele() {
                    return ((Bot_data) this.instance).getNoDetele();
                }

                public Builder setNoDetele(int value) {
                    copyOnWrite();
                    ((Bot_data) this.instance).setNoDetele(value);
                    return this;
                }

                public Builder clearNoDetele() {
                    copyOnWrite();
                    ((Bot_data) this.instance).clearNoDetele();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
                public int getDoNotDisturb() {
                    return ((Bot_data) this.instance).getDoNotDisturb();
                }

                public Builder setDoNotDisturb(int value) {
                    copyOnWrite();
                    ((Bot_data) this.instance).setDoNotDisturb(value);
                    return this;
                }

                public Builder clearDoNotDisturb() {
                    copyOnWrite();
                    ((Bot_data) this.instance).clearDoNotDisturb();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
                public int getTop() {
                    return ((Bot_data) this.instance).getTop();
                }

                public Builder setTop(int value) {
                    copyOnWrite();
                    ((Bot_data) this.instance).setTop(value);
                    return this;
                }

                public Builder clearTop() {
                    copyOnWrite();
                    ((Bot_data) this.instance).clearTop();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.bot_info.Bot_dataOrBuilder
                public int getGroupLimit() {
                    return ((Bot_data) this.instance).getGroupLimit();
                }

                public Builder setGroupLimit(int value) {
                    copyOnWrite();
                    ((Bot_data) this.instance).setGroupLimit(value);
                    return this;
                }

                public Builder clearGroupLimit() {
                    copyOnWrite();
                    ((Bot_data) this.instance).clearGroupLimit();
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
                        Object[] objects = {"botId_", "name_", "nameId_", "avatarUrl_", "avatarId_", "introduction_", "createBy_", "createTime_", "headcount_", "private_", "isStop_", "alwaysAgree_", "noDetele_", "doNotDisturb_", "top_", "groupLimit_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0000\u0001\u0014\u0010\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0002\u0004\u0208\u0005\u0002\u0006\u0208\u0007\u0208\b\u0002\t\u0002\n\u0004\u000b\u0004\r\u0004\u000e\u0004\u000f\u0004\u0012\u0004\u0014\u0004", objects);
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

        @Override // com.yhchat.canarys.proto.bot.Bot.bot_infoOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.bot_infoOrBuilder
        public Status getStatus() {
            return this.status_ == null ? Status.getDefaultInstance() : this.status_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status value) {
            value.getClass();
            this.status_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStatus(Status value) {
            value.getClass();
            if (this.status_ != null && this.status_ != Status.getDefaultInstance()) {
                this.status_ = Status.newBuilder(this.status_).mergeFrom((Status.Builder) value).buildPartial();
            } else {
                this.status_ = value;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = null;
            this.bitField0_ &= -2;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.bot_infoOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.bot_infoOrBuilder
        public Bot_data getData() {
            return this.data_ == null ? Bot_data.getDefaultInstance() : this.data_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(Bot_data value) {
            value.getClass();
            this.data_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData(Bot_data value) {
            value.getClass();
            if (this.data_ != null && this.data_ != Bot_data.getDefaultInstance()) {
                this.data_ = Bot_data.newBuilder(this.data_).mergeFrom((Bot_data.Builder) value).buildPartial();
            } else {
                this.data_ = value;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = null;
            this.bitField0_ &= -3;
        }

        public static bot_info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (bot_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static bot_info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (bot_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static bot_info parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (bot_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static bot_info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (bot_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static bot_info parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (bot_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static bot_info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (bot_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static bot_info parseFrom(InputStream input) throws IOException {
            return (bot_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static bot_info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (bot_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static bot_info parseDelimitedFrom(InputStream input) throws IOException {
            return (bot_info) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static bot_info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (bot_info) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static bot_info parseFrom(CodedInputStream input) throws IOException {
            return (bot_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static bot_info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (bot_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(bot_info prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<bot_info, Builder> implements bot_infoOrBuilder {
            private Builder() {
                super(bot_info.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_infoOrBuilder
            public boolean hasStatus() {
                return ((bot_info) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_infoOrBuilder
            public Status getStatus() {
                return ((bot_info) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((bot_info) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((bot_info) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((bot_info) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((bot_info) this.instance).clearStatus();
                return this;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_infoOrBuilder
            public boolean hasData() {
                return ((bot_info) this.instance).hasData();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_infoOrBuilder
            public Bot_data getData() {
                return ((bot_info) this.instance).getData();
            }

            public Builder setData(Bot_data value) {
                copyOnWrite();
                ((bot_info) this.instance).setData(value);
                return this;
            }

            public Builder setData(Bot_data.Builder builderForValue) {
                copyOnWrite();
                ((bot_info) this.instance).setData(builderForValue.build());
                return this;
            }

            public Builder mergeData(Bot_data value) {
                copyOnWrite();
                ((bot_info) this.instance).mergeData(value);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((bot_info) this.instance).clearData();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new bot_info();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_", "data_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<bot_info> parser = PARSER;
                    if (parser == null) {
                        synchronized (bot_info.class) {
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
            bot_info defaultInstance = new bot_info();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(bot_info.class, defaultInstance);
        }

        public static bot_info getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<bot_info> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class board_send extends GeneratedMessageLite<board_send, Builder> implements board_sendOrBuilder {
        public static final int CHAT_ID_FIELD_NUMBER = 3;
        public static final int CHAT_TYPE_FIELD_NUMBER = 4;
        private static final board_send DEFAULT_INSTANCE;
        private static volatile Parser<board_send> PARSER;
        private String chatId_ = "";
        private long chatType_;

        private board_send() {
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.board_sendOrBuilder
        public String getChatId() {
            return this.chatId_;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.board_sendOrBuilder
        public ByteString getChatIdBytes() {
            return ByteString.copyFromUtf8(this.chatId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatId(String value) {
            value.getClass();
            this.chatId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatId() {
            this.chatId_ = getDefaultInstance().getChatId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.chatId_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.board_sendOrBuilder
        public long getChatType() {
            return this.chatType_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChatType(long value) {
            this.chatType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChatType() {
            this.chatType_ = 0L;
        }

        public static board_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (board_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static board_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (board_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static board_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (board_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static board_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (board_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static board_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (board_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static board_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (board_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static board_send parseFrom(InputStream input) throws IOException {
            return (board_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static board_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (board_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static board_send parseDelimitedFrom(InputStream input) throws IOException {
            return (board_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static board_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (board_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static board_send parseFrom(CodedInputStream input) throws IOException {
            return (board_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static board_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (board_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(board_send prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<board_send, Builder> implements board_sendOrBuilder {
            private Builder() {
                super(board_send.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board_sendOrBuilder
            public String getChatId() {
                return ((board_send) this.instance).getChatId();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board_sendOrBuilder
            public ByteString getChatIdBytes() {
                return ((board_send) this.instance).getChatIdBytes();
            }

            public Builder setChatId(String value) {
                copyOnWrite();
                ((board_send) this.instance).setChatId(value);
                return this;
            }

            public Builder clearChatId() {
                copyOnWrite();
                ((board_send) this.instance).clearChatId();
                return this;
            }

            public Builder setChatIdBytes(ByteString value) {
                copyOnWrite();
                ((board_send) this.instance).setChatIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board_sendOrBuilder
            public long getChatType() {
                return ((board_send) this.instance).getChatType();
            }

            public Builder setChatType(long value) {
                copyOnWrite();
                ((board_send) this.instance).setChatType(value);
                return this;
            }

            public Builder clearChatType() {
                copyOnWrite();
                ((board_send) this.instance).clearChatType();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new board_send();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"chatId_", "chatType_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0003\u0004\u0002\u0000\u0000\u0000\u0003\u0208\u0004\u0002", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<board_send> parser = PARSER;
                    if (parser == null) {
                        synchronized (board_send.class) {
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
            board_send defaultInstance = new board_send();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(board_send.class, defaultInstance);
        }

        public static board_send getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<board_send> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class board extends GeneratedMessageLite<board, Builder> implements boardOrBuilder {
        public static final int BOARD_FIELD_NUMBER = 2;
        private static final board DEFAULT_INSTANCE;
        private static volatile Parser<board> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private Internal.ProtobufList<Board_data> board_ = emptyProtobufList();
        private Status status_;

        public interface Board_dataOrBuilder extends MessageLiteOrBuilder {
            String getBotId();

            ByteString getBotIdBytes();

            String getBotName();

            ByteString getBotNameBytes();

            String getChatId();

            ByteString getChatIdBytes();

            int getChatType();

            String getContent();

            ByteString getContentBytes();

            int getContentType();

            long getLastUpdateTime();
        }

        private board() {
        }

        public static final class Board_data extends GeneratedMessageLite<Board_data, Builder> implements Board_dataOrBuilder {
            public static final int BOT_ID_FIELD_NUMBER = 1;
            public static final int BOT_NAME_FIELD_NUMBER = 7;
            public static final int CHAT_ID_FIELD_NUMBER = 2;
            public static final int CHAT_TYPE_FIELD_NUMBER = 3;
            public static final int CONTENT_FIELD_NUMBER = 4;
            public static final int CONTENT_TYPE_FIELD_NUMBER = 5;
            private static final Board_data DEFAULT_INSTANCE;
            public static final int LAST_UPDATE_TIME_FIELD_NUMBER = 6;
            private static volatile Parser<Board_data> PARSER;
            private int chatType_;
            private int contentType_;
            private long lastUpdateTime_;
            private String botId_ = "";
            private String chatId_ = "";
            private String content_ = "";
            private String botName_ = "";

            private Board_data() {
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
            public String getBotId() {
                return this.botId_;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
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

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
            public String getChatId() {
                return this.chatId_;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
            public ByteString getChatIdBytes() {
                return ByteString.copyFromUtf8(this.chatId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChatId(String value) {
                value.getClass();
                this.chatId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearChatId() {
                this.chatId_ = getDefaultInstance().getChatId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChatIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.chatId_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
            public int getChatType() {
                return this.chatType_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChatType(int value) {
                this.chatType_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearChatType() {
                this.chatType_ = 0;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
            public String getContent() {
                return this.content_;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
            public ByteString getContentBytes() {
                return ByteString.copyFromUtf8(this.content_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContent(String value) {
                value.getClass();
                this.content_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContent() {
                this.content_ = getDefaultInstance().getContent();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContentBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.content_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
            public int getContentType() {
                return this.contentType_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContentType(int value) {
                this.contentType_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContentType() {
                this.contentType_ = 0;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
            public long getLastUpdateTime() {
                return this.lastUpdateTime_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLastUpdateTime(long value) {
                this.lastUpdateTime_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLastUpdateTime() {
                this.lastUpdateTime_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
            public String getBotName() {
                return this.botName_;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
            public ByteString getBotNameBytes() {
                return ByteString.copyFromUtf8(this.botName_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBotName(String value) {
                value.getClass();
                this.botName_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearBotName() {
                this.botName_ = getDefaultInstance().getBotName();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setBotNameBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.botName_ = value.toStringUtf8();
            }

            public static Board_data parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Board_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Board_data parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Board_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Board_data parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Board_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Board_data parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Board_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Board_data parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Board_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Board_data parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Board_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Board_data parseFrom(InputStream input) throws IOException {
                return (Board_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Board_data parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Board_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Board_data parseDelimitedFrom(InputStream input) throws IOException {
                return (Board_data) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Board_data parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Board_data) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Board_data parseFrom(CodedInputStream input) throws IOException {
                return (Board_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Board_data parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Board_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Board_data prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Board_data, Builder> implements Board_dataOrBuilder {
                private Builder() {
                    super(Board_data.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public String getBotId() {
                    return ((Board_data) this.instance).getBotId();
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public ByteString getBotIdBytes() {
                    return ((Board_data) this.instance).getBotIdBytes();
                }

                public Builder setBotId(String value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setBotId(value);
                    return this;
                }

                public Builder clearBotId() {
                    copyOnWrite();
                    ((Board_data) this.instance).clearBotId();
                    return this;
                }

                public Builder setBotIdBytes(ByteString value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setBotIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public String getChatId() {
                    return ((Board_data) this.instance).getChatId();
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public ByteString getChatIdBytes() {
                    return ((Board_data) this.instance).getChatIdBytes();
                }

                public Builder setChatId(String value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setChatId(value);
                    return this;
                }

                public Builder clearChatId() {
                    copyOnWrite();
                    ((Board_data) this.instance).clearChatId();
                    return this;
                }

                public Builder setChatIdBytes(ByteString value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setChatIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public int getChatType() {
                    return ((Board_data) this.instance).getChatType();
                }

                public Builder setChatType(int value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setChatType(value);
                    return this;
                }

                public Builder clearChatType() {
                    copyOnWrite();
                    ((Board_data) this.instance).clearChatType();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public String getContent() {
                    return ((Board_data) this.instance).getContent();
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public ByteString getContentBytes() {
                    return ((Board_data) this.instance).getContentBytes();
                }

                public Builder setContent(String value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setContent(value);
                    return this;
                }

                public Builder clearContent() {
                    copyOnWrite();
                    ((Board_data) this.instance).clearContent();
                    return this;
                }

                public Builder setContentBytes(ByteString value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setContentBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public int getContentType() {
                    return ((Board_data) this.instance).getContentType();
                }

                public Builder setContentType(int value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setContentType(value);
                    return this;
                }

                public Builder clearContentType() {
                    copyOnWrite();
                    ((Board_data) this.instance).clearContentType();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public long getLastUpdateTime() {
                    return ((Board_data) this.instance).getLastUpdateTime();
                }

                public Builder setLastUpdateTime(long value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setLastUpdateTime(value);
                    return this;
                }

                public Builder clearLastUpdateTime() {
                    copyOnWrite();
                    ((Board_data) this.instance).clearLastUpdateTime();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public String getBotName() {
                    return ((Board_data) this.instance).getBotName();
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.board.Board_dataOrBuilder
                public ByteString getBotNameBytes() {
                    return ((Board_data) this.instance).getBotNameBytes();
                }

                public Builder setBotName(String value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setBotName(value);
                    return this;
                }

                public Builder clearBotName() {
                    copyOnWrite();
                    ((Board_data) this.instance).clearBotName();
                    return this;
                }

                public Builder setBotNameBytes(ByteString value) {
                    copyOnWrite();
                    ((Board_data) this.instance).setBotNameBytes(value);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Board_data();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"botId_", "chatId_", "chatType_", "content_", "contentType_", "lastUpdateTime_", "botName_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0004\u0004\u0208\u0005\u0004\u0006\u0002\u0007\u0208", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Board_data> parser = PARSER;
                        if (parser == null) {
                            synchronized (Board_data.class) {
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
                Board_data defaultInstance = new Board_data();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Board_data.class, defaultInstance);
            }

            public static Board_data getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Board_data> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.boardOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.boardOrBuilder
        public Status getStatus() {
            return this.status_ == null ? Status.getDefaultInstance() : this.status_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status value) {
            value.getClass();
            this.status_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStatus(Status value) {
            value.getClass();
            if (this.status_ != null && this.status_ != Status.getDefaultInstance()) {
                this.status_ = Status.newBuilder(this.status_).mergeFrom((Status.Builder) value).buildPartial();
            } else {
                this.status_ = value;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = null;
            this.bitField0_ &= -2;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.boardOrBuilder
        public List<Board_data> getBoardList() {
            return this.board_;
        }

        public List<? extends Board_dataOrBuilder> getBoardOrBuilderList() {
            return this.board_;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.boardOrBuilder
        public int getBoardCount() {
            return this.board_.size();
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.boardOrBuilder
        public Board_data getBoard(int index) {
            return this.board_.get(index);
        }

        public Board_dataOrBuilder getBoardOrBuilder(int index) {
            return this.board_.get(index);
        }

        private void ensureBoardIsMutable() {
            Internal.ProtobufList<Board_data> tmp = this.board_;
            if (!tmp.isModifiable()) {
                this.board_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoard(int index, Board_data value) {
            value.getClass();
            ensureBoardIsMutable();
            this.board_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBoard(Board_data value) {
            value.getClass();
            ensureBoardIsMutable();
            this.board_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBoard(int index, Board_data value) {
            value.getClass();
            ensureBoardIsMutable();
            this.board_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBoard(Iterable<? extends Board_data> values) {
            ensureBoardIsMutable();
            AbstractMessageLite.addAll(values, this.board_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoard() {
            this.board_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeBoard(int index) {
            ensureBoardIsMutable();
            this.board_.remove(index);
        }

        public static board parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (board) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static board parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (board) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static board parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (board) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static board parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (board) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static board parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (board) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static board parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (board) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static board parseFrom(InputStream input) throws IOException {
            return (board) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static board parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (board) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static board parseDelimitedFrom(InputStream input) throws IOException {
            return (board) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static board parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (board) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static board parseFrom(CodedInputStream input) throws IOException {
            return (board) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static board parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (board) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(board prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<board, Builder> implements boardOrBuilder {
            private Builder() {
                super(board.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.boardOrBuilder
            public boolean hasStatus() {
                return ((board) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.boardOrBuilder
            public Status getStatus() {
                return ((board) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((board) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((board) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((board) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((board) this.instance).clearStatus();
                return this;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.boardOrBuilder
            public List<Board_data> getBoardList() {
                return Collections.unmodifiableList(((board) this.instance).getBoardList());
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.boardOrBuilder
            public int getBoardCount() {
                return ((board) this.instance).getBoardCount();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.boardOrBuilder
            public Board_data getBoard(int index) {
                return ((board) this.instance).getBoard(index);
            }

            public Builder setBoard(int index, Board_data value) {
                copyOnWrite();
                ((board) this.instance).setBoard(index, value);
                return this;
            }

            public Builder setBoard(int index, Board_data.Builder builderForValue) {
                copyOnWrite();
                ((board) this.instance).setBoard(index, builderForValue.build());
                return this;
            }

            public Builder addBoard(Board_data value) {
                copyOnWrite();
                ((board) this.instance).addBoard(value);
                return this;
            }

            public Builder addBoard(int index, Board_data value) {
                copyOnWrite();
                ((board) this.instance).addBoard(index, value);
                return this;
            }

            public Builder addBoard(Board_data.Builder builderForValue) {
                copyOnWrite();
                ((board) this.instance).addBoard(builderForValue.build());
                return this;
            }

            public Builder addBoard(int index, Board_data.Builder builderForValue) {
                copyOnWrite();
                ((board) this.instance).addBoard(index, builderForValue.build());
                return this;
            }

            public Builder addAllBoard(Iterable<? extends Board_data> values) {
                copyOnWrite();
                ((board) this.instance).addAllBoard(values);
                return this;
            }

            public Builder clearBoard() {
                copyOnWrite();
                ((board) this.instance).clearBoard();
                return this;
            }

            public Builder removeBoard(int index) {
                copyOnWrite();
                ((board) this.instance).removeBoard(index);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new board();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_", "board_", Board_data.class};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<board> parser = PARSER;
                    if (parser == null) {
                        synchronized (board.class) {
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
            board defaultInstance = new board();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(board.class, defaultInstance);
        }

        public static board getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<board> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class create_bot_send extends GeneratedMessageLite<create_bot_send, Builder> implements create_bot_sendOrBuilder {
        public static final int AVATAR_URL_FIELD_NUMBER = 4;
        private static final create_bot_send DEFAULT_INSTANCE;
        public static final int INTRODUCTION_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<create_bot_send> PARSER = null;
        public static final int PRIVATE_FIELD_NUMBER = 5;
        private int private_;
        private String name_ = "";
        private String introduction_ = "";
        private String avatarUrl_ = "";

        private create_bot_send() {
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
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

        @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
        public String getIntroduction() {
            return this.introduction_;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
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

        @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
        public String getAvatarUrl() {
            return this.avatarUrl_;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
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

        @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
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

        public static create_bot_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (create_bot_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static create_bot_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (create_bot_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static create_bot_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (create_bot_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static create_bot_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (create_bot_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static create_bot_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (create_bot_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static create_bot_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (create_bot_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static create_bot_send parseFrom(InputStream input) throws IOException {
            return (create_bot_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static create_bot_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (create_bot_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static create_bot_send parseDelimitedFrom(InputStream input) throws IOException {
            return (create_bot_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static create_bot_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (create_bot_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static create_bot_send parseFrom(CodedInputStream input) throws IOException {
            return (create_bot_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static create_bot_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (create_bot_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(create_bot_send prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<create_bot_send, Builder> implements create_bot_sendOrBuilder {
            private Builder() {
                super(create_bot_send.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
            public String getName() {
                return ((create_bot_send) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
            public ByteString getNameBytes() {
                return ((create_bot_send) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((create_bot_send) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((create_bot_send) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((create_bot_send) this.instance).setNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
            public String getIntroduction() {
                return ((create_bot_send) this.instance).getIntroduction();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
            public ByteString getIntroductionBytes() {
                return ((create_bot_send) this.instance).getIntroductionBytes();
            }

            public Builder setIntroduction(String value) {
                copyOnWrite();
                ((create_bot_send) this.instance).setIntroduction(value);
                return this;
            }

            public Builder clearIntroduction() {
                copyOnWrite();
                ((create_bot_send) this.instance).clearIntroduction();
                return this;
            }

            public Builder setIntroductionBytes(ByteString value) {
                copyOnWrite();
                ((create_bot_send) this.instance).setIntroductionBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
            public String getAvatarUrl() {
                return ((create_bot_send) this.instance).getAvatarUrl();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ((create_bot_send) this.instance).getAvatarUrlBytes();
            }

            public Builder setAvatarUrl(String value) {
                copyOnWrite();
                ((create_bot_send) this.instance).setAvatarUrl(value);
                return this;
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((create_bot_send) this.instance).clearAvatarUrl();
                return this;
            }

            public Builder setAvatarUrlBytes(ByteString value) {
                copyOnWrite();
                ((create_bot_send) this.instance).setAvatarUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_bot_sendOrBuilder
            public int getPrivate() {
                return ((create_bot_send) this.instance).getPrivate();
            }

            public Builder setPrivate(int value) {
                copyOnWrite();
                ((create_bot_send) this.instance).setPrivate(value);
                return this;
            }

            public Builder clearPrivate() {
                copyOnWrite();
                ((create_bot_send) this.instance).clearPrivate();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new create_bot_send();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"name_", "introduction_", "avatarUrl_", "private_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0004", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<create_bot_send> parser = PARSER;
                    if (parser == null) {
                        synchronized (create_bot_send.class) {
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
            create_bot_send defaultInstance = new create_bot_send();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(create_bot_send.class, defaultInstance);
        }

        public static create_bot_send getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<create_bot_send> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class create_bot extends GeneratedMessageLite<create_bot, Builder> implements create_botOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final create_bot DEFAULT_INSTANCE;
        private static volatile Parser<create_bot> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 1;
        private int bitField0_;
        private BotData data_;
        private Status status_;

        public interface BotDataOrBuilder extends MessageLiteOrBuilder {
            String getBotId();

            ByteString getBotIdBytes();
        }

        private create_bot() {
        }

        public static final class BotData extends GeneratedMessageLite<BotData, Builder> implements BotDataOrBuilder {
            public static final int BOT_ID_FIELD_NUMBER = 1;
            private static final BotData DEFAULT_INSTANCE;
            private static volatile Parser<BotData> PARSER;
            private String botId_ = "";

            private BotData() {
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_bot.BotDataOrBuilder
            public String getBotId() {
                return this.botId_;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_bot.BotDataOrBuilder
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

            public static BotData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (BotData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BotData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BotData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BotData parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (BotData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BotData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BotData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BotData parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (BotData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BotData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BotData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BotData parseFrom(InputStream input) throws IOException {
                return (BotData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static BotData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BotData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static BotData parseDelimitedFrom(InputStream input) throws IOException {
                return (BotData) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static BotData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BotData) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static BotData parseFrom(CodedInputStream input) throws IOException {
                return (BotData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static BotData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BotData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(BotData prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<BotData, Builder> implements BotDataOrBuilder {
                private Builder() {
                    super(BotData.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.create_bot.BotDataOrBuilder
                public String getBotId() {
                    return ((BotData) this.instance).getBotId();
                }

                @Override // com.yhchat.canarys.proto.bot.Bot.create_bot.BotDataOrBuilder
                public ByteString getBotIdBytes() {
                    return ((BotData) this.instance).getBotIdBytes();
                }

                public Builder setBotId(String value) {
                    copyOnWrite();
                    ((BotData) this.instance).setBotId(value);
                    return this;
                }

                public Builder clearBotId() {
                    copyOnWrite();
                    ((BotData) this.instance).clearBotId();
                    return this;
                }

                public Builder setBotIdBytes(ByteString value) {
                    copyOnWrite();
                    ((BotData) this.instance).setBotIdBytes(value);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new BotData();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"botId_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<BotData> parser = PARSER;
                        if (parser == null) {
                            synchronized (BotData.class) {
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
                BotData defaultInstance = new BotData();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(BotData.class, defaultInstance);
            }

            public static BotData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<BotData> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.create_botOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.create_botOrBuilder
        public Status getStatus() {
            return this.status_ == null ? Status.getDefaultInstance() : this.status_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatus(Status value) {
            value.getClass();
            this.status_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStatus(Status value) {
            value.getClass();
            if (this.status_ != null && this.status_ != Status.getDefaultInstance()) {
                this.status_ = Status.newBuilder(this.status_).mergeFrom((Status.Builder) value).buildPartial();
            } else {
                this.status_ = value;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatus() {
            this.status_ = null;
            this.bitField0_ &= -2;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.create_botOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.create_botOrBuilder
        public BotData getData() {
            return this.data_ == null ? BotData.getDefaultInstance() : this.data_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(BotData value) {
            value.getClass();
            this.data_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeData(BotData value) {
            value.getClass();
            if (this.data_ != null && this.data_ != BotData.getDefaultInstance()) {
                this.data_ = BotData.newBuilder(this.data_).mergeFrom((BotData.Builder) value).buildPartial();
            } else {
                this.data_ = value;
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearData() {
            this.data_ = null;
            this.bitField0_ &= -3;
        }

        public static create_bot parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (create_bot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static create_bot parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (create_bot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static create_bot parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (create_bot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static create_bot parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (create_bot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static create_bot parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (create_bot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static create_bot parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (create_bot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static create_bot parseFrom(InputStream input) throws IOException {
            return (create_bot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static create_bot parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (create_bot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static create_bot parseDelimitedFrom(InputStream input) throws IOException {
            return (create_bot) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static create_bot parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (create_bot) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static create_bot parseFrom(CodedInputStream input) throws IOException {
            return (create_bot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static create_bot parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (create_bot) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(create_bot prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<create_bot, Builder> implements create_botOrBuilder {
            private Builder() {
                super(create_bot.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_botOrBuilder
            public boolean hasStatus() {
                return ((create_bot) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_botOrBuilder
            public Status getStatus() {
                return ((create_bot) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((create_bot) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((create_bot) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((create_bot) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((create_bot) this.instance).clearStatus();
                return this;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_botOrBuilder
            public boolean hasData() {
                return ((create_bot) this.instance).hasData();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.create_botOrBuilder
            public BotData getData() {
                return ((create_bot) this.instance).getData();
            }

            public Builder setData(BotData value) {
                copyOnWrite();
                ((create_bot) this.instance).setData(value);
                return this;
            }

            public Builder setData(BotData.Builder builderForValue) {
                copyOnWrite();
                ((create_bot) this.instance).setData(builderForValue.build());
                return this;
            }

            public Builder mergeData(BotData value) {
                copyOnWrite();
                ((create_bot) this.instance).mergeData(value);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((create_bot) this.instance).clearData();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new create_bot();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_", "data_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<create_bot> parser = PARSER;
                    if (parser == null) {
                        synchronized (create_bot.class) {
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
            create_bot defaultInstance = new create_bot();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(create_bot.class, defaultInstance);
        }

        public static create_bot getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<create_bot> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class bot_stop_send extends GeneratedMessageLite<bot_stop_send, Builder> implements bot_stop_sendOrBuilder {
        public static final int BOT_ID_FIELD_NUMBER = 2;
        private static final bot_stop_send DEFAULT_INSTANCE;
        public static final int OPERATION_FIELD_NUMBER = 3;
        private static volatile Parser<bot_stop_send> PARSER;
        private String botId_ = "";
        private int operation_;

        private bot_stop_send() {
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.bot_stop_sendOrBuilder
        public String getBotId() {
            return this.botId_;
        }

        @Override // com.yhchat.canarys.proto.bot.Bot.bot_stop_sendOrBuilder
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

        @Override // com.yhchat.canarys.proto.bot.Bot.bot_stop_sendOrBuilder
        public int getOperation() {
            return this.operation_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOperation(int value) {
            this.operation_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOperation() {
            this.operation_ = 0;
        }

        public static bot_stop_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (bot_stop_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static bot_stop_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (bot_stop_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static bot_stop_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (bot_stop_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static bot_stop_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (bot_stop_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static bot_stop_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (bot_stop_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static bot_stop_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (bot_stop_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static bot_stop_send parseFrom(InputStream input) throws IOException {
            return (bot_stop_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static bot_stop_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (bot_stop_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static bot_stop_send parseDelimitedFrom(InputStream input) throws IOException {
            return (bot_stop_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static bot_stop_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (bot_stop_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static bot_stop_send parseFrom(CodedInputStream input) throws IOException {
            return (bot_stop_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static bot_stop_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (bot_stop_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(bot_stop_send prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<bot_stop_send, Builder> implements bot_stop_sendOrBuilder {
            private Builder() {
                super(bot_stop_send.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_stop_sendOrBuilder
            public String getBotId() {
                return ((bot_stop_send) this.instance).getBotId();
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_stop_sendOrBuilder
            public ByteString getBotIdBytes() {
                return ((bot_stop_send) this.instance).getBotIdBytes();
            }

            public Builder setBotId(String value) {
                copyOnWrite();
                ((bot_stop_send) this.instance).setBotId(value);
                return this;
            }

            public Builder clearBotId() {
                copyOnWrite();
                ((bot_stop_send) this.instance).clearBotId();
                return this;
            }

            public Builder setBotIdBytes(ByteString value) {
                copyOnWrite();
                ((bot_stop_send) this.instance).setBotIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.bot.Bot.bot_stop_sendOrBuilder
            public int getOperation() {
                return ((bot_stop_send) this.instance).getOperation();
            }

            public Builder setOperation(int value) {
                copyOnWrite();
                ((bot_stop_send) this.instance).setOperation(value);
                return this;
            }

            public Builder clearOperation() {
                copyOnWrite();
                ((bot_stop_send) this.instance).clearOperation();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new bot_stop_send();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"botId_", "operation_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u0208\u0003\u0004", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<bot_stop_send> parser = PARSER;
                    if (parser == null) {
                        synchronized (bot_stop_send.class) {
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
            bot_stop_send defaultInstance = new bot_stop_send();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(bot_stop_send.class, defaultInstance);
        }

        public static bot_stop_send getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<bot_stop_send> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
