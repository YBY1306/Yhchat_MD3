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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
public final class send_message_send extends GeneratedMessageLite<send_message_send, Builder> implements send_message_sendOrBuilder {
    public static final int CHAT_ID_FIELD_NUMBER = 3;
    public static final int CHAT_TYPE_FIELD_NUMBER = 4;
    public static final int COMMAND_ID_FIELD_NUMBER = 7;
    public static final int CONTENT_FIELD_NUMBER = 5;
    public static final int CONTENT_TYPE_FIELD_NUMBER = 6;
    private static final send_message_send DEFAULT_INSTANCE;
    public static final int MEDIA_FIELD_NUMBER = 9;
    public static final int MSG_ID_FIELD_NUMBER = 2;
    private static volatile Parser<send_message_send> PARSER = null;
    public static final int QUOTE_MSG_ID_FIELD_NUMBER = 8;
    private int bitField0_;
    private long chatType_;
    private long commandId_;
    private long contentType_;
    private Content content_;
    private Media media_;
    private String msgId_ = "";
    private String chatId_ = "";
    private String quoteMsgId_ = "";

    public interface ContentOrBuilder extends MessageLiteOrBuilder {
        String getAudio();

        ByteString getAudioBytes();

        long getAudioTime();

        String getButtons();

        ByteString getButtonsBytes();

        String getExpressionId();

        ByteString getExpressionIdBytes();

        String getFile();

        ByteString getFileBytes();

        String getFileName();

        ByteString getFileNameBytes();

        long getFileSize();

        String getForm();

        ByteString getFormBytes();

        String getImage();

        ByteString getImageBytes();

        String getMentionedId(int index);

        ByteString getMentionedIdBytes(int index);

        int getMentionedIdCount();

        List<String> getMentionedIdList();

        String getPostContent();

        ByteString getPostContentBytes();

        String getPostId();

        ByteString getPostIdBytes();

        String getPostTitle();

        ByteString getPostTitleBytes();

        String getPostType();

        ByteString getPostTypeBytes();

        String getQuoteImageName();

        ByteString getQuoteImageNameBytes();

        String getQuoteImageUrl();

        ByteString getQuoteImageUrlBytes();

        String getQuoteMsgText();

        ByteString getQuoteMsgTextBytes();

        long getQuoteVideoTime();

        String getQuoteVideoUrl();

        ByteString getQuoteVideoUrlBytes();

        String getRoomName();

        ByteString getRoomNameBytes();

        long getStickerItemId();

        long getStickerPackId();

        String getText();

        ByteString getTextBytes();

        String getVideo();

        ByteString getVideoBytes();
    }

    public interface MediaOrBuilder extends MessageLiteOrBuilder {
        String getFileHash();

        ByteString getFileHashBytes();

        String getFileKey();

        String getFileKey2();

        ByteString getFileKey2Bytes();

        ByteString getFileKeyBytes();

        long getFileSize();

        String getFileSuffix();

        ByteString getFileSuffixBytes();

        String getFileType();

        ByteString getFileTypeBytes();

        long getImageHeight();

        long getImageWidth();
    }

    private send_message_send() {
    }

