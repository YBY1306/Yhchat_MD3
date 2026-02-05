package com.yhchat.canarys.proto.chat_ws_go;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.chat_ws_go.INFO;
import com.yhchat.canarys.proto.chat_ws_go.WsMsg;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class push_message extends GeneratedMessageLite<push_message, Builder> implements push_messageOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final push_message DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile Parser<push_message> PARSER;
    private int bitField0_;
    private PushData data_;
    private INFO info_;

    public interface PushDataOrBuilder extends MessageLiteOrBuilder {
        String getAny();

        ByteString getAnyBytes();

        WsMsg getMsg();

        boolean hasMsg();
    }

    private push_message() {
    }

    public static final class PushData extends GeneratedMessageLite<PushData, Builder> implements PushDataOrBuilder {
        public static final int ANY_FIELD_NUMBER = 1;
        private static final PushData DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 2;
        private static volatile Parser<PushData> PARSER;
        private String any_ = "";
        private int bitField0_;
        private WsMsg msg_;

        private PushData() {
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.push_message.PushDataOrBuilder
        public String getAny() {
            return this.any_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.push_message.PushDataOrBuilder
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

        @Override // com.yhchat.canarys.proto.chat_ws_go.push_message.PushDataOrBuilder
        public boolean hasMsg() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.push_message.PushDataOrBuilder
        public WsMsg getMsg() {
            return this.msg_ == null ? WsMsg.getDefaultInstance() : this.msg_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(WsMsg value) {
            value.getClass();
            this.msg_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeMsg(WsMsg value) {
            value.getClass();
            if (this.msg_ != null && this.msg_ != WsMsg.getDefaultInstance()) {
                this.msg_ = WsMsg.newBuilder(this.msg_).mergeFrom((WsMsg.Builder) value).buildPartial();
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

        public static PushData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PushData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PushData parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PushData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PushData parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static PushData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static PushData parseFrom(InputStream input) throws IOException {
            return (PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PushData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PushData parseDelimitedFrom(InputStream input) throws IOException {
            return (PushData) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static PushData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PushData) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static PushData parseFrom(CodedInputStream input) throws IOException {
            return (PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static PushData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (PushData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(PushData prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<PushData, Builder> implements PushDataOrBuilder {
            private Builder() {
                super(PushData.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.push_message.PushDataOrBuilder
            public String getAny() {
                return ((PushData) this.instance).getAny();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.push_message.PushDataOrBuilder
            public ByteString getAnyBytes() {
                return ((PushData) this.instance).getAnyBytes();
            }

            public Builder setAny(String value) {
                copyOnWrite();
                ((PushData) this.instance).setAny(value);
                return this;
            }

            public Builder clearAny() {
                copyOnWrite();
                ((PushData) this.instance).clearAny();
                return this;
            }

            public Builder setAnyBytes(ByteString value) {
                copyOnWrite();
                ((PushData) this.instance).setAnyBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.push_message.PushDataOrBuilder
            public boolean hasMsg() {
                return ((PushData) this.instance).hasMsg();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.push_message.PushDataOrBuilder
            public WsMsg getMsg() {
                return ((PushData) this.instance).getMsg();
            }

            public Builder setMsg(WsMsg value) {
                copyOnWrite();
                ((PushData) this.instance).setMsg(value);
                return this;
            }

            public Builder setMsg(WsMsg.Builder builderForValue) {
                copyOnWrite();
                ((PushData) this.instance).setMsg(builderForValue.build());
                return this;
            }

            public Builder mergeMsg(WsMsg value) {
                copyOnWrite();
                ((PushData) this.instance).mergeMsg(value);
                return this;
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((PushData) this.instance).clearMsg();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new PushData();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "any_", "msg_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<PushData> parser = PARSER;
                    if (parser == null) {
                        synchronized (PushData.class) {
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
            PushData defaultInstance = new PushData();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(PushData.class, defaultInstance);
        }

        public static PushData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<PushData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.push_messageOrBuilder
    public boolean hasInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.push_messageOrBuilder
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

    @Override // com.yhchat.canarys.proto.chat_ws_go.push_messageOrBuilder
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.push_messageOrBuilder
    public PushData getData() {
        return this.data_ == null ? PushData.getDefaultInstance() : this.data_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(PushData value) {
        value.getClass();
        this.data_ = value;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeData(PushData value) {
        value.getClass();
        if (this.data_ != null && this.data_ != PushData.getDefaultInstance()) {
            this.data_ = PushData.newBuilder(this.data_).mergeFrom((PushData.Builder) value).buildPartial();
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

    public static push_message parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (push_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static push_message parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (push_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static push_message parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (push_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static push_message parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (push_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static push_message parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (push_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static push_message parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (push_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static push_message parseFrom(InputStream input) throws IOException {
        return (push_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static push_message parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (push_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static push_message parseDelimitedFrom(InputStream input) throws IOException {
        return (push_message) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static push_message parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (push_message) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static push_message parseFrom(CodedInputStream input) throws IOException {
        return (push_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static push_message parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (push_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(push_message prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<push_message, Builder> implements push_messageOrBuilder {
        private Builder() {
            super(push_message.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.push_messageOrBuilder
        public boolean hasInfo() {
            return ((push_message) this.instance).hasInfo();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.push_messageOrBuilder
        public INFO getInfo() {
            return ((push_message) this.instance).getInfo();
        }

        public Builder setInfo(INFO value) {
            copyOnWrite();
            ((push_message) this.instance).setInfo(value);
            return this;
        }

        public Builder setInfo(INFO.Builder builderForValue) {
            copyOnWrite();
            ((push_message) this.instance).setInfo(builderForValue.build());
            return this;
        }

        public Builder mergeInfo(INFO value) {
            copyOnWrite();
            ((push_message) this.instance).mergeInfo(value);
            return this;
        }

        public Builder clearInfo() {
            copyOnWrite();
            ((push_message) this.instance).clearInfo();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.push_messageOrBuilder
        public boolean hasData() {
            return ((push_message) this.instance).hasData();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.push_messageOrBuilder
        public PushData getData() {
            return ((push_message) this.instance).getData();
        }

        public Builder setData(PushData value) {
            copyOnWrite();
            ((push_message) this.instance).setData(value);
            return this;
        }

        public Builder setData(PushData.Builder builderForValue) {
            copyOnWrite();
            ((push_message) this.instance).setData(builderForValue.build());
            return this;
        }

        public Builder mergeData(PushData value) {
            copyOnWrite();
            ((push_message) this.instance).mergeData(value);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((push_message) this.instance).clearData();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new push_message();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "info_", "data_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<push_message> parser = PARSER;
                if (parser == null) {
                    synchronized (push_message.class) {
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
        push_message defaultInstance = new push_message();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(push_message.class, defaultInstance);
    }

    public static push_message getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<push_message> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
