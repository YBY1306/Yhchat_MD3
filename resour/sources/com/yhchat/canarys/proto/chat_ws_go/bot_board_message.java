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
public final class bot_board_message extends GeneratedMessageLite<bot_board_message, Builder> implements bot_board_messageOrBuilder {
    public static final int DATA_FIELD_NUMBER = 2;
    private static final bot_board_message DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER = 1;
    private static volatile Parser<bot_board_message> PARSER;
    private int bitField0_;
    private BoardData data_;
    private INFO info_;

    public interface BoardDataOrBuilder extends MessageLiteOrBuilder {
        String getAny();

        ByteString getAnyBytes();

        BoardData.BoardContent getBoard();

        boolean hasBoard();
    }

    private bot_board_message() {
    }

    public static final class BoardData extends GeneratedMessageLite<BoardData, Builder> implements BoardDataOrBuilder {
        public static final int ANY_FIELD_NUMBER = 1;
        public static final int BOARD_FIELD_NUMBER = 2;
        private static final BoardData DEFAULT_INSTANCE;
        private static volatile Parser<BoardData> PARSER;
        private String any_ = "";
        private int bitField0_;
        private BoardContent board_;

        public interface BoardContentOrBuilder extends MessageLiteOrBuilder {
            String getBotId();

            ByteString getBotIdBytes();

            String getBotName();

            ByteString getBotNameBytes();

            String getChatId();

            ByteString getChatIdBytes();

            int getChatType();

            String getContent();

            ByteString getContentBytes();

            int getContentType();

            long getLastUpdateTime();
        }

        private BoardData() {
        }

        public static final class BoardContent extends GeneratedMessageLite<BoardContent, Builder> implements BoardContentOrBuilder {
            public static final int BOT_ID_FIELD_NUMBER = 1;
            public static final int BOT_NAME_FIELD_NUMBER = 7;
            public static final int CHAT_ID_FIELD_NUMBER = 2;
            public static final int CHAT_TYPE_FIELD_NUMBER = 3;
            public static final int CONTENT_FIELD_NUMBER = 4;
            public static final int CONTENT_TYPE_FIELD_NUMBER = 5;
            private static final BoardContent DEFAULT_INSTANCE;
            public static final int LAST_UPDATE_TIME_FIELD_NUMBER = 6;
            private static volatile Parser<BoardContent> PARSER;
            private int chatType_;
            private int contentType_;
            private long lastUpdateTime_;
            private String botId_ = "";
            private String chatId_ = "";
            private String content_ = "";
            private String botName_ = "";

