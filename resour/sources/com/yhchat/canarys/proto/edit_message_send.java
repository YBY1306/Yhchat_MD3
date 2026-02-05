package com.yhchat.canarys.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
public final class edit_message_send extends GeneratedMessageLite<edit_message_send, Builder> implements edit_message_sendOrBuilder {
    public static final int CHAT_ID_FIELD_NUMBER = 3;
    public static final int CHAT_TYPE_FIELD_NUMBER = 4;
    public static final int CONTENT_FIELD_NUMBER = 5;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 6;
    private static final edit_message_send DEFAULT_INSTANCE;
    public static final int MSG_ID_FIELD_NUMBER = 2;
    private static volatile Parser<edit_message_send> PARSER = null;
    public static final int QUOTE_MSG_ID_FIELD_NUMBER = 8;
    private int bitField0_;
    private int chatType_;
    private long contentType_;
    private Content content_;
    private String msgId_ = "";
    private String chatId_ = "";
    private String quoteMsgId_ = "";

    public interface ContentOrBuilder extends MessageLiteOrBuilder {
        String getButtons();

        ByteString getButtonsBytes();

        String getQuoteMsgText();

        ByteString getQuoteMsgTextBytes();

        String getText();

        ByteString getTextBytes();
    }

    private edit_message_send() {
    }

    public static final class Content extends GeneratedMessageLite<Content, Builder> implements ContentOrBuilder {
        public static final int BUTTONS_FIELD_NUMBER = 2;
        private static final Content DEFAULT_INSTANCE;
        private static volatile Parser<Content> PARSER = null;
        public static final int QUOTE_MSG_TEXT_FIELD_NUMBER = 8;
        public static final int TEXT_FIELD_NUMBER = 1;
        private String text_ = "";
        private String buttons_ = "";
        private String quoteMsgText_ = "";

        private Content() {
        }

