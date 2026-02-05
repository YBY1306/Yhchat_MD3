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
public final class tag_member_send extends GeneratedMessageLite<tag_member_send, Builder> implements tag_member_sendOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final tag_member_send DEFAULT_INSTANCE;
    public static final int GROUP_ID_FIELD_NUMBER = 3;
    private static volatile Parser<tag_member_send> PARSER = null;
    public static final int TAG_ID_FIELD_NUMBER = 4;
    private int bitField0_;
    private Data data_;
    private String groupId_ = "";
    private long tagId_;

    public interface DataOrBuilder extends MessageLiteOrBuilder {
        int getPage();

        int getSize();
    }

    private tag_member_send() {
    }

    public static final class Data extends GeneratedMessageLite<Data, Builder> implements DataOrBuilder {
        private static final Data DEFAULT_INSTANCE;
        public static final int PAGE_FIELD_NUMBER = 2;
        private static volatile Parser<Data> PARSER = null;
        public static final int SIZE_FIELD_NUMBER = 1;
        private int page_;
        private int size_;

        private Data() {
        }

        @Override // com.yhchat.canarys.proto.group.tag_member_send.DataOrBuilder
        public int getSize() {
            return this.size_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSize(int value) {
            this.size_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSize() {
            this.size_ = 0;
        }

        @Override // com.yhchat.canarys.proto.group.tag_member_send.DataOrBuilder
        public int getPage() {
            return this.page_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPage(int value) {
            this.page_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPage() {
            this.page_ = 0;
        }

        public static Data parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Data parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Data parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Data parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Data parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Data parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Data parseFrom(InputStream input) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Data parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Data parseDelimitedFrom(InputStream input) throws IOException {
            return (Data) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Data parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Data) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Data parseFrom(CodedInputStream input) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Data parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Data prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Data, Builder> implements DataOrBuilder {
            private Builder() {
                super(Data.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.group.tag_member_send.DataOrBuilder
            public int getSize() {
                return ((Data) this.instance).getSize();
            }

            public Builder setSize(int value) {
                copyOnWrite();
                ((Data) this.instance).setSize(value);
                return this;
            }

            public Builder clearSize() {
                copyOnWrite();
                ((Data) this.instance).clearSize();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.tag_member_send.DataOrBuilder
            public int getPage() {
                return ((Data) this.instance).getPage();
            }

            public Builder setPage(int value) {
                copyOnWrite();
                ((Data) this.instance).setPage(value);
                return this;
            }

            public Builder clearPage() {
                copyOnWrite();
                ((Data) this.instance).clearPage();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Data();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"size_", "page_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Data> parser = PARSER;
                    if (parser == null) {
                        synchronized (Data.class) {
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
            Data defaultInstance = new Data();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Data.class, defaultInstance);
        }

        public static Data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Data> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.group.tag_member_sendOrBuilder
    public boolean hasData() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.group.tag_member_sendOrBuilder
    public Data getData() {
        return this.data_ == null ? Data.getDefaultInstance() : this.data_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(Data value) {
        value.getClass();
        this.data_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeData(Data value) {
        value.getClass();
        if (this.data_ != null && this.data_ != Data.getDefaultInstance()) {
            this.data_ = Data.newBuilder(this.data_).mergeFrom((Data.Builder) value).buildPartial();
        } else {
            this.data_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.group.tag_member_sendOrBuilder
    public String getGroupId() {
        return this.groupId_;
    }

    @Override // com.yhchat.canarys.proto.group.tag_member_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.group.tag_member_sendOrBuilder
    public long getTagId() {
        return this.tagId_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTagId(long value) {
        this.tagId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTagId() {
        this.tagId_ = 0L;
    }

    public static tag_member_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (tag_member_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static tag_member_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (tag_member_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static tag_member_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (tag_member_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static tag_member_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (tag_member_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static tag_member_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (tag_member_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static tag_member_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (tag_member_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static tag_member_send parseFrom(InputStream input) throws IOException {
        return (tag_member_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static tag_member_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (tag_member_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static tag_member_send parseDelimitedFrom(InputStream input) throws IOException {
        return (tag_member_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static tag_member_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (tag_member_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static tag_member_send parseFrom(CodedInputStream input) throws IOException {
        return (tag_member_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static tag_member_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (tag_member_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(tag_member_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<tag_member_send, Builder> implements tag_member_sendOrBuilder {
        private Builder() {
            super(tag_member_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.group.tag_member_sendOrBuilder
        public boolean hasData() {
            return ((tag_member_send) this.instance).hasData();
        }

        @Override // com.yhchat.canarys.proto.group.tag_member_sendOrBuilder
        public Data getData() {
            return ((tag_member_send) this.instance).getData();
        }

        public Builder setData(Data value) {
            copyOnWrite();
            ((tag_member_send) this.instance).setData(value);
            return this;
        }

        public Builder setData(Data.Builder builderForValue) {
            copyOnWrite();
            ((tag_member_send) this.instance).setData(builderForValue.build());
            return this;
        }

        public Builder mergeData(Data value) {
            copyOnWrite();
            ((tag_member_send) this.instance).mergeData(value);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((tag_member_send) this.instance).clearData();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.tag_member_sendOrBuilder
        public String getGroupId() {
            return ((tag_member_send) this.instance).getGroupId();
        }

        @Override // com.yhchat.canarys.proto.group.tag_member_sendOrBuilder
        public ByteString getGroupIdBytes() {
            return ((tag_member_send) this.instance).getGroupIdBytes();
        }

        public Builder setGroupId(String value) {
            copyOnWrite();
            ((tag_member_send) this.instance).setGroupId(value);
            return this;
        }

        public Builder clearGroupId() {
            copyOnWrite();
            ((tag_member_send) this.instance).clearGroupId();
            return this;
        }

        public Builder setGroupIdBytes(ByteString value) {
            copyOnWrite();
            ((tag_member_send) this.instance).setGroupIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.tag_member_sendOrBuilder
        public long getTagId() {
            return ((tag_member_send) this.instance).getTagId();
        }

        public Builder setTagId(long value) {
            copyOnWrite();
            ((tag_member_send) this.instance).setTagId(value);
            return this;
        }

        public Builder clearTagId() {
            copyOnWrite();
            ((tag_member_send) this.instance).clearTagId();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new tag_member_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "data_", "groupId_", "tagId_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u1009\u0000\u0003\u0208\u0004\u0002", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<tag_member_send> parser = PARSER;
                if (parser == null) {
                    synchronized (tag_member_send.class) {
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
        tag_member_send defaultInstance = new tag_member_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(tag_member_send.class, defaultInstance);
    }

    public static tag_member_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<tag_member_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
