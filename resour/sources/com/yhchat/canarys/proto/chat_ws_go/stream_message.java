package com.yhchat.canarys.proto.chat_ws_go;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.chat_ws_go.INFO;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class stream_message extends GeneratedMessageLite<stream_message, Builder> implements stream_messageOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final stream_message DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile Parser<stream_message> PARSER;
    private int bitField0_;
    private Data data_;
    private INFO info_;

    public interface DataOrBuilder extends MessageLiteOrBuilder {
        String getAny();

        ByteString getAnyBytes();

        Data.StreamMsg getMsg();

        boolean hasMsg();
    }

    private stream_message() {
    }

    public static final class Data extends GeneratedMessageLite<Data, Builder> implements DataOrBuilder {
        public static final int ANY_FIELD_NUMBER = 1;
        private static final Data DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 2;
        private static volatile Parser<Data> PARSER;
        private String any_ = "";
        private int bitField0_;
        private StreamMsg msg_;

        public interface StreamMsgOrBuilder extends MessageLiteOrBuilder {
            String getChatId();

            ByteString getChatIdBytes();

            String getContent();

            ByteString getContentBytes();

            String getMsgId();

            ByteString getMsgIdBytes();

            String getRecvId();

            ByteString getRecvIdBytes();
        }

        private Data() {
        }

        public static final class StreamMsg extends GeneratedMessageLite<StreamMsg, Builder> implements StreamMsgOrBuilder {
            public static final int CHAT_ID_FIELD_NUMBER = 3;
            public static final int CONTENT_FIELD_NUMBER = 4;
            private static final StreamMsg DEFAULT_INSTANCE;
            public static final int MSG_ID_FIELD_NUMBER = 1;
            private static volatile Parser<StreamMsg> PARSER = null;
            public static final int RECV_ID_FIELD_NUMBER = 2;
            private String msgId_ = "";
            private String recvId_ = "";
            private String chatId_ = "";
            private String content_ = "";

            private StreamMsg() {
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
            public String getMsgId() {
                return this.msgId_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
            public ByteString getMsgIdBytes() {
                return ByteString.copyFromUtf8(this.msgId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMsgId(String value) {
                value.getClass();
                this.msgId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearMsgId() {
                this.msgId_ = getDefaultInstance().getMsgId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setMsgIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.msgId_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
            public String getRecvId() {
                return this.recvId_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
            public ByteString getRecvIdBytes() {
                return ByteString.copyFromUtf8(this.recvId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRecvId(String value) {
                value.getClass();
                this.recvId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearRecvId() {
                this.recvId_ = getDefaultInstance().getRecvId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setRecvIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.recvId_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
            public String getChatId() {
                return this.chatId_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
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

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
            public String getContent() {
                return this.content_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
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

            public static StreamMsg parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (StreamMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static StreamMsg parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (StreamMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static StreamMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (StreamMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static StreamMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (StreamMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static StreamMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (StreamMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static StreamMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (StreamMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static StreamMsg parseFrom(InputStream input) throws IOException {
                return (StreamMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static StreamMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (StreamMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static StreamMsg parseDelimitedFrom(InputStream input) throws IOException {
                return (StreamMsg) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static StreamMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (StreamMsg) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static StreamMsg parseFrom(CodedInputStream input) throws IOException {
                return (StreamMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static StreamMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (StreamMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(StreamMsg prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<StreamMsg, Builder> implements StreamMsgOrBuilder {
                private Builder() {
                    super(StreamMsg.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
                public String getMsgId() {
                    return ((StreamMsg) this.instance).getMsgId();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
                public ByteString getMsgIdBytes() {
                    return ((StreamMsg) this.instance).getMsgIdBytes();
                }

                public Builder setMsgId(String value) {
                    copyOnWrite();
                    ((StreamMsg) this.instance).setMsgId(value);
                    return this;
                }

                public Builder clearMsgId() {
                    copyOnWrite();
                    ((StreamMsg) this.instance).clearMsgId();
                    return this;
                }

                public Builder setMsgIdBytes(ByteString value) {
                    copyOnWrite();
                    ((StreamMsg) this.instance).setMsgIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
                public String getRecvId() {
                    return ((StreamMsg) this.instance).getRecvId();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
                public ByteString getRecvIdBytes() {
                    return ((StreamMsg) this.instance).getRecvIdBytes();
                }

                public Builder setRecvId(String value) {
                    copyOnWrite();
                    ((StreamMsg) this.instance).setRecvId(value);
                    return this;
                }

                public Builder clearRecvId() {
                    copyOnWrite();
                    ((StreamMsg) this.instance).clearRecvId();
                    return this;
                }

                public Builder setRecvIdBytes(ByteString value) {
                    copyOnWrite();
                    ((StreamMsg) this.instance).setRecvIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
                public String getChatId() {
                    return ((StreamMsg) this.instance).getChatId();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
                public ByteString getChatIdBytes() {
                    return ((StreamMsg) this.instance).getChatIdBytes();
                }

                public Builder setChatId(String value) {
                    copyOnWrite();
                    ((StreamMsg) this.instance).setChatId(value);
                    return this;
                }

                public Builder clearChatId() {
                    copyOnWrite();
                    ((StreamMsg) this.instance).clearChatId();
                    return this;
                }

                public Builder setChatIdBytes(ByteString value) {
                    copyOnWrite();
                    ((StreamMsg) this.instance).setChatIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
                public String getContent() {
                    return ((StreamMsg) this.instance).getContent();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.Data.StreamMsgOrBuilder
                public ByteString getContentBytes() {
                    return ((StreamMsg) this.instance).getContentBytes();
                }

                public Builder setContent(String value) {
                    copyOnWrite();
                    ((StreamMsg) this.instance).setContent(value);
                    return this;
                }

                public Builder clearContent() {
                    copyOnWrite();
                    ((StreamMsg) this.instance).clearContent();
                    return this;
                }

                public Builder setContentBytes(ByteString value) {
                    copyOnWrite();
                    ((StreamMsg) this.instance).setContentBytes(value);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new StreamMsg();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"msgId_", "recvId_", "chatId_", "content_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<StreamMsg> parser = PARSER;
                        if (parser == null) {
                            synchronized (StreamMsg.class) {
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
                StreamMsg defaultInstance = new StreamMsg();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(StreamMsg.class, defaultInstance);
            }

            public static StreamMsg getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<StreamMsg> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.DataOrBuilder
        public String getAny() {
            return this.any_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.DataOrBuilder
        public ByteString getAnyBytes() {
            return ByteString.copyFromUtf8(this.any_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAny(String value) {
            value.getClass();
            this.any_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAny() {
            this.any_ = getDefaultInstance().getAny();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnyBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.any_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.DataOrBuilder
        public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.DataOrBuilder
        public StreamMsg getMsg() {
            return this.msg_ == null ? StreamMsg.getDefaultInstance() : this.msg_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(StreamMsg value) {
            value.getClass();
            this.msg_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMsg(StreamMsg value) {
            value.getClass();
            if (this.msg_ != null && this.msg_ != StreamMsg.getDefaultInstance()) {
                this.msg_ = StreamMsg.newBuilder(this.msg_).mergeFrom((StreamMsg.Builder) value).buildPartial();
            } else {
                this.msg_ = value;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = null;
            this.bitField0_ &= -2;
        }

        public static Data parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Data parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Data parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Data parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Data parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Data parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Data parseFrom(InputStream input) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Data parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Data parseDelimitedFrom(InputStream input) throws IOException {
            return (Data) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Data parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Data) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Data parseFrom(CodedInputStream input) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Data parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Data prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Data, Builder> implements DataOrBuilder {
            private Builder() {
                super(Data.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.DataOrBuilder
            public String getAny() {
                return ((Data) this.instance).getAny();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.DataOrBuilder
            public ByteString getAnyBytes() {
                return ((Data) this.instance).getAnyBytes();
            }

            public Builder setAny(String value) {
                copyOnWrite();
                ((Data) this.instance).setAny(value);
                return this;
            }

            public Builder clearAny() {
                copyOnWrite();
                ((Data) this.instance).clearAny();
                return this;
            }

            public Builder setAnyBytes(ByteString value) {
                copyOnWrite();
                ((Data) this.instance).setAnyBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.DataOrBuilder
            public boolean hasMsg() {
                return ((Data) this.instance).hasMsg();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.stream_message.DataOrBuilder
            public StreamMsg getMsg() {
                return ((Data) this.instance).getMsg();
            }

            public Builder setMsg(StreamMsg value) {
                copyOnWrite();
                ((Data) this.instance).setMsg(value);
                return this;
            }

            public Builder setMsg(StreamMsg.Builder builderForValue) {
                copyOnWrite();
                ((Data) this.instance).setMsg(builderForValue.build());
                return this;
            }

            public Builder mergeMsg(StreamMsg value) {
                copyOnWrite();
                ((Data) this.instance).mergeMsg(value);
                return this;
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((Data) this.instance).clearMsg();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Data();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "any_", "msg_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Data> parser = PARSER;
                    if (parser == null) {
                        synchronized (Data.class) {
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
            Data defaultInstance = new Data();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Data.class, defaultInstance);
        }

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Data> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.stream_messageOrBuilder
    public boolean hasInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.stream_messageOrBuilder
    public INFO getInfo() {
        return this.info_ == null ? INFO.getDefaultInstance() : this.info_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(INFO value) {
        value.getClass();
        this.info_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInfo(INFO value) {
        value.getClass();
        if (this.info_ != null && this.info_ != INFO.getDefaultInstance()) {
            this.info_ = INFO.newBuilder(this.info_).mergeFrom((INFO.Builder) value).buildPartial();
        } else {
            this.info_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.stream_messageOrBuilder
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.stream_messageOrBuilder
    public Data getData() {
        return this.data_ == null ? Data.getDefaultInstance() : this.data_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(Data value) {
        value.getClass();
        this.data_ = value;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeData(Data value) {
        value.getClass();
        if (this.data_ != null && this.data_ != Data.getDefaultInstance()) {
            this.data_ = Data.newBuilder(this.data_).mergeFrom((Data.Builder) value).buildPartial();
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

    public static stream_message parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (stream_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static stream_message parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (stream_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static stream_message parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (stream_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static stream_message parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (stream_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static stream_message parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (stream_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static stream_message parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (stream_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static stream_message parseFrom(InputStream input) throws IOException {
        return (stream_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static stream_message parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (stream_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static stream_message parseDelimitedFrom(InputStream input) throws IOException {
        return (stream_message) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static stream_message parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (stream_message) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static stream_message parseFrom(CodedInputStream input) throws IOException {
        return (stream_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static stream_message parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (stream_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(stream_message prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<stream_message, Builder> implements stream_messageOrBuilder {
        private Builder() {
            super(stream_message.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.stream_messageOrBuilder
        public boolean hasInfo() {
            return ((stream_message) this.instance).hasInfo();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.stream_messageOrBuilder
        public INFO getInfo() {
            return ((stream_message) this.instance).getInfo();
        }

        public Builder setInfo(INFO value) {
            copyOnWrite();
            ((stream_message) this.instance).setInfo(value);
            return this;
        }

        public Builder setInfo(INFO.Builder builderForValue) {
            copyOnWrite();
            ((stream_message) this.instance).setInfo(builderForValue.build());
            return this;
        }

        public Builder mergeInfo(INFO value) {
            copyOnWrite();
            ((stream_message) this.instance).mergeInfo(value);
            return this;
        }

        public Builder clearInfo() {
            copyOnWrite();
            ((stream_message) this.instance).clearInfo();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.stream_messageOrBuilder
        public boolean hasData() {
            return ((stream_message) this.instance).hasData();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.stream_messageOrBuilder
        public Data getData() {
            return ((stream_message) this.instance).getData();
        }

        public Builder setData(Data value) {
            copyOnWrite();
            ((stream_message) this.instance).setData(value);
            return this;
        }

        public Builder setData(Data.Builder builderForValue) {
            copyOnWrite();
            ((stream_message) this.instance).setData(builderForValue.build());
            return this;
        }

        public Builder mergeData(Data value) {
            copyOnWrite();
            ((stream_message) this.instance).mergeData(value);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((stream_message) this.instance).clearData();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new stream_message();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "info_", "data_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<stream_message> parser = PARSER;
                if (parser == null) {
                    synchronized (stream_message.class) {
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
        stream_message defaultInstance = new stream_message();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(stream_message.class, defaultInstance);
    }

    public static stream_message getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<stream_message> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
