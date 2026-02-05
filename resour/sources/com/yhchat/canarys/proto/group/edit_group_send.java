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
public final class edit_group_send extends GeneratedMessageLite<edit_group_send, Builder> implements edit_group_sendOrBuilder {
    public static final int AVATAR_URL_FIELD_NUMBER = 5;
    public static final int CATEGORY_ID_FIELD_NUMBER = 9;
    public static final int CATEGORY_NAME_FIELD_NUMBER = 8;
    private static final edit_group_send DEFAULT_INSTANCE;
    public static final int DIRECT_JOIN_FIELD_NUMBER = 6;
    public static final int GROUP_ID_FIELD_NUMBER = 2;
    public static final int HIDE_GROUP_MEMBERS_FIELD_NUMBER = 11;
    public static final int HISTORY_MSG_FIELD_NUMBER = 7;
    public static final int INTRODUCTION_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 3;
    private static volatile Parser<edit_group_send> PARSER = null;
    public static final int PRIVATE_FIELD_NUMBER = 10;
    private long categoryId_;
    private int directJoin_;
    private long hideGroupMembers_;
    private int historyMsg_;
    private int private_;
    private String groupId_ = "";
    private String name_ = "";
    private String introduction_ = "";
    private String avatarUrl_ = "";
    private String categoryName_ = "";

