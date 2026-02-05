package com.yhchat.canarys.proto.chat_ws_go;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.chat_ws_go.INFO;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class heartbeat_ack extends GeneratedMessageLite<heartbeat_ack, Builder> implements heartbeat_ackOrBuilder {
    private static final heartbeat_ack DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile Parser<heartbeat_ack> PARSER;
    private int bitField0_;
    private INFO info_;

    private heartbeat_ack() {
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.heartbeat_ackOrBuilder
    public boolean hasInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.heartbeat_ackOrBuilder
    public INFO getInfo() {
        return this.info_ == null ? INFO.getDefaultInstance() : this.info_;
    }

    public void setInfo(INFO value) {
        value.getClass();
        this.info_ = value;
        this.bitField0_ |= 1;
    }

    public void mergeInfo(INFO value) {
        value.getClass();
        if (this.info_ != null && this.info_ != INFO.getDefaultInstance()) {
            this.info_ = INFO.newBuilder(this.info_).mergeFrom((INFO.Builder) value).buildPartial();
        } else {
            this.info_ = value;
        }
        this.bitField0_ |= 1;
    }

    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -2;
    }

    public static heartbeat_ack parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (heartbeat_ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static heartbeat_ack parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (heartbeat_ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static heartbeat_ack parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (heartbeat_ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static heartbeat_ack parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (heartbeat_ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static heartbeat_ack parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (heartbeat_ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static heartbeat_ack parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (heartbeat_ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static heartbeat_ack parseFrom(InputStream input) throws IOException {
        return (heartbeat_ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static heartbeat_ack parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (heartbeat_ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static heartbeat_ack parseDelimitedFrom(InputStream input) throws IOException {
        return (heartbeat_ack) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static heartbeat_ack parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (heartbeat_ack) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static heartbeat_ack parseFrom(CodedInputStream input) throws IOException {
        return (heartbeat_ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static heartbeat_ack parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (heartbeat_ack) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(heartbeat_ack prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<heartbeat_ack, Builder> implements heartbeat_ackOrBuilder {
        /* synthetic */ Builder(heartbeat_ackIA heartbeat_ackia) {
            this();
        }

        private Builder() {
            super(heartbeat_ack.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.heartbeat_ackOrBuilder
        public boolean hasInfo() {
            return ((heartbeat_ack) this.instance).hasInfo();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.heartbeat_ackOrBuilder
        public INFO getInfo() {
            return ((heartbeat_ack) this.instance).getInfo();
        }

        public Builder setInfo(INFO value) {
            copyOnWrite();
            ((heartbeat_ack) this.instance).setInfo(value);
            return this;
        }

        public Builder setInfo(INFO.Builder builderForValue) {
            copyOnWrite();
            ((heartbeat_ack) this.instance).setInfo(builderForValue.build());
            return this;
        }

        public Builder mergeInfo(INFO value) {
            copyOnWrite();
            ((heartbeat_ack) this.instance).mergeInfo(value);
            return this;
        }

        public Builder clearInfo() {
            copyOnWrite();
            ((heartbeat_ack) this.instance).clearInfo();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new heartbeat_ack();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "info_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<heartbeat_ack> parser = PARSER;
                if (parser == null) {
                    synchronized (heartbeat_ack.class) {
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
        heartbeat_ack defaultInstance = new heartbeat_ack();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(heartbeat_ack.class, defaultInstance);
    }

    public static heartbeat_ack getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<heartbeat_ack> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
