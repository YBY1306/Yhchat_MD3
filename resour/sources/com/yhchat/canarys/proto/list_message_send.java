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
public final class list_message_send extends GeneratedMessageLite<list_message_send, Builder> implements list_message_sendOrBuilder {
    public static final int CHAT_ID_FIELD_NUMBER = 5;
    public static final int CHAT_TYPE_FIELD_NUMBER = 4;
    private static final list_message_send DEFAULT_INSTANCE;
    public static final int MSG_COUNT_FIELD_NUMBER = 2;
    public static final int MSG_ID_FIELD_NUMBER = 3;
    private static volatile Parser<list_message_send> PARSER;
    private long chatType_;
    private long msgCount_;
    private String msgId_ = "";
    private String chatId_ = "";

    private list_message_send() {
    }

    @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
    public long getMsgCount() {
        return this.msgCount_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgCount(long value) {
        this.msgCount_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgCount() {
        this.msgCount_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
    public String getMsgId() {
        return this.msgId_;
    }

    @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
    public String getChatId() {
        return this.chatId_;
    }

    @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
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

    public static list_message_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (list_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_message_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_message_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (list_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_message_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_message_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (list_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_message_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_message_send parseFrom(InputStream input) throws IOException {
        return (list_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static list_message_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static list_message_send parseDelimitedFrom(InputStream input) throws IOException {
        return (list_message_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static list_message_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_message_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static list_message_send parseFrom(CodedInputStream input) throws IOException {
        return (list_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static list_message_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(list_message_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<list_message_send, Builder> implements list_message_sendOrBuilder {
        private Builder() {
            super(list_message_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
        public long getMsgCount() {
            return ((list_message_send) this.instance).getMsgCount();
        }

        public Builder setMsgCount(long value) {
            copyOnWrite();
            ((list_message_send) this.instance).setMsgCount(value);
            return this;
        }

        public Builder clearMsgCount() {
            copyOnWrite();
            ((list_message_send) this.instance).clearMsgCount();
            return this;
        }

        @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
        public String getMsgId() {
            return ((list_message_send) this.instance).getMsgId();
        }

        @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
        public ByteString getMsgIdBytes() {
            return ((list_message_send) this.instance).getMsgIdBytes();
        }

        public Builder setMsgId(String value) {
            copyOnWrite();
            ((list_message_send) this.instance).setMsgId(value);
            return this;
        }

        public Builder clearMsgId() {
            copyOnWrite();
            ((list_message_send) this.instance).clearMsgId();
            return this;
        }

        public Builder setMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((list_message_send) this.instance).setMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
        public long getChatType() {
            return ((list_message_send) this.instance).getChatType();
        }

        public Builder setChatType(long value) {
            copyOnWrite();
            ((list_message_send) this.instance).setChatType(value);
            return this;
        }

        public Builder clearChatType() {
            copyOnWrite();
            ((list_message_send) this.instance).clearChatType();
            return this;
        }

        @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
        public String getChatId() {
            return ((list_message_send) this.instance).getChatId();
        }

        @Override // com.yhchat.canarys.proto.list_message_sendOrBuilder
        public ByteString getChatIdBytes() {
            return ((list_message_send) this.instance).getChatIdBytes();
        }

        public Builder setChatId(String value) {
            copyOnWrite();
            ((list_message_send) this.instance).setChatId(value);
            return this;
        }

        public Builder clearChatId() {
            copyOnWrite();
            ((list_message_send) this.instance).clearChatId();
            return this;
        }

        public Builder setChatIdBytes(ByteString value) {
            copyOnWrite();
            ((list_message_send) this.instance).setChatIdBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new list_message_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"msgCount_", "msgId_", "chatType_", "chatId_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002\u0002\u0003\u0208\u0004\u0002\u0005\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<list_message_send> parser = PARSER;
                if (parser == null) {
                    synchronized (list_message_send.class) {
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
        list_message_send defaultInstance = new list_message_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(list_message_send.class, defaultInstance);
    }

    public static list_message_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<list_message_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
