package com.yhchat.canarys.proto.instruction;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes17.dex */
public final class get_bot_instruction extends GeneratedMessageLite<get_bot_instruction, Builder> implements get_bot_instructionOrBuilder {
    private static final get_bot_instruction DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 3;
    private static volatile Parser<get_bot_instruction> PARSER;
    private String id_ = "";

    private get_bot_instruction() {
    }

    @Override // com.yhchat.canarys.proto.instruction.get_bot_instructionOrBuilder
    public String getId() {
        return this.id_;
    }

    @Override // com.yhchat.canarys.proto.instruction.get_bot_instructionOrBuilder
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

    public static get_bot_instruction parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (get_bot_instruction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static get_bot_instruction parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (get_bot_instruction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static get_bot_instruction parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (get_bot_instruction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static get_bot_instruction parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (get_bot_instruction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static get_bot_instruction parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (get_bot_instruction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static get_bot_instruction parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (get_bot_instruction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static get_bot_instruction parseFrom(InputStream input) throws IOException {
        return (get_bot_instruction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static get_bot_instruction parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (get_bot_instruction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static get_bot_instruction parseDelimitedFrom(InputStream input) throws IOException {
        return (get_bot_instruction) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static get_bot_instruction parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (get_bot_instruction) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static get_bot_instruction parseFrom(CodedInputStream input) throws IOException {
        return (get_bot_instruction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static get_bot_instruction parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (get_bot_instruction) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(get_bot_instruction prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<get_bot_instruction, Builder> implements get_bot_instructionOrBuilder {
        private Builder() {
            super(get_bot_instruction.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.instruction.get_bot_instructionOrBuilder
        public String getId() {
            return ((get_bot_instruction) this.instance).getId();
        }

        @Override // com.yhchat.canarys.proto.instruction.get_bot_instructionOrBuilder
        public ByteString getIdBytes() {
            return ((get_bot_instruction) this.instance).getIdBytes();
        }

        public Builder setId(String value) {
            copyOnWrite();
            ((get_bot_instruction) this.instance).setId(value);
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((get_bot_instruction) this.instance).clearId();
            return this;
        }

        public Builder setIdBytes(ByteString value) {
            copyOnWrite();
            ((get_bot_instruction) this.instance).setIdBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new get_bot_instruction();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"id_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0000\u0000\u0003\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<get_bot_instruction> parser = PARSER;
                if (parser == null) {
                    synchronized (get_bot_instruction.class) {
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
        get_bot_instruction defaultInstance = new get_bot_instruction();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(get_bot_instruction.class, defaultInstance);
    }

    public static get_bot_instruction getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<get_bot_instruction> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