        @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String value) {
            value.getClass();
            this.text_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.text_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
        public String getButtons() {
            return this.buttons_;
        }

        @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
        public ByteString getButtonsBytes() {
            return ByteString.copyFromUtf8(this.buttons_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtons(String value) {
            value.getClass();
            this.buttons_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtons() {
            this.buttons_ = getDefaultInstance().getButtons();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonsBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.buttons_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
        public String getQuoteMsgText() {
            return this.quoteMsgText_;
        }

        @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
        public ByteString getQuoteMsgTextBytes() {
            return ByteString.copyFromUtf8(this.quoteMsgText_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteMsgText(String value) {
            value.getClass();
            this.quoteMsgText_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuoteMsgText() {
            this.quoteMsgText_ = getDefaultInstance().getQuoteMsgText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteMsgTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.quoteMsgText_ = value.toStringUtf8();
        }

        public static Content parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Content parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Content parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Content parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Content parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Content parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Content parseFrom(InputStream input) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Content parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Content parseDelimitedFrom(InputStream input) throws IOException {
            return (Content) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Content parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Content) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Content parseFrom(CodedInputStream input) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Content parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Content prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Content, Builder> implements ContentOrBuilder {
            private Builder() {
                super(Content.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
            public String getText() {
                return ((Content) this.instance).getText();
            }

            @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
            public ByteString getTextBytes() {
                return ((Content) this.instance).getTextBytes();
            }

            public Builder setText(String value) {
                copyOnWrite();
                ((Content) this.instance).setText(value);
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((Content) this.instance).clearText();
                return this;
            }

            public Builder setTextBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
            public String getButtons() {
                return ((Content) this.instance).getButtons();
            }

            @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
            public ByteString getButtonsBytes() {
                return ((Content) this.instance).getButtonsBytes();
            }

            public Builder setButtons(String value) {
                copyOnWrite();
                ((Content) this.instance).setButtons(value);
                return this;
            }

            public Builder clearButtons() {
                copyOnWrite();
                ((Content) this.instance).clearButtons();
                return this;
            }

            public Builder setButtonsBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setButtonsBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
            public String getQuoteMsgText() {
                return ((Content) this.instance).getQuoteMsgText();
            }

            @Override // com.yhchat.canarys.proto.edit_message_send.ContentOrBuilder
            public ByteString getQuoteMsgTextBytes() {
                return ((Content) this.instance).getQuoteMsgTextBytes();
            }

            public Builder setQuoteMsgText(String value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteMsgText(value);
                return this;
            }

            public Builder clearQuoteMsgText() {
                copyOnWrite();
                ((Content) this.instance).clearQuoteMsgText();
                return this;
            }

            public Builder setQuoteMsgTextBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteMsgTextBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Content();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"text_", "buttons_", "quoteMsgText_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\b\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208\b\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Content> parser = PARSER;
                    if (parser == null) {
                        synchronized (Content.class) {
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
            Content defaultInstance = new Content();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Content.class, defaultInstance);
        }

        public static Content getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Content> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
    public String getMsgId() {
        return this.msgId_;
    }

    @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
    public String getChatId() {
        return this.chatId_;
    }

    @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
    public int getChatType() {
        return this.chatType_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatType(int value) {
        this.chatType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatType() {
        this.chatType_ = 0;
    }

    @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
    public boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
    public Content getContent() {
        return this.content_ == null ? Content.getDefaultInstance() : this.content_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(Content value) {
        value.getClass();
        this.content_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContent(Content value) {
        value.getClass();
        if (this.content_ != null && this.content_ != Content.getDefaultInstance()) {
            this.content_ = Content.newBuilder(this.content_).mergeFrom((Content.Builder) value).buildPartial();
        } else {
            this.content_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
    public long getContentType() {
        return this.contentType_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentType(long value) {
        this.contentType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentType() {
        this.contentType_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
    public String getQuoteMsgId() {
        return this.quoteMsgId_;
    }

    @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
    public ByteString getQuoteMsgIdBytes() {
        return ByteString.copyFromUtf8(this.quoteMsgId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuoteMsgId(String value) {
        value.getClass();
        this.quoteMsgId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuoteMsgId() {
        this.quoteMsgId_ = getDefaultInstance().getQuoteMsgId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuoteMsgIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.quoteMsgId_ = value.toStringUtf8();
    }

    public static edit_message_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (edit_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static edit_message_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (edit_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static edit_message_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (edit_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static edit_message_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (edit_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static edit_message_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (edit_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static edit_message_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (edit_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static edit_message_send parseFrom(InputStream input) throws IOException {
        return (edit_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static edit_message_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (edit_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static edit_message_send parseDelimitedFrom(InputStream input) throws IOException {
        return (edit_message_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static edit_message_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (edit_message_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static edit_message_send parseFrom(CodedInputStream input) throws IOException {
        return (edit_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static edit_message_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (edit_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(edit_message_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<edit_message_send, Builder> implements edit_message_sendOrBuilder {
        private Builder() {
            super(edit_message_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
        public String getMsgId() {
            return ((edit_message_send) this.instance).getMsgId();
        }

        @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
        public ByteString getMsgIdBytes() {
            return ((edit_message_send) this.instance).getMsgIdBytes();
        }

        public Builder setMsgId(String value) {
            copyOnWrite();
            ((edit_message_send) this.instance).setMsgId(value);
            return this;
        }

        public Builder clearMsgId() {
            copyOnWrite();
            ((edit_message_send) this.instance).clearMsgId();
            return this;
        }

        public Builder setMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((edit_message_send) this.instance).setMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
        public String getChatId() {
            return ((edit_message_send) this.instance).getChatId();
        }

        @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
        public ByteString getChatIdBytes() {
            return ((edit_message_send) this.instance).getChatIdBytes();
        }

        public Builder setChatId(String value) {
            copyOnWrite();
            ((edit_message_send) this.instance).setChatId(value);
            return this;
        }

        public Builder clearChatId() {
            copyOnWrite();
            ((edit_message_send) this.instance).clearChatId();
            return this;
        }

        public Builder setChatIdBytes(ByteString value) {
            copyOnWrite();
            ((edit_message_send) this.instance).setChatIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
        public int getChatType() {
            return ((edit_message_send) this.instance).getChatType();
        }

        public Builder setChatType(int value) {
            copyOnWrite();
            ((edit_message_send) this.instance).setChatType(value);
            return this;
        }

        public Builder clearChatType() {
            copyOnWrite();
            ((edit_message_send) this.instance).clearChatType();
            return this;
        }

        @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
        public boolean hasContent() {
            return ((edit_message_send) this.instance).hasContent();
        }

        @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
        public Content getContent() {
            return ((edit_message_send) this.instance).getContent();
        }

        public Builder setContent(Content value) {
            copyOnWrite();
            ((edit_message_send) this.instance).setContent(value);
            return this;
        }

        public Builder setContent(Content.Builder builderForValue) {
            copyOnWrite();
            ((edit_message_send) this.instance).setContent(builderForValue.build());
            return this;
        }

        public Builder mergeContent(Content value) {
            copyOnWrite();
            ((edit_message_send) this.instance).mergeContent(value);
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((edit_message_send) this.instance).clearContent();
            return this;
        }

        @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
        public long getContentType() {
            return ((edit_message_send) this.instance).getContentType();
        }

        public Builder setContentType(long value) {
            copyOnWrite();
            ((edit_message_send) this.instance).setContentType(value);
            return this;
        }

        public Builder clearContentType() {
            copyOnWrite();
            ((edit_message_send) this.instance).clearContentType();
            return this;
        }

        @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
        public String getQuoteMsgId() {
            return ((edit_message_send) this.instance).getQuoteMsgId();
        }

        @Override // com.yhchat.canarys.proto.edit_message_sendOrBuilder
        public ByteString getQuoteMsgIdBytes() {
            return ((edit_message_send) this.instance).getQuoteMsgIdBytes();
        }

        public Builder setQuoteMsgId(String value) {
            copyOnWrite();
            ((edit_message_send) this.instance).setQuoteMsgId(value);
            return this;
        }

        public Builder clearQuoteMsgId() {
            copyOnWrite();
            ((edit_message_send) this.instance).clearQuoteMsgId();
            return this;
        }

        public Builder setQuoteMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((edit_message_send) this.instance).setQuoteMsgIdBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new edit_message_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "msgId_", "chatId_", "chatType_", "content_", "contentType_", "quoteMsgId_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0000\u0002\u0208\u0003\u0208\u0004\u0004\u0005\u1009\u0000\u0006\u0002\b\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<edit_message_send> parser = PARSER;
                if (parser == null) {
                    synchronized (edit_message_send.class) {
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
        edit_message_send defaultInstance = new edit_message_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(edit_message_send.class, defaultInstance);
    }

    public static edit_message_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<edit_message_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
