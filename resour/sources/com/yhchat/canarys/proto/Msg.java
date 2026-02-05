package com.yhchat.canarys.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.yhchat.canarys.proto.Tag;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class Msg extends GeneratedMessageLite<Msg, Builder> implements MsgOrBuilder {
    public static final int CMD_FIELD_NUMBER = 7;
    public static final int CONTENT_FIELD_NUMBER = 5;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
    private static final Msg DEFAULT_INSTANCE;
    public static final int DIRECTION_FIELD_NUMBER = 3;
    public static final int EDIT_TIME_FIELD_NUMBER = 12;
    public static final int MSG_DELETE_TIME_FIELD_NUMBER = 8;
    public static final int MSG_ID_FIELD_NUMBER = 1;
    public static final int MSG_SEQ_FIELD_NUMBER = 10;
    private static volatile Parser<Msg> PARSER = null;
    public static final int QUOTE_MSG_ID_FIELD_NUMBER = 9;
    public static final int SENDER_FIELD_NUMBER = 2;
    public static final int SEND_TIME_FIELD_NUMBER = 6;
    private int bitField0_;
    private Cmd cmd_;
    private int contentType_;
    private Content content_;
    private long editTime_;
    private long msgDeleteTime_;
    private long msgSeq_;
    private long sendTime_;
    private Sender sender_;
    private String msgId_ = "";
    private String direction_ = "";
    private String quoteMsgId_ = "";

    public interface CmdOrBuilder extends MessageLiteOrBuilder {
        String getName();

        ByteString getNameBytes();

        int getType();
    }

    public interface ContentOrBuilder extends MessageLiteOrBuilder {
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

        String getQuoteImageName();

        ByteString getQuoteImageNameBytes();

        String getQuoteImageUrl();

        ByteString getQuoteImageUrlBytes();

        String getQuoteMsgText();

        ByteString getQuoteMsgTextBytes();

        long getQuoteVideoTime();

        String getQuoteVideoUrl();

        ByteString getQuoteVideoUrlBytes();

        long getStickerItemId();

        long getStickerPackId();

        String getStickerUrl();

        ByteString getStickerUrlBytes();

        String getText();

        ByteString getTextBytes();

        String getTip();

        ByteString getTipBytes();

        String getVideoUrl();

        ByteString getVideoUrlBytes();

        long getWidth();
    }

    public interface SenderOrBuilder extends MessageLiteOrBuilder {
        String getAvatarUrl();

        ByteString getAvatarUrlBytes();

        String getChatId();

        ByteString getChatIdBytes();

        int getChatType();

        String getName();

        ByteString getNameBytes();

        Tag getTag(int index);

        int getTagCount();

        List<Tag> getTagList();

        String getTagOld(int index);

        ByteString getTagOldBytes(int index);

        int getTagOldCount();

        List<String> getTagOldList();
    }

    private Msg() {
    }

    public static final class Cmd extends GeneratedMessageLite<Cmd, Builder> implements CmdOrBuilder {
        private static final Cmd DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 2;
        private static volatile Parser<Cmd> PARSER = null;
        public static final int TYPE_FIELD_NUMBER = 4;
        private String name_ = "";
        private int type_;

        private Cmd() {
        }

        @Override // com.yhchat.canarys.proto.Msg.CmdOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.Msg.CmdOrBuilder
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

        @Override // com.yhchat.canarys.proto.Msg.CmdOrBuilder
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

        public static Cmd parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Cmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Cmd parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Cmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Cmd parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Cmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Cmd parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Cmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Cmd parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Cmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Cmd parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Cmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Cmd parseFrom(InputStream input) throws IOException {
            return (Cmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Cmd parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Cmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Cmd parseDelimitedFrom(InputStream input) throws IOException {
            return (Cmd) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Cmd parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Cmd) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Cmd parseFrom(CodedInputStream input) throws IOException {
            return (Cmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Cmd parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Cmd) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Cmd prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Cmd, Builder> implements CmdOrBuilder {
            private Builder() {
                super(Cmd.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.Msg.CmdOrBuilder
            public String getName() {
                return ((Cmd) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.Msg.CmdOrBuilder
            public ByteString getNameBytes() {
                return ((Cmd) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((Cmd) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Cmd) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((Cmd) this.instance).setNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.CmdOrBuilder
            public int getType() {
                return ((Cmd) this.instance).getType();
            }

            public Builder setType(int value) {
                copyOnWrite();
                ((Cmd) this.instance).setType(value);
                return this;
            }

            public Builder clearType() {
                copyOnWrite();
                ((Cmd) this.instance).clearType();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Cmd();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"name_", "type_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0000\u0000\u0002\u0208\u0004\u0004", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Cmd> parser = PARSER;
                    if (parser == null) {
                        synchronized (Cmd.class) {
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
            Cmd defaultInstance = new Cmd();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Cmd.class, defaultInstance);
        }

        public static Cmd getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Cmd> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Content extends GeneratedMessageLite<Content, Builder> implements ContentOrBuilder {
        public static final int AUDIO_TIME_FIELD_NUMBER = 22;
        public static final int AUDIO_URL_FIELD_NUMBER = 21;
        public static final int BUTTONS_FIELD_NUMBER = 2;
        public static final int CALL_STATUS_TEXT_FIELD_NUMBER = 32;
        public static final int CALL_TEXT_FIELD_NUMBER = 29;
        private static final Content DEFAULT_INSTANCE;
        public static final int EXPRESSION_ID_FIELD_NUMBER = 15;
        public static final int FILE_NAME_FIELD_NUMBER = 4;
        public static final int FILE_SIZE_FIELD_NUMBER = 18;
        public static final int FILE_URL_FIELD_NUMBER = 5;
        public static final int FORM_FIELD_NUMBER = 7;
        public static final int HEIGHT_FIELD_NUMBER = 34;
        public static final int IMAGE_URL_FIELD_NUMBER = 3;
        private static volatile Parser<Content> PARSER = null;
        public static final int POST_CONTENT_FIELD_NUMBER = 12;
        public static final int POST_CONTENT_TYPE_FIELD_NUMBER = 13;
        public static final int POST_ID_FIELD_NUMBER = 10;
        public static final int POST_TITLE_FIELD_NUMBER = 11;
        public static final int QUOTE_IMAGE_NAME_FIELD_NUMBER = 17;
        public static final int QUOTE_IMAGE_URL_FIELD_NUMBER = 16;
        public static final int QUOTE_MSG_TEXT_FIELD_NUMBER = 8;
        public static final int QUOTE_VIDEO_TIME_FIELD_NUMBER = 24;
        public static final int QUOTE_VIDEO_URL_FIELD_NUMBER = 23;
        public static final int STICKER_ITEM_ID_FIELD_NUMBER = 25;
        public static final int STICKER_PACK_ID_FIELD_NUMBER = 26;
        public static final int STICKER_URL_FIELD_NUMBER = 9;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int TIP_FIELD_NUMBER = 37;
        public static final int VIDEO_URL_FIELD_NUMBER = 19;
        public static final int WIDTH_FIELD_NUMBER = 33;
        private long audioTime_;
        private long fileSize_;
        private long height_;
        private long quoteVideoTime_;
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
        private String quoteImageUrl_ = "";
        private String quoteImageName_ = "";
        private String videoUrl_ = "";
        private String audioUrl_ = "";
        private String quoteVideoUrl_ = "";
        private String callText_ = "";
        private String callStatusText_ = "";
        private String tip_ = "";

        private Content() {
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getTextBytes() {
            return ByteString.copyFromUtf8(this.text_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setText(String value) {
            value.getClass();
            this.text_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearText() {
            this.text_ = getDefaultInstance().getText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.text_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getButtons() {
            return this.buttons_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getButtonsBytes() {
            return ByteString.copyFromUtf8(this.buttons_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtons(String value) {
            value.getClass();
            this.buttons_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearButtons() {
            this.buttons_ = getDefaultInstance().getButtons();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setButtonsBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.buttons_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getImageUrl() {
            return this.imageUrl_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getImageUrlBytes() {
            return ByteString.copyFromUtf8(this.imageUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrl(String value) {
            value.getClass();
            this.imageUrl_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageUrl() {
            this.imageUrl_ = getDefaultInstance().getImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.imageUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getFileName() {
            return this.fileName_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getFileNameBytes() {
            return ByteString.copyFromUtf8(this.fileName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileName(String value) {
            value.getClass();
            this.fileName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileName() {
            this.fileName_ = getDefaultInstance().getFileName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.fileName_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getFileUrl() {
            return this.fileUrl_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getFileUrlBytes() {
            return ByteString.copyFromUtf8(this.fileUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileUrl(String value) {
            value.getClass();
            this.fileUrl_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileUrl() {
            this.fileUrl_ = getDefaultInstance().getFileUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.fileUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getForm() {
            return this.form_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getQuoteMsgText() {
            return this.quoteMsgText_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getQuoteMsgTextBytes() {
            return ByteString.copyFromUtf8(this.quoteMsgText_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteMsgText(String value) {
            value.getClass();
            this.quoteMsgText_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuoteMsgText() {
            this.quoteMsgText_ = getDefaultInstance().getQuoteMsgText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteMsgTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.quoteMsgText_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getStickerUrl() {
            return this.stickerUrl_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getStickerUrlBytes() {
            return ByteString.copyFromUtf8(this.stickerUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStickerUrl(String value) {
            value.getClass();
            this.stickerUrl_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStickerUrl() {
            this.stickerUrl_ = getDefaultInstance().getStickerUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStickerUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.stickerUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getPostId() {
            return this.postId_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getPostIdBytes() {
            return ByteString.copyFromUtf8(this.postId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPostId(String value) {
            value.getClass();
            this.postId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPostId() {
            this.postId_ = getDefaultInstance().getPostId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPostIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.postId_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getPostTitle() {
            return this.postTitle_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getPostTitleBytes() {
            return ByteString.copyFromUtf8(this.postTitle_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPostTitle(String value) {
            value.getClass();
            this.postTitle_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPostTitle() {
            this.postTitle_ = getDefaultInstance().getPostTitle();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPostTitleBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.postTitle_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getPostContent() {
            return this.postContent_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getPostContentBytes() {
            return ByteString.copyFromUtf8(this.postContent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPostContent(String value) {
            value.getClass();
            this.postContent_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPostContent() {
            this.postContent_ = getDefaultInstance().getPostContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPostContentBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.postContent_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getPostContentType() {
            return this.postContentType_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getPostContentTypeBytes() {
            return ByteString.copyFromUtf8(this.postContentType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPostContentType(String value) {
            value.getClass();
            this.postContentType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPostContentType() {
            this.postContentType_ = getDefaultInstance().getPostContentType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPostContentTypeBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.postContentType_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getExpressionId() {
            return this.expressionId_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getExpressionIdBytes() {
            return ByteString.copyFromUtf8(this.expressionId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpressionId(String value) {
            value.getClass();
            this.expressionId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExpressionId() {
            this.expressionId_ = getDefaultInstance().getExpressionId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpressionIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.expressionId_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getQuoteImageUrl() {
            return this.quoteImageUrl_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getQuoteImageUrlBytes() {
            return ByteString.copyFromUtf8(this.quoteImageUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteImageUrl(String value) {
            value.getClass();
            this.quoteImageUrl_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuoteImageUrl() {
            this.quoteImageUrl_ = getDefaultInstance().getQuoteImageUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteImageUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.quoteImageUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getQuoteImageName() {
            return this.quoteImageName_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getQuoteImageNameBytes() {
            return ByteString.copyFromUtf8(this.quoteImageName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteImageName(String value) {
            value.getClass();
            this.quoteImageName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuoteImageName() {
            this.quoteImageName_ = getDefaultInstance().getQuoteImageName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteImageNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.quoteImageName_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public long getFileSize() {
            return this.fileSize_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileSize(long value) {
            this.fileSize_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileSize() {
            this.fileSize_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getVideoUrl() {
            return this.videoUrl_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getVideoUrlBytes() {
            return ByteString.copyFromUtf8(this.videoUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoUrl(String value) {
            value.getClass();
            this.videoUrl_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideoUrl() {
            this.videoUrl_ = getDefaultInstance().getVideoUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.videoUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getAudioUrl() {
            return this.audioUrl_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getAudioUrlBytes() {
            return ByteString.copyFromUtf8(this.audioUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioUrl(String value) {
            value.getClass();
            this.audioUrl_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudioUrl() {
            this.audioUrl_ = getDefaultInstance().getAudioUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.audioUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public long getAudioTime() {
            return this.audioTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioTime(long value) {
            this.audioTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudioTime() {
            this.audioTime_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getQuoteVideoUrl() {
            return this.quoteVideoUrl_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getQuoteVideoUrlBytes() {
            return ByteString.copyFromUtf8(this.quoteVideoUrl_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteVideoUrl(String value) {
            value.getClass();
            this.quoteVideoUrl_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuoteVideoUrl() {
            this.quoteVideoUrl_ = getDefaultInstance().getQuoteVideoUrl();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteVideoUrlBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.quoteVideoUrl_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public long getQuoteVideoTime() {
            return this.quoteVideoTime_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuoteVideoTime(long value) {
            this.quoteVideoTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuoteVideoTime() {
            this.quoteVideoTime_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public long getStickerItemId() {
            return this.stickerItemId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStickerItemId(long value) {
            this.stickerItemId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStickerItemId() {
            this.stickerItemId_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public long getStickerPackId() {
            return this.stickerPackId_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStickerPackId(long value) {
            this.stickerPackId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStickerPackId() {
            this.stickerPackId_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getCallText() {
            return this.callText_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getCallTextBytes() {
            return ByteString.copyFromUtf8(this.callText_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallText(String value) {
            value.getClass();
            this.callText_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallText() {
            this.callText_ = getDefaultInstance().getCallText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.callText_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getCallStatusText() {
            return this.callStatusText_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getCallStatusTextBytes() {
            return ByteString.copyFromUtf8(this.callStatusText_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallStatusText(String value) {
            value.getClass();
            this.callStatusText_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallStatusText() {
            this.callStatusText_ = getDefaultInstance().getCallStatusText();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallStatusTextBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.callStatusText_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public long getWidth() {
            return this.width_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(long value) {
            this.width_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public long getHeight() {
            return this.height_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeight(long value) {
            this.height_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeight() {
            this.height_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public String getTip() {
            return this.tip_;
        }

        @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
        public ByteString getTipBytes() {
            return ByteString.copyFromUtf8(this.tip_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTip(String value) {
            value.getClass();
            this.tip_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTip() {
            this.tip_ = getDefaultInstance().getTip();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTipBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.tip_ = value.toStringUtf8();
        }

        public static Content parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Content parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Content parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Content parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Content parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Content parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Content parseFrom(InputStream input) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Content parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Content parseDelimitedFrom(InputStream input) throws IOException {
            return (Content) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Content parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Content) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Content parseFrom(CodedInputStream input) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Content parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Content) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Content prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Content, Builder> implements ContentOrBuilder {
            private Builder() {
                super(Content.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getText() {
                return ((Content) this.instance).getText();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getTextBytes() {
                return ((Content) this.instance).getTextBytes();
            }

            public Builder setText(String value) {
                copyOnWrite();
                ((Content) this.instance).setText(value);
                return this;
            }

            public Builder clearText() {
                copyOnWrite();
                ((Content) this.instance).clearText();
                return this;
            }

            public Builder setTextBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getButtons() {
                return ((Content) this.instance).getButtons();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getButtonsBytes() {
                return ((Content) this.instance).getButtonsBytes();
            }

            public Builder setButtons(String value) {
                copyOnWrite();
                ((Content) this.instance).setButtons(value);
                return this;
            }

            public Builder clearButtons() {
                copyOnWrite();
                ((Content) this.instance).clearButtons();
                return this;
            }

            public Builder setButtonsBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setButtonsBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getImageUrl() {
                return ((Content) this.instance).getImageUrl();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getImageUrlBytes() {
                return ((Content) this.instance).getImageUrlBytes();
            }

            public Builder setImageUrl(String value) {
                copyOnWrite();
                ((Content) this.instance).setImageUrl(value);
                return this;
            }

            public Builder clearImageUrl() {
                copyOnWrite();
                ((Content) this.instance).clearImageUrl();
                return this;
            }

            public Builder setImageUrlBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setImageUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getFileName() {
                return ((Content) this.instance).getFileName();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getFileNameBytes() {
                return ((Content) this.instance).getFileNameBytes();
            }

            public Builder setFileName(String value) {
                copyOnWrite();
                ((Content) this.instance).setFileName(value);
                return this;
            }

            public Builder clearFileName() {
                copyOnWrite();
                ((Content) this.instance).clearFileName();
                return this;
            }

            public Builder setFileNameBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setFileNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getFileUrl() {
                return ((Content) this.instance).getFileUrl();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getFileUrlBytes() {
                return ((Content) this.instance).getFileUrlBytes();
            }

            public Builder setFileUrl(String value) {
                copyOnWrite();
                ((Content) this.instance).setFileUrl(value);
                return this;
            }

            public Builder clearFileUrl() {
                copyOnWrite();
                ((Content) this.instance).clearFileUrl();
                return this;
            }

            public Builder setFileUrlBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setFileUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getForm() {
                return ((Content) this.instance).getForm();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getFormBytes() {
                return ((Content) this.instance).getFormBytes();
            }

            public Builder setForm(String value) {
                copyOnWrite();
                ((Content) this.instance).setForm(value);
                return this;
            }

            public Builder clearForm() {
                copyOnWrite();
                ((Content) this.instance).clearForm();
                return this;
            }

            public Builder setFormBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setFormBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getQuoteMsgText() {
                return ((Content) this.instance).getQuoteMsgText();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getQuoteMsgTextBytes() {
                return ((Content) this.instance).getQuoteMsgTextBytes();
            }

            public Builder setQuoteMsgText(String value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteMsgText(value);
                return this;
            }

            public Builder clearQuoteMsgText() {
                copyOnWrite();
                ((Content) this.instance).clearQuoteMsgText();
                return this;
            }

            public Builder setQuoteMsgTextBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteMsgTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getStickerUrl() {
                return ((Content) this.instance).getStickerUrl();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getStickerUrlBytes() {
                return ((Content) this.instance).getStickerUrlBytes();
            }

            public Builder setStickerUrl(String value) {
                copyOnWrite();
                ((Content) this.instance).setStickerUrl(value);
                return this;
            }

            public Builder clearStickerUrl() {
                copyOnWrite();
                ((Content) this.instance).clearStickerUrl();
                return this;
            }

            public Builder setStickerUrlBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setStickerUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getPostId() {
                return ((Content) this.instance).getPostId();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getPostIdBytes() {
                return ((Content) this.instance).getPostIdBytes();
            }

            public Builder setPostId(String value) {
                copyOnWrite();
                ((Content) this.instance).setPostId(value);
                return this;
            }

            public Builder clearPostId() {
                copyOnWrite();
                ((Content) this.instance).clearPostId();
                return this;
            }

            public Builder setPostIdBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setPostIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getPostTitle() {
                return ((Content) this.instance).getPostTitle();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getPostTitleBytes() {
                return ((Content) this.instance).getPostTitleBytes();
            }

            public Builder setPostTitle(String value) {
                copyOnWrite();
                ((Content) this.instance).setPostTitle(value);
                return this;
            }

            public Builder clearPostTitle() {
                copyOnWrite();
                ((Content) this.instance).clearPostTitle();
                return this;
            }

            public Builder setPostTitleBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setPostTitleBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getPostContent() {
                return ((Content) this.instance).getPostContent();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getPostContentBytes() {
                return ((Content) this.instance).getPostContentBytes();
            }

            public Builder setPostContent(String value) {
                copyOnWrite();
                ((Content) this.instance).setPostContent(value);
                return this;
            }

            public Builder clearPostContent() {
                copyOnWrite();
                ((Content) this.instance).clearPostContent();
                return this;
            }

            public Builder setPostContentBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setPostContentBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getPostContentType() {
                return ((Content) this.instance).getPostContentType();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getPostContentTypeBytes() {
                return ((Content) this.instance).getPostContentTypeBytes();
            }

            public Builder setPostContentType(String value) {
                copyOnWrite();
                ((Content) this.instance).setPostContentType(value);
                return this;
            }

            public Builder clearPostContentType() {
                copyOnWrite();
                ((Content) this.instance).clearPostContentType();
                return this;
            }

            public Builder setPostContentTypeBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setPostContentTypeBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getExpressionId() {
                return ((Content) this.instance).getExpressionId();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getExpressionIdBytes() {
                return ((Content) this.instance).getExpressionIdBytes();
            }

            public Builder setExpressionId(String value) {
                copyOnWrite();
                ((Content) this.instance).setExpressionId(value);
                return this;
            }

            public Builder clearExpressionId() {
                copyOnWrite();
                ((Content) this.instance).clearExpressionId();
                return this;
            }

            public Builder setExpressionIdBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setExpressionIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getQuoteImageUrl() {
                return ((Content) this.instance).getQuoteImageUrl();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getQuoteImageUrlBytes() {
                return ((Content) this.instance).getQuoteImageUrlBytes();
            }

            public Builder setQuoteImageUrl(String value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteImageUrl(value);
                return this;
            }

            public Builder clearQuoteImageUrl() {
                copyOnWrite();
                ((Content) this.instance).clearQuoteImageUrl();
                return this;
            }

            public Builder setQuoteImageUrlBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteImageUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getQuoteImageName() {
                return ((Content) this.instance).getQuoteImageName();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getQuoteImageNameBytes() {
                return ((Content) this.instance).getQuoteImageNameBytes();
            }

            public Builder setQuoteImageName(String value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteImageName(value);
                return this;
            }

            public Builder clearQuoteImageName() {
                copyOnWrite();
                ((Content) this.instance).clearQuoteImageName();
                return this;
            }

            public Builder setQuoteImageNameBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteImageNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public long getFileSize() {
                return ((Content) this.instance).getFileSize();
            }

            public Builder setFileSize(long value) {
                copyOnWrite();
                ((Content) this.instance).setFileSize(value);
                return this;
            }

            public Builder clearFileSize() {
                copyOnWrite();
                ((Content) this.instance).clearFileSize();
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getVideoUrl() {
                return ((Content) this.instance).getVideoUrl();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getVideoUrlBytes() {
                return ((Content) this.instance).getVideoUrlBytes();
            }

            public Builder setVideoUrl(String value) {
                copyOnWrite();
                ((Content) this.instance).setVideoUrl(value);
                return this;
            }

            public Builder clearVideoUrl() {
                copyOnWrite();
                ((Content) this.instance).clearVideoUrl();
                return this;
            }

            public Builder setVideoUrlBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setVideoUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getAudioUrl() {
                return ((Content) this.instance).getAudioUrl();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getAudioUrlBytes() {
                return ((Content) this.instance).getAudioUrlBytes();
            }

            public Builder setAudioUrl(String value) {
                copyOnWrite();
                ((Content) this.instance).setAudioUrl(value);
                return this;
            }

            public Builder clearAudioUrl() {
                copyOnWrite();
                ((Content) this.instance).clearAudioUrl();
                return this;
            }

            public Builder setAudioUrlBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setAudioUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public long getAudioTime() {
                return ((Content) this.instance).getAudioTime();
            }

            public Builder setAudioTime(long value) {
                copyOnWrite();
                ((Content) this.instance).setAudioTime(value);
                return this;
            }

            public Builder clearAudioTime() {
                copyOnWrite();
                ((Content) this.instance).clearAudioTime();
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getQuoteVideoUrl() {
                return ((Content) this.instance).getQuoteVideoUrl();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getQuoteVideoUrlBytes() {
                return ((Content) this.instance).getQuoteVideoUrlBytes();
            }

            public Builder setQuoteVideoUrl(String value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteVideoUrl(value);
                return this;
            }

            public Builder clearQuoteVideoUrl() {
                copyOnWrite();
                ((Content) this.instance).clearQuoteVideoUrl();
                return this;
            }

            public Builder setQuoteVideoUrlBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteVideoUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public long getQuoteVideoTime() {
                return ((Content) this.instance).getQuoteVideoTime();
            }

            public Builder setQuoteVideoTime(long value) {
                copyOnWrite();
                ((Content) this.instance).setQuoteVideoTime(value);
                return this;
            }

            public Builder clearQuoteVideoTime() {
                copyOnWrite();
                ((Content) this.instance).clearQuoteVideoTime();
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public long getStickerItemId() {
                return ((Content) this.instance).getStickerItemId();
            }

            public Builder setStickerItemId(long value) {
                copyOnWrite();
                ((Content) this.instance).setStickerItemId(value);
                return this;
            }

            public Builder clearStickerItemId() {
                copyOnWrite();
                ((Content) this.instance).clearStickerItemId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public long getStickerPackId() {
                return ((Content) this.instance).getStickerPackId();
            }

            public Builder setStickerPackId(long value) {
                copyOnWrite();
                ((Content) this.instance).setStickerPackId(value);
                return this;
            }

            public Builder clearStickerPackId() {
                copyOnWrite();
                ((Content) this.instance).clearStickerPackId();
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getCallText() {
                return ((Content) this.instance).getCallText();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getCallTextBytes() {
                return ((Content) this.instance).getCallTextBytes();
            }

            public Builder setCallText(String value) {
                copyOnWrite();
                ((Content) this.instance).setCallText(value);
                return this;
            }

            public Builder clearCallText() {
                copyOnWrite();
                ((Content) this.instance).clearCallText();
                return this;
            }

            public Builder setCallTextBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setCallTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getCallStatusText() {
                return ((Content) this.instance).getCallStatusText();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getCallStatusTextBytes() {
                return ((Content) this.instance).getCallStatusTextBytes();
            }

            public Builder setCallStatusText(String value) {
                copyOnWrite();
                ((Content) this.instance).setCallStatusText(value);
                return this;
            }

            public Builder clearCallStatusText() {
                copyOnWrite();
                ((Content) this.instance).clearCallStatusText();
                return this;
            }

            public Builder setCallStatusTextBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setCallStatusTextBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public long getWidth() {
                return ((Content) this.instance).getWidth();
            }

            public Builder setWidth(long value) {
                copyOnWrite();
                ((Content) this.instance).setWidth(value);
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((Content) this.instance).clearWidth();
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public long getHeight() {
                return ((Content) this.instance).getHeight();
            }

            public Builder setHeight(long value) {
                copyOnWrite();
                ((Content) this.instance).setHeight(value);
                return this;
            }

            public Builder clearHeight() {
                copyOnWrite();
                ((Content) this.instance).clearHeight();
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public String getTip() {
                return ((Content) this.instance).getTip();
            }

            @Override // com.yhchat.canarys.proto.Msg.ContentOrBuilder
            public ByteString getTipBytes() {
                return ((Content) this.instance).getTipBytes();
            }

            public Builder setTip(String value) {
                copyOnWrite();
                ((Content) this.instance).setTip(value);
                return this;
            }

            public Builder clearTip() {
                copyOnWrite();
                ((Content) this.instance).clearTip();
                return this;
            }

            public Builder setTipBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setTipBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Content();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"text_", "buttons_", "imageUrl_", "fileName_", "fileUrl_", "form_", "quoteMsgText_", "stickerUrl_", "postId_", "postTitle_", "postContent_", "postContentType_", "expressionId_", "quoteImageUrl_", "quoteImageName_", "fileSize_", "videoUrl_", "audioUrl_", "audioTime_", "quoteVideoUrl_", "quoteVideoTime_", "stickerItemId_", "stickerPackId_", "callText_", "callStatusText_", "width_", "height_", "tip_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u001c\u0000\u0000\u0001%\u001c\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0004\u0208\u0005\u0208\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u0208\r\u0208\u000f\u0208\u0010\u0208\u0011\u0208\u0012\u0002\u0013\u0208\u0015\u0208\u0016\u0002\u0017\u0208\u0018\u0002\u0019\u0002\u001a\u0002\u001d\u0208 \u0208!\u0002\"\u0002%\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Content> parser = PARSER;
                    if (parser == null) {
                        synchronized (Content.class) {
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
            Content defaultInstance = new Content();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Content.class, defaultInstance);
        }

        public static Content getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Content> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class Sender extends GeneratedMessageLite<Sender, Builder> implements SenderOrBuilder {
        public static final int AVATAR_URL_FIELD_NUMBER = 4;
        public static final int CHAT_ID_FIELD_NUMBER = 1;
        public static final int CHAT_TYPE_FIELD_NUMBER = 2;
        private static final Sender DEFAULT_INSTANCE;
        public static final int NAME_FIELD_NUMBER = 3;
        private static volatile Parser<Sender> PARSER = null;
        public static final int TAG_FIELD_NUMBER = 7;
        public static final int TAG_OLD_FIELD_NUMBER = 6;
        private int chatType_;
        private String chatId_ = "";
        private String name_ = "";
        private String avatarUrl_ = "";
        private Internal.ProtobufList<String> tagOld_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.ProtobufList<Tag> tag_ = emptyProtobufList();

        private Sender() {
        }

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
        public String getChatId() {
            return this.chatId_;
        }

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
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

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
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

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
        public String getName() {
            return this.name_;
        }

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
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

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
        public String getAvatarUrl() {
            return this.avatarUrl_;
        }

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
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

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
        public List<String> getTagOldList() {
            return this.tagOld_;
        }

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
        public int getTagOldCount() {
            return this.tagOld_.size();
        }

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
        public String getTagOld(int index) {
            return this.tagOld_.get(index);
        }

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
        public ByteString getTagOldBytes(int index) {
            return ByteString.copyFromUtf8(this.tagOld_.get(index));
        }

        private void ensureTagOldIsMutable() {
            Internal.ProtobufList<String> tmp = this.tagOld_;
            if (!tmp.isModifiable()) {
                this.tagOld_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTagOld(int index, String value) {
            value.getClass();
            ensureTagOldIsMutable();
            this.tagOld_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagOld(String value) {
            value.getClass();
            ensureTagOldIsMutable();
            this.tagOld_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTagOld(Iterable<String> values) {
            ensureTagOldIsMutable();
            AbstractMessageLite.addAll(values, this.tagOld_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTagOld() {
            this.tagOld_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTagOldBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            ensureTagOldIsMutable();
            this.tagOld_.add(value.toStringUtf8());
        }

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
        public List<Tag> getTagList() {
            return this.tag_;
        }

        public List<? extends TagOrBuilder> getTagOrBuilderList() {
            return this.tag_;
        }

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
        public int getTagCount() {
            return this.tag_.size();
        }

        @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
        public Tag getTag(int index) {
            return this.tag_.get(index);
        }

        public TagOrBuilder getTagOrBuilder(int index) {
            return this.tag_.get(index);
        }

        private void ensureTagIsMutable() {
            Internal.ProtobufList<Tag> tmp = this.tag_;
            if (!tmp.isModifiable()) {
                this.tag_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTag(int index, Tag value) {
            value.getClass();
            ensureTagIsMutable();
            this.tag_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTag(Tag value) {
            value.getClass();
            ensureTagIsMutable();
            this.tag_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTag(int index, Tag value) {
            value.getClass();
            ensureTagIsMutable();
            this.tag_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTag(Iterable<? extends Tag> values) {
            ensureTagIsMutable();
            AbstractMessageLite.addAll(values, this.tag_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTag() {
            this.tag_ = emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeTag(int index) {
            ensureTagIsMutable();
            this.tag_.remove(index);
        }

        public static Sender parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Sender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Sender parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Sender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Sender parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Sender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Sender parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Sender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Sender parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Sender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Sender parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Sender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Sender parseFrom(InputStream input) throws IOException {
            return (Sender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Sender parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Sender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Sender parseDelimitedFrom(InputStream input) throws IOException {
            return (Sender) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Sender parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Sender) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Sender parseFrom(CodedInputStream input) throws IOException {
            return (Sender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Sender parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Sender) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Sender prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Sender, Builder> implements SenderOrBuilder {
            private Builder() {
                super(Sender.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public String getChatId() {
                return ((Sender) this.instance).getChatId();
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public ByteString getChatIdBytes() {
                return ((Sender) this.instance).getChatIdBytes();
            }

            public Builder setChatId(String value) {
                copyOnWrite();
                ((Sender) this.instance).setChatId(value);
                return this;
            }

            public Builder clearChatId() {
                copyOnWrite();
                ((Sender) this.instance).clearChatId();
                return this;
            }

            public Builder setChatIdBytes(ByteString value) {
                copyOnWrite();
                ((Sender) this.instance).setChatIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public int getChatType() {
                return ((Sender) this.instance).getChatType();
            }

            public Builder setChatType(int value) {
                copyOnWrite();
                ((Sender) this.instance).setChatType(value);
                return this;
            }

            public Builder clearChatType() {
                copyOnWrite();
                ((Sender) this.instance).clearChatType();
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public String getName() {
                return ((Sender) this.instance).getName();
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public ByteString getNameBytes() {
                return ((Sender) this.instance).getNameBytes();
            }

            public Builder setName(String value) {
                copyOnWrite();
                ((Sender) this.instance).setName(value);
                return this;
            }

            public Builder clearName() {
                copyOnWrite();
                ((Sender) this.instance).clearName();
                return this;
            }

            public Builder setNameBytes(ByteString value) {
                copyOnWrite();
                ((Sender) this.instance).setNameBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public String getAvatarUrl() {
                return ((Sender) this.instance).getAvatarUrl();
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public ByteString getAvatarUrlBytes() {
                return ((Sender) this.instance).getAvatarUrlBytes();
            }

            public Builder setAvatarUrl(String value) {
                copyOnWrite();
                ((Sender) this.instance).setAvatarUrl(value);
                return this;
            }

            public Builder clearAvatarUrl() {
                copyOnWrite();
                ((Sender) this.instance).clearAvatarUrl();
                return this;
            }

            public Builder setAvatarUrlBytes(ByteString value) {
                copyOnWrite();
                ((Sender) this.instance).setAvatarUrlBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public List<String> getTagOldList() {
                return Collections.unmodifiableList(((Sender) this.instance).getTagOldList());
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public int getTagOldCount() {
                return ((Sender) this.instance).getTagOldCount();
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public String getTagOld(int index) {
                return ((Sender) this.instance).getTagOld(index);
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public ByteString getTagOldBytes(int index) {
                return ((Sender) this.instance).getTagOldBytes(index);
            }

            public Builder setTagOld(int index, String value) {
                copyOnWrite();
                ((Sender) this.instance).setTagOld(index, value);
                return this;
            }

            public Builder addTagOld(String value) {
                copyOnWrite();
                ((Sender) this.instance).addTagOld(value);
                return this;
            }

            public Builder addAllTagOld(Iterable<String> values) {
                copyOnWrite();
                ((Sender) this.instance).addAllTagOld(values);
                return this;
            }

            public Builder clearTagOld() {
                copyOnWrite();
                ((Sender) this.instance).clearTagOld();
                return this;
            }

            public Builder addTagOldBytes(ByteString value) {
                copyOnWrite();
                ((Sender) this.instance).addTagOldBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public List<Tag> getTagList() {
                return Collections.unmodifiableList(((Sender) this.instance).getTagList());
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public int getTagCount() {
                return ((Sender) this.instance).getTagCount();
            }

            @Override // com.yhchat.canarys.proto.Msg.SenderOrBuilder
            public Tag getTag(int index) {
                return ((Sender) this.instance).getTag(index);
            }

            public Builder setTag(int index, Tag value) {
                copyOnWrite();
                ((Sender) this.instance).setTag(index, value);
                return this;
            }

            public Builder setTag(int index, Tag.Builder builderForValue) {
                copyOnWrite();
                ((Sender) this.instance).setTag(index, builderForValue.build());
                return this;
            }

            public Builder addTag(Tag value) {
                copyOnWrite();
                ((Sender) this.instance).addTag(value);
                return this;
            }

            public Builder addTag(int index, Tag value) {
                copyOnWrite();
                ((Sender) this.instance).addTag(index, value);
                return this;
            }

            public Builder addTag(Tag.Builder builderForValue) {
                copyOnWrite();
                ((Sender) this.instance).addTag(builderForValue.build());
                return this;
            }

            public Builder addTag(int index, Tag.Builder builderForValue) {
                copyOnWrite();
                ((Sender) this.instance).addTag(index, builderForValue.build());
                return this;
            }

            public Builder addAllTag(Iterable<? extends Tag> values) {
                copyOnWrite();
                ((Sender) this.instance).addAllTag(values);
                return this;
            }

            public Builder clearTag() {
                copyOnWrite();
                ((Sender) this.instance).clearTag();
                return this;
            }

            public Builder removeTag(int index) {
                copyOnWrite();
                ((Sender) this.instance).removeTag(index);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Sender();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"chatId_", "chatType_", "name_", "avatarUrl_", "tagOld_", "tag_", Tag.class};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0007\u0006\u0000\u0002\u0000\u0001\u0208\u0002\u0004\u0003\u0208\u0004\u0208\u0006\u021a\u0007\u001b", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Sender> parser = PARSER;
                    if (parser == null) {
                        synchronized (Sender.class) {
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
            Sender defaultInstance = new Sender();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Sender.class, defaultInstance);
        }

        public static Sender getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Sender> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public String getMsgId() {
        return this.msgId_;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public ByteString getMsgIdBytes() {
        return ByteString.copyFromUtf8(this.msgId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgId(String value) {
        value.getClass();
        this.msgId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgId() {
        this.msgId_ = getDefaultInstance().getMsgId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.msgId_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public boolean hasSender() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public Sender getSender() {
        return this.sender_ == null ? Sender.getDefaultInstance() : this.sender_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSender(Sender value) {
        value.getClass();
        this.sender_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSender(Sender value) {
        value.getClass();
        if (this.sender_ != null && this.sender_ != Sender.getDefaultInstance()) {
            this.sender_ = Sender.newBuilder(this.sender_).mergeFrom((Sender.Builder) value).buildPartial();
        } else {
            this.sender_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSender() {
        this.sender_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public String getDirection() {
        return this.direction_;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public ByteString getDirectionBytes() {
        return ByteString.copyFromUtf8(this.direction_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirection(String value) {
        value.getClass();
        this.direction_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDirection() {
        this.direction_ = getDefaultInstance().getDirection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDirectionBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.direction_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
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

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public boolean hasContent() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public Content getContent() {
        return this.content_ == null ? Content.getDefaultInstance() : this.content_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(Content value) {
        value.getClass();
        this.content_ = value;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContent(Content value) {
        value.getClass();
        if (this.content_ != null && this.content_ != Content.getDefaultInstance()) {
            this.content_ = Content.newBuilder(this.content_).mergeFrom((Content.Builder) value).buildPartial();
        } else {
            this.content_ = value;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -3;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public long getSendTime() {
        return this.sendTime_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSendTime(long value) {
        this.sendTime_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSendTime() {
        this.sendTime_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public boolean hasCmd() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public Cmd getCmd() {
        return this.cmd_ == null ? Cmd.getDefaultInstance() : this.cmd_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCmd(Cmd value) {
        value.getClass();
        this.cmd_ = value;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCmd(Cmd value) {
        value.getClass();
        if (this.cmd_ != null && this.cmd_ != Cmd.getDefaultInstance()) {
            this.cmd_ = Cmd.newBuilder(this.cmd_).mergeFrom((Cmd.Builder) value).buildPartial();
        } else {
            this.cmd_ = value;
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCmd() {
        this.cmd_ = null;
        this.bitField0_ &= -5;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public long getMsgDeleteTime() {
        return this.msgDeleteTime_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMsgDeleteTime(long value) {
        this.msgDeleteTime_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMsgDeleteTime() {
        this.msgDeleteTime_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public String getQuoteMsgId() {
        return this.quoteMsgId_;
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public ByteString getQuoteMsgIdBytes() {
        return ByteString.copyFromUtf8(this.quoteMsgId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuoteMsgId(String value) {
        value.getClass();
        this.quoteMsgId_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuoteMsgId() {
        this.quoteMsgId_ = getDefaultInstance().getQuoteMsgId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuoteMsgIdBytes(ByteString value) {
        checkByteStringIsUtf8(value);
        this.quoteMsgId_ = value.toStringUtf8();
    }

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
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

    @Override // com.yhchat.canarys.proto.MsgOrBuilder
    public long getEditTime() {
        return this.editTime_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEditTime(long value) {
        this.editTime_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEditTime() {
        this.editTime_ = 0L;
    }

    public static Msg parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Msg parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Msg parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Msg parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Msg parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static Msg parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static Msg parseFrom(InputStream input) throws IOException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Msg parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Msg parseDelimitedFrom(InputStream input) throws IOException {
        return (Msg) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static Msg parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Msg) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Msg parseFrom(CodedInputStream input) throws IOException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static Msg parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (Msg) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(Msg prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<Msg, Builder> implements MsgOrBuilder {
        private Builder() {
            super(Msg.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public String getMsgId() {
            return ((Msg) this.instance).getMsgId();
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public ByteString getMsgIdBytes() {
            return ((Msg) this.instance).getMsgIdBytes();
        }

        public Builder setMsgId(String value) {
            copyOnWrite();
            ((Msg) this.instance).setMsgId(value);
            return this;
        }

        public Builder clearMsgId() {
            copyOnWrite();
            ((Msg) this.instance).clearMsgId();
            return this;
        }

        public Builder setMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((Msg) this.instance).setMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public boolean hasSender() {
            return ((Msg) this.instance).hasSender();
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public Sender getSender() {
            return ((Msg) this.instance).getSender();
        }

        public Builder setSender(Sender value) {
            copyOnWrite();
            ((Msg) this.instance).setSender(value);
            return this;
        }

        public Builder setSender(Sender.Builder builderForValue) {
            copyOnWrite();
            ((Msg) this.instance).setSender(builderForValue.build());
            return this;
        }

        public Builder mergeSender(Sender value) {
            copyOnWrite();
            ((Msg) this.instance).mergeSender(value);
            return this;
        }

        public Builder clearSender() {
            copyOnWrite();
            ((Msg) this.instance).clearSender();
            return this;
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public String getDirection() {
            return ((Msg) this.instance).getDirection();
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public ByteString getDirectionBytes() {
            return ((Msg) this.instance).getDirectionBytes();
        }

        public Builder setDirection(String value) {
            copyOnWrite();
            ((Msg) this.instance).setDirection(value);
            return this;
        }

        public Builder clearDirection() {
            copyOnWrite();
            ((Msg) this.instance).clearDirection();
            return this;
        }

        public Builder setDirectionBytes(ByteString value) {
            copyOnWrite();
            ((Msg) this.instance).setDirectionBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public int getContentType() {
            return ((Msg) this.instance).getContentType();
        }

        public Builder setContentType(int value) {
            copyOnWrite();
            ((Msg) this.instance).setContentType(value);
            return this;
        }

        public Builder clearContentType() {
            copyOnWrite();
            ((Msg) this.instance).clearContentType();
            return this;
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public boolean hasContent() {
            return ((Msg) this.instance).hasContent();
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public Content getContent() {
            return ((Msg) this.instance).getContent();
        }

        public Builder setContent(Content value) {
            copyOnWrite();
            ((Msg) this.instance).setContent(value);
            return this;
        }

        public Builder setContent(Content.Builder builderForValue) {
            copyOnWrite();
            ((Msg) this.instance).setContent(builderForValue.build());
            return this;
        }

        public Builder mergeContent(Content value) {
            copyOnWrite();
            ((Msg) this.instance).mergeContent(value);
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((Msg) this.instance).clearContent();
            return this;
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public long getSendTime() {
            return ((Msg) this.instance).getSendTime();
        }

        public Builder setSendTime(long value) {
            copyOnWrite();
            ((Msg) this.instance).setSendTime(value);
            return this;
        }

        public Builder clearSendTime() {
            copyOnWrite();
            ((Msg) this.instance).clearSendTime();
            return this;
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public boolean hasCmd() {
            return ((Msg) this.instance).hasCmd();
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public Cmd getCmd() {
            return ((Msg) this.instance).getCmd();
        }

        public Builder setCmd(Cmd value) {
            copyOnWrite();
            ((Msg) this.instance).setCmd(value);
            return this;
        }

        public Builder setCmd(Cmd.Builder builderForValue) {
            copyOnWrite();
            ((Msg) this.instance).setCmd(builderForValue.build());
            return this;
        }

        public Builder mergeCmd(Cmd value) {
            copyOnWrite();
            ((Msg) this.instance).mergeCmd(value);
            return this;
        }

        public Builder clearCmd() {
            copyOnWrite();
            ((Msg) this.instance).clearCmd();
            return this;
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public long getMsgDeleteTime() {
            return ((Msg) this.instance).getMsgDeleteTime();
        }

        public Builder setMsgDeleteTime(long value) {
            copyOnWrite();
            ((Msg) this.instance).setMsgDeleteTime(value);
            return this;
        }

        public Builder clearMsgDeleteTime() {
            copyOnWrite();
            ((Msg) this.instance).clearMsgDeleteTime();
            return this;
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public String getQuoteMsgId() {
            return ((Msg) this.instance).getQuoteMsgId();
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public ByteString getQuoteMsgIdBytes() {
            return ((Msg) this.instance).getQuoteMsgIdBytes();
        }

        public Builder setQuoteMsgId(String value) {
            copyOnWrite();
            ((Msg) this.instance).setQuoteMsgId(value);
            return this;
        }

        public Builder clearQuoteMsgId() {
            copyOnWrite();
            ((Msg) this.instance).clearQuoteMsgId();
            return this;
        }

        public Builder setQuoteMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((Msg) this.instance).setQuoteMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public long getMsgSeq() {
            return ((Msg) this.instance).getMsgSeq();
        }

        public Builder setMsgSeq(long value) {
            copyOnWrite();
            ((Msg) this.instance).setMsgSeq(value);
            return this;
        }

        public Builder clearMsgSeq() {
            copyOnWrite();
            ((Msg) this.instance).clearMsgSeq();
            return this;
        }

        @Override // com.yhchat.canarys.proto.MsgOrBuilder
        public long getEditTime() {
            return ((Msg) this.instance).getEditTime();
        }

        public Builder setEditTime(long value) {
            copyOnWrite();
            ((Msg) this.instance).setEditTime(value);
            return this;
        }

        public Builder clearEditTime() {
            copyOnWrite();
            ((Msg) this.instance).clearEditTime();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new Msg();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "msgId_", "sender_", "direction_", "contentType_", "content_", "sendTime_", "cmd_", "msgDeleteTime_", "quoteMsgId_", "msgSeq_", "editTime_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0001\f\u000b\u0000\u0000\u0000\u0001\u0208\u0002\u1009\u0000\u0003\u0208\u0004\u0004\u0005\u1009\u0001\u0006\u0002\u0007\u1009\u0002\b\u0002\t\u0208\n\u0002\f\u0002", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<Msg> parser = PARSER;
                if (parser == null) {
                    synchronized (Msg.class) {
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
        Msg defaultInstance = new Msg();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(Msg.class, defaultInstance);
    }

    public static Msg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<Msg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
