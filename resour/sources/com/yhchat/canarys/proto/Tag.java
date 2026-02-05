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
public final class Tag extends GeneratedMessageLite<Tag, Builder> implements TagOrBuilder {
    public static final int COLOR_FIELD_NUMBER = 4;
    private static final Tag DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile Parser<Tag> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 3;
    private long id_;
    private String text_ = "";
    private String color_ = "";

    private Tag() {
    }

    @Override // com.yhchat.canarys.proto.TagOrBuilder
    public long getId() {
        return this.id_;
    }

    public void setId(long value) {
        this.id_ = value;
    }

    public void clearId() {
        this.id_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.TagOrBuilder
    public String getText() {
        return this.text_;
    }

    @Override // com.yhchat.canarys.proto.TagOrBuilder
    public ByteString getTextBytes() {
        return ByteString.copyFromUtf8(this.text_);
    }

    public void setText(String value) {
        value.getClass();
        this.text_ = value;
    }

    public void clearText() {
        this.text_ = getDefaultInstance().getText();
    }

    public void setTextBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.text_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.TagOrBuilder
    public String getColor() {
        return this.color_;
    }

    @Override // com.yhchat.canarys.proto.TagOrBuilder
    public ByteString getColorBytes() {
        return ByteString.copyFromUtf8(this.color_);
    }

    public void setColor(String value) {
        value.getClass();
        this.color_ = value;
    }

    public void clearColor() {
        this.color_ = getDefaultInstance().getColor();
    }

    public void setColorBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.color_ = value.toStringUtf8();
    }

    public static Tag parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Tag parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Tag parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Tag parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Tag parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Tag parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Tag parseFrom(InputStream input) throws IOException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Tag parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Tag parseDelimitedFrom(InputStream input) throws IOException {
        return (Tag) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Tag parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Tag) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Tag parseFrom(CodedInputStream input) throws IOException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Tag parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Tag) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Tag prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Tag, Builder> implements TagOrBuilder {
        /* synthetic */ Builder(TagIA tagIA) {
            this();
        }

        private Builder() {
            super(Tag.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.TagOrBuilder
        public long getId() {
            return ((Tag) this.instance).getId();
        }

        public Builder setId(long value) {
            copyOnWrite();
            ((Tag) this.instance).setId(value);
            return this;
        }

        public Builder clearId() {
            copyOnWrite();
            ((Tag) this.instance).clearId();
            return this;
        }

        @Override // com.yhchat.canarys.proto.TagOrBuilder
        public String getText() {
            return ((Tag) this.instance).getText();
        }

        @Override // com.yhchat.canarys.proto.TagOrBuilder
        public ByteString getTextBytes() {
            return ((Tag) this.instance).getTextBytes();
        }

        public Builder setText(String value) {
            copyOnWrite();
            ((Tag) this.instance).setText(value);
            return this;
        }

        public Builder clearText() {
            copyOnWrite();
            ((Tag) this.instance).clearText();
            return this;
        }

        public Builder setTextBytes(ByteString value) {
            copyOnWrite();
            ((Tag) this.instance).setTextBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.TagOrBuilder
        public String getColor() {
            return ((Tag) this.instance).getColor();
        }

        @Override // com.yhchat.canarys.proto.TagOrBuilder
        public ByteString getColorBytes() {
            return ((Tag) this.instance).getColorBytes();
        }

        public Builder setColor(String value) {
            copyOnWrite();
            ((Tag) this.instance).setColor(value);
            return this;
        }

        public Builder clearColor() {
            copyOnWrite();
            ((Tag) this.instance).clearColor();
            return this;
        }

        public Builder setColorBytes(ByteString value) {
            copyOnWrite();
            ((Tag) this.instance).setColorBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new Tag();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"id_", "text_", "color_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0003\u0208\u0004\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Tag> parser = PARSER;
                if (parser == null) {
                    synchronized (Tag.class) {
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
        Tag defaultInstance = new Tag();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(Tag.class, defaultInstance);
    }

    public static Tag getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Tag> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