    public static final class Content extends GeneratedMessageLite<Content, Builder> implements ContentOrBuilder {
        public static final int AUDIO_FIELD_NUMBER = 21;
        public static final int AUDIO_TIME_FIELD_NUMBER = 22;
        public static final int BUTTONS_FIELD_NUMBER = 2;
        private static final Content DEFAULT_INSTANCE;
        public static final int EXPRESSION_ID_FIELD_NUMBER = 15;
        public static final int FILE_FIELD_NUMBER = 5;
        public static final int FILE_NAME_FIELD_NUMBER = 4;
        public static final int FILE_SIZE_FIELD_NUMBER = 18;
        public static final int FORM_FIELD_NUMBER = 7;
        public static final int IMAGE_FIELD_NUMBER = 9;
        public static final int MENTIONED_ID_FIELD_NUMBER = 6;
        private static volatile Parser<Content> PARSER = null;
        public static final int POST_CONTENT_FIELD_NUMBER = 12;
        public static final int POST_ID_FIELD_NUMBER = 10;
        public static final int POST_TITLE_FIELD_NUMBER = 11;
        public static final int POST_TYPE_FIELD_NUMBER = 13;
        public static final int QUOTE_IMAGE_NAME_FIELD_NUMBER = 17;
        public static final int QUOTE_IMAGE_URL_FIELD_NUMBER = 16;
        public static final int QUOTE_MSG_TEXT_FIELD_NUMBER = 8;
        public static final int QUOTE_VIDEO_TIME_FIELD_NUMBER = 24;
        public static final int QUOTE_VIDEO_URL_FIELD_NUMBER = 23;
        public static final int ROOM_NAME_FIELD_NUMBER = 29;
        public static final int STICKER_ITEM_ID_FIELD_NUMBER = 25;
        public static final int STICKER_PACK_ID_FIELD_NUMBER = 26;
        public static final int TEXT_FIELD_NUMBER = 1;
        public static final int VIDEO_FIELD_NUMBER = 19;
        private long audioTime_;
        private long fileSize_;
        private long quoteVideoTime_;
        private long stickerItemId_;
        private long stickerPackId_;
        private String text_ = "";
        private String buttons_ = "";
        private String fileName_ = "";
        private String file_ = "";
        private Internal.ProtobufList<String> mentionedId_ = GeneratedMessageLite.emptyProtobufList();
        private String form_ = "";
        private String quoteMsgText_ = "";
        private String image_ = "";
        private String postId_ = "";
        private String postTitle_ = "";
        private String postContent_ = "";
        private String postType_ = "";
        private String expressionId_ = "";
        private String quoteImageUrl_ = "";
        private String quoteImageName_ = "";
        private String video_ = "";
        private String audio_ = "";
        private String quoteVideoUrl_ = "";
        private String roomName_ = "";

