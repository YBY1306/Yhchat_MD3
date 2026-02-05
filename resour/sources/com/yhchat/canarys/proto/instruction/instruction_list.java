package com.yhchat.canarys.proto.instruction;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.instruction.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes17.dex */
public final class instruction_list extends GeneratedMessageLite<instruction_list, Builder> implements instruction_listOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final instruction_list DEFAULT_INSTANCE;
    private static volatile Parser<instruction_list> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Internal.ProtobufList<Data> data_ = emptyProtobufList();
    private Status status_;

    public interface DataOrBuilder extends MessageLiteOrBuilder {
        String getBotId();

        ByteString getBotIdBytes();

        String getBotSettingsJson();

        ByteString getBotSettingsJsonBytes();

        long getCommandId();

        String getCommandName();

        ByteString getCommandNameBytes();

        String getDefaultText();

        ByteString getDefaultTextBytes();

        long getInstructionType();
    }

    private instruction_list() {
    }

    public static final class Data extends GeneratedMessageLite<Data, Builder> implements DataOrBuilder {
        public static final int BOT_ID_FIELD_NUMBER = 2;
        public static final int BOT_SETTINGS_JSON_FIELD_NUMBER = 10;
        public static final int COMMAND_ID_FIELD_NUMBER = 1;
        public static final int COMMAND_NAME_FIELD_NUMBER = 3;
        private static final Data DEFAULT_INSTANCE;
        public static final int DEFAULT_TEXT_FIELD_NUMBER = 7;
        public static final int INSTRUCTION_TYPE_FIELD_NUMBER = 5;
        private static volatile Parser<Data> PARSER;
        private long commandId_;
        private long instructionType_;
        private String botId_ = "";
        private String commandName_ = "";
        private String defaultText_ = "";
        private String botSettingsJson_ = "";

        private Data() {
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
        public long getCommandId() {
            return this.commandId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommandId(long value) {
            this.commandId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommandId() {
            this.commandId_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
        public String getBotId() {
            return this.botId_;
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
        public ByteString getBotIdBytes() {
            return ByteString.copyFromUtf8(this.botId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBotId(String value) {
            value.getClass();
            this.botId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBotId() {
            this.botId_ = getDefaultInstance().getBotId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBotIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.botId_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
        public String getCommandName() {
            return this.commandName_;
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
        public ByteString getCommandNameBytes() {
            return ByteString.copyFromUtf8(this.commandName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommandName(String value) {
            value.getClass();
            this.commandName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCommandName() {
            this.commandName_ = getDefaultInstance().getCommandName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCommandNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.commandName_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
        public long getInstructionType() {
            return this.instructionType_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstructionType(long value) {
            this.instructionType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInstructionType() {
            this.instructionType_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
        public String getDefaultText() {
            return this.defaultText_;
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
        public ByteString getDefaultTextBytes() {
            return ByteString.copyFromUtf8(this.defaultText_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultText(String value) {
            value.getClass();
            this.defaultText_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDefaultText() {
            this.defaultText_ = getDefaultInstance().getDefaultText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDefaultTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.defaultText_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
        public String getBotSettingsJson() {
            return this.botSettingsJson_;
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
        public ByteString getBotSettingsJsonBytes() {
            return ByteString.copyFromUtf8(this.botSettingsJson_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBotSettingsJson(String value) {
            value.getClass();
            this.botSettingsJson_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBotSettingsJson() {
            this.botSettingsJson_ = getDefaultInstance().getBotSettingsJson();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBotSettingsJsonBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.botSettingsJson_ = value.toStringUtf8();
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

            @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
            public long getCommandId() {
                return ((Data) this.instance).getCommandId();
            }

            public Builder setCommandId(long value) {
                copyOnWrite();
                ((Data) this.instance).setCommandId(value);
                return this;
            }

            public Builder clearCommandId() {
                copyOnWrite();
                ((Data) this.instance).clearCommandId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
            public String getBotId() {
                return ((Data) this.instance).getBotId();
            }

            @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
            public ByteString getBotIdBytes() {
                return ((Data) this.instance).getBotIdBytes();
            }

            public Builder setBotId(String value) {
                copyOnWrite();
                ((Data) this.instance).setBotId(value);
                return this;
            }

            public Builder clearBotId() {
                copyOnWrite();
                ((Data) this.instance).clearBotId();
                return this;
            }

            public Builder setBotIdBytes(ByteString value) {
                copyOnWrite();
                ((Data) this.instance).setBotIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
            public String getCommandName() {
                return ((Data) this.instance).getCommandName();
            }

            @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
            public ByteString getCommandNameBytes() {
                return ((Data) this.instance).getCommandNameBytes();
            }

            public Builder setCommandName(String value) {
                copyOnWrite();
                ((Data) this.instance).setCommandName(value);
                return this;
            }

            public Builder clearCommandName() {
                copyOnWrite();
                ((Data) this.instance).clearCommandName();
                return this;
            }

            public Builder setCommandNameBytes(ByteString value) {
                copyOnWrite();
                ((Data) this.instance).setCommandNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
            public long getInstructionType() {
                return ((Data) this.instance).getInstructionType();
            }

            public Builder setInstructionType(long value) {
                copyOnWrite();
                ((Data) this.instance).setInstructionType(value);
                return this;
            }

            public Builder clearInstructionType() {
                copyOnWrite();
                ((Data) this.instance).clearInstructionType();
                return this;
            }

            @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
            public String getDefaultText() {
                return ((Data) this.instance).getDefaultText();
            }

            @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
            public ByteString getDefaultTextBytes() {
                return ((Data) this.instance).getDefaultTextBytes();
            }

            public Builder setDefaultText(String value) {
                copyOnWrite();
                ((Data) this.instance).setDefaultText(value);
                return this;
            }

            public Builder clearDefaultText() {
                copyOnWrite();
                ((Data) this.instance).clearDefaultText();
                return this;
            }

            public Builder setDefaultTextBytes(ByteString value) {
                copyOnWrite();
                ((Data) this.instance).setDefaultTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
            public String getBotSettingsJson() {
                return ((Data) this.instance).getBotSettingsJson();
            }

            @Override // com.yhchat.canarys.proto.instruction.instruction_list.DataOrBuilder
            public ByteString getBotSettingsJsonBytes() {
                return ((Data) this.instance).getBotSettingsJsonBytes();
            }

            public Builder setBotSettingsJson(String value) {
                copyOnWrite();
                ((Data) this.instance).setBotSettingsJson(value);
                return this;
            }

            public Builder clearBotSettingsJson() {
                copyOnWrite();
                ((Data) this.instance).clearBotSettingsJson();
                return this;
            }

            public Builder setBotSettingsJsonBytes(ByteString value) {
                copyOnWrite();
                ((Data) this.instance).setBotSettingsJsonBytes(value);
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
                    Object[] objects = {"commandId_", "botId_", "commandName_", "instructionType_", "defaultText_", "botSettingsJson_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\n\u0006\u0000\u0000\u0000\u0001\u0003\u0002\u0208\u0003\u0208\u0005\u0003\u0007\u0208\n\u0208", objects);
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

    @Override // com.yhchat.canarys.proto.instruction.instruction_listOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.instruction.instruction_listOrBuilder
    public Status getStatus() {
        return this.status_ == null ? Status.getDefaultInstance() : this.status_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Status value) {
        value.getClass();
        this.status_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(Status value) {
        value.getClass();
        if (this.status_ != null && this.status_ != Status.getDefaultInstance()) {
            this.status_ = Status.newBuilder(this.status_).mergeFrom((Status.Builder) value).buildPartial();
        } else {
            this.status_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.instruction.instruction_listOrBuilder
    public List<Data> getDataList() {
        return this.data_;
    }

    public List<? extends DataOrBuilder> getDataOrBuilderList() {
        return this.data_;
    }

    @Override // com.yhchat.canarys.proto.instruction.instruction_listOrBuilder
    public int getDataCount() {
        return this.data_.size();
    }

    @Override // com.yhchat.canarys.proto.instruction.instruction_listOrBuilder
    public Data getData(int index) {
        return this.data_.get(index);
    }

    public DataOrBuilder getDataOrBuilder(int index) {
        return this.data_.get(index);
    }

    private void ensureDataIsMutable() {
        Internal.ProtobufList<Data> tmp = this.data_;
        if (!tmp.isModifiable()) {
            this.data_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(int index, Data value) {
        value.getClass();
        ensureDataIsMutable();
        this.data_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(Data value) {
        value.getClass();
        ensureDataIsMutable();
        this.data_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addData(int index, Data value) {
        value.getClass();
        ensureDataIsMutable();
        this.data_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllData(Iterable<? extends Data> values) {
        ensureDataIsMutable();
        AbstractMessageLite.addAll(values, this.data_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearData() {
        this.data_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeData(int index) {
        ensureDataIsMutable();
        this.data_.remove(index);
    }

    public static instruction_list parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (instruction_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static instruction_list parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (instruction_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static instruction_list parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (instruction_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static instruction_list parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (instruction_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static instruction_list parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (instruction_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static instruction_list parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (instruction_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static instruction_list parseFrom(InputStream input) throws IOException {
        return (instruction_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static instruction_list parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (instruction_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static instruction_list parseDelimitedFrom(InputStream input) throws IOException {
        return (instruction_list) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static instruction_list parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (instruction_list) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static instruction_list parseFrom(CodedInputStream input) throws IOException {
        return (instruction_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static instruction_list parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (instruction_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(instruction_list prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<instruction_list, Builder> implements instruction_listOrBuilder {
        private Builder() {
            super(instruction_list.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_listOrBuilder
        public boolean hasStatus() {
            return ((instruction_list) this.instance).hasStatus();
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_listOrBuilder
        public Status getStatus() {
            return ((instruction_list) this.instance).getStatus();
        }

        public Builder setStatus(Status value) {
            copyOnWrite();
            ((instruction_list) this.instance).setStatus(value);
            return this;
        }

        public Builder setStatus(Status.Builder builderForValue) {
            copyOnWrite();
            ((instruction_list) this.instance).setStatus(builderForValue.build());
            return this;
        }

        public Builder mergeStatus(Status value) {
            copyOnWrite();
            ((instruction_list) this.instance).mergeStatus(value);
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((instruction_list) this.instance).clearStatus();
            return this;
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_listOrBuilder
        public List<Data> getDataList() {
            return Collections.unmodifiableList(((instruction_list) this.instance).getDataList());
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_listOrBuilder
        public int getDataCount() {
            return ((instruction_list) this.instance).getDataCount();
        }

        @Override // com.yhchat.canarys.proto.instruction.instruction_listOrBuilder
        public Data getData(int index) {
            return ((instruction_list) this.instance).getData(index);
        }

        public Builder setData(int index, Data value) {
            copyOnWrite();
            ((instruction_list) this.instance).setData(index, value);
            return this;
        }

        public Builder setData(int index, Data.Builder builderForValue) {
            copyOnWrite();
            ((instruction_list) this.instance).setData(index, builderForValue.build());
            return this;
        }

        public Builder addData(Data value) {
            copyOnWrite();
            ((instruction_list) this.instance).addData(value);
            return this;
        }

        public Builder addData(int index, Data value) {
            copyOnWrite();
            ((instruction_list) this.instance).addData(index, value);
            return this;
        }

        public Builder addData(Data.Builder builderForValue) {
            copyOnWrite();
            ((instruction_list) this.instance).addData(builderForValue.build());
            return this;
        }

        public Builder addData(int index, Data.Builder builderForValue) {
            copyOnWrite();
            ((instruction_list) this.instance).addData(index, builderForValue.build());
            return this;
        }

        public Builder addAllData(Iterable<? extends Data> values) {
            copyOnWrite();
            ((instruction_list) this.instance).addAllData(values);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((instruction_list) this.instance).clearData();
            return this;
        }

        public Builder removeData(int index) {
            copyOnWrite();
            ((instruction_list) this.instance).removeData(index);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new instruction_list();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "status_", "data_", Data.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<instruction_list> parser = PARSER;
                if (parser == null) {
                    synchronized (instruction_list.class) {
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
        instruction_list defaultInstance = new instruction_list();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(instruction_list.class, defaultInstance);
    }

    public static instruction_list getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<instruction_list> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
