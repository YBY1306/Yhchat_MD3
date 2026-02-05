package com.yhchat.canarys.proto.chat_ws_go;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class INFO extends GeneratedMessageLite<INFO, Builder> implements INFOOrBuilder {
    public static final int CMD_FIELD_NUMBER = 2;
    private static final INFO DEFAULT_INSTANCE;
    private static volatile Parser<INFO> PARSER = null;
    public static final int SEQ_FIELD_NUMBER = 1;
    private String seq_ = "";
    private String cmd_ = "";

    private INFO() {
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.INFOOrBuilder
    public String getSeq() {
        return this.seq_;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.INFOOrBuilder
    public ByteString getSeqBytes() {
        return ByteString.copyFromUtf8(this.seq_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeq(String value) {
        value.getClass();
        this.seq_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSeq() {
        this.seq_ = getDefaultInstance().getSeq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeqBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.seq_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.INFOOrBuilder
    public String getCmd() {
        return this.cmd_;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.INFOOrBuilder
    public ByteString getCmdBytes() {
        return ByteString.copyFromUtf8(this.cmd_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmd(String value) {
        value.getClass();
        this.cmd_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmd() {
        this.cmd_ = getDefaultInstance().getCmd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.cmd_ = value.toStringUtf8();
    }

    public static INFO parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (INFO) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static INFO parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (INFO) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static INFO parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (INFO) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static INFO parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (INFO) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static INFO parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (INFO) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static INFO parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (INFO) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static INFO parseFrom(InputStream input) throws IOException {
        return (INFO) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static INFO parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (INFO) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static INFO parseDelimitedFrom(InputStream input) throws IOException {
        return (INFO) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static INFO parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (INFO) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static INFO parseFrom(CodedInputStream input) throws IOException {
        return (INFO) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static INFO parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (INFO) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(INFO prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<INFO, Builder> implements INFOOrBuilder {
        private Builder() {
            super(INFO.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.INFOOrBuilder
        public String getSeq() {
            return ((INFO) this.instance).getSeq();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.INFOOrBuilder
        public ByteString getSeqBytes() {
            return ((INFO) this.instance).getSeqBytes();
        }

        public Builder setSeq(String value) {
            copyOnWrite();
            ((INFO) this.instance).setSeq(value);
            return this;
        }

        public Builder clearSeq() {
            copyOnWrite();
            ((INFO) this.instance).clearSeq();
            return this;
        }

        public Builder setSeqBytes(ByteString value) {
            copyOnWrite();
            ((INFO) this.instance).setSeqBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.INFOOrBuilder
        public String getCmd() {
            return ((INFO) this.instance).getCmd();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.INFOOrBuilder
        public ByteString getCmdBytes() {
            return ((INFO) this.instance).getCmdBytes();
        }

        public Builder setCmd(String value) {
            copyOnWrite();
            ((INFO) this.instance).setCmd(value);
            return this;
        }

        public Builder clearCmd() {
            copyOnWrite();
            ((INFO) this.instance).clearCmd();
            return this;
        }

        public Builder setCmdBytes(ByteString value) {
            copyOnWrite();
            ((INFO) this.instance).setCmdBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new INFO();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"seq_", "cmd_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<INFO> parser = PARSER;
                if (parser == null) {
                    synchronized (INFO.class) {
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
        INFO defaultInstance = new INFO();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(INFO.class, defaultInstance);
    }

    public static INFO getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<INFO> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
