package com.yhchat.canarys.proto.group;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.group.Bot_data;
import com.yhchat.canarys.proto.group.Status;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class bot_list extends GeneratedMessageLite<bot_list, Builder> implements bot_listOrBuilder {
    public static final int BOT_FIELD_NUMBER = 2;
    private static final bot_list DEFAULT_INSTANCE;
    public static final int INSTRUCTION_FIELD_NUMBER = 3;
    public static final int MENU_FIELD_NUMBER = 4;
    private static volatile Parser<bot_list> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    private int bitField0_;
    private Internal.ProtobufList<Bot_data> bot_ = emptyProtobufList();
    private Internal.ProtobufList<Instruction_data> instruction_ = emptyProtobufList();
    private Internal.ProtobufList<Menu_data> menu_ = emptyProtobufList();
    private Status status_;

    public interface Instruction_dataOrBuilder extends MessageLiteOrBuilder {
        String getBotId();

        ByteString getBotIdBytes();

        String getBotName();

        ByteString getBotNameBytes();

        String getDefaultText();

        ByteString getDefaultTextBytes();

        String getDesc();

        ByteString getDescBytes();

        String getForm();

        ByteString getFormBytes();

        String getHintText();

        ByteString getHintTextBytes();

        long getId();

        String getName();

        ByteString getNameBytes();

        long getSort();

        int getType();
    }

    public interface Menu_dataOrBuilder extends MessageLiteOrBuilder {
        String getBotId();

        ByteString getBotIdBytes();

        String getContent();

        ByteString getContentBytes();

        long getCreateTime();

        long getId();

        int getMenuAction();

        int getMenuType();

        String getName();

        ByteString getNameBytes();

        String getSelect();

        ByteString getSelectBytes();
    }

    private bot_list() {
    }

    public static final class Instruction_data extends GeneratedMessageLite<Instruction_data, Builder> implements Instruction_dataOrBuilder {
        public static final int BOT_ID_FIELD_NUMBER = 2;
        public static final int BOT_NAME_FIELD_NUMBER = 11;
        private static final Instruction_data DEFAULT_INSTANCE;
        public static final int DEFAULT_TEXT_FIELD_NUMBER = 7;
        public static final int DESC_FIELD_NUMBER = 4;
        public static final int FORM_FIELD_NUMBER = 10;
        public static final int HINT_TEXT_FIELD_NUMBER = 6;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile Parser<Instruction_data> PARSER = null;
        public static final int SORT_FIELD_NUMBER = 9;
        public static final int TYPE_FIELD_NUMBER = 5;
        private long id_;
        private long sort_;
        private int type_;
        private String botId_ = "";
        private String name_ = "";
        private String desc_ = "";
        private String hintText_ = "";
        private String defaultText_ = "";
        private String form_ = "";
        private String botName_ = "";

        private Instruction_data() {
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public String getBotId() {
            return this.botId_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public String getDesc() {
            return this.desc_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public ByteString getDescBytes() {
            return ByteString.copyFromUtf8(this.desc_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDesc(String value) {
            value.getClass();
            this.desc_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDesc() {
            this.desc_ = getDefaultInstance().getDesc();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.desc_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public int getType() {
            return this.type_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(int value) {
            this.type_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = 0;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public String getHintText() {
            return this.hintText_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public ByteString getHintTextBytes() {
            return ByteString.copyFromUtf8(this.hintText_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHintText(String value) {
            value.getClass();
            this.hintText_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHintText() {
            this.hintText_ = getDefaultInstance().getHintText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHintTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.hintText_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public String getDefaultText() {
            return this.defaultText_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public long getSort() {
            return this.sort_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSort(long value) {
            this.sort_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSort() {
            this.sort_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public String getForm() {
            return this.form_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public ByteString getFormBytes() {
            return ByteString.copyFromUtf8(this.form_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForm(String value) {
            value.getClass();
            this.form_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForm() {
            this.form_ = getDefaultInstance().getForm();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFormBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.form_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public String getBotName() {
            return this.botName_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
        public ByteString getBotNameBytes() {
            return ByteString.copyFromUtf8(this.botName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBotName(String value) {
            value.getClass();
            this.botName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBotName() {
            this.botName_ = getDefaultInstance().getBotName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBotNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.botName_ = value.toStringUtf8();
        }

        public static Instruction_data parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Instruction_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Instruction_data parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Instruction_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Instruction_data parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Instruction_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Instruction_data parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Instruction_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Instruction_data parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Instruction_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Instruction_data parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Instruction_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Instruction_data parseFrom(InputStream input) throws IOException {
            return (Instruction_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Instruction_data parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Instruction_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Instruction_data parseDelimitedFrom(InputStream input) throws IOException {
            return (Instruction_data) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Instruction_data parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Instruction_data) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Instruction_data parseFrom(CodedInputStream input) throws IOException {
            return (Instruction_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Instruction_data parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Instruction_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Instruction_data prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Instruction_data, Builder> implements Instruction_dataOrBuilder {
            private Builder() {
                super(Instruction_data.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public long getId() {
                return ((Instruction_data) this.instance).getId();
            }

            public Builder setId(long value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setId(value);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Instruction_data) this.instance).clearId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public String getBotId() {
                return ((Instruction_data) this.instance).getBotId();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public ByteString getBotIdBytes() {
                return ((Instruction_data) this.instance).getBotIdBytes();
            }

            public Builder setBotId(String value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setBotId(value);
                return this;
            }

            public Builder clearBotId() {
                copyOnWrite();
                ((Instruction_data) this.instance).clearBotId();
                return this;
            }

            public Builder setBotIdBytes(ByteString value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setBotIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public String getName() {
                return ((Instruction_data) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public ByteString getNameBytes() {
                return ((Instruction_data) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Instruction_data) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public String getDesc() {
                return ((Instruction_data) this.instance).getDesc();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public ByteString getDescBytes() {
                return ((Instruction_data) this.instance).getDescBytes();
            }

            public Builder setDesc(String value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setDesc(value);
                return this;
            }

            public Builder clearDesc() {
                copyOnWrite();
                ((Instruction_data) this.instance).clearDesc();
                return this;
            }

            public Builder setDescBytes(ByteString value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setDescBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public int getType() {
                return ((Instruction_data) this.instance).getType();
            }

            public Builder setType(int value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setType(value);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Instruction_data) this.instance).clearType();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public String getHintText() {
                return ((Instruction_data) this.instance).getHintText();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public ByteString getHintTextBytes() {
                return ((Instruction_data) this.instance).getHintTextBytes();
            }

            public Builder setHintText(String value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setHintText(value);
                return this;
            }

            public Builder clearHintText() {
                copyOnWrite();
                ((Instruction_data) this.instance).clearHintText();
                return this;
            }

            public Builder setHintTextBytes(ByteString value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setHintTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public String getDefaultText() {
                return ((Instruction_data) this.instance).getDefaultText();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public ByteString getDefaultTextBytes() {
                return ((Instruction_data) this.instance).getDefaultTextBytes();
            }

            public Builder setDefaultText(String value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setDefaultText(value);
                return this;
            }

            public Builder clearDefaultText() {
                copyOnWrite();
                ((Instruction_data) this.instance).clearDefaultText();
                return this;
            }

            public Builder setDefaultTextBytes(ByteString value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setDefaultTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public long getSort() {
                return ((Instruction_data) this.instance).getSort();
            }

            public Builder setSort(long value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setSort(value);
                return this;
            }

            public Builder clearSort() {
                copyOnWrite();
                ((Instruction_data) this.instance).clearSort();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public String getForm() {
                return ((Instruction_data) this.instance).getForm();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public ByteString getFormBytes() {
                return ((Instruction_data) this.instance).getFormBytes();
            }

            public Builder setForm(String value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setForm(value);
                return this;
            }

            public Builder clearForm() {
                copyOnWrite();
                ((Instruction_data) this.instance).clearForm();
                return this;
            }

            public Builder setFormBytes(ByteString value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setFormBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public String getBotName() {
                return ((Instruction_data) this.instance).getBotName();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Instruction_dataOrBuilder
            public ByteString getBotNameBytes() {
                return ((Instruction_data) this.instance).getBotNameBytes();
            }

            public Builder setBotName(String value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setBotName(value);
                return this;
            }

            public Builder clearBotName() {
                copyOnWrite();
                ((Instruction_data) this.instance).clearBotName();
                return this;
            }

            public Builder setBotNameBytes(ByteString value) {
                copyOnWrite();
                ((Instruction_data) this.instance).setBotNameBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Instruction_data();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"id_", "botId_", "name_", "desc_", "type_", "hintText_", "defaultText_", "sort_", "form_", "botName_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0004\u0006\u0208\u0007\u0208\t\u0002\n\u0208\u000b\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Instruction_data> parser = PARSER;
                    if (parser == null) {
                        synchronized (Instruction_data.class) {
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
            Instruction_data defaultInstance = new Instruction_data();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Instruction_data.class, defaultInstance);
        }

        public static Instruction_data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Instruction_data> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Menu_data extends GeneratedMessageLite<Menu_data, Builder> implements Menu_dataOrBuilder {
        public static final int BOT_ID_FIELD_NUMBER = 2;
        public static final int CONTENT_FIELD_NUMBER = 5;
        public static final int CREATE_TIME_FIELD_NUMBER = 7;
        private static final Menu_data DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MENU_ACTION_FIELD_NUMBER = 10;
        public static final int MENU_TYPE_FIELD_NUMBER = 6;
        public static final int NAME_FIELD_NUMBER = 4;
        private static volatile Parser<Menu_data> PARSER = null;
        public static final int SELECT_FIELD_NUMBER = 99;
        private long createTime_;
        private long id_;
        private int menuAction_;
        private int menuType_;
        private String botId_ = "";
        private String name_ = "";
        private String content_ = "";
        private String select_ = "";

        private Menu_data() {
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
        public String getBotId() {
            return this.botId_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
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

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
        public String getContent() {
            return this.content_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
        public ByteString getContentBytes() {
            return ByteString.copyFromUtf8(this.content_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(String value) {
            value.getClass();
            this.content_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.content_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
        public int getMenuType() {
            return this.menuType_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMenuType(int value) {
            this.menuType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMenuType() {
            this.menuType_ = 0;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
        public long getCreateTime() {
            return this.createTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCreateTime(long value) {
            this.createTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCreateTime() {
            this.createTime_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
        public int getMenuAction() {
            return this.menuAction_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMenuAction(int value) {
            this.menuAction_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMenuAction() {
            this.menuAction_ = 0;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
        public String getSelect() {
            return this.select_;
        }

        @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
        public ByteString getSelectBytes() {
            return ByteString.copyFromUtf8(this.select_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelect(String value) {
            value.getClass();
            this.select_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSelect() {
            this.select_ = getDefaultInstance().getSelect();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSelectBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.select_ = value.toStringUtf8();
        }

        public static Menu_data parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Menu_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Menu_data parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Menu_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Menu_data parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Menu_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Menu_data parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Menu_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Menu_data parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Menu_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Menu_data parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Menu_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Menu_data parseFrom(InputStream input) throws IOException {
            return (Menu_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Menu_data parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Menu_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Menu_data parseDelimitedFrom(InputStream input) throws IOException {
            return (Menu_data) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Menu_data parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Menu_data) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Menu_data parseFrom(CodedInputStream input) throws IOException {
            return (Menu_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Menu_data parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Menu_data) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Menu_data prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Menu_data, Builder> implements Menu_dataOrBuilder {
            private Builder() {
                super(Menu_data.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public long getId() {
                return ((Menu_data) this.instance).getId();
            }

            public Builder setId(long value) {
                copyOnWrite();
                ((Menu_data) this.instance).setId(value);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((Menu_data) this.instance).clearId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public String getBotId() {
                return ((Menu_data) this.instance).getBotId();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public ByteString getBotIdBytes() {
                return ((Menu_data) this.instance).getBotIdBytes();
            }

            public Builder setBotId(String value) {
                copyOnWrite();
                ((Menu_data) this.instance).setBotId(value);
                return this;
            }

            public Builder clearBotId() {
                copyOnWrite();
                ((Menu_data) this.instance).clearBotId();
                return this;
            }

            public Builder setBotIdBytes(ByteString value) {
                copyOnWrite();
                ((Menu_data) this.instance).setBotIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public String getName() {
                return ((Menu_data) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public ByteString getNameBytes() {
                return ((Menu_data) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((Menu_data) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Menu_data) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((Menu_data) this.instance).setNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public String getContent() {
                return ((Menu_data) this.instance).getContent();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public ByteString getContentBytes() {
                return ((Menu_data) this.instance).getContentBytes();
            }

            public Builder setContent(String value) {
                copyOnWrite();
                ((Menu_data) this.instance).setContent(value);
                return this;
            }

            public Builder clearContent() {
                copyOnWrite();
                ((Menu_data) this.instance).clearContent();
                return this;
            }

            public Builder setContentBytes(ByteString value) {
                copyOnWrite();
                ((Menu_data) this.instance).setContentBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public int getMenuType() {
                return ((Menu_data) this.instance).getMenuType();
            }

            public Builder setMenuType(int value) {
                copyOnWrite();
                ((Menu_data) this.instance).setMenuType(value);
                return this;
            }

            public Builder clearMenuType() {
                copyOnWrite();
                ((Menu_data) this.instance).clearMenuType();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public long getCreateTime() {
                return ((Menu_data) this.instance).getCreateTime();
            }

            public Builder setCreateTime(long value) {
                copyOnWrite();
                ((Menu_data) this.instance).setCreateTime(value);
                return this;
            }

            public Builder clearCreateTime() {
                copyOnWrite();
                ((Menu_data) this.instance).clearCreateTime();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public int getMenuAction() {
                return ((Menu_data) this.instance).getMenuAction();
            }

            public Builder setMenuAction(int value) {
                copyOnWrite();
                ((Menu_data) this.instance).setMenuAction(value);
                return this;
            }

            public Builder clearMenuAction() {
                copyOnWrite();
                ((Menu_data) this.instance).clearMenuAction();
                return this;
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public String getSelect() {
                return ((Menu_data) this.instance).getSelect();
            }

            @Override // com.yhchat.canarys.proto.group.bot_list.Menu_dataOrBuilder
            public ByteString getSelectBytes() {
                return ((Menu_data) this.instance).getSelectBytes();
            }

            public Builder setSelect(String value) {
                copyOnWrite();
                ((Menu_data) this.instance).setSelect(value);
                return this;
            }

            public Builder clearSelect() {
                copyOnWrite();
                ((Menu_data) this.instance).clearSelect();
                return this;
            }

            public Builder setSelectBytes(ByteString value) {
                copyOnWrite();
                ((Menu_data) this.instance).setSelectBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Menu_data();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"id_", "botId_", "name_", "content_", "menuType_", "createTime_", "menuAction_", "select_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001c\b\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0004\u0208\u0005\u0208\u0006\u0004\u0007\u0002\n\u0004c\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Menu_data> parser = PARSER;
                    if (parser == null) {
                        synchronized (Menu_data.class) {
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
            Menu_data defaultInstance = new Menu_data();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Menu_data.class, defaultInstance);
        }

        public static Menu_data getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Menu_data> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
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

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
    public List<Bot_data> getBotList() {
        return this.bot_;
    }

    public List<? extends Bot_dataOrBuilder> getBotOrBuilderList() {
        return this.bot_;
    }

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
    public int getBotCount() {
        return this.bot_.size();
    }

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
    public Bot_data getBot(int index) {
        return this.bot_.get(index);
    }

    public Bot_dataOrBuilder getBotOrBuilder(int index) {
        return this.bot_.get(index);
    }

    private void ensureBotIsMutable() {
        Internal.ProtobufList<Bot_data> tmp = this.bot_;
        if (!tmp.isModifiable()) {
            this.bot_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBot(int index, Bot_data value) {
        value.getClass();
        ensureBotIsMutable();
        this.bot_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBot(Bot_data value) {
        value.getClass();
        ensureBotIsMutable();
        this.bot_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBot(int index, Bot_data value) {
        value.getClass();
        ensureBotIsMutable();
        this.bot_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllBot(Iterable<? extends Bot_data> values) {
        ensureBotIsMutable();
        AbstractMessageLite.addAll(values, this.bot_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBot() {
        this.bot_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBot(int index) {
        ensureBotIsMutable();
        this.bot_.remove(index);
    }

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
    public List<Instruction_data> getInstructionList() {
        return this.instruction_;
    }

    public List<? extends Instruction_dataOrBuilder> getInstructionOrBuilderList() {
        return this.instruction_;
    }

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
    public int getInstructionCount() {
        return this.instruction_.size();
    }

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
    public Instruction_data getInstruction(int index) {
        return this.instruction_.get(index);
    }

    public Instruction_dataOrBuilder getInstructionOrBuilder(int index) {
        return this.instruction_.get(index);
    }

    private void ensureInstructionIsMutable() {
        Internal.ProtobufList<Instruction_data> tmp = this.instruction_;
        if (!tmp.isModifiable()) {
            this.instruction_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstruction(int index, Instruction_data value) {
        value.getClass();
        ensureInstructionIsMutable();
        this.instruction_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInstruction(Instruction_data value) {
        value.getClass();
        ensureInstructionIsMutable();
        this.instruction_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addInstruction(int index, Instruction_data value) {
        value.getClass();
        ensureInstructionIsMutable();
        this.instruction_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllInstruction(Iterable<? extends Instruction_data> values) {
        ensureInstructionIsMutable();
        AbstractMessageLite.addAll(values, this.instruction_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstruction() {
        this.instruction_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeInstruction(int index) {
        ensureInstructionIsMutable();
        this.instruction_.remove(index);
    }

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
    public List<Menu_data> getMenuList() {
        return this.menu_;
    }

    public List<? extends Menu_dataOrBuilder> getMenuOrBuilderList() {
        return this.menu_;
    }

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
    public int getMenuCount() {
        return this.menu_.size();
    }

    @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
    public Menu_data getMenu(int index) {
        return this.menu_.get(index);
    }

    public Menu_dataOrBuilder getMenuOrBuilder(int index) {
        return this.menu_.get(index);
    }

    private void ensureMenuIsMutable() {
        Internal.ProtobufList<Menu_data> tmp = this.menu_;
        if (!tmp.isModifiable()) {
            this.menu_ = GeneratedMessageLite.mutableCopy(tmp);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMenu(int index, Menu_data value) {
        value.getClass();
        ensureMenuIsMutable();
        this.menu_.set(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMenu(Menu_data value) {
        value.getClass();
        ensureMenuIsMutable();
        this.menu_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMenu(int index, Menu_data value) {
        value.getClass();
        ensureMenuIsMutable();
        this.menu_.add(index, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMenu(Iterable<? extends Menu_data> values) {
        ensureMenuIsMutable();
        AbstractMessageLite.addAll(values, this.menu_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMenu() {
        this.menu_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMenu(int index) {
        ensureMenuIsMutable();
        this.menu_.remove(index);
    }

    public static bot_list parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (bot_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static bot_list parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (bot_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static bot_list parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (bot_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static bot_list parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (bot_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static bot_list parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (bot_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static bot_list parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (bot_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static bot_list parseFrom(InputStream input) throws IOException {
        return (bot_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static bot_list parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (bot_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static bot_list parseDelimitedFrom(InputStream input) throws IOException {
        return (bot_list) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static bot_list parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (bot_list) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static bot_list parseFrom(CodedInputStream input) throws IOException {
        return (bot_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static bot_list parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (bot_list) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(bot_list prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<bot_list, Builder> implements bot_listOrBuilder {
        private Builder() {
            super(bot_list.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public boolean hasStatus() {
            return ((bot_list) this.instance).hasStatus();
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public Status getStatus() {
            return ((bot_list) this.instance).getStatus();
        }

        public Builder setStatus(Status value) {
            copyOnWrite();
            ((bot_list) this.instance).setStatus(value);
            return this;
        }

        public Builder setStatus(Status.Builder builderForValue) {
            copyOnWrite();
            ((bot_list) this.instance).setStatus(builderForValue.build());
            return this;
        }

        public Builder mergeStatus(Status value) {
            copyOnWrite();
            ((bot_list) this.instance).mergeStatus(value);
            return this;
        }

        public Builder clearStatus() {
            copyOnWrite();
            ((bot_list) this.instance).clearStatus();
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public List<Bot_data> getBotList() {
            return Collections.unmodifiableList(((bot_list) this.instance).getBotList());
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public int getBotCount() {
            return ((bot_list) this.instance).getBotCount();
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public Bot_data getBot(int index) {
            return ((bot_list) this.instance).getBot(index);
        }

        public Builder setBot(int index, Bot_data value) {
            copyOnWrite();
            ((bot_list) this.instance).setBot(index, value);
            return this;
        }

        public Builder setBot(int index, Bot_data.Builder builderForValue) {
            copyOnWrite();
            ((bot_list) this.instance).setBot(index, builderForValue.build());
            return this;
        }

        public Builder addBot(Bot_data value) {
            copyOnWrite();
            ((bot_list) this.instance).addBot(value);
            return this;
        }

        public Builder addBot(int index, Bot_data value) {
            copyOnWrite();
            ((bot_list) this.instance).addBot(index, value);
            return this;
        }

        public Builder addBot(Bot_data.Builder builderForValue) {
            copyOnWrite();
            ((bot_list) this.instance).addBot(builderForValue.build());
            return this;
        }

        public Builder addBot(int index, Bot_data.Builder builderForValue) {
            copyOnWrite();
            ((bot_list) this.instance).addBot(index, builderForValue.build());
            return this;
        }

        public Builder addAllBot(Iterable<? extends Bot_data> values) {
            copyOnWrite();
            ((bot_list) this.instance).addAllBot(values);
            return this;
        }

        public Builder clearBot() {
            copyOnWrite();
            ((bot_list) this.instance).clearBot();
            return this;
        }

        public Builder removeBot(int index) {
            copyOnWrite();
            ((bot_list) this.instance).removeBot(index);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public List<Instruction_data> getInstructionList() {
            return Collections.unmodifiableList(((bot_list) this.instance).getInstructionList());
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public int getInstructionCount() {
            return ((bot_list) this.instance).getInstructionCount();
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public Instruction_data getInstruction(int index) {
            return ((bot_list) this.instance).getInstruction(index);
        }

        public Builder setInstruction(int index, Instruction_data value) {
            copyOnWrite();
            ((bot_list) this.instance).setInstruction(index, value);
            return this;
        }

        public Builder setInstruction(int index, Instruction_data.Builder builderForValue) {
            copyOnWrite();
            ((bot_list) this.instance).setInstruction(index, builderForValue.build());
            return this;
        }

        public Builder addInstruction(Instruction_data value) {
            copyOnWrite();
            ((bot_list) this.instance).addInstruction(value);
            return this;
        }

        public Builder addInstruction(int index, Instruction_data value) {
            copyOnWrite();
            ((bot_list) this.instance).addInstruction(index, value);
            return this;
        }

        public Builder addInstruction(Instruction_data.Builder builderForValue) {
            copyOnWrite();
            ((bot_list) this.instance).addInstruction(builderForValue.build());
            return this;
        }

        public Builder addInstruction(int index, Instruction_data.Builder builderForValue) {
            copyOnWrite();
            ((bot_list) this.instance).addInstruction(index, builderForValue.build());
            return this;
        }

        public Builder addAllInstruction(Iterable<? extends Instruction_data> values) {
            copyOnWrite();
            ((bot_list) this.instance).addAllInstruction(values);
            return this;
        }

        public Builder clearInstruction() {
            copyOnWrite();
            ((bot_list) this.instance).clearInstruction();
            return this;
        }

        public Builder removeInstruction(int index) {
            copyOnWrite();
            ((bot_list) this.instance).removeInstruction(index);
            return this;
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public List<Menu_data> getMenuList() {
            return Collections.unmodifiableList(((bot_list) this.instance).getMenuList());
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public int getMenuCount() {
            return ((bot_list) this.instance).getMenuCount();
        }

        @Override // com.yhchat.canarys.proto.group.bot_listOrBuilder
        public Menu_data getMenu(int index) {
            return ((bot_list) this.instance).getMenu(index);
        }

        public Builder setMenu(int index, Menu_data value) {
            copyOnWrite();
            ((bot_list) this.instance).setMenu(index, value);
            return this;
        }

        public Builder setMenu(int index, Menu_data.Builder builderForValue) {
            copyOnWrite();
            ((bot_list) this.instance).setMenu(index, builderForValue.build());
            return this;
        }

        public Builder addMenu(Menu_data value) {
            copyOnWrite();
            ((bot_list) this.instance).addMenu(value);
            return this;
        }

        public Builder addMenu(int index, Menu_data value) {
            copyOnWrite();
            ((bot_list) this.instance).addMenu(index, value);
            return this;
        }

        public Builder addMenu(Menu_data.Builder builderForValue) {
            copyOnWrite();
            ((bot_list) this.instance).addMenu(builderForValue.build());
            return this;
        }

        public Builder addMenu(int index, Menu_data.Builder builderForValue) {
            copyOnWrite();
            ((bot_list) this.instance).addMenu(index, builderForValue.build());
            return this;
        }

        public Builder addAllMenu(Iterable<? extends Menu_data> values) {
            copyOnWrite();
            ((bot_list) this.instance).addAllMenu(values);
            return this;
        }

        public Builder clearMenu() {
            copyOnWrite();
            ((bot_list) this.instance).clearMenu();
            return this;
        }

        public Builder removeMenu(int index) {
            copyOnWrite();
            ((bot_list) this.instance).removeMenu(index);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new bot_list();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "status_", "bot_", Bot_data.class, "instruction_", Instruction_data.class, "menu_", Menu_data.class};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u001b\u0004\u001b", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<bot_list> parser = PARSER;
                if (parser == null) {
                    synchronized (bot_list.class) {
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
        bot_list defaultInstance = new bot_list();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(bot_list.class, defaultInstance);
    }

    public static bot_list getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<bot_list> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