            private BoardContent() {
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
            public String getBotId() {
                return this.botId_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
            public String getChatId() {
                return this.chatId_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
            public String getContent() {
                return this.content_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
            public int getContentType() {
                return this.contentType_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setContentType(int value) {
                this.contentType_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearContentType() {
                this.contentType_ = 0;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
            public long getLastUpdateTime() {
                return this.lastUpdateTime_;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setLastUpdateTime(long value) {
                this.lastUpdateTime_ = value;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void clearLastUpdateTime() {
                this.lastUpdateTime_ = 0L;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
            public String getBotName() {
                return this.botName_;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
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

            public static BoardContent parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
                return (BoardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BoardContent parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BoardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BoardContent parseFrom(ByteString data) throws InvalidProtocolBufferException {
                return (BoardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BoardContent parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BoardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BoardContent parseFrom(byte[] data) throws InvalidProtocolBufferException {
                return (BoardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
            }

            public static BoardContent parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
                return (BoardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
            }

            public static BoardContent parseFrom(InputStream input) throws IOException {
                return (BoardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static BoardContent parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BoardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static BoardContent parseDelimitedFrom(InputStream input) throws IOException {
                return (BoardContent) parseDelimitedFrom(DEFAULT_INSTANCE, input);
            }

            public static BoardContent parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BoardContent) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static BoardContent parseFrom(CodedInputStream input) throws IOException {
                return (BoardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
            }

            public static BoardContent parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
                return (BoardContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Builder newBuilder(BoardContent prototype) {
                return DEFAULT_INSTANCE.createBuilder(prototype);
            }

            public static final class Builder extends GeneratedMessageLite.Builder<BoardContent, Builder> implements BoardContentOrBuilder {
                private Builder() {
                    super(BoardContent.DEFAULT_INSTANCE);
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public String getBotId() {
                    return ((BoardContent) this.instance).getBotId();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public ByteString getBotIdBytes() {
                    return ((BoardContent) this.instance).getBotIdBytes();
                }

                public Builder setBotId(String value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setBotId(value);
                    return this;
                }

                public Builder clearBotId() {
                    copyOnWrite();
                    ((BoardContent) this.instance).clearBotId();
                    return this;
                }

                public Builder setBotIdBytes(ByteString value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setBotIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public String getChatId() {
                    return ((BoardContent) this.instance).getChatId();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public ByteString getChatIdBytes() {
                    return ((BoardContent) this.instance).getChatIdBytes();
                }

                public Builder setChatId(String value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setChatId(value);
                    return this;
                }

                public Builder clearChatId() {
                    copyOnWrite();
                    ((BoardContent) this.instance).clearChatId();
                    return this;
                }

                public Builder setChatIdBytes(ByteString value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setChatIdBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public int getChatType() {
                    return ((BoardContent) this.instance).getChatType();
                }

                public Builder setChatType(int value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setChatType(value);
                    return this;
                }

                public Builder clearChatType() {
                    copyOnWrite();
                    ((BoardContent) this.instance).clearChatType();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public String getContent() {
                    return ((BoardContent) this.instance).getContent();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public ByteString getContentBytes() {
                    return ((BoardContent) this.instance).getContentBytes();
                }

                public Builder setContent(String value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setContent(value);
                    return this;
                }

                public Builder clearContent() {
                    copyOnWrite();
                    ((BoardContent) this.instance).clearContent();
                    return this;
                }

                public Builder setContentBytes(ByteString value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setContentBytes(value);
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public int getContentType() {
                    return ((BoardContent) this.instance).getContentType();
                }

                public Builder setContentType(int value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setContentType(value);
                    return this;
                }

                public Builder clearContentType() {
                    copyOnWrite();
                    ((BoardContent) this.instance).clearContentType();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public long getLastUpdateTime() {
                    return ((BoardContent) this.instance).getLastUpdateTime();
                }

                public Builder setLastUpdateTime(long value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setLastUpdateTime(value);
                    return this;
                }

                public Builder clearLastUpdateTime() {
                    copyOnWrite();
                    ((BoardContent) this.instance).clearLastUpdateTime();
                    return this;
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public String getBotName() {
                    return ((BoardContent) this.instance).getBotName();
                }

                @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardData.BoardContentOrBuilder
                public ByteString getBotNameBytes() {
                    return ((BoardContent) this.instance).getBotNameBytes();
                }

                public Builder setBotName(String value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setBotName(value);
                    return this;
                }

                public Builder clearBotName() {
                    copyOnWrite();
                    ((BoardContent) this.instance).clearBotName();
                    return this;
                }

                public Builder setBotNameBytes(ByteString value) {
                    copyOnWrite();
                    ((BoardContent) this.instance).setBotNameBytes(value);
                    return this;
                }
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
                switch (method) {
                    case NEW_MUTABLE_INSTANCE:
                        return new BoardContent();
                    case NEW_BUILDER:
                        return new Builder();
                    case BUILD_MESSAGE_INFO:
                        Object[] objects = {"botId_", "chatId_", "chatType_", "content_", "contentType_", "lastUpdateTime_", "botName_"};
                        return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0004\u0004\u0208\u0005\u0004\u0006\u0002\u0007\u0208", objects);
                    case GET_DEFAULT_INSTANCE:
                        return DEFAULT_INSTANCE;
                    case GET_PARSER:
                        Parser<BoardContent> parser = PARSER;
                        if (parser == null) {
                            synchronized (BoardContent.class) {
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
                BoardContent defaultInstance = new BoardContent();
                DEFAULT_INSTANCE = defaultInstance;
                GeneratedMessageLite.registerDefaultInstance(BoardContent.class, defaultInstance);
            }

            public static BoardContent getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static Parser<BoardContent> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardDataOrBuilder
        public String getAny() {
            return this.any_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardDataOrBuilder
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

        @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardDataOrBuilder
        public boolean hasBoard() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardDataOrBuilder
        public BoardContent getBoard() {
            return this.board_ == null ? BoardContent.getDefaultInstance() : this.board_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBoard(BoardContent value) {
            value.getClass();
            this.board_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBoard(BoardContent value) {
            value.getClass();
            if (this.board_ != null && this.board_ != BoardContent.getDefaultInstance()) {
                this.board_ = BoardContent.newBuilder(this.board_).mergeFrom((BoardContent.Builder) value).buildPartial();
            } else {
                this.board_ = value;
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBoard() {
            this.board_ = null;
            this.bitField0_ &= -2;
        }

        public static BoardData parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (BoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BoardData parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BoardData parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (BoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BoardData parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BoardData parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (BoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BoardData parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BoardData parseFrom(InputStream input) throws IOException {
            return (BoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BoardData parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BoardData parseDelimitedFrom(InputStream input) throws IOException {
            return (BoardData) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static BoardData parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BoardData) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BoardData parseFrom(CodedInputStream input) throws IOException {
            return (BoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BoardData parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(BoardData prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<BoardData, Builder> implements BoardDataOrBuilder {
            private Builder() {
                super(BoardData.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardDataOrBuilder
            public String getAny() {
                return ((BoardData) this.instance).getAny();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardDataOrBuilder
            public ByteString getAnyBytes() {
                return ((BoardData) this.instance).getAnyBytes();
            }

            public Builder setAny(String value) {
                copyOnWrite();
                ((BoardData) this.instance).setAny(value);
                return this;
            }

            public Builder clearAny() {
                copyOnWrite();
                ((BoardData) this.instance).clearAny();
                return this;
            }

            public Builder setAnyBytes(ByteString value) {
                copyOnWrite();
                ((BoardData) this.instance).setAnyBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardDataOrBuilder
            public boolean hasBoard() {
                return ((BoardData) this.instance).hasBoard();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_message.BoardDataOrBuilder
            public BoardContent getBoard() {
                return ((BoardData) this.instance).getBoard();
            }

            public Builder setBoard(BoardContent value) {
                copyOnWrite();
                ((BoardData) this.instance).setBoard(value);
                return this;
            }

            public Builder setBoard(BoardContent.Builder builderForValue) {
                copyOnWrite();
                ((BoardData) this.instance).setBoard(builderForValue.build());
                return this;
            }

            public Builder mergeBoard(BoardContent value) {
                copyOnWrite();
                ((BoardData) this.instance).mergeBoard(value);
                return this;
            }

            public Builder clearBoard() {
                copyOnWrite();
                ((BoardData) this.instance).clearBoard();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new BoardData();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"bitField0_", "any_", "board_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<BoardData> parser = PARSER;
                    if (parser == null) {
                        synchronized (BoardData.class) {
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
            BoardData defaultInstance = new BoardData();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(BoardData.class, defaultInstance);
        }

        public static BoardData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<BoardData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_messageOrBuilder
    public boolean hasInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_messageOrBuilder
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

    @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_messageOrBuilder
    public boolean hasData() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_messageOrBuilder
    public BoardData getData() {
        return this.data_ == null ? BoardData.getDefaultInstance() : this.data_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setData(BoardData value) {
        value.getClass();
        this.data_ = value;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeData(BoardData value) {
        value.getClass();
        if (this.data_ != null && this.data_ != BoardData.getDefaultInstance()) {
            this.data_ = BoardData.newBuilder(this.data_).mergeFrom((BoardData.Builder) value).buildPartial();
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

    public static bot_board_message parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (bot_board_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static bot_board_message parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (bot_board_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static bot_board_message parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (bot_board_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static bot_board_message parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (bot_board_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static bot_board_message parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (bot_board_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static bot_board_message parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (bot_board_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static bot_board_message parseFrom(InputStream input) throws IOException {
        return (bot_board_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static bot_board_message parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (bot_board_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static bot_board_message parseDelimitedFrom(InputStream input) throws IOException {
        return (bot_board_message) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static bot_board_message parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (bot_board_message) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static bot_board_message parseFrom(CodedInputStream input) throws IOException {
        return (bot_board_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static bot_board_message parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (bot_board_message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(bot_board_message prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<bot_board_message, Builder> implements bot_board_messageOrBuilder {
        private Builder() {
            super(bot_board_message.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_messageOrBuilder
        public boolean hasInfo() {
            return ((bot_board_message) this.instance).hasInfo();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_messageOrBuilder
        public INFO getInfo() {
            return ((bot_board_message) this.instance).getInfo();
        }

        public Builder setInfo(INFO value) {
            copyOnWrite();
            ((bot_board_message) this.instance).setInfo(value);
            return this;
        }

        public Builder setInfo(INFO.Builder builderForValue) {
            copyOnWrite();
            ((bot_board_message) this.instance).setInfo(builderForValue.build());
            return this;
        }

        public Builder mergeInfo(INFO value) {
            copyOnWrite();
            ((bot_board_message) this.instance).mergeInfo(value);
            return this;
        }

        public Builder clearInfo() {
            copyOnWrite();
            ((bot_board_message) this.instance).clearInfo();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_messageOrBuilder
        public boolean hasData() {
            return ((bot_board_message) this.instance).hasData();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.bot_board_messageOrBuilder
        public BoardData getData() {
            return ((bot_board_message) this.instance).getData();
        }

        public Builder setData(BoardData value) {
            copyOnWrite();
            ((bot_board_message) this.instance).setData(value);
            return this;
        }

        public Builder setData(BoardData.Builder builderForValue) {
            copyOnWrite();
            ((bot_board_message) this.instance).setData(builderForValue.build());
            return this;
        }

        public Builder mergeData(BoardData value) {
            copyOnWrite();
            ((bot_board_message) this.instance).mergeData(value);
            return this;
        }

        public Builder clearData() {
            copyOnWrite();
            ((bot_board_message) this.instance).clearData();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new bot_board_message();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "info_", "data_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<bot_board_message> parser = PARSER;
                if (parser == null) {
                    synchronized (bot_board_message.class) {
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
        bot_board_message defaultInstance = new bot_board_message();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(bot_board_message.class, defaultInstance);
    }

    public static bot_board_message getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<bot_board_message> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
