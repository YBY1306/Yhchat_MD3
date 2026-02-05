package com.yhchat.canarys.proto.group;

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

/* loaded from: classes3.dex */
public final class User extends GeneratedMessageLite<User, Builder> implements UserOrBuilder {
    private static final User DEFAULT_INSTANCE;
    public static final int GAG_TIME_FIELD_NUMBER = 4;
    public static final int GROUP_ID_FIELD_NUMBER = 1;
    public static final int IS_GAG_FIELD_NUMBER = 5;
    private static volatile Parser<User> PARSER = null;
    public static final int PERMISSION_LEVEL_FIELD_NUMBER = 3;
    public static final int USER_INFO_FIELD_NUMBER = 2;
    private int bitField0_;
    private long gagTime_;
    private String groupId_ = "";
    private int isGag_;
    private int permissionLevel_;
    private User_info userInfo_;

    public interface User_infoOrBuilder extends MessageLiteOrBuilder {
        String getAvatarUrl();

        ByteString getAvatarUrlBytes();

        int getIsVip();

        String getName();

        ByteString getNameBytes();

        String getUserId();

        ByteString getUserIdBytes();
    }

    private User() {
    }

    public static final class User_info extends GeneratedMessageLite<User_info, Builder> implements User_infoOrBuilder {
        public static final int AVATAR_URL_FIELD_NUMBER = 4;
        private static final User_info DEFAULT_INSTANCE;
        public static final int IS_VIP_FIELD_NUMBER = 6;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<User_info> PARSER = null;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private int isVip_;
        private String userId_ = "";
        private String name_ = "";
        private String avatarUrl_ = "";

        private User_info() {
        }

        @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
        public String getUserId() {
            return this.userId_;
        }

        @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
        public String getAvatarUrl() {
            return this.avatarUrl_;
        }

