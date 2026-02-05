package com.yhchat.canarys.proto.group;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.group.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class create_group extends GeneratedMessageLite<create_group, Builder> implements create_groupOrBuilder {
    private static final create_group DEFAULT_INSTANCE;
    public static final int GROUP_ID_FIELD_NUMBER = 2;
    private static volatile Parser<create_group> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private String groupId_ = "";
    private Status status_;

    private create_group() {
    }

    @Override // com.yhchat.canarys.proto.group.create_groupOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.group.create_groupOrBuilder
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

    @Override // com.yhchat.canarys.proto.group.create_groupOrBuilder
    public String getGroupId() {
        return this.groupId_;
    }

    @Override // com.yhchat.canarys.proto.group.create_groupOrBuilder
    public ByteString getGroupIdBytes() {
        return ByteString.copyFromUtf8(this.groupId_);
    }

    public void setGroupId(String value) {
        value.getClass();
        this.groupId_ = value;
    }

    public void clearGroupId() {
        this.groupId_ = getDefaultInstance().getGroupId();
    }

    public void setGroupIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.groupId_ = value.toStringUtf8();
    }

    public static create_group parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (create_group) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static create_group parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (create_group) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static create_group parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (create_group) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static create_group parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (create_group) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static create_group parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (create_group) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static create_group parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (create_group) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static create_group parseFrom(InputStream input) throws IOException {
        return (create_group) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static create_group parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (create_group) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static create_group parseDelimitedFrom(InputStream input) throws IOException {
        return (create_group) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static create_group parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (create_group) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static create_group parseFrom(CodedInputStream input) throws IOException {
        return (create_group) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static create_group parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (create_group) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(create_group prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<create_group, Builder> implements create_groupOrBuilder {
        /* synthetic */ Builder(create_groupIA create_groupia) {
            this();
        }

        private Builder() {
            super(create_group.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.group.create_groupOrBuilder
        public boolean hasStatus() {
            return ((create_group) this.instance).hasStatus();
        }

        @Override // com.yhchat.canarys.proto.group.create_groupOrBuilder
        public Status getStatus() {
            return ((create_group) this.instance).getStatus();
        }

        public Builder setStatus(Status value) {
            copyOnWrite();
            ((create_group) this.instance).setStatus(value);
            return this;
        }

        public Builder setStatus(Status.Builder builderForValue) {
            copyOnWrite();
            ((create_group) this.instance).setStatus(builderForValue.build());
            return this;
        }

        public Builder mergeStatus(Status value) {
            copyOnWrite();
            ((create_group) this.instance).mergeStatus(value);
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((create_group) this.instance).clearStatus();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.create_groupOrBuilder
        public String getGroupId() {
            return ((create_group) this.instance).getGroupId();
        }

        @Override // com.yhchat.canarys.proto.group.create_groupOrBuilder
        public ByteString getGroupIdBytes() {
            return ((create_group) this.instance).getGroupIdBytes();
        }

        public Builder setGroupId(String value) {
            copyOnWrite();
            ((create_group) this.instance).setGroupId(value);
            return this;
        }

        public Builder clearGroupId() {
            copyOnWrite();
            ((create_group) this.instance).clearGroupId();
            return this;
        }

        public Builder setGroupIdBytes(ByteString value) {
            copyOnWrite();
            ((create_group) this.instance).setGroupIdBytes(value);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new create_group();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "status_", "groupId_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u0208", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<create_group> parser = PARSER;
                if (parser == null) {
                    synchronized (create_group.class) {
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
        create_group defaultInstance = new create_group();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(create_group.class, defaultInstance);
    }

    public static create_group getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<create_group> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
