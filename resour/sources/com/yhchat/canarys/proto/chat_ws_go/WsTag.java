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
public final class WsTag extends GeneratedMessageLite<WsTag, Builder> implements WsTagOrBuilder {
    public static final int COLOR_FIELD_NUMBER = 4;
    private static final WsTag DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<WsTag> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    private long id_;
    private String text_ = "";
    private String color_ = "";

    private WsTag() {
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsTagOrBuilder
    public long getId() {
        return this.id_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long value) {
        this.id_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsTagOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsTagOrBuilder
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

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsTagOrBuilder
    public String getColor() {
        return this.color_;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsTagOrBuilder
    public ByteString getColorBytes() {
        return ByteString.copyFromUtf8(this.color_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColor(String value) {
        value.getClass();
        this.color_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearColor() {
        this.color_ = getDefaultInstance().getColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setColorBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.color_ = value.toStringUtf8();
    }

    public static WsTag parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (WsTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static WsTag parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (WsTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static WsTag parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (WsTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static WsTag parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (WsTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static WsTag parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (WsTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static WsTag parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (WsTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static WsTag parseFrom(InputStream input) throws IOException {
        return (WsTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static WsTag parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (WsTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static WsTag parseDelimitedFrom(InputStream input) throws IOException {
        return (WsTag) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static WsTag parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (WsTag) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static WsTag parseFrom(CodedInputStream input) throws IOException {
        return (WsTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static WsTag parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (WsTag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(WsTag prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WsTag, Builder> implements WsTagOrBuilder {
        private Builder() {
            super(WsTag.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsTagOrBuilder
        public long getId() {
            return ((WsTag) this.instance).getId();
        }

        public Builder setId(long value) {
            copyOnWrite();
            ((WsTag) this.instance).setId(value);
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((WsTag) this.instance).clearId();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsTagOrBuilder
        public String getText() {
            return ((WsTag) this.instance).getText();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsTagOrBuilder
        public ByteString getTextBytes() {
            return ((WsTag) this.instance).getTextBytes();
        }

        public Builder setText(String value) {
            copyOnWrite();
            ((WsTag) this.instance).setText(value);
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((WsTag) this.instance).clearText();
            return this;
        }

        public Builder setTextBytes(ByteString value) {
            copyOnWrite();
            ((WsTag) this.instance).setTextBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsTagOrBuilder
        public String getColor() {
            return ((WsTag) this.instance).getColor();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsTagOrBuilder
        public ByteString getColorBytes() {
            return ((WsTag) this.instance).getColorBytes();
        }

        public Builder setColor(String value) {
            copyOnWrite();
            ((WsTag) this.instance).setColor(value);
            return this;
        }

        public Builder clearColor() {
            copyOnWrite();
            ((WsTag) this.instance).clearColor();
            return this;
        }

        public Builder setColorBytes(ByteString value) {
            copyOnWrite();
            ((WsTag) this.instance).setColorBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new WsTag();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"id_", "text_", "color_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0003\u0208\u0004\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<WsTag> parser = PARSER;
                if (parser == null) {
                    synchronized (WsTag.class) {
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
        WsTag defaultInstance = new WsTag();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(WsTag.class, defaultInstance);
    }

    public static WsTag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<WsTag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
