package com.yhchat.canarys.proto.chat_ws_go;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.chat_ws_go.WsTag;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class WsMsg extends GeneratedMessageLite<WsMsg, Builder> implements WsMsgOrBuilder {
    public static final int CHAT_ID_FIELD_NUMBER = 4;
    public static final int CHAT_TYPE_FIELD_NUMBER = 5;
    public static final int CMD_FIELD_NUMBER = 9;
    public static final int CONTENT_FIELD_NUMBER = 6;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 7;
    private static final WsMsg DEFAULT_INSTANCE;
    public static final int DELETE_TIME_FIELD_NUMBER = 10;
    public static final int EDIT_TIME_FIELD_NUMBER = 14;
    public static final int MSG_ID_FIELD_NUMBER = 1;
    public static final int MSG_SEQ_FIELD_NUMBER = 12;
    private static volatile Parser<WsMsg> PARSER = null;
    public static final int QUOTE_MSG_ID_FIELD_NUMBER = 11;
    public static final int RECV_ID_FIELD_NUMBER = 3;
    public static final int SENDER_FIELD_NUMBER = 2;
    public static final int TIMESTAMP_FIELD_NUMBER = 8;
    private int bitField0_;
    private int chatType_;
    private WsCmd cmd_;
    private int contentType_;
    private WsContent content_;
    private long deleteTime_;
    private long editTime_;
    private long msgSeq_;
    private WsSender sender_;
    private long timestamp_;
    private String msgId_ = "";
    private String recvId_ = "";
    private String chatId_ = "";
    private String quoteMsgId_ = "";

    public interface WsCmdOrBuilder extends MessageLiteOrBuilder {
        long getId();

        String getName();

        ByteString getNameBytes();
    }

    public interface WsContentOrBuilder extends MessageLiteOrBuilder {
        long getAudioTime();

        String getAudioUrl();

        ByteString getAudioUrlBytes();

        String getButtons();

        ByteString getButtonsBytes();

        String getCallStatusText();

        ByteString getCallStatusTextBytes();

        String getCallText();

        ByteString getCallTextBytes();

        String getExpressionId();

        ByteString getExpressionIdBytes();

        String getFileName();

        ByteString getFileNameBytes();

        long getFileSize();

        String getFileUrl();

        ByteString getFileUrlBytes();

        String getForm();

        ByteString getFormBytes();

        long getHeight();

        String getImageUrl();

        ByteString getImageUrlBytes();

        String getPostContent();

        ByteString getPostContentBytes();

        String getPostContentType();

        ByteString getPostContentTypeBytes();

        String getPostId();

        ByteString getPostIdBytes();

        String getPostTitle();

        ByteString getPostTitleBytes();

        String getQuoteMsgText();

        ByteString getQuoteMsgTextBytes();

        long getStickerItemId();

        long getStickerPackId();

        String getStickerUrl();

        ByteString getStickerUrlBytes();

        String getText();

        ByteString getTextBytes();

        String getVideoUrl();

        ByteString getVideoUrlBytes();

        long getWidth();
    }

    public interface WsSenderOrBuilder extends MessageLiteOrBuilder {
        String getAvatarUrl();

        ByteString getAvatarUrlBytes();

        String getChatId();

        ByteString getChatIdBytes();

        int getChatType();

        String getName();

        ByteString getNameBytes();

        WsTag getTag(int index);

        int getTagCount();

        List<WsTag> getTagList();

        String getTagOld(int index);

        ByteString getTagOldBytes(int index);

        int getTagOldCount();

        List<String> getTagOldList();
    }

    private WsMsg() {
    }

    public static final class WsCmd extends GeneratedMessageLite<WsCmd, Builder> implements WsCmdOrBuilder {
        private static final WsCmd DEFAULT_INSTANCE;
        public static final int ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<WsCmd> PARSER;
        private long id_;
        private String name_ = "";

        private WsCmd() {
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsCmdOrBuilder
        public long getId() {
            return this.id_;
        }

        public void setId(long value) {
            this.id_ = value;
        }

        public void clearId() {
            this.id_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsCmdOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsCmdOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public void setName(String value) {
            value.getClass();
            this.name_ = value;
        }

        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public void setNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.name_ = value.toStringUtf8();
        }

        public static WsCmd parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (WsCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WsCmd parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WsCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WsCmd parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (WsCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WsCmd parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WsCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WsCmd parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (WsCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WsCmd parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WsCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WsCmd parseFrom(InputStream input) throws IOException {
            return (WsCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static WsCmd parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WsCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static WsCmd parseDelimitedFrom(InputStream input) throws IOException {
            return (WsCmd) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static WsCmd parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WsCmd) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static WsCmd parseFrom(CodedInputStream input) throws IOException {
            return (WsCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static WsCmd parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WsCmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(WsCmd prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<WsCmd, Builder> implements WsCmdOrBuilder {
            /* synthetic */ Builder(WsMsgIA wsMsgIA) {
                this();
            }

            private Builder() {
                super(WsCmd.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsCmdOrBuilder
            public long getId() {
                return ((WsCmd) this.instance).getId();
            }

            public Builder setId(long value) {
                copyOnWrite();
                ((WsCmd) this.instance).setId(value);
                return this;
            }

            public Builder clearId() {
                copyOnWrite();
                ((WsCmd) this.instance).clearId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsCmdOrBuilder
            public String getName() {
                return ((WsCmd) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsCmdOrBuilder
            public ByteString getNameBytes() {
                return ((WsCmd) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((WsCmd) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((WsCmd) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((WsCmd) this.instance).setNameBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new WsCmd();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"id_", "name_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<WsCmd> parser = PARSER;
                    if (parser == null) {
                        synchronized (WsCmd.class) {
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
            WsCmd defaultInstance = new WsCmd();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(WsCmd.class, defaultInstance);
        }

        public static WsCmd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<WsCmd> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class WsSender extends GeneratedMessageLite<WsSender, Builder> implements WsSenderOrBuilder {
        public static final int AVATAR_URL_FIELD_NUMBER = 4;
        public static final int CHAT_ID_FIELD_NUMBER = 1;
        public static final int CHAT_TYPE_FIELD_NUMBER = 2;
        private static final WsSender DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile Parser<WsSender> PARSER = null;
        public static final int TAG_FIELD_NUMBER = 7;
        public static final int TAG_OLD_FIELD_NUMBER = 6;
        private int chatType_;
        private String chatId_ = "";
        private String name_ = "";
        private String avatarUrl_ = "";
        private Internal.ProtobufList<String> tagOld_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<WsTag> tag_ = emptyProtobufList();

        private WsSender() {
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public String getChatId() {
            return this.chatId_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public ByteString getChatIdBytes() {
            return ByteString.copyFromUtf8(this.chatId_);
        }

        public void setChatId(String value) {
            value.getClass();
            this.chatId_ = value;
        }

        public void clearChatId() {
            this.chatId_ = getDefaultInstance().getChatId();
        }

        public void setChatIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.chatId_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public int getChatType() {
            return this.chatType_;
        }

        public void setChatType(int value) {
            this.chatType_ = value;
        }

        public void clearChatType() {
            this.chatType_ = 0;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public ByteString getNameBytes() {
            return ByteString.copyFromUtf8(this.name_);
        }

        public void setName(String value) {
            value.getClass();
            this.name_ = value;
        }

        public void clearName() {
            this.name_ = getDefaultInstance().getName();
        }

        public void setNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.name_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public String getAvatarUrl() {
            return this.avatarUrl_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public ByteString getAvatarUrlBytes() {
            return ByteString.copyFromUtf8(this.avatarUrl_);
        }

        public void setAvatarUrl(String value) {
            value.getClass();
            this.avatarUrl_ = value;
        }

        public void clearAvatarUrl() {
            this.avatarUrl_ = getDefaultInstance().getAvatarUrl();
        }

        public void setAvatarUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.avatarUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public List<String> getTagOldList() {
            return this.tagOld_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public int getTagOldCount() {
            return this.tagOld_.size();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public String getTagOld(int index) {
            return this.tagOld_.get(index);
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public ByteString getTagOldBytes(int index) {
            return ByteString.copyFromUtf8(this.tagOld_.get(index));
        }

        private void ensureTagOldIsMutable() {
            Internal.ProtobufList<String> tmp = this.tagOld_;
            if (!tmp.isModifiable()) {
                this.tagOld_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        public void setTagOld(int index, String value) {
            value.getClass();
            ensureTagOldIsMutable();
            this.tagOld_.set(index, value);
        }

        public void addTagOld(String value) {
            value.getClass();
            ensureTagOldIsMutable();
            this.tagOld_.add(value);
        }

        public void addAllTagOld(Iterable<String> values) {
            ensureTagOldIsMutable();
            AbstractMessageLite.addAll(values, this.tagOld_);
        }

        public void clearTagOld() {
            this.tagOld_ = GeneratedMessageLite.emptyProtobufList();
        }

        public void addTagOldBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            ensureTagOldIsMutable();
            this.tagOld_.add(value.toStringUtf8());
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public List<WsTag> getTagList() {
            return this.tag_;
        }

        public List<? extends WsTagOrBuilder> getTagOrBuilderList() {
            return this.tag_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public int getTagCount() {
            return this.tag_.size();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
        public WsTag getTag(int index) {
            return this.tag_.get(index);
        }

        public WsTagOrBuilder getTagOrBuilder(int index) {
            return this.tag_.get(index);
        }

        private void ensureTagIsMutable() {
            Internal.ProtobufList<WsTag> tmp = this.tag_;
            if (!tmp.isModifiable()) {
                this.tag_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        public void setTag(int index, WsTag value) {
            value.getClass();
            ensureTagIsMutable();
            this.tag_.set(index, value);
        }

        public void addTag(WsTag value) {
            value.getClass();
            ensureTagIsMutable();
            this.tag_.add(value);
        }

        public void addTag(int index, WsTag value) {
            value.getClass();
            ensureTagIsMutable();
            this.tag_.add(index, value);
        }

        public void addAllTag(Iterable<? extends WsTag> values) {
            ensureTagIsMutable();
            AbstractMessageLite.addAll(values, this.tag_);
        }

        public void clearTag() {
            this.tag_ = emptyProtobufList();
        }

        public void removeTag(int index) {
            ensureTagIsMutable();
            this.tag_.remove(index);
        }

        public static WsSender parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (WsSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WsSender parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WsSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WsSender parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (WsSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WsSender parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WsSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WsSender parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (WsSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WsSender parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WsSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WsSender parseFrom(InputStream input) throws IOException {
            return (WsSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static WsSender parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WsSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static WsSender parseDelimitedFrom(InputStream input) throws IOException {
            return (WsSender) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static WsSender parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WsSender) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static WsSender parseFrom(CodedInputStream input) throws IOException {
            return (WsSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static WsSender parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WsSender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(WsSender prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<WsSender, Builder> implements WsSenderOrBuilder {
            /* synthetic */ Builder(WsMsgIA wsMsgIA) {
                this();
            }

            private Builder() {
                super(WsSender.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public String getChatId() {
                return ((WsSender) this.instance).getChatId();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public ByteString getChatIdBytes() {
                return ((WsSender) this.instance).getChatIdBytes();
            }

            public Builder setChatId(String value) {
                copyOnWrite();
                ((WsSender) this.instance).setChatId(value);
                return this;
            }

            public Builder clearChatId() {
                copyOnWrite();
                ((WsSender) this.instance).clearChatId();
                return this;
            }

            public Builder setChatIdBytes(ByteString value) {
                copyOnWrite();
                ((WsSender) this.instance).setChatIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public int getChatType() {
                return ((WsSender) this.instance).getChatType();
            }

            public Builder setChatType(int value) {
                copyOnWrite();
                ((WsSender) this.instance).setChatType(value);
                return this;
            }

            public Builder clearChatType() {
                copyOnWrite();
                ((WsSender) this.instance).clearChatType();
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public String getName() {
                return ((WsSender) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public ByteString getNameBytes() {
                return ((WsSender) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((WsSender) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((WsSender) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((WsSender) this.instance).setNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public String getAvatarUrl() {
                return ((WsSender) this.instance).getAvatarUrl();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ((WsSender) this.instance).getAvatarUrlBytes();
            }

            public Builder setAvatarUrl(String value) {
                copyOnWrite();
                ((WsSender) this.instance).setAvatarUrl(value);
                return this;
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((WsSender) this.instance).clearAvatarUrl();
                return this;
            }

            public Builder setAvatarUrlBytes(ByteString value) {
                copyOnWrite();
                ((WsSender) this.instance).setAvatarUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public List<String> getTagOldList() {
                return Collections.unmodifiableList(((WsSender) this.instance).getTagOldList());
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public int getTagOldCount() {
                return ((WsSender) this.instance).getTagOldCount();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public String getTagOld(int index) {
                return ((WsSender) this.instance).getTagOld(index);
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public ByteString getTagOldBytes(int index) {
                return ((WsSender) this.instance).getTagOldBytes(index);
            }

            public Builder setTagOld(int index, String value) {
                copyOnWrite();
                ((WsSender) this.instance).setTagOld(index, value);
                return this;
            }

            public Builder addTagOld(String value) {
                copyOnWrite();
                ((WsSender) this.instance).addTagOld(value);
                return this;
            }

            public Builder addAllTagOld(Iterable<String> values) {
                copyOnWrite();
                ((WsSender) this.instance).addAllTagOld(values);
                return this;
            }

            public Builder clearTagOld() {
                copyOnWrite();
                ((WsSender) this.instance).clearTagOld();
                return this;
            }

            public Builder addTagOldBytes(ByteString value) {
                copyOnWrite();
                ((WsSender) this.instance).addTagOldBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public List<WsTag> getTagList() {
                return Collections.unmodifiableList(((WsSender) this.instance).getTagList());
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public int getTagCount() {
                return ((WsSender) this.instance).getTagCount();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsSenderOrBuilder
            public WsTag getTag(int index) {
                return ((WsSender) this.instance).getTag(index);
            }

            public Builder setTag(int index, WsTag value) {
                copyOnWrite();
                ((WsSender) this.instance).setTag(index, value);
                return this;
            }

            public Builder setTag(int index, WsTag.Builder builderForValue) {
                copyOnWrite();
                ((WsSender) this.instance).setTag(index, builderForValue.build());
                return this;
            }

            public Builder addTag(WsTag value) {
                copyOnWrite();
                ((WsSender) this.instance).addTag(value);
                return this;
            }

            public Builder addTag(int index, WsTag value) {
                copyOnWrite();
                ((WsSender) this.instance).addTag(index, value);
                return this;
            }

            public Builder addTag(WsTag.Builder builderForValue) {
                copyOnWrite();
                ((WsSender) this.instance).addTag(builderForValue.build());
                return this;
            }

            public Builder addTag(int index, WsTag.Builder builderForValue) {
                copyOnWrite();
                ((WsSender) this.instance).addTag(index, builderForValue.build());
                return this;
            }

            public Builder addAllTag(Iterable<? extends WsTag> values) {
                copyOnWrite();
                ((WsSender) this.instance).addAllTag(values);
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((WsSender) this.instance).clearTag();
                return this;
            }

            public Builder removeTag(int index) {
                copyOnWrite();
                ((WsSender) this.instance).removeTag(index);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new WsSender();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"chatId_", "chatType_", "name_", "avatarUrl_", "tagOld_", "tag_", WsTag.class};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\u0208\u0002\u0004\u0003\u0208\u0004\u0208\u0006\u021a\u0007\u001b", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<WsSender> parser = PARSER;
                    if (parser == null) {
                        synchronized (WsSender.class) {
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
            WsSender defaultInstance = new WsSender();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(WsSender.class, defaultInstance);
        }

        public static WsSender getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<WsSender> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class WsContent extends GeneratedMessageLite<WsContent, Builder> implements WsContentOrBuilder {
        public static final int AUDIO_TIME_FIELD_NUMBER = 22;
        public static final int AUDIO_URL_FIELD_NUMBER = 21;
        public static final int BUTTONS_FIELD_NUMBER = 2;
        public static final int CALL_STATUS_TEXT_FIELD_NUMBER = 32;
        public static final int CALL_TEXT_FIELD_NUMBER = 29;
        private static final WsContent DEFAULT_INSTANCE;
        public static final int EXPRESSION_ID_FIELD_NUMBER = 15;
        public static final int FILE_NAME_FIELD_NUMBER = 4;
        public static final int FILE_SIZE_FIELD_NUMBER = 18;
        public static final int FILE_URL_FIELD_NUMBER = 5;
        public static final int FORM_FIELD_NUMBER = 7;
        public static final int HEIGHT_FIELD_NUMBER = 34;
        public static final int IMAGE_URL_FIELD_NUMBER = 3;
        private static volatile Parser<WsContent> PARSER = null;
        public static final int POST_CONTENT_FIELD_NUMBER = 12;
        public static final int POST_CONTENT_TYPE_FIELD_NUMBER = 13;
        public static final int POST_ID_FIELD_NUMBER = 10;
        public static final int POST_TITLE_FIELD_NUMBER = 11;
        public static final int QUOTE_MSG_TEXT_FIELD_NUMBER = 8;
        public static final int STICKER_ITEM_ID_FIELD_NUMBER = 25;
        public static final int STICKER_PACK_ID_FIELD_NUMBER = 26;
        public static final int STICKER_URL_FIELD_NUMBER = 9;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int VIDEO_URL_FIELD_NUMBER = 19;
        public static final int WIDTH_FIELD_NUMBER = 33;
        private long audioTime_;
        private long fileSize_;
        private long height_;
        private long stickerItemId_;
        private long stickerPackId_;
        private long width_;
        private String text_ = "";
        private String buttons_ = "";
        private String imageUrl_ = "";
        private String fileName_ = "";
        private String fileUrl_ = "";
        private String form_ = "";
        private String quoteMsgText_ = "";
        private String stickerUrl_ = "";
        private String postId_ = "";
        private String postTitle_ = "";
        private String postContent_ = "";
        private String postContentType_ = "";
        private String expressionId_ = "";
        private String videoUrl_ = "";
        private String audioUrl_ = "";
        private String callText_ = "";
        private String callStatusText_ = "";

        private WsContent() {
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        public void setText(String value) {
            value.getClass();
            this.text_ = value;
        }

        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        public void setTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.text_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getButtons() {
            return this.buttons_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getButtonsBytes() {
            return ByteString.copyFromUtf8(this.buttons_);
        }

        public void setButtons(String value) {
            value.getClass();
            this.buttons_ = value;
        }

        public void clearButtons() {
            this.buttons_ = getDefaultInstance().getButtons();
        }

        public void setButtonsBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.buttons_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getImageUrlBytes() {
            return ByteString.copyFromUtf8(this.imageUrl_);
        }

        public void setImageUrl(String value) {
            value.getClass();
            this.imageUrl_ = value;
        }

        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
        }

        public void setImageUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.imageUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getFileName() {
            return this.fileName_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getFileNameBytes() {
            return ByteString.copyFromUtf8(this.fileName_);
        }

        public void setFileName(String value) {
            value.getClass();
            this.fileName_ = value;
        }

        public void clearFileName() {
            this.fileName_ = getDefaultInstance().getFileName();
        }

        public void setFileNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.fileName_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getFileUrl() {
            return this.fileUrl_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getFileUrlBytes() {
            return ByteString.copyFromUtf8(this.fileUrl_);
        }

        public void setFileUrl(String value) {
            value.getClass();
            this.fileUrl_ = value;
        }

        public void clearFileUrl() {
            this.fileUrl_ = getDefaultInstance().getFileUrl();
        }

        public void setFileUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.fileUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getForm() {
            return this.form_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getFormBytes() {
            return ByteString.copyFromUtf8(this.form_);
        }

        public void setForm(String value) {
            value.getClass();
            this.form_ = value;
        }

        public void clearForm() {
            this.form_ = getDefaultInstance().getForm();
        }

        public void setFormBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.form_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getQuoteMsgText() {
            return this.quoteMsgText_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getQuoteMsgTextBytes() {
            return ByteString.copyFromUtf8(this.quoteMsgText_);
        }

        public void setQuoteMsgText(String value) {
            value.getClass();
            this.quoteMsgText_ = value;
        }

        public void clearQuoteMsgText() {
            this.quoteMsgText_ = getDefaultInstance().getQuoteMsgText();
        }

        public void setQuoteMsgTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.quoteMsgText_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getStickerUrl() {
            return this.stickerUrl_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getStickerUrlBytes() {
            return ByteString.copyFromUtf8(this.stickerUrl_);
        }

        public void setStickerUrl(String value) {
            value.getClass();
            this.stickerUrl_ = value;
        }

        public void clearStickerUrl() {
            this.stickerUrl_ = getDefaultInstance().getStickerUrl();
        }

        public void setStickerUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.stickerUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getPostId() {
            return this.postId_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getPostIdBytes() {
            return ByteString.copyFromUtf8(this.postId_);
        }

        public void setPostId(String value) {
            value.getClass();
            this.postId_ = value;
        }

        public void clearPostId() {
            this.postId_ = getDefaultInstance().getPostId();
        }

        public void setPostIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.postId_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getPostTitle() {
            return this.postTitle_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getPostTitleBytes() {
            return ByteString.copyFromUtf8(this.postTitle_);
        }

        public void setPostTitle(String value) {
            value.getClass();
            this.postTitle_ = value;
        }

        public void clearPostTitle() {
            this.postTitle_ = getDefaultInstance().getPostTitle();
        }

        public void setPostTitleBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.postTitle_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getPostContent() {
            return this.postContent_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getPostContentBytes() {
            return ByteString.copyFromUtf8(this.postContent_);
        }

        public void setPostContent(String value) {
            value.getClass();
            this.postContent_ = value;
        }

        public void clearPostContent() {
            this.postContent_ = getDefaultInstance().getPostContent();
        }

        public void setPostContentBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.postContent_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getPostContentType() {
            return this.postContentType_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getPostContentTypeBytes() {
            return ByteString.copyFromUtf8(this.postContentType_);
        }

        public void setPostContentType(String value) {
            value.getClass();
            this.postContentType_ = value;
        }

        public void clearPostContentType() {
            this.postContentType_ = getDefaultInstance().getPostContentType();
        }

        public void setPostContentTypeBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.postContentType_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getExpressionId() {
            return this.expressionId_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getExpressionIdBytes() {
            return ByteString.copyFromUtf8(this.expressionId_);
        }

        public void setExpressionId(String value) {
            value.getClass();
            this.expressionId_ = value;
        }

        public void clearExpressionId() {
            this.expressionId_ = getDefaultInstance().getExpressionId();
        }

        public void setExpressionIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.expressionId_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public long getFileSize() {
            return this.fileSize_;
        }

        public void setFileSize(long value) {
            this.fileSize_ = value;
        }

        public void clearFileSize() {
            this.fileSize_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getVideoUrl() {
            return this.videoUrl_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getVideoUrlBytes() {
            return ByteString.copyFromUtf8(this.videoUrl_);
        }

        public void setVideoUrl(String value) {
            value.getClass();
            this.videoUrl_ = value;
        }

        public void clearVideoUrl() {
            this.videoUrl_ = getDefaultInstance().getVideoUrl();
        }

        public void setVideoUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.videoUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getAudioUrl() {
            return this.audioUrl_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getAudioUrlBytes() {
            return ByteString.copyFromUtf8(this.audioUrl_);
        }

        public void setAudioUrl(String value) {
            value.getClass();
            this.audioUrl_ = value;
        }

        public void clearAudioUrl() {
            this.audioUrl_ = getDefaultInstance().getAudioUrl();
        }

        public void setAudioUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.audioUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public long getAudioTime() {
            return this.audioTime_;
        }

        public void setAudioTime(long value) {
            this.audioTime_ = value;
        }

        public void clearAudioTime() {
            this.audioTime_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public long getStickerItemId() {
            return this.stickerItemId_;
        }

        public void setStickerItemId(long value) {
            this.stickerItemId_ = value;
        }

        public void clearStickerItemId() {
            this.stickerItemId_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public long getStickerPackId() {
            return this.stickerPackId_;
        }

        public void setStickerPackId(long value) {
            this.stickerPackId_ = value;
        }

        public void clearStickerPackId() {
            this.stickerPackId_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getCallText() {
            return this.callText_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getCallTextBytes() {
            return ByteString.copyFromUtf8(this.callText_);
        }

        public void setCallText(String value) {
            value.getClass();
            this.callText_ = value;
        }

        public void clearCallText() {
            this.callText_ = getDefaultInstance().getCallText();
        }

        public void setCallTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.callText_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public String getCallStatusText() {
            return this.callStatusText_;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public ByteString getCallStatusTextBytes() {
            return ByteString.copyFromUtf8(this.callStatusText_);
        }

        public void setCallStatusText(String value) {
            value.getClass();
            this.callStatusText_ = value;
        }

        public void clearCallStatusText() {
            this.callStatusText_ = getDefaultInstance().getCallStatusText();
        }

        public void setCallStatusTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.callStatusText_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public long getWidth() {
            return this.width_;
        }

        public void setWidth(long value) {
            this.width_ = value;
        }

        public void clearWidth() {
            this.width_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
        public long getHeight() {
            return this.height_;
        }

        public void setHeight(long value) {
            this.height_ = value;
        }

        public void clearHeight() {
            this.height_ = 0L;
        }

        public static WsContent parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (WsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WsContent parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WsContent parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (WsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WsContent parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WsContent parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (WsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static WsContent parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (WsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static WsContent parseFrom(InputStream input) throws IOException {
            return (WsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static WsContent parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static WsContent parseDelimitedFrom(InputStream input) throws IOException {
            return (WsContent) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static WsContent parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WsContent) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static WsContent parseFrom(CodedInputStream input) throws IOException {
            return (WsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static WsContent parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (WsContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(WsContent prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<WsContent, Builder> implements WsContentOrBuilder {
            /* synthetic */ Builder(WsMsgIA wsMsgIA) {
                this();
            }

            private Builder() {
                super(WsContent.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getText() {
                return ((WsContent) this.instance).getText();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getTextBytes() {
                return ((WsContent) this.instance).getTextBytes();
            }

            public Builder setText(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setText(value);
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((WsContent) this.instance).clearText();
                return this;
            }

            public Builder setTextBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getButtons() {
                return ((WsContent) this.instance).getButtons();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getButtonsBytes() {
                return ((WsContent) this.instance).getButtonsBytes();
            }

            public Builder setButtons(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setButtons(value);
                return this;
            }

            public Builder clearButtons() {
                copyOnWrite();
                ((WsContent) this.instance).clearButtons();
                return this;
            }

            public Builder setButtonsBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setButtonsBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getImageUrl() {
                return ((WsContent) this.instance).getImageUrl();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getImageUrlBytes() {
                return ((WsContent) this.instance).getImageUrlBytes();
            }

            public Builder setImageUrl(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setImageUrl(value);
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((WsContent) this.instance).clearImageUrl();
                return this;
            }

            public Builder setImageUrlBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setImageUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getFileName() {
                return ((WsContent) this.instance).getFileName();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getFileNameBytes() {
                return ((WsContent) this.instance).getFileNameBytes();
            }

            public Builder setFileName(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setFileName(value);
                return this;
            }

            public Builder clearFileName() {
                copyOnWrite();
                ((WsContent) this.instance).clearFileName();
                return this;
            }

            public Builder setFileNameBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setFileNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getFileUrl() {
                return ((WsContent) this.instance).getFileUrl();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getFileUrlBytes() {
                return ((WsContent) this.instance).getFileUrlBytes();
            }

            public Builder setFileUrl(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setFileUrl(value);
                return this;
            }

            public Builder clearFileUrl() {
                copyOnWrite();
                ((WsContent) this.instance).clearFileUrl();
                return this;
            }

            public Builder setFileUrlBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setFileUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getForm() {
                return ((WsContent) this.instance).getForm();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getFormBytes() {
                return ((WsContent) this.instance).getFormBytes();
            }

            public Builder setForm(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setForm(value);
                return this;
            }

            public Builder clearForm() {
                copyOnWrite();
                ((WsContent) this.instance).clearForm();
                return this;
            }

            public Builder setFormBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setFormBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getQuoteMsgText() {
                return ((WsContent) this.instance).getQuoteMsgText();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getQuoteMsgTextBytes() {
                return ((WsContent) this.instance).getQuoteMsgTextBytes();
            }

            public Builder setQuoteMsgText(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setQuoteMsgText(value);
                return this;
            }

            public Builder clearQuoteMsgText() {
                copyOnWrite();
                ((WsContent) this.instance).clearQuoteMsgText();
                return this;
            }

            public Builder setQuoteMsgTextBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setQuoteMsgTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getStickerUrl() {
                return ((WsContent) this.instance).getStickerUrl();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getStickerUrlBytes() {
                return ((WsContent) this.instance).getStickerUrlBytes();
            }

            public Builder setStickerUrl(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setStickerUrl(value);
                return this;
            }

            public Builder clearStickerUrl() {
                copyOnWrite();
                ((WsContent) this.instance).clearStickerUrl();
                return this;
            }

            public Builder setStickerUrlBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setStickerUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getPostId() {
                return ((WsContent) this.instance).getPostId();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getPostIdBytes() {
                return ((WsContent) this.instance).getPostIdBytes();
            }

            public Builder setPostId(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setPostId(value);
                return this;
            }

            public Builder clearPostId() {
                copyOnWrite();
                ((WsContent) this.instance).clearPostId();
                return this;
            }

            public Builder setPostIdBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setPostIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getPostTitle() {
                return ((WsContent) this.instance).getPostTitle();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getPostTitleBytes() {
                return ((WsContent) this.instance).getPostTitleBytes();
            }

            public Builder setPostTitle(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setPostTitle(value);
                return this;
            }

            public Builder clearPostTitle() {
                copyOnWrite();
                ((WsContent) this.instance).clearPostTitle();
                return this;
            }

            public Builder setPostTitleBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setPostTitleBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getPostContent() {
                return ((WsContent) this.instance).getPostContent();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getPostContentBytes() {
                return ((WsContent) this.instance).getPostContentBytes();
            }

            public Builder setPostContent(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setPostContent(value);
                return this;
            }

            public Builder clearPostContent() {
                copyOnWrite();
                ((WsContent) this.instance).clearPostContent();
                return this;
            }

            public Builder setPostContentBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setPostContentBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getPostContentType() {
                return ((WsContent) this.instance).getPostContentType();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getPostContentTypeBytes() {
                return ((WsContent) this.instance).getPostContentTypeBytes();
            }

            public Builder setPostContentType(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setPostContentType(value);
                return this;
            }

            public Builder clearPostContentType() {
                copyOnWrite();
                ((WsContent) this.instance).clearPostContentType();
                return this;
            }

            public Builder setPostContentTypeBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setPostContentTypeBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getExpressionId() {
                return ((WsContent) this.instance).getExpressionId();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getExpressionIdBytes() {
                return ((WsContent) this.instance).getExpressionIdBytes();
            }

            public Builder setExpressionId(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setExpressionId(value);
                return this;
            }

            public Builder clearExpressionId() {
                copyOnWrite();
                ((WsContent) this.instance).clearExpressionId();
                return this;
            }

            public Builder setExpressionIdBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setExpressionIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public long getFileSize() {
                return ((WsContent) this.instance).getFileSize();
            }

            public Builder setFileSize(long value) {
                copyOnWrite();
                ((WsContent) this.instance).setFileSize(value);
                return this;
            }

            public Builder clearFileSize() {
                copyOnWrite();
                ((WsContent) this.instance).clearFileSize();
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getVideoUrl() {
                return ((WsContent) this.instance).getVideoUrl();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getVideoUrlBytes() {
                return ((WsContent) this.instance).getVideoUrlBytes();
            }

            public Builder setVideoUrl(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setVideoUrl(value);
                return this;
            }

            public Builder clearVideoUrl() {
                copyOnWrite();
                ((WsContent) this.instance).clearVideoUrl();
                return this;
            }

            public Builder setVideoUrlBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setVideoUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getAudioUrl() {
                return ((WsContent) this.instance).getAudioUrl();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getAudioUrlBytes() {
                return ((WsContent) this.instance).getAudioUrlBytes();
            }

            public Builder setAudioUrl(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setAudioUrl(value);
                return this;
            }

            public Builder clearAudioUrl() {
                copyOnWrite();
                ((WsContent) this.instance).clearAudioUrl();
                return this;
            }

            public Builder setAudioUrlBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setAudioUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public long getAudioTime() {
                return ((WsContent) this.instance).getAudioTime();
            }

            public Builder setAudioTime(long value) {
                copyOnWrite();
                ((WsContent) this.instance).setAudioTime(value);
                return this;
            }

            public Builder clearAudioTime() {
                copyOnWrite();
                ((WsContent) this.instance).clearAudioTime();
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public long getStickerItemId() {
                return ((WsContent) this.instance).getStickerItemId();
            }

            public Builder setStickerItemId(long value) {
                copyOnWrite();
                ((WsContent) this.instance).setStickerItemId(value);
                return this;
            }

            public Builder clearStickerItemId() {
                copyOnWrite();
                ((WsContent) this.instance).clearStickerItemId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public long getStickerPackId() {
                return ((WsContent) this.instance).getStickerPackId();
            }

            public Builder setStickerPackId(long value) {
                copyOnWrite();
                ((WsContent) this.instance).setStickerPackId(value);
                return this;
            }

            public Builder clearStickerPackId() {
                copyOnWrite();
                ((WsContent) this.instance).clearStickerPackId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getCallText() {
                return ((WsContent) this.instance).getCallText();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getCallTextBytes() {
                return ((WsContent) this.instance).getCallTextBytes();
            }

            public Builder setCallText(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setCallText(value);
                return this;
            }

            public Builder clearCallText() {
                copyOnWrite();
                ((WsContent) this.instance).clearCallText();
                return this;
            }

            public Builder setCallTextBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setCallTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public String getCallStatusText() {
                return ((WsContent) this.instance).getCallStatusText();
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public ByteString getCallStatusTextBytes() {
                return ((WsContent) this.instance).getCallStatusTextBytes();
            }

            public Builder setCallStatusText(String value) {
                copyOnWrite();
                ((WsContent) this.instance).setCallStatusText(value);
                return this;
            }

            public Builder clearCallStatusText() {
                copyOnWrite();
                ((WsContent) this.instance).clearCallStatusText();
                return this;
            }

            public Builder setCallStatusTextBytes(ByteString value) {
                copyOnWrite();
                ((WsContent) this.instance).setCallStatusTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public long getWidth() {
                return ((WsContent) this.instance).getWidth();
            }

            public Builder setWidth(long value) {
                copyOnWrite();
                ((WsContent) this.instance).setWidth(value);
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((WsContent) this.instance).clearWidth();
                return this;
            }

            @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsg.WsContentOrBuilder
            public long getHeight() {
                return ((WsContent) this.instance).getHeight();
            }

            public Builder setHeight(long value) {
                copyOnWrite();
                ((WsContent) this.instance).setHeight(value);
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((WsContent) this.instance).clearHeight();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new WsContent();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"text_", "buttons_", "imageUrl_", "fileName_", "fileUrl_", "form_", "quoteMsgText_", "stickerUrl_", "postId_", "postTitle_", "postContent_", "postContentType_", "expressionId_", "fileSize_", "videoUrl_", "audioUrl_", "audioTime_", "stickerItemId_", "stickerPackId_", "callText_", "callStatusText_", "width_", "height_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0017\u0000\u0000\u0001\"\u0017\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u0208\r\u0208\u000f\u0208\u0012\u0002\u0013\u0208\u0015\u0208\u0016\u0002\u0019\u0002\u001a\u0002\u001d\u0208 \u0208!\u0002\"\u0002", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<WsContent> parser = PARSER;
                    if (parser == null) {
                        synchronized (WsContent.class) {
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
            WsContent defaultInstance = new WsContent();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(WsContent.class, defaultInstance);
        }

        public static WsContent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<WsContent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public String getMsgId() {
        return this.msgId_;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public ByteString getMsgIdBytes() {
        return ByteString.copyFromUtf8(this.msgId_);
    }

    public void setMsgId(String value) {
        value.getClass();
        this.msgId_ = value;
    }

    public void clearMsgId() {
        this.msgId_ = getDefaultInstance().getMsgId();
    }

    public void setMsgIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.msgId_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public boolean hasSender() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public WsSender getSender() {
        return this.sender_ == null ? WsSender.getDefaultInstance() : this.sender_;
    }

    public void setSender(WsSender value) {
        value.getClass();
        this.sender_ = value;
        this.bitField0_ |= 1;
    }

    public void mergeSender(WsSender value) {
        value.getClass();
        if (this.sender_ != null && this.sender_ != WsSender.getDefaultInstance()) {
            this.sender_ = WsSender.newBuilder(this.sender_).mergeFrom((WsSender.Builder) value).buildPartial();
        } else {
            this.sender_ = value;
        }
        this.bitField0_ |= 1;
    }

    public void clearSender() {
        this.sender_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public String getRecvId() {
        return this.recvId_;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public ByteString getRecvIdBytes() {
        return ByteString.copyFromUtf8(this.recvId_);
    }

    public void setRecvId(String value) {
        value.getClass();
        this.recvId_ = value;
    }

    public void clearRecvId() {
        this.recvId_ = getDefaultInstance().getRecvId();
    }

    public void setRecvIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.recvId_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public String getChatId() {
        return this.chatId_;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public ByteString getChatIdBytes() {
        return ByteString.copyFromUtf8(this.chatId_);
    }

    public void setChatId(String value) {
        value.getClass();
        this.chatId_ = value;
    }

    public void clearChatId() {
        this.chatId_ = getDefaultInstance().getChatId();
    }

    public void setChatIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.chatId_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public int getChatType() {
        return this.chatType_;
    }

    public void setChatType(int value) {
        this.chatType_ = value;
    }

    public void clearChatType() {
        this.chatType_ = 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public boolean hasContent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public WsContent getContent() {
        return this.content_ == null ? WsContent.getDefaultInstance() : this.content_;
    }

    public void setContent(WsContent value) {
        value.getClass();
        this.content_ = value;
        this.bitField0_ |= 2;
    }

    public void mergeContent(WsContent value) {
        value.getClass();
        if (this.content_ != null && this.content_ != WsContent.getDefaultInstance()) {
            this.content_ = WsContent.newBuilder(this.content_).mergeFrom((WsContent.Builder) value).buildPartial();
        } else {
            this.content_ = value;
        }
        this.bitField0_ |= 2;
    }

    public void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -3;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public int getContentType() {
        return this.contentType_;
    }

    public void setContentType(int value) {
        this.contentType_ = value;
    }

    public void clearContentType() {
        this.contentType_ = 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public long getTimestamp() {
        return this.timestamp_;
    }

    public void setTimestamp(long value) {
        this.timestamp_ = value;
    }

    public void clearTimestamp() {
        this.timestamp_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public boolean hasCmd() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public WsCmd getCmd() {
        return this.cmd_ == null ? WsCmd.getDefaultInstance() : this.cmd_;
    }

    public void setCmd(WsCmd value) {
        value.getClass();
        this.cmd_ = value;
        this.bitField0_ |= 4;
    }

    public void mergeCmd(WsCmd value) {
        value.getClass();
        if (this.cmd_ != null && this.cmd_ != WsCmd.getDefaultInstance()) {
            this.cmd_ = WsCmd.newBuilder(this.cmd_).mergeFrom((WsCmd.Builder) value).buildPartial();
        } else {
            this.cmd_ = value;
        }
        this.bitField0_ |= 4;
    }

    public void clearCmd() {
        this.cmd_ = null;
        this.bitField0_ &= -5;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public long getDeleteTime() {
        return this.deleteTime_;
    }

    public void setDeleteTime(long value) {
        this.deleteTime_ = value;
    }

    public void clearDeleteTime() {
        this.deleteTime_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public String getQuoteMsgId() {
        return this.quoteMsgId_;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public ByteString getQuoteMsgIdBytes() {
        return ByteString.copyFromUtf8(this.quoteMsgId_);
    }

    public void setQuoteMsgId(String value) {
        value.getClass();
        this.quoteMsgId_ = value;
    }

    public void clearQuoteMsgId() {
        this.quoteMsgId_ = getDefaultInstance().getQuoteMsgId();
    }

    public void setQuoteMsgIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.quoteMsgId_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public long getMsgSeq() {
        return this.msgSeq_;
    }

    public void setMsgSeq(long value) {
        this.msgSeq_ = value;
    }

    public void clearMsgSeq() {
        this.msgSeq_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
    public long getEditTime() {
        return this.editTime_;
    }

    public void setEditTime(long value) {
        this.editTime_ = value;
    }

    public void clearEditTime() {
        this.editTime_ = 0L;
    }

    public static WsMsg parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (WsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static WsMsg parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (WsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static WsMsg parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (WsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static WsMsg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (WsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static WsMsg parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (WsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static WsMsg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (WsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static WsMsg parseFrom(InputStream input) throws IOException {
        return (WsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static WsMsg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (WsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static WsMsg parseDelimitedFrom(InputStream input) throws IOException {
        return (WsMsg) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static WsMsg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (WsMsg) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static WsMsg parseFrom(CodedInputStream input) throws IOException {
        return (WsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static WsMsg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (WsMsg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(WsMsg prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<WsMsg, Builder> implements WsMsgOrBuilder {
        /* synthetic */ Builder(WsMsgIA wsMsgIA) {
            this();
        }

        private Builder() {
            super(WsMsg.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public String getMsgId() {
            return ((WsMsg) this.instance).getMsgId();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public ByteString getMsgIdBytes() {
            return ((WsMsg) this.instance).getMsgIdBytes();
        }

        public Builder setMsgId(String value) {
            copyOnWrite();
            ((WsMsg) this.instance).setMsgId(value);
            return this;
        }

        public Builder clearMsgId() {
            copyOnWrite();
            ((WsMsg) this.instance).clearMsgId();
            return this;
        }

        public Builder setMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((WsMsg) this.instance).setMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public boolean hasSender() {
            return ((WsMsg) this.instance).hasSender();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public WsSender getSender() {
            return ((WsMsg) this.instance).getSender();
        }

        public Builder setSender(WsSender value) {
            copyOnWrite();
            ((WsMsg) this.instance).setSender(value);
            return this;
        }

        public Builder setSender(WsSender.Builder builderForValue) {
            copyOnWrite();
            ((WsMsg) this.instance).setSender(builderForValue.build());
            return this;
        }

        public Builder mergeSender(WsSender value) {
            copyOnWrite();
            ((WsMsg) this.instance).mergeSender(value);
            return this;
        }

        public Builder clearSender() {
            copyOnWrite();
            ((WsMsg) this.instance).clearSender();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public String getRecvId() {
            return ((WsMsg) this.instance).getRecvId();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public ByteString getRecvIdBytes() {
            return ((WsMsg) this.instance).getRecvIdBytes();
        }

        public Builder setRecvId(String value) {
            copyOnWrite();
            ((WsMsg) this.instance).setRecvId(value);
            return this;
        }

        public Builder clearRecvId() {
            copyOnWrite();
            ((WsMsg) this.instance).clearRecvId();
            return this;
        }

        public Builder setRecvIdBytes(ByteString value) {
            copyOnWrite();
            ((WsMsg) this.instance).setRecvIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public String getChatId() {
            return ((WsMsg) this.instance).getChatId();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public ByteString getChatIdBytes() {
            return ((WsMsg) this.instance).getChatIdBytes();
        }

        public Builder setChatId(String value) {
            copyOnWrite();
            ((WsMsg) this.instance).setChatId(value);
            return this;
        }

        public Builder clearChatId() {
            copyOnWrite();
            ((WsMsg) this.instance).clearChatId();
            return this;
        }

        public Builder setChatIdBytes(ByteString value) {
            copyOnWrite();
            ((WsMsg) this.instance).setChatIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public int getChatType() {
            return ((WsMsg) this.instance).getChatType();
        }

        public Builder setChatType(int value) {
            copyOnWrite();
            ((WsMsg) this.instance).setChatType(value);
            return this;
        }

        public Builder clearChatType() {
            copyOnWrite();
            ((WsMsg) this.instance).clearChatType();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public boolean hasContent() {
            return ((WsMsg) this.instance).hasContent();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public WsContent getContent() {
            return ((WsMsg) this.instance).getContent();
        }

        public Builder setContent(WsContent value) {
            copyOnWrite();
            ((WsMsg) this.instance).setContent(value);
            return this;
        }

        public Builder setContent(WsContent.Builder builderForValue) {
            copyOnWrite();
            ((WsMsg) this.instance).setContent(builderForValue.build());
            return this;
        }

        public Builder mergeContent(WsContent value) {
            copyOnWrite();
            ((WsMsg) this.instance).mergeContent(value);
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((WsMsg) this.instance).clearContent();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public int getContentType() {
            return ((WsMsg) this.instance).getContentType();
        }

        public Builder setContentType(int value) {
            copyOnWrite();
            ((WsMsg) this.instance).setContentType(value);
            return this;
        }

        public Builder clearContentType() {
            copyOnWrite();
            ((WsMsg) this.instance).clearContentType();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public long getTimestamp() {
            return ((WsMsg) this.instance).getTimestamp();
        }

        public Builder setTimestamp(long value) {
            copyOnWrite();
            ((WsMsg) this.instance).setTimestamp(value);
            return this;
        }

        public Builder clearTimestamp() {
            copyOnWrite();
            ((WsMsg) this.instance).clearTimestamp();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public boolean hasCmd() {
            return ((WsMsg) this.instance).hasCmd();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public WsCmd getCmd() {
            return ((WsMsg) this.instance).getCmd();
        }

        public Builder setCmd(WsCmd value) {
            copyOnWrite();
            ((WsMsg) this.instance).setCmd(value);
            return this;
        }

        public Builder setCmd(WsCmd.Builder builderForValue) {
            copyOnWrite();
            ((WsMsg) this.instance).setCmd(builderForValue.build());
            return this;
        }

        public Builder mergeCmd(WsCmd value) {
            copyOnWrite();
            ((WsMsg) this.instance).mergeCmd(value);
            return this;
        }

        public Builder clearCmd() {
            copyOnWrite();
            ((WsMsg) this.instance).clearCmd();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public long getDeleteTime() {
            return ((WsMsg) this.instance).getDeleteTime();
        }

        public Builder setDeleteTime(long value) {
            copyOnWrite();
            ((WsMsg) this.instance).setDeleteTime(value);
            return this;
        }

        public Builder clearDeleteTime() {
            copyOnWrite();
            ((WsMsg) this.instance).clearDeleteTime();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public String getQuoteMsgId() {
            return ((WsMsg) this.instance).getQuoteMsgId();
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public ByteString getQuoteMsgIdBytes() {
            return ((WsMsg) this.instance).getQuoteMsgIdBytes();
        }

        public Builder setQuoteMsgId(String value) {
            copyOnWrite();
            ((WsMsg) this.instance).setQuoteMsgId(value);
            return this;
        }

        public Builder clearQuoteMsgId() {
            copyOnWrite();
            ((WsMsg) this.instance).clearQuoteMsgId();
            return this;
        }

        public Builder setQuoteMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((WsMsg) this.instance).setQuoteMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public long getMsgSeq() {
            return ((WsMsg) this.instance).getMsgSeq();
        }

        public Builder setMsgSeq(long value) {
            copyOnWrite();
            ((WsMsg) this.instance).setMsgSeq(value);
            return this;
        }

        public Builder clearMsgSeq() {
            copyOnWrite();
            ((WsMsg) this.instance).clearMsgSeq();
            return this;
        }

        @Override // com.yhchat.canarys.proto.chat_ws_go.WsMsgOrBuilder
        public long getEditTime() {
            return ((WsMsg) this.instance).getEditTime();
        }

        public Builder setEditTime(long value) {
            copyOnWrite();
            ((WsMsg) this.instance).setEditTime(value);
            return this;
        }

        public Builder clearEditTime() {
            copyOnWrite();
            ((WsMsg) this.instance).clearEditTime();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new WsMsg();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "msgId_", "sender_", "recvId_", "chatId_", "chatType_", "content_", "contentType_", "timestamp_", "cmd_", "deleteTime_", "quoteMsgId_", "msgSeq_", "editTime_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000\u0003\u0208\u0004\u0208\u0005\u0004\u0006\u1009\u0001\u0007\u0004\b\u0002\t\u1009\u0002\n\u0002\u000b\u0208\f\u0002\u000e\u0002", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<WsMsg> parser = PARSER;
                if (parser == null) {
                    synchronized (WsMsg.class) {
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
        WsMsg defaultInstance = new WsMsg();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(WsMsg.class, defaultInstance);
    }

    public static WsMsg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<WsMsg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
