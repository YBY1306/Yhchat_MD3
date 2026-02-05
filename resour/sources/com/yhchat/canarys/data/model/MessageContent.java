package com.yhchat.canarys.data.model;

import androidx.core.view.ViewCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(m168d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\bA\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u00a7\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u00109\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010G\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u0010\u0010K\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u0010\u0010L\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u000b\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010O\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u0010\u0010P\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0002\u0010.J\u00ae\u0002\u0010Q\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0002\u0010RJ\u0013\u0010S\u001a\u00020T2\b\u0010U\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010V\u001a\u00020WH\u00d6\u0001J\t\u0010X\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001fR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b2\u0010.R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b3\u0010.R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b4\u0010.R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010\u001fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u001fR\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b7\u0010.R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010/\u001a\u0004\b8\u0010.\u00a8\u0006Y"}, m169d2 = {"Lcom/yhchat/canarys/data/model/MessageContent;", "", "text", "", "buttons", "imageUrl", "fileName", "fileUrl", "form", "quoteMsgText", "quoteImageUrl", "stickerUrl", "postId", "postTitle", "postContent", "postContentType", "expressionId", "fileSize", "", "videoUrl", "audioUrl", "audioTime", "stickerItemId", "stickerPackId", "callText", "callStatusText", "width", "height", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "getText", "()Ljava/lang/String;", "getButtons", "getImageUrl", "getFileName", "getFileUrl", "getForm", "getQuoteMsgText", "getQuoteImageUrl", "getStickerUrl", "getPostId", "getPostTitle", "getPostContent", "getPostContentType", "getExpressionId", "getFileSize", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getVideoUrl", "getAudioUrl", "getAudioTime", "getStickerItemId", "getStickerPackId", "getCallText", "getCallStatusText", "getWidth", "getHeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)Lcom/yhchat/canarys/data/model/MessageContent;", "equals", "", "other", "hashCode", "", "toString", "app_debug"}, m170k = 1, m171mv = {2, 2, 0}, m173xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class MessageContent {
    public static final int $stable = 0;

    @SerializedName("audio_time")
    private final Long audioTime;

    @SerializedName("audio_url")
    private final String audioUrl;

    @SerializedName("buttons")
    private final String buttons;

    @SerializedName("call_status_text")
    private final String callStatusText;

    @SerializedName("call_text")
    private final String callText;

    @SerializedName("expression_id")
    private final String expressionId;

    @SerializedName("file_name")
    private final String fileName;

    @SerializedName("file_size")
    private final Long fileSize;

    @SerializedName("file_url")
    private final String fileUrl;

    @SerializedName("form")
    private final String form;

    @SerializedName("height")
    private final Long height;

    @SerializedName("image_url")
    private final String imageUrl;

    @SerializedName("post_content")
    private final String postContent;

    @SerializedName("post_content_type")
    private final String postContentType;

    @SerializedName("post_id")
    private final String postId;

    @SerializedName("post_title")
    private final String postTitle;

    @SerializedName("quote_image_url")
    private final String quoteImageUrl;

    @SerializedName("quote_msg_text")
    private final String quoteMsgText;

    @SerializedName("sticker_item_id")
    private final Long stickerItemId;

    @SerializedName("sticker_pack_id")
    private final Long stickerPackId;

    @SerializedName("sticker_url")
    private final String stickerUrl;

    @SerializedName("text")
    private final String text;

    @SerializedName("video_url")
    private final String videoUrl;

    @SerializedName("width")
    private final Long width;

    public MessageContent() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null);
    }

    public static /* synthetic */ MessageContent copy$default(MessageContent messageContent, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l, String str15, String str16, Long l2, Long l3, Long l4, String str17, String str18, Long l5, Long l6, int i, Object obj) {
        Long l7;
        Long l8;
        String str19 = (i & 1) != 0 ? messageContent.text : str;
        String str20 = (i & 2) != 0 ? messageContent.buttons : str2;
        String str21 = (i & 4) != 0 ? messageContent.imageUrl : str3;
        String str22 = (i & 8) != 0 ? messageContent.fileName : str4;
        String str23 = (i & 16) != 0 ? messageContent.fileUrl : str5;
        String str24 = (i & 32) != 0 ? messageContent.form : str6;
        String str25 = (i & 64) != 0 ? messageContent.quoteMsgText : str7;
        String str26 = (i & 128) != 0 ? messageContent.quoteImageUrl : str8;
        String str27 = (i & 256) != 0 ? messageContent.stickerUrl : str9;
        String str28 = (i & 512) != 0 ? messageContent.postId : str10;
        String str29 = (i & 1024) != 0 ? messageContent.postTitle : str11;
        String str30 = (i & 2048) != 0 ? messageContent.postContent : str12;
        String str31 = (i & 4096) != 0 ? messageContent.postContentType : str13;
        String str32 = (i & 8192) != 0 ? messageContent.expressionId : str14;
        String str33 = str19;
        Long l9 = (i & 16384) != 0 ? messageContent.fileSize : l;
        String str34 = (i & 32768) != 0 ? messageContent.videoUrl : str15;
        String str35 = (i & 65536) != 0 ? messageContent.audioUrl : str16;
        Long l10 = (i & 131072) != 0 ? messageContent.audioTime : l2;
        Long l11 = (i & 262144) != 0 ? messageContent.stickerItemId : l3;
        Long l12 = (i & 524288) != 0 ? messageContent.stickerPackId : l4;
        String str36 = (i & 1048576) != 0 ? messageContent.callText : str17;
        String str37 = (i & 2097152) != 0 ? messageContent.callStatusText : str18;
        Long l13 = (i & 4194304) != 0 ? messageContent.width : l5;
        if ((i & 8388608) != 0) {
            l8 = l13;
            l7 = messageContent.height;
        } else {
            l7 = l6;
            l8 = l13;
        }
        return messageContent.copy(str33, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, l9, str34, str35, l10, l11, l12, str36, str37, l8, l7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPostId() {
        return this.postId;
    }

    /* renamed from: component11, reason: from getter */
    public final String getPostTitle() {
        return this.postTitle;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPostContent() {
        return this.postContent;
    }

    /* renamed from: component13, reason: from getter */
    public final String getPostContentType() {
        return this.postContentType;
    }

    /* renamed from: component14, reason: from getter */
    public final String getExpressionId() {
        return this.expressionId;
    }

    /* renamed from: component15, reason: from getter */
    public final Long getFileSize() {
        return this.fileSize;
    }

    /* renamed from: component16, reason: from getter */
    public final String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: component17, reason: from getter */
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    /* renamed from: component18, reason: from getter */
    public final Long getAudioTime() {
        return this.audioTime;
    }

    /* renamed from: component19, reason: from getter */
    public final Long getStickerItemId() {
        return this.stickerItemId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getButtons() {
        return this.buttons;
    }

    /* renamed from: component20, reason: from getter */
    public final Long getStickerPackId() {
        return this.stickerPackId;
    }

    /* renamed from: component21, reason: from getter */
    public final String getCallText() {
        return this.callText;
    }

    /* renamed from: component22, reason: from getter */
    public final String getCallStatusText() {
        return this.callStatusText;
    }

    /* renamed from: component23, reason: from getter */
    public final Long getWidth() {
        return this.width;
    }

    /* renamed from: component24, reason: from getter */
    public final Long getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getFileUrl() {
        return this.fileUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final String getForm() {
        return this.form;
    }

    /* renamed from: component7, reason: from getter */
    public final String getQuoteMsgText() {
        return this.quoteMsgText;
    }

    /* renamed from: component8, reason: from getter */
    public final String getQuoteImageUrl() {
        return this.quoteImageUrl;
    }

    /* renamed from: component9, reason: from getter */
    public final String getStickerUrl() {
        return this.stickerUrl;
    }

    public final MessageContent copy(String text, String buttons, String imageUrl, String fileName, String fileUrl, String form, String quoteMsgText, String quoteImageUrl, String stickerUrl, String postId, String postTitle, String postContent, String postContentType, String expressionId, Long fileSize, String videoUrl, String audioUrl, Long audioTime, Long stickerItemId, Long stickerPackId, String callText, String callStatusText, Long width, Long height) {
        return new MessageContent(text, buttons, imageUrl, fileName, fileUrl, form, quoteMsgText, quoteImageUrl, stickerUrl, postId, postTitle, postContent, postContentType, expressionId, fileSize, videoUrl, audioUrl, audioTime, stickerItemId, stickerPackId, callText, callStatusText, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageContent)) {
            return false;
        }
        MessageContent messageContent = (MessageContent) other;
        return Intrinsics.areEqual(this.text, messageContent.text) && Intrinsics.areEqual(this.buttons, messageContent.buttons) && Intrinsics.areEqual(this.imageUrl, messageContent.imageUrl) && Intrinsics.areEqual(this.fileName, messageContent.fileName) && Intrinsics.areEqual(this.fileUrl, messageContent.fileUrl) && Intrinsics.areEqual(this.form, messageContent.form) && Intrinsics.areEqual(this.quoteMsgText, messageContent.quoteMsgText) && Intrinsics.areEqual(this.quoteImageUrl, messageContent.quoteImageUrl) && Intrinsics.areEqual(this.stickerUrl, messageContent.stickerUrl) && Intrinsics.areEqual(this.postId, messageContent.postId) && Intrinsics.areEqual(this.postTitle, messageContent.postTitle) && Intrinsics.areEqual(this.postContent, messageContent.postContent) && Intrinsics.areEqual(this.postContentType, messageContent.postContentType) && Intrinsics.areEqual(this.expressionId, messageContent.expressionId) && Intrinsics.areEqual(this.fileSize, messageContent.fileSize) && Intrinsics.areEqual(this.videoUrl, messageContent.videoUrl) && Intrinsics.areEqual(this.audioUrl, messageContent.audioUrl) && Intrinsics.areEqual(this.audioTime, messageContent.audioTime) && Intrinsics.areEqual(this.stickerItemId, messageContent.stickerItemId) && Intrinsics.areEqual(this.stickerPackId, messageContent.stickerPackId) && Intrinsics.areEqual(this.callText, messageContent.callText) && Intrinsics.areEqual(this.callStatusText, messageContent.callStatusText) && Intrinsics.areEqual(this.width, messageContent.width) && Intrinsics.areEqual(this.height, messageContent.height);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((this.text == null ? 0 : this.text.hashCode()) * 31) + (this.buttons == null ? 0 : this.buttons.hashCode())) * 31) + (this.imageUrl == null ? 0 : this.imageUrl.hashCode())) * 31) + (this.fileName == null ? 0 : this.fileName.hashCode())) * 31) + (this.fileUrl == null ? 0 : this.fileUrl.hashCode())) * 31) + (this.form == null ? 0 : this.form.hashCode())) * 31) + (this.quoteMsgText == null ? 0 : this.quoteMsgText.hashCode())) * 31) + (this.quoteImageUrl == null ? 0 : this.quoteImageUrl.hashCode())) * 31) + (this.stickerUrl == null ? 0 : this.stickerUrl.hashCode())) * 31) + (this.postId == null ? 0 : this.postId.hashCode())) * 31) + (this.postTitle == null ? 0 : this.postTitle.hashCode())) * 31) + (this.postContent == null ? 0 : this.postContent.hashCode())) * 31) + (this.postContentType == null ? 0 : this.postContentType.hashCode())) * 31) + (this.expressionId == null ? 0 : this.expressionId.hashCode())) * 31) + (this.fileSize == null ? 0 : this.fileSize.hashCode())) * 31) + (this.videoUrl == null ? 0 : this.videoUrl.hashCode())) * 31) + (this.audioUrl == null ? 0 : this.audioUrl.hashCode())) * 31) + (this.audioTime == null ? 0 : this.audioTime.hashCode())) * 31) + (this.stickerItemId == null ? 0 : this.stickerItemId.hashCode())) * 31) + (this.stickerPackId == null ? 0 : this.stickerPackId.hashCode())) * 31) + (this.callText == null ? 0 : this.callText.hashCode())) * 31) + (this.callStatusText == null ? 0 : this.callStatusText.hashCode())) * 31) + (this.width == null ? 0 : this.width.hashCode())) * 31) + (this.height != null ? this.height.hashCode() : 0);
    }

    public String toString() {
        return "MessageContent(text=" + this.text + ", buttons=" + this.buttons + ", imageUrl=" + this.imageUrl + ", fileName=" + this.fileName + ", fileUrl=" + this.fileUrl + ", form=" + this.form + ", quoteMsgText=" + this.quoteMsgText + ", quoteImageUrl=" + this.quoteImageUrl + ", stickerUrl=" + this.stickerUrl + ", postId=" + this.postId + ", postTitle=" + this.postTitle + ", postContent=" + this.postContent + ", postContentType=" + this.postContentType + ", expressionId=" + this.expressionId + ", fileSize=" + this.fileSize + ", videoUrl=" + this.videoUrl + ", audioUrl=" + this.audioUrl + ", audioTime=" + this.audioTime + ", stickerItemId=" + this.stickerItemId + ", stickerPackId=" + this.stickerPackId + ", callText=" + this.callText + ", callStatusText=" + this.callStatusText + ", width=" + this.width + ", height=" + this.height + ")";
    }

    public MessageContent(String text, String buttons, String imageUrl, String fileName, String fileUrl, String form, String quoteMsgText, String quoteImageUrl, String stickerUrl, String postId, String postTitle, String postContent, String postContentType, String expressionId, Long fileSize, String videoUrl, String audioUrl, Long audioTime, Long stickerItemId, Long stickerPackId, String callText, String callStatusText, Long width, Long height) {
        this.text = text;
        this.buttons = buttons;
        this.imageUrl = imageUrl;
        this.fileName = fileName;
        this.fileUrl = fileUrl;
        this.form = form;
        this.quoteMsgText = quoteMsgText;
        this.quoteImageUrl = quoteImageUrl;
        this.stickerUrl = stickerUrl;
        this.postId = postId;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.postContentType = postContentType;
        this.expressionId = expressionId;
        this.fileSize = fileSize;
        this.videoUrl = videoUrl;
        this.audioUrl = audioUrl;
        this.audioTime = audioTime;
        this.stickerItemId = stickerItemId;
        this.stickerPackId = stickerPackId;
        this.callText = callText;
        this.callStatusText = callStatusText;
        this.width = width;
        this.height = height;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ MessageContent(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, Long l, String str15, String str16, Long l2, Long l3, Long l4, String str17, String str18, Long l5, Long l6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        String str19 = (i & 1) != 0 ? null : str;
        String str20 = (i & 2) != 0 ? null : str2;
        String str21 = (i & 4) != 0 ? null : str3;
        String str22 = (i & 8) != 0 ? null : str4;
        String str23 = (i & 16) != 0 ? null : str5;
        String str24 = (i & 32) != 0 ? null : str6;
        String str25 = (i & 64) != 0 ? null : str7;
        String str26 = (i & 128) != 0 ? null : str8;
        String str27 = (i & 256) != 0 ? null : str9;
        String str28 = (i & 512) != 0 ? null : str10;
        String str29 = (i & 1024) != 0 ? null : str11;
        String str30 = (i & 2048) != 0 ? null : str12;
        String str31 = (i & 4096) != 0 ? null : str13;
        String str32 = (i & 8192) != 0 ? null : str14;
        Long l7 = (i & 16384) != 0 ? null : l;
        this(str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, l7, (i & 32768) != 0 ? null : str15, (i & 65536) != 0 ? null : str16, (i & 131072) != 0 ? null : l2, (i & 262144) != 0 ? null : l3, (i & 524288) != 0 ? null : l4, (i & 1048576) != 0 ? null : str17, (i & 2097152) != 0 ? null : str18, (i & 4194304) != 0 ? null : l5, (i & 8388608) != 0 ? null : l6);
    }

    public final String getText() {
        return this.text;
    }

    public final String getButtons() {
        return this.buttons;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final String getForm() {
        return this.form;
    }

    public final String getQuoteMsgText() {
        return this.quoteMsgText;
    }

    public final String getQuoteImageUrl() {
        return this.quoteImageUrl;
    }

    public final String getStickerUrl() {
        return this.stickerUrl;
    }

    public final String getPostId() {
        return this.postId;
    }

    public final String getPostTitle() {
        return this.postTitle;
    }

    public final String getPostContent() {
        return this.postContent;
    }

    public final String getPostContentType() {
        return this.postContentType;
    }

    public final String getExpressionId() {
        return this.expressionId;
    }

    public final Long getFileSize() {
        return this.fileSize;
    }

    public final String getVideoUrl() {
        return this.videoUrl;
    }

    public final String getAudioUrl() {
        return this.audioUrl;
    }

    public final Long getAudioTime() {
        return this.audioTime;
    }

    public final Long getStickerItemId() {
        return this.stickerItemId;
    }

    public final Long getStickerPackId() {
        return this.stickerPackId;
    }

    public final String getCallText() {
        return this.callText;
    }

    public final String getCallStatusText() {
        return this.callStatusText;
    }

    public final Long getWidth() {
        return this.width;
    }

    public final Long getHeight() {
        return this.height;
    }
}
