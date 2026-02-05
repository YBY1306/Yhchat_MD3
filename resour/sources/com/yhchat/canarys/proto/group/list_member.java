package com.yhchat.canarys.proto.group;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.group.Status;
import com.yhchat.canarys.proto.group.User;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class list_member extends GeneratedMessageLite<list_member, Builder> implements list_memberOrBuilder {
    private static final list_member DEFAULT_INSTANCE;
    private static volatile Parser<list_member> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int USER_FIELD_NUMBER = 2;
    private int bitField0_;
    private Status status_;
    private Internal.ProtobufList<User> user_ = emptyProtobufList();

    private list_member() {
    }

    @Override // com.yhchat.canarys.proto.group.list_memberOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.group.list_memberOrBuilder
    public Status getStatus() {
        return this.status_ == null ? Status.getDefaultInstance() : this.status_;
    }

    public void setStatus(Status value) {
        value.getClass();
        this.status_ = value;
        this.bitField0_ |= 1;
    }

    public void mergeStatus(Status value) {
        value.getClass();
        if (this.status_ != null && this.status_ != Status.getDefaultInstance()) {
            this.status_ = Status.newBuilder(this.status_).mergeFrom((Status.Builder) value).buildPartial();
        } else {
            this.status_ = value;
        }
        this.bitField0_ |= 1;
    }

    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.group.list_memberOrBuilder
    public List<User> getUserList() {
        return this.user_;
    }

    public List<? extends UserOrBuilder> getUserOrBuilderList() {
        return this.user_;
    }

    @Override // com.yhchat.canarys.proto.group.list_memberOrBuilder
    public int getUserCount() {
        return this.user_.size();
    }

    @Override // com.yhchat.canarys.proto.group.list_memberOrBuilder
    public User getUser(int index) {
        return this.user_.get(index);
    }

    public UserOrBuilder getUserOrBuilder(int index) {
        return this.user_.get(index);
    }

    private void ensureUserIsMutable() {
        Internal.ProtobufList<User> tmp = this.user_;
        if (!tmp.isModifiable()) {
            this.user_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    public void setUser(int index, User value) {
        value.getClass();
        ensureUserIsMutable();
        this.user_.set(index, value);
    }

    public void addUser(User value) {
        value.getClass();
        ensureUserIsMutable();
        this.user_.add(value);
    }

    public void addUser(int index, User value) {
        value.getClass();
        ensureUserIsMutable();
        this.user_.add(index, value);
    }

    public void addAllUser(Iterable<? extends User> values) {
        ensureUserIsMutable();
        AbstractMessageLite.addAll(values, this.user_);
    }

    public void clearUser() {
        this.user_ = emptyProtobufList();
    }

    public void removeUser(int index) {
        ensureUserIsMutable();
        this.user_.remove(index);
    }

    public static list_member parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (list_member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_member parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_member parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (list_member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_member parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_member parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (list_member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static list_member parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (list_member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static list_member parseFrom(InputStream input) throws IOException {
        return (list_member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static list_member parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static list_member parseDelimitedFrom(InputStream input) throws IOException {
        return (list_member) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static list_member parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_member) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static list_member parseFrom(CodedInputStream input) throws IOException {
        return (list_member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static list_member parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (list_member) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(list_member prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<list_member, Builder> implements list_memberOrBuilder {
        /* synthetic */ Builder(list_memberIA list_memberia) {
            this();
        }

        private Builder() {
            super(list_member.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.group.list_memberOrBuilder
        public boolean hasStatus() {
            return ((list_member) this.instance).hasStatus();
        }

        @Override // com.yhchat.canarys.proto.group.list_memberOrBuilder
        public Status getStatus() {
            return ((list_member) this.instance).getStatus();
        }

        public Builder setStatus(Status value) {
            copyOnWrite();
            ((list_member) this.instance).setStatus(value);
            return this;
        }

        public Builder setStatus(Status.Builder builderForValue) {
            copyOnWrite();
            ((list_member) this.instance).setStatus(builderForValue.build());
            return this;
        }

        public Builder mergeStatus(Status value) {
            copyOnWrite();
            ((list_member) this.instance).mergeStatus(value);
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((list_member) this.instance).clearStatus();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.list_memberOrBuilder
        public List<User> getUserList() {
            return Collections.unmodifiableList(((list_member) this.instance).getUserList());
        }

        @Override // com.yhchat.canarys.proto.group.list_memberOrBuilder
        public int getUserCount() {
            return ((list_member) this.instance).getUserCount();
        }

        @Override // com.yhchat.canarys.proto.group.list_memberOrBuilder
        public User getUser(int index) {
            return ((list_member) this.instance).getUser(index);
        }

        public Builder setUser(int index, User value) {
            copyOnWrite();
            ((list_member) this.instance).setUser(index, value);
            return this;
        }

        public Builder setUser(int index, User.Builder builderForValue) {
            copyOnWrite();
            ((list_member) this.instance).setUser(index, builderForValue.build());
            return this;
        }

        public Builder addUser(User value) {
            copyOnWrite();
            ((list_member) this.instance).addUser(value);
            return this;
        }

        public Builder addUser(int index, User value) {
            copyOnWrite();
            ((list_member) this.instance).addUser(index, value);
            return this;
        }

        public Builder addUser(User.Builder builderForValue) {
            copyOnWrite();
            ((list_member) this.instance).addUser(builderForValue.build());
            return this;
        }

        public Builder addUser(int index, User.Builder builderForValue) {
            copyOnWrite();
            ((list_member) this.instance).addUser(index, builderForValue.build());
            return this;
        }

        public Builder addAllUser(Iterable<? extends User> values) {
            copyOnWrite();
            ((list_member) this.instance).addAllUser(values);
            return this;
        }

        public Builder clearUser() {
            copyOnWrite();
            ((list_member) this.instance).clearUser();
            return this;
        }

        public Builder removeUser(int index) {
            copyOnWrite();
            ((list_member) this.instance).removeUser(index);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new list_member();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "status_", "user_", User.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<list_member> parser = PARSER;
                if (parser == null) {
                    synchronized (list_member.class) {
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
        list_member defaultInstance = new list_member();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(list_member.class, defaultInstance);
    }

    public static list_member getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<list_member> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