    private edit_group_send() {
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public String getGroupId() {
        return this.groupId_;
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public ByteString getGroupIdBytes() {
        return ByteString.copyFromUtf8(this.groupId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupId(String value) {
        value.getClass();
        this.groupId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGroupId() {
        this.groupId_ = getDefaultInstance().getGroupId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGroupIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.groupId_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public String getIntroduction() {
        return this.introduction_;
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public String getAvatarUrl() {
        return this.avatarUrl_;
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public int getDirectJoin() {
        return this.directJoin_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectJoin(int value) {
        this.directJoin_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirectJoin() {
        this.directJoin_ = 0;
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public int getHistoryMsg() {
        return this.historyMsg_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistoryMsg(int value) {
        this.historyMsg_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistoryMsg() {
        this.historyMsg_ = 0;
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public String getCategoryName() {
        return this.categoryName_;
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public ByteString getCategoryNameBytes() {
        return ByteString.copyFromUtf8(this.categoryName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryName(String value) {
        value.getClass();
        this.categoryName_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryName() {
        this.categoryName_ = getDefaultInstance().getCategoryName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryNameBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.categoryName_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public long getCategoryId() {
        return this.categoryId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCategoryId(long value) {
        this.categoryId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCategoryId() {
        this.categoryId_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public int getPrivate() {
        return this.private_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrivate(int value) {
        this.private_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrivate() {
        this.private_ = 0;
    }

    @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
    public long getHideGroupMembers() {
        return this.hideGroupMembers_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideGroupMembers(long value) {
        this.hideGroupMembers_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideGroupMembers() {
        this.hideGroupMembers_ = 0L;
    }

    public static edit_group_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (edit_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static edit_group_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (edit_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static edit_group_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (edit_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static edit_group_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (edit_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static edit_group_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (edit_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static edit_group_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (edit_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static edit_group_send parseFrom(InputStream input) throws IOException {
        return (edit_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static edit_group_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (edit_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static edit_group_send parseDelimitedFrom(InputStream input) throws IOException {
        return (edit_group_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static edit_group_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (edit_group_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static edit_group_send parseFrom(CodedInputStream input) throws IOException {
        return (edit_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static edit_group_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (edit_group_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(edit_group_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<edit_group_send, Builder> implements edit_group_sendOrBuilder {
        private Builder() {
            super(edit_group_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public String getGroupId() {
            return ((edit_group_send) this.instance).getGroupId();
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public ByteString getGroupIdBytes() {
            return ((edit_group_send) this.instance).getGroupIdBytes();
        }

        public Builder setGroupId(String value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setGroupId(value);
            return this;
        }

        public Builder clearGroupId() {
            copyOnWrite();
            ((edit_group_send) this.instance).clearGroupId();
            return this;
        }

        public Builder setGroupIdBytes(ByteString value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setGroupIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public String getName() {
            return ((edit_group_send) this.instance).getName();
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public ByteString getNameBytes() {
            return ((edit_group_send) this.instance).getNameBytes();
        }

        public Builder setName(String value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setName(value);
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((edit_group_send) this.instance).clearName();
            return this;
        }

        public Builder setNameBytes(ByteString value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setNameBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public String getIntroduction() {
            return ((edit_group_send) this.instance).getIntroduction();
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public ByteString getIntroductionBytes() {
            return ((edit_group_send) this.instance).getIntroductionBytes();
        }

        public Builder setIntroduction(String value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setIntroduction(value);
            return this;
        }

        public Builder clearIntroduction() {
            copyOnWrite();
            ((edit_group_send) this.instance).clearIntroduction();
            return this;
        }

        public Builder setIntroductionBytes(ByteString value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setIntroductionBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public String getAvatarUrl() {
            return ((edit_group_send) this.instance).getAvatarUrl();
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public ByteString getAvatarUrlBytes() {
            return ((edit_group_send) this.instance).getAvatarUrlBytes();
        }

        public Builder setAvatarUrl(String value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setAvatarUrl(value);
            return this;
        }

        public Builder clearAvatarUrl() {
            copyOnWrite();
            ((edit_group_send) this.instance).clearAvatarUrl();
            return this;
        }

        public Builder setAvatarUrlBytes(ByteString value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setAvatarUrlBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public int getDirectJoin() {
            return ((edit_group_send) this.instance).getDirectJoin();
        }

        public Builder setDirectJoin(int value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setDirectJoin(value);
            return this;
        }

        public Builder clearDirectJoin() {
            copyOnWrite();
            ((edit_group_send) this.instance).clearDirectJoin();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public int getHistoryMsg() {
            return ((edit_group_send) this.instance).getHistoryMsg();
        }

        public Builder setHistoryMsg(int value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setHistoryMsg(value);
            return this;
        }

        public Builder clearHistoryMsg() {
            copyOnWrite();
            ((edit_group_send) this.instance).clearHistoryMsg();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public String getCategoryName() {
            return ((edit_group_send) this.instance).getCategoryName();
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public ByteString getCategoryNameBytes() {
            return ((edit_group_send) this.instance).getCategoryNameBytes();
        }

        public Builder setCategoryName(String value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setCategoryName(value);
            return this;
        }

        public Builder clearCategoryName() {
            copyOnWrite();
            ((edit_group_send) this.instance).clearCategoryName();
            return this;
        }

        public Builder setCategoryNameBytes(ByteString value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setCategoryNameBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public long getCategoryId() {
            return ((edit_group_send) this.instance).getCategoryId();
        }

        public Builder setCategoryId(long value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setCategoryId(value);
            return this;
        }

        public Builder clearCategoryId() {
            copyOnWrite();
            ((edit_group_send) this.instance).clearCategoryId();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public int getPrivate() {
            return ((edit_group_send) this.instance).getPrivate();
        }

        public Builder setPrivate(int value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setPrivate(value);
            return this;
        }

        public Builder clearPrivate() {
            copyOnWrite();
            ((edit_group_send) this.instance).clearPrivate();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.edit_group_sendOrBuilder
        public long getHideGroupMembers() {
            return ((edit_group_send) this.instance).getHideGroupMembers();
        }

        public Builder setHideGroupMembers(long value) {
            copyOnWrite();
            ((edit_group_send) this.instance).setHideGroupMembers(value);
            return this;
        }

        public Builder clearHideGroupMembers() {
            copyOnWrite();
            ((edit_group_send) this.instance).clearHideGroupMembers();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new edit_group_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"groupId_", "name_", "introduction_", "avatarUrl_", "directJoin_", "historyMsg_", "categoryName_", "categoryId_", "private_", "hideGroupMembers_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0002\u000b\n\u0000\u0000\u0000\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0006\u0004\u0007\u0004\b\u0208\t\u0002\n\u0004\u000b\u0003", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<edit_group_send> parser = PARSER;
                if (parser == null) {
                    synchronized (edit_group_send.class) {
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
        edit_group_send defaultInstance = new edit_group_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(edit_group_send.class, defaultInstance);
    }

    public static edit_group_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<edit_group_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
