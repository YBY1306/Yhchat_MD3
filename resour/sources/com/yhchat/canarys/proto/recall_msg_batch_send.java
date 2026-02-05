package com.yhchat.canarys.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class recall_msg_batch_send extends GeneratedMessageLite<recall_msg_batch_send, Builder> implements recall_msg_batch_sendOrBuilder {
    public static final int CHAT_ID_FIELD_NUMBER = 3;
    public static final int CHAT_TYPE_FIELD_NUMBER = 4;
    private static final recall_msg_batch_send DEFAULT_INSTANCE;
    public static final int MSG_ID_FIELD_NUMBER = 2;
    private static volatile Parser<recall_msg_batch_send> PARSER;
    private long chatType_;
    private Internal.ProtobufList<String> msgId_ = GeneratedMessageLite.emptyProtobufList();
    private String chatId_ = "";

    private recall_msg_batch_send() {
    }

    @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
    public List<String> getMsgIdList() {
        return this.msgId_;
    }

    @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
    public int getMsgIdCount() {
        return this.msgId_.size();
    }

    @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
    public String getMsgId(int index) {
        return this.msgId_.get(index);
    }

    @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
    public ByteString getMsgIdBytes(int index) {
        return ByteString.copyFromUtf8(this.msgId_.get(index));
    }

    private void ensureMsgIdIsMutable() {
        Internal.ProtobufList<String> tmp = this.msgId_;
        if (!tmp.isModifiable()) {
            this.msgId_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgId(int index, String value) {
        value.getClass();
        ensureMsgIdIsMutable();
        this.msgId_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMsgId(String value) {
        value.getClass();
        ensureMsgIdIsMutable();
        this.msgId_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMsgId(Iterable<String> values) {
        ensureMsgIdIsMutable();
        AbstractMessageLite.addAll(values, this.msgId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgId() {
        this.msgId_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMsgIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        ensureMsgIdIsMutable();
        this.msgId_.add(value.toStringUtf8());
    }

    @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
    public String getChatId() {
        return this.chatId_;
    }

    @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
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

    public static recall_msg_batch_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (recall_msg_batch_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static recall_msg_batch_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (recall_msg_batch_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static recall_msg_batch_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (recall_msg_batch_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static recall_msg_batch_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (recall_msg_batch_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static recall_msg_batch_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (recall_msg_batch_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static recall_msg_batch_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (recall_msg_batch_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static recall_msg_batch_send parseFrom(InputStream input) throws IOException {
        return (recall_msg_batch_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static recall_msg_batch_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (recall_msg_batch_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static recall_msg_batch_send parseDelimitedFrom(InputStream input) throws IOException {
        return (recall_msg_batch_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static recall_msg_batch_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (recall_msg_batch_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static recall_msg_batch_send parseFrom(CodedInputStream input) throws IOException {
        return (recall_msg_batch_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static recall_msg_batch_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (recall_msg_batch_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(recall_msg_batch_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<recall_msg_batch_send, Builder> implements recall_msg_batch_sendOrBuilder {
        private Builder() {
            super(recall_msg_batch_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
        public List<String> getMsgIdList() {
            return Collections.unmodifiableList(((recall_msg_batch_send) this.instance).getMsgIdList());
        }

        @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
        public int getMsgIdCount() {
            return ((recall_msg_batch_send) this.instance).getMsgIdCount();
        }

        @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
        public String getMsgId(int index) {
            return ((recall_msg_batch_send) this.instance).getMsgId(index);
        }

        @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
        public ByteString getMsgIdBytes(int index) {
            return ((recall_msg_batch_send) this.instance).getMsgIdBytes(index);
        }

        public Builder setMsgId(int index, String value) {
            copyOnWrite();
            ((recall_msg_batch_send) this.instance).setMsgId(index, value);
            return this;
        }

        public Builder addMsgId(String value) {
            copyOnWrite();
            ((recall_msg_batch_send) this.instance).addMsgId(value);
            return this;
        }

        public Builder addAllMsgId(Iterable<String> values) {
            copyOnWrite();
            ((recall_msg_batch_send) this.instance).addAllMsgId(values);
            return this;
        }

        public Builder clearMsgId() {
            copyOnWrite();
            ((recall_msg_batch_send) this.instance).clearMsgId();
            return this;
        }

        public Builder addMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((recall_msg_batch_send) this.instance).addMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
        public String getChatId() {
            return ((recall_msg_batch_send) this.instance).getChatId();
        }

        @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
        public ByteString getChatIdBytes() {
            return ((recall_msg_batch_send) this.instance).getChatIdBytes();
        }

        public Builder setChatId(String value) {
            copyOnWrite();
            ((recall_msg_batch_send) this.instance).setChatId(value);
            return this;
        }

        public Builder clearChatId() {
            copyOnWrite();
            ((recall_msg_batch_send) this.instance).clearChatId();
            return this;
        }

        public Builder setChatIdBytes(ByteString value) {
            copyOnWrite();
            ((recall_msg_batch_send) this.instance).setChatIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.recall_msg_batch_sendOrBuilder
        public long getChatType() {
            return ((recall_msg_batch_send) this.instance).getChatType();
        }

        public Builder setChatType(long value) {
            copyOnWrite();
            ((recall_msg_batch_send) this.instance).setChatType(value);
            return this;
        }

        public Builder clearChatType() {
            copyOnWrite();
            ((recall_msg_batch_send) this.instance).clearChatType();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new recall_msg_batch_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"msgId_", "chatId_", "chatType_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0002\u0004\u0003\u0000\u0001\u0000\u0002\u021a\u0003\u0208\u0004\u0002", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<recall_msg_batch_send> parser = PARSER;
                if (parser == null) {
                    synchronized (recall_msg_batch_send.class) {
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
        recall_msg_batch_send defaultInstance = new recall_msg_batch_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(recall_msg_batch_send.class, defaultInstance);
    }

    public static recall_msg_batch_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<recall_msg_batch_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
