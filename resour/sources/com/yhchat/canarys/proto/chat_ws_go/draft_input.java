package com.yhchat.canarys.proto.chat_ws_go;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.chat_ws_go.INFO;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes10.dex */
public final class draft_input extends GeneratedMessageLite<draft_input, Builder> implements draft_inputOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final draft_input DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile Parser<draft_input> PARSER;
    private int bitField0_;
    private DraftData data_;
    private INFO info_;

    public interface DraftDataOrBuilder extends MessageLiteOrBuilder {
        String getAny();

        ByteString getAnyBytes();

        DraftData.Draft getDraft();

        boolean hasDraft();
    }

    private draft_input() {
    }

    public static final class DraftData extends GeneratedMessageLite<DraftData, Builder> implements DraftDataOrBuilder {
        public static final int ANY_FIELD_NUMBER = 1;
        private static final DraftData DEFAULT_INSTANCE;
        public static final int DRAFT_FIELD_NUMBER = 2;
        private static volatile Parser<DraftData> PARSER;
        private String any_ = "";
        private int bitField0_;
        private Draft draft_;

        public interface DraftOrBuilder extends MessageLiteOrBuilder {
            String getChatId();

            ByteString getChatIdBytes();

            String getInput();

            ByteString getInputBytes();
        }

        private DraftData() {
        }

        public static final class Draft extends GeneratedMessageLite<Draft, Builder> implements DraftOrBuilder {
            public static final int CHAT_ID_FIELD_NUMBER = 1;
            private static final Draft DEFAULT_INSTANCE;
            public static final int INPUT_FIELD_NUMBER = 2;
            private static volatile Parser<Draft> PARSER;
            private String chatId_ = "";
            private String input_ = "";

            private Draft() {
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftData.DraftOrBuilder
            public String getChatId() {
                return this.chatId_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftData.DraftOrBuilder
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

            @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftData.DraftOrBuilder
            public String getInput() {
                return this.input_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftData.DraftOrBuilder
            public ByteString getInputBytes() {
                return ByteString.copyFromUtf8(this.input_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInput(String value) {
                value.getClass();
                this.input_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearInput() {
                this.input_ = getDefaultInstance().getInput();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setInputBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.input_ = value.toStringUtf8();
            }

            public static Draft parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Draft parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Draft parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Draft parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Draft parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static Draft parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static Draft parseFrom(InputStream input) throws IOException {
                return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Draft parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Draft parseDelimitedFrom(InputStream input) throws IOException {
                return (Draft) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static Draft parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Draft) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Draft parseFrom(CodedInputStream input) throws IOException {
                return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static Draft parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (Draft) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(Draft prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<Draft, Builder> implements DraftOrBuilder {
                private Builder() {
                    super(Draft.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftData.DraftOrBuilder
                public String getChatId() {
                    return ((Draft) this.instance).getChatId();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftData.DraftOrBuilder
                public ByteString getChatIdBytes() {
                    return ((Draft) this.instance).getChatIdBytes();
                }

                public Builder setChatId(String value) {
                    copyOnWrite();
                    ((Draft) this.instance).setChatId(value);
                    return this;
                }

                public Builder clearChatId() {
                    copyOnWrite();
                    ((Draft) this.instance).clearChatId();
                    return this;
                }

                public Builder setChatIdBytes(ByteString value) {
                    copyOnWrite();
                    ((Draft) this.instance).setChatIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftData.DraftOrBuilder
                public String getInput() {
                    return ((Draft) this.instance).getInput();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftData.DraftOrBuilder
                public ByteString getInputBytes() {
                    return ((Draft) this.instance).getInputBytes();
                }

                public Builder setInput(String value) {
                    copyOnWrite();
                    ((Draft) this.instance).setInput(value);
                    return this;
                }

                public Builder clearInput() {
                    copyOnWrite();
                    ((Draft) this.instance).clearInput();
                    return this;
                }

                public Builder setInputBytes(ByteString value) {
                    copyOnWrite();
                    ((Draft) this.instance).setInputBytes(value);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new Draft();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"chatId_", "input_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<Draft> parser = PARSER;
                        if (parser == null) {
                            synchronized (Draft.class) {
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
                Draft defaultInstance = new Draft();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(Draft.class, defaultInstance);
            }

            public static Draft getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<Draft> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftDataOrBuilder
        public String getAny() {
            return this.any_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftDataOrBuilder
        public ByteString getAnyBytes() {
            return ByteString.copyFromUtf8(this.any_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAny(String value) {
            value.getClass();
            this.any_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAny() {
            this.any_ = getDefaultInstance().getAny();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAnyBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.any_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftDataOrBuilder
        public boolean hasDraft() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftDataOrBuilder
        public Draft getDraft() {
            return this.draft_ == null ? Draft.getDefaultInstance() : this.draft_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDraft(Draft value) {
            value.getClass();
            this.draft_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDraft(Draft value) {
            value.getClass();
            if (this.draft_ != null && this.draft_ != Draft.getDefaultInstance()) {
                this.draft_ = Draft.newBuilder(this.draft_).mergeFrom((Draft.Builder) value).buildPartial();
            } else {
                this.draft_ = value;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDraft() {
            this.draft_ = null;
            this.bitField0_ &= -2;
        }

        public static DraftData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DraftData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DraftData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DraftData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DraftData parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DraftData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DraftData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DraftData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DraftData parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DraftData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DraftData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DraftData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DraftData parseFrom(InputStream input) throws IOException {
            return (DraftData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DraftData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DraftData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DraftData parseDelimitedFrom(InputStream input) throws IOException {
            return (DraftData) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DraftData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DraftData) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DraftData parseFrom(CodedInputStream input) throws IOException {
            return (DraftData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DraftData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DraftData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(DraftData prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<DraftData, Builder> implements DraftDataOrBuilder {
            private Builder() {
                super(DraftData.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftDataOrBuilder
            public String getAny() {
                return ((DraftData) this.instance).getAny();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftDataOrBuilder
            public ByteString getAnyBytes() {
                return ((DraftData) this.instance).getAnyBytes();
            }

            public Builder setAny(String value) {
                copyOnWrite();
                ((DraftData) this.instance).setAny(value);
                return this;
            }

            public Builder clearAny() {
                copyOnWrite();
                ((DraftData) this.instance).clearAny();
                return this;
            }

            public Builder setAnyBytes(ByteString value) {
                copyOnWrite();
                ((DraftData) this.instance).setAnyBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftDataOrBuilder
            public boolean hasDraft() {
                return ((DraftData) this.instance).hasDraft();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.draft_input.DraftDataOrBuilder
            public Draft getDraft() {
                return ((DraftData) this.instance).getDraft();
            }

            public Builder setDraft(Draft value) {
                copyOnWrite();
                ((DraftData) this.instance).setDraft(value);
                return this;
            }

            public Builder setDraft(Draft.Builder builderForValue) {
                copyOnWrite();
                ((DraftData) this.instance).setDraft(builderForValue.build());
                return this;
            }

            public Builder mergeDraft(Draft value) {
                copyOnWrite();
                ((DraftData) this.instance).mergeDraft(value);
                return this;
            }

            public Builder clearDraft() {
                copyOnWrite();
                ((DraftData) this.instance).clearDraft();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new DraftData();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "any_", "draft_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<DraftData> parser = PARSER;
                    if (parser == null) {
                        synchronized (DraftData.class) {
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
            DraftData defaultInstance = new DraftData();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(DraftData.class, defaultInstance);
        }

        public static DraftData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<DraftData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.draft_inputOrBuilder
    public boolean hasInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.draft_inputOrBuilder
    public INFO getInfo() {
        return this.info_ == null ? INFO.getDefaultInstance() : this.info_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInfo(INFO value) {
        value.getClass();
        this.info_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInfo(INFO value) {
        value.getClass();
        if (this.info_ != null && this.info_ != INFO.getDefaultInstance()) {
            this.info_ = INFO.newBuilder(this.info_).mergeFrom((INFO.Builder) value).buildPartial();
        } else {
            this.info_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInfo() {
        this.info_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.draft_inputOrBuilder
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.draft_inputOrBuilder
    public DraftData getData() {
        return this.data_ == null ? DraftData.getDefaultInstance() : this.data_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(DraftData value) {
        value.getClass();
        this.data_ = value;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeData(DraftData value) {
        value.getClass();
        if (this.data_ != null && this.data_ != DraftData.getDefaultInstance()) {
            this.data_ = DraftData.newBuilder(this.data_).mergeFrom((DraftData.Builder) value).buildPartial();
        } else {
            this.data_ = value;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = null;
        this.bitField0_ &= -3;
    }

    public static draft_input parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (draft_input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static draft_input parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (draft_input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static draft_input parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (draft_input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static draft_input parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (draft_input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static draft_input parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (draft_input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static draft_input parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (draft_input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static draft_input parseFrom(InputStream input) throws IOException {
        return (draft_input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static draft_input parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (draft_input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static draft_input parseDelimitedFrom(InputStream input) throws IOException {
        return (draft_input) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static draft_input parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (draft_input) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static draft_input parseFrom(CodedInputStream input) throws IOException {
        return (draft_input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static draft_input parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (draft_input) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(draft_input prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<draft_input, Builder> implements draft_inputOrBuilder {
        private Builder() {
            super(draft_input.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.draft_inputOrBuilder
        public boolean hasInfo() {
            return ((draft_input) this.instance).hasInfo();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.draft_inputOrBuilder
        public INFO getInfo() {
            return ((draft_input) this.instance).getInfo();
        }

        public Builder setInfo(INFO value) {
            copyOnWrite();
            ((draft_input) this.instance).setInfo(value);
            return this;
        }

        public Builder setInfo(INFO.Builder builderForValue) {
            copyOnWrite();
            ((draft_input) this.instance).setInfo(builderForValue.build());
            return this;
        }

        public Builder mergeInfo(INFO value) {
            copyOnWrite();
            ((draft_input) this.instance).mergeInfo(value);
            return this;
        }

        public Builder clearInfo() {
            copyOnWrite();
            ((draft_input) this.instance).clearInfo();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.draft_inputOrBuilder
        public boolean hasData() {
            return ((draft_input) this.instance).hasData();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.draft_inputOrBuilder
        public DraftData getData() {
            return ((draft_input) this.instance).getData();
        }

        public Builder setData(DraftData value) {
            copyOnWrite();
            ((draft_input) this.instance).setData(value);
            return this;
        }

        public Builder setData(DraftData.Builder builderForValue) {
            copyOnWrite();
            ((draft_input) this.instance).setData(builderForValue.build());
            return this;
        }

        public Builder mergeData(DraftData value) {
            copyOnWrite();
            ((draft_input) this.instance).mergeData(value);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((draft_input) this.instance).clearData();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new draft_input();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "info_", "data_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<draft_input> parser = PARSER;
                if (parser == null) {
                    synchronized (draft_input.class) {
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
        draft_input defaultInstance = new draft_input();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(draft_input.class, defaultInstance);
    }

    public static draft_input getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<draft_input> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
