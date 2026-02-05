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
public final class Status extends GeneratedMessageLite<Status, Builder> implements StatusOrBuilder {
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

    @Override // com.yhchat.canarys.proto.group.StatusOrBuilder
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

    @Override // com.yhchat.canarys.proto.group.StatusOrBuilder
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

    @Override // com.yhchat.canarys.proto.group.StatusOrBuilder
    public String getMsg() {
        return this.msg_;
    }

    @Override // com.yhchat.canarys.proto.group.StatusOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.StatusOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.StatusOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.StatusOrBuilder
        public String getMsg() {
            return ((Status) this.instance).getMsg();
        }

        @Override // com.yhchat.canarys.proto.group.StatusOrBuilder
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
