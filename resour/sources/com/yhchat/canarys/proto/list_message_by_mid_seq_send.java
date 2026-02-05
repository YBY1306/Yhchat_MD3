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
public final class list_message_by_mid_seq_send extends GeneratedMessageLite<list_message_by_mid_seq_send, Builder> implements list_message_by_mid_seq_sendOrBuilder {
    public static final int CHAT_ID_FIELD_NUMBER = 5;
    public static final int CHAT_TYPE_FIELD_NUMBER = 4;
    private static final list_message_by_mid_seq_send DEFAULT_INSTANCE;
    public static final int MSG_COUNT_FIELD_NUMBER = 7;
    public static final int MSG_ID_FIELD_NUMBER = 8;
    public static final int MSG_SEQ_FIELD_NUMBER = 3;
    private static volatile Parser<list_message_by_mid_seq_send> PARSER = null;
    public static final int UNKNOWN_FIELD_NUMBER = 6;
    private long chatType_;
    private long msgCount_;
    private long msgSeq_;
    private long unknown_;
    private String chatId_ = "";
    private String msgId_ = "";

    private list_message_by_mid_seq_send() {
    }

    @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
    public long getMsgSeq() {
        return this.msgSeq_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgSeq(long value) {
        this.msgSeq_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgSeq() {
        this.msgSeq_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
    public String getChatId() {
        return this.chatId_;
    }

    @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
    public long getUnknown() {
        return this.unknown_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnknown(long value) {
        this.unknown_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnknown() {
        this.unknown_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
    public String getMsgId() {
        return this.msgId_;
    }

    @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
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

    public static list_message_by_mid_seq_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (list_message_by_mid_seq_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_message_by_mid_seq_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_message_by_mid_seq_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_message_by_mid_seq_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (list_message_by_mid_seq_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_message_by_mid_seq_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_message_by_mid_seq_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_message_by_mid_seq_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (list_message_by_mid_seq_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_message_by_mid_seq_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_message_by_mid_seq_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_message_by_mid_seq_send parseFrom(InputStream input) throws IOException {
        return (list_message_by_mid_seq_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static list_message_by_mid_seq_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_message_by_mid_seq_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static list_message_by_mid_seq_send parseDelimitedFrom(InputStream input) throws IOException {
        return (list_message_by_mid_seq_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static list_message_by_mid_seq_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_message_by_mid_seq_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static list_message_by_mid_seq_send parseFrom(CodedInputStream input) throws IOException {
        return (list_message_by_mid_seq_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static list_message_by_mid_seq_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_message_by_mid_seq_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(list_message_by_mid_seq_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<list_message_by_mid_seq_send, Builder> implements list_message_by_mid_seq_sendOrBuilder {
        private Builder() {
            super(list_message_by_mid_seq_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
        public long getMsgSeq() {
            return ((list_message_by_mid_seq_send) this.instance).getMsgSeq();
        }

        public Builder setMsgSeq(long value) {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).setMsgSeq(value);
            return this;
        }

        public Builder clearMsgSeq() {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).clearMsgSeq();
            return this;
        }

        @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
        public long getChatType() {
            return ((list_message_by_mid_seq_send) this.instance).getChatType();
        }

        public Builder setChatType(long value) {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).setChatType(value);
            return this;
        }

        public Builder clearChatType() {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).clearChatType();
            return this;
        }

        @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
        public String getChatId() {
            return ((list_message_by_mid_seq_send) this.instance).getChatId();
        }

        @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
        public ByteString getChatIdBytes() {
            return ((list_message_by_mid_seq_send) this.instance).getChatIdBytes();
        }

        public Builder setChatId(String value) {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).setChatId(value);
            return this;
        }

        public Builder clearChatId() {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).clearChatId();
            return this;
        }

        public Builder setChatIdBytes(ByteString value) {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).setChatIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
        public long getUnknown() {
            return ((list_message_by_mid_seq_send) this.instance).getUnknown();
        }

        public Builder setUnknown(long value) {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).setUnknown(value);
            return this;
        }

        public Builder clearUnknown() {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).clearUnknown();
            return this;
        }

        @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
        public long getMsgCount() {
            return ((list_message_by_mid_seq_send) this.instance).getMsgCount();
        }

        public Builder setMsgCount(long value) {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).setMsgCount(value);
            return this;
        }

        public Builder clearMsgCount() {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).clearMsgCount();
            return this;
        }

        @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
        public String getMsgId() {
            return ((list_message_by_mid_seq_send) this.instance).getMsgId();
        }

        @Override // com.yhchat.canarys.proto.list_message_by_mid_seq_sendOrBuilder
        public ByteString getMsgIdBytes() {
            return ((list_message_by_mid_seq_send) this.instance).getMsgIdBytes();
        }

        public Builder setMsgId(String value) {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).setMsgId(value);
            return this;
        }

        public Builder clearMsgId() {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).clearMsgId();
            return this;
        }

        public Builder setMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((list_message_by_mid_seq_send) this.instance).setMsgIdBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new list_message_by_mid_seq_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"msgSeq_", "chatType_", "chatId_", "unknown_", "msgCount_", "msgId_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0003\b\u0006\u0000\u0000\u0000\u0003\u0002\u0004\u0002\u0005\u0208\u0006\u0002\u0007\u0002\b\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<list_message_by_mid_seq_send> parser = PARSER;
                if (parser == null) {
                    synchronized (list_message_by_mid_seq_send.class) {
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
        list_message_by_mid_seq_send defaultInstance = new list_message_by_mid_seq_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(list_message_by_mid_seq_send.class, defaultInstance);
    }

    public static list_message_by_mid_seq_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<list_message_by_mid_seq_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