        private Content() {
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getText() {
            return this.text_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getButtons() {
            return this.buttons_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getFileName() {
            return this.fileName_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getFile() {
            return this.file_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public ByteString getFileBytes() {
            return ByteString.copyFromUtf8(this.file_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFile(String value) {
            value.getClass();
            this.file_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFile() {
            this.file_ = getDefaultInstance().getFile();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.file_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public List<String> getMentionedIdList() {
            return this.mentionedId_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public int getMentionedIdCount() {
            return this.mentionedId_.size();
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getMentionedId(int index) {
            return this.mentionedId_.get(index);
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public ByteString getMentionedIdBytes(int index) {
            return ByteString.copyFromUtf8(this.mentionedId_.get(index));
        }

        private void ensureMentionedIdIsMutable() {
            Internal.ProtobufList<String> tmp = this.mentionedId_;
            if (!tmp.isModifiable()) {
                this.mentionedId_ = GeneratedMessageLite.mutableCopy(tmp);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMentionedId(int index, String value) {
            value.getClass();
            ensureMentionedIdIsMutable();
            this.mentionedId_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMentionedId(String value) {
            value.getClass();
            ensureMentionedIdIsMutable();
            this.mentionedId_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMentionedId(Iterable<String> values) {
            ensureMentionedIdIsMutable();
            AbstractMessageLite.addAll(values, this.mentionedId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMentionedId() {
            this.mentionedId_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMentionedIdBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            ensureMentionedIdIsMutable();
            this.mentionedId_.add(value.toStringUtf8());
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getForm() {
            return this.form_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getQuoteMsgText() {
            return this.quoteMsgText_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getImage() {
            return this.image_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public ByteString getImageBytes() {
            return ByteString.copyFromUtf8(this.image_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImage(String value) {
            value.getClass();
            this.image_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImage() {
            this.image_ = getDefaultInstance().getImage();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.image_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getPostId() {
            return this.postId_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getPostTitle() {
            return this.postTitle_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getPostContent() {
            return this.postContent_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getPostType() {
            return this.postType_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public ByteString getPostTypeBytes() {
            return ByteString.copyFromUtf8(this.postType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPostType(String value) {
            value.getClass();
            this.postType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPostType() {
            this.postType_ = getDefaultInstance().getPostType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPostTypeBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.postType_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getExpressionId() {
            return this.expressionId_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getQuoteImageUrl() {
            return this.quoteImageUrl_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getQuoteImageName() {
            return this.quoteImageName_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getVideo() {
            return this.video_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public ByteString getVideoBytes() {
            return ByteString.copyFromUtf8(this.video_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideo(String value) {
            value.getClass();
            this.video_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVideo() {
            this.video_ = getDefaultInstance().getVideo();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVideoBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.video_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getAudio() {
            return this.audio_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public ByteString getAudioBytes() {
            return ByteString.copyFromUtf8(this.audio_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudio(String value) {
            value.getClass();
            this.audio_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAudio() {
            this.audio_ = getDefaultInstance().getAudio();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAudioBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.audio_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getQuoteVideoUrl() {
            return this.quoteVideoUrl_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public String getRoomName() {
            return this.roomName_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
        public ByteString getRoomNameBytes() {
            return ByteString.copyFromUtf8(this.roomName_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomName(String value) {
            value.getClass();
            this.roomName_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRoomName() {
            this.roomName_ = getDefaultInstance().getRoomName();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRoomNameBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.roomName_ = value.toStringUtf8();
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getText() {
                return ((Content) this.instance).getText();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getButtons() {
                return ((Content) this.instance).getButtons();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getFileName() {
                return ((Content) this.instance).getFileName();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getFile() {
                return ((Content) this.instance).getFile();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public ByteString getFileBytes() {
                return ((Content) this.instance).getFileBytes();
            }

            public Builder setFile(String value) {
                copyOnWrite();
                ((Content) this.instance).setFile(value);
                return this;
            }

            public Builder clearFile() {
                copyOnWrite();
                ((Content) this.instance).clearFile();
                return this;
            }

            public Builder setFileBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setFileBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public List<String> getMentionedIdList() {
                return Collections.unmodifiableList(((Content) this.instance).getMentionedIdList());
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public int getMentionedIdCount() {
                return ((Content) this.instance).getMentionedIdCount();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getMentionedId(int index) {
                return ((Content) this.instance).getMentionedId(index);
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public ByteString getMentionedIdBytes(int index) {
                return ((Content) this.instance).getMentionedIdBytes(index);
            }

            public Builder setMentionedId(int index, String value) {
                copyOnWrite();
                ((Content) this.instance).setMentionedId(index, value);
                return this;
            }

            public Builder addMentionedId(String value) {
                copyOnWrite();
                ((Content) this.instance).addMentionedId(value);
                return this;
            }

            public Builder addAllMentionedId(Iterable<String> values) {
                copyOnWrite();
                ((Content) this.instance).addAllMentionedId(values);
                return this;
            }

            public Builder clearMentionedId() {
                copyOnWrite();
                ((Content) this.instance).clearMentionedId();
                return this;
            }

            public Builder addMentionedIdBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).addMentionedIdBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getForm() {
                return ((Content) this.instance).getForm();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getQuoteMsgText() {
                return ((Content) this.instance).getQuoteMsgText();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getImage() {
                return ((Content) this.instance).getImage();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public ByteString getImageBytes() {
                return ((Content) this.instance).getImageBytes();
            }

            public Builder setImage(String value) {
                copyOnWrite();
                ((Content) this.instance).setImage(value);
                return this;
            }

            public Builder clearImage() {
                copyOnWrite();
                ((Content) this.instance).clearImage();
                return this;
            }

            public Builder setImageBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setImageBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getPostId() {
                return ((Content) this.instance).getPostId();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getPostTitle() {
                return ((Content) this.instance).getPostTitle();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getPostContent() {
                return ((Content) this.instance).getPostContent();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getPostType() {
                return ((Content) this.instance).getPostType();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public ByteString getPostTypeBytes() {
                return ((Content) this.instance).getPostTypeBytes();
            }

            public Builder setPostType(String value) {
                copyOnWrite();
                ((Content) this.instance).setPostType(value);
                return this;
            }

            public Builder clearPostType() {
                copyOnWrite();
                ((Content) this.instance).clearPostType();
                return this;
            }

            public Builder setPostTypeBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setPostTypeBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getExpressionId() {
                return ((Content) this.instance).getExpressionId();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getQuoteImageUrl() {
                return ((Content) this.instance).getQuoteImageUrl();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getQuoteImageName() {
                return ((Content) this.instance).getQuoteImageName();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getVideo() {
                return ((Content) this.instance).getVideo();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public ByteString getVideoBytes() {
                return ((Content) this.instance).getVideoBytes();
            }

            public Builder setVideo(String value) {
                copyOnWrite();
                ((Content) this.instance).setVideo(value);
                return this;
            }

            public Builder clearVideo() {
                copyOnWrite();
                ((Content) this.instance).clearVideo();
                return this;
            }

            public Builder setVideoBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setVideoBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getAudio() {
                return ((Content) this.instance).getAudio();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public ByteString getAudioBytes() {
                return ((Content) this.instance).getAudioBytes();
            }

            public Builder setAudio(String value) {
                copyOnWrite();
                ((Content) this.instance).setAudio(value);
                return this;
            }

            public Builder clearAudio() {
                copyOnWrite();
                ((Content) this.instance).clearAudio();
                return this;
            }

            public Builder setAudioBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setAudioBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getQuoteVideoUrl() {
                return ((Content) this.instance).getQuoteVideoUrl();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
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

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public String getRoomName() {
                return ((Content) this.instance).getRoomName();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.ContentOrBuilder
            public ByteString getRoomNameBytes() {
                return ((Content) this.instance).getRoomNameBytes();
            }

            public Builder setRoomName(String value) {
                copyOnWrite();
                ((Content) this.instance).setRoomName(value);
                return this;
            }

            public Builder clearRoomName() {
                copyOnWrite();
                ((Content) this.instance).clearRoomName();
                return this;
            }

            public Builder setRoomNameBytes(ByteString value) {
                copyOnWrite();
                ((Content) this.instance).setRoomNameBytes(value);
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
                    Object[] objects = {"text_", "buttons_", "fileName_", "file_", "mentionedId_", "form_", "quoteMsgText_", "image_", "postId_", "postTitle_", "postContent_", "postType_", "expressionId_", "quoteImageUrl_", "quoteImageName_", "fileSize_", "video_", "audio_", "audioTime_", "quoteVideoUrl_", "quoteVideoTime_", "stickerItemId_", "stickerPackId_", "roomName_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0018\u0000\u0000\u0001\u001d\u0018\u0000\u0001\u0000\u0001\u0208\u0002\u0208\u0004\u0208\u0005\u0208\u0006\u021a\u0007\u0208\b\u0208\t\u0208\n\u0208\u000b\u0208\f\u0208\r\u0208\u000f\u0208\u0010\u0208\u0011\u0208\u0012\u0002\u0013\u0208\u0015\u0208\u0016\u0002\u0017\u0208\u0018\u0003\u0019\u0002\u001a\u0002\u001d\u0208", objects);
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

    public static final class Media extends GeneratedMessageLite<Media, Builder> implements MediaOrBuilder {
        private static final Media DEFAULT_INSTANCE;
        public static final int FILE_HASH_FIELD_NUMBER = 2;
        public static final int FILE_KEY2_FIELD_NUMBER = 8;
        public static final int FILE_KEY_FIELD_NUMBER = 1;
        public static final int FILE_SIZE_FIELD_NUMBER = 7;
        public static final int FILE_SUFFIX_FIELD_NUMBER = 9;
        public static final int FILE_TYPE_FIELD_NUMBER = 3;
        public static final int IMAGE_HEIGHT_FIELD_NUMBER = 5;
        public static final int IMAGE_WIDTH_FIELD_NUMBER = 6;
        private static volatile Parser<Media> PARSER;
        private long fileSize_;
        private long imageHeight_;
        private long imageWidth_;
        private String fileKey_ = "";
        private String fileHash_ = "";
        private String fileType_ = "";
        private String fileKey2_ = "";
        private String fileSuffix_ = "";

        private Media() {
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public String getFileKey() {
            return this.fileKey_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public ByteString getFileKeyBytes() {
            return ByteString.copyFromUtf8(this.fileKey_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileKey(String value) {
            value.getClass();
            this.fileKey_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileKey() {
            this.fileKey_ = getDefaultInstance().getFileKey();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileKeyBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.fileKey_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public String getFileHash() {
            return this.fileHash_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public ByteString getFileHashBytes() {
            return ByteString.copyFromUtf8(this.fileHash_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileHash(String value) {
            value.getClass();
            this.fileHash_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileHash() {
            this.fileHash_ = getDefaultInstance().getFileHash();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileHashBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.fileHash_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public String getFileType() {
            return this.fileType_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public ByteString getFileTypeBytes() {
            return ByteString.copyFromUtf8(this.fileType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileType(String value) {
            value.getClass();
            this.fileType_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileType() {
            this.fileType_ = getDefaultInstance().getFileType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileTypeBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.fileType_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public long getImageHeight() {
            return this.imageHeight_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageHeight(long value) {
            this.imageHeight_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageHeight() {
            this.imageHeight_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public long getImageWidth() {
            return this.imageWidth_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setImageWidth(long value) {
            this.imageWidth_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearImageWidth() {
            this.imageWidth_ = 0L;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
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

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public String getFileKey2() {
            return this.fileKey2_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public ByteString getFileKey2Bytes() {
            return ByteString.copyFromUtf8(this.fileKey2_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileKey2(String value) {
            value.getClass();
            this.fileKey2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileKey2() {
            this.fileKey2_ = getDefaultInstance().getFileKey2();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileKey2Bytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.fileKey2_ = value.toStringUtf8();
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public String getFileSuffix() {
            return this.fileSuffix_;
        }

        @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
        public ByteString getFileSuffixBytes() {
            return ByteString.copyFromUtf8(this.fileSuffix_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileSuffix(String value) {
            value.getClass();
            this.fileSuffix_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFileSuffix() {
            this.fileSuffix_ = getDefaultInstance().getFileSuffix();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFileSuffixBytes(ByteString value) {
            checkByteStringIsUtf8(value);
            this.fileSuffix_ = value.toStringUtf8();
        }

        public static Media parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (Media) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Media parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Media) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Media parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (Media) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Media parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Media) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Media parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (Media) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Media parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (Media) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static Media parseFrom(InputStream input) throws IOException {
            return (Media) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Media parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Media) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Media parseDelimitedFrom(InputStream input) throws IOException {
            return (Media) parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static Media parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Media) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Media parseFrom(CodedInputStream input) throws IOException {
            return (Media) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static Media parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (Media) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(Media prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<Media, Builder> implements MediaOrBuilder {
            private Builder() {
                super(Media.DEFAULT_INSTANCE);
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public String getFileKey() {
                return ((Media) this.instance).getFileKey();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public ByteString getFileKeyBytes() {
                return ((Media) this.instance).getFileKeyBytes();
            }

            public Builder setFileKey(String value) {
                copyOnWrite();
                ((Media) this.instance).setFileKey(value);
                return this;
            }

            public Builder clearFileKey() {
                copyOnWrite();
                ((Media) this.instance).clearFileKey();
                return this;
            }

            public Builder setFileKeyBytes(ByteString value) {
                copyOnWrite();
                ((Media) this.instance).setFileKeyBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public String getFileHash() {
                return ((Media) this.instance).getFileHash();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public ByteString getFileHashBytes() {
                return ((Media) this.instance).getFileHashBytes();
            }

            public Builder setFileHash(String value) {
                copyOnWrite();
                ((Media) this.instance).setFileHash(value);
                return this;
            }

            public Builder clearFileHash() {
                copyOnWrite();
                ((Media) this.instance).clearFileHash();
                return this;
            }

            public Builder setFileHashBytes(ByteString value) {
                copyOnWrite();
                ((Media) this.instance).setFileHashBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public String getFileType() {
                return ((Media) this.instance).getFileType();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public ByteString getFileTypeBytes() {
                return ((Media) this.instance).getFileTypeBytes();
            }

            public Builder setFileType(String value) {
                copyOnWrite();
                ((Media) this.instance).setFileType(value);
                return this;
            }

            public Builder clearFileType() {
                copyOnWrite();
                ((Media) this.instance).clearFileType();
                return this;
            }

            public Builder setFileTypeBytes(ByteString value) {
                copyOnWrite();
                ((Media) this.instance).setFileTypeBytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public long getImageHeight() {
                return ((Media) this.instance).getImageHeight();
            }

            public Builder setImageHeight(long value) {
                copyOnWrite();
                ((Media) this.instance).setImageHeight(value);
                return this;
            }

            public Builder clearImageHeight() {
                copyOnWrite();
                ((Media) this.instance).clearImageHeight();
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public long getImageWidth() {
                return ((Media) this.instance).getImageWidth();
            }

            public Builder setImageWidth(long value) {
                copyOnWrite();
                ((Media) this.instance).setImageWidth(value);
                return this;
            }

            public Builder clearImageWidth() {
                copyOnWrite();
                ((Media) this.instance).clearImageWidth();
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public long getFileSize() {
                return ((Media) this.instance).getFileSize();
            }

            public Builder setFileSize(long value) {
                copyOnWrite();
                ((Media) this.instance).setFileSize(value);
                return this;
            }

            public Builder clearFileSize() {
                copyOnWrite();
                ((Media) this.instance).clearFileSize();
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public String getFileKey2() {
                return ((Media) this.instance).getFileKey2();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public ByteString getFileKey2Bytes() {
                return ((Media) this.instance).getFileKey2Bytes();
            }

            public Builder setFileKey2(String value) {
                copyOnWrite();
                ((Media) this.instance).setFileKey2(value);
                return this;
            }

            public Builder clearFileKey2() {
                copyOnWrite();
                ((Media) this.instance).clearFileKey2();
                return this;
            }

            public Builder setFileKey2Bytes(ByteString value) {
                copyOnWrite();
                ((Media) this.instance).setFileKey2Bytes(value);
                return this;
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public String getFileSuffix() {
                return ((Media) this.instance).getFileSuffix();
            }

            @Override // com.yhchat.canarys.proto.send_message_send.MediaOrBuilder
            public ByteString getFileSuffixBytes() {
                return ((Media) this.instance).getFileSuffixBytes();
            }

            public Builder setFileSuffix(String value) {
                copyOnWrite();
                ((Media) this.instance).setFileSuffix(value);
                return this;
            }

            public Builder clearFileSuffix() {
                copyOnWrite();
                ((Media) this.instance).clearFileSuffix();
                return this;
            }

            public Builder setFileSuffixBytes(ByteString value) {
                copyOnWrite();
                ((Media) this.instance).setFileSuffixBytes(value);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            switch (method) {
                case NEW_MUTABLE_INSTANCE:
                    return new Media();
                case NEW_BUILDER:
                    return new Builder();
                case BUILD_MESSAGE_INFO:
                    Object[] objects = {"fileKey_", "fileHash_", "fileType_", "imageHeight_", "imageWidth_", "fileSize_", "fileKey2_", "fileSuffix_"};
                    return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0000\u0001\t\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208\u0005\u0002\u0006\u0002\u0007\u0002\b\u0208\t\u0208", objects);
                case GET_DEFAULT_INSTANCE:
                    return DEFAULT_INSTANCE;
                case GET_PARSER:
                    Parser<Media> parser = PARSER;
                    if (parser == null) {
                        synchronized (Media.class) {
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
            Media defaultInstance = new Media();
            DEFAULT_INSTANCE = defaultInstance;
            GeneratedMessageLite.registerDefaultInstance(Media.class, defaultInstance);
        }

        public static Media getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<Media> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
    public String getMsgId() {
        return this.msgId_;
    }

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
    public String getChatId() {
        return this.chatId_;
    }

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
    public long getChatType() {
        return this.chatType_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChatType(long value) {
        this.chatType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChatType() {
        this.chatType_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
    public boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
    public Content getContent() {
        return this.content_ == null ? Content.getDefaultInstance() : this.content_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(Content value) {
        value.getClass();
        this.content_ = value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContent(Content value) {
        value.getClass();
        if (this.content_ != null && this.content_ != Content.getDefaultInstance()) {
            this.content_ = Content.newBuilder(this.content_).mergeFrom((Content.Builder) value).buildPartial();
        } else {
            this.content_ = value;
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -2;
    }

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
    public long getContentType() {
        return this.contentType_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentType(long value) {
        this.contentType_ = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContentType() {
        this.contentType_ = 0L;
    }

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
    public String getQuoteMsgId() {
        return this.quoteMsgId_;
    }

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
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

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
    public boolean hasMedia() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
    public Media getMedia() {
        return this.media_ == null ? Media.getDefaultInstance() : this.media_;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMedia(Media value) {
        value.getClass();
        this.media_ = value;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMedia(Media value) {
        value.getClass();
        if (this.media_ != null && this.media_ != Media.getDefaultInstance()) {
            this.media_ = Media.newBuilder(this.media_).mergeFrom((Media.Builder) value).buildPartial();
        } else {
            this.media_ = value;
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMedia() {
        this.media_ = null;
        this.bitField0_ &= -3;
    }

    public static send_message_send parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
        return (send_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static send_message_send parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (send_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static send_message_send parseFrom(ByteString data) throws InvalidProtocolBufferException {
        return (send_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static send_message_send parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (send_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static send_message_send parseFrom(byte[] data) throws InvalidProtocolBufferException {
        return (send_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
    }

    public static send_message_send parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
        return (send_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
    }

    public static send_message_send parseFrom(InputStream input) throws IOException {
        return (send_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static send_message_send parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (send_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static send_message_send parseDelimitedFrom(InputStream input) throws IOException {
        return (send_message_send) parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static send_message_send parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (send_message_send) parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static send_message_send parseFrom(CodedInputStream input) throws IOException {
        return (send_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
    }

    public static send_message_send parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
        return (send_message_send) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(send_message_send prototype) {
        return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<send_message_send, Builder> implements send_message_sendOrBuilder {
        private Builder() {
            super(send_message_send.DEFAULT_INSTANCE);
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public String getMsgId() {
            return ((send_message_send) this.instance).getMsgId();
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public ByteString getMsgIdBytes() {
            return ((send_message_send) this.instance).getMsgIdBytes();
        }

        public Builder setMsgId(String value) {
            copyOnWrite();
            ((send_message_send) this.instance).setMsgId(value);
            return this;
        }

        public Builder clearMsgId() {
            copyOnWrite();
            ((send_message_send) this.instance).clearMsgId();
            return this;
        }

        public Builder setMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((send_message_send) this.instance).setMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public String getChatId() {
            return ((send_message_send) this.instance).getChatId();
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public ByteString getChatIdBytes() {
            return ((send_message_send) this.instance).getChatIdBytes();
        }

        public Builder setChatId(String value) {
            copyOnWrite();
            ((send_message_send) this.instance).setChatId(value);
            return this;
        }

        public Builder clearChatId() {
            copyOnWrite();
            ((send_message_send) this.instance).clearChatId();
            return this;
        }

        public Builder setChatIdBytes(ByteString value) {
            copyOnWrite();
            ((send_message_send) this.instance).setChatIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public long getChatType() {
            return ((send_message_send) this.instance).getChatType();
        }

        public Builder setChatType(long value) {
            copyOnWrite();
            ((send_message_send) this.instance).setChatType(value);
            return this;
        }

        public Builder clearChatType() {
            copyOnWrite();
            ((send_message_send) this.instance).clearChatType();
            return this;
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public boolean hasContent() {
            return ((send_message_send) this.instance).hasContent();
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public Content getContent() {
            return ((send_message_send) this.instance).getContent();
        }

        public Builder setContent(Content value) {
            copyOnWrite();
            ((send_message_send) this.instance).setContent(value);
            return this;
        }

        public Builder setContent(Content.Builder builderForValue) {
            copyOnWrite();
            ((send_message_send) this.instance).setContent(builderForValue.build());
            return this;
        }

        public Builder mergeContent(Content value) {
            copyOnWrite();
            ((send_message_send) this.instance).mergeContent(value);
            return this;
        }

        public Builder clearContent() {
            copyOnWrite();
            ((send_message_send) this.instance).clearContent();
            return this;
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public long getContentType() {
            return ((send_message_send) this.instance).getContentType();
        }

        public Builder setContentType(long value) {
            copyOnWrite();
            ((send_message_send) this.instance).setContentType(value);
            return this;
        }

        public Builder clearContentType() {
            copyOnWrite();
            ((send_message_send) this.instance).clearContentType();
            return this;
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public long getCommandId() {
            return ((send_message_send) this.instance).getCommandId();
        }

        public Builder setCommandId(long value) {
            copyOnWrite();
            ((send_message_send) this.instance).setCommandId(value);
            return this;
        }

        public Builder clearCommandId() {
            copyOnWrite();
            ((send_message_send) this.instance).clearCommandId();
            return this;
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public String getQuoteMsgId() {
            return ((send_message_send) this.instance).getQuoteMsgId();
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public ByteString getQuoteMsgIdBytes() {
            return ((send_message_send) this.instance).getQuoteMsgIdBytes();
        }

        public Builder setQuoteMsgId(String value) {
            copyOnWrite();
            ((send_message_send) this.instance).setQuoteMsgId(value);
            return this;
        }

        public Builder clearQuoteMsgId() {
            copyOnWrite();
            ((send_message_send) this.instance).clearQuoteMsgId();
            return this;
        }

        public Builder setQuoteMsgIdBytes(ByteString value) {
            copyOnWrite();
            ((send_message_send) this.instance).setQuoteMsgIdBytes(value);
            return this;
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public boolean hasMedia() {
            return ((send_message_send) this.instance).hasMedia();
        }

        @Override // com.yhchat.canarys.proto.send_message_sendOrBuilder
        public Media getMedia() {
            return ((send_message_send) this.instance).getMedia();
        }

        public Builder setMedia(Media value) {
            copyOnWrite();
            ((send_message_send) this.instance).setMedia(value);
            return this;
        }

        public Builder setMedia(Media.Builder builderForValue) {
            copyOnWrite();
            ((send_message_send) this.instance).setMedia(builderForValue.build());
            return this;
        }

        public Builder mergeMedia(Media value) {
            copyOnWrite();
            ((send_message_send) this.instance).mergeMedia(value);
            return this;
        }

        public Builder clearMedia() {
            copyOnWrite();
            ((send_message_send) this.instance).clearMedia();
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
        switch (method) {
            case NEW_MUTABLE_INSTANCE:
                return new send_message_send();
            case NEW_BUILDER:
                return new Builder();
            case BUILD_MESSAGE_INFO:
                Object[] objects = {"bitField0_", "msgId_", "chatId_", "chatType_", "content_", "contentType_", "commandId_", "quoteMsgId_", "media_"};
                return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0002\t\b\u0000\u0000\u0000\u0002\u0208\u0003\u0208\u0004\u0002\u0005\u1009\u0000\u0006\u0002\u0007\u0002\b\u0208\t\u1009\u0001", objects);
            case GET_DEFAULT_INSTANCE:
                return DEFAULT_INSTANCE;
            case GET_PARSER:
                Parser<send_message_send> parser = PARSER;
                if (parser == null) {
                    synchronized (send_message_send.class) {
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
        send_message_send defaultInstance = new send_message_send();
        DEFAULT_INSTANCE = defaultInstance;
        GeneratedMessageLite.registerDefaultInstance(send_message_send.class, defaultInstance);
    }

    public static send_message_send getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<send_message_send> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
