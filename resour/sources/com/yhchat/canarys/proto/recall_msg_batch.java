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
public final class recall_msg_batch extends GeneratedMessageLite<recall_msg_batch, Builder> implements recall_msg_batchOrBuilder {
    private static final recall_msg_batch DEFAULT_INSTANCE;
    private static volatile Parser<recall_msg_batch> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Status status_;

    private recall_msg_batch() {
    }

    @Override // com.yhchat.canarys.proto.recall_msg_batchOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.recall_msg_batchOrBuilder
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

    public static recall_msg_batch parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (recall_msg_batch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static recall_msg_batch parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (recall_msg_batch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static recall_msg_batch parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (recall_msg_batch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static recall_msg_batch parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (recall_msg_batch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static recall_msg_batch parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (recall_msg_batch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static recall_msg_batch parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (recall_msg_batch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static recall_msg_batch parseFrom(InputStream input) throws IOException {
        return (recall_msg_batch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static recall_msg_batch parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (recall_msg_batch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static recall_msg_batch parseDelimitedFrom(InputStream input) throws IOException {
        return (recall_msg_batch) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static recall_msg_batch parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (recall_msg_batch) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static recall_msg_batch parseFrom(CodedInputStream input) throws IOException {
        return (recall_msg_batch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static recall_msg_batch parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (recall_msg_batch) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(recall_msg_batch prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<recall_msg_batch, Builder> implements recall_msg_batchOrBuilder {
        /* synthetic */ Builder(recall_msg_batchIA recall_msg_batchia) {
            this();
        }

        private Builder() {
            super(recall_msg_batch.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.recall_msg_batchOrBuilder
        public boolean hasStatus() {
            return ((recall_msg_batch) this.instance).hasStatus();
        }

        @Override // com.yhchat.canarys.proto.recall_msg_batchOrBuilder
        public Status getStatus() {
            return ((recall_msg_batch) this.instance).getStatus();
        }

        public Builder setStatus(Status value) {
            copyOnWrite();
            ((recall_msg_batch) this.instance).setStatus(value);
            return this;
        }

        public Builder setStatus(Status.Builder builderForValue) {
            copyOnWrite();
            ((recall_msg_batch) this.instance).setStatus(builderForValue.build());
            return this;
        }

        public Builder mergeStatus(Status value) {
            copyOnWrite();
            ((recall_msg_batch) this.instance).mergeStatus(value);
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((recall_msg_batch) this.instance).clearStatus();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new recall_msg_batch();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "status_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u1009\u0000", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<recall_msg_batch> parser = PARSER;
                if (parser == null) {
                    synchronized (recall_msg_batch.class) {
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
        recall_msg_batch defaultInstance = new recall_msg_batch();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(recall_msg_batch.class, defaultInstance);
    }

    public static recall_msg_batch getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<recall_msg_batch> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
