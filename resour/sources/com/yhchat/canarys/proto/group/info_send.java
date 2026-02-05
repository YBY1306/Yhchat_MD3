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
public final class info_send extends GeneratedMessageLite<info_send, Builder> implements info_sendOrBuilder {
    private static final info_send DEFAULT_INSTANCE;
    public static final int GROUP_ID_FIELD_NUMBER = 2;
    private static volatile Parser<info_send> PARSER;
    private String groupId_ = "";

    private info_send() {
    }

    @Override // com.yhchat.canarys.proto.group.info_sendOrBuilder
    public String getGroupId() {
        return this.groupId_;
    }

    @Override // com.yhchat.canarys.proto.group.info_sendOrBuilder
    public ByteString getGroupIdBytes() {
        return ByteString.copyFromUtf8(this.groupId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupId(String value) {
        value.getClass();
        this.groupId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupId() {
        this.groupId_ = getDefaultInstance().getGroupId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.groupId_ = value.toStringUtf8();
    }

    public static info_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static info_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static info_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static info_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static info_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static info_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static info_send parseFrom(InputStream input) throws IOException {
        return (info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static info_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static info_send parseDelimitedFrom(InputStream input) throws IOException {
        return (info_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static info_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (info_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static info_send parseFrom(CodedInputStream input) throws IOException {
        return (info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static info_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (info_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(info_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<info_send, Builder> implements info_sendOrBuilder {
        private Builder() {
            super(info_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.group.info_sendOrBuilder
        public String getGroupId() {
            return ((info_send) this.instance).getGroupId();
        }

        @Override // com.yhchat.canarys.proto.group.info_sendOrBuilder
        public ByteString getGroupIdBytes() {
            return ((info_send) this.instance).getGroupIdBytes();
        }

        public Builder setGroupId(String value) {
            copyOnWrite();
            ((info_send) this.instance).setGroupId(value);
            return this;
        }

        public Builder clearGroupId() {
            copyOnWrite();
            ((info_send) this.instance).clearGroupId();
            return this;
        }

        public Builder setGroupIdBytes(ByteString value) {
            copyOnWrite();
            ((info_send) this.instance).setGroupIdBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new info_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"groupId_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<info_send> parser = PARSER;
                if (parser == null) {
                    synchronized (info_send.class) {
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
        info_send defaultInstance = new info_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(info_send.class, defaultInstance);
    }

    public static info_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<info_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
