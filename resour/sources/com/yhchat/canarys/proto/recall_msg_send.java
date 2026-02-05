package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class recall_msg_send extends GeneratedMessageLite<recall_msg_send, Builder> implements recall_msg_sendOrBuilder {
    public static final int CHAT_ID_FIELD_NUMBER = 3;
    public static final int CHAT_TYPE_FIELD_NUMBER = 4;
    private static final recall_msg_send DEFAULT_INSTANCE;
    public static final int MSG_ID_FIELD_NUMBER = 2;
    private static volatile Parser<recall_msg_send> PARSER;
    private long chatType_;
    private String msgId_ = "";
    private String chatId_ = "";

    private recall_msg_send() {
    }

    @Override // com.yhchat.canarys.proto.recall_msg_sendOrBuilder
    public String getMsgId() {
        return this.msgId_;
    }

    @Override // com.yhchat.canarys.proto.recall_msg_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.recall_msg_sendOrBuilder
    public String getChatId() {
        return this.chatId_;
    }

    @Override // com.yhchat.canarys.proto.recall_msg_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.recall_msg_sendOrBuilder
    public long getChatType() {
        return this.chatType_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatType(long value) {
        this.chatType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatType() {
        this.chatType_ = 0L;
    }

    public static recall_msg_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (recall_msg_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static recall_msg_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (recall_msg_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static recall_msg_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (recall_msg_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static recall_msg_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (recall_msg_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static recall_msg_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (recall_msg_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static recall_msg_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (recall_msg_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static recall_msg_send parseFrom(InputStream input) throws IOException {
        return (recall_msg_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static recall_msg_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (recall_msg_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static recall_msg_send parseDelimitedFrom(InputStream input) throws IOException {
        return (recall_msg_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static recall_msg_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (recall_msg_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static recall_msg_send parseFrom(CodedInputStream input) throws IOException {
        return (recall_msg_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static recall_msg_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (recall_msg_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(recall_msg_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<recall_msg_send, Builder> implements recall_msg_sendOrBuilder {
        private Builder() {
            super(recall_msg_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.recall_msg_sendOrBuilder
        public String getMsgId() {
            return ((recall_msg_send) this.instance).getMsgId();
        }

        @Override // com.yhchat.canarys.proto.recall_msg_sendOrBuilder
        public ByteString getMsgIdBytes() {
            return ((recall_msg_send) this.instance).getMsgIdBytes();
        }

        public Builder setMsgId(String value) {
            copyOnWrite();
            ((recall_msg_send) this.instance).setMsgId(value);
            return this;
        }

        public Builder clearMsgId() {
            copyOnWrite();
            ((recall_msg_send) this.instance).clearMsgId();
            return this;
        }

        public Builder setMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((recall_msg_send) this.instance).setMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.recall_msg_sendOrBuilder
        public String getChatId() {
            return ((recall_msg_send) this.instance).getChatId();
        }

        @Override // com.yhchat.canarys.proto.recall_msg_sendOrBuilder
        public ByteString getChatIdBytes() {
            return ((recall_msg_send) this.instance).getChatIdBytes();
        }

        public Builder setChatId(String value) {
            copyOnWrite();
            ((recall_msg_send) this.instance).setChatId(value);
            return this;
        }

        public Builder clearChatId() {
            copyOnWrite();
            ((recall_msg_send) this.instance).clearChatId();
            return this;
        }

        public Builder setChatIdBytes(ByteString value) {
            copyOnWrite();
            ((recall_msg_send) this.instance).setChatIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.recall_msg_sendOrBuilder
        public long getChatType() {
            return ((recall_msg_send) this.instance).getChatType();
        }

        public Builder setChatType(long value) {
            copyOnWrite();
            ((recall_msg_send) this.instance).setChatType(value);
            return this;
        }

        public Builder clearChatType() {
            copyOnWrite();
            ((recall_msg_send) this.instance).clearChatType();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new recall_msg_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"msgId_", "chatId_", "chatType_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u0208\u0003\u0208\u0004\u0002", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<recall_msg_send> parser = PARSER;
                if (parser == null) {
                    synchronized (recall_msg_send.class) {
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
        recall_msg_send defaultInstance = new recall_msg_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(recall_msg_send.class, defaultInstance);
    }

    public static recall_msg_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<recall_msg_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
