package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class send_message extends GeneratedMessageLite<send_message, Builder> implements send_messageOrBuilder {
    private static final send_message DEFAULT_INSTANCE;
    private static volatile Parser<send_message> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Status status_;

    private send_message() {
    }

    @Override // com.yhchat.canarys.proto.send_messageOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.send_messageOrBuilder
    public Status getStatus() {
        return this.status_ == null ? Status.getDefaultInstance() : this.status_;
    }

    public void setStatus(Status value) {
        value.getClass();
        this.status_ = value;
        this.bitField0_ |= 1;
    }

    public void mergeStatus(Status value) {
        value.getClass();
        if (this.status_ != null && this.status_ != Status.getDefaultInstance()) {
            this.status_ = Status.newBuilder(this.status_).mergeFrom((Status.Builder) value).buildPartial();
        } else {
            this.status_ = value;
        }
        this.bitField0_ |= 1;
    }

    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    public static send_message parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static send_message parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static send_message parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static send_message parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static send_message parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static send_message parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static send_message parseFrom(InputStream input) throws IOException {
        return (send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static send_message parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static send_message parseDelimitedFrom(InputStream input) throws IOException {
        return (send_message) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static send_message parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (send_message) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static send_message parseFrom(CodedInputStream input) throws IOException {
        return (send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static send_message parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (send_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(send_message prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<send_message, Builder> implements send_messageOrBuilder {
        /* synthetic */ Builder(send_messageIA send_messageia) {
            this();
        }

        private Builder() {
            super(send_message.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.send_messageOrBuilder
        public boolean hasStatus() {
            return ((send_message) this.instance).hasStatus();
        }

        @Override // com.yhchat.canarys.proto.send_messageOrBuilder
        public Status getStatus() {
            return ((send_message) this.instance).getStatus();
        }

        public Builder setStatus(Status value) {
            copyOnWrite();
            ((send_message) this.instance).setStatus(value);
            return this;
        }

        public Builder setStatus(Status.Builder builderForValue) {
            copyOnWrite();
            ((send_message) this.instance).setStatus(builderForValue.build());
            return this;
        }

        public Builder mergeStatus(Status value) {
            copyOnWrite();
            ((send_message) this.instance).mergeStatus(value);
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((send_message) this.instance).clearStatus();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new send_message();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "status_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<send_message> parser = PARSER;
                if (parser == null) {
                    synchronized (send_message.class) {
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
        send_message defaultInstance = new send_message();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(send_message.class, defaultInstance);
    }

    public static send_message getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<send_message> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
