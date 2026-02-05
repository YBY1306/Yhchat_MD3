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
public final class button_report_send extends GeneratedMessageLite<button_report_send, Builder> implements button_report_sendOrBuilder {
    public static final int BUTTON_VALUE_FIELD_NUMBER = 6;
    public static final int CHAT_ID_FIELD_NUMBER = 4;
    public static final int CHAT_TYPE_FIELD_NUMBER = 3;
    private static final button_report_send DEFAULT_INSTANCE;
    public static final int MSG_ID_FIELD_NUMBER = 2;
    private static volatile Parser<button_report_send> PARSER = null;
    public static final int USER_ID_FIELD_NUMBER = 5;
    private long chatType_;
    private String msgId_ = "";
    private String chatId_ = "";
    private String userId_ = "";
    private String buttonValue_ = "";

    private button_report_send() {
    }

    @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
    public String getMsgId() {
        return this.msgId_;
    }

    @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
    public String getChatId() {
        return this.chatId_;
    }

    @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
    public String getUserId() {
        return this.userId_;
    }

    @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.userId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserId(String value) {
        value.getClass();
        this.userId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserId() {
        this.userId_ = getDefaultInstance().getUserId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.userId_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
    public String getButtonValue() {
        return this.buttonValue_;
    }

    @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
    public ByteString getButtonValueBytes() {
        return ByteString.copyFromUtf8(this.buttonValue_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonValue(String value) {
        value.getClass();
        this.buttonValue_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButtonValue() {
        this.buttonValue_ = getDefaultInstance().getButtonValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonValueBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.buttonValue_ = value.toStringUtf8();
    }

    public static button_report_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (button_report_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static button_report_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (button_report_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static button_report_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (button_report_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static button_report_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (button_report_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static button_report_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (button_report_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static button_report_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (button_report_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static button_report_send parseFrom(InputStream input) throws IOException {
        return (button_report_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static button_report_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (button_report_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static button_report_send parseDelimitedFrom(InputStream input) throws IOException {
        return (button_report_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static button_report_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (button_report_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static button_report_send parseFrom(CodedInputStream input) throws IOException {
        return (button_report_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static button_report_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (button_report_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(button_report_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<button_report_send, Builder> implements button_report_sendOrBuilder {
        private Builder() {
            super(button_report_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
        public String getMsgId() {
            return ((button_report_send) this.instance).getMsgId();
        }

        @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
        public ByteString getMsgIdBytes() {
            return ((button_report_send) this.instance).getMsgIdBytes();
        }

        public Builder setMsgId(String value) {
            copyOnWrite();
            ((button_report_send) this.instance).setMsgId(value);
            return this;
        }

        public Builder clearMsgId() {
            copyOnWrite();
            ((button_report_send) this.instance).clearMsgId();
            return this;
        }

        public Builder setMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((button_report_send) this.instance).setMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
        public long getChatType() {
            return ((button_report_send) this.instance).getChatType();
        }

        public Builder setChatType(long value) {
            copyOnWrite();
            ((button_report_send) this.instance).setChatType(value);
            return this;
        }

        public Builder clearChatType() {
            copyOnWrite();
            ((button_report_send) this.instance).clearChatType();
            return this;
        }

        @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
        public String getChatId() {
            return ((button_report_send) this.instance).getChatId();
        }

        @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
        public ByteString getChatIdBytes() {
            return ((button_report_send) this.instance).getChatIdBytes();
        }

        public Builder setChatId(String value) {
            copyOnWrite();
            ((button_report_send) this.instance).setChatId(value);
            return this;
        }

        public Builder clearChatId() {
            copyOnWrite();
            ((button_report_send) this.instance).clearChatId();
            return this;
        }

        public Builder setChatIdBytes(ByteString value) {
            copyOnWrite();
            ((button_report_send) this.instance).setChatIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
        public String getUserId() {
            return ((button_report_send) this.instance).getUserId();
        }

        @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
        public ByteString getUserIdBytes() {
            return ((button_report_send) this.instance).getUserIdBytes();
        }

        public Builder setUserId(String value) {
            copyOnWrite();
            ((button_report_send) this.instance).setUserId(value);
            return this;
        }

        public Builder clearUserId() {
            copyOnWrite();
            ((button_report_send) this.instance).clearUserId();
            return this;
        }

        public Builder setUserIdBytes(ByteString value) {
            copyOnWrite();
            ((button_report_send) this.instance).setUserIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
        public String getButtonValue() {
            return ((button_report_send) this.instance).getButtonValue();
        }

        @Override // com.yhchat.canarys.proto.button_report_sendOrBuilder
        public ByteString getButtonValueBytes() {
            return ((button_report_send) this.instance).getButtonValueBytes();
        }

        public Builder setButtonValue(String value) {
            copyOnWrite();
            ((button_report_send) this.instance).setButtonValue(value);
            return this;
        }

        public Builder clearButtonValue() {
            copyOnWrite();
            ((button_report_send) this.instance).clearButtonValue();
            return this;
        }

        public Builder setButtonValueBytes(ByteString value) {
            copyOnWrite();
            ((button_report_send) this.instance).setButtonValueBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new button_report_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"msgId_", "chatType_", "chatId_", "userId_", "buttonValue_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002\u0208\u0003\u0002\u0004\u0208\u0005\u0208\u0006\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<button_report_send> parser = PARSER;
                if (parser == null) {
                    synchronized (button_report_send.class) {
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
        button_report_send defaultInstance = new button_report_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(button_report_send.class, defaultInstance);
    }

    public static button_report_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<button_report_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
