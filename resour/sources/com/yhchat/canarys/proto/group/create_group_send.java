package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class create_group_send extends GeneratedMessageLite<create_group_send, Builder> implements create_group_sendOrBuilder {
    public static final int AVATAR_URL_FIELD_NUMBER = 4;
    public static final int CATEGORY_FIELD_NUMBER = 5;
    public static final int CATEGORY_ID_FIELD_NUMBER = 6;
    private static final create_group_send DEFAULT_INSTANCE;
    public static final int INTRODUCTION_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    private static volatile Parser<create_group_send> PARSER;
    private int categoryId_;
    private String name_ = "";
    private String introduction_ = "";
    private String avatarUrl_ = "";
    private String category_ = "";

    private create_group_send() {
    }

    @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String value) {
        value.getClass();
        this.name_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.name_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
    public String getIntroduction() {
        return this.introduction_;
    }

    @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
    public ByteString getIntroductionBytes() {
        return ByteString.copyFromUtf8(this.introduction_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroduction(String value) {
        value.getClass();
        this.introduction_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntroduction() {
        this.introduction_ = getDefaultInstance().getIntroduction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntroductionBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.introduction_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
    public String getAvatarUrl() {
        return this.avatarUrl_;
    }

    @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
    public ByteString getAvatarUrlBytes() {
        return ByteString.copyFromUtf8(this.avatarUrl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarUrl(String value) {
        value.getClass();
        this.avatarUrl_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvatarUrl() {
        this.avatarUrl_ = getDefaultInstance().getAvatarUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvatarUrlBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.avatarUrl_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
    public String getCategory() {
        return this.category_;
    }

    @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
    public ByteString getCategoryBytes() {
        return ByteString.copyFromUtf8(this.category_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategory(String value) {
        value.getClass();
        this.category_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategory() {
        this.category_ = getDefaultInstance().getCategory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.category_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
    public int getCategoryId() {
        return this.categoryId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryId(int value) {
        this.categoryId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryId() {
        this.categoryId_ = 0;
    }

    public static create_group_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (create_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static create_group_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (create_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static create_group_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (create_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static create_group_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (create_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static create_group_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (create_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static create_group_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (create_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static create_group_send parseFrom(InputStream input) throws IOException {
        return (create_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static create_group_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (create_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static create_group_send parseDelimitedFrom(InputStream input) throws IOException {
        return (create_group_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static create_group_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (create_group_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static create_group_send parseFrom(CodedInputStream input) throws IOException {
        return (create_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static create_group_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (create_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(create_group_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<create_group_send, Builder> implements create_group_sendOrBuilder {
        private Builder() {
            super(create_group_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
        public String getName() {
            return ((create_group_send) this.instance).getName();
        }

        @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
        public ByteString getNameBytes() {
            return ((create_group_send) this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            copyOnWrite();
            ((create_group_send) this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((create_group_send) this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            copyOnWrite();
            ((create_group_send) this.instance).setNameBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
        public String getIntroduction() {
            return ((create_group_send) this.instance).getIntroduction();
        }

        @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
        public ByteString getIntroductionBytes() {
            return ((create_group_send) this.instance).getIntroductionBytes();
        }

        public Builder setIntroduction(String value) {
            copyOnWrite();
            ((create_group_send) this.instance).setIntroduction(value);
            return this;
        }

        public Builder clearIntroduction() {
            copyOnWrite();
            ((create_group_send) this.instance).clearIntroduction();
            return this;
        }

        public Builder setIntroductionBytes(ByteString value) {
            copyOnWrite();
            ((create_group_send) this.instance).setIntroductionBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
        public String getAvatarUrl() {
            return ((create_group_send) this.instance).getAvatarUrl();
        }

        @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
        public ByteString getAvatarUrlBytes() {
            return ((create_group_send) this.instance).getAvatarUrlBytes();
        }

        public Builder setAvatarUrl(String value) {
            copyOnWrite();
            ((create_group_send) this.instance).setAvatarUrl(value);
            return this;
        }

        public Builder clearAvatarUrl() {
            copyOnWrite();
            ((create_group_send) this.instance).clearAvatarUrl();
            return this;
        }

        public Builder setAvatarUrlBytes(ByteString value) {
            copyOnWrite();
            ((create_group_send) this.instance).setAvatarUrlBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
        public String getCategory() {
            return ((create_group_send) this.instance).getCategory();
        }

        @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
        public ByteString getCategoryBytes() {
            return ((create_group_send) this.instance).getCategoryBytes();
        }

        public Builder setCategory(String value) {
            copyOnWrite();
            ((create_group_send) this.instance).setCategory(value);
            return this;
        }

        public Builder clearCategory() {
            copyOnWrite();
            ((create_group_send) this.instance).clearCategory();
            return this;
        }

        public Builder setCategoryBytes(ByteString value) {
            copyOnWrite();
            ((create_group_send) this.instance).setCategoryBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.create_group_sendOrBuilder
        public int getCategoryId() {
            return ((create_group_send) this.instance).getCategoryId();
        }

        public Builder setCategoryId(int value) {
            copyOnWrite();
            ((create_group_send) this.instance).setCategoryId(value);
            return this;
        }

        public Builder clearCategoryId() {
            copyOnWrite();
            ((create_group_send) this.instance).clearCategoryId();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new create_group_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"name_", "introduction_", "avatarUrl_", "category_", "categoryId_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0004", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<create_group_send> parser = PARSER;
                if (parser == null) {
                    synchronized (create_group_send.class) {
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
        create_group_send defaultInstance = new create_group_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(create_group_send.class, defaultInstance);
    }

    public static create_group_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<create_group_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