        @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
        public int getIsVip() {
            return this.isVip_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsVip(int value) {
            this.isVip_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsVip() {
            this.isVip_ = 0;
        }

        public static User_info parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (User_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static User_info parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (User_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static User_info parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (User_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static User_info parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (User_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static User_info parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (User_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static User_info parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (User_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static User_info parseFrom(InputStream input) throws IOException {
            return (User_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static User_info parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (User_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static User_info parseDelimitedFrom(InputStream input) throws IOException {
            return (User_info) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static User_info parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (User_info) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static User_info parseFrom(CodedInputStream input) throws IOException {
            return (User_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static User_info parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (User_info) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(User_info prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<User_info, Builder> implements User_infoOrBuilder {
            private Builder() {
                super(User_info.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
            public String getUserId() {
                return ((User_info) this.instance).getUserId();
            }

            @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
            public ByteString getUserIdBytes() {
                return ((User_info) this.instance).getUserIdBytes();
            }

            public Builder setUserId(String value) {
                copyOnWrite();
                ((User_info) this.instance).setUserId(value);
                return this;
            }

            public Builder clearUserId() {
                copyOnWrite();
                ((User_info) this.instance).clearUserId();
                return this;
            }

            public Builder setUserIdBytes(ByteString value) {
                copyOnWrite();
                ((User_info) this.instance).setUserIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
            public String getName() {
                return ((User_info) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
            public ByteString getNameBytes() {
                return ((User_info) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((User_info) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((User_info) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((User_info) this.instance).setNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
            public String getAvatarUrl() {
                return ((User_info) this.instance).getAvatarUrl();
            }

            @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ((User_info) this.instance).getAvatarUrlBytes();
            }

            public Builder setAvatarUrl(String value) {
                copyOnWrite();
                ((User_info) this.instance).setAvatarUrl(value);
                return this;
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((User_info) this.instance).clearAvatarUrl();
                return this;
            }

            public Builder setAvatarUrlBytes(ByteString value) {
                copyOnWrite();
                ((User_info) this.instance).setAvatarUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.User.User_infoOrBuilder
            public int getIsVip() {
                return ((User_info) this.instance).getIsVip();
            }

            public Builder setIsVip(int value) {
                copyOnWrite();
                ((User_info) this.instance).setIsVip(value);
                return this;
            }

            public Builder clearIsVip() {
                copyOnWrite();
                ((User_info) this.instance).clearIsVip();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new User_info();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"userId_", "name_", "avatarUrl_", "isVip_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0006\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0004\u0208\u0006\u0004", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<User_info> parser = PARSER;
                    if (parser == null) {
                        synchronized (User_info.class) {
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
            User_info defaultInstance = new User_info();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(User_info.class, defaultInstance);
        }

        public static User_info getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<User_info> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.group.UserOrBuilder
    public String getGroupId() {
        return this.groupId_;
    }

    @Override // com.yhchat.canarys.proto.group.UserOrBuilder
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

    @Override // com.yhchat.canarys.proto.group.UserOrBuilder
    public boolean hasUserInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.group.UserOrBuilder
    public User_info getUserInfo() {
        return this.userInfo_ == null ? User_info.getDefaultInstance() : this.userInfo_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserInfo(User_info value) {
        value.getClass();
        this.userInfo_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserInfo(User_info value) {
        value.getClass();
        if (this.userInfo_ != null && this.userInfo_ != User_info.getDefaultInstance()) {
            this.userInfo_ = User_info.newBuilder(this.userInfo_).mergeFrom((User_info.Builder) value).buildPartial();
        } else {
            this.userInfo_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserInfo() {
        this.userInfo_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.group.UserOrBuilder
    public int getPermissionLevel() {
        return this.permissionLevel_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPermissionLevel(int value) {
        this.permissionLevel_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPermissionLevel() {
        this.permissionLevel_ = 0;
    }

    @Override // com.yhchat.canarys.proto.group.UserOrBuilder
    public long getGagTime() {
        return this.gagTime_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGagTime(long value) {
        this.gagTime_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGagTime() {
        this.gagTime_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.group.UserOrBuilder
    public int getIsGag() {
        return this.isGag_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsGag(int value) {
        this.isGag_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsGag() {
        this.isGag_ = 0;
    }

    public static User parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static User parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static User parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static User parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static User parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static User parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static User parseFrom(InputStream input) throws IOException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static User parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static User parseDelimitedFrom(InputStream input) throws IOException {
        return (User) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static User parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (User) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static User parseFrom(CodedInputStream input) throws IOException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static User parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (User) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(User prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<User, Builder> implements UserOrBuilder {
        private Builder() {
            super(User.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.group.UserOrBuilder
        public String getGroupId() {
            return ((User) this.instance).getGroupId();
        }

        @Override // com.yhchat.canarys.proto.group.UserOrBuilder
        public ByteString getGroupIdBytes() {
            return ((User) this.instance).getGroupIdBytes();
        }

        public Builder setGroupId(String value) {
            copyOnWrite();
            ((User) this.instance).setGroupId(value);
            return this;
        }

        public Builder clearGroupId() {
            copyOnWrite();
            ((User) this.instance).clearGroupId();
            return this;
        }

        public Builder setGroupIdBytes(ByteString value) {
            copyOnWrite();
            ((User) this.instance).setGroupIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.UserOrBuilder
        public boolean hasUserInfo() {
            return ((User) this.instance).hasUserInfo();
        }

        @Override // com.yhchat.canarys.proto.group.UserOrBuilder
        public User_info getUserInfo() {
            return ((User) this.instance).getUserInfo();
        }

        public Builder setUserInfo(User_info value) {
            copyOnWrite();
            ((User) this.instance).setUserInfo(value);
            return this;
        }

        public Builder setUserInfo(User_info.Builder builderForValue) {
            copyOnWrite();
            ((User) this.instance).setUserInfo(builderForValue.build());
            return this;
        }

        public Builder mergeUserInfo(User_info value) {
            copyOnWrite();
            ((User) this.instance).mergeUserInfo(value);
            return this;
        }

        public Builder clearUserInfo() {
            copyOnWrite();
            ((User) this.instance).clearUserInfo();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.UserOrBuilder
        public int getPermissionLevel() {
            return ((User) this.instance).getPermissionLevel();
        }

        public Builder setPermissionLevel(int value) {
            copyOnWrite();
            ((User) this.instance).setPermissionLevel(value);
            return this;
        }

        public Builder clearPermissionLevel() {
            copyOnWrite();
            ((User) this.instance).clearPermissionLevel();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.UserOrBuilder
        public long getGagTime() {
            return ((User) this.instance).getGagTime();
        }

        public Builder setGagTime(long value) {
            copyOnWrite();
            ((User) this.instance).setGagTime(value);
            return this;
        }

        public Builder clearGagTime() {
            copyOnWrite();
            ((User) this.instance).clearGagTime();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.UserOrBuilder
        public int getIsGag() {
            return ((User) this.instance).getIsGag();
        }

        public Builder setIsGag(int value) {
            copyOnWrite();
            ((User) this.instance).setIsGag(value);
            return this;
        }

        public Builder clearIsGag() {
            copyOnWrite();
            ((User) this.instance).clearIsGag();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new User();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "groupId_", "userInfo_", "permissionLevel_", "gagTime_", "isGag_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000\u0003\u0004\u0004\u0002\u0005\u0004", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<User> parser = PARSER;
                if (parser == null) {
                    synchronized (User.class) {
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
        User defaultInstance = new User();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(User.class, defaultInstance);
    }

    public static User getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<User> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
