package com.yhchat.canarys.proto.conversation;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class Conversation {

    public interface ConversationListOrBuilder extends MessageLiteOrBuilder {
        ConversationList.ConversationData getData(int index);

        int getDataCount();

        List<ConversationList.ConversationData> getDataList();

        String getRequestId();

        ByteString getRequestIdBytes();

        Status getStatus();

        int getTotal();

        boolean hasStatus();
    }

    public interface StatusOrBuilder extends MessageLiteOrBuilder {
        int getCode();

        String getMsg();

        ByteString getMsgBytes();

        long getNumber();
    }

    private Conversation() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }

    public static final class Status extends GeneratedMessageLite<Status, Builder> implements StatusOrBuilder {
        public static final int CODE_FIELD_NUMBER = 2;
        private static final Status DEFAULT_INSTANCE;
        public static final int MSG_FIELD_NUMBER = 3;
        public static final int NUMBER_FIELD_NUMBER = 1;
        private static volatile Parser<Status> PARSER;
        private int code_;
        private String msg_ = "";
        private long number_;

        private Status() {
        }

        @Override // com.yhchat.canarys.proto.conversation.Conversation.StatusOrBuilder
        public long getNumber() {
            return this.number_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNumber(long value) {
            this.number_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNumber() {
            this.number_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.conversation.Conversation.StatusOrBuilder
        public int getCode() {
            return this.code_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCode(int value) {
            this.code_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCode() {
            this.code_ = 0;
        }

        @Override // com.yhchat.canarys.proto.conversation.Conversation.StatusOrBuilder
        public String getMsg() {
            return this.msg_;
        }

        @Override // com.yhchat.canarys.proto.conversation.Conversation.StatusOrBuilder
        public ByteString getMsgBytes() {
            return ByteString.copyFromUtf8(this.msg_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsg(String value) {
            value.getClass();
            this.msg_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMsg() {
            this.msg_ = getDefaultInstance().getMsg();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMsgBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.msg_ = value.toStringUtf8();
        }

        public static Status parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Status parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Status parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Status parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Status parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Status parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Status parseFrom(InputStream input) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Status parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Status parseDelimitedFrom(InputStream input) throws IOException {
            return (Status) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Status parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Status) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Status parseFrom(CodedInputStream input) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Status parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Status prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Status, Builder> implements StatusOrBuilder {
            private Builder() {
                super(Status.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.StatusOrBuilder
            public long getNumber() {
                return ((Status) this.instance).getNumber();
            }

            public Builder setNumber(long value) {
                copyOnWrite();
                ((Status) this.instance).setNumber(value);
                return this;
            }

            public Builder clearNumber() {
                copyOnWrite();
                ((Status) this.instance).clearNumber();
                return this;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.StatusOrBuilder
            public int getCode() {
                return ((Status) this.instance).getCode();
            }

            public Builder setCode(int value) {
                copyOnWrite();
                ((Status) this.instance).setCode(value);
                return this;
            }

            public Builder clearCode() {
                copyOnWrite();
                ((Status) this.instance).clearCode();
                return this;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.StatusOrBuilder
            public String getMsg() {
                return ((Status) this.instance).getMsg();
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.StatusOrBuilder
            public ByteString getMsgBytes() {
                return ((Status) this.instance).getMsgBytes();
            }

            public Builder setMsg(String value) {
                copyOnWrite();
                ((Status) this.instance).setMsg(value);
                return this;
            }

            public Builder clearMsg() {
                copyOnWrite();
                ((Status) this.instance).clearMsg();
                return this;
            }

            public Builder setMsgBytes(ByteString value) {
                copyOnWrite();
                ((Status) this.instance).setMsgBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Status();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"number_", "code_", "msg_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002\u0004\u0003\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Status> parser = PARSER;
                    if (parser == null) {
                        synchronized (Status.class) {
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
            Status defaultInstance = new Status();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Status.class, defaultInstance);
        }

        public static Status getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Status> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class ConversationList extends GeneratedMessageLite<ConversationList, Builder> implements ConversationListOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final ConversationList DEFAULT_INSTANCE;
        private static volatile Parser<ConversationList> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 4;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int TOTAL_FIELD_NUMBER = 3;
        private int bitField0_;
        private Internal.ProtobufList<ConversationData> data_ = emptyProtobufList();
        private String requestId_ = "";
        private Status status_;
        private int total_;

        public interface ConversationDataOrBuilder extends MessageLiteOrBuilder {
            int getAt();

            ConversationData.AtData getAtData();

            long getAvatarId();

            String getAvatarUrl();

            ByteString getAvatarUrlBytes();

            int getCertificationLevel();

            String getChatContent();

            ByteString getChatContentBytes();

            String getChatId();

            ByteString getChatIdBytes();

            int getChatType();

            int getDoNotDisturb();

            String getName();

            ByteString getNameBytes();

            long getTimestamp();

            long getTimestampMs();

            int getUnreadMessage();

            boolean hasAtData();
        }

        private ConversationList() {
        }

        public static final class ConversationData extends GeneratedMessageLite<ConversationData, Builder> implements ConversationDataOrBuilder {
            public static final int AT_DATA_FIELD_NUMBER = 14;
            public static final int AT_FIELD_NUMBER = 7;
            public static final int AVATAR_ID_FIELD_NUMBER = 8;
            public static final int AVATAR_URL_FIELD_NUMBER = 9;
            public static final int CERTIFICATION_LEVEL_FIELD_NUMBER = 16;
            public static final int CHAT_CONTENT_FIELD_NUMBER = 4;
            public static final int CHAT_ID_FIELD_NUMBER = 1;
            public static final int CHAT_TYPE_FIELD_NUMBER = 2;
            private static final ConversationData DEFAULT_INSTANCE;
            public static final int DO_NOT_DISTURB_FIELD_NUMBER = 11;
            public static final int NAME_FIELD_NUMBER = 3;
            private static volatile Parser<ConversationData> PARSER = null;
            public static final int TIMESTAMP_FIELD_NUMBER = 12;
            public static final int TIMESTAMP_MS_FIELD_NUMBER = 5;
            public static final int UNREAD_MESSAGE_FIELD_NUMBER = 6;
            private AtData atData_;
            private int at_;
            private long avatarId_;
            private int bitField0_;
            private int certificationLevel_;
            private int chatType_;
            private int doNotDisturb_;
            private long timestampMs_;
            private long timestamp_;
            private int unreadMessage_;
            private String chatId_ = "";
            private String name_ = "";
            private String chatContent_ = "";
            private String avatarUrl_ = "";

            public interface AtDataOrBuilder extends MessageLiteOrBuilder {
                String getMentionedId();

                ByteString getMentionedIdBytes();

                String getMentionedIn();

                ByteString getMentionedInBytes();

                String getMentionedName();

                ByteString getMentionedNameBytes();

                String getMentionerId();

                ByteString getMentionerIdBytes();

                String getMentionerName();

                ByteString getMentionerNameBytes();

                long getMsgSeq();

                long getUnknown();
            }

            private ConversationData() {
            }

            public static final class AtData extends GeneratedMessageLite<AtData, Builder> implements AtDataOrBuilder {
                private static final AtData DEFAULT_INSTANCE;
                public static final int MENTIONED_ID_FIELD_NUMBER = 2;
                public static final int MENTIONED_IN_FIELD_NUMBER = 4;
                public static final int MENTIONED_NAME_FIELD_NUMBER = 3;
                public static final int MENTIONER_ID_FIELD_NUMBER = 6;
                public static final int MENTIONER_NAME_FIELD_NUMBER = 7;
                public static final int MSG_SEQ_FIELD_NUMBER = 8;
                private static volatile Parser<AtData> PARSER = null;
                public static final int UNKNOWN_FIELD_NUMBER = 1;
                private long msgSeq_;
                private long unknown_;
                private String mentionedId_ = "";
                private String mentionedName_ = "";
                private String mentionedIn_ = "";
                private String mentionerId_ = "";
                private String mentionerName_ = "";

                private AtData() {
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public long getUnknown() {
                    return this.unknown_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setUnknown(long value) {
                    this.unknown_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearUnknown() {
                    this.unknown_ = 0L;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public String getMentionedId() {
                    return this.mentionedId_;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public ByteString getMentionedIdBytes() {
                    return ByteString.copyFromUtf8(this.mentionedId_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMentionedId(String value) {
                    value.getClass();
                    this.mentionedId_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearMentionedId() {
                    this.mentionedId_ = getDefaultInstance().getMentionedId();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMentionedIdBytes(ByteString value) {
                    checkByteStringIsUtf8(value);
                    this.mentionedId_ = value.toStringUtf8();
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public String getMentionedName() {
                    return this.mentionedName_;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public ByteString getMentionedNameBytes() {
                    return ByteString.copyFromUtf8(this.mentionedName_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMentionedName(String value) {
                    value.getClass();
                    this.mentionedName_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearMentionedName() {
                    this.mentionedName_ = getDefaultInstance().getMentionedName();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMentionedNameBytes(ByteString value) {
                    checkByteStringIsUtf8(value);
                    this.mentionedName_ = value.toStringUtf8();
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public String getMentionedIn() {
                    return this.mentionedIn_;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public ByteString getMentionedInBytes() {
                    return ByteString.copyFromUtf8(this.mentionedIn_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMentionedIn(String value) {
                    value.getClass();
                    this.mentionedIn_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearMentionedIn() {
                    this.mentionedIn_ = getDefaultInstance().getMentionedIn();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMentionedInBytes(ByteString value) {
                    checkByteStringIsUtf8(value);
                    this.mentionedIn_ = value.toStringUtf8();
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public String getMentionerId() {
                    return this.mentionerId_;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public ByteString getMentionerIdBytes() {
                    return ByteString.copyFromUtf8(this.mentionerId_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMentionerId(String value) {
                    value.getClass();
                    this.mentionerId_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearMentionerId() {
                    this.mentionerId_ = getDefaultInstance().getMentionerId();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMentionerIdBytes(ByteString value) {
                    checkByteStringIsUtf8(value);
                    this.mentionerId_ = value.toStringUtf8();
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public String getMentionerName() {
                    return this.mentionerName_;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public ByteString getMentionerNameBytes() {
                    return ByteString.copyFromUtf8(this.mentionerName_);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMentionerName(String value) {
                    value.getClass();
                    this.mentionerName_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearMentionerName() {
                    this.mentionerName_ = getDefaultInstance().getMentionerName();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMentionerNameBytes(ByteString value) {
                    checkByteStringIsUtf8(value);
                    this.mentionerName_ = value.toStringUtf8();
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                public long getMsgSeq() {
                    return this.msgSeq_;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void setMsgSeq(long value) {
                    this.msgSeq_ = value;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public void clearMsgSeq() {
                    this.msgSeq_ = 0L;
                }

                public static AtData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                    return (AtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
                }

                public static AtData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return (AtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
                }

                public static AtData parseFrom(ByteString data) throws InvalidProtocolBufferException {
                    return (AtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
                }

                public static AtData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return (AtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
                }

                public static AtData parseFrom(byte[] data) throws InvalidProtocolBufferException {
                    return (AtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
                }

                public static AtData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                    return (AtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
                }

                public static AtData parseFrom(InputStream input) throws IOException {
                    return (AtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
                }

                public static AtData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (AtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
                }

                public static AtData parseDelimitedFrom(InputStream input) throws IOException {
                    return (AtData) parseDelimitedFrom(DEFAULT_INSTANCE, input);
                }

                public static AtData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (AtData) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
                }

                public static AtData parseFrom(CodedInputStream input) throws IOException {
                    return (AtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
                }

                public static AtData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                    return (AtData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
                }

                public static Builder newBuilder() {
                    return DEFAULT_INSTANCE.createBuilder();
                }

                public static Builder newBuilder(AtData prototype) {
                    return DEFAULT_INSTANCE.createBuilder(prototype);
                }

                public static final class Builder extends GeneratedMessageLite.Builder<AtData, Builder> implements AtDataOrBuilder {
                    private Builder() {
                        super(AtData.DEFAULT_INSTANCE);
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public long getUnknown() {
                        return ((AtData) this.instance).getUnknown();
                    }

                    public Builder setUnknown(long value) {
                        copyOnWrite();
                        ((AtData) this.instance).setUnknown(value);
                        return this;
                    }

                    public Builder clearUnknown() {
                        copyOnWrite();
                        ((AtData) this.instance).clearUnknown();
                        return this;
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public String getMentionedId() {
                        return ((AtData) this.instance).getMentionedId();
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public ByteString getMentionedIdBytes() {
                        return ((AtData) this.instance).getMentionedIdBytes();
                    }

                    public Builder setMentionedId(String value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMentionedId(value);
                        return this;
                    }

                    public Builder clearMentionedId() {
                        copyOnWrite();
                        ((AtData) this.instance).clearMentionedId();
                        return this;
                    }

                    public Builder setMentionedIdBytes(ByteString value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMentionedIdBytes(value);
                        return this;
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public String getMentionedName() {
                        return ((AtData) this.instance).getMentionedName();
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public ByteString getMentionedNameBytes() {
                        return ((AtData) this.instance).getMentionedNameBytes();
                    }

                    public Builder setMentionedName(String value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMentionedName(value);
                        return this;
                    }

                    public Builder clearMentionedName() {
                        copyOnWrite();
                        ((AtData) this.instance).clearMentionedName();
                        return this;
                    }

                    public Builder setMentionedNameBytes(ByteString value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMentionedNameBytes(value);
                        return this;
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public String getMentionedIn() {
                        return ((AtData) this.instance).getMentionedIn();
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public ByteString getMentionedInBytes() {
                        return ((AtData) this.instance).getMentionedInBytes();
                    }

                    public Builder setMentionedIn(String value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMentionedIn(value);
                        return this;
                    }

                    public Builder clearMentionedIn() {
                        copyOnWrite();
                        ((AtData) this.instance).clearMentionedIn();
                        return this;
                    }

                    public Builder setMentionedInBytes(ByteString value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMentionedInBytes(value);
                        return this;
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public String getMentionerId() {
                        return ((AtData) this.instance).getMentionerId();
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public ByteString getMentionerIdBytes() {
                        return ((AtData) this.instance).getMentionerIdBytes();
                    }

                    public Builder setMentionerId(String value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMentionerId(value);
                        return this;
                    }

                    public Builder clearMentionerId() {
                        copyOnWrite();
                        ((AtData) this.instance).clearMentionerId();
                        return this;
                    }

                    public Builder setMentionerIdBytes(ByteString value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMentionerIdBytes(value);
                        return this;
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public String getMentionerName() {
                        return ((AtData) this.instance).getMentionerName();
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public ByteString getMentionerNameBytes() {
                        return ((AtData) this.instance).getMentionerNameBytes();
                    }

                    public Builder setMentionerName(String value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMentionerName(value);
                        return this;
                    }

                    public Builder clearMentionerName() {
                        copyOnWrite();
                        ((AtData) this.instance).clearMentionerName();
                        return this;
                    }

                    public Builder setMentionerNameBytes(ByteString value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMentionerNameBytes(value);
                        return this;
                    }

                    @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationData.AtDataOrBuilder
                    public long getMsgSeq() {
                        return ((AtData) this.instance).getMsgSeq();
                    }

                    public Builder setMsgSeq(long value) {
                        copyOnWrite();
                        ((AtData) this.instance).setMsgSeq(value);
                        return this;
                    }

                    public Builder clearMsgSeq() {
                        copyOnWrite();
                        ((AtData) this.instance).clearMsgSeq();
                        return this;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageLite
                protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                    switch (method) {
                        case NEW_MUTABLE_INSTANCE:
                            return new AtData();
                        case NEW_BUILDER:
                            return new Builder();
                        case BUILD_MESSAGE_INFO:
                            Object[] objects = {"unknown_", "mentionedId_", "mentionedName_", "mentionedIn_", "mentionerId_", "mentionerName_", "msgSeq_"};
                            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001\u0002\u0002\u0208\u0003\u0208\u0004\u0208\u0006\u0208\u0007\u0208\b\u0002", objects);
                        case GET_DEFAULT_INSTANCE:
                            return DEFAULT_INSTANCE;
                        case GET_PARSER:
                            Parser<AtData> parser = PARSER;
                            if (parser == null) {
                                synchronized (AtData.class) {
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
                    AtData defaultInstance = new AtData();
                    DEFAULT_INSTANCE = defaultInstance;
                    GeneratedMessageLite.registerDefaultInstance(AtData.class, defaultInstance);
                }

                public static AtData getDefaultInstance() {
                    return DEFAULT_INSTANCE;
                }

                public static Parser<AtData> parser() {
                    return DEFAULT_INSTANCE.getParserForType();
                }
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public String getChatId() {
                return this.chatId_;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
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

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public int getChatType() {
                return this.chatType_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChatType(int value) {
                this.chatType_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearChatType() {
                this.chatType_ = 0;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public String getName() {
                return this.name_;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
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

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public String getChatContent() {
                return this.chatContent_;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public ByteString getChatContentBytes() {
                return ByteString.copyFromUtf8(this.chatContent_);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChatContent(String value) {
                value.getClass();
                this.chatContent_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearChatContent() {
                this.chatContent_ = getDefaultInstance().getChatContent();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setChatContentBytes(ByteString value) {
                checkByteStringIsUtf8(value);
                this.chatContent_ = value.toStringUtf8();
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public long getTimestampMs() {
                return this.timestampMs_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTimestampMs(long value) {
                this.timestampMs_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTimestampMs() {
                this.timestampMs_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public int getUnreadMessage() {
                return this.unreadMessage_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setUnreadMessage(int value) {
                this.unreadMessage_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearUnreadMessage() {
                this.unreadMessage_ = 0;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public int getAt() {
                return this.at_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAt(int value) {
                this.at_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAt() {
                this.at_ = 0;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public long getAvatarId() {
                return this.avatarId_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAvatarId(long value) {
                this.avatarId_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAvatarId() {
                this.avatarId_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public String getAvatarUrl() {
                return this.avatarUrl_;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
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

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public int getDoNotDisturb() {
                return this.doNotDisturb_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setDoNotDisturb(int value) {
                this.doNotDisturb_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearDoNotDisturb() {
                this.doNotDisturb_ = 0;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setTimestamp(long value) {
                this.timestamp_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearTimestamp() {
                this.timestamp_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public boolean hasAtData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public AtData getAtData() {
                return this.atData_ == null ? AtData.getDefaultInstance() : this.atData_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setAtData(AtData value) {
                value.getClass();
                this.atData_ = value;
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void mergeAtData(AtData value) {
                value.getClass();
                if (this.atData_ != null && this.atData_ != AtData.getDefaultInstance()) {
                    this.atData_ = AtData.newBuilder(this.atData_).mergeFrom((AtData.Builder) value).buildPartial();
                } else {
                    this.atData_ = value;
                }
                this.bitField0_ |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearAtData() {
                this.atData_ = null;
                this.bitField0_ &= -2;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
            public int getCertificationLevel() {
                return this.certificationLevel_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setCertificationLevel(int value) {
                this.certificationLevel_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearCertificationLevel() {
                this.certificationLevel_ = 0;
            }

            public static ConversationData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (ConversationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static ConversationData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (ConversationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static ConversationData parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (ConversationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static ConversationData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (ConversationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static ConversationData parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (ConversationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static ConversationData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (ConversationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static ConversationData parseFrom(InputStream input) throws IOException {
                return (ConversationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static ConversationData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (ConversationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static ConversationData parseDelimitedFrom(InputStream input) throws IOException {
                return (ConversationData) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static ConversationData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (ConversationData) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static ConversationData parseFrom(CodedInputStream input) throws IOException {
                return (ConversationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static ConversationData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (ConversationData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(ConversationData prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<ConversationData, Builder> implements ConversationDataOrBuilder {
                private Builder() {
                    super(ConversationData.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public String getChatId() {
                    return ((ConversationData) this.instance).getChatId();
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public ByteString getChatIdBytes() {
                    return ((ConversationData) this.instance).getChatIdBytes();
                }

                public Builder setChatId(String value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setChatId(value);
                    return this;
                }

                public Builder clearChatId() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearChatId();
                    return this;
                }

                public Builder setChatIdBytes(ByteString value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setChatIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public int getChatType() {
                    return ((ConversationData) this.instance).getChatType();
                }

                public Builder setChatType(int value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setChatType(value);
                    return this;
                }

                public Builder clearChatType() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearChatType();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public String getName() {
                    return ((ConversationData) this.instance).getName();
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public ByteString getNameBytes() {
                    return ((ConversationData) this.instance).getNameBytes();
                }

                public Builder setName(String value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setName(value);
                    return this;
                }

                public Builder clearName() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearName();
                    return this;
                }

                public Builder setNameBytes(ByteString value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setNameBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public String getChatContent() {
                    return ((ConversationData) this.instance).getChatContent();
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public ByteString getChatContentBytes() {
                    return ((ConversationData) this.instance).getChatContentBytes();
                }

                public Builder setChatContent(String value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setChatContent(value);
                    return this;
                }

                public Builder clearChatContent() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearChatContent();
                    return this;
                }

                public Builder setChatContentBytes(ByteString value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setChatContentBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public long getTimestampMs() {
                    return ((ConversationData) this.instance).getTimestampMs();
                }

                public Builder setTimestampMs(long value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setTimestampMs(value);
                    return this;
                }

                public Builder clearTimestampMs() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearTimestampMs();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public int getUnreadMessage() {
                    return ((ConversationData) this.instance).getUnreadMessage();
                }

                public Builder setUnreadMessage(int value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setUnreadMessage(value);
                    return this;
                }

                public Builder clearUnreadMessage() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearUnreadMessage();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public int getAt() {
                    return ((ConversationData) this.instance).getAt();
                }

                public Builder setAt(int value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setAt(value);
                    return this;
                }

                public Builder clearAt() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearAt();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public long getAvatarId() {
                    return ((ConversationData) this.instance).getAvatarId();
                }

                public Builder setAvatarId(long value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setAvatarId(value);
                    return this;
                }

                public Builder clearAvatarId() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearAvatarId();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public String getAvatarUrl() {
                    return ((ConversationData) this.instance).getAvatarUrl();
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public ByteString getAvatarUrlBytes() {
                    return ((ConversationData) this.instance).getAvatarUrlBytes();
                }

                public Builder setAvatarUrl(String value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setAvatarUrl(value);
                    return this;
                }

                public Builder clearAvatarUrl() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearAvatarUrl();
                    return this;
                }

                public Builder setAvatarUrlBytes(ByteString value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setAvatarUrlBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public int getDoNotDisturb() {
                    return ((ConversationData) this.instance).getDoNotDisturb();
                }

                public Builder setDoNotDisturb(int value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setDoNotDisturb(value);
                    return this;
                }

                public Builder clearDoNotDisturb() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearDoNotDisturb();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public long getTimestamp() {
                    return ((ConversationData) this.instance).getTimestamp();
                }

                public Builder setTimestamp(long value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setTimestamp(value);
                    return this;
                }

                public Builder clearTimestamp() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearTimestamp();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public boolean hasAtData() {
                    return ((ConversationData) this.instance).hasAtData();
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public AtData getAtData() {
                    return ((ConversationData) this.instance).getAtData();
                }

                public Builder setAtData(AtData value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setAtData(value);
                    return this;
                }

                public Builder setAtData(AtData.Builder builderForValue) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setAtData(builderForValue.build());
                    return this;
                }

                public Builder mergeAtData(AtData value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).mergeAtData(value);
                    return this;
                }

                public Builder clearAtData() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearAtData();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationList.ConversationDataOrBuilder
                public int getCertificationLevel() {
                    return ((ConversationData) this.instance).getCertificationLevel();
                }

                public Builder setCertificationLevel(int value) {
                    copyOnWrite();
                    ((ConversationData) this.instance).setCertificationLevel(value);
                    return this;
                }

                public Builder clearCertificationLevel() {
                    copyOnWrite();
                    ((ConversationData) this.instance).clearCertificationLevel();
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new ConversationData();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"bitField0_", "chatId_", "chatType_", "name_", "chatContent_", "timestampMs_", "unreadMessage_", "at_", "avatarId_", "avatarUrl_", "doNotDisturb_", "timestamp_", "atData_", "certificationLevel_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\u0010\r\u0000\u0000\u0000\u0001\u0208\u0002\u0004\u0003\u0208\u0004\u0208\u0005\u0002\u0006\u0004\u0007\u0004\b\u0002\t\u0208\u000b\u0004\f\u0002\u000e\u1009\u0000\u0010\u0004", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<ConversationData> parser = PARSER;
                        if (parser == null) {
                            synchronized (ConversationData.class) {
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
                ConversationData defaultInstance = new ConversationData();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(ConversationData.class, defaultInstance);
            }

            public static ConversationData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<ConversationData> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
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

        @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
        public List<ConversationData> getDataList() {
            return this.data_;
        }

        public List<? extends ConversationDataOrBuilder> getDataOrBuilderList() {
            return this.data_;
        }

        @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
        public int getDataCount() {
            return this.data_.size();
        }

        @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
        public ConversationData getData(int index) {
            return this.data_.get(index);
        }

        public ConversationDataOrBuilder getDataOrBuilder(int index) {
            return this.data_.get(index);
        }

        private void ensureDataIsMutable() {
            Internal.ProtobufList<ConversationData> tmp = this.data_;
            if (!tmp.isModifiable()) {
                this.data_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setData(int index, ConversationData value) {
            value.getClass();
            ensureDataIsMutable();
            this.data_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addData(ConversationData value) {
            value.getClass();
            ensureDataIsMutable();
            this.data_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addData(int index, ConversationData value) {
            value.getClass();
            ensureDataIsMutable();
            this.data_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllData(Iterable<? extends ConversationData> values) {
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

        @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
        public int getTotal() {
            return this.total_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTotal(int value) {
            this.total_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTotal() {
            this.total_ = 0;
        }

        @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
        public String getRequestId() {
            return this.requestId_;
        }

        @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
        public ByteString getRequestIdBytes() {
            return ByteString.copyFromUtf8(this.requestId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestId(String value) {
            value.getClass();
            this.requestId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRequestIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.requestId_ = value.toStringUtf8();
        }

        public static ConversationList parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ConversationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ConversationList parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConversationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ConversationList parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ConversationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ConversationList parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConversationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ConversationList parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ConversationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ConversationList parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ConversationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ConversationList parseFrom(InputStream input) throws IOException {
            return (ConversationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ConversationList parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConversationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ConversationList parseDelimitedFrom(InputStream input) throws IOException {
            return (ConversationList) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ConversationList parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConversationList) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ConversationList parseFrom(CodedInputStream input) throws IOException {
            return (ConversationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ConversationList parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ConversationList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(ConversationList prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<ConversationList, Builder> implements ConversationListOrBuilder {
            private Builder() {
                super(ConversationList.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
            public boolean hasStatus() {
                return ((ConversationList) this.instance).hasStatus();
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
            public Status getStatus() {
                return ((ConversationList) this.instance).getStatus();
            }

            public Builder setStatus(Status value) {
                copyOnWrite();
                ((ConversationList) this.instance).setStatus(value);
                return this;
            }

            public Builder setStatus(Status.Builder builderForValue) {
                copyOnWrite();
                ((ConversationList) this.instance).setStatus(builderForValue.build());
                return this;
            }

            public Builder mergeStatus(Status value) {
                copyOnWrite();
                ((ConversationList) this.instance).mergeStatus(value);
                return this;
            }

            public Builder clearStatus() {
                copyOnWrite();
                ((ConversationList) this.instance).clearStatus();
                return this;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
            public List<ConversationData> getDataList() {
                return Collections.unmodifiableList(((ConversationList) this.instance).getDataList());
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
            public int getDataCount() {
                return ((ConversationList) this.instance).getDataCount();
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
            public ConversationData getData(int index) {
                return ((ConversationList) this.instance).getData(index);
            }

            public Builder setData(int index, ConversationData value) {
                copyOnWrite();
                ((ConversationList) this.instance).setData(index, value);
                return this;
            }

            public Builder setData(int index, ConversationData.Builder builderForValue) {
                copyOnWrite();
                ((ConversationList) this.instance).setData(index, builderForValue.build());
                return this;
            }

            public Builder addData(ConversationData value) {
                copyOnWrite();
                ((ConversationList) this.instance).addData(value);
                return this;
            }

            public Builder addData(int index, ConversationData value) {
                copyOnWrite();
                ((ConversationList) this.instance).addData(index, value);
                return this;
            }

            public Builder addData(ConversationData.Builder builderForValue) {
                copyOnWrite();
                ((ConversationList) this.instance).addData(builderForValue.build());
                return this;
            }

            public Builder addData(int index, ConversationData.Builder builderForValue) {
                copyOnWrite();
                ((ConversationList) this.instance).addData(index, builderForValue.build());
                return this;
            }

            public Builder addAllData(Iterable<? extends ConversationData> values) {
                copyOnWrite();
                ((ConversationList) this.instance).addAllData(values);
                return this;
            }

            public Builder clearData() {
                copyOnWrite();
                ((ConversationList) this.instance).clearData();
                return this;
            }

            public Builder removeData(int index) {
                copyOnWrite();
                ((ConversationList) this.instance).removeData(index);
                return this;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
            public int getTotal() {
                return ((ConversationList) this.instance).getTotal();
            }

            public Builder setTotal(int value) {
                copyOnWrite();
                ((ConversationList) this.instance).setTotal(value);
                return this;
            }

            public Builder clearTotal() {
                copyOnWrite();
                ((ConversationList) this.instance).clearTotal();
                return this;
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
            public String getRequestId() {
                return ((ConversationList) this.instance).getRequestId();
            }

            @Override // com.yhchat.canarys.proto.conversation.Conversation.ConversationListOrBuilder
            public ByteString getRequestIdBytes() {
                return ((ConversationList) this.instance).getRequestIdBytes();
            }

            public Builder setRequestId(String value) {
                copyOnWrite();
                ((ConversationList) this.instance).setRequestId(value);
                return this;
            }

            public Builder clearRequestId() {
                copyOnWrite();
                ((ConversationList) this.instance).clearRequestId();
                return this;
            }

            public Builder setRequestIdBytes(ByteString value) {
                copyOnWrite();
                ((ConversationList) this.instance).setRequestIdBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new ConversationList();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "status_", "data_", ConversationData.class, "total_", "requestId_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u001b\u0003\u0004\u0004\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<ConversationList> parser = PARSER;
                    if (parser == null) {
                        synchronized (ConversationList.class) {
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
            ConversationList defaultInstance = new ConversationList();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(ConversationList.class, defaultInstance);
        }

        public static ConversationList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<ConversationList> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }
}
