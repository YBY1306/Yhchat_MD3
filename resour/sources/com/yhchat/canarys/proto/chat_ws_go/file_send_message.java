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
public final class file_send_message extends GeneratedMessageLite<file_send_message, Builder> implements file_send_messageOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final file_send_message DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile Parser<file_send_message> PARSER;
    private int bitField0_;
    private FileSendData data_;
    private INFO info_;

    public interface FileSendDataOrBuilder extends MessageLiteOrBuilder {
        String getAny();

        ByteString getAnyBytes();

        FileSendData.FileSender getSender();

        boolean hasSender();
    }

    private file_send_message() {
    }

    public static final class FileSendData extends GeneratedMessageLite<FileSendData, Builder> implements FileSendDataOrBuilder {
        public static final int ANY_FIELD_NUMBER = 1;
        private static final FileSendData DEFAULT_INSTANCE;
        private static volatile Parser<FileSendData> PARSER = null;
        public static final int SENDER_FIELD_NUMBER = 2;
        private String any_ = "";
        private int bitField0_;
        private FileSender sender_;

        public interface FileSenderOrBuilder extends MessageLiteOrBuilder {
            String getData();

            ByteString getDataBytes();

            String getSendDeviceId();

            ByteString getSendDeviceIdBytes();

            String getSendType();

            ByteString getSendTypeBytes();

            String getSendUserId();

            ByteString getSendUserIdBytes();

            long getTempCode();

            String getUserId();

            ByteString getUserIdBytes();
        }

        private FileSendData() {
        }

        public static final class FileSender extends GeneratedMessageLite<FileSender, Builder> implements FileSenderOrBuilder {
            public static final int DATA_FIELD_NUMBER = 5;
            private static final FileSender DEFAULT_INSTANCE;
            private static volatile Parser<FileSender> PARSER = null;
            public static final int SEND_DEVICEID_FIELD_NUMBER = 6;
            public static final int SEND_TYPE_FIELD_NUMBER = 4;
            public static final int SEND_USER_ID_FIELD_NUMBER = 1;
            public static final int TEMP_CODE_FIELD_NUMBER = 3;
            public static final int USER_ID_FIELD_NUMBER = 2;
            private long tempCode_;
            private String sendUserId_ = "";
            private String userId_ = "";
            private String sendType_ = "";
            private String data_ = "";
            private String sendDeviceId_ = "";

            private FileSender() {
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public String getSendUserId() {
                return this.sendUserId_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public ByteString getSendUserIdBytes() {
                return ByteString.copyFromUtf8(this.sendUserId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSendUserId(String value) {
                value.getClass();
                this.sendUserId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSendUserId() {
                this.sendUserId_ = getDefaultInstance().getSendUserId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSendUserIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.sendUserId_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public String getUserId() {
                return this.userId_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public ByteString getUserIdBytes() {
                return ByteString.copyFromUtf8(this.userId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUserId(String value) {
                value.getClass();
                this.userId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUserId() {
                this.userId_ = getDefaultInstance().getUserId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUserIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.userId_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public long getTempCode() {
                return this.tempCode_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTempCode(long value) {
                this.tempCode_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTempCode() {
                this.tempCode_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public String getSendType() {
                return this.sendType_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public ByteString getSendTypeBytes() {
                return ByteString.copyFromUtf8(this.sendType_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSendType(String value) {
                value.getClass();
                this.sendType_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSendType() {
                this.sendType_ = getDefaultInstance().getSendType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSendTypeBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.sendType_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public String getData() {
                return this.data_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public ByteString getDataBytes() {
                return ByteString.copyFromUtf8(this.data_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setData(String value) {
                value.getClass();
                this.data_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearData() {
                this.data_ = getDefaultInstance().getData();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDataBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.data_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public String getSendDeviceId() {
                return this.sendDeviceId_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
            public ByteString getSendDeviceIdBytes() {
                return ByteString.copyFromUtf8(this.sendDeviceId_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSendDeviceId(String value) {
                value.getClass();
                this.sendDeviceId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearSendDeviceId() {
                this.sendDeviceId_ = getDefaultInstance().getSendDeviceId();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSendDeviceIdBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.sendDeviceId_ = value.toStringUtf8();
            }

            public static FileSender parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (FileSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FileSender parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FileSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FileSender parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (FileSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FileSender parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FileSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FileSender parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (FileSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static FileSender parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (FileSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static FileSender parseFrom(InputStream input) throws IOException {
                return (FileSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FileSender parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FileSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FileSender parseDelimitedFrom(InputStream input) throws IOException {
                return (FileSender) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static FileSender parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FileSender) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static FileSender parseFrom(CodedInputStream input) throws IOException {
                return (FileSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static FileSender parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (FileSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(FileSender prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<FileSender, Builder> implements FileSenderOrBuilder {
                private Builder() {
                    super(FileSender.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public String getSendUserId() {
                    return ((FileSender) this.instance).getSendUserId();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public ByteString getSendUserIdBytes() {
                    return ((FileSender) this.instance).getSendUserIdBytes();
                }

                public Builder setSendUserId(String value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setSendUserId(value);
                    return this;
                }

                public Builder clearSendUserId() {
                    copyOnWrite();
                    ((FileSender) this.instance).clearSendUserId();
                    return this;
                }

                public Builder setSendUserIdBytes(ByteString value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setSendUserIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public String getUserId() {
                    return ((FileSender) this.instance).getUserId();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public ByteString getUserIdBytes() {
                    return ((FileSender) this.instance).getUserIdBytes();
                }

                public Builder setUserId(String value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setUserId(value);
                    return this;
                }

                public Builder clearUserId() {
                    copyOnWrite();
                    ((FileSender) this.instance).clearUserId();
                    return this;
                }

                public Builder setUserIdBytes(ByteString value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setUserIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public long getTempCode() {
                    return ((FileSender) this.instance).getTempCode();
                }

                public Builder setTempCode(long value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setTempCode(value);
                    return this;
                }

                public Builder clearTempCode() {
                    copyOnWrite();
                    ((FileSender) this.instance).clearTempCode();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public String getSendType() {
                    return ((FileSender) this.instance).getSendType();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public ByteString getSendTypeBytes() {
                    return ((FileSender) this.instance).getSendTypeBytes();
                }

                public Builder setSendType(String value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setSendType(value);
                    return this;
                }

                public Builder clearSendType() {
                    copyOnWrite();
                    ((FileSender) this.instance).clearSendType();
                    return this;
                }

                public Builder setSendTypeBytes(ByteString value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setSendTypeBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public String getData() {
                    return ((FileSender) this.instance).getData();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public ByteString getDataBytes() {
                    return ((FileSender) this.instance).getDataBytes();
                }

                public Builder setData(String value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setData(value);
                    return this;
                }

                public Builder clearData() {
                    copyOnWrite();
                    ((FileSender) this.instance).clearData();
                    return this;
                }

                public Builder setDataBytes(ByteString value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setDataBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public String getSendDeviceId() {
                    return ((FileSender) this.instance).getSendDeviceId();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendData.FileSenderOrBuilder
                public ByteString getSendDeviceIdBytes() {
                    return ((FileSender) this.instance).getSendDeviceIdBytes();
                }

                public Builder setSendDeviceId(String value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setSendDeviceId(value);
                    return this;
                }

                public Builder clearSendDeviceId() {
                    copyOnWrite();
                    ((FileSender) this.instance).clearSendDeviceId();
                    return this;
                }

                public Builder setSendDeviceIdBytes(ByteString value) {
                    copyOnWrite();
                    ((FileSender) this.instance).setSendDeviceIdBytes(value);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new FileSender();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"sendUserId_", "userId_", "tempCode_", "sendType_", "data_", "sendDeviceId_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0003\u0004\u0208\u0005\u0208\u0006\u0208", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<FileSender> parser = PARSER;
                        if (parser == null) {
                            synchronized (FileSender.class) {
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
                FileSender defaultInstance = new FileSender();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(FileSender.class, defaultInstance);
            }

            public static FileSender getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<FileSender> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendDataOrBuilder
        public String getAny() {
            return this.any_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendDataOrBuilder
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

        @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendDataOrBuilder
        public boolean hasSender() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendDataOrBuilder
        public FileSender getSender() {
            return this.sender_ == null ? FileSender.getDefaultInstance() : this.sender_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSender(FileSender value) {
            value.getClass();
            this.sender_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSender(FileSender value) {
            value.getClass();
            if (this.sender_ != null && this.sender_ != FileSender.getDefaultInstance()) {
                this.sender_ = FileSender.newBuilder(this.sender_).mergeFrom((FileSender.Builder) value).buildPartial();
            } else {
                this.sender_ = value;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSender() {
            this.sender_ = null;
            this.bitField0_ &= -2;
        }

        public static FileSendData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (FileSendData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileSendData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FileSendData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileSendData parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (FileSendData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileSendData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FileSendData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileSendData parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (FileSendData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static FileSendData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (FileSendData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static FileSendData parseFrom(InputStream input) throws IOException {
            return (FileSendData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FileSendData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FileSendData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FileSendData parseDelimitedFrom(InputStream input) throws IOException {
            return (FileSendData) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static FileSendData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FileSendData) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static FileSendData parseFrom(CodedInputStream input) throws IOException {
            return (FileSendData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static FileSendData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (FileSendData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(FileSendData prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<FileSendData, Builder> implements FileSendDataOrBuilder {
            private Builder() {
                super(FileSendData.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendDataOrBuilder
            public String getAny() {
                return ((FileSendData) this.instance).getAny();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendDataOrBuilder
            public ByteString getAnyBytes() {
                return ((FileSendData) this.instance).getAnyBytes();
            }

            public Builder setAny(String value) {
                copyOnWrite();
                ((FileSendData) this.instance).setAny(value);
                return this;
            }

            public Builder clearAny() {
                copyOnWrite();
                ((FileSendData) this.instance).clearAny();
                return this;
            }

            public Builder setAnyBytes(ByteString value) {
                copyOnWrite();
                ((FileSendData) this.instance).setAnyBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendDataOrBuilder
            public boolean hasSender() {
                return ((FileSendData) this.instance).hasSender();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_message.FileSendDataOrBuilder
            public FileSender getSender() {
                return ((FileSendData) this.instance).getSender();
            }

            public Builder setSender(FileSender value) {
                copyOnWrite();
                ((FileSendData) this.instance).setSender(value);
                return this;
            }

            public Builder setSender(FileSender.Builder builderForValue) {
                copyOnWrite();
                ((FileSendData) this.instance).setSender(builderForValue.build());
                return this;
            }

            public Builder mergeSender(FileSender value) {
                copyOnWrite();
                ((FileSendData) this.instance).mergeSender(value);
                return this;
            }

            public Builder clearSender() {
                copyOnWrite();
                ((FileSendData) this.instance).clearSender();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new FileSendData();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "any_", "sender_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<FileSendData> parser = PARSER;
                    if (parser == null) {
                        synchronized (FileSendData.class) {
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
            FileSendData defaultInstance = new FileSendData();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(FileSendData.class, defaultInstance);
        }

        public static FileSendData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<FileSendData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_messageOrBuilder
    public boolean hasInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_messageOrBuilder
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

    @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_messageOrBuilder
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_messageOrBuilder
    public FileSendData getData() {
        return this.data_ == null ? FileSendData.getDefaultInstance() : this.data_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(FileSendData value) {
        value.getClass();
        this.data_ = value;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeData(FileSendData value) {
        value.getClass();
        if (this.data_ != null && this.data_ != FileSendData.getDefaultInstance()) {
            this.data_ = FileSendData.newBuilder(this.data_).mergeFrom((FileSendData.Builder) value).buildPartial();
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

    public static file_send_message parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (file_send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static file_send_message parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (file_send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static file_send_message parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (file_send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static file_send_message parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (file_send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static file_send_message parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (file_send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static file_send_message parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (file_send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static file_send_message parseFrom(InputStream input) throws IOException {
        return (file_send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static file_send_message parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (file_send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static file_send_message parseDelimitedFrom(InputStream input) throws IOException {
        return (file_send_message) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static file_send_message parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (file_send_message) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static file_send_message parseFrom(CodedInputStream input) throws IOException {
        return (file_send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static file_send_message parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (file_send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(file_send_message prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<file_send_message, Builder> implements file_send_messageOrBuilder {
        private Builder() {
            super(file_send_message.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_messageOrBuilder
        public boolean hasInfo() {
            return ((file_send_message) this.instance).hasInfo();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_messageOrBuilder
        public INFO getInfo() {
            return ((file_send_message) this.instance).getInfo();
        }

        public Builder setInfo(INFO value) {
            copyOnWrite();
            ((file_send_message) this.instance).setInfo(value);
            return this;
        }

        public Builder setInfo(INFO.Builder builderForValue) {
            copyOnWrite();
            ((file_send_message) this.instance).setInfo(builderForValue.build());
            return this;
        }

        public Builder mergeInfo(INFO value) {
            copyOnWrite();
            ((file_send_message) this.instance).mergeInfo(value);
            return this;
        }

        public Builder clearInfo() {
            copyOnWrite();
            ((file_send_message) this.instance).clearInfo();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_messageOrBuilder
        public boolean hasData() {
            return ((file_send_message) this.instance).hasData();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.file_send_messageOrBuilder
        public FileSendData getData() {
            return ((file_send_message) this.instance).getData();
        }

        public Builder setData(FileSendData value) {
            copyOnWrite();
            ((file_send_message) this.instance).setData(value);
            return this;
        }

        public Builder setData(FileSendData.Builder builderForValue) {
            copyOnWrite();
            ((file_send_message) this.instance).setData(builderForValue.build());
            return this;
        }

        public Builder mergeData(FileSendData value) {
            copyOnWrite();
            ((file_send_message) this.instance).mergeData(value);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((file_send_message) this.instance).clearData();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new file_send_message();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "info_", "data_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<file_send_message> parser = PARSER;
                if (parser == null) {
                    synchronized (file_send_message.class) {
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
        file_send_message defaultInstance = new file_send_message();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(file_send_message.class, defaultInstance);
    }

    public static file_send_message getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<file_send_message> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
